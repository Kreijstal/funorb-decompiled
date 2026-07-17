/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ta {
    static String field_b;
    static String field_a;

    final static void a(String param0, boolean param1, int param2) {
        try {
            fd.field_k = true;
            ok.field_h = param1 ? true : false;
            nb.field_b = new si(jl.field_I, be.field_x, param0, qi.field_b, ok.field_h);
            jl.field_I.a((gl) (Object) nb.field_b, (byte) -1);
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) (Object) runtimeException, "ta.A(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + 10 + 41);
        }
    }

    public static void a(boolean param0) {
        field_a = null;
        field_b = null;
    }

    final static pd a(boolean param0, String param1) {
        RuntimeException var2 = null;
        Object stackIn_5_0 = null;
        pd stackIn_9_0 = null;
        Object stackIn_11_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        pd stackOut_8_0 = null;
        Object stackOut_10_0 = null;
        Object stackOut_4_0 = null;
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
            if (pe.field_a != ua.field_d) {
              if (param0) {
                L1: {
                  if (pe.field_a != k.field_b) {
                    break L1;
                  } else {
                    if (!param1.equals((Object) (Object) vh.field_l)) {
                      break L1;
                    } else {
                      pe.field_a = og.field_a;
                      stackOut_8_0 = h.field_c;
                      stackIn_9_0 = stackOut_8_0;
                      return stackIn_9_0;
                    }
                  }
                }
                h.field_c = null;
                vh.field_l = param1;
                pe.field_a = ua.field_d;
                stackOut_10_0 = null;
                stackIn_11_0 = stackOut_10_0;
                break L0;
              } else {
                stackOut_4_0 = null;
                stackIn_5_0 = stackOut_4_0;
                return (pd) (Object) stackIn_5_0;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var2;
            stackOut_12_1 = new StringBuilder().append("ta.C(").append(param0).append(44);
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
              break L2;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L2;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 41);
        }
        return (pd) (Object) stackIn_11_0;
    }

    final static int a(CharSequence param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var2_int = 23 % ((param1 - 65) / 45);
            stackOut_0_0 = wl.a(true, param0, false, 10);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("ta.D(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 44 + param1 + 41);
        }
        return stackIn_1_0;
    }

    final static void a(int param0) {
        int var1 = 27;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Out of ammo";
        field_b = "Difficulty: Normal";
    }
}
