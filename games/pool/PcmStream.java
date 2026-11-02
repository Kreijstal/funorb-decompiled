/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class PcmStream extends IntrusiveNode {
    PcmStream field_o;
    volatile boolean field_l;
    int field_m;
    AbstractAudioSample field_n;

    abstract int d();

    abstract PcmStream a();

    final void b(int[] param0, int param1, int param2) {
        if (this.field_l) {
          this.a(param0, param1, param2);
        } else {
          this.skip(param2);
        }
    }

    abstract void a(int[] param0, int param1, int param2);

    abstract void skip(int length);

    abstract PcmStream b();

    int c() {
        return 255;
    }

    protected PcmStream() {
        this.field_l = true;
    }
}
