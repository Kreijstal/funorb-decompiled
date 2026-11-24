/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class PcmStream extends IntrusiveNode {
    volatile boolean field_j;
    PcmStream field_h;
    int field_k;
    AbstractAudioSample field_i;

    abstract void skipFrames(int param0);

    abstract PcmStream firstChildStream();

    abstract void mixInto(int[] param0, int param1, int param2);

    int getSchedulingPriority() {
        return 255;
    }

    final void mixOrSkipFrames(int[] param0, int param1, int param2) {
        if (this.field_j) {
          this.mixInto(param0, param1, param2);
        } else {
          this.skipFrames(param2);
        }
    }

    abstract int getSchedulingCost();

    abstract PcmStream nextChildStream();

    protected PcmStream() {
        this.field_j = true;
    }
}
