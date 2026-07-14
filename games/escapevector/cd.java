/*
 * Decompiled by CFR-JS 0.4.0.
 */
class cd extends fl {
    static long field_t;
    static int[] field_q;
    static String field_r;
    static cn field_s;
    static String field_u;
    static int field_v;

    cd() {
    }

    public static void f(int param0) {
        field_r = null;
        field_s = null;
        field_q = null;
        if (param0 != -1) {
            field_q = null;
            field_u = null;
            return;
        }
        field_u = null;
    }

    final static tk a(int param0, String param1) {
        if (param1 == null) {
            return ig.field_g;
        }
        if (param1.length() == 0) {
            return ig.field_g;
        }
        int var2 = param1.indexOf('@');
        if (!(param0 != var2)) {
            return mf.field_d;
        }
        String var3 = param1.substring(0, var2);
        String var4 = param1.substring(1 + var2);
        tk var5 = sf.a(var3, (byte) 119);
        if (!(var5 == null)) {
            return var5;
        }
        return rn.a(var4, param0 ^ -1);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = "Waiting for levels";
        field_u = "The account name you use to access RuneScape and other Jagex.com games";
        field_s = new cn();
        field_v = -1;
    }
}
