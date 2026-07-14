/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gj {
    gb field_a;
    static int field_h;
    String field_c;
    String field_e;
    String field_g;
    static ub field_b;
    static bd field_d;
    int field_f;

    final static boolean a(int param0, int param1, int param2, int param3) {
        oc var4 = null;
        int var5 = 0;
        int var6 = 0;
        int stackIn_10_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_9_0 = 0;
        if (-1 != (ln.field_a.field_i[param0] ^ -1)) {
          var4 = mm.field_m[0].field_j;
          if (param2 <= -89) {
            L0: {
              L1: {
                var5 = -param3 + var4.field_e;
                var6 = -param1 + var4.field_g;
                if (-20 >= var5) {
                  break L1;
                } else {
                  if (20 <= var5) {
                    break L1;
                  } else {
                    if (var6 <= -17) {
                      break L1;
                    } else {
                      if (var6 >= 17) {
                        break L1;
                      } else {
                        stackOut_8_0 = 1;
                        stackIn_10_0 = stackOut_8_0;
                        break L0;
                      }
                    }
                  }
                }
              }
              stackOut_9_0 = 0;
              stackIn_10_0 = stackOut_9_0;
              break L0;
            }
            return stackIn_10_0 != 0;
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    final static void a(int param0, String param1, float param2) {
        bl.field_f = param2;
        if (param0 != 20) {
        }
        wi.field_c = param1;
    }

    final static double a(double param0, int param1) {
        if (param1 >= 0) {
            boolean discarded$0 = gj.a(124, -103, 11, -7);
        }
        return -24.0 + (24.0 * param0 - (double)uj.field_p.field_e);
    }

    public static void a(byte param0) {
        if (param0 > -5) {
            field_d = null;
        }
        field_d = null;
        field_b = null;
    }

    final static nd[] a(int param0) {
        if (param0 != -17) {
            field_d = null;
        }
        return new nd[]{bh.field_c, ac.field_c, tf.field_b, li.field_x, lk.field_N, kd.field_G, ee.field_h, pl.field_q, lg.field_e, gb.field_f, fh.field_a, bc.field_j, oa.field_g, ee.field_a};
    }

    final static u[] a(boolean param0, en param1) {
        int var2 = 0;
        int var3 = 0;
        u[] var4 = null;
        int var5 = 0;
        u var6_ref = null;
        int var6 = 0;
        int var7 = 0;
        en stackIn_1_0 = null;
        int stackIn_1_1 = 0;
        en stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        en stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        int stackIn_3_2 = 0;
        en stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        en stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        en stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        int stackIn_13_2 = 0;
        en stackOut_0_0 = null;
        int stackOut_0_1 = 0;
        en stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int stackOut_2_2 = 0;
        en stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        int stackOut_1_2 = 0;
        en stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        en stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        int stackOut_12_2 = 0;
        en stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        int stackOut_11_2 = 0;
        L0: {
          var7 = HostileSpawn.field_I ? 1 : 0;
          stackOut_0_0 = (en) param1;
          stackOut_0_1 = 8;
          stackIn_2_0 = stackOut_0_0;
          stackIn_2_1 = stackOut_0_1;
          stackIn_1_0 = stackOut_0_0;
          stackIn_1_1 = stackOut_0_1;
          if (param0) {
            stackOut_2_0 = (en) (Object) stackIn_2_0;
            stackOut_2_1 = stackIn_2_1;
            stackOut_2_2 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            stackIn_3_2 = stackOut_2_2;
            break L0;
          } else {
            stackOut_1_0 = (en) (Object) stackIn_1_0;
            stackOut_1_1 = stackIn_1_1;
            stackOut_1_2 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            stackIn_3_2 = stackOut_1_2;
            break L0;
          }
        }
        var2 = ((en) (Object) stackIn_3_0).a(stackIn_3_1, stackIn_3_2 != 0);
        if (0 >= var2) {
          L1: {
            if (!param0) {
              break L1;
            } else {
              field_h = -34;
              break L1;
            }
          }
          var3 = param1.a(12, true);
          var4 = new u[var3];
          var5 = 0;
          L2: while (true) {
            if (var5 >= var3) {
              return var4;
            } else {
              if (!vi.a((byte) 124, param1)) {
                var6 = param1.a(aa.a(4, var5 + -1), true);
                var4[var5] = var4[var6];
                var5++;
                continue L2;
              } else {
                L3: {
                  var6_ref = new u();
                  int discarded$1656 = param1.a(24, true);
                  int discarded$1657 = param1.a(24, true);
                  var6_ref.field_i = param1.a(24, true);
                  int discarded$1658 = param1.a(9, true);
                  int discarded$1659 = param1.a(12, true);
                  int discarded$1660 = param1.a(12, true);
                  stackOut_10_0 = (en) param1;
                  stackOut_10_1 = 12;
                  stackIn_12_0 = stackOut_10_0;
                  stackIn_12_1 = stackOut_10_1;
                  stackIn_11_0 = stackOut_10_0;
                  stackIn_11_1 = stackOut_10_1;
                  if (param0) {
                    stackOut_12_0 = (en) (Object) stackIn_12_0;
                    stackOut_12_1 = stackIn_12_1;
                    stackOut_12_2 = 0;
                    stackIn_13_0 = stackOut_12_0;
                    stackIn_13_1 = stackOut_12_1;
                    stackIn_13_2 = stackOut_12_2;
                    break L3;
                  } else {
                    stackOut_11_0 = (en) (Object) stackIn_11_0;
                    stackOut_11_1 = stackIn_11_1;
                    stackOut_11_2 = 1;
                    stackIn_13_0 = stackOut_11_0;
                    stackIn_13_1 = stackOut_11_1;
                    stackIn_13_2 = stackOut_11_2;
                    break L3;
                  }
                }
                int discarded$1661 = ((en) (Object) stackIn_13_0).a(stackIn_13_1, stackIn_13_2 != 0);
                var4[var5] = var6_ref;
                var5++;
                continue L2;
              }
            }
          }
        } else {
          return null;
        }
    }

    private gj() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new ub();
    }
}
