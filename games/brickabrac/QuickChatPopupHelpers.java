/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class QuickChatPopupHelpers {
    static String field_g;
    static ContextMenu contextMenuStyle;
    static RgbSprite desertSmallSprite;
    static int[][] fullscreenDialogButtonBounds;
    static char[] nameCharacterExtensions;
    static int field_d;
    static PaletteFont field_e;

    final static void cleanupPopupUi(int obfuscationGuard) {
        if (ResourceArchive.field_f != null) {
          ResourceArchive.field_f.removeHiddenLayers((byte) -36);
          if (obfuscationGuard != 224) {
            field_d = -126;
            if (null != ChatLobbyUiHelpers.loadingProgressDialog) {
              ChatLobbyUiHelpers.loadingProgressDialog.stopActivityAnimation(6457);
            }
            UsernameAvailabilityValidator.clearTooltipState((byte) -83);
            return;
          }
          if (null != ChatLobbyUiHelpers.loadingProgressDialog) {
            ChatLobbyUiHelpers.loadingProgressDialog.stopActivityAnimation(6457);
          }
          UsernameAvailabilityValidator.clearTooltipState((byte) -83);
          return;
        }
        if (obfuscationGuard == 224) {
          if (null != ChatLobbyUiHelpers.loadingProgressDialog) {
            ChatLobbyUiHelpers.loadingProgressDialog.stopActivityAnimation(6457);
          }
          UsernameAvailabilityValidator.clearTooltipState((byte) -83);
          return;
        }
        field_d = -126;
        if (null != ChatLobbyUiHelpers.loadingProgressDialog) {
          ChatLobbyUiHelpers.loadingProgressDialog.stopActivityAnimation(6457);
        }
        UsernameAvailabilityValidator.clearTooltipState((byte) -83);
    }

    final static void updateQuickChatMenu(boolean inputEnabled, int filterOpcode, byte obfuscationGuard, int messageOpcode) {
        int anyPressedItem;
        int rightEdgeWithInputDisabled;
        int rightEdge;
        int rightEdgeAfterPress;
        int rightEdgeAfterPressWithGuardSideEffect;
        if (!TooltipSprite.quickChatMenuOpen) {
          return;
        }
        QuickChatPhraseDefinition.quickChatMenuRoot.updateRoot(inputEnabled, -15211);
        anyPressedItem = hd.quickChatMenu.hasPressedItem(28) ? 1 : 0;
        if (0 != BackgroundScene.pressedButton) {
          if (anyPressedItem != 0) {
            if (!inputEnabled) {
              QuickChatPhraseDefinition.quickChatMenuRoot.updateRoot(inputEnabled, -15211);
              if (obfuscationGuard < 89) {
                field_e = (PaletteFont) null;
              }
              rightEdgeWithInputDisabled = hd.quickChatMenu.getOpenChainWidth((byte) -92) + hd.quickChatMenu.screenX;
              if (rightEdgeWithInputDisabled > 640) {
                HighscoresScreen.quickChatScrollX = HighscoresScreen.quickChatScrollX + 5;
                return;
              }
              if (635 <= rightEdgeWithInputDisabled) {
                return;
              }
              if (HighscoresScreen.quickChatScrollX <= 0) {
                return;
              }
              HighscoresScreen.quickChatScrollX = HighscoresScreen.quickChatScrollX - 5;
              return;
            }
            hd.quickChatMenu.processPressedItems(38, messageOpcode, filterOpcode);
            QuickChatPhraseDefinition.quickChatMenuRoot.updateRoot(inputEnabled, -15211);
            if (obfuscationGuard >= 89) {
              rightEdgeAfterPress = hd.quickChatMenu.getOpenChainWidth((byte) -92) + hd.quickChatMenu.screenX;
              if (rightEdgeAfterPress > 640) {
                HighscoresScreen.quickChatScrollX = HighscoresScreen.quickChatScrollX + 5;
                return;
              }
              if (635 <= rightEdgeAfterPress) {
                return;
              }
              if (HighscoresScreen.quickChatScrollX <= 0) {
                return;
              }
              HighscoresScreen.quickChatScrollX = HighscoresScreen.quickChatScrollX - 5;
              return;
            }
            field_e = (PaletteFont) null;
            rightEdgeAfterPressWithGuardSideEffect = hd.quickChatMenu.getOpenChainWidth((byte) -92) + hd.quickChatMenu.screenX;
            if (rightEdgeAfterPressWithGuardSideEffect <= 640) {
              if (635 <= rightEdgeAfterPressWithGuardSideEffect) {
                return;
              }
              if (HighscoresScreen.quickChatScrollX <= 0) {
                return;
              }
              HighscoresScreen.quickChatScrollX = HighscoresScreen.quickChatScrollX - 5;
            } else {
              HighscoresScreen.quickChatScrollX = HighscoresScreen.quickChatScrollX + 5;
            }
            return;
          }
          QuickChatParameterType.closeQuickChatIfOpen(1);
          inputEnabled = false;
        }
        if (inputEnabled) {
          hd.quickChatMenu.processPressedItems(38, messageOpcode, filterOpcode);
        }
        if (anyPressedItem != 0) {
          QuickChatPhraseDefinition.quickChatMenuRoot.updateRoot(inputEnabled, -15211);
        }
        if (obfuscationGuard < 89) {
          field_e = (PaletteFont) null;
        }
        rightEdge = hd.quickChatMenu.getOpenChainWidth((byte) -92) + hd.quickChatMenu.screenX;
        if (rightEdge > 640) {
          HighscoresScreen.quickChatScrollX = HighscoresScreen.quickChatScrollX + 5;
          return;
        }
        if (635 > rightEdge) {
          if (HighscoresScreen.quickChatScrollX <= 0) {
            return;
          }
          HighscoresScreen.quickChatScrollX = HighscoresScreen.quickChatScrollX - 5;
        }
        return;
    }

    public static void b(int param0) {
        field_e = null;
        if (param0 < 16) {
          return;
        }
        nameCharacterExtensions = null;
        contextMenuStyle = null;
        desertSmallSprite = null;
        fullscreenDialogButtonBounds = (int[][]) null;
        field_g = null;
    }

    static {
        field_g = "<%0> wants to join";
        nameCharacterExtensions = new char[]{(char)32, (char)160, (char)95, (char)45, (char)224, (char)225, (char)226, (char)228, (char)227, (char)192, (char)193, (char)194, (char)196, (char)195, (char)232, (char)233, (char)234, (char)235, (char)200, (char)201, (char)202, (char)203, (char)237, (char)238, (char)239, (char)205, (char)206, (char)207, (char)242, (char)243, (char)244, (char)246, (char)245, (char)210, (char)211, (char)212, (char)214, (char)213, (char)249, (char)250, (char)251, (char)252, (char)217, (char)218, (char)219, (char)220, (char)231, (char)199, (char)255, (char)376, (char)241, (char)209, (char)223};
        field_d = 65;
    }
}
