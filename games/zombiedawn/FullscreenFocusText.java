/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class FullscreenFocusText {
    static String field_a;
    private static String field_z;

    public static void releaseStatics(int param0) {
        field_a = null;
        if (param0 != 4466) {
          FullscreenFocusText.releaseStatics(87);
        }
    }

    static {
        field_z = "il.A(";
        field_a = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled, or try a different resolution.";
    }
}
