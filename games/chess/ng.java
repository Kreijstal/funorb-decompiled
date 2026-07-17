/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ng {
    static di field_c;
    static km field_b;
    static String field_d;
    static String field_a;

    final static void a(int param0, boolean param1, long param2, int param3, String param4) {
        int var7_int = 0;
        try {
            qn.field_U.f(14, -60);
            qn.field_U.field_l = qn.field_U.field_l + 1;
            var7_int = qn.field_U.field_l;
            qn.field_U.a(-107, param2);
            qn.field_U.a(-110, param4);
            qn.field_U.c(param3, (byte) -126);
            qn.field_U.c(param1 ? 1 : 0, (byte) -95);
            qn.field_U.a(qn.field_U.field_l - var7_int, -1);
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) (Object) runtimeException, "ng.A(" + 14 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + (param4 != null ? "{...}" : "null") + 44 + 79 + 41);
        }
    }

    public static void a() {
        field_b = null;
        field_d = null;
        field_a = null;
        int var1 = -24;
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Player names can be up to 12 letters, numbers and underscores";
        field_a = "<%0> has entered another game.";
    }
}
