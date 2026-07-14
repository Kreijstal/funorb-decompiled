/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class el extends RuntimeException {
    static int field_e;
    static String field_c;
    static int field_d;
    String field_b;
    Throwable field_a;

    public static void a(int param0) {
        if (param0 != 0) {
            field_d = 29;
            field_c = null;
            return;
        }
        field_c = null;
    }

    el(Throwable param0, String param1) {
        ((el) this).field_b = param1;
        ((el) this).field_a = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "YES";
        field_e = 0;
    }
}
