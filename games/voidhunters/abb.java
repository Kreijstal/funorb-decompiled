/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class abb {
    static int field_a;
    static String field_b;

    final static void a(int param0, int param1, int param2, int param3, phb[] param4, int param5) {
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
        var22 = VoidHunters.field_G;
        try {
          if (param4 == null) {
            return;
          }
          if (0 < param2 &&
            0 < param1) {
            if (param4[param0] == null) {
              stackIn_11_0 = 0;
            } else {
              stackIn_11_0 = param4[3].field_m;
            }
            var6_int = stackIn_11_0;
            if (null != param4[5]) {
              stackIn_14_0 = param4[5].field_m;
            } else {
              stackIn_14_0 = 0;
            }
            var7 = stackIn_14_0;
            if (param4[1] == null) {
              stackIn_17_0 = 0;
            } else {
              stackIn_17_0 = param4[1].field_n;
            }
            var8 = stackIn_17_0;
            if (param4[7] != null) {
              stackIn_20_0 = param4[7].field_n;
            } else {
              stackIn_20_0 = 0;
            }
            var9 = stackIn_20_0;
            var10 = param5 + param2;
            var11 = param1 + param3;
            var12 = param5 + var6_int;
            var13 = -var7 + var10;
            var14 = param3 + var8;
            var15 = -var9 + var11;
            var16 = var12;
            var17 = var13;
            if (var16 > var17) {
              var17 = param2 * var6_int / (var6_int + var7) + param5;
              var16 = param2 * var6_int / (var6_int + var7) + param5;
            }
            var18 = var14;
            var19 = var15;
            if (var19 < var18) {
              var19 = param1 * var8 / (var9 + var8) + param3;
              var18 = param1 * var8 / (var9 + var8) + param3;
            }
            dma.a(eja.field_o);
            if (param4[0] != null) {
              dma.g(param5, param3, var16, var18);
              param4[0].a(param5, param3);
              dma.b(eja.field_o);
            }
            if (param4[2] != null) {
              dma.g(var17, param3, var10, var18);
              param4[2].a(var13, param3);
              dma.b(eja.field_o);
            }
            if (null != param4[6]) {
              dma.g(param5, var19, var16, var11);
              param4[6].a(param5, var15);
              dma.b(eja.field_o);
            }
            if (null != param4[8]) {
              dma.g(var17, var19, var10, var11);
              param4[8].a(var13, var15);
              dma.b(eja.field_o);
            }
            if (param4[1] != null &&
              0 != param4[1].field_m) {
              dma.g(var16, param3, var17, var18);
              for (var20 = var12; var20 < var13; var20 = var20 + param4[1].field_m) {
                param4[1].a(var20, param3);
              }
              dma.b(eja.field_o);
            }
            if (null != param4[7] &&
              param4[7].field_m != 0) {
              dma.g(var16, var19, var17, var11);
              for (var20Lifetime1 = var12; var13 > var20Lifetime1; var20Lifetime1 = var20Lifetime1 + param4[7].field_m) {
                param4[7].a(var20Lifetime1, var15);
              }
              dma.b(eja.field_o);
            }
            if (param4[3] != null &&
              0 != param4[3].field_n) {
              dma.g(param5, var18, var16, var19);
              for (var20Lifetime2 = var14; var15 > var20Lifetime2; var20Lifetime2 = var20Lifetime2 + param4[3].field_n) {
                param4[3].a(param5, var20Lifetime2);
              }
              dma.b(eja.field_o);
            }
            if (null != param4[5] &&
              param4[5].field_n != 0) {
              dma.g(var17, var18, var10, var19);
              for (var20Lifetime3 = var14; var15 > var20Lifetime3; var20Lifetime3 = var20Lifetime3 + param4[5].field_n) {
                param4[5].a(var13, var20Lifetime3);
              }
              dma.b(eja.field_o);
            }
            if (null != param4[4] &&
              0 != param4[4].field_m &&
              param4[4].field_n != 0) {
              dma.g(var16, var18, var17, var19);
              for (var20Lifetime4 = var14; var20Lifetime4 < var15; var20Lifetime4 = var20Lifetime4 + param4[4].field_n) {
                for (var21 = var12; var13 > var21; var21 = var21 + param4[4].field_m) {
                  param4[4].a(var21, var20Lifetime4);
                }
              }
              dma.b(eja.field_o);
              return;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_74_0 = var6;
          stackIn_74_1 = new StringBuilder().append("abb.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_75_2 = "null";
          } else {
            stackIn_75_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_74_0), ((StringBuilder) (Object) stackIn_74_1).append(stackIn_75_2).append(',').append(param5).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 != 4) {
          field_b = (String) null;
        }
    }

    abstract long a(byte param0);

    static {
        field_b = "Scrambler";
    }
}
