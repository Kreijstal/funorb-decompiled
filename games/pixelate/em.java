/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class em {
    static String field_a;
    static String field_b;
    static String field_c;

    final static void a(byte param0) {
        if (param0 > -13) {
            field_a = (String) null;
            oa.field_j = 0;
            return;
        }
        oa.field_j = 0;
    }

    final static void a(byte param0, lc param1, int param2) {
        pc var3 = null;
        try {
            if (param0 != -7) {
                int[] var4 = (int[]) null;
                em.a((String) null, 12L, (String) null, 43, (ak) null, -102, (gp) null, (int[]) null, 46);
            }
            var3 = aa.field_f;
            var3.g(param2, 15514);
            var3.e(160, param1.field_k);
            var3.e(160, param1.field_s);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "em.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static void a(tf[] param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        var4 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            L1: {
              jm.field_i = param0;
              var2_int = param0[0].field_A;
              rn.field_b = var2_int;
              hf.field_k = var2_int;
              lo.field_Jb = (800 + -var2_int) / 2;
              ip.field_A = rk.field_e.field_w + rk.field_e.field_z;
              bh.field_k = ip.field_A * 50 + -163;
              if (param1 < -75) {
                break L1;
              } else {
                field_b = (String) null;
                break L1;
              }
            }
            var3 = 0;
            L2: while (true) {
              if ((var3 ^ -1) <= -51) {
                break L0;
              } else {
                ud.field_I[var3] = new up(var3);
                var3++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var2);
            stackOut_7_1 = new StringBuilder().append("em.F(");
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
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
    }

    final static void a(String param0, long param1, String param2, int param3, ak param4, int param5, gp param6, int[] param7, int param8) {
        try {
            if (param5 != -163) {
                em.a((byte) 53);
            }
            bj.field_d = param6;
            eg.field_n = new wi(param4, param1, param2, param0, param3, param8, param7);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "em.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ',' + (param7 != null ? "{...}" : "null") + ',' + param8 + ')');
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
            ub.field_a = pf.a(true) * param2 / 1000;
            nj.a(param3, (byte) 14);
            dk.a(false, param3);
            ec.a(false, param3);
            op.e(260);
            ng.g(0);
            ga.field_f = -ub.field_a + 0;
            int var4_int = 26 % ((param1 - 1) / 55);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "em.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_a = "Loading extra data";
        field_b = "Names should contain a maximum of 12 characters";
        field_c = "Public";
    }
}
