/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class d {
    static long field_a;
    static int[] field_c;
    static int[] field_e;
    boolean field_b;
    String field_f;
    String field_d;

    public static void a(boolean param0) {
        field_e = null;
        if (param0) {
          field_e = (int[]) null;
        }
        field_c = null;
    }

    final static boolean a(byte param0) {
        int var1;
        boolean stackIn_5_0 = false;
        var1 = 126 % ((param0 - 47) / 33);
        stackIn_5_0 = (ta.field_g >= 10) && (!qg.field_d) && (!bd.c(false));
        return stackIn_5_0;
    }

    final static void a(int param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int[] param8, int param9, int param10) {
        int var12 = 0;
        int var13 = 0;
        int incrementValue$1 = 0;
        int stackIn_15_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var11_int = 0;
        RuntimeException var11 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        var23 = Lexicominos.field_L ? 1 : 0;
        try {
          var11_int = -param0 + 256;
          if (param7 != -61498200) {
            return;
          }
          for (var12 = -param3; var12 < 0; var12++) {
            for (var13 = -param5; var13 < 0; var13++) {
              param9 = param1[param6++];
              if (param9 == 0) {
                param10++;
              } else {
                var14 = (param9 & 16725506) >> 16;
                var15 = 255 & param9 >> 8;
                var16 = 255 & param9;
                var17 = param8[param10];
                var18 = 255 & var17 >> 16;
                var19 = 15 & var17 >> 8;
                var20 = 255 & var17;
                if (var14 > var15) {
                  stackIn_15_0 = (var16 < var14) ? var14 : var16;
                } else {
                  stackIn_15_0 = (var15 <= var16) ? var16 : var15;
                }
                var21 = stackIn_15_0;
                if (var18 > var19) {
                  stackIn_22_0 = (var18 > var20) ? var18 : var20;
                } else {
                  stackIn_22_0 = (var19 <= var20) ? var20 : var19;
                }
                var22 = stackIn_22_0;
                if (var21 > var22) {
                  param9 = var22 * var15 / var21 << 8 | var14 * var22 / var21 << 16 | var16 * var22 / var21;
                }
                incrementValue$1 = param10;
                param10++;
                param8[incrementValue$1] = tb.a(vg.a(16711935, param0 * vg.a(param9, 16711935) + var11_int * vg.a(var17, 16711935) >> 8), vg.a(param0 * vg.a(65280, param9) + var11_int * vg.a(var17, 65280), 16711696) >> 8);
              }
            }
            param10 = param10 + param2;
            param6 = param6 + param4;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var11 = decompiledCaughtException;
          stackIn_32_0 = var11;
          stackIn_32_1 = new StringBuilder().append("d.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          stackIn_35_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');
          if (param8 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(',').append(param9).append(',').append(param10).append(')').toString());
        }
    }

    static {
        int var1 = 0;
        int var2 = 0;
        int var0;
        field_c = new int[256];
        for (var1 = 0; var1 < 256; var1++) {
          var0 = var1;
          for (var2 = 0; var2 < 8; var2++) {
            if ((var0 & 1) != 1) {
              var0 = var0 >>> 1;
            } else {
              var0 = -306674912 ^ var0 >>> 1;
            }
          }
          field_c[var1] = var0;
        }
    }
}
