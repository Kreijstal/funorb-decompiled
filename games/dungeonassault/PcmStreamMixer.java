/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PcmStreamMixer extends PcmStream {
    private IntrusiveDeque field_o;
    private IntrusiveDeque field_n;
    private int field_m;
    private int field_p;

    private final void mixChildStreams(int[] param0, int param1, int param2) {
        PcmStream var4 = (PcmStream) (this.field_o.beginBackward(-24172));
        while (var4 != null) {
          var4.mixOrSkipFrames(param0, param1, param2);
          var4 = (PcmStream) (this.field_o.nextBackward(4));
        }
    }

    private final void normalizeListenerDeadlines() {
        PcmMixerListener var1 = null;
        if (this.field_m > 0) {
          var1 = (PcmMixerListener) (this.field_n.beginBackward(-24172));
          while (var1 != null) {
            var1.field_i = var1.field_i - this.field_m;
            var1 = (PcmMixerListener) (this.field_n.nextBackward(4));
          }
          this.field_p = this.field_p - this.field_m;
          this.field_m = 0;
        }
    }

    private final void insertListenerByDeadline(IntrusiveNode param0, PcmMixerListener param1) {
        while (true) {
          if (param0 == this.field_n.sentinel) {
            so.$cfr$intArgs$a$d4f67f19bfc6(89, param0, param1);
            this.field_p = ((PcmMixerListener) (this.field_n.sentinel.previous)).field_i;
            return;
          }
          if (((PcmMixerListener) (param0)).field_i <= param1.field_i) {
            param0 = param0.previous;
            continue;
          }
          break;
        }
        so.$cfr$intArgs$a$d4f67f19bfc6(89, param0, param1);
        this.field_p = ((PcmMixerListener) (this.field_n.sentinel.previous)).field_i;
        return;
    }

    final int getSchedulingCost() {
        return 0;
    }

    final PcmStream nextChildStream() {
        return (PcmStream) (this.field_o.nextBackward(4));
    }

    final synchronized void skipFrames(int param0) {
        int var2 = 0;
        PcmMixerListener var3 = null;
        int var5 = 0;
        Throwable decompiledCaughtException = null;
        Object var4 = null;
        do {
          if (this.field_p < 0) {
            this.skipChildFrames(param0);
            return;
          }
          if (this.field_m + param0 < this.field_p) {
            this.field_m = this.field_m + param0;
            this.skipChildFrames(param0);
            return;
          }
          var2 = this.field_p - this.field_m;
          this.skipChildFrames(var2);
          param0 = param0 - var2;
          this.field_m = this.field_m + var2;
          this.normalizeListenerDeadlines();
          var3 = (PcmMixerListener) (this.field_n.beginBackward(-24172));
          var4 = var3;
          synchronized (var4) {
            var5 = var3.onScheduledEvent(this);
            if (var5 >= 0) {
              var3.field_i = var5;
              this.insertListenerByDeadline(var3.previous, var3);
            } else {
              var3.field_i = 0;
              this.removeListener(var3);
            }
          }
        } while (param0 != 0);
        return;
    }

    final synchronized void removeChildStream(PcmStream param0) {
        param0.unlink(false);
    }

    final synchronized void addChildStream(PcmStream param0) {
        this.field_o.addLast(param0, false);
    }

    private final void removeListener(PcmMixerListener param0) {
        param0.unlink(false);
        param0.onRemovedFromMixer();
        IntrusiveNode var2 = this.field_n.sentinel.previous;
        if (var2 == this.field_n.sentinel) {
          this.field_p = -1;
        } else {
          this.field_p = ((PcmMixerListener) (var2)).field_i;
        }
    }

    final synchronized void mixInto(int[] param0, int param1, int param2) {
        int var4 = 0;
        PcmMixerListener var5 = null;
        int var7 = 0;
        Throwable decompiledCaughtException = null;
        Object var6 = null;
        do {
          if (this.field_p < 0) {
            this.mixChildStreams(param0, param1, param2);
            return;
          }
          if (this.field_m + param2 < this.field_p) {
            this.field_m = this.field_m + param2;
            this.mixChildStreams(param0, param1, param2);
            return;
          }
          var4 = this.field_p - this.field_m;
          this.mixChildStreams(param0, param1, var4);
          param1 = param1 + var4;
          param2 = param2 - var4;
          this.field_m = this.field_m + var4;
          this.normalizeListenerDeadlines();
          var5 = (PcmMixerListener) (this.field_n.beginBackward(-24172));
          var6 = var5;
          synchronized (var6) {
            var7 = var5.onScheduledEvent(this);
            if (var7 >= 0) {
              var5.field_i = var7;
              this.insertListenerByDeadline(var5.previous, var5);
            } else {
              var5.field_i = 0;
              this.removeListener(var5);
            }
          }
        } while (param2 != 0);
        return;
    }

    private final void skipChildFrames(int param0) {
        PcmStream var2 = (PcmStream) (this.field_o.beginBackward(-24172));
        while (var2 != null) {
          var2.skipFrames(param0);
          var2 = (PcmStream) (this.field_o.nextBackward(4));
        }
    }

    final PcmStream firstChildStream() {
        return (PcmStream) (this.field_o.beginBackward(-24172));
    }

    public PcmStreamMixer() {
        this.field_o = new IntrusiveDeque();
        this.field_n = new IntrusiveDeque();
        this.field_m = 0;
        this.field_p = -1;
    }
}
