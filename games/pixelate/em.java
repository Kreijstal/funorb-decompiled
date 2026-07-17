/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class em {
    static String field_a;
    static String field_b;
    static String field_c;

    final static void a() {
        oa.field_j = 0;
    }

    final static void a(byte param0, lc param1, int param2) {
        pc var3 = null;
        try {
            var3 = aa.field_f;
            var3.g(param2, 15514);
            var3.e(160, param1.field_k);
            var3.e(160, param1.field_s);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "em.A(" + -7 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    final static void a(tf[] param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        var4 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            jm.field_i = param0;
            var2_int = param0[0].field_A;
            rn.field_b = var2_int;
            hf.field_k = var2_int;
            lo.field_Jb = (800 + -var2_int) / 2;
            ip.field_A = rk.field_e.field_w + rk.field_e.field_z;
            bh.field_k = ip.field_A * 50 + -163;
            var3 = 0;
            L1: while (true) {
              if (var3 >= 50) {
                break L0;
              } else {
                ud.field_I[var3] = new up(var3);
                var3++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2;
            stackOut_5_1 = new StringBuilder().append("em.F(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
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
          throw aa.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + -77 + 41);
        }
    }

    final static void a(String param0, long param1, String param2, int param3, ak param4, int param5, gp param6, int[] param7, int param8) {
        try {
            bj.field_d = param6;
            eg.field_n = new wi(param4, param1, param2, param0, param3, param8, param7);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "em.E(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 44 + param3 + 44 + (param4 != null ? "{...}" : "null") + 44 + -163 + 44 + (param6 != null ? "{...}" : "null") + 44 + (param7 != null ? "{...}" : "null") + 44 + param8 + 41);
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_b = null;
        if (param0 <= 88) {
            return;
        }
        field_a = null;
    }

    final static void a(vj param0, int param1, int param2, fm param3) {
        try {
            int discarded$0 = 1;
            ub.field_a = pf.a() * param2 / 1000;
            int discarded$1 = 14;
            nj.a(param3);
            dk.a(false, param3);
            ec.a(false, param3);
            int discarded$2 = 260;
            op.e();
            ng.g(0);
            ga.field_f = -ub.field_a;
            int var4_int = 0;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "em.B(" + (param0 != null ? "{...}" : "null") + 44 + 74 + 44 + param2 + 44 + (param3 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Loading extra data";
        field_b = "Names should contain a maximum of 12 characters";
        field_c = "Public";
    }
}
