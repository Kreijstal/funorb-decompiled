/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class em implements jk {
    qk[] field_i;
    static String field_b;
    static int field_j;
    static int[] field_c;
    static String field_a;
    static int field_k;
    static int field_h;
    static String field_g;
    lh field_e;
    jh[] field_d;
    lp[] field_f;

    final static int a(int param0, byte param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_11_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (param1 <= 113) {
            field_j = 43;
          }
          var3_int = 1;
          while (param2 > 1) {
            if ((param2 & 1) != 0) {
              var3_int = var3_int * param0;
            }
            param2 = param2 >> 1;
            param0 = param0 * param0;
          }
          if (param2 != 1) {
            stackIn_13_0 = var3_int;
            return stackIn_13_0;
          }
          stackIn_11_0 = var3_int * param0;
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var3), "em.A(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_g = null;
        field_c = null;
        field_b = null;
        if (param0 != 3) {
          em.a(-116);
        }
    }

    final static void a(va param0, int param1) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          fj.field_t = param0;
          if (2 != fj.field_t.field_c &&
            1 != fj.field_t.field_c) {
          }
          if (param1 != 1) {
            field_g = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("em.D(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, int param3, bi[] param4, int param5) {
        int var21 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_75_2 = null;
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
        var22 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (param4 == null) {
            return;
          }
          if (0 < param1 &&
            param0 > 0) {
            if (param4[3] == null) {
              stackIn_11_0 = 0;
            } else {
              stackIn_11_0 = param4[3].field_o;
            }
            var6_int = stackIn_11_0;
            if (null == param4[5]) {
              stackIn_14_0 = 0;
            } else {
              stackIn_14_0 = param4[5].field_o;
            }
            var7 = stackIn_14_0;
            if (param4[1] != null) {
              stackIn_17_0 = param4[1].field_p;
            } else {
              stackIn_17_0 = 0;
            }
            var8 = stackIn_17_0;
            if (param4[param2] != null) {
              stackIn_20_0 = param4[7].field_p;
            } else {
              stackIn_20_0 = 0;
            }
            var9 = stackIn_20_0;
            var10 = param5 + param1;
            var11 = param0 + param3;
            var12 = param5 + var6_int;
            var13 = -var7 + var10;
            var14 = param3 + var8;
            var15 = -var9 + var11;
            var16 = var12;
            var17 = var13;
            if (var16 > var17) {
              var17 = param5 + param1 * var6_int / (var7 + var6_int);
              var16 = param5 + param1 * var6_int / (var7 + var6_int);
            }
            var18 = var14;
            var19 = var15;
            if (var18 > var19) {
              var19 = param3 + var8 * param0 / (var8 + var9);
              var18 = param3 + var8 * param0 / (var8 + var9);
            }
            gf.a(ph.field_b);
            if (null != param4[0]) {
              gf.i(param5, param3, var16, var18);
              param4[0].f(param5, param3);
              gf.b(ph.field_b);
            }
            if (param4[2] != null) {
              gf.i(var17, param3, var10, var18);
              param4[2].f(var13, param3);
              gf.b(ph.field_b);
            }
            if (param4[6] != null) {
              gf.i(param5, var19, var16, var11);
              param4[6].f(param5, var15);
              gf.b(ph.field_b);
            }
            if (null != param4[8]) {
              gf.i(var17, var19, var10, var11);
              param4[8].f(var13, var15);
              gf.b(ph.field_b);
            }
            if (null != param4[1] &&
              param4[1].field_o != 0) {
              gf.i(var16, param3, var17, var18);
              for (var20 = var12; var13 > var20; var20 = var20 + param4[1].field_o) {
                param4[1].f(var20, param3);
              }
              gf.b(ph.field_b);
            }
            if (param4[7] != null &&
              param4[7].field_o != 0) {
              gf.i(var16, var19, var17, var11);
              for (var20Lifetime1 = var12; var20Lifetime1 < var13; var20Lifetime1 = var20Lifetime1 + param4[7].field_o) {
                param4[7].f(var20Lifetime1, var15);
              }
              gf.b(ph.field_b);
            }
            if (null != param4[3] &&
              param4[3].field_p != 0) {
              gf.i(param5, var18, var16, var19);
              for (var20Lifetime2 = var14; var15 > var20Lifetime2; var20Lifetime2 = var20Lifetime2 + param4[3].field_p) {
                param4[3].f(param5, var20Lifetime2);
              }
              gf.b(ph.field_b);
            }
            if (param4[5] != null &&
              param4[5].field_p != 0) {
              gf.i(var17, var18, var10, var19);
              for (var20Lifetime3 = var14; var20Lifetime3 < var15; var20Lifetime3 = var20Lifetime3 + param4[5].field_p) {
                param4[5].f(var13, var20Lifetime3);
              }
              gf.b(ph.field_b);
            }
            if (null != param4[4] &&
              param4[4].field_o != 0) {
              if (0 == param4[4].field_p) {
                return;
              }
              gf.i(var16, var18, var17, var19);
              for (var20Lifetime4 = var14; var15 > var20Lifetime4; var20Lifetime4 = var20Lifetime4 + param4[4].field_p) {
                for (var21 = var12; var13 > var21; var21 = var21 + param4[4].field_o) {
                  param4[4].f(var21, var20Lifetime4);
                }
              }
              gf.b(ph.field_b);
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_74_0 = var6;
          stackIn_74_1 = new StringBuilder().append("em.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_75_2 = "null";
          } else {
            stackIn_75_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_74_0), ((StringBuilder) (Object) stackIn_74_1).append(stackIn_75_2).append(',').append(param5).append(')').toString());
        }
    }

    static {
        field_c = new int[4];
        field_b = "<%0> must play <%1> more rated games before playing with the current options.";
        field_h = 0;
        field_g = "Quit to website";
    }
}
