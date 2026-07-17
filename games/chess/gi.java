/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gi {
    static String field_g;
    static String field_b;
    static long field_e;
    static ij field_a;
    static tk field_d;
    static km[] field_c;
    static String field_f;

    final static rk a(int param0, int param1, int param2, um param3) {
        RuntimeException var4 = null;
        rk stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        rk stackOut_5_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            if (tj.a(param2, param0, param3, (byte) 83)) {
              L1: {
                if (param1 == 3807) {
                  break L1;
                } else {
                  field_b = null;
                  break L1;
                }
              }
              stackOut_5_0 = th.b(param1 ^ 3807);
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var4;
            stackOut_7_1 = new StringBuilder().append("gi.B(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param3 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 41);
        }
        return stackIn_6_0;
    }

    final static void a(int param0, le param1, int param2, boolean param3, le param4, int param5) {
        try {
            ek.field_b = param5;
            if (param3) {
                Object var7 = null;
                gi.a(-26, (le) null, 18, false, (le) null, 96);
            }
            kl.field_i = param2;
            ie.field_b = param4;
            in.field_d = param1;
            m.field_d = param0;
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) (Object) runtimeException, "gi.C(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + param3 + 44 + (param4 != null ? "{...}" : "null") + 44 + param5 + 41);
        }
    }

    public static void a(boolean param0) {
        field_f = null;
        field_g = null;
        field_a = null;
        field_c = null;
        field_b = null;
        field_d = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Please enter your date of birth to enable chat:";
        field_a = new ij();
        field_d = new tk();
        field_f = null;
    }
}
