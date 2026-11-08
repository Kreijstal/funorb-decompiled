/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bc {
    static String lowText;
    static gj field_a;
    private static String field_z;

    public static void releaseStatics(int param0) {
        if (param0 <= 101) {
          return;
        }
        field_a = null;
        lowText = null;
    }

    static {
        field_z = "bc.A(";
        lowText = "Low";
    }
}
