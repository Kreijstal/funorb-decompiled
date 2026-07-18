/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sh {
    static uk field_a;

    final static int b() {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_17_0 = 0;
        var2 = Torquing.field_u;
        try {
          L0: {
            boolean discarded$28 = dc.field_a.a(true, ld.field_l, bf.field_d, false);
            dc.field_a.g((byte) -125);
            L1: while (true) {
              int discarded$29 = -13;
              if (!np.a()) {
                if (om.field_h != -1) {
                  var1_int = om.field_h;
                  od.b(128, -1);
                  stackOut_6_0 = var1_int;
                  stackIn_7_0 = stackOut_6_0;
                  return stackIn_7_0;
                } else {
                  if (aq.field_c) {
                    stackOut_10_0 = 3;
                    stackIn_11_0 = stackOut_10_0;
                    return stackIn_11_0;
                  } else {
                    if (kh.field_o == mg.field_b) {
                      stackOut_14_0 = 1;
                      stackIn_15_0 = stackOut_14_0;
                      return stackIn_15_0;
                    } else {
                      if (qk.field_q.c(484)) {
                        if (bh.field_a == mg.field_b) {
                          stackOut_21_0 = 2;
                          stackIn_22_0 = stackOut_21_0;
                          break L0;
                        } else {
                          return -1;
                        }
                      } else {
                        stackOut_17_0 = 1;
                        stackIn_18_0 = stackOut_17_0;
                        return stackIn_18_0;
                      }
                    }
                  }
                }
              } else {
                boolean discarded$30 = dc.field_a.a(e.field_f, 24454, m.field_t);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw rb.a((Throwable) (Object) var1, "sh.B(" + 0 + ')');
        }
        return stackIn_22_0;
    }

    public static void a() {
        field_a = null;
        int var1 = 0;
    }

    static {
    }
}
