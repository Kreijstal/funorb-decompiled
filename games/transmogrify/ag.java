/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ag extends wf {
    int field_j;
    volatile boolean field_h;
    fh field_g;
    ag field_i;

    abstract ag a();

    abstract void b(int[] param0, int param1, int param2);

    abstract void d(int param0);

    int c() {
        return 255;
    }

    abstract int b();

    final void a(int[] param0, int param1, int param2) {
        if (((ag) this).field_h) {
            ((ag) this).b(param0, param1, param2);
        } else {
            ((ag) this).d(param2);
        }
    }

    abstract ag d();

    protected ag() {
        ((ag) this).field_h = true;
    }
}
