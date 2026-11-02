/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class PcmStream extends IntrusiveNode {
    volatile boolean field_n;
    int field_p;
    PcmStream field_o;
    gg field_q;

    abstract int d();

    abstract PcmStream c();

    final void b(int[] param0, int param1, int param2) {
        if (this.field_n) {
          this.a(param0, param1, param2);
        } else {
          this.a(param2);
        }
    }

    abstract void a(int[] param0, int param1, int param2);

    int a() {
        return 255;
    }

    abstract PcmStream b();

    protected PcmStream() {
        this.field_n = true;
    }

    abstract void a(int param0);
}
