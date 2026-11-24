/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class PcmStream extends IntrusiveNode {
    PcmStream field_g;
    AbstractAudioSample field_e;
    volatile boolean field_h;
    int field_f;

    abstract void skipFrames(int param0);

    final void mixOrSkipFrames(int[] param0, int param1, int param2) {
        if (this.field_h) {
          this.mixInto(param0, param1, param2);
        } else {
          this.skipFrames(param2);
        }
    }

    abstract PcmStream firstChildStream();

    abstract void mixInto(int[] param0, int param1, int param2);

    abstract PcmStream nextChildStream();

    int getSchedulingPriority() {
        return 255;
    }

    abstract int getSchedulingCost();

    PcmStream() {
        this.field_h = true;
    }
}
