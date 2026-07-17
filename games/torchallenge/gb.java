/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gb {
    static String field_e;
    static int field_b;
    static vb field_d;
    static int[] field_c;
    static double field_a;
    static h field_f;

    final static void a(int param0, int param1, eg param2, int param3, ka[] param4, ka[] param5, boolean param6, int param7, eg param8) {
        try {
            Object var16 = null;
            bh.a(24, 240, ai.field_d, 0, param4, qa.field_f, 24, param5, param7, 18, 32, 320, 0, 2, param8, 8, -96, 480, (ka[]) null, lg.field_f, param2);
            int var15_int = 0;
            ik.a(param6, -27055);
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) (Object) runtimeException, "gb.C(" + 2 + 44 + -66 + 44 + (param2 != null ? "{...}" : "null") + 44 + 32 + 44 + (param4 != null ? "{...}" : "null") + 44 + (param5 != null ? "{...}" : "null") + 44 + param6 + 44 + param7 + 44 + (param8 != null ? "{...}" : "null") + 44 + 24 + 44 + 24 + 44 + 8 + 44 + 18 + 44 + 320 + 44 + 240 + 41);
        }
    }

    final static qj a(int param0, byte[] param1) {
        qj var2 = null;
        RuntimeException var2_ref = null;
        Object stackIn_2_0 = null;
        qj stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        qj stackOut_3_0 = null;
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
            if (param1 != null) {
              var2 = new qj(param1, ug.field_e, dd.field_t, pg.field_r, lg.field_e, td.field_m, h.field_a);
              int discarded$2 = 0;
              p.a();
              stackOut_3_0 = (qj) var2;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (qj) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2_ref;
            stackOut_5_1 = new StringBuilder().append("gb.B(").append(-28993).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
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
          throw oj.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 41);
        }
        return stackIn_4_0;
    }

    final static vi a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Object stackIn_9_0 = null;
        vi stackIn_12_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        vi stackOut_11_0 = null;
        Object stackOut_8_0 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var5 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            var2_int = param1.length();
            var3 = 0;
            L1: while (true) {
              if (var3 >= var2_int) {
                stackOut_11_0 = di.field_g;
                stackIn_12_0 = stackOut_11_0;
                break L0;
              } else {
                var4 = param1.charAt(var3);
                if (var4 >= 48) {
                  if (57 >= var4) {
                    var3++;
                    continue L1;
                  } else {
                    stackOut_8_0 = null;
                    stackIn_9_0 = stackOut_8_0;
                    return (vi) (Object) stackIn_9_0;
                  }
                } else {
                  return null;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var2;
            stackOut_13_1 = new StringBuilder().append("gb.A(").append(-113).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L2;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L2;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 41);
        }
        return stackIn_12_0;
    }

    final static int b() {
        int var1 = -82;
        return ea.field_f;
    }

    public static void a() {
        field_f = null;
        field_e = null;
        field_c = null;
        field_d = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 20;
        field_e = "Create a free account to start using this feature";
        field_c = new int[]{11, 22, 1};
        field_a = Math.atan2(1.0, 0.0);
    }
}
