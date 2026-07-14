/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wk extends fd implements fc, ta {
    private vd field_D;
    kl field_F;
    private tg field_G;
    private tg field_E;

    private final void a(int param0) {
        if (param0 != 55) {
            return;
        }
        if (!(this.e((byte) 97))) {
            return;
        }
        ca.a(((wk) this).field_D.field_n, (byte) -124);
    }

    private final boolean e(byte param0) {
        Object var3 = null;
        if (this.a((byte) 43, (fg) (Object) ((wk) this).field_D)) {
          if (param0 < 65) {
            var3 = null;
            int discarded$2 = this.a(-116, (String) null, (String) null, true, 30, (fi) null);
            return true;
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    final boolean a(fi param0, char param1, int param2, int param3) {
        int var5 = 0;
        if (super.a(param0, param1, param2, 127)) {
          return true;
        } else {
          if ((param2 ^ -1) == -99) {
            return ((wk) this).b(2, param0);
          } else {
            var5 = -115 / ((param3 - -75) / 36);
            if ((param2 ^ -1) == -100) {
              return ((wk) this).a(-16234, param0);
            } else {
              return false;
            }
          }
        }
    }

    private final int a(int param0, String param1, String param2, boolean param3, int param4, fi param5) {
        if (!param3) {
          ((wk) this).field_F = null;
          return this.a(param2, param0, param1, -7815, param5, param4, 35);
        } else {
          return this.a(param2, param0, param1, -7815, param5, param4, 35);
        }
    }

    private final boolean a(byte param0, fg param1) {
        le var3 = null;
        wl var4 = null;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        var3 = param1.a(param0 ^ -44);
        if (var3 != null) {
          if (param0 != 43) {
            L0: {
              ((wk) this).field_D = null;
              var4 = var3.a(-22243);
              if (bm.field_i != var4) {
                stackOut_9_0 = 0;
                stackIn_10_0 = stackOut_9_0;
                break L0;
              } else {
                stackOut_8_0 = 1;
                stackIn_10_0 = stackOut_8_0;
                break L0;
              }
            }
            return stackIn_10_0 != 0;
          } else {
            L1: {
              var4 = var3.a(-22243);
              if (bm.field_i != var4) {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                break L1;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
            return stackIn_6_0 != 0;
          }
        } else {
          return true;
        }
    }

    public final void a(int param0, tg param1, int param2, int param3, int param4) {
        if (param0 == 12085) {
          if (((wk) this).field_G != param1) {
            if (((wk) this).field_E != param1) {
              return;
            } else {
              this.a(55);
              return;
            }
          } else {
            pj.a(256);
            return;
          }
        } else {
          return;
        }
    }

    public wk() {
        super(0, 0, 496, 0, (ol) null);
        ((wk) this).field_D = new vd("", (cd) null, 12);
        aj var1 = new aj(dk.field_j, 0, 0, 0, 0, 16777215, -1, 3, 0, dj.field_h.field_H, -1, 2147483647, true);
        fi var2 = new fi(ld.field_e, (ol) (Object) var1, (cd) null);
        ((wk) this).field_E = new tg(kb.field_a, (cd) null);
        ((wk) this).field_G = new tg(vb.field_g, (cd) null);
        ((wk) this).field_D.field_h = sd.field_c;
        ((wk) this).field_D.a((le) (Object) new di((wa) (Object) ((wk) this).field_D), (byte) 127);
        ((wk) this).field_E.field_C = false;
        ((wk) this).field_E.field_w = (ol) (Object) new hf();
        ((wk) this).field_G.field_w = (ol) (Object) new ti();
        ((wk) this).field_D.field_w = (ol) (Object) new cc(10000536);
        int var3 = 20;
        int var4 = 4;
        int var5 = 200;
        var2.a(50, true, var3, 20, 270);
        var3 += 50;
        ((wk) this).a(var2, (byte) -78);
        var3 = var3 + (5 + this.a(var3, lm.field_g, ul.field_f, true, 170, (fi) (Object) ((wk) this).field_D));
        ((wk) this).field_E.a(40, true, var3, -var5 + 496 >> 761929153, var5);
        ((wk) this).field_G.a(40, true, var3 - -15, var4 + 3, 60);
        ((wk) this).field_G.field_o = (cd) this;
        ((wk) this).field_E.field_o = (cd) this;
        ((wk) this).a((fi) (Object) ((wk) this).field_E, (byte) -78);
        ((wk) this).a((fi) (Object) ((wk) this).field_G, (byte) -78);
        ((wk) this).field_F = new kl((fc) this);
        ((wk) this).field_F.a(150, true, 20, ((wk) this).field_D.field_l + ((wk) this).field_D.field_g - -60, -((wk) this).field_D.field_g + ((wk) this).field_g + -((wk) this).field_D.field_l + -60);
        ((wk) this).a((fi) (Object) ((wk) this).field_F, (byte) -78);
        ((wk) this).a(55 + var3 - -var4, true, 0, 0, 496);
    }

    public final void a(byte param0) {
        ((di) (Object) ((wk) this).field_D.a(-1)).c(false);
        if (param0 != -72) {
            Object var3 = null;
            int discarded$0 = this.a((String) null, 56, (String) null, -1, (fi) null, 112, 84);
        }
    }

    private final int a(String param0, int param1, String param2, int param3, fi param4, int param5, int param6) {
        ng var9 = null;
        ej var10 = null;
        if (param3 != -7815) {
          boolean discarded$1 = ((wk) this).a((fi) null, 'ﾴ', 84, -110);
          var10 = new ej(20, param1, param5 + 120, 25, param4, false, 120, 3, dj.field_h, 16777215, param2);
          ((wk) this).a((fi) (Object) var10, (byte) -78);
          var9 = new ng(((fg) (Object) param4).a(-1), param0, 126, var10.field_m + param1, 25 + param5, param6);
          var9.field_o = (cd) this;
          ((wk) this).a((fi) (Object) var9, (byte) -78);
          return var10.field_m + var9.field_m;
        } else {
          var10 = new ej(20, param1, param5 + 120, 25, param4, false, 120, 3, dj.field_h, 16777215, param2);
          ((wk) this).a((fi) (Object) var10, (byte) -78);
          var9 = new ng(((fg) (Object) param4).a(-1), param0, 126, var10.field_m + param1, 25 + param5, param6);
          var9.field_o = (cd) this;
          ((wk) this).a((fi) (Object) var9, (byte) -78);
          return var10.field_m + var9.field_m;
        }
    }

    public final void a(String param0, boolean param1) {
        vd var3 = ((wk) this).field_D;
        String var4 = param0;
        ((wa) (Object) var3).a(var4, 81, param1);
    }

    final void a(int param0, int param1, fi param2, int param3) {
        super.a(param0, 127, param2, param3);
        ((wk) this).field_E.field_C = this.e((byte) 117);
        if (param1 <= 113) {
            ((wk) this).field_G = null;
        }
    }

    static {
    }
}
