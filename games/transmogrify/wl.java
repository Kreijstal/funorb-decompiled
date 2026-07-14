/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wl extends aj implements hl, df, tc {
    static ti field_K;
    private vc field_C;
    private lj field_G;
    private vc field_x;
    private vc field_J;
    private le field_z;
    private bf field_w;
    private vc field_y;
    private vc field_F;
    dh field_D;
    static boolean field_I;
    private lj field_A;
    private vc field_E;

    public wl() {
        super(0, 0, 496, 0, (ui) null);
        ((wl) this).field_J = new vc("", (ma) null, 12);
        ((wl) this).field_y = new vc("", (ma) null, 100);
        ((wl) this).field_E = new vc("", (ma) null, 100);
        ((wl) this).field_F = new vc("", (ma) null, 20);
        ((wl) this).field_x = new vc("", (ma) null, 20);
        ((wl) this).field_C = new vc("", (ma) null, 3);
        int var1 = 1;
        ((wl) this).field_w = new bf("", (ma) null, var1 != 0);
        ((wl) this).field_G = new lj(da.field_A, (ma) null);
        ((wl) this).field_A = new lj(el.field_a, (ma) null);
        ((wl) this).field_J.field_j = mf.field_a;
        ((wl) this).field_y.field_j = aa.field_c;
        ((wl) this).field_E.field_j = sd.field_V;
        ((wl) this).field_F.field_j = fa.field_g;
        ((wl) this).field_x.field_j = gb.field_b;
        ((wl) this).field_C.field_j = wj.field_l;
        ((wl) this).field_w.field_j = ia.field_l;
        ((wl) this).field_J.a(-86, (wa) (Object) new li((rg) (Object) ((wl) this).field_J));
        ((wl) this).field_y.a(120, (wa) (Object) new vh((rg) (Object) ((wl) this).field_y));
        ((wl) this).field_E.a(-91, (wa) (Object) new va((rg) (Object) ((wl) this).field_E, (rg) (Object) ((wl) this).field_y));
        ((wl) this).field_F.a(100, (wa) (Object) new bg((rg) (Object) ((wl) this).field_F, (rg) (Object) ((wl) this).field_J, (rg) (Object) ((wl) this).field_y));
        ((wl) this).field_x.a(97, (wa) (Object) new cg((rg) (Object) ((wl) this).field_x, (rg) (Object) ((wl) this).field_F));
        ((wl) this).field_C.a(-104, (wa) (Object) new md((rg) (Object) ((wl) this).field_C));
        ((wl) this).field_G.field_t = false;
        ((wl) this).field_G.field_q = (ui) (Object) new qa();
        ((wl) this).field_A.field_q = (ui) (Object) new ek();
        ((wl) this).field_J.field_q = (ui) (Object) new ni(10000536);
        ((wl) this).field_E.field_q = (ui) (Object) new ni(10000536);
        ((wl) this).field_y.field_q = (ui) (Object) new ni(10000536);
        ((wl) this).field_C.field_q = (ui) (Object) new ni(10000536);
        ((wl) this).field_w.field_q = (ui) (Object) new kd();
        ((wl) this).field_x.field_q = (ui) (Object) new nc(10000536);
        ((wl) this).field_F.field_q = (ui) (Object) new nc(10000536);
        String var2 = ij.a(gk.field_g, new String[2], (byte) -72);
        int var3 = 20;
        var3 = var3 + this.a(170, 74, rg.field_I, (qg) (Object) ((wl) this).field_y, var3);
        var3 = var3 + (this.a(66, (qg) (Object) ((wl) this).field_E, 20, "", 170, pf.field_i, var3) - -5);
        var3 = var3 + this.a(170, 101, ee.field_y, (qg) (Object) ((wl) this).field_F, var3);
        var3 = var3 + (5 + this.a((qg) (Object) ((wl) this).field_x, 170, 35, kl.field_d, var3, di.field_a));
        var3 = var3 + (5 + this.a((qg) (Object) ((wl) this).field_J, 170, 35, bi.field_O, var3, rd.field_b));
        var3 = var3 + this.a(170, 818340513, qe.field_A, var3, (qg) (Object) ((wl) this).field_C);
        oc var4 = new oc(46, var3, -90 + ((wl) this).field_l, 25, (qg) (Object) ((wl) this).field_w, true, -120 + ((wl) this).field_l, 5, al.field_i, 11579568, uh.field_o);
        ((wl) this).a((qg) (Object) var4, (byte) -105);
        var3 = var3 + var4.field_h;
        h var5 = new h(vd.field_h, 0, 0, 0, 0, 16777215, -1, 0, 0, vd.field_h.field_y, -1, 2147483647, true);
        ((wl) this).field_z = new le(var2, (ui) (Object) var5);
        ((wl) this).field_z.field_j = "";
        ((wl) this).field_z.a(mk.field_E, 0, 0);
        ((wl) this).field_z.a(mk.field_E, 0, 1);
        ((wl) this).field_z.field_m = (ma) this;
        ((wl) this).field_z.a(46, -90 + ((wl) this).field_l, -1, var3);
        var3 = var3 + (((wl) this).field_z.field_h - -15);
        ((wl) this).a((qg) (Object) ((wl) this).field_z, (byte) -88);
        int var6 = 4;
        int var7 = 200;
        ((wl) this).field_G.a(-83, var3, -var7 + 496 >> 2075701025, var7, 40);
        ((wl) this).field_A.a(-107, 15 + var3, 3 + var6, 60, 40);
        ((wl) this).field_A.field_m = (ma) this;
        ((wl) this).field_G.field_m = (ma) this;
        ((wl) this).a((qg) (Object) ((wl) this).field_G, (byte) -119);
        ((wl) this).a((qg) (Object) ((wl) this).field_A, (byte) -125);
        ((wl) this).field_D = new dh((tc) this);
        ((wl) this).field_D.a(124, ((wl) this).field_J.field_n + 20, ((wl) this).field_J.field_p - -((wl) this).field_J.field_l + 60, -((wl) this).field_J.field_p + (((wl) this).field_l + (-((wl) this).field_J.field_l - 60)), 150);
        ((wl) this).a((qg) (Object) ((wl) this).field_D, (byte) -97);
        ((wl) this).a(39, 0, 0, 496, 55 + (var3 + var6));
    }

    public final void a(boolean param0, String param1) {
        vc var3 = ((wl) this).field_J;
        String var4 = param1;
        ((rg) (Object) var3).a(var4, param0, 1);
    }

    public final void a(byte param0) {
        ((li) (Object) ((wl) this).field_J.a((byte) 125)).g(93);
        if (param0 != -69) {
            ((wl) this).field_C = null;
        }
    }

    public final void a(int param0, int param1, int param2, le param3) {
        int var6 = 0;
        var6 = Transmogrify.field_A ? 1 : 0;
        if (param1 == 2818) {
          if (0 != param2) {
            if (-2 != (param2 ^ -1)) {
              if (param2 == 2) {
                mh.a(param1 + 8389, "conduct.ws");
                return;
              } else {
                return;
              }
            } else {
              mh.a(11207, "privacy.ws");
              return;
            }
          } else {
            mh.a(11207, "terms.ws");
            return;
          }
        } else {
          return;
        }
    }

    final static boolean a(boolean param0, int param1) {
        if (param0) {
            boolean discarded$9 = wl.a(false, -117);
            if (!(0 != param1)) {
                return true;
            }
            return 0 != (hc.field_t & 1 << param1) ? true : false;
        }
        if (!(0 != param1)) {
            return true;
        }
        return 0 != (hc.field_t & 1 << param1) ? true : false;
    }

    private final int a(int param0, int param1, String param2, int param3, qg param4) {
        ve var7 = null;
        oc var8 = null;
        var8 = new oc(20, param3, param0 + 120, 25, param4, false, 120, 3, vd.field_h, 16777215, param2);
        ((wl) this).a((qg) (Object) var8, (byte) -124);
        if (param1 != 818340513) {
          return -55;
        } else {
          var7 = new ve(((ie) (Object) param4).a((byte) 87));
          ((wl) this).a((qg) (Object) var7, (byte) -103);
          var7.a(91, (-15 + var8.field_h >> 818340513) + var8.field_n, var8.field_l + var8.field_p + 3, 15, 15);
          return var8.field_h;
        }
    }

    private final String n(int param0) {
        if (param0 < 0) {
            boolean discarded$0 = wl.a(true, 45);
            return "</col></u>";
        }
        return "</col></u>";
    }

    private final String m(int param0) {
        int var2 = -34 / ((-77 - param0) / 42);
        return "<u=2164A2><col=2164A2>";
    }

    private final int a(int param0, int param1, String param2, qg param3, int param4) {
        oc var6 = null;
        var6 = new oc(20, param4, 120 - -param0, 25, param3, false, 120, 3, vd.field_h, 16777215, param2);
        if (param1 <= 12) {
          return -1;
        } else {
          ((wl) this).a((qg) (Object) var6, (byte) -121);
          return var6.field_h;
        }
    }

    final boolean a(int param0, qg param1, byte param2, char param3) {
        if (super.a(param0, param1, (byte) -99, param3)) {
            return true;
        }
        if (98 == param0) {
            return ((wl) this).a(2, param1);
        }
        if (!(-100 != (param0 ^ -1))) {
            return ((wl) this).b(param1, 63);
        }
        int var5 = 47 % ((65 - param2) / 55);
        return false;
    }

    private final boolean a(byte param0, ie param1) {
        wa var3 = null;
        rc var4 = null;
        int var5 = 0;
        var3 = param1.a((byte) 85);
        if (var3 == null) {
          return true;
        } else {
          var4 = var3.a(27835);
          var5 = -88 % ((52 - param0) / 45);
          if (ec.field_d == var4) {
            return false;
          } else {
            if (var4 != ek.field_a) {
              if (var4 != bc.field_a) {
                return true;
              } else {
                return false;
              }
            } else {
              return false;
            }
          }
        }
    }

    public final void a(lj param0, int param1, int param2, int param3, int param4) {
        if (param1 == 17) {
          if (param0 != ((wl) this).field_A) {
            if (param0 != ((wl) this).field_G) {
              return;
            } else {
              boolean discarded$4 = this.l(2188);
              return;
            }
          } else {
            kc.a((byte) -127);
            return;
          }
        } else {
          field_K = null;
          if (param0 != ((wl) this).field_A) {
            if (param0 != ((wl) this).field_G) {
              return;
            } else {
              boolean discarded$5 = this.l(2188);
              return;
            }
          } else {
            kc.a((byte) -127);
            return;
          }
        }
    }

    private final int a(int param0, qg param1, int param2, String param3, int param4, String param5, int param6) {
        ob var9 = null;
        oc var10 = null;
        if (param0 < 60) {
          return -93;
        } else {
          var10 = new oc(20, param6, param4 + 120, 25, param1, false, 120, 3, vd.field_h, 16777215, param5);
          ((wl) this).a((qg) (Object) var10, (byte) -113);
          var9 = new ob(((ie) (Object) param1).a((byte) -101), param3, 126, var10.field_h + param6, param4 - -50, param2);
          var9.field_m = (ma) this;
          ((wl) this).a((qg) (Object) var9, (byte) -89);
          return var9.field_h + var10.field_h;
        }
    }

    final static void a(boolean param0, boolean param1, int param2) {
        if (param2 != 170) {
          field_I = false;
          td.a(param2 + -280, param0, (String) null, param1);
          return;
        } else {
          td.a(param2 + -280, param0, (String) null, param1);
          return;
        }
    }

    private final boolean l(int param0) {
        int var2 = 0;
        NumberFormatException var3 = null;
        Object var4 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (this.o(15)) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    return false;
                }
                case 2: {
                    var2 = -1;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    try {
                        var2 = Integer.parseInt(((wl) this).field_C.field_k);
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 5: {
                    var3 = (NumberFormatException) (Object) caughtException;
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    if (param0 != 2188) {
                        statePc = 8;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    return ej.a((wl) this, ((wl) this).field_y.field_k, ((wl) this).field_F.field_k, ((wl) this).field_w.field_y, false, ((wl) this).field_J.field_k, var2);
                }
                case 8: {
                    var4 = null;
                    int discarded$1 = this.a(80, -87, (String) null, (qg) null, -6);
                    return ej.a((wl) this, ((wl) this).field_y.field_k, ((wl) this).field_F.field_k, ((wl) this).field_w.field_y, false, ((wl) this).field_J.field_k, var2);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void d(byte param0) {
        int var1 = 54 / ((-76 - param0) / 38);
        field_K = null;
    }

    private final boolean o(int param0) {
        if (param0 == 15) {
          if (this.a((byte) 118, (ie) (Object) ((wl) this).field_J)) {
            if (this.a((byte) 98, (ie) (Object) ((wl) this).field_y)) {
              if (this.a((byte) 104, (ie) (Object) ((wl) this).field_E)) {
                if (this.a((byte) 123, (ie) (Object) ((wl) this).field_F)) {
                  if (this.a((byte) 0, (ie) (Object) ((wl) this).field_x)) {
                    if (!this.a((byte) 114, (ie) (Object) ((wl) this).field_C)) {
                      return false;
                    } else {
                      return true;
                    }
                  } else {
                    return false;
                  }
                } else {
                  return false;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          ((wl) this).field_z = null;
          if (this.a((byte) 118, (ie) (Object) ((wl) this).field_J)) {
            if (this.a((byte) 98, (ie) (Object) ((wl) this).field_y)) {
              if (this.a((byte) 104, (ie) (Object) ((wl) this).field_E)) {
                if (this.a((byte) 123, (ie) (Object) ((wl) this).field_F)) {
                  if (this.a((byte) 0, (ie) (Object) ((wl) this).field_x)) {
                    if (!this.a((byte) 114, (ie) (Object) ((wl) this).field_C)) {
                      return false;
                    } else {
                      return true;
                    }
                  } else {
                    return false;
                  }
                } else {
                  return false;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        }
    }

    private final int a(qg param0, int param1, int param2, String param3, int param4, String param5) {
        if (param2 != 35) {
          ((wl) this).field_A = null;
          return this.a(80, param0, 35, param5, param1, param3, param4);
        } else {
          return this.a(80, param0, 35, param5, param1, param3, param4);
        }
    }

    final void a(int param0, byte param1, qg param2, int param3) {
        super.a(param0, param1, param2, param3);
        ((wl) this).field_G.field_t = this.o(15);
    }

    final static void p(int param0) {
        if (param0 < 101) {
            field_K = null;
        }
    }

    static {
    }
}
