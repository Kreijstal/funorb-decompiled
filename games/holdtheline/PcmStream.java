/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class PcmStream extends IntrusiveNode {
    PcmStream field_k;
    AbstractAudioSample field_i;
    int field_j;
    volatile boolean field_l;

    int getPriority() {
        return 255;
    }

    abstract void mix(int[] param0, int param1, int param2);

    abstract PcmStream nextSubStream();

    abstract int getActivityWeight();

    abstract void skip(int param0);

    abstract PcmStream firstSubStream();

    final void process(int[] param0, int param1, int param2) {
        if (this.field_l) {
          this.mix(param0, param1, param2);
        } else {
          this.skip(param2);
        }
    }

    protected PcmStream() {
        this.field_l = true;
    }
}
