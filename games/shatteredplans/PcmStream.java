/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class PcmStream extends IntrusiveNode {
    int field_i;
    volatile boolean field_j;
    PcmStream field_h;
    AbstractPcmSample field_k;

    abstract void fill(int[] param0, int param1, int param2);

    final void render(int[] param0, int param1, int param2) {
        if (this.field_j) {
          this.fill(param0, param1, param2);
        } else {
          this.skip(param2);
        }
    }

    abstract void skip(int param0);

    abstract PcmStream firstChild();

    abstract int a();

    abstract PcmStream nextChild();

    protected PcmStream() {
        this.field_j = true;
    }

    int c() {
        return 255;
    }
}
