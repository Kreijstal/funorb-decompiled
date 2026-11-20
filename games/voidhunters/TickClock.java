/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class TickClock {
    static int field_a;
    static boolean field_b;
    private static String field_z;

    final int waitForTicks(boolean param0, long param1) {
        long var4 = 0L;
        if (!param0) {
          var4 = this.getSleepMillis((byte) -81);
          if (0L < var4) {
            BufferedFile.sleep(-96, var4);
          }
          return this.advanceTicks(0, param1);
        }
        return 36;
    }

    abstract long getSleepMillis(byte param0);

    abstract void reset(int param0);

    abstract int advanceTicks(int param0, long param1);

    static {
        field_z = "hrb.C(";
        field_a = 92;
    }
}
