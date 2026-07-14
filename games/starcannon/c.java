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
        if (((c) this).field_i) {
            ((c) this).a(param0, param1, param2);
        } else {
            ((c) this).a(param2);
        }
    }

    abstract void a(int[] param0, int param1, int param2);

    abstract c c();

    abstract void a(int param0);

    abstract c a();

    c() {
        ((c) this).field_i = true;
    }

    int d() {
        return 255;
    }
}
