/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class PcmStream extends IntrusiveNode {
    lk field_i;
    volatile boolean field_k;
    PcmStream field_l;
    int field_j;

    abstract void a(int[] param0, int param1, int param2);

    final void b(int[] param0, int param1, int param2) {
        if (this.field_k) {
          this.a(param0, param1, param2);
        } else {
          this.d(param2);
        }
    }

    int d() {
        return 255;
    }

    abstract void d(int param0);

    abstract PcmStream b();

    abstract PcmStream a();

    abstract int c();

    protected PcmStream() {
        this.field_k = true;
    }
}
