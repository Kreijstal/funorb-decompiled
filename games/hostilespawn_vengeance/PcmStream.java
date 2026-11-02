/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class PcmStream extends IntrusiveNode {
    ef field_j;
    int field_i;
    volatile boolean field_h;
    PcmStream field_k;

    abstract PcmStream d();

    abstract void c(int param0);

    abstract void b(int[] param0, int param1, int param2);

    int a() {
        return 255;
    }

    abstract int c();

    final void a(int[] param0, int param1, int param2) {
        if (this.field_h) {
          this.b(param0, param1, param2);
        } else {
          this.c(param2);
        }
    }

    abstract PcmStream b();

    protected PcmStream() {
        this.field_h = true;
    }
}
