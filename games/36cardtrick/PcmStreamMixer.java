/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PcmStreamMixer extends PcmStream {
    private IntrusiveDeque field_n;
    private IntrusiveDeque field_m;
    private int field_k;
    private int field_l;

    private final void skipChildFrames(int param0) {
        PcmStream var2 = (PcmStream) (this.field_n.beginForward((byte) 74));
        while (var2 != null) {
          var2.skipFrames(param0);
          var2 = (PcmStream) (this.field_n.nextForward((byte) -121));
        }
    }

    final synchronized void b(sf param0) {
        if (param0.field_h == null) {
          this.normalizeListenerDeadlines();
          param0.field_h = this;
          param0.b();
          this.insertListenerByDeadline(this.field_m.sentinel.next, param0);
          return;
        }
        throw new RuntimeException();
    }

    final PcmStream nextChildStream() {
        return (PcmStream) (this.field_n.nextForward((byte) -95));
    }

    final synchronized void a(sf param0) {
        if (param0.field_h == null) {
          return;
        }
        if (param0.field_h == this) {
          this.normalizeListenerDeadlines();
          this.removeListener(param0);
          return;
        }
        throw new RuntimeException();
    }

    final synchronized void b(PcmStream param0) {
        this.field_n.addFirst(-126, param0);
    }

    private final void mixChildStreams(int[] param0, int param1, int param2) {
        PcmStream var4 = (PcmStream) (this.field_n.beginForward((byte) 74));
        while (var4 != null) {
          var4.mixOrSkipFrames(param0, param1, param2);
          var4 = (PcmStream) (this.field_n.nextForward((byte) -95));
        }
    }

    private final void normalizeListenerDeadlines() {
        sf var1 = null;
        if (this.field_k > 0) {
          var1 = (sf) (this.field_m.beginForward((byte) 74));
          while (var1 != null) {
            var1.field_g = var1.field_g - this.field_k;
            var1 = (sf) (this.field_m.nextForward((byte) -122));
          }
          this.field_l = this.field_l - this.field_k;
          this.field_k = 0;
        }
    }

    private final void removeListener(sf param0) {
        param0.unlink(107);
        param0.a();
        param0.field_h = null;
        IntrusiveNode var2 = this.field_m.sentinel.next;
        if (var2 == this.field_m.sentinel) {
          this.field_l = -1;
        } else {
          this.field_l = ((sf) (var2)).field_g;
        }
    }

    final int getSchedulingCost() {
        return 0;
    }

    final synchronized void skipFrames(int param0) {
        int var2 = 0;
        sf var3 = null;
        int var5 = 0;
        Throwable decompiledCaughtException = null;
        Object var4 = null;
        do {
          if (this.field_l < 0) {
            this.skipChildFrames(param0);
            return;
          }
          if (this.field_k + param0 < this.field_l) {
            this.field_k = this.field_k + param0;
            this.skipChildFrames(param0);
            return;
          }
          var2 = this.field_l - this.field_k;
          this.skipChildFrames(var2);
          param0 = param0 - var2;
          this.field_k = this.field_k + var2;
          this.normalizeListenerDeadlines();
          var3 = (sf) (this.field_m.beginForward((byte) 74));
          var4 = var3;
          synchronized (var4) {
            var5 = var3.onScheduledEvent(this);
            if (var5 >= 0) {
              var3.field_g = var5;
              this.insertListenerByDeadline(var3.next, var3);
            } else {
              var3.field_g = 0;
              this.removeListener(var3);
            }
          }
        } while (param0 != 0);
        return;
    }

    private final void insertListenerByDeadline(IntrusiveNode param0, sf param1) {
        while (true) {
          if (param0 == this.field_m.sentinel) {
            DelegatingCanvas.insertBefore(param0, 0, param1);
            this.field_l = ((sf) (this.field_m.sentinel.next)).field_g;
            return;
          }
          if (((sf) (param0)).field_g <= param1.field_g) {
            param0 = param0.next;
            continue;
          }
          break;
        }
        DelegatingCanvas.insertBefore(param0, 0, param1);
        this.field_l = ((sf) (this.field_m.sentinel.next)).field_g;
        return;
    }

    final synchronized void mixInto(int[] param0, int param1, int param2) {
        int var4 = 0;
        sf var5 = null;
        int var7 = 0;
        Throwable decompiledCaughtException = null;
        Object var6 = null;
        do {
          if (this.field_l < 0) {
            this.mixChildStreams(param0, param1, param2);
            return;
          }
          if (this.field_k + param2 < this.field_l) {
            this.field_k = this.field_k + param2;
            this.mixChildStreams(param0, param1, param2);
            return;
          }
          var4 = this.field_l - this.field_k;
          this.mixChildStreams(param0, param1, var4);
          param1 = param1 + var4;
          param2 = param2 - var4;
          this.field_k = this.field_k + var4;
          this.normalizeListenerDeadlines();
          var5 = (sf) (this.field_m.beginForward((byte) 74));
          var6 = var5;
          synchronized (var6) {
            var7 = var5.onScheduledEvent(this);
            if (var7 >= 0) {
              var5.field_g = var7;
              this.insertListenerByDeadline(var5.next, var5);
            } else {
              var5.field_g = 0;
              this.removeListener(var5);
            }
          }
        } while (param2 != 0);
        return;
    }

    final synchronized void a(PcmStream param0) {
        param0.unlink(104);
    }

    public PcmStreamMixer() {
        this.field_n = new IntrusiveDeque();
        this.field_m = new IntrusiveDeque();
        this.field_k = 0;
        this.field_l = -1;
    }

    final PcmStream firstChildStream() {
        return (PcmStream) (this.field_n.beginForward((byte) 74));
    }
}
