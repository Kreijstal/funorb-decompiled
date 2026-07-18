/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ia {
    static rc field_b;
    static aa field_a;

    public static void a(boolean param0) {
        field_b = null;
        field_a = null;
    }

    final static int b(boolean param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_21_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_7_0 = 0;
        var2 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            boolean discarded$12 = gl.field_E.a(hf.field_d, true, false, ra.field_z);
            gl.field_E.b(true);
            L1: while (true) {
              if (!mh.e(127)) {
                if (ra.field_v == -1) {
                  if (!gh.field_k) {
                    if (rk.field_X != oe.field_b) {
                      if (sa.field_Q.b((byte) 121)) {
                        if (oe.field_b != fd.field_h) {
                          stackOut_21_0 = -1;
                          stackIn_22_0 = stackOut_21_0;
                          break L0;
                        } else {
                          stackOut_19_0 = 2;
                          stackIn_20_0 = stackOut_19_0;
                          return stackIn_20_0;
                        }
                      } else {
                        stackOut_16_0 = 1;
                        stackIn_17_0 = stackOut_16_0;
                        return stackIn_17_0;
                      }
                    } else {
                      stackOut_13_0 = 1;
                      stackIn_14_0 = stackOut_13_0;
                      return stackIn_14_0;
                    }
                  } else {
                    stackOut_10_0 = 3;
                    stackIn_11_0 = stackOut_10_0;
                    return stackIn_11_0;
                  }
                } else {
                  var1_int = ra.field_v;
                  qc.b(-1, (byte) -42);
                  stackOut_7_0 = var1_int;
                  stackIn_8_0 = stackOut_7_0;
                  return stackIn_8_0;
                }
              } else {
                boolean discarded$13 = gl.field_E.a(md.field_d, 3931, kg.field_d);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sl.a((Throwable) (Object) var1, "ia.B(" + false + ')');
        }
        return stackIn_22_0;
    }

    final static void a(boolean param0, int param1, int param2, int param3, wb param4) {
        try {
            da.field_n.a(!param0 ? true : false, 1048576, true, 1000000, param4, param1);
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) (Object) runtimeException, "ia.A(" + param0 + ',' + param1 + ',' + 1048576 + ',' + 1000000 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new aa(2, 4, 4, 0);
    }
}
