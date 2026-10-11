/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tg {
    static String field_a;
    static int[] field_b;
    static jea field_c;

    final static short a(byte param0, int param1) {
        int var6 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var7 = 0;
        int var6Lifetime1;
        int var2Lifetime1;
        int var3Lifetime1;
        int var4Lifetime1;
        int var5Lifetime1;
        int var7Lifetime1;
        if (param0 <= -101) {
          var2 = (param1 & 65427) >> 10;
          var3 = 112 & param1 >> 3;
          var4 = 127 & param1;
          var3 = var4 > 64 ? (127 - var4) * var3 >> 7 : var3 * var4 >> 7;
          var5 = var4 + var3;
          if (0 == var5) {
            var6 = var3 << 1;
          } else {
            var6 = (var3 << 8) / var5;
          }
          var7 = var5;
          return (short)(var7 | (var2 << 10 | var6 >> 4 << 7));
        }
        tg.a((byte) 57, -105);
        var2Lifetime1 = (param1 & 65427) >> 10;
        var3Lifetime1 = 112 & param1 >> 3;
        var4Lifetime1 = 127 & param1;
        var3Lifetime1 = var4Lifetime1 > 64 ? (127 - var4Lifetime1) * var3Lifetime1 >> 7 : var3Lifetime1 * var4Lifetime1 >> 7;
        var5Lifetime1 = var4Lifetime1 + var3Lifetime1;
        if (0 == var5Lifetime1) {
          var6Lifetime1 = var3Lifetime1 << 1;
        } else {
          var6Lifetime1 = (var3Lifetime1 << 8) / var5Lifetime1;
        }
        var7Lifetime1 = var5Lifetime1;
        return (short)(var7Lifetime1 | (var2Lifetime1 << 10 | var6Lifetime1 >> 4 << 7));
    }

    public static void a(byte param0) {
        field_a = null;
        field_b = null;
        int var1 = -53 % ((param0 + 67) / 34);
        field_c = null;
    }

    static {
        field_b = new int[16];
        field_a = "Play the game without logging in just yet";
    }
}
