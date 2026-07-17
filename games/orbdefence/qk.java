/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qk {
    static String field_a;
    static String field_b;
    static String field_c;

    final static void a(String param0, byte param1) {
        try {
            pc.a(param0, true);
            int var2_int = 0;
            vd.a(false, -536866817, ki.field_d);
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) (Object) runtimeException, "qk.A(" + (param0 != null ? "{...}" : "null") + 44 + 111 + 41);
        }
    }

    public static void a(byte param0) {
        field_c = null;
        field_a = null;
        field_b = null;
    }

    final static ki a(int param0, int param1) {
        return al.a(true, 5200, param0, 1, false, false);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "OK";
        field_a = "Create a free account to start using this feature";
        field_c = "If you do nothing the game will revert to normal view in <%0> seconds.";
    }
}
