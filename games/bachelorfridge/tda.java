/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class tda extends bw {
    lj field_h;
    volatile boolean field_f;
    int field_i;
    tda field_g;

    abstract void a(int param0);

    abstract tda a();

    abstract void a(int[] param0, int param1, int param2);

    int c() {
        return 255;
    }

    abstract tda b();

    protected tda() {
        this.field_f = true;
    }

    abstract int d();

    final void b(int[] param0, int param1, int param2) {
        if (this.field_f) {
            this.a(param0, param1, param2);
        } else {
            this.a(param2);
        }
    }
}
