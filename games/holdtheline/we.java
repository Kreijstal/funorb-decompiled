/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class we extends hl {
    int field_m;
    int field_i;
    static float field_n;
    int field_u;
    int[] field_k;
    int field_q;
    int field_s;
    static String field_t;
    static int field_j;
    static hj field_o;
    int field_r;
    static go field_p;
    static int field_l;

    final void a(int param0, int param1, int[] param2, int param3, int param4, int param5, int param6, int param7) {
        ((we) this).field_m = param5;
        ((we) this).field_u = param0;
        ((we) this).field_i = param1;
        ((we) this).field_k = param2;
        ((we) this).field_s = param7;
        if (param4 != -1) {
            return;
        }
        try {
            ((we) this).field_q = param3;
            ((we) this).field_r = param6;
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) (Object) runtimeException, "we.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    public static void a(byte param0) {
        field_o = null;
        field_p = null;
        field_t = null;
    }

    final static lc a(byte param0, String param1) {
        RuntimeException var2 = null;
        lc stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        lc stackOut_3_0 = null;
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
            L1: {
              if (!fj.field_o.a(250)) {
                break L1;
              } else {
                if (param1.equals((Object) (Object) fj.field_o.b((byte) 66))) {
                  break L1;
                } else {
                  fj.field_o = qn.a(param1, -7079);
                  break L1;
                }
              }
            }
            stackOut_3_0 = fj.field_o;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2;
            stackOut_5_1 = new StringBuilder().append("we.B(").append(-85).append(',');
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
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ')');
        }
        return stackIn_4_0;
    }

    we() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = 260.0f / (float)(-1.0 + Math.exp(10.0));
        field_l = 250;
        field_t = "Connection lost - attempting to reconnect";
    }
}
