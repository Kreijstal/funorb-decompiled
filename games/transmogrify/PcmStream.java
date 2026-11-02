/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class PcmStream extends IntrusiveNode {
    int field_j;
    volatile boolean field_h;
    fh field_g;
    PcmStream field_i;

    abstract PcmStream a();

    abstract void b(int[] param0, int param1, int param2);

    abstract void d(int param0);

    int c() {
        return 255;
    }

    abstract int b();

    final void a(int[] param0, int param1, int param2) {
        if (this.field_h) {
          this.b(param0, param1, param2);
        } else {
          this.d(param2);
        }
    }

    abstract PcmStream d();

    protected PcmStream() {
        this.field_h = true;
    }
}
