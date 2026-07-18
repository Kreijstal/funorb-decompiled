/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class u {
    static ka field_i;
    static ck field_h;
    static int field_b;
    static String field_g;
    static String field_a;
    static int field_e;
    static String field_d;
    static String field_c;
    static int field_f;

    public static void a(int param0) {
        field_g = null;
        field_a = null;
        field_h = null;
        field_d = null;
        field_i = null;
        field_c = null;
    }

    final static void a(byte param0, String param1, long param2) {
        CharSequence var5 = null;
        try {
            ed.field_c = param1;
            int var4_int = 0;
            pk.field_r = 2;
            var5 = (CharSequence) (Object) param1;
            cf.field_c = kf.a(var5, (byte) 2);
            jg.field_i = true;
            fm.field_d = param2;
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) (Object) runtimeException, "u.A(" + 115 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = -1;
        field_g = "Multiplayer Rankings";
        field_d = "Ask to join <%0>'s game";
        field_b = 1;
        field_c = "Breakfast";
        field_f = 0;
    }
}
