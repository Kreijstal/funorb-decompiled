/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class uj {
    static String field_b;
    static String field_e;
    static boolean field_c;
    static String field_a;
    static int field_d;
    private static String field_z;

    abstract byte[] a(int param0, int param1);

    abstract km a(byte param0);

    abstract int b(int param0, int param1);

    public static void b(byte param0) {
        field_e = null;
        if (param0 >= -47) {
            uj.b((byte) -117);
            field_b = null;
            field_a = null;
            return;
        }
        field_b = null;
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = "uj.B(";
        field_b = "OVER <%0>";
        field_e = "BDA-E";
        field_a = "Fullscreen";
        field_c = false;
        field_d = 0;
    }
}
