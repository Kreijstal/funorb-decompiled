/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nj {
    static String field_d;
    static String field_a;
    static long field_e;
    static int field_b;
    static String[] field_c;
    static int[] field_g;
    static md field_f;

    public static void a(byte param0) {
        field_f = null;
        field_c = null;
        field_d = null;
        field_g = null;
        field_a = null;
    }

    final static void a(nh param0, nh param1, int param2) {
        try {
            hf.field_pb = param0;
            jb.field_Qb = param1;
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) (Object) runtimeException, "nj.B(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + -6332 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Hall of Glass";
        field_a = "As you are under 13, we won't save your email address on our systems. Your email address will still be used to log in, but you won't recieve any emails from Jagex. For more information, please check the relevant parts of our <%0><hotspot=0>Terms and Conditions</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
        field_c = new String[]{"<%0> the Feared", "<%0> the Stalwart", "<%0> the Vengeful", "<%0> the Tyrant", "<%0>, Master of the Game"};
        field_e = 0L;
        field_g = new int[8192];
    }
}
