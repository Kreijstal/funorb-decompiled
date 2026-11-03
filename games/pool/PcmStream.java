/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class PcmStream extends IntrusiveNode {
    PcmStream field_o;
    volatile boolean field_l;
    int field_m;
    AbstractAudioSample field_n;

    abstract int getSchedulingCost();

    abstract PcmStream firstChildStream();

    final void process(int[] param0, int param1, int param2) {
        if (this.field_l) {
          this.mixInto(param0, param1, param2);
        } else {
          this.skip(param2);
        }
    }

    abstract void mixInto(int[] param0, int param1, int param2);

    abstract void skip(int length);

    abstract PcmStream nextChildStream();

    int priority() {
        return 255;
    }

    protected PcmStream() {
        this.field_l = true;
    }
}
