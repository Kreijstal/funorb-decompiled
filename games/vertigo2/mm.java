/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mm {
    static String field_b;
    static volatile int field_a;

    final static void a(int param0, s param1, byte param2) {
        mi var3 = null;
        var3 = uh.field_Wb;
        if (param2 != 108) {
          return;
        } else {
          var3.j(param0, 118);
          var3.f(5, 105);
          var3.f(0, -82);
          var3.d(param1.field_p, -1783);
          var3.f(param1.field_q, param2 + -202);
          var3.f(param1.field_o, -69);
          return;
        }
    }

    public static void a(byte param0) {
        field_b = null;
        if (param0 < 104) {
            Object var2 = null;
            int discarded$0 = mm.a((tn) null, -99);
        }
    }

    final static int a(tn param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = Vertigo2.field_L ? 1 : 0;
        var2 = lj.field_p;
        if (param0.field_s == -3) {
          if (param0.field_n) {
            var2 = lj.field_p;
            if (param1 != 0) {
              return -83;
            } else {
              return var2;
            }
          } else {
            if (param0.field_o == 0) {
              if (0 == param0.field_m) {
                var2 = gg.field_n[param0.field_s];
                if (param1 != 0) {
                  return -83;
                } else {
                  return var2;
                }
              } else {
                var2 = wc.field_q[param0.field_s];
                if (param1 != 0) {
                  return -83;
                } else {
                  return var2;
                }
              }
            } else {
              var2 = wc.field_q[param0.field_s];
              if (param1 != 0) {
                return -83;
              } else {
                return var2;
              }
            }
          }
        } else {
          if (-5 != param0.field_s) {
            if ((param0.field_b ^ -1L) != (ao.field_N ^ -1L)) {
              var2 = wc.field_q[param0.field_s];
              if (param1 != 0) {
                return -83;
              } else {
                return var2;
              }
            } else {
              var2 = gg.field_n[param0.field_s];
              if (param1 != 0) {
                return -83;
              } else {
                return var2;
              }
            }
          } else {
            var2 = wc.field_q[param0.field_s];
            if (param1 != 0) {
              return -83;
            } else {
              return var2;
            }
          }
        }
    }

    final static int[] a(int param0) {
        if (param0 != 8) {
            return null;
        }
        return new int[8];
    }

    final static boolean b(int param0) {
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        if (param0 == -12942) {
          if (!ag.b(49)) {
            if (-1 >= q.field_y) {
              return true;
            } else {
              return false;
            }
          } else {
            stackOut_9_0 = 1;
            stackIn_11_0 = stackOut_9_0;
            return stackIn_11_0 != 0;
          }
        } else {
          boolean discarded$5 = mm.b(-83);
          if (ag.b(49)) {
            return true;
          } else {
            L0: {
              if (-1 > q.field_y) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L0;
              }
            }
            return stackIn_5_0 != 0;
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
