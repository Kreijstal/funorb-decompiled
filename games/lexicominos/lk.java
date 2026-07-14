/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class lk extends kd {
    volatile boolean field_j;
    kh field_k;
    lk field_i;
    int field_h;

    final void a(int[] param0, int param1, int param2) {
        if (((lk) this).field_j) {
            ((lk) this).b(param0, param1, param2);
        } else {
            ((lk) this).a(param2);
        }
    }

    abstract int a();

    abstract void b(int[] param0, int param1, int param2);

    abstract void a(int param0);

    abstract lk b();

    abstract lk d();

    int c() {
        return 255;
    }

    protected lk() {
        ((lk) this).field_j = true;
    }
}
