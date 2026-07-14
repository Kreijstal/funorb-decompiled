/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ho extends gd {
    static mf field_n;
    static int field_i;
    static byte[] field_m;
    static java.math.BigInteger field_k;
    static ql field_j;
    static int field_l;

    final String a(String param0, boolean param1) {
        if (!(((ho) this).a(param0, (byte) 122) != g.field_k)) {
            return nd.field_a;
        }
        if (!param1) {
            field_l = -45;
            return pk.field_J;
        }
        return pk.field_J;
    }

    public static void f(byte param0) {
        field_k = null;
        field_j = null;
        field_n = null;
        if (param0 != -76) {
            field_k = null;
            field_m = null;
            return;
        }
        field_m = null;
    }

    final fd a(String param0, byte param1) {
        if (param1 <= 52) {
            return null;
        }
        int var3 = pg.a(param0, (byte) -128) == null ? 1 : 0;
        if (!(var3 != 0)) {
            return g.field_k;
        }
        return tg.field_d;
    }

    ho(nk param0) {
        super(param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = new mf("");
        field_m = new byte[]{(byte)77, (byte)71, (byte)72, (byte)84, (byte)76};
        field_i = 640;
        field_k = new java.math.BigInteger("6757747274818513864204534133465045479284128469717186816691454417744823753827902036844748836683348383638677747113757906301249837209713747402067689777172847");
    }
}
