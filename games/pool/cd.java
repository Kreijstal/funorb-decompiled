/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cd {
    static int[] field_d;
    static int field_a;
    static String field_c;
    static int field_e;
    static int field_b;

    final static void a() {
        int var1 = 0;
        L0: {
          tq.d((byte) -128);
          if (pa.field_K != null) {
            int discarded$23 = 0;
            he.a(pa.field_K);
            break L0;
          } else {
            break L0;
          }
        }
        v.a(-22444);
        var1 = 8;
        int discarded$24 = 0;
        aq.a();
        int discarded$25 = 70;
        am.b();
        int discarded$26 = 84;
        if (oc.b()) {
          ej.field_j.b(false, 1);
          de.a(0, 0);
          dn.c(-111);
          return;
        } else {
          dn.c(-111);
          return;
        }
    }

    final static void a(int param0, int param1, int[] param2, int param3, int param4, int param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        Object var9 = null;
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
        try {
          L0: {
            L1: {
              param0 = param0 - param2[0];
              param1 = param1 - param2[1];
              param5 = param5 - param2[2];
              if (param4 == 10521) {
                break L1;
              } else {
                var9 = null;
                cd.a(-11, -8, (int[]) null, -102, -112, 112);
                break L1;
              }
            }
            var6_int = param2[11] * param5 + param2[10] * param1 + param0 * param2[9] >> 16;
            if (var6_int <= 0) {
              return;
            } else {
              var7 = param2[5] * param5 + param2[3] * param0 - -(param1 * param2[4]) >> 7;
              var8 = param2[6] * param0 + (param1 * param2[7] - -(param2[8] * param5)) >> 7;
              var7 = fb.field_q + var7 / var6_int;
              var8 = fb.field_d + var8 / var6_int;
              qh.d(-4 + var7, var8, 4 + var7, var8, param3);
              qh.d(var7, var8 + -4, var7, var8 - -4, param3);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var6;
            stackOut_7_1 = new StringBuilder().append("cd.B(").append(param0).append(44).append(param1).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void a(int param0) {
        field_c = null;
        field_d = null;
        if (param0 <= 35) {
            field_c = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "You have resigned.";
        field_a = 22;
        field_b = 0;
    }
}
