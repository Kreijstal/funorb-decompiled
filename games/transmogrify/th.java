/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class th {
    static int field_a;
    static String field_b;
    static String field_e;
    static String[] field_d;
    static td field_c;

    final static void a(int param0, int param1, ng param2) {
        hj var3 = null;
        try {
            var3 = ff.field_D;
            var3.a(false, param1);
            var3.f(6389, param2.field_m);
            var3.f(6389, param2.field_k);
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) (Object) runtimeException, "th.C(" + 65536 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, oa param1) {
        int var2_int = 0;
        try {
            ia.field_j = param1.a((byte) -116) << 5;
            var2_int = param1.d((byte) 41);
            cl.field_x = (var2_int & 7) << 18;
            ia.field_j = ia.field_j + (var2_int >> 3);
            cl.field_x = cl.field_x + (param1.a((byte) -112) << 2);
            var2_int = param1.d((byte) 64);
            cl.field_x = cl.field_x + (var2_int >> 6);
            ug.field_b = 2064384 & var2_int << 15;
            ug.field_b = ug.field_b + (param1.d((byte) 41) << 7);
            var2_int = param1.d((byte) 127);
            di.field_e = 65536 & var2_int << 16;
            ug.field_b = ug.field_b + (var2_int >> 1);
            di.field_e = di.field_e + param1.a((byte) -104);
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) (Object) runtimeException, "th.B(" + 101 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a() {
        field_b = null;
        field_e = null;
        field_c = null;
        field_d = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 0;
        field_b = "Shuffle";
        field_e = "No highscores";
    }
}
