/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class gf extends rk {
    int field_m;
    gf field_p;
    ob field_n;
    volatile boolean field_o;

    abstract gf a();

    abstract gf d();

    abstract void a(int[] param0, int param1, int param2);

    abstract int c();

    final void b(int[] param0, int param1, int param2) {
        if (((gf) this).field_o) {
            ((gf) this).a(param0, param1, param2);
        } else {
            ((gf) this).b(param2);
        }
    }

    abstract void b(int param0);

    int b() {
        return 255;
    }

    gf() {
        ((gf) this).field_o = true;
    }
}
