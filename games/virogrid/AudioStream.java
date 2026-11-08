/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class AudioStream extends IntrusiveNode {
    tj field_j;
    int field_i;
    volatile boolean field_g;
    AudioStream field_h;

    int priority() {
        return 255;
    }

    abstract int activity();

    abstract void mixInto(int[] param0, int param1, int param2);

    final void a(int[] param0, int param1, int param2) {
        if (this.field_g) {
          this.mixInto(param0, param1, param2);
        } else {
          this.skipFrames(param2);
        }
    }

    protected AudioStream() {
        this.field_g = true;
    }

    abstract void skipFrames(int param0);

    abstract AudioStream firstSubStream();

    abstract AudioStream nextSubStream();
}
