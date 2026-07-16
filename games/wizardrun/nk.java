/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nk extends pe implements ng, qd, ha {
    private pl field_V;
    private p field_O;
    private p field_F;
    private p field_H;
    wj field_J;
    static String field_Q;
    static bh field_U;
    private p field_S;
    private ef field_E;
    private p field_G;
    static String field_R;
    private ff field_L;
    private pl field_I;
    static String field_M;
    static String field_K;
    private p field_P;
    static int field_T;
    static mg field_N;

    public final void a(int param0) {
        if (param0 != 2147483647) {
            return;
        }
        ((jg) (Object) ((nk) this).field_G.a((byte) -114)).g(113);
    }

    public final void a(String param0, byte param1) {
        p var3 = null;
        String var4 = null;
        Object var5 = null;
        var3 = ((nk) this).field_G;
        var4 = param0;
        if (param1 <= 61) {
          var5 = null;
          ((nk) this).a(122, (pl) null, -97, 3, -8);
          ((og) (Object) var3).a(-1, false, var4);
          return;
        } else {
          ((og) (Object) var3).a(-1, false, var4);
          return;
        }
    }

    private final boolean h(byte param0) {
        if (!this.g(-50)) {
            return false;
        }
        int var2 = -1;
        if (param0 <= 16) {
            return true;
        }
        try {
            if (false) throw (NumberFormatException) null;
            var2 = Integer.parseInt(((nk) this).field_P.field_k);
        } catch (NumberFormatException numberFormatException) {
        }
        return ih.a(((nk) this).field_G.field_k, ((nk) this).field_E.field_z, (nk) this, 0, var2, ((nk) this).field_S.field_k, ((nk) this).field_F.field_k);
    }

    private final boolean g(int param0) {
        if (param0 == -50) {
          if (this.a((byte) 95, (wa) (Object) ((nk) this).field_G)) {
            if (this.a((byte) 118, (wa) (Object) ((nk) this).field_F)) {
              if (this.a((byte) 92, (wa) (Object) ((nk) this).field_H)) {
                if (this.a((byte) 111, (wa) (Object) ((nk) this).field_S)) {
                  if (this.a((byte) 119, (wa) (Object) ((nk) this).field_O)) {
                    if (!this.a((byte) 105, (wa) (Object) ((nk) this).field_P)) {
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
          return true;
        }
    }

    private final String d(boolean param0) {
        if (param0) {
            ((nk) this).field_F = null;
            return "<u=2164A2><col=2164A2>";
        }
        return "<u=2164A2><col=2164A2>";
    }

    private final int a(byte param0, ub param1, String param2, int param3, int param4, String param5) {
        if (param0 != 4) {
          ((nk) this).field_F = null;
          return this.a(35, param2, param1, 7501, param3, param4, param5);
        } else {
          return this.a(35, param2, param1, 7501, param3, param4, param5);
        }
    }

    private final int a(int param0, ub param1, boolean param2, String param3, int param4) {
        kc var7 = null;
        ik var9 = null;
        ik var10 = null;
        if (!param2) {
          field_U = null;
          var9 = new ik(20, param4, 120 + param0, 25, param1, false, 120, 3, gh.field_b, 16777215, param3);
          ((nk) this).a((ub) (Object) var9, (byte) 39);
          var7 = new kc(((wa) (Object) param1).a((byte) 120));
          ((nk) this).a((ub) (Object) var7, (byte) 28);
          var7.a(119, var9.field_l - -(var9.field_n + -15 >> -1244099295), 15, 15, 3 + var9.field_o + var9.field_r);
          return var9.field_n;
        } else {
          var10 = new ik(20, param4, 120 + param0, 25, param1, false, 120, 3, gh.field_b, 16777215, param3);
          ((nk) this).a((ub) (Object) var10, (byte) 39);
          var7 = new kc(((wa) (Object) param1).a((byte) 120));
          ((nk) this).a((ub) (Object) var7, (byte) 28);
          var7.a(119, var10.field_l - -(var10.field_n + -15 >> -1244099295), 15, 15, 3 + var10.field_o + var10.field_r);
          return var10.field_n;
        }
    }

    public final void a(int param0, pl param1, int param2, int param3, int param4) {
        if (param1 != ((nk) this).field_I) {
          if (param1 == ((nk) this).field_V) {
            boolean discarded$3 = this.h((byte) 107);
            if (param0 != -18905) {
              ((nk) this).field_I = null;
              return;
            } else {
              return;
            }
          } else {
            if (param0 == -18905) {
              return;
            } else {
              ((nk) this).field_I = null;
              return;
            }
          }
        } else {
          pg.a((byte) -97);
          if (param0 == -18905) {
            return;
          } else {
            ((nk) this).field_I = null;
            return;
          }
        }
    }

    private final int a(int param0, String param1, ub param2, int param3, int param4, int param5, String param6) {
        l var9 = null;
        ik var10 = null;
        var10 = new ik(20, param5, 120 - -param4, 25, param2, false, 120, 3, gh.field_b, 16777215, param1);
        ((nk) this).a((ub) (Object) var10, (byte) 39);
        var9 = new l(((wa) (Object) param2).a((byte) 109), param6, 126, param5 + var10.field_n, param4 - -50, param0);
        if (param3 != 7501) {
          ((nk) this).field_P = null;
          var9.field_s = (ce) this;
          ((nk) this).a((ub) (Object) var9, (byte) 39);
          return var9.field_n + var10.field_n;
        } else {
          var9.field_s = (ce) this;
          ((nk) this).a((ub) (Object) var9, (byte) 39);
          return var9.field_n + var10.field_n;
        }
    }

    private final int a(int param0, boolean param1, int param2, ub param3, String param4) {
        ik var6 = null;
        if (!param1) {
          return -4;
        } else {
          var6 = new ik(20, param0, param2 + 120, 25, param3, false, 120, 3, gh.field_b, 16777215, param4);
          ((nk) this).a((ub) (Object) var6, (byte) 62);
          return var6.field_n;
        }
    }

    public static void h(int param0) {
        field_R = null;
        field_K = null;
        field_M = null;
        field_N = null;
        field_Q = null;
        field_U = null;
        if (param0 != -1) {
            field_N = null;
        }
    }

    public nk() {
        super(0, 0, 496, 0, (bf) null);
        ((nk) this).field_G = new p("", (ce) null, 12);
        ((nk) this).field_F = new p("", (ce) null, 100);
        ((nk) this).field_H = new p("", (ce) null, 100);
        ((nk) this).field_S = new p("", (ce) null, 20);
        ((nk) this).field_O = new p("", (ce) null, 20);
        ((nk) this).field_P = new p("", (ce) null, 3);
        int var1 = 1;
        ((nk) this).field_E = new ef("", (ce) null, var1 != 0);
        ((nk) this).field_V = new pl(w.field_d, (ce) null);
        ((nk) this).field_I = new pl(v.field_c, (ce) null);
        ((nk) this).field_G.field_p = cd.field_a;
        ((nk) this).field_F.field_p = fb.field_c;
        ((nk) this).field_H.field_p = ec.field_e;
        ((nk) this).field_S.field_p = u.field_v;
        ((nk) this).field_O.field_p = ph.field_s;
        ((nk) this).field_P.field_p = jj.field_c;
        ((nk) this).field_E.field_p = pc.field_o;
        ((nk) this).field_G.a(0, (dk) (Object) new jg((og) (Object) ((nk) this).field_G));
        ((nk) this).field_F.a(0, (dk) (Object) new sj((og) (Object) ((nk) this).field_F));
        ((nk) this).field_H.a(0, (dk) (Object) new hc((og) (Object) ((nk) this).field_H, (og) (Object) ((nk) this).field_F));
        ((nk) this).field_S.a(0, (dk) (Object) new rh((og) (Object) ((nk) this).field_S, (og) (Object) ((nk) this).field_G, (og) (Object) ((nk) this).field_F));
        ((nk) this).field_O.a(0, (dk) (Object) new fe((og) (Object) ((nk) this).field_O, (og) (Object) ((nk) this).field_S));
        ((nk) this).field_P.a(0, (dk) (Object) new qf((og) (Object) ((nk) this).field_P));
        ((nk) this).field_V.field_B = false;
        ((nk) this).field_V.field_w = (bf) (Object) new jl();
        ((nk) this).field_I.field_w = (bf) (Object) new tk();
        ((nk) this).field_G.field_w = (bf) (Object) new qb(10000536);
        qb dupTemp$0 = new qb(10000536);
        ((nk) this).field_H.field_w = (bf) (Object) dupTemp$0;
        ((nk) this).field_F.field_w = (bf) (Object) dupTemp$0;
        ((nk) this).field_P.field_w = (bf) (Object) new qb(10000536);
        ((nk) this).field_E.field_w = (bf) (Object) new cc();
        ke dupTemp$1 = new ke(10000536);
        ((nk) this).field_O.field_w = (bf) (Object) dupTemp$1;
        ((nk) this).field_S.field_w = (bf) (Object) dupTemp$1;
        String var2 = di.a(new String[2], (byte) 76, qj.field_b);
        int var3 = 20;
        var3 = var3 + this.a(var3, true, 170, (ub) (Object) ((nk) this).field_F, ii.field_d);
        var3 = var3 + (5 + this.a(20, ve.field_b, (ub) (Object) ((nk) this).field_H, 7501, 170, var3, ""));
        var3 = var3 + this.a(var3, true, 170, (ub) (Object) ((nk) this).field_S, qk.field_d);
        var3 = var3 + (this.a((byte) 4, (ub) (Object) ((nk) this).field_O, df.field_i, 170, var3, ik.field_H) - -5);
        var3 = var3 + (5 + this.a((byte) 4, (ub) (Object) ((nk) this).field_G, re.field_E, 170, var3, d.field_b));
        var3 = var3 + this.a(170, (ub) (Object) ((nk) this).field_P, true, sb.field_a, var3);
        ik var4 = new ik(46, var3, -90 + ((nk) this).field_r, 25, (ub) (Object) ((nk) this).field_E, true, -120 + ((nk) this).field_r, 5, e.field_b, 11579568, fb.field_e);
        ((nk) this).a((ub) (Object) var4, (byte) 58);
        var3 = var3 + var4.field_n;
        ll var5 = new ll(gh.field_b, 0, 0, 0, 0, 16777215, -1, 0, 0, gh.field_b.field_M, -1, 2147483647, true);
        ((nk) this).field_L = new ff(var2, (bf) (Object) var5);
        ((nk) this).field_L.field_p = "";
        ((nk) this).field_L.a(1, field_R, 0);
        ((nk) this).field_L.a(1, field_R, 1);
        ((nk) this).field_L.field_s = (ce) this;
        ((nk) this).field_L.a(var3, (byte) 61, ((nk) this).field_r + -90, 46);
        var3 = var3 + (((nk) this).field_L.field_n + 15);
        ((nk) this).a((ub) (Object) ((nk) this).field_L, (byte) 98);
        int var6 = 4;
        int var7 = 200;
        ((nk) this).field_V.a(110, var3, 40, var7, 496 + -var7 >> 1684940897);
        ((nk) this).field_I.a(125, 15 + var3, 40, 60, 3 + var6);
        ((nk) this).field_I.field_s = (ce) this;
        ((nk) this).field_V.field_s = (ce) this;
        ((nk) this).a((ub) (Object) ((nk) this).field_V, (byte) 108);
        ((nk) this).a((ub) (Object) ((nk) this).field_I, (byte) 121);
        ((nk) this).field_J = new wj((ha) this);
        ((nk) this).field_J.a(118, 20 + ((nk) this).field_G.field_l, 150, -((nk) this).field_G.field_r + (-((nk) this).field_G.field_o + ((nk) this).field_r + -60), ((nk) this).field_G.field_r + ((nk) this).field_G.field_o - -60);
        ((nk) this).a((ub) (Object) ((nk) this).field_J, (byte) 34);
        ((nk) this).a(115, 0, 55 + (var3 - -var6), 496, 0);
    }

    private final boolean a(byte param0, wa param1) {
        dk var3 = null;
        ok var4 = null;
        Object var5 = null;
        int stackIn_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        var3 = param1.a((byte) -106);
        if (var3 != null) {
          var4 = var3.a(true);
          if (hg.field_c == var4) {
            return false;
          } else {
            if (nf.field_c != var4) {
              if (param0 < 59) {
                var5 = null;
                ((nk) this).a((String) null, (byte) -6);
                if (va.field_o != var4) {
                  return true;
                } else {
                  return false;
                }
              } else {
                L0: {
                  if (va.field_o == var4) {
                    stackOut_10_0 = 0;
                    stackIn_11_0 = stackOut_10_0;
                    break L0;
                  } else {
                    stackOut_9_0 = 1;
                    stackIn_11_0 = stackOut_9_0;
                    break L0;
                  }
                }
                return stackIn_11_0 != 0;
              }
            } else {
              return false;
            }
          }
        } else {
          return true;
        }
    }

    public final void a(int param0, ff param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        var6 = wizardrun.field_H;
        if (-1 != (param0 ^ -1)) {
          if (1 != param0) {
            if (-3 == (param0 ^ -1)) {
              fa.a("conduct.ws", 12);
              var5 = -16 % ((36 - param3) / 53);
              return;
            } else {
              var5 = -16 % ((36 - param3) / 53);
              return;
            }
          } else {
            fa.a("privacy.ws", 12);
            var5 = -16 % ((36 - param3) / 53);
            return;
          }
        } else {
          fa.a("terms.ws", 12);
          var5 = -16 % ((36 - param3) / 53);
          return;
        }
    }

    private final String g(byte param0) {
        if (param0 < 1) {
            return null;
        }
        return "</col></u>";
    }

    final boolean a(char param0, int param1, byte param2, ub param3) {
        if (!super.a(param0, param1, (byte) -106, param3)) {
          if ((param1 ^ -1) != -99) {
            if (param1 != 99) {
              if (param2 >= -96) {
                field_N = null;
                return false;
              } else {
                return false;
              }
            } else {
              return ((nk) this).b(param3, 1);
            }
          } else {
            return ((nk) this).a((byte) -117, param3);
          }
        } else {
          return true;
        }
    }

    final void a(int param0, int param1, int param2, ub param3) {
        super.a(param0, param1, param2, param3);
        ((nk) this).field_V.field_B = this.g(param0 + -10000586);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_R = "Open in popup window";
        field_Q = "Names can only contain letters, numbers, spaces and underscores";
        field_U = new bh(12, 0, 1, 0);
        field_K = "Resume Game";
    }
}
