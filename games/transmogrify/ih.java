/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ih {
    static String field_a;
    static double field_d;
    static String field_c;
    static int field_b;
    private static String field_z;

    public static void a(byte param0) {
        field_c = null;
        field_a = null;
    }

    abstract el a(int param0);

    abstract byte[] a(int param0, int param1);

    abstract int b(int param0, int param1);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = "ih.C(";
        field_a = "Invalid password.";
        field_d = Math.atan2(1.0, 0.0);
        field_c = "Adding Monsters";
    }
}
