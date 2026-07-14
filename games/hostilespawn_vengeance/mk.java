/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mk extends vd implements nk, qk, kn {
    static String field_Q;
    private vf field_G;
    private sf field_P;
    static int field_H;
    static boolean[] field_O;
    static volatile int field_I;
    private ph field_S;
    private sf field_M;
    private cj field_T;
    static nc field_L;
    private sf field_N;
    private sf field_F;
    static bn field_K;
    private sf field_E;
    private ph field_R;
    private sf field_U;
    mc field_J;

    private final boolean k(int param0) {
        if (!(this.c(true))) {
            return false;
        }
        int var2 = -1;
        try {
            if (false) throw (NumberFormatException) null;
            if (param0 != -12037) {
                boolean discarded$0 = this.k(105);
            }
            var2 = Integer.parseInt(((mk) this).field_F.field_n);
        } catch (NumberFormatException numberFormatException) {
        }
        return ng.a((mk) this, var2, ((mk) this).field_G.field_A, ((mk) this).field_E.field_n, ((mk) this).field_P.field_n, param0 ^ 3764, ((mk) this).field_M.field_n);
    }

    public final void a(int param0, int param1, int param2, ph param3, byte param4) {
        int var6 = 0;
        var6 = -37 / ((-63 - param4) / 52);
        if (param3 != ((mk) this).field_R) {
          if (((mk) this).field_S != param3) {
            return;
          } else {
            boolean discarded$2 = this.k(-12037);
            return;
          }
        } else {
          mn.a((byte) -126);
          return;
        }
    }

    private final int a(String param0, int param1, int param2, ag param3, int param4, String param5) {
        Object var8 = null;
        if (param4 != 20) {
          var8 = null;
          ((mk) this).a(-36, 119, 30, (ph) null, (byte) 55);
          return this.a(param1, param2, 3, param0, param5, 35, param3);
        } else {
          return this.a(param1, param2, 3, param0, param5, 35, param3);
        }
    }

    private final String j(int param0) {
        if (param0 != 0) {
            boolean discarded$0 = this.k(59);
            return "<u=2164A2><col=2164A2>";
        }
        return "<u=2164A2><col=2164A2>";
    }

    private final String b(boolean param0) {
        if (!param0) {
            Object var3 = null;
            boolean discarded$0 = ((mk) this).a(76, (ag) null, 126, 'ﾅ');
            return "</col></u>";
        }
        return "</col></u>";
    }

    public final void a(boolean param0, String param1) {
        sf var3 = null;
        String var4 = null;
        Object var5 = null;
        var3 = ((mk) this).field_P;
        var4 = param1;
        ((ig) (Object) var3).a((byte) 88, false, var4);
        if (!param0) {
          var5 = null;
          ((mk) this).a(-85, -107, 29, (ph) null, (byte) 13);
          return;
        } else {
          return;
        }
    }

    private final boolean a(byte param0, sk param1) {
        bg var3 = null;
        bm var4 = null;
        var3 = param1.a((byte) -121);
        if (var3 != null) {
          if (param0 < -53) {
            var4 = var3.b(-67);
            if (var4 != bi.field_d) {
              if (var4 != wl.field_c) {
                if (var4 == bm.field_g) {
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
            return true;
          }
        } else {
          return true;
        }
    }

    final static ca a(boolean param0, String param1, int param2, String param3) {
        CharSequence var8 = null;
        int var4 = 56 / ((-1 - param2) / 53);
        long var5 = 0L;
        String var7 = null;
        if (param3.indexOf('@') != -1) {
            var7 = param3;
        } else {
            var8 = (CharSequence) (Object) param3;
            var5 = l.a(var8, (byte) 123);
        }
        return ul.a(param0, var7, var5, param1, -115);
    }

    private final boolean c(boolean param0) {
        if (param0) {
          if (this.a((byte) -118, (sk) (Object) ((mk) this).field_P)) {
            if (this.a((byte) -114, (sk) (Object) ((mk) this).field_M)) {
              if (this.a((byte) -96, (sk) (Object) ((mk) this).field_N)) {
                if (this.a((byte) -108, (sk) (Object) ((mk) this).field_E)) {
                  if (this.a((byte) -118, (sk) (Object) ((mk) this).field_U)) {
                    if (!this.a((byte) -63, (sk) (Object) ((mk) this).field_F)) {
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

    public mk() {
        super(0, 0, 496, 0, (nn) null);
        ((mk) this).field_P = new sf("", (mh) null, 12);
        ((mk) this).field_M = new sf("", (mh) null, 100);
        ((mk) this).field_N = new sf("", (mh) null, 100);
        ((mk) this).field_E = new sf("", (mh) null, 20);
        ((mk) this).field_U = new sf("", (mh) null, 20);
        ((mk) this).field_F = new sf("", (mh) null, 3);
        int var1 = 1;
        ((mk) this).field_G = new vf("", (mh) null, var1 != 0);
        ((mk) this).field_S = new ph(ri.field_i, (mh) null);
        ((mk) this).field_R = new ph(dk.field_l, (mh) null);
        ((mk) this).field_P.field_i = u.field_g;
        ((mk) this).field_M.field_i = ul.field_M;
        ((mk) this).field_N.field_i = db.field_u;
        ((mk) this).field_E.field_i = qj.field_m;
        ((mk) this).field_U.field_i = ke.field_x;
        ((mk) this).field_F.field_i = s.field_h;
        ((mk) this).field_G.field_i = ql.field_b;
        ((mk) this).field_P.a((bg) (Object) new n((ig) (Object) ((mk) this).field_P), (byte) -77);
        ((mk) this).field_M.a((bg) (Object) new ka((ig) (Object) ((mk) this).field_M), (byte) -52);
        ((mk) this).field_N.a((bg) (Object) new hd((ig) (Object) ((mk) this).field_N, (ig) (Object) ((mk) this).field_M), (byte) -84);
        ((mk) this).field_E.a((bg) (Object) new db((ig) (Object) ((mk) this).field_E, (ig) (Object) ((mk) this).field_P, (ig) (Object) ((mk) this).field_M), (byte) -87);
        ((mk) this).field_U.a((bg) (Object) new li((ig) (Object) ((mk) this).field_U, (ig) (Object) ((mk) this).field_E), (byte) -75);
        ((mk) this).field_F.a((bg) (Object) new ld((ig) (Object) ((mk) this).field_F), (byte) -91);
        ((mk) this).field_S.field_D = false;
        ((mk) this).field_S.field_h = (nn) (Object) new ke();
        ((mk) this).field_R.field_h = (nn) (Object) new ti();
        ((mk) this).field_P.field_h = (nn) (Object) new sd(10000536);
        ((mk) this).field_N.field_h = (nn) (Object) new sd(10000536);
        ((mk) this).field_M.field_h = (nn) (Object) new sd(10000536);
        ((mk) this).field_F.field_h = (nn) (Object) new sd(10000536);
        ((mk) this).field_G.field_h = (nn) (Object) new f();
        ((mk) this).field_U.field_h = (nn) (Object) new km(10000536);
        ((mk) this).field_E.field_h = (nn) (Object) new km(10000536);
        String var2 = vg.a(new String[2], 26, bj.field_e);
        int var3 = 20;
        var3 = var3 + this.a(ic.field_o, (ag) (Object) ((mk) this).field_M, -99, var3, 170);
        var3 = var3 + (5 + this.a(170, var3, 3, "", wj.field_K, 20, (ag) (Object) ((mk) this).field_N));
        var3 = var3 + this.a(qh.field_x, (ag) (Object) ((mk) this).field_E, -124, var3, 170);
        var3 = var3 + (5 + this.a(he.field_w, 170, var3, (ag) (Object) ((mk) this).field_U, 20, um.field_h));
        var3 = var3 + (this.a(vg.field_f, 170, var3, (ag) (Object) ((mk) this).field_P, 20, ua.field_a) + 5);
        var3 = var3 + this.a((ag) (Object) ((mk) this).field_F, 120, gg.field_E, var3, 170);
        nh var4 = new nh(46, var3, ((mk) this).field_s + -90, 25, (ag) (Object) ((mk) this).field_G, true, ((mk) this).field_s + -120, 5, jn.field_G, 11579568, hm.field_o);
        ((mk) this).a(51448, (ag) (Object) var4);
        var3 = var3 + var4.field_x;
        cn var5 = new cn(jd.field_s, 0, 0, 0, 0, 16777215, -1, 0, 0, jd.field_s.field_y, -1, 2147483647, true);
        ((mk) this).field_T = new cj(var2, (nn) (Object) var5);
        ((mk) this).field_T.field_i = "";
        ((mk) this).field_T.a(-1, jg.field_e, 0);
        ((mk) this).field_T.a(-1, jg.field_e, 1);
        ((mk) this).field_T.field_p = (mh) this;
        ((mk) this).field_T.a(true, -90 + ((mk) this).field_s, 46, var3);
        var3 = var3 + (15 + ((mk) this).field_T.field_x);
        ((mk) this).a(51448, (ag) (Object) ((mk) this).field_T);
        int var6 = 4;
        int var7 = 200;
        ((mk) this).field_S.a(var7, var3, 0, 496 + -var7 >> -1336240831, 40);
        ((mk) this).field_R.a(60, var3 - -15, 0, 3 + var6, 40);
        ((mk) this).field_R.field_p = (mh) this;
        ((mk) this).field_S.field_p = (mh) this;
        ((mk) this).a(51448, (ag) (Object) ((mk) this).field_S);
        ((mk) this).a(51448, (ag) (Object) ((mk) this).field_R);
        ((mk) this).field_J = new mc((kn) this);
        ((mk) this).field_J.a(-((mk) this).field_P.field_v + ((mk) this).field_s + (-((mk) this).field_P.field_s - 60), 20 + ((mk) this).field_P.field_m, 0, ((mk) this).field_P.field_v + ((mk) this).field_P.field_s + 60, 150);
        ((mk) this).a(51448, (ag) (Object) ((mk) this).field_J);
        ((mk) this).a(496, 0, 0, 0, var3 + 55 - -var6);
    }

    public static void l(int param0) {
        field_L = null;
        field_O = null;
        field_Q = null;
        field_K = null;
        if (param0 != 0) {
            Object var2 = null;
            byte[] discarded$0 = mk.b((String) null, (byte) 119);
        }
    }

    final boolean a(int param0, ag param1, int param2, char param3) {
        if (super.a(param0, param1, param2, param3)) {
          return true;
        } else {
          if (98 == param2) {
            return ((mk) this).a(param1, (byte) -79);
          } else {
            if (-100 != (param2 ^ -1)) {
              return false;
            } else {
              return ((mk) this).b((byte) -82, param1);
            }
          }
        }
    }

    public final void a(boolean param0) {
        ((n) (Object) ((mk) this).field_P.a((byte) 100)).f(-2);
        if (param0) {
            Object var3 = null;
            int discarded$0 = this.a((String) null, -114, 4, (ag) null, -112, (String) null);
        }
    }

    final void a(ag param0, int param1, int param2, int param3) {
        super.a(param0, param1, param2, param3);
        ((mk) this).field_S.field_D = this.c(true);
    }

    public final void a(int param0, int param1, cj param2, int param3) {
        int var6 = 0;
        var6 = HostileSpawn.field_I ? 1 : 0;
        if (param0 == -2) {
          if (0 != param1) {
            if ((param1 ^ -1) != -2) {
              if (2 == param1) {
                l.a("conduct.ws", (byte) -83);
                return;
              } else {
                return;
              }
            } else {
              l.a("privacy.ws", (byte) 97);
              return;
            }
          } else {
            l.a("terms.ws", (byte) -104);
            return;
          }
        } else {
          field_H = -115;
          if (0 != param1) {
            if ((param1 ^ -1) != -2) {
              if (2 != param1) {
                return;
              } else {
                l.a("conduct.ws", (byte) -83);
                return;
              }
            } else {
              l.a("privacy.ws", (byte) 97);
              return;
            }
          } else {
            l.a("terms.ws", (byte) -104);
            return;
          }
        }
    }

    final static byte[] b(String param0, byte param1) {
        if (param1 > -118) {
            field_L = null;
            return ll.field_e.a(param0, "", 0);
        }
        return ll.field_e.a(param0, "", 0);
    }

    private final int a(ag param0, int param1, String param2, int param3, int param4) {
        nh var8 = new nh(20, param3, param1 + param4, 25, param0, false, 120, 3, jd.field_s, 16777215, param2);
        ((mk) this).a(param1 ^ 51328, (ag) (Object) var8);
        wj var7 = new wj(((sk) (Object) param0).a((byte) 114));
        ((mk) this).a(param1 + 51328, (ag) (Object) var7);
        var7.a(15, (var8.field_x + -15 >> 319751713) + var8.field_m, 0, var8.field_v + (var8.field_s - -3), 15);
        return var8.field_x;
    }

    private final int a(int param0, int param1, int param2, String param3, String param4, int param5, ag param6) {
        nh var10 = new nh(20, param1, 120 + param0, 25, param6, false, 120, param2, jd.field_s, 16777215, param4);
        ((mk) this).a(51448, (ag) (Object) var10);
        al var9 = new al(((sk) (Object) param6).a((byte) 90), param3, 126, param1 + var10.field_x, 50 + param0, param5);
        var9.field_p = (mh) this;
        ((mk) this).a(51448, (ag) (Object) var9);
        return var9.field_x + var10.field_x;
    }

    private final int a(String param0, ag param1, int param2, int param3, int param4) {
        nh var6 = null;
        var6 = new nh(20, param3, param4 + 120, 25, param1, false, 120, 3, jd.field_s, 16777215, param0);
        if (param2 >= -97) {
          return -86;
        } else {
          ((mk) this).a(51448, (ag) (Object) var6);
          return var6.field_x;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_O = new boolean[64];
        field_Q = "You have <%0> unread messages!";
        field_H = 0;
        field_I = 0;
    }
}
