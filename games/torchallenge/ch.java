/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ch {
    static int[] field_c;
    static int[] field_b;
    static String field_d;
    static boolean[][] field_a;

    final static void a(int param0) {
        if (param0 < 57) {
          ch.b(true);
        }
        hh.field_a = null;
        uf.field_i = null;
    }

    final static void b(boolean param0) {
        boolean stackIn_29_0 = false;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var1_intLifetime1;
        int var1_intLifetime2;
        int var1_intLifetime3;
        int var1_intLifetime4;
        int var2Lifetime1;
        int var2Lifetime2;
        var3 = TorChallenge.field_F ? 1 : 0;
        try {
          if (null != hh.field_c) {
            for (var1_int = 0; var1_int < hh.field_c.length; var1_int++) {
              if (null != hh.field_c[var1_int]) {
                for (var2 = 0; var2 < hh.field_c[var1_int].length; var2++) {
                  hh.field_c[var1_int][var2] = null;
                }
                hh.field_c[var1_int] = (int[][]) null;
              }
            }
            hh.field_c = (int[][][]) null;
          }
          if (am.field_b != null) {
            for (var1_intLifetime1 = 0; am.field_b.length > var1_intLifetime1; var1_intLifetime1++) {
              if (am.field_b[var1_intLifetime1] != null) {
                for (var2Lifetime1 = 0; var2Lifetime1 < am.field_b[var1_intLifetime1].length; var2Lifetime1++) {
                  am.field_b[var1_intLifetime1][var2Lifetime1] = null;
                }
                am.field_b[var1_intLifetime1] = (int[][]) null;
              }
            }
            am.field_b = (int[][][]) null;
          }
          na.field_f = false;
          lj.field_n = null;
          kd.field_m = null;
          stackIn_29_0 = param0;
          vb.field_q = stackIn_29_0;
          if (null != lj.field_g) {
            for (var1_intLifetime2 = 0; var1_intLifetime2 < lj.field_g.length; var1_intLifetime2++) {
              if (lj.field_g[var1_intLifetime2] != null) {
                for (var2Lifetime2 = 0; var2Lifetime2 < lj.field_g[var1_intLifetime2].length; var2Lifetime2++) {
                  lj.field_g[var1_intLifetime2][var2Lifetime2] = null;
                }
                lj.field_g[var1_intLifetime2] = (int[][]) null;
              }
            }
            lj.field_g = (int[][][]) null;
          }
          if (null != ba.field_j) {
            for (var1_intLifetime3 = 0; var1_intLifetime3 < ba.field_j.length; var1_intLifetime3++) {
              ba.field_j[var1_intLifetime3] = null;
            }
            ba.field_j = (int[][]) null;
          }
          if (jj.field_a != null) {
            for (var1_intLifetime4 = 0; jj.field_a.length > var1_intLifetime4; var1_intLifetime4++) {
              jj.field_a[var1_intLifetime4] = null;
            }
          }
          oj.field_d = null;
          fa.field_q = null;
          jj.field_a = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var1), "ch.D(" + param0 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, boolean param4, int param5, ka[] param6) {
        int var22 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        String stackIn_81_2 = null;
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
        int var21Lifetime1;
        int var21Lifetime2;
        int var21Lifetime3;
        int var21Lifetime4;
        var23 = TorChallenge.field_F ? 1 : 0;
        try {
          if (param6 == null) {
            return;
          }
          if (param5 > 0 &&
            0 < param3 &&
            param0 != 0) {
            if (param6[3] != null) {
              stackIn_12_0 = param6[3].field_q;
            } else {
              stackIn_12_0 = 0;
            }
            var7_int = stackIn_12_0;
            if (param6[5] != null) {
              stackIn_15_0 = param6[5].field_q;
            } else {
              stackIn_15_0 = 0;
            }
            var8 = stackIn_15_0;
            if (param6[1] != null) {
              stackIn_18_0 = param6[1].field_v;
            } else {
              stackIn_18_0 = 0;
            }
            var9 = stackIn_18_0;
            if (null == param6[7]) {
              stackIn_21_0 = 0;
            } else {
              stackIn_21_0 = param6[7].field_v;
            }
            var10 = stackIn_21_0;
            if (!param4) {
              return;
            }
            var11 = param1 + param5;
            var12 = param2 + param3;
            var13 = var7_int + param1;
            var14 = var11 - var8;
            var15 = var9 + param2;
            var16 = -var10 + var12;
            var17 = var13;
            var18 = var14;
            if (var18 < var17) {
              var18 = param1 + param5 * var7_int / (var8 + var7_int);
              var17 = param1 + param5 * var7_int / (var8 + var7_int);
            }
            var19 = var15;
            var20 = var16;
            if (var19 > var20) {
              var20 = param3 * var9 / (var9 + var10) + param2;
              var19 = param3 * var9 / (var9 + var10) + param2;
            }
            qg.a(hb.field_a);
            if (param6[0] != null) {
              qg.a(param1, param2, var17, var19);
              param6[0].d(param1, param2, param0);
              qg.b(hb.field_a);
            }
            if (null != param6[2]) {
              qg.a(var18, param2, var11, var19);
              param6[2].d(var14, param2, param0);
              qg.b(hb.field_a);
            }
            if (param6[6] != null) {
              qg.a(param1, var20, var17, var12);
              param6[6].d(param1, var16, param0);
              qg.b(hb.field_a);
            }
            if (param6[8] != null) {
              qg.a(var18, var20, var11, var12);
              param6[8].d(var14, var16, param0);
              qg.b(hb.field_a);
            }
            if (param6[1] != null &&
              0 != param6[1].field_q) {
              qg.a(var17, param2, var18, var19);
              for (var21 = var13; var21 < var14; var21 = var21 + param6[1].field_q) {
                param6[1].d(var21, param2, param0);
              }
              qg.b(hb.field_a);
            }
            if (null != param6[7] &&
              param6[7].field_q != 0) {
              qg.a(var17, var20, var18, var12);
              for (var21Lifetime1 = var13; var14 > var21Lifetime1; var21Lifetime1 = var21Lifetime1 + param6[7].field_q) {
                param6[7].d(var21Lifetime1, var16, param0);
              }
              qg.b(hb.field_a);
            }
            if (param6[3] != null &&
              0 != param6[3].field_v) {
              qg.a(param1, var19, var17, var20);
              for (var21Lifetime2 = var15; var21Lifetime2 < var16; var21Lifetime2 = var21Lifetime2 + param6[3].field_v) {
                param6[3].d(param1, var21Lifetime2, param0);
              }
              qg.b(hb.field_a);
            }
            if (null != param6[5] &&
              0 != param6[5].field_v) {
              qg.a(var18, var19, var11, var20);
              for (var21Lifetime3 = var15; var21Lifetime3 < var16; var21Lifetime3 = var21Lifetime3 + param6[5].field_v) {
                param6[5].d(var14, var21Lifetime3, param0);
              }
              qg.b(hb.field_a);
            }
            if (param6[4] != null &&
              param6[4].field_q != 0) {
              if (param6[4].field_v == 0) {
                return;
              }
              qg.a(var17, var19, var18, var20);
              for (var21Lifetime4 = var15; var16 > var21Lifetime4; var21Lifetime4 = var21Lifetime4 + param6[4].field_v) {
                for (var22 = var13; var14 > var22; var22 = var22 + param6[4].field_q) {
                  param6[4].d(var22, var21Lifetime4, param0);
                }
              }
              qg.b(hb.field_a);
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_80_0 = var7;
          stackIn_80_1 = new StringBuilder().append("ch.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_81_2 = "null";
          } else {
            stackIn_81_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_80_0), ((StringBuilder) (Object) stackIn_80_1).append(stackIn_81_2).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        field_d = null;
        field_a = (boolean[][]) null;
        field_c = null;
        field_b = null;
        if (param0) {
          field_a = (boolean[][]) null;
        }
    }

    final static void a(int[] param0, int[] param1, int param2) {
        try {
          qh.a(param2, param1, (byte) 75, param0, -1 + param0.length);
        } catch (RuntimeException runtimeException) {
          throw oj.a((Throwable) ((Object) runtimeException), "ch.E(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_c = new int[]{343, 100, 231, 295};
        field_a = new boolean[][]{new boolean[]{true, true, true, true, true, false, true}, new boolean[]{true, true, true, true, true, true, false}, new boolean[]{true, true, true, true, true, false, true}};
    }
}
