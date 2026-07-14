/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mg extends cn {
    static int field_A;
    ln field_B;
    fs field_G;
    static String field_E;
    ln field_y;
    int field_z;
    static boolean field_C;
    static String field_D;
    static qr field_F;

    final static int e(int param0) {
        if (param0 >= -77) {
            field_F = null;
            return mr.field_a;
        }
        return mr.field_a;
    }

    public static void g(byte param0) {
        field_D = null;
        field_F = null;
        field_E = null;
        if (param0 != -106) {
            mg.g((byte) 34);
        }
    }

    final static qh d(int param0, int param1) {
        gb.field_n = new qh(420, 60, 200, param0 + rg.field_a * param1, vj.field_B.toUpperCase());
        fe var2 = new fe(-16 + (gb.field_n.field_k + 200), 2 + gb.field_n.field_t, 11, 11, -1, (bi) null, "X", 16711680);
        var2.field_h = (Object) (Object) gb.field_n;
        gb.field_n.a((vd) (Object) var2, param0 ^ 20);
        lp var3 = new lp(gb.field_n.field_k + 9, gb.field_n.field_t + 20, 182, param1 * rg.field_a);
        gb.field_n.a((vd) (Object) var3, param0 ^ 20);
        gb.field_n.field_z = var3;
        ph var4 = new ph(param1);
        gb.field_n.field_x = (jk) (Object) var4;
        return gb.field_n;
    }

    mg(ln param0, ln param1, int param2) {
        ((mg) this).field_B = param1;
        ((mg) this).field_y = param0;
        ((mg) this).field_z = param2;
        ((mg) this).field_G = ((mg) this).field_y.field_y;
    }

    mg(ln param0, ln param1, fs param2, int param3) {
        ((mg) this).field_z = param3;
        ((mg) this).field_G = param2;
        ((mg) this).field_y = param0;
        ((mg) this).field_B = param1;
    }

    final static ln a(dc param0, ob param1, int param2) {
        if (param2 != 20) {
          field_A = 35;
          return gq.a(param0.field_g.field_e, -2284, param1);
        } else {
          return gq.a(param0.field_g.field_e, -2284, param1);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_E = "<%0> wants to join";
        field_C = false;
        field_D = "Year";
    }
}
