/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class oe {
    static boolean field_a;
    static String field_c;
    static byte[][] field_e;
    static String field_f;
    static boolean field_b;
    static float field_d;
    static String[] field_g;

    abstract void a(java.awt.Component param0, int param1);

    final static void a(boolean param0) {
        ef.field_a = 0;
    }

    abstract void a(int param0, java.awt.Component param1);

    public static void b(byte param0) {
        field_e = null;
        field_c = null;
        field_g = null;
        field_f = null;
    }

    abstract int a(byte param0);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Login: ";
        field_f = "DANGER!";
        field_e = new byte[1000][];
        field_b = false;
    }
}
