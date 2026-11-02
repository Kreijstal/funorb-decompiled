/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class PcmStream extends IntrusiveNode {
    AbstractAudioSample field_h;
    volatile boolean field_f;
    int field_i;
    PcmStream field_g;

    abstract void a(int param0);

    abstract PcmStream a();

    abstract void a(int[] param0, int param1, int param2);

    int getPriority() {
        return 255;
    }

    abstract PcmStream b();

    protected PcmStream() {
        this.field_f = true;
    }

    abstract int d();

    final void b(int[] param0, int param1, int param2) {
        if (this.field_f) {
          this.a(param0, param1, param2);
        } else {
          this.a(param2);
        }
    }
}
