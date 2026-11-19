/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class PcmStream extends IntrusiveNode {
    PcmStream field_j;
    int field_l;
    AbstractAudioSample field_k;
    volatile boolean field_i;

    abstract void fill(int[] param0, int param1, int param2);

    final void update(int[] param0, int param1, int param2) {
        if (this.field_i) {
          this.fill(param0, param1, param2);
        } else {
          this.skipFrames(param2);
        }
    }

    abstract void skipFrames(int param0);

    abstract PcmStream firstSubstream();

    abstract PcmStream nextSubstream();

    int priority() {
        return 255;
    }

    abstract int mixingCost();

    protected PcmStream() {
        this.field_i = true;
    }
}
