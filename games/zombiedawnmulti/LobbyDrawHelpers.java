/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LobbyDrawHelpers {
    static String field_g;
    static String field_c;
    static IndexedSprite field_f;
    static String field_d;
    static String field_e;
    static String[] field_a;
    static boolean field_b;

    public static void releaseStatics(int param0) {
        field_a = null;
        field_c = null;
        if (param0 < -21) {
          field_e = null;
          field_g = null;
          field_f = null;
          field_d = null;
          return;
        }
        LobbyDrawHelpers.releaseStatics(97);
        field_e = null;
        field_g = null;
        field_f = null;
        field_d = null;
    }

    final static void drawLobbyAndChatPanels(boolean param0, boolean param1) {
        if (PendingStatusRequest.hasBlockingInputPopup((byte) -114)) {
          param0 = false;
        }
        NameEntryPopup.drawLobbyBackgroundPanels(param0, -7579);
        if (ScreechAura.field_f) {
          SoftwareRasterizer.clearRect(BirthDateInputWidget.field_U.field_c.field_x, BirthDateInputWidget.field_U.field_c.field_Q, BirthDateInputWidget.field_U.field_c.field_zb, BirthDateInputWidget.field_U.field_c.field_z);
          BirthDateInputWidget.field_U.field_c.drawRoot(param0, -1);
          if (param1) {
            field_a = (String[]) null;
            QuickChatPhraseRegistry.drawRootUiAndOverlay(1, param0);
            return;
          }
          QuickChatPhraseRegistry.drawRootUiAndOverlay(1, param0);
          return;
        }
        if (!param1) {
          QuickChatPhraseRegistry.drawRootUiAndOverlay(1, param0);
          return;
        }
        field_a = (String[]) null;
        QuickChatPhraseRegistry.drawRootUiAndOverlay(1, param0);
    }

    static {
        field_g = "Match over";
        field_d = "ESC - cancel private message";
        field_a = new String[]{"The Mall", "Power Plant", "Precinct", "White House", "Locked"};
        field_e = "Ignore";
    }
}
