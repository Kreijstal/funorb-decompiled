/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class PcmStream extends IntrusiveNode {
    int field_j;
    volatile boolean field_k;
    PcmStream field_l;
    AbstractAudioSample field_m;

    abstract void b(int[] param0, int param1, int param2);

    abstract PcmStream b();

    int d() {
        return 255;
    }

    abstract PcmStream c();

    final void a(int[] param0, int param1, int param2) {
        if (this.field_k) {
          this.b(param0, param1, param2);
        } else {
          this.a(param2);
        }
    }

    abstract void a(int param0);

    abstract int a();

    protected PcmStream() {
        this.field_k = true;
    }
}
