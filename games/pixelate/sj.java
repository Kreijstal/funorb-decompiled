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
        if (((sj) this).field_n) {
            ((sj) this).b(param0, param1, param2);
        } else {
            ((sj) this).a(param2);
        }
    }

    abstract void b(int[] param0, int param1, int param2);

    abstract int a();

    abstract sj b();

    protected sj() {
        ((sj) this).field_n = true;
    }
}
