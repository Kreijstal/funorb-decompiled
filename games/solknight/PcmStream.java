/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class PcmStream extends IntrusiveNode {
    PcmStream field_i;
    int field_j;
    volatile boolean field_k;
    nl field_h;

    abstract PcmStream firstChildStream();

    final void mixOrSkipFrames(int[] param0, int param1, int param2) {
        if (this.field_k) {
          this.mixInto(param0, param1, param2);
        } else {
          this.skipFrames(param2);
        }
    }

    abstract void skipFrames(int param0);

    abstract PcmStream nextChildStream();

    int getSchedulingPriority() {
        return 255;
    }

    abstract void mixInto(int[] param0, int param1, int param2);

    protected PcmStream() {
        this.field_k = true;
    }

    abstract int getSchedulingCost();
}
