/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class kd extends gg {
    gb field_l;
    kd field_k;
    volatile boolean field_m;
    int field_n;

    int a() {
        return 255;
    }

    abstract void b(int[] param0, int param1, int param2);

    final void a(int[] param0, int param1, int param2) {
        if (((kd) this).field_m) {
            ((kd) this).b(param0, param1, param2);
        } else {
            ((kd) this).a(param2);
        }
    }

    abstract kd c();

    abstract void a(int param0);

    abstract kd d();

    abstract int b();

    kd() {
        ((kd) this).field_m = true;
    }
}
