/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ToggleButtonWidget extends FocusableWidget {
    static int[] viewFacePointTwoY;
    static RgbSprite field_L;
    static RgbSprite parisFarSprite;
    static NodeDeque friendEntries;

    public static void a(int param0) {
        if (param0 != 8192) {
          return;
        }
        friendEntries = null;
        parisFarSprite = null;
        viewFacePointTwoY = null;
        field_L = null;
    }

    final static void a(String param0, int param1, float param2, boolean param3) {
        try {
          if (param1 != 8192) {
            String var5 = (String) null;
            ToggleButtonWidget.a((String) null, 67, -0.11976710706949234f, true);
          }
          if (ChatLobbyUiHelpers.loadingProgressDialog == null) {
            ChatLobbyUiHelpers.loadingProgressDialog = new LoadingProgressDialog(ResourceArchive.field_f, AppletGameShell.field_b);
            ResourceArchive.field_f.pushLayer(param1 - 8287, ChatLobbyUiHelpers.loadingProgressDialog);
          }
          ChatLobbyUiHelpers.loadingProgressDialog.setProgress(param2, param0, param3, (byte) 86);
          Rasterizer2D.clear();
          wc.a(true, -1);
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "bf.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    ToggleButtonWidget(String text, WidgetListener listener, boolean active) {
        this(text, listener);
        try {
          this.active = active ? true : false;
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "bf.<init>(" + (text != null ? "{...}" : "null") + ',' + (listener != null ? "{...}" : "null") + ',' + active + ')');
        }
    }

    private ToggleButtonWidget(String param0, WidgetListener param1) {
        this(param0, PopupWidgetLayer.widgetTheme.defaultFocusableRenderer, param1);
        try {
          this.renderer = PopupWidgetLayer.widgetTheme.toggleButtonRenderer;
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "bf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void dispatchAction(int pointerY, int button, int obfuscationGuard, int pointerX) {
        if (obfuscationGuard <= -8) {
          this.active = !this.active ? true : false;
          super.dispatchAction(pointerY, button, -69, pointerX);
          return;
        }
        field_L = (RgbSprite) null;
        this.active = !this.active ? true : false;
        super.dispatchAction(pointerY, button, -69, pointerX);
    }

    private ToggleButtonWidget(String param0, WidgetRenderer param1, WidgetListener param2) {
        super(param0, param1, param2);
        try {
          this.renderer = PopupWidgetLayer.widgetTheme.toggleButtonRenderer;
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "bf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(boolean param0, boolean param1, int param2, String param3) {
        try {
          IntKeyIndex.a(-1);
          ResourceArchive.field_f.hideLayers(-127);
          if (param2 != -15947) {
            parisFarSprite = (RgbSprite) null;
          }
          DirectByteStorage.field_k = new LoginPanel(GameScreen.field_d, (String) null, NanoGameClock.field_l, param0, param1);
          rj.accountContentLayer = new AccountContentTransitionLayer(ResourceArchive.field_f, DirectByteStorage.field_k);
          ResourceArchive.field_f.pushLayer(-117, rj.accountContentLayer);
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "bf.C(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(byte param0) {
        LobbyPlayer var3 = null;
        int var2 = BrickABrac.field_J ? 1 : 0;
        ClientResourceHelpers.currentLobbyGame = null;
        fh.pendingGameOptionsReceived = false;
        IncomingPacketHelpers.pendingLobbyGame = null;
        if (GameplayRenderHelpers.lobbyPlayers != null) {
          GameplayRenderHelpers.lobbyPlayers.clear((byte) -57);
          GameplayRenderHelpers.lobbyPlayers = null;
        }
        if (param0 < 29) {
          return;
        }
        try {
          WhirlpoolHasher.lobbyPlayerIndex = null;
          if (rq.lobbyGames != null) {
            rq.lobbyGames.clear((byte) -91);
            rq.lobbyGames = null;
          }
          LevelResultSubmission.lobbyGameIndex = null;
          if (null != SocialListEntry.gamePlayers) {
            SocialListEntry.gamePlayers.clear((byte) -84);
            SocialListEntry.gamePlayers = null;
          }
          BrickABrac.gamePlayerIndex = null;
          if (WhirlpoolHasher.lobbyPlayerIndex != null) {
            var3 = (LobbyPlayer) (WhirlpoolHasher.lobbyPlayerIndex.first((byte) 120));
            while (var3 != null) {
              var3.unlinkSecondary(3);
              var3 = (LobbyPlayer) (WhirlpoolHasher.lobbyPlayerIndex.next(false));
            }
            WhirlpoolHasher.lobbyPlayerIndex = null;
          }
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "bf.A(" + param0 + ')');
        }
    }

    static {
        viewFacePointTwoY = new int[8192];
    }
}
