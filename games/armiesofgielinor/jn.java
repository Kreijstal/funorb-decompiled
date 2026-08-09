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
        field_b = (wk[][]) null;
        field_e = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int[] param7, int param8, int param9) {
        int[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int[] var17 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var10_ref = null;
        var16 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: while (true) {
              param5--;
              if (-1 < (param5 ^ -1)) {
                L2: {
                  if (param3 == 33423424) {
                    break L2;
                  } else {
                    field_a = (String) null;
                    break L2;
                  }
                }
                break L0;
              } else {
                var17 = param7;
                var10 = var17;
                var11 = param4;
                var12 = param1;
                var13 = param6;
                var14 = param0;
                var15 = (16711422 & var17[var11]) >> 2103577121;
                var10[var11] = var15 + (rn.a(33423424, var13) >> 555900105) + (rn.a(33423360, var12) >> 1075032961) + (rn.a(33544325, var14) >> 680561425);
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
          L3: {
            var10_ref = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var10_ref);

            stackIn_8_1 = new StringBuilder().append("jn.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');

            if (param7 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param8 + ',' + param9 + ')');
        }
    }

    static {
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
            var4 = (long)(-1 + (var0 << 1599713953));
            var6 = (long)((var0 << -563895263) - -1);
            var3 = (int)((var6 * var6 >> -766032622) + -32768L);
            var2 = (int)((var4 * var4 >> -1732596782) + -32768L);
            if (field_f.length <= var3) {
                var3 = field_f.length + -1;
            }
            for (var1 = (var2 ^ -1) <= -1 ? var2 : 0; var1 <= var3; var1++) {
                field_f[var1] = var0;
            }
        }
        field_e = "Achievements";
    }
}
