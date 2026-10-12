/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PcmStreamMixer extends PcmStream {
    private NodeDeque subStreams;
    private NodeDeque listeners;
    private int processedFrames;
    private int nextListenerFrame;

    final int getSchedulingCost() {
        return 0;
    }

    final synchronized void skip(int frameCount) {
        int framesToListener = 0;
        TimedPcmListener listener = null;
        int nextDelay = 0;
        Throwable unusedMonitorFailure = null;
        Object listenerMonitor = null;
        do {
          if (this.nextListenerFrame < 0) {
            this.skipSubStreams(frameCount);
            return;
          }
          if (this.processedFrames + frameCount < this.nextListenerFrame) {
            this.processedFrames = this.processedFrames + frameCount;
            this.skipSubStreams(frameCount);
            return;
          }
          framesToListener = this.nextListenerFrame - this.processedFrames;
          this.skipSubStreams(framesToListener);
          frameCount = frameCount - framesToListener;
          this.processedFrames = this.processedFrames + framesToListener;
          this.normalizeListenerFrames();
          listener = (TimedPcmListener) (this.listeners.first((byte) 110));
          listenerMonitor = listener;
          synchronized (listenerMonitor) {
            nextDelay = listener.onCallback(this);
            if (nextDelay >= 0) {
              listener.framesUntilCallback = nextDelay;
              this.insertListener(listener.next, listener);
            } else {
              listener.framesUntilCallback = 0;
              this.removeListener(listener);
            }
          }
        } while (frameCount != 0);
        return;
    }

    final synchronized void addSubStream(PcmStream stream) {
        this.subStreams.addFirst(750, stream);
    }

    private final void removeListener(TimedPcmListener listener) {
        listener.unlink(103);
        listener.onRemoved();
        IntrusiveNode nextListenerNode = this.listeners.sentinel.next;
        if (nextListenerNode == this.listeners.sentinel) {
          this.nextListenerFrame = -1;
        } else {
          this.nextListenerFrame = ((TimedPcmListener) (nextListenerNode)).framesUntilCallback;
        }
    }

    final synchronized void render(int[] output, int outputOffset, int frameCount) {
        int framesToListener = 0;
        TimedPcmListener listener = null;
        int nextDelay = 0;
        Throwable unusedMonitorFailure = null;
        Object listenerMonitor = null;
        do {
          if (this.nextListenerFrame < 0) {
            this.renderSubStreams(output, outputOffset, frameCount);
            return;
          }
          if (this.processedFrames + frameCount < this.nextListenerFrame) {
            this.processedFrames = this.processedFrames + frameCount;
            this.renderSubStreams(output, outputOffset, frameCount);
            return;
          }
          framesToListener = this.nextListenerFrame - this.processedFrames;
          this.renderSubStreams(output, outputOffset, framesToListener);
          outputOffset = outputOffset + framesToListener;
          frameCount = frameCount - framesToListener;
          this.processedFrames = this.processedFrames + framesToListener;
          this.normalizeListenerFrames();
          listener = (TimedPcmListener) (this.listeners.first((byte) 127));
          listenerMonitor = listener;
          synchronized (listenerMonitor) {
            nextDelay = listener.onCallback(this);
            if (nextDelay >= 0) {
              listener.framesUntilCallback = nextDelay;
              this.insertListener(listener.next, listener);
            } else {
              listener.framesUntilCallback = 0;
              this.removeListener(listener);
            }
          }
        } while (frameCount != 0);
        return;
    }

    private final void renderSubStreams(int[] output, int outputOffset, int frameCount) {
        PcmStream stream = (PcmStream) (this.subStreams.first((byte) 118));
        while (stream != null) {
          stream.process(output, outputOffset, frameCount);
          stream = (PcmStream) (this.subStreams.next((byte) 123));
        }
    }

    final PcmStream nextSubStream() {
        return (PcmStream) (this.subStreams.next((byte) 123));
    }

    final PcmStream firstSubStream() {
        return (PcmStream) (this.subStreams.first((byte) 126));
    }

    private final void skipSubStreams(int frameCount) {
        PcmStream stream = (PcmStream) (this.subStreams.first((byte) 103));
        while (stream != null) {
          stream.skip(frameCount);
          stream = (PcmStream) (this.subStreams.next((byte) 123));
        }
    }

    private final void normalizeListenerFrames() {
        TimedPcmListener listener = null;
        if (this.processedFrames > 0) {
          listener = (TimedPcmListener) (this.listeners.first((byte) 111));
          while (listener != null) {
            listener.framesUntilCallback = listener.framesUntilCallback - this.processedFrames;
            listener = (TimedPcmListener) (this.listeners.next((byte) 123));
          }
          this.nextListenerFrame = this.nextListenerFrame - this.processedFrames;
          this.processedFrames = 0;
        }
    }

    private final void insertListener(IntrusiveNode before, TimedPcmListener listener) {
        while (true) {
          if (before == this.listeners.sentinel) {
            fj.$cfr$intArgs$a$f94c566f195c(-123, listener, before);
            this.nextListenerFrame = ((TimedPcmListener) (this.listeners.sentinel.next)).framesUntilCallback;
            return;
          }
          if (((TimedPcmListener) (before)).framesUntilCallback <= listener.framesUntilCallback) {
            before = before.next;
            continue;
          }
          break;
        }
        fj.$cfr$intArgs$a$f94c566f195c(-123, listener, before);
        this.nextListenerFrame = ((TimedPcmListener) (this.listeners.sentinel.next)).framesUntilCallback;
        return;
    }

    public PcmStreamMixer() {
        this.subStreams = new NodeDeque();
        this.listeners = new NodeDeque();
        this.processedFrames = 0;
        this.nextListenerFrame = -1;
    }
}
