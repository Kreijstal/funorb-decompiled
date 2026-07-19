/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class qd extends da {
    se field_k;
    volatile boolean field_j;
    qd field_i;
    int field_l;

    abstract qd c();

    abstract int a();

    final void a(int[] param0, int param1, int param2) {
        if (this.field_j) {
            this.b(param0, param1, param2);
        } else {
            this.a(param2);
        }
    }

    abstract void a(int param0);

    int d() {
        return 255;
    }

    abstract void b(int[] param0, int param1, int param2);

    abstract qd b();

    protected qd() {
        this.field_j = true;
    }
}
