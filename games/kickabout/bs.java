/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bs extends RuntimeException {
    Throwable field_e;
    static np field_c;
    static sr field_a;
    String field_d;
    static int field_f;
    static String field_b;

    final static void a() {
        id.field_s.a(true, -(ui.field_t ? 40 + (2 + (oe.field_f - -2)) : 0) + mc.field_d.field_q, 0, 0, 18);
        ck.field_c.a(true, oe.field_f + 42, -40 + (-2 + -oe.field_f + mc.field_d.field_q), 0, 18);
        bf.field_u.a(2, 118, mc.field_d.field_mb + -20, 20, 0, mc.field_d.field_q, oe.field_f);
    }

    public static void a(byte param0) {
        field_b = null;
        if (param0 > -50) {
            bs.a((byte) 40);
            field_c = null;
            field_a = null;
            return;
        }
        field_c = null;
        field_a = null;
    }

    final static ut[] a(ut[] param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        ut var3_ref_ut = null;
        int var3 = 0;
        int var4 = 0;
        ut[] stackIn_5_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        ut[] stackOut_4_0 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        var4 = Kickabout.field_G;
        try {
          L0: {
            var2_int = 0;
            L1: while (true) {
              if (param0.length <= var2_int) {
                var3 = 45 % ((param1 - -62) / 35);
                stackOut_4_0 = (ut[]) param0;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                var3_ref_ut = param0[var2_int];
                param0[var2_int].field_n = 0;
                var3_ref_ut.field_s = 0;
                param0[var2_int].field_o = param0[var2_int].field_q;
                param0[var2_int].field_v = param0[var2_int].field_w;
                var2_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var2;
            stackOut_6_1 = new StringBuilder().append("bs.A(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param1 + ')');
        }
        return stackIn_5_0;
    }

    final static void a(int param0, int param1, int param2) {
        tb.field_s = param0;
        ta.field_A = param2;
    }

    bs(Throwable param0, String param1) {
        ((bs) this).field_d = param1;
        ((bs) this).field_e = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "This is your auction.";
        field_a = (sr) (Object) new qi();
    }
}
