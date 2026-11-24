/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class PcmStream extends IntrusiveNode {
    int field_j;
    PcmStream field_g;
    volatile boolean field_h;
    ea field_i;

    int getSchedulingPriority() {
        return 255;
    }

    abstract void skipFrames(int param0);

    abstract void mixInto(int[] param0, int param1, int param2);

    abstract PcmStream firstChildStream();

    abstract PcmStream nextChildStream();

    final void mixOrSkipFrames(int[] param0, int param1, int param2) {
        if (this.field_h) {
          this.mixInto(param0, param1, param2);
        } else {
          this.skipFrames(param2);
        }
    }

    abstract int getSchedulingCost();

    PcmStream() {
        this.field_h = true;
    }
}
