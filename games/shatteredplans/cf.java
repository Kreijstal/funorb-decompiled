/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cf extends f implements bp {
    static String field_M;
    private ns field_K;
    static int field_D;
    static bi field_F;
    private nq field_J;
    private String field_L;
    private int[] field_N;
    static int[] field_H;
    private int field_G;
    private kg[] field_E;
    static String field_I;

    final static hh a(bc param0, int param1, bc param2, int param3, int param4) {
        if (!vd.a(param3, param2, param4, param1 ^ 3)) {
            return null;
        }
        if (param1 != 1) {
            return null;
        }
        return uc.a(param0.a(param3, -1, param4), 0);
    }

    final static void a(pf param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          var3 = ShatteredPlansClient.field_F ? 1 : 0;
          ds.field_c = rr.a(param0, bb.field_b, pd.field_k, 2);
          if (param1 == 39) {
            break L0;
          } else {
            field_D = -63;
            break L0;
          }
        }
        L1: {
          if (je.field_d != 1) {
            if ((rf.field_n ^ -1) != -2) {
              L2: {
                L3: {
                  if (null == il.field_bb) {
                    break L3;
                  } else {
                    if ((uq.field_i ^ -1) > -6) {
                      break L3;
                    } else {
                      ca.field_h = null;
                      break L2;
                    }
                  }
                }
                ca.field_h = vn.field_s;
                if (null == ca.field_h) {
                  break L2;
                } else {
                  ca.field_h.d(-ca.field_h.field_l + pd.field_k, -ca.field_h.field_h + bb.field_b, -30872);
                  break L2;
                }
              }
              vn.field_s = null;
              il.field_bb = null;
              break L1;
            } else {
              L4: {
                uq.field_i = uq.field_i + 1;
                if (il.field_bb == null) {
                  var2 = (ba.field_c + -bb.field_b) * (ba.field_c - bb.field_b) + (-pd.field_k + ck.field_e) * (-pd.field_k + ck.field_e);
                  if (5 >= var2) {
                    break L4;
                  } else {
                    if (-6 <= (uq.field_i ^ -1)) {
                      break L4;
                    } else {
                      il.field_bb = vn.field_s;
                      break L4;
                    }
                  }
                } else {
                  break L4;
                }
              }
              if (il.field_bb != null) {
                il.field_bb.c(bb.field_b - il.field_bb.field_h, 2, -il.field_bb.field_l + pd.field_k);
                break L1;
              } else {
                break L1;
              }
            }
          } else {
            ba.field_c = td.field_P;
            ck.field_e = nh.field_p;
            uq.field_i = 0;
            vn.field_s = rr.a(param0, td.field_P, nh.field_p, param1 + -37);
            break L1;
          }
        }
    }

    final static void a(int param0, boolean param1) {
        int var2 = 0;
        int stackIn_6_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_10_2 = 0;
        boolean stackIn_10_3 = false;
        int stackIn_10_4 = 0;
        int stackIn_10_5 = 0;
        int stackIn_10_6 = 0;
        int stackIn_10_7 = 0;
        int stackIn_10_8 = 0;
        int stackIn_10_9 = 0;
        int stackIn_10_10 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_11_2 = 0;
        boolean stackIn_11_3 = false;
        int stackIn_11_4 = 0;
        int stackIn_11_5 = 0;
        int stackIn_11_6 = 0;
        int stackIn_11_7 = 0;
        int stackIn_11_8 = 0;
        int stackIn_11_9 = 0;
        int stackIn_11_10 = 0;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        int stackIn_12_2 = 0;
        boolean stackIn_12_3 = false;
        int stackIn_12_4 = 0;
        int stackIn_12_5 = 0;
        int stackIn_12_6 = 0;
        int stackIn_12_7 = 0;
        int stackIn_12_8 = 0;
        int stackIn_12_9 = 0;
        int stackIn_12_10 = 0;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        int stackIn_13_2 = 0;
        boolean stackIn_13_3 = false;
        int stackIn_13_4 = 0;
        int stackIn_13_5 = 0;
        int stackIn_13_6 = 0;
        int stackIn_13_7 = 0;
        int stackIn_13_8 = 0;
        int stackIn_13_9 = 0;
        int stackIn_13_10 = 0;
        int stackIn_14_0 = 0;
        int stackIn_14_1 = 0;
        int stackIn_14_2 = 0;
        boolean stackIn_14_3 = false;
        int stackIn_14_4 = 0;
        int stackIn_14_5 = 0;
        int stackIn_14_6 = 0;
        int stackIn_14_7 = 0;
        int stackIn_14_8 = 0;
        int stackIn_14_9 = 0;
        int stackIn_14_10 = 0;
        int stackIn_14_11 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        int stackOut_9_2 = 0;
        boolean stackOut_9_3 = false;
        int stackOut_9_4 = 0;
        int stackOut_9_5 = 0;
        int stackOut_9_6 = 0;
        int stackOut_9_7 = 0;
        int stackOut_9_8 = 0;
        int stackOut_9_9 = 0;
        int stackOut_9_10 = 0;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        int stackOut_10_2 = 0;
        boolean stackOut_10_3 = false;
        int stackOut_10_4 = 0;
        int stackOut_10_5 = 0;
        int stackOut_10_6 = 0;
        int stackOut_10_7 = 0;
        int stackOut_10_8 = 0;
        int stackOut_10_9 = 0;
        int stackOut_10_10 = 0;
        int stackOut_13_0 = 0;
        int stackOut_13_1 = 0;
        int stackOut_13_2 = 0;
        boolean stackOut_13_3 = false;
        int stackOut_13_4 = 0;
        int stackOut_13_5 = 0;
        int stackOut_13_6 = 0;
        int stackOut_13_7 = 0;
        int stackOut_13_8 = 0;
        int stackOut_13_9 = 0;
        int stackOut_13_10 = 0;
        int stackOut_13_11 = 0;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        int stackOut_11_2 = 0;
        boolean stackOut_11_3 = false;
        int stackOut_11_4 = 0;
        int stackOut_11_5 = 0;
        int stackOut_11_6 = 0;
        int stackOut_11_7 = 0;
        int stackOut_11_8 = 0;
        int stackOut_11_9 = 0;
        int stackOut_11_10 = 0;
        int stackOut_12_0 = 0;
        int stackOut_12_1 = 0;
        int stackOut_12_2 = 0;
        boolean stackOut_12_3 = false;
        int stackOut_12_4 = 0;
        int stackOut_12_5 = 0;
        int stackOut_12_6 = 0;
        int stackOut_12_7 = 0;
        int stackOut_12_8 = 0;
        int stackOut_12_9 = 0;
        int stackOut_12_10 = 0;
        int stackOut_12_11 = 0;
        L0: {
          mf.d(58);
          if (np.field_a != null) {
            if (tf.a(true, np.field_a.field_Lb)) {
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
          var2 = stackIn_6_0;
          stackOut_6_0 = 14;
          stackIn_8_0 = stackOut_6_0;
          stackIn_7_0 = stackOut_6_0;
          if (-51 <= (l.field_f ^ -1)) {
            stackOut_8_0 = stackIn_8_0;
            stackOut_8_1 = 0;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            break L1;
          } else {
            stackOut_7_0 = stackIn_7_0;
            stackOut_7_1 = 1;
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            break L1;
          }
        }
        L2: {
          L3: {
            stackOut_9_0 = stackIn_9_0;
            stackOut_9_1 = stackIn_9_1;
            stackOut_9_2 = param0 ^ 16777213;
            stackOut_9_3 = param1;
            stackOut_9_4 = 13;
            stackOut_9_5 = 0;
            stackOut_9_6 = 15;
            stackOut_9_7 = so.field_o;
            stackOut_9_8 = 1;
            stackOut_9_9 = var2;
            stackOut_9_10 = 11;
            stackIn_12_0 = stackOut_9_0;
            stackIn_12_1 = stackOut_9_1;
            stackIn_12_2 = stackOut_9_2;
            stackIn_12_3 = stackOut_9_3;
            stackIn_12_4 = stackOut_9_4;
            stackIn_12_5 = stackOut_9_5;
            stackIn_12_6 = stackOut_9_6;
            stackIn_12_7 = stackOut_9_7;
            stackIn_12_8 = stackOut_9_8;
            stackIn_12_9 = stackOut_9_9;
            stackIn_12_10 = stackOut_9_10;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            stackIn_10_2 = stackOut_9_2;
            stackIn_10_3 = stackOut_9_3;
            stackIn_10_4 = stackOut_9_4;
            stackIn_10_5 = stackOut_9_5;
            stackIn_10_6 = stackOut_9_6;
            stackIn_10_7 = stackOut_9_7;
            stackIn_10_8 = stackOut_9_8;
            stackIn_10_9 = stackOut_9_9;
            stackIn_10_10 = stackOut_9_10;
            if (v.field_b) {
              break L3;
            } else {
              stackOut_10_0 = stackIn_10_0;
              stackOut_10_1 = stackIn_10_1;
              stackOut_10_2 = stackIn_10_2;
              stackOut_10_3 = stackIn_10_3;
              stackOut_10_4 = stackIn_10_4;
              stackOut_10_5 = stackIn_10_5;
              stackOut_10_6 = stackIn_10_6;
              stackOut_10_7 = stackIn_10_7;
              stackOut_10_8 = stackIn_10_8;
              stackOut_10_9 = stackIn_10_9;
              stackOut_10_10 = stackIn_10_10;
              stackIn_13_0 = stackOut_10_0;
              stackIn_13_1 = stackOut_10_1;
              stackIn_13_2 = stackOut_10_2;
              stackIn_13_3 = stackOut_10_3;
              stackIn_13_4 = stackOut_10_4;
              stackIn_13_5 = stackOut_10_5;
              stackIn_13_6 = stackOut_10_6;
              stackIn_13_7 = stackOut_10_7;
              stackIn_13_8 = stackOut_10_8;
              stackIn_13_9 = stackOut_10_9;
              stackIn_13_10 = stackOut_10_10;
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              stackIn_11_3 = stackOut_10_3;
              stackIn_11_4 = stackOut_10_4;
              stackIn_11_5 = stackOut_10_5;
              stackIn_11_6 = stackOut_10_6;
              stackIn_11_7 = stackOut_10_7;
              stackIn_11_8 = stackOut_10_8;
              stackIn_11_9 = stackOut_10_9;
              stackIn_11_10 = stackOut_10_10;
              if (!kc.field_d) {
                stackOut_13_0 = stackIn_13_0;
                stackOut_13_1 = stackIn_13_1;
                stackOut_13_2 = stackIn_13_2;
                stackOut_13_3 = stackIn_13_3;
                stackOut_13_4 = stackIn_13_4;
                stackOut_13_5 = stackIn_13_5;
                stackOut_13_6 = stackIn_13_6;
                stackOut_13_7 = stackIn_13_7;
                stackOut_13_8 = stackIn_13_8;
                stackOut_13_9 = stackIn_13_9;
                stackOut_13_10 = stackIn_13_10;
                stackOut_13_11 = 0;
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
                stackIn_14_10 = stackOut_13_10;
                stackIn_14_11 = stackOut_13_11;
                break L2;
              } else {
                stackOut_11_0 = stackIn_11_0;
                stackOut_11_1 = stackIn_11_1;
                stackOut_11_2 = stackIn_11_2;
                stackOut_11_3 = stackIn_11_3;
                stackOut_11_4 = stackIn_11_4;
                stackOut_11_5 = stackIn_11_5;
                stackOut_11_6 = stackIn_11_6;
                stackOut_11_7 = stackIn_11_7;
                stackOut_11_8 = stackIn_11_8;
                stackOut_11_9 = stackIn_11_9;
                stackOut_11_10 = stackIn_11_10;
                stackIn_12_0 = stackOut_11_0;
                stackIn_12_1 = stackOut_11_1;
                stackIn_12_2 = stackOut_11_2;
                stackIn_12_3 = stackOut_11_3;
                stackIn_12_4 = stackOut_11_4;
                stackIn_12_5 = stackOut_11_5;
                stackIn_12_6 = stackOut_11_6;
                stackIn_12_7 = stackOut_11_7;
                stackIn_12_8 = stackOut_11_8;
                stackIn_12_9 = stackOut_11_9;
                stackIn_12_10 = stackOut_11_10;
                break L3;
              }
            }
          }
          stackOut_12_0 = stackIn_12_0;
          stackOut_12_1 = stackIn_12_1;
          stackOut_12_2 = stackIn_12_2;
          stackOut_12_3 = stackIn_12_3;
          stackOut_12_4 = stackIn_12_4;
          stackOut_12_5 = stackIn_12_5;
          stackOut_12_6 = stackIn_12_6;
          stackOut_12_7 = stackIn_12_7;
          stackOut_12_8 = stackIn_12_8;
          stackOut_12_9 = stackIn_12_9;
          stackOut_12_10 = stackIn_12_10;
          stackOut_12_11 = 1;
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
          stackIn_14_10 = stackOut_12_10;
          stackIn_14_11 = stackOut_12_11;
          break L2;
        }
        L4: {
          hg.a(stackIn_14_0, stackIn_14_1 != 0, stackIn_14_2, stackIn_14_3, stackIn_14_4, stackIn_14_5, stackIn_14_6, stackIn_14_7, stackIn_14_8 != 0, stackIn_14_9 != 0, stackIn_14_10, stackIn_14_11 != 0);
          if (!sm.field_e) {
            break L4;
          } else {
            if (cl.field_n % 50 == 0) {
              js.field_f.h(58, 255);
              break L4;
            } else {
              break L4;
            }
          }
        }
        L5: {
          if (!ac.field_u) {
            break L5;
          } else {
            js.field_f.h(58, 255);
            ac.field_u = false;
            break L5;
          }
        }
        L6: {
          if (param0 == 2) {
            break L6;
          } else {
            field_F = null;
            break L6;
          }
        }
        L7: {
          if (s.field_d) {
            js.field_f.h(10, param0 + 253);
            s.field_d = false;
            break L7;
          } else {
            break L7;
          }
        }
        L8: {
          if (!uc.field_B) {
            break L8;
          } else {
            uc.a(320, mp.field_b.field_K, mp.field_b.field_q + mp.field_b.field_K, 240, 8, nd.field_i, true, mr.field_i, (byte) -87, 2, mr.field_i, (nq) (Object) mp.field_b, false, 8, 1);
            uc.field_B = false;
            break L8;
          }
        }
    }

    final kg a(ko param0, int param1, String param2) {
        kg var4 = new kg(param2, param0);
        var4.field_p = (iq) (Object) new qp();
        int var5 = -2 + ((cf) this).field_n;
        ((cf) this).a(0, ((cf) this).field_n + 34, (byte) 127, 0, ((cf) this).field_x);
        if (param1 <= 119) {
            return null;
        }
        var4.a(var5, 30, (byte) 103, 7, -14 + ((cf) this).field_x);
        ((cf) this).b((byte) -82, (vg) (Object) var4);
        return var4;
    }

    public static void a(int param0) {
        field_H = null;
        field_I = null;
        if (param0 != 240) {
            cf.a(119, 101, 48, true);
        }
        field_M = null;
        field_F = null;
    }

    final static void a(int param0, int param1, int param2, boolean param3) {
        gs.a(param0, param3, param2, -77, cr.field_c, rc.field_l, tg.field_a);
        if (param1 != 8) {
            Object var5 = null;
            hh discarded$0 = cf.a((bc) null, -64, (bc) null, 13, 77);
        }
    }

    cf(ns param0, nq param1, String param2) {
        super(0, 0, 288, 0, (iq) null);
        ((cf) this).field_G = 0;
        ((cf) this).field_J = param1;
        ((cf) this).field_K = param0;
        ((cf) this).field_L = param2;
        int var4 = ((cf) this).field_L != null ? ((cf) this).field_J.c(((cf) this).field_L, 260, ((cf) this).field_J.field_J) : 0;
        ((cf) this).a(0, 22 - -var4, (byte) 121, 0, 288);
    }

    final void a(String param0, byte param1, int param2) {
        int var4 = ((cf) this).field_G;
        this.b(1 + var4, true);
        ((cf) this).field_E[var4] = ((cf) this).a((ko) this, 122, param0);
        if (param1 < 99) {
            this.b(105, true);
        }
        ((cf) this).field_N[var4] = param2;
    }

    final void a(int param0, int param1, int param2, int param3) {
        super.a(param0, param1 ^ 0, param2, param3);
        int discarded$32 = ((cf) this).field_J.a(((cf) this).field_L, param3 + (((cf) this).field_m + 14), 10 + ((cf) this).field_q + param2, ((cf) this).field_x - 28, ((cf) this).field_n, 16777215, -1, 0, 0, ((cf) this).field_J.field_J);
        if (param1 != -11857) {
            field_D = 28;
        }
    }

    public final void a(kg param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = ShatteredPlansClient.field_F ? 1 : 0;
        if (param1 != 6) {
            return;
        }
        for (var6 = 0; var6 < ((cf) this).field_G; var6++) {
            if (param0 == ((cf) this).field_E[var6]) {
                var7 = ((cf) this).field_N[var6];
                if (var7 != -1) {
                    qj.a((byte) -127, ((cf) this).field_N[var6]);
                    break;
                }
                ((cf) this).field_K.i((byte) -104);
                break;
            }
        }
    }

    private final void b(int param0, boolean param1) {
        int var5 = 0;
        int var6 = ShatteredPlansClient.field_F ? 1 : 0;
        if (!(param0 > ((cf) this).field_G)) {
            return;
        }
        kg[] var7 = new kg[param0];
        kg[] var3 = var7;
        int[] var4 = new int[param0];
        if (!param1) {
            ((cf) this).field_K = null;
        }
        for (var5 = 0; var5 < ((cf) this).field_G; var5++) {
            var7[var5] = ((cf) this).field_E[var5];
            var4[var5] = ((cf) this).field_N[var5];
        }
        ((cf) this).field_N = var4;
        ((cf) this).field_G = param0;
        ((cf) this).field_E = var3;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_M = "From <%0>: ";
        field_I = "Game Type: Derelicts";
    }
}
