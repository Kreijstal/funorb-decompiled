/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uj {
    static int[] field_b;
    int field_a;
    int field_c;
    int field_d;
    int field_e;

    final static void a(float param0, String param1, boolean param2, byte param3) {
        try {
          if (pc.field_b == null) {
            pc.field_b = new lb(u.field_b, v.field_a);
            u.field_b.b(pc.field_b, -49);
          }
          if (param3 != -77) {
            uj.a(-106);
          }
          pc.field_b.a(param1, param2, param0, 125);
          mi.a();
          uf.a(false, true);
        } catch (RuntimeException runtimeException) {
          throw fc.a((Throwable) ((Object) runtimeException), "uj.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, o[] param3, int param4, int param5) {
        int var21 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        String stackIn_77_2 = null;
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
        int var22 = 0;
        int var20Lifetime1;
        int var20Lifetime2;
        int var20Lifetime3;
        int var20Lifetime4;
        var22 = SolKnight.field_L ? 1 : 0;
        try {
          if (param3 == null) {
            return;
          }
          if (param0 > 0 &&
            0 < param1) {
            if (param3[3] == null) {
              stackIn_11_0 = 0;
            } else {
              stackIn_11_0 = param3[3].field_q;
            }
            var6_int = stackIn_11_0;
            if (null == param3[5]) {
              stackIn_14_0 = 0;
            } else {
              stackIn_14_0 = param3[5].field_q;
            }
            var7 = stackIn_14_0;
            if (null == param3[1]) {
              stackIn_17_0 = 0;
            } else {
              stackIn_17_0 = param3[1].field_r;
            }
            var8 = stackIn_17_0;
            if (null != param3[7]) {
              stackIn_20_0 = param3[7].field_r;
            } else {
              stackIn_20_0 = 0;
            }
            var9 = stackIn_20_0;
            var10 = param0 + param2;
            var11 = param1 + param4;
            var12 = param2 + var6_int;
            var13 = var10 - var7;
            var14 = var8 + param4;
            var15 = -var9 + var11;
            var16 = var12;
            var17 = var13;
            if (var16 > var17) {
              var17 = param2 + param0 * var6_int / (var7 + var6_int);
              var16 = param2 + param0 * var6_int / (var7 + var6_int);
            }
            var18 = var14;
            var19 = var15;
            if (var19 < var18) {
              var19 = param1 * var8 / (var9 + var8) + param4;
              var18 = param1 * var8 / (var9 + var8) + param4;
            }
            mi.b(SolKnight.field_E);
            if (param3[0] != null) {
              mi.d(param2, param4, var16, var18);
              param3[0].d(param2, param4);
              mi.a(SolKnight.field_E);
            }
            if (param3[param5] != null) {
              mi.d(var17, param4, var10, var18);
              param3[2].d(var13, param4);
              mi.a(SolKnight.field_E);
            }
            if (null != param3[6]) {
              mi.d(param2, var19, var16, var11);
              param3[6].d(param2, var15);
              mi.a(SolKnight.field_E);
            }
            if (null != param3[8]) {
              mi.d(var17, var19, var10, var11);
              param3[8].d(var13, var15);
              mi.a(SolKnight.field_E);
            }
            if (null != param3[1] &&
              param3[1].field_q != 0) {
              mi.d(var16, param4, var17, var18);
              for (var20 = var12; var13 > var20; var20 = var20 + param3[1].field_q) {
                param3[1].d(var20, param4);
              }
              mi.a(SolKnight.field_E);
            }
            if (null != param3[7] &&
              0 != param3[7].field_q) {
              mi.d(var16, var19, var17, var11);
              for (var20Lifetime1 = var12; var13 > var20Lifetime1; var20Lifetime1 = var20Lifetime1 + param3[7].field_q) {
                param3[7].d(var20Lifetime1, var15);
              }
              mi.a(SolKnight.field_E);
            }
            if (param3[3] != null &&
              param3[3].field_r != 0) {
              mi.d(param2, var18, var16, var19);
              for (var20Lifetime2 = var14; var15 > var20Lifetime2; var20Lifetime2 = var20Lifetime2 + param3[3].field_r) {
                param3[3].d(param2, var20Lifetime2);
              }
              mi.a(SolKnight.field_E);
            }
            if (param3[5] != null &&
              param3[5].field_r != 0) {
              mi.d(var17, var18, var10, var19);
              for (var20Lifetime3 = var14; var15 > var20Lifetime3; var20Lifetime3 = var20Lifetime3 + param3[5].field_r) {
                param3[5].d(var13, var20Lifetime3);
              }
              mi.a(SolKnight.field_E);
            }
            if (param3[4] != null &&
              0 != param3[4].field_q &&
              0 != param3[4].field_r) {
              mi.d(var16, var18, var17, var19);
              for (var20Lifetime4 = var14; var15 > var20Lifetime4; var20Lifetime4 = var20Lifetime4 + param3[4].field_r) {
                for (var21 = var12; var21 < var13; var21 = var21 + param3[4].field_q) {
                  param3[4].d(var21, var20Lifetime4);
                }
              }
              mi.a(SolKnight.field_E);
              return;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_76_0 = var6;
          stackIn_76_1 = new StringBuilder().append("uj.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_77_2 = "null";
          } else {
            stackIn_77_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_76_0), ((StringBuilder) (Object) stackIn_76_1).append(stackIn_77_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    public static void a(int param0) {
        if (param0 != 1) {
          return;
        }
        field_b = null;
    }

    static {
    }
}
