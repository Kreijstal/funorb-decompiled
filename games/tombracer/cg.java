/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class cg extends vg {
    volatile boolean field_f;
    int field_h;
    ud field_i;
    cg field_g;

    int d() {
        return 255;
    }

    abstract void b(int[] param0, int param1, int param2);

    abstract cg b();

    abstract cg c();

    final void a(int[] param0, int param1, int param2) {
        if (((cg) this).field_f) {
            ((cg) this).b(param0, param1, param2);
        } else {
            ((cg) this).a(param2);
        }
    }

    abstract int a();

    abstract void a(int param0);

    protected cg() {
        ((cg) this).field_f = true;
    }
}
