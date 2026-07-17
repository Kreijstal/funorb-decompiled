/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gi extends RuntimeException {
    static kv[] field_b;
    static boolean field_a;
    Throwable field_d;
    String field_e;
    static sna field_c;

    public static void a() {
        field_b = null;
        field_c = null;
        int var1 = 10;
    }

    gi(Throwable param0, String param1) {
        ((gi) this).field_d = param0;
        ((gi) this).field_e = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = true;
    }
}
