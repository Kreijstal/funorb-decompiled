/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class PcmStream extends IntrusiveNode {
    PcmStream field_l;
    jf field_i;
    volatile boolean field_j;
    int field_k;

    int getSchedulingPriority() {
        return 255;
    }

    abstract void mixInto(int[] param0, int param1, int param2);

    abstract int getSchedulingCost();

    abstract PcmStream firstChildStream();

    abstract void skipFrames(int param0);

    final void mixOrSkipFrames(int[] param0, int param1, int param2) {
        if (this.field_j) {
          this.mixInto(param0, param1, param2);
        } else {
          this.skipFrames(param2);
        }
    }

    abstract PcmStream nextChildStream();

    protected PcmStream() {
        this.field_j = true;
    }
}
