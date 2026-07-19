/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class f extends ksa {
    f field_d;
    volatile boolean field_e;
    int field_f;
    dl field_g;

    int b() {
        return 255;
    }

    abstract f a();

    abstract void a(int[] param0, int param1, int param2);

    abstract f c();

    abstract int d();

    abstract void a(int param0);

    final void b(int[] param0, int param1, int param2) {
        if (this.field_e) {
            this.a(param0, param1, param2);
        } else {
            this.a(param2);
        }
    }

    protected f() {
        this.field_e = true;
    }
}
