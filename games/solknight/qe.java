/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qe extends ki implements re, ka {
    private pj field_H;
    static int[] field_G;
    static String field_F;
    private jk field_D;
    private kj field_E;

    public final void a(int param0, int param1, int param2, kj param3) {
        int var6 = 0;
        var6 = SolKnight.field_L ? 1 : 0;
        if ((param1 ^ -1) == -1) {
          ud.a(11692, "terms.ws");
          if (param2 == 50) {
            return;
          } else {
            ((qe) this).field_E = null;
            return;
          }
        } else {
          if ((param1 ^ -1) == -2) {
            ud.a(11692, "privacy.ws");
            if (param2 != 50) {
              ((qe) this).field_E = null;
              return;
            } else {
              return;
            }
          } else {
            if (-3 != (param1 ^ -1)) {
              if (param2 == 50) {
                return;
              } else {
                ((qe) this).field_E = null;
                return;
              }
            } else {
              ud.a(11692, "conduct.ws");
              if (param2 != 50) {
                ((qe) this).field_E = null;
                return;
              } else {
                return;
              }
            }
          }
        }
    }

    public final void a(int param0, int param1, int param2, pj param3, boolean param4) {
        if (!(param3 != ((qe) this).field_H)) {
            ua.a((byte) -118);
            ((qe) this).field_D.f(param4);
        }
        if (!param4) {
            qe.i(3);
            return;
        }
    }

    qe(jk param0) {
        super(0, 0, 288, 0, (j) null);
        ((qe) this).field_D = param0;
        ((qe) this).field_H = new pj(dd.field_a, (dg) null);
        ((qe) this).field_H.field_w = (j) (Object) new gh();
        String var7 = bb.a(rf.field_F, new String[2], -63);
        int var3 = 20;
        af var4 = new af(ua.field_G, 0, 0, 0, 0, 16777215, -1, 3, 0, ua.field_G.field_F, -1, 2147483647, true);
        ((qe) this).field_E = new kj(var7, (j) (Object) var4);
        ((qe) this).field_E.field_z = "";
        ((qe) this).field_E.a(0, mj.field_a, 1);
        ((qe) this).field_E.a(1, mj.field_a, 1);
        ((qe) this).field_E.field_n = (dg) this;
        ((qe) this).field_E.field_t = -40 + ((qe) this).field_t;
        ((qe) this).field_E.b(26, var3, 1, ((qe) this).field_t - 40);
        var3 = var3 + (((qe) this).field_E.field_x - -15);
        ((qe) this).a((rc) (Object) ((qe) this).field_E, 5411);
        int var5 = 4;
        int var6 = 200;
        ((qe) this).field_H.b(40, var6, -var6 + 300 >> 1130827681, 0, var3);
        ((qe) this).field_H.field_n = (dg) this;
        ((qe) this).a((rc) (Object) ((qe) this).field_H, 5411);
        ((qe) this).b(var5 + (55 + var3), 300, 0, 0, 0);
    }

    final boolean a(char param0, byte param1, int param2, rc param3) {
        if (!(!super.a(param0, (byte) -127, param2, param3))) {
            return true;
        }
        if (!(-99 != (param2 ^ -1))) {
            return ((qe) this).a((byte) -125, param3);
        }
        if (!(param2 != 99)) {
            return ((qe) this).b(120, param3);
        }
        int var5 = 68 / ((param1 - 31) / 56);
        return false;
    }

    public static void i(int param0) {
        if (param0 != -28528) {
            String discarded$0 = qe.a((byte) 127);
            field_G = null;
            field_F = null;
            return;
        }
        field_G = null;
        field_F = null;
    }

    final static String a(byte param0) {
        if (ne.field_g == null) {
            return "";
        }
        int var1 = -98 % ((54 - param0) / 59);
        return ne.field_g;
    }

    private final String h(int param0) {
        if (param0 != -18655) {
            ((qe) this).field_E = null;
            return "</col></u>";
        }
        return "</col></u>";
    }

    private final String e(boolean param0) {
        if (!param0) {
            Object var3 = null;
            boolean discarded$0 = ((qe) this).a('￘', (byte) -57, -43, (rc) null);
            return "<u=2164A2><col=2164A2>";
        }
        return "<u=2164A2><col=2164A2>";
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_F = "End Game";
    }
}
