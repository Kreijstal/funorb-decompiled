/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ti extends sf {
    static el field_bb;
    String field_db;
    static int field_eb;
    int field_ab;
    String field_Z;
    static volatile boolean field_cb;

    final static void a(int param0, int param1, int param2, hj[] param3, int param4, int param5) {
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
        var22 = OrbDefence.field_D ? 1 : 0;
        try {
          if (param3 == null) {
            return;
          }
          if (0 < param2 &&
            param0 > 0) {
            if (null != param3[3]) {
              stackIn_11_0 = param3[3].field_s;
            } else {
              stackIn_11_0 = 0;
            }
            var6_int = stackIn_11_0;
            if (null != param3[5]) {
              stackIn_14_0 = param3[5].field_s;
            } else {
              stackIn_14_0 = 0;
            }
            var7 = stackIn_14_0;
            if (param3[1] != null) {
              stackIn_17_0 = param3[1].field_t;
            } else {
              stackIn_17_0 = 0;
            }
            var8 = stackIn_17_0;
            if (null != param3[7]) {
              stackIn_20_0 = param3[7].field_t;
            } else {
              stackIn_20_0 = 0;
            }
            var9 = stackIn_20_0;
            var10 = param4 + param2;
            var11 = param5 + param0;
            var12 = param4 + var6_int;
            var13 = -var7 + var10;
            var14 = var8 + param5;
            var15 = -var9 + var11;
            var16 = var12;
            var17 = var13;
            if (var16 > var17) {
              var17 = var6_int * param2 / (var7 + var6_int) + param4;
              var16 = var6_int * param2 / (var7 + var6_int) + param4;
            }
            var18 = var14;
            var19 = var15;
            if (param1 != 6) {
              return;
            }
            ul.a(sf.field_K);
            if (var18 > var19) {
              var19 = param0 * var8 / (var9 + var8) + param5;
              var18 = param0 * var8 / (var9 + var8) + param5;
            }
            if (null != param3[0]) {
              ul.i(param4, param5, var16, var18);
              param3[0].c(param4, param5);
              ul.b(sf.field_K);
            }
            if (null != param3[2]) {
              ul.i(var17, param5, var10, var18);
              param3[2].c(var13, param5);
              ul.b(sf.field_K);
            }
            if (param3[6] != null) {
              ul.i(param4, var19, var16, var11);
              param3[6].c(param4, var15);
              ul.b(sf.field_K);
            }
            if (param3[8] != null) {
              ul.i(var17, var19, var10, var11);
              param3[8].c(var13, var15);
              ul.b(sf.field_K);
            }
            if (param3[1] != null &&
              0 != param3[1].field_s) {
              ul.i(var16, param5, var17, var18);
              for (var20 = var12; var13 > var20; var20 = var20 + param3[1].field_s) {
                param3[1].c(var20, param5);
              }
              ul.b(sf.field_K);
            }
            if (param3[7] != null &&
              param3[7].field_s != 0) {
              ul.i(var16, var19, var17, var11);
              for (var20Lifetime1 = var12; var13 > var20Lifetime1; var20Lifetime1 = var20Lifetime1 + param3[7].field_s) {
                param3[7].c(var20Lifetime1, var15);
              }
              ul.b(sf.field_K);
            }
            if (null != param3[3] &&
              0 != param3[3].field_t) {
              ul.i(param4, var18, var16, var19);
              for (var20Lifetime2 = var14; var20Lifetime2 < var15; var20Lifetime2 = var20Lifetime2 + param3[3].field_t) {
                param3[3].c(param4, var20Lifetime2);
              }
              ul.b(sf.field_K);
            }
            if (null != param3[5] &&
              param3[5].field_t != 0) {
              ul.i(var17, var18, var10, var19);
              for (var20Lifetime3 = var14; var15 > var20Lifetime3; var20Lifetime3 = var20Lifetime3 + param3[5].field_t) {
                param3[5].c(var13, var20Lifetime3);
              }
              ul.b(sf.field_K);
            }
            if (param3[4] != null &&
              0 != param3[4].field_s &&
              param3[4].field_t != 0) {
              ul.i(var16, var18, var17, var19);
              for (var20Lifetime4 = var14; var15 > var20Lifetime4; var20Lifetime4 = var20Lifetime4 + param3[4].field_t) {
                for (var21 = var12; var13 > var21; var21 = var21 + param3[4].field_s) {
                  param3[4].c(var21, var20Lifetime4);
                }
              }
              ul.b(sf.field_K);
              return;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_74_0 = var6;
          stackIn_74_1 = new StringBuilder().append("ti.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_75_2 = "null";
          } else {
            stackIn_75_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_74_0), ((StringBuilder) (Object) stackIn_74_1).append(stackIn_75_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    public static void e(int param0) {
        if (param0 < 49) {
          hj[] var2 = (hj[]) null;
          ti.a(-39, -56, -76, (hj[]) null, -29, -35);
        }
        field_bb = null;
    }

    ti() {
        super(0L, (sf) null);
    }

    static {
        field_cb = true;
    }
}
