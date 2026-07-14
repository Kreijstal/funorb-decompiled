/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ke extends ga implements ge, el, pg {
    private wh field_H;
    static String field_ab;
    static double field_Z;
    static bi field_cb;
    private wh field_R;
    ak field_O;
    private na field_T;
    static String field_L;
    private wh field_X;
    private fa field_bb;
    private wh field_U;
    private wh field_W;
    static int[] field_P;
    private rg field_Y;
    private wh field_V;
    private rg field_S;

    private final int a(fj param0, String param1, int param2, int param3, int param4) {
        la var6 = new la(20, param3, param2 + 120, 25, param0, false, param4, 3, gm.field_cb, 16777215, param1);
        ((ke) this).b((fj) (Object) var6, 10);
        return var6.field_z;
    }

    private final boolean c(boolean param0) {
        if (!(this.i((byte) -66))) {
            return false;
        }
        if (!param0) {
            Object var4 = null;
            ((ke) this).a(-115, (String) null);
        }
        int var2 = -1;
        try {
            if (false) throw (NumberFormatException) null;
            var2 = Integer.parseInt(((ke) this).field_V.field_B);
        } catch (NumberFormatException numberFormatException) {
        }
        return qf.a(30692, ((ke) this).field_U.field_B, ((ke) this).field_bb.field_O, (ke) this, ((ke) this).field_H.field_B, ((ke) this).field_R.field_B, var2);
    }

    public final void a(na param0, int param1, int param2, boolean param3) {
        int var6 = 0;
        Object var7 = null;
        var6 = Confined.field_J ? 1 : 0;
        if (-1 != (param1 ^ -1)) {
          if (1 == param1) {
            tb.a(-15912, "privacy.ws");
            if (param3) {
              var7 = null;
              int discarded$4 = this.a(-104, 80, (String) null, (byte) -57, (fj) null);
              return;
            } else {
              return;
            }
          } else {
            if ((param1 ^ -1) == -3) {
              tb.a(-15912, "conduct.ws");
              if (param3) {
                var7 = null;
                int discarded$5 = this.a(-104, 80, (String) null, (byte) -57, (fj) null);
                return;
              } else {
                return;
              }
            } else {
              if (!param3) {
                return;
              } else {
                var7 = null;
                int discarded$6 = this.a(-104, 80, (String) null, (byte) -57, (fj) null);
                return;
              }
            }
          }
        } else {
          tb.a(-15912, "terms.ws");
          if (!param3) {
            return;
          } else {
            var7 = null;
            int discarded$7 = this.a(-104, 80, (String) null, (byte) -57, (fj) null);
            return;
          }
        }
    }

    final void a(fj param0, int param1, int param2, int param3) {
        super.a(param0, param1, param2, param3);
        ((ke) this).field_S.field_L = this.i((byte) -66);
    }

    private final boolean i(byte param0) {
        Object var3 = null;
        if (param0 == -66) {
          if (this.a((byte) -111, (j) (Object) ((ke) this).field_R)) {
            if (this.a((byte) -7, (j) (Object) ((ke) this).field_U)) {
              if (this.a((byte) 74, (j) (Object) ((ke) this).field_W)) {
                if (this.a((byte) -128, (j) (Object) ((ke) this).field_H)) {
                  if (this.a((byte) 37, (j) (Object) ((ke) this).field_X)) {
                    if (!this.a((byte) 23, (j) (Object) ((ke) this).field_V)) {
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
          var3 = null;
          boolean discarded$2 = ((ke) this).a((fj) null, (byte) 14, -34, '￤');
          if (this.a((byte) -111, (j) (Object) ((ke) this).field_R)) {
            if (this.a((byte) -7, (j) (Object) ((ke) this).field_U)) {
              if (this.a((byte) 74, (j) (Object) ((ke) this).field_W)) {
                if (this.a((byte) -128, (j) (Object) ((ke) this).field_H)) {
                  if (this.a((byte) 37, (j) (Object) ((ke) this).field_X)) {
                    if (!this.a((byte) 23, (j) (Object) ((ke) this).field_V)) {
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

    private final String b(boolean param0) {
        if (param0) {
            return null;
        }
        return "<u=2164A2><col=2164A2>";
    }

    private final boolean a(byte param0, j param1) {
        dm var3 = null;
        fi var4 = null;
        int var5 = 0;
        var3 = param1.a((byte) -9);
        if (var3 == null) {
          return true;
        } else {
          var4 = var3.a(-3621);
          if (var4 != fb.field_e) {
            var5 = 26 % ((-60 - param0) / 47);
            if (var4 != ab.field_b) {
              if (gi.field_bb == var4) {
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
    }

    public final void a(byte param0) {
        ((qg) (Object) ((ke) this).field_R.a((byte) -9)).e(639775169);
        if (param0 > -101) {
            String discarded$0 = this.h((byte) -41);
        }
    }

    final static void g(byte param0) {
        dn.field_b.a((fj) (Object) new tg(), (byte) -72);
        if (param0 > -7) {
            field_ab = null;
        }
    }

    public ke() {
        super(0, 0, 496, 0, (fe) null);
        ((ke) this).field_R = new wh("", (uk) null, 12);
        ((ke) this).field_U = new wh("", (uk) null, 100);
        ((ke) this).field_W = new wh("", (uk) null, 100);
        ((ke) this).field_H = new wh("", (uk) null, 20);
        ((ke) this).field_X = new wh("", (uk) null, 20);
        ((ke) this).field_V = new wh("", (uk) null, 3);
        int var1 = 1;
        ((ke) this).field_bb = new fa("", (uk) null, var1 != 0);
        ((ke) this).field_S = new rg(he.field_c, (uk) null);
        ((ke) this).field_Y = new rg(qn.field_m, (uk) null);
        ((ke) this).field_R.field_C = ra.field_b;
        ((ke) this).field_U.field_C = p.field_a;
        ((ke) this).field_W.field_C = tf.field_g;
        ((ke) this).field_H.field_C = oe.field_O;
        ((ke) this).field_X.field_C = jl.field_m;
        ((ke) this).field_V.field_C = rm.field_D;
        ((ke) this).field_bb.field_C = hf.field_U;
        ((ke) this).field_R.a(-18312, (dm) (Object) new qg((ul) (Object) ((ke) this).field_R));
        ((ke) this).field_U.a(-18312, (dm) (Object) new bk((ul) (Object) ((ke) this).field_U));
        ((ke) this).field_W.a(-18312, (dm) (Object) new qc((ul) (Object) ((ke) this).field_W, (ul) (Object) ((ke) this).field_U));
        ((ke) this).field_H.a(-18312, (dm) (Object) new gl((ul) (Object) ((ke) this).field_H, (ul) (Object) ((ke) this).field_R, (ul) (Object) ((ke) this).field_U));
        ((ke) this).field_X.a(-18312, (dm) (Object) new lf((ul) (Object) ((ke) this).field_X, (ul) (Object) ((ke) this).field_H));
        ((ke) this).field_V.a(-18312, (dm) (Object) new hj((ul) (Object) ((ke) this).field_V));
        ((ke) this).field_S.field_L = false;
        ((ke) this).field_S.field_n = (fe) (Object) new je();
        ((ke) this).field_Y.field_n = (fe) (Object) new hk();
        ((ke) this).field_R.field_n = (fe) (Object) new db(10000536);
        ((ke) this).field_W.field_n = (fe) (Object) new db(10000536);
        ((ke) this).field_U.field_n = (fe) (Object) new db(10000536);
        ((ke) this).field_V.field_n = (fe) (Object) new db(10000536);
        ((ke) this).field_bb.field_n = (fe) (Object) new cj();
        ((ke) this).field_X.field_n = (fe) (Object) new qm(10000536);
        ((ke) this).field_H.field_n = (fe) (Object) new qm(10000536);
        String var2 = b.a(new String[2], ui.field_e, 1177);
        int var3 = 20;
        var3 = var3 + this.a((fj) (Object) ((ke) this).field_U, oh.field_d, 170, var3, 120);
        var3 = var3 + (this.a((fj) (Object) ((ke) this).field_W, 170, var3, fj.field_A, "", 20, 20) - -5);
        var3 = var3 + this.a((fj) (Object) ((ke) this).field_H, sc.field_b, 170, var3, 120);
        var3 = var3 + (5 + this.a(hb.field_t, jj.field_hb, 150, 170, var3, (fj) (Object) ((ke) this).field_X));
        var3 = var3 + (5 + this.a(rc.field_a, va.field_d, 150, 170, var3, (fj) (Object) ((ke) this).field_R));
        var3 = var3 + this.a(170, var3, qi.field_j, (byte) 59, (fj) (Object) ((ke) this).field_V);
        la var4 = new la(46, var3, -90 + ((ke) this).field_F, 25, (fj) (Object) ((ke) this).field_bb, true, -120 + ((ke) this).field_F, 5, fa.field_Q, 11579568, ag.field_j);
        ((ke) this).b((fj) (Object) var4, 10);
        var3 = var3 + var4.field_z;
        vf var5 = new vf(gm.field_cb, 0, 0, 0, 0, 16777215, -1, 0, 0, gm.field_cb.field_C, -1, 2147483647, true);
        ((ke) this).field_T = new na(var2, (fe) (Object) var5);
        ((ke) this).field_T.field_C = "";
        ((ke) this).field_T.a(0, (byte) 9, om.field_o);
        ((ke) this).field_T.a(1, (byte) 9, om.field_o);
        ((ke) this).field_T.field_t = (uk) this;
        ((ke) this).field_T.b(var3, 46, ((ke) this).field_F - 90, 8888);
        var3 = var3 + (((ke) this).field_T.field_z + 15);
        ((ke) this).b((fj) (Object) ((ke) this).field_T, 10);
        int var6 = 4;
        int var7 = 200;
        ((ke) this).field_S.a(-116, var7, var3, 40, 496 + -var7 >> 943877697);
        ((ke) this).field_Y.a(-119, 60, 15 + var3, 40, var6 - -3);
        ((ke) this).field_Y.field_t = (uk) this;
        ((ke) this).field_S.field_t = (uk) this;
        ((ke) this).b((fj) (Object) ((ke) this).field_S, 10);
        ((ke) this).b((fj) (Object) ((ke) this).field_Y, 10);
        ((ke) this).field_O = new ak((pg) this);
        ((ke) this).field_O.a(-128, -60 + (((ke) this).field_F + -((ke) this).field_R.field_q) - ((ke) this).field_R.field_F, 20 + ((ke) this).field_R.field_m, 150, ((ke) this).field_R.field_q - (-((ke) this).field_R.field_F - 60));
        ((ke) this).b((fj) (Object) ((ke) this).field_O, 10);
        ((ke) this).a(-124, 496, 0, 55 + (var3 - -var6), 0);
    }

    private final int a(fj param0, int param1, int param2, String param3, String param4, int param5, int param6) {
        la var10 = new la(param5, param2, param1 + 120, 25, param0, false, 120, 3, gm.field_cb, 16777215, param3);
        ((ke) this).b((fj) (Object) var10, 10);
        rh var9 = new rh(((j) (Object) param0).a((byte) -9), param4, 126, param2 - -var10.field_z, param1 - -50, param6);
        var9.field_t = (uk) this;
        ((ke) this).b((fj) (Object) var9, 10);
        return var10.field_z - -var9.field_z;
    }

    final boolean a(fj param0, byte param1, int param2, char param3) {
        int var5 = 0;
        if (super.a(param0, (byte) -66, param2, param3)) {
          return true;
        } else {
          if (98 != param2) {
            if ((param2 ^ -1) == -100) {
              return ((ke) this).a(17731, param0);
            } else {
              var5 = -44 % ((47 - param1) / 43);
              return false;
            }
          } else {
            return ((ke) this).c(param0, 32);
          }
        }
    }

    private final int a(int param0, int param1, String param2, byte param3, fj param4) {
        ba var7 = null;
        la var8 = null;
        var8 = new la(20, param1, 120 - -param0, 25, param4, false, 120, 3, gm.field_cb, 16777215, param2);
        ((ke) this).b((fj) (Object) var8, 10);
        var7 = new ba(((j) (Object) param4).a((byte) -9));
        ((ke) this).b((fj) (Object) var7, 10);
        var7.a(-127, 15, var8.field_m - -(-15 + var8.field_z >> 866937601), 15, 3 + var8.field_q + var8.field_F);
        if (param3 != 59) {
          ((ke) this).field_W = null;
          return var8.field_z;
        } else {
          return var8.field_z;
        }
    }

    private final int a(String param0, String param1, int param2, int param3, int param4, fj param5) {
        if (param2 != 150) {
          boolean discarded$2 = this.i((byte) 79);
          return this.a(param5, param3, param4, param0, param1, 20, 35);
        } else {
          return this.a(param5, param3, param4, param0, param1, 20, 35);
        }
    }

    public final void a(int param0, int param1, int param2, rg param3, int param4) {
        if (param0 > 68) {
          if (((ke) this).field_Y != param3) {
            if (((ke) this).field_S == param3) {
              boolean discarded$7 = this.c(true);
              return;
            } else {
              return;
            }
          } else {
            ke.g((byte) -107);
            return;
          }
        } else {
          String discarded$8 = this.h((byte) 75);
          if (((ke) this).field_Y != param3) {
            if (((ke) this).field_S != param3) {
              return;
            } else {
              boolean discarded$9 = this.c(true);
              return;
            }
          } else {
            ke.g((byte) -107);
            return;
          }
        }
    }

    public final void a(int param0, String param1) {
        wh var3 = null;
        String var4 = null;
        if (param0 != 11579568) {
          ((ke) this).field_bb = null;
          var3 = ((ke) this).field_R;
          var4 = param1;
          ((ul) (Object) var3).a(false, false, var4);
          return;
        } else {
          var3 = ((ke) this).field_R;
          var4 = param1;
          ((ul) (Object) var3).a(false, false, var4);
          return;
        }
    }

    public static void j(int param0) {
        field_ab = null;
        field_L = null;
        field_P = null;
        field_cb = null;
        if (param0 != -14508) {
            ke.g((byte) -49);
        }
    }

    private final String h(byte param0) {
        if (param0 >= -8) {
            ke.g((byte) -50);
            return "</col></u>";
        }
        return "</col></u>";
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_ab = "You already have 10 cluster missiles";
        field_P = new int[128];
        field_L = "Fly your ship in the confined space of the tunnel.#Take what you like. Blow up what you like.#Use their technology against them. Show no mercy.";
    }
}
