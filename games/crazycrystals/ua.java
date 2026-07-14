/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ua {
    static am field_a;

    final static mb a(int param0, java.applet.Applet param1) {
        int var4 = 0;
        mb var5 = null;
        int var6 = CrazyCrystals.field_B;
        String var2 = ah.a(true, param1, "jagex-last-login-method");
        if (var2 == null) {
            return je.field_b;
        }
        if (param0 != -11662) {
            return null;
        }
        mb[] var3 = vm.a((byte) 120);
        for (var4 = 0; var4 < var3.length; var4++) {
            var5 = var3[var4];
            if (var5.a(1, var2)) {
                return var5;
            }
        }
        return je.field_b;
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != 0) {
            field_a = null;
        }
    }

    static {
    }
}
