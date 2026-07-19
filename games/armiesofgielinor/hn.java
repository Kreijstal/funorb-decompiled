/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class hn extends tc {
    int field_n;
    hn field_k;
    volatile boolean field_l;
    ow field_m;

    abstract hn b();

    abstract hn a();

    abstract int c();

    final void a(int[] param0, int param1, int param2) {
        if (this.field_l) {
            this.b(param0, param1, param2);
        } else {
            this.a(param2);
        }
    }

    abstract void b(int[] param0, int param1, int param2);

    abstract void a(int param0);

    protected hn() {
        this.field_l = true;
    }

    int d() {
        return 255;
    }
}
