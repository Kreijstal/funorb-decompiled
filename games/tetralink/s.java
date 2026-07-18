/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class s {
    static int field_d;
    static oh[] field_e;
    static String field_b;
    static boolean field_f;
    static float field_c;
    static wf[] field_a;

    final static void a(int param0, qa param1) {
        try {
            param1.field_t = new int[]{-1};
            param1.field_u = new char[]{'?'};
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) (Object) runtimeException, "s.C(" + -1 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a() {
        field_a = null;
        field_b = null;
        field_e = null;
    }

    final static boolean b() {
        return ~qb.field_N.field_cc == ~oj.field_c;
    }

    final static void a(int param0, oh[] param1, byte param2, int param3, boolean param4, int param5, int param6, int param7, int param8, int param9, jb param10, oh[] param11) {
        try {
            if (param2 != 7) {
                field_b = null;
            }
            li.a(param6, param1, param8, param4, -89, param7, param9, param11, param3, param5, param10, param9, param10, param8, param0);
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) (Object) runtimeException, "s.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + (param10 != null ? "{...}" : "null") + ',' + (param11 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "You are invited to <%0>'s game.";
        field_c = 0.0f;
        field_f = false;
        field_d = 0;
    }
}
