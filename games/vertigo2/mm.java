/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mm {
    static String field_b;
    static volatile int field_a;

    final static void a(int param0, s param1, byte param2) {
        mi var3 = uh.field_Wb;
        try {
            var3.j(param0, 118);
            var3.f(5, 105);
            var3.f(0, -82);
            var3.d(param1.field_p, -1783);
            var3.f(param1.field_q, -94);
            var3.f(param1.field_o, -69);
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) (Object) runtimeException, "mm.D(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + 108 + 41);
        }
    }

    public static void a(byte param0) {
        field_b = null;
    }

    final static int a(tn param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_15_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_16_0 = 0;
        int stackOut_14_0 = 0;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var3 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_int = lj.field_p;
              if (param0.field_s == 2) {
                if (param0.field_n) {
                  var2_int = lj.field_p;
                  break L1;
                } else {
                  L2: {
                    if (param0.field_o != 0) {
                      break L2;
                    } else {
                      if (0 != param0.field_m) {
                        break L2;
                      } else {
                        var2_int = gg.field_n[param0.field_s];
                        break L1;
                      }
                    }
                  }
                  var2_int = wc.field_q[param0.field_s];
                  break L1;
                }
              } else {
                if (param0.field_s != 4) {
                  if (~param0.field_b != ~ao.field_N) {
                    var2_int = wc.field_q[param0.field_s];
                    break L1;
                  } else {
                    var2_int = gg.field_n[param0.field_s];
                    break L1;
                  }
                } else {
                  var2_int = wc.field_q[param0.field_s];
                  break L1;
                }
              }
            }
            if (param1 == 0) {
              stackOut_16_0 = var2_int;
              stackIn_17_0 = stackOut_16_0;
              break L0;
            } else {
              stackOut_14_0 = -83;
              stackIn_15_0 = stackOut_14_0;
              return stackIn_15_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var2;
            stackOut_18_1 = new StringBuilder().append("mm.E(");
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param0 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L3;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L3;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 44 + param1 + 41);
        }
        return stackIn_17_0;
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
