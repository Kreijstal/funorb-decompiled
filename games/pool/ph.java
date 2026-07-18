/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ph {
    static int[] field_g;
    static vh field_d;
    static String field_a;
    static volatile long field_b;
    static dd field_f;
    static int field_e;
    static String field_c;

    public final String toString() {
        throw new IllegalStateException();
    }

    final static int a(byte param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_5_0 = 0;
        var3 = Pool.field_O;
        try {
          L0: {
            var1_int = -124 / ((param0 - 38) / 54);
            boolean discarded$12 = wd.field_Ub.a(-120, qr.field_b, true, sm.field_D);
            wd.field_Ub.h((byte) 126);
            L1: while (true) {
              if (!n.h(127)) {
                if (jd.field_b == -1) {
                  if (!ep.field_z) {
                    if (pa.field_I == ra.field_e) {
                      stackOut_12_0 = 1;
                      stackIn_13_0 = stackOut_12_0;
                      return stackIn_13_0;
                    } else {
                      if (ig.field_j.a(112)) {
                        if (ra.field_e == wd.field_Lb) {
                          stackOut_19_0 = 2;
                          stackIn_20_0 = stackOut_19_0;
                          break L0;
                        } else {
                          return -1;
                        }
                      } else {
                        stackOut_15_0 = 1;
                        stackIn_16_0 = stackOut_15_0;
                        return stackIn_16_0;
                      }
                    }
                  } else {
                    stackOut_8_0 = 3;
                    stackIn_9_0 = stackOut_8_0;
                    return stackIn_9_0;
                  }
                } else {
                  var2 = jd.field_b;
                  lf.a(-1, (byte) 92);
                  stackOut_5_0 = var2;
                  stackIn_6_0 = stackOut_5_0;
                  return stackIn_6_0;
                }
              } else {
                boolean discarded$13 = wd.field_Ub.a(-81, qi.field_a, ml.field_b);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var1, "ph.A(" + param0 + ')');
        }
        return stackIn_20_0;
    }

    public static void a() {
        field_g = null;
        field_a = null;
        field_c = null;
        field_d = null;
        field_f = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Remove <%0> from ignore list";
        field_b = 0L;
        field_a = "You would have lost!";
    }
}
