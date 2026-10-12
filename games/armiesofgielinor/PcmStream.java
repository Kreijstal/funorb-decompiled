/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class PcmStream extends IntrusiveNode {
    int schedulerPriority;
    PcmStream schedulerNext;
    volatile boolean active;
    SoundData sound;

    abstract PcmStream nextSubStream();

    abstract PcmStream firstSubStream();

    abstract int getSchedulingCost();

    final void process(int[] output, int outputOffset, int frameCount) {
        if (this.active) {
          this.render(output, outputOffset, frameCount);
        } else {
          this.skip(frameCount);
        }
    }

    abstract void render(int[] output, int outputOffset, int frameCount);

    abstract void skip(int frameCount);

    protected PcmStream() {
        this.active = true;
    }

    int getPriority() {
        return 255;
    }
}
