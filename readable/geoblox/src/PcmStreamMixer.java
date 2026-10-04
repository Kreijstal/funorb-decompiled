/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PcmStreamMixer extends PcmStream {
    private IntrusiveDeque childStreams;
    private IntrusiveDeque scheduledListeners;
    private int nextListenerFrameOffset;
    private int framesSinceListenerNormalization;

    private final void removeListener(PcmMixerListener listener) {
        listener.unlinkNode(false);
        listener.onRemovedFromMixer();
        IntrusiveNode firstListenerNode = this.scheduledListeners.sentinel.nextNode;
        if (firstListenerNode == this.scheduledListeners.sentinel) {
            this.nextListenerFrameOffset = -1;
        } else {
            this.nextListenerFrameOffset = ((PcmMixerListener) ((Object) firstListenerNode)).scheduledFrameOffset;
        }
    }

    final PcmStream nextChildStream() {
        return (PcmStream) ((Object) this.childStreams.nextForIteration(1));
    }

    final synchronized void mixInto(int[] destination, int destinationOffset, int frameCount) {
        int framesToDeadline = 0;
        PcmMixerListener listener = null;
        int nextFrameOffset = 0;
        Throwable unusedMonitorExceptionCarrier = null;
        Object listenerMonitor = null;
        while (true) {
          if (this.nextListenerFrameOffset < 0) {
            this.mixChildStreams(destination, destinationOffset, frameCount);
            return;
          }
          if (this.framesSinceListenerNormalization + frameCount < this.nextListenerFrameOffset) {
            this.framesSinceListenerNormalization = this.framesSinceListenerNormalization + frameCount;
            this.mixChildStreams(destination, destinationOffset, frameCount);
            return;
          }
          framesToDeadline = this.nextListenerFrameOffset - this.framesSinceListenerNormalization;
          this.mixChildStreams(destination, destinationOffset, framesToDeadline);
          destinationOffset = destinationOffset + framesToDeadline;
          frameCount = frameCount - framesToDeadline;
          this.framesSinceListenerNormalization = this.framesSinceListenerNormalization + framesToDeadline;
          this.normalizeListenerFrameOffsets();
          listener = (PcmMixerListener) ((Object) this.scheduledListeners.firstForIteration(0));
          listenerMonitor = listener;
          synchronized (listenerMonitor) {
            nextFrameOffset = listener.onMixerDeadline((PcmStreamMixer) (this));
            if (nextFrameOffset >= 0) {
              listener.scheduledFrameOffset = nextFrameOffset;
              this.insertListenerByFrameOffset(listener.nextNode, listener);
            } else {
              listener.scheduledFrameOffset = 0;
              this.removeListener(listener);
            }
          }
          if (frameCount != 0) {
            continue;
          }
          return;
        }
    }

    private final void insertListenerByFrameOffset(IntrusiveNode searchNode, PcmMixerListener listener) {
        while (true) {
          if (searchNode == this.scheduledListeners.sentinel) {
            PointerInputListener.insertNodeBefore(searchNode, 93, listener);
            this.nextListenerFrameOffset = ((PcmMixerListener) ((Object) this.scheduledListeners.sentinel.nextNode)).scheduledFrameOffset;
            return;
          }
          if (((PcmMixerListener) ((Object) searchNode)).scheduledFrameOffset <= listener.scheduledFrameOffset) {
            searchNode = searchNode.nextNode;
            continue;
          }
          PointerInputListener.insertNodeBefore(searchNode, 93, listener);
          this.nextListenerFrameOffset = ((PcmMixerListener) ((Object) this.scheduledListeners.sentinel.nextNode)).scheduledFrameOffset;
          return;
        }
    }

    private final void mixChildStreams(int[] destination, int destinationOffset, int frameCount) {
        PcmStream childStream = (PcmStream) ((Object) this.childStreams.firstForIteration(0));
        while (childStream != null) {
            childStream.mixOrSkip(destination, destinationOffset, frameCount);
            childStream = (PcmStream) ((Object) this.childStreams.nextForIteration(1));
        }
    }

    final int getSchedulingCost() {
        return 0;
    }

    final synchronized void skipFrames(int frameCount) {
        int framesToDeadline = 0;
        PcmMixerListener listener = null;
        int nextFrameOffset = 0;
        Throwable unusedMonitorExceptionCarrier = null;
        Object listenerMonitor = null;
        while (true) {
          if (this.nextListenerFrameOffset < 0) {
            this.skipChildStreams(frameCount);
            return;
          }
          if (this.framesSinceListenerNormalization + frameCount < this.nextListenerFrameOffset) {
            this.framesSinceListenerNormalization = this.framesSinceListenerNormalization + frameCount;
            this.skipChildStreams(frameCount);
            return;
          }
          framesToDeadline = this.nextListenerFrameOffset - this.framesSinceListenerNormalization;
          this.skipChildStreams(framesToDeadline);
          frameCount = frameCount - framesToDeadline;
          this.framesSinceListenerNormalization = this.framesSinceListenerNormalization + framesToDeadline;
          this.normalizeListenerFrameOffsets();
          listener = (PcmMixerListener) ((Object) this.scheduledListeners.firstForIteration(0));
          listenerMonitor = listener;
          synchronized (listenerMonitor) {
            nextFrameOffset = listener.onMixerDeadline((PcmStreamMixer) (this));
            if (nextFrameOffset >= 0) {
              listener.scheduledFrameOffset = nextFrameOffset;
              this.insertListenerByFrameOffset(listener.nextNode, listener);
            } else {
              listener.scheduledFrameOffset = 0;
              this.removeListener(listener);
            }
          }
          if (frameCount != 0) {
            continue;
          }
          return;
        }
    }

    private final void normalizeListenerFrameOffsets() {
        PcmMixerListener listener = null;
        if (this.framesSinceListenerNormalization > 0) {
            listener = (PcmMixerListener) ((Object) this.scheduledListeners.firstForIteration(0));
            while (listener != null) {
                listener.scheduledFrameOffset = listener.scheduledFrameOffset - this.framesSinceListenerNormalization;
                listener = (PcmMixerListener) ((Object) this.scheduledListeners.nextForIteration(1));
            }
            this.nextListenerFrameOffset = this.nextListenerFrameOffset - this.framesSinceListenerNormalization;
            this.framesSinceListenerNormalization = 0;
        }
    }

    final PcmStream firstChildStream() {
        return (PcmStream) ((Object) this.childStreams.firstForIteration(0));
    }

    private final void skipChildStreams(int frameCount) {
        PcmStream childStream = (PcmStream) ((Object) this.childStreams.firstForIteration(0));
        while (childStream != null) {
            childStream.skipFrames(frameCount);
            childStream = (PcmStream) ((Object) this.childStreams.nextForIteration(1));
        }
    }

    final synchronized void addChildStream(PcmStream stream) {
        this.childStreams.addFirst(stream, false);
    }

    public PcmStreamMixer() {
        this.childStreams = new IntrusiveDeque();
        this.scheduledListeners = new IntrusiveDeque();
        this.nextListenerFrameOffset = -1;
        this.framesSinceListenerNormalization = 0;
    }
}
