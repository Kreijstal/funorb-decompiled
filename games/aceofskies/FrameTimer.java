/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class FrameTimer {
    static int rendererDefaultTextColor;
    static int field_b;
    private static String field_z;

    abstract long getDelayMillis(boolean param0);

    final int waitAndCountTicks(long param0, byte param1) {
        long var4 = this.getDelayMillis(false);
        int var6 = -1 % ((param1 + 69) / 33);
        if (0L >= var4) {
          return this.advanceTicks(param0, 0);
        }
        IntrusiveNode.sleepMillis(var4, false);
        return this.advanceTicks(param0, 0);
    }

    abstract void resetTiming(int param0);

    abstract int advanceTicks(long param0, int param1);

    static {
        field_z = "tf.A(";
        rendererDefaultTextColor = 0;
    }
}
