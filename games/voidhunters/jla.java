/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jla extends htb {
    static String field_B;

    final void c(int param0, int param1, int param2, int param3) {
        ((jla) this).field_u = !((jla) this).field_u ? true : false;
        super.c(param0, param1, param2, param3);
    }

    private jla(String param0, wwa param1, sba param2) {
        super(param0, param1, param2);
        ((jla) this).field_q = msa.field_s.field_d;
    }

    public static void a(int param0) {
        int var1 = 77 % ((param0 - -87) / 33);
        field_B = null;
    }

    private jla(String param0, sba param1) {
        this(param0, msa.field_s.field_a, param1);
        ((jla) this).field_q = msa.field_s.field_d;
    }

    final static dnb a(byte[] param0, byte param1, int param2) {
        dnb var3 = new dnb(param0);
        int var4 = -111 / ((param1 - -2) / 45);
        ahb.field_o.b(-10258, (ksa) (Object) var3);
        nv.a((byte) -61, var3, param2);
        return var3;
    }

    jla(String param0, sba param1, boolean param2) {
        this(param0, param1);
        ((jla) this).field_u = param2 ? true : false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_B = "<%0> is not a member, and cannot play with the current options.";
    }
}
