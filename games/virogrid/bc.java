/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bc {
    static sb field_a;
    static int field_c;
    static long[] field_b;

    final synchronized static byte[] a(boolean param0, int param1) {
        byte[] var2_ref_byte__ = null;
        int var2 = 0;
        byte[] var3 = null;
        L0: {
          if (param1 != 100) {
            break L0;
          } else {
            if (hk.field_Hb <= 0) {
              break L0;
            } else {
              int fieldTemp$6 = hk.field_Hb - 1;
              hk.field_Hb = hk.field_Hb - 1;
              var2_ref_byte__ = k.field_b[fieldTemp$6];
              k.field_b[hk.field_Hb] = null;
              return var2_ref_byte__;
            }
          }
        }
        L1: {
          if (param1 != 5000) {
            break L1;
          } else {
            if (te.field_i > 0) {
              int fieldTemp$7 = te.field_i - 1;
              te.field_i = te.field_i - 1;
              var2_ref_byte__ = sm.field_b[fieldTemp$7];
              sm.field_b[te.field_i] = null;
              return var2_ref_byte__;
            } else {
              break L1;
            }
          }
        }
        L2: {
          if (30000 != param1) {
            break L2;
          } else {
            if (nm.field_b > 0) {
              int fieldTemp$8 = nm.field_b - 1;
              nm.field_b = nm.field_b - 1;
              var2_ref_byte__ = bj.field_k[fieldTemp$8];
              bj.field_k[nm.field_b] = null;
              return var2_ref_byte__;
            } else {
              break L2;
            }
          }
        }
        L3: {
          field_c = 50;
          if (gk.field_c == null) {
            break L3;
          } else {
            var2 = 0;
            L4: while (true) {
              if (var2 >= a.field_E.length) {
                break L3;
              } else {
                if (param1 == a.field_E[var2]) {
                  if (nh.field_s[var2] > 0) {
                    nh.field_s[var2] = nh.field_s[var2] - 1;
                    var3 = gk.field_c[var2][nh.field_s[var2] - 1];
                    gk.field_c[var2][nh.field_s[var2]] = null;
                    return var3;
                  } else {
                    var2++;
                    continue L4;
                  }
                } else {
                  var2++;
                  continue L4;
                }
              }
            }
          }
        }
        return new byte[param1];
    }

    final static void a(boolean param0, byte param1) {
        int var2 = 0;
        int stackIn_6_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_7_2 = 0;
        int stackIn_7_3 = 0;
        int stackIn_7_4 = 0;
        boolean stackIn_7_5 = false;
        int stackIn_7_6 = 0;
        int stackIn_7_7 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_8_2 = 0;
        int stackIn_8_3 = 0;
        int stackIn_8_4 = 0;
        boolean stackIn_8_5 = false;
        int stackIn_8_6 = 0;
        int stackIn_8_7 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_9_2 = 0;
        int stackIn_9_3 = 0;
        int stackIn_9_4 = 0;
        boolean stackIn_9_5 = false;
        int stackIn_9_6 = 0;
        int stackIn_9_7 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_10_2 = 0;
        int stackIn_10_3 = 0;
        int stackIn_10_4 = 0;
        boolean stackIn_10_5 = false;
        int stackIn_10_6 = 0;
        int stackIn_10_7 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_11_2 = 0;
        int stackIn_11_3 = 0;
        int stackIn_11_4 = 0;
        boolean stackIn_11_5 = false;
        int stackIn_11_6 = 0;
        int stackIn_11_7 = 0;
        int stackIn_11_8 = 0;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        int stackIn_12_2 = 0;
        int stackIn_12_3 = 0;
        int stackIn_12_4 = 0;
        boolean stackIn_12_5 = false;
        int stackIn_12_6 = 0;
        int stackIn_12_7 = 0;
        int stackIn_12_8 = 0;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        int stackIn_13_2 = 0;
        int stackIn_13_3 = 0;
        int stackIn_13_4 = 0;
        boolean stackIn_13_5 = false;
        int stackIn_13_6 = 0;
        int stackIn_13_7 = 0;
        int stackIn_13_8 = 0;
        int stackIn_14_0 = 0;
        int stackIn_14_1 = 0;
        int stackIn_14_2 = 0;
        int stackIn_14_3 = 0;
        int stackIn_14_4 = 0;
        boolean stackIn_14_5 = false;
        int stackIn_14_6 = 0;
        int stackIn_14_7 = 0;
        int stackIn_14_8 = 0;
        int stackIn_14_9 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
        int stackOut_6_3 = 0;
        int stackOut_6_4 = 0;
        boolean stackOut_6_5 = false;
        int stackOut_6_6 = 0;
        int stackOut_6_7 = 0;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        int stackOut_7_2 = 0;
        int stackOut_7_3 = 0;
        int stackOut_7_4 = 0;
        boolean stackOut_7_5 = false;
        int stackOut_7_6 = 0;
        int stackOut_7_7 = 0;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        int stackOut_10_2 = 0;
        int stackOut_10_3 = 0;
        int stackOut_10_4 = 0;
        boolean stackOut_10_5 = false;
        int stackOut_10_6 = 0;
        int stackOut_10_7 = 0;
        int stackOut_10_8 = 0;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        int stackOut_8_2 = 0;
        int stackOut_8_3 = 0;
        int stackOut_8_4 = 0;
        boolean stackOut_8_5 = false;
        int stackOut_8_6 = 0;
        int stackOut_8_7 = 0;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        int stackOut_9_2 = 0;
        int stackOut_9_3 = 0;
        int stackOut_9_4 = 0;
        boolean stackOut_9_5 = false;
        int stackOut_9_6 = 0;
        int stackOut_9_7 = 0;
        int stackOut_9_8 = 0;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        int stackOut_11_2 = 0;
        int stackOut_11_3 = 0;
        int stackOut_11_4 = 0;
        boolean stackOut_11_5 = false;
        int stackOut_11_6 = 0;
        int stackOut_11_7 = 0;
        int stackOut_11_8 = 0;
        int stackOut_13_0 = 0;
        int stackOut_13_1 = 0;
        int stackOut_13_2 = 0;
        int stackOut_13_3 = 0;
        int stackOut_13_4 = 0;
        boolean stackOut_13_5 = false;
        int stackOut_13_6 = 0;
        int stackOut_13_7 = 0;
        int stackOut_13_8 = 0;
        int stackOut_13_9 = 0;
        int stackOut_12_0 = 0;
        int stackOut_12_1 = 0;
        int stackOut_12_2 = 0;
        int stackOut_12_3 = 0;
        int stackOut_12_4 = 0;
        boolean stackOut_12_5 = false;
        int stackOut_12_6 = 0;
        int stackOut_12_7 = 0;
        int stackOut_12_8 = 0;
        int stackOut_12_9 = 0;
        L0: {
          pl.a(false);
          if (wl.field_d != null) {
            if (ef.a((byte) 82, wl.field_d.field_ic)) {
              stackOut_4_0 = 1;
              stackIn_6_0 = stackOut_4_0;
              break L0;
            } else {
              stackOut_3_0 = 0;
              stackIn_6_0 = stackOut_3_0;
              break L0;
            }
          } else {
            stackOut_1_0 = 0;
            stackIn_6_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          L2: {
            var2 = stackIn_6_0;
            stackOut_6_0 = 0;
            stackOut_6_1 = 13;
            stackOut_6_2 = -83;
            stackOut_6_3 = 15;
            stackOut_6_4 = og.field_b;
            stackOut_6_5 = param0;
            stackOut_6_6 = 1;
            stackOut_6_7 = var2;
            stackIn_9_0 = stackOut_6_0;
            stackIn_9_1 = stackOut_6_1;
            stackIn_9_2 = stackOut_6_2;
            stackIn_9_3 = stackOut_6_3;
            stackIn_9_4 = stackOut_6_4;
            stackIn_9_5 = stackOut_6_5;
            stackIn_9_6 = stackOut_6_6;
            stackIn_9_7 = stackOut_6_7;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            stackIn_7_2 = stackOut_6_2;
            stackIn_7_3 = stackOut_6_3;
            stackIn_7_4 = stackOut_6_4;
            stackIn_7_5 = stackOut_6_5;
            stackIn_7_6 = stackOut_6_6;
            stackIn_7_7 = stackOut_6_7;
            if (dd.field_a) {
              break L2;
            } else {
              stackOut_7_0 = stackIn_7_0;
              stackOut_7_1 = stackIn_7_1;
              stackOut_7_2 = stackIn_7_2;
              stackOut_7_3 = stackIn_7_3;
              stackOut_7_4 = stackIn_7_4;
              stackOut_7_5 = stackIn_7_5;
              stackOut_7_6 = stackIn_7_6;
              stackOut_7_7 = stackIn_7_7;
              stackIn_10_0 = stackOut_7_0;
              stackIn_10_1 = stackOut_7_1;
              stackIn_10_2 = stackOut_7_2;
              stackIn_10_3 = stackOut_7_3;
              stackIn_10_4 = stackOut_7_4;
              stackIn_10_5 = stackOut_7_5;
              stackIn_10_6 = stackOut_7_6;
              stackIn_10_7 = stackOut_7_7;
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              stackIn_8_3 = stackOut_7_3;
              stackIn_8_4 = stackOut_7_4;
              stackIn_8_5 = stackOut_7_5;
              stackIn_8_6 = stackOut_7_6;
              stackIn_8_7 = stackOut_7_7;
              if (!on.field_d) {
                stackOut_10_0 = stackIn_10_0;
                stackOut_10_1 = stackIn_10_1;
                stackOut_10_2 = stackIn_10_2;
                stackOut_10_3 = stackIn_10_3;
                stackOut_10_4 = stackIn_10_4;
                stackOut_10_5 = stackIn_10_5;
                stackOut_10_6 = stackIn_10_6;
                stackOut_10_7 = stackIn_10_7;
                stackOut_10_8 = 0;
                stackIn_11_0 = stackOut_10_0;
                stackIn_11_1 = stackOut_10_1;
                stackIn_11_2 = stackOut_10_2;
                stackIn_11_3 = stackOut_10_3;
                stackIn_11_4 = stackOut_10_4;
                stackIn_11_5 = stackOut_10_5;
                stackIn_11_6 = stackOut_10_6;
                stackIn_11_7 = stackOut_10_7;
                stackIn_11_8 = stackOut_10_8;
                break L1;
              } else {
                stackOut_8_0 = stackIn_8_0;
                stackOut_8_1 = stackIn_8_1;
                stackOut_8_2 = stackIn_8_2;
                stackOut_8_3 = stackIn_8_3;
                stackOut_8_4 = stackIn_8_4;
                stackOut_8_5 = stackIn_8_5;
                stackOut_8_6 = stackIn_8_6;
                stackOut_8_7 = stackIn_8_7;
                stackIn_9_0 = stackOut_8_0;
                stackIn_9_1 = stackOut_8_1;
                stackIn_9_2 = stackOut_8_2;
                stackIn_9_3 = stackOut_8_3;
                stackIn_9_4 = stackOut_8_4;
                stackIn_9_5 = stackOut_8_5;
                stackIn_9_6 = stackOut_8_6;
                stackIn_9_7 = stackOut_8_7;
                break L2;
              }
            }
          }
          stackOut_9_0 = stackIn_9_0;
          stackOut_9_1 = stackIn_9_1;
          stackOut_9_2 = stackIn_9_2;
          stackOut_9_3 = stackIn_9_3;
          stackOut_9_4 = stackIn_9_4;
          stackOut_9_5 = stackIn_9_5;
          stackOut_9_6 = stackIn_9_6;
          stackOut_9_7 = stackIn_9_7;
          stackOut_9_8 = 1;
          stackIn_11_0 = stackOut_9_0;
          stackIn_11_1 = stackOut_9_1;
          stackIn_11_2 = stackOut_9_2;
          stackIn_11_3 = stackOut_9_3;
          stackIn_11_4 = stackOut_9_4;
          stackIn_11_5 = stackOut_9_5;
          stackIn_11_6 = stackOut_9_6;
          stackIn_11_7 = stackOut_9_7;
          stackIn_11_8 = stackOut_9_8;
          break L1;
        }
        L3: {
          stackOut_11_0 = stackIn_11_0;
          stackOut_11_1 = stackIn_11_1;
          stackOut_11_2 = stackIn_11_2;
          stackOut_11_3 = stackIn_11_3;
          stackOut_11_4 = stackIn_11_4;
          stackOut_11_5 = stackIn_11_5;
          stackOut_11_6 = stackIn_11_6;
          stackOut_11_7 = stackIn_11_7;
          stackOut_11_8 = stackIn_11_8;
          stackIn_13_0 = stackOut_11_0;
          stackIn_13_1 = stackOut_11_1;
          stackIn_13_2 = stackOut_11_2;
          stackIn_13_3 = stackOut_11_3;
          stackIn_13_4 = stackOut_11_4;
          stackIn_13_5 = stackOut_11_5;
          stackIn_13_6 = stackOut_11_6;
          stackIn_13_7 = stackOut_11_7;
          stackIn_13_8 = stackOut_11_8;
          stackIn_12_0 = stackOut_11_0;
          stackIn_12_1 = stackOut_11_1;
          stackIn_12_2 = stackOut_11_2;
          stackIn_12_3 = stackOut_11_3;
          stackIn_12_4 = stackOut_11_4;
          stackIn_12_5 = stackOut_11_5;
          stackIn_12_6 = stackOut_11_6;
          stackIn_12_7 = stackOut_11_7;
          stackIn_12_8 = stackOut_11_8;
          if (50 >= tl.field_l) {
            stackOut_13_0 = stackIn_13_0;
            stackOut_13_1 = stackIn_13_1;
            stackOut_13_2 = stackIn_13_2;
            stackOut_13_3 = stackIn_13_3;
            stackOut_13_4 = stackIn_13_4;
            stackOut_13_5 = stackIn_13_5;
            stackOut_13_6 = stackIn_13_6;
            stackOut_13_7 = stackIn_13_7;
            stackOut_13_8 = stackIn_13_8;
            stackOut_13_9 = 0;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            stackIn_14_2 = stackOut_13_2;
            stackIn_14_3 = stackOut_13_3;
            stackIn_14_4 = stackOut_13_4;
            stackIn_14_5 = stackOut_13_5;
            stackIn_14_6 = stackOut_13_6;
            stackIn_14_7 = stackOut_13_7;
            stackIn_14_8 = stackOut_13_8;
            stackIn_14_9 = stackOut_13_9;
            break L3;
          } else {
            stackOut_12_0 = stackIn_12_0;
            stackOut_12_1 = stackIn_12_1;
            stackOut_12_2 = stackIn_12_2;
            stackOut_12_3 = stackIn_12_3;
            stackOut_12_4 = stackIn_12_4;
            stackOut_12_5 = stackIn_12_5;
            stackOut_12_6 = stackIn_12_6;
            stackOut_12_7 = stackIn_12_7;
            stackOut_12_8 = stackIn_12_8;
            stackOut_12_9 = 1;
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_14_2 = stackOut_12_2;
            stackIn_14_3 = stackOut_12_3;
            stackIn_14_4 = stackOut_12_4;
            stackIn_14_5 = stackOut_12_5;
            stackIn_14_6 = stackOut_12_6;
            stackIn_14_7 = stackOut_12_7;
            stackIn_14_8 = stackOut_12_8;
            stackIn_14_9 = stackOut_12_9;
            break L3;
          }
        }
        L4: {
          int discarded$2 = 14;
          int discarded$3 = 11;
          dj.a(stackIn_14_0, stackIn_14_1, (byte) stackIn_14_2, stackIn_14_3, stackIn_14_4, stackIn_14_5, stackIn_14_6 != 0, stackIn_14_7 != 0, stackIn_14_8 != 0, stackIn_14_9 != 0);
          if (param1 < -101) {
            break L4;
          } else {
            bc.a(true, (byte) 117);
            break L4;
          }
        }
        L5: {
          if (ah.field_c) {
            gk.field_g.g(57, 8);
            ah.field_c = false;
            break L5;
          } else {
            break L5;
          }
        }
        L6: {
          if (!af.field_c) {
            break L6;
          } else {
            gk.field_g.g(10, 8);
            af.field_c = false;
            break L6;
          }
        }
    }

    public static void a() {
        field_a = null;
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new long[1000];
    }
}
