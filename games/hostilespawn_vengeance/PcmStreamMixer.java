/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PcmStreamMixer extends PcmStream {
    private IntrusiveDeque field_l;
    private IntrusiveDeque field_o;
    private int field_n;
    private int field_m;

    private final void skipChildFrames(int param0) {
        PcmStream var2 = (PcmStream) (this.field_l.beginForward(-48));
        while (var2 != null) {
          var2.skipFrames(param0);
          var2 = (PcmStream) (this.field_l.nextForward(12684));
        }
    }

    private final void normalizeListenerDeadlines() {
        da var1 = null;
        if (this.field_n > 0) {
          var1 = (da) (this.field_o.beginForward(-27));
          while (var1 != null) {
            var1.field_h = var1.field_h - this.field_n;
            var1 = (da) (this.field_o.nextForward(12684));
          }
          this.field_m = this.field_m - this.field_n;
          this.field_n = 0;
        }
    }

    final synchronized void skipFrames(int param0) {
        int var2 = 0;
        da var3 = null;
        int var5 = 0;
        Throwable decompiledCaughtException = null;
        Object var4 = null;
        do {
          if (this.field_m < 0) {
            this.skipChildFrames(param0);
            return;
          }
          if (this.field_n + param0 < this.field_m) {
            this.field_n = this.field_n + param0;
            this.skipChildFrames(param0);
            return;
          }
          var2 = this.field_m - this.field_n;
          this.skipChildFrames(var2);
          param0 = param0 - var2;
          this.field_n = this.field_n + var2;
          this.normalizeListenerDeadlines();
          var3 = (da) (this.field_o.beginForward(-76));
          var4 = var3;
          synchronized (var4) {
            var5 = var3.onScheduledEvent(this);
            if (var5 >= 0) {
              var3.field_h = var5;
              this.insertListenerByDeadline(var3.field_g, var3);
            } else {
              var3.field_h = 0;
              this.removeListener(var3);
            }
          }
        } while (param0 != 0);
        return;
    }

    final synchronized void mixInto(int[] param0, int param1, int param2) {
        int var4 = 0;
        da var5 = null;
        int var7 = 0;
        Throwable decompiledCaughtException = null;
        Object var6 = null;
        do {
          if (this.field_m < 0) {
            this.mixChildStreams(param0, param1, param2);
            return;
          }
          if (this.field_n + param2 < this.field_m) {
            this.field_n = this.field_n + param2;
            this.mixChildStreams(param0, param1, param2);
            return;
          }
          var4 = this.field_m - this.field_n;
          this.mixChildStreams(param0, param1, var4);
          param1 = param1 + var4;
          param2 = param2 - var4;
          this.field_n = this.field_n + var4;
          this.normalizeListenerDeadlines();
          var5 = (da) (this.field_o.beginForward(-69));
          var6 = var5;
          synchronized (var6) {
            var7 = var5.onScheduledEvent(this);
            if (var7 >= 0) {
              var5.field_h = var7;
              this.insertListenerByDeadline(var5.field_g, var5);
            } else {
              var5.field_h = 0;
              this.removeListener(var5);
            }
          }
        } while (param2 != 0);
        return;
    }

    final PcmStream nextChildStream() {
        return (PcmStream) (this.field_l.nextForward(12684));
    }

    private final void mixChildStreams(int[] param0, int param1, int param2) {
        PcmStream var4 = (PcmStream) (this.field_l.beginForward(-15));
        while (var4 != null) {
          var4.mixOrSkipFrames(param0, param1, param2);
          var4 = (PcmStream) (this.field_l.nextForward(12684));
        }
    }

    final synchronized void a(PcmStream param0) {
        param0.unlink(-104);
    }

    final synchronized void b(PcmStream param0) {
        this.field_l.addFirst((byte) -64, param0);
    }

    final void a(PcmSample param0, int param1, int param2) {
        this.b(RawPcmStream.createForPlaybackRate(param0, param1, param2));
    }

    final PcmStream firstChildStream() {
        return (PcmStream) (this.field_l.beginForward(-26));
    }

    private final void removeListener(da param0) {
        param0.unlink(-62);
        param0.a();
        IntrusiveNode var2 = this.field_o.sentinel.field_g;
        if (var2 == this.field_o.sentinel) {
          this.field_m = -1;
        } else {
          this.field_m = ((da) (var2)).field_h;
        }
    }

    private final void insertListenerByDeadline(IntrusiveNode param0, da param1) {
        while (true) {
          if (param0 == this.field_o.sentinel) {
            uf.a(param1, param0, (byte) -78);
            this.field_m = ((da) (this.field_o.sentinel.field_g)).field_h;
            return;
          }
          if (((da) (param0)).field_h <= param1.field_h) {
            param0 = param0.field_g;
            continue;
          }
          break;
        }
        uf.a(param1, param0, (byte) -78);
        this.field_m = ((da) (this.field_o.sentinel.field_g)).field_h;
        return;
    }

    final int getSchedulingCost() {
        return 0;
    }

    public PcmStreamMixer() {
        this.field_l = new IntrusiveDeque();
        this.field_o = new IntrusiveDeque();
        this.field_n = 0;
        this.field_m = -1;
    }
}
