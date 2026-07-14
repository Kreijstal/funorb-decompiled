/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class eb extends mc {
    eb field_n;
    int field_o;
    ff field_p;
    volatile boolean field_q;

    abstract eb c();

    abstract void b(int[] param0, int param1, int param2);

    int d() {
        return 255;
    }

    abstract void a(int param0);

    abstract int a();

    abstract eb b();

    final void a(int[] param0, int param1, int param2) {
        if (((eb) this).field_q) {
            ((eb) this).b(param0, param1, param2);
        } else {
            ((eb) this).a(param2);
        }
    }

    protected eb() {
        ((eb) this).field_q = true;
    }
}
