/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class PcmStream extends IntrusiveNode {
    int field_o;
    AbstractAudioSample sample;
    volatile boolean field_p;
    PcmStream field_q;

    abstract int d();

    abstract PcmStream a();

    int b() {
        return 255;
    }

    final void a(int[] param0, int param1, int param2) {
        if (this.field_p) {
          this.b(param0, param1, param2);
        } else {
          this.a(param2);
        }
    }

    abstract void a(int param0);

    abstract void b(int[] param0, int param1, int param2);

    abstract PcmStream c();

    protected PcmStream() {
        this.field_p = true;
    }
}
