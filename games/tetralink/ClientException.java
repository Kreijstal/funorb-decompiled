/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ClientException extends RuntimeException {
    Throwable cause;
    String field_d;
    static int field_f;
    static float field_g;
    static String field_c;
    static IconLabelItem[][] field_e;
    static String field_b;

    final static UiComponent getGameListContent(int param0) {
        if (param0 != 12) {
          ClientException.releaseStatics(false);
          return NineSliceFrameHelpers.getChatInputWidget(0);
        }
        return NineSliceFrameHelpers.getChatInputWidget(0);
    }

    final static void updateCreateGameControls(boolean param0, int param1, int param2, boolean param3) {
        UiComponent stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        boolean stackIn_9_2 = false;
        UiComponent stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        boolean stackIn_16_2 = false;
        UiComponent stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        boolean stackIn_21_2 = false;
        UiComponent stackIn_53_0 = null;
        int stackIn_53_1 = 0;
        boolean stackIn_54_2 = false;
        UiComponent stackIn_60_0 = null;
        int stackIn_60_1 = 0;
        boolean stackIn_61_2 = false;
        UiComponent stackIn_65_0 = null;
        int stackIn_65_1 = 0;
        boolean stackIn_66_2 = false;
        NodeHashTableIterator.layoutLobbySlidePanels((byte) -97);
        if (0 <= ContextMenu.field_Pb) {
          GameClock.field_e.field_jb = SectorCacheStore.formatTemplate(new String[]{Integer.toString(ContextMenu.field_Pb)}, DelegatingCanvas.field_b, 120);
          if (param2 != 21485) {
            return;
          }
          stackIn_8_0 = DateInputWidget.field_P;
          stackIn_8_1 = 0;
          stackIn_9_2 = (param3) && (!param0) && (!LoginCredentials.field_b) && (AccountWelcomePanel.field_N == null) && (GameKeyHandler.field_a == null);
          ((UiComponent) (Object) stackIn_8_0).updateInput(stackIn_8_1, stackIn_9_2);
          stackIn_15_0 = GameKeyHandler.field_c;
          stackIn_15_1 = 0;
          stackIn_16_2 = (param3) && (!param0) && (!LoginCredentials.field_b) && (AccountWelcomePanel.field_N == null) && (GameKeyHandler.field_a == null);
          ((UiComponent) (Object) stackIn_15_0).updateInput(stackIn_15_1, stackIn_16_2);
          stackIn_20_0 = ArchiveIndex.field_q;
          stackIn_20_1 = 0;
          stackIn_21_2 = (param3) && (!param0) && (LoginCredentials.field_b);
          ((UiComponent) (Object) stackIn_20_0).updateInput(stackIn_20_1, stackIn_21_2);
        } else {
          GameClock.field_e.field_jb = null;
          if (param2 != 21485) {
            return;
          }
          stackIn_53_0 = DateInputWidget.field_P;
          stackIn_53_1 = 0;
          stackIn_54_2 = (param3) && (!param0) && (!LoginCredentials.field_b) && (AccountWelcomePanel.field_N == null) && (GameKeyHandler.field_a == null);
          ((UiComponent) (Object) stackIn_53_0).updateInput(stackIn_53_1, stackIn_54_2);
          stackIn_60_0 = GameKeyHandler.field_c;
          stackIn_60_1 = 0;
          stackIn_61_2 = (param3) && (!param0) && (!LoginCredentials.field_b) && (AccountWelcomePanel.field_N == null) && (GameKeyHandler.field_a == null);
          ((UiComponent) (Object) stackIn_60_0).updateInput(stackIn_60_1, stackIn_61_2);
          stackIn_65_0 = ArchiveIndex.field_q;
          stackIn_65_1 = 0;
          stackIn_66_2 = (param3) && (!param0) && (LoginCredentials.field_b);
          ((UiComponent) (Object) stackIn_65_0).updateInput(stackIn_65_1, stackIn_66_2);
        }
        PasswordLoginCredentials.field_j.field_g.processTabPresses(true);
        if (PasswordLoginCredentials.field_i.field_F != 0) {
          PacketBuffer.field_p = true;
        }
        if (GameSession.field_q.field_F != 0) {
          if (HighscoreQuery.field_r) {
            PasswordLoginCredentials.sendRatedGameRequest(param1, 0);
          } else {
            if (CacheEntry.field_C > 0) {
              PasswordLoginCredentials.sendRatedGameRequest(param1, 0);
            } else {
              if (2 <= SettingsCookieHelpers.field_c &&
                ErrorPrintHelpers.field_a[12]) {
                PasswordLoginCredentials.sendRatedGameRequest(param1, 0);
              }
            }
          }
        }
        if (IntrusiveDeque.field_e.field_F != 0) {
          if (1 == MenuScreen.field_f.length &&
            MenuScreen.field_f[0] != TetraLink.field_N) {
            TetraLink.field_N = MenuScreen.field_f[0];
          }
          TextWidgetPainter.sendCreateGameRequest(0, true, PieceDropAnimation.field_o, param1, true, TetraLink.field_N);
        }
        if (0 != DelegatingCanvas.field_a.field_F) {
          LoginCredentials.field_b = false;
        }
    }

    public static void releaseStatics(boolean param0) {
        if (!param0) {
          return;
        }
        field_e = (IconLabelItem[][]) null;
        field_b = null;
        field_c = null;
    }

    ClientException(Throwable param0, String param1) {
        this.cause = param0;
        this.field_d = param1;
    }

    static {
        field_c = "This option cannot be combined with the current '<%0>' setting.";
        field_b = "Some players haven't unlocked the currently selected game options.<br>Please view the '<%0>' tab on the left for details.";
    }
}
