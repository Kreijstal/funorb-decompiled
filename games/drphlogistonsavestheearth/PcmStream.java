/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class PcmStream extends IntrusiveNode {
    int field_k;
    AbstractAudioSample field_i;
    PcmStream field_j;
    volatile boolean field_h;

    abstract int getSchedulingCost();

    int getSchedulingPriority() {
        return 255;
    }

    abstract void mixInto(int[] param0, int param1, int param2);

    abstract PcmStream firstChildStream();

    abstract PcmStream nextChildStream();

    abstract void skipFrames(int param0);

    final void mixOrSkipFrames(int[] param0, int param1, int param2) {
        if (this.field_h) {
          this.mixInto(param0, param1, param2);
        } else {
          this.skipFrames(param2);
        }
    }

    protected PcmStream() {
        this.field_h = true;
    }
}
