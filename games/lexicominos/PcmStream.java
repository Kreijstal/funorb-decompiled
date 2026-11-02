/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class PcmStream extends kd {
    volatile boolean field_j;
    kh field_k;
    PcmStream field_i;
    int field_h;

    final void a(int[] param0, int param1, int param2) {
        if (this.field_j) {
          this.b(param0, param1, param2);
        } else {
          this.a(param2);
        }
    }

    abstract int a();

    abstract void b(int[] param0, int param1, int param2);

    abstract void a(int param0);

    abstract PcmStream b();

    abstract PcmStream d();

    int c() {
        return 255;
    }

    protected PcmStream() {
        this.field_j = true;
    }
}
