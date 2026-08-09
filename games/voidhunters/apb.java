/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class apb {
    static int field_b;
    static int field_a;
    int field_c;

    final static void a(byte param0) {
        cf.b(32);
        int var1 = -97 % ((62 - param0) / 54);
    }

    final static boolean a(int param0) {
        mv var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        mv var5 = null;
        int stackIn_4_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = VoidHunters.field_G;
        try {
          L0: {
            var5 = (mv) ((Object) tma.field_r.d(0));
            var1 = var5;
            if (var1 == null) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var3 = 58 % ((param0 - -10) / 48);
              var2 = 0;
              L1: while (true) {
                if (var2 >= var1.field_i) {
                  stackIn_20_0 = 1;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  L2: {
                    if (null == var5.field_g[var2]) {
                      break L2;
                    } else {
                      if (var5.field_g[var2].field_f == 0) {
                        stackIn_11_0 = 0;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      } else {
                        break L2;
                      }
                    }
                  }
                  L3: {
                    if (null != var5.field_e[var2]) {
                      if (0 == var5.field_e[var2].field_f) {
                        stackIn_17_0 = 0;
                        decompiledRegionSelector0 = 2;
                        break L0;
                      } else {
                        break L3;
                      }
                    } else {
                      break L3;
                    }
                  }
                  var2++;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw rta.a((Throwable) ((Object) var1_ref), "apb.B(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_11_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_17_0 != 0;
            } else {
              return stackIn_20_0 != 0;
            }
          }
        }
    }

    static {
        field_a = 1;
        field_b = 4;
    }
}
