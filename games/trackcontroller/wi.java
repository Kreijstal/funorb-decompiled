/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class wi {
    static jb field_c;
    static int field_b;
    static volatile int field_a;
    private static String field_z;

    abstract byte[] a(int param0, int param1);

    abstract int b(int param0, int param1);

    public static void a(boolean param0) {
        field_c = null;
        if (param0) {
            wi.a(false);
        }
    }

    abstract pc a(int param0);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = "wi.J(";
        field_b = 9;
        field_c = new jb();
        field_a = -1;
    }
}
