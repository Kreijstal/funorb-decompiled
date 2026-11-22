/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PasswordLengthErrorText {
    static String text;
    private static String field_z;

    public static void releaseStatics(byte param0) {
        if (param0 < 27) {
          text = (String) null;
          text = null;
          return;
        }
        text = null;
    }

    static {
        field_z = "dva.A(";
        text = "Passwords must be between 5 and 20 characters long";
    }
}
