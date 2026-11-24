/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class PcmStream extends IntrusiveNode {
    int field_g;
    volatile boolean field_f;
    PcmStream field_i;
    cg field_h;

    abstract int getSchedulingCost();

    abstract PcmStream nextChildStream();

    abstract PcmStream firstChildStream();

    abstract void mixInto(int[] param0, int param1, int param2);

    abstract void skipFrames(int param0);

    final void mixOrSkipFrames(int[] param0, int param1, int param2) {
        if (this.field_f) {
          this.mixInto(param0, param1, param2);
        } else {
          this.skipFrames(param2);
        }
    }

    int getSchedulingPriority() {
        return 255;
    }

    protected PcmStream() {
        this.field_f = true;
    }
}
