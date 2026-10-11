/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mj {
    static int field_a;
    static String field_b;

    public static void a(int param0) {
        int var1 = 51 % ((param0 - 19) / 52);
        field_b = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var8 = 0;
        int var10 = 0;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var9 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        RuntimeException decompiledCaughtException = null;
        var20 = HoldTheLine.field_D;
        try {
          if (param2 < 0) {
            param0 = param0 + param2;
            param2 = 0;
          }
          if (param4 < 0) {
            param1 = param1 + param4;
            param4 = 0;
          }
          if (param4 + param1 > tc.field_c) {
            param1 = -param4 + tc.field_c;
          }
          if (tc.field_j < param0 + param2) {
            param0 = -param2 + tc.field_j;
          }
          var6_int = -param5 + 256;
          var7 = param4 + param1;
          for (var8 = param4; var7 > var8; var8++) {
            var9 = var8 * tc.field_j + param2;
            for (var10 = param0; var10 > 0; var10--) {
              var11 = tc.field_b[var9];
              var12 = (var11 & 16711680) >> 16;
              var13 = 255 & var11 >> 8;
              var14 = var11 & 255;
              var15 = var14 * 5 + (6 * var13 + var12 * 5);
              var16 = (var6_int * var15 >> 12) + (param5 * var12 >> 8);
              var17 = (var6_int * var15 >> 12) + (var13 * param5 >> 8);
              var18 = (var15 * var6_int >> 12) + (var14 * param5 >> 8);
              var19 = var16 << 16 | var17 << 8 | var18;
              tc.field_b[var9] = var19;
              var9++;
            }
          }
          if (param3 == 0) {
            return;
          }
          mj.a(-35);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw kk.a((Throwable) ((Object) var6), "mj.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    static {
        field_b = "Names cannot start or end with space or underscore";
    }
}
