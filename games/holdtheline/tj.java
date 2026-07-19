/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class tj extends hl {
    tj field_k;
    eh field_i;
    int field_j;
    volatile boolean field_l;

    int d() {
        return 255;
    }

    abstract void b(int[] param0, int param1, int param2);

    abstract tj b();

    abstract int c();

    abstract void a(int param0);

    abstract tj a();

    final void a(int[] param0, int param1, int param2) {
        if (this.field_l) {
            this.b(param0, param1, param2);
        } else {
            this.a(param2);
        }
    }

    protected tj() {
        this.field_l = true;
    }
}
