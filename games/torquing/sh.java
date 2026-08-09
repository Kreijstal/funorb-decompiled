/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sh {
    static uk field_a;

    final static int b(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_22_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = Torquing.field_u;
        try {
          L0: {
            dc.field_a.a(true, ld.field_l, bf.field_d, false);
            dc.field_a.g((byte) -125);
            L1: while (true) {
              if (!np.a((byte) -13)) {
                if (param0 != (om.field_h ^ -1)) {
                  var1_int = om.field_h;
                  od.b(128, -1);
                  stackIn_7_0 = var1_int;
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  if (aq.field_c) {
                    stackIn_11_0 = 3;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    if (kh.field_o == mg.field_b) {
                      stackIn_15_0 = 1;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      if (qk.field_q.c(484)) {
                        if (bh.field_a == mg.field_b) {
                          stackIn_22_0 = 2;
                          decompiledRegionSelector0 = 4;
                          break L0;
                        } else {
                          return -1;
                        }
                      } else {
                        stackIn_18_0 = 1;
                        decompiledRegionSelector0 = 3;
                        break L0;
                      }
                    }
                  }
                }
              } else {
                dc.field_a.a(e.field_f, 24454, m.field_t);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw rb.a((Throwable) ((Object) var1), "sh.B(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_11_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_15_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_18_0;
              } else {
                return stackIn_22_0;
              }
            }
          }
        }
    }

    public static void a(int param0) {
        field_a = null;
        int var1 = 42 % ((param0 - -71) / 43);
    }

    static {
    }
}
