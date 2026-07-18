/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mm {
    static String field_b;
    static volatile int field_a;

    final static void a(int param0, s param1) {
        mi var3 = uh.field_Wb;
        try {
            var3.j(3, 118);
            var3.f(5, 105);
            var3.f(0, -82);
            var3.d(param1.field_p, -1783);
            var3.f(param1.field_q, -94);
            var3.f(param1.field_o, -69);
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) (Object) runtimeException, "mm.D(" + 3 + ',' + (param1 != null ? "{...}" : "null") + ',' + 108 + ')');
        }
    }

    public static void a() {
        field_b = null;
    }

    final static int a(tn param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var3 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            var2_int = lj.field_p;
            if (param0.field_s == 2) {
              if (param0.field_n) {
                var2_int = lj.field_p;
                break L0;
              } else {
                L1: {
                  if (param0.field_o != 0) {
                    break L1;
                  } else {
                    if (0 != param0.field_m) {
                      break L1;
                    } else {
                      var2_int = gg.field_n[param0.field_s];
                      break L0;
                    }
                  }
                }
                var2_int = wc.field_q[param0.field_s];
                break L0;
              }
            } else {
              if (param0.field_s != 4) {
                if (~param0.field_b != ~ao.field_N) {
                  var2_int = wc.field_q[param0.field_s];
                  break L0;
                } else {
                  var2_int = gg.field_n[param0.field_s];
                  break L0;
                }
              } else {
                var2_int = wc.field_q[param0.field_s];
                break L0;
              }
            }
          }
          return var2_int;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var2;
            stackOut_15_1 = new StringBuilder().append("mm.E(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L2;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L2;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ',' + 0 + ')');
        }
    }

    final static int[] a(int param0) {
        return new int[8];
    }

    final static boolean b(int param0) {
        int stackIn_6_0 = 0;
        int stackIn_12_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        if (param0 == -12942) {
          L0: {
            if (ag.b(49)) {
              stackOut_10_0 = 1;
              stackIn_12_0 = stackOut_10_0;
              break L0;
            } else {
              if (q.field_y > 0) {
                stackOut_11_0 = 0;
                stackIn_12_0 = stackOut_11_0;
                break L0;
              } else {
                return true;
              }
            }
          }
          return stackIn_12_0 != 0;
        } else {
          boolean discarded$6 = mm.b(-83);
          if (!ag.b(49)) {
            L1: {
              if (q.field_y > 0) {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                break L1;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
            return stackIn_6_0 != 0;
          } else {
            return true;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 0;
        field_b = "Solicitation";
    }
}
