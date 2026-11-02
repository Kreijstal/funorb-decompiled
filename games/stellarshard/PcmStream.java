/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class PcmStream extends IntrusiveNode {
    AbstractAudioSample field_l;
    PcmStream field_k;
    volatile boolean field_m;
    int field_n;

    int a() {
        return 255;
    }

    abstract void b(int[] param0, int param1, int param2);

    final void a(int[] param0, int param1, int param2) {
        if (this.field_m) {
          this.b(param0, param1, param2);
        } else {
          this.a(param2);
        }
    }

    abstract PcmStream c();

    abstract void a(int param0);

    abstract PcmStream d();

    abstract int b();

    PcmStream() {
        this.field_m = true;
    }
}
