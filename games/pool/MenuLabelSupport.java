/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MenuLabelSupport {
    static int field_b;
    static String muXEnteredOtherGame;

    final static void layoutChatPanelControls(boolean param0) {
        if (!param0) {
          MenuLabelSupport.layoutChatPanelControls(false);
        }
        MeshBoundsSupport.field_f.setBounds(0, 2147483647, 0, -(AccountStateQuery.field_p ? 40 + (TranslatedUiText.field_n + 2 + 2) : 0) + QuickChatMenuSupport.field_e.width, 18);
        CueAim.field_a.setBounds(0, 2147483647, -40 - TranslatedUiText.field_n + QuickChatMenuSupport.field_e.width - 2, TranslatedUiText.field_n + 42, 18);
        DebugTuningSlider.field_c.setScrollPaneBounds(TranslatedUiText.field_n, -20 + QuickChatMenuSupport.field_e.height, (byte) -112, 2, QuickChatMenuSupport.field_e.width, 0, 20);
    }

    final static void readRankingsResponse(byte obfuscationGuard) {
        String[][] dupTemp$0 = null;
        int[][] dupTemp$1 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        RankingsRequest var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        String[][] var6 = null;
        int[][] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        CipherPacketBuffer var13 = null;
        int var14 = 0;
        CipherPacketBuffer var15 = null;
        int var6_intLifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        var12 = Pool.field_O;
        try {
          var13 = PlayerContextMenu.field_e;
          var15 = var13;
          var2 = var15.readUnsignedByte(-113);
          if (obfuscationGuard < 93) {
            return;
          }
          var3 = (RankingsRequest) (AccountTextSupport.field_c.last((byte) 100));
          while (var3 != null) {
            if (var2 != var3.field_s) {
              var3 = (RankingsRequest) (AccountTextSupport.field_c.previous((byte) -5));
              continue;
            }
            break;
          }
          if (var3 == null) {
            ShotEvent.closeClientSocket(-82);
            return;
          }
          var4 = var15.readUnsignedByte(-79);
          if (var4 != 0) {
            var5 = var3.field_o;
            CollisionContact.field_e[0] = ResourceArchive.field_j;
            for (var6_int = 1; var6_int < var4; var6_int++) {
              CollisionContact.field_e[var6_int] = var13.readNullTerminatedString(-36);
            }
            RankingsBufferSupport.allocateRankingsArrays(var4, var5, false);
            for (var6_intLifetime1 = 0; var6_intLifetime1 < var4; var6_intLifetime1++) {
              QuickChatCategoryDefinition.readRankingRecordFields((byte) 125, var15);
              if (0 == var6_intLifetime1) {
                var3.field_t = BufferedSocket.field_f;
                var3.field_w = DialRenderer.field_n;
                var3.field_y = IntKeyLookup.field_a;
                var3.field_x = BirthDatePromptPanel.field_F;
                MusicCrossfadeStream.appendRankingRecord(DialRenderer.field_n, var6_intLifetime1, true, BufferedSocket.field_f, IntKeyLookup.field_a, BirthDatePromptPanel.field_F);
              } else {
                MusicCrossfadeStream.appendRankingRecord(DialRenderer.field_n, var6_intLifetime1, true, BufferedSocket.field_f, IntKeyLookup.field_a, BirthDatePromptPanel.field_F);
              }
            }
            NetworkArchiveRequest.sortRankingsViews(true, var5);
            dupTemp$0 = new String[2][var5];
            var3.field_n = dupTemp$0;
            var6 = dupTemp$0;
            dupTemp$1 = new int[2][var5 * 4];
            var3.field_q = dupTemp$1;
            var7 = dupTemp$1;
            var8 = MenuScreenBase.field_c;
            var9 = 0;
            var10 = 0;
            while (var8 > var9) {
              var11 = NetworkGameClient.field_H[var9];
              var6[0][var10] = CollisionContact.field_e[var11];
              var7[0][var10 * 4] = TickClock.field_g[var11];
              var7[0][1 + 4 * var10] = MenuScreen.field_y[var11];
              var7[0][2 + var10 * 4] = TextInputPainter.field_s[var11];
              var7[0][var10 * 4 + 3] = LoginTextSupport.field_d[var11];
              if (BallEvent.isLocalPlayerName((byte) 3, CollisionContact.field_e[var11]) &&
                0 == TextInputPainter.field_s[var11] + MenuScreen.field_y[var11] + LoginTextSupport.field_d[var11]) {
                var6[0][var10] = null;
                var10--;
              }
              var9++;
              var10++;
            }
            var9Lifetime1 = 0;
            var14 = 0;
            var10Lifetime1 = var14;
            while (var8 > var9Lifetime1) {
              var11Lifetime1 = NetworkGameClient.field_H[var5 + var9Lifetime1];
              var6[1][var14] = CollisionContact.field_e[var11Lifetime1];
              var7[1][4 * var14] = TickClock.field_g[var11Lifetime1];
              var7[1][4 * var14 + 1] = MenuScreen.field_y[var11Lifetime1];
              var7[1][2 + var14 * 4] = TextInputPainter.field_s[var11Lifetime1];
              var7[1][var14 * 4 + 3] = LoginTextSupport.field_d[var11Lifetime1];
              if (BallEvent.isLocalPlayerName((byte) 3, CollisionContact.field_e[var11Lifetime1]) &&
                LoginTextSupport.field_d[var11Lifetime1] + (MenuScreen.field_y[var11Lifetime1] + TextInputPainter.field_s[var11Lifetime1]) == 0) {
                var6[1][var14] = null;
                var14--;
              }
              var14++;
              var9Lifetime1++;
            }
          }
          var3.field_v = true;
          var3.unlink((byte) -117);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var1), "da.D(" + obfuscationGuard + ')');
        }
    }

    final static void initializeMenuLabels(int param0) {
        int var2 = 0;
        int var3 = Pool.field_O;
        int var2Lifetime1;
        int var2Lifetime2;
        if (null != TranslatedUiText.field_f) {
          return;
        }
        try {
          TranslatedUiText.field_f = new String[66];
          TranslatedUiText.field_f[8] = null;
          TranslatedUiText.field_f[2] = DebugSliderInputSupport.returntogame;
          TranslatedUiText.field_f[7] = ShotRecord.menu;
          TranslatedUiText.field_f[6] = TabbedPane.fullscreen;
          TranslatedUiText.field_f[13] = GlowParticle.returntolobby;
          TranslatedUiText.field_f[4] = WorldPointProjectionSupport.rankings;
          TranslatedUiText.field_f[11] = IntrusiveDeque.resign;
          TranslatedUiText.field_f[0] = ScoreboardNameRecord.hotseatmultiplayer;
          TranslatedUiText.field_f[9] = IterableNodeHashTable.endgame;
          TranslatedUiText.field_f[1] = ArchiveRequest.entermultiplayerlobby;
          TranslatedUiText.field_f[48] = LookupProtocolSupport.highscores;
          TranslatedUiText.field_f[5] = NodeHashTableIterator.instructions;
          TranslatedUiText.field_f[23] = NetworkGameClient.loginCreateaccount;
          TranslatedUiText.field_f[49] = ChatInputSupport.field_h ? NodeHashTableIterator.mouseYAxisInverted : PoolMatchController.mouseYAxisNormal;
          TranslatedUiText.field_f[38] = DisplayModeSupport.gameoptlabels[1];
          TranslatedUiText.field_f[59] = ReportAbuseDialog.textGameName;
          TranslatedUiText.field_f[19] = Js5ArchiveManager.quit;
          TranslatedUiText.field_f[21] = QuickChatHelpDialog.musicColon;
          TranslatedUiText.field_f[56] = AwtEventQueueSupport.themeNames[2];
          TranslatedUiText.field_f[53] = VertexProjectionSupport.menuTimeTrialWithoutGuides;
          TranslatedUiText.field_f[47] = IntrusiveDeque.menuSettings;
          TranslatedUiText.field_f[24] = DebugTuningSupport.discard;
          TranslatedUiText.field_f[60] = RenderingInitializationSupport.achievementNames[5];
          TranslatedUiText.field_f[54] = AwtEventQueueSupport.themeNames[0];
          TranslatedUiText.field_f[14] = LoginRequestSupport.hsModeName[0];
          TranslatedUiText.field_f[15] = LoginRequestSupport.hsModeName[1];
          TranslatedUiText.field_f[39] = CollisionContact.tutorial;
          TranslatedUiText.field_f[52] = ShotRecord.menuTimeTrialWithGuides;
          TranslatedUiText.field_f[55] = AwtEventQueueSupport.themeNames[1];
          TranslatedUiText.field_f[65] = UsernameAvailabilityValidator.startgame;
          TranslatedUiText.field_f[40] = TextInputWidget.tutorialOptionBasics;
          TranslatedUiText.field_f[41] = StrongCacheEntry.tutorialOptionEightBall;
          TranslatedUiText.field_f[43] = TableScene.timeTrial;
          TranslatedUiText.field_f[26] = StartupInterfaceSupport.next;
          TranslatedUiText.field_f[51] = VertexProjectionSupport.menuTimeTrialWithoutGuides;
          int var1_int = -62 / ((-24 - param0) / 60);
          TranslatedUiText.field_f[22] = PacketBuffer.achievements;
          TranslatedUiText.field_f[25] = AwtEventQueueSupport.previous;
          TranslatedUiText.field_f[42] = WidgetStyleLayer.tutorialOptionNineBall;
          TranslatedUiText.field_f[17] = Camera.ratingModeName[0];
          TranslatedUiText.field_f[20] = CachedArchiveSource.soundColon;
          TranslatedUiText.field_f[50] = ShotRecord.menuTimeTrialWithGuides;
          TranslatedUiText.field_f[18] = Camera.ratingModeName[1];
          TranslatedUiText.field_f[3] = DiskArchiveRequest.menuRestartGame;
          TranslatedUiText.field_f[12] = CachedArchiveSource.menuRematchGame;
          TranslatedUiText.field_f[16] = LoginRequestSupport.hsModeName[2];
          TranslatedUiText.field_f[37] = DisplayModeSupport.gameoptlabels[2];
          TranslatedUiText.field_f[57] = AwtEventQueueSupport.themeNames[3];
          TranslatedUiText.field_f[58] = AwtEventQueueSupport.themeNames[4];
          TranslatedUiText.field_f[62] = MouseWheelInput.menuOptionReturnToTutorial;
          TranslatedUiText.field_f[61] = FontPaletteSupport.menuOptionEndTutorial;
          for (var2 = 0; AwtEventQueueSupport.themeNames.length > var2; var2++) {
            TranslatedUiText.field_f[29 + var2] = AwtEventQueueSupport.themeNames[var2];
          }
          for (var2Lifetime1 = 0; AwtEventQueueSupport.themeNames.length > var2Lifetime1; var2Lifetime1++) {
            PoolUiText.field_c[2][var2Lifetime1] = AwtEventQueueSupport.themeNames[var2Lifetime1];
          }
          PoolUiText.field_c[2][AwtEventQueueSupport.themeNames.length] = BirthDateValidator.themeRandom;
          DraggableWidget.field_S = new String[22];
          BitmapTextLayout.field_q[1] = LobbyPlayer.rulesetNames;
          BitmapTextLayout.field_q[3] = LoginTextValue.guideNames;
          DraggableWidget.field_S[6] = ProgressDialog.tooltipExtraVisit;
          DraggableWidget.field_S[0] = BrowserUrlSupport.tutorialPrev;
          DraggableWidget.field_S[1] = NameEntryPopup.tutorialNext;
          DraggableWidget.field_S[4] = QuickChatNavigationSupport.tooltipBallInHand;
          DraggableWidget.field_S[3] = LoginMethod.tutorialShow;
          DraggableWidget.field_S[2] = ModelOriginSupport.tutorialHide;
          DraggableWidget.field_S[8] = AccountStateQuery.tooltipSnookered;
          DraggableWidget.field_S[5] = FixedAngleSupport.tooltipBreak;
          DraggableWidget.field_S[11] = PolarTableScene.ballsetUsa8Group1;
          DraggableWidget.field_S[2] = ModelOriginSupport.tutorialHide;
          DraggableWidget.field_S[9] = DualLinkNode.targetOpenTable;
          DraggableWidget.field_S[12] = CipherPacketBuffer.targetBlackBall;
          DraggableWidget.field_S[10] = EmailAvailabilityValidator.ballsetUsa8Group0;
          for (var2Lifetime2 = 1; 9 >= var2Lifetime2; var2Lifetime2++) {
            DraggableWidget.field_S[var2Lifetime2 + 12] = BallEvent.nineBallNumbers[var2Lifetime2];
          }
          ChatReplacementSupport.configureTextReplacements(Pocket.field_e, QuickChatDynamicCommand.definitionDefinitions, (byte) -96);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "da.A(" + param0 + ')');
        }
    }

    public static void releaseStatics(byte param0) {
        muXEnteredOtherGame = null;
        if (param0 != 108) {
          MenuLabelSupport.initializeMenuLabels(72);
        }
    }

    static {
        muXEnteredOtherGame = "<%0> has entered another game.";
    }
}
