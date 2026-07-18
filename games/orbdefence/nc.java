/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nc extends sf {
    static String field_Z;
    static java.math.BigInteger field_ab;
    static qd field_bb;
    static ja[] field_cb;

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        vl.field_f = param1;
        fe.field_c = param3;
        int var5 = 79 % ((52 - param0) / 57);
        el.field_D = param4;
        d.field_j = param2;
    }

    final static void a(int param0, int param1, int param2, String param3, byte param4, int param5, int param6, be param7, int param8) {
        try {
            tk.field_m = param2;
            ta.field_z = param5;
            m.field_b = param6;
            hc.field_f = param1;
            lh.field_b = param7;
            s.field_x = param0;
            fm.field_c = param3;
            if (param4 <= 87) {
                Object var10 = null;
                nc.a(13, 122, -103, (String) null, (byte) 38, 59, -112, (be) null, -9);
            }
            hf.field_k = param8;
            kg.field_h = (ge) (Object) new a();
            wj.field_o = new vl(param7);
            ed.field_b = new pi(kg.field_h, wj.field_o);
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) (Object) runtimeException, "nc.C(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ',' + param6 + ',' + (param7 != null ? "{...}" : "null") + ',' + param8 + ')');
        }
    }

    private nc() throws Throwable {
        super(0L, (sf) null);
        throw new Error();
    }

    public static void e(int param0) {
        field_ab = null;
        field_Z = null;
        field_cb = null;
        field_bb = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_ab = new java.math.BigInteger("6757747274818513864204534133465045479284128469717186816691454417744823753827902036844748836683348383638677747113757906301249837209713747402067689777172847");
        field_bb = new qd();
        field_cb = new ja[9];
    }
}
