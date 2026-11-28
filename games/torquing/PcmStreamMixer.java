/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PcmStreamMixer extends PcmStream {
    private IntrusiveDeque field_n;
    private IntrusiveDeque field_q;
    private int field_o;
    private int field_p;

    private final void normalizeListenerDeadlines() {
        PcmMixerListener var1 = null;
        if (this.field_p > 0) {
          var1 = (PcmMixerListener) (this.field_q.beginBackward(0));
          while (var1 != null) {
            var1.field_k = var1.field_k - this.field_p;
            var1 = (PcmMixerListener) (this.field_q.nextBackward(-24059));
          }
          this.field_o = this.field_o - this.field_p;
          this.field_p = 0;
        }
    }

    private final void insertListenerByDeadline(IntrusiveNode param0, PcmMixerListener param1) {
        while (true) {
          if (param0 == this.field_q.sentinel) {
            SoundCache.insertNodeAfter(param1, param0, -1240266932);
            this.field_o = ((PcmMixerListener) (this.field_q.sentinel.previous)).field_k;
            return;
          }
          if (((PcmMixerListener) (param0)).field_k <= param1.field_k) {
            param0 = param0.previous;
            continue;
          }
          break;
        }
        SoundCache.insertNodeAfter(param1, param0, -1240266932);
        this.field_o = ((PcmMixerListener) (this.field_q.sentinel.previous)).field_k;
        return;
    }

    final synchronized void addListener(PcmMixerListener param0) {
        if (param0.field_j == null) {
          this.normalizeListenerDeadlines();
          param0.field_j = this;
          param0.onAddedToMixer();
          this.insertListenerByDeadline(this.field_q.sentinel.previous, param0);
          return;
        }
        throw new RuntimeException();
    }

    final int getSchedulingCost() {
        return 0;
    }

    final synchronized void removeChildStream(PcmStream param0) {
        param0.unlink(0);
    }

    final synchronized void removeOwnedListener(PcmMixerListener param0) {
        if (param0.field_j == null) {
          return;
        }
        if (param0.field_j == this) {
          this.normalizeListenerDeadlines();
          this.removeListener(param0);
          return;
        }
        throw new RuntimeException();
    }

    final synchronized void skipFrames(int param0) {
        int var2 = 0;
        PcmMixerListener var3 = null;
        int var5 = 0;
        Throwable decompiledCaughtException = null;
        Object var4 = null;
        do {
          if (this.field_o < 0) {
            this.skipChildFrames(param0);
            return;
          }
          if (this.field_p + param0 < this.field_o) {
            this.field_p = this.field_p + param0;
            this.skipChildFrames(param0);
            return;
          }
          var2 = this.field_o - this.field_p;
          this.skipChildFrames(var2);
          param0 = param0 - var2;
          this.field_p = this.field_p + var2;
          this.normalizeListenerDeadlines();
          var3 = (PcmMixerListener) (this.field_q.beginBackward(0));
          var4 = var3;
          synchronized (var4) {
            var5 = var3.onScheduledEvent(this);
            if (var5 >= 0) {
              var3.field_k = var5;
              this.insertListenerByDeadline(var3.previous, var3);
            } else {
              var3.field_k = 0;
              this.removeListener(var3);
            }
          }
        } while (param0 != 0);
        return;
    }

    final PcmStream firstChildStream() {
        return (PcmStream) (this.field_n.beginBackward(0));
    }

    final synchronized void addChildStream(PcmStream param0) {
        this.field_n.addLast((byte) 68, param0);
    }

    private final void addChildStreamWithDelay(PcmStream param0, int param1) {
        if (param1 > 0) {
          param0 = (PcmStream) ((Object) StandardContentDialog.a(param1, (byte) -112, param0));
        }
        this.addChildStream(param0);
    }

    final void playSampleWithDelay(PcmSample param0, int param1, int param2, int param3) {
        this.addChildStreamWithDelay(PcmSampleStream.createForPlaybackRate(param0, param1, param2), param3);
    }

    private final void removeListener(PcmMixerListener param0) {
        param0.unlink(0);
        param0.onRemovedFromMixer();
        param0.field_j = null;
        IntrusiveNode var2 = this.field_q.sentinel.previous;
        if (var2 == this.field_q.sentinel) {
          this.field_o = -1;
        } else {
          this.field_o = ((PcmMixerListener) (var2)).field_k;
        }
    }

    final PcmStream nextChildStream() {
        return (PcmStream) (this.field_n.nextBackward(-24059));
    }

    final void playSample(PcmSample param0, int param1, int param2) {
        this.addChildStream(PcmSampleStream.createForPlaybackRate(param0, param1, param2));
    }

    private final void mixChildStreams(int[] param0, int param1, int param2) {
        PcmStream var4 = (PcmStream) (this.field_n.beginBackward(0));
        while (var4 != null) {
          var4.mixOrSkipFrames(param0, param1, param2);
          var4 = (PcmStream) (this.field_n.nextBackward(-24059));
        }
    }

    final synchronized void mixInto(int[] param0, int param1, int param2) {
        int var4 = 0;
        PcmMixerListener var5 = null;
        int var7 = 0;
        Throwable decompiledCaughtException = null;
        Object var6 = null;
        do {
          if (this.field_o < 0) {
            this.mixChildStreams(param0, param1, param2);
            return;
          }
          if (this.field_p + param2 < this.field_o) {
            this.field_p = this.field_p + param2;
            this.mixChildStreams(param0, param1, param2);
            return;
          }
          var4 = this.field_o - this.field_p;
          this.mixChildStreams(param0, param1, var4);
          param1 = param1 + var4;
          param2 = param2 - var4;
          this.field_p = this.field_p + var4;
          this.normalizeListenerDeadlines();
          var5 = (PcmMixerListener) (this.field_q.beginBackward(0));
          var6 = var5;
          synchronized (var6) {
            var7 = var5.onScheduledEvent(this);
            if (var7 >= 0) {
              var5.field_k = var7;
              this.insertListenerByDeadline(var5.previous, var5);
            } else {
              var5.field_k = 0;
              this.removeListener(var5);
            }
          }
        } while (param2 != 0);
        return;
    }

    private final void skipChildFrames(int param0) {
        PcmStream var2 = (PcmStream) (this.field_n.beginBackward(0));
        while (var2 != null) {
          var2.skipFrames(param0);
          var2 = (PcmStream) (this.field_n.nextBackward(-24059));
        }
    }

    public PcmStreamMixer() {
        this.field_n = new IntrusiveDeque();
        this.field_q = new IntrusiveDeque();
        this.field_o = -1;
        this.field_p = 0;
    }
}
