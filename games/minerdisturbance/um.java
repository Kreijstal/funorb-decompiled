/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class um extends pi {
    volatile boolean field_n;
    int field_p;
    um field_o;
    gg field_q;

    abstract int d();

    abstract um c();

    final void b(int[] param0, int param1, int param2) {
        if (((um) this).field_n) {
            ((um) this).a(param0, param1, param2);
        } else {
            ((um) this).a(param2);
        }
    }

    abstract void a(int[] param0, int param1, int param2);

    int a() {
        return 255;
    }

    abstract um b();

    protected um() {
        ((um) this).field_n = true;
    }

    abstract void a(int param0);
}
