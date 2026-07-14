/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lb extends jo {
    static hj field_N;
    static String field_M;
    static dd[] field_O;
    static String[][] field_P;

    final void b(byte param0) {
        if (param0 != 108) {
            ((lb) this).b((byte) 24);
        }
    }

    public static void g(int param0) {
        field_M = null;
        field_O = null;
        field_N = null;
        field_P = null;
        if (param0 >= -70) {
            Object var2 = null;
            dd discarded$0 = lb.a((di) null, 82, (String) null, (String) null);
        }
    }

    final static dd a(di param0, int param1, String param2, String param3) {
        int var5 = 27 / ((29 - param1) / 34);
        int var4 = param0.b(param2, -1);
        int var6 = param0.a(var4, 0, param3);
        return jp.a(var6, (byte) 119, param0, var4);
    }

    lb(dd param0, int param1, int param2, int param3, int param4, int param5, int[] param6) {
        super(param0, param1, param2, param3, param4, param5, param6);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_N = new hj(1, 2, 2, 0);
        field_M = "Name is available";
    }
}
