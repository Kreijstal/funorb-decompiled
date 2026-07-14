/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ic extends gi {
    int field_k;
    me field_i;
    ic field_j;
    volatile boolean field_h;

    abstract int d();

    int b() {
        return 255;
    }

    abstract void b(int[] param0, int param1, int param2);

    abstract ic a();

    abstract ic c();

    abstract void d(int param0);

    final void a(int[] param0, int param1, int param2) {
        if (((ic) this).field_h) {
            ((ic) this).b(param0, param1, param2);
        } else {
            ((ic) this).d(param2);
        }
    }

    protected ic() {
        ((ic) this).field_h = true;
    }
}
