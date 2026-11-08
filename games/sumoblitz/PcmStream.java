/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class PcmStream extends IntrusiveNode {
    int field_k;
    PcmStream field_m;
    AbstractAudioSample sample;
    volatile boolean active;

    abstract PcmStream nextSubstream();

    abstract int activityWeight();

    abstract PcmStream firstSubstream();

    abstract void mixInto(int[] param0, int param1, int param2);

    final void mixOrSkip(int[] param0, int param1, int param2) {
        if (this.active) {
          this.mixInto(param0, param1, param2);
        } else {
          this.skip(param2);
        }
    }

    int priority() {
        return 255;
    }

    abstract void skip(int param0);

    protected PcmStream() {
        this.active = true;
    }
}
