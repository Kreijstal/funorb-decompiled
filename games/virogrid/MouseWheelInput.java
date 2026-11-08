/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class MouseWheelInput {
    static LogoAndLoginHelpers field_a;
    static String textViewcontrolsZoomin;
    static StateToken field_c;
    static Sprite[] achievementIcons;

    abstract int pollRotation(int param0);

    final static boolean dispatchKeyInput(int param0, int param1, int param2, int param3) {
        if (param0 != -13079) {
          field_c = (StateToken) null;
          if (FrameSkin.field_f) {
            return CameraAndLogoHelpers.field_c.dispatchKeyInput(ScrollPane.field_Gb, PopupMenuHelpers.field_d, -99);
          }
          if (ChatPanelUpdateHelpers.field_e) {
            return TextureCache.handleQuickChatKey((byte) 103, param3, param2);
          }
          if (ChatShortcutHelpers.handleChatShortcutKey(param3, param2, true)) {
            return true;
          }
          if (!RankingsRequest.field_n) {
            return LobbySessionHelpers.handleChatInputKey(param1, param2, (byte) -97);
          }
          return false;
        }
        if (FrameSkin.field_f) {
          return CameraAndLogoHelpers.field_c.dispatchKeyInput(ScrollPane.field_Gb, PopupMenuHelpers.field_d, -99);
        }
        if (ChatPanelUpdateHelpers.field_e) {
          return TextureCache.handleQuickChatKey((byte) 103, param3, param2);
        }
        if (ChatShortcutHelpers.handleChatShortcutKey(param3, param2, true)) {
          return true;
        }
        if (!RankingsRequest.field_n) {
          return LobbySessionHelpers.handleChatInputKey(param1, param2, (byte) -97);
        }
        return false;
    }

    abstract void detach(int param0, java.awt.Component param1);

    public static void releaseStatics(int param0) {
        field_a = null;
        if (param0 != 3981) {
          return;
        }
        field_c = null;
        textViewcontrolsZoomin = null;
        achievementIcons = null;
    }

    abstract void attach(int param0, java.awt.Component param1);

    static {
        textViewcontrolsZoomin = "Zoom in";
        field_a = new LogoAndLoginHelpers();
    }
}
