/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class EmailConfirmationHintText {
    static String text;
    private static String field_z;

    public static void releaseStatics(byte param0) {
        text = null;
        if (param0 <= 63) {
          text = (String) null;
        }
    }

    static {
        field_z = "ju.A(";
        text = "Type your email address again to make sure it's correct";
    }
}
