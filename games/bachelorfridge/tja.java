/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class tja {
    static int[] field_a;
    static String field_b;
    private static String field_z;

    abstract byte[] a(byte param0, int param1);

    abstract rf b(int param0);

    public static void a(int param0) {
        field_b = null;
        if (param0 != 8192) {
            return;
        }
        field_a = null;
    }

    abstract int a(int param0, int param1);

    static {
        field_z = "tja.I(";
        field_b = "Just play";
        field_a = new int[8192];
    }
}
