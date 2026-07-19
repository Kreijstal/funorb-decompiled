/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class sh extends lh {
    sh field_l;
    jf field_i;
    volatile boolean field_j;
    int field_k;

    int b() {
        return 255;
    }

    abstract void b(int[] param0, int param1, int param2);

    abstract int a();

    abstract sh d();

    abstract void a(int param0);

    final void a(int[] param0, int param1, int param2) {
        if (this.field_j) {
            this.b(param0, param1, param2);
        } else {
            this.a(param2);
        }
    }

    abstract sh c();

    protected sh() {
        this.field_j = true;
    }
}
