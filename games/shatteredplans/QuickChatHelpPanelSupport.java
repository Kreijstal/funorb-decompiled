/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class QuickChatHelpPanelSupport {
    static String field_a;
    static String field_b;

    final static void pollQuickChatHelpPanel(boolean param0, byte param1) {
        if (param1 != -26) {
          field_a = (String) null;
          if (IndexedSpriteState.field_h == null) {
            return;
          }
          if (IndexedSpriteState.field_h.updateAndCheckDismissed(param0, -1)) {
            IndexedSpriteState.field_h = null;
            return;
          }
          return;
        }
        if (IndexedSpriteState.field_h == null) {
          return;
        }
        if (IndexedSpriteState.field_h.updateAndCheckDismissed(param0, -1)) {
          IndexedSpriteState.field_h = null;
          return;
        }
    }

    public static void clearStatics(int param0) {
        field_a = null;
        if (param0 != 7526) {
          QuickChatHelpPanelSupport.pollQuickChatHelpPanel(false, (byte) -123);
          field_b = null;
          return;
        }
        field_b = null;
    }

    static {
        field_b = "You are offering to draw.";
        field_a = "Offensive account name";
    }
}
