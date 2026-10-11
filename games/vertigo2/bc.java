/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bc {
    static int field_b;
    static int field_c;
    static String field_a;

    final static void a(int param0, int param1, byte param2, er[] param3, int param4, int param5) {
        int var21 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
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
        var22 = Vertigo2.field_L ? 1 : 0;
        try {
          if (param3 == null) {
            return;
          }
          if (param2 <= 68) {
            return;
          }
          if (param4 > 0 &&
            param0 > 0) {
            if (param3[3] != null) {
              stackIn_12_0 = param3[3].field_x;
            } else {
              stackIn_12_0 = 0;
            }
            var6_int = stackIn_12_0;
            if (param3[5] != null) {
              stackIn_15_0 = param3[5].field_x;
            } else {
              stackIn_15_0 = 0;
            }
            var7 = stackIn_15_0;
            if (null != param3[1]) {
              stackIn_18_0 = param3[1].field_B;
            } else {
              stackIn_18_0 = 0;
            }
            var8 = stackIn_18_0;
            if (param3[7] != null) {
              stackIn_21_0 = param3[7].field_B;
            } else {
              stackIn_21_0 = 0;
            }
            var9 = stackIn_21_0;
            var10 = param4 + param5;
            var11 = param1 + param0;
            var12 = var6_int + param5;
            var13 = var10 - var7;
            var14 = var8 + param1;
            var15 = var11 - var9;
            var16 = var12;
            var17 = var13;
            if (var17 < var16) {
              var17 = param4 * var6_int / (var7 + var6_int) + param5;
              var16 = param4 * var6_int / (var7 + var6_int) + param5;
            }
            var18 = var14;
            var19 = var15;
            if (var19 < var18) {
              var19 = param0 * var8 / (var9 + var8) + param1;
              var18 = param0 * var8 / (var9 + var8) + param1;
            }
            bi.a(l.field_h);
            if (null != param3[0]) {
              bi.c(param5, param1, var16, var18);
              param3[0].e(param5, param1);
              bi.b(l.field_h);
            }
            if (param3[2] != null) {
              bi.c(var17, param1, var10, var18);
              param3[2].e(var13, param1);
              bi.b(l.field_h);
            }
            if (null != param3[6]) {
              bi.c(param5, var19, var16, var11);
              param3[6].e(param5, var15);
              bi.b(l.field_h);
            }
            if (null != param3[8]) {
              bi.c(var17, var19, var10, var11);
              param3[8].e(var13, var15);
              bi.b(l.field_h);
            }
            if (null != param3[1] &&
              param3[1].field_x != 0) {
              bi.c(var16, param1, var17, var18);
              for (var20 = var12; var20 < var13; var20 = var20 + param3[1].field_x) {
                param3[1].e(var20, param1);
              }
              bi.b(l.field_h);
            }
            if (param3[7] != null &&
              param3[7].field_x != 0) {
              bi.c(var16, var19, var17, var11);
              for (var20Lifetime1 = var12; var13 > var20Lifetime1; var20Lifetime1 = var20Lifetime1 + param3[7].field_x) {
                param3[7].e(var20Lifetime1, var15);
              }
              bi.b(l.field_h);
            }
            if (param3[3] != null &&
              param3[3].field_B != 0) {
              bi.c(param5, var18, var16, var19);
              for (var20Lifetime2 = var14; var15 > var20Lifetime2; var20Lifetime2 = var20Lifetime2 + param3[3].field_B) {
                param3[3].e(param5, var20Lifetime2);
              }
              bi.b(l.field_h);
            }
            if (null != param3[5] &&
              param3[5].field_B != 0) {
              bi.c(var17, var18, var10, var19);
              for (var20Lifetime3 = var14; var15 > var20Lifetime3; var20Lifetime3 = var20Lifetime3 + param3[5].field_B) {
                param3[5].e(var13, var20Lifetime3);
              }
              bi.b(l.field_h);
            }
            if (null != param3[4] &&
              0 != param3[4].field_x &&
              0 != param3[4].field_B) {
              bi.c(var16, var18, var17, var19);
              for (var20Lifetime4 = var14; var20Lifetime4 < var15; var20Lifetime4 = var20Lifetime4 + param3[4].field_B) {
                for (var21 = var12; var13 > var21; var21 = var21 + param3[4].field_x) {
                  param3[4].e(var21, var20Lifetime4);
                }
              }
              bi.b(l.field_h);
              return;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_75_0 = var6;
          stackIn_75_1 = new StringBuilder().append("bc.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_76_2 = "null";
          } else {
            stackIn_76_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_75_0), ((StringBuilder) (Object) stackIn_75_1).append(stackIn_76_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != 7) {
          field_a = (String) null;
        }
    }

    static {
        field_b = 71;
        field_a = "If you do nothing the game will revert to normal view in <%0> second.";
    }
}
