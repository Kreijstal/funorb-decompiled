/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oi {
    static int field_a;
    static String field_c;
    static bc field_h;
    static String field_g;
    static int field_e;
    static ds field_b;
    static bi[][] field_i;
    static boolean field_f;
    static bi field_d;

    final static void a() {
        k.field_b = false;
    }

    final static void a(byte param0, bc param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        Object var4 = null;
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
        var3 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            int discarded$8 = 0;
            ln.field_K = mf.a(param1, "", "starfield");
            mp.field_e = new bi[6];
            var2_int = 0;
            L1: while (true) {
              if (var2_int >= 6) {
                L2: {
                  int discarded$9 = 0;
                  ce.field_v = mf.a(param1, "", "win");
                  int discarded$10 = 0;
                  dp.field_s = mf.a(param1, "", "lose");
                  if (param0 == -126) {
                    break L2;
                  } else {
                    var4 = null;
                    oi.a((byte) -117, (bc) null);
                    break L2;
                  }
                }
                break L0;
              } else {
                int discarded$11 = 1;
                mp.field_e[var2_int] = vr.a(param1, var2_int - -1);
                var2_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var2;
            stackOut_7_1 = new StringBuilder().append("oi.C(").append(param0).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw r.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 41);
        }
    }

    public static void a(int param0) {
        field_h = null;
        field_b = null;
        if (param0 != -1) {
            oi.a(52);
        }
        field_d = null;
        field_i = null;
        field_g = null;
        field_c = null;
    }

    final static bi a(int param0, byte param1) {
        bi var3 = null;
        bi var2 = bd.field_C[param0];
        if (!(var2 != null)) {
            bi dupTemp$0 = new bi(32, 32);
            var3 = dupTemp$0;
            var2 = var3;
            bd.field_C[param0] = dupTemp$0;
            bs.a(var3, 77);
            jd.field_j[param0].g(0, 0);
            cg.i(0);
        }
        return var2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "You cannot chat to <%0> because <%0> is offline in your friend list.";
        field_b = new ds(2);
    }
}
