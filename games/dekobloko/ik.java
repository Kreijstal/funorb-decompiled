/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ik {
    static gb field_e;
    static int[][] field_h;
    static ei[] field_c;
    static String[] field_d;
    static ck[][] field_b;
    static String field_g;
    static wg field_f;
    static String field_a;

    final static void a(int param0, ck param1, String param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              lb.field_h = param1;
              n.field_b = param2;
              if (param0 == 200) {
                break L1;
              } else {
                field_f = null;
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
            stackOut_3_1 = new StringBuilder().append("ik.G(").append(param0).append(44);
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
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
          L3: {
            stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 41);
        }
    }

    final static void c(int param0) {
        if (param0 < 34) {
            field_h = null;
            dj.a(wd.field_c, 22);
            return;
        }
        dj.a(wd.field_c, 22);
    }

    public static void b(int param0) {
        field_c = null;
        field_g = null;
        field_f = null;
        field_d = null;
        field_a = null;
        field_b = null;
        field_e = null;
        field_h = null;
    }

    final synchronized static long a(int param0) {
        long var1 = 0L;
        if (param0 != 4) {
          return -114L;
        } else {
          L0: {
            var1 = System.currentTimeMillis();
            if (jf.field_d > var1) {
              pm.field_e = pm.field_e + (-var1 + jf.field_d);
              break L0;
            } else {
              break L0;
            }
          }
          jf.field_d = var1;
          return pm.field_e + var1;
        }
    }

    final static int a(byte param0, int param1) {
        int var2 = -14 % ((param0 - 36) / 56);
        return 200 * (-1 + param1) * param1;
    }

    final static boolean a(String param0, byte param1) {
        return g.a(-3805, param0) != null;
    }

    final static ta a(int param0, String param1) {
        RuntimeException var2 = null;
        Object stackIn_6_0 = null;
        ta stackIn_8_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        ta stackOut_7_0 = null;
        Object stackOut_5_0 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              if (!jj.field_f.a(91)) {
                break L1;
              } else {
                if (!param1.equals((Object) (Object) jj.field_f.b((byte) 86))) {
                  jj.field_f = ui.a(0, param1);
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            if (param0 > 96) {
              stackOut_7_0 = jj.field_f;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_5_0 = null;
              stackIn_6_0 = stackOut_5_0;
              return (ta) (Object) stackIn_6_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var2;
            stackOut_9_1 = new StringBuilder().append("ik.F(").append(param0).append(44);
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L2;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L2;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 41);
        }
        return stackIn_8_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new String[]{null, "Or click", "Or click", "Or click", "Or click", "Or click", "Or click", "Or click"};
        field_g = "Offer unrated rematch";
        field_b = new ck[6][4];
        field_c = new ei[8];
        field_f = new wg();
        field_a = "Open";
    }
}
