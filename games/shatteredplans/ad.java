/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ad implements jk {
    static String field_d;
    static qr field_c;
    ff field_e;
    bd field_f;
    static String field_a;
    static String field_g;
    static String field_b;

    public static void a(int param0) {
        field_d = null;
        field_c = null;
        field_a = null;
        field_b = null;
        field_g = null;
        if (param0 != 18973) {
            String discarded$0 = ad.a('`', 73, -40);
        }
    }

    final static String a(char param0, int param1, int param2) {
        int var4 = 0;
        int var5 = ShatteredPlansClient.field_F ? 1 : 0;
        if (param2 > -33) {
            field_b = null;
        }
        char[] var6 = new char[param1];
        char[] var3 = var6;
        for (var4 = 0; var4 < param1; var4++) {
            var6[var4] = param0;
        }
        return new String(var6);
    }

    final static void a(int param0, v param1, int param2, byte param3) {
        if (param3 <= 92) {
            Object var5 = null;
            ad.a(-96, (v) null, -95, (byte) -3);
        }
    }

    final static void a(pf param0, int param1) {
        int var3 = ShatteredPlansClient.field_F ? 1 : 0;
        if (param1 != -24925) {
            field_d = null;
        }
        nc var2 = (nc) (Object) param0.d(0);
        while (var2 != null) {
            if (!(var2.field_o > var2.field_j)) {
                var2.b((byte) -71);
            }
            var2 = (nc) (Object) param0.a((byte) -71);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Send private message";
        field_g = "Accept <%0> into this game";
        field_a = "1 fleet remaining.";
        field_b = "All colonies have agreed to a diplomatic settlement.";
    }
}
