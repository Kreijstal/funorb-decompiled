/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ir extends f implements dl, bp {
    static int field_D;
    private fa field_H;
    static int field_E;
    private kg field_G;
    bj field_F;
    private kg field_I;

    private final int a(int param0, int param1, int param2, vg param3, String param4, String param5, boolean param6) {
        ah var9 = null;
        pg var10 = null;
        if (!param6) {
          ((ir) this).field_I = null;
          var10 = new pg(20, param1, 120 - -param2, 25, param3, false, 120, 3, gn.field_u, 16777215, param5);
          ((ir) this).b((byte) -68, (vg) (Object) var10);
          var9 = new ah(((ki) (Object) param3).a((byte) 80), param4, 126, var10.field_n + param1, param2 + 25, param0);
          var9.field_u = (ko) this;
          ((ir) this).b((byte) -100, (vg) (Object) var9);
          return var9.field_n + var10.field_n;
        } else {
          var10 = new pg(20, param1, 120 - -param2, 25, param3, false, 120, 3, gn.field_u, 16777215, param5);
          ((ir) this).b((byte) -68, (vg) (Object) var10);
          var9 = new ah(((ki) (Object) param3).a((byte) 80), param4, 126, var10.field_n + param1, param2 + 25, param0);
          var9.field_u = (ko) this;
          ((ir) this).b((byte) -100, (vg) (Object) var9);
          return var9.field_n + var10.field_n;
        }
    }

    final void a(int param0, int param1, vg param2, byte param3) {
        super.a(param0, param1, param2, param3);
        ((ir) this).field_I.field_y = this.k(-60);
    }

    public final void a(int param0) {
        Object var3 = null;
        if (param0 != 2147483647) {
          var3 = null;
          int discarded$2 = this.a(-61, -100, -33, (vg) null, (String) null, (String) null, true);
          ((ec) (Object) ((ir) this).field_H.a((byte) 63)).d(0);
          return;
        } else {
          ((ec) (Object) ((ir) this).field_H.a((byte) 63)).d(0);
          return;
        }
    }

    public final void a(int param0, String param1) {
        fa var3 = null;
        String var4 = null;
        if (param0 != 15270) {
          field_E = -126;
          var3 = ((ir) this).field_H;
          var4 = param1;
          ((go) (Object) var3).a(63, var4, false);
          return;
        } else {
          var3 = ((ir) this).field_H;
          var4 = param1;
          ((go) (Object) var3).a(63, var4, false);
          return;
        }
    }

    private final void a(byte param0) {
        if (param0 != -1) {
            return;
        }
        if (!(this.k(-60))) {
            return;
        }
        he.a(8192, ((ir) this).field_H.field_s);
    }

    final static void l(int param0) {
        eb.field_f = new String[cb.field_j];
        eb.field_f[11] = wg.field_g;
        eb.field_f[21] = fs.field_j;
        eb.field_f[7] = ls.field_c;
        eb.field_f[16] = ga.field_o;
        eb.field_f[18] = no.field_a;
        eb.field_f[4] = la.field_o;
        eb.field_f[9] = qj.field_a;
        eb.field_f[15] = bc.field_h;
        if (param0 != 1062) {
          ir.l(-42);
          eb.field_f[20] = qh.field_w;
          eb.field_f[19] = pl.field_a;
          eb.field_f[5] = qf.field_b;
          eb.field_f[13] = cg.field_G;
          eb.field_f[17] = ci.field_g;
          eb.field_f[6] = qq.field_x;
          return;
        } else {
          eb.field_f[20] = qh.field_w;
          eb.field_f[19] = pl.field_a;
          eb.field_f[5] = qf.field_b;
          eb.field_f[13] = cg.field_G;
          eb.field_f[17] = ci.field_g;
          eb.field_f[6] = qq.field_x;
          return;
        }
    }

    public final void a(kg param0, int param1, int param2, int param3, int param4) {
        if (((ir) this).field_G != param0) {
          if (((ir) this).field_I == param0) {
            this.a((byte) -1);
            if (param1 != 6) {
              ((ir) this).a(97);
              return;
            } else {
              return;
            }
          } else {
            if (param1 == 6) {
              return;
            } else {
              ((ir) this).a(97);
              return;
            }
          }
        } else {
          la.a(false);
          if (param1 == 6) {
            return;
          } else {
            ((ir) this).a(97);
            return;
          }
        }
    }

    private final int a(byte param0, int param1, int param2, vg param3, String param4, String param5) {
        if (param0 >= -77) {
            return -45;
        }
        return this.a(35, param2, param1, param3, param4, param5, true);
    }

    private final boolean k(int param0) {
        if (param0 == -60) {
          if (!this.a((ki) (Object) ((ir) this).field_H, (byte) 13)) {
            return false;
          } else {
            return true;
          }
        } else {
          ((ir) this).field_F = null;
          if (!this.a((ki) (Object) ((ir) this).field_H, (byte) 13)) {
            return false;
          } else {
            return true;
          }
        }
    }

    final boolean a(int param0, char param1, int param2, vg param3) {
        Object var6 = null;
        if (!super.a(param0, param1, param2 ^ 0, param3)) {
          if (-99 != (param0 ^ -1)) {
            if (param2 == 13) {
              if (99 == param0) {
                return ((ir) this).a(param3, 92);
              } else {
                return false;
              }
            } else {
              var6 = null;
              ((ir) this).a(59, 66, (vg) null, (byte) 56);
              if (99 == param0) {
                return ((ir) this).a(param3, 92);
              } else {
                return false;
              }
            }
          } else {
            return ((ir) this).a(param3, true);
          }
        } else {
          return true;
        }
    }

    private final boolean a(ki param0, byte param1) {
        gk var3 = null;
        u var4 = null;
        int stackIn_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        if (param1 == 13) {
          var3 = param0.a((byte) 92);
          if (var3 == null) {
            return true;
          } else {
            L0: {
              var4 = var3.c(param1 ^ 26);
              if (var4 != p.field_g) {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                break L0;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L0;
              }
            }
            return stackIn_6_0 != 0;
          }
        } else {
          return true;
        }
    }

    public ir() {
        super(0, 0, 496, 0, (iq) null);
        ((ir) this).field_H = new fa("", (ko) null, 12);
        o var1 = new o(mf.field_x, 0, 0, 0, 0, 16777215, -1, 3, 0, gn.field_u.field_J, -1, 2147483647, true);
        vg var2 = new vg(rm.field_i, (iq) (Object) var1, (ko) null);
        ((ir) this).field_I = new kg(ck.field_c, (ko) null);
        ((ir) this).field_G = new kg(fb.field_bc, (ko) null);
        ((ir) this).field_H.field_v = ol.field_i;
        ((ir) this).field_H.a((gk) (Object) new ec((go) (Object) ((ir) this).field_H), 8945);
        ((ir) this).field_I.field_y = false;
        ((ir) this).field_I.field_p = (iq) (Object) new qp();
        ((ir) this).field_G.field_p = (iq) (Object) new rq();
        ((ir) this).field_H.field_p = (iq) (Object) new rr(10000536);
        int var3 = 20;
        int var4 = 4;
        int var5 = 200;
        var2.a(var3, 50, (byte) 121, 20, 270);
        ((ir) this).b((byte) -47, var2);
        var3 += 50;
        var3 = var3 + (this.a((byte) -110, 170, var3, (vg) (Object) ((ir) this).field_H, rf.field_m, tr.field_zb) - -5);
        ((ir) this).field_I.a(var3, 40, (byte) 123, 496 - var5 >> -2016949247, var5);
        ((ir) this).field_G.a(var3 - -15, 40, (byte) 127, var4 + 3, 60);
        ((ir) this).field_G.field_u = (ko) this;
        ((ir) this).field_I.field_u = (ko) this;
        ((ir) this).b((byte) -63, (vg) (Object) ((ir) this).field_I);
        ((ir) this).b((byte) -48, (vg) (Object) ((ir) this).field_G);
        ((ir) this).field_F = new bj((dl) this);
        ((ir) this).field_F.a(20, 150, (byte) 115, ((ir) this).field_H.field_m - (-((ir) this).field_H.field_x + -60), ((ir) this).field_x + -((ir) this).field_H.field_m + (-((ir) this).field_H.field_x - 60));
        ((ir) this).b((byte) -98, (vg) (Object) ((ir) this).field_F);
        ((ir) this).a(0, 55 + var3 + var4, (byte) 117, 0, 496);
    }

    static {
    }
}
