/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qh extends ee implements pe, pl, ta {
    static gk field_F;
    private hc field_N;
    private hc field_R;
    private hc field_G;
    vh field_K;
    private hc field_H;
    private hc field_M;
    private hc field_I;
    static int field_J;
    private vf field_E;
    static dm[] field_O;
    private hk field_D;
    static boolean[] field_C;
    private vi field_P;
    static String field_Q;
    static String field_S;
    private hk field_L;

    private final int a(int param0, String param1, int param2, el param3, int param4) {
        hd var6 = null;
        if (param4 != 5) {
          return 0;
        } else {
          var6 = new hd(20, param0, 120 + param2, 25, param3, false, 120, 3, ng.field_F, 16777215, param1);
          ((qh) this).b((byte) -114, (el) (Object) var6);
          return var6.field_h;
        }
    }

    private final int a(el param0, int param1, String param2, int param3, String param4, int param5, byte param6) {
        hd var11 = new hd(20, param5, 120 - -param1, 25, param0, false, 120, 3, ng.field_F, 16777215, param2);
        ((qh) this).b((byte) -128, (el) (Object) var11);
        pi var9 = new pi(((nl) (Object) param0).a((byte) -101), param4, 126, param5 - -var11.field_h, param1 - -50, param3);
        var9.field_u = (bb) this;
        ((qh) this).b((byte) -127, (el) (Object) var9);
        int var10 = 38 / ((-14 - param6) / 46);
        return var9.field_h + var11.field_h;
    }

    public qh() {
        super(0, 0, 496, 0, (dh) null);
        ((qh) this).field_H = new hc("", (bb) null, 12);
        ((qh) this).field_I = new hc("", (bb) null, 100);
        ((qh) this).field_G = new hc("", (bb) null, 100);
        ((qh) this).field_M = new hc("", (bb) null, 20);
        ((qh) this).field_N = new hc("", (bb) null, 20);
        ((qh) this).field_R = new hc("", (bb) null, 3);
        int var1 = 1;
        ((qh) this).field_P = new vi("", (bb) null, var1 != 0);
        ((qh) this).field_D = new hk(di.field_c, (bb) null);
        ((qh) this).field_L = new hk(hc.field_U, (bb) null);
        ((qh) this).field_H.field_j = ud.field_a;
        ((qh) this).field_I.field_j = ll.field_c;
        ((qh) this).field_G.field_j = ok.field_i;
        ((qh) this).field_M.field_j = ij.field_Y;
        ((qh) this).field_N.field_j = oi.field_c;
        ((qh) this).field_R.field_j = pb.field_o;
        ((qh) this).field_P.field_j = vi.field_G;
        ((qh) this).field_H.a((byte) -27, (dg) (Object) new uk((dj) (Object) ((qh) this).field_H));
        ((qh) this).field_I.a((byte) -111, (dg) (Object) new ag((dj) (Object) ((qh) this).field_I));
        ((qh) this).field_G.a((byte) 126, (dg) (Object) new mk((dj) (Object) ((qh) this).field_G, (dj) (Object) ((qh) this).field_I));
        ((qh) this).field_M.a((byte) 83, (dg) (Object) new g((dj) (Object) ((qh) this).field_M, (dj) (Object) ((qh) this).field_H, (dj) (Object) ((qh) this).field_I));
        ((qh) this).field_N.a((byte) -71, (dg) (Object) new n((dj) (Object) ((qh) this).field_N, (dj) (Object) ((qh) this).field_M));
        ((qh) this).field_R.a((byte) -116, (dg) (Object) new cf((dj) (Object) ((qh) this).field_R));
        ((qh) this).field_D.field_D = false;
        ((qh) this).field_D.field_q = (dh) (Object) new ml();
        ((qh) this).field_L.field_q = (dh) (Object) new fh();
        ((qh) this).field_H.field_q = (dh) (Object) new ac(10000536);
        ((qh) this).field_G.field_q = (dh) (Object) new ac(10000536);
        ((qh) this).field_I.field_q = (dh) (Object) new ac(10000536);
        ((qh) this).field_R.field_q = (dh) (Object) new ac(10000536);
        ((qh) this).field_P.field_q = (dh) (Object) new oc();
        ((qh) this).field_N.field_q = (dh) (Object) new uh(10000536);
        ((qh) this).field_M.field_q = (dh) (Object) new uh(10000536);
        String var2 = wj.a(bm.field_p, new String[2], (byte) -72);
        int var3 = 20;
        var3 = var3 + this.a(var3, ug.field_b, 170, (el) (Object) ((qh) this).field_I, 5);
        var3 = var3 + (5 + this.a((el) (Object) ((qh) this).field_G, 170, ok.field_e, 20, "", var3, (byte) -65));
        var3 = var3 + this.a(var3, qg.field_b, 170, (el) (Object) ((qh) this).field_M, 5);
        var3 = var3 + (this.a(-99, (el) (Object) ((qh) this).field_N, v.field_m, var3, 170, field_Q) + 5);
        var3 = var3 + (this.a(-103, (el) (Object) ((qh) this).field_H, wj.field_E, var3, 170, gk.field_c) + 5);
        var3 = var3 + this.a(var3, 170, (el) (Object) ((qh) this).field_R, ue.field_g, (byte) -127);
        hd var4 = new hd(46, var3, ((qh) this).field_r - 90, 25, (el) (Object) ((qh) this).field_P, true, ((qh) this).field_r + -120, 5, hh.field_d, 11579568, ue.field_d);
        ((qh) this).b((byte) -106, (el) (Object) var4);
        var3 = var3 + var4.field_h;
        ff var5 = new ff(ng.field_F, 0, 0, 0, 0, 16777215, -1, 0, 0, ng.field_F.field_o, -1, 2147483647, true);
        ((qh) this).field_E = new vf(var2, (dh) (Object) var5);
        ((qh) this).field_E.field_j = "";
        ((qh) this).field_E.a(0, -42, eh.field_a);
        ((qh) this).field_E.a(1, -62, eh.field_a);
        ((qh) this).field_E.field_u = (bb) this;
        ((qh) this).field_E.b(46, 0, var3, -90 + ((qh) this).field_r);
        var3 = var3 + (((qh) this).field_E.field_h + 15);
        ((qh) this).b((byte) -73, (el) (Object) ((qh) this).field_E);
        int var6 = 4;
        int var7 = 200;
        ((qh) this).field_D.a(40, var7, (byte) -53, var3, -var7 + 496 >> 1424677729);
        ((qh) this).field_L.a(40, 60, (byte) -118, var3 + 15, 3 + var6);
        ((qh) this).field_L.field_u = (bb) this;
        ((qh) this).field_D.field_u = (bb) this;
        ((qh) this).b((byte) -83, (el) (Object) ((qh) this).field_D);
        ((qh) this).b((byte) -108, (el) (Object) ((qh) this).field_L);
        ((qh) this).field_K = new vh((ta) this);
        ((qh) this).field_K.a(150, -((qh) this).field_H.field_v + ((qh) this).field_r - ((qh) this).field_H.field_r + -60, (byte) -13, 20 + ((qh) this).field_H.field_m, 60 + (((qh) this).field_H.field_r + ((qh) this).field_H.field_v));
        ((qh) this).b((byte) -113, (el) (Object) ((qh) this).field_K);
        ((qh) this).a(55 + var3 - -var6, 496, (byte) -65, 0, 0);
    }

    private final boolean g(int param0) {
        if (!this.f(param0 ^ -19038)) {
            return false;
        }
        int var2 = -1;
        if (param0 != -21440) {
            field_C = null;
        }
        try {
            if (false) throw (NumberFormatException) null;
            var2 = Integer.parseInt(((qh) this).field_R.field_s);
        } catch (NumberFormatException numberFormatException) {
        }
        return mc.a(((qh) this).field_H.field_s, ((qh) this).field_I.field_s, var2, (qh) this, 0, ((qh) this).field_P.field_y, ((qh) this).field_M.field_s);
    }

    final static mb i(int param0) {
        String var1 = null;
        var1 = al.b(0);
        if (param0 != 25) {
          L0: {
            field_J = 84;
            if (var1 == null) {
              break L0;
            } else {
              if (-1 < var1.indexOf('@')) {
                break L0;
              } else {
                var1 = "";
                break L0;
              }
            }
          }
          return new mb(al.b(0), rl.n(-1071908447));
        } else {
          L1: {
            if (var1 == null) {
              break L1;
            } else {
              if (-1 > var1.indexOf('@')) {
                break L1;
              } else {
                var1 = "";
                break L1;
              }
            }
          }
          return new mb(al.b(0), rl.n(-1071908447));
        }
    }

    private final int a(int param0, int param1, el param2, String param3, byte param4) {
        td var7 = null;
        hd var8 = null;
        var8 = new hd(20, param0, param1 + 120, 25, param2, false, 120, 3, ng.field_F, 16777215, param3);
        ((qh) this).b((byte) -120, (el) (Object) var8);
        var7 = new td(((nl) (Object) param2).a((byte) -124));
        ((qh) this).b((byte) -79, (el) (Object) var7);
        if (param4 > -123) {
          String discarded$1 = this.b(false);
          var7.a(15, 15, (byte) -22, var8.field_m + (-15 + var8.field_h >> 503004417), 3 + var8.field_r + var8.field_v);
          return var8.field_h;
        } else {
          var7.a(15, 15, (byte) -22, var8.field_m + (-15 + var8.field_h >> 503004417), 3 + var8.field_r + var8.field_v);
          return var8.field_h;
        }
    }

    public final void a(vf param0, int param1, int param2, int param3) {
        int var6 = 0;
        var6 = Geoblox.field_C;
        if (0 != param1) {
          if ((param1 ^ -1) != -2) {
            if (param1 == 2) {
              uk.a(false, "conduct.ws");
              if (param2 != 2) {
                ((qh) this).field_N = null;
                return;
              } else {
                return;
              }
            } else {
              if (param2 != 2) {
                ((qh) this).field_N = null;
                return;
              } else {
                return;
              }
            }
          } else {
            uk.a(false, "privacy.ws");
            if (param2 == 2) {
              return;
            } else {
              ((qh) this).field_N = null;
              return;
            }
          }
        } else {
          uk.a(false, "terms.ws");
          if (param2 == 2) {
            return;
          } else {
            ((qh) this).field_N = null;
            return;
          }
        }
    }

    final static void h(byte param0) {
        hb.field_j = f.p(125);
        int var1 = -117 / ((12 - param0) / 57);
        kd.field_e = new ng();
        b.a(true, true, false);
    }

    private final String c(boolean param0) {
        if (param0) {
            field_J = 75;
            return "</col></u>";
        }
        return "</col></u>";
    }

    public final void a(int param0, byte param1, int param2, int param3, hk param4) {
        if (param4 == ((qh) this).field_L) {
          qc.g(0);
          if (param1 != -20) {
            field_O = null;
            return;
          } else {
            return;
          }
        } else {
          if (((qh) this).field_D == param4) {
            boolean discarded$3 = this.g(-21440);
            if (param1 == -20) {
              return;
            } else {
              field_O = null;
              return;
            }
          } else {
            if (param1 == -20) {
              return;
            } else {
              field_O = null;
              return;
            }
          }
        }
    }

    private final boolean a(byte param0, nl param1) {
        dg var3 = null;
        lh var4 = null;
        Object var5 = null;
        var3 = param1.a((byte) -106);
        if (var3 == null) {
          return true;
        } else {
          var4 = var3.a((byte) -105);
          if (si.field_m == var4) {
            return false;
          } else {
            if (param0 < -73) {
              if (bf.field_g == var4) {
                return false;
              } else {
                if (var4 == oj.field_d) {
                  return false;
                } else {
                  return true;
                }
              }
            } else {
              var5 = null;
              boolean discarded$4 = this.a((byte) 82, (nl) null);
              if (bf.field_g == var4) {
                return false;
              } else {
                if (var4 == oj.field_d) {
                  return false;
                } else {
                  return true;
                }
              }
            }
          }
        }
    }

    public static void h(int param0) {
        field_Q = null;
        field_O = null;
        if (param0 != 0) {
          field_Q = null;
          field_C = null;
          field_S = null;
          field_F = null;
          return;
        } else {
          field_C = null;
          field_S = null;
          field_F = null;
          return;
        }
    }

    private final boolean f(int param0) {
        if (this.a((byte) -104, (nl) (Object) ((qh) this).field_H)) {
          if (this.a((byte) -118, (nl) (Object) ((qh) this).field_I)) {
            if (this.a((byte) -108, (nl) (Object) ((qh) this).field_G)) {
              if (this.a((byte) -103, (nl) (Object) ((qh) this).field_M)) {
                if (this.a((byte) -117, (nl) (Object) ((qh) this).field_N)) {
                  if (this.a((byte) -128, (nl) (Object) ((qh) this).field_R)) {
                    if (param0 != 6626) {
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
          return false;
        }
    }

    public final void a(String param0, int param1) {
        hc var3 = ((qh) this).field_H;
        String var4 = param0;
        if (param1 != 20) {
            return;
        }
        ((dj) (Object) var3).a(-121, var4, false);
    }

    private final String b(boolean param0) {
        if (param0) {
            return null;
        }
        return "<u=2164A2><col=2164A2>";
    }

    final boolean a(int param0, int param1, char param2, el param3) {
        if (!(!super.a(param0, param1 ^ 0, param2, param3))) {
            return true;
        }
        if (!(98 != param0)) {
            return ((qh) this).a(7305, param3);
        }
        if (param1 != 13) {
            field_Q = null;
            if (99 == param0) {
                return ((qh) this).a(param3, -125);
            }
            return false;
        }
        if (!(99 != param0)) {
            return ((qh) this).a(param3, -125);
        }
        return false;
    }

    private final int a(int param0, el param1, String param2, int param3, int param4, String param5) {
        if (param0 > -66) {
            return -10;
        }
        return this.a(param1, param4, param2, 35, param5, param3, (byte) -121);
    }

    public final void a(byte param0) {
        ((uk) (Object) ((qh) this).field_H.a((byte) -128)).c((byte) -89);
        if (param0 != 83) {
            ((qh) this).a((byte) -25);
        }
    }

    final void a(boolean param0, int param1, el param2, int param3) {
        super.a(param0, param1, param2, param3);
        ((qh) this).field_D.field_D = this.f(6626);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_F = new gk();
        field_S = "Unfortunately, you've failed the tutorial. In Geoblox you lose if any geoblox stuck to your avatar reach the edge of the rotating play area. You can either choose to replay the tutorial or, if you feel confident, you can proceed to the proper game.<br>Press <img=2> to continue to the game. Press <img=5> to replay the tutorial.";
        field_Q = "Passwords must be between 5 and 20 letters and numbers";
    }
}
