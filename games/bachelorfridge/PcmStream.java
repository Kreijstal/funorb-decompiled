/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class PcmStream extends IntrusiveNode {
    AbstractAudioSample field_h;
    volatile boolean field_f;
    int field_i;
    PcmStream field_g;

    abstract void skipFrames(int param0);

    abstract PcmStream nextChildStream();

    abstract void mixInto(int[] param0, int param1, int param2);

    int getPriority() {
        return 255;
    }

    abstract PcmStream firstChildStream();

    protected PcmStream() {
        this.field_f = true;
    }

    abstract int getSchedulingCost();

    final void mixOrSkipFrames(int[] param0, int param1, int param2) {
        if (this.field_f) {
          this.mixInto(param0, param1, param2);
        } else {
          this.skipFrames(param2);
        }
    }
}
