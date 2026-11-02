/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class PcmStream extends IntrusiveNode {
    int field_k;
    PcmStream field_m;
    rr field_l;
    volatile boolean field_n;

    abstract PcmStream c();

    abstract int d();

    abstract PcmStream a();

    abstract void b(int[] param0, int param1, int param2);

    final void a(int[] param0, int param1, int param2) {
        if (this.field_n) {
          this.b(param0, param1, param2);
        } else {
          this.a(param2);
        }
    }

    int b() {
        return 255;
    }

    abstract void a(int param0);

    protected PcmStream() {
        this.field_n = true;
    }
}
