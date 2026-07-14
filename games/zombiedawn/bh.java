/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bh extends le {
    static vn field_j;
    static java.applet.Applet field_i;
    byte[] field_k;
    static String field_h;

    final static void a(int param0) {
        al[] var5 = null;
        int var2 = 0;
        al var3 = null;
        int var4 = ZombieDawn.field_J;
        if (!qg.field_d) {
            qg.field_d = true;
            var5 = qk.field_Jb;
            al[] var1 = var5;
            for (var2 = param0; var2 < var5.length; var2++) {
                var3 = var5[var2];
                var3.b(24136);
            }
            return;
        }
    }

    public static void c(int param0) {
        field_h = null;
        if (param0 < 69) {
            bh.a(-47);
        }
        field_j = null;
        field_i = null;
    }

    bh(byte[] param0) {
        ((bh) this).field_k = param0;
    }

    final static boolean a(char param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = ZombieDawn.field_J;
        if (Character.isISOControl(param0)) {
            return false;
        }
        if (!(!c.a(param0, 441))) {
            return true;
        }
        char[] var6 = hn.field_o;
        char[] var2 = var6;
        for (var3 = 0; var6.length > var3; var3++) {
            var4 = var6[var3];
            if (param0 == var4) {
                return true;
            }
        }
        var2 = pf.field_h;
        var3 = 0;
        if (param1) {
            field_h = null;
        }
        while (var3 < var2.length) {
            var4 = var2[var3];
            if (!(param0 != var4)) {
                return true;
            }
            var3++;
        }
        return false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "CURSE";
    }
}
