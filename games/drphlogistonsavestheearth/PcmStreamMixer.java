/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PcmStreamMixer extends PcmStream {
    private IntrusiveDeque field_o;
    private IntrusiveDeque field_m;
    private int field_n;
    private int field_l;

    final synchronized void mixInto(int[] param0, int param1, int param2) {
        int var4 = 0;
        ak var5 = null;
        int var7 = 0;
        Throwable decompiledCaughtException = null;
        Object var6 = null;
        do {
          if (this.field_n < 0) {
            this.mixChildStreams(param0, param1, param2);
            return;
          }
          if (this.field_l + param2 < this.field_n) {
            this.field_l = this.field_l + param2;
            this.mixChildStreams(param0, param1, param2);
            return;
          }
          var4 = this.field_n - this.field_l;
          this.mixChildStreams(param0, param1, var4);
          param1 = param1 + var4;
          param2 = param2 - var4;
          this.field_l = this.field_l + var4;
          this.normalizeListenerDeadlines();
          var5 = (ak) (this.field_m.beginForward(-11151));
          var6 = var5;
          synchronized (var6) {
            var7 = var5.onScheduledEvent(this);
            if (var7 >= 0) {
              var5.field_h = var7;
              this.insertListenerByDeadline(var5.next, var5);
            } else {
              var5.field_h = 0;
              this.removeListener(var5);
            }
          }
        } while (param2 != 0);
        return;
    }

    final PcmStream nextChildStream() {
        return (PcmStream) (this.field_o.nextForward(0));
    }

    final int getSchedulingCost() {
        return 0;
    }

    final synchronized void a(PcmStream param0) {
        this.field_o.addFirst(79, param0);
    }

    private final void normalizeListenerDeadlines() {
        ak var1 = null;
        if (this.field_l > 0) {
          var1 = (ak) (this.field_m.beginForward(-11151));
          while (var1 != null) {
            var1.field_h = var1.field_h - this.field_l;
            var1 = (ak) (this.field_m.nextForward(0));
          }
          this.field_n = this.field_n - this.field_l;
          this.field_l = 0;
        }
    }

    final PcmStream firstChildStream() {
        return (PcmStream) (this.field_o.beginForward(-11151));
    }

    private final void skipChildFrames(int param0) {
        PcmStream var2 = (PcmStream) (this.field_o.beginForward(-11151));
        while (var2 != null) {
          var2.skipFrames(param0);
          var2 = (PcmStream) (this.field_o.nextForward(0));
        }
    }

    private final void removeListener(ak param0) {
        param0.unlink(-16175);
        param0.a();
        IntrusiveNode var2 = this.field_m.sentinel.next;
        if (var2 == this.field_m.sentinel) {
          this.field_n = -1;
        } else {
          this.field_n = ((ak) (var2)).field_h;
        }
    }

    private final void mixChildStreams(int[] param0, int param1, int param2) {
        PcmStream var4 = (PcmStream) (this.field_o.beginForward(-11151));
        while (var4 != null) {
          var4.mixOrSkipFrames(param0, param1, param2);
          var4 = (PcmStream) (this.field_o.nextForward(0));
        }
    }

    final synchronized void b(PcmStream param0) {
        param0.unlink(-16175);
    }

    private final void insertListenerByDeadline(IntrusiveNode param0, ak param1) {
        while (true) {
          if (param0 == this.field_m.sentinel) {
            tf.a(param1, 16709, param0);
            this.field_n = ((ak) (this.field_m.sentinel.next)).field_h;
            return;
          }
          if (((ak) (param0)).field_h <= param1.field_h) {
            param0 = param0.next;
            continue;
          }
          break;
        }
        tf.a(param1, 16709, param0);
        this.field_n = ((ak) (this.field_m.sentinel.next)).field_h;
        return;
    }

    final synchronized void skipFrames(int param0) {
        int var2 = 0;
        ak var3 = null;
        int var5 = 0;
        Throwable decompiledCaughtException = null;
        Object var4 = null;
        do {
          if (this.field_n < 0) {
            this.skipChildFrames(param0);
            return;
          }
          if (this.field_l + param0 < this.field_n) {
            this.field_l = this.field_l + param0;
            this.skipChildFrames(param0);
            return;
          }
          var2 = this.field_n - this.field_l;
          this.skipChildFrames(var2);
          param0 = param0 - var2;
          this.field_l = this.field_l + var2;
          this.normalizeListenerDeadlines();
          var3 = (ak) (this.field_m.beginForward(-11151));
          var4 = var3;
          synchronized (var4) {
            var5 = var3.onScheduledEvent(this);
            if (var5 >= 0) {
              var3.field_h = var5;
              this.insertListenerByDeadline(var3.next, var3);
            } else {
              var3.field_h = 0;
              this.removeListener(var3);
            }
          }
        } while (param0 != 0);
        return;
    }

    public PcmStreamMixer() {
        this.field_o = new IntrusiveDeque();
        this.field_m = new IntrusiveDeque();
        this.field_n = -1;
        this.field_l = 0;
    }
}
