/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class in extends l {
    tj field_j;
    int field_i;
    volatile boolean field_g;
    in field_h;

    int a() {
        return 255;
    }

    abstract int d();

    abstract void b(int[] param0, int param1, int param2);

    final void a(int[] param0, int param1, int param2) {
        if (((in) this).field_g) {
            ((in) this).b(param0, param1, param2);
        } else {
            ((in) this).a(param2);
        }
    }

    protected in() {
        ((in) this).field_g = true;
    }

    abstract void a(int param0);

    abstract in c();

    abstract in b();
}
