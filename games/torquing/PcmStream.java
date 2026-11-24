/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class PcmStream extends IntrusiveNode {
    int field_j;
    volatile boolean field_k;
    PcmStream field_l;
    AbstractAudioSample field_m;

    abstract void mixInto(int[] param0, int param1, int param2);

    abstract PcmStream nextChildStream();

    int getSchedulingPriority() {
        return 255;
    }

    abstract PcmStream firstChildStream();

    final void mixOrSkipFrames(int[] param0, int param1, int param2) {
        if (this.field_k) {
          this.mixInto(param0, param1, param2);
        } else {
          this.skipFrames(param2);
        }
    }

    abstract void skipFrames(int param0);

    abstract int getSchedulingCost();

    protected PcmStream() {
        this.field_k = true;
    }
}
