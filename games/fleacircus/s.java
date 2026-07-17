/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class s {
    static String field_b;
    static String[] field_c;
    static String field_a;

    final static void a(oa param0, int param1) {
        int var4 = 0;
        ih var5 = ud.field_b;
        var5.e(8, param1);
        try {
            var5.field_i = var5.field_i + 1;
            var4 = var5.field_i;
            var5.a(-11, 1);
            if (param0.field_k == null) {
                var5.a(-11, 0);
            } else {
                var5.a(-11, param0.field_k.length);
                var5.a(param0.field_k, param0.field_k.length, 0, 0);
            }
            int discarded$0 = var5.c(var4, -30532);
            var5.field_i = var5.field_i - 4;
            param0.field_i = var5.c((byte) -3);
            var5.c((byte) -128, -var4 + var5.field_i);
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) (Object) runtimeException, "s.A(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + 0 + 41);
        }
    }

    public static void a() {
        field_a = null;
        field_b = null;
        field_c = null;
    }

    final static void a(int param0, int param1, bh param2) {
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        Object var7 = null;
        ih var8 = null;
        ih var9 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var6 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              var8 = ud.field_b;
              var9 = var8;
              var9.e(param0 ^ -4479, param1);
              var9.field_i = var9.field_i + 1;
              var4 = var9.field_i;
              if (param0 == -4471) {
                break L1;
              } else {
                var7 = null;
                s.a(120, -80, (bh) null);
                break L1;
              }
            }
            var9.a(-11, 1);
            var9.b((byte) 76, param2.field_s);
            var9.b((byte) -49, param2.field_o);
            var9.b((byte) 105, param2.field_i);
            var9.a(param2.field_j, (byte) -50);
            var9.a(param2.field_r, (byte) -35);
            var9.a(param2.field_v, (byte) -56);
            var9.a(param2.field_m, (byte) -15);
            var9.a(-11, param2.field_p.length);
            var5 = 0;
            L2: while (true) {
              if (var5 >= param2.field_p.length) {
                int discarded$1 = var9.c(var4, -30532);
                var9.c((byte) -110, var9.field_i - var4);
                break L0;
              } else {
                var8.a(param2.field_p[var5], (byte) -50);
                var5++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("s.C(").append(param0).append(44).append(param1).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new String[]{null, "Or click", "Or click", "Or click", "Or click", "Or click", "Or click", "Or click"};
        field_a = "Try again";
    }
}
