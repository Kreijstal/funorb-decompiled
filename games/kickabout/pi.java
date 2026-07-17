/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pi {
    static gq field_b;
    static String field_c;
    static String field_d;
    static ut field_a;

    final static void a(int param0, sp param1) {
        try {
            np.field_Jb.a((gn) (Object) new ce(param1), 3);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "pi.D(" + 6022 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    public static void a() {
        field_a = null;
        field_c = null;
        field_b = null;
        field_d = null;
        int var1 = 1;
    }

    final static boolean a(int param0, char param1) {
        if (param1 == 32) {
            return true;
        }
        if (param1 == 40) {
            return true;
        }
        if (param1 == 41) {
            return true;
        }
        return false;
    }

    final static vn a(int param0, int param1, int param2, up param3, int param4, boolean param5) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        vn var11 = null;
        Object stackIn_2_0 = null;
        vn stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        vn stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            var6_int = param3.field_q;
            if (param0 > 90) {
              var7 = param3.field_j;
              var8 = (4045 & var7) >> 8;
              var9 = (246 & var7) >> 4;
              var10 = 15 & var7;
              var11 = fp.a(param4, param2, var8, var6_int, var9, var10, param1, false, false, param5);
              stackOut_3_0 = (vn) var11;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (vn) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var6 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var6;
            stackOut_5_1 = new StringBuilder().append("pi.A(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param3 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param4 + 44 + param5 + 41);
        }
        return stackIn_4_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Loading park";
        field_d = "The league system is currently unavailable .";
    }
}
