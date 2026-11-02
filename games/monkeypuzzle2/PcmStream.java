/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class PcmStream extends IntrusiveNode {
    PcmStream field_g;
    AbstractAudioSample field_e;
    volatile boolean field_h;
    int field_f;

    abstract void a(int param0);

    final void a(int[] param0, int param1, int param2) {
        if (this.field_h) {
          this.b(param0, param1, param2);
        } else {
          this.a(param2);
        }
    }

    abstract PcmStream a();

    abstract void b(int[] param0, int param1, int param2);

    abstract PcmStream b();

    int c() {
        return 255;
    }

    abstract int d();

    PcmStream() {
        this.field_h = true;
    }
}
