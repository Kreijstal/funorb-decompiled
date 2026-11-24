/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class PcmStream extends IntrusiveNode {
    ic field_j;
    PcmStream field_h;
    volatile boolean field_i;
    int field_g;

    abstract void mixInto(int[] param0, int param1, int param2);

    abstract void skipFrames(int param0);

    int getSchedulingPriority() {
        return 255;
    }

    final void mixOrSkipFrames(int[] param0, int param1, int param2) {
        if (this.field_i) {
          this.mixInto(param0, param1, param2);
        } else {
          this.skipFrames(param2);
        }
    }

    abstract PcmStream nextChildStream();

    abstract int getSchedulingCost();

    abstract PcmStream firstChildStream();

    protected PcmStream() {
        this.field_i = true;
    }
}
