/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class sj extends fa {
    int field_m;
    tb field_k;
    volatile boolean field_n;
    sj field_l;

    abstract sj d();

    int c() {
        return 255;
    }

    abstract void a(int param0);

    final void a(int[] param0, int param1, int param2) {
        if (this.field_n) {
            this.b(param0, param1, param2);
        } else {
            this.a(param2);
        }
    }

    abstract void b(int[] param0, int param1, int param2);

    abstract int a();

    abstract sj b();

    protected sj() {
        this.field_n = true;
    }
}
