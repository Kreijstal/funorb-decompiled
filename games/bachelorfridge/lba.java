/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lba {
    static qia field_c;
    int field_a;
    int field_e;
    int field_d;
    int field_b;
    private static String field_z;

    public static void a(byte param0) {
        if (param0 >= -30) {
            lba.a((byte) -112);
            field_c = null;
            return;
        }
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = "lba.A(";
        field_c = new qia();
    }
}
