/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class rf extends wf {
    rf field_e;
    gs field_f;
    volatile boolean field_g;
    int field_h;

    abstract void b(int[] param0, int param1, int param2);

    abstract rf b();

    abstract int d();

    abstract void a(int param0);

    int c() {
        return 255;
    }

    abstract rf a();

    protected rf() {
        ((rf) this).field_g = true;
    }

    final void a(int[] param0, int param1, int param2) {
        if (((rf) this).field_g) {
            ((rf) this).b(param0, param1, param2);
        } else {
            ((rf) this).a(param2);
        }
    }
}
