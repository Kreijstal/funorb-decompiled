/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gb {
    static String field_e;
    static int field_b;
    static vb field_d;
    static int[] field_c;
    static double field_a;
    static h field_f;

    final static void a(int param0, int param1, eg param2, int param3, ka[] param4, ka[] param5, boolean param6, int param7, eg param8, int param9, int param10, int param11, int param12, int param13, int param14) {
        Object var16 = null;
        bh.a(param10, param14, ai.field_d, 0, param4, qa.field_f, param9, param5, param7, param12, param3, param13, 0, param0, param8, param11, -96, 480, (ka[]) null, lg.field_f, param2);
        int var15 = -62 % ((param1 - 1) / 55);
        ik.a(param6, -27055);
    }

    final static qj a(int param0, byte[] param1) {
        if (param1 == null) {
            return null;
        }
        if (param0 != -28993) {
            gb.a(16);
        }
        qj var2 = new qj(param1, ug.field_e, dd.field_t, pg.field_r, lg.field_e, td.field_m, h.field_a);
        p.a(0);
        return var2;
    }

    final static vi a(int param0, String param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = TorChallenge.field_F ? 1 : 0;
        int var2 = param1.length();
        if (param0 >= -86) {
            return null;
        }
        for (var3 = 0; var3 < var2; var3++) {
            var4 = param1.charAt(var3);
            if (var4 < 48) {
                return null;
            }
            if (57 < var4) {
                return null;
            }
        }
        return di.field_g;
    }

    final static int b(int param0) {
        int var1 = 82 / ((-2 - param0) / 38);
        return ea.field_f;
    }

    public static void a(int param0) {
        if (param0 <= 40) {
            field_f = null;
        }
        field_f = null;
        field_e = null;
        field_c = null;
        field_d = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 20;
        field_e = "Create a free account to start using this feature";
        field_c = new int[]{11, 22, 1};
        field_a = Math.atan2(1.0, 0.0);
    }
}
