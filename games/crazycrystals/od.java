/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class od extends jb {
    int field_g;
    volatile boolean field_f;
    od field_i;
    cg field_h;

    abstract int c();

    abstract od a();

    abstract od d();

    abstract void a(int[] param0, int param1, int param2);

    abstract void a(int param0);

    final void b(int[] param0, int param1, int param2) {
        if (this.field_f) {
            this.a(param0, param1, param2);
        } else {
            this.a(param2);
        }
    }

    int b() {
        return 255;
    }

    protected od() {
        this.field_f = true;
    }
}
