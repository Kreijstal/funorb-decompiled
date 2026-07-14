/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tg extends ga implements el {
    static int field_S;
    private rg field_P;
    static int[] field_T;
    static double[] field_R;
    static int field_H;
    private rg field_Q;
    static int field_L;
    private rg field_O;

    public final void a(int param0, int param1, int param2, rg param3, int param4) {
        int var7 = 0;
        var7 = Confined.field_J ? 1 : 0;
        if (((tg) this).field_P != param3) {
          if (param3 == ((tg) this).field_O) {
            jl.a((byte) -124);
            if (param0 < 68) {
              field_H = -89;
              return;
            } else {
              return;
            }
          } else {
            if (param3 == ((tg) this).field_Q) {
              bd.a(1849965346);
              if (param0 < 68) {
                field_H = -89;
                return;
              } else {
                return;
              }
            } else {
              if (param0 >= 68) {
                return;
              } else {
                field_H = -89;
                return;
              }
            }
          }
        } else {
          rk.b((byte) 120);
          if (param0 >= 68) {
            return;
          } else {
            field_H = -89;
            return;
          }
        }
    }

    final boolean a(fj param0, byte param1, int param2, char param3) {
        int var5 = 0;
        if (super.a(param0, (byte) -115, param2, param3)) {
          return true;
        } else {
          if (param2 == 98) {
            return ((tg) this).c(param0, 32);
          } else {
            var5 = 39 / ((param1 - 47) / 43);
            if (param2 == 99) {
              return ((tg) this).a(17731, param0);
            } else {
              return false;
            }
          }
        }
    }

    public tg() {
        super(0, 0, 476, 225, (fe) null);
        ((tg) this).field_O = new rg(ej.field_c, (uk) null);
        ((tg) this).field_P = new rg(qn.field_m, (uk) null);
        ((tg) this).field_Q = new rg(ug.field_cb, (uk) null);
        je var1 = new je();
        ((tg) this).field_O.field_n = (fe) (Object) var1;
        ((tg) this).field_P.field_n = (fe) (Object) var1;
        ((tg) this).field_Q.field_n = (fe) (Object) var1;
        int var2 = 4;
        int var3 = 326;
        int var4 = -var2 + var3 >> -286888095;
        ((tg) this).field_P.a(-110, var4, -48 + ((tg) this).field_z + -var2, 30, -var3 + ((tg) this).field_F >> -691989247);
        ((tg) this).field_Q.a(-128, var4, -48 + ((tg) this).field_z + -var2, 30, (-var3 + ((tg) this).field_F >> 1594002753) + (var4 + var2));
        ((tg) this).field_O.a(-111, var3, -78 + ((tg) this).field_z + -(2 * var2), 30, ((tg) this).field_F - var3 >> 989213633);
        ((tg) this).field_P.field_t = (uk) this;
        ((tg) this).field_O.field_t = (uk) this;
        ((tg) this).field_O.field_C = eh.field_eb;
        ((tg) this).field_Q.field_t = (uk) this;
        ((tg) this).field_Q.field_C = nl.field_a;
        ((tg) this).b((fj) (Object) ((tg) this).field_P, 10);
        ((tg) this).b((fj) (Object) ((tg) this).field_O, 10);
        ((tg) this).b((fj) (Object) ((tg) this).field_Q, 10);
    }

    public static void g(byte param0) {
        field_T = null;
        if (param0 <= 123) {
            field_S = 121;
            field_R = null;
            return;
        }
        field_R = null;
    }

    final static void a(byte param0) {
        if (param0 > -120) {
            field_H = 85;
            eb.a((byte) -122);
            return;
        }
        eb.a((byte) -122);
    }

    final void a(int param0, int param1, byte param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        if (param2 < 36) {
          field_R = null;
          var5 = ((tg) this).field_q - -param3;
          var6 = ((tg) this).field_m + param0;
          int discarded$2 = gm.field_cb.a(gb.field_c, 20 + var5, var6 + 20, -40 + ((tg) this).field_F, -50 + ((tg) this).field_z, 16777215, -1, 1, 0, gm.field_cb.field_C);
          super.a(param0, param1, (byte) 86, param3);
          return;
        } else {
          var5 = ((tg) this).field_q - -param3;
          var6 = ((tg) this).field_m + param0;
          int discarded$3 = gm.field_cb.a(gb.field_c, 20 + var5, var6 + 20, -40 + ((tg) this).field_F, -50 + ((tg) this).field_z, 16777215, -1, 1, 0, gm.field_cb.field_C);
          super.a(param0, param1, (byte) 86, param3);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_S = -1;
        field_T = new int[8192];
        field_R = new double[]{0.2, 0.2, 0.2, 0.06};
        field_L = 640;
    }
}
