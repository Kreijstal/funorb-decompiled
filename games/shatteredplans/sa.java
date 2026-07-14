/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sa {
    static sl field_a;
    static String field_e;
    static String field_b;
    static String field_c;
    static Boolean field_d;

    final static void a(int param0, int param1, byte param2, int param3, bi param4, int param5) {
        int var13 = 0;
        int var14 = 0;
        int var15 = ShatteredPlansClient.field_F ? 1 : 0;
        int var6 = gf.field_a;
        if (param2 <= 71) {
            return;
        }
        int var7 = gf.field_f;
        int var8 = gf.field_i;
        int var9 = gf.field_l;
        if (!(param0 < param3)) {
            gf.i(param1, var6, -param3 + param1 + param0, var7);
            param4.c(param1, param5, 256);
        }
        int var10 = var9 - var8 + -1;
        int var11 = param0 >= param3 ? param0 + -param3 : 0;
        int var12 = param0;
        if (!(var11 >= -param1 + var8)) {
            var11 = var8 - param1;
        }
        if (!(var10 >= var12)) {
            var12 = var10;
        }
        for (var13 = var11; var13 < var12; var13++) {
            var14 = (param0 + -var13 << 2029303720) / param3;
            gf.d(var13 + param1, var6, var13 + (param1 + 1), var7);
            param4.c(param1, param5, var14);
        }
        gf.d(var8, var6, var9, var7);
    }

    final static int a(int param0) {
        if (param0 != -27572) {
            field_a = null;
        }
        return ho.field_a + -db.field_f;
    }

    public static void b(int param0) {
        field_b = null;
        field_e = null;
        if (param0 != 2029303720) {
            field_d = null;
        }
        field_d = null;
        field_c = null;
        field_a = null;
    }

    final static int a(int param0, int param1) {
        if (param1 >= -102) {
            field_a = null;
        }
        return 1 + (int)(((double)param0 - 50.0 * rh.field_d) / (rh.field_d * 150.0));
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "<%0> has dropped out.";
        field_e = "IO error - unable to communicate reliably with the data server. Please check any firewall/antivirus/filtering software.";
        field_b = "To return to the menu, press <%key>'ESC'</col> and select 'End Tutorial' from the menu.";
    }
}
