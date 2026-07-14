/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class lq extends gn {
    int field_g;
    lq field_f;
    dm field_h;
    volatile boolean field_e;

    abstract void a(int[] param0, int param1, int param2);

    abstract void a(int param0);

    int a() {
        return 255;
    }

    abstract lq c();

    final void b(int[] param0, int param1, int param2) {
        if (((lq) this).field_e) {
            ((lq) this).a(param0, param1, param2);
        } else {
            ((lq) this).a(param2);
        }
    }

    abstract lq b();

    abstract int d();

    protected lq() {
        ((lq) this).field_e = true;
    }
}
