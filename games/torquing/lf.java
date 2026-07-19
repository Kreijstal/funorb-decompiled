/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class lf extends q {
    int field_j;
    volatile boolean field_k;
    lf field_l;
    fb field_m;

    abstract void b(int[] param0, int param1, int param2);

    abstract lf b();

    int d() {
        return 255;
    }

    abstract lf c();

    final void a(int[] param0, int param1, int param2) {
        if (this.field_k) {
            this.b(param0, param1, param2);
        } else {
            this.a(param2);
        }
    }

    abstract void a(int param0);

    abstract int a();

    protected lf() {
        this.field_k = true;
    }
}
