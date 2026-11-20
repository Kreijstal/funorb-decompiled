/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PcmStreamMixer extends PcmStream {
    private IntrusiveDeque subStreams;
    private IntrusiveDeque listeners;
    private int nextListenerSample;
    private int elapsedSamples;

    private final void removeListener(PcmMixerListener param0) {
        param0.unlink(0);
        param0.onRemove();
        IntrusiveNode var2 = this.listeners.sentinel.next;
        if (var2 == this.listeners.sentinel) {
          this.nextListenerSample = -1;
        } else {
          this.nextListenerSample = ((PcmMixerListener) (var2)).samplesUntilCallback;
        }
    }

    private final void skipSubStreams(int param0) {
        PcmStream var2 = (PcmStream) (this.subStreams.first((byte) 114));
        while (var2 != null) {
          var2.skip(param0);
          var2 = (PcmStream) (this.subStreams.next((byte) 90));
        }
    }

    final PcmStream firstSubStream() {
        return (PcmStream) (this.subStreams.first((byte) 118));
    }

    final synchronized void removeSubStream(PcmStream param0) {
        param0.unlink(0);
    }

    final synchronized void skip(int param0) {
        int var2 = 0;
        PcmMixerListener var3 = null;
        int var5 = 0;
        Throwable decompiledCaughtException = null;
        Object var4 = null;
        do {
          if (this.nextListenerSample < 0) {
            this.skipSubStreams(param0);
            return;
          }
          if (this.elapsedSamples + param0 < this.nextListenerSample) {
            this.elapsedSamples = this.elapsedSamples + param0;
            this.skipSubStreams(param0);
            return;
          }
          var2 = this.nextListenerSample - this.elapsedSamples;
          this.skipSubStreams(var2);
          param0 = param0 - var2;
          this.elapsedSamples = this.elapsedSamples + var2;
          this.normalizeListenerTimes();
          var3 = (PcmMixerListener) (this.listeners.first((byte) 119));
          var4 = var3;
          synchronized (var4) {
            var5 = var3.onTimer(this);
            if (var5 >= 0) {
              var3.samplesUntilCallback = var5;
              this.insertListener(var3.next, var3);
            } else {
              var3.samplesUntilCallback = 0;
              this.removeListener(var3);
            }
          }
        } while (param0 != 0);
        return;
    }

    final synchronized void mix(int[] param0, int param1, int param2) {
        int var4 = 0;
        PcmMixerListener var5 = null;
        int var7 = 0;
        Throwable decompiledCaughtException = null;
        Object var6 = null;
        do {
          if (this.nextListenerSample < 0) {
            this.mixSubStreams(param0, param1, param2);
            return;
          }
          if (this.elapsedSamples + param2 < this.nextListenerSample) {
            this.elapsedSamples = this.elapsedSamples + param2;
            this.mixSubStreams(param0, param1, param2);
            return;
          }
          var4 = this.nextListenerSample - this.elapsedSamples;
          this.mixSubStreams(param0, param1, var4);
          param1 = param1 + var4;
          param2 = param2 - var4;
          this.elapsedSamples = this.elapsedSamples + var4;
          this.normalizeListenerTimes();
          var5 = (PcmMixerListener) (this.listeners.first((byte) 91));
          var6 = var5;
          synchronized (var6) {
            var7 = var5.onTimer(this);
            if (var7 >= 0) {
              var5.samplesUntilCallback = var7;
              this.insertListener(var5.next, var5);
            } else {
              var5.samplesUntilCallback = 0;
              this.removeListener(var5);
            }
          }
        } while (param2 != 0);
        return;
    }

    private final void insertListener(IntrusiveNode param0, PcmMixerListener param1) {
        while (true) {
          if (param0 == this.listeners.sentinel) {
            IntrusiveDeque.insertBefore(param0, 0, param1);
            this.nextListenerSample = ((PcmMixerListener) (this.listeners.sentinel.next)).samplesUntilCallback;
            return;
          }
          if (((PcmMixerListener) (param0)).samplesUntilCallback <= param1.samplesUntilCallback) {
            param0 = param0.next;
            continue;
          }
          break;
        }
        IntrusiveDeque.insertBefore(param0, 0, param1);
        this.nextListenerSample = ((PcmMixerListener) (this.listeners.sentinel.next)).samplesUntilCallback;
        return;
    }

    private final void normalizeListenerTimes() {
        PcmMixerListener var1 = null;
        if (this.elapsedSamples > 0) {
          var1 = (PcmMixerListener) (this.listeners.first((byte) 86));
          while (var1 != null) {
            var1.samplesUntilCallback = var1.samplesUntilCallback - this.elapsedSamples;
            var1 = (PcmMixerListener) (this.listeners.next((byte) -52));
          }
          this.nextListenerSample = this.nextListenerSample - this.elapsedSamples;
          this.elapsedSamples = 0;
        }
    }

    final PcmStream nextSubStream() {
        return (PcmStream) (this.subStreams.next((byte) -114));
    }

    final synchronized void addSubStream(PcmStream param0) {
        this.subStreams.addFirst(param0, false);
    }

    private final void mixSubStreams(int[] param0, int param1, int param2) {
        PcmStream var4 = (PcmStream) (this.subStreams.first((byte) 115));
        while (var4 != null) {
          var4.process(param0, param1, param2);
          var4 = (PcmStream) (this.subStreams.next((byte) 120));
        }
    }

    final int getActivityWeight() {
        return 0;
    }

    public PcmStreamMixer() {
        this.subStreams = new IntrusiveDeque();
        this.listeners = new IntrusiveDeque();
        this.elapsedSamples = 0;
        this.nextListenerSample = -1;
    }
}
