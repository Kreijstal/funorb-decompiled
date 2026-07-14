/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class hj extends ms {
    int field_k;
    hj field_m;
    rr field_l;
    volatile boolean field_n;

    abstract hj c();

    abstract int d();

    abstract hj a();

    abstract void b(int[] param0, int param1, int param2);

    final void a(int[] param0, int param1, int param2) {
        if (((hj) this).field_n) {
            ((hj) this).b(param0, param1, param2);
        } else {
            ((hj) this).a(param2);
        }
    }

    int b() {
        return 255;
    }

    abstract void a(int param0);

    protected hj() {
        ((hj) this).field_n = true;
    }
}
