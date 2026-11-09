/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PcmStreamMixer extends PcmStream {
    private IntrusiveDeque substreams;
    private IntrusiveDeque listeners;
    private int consumedSamples;
    private int nextListenerDelay;

    private final void normalizeListenerDelays() {
        PcmMixerListener var1 = null;
        if (this.consumedSamples > 0) {
          var1 = (PcmMixerListener) (this.listeners.first(-108));
          while (var1 != null) {
            var1.delaySamples = var1.delaySamples - this.consumedSamples;
            var1 = (PcmMixerListener) (this.listeners.next((byte) 18));
          }
          this.nextListenerDelay = this.nextListenerDelay - this.consumedSamples;
          this.consumedSamples = 0;
        }
    }

    private final void insertListenerByDelay(IntrusiveNode param0, PcmMixerListener param1) {
        while (true) {
          if (param0 == this.listeners.sentinel) {
            GraphicsToolkit.insertNodeBefore(-2, param0, param1);
            this.nextListenerDelay = ((PcmMixerListener) (this.listeners.sentinel.next)).delaySamples;
            return;
          }
          if (((PcmMixerListener) (param0)).delaySamples <= param1.delaySamples) {
            param0 = param0.next;
            continue;
          }
          break;
        }
        GraphicsToolkit.insertNodeBefore(-2, param0, param1);
        this.nextListenerDelay = ((PcmMixerListener) (this.listeners.sentinel.next)).delaySamples;
        return;
    }

    final synchronized void addSubstream(PcmStream param0) {
        this.substreams.addFirst(param0, -10295);
    }

    final synchronized void mixInto(int[] param0, int param1, int param2) {
        int var4 = 0;
        PcmMixerListener var5 = null;
        int var7 = 0;
        Throwable decompiledCaughtException = null;
        Object var6 = null;
        do {
          if (this.nextListenerDelay < 0) {
            this.mixSubstreams(param0, param1, param2);
            return;
          }
          if (this.consumedSamples + param2 < this.nextListenerDelay) {
            this.consumedSamples = this.consumedSamples + param2;
            this.mixSubstreams(param0, param1, param2);
            return;
          }
          var4 = this.nextListenerDelay - this.consumedSamples;
          this.mixSubstreams(param0, param1, var4);
          param1 = param1 + var4;
          param2 = param2 - var4;
          this.consumedSamples = this.consumedSamples + var4;
          this.normalizeListenerDelays();
          var5 = (PcmMixerListener) (this.listeners.first(69));
          var6 = var5;
          synchronized (var6) {
            var7 = var5.onScheduledMix(this);
            if (var7 >= 0) {
              var5.delaySamples = var7;
              this.insertListenerByDelay(var5.next, var5);
            } else {
              var5.delaySamples = 0;
              this.removeListener(var5);
            }
          }
        } while (param2 != 0);
        return;
    }

    final synchronized void skip(int param0) {
        int var2 = 0;
        PcmMixerListener var3 = null;
        int var5 = 0;
        Throwable decompiledCaughtException = null;
        Object var4 = null;
        do {
          if (this.nextListenerDelay < 0) {
            this.skipSubstreams(param0);
            return;
          }
          if (this.consumedSamples + param0 < this.nextListenerDelay) {
            this.consumedSamples = this.consumedSamples + param0;
            this.skipSubstreams(param0);
            return;
          }
          var2 = this.nextListenerDelay - this.consumedSamples;
          this.skipSubstreams(var2);
          param0 = param0 - var2;
          this.consumedSamples = this.consumedSamples + var2;
          this.normalizeListenerDelays();
          var3 = (PcmMixerListener) (this.listeners.first(-102));
          var4 = var3;
          synchronized (var4) {
            var5 = var3.onScheduledMix(this);
            if (var5 >= 0) {
              var3.delaySamples = var5;
              this.insertListenerByDelay(var3.next, var3);
            } else {
              var3.delaySamples = 0;
              this.removeListener(var3);
            }
          }
        } while (param0 != 0);
        return;
    }

    private final void skipSubstreams(int param0) {
        PcmStream var2 = (PcmStream) (this.substreams.first(105));
        while (var2 != null) {
          var2.skip(param0);
          var2 = (PcmStream) (this.substreams.next((byte) 18));
        }
    }

    final int activityWeight() {
        return 0;
    }

    private final void removeListener(PcmMixerListener param0) {
        param0.unlink(false);
        param0.release();
        IntrusiveNode var2 = this.listeners.sentinel.next;
        if (var2 == this.listeners.sentinel) {
          this.nextListenerDelay = -1;
        } else {
          this.nextListenerDelay = ((PcmMixerListener) (var2)).delaySamples;
        }
    }

    final synchronized void removeSubstream(PcmStream param0) {
        param0.unlink(false);
    }

    final PcmStream nextSubstream() {
        return (PcmStream) (this.substreams.next((byte) 18));
    }

    final PcmStream firstSubstream() {
        return (PcmStream) (this.substreams.first(104));
    }

    private final void mixSubstreams(int[] param0, int param1, int param2) {
        PcmStream var4 = (PcmStream) (this.substreams.first(-91));
        while (var4 != null) {
          var4.mixOrSkip(param0, param1, param2);
          var4 = (PcmStream) (this.substreams.next((byte) 18));
        }
    }

    public PcmStreamMixer() {
        this.substreams = new IntrusiveDeque();
        this.listeners = new IntrusiveDeque();
        this.nextListenerDelay = -1;
        this.consumedSamples = 0;
    }
}
