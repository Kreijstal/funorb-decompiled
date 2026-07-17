/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wk extends gi {
    static int field_i;
    static String field_h;
    static he[] field_m;
    int field_n;
    long field_k;
    static String field_l;
    byte[] field_j;

    final static void a(int param0, int param1) {
        oa.field_b = param1;
        s.field_a.a(param1 * 128 / param0, (byte) -13);
    }

    public static void d(int param0) {
        field_m = null;
        field_h = null;
        field_l = null;
    }

    wk(long param0, int param1, byte[] param2) {
        try {
            ((wk) this).field_k = param0;
            ((wk) this).field_j = param2;
            ((wk) this).field_n = param1;
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) (Object) runtimeException, "wk.<init>(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "Accept";
        field_l = "As you are under 13, we won't save your email address on our systems. Your email address will still be used to log in, but you won't recieve any emails from Jagex. For more information, please check the relevant parts of our <%0><hotspot=0>Terms and Conditions</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
    }
}
