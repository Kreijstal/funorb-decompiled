/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class nm extends o {
    nm field_j;
    int field_m;
    volatile boolean field_k;
    pb field_l;

    abstract void a(int[] param0, int param1, int param2);

    abstract void a(int param0);

    final void b(int[] param0, int param1, int param2) {
        if (((nm) this).field_k) {
            ((nm) this).a(param0, param1, param2);
        } else {
            ((nm) this).a(param2);
        }
    }

    int c() {
        return 255;
    }

    abstract nm b();

    abstract nm a();

    abstract int d();

    protected nm() {
        ((nm) this).field_k = true;
    }
}
