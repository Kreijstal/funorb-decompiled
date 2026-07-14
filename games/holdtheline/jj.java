/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class jj extends ln {
    static e field_p;
    int field_o;

    final static void a(int param0, String param1, float param2) {
        aa.field_m = param1;
        if (param0 < 79) {
            return;
        }
        nj.field_e = param2;
    }

    public static void f(int param0) {
        field_p = null;
        int var1 = -28 / ((44 - param0) / 47);
    }

    final static String a(byte param0, CharSequence[] param1) {
        if (param0 > -53) {
            field_p = null;
        }
        return ae.a(param1, (byte) -44, param1.length, 0);
    }

    final static mf a(java.applet.Applet param0, byte param1) {
        int var4 = 0;
        mf var5 = null;
        int var6 = HoldTheLine.field_D;
        String var2 = ph.a("jagex-last-login-method", (byte) 30, param0);
        if (!(var2 != null)) {
            return ho.field_n;
        }
        if (param1 != 124) {
            field_p = null;
        }
        mf[] var3 = ko.a(84);
        for (var4 = 0; var4 < var3.length; var4++) {
            var5 = var3[var4];
            if (!(!var5.a(param1 ^ 37, var2))) {
                return var5;
            }
        }
        return ho.field_n;
    }

    abstract boolean g(int param0);

    abstract Object b(byte param0);

    jj(int param0) {
        ((jj) this).field_o = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = new e(2, 4, 4, 0);
    }
}
