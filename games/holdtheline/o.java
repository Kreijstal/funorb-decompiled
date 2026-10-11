/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class o {
    static float field_c;
    static String field_d;
    static String field_b;
    static String field_a;

    public static void b(byte param0) {
        if (param0 == 39) {
          field_a = null;
          field_d = null;
          field_b = null;
          return;
        }
        field_a = (String) null;
        field_a = null;
        field_d = null;
        field_b = null;
    }

    final static hj a(int param0, int param1) {
        if (param0 == param1) {
          return ol.field_i.a(param1 + 8190);
        }
        if (param0 == 3) {
          return sm.field_a.a(8192);
        }
        if (param0 < 4) {
          throw new RuntimeException();
        }
        if (param0 < 8) {
          return nj.field_c[param0 - 4].a(param1 + 8190);
        }
        throw new RuntimeException();
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var10 = 0;
        int var12 = 0;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var11 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        var22 = HoldTheLine.field_D;
        try {
          if (0 > param2) {
            param1 = param1 + param2;
            param2 = 0;
          }
          if (param6 < 0) {
            param4 = param4 + param6;
            param6 = 0;
          }
          if (tc.field_c < param1 + param2) {
            param1 = tc.field_c - param2;
          }
          if (param5 != -4441) {
            o.a((byte) -27);
          }
          if (param6 + param4 > tc.field_j) {
            param4 = -param6 + tc.field_j;
          }
          var7_int = param0 * param3 >> 8;
          var8 = param3 - var7_int;
          var9 = param2 + param1;
          for (var10 = param2; var9 > var10; var10++) {
            var11 = param6 + var10 * tc.field_j;
            for (var12 = param4; 0 < var12; var12--) {
              var13 = tc.field_b[var11];
              var14 = var13 >> 16 & 255;
              var15 = 255 & var13 >> 8;
              var16 = 255 & var13;
              var17 = var15 * 6 + 5 * var14 + 5 * var16;
              var18 = (var17 * var8 >> 12) + (var7_int * var14 >> 8);
              var19 = (var7_int * var15 >> 8) + (var8 * var17 >> 12);
              var20 = (var8 * var17 >> 12) + (var16 * var7_int >> 8);
              var21 = var19 << 8 | var18 << 16 | var20;
              tc.field_b[var11] = var21;
              var11++;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw kk.a((Throwable) ((Object) var7), "o.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    final static uh a(byte param0) {
        int var1 = 48 / ((param0 + 52) / 57);
        return ub.a(1, 111);
    }

    static {
        field_c = (float)Math.pow(0.949999988079071, 1.0);
        field_b = "Best Each";
        field_a = "Player 2";
    }
}
