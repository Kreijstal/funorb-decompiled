/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class PcmStream extends IntrusiveNode {
    PcmStream field_j;
    int field_m;
    volatile boolean field_k;
    pb field_l;

    abstract void a(int[] param0, int param1, int param2);

    abstract void skip(int sampleCount);

    final void mixOrSkip(int[] buffer, int offset, int length) {
        if (this.field_k) {
          this.a(buffer, offset, length);
        } else {
          this.skip(length);
        }
    }

    int c() {
        return 255;
    }

    abstract PcmStream b();

    abstract PcmStream a();

    abstract int d();

    protected PcmStream() {
        this.field_k = true;
    }
}
