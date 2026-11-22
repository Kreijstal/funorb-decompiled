/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ClassicDisplayText {
    static String text;
    private static String field_z;

    public static void releaseStatics(int param0) {
        if (param0 != 3712) {
          ClassicDisplayText.releaseStatics(-86);
          text = null;
          return;
        }
        text = null;
    }

    static {
        field_z = "ke.A(";
        text = "Classic";
    }
}
