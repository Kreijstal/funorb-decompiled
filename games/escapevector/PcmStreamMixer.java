/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PcmStreamMixer extends PcmStream {
    private IntrusiveDeque substreams;
    private IntrusiveDeque listeners;
    private int nextListenerDeadline;
    private int processedSamples;

    final synchronized void mixInto(int[] samples, int offset, int length) {
        Throwable decompiledCaughtException = null;
        do {
          if (this.nextListenerDeadline < 0) {
            this.mixSubstreams(samples, offset, length);
            return;
          }
          if (this.processedSamples + length < this.nextListenerDeadline) {
            this.processedSamples = this.processedSamples + length;
            this.mixSubstreams(samples, offset, length);
            return;
          }
          int var4 = this.nextListenerDeadline - this.processedSamples;
          this.mixSubstreams(samples, offset, var4);
          offset = offset + var4;
          length = length - var4;
          this.processedSamples = this.processedSamples + var4;
          this.normalizeListenerDeadlines();
          PcmMixerListener var5 = (PcmMixerListener) (this.listeners.first(false));
          Object var6 = var5;
          synchronized (var6) {
            int var7 = var5.onDeadline(this);
            if (var7 >= 0) {
              var5.remainingSamples = var7;
              this.insertListener(var5.next, var5);
            } else {
              var5.remainingSamples = 0;
              this.unlinkListener(var5);
            }
          }
        } while (length != 0);
        return;
    }

    private final void mixSubstreams(int[] samples, int offset, int length) {
        PcmStream var4 = (PcmStream) (this.substreams.first(false));
        while (var4 != null) {
          var4.process(samples, offset, length);
          var4 = (PcmStream) (this.substreams.next((byte) 70));
        }
    }

    final void playSampleWithPan(PcmSample sample, int ratePercent, int volume, int pan) {
        this.addSubstream(PcmSampleStream.c(sample, ratePercent, volume, pan));
    }

    final synchronized void removeListener(PcmMixerListener listener) {
        if (listener.owner == null) {
          return;
        }
        if (listener.owner == this) {
          this.normalizeListenerDeadlines();
          this.unlinkListener(listener);
          return;
        }
        throw new RuntimeException();
    }

    final synchronized void skip(int length) {
        Throwable decompiledCaughtException = null;
        do {
          if (this.nextListenerDeadline < 0) {
            this.skipSubstreams(length);
            return;
          }
          if (this.processedSamples + length < this.nextListenerDeadline) {
            this.processedSamples = this.processedSamples + length;
            this.skipSubstreams(length);
            return;
          }
          int var2 = this.nextListenerDeadline - this.processedSamples;
          this.skipSubstreams(var2);
          length = length - var2;
          this.processedSamples = this.processedSamples + var2;
          this.normalizeListenerDeadlines();
          PcmMixerListener var3 = (PcmMixerListener) (this.listeners.first(false));
          Object var4 = var3;
          synchronized (var4) {
            int var5 = var3.onDeadline(this);
            if (var5 >= 0) {
              var3.remainingSamples = var5;
              this.insertListener(var3.next, var3);
            } else {
              var3.remainingSamples = 0;
              this.unlinkListener(var3);
            }
          }
        } while (length != 0);
        return;
    }

    final synchronized void addSubstream(PcmStream stream) {
        this.substreams.addFirst(stream, 8364);
    }

    private final void normalizeListenerDeadlines() {
        if (this.processedSamples > 0) {
          PcmMixerListener var1 = (PcmMixerListener) (this.listeners.first(false));
          while (var1 != null) {
            var1.remainingSamples = var1.remainingSamples - this.processedSamples;
            var1 = (PcmMixerListener) (this.listeners.next((byte) 70));
          }
          this.nextListenerDeadline = this.nextListenerDeadline - this.processedSamples;
          this.processedSamples = 0;
        }
    }

    private final void insertListener(IntrusiveNode before, PcmMixerListener listener) {
        while (true) {
          if (before == this.listeners.sentinel) {
            EscapeVector.$cfr$intArgs$a$aafaec74e55e(listener, before, -7);
            this.nextListenerDeadline = ((PcmMixerListener) (this.listeners.sentinel.next)).remainingSamples;
            return;
          }
          if (((PcmMixerListener) (before)).remainingSamples <= listener.remainingSamples) {
            before = before.next;
            continue;
          }
          break;
        }
        EscapeVector.$cfr$intArgs$a$aafaec74e55e(listener, before, -7);
        this.nextListenerDeadline = ((PcmMixerListener) (this.listeners.sentinel.next)).remainingSamples;
        return;
    }

    final synchronized void scheduleListener(PcmMixerListener listener) {
        if (listener.owner == null) {
          this.normalizeListenerDeadlines();
          listener.owner = this;
          listener.onScheduled();
          this.insertListener(this.listeners.sentinel.next, listener);
          return;
        }
        throw new RuntimeException();
    }

    final PcmStream firstSubstream() {
        return (PcmStream) (this.substreams.first(false));
    }

    private final void skipSubstreams(int length) {
        PcmStream var2 = (PcmStream) (this.substreams.first(false));
        while (var2 != null) {
          var2.skip(length);
          var2 = (PcmStream) (this.substreams.next((byte) 70));
        }
    }

    final synchronized void removeSubstream(PcmStream stream) {
        stream.unlink((byte) -32);
    }

    final void playSample(PcmSample sample, int ratePercent, int volume) {
        this.addSubstream(PcmSampleStream.a(sample, ratePercent, volume));
    }

    final PcmStream nextSubstream() {
        return (PcmStream) (this.substreams.next((byte) 70));
    }

    final int activity() {
        return 0;
    }

    private final void unlinkListener(PcmMixerListener listener) {
        listener.unlink((byte) -31);
        listener.onRemoved();
        listener.owner = null;
        IntrusiveNode var2 = this.listeners.sentinel.next;
        if (var2 == this.listeners.sentinel) {
          this.nextListenerDeadline = -1;
        } else {
          this.nextListenerDeadline = ((PcmMixerListener) (var2)).remainingSamples;
        }
    }

    public PcmStreamMixer() {
        this.substreams = new IntrusiveDeque();
        this.listeners = new IntrusiveDeque();
        this.nextListenerDeadline = -1;
        this.processedSamples = 0;
    }
}
