/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class di {
    static String[] field_g;
    static String field_e;
    static bi field_a;
    static String field_c;
    static String field_b;
    static od field_d;
    static String field_f;

    public static void a(int param0) {
        field_d = null;
        field_b = null;
        if (param0 != 0) {
          nf[] var2 = (nf[]) null;
          di.a(100, (nf[]) null, (byte) 46, 121, -125, -36);
        }
        field_g = null;
        field_c = null;
        field_f = null;
        field_a = null;
        field_e = null;
    }

    final static void a(int param0, nf[] param1, byte param2, int param3, int param4, int param5) {
        int var21 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_74_2 = null;
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
        nf[] var23 = null;
        int var20Lifetime1;
        int var20Lifetime2;
        int var20Lifetime3;
        int var20Lifetime4;
        var22 = Confined.field_J ? 1 : 0;
        try {
          if (param1 == null) {
            return;
          }
          if (0 < param4 &&
            param0 > 0) {
            if (param1[3] == null) {
              stackIn_10_0 = 0;
            } else {
              stackIn_10_0 = param1[3].field_t;
            }
            var6_int = stackIn_10_0;
            if (null == param1[5]) {
              stackIn_13_0 = 0;
            } else {
              stackIn_13_0 = param1[5].field_t;
            }
            var7 = stackIn_13_0;
            if (null != param1[1]) {
              stackIn_16_0 = param1[1].field_x;
            } else {
              stackIn_16_0 = 0;
            }
            var8 = stackIn_16_0;
            if (param1[7] == null) {
              stackIn_19_0 = 0;
            } else {
              stackIn_19_0 = param1[7].field_x;
            }
            var9 = stackIn_19_0;
            var10 = param3 + param4;
            var11 = param0 + param5;
            var12 = var6_int + param3;
            if (param2 >= -23) {
              var23 = (nf[]) null;
              di.a(-48, (nf[]) null, (byte) 113, -19, 53, -112);
            }
            var13 = var10 - var7;
            var14 = var8 + param5;
            var15 = var11 - var9;
            var16 = var12;
            var17 = var13;
            if (var16 > var17) {
              var17 = param3 + var6_int * param4 / (var6_int + var7);
              var16 = param3 + var6_int * param4 / (var6_int + var7);
            }
            var18 = var14;
            var19 = var15;
            fn.b(fj.field_E);
            if (var18 > var19) {
              var19 = var8 * param0 / (var9 + var8) + param5;
              var18 = var8 * param0 / (var9 + var8) + param5;
            }
            if (null != param1[0]) {
              fn.f(param3, param5, var16, var18);
              param1[0].d(param3, param5);
              fn.a(fj.field_E);
            }
            if (param1[2] != null) {
              fn.f(var17, param5, var10, var18);
              param1[2].d(var13, param5);
              fn.a(fj.field_E);
            }
            if (param1[6] != null) {
              fn.f(param3, var19, var16, var11);
              param1[6].d(param3, var15);
              fn.a(fj.field_E);
            }
            if (null != param1[8]) {
              fn.f(var17, var19, var10, var11);
              param1[8].d(var13, var15);
              fn.a(fj.field_E);
            }
            if (param1[1] != null &&
              0 != param1[1].field_t) {
              fn.f(var16, param5, var17, var18);
              for (var20 = var12; var13 > var20; var20 = var20 + param1[1].field_t) {
                param1[1].d(var20, param5);
              }
              fn.a(fj.field_E);
            }
            if (null != param1[7] &&
              param1[7].field_t != 0) {
              fn.f(var16, var19, var17, var11);
              for (var20Lifetime1 = var12; var20Lifetime1 < var13; var20Lifetime1 = var20Lifetime1 + param1[7].field_t) {
                param1[7].d(var20Lifetime1, var15);
              }
              fn.a(fj.field_E);
            }
            if (null != param1[3] &&
              param1[3].field_x != 0) {
              fn.f(param3, var18, var16, var19);
              for (var20Lifetime2 = var14; var15 > var20Lifetime2; var20Lifetime2 = var20Lifetime2 + param1[3].field_x) {
                param1[3].d(param3, var20Lifetime2);
              }
              fn.a(fj.field_E);
            }
            if (null != param1[5] &&
              0 != param1[5].field_x) {
              fn.f(var17, var18, var10, var19);
              for (var20Lifetime3 = var14; var20Lifetime3 < var15; var20Lifetime3 = var20Lifetime3 + param1[5].field_x) {
                param1[5].d(var13, var20Lifetime3);
              }
              fn.a(fj.field_E);
            }
            if (param1[4] != null &&
              param1[4].field_t != 0) {
              if (0 == param1[4].field_x) {
                return;
              }
              fn.f(var16, var18, var17, var19);
              for (var20Lifetime4 = var14; var15 > var20Lifetime4; var20Lifetime4 = var20Lifetime4 + param1[4].field_x) {
                for (var21 = var12; var13 > var21; var21 = var21 + param1[4].field_t) {
                  param1[4].d(var21, var20Lifetime4);
                }
              }
              fn.a(fj.field_E);
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_73_0 = var6;
          stackIn_73_1 = new StringBuilder().append("di.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_74_2 = "null";
          } else {
            stackIn_74_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_73_0), ((StringBuilder) (Object) stackIn_73_1).append(stackIn_74_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final static String a(boolean param0) {
        if (null == qc.field_m) {
          return "";
        }
        if (!param0) {
          di.a(88);
        }
        return qc.field_m;
    }

    final static void a(int param0, int param1, int param2) {
        if ((1 << param2 & i.field_o) != 0) {
          return;
        }
        i.field_o = i.field_o | 1 << param2;
        if (param0 != -30867) {
          field_a = (bi) null;
        }
        oj.field_B = oj.field_B | 1 << param2;
        qn.field_v.field_u.a((rk) (new an(param2)), (byte) -110);
        ra.field_c.a((rk) (new sf(param2, param1, qn.field_v.field_B.field_yb + bd.field_h, we.field_g + qn.field_v.field_J.field_o, d.field_a - qn.field_v.field_h, rc.field_i)), (byte) 73);
    }

    static {
        field_g = new String[]{"All other member expansions", "Loads more Achievements", "Full community features"};
        field_e = "<col=FFFFFF>Power-up attractor:</col> collect this and your ship will attempt to pull power-ups in automatically for 30 seconds, enabling you to concentrate more on dodging enemy fire and aiming your weapons.";
        field_b = "<col=FFFFFF>Mine:</col> the aliens start dropping these from Level 7 onwards. They are hard to see, but will explode and damage your shields if you hit them. Try not to!";
        field_c = "No";
        field_f = "Collision course";
    }
}
