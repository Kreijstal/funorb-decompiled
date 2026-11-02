/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class PcmStream extends IntrusiveNode {
    PcmStream field_i;
    int field_j;
    volatile boolean field_k;
    nl field_h;

    abstract PcmStream a();

    final void b(int[] param0, int param1, int param2) {
        if (this.field_k) {
          this.a(param0, param1, param2);
        } else {
          this.a(param2);
        }
    }

    abstract void a(int param0);

    abstract PcmStream b();

    int c() {
        return 255;
    }

    abstract void a(int[] param0, int param1, int param2);

    protected PcmStream() {
        this.field_k = true;
    }

    abstract int d();
}
