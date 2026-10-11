/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sn {
    static cn[] field_c;
    static String[] field_a;
    static pp field_b;

    final static void a(int param0, String param1) {
        System.out.println("Error: " + eg.a(param1, "%0a", "\n", true));
        if (param0 != 11580) {
          field_c = (cn[]) null;
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_c = null;
        if (param0 != 5) {
          cn[] var2 = (cn[]) null;
          sn.a(99, -43, (cn[]) null, -117, -42, 22);
        }
        field_a = null;
    }

    final static void a(int param0, int param1, cn[] param2, int param3, int param4, int param5) {
        int var22 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        String stackIn_76_2 = null;
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
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var23 = 0;
        int var21Lifetime1;
        int var21Lifetime2;
        int var21Lifetime3;
        int var21Lifetime4;
        var23 = DungeonAssault.field_K;
        try {
          if (param2 == null) {
            return;
          }
          if (0 < param5 &&
            param1 > 0) {
            var7 = 48 / ((34 - param0) / 62);
            if (param2[3] == null) {
              stackIn_11_0 = 0;
            } else {
              stackIn_11_0 = param2[3].field_E;
            }
            var6_int = stackIn_11_0;
            if (null == param2[5]) {
              stackIn_14_0 = 0;
            } else {
              stackIn_14_0 = param2[5].field_E;
            }
            var8 = stackIn_14_0;
            if (null == param2[1]) {
              stackIn_17_0 = 0;
            } else {
              stackIn_17_0 = param2[1].field_G;
            }
            var9 = stackIn_17_0;
            if (param2[7] != null) {
              stackIn_20_0 = param2[7].field_G;
            } else {
              stackIn_20_0 = 0;
            }
            var10 = stackIn_20_0;
            var11 = param3 + param5;
            var12 = param4 + param1;
            var13 = var6_int + param3;
            var14 = var11 - var8;
            var15 = var9 + param4;
            var16 = var12 - var10;
            var17 = var13;
            var18 = var14;
            if (var17 > var18) {
              var18 = param3 + param5 * var6_int / (var8 + var6_int);
              var17 = param3 + param5 * var6_int / (var8 + var6_int);
            }
            var19 = var15;
            var20 = var16;
            gf.a(fc.field_g);
            if (var20 < var19) {
              var20 = param4 + var9 * param1 / (var9 + var10);
              var19 = param4 + var9 * param1 / (var9 + var10);
            }
            if (null != param2[0]) {
              gf.a(param3, param4, var17, var19);
              param2[0].h(param3, param4);
              gf.b(fc.field_g);
            }
            if (null != param2[2]) {
              gf.a(var18, param4, var11, var19);
              param2[2].h(var14, param4);
              gf.b(fc.field_g);
            }
            if (param2[6] != null) {
              gf.a(param3, var20, var17, var12);
              param2[6].h(param3, var16);
              gf.b(fc.field_g);
            }
            if (param2[8] != null) {
              gf.a(var18, var20, var11, var12);
              param2[8].h(var14, var16);
              gf.b(fc.field_g);
            }
            if (param2[1] != null &&
              param2[1].field_E != 0) {
              gf.a(var17, param4, var18, var19);
              for (var21 = var13; var14 > var21; var21 = var21 + param2[1].field_E) {
                param2[1].h(var21, param4);
              }
              gf.b(fc.field_g);
            }
            if (null != param2[7] &&
              param2[7].field_E != 0) {
              gf.a(var17, var20, var18, var12);
              for (var21Lifetime1 = var13; var14 > var21Lifetime1; var21Lifetime1 = var21Lifetime1 + param2[7].field_E) {
                param2[7].h(var21Lifetime1, var16);
              }
              gf.b(fc.field_g);
            }
            if (param2[3] != null &&
              0 != param2[3].field_G) {
              gf.a(param3, var19, var17, var20);
              for (var21Lifetime2 = var15; var16 > var21Lifetime2; var21Lifetime2 = var21Lifetime2 + param2[3].field_G) {
                param2[3].h(param3, var21Lifetime2);
              }
              gf.b(fc.field_g);
            }
            if (null != param2[5] &&
              0 != param2[5].field_G) {
              gf.a(var18, var19, var11, var20);
              for (var21Lifetime3 = var15; var21Lifetime3 < var16; var21Lifetime3 = var21Lifetime3 + param2[5].field_G) {
                param2[5].h(var14, var21Lifetime3);
              }
              gf.b(fc.field_g);
            }
            if (param2[4] != null &&
              param2[4].field_E != 0 &&
              0 != param2[4].field_G) {
              gf.a(var17, var19, var18, var20);
              for (var21Lifetime4 = var15; var21Lifetime4 < var16; var21Lifetime4 = var21Lifetime4 + param2[4].field_G) {
                for (var22 = var13; var14 > var22; var22 = var22 + param2[4].field_E) {
                  param2[4].h(var22, var21Lifetime4);
                }
              }
              gf.b(fc.field_g);
              return;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_75_0 = var6;
          stackIn_75_1 = new StringBuilder().append("sn.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_76_2 = "null";
          } else {
            stackIn_76_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_75_0), ((StringBuilder) (Object) stackIn_75_1).append(stackIn_76_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final static void a(int param0, int param1) {
        if (param0 <= 2) {
          return;
        }
        ki.field_f = param1;
    }

    static {
    }
}
