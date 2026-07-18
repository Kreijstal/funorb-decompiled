/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cj {
    static long field_c;
    static String field_b;
    static nc field_a;

    public static void b(int param0) {
        field_a = null;
        field_b = null;
    }

    final static int a(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_9_0 = 0;
        var3 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            var1_int = 75 / ((param0 - 8) / 49);
            boolean discarded$12 = u.field_b.a(-1, th.field_K, true, ee.field_l);
            u.field_b.c(false);
            L1: while (true) {
              if (!wk.a((byte) -56)) {
                if (he.field_b != -1) {
                  var2 = he.field_b;
                  h.a(-1, true);
                  stackOut_6_0 = var2;
                  stackIn_7_0 = stackOut_6_0;
                  return stackIn_7_0;
                } else {
                  if (!ce.field_b) {
                    if (gf.field_Z != gb.field_i) {
                      if (!td.field_h.a(false)) {
                        stackOut_16_0 = 1;
                        stackIn_17_0 = stackOut_16_0;
                        return stackIn_17_0;
                      } else {
                        if (ma.field_o != gf.field_Z) {
                          stackOut_21_0 = -1;
                          stackIn_22_0 = stackOut_21_0;
                          break L0;
                        } else {
                          stackOut_19_0 = 2;
                          stackIn_20_0 = stackOut_19_0;
                          return stackIn_20_0;
                        }
                      }
                    } else {
                      stackOut_12_0 = 1;
                      stackIn_13_0 = stackOut_12_0;
                      return stackIn_13_0;
                    }
                  } else {
                    stackOut_9_0 = 3;
                    stackIn_10_0 = stackOut_9_0;
                    return stackIn_10_0;
                  }
                }
              } else {
                boolean discarded$13 = u.field_b.a(el.field_n, ta.field_d, (byte) -48);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fc.a((Throwable) (Object) var1, "cj.B(" + param0 + ')');
        }
        return stackIn_22_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Accept";
        field_a = new nc();
    }
}
