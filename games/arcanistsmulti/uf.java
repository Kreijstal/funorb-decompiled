/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uf {
    static String field_b;
    static vn field_a;

    final static void a(int param0, int param1, int param2, boolean param3, int param4, String param5, int param6, int param7) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            L1: {
              if (ch.field_d.field_U == 0) {
                break L1;
              } else {
                if (!wh.field_g) {
                  if (ld.field_p) {
                    gj.a((byte) -124);
                    break L1;
                  } else {
                    ef.field_r = true;
                    break L1;
                  }
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (!ef.field_r) {
                break L2;
              } else {
                fn.a(20, param5, param1, param1, (byte) -104, param2, param7, param0, param6);
                tm.field_d.b(param3, (byte) 52);
                if (!param3) {
                  break L2;
                } else {
                  L3: {
                    if (hf.field_f.field_U != 0) {
                      ef.field_r = false;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  if (0 != ih.field_d.field_U) {
                    ue.b(10);
                    ef.field_r = false;
                    break L2;
                  } else {
                    return;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) runtimeException;
            stackOut_15_1 = new StringBuilder().append("uf.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(-7361).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param5 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L4;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L4;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ',' + param6 + ',' + param7 + ')');
        }
    }

    public static void a() {
        field_a = null;
        int var1 = 17;
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Waiting for <%0> to start the game...";
    }
}
