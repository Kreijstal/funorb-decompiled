/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ag extends ig {
    static java.math.BigInteger field_s;
    private Object field_r;
    static o field_v;
    static o field_t;
    static String field_w;
    static int field_u;

    final boolean d(int param0) {
        if (param0 != -9861) {
            field_w = null;
            return false;
        }
        return false;
    }

    final Object e(int param0) {
        if (param0 != 1) {
            return null;
        }
        return ((ag) this).field_r;
    }

    public static void f(int param0) {
        field_v = null;
        field_s = null;
        field_t = null;
        int var1 = -9 / ((1 - param0) / 37);
        field_w = null;
    }

    ag(Object param0, int param1) {
        super(param1);
        ((ag) this).field_r = param0;
    }

    final static String a(String param0, int param1) {
        int var4 = 0;
        int var5 = wizardrun.field_H;
        int var2 = param0.length();
        if (param1 != 1) {
            field_w = null;
        }
        char[] var3 = new char[var2];
        for (var4 = 0; var4 < var2; var4++) {
            var3[var2 - (1 + var4)] = param0.charAt(var4);
        }
        return new String(var3);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = new java.math.BigInteger("65537");
        field_w = "Hold down SPACE or <%0> key to charge your starpower.";
        field_t = new o(270, 70);
        field_u = -1;
    }
}
