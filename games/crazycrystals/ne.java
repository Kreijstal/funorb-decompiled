/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ne {
    private static int[] field_g;
    static boolean field_b;
    static String field_h;
    static int field_c;
    static String[] field_a;
    static oa field_f;
    static dl field_e;
    static dl field_i;
    static boolean field_d;

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        var13 = CrazyCrystals.field_B;
        try {
          if (kh.field_c > param4) {
            param1 = param1 - (-param4 + kh.field_c);
            param4 = kh.field_c;
          }
          if (kh.field_b > param0) {
            param5 = param5 - (-param0 + kh.field_b);
            param0 = kh.field_b;
          }
          if (kh.field_g < param1 + param4) {
            param1 = kh.field_g - param4;
          }
          var6_int = 121 / ((-55 - param2) / 41);
          if (kh.field_j < param5 + param0) {
            param5 = kh.field_j - param0;
          }
          if (0 < param1 &&
            param5 > 0) {
            var7 = kh.field_l * param0 + param4;
            var8 = -param1 + kh.field_l;
            for (param0 = -param5; 0 > param0; param0++) {
              for (param4 = -param1; param4 < 0; param4++) {
                var9 = kh.field_i[var7];
                if (((65280 & var9) >> 8) > param3 &&
                  (var9 & 65280) >> 8 >= (var9 & 16711680) >> 16) {
                  var10 = -60 + ((16711680 & var9) >> 15);
                  if (var10 > 255) {
                    var10 = 255;
                  }
                  var11 = var9 & 65280;
                  var11 = -(var11 >> 5) + (var11 >> 1) & 65280;
                  var12 = var9 >> 3 & 31;
                  kh.field_i[var7] = hm.a(hm.a(var10 << 16, var11), var12);
                }
                var7++;
              }
              var7 = var7 + var8;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw dn.a((Throwable) ((Object) var6), "ne.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    public static void a(int param0) {
        if (param0 != -1) {
          field_h = (String) null;
        }
        field_g = null;
        field_i = null;
        field_e = null;
        field_f = null;
        field_h = null;
        field_a = null;
    }

    static {
        int var0 = 0;
        long var4 = 0L;
        long var6 = 0L;
        int var3 = 0;
        int var2 = 0;
        int var1 = 0;
        field_b = true;
        field_g = new int[98304];
        for (var0 = 92682; 46341 <= var0; var0--) {
          var4 = (long)(-1 + (var0 << 1));
          var6 = (long)(1 + (var0 << 1));
          var3 = (int)((var6 * var6 >> 18) - 32768L);
          var2 = (int)((var4 * var4 >> 18) - 32768L);
          if (!(field_g.length > var3)) {
            var3 = -1 + field_g.length;
          }
          for (var1 = var2 >= 0 ? var2 : 0; var3 >= var1; var1++) {
            field_g[var1] = var0;
          }
        }
        field_f = null;
    }
}
