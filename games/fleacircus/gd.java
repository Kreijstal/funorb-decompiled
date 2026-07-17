/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gd {
    static volatile int field_a;
    static ed field_b;
    static String field_c;
    static String field_d;

    public static void a(int param0) {
        field_b = null;
        field_d = null;
        field_c = null;
    }

    final static boolean a(byte param0) {
        if (param0 != 70) {
            boolean discarded$0 = gd.a((byte) 83);
            return gf.field_e.a((byte) -128);
        }
        return gf.field_e.a((byte) -128);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = -1;
        field_b = new ed();
        field_d = "Cancel";
        field_c = "Confirm Password: ";
    }
}
