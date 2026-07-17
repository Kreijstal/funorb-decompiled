/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class pe {
    static sg field_b;
    static int[] field_a;
    private static String field_z;

    public static void a() {
        field_b = null;
        field_a = null;
    }

    abstract byte[] a(int param0, boolean param1);

    abstract d b(byte param0);

    abstract int a(int param0, int param1);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = "pe.A(";
        field_a = new int[8192];
        field_b = new sg();
    }
}
