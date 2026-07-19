/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class c extends rf {
    volatile boolean field_i;
    int field_g;
    c field_h;
    gk field_f;

    abstract int b();

    final void b(int[] param0, int param1, int param2) {
        if (this.field_i) {
            this.a(param0, param1, param2);
        } else {
            this.a(param2);
        }
    }

    abstract void a(int[] param0, int param1, int param2);

    abstract c c();

    abstract void a(int param0);

    abstract c a();

    c() {
        this.field_i = true;
    }

    int d() {
        return 255;
    }
}
