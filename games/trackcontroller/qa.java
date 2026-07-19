/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qa {
    static byte[] field_a;
    static int[] field_b;
    private static String field_z;

    public static void a(boolean param0) {
        field_a = null;
        if (!param0) {
            qa.a(true);
            field_b = null;
            return;
        }
        field_b = null;
    }

    static {
        field_z = "qa.A(";
        field_b = new int[8192];
    }
}
