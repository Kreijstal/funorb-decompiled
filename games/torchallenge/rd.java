/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rd extends da {
    int field_m;
    static String field_j;
    static ka[] field_i;
    int field_q;
    int field_k;
    int field_l;
    int field_n;
    static int[] field_p;
    int field_o;

    final static void a(int param0, byte param1) {
        ta.field_Ab = ob.field_a[param0];
        ol.field_f = ik.field_c[param0];
        sd.field_g = pk.field_c[param0];
    }

    public static void b(byte param0) {
        field_p = null;
        field_j = null;
        field_i = null;
    }

    final static void a(int[][] param0, int param1, int param2, int param3, boolean param4, int param5, int param6, int param7, int param8, int param9) {
        RuntimeException var10 = null;
        int var10_int = 0;
        int var11 = 0;
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
        var11 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            var10_int = 0;
            L1: while (true) {
              if (param9 <= var10_int) {
                break L0;
              } else {
                L2: {
                  if (!param4) {
                    break L2;
                  } else {
                    param0[var10_int][0] = e.b((byte) 57, 4 * param7 >> 2);
                    param0[var10_int][1] = e.b((byte) 57, param2 * 4 >> 2);
                    break L2;
                  }
                }
                qg.a(param8 - (param7 >> 2) * 0 - -param0[var10_int][0] << 4, -((param2 >> 2) * 0) + (param1 + param0[var10_int][1]) << 4, 64, 128, qe.field_A);
                var10_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var10 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var10;
            stackOut_9_1 = new StringBuilder().append("rd.B(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param1 + ',' + param2 + ',' + 4 + ',' + param4 + ',' + 4 + ',' + -1012815519 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
        }
    }

    rd(int param0, int param1, int param2, int param3, int param4, int param5) {
        ((rd) this).field_n = param0;
        ((rd) this).field_k = param2;
        ((rd) this).field_m = param1;
        ((rd) this).field_o = param4;
        ((rd) this).field_l = param3;
        ((rd) this).field_q = param5;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = "Passwords can only contain letters and numbers";
        field_p = new int[]{2, 4, 2, 4, 2};
    }
}
