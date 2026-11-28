/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class FrameTimer {
    static int field_b;
    static int field_a;

    final int waitAndCountTicks(long param0, int param1) {
        long var4 = this.getDelayMillis(-43);
        if (var4 > 0L) {
          em.sleepMillis(var4, false);
          if (param1 != -128) {
            this.waitAndCountTicks(31L, -83);
            return this.advanceTicks(param0, (byte) 37);
          }
          return this.advanceTicks(param0, (byte) 37);
        }
        if (param1 == -128) {
          return this.advanceTicks(param0, (byte) 37);
        }
        this.waitAndCountTicks(31L, -83);
        return this.advanceTicks(param0, (byte) 37);
    }

    abstract int advanceTicks(long param0, byte param1);

    abstract long getDelayMillis(int param0);

    abstract void resetTiming(boolean param0);

    final static char decodeCp1252Byte(int param0, byte param1) {
        int var2;
        int var3;
        int var2Lifetime1;
        int var3Lifetime1;
        var2 = param1 & 255;
        if (param0 != 16) {
          FrameTimer.decodeCp1252Byte(-100, (byte) -72);
          if (var2 == 0) {
            throw new IllegalArgumentException("" + Integer.toString(var2, 16));
          }
          if (128 > var2) {
            return (char)var2;
          }
          if (var2 < 160) {
            var3 = sb.field_n[-128 + var2];
            if (var3 == 0) {
              var3 = 63;
            }
            var2 = var3;
          }
          return (char)var2;
        }
        if (var2 == 0) {
          throw new IllegalArgumentException("" + Integer.toString(var2, 16));
        }
        if (128 > var2) {
          return (char)var2;
        }
        if (var2 >= 160) {
          return (char)var2;
        }
        var3Lifetime1 = sb.field_n[-128 + var2];
        if (var3Lifetime1 == 0) {
          var3Lifetime1 = 63;
        }
        var2Lifetime1 = var3Lifetime1;
        return (char)var2Lifetime1;
    }

    static {
    }
}
