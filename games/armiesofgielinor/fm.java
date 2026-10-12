/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fm {
    static String field_b;
    static String field_c;
    static int[] field_d;
    static int field_a;

    public static void a(int param0) {
        field_d = null;
        field_b = null;
        field_c = null;
        if (param0 < 80) {
          fm.a(8, 105, 64);
        }
    }

    final static void a(wk[] param0, int param1, int param2, int param3, int param4) {
        try {
          param0[0].g(param2, param3);
          param0[1].c(param0[1].field_y + param2, param3, -(param0[2].field_y << 1) + param1, param0[2].field_v);
          param0[2].g(param2 + param1 - param0[2].field_y, param3);
          if (param4 > -38) {
            wk[] var6 = (wk[]) null;
            fm.a((wk[]) null, -67, 44, -43, -95);
          }
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "fm.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static int a(int param0, int param1, int param2) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var3 = param0 >>> 24 & 255;
        int var4 = (-16777216 & param1) >>> 24;
        int var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        if (param2 == 789485328) {
          var5 = var3 + var4;
          var6 = (((255 & param1 >> 16) * var4 + var3 * ((16711680 & param0) >> 16)) / var5 & 1697972479) << 16;
          var7 = (-1660944129 & (((65280 & param1) >> 8) * var4 + var3 * ((65280 & param0) >> 8)) / var5) << 8;
          var8 = (var4 * (param1 & 255) + (param0 & 255) * var3) / var5 & 255;
          var9 = (-(var4 * var3 >> 8) + (var4 + var3) & 255) << 24;
          return var7 | (var9 | var6) | var8;
        }
        wk[] var10 = (wk[]) null;
        fm.a((wk[]) null, 127, 84, -117, 90);
        var5Lifetime1 = var3 + var4;
        var6Lifetime1 = (((255 & param1 >> 16) * var4 + var3 * ((16711680 & param0) >> 16)) / var5Lifetime1 & 1697972479) << 16;
        var7Lifetime1 = (-1660944129 & (((65280 & param1) >> 8) * var4 + var3 * ((65280 & param0) >> 8)) / var5Lifetime1) << 8;
        var8Lifetime1 = (var4 * (param1 & 255) + (param0 & 255) * var3) / var5Lifetime1 & 255;
        var9Lifetime1 = (-(var4 * var3 >> 8) + (var4 + var3) & 255) << 24;
        return var7Lifetime1 | (var9Lifetime1 | var6Lifetime1) | var8Lifetime1;
    }

    static {
        field_c = "Please wait...";
        field_b = "Magical hats to increase the power of magic attacks.";
        field_d = new int[5];
        field_a = 873;
    }
}
