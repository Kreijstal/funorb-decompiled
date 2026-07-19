/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class kd extends ma {
    kd field_o;
    volatile boolean field_l;
    int field_m;
    qm field_n;

    abstract int d();

    abstract kd a();

    final void b(int[] param0, int param1, int param2) {
        if (this.field_l) {
            this.a(param0, param1, param2);
        } else {
            this.a(param2);
        }
    }

    abstract void a(int[] param0, int param1, int param2);

    abstract void a(int param0);

    abstract kd b();

    int c() {
        return 255;
    }

    protected kd() {
        this.field_l = true;
    }
}
