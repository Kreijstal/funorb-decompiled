/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dk extends ib implements ha, en, vf {
    static jp field_R;
    private bf field_N;
    private lg field_I;
    private sf field_M;
    private d field_Q;
    private sf field_L;
    private sf field_O;
    private sf field_S;
    private sf field_J;
    private sf field_H;
    private d field_P;
    ri field_K;

    final static void a(String param0, boolean param1, int param2, boolean param3, int param4) {
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        String stackIn_3_0 = null;
        int stackIn_23_0 = 0;
        String stackIn_23_1 = null;
        int stackIn_24_0 = 0;
        String stackIn_24_1 = null;
        int stackIn_25_0 = 0;
        String stackIn_25_1 = null;
        int stackIn_25_2 = 0;
        int stackIn_33_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_35_1 = 0;
        String stackOut_2_0;
        String stackOut_1_0;
        int stackOut_32_0;
        int stackOut_34_0;
        int stackOut_34_1;
        int stackOut_33_0;
        int stackOut_33_1;
        int stackOut_22_0;
        String stackOut_22_1;
        int stackOut_24_0;
        String stackOut_24_1;
        int stackOut_24_2;
        int stackOut_23_0;
        String stackOut_23_1;
        int stackOut_23_2;
        L0: {
          var10 = BrickABrac.field_J ? 1 : 0;
          va.field_a = true;
          ud.field_v = param2;
          var11 = param0;
          if (!param1) {
            stackOut_2_0 = g.field_q;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = mh.field_mb;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var6 = (String) (Object) stackIn_3_0;
          if (ud.field_v != 0) {
            if ((ud.field_v ^ -1) == -2) {
              var7 = qb.a(ii.field_r, 480, param4 + -109, oc.field_m, var11);
              var8 = 2 - -var7;
              re.field_q = new int[var8];
              kn.field_E = new String[var8];
              var9 = 0;
              L2: while (true) {
                if (var8 <= var9) {
                  hi.field_A = new int[1];
                  var9 = 0;
                  L3: while (true) {
                    if (var7 <= var9) {
                      kn.field_E[var8 - 2] = "";
                      kn.field_E[-1 + var8] = oi.field_a;
                      re.field_q[-1 + var8] = 0;
                      hi.field_A[0] = 2;
                      break L1;
                    } else {
                      kn.field_E[var9] = ii.field_r[var9];
                      var9++;
                      continue L3;
                    }
                  }
                } else {
                  re.field_q[var9] = -1;
                  var9++;
                  continue L2;
                }
              }
            } else {
              throw new IllegalArgumentException();
            }
          } else {
            var7 = qb.a(ii.field_r, 480, param4 ^ -17, oc.field_m, var11);
            var8 = var7 + 3;
            re.field_q = new int[var8];
            kn.field_E = new String[var8];
            var9 = 0;
            L4: while (true) {
              if (var8 <= var9) {
                hi.field_A = new int[2];
                var9 = 0;
                L5: while (true) {
                  if (var7 <= var9) {
                    kn.field_E[-3 + var8] = "";
                    kn.field_E[var8 + -2] = var6;
                    re.field_q[-2 + var8] = 0;
                    hi.field_A[0] = 1;
                    kn.field_E[-1 + var8] = oi.field_a;
                    re.field_q[var8 - 1] = 1;
                    hi.field_A[1] = 2;
                    break L1;
                  } else {
                    kn.field_E[var9] = ii.field_r[var9];
                    var9++;
                    continue L5;
                  }
                }
              } else {
                re.field_q[var9] = -1;
                var9++;
                continue L4;
              }
            }
          }
        }
        fi.field_r.field_r = hi.field_A.length;
        var7 = 0;
        var8 = 0;
        L6: while (true) {
          if (var8 >= kn.field_E.length) {
            lk.field_p = var7 + (cc.field_J - (var7 >> 1558271361));
            bg.field_r = fi.field_r.field_r * (wg.field_f - -dj.field_g << -865205183);
            nc.field_k = cc.field_J + -(var7 >> 1666428705);
            var8 = 0;
            L7: while (true) {
              if (kn.field_E.length <= var8) {
                L8: {
                  mi.field_d = ea.field_e + -(bg.field_r >> 870896289);
                  fi.field_r.a(aj.a(param4 + -46, po.field_a, pq.field_k), 0, param3, (byte) -127);
                  if (param4 == 46) {
                    break L8;
                  } else {
                    field_R = null;
                    break L8;
                  }
                }
                return;
              } else {
                L9: {
                  stackOut_32_0 = bg.field_r;
                  stackIn_34_0 = stackOut_32_0;
                  stackIn_33_0 = stackOut_32_0;
                  if (re.field_q[var8] >= 0) {
                    stackOut_34_0 = stackIn_34_0;
                    stackOut_34_1 = nq.field_i;
                    stackIn_35_0 = stackOut_34_0;
                    stackIn_35_1 = stackOut_34_1;
                    break L9;
                  } else {
                    stackOut_33_0 = stackIn_33_0;
                    stackOut_33_1 = wh.field_m;
                    stackIn_35_0 = stackOut_33_0;
                    stackIn_35_1 = stackOut_33_1;
                    break L9;
                  }
                }
                bg.field_r = stackIn_35_0 + stackIn_35_1;
                var8++;
                continue L7;
              }
            }
          } else {
            L10: {
              stackOut_22_0 = 0;
              stackOut_22_1 = kn.field_E[var8];
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              if (0 > re.field_q[var8]) {
                stackOut_24_0 = stackIn_24_0;
                stackOut_24_1 = (String) (Object) stackIn_24_1;
                stackOut_24_2 = 0;
                stackIn_25_0 = stackOut_24_0;
                stackIn_25_1 = stackOut_24_1;
                stackIn_25_2 = stackOut_24_2;
                break L10;
              } else {
                stackOut_23_0 = stackIn_23_0;
                stackOut_23_1 = (String) (Object) stackIn_23_1;
                stackOut_23_2 = 1;
                stackIn_25_0 = stackOut_23_0;
                stackIn_25_1 = stackOut_23_1;
                stackIn_25_2 = stackOut_23_2;
                break L10;
              }
            }
            L11: {
              var9 = pl.a(stackIn_25_0, (String) (Object) stackIn_25_1, stackIn_25_2 != 0);
              if (re.field_q[var8] == -1) {
                break L11;
              } else {
                var9 = var9 + ek.field_lb * 2;
                break L11;
              }
            }
            if (var7 < var9) {
              var7 = var9;
              var8++;
              continue L6;
            } else {
              var8++;
              continue L6;
            }
          }
        }
    }

    public static void a(int param0) {
        field_R = null;
        if (param0 != -11310) {
            field_R = null;
        }
    }

    private final String j(int param0) {
        if (param0 != -987472479) {
            return null;
        }
        return "</col></u>";
    }

    private final boolean i(int param0) {
        if (!this.h(param0 + 10000537)) {
            return false;
        }
        int var2 = param0;
        try {
            if (false) throw (NumberFormatException) null;
            var2 = Integer.parseInt(((dk) this).field_S.field_A);
        } catch (NumberFormatException numberFormatException) {
        }
        return bc.a(((dk) this).field_J.field_A, ((dk) this).field_O.field_A, ((dk) this).field_M.field_A, var2, (byte) -126, (dk) this, ((dk) this).field_N.field_F);
    }

    private final String c(boolean param0) {
        if (!param0) {
            return null;
        }
        return "<u=2164A2><col=2164A2>";
    }

    final static jp a(int param0, mf param1, int param2, int param3) {
        if (param0 != -873) {
            field_R = null;
        }
        if (!ln.a(-123, param3, param1, param2)) {
            return null;
        }
        return n.a((byte) 21);
    }

    public final void a(int param0, int param1, int param2, lg param3) {
        int var6 = 0;
        L0: {
          var6 = BrickABrac.field_J ? 1 : 0;
          if (param1 == -526) {
            break L0;
          } else {
            ((dk) this).field_O = null;
            break L0;
          }
        }
        L1: {
          if (0 == param2) {
            ih.a("terms.ws", 12);
            break L1;
          } else {
            if (1 != param2) {
              if ((param2 ^ -1) == -3) {
                ih.a("conduct.ws", 12);
                break L1;
              } else {
                break L1;
              }
            } else {
              ih.a("privacy.ws", 12);
              break L1;
            }
          }
        }
    }

    public final void a(int param0, int param1, byte param2, int param3, d param4) {
        L0: {
          if (((dk) this).field_P == param4) {
            ln.a(103);
            break L0;
          } else {
            if (param4 == ((dk) this).field_Q) {
              boolean discarded$5 = this.i(-1);
              break L0;
            } else {
              break L0;
            }
          }
        }
        L1: {
          if (param2 < -22) {
            break L1;
          } else {
            ((dk) this).field_H = null;
            break L1;
          }
        }
    }

    private final int a(oc param0, int param1, String param2, int param3, int param4, String param5, int param6) {
        ma var10 = new ma(20, param1, param4 + 120, 25, param0, false, 120, 3, a.field_u, 16777215, param5);
        ((dk) this).a((oc) (Object) var10, true);
        nf var9 = new nf(((je) (Object) param0).a(-11011), param2, 126, param1 + var10.field_s, param4 - -50, param3);
        var9.field_i = (uh) this;
        if (param6 != 170) {
            ((dk) this).field_N = null;
        }
        ((dk) this).a((oc) (Object) var9, true);
        return var10.field_s + var9.field_s;
    }

    private final int a(String param0, oc param1, int param2, int param3, int param4) {
        ma var6 = new ma(20, param2, 120 + param4, 25, param1, false, 120, 3, a.field_u, 16777215, param0);
        ((dk) this).a((oc) (Object) var6, true);
        int var7 = -5 / ((-32 - param3) / 59);
        return var6.field_s;
    }

    private final int a(oc param0, String param1, int param2, int param3, int param4) {
        if (param3 <= 97) {
            boolean discarded$0 = this.i(-122);
        }
        ma var8 = new ma(20, param4, param2 + 120, 25, param0, false, 120, 3, a.field_u, 16777215, param1);
        ((dk) this).a((oc) (Object) var8, true);
        wl var7 = new wl(((je) (Object) param0).a(-11011));
        ((dk) this).a((oc) (Object) var7, true);
        var7.a(15, var8.field_o - -var8.field_t - -3, (var8.field_s + -15 >> -2057528287) + var8.field_w, (byte) -119, 15);
        return var8.field_s;
    }

    final static void h(byte param0) {
        int var1 = 0;
        km var2 = null;
        int var3 = 0;
        L0: {
          var3 = BrickABrac.field_J ? 1 : 0;
          if (param0 <= -59) {
            break L0;
          } else {
            field_R = null;
            break L0;
          }
        }
        var1 = 0;
        L1: while (true) {
          if (var1 >= pg.field_k.length) {
            return;
          } else {
            var2 = pg.field_k[var1];
            if (var2 != null) {
              var2.d(-88);
              var1++;
              continue L1;
            } else {
              var1++;
              continue L1;
            }
          }
        }
    }

    public final void a(String param0, byte param1) {
        sf var3 = ((dk) this).field_J;
        String var4 = param0;
        ((vb) (Object) var3).a(var4, -12592, false);
        if (param1 != 56) {
            String discarded$0 = this.c(true);
        }
    }

    final static void a(int param0, int param1, pb param2, int param3, int param4, jp param5) {
        fc.a(-85, param2.field_p);
        lb.g(0, 0, param2.field_i, param2.field_q, pf.field_b[param1], 16777215);
        if (param4 != 23275) {
            return;
        }
        param5.b((-param5.field_x + param2.field_i) / 2, -(342 / param0) + (-param5.field_z + param2.field_q), 55, 83);
        sc.b(-84);
    }

    final boolean a(int param0, byte param1, oc param2, char param3) {
        if (super.a(param0, param1, param2, param3)) {
            return true;
        }
        if (!(-99 != param0)) {
            return ((dk) this).b(param2, (byte) 119);
        }
        if (-100 != param0) {
            return false;
        }
        return ((dk) this).a(param2, (byte) -122);
    }

    private final boolean h(int param0) {
        if (param0 != 10000536) {
            ((dk) this).field_H = null;
        }
        if (this.a(60, (je) (Object) ((dk) this).field_J)) {
            if (this.a(60, (je) (Object) ((dk) this).field_M)) {
                if (this.a(60, (je) (Object) ((dk) this).field_H)) {
                    if (this.a(60, (je) (Object) ((dk) this).field_O)) {
                        if (this.a(60, (je) (Object) ((dk) this).field_L)) {
                            if (this.a(60, (je) (Object) ((dk) this).field_S)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    final void a(oc param0, byte param1, int param2, int param3) {
        super.a(param0, param1, param2, param3);
        ((dk) this).field_Q.field_J = this.h(10000536);
    }

    private final int a(int param0, String param1, String param2, int param3, oc param4, int param5) {
        if (param3 != -3) {
            ((dk) this).field_N = null;
        }
        return this.a(param4, param5, param1, 35, param0, param2, 170);
    }

    public final void a(byte param0) {
        if (param0 < 96) {
            return;
        }
        ((fl) (Object) ((dk) this).field_J.a(-11011)).e((byte) -22);
    }

    public dk() {
        super(0, 0, 496, 0, (ub) null);
        ((dk) this).field_J = new sf("", (uh) null, 12);
        ((dk) this).field_M = new sf("", (uh) null, 100);
        ((dk) this).field_H = new sf("", (uh) null, 100);
        ((dk) this).field_O = new sf("", (uh) null, 20);
        ((dk) this).field_L = new sf("", (uh) null, 20);
        ((dk) this).field_S = new sf("", (uh) null, 3);
        int var1 = 1;
        ((dk) this).field_N = new bf("", (uh) null, var1 != 0);
        ((dk) this).field_Q = new d(c.field_d, (uh) null);
        ((dk) this).field_P = new d(se.field_l, (uh) null);
        ((dk) this).field_J.field_z = hh.field_a;
        ((dk) this).field_M.field_z = rf.field_d;
        ((dk) this).field_H.field_z = mf.field_e;
        ((dk) this).field_O.field_z = lm.field_a;
        ((dk) this).field_L.field_z = rn.field_b;
        ((dk) this).field_S.field_z = hc.field_d;
        ((dk) this).field_N.field_z = ok.field_e;
        ((dk) this).field_J.a((ia) (Object) new fl((vb) (Object) ((dk) this).field_J), (byte) -68);
        ((dk) this).field_M.a((ia) (Object) new sg((vb) (Object) ((dk) this).field_M), (byte) -68);
        ((dk) this).field_H.a((ia) (Object) new uc((vb) (Object) ((dk) this).field_H, (vb) (Object) ((dk) this).field_M), (byte) -68);
        ((dk) this).field_O.a((ia) (Object) new g((vb) (Object) ((dk) this).field_O, (vb) (Object) ((dk) this).field_J, (vb) (Object) ((dk) this).field_M), (byte) -68);
        ((dk) this).field_L.a((ia) (Object) new cb((vb) (Object) ((dk) this).field_L, (vb) (Object) ((dk) this).field_O), (byte) -68);
        ((dk) this).field_S.a((ia) (Object) new kf((vb) (Object) ((dk) this).field_S), (byte) -68);
        ((dk) this).field_Q.field_J = false;
        ((dk) this).field_Q.field_l = (ub) (Object) new hi();
        ((dk) this).field_P.field_l = (ub) (Object) new bb();
        ((dk) this).field_J.field_l = (ub) (Object) new r(10000536);
        ((dk) this).field_H.field_l = (ub) (Object) new r(10000536);
        ((dk) this).field_M.field_l = (ub) (Object) new r(10000536);
        ((dk) this).field_S.field_l = (ub) (Object) new r(10000536);
        ((dk) this).field_N.field_l = (ub) (Object) new bd();
        ((dk) this).field_L.field_l = (ub) (Object) new ob(10000536);
        ((dk) this).field_O.field_l = (ub) (Object) new ob(10000536);
        String var2 = rd.a(ch.field_e, new String[2], (byte) 103);
        int var3 = 20;
        var3 = var3 + this.a(kq.field_l, (oc) (Object) ((dk) this).field_M, var3, 37, 170);
        var3 = var3 + (this.a((oc) (Object) ((dk) this).field_H, var3, "", 20, 170, pg.field_o, 170) + 5);
        var3 = var3 + this.a(wc.field_c, (oc) (Object) ((dk) this).field_O, var3, 84, 170);
        var3 = var3 + (this.a(170, md.field_x, cp.field_G, -3, (oc) (Object) ((dk) this).field_L, var3) - -5);
        var3 = var3 + (this.a(170, dj.field_h, of.field_j, -3, (oc) (Object) ((dk) this).field_J, var3) + 5);
        var3 = var3 + this.a((oc) (Object) ((dk) this).field_S, fk.field_d, 170, 111, var3);
        ma var4 = new ma(46, var3, ((dk) this).field_t - 90, 25, (oc) (Object) ((dk) this).field_N, true, -120 + ((dk) this).field_t, 5, og.field_Yb, 11579568, vq.field_z);
        ((dk) this).a((oc) (Object) var4, true);
        var3 = var3 + var4.field_s;
        um var5 = new um(a.field_u, 0, 0, 0, 0, 16777215, -1, 0, 0, a.field_u.field_F, -1, 2147483647, true);
        ((dk) this).field_I = new lg(var2, (ub) (Object) var5);
        ((dk) this).field_I.field_z = "";
        ((dk) this).field_I.a(qg.field_z, 0, (byte) -98);
        ((dk) this).field_I.a(qg.field_z, 1, (byte) -98);
        ((dk) this).field_I.field_i = (uh) this;
        ((dk) this).field_I.a(46, (byte) 46, -90 + ((dk) this).field_t, var3);
        var3 = var3 + (15 + ((dk) this).field_I.field_s);
        ((dk) this).a((oc) (Object) ((dk) this).field_I, true);
        int var6 = 4;
        int var7 = 200;
        ((dk) this).field_Q.a(40, -var7 + 496 >> -987472479, var3, (byte) -119, var7);
        ((dk) this).field_P.a(40, 3 + var6, var3 - -15, (byte) -119, 60);
        ((dk) this).field_P.field_i = (uh) this;
        ((dk) this).field_Q.field_i = (uh) this;
        ((dk) this).a((oc) (Object) ((dk) this).field_Q, true);
        ((dk) this).a((oc) (Object) ((dk) this).field_P, true);
        ((dk) this).field_K = new ri((vf) this);
        ((dk) this).field_K.a(150, ((dk) this).field_J.field_o - (-((dk) this).field_J.field_t - 60), 20 + ((dk) this).field_J.field_w, (byte) -119, ((dk) this).field_t + -((dk) this).field_J.field_o - (((dk) this).field_J.field_t + 60));
        ((dk) this).a((oc) (Object) ((dk) this).field_K, true);
        ((dk) this).a(var6 + (var3 + 55), 0, 0, (byte) -119, 496);
    }

    private final boolean a(int param0, je param1) {
        ia var3 = param1.a(param0 ^ -11071);
        if (var3 == null) {
            return true;
        }
        qh var4 = var3.b((byte) -31);
        if (lp.field_xb == var4) {
            return false;
        }
        if (param0 != 60) {
            ((dk) this).field_N = null;
        }
        if (!(m.field_c != var4)) {
            return false;
        }
        if (var4 != uo.field_f) {
            return true;
        }
        return false;
    }

    static {
    }
}
