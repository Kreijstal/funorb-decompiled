/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bc extends mg {
    static String field_p;
    static String field_n;
    static boolean[] field_m;
    static ak field_o;

    final dj a(String param0, boolean param1) {
        if (!param1) {
            bc.e(54);
        }
        int var3 = hm.a(0, param0) == null ? 1 : 0;
        if (!(var3 != 0)) {
            return sk.field_a;
        }
        return qk.field_g;
    }

    bc(c param0) {
        super(param0);
    }

    final static void a(byte param0, int param1) {
        pp discarded$10 = mc.a(8 * ci.field_o - -param1, -127);
        if (param0 != 96) {
            field_n = null;
        }
    }

    public static void e(int param0) {
        field_p = null;
        field_m = null;
        field_o = null;
        field_n = null;
        int var1 = -73 / ((-35 - param0) / 59);
    }

    final static boolean a(String param0, int param1) {
        if (param1 != 1) {
            return false;
        }
        if (!(null != hq.field_t)) {
            return false;
        }
        return 0 <= param0.toLowerCase().indexOf(hq.field_t.toLowerCase()) ? true : false;
    }

    final static String b(int param0, String param1) {
        int var4 = 0;
        int var5 = Pixelate.field_H ? 1 : 0;
        int var2 = param1.length();
        char[] var3 = new char[var2];
        for (var4 = param0; var4 < var2; var4++) {
            var3[-var4 + (var2 - 1)] = param1.charAt(var4);
        }
        return new String(var3);
    }

    final static void a(int param0, byte param1) {
        int var2 = 0;
        int var3 = Pixelate.field_H ? 1 : 0;
        ie.a(pg.field_e, w.field_s, true, aa.field_o, 0, 127, param0);
        for (var2 = 0; var2 < pg.field_e; var2++) {
            gn.field_A[param0 + var2] = var2;
        }
        ie.a(param0 + pg.field_e, ro.field_a, false, qn.field_k, param0, 81, param0 + param0);
        if (param1 < 1) {
            return;
        }
        if (pg.field_e > param0) {
            pg.field_e = param0;
        }
    }

    final static String a(boolean param0, char param1, int param2) {
        int var4 = 0;
        int var5 = Pixelate.field_H ? 1 : 0;
        char[] var6 = new char[param2];
        char[] var3 = var6;
        for (var4 = 0; var4 < param2; var4++) {
            var6[var4] = param1;
        }
        if (param0) {
            field_o = null;
        }
        return new String(var3);
    }

    final String a(int param0, String param1) {
        if (((bc) this).a(param1, true) == sk.field_a) {
            return kp.field_A;
        }
        if (param0 > -76) {
            field_n = null;
        }
        return e.field_c;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = "Find opponent";
        field_p = "You are not currently logged in to the game.";
        field_m = new boolean[112];
    }
}
