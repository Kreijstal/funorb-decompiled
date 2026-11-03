/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class PcmStream extends IntrusiveNode {
    int field_g;
    PcmStream field_f;
    AbstractPcmSample field_h;
    volatile boolean field_e;

    abstract void mixInto(int[] param0, int param1, int param2);

    abstract void skipFrames(int param0);

    int a() {
        return 255;
    }

    abstract PcmStream c();

    final void b(int[] param0, int param1, int param2) {
        if (this.field_e) {
          this.mixInto(param0, param1, param2);
        } else {
          this.skipFrames(param2);
        }
    }

    abstract PcmStream b();

    abstract int d();

    protected PcmStream() {
        this.field_e = true;
    }
}
