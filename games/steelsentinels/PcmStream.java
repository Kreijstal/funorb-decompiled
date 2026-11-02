/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class PcmStream extends IntrusiveNode {
    volatile boolean field_p;
    AbstractPcmSample field_r;
    int field_q;
    PcmStream field_o;

    abstract PcmStream firstSubstream();

    abstract void mixInto(int[] param0, int param1, int param2);

    final void process(int[] param0, int param1, int param2) {
        if (this.field_p) {
          this.mixInto(param0, param1, param2);
        } else {
          this.skipFrames(param2);
        }
    }

    abstract PcmStream nextSubstream();

    int priority() {
        return 255;
    }

    abstract int activity();

    abstract void skipFrames(int param0);

    protected PcmStream() {
        this.field_p = true;
    }
}
