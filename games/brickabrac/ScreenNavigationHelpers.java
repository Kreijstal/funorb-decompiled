/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ScreenNavigationHelpers {
    static String field_f;
    static int quickChatChannel;
    static IndexedSprite[] field_d;
    static RgbSprite spaceFarSprite;
    static String field_e;
    static String quickChatHelpTitle;

    final static void requestScreen(boolean usePointer, int obfuscationGuard, int screenId) {
        if (InvitationDialogHelpers.pendingScreen != null) {
          OpacityWidget.finishScreenTransition((byte) -127);
        }
        if (AccountMessageDialog.currentScreen.screenId == screenId) {
          return;
        }
        InvitationDialogHelpers.pendingScreen = GameUiController.getScreen(screenId, (byte) -128);
        if (InvitationDialogHelpers.pendingScreen instanceof MenuScreen) {
          ((MenuScreen) (InvitationDialogHelpers.pendingScreen)).onEnter(usePointer, 0, 125);
        }
        if (obfuscationGuard < 52) {
          ScreenNavigationHelpers.requestScreen(true, 107, -22);
        }
        NodeDequeCursor.screenTransitionTick = 0;
        SoundCache.playUiSound(8, NineSliceFrame.uiSounds[8]);
    }

    public static void a(byte param0) {
        spaceFarSprite = null;
        field_d = null;
        field_e = null;
        if (param0 == -49) {
          field_f = null;
          quickChatHelpTitle = null;
          return;
        }
        ScreenNavigationHelpers.pollQuickChatHelpDialog((byte) 114, true);
        field_f = null;
        quickChatHelpTitle = null;
    }

    final static void pollQuickChatHelpDialog(byte obfuscationGuard, boolean inputEnabled) {
        if (obfuscationGuard > -64) {
          ScreenNavigationHelpers.a((byte) -25);
          if (null == IntegerParsingHelpers.quickChatHelpDialog) {
            return;
          }
          if (IntegerParsingHelpers.quickChatHelpDialog.updateAndPollDismissal((byte) 79, inputEnabled)) {
            IntegerParsingHelpers.quickChatHelpDialog = null;
            return;
          }
          return;
        }
        if (null == IntegerParsingHelpers.quickChatHelpDialog) {
          return;
        }
        if (IntegerParsingHelpers.quickChatHelpDialog.updateAndPollDismissal((byte) 79, inputEnabled)) {
          IntegerParsingHelpers.quickChatHelpDialog = null;
          return;
        }
    }

    static {
        quickChatChannel = 0;
        field_e = "Remove name";
        quickChatHelpTitle = "Quick Chat Help";
        field_f = "That name is not available";
    }
}
