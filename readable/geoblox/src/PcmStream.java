/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class PcmStream extends IntrusiveNode {
    AbstractAudioSample field_g;
    PcmStream field_h;
    int field_i;
    volatile boolean field_f;

    abstract PcmStream b();

    abstract int d();

    abstract void b(int param0);

    abstract PcmStream c();

    int a() {
        return 255;
    }

    final void b(int[] param0, int param1, int param2) {
        if (this.field_f) {
            this.a(param0, param1, param2);
        } else {
            this.b(param2);
        }
    }

    abstract void a(int[] param0, int param1, int param2);

    protected PcmStream() {
        this.field_f = true;
    }
}
