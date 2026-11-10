/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class PcmStream extends IntrusiveNode {
    volatile boolean active;
    int field_h;
    ud field_i;
    PcmStream field_g;

    int getLevel() {
        return 255;
    }

    abstract void fill(int[] param0, int param1, int param2);

    abstract PcmStream firstSubStream();

    abstract PcmStream nextSubStream();

    final void fillOrSkip(int[] param0, int param1, int param2) {
        if (this.active) {
          this.fill(param0, param1, param2);
        } else {
          this.skip(param2);
        }
    }

    abstract int activity();

    abstract void skip(int param0);

    protected PcmStream() {
        this.active = true;
    }
}
