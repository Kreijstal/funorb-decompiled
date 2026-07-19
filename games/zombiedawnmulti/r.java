/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class r {
    static String field_e;
    static int[][] field_c;
    static eh field_a;
    static String field_b;
    static String field_d;
    static String field_g;
    static int field_f;

    final static void a(int param0, ja param1) {
        m.c(540);
        if (param0 != 0) {
            return;
        }
        try {
            oo.a(param1.field_B, param1.field_z, param1.field_u);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "r.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(boolean param0) {
        field_a = null;
        field_d = null;
        field_g = null;
        field_c = (int[][]) null;
        field_e = null;
        field_b = null;
        if (!param0) {
            ja var2 = (ja) null;
            r.a(3, (ja) null);
        }
    }

    final static po a(ul param0, int param1, byte param2) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        ja var4 = null;
        byte[] var5 = null;
        Object stackIn_2_0 = null;
        po stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        po stackOut_5_0 = null;
        Object stackOut_1_0 = null;
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
            var5 = param0.a((byte) -77, param1);
            var3 = var5;
            if (var5 != null) {
              L1: {
                if (param2 == 15) {
                  break L1;
                } else {
                  var4 = (ja) null;
                  r.a(-29, (ja) null);
                  break L1;
                }
              }
              stackOut_5_0 = new po(var5);
              stackIn_6_0 = stackOut_5_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var3_ref);
            stackOut_7_1 = new StringBuilder().append("r.C(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (po) ((Object) stackIn_2_0);
        } else {
          return stackIn_6_0;
        }
    }

    final static ao a(int param0, byte param1) {
        int var3 = 0;
        int var4 = ZombieDawnMulti.field_E ? 1 : 0;
        ao[] var5 = wm.b(true);
        ao[] var2 = var5;
        if (param1 != 35) {
            field_b = (String) null;
            var3 = 0;
            do {
                if (var3 >= var5.length) {
                    return null;
                }
                if (!(var5[var3].field_g != param0)) {
                    return var5[var3];
                }
                var3++;
            } while (var4 == 0);
            return null;
        }
        var3 = 0;
        do {
            if (var3 >= var5.length) {
                return null;
            }
            if (!(var5[var3].field_g != param0)) {
                return var5[var3];
            }
            var3++;
        } while (var4 == 0);
        return null;
    }

    static {
        field_e = "Player names can be up to 12 letters, numbers and underscores";
        field_d = "Retry (<%0> Left)";
        field_b = "Rankings";
        field_g = "Reject <%0> from this game";
    }
}
