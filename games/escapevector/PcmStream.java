/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class PcmStream extends IntrusiveNode {
    int schedulerPriority;
    AbstractPcmSample sample;
    volatile boolean active;
    PcmStream schedulerNext;

    abstract PcmStream firstSubstream();

    final void process(int[] samples, int offset, int length) {
        if (this.active) {
          this.mixInto(samples, offset, length);
        } else {
          this.skip(length);
        }
    }

    abstract PcmStream nextSubstream();

    abstract int activity();

    abstract void mixInto(int[] samples, int offset, int length);

    int priority() {
        return 255;
    }

    abstract void skip(int length);

    protected PcmStream() {
        this.active = true;
    }
}
