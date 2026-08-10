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
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            var1_int = 75 / ((param0 - 8) / 49);
            u.field_b.a(-1, th.field_K, true, ee.field_l);
            u.field_b.c(false);
            L1: while (true) {
              if (!wk.a((byte) -56)) {
                if (he.field_b != -1) {
                  var2 = he.field_b;
                  h.a(-1, true);
                  stackIn_7_0 = var2;
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  if (!ce.field_b) {
                    if (gf.field_Z != gb.field_i) {
                      if (!td.field_h.a(false)) {
                        stackIn_17_0 = 1;
                        decompiledRegionSelector0 = 3;
                        break L0;
                      } else {
                        if (ma.field_o != gf.field_Z) {
                          stackIn_22_0 = -1;
                          decompiledRegionSelector0 = 5;
                          break L0;
                        } else {
                          stackIn_20_0 = 2;
                          decompiledRegionSelector0 = 4;
                          break L0;
                        }
                      }
                    } else {
                      stackIn_13_0 = 1;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  } else {
                    stackIn_10_0 = 3;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              } else {
                u.field_b.a(el.field_n, ta.field_d, (byte) -48);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fc.a((Throwable) ((Object) var1), "cj.B(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_13_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_17_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_20_0;
                } else {
                  return stackIn_22_0;
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
