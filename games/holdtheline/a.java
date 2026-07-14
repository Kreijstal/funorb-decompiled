/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class a extends v implements qa, pi, pn {
    private sj field_J;
    private jb field_P;
    private cj field_O;
    private jb field_G;
    private jb field_K;
    private jb field_T;
    private rm field_N;
    static ll field_S;
    private rm field_Q;
    private jb field_L;
    static int field_H;
    private jb field_M;
    static uf field_F;
    gi field_R;
    static int field_I;

    public final void a(String param0, int param1) {
        jb var3 = null;
        String var4 = null;
        if (param1 != 25) {
          ((a) this).field_N = null;
          var3 = ((a) this).field_G;
          var4 = param0;
          ((nk) (Object) var3).a(false, var4, 1471);
          return;
        } else {
          var3 = ((a) this).field_G;
          var4 = param0;
          ((nk) (Object) var3).a(false, var4, 1471);
          return;
        }
    }

    private final int a(String param0, boolean param1, int param2, n param3, String param4, int param5, int param6) {
        dj var10 = new dj(20, param5, param2 + 120, 25, param3, param1, 120, 3, hl.field_g, 16777215, param4);
        ((a) this).a(true, (n) (Object) var10);
        bd var9 = new bd(((wk) (Object) param3).a(1), param0, 126, var10.field_u + param5, 50 + param2, param6);
        var9.field_t = (tb) this;
        ((a) this).a(true, (n) (Object) var9);
        return var10.field_u + var9.field_u;
    }

    private final boolean h(int param0) {
        Object var3 = null;
        if (this.a((wk) (Object) ((a) this).field_G, 16777215)) {
          if (this.a((wk) (Object) ((a) this).field_L, 16777215)) {
            if (this.a((wk) (Object) ((a) this).field_K, 16777215)) {
              if (this.a((wk) (Object) ((a) this).field_T, 16777215)) {
                if (this.a((wk) (Object) ((a) this).field_P, 16777215)) {
                  if (this.a((wk) (Object) ((a) this).field_M, 16777215)) {
                    if (param0 != 40) {
                      var3 = null;
                      boolean discarded$2 = this.a((wk) null, 100);
                      return true;
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
          return false;
        }
    }

    public final void a(cj param0, int param1, byte param2, int param3) {
        int var6 = 0;
        var6 = HoldTheLine.field_D;
        if (param2 == -106) {
          if (0 != param1) {
            if ((param1 ^ -1) != -2) {
              if (2 != param1) {
                return;
              } else {
                oc.a(16711680, "conduct.ws");
                return;
              }
            } else {
              oc.a(param2 + 16711786, "privacy.ws");
              return;
            }
          } else {
            oc.a(16711680, "terms.ws");
            return;
          }
        } else {
          field_S = null;
          if (0 != param1) {
            if ((param1 ^ -1) != -2) {
              if (2 != param1) {
                return;
              } else {
                oc.a(16711680, "conduct.ws");
                return;
              }
            } else {
              oc.a(param2 + 16711786, "privacy.ws");
              return;
            }
          } else {
            oc.a(16711680, "terms.ws");
            return;
          }
        }
    }

    public final void a(int param0, rm param1, int param2, int param3, int param4) {
        if (((a) this).field_N == param1) {
          og.a((byte) 44);
          if (param2 != -4) {
            ((a) this).field_R = null;
            return;
          } else {
            return;
          }
        } else {
          if (param1 == ((a) this).field_Q) {
            boolean discarded$3 = this.h((byte) 90);
            if (param2 == -4) {
              return;
            } else {
              ((a) this).field_R = null;
              return;
            }
          } else {
            if (param2 == -4) {
              return;
            } else {
              ((a) this).field_R = null;
              return;
            }
          }
        }
    }

    final void a(int param0, n param1, int param2, byte param3) {
        super.a(param0, param1, param2, param3);
        ((a) this).field_Q.field_D = this.h(40);
    }

    public a() {
        super(0, 0, 496, 0, (dh) null);
        ((a) this).field_G = new jb("", (tb) null, 12);
        ((a) this).field_L = new jb("", (tb) null, 100);
        ((a) this).field_K = new jb("", (tb) null, 100);
        ((a) this).field_T = new jb("", (tb) null, 20);
        ((a) this).field_P = new jb("", (tb) null, 20);
        ((a) this).field_M = new jb("", (tb) null, 3);
        int var1 = 1;
        ((a) this).field_J = new sj("", (tb) null, var1 != 0);
        ((a) this).field_Q = new rm(ek.field_v, (tb) null);
        ((a) this).field_N = new rm(um.field_c, (tb) null);
        ((a) this).field_G.field_z = pf.field_f;
        ((a) this).field_L.field_z = d.field_a;
        ((a) this).field_K.field_z = lj.field_e;
        ((a) this).field_T.field_z = sk.field_c;
        ((a) this).field_P.field_z = en.field_d;
        ((a) this).field_M.field_z = si.field_mb;
        ((a) this).field_J.field_z = pg.field_I;
        ((a) this).field_G.a((byte) 64, (ia) (Object) new cb((nk) (Object) ((a) this).field_G));
        ((a) this).field_L.a((byte) 56, (ia) (Object) new ho((nk) (Object) ((a) this).field_L));
        ((a) this).field_K.a((byte) 58, (ia) (Object) new kh((nk) (Object) ((a) this).field_K, (nk) (Object) ((a) this).field_L));
        ((a) this).field_T.a((byte) 65, (ia) (Object) new wa((nk) (Object) ((a) this).field_T, (nk) (Object) ((a) this).field_G, (nk) (Object) ((a) this).field_L));
        ((a) this).field_P.a((byte) 55, (ia) (Object) new qf((nk) (Object) ((a) this).field_P, (nk) (Object) ((a) this).field_T));
        ((a) this).field_M.a((byte) 45, (ia) (Object) new em((nk) (Object) ((a) this).field_M));
        ((a) this).field_Q.field_D = false;
        ((a) this).field_Q.field_l = (dh) (Object) new mo();
        ((a) this).field_N.field_l = (dh) (Object) new am();
        ((a) this).field_G.field_l = (dh) (Object) new kl(10000536);
        ((a) this).field_K.field_l = (dh) (Object) new kl(10000536);
        ((a) this).field_L.field_l = (dh) (Object) new kl(10000536);
        ((a) this).field_M.field_l = (dh) (Object) new kl(10000536);
        ((a) this).field_J.field_l = (dh) (Object) new gm();
        ((a) this).field_P.field_l = (dh) (Object) new tl(10000536);
        ((a) this).field_T.field_l = (dh) (Object) new tl(10000536);
        String var2 = sd.a(pg.field_F, new String[2], true);
        int var3 = 20;
        var3 = var3 + this.a(170, (n) (Object) ((a) this).field_L, 25, var3, cm.field_c);
        var3 = var3 + (5 + this.a("", false, 170, (n) (Object) ((a) this).field_K, ej.field_e, var3, 20));
        var3 = var3 + this.a(170, (n) (Object) ((a) this).field_T, 25, var3, lc.field_f);
        var3 = var3 + (this.a(170, 21411, (n) (Object) ((a) this).field_P, od.field_o, fi.field_ib, var3) + 5);
        var3 = var3 + (this.a(170, 21411, (n) (Object) ((a) this).field_G, ic.field_h, sh.field_a, var3) + 5);
        var3 = var3 + this.a(170, (byte) -124, sf.field_o, var3, (n) (Object) ((a) this).field_M);
        dj var4 = new dj(46, var3, -90 + ((a) this).field_x, 25, (n) (Object) ((a) this).field_J, true, -120 + ((a) this).field_x, 5, mo.field_w, 11579568, lm.field_c);
        ((a) this).a(true, (n) (Object) var4);
        var3 = var3 + var4.field_u;
        dk var5 = new dk(hl.field_g, 0, 0, 0, 0, 16777215, -1, 0, 0, hl.field_g.field_G, -1, 2147483647, true);
        ((a) this).field_O = new cj(var2, (dh) (Object) var5);
        ((a) this).field_O.field_z = "";
        ((a) this).field_O.a(0, m.field_d, true);
        ((a) this).field_O.a(1, m.field_d, true);
        ((a) this).field_O.field_t = (tb) this;
        ((a) this).field_O.a(-90 + ((a) this).field_x, (byte) 111, var3, 46);
        var3 = var3 + (15 + ((a) this).field_O.field_u);
        ((a) this).a(true, (n) (Object) ((a) this).field_O);
        int var6 = 4;
        int var7 = 200;
        ((a) this).field_Q.a(496 - var7 >> 356522977, (byte) 122, var3, 40, var7);
        ((a) this).field_N.a(3 + var6, (byte) 122, var3 + 15, 40, 60);
        ((a) this).field_N.field_t = (tb) this;
        ((a) this).field_Q.field_t = (tb) this;
        ((a) this).a(true, (n) (Object) ((a) this).field_Q);
        ((a) this).a(true, (n) (Object) ((a) this).field_N);
        ((a) this).field_R = new gi((pn) this);
        ((a) this).field_R.a(((a) this).field_G.field_k - -((a) this).field_G.field_x - -60, (byte) 122, ((a) this).field_G.field_o - -20, 150, -60 + ((a) this).field_x - (((a) this).field_G.field_k - -((a) this).field_G.field_x));
        ((a) this).a(true, (n) (Object) ((a) this).field_R);
        ((a) this).a(0, (byte) 122, 0, var6 + (55 + var3), 496);
    }

    private final String a(boolean param0) {
        if (param0) {
            field_I = -59;
            return "<u=2164A2><col=2164A2>";
        }
        return "<u=2164A2><col=2164A2>";
    }

    private final String g(byte param0) {
        if (param0 <= 90) {
            ((a) this).field_L = null;
            return "</col></u>";
        }
        return "</col></u>";
    }

    private final boolean h(byte param0) {
        if (!(this.h(40))) {
            return false;
        }
        if (param0 <= 28) {
            ((a) this).field_N = null;
        }
        int var2 = -1;
        try {
            if (false) throw (NumberFormatException) null;
            var2 = Integer.parseInt(((a) this).field_M.field_q);
        } catch (NumberFormatException numberFormatException) {
        }
        return hl.a(((a) this).field_T.field_q, -23000, ((a) this).field_J.field_B, ((a) this).field_G.field_q, (a) this, ((a) this).field_L.field_q, var2);
    }

    public static void i(byte param0) {
        field_S = null;
        if (param0 != -16) {
            field_I = -2;
            field_F = null;
            return;
        }
        field_F = null;
    }

    private final boolean a(wk param0, int param1) {
        ia var3 = null;
        fd var4 = null;
        var3 = param0.a(param1 + -16777214);
        if (var3 == null) {
          return true;
        } else {
          var4 = var3.b(-7447);
          if (var4 != g.field_k) {
            if (var4 == hh.field_d) {
              return false;
            } else {
              if (di.field_q == var4) {
                return false;
              } else {
                if (param1 != 16777215) {
                  ((a) this).field_O = null;
                  return true;
                } else {
                  return true;
                }
              }
            }
          } else {
            return false;
          }
        }
    }

    private final int a(int param0, int param1, n param2, String param3, String param4, int param5) {
        if (param1 != 21411) {
          ((a) this).field_O = null;
          return this.a(param3, false, param0, param2, param4, param5, 35);
        } else {
          return this.a(param3, false, param0, param2, param4, param5, 35);
        }
    }

    final boolean a(n param0, int param1, byte param2, char param3) {
        if (!super.a(param0, param1, param2, param3)) {
          if ((param1 ^ -1) == -99) {
            return ((a) this).c(param0, -1);
          } else {
            if ((param1 ^ -1) != -100) {
              return false;
            } else {
              return ((a) this).b(param0, 115);
            }
          }
        } else {
          return true;
        }
    }

    private final int a(int param0, n param1, int param2, int param3, String param4) {
        dj var6 = new dj(20, param3, param0 + 120, param2, param1, false, 120, 3, hl.field_g, 16777215, param4);
        ((a) this).a(true, (n) (Object) var6);
        return var6.field_u;
    }

    private final int a(int param0, byte param1, String param2, int param3, n param4) {
        gg var7 = null;
        Object var8 = null;
        dj var9 = null;
        var9 = new dj(20, param3, 120 - -param0, 25, param4, false, 120, 3, hl.field_g, 16777215, param2);
        if (param1 != -124) {
          var8 = null;
          int discarded$1 = this.a(71, (n) null, -15, -54, (String) null);
          ((a) this).a(true, (n) (Object) var9);
          var7 = new gg(((wk) (Object) param4).a(param1 + 125));
          ((a) this).a(true, (n) (Object) var7);
          var7.a(var9.field_x + var9.field_k - -3, (byte) 122, var9.field_o + (-15 + var9.field_u >> 470378145), 15, 15);
          return var9.field_u;
        } else {
          ((a) this).a(true, (n) (Object) var9);
          var7 = new gg(((wk) (Object) param4).a(param1 + 125));
          ((a) this).a(true, (n) (Object) var7);
          var7.a(var9.field_x + var9.field_k - -3, (byte) 122, var9.field_o + (-15 + var9.field_u >> 470378145), 15, 15);
          return var9.field_u;
        }
    }

    public final void a(byte param0) {
        if (param0 <= 124) {
          ((a) this).field_P = null;
          ((cb) (Object) ((a) this).field_G.a(1)).a(true);
          return;
        } else {
          ((cb) (Object) ((a) this).field_G.a(1)).a(true);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_S = new ll();
        field_I = -1;
    }
}
