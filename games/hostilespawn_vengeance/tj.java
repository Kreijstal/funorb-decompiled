/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class tj extends am {
    ef field_j;
    int field_i;
    volatile boolean field_h;
    tj field_k;

    abstract tj d();

    abstract void c(int param0);

    abstract void b(int[] param0, int param1, int param2);

    int a() {
        return 255;
    }

    abstract int c();

    final void a(int[] param0, int param1, int param2) {
        if (((tj) this).field_h) {
            ((tj) this).b(param0, param1, param2);
        } else {
            ((tj) this).c(param2);
        }
    }

    abstract tj b();

    protected tj() {
        ((tj) this).field_h = true;
    }
}
