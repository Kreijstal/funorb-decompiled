/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cb extends Exception {
    static String field_d;
    String field_b;
    static je field_c;
    static um[] field_a;

    public static void a(int param0) {
        field_d = null;
        int var1 = -112 / ((param0 - 70) / 54);
        field_c = null;
        field_a = null;
    }

    final static void a(int param0, wk param1, int param2, int param3, int param4, int param5) {
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var13 = 0;
        int var14 = 0;
        try {
            var6_int = tm.field_c;
            var7 = tm.field_j;
            var8 = tm.field_n[150];
            var9 = tm.field_e[150];
            var10 = param5 * var9 + -(param0 * var8) >> -11818448;
            int var12 = 69 % ((-24 - param3) / 46);
            var11 = param5 * var8 + var9 * param0 >> 1957129584;
            if (var11 > 0) {
                var13 = var6_int - -((param4 << -604629751) / var11);
                var14 = (var10 << 1065063401) / var11 + var7;
                param1.f(var13, var14, param2);
            }
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "cb.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    cb(String param0) {
        try {
            this.field_b = param0;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "cb.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static wk[] a(boolean param0, kl param1, int param2, int param3) {
        RuntimeException var4 = null;
        wk[] stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        wk[] stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!param0) {
              if (kp.a(param0, param2, param1, param3)) {
                stackIn_7_0 = md.g(122);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_5_0 = null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = (wk[]) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var4);

            stackIn_10_1 = new StringBuilder().append("cb.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L1;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L1;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (wk[]) ((Object) stackIn_5_0);
          } else {
            return stackIn_7_0;
          }
        }
    }

    static {
        field_d = "Options";
        field_a = new um[6];
    }
}
