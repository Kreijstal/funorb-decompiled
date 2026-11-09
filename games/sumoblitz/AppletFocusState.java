/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AppletFocusState {
    static String retryText;
    static boolean focused;
    private static String field_z;

    public static void releaseStatics(byte param0) {
        if (param0 != -55) {
          AppletFocusState.releaseStatics((byte) 18);
          retryText = null;
          return;
        }
        retryText = null;
    }

    static {
        field_z = "ii.A(";
        retryText = "Retry";
    }
}
