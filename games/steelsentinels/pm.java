/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class pm extends dl implements fd, ae {
    static int field_S;
    static String field_P;
    private boolean field_ab;
    static int field_Z;
    private jf field_Q;
    private boolean field_eb;
    static int field_U;
    static gh field_gb;
    static String field_Y;
    private jf field_V;
    private oa field_X;
    private String field_fb;
    private oa field_R;
    static ul field_db;
    static int field_T;
    static jj[] field_W;
    private boolean field_cb;
    private oa field_bb;

    final void a(String param0, int param1) {
        int var3 = 65 / ((param1 - 81) / 42);
        jf var4 = ((pm) this).field_V;
        String var5 = param0;
        var4.a(var5, 29597, false);
        ((pm) this).field_Q.i(-8521);
    }

    public final void a(boolean param0, jf param1) {
        if (!(param1 != ((pm) this).field_V)) {
            boolean discarded$0 = ((pm) this).field_Q.a(1, (lh) this);
        }
        if (param1 == ((pm) this).field_Q) {
            this.i(0);
        }
        if (!param0) {
            field_W = null;
        }
    }

    final static boolean n(int param0) {
        if (param0 < 11) {
            field_S = 121;
        }
        if ((jg.field_f ^ -1) == 0) {
            if (!(ve.a((byte) -116, 1))) {
                return false;
            }
            jg.field_f = rf.field_d.f((byte) -118);
            rf.field_d.field_p = 0;
        }
        if (!(-2 != jg.field_f)) {
            if (!ve.a((byte) -103, 2)) {
                return false;
            }
            jg.field_f = rf.field_d.c((byte) -60);
            rf.field_d.field_p = 0;
        }
        return ve.a((byte) -112, jg.field_f);
    }

    final boolean a(int param0, int param1, char param2, lh param3) {
        if (!(!super.a(param0, param1, param2, param3))) {
            return true;
        }
        if (param1 == 98) {
            return ((pm) this).b(param3, 74);
        }
        if ((param1 ^ -1) == -100) {
            return ((pm) this).b(-11963, param3);
        }
        return false;
    }

    public final void a(int param0, byte param1, int param2, oa param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = SteelSentinels.field_G;
          var6 = -6 / ((-85 - param1) / 36);
          if (((pm) this).field_bb == param3) {
            this.i(0);
            break L0;
          } else {
            if (param3 == ((pm) this).field_X) {
              nj.h((byte) 45);
              break L0;
            } else {
              if (param3 != ((pm) this).field_R) {
                break L0;
              } else {
                if (!((pm) this).field_eb) {
                  if (!((pm) this).field_cb) {
                    se.a(110);
                    break L0;
                  } else {
                    id.d((byte) 112);
                    break L0;
                  }
                } else {
                  tj.a(121);
                  break L0;
                }
              }
            }
          }
        }
    }

    public static void l(int param0) {
        field_Y = null;
        field_P = null;
        field_db = null;
        field_gb = null;
        field_W = null;
        if (param0 != 320) {
            pm.m(-108);
        }
    }

    pm(String param0, String param1, boolean param2, boolean param3, boolean param4) {
        super(0, 0, 310, 190, (qk) null);
        kh var6 = null;
        mi var7 = null;
        String var8 = null;
        de var9 = null;
        hc var12 = null;
        hc var13 = null;
        Object stackIn_1_0 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        Object stackIn_15_0 = null;
        oa stackIn_15_1 = null;
        oa stackIn_15_2 = null;
        Object stackIn_16_0 = null;
        oa stackIn_16_1 = null;
        oa stackIn_16_2 = null;
        Object stackIn_17_0 = null;
        oa stackIn_17_1 = null;
        oa stackIn_17_2 = null;
        String stackIn_17_3 = null;
        Object stackOut_0_0 = null;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        Object stackOut_3_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        Object stackOut_6_0 = null;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_14_0 = null;
        oa stackOut_14_1 = null;
        oa stackOut_14_2 = null;
        Object stackOut_16_0 = null;
        oa stackOut_16_1 = null;
        oa stackOut_16_2 = null;
        String stackOut_16_3 = null;
        Object stackOut_15_0 = null;
        oa stackOut_15_1 = null;
        oa stackOut_15_2 = null;
        String stackOut_15_3 = null;
        L0: {
          stackOut_0_0 = this;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (!param4) {
            stackOut_2_0 = this;
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = this;
            stackOut_1_1 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        L1: {
          ((pm) this).field_cb = stackIn_3_1 != 0;
          stackOut_3_0 = this;
          stackIn_5_0 = stackOut_3_0;
          stackIn_4_0 = stackOut_3_0;
          if (!param3) {
            stackOut_5_0 = this;
            stackOut_5_1 = 0;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            break L1;
          } else {
            stackOut_4_0 = this;
            stackOut_4_1 = 1;
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            break L1;
          }
        }
        L2: {
          ((pm) this).field_ab = stackIn_6_1 != 0;
          stackOut_6_0 = this;
          stackIn_8_0 = stackOut_6_0;
          stackIn_7_0 = stackOut_6_0;
          if (!param2) {
            stackOut_8_0 = this;
            stackOut_8_1 = 0;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            break L2;
          } else {
            stackOut_7_0 = this;
            stackOut_7_1 = 1;
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            break L2;
          }
        }
        L3: {
          ((pm) this).field_eb = stackIn_9_1 != 0;
          ((pm) this).field_fb = param1;
          if (!((pm) this).field_eb) {
            break L3;
          } else {
            L4: {
              if (((pm) this).field_ab) {
                break L4;
              } else {
                if (!((pm) this).field_cb) {
                  break L3;
                } else {
                  break L4;
                }
              }
            }
            throw new IllegalStateException();
          }
        }
        L5: {
          ((pm) this).field_V = (jf) (Object) new bc(param0, (tn) this, 100);
          ((pm) this).field_Q = (jf) (Object) new bc("", (tn) this, 20);
          if (((pm) this).field_eb) {
            ((pm) this).field_bb = new oa(sl.field_c, (tn) null);
            ((pm) this).field_R = new oa(qe.field_b, (tn) null);
            ((pm) this).field_V.field_K = false;
            break L5;
          } else {
            L6: {
              ((pm) this).field_bb = new oa(lb.field_cc, (tn) null);
              stackOut_14_0 = this;
              stackOut_14_1 = null;
              stackOut_14_2 = null;
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              if (!((pm) this).field_cb) {
                stackOut_16_0 = this;
                stackOut_16_1 = null;
                stackOut_16_2 = null;
                stackOut_16_3 = le.field_J;
                stackIn_17_0 = stackOut_16_0;
                stackIn_17_1 = stackOut_16_1;
                stackIn_17_2 = stackOut_16_2;
                stackIn_17_3 = stackOut_16_3;
                break L6;
              } else {
                stackOut_15_0 = this;
                stackOut_15_1 = null;
                stackOut_15_2 = null;
                stackOut_15_3 = lj.field_c;
                stackIn_17_0 = stackOut_15_0;
                stackIn_17_1 = stackOut_15_1;
                stackIn_17_2 = stackOut_15_2;
                stackIn_17_3 = stackOut_15_3;
                break L6;
              }
            }
            new oa(stackIn_17_3, (tn) null);
            ((pm) this).field_R = stackIn_17_1;
            if (!((pm) this).field_ab) {
              break L5;
            } else {
              ((pm) this).field_X = new oa(tk.field_n, (tn) this);
              break L5;
            }
          }
        }
        L7: {
          ((pm) this).field_V.field_p = (qk) (Object) new ag(10000536);
          ((pm) this).field_Q.field_p = (qk) (Object) new li(10000536);
          var6 = new kh();
          ((pm) this).field_bb.field_p = (qk) (Object) var6;
          if (null == ((pm) this).field_R) {
            break L7;
          } else {
            ((pm) this).field_R.field_p = (qk) (Object) var6;
            break L7;
          }
        }
        L8: {
          if (((pm) this).field_X == null) {
            break L8;
          } else {
            ((pm) this).field_X.field_p = (qk) (Object) var6;
            break L8;
          }
        }
        L9: {
          ((pm) this).field_V.field_v = pa.field_i;
          if (((pm) this).field_X == null) {
            break L9;
          } else {
            ((pm) this).field_X.field_v = r.field_m;
            break L9;
          }
        }
        L10: {
          if (!((pm) this).field_eb) {
            if (!((pm) this).field_cb) {
              ((pm) this).field_R.field_p = (qk) (Object) new bl();
              break L10;
            } else {
              ((pm) this).field_R.field_v = rg.field_g;
              ((pm) this).field_R.field_p = (qk) (Object) new bl();
              break L10;
            }
          } else {
            ((pm) this).field_R.field_v = bb.field_P;
            break L10;
          }
        }
        L11: {
          ((pm) this).field_z = 15;
          var7 = tj.field_e;
          if (null == ((pm) this).field_fb) {
            break L11;
          } else {
            ((pm) this).field_z = ((pm) this).field_z + (5 + var7.a(((pm) this).field_fb, -40 + ((pm) this).field_x, var7.field_G));
            break L11;
          }
        }
        L12: {
          var8 = qe.field_c;
          var9 = db.a((byte) -60, wl.d((byte) -21));
          if (var9 != qd.field_o) {
            if (var9 != mj.field_Vb) {
              break L12;
            } else {
              var8 = ji.field_l;
              break L12;
            }
          } else {
            var8 = ln.field_b;
            break L12;
          }
        }
        L13: {
          var12 = new hc(10, ((pm) this).field_z, ((pm) this).field_x + -20, 25, (lh) (Object) ((pm) this).field_V, false, 80, 3, var7, 16777215, var8);
          ((pm) this).a((lh) (Object) new hc(10, ((pm) this).field_z, ((pm) this).field_x + -20, 25, (lh) (Object) ((pm) this).field_V, false, 80, 3, var7, 16777215, var8), -100);
          ((pm) this).field_z = ((pm) this).field_z + (5 + ((lh) (Object) var12).field_E);
          var13 = new hc(10, ((pm) this).field_z, ((pm) this).field_x + -20, 25, (lh) (Object) ((pm) this).field_Q, false, 80, 3, var7, 16777215, jh.field_c);
          ((pm) this).a((lh) (Object) new hc(10, ((pm) this).field_z, ((pm) this).field_x + -20, 25, (lh) (Object) ((pm) this).field_Q, false, 80, 3, var7, 16777215, jh.field_c), -120);
          ((pm) this).field_bb.field_A = (tn) this;
          ((pm) this).field_z = ((pm) this).field_z + (((lh) (Object) var13).field_E - -5);
          if (null == ((pm) this).field_X) {
            break L13;
          } else {
            ((pm) this).field_X.field_A = (tn) this;
            break L13;
          }
        }
        L14: {
          if (((pm) this).field_R == null) {
            break L14;
          } else {
            ((pm) this).field_R.field_A = (tn) this;
            break L14;
          }
        }
        L15: {
          if (null != ((pm) this).field_X) {
            ((pm) this).field_bb.a(85, (byte) -94, ((pm) this).field_z, -95 + ((pm) this).field_x, 30);
            ((pm) this).field_z = ((pm) this).field_z + 60;
            break L15;
          } else {
            ((pm) this).field_bb.a(8, (byte) -95, ((pm) this).field_z, ((pm) this).field_x - 6 + -10, 30);
            ((pm) this).field_z = ((pm) this).field_z + 35;
            break L15;
          }
        }
        L16: {
          if (((pm) this).field_X == null) {
            break L16;
          } else {
            ((pm) this).field_X.a(8, (byte) -85, ((pm) this).field_z, -6 + (((pm) this).field_x - 10), 30);
            ((pm) this).field_z = ((pm) this).field_z + 35;
            break L16;
          }
        }
        L17: {
          if (((pm) this).field_R == null) {
            break L17;
          } else {
            L18: {
              if (((pm) this).field_eb) {
                break L18;
              } else {
                if (!((pm) this).field_cb) {
                  ((pm) this).field_R.a(8, (byte) -127, ((pm) this).field_z, 40, 20);
                  ((pm) this).field_z = ((pm) this).field_z + 25;
                  break L17;
                } else {
                  break L18;
                }
              }
            }
            ((pm) this).field_R.a(8, (byte) -106, ((pm) this).field_z, ((pm) this).field_x + -16, 30);
            ((pm) this).field_z = ((pm) this).field_z + 35;
            break L17;
          }
        }
        L19: {
          ((pm) this).a(0, (byte) -117, 0, ((pm) this).field_x, ((pm) this).field_z + 3);
          ((pm) this).a((lh) (Object) ((pm) this).field_bb, -123);
          if (((pm) this).field_X == null) {
            break L19;
          } else {
            ((pm) this).a((lh) (Object) ((pm) this).field_X, -123);
            break L19;
          }
        }
        L20: {
          if (((pm) this).field_R == null) {
            break L20;
          } else {
            ((pm) this).a((lh) (Object) ((pm) this).field_R, -124);
            break L20;
          }
        }
    }

    final static void a(byte param0) {
        int var1 = -5 / ((param0 - -47) / 43);
        if (!(!vb.field_e)) {
            ke.a(2);
        }
    }

    final void j(int param0) {
        ((pm) this).field_V.i(-8521);
        ((pm) this).field_Q.i(-8521);
        int var2 = -123 % ((11 - param0) / 41);
    }

    private final void i(int param0) {
        if (param0 != 0) {
            Object var3 = null;
            ((pm) this).a(-117, (byte) 35, 73, (oa) null, -5);
        }
        if (!nn.a((byte) 42)) {
            // if_icmpge L87
            // if_icmplt L68
        } else {
            hh.a(((pm) this).field_V.field_y, ((pm) this).field_Q.field_y, 50);
        }
    }

    final void a(int param0, byte param1, int param2, int param3) {
        if (null != ((pm) this).field_fb) {
            int discarded$0 = tj.field_e.a(((pm) this).field_fb, 20 + ((pm) this).field_o + param2, ((pm) this).field_z + param0 - -15, -40 + ((pm) this).field_x, ((pm) this).field_E, 16777215, -1, 1, 0, tj.field_e.field_G);
        }
        if (!(((pm) this).field_X == null)) {
            pb.g(10 + param2, 134 + param0, ((pm) this).field_x - 20, 4210752);
        }
        super.a(param0, (byte) -124, param2, param3);
        if (param1 > -99) {
            ((pm) this).field_V = null;
        }
    }

    final String h(byte param0) {
        if (null == ((pm) this).field_V.field_y) {
            return "";
        }
        if (param0 > -48) {
            field_Y = null;
        }
        return ((pm) this).field_V.field_y;
    }

    public final void a(jf param0, byte param1) {
        if (param1 != 89) {
            ((pm) this).field_Q = null;
        }
    }

    final static void k(int param0) {
        int var2 = 0;
        ud var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        String[][] var6 = null;
        int[][] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        kj var13 = null;
        int var14 = 0;
        int var15 = 0;
        kj var16 = null;
        var12 = SteelSentinels.field_G;
        var13 = rf.field_d;
        var16 = var13;
        var2 = var16.f((byte) -67);
        var4 = 121 / ((40 - param0) / 53);
        var3 = (ud) (Object) uf.field_f.e(13058);
        L0: while (true) {
          L1: {
            if (var3 == null) {
              break L1;
            } else {
              if (var3.field_t == var2) {
                break L1;
              } else {
                var3 = (ud) (Object) uf.field_f.a((byte) -33);
                continue L0;
              }
            }
          }
          if (var3 == null) {
            pm.m(81);
            return;
          } else {
            L2: {
              var4 = var16.f((byte) -63);
              if (-1 != (var4 ^ -1)) {
                ua.field_M[0] = g.field_l;
                var5 = var3.field_u;
                var6_int = 1;
                L3: while (true) {
                  if (var6_int >= var4) {
                    hb.a(-121, var4, var5);
                    var6_int = 0;
                    L4: while (true) {
                      if (var4 <= var6_int) {
                        bc.a(var5, (byte) 98);
                        var3.field_z = new String[2][var5];
                        var6 = new String[2][var5];
                        var3.field_x = new int[2][var5 * 4];
                        var7 = new int[2][var5 * 4];
                        var8 = kc.field_z;
                        var9 = 0;
                        var10 = 0;
                        L5: while (true) {
                          if (var8 <= var9) {
                            var14 = 0;
                            var9 = var14;
                            var15 = 0;
                            var10 = var15;
                            L6: while (true) {
                              if (var8 <= var14) {
                                break L2;
                              } else {
                                var11 = un.field_j[var14 + var5];
                                var6[1][var15] = ua.field_M[var11];
                                var7[1][4 * var15] = ok.field_d[var11];
                                var7[1][1 + 4 * var15] = jm.field_r[var11];
                                var7[1][2 + 4 * var15] = ne.field_G[var11];
                                var7[1][var15 * 4 - -3] = mb.field_T[var11];
                                if (wl.a(47, ua.field_M[var11])) {
                                  if (0 == mb.field_T[var11] + ne.field_G[var11] + jm.field_r[var11]) {
                                    var6[1][var15] = null;
                                    var15--;
                                    var15++;
                                    var14++;
                                    continue L6;
                                  } else {
                                    var15++;
                                    var14++;
                                    continue L6;
                                  }
                                } else {
                                  var15++;
                                  var14++;
                                  continue L6;
                                }
                              }
                            }
                          } else {
                            var11 = un.field_j[var9];
                            var6[0][var10] = ua.field_M[var11];
                            var7[0][4 * var10] = ok.field_d[var11];
                            var7[0][1 + 4 * var10] = jm.field_r[var11];
                            var7[0][var10 * 4 + 2] = ne.field_G[var11];
                            var7[0][3 + var10 * 4] = mb.field_T[var11];
                            if (wl.a(107, ua.field_M[var11])) {
                              if (0 == jm.field_r[var11] + (ne.field_G[var11] - -mb.field_T[var11])) {
                                var6[0][var10] = null;
                                var10--;
                                var9++;
                                var10++;
                                continue L5;
                              } else {
                                var9++;
                                var10++;
                                continue L5;
                              }
                            } else {
                              var9++;
                              var10++;
                              continue L5;
                            }
                          }
                        }
                      } else {
                        nk.a((byte) -80, (gi) (Object) var16);
                        if (var6_int == 0) {
                          var3.field_B = uf.field_h;
                          var3.field_s = um.field_W;
                          var3.field_p = lb.field_Tb;
                          var3.field_o = field_S;
                          qf.a(field_S, var6_int, um.field_W, (byte) 68, uf.field_h, lb.field_Tb);
                          var6_int++;
                          continue L4;
                        } else {
                          qf.a(field_S, var6_int, um.field_W, (byte) 84, uf.field_h, lb.field_Tb);
                          var6_int++;
                          continue L4;
                        }
                      }
                    }
                  } else {
                    ua.field_M[var6_int] = var13.h(1);
                    var6_int++;
                    continue L3;
                  }
                }
              } else {
                break L2;
              }
            }
            var3.field_r = true;
            var3.b(4);
            return;
          }
        }
    }

    final static void a(boolean param0) {
        int var1 = 0;
        int[] var2 = null;
        int var3 = 0;
        pe var4_ref_pe = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        double var10 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17_int = 0;
        pe var17 = null;
        int var18 = 0;
        int var19 = 0;
        int[] var20 = null;
        int[] var21 = null;
        int[] var22 = null;
        int[] var23 = null;
        var19 = SteelSentinels.field_G;
        nm.field_s = new int[]{0, 0, -8144, 65536, 0, 0, 0, -65536, 0, 0, 0, 65536};
        var1 = nn.field_h.length;
        var23 = new int[var1];
        var22 = var23;
        var21 = var22;
        var20 = var21;
        var2 = var20;
        var3 = 0;
        L0: while (true) {
          if (var1 <= var3) {
            L1: {
              var3 = nm.field_s[9] >> 1951769704;
              var4 = nm.field_s[10] >> 429128136;
              var5 = nm.field_s[11] >> 112730344;
              var6 = vn.field_h << -2017120156;
              var7 = 0;
              var8 = jh.a(var6, 4096) >> -2082800472;
              var9 = kg.a(var6, (byte) -84) >> -52554968;
              if (-1 == oh.field_f) {
                break L1;
              } else {
                if (0 != (pi.field_c ^ -1)) {
                  var8 = -pi.field_c + 240;
                  var9 = -128;
                  var7 = oh.field_f - 320;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (param0) {
                break L2;
              } else {
                field_gb = null;
                break L2;
              }
            }
            var10 = 256.0 / Math.sqrt((double)(var7 * var7 + var8 * var8 - -(var9 * var9)));
            var7 = (int)((double)var7 * var10);
            var9 = (int)((double)var9 * var10);
            var8 = (int)((double)var8 * var10);
            var12 = -var3 + var7;
            var13 = var8 + -var4;
            var14 = var9 + -var5;
            var10 = 256.0 / Math.sqrt((double)(var12 * var12 + (var13 * var13 - -(var14 * var14))));
            var14 = (int)((double)var14 * var10);
            var13 = (int)((double)var13 * var10);
            var12 = (int)((double)var12 * var10);
            var15 = 0;
            L3: while (true) {
              if (var15 >= nn.field_h.length) {
                return;
              } else {
                var16 = 0;
                var17_int = 1;
                L4: while (true) {
                  if (var17_int >= nn.field_h.length) {
                    var2[var16] = -2147483648;
                    var17 = nn.field_h[var16];
                    pe.a(var16, -124);
                    var18 = 0;
                    L5: while (true) {
                      if (3 <= var18) {
                        ul.a(true, (byte) -128, false, bl.field_e, var17, false, nm.field_s);
                        ch.a(var9, var8, var14, -125, var12, var17, var7, var13);
                        var15++;
                        continue L3;
                      } else {
                        bl.field_e[var18] = bl.field_e[var18] + cl.field_f[var15][var18];
                        var18++;
                        continue L5;
                      }
                    }
                  } else {
                    if (var23[var16] < var23[var17_int]) {
                      var16 = var17_int;
                      var17_int++;
                      continue L4;
                    } else {
                      var17_int++;
                      continue L4;
                    }
                  }
                }
              }
            }
          } else {
            var4_ref_pe = nn.field_h[var3];
            var4_ref_pe.b(32767);
            pe.a(var3, -106);
            var5 = var4_ref_pe.field_J + var4_ref_pe.field_c >> 362577121;
            var6 = var4_ref_pe.field_p - -var4_ref_pe.field_W >> 776487329;
            var7 = var4_ref_pe.field_n + var4_ref_pe.field_s >> 2005930401;
            var8 = nm.field_s[9] >> -510207390;
            var9 = nm.field_s[10] >> 2009913506;
            var10_int = nm.field_s[11] >> 1611463714;
            var11 = bl.field_e[5] * var10_int + var8 * bl.field_e[3] - -(bl.field_e[4] * var9) >> 1759201038;
            var12 = var8 * bl.field_e[6] - -(bl.field_e[7] * var9) + var10_int * bl.field_e[8] >> 2070824142;
            var13 = bl.field_e[11] * var10_int + bl.field_e[9] * var8 - -(bl.field_e[10] * var9) >> 1392871726;
            var2[var3] = var12 * var6 + var11 * var5 + var7 * var13 >> -928418544;
            var3++;
            continue L0;
          }
        }
    }

    final static void m(int param0) {
        int var1 = -116 / ((33 - param0) / 34);
        if (!(null == rb.field_h)) {
            rb.field_h.b(12110);
            rb.field_h = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_P = "Expert Training";
        field_Y = "Change display name";
    }
}
