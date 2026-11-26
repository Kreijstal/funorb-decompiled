/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class FrameTimer {
    static String field_b;
    static tj field_a;
    static String field_c;

    public static void clearStaticReferences(byte param0) {
        field_c = null;
        if (param0 > -106) {
          field_c = (String) null;
          field_a = null;
          field_b = null;
          return;
        }
        field_a = null;
        field_b = null;
    }

    abstract long getDelayMillis(int param0);

    abstract int advanceTicks(int param0, long param1);

    final int waitAndCountTicks(int param0, long param1) {
        long var4 = this.getDelayMillis(-32578);
        if (var4 <= (long)param0) {
          return this.advanceTicks(param0 ^ -127, param1);
        }
        SecondaryNodeDeque.sleepMillis(var4, 19406);
        return this.advanceTicks(param0 ^ -127, param1);
    }

    abstract void resetTiming(boolean param0);

    static {
        field_b = "Next";
        field_c = "Names cannot contain consecutive spaces";
    }
}
