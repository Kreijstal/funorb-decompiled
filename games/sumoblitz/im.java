/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class im {
    static ha field_c;
    static hr field_a;
    static jn field_b;

    public static void a() {
        field_a = null;
        field_b = null;
        field_c = null;
    }

    final static an a(byte param0, String param1) {
        RuntimeException var2 = null;
        Object stackIn_4_0 = null;
        an stackIn_8_0 = null;
        Object stackIn_10_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        an stackOut_7_0 = null;
        Object stackOut_9_0 = null;
        Object stackOut_3_0 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            L1: {
              if (param0 <= -23) {
                break L1;
              } else {
                field_c = null;
                break L1;
              }
            }
            if (ad.field_p != vm.field_c) {
              L2: {
                if (st.field_z != vm.field_c) {
                  break L2;
                } else {
                  if (!param1.equals((Object) (Object) tl.field_s)) {
                    break L2;
                  } else {
                    vm.field_c = hm.field_a;
                    stackOut_7_0 = jh.field_z;
                    stackIn_8_0 = stackOut_7_0;
                    return stackIn_8_0;
                  }
                }
              }
              jh.field_z = null;
              vm.field_c = ad.field_p;
              tl.field_s = param1;
              stackOut_9_0 = null;
              stackIn_10_0 = stackOut_9_0;
              break L0;
            } else {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              return (an) (Object) stackIn_4_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var2;
            stackOut_11_1 = new StringBuilder().append("im.A(").append(param0).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 41);
        }
        return (an) (Object) stackIn_10_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = null;
    }
}
