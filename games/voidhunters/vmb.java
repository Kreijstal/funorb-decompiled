/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class vmb {
    static int[] field_a;
    private static String field_z;

    public static void a(int param0) {
        if (param0 != 8192) {
            return;
        }
        field_a = null;
    }

    static {
        field_z = "vmb.A(";
        field_a = new int[8192];
    }
}
