/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class PcmStream extends IntrusiveNode {
    int field_o;
    AbstractAudioSample sample;
    volatile boolean field_p;
    PcmStream field_q;

    abstract int getSchedulingCost();

    abstract PcmStream nextChildStream();

    int getSchedulingPriority() {
        return 255;
    }

    final void mixOrSkipFrames(int[] param0, int param1, int param2) {
        if (this.field_p) {
          this.mixInto(param0, param1, param2);
        } else {
          this.skipFrames(param2);
        }
    }

    abstract void skipFrames(int param0);

    abstract void mixInto(int[] param0, int param1, int param2);

    abstract PcmStream firstChildStream();

    protected PcmStream() {
        this.field_p = true;
    }
}
