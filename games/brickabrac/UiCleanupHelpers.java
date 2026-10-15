/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class UiCleanupHelpers {
    static ConnectionPhase connectionFailed;
    static RgbSprite volcanicSmallSprite;
    static int field_d;
    static String field_b;
    static int sortedFaceCount;
    static String field_a;

    public static void a(int param0) {
        volcanicSmallSprite = null;
        field_a = null;
        connectionFailed = null;
        if (param0 > -46) {
          UiCleanupHelpers.cleanupPopupUi((byte) -35);
          field_b = null;
          return;
        }
        field_b = null;
    }

    final static void cleanupPopupUi(byte obfuscationGuard) {
        QuickChatPopupHelpers.cleanupPopupUi(224);
        int unusedGuardRemainder = -38 % ((46 - obfuscationGuard) / 52);
    }

    static {
        connectionFailed = new ConnectionPhase();
        sortedFaceCount = 0;
        field_a = "On";
        field_b = "Accept <%0> into this game";
    }
}
