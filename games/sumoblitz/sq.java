/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sq {
    static FontMetrics field_b;
    static int[] field_a;
    private static String field_z;

    public static void releaseStatics(int param0) {
        field_a = null;
        field_b = null;
        if (param0 >= -79) {
          sq.releaseStatics(62);
        }
    }

    static {
        field_z = "sq.A(";
    }
}
