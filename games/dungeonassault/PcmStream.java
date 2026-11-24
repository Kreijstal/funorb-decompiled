/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class PcmStream extends IntrusiveNode {
    int field_j;
    ap field_k;
    volatile boolean field_i;
    PcmStream field_l;

    abstract PcmStream nextChildStream();

    final void mixOrSkipFrames(int[] param0, int param1, int param2) {
        if (this.field_i) {
          this.mixInto(param0, param1, param2);
        } else {
          this.skipFrames(param2);
        }
    }

    int getSchedulingPriority() {
        return 255;
    }

    abstract void skipFrames(int param0);

    abstract PcmStream firstChildStream();

    abstract void mixInto(int[] param0, int param1, int param2);

    abstract int getSchedulingCost();

    protected PcmStream() {
        this.field_i = true;
    }
}
