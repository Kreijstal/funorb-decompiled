/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fr {
    static byte[] field_b;
    static String field_a;
    static int field_c;
    private static String field_z;

    public static void a(byte param0) {
        field_a = null;
        field_b = null;
        if (param0 != 1) {
            field_a = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = "fr.A(";
        field_c = 0;
        field_b = new byte[]{(byte)2, (byte) 1};
        field_a = "Controls";
    }
}
