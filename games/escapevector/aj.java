/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aj {
    static int field_d;
    static fe field_a;
    static hj field_f;
    static String field_e;
    static String field_b;
    static ed field_c;

    final static void a(int param0, int param1, ij param2) {
        c var3 = null;
        try {
            var3 = om.field_c;
            var3.a(3, true);
            var3.f(5, -123);
            var3.f(0, -123);
            var3.h(-123, param2.field_n);
            var3.f(param2.field_h, -123);
            var3.f(param2.field_j, -123);
            int var4 = 58 % ((param0 - -64) / 39);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "aj.B(" + param0 + ',' + 3 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_a = null;
        field_e = null;
        field_f = null;
        field_c = null;
    }

    final static boolean b(int param0) {
        if (param0 > -88) {
            field_a = null;
            return nf.field_u;
        }
        return nf.field_u;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = 0;
        field_e = "Unfortunately your configuration doesn't support fullscreen mode.";
        field_b = "By clicking Create, you agree to the <%0><hotspot=0>Terms of Use</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
    }
}
