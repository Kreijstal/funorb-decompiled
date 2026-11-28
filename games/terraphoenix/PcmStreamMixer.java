/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PcmStreamMixer extends PcmStream {
    private IntrusiveDeque field_m;
    private IntrusiveDeque field_o;
    private int field_n;
    private int field_l;

    final PcmStream nextChildStream() {
        return (PcmStream) (this.field_m.nextBackward((byte) -119));
    }

    final synchronized void skipFrames(int param0) {
        int var2 = 0;
        PcmMixerListener var3 = null;
        int var5 = 0;
        Throwable decompiledCaughtException = null;
        Object var4 = null;
        do {
          if (this.field_l < 0) {
            this.skipChildFrames(param0);
            return;
          }
          if (this.field_n + param0 < this.field_l) {
            this.field_n = this.field_n + param0;
            this.skipChildFrames(param0);
            return;
          }
          var2 = this.field_l - this.field_n;
          this.skipChildFrames(var2);
          param0 = param0 - var2;
          this.field_n = this.field_n + var2;
          this.normalizeListenerDeadlines();
          var3 = (PcmMixerListener) (this.field_o.beginBackward(9272));
          var4 = var3;
          synchronized (var4) {
            var5 = var3.onScheduledEvent(this);
            if (var5 >= 0) {
              var3.field_h = var5;
              this.insertListenerByDeadline(var3.previous, var3);
            } else {
              var3.field_h = 0;
              this.removeListener(var3);
            }
          }
        } while (param0 != 0);
        return;
    }

    private final void insertListenerByDeadline(IntrusiveNode param0, PcmMixerListener param1) {
        while (true) {
          if (param0 == this.field_o.sentinel) {
            ConfirmedEmailAvailabilityValidator.a(127, param0, param1);
            this.field_l = ((PcmMixerListener) (this.field_o.sentinel.previous)).field_h;
            return;
          }
          if (((PcmMixerListener) (param0)).field_h <= param1.field_h) {
            param0 = param0.previous;
            continue;
          }
          break;
        }
        ConfirmedEmailAvailabilityValidator.a(127, param0, param1);
        this.field_l = ((PcmMixerListener) (this.field_o.sentinel.previous)).field_h;
        return;
    }

    private final void normalizeListenerDeadlines() {
        PcmMixerListener var1 = null;
        if (this.field_n > 0) {
          var1 = (PcmMixerListener) (this.field_o.beginBackward(9272));
          while (var1 != null) {
            var1.field_h = var1.field_h - this.field_n;
            var1 = (PcmMixerListener) (this.field_o.nextBackward((byte) -119));
          }
          this.field_l = this.field_l - this.field_n;
          this.field_n = 0;
        }
    }

    private final void removeListener(PcmMixerListener param0) {
        param0.unlink((byte) 12);
        param0.onRemovedFromMixer();
        IntrusiveNode var2 = this.field_o.sentinel.previous;
        if (var2 == this.field_o.sentinel) {
          this.field_l = -1;
        } else {
          this.field_l = ((PcmMixerListener) (var2)).field_h;
        }
    }

    final synchronized void addChildStream(PcmStream param0) {
        this.field_m.addLast((IntrusiveNode) (param0), (byte) 0);
    }

    final int getSchedulingCost() {
        return 0;
    }

    private final void mixChildStreams(int[] param0, int param1, int param2) {
        PcmStream var4 = (PcmStream) (this.field_m.beginBackward(9272));
        while (var4 != null) {
          var4.mixOrSkipFrames(param0, param1, param2);
          var4 = (PcmStream) (this.field_m.nextBackward((byte) -119));
        }
    }

    final void playSample(PcmSample param0, int param1, int param2) {
        this.addChildStream(PcmSampleStream.createAtRatePercent(param0, param1, param2));
    }

    final synchronized void mixInto(int[] param0, int param1, int param2) {
        int var4 = 0;
        PcmMixerListener var5 = null;
        int var7 = 0;
        Throwable decompiledCaughtException = null;
        Object var6 = null;
        do {
          if (this.field_l < 0) {
            this.mixChildStreams(param0, param1, param2);
            return;
          }
          if (this.field_n + param2 < this.field_l) {
            this.field_n = this.field_n + param2;
            this.mixChildStreams(param0, param1, param2);
            return;
          }
          var4 = this.field_l - this.field_n;
          this.mixChildStreams(param0, param1, var4);
          param1 = param1 + var4;
          param2 = param2 - var4;
          this.field_n = this.field_n + var4;
          this.normalizeListenerDeadlines();
          var5 = (PcmMixerListener) (this.field_o.beginBackward(9272));
          var6 = var5;
          synchronized (var6) {
            var7 = var5.onScheduledEvent(this);
            if (var7 >= 0) {
              var5.field_h = var7;
              this.insertListenerByDeadline(var5.previous, var5);
            } else {
              var5.field_h = 0;
              this.removeListener(var5);
            }
          }
        } while (param2 != 0);
        return;
    }

    private final void skipChildFrames(int param0) {
        PcmStream var2 = (PcmStream) (this.field_m.beginBackward(9272));
        while (var2 != null) {
          var2.skipFrames(param0);
          var2 = (PcmStream) (this.field_m.nextBackward((byte) -119));
        }
    }

    final PcmStream firstChildStream() {
        return (PcmStream) (this.field_m.beginBackward(9272));
    }

    public PcmStreamMixer() {
        this.field_m = new IntrusiveDeque();
        this.field_o = new IntrusiveDeque();
        this.field_n = 0;
        this.field_l = -1;
    }
}
