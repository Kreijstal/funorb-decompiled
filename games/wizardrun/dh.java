/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dh {
    static int field_b;
    static String field_c;
    static int field_a;

    public static void a(boolean param0) {
        if (param0) {
            field_b = 47;
        }
        field_c = null;
    }

    final static ae a(int param0, String param1) {
        int var5 = 0;
        String var6 = null;
        ae var7 = null;
        int var8 = wizardrun.field_H;
        int var2 = param1.length();
        if (!(-1 != (var2 ^ -1))) {
            return ok.field_f;
        }
        if (255 < var2) {
            return kj.field_c;
        }
        String[] var3 = tj.a(param1, -22710, '.');
        if (var3.length < 2) {
            return ok.field_f;
        }
        if (param0 != -27602) {
            field_a = -52;
        }
        String[] var4 = var3;
        for (var5 = 0; var5 < var4.length; var5++) {
            var6 = var4[var5];
            var7 = he.a(param0 ^ -27522, var6);
            if (!(var7 == null)) {
                return var7;
            }
        }
        return u.b(var3[var3.length + -1], (byte) -125);
    }

    final static gb a(int param0, int param1, byte param2, kl param3, kl param4) {
        if (!h.a(param1, param0, param4, -118)) {
            return null;
        }
        if (param2 > -62) {
            return null;
        }
        return dc.a(param3.a(param0, param1, 1), 0);
    }

    final static boolean a(int param0) {
        if (param0 != 255) {
            return true;
        }
        return null == ki.field_E ? jg.field_n : true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 640;
        field_b = 0;
        field_c = null;
    }
}
