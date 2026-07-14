/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class v extends pj implements ra, ke, fh {
    private qg field_S;
    private qg field_Q;
    private qg field_K;
    private qg field_ab;
    private hf field_L;
    private nc field_T;
    private qa field_Z;
    static String field_U;
    jd field_V;
    private qg field_P;
    static he[] field_W;
    private hf field_R;
    static int field_N;
    static String field_X;
    static nh field_Y;
    private qg field_J;
    static nh field_O;

    private final int a(String param0, int param1, vg param2, byte param3, int param4, String param5, int param6) {
        ci var9 = null;
        dh var10 = null;
        var10 = new dh(20, param4, param1 + 120, 25, param2, false, 120, 3, uh.field_i, 16777215, param0);
        if (param3 > -74) {
          ((v) this).field_Q = null;
          ((v) this).b((vg) (Object) var10, (byte) 51);
          var9 = new ci(((ud) (Object) param2).a((byte) 36), param5, 126, param4 + var10.field_k, param1 - -50, param6);
          var9.field_u = (fd) this;
          ((v) this).b((vg) (Object) var9, (byte) 89);
          return var9.field_k + var10.field_k;
        } else {
          ((v) this).b((vg) (Object) var10, (byte) 51);
          var9 = new ci(((ud) (Object) param2).a((byte) 36), param5, 126, param4 + var10.field_k, param1 - -50, param6);
          var9.field_u = (fd) this;
          ((v) this).b((vg) (Object) var9, (byte) 89);
          return var9.field_k + var10.field_k;
        }
    }

    public final void a(String param0, int param1) {
        if (param1 != 0) {
            return;
        }
        qg var3 = ((v) this).field_K;
        String var4 = param0;
        ((kl) (Object) var3).a(false, var4, param1 ^ -19116);
    }

    private final int a(int param0, vg param1, String param2, int param3, int param4) {
        dh var6 = new dh(20, param4, param0 + 120, 25, param1, false, 120, 3, uh.field_i, param3, param2);
        ((v) this).b((vg) (Object) var6, (byte) 127);
        return var6.field_k;
    }

    public final void a(int param0, int param1, boolean param2, hf param3, int param4) {
        if (param2) {
          if (param3 != ((v) this).field_L) {
            if (param3 == ((v) this).field_R) {
              boolean discarded$4 = this.k(-1);
              return;
            } else {
              return;
            }
          } else {
            gf.d((byte) 103);
            return;
          }
        } else {
          ((v) this).field_Z = null;
          if (param3 != ((v) this).field_L) {
            if (param3 != ((v) this).field_R) {
              return;
            } else {
              boolean discarded$5 = this.k(-1);
              return;
            }
          } else {
            gf.d((byte) 103);
            return;
          }
        }
    }

    final void a(vg param0, int param1, int param2, byte param3) {
        super.a(param0, param1, param2, (byte) -128);
        if (param3 >= -127) {
          ((v) this).field_J = null;
          ((v) this).field_R.field_E = this.g((byte) 72);
          return;
        } else {
          ((v) this).field_R.field_E = this.g((byte) 72);
          return;
        }
    }

    public static void j(int param0) {
        field_O = null;
        field_X = null;
        if (param0 != 3) {
            return;
        }
        field_W = null;
        field_Y = null;
        field_U = null;
    }

    private final boolean a(byte param0, ud param1) {
        qi var3 = null;
        vh var4 = null;
        if (param0 < -79) {
          var3 = param1.a((byte) 27);
          if (var3 == null) {
            return true;
          } else {
            var4 = var3.a(-12317);
            if (u.field_b == var4) {
              return false;
            } else {
              if (var4 != ai.field_A) {
                if (pi.field_P == var4) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            }
          }
        } else {
          String discarded$2 = this.i(-91);
          var3 = param1.a((byte) 27);
          if (var3 == null) {
            return true;
          } else {
            var4 = var3.a(-12317);
            if (u.field_b == var4) {
              return false;
            } else {
              if (var4 != ai.field_A) {
                if (pi.field_P == var4) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            }
          }
        }
    }

    final boolean a(int param0, char param1, vg param2, int param3) {
        if (super.a(param0, param1, param2, 86)) {
          return true;
        } else {
          if (param3 >= 63) {
            if ((param0 ^ -1) == -99) {
              return ((v) this).a(param2, 65535);
            } else {
              if (param0 == 99) {
                return ((v) this).a(param2, (byte) 43);
              } else {
                return false;
              }
            }
          } else {
            v.j(24);
            if ((param0 ^ -1) == -99) {
              return ((v) this).a(param2, 65535);
            } else {
              if (param0 == 99) {
                return ((v) this).a(param2, (byte) 43);
              } else {
                return false;
              }
            }
          }
        }
    }

    private final boolean k(int param0) {
        if (!this.g((byte) -109)) {
            return false;
        }
        int var2 = param0;
        try {
            if (false) throw (NumberFormatException) null;
            var2 = Integer.parseInt(((v) this).field_Q.field_p);
        } catch (NumberFormatException numberFormatException) {
        }
        return hg.a(((v) this).field_S.field_p, ((v) this).field_T.field_A, var2, (byte) -38, ((v) this).field_P.field_p, ((v) this).field_K.field_p, (v) this);
    }

    private final boolean g(byte param0) {
        int var2 = 0;
        var2 = 5 / ((param0 - -57) / 46);
        if (this.a((byte) -119, (ud) (Object) ((v) this).field_K)) {
          if (this.a((byte) -112, (ud) (Object) ((v) this).field_P)) {
            if (this.a((byte) -128, (ud) (Object) ((v) this).field_J)) {
              if (this.a((byte) -111, (ud) (Object) ((v) this).field_S)) {
                if (this.a((byte) -95, (ud) (Object) ((v) this).field_ab)) {
                  if (!this.a((byte) -104, (ud) (Object) ((v) this).field_Q)) {
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

    private final int a(vg param0, int param1, byte param2, int param3, String param4) {
        gm var7 = null;
        Object var8 = null;
        dh var9 = null;
        var9 = new dh(20, param1, 120 - -param3, 25, param0, false, 120, 3, uh.field_i, 16777215, param4);
        ((v) this).b((vg) (Object) var9, (byte) 62);
        if (param2 >= -25) {
          var8 = null;
          int discarded$1 = this.a(-113, (vg) null, (String) null, 70, 32);
          var7 = new gm(((ud) (Object) param0).a((byte) 21));
          ((v) this).b((vg) (Object) var7, (byte) 67);
          var7.a((-15 + var9.field_k >> 1950272577) + var9.field_m, 15, var9.field_w + var9.field_o - -3, 16535, 15);
          return var9.field_k;
        } else {
          var7 = new gm(((ud) (Object) param0).a((byte) 21));
          ((v) this).b((vg) (Object) var7, (byte) 67);
          var7.a((-15 + var9.field_k >> 1950272577) + var9.field_m, 15, var9.field_w + var9.field_o - -3, 16535, 15);
          return var9.field_k;
        }
    }

    private final String l(int param0) {
        if (param0 != 15) {
            String discarded$0 = this.l(-60);
            return "<u=2164A2><col=2164A2>";
        }
        return "<u=2164A2><col=2164A2>";
    }

    public final void a(int param0, int param1, qa param2, int param3) {
        int var6 = 0;
        var6 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (param1 <= -90) {
          if (0 != param0) {
            if ((param0 ^ -1) != -2) {
              if ((param0 ^ -1) == -3) {
                nd.a(-1, "conduct.ws");
                return;
              } else {
                return;
              }
            } else {
              nd.a(-1, "privacy.ws");
              return;
            }
          } else {
            nd.a(-1, "terms.ws");
            return;
          }
        } else {
          ((v) this).field_V = null;
          if (0 != param0) {
            if ((param0 ^ -1) != -2) {
              if ((param0 ^ -1) != -3) {
                return;
              } else {
                nd.a(-1, "conduct.ws");
                return;
              }
            } else {
              nd.a(-1, "privacy.ws");
              return;
            }
          } else {
            nd.a(-1, "terms.ws");
            return;
          }
        }
    }

    public final void a(byte param0) {
        ((pk) (Object) ((v) this).field_K.a((byte) 84)).e((byte) -27);
        if (param0 > -23) {
            ((v) this).field_Z = null;
        }
    }

    private final int a(int param0, vg param1, String param2, int param3, byte param4, String param5) {
        if (param4 >= -80) {
            return -67;
        }
        return this.a(param2, param3, param1, (byte) -89, param0, param5, 35);
    }

    private final String i(int param0) {
        if (param0 > -1) {
            ((v) this).field_J = null;
            return "</col></u>";
        }
        return "</col></u>";
    }

    public v() {
        super(0, 0, 496, 0, (cg) null);
        ((v) this).field_K = new qg("", (fd) null, 12);
        ((v) this).field_P = new qg("", (fd) null, 100);
        ((v) this).field_J = new qg("", (fd) null, 100);
        ((v) this).field_S = new qg("", (fd) null, 20);
        ((v) this).field_ab = new qg("", (fd) null, 20);
        ((v) this).field_Q = new qg("", (fd) null, 3);
        int var1 = 1;
        ((v) this).field_T = new nc("", (fd) null, var1 != 0);
        ((v) this).field_R = new hf(vd.field_d, (fd) null);
        ((v) this).field_L = new hf(ej.field_c, (fd) null);
        ((v) this).field_K.field_v = bj.field_c;
        ((v) this).field_P.field_v = fm.field_i;
        ((v) this).field_J.field_v = ad.field_r;
        ((v) this).field_S.field_v = md.field_b;
        ((v) this).field_ab.field_v = ch.field_u;
        ((v) this).field_Q.field_v = ci.field_K;
        ((v) this).field_T.field_v = dc.field_g;
        ((v) this).field_K.a((qi) (Object) new pk((kl) (Object) ((v) this).field_K), (byte) -57);
        ((v) this).field_P.a((qi) (Object) new ni((kl) (Object) ((v) this).field_P), (byte) -57);
        ((v) this).field_J.a((qi) (Object) new e((kl) (Object) ((v) this).field_J, (kl) (Object) ((v) this).field_P), (byte) -57);
        ((v) this).field_S.a((qi) (Object) new ad((kl) (Object) ((v) this).field_S, (kl) (Object) ((v) this).field_K, (kl) (Object) ((v) this).field_P), (byte) -57);
        ((v) this).field_ab.a((qi) (Object) new nf((kl) (Object) ((v) this).field_ab, (kl) (Object) ((v) this).field_S), (byte) -57);
        ((v) this).field_Q.a((qi) (Object) new g((kl) (Object) ((v) this).field_Q), (byte) -57);
        ((v) this).field_R.field_E = false;
        ((v) this).field_R.field_l = (cg) (Object) new ie();
        ((v) this).field_L.field_l = (cg) (Object) new uk();
        ((v) this).field_K.field_l = (cg) (Object) new mj(10000536);
        ((v) this).field_J.field_l = (cg) (Object) new mj(10000536);
        ((v) this).field_P.field_l = (cg) (Object) new mj(10000536);
        ((v) this).field_Q.field_l = (cg) (Object) new mj(10000536);
        ((v) this).field_T.field_l = (cg) (Object) new ue();
        ((v) this).field_ab.field_l = (cg) (Object) new dm(10000536);
        ((v) this).field_S.field_l = (cg) (Object) new dm(10000536);
        String var2 = a.a(5044, fk.field_p, new String[2]);
        int var3 = 20;
        var3 = var3 + this.a(170, (vg) (Object) ((v) this).field_P, ge.field_c, 16777215, var3);
        var3 = var3 + (this.a(ta.field_a, 170, (vg) (Object) ((v) this).field_J, (byte) -103, var3, "", 20) - -5);
        var3 = var3 + this.a(170, (vg) (Object) ((v) this).field_S, qf.field_a, 16777215, var3);
        var3 = var3 + (this.a(var3, (vg) (Object) ((v) this).field_ab, cf.field_a, 170, (byte) -105, ob.field_d) + 5);
        var3 = var3 + (this.a(var3, (vg) (Object) ((v) this).field_K, hj.field_h, 170, (byte) -83, vh.field_b) - -5);
        var3 = var3 + this.a((vg) (Object) ((v) this).field_Q, var3, (byte) -77, 170, ri.field_c);
        dh var4 = new dh(46, var3, -90 + ((v) this).field_w, 25, (vg) (Object) ((v) this).field_T, true, -120 + ((v) this).field_w, 5, u.field_d, 11579568, li.field_d);
        ((v) this).b((vg) (Object) var4, (byte) 105);
        var3 = var3 + var4.field_k;
        l var5 = new l(uh.field_i, 0, 0, 0, 0, 16777215, -1, 0, 0, uh.field_i.field_x, -1, 2147483647, true);
        ((v) this).field_Z = new qa(var2, (cg) (Object) var5);
        ((v) this).field_Z.field_v = "";
        ((v) this).field_Z.a(we.field_d, 0, -64);
        ((v) this).field_Z.a(we.field_d, 1, -73);
        ((v) this).field_Z.field_u = (fd) this;
        ((v) this).field_Z.b(0, ((v) this).field_w - 90, 46, var3);
        var3 = var3 + (((v) this).field_Z.field_k + 15);
        ((v) this).b((vg) (Object) ((v) this).field_Z, (byte) 81);
        int var6 = 4;
        int var7 = 200;
        ((v) this).field_R.a(var3, 40, -var7 + 496 >> 1943477921, 16535, var7);
        ((v) this).field_L.a(15 + var3, 40, var6 + 3, 16535, 60);
        ((v) this).field_L.field_u = (fd) this;
        ((v) this).field_R.field_u = (fd) this;
        ((v) this).b((vg) (Object) ((v) this).field_R, (byte) 105);
        ((v) this).b((vg) (Object) ((v) this).field_L, (byte) 39);
        ((v) this).field_V = new jd((fh) this);
        ((v) this).field_V.a(((v) this).field_K.field_m + 20, 150, ((v) this).field_K.field_o - -((v) this).field_K.field_w - -60, 16535, -60 + -((v) this).field_K.field_w + (((v) this).field_w - ((v) this).field_K.field_o));
        ((v) this).b((vg) (Object) ((v) this).field_V, (byte) 118);
        ((v) this).a(0, var6 + (55 + var3), 0, 16535, 496);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_U = "Best";
        field_X = "Play the game without logging in just yet";
        field_W = new he[3];
    }
}
