/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kl {
    static int[] field_c;
    static int field_d;
    static ue field_b;
    int field_e;
    static String field_a;

    public static void a(int param0) {
        field_c = null;
        if (param0 != 21367) {
            return;
        }
        field_a = null;
        field_b = null;
    }

    final static void a(String param0, int param1) {
        lj.field_c = param0;
        if (param1 != 8192) {
            field_d = -99;
        }
    }

    final static mj a(java.applet.Applet param0, byte param1) {
        int var4 = 0;
        mj var5 = null;
        String var2 = fh.a("jagex-last-login-method", param0, (byte) 120);
        if (var2 == null) {
            return ih.field_c;
        }
        if (param1 != 84) {
            Object var6 = null;
            mj discarded$0 = kl.a((java.applet.Applet) null, (byte) -97);
        }
        mj[] var3 = ge.b((byte) 35);
        for (var4 = 0; var4 < var3.length; var4++) {
            var5 = var3[var4];
            if (var5.a(var2, -124)) {
                return var5;
            }
        }
        return ih.field_c;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new int[8192];
    }
}
