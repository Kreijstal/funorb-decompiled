/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jn {
    static int field_c;
    static int[] field_f;
    static int field_d;
    static String field_a;
    static String field_e;
    static wk[][] field_b;

    public static void a(int param0) {
        if (param0 > -94) {
            jn.a(84);
        }
        field_a = null;
        field_f = null;
        field_b = null;
        field_e = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int[] param7, int param8, int param9) {
        int[] var10 = null;
        RuntimeException var10_ref = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int[] var17 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        var16 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: while (true) {
              param5--;
              if (param5 < 0) {
                break L0;
              } else {
                var17 = param7;
                var10 = var17;
                var11 = param4;
                var12 = param1;
                var13 = param6;
                var14 = param0;
                var15 = (16711422 & var17[var11]) >> 1;
                var10[var11] = var15 + (rn.a(33423424, var13) >> 9) + (rn.a(33423360, var12) >> 1) + (rn.a(33544325, var14) >> 17);
                param0 = param0 + param9;
                param1 = param1 + param2;
                param4++;
                param6 = param6 + param8;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var10_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var10_ref;
            stackOut_4_1 = new StringBuilder().append("jn.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(33423424).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param7 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param8 + ',' + param9 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        long var4 = 0L;
        long var6 = 0L;
        int var3 = 0;
        int var2 = 0;
        int var1 = 0;
        field_c = 15;
        field_a = "Save and Exit";
        field_f = new int[98304];
        for (var0 = 92682; var0 >= 46341; var0--) {
            var4 = (long)(-1 + (var0 << 1));
            var6 = (long)((var0 << 1) - -1);
            var3 = (int)((var6 * var6 >> 18) + -32768L);
            var2 = (int)((var4 * var4 >> 18) + -32768L);
            if (field_f.length <= var3) {
                var3 = field_f.length + -1;
            }
            for (var1 = var2 >= 0 ? var2 : 0; var1 <= var3; var1++) {
                field_f[var1] = var0;
            }
        }
        field_e = "Achievements";
    }
}
