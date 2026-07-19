/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ne {
    static double field_c;
    static String field_a;
    static String field_d;
    static bi field_b;

    public static void a(byte param0) {
        int var1 = -40 / ((-70 - param0) / 52);
        field_b = null;
        field_a = null;
        field_d = null;
    }

    final static void a(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        ce var2 = null;
        int var3 = 0;
        ce stackIn_9_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        ce stackOut_8_0 = null;
        ce stackOut_7_0 = null;
        var3 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            var1_int = 0;
            if (param0 == -11) {
              L1: while (true) {
                if ((var1_int ^ -1) <= -11) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  if (fb.field_d[var1_int] != null) {
                    L2: {
                      if ((ih.field_a & 1 << var1_int) == 0) {
                        stackOut_8_0 = pn.field_a;
                        stackIn_9_0 = stackOut_8_0;
                        break L2;
                      } else {
                        stackOut_7_0 = vg.field_I;
                        stackIn_9_0 = stackOut_7_0;
                        break L2;
                      }
                    }
                    var2 = stackIn_9_0;
                    var2.c(fb.field_d[var1_int], sc.field_d[var1_int], uh.field_g[var1_int] >> 836370724, 16777215, -1);
                    var1_int++;
                    continue L1;
                  } else {
                    var1_int++;
                    continue L1;
                  }
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var1), "ne.B(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static {
        field_c = Math.atan2(1.0, 0.0);
        field_a = "Homing energy weapons";
        field_d = "Connection restored.";
    }
}
