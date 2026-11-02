/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class PcmStream extends IntrusiveNode {
    lk field_i;
    volatile boolean field_k;
    PcmStream field_l;
    int field_j;

    abstract void mix(int[] param0, int param1, int param2);

    final void mixIfActive(int[] param0, int param1, int param2) {
        if (this.field_k) {
          this.mix(param0, param1, param2);
        } else {
          this.skip(param2);
        }
    }

    int d() {
        return 255;
    }

    abstract void skip(int param0);

    abstract PcmStream b();

    abstract PcmStream a();

    abstract int c();

    protected PcmStream() {
        this.field_k = true;
    }
}
