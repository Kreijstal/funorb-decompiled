/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PcmStreamMixer extends PcmStream {
    private IntrusiveDeque subStreams;
    private IntrusiveDeque listeners;
    private int processedSamples;
    private int nextListenerSample;

    final int getActivityWeight() {
        return 0;
    }

    private final void normalizeListenerDelays() {
        PcmMixerListener var1 = null;
        if (this.processedSamples > 0) {
          var1 = (PcmMixerListener) (this.listeners.first(0));
          while (var1 != null) {
            var1.remainingSamples = var1.remainingSamples - this.processedSamples;
            var1 = (PcmMixerListener) (this.listeners.next((byte) 59));
          }
          this.nextListenerSample = this.nextListenerSample - this.processedSamples;
          this.processedSamples = 0;
        }
    }

    final PcmStream nextSubStream() {
        return (PcmStream) (this.subStreams.next((byte) 111));
    }

    final PcmStream firstSubStream() {
        return (PcmStream) (this.subStreams.first(0));
    }

    private final void removeListener(PcmMixerListener param0) {
        param0.unlink(-3846);
        param0.onRemove();
        IntrusiveNode var2 = this.listeners.sentinel.next;
        if (var2 == this.listeners.sentinel) {
          this.nextListenerSample = -1;
        } else {
          this.nextListenerSample = ((PcmMixerListener) (var2)).remainingSamples;
        }
    }

    final synchronized void addSubStream(PcmStream param0) {
        this.subStreams.addFirst(param0, (byte) -55);
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
          if (this.processedSamples + param2 < this.nextListenerSample) {
            this.processedSamples = this.processedSamples + param2;
            this.mixSubStreams(param0, param1, param2);
            return;
          }
          var4 = this.nextListenerSample - this.processedSamples;
          this.mixSubStreams(param0, param1, var4);
          param1 = param1 + var4;
          param2 = param2 - var4;
          this.processedSamples = this.processedSamples + var4;
          this.normalizeListenerDelays();
          var5 = (PcmMixerListener) (this.listeners.first(0));
          var6 = var5;
          synchronized (var6) {
            var7 = var5.update(this);
            if (var7 >= 0) {
              var5.remainingSamples = var7;
              this.insertListener(var5.next, var5);
            } else {
              var5.remainingSamples = 0;
              this.removeListener(var5);
            }
          }
        } while (param2 != 0);
        return;
    }

    private final void mixSubStreams(int[] param0, int param1, int param2) {
        PcmStream var4 = (PcmStream) (this.subStreams.first(0));
        while (var4 != null) {
          var4.process(param0, param1, param2);
          var4 = (PcmStream) (this.subStreams.next((byte) 60));
        }
    }

    final synchronized void removeSubStream(PcmStream param0) {
        param0.unlink(-3846);
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
          if (this.processedSamples + param0 < this.nextListenerSample) {
            this.processedSamples = this.processedSamples + param0;
            this.skipSubStreams(param0);
            return;
          }
          var2 = this.nextListenerSample - this.processedSamples;
          this.skipSubStreams(var2);
          param0 = param0 - var2;
          this.processedSamples = this.processedSamples + var2;
          this.normalizeListenerDelays();
          var3 = (PcmMixerListener) (this.listeners.first(0));
          var4 = var3;
          synchronized (var4) {
            var5 = var3.update(this);
            if (var5 >= 0) {
              var3.remainingSamples = var5;
              this.insertListener(var3.next, var3);
            } else {
              var3.remainingSamples = 0;
              this.removeListener(var3);
            }
          }
        } while (param0 != 0);
        return;
    }

    private final void skipSubStreams(int param0) {
        PcmStream var2 = (PcmStream) (this.subStreams.first(0));
        while (var2 != null) {
          var2.skip(param0);
          var2 = (PcmStream) (this.subStreams.next((byte) 59));
        }
    }

    private final void insertListener(IntrusiveNode param0, PcmMixerListener param1) {
        while (true) {
          if (param0 == this.listeners.sentinel) {
            al.a(param1, param0, 2);
            this.nextListenerSample = ((PcmMixerListener) (this.listeners.sentinel.next)).remainingSamples;
            return;
          }
          if (((PcmMixerListener) (param0)).remainingSamples <= param1.remainingSamples) {
            param0 = param0.next;
            continue;
          }
          break;
        }
        al.a(param1, param0, 2);
        this.nextListenerSample = ((PcmMixerListener) (this.listeners.sentinel.next)).remainingSamples;
        return;
    }

    public PcmStreamMixer() {
        this.subStreams = new IntrusiveDeque();
        this.listeners = new IntrusiveDeque();
        this.nextListenerSample = -1;
        this.processedSamples = 0;
    }
}
