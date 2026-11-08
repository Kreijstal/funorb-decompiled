/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MeshColourEntry {
    static String[] field_d;
    static int field_c;
    static String[] field_e;
    static Sprite field_a;
    int field_b;

    public static void releaseStatics(int param0) {
        field_e = null;
        if (param0 != 20) {
          MeshColourEntry.drawAccountAndQuickChatOverlays(false, (byte) 23);
          field_d = null;
          field_a = null;
          return;
        }
        field_d = null;
        field_a = null;
    }

    final static void drawAccountAndQuickChatOverlays(boolean param0, byte param1) {
        if (MarkerSlider.isOverlayOpen((byte) 120)) {
          param0 = false;
        }
        DisplayNameHelpers.drawAccountOverlays((byte) 58, param0);
        if (param1 != 83) {
          return;
        }
        ChallengePuzzleHelpers.drawQuickChatOverlay((byte) 1);
    }

    static {
    }
}
