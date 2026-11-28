/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PcmStreamMixer extends PcmStream {
    private IntrusiveDeque field_o;
    private IntrusiveDeque field_r;
    private int field_q;
    private int field_p;

    final synchronized void mix(int[] param0, int param1, int param2) {
        int var4 = 0;
        p var5 = null;
        int var7 = 0;
        Throwable decompiledCaughtException = null;
        Object var6 = null;
        do {
          if (this.field_q < 0) {
            this.mixChildStreams(param0, param1, param2);
            return;
          }
          if (this.field_p + param2 < this.field_q) {
            this.field_p = this.field_p + param2;
            this.mixChildStreams(param0, param1, param2);
            return;
          }
          var4 = this.field_q - this.field_p;
          this.mixChildStreams(param0, param1, var4);
          param1 = param1 + var4;
          param2 = param2 - var4;
          this.field_p = this.field_p + var4;
          this.normalizeListenerDeadlines();
          var5 = (p) (this.field_r.beginForward(-102));
          var6 = var5;
          synchronized (var6) {
            var7 = var5.onScheduledEvent(this);
            if (var7 >= 0) {
              var5.field_l = var7;
              this.insertListenerByDeadline(var5.next, var5);
            } else {
              var5.field_l = 0;
              this.removeListener(var5);
            }
          }
        } while (param2 != 0);
        return;
    }

    private final void skipChildFrames(int param0) {
        PcmStream var2 = (PcmStream) (this.field_o.beginForward(-92));
        while (var2 != null) {
          var2.skip(param0);
          var2 = (PcmStream) (this.field_o.nextForward((byte) -57));
        }
    }

    final synchronized void b(p param0) {
        if (param0.field_k == null) {
          return;
        }
        if (param0.field_k == this) {
          this.normalizeListenerDeadlines();
          this.removeListener(param0);
          return;
        }
        throw new RuntimeException();
    }

    final synchronized void a(p param0) {
        if (param0.field_k == null) {
          this.normalizeListenerDeadlines();
          param0.field_k = this;
          param0.b();
          this.insertListenerByDeadline(this.field_r.sentinel.next, param0);
          return;
        }
        throw new RuntimeException();
    }

    private final void normalizeListenerDeadlines() {
        p var1 = null;
        if (this.field_p > 0) {
          var1 = (p) (this.field_r.beginForward(-101));
          while (var1 != null) {
            var1.field_l = var1.field_l - this.field_p;
            var1 = (p) (this.field_r.nextForward((byte) 101));
          }
          this.field_q = this.field_q - this.field_p;
          this.field_p = 0;
        }
    }

    final synchronized void skip(int param0) {
        int var2 = 0;
        p var3 = null;
        int var5 = 0;
        Throwable decompiledCaughtException = null;
        Object var4 = null;
        do {
          if (this.field_q < 0) {
            this.skipChildFrames(param0);
            return;
          }
          if (this.field_p + param0 < this.field_q) {
            this.field_p = this.field_p + param0;
            this.skipChildFrames(param0);
            return;
          }
          var2 = this.field_q - this.field_p;
          this.skipChildFrames(var2);
          param0 = param0 - var2;
          this.field_p = this.field_p + var2;
          this.normalizeListenerDeadlines();
          var3 = (p) (this.field_r.beginForward(-115));
          var4 = var3;
          synchronized (var4) {
            var5 = var3.onScheduledEvent(this);
            if (var5 >= 0) {
              var3.field_l = var5;
              this.insertListenerByDeadline(var3.next, var3);
            } else {
              var3.field_l = 0;
              this.removeListener(var3);
            }
          }
        } while (param0 != 0);
        return;
    }

    final PcmStream nextChildStream() {
        return (PcmStream) (this.field_o.nextForward((byte) 124));
    }

    final synchronized void b(PcmStream param0) {
        param0.unlink(20);
    }

    final int getSchedulingCost() {
        return 0;
    }

    final synchronized void a(PcmStream param0) {
        this.field_o.addFirst(-1, param0);
    }

    private final void removeListener(p param0) {
        param0.unlink(20);
        param0.a();
        param0.field_k = null;
        IntrusiveNode var2 = this.field_r.sentinel.next;
        if (var2 == this.field_r.sentinel) {
          this.field_q = -1;
        } else {
          this.field_q = ((p) (var2)).field_l;
        }
    }

    private final void mixChildStreams(int[] param0, int param1, int param2) {
        PcmStream var4 = (PcmStream) (this.field_o.beginForward(-81));
        while (var4 != null) {
          var4.mixOrSkipFrames(param0, param1, param2);
          var4 = (PcmStream) (this.field_o.nextForward((byte) 77));
        }
    }

    final PcmStream firstChildStream() {
        return (PcmStream) (this.field_o.beginForward(-125));
    }

    private final void insertListenerByDeadline(IntrusiveNode param0, p param1) {
        while (true) {
          if (param0 == this.field_r.sentinel) {
            AgeValidator.a(103, param1, param0);
            this.field_q = ((p) (this.field_r.sentinel.next)).field_l;
            return;
          }
          if (((p) (param0)).field_l <= param1.field_l) {
            param0 = param0.next;
            continue;
          }
          break;
        }
        AgeValidator.a(103, param1, param0);
        this.field_q = ((p) (this.field_r.sentinel.next)).field_l;
        return;
    }

    final void a(PcmSample param0, int param1, int param2) {
        this.a(PcmSampleStream.a(param0, param1, param2));
    }

    public PcmStreamMixer() {
        this.field_o = new IntrusiveDeque();
        this.field_r = new IntrusiveDeque();
        this.field_q = -1;
        this.field_p = 0;
    }
}
