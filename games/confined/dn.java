/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dn {
    static gj field_d;
    static nf[] field_c;
    static ef field_b;
    static String field_a;
    static String[] field_e;
    static ok field_f;

    public static void a(int param0) {
        field_b = null;
        int var1 = 88 % ((72 - param0) / 51);
        field_c = null;
        field_f = null;
        field_e = null;
        field_d = null;
        field_a = null;
    }

    final static void a(int param0, int param1, int param2, nf[] param3, int param4, int param5, int param6) {
        int var22 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        String stackIn_80_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
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
        int var21 = 0;
        int var23 = 0;
        nf[] var24 = null;
        int var21Lifetime1;
        int var21Lifetime2;
        int var21Lifetime3;
        int var21Lifetime4;
        var23 = Confined.field_J ? 1 : 0;
        try {
          if (param3 == null) {
            return;
          }
          if (param0 > 0 &&
            param6 > 0 &&
            param4 != 0) {
            if (null == param3[3]) {
              stackIn_12_0 = 0;
            } else {
              stackIn_12_0 = param3[3].field_t;
            }
            var7_int = stackIn_12_0;
            if (param3[5] != null) {
              stackIn_15_0 = param3[5].field_t;
            } else {
              stackIn_15_0 = 0;
            }
            var8 = stackIn_15_0;
            if (null == param3[1]) {
              stackIn_18_0 = 0;
            } else {
              stackIn_18_0 = param3[1].field_x;
            }
            var9 = stackIn_18_0;
            if (null != param3[7]) {
              stackIn_21_0 = param3[7].field_x;
            } else {
              stackIn_21_0 = 0;
            }
            var10 = stackIn_21_0;
            var11 = param0 + param1;
            var12 = param6 + param2;
            var13 = var7_int + param1;
            var14 = -var8 + var11;
            var15 = param2 + var9;
            if (param5 != -7992) {
              var24 = (nf[]) null;
              dn.a(100, 4, -112, (nf[]) null, 66, 93, 126);
            }
            var16 = var12 - var10;
            var17 = var13;
            var18 = var14;
            if (var18 < var17) {
              var18 = var7_int * param0 / (var7_int + var8) + param1;
              var17 = var7_int * param0 / (var7_int + var8) + param1;
            }
            var19 = var15;
            var20 = var16;
            if (var19 > var20) {
              var20 = var9 * param6 / (var9 + var10) + param2;
              var19 = var9 * param6 / (var9 + var10) + param2;
            }
            fn.b(fj.field_E);
            if (null != param3[0]) {
              fn.f(param1, param2, var17, var19);
              param3[0].a(param1, param2, param4);
              fn.a(fj.field_E);
            }
            if (param3[2] != null) {
              fn.f(var18, param2, var11, var19);
              param3[2].a(var14, param2, param4);
              fn.a(fj.field_E);
            }
            if (param3[6] != null) {
              fn.f(param1, var20, var17, var12);
              param3[6].a(param1, var16, param4);
              fn.a(fj.field_E);
            }
            if (param3[8] != null) {
              fn.f(var18, var20, var11, var12);
              param3[8].a(var14, var16, param4);
              fn.a(fj.field_E);
            }
            if (null != param3[1] &&
              param3[1].field_t != 0) {
              fn.f(var17, param2, var18, var19);
              for (var21 = var13; var14 > var21; var21 = var21 + param3[1].field_t) {
                param3[1].a(var21, param2, param4);
              }
              fn.a(fj.field_E);
            }
            if (param3[7] != null &&
              0 != param3[7].field_t) {
              fn.f(var17, var20, var18, var12);
              for (var21Lifetime1 = var13; var14 > var21Lifetime1; var21Lifetime1 = var21Lifetime1 + param3[7].field_t) {
                param3[7].a(var21Lifetime1, var16, param4);
              }
              fn.a(fj.field_E);
            }
            if (param3[3] != null &&
              param3[3].field_x != 0) {
              fn.f(param1, var19, var17, var20);
              for (var21Lifetime2 = var15; var16 > var21Lifetime2; var21Lifetime2 = var21Lifetime2 + param3[3].field_x) {
                param3[3].a(param1, var21Lifetime2, param4);
              }
              fn.a(fj.field_E);
            }
            if (param3[5] != null &&
              param3[5].field_x != 0) {
              fn.f(var18, var19, var11, var20);
              for (var21Lifetime3 = var15; var21Lifetime3 < var16; var21Lifetime3 = var21Lifetime3 + param3[5].field_x) {
                param3[5].a(var14, var21Lifetime3, param4);
              }
              fn.a(fj.field_E);
            }
            if (param3[4] != null &&
              0 != param3[4].field_t &&
              param3[4].field_x != 0) {
              fn.f(var17, var19, var18, var20);
              for (var21Lifetime4 = var15; var16 > var21Lifetime4; var21Lifetime4 = var21Lifetime4 + param3[4].field_x) {
                for (var22 = var13; var22 < var14; var22 = var22 + param3[4].field_t) {
                  param3[4].a(var22, var21Lifetime4, param4);
                }
              }
              fn.a(fj.field_E);
              return;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_79_0 = var7;
          stackIn_79_1 = new StringBuilder().append("dn.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_80_2 = "null";
          } else {
            stackIn_80_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_79_0), ((StringBuilder) (Object) stackIn_79_1).append(stackIn_80_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    static {
        field_e = new String[]{"All scores", "My scores", "Best each"};
        field_a = "You already have five wing pods";
    }
}
