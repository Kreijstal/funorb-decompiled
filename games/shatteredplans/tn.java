/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class tn extends oh {
    int field_i;
    volatile boolean field_j;
    tn field_h;
    pq field_k;

    abstract void b(int[] param0, int param1, int param2);

    final void a(int[] param0, int param1, int param2) {
        if (this.field_j) {
            this.b(param0, param1, param2);
        } else {
            this.a(param2);
        }
    }

    abstract void a(int param0);

    abstract tn b();

    abstract int a();

    abstract tn d();

    protected tn() {
        this.field_j = true;
    }

    int c() {
        return 255;
    }
}
