/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class PcmStream extends IntrusiveNode {
    volatile boolean field_j;
    PcmStream field_h;
    int field_k;
    AbstractAudioSample field_i;

    abstract void a(int param0);

    abstract PcmStream c();

    abstract void a(int[] param0, int param1, int param2);

    int b() {
        return 255;
    }

    final void b(int[] param0, int param1, int param2) {
        if (this.field_j) {
          this.a(param0, param1, param2);
        } else {
          this.a(param2);
        }
    }

    abstract int d();

    abstract PcmStream a();

    protected PcmStream() {
        this.field_j = true;
    }
}
