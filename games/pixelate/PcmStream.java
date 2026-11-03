/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class PcmStream extends IntrusiveNode {
    int field_m;
    AbstractPcmSample field_k;
    volatile boolean field_n;
    PcmStream field_l;

    abstract PcmStream nextSubStream();

    int priority() {
        return 255;
    }

    abstract void skip(int param0);

    final void process(int[] param0, int param1, int param2) {
        if (this.field_n) {
          this.mixInto(param0, param1, param2);
        } else {
          this.skip(param2);
        }
    }

    abstract void mixInto(int[] param0, int param1, int param2);

    abstract int activity();

    abstract PcmStream firstSubStream();

    protected PcmStream() {
        this.field_n = true;
    }
}
