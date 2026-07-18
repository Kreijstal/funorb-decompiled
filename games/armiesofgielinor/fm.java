/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fm {
    static String field_b;
    static String field_c;
    static int[] field_d;
    static int field_a;

    public static void a() {
        field_d = null;
        field_b = null;
        field_c = null;
    }

    final static void a(wk[] param0, int param1, int param2, int param3, int param4) {
        RuntimeException runtimeException = null;
        Object var6 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              param0[0].g(param2, param3);
              param0[1].c(param0[1].field_y + param2, param3, -(param0[2].field_y << 1) + param1, param0[2].field_v);
              param0[2].g(param2 + param1 + -param0[2].field_y, param3);
              if (param4 <= -38) {
                break L1;
              } else {
                var6 = null;
                fm.a((wk[]) null, -67, 44, -43, -95);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("fm.C(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static int a(int param0, int param1) {
        int var3 = param0 >>> 24 & 255;
        int var4 = (-16777216 & param1) >>> 24;
        int var5 = var3 + var4;
        int var6 = (((255 & param1 >> 16) * var4 + var3 * ((16711680 & param0) >> 16)) / var5 & 1697972479) << 16;
        int var7 = (-1660944129 & (((65280 & param1) >> 8) * var4 + var3 * ((65280 & param0) >> 8)) / var5) << 8;
        int var8 = (var4 * (param1 & 255) + (param0 & 255) * var3) / var5 & 255;
        int var9 = (-(var4 * var3 >> 8) + (var4 + var3) & 255) << 24;
        return var7 | (var9 | var6) | var8;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Please wait...";
        field_b = "Magical hats to increase the power of magic attacks.";
        field_d = new int[5];
        field_a = 873;
    }
}
