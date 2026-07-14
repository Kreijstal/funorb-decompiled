/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class eg extends ug {
    int field_m;
    static int field_o;
    static int field_n;
    static uf field_q;
    static String field_p;

    abstract Object e(int param0);

    final static o a(gk param0, String param1, int param2, gk param3, String param4) {
        int var7 = -5 / ((param2 - 59) / 55);
        int var5 = param3.a(param4, false);
        int var6 = param3.a(var5, param1, -40);
        return rk.a(param3, param0, (byte) -20, var6, var5);
    }

    abstract boolean c(byte param0);

    public static void d(int param0) {
        field_p = null;
        int var1 = -84 % ((param0 - -39) / 46);
        field_q = null;
    }

    eg(int param0) {
        ((eg) this).field_m = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = new uf();
        field_p = "Use this alternative as your account name";
    }
}
