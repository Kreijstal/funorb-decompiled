/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gj {
    static int field_c;
    static ea[] field_f;
    static String[] field_b;
    static String field_a;
    static String field_d;
    static String field_e;

    final static int a(byte param0) {
        if (param0 >= -108) {
            return -112;
        }
        return da.field_o;
    }

    final static void a(int param0, nk param1, int param2) {
        la var3 = ra.field_C;
        var3.c(param2, 7);
        var3.a(param0, (byte) -93);
        var3.a(0, (byte) -69);
        var3.a(param1.field_i, (byte) -120);
    }

    final static bl a(int param0, java.applet.Applet param1) {
        int var4 = 0;
        bl var5 = null;
        int var6 = TrackController.field_F ? 1 : 0;
        String var2 = kh.a("jagex-last-login-method", 66, param1);
        if (!(var2 != null)) {
            return oi.field_a;
        }
        bl[] var3 = qi.c(19664);
        for (var4 = 0; var4 < var3.length; var4++) {
            var5 = var3[var4];
            if (!(!var5.a(var2, false))) {
                return var5;
            }
        }
        if (param0 < 96) {
            return null;
        }
        return oi.field_a;
    }

    public static void b(byte param0) {
        int var1 = 67 / ((param0 - 10) / 44);
        field_f = null;
        field_a = null;
        field_e = null;
        field_d = null;
        field_b = null;
    }

    final static int a(int param0, int param1, int param2) {
        int var3 = param2 >> -133681633 & -1 + param1;
        if (param0 != 2) {
            Object var4 = null;
            bl discarded$0 = gj.a(107, (java.applet.Applet) null);
        }
        return var3 + (param2 - -(param2 >>> -270751457)) % param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new String[]{"Complete level 5", "Complete level 10", "Complete level 20", "Complete level 30", "Get 5 levels in a row right first time", "Get 10 levels in a row right first time", "Get 20 levels in a row right first time", "Get 30 levels in a row right first time", "Score 10000 points", "Score 25000 points", "Score 50000 points", "Score 100000 points", "Complete 20 levels in a row with the Zombie Controller during Hallowe'en"};
        field_a = "Loading...";
        field_d = "Names can only contain letters, numbers, spaces and underscores";
        field_e = "Loading graphics";
    }
}
