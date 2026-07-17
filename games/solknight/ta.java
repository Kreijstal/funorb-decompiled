/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ta {
    static char field_d;
    static boolean field_b;
    static long field_a;
    static kb field_e;
    static String[] field_c;

    final static int a() {
        int var1 = 124;
        return uh.field_d;
    }

    final static void a(byte param0, int param1) {
        if (param0 < 9) {
            return;
        }
        int discarded$0 = cj.a(-104);
    }

    final static void b(byte param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            var2_int = 0;
            ri.a(be.field_I, param1, true, kg.field_c, (byte) -81, bb.field_G, 0);
            var3 = 0;
            L1: while (true) {
              if (kg.field_c <= var3) {
                ri.a(dc.field_o, param1 + param1, false, param1 + kg.field_c, (byte) -81, bi.field_e, param1);
                if (param1 >= kg.field_c) {
                  break L0;
                } else {
                  kg.field_c = param1;
                  return;
                }
              } else {
                pd.field_e[param1 + var3] = var3;
                var3++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fc.a((Throwable) (Object) var2, "ta.E(" + 105 + 44 + param1 + 41);
        }
    }

    final static void a(boolean param0, int param1, o[] param2, int param3, int param4, mg param5, int param6, int param7, int param8, o[] param9, int param10, int param11, mg param12, int param13, boolean param14) {
        try {
            Object var16 = null;
            pk.a(320, 0, param4, param12, param7, rj.field_c, 480, pb.field_b, param13, param9, 2, (byte) -111, (o[]) null, hc.field_d, param8, 240, 8, param5, 0, 8, param2);
            ck.a(param14, (byte) 66);
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) (Object) runtimeException, "ta.B(" + 0 + 44 + 320 + 44 + (param2 != null ? "{...}" : "null") + 44 + 2 + 44 + param4 + 44 + (param5 != null ? "{...}" : "null") + 44 + 8 + 44 + param7 + 44 + param8 + 44 + (param9 != null ? "{...}" : "null") + 44 + 8 + 44 + 240 + 44 + (param12 != null ? "{...}" : "null") + 44 + param13 + 44 + param14 + 41);
        }
    }

    public static void b() {
        field_e = null;
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new String[]{null, "To store your progress, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and score, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue."};
        field_a = 20000000L;
        field_e = new kb();
    }
}
