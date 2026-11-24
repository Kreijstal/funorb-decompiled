/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class PcmStream extends IntrusiveNode {
    AbstractAudioSample field_l;
    PcmStream field_k;
    volatile boolean field_m;
    int field_n;

    int getSchedulingPriority() {
        return 255;
    }

    abstract void mix(int[] param0, int param1, int param2);

    final void mixOrSkipFrames(int[] param0, int param1, int param2) {
        if (this.field_m) {
          this.mix(param0, param1, param2);
        } else {
          this.skip(param2);
        }
    }

    abstract PcmStream nextChildStream();

    abstract void skip(int param0);

    abstract PcmStream firstChildStream();

    abstract int getSchedulingCost();

    PcmStream() {
        this.field_m = true;
    }
}
