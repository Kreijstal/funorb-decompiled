/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mm {
    static String field_b;
    static volatile int field_a;

    final static void a(int param0, s param1, byte param2) {
        mi var3 = uh.field_Wb;
        if (param2 != 108) {
            return;
        }
        try {
            var3.j(param0, 118);
            var3.f(5, 105);
            var3.f(0, -82);
            var3.d(param1.field_p, -1783);
            var3.f(param1.field_q, param2 + -202);
            var3.f(param1.field_o, -69);
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) ((Object) runtimeException), "mm.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public static void a(byte param0) {
        field_b = null;
        if (param0 < 104) {
            tn var2 = (tn) null;
            mm.a((tn) null, -99);
        }
    }

    final static int a(tn param0, int param1) {
        int var2_int = 0;
        int var3 = 0;
        int stackIn_15_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_int = lj.field_p;
              if ((param0.field_s ^ -1) == -3) {
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
                if (-5 != (param0.field_s ^ -1)) {
                  if ((param0.field_b ^ -1L) != (ao.field_N ^ -1L)) {
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
              stackIn_17_0 = var2_int;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_15_0 = -83;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var2);

            stackIn_20_1 = new StringBuilder().append("mm.E(");

            if (param0 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L3;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L3;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_15_0;
        } else {
          return stackIn_17_0;
        }
    }

    final static int[] a(int param0) {
        if (param0 != 8) {
            return (int[]) null;
        }
        return new int[8];
    }

    final static boolean b(int param0) {
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        if (param0 == -12942) {
          if (!ag.b(49)) {
            if (-1 <= (q.field_y ^ -1)) {
              return true;
            } else {
              return false;
            }
          } else {
            stackIn_11_0 = 1;
            return stackIn_11_0 != 0;
          }
        } else {
          mm.b(-83);
          if (ag.b(49)) {
            return true;
          } else {
            L0: {
              if (-1 > (q.field_y ^ -1)) {
                stackIn_5_0 = 0;
                break L0;
              } else {
                stackIn_5_0 = 1;
                break L0;
              }
            }
            return stackIn_5_0 != 0;
          }
        }
    }

    static {
        field_a = 0;
        field_b = "Solicitation";
    }
}
