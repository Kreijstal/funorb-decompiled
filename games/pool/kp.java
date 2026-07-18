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

    final static void a(rk param0) {
        try {
            int var2_int = 0;
            Pool.field_J = param0;
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) (Object) runtimeException, "kp.C(" + (param0 != null ? "{...}" : "null") + ',' + -92 + ')');
        }
    }

    public static void a() {
        field_c = null;
        field_i = null;
        int var1 = 1;
        field_h = null;
    }

    final static kf a(int param0, jg param1, int param2, int param3) {
        RuntimeException var4 = null;
        kf stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        kf stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            stackOut_2_0 = mn.a(-24296, nb.a(param1, 100, param3, param2));
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var4;
            stackOut_4_1 = new StringBuilder().append("kp.D(").append(100).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_3_0;
    }

    final static void a(int param0, int param1) {
        oq var2 = ej.field_j;
        var2.b(false, 4);
        var2.a(1, false);
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
