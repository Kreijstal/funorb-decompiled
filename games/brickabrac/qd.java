/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class qd extends nm {
    el field_k;
    int field_i;
    qd field_l;
    volatile boolean field_j;

    abstract void b(int[] param0, int param1, int param2);

    int c() {
        return 255;
    }

    abstract qd d();

    abstract qd a();

    final void a(int[] param0, int param1, int param2) {
        if (((qd) this).field_j) {
            ((qd) this).b(param0, param1, param2);
        } else {
            ((qd) this).a(param2);
        }
    }

    abstract int b();

    protected qd() {
        ((qd) this).field_j = true;
    }

    abstract void a(int param0);
}
