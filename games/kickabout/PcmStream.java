/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class PcmStream extends IntrusiveNode {
    int schedulingPriority;
    PcmStream nextScheduledStream;
    AbstractPcmSample field_h;
    volatile boolean active;

    abstract void mixInto(int[] param0, int param1, int param2);

    abstract void skipFrames(int param0);

    int getSchedulingPriority() {
        return 255;
    }

    abstract PcmStream firstSubstream();

    final void processFrames(int[] param0, int param1, int param2) {
        if (this.active) {
          this.mixInto(param0, param1, param2);
        } else {
          this.skipFrames(param2);
        }
    }

    abstract PcmStream nextSubstream();

    abstract int getSchedulingCost();

    protected PcmStream() {
        this.active = true;
    }
}
