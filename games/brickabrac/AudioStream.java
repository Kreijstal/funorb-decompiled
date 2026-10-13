/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class AudioStream extends IntrusiveNode {
    AudioData data;
    int schedulerPriority;
    AudioStream schedulerNext;
    volatile boolean enabled;

    abstract void fill(int[] output, int offset, int frames);

    int getPriority() {
        return 255;
    }

    abstract AudioStream nextSubStream();

    abstract AudioStream firstSubStream();

    final void process(int[] output, int offset, int frames) {
        if (this.enabled) {
          this.fill(output, offset, frames);
        } else {
          this.skip(frames);
        }
    }

    abstract int getSchedulingCost();

    protected AudioStream() {
        this.enabled = true;
    }

    abstract void skip(int frames);
}
