/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oc {
    static int field_b;
    static byte[][] field_a;

    final static void a(dl[] param0, int param1, int param2, int param3, int param4, int param5) {
        int var21 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
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
        var22 = CrazyCrystals.field_B;
        try {
          if (param0 == null) {
            return;
          }
          if (0 < param4 &&
            param1 > 0) {
            if (param0[3] == null) {
              stackIn_10_0 = 0;
            } else {
              stackIn_10_0 = param0[3].field_n;
            }
            var6_int = stackIn_10_0;
            if (null != param0[5]) {
              stackIn_13_0 = param0[5].field_n;
            } else {
              stackIn_13_0 = 0;
            }
            var7 = stackIn_13_0;
            if (null != param0[1]) {
              stackIn_16_0 = param0[1].field_o;
            } else {
              stackIn_16_0 = 0;
            }
            var8 = stackIn_16_0;
            if (param0[7] != null) {
              stackIn_19_0 = param0[7].field_o;
            } else {
              stackIn_19_0 = 0;
            }
            var9 = stackIn_19_0;
            var10 = param4 + param3;
            var11 = param2 + param1;
            var12 = var6_int + param3;
            var13 = -var7 + var10;
            var14 = param2 + var8;
            var15 = var11 - var9;
            var16 = var12;
            var17 = var13;
            if (var17 < var16) {
              var17 = param4 * var6_int / (var6_int + var7) + param3;
              var16 = param4 * var6_int / (var6_int + var7) + param3;
            }
            if (param5 >= -45) {
              field_a = (byte[][]) null;
            }
            var18 = var14;
            var19 = var15;
            if (var18 > var19) {
              var19 = param1 * var8 / (var9 + var8) + param2;
              var18 = param1 * var8 / (var9 + var8) + param2;
            }
            kh.b(ec.field_i);
            if (null != param0[0]) {
              kh.a(param3, param2, var16, var18);
              param0[0].a(param3, param2);
              kh.a(ec.field_i);
            }
            if (param0[2] != null) {
              kh.a(var17, param2, var10, var18);
              param0[2].a(var13, param2);
              kh.a(ec.field_i);
            }
            if (null != param0[6]) {
              kh.a(param3, var19, var16, var11);
              param0[6].a(param3, var15);
              kh.a(ec.field_i);
            }
            if (null != param0[8]) {
              kh.a(var17, var19, var10, var11);
              param0[8].a(var13, var15);
              kh.a(ec.field_i);
            }
            if (null != param0[1] &&
              param0[1].field_n != 0) {
              kh.a(var16, param2, var17, var18);
              for (var20 = var12; var20 < var13; var20 = var20 + param0[1].field_n) {
                param0[1].a(var20, param2);
              }
              kh.a(ec.field_i);
            }
            if (null != param0[7] &&
              0 != param0[7].field_n) {
              kh.a(var16, var19, var17, var11);
              for (var20Lifetime1 = var12; var13 > var20Lifetime1; var20Lifetime1 = var20Lifetime1 + param0[7].field_n) {
                param0[7].a(var20Lifetime1, var15);
              }
              kh.a(ec.field_i);
            }
            if (null != param0[3] &&
              param0[3].field_o != 0) {
              kh.a(param3, var18, var16, var19);
              for (var20Lifetime2 = var14; var20Lifetime2 < var15; var20Lifetime2 = var20Lifetime2 + param0[3].field_o) {
                param0[3].a(param3, var20Lifetime2);
              }
              kh.a(ec.field_i);
            }
            if (null != param0[5] &&
              param0[5].field_o != 0) {
              kh.a(var17, var18, var10, var19);
              for (var20Lifetime3 = var14; var15 > var20Lifetime3; var20Lifetime3 = var20Lifetime3 + param0[5].field_o) {
                param0[5].a(var13, var20Lifetime3);
              }
              kh.a(ec.field_i);
            }
            if (param0[4] != null &&
              param0[4].field_n != 0 &&
              param0[4].field_o != 0) {
              kh.a(var16, var18, var17, var19);
              for (var20Lifetime4 = var14; var15 > var20Lifetime4; var20Lifetime4 = var20Lifetime4 + param0[4].field_o) {
                for (var21 = var12; var21 < var13; var21 = var21 + param0[4].field_n) {
                  param0[4].a(var21, var20Lifetime4);
                }
              }
              kh.a(ec.field_i);
              return;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_74_0 = var6;
          stackIn_74_1 = new StringBuilder().append("oc.A(");
          if (param0 == null) {
            stackIn_75_2 = "null";
          } else {
            stackIn_75_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_74_0), ((StringBuilder) (Object) stackIn_74_1).append(stackIn_75_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    public static void a(byte param0) {
        if (param0 != -121) {
          return;
        }
        field_a = (byte[][]) null;
    }

    static {
        field_a = new byte[50][];
    }
}
