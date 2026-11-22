/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class RoundWinnerText {
    static String text;
    private static String field_z;

    public static void releaseStatics(boolean param0) {
        if (param0) {
          text = (String) null;
          text = null;
          return;
        }
        text = null;
    }

    static {
        field_z = "ru.A(";
        text = "<%0> wins the round!";
    }
}
