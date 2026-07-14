/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class we extends ck {
    volatile boolean field_p;
    md field_r;
    int field_q;
    we field_o;

    abstract we d();

    abstract void a(int[] param0, int param1, int param2);

    final void b(int[] param0, int param1, int param2) {
        if (((we) this).field_p) {
            ((we) this).a(param0, param1, param2);
        } else {
            ((we) this).d(param2);
        }
    }

    abstract we b();

    int c() {
        return 255;
    }

    abstract int a();

    abstract void d(int param0);

    protected we() {
        ((we) this).field_p = true;
    }
}
