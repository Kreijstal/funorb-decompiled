/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fda {
    static String[] field_a;
    private static String field_z;

    public static void releaseStatics(int param0) {
        if (param0 >= -22) {
          fda.releaseStatics(50);
          field_a = null;
          return;
        }
        field_a = null;
    }

    static {
        field_z = "fda.A(";
    }
}
