/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class PcmStream extends IntrusiveNode {
    volatile boolean field_n;
    int field_p;
    PcmStream field_o;
    AbstractAudioSample field_q;

    abstract int getSchedulingCost();

    abstract PcmStream nextChildStream();

    final void mixOrSkipFrames(int[] param0, int param1, int param2) {
        if (this.field_n) {
          this.mixInto(param0, param1, param2);
        } else {
          this.skipFrames(param2);
        }
    }

    abstract void mixInto(int[] param0, int param1, int param2);

    int getSchedulingPriority() {
        return 255;
    }

    abstract PcmStream firstChildStream();

    protected PcmStream() {
        this.field_n = true;
    }

    abstract void skipFrames(int param0);
}
