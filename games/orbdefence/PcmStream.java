/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class PcmStream extends IntrusiveNode {
    ng field_h;
    int field_i;
    PcmStream field_f;
    volatile boolean field_g;

    abstract PcmStream nextChildStream();

    abstract int getSchedulingCost();

    abstract void skipFrames(int param0);

    abstract PcmStream firstChildStream();

    final void mixOrSkipFrames(int[] param0, int param1, int param2) {
        if (this.field_g) {
          this.mixInto(param0, param1, param2);
        } else {
          this.skipFrames(param2);
        }
    }

    abstract void mixInto(int[] param0, int param1, int param2);

    int getSchedulingPriority() {
        return 255;
    }

    protected PcmStream() {
        this.field_g = true;
    }
}
