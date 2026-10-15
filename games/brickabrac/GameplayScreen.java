/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GameplayScreen extends GameScreen {
    boolean networkedMatch;
    static int field_h;
    MultiplayerMatch match;
    static RgbSprite field_l;
    int rematchSetupPlayerMask;
    int resultLevel;
    private int lastReportedLevel;
    int loadedBoardSnapshots;
    static UiComponent friendLocationHeading;
    boolean resultWordMode;
    static int field_j;
    int localPlayerId;
    boolean suppressResultSubmission;
    private int viewedPlayerId;
    private boolean debugControlsEnabled;
    boolean snapshotsReady;
    int localPlayerMask;
    private int progressBaseLevel;

    private final void updateViewedPlayerSelection(int obfuscationGuard) {
        int previousViewedPlayer = 0;
        int nextViewedPlayer = 0;
        int freshKeyValue = 0;
        int freshKeyAlias = 0;
        int allLocalPlayersMasked = 0;
        int maskedEligibilityValue = 0;
        int spectatingAllowedValue = 0;
        boolean viewKeyHeld = false;
        int freshKey;
        PlayerBoard unusedBoard;
        int maskedEligibility;
        int canCycleView;
        if (!RadialSelectorRenderer.field_p) {
          freshKeyValue = (!RasterEffectHelpers.viewKeyWasHeld) ? 1 : 0;
        } else {
          freshKeyValue = 0;
        }
        freshKey = freshKeyValue;
        if (obfuscationGuard != -1) {
          unusedBoard = (PlayerBoard) null;
          this.readLocalControls((byte) -2, (PlayerBoard) null);
        }
        freshKeyAlias = freshKey;
        allLocalPlayersMasked = ((this.localPlayerMask & (this.match.playerMaskOne | this.match.playerMaskTwo | this.match.playerMaskThree)) != this.localPlayerMask) ? 0 : 1;
        boolean unusedEligibilityRemainder = true;
        maskedEligibility = freshKeyAlias & allLocalPlayersMasked;
        maskedEligibilityValue = maskedEligibility;
        if (2 < this.match.playerCount && (this.localPlayerId < 0 ||
          !(this.match.playerBoards[this.localPlayerId].maskedTicks < 50))) {
          spectatingAllowedValue = 1;
          unusedEligibilityRemainder = false;
        }
        else {
          spectatingAllowedValue = 0;
        }
        boolean unusedDirectionRemainder = true;
        canCycleView = maskedEligibilityValue & spectatingAllowedValue;
        if (canCycleView != 0) {
          if (!IntArrayRequest.heldKeys[HorizontalFrameHelpers.field_b] &&
            !IntArrayRequest.heldKeys[VolcanicBackground.field_u]) {
            if (!(!IntArrayRequest.heldKeys[EmailAvailabilityRequest.field_f])) {
              previousViewedPlayer = this.viewedPlayerId - 1;
              this.viewedPlayerId = this.viewedPlayerId - 1;
              this.viewedPlayerId = (this.match.playerCount + previousViewedPlayer) % this.match.playerCount;
            }
            unusedDirectionRemainder = false;
          }
          else {
            nextViewedPlayer = this.viewedPlayerId + 1;
            this.viewedPlayerId = this.viewedPlayerId + 1;
            this.viewedPlayerId = nextViewedPlayer % this.match.playerCount;
          }
        }
        viewKeyHeld = (IntArrayRequest.heldKeys[HorizontalFrameHelpers.field_b]) || (IntArrayRequest.heldKeys[EmailAvailabilityRequest.field_f]) || (IntArrayRequest.heldKeys[VolcanicBackground.field_u]);
        RasterEffectHelpers.viewKeyWasHeld = viewKeyHeld;
    }

    private final boolean recordAchievement(int achievementId, int pendingBit) {
        if (DirectByteStorage.isBitSet(SecondaryHashTable.earnedAchievementMask, achievementId, (byte) -75)) {
          return true;
        }
        int[] var5 = SecondaryHashTable.earnedAchievementMask;
        int[] var3 = var5;
        int var4 = achievementId;
        var5[var4 >> 5] = LevelSelectScreen.d(var5[var4 >> 5], 1 << IntrusiveHashIterator.a(31, var4));
        int[] var6 = SpriteInputHelpers.pendingAchievementMask;
        var3 = var6;
        var4 = achievementId;
        var6[var4 >> 5] = LevelSelectScreen.d(var6[var4 >> 5], pendingBit << IntrusiveHashIterator.a(var4, 31));
        kp.achievementNotifications.addLast(new IntNode(achievementId), (byte) 3);
        return false;
    }

    final void drawScreen(byte obfuscationGuard) {
        Rasterizer2D.resetClip();
        if (!this.snapshotsReady) {
          return;
        }
        if (obfuscationGuard > -14) {
          this.setStartingLevel((byte) -47, -81);
        }
        this.drawMatchFrame(41);
    }

    final void readMaskedPlayerResult(BitPacketBuffer packet, boolean maskThree, int obfuscationGuard) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          var4_int = packet.readUnsignedByte(255);
          this.match.playerBoards[var4_int].resultWord = packet.readMedium(48);
          var5 = -101 % ((obfuscationGuard - 26) / 60);
          if (maskThree) {
            this.match.playerBoards[var4_int].resultCode = packet.readUnsignedByte(255);
            this.match.playerMaskThree = this.match.playerMaskThree | 1 << var4_int;
          } else {
            this.match.playerMaskTwo = this.match.playerMaskTwo | 1 << var4_int;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("qj.A(");
          if (packet == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(maskThree).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final void readPositionCorrection(byte obfuscationGuard, BitPacketBuffer packet) {
        PlayerBoard dupTemp$0 = null;
        try {
          dupTemp$0 = this.match.playerBoards[this.localPlayerId];
          dupTemp$0.receivedInputTick = dupTemp$0.receivedInputTick + 5;
          this.match.playerBoards[this.localPlayerId].positionWord = packet.readUnsignedShort(65280);
          if (obfuscationGuard != 33) {
            PlayerBoard var4 = (PlayerBoard) null;
            this.readLocalControls((byte) 15, (PlayerBoard) null);
          }
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "qj.M(" + obfuscationGuard + ',' + (packet != null ? "{...}" : "null") + ')');
        }
    }

    private final void queueScoreAchievement(int submissionByte, int obfuscationGuard, int achievementId) {
        int var4 = 0;
        int var5 = 0;
        if (this.recordAchievement(achievementId, 1)) {
          return;
        }
        if (!this.suppressResultSubmission) {
          var4 = this.match.playerBoards[0].score;
          WidgetTextLayout.resultCounterTwo = WidgetTextLayout.resultCounterTwo - (var4 + this.progressBaseLevel);
          var5 = this.match.playerBoards[0].levelIndex;
          OptionsScreen.resultCounterOne = OptionsScreen.resultCounterOne + var5;
          AccountMessageDialog.queuedAchievementSubmissions.addLast(new AchievementSubmission(achievementId, submissionByte, OptionsScreen.resultCounterOne, WidgetTextLayout.resultCounterTwo, DelegatingCanvas.field_c, QuickChatMenu.field_Wb), (byte) 3);
          OptionsScreen.resultCounterOne = OptionsScreen.resultCounterOne + (var4 + this.progressBaseLevel);
          WidgetTextLayout.resultCounterTwo = WidgetTextLayout.resultCounterTwo - var5;
        }
        if (obfuscationGuard != 67) {
          this.lastReportedLevel = 125;
        }
    }

    final void advanceScreen(boolean updateFlag, boolean inputEnabled, int obfuscationGuard) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int var8 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_20_1 = 0;
        int stackIn_116_0 = 0;
        int stackIn_120_0 = 0;
        String stackIn_210_0 = null;
        int stackIn_230_1 = 0;
        int stackIn_230_2 = 0;
        Object stackIn_231_0;
        boolean stackIn_231_3;
        int var4;
        int var5;
        int var6;
        NodeDeque var7;
        long var9_long;
        int var9_int;
        Ball var9;
        PlayerBoard var11;
        PlayerBoard var12;
        Ball var13;
        int var14;
        PlayerBoard var15;
        PlayerBoard var16;
        PlayerBoard var17;
        PlayerBoard var18;
        NodeDeque var19;
        PlayerBoard var20;
        PlayerBoard var21;
        int var4Lifetime1;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime3;
        int var5Lifetime4;
        PlayerBoard var17Lifetime1;
        PlayerBoard var17Lifetime2;
        var14 = BrickABrac.field_J ? 1 : 0;
        if (!this.snapshotsReady) {
          return;
        }
        if (null != TabbedPane.currentBackground) {
          TabbedPane.currentBackground.ensureSprites(1);
          if (!TabbedPane.currentBackground.musicReady) {
            TabbedPane.currentBackground.pollMusicPreparation(59);
          }
          if (MenuScreen.field_i > 0) {
            fieldTemp$0 = MenuScreen.field_i - 1;
            MenuScreen.field_i = MenuScreen.field_i - 1;
            if (fieldTemp$0 == 0) {
              HorizontalFrameHelpers.field_c = null;
              ArchiveFetchClient.field_k = null;
            }
          }
        } else {
          if (MenuScreen.field_i > 0) {
            fieldTemp$1 = MenuScreen.field_i - 1;
            MenuScreen.field_i = MenuScreen.field_i - 1;
            if (fieldTemp$1 == 0) {
              HorizontalFrameHelpers.field_c = null;
              ArchiveFetchClient.field_k = null;
            }
          }
        }
        stackIn_15_0 = (this.match.playerBoards[this.viewedPlayerId].positionOrderTicks == -1) ? 0 : 1;
        var4 = stackIn_15_0;
        stackIn_19_0 = var4;
        if (!this.networkedMatch &&
          this.match.playerCount == 2 &&
          -1 != this.match.playerBoards[-this.viewedPlayerId + 1].positionOrderTicks) {
          stackIn_20_1 = 1;
        } else {
          stackIn_20_1 = 0;
        }
        var4Lifetime1 = stackIn_19_0 | stackIn_20_1;
        if (1 == this.match.playerCount &&
          this.match.playerBoards[0].boardState == 5) {
          IterableIntrusiveHashTable.a(25459, true, GrowableIntList.completionMusicTrack, 1, 1, true);
        } else {
          if (!this.match.resultsReady) {
            if (var4Lifetime1 != 0) {
              IterableIntrusiveHashTable.a(25459, true, MessageScreen.panicMusicTrack, 1, 1, true);
            } else {
              if (TabbedPane.currentBackground != null &&
                TabbedPane.currentBackground.musicReady) {
                BytePayloadRequest.a(1, true, TabbedPane.currentBackground.c(-109), false, 1, TabbedPane.currentBackground.musicData, true);
              } else {
                IterableIntrusiveHashTable.a(25459, true, LoginCredentialKind.titleMusicTrack, 1, 1, true);
              }
            }
          } else {
            IterableIntrusiveHashTable.a(25459, true, RichTextLayout.podiumMusicTrack, 1, 1, true);
          }
        }
        if (this.match.resultsReady &&
          this.match.playerCount > 1) {
          fieldTemp$2 = WidgetPaintStyle.field_j + 1;
          WidgetPaintStyle.field_j = WidgetPaintStyle.field_j + 1;
          if (fieldTemp$2 == 300) {
            if (ConditionalTextValue.field_a) {
              fieldTemp$3 = TextLineLayout.field_f + 1;
              TextLineLayout.field_f = TextLineLayout.field_f + 1;
              System.out.println("Concluded " + fieldTemp$3 + " games (" + cf.checksumMismatchCount + " errors)");
              if ((1 << this.localPlayerId & this.match.rematchOfferPlayerMask) == 0) {
                this.requestRematchAction(87);
              }
            }
            ResourcePreparationEntry.a((byte) -97);
            if (!this.networkedMatch) {
              ScreenNavigationHelpers.requestScreen(false, 62, 20);
              NewAchievementsScreen.discardGameplayOnTransition = true;
            } else {
              if (KeyboardInput.hasNonnegativeResult) {
                if (null == hd.pendingScreen ||
                  hd.pendingScreen.screenId != -2) {
                  ScreenNavigationHelpers.requestScreen(false, 101, 19);
                }
              } else {
                ArchiveNetworkRequest.f((byte) 122);
              }
            }
          }
        }
        if (obfuscationGuard >= -52) {
          this.match = (MultiplayerMatch) null;
        }
        var5 = ChocolateBackground.field_w.nextBoundedInt(-37880252, 10);
        var6 = ChocolateBackground.field_w.nextBoundedInt(-37880252, 3);
        if (var5 == 0) {
          DelegatingCanvas.field_c = DelegatingCanvas.field_c + 1;
          OptionsScreen.resultCounterOne = OptionsScreen.resultCounterOne + QuickChatMenu.field_Wb;
        }
        if (var5 == 1) {
          DelegatingCanvas.field_c = DelegatingCanvas.field_c - 2;
          OptionsScreen.resultCounterOne = OptionsScreen.resultCounterOne - 2 * QuickChatMenu.field_Wb;
        }
        if (var5 == 2) {
          OptionsScreen.resultCounterOne = OptionsScreen.resultCounterOne + 2 * DelegatingCanvas.field_c;
          QuickChatMenu.field_Wb = QuickChatMenu.field_Wb + 2;
        }
        if (var5 == 3) {
          QuickChatMenu.field_Wb = QuickChatMenu.field_Wb - 1;
          OptionsScreen.resultCounterOne = OptionsScreen.resultCounterOne - DelegatingCanvas.field_c;
        }
        if (var5 == 4) {
          DelegatingCanvas.field_c = DelegatingCanvas.field_c + 1;
          WidgetTextLayout.resultCounterTwo = WidgetTextLayout.resultCounterTwo + QuickChatMenu.field_Wb;
        }
        if (var5 == 5) {
          WidgetTextLayout.resultCounterTwo = WidgetTextLayout.resultCounterTwo - QuickChatMenu.field_Wb * 2;
          DelegatingCanvas.field_c = DelegatingCanvas.field_c - 2;
        }
        if (6 == var5) {
          WidgetTextLayout.resultCounterTwo = WidgetTextLayout.resultCounterTwo + QuickChatMenu.field_Wb;
          DelegatingCanvas.field_c = DelegatingCanvas.field_c + 1;
        }
        if (var5 == 7) {
          WidgetTextLayout.resultCounterTwo = WidgetTextLayout.resultCounterTwo - DelegatingCanvas.field_c * 2;
          QuickChatMenu.field_Wb = QuickChatMenu.field_Wb - 2;
        }
        if (var5 == 8) {
          OptionsScreen.resultCounterOne = OptionsScreen.resultCounterOne + var6;
          OptionsScreen.resultCounterOne = OptionsScreen.resultCounterOne - var6;
        }
        if (var5 == 9) {
          WidgetTextLayout.resultCounterTwo = WidgetTextLayout.resultCounterTwo + var6;
          OptionsScreen.resultCounterOne = OptionsScreen.resultCounterOne - var6;
        }
        var5Lifetime1 = ChocolateBackground.field_w.nextBoundedInt(-37880252, 5);
        if (var5Lifetime1 == 0) {
          DisplayModeInfo.field_e = DisplayModeInfo.field_e ^ OutgoingPacketHelpers.field_g + BrowserResizeNotificationHelpers.field_a << 16;
        }
        if (var5Lifetime1 == 1) {
          FullscreenFailureDialog.field_kb = FullscreenFailureDialog.field_kb - OutgoingPacketHelpers.field_g;
          BrowserResizeNotificationHelpers.field_a = BrowserResizeNotificationHelpers.field_a - 1;
        }
        if (var5Lifetime1 == 2) {
          FullscreenFailureDialog.field_kb = FullscreenFailureDialog.field_kb + OutgoingPacketHelpers.field_g;
          BrowserResizeNotificationHelpers.field_a = BrowserResizeNotificationHelpers.field_a + 1;
        }
        if (var5Lifetime1 == 3) {
          FullscreenFailureDialog.field_kb = FullscreenFailureDialog.field_kb - BrowserResizeNotificationHelpers.field_a;
          OutgoingPacketHelpers.field_g = OutgoingPacketHelpers.field_g - 1;
        }
        if (var5Lifetime1 == 4) {
          FullscreenFailureDialog.field_kb = FullscreenFailureDialog.field_kb + BrowserResizeNotificationHelpers.field_a;
          OutgoingPacketHelpers.field_g = OutgoingPacketHelpers.field_g + 1;
        }
        if (this.networkedMatch) {
          for (var5Lifetime2 = 0; this.match.playerCount > var5Lifetime2; var5Lifetime2++) {
            if ((this.localPlayerMask & 1 << var5Lifetime2) != 0) {
              var15 = this.match.playerBoards[var5Lifetime2];
              var17 = var15;
              var17Lifetime2 = var15;
              var16 = var15;
              var16.outgoingInputMasks[var15.simulationTick % 5] = 0;
            }
          }
        }
        if (inputEnabled) {
          this.updateViewedPlayerSelection(-1);
        }
        for (var5Lifetime3 = 0; var5Lifetime3 < this.match.playerCount; var5Lifetime3++) {
          if ((this.localPlayerMask & 1 << var5Lifetime3) != 0) {
            var17Lifetime1 = this.match.playerBoards[var5Lifetime3];
            if (inputEnabled) {
              this.readLocalControls((byte) 73, var17Lifetime1);
            } else {
              var17Lifetime1.controlMask = 0;
            }
            if (this.networkedMatch) {
              var17Lifetime1.outgoingInputMasks[var17Lifetime1.simulationTick % 5] = var17Lifetime1.controlMask;
            }
          }
        }
        var5Lifetime4 = 0;
        var19 = new NodeDeque();
        var7 = new NodeDeque();
        if (!TextFieldRenderer.field_A) {
          stackIn_120_0 = (!this.advanceMatch(var7, true, var19)) ? 0 : 1;
          var5Lifetime4 = stackIn_120_0;
        } else {
          if (MenuScreen.field_i == 0) {
            DelegatingCanvas.a((byte) 32);
            var18 = this.match.playerBoards[0];
            if (2 == var18.boardState) {
              WidgetLayer.a(var18.controlMask, 0, (byte) -85);
            }
            if (var18.boardState == 0 ||
              !MusicVoice.a((byte) 62)) {
              stackIn_116_0 = (!this.advanceMatch(var7, true, var19)) ? 0 : 1;
              var5Lifetime4 = stackIn_116_0;
            }
          }
        }
        GameRenderAudioHelpers.playGameplayAudioEvents(96, 96, false, -30791, var19);
        GameRenderAudioHelpers.playGameplayAudioEvents(48, 48, true, -30791, var7);
        if (this.match.playerCount == 1) {
          var20 = this.match.playerBoards[0];
          if (var20.levelIndex > this.lastReportedLevel) {
            var9_long = MonotonicTime.nowMillis(false);
            this.sendProgressUpdate(NameEntryPopup.field_Yb, this.lastReportedLevel, var9_long - UsernameAvailabilityValidator.field_l, true, 1000);
            UsernameAvailabilityValidator.field_l = var9_long;
            this.lastReportedLevel = var20.levelIndex;
            this.queueLevelResult(this.match.configuration.pack, var20.score, (byte) -125, var20.levelIndex);
            if (this.lastReportedLevel == 1 &&
              0 == this.match.configuration.pack.packId) {
              var11 = var20;
              var20.field_Q = 0;
              var11.field_m = 0;
              var20.field_u = 0;
              var12 = var20;
              var12.field_N = 0;
              var13 = (Ball) (var20.activeBalls.first(-66));
              while (var13 != null) {
                var13.brickBounceCount = 0;
                var13 = (Ball) (var20.activeBalls.next((byte) 116));
              }
            }
            if ((this.lastReportedLevel > 1 ||
              this.match.configuration.pack.packId == 1) &&
              (LevelPackCard.hasFeatureBit(0, -119) &&
              TabbedPane.currentBackground instanceof HalloweenBackground)) {
              this.queueProgressAchievement(false, 239, 16);
            }
            if (this.lastReportedLevel < this.match.configuration.getPeriod(95)) {
              ScreenshotViewer.field_r = HotspotTextWidget.a(2, this.match.configuration.getLevelTitle(this.lastReportedLevel, (byte) -122), -1);
            }
          }
          if (var20.field_tb) {
            var9_int = (33423360 - 2 * (var20.paddle.x256 + var20.paddle.width256 / 2 << 8)) / 510;
            nk.field_c.bindRasterTarget();
            TabbedPane.currentBackground.drawFullBackground(true, var9_int, 0, 0, 0);
            BallPulseEffect.framebuffer.bindRaster((byte) 78);
            ArchiveFetchClient.field_k = TabbedPane.currentBackground.c((byte) -116);
            HorizontalFrameHelpers.field_c = TabbedPane.currentBackground.b(-102);
            TabbedPane.currentBackground = GamePresentationHelpers.selectBackground(var20.levelState.value, (byte) 19);
            MenuScreen.field_i = 32;
            var20.field_tb = false;
            IntArrayRequest.lastBackgroundId = var20.levelState.value;
          }
          if (!(var20.levelIndex <= 0) ||
            this.match.configuration.pack.packId != 0) {
            if (HalloweenBackground.field_r[0] <= var20.field_m) {
              this.queueMappedBitAchievement(0, -64, 255);
            }
            if (var20.field_m >= HalloweenBackground.field_r[1]) {
              this.queueMappedBitAchievement(1, 119, 254);
            }
            if (var20.field_m >= HalloweenBackground.field_r[2]) {
              this.queueMappedBitAchievement(2, -42, 253);
            }
            if (HalloweenBackground.field_r[39] <= var20.field_m) {
              this.queueMappedBitAchievement(39, 109, 216);
            }
            if (var20.levelIndex - this.progressBaseLevel >= HalloweenBackground.field_r[3]) {
              this.queueProgressAchievement(false, 252, 3);
            }
            if (var20.levelIndex - this.progressBaseLevel >= HalloweenBackground.field_r[4]) {
              this.queueProgressAchievement(false, 251, 4);
            }
            if (var20.levelIndex >= HalloweenBackground.field_r[5] - 1) {
              this.queueScoreAchievement(250, 67, 5);
            }
            if (-1 + HalloweenBackground.field_r[6] <= var20.levelIndex &&
              var20.boardState == 5) {
              this.queueScoreAchievement(249, 67, 6);
            }
            if (HalloweenBackground.field_r[7] <= var20.score) {
              this.queueOffsetAchievement((byte) 68, 7, 248);
            }
            if (HalloweenBackground.field_r[8] <= var20.score) {
              this.queueOffsetAchievement((byte) 97, 8, 247);
            }
            if (var20.score >= HalloweenBackground.field_r[40]) {
              this.queueOffsetAchievement((byte) 39, 40, 215);
            }
            var9 = (Ball) (var20.activeBalls.first(-119));
            while (var9 != null) {
              if (HalloweenBackground.field_r[9] <= var9.brickBounceCount) {
                this.queueMappedBitAchievement(9, 106, 246);
              }
              if (var9.brickBounceCount < HalloweenBackground.field_r[10]) {
                var9 = (Ball) (var20.activeBalls.next((byte) 116));
                continue;
              }
              this.queueMappedBitAchievement(10, -52, 245);
              break;
            }
            if (HalloweenBackground.field_r[22] <= var20.field_l) {
              this.queueMappedBitAchievement(22, -65, 233);
            }
            if (var20.field_hb >= HalloweenBackground.field_r[29]) {
              this.queueMappedBitAchievement(29, 114, 226);
            }
            if (HalloweenBackground.field_r[30] <= var20.field_u) {
              this.queueMappedBitAchievement(30, -118, 225);
            }
            if (HalloweenBackground.field_r[31] <= var20.field_u) {
              this.queueMappedBitAchievement(31, -33, 224);
            }
            if (var20.field_N >= HalloweenBackground.field_r[32]) {
              this.queueMappedBitAchievement(32, -94, 223);
            }
            if (var20.field_N >= HalloweenBackground.field_r[33]) {
              this.queueMappedBitAchievement(33, 112, 222);
            }
            if (var20.field_t >= HalloweenBackground.field_r[19]) {
              this.queueMappedBitAchievement(19, 85, 236);
            }
            if (var20.field_t >= HalloweenBackground.field_r[20]) {
              this.queueMappedBitAchievement(20, -128, 235);
            }
            if (!(var20.field_t < HalloweenBackground.field_r[21])) {
              this.queueMappedBitAchievement(21, 109, 234);
            }
          }
          if (GameClock.field_b != var20.score) {
            GameClock.field_b = var20.score;
            PacketReceiveHelpers.field_d = Integer.toString(GameClock.field_b);
          }
          if (DelayedPacket.field_m != 1 + pp.a(var20, (byte) 59, this.match)) {
            DelayedPacket.field_m = pp.a(var20, (byte) -100, this.match) + 1;
            if (DelayedPacket.field_m < 10) {
              stackIn_210_0 = "0" + DelayedPacket.field_m;
            } else {
              stackIn_210_0 = Integer.toString(DelayedPacket.field_m);
            }
            SecondaryNodeQueue.field_e = stackIn_210_0;
          }
        }
        if (this.networkedMatch &&
          this.localPlayerMask != 0) {
          for (var8 = 0; var8 < this.match.playerCount; var8++) {
            if ((this.localPlayerMask & 1 << var8) != 0 &&
              ((this.match.playerMaskOne | (this.match.playerMaskThree | this.match.playerMaskTwo)) & 1 << var8) == 0) {
              var21 = this.match.playerBoards[var8];
              if (var5Lifetime4 != 0 &&
                0 == var21.simulationTick % 5) {
                stackIn_230_1 = 120;
                stackIn_230_2 = var8;
                if (var21.simulationTick % 5 != 0) {
                  stackIn_231_0 = this;
                  stackIn_231_3 = false;
                } else {
                  stackIn_231_0 = this;
                  stackIn_231_3 = true;
                }
                this.sendInputBatch((byte) stackIn_230_1, stackIn_230_2, stackIn_231_3);
              }
            }
          }
          return;
        }
        return;
    }

    final boolean isSpectator(int obfuscationGuard) {
        if (obfuscationGuard < 93) {
          this.showPostMatchScreen(false, (byte) -87);
        }
        return this.localPlayerId == -2 ? true : false;
    }

    private final void queueScoreTableSubmission(int obfuscationGuard) {
        if (obfuscationGuard != 0) {
          this.snapshotsReady = true;
        }
        if (this.suppressResultSubmission) {
          return;
        }
        if (null == VerticalScrollbar.field_Ub &&
          !(0 >= this.match.playerBoards[0].score)) {
          VerticalScrollbar.field_Ub = new TableRowSubmission(this.match.configuration.pack.completionWord, 65535 ^ this.match.configuration.pack.completionWord, OptionsScreen.resultCounterOne, WidgetTextLayout.resultCounterTwo, DelegatingCanvas.field_c, QuickChatMenu.field_Wb, new int[]{this.match.playerBoards[0].score, this.progressBaseLevel << 16 | this.resultLevel});
          if (!QuickChatMenu.h(-26090)) {
            CheckboxWidgetRenderer.submitTableRow(3, (byte) 25, VerticalScrollbar.field_Ub);
          }
        }
    }

    final void finishOfflineMatch(byte obfuscationGuard, boolean usePointer) {
        boolean stackIn_8_0 = false;
        if (!this.networkedMatch) {
          if (1 == this.match.playerCount &&
            !this.suppressResultSubmission) {
            this.setResultLevel(pp.a(this.match.playerBoards[0], (byte) 115, this.match), false);
            this.queueScoreTableSubmission(0);
            this.sendProgressUpdate(NameEntryPopup.field_Yb, this.resultLevel, -UsernameAvailabilityValidator.field_l + MonotonicTime.nowMillis(false), false, 1000);
            jj.field_d = jj.field_d | BoardPresentationHelpers.combineSequenceLevelAttributes(this.progressBaseLevel, this.match.configuration, -1 + this.resultLevel, true);
            stackIn_8_0 = (hh.unlockedLevelCounts[0] == 0);
            WidgetPaintStyle.field_a = stackIn_8_0;
          }
          if (this.match.playerCount == 1 &&
            this.match.playerBoards[0].boardState == 8) {
            ScreenNavigationHelpers.requestScreen(usePointer, 107, 18);
            IterableIntrusiveHashTable.a(25459, true, LoginCredentialKind.titleMusicTrack, 1, 1, true);
          } else {
            this.showPostMatchScreen(usePointer, (byte) 69);
          }
        }
        if (obfuscationGuard != 40) {
          return;
        }
        IntArrayRequest.lastBackgroundId = IntrusiveHashTable.field_k.sceneId;
    }

    final void showPostMatchScreen(boolean usePointer, byte obfuscationGuard) {
        int var4;
        var4 = BrickABrac.field_J ? 1 : 0;
        rj.a((byte) 80, WeightedLruCache.primaryActivityLoop);
        rj.a((byte) 80, LoginMethodPreference.alternateActivityLoop);
        if (!(this.match.playerCount <= 1) ||
          9 != this.match.playerBoards[0].boardState) {
          IterableIntrusiveHashTable.a(25459, true, LoginCredentialKind.titleMusicTrack, 1, 1, true);
        }
        if (this.networkedMatch) {
          return;
        }
        if (obfuscationGuard != 69) {
          return;
        }
        if (QuickChatMenu.h(-26090)) {
          if (!WidgetGroup.a(SpriteInputHelpers.pendingAchievementMask, -1) &&
            VerticalScrollbar.field_Ub == null) {
            ScreenNavigationHelpers.requestScreen(usePointer, 121, 0);
          } else {
            ScreenNavigationHelpers.requestScreen(usePointer, 68, 10);
          }
        } else {
          if (!WidgetGroup.a(SpriteInputHelpers.pendingAchievementMask, -1)) {
            if (VerticalScrollbar.field_Ub != null) {
              ScreenNavigationHelpers.requestScreen(usePointer, 68, 5);
            } else {
              ScreenNavigationHelpers.requestScreen(usePointer, 100, 0);
            }
          } else {
            ScreenNavigationHelpers.requestScreen(usePointer, 60, 9);
          }
        }
    }

    final void readInputBatch(byte obfuscationGuard, BitPacketBuffer packet, boolean hasChecksum) {
        int maskIndex = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int playerId = 0;
        RuntimeException var4 = null;
        PlayerInputBatch batch = null;
        PlayerBoard board = null;
        int clientBranchFlag = 0;
        clientBranchFlag = BrickABrac.field_J ? 1 : 0;
        try {
          playerId = packet.readUnsignedByte(255);
          if (this.match.playerCount <= playerId) {
            AlignedIconLabel.a("K1: (" + playerId + "/" + packet.position + ") " + WhirlpoolHasher.c((byte) -110), (Throwable) null, obfuscationGuard + 125);
            hn.closeGameTransport((byte) 89);
            return;
          }
          batch = new PlayerInputBatch();
          batch.positionWord = packet.readUnsignedShort(65280);
          packet.beginBitRead(-79);
          for (maskIndex = 0; maskIndex < 5; maskIndex++) {
            batch.controlMasks[maskIndex] = packet.readBits(3, (byte) 117);
          }
          if (obfuscationGuard != -15) {
            this.queueMappedBitAchievement(-25, 35, 50);
          }
          packet.finishBitRead((byte) 100);
          if (hasChecksum) {
            batch.maskedChecksum = packet.readInt(255);
            batch.hasChecksum = true;
          }
          board = this.match.playerBoards[playerId];
          board.receivedInputTick = board.receivedInputTick + 5;
          board.bufferedInputTicks = board.bufferedInputTicks + 5;
          board.incomingInputBatches.addLast(batch, (byte) 3);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_15_0 = var4;
          stackIn_15_1 = new StringBuilder().append("qj.B(").append(obfuscationGuard).append(',');
          if (packet == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(hasChecksum).append(')').toString());
        }
    }

    final void readMaskOnePlayerResult(int obfuscationGuard, BitPacketBuffer packet) {
        int var3_int = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          var3_int = packet.readUnsignedByte(obfuscationGuard ^ 18615);
          this.match.playerBoards[var3_int].resultWord = packet.readMedium(48);
          this.match.playerMaskOne = this.match.playerMaskOne | 1 << var3_int;
          if (obfuscationGuard != 18504) {
            friendLocationHeading = (UiComponent) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_5_0 = var3;
          stackIn_5_1 = new StringBuilder().append("qj.CA(").append(obfuscationGuard).append(',');
          if (packet == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    private final void sendInputBatch(byte obfuscationGuard, int playerId, boolean hasChecksum) {
        int var6 = 0;
        int var7 = BrickABrac.field_J ? 1 : 0;
        int var4 = 17 % ((29 - obfuscationGuard) / 57);
        TextFieldValidator.outgoingPackets.writeCipheredOpcode(-13413, !hasChecksum ? 68 : 69);
        TextFieldValidator.outgoingPackets.beginBitWrite(62);
        PlayerBoard var5 = this.match.playerBoards[playerId];
        for (var6 = 0; var6 < 5; var6++) {
          TextFieldValidator.outgoingPackets.writeBits(3, -17566, var5.outgoingInputMasks[var6]);
        }
        TextFieldValidator.outgoingPackets.finishBitWrite(-105);
        if (hasChecksum) {
          TextFieldValidator.outgoingPackets.writeInt(var5.computeBoardChecksum(true, (StringBuilder) null) ^ var5.nextRandomInt(122), (byte) -79);
        }
    }

    final boolean handleKey(char character, int obfuscationGuard, int keyCode) {
        int fieldTemp$0 = 0;
        boolean stackIn_152_0 = false;
        int var4;
        int var5;
        Ball var5_ref_vn;
        int var6;
        PlayerBoard var7;
        PlayerBoard var8;
        int var4Lifetime1;
        int var4Lifetime2;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime2Lifetime1;
        Ball var5_ref_vnLifetime1;
        var6 = BrickABrac.field_J ? 1 : 0;
        var4 = ChocolateBackground.field_w.nextBoundedInt(-37880252, 10);
        var5 = ChocolateBackground.field_w.nextBoundedInt(-37880252, 5);
        if (var4 == 0) {
          OptionsScreen.resultCounterOne = OptionsScreen.resultCounterOne + QuickChatMenu.field_Wb;
          DelegatingCanvas.field_c = DelegatingCanvas.field_c + 1;
        }
        if (var4 == 1) {
          OptionsScreen.resultCounterOne = OptionsScreen.resultCounterOne - QuickChatMenu.field_Wb * 2;
          DelegatingCanvas.field_c = DelegatingCanvas.field_c - 2;
        }
        if (var4 == 2) {
          QuickChatMenu.field_Wb = QuickChatMenu.field_Wb + 2;
          OptionsScreen.resultCounterOne = OptionsScreen.resultCounterOne + DelegatingCanvas.field_c * 2;
        }
        if (var4 == 3) {
          QuickChatMenu.field_Wb = QuickChatMenu.field_Wb - 1;
          OptionsScreen.resultCounterOne = OptionsScreen.resultCounterOne - DelegatingCanvas.field_c;
        }
        if (4 == var4) {
          DelegatingCanvas.field_c = DelegatingCanvas.field_c + 1;
          WidgetTextLayout.resultCounterTwo = WidgetTextLayout.resultCounterTwo + QuickChatMenu.field_Wb;
        }
        if (var4 == 5) {
          DelegatingCanvas.field_c = DelegatingCanvas.field_c - 2;
          WidgetTextLayout.resultCounterTwo = WidgetTextLayout.resultCounterTwo - 2 * QuickChatMenu.field_Wb;
        }
        if (obfuscationGuard <= 98) {
          return false;
        }
        if (6 == var4) {
          WidgetTextLayout.resultCounterTwo = WidgetTextLayout.resultCounterTwo + QuickChatMenu.field_Wb;
          DelegatingCanvas.field_c = DelegatingCanvas.field_c + 1;
        }
        if (var4 == 7) {
          QuickChatMenu.field_Wb = QuickChatMenu.field_Wb - 2;
          WidgetTextLayout.resultCounterTwo = WidgetTextLayout.resultCounterTwo - DelegatingCanvas.field_c * 2;
        }
        if (8 == var4) {
          OptionsScreen.resultCounterOne = OptionsScreen.resultCounterOne + var5;
          OptionsScreen.resultCounterOne = OptionsScreen.resultCounterOne - var5;
        }
        if (var4 == 9) {
          WidgetTextLayout.resultCounterTwo = WidgetTextLayout.resultCounterTwo + var5;
          OptionsScreen.resultCounterOne = OptionsScreen.resultCounterOne - var5;
        }
        var4Lifetime1 = ChocolateBackground.field_w.nextBoundedInt(-37880252, 5);
        if (var4Lifetime1 == 0) {
          DisplayModeInfo.field_e = DisplayModeInfo.field_e ^ OutgoingPacketHelpers.field_g + BrowserResizeNotificationHelpers.field_a << 16;
        }
        if (var4Lifetime1 == 1) {
          FullscreenFailureDialog.field_kb = FullscreenFailureDialog.field_kb - OutgoingPacketHelpers.field_g;
          BrowserResizeNotificationHelpers.field_a = BrowserResizeNotificationHelpers.field_a - 1;
        }
        if (var4Lifetime1 == 2) {
          BrowserResizeNotificationHelpers.field_a = BrowserResizeNotificationHelpers.field_a + 1;
          FullscreenFailureDialog.field_kb = FullscreenFailureDialog.field_kb + OutgoingPacketHelpers.field_g;
        }
        if (var4Lifetime1 == 3) {
          OutgoingPacketHelpers.field_g = OutgoingPacketHelpers.field_g - 1;
          FullscreenFailureDialog.field_kb = FullscreenFailureDialog.field_kb - BrowserResizeNotificationHelpers.field_a;
        }
        if (var4Lifetime1 == 4) {
          OutgoingPacketHelpers.field_g = OutgoingPacketHelpers.field_g + 1;
          FullscreenFailureDialog.field_kb = FullscreenFailureDialog.field_kb + BrowserResizeNotificationHelpers.field_a;
        }
        if (keyCode == 13) {
          boolean decompiledFrameRemainder0 = true;
          var4Lifetime2 = 1;
          if (this.networkedMatch) {
            if (this.isSpectator(113)) {
              var4Lifetime2 = 4;
            } else {
              if (!this.match.resultsReady &&
                ((this.match.playerMaskThree | (this.match.playerMaskOne | this.match.playerMaskTwo)) & 1 << this.localPlayerId) == 0) {
                var4Lifetime2 = 2;
              } else {
                var4Lifetime2 = 3;
              }
            }
          } else {
            if (this.match.playerCount == 1) {
              var5Lifetime1 = this.match.playerBoards[0].boardState;
              decompiledFrameRemainder0 = (5 == var5Lifetime1 ||
                9 == var5Lifetime1 ||
                var5Lifetime1 == 3 ||
                var5Lifetime1 == 8);
              if (decompiledFrameRemainder0) {
                return true;
              }
            }
            if ((decompiledFrameRemainder0) &&
              (this.match.playerCount == 2)) {
              var4Lifetime2 = 17;
            }
          }
          if (this.match.playerCount != 1 &&
            this.match.resultsReady) {
            if (!(200 >= WidgetPaintStyle.field_j)) {
              WidgetPaintStyle.field_j = 299;
              return true;
            }
          } else {
            ScreenNavigationHelpers.requestScreen(false, 64, var4Lifetime2);
          }
          return true;
        }
        if (this.match.playerCount == 1 &&
          TextFieldRenderer.field_A &&
          MusicVoice.a((byte) 113)) {
          if (84 == keyCode) {
            GzipInflater.b(-8);
          }
          return true;
        }
        if (1 == this.match.playerCount &&
          this.debugControlsEnabled) {
          var7 = this.match.playerBoards[0];
          var8 = var7;
          if (48 == keyCode) {
            this.suppressResultSubmission = true;
            var7.field_m = HalloweenBackground.field_r[0] - 5;
            return true;
          }
          if (keyCode == 68) {
            var7.field_m = HalloweenBackground.field_r[1] - 5;
            this.suppressResultSubmission = true;
            return true;
          }
          if (66 == keyCode) {
            var7.field_m = -5 + HalloweenBackground.field_r[2];
            this.suppressResultSubmission = true;
            return true;
          }
          if (keyCode == 50) {
            this.progressBaseLevel = -HalloweenBackground.field_r[3] + (var8.levelIndex + 1);
            this.suppressResultSubmission = true;
            return true;
          }
          if (keyCode == 34) {
            this.suppressResultSubmission = true;
            this.progressBaseLevel = var7.levelIndex + 1 - HalloweenBackground.field_r[4];
            return true;
          }
          if (51 == keyCode) {
            var7.score = HalloweenBackground.field_r[7] - 20;
            this.suppressResultSubmission = true;
            return true;
          }
          if (keyCode == 52) {
            this.suppressResultSubmission = true;
            var7.score = -20 + HalloweenBackground.field_r[8];
          }
          if (keyCode == 53) {
            var5_ref_vn = (Ball) (var8.activeBalls.first(-19));
            while (var5_ref_vn != null) {
              var5_ref_vn.brickBounceCount = HalloweenBackground.field_r[9] - 2;
              var5_ref_vn = (Ball) (var8.activeBalls.next((byte) 116));
            }
            this.suppressResultSubmission = true;
            return true;
          }
          if (keyCode == 39) {
            var5_ref_vnLifetime1 = (Ball) (var8.activeBalls.first(-114));
            while (var5_ref_vnLifetime1 != null) {
              var5_ref_vnLifetime1.brickBounceCount = HalloweenBackground.field_r[10] - 2;
              var5_ref_vnLifetime1 = (Ball) (var8.activeBalls.next((byte) 116));
            }
            this.suppressResultSubmission = true;
            return true;
          }
          if (keyCode == 54) {
            fieldTemp$0 = var8.levelIndex + 1;
            var8.levelIndex = var8.levelIndex + 1;
            if (DualLinkNode.field_q > fieldTemp$0) {
              var8.boardState = 0;
            } else {
              var8.boardState = 5;
            }
            this.suppressResultSubmission = true;
            var8.stateTicks = 0;
            return true;
          }
          if (keyCode == 55) {
            for (var5Lifetime2 = 0; 29 > var5Lifetime2; var5Lifetime2++) {
              if (WeightedLruCache.powerUpDropPeriods[var5Lifetime2] > -1) {
                var7.powerUpDropCounters[var5Lifetime2] = (byte)(-1 + WeightedLruCache.powerUpDropPeriods[var5Lifetime2]);
              }
            }
            this.suppressResultSubmission = true;
            return true;
          }
          if (keyCode == 56) {
            var8.lives = 5;
            this.suppressResultSubmission = true;
            return true;
          }
          if (keyCode >= 16 &&
            25 >= keyCode) {
            var5Lifetime2Lifetime1 = -16 - (-keyCode - 1);
            this.suppressResultSubmission = true;
            if (IntArrayRequest.heldKeys[81]) {
              var5Lifetime2Lifetime1 += 10;
            }
            if (var5Lifetime2Lifetime1 <= 11) {
              TabbedPane.currentBackground = GamePresentationHelpers.selectBackground(var5Lifetime2Lifetime1, (byte) 19);
              return true;
            }
          }
          if (70 == keyCode) {
            var8.field_l = 6;
            this.suppressResultSubmission = true;
            return true;
          }
          if (keyCode == 69) {
            this.suppressResultSubmission = true;
            var7.field_hb = -1 + HalloweenBackground.field_r[29];
            return true;
          }
          if (keyCode == 40) {
            var7.field_u = -1 + HalloweenBackground.field_r[30];
            this.suppressResultSubmission = true;
            return true;
          }
          if (41 == keyCode) {
            var7.field_u = HalloweenBackground.field_r[31] - 1;
            this.suppressResultSubmission = true;
            return true;
          }
          if (keyCode == 32) {
            var7.field_N = HalloweenBackground.field_r[32] - 1;
            this.suppressResultSubmission = true;
            return true;
          }
          if (keyCode == 35) {
            var7.field_N = -1 + HalloweenBackground.field_r[33];
            this.suppressResultSubmission = true;
            return true;
          }
          if (49 == keyCode) {
            this.suppressResultSubmission = true;
            var7.field_m = HalloweenBackground.field_r[39] - 5;
            return true;
          }
          if (keyCode == 36) {
            this.suppressResultSubmission = true;
            var7.score = HalloweenBackground.field_r[40] - 20;
            return true;
          }
          if (38 == keyCode) {
            var8.boardState = 0;
            this.suppressResultSubmission = true;
            var8.stateTicks = 0;
            return true;
          }
        }
        stackIn_152_0 = !(RadialSelectorRenderer.field_p);
        return stackIn_152_0;
    }

    private final void sendProgressUpdate(int packId, int levelIndex, long elapsedMillis, boolean intermediate, int timeDivisor) {
        int intermediateFlag = 0;
        if (!this.suppressResultSubmission) {
          if (QuickChatMenu.h(-26090)) {
            return;
          }
          levelIndex = levelIndex + packId * 1000;
          intermediateFlag = intermediate ? 1 : 0;
          SaveResultsPromptScreen.a(levelIndex, intermediateFlag, timeDivisor - 468, ((int)elapsedMillis + 500) / timeDivisor);
          return;
        }
    }

    final void requestLeaveMatch(int obfuscationGuard) {
        if (!this.networkedMatch) {
          throw new IllegalStateException();
        }
        this.match.playerMaskOne = this.match.playerMaskOne | 1 << this.localPlayerId;
        int unusedGuardRemainder = 116 % ((obfuscationGuard + 55) / 62);
        TextFieldValidator.outgoingPackets.writeCipheredOpcode(-13413, 66);
    }

    private final void queueProgressAchievement(boolean markSnapshotsReady, int submissionByte, int achievementId) {
        int var4 = 0;
        int var5 = 0;
        if (this.recordAchievement(achievementId, 1)) {
          return;
        }
        if (markSnapshotsReady) {
          this.snapshotsReady = true;
        }
        if (!this.suppressResultSubmission) {
          var4 = this.match.playerBoards[0].score;
          var5 = this.match.playerBoards[0].levelIndex;
          OptionsScreen.resultCounterOne = OptionsScreen.resultCounterOne - (this.progressBaseLevel + var4);
          WidgetTextLayout.resultCounterTwo = WidgetTextLayout.resultCounterTwo + (-this.progressBaseLevel + var5);
          AccountMessageDialog.queuedAchievementSubmissions.addLast(new AchievementSubmission(achievementId, submissionByte, OptionsScreen.resultCounterOne, WidgetTextLayout.resultCounterTwo, DelegatingCanvas.field_c, QuickChatMenu.field_Wb), (byte) 3);
          OptionsScreen.resultCounterOne = OptionsScreen.resultCounterOne - (-this.progressBaseLevel + var5);
          WidgetTextLayout.resultCounterTwo = WidgetTextLayout.resultCounterTwo + (this.progressBaseLevel + var4);
        }
    }

    final void setStartingLevel(byte obfuscationGuard, int levelIndex) {
        int boardIndex = 0;
        int clientBranchFlag = BrickABrac.field_J ? 1 : 0;
        int counterLevelAdjustment;
        if (obfuscationGuard != 119) {
          return;
        }
        for (boardIndex = 0; boardIndex < this.match.playerBoards.length; boardIndex++) {
          this.match.playerBoards[boardIndex].levelIndex = levelIndex;
        }
        if (this.match.playerCount == 1) {
          this.progressBaseLevel = levelIndex;
          this.lastReportedLevel = levelIndex;
          counterLevelAdjustment = levelIndex;
          OptionsScreen.resultCounterOne = OptionsScreen.resultCounterOne + counterLevelAdjustment;
          ScreenshotViewer.field_r = HotspotTextWidget.a(2, this.match.configuration.getLevelTitle(this.lastReportedLevel, (byte) -122), -1);
        }
    }

    final static void b(byte param0, boolean param1) {
        int var2 = 9 % ((param0 + 73) / 49);
        String[] var3 = new String[]{LoadingProgressDialog.field_cb == null ? we.field_c : LoadingProgressDialog.field_cb, DelayedPacket.field_q};
        LevelSequence var4 = new LevelSequence(ValidationStatus.field_b, kk.createIndexOrder(false, ValidationStatus.field_b.levelCount, ButtonWidgetRenderer.field_w), 3);
        TextFieldRenderer.field_A = false;
        TabbedPane.currentBackground = GamePresentationHelpers.selectBackground(0, (byte) 19);
        OpacityWidget.startLocalGame(var3, 0, var4, 2, param1, -12665);
    }

    final void readResultOrder(BitPacketBuffer packet, int startIndex) {
        int var3_int = 0;
        byte dupTemp$0 = 0;
        boolean stackIn_5_0 = false;
        boolean stackIn_6_1 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        var4 = BrickABrac.field_J ? 1 : 0;
        try {
          for (var3_int = startIndex; this.match.playerCount > var3_int; var3_int++) {
            dupTemp$0 = packet.readByte(true);
            this.match.resultOrder[var3_int] = dupTemp$0;
            stackIn_5_0 = KeyboardInput.hasNonnegativeResult;
            stackIn_6_1 = !(0 > dupTemp$0);
            KeyboardInput.hasNonnegativeResult = stackIn_5_0 | stackIn_6_1;
          }
          this.match.markResultsReady(false);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("qj.Q(");
          if (packet == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(startIndex).append(')').toString());
        }
    }

    public static void d(int param0) {
        friendLocationHeading = null;
        field_l = null;
        int var1 = 47 / ((param0 - 14) / 59);
    }

    private final void setResultLevel(int levelIndex, boolean enableResultWordMode) {
        int counterLevelAdjustment = 0;
        if (enableResultWordMode) {
          this.resultWordMode = true;
        }
        if (this.match.playerCount == 1) {
          counterLevelAdjustment = levelIndex;
          WidgetTextLayout.resultCounterTwo = WidgetTextLayout.resultCounterTwo - counterLevelAdjustment;
        }
        this.resultLevel = levelIndex;
    }

    private final void queueMappedBitAchievement(int achievementId, int obfuscationGuard, int submissionByte) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var4 = 0;
        int var4Lifetime1;
        if (this.recordAchievement(achievementId, 1)) {
          return;
        }
        if (!this.suppressResultSubmission) {
          var4 = achievementId;
          var5 = submissionByte;
          if ((255 ^ var5) != var4) {
            throw new IllegalArgumentException();
          }
          var6 = ed.field_f[var4];
          if (0 > var6) {
            throw new IllegalArgumentException();
          }
          FullscreenFailureDialog.field_kb = FullscreenFailureDialog.field_kb + DisplayModeInfo.field_e;
          var7 = 1 << var6;
          DisplayModeInfo.field_e = DisplayModeInfo.field_e ^ var7;
          FullscreenFailureDialog.field_kb = FullscreenFailureDialog.field_kb - DisplayModeInfo.field_e;
          AccountMessageDialog.queuedAchievementSubmissions.addLast(new AchievementSubmission(achievementId, submissionByte, DisplayModeInfo.field_e, FullscreenFailureDialog.field_kb, OutgoingPacketHelpers.field_g, BrowserResizeNotificationHelpers.field_a), (byte) 3);
        }
        var4Lifetime1 = 90 % ((obfuscationGuard - 36) / 46);
    }

    private final void queueOffsetAchievement(byte obfuscationGuard, int achievementId, int submissionByte) {
        int var5 = BrickABrac.field_J ? 1 : 0;
        if (this.recordAchievement(achievementId, 1)) {
          return;
        }
        if (obfuscationGuard <= 17) {
          return;
        }
        if (this.suppressResultSubmission) {
        } else {
          if (achievementId == 7) {
            OptionsScreen.resultCounterOne = OptionsScreen.resultCounterOne - this.progressBaseLevel;
          } else {
            WidgetTextLayout.resultCounterTwo = WidgetTextLayout.resultCounterTwo - this.progressBaseLevel;
          }
          AccountMessageDialog.queuedAchievementSubmissions.addLast(new AchievementSubmission(achievementId, submissionByte, OptionsScreen.resultCounterOne, WidgetTextLayout.resultCounterTwo, DelegatingCanvas.field_c, QuickChatMenu.field_Wb), (byte) 3);
          if (achievementId != 7) {
            WidgetTextLayout.resultCounterTwo = WidgetTextLayout.resultCounterTwo + this.progressBaseLevel;
          } else {
            OptionsScreen.resultCounterOne = OptionsScreen.resultCounterOne + this.progressBaseLevel;
          }
        }
    }

    private final boolean advanceMatch(NodeDeque remoteAudioEvents, boolean obfuscationGuard, NodeDeque localAudioEvents) {
        NodeDeque stackIn_4_0 = null;
        int stackIn_107_0 = 0;
        RuntimeException stackIn_110_0 = null;
        StringBuilder stackIn_110_1 = null;
        String stackIn_111_2 = null;
        StringBuilder stackIn_113_1 = null;
        String stackIn_114_2 = null;
        RuntimeException decompiledCaughtException = null;
        int advancedLocalTick = 0;
        RuntimeException var4 = null;
        NodeDeque collectedPowerUps = null;
        int playerId = 0;
        PlayerBoard var6 = null;
        int var7 = 0;
        int catchUpTicks = 0;
        PlayerBoard var8 = null;
        PowerUp fallingPowerUp = null;
        int consumedTicks = 0;
        int var10 = 0;
        PlayerInputBatch inputBatch = null;
        Object var11 = null;
        int expectedChecksum = 0;
        int clientBranchFlag = 0;
        int var15 = 0;
        PlayerBoard inputBoard = null;
        PlayerBoard effectBoard = null;
        PlayerBoard displayBoard = null;
        int var6_intLifetime1;
        int var6_intLifetime2;
        int var6_intLifetime3;
        int var6_intLifetime4;
        int var7Lifetime1;
        int var8_intLifetime1;
        int var8_intLifetime2;
        int var9Lifetime1;
        clientBranchFlag = BrickABrac.field_J ? 1 : 0;
        try {
          advancedLocalTick = 0;
          if (!this.networkedMatch) {
            stackIn_4_0 = new NodeDeque();
          } else {
            stackIn_4_0 = null;
          }
          collectedPowerUps = stackIn_4_0;
          for (playerId = 0; playerId < this.match.playerCount; playerId++) {
            inputBoard = this.match.playerBoards[playerId];
            if ((1 << playerId & (this.match.playerMaskOne | (this.match.playerMaskTwo | this.match.playerMaskThree))) != 0) {
              inputBoard.maskedTicks = inputBoard.maskedTicks + 1;
            }
            boolean decompiledFrameRemainder0 = true;
            if ((1 << playerId & this.localPlayerMask) == 0) {
              decompiledFrameRemainder0 = (inputBoard.bufferedInputTicks != 0);
              if (decompiledFrameRemainder0) {
                catchUpTicks = 1;
                if (inputBoard.bufferedInputTicks > 25) {
                  catchUpTicks = 3;
                }
                if (50 < inputBoard.bufferedInputTicks) {
                  catchUpTicks = -25 + inputBoard.bufferedInputTicks;
                }
                consumedTicks = 0;
                inputBatch = (PlayerInputBatch) (inputBoard.incomingInputBatches.first(-84));
                while (consumedTicks < catchUpTicks) {
                  this.match.applyPendingPowerUps((byte) 120, playerId);
                  inputBoard.controlMask = inputBatch.nextControlMask((byte) -104);
                  this.match.advanceBoard(inputBoard, remoteAudioEvents, collectedPowerUps, 0);
                  inputBoard.simulationTick = inputBoard.simulationTick + 1;
                  if (inputBatch.isConsumed(1)) {
                    inputBatch.unlink((byte) 111);
                    inputBoard.positionWord = inputBatch.positionWord;
                    if (inputBatch.hasChecksum) {
                      var11 = null;
                      expectedChecksum = inputBoard.computeBoardChecksum(obfuscationGuard, (StringBuilder) (var11)) ^ inputBoard.nextRandomInt(120);
                      if (inputBatch.maskedChecksum != expectedChecksum) {
                        hn.closeGameTransport((byte) 91);
                        AlignedIconLabel.a("T2 " + inputBatch.maskedChecksum + " " + expectedChecksum + " ", (Throwable) null, 54);
                        cf.checksumMismatchCount = cf.checksumMismatchCount + 1;
                      }
                    }
                    inputBatch = (PlayerInputBatch) (inputBoard.incomingInputBatches.first(-21));
                  }
                  consumedTicks++;
                  inputBoard.bufferedInputTicks = inputBoard.bufferedInputTicks - 1;
                }
              }
            } else {
              if (this.networkedMatch) {
                catchUpTicks = inputBoard.simulationTick - inputBoard.receivedInputTick;
                decompiledFrameRemainder0 = (!(catchUpTicks > 30) ||
                  0 != MembershipBenefitsScreen.clientTick % 10);
                if ((decompiledFrameRemainder0) &&
                  (decompiledFrameRemainder0 = (!(40 < catchUpTicks) ||
                  0 != MembershipBenefitsScreen.clientTick % 5))) {
                  decompiledFrameRemainder0 = (50 != catchUpTicks);
                }
              }
              if ((decompiledFrameRemainder0) &&
                (decompiledFrameRemainder0 = (((this.match.playerMaskThree | (this.match.playerMaskTwo | this.match.playerMaskOne)) & 1 << playerId) == 0))) {
                this.match.applyPendingPowerUps((byte) 127, playerId);
                this.match.advanceBoard(inputBoard, localAudioEvents, collectedPowerUps, 0);
                if (!this.networkedMatch) {
                  this.match.distributeQueuedAttacks(playerId, 1, collectedPowerUps, (byte) -122);
                  inputBoard.positionWord = inputBoard.field_Q;
                }
                advancedLocalTick = advancedLocalTick | 1;
                inputBoard.simulationTick = inputBoard.simulationTick + 1;
              }
            }
            if (decompiledFrameRemainder0) {
              if (collectedPowerUps != null) {
                collectedPowerUps.clear((byte) -110);
              }
              inputBoard.advancePowerUpWarnings(-101);
            }
          }
          var6_intLifetime1 = 0;
          if (!obfuscationGuard) {
            this.localPlayerId = 29;
          }
          while (this.match.playerCount > var6_intLifetime1) {
            effectBoard = this.match.playerBoards[var6_intLifetime1];
            var8_intLifetime1 = 0;
            fallingPowerUp = (PowerUp) (effectBoard.fallingPowerUps.first(-48));
            while (fallingPowerUp != null) {
              var8_intLifetime1 = var8_intLifetime1 | 1 << fallingPowerUp.typeId;
              fallingPowerUp = (PowerUp) (effectBoard.fallingPowerUps.next((byte) 116));
            }
            var15 = 0;
            var9Lifetime1 = var15;
            while (var15 < 29) {
              if (WeightedLruCache.powerUpDropPeriods[var15] >= 1) {
                var10 = (20 * effectBoard.powerUpDropCounters[var15] << 8) / WeightedLruCache.powerUpDropPeriods[var15];
                if ((1 << var15 & var8_intLifetime1) != 0) {
                  var10 = 5120;
                }
                effectBoard.powerUpMeterVelocities256[var15] = effectBoard.powerUpMeterVelocities256[var15] + (-effectBoard.powerUpMeterLevels256[var15] + var10) / 100;
                effectBoard.powerUpMeterVelocities256[var15] = 7 * effectBoard.powerUpMeterVelocities256[var15] / 8;
                if (512 < effectBoard.powerUpMeterVelocities256[var15]) {
                  effectBoard.powerUpMeterVelocities256[var15] = 512;
                }
                if (effectBoard.powerUpMeterVelocities256[var15] < -512) {
                  effectBoard.powerUpMeterVelocities256[var15] = -512;
                }
                effectBoard.powerUpMeterLevels256[var15] = effectBoard.powerUpMeterLevels256[var15] + effectBoard.powerUpMeterVelocities256[var15];
                if (effectBoard.powerUpMeterVelocities256[var15] > 0 &&
                  effectBoard.powerUpMeterLevels256[var15] > var10 ||
                  !(effectBoard.powerUpMeterVelocities256[var15] >= 0) &&
                  !(var10 <= effectBoard.powerUpMeterLevels256[var15])) {
                  effectBoard.powerUpMeterLevels256[var15] = var10;
                }
              }
              var15++;
            }
            var6_intLifetime1++;
          }
          if (this.match.playerCount > 1) {
            for (var6_intLifetime2 = 0; var6_intLifetime2 < this.match.playerCount; var6_intLifetime2++) {
              displayBoard = this.match.playerBoards[var6_intLifetime2];
              var8_intLifetime2 = displayBoard.positionWord + displayBoard.boardOffset << 8;
              displayBoard.field_J = displayBoard.field_J + (var8_intLifetime2 - displayBoard.field_G) / 100;
              displayBoard.field_J = 7 * displayBoard.field_J / 8;
              if (displayBoard.field_J > 1280) {
                displayBoard.field_J = 1280;
              }
              displayBoard.field_G = displayBoard.field_G + displayBoard.field_J;
              if (displayBoard.field_G > var8_intLifetime2) {
                displayBoard.field_G = var8_intLifetime2;
              }
            }
          }
          if (this.match.playerCount > 1) {
            var6_intLifetime3 = this.match.getWrappedPositionInversionMask(125);
            for (var7 = 0; this.match.playerCount > var7; var7++) {
              var8 = this.match.playerBoards[var7];
              if ((1 << var7 & var6_intLifetime3) != 0) {
                if (var8.positionOrderTicks == -1) {
                  var8.positionOrderTicks = 500;
                }
              } else {
                var8.positionOrderTicks = -1;
              }
            }
          }
          if (!this.networkedMatch) {
            if (this.match.playerCount == 1) {
              var6 = this.match.playerBoards[0];
              if (var6.boardState == 8 ||
                var6.boardState == 9) {
                this.finishOfflineMatch((byte) 40, false);
                if (8 != var6.boardState) {
                  NewAchievementsScreen.discardGameplayOnTransition = true;
                }
              }
            } else {
              if (!this.match.resultsReady) {
                this.match.playerMaskThree = this.match.playerMaskThree | this.match.getStateSevenPlayerMask(-17566);
                this.match.playerMaskTwo = this.match.playerMaskTwo | this.match.getStateZeroPlayerMask((byte) -92);
                if (this.match.checkMatchCompletion(82)) {
                  if (-1 == this.match.lastRemainingPlayerId) {
                    this.match.lastRemainingPlayerId = 0;
                  }
                  var6_intLifetime4 = this.match.lastRemainingPlayerId;
                  var7Lifetime1 = 1 - this.match.lastRemainingPlayerId;
                  if ((this.match.playerMaskThree & 1 << var7Lifetime1) != 0) {
                    var6_intLifetime4 = var7Lifetime1;
                  }
                  this.match.playerBoards[var6_intLifetime4].resultCode = 1;
                  this.match.resultOrder[0] = var6_intLifetime4;
                  this.match.playerBoards[-var6_intLifetime4 + 1].resultCode = 2;
                  this.match.resultOrder[1] = 1 - var6_intLifetime4;
                  this.match.markResultsReady(false);
                  KeyboardInput.hasNonnegativeResult = true;
                }
              }
            }
          }
          stackIn_107_0 = advancedLocalTick;
          return stackIn_107_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_110_0 = var4;
          stackIn_110_1 = new StringBuilder().append("qj.P(");
          if (remoteAudioEvents == null) {
            stackIn_111_2 = "null";
          } else {
            stackIn_111_2 = "{...}";
          }
          stackIn_113_1 = ((StringBuilder) (Object) stackIn_110_1).append(stackIn_111_2).append(',').append(obfuscationGuard).append(',');
          if (localAudioEvents == null) {
            stackIn_114_2 = "null";
          } else {
            stackIn_114_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_110_0), ((StringBuilder) (Object) stackIn_113_1).append(stackIn_114_2).append(')').toString());
        }
    }

    private final void queueLevelResult(LevelPack pack, int resultIncrement, byte obfuscationGuard, int levelNumber) {
        LevelResultSubmission var5 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        try {
          if (this.suppressResultSubmission) {
            return;
          }
          WidgetTextLayout.resultCounterTwo = WidgetTextLayout.resultCounterTwo + (levelNumber + pack.scoreOffset);
          if (obfuscationGuard > -87) {
            this.networkedMatch = true;
          }
          OptionsScreen.resultCounterOne = OptionsScreen.resultCounterOne - (resultIncrement + this.progressBaseLevel);
          var5 = new LevelResultSubmission(pack.packId, -1 + levelNumber, OptionsScreen.resultCounterOne, WidgetTextLayout.resultCounterTwo, DelegatingCanvas.field_c, QuickChatMenu.field_Wb);
          IntNode.queuedLevelResults.addLast(var5, (byte) 3);
          OptionsScreen.resultCounterOne = OptionsScreen.resultCounterOne - (pack.scoreOffset + levelNumber);
          WidgetTextLayout.resultCounterTwo = WidgetTextLayout.resultCounterTwo + (resultIncrement + this.progressBaseLevel);
          if (hh.unlockedLevelCounts[pack.packId] < levelNumber) {
            hh.unlockedLevelCounts[pack.packId] = levelNumber;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_9_0 = var5_ref;
          stackIn_9_1 = new StringBuilder().append("qj.AA(");
          if (pack == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(resultIncrement).append(',').append(obfuscationGuard).append(',').append(levelNumber).append(')').toString());
        }
    }

    final void readScheduledPowerUp(BitPacketBuffer packet, byte obfuscationGuard) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        PowerUp var6 = null;
        try {
          var3_int = packet.readUnsignedByte(255);
          var4 = packet.readUnsignedByte(255);
          var5 = packet.readInt(255);
          var6 = new PowerUp(0, 0, var4);
          int var7 = 102 / ((-65 - obfuscationGuard) / 34);
          var6.activationTick = var5;
          this.match.playerBoards[var3_int].powerUpHistory.append(var6, (byte) -39);
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "qj.G(" + (packet != null ? "{...}" : "null") + ',' + obfuscationGuard + ')');
        }
    }

    private final void readLocalControls(byte obfuscationGuard, PlayerBoard board) {
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          board.controlMask = 0;
          if (IntArrayRequest.heldKeys[board.leftKeyCode]) {
            board.controlMask = board.controlMask | 1;
          }
          if (IntArrayRequest.heldKeys[board.rightKeyCode]) {
            board.controlMask = board.controlMask | 2;
          }
          if (IntArrayRequest.heldKeys[board.actionKeyCode]) {
            board.controlMask = board.controlMask | 4;
          }
          if (obfuscationGuard <= 50) {
            this.requestLeaveMatch(60);
          }
          if (this.match.playerCount == 1 ||
            this.networkedMatch) {
            if (IntArrayRequest.heldKeys[HighscoresScreen.field_w[1][0]]) {
              board.controlMask = board.controlMask | 1;
            }
            if (IntArrayRequest.heldKeys[HighscoresScreen.field_w[1][1]]) {
              board.controlMask = board.controlMask | 2;
            }
            if (!IntArrayRequest.heldKeys[HighscoresScreen.field_w[1][2]]) {
              return;
            }
            board.controlMask = board.controlMask | 4;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_22_0 = var3;
          stackIn_22_1 = new StringBuilder().append("qj.GA(").append(obfuscationGuard).append(',');
          if (board == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    private final void drawMatchFrame(int obfuscationGuard) {
        int offlineValue = 0;
        int showAllDetailsValue = 0;
        int firstHudPlayerValue = 0;
        int firstHudLocalValue = 0;
        boolean firstHudResultMode = false;
        int firstHudGuard = 0;
        int firstHudX = 0;
        boolean showFirstHudDetails = false;
        PlayerBoard firstHudBoard;
        int firstHudY;
        int firstHudPlayerId;
        boolean firstHudLocalOrOffline = false;
        int secondHudLocalValue = 0;
        boolean secondHudResultMode = false;
        int secondHudGuard = 0;
        int secondHudX = 0;
        boolean showSecondHudDetails = false;
        PlayerBoard secondHudBoard;
        int secondHudY;
        int secondHudPlayerId;
        boolean secondHudLocalOrOffline;
        int viewedLocalValue = 0;
        boolean viewedHudResultMode = false;
        int viewedHudGuard = 0;
        int viewedHudX = 0;
        boolean showViewedHudDetails;
        int[] layoutX;
        int[] layoutY;
        int unusedGuardQuotient;
        int[] layoutModes;
        int backgroundPlayerId;
        int backgroundSlot;
        PlayerBoard singleBoard;
        int showAllPlayerDetails;
        RgbSprite headSpriteAlias;
        int singleBoardScroll;
        int backgroundFadeAlpha;
        int unusedClientFlag;
        IndexedSprite[] unusedInlineSprites;
        Paddle paddle;
        int[] layoutXAlias;
        int[] layoutYAlias;
        int[] fixedLayoutXAlias;
        int[] fixedLayoutYAlias;
        int[] portraitLayoutX;
        int[] portraitLayoutY;
        RgbSprite headSprite;
        int[] fixedLayoutX;
        int[] fixedLayoutY;
        int boardPlayerId;
        int portraitPlayerId;
        int unusedPreviewSlot;
        int boardSlot;
        int localOrOfflineFlag;
        int portraitSlot;
        int hudPlayerId;
        int nameStripHeight;
        int firstHudLocalFlag;
        int splitBoardScroll;
        int secondHudLocalFlag;
        unusedClientFlag = BrickABrac.field_J ? 1 : 0;
        unusedGuardQuotient = -76 / ((-79 - obfuscationGuard) / 35);
        layoutXAlias = NodeDequeCursor.boardLayoutXByPlayerCount[this.match.playerCount - 1];
        layoutX = layoutXAlias;
        layoutYAlias = NodeDequeCursor.boardLayoutYByPlayerCount[this.match.playerCount - 1];
        layoutY = layoutYAlias;
        layoutModes = NodeDequeCursor.boardScaleDivisorsByPlayerCount[-1 + this.match.playerCount];
        backgroundPlayerId = this.viewedPlayerId;
        if (null != TabbedPane.currentBackground) {
          for (backgroundSlot = 0; backgroundSlot < this.match.playerCount; backgroundSlot++) {
            paddle = this.match.playerBoards[backgroundPlayerId].paddle;
            if (1 == this.match.playerCount) {
              singleBoardScroll = (-((paddle.x256 + paddle.width256 / 2 << 8) * 2) + 33423360) / 510;
              TabbedPane.currentBackground.drawFullBackground(true, singleBoardScroll, 0, 0, 0);
              if (TabbedPane.currentBackground.sceneId == 7 ||
                this.match.playerBoards[backgroundPlayerId].boardState == 5) {
                TextChoiceDialogStyles.a(121, true);
              }
              if (MenuScreen.field_i <= 0) {
                break;
              }
              backgroundFadeAlpha = MenuScreen.field_i * 256 / 32;
              nk.field_c.b(0, 0, backgroundFadeAlpha);
              break;
            }
            layoutXAlias = layoutX;
            layoutYAlias = layoutY;
            if (layoutModes[backgroundSlot] != 1) {
              layoutXAlias = layoutX;
              layoutYAlias = layoutY;
              MovingBody.a((byte) 124, 153 + layoutXAlias[backgroundSlot], layoutXAlias[backgroundSlot], layoutYAlias[backgroundSlot], 233 + layoutYAlias[backgroundSlot]);
              TabbedPane.currentBackground.drawPreview((byte) -102, backgroundPlayerId, layoutXAlias[backgroundSlot], layoutYAlias[backgroundSlot]);
              sc.popRaster(-79);
            } else {
              MovingBody.a((byte) 76, 306 + layoutXAlias[backgroundSlot], layoutXAlias[backgroundSlot], layoutYAlias[backgroundSlot], layoutYAlias[backgroundSlot] + 480);
              splitBoardScroll = (-(2 * (paddle.x256 + paddle.width256 / 2 << 8)) + 20054016) / 306;
              TabbedPane.currentBackground.drawSplitBackground(layoutYAlias[backgroundSlot], (byte) -107, layoutXAlias[backgroundSlot], backgroundPlayerId, splitBoardScroll / 2);
              sc.popRaster(-122);
            }
            backgroundPlayerId++;
            backgroundPlayerId = backgroundPlayerId % this.match.playerCount;
          }
        }
        if (TabbedPane.currentBackground != null) {
          layoutXAlias = layoutX;
          layoutYAlias = layoutY;
          if (this.match.playerCount > 2) {
            for (unusedPreviewSlot = this.match.playerCount; unusedPreviewSlot < 5; unusedPreviewSlot++) {
              TabbedPane.currentBackground.drawPreview((byte) -79, -1, layoutXAlias[unusedPreviewSlot], layoutYAlias[unusedPreviewSlot]);
              Rasterizer2D.fillRectangleAlpha(layoutXAlias[unusedPreviewSlot], layoutYAlias[unusedPreviewSlot], 153, 233, 0, 160);
            }
          }
        }
        boardPlayerId = this.viewedPlayerId;
        for (boardSlot = 0; boardSlot < this.match.playerCount; boardSlot++) {
          if (~MusicCrossfadeStream.field_C != ~layoutModes[boardSlot]) {
            gr.b(layoutModes[boardSlot], -28463);
          }
          BitPacketBuffer.drawBoard((byte) 90, boardPlayerId, layoutModes[boardSlot], layoutYAlias[boardSlot], this.match, layoutXAlias[boardSlot]);
          boardPlayerId++;
          boardPlayerId = boardPlayerId % this.match.playerCount;
        }
        if (this.match.playerCount != 1) {
          if (2 != this.match.playerCount) {
            fixedLayoutY = NodeDequeCursor.boardLayoutYByPlayerCount[4];
            fixedLayoutYAlias = fixedLayoutY;
            layoutY = fixedLayoutYAlias;
            fixedLayoutX = NodeDequeCursor.boardLayoutXByPlayerCount[4];
            fixedLayoutXAlias = fixedLayoutX;
            layoutX = fixedLayoutXAlias;
            LobbyUiHelpers.paintNineSliceFrame(169, 482, -40, -1, LoginCredentialKind.field_h, -1);
            LobbyUiHelpers.paintNineSliceFrame(169, 482, -40, 472, LoginCredentialKind.field_h, -1);
            viewedLocalValue = ((this.localPlayerMask & 1 << this.viewedPlayerId) == 0) ? 0 : 1;
            localOrOfflineFlag = viewedLocalValue;
            viewedHudResultMode = this.resultWordMode;
            viewedHudGuard = -103;
            viewedHudX = fixedLayoutX[0];
            showViewedHudDetails = (localOrOfflineFlag != 0) || (0 == this.localPlayerMask);
            LobbyGame.drawMultiplayerBoardHud(viewedHudResultMode, viewedHudGuard, viewedHudX, showViewedHudDetails, this.match.playerBoards[this.viewedPlayerId], fixedLayoutY[0], this.viewedPlayerId, localOrOfflineFlag != 0, this.match);
            LobbyUiHelpers.paintNineSliceFrame(169, 9, -40, -1, LoginCredentialKind.field_h, 0 + (fixedLayoutY[2] - 3));
            LobbyUiHelpers.paintNineSliceFrame(169, 9, -40, 472, LoginCredentialKind.field_h, -3 + fixedLayoutY[2] - 0);
          } else {
            offlineValue = (this.networkedMatch) ? 0 : 1;
            localOrOfflineFlag = offlineValue;
            if (this.networkedMatch) {
              showAllDetailsValue = (this.localPlayerMask == 0) ? 1 : 0;
            } else {
              showAllDetailsValue = 1;
            }
            showAllPlayerDetails = showAllDetailsValue;
            if (this.networkedMatch) {
              firstHudPlayerValue = this.viewedPlayerId;
            } else {
              firstHudPlayerValue = 1;
            }
            hudPlayerId = firstHudPlayerValue;
            firstHudLocalValue = ((this.localPlayerMask & 1 << hudPlayerId) == 0) ? 0 : 1;
            firstHudLocalFlag = firstHudLocalValue;
            firstHudResultMode = this.resultWordMode;
            firstHudGuard = -103;
            firstHudX = layoutXAlias[0];
            showFirstHudDetails = (showAllPlayerDetails != 0) || (firstHudLocalFlag != 0);
            firstHudBoard = this.match.playerBoards[hudPlayerId];
            firstHudY = layoutYAlias[0];
            firstHudPlayerId = hudPlayerId;
            firstHudLocalOrOffline = (localOrOfflineFlag != 0) || (firstHudLocalFlag != 0);
            LobbyGame.drawMultiplayerBoardHud(firstHudResultMode, firstHudGuard, firstHudX, showFirstHudDetails, firstHudBoard, firstHudY, firstHudPlayerId, firstHudLocalOrOffline, this.match);
            hudPlayerId = 1 - hudPlayerId;
            secondHudLocalValue = (0 == (1 << hudPlayerId & this.localPlayerMask)) ? 0 : 1;
            secondHudLocalFlag = secondHudLocalValue;
            secondHudResultMode = this.resultWordMode;
            secondHudGuard = -103;
            secondHudX = layoutXAlias[1];
            showSecondHudDetails = (showAllPlayerDetails != 0) || (secondHudLocalFlag != 0);
            secondHudBoard = this.match.playerBoards[hudPlayerId];
            secondHudY = layoutYAlias[1];
            secondHudPlayerId = hudPlayerId;
            secondHudLocalOrOffline = (localOrOfflineFlag != 0) || (secondHudLocalFlag != 0);
            LobbyGame.drawMultiplayerBoardHud(secondHudResultMode, secondHudGuard, secondHudX, showSecondHudDetails, secondHudBoard, secondHudY, secondHudPlayerId, secondHudLocalOrOffline, this.match);
          }
        } else {
          singleBoard = this.match.playerBoards[0];
          LobbyUiHelpers.paintNineSliceFrame(526, 482, -40, -1, LoginCredentialKind.field_h, -1);
          Rasterizer2D.fillRectangleAlpha(7, 473, 510, 7, 0, 96);
          Rasterizer2D.fillRectangleAlpha(524, 0, 116, 480, 0, 96);
          LobbyUiHelpers.paintNineSliceFrame(125, 482, -40, 516, LoginCredentialKind.field_h, -1);
          DualLinkNode.drawSinglePlayerStatus(130, this.match, ContextActionController.field_g, singleBoard, (byte) -104, 527, 10, 85);
          LobbyUiHelpers.paintNineSliceFrame(125, 9, -40, 516, LoginCredentialKind.field_h, 137);
          if (!TextFieldRenderer.field_A ||
            wc.field_b) {
            GameplayRenderHelpers.drawCenteredPowerUpMeters(singleBoard, 524, 85, -68, 147, 81, this.match);
          }
          LobbyUiHelpers.paintNineSliceFrame(125, 9, -40, 516, LoginCredentialKind.field_h, 229);
          ArchiveNetworkClient.drawSinglePlayerCharacterHud(640, this.match, singleBoard);
          if (TextFieldRenderer.field_A &&
            MusicVoice.a((byte) 124)) {
            ui.a(LoadingProgressDialog.field_eb + Bzip2State.field_v, PasswordFieldRenderer.field_D, 6, GrowableIntList.field_i, 100, 621, 1729, 340, 230, 0);
          } else {
            if (null != singleBoard.displayedMessage) {
              unusedInlineSprites = (IndexedSprite[]) null;
              ui.a(singleBoard.displayedMessage, ContextActionController.field_g, 0, (IndexedSprite[]) null, 80, 621, 1729, 340, 85, -1);
            }
          }
        }
        if (this.match.playerCount > 1 &&
          ((this.match.playerMaskTwo | this.match.playerMaskOne) & 1 << this.viewedPlayerId) == 0) {
          ClientException.a(layoutX[0], 424, false, this.match, this.viewedPlayerId, layoutY[0]);
        }
        if (this.match.playerCount == 2 &&
          0 == (1 << 1 - this.viewedPlayerId & (this.match.playerMaskTwo | this.match.playerMaskOne))) {
          ClientException.a(layoutX[1], 424, false, this.match, 1 - this.viewedPlayerId, layoutY[1]);
        }
        portraitLayoutY = NodeDequeCursor.boardLayoutYByPlayerCount[this.match.playerCount - 1];
        portraitPlayerId = this.viewedPlayerId;
        portraitLayoutX = NodeDequeCursor.boardLayoutXByPlayerCount[this.match.playerCount - 1];
        for (portraitSlot = 0; this.match.playerCount > portraitSlot; portraitSlot++) {
          if (layoutModes[portraitSlot] == 2) {
            headSprite = ScorePopup.characterHeads[this.match.playerBoards[portraitPlayerId].characterIndex];
            headSpriteAlias = headSprite;
            nameStripHeight = PasswordFieldRenderer.field_D.ascent + PasswordFieldRenderer.field_D.descent;
            Rasterizer2D.fillRectangleAlpha(portraitLayoutX[portraitSlot], 235 + portraitLayoutY[portraitSlot] - 23, 153, nameStripHeight, 0, 141);
            headSpriteAlias.drawTransparent(-headSprite.canvasWidth + (153 + portraitLayoutX[portraitSlot]), 0 + (-headSprite.canvasHeight + portraitLayoutY[portraitSlot]) + 233);
            ce.field_e.drawLeft(this.match.playerNames[portraitPlayerId], portraitLayoutX[portraitSlot] + 4, 2 + portraitLayoutY[portraitSlot] + 223, 2, -1);
          }
          portraitPlayerId++;
          portraitPlayerId = portraitPlayerId % this.match.playerCount;
        }
    }

    GameplayScreen(String[] playerNames, int localPlayerId, int localPlayerMask, LevelSequence configuration, int[] randomSeeds, int[] characterOrder) {
        this(false, false, playerNames, localPlayerId, localPlayerMask, configuration, randomSeeds, characterOrder);
    }

    final void requestRematchAction(int obfuscationGuard) {
        if (!this.networkedMatch) {
          throw new IllegalStateException();
        }
        TextFieldValidator.outgoingPackets.writeCipheredOpcode(-13413, 67);
        int guardArithmetic = 68 % ((obfuscationGuard + 65) / 59);
    }

    GameplayScreen(boolean networkedMatch, boolean resultWordMode, String[] playerNames, int localPlayerId, int localPlayerMask, LevelSequence configuration, int[] randomSeeds, int[] characterOrder) {
        super(-1);
        boolean stackIn_4_1 = false;
        boolean stackIn_7_1 = false;
        boolean stackIn_10_1 = false;
        int stackIn_23_1 = 0;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_38_2 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] achievementMaskAlias = null;
        int localBoardCount = 0;
        RuntimeException failure = null;
        int achievementWordIndex = 0;
        int[] achievementMaskStorage = null;
        int[] achievementMaskReference = null;
        int[] achievementMask = null;
        int playerIndex;
        this.loadedBoardSnapshots = 0;
        this.suppressResultSubmission = false;
        try {
          stackIn_4_1 = (resultWordMode);
          this.resultWordMode = stackIn_4_1;
          stackIn_7_1 = (networkedMatch);
          this.networkedMatch = stackIn_7_1;
          this.localPlayerMask = localPlayerMask;
          this.localPlayerId = localPlayerId;
          stackIn_10_1 = !(QuickChatHelpDialog.field_Yb < 2);
          this.debugControlsEnabled = stackIn_10_1;
          achievementMask = SpriteInputHelpers.pendingAchievementMask;
          achievementMaskReference = achievementMask;
          achievementMaskStorage = achievementMaskReference;
          achievementMaskAlias = achievementMaskStorage;
          for (achievementWordIndex = 0; 8 > achievementWordIndex; achievementWordIndex++) {
            achievementMask[achievementWordIndex] = 0;
          }
          this.match = new MultiplayerMatch(playerNames, this.localPlayerMask, configuration, randomSeeds, characterOrder);
          localBoardCount = 0;
          for (playerIndex = 0; this.match.playerCount > playerIndex; playerIndex++) {
            if ((this.localPlayerMask & 1 << playerIndex) != 0) {
              localBoardCount++;
            }
          }
          if (localBoardCount == 2) {
            stackIn_23_1 = 1;
          } else {
            if (this.localPlayerId < 0) {
              stackIn_23_1 = 0;
            } else {
              stackIn_23_1 = this.localPlayerId;
            }
          }
          this.viewedPlayerId = stackIn_23_1;
          if (ChocolateBackground.field_w == null) {
            ChocolateBackground.field_w = new IsaacGenerator(new int[]{(int)MonotonicTime.nowMillis(false)});
          }
          MenuScreen.field_i = 0;
          WeightedLruCache.primaryActivityLoop = PcmStream.createWithVolume(NineSliceFrame.uiSounds[2], 256, 0);
          LoginMethodPreference.alternateActivityLoop = PcmStream.createWithVolume(NineSliceFrame.uiSounds[2], 256, 0);
          WeightedLruCache.primaryActivityLoop.setLoopCount(-1);
          LoginMethodPreference.alternateActivityLoop.setLoopCount(-1);
          OpacityWidget.queueSoundPlayback((byte) 125, WeightedLruCache.primaryActivityLoop);
          OpacityWidget.queueSoundPlayback((byte) 5, LoginMethodPreference.alternateActivityLoop);
          MusicCrossfadeStream.field_C = 1;
          gr.b(MusicCrossfadeStream.field_C, -28463);
          DelayedPacket.field_m = -1;
          GameClock.field_b = -1;
          if (ProducerFramebuffer.field_j == null) {
            ProducerFramebuffer.field_j = GamePresentationHelpers.formatIndexedText(AlternateNumericLoginCredentials.field_p, new String[]{""}, (byte) 103).toLowerCase();
            LoginCredentials.field_j = LevelResultSubmission.field_j.toLowerCase();
          }
          WidgetPaintStyle.field_j = 0;
          KeyboardInput.hasNonnegativeResult = false;
          UsernameAvailabilityValidator.field_l = MonotonicTime.nowMillis(false);
          NameEntryPopup.field_Yb = configuration.pack.packId;
          DualLinkNode.field_q = configuration.getPeriod(96);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          failure = decompiledCaughtException;
          stackIn_31_0 = failure;
          stackIn_31_1 = new StringBuilder().append("qj.<init>(").append(networkedMatch).append(',').append(resultWordMode).append(',');
          if (playerNames == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          stackIn_34_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(localPlayerId).append(',').append(localPlayerMask).append(',');
          if (configuration == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          stackIn_37_1 = ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(',');
          if (randomSeeds == null) {
            stackIn_38_2 = "null";
          } else {
            stackIn_38_2 = "{...}";
          }
          stackIn_40_1 = ((StringBuilder) (Object) stackIn_37_1).append(stackIn_38_2).append(',');
          if (characterOrder == null) {
            stackIn_41_2 = "null";
          } else {
            stackIn_41_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_40_1).append(stackIn_41_2).append(')').toString());
        }
    }

    static {
    }
}
