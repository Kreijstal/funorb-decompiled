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
        if (this.field_j) {
            this.b(param0, param1, param2);
        } else {
            this.a(param2);
        }
    }

    abstract int b();

    protected qd() {
        this.field_j = true;
    }

    abstract void a(int param0);
}
