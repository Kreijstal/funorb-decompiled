/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ng {
    static String field_f;
    static int quickChatChannel;
    static IndexedSprite[] field_d;
    static RgbSprite spaceFarSprite;
    static String field_e;
    static String field_c;

    final static void requestScreen(boolean usePointer, int obfuscationGuard, int screenId) {
        if (hd.pendingScreen != null) {
          OpacityWidget.finishScreenTransition((byte) -127);
        }
        if (AccountMessageDialog.currentScreen.screenId == screenId) {
          return;
        }
        hd.pendingScreen = GameUiController.getScreen(screenId, (byte) -128);
        if (hd.pendingScreen instanceof MenuScreen) {
          ((MenuScreen) (hd.pendingScreen)).onEnter(usePointer, 0, 125);
        }
        if (obfuscationGuard < 52) {
          ng.requestScreen(true, 107, -22);
        }
        NodeDequeCursor.screenTransitionTick = 0;
        SoundCache.playUiSound(8, ta.uiSounds[8]);
    }

    public static void a(byte param0) {
        spaceFarSprite = null;
        field_d = null;
        field_e = null;
        if (param0 == -49) {
          field_f = null;
          field_c = null;
          return;
        }
        ng.a((byte) 114, true);
        field_f = null;
        field_c = null;
    }

    final static void a(byte param0, boolean param1) {
        if (param0 > -64) {
          ng.a((byte) -25);
          if (null == sq.quickChatHelpDialog) {
            return;
          }
          if (sq.quickChatHelpDialog.updateAndPollDismissal((byte) 79, param1)) {
            sq.quickChatHelpDialog = null;
            return;
          }
          return;
        }
        if (null == sq.quickChatHelpDialog) {
          return;
        }
        if (sq.quickChatHelpDialog.updateAndPollDismissal((byte) 79, param1)) {
          sq.quickChatHelpDialog = null;
          return;
        }
    }

    static {
        quickChatChannel = 0;
        field_e = "Remove name";
        field_c = "Quick Chat Help";
        field_f = "That name is not available";
    }
}
