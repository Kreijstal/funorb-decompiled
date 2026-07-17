/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kp {
    static String field_c;
    byte[] field_l;
    static int[][] field_i;
    int field_g;
    int field_b;
    int field_k;
    static int field_f;
    byte[] field_a;
    static int field_d;
    int field_o;
    int field_e;
    int field_n;
    int field_j;
    static int field_m;
    static eg field_h;

    final static void a(rk param0, byte param1) {
        try {
            int var2_int = 0;
            Pool.field_J = param0;
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) (Object) runtimeException, "kp.C(" + (param0 != null ? "{...}" : "null") + 44 + -92 + 41);
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_i = null;
        int var1 = 1;
        field_h = null;
    }

    final static kf a(int param0, jg param1, int param2, int param3) {
        RuntimeException var4 = null;
        Object stackIn_2_0 = null;
        kf stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        kf stackOut_3_0 = null;
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
            if (param0 == 100) {
              stackOut_3_0 = mn.a(-24296, nb.a(param1, 100, param3, param2));
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (kf) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var4;
            stackOut_5_1 = new StringBuilder().append("kp.D(").append(param0).append(44);
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
          throw wm.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_4_0;
    }

    final static void a(int param0, int param1) {
        oq var2 = ej.field_j;
        var2.b(false, param1);
        var2.a(param0, false);
        var2.a(2, false);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Show all private chat";
        field_m = 128;
    }
}
