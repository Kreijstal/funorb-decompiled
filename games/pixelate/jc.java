/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jc implements eb {
    static id field_f;
    static long field_c;
    static tf field_a;
    static String field_e;
    static boolean field_d;
    static int field_b;

    final static void a(byte param0, int param1, m param2) {
        pc var3 = null;
        try {
            if (param0 != -31) {
                jc.a(-63);
            }
            var3 = aa.field_f;
            var3.g(param1, 15514);
            var3.e(160, param2.field_m);
            var3.b(param0 + 1276387975, param2.field_k);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "jc.C(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(String param0, int param1) {
        try {
            int var2_int = 31 % ((param1 - -78) / 35);
            oo.field_a = param0;
            te.a(12, -2671);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "jc.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void a(ng param0, byte param1, int param2, int param3, boolean param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        tf var8 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == -124) {
                break L1;
              } else {
                field_e = (String) null;
                break L1;
              }
            }
            L2: {
              var6_int = param0.field_z + param3;
              var7 = param2 - -param0.field_p;
              kk.a(var6_int, param0.field_C, var7, param0.field_E, (byte) -51);
              var8 = ha.field_g[1];
              if (!(param0 instanceof qm)) {
                break L2;
              } else {
                if (((qm) ((Object) param0)).field_M) {
                  var8.b((-var8.field_A + param0.field_E >> 1628434529) + var6_int - -1, var7 + (1 + (-var8.field_B + param0.field_C >> -1661029663)), 256);
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            if (!param0.b(true)) {
              break L0;
            } else {
              gk.a(var6_int + 2, 2 + var7, (byte) -128, param0.field_E + -4, param0.field_C + -4);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var6);
            stackOut_9_1 = new StringBuilder().append("jc.A(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void a(int param0) {
        field_f = null;
        if (param0 != 14518) {
            return;
        }
        field_e = null;
        field_a = null;
    }

    static {
        field_d = true;
        field_e = "Email address is unavailable";
    }
}
