/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class PcmStream extends IntrusiveNode {
    AbstractAudioSample sample;
    PcmStream scheduledNextStream;
    int scheduledPriority;
    volatile boolean activeForMixing;

    abstract PcmStream firstChildStream();

    abstract int getSchedulingCost();

    abstract void skipFrames(int frameCount);

    abstract PcmStream nextChildStream();

    int getSchedulingPriority() {
        return 255;
    }

    final void mixOrSkip(int[] destination, int destinationOffset, int frameCount) {
        if (this.activeForMixing) {
            this.mixInto(destination, destinationOffset, frameCount);
        } else {
            this.skipFrames(frameCount);
        }
    }

    abstract void mixInto(int[] destination, int destinationOffset, int frameCount);

    protected PcmStream() {
        this.activeForMixing = true;
    }
}
