/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gda extends vd implements uja, lja {
    dd field_E;
    private vn field_G;
    private hf field_F;
    private hf field_C;

    private final void d(byte param0) {
        if (param0 <= 29) {
            return;
        }
        if (!this.j(-111)) {
            return;
        }
        gaa.a(((gda) this).field_G.field_w, -123);
    }

    private final boolean j(int param0) {
        if (!this.a((mca) (Object) ((gda) this).field_G, -1)) {
          return false;
        } else {
          if (param0 >= -94) {
            gda.a(true, 125L);
            return true;
          } else {
            return true;
          }
        }
    }

    public gda() {
        super(0, 0, 496, 0, (qda) null);
        ((gda) this).field_G = new vn("", (pl) null, 12);
        gha var1 = new gha(oc.field_l, 0, 0, 0, 0, 16777215, -1, 3, 0, jca.field_a.field_u, -1, 2147483647, true);
        wj var2 = new wj(eq.field_f, (qda) (Object) var1, (pl) null);
        ((gda) this).field_F = new hf(ne.field_m, (pl) null);
        ((gda) this).field_C = new hf(bga.field_f, (pl) null);
        ((gda) this).field_G.field_h = cu.field_z;
        ((gda) this).field_G.a(7, (qu) (Object) new tt((lka) (Object) ((gda) this).field_G));
        ((gda) this).field_F.field_z = false;
        ((gda) this).field_F.field_f = (qda) (Object) new ff();
        ((gda) this).field_C.field_f = (qda) (Object) new pka();
        ((gda) this).field_G.field_f = (qda) (Object) new oka(10000536);
        int var3 = 20;
        int var4 = 4;
        int var5 = 200;
        var2.a(20, 50, (byte) 59, 270, var3);
        var3 += 50;
        ((gda) this).c(var2, -123);
        var3 = var3 + (5 + this.a(var3, (wj) (Object) ((gda) this).field_G, gp.field_v, 170, saa.field_u, false));
        ((gda) this).field_F.a(-var5 + 496 >> -1871468447, 40, (byte) 59, var5, var3);
        ((gda) this).field_C.a(var4 - -3, 40, (byte) 59, 60, var3 - -15);
        ((gda) this).field_C.field_k = (pl) this;
        ((gda) this).field_F.field_k = (pl) this;
        ((gda) this).c((wj) (Object) ((gda) this).field_F, 91);
        ((gda) this).c((wj) (Object) ((gda) this).field_C, 27);
        ((gda) this).field_E = new dd((uja) this);
        ((gda) this).field_E.a(60 + ((gda) this).field_G.field_p + ((gda) this).field_G.field_s, 150, (byte) 59, -((gda) this).field_G.field_p + -((gda) this).field_G.field_s + ((gda) this).field_p - 60, 20);
        ((gda) this).c((wj) (Object) ((gda) this).field_E, 74);
        ((gda) this).a(0, 55 + var3 + var4, (byte) 59, 496, 0);
    }

    public final void a(int param0) {
        ((tt) (Object) ((gda) this).field_G.a(16728128)).d(-116);
        if (param0 != 14322) {
            ((gda) this).field_F = null;
        }
    }

    private final int a(int param0, wj param1, String param2, int param3, String param4, boolean param5) {
        if (param5) {
            return -6;
        }
        return this.a(param2, param4, param3, (byte) 124, param1, param0, 35);
    }

    public final void a(String param0, byte param1) {
        int var3 = -77 / ((-41 - param1) / 37);
        vn var4 = ((gda) this).field_G;
        String var5 = param0;
        ((lka) (Object) var4).a((byte) 122, var5, false);
    }

    final static void a(boolean param0, long param1) {
        Object var4 = null;
        if (!param0) {
          if (param1 > 0L) {
            if (0L == param1 % 10L) {
              pv.a(20182, param1 - 1L);
              pv.a(20182, 1L);
              return;
            } else {
              pv.a(20182, param1);
              return;
            }
          } else {
            return;
          }
        } else {
          var4 = null;
          gda.a(67, (java.awt.Component) null);
          if (param1 > 0L) {
            if (0L == param1 % 10L) {
              pv.a(20182, param1 - 1L);
              pv.a(20182, 1L);
              return;
            } else {
              pv.a(20182, param1);
              return;
            }
          } else {
            return;
          }
        }
    }

    final void a(int param0, int param1, wj param2, int param3) {
        this.a(param0, param1, param2, param3);
        ((gda) this).field_F.field_z = this.j(-117);
    }

    final boolean a(int param0, int param1, char param2, wj param3) {
        if (!this.a(param0, param1, param2, param3)) {
          if (98 != param1) {
            if ((param1 ^ -1) == -100) {
              return ((gda) this).b(param3, param0 ^ 11);
            } else {
              return false;
            }
          } else {
            return ((gda) this).a(-123, param3);
          }
        } else {
          return true;
        }
    }

    private final int a(String param0, String param1, int param2, byte param3, wj param4, int param5, int param6) {
        ge var11 = new ge(20, param5, param2 + 120, 25, param4, false, 120, 3, jca.field_a, 16777215, param0);
        ((gda) this).c((wj) (Object) var11, 111);
        int var9 = -90 / ((param3 - 25) / 34);
        nf var10 = new nf(((mca) (Object) param4).a(16728128), param1, 126, param5 - -var11.field_q, 25 + param2, param6);
        var10.field_k = (pl) this;
        ((gda) this).c((wj) (Object) var10, 30);
        return var10.field_q + var11.field_q;
    }

    static long a(long param0, long param1) {
        return param0 & param1;
    }

    final static void a(int param0, java.awt.Component param1) {
        param1.removeMouseListener((java.awt.event.MouseListener) (Object) uc.field_m);
        param1.removeMouseMotionListener((java.awt.event.MouseMotionListener) (Object) uc.field_m);
        param1.removeFocusListener((java.awt.event.FocusListener) (Object) uc.field_m);
        oga.field_q = 0;
        if (param0 > -14) {
            Object var3 = null;
            gda.a(-19, (java.awt.Component) null);
        }
    }

    public final void a(int param0, hf param1, int param2, byte param3, int param4) {
        Object var7 = null;
        if (param1 == ((gda) this).field_C) {
          dd.d((byte) -83);
          if (param3 >= 50) {
            return;
          } else {
            var7 = null;
            int discarded$3 = this.a(7, (wj) null, (String) null, 77, (String) null, true);
            return;
          }
        } else {
          if (((gda) this).field_F != param1) {
            if (param3 < 50) {
              var7 = null;
              int discarded$4 = this.a(7, (wj) null, (String) null, 77, (String) null, true);
              return;
            } else {
              return;
            }
          } else {
            this.d((byte) 46);
            if (param3 >= 50) {
              return;
            } else {
              var7 = null;
              int discarded$5 = this.a(7, (wj) null, (String) null, 77, (String) null, true);
              return;
            }
          }
        }
    }

    private final boolean a(mca param0, int param1) {
        qu var3 = null;
        int var4 = 0;
        jg var5 = null;
        int stackIn_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        var4 = 30 % ((-47 - param1) / 37);
        var3 = param0.a(16728128);
        if (var3 == null) {
          return true;
        } else {
          L0: {
            var5 = var3.b(-19704);
            if (cm.field_u != var5) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L0;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    static {
    }
}
