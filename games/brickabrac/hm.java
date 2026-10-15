/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hm {
    static String field_c;
    static String[] field_b;
    static String field_a;

    public static void a(int param0) {
        field_a = null;
        field_b = null;
        if (param0 != 8) {
          return;
        }
        field_c = null;
    }

    final static void initializeLobby(UiComponent gamePlayerContent, byte obfuscationGuard, byte[] settingBitWidths, UiComponent lobbyPlayerContent, int initialTick, int lobbyPlayerBuckets, UiComponent lobbyGameContent, int gamePlayerBuckets, int lobbyGameBuckets, int choiceCount) {
        int var11 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var10_int = 0;
        RuntimeException var10 = null;
        int var12 = 0;
        var12 = BrickABrac.field_J ? 1 : 0;
        try {
          wc.field_e = choiceCount;
          Widget.field_p = -1L;
          BufferedFile.gameSettingBitWidths = settingBitWidths;
          RankingsRequest.gameSettingCount = settingBitWidths.length;
          fh.pendingGameOptionsReceived = false;
          CalendarMatchmakingState.matchmakingChoiceMask = new byte[(wc.field_e + 7) / 8];
          ClientResourceHelpers.currentLobbyGame = null;
          IncomingPacketHelpers.pendingLobbyGame = null;
          var10_int = 0;
          for (var11 = 0; BufferedFile.gameSettingBitWidths.length > var11; var11++) {
            var10_int = var10_int + (BufferedFile.gameSettingBitWidths[var11] & 255);
          }
          var10_int = (7 + var10_int) / 8;
          PowerUpWarning.matchmakingSettingMask = new byte[var10_int];
          if (lobbyPlayerContent.children == null) {
            lobbyPlayerContent.children = new NodeDeque();
          }
          GameplayRenderHelpers.lobbyPlayers = lobbyPlayerContent.children;
          GameplayRenderHelpers.lobbyPlayers.clear((byte) -60);
          WhirlpoolHasher.lobbyPlayerIndex = new SecondaryHashTable(lobbyPlayerBuckets);
          ConditionalTextValue.field_h = -1;
          MenuSelection.previewGameId = 0;
          uf.pendingJoinRequestCount = 0;
          ArchiveIndex.field_s = -1;
          if (lobbyGameContent.children == null) {
            lobbyGameContent.children = new NodeDeque();
          }
          rq.lobbyGames = lobbyGameContent.children;
          rq.lobbyGames.clear((byte) -48);
          LevelResultSubmission.lobbyGameIndex = new SecondaryHashTable(lobbyGameBuckets);
          if (gamePlayerContent.children == null) {
            gamePlayerContent.children = new NodeDeque();
          }
          SocialListEntry.gamePlayers = gamePlayerContent.children;
          SocialListEntry.gamePlayers.clear((byte) -61);
          if (obfuscationGuard != 86) {
            return;
          }
          BrickABrac.gamePlayerIndex = new SecondaryHashTable(gamePlayerBuckets);
          ic.optionChangeDeadlineMillis = 0L;
          AlternateNumericLoginCredentials.field_o = initialTick;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          stackIn_19_0 = var10;
          stackIn_19_1 = new StringBuilder().append("hm.A(");
          if (gamePlayerContent == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(obfuscationGuard).append(',');
          if (settingBitWidths == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',');
          if (lobbyPlayerContent == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          stackIn_28_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(initialTick).append(',').append(lobbyPlayerBuckets).append(',');
          if (lobbyGameContent == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(gamePlayerBuckets).append(',').append(lobbyGameBuckets).append(',').append(choiceCount).append(')').toString());
        }
    }

    final static int measureFullscreenDialogText(boolean buttonText, String text, int obfuscationGuard) {
        RuntimeException failure = null;
        PcmSound unusedSound = null;
        int bodyWidth = 0;
        int buttonWidth = 0;
        RuntimeException failureContext = null;
        StringBuilder contextBuilder = null;
        String textSummary = null;
        RuntimeException caughtFailure = null;
        try {
          if (obfuscationGuard != 0) {
            unusedSound = (PcmSound) null;
            hm.playSoundAtVolume(-91, (PcmSound) null, 44);
          }
          if (buttonText) {
            buttonWidth = kp.fullscreenDialogButtonFont.measureText(text);
            return buttonWidth;
          }
          bodyWidth = StateIconLabel.fullscreenDialogBodyFont.measureText(text);
          return bodyWidth;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureContext = failure;
          contextBuilder = new StringBuilder().append("hm.C(").append(buttonText).append(',');
          if (text == null) {
            textSummary = "null";
          } else {
            textSummary = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) failureContext), ((StringBuilder) (Object) contextBuilder).append(textSummary).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final static SoundPlayback playSoundAtVolume(int obfuscationGuard, PcmSound sound, int volume) {
        RuntimeException var3 = null;
        SoundPlayback stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard != 0) {
            field_b = (String[]) null;
          }
          stackIn_3_0 = OpacityWidget.queueSoundPlayback((byte) -9, PcmStream.createAtRate(sound, 100, volume));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("hm.D(").append(obfuscationGuard).append(',');
          if (sound == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(volume).append(')').toString());
        }
    }

    static {
        field_c = "Withdraw invitation to <%0> to join this game";
        field_a = "Private";
    }
}
