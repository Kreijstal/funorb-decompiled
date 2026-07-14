/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class fh extends ug {
    fh field_g;
    jl field_e;
    volatile boolean field_h;
    int field_f;

    abstract void a(int param0);

    final void a(int[] param0, int param1, int param2) {
        if (((fh) this).field_h) {
            ((fh) this).b(param0, param1, param2);
        } else {
            ((fh) this).a(param2);
        }
    }

    abstract fh a();

    abstract void b(int[] param0, int param1, int param2);

    abstract fh b();

    int c() {
        return 255;
    }

    abstract int d();

    fh() {
        ((fh) this).field_h = true;
    }
}
