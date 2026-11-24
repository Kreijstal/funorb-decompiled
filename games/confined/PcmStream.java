/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class PcmStream extends IntrusiveNode {
    int field_m;
    PcmStream field_p;
    AbstractAudioSample field_n;
    volatile boolean field_o;

    abstract PcmStream firstChildStream();

    abstract PcmStream nextChildStream();

    abstract void mixInto(int[] param0, int param1, int param2);

    abstract int getSchedulingCost();

    final void mixOrSkipFrames(int[] param0, int param1, int param2) {
        if (this.field_o) {
          this.mixInto(param0, param1, param2);
        } else {
          this.skipFrames(param2);
        }
    }

    abstract void skipFrames(int param0);

    int getSchedulingPriority() {
        return 255;
    }

    PcmStream() {
        this.field_o = true;
    }
}
