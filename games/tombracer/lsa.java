/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lsa {
    static dn field_c;
    static int field_b;
    static int field_a;
    private static String field_z;

    public static void a(byte param0) {
        if (param0 < 13) {
            field_a = 78;
            field_c = null;
            return;
        }
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = "lsa.A(";
        field_c = new dn();
    }
}
