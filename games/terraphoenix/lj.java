/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class lj extends uf {
    volatile boolean field_j;
    lj field_h;
    int field_k;
    id field_i;

    abstract void a(int param0);

    abstract lj c();

    abstract void a(int[] param0, int param1, int param2);

    int b() {
        return 255;
    }

    final void b(int[] param0, int param1, int param2) {
        if (this.field_j) {
            this.a(param0, param1, param2);
        } else {
            this.a(param2);
        }
    }

    abstract int d();

    abstract lj a();

    protected lj() {
        this.field_j = true;
    }
}
