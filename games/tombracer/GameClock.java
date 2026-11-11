/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class GameClock {
    private static String[] field_a;
    static boolean field_b;

    final int waitAndAdvance(byte param0, long param1) {
        long var4 = this.getMillisUntilNextTick((byte) 47);
        if (var4 > 0L) {
          TrapSpawner.sleepMillis(0, var4);
          if (param0 > 3) {
            return this.advanceTicks(param1, 0);
          }
          return 67;
        }
        if (param0 > 3) {
          return this.advanceTicks(param1, 0);
        }
        return 67;
    }

    abstract void resetTiming(int param0);

    final static void sendRatingTableRequest(RatingTable param0, int param1, int param2) {
        BitPacketBuffer var3 = null;
        try {
          var3 = ql.field_k;
          var3.writeCipheredOpcode(param1, -2988);
          var3.writeByte(param0.field_n, 0);
          if (param2 != 2147) {
            field_a = (String[]) null;
          }
          var3.writeByte(param0.field_k, param2 - 2147);
        } catch (RuntimeException runtimeException) {
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "ip.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    abstract int advanceTicks(long param0, int param1);

    abstract long getMillisUntilNextTick(byte param0);

    public static void releaseStatics(int param0) {
        field_a = null;
        int var1 = 63 / ((-11 - param0) / 48);
    }

    static {
        field_a = new String[1];
        field_a[0] = "Trap Spawner";
    }
}
