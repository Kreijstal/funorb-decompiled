/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class PcmStream extends IntrusiveNode {
    volatile boolean field_j;
    AbstractAudioSample field_k;
    PcmStream field_i;
    int field_h;

    final void mixOrSkipFrames(int[] param0, int param1, int param2) {
        if (this.field_j) {
          this.mixInto(param0, param1, param2);
        } else {
          this.skipFrames(param2);
        }
    }

    abstract int getSchedulingCost();

    abstract void mixInto(int[] param0, int param1, int param2);

    abstract void skipFrames(int param0);

    abstract PcmStream nextChildStream();

    abstract PcmStream firstChildStream();

    int getSchedulingPriority() {
        return 255;
    }

    protected PcmStream() {
        this.field_j = true;
    }
}
