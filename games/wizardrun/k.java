/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class k extends wl {
    k field_j;
    int field_l;
    kf field_k;
    volatile boolean field_i;

    abstract void a(int[] param0, int param1, int param2);

    final void b(int[] param0, int param1, int param2) {
        if (((k) this).field_i) {
            ((k) this).a(param0, param1, param2);
        } else {
            ((k) this).a(param2);
        }
    }

    abstract void a(int param0);

    abstract k a();

    abstract k c();

    int b() {
        return 255;
    }

    abstract int d();

    protected k() {
        ((k) this).field_i = true;
    }
}
