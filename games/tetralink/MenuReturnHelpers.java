/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MenuReturnHelpers {
    static String[] field_d;
    static String field_f;
    static String field_b;
    static String[] field_a;
    static Sprite field_c;
    static int field_e;
    static String field_g;

    final static int getReplyFlagLength(int param0) {
        if (param0 != 32032) {
          return 79;
        }
        return 1;
    }

    final static void returnToMenuScreen(int param0, boolean param1) {
        int var2;
        int var3;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_48_0 = 0;
        CachedArchiveSource.field_y = 50.0f;
        InputDetachHelpers.field_e = 262144;
        MenuThemeHelpers.field_c = 52.5f;
        TextLayout.field_d[2] = 0.0;
        SectorCacheStore.field_c = 0;
        TextLayout.field_d[0] = 1.0;
        var2 = param1 ? 1 : 0;
        var3 = PlayerContextMenu.field_d;
        if (DraggableWidget.field_O == 0) {
          var3 = DraggableWidget.field_O;
          ScreenSwitchHelpers.switchScreen(param0, param0 - 120, var2 != 0, var3);
          if (DelayedIncomingPacket.field_v == 0) {
            return;
          }
          if (10 > DelayedIncomingPacket.field_v) {
            stackIn_7_0 = (DelayedIncomingPacket.field_v < 15) ? 2 : 4;
            GameKeyHandler.field_g = stackIn_7_0;
            IndexedSpriteState.field_c = stackIn_7_0;
          } else {
            if (20 > DelayedIncomingPacket.field_v) {
              return;
            }
            stackIn_12_0 = (DelayedIncomingPacket.field_v < 15) ? 2 : 4;
            GameKeyHandler.field_g = stackIn_12_0;
            IndexedSpriteState.field_c = stackIn_12_0;
          }
        } else {
          if (BackgroundSparkle.field_t == 2) {
            var3 = DraggableWidget.field_O;
            ScreenSwitchHelpers.switchScreen(param0, param0 - 120, var2 != 0, var3);
            if (DelayedIncomingPacket.field_v == 0) {
              return;
            }
            if (10 > DelayedIncomingPacket.field_v) {
              stackIn_23_0 = (DelayedIncomingPacket.field_v < 15) ? 2 : 4;
              GameKeyHandler.field_g = stackIn_23_0;
              IndexedSpriteState.field_c = stackIn_23_0;
            } else {
              if (20 > DelayedIncomingPacket.field_v) {
                return;
              }
              stackIn_29_0 = (DelayedIncomingPacket.field_v < 15) ? 2 : 4;
              GameKeyHandler.field_g = stackIn_29_0;
              IndexedSpriteState.field_c = stackIn_29_0;
            }
          } else {
            if (BackgroundSparkle.field_t == 3 ||
              DraggableWidget.field_O == 4 ||
              5 == DraggableWidget.field_O) {
              var3 = DraggableWidget.field_O;
            }
            ScreenSwitchHelpers.switchScreen(param0, param0 - 120, var2 != 0, var3);
            if (DelayedIncomingPacket.field_v == 0) {
              return;
            }
            if (10 > DelayedIncomingPacket.field_v) {
              stackIn_42_0 = (DelayedIncomingPacket.field_v < 15) ? 2 : 4;
              GameKeyHandler.field_g = stackIn_42_0;
              IndexedSpriteState.field_c = stackIn_42_0;
            } else {
              if (20 > DelayedIncomingPacket.field_v) {
                return;
              }
              stackIn_48_0 = (DelayedIncomingPacket.field_v < 15) ? 2 : 4;
              GameKeyHandler.field_g = stackIn_48_0;
              IndexedSpriteState.field_c = stackIn_48_0;
            }
          }
        }
        DelegatingCanvas.createGameOptions(true, -7869);
    }

    public static void releaseStatics(int param0) {
        field_a = null;
        field_g = null;
        field_b = null;
        field_c = null;
        field_d = null;
        field_f = null;
        if (param0 != -578) {
          MenuReturnHelpers.getReplyFlagLength(1);
        }
    }

    final static void requestLeaveLobby(byte param0) {
        if (param0 != -63) {
          field_g = (String) null;
          ArchiveIndex.setPendingMenuAction(17, 0);
          return;
        }
        ArchiveIndex.setPendingMenuAction(17, 0);
    }

    static {
        field_f = "All games";
        field_b = "to return to the normal view.";
        field_a = new String[]{"Waiting for text", "Warte auf Text", "En attente du texte", "Aguardando textos", "Op tekst wachten", "Esperando a texto"};
        field_e = 0;
        field_g = "Ask to join <%0>'s game";
    }
}
