/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class he {
    static ab field_e;
    static vn field_f;
    static String field_b;
    static String field_g;
    static int[] field_a;
    static String field_c;
    static String field_d;

    public static void a(int param0) {
        field_e = null;
        field_b = null;
        field_f = null;
        field_a = null;
        field_c = null;
        field_g = null;
        field_d = null;
    }

    final static void a(int param0, String param1) {
        if (param0 != 1) {
            return;
        }
        try {
            vi.a((byte) 84, param1);
            jn.a(bj.field_qb, false, param0 + -2);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "he.A(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Achievements";
        field_b = "Instructions";
        field_c = "Private";
        field_f = null;
    }
}
