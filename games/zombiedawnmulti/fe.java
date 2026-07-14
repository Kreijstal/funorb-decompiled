/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fe extends se implements co, in, jn {
    private on field_I;
    static ja field_U;
    private gn field_O;
    private on field_P;
    static ul field_L;
    private on field_T;
    gl field_J;
    private fj field_H;
    private on field_N;
    private sq field_G;
    static ja[] field_W;
    private gn field_S;
    private on field_M;
    static boolean field_R;
    static String field_Q;
    private on field_V;
    static String field_X;

    public final void a(int param0) {
        ((tp) (Object) ((fe) this).field_V.a((byte) -43)).i(param0 ^ -22725);
        if (param0 == 496) {
            return;
        }
        ((fe) this).field_I = null;
    }

    private final boolean a(kh param0, int param1) {
        j var3 = null;
        re var4 = null;
        if (param1 == 60) {
          var3 = param0.a((byte) -61);
          if (var3 == null) {
            return true;
          } else {
            var4 = var3.d(80);
            if (jq.field_b != var4) {
              if (h.field_H != var4) {
                if (se.field_F == var4) {
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
          }
        } else {
          return true;
        }
    }

    final static void a(byte param0, int param1) {
        br var2 = null;
        int var3 = 0;
        n var4 = null;
        var3 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param0 <= -87) {
          var4 = (n) (Object) nq.field_s.c(86);
          L0: while (true) {
            if (var4 == null) {
              var2 = dc.field_Gb.c(84);
              L1: while (true) {
                if (var2 != null) {
                  mi.b(1, param1);
                  var2 = dc.field_Gb.b(6);
                  continue L1;
                } else {
                  return;
                }
              }
            } else {
              ih.a(var4, 1, param1);
              var4 = (n) (Object) nq.field_s.b(6);
              continue L0;
            }
          }
        } else {
          return;
        }
    }

    public final void a(int param0, int param1, gn param2, int param3, int param4) {
        if (param3 > -83) {
            return;
        }
        if (param2 == ((fe) this).field_O) {
            dq.c(-120);
        } else {
            if (param2 == ((fe) this).field_S) {
                boolean discarded$0 = this.a((byte) -79);
                return;
            }
            return;
        }
    }

    final boolean a(int param0, char param1, cf param2, int param3) {
        if (super.a(param0, param1, param2, param3 ^ 0)) {
          return true;
        } else {
          if (param0 == 98) {
            return ((fe) this).a((byte) -1, param2);
          } else {
            if ((param0 ^ -1) == -100) {
              return ((fe) this).a(param3 + 6267, param2);
            } else {
              if (param3 != -6208) {
                ((fe) this).field_O = null;
                return false;
              } else {
                return false;
              }
            }
          }
        }
    }

    final void a(int param0, cf param1, int param2, int param3) {
        super.a(param0, param1, param2, param3);
        ((fe) this).field_S.field_F = this.h(-38);
    }

    public final void a(int param0, sq param1, int param2, int param3) {
        int var6 = 0;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        if (-1 != (param3 ^ -1)) {
          if (param3 == 1) {
            ge.a("privacy.ws", (byte) 125);
            if (param2 < -16) {
              return;
            } else {
              ((fe) this).field_V = null;
              return;
            }
          } else {
            if ((param3 ^ -1) == -3) {
              ge.a("conduct.ws", (byte) 127);
              if (param2 < -16) {
                return;
              } else {
                ((fe) this).field_V = null;
                return;
              }
            } else {
              if (param2 < -16) {
                return;
              } else {
                ((fe) this).field_V = null;
                return;
              }
            }
          }
        } else {
          ge.a("terms.ws", (byte) 127);
          if (param2 < -16) {
            return;
          } else {
            ((fe) this).field_V = null;
            return;
          }
        }
    }

    private final String g(byte param0) {
        if (param0 != -109) {
            field_W = null;
            return "</col></u>";
        }
        return "</col></u>";
    }

    private final String h(byte param0) {
        int var2 = -43 % ((param0 - 45) / 39);
        return "<u=2164A2><col=2164A2>";
    }

    private final int a(String param0, String param1, int param2, int param3, cf param4, int param5) {
        if (param5 != 35) {
            return -57;
        }
        return this.a(35, true, param4, param1, param0, param2, param3);
    }

    public static void c(boolean param0) {
        field_X = null;
        field_U = null;
        if (param0) {
          fe.c(true);
          field_W = null;
          field_L = null;
          field_Q = null;
          return;
        } else {
          field_W = null;
          field_L = null;
          field_Q = null;
          return;
        }
    }

    private final boolean a(byte param0) {
        if (!(this.h(-122))) {
            return false;
        }
        if (param0 >= -30) {
            field_R = true;
        }
        int var2 = -1;
        try {
            if (false) throw (NumberFormatException) null;
            var2 = Integer.parseInt(((fe) this).field_N.field_j);
        } catch (NumberFormatException numberFormatException) {
        }
        return cc.a(((fe) this).field_P.field_j, ((fe) this).field_V.field_j, ((fe) this).field_M.field_j, var2, -10663, (fe) this, ((fe) this).field_H.field_G);
    }

    private final int a(cf param0, int param1, int param2, String param3, int param4) {
        el var9 = new el(20, param4, 120 - -param2, 25, param0, false, 120, 3, ke.field_h, 16777215, param3);
        ((fe) this).b((byte) 45, (cf) (Object) var9);
        uk var7 = new uk(((kh) (Object) param0).a((byte) -109));
        ((fe) this).b((byte) 57, (cf) (Object) var7);
        var7.b(3 + (var9.field_y + var9.field_n), (var9.field_w - 15 >> -2044203743) + var9.field_i, 28972, 15, 15);
        int var8 = -40 / ((param1 - 34) / 43);
        return var9.field_w;
    }

    private final boolean h(int param0) {
        Object var3 = null;
        if (this.a((kh) (Object) ((fe) this).field_V, 60)) {
          if (this.a((kh) (Object) ((fe) this).field_M, 60)) {
            if (this.a((kh) (Object) ((fe) this).field_T, 60)) {
              if (this.a((kh) (Object) ((fe) this).field_P, 60)) {
                if (this.a((kh) (Object) ((fe) this).field_I, 60)) {
                  if (this.a((kh) (Object) ((fe) this).field_N, 60)) {
                    if (param0 >= -20) {
                      var3 = null;
                      int discarded$2 = this.a((cf) null, -84, -24, (String) null, -8);
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

    public final void a(String param0, int param1) {
        on var3 = null;
        String var4 = null;
        var3 = ((fe) this).field_V;
        if (param1 != 1) {
          ((fe) this).field_V = null;
          var4 = param0;
          ((pm) (Object) var3).a(false, var4, (byte) 103);
          return;
        } else {
          var4 = param0;
          ((pm) (Object) var3).a(false, var4, (byte) 103);
          return;
        }
    }

    private final int a(int param0, boolean param1, cf param2, String param3, String param4, int param5, int param6) {
        km var9 = null;
        el var10 = null;
        var10 = new el(20, param5, 120 + param6, 25, param2, false, 120, 3, ke.field_h, 16777215, param3);
        if (!param1) {
          ((fe) this).field_J = null;
          ((fe) this).b((byte) 86, (cf) (Object) var10);
          var9 = new km(((kh) (Object) param2).a((byte) -109), param4, 126, param5 + var10.field_w, 50 + param6, param0);
          var9.field_A = (bj) this;
          ((fe) this).b((byte) 49, (cf) (Object) var9);
          return var9.field_w + var10.field_w;
        } else {
          ((fe) this).b((byte) 86, (cf) (Object) var10);
          var9 = new km(((kh) (Object) param2).a((byte) -109), param4, 126, param5 + var10.field_w, 50 + param6, param0);
          var9.field_A = (bj) this;
          ((fe) this).b((byte) 49, (cf) (Object) var9);
          return var9.field_w + var10.field_w;
        }
    }

    private final int a(int param0, cf param1, int param2, int param3, String param4) {
        el var6 = null;
        var6 = new el(20, param2, param0 + 120, 25, param1, false, 120, 3, ke.field_h, 16777215, param4);
        ((fe) this).b((byte) 86, (cf) (Object) var6);
        if (param3 <= 38) {
          return 45;
        } else {
          return var6.field_w;
        }
    }

    public fe() {
        super(0, 0, 496, 0, (nl) null);
        ((fe) this).field_V = new on("", (bj) null, 12);
        ((fe) this).field_M = new on("", (bj) null, 100);
        ((fe) this).field_T = new on("", (bj) null, 100);
        ((fe) this).field_P = new on("", (bj) null, 20);
        ((fe) this).field_I = new on("", (bj) null, 20);
        ((fe) this).field_N = new on("", (bj) null, 3);
        int var1 = 1;
        ((fe) this).field_H = new fj("", (bj) null, var1 != 0);
        ((fe) this).field_S = new gn(ip.field_a, (bj) null);
        ((fe) this).field_O = new gn(oq.field_v, (bj) null);
        ((fe) this).field_V.field_x = bi.field_d;
        ((fe) this).field_M.field_x = mo.field_Nb;
        ((fe) this).field_T.field_x = o.field_d;
        ((fe) this).field_P.field_x = ki.field_f;
        ((fe) this).field_I.field_x = bh.field_e;
        ((fe) this).field_N.field_x = dl.field_g;
        ((fe) this).field_H.field_x = ip.field_b;
        ((fe) this).field_V.a((byte) -27, (j) (Object) new tp((pm) (Object) ((fe) this).field_V));
        ((fe) this).field_M.a((byte) -27, (j) (Object) new hm((pm) (Object) ((fe) this).field_M));
        ((fe) this).field_T.a((byte) -27, (j) (Object) new hd((pm) (Object) ((fe) this).field_T, (pm) (Object) ((fe) this).field_M));
        ((fe) this).field_P.a((byte) -27, (j) (Object) new ia((pm) (Object) ((fe) this).field_P, (pm) (Object) ((fe) this).field_V, (pm) (Object) ((fe) this).field_M));
        ((fe) this).field_I.a((byte) -27, (j) (Object) new qp((pm) (Object) ((fe) this).field_I, (pm) (Object) ((fe) this).field_P));
        ((fe) this).field_N.a((byte) -27, (j) (Object) new bp((pm) (Object) ((fe) this).field_N));
        ((fe) this).field_S.field_F = false;
        ((fe) this).field_S.field_h = (nl) (Object) new oq();
        ((fe) this).field_O.field_h = (nl) (Object) new he();
        ((fe) this).field_V.field_h = (nl) (Object) new tb(10000536);
        ((fe) this).field_T.field_h = (nl) (Object) new tb(10000536);
        ((fe) this).field_M.field_h = (nl) (Object) new tb(10000536);
        ((fe) this).field_N.field_h = (nl) (Object) new tb(10000536);
        ((fe) this).field_H.field_h = (nl) (Object) new ib();
        ((fe) this).field_I.field_h = (nl) (Object) new m(10000536);
        ((fe) this).field_P.field_h = (nl) (Object) new m(10000536);
        String var2 = vl.a(wa.field_d, new String[2], 2);
        int var3 = 20;
        var3 = var3 + this.a(170, (cf) (Object) ((fe) this).field_M, var3, 73, da.field_i);
        var3 = var3 + (5 + this.a(20, true, (cf) (Object) ((fe) this).field_T, cq.field_d, "", var3, 170));
        var3 = var3 + this.a(170, (cf) (Object) ((fe) this).field_P, var3, 47, gn.field_D);
        var3 = var3 + (5 + this.a(oi.field_f, bd.field_b, var3, 170, (cf) (Object) ((fe) this).field_I, 35));
        var3 = var3 + (this.a(r.field_e, ia.field_w, var3, 170, (cf) (Object) ((fe) this).field_V, 35) + 5);
        var3 = var3 + this.a((cf) (Object) ((fe) this).field_N, -99, 170, gj.field_a, var3);
        el var4 = new el(46, var3, -90 + ((fe) this).field_n, 25, (cf) (Object) ((fe) this).field_H, true, -120 + ((fe) this).field_n, 5, cp.field_H, 11579568, uq.field_e);
        ((fe) this).b((byte) 115, (cf) (Object) var4);
        var3 = var3 + var4.field_w;
        hq var5 = new hq(ke.field_h, 0, 0, 0, 0, 16777215, -1, 0, 0, ke.field_h.field_C, -1, 2147483647, true);
        ((fe) this).field_G = new sq(var2, (nl) (Object) var5);
        ((fe) this).field_G.field_x = "";
        ((fe) this).field_G.a(0, (byte) -104, mp.field_d);
        ((fe) this).field_G.a(1, (byte) -127, mp.field_d);
        ((fe) this).field_G.field_A = (bj) this;
        ((fe) this).field_G.a(((fe) this).field_n - 90, var3, (byte) -4, 46);
        var3 = var3 + (((fe) this).field_G.field_w + 15);
        ((fe) this).b((byte) 61, (cf) (Object) ((fe) this).field_G);
        int var6 = 4;
        int var7 = 200;
        ((fe) this).field_S.b(496 - var7 >> -193973567, var3, 28972, var7, 40);
        ((fe) this).field_O.b(3 + var6, var3 + 15, 28972, 60, 40);
        ((fe) this).field_O.field_A = (bj) this;
        ((fe) this).field_S.field_A = (bj) this;
        ((fe) this).b((byte) 78, (cf) (Object) ((fe) this).field_S);
        ((fe) this).b((byte) 75, (cf) (Object) ((fe) this).field_O);
        ((fe) this).field_J = new gl((jn) this);
        ((fe) this).field_J.b(60 + ((fe) this).field_V.field_n + ((fe) this).field_V.field_y, 20 + ((fe) this).field_V.field_i, 28972, -60 + (-((fe) this).field_V.field_n + (((fe) this).field_n - ((fe) this).field_V.field_y)), 150);
        ((fe) this).b((byte) 97, (cf) (Object) ((fe) this).field_J);
        ((fe) this).b(0, 0, 28972, 496, var3 - -55 + var6);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Q = "Enter name of friend to delete from list";
        field_X = "Your zombies will resist 40% of all powerups...even if they're yours!";
    }
}
