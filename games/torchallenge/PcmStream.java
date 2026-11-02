/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class PcmStream extends IntrusiveNode {
    se field_k;
    volatile boolean active;
    PcmStream schedulerNext;
    int field_l;

    abstract PcmStream firstSubstream();

    abstract int activity();

    final void process(int[] param0, int param1, int param2) {
        if (this.active) {
          this.mixInto(param0, param1, param2);
        } else {
          this.skip(param2);
        }
    }

    abstract void skip(int param0);

    int priority() {
        return 255;
    }

    abstract void mixInto(int[] param0, int param1, int param2);

    abstract PcmStream nextSubstream();

    protected PcmStream() {
        this.active = true;
    }
}
