/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mk extends cj implements cm, ij, nc {
    private br field_L;
    private ck field_R;
    private br field_F;
    oj field_V;
    static String field_K;
    static String field_S;
    private br field_Q;
    static ka field_P;
    static int field_M;
    private br field_T;
    private br field_H;
    private d field_O;
    private pn field_N;
    private d field_I;
    private br field_U;
    static int field_E;
    static int field_G;
    static nj field_J;

    public final void a(int param0, d param1, byte param2, int param3, int param4) {
        int var6 = 0;
        if (((mk) this).field_O != param1) {
          if (param1 == ((mk) this).field_I) {
            boolean discarded$2 = this.a((byte) 14);
            var6 = 17 % ((-63 - param2) / 51);
            return;
          } else {
            var6 = 17 % ((-63 - param2) / 51);
            return;
          }
        } else {
          sg.b((byte) 81);
          var6 = 17 % ((-63 - param2) / 51);
          return;
        }
    }

    private final boolean a(ik param0, int param1) {
        of var3 = null;
        int var4 = 0;
        ba var5 = null;
        var3 = param0.a((byte) -5);
        if (var3 == null) {
          return true;
        } else {
          var4 = 71 % ((param1 - 44) / 48);
          var5 = var3.a(-23996);
          if (var5 != ir.field_a) {
            if (var5 != tk.field_n) {
              if (var5 == nh.field_r) {
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

    private final boolean a(byte param0) {
        if (!(this.l(param0 ^ -6553))) {
            return false;
        }
        int var2 = -1;
        if (param0 != 14) {
            return false;
        }
        try {
            if (false) throw (NumberFormatException) null;
            var2 = Integer.parseInt(((mk) this).field_T.field_w);
        } catch (NumberFormatException numberFormatException) {
        }
        return bg.a(((mk) this).field_H.field_w, var2, ((mk) this).field_F.field_w, ((mk) this).field_R.field_G, ((mk) this).field_U.field_w, (byte) 66, (mk) this);
    }

    final void a(byte param0, int param1, int param2, iq param3) {
        super.a((byte) 34, param1, param2, param3);
        ((mk) this).field_I.field_F = this.l(-6551);
        if (param0 <= 6) {
            Object var6 = null;
            boolean discarded$0 = ((mk) this).a('￳', -83, 76, (iq) null);
        }
    }

    private final int b(String param0, int param1, iq param2, int param3, int param4) {
        mg var6 = null;
        if (param1 < 45) {
          boolean discarded$1 = this.l(115);
          var6 = new mg(20, param4, param3 + 120, 25, param2, false, 120, 3, qc.field_x, 16777215, param0);
          ((mk) this).c((byte) 107, (iq) (Object) var6);
          return var6.field_s;
        } else {
          var6 = new mg(20, param4, param3 + 120, 25, param2, false, 120, 3, qc.field_x, 16777215, param0);
          ((mk) this).c((byte) 107, (iq) (Object) var6);
          return var6.field_s;
        }
    }

    private final int a(String param0, int param1, iq param2, int param3, int param4) {
        Object var8 = null;
        lr var10 = null;
        mg var11 = null;
        lr var12 = null;
        mg var13 = null;
        if (param4 != 268) {
          var8 = null;
          int discarded$1 = this.a(107, -127, -24, (iq) null, (String) null, -91, (String) null);
          var11 = new mg(20, param3, 120 + param1, 25, param2, false, 120, 3, qc.field_x, 16777215, param0);
          ((mk) this).c((byte) -75, (iq) (Object) var11);
          var10 = new lr(((ik) (Object) param2).a((byte) -5));
          ((mk) this).c((byte) 79, (iq) (Object) var10);
          var10.a(false, var11.field_n + (var11.field_o - -3), var11.field_t + (-15 + var11.field_s >> -1300490943), 15, 15);
          return var11.field_s;
        } else {
          var13 = new mg(20, param3, 120 + param1, 25, param2, false, 120, 3, qc.field_x, 16777215, param0);
          ((mk) this).c((byte) -75, (iq) (Object) var13);
          var12 = new lr(((ik) (Object) param2).a((byte) -5));
          ((mk) this).c((byte) 79, (iq) (Object) var12);
          var12.a(false, var13.field_n + (var13.field_o - -3), var13.field_t + (-15 + var13.field_s >> -1300490943), 15, 15);
          return var13.field_s;
        }
    }

    public final void a(pn param0, int param1, int param2, byte param3) {
        int var6 = 0;
        Object var7 = null;
        var6 = Vertigo2.field_L ? 1 : 0;
        if (param3 == 70) {
          if (param1 != 0) {
            if (param1 != -2) {
              if (-3 != param1) {
                return;
              } else {
                se.a("conduct.ws", 12);
                return;
              }
            } else {
              se.a("privacy.ws", 12);
              return;
            }
          } else {
            se.a("terms.ws", 12);
            return;
          }
        } else {
          var7 = null;
          boolean discarded$4 = ((mk) this).a('', -23, 79, (iq) null);
          if (param1 != 0) {
            if (param1 != -2) {
              if (-3 != param1) {
                return;
              } else {
                se.a("conduct.ws", 12);
                return;
              }
            } else {
              se.a("privacy.ws", 12);
              return;
            }
          } else {
            se.a("terms.ws", 12);
            return;
          }
        }
    }

    private final String i(int param0) {
        if (param0 != 23559) {
            return null;
        }
        return "<u=2164A2><col=2164A2>";
    }

    private final boolean l(int param0) {
        if (this.a((ik) (Object) ((mk) this).field_H, param0 ^ 6537)) {
          if (this.a((ik) (Object) ((mk) this).field_F, -44)) {
            if (this.a((ik) (Object) ((mk) this).field_L, -102)) {
              if (this.a((ik) (Object) ((mk) this).field_U, -61)) {
                if (this.a((ik) (Object) ((mk) this).field_Q, param0 ^ 6625)) {
                  if (this.a((ik) (Object) ((mk) this).field_T, -16)) {
                    if (param0 != -6551) {
                      mk.b(-8, -69);
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

    private final String j(int param0) {
        if (param0 != 10000536) {
            mk.b(8, -116);
            return "</col></u>";
        }
        return "</col></u>";
    }

    final boolean a(char param0, int param1, int param2, iq param3) {
        if (super.a(param0, param1, param2, param3)) {
          return true;
        } else {
          if (98 == param2) {
            return ((mk) this).a(param1 ^ 32340, param3);
          } else {
            if (param2 != 99) {
              return false;
            } else {
              return ((mk) this).b((byte) -72, param3);
            }
          }
        }
    }

    public mk() {
        super(0, 0, 496, 0, (ur) null);
        ((mk) this).field_H = new br("", (uf) null, 12);
        ((mk) this).field_F = new br("", (uf) null, 100);
        ((mk) this).field_L = new br("", (uf) null, 100);
        ((mk) this).field_U = new br("", (uf) null, 20);
        ((mk) this).field_Q = new br("", (uf) null, 20);
        ((mk) this).field_T = new br("", (uf) null, 3);
        int var1 = 1;
        ((mk) this).field_R = new ck("", (uf) null, var1 != 0);
        ((mk) this).field_I = new d(nq.field_K, (uf) null);
        ((mk) this).field_O = new d(tc.field_a, (uf) null);
        ((mk) this).field_H.field_q = ho.field_d;
        ((mk) this).field_F.field_q = ak.field_f;
        ((mk) this).field_L.field_q = df.field_i;
        ((mk) this).field_U.field_q = dl.field_c;
        ((mk) this).field_Q.field_q = jk.field_c;
        ((mk) this).field_T.field_q = ed.field_s;
        ((mk) this).field_R.field_q = pq.field_b;
        ((mk) this).field_H.a(true, (of) (Object) new hk((kp) (Object) ((mk) this).field_H));
        ((mk) this).field_F.a(true, (of) (Object) new dk((kp) (Object) ((mk) this).field_F));
        ((mk) this).field_L.a(true, (of) (Object) new oa((kp) (Object) ((mk) this).field_L, (kp) (Object) ((mk) this).field_F));
        ((mk) this).field_U.a(true, (of) (Object) new wc((kp) (Object) ((mk) this).field_U, (kp) (Object) ((mk) this).field_H, (kp) (Object) ((mk) this).field_F));
        ((mk) this).field_Q.a(true, (of) (Object) new rf((kp) (Object) ((mk) this).field_Q, (kp) (Object) ((mk) this).field_U));
        ((mk) this).field_T.a(true, (of) (Object) new na((kp) (Object) ((mk) this).field_T));
        ((mk) this).field_I.field_F = false;
        ((mk) this).field_I.field_B = (ur) (Object) new vo();
        ((mk) this).field_O.field_B = (ur) (Object) new jc();
        ((mk) this).field_H.field_B = (ur) (Object) new ml(10000536);
        ((mk) this).field_L.field_B = (ur) (Object) new ml(10000536);
        ((mk) this).field_F.field_B = (ur) (Object) new ml(10000536);
        ((mk) this).field_T.field_B = (ur) (Object) new ml(10000536);
        ((mk) this).field_R.field_B = (ur) (Object) new kb();
        ((mk) this).field_Q.field_B = (ur) (Object) new om(10000536);
        ((mk) this).field_U.field_B = (ur) (Object) new om(10000536);
        String var2 = Vertigo2.a(new String[2], k.field_b, -125);
        int var3 = 20;
        var3 = var3 + this.b(le.field_c, 48, (iq) (Object) ((mk) this).field_F, 170, var3);
        var3 = var3 + (5 + this.a(27557, var3, 20, (iq) (Object) ((mk) this).field_L, "", 170, re.field_f));
        var3 = var3 + this.b(uc.field_c, 125, (iq) (Object) ((mk) this).field_U, 170, var3);
        var3 = var3 + (5 + this.a(ag.field_c, (iq) (Object) ((mk) this).field_Q, var3, ln.field_a, 0, 170));
        var3 = var3 + (this.a(jg.field_m, (iq) (Object) ((mk) this).field_H, var3, kd.field_q, 0, 170) - -5);
        var3 = var3 + this.a(po.field_b, 170, (iq) (Object) ((mk) this).field_T, var3, 268);
        mg var4 = new mg(46, var3, ((mk) this).field_n + -90, 25, (iq) (Object) ((mk) this).field_R, true, -120 + ((mk) this).field_n, 5, bl.field_N, 11579568, ll.field_d);
        ((mk) this).c((byte) 88, (iq) (Object) var4);
        var3 = var3 + var4.field_s;
        va var5 = new va(qc.field_x, 0, 0, 0, 0, 16777215, -1, 0, 0, qc.field_x.field_z, -1, 2147483647, true);
        ((mk) this).field_N = new pn(var2, (ur) (Object) var5);
        ((mk) this).field_N.field_q = "";
        ((mk) this).field_N.a(0, 0, fm.field_c);
        ((mk) this).field_N.a(1, 0, fm.field_c);
        ((mk) this).field_N.field_v = (uf) this;
        ((mk) this).field_N.b(46, var3, (byte) 119, ((mk) this).field_n - 90);
        var3 = var3 + (15 + ((mk) this).field_N.field_s);
        ((mk) this).c((byte) 94, (iq) (Object) ((mk) this).field_N);
        int var6 = 4;
        int var7 = 200;
        ((mk) this).field_I.a(false, 496 - var7 >> 729213281, var3, 40, var7);
        ((mk) this).field_O.a(false, 3 + var6, 15 + var3, 40, 60);
        ((mk) this).field_O.field_v = (uf) this;
        ((mk) this).field_I.field_v = (uf) this;
        ((mk) this).c((byte) 119, (iq) (Object) ((mk) this).field_I);
        ((mk) this).c((byte) 110, (iq) (Object) ((mk) this).field_O);
        ((mk) this).field_V = new oj((nc) this);
        ((mk) this).field_V.a(false, 60 + ((mk) this).field_H.field_n + ((mk) this).field_H.field_o, 20 + ((mk) this).field_H.field_t, 150, -((mk) this).field_H.field_n + -((mk) this).field_H.field_o + ((mk) this).field_n + -60);
        ((mk) this).c((byte) 116, (iq) (Object) ((mk) this).field_V);
        ((mk) this).a(false, 0, 0, var6 + (var3 + 55), 496);
    }

    final static void b(int param0, int param1) {
        mi var2 = null;
        int var3 = 0;
        var2 = uh.field_Wb;
        var2.j(param1, 120);
        var2.field_u = var2.field_u + 1;
        var3 = var2.field_u;
        var2.f(2, 87);
        var2.a(0, -10140, qc.field_w, qc.field_w.length);
        var2.f(ua.field_a, 103);
        if (param0 >= -76) {
          mk.b(102, 66);
          var2.f(kg.field_y, 106);
          var2.a(0, -10140, dj.field_a, dj.field_a.length);
          var2.b((byte) 24, var2.field_u + -var3);
          return;
        } else {
          var2.f(kg.field_y, 106);
          var2.a(0, -10140, dj.field_a, dj.field_a.length);
          var2.b((byte) 24, var2.field_u + -var3);
          return;
        }
    }

    public static void k(int param0) {
        field_S = null;
        field_K = null;
        field_P = null;
        field_J = null;
        if (param0 != 4) {
            field_E = -33;
        }
    }

    public final void a(int param0) {
        ((hk) (Object) ((mk) this).field_H.a((byte) -5)).h(-1);
        if (param0 != -4384) {
            field_K = null;
        }
    }

    private final int a(String param0, iq param1, int param2, String param3, int param4, int param5) {
        if (param4 != 0) {
            return 85;
        }
        return this.a(param4 ^ 27557, param2, 35, param1, param0, param5, param3);
    }

    private final int a(int param0, int param1, int param2, iq param3, String param4, int param5, String param6) {
        qe var9 = null;
        mg var10 = null;
        var10 = new mg(20, param1, param5 + 120, 25, param3, false, 120, 3, qc.field_x, 16777215, param6);
        ((mk) this).c((byte) -30, (iq) (Object) var10);
        var9 = new qe(((ik) (Object) param3).a((byte) -5), param4, 126, param1 + var10.field_s, param5 - -50, param2);
        var9.field_v = (uf) this;
        ((mk) this).c((byte) -110, (iq) (Object) var9);
        if (param0 != 27557) {
          ((mk) this).field_R = null;
          return var9.field_s + var10.field_s;
        } else {
          return var9.field_s + var10.field_s;
        }
    }

    public final void a(String param0, int param1) {
        br var3 = ((mk) this).field_H;
        String var4 = param0;
        if (param1 != 4944) {
            return;
        }
        ((kp) (Object) var3).a(var4, -74, false);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_K = "Discard";
        field_E = 360;
    }
}
