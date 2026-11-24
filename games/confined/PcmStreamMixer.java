/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PcmStreamMixer extends PcmStream {
    private PrimaryNodeDeque field_s;
    private PrimaryNodeDeque field_q;
    private int field_r;
    private int field_t;

    final synchronized void a(bl param0) {
        if (param0.field_n == null) {
          this.normalizeListenerDeadlines();
          param0.field_n = this;
          param0.b();
          this.insertListenerByDeadline(this.field_q.sentinel.field_h, param0);
          return;
        }
        throw new RuntimeException();
    }

    final synchronized void a(PcmStream param0) {
        this.field_s.addFirst(param0, -1);
    }

    final synchronized void b(PcmStream param0) {
        param0.unlink(true);
    }

    final int getSchedulingCost() {
        return 0;
    }

    final synchronized void b(bl param0) {
        if (param0.field_n == null) {
          return;
        }
        if (param0.field_n == this) {
          this.normalizeListenerDeadlines();
          this.removeListener(param0);
          return;
        }
        throw new RuntimeException();
    }

    private final void mixChildStreams(int[] param0, int param1, int param2) {
        PcmStream var4 = (PcmStream) (this.field_s.beginForward(86));
        while (var4 != null) {
          var4.mixOrSkipFrames(param0, param1, param2);
          var4 = (PcmStream) (this.field_s.nextForward(2123));
        }
    }

    private final void removeListener(bl param0) {
        param0.unlink(true);
        param0.a();
        param0.field_n = null;
        IntrusiveNode var2 = this.field_q.sentinel.field_h;
        if (var2 == this.field_q.sentinel) {
          this.field_t = -1;
        } else {
          this.field_t = ((bl) (var2)).field_m;
        }
    }

    private final void normalizeListenerDeadlines() {
        bl var1 = null;
        if (this.field_r > 0) {
          var1 = (bl) (this.field_q.beginForward(-119));
          while (var1 != null) {
            var1.field_m = var1.field_m - this.field_r;
            var1 = (bl) (this.field_q.nextForward(2123));
          }
          this.field_t = this.field_t - this.field_r;
          this.field_r = 0;
        }
    }

    final synchronized void mixInto(int[] param0, int param1, int param2) {
        int var4 = 0;
        bl var5 = null;
        int var7 = 0;
        Throwable decompiledCaughtException = null;
        Object var6 = null;
        do {
          if (this.field_t < 0) {
            this.mixChildStreams(param0, param1, param2);
            return;
          }
          if (this.field_r + param2 < this.field_t) {
            this.field_r = this.field_r + param2;
            this.mixChildStreams(param0, param1, param2);
            return;
          }
          var4 = this.field_t - this.field_r;
          this.mixChildStreams(param0, param1, var4);
          param1 = param1 + var4;
          param2 = param2 - var4;
          this.field_r = this.field_r + var4;
          this.normalizeListenerDeadlines();
          var5 = (bl) (this.field_q.beginForward(-125));
          var6 = var5;
          synchronized (var6) {
            var7 = var5.onScheduledEvent(this);
            if (var7 >= 0) {
              var5.field_m = var7;
              this.insertListenerByDeadline(var5.field_h, var5);
            } else {
              var5.field_m = 0;
              this.removeListener(var5);
            }
          }
        } while (param2 != 0);
        return;
    }

    final void a(bi param0, int param1, int param2) {
        this.a(RawPcmStream.b(param0, param1, param2));
    }

    final PcmStream firstChildStream() {
        return (PcmStream) (this.field_s.beginForward(-123));
    }

    private final void insertListenerByDeadline(IntrusiveNode param0, bl param1) {
        while (true) {
          if (param0 == this.field_q.sentinel) {
            ri.a(param0, 0, param1);
            this.field_t = ((bl) (this.field_q.sentinel.field_h)).field_m;
            return;
          }
          if (((bl) (param0)).field_m <= param1.field_m) {
            param0 = param0.field_h;
            continue;
          }
          break;
        }
        ri.a(param0, 0, param1);
        this.field_t = ((bl) (this.field_q.sentinel.field_h)).field_m;
        return;
    }

    private final void skipChildFrames(int param0) {
        PcmStream var2 = (PcmStream) (this.field_s.beginForward(-119));
        while (var2 != null) {
          var2.skipFrames(param0);
          var2 = (PcmStream) (this.field_s.nextForward(2123));
        }
    }

    final PcmStream nextChildStream() {
        return (PcmStream) (this.field_s.nextForward(2123));
    }

    final synchronized void skipFrames(int param0) {
        int var2 = 0;
        bl var3 = null;
        int var5 = 0;
        Throwable decompiledCaughtException = null;
        Object var4 = null;
        do {
          if (this.field_t < 0) {
            this.skipChildFrames(param0);
            return;
          }
          if (this.field_r + param0 < this.field_t) {
            this.field_r = this.field_r + param0;
            this.skipChildFrames(param0);
            return;
          }
          var2 = this.field_t - this.field_r;
          this.skipChildFrames(var2);
          param0 = param0 - var2;
          this.field_r = this.field_r + var2;
          this.normalizeListenerDeadlines();
          var3 = (bl) (this.field_q.beginForward(22));
          var4 = var3;
          synchronized (var4) {
            var5 = var3.onScheduledEvent(this);
            if (var5 >= 0) {
              var3.field_m = var5;
              this.insertListenerByDeadline(var3.field_h, var3);
            } else {
              var3.field_m = 0;
              this.removeListener(var3);
            }
          }
        } while (param0 != 0);
        return;
    }

    public PcmStreamMixer() {
        this.field_s = new PrimaryNodeDeque();
        this.field_q = new PrimaryNodeDeque();
        this.field_r = 0;
        this.field_t = -1;
    }
}
