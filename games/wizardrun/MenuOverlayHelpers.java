/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MenuOverlayHelpers {
    static int field_b;
    static QuickChatDynamicCommand field_a;

    final static void drawDimmedMenuOverlay(boolean param0, boolean param1) {
        QuickChatPhraseRepository.drawMenuOverlay((byte) -123, param0, true);
        if (param1) {
          MenuOverlayHelpers.drawDimmedMenuOverlay(true, false);
        }
    }

    public static void releaseStatics(int param0) {
        field_a = null;
        if (param0 != -26035) {
          MenuOverlayHelpers.a(52);
        }
    }

    final static void a(int param0) {
        int var1 = -51 % ((param0 - 63) / 40);
        LoginCredentials.field_a = 0;
    }

    static {
        field_b = 9;
        field_a = new QuickChatDynamicCommand(13, 0, 1, 0);
    }
}
