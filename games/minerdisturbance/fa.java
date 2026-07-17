/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fa {
    static boolean field_e;
    static boolean field_b;
    static bj field_d;
    static volatile boolean field_a;
    static String field_c;

    final static void c(int param0) {
        if (null != mb.field_b) {
            mb.field_b.a(true);
            if (!(null == bd.field_e)) {
                bd.field_e.r(4595);
            }
            tc.a(9358);
            return;
        }
        if (!(null == bd.field_e)) {
            bd.field_e.r(4595);
        }
        tc.a(9358);
    }

    final static boolean a(boolean param0) {
        return g.field_o;
    }

    public static void a(int param0) {
        field_c = null;
        field_d = null;
    }

    final static void b(int param0) {
        int[] var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int[] var4 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = MinerDisturbance.field_ab;
        try {
          L0: {
            if (null != di.field_x) {
              var4 = di.field_x;
              var1 = var4;
              if (param0 == 15257) {
                var2 = 0;
                L1: while (true) {
                  if (var2 >= 8) {
                    break L0;
                  } else {
                    var4[var2] = 0;
                    var2++;
                    continue L1;
                  }
                }
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw lj.a((Throwable) (Object) var1_ref, "fa.B(" + param0 + 41);
        }
    }

    final static boolean a(String param0, byte param1) {
        RuntimeException var2 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
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
              if (nd.a(1, param0) == null) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L1;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var2;
            stackOut_6_1 = new StringBuilder().append("fa.E(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + 66 + 41);
        }
        return stackIn_5_0 != 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = false;
        field_a = false;
        field_c = null;
    }
}
