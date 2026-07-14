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
            int discarded$0 = fm.a(8, 105, 64);
        }
    }

    final static void a(wk[] param0, int param1, int param2, int param3, int param4) {
        param0[0].g(param2, param3);
        param0[1].c(param0[1].field_y + param2, param3, -(param0[2].field_y << -1742036959) + param1, param0[2].field_v);
        param0[2].g(param2 + param1 + -param0[2].field_y, param3);
        if (param4 > -38) {
            Object var6 = null;
            fm.a((wk[]) null, -67, 44, -43, -95);
        }
    }

    final static int a(int param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        var3 = param0 >>> -1699991752 & 255;
        var4 = (-16777216 & param1) >>> -1863405544;
        if (param2 != 789485328) {
          var10 = null;
          fm.a((wk[]) null, 127, 84, -117, 90);
          var5 = var3 + var4;
          var6 = (((255 & param1 >> -1547291760) * var4 + var3 * ((16711680 & param0) >> -1568287792)) / var5 & 1697972479) << 789485328;
          var7 = (-1660944129 & (((65280 & param1) >> -1044944056) * var4 + var3 * ((65280 & param0) >> -1989692792)) / var5) << -1653234072;
          var8 = (var4 * (param1 & 255) + (param0 & 255) * var3) / var5 & 255;
          var9 = (-(var4 * var3 >> -2131806136) + (var4 + var3) & 255) << -2023952296;
          return var7 | (var9 | var6) | var8;
        } else {
          var5 = var3 + var4;
          var6 = (((255 & param1 >> -1547291760) * var4 + var3 * ((16711680 & param0) >> -1568287792)) / var5 & 1697972479) << 789485328;
          var7 = (-1660944129 & (((65280 & param1) >> -1044944056) * var4 + var3 * ((65280 & param0) >> -1989692792)) / var5) << -1653234072;
          var8 = (var4 * (param1 & 255) + (param0 & 255) * var3) / var5 & 255;
          var9 = (-(var4 * var3 >> -2131806136) + (var4 + var3) & 255) << -2023952296;
          return var7 | (var9 | var6) | var8;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Please wait...";
        field_b = "Magical hats to increase the power of magic attacks.";
        field_d = new int[5];
        field_a = 873;
    }
}
