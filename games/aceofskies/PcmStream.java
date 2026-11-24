/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class PcmStream extends IntrusiveNode {
    PcmStream field_e;
    gs field_f;
    volatile boolean field_g;
    int field_h;

    abstract void mixInto(int[] param0, int param1, int param2);

    abstract PcmStream firstChildStream();

    abstract int getSchedulingCost();

    abstract void skipFrames(int param0);

    int getSchedulingPriority() {
        return 255;
    }

    abstract PcmStream nextChildStream();

    protected PcmStream() {
        this.field_g = true;
    }

    final void mixOrSkipFrames(int[] param0, int param1, int param2) {
        if (this.field_g) {
          this.mixInto(param0, param1, param2);
        } else {
          this.skipFrames(param2);
        }
    }
}
