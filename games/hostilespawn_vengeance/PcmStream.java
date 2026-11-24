/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class PcmStream extends IntrusiveNode {
    ef field_j;
    int field_i;
    volatile boolean field_h;
    PcmStream field_k;

    abstract PcmStream firstChildStream();

    abstract void skipFrames(int param0);

    abstract void mixInto(int[] param0, int param1, int param2);

    int getSchedulingPriority() {
        return 255;
    }

    abstract int getSchedulingCost();

    final void mixOrSkipFrames(int[] param0, int param1, int param2) {
        if (this.field_h) {
          this.mixInto(param0, param1, param2);
        } else {
          this.skipFrames(param2);
        }
    }

    abstract PcmStream nextChildStream();

    protected PcmStream() {
        this.field_h = true;
    }
}
