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
        if (((tj) this).field_l) {
            ((tj) this).b(param0, param1, param2);
        } else {
            ((tj) this).a(param2);
        }
    }

    protected tj() {
        ((tj) this).field_l = true;
    }
}
