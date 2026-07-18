/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rn {
    static gu field_e;
    static int field_d;
    static je field_a;
    static int field_c;
    static String field_b;

    final static void a(int param0, ha param1) {
        try {
            nn.a((byte) 96, param1);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "rn.C(" + -118 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static int a(int param0, int param1) {
        return param0 & param1;
    }

    final static String b() {
        if (null == mv.field_d) {
            return "";
        }
        return mv.field_d;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static void a(int param0, String param1, boolean param2, boolean param3) {
        try {
            int discarded$0 = 1;
            ou.a();
            rl.field_C.j(-121);
            np.field_Qb = new df(ga.field_d, (String) null, fh.field_i, param2, param3);
            lt.field_g = new lw(rl.field_C, (kb) (Object) np.field_Qb);
            rl.field_C.a((kb) (Object) lt.field_g, 0);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "rn.B(" + 3 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    public static void a() {
        field_e = null;
        field_b = null;
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new gu();
        field_b = "This structure is not captured";
        field_c = 3;
    }
}
