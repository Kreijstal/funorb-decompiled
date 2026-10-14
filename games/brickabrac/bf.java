/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bf extends FocusableWidget {
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
            bf.a((String) null, 67, -0.11976710706949234f, true);
          }
          if (sj.field_b == null) {
            sj.field_b = new tb(ResourceArchive.field_f, AppletGameShell.field_b);
            ResourceArchive.field_f.a(param1 - 8287, sj.field_b);
          }
          sj.field_b.a(param2, param0, param3, (byte) 86);
          Rasterizer2D.clear();
          wc.a(true, -1);
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "bf.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    bf(String param0, WidgetListener param1, boolean param2) {
        this(param0, param1);
        try {
          this.active = param2 ? true : false;
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "bf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    private bf(String param0, WidgetListener param1) {
        this(param0, bj.field_T.field_q, param1);
        try {
          this.renderer = bj.field_T.field_o;
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

    private bf(String param0, WidgetRenderer param1, WidgetListener param2) {
        super(param0, param1, param2);
        try {
          this.renderer = bj.field_T.field_o;
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "bf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(boolean param0, boolean param1, int param2, String param3) {
        try {
          IntKeyIndex.a(-1);
          ResourceArchive.field_f.a(-127);
          if (param2 != -15947) {
            parisFarSprite = (RgbSprite) null;
          }
          DirectByteStorage.field_k = new hk(GameScreen.field_d, (String) null, NanoGameClock.field_l, param0, param1);
          rj.field_c = new bh(ResourceArchive.field_f, DirectByteStorage.field_k);
          ResourceArchive.field_f.a(-117, rj.field_c);
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "bf.C(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(byte param0) {
        LobbyPlayer var3 = null;
        int var2 = BrickABrac.field_J ? 1 : 0;
        o.currentLobbyGame = null;
        fh.pendingGameOptionsReceived = false;
        nl.pendingLobbyGame = null;
        if (ua.lobbyPlayers != null) {
          ua.lobbyPlayers.clear((byte) -57);
          ua.lobbyPlayers = null;
        }
        if (param0 < 29) {
          return;
        }
        try {
          eq.lobbyPlayerIndex = null;
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
          if (eq.lobbyPlayerIndex != null) {
            var3 = (LobbyPlayer) (eq.lobbyPlayerIndex.first((byte) 120));
            while (var3 != null) {
              var3.unlinkSecondary(3);
              var3 = (LobbyPlayer) (eq.lobbyPlayerIndex.next(false));
            }
            eq.lobbyPlayerIndex = null;
          }
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "bf.A(" + param0 + ')');
        }
    }

    static {
        viewFacePointTwoY = new int[8192];
    }
}
