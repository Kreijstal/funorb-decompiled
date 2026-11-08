/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class PcmStream extends IntrusiveNode {
    int field_j;
    AbstractAudioSample field_h;
    volatile boolean active;
    PcmStream field_i;

    final void fillOrSkip(int[] param0, int param1, int param2) {
        if (this.active) {
          this.fill(param0, param1, param2);
        } else {
          this.skip(param2);
        }
    }

    int priority() {
        return 255;
    }

    abstract void skip(int param0);

    abstract void fill(int[] param0, int param1, int param2);

    abstract int activity();

    abstract PcmStream firstSubstream();

    abstract PcmStream nextSubstream();

    protected PcmStream() {
        this.active = true;
    }
}
