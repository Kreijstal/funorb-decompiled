/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ph extends og implements im, vd {
    static dd field_E;
    private sa field_z;
    private rf field_B;
    private pc field_C;

    public final void a(int param0, int param1, rf param2, byte param3) {
        int var6 = 0;
        var6 = CrazyCrystals.field_B;
        if (param0 != 0) {
          if (1 == param0) {
            fq.a(-121, "privacy.ws");
            if (param3 >= -127) {
              ((ph) this).field_C = null;
              return;
            } else {
              return;
            }
          } else {
            if (param0 == 2) {
              fq.a(30, "conduct.ws");
              if (param3 >= -127) {
                ((ph) this).field_C = null;
                return;
              } else {
                return;
              }
            } else {
              if (param3 < -127) {
                return;
              } else {
                ((ph) this).field_C = null;
                return;
              }
            }
          }
        } else {
          fq.a(96, "terms.ws");
          if (param3 < -127) {
            return;
          } else {
            ((ph) this).field_C = null;
            return;
          }
        }
    }

    private final String a(int param0) {
        if (param0 <= 104) {
            field_E = null;
            return "<u=2164A2><col=2164A2>";
        }
        return "<u=2164A2><col=2164A2>";
    }

    final boolean a(int param0, int param1, qm param2, char param3) {
        if (!super.a(param0, param1, param2, param3)) {
          if ((param0 ^ -1) == -99) {
            return ((ph) this).a((byte) -89, param2);
          } else {
            if (99 == param0) {
              return ((ph) this).a(param2, -25911);
            } else {
              return false;
            }
          }
        } else {
          return true;
        }
    }

    ph(sa param0) {
        super(0, 0, 288, 0, (wo) null);
        ((ph) this).field_z = param0;
        ((ph) this).field_C = new pc(go.field_j, (bi) null);
        ((ph) this).field_C.field_i = (wo) (Object) new ve();
        String var7 = ci.a(new String[2], cc.field_d, 3);
        int var3 = 20;
        lb var4 = new lb(ai.field_h, 0, 0, 0, 0, 16777215, -1, 3, 0, ai.field_h.field_o, -1, 2147483647, true);
        ((ph) this).field_B = new rf(var7, (wo) (Object) var4);
        ((ph) this).field_B.field_t = "";
        ((ph) this).field_B.a(47, hp.field_r, 0);
        ((ph) this).field_B.a(47, hp.field_r, 1);
        ((ph) this).field_B.field_l = (bi) this;
        ((ph) this).field_B.field_g = ((ph) this).field_g - 40;
        ((ph) this).field_B.b(var3, 47, 26, -40 + ((ph) this).field_g);
        var3 = var3 + (((ph) this).field_B.field_f - -15);
        ((ph) this).b((qm) (Object) ((ph) this).field_B, -119);
        int var5 = 4;
        int var6 = 200;
        ((ph) this).field_C.a(40, -var6 + 300 >> -2021263295, var3, var6, (byte) -52);
        ((ph) this).field_C.field_l = (bi) this;
        ((ph) this).b((qm) (Object) ((ph) this).field_C, 94);
        ((ph) this).a(var3 + (55 + var5), 0, 0, 300, (byte) -52);
    }

    public final void a(byte param0, int param1, int param2, int param3, pc param4) {
        int var6 = 0;
        var6 = 2 / ((83 - param0) / 36);
        if (param4 == ((ph) this).field_C) {
          ro.g(-53);
          ((ph) this).field_z.i((byte) -46);
          return;
        } else {
          return;
        }
    }

    final static void a(int param0, byte param1, int param2, ta param3) {
        pd.field_g[param2] = pd.field_g[param2] + param0;
        bp.field_b.addElement((Object) (Object) new kk(param3.field_j * 15 + (-30 + m.field_l[param2] * 15), -15 - -(15 * param3.field_g), Integer.toString(param0)));
        if (param1 != 107) {
            Object var5 = null;
            ph.a(67, (byte) 78, -61, (ta) null);
        }
    }

    public static void c(boolean param0) {
        field_E = null;
        if (!param0) {
            field_E = null;
        }
    }

    private final String i(int param0) {
        int var2 = 101 % ((param0 - -27) / 56);
        return "</col></u>";
    }

    static {
    }
}
