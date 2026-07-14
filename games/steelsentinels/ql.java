/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ql extends gh {
    gh field_bc;
    static gh field_Vb;
    static int field_Ub;
    kg field_Xb;
    static String field_dc;
    static boolean field_cc;
    static String field_Yb;
    static gh field_ec;
    gh field_Sb;
    static int[] field_ac;
    static String field_Zb;
    static ld field_Tb;
    gh field_Wb;

    final static boolean a(int[] param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = SteelSentinels.field_G;
        if (param1 == 18286) {
          var2 = 0;
          L0: while (true) {
            if (8 > var2) {
              if (-1 == param0[var2]) {
                var2++;
                continue L0;
              } else {
                return true;
              }
            } else {
              return false;
            }
          }
        } else {
          field_ec = null;
          var2 = 0;
          L1: while (true) {
            if (8 > var2) {
              if (-1 == param0[var2]) {
                var2++;
                continue L1;
              } else {
                return true;
              }
            } else {
              return false;
            }
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        ((ql) this).field_zb = param0;
        int var9 = -88 % ((64 - param5) / 58);
        ((ql) this).field_Lb = param1;
        ((ql) this).field_eb = param7;
        ((ql) this).field_Y = param3;
        ((ql) this).a(param2, param4, 102, param6);
    }

    ql(long param0, gh param1, gh param2, lb param3, gh param4, String param5, String param6) {
        super(param0, param1);
        ((ql) this).field_Wb = new gh(0L, (gh) null);
        ((ql) this).field_Xb = new kg(0L, ((ql) this).field_Wb, param2, param3);
        ((ql) this).field_bc = new gh(0L, param4);
        ((ql) this).field_Sb = new gh(0L, param4);
        ((ql) this).field_bc.field_S = param5;
        ((ql) this).field_Sb.field_S = param6;
        ((ql) this).a((gh) (Object) ((ql) this).field_Xb, 127);
        ((ql) this).a(((ql) this).field_bc, 121);
        ((ql) this).a(((ql) this).field_Sb, 127);
    }

    ql(long param0, ql param1, String param2, String param3) {
        this(param0, (gh) (Object) param1, param1.field_Xb.field_Tb, param1.field_Xb.field_Sb, param1.field_bc, param2, param3);
    }

    final static void j(int param0) {
        kc.field_A = false;
        if (param0 != -29713) {
            return;
        }
        de.field_d = false;
        hc.a(-1, 0);
        jn.field_b = mm.field_e;
        cb.field_j = mm.field_e;
    }

    public static void d(byte param0) {
        field_Vb = null;
        field_ac = null;
        field_Yb = null;
        field_ec = null;
        int var1 = 85 / ((param0 - -25) / 56);
        field_dc = null;
        field_Zb = null;
        field_Tb = null;
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = (param0 + ((ql) this).field_zb) / 2;
        int var6 = -param1 + ((ql) this).field_Lb;
        ((ql) this).field_Xb.a(((ql) this).field_zb, -2048, param3, var6 - param0, param0, 0, 0);
        ((ql) this).field_bc.field_eb = var6;
        ((ql) this).field_bc.field_zb = -param0 + var5;
        ((ql) this).field_bc.field_Lb = param1;
        ((ql) this).field_bc.field_Y = 0;
        ((ql) this).field_Sb.field_zb = ((ql) this).field_zb + -var5;
        ((ql) this).field_Sb.field_Y = var5;
        int var7 = -101 / ((param2 - -79) / 46);
        ((ql) this).field_Sb.field_eb = var6;
        ((ql) this).field_Sb.field_Lb = param1;
    }

    final static void b(boolean param0) {
        gi.field_o.a(0, 0, 18, 0, fl.field_c.field_zb - (rm.field_p ? 2 + ua.field_G + 42 : 0));
        if (!param0) {
            field_ec = null;
            uj.field_j.a(0, 0, 18, -2 + (fl.field_c.field_zb + -ua.field_G - 40), 42 + ua.field_G);
            mj.field_Sb.a(fl.field_c.field_zb, -2048, ua.field_G, -20 + fl.field_c.field_Lb, 2, 0, 20);
            return;
        }
        uj.field_j.a(0, 0, 18, -2 + (fl.field_c.field_zb + -ua.field_G - 40), 42 + ua.field_G);
        mj.field_Sb.a(fl.field_c.field_zb, -2048, ua.field_G, -20 + fl.field_c.field_Lb, 2, 0, 20);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_cc = true;
        field_Zb = "Unable to delete name - system busy";
        field_dc = "To play a multiplayer game, please log in or create a free account.";
        field_Yb = "ESC - cancel this line";
        field_ac = new int[]{25, 26, 39, 0, -1, -1, 7};
        field_Ub = 10;
    }
}
