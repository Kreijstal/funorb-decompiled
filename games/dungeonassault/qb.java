/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class qb extends ne {
    int field_j;
    ap field_k;
    volatile boolean field_i;
    qb field_l;

    abstract qb c();

    final void a(int[] param0, int param1, int param2) {
        if (this.field_i) {
            this.b(param0, param1, param2);
        } else {
            this.a(param2);
        }
    }

    int b() {
        return 255;
    }

    abstract void a(int param0);

    abstract qb d();

    abstract void b(int[] param0, int param1, int param2);

    abstract int a();

    protected qb() {
        this.field_i = true;
    }
}
