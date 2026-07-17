/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rf {
    static sb field_c;
    static ea field_d;
    static int field_b;
    static String field_a;

    final static ed a(byte param0, String param1) {
        RuntimeException var2 = null;
        Object stackIn_4_0 = null;
        Object stackIn_9_0 = null;
        ed stackIn_11_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        ed stackOut_10_0 = null;
        Object stackOut_8_0 = null;
        Object stackOut_3_0 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == -75) {
                break L1;
              } else {
                rf.a((byte) -48);
                break L1;
              }
            }
            if (bd.field_h != ci.field_e) {
              L2: {
                if (bd.field_h != kd.field_p) {
                  break L2;
                } else {
                  if (param1.equals((Object) (Object) ic.field_m)) {
                    bd.field_h = mc.field_t;
                    stackOut_10_0 = sd.field_d;
                    stackIn_11_0 = stackOut_10_0;
                    break L0;
                  } else {
                    break L2;
                  }
                }
              }
              ic.field_m = param1;
              sd.field_d = null;
              bd.field_h = ci.field_e;
              stackOut_8_0 = null;
              stackIn_9_0 = stackOut_8_0;
              return (ed) (Object) stackIn_9_0;
            } else {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              return (ed) (Object) stackIn_4_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var2;
            stackOut_12_1 = new StringBuilder().append("rf.A(").append(param0).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L3;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 41);
        }
        return stackIn_11_0;
    }

    final static boolean a(int param0) {
        return rj.field_f == 13 || ul.field_b > 0;
    }

    public static void a(byte param0) {
        field_a = null;
        field_d = null;
        if (param0 != -56) {
            rf.a((byte) -36);
            field_c = null;
            return;
        }
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new sb(256);
        field_a = "Logging in...";
    }
}
