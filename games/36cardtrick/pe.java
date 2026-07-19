/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class pe {
    static sg field_b;
    static int[] field_a;
    private static String field_z;

    public static void a(byte param0) {
        field_b = null;
        if (param0 >= -37) {
            field_a = (int[]) null;
            field_a = null;
            return;
        }
        field_a = null;
    }

    abstract byte[] a(int param0, boolean param1);

    abstract d b(byte param0);

    abstract int a(int param0, int param1);

    static {
        field_z = "pe.A(";
        field_a = new int[8192];
        field_b = new sg();
    }
}
