/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hm extends am {
    int field_m;
    int field_p;
    static bd field_l;
    int field_i;
    int field_j;
    int field_k;
    int field_h;
    static String field_n;
    static String field_o;

    public static void d(int param0) {
        if (param0 != 5) {
          return;
        }
        field_o = null;
        field_l = null;
        field_n = null;
    }

    final static boolean c(int param0) {
        if (param0 != 8) {
          return false;
        }
        return !c.field_a.d((byte) -102) ? true : false;
    }

    final static void a(int param0, bd[] param1, boolean param2, int param3, int param4, int param5) {
        int var21 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
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
        var22 = HostileSpawn.field_I ? 1 : 0;
        try {
          if (param1 == null) {
            return;
          }
          if (param0 > 0 &&
            param3 > 0) {
            if (param1[3] != null) {
              stackIn_9_0 = param1[3].field_u;
            } else {
              stackIn_9_0 = 0;
            }
            var6_int = stackIn_9_0;
            if (null == param1[5]) {
              stackIn_12_0 = 0;
            } else {
              stackIn_12_0 = param1[5].field_u;
            }
            var7 = stackIn_12_0;
            if (null == param1[1]) {
              stackIn_15_0 = 0;
            } else {
              stackIn_15_0 = param1[1].field_r;
            }
            var8 = stackIn_15_0;
            if (param1[7] != null) {
              stackIn_18_0 = param1[7].field_r;
            } else {
              stackIn_18_0 = 0;
            }
            var9 = stackIn_18_0;
            var10 = param0 + param5;
            var11 = param4 + param3;
            var12 = var6_int + param5;
            var13 = -var7 + var10;
            var14 = param4 + var8;
            var15 = -var9 + var11;
            var16 = var12;
            var17 = var13;
            if (var17 < var16) {
              var17 = var6_int * param0 / (var7 + var6_int) + param5;
              var16 = var6_int * param0 / (var7 + var6_int) + param5;
            }
            var18 = var14;
            var19 = var15;
            if (var18 > var19) {
              var19 = param3 * var8 / (var9 + var8) + param4;
              var18 = param3 * var8 / (var9 + var8) + param4;
            }
            si.b(rj.field_M);
            if (param1[0] != null) {
              si.f(param5, param4, var16, var18);
              param1[0].e(param5, param4);
              si.a(rj.field_M);
            }
            if (null != param1[2]) {
              si.f(var17, param4, var10, var18);
              param1[2].e(var13, param4);
              si.a(rj.field_M);
            }
            if (null != param1[6]) {
              si.f(param5, var19, var16, var11);
              param1[6].e(param5, var15);
              si.a(rj.field_M);
            }
            if (param1[8] != null) {
              si.f(var17, var19, var10, var11);
              param1[8].e(var13, var15);
              si.a(rj.field_M);
            }
            if (param1[1] != null &&
              param1[1].field_u != 0) {
              si.f(var16, param4, var17, var18);
              for (var20 = var12; var20 < var13; var20 = var20 + param1[1].field_u) {
                param1[1].e(var20, param4);
              }
              si.a(rj.field_M);
            }
            if (null != param1[7] &&
              param1[7].field_u != 0) {
              si.f(var16, var19, var17, var11);
              for (var20Lifetime1 = var12; var13 > var20Lifetime1; var20Lifetime1 = var20Lifetime1 + param1[7].field_u) {
                param1[7].e(var20Lifetime1, var15);
              }
              si.a(rj.field_M);
            }
            if (null != param1[3] &&
              0 != param1[3].field_r) {
              si.f(param5, var18, var16, var19);
              for (var20Lifetime2 = var14; var15 > var20Lifetime2; var20Lifetime2 = var20Lifetime2 + param1[3].field_r) {
                param1[3].e(param5, var20Lifetime2);
              }
              si.a(rj.field_M);
            }
            if (param2) {
              hm.d(79);
            }
            if (null != param1[5] &&
              param1[5].field_r != 0) {
              si.f(var17, var18, var10, var19);
              for (var20Lifetime3 = var14; var15 > var20Lifetime3; var20Lifetime3 = var20Lifetime3 + param1[5].field_r) {
                param1[5].e(var13, var20Lifetime3);
              }
              si.a(rj.field_M);
            }
            if (param1[4] != null &&
              param1[4].field_u != 0 &&
              param1[4].field_r != 0) {
              si.f(var16, var18, var17, var19);
              for (var20Lifetime4 = var14; var15 > var20Lifetime4; var20Lifetime4 = var20Lifetime4 + param1[4].field_r) {
                for (var21 = var12; var13 > var21; var21 = var21 + param1[4].field_u) {
                  param1[4].e(var21, var20Lifetime4);
                }
              }
              si.a(rj.field_M);
              return;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_74_0 = var6;
          stackIn_74_1 = new StringBuilder().append("hm.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_75_2 = "null";
          } else {
            stackIn_75_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_74_0), ((StringBuilder) (Object) stackIn_74_1).append(stackIn_75_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    hm(int param0, int param1, int param2, int param3, int param4, int param5) {
        this.field_j = param5;
        this.field_k = param3;
        this.field_p = param1;
        this.field_i = param2;
        this.field_h = param4;
        this.field_m = param0;
    }

    final static void a(int param0, int param1, vi param2, int param3, int param4) {
        try {
          param2.d(param4 - 4023, 12);
          param2.a((byte) -113, 17);
          param2.a((byte) -110, param0);
          if (param4 != 4122) {
            bd[] var6 = (bd[]) null;
            hm.a(84, (bd[]) null, false, 109, 3, -79);
          }
          param2.a((byte) -128, param1);
          param2.d(122, param3);
        } catch (RuntimeException runtimeException) {
          throw wg.a((Throwable) ((Object) runtimeException), "hm.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        field_o = "Please send me news and updates (I can unsubscribe at any time)";
        field_n = "Names should contain a maximum of 12 characters";
    }
}
