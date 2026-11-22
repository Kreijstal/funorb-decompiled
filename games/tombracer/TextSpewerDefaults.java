/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TextSpewerDefaults {
    static String[] messages;
    private static String field_z;

    public static void releaseStatics(int param0) {
        if (param0 >= -22) {
          TextSpewerDefaults.releaseStatics(50);
          messages = null;
          return;
        }
        messages = null;
    }

    static {
        field_z = "fda.A(";
    }
}
