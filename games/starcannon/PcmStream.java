/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class PcmStream extends IntrusiveNode {
    volatile boolean field_i;
    int field_g;
    PcmStream field_h;
    AbstractAudioSample field_f;

    abstract int getSchedulingCost();

    final void mixOrSkipFrames(int[] param0, int param1, int param2) {
        if (this.field_i) {
          this.mixInto(param0, param1, param2);
        } else {
          this.skipFrames(param2);
        }
    }

    abstract void mixInto(int[] param0, int param1, int param2);

    abstract PcmStream firstChildStream();

    abstract void skipFrames(int param0);

    abstract PcmStream nextChildStream();

    PcmStream() {
        this.field_i = true;
    }

    int getSchedulingPriority() {
        return 255;
    }
}
