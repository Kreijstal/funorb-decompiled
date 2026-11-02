/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class PcmStream extends IntrusiveNode {
    int field_k;
    me field_i;
    PcmStream field_j;
    volatile boolean field_h;

    abstract int d();

    int b() {
        return 255;
    }

    abstract void b(int[] param0, int param1, int param2);

    abstract PcmStream a();

    abstract PcmStream c();

    abstract void d(int param0);

    final void a(int[] param0, int param1, int param2) {
        if (this.field_h) {
          this.b(param0, param1, param2);
        } else {
          this.d(param2);
        }
    }

    protected PcmStream() {
        this.field_h = true;
    }
}
