/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ol extends bh {
    ti field_q;
    ol field_o;
    int field_n;
    volatile boolean field_p;

    int b() {
        return 255;
    }

    final void a(int[] param0, int param1, int param2) {
        if (this.field_p) {
            this.b(param0, param1, param2);
        } else {
            this.a(param2);
        }
    }

    abstract ol d();

    abstract int a();

    abstract void b(int[] param0, int param1, int param2);

    abstract ol c();

    ol() {
        this.field_p = true;
    }

    abstract void a(int param0);
}
