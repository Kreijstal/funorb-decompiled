/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ed {
    static double field_c;
    static ml field_d;
    static pb[] field_a;
    static int field_b;

    final static void a(int param0, int param1, int param2, pb[] param3, int param4, int param5) {
        int var21 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
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
        int var22 = 0;
        int var20Lifetime1;
        int var20Lifetime2;
        int var20Lifetime3;
        int var20Lifetime4;
        var22 = stellarshard.field_B;
        try {
          if (param3 == null) {
            return;
          }
          if (0 < param4 &&
            param5 > 0) {
            if (null == param3[3]) {
              stackIn_9_0 = 0;
            } else {
              stackIn_9_0 = param3[3].field_w;
            }
            var6_int = stackIn_9_0;
            if (null == param3[5]) {
              stackIn_12_0 = 0;
            } else {
              stackIn_12_0 = param3[5].field_w;
            }
            var7 = stackIn_12_0;
            if (param3[1] != null) {
              stackIn_15_0 = param3[1].field_x;
            } else {
              stackIn_15_0 = 0;
            }
            var8 = stackIn_15_0;
            if (param3[7] == null) {
              stackIn_18_0 = 0;
            } else {
              stackIn_18_0 = param3[7].field_x;
            }
            var9 = stackIn_18_0;
            if (param0 != -6313) {
              field_c = -1.021068867535498;
            }
            var10 = param4 + param1;
            var11 = param5 + param2;
            var12 = var6_int + param1;
            var13 = var10 - var7;
            var14 = param2 + var8;
            var15 = var11 - var9;
            var16 = var12;
            var17 = var13;
            if (var17 < var16) {
              var17 = param4 * var6_int / (var6_int + var7) + param1;
              var16 = param4 * var6_int / (var6_int + var7) + param1;
            }
            var18 = var14;
            var19 = var15;
            if (var19 < var18) {
              var19 = var8 * param5 / (var9 + var8) + param2;
              var18 = var8 * param5 / (var9 + var8) + param2;
            }
            ti.a(de.field_b);
            if (param3[0] != null) {
              ti.a(param1, param2, var16, var18);
              param3[0].e(param1, param2);
              ti.b(de.field_b);
            }
            if (param3[2] != null) {
              ti.a(var17, param2, var10, var18);
              param3[2].e(var13, param2);
              ti.b(de.field_b);
            }
            if (null != param3[6]) {
              ti.a(param1, var19, var16, var11);
              param3[6].e(param1, var15);
              ti.b(de.field_b);
            }
            if (null != param3[8]) {
              ti.a(var17, var19, var10, var11);
              param3[8].e(var13, var15);
              ti.b(de.field_b);
            }
            if (param3[1] != null &&
              param3[1].field_w != 0) {
              ti.a(var16, param2, var17, var18);
              for (var20 = var12; var13 > var20; var20 = var20 + param3[1].field_w) {
                param3[1].e(var20, param2);
              }
              ti.b(de.field_b);
            }
            if (null != param3[7] &&
              param3[7].field_w != 0) {
              ti.a(var16, var19, var17, var11);
              for (var20Lifetime1 = var12; var13 > var20Lifetime1; var20Lifetime1 = var20Lifetime1 + param3[7].field_w) {
                param3[7].e(var20Lifetime1, var15);
              }
              ti.b(de.field_b);
            }
            if (null != param3[3] &&
              param3[3].field_x != 0) {
              ti.a(param1, var18, var16, var19);
              for (var20Lifetime2 = var14; var20Lifetime2 < var15; var20Lifetime2 = var20Lifetime2 + param3[3].field_x) {
                param3[3].e(param1, var20Lifetime2);
              }
              ti.b(de.field_b);
            }
            if (param3[5] != null &&
              param3[5].field_x != 0) {
              ti.a(var17, var18, var10, var19);
              for (var20Lifetime3 = var14; var15 > var20Lifetime3; var20Lifetime3 = var20Lifetime3 + param3[5].field_x) {
                param3[5].e(var13, var20Lifetime3);
              }
              ti.b(de.field_b);
            }
            if (param3[4] != null &&
              param3[4].field_w != 0) {
              if (param3[4].field_x == 0) {
                return;
              }
              ti.a(var16, var18, var17, var19);
              for (var20Lifetime4 = var14; var15 > var20Lifetime4; var20Lifetime4 = var20Lifetime4 + param3[4].field_x) {
                for (var21 = var12; var21 < var13; var21 = var21 + param3[4].field_w) {
                  param3[4].e(var21, var20Lifetime4);
                }
              }
              ti.b(de.field_b);
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_75_0 = var6;
          stackIn_75_1 = new StringBuilder().append("ed.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_76_2 = "null";
          } else {
            stackIn_76_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_75_0), ((StringBuilder) (Object) stackIn_75_1).append(stackIn_76_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 > -24) {
          field_a = (pb[]) null;
        }
        field_d = null;
    }

    static {
        field_c = 0.0;
        field_b = 0;
    }
}
