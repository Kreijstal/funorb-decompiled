/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fl {
    static long field_a;
    static String field_b;

    public static void a(int param0) {
        if (param0 != -20562) {
            fl.a(-20);
            field_b = null;
            return;
        }
        field_b = null;
    }

    final static void a(ka param0) {
        try {
            param0.field_M.field_w = (double)4;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "fl.B(" + (param0 != null ? "{...}" : "null") + ',' + 4 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Return to Main Menu";
    }
}
