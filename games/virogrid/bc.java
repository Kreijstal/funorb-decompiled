/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bc {
    static sb field_a;
    static int field_c;
    static long[] field_b;

    final synchronized static byte[] a(boolean param0, int param1) {
        int fieldTemp$3 = 0;
        int fieldTemp$4 = 0;
        int fieldTemp$5 = 0;
        int dupTemp$6 = 0;
        byte[][] arrayValue$7 = null;
        byte[] var2_ref_byte__;
        int var2;
        byte[] var3;
        L0: {
          if ((param1 ^ -1) != -101) {
            break L0;
          } else {
            if (hk.field_Hb <= 0) {
              break L0;
            } else {
              fieldTemp$3 = hk.field_Hb - 1;
              hk.field_Hb = hk.field_Hb - 1;
              var2_ref_byte__ = k.field_b[fieldTemp$3];
              k.field_b[hk.field_Hb] = null;
              return var2_ref_byte__;
            }
          }
        }
        L1: {
          if (param1 != 5000) {
            break L1;
          } else {
            if (-1 > (te.field_i ^ -1)) {
              fieldTemp$4 = te.field_i - 1;
              te.field_i = te.field_i - 1;
              var2_ref_byte__ = sm.field_b[fieldTemp$4];
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
              fieldTemp$5 = nm.field_b - 1;
              nm.field_b = nm.field_b - 1;
              var2_ref_byte__ = bj.field_k[fieldTemp$5];
              bj.field_k[nm.field_b] = null;
              return var2_ref_byte__;
            } else {
              break L2;
            }
          }
        }
        L3: {
          if (!param0) {
            break L3;
          } else {
            field_c = 50;
            break L3;
          }
        }
        L4: {
          if (gk.field_c == null) {
            break L4;
          } else {
            var2 = 0;
            L5: while (true) {
              if (var2 >= a.field_E.length) {
                break L4;
              } else {
                if (param1 == a.field_E[var2]) {
                  if (nh.field_s[var2] > 0) {
                    dupTemp$6 = nh.field_s[var2] - 1;
                    arrayValue$7 = gk.field_c[var2];
                    nh.field_s[var2] = dupTemp$6;
                    var3 = arrayValue$7[dupTemp$6];
                    gk.field_c[var2][nh.field_s[var2]] = null;
                    return var3;
                  } else {
                    var2++;
                    continue L5;
                  }
                } else {
                  var2++;
                  continue L5;
                }
              }
            }
          }
        }
        return new byte[param1];
    }

    final static void a(boolean param0, byte param1) {
        int var2;
        int stackIn_6_0 = 0;
        int stackIn_9_0;
        int stackIn_9_1;
        int stackIn_9_2;
        int stackIn_9_3;
        int stackIn_9_4;
        boolean stackIn_9_5;
        int stackIn_9_6;
        int stackIn_9_7;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_11_2 = 0;
        int stackIn_11_3 = 0;
        int stackIn_11_4 = 0;
        boolean stackIn_11_5 = false;
        int stackIn_11_6 = 0;
        int stackIn_11_7 = 0;
        int stackIn_11_8 = 0;
        int stackIn_14_9 = 0;
        L0: {
          pl.a(false);
          if (wl.field_d != null) {
            if (ef.a((byte) 82, wl.field_d.field_ic)) {
              stackIn_6_0 = 1;
              break L0;
            } else {
              stackIn_6_0 = 0;
              break L0;
            }
          } else {
            stackIn_6_0 = 0;
            break L0;
          }
        }
        L1: {
          L2: {
            var2 = stackIn_6_0;
            stackIn_9_0 = 0;

            stackIn_9_1 = 13;

            stackIn_9_2 = -83;

            stackIn_9_3 = 15;

            stackIn_9_4 = og.field_b;

            stackIn_9_5 = param0;

            stackIn_9_6 = 1;

            stackIn_9_7 = var2;

            if (dd.field_a) {
              break L2;
            } else {
















              if (!on.field_d) {
                stackIn_11_0 = stackIn_9_0;
                stackIn_11_1 = stackIn_9_1;
                stackIn_11_2 = stackIn_9_2;
                stackIn_11_3 = stackIn_9_3;
                stackIn_11_4 = stackIn_9_4;
                stackIn_11_5 = stackIn_9_5;
                stackIn_11_6 = stackIn_9_6;
                stackIn_11_7 = stackIn_9_7;
                stackIn_11_8 = 0;
                break L1;
              } else {








                break L2;
              }
            }
          }
          stackIn_11_0 = stackIn_9_0;
          stackIn_11_1 = stackIn_9_1;
          stackIn_11_2 = stackIn_9_2;
          stackIn_11_3 = stackIn_9_3;
          stackIn_11_4 = stackIn_9_4;
          stackIn_11_5 = stackIn_9_5;
          stackIn_11_6 = stackIn_9_6;
          stackIn_11_7 = stackIn_9_7;
          stackIn_11_8 = 1;
          break L1;
        }
        L3: {


















          if (50 >= tl.field_l) {









            stackIn_14_9 = 0;
            break L3;
          } else {









            stackIn_14_9 = 1;
            break L3;
          }
        }
        L4: {
          dj.a(stackIn_11_0, stackIn_11_1, (byte) stackIn_11_2, stackIn_11_3, stackIn_11_4, stackIn_11_5, stackIn_11_6 != 0, stackIn_11_7 != 0, stackIn_11_8 != 0, stackIn_14_9 != 0, 11, 14);
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

    public static void a(byte param0) {
        field_a = null;
        field_b = null;
        if (param0 != -101) {
            bc.a(true, (byte) -43);
        }
    }

    static {
        field_b = new long[1000];
    }
}
