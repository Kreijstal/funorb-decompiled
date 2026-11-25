/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ChatAreaLayoutSupport {
    static String field_a;
    static int field_c;
    static String field_b;

    final static void updateLoginUi(int param0, int param1) {
        if (param0 != 0) {
          return;
        }
        LobbyRoomInteractionSupport.pollLoginUiAction((byte) -75);
    }

    final static void layoutChatPanels(boolean param0) {
        IndexedSpriteState.a(127);
        ChatPanelLayoutSupport.layoutSharedChatPanel(BoundsRect.field_m[0].field_o, UniformNineSliceFactory.field_c, DateValidationSupport.field_a, 113, UnderageAccountInfoPanel.field_K, MusicVoiceMixer.field_l);
        if (!param0) {
          TiledNineSlicePainter var2 = (TiledNineSlicePainter) null;
          ChatAreaLayoutSupport.configureQuickChatRows(-28, (TiledNineSlicePainter) null, 8, (TiledNineSlicePainter) null, 98, -88);
        }
    }

    public static void clearStatics(int param0) {
        field_b = null;
        if (param0 != 0) {
          return;
        }
        field_a = null;
    }

    final static void configureQuickChatRows(int param0, TiledNineSlicePainter param1, int param2, TiledNineSlicePainter param3, int param4, int param5) {
        try {
          Wormhole.field_l = param3;
          GameMenuController.field_b = param5;
          ArchiveNetworkClient.field_i = param2;
          if (param0 != -4440) {
            field_b = (String) null;
          }
          InvalidMapConnectionException.field_a = param1;
          MapView.field_Lb = param4;
        } catch (RuntimeException runtimeException) {
          throw UrlLoader.wrapThrowable((Throwable) ((Object) runtimeException), "te.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ')');
        }
    }

    static {
        field_a = "Cancel draw";
        field_b = "Click to hide the Diplomacy window.";
    }
}
