/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class fk extends hp implements oa, hh, ri {
    private ic field_M;
    private an field_H;
    private ic field_P;
    private ic field_N;
    private hm field_J;
    kn field_I;
    private an field_L;
    static sd field_F;
    private ic field_G;
    private ic field_R;
    static vn field_K;
    private ic field_Q;
    private fm field_O;

    private final boolean f(byte param0) {
        if (!this.j(40)) {
            return false;
        }
        int var2 = -1;
        if (param0 >= -108) {
            return true;
        }
        try {
            if (false) throw (NumberFormatException) null;
            var2 = Integer.parseInt(((fk) this).field_R.field_o);
        } catch (NumberFormatException numberFormatException) {
        }
        return kl.a(((fk) this).field_P.field_o, 640, (fk) this, ((fk) this).field_N.field_o, var2, ((fk) this).field_G.field_o, ((fk) this).field_O.field_x);
    }

    final boolean a(int param0, int param1, ga param2, char param3) {
        int var5 = 0;
        if (!super.a(-120, param1, param2, param3)) {
          var5 = 61 / ((-83 - param0) / 32);
          if (98 != param1) {
            if (99 != param1) {
              return false;
            } else {
              return ((fk) this).a(1, param2);
            }
          } else {
            return ((fk) this).b((byte) 119, param2);
          }
        } else {
          return true;
        }
    }

    public final void a(int param0) {
        int var2 = 107 / ((39 - param0) / 49);
        ((ql) (Object) ((fk) this).field_N.a(0)).e(-28769);
    }

    private final boolean j(int param0) {
        if (param0 == 40) {
          if (this.a((byte) 77, (mi) (Object) ((fk) this).field_N)) {
            if (this.a((byte) 77, (mi) (Object) ((fk) this).field_G)) {
              if (this.a((byte) 77, (mi) (Object) ((fk) this).field_M)) {
                if (this.a((byte) 77, (mi) (Object) ((fk) this).field_P)) {
                  if (this.a((byte) 77, (mi) (Object) ((fk) this).field_Q)) {
                    if (!this.a((byte) 77, (mi) (Object) ((fk) this).field_R)) {
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
          ((fk) this).field_L = null;
          if (this.a((byte) 77, (mi) (Object) ((fk) this).field_N)) {
            if (this.a((byte) 77, (mi) (Object) ((fk) this).field_G)) {
              if (this.a((byte) 77, (mi) (Object) ((fk) this).field_M)) {
                if (this.a((byte) 77, (mi) (Object) ((fk) this).field_P)) {
                  if (this.a((byte) 77, (mi) (Object) ((fk) this).field_Q)) {
                    if (!this.a((byte) 77, (mi) (Object) ((fk) this).field_R)) {
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

    private final String i(int param0) {
        if (param0 != 60) {
            field_F = null;
            return "<u=2164A2><col=2164A2>";
        }
        return "<u=2164A2><col=2164A2>";
    }

    private final int a(String param0, int param1, ga param2, int param3, int param4) {
        q var6 = new q(20, param3, param4 + param1, 25, param2, false, 120, 3, ia.field_e, 16777215, param0);
        ((fk) this).a((ga) (Object) var6, 10);
        return var6.field_n;
    }

    private final int a(int param0, int param1, int param2, String param3, ga param4) {
        np var7 = null;
        q var8 = null;
        var8 = new q(20, param1, param2 + 120, 25, param4, false, 120, 3, ia.field_e, 16777215, param3);
        ((fk) this).a((ga) (Object) var8, 10);
        var7 = new np(((mi) (Object) param4).a(0));
        ((fk) this).a((ga) (Object) var7, 10);
        if (param0 > -44) {
          boolean discarded$1 = this.f((byte) -123);
          var7.a(76, (-15 + var8.field_n >> 783511297) + var8.field_j, 3 + var8.field_k - -var8.field_i, 15, 15);
          return var8.field_n;
        } else {
          var7.a(76, (-15 + var8.field_n >> 783511297) + var8.field_j, 3 + var8.field_k - -var8.field_i, 15, 15);
          return var8.field_n;
        }
    }

    public static void e(byte param0) {
        field_K = null;
        if (param0 != -31) {
            return;
        }
        field_F = null;
    }

    final void a(ga param0, byte param1, int param2, int param3) {
        super.a(param0, (byte) -92, param2, param3);
        int var5 = 40 % ((46 - param1) / 42);
        ((fk) this).field_L.field_C = this.j(40);
    }

    public final void a(hm param0, int param1, int param2, int param3) {
        int var6 = 0;
        var6 = ZombieDawn.field_J;
        if (param1 == 120) {
          if (-1 != param2) {
            if ((param2 ^ -1) != -2) {
              if (2 != param2) {
                return;
              } else {
                nf.a(12, "conduct.ws");
                return;
              }
            } else {
              nf.a(12, "privacy.ws");
              return;
            }
          } else {
            nf.a(12, "terms.ws");
            return;
          }
        } else {
          ((fk) this).field_Q = null;
          if (-1 != (param2 ^ -1)) {
            if (param2 != -2) {
              if (2 != param2) {
                return;
              } else {
                nf.a(12, "conduct.ws");
                return;
              }
            } else {
              nf.a(12, "privacy.ws");
              return;
            }
          } else {
            nf.a(12, "terms.ws");
            return;
          }
        }
    }

    public final void a(int param0, int param1, an param2, int param3, int param4) {
        if (param1 == -6) {
          if (param2 != ((fk) this).field_H) {
            if (param2 == ((fk) this).field_L) {
              boolean discarded$2 = this.f((byte) -125);
              return;
            } else {
              return;
            }
          } else {
            ZombieDawn.q(-10401);
            return;
          }
        } else {
          return;
        }
    }

    private final int a(int param0, ga param1, String param2, String param3, int param4, int param5) {
        Object var8 = null;
        if (param4 != -24519) {
          var8 = null;
          ((fk) this).a((byte) 41, (String) null);
          return this.a(param1, 0, param0, param2, 35, param5, param3);
        } else {
          return this.a(param1, 0, param0, param2, 35, param5, param3);
        }
    }

    private final int a(ga param0, int param1, int param2, String param3, int param4, int param5, String param6) {
        q var10 = new q(20, param2, 120 + param5, 25, param0, false, 120, 3, ia.field_e, 16777215, param6);
        ((fk) this).a((ga) (Object) var10, 10);
        wf var9 = new wf(((mi) (Object) param0).a(param1 ^ param1), param3, 126, param2 + var10.field_n, param5 + 50, param4);
        var9.field_v = (sk) this;
        ((fk) this).a((ga) (Object) var9, 10);
        return var9.field_n + var10.field_n;
    }

    private final String h(int param0) {
        if (param0 < 84) {
            return null;
        }
        return "</col></u>";
    }

    public final void a(byte param0, String param1) {
        int var5 = 81 / ((param0 - -40) / 48);
        ic var3 = ((fk) this).field_N;
        String var4 = param1;
        ((tb) (Object) var3).a(false, false, var4);
    }

    public fk() {
        super(0, 0, 496, 0, (io) null);
        ((fk) this).field_N = new ic("", (sk) null, 12);
        ((fk) this).field_G = new ic("", (sk) null, 100);
        ((fk) this).field_M = new ic("", (sk) null, 100);
        ((fk) this).field_P = new ic("", (sk) null, 20);
        ((fk) this).field_Q = new ic("", (sk) null, 20);
        ((fk) this).field_R = new ic("", (sk) null, 3);
        int var1 = 1;
        ((fk) this).field_O = new fm("", (sk) null, var1 != 0);
        ((fk) this).field_L = new an(al.field_c, (sk) null);
        ((fk) this).field_H = new an(vl.field_f, (sk) null);
        ((fk) this).field_N.field_s = sn.field_d;
        ((fk) this).field_G.field_s = c.field_a;
        ((fk) this).field_M.field_s = hi.field_pb;
        ((fk) this).field_P.field_s = gm.field_f;
        ((fk) this).field_Q.field_s = qo.field_t;
        ((fk) this).field_R.field_s = lm.field_D;
        ((fk) this).field_O.field_s = kf.field_V;
        ((fk) this).field_N.a(-73, (vc) (Object) new ql((tb) (Object) ((fk) this).field_N));
        ((fk) this).field_G.a(127, (vc) (Object) new mc((tb) (Object) ((fk) this).field_G));
        ((fk) this).field_M.a(-110, (vc) (Object) new lk((tb) (Object) ((fk) this).field_M, (tb) (Object) ((fk) this).field_G));
        ((fk) this).field_P.a(79, (vc) (Object) new kg((tb) (Object) ((fk) this).field_P, (tb) (Object) ((fk) this).field_N, (tb) (Object) ((fk) this).field_G));
        ((fk) this).field_Q.a(24, (vc) (Object) new fj((tb) (Object) ((fk) this).field_Q, (tb) (Object) ((fk) this).field_P));
        ((fk) this).field_R.a(-87, (vc) (Object) new kb((tb) (Object) ((fk) this).field_R));
        ((fk) this).field_L.field_C = false;
        ((fk) this).field_L.field_h = (io) (Object) new vm();
        ((fk) this).field_H.field_h = (io) (Object) new dp();
        ((fk) this).field_N.field_h = (io) (Object) new tc(10000536);
        ((fk) this).field_M.field_h = (io) (Object) new tc(10000536);
        ((fk) this).field_G.field_h = (io) (Object) new tc(10000536);
        ((fk) this).field_R.field_h = (io) (Object) new tc(10000536);
        ((fk) this).field_O.field_h = (io) (Object) new jb();
        ((fk) this).field_Q.field_h = (io) (Object) new jm(10000536);
        ((fk) this).field_P.field_h = (io) (Object) new jm(10000536);
        String var2 = s.a(1938762664, jb.field_d, new String[2]);
        int var3 = 20;
        var3 = var3 + this.a(dk.field_Vb, 120, (ga) (Object) ((fk) this).field_G, var3, 170);
        var3 = var3 + (5 + this.a((ga) (Object) ((fk) this).field_M, 0, var3, "", 20, 170, aa.field_g));
        var3 = var3 + this.a(ui.field_c, 120, (ga) (Object) ((fk) this).field_P, var3, 170);
        var3 = var3 + (this.a(var3, (ga) (Object) ((fk) this).field_Q, jj.field_J, gk.field_I, -24519, 170) - -5);
        var3 = var3 + (this.a(var3, (ga) (Object) ((fk) this).field_N, a.field_l, b.field_i, -24519, 170) + 5);
        var3 = var3 + this.a(-55, var3, 170, bp.field_j, (ga) (Object) ((fk) this).field_R);
        q var4 = new q(46, var3, ((fk) this).field_i + -90, 25, (ga) (Object) ((fk) this).field_O, true, ((fk) this).field_i - 120, 5, ii.field_a, 11579568, ji.field_d);
        ((fk) this).a((ga) (Object) var4, 10);
        var3 = var3 + var4.field_n;
        vf var5 = new vf(ia.field_e, 0, 0, 0, 0, 16777215, -1, 0, 0, ia.field_e.field_I, -1, 2147483647, true);
        ((fk) this).field_J = new hm(var2, (io) (Object) var5);
        ((fk) this).field_J.field_s = "";
        ((fk) this).field_J.a(0, -21423, sm.field_b);
        ((fk) this).field_J.a(1, -21423, sm.field_b);
        ((fk) this).field_J.field_v = (sk) this;
        ((fk) this).field_J.a(46, var3, true, -90 + ((fk) this).field_i);
        var3 = var3 + (15 + ((fk) this).field_J.field_n);
        ((fk) this).a((ga) (Object) ((fk) this).field_J, 10);
        int var6 = 4;
        int var7 = 200;
        ((fk) this).field_L.a(57, var3, 496 - var7 >> -717357599, var7, 40);
        ((fk) this).field_H.a(35, 15 + var3, var6 + 3, 60, 40);
        ((fk) this).field_H.field_v = (sk) this;
        ((fk) this).field_L.field_v = (sk) this;
        ((fk) this).a((ga) (Object) ((fk) this).field_L, 10);
        ((fk) this).a((ga) (Object) ((fk) this).field_H, 10);
        ((fk) this).field_I = new kn((ri) this);
        ((fk) this).field_I.a(36, 20 + ((fk) this).field_N.field_j, 60 + ((fk) this).field_N.field_i + ((fk) this).field_N.field_k, ((fk) this).field_i + (-((fk) this).field_N.field_k + -((fk) this).field_N.field_i - 60), 150);
        ((fk) this).a((ga) (Object) ((fk) this).field_I, 10);
        ((fk) this).a(35, 0, 0, 496, 55 + var3 - -var6);
    }

    final static void b(boolean param0) {
        oo.field_R = oo.field_R - 1;
        if ((oo.field_R ^ -1) < -1) {
          if (param0) {
            fk.b(false);
            return;
          } else {
            return;
          }
        } else {
          dj.field_e.field_R.a(0, (le) (Object) new hk());
          oo.field_R = pb.a(so.field_a, 40, 1) - -40;
          if (!param0) {
            return;
          } else {
            fk.b(false);
            return;
          }
        }
    }

    private final boolean a(byte param0, mi param1) {
        vc var3 = null;
        rh var4 = null;
        var3 = param1.a(0);
        if (var3 == null) {
          return true;
        } else {
          var4 = var3.a((byte) -89);
          if (var4 == uc.field_b) {
            return false;
          } else {
            if (param0 == 77) {
              if (se.field_l == var4) {
                return false;
              } else {
                if (var4 == di.field_L) {
                  return false;
                } else {
                  return true;
                }
              }
            } else {
              return true;
            }
          }
        }
    }

    static {
    }
}
