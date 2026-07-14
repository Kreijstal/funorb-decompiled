/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ei {
    static java.awt.Image field_b;
    static int field_a;

    final static cd a(java.applet.Applet param0, byte param1) {
        int var5 = 0;
        cd var6 = null;
        int var7 = MonkeyPuzzle2.field_F ? 1 : 0;
        int var3 = 13 / ((param1 - 49) / 51);
        String var2 = dl.a(param0, 14278, "jagex-last-login-method");
        if (!(var2 != null)) {
            return jf.field_k;
        }
        cd[] var4 = si.f(0);
        for (var5 = 0; var5 < var4.length; var5++) {
            var6 = var4[var5];
            if (!(!var6.a(var2, -1))) {
                return var6;
            }
        }
        return jf.field_k;
    }

    public static void a(int param0) {
        if (param0 != -22787) {
            Object var2 = null;
            lg discarded$0 = ei.a((ad) null, (byte) 11, (ud) null, 44, -94);
        }
        field_b = null;
    }

    final static void b(int param0) {
        int var2 = 0;
        int var3 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (param0 != 8) {
            field_a = 33;
        }
        hb var1 = gf.field_c;
        while (kj.m(0)) {
            var1.b(true, 8);
            var1.field_h = var1.field_h + 1;
            var2 = var1.field_h + 1;
            nf.a(param0 ^ -93, var1);
            gf.field_c.a(var1.field_h + -var2, (byte) 31);
        }
    }

    final static lg a(ad param0, byte param1, ud param2, int param3, int param4) {
        byte[] var7 = param0.b(255, param3, param4);
        byte[] var5 = var7;
        int var6 = 16 / ((param1 - 67) / 42);
        if (var7 == null) {
            return null;
        }
        return new lg(new gk(var7), param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 0;
    }
}
