/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class PcmStream extends IntrusiveNode {
    PcmStream field_n;
    int field_o;
    AbstractAudioSample field_p;
    volatile boolean field_q;

    abstract PcmStream nextSubStream();

    abstract void mixInto(int[] param0, int param1, int param2);

    int priority() {
        return 255;
    }

    abstract void skipFrames(int param0);

    abstract int activity();

    abstract PcmStream firstSubStream();

    final void process(int[] param0, int param1, int param2) {
        if (this.field_q) {
          this.mixInto(param0, param1, param2);
        } else {
          this.skipFrames(param2);
        }
    }

    protected PcmStream() {
        this.field_q = true;
    }
}
