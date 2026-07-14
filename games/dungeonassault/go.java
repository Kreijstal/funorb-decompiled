/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class go extends qe {
    static String[] field_A;
    private boolean field_w;
    static cn field_S;
    pj field_Y;
    static String field_F;
    static String field_V;
    private int field_H;
    private nn field_M;
    private int field_I;
    private int[] field_P;
    private pp field_O;
    private int field_s;
    private int field_u;
    private String field_E;
    private hb field_y;
    private boolean field_v;
    private int field_C;
    private hj[] field_z;
    private String field_W;
    private int[] field_U;
    private boolean field_Q;
    private pp field_N;
    private pp field_r;
    private tf field_x;
    private md field_B;
    private int field_G;
    private pp field_J;
    private cl field_R;
    private md field_T;
    private pp field_t;
    ni field_D;
    private int field_X;
    ni field_L;
    private pp field_K;

    final void b(int param0, int param1) {
        if (!(!((go) this).field_w)) {
            if (!this.h(26)) {
                return;
            }
            ac.field_B.d((byte) -97, 69);
            ac.field_B.i(param0, -94);
            return;
        }
        mo var3 = ((go) this).field_Y.b(((go) this).field_Y.field_o, gm.field_d.field_N, param1 ^ 18900, param0, ((go) this).field_Y.field_y);
        var3.field_c.field_o = 0;
        if (param1 != 69) {
            ((go) this).field_E = null;
        }
        this.a(true, var3.field_c, param1 + 53);
    }

    private final void a(byte param0, hb param1) {
        int var3 = 0;
        ec var4 = null;
        int var5 = 0;
        int var6 = 0;
        L0: {
          L1: {
            var6 = DungeonAssault.field_K;
            var3 = param1.field_n.field_s;
            ((go) this).field_I = -1;
            ((go) this).field_G = -1;
            var5 = 23 % ((param0 - -15) / 45);
            ((go) this).field_y = param1;
            var4 = new ec(1);
            var4.a(6, param1.field_j);
            if (ob.field_lc == var3) {
              break L1;
            } else {
              if (var3 == ob.field_Gb) {
                break L1;
              } else {
                if (ob.field_Wb == var3) {
                  break L1;
                } else {
                  if (var3 != ob.field_Pb) {
                    if (var3 == ob.field_fc) {
                      this.a(pe.field_i, -8963);
                      break L0;
                    } else {
                      if (ob.field_Jb == var3) {
                        this.a(bb.field_r, -8963);
                        break L0;
                      } else {
                        if (ob.field_pc != var3) {
                          if (var3 != ob.field_Mb) {
                            L2: {
                              if (ob.field_dc == var3) {
                                break L2;
                              } else {
                                if (ob.field_Nb == var3) {
                                  break L2;
                                } else {
                                  if (ob.field_nc == var3) {
                                    this.a(em.field_F, -8963);
                                    break L0;
                                  } else {
                                    if (ob.field_Ib == var3) {
                                      this.a(ta.field_g, -8963);
                                      break L0;
                                    } else {
                                      if (var3 == ob.field_Zb) {
                                        this.a(wf.field_D, -8963);
                                        break L0;
                                      } else {
                                        if (var3 != ob.field_Lb) {
                                          if (var3 == ob.field_Ub) {
                                            this.a(eb.field_P, -8963);
                                            ((go) this).field_b = (kl) (Object) new hn(param1.field_n.field_F.toUpperCase(), param1.field_e + param1.field_g, param1.field_n.field_m, param1.field_e);
                                            break L0;
                                          } else {
                                            ((go) this).field_y = null;
                                            this.a(27989);
                                            break L0;
                                          }
                                        } else {
                                          this.a(li.field_c, -8963);
                                          break L0;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            this.a(rl.field_c, -8963);
                            break L0;
                          } else {
                            this.a(mo.field_b, -8963);
                            break L0;
                          }
                        } else {
                          this.a(jd.field_i, -8963);
                          break L0;
                        }
                      }
                    }
                  } else {
                    break L1;
                  }
                }
              }
            }
          }
          this.a(param1, true);
          this.a(var4, 114);
          ((go) this).field_y = null;
          break L0;
        }
    }

    final static void b(byte param0) {
        fa var1 = null;
        int var2 = DungeonAssault.field_K;
        if (param0 != 14) {
            field_A = null;
        }
        ub.field_n.a();
        hm.field_n.a();
        lj.field_r = lj.field_r - 1;
        if (!(-1 != (lj.field_r ^ -1))) {
            lj.field_r = 200;
            var1 = (fa) (Object) ud.field_v.e(-24172);
            while (var1 != null) {
                if (!(var1.field_o.c(-62))) {
                    var1.a(false);
                }
                var1 = (fa) (Object) ud.field_v.a(param0 ^ 10);
            }
            if (!(oi.field_F == null)) {
                var1 = (fa) (Object) oi.field_F.e(-24172);
                while (var1 != null) {
                    if (!var1.field_o.c(-67)) {
                        var1.a(false);
                    }
                    var1 = (fa) (Object) oi.field_F.a(4);
                }
            }
        }
        if (null != ob.field_Xb) {
            if (!ob.field_Xb.b((byte) -124)) {
            }
        }
    }

    private final void a(byte param0, ai param1) {
        if (param0 < 16) {
            ((go) this).field_y = null;
        }
        if (!(null == param1.field_h.field_u)) {
            param1.field_c.a(29, param1.field_h.field_u);
        }
        if (null != param1.field_h.field_x) {
            o discarded$0 = gd.a(64, param1.field_h.field_x);
        }
    }

    final void b(boolean param0) {
        t.a(64, g.field_Lb, true, true);
    }

    final void a(byte param0) {
        if (!gl.field_Lb) {
            ((go) this).field_R = (cl) (Object) new lj((go) this, 320, 210);
        } else {
            ((go) this).field_R = (cl) (Object) new sf((go) this, 320, 240);
        }
        int var2 = 43 / ((param0 - -18) / 47);
    }

    private final void c(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5_int = 0;
        mo var5 = null;
        hb[] var6 = null;
        int var7 = 0;
        hb var8 = null;
        int var9 = 0;
        int stackIn_24_0 = 0;
        mo stackIn_28_0 = null;
        int stackOut_23_0 = 0;
        int stackOut_22_0 = 0;
        mo stackOut_27_0 = null;
        mo stackOut_26_0 = null;
        var9 = DungeonAssault.field_K;
        if (((go) this).field_w) {
          if (this.h(6)) {
            L0: {
              if ((param1 ^ -1) == -3) {
                ac.field_B.d((byte) -117, 67);
                break L0;
              } else {
                if (param1 != 1) {
                  ac.field_B.d((byte) -124, 65);
                  break L0;
                } else {
                  ac.field_B.d((byte) -125, 66);
                  return;
                }
              }
            }
            return;
          } else {
            return;
          }
        } else {
          L1: {
            var3 = ((go) this).field_Y.field_B;
            var4 = 0;
            if (param0 <= -102) {
              break L1;
            } else {
              ((go) this).field_s = 112;
              break L1;
            }
          }
          L2: {
            if (!kn.field_g) {
              break L2;
            } else {
              var5_int = 0;
              var6 = ((go) this).field_Y.field_A;
              var7 = 0;
              L3: while (true) {
                if (var6.length <= var7) {
                  L4: {
                    if (1 != var5_int) {
                      stackOut_23_0 = 0;
                      stackIn_24_0 = stackOut_23_0;
                      break L4;
                    } else {
                      stackOut_22_0 = 1;
                      stackIn_24_0 = stackOut_22_0;
                      break L4;
                    }
                  }
                  var4 = stackIn_24_0;
                  break L2;
                } else {
                  var8 = var6[var7];
                  if (var8 != null) {
                    if ((var8.field_o & 6) == 0) {
                      var5_int++;
                      var7++;
                      continue L3;
                    } else {
                      var7++;
                      continue L3;
                    }
                  } else {
                    var7++;
                    continue L3;
                  }
                }
              }
            }
          }
          L5: {
            if (var4 == 0) {
              stackOut_27_0 = ((go) this).field_Y.b((byte) 121, param1);
              stackIn_28_0 = stackOut_27_0;
              break L5;
            } else {
              stackOut_26_0 = ((go) this).field_Y.c(-94, param1);
              stackIn_28_0 = stackOut_26_0;
              break L5;
            }
          }
          var5 = stackIn_28_0;
          var5.field_c.field_o = 0;
          this.a(true, var5.field_c, var3, 4743);
          return;
        }
    }

    private final void i(int param0) {
        if (!((go) this).field_Y.field_p.a(24, (byte) 115)) {
            this.b(false, 24);
        }
        ((go) this).field_Y.a(((go) this).field_Y.field_u, true, 24);
        ((go) this).field_Y.a(false, 64);
        int var2 = 72 / ((param0 - 17) / 53);
        this.a(um.field_c, -8963);
        ((go) this).field_b = (kl) (Object) new ro((go) this);
    }

    public static void f(int param0) {
        field_A = null;
        field_F = null;
        if (param0 != 10) {
            go.b((byte) -114);
        }
        field_V = null;
        field_S = null;
    }

    private final void b(ai param0, int param1) {
        if (param0.field_h.field_m != null) {
            param0.field_c.a(li.field_h, param0.field_h.field_m, -10872);
        }
        if (!(null == param0.field_h.field_p)) {
            o discarded$0 = gd.a(64, param0.field_h.field_p);
        }
        int var3 = 51 % ((param1 - -47) / 49);
    }

    private final void g(boolean param0) {
        int var2_int = 0;
        hb[] var2 = null;
        int var3 = 0;
        hb var4 = null;
        int var5 = 0;
        hb[] var6 = null;
        var5 = DungeonAssault.field_K;
        super.b(param0);
        bl.a((byte) 98);
        var2_int = 0;
        L0: while (true) {
          if (-7 >= (var2_int ^ -1)) {
            jh.a(((go) this).field_e);
            go.a(((go) this).field_e, 0, 0, 640, 480, 320, 240);
            vo.a(82, 82, 398, 336, 152);
            vo.a(118, 72, 408, 185, 0);
            vo.a(57, 72, 408, 185, 455);
            vf.a(32, true, 164, 106, 8);
            vf.a(32, true, 468, 115, 8);
            vf.a(352, true, 32, -39, 48);
            vf.a(352, true, 600, 103, 48);
            je.a((byte) -99, 352, 48, pi.field_b, 0, 32);
            je.a((byte) -113, 352, 48, pi.field_b, 608, 32);
            c.a(0, 640, 0, (byte) 118);
            c.a(0, 640, 40, (byte) 65);
            vd.a(200, 2, -14561, 0, 0, 400);
            vd.a(200, 0, -14561, 2, 440, 400);
            vd.a(360, 2, -14561, 2, 140, 390);
            ke.a(17, 185, 72, 408);
            ke.a(111, 447, 72, 408);
            ke.a(76, 144, 2, 398);
            ke.a(-99, 488, 2, 398);
            en.a((byte) -1, 40, 552, 100, 60);
            jh.b();
            rh discarded$4 = new rh(191, 345, 80, 160, 16711680, 768, 249);
            rh discarded$5 = new rh(449, 345, 80, 160, 16711680, 768, 249);
            ((go) this).a((byte) 57);
            var6 = ((go) this).field_Y.field_A;
            var2 = var6;
            var3 = 0;
            L1: while (true) {
              if (var6.length <= var3) {
                return;
              } else {
                var4 = var6[var3];
                if (var4 != null) {
                  var4.field_b = new wd(var4.field_n.field_e);
                  if ((var4.field_o & 6) != 0) {
                    var4.field_b.field_e = 0;
                    var4.field_b.field_k = ga.field_n;
                    var3++;
                    continue L1;
                  } else {
                    var3++;
                    continue L1;
                  }
                } else {
                  var3++;
                  continue L1;
                }
              }
            }
          } else {
            np.field_I[var2_int] = 110 - la.field_b.field_H * (var2_int * 4) / 3;
            var2_int++;
            continue L0;
          }
        }
    }

    private final void a(hb param0, boolean param1) {
        if (null != param0.field_n.field_a) {
            o discarded$0 = gd.a(64, param0.field_n.field_a);
        }
        if (!param1) {
            ((go) this).field_B = null;
        }
    }

    private final void e(byte param0) {
        ro var3 = null;
        ib.c(-107);
        int var2 = -56 % ((-42 - param0) / 52);
        if (((go) this).field_Y.field_g == 1) {
            t.a(1048576, kj.field_o, false, true);
        } else {
            if ((((go) this).field_Y.field_g ^ -1) != -5) {
                // if_icmpne L100
            }
            o discarded$0 = gd.a(64, ef.field_d);
            var3 = new ro((go) this);
            var3.d(2);
            ((go) this).field_b = (kl) (Object) var3;
            t.a(1048576, tm.field_b, false, true);
        }
    }

    private final void m(int param0) {
        int var2 = 0;
        hb[] var3_ref_hb__ = null;
        int var3 = 0;
        int var4_int = 0;
        hb[] var4 = null;
        hb var5_ref_hb = null;
        int var5 = 0;
        hb var6 = null;
        int[] var7 = null;
        int var8 = 0;
        L0: {
          var8 = DungeonAssault.field_K;
          if (param0 >= 86) {
            break L0;
          } else {
            this.e((byte) -9);
            break L0;
          }
        }
        L1: {
          ((go) this).field_R.b(-20827);
          if (-129 == (((go) this).field_Y.field_k ^ -1)) {
            this.e((byte) -94);
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (!kn.field_g) {
            break L2;
          } else {
            var2 = 0;
            var3_ref_hb__ = ((go) this).field_Y.field_A;
            var4_int = 0;
            L3: while (true) {
              if (var4_int >= var3_ref_hb__.length) {
                L4: {
                  if (0 != ((cc.field_d ^ -1) & var2)) {
                    gh.a(15, 11);
                    break L4;
                  } else {
                    break L4;
                  }
                }
                cc.field_d = var2;
                var3 = 0;
                var4 = ((go) this).field_Y.field_A;
                var5 = 0;
                L5: while (true) {
                  if (var4.length <= var5) {
                    if (var3 == 0) {
                      break L2;
                    } else {
                      if (kd.field_c != 11) {
                        gh.a(16, 11);
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                  } else {
                    var6 = var4[var5];
                    if (var6 != null) {
                      L6: {
                        var7 = qa.field_a[var6.field_j];
                        if (var6.field_e != var7[0]) {
                          break L6;
                        } else {
                          if (var7[1] != var6.field_g) {
                            break L6;
                          } else {
                            if (var6.field_f != var7[2]) {
                              break L6;
                            } else {
                              if (var6.field_k != var7[3]) {
                                break L6;
                              } else {
                                var5++;
                                continue L5;
                              }
                            }
                          }
                        }
                      }
                      var3 = 1;
                      var7[3] = var6.field_n.field_o;
                      var7[2] = var6.field_n.field_b;
                      var7[0] = var6.field_n.field_m;
                      var7[1] = var6.field_n.field_r;
                      var5++;
                      continue L5;
                    } else {
                      var5++;
                      continue L5;
                    }
                  }
                }
              } else {
                var5_ref_hb = var3_ref_hb__[var4_int];
                if (((go) this).field_Y.b(0, var5_ref_hb)) {
                  var2 = var2 | 1 << var5_ref_hb.field_j;
                  var4_int++;
                  continue L3;
                } else {
                  var4_int++;
                  continue L3;
                }
              }
            }
          }
        }
        this.d(-77);
        this.d(false);
    }

    private final void a(int param0, boolean param1, hb param2) {
        param2.field_b.a(param1 ? li.field_h : rf.field_M, param2.field_n.field_v, -10872);
        if (null != param2.field_n.field_g) {
            o discarded$0 = gd.a(64, param2.field_n.field_g);
        }
        if (param0 != 0) {
            go.f(-1);
        }
    }

    private final void g(int param0) {
        int var2 = 0;
        int var3_int = 0;
        ai var3 = null;
        hb var4 = null;
        int var5 = 0;
        hb[] var6 = null;
        L0: {
          var5 = DungeonAssault.field_K;
          ((go) this).field_R.c(-30876);
          if (0 >= ((go) this).field_X) {
            break L0;
          } else {
            ((go) this).field_X = ((go) this).field_X - 1;
            break L0;
          }
        }
        var6 = ((go) this).field_Y.field_A;
        var3_int = 0;
        L1: while (true) {
          if (var3_int >= var6.length) {
            if (param0 < -123) {
              var2 = 0;
              L2: while (true) {
                if ((var2 ^ -1) <= -50) {
                  return;
                } else {
                  var3 = ((go) this).field_Y.field_h[var2];
                  if (var3 != null) {
                    if (null != var3.field_c) {
                      var3.field_c.a((byte) 109, 20);
                      var2++;
                      continue L2;
                    } else {
                      var2++;
                      continue L2;
                    }
                  } else {
                    var2++;
                    continue L2;
                  }
                }
              }
            } else {
              return;
            }
          } else {
            var4 = var6[var3_int];
            if (var4 != null) {
              L3: {
                var4.field_b.a((byte) 109, 20);
                if ((4 & var4.field_o) == 0) {
                  break L3;
                } else {
                  if (ga.field_n != var4.field_b.field_k) {
                    break L3;
                  } else {
                    var4.field_b.a(rl.field_b, k.field_c, -10872);
                    var4.field_b.field_e = 0;
                    break L3;
                  }
                }
              }
              var4.field_b.field_e = var4.field_b.field_e + 1;
              var3_int++;
              continue L1;
            } else {
              var3_int++;
              continue L1;
            }
          }
        }
    }

    private final void a(byte param0, ec param1, boolean param2) {
        int var4 = 0;
        int var5 = 0;
        hb var6 = null;
        ai var7 = null;
        ai var7_ref = null;
        int var8_int = 0;
        String var8 = null;
        int var9 = 0;
        int var10 = 0;
        ai var11 = null;
        ai var12 = null;
        String var13 = null;
        hb stackIn_3_0 = null;
        Object stackOut_2_0 = null;
        hb stackOut_1_0 = null;
        L0: {
          var10 = DungeonAssault.field_K;
          var4 = param1.c(true);
          var5 = param1.c(true);
          if (-1 == var5) {
            stackOut_2_0 = null;
            stackIn_3_0 = (hb) (Object) stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = ((go) this).field_Y.field_A[var5];
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var6 = stackIn_3_0;
          var7 = ((go) this).field_Y.field_h[var4];
          if (param2) {
            break L1;
          } else {
            var11 = bl.a(true, param1, false);
            var12 = var11;
            var7_ref = var12;
            ((go) this).field_Y.field_h[var4] = var11;
            var12.field_c = new wd(var12.field_h.field_d);
            var8_int = param1.c(true);
            this.a(var8_int, -31959, var4);
            break L1;
          }
        }
        L2: {
          if (((go) this).field_Y.field_p.a(var4, (byte) 77)) {
            break L2;
          } else {
            this.b(false, var4);
            break L2;
          }
        }
        L3: {
          var13 = var7_ref.field_h.field_z.toUpperCase();
          var8 = var13;
          var8 = var13;
          if (param0 == -110) {
            break L3;
          } else {
            String discarded$1 = go.a(117L, -45);
            break L3;
          }
        }
        L4: {
          var9 = -1;
          if (2 != var7_ref.field_h.field_g) {
            if (-2 == (var7_ref.field_h.field_g ^ -1)) {
              var9 = 2188106;
              break L4;
            } else {
              if (3 != var7_ref.field_h.field_g) {
                break L4;
              } else {
                var9 = 42962;
                break L4;
              }
            }
          } else {
            var9 = 16711680;
            break L4;
          }
        }
        L5: {
          if ((var9 ^ -1) == 0) {
            break L5;
          } else {
            var8 = "<col=" + Integer.toString(var9, 16) + ">" + var13 + "</col>";
            break L5;
          }
        }
        L6: {
          rf.field_K.a(var8, -114, "lastroom");
          ((go) this).field_R.a(2985);
          if (-3 == (var7_ref.field_h.field_g ^ -1)) {
            qh.a(param0 ^ 13822, (rj) (Object) ((go) this).field_N, 6);
            ((go) this).field_R.a(-9398, 16711935, var4);
            break L6;
          } else {
            if (var7_ref.field_h.field_g != 1) {
              if (-4 == (var7_ref.field_h.field_g ^ -1)) {
                qh.a(param0 + -13606, (rj) (Object) ((go) this).field_N, 9);
                ((go) this).field_R.a(param0 + -9288, 8421631, var4);
                break L6;
              } else {
                if (var7_ref.field_a != 2) {
                  if (var7_ref.field_a != 0) {
                    if ((var7_ref.field_a ^ -1) != -4) {
                      break L6;
                    } else {
                      qh.a(param0 + -13606, (rj) (Object) ((go) this).field_z[0], 1);
                      break L6;
                    }
                  } else {
                    gh.a(3, param0 + 121);
                    break L6;
                  }
                } else {
                  qh.a(-13716, (rj) (Object) ((go) this).field_K, 14);
                  break L6;
                }
              }
            } else {
              qh.a(-13716, (rj) (Object) ((go) this).field_N, 8);
              ((go) this).field_R.a(-9398, 65280, var4);
              break L6;
            }
          }
        }
        L7: {
          ((go) this).field_Y.a(var6, true, var4);
          if (((go) this).field_Y.field_j.a(var4, (byte) 89)) {
            break L7;
          } else {
            this.a(var7_ref, 89);
            break L7;
          }
        }
        L8: {
          if (((go) this).field_Y.field_k != 8) {
            if ((((go) this).field_Y.field_k ^ -1) != -17) {
              break L8;
            } else {
              this.a(rn.field_d, -8963);
              this.d(-110);
              this.d(false);
              break L8;
            }
          } else {
            if (null != ((go) this).field_Y.field_u) {
              this.a(pi.field_g, -8963);
              this.m(103);
              break L8;
            } else {
              this.a(ho.field_b, -8963);
              this.m(103);
              break L8;
            }
          }
        }
    }

    private final void b(int param0) {
        if (null == ((go) this).field_y) {
            return;
        }
        int var2 = -90 % ((-38 - param0) / 62);
    }

    final void c(boolean param0) {
        hj[] var2 = null;
        int var3 = 0;
        ec var3_ref = null;
        hj var4 = null;
        int var5 = 0;
        hj[] var6 = null;
        hn var7 = null;
        hj stackIn_28_0 = null;
        hj stackIn_29_0 = null;
        hj stackIn_30_0 = null;
        hj stackIn_31_0 = null;
        hj stackIn_32_0 = null;
        hj stackIn_33_0 = null;
        int stackIn_33_1 = 0;
        pp stackIn_35_0 = null;
        pp stackIn_36_0 = null;
        pp stackIn_37_0 = null;
        pp stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        pp stackIn_39_0 = null;
        pp stackIn_40_0 = null;
        pp stackIn_41_0 = null;
        pp stackIn_42_0 = null;
        pp stackIn_43_0 = null;
        int stackIn_43_1 = 0;
        pp stackIn_44_0 = null;
        pp stackIn_45_0 = null;
        pp stackIn_46_0 = null;
        pp stackIn_47_0 = null;
        pp stackIn_48_0 = null;
        int stackIn_48_1 = 0;
        pp stackIn_49_0 = null;
        pp stackIn_50_0 = null;
        pp stackIn_51_0 = null;
        pp stackIn_52_0 = null;
        int stackIn_52_1 = 0;
        Object stackIn_53_0 = null;
        Object stackIn_54_0 = null;
        Object stackIn_55_0 = null;
        Object stackIn_56_0 = null;
        Object stackIn_57_0 = null;
        Object stackIn_58_0 = null;
        Object stackIn_59_0 = null;
        Object stackIn_60_0 = null;
        int stackIn_60_1 = 0;
        Object stackIn_61_0 = null;
        Object stackIn_62_0 = null;
        Object stackIn_63_0 = null;
        Object stackIn_64_0 = null;
        Object stackIn_65_0 = null;
        int stackIn_65_1 = 0;
        pp stackOut_34_0 = null;
        pp stackOut_35_0 = null;
        pp stackOut_36_0 = null;
        int stackOut_36_1 = 0;
        pp stackOut_37_0 = null;
        int stackOut_37_1 = 0;
        pp stackOut_38_0 = null;
        pp stackOut_39_0 = null;
        pp stackOut_42_0 = null;
        int stackOut_42_1 = 0;
        pp stackOut_40_0 = null;
        pp stackOut_41_0 = null;
        int stackOut_41_1 = 0;
        pp stackOut_43_0 = null;
        pp stackOut_44_0 = null;
        pp stackOut_45_0 = null;
        pp stackOut_46_0 = null;
        int stackOut_46_1 = 0;
        pp stackOut_47_0 = null;
        int stackOut_47_1 = 0;
        pp stackOut_48_0 = null;
        pp stackOut_49_0 = null;
        pp stackOut_50_0 = null;
        int stackOut_50_1 = 0;
        pp stackOut_51_0 = null;
        int stackOut_51_1 = 0;
        Object stackOut_52_0 = null;
        Object stackOut_53_0 = null;
        Object stackOut_54_0 = null;
        Object stackOut_55_0 = null;
        Object stackOut_56_0 = null;
        Object stackOut_57_0 = null;
        Object stackOut_58_0 = null;
        int stackOut_58_1 = 0;
        Object stackOut_59_0 = null;
        int stackOut_59_1 = 0;
        Object stackOut_60_0 = null;
        Object stackOut_61_0 = null;
        Object stackOut_64_0 = null;
        int stackOut_64_1 = 0;
        Object stackOut_62_0 = null;
        Object stackOut_63_0 = null;
        int stackOut_63_1 = 0;
        hj stackOut_27_0 = null;
        hj stackOut_28_0 = null;
        hj stackOut_29_0 = null;
        hj stackOut_30_0 = null;
        hj stackOut_31_0 = null;
        int stackOut_31_1 = 0;
        hj stackOut_32_0 = null;
        int stackOut_32_1 = 0;
        L0: {
          var5 = DungeonAssault.field_K;
          super.c(param0);
          if (0 < ((go) this).field_H) {
            ((go) this).field_H = ((go) this).field_H - 1;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (!param0) {
            break L1;
          } else {
            ((go) this).a(true, 251569954);
            break L1;
          }
        }
        L2: {
          this.g(-127);
          if (!param0) {
            break L2;
          } else {
            this.k(2);
            if (kn.field_g) {
              bl.a(0);
              break L2;
            } else {
              break L2;
            }
          }
        }
        L3: {
          L4: {
            if (((go) this).field_E != null) {
              if (((go) this).field_E.equals((Object) (Object) ((go) this).field_W)) {
                break L3;
              } else {
                break L4;
              }
            } else {
              if (null == ((go) this).field_W) {
                break L3;
              } else {
                break L4;
              }
            }
          }
          this.d((byte) -93);
          break L3;
        }
        L5: {
          if (((go) this).field_b == null) {
            break L5;
          } else {
            if (((go) this).field_b.field_d) {
              L6: {
                if (((go) this).field_b instanceof ro) {
                  ((go) this).field_b.c(-123);
                  hm.a(11, -1, true, -62);
                  break L6;
                } else {
                  if (!(((go) this).field_b instanceof hn)) {
                    break L6;
                  } else {
                    var7 = (hn) (Object) ((go) this).field_b;
                    if (!var7.field_s) {
                      break L6;
                    } else {
                      var3_ref = new ec(3);
                      ((go) this).field_y.field_g = -var7.field_o + var7.field_n;
                      ((go) this).field_y.field_e = var7.field_o;
                      var3_ref.a(6, ((go) this).field_y.field_j);
                      var3_ref.a(6, ((go) this).field_y.field_e);
                      var3_ref.a(6, ((go) this).field_y.field_g);
                      this.a(((go) this).field_y, true);
                      this.a(var3_ref, 118);
                      break L6;
                    }
                  }
                }
              }
              ((go) this).field_b.c(-124);
              ((go) this).field_b = null;
              break L5;
            } else {
              break L5;
            }
          }
        }
        var6 = ((go) this).field_z;
        var2 = var6;
        var3 = 0;
        L7: while (true) {
          if (var3 >= var6.length) {
            L8: {
              L9: {
                stackOut_34_0 = ((go) this).field_O;
                stackIn_37_0 = stackOut_34_0;
                stackIn_35_0 = stackOut_34_0;
                if (((go) this).field_Y.field_u == null) {
                  break L9;
                } else {
                  stackOut_35_0 = (pp) (Object) stackIn_35_0;
                  stackIn_37_0 = stackOut_35_0;
                  stackIn_36_0 = stackOut_35_0;
                  if (!((go) this).field_Y.b(0, ((go) this).field_Y.field_u)) {
                    break L9;
                  } else {
                    stackOut_36_0 = (pp) (Object) stackIn_36_0;
                    stackOut_36_1 = 1;
                    stackIn_38_0 = stackOut_36_0;
                    stackIn_38_1 = stackOut_36_1;
                    break L8;
                  }
                }
              }
              stackOut_37_0 = (pp) (Object) stackIn_37_0;
              stackOut_37_1 = 0;
              stackIn_38_0 = stackOut_37_0;
              stackIn_38_1 = stackOut_37_1;
              break L8;
            }
            L10: {
              L11: {
                stackIn_38_0.field_w = stackIn_38_1 != 0;
                stackOut_38_0 = ((go) this).field_N;
                stackIn_41_0 = stackOut_38_0;
                stackIn_39_0 = stackOut_38_0;
                if (-17 == (((go) this).field_Y.field_k ^ -1)) {
                  break L11;
                } else {
                  stackOut_39_0 = (pp) (Object) stackIn_39_0;
                  stackIn_42_0 = stackOut_39_0;
                  stackIn_40_0 = stackOut_39_0;
                  if (32 != ((go) this).field_Y.field_k) {
                    stackOut_42_0 = (pp) (Object) stackIn_42_0;
                    stackOut_42_1 = 0;
                    stackIn_43_0 = stackOut_42_0;
                    stackIn_43_1 = stackOut_42_1;
                    break L10;
                  } else {
                    stackOut_40_0 = (pp) (Object) stackIn_40_0;
                    stackIn_41_0 = stackOut_40_0;
                    break L11;
                  }
                }
              }
              stackOut_41_0 = (pp) (Object) stackIn_41_0;
              stackOut_41_1 = 1;
              stackIn_43_0 = stackOut_41_0;
              stackIn_43_1 = stackOut_41_1;
              break L10;
            }
            L12: {
              L13: {
                stackIn_43_0.field_w = stackIn_43_1 != 0;
                stackOut_43_0 = ((go) this).field_r;
                stackIn_47_0 = stackOut_43_0;
                stackIn_44_0 = stackOut_43_0;
                if ((((go) this).field_Y.field_k ^ -1) != -17) {
                  break L13;
                } else {
                  stackOut_44_0 = (pp) (Object) stackIn_44_0;
                  stackIn_47_0 = stackOut_44_0;
                  stackIn_45_0 = stackOut_44_0;
                  if (((go) this).field_Y.field_h[((go) this).field_Y.field_B].field_h.field_g != 2) {
                    break L13;
                  } else {
                    stackOut_45_0 = (pp) (Object) stackIn_45_0;
                    stackIn_47_0 = stackOut_45_0;
                    stackIn_46_0 = stackOut_45_0;
                    if (((go) this).field_Y.field_h[((go) this).field_Y.field_B].field_h.a((byte) -45, 15)) {
                      break L13;
                    } else {
                      stackOut_46_0 = (pp) (Object) stackIn_46_0;
                      stackOut_46_1 = 1;
                      stackIn_48_0 = stackOut_46_0;
                      stackIn_48_1 = stackOut_46_1;
                      break L12;
                    }
                  }
                }
              }
              stackOut_47_0 = (pp) (Object) stackIn_47_0;
              stackOut_47_1 = 0;
              stackIn_48_0 = stackOut_47_0;
              stackIn_48_1 = stackOut_47_1;
              break L12;
            }
            L14: {
              L15: {
                stackIn_48_0.field_w = stackIn_48_1 != 0;
                stackOut_48_0 = ((go) this).field_t;
                stackIn_51_0 = stackOut_48_0;
                stackIn_49_0 = stackOut_48_0;
                if (16 != ((go) this).field_Y.field_k) {
                  break L15;
                } else {
                  stackOut_49_0 = (pp) (Object) stackIn_49_0;
                  stackIn_51_0 = stackOut_49_0;
                  stackIn_50_0 = stackOut_49_0;
                  if (-3 != ((go) this).field_Y.field_h[((go) this).field_Y.field_B].field_h.field_g) {
                    break L15;
                  } else {
                    stackOut_50_0 = (pp) (Object) stackIn_50_0;
                    stackOut_50_1 = 1;
                    stackIn_52_0 = stackOut_50_0;
                    stackIn_52_1 = stackOut_50_1;
                    break L14;
                  }
                }
              }
              stackOut_51_0 = (pp) (Object) stackIn_51_0;
              stackOut_51_1 = 0;
              stackIn_52_0 = stackOut_51_0;
              stackIn_52_1 = stackOut_51_1;
              break L14;
            }
            L16: {
              L17: {
                L18: {
                  stackIn_52_0.field_w = stackIn_52_1 != 0;
                  stackOut_52_0 = this;
                  stackIn_55_0 = stackOut_52_0;
                  stackIn_53_0 = stackOut_52_0;
                  if (((go) this).field_Y.field_u == null) {
                    break L18;
                  } else {
                    stackOut_53_0 = this;
                    stackIn_59_0 = stackOut_53_0;
                    stackIn_54_0 = stackOut_53_0;
                    if (-1 == (6 & ((go) this).field_Y.field_u.field_o)) {
                      break L17;
                    } else {
                      stackOut_54_0 = this;
                      stackIn_55_0 = stackOut_54_0;
                      break L18;
                    }
                  }
                }
                L19: {
                  stackOut_55_0 = this;
                  stackIn_58_0 = stackOut_55_0;
                  stackIn_56_0 = stackOut_55_0;
                  if (((go) this).field_Y.field_k != -5) {
                    break L19;
                  } else {
                    stackOut_56_0 = this;
                    stackIn_59_0 = stackOut_56_0;
                    stackIn_57_0 = stackOut_56_0;
                    if (kn.field_g) {
                      break L17;
                    } else {
                      stackOut_57_0 = this;
                      stackIn_58_0 = stackOut_57_0;
                      break L19;
                    }
                  }
                }
                stackOut_58_0 = this;
                stackOut_58_1 = 1;
                stackIn_60_0 = stackOut_58_0;
                stackIn_60_1 = stackOut_58_1;
                break L16;
              }
              stackOut_59_0 = this;
              stackOut_59_1 = 0;
              stackIn_60_0 = stackOut_59_0;
              stackIn_60_1 = stackOut_59_1;
              break L16;
            }
            L20: {
              L21: {
                ((go) this).field_v = stackIn_60_1 != 0;
                stackOut_60_0 = this;
                stackIn_63_0 = stackOut_60_0;
                stackIn_61_0 = stackOut_60_0;
                if (-17 == ((go) this).field_Y.field_k) {
                  break L21;
                } else {
                  stackOut_61_0 = this;
                  stackIn_64_0 = stackOut_61_0;
                  stackIn_62_0 = stackOut_61_0;
                  if (((go) this).field_Y.field_k != 32) {
                    stackOut_64_0 = this;
                    stackOut_64_1 = 0;
                    stackIn_65_0 = stackOut_64_0;
                    stackIn_65_1 = stackOut_64_1;
                    break L20;
                  } else {
                    stackOut_62_0 = this;
                    stackIn_63_0 = stackOut_62_0;
                    break L21;
                  }
                }
              }
              stackOut_63_0 = this;
              stackOut_63_1 = 1;
              stackIn_65_0 = stackOut_63_0;
              stackIn_65_1 = stackOut_63_1;
              break L20;
            }
            ((go) this).field_Q = stackIn_65_1 != 0;
            return;
          } else {
            var4 = var6[var3];
            if (var4 != null) {
              L22: {
                L23: {
                  stackOut_27_0 = (hj) var4;
                  stackIn_32_0 = stackOut_27_0;
                  stackIn_28_0 = stackOut_27_0;
                  if ((6 & var4.field_V.field_o) != 0) {
                    break L23;
                  } else {
                    L24: {
                      stackOut_28_0 = (hj) (Object) stackIn_28_0;
                      stackIn_31_0 = stackOut_28_0;
                      stackIn_29_0 = stackOut_28_0;
                      if (((go) this).field_Y.field_k == -9) {
                        break L24;
                      } else {
                        stackOut_29_0 = (hj) (Object) stackIn_29_0;
                        stackIn_32_0 = stackOut_29_0;
                        stackIn_30_0 = stackOut_29_0;
                        if (-5 != ((go) this).field_Y.field_k) {
                          break L23;
                        } else {
                          stackOut_30_0 = (hj) (Object) stackIn_30_0;
                          stackIn_31_0 = stackOut_30_0;
                          break L24;
                        }
                      }
                    }
                    stackOut_31_0 = (hj) (Object) stackIn_31_0;
                    stackOut_31_1 = 1;
                    stackIn_33_0 = stackOut_31_0;
                    stackIn_33_1 = stackOut_31_1;
                    break L22;
                  }
                }
                stackOut_32_0 = (hj) (Object) stackIn_32_0;
                stackOut_32_1 = 0;
                stackIn_33_0 = stackOut_32_0;
                stackIn_33_1 = stackOut_32_1;
                break L22;
              }
              stackIn_33_0.field_Y = stackIn_33_1 != 0;
              var3++;
              continue L7;
            } else {
              var3++;
              continue L7;
            }
          }
        }
    }

    private final void a(ai param0, int param1) {
        if (param0.field_h != null) {
            if (null != param0.field_h.field_a) {
                o discarded$0 = gd.a(64, param0.field_h.field_a);
            }
        }
        ((go) this).f((byte) -128);
        if (param1 < 32) {
            this.b(false, -116);
        }
    }

    private final void k(int param0) {
        hb var2 = null;
        int var3 = 0;
        int var4 = 0;
        ai var4_ref = null;
        wb[] var4_ref_wb__ = null;
        en var5 = null;
        int var5_int = 0;
        int var6_int = 0;
        wb[] var6 = null;
        int var7_int = 0;
        en var7 = null;
        int var8 = 0;
        int var9_int = 0;
        ac var9 = null;
        int var10 = 0;
        int var11 = 0;
        wb var12_ref_wb = null;
        int var12 = 0;
        int var13 = 0;
        wb var14 = null;
        wb var14_ref = null;
        int var15 = 0;
        Object var16 = null;
        wb[] var17 = null;
        hb var18 = null;
        ai var19 = null;
        ac var20 = null;
        Object var21 = null;
        ai var21_ref = null;
        int stackIn_65_0 = 0;
        int stackIn_106_0 = 0;
        ai stackIn_113_0 = null;
        int stackOut_63_0 = 0;
        int stackOut_62_0 = 0;
        int stackOut_60_0 = 0;
        int stackOut_105_0 = 0;
        int stackOut_104_0 = 0;
        Object stackOut_112_0 = null;
        ai stackOut_111_0 = null;
        var21 = null;
        var15 = DungeonAssault.field_K;
        ((go) this).field_s = -1;
        if (kh.d(true)) {
          var16 = null;
          eg.a((md) null, true);
          return;
        } else {
          L0: {
            if (!kn.field_g) {
              break L0;
            } else {
              if (!od.a((byte) -76)) {
                break L0;
              } else {
                return;
              }
            }
          }
          if (!super.d()) {
            if (param0 == 2) {
              L1: {
                var2 = null;
                var3 = -1;
                if (-2 != (no.field_d ^ -1)) {
                  break L1;
                } else {
                  var3 = ((go) this).field_R.b(lc.field_c, 19091, hm.field_k);
                  if (-1 == var3) {
                    break L1;
                  } else {
                    ((go) this).field_u = var3;
                    break L1;
                  }
                }
              }
              L2: {
                ((go) this).field_s = ((go) this).field_R.b(hj.field_S, param0 + 19089, eh.field_h);
                if (hh.field_s != null) {
                  L3: {
                    if ((Object) (Object) ((go) this).field_J != (Object) (Object) hh.field_s) {
                      break L3;
                    } else {
                      gd.a(dc.field_z, param0 + -2, 1, false);
                      break L3;
                    }
                  }
                  L4: {
                    if ((Object) (Object) ((go) this).field_K == (Object) (Object) hh.field_s) {
                      hm.a(11, -1, true, -23);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  L5: {
                    if ((Object) (Object) ((go) this).field_N != (Object) (Object) hh.field_s) {
                      break L5;
                    } else {
                      if (((go) this).field_Y.field_k != 16) {
                        if (32 != ((go) this).field_Y.field_k) {
                          break L5;
                        } else {
                          this.e(param0 ^ 70);
                          break L5;
                        }
                      } else {
                        this.c(-124, 0);
                        break L5;
                      }
                    }
                  }
                  L6: {
                    if ((Object) (Object) ((go) this).field_r == (Object) (Object) hh.field_s) {
                      if ((((go) this).field_Y.field_k ^ -1) == -17) {
                        this.c(param0 ^ -119, 1);
                        break L6;
                      } else {
                        if (((go) this).field_Y.field_k == 32) {
                          this.e(68);
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                    } else {
                      break L6;
                    }
                  }
                  L7: {
                    if ((Object) (Object) ((go) this).field_t == (Object) (Object) hh.field_s) {
                      if (-17 != (((go) this).field_Y.field_k ^ -1)) {
                        break L7;
                      } else {
                        this.c(-117, 2);
                        break L7;
                      }
                    } else {
                      break L7;
                    }
                  }
                  L8: {
                    if ((Object) (Object) ((go) this).field_O == (Object) (Object) hh.field_s) {
                      if (null == ((go) this).field_Y.field_u) {
                        break L8;
                      } else {
                        if (!((go) this).field_Y.b(param0 + -2, ((go) this).field_Y.field_u)) {
                          break L8;
                        } else {
                          this.a((byte) -94, ((go) this).field_Y.field_u);
                          break L8;
                        }
                      }
                    } else {
                      break L8;
                    }
                  }
                  if (!(hh.field_s instanceof hj)) {
                    break L2;
                  } else {
                    var18 = ((hj) (Object) hh.field_s).field_V;
                    var2 = var18;
                    if (((go) this).field_y == null) {
                      if (var18 == null) {
                        break L2;
                      } else {
                        L9: {
                          if (-5 != (((go) this).field_Y.field_k ^ -1)) {
                            break L9;
                          } else {
                            if (kn.field_g) {
                              break L2;
                            } else {
                              break L9;
                            }
                          }
                        }
                        if ((var18.field_o & 6) != 0) {
                          break L2;
                        } else {
                          L10: {
                            if ((((go) this).field_Y.field_k ^ -1) == -9) {
                              break L10;
                            } else {
                              if (((go) this).field_Y.field_k != 4) {
                                break L2;
                              } else {
                                break L10;
                              }
                            }
                          }
                          this.b((byte) 119, var18);
                          this.a(pi.field_g, param0 + -8965);
                          this.m(param0 ^ 94);
                          gh.a(2, 11);
                          break L2;
                        }
                      }
                    } else {
                      break L2;
                    }
                  }
                } else {
                  break L2;
                }
              }
              L11: {
                if (((go) this).field_y != null) {
                  break L11;
                } else {
                  if (0 == (var3 ^ -1)) {
                    break L11;
                  } else {
                    L12: {
                      var4 = 0;
                      if ((((go) this).field_Y.field_k ^ -1) == -5) {
                        var4 = 1;
                        break L12;
                      } else {
                        break L12;
                      }
                    }
                    L13: {
                      if (8 != ((go) this).field_Y.field_k) {
                        break L13;
                      } else {
                        L14: {
                          if (null != ((go) this).field_Y.field_u) {
                            if ((6 & ((go) this).field_Y.field_u.field_o) == 0) {
                              stackOut_63_0 = 1;
                              stackIn_65_0 = stackOut_63_0;
                              break L14;
                            } else {
                              stackOut_62_0 = 0;
                              stackIn_65_0 = stackOut_62_0;
                              break L14;
                            }
                          } else {
                            stackOut_60_0 = 0;
                            stackIn_65_0 = stackOut_60_0;
                            break L14;
                          }
                        }
                        var4 = stackIn_65_0;
                        break L13;
                      }
                    }
                    L15: {
                      if (var4 == 0) {
                        break L15;
                      } else {
                        if (!((go) this).field_Y.b(var3, 27747)) {
                          break L15;
                        } else {
                          this.a(((go) this).field_Y.field_u, var3, (byte) 123);
                          break L11;
                        }
                      }
                    }
                    ((go) this).field_X = 125;
                    break L11;
                  }
                }
              }
              L16: {
                if (((go) this).field_y == null) {
                  break L16;
                } else {
                  this.a(((go) this).field_y, var2, var3, (byte) -115);
                  break L16;
                }
              }
              L17: {
                if (-1 == ((go) this).field_s) {
                  break L17;
                } else {
                  L18: {
                    var19 = ((go) this).field_Y.field_h[((go) this).field_s];
                    var4_ref = var19;
                    if (var4_ref != jb.field_Pb) {
                      L19: {
                        L20: {
                          if (((go) this).field_Y.field_p.a(((go) this).field_s, (byte) 105)) {
                            break L20;
                          } else {
                            if (((go) this).field_s != 24) {
                              var20 = gh.field_i[1];
                              kh.field_u = (en) (Object) new qf(var20.field_z.toUpperCase(), var20.field_t, var20.field_z);
                              break L19;
                            } else {
                              break L20;
                            }
                          }
                        }
                        kh.field_u = (en) (Object) new bd(((go) this).field_Y, var19);
                        break L19;
                      }
                      jb.field_Pb = var4_ref;
                      break L18;
                    } else {
                      break L18;
                    }
                  }
                  uj.a(kh.field_u, 95);
                  break L17;
                }
              }
              L21: {
                if (!jg.a(false, 10, 112, 112, 57)) {
                  break L21;
                } else {
                  if (((go) this).field_Y.field_u == null) {
                    break L21;
                  } else {
                    L22: {
                      var17 = ((go) this).field_Y.field_u.field_i;
                      var4_ref_wb__ = var17;
                      var5 = ((go) this).field_z[((go) this).field_Y.field_u.field_j].field_n;
                      var6_int = 7;
                      if (var4_ref_wb__ != null) {
                        var7_int = 104;
                        var8 = 151;
                        var9_int = var7_int;
                        var10 = var8;
                        var11 = 0;
                        L23: while (true) {
                          if (var17.length <= var11) {
                            break L22;
                          } else {
                            L24: {
                              var12_ref_wb = var17[var11];
                              var14 = var12_ref_wb;
                              var14 = var12_ref_wb;
                              if (!jg.a(false, var9_int, 12, 12, var10)) {
                                break L24;
                              } else {
                                var5 = var12_ref_wb.a();
                                break L24;
                              }
                            }
                            var9_int -= 16;
                            var11++;
                            if (-1 == (var11 % var6_int ^ -1)) {
                              var9_int = var7_int - 18;
                              var10 -= 16;
                              continue L23;
                            } else {
                              continue L23;
                            }
                          }
                        }
                      } else {
                        break L22;
                      }
                    }
                    uj.a(var5, 95);
                    break L21;
                  }
                }
              }
              var4 = 0;
              L25: while (true) {
                if (var4 >= 4) {
                  L26: {
                    L27: {
                      if (0 > ((go) this).field_u) {
                        break L27;
                      } else {
                        if (((go) this).field_Y.field_p.a(((go) this).field_u, (byte) 73)) {
                          stackOut_105_0 = ((go) this).field_u;
                          stackIn_106_0 = stackOut_105_0;
                          break L26;
                        } else {
                          break L27;
                        }
                      }
                    }
                    stackOut_104_0 = -1;
                    stackIn_106_0 = stackOut_104_0;
                    break L26;
                  }
                  L28: {
                    var4 = stackIn_106_0;
                    if (0 != var4) {
                      break L28;
                    } else {
                      if (-1 <= ((go) this).field_Y.field_B) {
                        var4 = ((go) this).field_Y.field_B;
                        break L28;
                      } else {
                        break L28;
                      }
                    }
                  }
                  L29: {
                    if (-1 < (var4 ^ -1)) {
                      stackOut_112_0 = null;
                      stackIn_113_0 = (ai) (Object) stackOut_112_0;
                      break L29;
                    } else {
                      stackOut_111_0 = ((go) this).field_Y.field_h[var4];
                      stackIn_113_0 = stackOut_111_0;
                      break L29;
                    }
                  }
                  L30: {
                    var21_ref = stackIn_113_0;
                    var5 = (en) (Object) var21_ref;
                    if (!jg.a(false, 518, 112, 112, 57)) {
                      break L30;
                    } else {
                      if (var21_ref == null) {
                        break L30;
                      } else {
                        L31: {
                          var6 = var21_ref.field_f;
                          var7 = null;
                          var8 = 7;
                          if (var6 != null) {
                            var9_int = 612;
                            var10 = 151;
                            var11 = var9_int;
                            var12 = var10;
                            var13 = 0;
                            L32: while (true) {
                              if (var13 >= var6.length) {
                                break L31;
                              } else {
                                L33: {
                                  var14_ref = var6[var13];
                                  if (!jg.a(false, var11, 12, 12, var12)) {
                                    break L33;
                                  } else {
                                    var7 = var14_ref.a();
                                    break L33;
                                  }
                                }
                                var11 -= 16;
                                var13++;
                                if (var13 % var8 == 0) {
                                  var12 -= 16;
                                  var11 = var9_int - 18;
                                  continue L32;
                                } else {
                                  continue L32;
                                }
                              }
                            }
                          } else {
                            break L31;
                          }
                        }
                        L34: {
                          if (var7 == null) {
                            if (jb.field_Pb == var21_ref) {
                              var7 = kh.field_u;
                              break L34;
                            } else {
                              L35: {
                                if (((go) this).field_Y.field_p.a(var4, (byte) 105)) {
                                  break L35;
                                } else {
                                  if (24 == var4) {
                                    break L35;
                                  } else {
                                    var9 = gh.field_i[1];
                                    kh.field_u = (en) (Object) new qf(var9.field_z.toUpperCase(), var9.field_t, var9.field_z);
                                    jb.field_Pb = var21_ref;
                                    var7 = kh.field_u;
                                    uj.a(var7, 95);
                                    break L30;
                                  }
                                }
                              }
                              kh.field_u = (en) (Object) new bd(((go) this).field_Y, var21_ref);
                              jb.field_Pb = var21_ref;
                              var7 = kh.field_u;
                              uj.a(var7, 95);
                              break L30;
                            }
                          } else {
                            break L34;
                          }
                        }
                        uj.a(var7, 95);
                        break L30;
                      }
                    }
                  }
                  return;
                } else {
                  L36: {
                    var5_int = 126;
                    if (!jg.a(false, 50, 16, var5_int, 16 * var4 + 320)) {
                      break L36;
                    } else {
                      uj.a(fi.field_r[var4], 95);
                      break L36;
                    }
                  }
                  if (jg.a(false, -var5_int + 590, 16, var5_int, 320 - -(16 * var4))) {
                    uj.a(rd.field_F[var4], 95);
                    var4++;
                    continue L25;
                  } else {
                    var4++;
                    continue L25;
                  }
                }
              }
            } else {
              return;
            }
          } else {
            return;
          }
        }
    }

    private final void a(int param0, ec param1, boolean param2) {
        hb var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        ai var8 = null;
        int var8_int = 0;
        int var9 = 0;
        ai var9_ref = null;
        int var10 = 0;
        ai var11 = null;
        int var12 = 0;
        int var13 = 0;
        Object var14 = null;
        hb var15 = null;
        hb var16 = null;
        hb var17 = null;
        L0: {
          var13 = DungeonAssault.field_K;
          ((go) this).field_y = null;
          var15 = ((go) this).field_Y.field_A[param1.c(true)];
          var4 = var15;
          if (param0 == -67) {
            break L0;
          } else {
            var14 = null;
            this.a(false, (ec) null, 48, 11);
            break L0;
          }
        }
        L1: {
          L2: {
            var5 = var15.field_n.field_s;
            if (var5 == ob.field_dc) {
              break L2;
            } else {
              if (var5 == ob.field_Nb) {
                break L2;
              } else {
                if (var5 != ob.field_Lb) {
                  L3: {
                    if (var5 == ob.field_nc) {
                      break L3;
                    } else {
                      if (ob.field_Ib == var5) {
                        break L3;
                      } else {
                        if (var5 == ob.field_Zb) {
                          break L3;
                        } else {
                          if (var5 != ob.field_Mb) {
                            L4: {
                              if (var5 == ob.field_lc) {
                                break L4;
                              } else {
                                if (var5 == ob.field_Gb) {
                                  break L4;
                                } else {
                                  break L1;
                                }
                              }
                            }
                            this.a(param0 ^ -71, ((go) this).field_Y.field_u);
                            this.b(((go) this).field_Y.field_h[((go) this).field_Y.field_B], -113);
                            break L1;
                          } else {
                            var6 = param1.field_o;
                            var16 = ((go) this).field_Y.field_A[param1.c(true)];
                            var16.field_b.a(rf.field_M, var16.field_n.field_t, -10872);
                            param1.field_o = var6;
                            break L1;
                          }
                        }
                      }
                    }
                  }
                  L5: {
                    var6 = param1.field_o;
                    var17 = ((go) this).field_Y.field_A[param1.c(true)];
                    var17.field_b.a(li.field_h, var17.field_n.field_l, -10872);
                    param1.field_o = var6;
                    if (null != var17.field_n.field_g) {
                      o discarded$4 = gd.a(64, var17.field_n.field_g);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  var4.field_b = new wd(var15.field_n.field_e, var15.field_n.field_t, rf.field_M);
                  break L1;
                } else {
                  L6: {
                    var6 = param1.field_o;
                    var7 = param1.c(true);
                    var8_int = param1.c(true);
                    if (!param2) {
                      var9_ref = bl.a(true, param1, false);
                      var9_ref.field_c = new wd(var9_ref.field_h.field_d);
                      var10 = param1.c(true);
                      var11 = bl.a(true, param1, false);
                      var11.field_c = new wd(var11.field_h.field_d);
                      var12 = param1.c(true);
                      ((go) this).field_Y.field_h[var7] = var9_ref;
                      ((go) this).field_Y.field_h[var8_int] = var11;
                      this.a(var10, -31959, var7);
                      this.a(var12, -31959, var8_int);
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  L7: {
                    if (!((go) this).field_Y.field_p.a(var7, (byte) 71)) {
                      this.b(false, var7);
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  L8: {
                    if (((go) this).field_Y.field_p.a(var8_int, (byte) 83)) {
                      break L8;
                    } else {
                      this.b(false, var8_int);
                      break L8;
                    }
                  }
                  o discarded$5 = je.a(param0 ^ -67, dc.field_q);
                  param1.field_o = var6;
                  break L1;
                }
              }
            }
          }
          L9: {
            var6 = param1.field_o;
            var7 = param1.c(true);
            if (!param2) {
              var8 = bl.a(true, param1, false);
              var8.field_c = new wd(var8.field_h.field_d);
              var9 = param1.c(true);
              ((go) this).field_Y.field_h[var7] = var8;
              this.a(var9, -31959, var7);
              break L9;
            } else {
              break L9;
            }
          }
          L10: {
            if (((go) this).field_Y.field_p.a(var7, (byte) 93)) {
              break L10;
            } else {
              this.b(false, var7);
              break L10;
            }
          }
          L11: {
            if (ob.field_dc == var5) {
              o discarded$6 = je.a(0, dc.field_q);
              break L11;
            } else {
              break L11;
            }
          }
          param1.field_o = var6;
          break L1;
        }
        L12: {
          L13: {
            mo discarded$7 = ((go) this).field_Y.a(var15, param1, 118);
            this.d(false);
            if (var5 == ob.field_lc) {
              break L13;
            } else {
              if (ob.field_Gb != var5) {
                break L12;
              } else {
                break L13;
              }
            }
          }
          ((go) this).field_R.b(-20827);
          break L12;
        }
    }

    private final void c(int param0) {
        int var2 = 0;
        int var3 = DungeonAssault.field_K;
        ((go) this).field_U = new int[32];
        for (var2 = 0; 32 > var2; var2++) {
            ((go) this).field_U[var2] = oi.b(0, 4);
        }
        ((go) this).field_P = new int[4];
        if (param0 != 7872) {
            String discarded$0 = go.a(117L, 85);
        }
        ((go) this).field_B = new md();
        ((go) this).field_T = new md();
        ((go) this).field_D = ni.a(om.field_b.field_e, 256, 0);
        ((go) this).field_L = ni.a(k.field_f.field_e, 256, 0);
        ((go) this).field_D.e(-1);
        ((go) this).field_L.e(-1);
        fa discarded$1 = l.a(((go) this).field_D, 0);
        fa discarded$2 = l.a(((go) this).field_L, 0);
        t.a(64, g.field_Lb, true, true);
    }

    private final void b(hb param0, int param1) {
        param0.field_b.a(li.field_h, param0.field_n.field_l, -10872);
        if (!(param0.field_n.field_g == null)) {
            o discarded$0 = gd.a(64, param0.field_n.field_g);
        }
        if (param1 > -120) {
            Object var4 = null;
            this.a((String) null, 98);
        }
        gh.a(13, 11);
        ((go) this).field_R.a((byte) -77);
    }

    final void f() {
        int var1 = 0;
        int var2 = 0;
        int var3_int = 0;
        ai var3 = null;
        int var4 = 0;
        var4 = DungeonAssault.field_K;
        if (13 != mm.field_t) {
          L0: {
            if (!ll.field_k) {
              break L0;
            } else {
              L1: {
                if (((go) this).field_Y.field_u == null) {
                  break L1;
                } else {
                  if (qk.field_e[82]) {
                    break L1;
                  } else {
                    if (!((go) this).field_w) {
                      L2: {
                        var1 = ((go) this).field_Y.field_u.field_j;
                        var2 = ((go) this).field_Y.field_u.field_c;
                        var3_int = var2;
                        if (mm.field_t != 27) {
                          if (-27 != (mm.field_t ^ -1)) {
                            break L2;
                          } else {
                            var3_int = (var2 - -34) % 35;
                            if (var3_int != 0) {
                              break L2;
                            } else {
                              var3_int = 34;
                              break L2;
                            }
                          }
                        } else {
                          var3_int = (1 + var2) % 35;
                          if (var3_int == 0) {
                            var3_int++;
                            break L2;
                          } else {
                            break L2;
                          }
                        }
                      }
                      if (var2 != var3_int) {
                        ((go) this).field_Y.field_A[var1] = new hb(var1, var3_int);
                        ((go) this).field_Y.field_A[var1].field_b = new wd(((go) this).field_Y.field_A[var1].field_n.field_e);
                        this.b((byte) 47, ((go) this).field_Y.field_A[var1]);
                        break L1;
                      } else {
                        break L1;
                      }
                    } else {
                      break L1;
                    }
                  }
                }
              }
              L3: {
                if (((go) this).field_u == -1) {
                  break L3;
                } else {
                  if (!qk.field_e[82]) {
                    break L3;
                  } else {
                    if (((go) this).field_w) {
                      break L3;
                    } else {
                      L4: {
                        var1 = ((go) this).field_Y.field_h[((go) this).field_u].field_a;
                        var2 = var1;
                        ((go) this).field_Y.field_p.a(((go) this).field_u, -96);
                        this.b(false, ((go) this).field_u);
                        if (-28 == (mm.field_t ^ -1)) {
                          var2 = (var1 + 1) % 38;
                          break L4;
                        } else {
                          if ((mm.field_t ^ -1) == -27) {
                            var2 = (var1 - -37) % 38;
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                      }
                      if (var1 != var2) {
                        ((go) this).field_Y.field_h[((go) this).field_u] = new ai(var2);
                        var3 = new ai(var2);
                        ((go) this).field_Y.field_j.b(((go) this).field_u, 31);
                        this.a(var3, 76);
                        var3.field_c = new wd(var3.field_h.field_d);
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
              }
              if (mm.field_t != 9) {
                break L0;
              } else {
                ll.a(-72);
                break L0;
              }
            }
          }
          super.f();
          return;
        } else {
          gd.a(dc.field_z, 0, 1, false);
          return;
        }
    }

    private final void b(int param0, hb param1) {
        if (param0 != 2) {
            return;
        }
        if (param1.field_b.field_n == param1.field_b.field_i) {
            param1.field_b.a(126, param1.field_n.field_u);
            if (!(null == param1.field_n.field_p)) {
                o discarded$0 = gd.a(64, param1.field_n.field_p);
            }
        }
    }

    private final boolean h(int param0) {
        if (!((((go) this).field_H ^ -1) >= -1)) {
            return false;
        }
        ((go) this).field_H = 50;
        if (param0 <= 2) {
            ((go) this).field_E = null;
            return true;
        }
        return true;
    }

    final int a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = DungeonAssault.field_K;
          this.a(sm.field_e, -8963);
          if (param0 == 1) {
            break L0;
          } else {
            field_F = null;
            break L0;
          }
        }
        o discarded$2 = gd.a(64, ef.field_d);
        var3 = 0;
        var4 = 0;
        L1: while (true) {
          if (var4 >= 4) {
            this.e((byte) -118);
            return var3;
          } else {
            if (-1 != (param1 & 1 << var4 ^ -1)) {
              ((go) this).field_Y.a(120, ((go) this).field_Y.field_A[var4]);
              if (0 == (4 & ((go) this).field_Y.field_A[var4].field_o)) {
                if ((((go) this).field_Y.field_A[var4].field_o & 2) != 0) {
                  this.a(0, true, ((go) this).field_Y.field_A[var4]);
                  var4++;
                  continue L1;
                } else {
                  var4++;
                  continue L1;
                }
              } else {
                this.b(((go) this).field_Y.field_A[var4], -126);
                var3 = var3 | 1 << var4;
                var4++;
                continue L1;
              }
            } else {
              var4++;
              continue L1;
            }
          }
        }
    }

    private final void a(hb param0, hb param1, int param2, byte param3) {
        int var5 = 0;
        ec var6 = null;
        int var7 = 0;
        int var8 = 0;
        int stackIn_31_0 = 0;
        int stackIn_50_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_45_0 = 0;
        if (-3 != (no.field_d ^ -1)) {
          L0: {
            L1: {
              var5 = param0.field_n.field_s;
              var6 = new ec(3);
              var7 = 0;
              var6.a(6, param0.field_j);
              if (ob.field_dc == var5) {
                break L1;
              } else {
                if (var5 != ob.field_Nb) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            if (((go) this).field_G != -1) {
              break L0;
            } else {
              if (!((go) this).field_Y.b(param2, 27747)) {
                break L0;
              } else {
                if (param2 != 24) {
                  ((go) this).field_G = param2;
                  var7 = 1;
                  var6.a(6, ((go) this).field_G);
                  break L0;
                } else {
                  break L0;
                }
              }
            }
          }
          L2: {
            L3: {
              if (ob.field_nc == var5) {
                break L3;
              } else {
                if (ob.field_Ib != var5) {
                  break L2;
                } else {
                  break L3;
                }
              }
            }
            if (((go) this).field_G == -1) {
              if (param1 == null) {
                break L2;
              } else {
                if ((6 & param1.field_o) != 0) {
                  break L2;
                } else {
                  L4: {
                    if (0 == param1.field_n.field_z) {
                      break L4;
                    } else {
                      if (ob.field_Ib != var5) {
                        break L2;
                      } else {
                        if ((param1.field_n.field_z ^ -1) == -2) {
                          break L4;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                  ((go) this).field_G = param1.field_j;
                  var6.a(6, ((go) this).field_G);
                  var7 = 1;
                  break L2;
                }
              }
            } else {
              break L2;
            }
          }
          L5: {
            L6: {
              if (ob.field_fc == var5) {
                break L6;
              } else {
                if (var5 == ob.field_Jb) {
                  break L6;
                } else {
                  if (var5 == ob.field_pc) {
                    break L6;
                  } else {
                    break L5;
                  }
                }
              }
            }
            L7: {
              if (ob.field_fc != var5) {
                if (var5 == ob.field_Jb) {
                  stackOut_30_0 = 2;
                  stackIn_31_0 = stackOut_30_0;
                  break L7;
                } else {
                  stackOut_29_0 = 4;
                  stackIn_31_0 = stackOut_29_0;
                  break L7;
                }
              } else {
                stackOut_27_0 = 1;
                stackIn_31_0 = stackOut_27_0;
                break L7;
              }
            }
            var8 = stackIn_31_0;
            if (param1 == null) {
              break L5;
            } else {
              if ((6 & param1.field_o) != 0) {
                break L5;
              } else {
                if ((param1.field_d & var8) == 0) {
                  ((go) this).field_G = param1.field_j;
                  var6.a(6, ((go) this).field_G);
                  var7 = 1;
                  break L5;
                } else {
                  break L5;
                }
              }
            }
          }
          L8: {
            if (ob.field_Zb != var5) {
              break L8;
            } else {
              if (0 == (((go) this).field_G ^ -1)) {
                if (param1 == null) {
                  break L8;
                } else {
                  if (((go) this).field_y == param1) {
                    break L8;
                  } else {
                    if ((param1.field_o & 6) != 0) {
                      break L8;
                    } else {
                      ((go) this).field_G = param1.field_j;
                      var7 = 1;
                      var6.a(6, ((go) this).field_G);
                      break L8;
                    }
                  }
                }
              } else {
                break L8;
              }
            }
          }
          L9: {
            if (var5 != ob.field_Lb) {
              break L9;
            } else {
              L10: {
                if (param2 != -1) {
                  if (param2 != ((go) this).field_G) {
                    stackOut_48_0 = 1;
                    stackIn_50_0 = stackOut_48_0;
                    break L10;
                  } else {
                    stackOut_47_0 = 0;
                    stackIn_50_0 = stackOut_47_0;
                    break L10;
                  }
                } else {
                  stackOut_45_0 = 0;
                  stackIn_50_0 = stackOut_45_0;
                  break L10;
                }
              }
              var8 = stackIn_50_0;
              if (var8 == 0) {
                break L9;
              } else {
                if (((go) this).field_Y.field_p.a(param2, (byte) 78)) {
                  break L9;
                } else {
                  if (-25 != (param2 ^ -1)) {
                    if ((((go) this).field_G ^ -1) != 0) {
                      ((go) this).field_I = param2;
                      var6.a(6, ((go) this).field_G);
                      var7 = 1;
                      var6.a(6, ((go) this).field_I);
                      break L9;
                    } else {
                      ((go) this).field_G = param2;
                      break L9;
                    }
                  } else {
                    break L9;
                  }
                }
              }
            }
          }
          L11: {
            var8 = 109 % ((-55 - param3) / 35);
            if (var5 == ob.field_Mb) {
              if (param1 == null) {
                break L11;
              } else {
                if (-1 == (4 & param1.field_o ^ -1)) {
                  break L11;
                } else {
                  if ((param1.field_g ^ -1) < -1) {
                    ((go) this).field_G = param1.field_j;
                    var7 = 1;
                    var6.a(6, ((go) this).field_G);
                    break L11;
                  } else {
                    break L11;
                  }
                }
              }
            } else {
              break L11;
            }
          }
          L12: {
            if (var7 != 0) {
              this.a(param0, true);
              this.a(var6, 110);
              this.a(27989);
              break L12;
            } else {
              break L12;
            }
          }
          return;
        } else {
          ((go) this).field_y = null;
          this.a(27989);
          return;
        }
    }

    private final void b(byte param0, hb param1) {
        String[] var5 = null;
        ((go) this).field_Y.field_u = param1;
        this.b(2, param1);
        ae.field_a = jn.a(((go) this).field_Y.field_u.field_n.field_F.toUpperCase(), np.field_I, -73, (se) (Object) la.field_b);
        if (!(((go) this).field_Y.field_u.field_n.field_s == -1)) {
            var5 = ((go) this).field_Y.field_u.field_n.field_d;
            String[] var3 = var5;
            String var4 = jk.a(new String[1], "<col=178B8B><%0></col>", 30496);
            ((go) this).field_O.field_n = (en) (Object) new qf(jk.a(new String[1], vo.field_m, 30496), jk.a(new String[1], var5[1], 30496));
        }
        if (param0 <= 27) {
            ((go) this).field_w = true;
        }
    }

    private final void a(hb param0, int param1, byte param2) {
        if (param0 == null) {
            if (!((((go) this).field_Y.field_k ^ -1) != -5)) {
                param0 = ((go) this).field_Y.field_A[0];
            }
        }
        if (!((go) this).field_Y.field_p.a(param1, (byte) 89)) {
            o discarded$0 = je.a(0, dc.field_q);
        }
        if (((go) this).field_w) {
            if (!(this.h(51))) {
                return;
            }
            ac.field_B.d((byte) -101, 63);
            ac.field_B.a(6, param1);
            ac.field_B.a(6, param0.field_j);
            return;
        }
        ec var5 = new ec(2);
        var5.a(6, param1);
        if (param2 <= 6) {
            ((go) this).field_L = null;
        }
        var5.a(6, param0 != null ? param0.field_j : -1);
        var5.field_o = 0;
        this.a((byte) -110, var5, true);
        if (-3 == (((go) this).field_Y.field_h[((go) this).field_Y.field_B].field_a ^ -1)) {
            if (kn.field_g) {
                gh.a(17, 11);
            } else {
                this.i(94);
            }
        }
    }

    private final void d(byte param0) {
        int var9 = 0;
        String var10 = null;
        int var11 = DungeonAssault.field_K;
        ((go) this).field_E = ((go) this).field_W;
        jh.c();
        int var2 = -40 + ((go) this).field_q.field_b;
        String[] var3 = jn.a(((go) this).field_W, new int[1], -103, (se) (Object) la.field_b);
        int var4 = var3.length;
        int var5 = la.field_b.field_E + la.field_b.field_H * var4;
        int var6 = la.field_b.field_H;
        cn var7 = new cn(var2, var5);
        if (param0 > -62) {
            Object var12 = null;
            this.a((hb) null, (hb) null, 123, (byte) -100);
        }
        var7.e();
        String[] var8 = var3;
        for (var9 = 0; var8.length > var9; var9++) {
            var10 = var8[var9];
            la.field_b.c(var10, var2 >> 2024186465, var6, 16777215, -1);
            var6 = var6 + la.field_b.field_H;
        }
        jh.b();
        ((go) this).field_q.a(var7, 0, true, 116, -var7.field_v + ((go) this).field_q.field_y >> -836673759);
    }

    private final void a(int param0, int param1, int param2) {
        if (param1 != -31959) {
            ((go) this).c();
        }
        if (!(-1 == (param0 & 1 ^ -1))) {
            ((go) this).field_Y.field_v.a(-1 + (param2 - param2 / 7), param1 + 31854);
        }
        if ((2 & param0) != 0) {
            ((go) this).field_Y.field_v.a(param2 + -(param2 / 7), param1 ^ 31920);
        }
        if (!((4 & param0) == -1)) {
            ((go) this).field_Y.field_v.a(param2 - -35, param1 + 31884);
        }
        if (-1 != (8 & param0)) {
            ((go) this).field_Y.field_v.a(42 + param2, param1 + 31894);
        }
    }

    final void c() {
        super.c();
        ln.a(((go) this).field_D, -28711);
        ln.a(((go) this).field_L, -28711);
        jb.field_Pb = null;
        ((go) this).field_R = null;
        kh.field_u = null;
        System.gc();
    }

    private final void b(boolean param0, int param1) {
        ai var3 = ((go) this).field_Y.field_h[param1];
        var3.field_c = new wd(var3.field_h.field_d);
        ((go) this).field_R.a(15122, param1);
        if (param0) {
            ((go) this).field_r = null;
        }
    }

    final void a(int param0, int param1, boolean param2, int param3) {
        int var6 = 0;
        hb var7 = null;
        int var8 = 0;
        hb[] var9_ref_hb__ = null;
        int var9 = 0;
        int var10 = 0;
        hb var11_ref_hb = null;
        int var11 = 0;
        int var12 = 0;
        ai var13 = null;
        ai stackIn_1_0 = null;
        ai stackIn_2_0 = null;
        ai stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        int stackIn_8_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_41_0 = 0;
        ai stackIn_98_0 = null;
        ai stackIn_99_0 = null;
        ai stackIn_100_0 = null;
        int stackIn_100_1 = 0;
        ai stackOut_0_0 = null;
        ai stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        ai stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_39_0 = 0;
        ai stackOut_97_0 = null;
        ai stackOut_99_0 = null;
        int stackOut_99_1 = 0;
        ai stackOut_98_0 = null;
        int stackOut_98_1 = 0;
        L0: {
          var12 = DungeonAssault.field_K;
          var13 = ((go) this).field_Y.field_h[param1];
          var6 = 0;
          var7 = ((go) this).field_Y.field_u;
          var8 = var13.field_i ? 1 : 0;
          stackOut_0_0 = (ai) var13;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if ((param0 & 2048) == 0) {
            stackOut_2_0 = (ai) (Object) stackIn_2_0;
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = (ai) (Object) stackIn_1_0;
            stackOut_1_1 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        L1: {
          stackIn_3_0.field_i = stackIn_3_1 != 0;
          if (1 == var13.field_h.field_g) {
            if (param0 != 36864) {
              L2: {
                if (!param2) {
                  ((go) this).field_Y.a(param1, true, -12331);
                  break L2;
                } else {
                  break L2;
                }
              }
              if ((param0 ^ -1) != -20481) {
                L3: {
                  this.a((byte) 76, var13);
                  if (!param2) {
                    ((go) this).field_Y.a(true, 118, param1);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                if (0 != (param0 & 2048)) {
                  this.b(var7, param3 + -127);
                  break L1;
                } else {
                  this.a(0, true, var7);
                  break L1;
                }
              } else {
                this.b(var13, 2);
                break L1;
              }
            } else {
              this.b(var13, 76);
              this.a(4, var7);
              break L1;
            }
          } else {
            if (var13.field_h.field_g != 2) {
              if ((var13.field_h.field_g ^ -1) == -4) {
                if (var13.field_h.a((byte) -119, 10)) {
                  if (param0 == 36864) {
                    this.a(param3 ^ -5, var7);
                    this.b(var13, param3 + 5);
                    break L1;
                  } else {
                    L4: {
                      if (param2) {
                        break L4;
                      } else {
                        ((go) this).field_Y.a(true, 113, param1);
                        break L4;
                      }
                    }
                    this.a(param3 ^ -1, false, var7);
                    this.a((byte) 85, var13);
                    break L1;
                  }
                } else {
                  if (param0 != 36864) {
                    L5: {
                      if (param2) {
                        break L5;
                      } else {
                        ((go) this).field_Y.a(param1, true, -12331);
                        break L5;
                      }
                    }
                    this.a(0, false, var7);
                    this.a((byte) 117, var13);
                    break L1;
                  } else {
                    this.a(param3 ^ -5, var7);
                    this.b(var13, param3 ^ 100);
                    break L1;
                  }
                }
              } else {
                break L1;
              }
            } else {
              L6: {
                if (-1 == (param0 & 32768 ^ -1)) {
                  stackOut_7_0 = 0;
                  stackIn_8_0 = stackOut_7_0;
                  break L6;
                } else {
                  stackOut_6_0 = 1;
                  stackIn_8_0 = stackOut_6_0;
                  break L6;
                }
              }
              L7: {
                var6 = stackIn_8_0;
                if (!var13.field_h.a((byte) -108, 7)) {
                  break L7;
                } else {
                  if (var6 == 0) {
                    break L7;
                  } else {
                    ((go) this).field_Y.a(32768, 3);
                    this.a((byte) 27, var13);
                    var9_ref_hb__ = ((go) this).field_Y.field_A;
                    var10 = 0;
                    L8: while (true) {
                      if (var9_ref_hb__.length <= var10) {
                        this.e((byte) -96);
                        this.m(92);
                        return;
                      } else {
                        var11_ref_hb = var9_ref_hb__[var10];
                        if (var11_ref_hb != null) {
                          this.a(0, true, var11_ref_hb);
                          var10++;
                          continue L8;
                        } else {
                          var10++;
                          continue L8;
                        }
                      }
                    }
                  }
                }
              }
              L9: {
                if (-1 == (16384 & param0 ^ -1)) {
                  break L9;
                } else {
                  if (!param2) {
                    ((go) this).field_Y.a(param1, true, -12331);
                    break L9;
                  } else {
                    break L9;
                  }
                }
              }
              L10: {
                if (0 != (16384 & param0)) {
                  break L10;
                } else {
                  if (var6 != 0) {
                    break L10;
                  } else {
                    break L10;
                  }
                }
              }
              L11: {
                if (!var13.field_h.a((byte) -52, 3)) {
                  break L11;
                } else {
                  if (0 != (16384 & param0)) {
                    break L11;
                  } else {
                    if ((param0 & 4096) == 0) {
                      L12: {
                        this.a((byte) 78, var13);
                        if (param2) {
                          break L12;
                        } else {
                          ((go) this).field_Y.a(true, param3 ^ -126, param1);
                          break L12;
                        }
                      }
                      if ((param0 & 2048) == 0) {
                        this.a(param3 + 1, true, var7);
                        break L1;
                      } else {
                        this.b(var7, -123);
                        break L1;
                      }
                    } else {
                      this.b(var13, param3 ^ -87);
                      break L1;
                    }
                  }
                }
              }
              L13: {
                if (!var13.field_h.a((byte) -65, 15)) {
                  break L13;
                } else {
                  if (-1 == (16384 & param0)) {
                    ((go) this).field_Y.b(-100);
                    ((go) this).field_Y.a(false, 32);
                    ((go) this).field_Y.a(false, 8);
                    this.m(param3 ^ -121);
                    return;
                  } else {
                    break L13;
                  }
                }
              }
              L14: {
                if (0 == (param0 & 8192)) {
                  stackOut_37_0 = 0;
                  stackIn_38_0 = stackOut_37_0;
                  break L14;
                } else {
                  stackOut_36_0 = 1;
                  stackIn_38_0 = stackOut_36_0;
                  break L14;
                }
              }
              L15: {
                var9 = stackIn_38_0;
                if (-1 == (param0 & 4096)) {
                  stackOut_40_0 = 0;
                  stackIn_41_0 = stackOut_40_0;
                  break L15;
                } else {
                  stackOut_39_0 = 1;
                  stackIn_41_0 = stackOut_39_0;
                  break L15;
                }
              }
              var10 = stackIn_41_0;
              var11 = 7 & param0;
              L16: while (true) {
                L17: {
                  var11--;
                  if (var9 != 0) {
                    if (var6 != 0) {
                      if (-1 < var11) {
                        break L17;
                      } else {
                        if (var10 == 0) {
                          break L17;
                        } else {
                          break L1;
                        }
                      }
                    } else {
                      if (var11 < -1) {
                        break L17;
                      } else {
                        if (var10 != 0) {
                          this.a(4, var7);
                          this.b(var13, 57);
                          break L1;
                        } else {
                          break L17;
                        }
                      }
                    }
                  } else {
                    break L17;
                  }
                }
                var9 = 1;
                if (var11 != 0) {
                  continue L16;
                } else {
                  if (var10 == 0) {
                    this.a((byte) 117, var13);
                    if ((param0 & 2048) != 0) {
                      this.b(var7, -128);
                      break L1;
                    } else {
                      this.a(0, true, var7);
                      break L1;
                    }
                  } else {
                    continue L16;
                  }
                }
              }
            }
          }
        }
        L18: {
          if (!param2) {
            L19: {
              if (var13.field_h.a((byte) -72, 13)) {
                ((go) this).field_Y.a(false);
                break L19;
              } else {
                break L19;
              }
            }
            if ((param0 & 4096) == 0) {
              ((go) this).field_Y.d(param3 ^ -109);
              break L18;
            } else {
              if (var6 != 0) {
                ((go) this).field_Y.a(param3 ^ 7);
                break L18;
              } else {
                ((go) this).field_Y.a(false);
                break L18;
              }
            }
          } else {
            break L18;
          }
        }
        L20: {
          if (param3 == -1) {
            break L20;
          } else {
            boolean discarded$1 = this.h(-79);
            break L20;
          }
        }
        L21: {
          stackOut_97_0 = (ai) var13;
          stackIn_99_0 = stackOut_97_0;
          stackIn_98_0 = stackOut_97_0;
          if (var8 == 0) {
            stackOut_99_0 = (ai) (Object) stackIn_99_0;
            stackOut_99_1 = 0;
            stackIn_100_0 = stackOut_99_0;
            stackIn_100_1 = stackOut_99_1;
            break L21;
          } else {
            stackOut_98_0 = (ai) (Object) stackIn_98_0;
            stackOut_98_1 = 1;
            stackIn_100_0 = stackOut_98_0;
            stackIn_100_1 = stackOut_98_1;
            break L21;
          }
        }
        stackIn_100_0.field_i = stackIn_100_1 != 0;
        this.m(101);
    }

    final void a(boolean param0) {
        ai var16_ref = null;
        int var2 = 0;
        String[] var3 = null;
        ai var3_ref = null;
        int var4 = 0;
        String var5_ref_String = null;
        int var5 = 0;
        String[] var6_ref_String__ = null;
        int var6 = 0;
        int var7 = 0;
        String var8_ref_String = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        Object var12 = null;
        Object var13 = null;
        String[] var14 = null;
        rj var15 = null;
        ai var16 = null;
        ai stackIn_16_0 = null;
        int stackIn_23_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_25_1 = 0;
        int stackIn_29_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_31_1 = 0;
        cl stackIn_56_0 = null;
        cl stackIn_57_0 = null;
        cl stackIn_58_0 = null;
        cl stackIn_59_0 = null;
        cl stackIn_60_0 = null;
        int stackIn_60_1 = 0;
        int stackIn_75_0 = 0;
        int stackIn_85_0 = 0;
        ai stackOut_15_0 = null;
        Object stackOut_14_0 = null;
        int stackOut_22_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_24_1 = 0;
        int stackOut_23_0 = 0;
        int stackOut_23_1 = 0;
        int stackOut_28_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_30_1 = 0;
        int stackOut_29_0 = 0;
        int stackOut_29_1 = 0;
        cl stackOut_55_0 = null;
        cl stackOut_56_0 = null;
        cl stackOut_59_0 = null;
        int stackOut_59_1 = 0;
        cl stackOut_57_0 = null;
        cl stackOut_58_0 = null;
        int stackOut_58_1 = 0;
        int stackOut_74_0 = 0;
        int stackOut_73_0 = 0;
        int stackOut_84_0 = 0;
        int stackOut_83_0 = 0;
        var16_ref = null;
        var11 = DungeonAssault.field_K;
        super.a(param0);
        ((go) this).field_e.b(0, 0);
        if (null != ((go) this).field_Y) {
          L0: {
            if (null != ((go) this).field_Y.field_u) {
              go.a(10, 57, ((go) this).field_Y.field_u);
              var2 = 85;
              var14 = ae.field_a;
              var3 = var14;
              var4 = 0;
              L1: while (true) {
                if (var4 >= var14.length) {
                  break L0;
                } else {
                  var5_ref_String = var14[var4];
                  la.field_b.b(var5_ref_String, 140, var2, 16777215, -1);
                  var2 = var2 + la.field_b.field_H;
                  var4++;
                  continue L1;
                }
              }
            } else {
              var12 = null;
              go.a(10, 57, (hb) null);
              break L0;
            }
          }
          L2: {
            L3: {
              go.a(50, 320, ((go) this).field_Y.field_u, ((go) this).field_Y.field_i);
              var2 = ((go) this).field_Y.field_B;
              if (var2 == -1) {
                break L3;
              } else {
                if (((go) this).field_Y.field_q != var2) {
                  break L2;
                } else {
                  break L3;
                }
              }
            }
            if (((go) this).field_s == -1) {
              break L2;
            } else {
              if (!((go) this).field_Y.field_p.a(((go) this).field_s, (byte) 69)) {
                break L2;
              } else {
                var2 = ((go) this).field_s;
                break L2;
              }
            }
          }
          L4: {
            if ((var2 ^ -1) <= -1) {
              stackOut_15_0 = ((go) this).field_Y.field_h[var2];
              stackIn_16_0 = stackOut_15_0;
              break L4;
            } else {
              stackOut_14_0 = null;
              stackIn_16_0 = (ai) (Object) stackOut_14_0;
              break L4;
            }
          }
          L5: {
            var16_ref = stackIn_16_0;
            var3_ref = var16_ref;
            var4 = 0;
            if (-1 == (1 & ((go) this).field_Y.field_t ^ -1)) {
              break L5;
            } else {
              var4 = 1;
              break L5;
            }
          }
          L6: {
            if (null == ((go) this).field_Y.field_u) {
              break L6;
            } else {
              if ((((go) this).field_Y.field_u.field_d & 4) != 0) {
                var4 = 1;
                break L6;
              } else {
                break L6;
              }
            }
          }
          L7: {
            stackOut_22_0 = var4;
            stackIn_24_0 = stackOut_22_0;
            stackIn_23_0 = stackOut_22_0;
            if (((go) this).field_Y.field_B != var2) {
              stackOut_24_0 = stackIn_24_0;
              stackOut_24_1 = 0;
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              break L7;
            } else {
              stackOut_23_0 = stackIn_23_0;
              stackOut_23_1 = 1;
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              break L7;
            }
          }
          L8: {
            var4 = stackIn_25_0 & stackIn_25_1;
            if (var16_ref == null) {
              break L8;
            } else {
              if (var16_ref.field_h != null) {
                L9: {
                  stackOut_28_0 = var4;
                  stackIn_30_0 = stackOut_28_0;
                  stackIn_29_0 = stackOut_28_0;
                  if (var16_ref.field_h.field_g != 2) {
                    stackOut_30_0 = stackIn_30_0;
                    stackOut_30_1 = 0;
                    stackIn_31_0 = stackOut_30_0;
                    stackIn_31_1 = stackOut_30_1;
                    break L9;
                  } else {
                    stackOut_29_0 = stackIn_29_0;
                    stackOut_29_1 = 1;
                    stackIn_31_0 = stackOut_29_0;
                    stackIn_31_1 = stackOut_29_1;
                    break L9;
                  }
                }
                var4 = stackIn_31_0 & stackIn_31_1;
                break L8;
              } else {
                break L8;
              }
            }
          }
          L10: {
            if (var16_ref == null) {
              var13 = null;
              go.a(518, 57, (wd) null, kc.field_V);
              break L10;
            } else {
              L11: {
                go.a(518, 57, var16_ref);
                if (var16_ref != ac.field_n) {
                  ig.field_b = jn.a(var16_ref.field_h.field_z.toUpperCase(), np.field_I, -122, (se) (Object) la.field_b);
                  ac.field_n = var16_ref;
                  break L11;
                } else {
                  break L11;
                }
              }
              var5 = 85;
              var6_ref_String__ = ig.field_b;
              var7 = 0;
              L12: while (true) {
                if (var6_ref_String__.length <= var7) {
                  break L10;
                } else {
                  var8_ref_String = var6_ref_String__[var7];
                  la.field_b.a(var8_ref_String, 500, var5, 16777215, -1);
                  var5 = var5 + la.field_b.field_H;
                  var7++;
                  continue L12;
                }
              }
            }
          }
          go.a(590, 320, var16_ref, var4 != 0, ((go) this).field_Y.field_i);
          var15 = (rj) (Object) ((go) this).field_p.e(-24172);
          L13: while (true) {
            if (var15 == null) {
              L14: {
                ad.field_e.i(172, -ad.field_e.field_b + 40);
                ad.field_e.f(468 + -ad.field_e.field_d, 40 + -ad.field_e.field_b);
                if (null == ((go) this).field_x) {
                  break L14;
                } else {
                  ((go) this).field_x.a(320, 24, 1699);
                  break L14;
                }
              }
              L15: {
                ((go) this).field_R.b((byte) -55);
                this.b(-114);
                if (((go) this).field_b != null) {
                  ((go) this).field_b.a((byte) -110);
                  break L15;
                } else {
                  break L15;
                }
              }
              L16: {
                go.e();
                ((go) this).field_q.a((byte) -21);
                if (((go) this).field_b != null) {
                  break L16;
                } else {
                  L17: {
                    L18: {
                      if (((go) this).field_Y.field_k == 4) {
                        break L18;
                      } else {
                        if (null == ((go) this).field_Y.field_u) {
                          break L17;
                        } else {
                          if (0 != (((go) this).field_Y.field_u.field_o & 6)) {
                            break L17;
                          } else {
                            if (-33 == (((go) this).field_Y.field_k ^ -1)) {
                              break L18;
                            } else {
                              if (8 != ((go) this).field_Y.field_k) {
                                break L17;
                              } else {
                                break L18;
                              }
                            }
                          }
                        }
                      }
                    }
                    L19: {
                      L20: {
                        stackOut_55_0 = ((go) this).field_R;
                        stackIn_58_0 = stackOut_55_0;
                        stackIn_56_0 = stackOut_55_0;
                        if (!((go) this).field_w) {
                          break L20;
                        } else {
                          stackOut_56_0 = (cl) (Object) stackIn_56_0;
                          stackIn_59_0 = stackOut_56_0;
                          stackIn_57_0 = stackOut_56_0;
                          if (0 != ((go) this).field_H) {
                            stackOut_59_0 = (cl) (Object) stackIn_59_0;
                            stackOut_59_1 = 0;
                            stackIn_60_0 = stackOut_59_0;
                            stackIn_60_1 = stackOut_59_1;
                            break L19;
                          } else {
                            stackOut_57_0 = (cl) (Object) stackIn_57_0;
                            stackIn_58_0 = stackOut_57_0;
                            break L20;
                          }
                        }
                      }
                      stackOut_58_0 = (cl) (Object) stackIn_58_0;
                      stackOut_58_1 = 1;
                      stackIn_60_0 = stackOut_58_0;
                      stackIn_60_1 = stackOut_58_1;
                      break L19;
                    }
                    ((cl) (Object) stackIn_60_0).a(stackIn_60_1 != 0, -1723, ((go) this).field_X);
                    break L17;
                  }
                  ((go) this).field_R.a(true);
                  break L16;
                }
              }
              var15 = (rj) (Object) ((go) this).field_p.e(-24172);
              L21: while (true) {
                if (var15 == null) {
                  L22: {
                    L23: {
                      if (!((go) this).field_w) {
                        break L23;
                      } else {
                        if (-1 == (((go) this).field_H ^ -1)) {
                          break L23;
                        } else {
                          break L22;
                        }
                      }
                    }
                    L24: {
                      if (!((go) this).field_Q) {
                        break L24;
                      } else {
                        L25: {
                          var6 = ((go) this).field_N.field_t;
                          var7 = ((go) this).field_N.field_i;
                          var8 = ((go) this).field_O.field_t - (-((go) this).field_O.field_q + var6);
                          var9 = ((go) this).field_N.field_x;
                          if (null != uk.field_e) {
                            break L25;
                          } else {
                            uk.field_e = mf.a(16744448, 4 + var9, 8, 4 + var8, (byte) 112);
                            break L25;
                          }
                        }
                        if ((((go) this).field_X % 30 ^ -1) <= -16) {
                          ec.a(var7 - 2, var6 - 2, (byte) -93, uk.field_e, 16711680, 256);
                          break L24;
                        } else {
                          L26: {
                            if ((((go) this).field_X ^ -1) >= -1) {
                              stackOut_74_0 = (int)((1.0 + Math.cos((double)((float)mo.field_a / 10.0f))) * 64.0) + 128;
                              stackIn_75_0 = stackOut_74_0;
                              break L26;
                            } else {
                              stackOut_73_0 = 256;
                              stackIn_75_0 = stackOut_73_0;
                              break L26;
                            }
                          }
                          var10 = stackIn_75_0;
                          uk.field_e.b(-2 + var6, var7 - 2, var10);
                          break L24;
                        }
                      }
                    }
                    if (!((go) this).field_v) {
                      break L22;
                    } else {
                      L27: {
                        var6 = ((go) this).field_z[0].field_t;
                        var7 = ((go) this).field_z[0].field_i;
                        var8 = 166;
                        var9 = ((go) this).field_z[0].field_x;
                        if (rd.field_z == null) {
                          rd.field_z = mf.a(16744448, 4 + var9, 8, var8 - -4, (byte) 115);
                          break L27;
                        } else {
                          break L27;
                        }
                      }
                      if (15 <= ((go) this).field_X % 30) {
                        ec.a(-2 + var7, -2 + var6, (byte) -96, rd.field_z, 16711680, 256);
                        break L22;
                      } else {
                        L28: {
                          if ((((go) this).field_X ^ -1) >= -1) {
                            stackOut_84_0 = (int)(64.0 * (Math.cos((double)((float)mo.field_a / 10.0f)) + 1.0)) + 128;
                            stackIn_85_0 = stackOut_84_0;
                            break L28;
                          } else {
                            stackOut_83_0 = 256;
                            stackIn_85_0 = stackOut_83_0;
                            break L28;
                          }
                        }
                        var10 = stackIn_85_0;
                        rd.field_z.b(var6 + -2, var7 - 2, var10);
                        break L22;
                      }
                    }
                  }
                  L29: {
                    if (((go) this).field_b == null) {
                      break L29;
                    } else {
                      var6 = 0;
                      L30: while (true) {
                        if (var6 >= gf.field_b.length) {
                          ((go) this).field_b.b(-61);
                          break L29;
                        } else {
                          gf.field_b[var6] = nb.a(gf.field_b[var6] >>> 1547792578, 1061109567);
                          var6++;
                          continue L30;
                        }
                      }
                    }
                  }
                  L31: {
                    if (kn.field_g) {
                      ab.a(0);
                      break L31;
                    } else {
                      break L31;
                    }
                  }
                  L32: {
                    if (0 != (hj.field_S ^ -1)) {
                      L33: {
                        if (!this.f(true)) {
                          break L33;
                        } else {
                          break L33;
                        }
                      }
                      oh.a((byte) 17);
                      break L32;
                    } else {
                      break L32;
                    }
                  }
                  L34: {
                    if (!ll.field_k) {
                      break L34;
                    } else {
                      if (0 >= ((go) this).field_H) {
                        break L34;
                      } else {
                        ne.field_c.a(Integer.toString(((go) this).field_H), 630, ne.field_c.field_H + 10, 16777215, -1);
                        break L34;
                      }
                    }
                  }
                  return;
                } else {
                  var15.d(0);
                  var15 = (rj) (Object) ((go) this).field_p.a(4);
                  continue L21;
                }
              }
            } else {
              var15.a(65);
              var15 = (rj) (Object) ((go) this).field_p.a(4);
              continue L13;
            }
          }
        } else {
          return;
        }
    }

    final void a(int param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        Object var5 = null;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        L0: {
          var4 = DungeonAssault.field_K;
          if (((go) this).field_w) {
            ac.field_B.d((byte) -101, 62);
            if (!nf.field_A) {
              break L0;
            } else {
              return;
            }
          } else {
            break L0;
          }
        }
        L1: {
          if (param0 == 17158) {
            break L1;
          } else {
            var5 = null;
            this.a((ai) null, 46);
            break L1;
          }
        }
        L2: {
          L3: {
            if (!kn.field_g) {
              break L3;
            } else {
              if (-18 == (kd.field_c ^ -1)) {
                gd.a(0, param0 ^ 17158, 4, param1);
                break L2;
              } else {
                break L3;
              }
            }
          }
          if (en.a(param0 ^ -17159, bp.field_e)) {
            L4: {
              var3 = param1 ? 1 : 0;
              if (ve.a(false)) {
                stackOut_18_0 = 12;
                stackIn_19_0 = stackOut_18_0;
                break L4;
              } else {
                stackOut_17_0 = 0;
                stackIn_19_0 = stackOut_17_0;
                break L4;
              }
            }
            gd.a(stackIn_19_0, 0, 9, var3 != 0);
            break L2;
          } else {
            if (!ve.a(false)) {
              L5: {
                var3 = param1 ? 1 : 0;
                if (ve.a(false)) {
                  stackOut_14_0 = 12;
                  stackIn_15_0 = stackOut_14_0;
                  break L5;
                } else {
                  stackOut_13_0 = 0;
                  stackIn_15_0 = stackOut_13_0;
                  break L5;
                }
              }
              gd.a(stackIn_15_0, param0 ^ 17158, 0, var3 != 0);
              break L2;
            } else {
              gd.a(0, 0, 12, param1);
              break L2;
            }
          }
        }
    }

    final void f(byte param0) {
        ai var3 = null;
        int var2 = 0;
        if (0 != (((go) this).field_Y.field_B ^ -1)) {
            var3 = ((go) this).field_Y.field_h[((go) this).field_Y.field_B];
            var2 = var3.field_p - -var3.field_g > 8 ? 1 : 0;
        }
        if (var2 == 0) {
            t.a(64, g.field_Lb, true, true);
        } else {
            t.a(64, gh.field_d, true, true);
        }
        if (param0 > -126) {
            this.b(true, 28);
        }
    }

    final void a(boolean param0, int param1) {
        int var3_int = 0;
        o var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        Object var11 = null;
        int var12 = 0;
        L0: {
          L1: {
            var10 = DungeonAssault.field_K;
            if (!param0) {
              var12 = 0;
              var3_int = var12;
              L2: while (true) {
                if (var12 < 4) {
                  if (0 < ((go) this).field_P[var12]) {
                    ((go) this).field_P[var12] = ((go) this).field_P[var12] - 1;
                    var12++;
                    continue L2;
                  } else {
                    var12++;
                    continue L2;
                  }
                } else {
                  if (-1 > ((go) this).field_P[2]) {
                    if (0 == oi.b(0, 100)) {
                      ((go) this).field_B.a((ne) (Object) je.a(0, sa.field_v), false);
                      break L1;
                    } else {
                      if (((go) this).field_P[3] <= 0) {
                        break L0;
                      } else {
                        if (-1 != (oi.b(0, 100) ^ -1)) {
                          break L0;
                        } else {
                          ((go) this).field_T.a((ne) (Object) je.a(param1 + -251569954, hp.field_c), false);
                          break L0;
                        }
                      }
                    }
                  } else {
                    if (((go) this).field_P[3] <= 0) {
                      break L0;
                    } else {
                      if (-1 != oi.b(0, 100)) {
                        break L0;
                      } else {
                        ((go) this).field_T.a((ne) (Object) je.a(param1 + -251569954, hp.field_c), false);
                        break L0;
                      }
                    }
                  }
                }
              }
            } else {
              if (0 != (((go) this).field_Y.field_q ^ -1)) {
                var3_int = ((go) this).field_Y.field_q / 7;
                var4 = ((go) this).field_Y.field_q % 7;
                var5 = 4 * (1 + var3_int >> 268799937) - -(1 + var4 >> 1094112225);
                var6 = 4 * (var3_int >> 2007220577) + 16 + (var4 >> 1495641153);
                var7 = ((go) this).field_U[var5];
                var8 = ((go) this).field_U[var6];
                var9 = 0;
                L3: while (true) {
                  if (-5 < var9) {
                    L4: {
                      if (var9 == var7) {
                        break L4;
                      } else {
                        if (var8 == var9) {
                          break L4;
                        } else {
                          if (0 < ((go) this).field_P[var9]) {
                            ((go) this).field_P[var9] = ((go) this).field_P[var9] - 1;
                            var9++;
                            continue L3;
                          } else {
                            var9++;
                            continue L3;
                          }
                        }
                      }
                    }
                    if (256 > ((go) this).field_P[var9]) {
                      ((go) this).field_P[var9] = ((go) this).field_P[var9] + 1;
                      var9++;
                      continue L3;
                    } else {
                      var9++;
                      continue L3;
                    }
                  } else {
                    if (-1 >= ((go) this).field_P[2]) {
                      if (((go) this).field_P[3] > 0) {
                        if (-1 != oi.b(0, 100)) {
                          break L0;
                        } else {
                          ((go) this).field_T.a((ne) (Object) je.a(param1 + -251569954, hp.field_c), false);
                          break L0;
                        }
                      } else {
                        if (((go) this).field_P[3] <= 0) {
                          break L0;
                        } else {
                          if (-1 != oi.b(0, 100)) {
                            break L0;
                          } else {
                            ((go) this).field_T.a((ne) (Object) je.a(param1 + -251569954, hp.field_c), false);
                            break L0;
                          }
                        }
                      }
                    } else {
                      if (((go) this).field_P[3] <= 0) {
                        break L0;
                      } else {
                        if (-1 != (oi.b(0, 100) ^ -1)) {
                          break L0;
                        } else {
                          ((go) this).field_T.a((ne) (Object) je.a(param1 + -251569954, hp.field_c), false);
                          break L0;
                        }
                      }
                    }
                  }
                }
              } else {
                if (-1 > ((go) this).field_P[2]) {
                  if (0 == oi.b(0, 100)) {
                    ((go) this).field_B.a((ne) (Object) je.a(0, sa.field_v), false);
                    break L1;
                  } else {
                    if (((go) this).field_P[3] <= 0) {
                      break L0;
                    } else {
                      if (-1 != (oi.b(0, 100) ^ -1)) {
                        break L0;
                      } else {
                        ((go) this).field_T.a((ne) (Object) je.a(param1 + -251569954, hp.field_c), false);
                        break L0;
                      }
                    }
                  }
                } else {
                  if (((go) this).field_P[3] <= 0) {
                    break L0;
                  } else {
                    if (-1 != oi.b(0, 100)) {
                      break L0;
                    } else {
                      ((go) this).field_T.a((ne) (Object) je.a(param1 + -251569954, hp.field_c), false);
                      break L0;
                    }
                  }
                }
              }
            }
          }
          if (((go) this).field_P[3] <= 0) {
            break L0;
          } else {
            if (-1 != (oi.b(0, 100) ^ -1)) {
              break L0;
            } else {
              ((go) this).field_T.a((ne) (Object) je.a(param1 + -251569954, hp.field_c), false);
              break L0;
            }
          }
        }
        L5: {
          ((go) this).field_D.d(oo.field_d * (om.field_b.field_a * ((go) this).field_P[0]) / 96 >> -1341838648);
          ((go) this).field_L.d(((go) this).field_P[1] * (k.field_f.field_a * oo.field_d) / 96 >> 866147112);
          var3 = (o) (Object) ((go) this).field_B.e(param1 + -251594126);
          if (param1 == 251569954) {
            break L5;
          } else {
            var11 = null;
            this.a(false, (ec) null, 74);
            break L5;
          }
        }
        L6: while (true) {
          if (var3 == null) {
            var3 = (o) (Object) ((go) this).field_T.e(param1 ^ -251590986);
            L7: while (true) {
              if (var3 == null) {
                return;
              } else {
                var3.field_k.a(var3.field_p * ((go) this).field_P[3] >> 229253122, -111);
                var3 = (o) (Object) ((go) this).field_T.a(4);
                continue L7;
              }
            }
          } else {
            var3.field_k.a(var3.field_p * ((go) this).field_P[2] >> 251569954, param1 ^ 251569970);
            var3 = (o) (Object) ((go) this).field_B.a(4);
            continue L6;
          }
        }
    }

    private final void e(boolean param0) {
        if (param0) {
            return;
        }
        ((go) this).field_H = 0;
    }

    private final boolean f(boolean param0) {
        hb var2 = null;
        int var3 = 0;
        gg var4_ref = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_23_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_57_0 = 0;
        int stackIn_59_0 = 0;
        int stackIn_60_0 = 0;
        int stackIn_61_0 = 0;
        int stackIn_61_1 = 0;
        int stackIn_63_0 = 0;
        int stackIn_64_0 = 0;
        int stackIn_65_0 = 0;
        int stackIn_65_1 = 0;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_56_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_58_0 = 0;
        int stackOut_60_0 = 0;
        int stackOut_60_1 = 0;
        int stackOut_59_0 = 0;
        int stackOut_59_1 = 0;
        int stackOut_62_0 = 0;
        int stackOut_64_0 = 0;
        int stackOut_64_1 = 0;
        int stackOut_63_0 = 0;
        int stackOut_63_1 = 0;
        var5 = DungeonAssault.field_K;
        if (null != ((go) this).field_y) {
          L0: {
            var2 = null;
            if (wi.field_ob instanceof hj) {
              var2 = ((hj) (Object) wi.field_ob).field_V;
              break L0;
            } else {
              break L0;
            }
          }
          var3 = ((go) this).field_y.field_n.field_s;
          if (param0) {
            L1: {
              if (ob.field_Lb != var3) {
                break L1;
              } else {
                if ((((go) this).field_G ^ -1) != 0) {
                  var4_ref = ((go) this).field_R.b(((go) this).field_G, -15390);
                  fj.field_d[0].h(-(fj.field_d[0].field_E >> -364840511) + var4_ref.field_f, -(fj.field_d[0].field_G >> 536642721) + var4_ref.field_b);
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (((go) this).field_s != -1) {
                L3: {
                  L4: {
                    if (ob.field_dc == var3) {
                      break L4;
                    } else {
                      if (var3 != ob.field_Nb) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  if (-1 != ((go) this).field_G) {
                    break L3;
                  } else {
                    L5: {
                      if (((go) this).field_Y.b(((go) this).field_s, 27747)) {
                        if (-25 != (((go) this).field_s ^ -1)) {
                          stackOut_21_0 = 1;
                          stackIn_23_0 = stackOut_21_0;
                          break L5;
                        } else {
                          stackOut_20_0 = 0;
                          stackIn_23_0 = stackOut_20_0;
                          break L5;
                        }
                      } else {
                        stackOut_18_0 = 0;
                        stackIn_23_0 = stackOut_18_0;
                        break L5;
                      }
                    }
                    L6: {
                      var4 = stackIn_23_0;
                      if (var4 == 0) {
                        break L6;
                      } else {
                        if (!((go) this).field_Y.field_p.a(((go) this).field_s, (byte) 66)) {
                          break L6;
                        } else {
                          var4 = 0;
                          break L6;
                        }
                      }
                    }
                    L7: {
                      if (var4 != 0) {
                        fj.field_d[0].h(hj.field_S - 16, eh.field_h - 16);
                        break L7;
                      } else {
                        fj.field_d[1].h(hj.field_S + -16, eh.field_h + -16);
                        break L7;
                      }
                    }
                    return true;
                  }
                }
                if (ob.field_Lb != var3) {
                  break L2;
                } else {
                  if (((go) this).field_I == -1) {
                    L8: {
                      if (0 != (((go) this).field_s ^ -1)) {
                        if (((go) this).field_s != ((go) this).field_G) {
                          if ((((go) this).field_s ^ -1) != -25) {
                            stackOut_39_0 = 1;
                            stackIn_41_0 = stackOut_39_0;
                            break L8;
                          } else {
                            stackOut_38_0 = 0;
                            stackIn_41_0 = stackOut_38_0;
                            break L8;
                          }
                        } else {
                          stackOut_36_0 = 0;
                          stackIn_41_0 = stackOut_36_0;
                          break L8;
                        }
                      } else {
                        stackOut_34_0 = 0;
                        stackIn_41_0 = stackOut_34_0;
                        break L8;
                      }
                    }
                    L9: {
                      var4 = stackIn_41_0;
                      if (var4 == 0) {
                        break L9;
                      } else {
                        if (((go) this).field_Y.field_p.a(((go) this).field_s, (byte) 72)) {
                          var4 = 0;
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                    }
                    L10: {
                      if (var4 == 0) {
                        fj.field_d[1].h(hj.field_S + -16, eh.field_h - 16);
                        break L10;
                      } else {
                        fj.field_d[0].h(-16 + hj.field_S, -16 + eh.field_h);
                        break L10;
                      }
                    }
                    return true;
                  } else {
                    break L2;
                  }
                }
              } else {
                break L2;
              }
            }
            L11: {
              if (var2 == null) {
                break L11;
              } else {
                L12: {
                  L13: {
                    if (var3 == ob.field_nc) {
                      break L13;
                    } else {
                      if (var3 != ob.field_Ib) {
                        break L12;
                      } else {
                        break L13;
                      }
                    }
                  }
                  if (-1 != ((go) this).field_G) {
                    break L12;
                  } else {
                    L14: {
                      if (0 != var2.field_n.field_z) {
                        stackOut_56_0 = 0;
                        stackIn_57_0 = stackOut_56_0;
                        break L14;
                      } else {
                        stackOut_55_0 = 1;
                        stackIn_57_0 = stackOut_55_0;
                        break L14;
                      }
                    }
                    L15: {
                      var4 = stackIn_57_0;
                      if (ob.field_Ib != var3) {
                        break L15;
                      } else {
                        L16: {
                          stackOut_58_0 = var4;
                          stackIn_60_0 = stackOut_58_0;
                          stackIn_59_0 = stackOut_58_0;
                          if (var2.field_n.field_z != 1) {
                            stackOut_60_0 = stackIn_60_0;
                            stackOut_60_1 = 0;
                            stackIn_61_0 = stackOut_60_0;
                            stackIn_61_1 = stackOut_60_1;
                            break L16;
                          } else {
                            stackOut_59_0 = stackIn_59_0;
                            stackOut_59_1 = 1;
                            stackIn_61_0 = stackOut_59_0;
                            stackIn_61_1 = stackOut_59_1;
                            break L16;
                          }
                        }
                        var4 = stackIn_61_0 | stackIn_61_1;
                        break L15;
                      }
                    }
                    L17: {
                      stackOut_62_0 = var4;
                      stackIn_64_0 = stackOut_62_0;
                      stackIn_63_0 = stackOut_62_0;
                      if (0 != (6 & var2.field_o)) {
                        stackOut_64_0 = stackIn_64_0;
                        stackOut_64_1 = 0;
                        stackIn_65_0 = stackOut_64_0;
                        stackIn_65_1 = stackOut_64_1;
                        break L17;
                      } else {
                        stackOut_63_0 = stackIn_63_0;
                        stackOut_63_1 = 1;
                        stackIn_65_0 = stackOut_63_0;
                        stackIn_65_1 = stackOut_63_1;
                        break L17;
                      }
                    }
                    L18: {
                      var4 = stackIn_65_0 & stackIn_65_1;
                      if (var4 == 0) {
                        bf.field_e[1].h(-16 + hj.field_S, -16 + eh.field_h);
                        break L18;
                      } else {
                        bf.field_e[0].h(-16 + hj.field_S, eh.field_h + -16);
                        break L18;
                      }
                    }
                    return true;
                  }
                }
                L19: {
                  if (var3 != ob.field_Mb) {
                    break L19;
                  } else {
                    if (((go) this).field_G != 0) {
                      break L19;
                    } else {
                      L20: {
                        L21: {
                          if (-1 == (var2.field_o & 4)) {
                            break L21;
                          } else {
                            if (var2.field_g > 0) {
                              kh.field_r.h(hj.field_S - 16, eh.field_h - 16);
                              break L20;
                            } else {
                              break L21;
                            }
                          }
                        }
                        kh.field_r.e(-16 + hj.field_S, eh.field_h - 16, 4210752);
                        break L20;
                      }
                      return true;
                    }
                  }
                }
                if (var3 != ob.field_Zb) {
                  break L11;
                } else {
                  if ((((go) this).field_G ^ -1) != 0) {
                    break L11;
                  } else {
                    if (hj.field_S == 0) {
                      break L11;
                    } else {
                      L22: {
                        L23: {
                          if (var2 == ((go) this).field_y) {
                            break L23;
                          } else {
                            if (-1 != (var2.field_o & 6)) {
                              break L23;
                            } else {
                              bf.field_e[0].h(-16 + hj.field_S, -16 + eh.field_h);
                              break L22;
                            }
                          }
                        }
                        bf.field_e[1].h(hj.field_S - 16, -16 + eh.field_h);
                        break L22;
                      }
                      return true;
                    }
                  }
                }
              }
            }
            return false;
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    final boolean j(int param0) {
        wj var2 = ra.field_c;
        if (!(hc.field_c != 59)) {
            this.e(false);
            this.a((byte) -110, (ec) (Object) var2, false);
            return true;
        }
        if ((hc.field_c ^ -1) == -67) {
            this.e(false);
            this.a(false, (ec) (Object) var2, ((go) this).field_Y.field_B, 4743);
            return true;
        }
        if (!((hc.field_c ^ -1) != -66)) {
            this.e(false);
            this.a(-67, (ec) (Object) var2, false);
            return true;
        }
        if (!(hc.field_c != -71)) {
            this.e(false);
            ((go) this).field_Y.a(false, 8);
            return true;
        }
        if (-68 == hc.field_c) {
            this.e(false);
            ((go) this).field_Y.field_o = ((ec) (Object) var2).f(-118);
            ((go) this).field_Y.field_y = ((ec) (Object) var2).f(-97);
            ((go) this).field_Y.field_l = ((ec) (Object) var2).f(-119);
            this.i(104);
            return true;
        }
        if (-69 == (hc.field_c ^ -1)) {
            this.e(false);
            this.a(false, (ec) (Object) var2, -33);
            return true;
        }
        if (param0 != 0) {
            ((go) this).field_H = 90;
            return false;
        }
        return false;
    }

    final void c(byte param0) {
        this.a(jk.a(new String[1], wi.field_qb, 30496), -8963);
        if (param0 >= -107) {
            go.b((byte) 51);
        }
        o discarded$0 = gd.a(64, qm.field_n);
        this.e((byte) -119);
    }

    private final void a(int param0, hb param1) {
        param1.field_b.a(95, param1.field_n.field_t);
        if (param0 != 4) {
            ((go) this).field_N = null;
        }
        t.a(64, g.field_Lb, true, true);
    }

    final static String a(long param0, int param1) {
        l.field_a.setTime(new Date(param0));
        int var3 = l.field_a.get(7);
        int var4 = l.field_a.get(5);
        int var5 = l.field_a.get(2);
        int var6 = l.field_a.get(1);
        int var8 = 66 % ((param1 - -54) / 54);
        int var7 = l.field_a.get(11);
        int var9 = l.field_a.get(12);
        int var10 = l.field_a.get(13);
        return tl.field_e[var3 - 1] + ", " + var4 / 10 + var4 % 10 + "-" + pp.field_F[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var9 / 10 + var9 % 10 + ":" + var10 / 10 + var10 % 10 + " GMT";
    }

    private final void d(int param0) {
        ai var6_ref = null;
        String[] var2 = null;
        ai var2_ref = null;
        String var3_ref = null;
        int var3 = 0;
        int var4 = 0;
        String[] var5 = null;
        ai var6 = null;
        ai stackIn_8_0 = null;
        ai stackOut_7_0 = null;
        Object stackOut_6_0 = null;
        var6_ref = null;
        L0: {
          L1: {
            var4 = DungeonAssault.field_K;
            if (null == ((go) this).field_Y.field_u) {
              break L1;
            } else {
              if (((go) this).field_Y.field_u.field_n.field_s != -1) {
                var5 = ((go) this).field_Y.field_u.field_n.field_d;
                var2 = var5;
                var3_ref = jk.a(new String[1], "<col=178B8B><%0></col>", 30496);
                ((go) this).field_O.field_n = (en) (Object) new qf(jk.a(new String[1], vo.field_m, 30496), jk.a(new String[1], var5[1], 30496));
                break L0;
              } else {
                break L1;
              }
            }
          }
          ((go) this).field_O.field_n = null;
          break L0;
        }
        L2: {
          if (((go) this).field_Y.field_B != -1) {
            stackOut_7_0 = ((go) this).field_Y.field_h[((go) this).field_Y.field_B];
            stackIn_8_0 = stackOut_7_0;
            break L2;
          } else {
            stackOut_6_0 = null;
            stackIn_8_0 = (ai) (Object) stackOut_6_0;
            break L2;
          }
        }
        L3: {
          var6_ref = stackIn_8_0;
          var2_ref = var6_ref;
          if (var2_ref == null) {
            break L3;
          } else {
            if ((var6_ref.field_h.field_g ^ -1) != -2) {
              if (3 != var6_ref.field_h.field_g) {
                if (!var6_ref.field_h.a((byte) -123, 15)) {
                  ((go) this).field_N.field_n = (en) (Object) new qf(dn.field_L, hm.field_l, gi.field_Q);
                  break L3;
                } else {
                  ((go) this).field_N.field_n = (en) (Object) new qf(dn.field_L, a.field_k, gi.field_Q);
                  break L3;
                }
              } else {
                ((go) this).field_N.field_n = (en) (Object) new qf(u.field_S, kg.field_k, rb.field_I);
                break L3;
              }
            } else {
              ((go) this).field_N.field_n = (en) (Object) new qf(vd.field_b, ai.field_d, vo.field_o);
              break L3;
            }
          }
        }
        L4: {
          ((go) this).field_r.field_n = (en) (Object) new qf(lh.field_b, mo.field_f, fp.field_e);
          ((go) this).field_t.field_n = (en) (Object) new qf(qa.field_d, eb.field_I, jc.field_b);
          var3 = 14 / ((9 - param0) / 56);
          if (32 != ((go) this).field_Y.field_k) {
            break L4;
          } else {
            ((go) this).field_N.field_n = (en) (Object) new e(pb.field_H);
            break L4;
          }
        }
    }

    private final void a(ec param0, int param1) {
        if (((go) this).field_w) {
            if (!this.h(56)) {
                return;
            }
            ac.field_B.d((byte) -114, 64);
            ac.field_B.a(6, param0.field_o);
            ac.field_B.a(param0.field_m, 1, param0.field_o, 0);
            return;
        }
        if (param1 < 106) {
            ((go) this).a(false);
        }
        param0.field_o = 0;
        this.a(-67, param0, true);
    }

    go(boolean param0, pj param1, go param2) {
        this(param0, param1);
        if (gl.field_Lb) {
            ((go) this).field_R = (cl) (Object) new sf((go) this, 320, 240);
        } else {
            if (param2.field_R instanceof lj) {
                ((go) this).field_R = (cl) (Object) new lj((go) this, (lj) (Object) param2.field_R);
            } else {
                ((go) this).field_R = (cl) (Object) new lj((go) this, 320, 210);
            }
        }
        ((go) this).field_P = param2.field_P;
        ((go) this).field_L = param2.field_L;
        ((go) this).field_T = param2.field_T;
        ((go) this).field_B = param2.field_B;
        ((go) this).field_D = param2.field_D;
        ((go) this).field_U = param2.field_U;
    }

    private final void a(boolean param0, ec param1, int param2) {
        ro var6_ref = null;
        ro var6 = null;
        int var7 = DungeonAssault.field_K;
        int var4 = 18 % ((71 - param2) / 49);
        ((go) this).field_C = param1.k(0);
        int var5 = param1.c(true);
        if (!(((go) this).field_b instanceof ro)) {
            var6 = new ro((go) this);
            ((go) this).field_b = (kl) (Object) new ro((go) this);
        } else {
            var6_ref = (ro) (Object) ((go) this).field_b;
        }
        if (var5 == 0) {
            if (!(param0)) {
                ((go) this).field_Y.a(32768, 1);
            }
            var6_ref.a((byte) 101, ((go) this).field_C);
        } else {
            if (!param0) {
                ((go) this).field_Y.a(32768, 2);
            }
            var6_ref.a(15 & var5, ((go) this).field_C, (byte) 1);
        }
    }

    private final void d(boolean param0) {
        int var2 = 0;
        int var3_int = 0;
        ai var3 = null;
        hb var4_ref_hb = null;
        int var4 = 0;
        int var5 = 0;
        hb[] var6 = null;
        int stackIn_18_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_20_1 = 0;
        int stackIn_21_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_23_1 = 0;
        int stackOut_17_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_19_1 = 0;
        int stackOut_18_0 = 0;
        int stackOut_18_1 = 0;
        int stackOut_20_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_22_1 = 0;
        int stackOut_21_0 = 0;
        int stackOut_21_1 = 0;
        var5 = DungeonAssault.field_K;
        var6 = ((go) this).field_Y.field_A;
        var3_int = 0;
        L0: while (true) {
          if (var6.length <= var3_int) {
            L1: {
              if (!param0) {
                break L1;
              } else {
                ((go) this).field_W = null;
                break L1;
              }
            }
            var2 = 0;
            L2: while (true) {
              if (49 <= var2) {
                return;
              } else {
                var3 = ((go) this).field_Y.field_h[var2];
                if (var3 != null) {
                  L3: {
                    var4 = 0;
                    if (0 == (1 & ((go) this).field_Y.field_t)) {
                      break L3;
                    } else {
                      var4 = 1;
                      break L3;
                    }
                  }
                  L4: {
                    if (((go) this).field_Y.field_u == null) {
                      break L4;
                    } else {
                      if (0 == (4 & ((go) this).field_Y.field_u.field_d)) {
                        break L4;
                      } else {
                        var4 = 1;
                        break L4;
                      }
                    }
                  }
                  L5: {
                    stackOut_17_0 = var4;
                    stackIn_19_0 = stackOut_17_0;
                    stackIn_18_0 = stackOut_17_0;
                    if (((go) this).field_Y.field_B != var2) {
                      stackOut_19_0 = stackIn_19_0;
                      stackOut_19_1 = 0;
                      stackIn_20_0 = stackOut_19_0;
                      stackIn_20_1 = stackOut_19_1;
                      break L5;
                    } else {
                      stackOut_18_0 = stackIn_18_0;
                      stackOut_18_1 = 1;
                      stackIn_20_0 = stackOut_18_0;
                      stackIn_20_1 = stackOut_18_1;
                      break L5;
                    }
                  }
                  L6: {
                    var4 = stackIn_20_0 & stackIn_20_1;
                    stackOut_20_0 = var4;
                    stackIn_22_0 = stackOut_20_0;
                    stackIn_21_0 = stackOut_20_0;
                    if (-3 != (var3.field_h.field_g ^ -1)) {
                      stackOut_22_0 = stackIn_22_0;
                      stackOut_22_1 = 0;
                      stackIn_23_0 = stackOut_22_0;
                      stackIn_23_1 = stackOut_22_1;
                      break L6;
                    } else {
                      stackOut_21_0 = stackIn_21_0;
                      stackOut_21_1 = 1;
                      stackIn_23_0 = stackOut_21_0;
                      stackIn_23_1 = stackOut_21_1;
                      break L6;
                    }
                  }
                  var4 = stackIn_23_0 & stackIn_23_1;
                  var3.field_f = go.a(var3, ((go) this).field_Y.field_j.a(var2, (byte) 79), var4 != 0, ((go) this).field_Y.field_i);
                  var2++;
                  continue L2;
                } else {
                  var2++;
                  continue L2;
                }
              }
            }
          } else {
            var4_ref_hb = var6[var3_int];
            if (var4_ref_hb != null) {
              var4_ref_hb.field_i = go.a(var4_ref_hb, ((go) this).field_Y.field_i);
              var3_int++;
              continue L0;
            } else {
              var3_int++;
              continue L0;
            }
          }
        }
    }

    private final void e(int param0) {
        if (((go) this).field_w) {
            if (!(this.h(105))) {
                return;
            }
            ac.field_B.d((byte) -78, 68);
            return;
        }
        ((go) this).field_Y.a(false, 8);
        if (param0 != 68) {
            Object var3 = null;
            this.a((hb) null, (hb) null, -76, (byte) -21);
        }
    }

    private final void a(String param0, int param1) {
        if (param1 != -8963) {
            ((go) this).field_U = null;
        }
        ((go) this).field_W = param0;
    }

    private final void l(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        Object stackIn_11_0 = null;
        tf stackIn_11_1 = null;
        Object stackOut_8_0 = null;
        Object stackOut_10_0 = null;
        Object stackOut_10_1 = null;
        Object stackOut_9_0 = null;
        tf stackOut_9_1 = null;
        var5 = DungeonAssault.field_K;
        if (param0 == 18014) {
          ((go) this).b();
          var2 = -gh.field_g[0].field_v + 888 >> -957156799;
          ((go) this).field_r = ke.a(var2, (byte) -115, gh.field_g[0], 506);
          ((go) this).field_N = ke.a(var2, (byte) -123, gh.field_g[1], 464);
          ((go) this).field_t = ke.a(var2, (byte) -125, gh.field_g[2], 548);
          ((go) this).field_O = ke.a(var2, (byte) -114, gh.field_g[3], 590);
          ((go) this).field_J = tn.a(-jm.field_i.field_y + 164 >> -1009290527, (32 - jm.field_i.field_v >> 506139617) + 8, (se) (Object) ne.field_c, jm.field_i, param0 + -18125, l.field_d);
          ((go) this).field_K = tn.a(476 + (-jm.field_i.field_y + 164 >> -449450847), 8 - -(32 + -jm.field_i.field_v >> -94718111), (se) (Object) ne.field_c, jm.field_i, -109, r.field_a);
          var3 = 424;
          ((go) this).field_M = new nn(false);
          ((go) this).field_z = new hj[4];
          var4 = 0;
          L0: while (true) {
            if (4 <= var4) {
              L1: {
                ((go) this).field_p.a((ne) (Object) ((go) this).field_r, false);
                ((go) this).field_p.a((ne) (Object) ((go) this).field_N, false);
                ((go) this).field_p.a((ne) (Object) ((go) this).field_t, false);
                ((go) this).field_p.a((ne) (Object) ((go) this).field_O, false);
                ((go) this).field_p.a((ne) (Object) ((go) this).field_J, false);
                ((go) this).field_p.a((ne) (Object) ((go) this).field_K, false);
                stackOut_8_0 = this;
                stackIn_10_0 = stackOut_8_0;
                stackIn_9_0 = stackOut_8_0;
                if (null == ((go) this).field_Y.field_f) {
                  stackOut_10_0 = this;
                  stackOut_10_1 = null;
                  stackIn_11_0 = stackOut_10_0;
                  stackIn_11_1 = (tf) (Object) stackOut_10_1;
                  break L1;
                } else {
                  stackOut_9_0 = this;
                  stackOut_9_1 = new tf((se) (Object) ne.field_c, ((go) this).field_Y.field_f, ag.field_c);
                  stackIn_11_0 = stackOut_9_0;
                  stackIn_11_1 = stackOut_9_1;
                  break L1;
                }
              }
              ((go) this).field_x = stackIn_11_1;
              ((go) this).field_q = new sa(180, 401, 280, 79);
              this.d((byte) -70);
              return;
            } else {
              if (null != ((go) this).field_Y.field_A[var4]) {
                ((go) this).field_z[var4] = new hj(((go) this).field_Y, ((go) this).field_Y.field_A[var4], 10 - -(42 * var4), var3);
                ((go) this).field_M.a((gd) (Object) ((go) this).field_z[var4], (byte) -20);
                ((go) this).field_p.a((ne) (Object) ((go) this).field_z[var4], false);
                var4++;
                continue L0;
              } else {
                var4++;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    private final void a(boolean param0, ec param1, int param2, int param3) {
        int var5 = 0;
        ai var6 = null;
        hb var7 = null;
        int var8 = 0;
        oc var9 = null;
        String var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var17 = 0;
        String var18 = null;
        String var19 = null;
        String var20 = null;
        int stackIn_16_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_42_0 = 0;
        oc stackIn_87_0 = null;
        oc stackIn_88_0 = null;
        oc stackIn_89_0 = null;
        int stackIn_89_1 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_40_0 = 0;
        oc stackOut_86_0 = null;
        oc stackOut_88_0 = null;
        int stackOut_88_1 = 0;
        oc stackOut_87_0 = null;
        int stackOut_87_1 = 0;
        L0: {
          var17 = DungeonAssault.field_K;
          var5 = param1.k(param3 + -4743);
          if (param3 == 4743) {
            break L0;
          } else {
            field_V = null;
            break L0;
          }
        }
        L1: {
          var6 = ((go) this).field_Y.field_h[param2];
          var7 = ((go) this).field_Y.field_u;
          var8 = 0;
          if (-2 == (var6.field_h.field_g ^ -1)) {
            if (36864 != var5) {
              if (20480 == var5) {
                var9 = new oc(var7, var6, true, ba.field_d);
                break L1;
              } else {
                if (0 != (var5 & 2048)) {
                  var9 = new oc(var7, var6, false, vb.field_a);
                  break L1;
                } else {
                  var9 = new oc(var7, var6, false, bp.field_c);
                  break L1;
                }
              }
            } else {
              var9 = new oc(var7, var6, true, ch.field_l);
              break L1;
            }
          } else {
            if (2 == var6.field_h.field_g) {
              L2: {
                if (-1 == (var5 & 32768 ^ -1)) {
                  stackOut_15_0 = 0;
                  stackIn_16_0 = stackOut_15_0;
                  break L2;
                } else {
                  stackOut_14_0 = 1;
                  stackIn_16_0 = stackOut_14_0;
                  break L2;
                }
              }
              L3: {
                var8 = stackIn_16_0;
                if (!var6.field_h.a((byte) -54, 7)) {
                  break L3;
                } else {
                  if (var8 != 0) {
                    var9 = new oc(var7, var6, false, jk.a(new String[1], ep.field_i, 30496));
                    break L1;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (-1 == (16384 & var5 ^ -1)) {
                  break L4;
                } else {
                  if (!param0) {
                    ((go) this).field_Y.a(param2, true, param3 + -17074);
                    break L4;
                  } else {
                    break L4;
                  }
                }
              }
              L5: {
                if ((16384 & var5) != 0) {
                  var10 = uo.field_d;
                  break L5;
                } else {
                  var10 = mo.field_h;
                  break L5;
                }
              }
              L6: {
                if ((1024 & var5) == 0) {
                  break L6;
                } else {
                  if (var7.field_n.a(ob.field_jc, -120)) {
                    var10 = var10 + " <col=FF8000>" + jk.a(new String[1], ia.field_N, 30496) + "</col> ";
                    break L6;
                  } else {
                    break L6;
                  }
                }
              }
              L7: {
                if (!var6.field_h.a((byte) -74, 3)) {
                  break L7;
                } else {
                  if ((var5 & 16384) == 0) {
                    if ((4096 & var5) != -1) {
                      var9 = new oc(var7, var6, true, var10 + " " + fc.field_e);
                      break L1;
                    } else {
                      if (-1 == (var5 & 2048)) {
                        var9 = new oc(var7, var6, false, var10 + " " + bp.field_c);
                        break L1;
                      } else {
                        var9 = new oc(var7, var6, false, var10 + " " + vb.field_a);
                        break L1;
                      }
                    }
                  } else {
                    break L7;
                  }
                }
              }
              L8: {
                if (!var6.field_h.a((byte) -107, 15)) {
                  break L8;
                } else {
                  if (0 != (16384 & var5)) {
                    break L8;
                  } else {
                    var9 = new oc(var7, var6, true, var10 + " " + qj.field_d);
                    break L1;
                  }
                }
              }
              L9: {
                if (-1 == (var5 & 8192 ^ -1)) {
                  stackOut_38_0 = 0;
                  stackIn_39_0 = stackOut_38_0;
                  break L9;
                } else {
                  stackOut_37_0 = 1;
                  stackIn_39_0 = stackOut_37_0;
                  break L9;
                }
              }
              L10: {
                var11 = stackIn_39_0;
                if (0 == (4096 & var5)) {
                  stackOut_41_0 = 0;
                  stackIn_42_0 = stackOut_41_0;
                  break L10;
                } else {
                  stackOut_40_0 = 1;
                  stackIn_42_0 = stackOut_40_0;
                  break L10;
                }
              }
              L11: {
                var12 = stackIn_42_0;
                var13 = 7 & var5;
                var14 = -1;
                if (0 == (var5 & 1024)) {
                  break L11;
                } else {
                  if (var7.field_n.a(ob.field_mc, 89)) {
                    var14 = ji.a(-1 + var13, false, 1);
                    break L11;
                  } else {
                    break L11;
                  }
                }
              }
              L12: {
                var15 = -1;
                if ((512 & var5) == 0) {
                  break L12;
                } else {
                  break L12;
                }
              }
              L13: while (true) {
                L14: {
                  var13--;
                  if (var11 != 0) {
                    if (var8 != 0) {
                      var19 = var10 + " " + al.field_m;
                      var10 = var19;
                      if (var13 > 0) {
                        break L14;
                      } else {
                        if (var12 != 0) {
                          var9 = new oc(var7, var6, true, var19 + " " + cm.field_K);
                          break L1;
                        } else {
                          break L14;
                        }
                      }
                    } else {
                      L15: {
                        var18 = var10 + " " + ri.field_c;
                        if (var15 == var13) {
                          var10 = var18 + " <col=FF8000>" + jk.a(new String[1], qi.field_h, 30496) + "</col>";
                          break L15;
                        } else {
                          break L15;
                        }
                      }
                      if (-1 != (var13 ^ -1)) {
                        break L14;
                      } else {
                        if (var12 != 0) {
                          var9 = new oc(var7, var6, true, var10 + " " + lj.field_p);
                          break L1;
                        } else {
                          break L14;
                        }
                      }
                    }
                  } else {
                    break L14;
                  }
                }
                L16: {
                  var20 = var10 + " " + u.field_R;
                  var11 = 1;
                  if (var13 == var14) {
                    var10 = var20 + " <col=FF8000>" + jk.a(new String[1], le.field_e, param3 ^ 26023) + "</col>";
                    break L16;
                  } else {
                    break L16;
                  }
                }
                if (var13 > 0) {
                  continue L13;
                } else {
                  continue L13;
                }
              }
            } else {
              if (var6.field_h.field_g == 3) {
                if (var6.field_h.a((byte) -122, 10)) {
                  if (-36865 == (var5 ^ -1)) {
                    var9 = new oc(var7, var6, true, np.field_G);
                    break L1;
                  } else {
                    var9 = new oc(var7, var6, false, ah.field_a);
                    break L1;
                  }
                } else {
                  if ((var5 ^ -1) != -36865) {
                    var9 = new oc(var7, var6, false, nh.field_b);
                    break L1;
                  } else {
                    var9 = new oc(var7, var6, true, c.field_c);
                    break L1;
                  }
                }
              } else {
                var9 = null;
                break L1;
              }
            }
          }
        }
        L17: {
          if (var9 == null) {
            break L17;
          } else {
            L18: {
              if (((go) this).field_b != null) {
                ((go) this).field_b.c(-117);
                ((go) this).field_b = null;
                break L18;
              } else {
                break L18;
              }
            }
            L19: {
              stackOut_86_0 = (oc) var9;
              stackIn_88_0 = stackOut_86_0;
              stackIn_87_0 = stackOut_86_0;
              if (!param0) {
                stackOut_88_0 = (oc) (Object) stackIn_88_0;
                stackOut_88_1 = 0;
                stackIn_89_0 = stackOut_88_0;
                stackIn_89_1 = stackOut_88_1;
                break L19;
              } else {
                stackOut_87_0 = (oc) (Object) stackIn_87_0;
                stackOut_87_1 = 1;
                stackIn_89_0 = stackOut_87_0;
                stackIn_89_1 = stackOut_87_1;
                break L19;
              }
            }
            stackIn_89_0.field_t = stackIn_89_1 != 0;
            var9.field_B = var5;
            ((go) this).field_b = (kl) (Object) var9;
            var9.field_w = (go) this;
            var9.field_q = param2;
            break L17;
          }
        }
    }

    private final void a(int param0) {
        int var3 = 0;
        L0: {
          var3 = DungeonAssault.field_K;
          if (param0 == 27989) {
            break L0;
          } else {
            ((go) this).field_E = null;
            break L0;
          }
        }
        L1: {
          if (4 != ((go) this).field_Y.field_k) {
            if (-9 != (((go) this).field_Y.field_k ^ -1)) {
              if (-17 == (((go) this).field_Y.field_k ^ -1)) {
                this.a(rn.field_d, -8963);
                break L1;
              } else {
                if ((((go) this).field_Y.field_k ^ -1) != -33) {
                  break L1;
                } else {
                  this.a(co.field_E, -8963);
                  break L1;
                }
              }
            } else {
              if (((go) this).field_Y.field_u != null) {
                this.a(pi.field_g, -8963);
                break L1;
              } else {
                this.a(ho.field_b, param0 ^ -20056);
                break L1;
              }
            }
          } else {
            this.a(bj.field_I, param0 + -36952);
            break L1;
          }
        }
    }

    go(boolean param0, pj param1) {
        int[] var3_ref_int__ = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        hb var6 = null;
        int[] var6_array = null;
        int[] var8 = null;
        int var9 = 0;
        hb var10 = null;
        int[] var11 = null;
        hb[] var12 = null;
        hb var13 = null;
        int[] var14 = null;
        hb[] var15 = null;
        hb[] var16 = null;
        ai var17 = null;
        int[] var18 = null;
        int[] var19 = null;
        int[] var20 = null;
        int[] var21 = null;
        int[] var22 = null;
        int[] var23 = null;
        Object stackIn_1_0 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        Object stackOut_0_0 = null;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        L0: {
          md discarded$1 = new md();
          ((go) this).field_v = true;
          ((go) this).field_y = null;
          ((go) this).field_Q = true;
          ((go) this).field_W = bj.field_I;
          ((go) this).field_X = 0;
          stackOut_0_0 = this;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (!param0) {
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
        ((go) this).field_w = stackIn_3_1 != 0;
        var22 = bp.field_e;
        var20 = var22;
        var18 = var20;
        var11 = var18;
        var8 = var11;
        var3_ref_int__ = var8;
        var4 = 0;
        L1: while (true) {
          if (8 <= var4) {
            L2: {
              ((go) this).field_Y = param1;
              this.a(27989);
              this.g(false);
              this.c(7872);
              this.l(18014);
              if (!kn.field_g) {
                break L2;
              } else {
                cc.field_d = 0;
                qa.field_a = new int[((go) this).field_Y.field_A.length][];
                var12 = ((go) this).field_Y.field_A;
                var4 = 0;
                L3: while (true) {
                  if (var12.length <= var4) {
                    fm.a(60, 0);
                    break L2;
                  } else {
                    var13 = var12[var4];
                    if (var13 != null) {
                      var23 = new int[4];
                      var21 = var23;
                      var19 = var21;
                      var14 = var19;
                      var6_array = var14;
                      var6_array[1] = var13.field_n.field_r;
                      var6_array[0] = var13.field_n.field_m;
                      var6_array[2] = var13.field_n.field_b;
                      var6_array[3] = var13.field_n.field_o;
                      qa.field_a[var13.field_j] = var23;
                      var4++;
                      continue L3;
                    } else {
                      var4++;
                      continue L3;
                    }
                  }
                }
              }
            }
            L4: {
              this.d(false);
              if (null != fi.field_r) {
                break L4;
              } else {
                rd.field_F = new en[4];
                fi.field_r = new en[4];
                rd.field_F[0] = (en) (Object) new e(ck.field_H.a("attack", -53));
                fi.field_r[0] = (en) (Object) new e(ck.field_H.a("attack", -53));
                rd.field_F[1] = (en) (Object) new e(ck.field_H.a("defence", -126));
                fi.field_r[1] = (en) (Object) new e(ck.field_H.a("defence", -126));
                fi.field_r[2] = (en) (Object) new e(ck.field_H.a("dodge", -96));
                fi.field_r[3] = (en) (Object) new e(ck.field_H.a("sneak", -48));
                rd.field_F[2] = (en) (Object) new e(ck.field_H.a("snare", -115));
                rd.field_F[3] = (en) (Object) new e(ck.field_H.a("detect", -89));
                break L4;
              }
            }
            var3 = 0;
            var15 = ((go) this).field_Y.field_A;
            var5 = 0;
            L5: while (true) {
              if (var5 >= var15.length) {
                L6: {
                  if (var3 != 1) {
                    break L6;
                  } else {
                    var16 = ((go) this).field_Y.field_A;
                    var9 = 0;
                    var5 = var9;
                    L7: while (true) {
                      if (var9 >= var16.length) {
                        break L6;
                      } else {
                        var10 = var16[var9];
                        if (var10 != null) {
                          ((go) this).field_Y.field_u = var10;
                          var9++;
                          continue L7;
                        } else {
                          var9++;
                          continue L7;
                        }
                      }
                    }
                  }
                }
                L8: {
                  if (((go) this).field_Y.field_u == null) {
                    break L8;
                  } else {
                    this.b((byte) 70, ((go) this).field_Y.field_u);
                    break L8;
                  }
                }
                var4 = 0;
                L9: while (true) {
                  if (-50 >= (var4 ^ -1)) {
                  } else {
                    if (((go) this).field_Y.field_p.a(var4, (byte) 96)) {
                      var17 = ((go) this).field_Y.field_h[var4];
                      var17.field_c = new wd(var17.field_h.field_d);
                      var4++;
                      continue L9;
                    } else {
                      var4++;
                      continue L9;
                    }
                  }
                }
              } else {
                var6 = var15[var5];
                if (var6 != null) {
                  var3++;
                  var5++;
                  continue L5;
                } else {
                  var5++;
                  continue L5;
                }
              }
            }
          } else {
            var22[var4] = 0;
            var4++;
            continue L1;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_F = "Pit";
        field_V = "TOP DOWN";
    }
}
