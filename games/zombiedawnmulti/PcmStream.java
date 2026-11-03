/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class PcmStream extends IntrusiveNode {
    AbstractAudioSample field_i;
    volatile boolean field_f;
    int field_g;
    PcmStream field_h;

    int c() {
        return 255;
    }

    abstract int a();

    final void a(int[] param0, int param1, int param2) {
        if (this.field_f) {
          this.b(param0, param1, param2);
        } else {
          this.skip(param2);
        }
    }

    abstract PcmStream d();

    abstract void skip(int param0);

    abstract void b(int[] param0, int param1, int param2);

    abstract PcmStream firstSubStream();

    protected PcmStream() {
        this.field_f = true;
    }
}
