/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ho extends gn implements ij, dm, sh {
    static int field_X;
    private fo field_W;
    private fo field_K;
    n field_L;
    private ae field_V;
    private fo field_R;
    static String field_Q;
    static oh field_M;
    private fo field_O;
    private ae field_S;
    private fo field_U;
    private re field_T;
    private fo field_N;
    private fk field_P;

    final void a(na param0, int param1, int param2, boolean param3) {
        if (!param3) {
          ((ho) this).a(true);
          super.a(param0, param1, param2, param3);
          ((ho) this).field_V.field_K = this.h(15);
          return;
        } else {
          super.a(param0, param1, param2, param3);
          ((ho) this).field_V.field_K = this.h(15);
          return;
        }
    }

    final boolean a(int param0, char param1, int param2, na param3) {
        if (!super.a(param0, param1, param2, param3)) {
          if (param0 == 98) {
            return ((ho) this).d(param3, param2 + -99);
          } else {
            if ((param0 ^ -1) == -100) {
              return ((ho) this).b(param3, 114);
            } else {
              return false;
            }
          }
        } else {
          return true;
        }
    }

    public ho() {
        super(0, 0, 496, 0, (kg) null);
        ((ho) this).field_O = new fo("", (dn) null, 12);
        ((ho) this).field_W = new fo("", (dn) null, 100);
        ((ho) this).field_K = new fo("", (dn) null, 100);
        ((ho) this).field_R = new fo("", (dn) null, 20);
        ((ho) this).field_N = new fo("", (dn) null, 20);
        ((ho) this).field_U = new fo("", (dn) null, 3);
        int var1 = 1;
        ((ho) this).field_T = new re("", (dn) null, var1 != 0);
        ((ho) this).field_V = new ae(pf.field_k, (dn) null);
        ((ho) this).field_S = new ae(bg.field_n, (dn) null);
        ((ho) this).field_O.field_C = sf.field_c;
        ((ho) this).field_W.field_C = jj.field_c;
        ((ho) this).field_K.field_C = f.field_t;
        ((ho) this).field_R.field_C = ci.field_D;
        ((ho) this).field_N.field_C = gm.field_e;
        ((ho) this).field_U.field_C = hn.field_N;
        ((ho) this).field_T.field_C = wg.field_a;
        ((ho) this).field_O.a((byte) 78, (vm) (Object) new tm((nn) (Object) ((ho) this).field_O));
        ((ho) this).field_W.a((byte) -66, (vm) (Object) new lh((nn) (Object) ((ho) this).field_W));
        ((ho) this).field_K.a((byte) -59, (vm) (Object) new hd((nn) (Object) ((ho) this).field_K, (nn) (Object) ((ho) this).field_W));
        ((ho) this).field_R.a((byte) 91, (vm) (Object) new mm((nn) (Object) ((ho) this).field_R, (nn) (Object) ((ho) this).field_O, (nn) (Object) ((ho) this).field_W));
        ((ho) this).field_N.a((byte) 70, (vm) (Object) new cb((nn) (Object) ((ho) this).field_N, (nn) (Object) ((ho) this).field_R));
        ((ho) this).field_U.a((byte) 61, (vm) (Object) new w((nn) (Object) ((ho) this).field_U));
        ((ho) this).field_V.field_K = false;
        ((ho) this).field_V.field_H = (kg) (Object) new uj();
        ((ho) this).field_S.field_H = (kg) (Object) new q();
        ((ho) this).field_O.field_H = (kg) (Object) new mf(10000536);
        mf dupTemp$0 = new mf(10000536);
        ((ho) this).field_K.field_H = (kg) (Object) dupTemp$0;
        ((ho) this).field_W.field_H = (kg) (Object) dupTemp$0;
        ((ho) this).field_U.field_H = (kg) (Object) new mf(10000536);
        ((ho) this).field_T.field_H = (kg) (Object) new ul();
        ci dupTemp$1 = new ci(10000536);
        ((ho) this).field_N.field_H = (kg) (Object) dupTemp$1;
        ((ho) this).field_R.field_H = (kg) (Object) dupTemp$1;
        String var2 = sk.a(new String[2], ej.field_t, 120);
        int var3 = 20;
        var3 = var3 + this.a(rm.field_c, (na) (Object) ((ho) this).field_W, 96, var3, 170);
        var3 = var3 + (5 + this.a("", 20, 170, om.field_Pb, (na) (Object) ((ho) this).field_K, var3, false));
        var3 = var3 + this.a(gj.field_a, (na) (Object) ((ho) this).field_R, -115, var3, 170);
        var3 = var3 + (5 + this.a((na) (Object) ((ho) this).field_N, 170, qm.field_f, 120, var3, fm.field_e));
        var3 = var3 + (5 + this.a((na) (Object) ((ho) this).field_O, 170, jm.field_c, 120, var3, kl.field_e));
        var3 = var3 + this.a(170, ba.field_P, var3, (na) (Object) ((ho) this).field_U, 107);
        rc var4 = new rc(46, var3, ((ho) this).field_F + -90, 25, (na) (Object) ((ho) this).field_T, true, ((ho) this).field_F - 120, 5, dh.field_d, 11579568, ke.field_e);
        ((ho) this).c((na) (Object) var4, 10);
        var3 = var3 + var4.field_u;
        al var5 = new al(od.field_S, 0, 0, 0, 0, 16777215, -1, 0, 0, od.field_S.field_N, -1, 2147483647, true);
        ((ho) this).field_P = new fk(var2, (kg) (Object) var5);
        ((ho) this).field_P.field_C = "";
        ((ho) this).field_P.a(0, bf.field_o, (byte) -127);
        ((ho) this).field_P.a(1, bf.field_o, (byte) -127);
        ((ho) this).field_P.field_s = (dn) this;
        ((ho) this).field_P.c(((ho) this).field_F + -90, 46, var3, -82);
        var3 = var3 + (((ho) this).field_P.field_u - -15);
        ((ho) this).c((na) (Object) ((ho) this).field_P, 10);
        int var6 = 4;
        int var7 = 200;
        ((ho) this).field_V.a(40, var3, 4, -var7 + 496 >> 2066646689, var7);
        ((ho) this).field_S.a(40, var3 - -15, -124, 3 + var6, 60);
        ((ho) this).field_S.field_s = (dn) this;
        ((ho) this).field_V.field_s = (dn) this;
        ((ho) this).c((na) (Object) ((ho) this).field_V, 10);
        ((ho) this).c((na) (Object) ((ho) this).field_S, 10);
        ((ho) this).field_L = new n((sh) this);
        ((ho) this).field_L.a(150, ((ho) this).field_O.field_w - -20, -115, 60 + (((ho) this).field_O.field_t - -((ho) this).field_O.field_F), -((ho) this).field_O.field_F + -((ho) this).field_O.field_t + (((ho) this).field_F - 60));
        ((ho) this).c((na) (Object) ((ho) this).field_L, 10);
        ((ho) this).a(55 + (var3 + var6), 0, -118, 0, 496);
    }

    public final void a(int param0, byte param1, fk param2, int param3) {
        int var6 = TetraLink.field_J;
        if (param1 != -103) {
            return;
        }
        if (-1 == (param0 ^ -1)) {
            al.a("terms.ws", (byte) 24);
            return;
        }
        if (-2 == (param0 ^ -1)) {
            al.a("privacy.ws", (byte) 24);
            return;
        }
        if ((param0 ^ -1) != -3) {
            return;
        }
        al.a("conduct.ws", (byte) 24);
    }

    private final boolean a(byte param0, uc param1) {
        jk var4 = null;
        vm var3 = param1.a(-111);
        if (param0 >= -8) {
            ((ho) this).field_P = null;
            if (var3 == null) {
                return true;
            }
            var4 = var3.c(-26);
            if (var4 == db.field_h) {
                return false;
            }
            if (!(pm.field_b != var4)) {
                return false;
            }
            if (an.field_a == var4) {
                return false;
            }
            return true;
        }
        if (var3 == null) {
            return true;
        }
        var4 = var3.c(-26);
        if (var4 == db.field_h) {
            return false;
        }
        if (!(pm.field_b != var4)) {
            return false;
        }
        return an.field_a != var4 ? true : false;
    }

    public static void a(int param0) {
        if (param0 <= 109) {
            ho.a(109);
            field_M = null;
            field_Q = null;
            return;
        }
        field_M = null;
        field_Q = null;
    }

    public final void a(byte param0, ae param1, int param2, int param3, int param4) {
        if (param0 < 0) {
          if (((ho) this).field_S != param1) {
            if (((ho) this).field_V == param1) {
              boolean discarded$2 = this.e((byte) 88);
              return;
            } else {
              return;
            }
          } else {
            gj.a((byte) 71);
            return;
          }
        } else {
          return;
        }
    }

    private final int a(int param0, String param1, int param2, na param3, int param4) {
        rc var9 = new rc(20, param2, param0 + 120, 25, param3, false, 120, 3, od.field_S, 16777215, param1);
        ((ho) this).c((na) (Object) var9, 10);
        ab var7 = new ab(((uc) (Object) param3).a(-124));
        ((ho) this).c((na) (Object) var7, 10);
        int var8 = -35 % ((1 - param4) / 45);
        var7.a(15, var9.field_w + (var9.field_u - 15 >> 511607745), 122, 3 + (var9.field_F + var9.field_t), 15);
        return var9.field_u;
    }

    private final int a(String param0, int param1, int param2, String param3, na param4, int param5, boolean param6) {
        rc var10 = new rc(20, param5, 120 - -param2, 25, param4, param6, 120, 3, od.field_S, 16777215, param3);
        ((ho) this).c((na) (Object) var10, 10);
        ck var9 = new ck(((uc) (Object) param4).a(-125), param0, 126, var10.field_u + param5, 50 + param2, param1);
        var9.field_s = (dn) this;
        ((ho) this).c((na) (Object) var9, 10);
        return var10.field_u + var9.field_u;
    }

    public final void a(int param0, String param1) {
        fo var3 = ((ho) this).field_O;
        String var4 = param1;
        int var5 = 9 % ((param0 - -9) / 61);
        ((nn) (Object) var3).a(false, 32, var4);
    }

    private final String f(byte param0) {
        if (param0 != 9) {
            Object var3 = null;
            boolean discarded$0 = ((ho) this).a(-82, ' ', 16, (na) null);
            return "</col></u>";
        }
        return "</col></u>";
    }

    public final void a(boolean param0) {
        if (!param0) {
            return;
        }
        ((tm) (Object) ((ho) this).field_O.a(-117)).d((byte) -115);
    }

    private final boolean e(byte param0) {
        int var2 = 102 % ((22 - param0) / 60);
        if (!this.h(15)) {
            return false;
        }
        int var3 = -1;
        try {
            if (false) throw (NumberFormatException) null;
            var3 = Integer.parseInt(((ho) this).field_U.field_A);
        } catch (NumberFormatException numberFormatException) {
        }
        return sj.a(var3, ((ho) this).field_W.field_A, ((ho) this).field_R.field_A, (ho) this, ((ho) this).field_O.field_A, -1, ((ho) this).field_T.field_N);
    }

    private final boolean h(int param0) {
        if (param0 == 15) {
          if (this.a((byte) -123, (uc) (Object) ((ho) this).field_O)) {
            if (this.a((byte) -11, (uc) (Object) ((ho) this).field_W)) {
              if (this.a((byte) -92, (uc) (Object) ((ho) this).field_K)) {
                if (this.a((byte) -93, (uc) (Object) ((ho) this).field_R)) {
                  if (this.a((byte) -27, (uc) (Object) ((ho) this).field_N)) {
                    if (!this.a((byte) -105, (uc) (Object) ((ho) this).field_U)) {
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

    private final int a(String param0, na param1, int param2, int param3, int param4) {
        rc var6 = new rc(20, param3, param4 + 120, 25, param1, false, 120, 3, od.field_S, 16777215, param0);
        int var7 = -24 % ((param2 - -11) / 51);
        ((ho) this).c((na) (Object) var6, 10);
        return var6.field_u;
    }

    private final int a(na param0, int param1, String param2, int param3, int param4, String param5) {
        if (param3 != 120) {
          ho.a(-16);
          return this.a(param2, 35, param1, param5, param0, param4, false);
        } else {
          return this.a(param2, 35, param1, param5, param0, param4, false);
        }
    }

    private final String i(int param0) {
        if (param0 != -2) {
            return null;
        }
        return "<u=2164A2><col=2164A2>";
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_X = 0;
        field_Q = "Cancel";
    }
}
