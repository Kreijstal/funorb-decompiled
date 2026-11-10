/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SessionSocketHolder {
    static BufferedSocket field_a;
    private static String field_z;

    public static void releaseStatics(boolean param0) {
        if (param0) {
          SessionSocketHolder.releaseStatics(true);
          field_a = null;
          return;
        }
        field_a = null;
    }

    static {
        field_z = "sb.A(";
    }
}
