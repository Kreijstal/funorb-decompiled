/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pl extends gb implements jf, n, rg {
    static int field_P;
    private vj field_T;
    private ib field_R;
    private df field_W;
    private ib field_J;
    private eb field_M;
    private eb field_O;
    static long field_Q;
    static int field_L;
    static String field_G;
    static String field_V;
    private ib field_I;
    private ib field_H;
    am field_N;
    private ib field_U;
    private ib field_S;

    final static Object a(byte[] param0, boolean param1, boolean param2) {
        nj var3 = null;
        if (param0 != null) {
          if (!param2) {
            if (param0.length > 136) {
              var3 = new nj();
              ((ke) (Object) var3).a(param0, false);
              return (Object) (Object) var3;
            } else {
              if (param1) {
                return (Object) (Object) li.a(0, param0);
              } else {
                return (Object) (Object) param0;
              }
            }
          } else {
            field_P = -101;
            if (param0.length > 136) {
              var3 = new nj();
              ((ke) (Object) var3).a(param0, false);
              return (Object) (Object) var3;
            } else {
              if (param1) {
                return (Object) (Object) li.a(0, param0);
              } else {
                return (Object) (Object) param0;
              }
            }
          }
        } else {
          return null;
        }
    }

    private final int a(int param0, boolean param1, String param2, gl param3, int param4) {
        j var8 = new j(20, param4, 120 + param0, 25, param3, param1, 120, 3, qk.field_e, 16777215, param2);
        ((pl) this).b((byte) 95, (gl) (Object) var8);
        dd var7 = new dd(((v) (Object) param3).a(29730));
        ((pl) this).b((byte) 95, (gl) (Object) var7);
        var7.a((var8.field_n - 15 >> -2090269535) + var8.field_u, (byte) 113, 15, var8.field_w - -var8.field_p + 3, 15);
        return var8.field_n;
    }

    public pl() {
        super(0, 0, 496, 0, (cj) null);
        ((pl) this).field_J = new ib("", (sc) null, 12);
        ((pl) this).field_S = new ib("", (sc) null, 100);
        ((pl) this).field_I = new ib("", (sc) null, 100);
        ((pl) this).field_H = new ib("", (sc) null, 20);
        ((pl) this).field_U = new ib("", (sc) null, 20);
        ((pl) this).field_R = new ib("", (sc) null, 3);
        int var1 = 1;
        ((pl) this).field_W = new df("", (sc) null, var1 != 0);
        ((pl) this).field_O = new eb(fm.field_a, (sc) null);
        ((pl) this).field_M = new eb(sl.field_f, (sc) null);
        ((pl) this).field_J.field_x = p.field_g;
        ((pl) this).field_S.field_x = tg.field_h;
        ((pl) this).field_I.field_x = ga.field_p;
        ((pl) this).field_H.field_x = ki.field_Y;
        ((pl) this).field_U.field_x = be.field_y;
        ((pl) this).field_R.field_x = bl.field_c;
        ((pl) this).field_W.field_x = hd.field_j;
        ((pl) this).field_J.a((rc) (Object) new ia((ej) (Object) ((pl) this).field_J), 5859);
        ((pl) this).field_S.a((rc) (Object) new fi((ej) (Object) ((pl) this).field_S), 5859);
        ((pl) this).field_I.a((rc) (Object) new ha((ej) (Object) ((pl) this).field_I, (ej) (Object) ((pl) this).field_S), 5859);
        ((pl) this).field_H.a((rc) (Object) new ph((ej) (Object) ((pl) this).field_H, (ej) (Object) ((pl) this).field_J, (ej) (Object) ((pl) this).field_S), 5859);
        ((pl) this).field_U.a((rc) (Object) new mg((ej) (Object) ((pl) this).field_U, (ej) (Object) ((pl) this).field_H), 5859);
        ((pl) this).field_R.a((rc) (Object) new le((ej) (Object) ((pl) this).field_R), 5859);
        ((pl) this).field_O.field_A = false;
        ((pl) this).field_O.field_l = (cj) (Object) new ic();
        ((pl) this).field_M.field_l = (cj) (Object) new qh();
        ((pl) this).field_J.field_l = (cj) (Object) new ng(10000536);
        ((pl) this).field_I.field_l = (cj) (Object) new ng(10000536);
        ((pl) this).field_S.field_l = (cj) (Object) new ng(10000536);
        ((pl) this).field_R.field_l = (cj) (Object) new ng(10000536);
        ((pl) this).field_W.field_l = (cj) (Object) new kj();
        ((pl) this).field_U.field_l = (cj) (Object) new ah(10000536);
        ((pl) this).field_H.field_l = (cj) (Object) new ah(10000536);
        String var2 = ij.a(new String[2], -1, h.field_d);
        int var3 = 20;
        var3 = var3 + this.a(g.field_nb, (gl) (Object) ((pl) this).field_S, 170, 16777215, var3);
        var3 = var3 + (5 + this.a(false, 20, "", (gl) (Object) ((pl) this).field_I, bh.field_h, var3, 170));
        var3 = var3 + this.a(eb.field_E, (gl) (Object) ((pl) this).field_H, 170, 16777215, var3);
        var3 = var3 + (5 + this.a(q.field_Kb, (gl) (Object) ((pl) this).field_U, var3, ej.field_N, 170, 16777215));
        var3 = var3 + (this.a(im.field_b, (gl) (Object) ((pl) this).field_J, var3, ag.field_b, 170, 16777215) + 5);
        var3 = var3 + this.a(170, false, ig.field_d, (gl) (Object) ((pl) this).field_R, var3);
        j var4 = new j(46, var3, ((pl) this).field_p + -90, 25, (gl) (Object) ((pl) this).field_W, true, ((pl) this).field_p + -120, 5, ra.field_l, 11579568, p.field_b);
        ((pl) this).b((byte) 95, (gl) (Object) var4);
        var3 = var3 + var4.field_n;
        fd var5 = new fd(qk.field_e, 0, 0, 0, 0, 16777215, -1, 0, 0, qk.field_e.field_s, -1, 2147483647, true);
        ((pl) this).field_T = new vj(var2, (cj) (Object) var5);
        ((pl) this).field_T.field_x = "";
        ((pl) this).field_T.a(0, ig.field_b, (byte) -104);
        ((pl) this).field_T.a(1, ig.field_b, (byte) -12);
        ((pl) this).field_T.field_r = (sc) this;
        ((pl) this).field_T.b(var3, -57, 46, -90 + ((pl) this).field_p);
        var3 = var3 + (15 + ((pl) this).field_T.field_n);
        ((pl) this).b((byte) 95, (gl) (Object) ((pl) this).field_T);
        int var6 = 4;
        int var7 = 200;
        ((pl) this).field_O.a(var3, (byte) 105, var7, 496 + -var7 >> -8795359, 40);
        ((pl) this).field_M.a(15 + var3, (byte) 95, 60, var6 - -3, 40);
        ((pl) this).field_M.field_r = (sc) this;
        ((pl) this).field_O.field_r = (sc) this;
        ((pl) this).b((byte) 95, (gl) (Object) ((pl) this).field_O);
        ((pl) this).b((byte) 95, (gl) (Object) ((pl) this).field_M);
        ((pl) this).field_N = new am((rg) this);
        ((pl) this).field_N.a(((pl) this).field_J.field_u - -20, (byte) 61, ((pl) this).field_p - ((pl) this).field_J.field_w + (-((pl) this).field_J.field_p - 60), 60 + (((pl) this).field_J.field_w + ((pl) this).field_J.field_p), 150);
        ((pl) this).b((byte) 95, (gl) (Object) ((pl) this).field_N);
        ((pl) this).a(0, (byte) 56, 496, 0, 55 + (var3 + var6));
    }

    public final void a(eb param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        if (param0 != ((pl) this).field_M) {
          if (param0 == ((pl) this).field_O) {
            boolean discarded$2 = this.h((byte) -111);
            var6 = 105 / ((param4 - -5) / 57);
            return;
          } else {
            var6 = 105 / ((param4 - -5) / 57);
            return;
          }
        } else {
          fd.c(-113);
          var6 = 105 / ((param4 - -5) / 57);
          return;
        }
    }

    private final int a(String param0, gl param1, int param2, String param3, int param4, int param5) {
        if (param5 != 16777215) {
          ((pl) this).field_U = null;
          return this.a(false, 35, param0, param1, param3, param2, param4);
        } else {
          return this.a(false, 35, param0, param1, param3, param2, param4);
        }
    }

    final void a(gl param0, int param1, int param2, int param3) {
        super.a(param0, param1, param2, 106);
        if (param3 < 25) {
            return;
        }
        ((pl) this).field_O.field_A = this.i((byte) -85);
    }

    private final boolean h(byte param0) {
        if (!(this.i((byte) -100))) {
            return false;
        }
        int var3 = -84 / ((param0 - -50) / 49);
        int var2 = -1;
        try {
            if (false) throw (NumberFormatException) null;
            var2 = Integer.parseInt(((pl) this).field_R.field_o);
        } catch (NumberFormatException numberFormatException) {
        }
        return vf.a((pl) this, ((pl) this).field_S.field_o, ((pl) this).field_W.field_C, var2, false, ((pl) this).field_J.field_o, ((pl) this).field_H.field_o);
    }

    public final void a(String param0, int param1) {
        int var3 = -6 / ((param1 - 2) / 51);
        ib var4 = ((pl) this).field_J;
        String var5 = param0;
        ((ej) (Object) var4).a(false, (byte) -123, var5);
    }

    private final boolean i(byte param0) {
        int var2 = 0;
        if (this.a((v) (Object) ((pl) this).field_J, (byte) -31)) {
          if (this.a((v) (Object) ((pl) this).field_S, (byte) -39)) {
            if (this.a((v) (Object) ((pl) this).field_I, (byte) -25)) {
              if (this.a((v) (Object) ((pl) this).field_H, (byte) -86)) {
                if (this.a((v) (Object) ((pl) this).field_U, (byte) -125)) {
                  if (!this.a((v) (Object) ((pl) this).field_R, (byte) -73)) {
                    return false;
                  } else {
                    var2 = -127 % ((param0 - 27) / 37);
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

    public final void a(byte param0, vj param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        var6 = Terraphoenix.field_V;
        if (param3 != 0) {
          if (1 != param3) {
            if (2 != param3) {
              var5 = -53 / ((-10 - param0) / 40);
              return;
            } else {
              ld.a((byte) -29, "conduct.ws");
              var5 = -53 / ((-10 - param0) / 40);
              return;
            }
          } else {
            ld.a((byte) -29, "privacy.ws");
            var5 = -53 / ((-10 - param0) / 40);
            return;
          }
        } else {
          ld.a((byte) -29, "terms.ws");
          var5 = -53 / ((-10 - param0) / 40);
          return;
        }
    }

    private final int a(boolean param0, int param1, String param2, gl param3, String param4, int param5, int param6) {
        j var10 = new j(20, param5, 120 + param6, 25, param3, param0, 120, 3, qk.field_e, 16777215, param4);
        ((pl) this).b((byte) 95, (gl) (Object) var10);
        ki var9 = new ki(((v) (Object) param3).a(29730), param2, 126, var10.field_n + param5, 50 + param6, param1);
        var9.field_r = (sc) this;
        ((pl) this).b((byte) 95, (gl) (Object) var9);
        return var9.field_n + var10.field_n;
    }

    private final String h(int param0) {
        if (param0 != 46) {
            field_G = null;
            return "<u=2164A2><col=2164A2>";
        }
        return "<u=2164A2><col=2164A2>";
    }

    private final int a(String param0, gl param1, int param2, int param3, int param4) {
        j var6 = new j(20, param4, 120 + param2, 25, param1, false, 120, 3, qk.field_e, param3, param0);
        ((pl) this).b((byte) 95, (gl) (Object) var6);
        return var6.field_n;
    }

    private final boolean a(v param0, byte param1) {
        rc var3 = null;
        im var4 = null;
        Object var5 = null;
        int stackIn_21_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        if (param1 <= -16) {
          var3 = param0.a(29730);
          if (var3 == null) {
            return true;
          } else {
            var4 = var3.a(-16323);
            if (var4 != qf.field_d) {
              if (var4 == kj.field_d) {
                return false;
              } else {
                L0: {
                  if (var4 == ab.field_d) {
                    stackOut_20_0 = 0;
                    stackIn_21_0 = stackOut_20_0;
                    break L0;
                  } else {
                    stackOut_19_0 = 1;
                    stackIn_21_0 = stackOut_19_0;
                    break L0;
                  }
                }
                return stackIn_21_0 != 0;
              }
            } else {
              return false;
            }
          }
        } else {
          var5 = null;
          Object discarded$2 = pl.a((byte[]) null, false, true);
          var3 = param0.a(29730);
          if (var3 == null) {
            return true;
          } else {
            var4 = var3.a(-16323);
            if (var4 != qf.field_d) {
              if (var4 != kj.field_d) {
                if (var4 != ab.field_d) {
                  return true;
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
    }

    public static void f(byte param0) {
        field_G = null;
        field_V = null;
        if (param0 <= 101) {
            field_G = null;
        }
    }

    public final void a(int param0) {
        Object var3 = null;
        if (param0 != 50) {
          var3 = null;
          ((pl) this).a((gl) null, 45, -116, 19);
          ((ia) (Object) ((pl) this).field_J.a(29730)).g(-4328);
          return;
        } else {
          ((ia) (Object) ((pl) this).field_J.a(29730)).g(-4328);
          return;
        }
    }

    private final String g(byte param0) {
        if (param0 <= 4) {
            return null;
        }
        return "</col></u>";
    }

    final boolean a(char param0, gl param1, int param2, int param3) {
        if (!super.a(param0, param1, param2, param3)) {
          if (98 == param3) {
            return ((pl) this).a(48, param1);
          } else {
            if ((param3 ^ -1) != -100) {
              return false;
            } else {
              return ((pl) this).a(param1, (byte) 121);
            }
          }
        } else {
          return true;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_G = "Clear all enemies out from the area";
        field_V = "Play free version";
    }
}
