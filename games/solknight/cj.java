/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cj {
    static long field_c;
    static String field_b;
    static nc field_a;

    public static void b(int param0) {
        field_a = null;
        if (param0 != -26497) {
            return;
        }
        field_b = null;
    }

    final static int a(int param0) {
        boolean discarded$12 = false;
        boolean discarded$13 = false;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_24_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_18_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_8_0 = 0;
        var3 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            var1_int = 75 / ((param0 - 8) / 49);
            discarded$12 = u.field_b.a(-1, th.field_K, true, ee.field_l);
            u.field_b.c(false);
            L1: while (true) {
              L2: {
                L3: {
                  if (!wk.a((byte) -56)) {
                    break L3;
                  } else {
                    discarded$13 = u.field_b.a(el.field_n, ta.field_d, (byte) -48);
                    if (var3 != 0) {
                      break L2;
                    } else {
                      if (var3 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                if (he.field_b != -1) {
                  break L2;
                } else {
                  if (!ce.field_b) {
                    if (gf.field_Z != gb.field_i) {
                      if (!td.field_h.a(false)) {
                        stackOut_18_0 = 1;
                        stackIn_19_0 = stackOut_18_0;
                        decompiledRegionSelector0 = 3;
                        break L0;
                      } else {
                        if (ma.field_o != gf.field_Z) {
                          stackOut_23_0 = -1;
                          stackIn_24_0 = stackOut_23_0;
                          decompiledRegionSelector0 = 5;
                          break L0;
                        } else {
                          stackOut_21_0 = 2;
                          stackIn_22_0 = stackOut_21_0;
                          decompiledRegionSelector0 = 4;
                          break L0;
                        }
                      }
                    } else {
                      stackOut_14_0 = 1;
                      stackIn_15_0 = stackOut_14_0;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  } else {
                    stackOut_11_0 = 3;
                    stackIn_12_0 = stackOut_11_0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
              var2 = he.field_b;
              h.a(-1, true);
              stackOut_8_0 = var2;
              stackIn_9_0 = stackOut_8_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fc.a((Throwable) ((Object) var1), "cj.B(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_12_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_15_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_19_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_22_0;
                } else {
                  return stackIn_24_0;
                }
              }
            }
          }
        }
    }

    static {
        field_b = "Accept";
        field_a = new nc();
    }
}
