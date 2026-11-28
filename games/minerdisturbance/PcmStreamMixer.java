/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PcmStreamMixer extends PcmStream {
    private IntrusiveDeque field_u;
    private IntrusiveDeque field_r;
    private int field_s;
    private int field_t;

    private final void removeListener(PcmMixerListener param0) {
        param0.unlink(34);
        param0.onRemovedFromMixer();
        IntrusiveNode var2 = this.field_r.sentinel.field_f;
        if (var2 == this.field_r.sentinel) {
          this.field_s = -1;
        } else {
          this.field_s = ((PcmMixerListener) (var2)).field_n;
        }
    }

    final synchronized void addChildStream(PcmStream param0) {
        this.field_u.addFirst(param0, 27862);
    }

    private final void mixChildStreams(int[] param0, int param1, int param2) {
        PcmStream var4 = (PcmStream) (this.field_u.beginForward(73));
        while (var4 != null) {
          var4.mixOrSkipFrames(param0, param1, param2);
          var4 = (PcmStream) (this.field_u.nextForward((byte) 56));
        }
    }

    final synchronized void mixInto(int[] param0, int param1, int param2) {
        int var4 = 0;
        PcmMixerListener var5 = null;
        int var7 = 0;
        Throwable decompiledCaughtException = null;
        Object var6 = null;
        do {
          if (this.field_s < 0) {
            this.mixChildStreams(param0, param1, param2);
            return;
          }
          if (this.field_t + param2 < this.field_s) {
            this.field_t = this.field_t + param2;
            this.mixChildStreams(param0, param1, param2);
            return;
          }
          var4 = this.field_s - this.field_t;
          this.mixChildStreams(param0, param1, var4);
          param1 = param1 + var4;
          param2 = param2 - var4;
          this.field_t = this.field_t + var4;
          this.normalizeListenerDeadlines();
          var5 = (PcmMixerListener) (this.field_r.beginForward(91));
          var6 = var5;
          synchronized (var6) {
            var7 = var5.onScheduledEvent(this);
            if (var7 >= 0) {
              var5.field_n = var7;
              this.insertListenerByDeadline(var5.field_f, var5);
            } else {
              var5.field_n = 0;
              this.removeListener(var5);
            }
          }
        } while (param2 != 0);
        return;
    }

    final synchronized void removeChildStream(PcmStream param0) {
        param0.unlink(34);
    }

    final PcmStream firstChildStream() {
        return (PcmStream) (this.field_u.beginForward(123));
    }

    final PcmStream nextChildStream() {
        return (PcmStream) (this.field_u.nextForward((byte) 56));
    }

    private final void normalizeListenerDeadlines() {
        PcmMixerListener var1 = null;
        if (this.field_t > 0) {
          var1 = (PcmMixerListener) (this.field_r.beginForward(96));
          while (var1 != null) {
            var1.field_n = var1.field_n - this.field_t;
            var1 = (PcmMixerListener) (this.field_r.nextForward((byte) 56));
          }
          this.field_s = this.field_s - this.field_t;
          this.field_t = 0;
        }
    }

    private final void insertListenerByDeadline(IntrusiveNode param0, PcmMixerListener param1) {
        while (true) {
          if (param0 == this.field_r.sentinel) {
            AlphaWidgetContainer.$cfr$intArgs$a$c5042ffd0615(param1, param0, -117);
            this.field_s = ((PcmMixerListener) (this.field_r.sentinel.field_f)).field_n;
            return;
          }
          if (((PcmMixerListener) (param0)).field_n <= param1.field_n) {
            param0 = param0.field_f;
            continue;
          }
          break;
        }
        AlphaWidgetContainer.$cfr$intArgs$a$c5042ffd0615(param1, param0, -117);
        this.field_s = ((PcmMixerListener) (this.field_r.sentinel.field_f)).field_n;
        return;
    }

    final synchronized void skipFrames(int param0) {
        int var2 = 0;
        PcmMixerListener var3 = null;
        int var5 = 0;
        Throwable decompiledCaughtException = null;
        Object var4 = null;
        do {
          if (this.field_s < 0) {
            this.skipChildFrames(param0);
            return;
          }
          if (this.field_t + param0 < this.field_s) {
            this.field_t = this.field_t + param0;
            this.skipChildFrames(param0);
            return;
          }
          var2 = this.field_s - this.field_t;
          this.skipChildFrames(var2);
          param0 = param0 - var2;
          this.field_t = this.field_t + var2;
          this.normalizeListenerDeadlines();
          var3 = (PcmMixerListener) (this.field_r.beginForward(125));
          var4 = var3;
          synchronized (var4) {
            var5 = var3.onScheduledEvent(this);
            if (var5 >= 0) {
              var3.field_n = var5;
              this.insertListenerByDeadline(var3.field_f, var3);
            } else {
              var3.field_n = 0;
              this.removeListener(var3);
            }
          }
        } while (param0 != 0);
        return;
    }

    final int getSchedulingCost() {
        return 0;
    }

    private final void skipChildFrames(int param0) {
        PcmStream var2 = (PcmStream) (this.field_u.beginForward(111));
        while (var2 != null) {
          var2.skipFrames(param0);
          var2 = (PcmStream) (this.field_u.nextForward((byte) 56));
        }
    }

    public PcmStreamMixer() {
        this.field_u = new IntrusiveDeque();
        this.field_r = new IntrusiveDeque();
        this.field_s = -1;
        this.field_t = 0;
    }
}
