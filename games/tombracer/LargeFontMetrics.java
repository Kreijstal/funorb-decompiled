/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LargeFontMetrics {
    static GameFontMetrics metrics;
    private static String field_z;

    public static void releaseStatics(byte param0) {
        if (param0 >= -8) {
          return;
        }
        metrics = null;
    }

    static {
        field_z = "wb.A(";
    }
}
