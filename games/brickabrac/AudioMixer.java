/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AudioMixer extends AudioStream {
    private NodeDeque streams;
    private NodeDeque listeners;
    private int processedSamples;
    private int nextListenerSample;

    final AudioStream nextSubStream() {
        return (AudioStream) (this.streams.next((byte) 116));
    }

    final synchronized void addStream(AudioStream stream) {
        this.streams.addFirst(true, stream);
    }

    final AudioStream firstSubStream() {
        return (AudioStream) (this.streams.first(-112));
    }

    final int getSchedulingCost() {
        return 0;
    }

    final synchronized void removeStream(AudioStream stream) {
        stream.unlink((byte) 111);
    }

    private final void scheduleListener(IntrusiveNode startNode, AudioMixerListener listener) {
        while (true) {
          if (startNode == this.listeners.sentinel) {
            il.a(listener, 113, startNode);
            this.nextListenerSample = ((AudioMixerListener) (this.listeners.sentinel.next)).remainingSamples;
            return;
          }
          if (((AudioMixerListener) (startNode)).remainingSamples <= listener.remainingSamples) {
            startNode = startNode.next;
            continue;
          }
          break;
        }
        il.a(listener, 113, startNode);
        this.nextListenerSample = ((AudioMixerListener) (this.listeners.sentinel.next)).remainingSamples;
        return;
    }

    private final void skipStreams(int frames) {
        AudioStream stream = (AudioStream) (this.streams.first(-21));
        while (stream != null) {
          stream.skip(frames);
          stream = (AudioStream) (this.streams.next((byte) 116));
        }
    }

    private final void processStreams(int[] output, int offset, int frames) {
        AudioStream stream = (AudioStream) (this.streams.first(-96));
        while (stream != null) {
          stream.process(output, offset, frames);
          stream = (AudioStream) (this.streams.next((byte) 116));
        }
    }

    private final void removeListener(AudioMixerListener listener) {
        listener.unlink((byte) 111);
        listener.onRemoved();
        IntrusiveNode var2 = this.listeners.sentinel.next;
        if (var2 == this.listeners.sentinel) {
          this.nextListenerSample = -1;
        } else {
          this.nextListenerSample = ((AudioMixerListener) (var2)).remainingSamples;
        }
    }

    final synchronized void fill(int[] output, int offset, int frames) {
        int var4 = 0;
        AudioMixerListener var5 = null;
        int var7 = 0;
        Throwable decompiledCaughtException = null;
        Object var6 = null;
        do {
          if (this.nextListenerSample < 0) {
            this.processStreams(output, offset, frames);
            return;
          }
          if (this.processedSamples + frames < this.nextListenerSample) {
            this.processedSamples = this.processedSamples + frames;
            this.processStreams(output, offset, frames);
            return;
          }
          var4 = this.nextListenerSample - this.processedSamples;
          this.processStreams(output, offset, var4);
          offset = offset + var4;
          frames = frames - var4;
          this.processedSamples = this.processedSamples + var4;
          this.normalizeListenerTimes();
          var5 = (AudioMixerListener) (this.listeners.first(-90));
          var6 = var5;
          synchronized (var6) {
            var7 = var5.onBoundary(this);
            if (var7 >= 0) {
              var5.remainingSamples = var7;
              this.scheduleListener(var5.next, var5);
            } else {
              var5.remainingSamples = 0;
              this.removeListener(var5);
            }
          }
        } while (frames != 0);
        return;
    }

    final synchronized void skip(int frames) {
        int var2 = 0;
        AudioMixerListener var3 = null;
        int var5 = 0;
        Throwable decompiledCaughtException = null;
        Object var4 = null;
        do {
          if (this.nextListenerSample < 0) {
            this.skipStreams(frames);
            return;
          }
          if (this.processedSamples + frames < this.nextListenerSample) {
            this.processedSamples = this.processedSamples + frames;
            this.skipStreams(frames);
            return;
          }
          var2 = this.nextListenerSample - this.processedSamples;
          this.skipStreams(var2);
          frames = frames - var2;
          this.processedSamples = this.processedSamples + var2;
          this.normalizeListenerTimes();
          var3 = (AudioMixerListener) (this.listeners.first(-40));
          var4 = var3;
          synchronized (var4) {
            var5 = var3.onBoundary(this);
            if (var5 >= 0) {
              var3.remainingSamples = var5;
              this.scheduleListener(var3.next, var3);
            } else {
              var3.remainingSamples = 0;
              this.removeListener(var3);
            }
          }
        } while (frames != 0);
        return;
    }

    private final void normalizeListenerTimes() {
        AudioMixerListener var1 = null;
        if (this.processedSamples > 0) {
          var1 = (AudioMixerListener) (this.listeners.first(-127));
          while (var1 != null) {
            var1.remainingSamples = var1.remainingSamples - this.processedSamples;
            var1 = (AudioMixerListener) (this.listeners.next((byte) 116));
          }
          this.nextListenerSample = this.nextListenerSample - this.processedSamples;
          this.processedSamples = 0;
        }
    }

    public AudioMixer() {
        this.streams = new NodeDeque();
        this.listeners = new NodeDeque();
        this.nextListenerSample = -1;
        this.processedSamples = 0;
    }
}
