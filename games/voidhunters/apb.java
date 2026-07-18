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

    final static boolean a() {
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
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_16_0 = 0;
        var4 = VoidHunters.field_G;
        try {
          L0: {
            var5 = (mv) (Object) tma.field_r.d(0);
            var1 = var5;
            if (var1 == null) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              var3 = 0;
              var2 = 0;
              L1: while (true) {
                if (var2 >= var1.field_i) {
                  stackOut_19_0 = 1;
                  stackIn_20_0 = stackOut_19_0;
                  break L0;
                } else {
                  L2: {
                    if (null == var5.field_g[var2]) {
                      break L2;
                    } else {
                      if (var5.field_g[var2].field_f == 0) {
                        stackOut_10_0 = 0;
                        stackIn_11_0 = stackOut_10_0;
                        return stackIn_11_0 != 0;
                      } else {
                        break L2;
                      }
                    }
                  }
                  L3: {
                    if (null != var5.field_e[var2]) {
                      if (0 == var5.field_e[var2].field_f) {
                        stackOut_16_0 = 0;
                        stackIn_17_0 = stackOut_16_0;
                        return stackIn_17_0 != 0;
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
          throw rta.a((Throwable) (Object) var1_ref, "apb.B(" + 57 + ')');
        }
        return stackIn_20_0 != 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 1;
        field_b = 4;
    }
}
