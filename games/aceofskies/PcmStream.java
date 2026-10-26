/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class PcmStream extends IntrusiveNode {
    PcmStream field_e;
    gs field_f;
    volatile boolean field_g;
    int field_h;

    abstract void b(int[] param0, int param1, int param2);

    abstract PcmStream b();

    abstract int d();

    abstract void a(int param0);

    int c() {
        return 255;
    }

    abstract PcmStream a();

    protected PcmStream() {
        this.field_g = true;
    }

    final void a(int[] param0, int param1, int param2) {
        if (this.field_g) {
          this.b(param0, param1, param2);
        } else {
          this.a(param2);
        }
    }
}
