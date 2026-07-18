/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rc {
    static ge[] field_d;
    static String field_b;
    static int[] field_i;
    static nh[][] field_a;
    static String field_h;
    static int field_g;
    static String field_c;
    static String field_e;
    static String field_f;

    final static void a(int param0, nl param1, int param2) {
        try {
            if (param2 != -11659) {
                Object var4 = null;
                rc.a(-11, (nl) null, 100);
            }
            gf.field_A.a((gi) (Object) param1, 255);
            fc.a(-121, param1, param0);
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) (Object) runtimeException, "rc.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public static void a() {
        field_c = null;
        field_i = null;
        field_b = null;
        field_e = null;
        field_f = null;
        field_d = null;
        field_a = null;
        field_h = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Log in";
        field_a = new nh[9][2];
        field_g = 0;
        field_h = "Unfortunately your configuration doesn't support fullscreen mode.";
        field_c = "Email: ";
        field_f = "Orb points: <%0>";
    }
}
