/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class PcmStream extends IntrusiveNode {
    PcmStream field_j;
    int field_m;
    volatile boolean field_k;
    AbstractAudioSample field_l;

    abstract void mixInto(int[] param0, int param1, int param2);

    abstract void skip(int sampleCount);

    final void mixOrSkip(int[] buffer, int offset, int length) {
        if (this.field_k) {
          this.mixInto(buffer, offset, length);
        } else {
          this.skip(length);
        }
    }

    int getSchedulingPriority() {
        return 255;
    }

    abstract PcmStream nextChildStream();

    abstract PcmStream firstChildStream();

    abstract int getSchedulingCost();

    protected PcmStream() {
        this.field_k = true;
    }
}
