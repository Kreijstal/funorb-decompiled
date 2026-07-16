/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qh extends fd implements im, ta, fc {
    private vd field_S;
    private vd field_I;
    static String field_N;
    private tg field_L;
    private gn field_P;
    static int field_K;
    private vd field_Q;
    private nk field_O;
    private vd field_E;
    static km field_R;
    private vd field_J;
    kl field_H;
    private vd field_D;
    private tg field_F;

    private final int a(int param0, int param1, String param2, fi param3, String param4, int param5) {
        Object var8 = null;
        if (param0 != 19259) {
          var8 = null;
          ((qh) this).a(-8, (tg) null, -33, -51, -84);
          return this.a(param4, 35, param2, (byte) 78, param5, param3, param1);
        } else {
          return this.a(param4, 35, param2, (byte) 78, param5, param3, param1);
        }
    }

    private final int a(String param0, int param1, String param2, byte param3, int param4, fi param5, int param6) {
        ng var9 = null;
        ej var10 = null;
        var10 = new ej(20, param4, 120 + param6, 25, param5, false, 120, 3, dj.field_h, 16777215, param2);
        if (param3 <= 40) {
          ((qh) this).field_H = null;
          ((qh) this).a((fi) (Object) var10, (byte) -78);
          var9 = new ng(((fg) (Object) param5).a(-1), param0, 126, var10.field_m + param4, 50 + param6, param1);
          var9.field_o = (cd) this;
          ((qh) this).a((fi) (Object) var9, (byte) -78);
          return var9.field_m + var10.field_m;
        } else {
          ((qh) this).a((fi) (Object) var10, (byte) -78);
          var9 = new ng(((fg) (Object) param5).a(-1), param0, 126, var10.field_m + param4, 50 + param6, param1);
          var9.field_o = (cd) this;
          ((qh) this).a((fi) (Object) var9, (byte) -78);
          return var9.field_m + var10.field_m;
        }
    }

    public final void a(String param0, boolean param1) {
        vd var3 = ((qh) this).field_I;
        String var4 = param0;
        ((wa) (Object) var3).a(var4, 81, param1);
    }

    private final String e(byte param0) {
        if (param0 != -117) {
            return null;
        }
        return "<u=2164A2><col=2164A2>";
    }

    final boolean a(fi param0, char param1, int param2, int param3) {
        int var5 = 0;
        if (super.a(param0, param1, param2, -125)) {
          return true;
        } else {
          if ((param2 ^ -1) == -99) {
            return ((qh) this).b(2, param0);
          } else {
            var5 = 77 % ((-75 - param3) / 36);
            if (99 != param2) {
              return false;
            } else {
              return ((qh) this).a(-16234, param0);
            }
          }
        }
    }

    public static void f(int param0) {
        field_N = null;
        field_R = null;
        if (param0 != 8246) {
            field_N = null;
        }
    }

    public final void a(int param0, int param1, boolean param2, nk param3) {
        int var6 = 0;
        Object var7 = null;
        var6 = Virogrid.field_F ? 1 : 0;
        if (-1 == (param0 ^ -1)) {
          wf.a("terms.ws", 12);
          if (!param2) {
            var7 = null;
            ((qh) this).a(33, 84, (fi) null, 92);
            return;
          } else {
            return;
          }
        } else {
          if ((param0 ^ -1) != -2) {
            if (param0 == 2) {
              wf.a("conduct.ws", 12);
              if (!param2) {
                var7 = null;
                ((qh) this).a(33, 84, (fi) null, 92);
                return;
              } else {
                return;
              }
            } else {
              if (param2) {
                return;
              } else {
                var7 = null;
                ((qh) this).a(33, 84, (fi) null, 92);
                return;
              }
            }
          } else {
            wf.a("privacy.ws", 12);
            if (param2) {
              return;
            } else {
              var7 = null;
              ((qh) this).a(33, 84, (fi) null, 92);
              return;
            }
          }
        }
    }

    private final boolean a(int param0) {
        if (this.a((fg) (Object) ((qh) this).field_I, param0 + -16765699)) {
          if (this.a((fg) (Object) ((qh) this).field_J, 11516)) {
            if (this.a((fg) (Object) ((qh) this).field_D, 11516)) {
              if (this.a((fg) (Object) ((qh) this).field_Q, 11516)) {
                if (this.a((fg) (Object) ((qh) this).field_E, 11516)) {
                  if (this.a((fg) (Object) ((qh) this).field_S, 11516)) {
                    if (param0 != 16777215) {
                      boolean discarded$2 = this.g(78);
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

    public qh() {
        super(0, 0, 496, 0, (ol) null);
        ((qh) this).field_I = new vd("", (cd) null, 12);
        ((qh) this).field_J = new vd("", (cd) null, 100);
        ((qh) this).field_D = new vd("", (cd) null, 100);
        ((qh) this).field_Q = new vd("", (cd) null, 20);
        ((qh) this).field_E = new vd("", (cd) null, 20);
        ((qh) this).field_S = new vd("", (cd) null, 3);
        int var1 = 1;
        ((qh) this).field_P = new gn("", (cd) null, var1 != 0);
        ((qh) this).field_L = new tg(vl.field_e, (cd) null);
        ((qh) this).field_F = new tg(ql.field_o, (cd) null);
        ((qh) this).field_I.field_h = sd.field_c;
        ((qh) this).field_J.field_h = pn.field_w;
        ((qh) this).field_D.field_h = rn.field_f;
        ((qh) this).field_Q.field_h = fe.field_Kb;
        ((qh) this).field_E.field_h = af.field_j;
        ((qh) this).field_S.field_h = da.field_i;
        ((qh) this).field_P.field_h = bk.field_d;
        ((qh) this).field_I.a((le) (Object) new di((wa) (Object) ((qh) this).field_I), (byte) 125);
        ((qh) this).field_J.a((le) (Object) new ve((wa) (Object) ((qh) this).field_J), (byte) 127);
        ((qh) this).field_D.a((le) (Object) new kd((wa) (Object) ((qh) this).field_D, (wa) (Object) ((qh) this).field_J), (byte) 127);
        ((qh) this).field_Q.a((le) (Object) new sn((wa) (Object) ((qh) this).field_Q, (wa) (Object) ((qh) this).field_I, (wa) (Object) ((qh) this).field_J), (byte) 126);
        ((qh) this).field_E.a((le) (Object) new ci((wa) (Object) ((qh) this).field_E, (wa) (Object) ((qh) this).field_Q), (byte) 125);
        ((qh) this).field_S.a((le) (Object) new kk((wa) (Object) ((qh) this).field_S), (byte) 127);
        ((qh) this).field_L.field_C = false;
        ((qh) this).field_L.field_w = (ol) (Object) new hf();
        ((qh) this).field_F.field_w = (ol) (Object) new ti();
        ((qh) this).field_I.field_w = (ol) (Object) new cc(10000536);
        cc dupTemp$0 = new cc(10000536);
        ((qh) this).field_D.field_w = (ol) (Object) dupTemp$0;
        ((qh) this).field_J.field_w = (ol) (Object) dupTemp$0;
        ((qh) this).field_S.field_w = (ol) (Object) new cc(10000536);
        ((qh) this).field_P.field_w = (ol) (Object) new ae();
        a dupTemp$1 = new a(10000536);
        ((qh) this).field_E.field_w = (ol) (Object) dupTemp$1;
        ((qh) this).field_Q.field_w = (ol) (Object) dupTemp$1;
        String var2 = oi.a(new String[2], eh.field_m, 2);
        int var3 = 20;
        var3 = var3 + this.a(170, 126, pc.field_d, var3, (fi) (Object) ((qh) this).field_J);
        var3 = var3 + (5 + this.a("", 20, nk.field_J, (byte) 83, var3, (fi) (Object) ((qh) this).field_D, 170));
        var3 = var3 + this.a(170, 126, hm.field_b, var3, (fi) (Object) ((qh) this).field_Q);
        var3 = var3 + (this.a(19259, 170, va.field_f, (fi) (Object) ((qh) this).field_E, pb.field_n, var3) + 5);
        var3 = var3 + (this.a(19259, 170, lm.field_g, (fi) (Object) ((qh) this).field_I, ul.field_f, var3) - -5);
        var3 = var3 + this.a(de.field_qb, var3, 170, -87, (fi) (Object) ((qh) this).field_S);
        ej var4 = new ej(46, var3, ((qh) this).field_g + -90, 25, (fi) (Object) ((qh) this).field_P, true, ((qh) this).field_g + -120, 5, dk.field_j, 11579568, ba.field_b);
        ((qh) this).a((fi) (Object) var4, (byte) -78);
        var3 = var3 + var4.field_m;
        aj var5 = new aj(dj.field_h, 0, 0, 0, 0, 16777215, -1, 0, 0, dj.field_h.field_H, -1, 2147483647, true);
        ((qh) this).field_O = new nk(var2, (ol) (Object) var5);
        ((qh) this).field_O.field_h = "";
        ((qh) this).field_O.a(al.field_g, (byte) -71, 0);
        ((qh) this).field_O.a(al.field_g, (byte) -77, 1);
        ((qh) this).field_O.field_o = (cd) this;
        ((qh) this).field_O.a(-90 + ((qh) this).field_g, var3, 46, (byte) -125);
        var3 = var3 + (15 + ((qh) this).field_O.field_m);
        ((qh) this).a((fi) (Object) ((qh) this).field_O, (byte) -78);
        int var6 = 4;
        int var7 = 200;
        ((qh) this).field_L.a(40, true, var3, -var7 + 496 >> 764913441, var7);
        ((qh) this).field_F.a(40, true, var3 - -15, 3 + var6, 60);
        ((qh) this).field_F.field_o = (cd) this;
        ((qh) this).field_L.field_o = (cd) this;
        ((qh) this).a((fi) (Object) ((qh) this).field_L, (byte) -78);
        ((qh) this).a((fi) (Object) ((qh) this).field_F, (byte) -78);
        ((qh) this).field_H = new kl((fc) this);
        ((qh) this).field_H.a(150, true, ((qh) this).field_I.field_u + 20, ((qh) this).field_I.field_l + ((qh) this).field_I.field_g - -60, ((qh) this).field_g - ((qh) this).field_I.field_l + (-((qh) this).field_I.field_g - 60));
        ((qh) this).a((fi) (Object) ((qh) this).field_H, (byte) -78);
        ((qh) this).a(var6 + (55 + var3), true, 0, 0, 496);
    }

    private final int a(int param0, int param1, String param2, int param3, fi param4) {
        ej var6 = null;
        if (param1 != 126) {
          return -105;
        } else {
          var6 = new ej(20, param3, param0 + 120, 25, param4, false, 120, 3, dj.field_h, 16777215, param2);
          ((qh) this).a((fi) (Object) var6, (byte) -78);
          return var6.field_m;
        }
    }

    private final boolean g(int param0) {
        if (!(this.a(16777215))) {
            return false;
        }
        int var2 = -76 % ((-1 - param0) / 53);
        int var3 = -1;
        try {
            if (false) throw (NumberFormatException) null;
            var3 = Integer.parseInt(((qh) this).field_S.field_n);
        } catch (NumberFormatException numberFormatException) {
        }
        return af.a(((qh) this).field_I.field_n, ((qh) this).field_Q.field_n, (qh) this, ((qh) this).field_P.field_z, 122, ((qh) this).field_J.field_n, var3);
    }

    final static void f(byte param0) {
        L0: {
          if (null != hf.field_w) {
            hf.field_w.h(true);
            break L0;
          } else {
            break L0;
          }
        }
        qi.field_c = new wk();
        fi.field_t.b((fi) (Object) qi.field_c, (byte) -53);
        if (param0 < 10) {
          field_R = null;
          return;
        } else {
          return;
        }
    }

    private final String g(byte param0) {
        if (param0 != -1) {
            ((qh) this).field_J = null;
            return "</col></u>";
        }
        return "</col></u>";
    }

    private final boolean a(fg param0, int param1) {
        le var3 = null;
        wl var4 = null;
        Object var5 = null;
        var3 = param0.a(param1 + -11517);
        if (var3 == null) {
          return true;
        } else {
          if (param1 == 11516) {
            var4 = var3.a(-22243);
            if (var4 == ee.field_c) {
              return false;
            } else {
              if (var4 == gd.field_r) {
                return false;
              } else {
                if (wm.field_v == var4) {
                  return false;
                } else {
                  return true;
                }
              }
            }
          } else {
            var5 = null;
            ((qh) this).a(-125, 60, false, (nk) null);
            var4 = var3.a(-22243);
            if (var4 == ee.field_c) {
              return false;
            } else {
              if (var4 == gd.field_r) {
                return false;
              } else {
                if (wm.field_v == var4) {
                  return false;
                } else {
                  return true;
                }
              }
            }
          }
        }
    }

    final void a(int param0, int param1, fi param2, int param3) {
        super.a(param0, 115, param2, param3);
        if (param1 <= 113) {
          ((qh) this).field_P = null;
          ((qh) this).field_L.field_C = this.a(16777215);
          return;
        } else {
          ((qh) this).field_L.field_C = this.a(16777215);
          return;
        }
    }

    public final void a(byte param0) {
        ((di) (Object) ((qh) this).field_I.a(-1)).c(false);
        if (param0 != -72) {
            Object var3 = null;
            int discarded$0 = this.a(57, 12, (String) null, (fi) null, (String) null, 10);
        }
    }

    public final void a(int param0, tg param1, int param2, int param3, int param4) {
        if (param1 != ((qh) this).field_F) {
          if (((qh) this).field_L != param1) {
            if (param0 != 12085) {
              ((qh) this).field_H = null;
              return;
            } else {
              return;
            }
          } else {
            boolean discarded$3 = this.g(param0 ^ -12146);
            if (param0 == 12085) {
              return;
            } else {
              ((qh) this).field_H = null;
              return;
            }
          }
        } else {
          ee.a((byte) 122);
          if (param0 == 12085) {
            return;
          } else {
            ((qh) this).field_H = null;
            return;
          }
        }
    }

    final static void a(byte param0, boolean param1) {
        jm stackIn_3_0 = null;
        jm stackOut_2_0 = null;
        jm stackOut_1_0 = null;
        L0: {
          if (!param1) {
            stackOut_2_0 = new jm(mj.field_A, ia.field_d);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = new jm(gf.field_A, l.field_b);
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        he.field_pc = stackIn_3_0;
        ao.field_Eb = new km(0L, (km) null);
        ao.field_Eb.a(0, (km) (Object) he.field_pc.field_c);
        if (param0 != -68) {
          return;
        } else {
          ao.field_Eb.a(0, fb.field_o);
          pm.field_n = new km(0L, fn.field_e);
          jb.field_J = new km(0L, (km) null);
          pm.field_n.a(0, jj.field_m);
          pm.field_n.a(0, jb.field_J);
          jb.field_J.a(param0 ^ -68, ij.field_m);
          jb.field_J.a(0, na.field_Ib);
          hm.a(param1, true);
          return;
        }
    }

    private final int a(String param0, int param1, int param2, int param3, fi param4) {
        w var7 = null;
        ej var8 = null;
        var8 = new ej(20, param1, param2 + 120, 25, param4, false, 120, 3, dj.field_h, 16777215, param0);
        if (param3 >= -1) {
          ((qh) this).field_E = null;
          ((qh) this).a((fi) (Object) var8, (byte) -78);
          var7 = new w(((fg) (Object) param4).a(-1));
          ((qh) this).a((fi) (Object) var7, (byte) -78);
          var7.a(15, true, var8.field_u + (var8.field_m + -15 >> -1431823199), var8.field_g + var8.field_l + 3, 15);
          return var8.field_m;
        } else {
          ((qh) this).a((fi) (Object) var8, (byte) -78);
          var7 = new w(((fg) (Object) param4).a(-1));
          ((qh) this).a((fi) (Object) var7, (byte) -78);
          var7.a(15, true, var8.field_u + (var8.field_m + -15 >> -1431823199), var8.field_g + var8.field_l + 3, 15);
          return var8.field_m;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_N = "To server list";
    }
}
