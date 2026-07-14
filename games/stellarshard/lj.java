/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lj extends g implements rf, oi {
    static String field_C;
    private pl field_E;
    private ig field_G;
    static String field_B;
    static byte[][] field_D;
    ul field_F;
    private ig field_H;

    private final boolean a(int param0, je param1) {
        w var3 = null;
        cg var4 = null;
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        var3 = param1.a((byte) 65);
        if (var3 == null) {
          return true;
        } else {
          var4 = var3.b(-28036);
          if (param0 != 31142) {
            return true;
          } else {
            L0: {
              if (lg.field_c != var4) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                stackOut_5_0 = 1;
                stackIn_7_0 = stackOut_5_0;
                break L0;
              }
            }
            return stackIn_7_0 != 0;
          }
        }
    }

    private final int a(int param0, byte param1, rj param2, String param3, String param4, int param5) {
        if (param1 != 64) {
            return 105;
        }
        return this.a(param3, param0, param5, 35, param4, (byte) -120, param2);
    }

    public final void a(int param0) {
        ((ge) (Object) ((lj) this).field_E.a((byte) 119)).a(false);
        int var2 = -28 % ((param0 - 63) / 60);
    }

    public lj() {
        super(0, 0, 496, 0, (uk) null);
        ((lj) this).field_E = new pl("", (lf) null, 12);
        id var1 = new id(de.field_c, 0, 0, 0, 0, 16777215, -1, 3, 0, si.field_V.field_N, -1, 2147483647, true);
        rj var2 = new rj(l.field_d, (uk) (Object) var1, (lf) null);
        ((lj) this).field_H = new ig(sf.field_e, (lf) null);
        ((lj) this).field_G = new ig(bb.field_l, (lf) null);
        ((lj) this).field_E.field_x = fc.field_d;
        ((lj) this).field_E.a((byte) -2, (w) (Object) new ge((ae) (Object) ((lj) this).field_E));
        ((lj) this).field_H.field_E = false;
        ((lj) this).field_H.field_u = (uk) (Object) new b();
        ((lj) this).field_G.field_u = (uk) (Object) new ll();
        ((lj) this).field_E.field_u = (uk) (Object) new vg(10000536);
        int var3 = 20;
        int var4 = 4;
        var2.b(270, 20, var3, 50, 23987);
        int var5 = 200;
        var3 += 50;
        ((lj) this).b(4, var2);
        var3 = var3 + (5 + this.a(170, (byte) 64, (rj) (Object) ((lj) this).field_E, si.field_I, nk.field_h, var3));
        ((lj) this).field_H.b(var5, -var5 + 496 >> 571445313, var3, 40, 23987);
        ((lj) this).field_G.b(60, 3 + var4, var3 + 15, 40, 23987);
        ((lj) this).field_G.field_v = (lf) this;
        ((lj) this).field_H.field_v = (lf) this;
        ((lj) this).b(4, (rj) (Object) ((lj) this).field_H);
        ((lj) this).b(4, (rj) (Object) ((lj) this).field_G);
        ((lj) this).field_F = new ul((rf) this);
        ((lj) this).field_F.b(-60 + (-((lj) this).field_E.field_p + ((lj) this).field_p + -((lj) this).field_E.field_w), 60 + ((lj) this).field_E.field_w + ((lj) this).field_E.field_p, 20, 150, 23987);
        ((lj) this).b(4, (rj) (Object) ((lj) this).field_F);
        ((lj) this).b(496, 0, 0, var3 - (-55 - var4), 23987);
    }

    public static void h(int param0) {
        field_C = null;
        field_B = null;
        if (param0 != 120) {
            return;
        }
        field_D = null;
    }

    final void a(int param0, boolean param1, int param2, rj param3) {
        super.a(param0, param1, param2, param3);
        ((lj) this).field_H.field_E = this.e((byte) 34);
        if (param1) {
            ((lj) this).field_E = null;
        }
    }

    private final int a(String param0, int param1, int param2, int param3, String param4, byte param5, rj param6) {
        kg var11 = new kg(20, param2, param1 + 120, 25, param6, false, 120, 3, si.field_V, 16777215, param0);
        ((lj) this).b(4, (rj) (Object) var11);
        cd var9 = new cd(((je) (Object) param6).a((byte) 48), param4, 126, var11.field_t + param2, param1 + 25, param3);
        var9.field_v = (lf) this;
        int var10 = -34 / ((-78 - param5) / 35);
        ((lj) this).b(4, (rj) (Object) var9);
        return var11.field_t + var9.field_t;
    }

    public final void a(int param0, int param1, ig param2, boolean param3, int param4) {
        if (param2 != ((lj) this).field_G) {
          if (((lj) this).field_H == param2) {
            this.f((byte) 120);
            if (param3) {
              ((lj) this).field_F = null;
              return;
            } else {
              return;
            }
          } else {
            if (!param3) {
              return;
            } else {
              ((lj) this).field_F = null;
              return;
            }
          }
        } else {
          ll.c(32270);
          if (!param3) {
            return;
          } else {
            ((lj) this).field_F = null;
            return;
          }
        }
    }

    public final void a(byte param0, String param1) {
        int var5 = 52 % ((param0 - 61) / 62);
        pl var3 = ((lj) this).field_E;
        String var4 = param1;
        ((ae) (Object) var3).a((byte) 20, var4, false);
    }

    final boolean a(int param0, int param1, char param2, rj param3) {
        if (!super.a(param0 + 0, param1, param2, param3)) {
          if (param0 == 29657) {
            if (param1 == 98) {
              return ((lj) this).a(param3, -8666);
            } else {
              if (param1 != 99) {
                return false;
              } else {
                return ((lj) this).a(param3, (byte) 66);
              }
            }
          } else {
            return true;
          }
        } else {
          return true;
        }
    }

    private final void f(byte param0) {
        if (!(this.e((byte) 34))) {
            return;
        }
        gg.a(((lj) this).field_E.field_m, 97);
        int var2 = 72 / ((59 - param0) / 49);
    }

    private final boolean e(byte param0) {
        if (this.a(param0 + 31108, (je) (Object) ((lj) this).field_E)) {
          if (param0 != 34) {
            ((lj) this).field_H = null;
            return true;
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_C = "You have 1 unread message!";
        field_B = "Loading extra data";
    }
}
