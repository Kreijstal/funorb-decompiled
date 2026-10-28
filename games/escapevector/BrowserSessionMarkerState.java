/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class BrowserSessionMarkerState {
    static QuickChatDynamicCommand field_c;
    static boolean markerSet;
    static String field_b;
    private static String field_z;

    public static void releaseStatics(int guard) {
        field_c = null;
        field_b = null;
        if (guard <= 17) {
          markerSet = false;
        }
    }

    static {
        field_z = "an.A(";
        field_c = new QuickChatDynamicCommand(13, 0, 1, 0);
        field_b = "Fullscreen";
    }
}
