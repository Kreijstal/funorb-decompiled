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
            throw kk.a((Throwable) (Object) runtimeException, "we.A(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 44 + param7 + 41);
        }
    }

    public static void a(byte param0) {
        field_o = null;
        field_p = null;
        field_t = null;
    }

    final static lc a(byte param0, String param1) {
        RuntimeException var2 = null;
        lc stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        lc stackOut_5_0 = null;
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
            L2: {
              if (param0 == -85) {
                break L2;
              } else {
                field_l = 85;
                break L2;
              }
            }
            stackOut_5_0 = fj.field_o;
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var2;
            stackOut_7_1 = new StringBuilder().append("we.B(").append(param0).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 41);
        }
        return stackIn_6_0;
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
