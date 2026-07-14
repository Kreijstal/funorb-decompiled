/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class iea {
    static eaa field_d;
    static String field_c;
    static String field_b;
    static kv field_a;

    final static void a(int param0, int param1, byte param2) {
        qaa.field_c = param0;
        if (param2 > -81) {
            return;
        }
        mg.field_k = param1;
    }

    public static void a(int param0) {
        field_c = null;
        field_a = null;
        field_d = null;
        if (param0 != 24166) {
            return;
        }
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Only show private chat from my friends and opponents";
        field_b = "Loading graphics";
    }
}
