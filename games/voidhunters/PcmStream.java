/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class PcmStream extends IntrusiveNode {
    PcmStream schedulerNext;
    volatile boolean active;
    int schedulingPriority;
    SoundNode sound;

    int getPriority() {
        return 255;
    }

    abstract PcmStream nextSubStream();

    abstract void mix(int[] param0, int param1, int param2);

    abstract PcmStream firstSubStream();

    abstract int getActivityWeight();

    abstract void skip(int param0);

    final void process(int[] param0, int param1, int param2) {
        if (this.active) {
          this.mix(param0, param1, param2);
        } else {
          this.skip(param2);
        }
    }

    protected PcmStream() {
        this.active = true;
    }
}
