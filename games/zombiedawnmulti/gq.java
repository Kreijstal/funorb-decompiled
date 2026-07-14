/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class gq extends br {
    lg field_i;
    volatile boolean field_f;
    int field_g;
    gq field_h;

    int c() {
        return 255;
    }

    abstract int a();

    final void a(int[] param0, int param1, int param2) {
        if (((gq) this).field_f) {
            ((gq) this).b(param0, param1, param2);
        } else {
            ((gq) this).a(param2);
        }
    }

    abstract gq d();

    abstract void a(int param0);

    abstract void b(int[] param0, int param1, int param2);

    abstract gq b();

    protected gq() {
        ((gq) this).field_f = true;
    }
}
