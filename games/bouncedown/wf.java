/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class wf extends ai {
    ic field_j;
    wf field_h;
    volatile boolean field_i;
    int field_g;

    abstract void a(int[] param0, int param1, int param2);

    abstract void a(int param0);

    int a() {
        return 255;
    }

    final void b(int[] param0, int param1, int param2) {
        if (this.field_i) {
            this.a(param0, param1, param2);
        } else {
            this.a(param2);
        }
    }

    abstract wf c();

    abstract int b();

    abstract wf d();

    protected wf() {
        this.field_i = true;
    }
}
