/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class wg extends hg {
    int field_j;
    nh field_g;
    volatile boolean field_i;
    wg field_h;

    abstract wg c();

    final void a(int[] param0, int param1, int param2) {
        if (((wg) this).field_i) {
            ((wg) this).b(param0, param1, param2);
        } else {
            ((wg) this).d(param2);
        }
    }

    abstract wg b();

    abstract int a();

    abstract void b(int[] param0, int param1, int param2);

    int d() {
        return 255;
    }

    abstract void d(int param0);

    protected wg() {
        ((wg) this).field_i = true;
    }
}
