/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ik extends kn implements be, sh, f {
    private ke field_P;
    static String field_S;
    private ti field_V;
    private tn field_L;
    ei field_U;
    static String[] field_N;
    private hc field_K;
    private ke field_Q;
    private ke field_O;
    private hc field_R;
    static int field_T;
    private ke field_J;
    private ke field_I;
    private ke field_M;

    public final void a(String param0, int param1) {
        int var4 = -26 % ((param1 - 22) / 62);
        ke var3 = ((ik) this).field_I;
        String var5 = param0;
        ((ui) (Object) var3).a(false, false, var5);
    }

    public final void a(byte param0) {
        ((qi) (Object) ((ik) this).field_I.a(35)).b((byte) -78);
        if (param0 != 47) {
            ((ik) this).field_U = null;
        }
    }

    private final int a(int param0, int param1, String param2, fe param3, int param4) {
        am var6 = new am(20, param1, param0 + 120, 25, param3, false, 120, 3, bn.field_d, 16777215, param2);
        if (param4 != -2791) {
            return -15;
        }
        ((ik) this).a(param4 + 2790, (fe) (Object) var6);
        return var6.field_q;
    }

    public final void a(tn param0, int param1, int param2, int param3) {
        int var6 = MinerDisturbance.field_ab;
        if (param2 != 12278) {
            ((ik) this).field_V = null;
        }
        if (-1 == param3) {
            qd.a(5, "terms.ws");
        } else {
            if (-2 == param3) {
                qd.a(5, "privacy.ws");
            } else {
                if (!((param3 ^ -1) != -3)) {
                    qd.a(5, "conduct.ws");
                }
            }
        }
    }

    private final String q(int param0) {
        if (param0 != 4979) {
            ((ik) this).field_J = null;
        }
        return "</col></u>";
    }

    public final void a(int param0, byte param1, hc param2, int param3, int param4) {
        if (param1 != 6) {
            field_N = null;
        }
        if (((ik) this).field_R != param2) {
            // if_acmpne L49
            boolean discarded$0 = this.o(-1);
        } else {
            hk.c(-118);
        }
    }

    private final int a(String param0, fe param1, int param2, int param3, int param4) {
        am var9 = new am(20, param3, param2 + 120, 25, param1, false, 120, 3, bn.field_d, 16777215, param0);
        int var8 = -5 % ((param4 - 51) / 37);
        ((ik) this).a(-1, (fe) (Object) var9);
        qn var7 = new qn(((sg) (Object) param1).a(35));
        ((ik) this).a(-1, (fe) (Object) var7);
        var7.a(15, -107, var9.field_v + (var9.field_u + 3), 15, (-15 + var9.field_q >> -826133631) + var9.field_t);
        return var9.field_q;
    }

    private final String e(byte param0) {
        int var2 = 90 / ((param0 - 43) / 34);
        return "<u=2164A2><col=2164A2>";
    }

    private final int a(int param0, String param1, String param2, fe param3, int param4, byte param5, int param6) {
        am var11 = new am(20, param4, 120 - -param6, 25, param3, false, 120, 3, bn.field_d, 16777215, param1);
        if (param5 > -53) {
            Object var10 = null;
            int discarded$0 = this.a(-80, -80, (String) null, (fe) null, 39);
        }
        ((ik) this).a(-1, (fe) (Object) var11);
        w var9 = new w(((sg) (Object) param3).a(35), param2, 126, var11.field_q + param4, 50 + param6, param0);
        var9.field_y = (rm) this;
        ((ik) this).a(-1, (fe) (Object) var9);
        return var11.field_q + var9.field_q;
    }

    final void a(int param0, int param1, byte param2, fe param3) {
        if (param2 <= 49) {
            return;
        }
        super.a(param0, param1, (byte) 123, param3);
        ((ik) this).field_K.field_E = this.a(true);
    }

    public static void p(int param0) {
        field_S = null;
        if (param0 != 120) {
            field_T = -63;
        }
        field_N = null;
    }

    final static ek f(byte param0) {
        if (param0 != -2) {
            return null;
        }
        return (ek) (Object) new ca();
    }

    final boolean a(char param0, fe param1, byte param2, int param3) {
        if (!(!super.a(param0, param1, param2, param3))) {
            return true;
        }
        if (!(-99 != param3)) {
            return ((ik) this).b(param1, param2 ^ -79);
        }
        if (-100 == param3) {
            return ((ik) this).a(param1, (byte) 12);
        }
        return false;
    }

    private final boolean a(int param0, sg param1) {
        jm var3 = param1.a(35);
        if (!(var3 != null)) {
            return true;
        }
        if (param0 != 0) {
            ((ik) this).field_M = null;
        }
        ag var4 = var3.b(param0 + 24595);
        if (var4 == fg.field_d) {
            return false;
        }
        if (var4 == nn.field_f) {
            return false;
        }
        if (var4 == ke.field_W) {
            return false;
        }
        return true;
    }

    public ik() {
        super(0, 0, 496, 0, (ad) null);
        ((ik) this).field_I = new ke("", (rm) null, 12);
        ((ik) this).field_P = new ke("", (rm) null, 100);
        ((ik) this).field_M = new ke("", (rm) null, 100);
        ((ik) this).field_J = new ke("", (rm) null, 20);
        ((ik) this).field_O = new ke("", (rm) null, 20);
        ((ik) this).field_Q = new ke("", (rm) null, 3);
        int var1 = 1;
        ((ik) this).field_V = new ti("", (rm) null, var1 != 0);
        ((ik) this).field_K = new hc(cg.field_r, (rm) null);
        ((ik) this).field_R = new hc(hk.field_c, (rm) null);
        ((ik) this).field_I.field_n = vj.field_l;
        ((ik) this).field_P.field_n = fm.field_I;
        ((ik) this).field_M.field_n = lg.field_b;
        ((ik) this).field_J.field_n = fe.field_C;
        ((ik) this).field_O.field_n = sl.field_v;
        ((ik) this).field_Q.field_n = uf.field_t;
        ((ik) this).field_V.field_n = ig.field_a;
        ((ik) this).field_I.a((jm) (Object) new qi((ui) (Object) ((ik) this).field_I), 1048576);
        ((ik) this).field_P.a((jm) (Object) new k((ui) (Object) ((ik) this).field_P), 1048576);
        ((ik) this).field_M.a((jm) (Object) new od((ui) (Object) ((ik) this).field_M, (ui) (Object) ((ik) this).field_P), 1048576);
        ((ik) this).field_J.a((jm) (Object) new e((ui) (Object) ((ik) this).field_J, (ui) (Object) ((ik) this).field_I, (ui) (Object) ((ik) this).field_P), 1048576);
        ((ik) this).field_O.a((jm) (Object) new jg((ui) (Object) ((ik) this).field_O, (ui) (Object) ((ik) this).field_J), 1048576);
        ((ik) this).field_Q.a((jm) (Object) new wj((ui) (Object) ((ik) this).field_Q), 1048576);
        ((ik) this).field_K.field_E = false;
        ((ik) this).field_K.field_A = (ad) (Object) new wi();
        ((ik) this).field_R.field_A = (ad) (Object) new nc();
        ((ik) this).field_I.field_A = (ad) (Object) new gk(10000536);
        ((ik) this).field_M.field_A = (ad) (Object) new gk(10000536);
        ((ik) this).field_P.field_A = (ad) (Object) new gk(10000536);
        ((ik) this).field_Q.field_A = (ad) (Object) new gk(10000536);
        ((ik) this).field_V.field_A = (ad) (Object) new qh();
        ((ik) this).field_O.field_A = (ad) (Object) new mn(10000536);
        ((ik) this).field_J.field_A = (ad) (Object) new mn(10000536);
        String var2 = oa.a((byte) -120, eb.field_g, new String[2]);
        int var3 = 20;
        var3 = var3 + this.a(170, var3, id.field_i, (fe) (Object) ((ik) this).field_P, -2791);
        var3 = var3 + (5 + this.a(20, di.field_cb, "", (fe) (Object) ((ik) this).field_M, var3, (byte) -116, 170));
        var3 = var3 + this.a(170, var3, tk.field_c, (fe) (Object) ((ik) this).field_J, -2791);
        var3 = var3 + (5 + this.a(170, di.field_E, var3, (fe) (Object) ((ik) this).field_O, -100, t.field_d));
        var3 = var3 + (5 + this.a(170, hi.field_w, var3, (fe) (Object) ((ik) this).field_I, -100, wm.field_c));
        var3 = var3 + this.a(oc.field_j, (fe) (Object) ((ik) this).field_Q, 170, var3, 105);
        am var4 = new am(46, var3, ((ik) this).field_v + -90, 25, (fe) (Object) ((ik) this).field_V, true, -120 + ((ik) this).field_v, 5, sl.field_q, 11579568, mc.field_x);
        ((ik) this).a(-1, (fe) (Object) var4);
        var3 = var3 + var4.field_q;
        eg var5 = new eg(bn.field_d, 0, 0, 0, 0, 16777215, -1, 0, 0, bn.field_d.field_I, -1, 2147483647, true);
        ((ik) this).field_L = new tn(var2, (ad) (Object) var5);
        ((ik) this).field_L.field_n = "";
        ((ik) this).field_L.a(-115, 0, wk.field_d);
        ((ik) this).field_L.a(-68, 1, wk.field_d);
        ((ik) this).field_L.field_y = (rm) this;
        ((ik) this).field_L.b(46, -90 + ((ik) this).field_v, 32088, var3);
        var3 = var3 + (15 + ((ik) this).field_L.field_q);
        ((ik) this).a(-1, (fe) (Object) ((ik) this).field_L);
        int var6 = 4;
        int var7 = 200;
        ((ik) this).field_K.a(40, -39, 496 + -var7 >> -1397330719, var7, var3);
        ((ik) this).field_R.a(40, -49, var6 + 3, 60, 15 + var3);
        ((ik) this).field_R.field_y = (rm) this;
        ((ik) this).field_K.field_y = (rm) this;
        ((ik) this).a(-1, (fe) (Object) ((ik) this).field_K);
        ((ik) this).a(-1, (fe) (Object) ((ik) this).field_R);
        ((ik) this).field_U = new ei((f) this);
        ((ik) this).field_U.a(150, -36, 60 + ((ik) this).field_I.field_v + ((ik) this).field_I.field_u, ((ik) this).field_v - (((ik) this).field_I.field_u - (-((ik) this).field_I.field_v + -60)), 20 + ((ik) this).field_I.field_t);
        ((ik) this).a(-1, (fe) (Object) ((ik) this).field_U);
        ((ik) this).a(55 + (var3 - -var6), -45, 0, 496, 0);
    }

    private final boolean a(boolean param0) {
        L0: {
          if (!this.a(0, (sg) (Object) ((ik) this).field_I)) {
            break L0;
          } else {
            if (!this.a(0, (sg) (Object) ((ik) this).field_P)) {
              break L0;
            } else {
              if (!this.a(0, (sg) (Object) ((ik) this).field_M)) {
                break L0;
              } else {
                if (!this.a(0, (sg) (Object) ((ik) this).field_J)) {
                  break L0;
                } else {
                  if (!this.a(0, (sg) (Object) ((ik) this).field_O)) {
                    break L0;
                  } else {
                    if (this.a(0, (sg) (Object) ((ik) this).field_Q)) {
                      L1: {
                        if (param0) {
                          break L1;
                        } else {
                          ((ik) this).field_U = null;
                          break L1;
                        }
                      }
                      return true;
                    } else {
                      return false;
                    }
                  }
                }
              }
            }
          }
        }
        return false;
    }

    private final boolean o(int param0) {
        if (!this.a(true)) {
            return false;
        }
        int var2 = param0;
        try {
            if (false) throw (NumberFormatException) null;
            var2 = Integer.parseInt(((ik) this).field_Q.field_s);
        } catch (NumberFormatException numberFormatException) {
        }
        return qi.a(((ik) this).field_I.field_s, var2, (ik) this, ((ik) this).field_V.field_H, param0 ^ 82, ((ik) this).field_J.field_s, ((ik) this).field_P.field_s);
    }

    final static void n(int param0) {
        int var1 = 0;
        int var2 = 0;
        long var3_long = 0L;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        String var6_ref = null;
        int var7 = 0;
        int var8 = 0;
        ac var9 = null;
        int var10 = 0;
        int stackIn_16_0 = 0;
        String stackIn_22_0 = null;
        int stackIn_26_0 = 0;
        String stackIn_32_0 = null;
        String stackIn_36_0 = null;
        String stackIn_37_0 = null;
        String stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        ac stackIn_42_0 = null;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        String stackOut_21_0 = null;
        String stackOut_20_0 = null;
        int stackOut_25_0 = 0;
        int stackOut_24_0 = 0;
        String stackOut_31_0 = null;
        String stackOut_30_0 = null;
        String stackOut_35_0 = null;
        String stackOut_37_0 = null;
        int stackOut_37_1 = 0;
        String stackOut_36_0 = null;
        int stackOut_36_1 = 0;
        ac stackOut_41_0 = null;
        ac stackOut_40_0 = null;
        L0: {
          var10 = MinerDisturbance.field_ab;
          var1 = lj.field_p;
          var2 = 0;
          if (-3 == (ti.field_M ^ -1)) {
            var3_long = sf.a((byte) 121) - tl.field_o;
            var2 = (int)((10999L + -var3_long) / 1000L);
            if (0 <= var2) {
              break L0;
            } else {
              var2 = 0;
              break L0;
            }
          } else {
            break L0;
          }
        }
        var3 = 0;
        L1: while (true) {
          if (var3 >= ne.field_K.length) {
            L2: {
              if (param0 <= -86) {
                break L2;
              } else {
                field_N = null;
                break L2;
              }
            }
            return;
          } else {
            L3: {
              var4 = mf.field_m[var3];
              if (0 <= var4) {
                if (var4 == pn.field_a.field_e) {
                  var5 = fg.field_b;
                  break L3;
                } else {
                  var5 = am.field_J;
                  break L3;
                }
              } else {
                var5 = pb.field_K;
                break L3;
              }
            }
            L4: {
              var6 = ne.field_K[var3];
              if (ti.field_M != -3) {
                break L4;
              } else {
                if (-2 != var2) {
                  break L4;
                } else {
                  L5: {
                    if (oe.field_g.length >= ce.field_c.length) {
                      stackOut_15_0 = oe.field_g.length;
                      stackIn_16_0 = stackOut_15_0;
                      break L5;
                    } else {
                      stackOut_14_0 = ce.field_c.length;
                      stackIn_16_0 = stackOut_14_0;
                      break L5;
                    }
                  }
                  L6: {
                    var7 = stackIn_16_0;
                    if ((var3 ^ -1) > -7) {
                      break L6;
                    } else {
                      if (var7 + 6 > var3) {
                        L7: {
                          if (-1 < (-var7 + oe.field_g.length + (var3 - 6) ^ -1)) {
                            stackOut_21_0 = "";
                            stackIn_22_0 = stackOut_21_0;
                            break L7;
                          } else {
                            stackOut_20_0 = oe.field_g[oe.field_g.length + -6 + var3 - var7];
                            stackIn_22_0 = stackOut_20_0;
                            break L7;
                          }
                        }
                        var6_ref = stackIn_22_0;
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                  }
                  L8: {
                    if (field_N.length <= om.field_f.length) {
                      stackOut_25_0 = om.field_f.length;
                      stackIn_26_0 = stackOut_25_0;
                      break L8;
                    } else {
                      stackOut_24_0 = field_N.length;
                      stackIn_26_0 = stackOut_24_0;
                      break L8;
                    }
                  }
                  var8 = stackIn_26_0;
                  if (var3 < var7 + 7) {
                    break L4;
                  } else {
                    if (var3 < 7 - (-var7 - var8)) {
                      L9: {
                        if (var3 - (7 - -var7) < om.field_f.length) {
                          stackOut_31_0 = om.field_f[-var7 + (-7 + var3)];
                          stackIn_32_0 = stackOut_31_0;
                          break L9;
                        } else {
                          stackOut_30_0 = "";
                          stackIn_32_0 = stackOut_30_0;
                          break L9;
                        }
                      }
                      var6_ref = stackIn_32_0;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                }
              }
            }
            L10: {
              if (1 != (var4 ^ -1)) {
                break L10;
              } else {
                var6_ref = Integer.toString(var2);
                break L10;
              }
            }
            L11: {
              stackOut_35_0 = (String) var6_ref;
              stackIn_37_0 = stackOut_35_0;
              stackIn_36_0 = stackOut_35_0;
              if (0 > var4) {
                stackOut_37_0 = (String) (Object) stackIn_37_0;
                stackOut_37_1 = 0;
                stackIn_38_0 = stackOut_37_0;
                stackIn_38_1 = stackOut_37_1;
                break L11;
              } else {
                stackOut_36_0 = (String) (Object) stackIn_36_0;
                stackOut_36_1 = 1;
                stackIn_38_0 = stackOut_36_0;
                stackIn_38_1 = stackOut_36_1;
                break L11;
              }
            }
            L12: {
              var7 = hl.a(stackIn_38_0, stackIn_38_1 != 0, -15388);
              var8 = -(var7 >> -77271743) + rj.field_e;
              if (0 > var4) {
                break L12;
              } else {
                L13: {
                  var1 = var1 + hi.field_z;
                  if (var4 != pn.field_a.field_e) {
                    stackOut_41_0 = mf.field_j;
                    stackIn_42_0 = stackOut_41_0;
                    break L13;
                  } else {
                    stackOut_40_0 = s.field_O;
                    stackIn_42_0 = stackOut_40_0;
                    break L13;
                  }
                }
                L14: {
                  var9 = stackIn_42_0;
                  if (var9 != null) {
                    var9.a(nk.field_u - -(sn.field_d << -1322473087), var1, var7 - -(ka.field_a << 185231969), 26202, var8 - ka.field_a);
                    break L14;
                  } else {
                    break L14;
                  }
                }
                var1 = var1 + sn.field_d;
                break L12;
              }
            }
            if ((var4 ^ -1) <= -1) {
              ta.field_b.a(var6_ref, var8, nm.field_e + var1, var5, -1);
              var1 = var1 + (hi.field_z + (sn.field_d - -nk.field_u));
              var3++;
              continue L1;
            } else {
              gh.field_b.a(var6_ref, var8, var1 - -he.field_a, var5, -1);
              var1 = var1 + vd.field_z;
              var3++;
              continue L1;
            }
          }
        }
    }

    private final int a(int param0, String param1, int param2, fe param3, int param4, String param5) {
        if (param4 != -100) {
            ((ik) this).field_V = null;
        }
        return this.a(35, param5, param1, param3, param2, (byte) -108, param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_S = "Unpacking music";
        field_T = 0;
    }
}
