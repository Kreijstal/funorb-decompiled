/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

public final class Pool extends NetworkGameClient {
    static PlayingSound[] field_N;
    static long field_Q;
    static NineSliceFrame field_I;
    static String potBallsInAnyOrderFinishOnBlack;
    static int[] field_L;
    static UiComponent field_P;
    static String muChatLobbyHide;
    static HuffmanCodec field_J;
    public static int field_O;

    private final void updateScreenTransition(boolean param0, int param1) {
        int fieldTemp$0 = 0;
        PoolMatchController stackIn_26_0 = null;
        boolean stackIn_27_1 = false;
        PoolMatchController stackIn_32_0 = null;
        boolean stackIn_33_1 = false;
        PoolMatchController stackIn_91_0;
        PoolMatchController stackIn_91_1;
        int stackIn_91_2;
        int stackIn_91_3;
        int stackIn_91_4;
        int stackIn_91_5;
        int stackIn_91_6;
        PoolMatchController stackIn_92_0 = null;
        PoolMatchController stackIn_92_1 = null;
        boolean stackIn_92_7 = false;
        int stackIn_95_0 = 0;
        int stackIn_97_0 = 0;
        int stackIn_97_1 = 0;
        int stackIn_98_2 = 0;
        PoolMatchController stackIn_105_0;
        PoolMatchController stackIn_105_1;
        int stackIn_105_2;
        int stackIn_105_3;
        int stackIn_105_4;
        int stackIn_105_5;
        int stackIn_105_6;
        PoolMatchController stackIn_106_0 = null;
        PoolMatchController stackIn_106_1 = null;
        boolean stackIn_106_7 = false;
        int stackIn_108_0 = 0;
        int stackIn_108_1 = 0;
        int stackIn_109_2 = 0;
        int stackIn_117_0 = 0;
        int stackIn_119_0 = 0;
        int stackIn_119_1 = 0;
        int stackIn_120_2 = 0;
        PoolMatchController stackIn_127_0;
        PoolMatchController stackIn_127_1;
        int stackIn_127_2;
        int stackIn_127_3;
        int stackIn_127_4;
        int stackIn_127_5;
        int stackIn_127_6;
        PoolMatchController stackIn_128_0 = null;
        PoolMatchController stackIn_128_1 = null;
        boolean stackIn_128_7 = false;
        int stackIn_131_0 = 0;
        int stackIn_133_0 = 0;
        int stackIn_133_1 = 0;
        int stackIn_134_2 = 0;
        int var3_int;
        String var3;
        int var4;
        PoolMatchController var4_ref_uf;
        int var5;
        int var6;
        String[] var7;
        String[] var8;
        String[] var9;
        String[] var10;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var4Lifetime4;
        int var4Lifetime1Lifetime1;
        var6 = field_O;
        if (EmailAvailabilityValidator.field_o != EmailAvailabilityValidator.field_s) {
          if (ChatInputSupport.field_b == EmailAvailabilityValidator.field_s) {
            IntrusiveNodeHashTable.field_m = IntrusiveNodeHashTable.field_m + 1;
            if (IntrusiveNodeHashTable.field_m == 16) {
              if (NineSliceFrame.field_c) {
                ArchiveAvailabilitySupport.showLoginAndResetClientStage(param1 + 0);
              } else {
                UiComponentNode.requestLoginFromGuestMode((byte) 60);
              }
              EmailAvailabilityValidator.field_s = PlasmaTableScene.field_V;
            }
          } else {
            if (PlasmaTableScene.field_V != EmailAvailabilityValidator.field_s) {
              IntrusiveNodeHashTable.field_m = IntrusiveNodeHashTable.field_m - 1;
              if (IntrusiveNodeHashTable.field_m == 0) {
                EmailAvailabilityValidator.field_s = EmailAvailabilityValidator.field_o;
              }
            } else {
              if (!NanoTickClock.isGuestMode(param1 + 16)) {
                if (null != DebugSliderInputSupport.field_d) {
                  LoginMethod.submitHighScore(25756, DebugSliderInputSupport.field_d, 3);
                }
                IntegerRecordProtocolSupport.hideLoginRequiredPrompt((byte) -108);
                GameRules.field_b = SocialListEntry.field_Ub;
                if (NineSliceFrame.field_c) {
                  NineSliceFrame.field_c = false;
                  AvailabilityQueryResult.requestFullscreen(-28038, false);
                }
                if (WireframeQuad.field_x) {
                  AccountCreationDialog.switchScreen(-3405, -4, GameRules.field_b, false);
                  WireframeQuad.field_x = false;
                }
                if (ShotEvent.isNonnegative(true, GameRules.field_b)) {
                  PoolGameModel.applyPendingScreenTransition(41);
                }
              }
              EmailAvailabilityValidator.field_s = IntrusiveDequeCursor.field_d;
            }
          }
        } else {
          var3_int = 0;
          var4 = 0;
          if (!param0) {
            if (GameRules.field_b != MatchingTextValidator.field_w) {
              ThemeSelectScreen.field_P = ThemeSelectScreen.field_P + 1;
              LoginRequestSupport.rotateBallPreview((byte) 46);
              if (ThemeSelectScreen.field_P == 32) {
                PoolGameModel.applyPendingScreenTransition(param1 - 128);
              }
            } else {
              if (MatchingTextValidator.field_w != -1) {
                if (MatchingTextValidator.field_w == -2) {
                  var3_int = 1;
                } else {
                  if (ShotEvent.isNonnegative(true, MatchingTextValidator.field_w)) {
                    DisplayModeSupport.field_c[MatchingTextValidator.field_w].advanceScreen(-1);
                  }
                }
              } else {
                if (!Base37Support.field_d) {
                  AccountContentDialog.field_ub.tick(false, true, (byte) -9);
                  while (LabeledChildWidget.pollKeyEvent(127)) {
                    AccountContentDialog.field_ub.handleKeyTyped((byte) 101);
                  }
                } else {
                  var4 = 1;
                  var3_int = 1;
                }
              }
            }
          }
          if (Base37Support.field_d &&
            !AlternateLongAndTextLoginPayload.field_p &&
            !LoginRequiredScreen.field_H) {
            if (MidiNoteMixer.field_v &&
              DualLinkNode.field_p) {
              var3_int = 0;
            }
            AchievementSubmission.serviceLobbyFrame(10, var3_int != 0);
            if (TransformSupport.field_e) {
              stackIn_26_0 = TextWidgetPainter.field_e;
              stackIn_27_1 = (0 != IntLookupQuery.field_q.pressedButton);
              ((PoolMatchController) (Object) stackIn_26_0).tick(stackIn_27_1, var4 != 0, (byte) -118);
            }
            if (MidiNoteMixer.field_v) {
              BrowserCookieSupport.updateChatCompositionPanel(180, var4 != 0, param1 - 17156, 320);
              stackIn_32_0 = AccountContentDialog.field_ub;
              stackIn_33_1 = (IntLookupQuery.field_q.pressedButton != 0);
              ((PoolMatchController) (Object) stackIn_32_0).tick(stackIn_33_1, var4 != 0, (byte) -108);
            }
            while (LabeledChildWidget.pollKeyEvent(127)) {
              if (LookupProtocolSupport.field_b) {
                if (MidiNoteMixer.field_v) {
                  if (KillerRules.handleChatOrQuickChatKey(15, 12, -1, 13)) {
                    continue;
                  }
                } else {
                  TimeTrialSelectScreen.handleInterfaceKeyPress(false, 15, 13, 12);
                }
              }
              if (TransformSupport.field_e) {
                TextWidgetPainter.field_e.handleKeyTyped((byte) 94);
              }
              if (!MidiNoteMixer.field_v) {
                continue;
              }
              AccountContentDialog.field_ub.handleKeyTyped((byte) 81);
            }
          }
          if (!Base37Support.field_d) {
            TransformSupport.advanceInterfaceTransitions(true);
          }
          if (!LookupProtocolSupport.field_b) {
            if (DateInputWidget.field_U > 0) {
              DateInputWidget.field_U = DateInputWidget.field_U - 1;
            }
          } else {
            if (BufferedFile.field_h > DateInputWidget.field_U) {
              DateInputWidget.field_U = DateInputWidget.field_U + 1;
            }
          }
          QuickChatHelpDialog.positionSlidingPanelByProgress(5938, DateInputWidget.field_U);
          if (null != LoginForm.field_U.last((byte) 99)) {
            fieldTemp$0 = IntrusiveDequeCursor.field_h + 1;
            IntrusiveDequeCursor.field_h = IntrusiveDequeCursor.field_h + 1;
            if (fieldTemp$0 == 335) {
              IntrusiveDequeCursor.field_h = 0;
              LoginForm.field_U.removeLast((byte) -41);
            }
          }
        }
        if (-3 == GameRules.field_b) {
          DebugSliderInputSupport.field_d = null;
          var7 = new String[DelayedServerPacket.field_n];
          var9 = var7;
          for (var4Lifetime1 = 0; var4Lifetime1 < DelayedServerPacket.field_n; var4Lifetime1++) {
            var7[var4Lifetime1] = PauseMenuScreen.playerNs[var4Lifetime1];
          }
          stackIn_91_0 = null;
          stackIn_91_1 = null;
          stackIn_91_2 = HighScoreSubmission.field_m;
          stackIn_91_3 = ChatPanelSupport.field_a;
          stackIn_91_4 = DialWidget.field_W;
          stackIn_91_5 = LoginPayload.field_f;
          stackIn_91_6 = LoginPayload.field_f;
          if (LookupProtocolSupport.field_e != 0) {
            stackIn_92_0 = null;
            stackIn_92_1 = null;
            stackIn_92_7 = false;
          } else {
            stackIn_92_0 = null;
            stackIn_92_1 = null;
            stackIn_92_7 = true;
          }
          AccountContentDialog.field_ub = new PoolMatchController(stackIn_91_2, stackIn_91_3, stackIn_91_4, stackIn_91_5, stackIn_91_6, stackIn_92_7, var9, 0, false);
          stackIn_95_0 = (!Atan2Support.field_a) ? 0 : 1;
          var4Lifetime1Lifetime1 = stackIn_95_0;
          stackIn_97_0 = param1 - 3405;
          stackIn_97_1 = -1;
          if (LobbyPlayerLookupSupport.isGuestOrFreeAccount(true)) {
            stackIn_98_2 = 21;
          } else {
            stackIn_98_2 = 0;
          }
          AccountCreationDialog.switchScreen(stackIn_97_0, stackIn_97_1, stackIn_98_2, var4Lifetime1Lifetime1 != 0);
          AppletUrlSupport.field_c = true;
        }
        if (GameRules.field_b == -7) {
          DebugSliderInputSupport.field_d = null;
          var8 = new String[DelayedServerPacket.field_n];
          var10 = var8;
          for (var4Lifetime2 = 0; var4Lifetime2 < DelayedServerPacket.field_n; var4Lifetime2++) {
            var8[var4Lifetime2] = PauseMenuScreen.playerNs[var4Lifetime2];
          }
          stackIn_105_0 = null;
          stackIn_105_1 = null;
          stackIn_105_2 = HighScoreSubmission.field_m;
          stackIn_105_3 = ChatPanelSupport.field_a;
          stackIn_105_4 = DialWidget.field_W;
          stackIn_105_5 = LoginPayload.field_f;
          stackIn_105_6 = LoginPayload.field_f;
          if (LookupProtocolSupport.field_e != 0) {
            stackIn_106_0 = null;
            stackIn_106_1 = null;
            stackIn_106_7 = false;
          } else {
            stackIn_106_0 = null;
            stackIn_106_1 = null;
            stackIn_106_7 = true;
          }
          var4_ref_uf = new PoolMatchController(stackIn_105_2, stackIn_105_3, stackIn_105_4, stackIn_105_5, stackIn_105_6, stackIn_106_7, var10, 0, false);
          var4_ref_uf.gameModel.addOrUpdateShot(MaxLengthTextInputWidget.nextRandomInt(512, true, RankingsRequest.field_r), -1, 0, (AccountContentDialog.field_ub.gameModel.field_A + 1) % DelayedServerPacket.field_n, param1 ^ 19063);
          AccountContentDialog.field_ub = var4_ref_uf;
          var5 = Atan2Support.field_a ? 1 : 0;
          stackIn_108_0 = -3405;
          stackIn_108_1 = -1;
          if (LobbyPlayerLookupSupport.isGuestOrFreeAccount(true)) {
            stackIn_109_2 = 21;
          } else {
            stackIn_109_2 = 0;
          }
          AccountCreationDialog.switchScreen(stackIn_108_0, stackIn_108_1, stackIn_109_2, var5 != 0);
          AppletUrlSupport.field_c = true;
        }
        if (GameRules.field_b == -6) {
          DebugSliderInputSupport.field_d = null;
          var3 = ResourceArchive.field_j;
          if (var3 == null) {
            var3 = ContextMenu.youPlayer;
          }
          AccountContentDialog.field_ub = new PoolMatchController(UiComponent.field_Ab, new String[]{var3});
          stackIn_117_0 = (!Atan2Support.field_a) ? 0 : 1;
          var4Lifetime3 = stackIn_117_0;
          stackIn_119_0 = param1 - 3405;
          stackIn_119_1 = -1;
          stackIn_120_2 = (LobbyPlayerLookupSupport.isGuestOrFreeAccount(true)) ? 21 : 0;
          AccountCreationDialog.switchScreen(stackIn_119_0, stackIn_119_1, stackIn_120_2, var4Lifetime3 != 0);
          AppletUrlSupport.field_c = true;
        }
        if (GameRules.field_b == -8) {
          DebugSliderInputSupport.field_d = null;
          var3 = ResourceArchive.field_j;
          if (var3 == null) {
            var3 = ContextMenu.youPlayer;
          }
          stackIn_127_0 = null;
          stackIn_127_1 = null;
          stackIn_127_2 = LobbyPanelLayoutSupport.field_f;
          stackIn_127_3 = -1;
          stackIn_127_4 = 4;
          stackIn_127_5 = 0;
          stackIn_127_6 = 0;
          if (LookupProtocolSupport.field_e != 0) {
            stackIn_128_0 = null;
            stackIn_128_1 = null;
            stackIn_128_7 = false;
          } else {
            stackIn_128_0 = null;
            stackIn_128_1 = null;
            stackIn_128_7 = true;
          }
          AccountContentDialog.field_ub = new PoolMatchController(stackIn_127_2, stackIn_127_3, stackIn_127_4, stackIn_127_5, stackIn_127_6, stackIn_128_7, new String[]{var3}, 0, false);
          stackIn_131_0 = (!Atan2Support.field_a) ? 0 : 1;
          var4Lifetime4 = stackIn_131_0;
          stackIn_133_0 = -3405;
          stackIn_133_1 = -1;
          stackIn_134_2 = (!LobbyPlayerLookupSupport.isGuestOrFreeAccount(true)) ? 0 : 21;
          AccountCreationDialog.switchScreen(stackIn_133_0, stackIn_133_1, stackIn_134_2, var4Lifetime4 != 0);
          AppletUrlSupport.field_c = true;
        }
        if (GameRules.field_b == -4) {
          JaggrabDownloader.field_j.writeCipheredOpcode(false, 9);
          AlternateLongAndTextLoginPayload.field_p = true;
          GameRules.field_b = MatchingTextValidator.field_w;
          DateInputWidget.field_U = BufferedFile.field_h;
        }
        if (GameRules.field_b == -5) {
          AccountCreationForm.sendLobbyGameCancellation(HighscoresScreen.field_L.getGameId(20872), true, 11);
          GameRules.field_b = MatchingTextValidator.field_w;
          LoginRequiredScreen.field_H = true;
        }
        if (param1 != 0) {
          field_Q = -123L;
        }
    }

    public static void releasePoolStatics(boolean param0) {
        field_L = null;
        field_P = null;
        muChatLobbyHide = null;
        field_J = null;
        field_N = null;
        field_I = null;
        if (param0) {
          muChatLobbyHide = (String) null;
        }
        potBallsInAnyOrderFinishOnBlack = null;
    }

    final void paintFrame(byte param0) {
        int stackIn_49_0 = 0;
        boolean stackIn_50_1 = false;
        int var3_int;
        AchievementNotice var3;
        int var4_int;
        long var4;
        int var5;
        long var6;
        int var8;
        int var9;
        int var10;
        java.awt.Canvas var11;
        int var3_intLifetime1;
        int var4_intLifetime1;
        int var4_intLifetime2;
        var10 = field_O;
        var11 = TextLineLayout.getActiveCanvas((byte) -126);
        if (StartupInterfaceSupport.a((byte) -123)) {
          KeyHandler.drawStartupScreen((byte) -55, AccountCreationDialog.hasCanvasFocus(0), var11);
          return;
        }
        if (!MeshSymmetrySupport.field_d) {
          ModelTableScene.a(true, var11);
          return;
        }
        if (param0 != 120) {
          return;
        }
        if (!PoolMatchController.hasAccountDataOrGuestMode(false)) {
          KeyHandler.setLoadingProgress(SoundCache.loadingExtradata, 100.0f, false);
          ModelTableScene.a(true, var11);
          return;
        }
        if (!DebugTuningSupport.field_g &&
          MatchingTextValidator.field_w != GameRules.field_b) {
          if (MatchingTextValidator.field_w == -2) {
            PlasmaBallSkin.drawActiveScreen(GameRules.field_b, -21972, false, AppletUrlSupport.field_c);
            var3_int = 32 - ThemeSelectScreen.field_P;
            ChatMessage.field_l.drawShadedGrayscale(0, 0, (var3_int << 8) / 32);
          } else if (-2 == GameRules.field_b) {
            PlasmaBallSkin.drawActiveScreen(MatchingTextValidator.field_w, -21972, false, TranslatedUiText.field_d);
            ChatMessage.field_l.drawShadedGrayscale(0, 0, (ThemeSelectScreen.field_P << 8) / 32);
          } else {
            var3_int = TextureCache.projectTablePointX(ThemeSelectScreen.field_P, 32, 108);
            SoftwareRasterizer.setClip(0, 0, var3_int, SoftwareRasterizer.height);
            TriangleRasterizer.useRasterClip();
            TriangleRasterizer.setProjectionCenter(320, 240);
            PlasmaBallSkin.drawActiveScreen(GameRules.field_b, -21972, false, AppletUrlSupport.field_c);
            SoftwareRasterizer.setClip(var3_int, 0, SoftwareRasterizer.width, SoftwareRasterizer.height);
            TriangleRasterizer.useRasterClip();
            TriangleRasterizer.setProjectionCenter(320, 240);
            PlasmaBallSkin.drawActiveScreen(MatchingTextValidator.field_w, -21972, false, TranslatedUiText.field_d);
            SoftwareRasterizer.resetClip();
            TriangleRasterizer.useRasterClip();
            BrowserCookieWriter.drawBallPreview(true, 32, ThemeSelectScreen.field_P);
          }
        } else {
          PlasmaBallSkin.drawActiveScreen(MatchingTextValidator.field_w, -21972, true, TranslatedUiText.field_d);
        }
        if (!TranslatedUiText.field_d ||
          !AppletUrlSupport.field_c) {
          if (GameRules.field_b == MatchingTextValidator.field_w &&
            MatchingTextValidator.field_w == -2) {
            ChatMessage.field_l.drawAt(0, 0);
          }
          ViewportController.drawInterfaceOverlays(InputIdleSupport.isCaretBlinkOn((byte) 79), (byte) 50);
        }
        if (DebugTuningSupport.field_g) {
          if (MatchingTextValidator.field_w < 0) {
            SoftwareRasterizer.clear();
          } else {
            DisplayModeSupport.field_c[MatchingTextValidator.field_w].drawScreen(87);
            SoftwareRasterizer.darkenRectangle(0, 0, SoftwareRasterizer.width, SoftwareRasterizer.height);
          }
          var3_intLifetime1 = SoftwareRasterizer.width - 400 >> 1;
          var4_int = SoftwareRasterizer.height - 140 >> 1;
          LogoMaterial.drawNineSlice(MeshSymmetrySupport.field_g, (byte) 14, 400, var3_intLifetime1, var4_int, 140);
          FreePlayRules.field_e.drawParagraph(LobbyGame.field_gc.field_l, 20 + var3_intLifetime1, 20 + var4_int, 360, 64, 1, -1, 1, 1, 0);
          SoftwareRasterizer.fillRectangle(20 + var3_intLifetime1, -20 + (140 + (var4_int - 20)), 360, 20, 0);
          SoftwareRasterizer.fillRectangle(20 + (var3_intLifetime1 + 2), -20 + (140 + var4_int) - 18, LobbyGame.field_gc.field_H * 356 / (LobbyGame.field_gc.field_G - 1), 16, 16615680);
        }
        var3 = (AchievementNotice) (LoginForm.field_U.last((byte) -102));
        if (var3 != null) {
          var5 = IntrusiveDequeCursor.field_h;
          if (var5 < 80) {
            var4_intLifetime1 = -32 + var5 / 2;
          } else {
            if (var5 >= 230) {
              var4_intLifetime1 = 123 - var5 / 2;
            } else {
              var4_intLifetime1 = 8;
            }
          }
          IsaacCipher.field_f[var3.field_l].drawScaled(8, var4_intLifetime1, 32, 32);
          FreePlayRules.field_e.drawLeft(RenderingInitializationSupport.achievementNames[var3.field_l], 48, var4_intLifetime1 + FreePlayRules.field_e.maxAscent, 4, 1);
        }
        if (LookupQuery.isClientNoticeOpen(1)) {
          SoftwareRasterizer.darkenRectangle(0, 0, SoftwareRasterizer.width, SoftwareRasterizer.height);
          TutorialController.drawClientNotice(-29322);
        }
        if (StartupInterfaceSupport.a(param0 - 109)) {
          stackIn_49_0 = -82;
          if (null == MatchingTextValidator.field_u) {
            stackIn_50_1 = MeshBase.field_e;
          } else {
            stackIn_50_1 = true;
          }
          ContentTransitionDialog.drawAccountOverlay(stackIn_49_0, stackIn_50_1);
        } else {
          if (RenderingInitializationSupport.isLoginRequiredPromptOpen((byte) -84) &&
            !LookupQuery.isClientNoticeOpen(1)) {
            SoftwareRasterizer.darkenRectangle(0, 0, SoftwareRasterizer.width, SoftwareRasterizer.height);
            NanoTickClock.drawSharedChoicePanel(1527590113);
          }
        }
        if (EmailAvailabilityValidator.field_o != EmailAvailabilityValidator.field_s) {
          var4_intLifetime2 = IntrusiveNodeHashTable.field_m * 256 / 16;
          if (var4_intLifetime2 > 0) {
            SoftwareRasterizer.fillRectangleAlpha(0, 0, SoftwareRasterizer.width, SoftwareRasterizer.height, 0, var4_intLifetime2);
          }
        }
        if ((32L & LinkButtonPainter.field_i) != 0L) {
          CollisionContact.field_h.drawLeft(Integer.toString(LookupProtocolSupport.field_g), 640 - CollisionContact.field_h.maxAscent * 2, 475 - CollisionContact.field_h.maxDescent, 16777215, 1);
        }
        if ((LinkButtonPainter.field_i & 64L) != 0L) {
          var4 = Runtime.getRuntime().totalMemory();
          var6 = Runtime.getRuntime().freeMemory();
          var8 = (int)(var4 - var6) / 1024;
          var9 = (int)(var4 / 1024L);
          CollisionContact.field_h.drawLeft(var8 + "/" + var9, -((CollisionContact.field_h.maxAscent + CollisionContact.field_h.maxDescent) * 4) + (640 - 2 * CollisionContact.field_h.maxAscent), -((CollisionContact.field_h.maxDescent + CollisionContact.field_h.maxAscent) * 3 / 2) - 5 + 480 - CollisionContact.field_h.maxDescent, 16777215, 1);
        }
        ButtonWidget.drawRasterToCanvas(0, 0, (byte) 85, var11);
        return;
    }

    final void releaseAllStatics(byte param0) {
        Pool.releasePoolStatics(false);
        TriangleRasterizer.releaseStatics();
        TextureCache.releaseStatics(param0 ^ -3723);
        AchievementNotice.releaseStatics((byte) -101);
        IntrusiveDeque.releaseStatics(-102);
        ArchiveAvailabilitySupport.releaseStatics(-75);
        BeveledFrameSpriteFactory.releaseStatics(param0 ^ 41);
        ClientUiResourceState.releaseStatics(19545);
        UiComponentNode.releaseStatics(116);
        RenderingInitializationSupport.releaseStatics(true);
        SupportPageLauncher.releaseStatics((byte) -71);
        BallSkin.releaseStatics(-22799);
        CueStick.releaseStatics((byte) -93);
        ScreenProjectionSupport.releaseStatics(0);
        TableScene.releaseStatics(-15631);
        TikiTableScene.releaseStatics(112);
        PolarTableScene.clearSharedReferences((byte) 76);
        MenuScreen.releaseStatics((byte) 107);
        MessageScreen.releaseStatics(false);
        KeyHandler.releaseStatics(-1);
        IntegerRecordProtocolSupport.releaseStatics(false);
        GradientPaletteSupport.releaseStatics(24470);
        NameNormalizationSupport.releaseStatics((byte) 101);
        NetworkGameClient.releaseStatics(true);
        ClientException.releaseStatics(param0 ^ -28);
        GameApplet.releaseStatics((byte) -77);
        JaggrabDownloader.releaseStatics(true);
        MouseHandler.releaseStatics((byte) -109);
        MouseWheelInput.releaseStatics((byte) 35);
        SoftwareRasterizer.releaseStatics();
        ResourceArchive.releaseStatics(0);
        PacketBuffer.releaseStatics(4109);
        MonotonicClock.releaseStatics(-125);
        LoginEncryptionSupport.releaseStatics((byte) 112);
        RankingsProtocolSupport.releaseStatics((byte) 118);
        CanvasInputAttachmentSupport.releaseStatics((byte) 123);
        TransformRotationSupport.releaseStatics((byte) 80);
        Cp1252DecodingSupport.releaseStatics(0);
        LoginPayloadFactory.releaseStatics(0);
        CookieDateSupport.releaseStatics(param0 + 39);
        RatingTextState.releaseStatics((byte) -69);
        ChatMessage.releaseStatics(param0 ^ -28);
        FixedPointVectorSupport.releaseStatics(param0 ^ -1430775244);
        SpriteResourceSupport.releaseStatics((byte) 124);
        TickClock.releaseStatics((byte) 111);
        RasterBuffer.releaseStatics(-26830);
        ArchiveLoadSequence.releaseStatics((byte) 126);
        FullscreenFocusCanvas.releaseStatics(255);
        ViewportController.releaseStatics(-44);
        Js5Transport.releaseStatics(117);
        DiskCacheWorker.releaseStatics(10);
        Js5ArchiveManager.releaseStatics((byte) 84);
        BufferedFile.releaseStatics((byte) -42);
        BufferedSocket.releaseStatics(true);
        DisplayModeSupport.releaseStatics(-1);
        MeshBoundsSupport.releaseStatics((byte) -110);
        MenuSelectionSupport.releaseStatics((byte) -107);
        AccountMenuText.releaseStatics((byte) -43);
        UiComponent.releaseStatics((byte) 8);
        PackedColorSupport.releaseStatics(28882);
        AppletContainerSupport.releaseStatics(false);
        QuickChatMenuSupport.releaseStatics(-13679);
        MeshBuilder.releaseStatics();
        BitmapFont.releaseStatics();
        SoundCache.releaseStatics(param0 + 28774);
        PoolMatchController.releaseStatics(true);
        TranslatedUiText.releaseStatics(param0 + 28);
        IntrusiveNode.releaseStatics((byte) 115);
        MidiPcmStream.releaseStatics(-819201);
        IterableNodeHashTable.releaseStatics((byte) 91);
        MidiFileReader.releaseStatics();
        MidiNoteMixer.releaseStatics(-1);
        AudioOutput.releaseStatics();
        MusicCrossfadeStream.releaseStatics((byte) 75);
        AwtEventQueueSupport.releaseStatics(param0 + 28583);
        SharedRateScaleSupport.releaseStatics(-512);
        LobbyGame.releaseStatics((byte) -124);
        DualLinkNodeHashTable.releaseStatics((byte) -109);
        LobbyPlayer.releaseStatics((byte) -48);
        MembershipBenefitsLoader.releaseStatics((byte) -26);
        GrowableIntList.releaseStatics(false);
        IntrusiveDequeCursor.releaseStatics((byte) -5);
        DebugTuningSupport.releaseStatics(-1);
        ChatInputSupport.releaseStatics(15059);
        ProjectedLineSupport.releaseStatics((byte) -76);
        RasterStateSupport.releaseStatics((byte) 112);
        DebugOverlayLayoutSupport.releaseStatics(false);
        VertexProjectionSupport.releaseStatics(param0 - 23306);
        ShotRecord.releaseStatics((byte) 114);
        HalloweenBallSkin.releaseStatics((byte) -27);
        UsernameSuggestionSupport.releaseStatics(true);
        ChatMessageLine.releaseStatics(-24061);
        AchievementProtocolSupport.releaseStatics(63);
        TutorialController.releaseStatics(5);
        PoolGameModel.releaseStatics(10);
        CueAim.releaseStatics(param0 ^ 9401);
        CipherPacketBuffer.releaseStatics(true);
        Camera.releaseStatics(-13569);
        BallEvent.releaseStatics(false);
        IsaacCipher.releaseStatics(param0 ^ 81);
        Ball.releaseStatics((byte) -66);
        CushionSegment.releaseStatics((byte) 77);
        Pocket.releaseStatics(false);
        GameRules.releaseStatics(13);
        QuickChatNavigationSupport.releaseStatics(false);
        MenuSelection.releaseStatics(80);
        ArchiveIndex.releaseStatics(20592);
        GzipDecoder.releaseStatics((byte) -92);
        ArchiveProvider.releaseStatics((byte) -41);
        ArchiveBootstrapSupport.releaseStatics((byte) -125);
        DialogLayer.releaseStatics((byte) -47);
        AccountCreationDialog.releaseStatics(param0 + 33);
        ProgressDialog.releaseStatics(7585);
        AccountContentDialog.releaseStatics(-124);
        MessageDialog.clearSharedReferences((byte) -86);
        AccountCreationForm.releaseStatics((byte) 4);
        AccountWelcomePanel.releaseStatics(20868);
        LoginForm.clearSharedReferences(-31360);
        DisplayNamePanel.releaseStatics(false);
        LoginTextValue.releaseStatics(false);
        TransformSupport.releaseStatics((byte) -83);
        ProxyConnectorSupport.releaseStatics(127);
        ModelMesh.releaseStatics();
        ModelInstance.releaseStatics(75);
        BallDebugOverlay.releaseStatics((byte) 116);
        SharedWidgetLayoutSupport.releaseStatics(0);
        Quaternion.releaseStatics(param0 + 144);
        ModelTableScene.releaseStatics((byte) 117);
        SceneNode.releaseStatics(param0 ^ -9943);
        SpriteState.releaseStatics((byte) 11);
        DualLinkNode.releaseStatics(-3604);
        AppletUrlSupport.releaseStatics(param0 ^ -28);
        MirroredSceneSupport.releaseStatics(false);
        StateIconLabel.releaseStatics(-1);
        VerticalScrollbar.releaseStatics((byte) 118);
        ContextMenu.releaseStatics(126);
        ScrollPaneWithFooter.releaseStatics(true);
        PlayerContextMenu.releaseStatics((byte) -116);
        ScrollPane.releaseStatics(param0 + 28);
        ReportAbuseDialog.releaseStatics((byte) -93);
        Cp1252CharacterSupport.clearSharedReferences(-115);
        MenuLabelSupport.releaseStatics((byte) 108);
        AlignedIconLabel.releaseStatics((byte) -102);
        ReflectionRequestSupport.releaseStatics(true);
        ArchiveFactory.releaseStatics((byte) 62);
        Base37Support.releaseStatics((byte) 86);
        HuffmanCodec.releaseStatics(false);
        MenuScreenBase.releaseStatics(21546);
        LookupRetrySupport.releaseStatics(0);
        IndexedSpriteState.releaseStatics((byte) -118);
        NineSliceFrame.releaseStatics(false);
        LoginTextSupport.releaseStatics(-2182);
        GrowableIntListFactory.releaseStatics(62);
        StartupInterfaceSupport.releaseStatics(false);
        ReflectionReplySupport.releaseStatics(true);
        BirthDatePromptPanel.releaseStatics(100);
        WorldPointProjectionSupport.releaseStatics((byte) 33);
        QuickChatHelpDialog.releaseStatics(56);
        BrowserUrlSupport.releaseStatics(-69);
        RankingsBufferSupport.releaseStatics(1);
        SpriteSheetLoadSupport.releaseStatics((byte) 43);
        LoginPayloadKind.releaseStatics(param0 ^ -91);
        LoginPayload.releaseStatics(param0 ^ 17031);
        TabbedPane.releaseStatics(-1);
        NameEntryPopup.releaseStatics(false);
        AnimatedNotification.releaseStatics(param0 - 273542787);
        QuaternionRotationSupport.releaseStatics(param0 ^ -8380);
        LimitedRandomAccessFile.releaseStatics((byte) 126);
        ReflectionCheck.releaseStatics(true);
        SlidingPanelSupport.releaseStatics((byte) 87);
        LogoFinalFrameLoader.releaseStatics(11468);
        PacketDiagnosticsSupport.releaseStatics(param0 ^ 88);
        AudioService.releaseStatics(false);
        NineBallRules.releaseStatics(false);
        MeshBase.releaseStatics(116);
        FaceNormal.releaseStatics(1);
        VertexNormal.releaseStatics(false);
        LookupProtocolSupport.releaseStatics((byte) -101);
        ModernTableScene.releaseStatics((byte) 71);
        PlasmaTableScene.releaseStatics(param0 - 100);
        SpaceTableScene.releaseStatics((byte) -116);
        ClassicBallSkin.releaseStatics(1);
        BrowserCookieWriter.releaseStatics(param0 + 16034);
        PlasmaBallSkin.releaseStatics(120);
        TikiBallSkin.releaseStatics(10860);
        PolarBallSkin.releaseStatics(param0 ^ -20);
        KillerBallSkin.releaseStatics(85);
        ValueNoise.releaseStatics();
        OptionsScreen.releaseStatics((byte) -89);
        TimeTrialSelectScreen.releaseStatics(param0 - 73);
        PauseMenuScreen.releaseStatics(8);
        DimmedPauseMenu.releaseStatics(-79);
        HighscoresScreen.clearSharedReferences(-126);
        RankingsScreen.releaseStatics(0);
        InstructionsScreen.releaseStatics((byte) -90);
        AchievementsScreen.releaseStatics(false);
        LoginRequiredScreen.releaseStatics(false);
        MembershipBenefitsScreen.releaseStatics(true);
        LocalGameSetupScreen.releaseStatics((byte) 74);
        ThemeSelectScreen.clearSharedReferences(param0 ^ -506724219);
        TutorialSelectScreen.releaseStatics((byte) -103);
        SocketArchiveNetworkClient.releaseStatics(param0 ^ 80);
        DualLinkDeque.releaseStatics(true);
        SectorCacheStore.releaseStatics(true);
        DiskArchiveRequest.releaseStatics((byte) -80);
        CachedArchiveSource.releaseStatics(true);
        MeshColorSupport.releaseStatics((byte) -25);
        ArchiveRequest.releaseStatics(-121);
        LobbyPanelLayoutSupport.releaseStatics((byte) 105);
        FullscreenErrorDialog.releaseStatics((byte) -82);
        TextWidgetPainter.releaseStatics((byte) 119);
        VorbisSample.releaseStatics();
        TriangleMesh.releaseStatics(-47);
        FontPaletteSupport.releaseStatics((byte) -8);
        FixedAngleSupport.releaseStatics((byte) 45);
        PacketAvailabilitySupport.releaseStatics(25131);
        LobbyPlayerLookupSupport.releaseStatics((byte) -44);
        TutorialFactory.releaseStatics((byte) -90);
        DelegatingCanvas.releaseStatics((byte) 38);
        VertexTransformSupport.releaseStatics(0);
        IntKeyLookup.releaseStatics(-30521);
        ByteStorage.releaseStatics(4);
        Bzip2Decoder.releaseStatics();
        Bzip2DecoderState.releaseStatics(-8090);
        ByteArrayPool.releaseStatics(726237729);
        PoolUiText.releaseStatics(param0 ^ 32);
        CheckboxPainter.releaseStatics(false);
        StatefulTextPainter.releaseStatics(true);
        DialRenderer.releaseStatics(-1);
        MarkerSliderPainter.releaseStatics((byte) -108);
        if (param0 != -28) {
          field_P = (UiComponent) null;
        }
        TextLayout.releaseStatics(0);
        UiWidget.releaseStatics((byte) 80);
        ButtonWidget.releaseStatics((byte) 72);
        SingleChildWidget.releaseStatics(param0 ^ -80);
        ResizableDialog.releaseStatics((byte) -16);
        FadingDialog.releaseStatics(-1);
        WidgetContainer.releaseStatics(2);
        NineSliceFrameSupport.releaseStatics((byte) 13);
        VorbisFloor1.releaseStatics();
        InputIdleSupport.releaseStatics(true);
        ChatReplacementSupport.releaseStatics(0);
        CompressedContainerSupport.releaseStatics(0);
        ChatPanelSupport.releaseStatics(param0 ^ -115);
        QuickChatMenu.releaseStatics(param0 ^ 99);
        QuickChatCategoryCache.releaseStatics((byte) -70);
        QuickChatPhraseRegistry.releaseStatics((byte) -62);
        QuickChatCategoryDefinition.releaseStatics(param0 - 89);
        QuickChatPhraseDefinition.releaseStatics((byte) -111);
        WeightedLruCache.releaseStatics((byte) 0);
        SocketConnector.releaseStatics(param0 + 16885);
        ProxyAuthenticationRequiredException.releaseStatics(param0 + 149);
        NanoTickClock.releaseStatics((byte) 122);
        ImageProducerRasterBuffer.releaseStatics(2);
        ShotPreviewState.releaseStatics(-24420);
        FullscreenDisplayMode.releaseStatics(true);
        WhirlpoolHasher.releaseStatics(8);
        SoundTone.releaseScratch();
        ByteArrayNode.releaseStatics((byte) 127);
        ChoiceButtonSupport.releaseStatics(true);
        LogoJingleLoader.releaseStatics(101);
        DebugTuningSlider.releaseStatics((byte) 8);
        DebugSliderInputSupport.releaseStatics(param0 ^ 20983);
        EightBallRules.releaseStatics((byte) -75);
        KillerRules.releaseStatics((byte) -104);
        MusicPatch.releaseStatics(5893);
        MusicPatchEnvelope.releaseStatics(104);
        FreePlayRules.releaseStatics((byte) -105);
        TimeTrialRules.releaseStatics(-9);
        BirthDateValidator.releaseStatics((byte) -119);
        BirthDateInputWidget.releaseStatics(true);
        ArrayWidgetGroup.releaseStatics(16);
        AccountDisplayNameSupport.releaseStatics(false);
        LabeledChildWidget.releaseStatics((byte) -85);
        TextInputWidget.releaseStatics((byte) 23);
        ContentTransitionDialog.releaseStatics((byte) -45);
        ProgressBarWidget.releaseStatics(true);
        UsernameSuggestionsPanel.releaseStatics(160);
        ValidationIconWidget.releaseStatics((byte) -69);
        ValidationMessageWidget.releaseStatics(-110);
        CheckboxWidget.releaseStatics(param0 + 117);
        TextInputValidator.releaseStatics((byte) 122);
        MeshSymmetrySupport.releaseStatics((byte) -20);
        Under13NoticePanel.releaseStatics(122);
        DialWidget.releaseStatics((byte) 121);
        MultiHandleSliderWidget.releaseStatics(2);
        AccountTextSupport.releaseStatics(true);
        DateInputWidget.releaseStatics(-12253);
        LoginRequestSupport.releaseStatics(param0 + 133);
        BitmapTextLayout.releaseStatics(-13268);
        DirectByteStorage.releaseStatics(125);
        DraggableWidget.releaseStatics(-34);
        DropTargetWidget.releaseStatics(120);
        IntrusiveNodeHashTable.releaseStatics(param0 - 69);
        IterableDualLinkDeque.releaseStatics(14676);
        CacheEntry.releaseStatics(1);
        QuickChatDynamicCommand.releaseStatics((byte) -103);
        StrongCacheEntry.releaseStatics(param0 ^ -28);
        ProxySocketConnector.releaseStatics(15296);
        AudioFilter.releaseStatics();
        PaletteFontLoader.releaseStatics(param0 ^ -27);
        NodeHashTableIterator.releaseStatics(0);
        DualLinkDequeIterator.releaseStatics(19000);
        HighScoreRequest.releaseStatics(param0 + 136);
        HighScoreSubmission.releaseStatics(-19382);
        ScoreboardNameRecord.releaseStatics(-10562);
        RankingsRequest.releaseStatics((byte) 124);
        PlayingSound.releaseStatics(-1);
        PolarObject.releaseStatics(false);
        LookupQuery.releaseStatics(param0 - 4275);
        ThreeSliceButtonPainter.releaseStatics(-1);
        LinkButtonPainter.releaseStatics(true);
        TextInputPainter.releaseStatics((byte) -37);
        PasswordInputPainter.releaseStatics(2);
        ButtonPainter.releaseStatics(16);
        OpacityWidget.releaseStatics((byte) 118);
        SocialListEntry.releaseStatics((byte) -105);
        ArchiveLoadStep.releaseStatics((byte) -110);
        TextHotspotRegion.releaseStatics(true);
        AccountStateQuery.releaseStatics(param0 ^ -28);
        AchievementSubmission.releaseStatics((byte) 73);
        AvailabilityQueryResult.releaseStatics((byte) 83);
        ServerListLauncher.releaseStatics(-54);
        DelayedServerPacket.releaseStatics((byte) 69);
        PotEvent.releaseStatics((byte) 90);
        ShotEvent.releaseStatics(param0 - 2020);
        ProjectedVertex.releaseStatics(240);
        TutorialStep.releaseStatics(-5917);
        AimTarget.releaseStatics((byte) 115);
        AccountProtocolStage.releaseStatics(false);
        LoginResponse.releaseStatics(72);
        MessageDialogContent.releaseStatics(-124);
        GlowSprite.releaseStatics(10);
        SceneNodeEntry.releaseStatics(0);
        RasterSnapshot.releaseStatics((byte) 5);
        LoginMethod.releaseStatics(-26458);
        LongAndTextLoginPayload.releaseStatics(param0 - 1431655738);
        AlternateLongAndTextLoginPayload.releaseStatics(true);
        TextPairLoginPayload.releaseStatics(17518);
        GlowParticle.releaseStatics((byte) 113);
        ParticleTrail.releaseStatics(false);
        Atan2Support.releaseStatics((byte) 79);
        WireframeQuad.releaseStatics(127);
        SpaceObject.releaseStatics(true);
        CanvasInputSupport.releaseStatics(param0 ^ 23);
        IntLookupQuery.clearSharedReferences(59);
        IntegerRecordSubmission.releaseStatics((byte) -124);
        ModelOriginSupport.releaseStatics(param0 ^ -27827);
        ByteRecordSubmission.releaseStatics((byte) -103);
        WidgetStyleLayer.releaseStatics((byte) 8);
        TextLineLayout.releaseStatics(param0 ^ 27721);
        CollisionContact.releaseStatics(param0 - 13237);
        IntegerSyntaxSupport.releaseStatics((byte) 43);
        DebouncedValidationProvider.releaseStatics(-1);
        UsernameAvailabilityValidator.releaseStatics(-110);
        PasswordValidator.releaseStatics(true);
        EmailValidator.releaseStatics((byte) 113);
        EmailAvailabilityValidator.releaseStatics(true);
        AgeValidator.releaseStatics(true);
        MatchingTextValidator.releaseStatics((byte) 15);
        ClientInputResetSupport.releaseStatics(param0 ^ -94);
        HotspotRectangle.releaseStatics((byte) 33);
        BrowserCookieSupport.releaseStatics((byte) -13);
        this.field_t = null;
    }

    final void initializeGame(byte param0) {
        this.initializeFramework(5, 19, 0, 2, 1, false, 61, 1);
        MidiPcmStream var3 = new MidiPcmStream();
        ThemeSelectScreen.initializeAudioOutputs((java.awt.Component) ((Object) TimeTrialSelectScreen.field_K), var3, 22050, StatefulTextPainter.field_s, 10282, true);
        this.configureAccountResponses(param0 ^ 45, false, true, true, true, false, true);
        EmailValidator.field_m[78] = 8;
        LoginPayload.field_f = ScrollPane.field_Lb[2];
        ChatPanelSupport.field_a = ScrollPane.field_Lb[0];
        EmailValidator.field_m[73] = 1;
        EmailValidator.field_m[75] = 5;
        EmailValidator.field_m[77] = 1;
        EmailValidator.field_m[79] = 0;
        EmailValidator.field_m[74] = -1;
        EmailValidator.field_m[64] = -2;
        EmailValidator.field_m[67] = 7;
        EmailValidator.field_m[65] = -2;
        EmailValidator.field_m[69] = 1;
        DelayedServerPacket.field_n = 2;
        if (param0 != -46) {
          this.init();
        }
        EmailValidator.field_m[76] = 8;
        EmailValidator.field_m[68] = 9;
        LookupProtocolSupport.field_e = ScrollPane.field_Lb[3];
        EmailValidator.field_m[71] = 1;
        EmailValidator.field_m[10] = -1;
        EmailValidator.field_m[70] = 1;
        EmailValidator.field_m[72] = 1;
        DialWidget.field_W = ScrollPane.field_Lb[1];
        EmailValidator.field_m[9] = -1;
        ClientException.field_g = MenuSelectionSupport.createEmptyGameStateWords(-95);
        SupportPageLauncher.field_c = MenuSelectionSupport.createEmptyGameStateWords(5);
    }

    private final void fetchArchives(byte param0) {
        if (GameApplet.field_m != null) {
          PoolUiText.applyLocalizedTexts(GameApplet.field_m, -8);
          GameApplet.field_m = null;
          ArrayWidgetGroup.resetFrameTiming(0);
        }
        if (param0 > -103) {
          this.initializeGame((byte) -93);
        }
        ArchiveFactory.field_b = ArchiveFactory.createResourceArchive(3, (byte) 103);
        InputIdleSupport.field_a = ArchiveFactory.createResourceArchive(4, (byte) 103);
        ViewportController.field_q = ArchiveFactory.createResourceArchive(6, (byte) 103);
        Ball.field_z = ArchiveFactory.createResourceArchive(7, (byte) 103);
        WeightedLruCache.field_d = ArchiveFactory.createResourceArchive(8, (byte) 103);
        CanvasInputSupport.field_b = ArchiveFactory.createResourceArchive(9, (byte) 103);
        UsernameSuggestionSupport.field_g = ArchiveFactory.createResourceArchive(10, (byte) 103);
        AppletUrlSupport.field_a = ArchiveFactory.createResourceArchive(11, (byte) 103);
        DisplayModeSupport.field_a = ArchiveFactory.createResourceArchive(12, (byte) 103);
        NetworkGameClient.field_F = ArchiveFactory.createResourceArchive(13, (byte) 103);
        MonotonicClock.field_h = ArchiveFactory.createResourceArchive(18, (byte) 103);
        OpacityWidget.setMembershipBenefitsArchives(Under13NoticePanel.field_R, (byte) -32, QuickChatMenu.field_Zb);
    }

    private final void processIncomingPackets(int obfuscationGuard) {
        int var6_int = 0;
        int var7_int = 0;
        int stackIn_49_0 = 0;
        int stackIn_52_0 = 0;
        PoolMatchController stackIn_57_0;
        PoolMatchController stackIn_57_1;
        int stackIn_57_2;
        int stackIn_57_3;
        int stackIn_57_4;
        int stackIn_57_5;
        int stackIn_57_6;
        PoolMatchController stackIn_58_0 = null;
        PoolMatchController stackIn_58_1 = null;
        boolean stackIn_58_7 = false;
        int stackIn_101_0 = 0;
        int stackIn_101_1 = 0;
        int stackIn_102_2 = 0;
        Object var2;
        int var2_int;
        int var3;
        int var4;
        CipherPacketBuffer var4_ref_oq;
        int[] var4_ref_int__;
        Object var4_ref;
        int var5;
        String[] var6;
        PoolMatchController var7;
        int var8;
        int[] var9;
        int[] var10;
        int[] var11;
        int[] var12;
        Object var13;
        int[] var14;
        Object var15;
        int[] var16;
        int[] var17;
        Object var18;
        Object var19;
        Object var20;
        int[] var21;
        int[] var22;
        int[] var23;
        int[] var24;
        int var3Lifetime1;
        int var3Lifetime2;
        int var5Lifetime1;
        Object var2Lifetime1;
        Object var4_refLifetime1;
        int var5Lifetime2;
        int var5Lifetime3;
        int var5Lifetime4;
        var8 = field_O;
        if (obfuscationGuard != 3) {
          field_Q = -116L;
        }
        while (true) {
          if (!HuffmanCodec.pollServerPacket(0, EmailValidator.field_m)) {
            MusicCrossfadeStream.flushPacketsWithSimulatedDelay((byte) -20, 0);
            return;
          }
          if (Bzip2DecoderState.field_c == 9) {
            PoolGameModel.applyPendingScreenTransition(-124);
            AlternateLongAndTextLoginPayload.field_p = false;
            GameRules.field_b = 20;
            ThreeSliceButtonPainter.field_B = PlayerContextMenu.field_e.readNullTerminatedString(-49);
            continue;
          }
          if (Bzip2DecoderState.field_c == 14) {
            PoolGameModel.applyPendingScreenTransition(-124);
            SharedWidgetLayoutSupport.initializeLobbyCollections(PackedColorSupport.getAccountDialogContent((byte) 1), 1024, AccountCreationForm.getLobbyGamePlayersContent((byte) 103), 150, ByteArrayNode.field_p, ByteArrayNode.nextPowerOfTwo(-17931, 8), ByteArrayNode.nextPowerOfTwo(-17931, 2000), SpaceTableScene.getChatScrollContent(true), 4, 13162);
            NineSliceFrameSupport.initializeSocialListContainers(LobbyPlayer.getNamePopupContent(0), VerticalScrollbar.getIgnoreListContent((byte) 13), -36);
            AlternateLongAndTextLoginPayload.field_p = false;
            LookupProtocolSupport.field_b = true;
            Base37Support.field_d = true;
            GameRules.field_b = -2;
            MidiNoteMixer.field_r = 0;
            continue;
          }
          if (15 == Bzip2DecoderState.field_c) {
            if (Base37Support.field_d) {
              PoolGameModel.applyPendingScreenTransition(obfuscationGuard - 127);
              DialogLayer.closeInputOverlays(true);
              IntrusiveDeque.clearChatHistory((byte) 74);
              GameRules.field_b = 0;
              TransformSupport.field_e = false;
              ContextMenu.field_Sb = true;
              Base37Support.field_d = false;
              AppletUrlSupport.field_c = false;
              MidiNoteMixer.field_v = false;
              ClientUiResourceState.field_a = true;
              TextWidgetPainter.closeChatCompositionPanel(120);
            }
            AlternateLongAndTextLoginPayload.field_p = false;
            LoginRequiredScreen.field_H = false;
            continue;
          }
          if (Bzip2DecoderState.field_c == 10 &&
            Base37Support.field_d) {
            MonotonicClock.handleSocialListUpdate(obfuscationGuard ^ 70);
            continue;
          }
          if (Bzip2DecoderState.field_c == 74) {
            var22 = MenuSelectionSupport.createEmptyGameStateWords(-8);
            var17 = var22;
            var2 = var17;
            var9 = (int[]) var2;
            var4_ref_oq = PlayerContextMenu.field_e;
            var5 = ((PacketBuffer) ((Object) var4_ref_oq)).readUnsignedByte(-100);
            for (var6_int = 0; var6_int < var5; var6_int++) {
              var9[var6_int] = ((PacketBuffer) ((Object) var4_ref_oq)).readInt(true);
            }
            var10 = (int[]) var2;
            var21 = ClientException.field_g;
            var16 = var21;
            var11 = var16;
            var4_ref_int__ = var11;
            for (var5Lifetime2 = 0; var5Lifetime2 < 8; var5Lifetime2++) {
              var10[var5Lifetime2] = ArchiveLoadSequence.bitwiseAnd(var10[var5Lifetime2], ~var21[var5Lifetime2]);
            }
            if (HighscoresScreen.field_K) {
              for (var3 = 0; var3 < RenderingInitializationSupport.achievementNames.length; var3++) {
                if (ButtonWidget.isBitSet(var22, obfuscationGuard ^ -13670, var3)) {
                  LoginForm.field_U.addFirst((byte) -3, new AchievementNotice(var3));
                }
              }
            }
            var12 = ClientException.field_g;
            var23 = (int[]) var2;
            var18 = var23;
            var13 = var18;
            var4_ref = var13;
            for (var5Lifetime3 = 0; 8 > var5Lifetime3; var5Lifetime3++) {
              var12[var5Lifetime3] = RenderingInitializationSupport.bitwiseOr(var12[var5Lifetime3], var23[var5Lifetime3]);
            }
            var14 = SupportPageLauncher.field_c;
            var24 = (int[]) var2;
            var19 = var24;
            var15 = var19;
            var4_refLifetime1 = var15;
            for (var5Lifetime4 = 0; var5Lifetime4 < 8; var5Lifetime4++) {
              var14[var5Lifetime4] = RenderingInitializationSupport.bitwiseOr(var14[var5Lifetime4], var24[var5Lifetime4]);
            }
            continue;
          }
          if (Bzip2DecoderState.field_c != 65 &&
            Bzip2DecoderState.field_c != 64) {
            if (Bzip2DecoderState.field_c == 66) {
              if (MidiNoteMixer.field_v ||
                TransformSupport.field_e) {
                PoolGameModel.applyPendingScreenTransition(obfuscationGuard + 108);
                if (MidiNoteMixer.field_v) {
                  AccountContentDialog.field_ub.openInGameMenu(obfuscationGuard ^ 259, false);
                }
                TransformSupport.field_e = false;
                GameRules.field_b = -2;
                MidiNoteMixer.field_r = 0;
                AppletUrlSupport.field_c = false;
                MidiNoteMixer.field_v = false;
                ContextMenu.field_Sb = true;
                LookupProtocolSupport.field_b = true;
                TextWidgetPainter.closeChatCompositionPanel(116);
              }
              LoginRequiredScreen.field_H = false;
              continue;
            }
            var2Lifetime1 = null;
            if (!MidiNoteMixer.field_v) {
              if (TransformSupport.field_e) {
                var2Lifetime1 = TextWidgetPainter.field_e;
              }
            } else {
              var2Lifetime1 = AccountContentDialog.field_ub;
            }
            if (var2Lifetime1 != null) {
              if (Bzip2DecoderState.field_c == 79) {
                ((PoolMatchController) (var2Lifetime1)).handleStartTurnPacket(true);
                continue;
              }
              if (Bzip2DecoderState.field_c == 67) {
                ((PoolMatchController) (var2Lifetime1)).readGameStateSync(PlayerContextMenu.field_e, false);
                continue;
              }
              if (Bzip2DecoderState.field_c == 68) {
                ((PoolMatchController) (var2Lifetime1)).readMovePacket(PlayerContextMenu.field_e, 0);
                continue;
              }
              if (Bzip2DecoderState.field_c == 76) {
                ((PoolMatchController) (var2Lifetime1)).readRemoteCueAim(PlayerContextMenu.field_e, false);
                continue;
              }
              if (Bzip2DecoderState.field_c == 78) {
                ((PoolMatchController) (var2Lifetime1)).readBallManhandled(69, PlayerContextMenu.field_e);
                continue;
              }
              if (Bzip2DecoderState.field_c == 75) {
                ((PoolMatchController) (var2Lifetime1)).readEndShotPacket(96, PlayerContextMenu.field_e);
                continue;
              }
              if (Bzip2DecoderState.field_c == 77) {
                ((PoolMatchController) (var2Lifetime1)).readEndResolutionPacket(4096, PlayerContextMenu.field_e);
                continue;
              }
              if (Bzip2DecoderState.field_c == 69) {
                var3Lifetime1 = PlayerContextMenu.field_e.readByte((byte) 105);
                ((PoolMatchController) (var2Lifetime1)).gameModel.finishGame(obfuscationGuard - 14289, var3Lifetime1);
                if (((PoolMatchController) (var2Lifetime1)).localPlayerIndex == var3Lifetime1) {
                  LobbyGame.field_gc.playTableSound(17, 256, (byte) -121, 128);
                } else {
                  LobbyGame.field_gc.playTableSound(18, 256, (byte) -114, 128);
                }
                var20 = var2Lifetime1;
                stackIn_101_0 = -3405;
                stackIn_101_1 = -1;
                if (LobbyPlayerLookupSupport.isGuestOrFreeAccount(true)) {
                  stackIn_102_2 = 21;
                } else {
                  stackIn_102_2 = 0;
                }
                AccountCreationDialog.switchScreen(stackIn_101_0, stackIn_101_1, stackIn_102_2, false);
                ((PoolMatchController) (var20)).resetView(-23095);
                if ((LobbyPanelLayoutSupport.field_f & ((PoolMatchController) (var20)).modeFlags) == 0) {
                  continue;
                }
                MatchingTextValidator.field_w = 23;
                GameRules.field_b = 23;
                continue;
              }
              if (Bzip2DecoderState.field_c == 70) {
                ((PoolMatchController) (var2Lifetime1)).gameModel.field_x = PlayerContextMenu.field_e.readUnsignedByte(obfuscationGuard ^ -92);
                if (AccountContentDialog.field_ub == null) {
                  continue;
                }
                IterableNodeHashTable.updateDrawOfferLabel(false);
                continue;
              }
              if (Bzip2DecoderState.field_c == 71) {
                ((PoolMatchController) (var2Lifetime1)).gameModel.field_p = PlayerContextMenu.field_e.readUnsignedByte(obfuscationGuard - 63);
                ((PoolMatchController) (var2Lifetime1)).gameModel.field_x = ((PoolMatchController) (var2Lifetime1)).gameModel.field_x & ~((PoolMatchController) (var2Lifetime1)).gameModel.field_p;
                continue;
              }
              if (Bzip2DecoderState.field_c == 72) {
                ((PoolMatchController) (var2Lifetime1)).gameModel.field_b = PlayerContextMenu.field_e.readUnsignedByte(obfuscationGuard - 119);
                if (AccountContentDialog.field_ub == null) {
                  continue;
                }
                ModernTableScene.refreshRematchMenuLabel((byte) -119);
                continue;
              }
              if (73 == Bzip2DecoderState.field_c) {
                ((PoolMatchController) (var2Lifetime1)).field_cb = PlayerContextMenu.field_e.readUnsignedByte(-105);
                ((PoolMatchController) (var2Lifetime1)).gameModel.field_b = ((PoolMatchController) (var2Lifetime1)).gameModel.field_b & ~((PoolMatchController) (var2Lifetime1)).field_cb;
                if (null == AccountContentDialog.field_ub) {
                  continue;
                }
                ModernTableScene.refreshRematchMenuLabel((byte) -119);
                continue;
              }
            }
            this.dispatchAccountPacket(15000);
            continue;
          }
          PoolGameModel.applyPendingScreenTransition(obfuscationGuard ^ -126);
          PlayerContextMenu.field_e.beginBitReading(8);
          var2_int = PlayerContextMenu.field_e.readBits(4, 52);
          if (var2_int == 15) {
            var2_int = -2;
          }
          ChatPanelSupport.field_a = PlayerContextMenu.field_e.readBits(3, obfuscationGuard ^ 38);
          DialWidget.field_W = PlayerContextMenu.field_e.readBits(2, 104);
          LoginPayload.field_f = PlayerContextMenu.field_e.readBits(3, 66);
          var3Lifetime2 = PlayerContextMenu.field_e.readBits(3, 78);
          LookupProtocolSupport.field_e = PlayerContextMenu.field_e.readBits(1, 70);
          stackIn_49_0 = (PlayerContextMenu.field_e.readBits(1, 21) != 1) ? 0 : 1;
          var4 = stackIn_49_0;
          stackIn_52_0 = (PlayerContextMenu.field_e.readBits(1, 111) != 1) ? 0 : 1;
          var5Lifetime1 = stackIn_52_0;
          PlayerContextMenu.field_e.endBitReading(8);
          var6 = new String[PlayerContextMenu.field_e.readUnsignedByte(obfuscationGuard ^ -70)];
          for (var7_int = 0; var7_int < var6.length; var7_int++) {
            var6[var7_int] = PlayerContextMenu.field_e.readString(TutorialFactory.bitwiseXor(obfuscationGuard, 10761));
          }
          DebugSliderInputSupport.field_d = null;
          stackIn_57_0 = null;
          stackIn_57_1 = null;
          stackIn_57_2 = TutorialController.field_c;
          stackIn_57_3 = ChatPanelSupport.field_a;
          stackIn_57_4 = DialWidget.field_W;
          stackIn_57_5 = LoginPayload.field_f;
          stackIn_57_6 = var3Lifetime2;
          if (LookupProtocolSupport.field_e != 0) {
            stackIn_58_0 = null;
            stackIn_58_1 = null;
            stackIn_58_7 = false;
          } else {
            stackIn_58_0 = null;
            stackIn_58_1 = null;
            stackIn_58_7 = true;
          }
          var7 = new PoolMatchController(stackIn_57_2, stackIn_57_3, stackIn_57_4, stackIn_57_5, stackIn_57_6, stackIn_58_7, var6, var2_int, var4 != 0);
          var7.loadStateSnapshot(16915, PlayerContextMenu.field_e);
          if (65 != Bzip2DecoderState.field_c) {
            TransformSupport.field_e = true;
            TextWidgetPainter.field_e = var7;
          } else {
            MidiNoteMixer.field_v = true;
            AccountContentDialog.field_ub = var7;
            IterableNodeHashTable.updateDrawOfferLabel(false);
            ModernTableScene.refreshRematchMenuLabel((byte) -119);
            CueAim.initializeSharedChatComponents((byte) -109);
          }
          LoginRequiredScreen.field_H = false;
          if (var5Lifetime1 != 0) {
            var7.introDelayTicks = -1;
          }
          AppletUrlSupport.field_c = true;
          GameRules.field_b = -1;
        }
    }

    public Pool() {
    }

    final static boolean handleKeyPress(int param0, int param1, int param2, int param3) {
        if (RankingsRequest.field_z) {
          return ThemeSelectScreen.field_J.dispatchKeyInputOrRequestFocus(-81, IterableDualLinkDeque.field_a, LoginMethod.field_b);
        }
        if (ArrayWidgetGroup.field_H) {
          return LoginPayloadKind.handleQuickChatKey(15585, param2, param1);
        }
        if (HighScoreSubmission.handleChatShortcut(param1, param2, -10)) {
          return true;
        }
        if (param3 != -80) {
          Pool.handleKeyPress(122, -100, -91, -77);
        }
        if (ViewportController.field_y) {
          return false;
        }
        return ChatInputSupport.handleChatKey(param1, param3 + 174, param0);
    }

    final void updateGame(byte param0) {
        boolean discarded$0 = false;
        int stackIn_5_1 = 0;
        boolean stackIn_6_2 = false;
        boolean stackIn_29_1 = false;
        int stackIn_71_0 = 0;
        int stackIn_71_1 = 0;
        int stackIn_72_2 = 0;
        int stackIn_75_0 = 0;
        int stackIn_75_1 = 0;
        int stackIn_76_2 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        AchievementSubmission var6;
        int var3Lifetime1;
        var5 = field_O;
        LogoMaterial.getKeyboardSnapshotCount(-21055);
        MessageDialogContent.field_P = PaletteFontLoader.getMouseIdleTicks((byte) 64);
        Bzip2DecoderState.a((byte) -92);
        if (MatchingTextValidator.field_u != null &&
          MatchingTextValidator.field_u.focusLost) {
          AccountStateQuery.leaveFullscreen((byte) -127);
          DropTargetWidget.showFocusLossNoticeIfOpen((byte) 96);
        }
        stackIn_5_1 = -4;
        stackIn_6_2 = (null != MatchingTextValidator.field_u);
        this.serviceFramework(stackIn_5_1, stackIn_6_2);
        if (FullscreenFocusCanvas.field_c) {
          this.fetchArchives((byte) -125);
          FullscreenFocusCanvas.field_c = false;
        }
        SocialListEntry.field_Tb = SocialListEntry.field_Tb + 1;
        var2 = 56 / ((param0 - 29) / 60);
        if (StartupInterfaceSupport.a((byte) -84)) {
          this.serviceStartupAndAccountFlow((byte) -75);
          if (StartupInterfaceSupport.a((byte) -111)) {
            if (!DebouncedValidationProvider.isAccountFlowReady(true)) {
              return;
            }
            discarded$0 = this.loadResources(95, false);
            return;
          }
        }
        if (!MeshSymmetrySupport.field_d) {
          ModelOriginSupport.processAccountDialogInput(0, CompressedContainerSupport.field_d);
          if (this.loadResources(82, true)) {
            MeshSymmetrySupport.field_d = true;
          }
        } else {
          if (!PoolMatchController.hasAccountDataOrGuestMode(false)) {
            ProjectedVertex.pollAccountStateRefresh(-26);
          } else {
            if (!LookupQuery.isClientNoticeOpen(1)) {
              if (!StartupInterfaceSupport.a(11)) {
                if (!RenderingInitializationSupport.isLoginRequiredPromptOpen((byte) -122)) {
                  if (!DebugTuningSupport.field_g) {
                    this.updateScreenTransition(false, 0);
                  } else {
                    LobbyGame.field_gc.buildSceneryLayers(2);
                    ArrayWidgetGroup.resetFrameTiming(0);
                    if (LobbyGame.field_gc.field_G == LobbyGame.field_gc.field_H) {
                      LobbyGame.field_gc.onSceneryTransitionComplete(16);
                      DebugTuningSupport.field_g = false;
                    }
                  }
                } else {
                  if (EmailAvailabilityValidator.field_s != EmailAvailabilityValidator.field_o) {
                    this.updateScreenTransition(false, 0);
                  } else {
                    var3 = RankingsScreen.pollSharedChoiceAction(8);
                    if (var3 == 1) {
                      WireframeQuad.field_x = true;
                      TranslatedUiText.requestLoginTransition(VertexProjectionSupport.pleaselogin, 0, (byte) 88);
                    }
                    this.updateScreenTransition(true, 0);
                  }
                }
              } else {
                stackIn_29_1 = (null != MatchingTextValidator.field_u);
                var3 = this.pollAccountActions(stackIn_29_1, false);
                if (1 != var3 &&
                  var3 != 2) {
                  this.updateScreenTransition(true, 0);
                } else {
                  if (MatchingTextValidator.field_u != null) {
                    AccountStateQuery.leaveFullscreen((byte) -101);
                  }
                  if (var3 != 2) {
                    this.updateScreenTransition(true, 0);
                  } else {
                    DualLinkNodeHashTable.openQuitPage(-1, NanoTickClock.getApplet(72));
                    this.updateScreenTransition(true, 0);
                  }
                }
              }
            } else {
              if (EmailAvailabilityValidator.field_s == EmailAvailabilityValidator.field_o) {
                var3 = SpaceTableScene.pollClientNoticeResult(-1);
                if (2 != var3) {
                  if (var3 != 3) {
                    if (var3 == 4) {
                      NineSliceFrame.field_c = true;
                      TranslatedUiText.requestLoginTransition(AppletUrlSupport.pleaseloginMember, 0, (byte) 78);
                    }
                    this.updateScreenTransition(true, 0);
                  } else {
                    NineSliceFrame.field_c = false;
                    AvailabilityQueryResult.requestFullscreen(-28038, true);
                    this.updateScreenTransition(true, 0);
                  }
                } else {
                  AccountStateQuery.leaveFullscreen((byte) -104);
                  this.updateScreenTransition(true, 0);
                }
              } else {
                this.updateScreenTransition(false, 0);
              }
            }
          }
        }
        if (!NanoTickClock.isGuestMode(-119)) {
          while (true) {
            var6 = (AchievementSubmission) (ArchiveIndex.field_l.removeLast((byte) -41));
            if (var6 == null) {
              break;
            }
            IntrusiveDequeCursor.submitAchievement(false, var6, 4);
          }
        }
        this.processIncomingPackets(3);
        if (LookupProtocolSupport.field_b) {
          MidiNoteMixer.field_r = 0;
        }
        if (NameNormalizationSupport.canAttemptLogin((byte) 109)) {
          var3Lifetime1 = this.serviceAccountFlow((byte) -125);
          if (var3Lifetime1 == 0 ||
            var3Lifetime1 == 1) {
            MusicCrossfadeStream.initializeReflectionCheckQueue(946);
            if (var3Lifetime1 != 1) {
              if (Base37Support.field_d) {
                ContextMenu.field_Sb = true;
                ClientUiResourceState.field_a = true;
                AppletUrlSupport.field_c = false;
                if (!MidiNoteMixer.field_v) {
                  stackIn_75_0 = -3405;
                  stackIn_75_1 = 0;
                  if (!LobbyPlayerLookupSupport.isGuestOrFreeAccount(true)) {
                    stackIn_76_2 = 0;
                  } else {
                    stackIn_76_2 = 21;
                  }
                  AccountCreationDialog.switchScreen(stackIn_75_0, stackIn_75_1, stackIn_76_2, false);
                } else {
                  ThreeSliceButtonPainter.field_B = LoginForm.textRemovedFromGame;
                  stackIn_71_0 = -3405;
                  stackIn_71_1 = 20;
                  if (!LobbyPlayerLookupSupport.isGuestOrFreeAccount(true)) {
                    stackIn_72_2 = 0;
                  } else {
                    stackIn_72_2 = 21;
                  }
                  AccountCreationDialog.switchScreen(stackIn_71_0, stackIn_71_1, stackIn_72_2, false);
                }
                PoolGameModel.applyPendingScreenTransition(-127);
                DisplayModeSupport.field_c[MatchingTextValidator.field_w].onEnter(0, 0, false);
                Base37Support.field_d = false;
                MidiNoteMixer.field_v = false;
                TransformSupport.field_e = false;
                TextWidgetPainter.closeChatCompositionPanel(116);
              }
              LoginRequiredScreen.field_H = false;
              AlternateLongAndTextLoginPayload.field_p = false;
            } else {
              LoginRequiredScreen.field_H = true;
              AlternateLongAndTextLoginPayload.field_p = true;
            }
          }
          var4 = 0;
          if (var3Lifetime1 == 2) {
            var4 = 1;
          }
          if (Base37Support.field_d ||
            AlternateLongAndTextLoginPayload.field_p ||
            LoginRequiredScreen.field_H) {
            var4 = 1;
          }
          if (!NameNormalizationSupport.canAttemptLogin((byte) 109)) {
            var4 = 0;
          }
          if (var4 != 0) {
            DebugTuningSupport.requestAccountInterface(11);
          }
        }
    }

    public final void init() {
        this.startApplet(640, "pool", 480, 0, 20);
    }

    final void shutdownServices(byte param0) {
        DateInputWidget.shutdownAudioOutputs((byte) -78);
        if (param0 != -39) {
          this.paintFrame((byte) -29);
        }
        if (null != MatchingTextValidator.field_u) {
          AccountStateQuery.leaveFullscreen((byte) -116);
        }
        ClientInputResetSupport.resetClientInput((byte) 60);
    }

    private final boolean loadResources(int param0, boolean param1) {
        int var3;
        PolarTableScene var4;
        int var6;
        ResourceArchive var7;
        String var8;
        String var9;
        ResourceArchive var10;
        String var11;
        String var12;
        ResourceArchive var13;
        String var14;
        String var15;
        ResourceArchive var16;
        String var17;
        String var18;
        ResourceArchive var19;
        String var20;
        String var21;
        ResourceArchive var22;
        String var23;
        String var24;
        ResourceArchive var25;
        String var26;
        String var27;
        ResourceArchive var28;
        String var29;
        String var30;
        ResourceArchive var31;
        String var32;
        String var33;
        ResourceArchive var34;
        String var35;
        String var36;
        ResourceArchive var37;
        String var38;
        String var39;
        ResourceArchive var40;
        String var41;
        String var42;
        ResourceArchive var43;
        String var44;
        String var45;
        ResourceArchive var46;
        String var47;
        String var48;
        ResourceArchive var49;
        String var50;
        String var51;
        ResourceArchive var52;
        String var53;
        String var54;
        ResourceArchive var55;
        String var56;
        String var57;
        ResourceArchive var58;
        String var59;
        String var60;
        ResourceArchive var61;
        String var62;
        String var63;
        String var64;
        Object var65;
        TikiTableScene var65_ref;
        String var66;
        String var67;
        String var68;
        String var69;
        String var70;
        int var3Lifetime1;
        int var3Lifetime2;
        var65 = null;
        var6 = field_O;
        MenuLabelSupport.initializeMenuLabels(-99);
        if (WeightedLruCache.field_d == null) {
          if (CanvasInputSupport.field_b != null) {
            var66 = TutorialFactory.unpackingSoundeffects;
            KeyHandler.setLoadingProgress(var66, (float)GrowableIntListFactory.field_i[20], false);
            this.paintFrame((byte) 120);
            CanvasInputSupport.field_b = null;
            ArrayWidgetGroup.resetFrameTiming(0);
            return false;
          }
          if (AppletUrlSupport.field_a != null) {
            var67 = KillerBallSkin.unpackingMusic;
            KeyHandler.setLoadingProgress(var67, (float)GrowableIntListFactory.field_i[21], false);
            this.paintFrame((byte) 120);
            HalloweenBallSkin.field_m = MusicTrack.loadFromArchive(AppletUrlSupport.field_a, "", "title");
            MenuScreenBase.field_d = MusicTrack.loadFromArchive(AppletUrlSupport.field_a, "", "title_next_door");
            for (var3 = 0; var3 < BrowserCookieWriter.field_b.length; var3++) {
              BrowserCookieWriter.field_b[var3].loadMusicTracks(1, AppletUrlSupport.field_a);
            }
            AppletUrlSupport.field_a = null;
            ArrayWidgetGroup.resetFrameTiming(0);
            return false;
          }
          if (null != UsernameSuggestionSupport.field_g) {
            var68 = KillerBallSkin.unpackingMusic;
            KeyHandler.setLoadingProgress(var68, (float)GrowableIntListFactory.field_i[22], false);
            this.paintFrame((byte) 120);
            RankingsScreen.field_N.prepareScoreInstruments(VertexTransformSupport.field_g, UsernameSuggestionSupport.field_g, HalloweenBallSkin.field_m, 75, 0);
            RankingsScreen.field_N.prepareScoreInstruments(VertexTransformSupport.field_g, UsernameSuggestionSupport.field_g, MenuScreenBase.field_d, 95, 0);
            for (var3Lifetime2 = 0; var3Lifetime2 < BrowserCookieWriter.field_b.length; var3Lifetime2++) {
              BrowserCookieWriter.field_b[var3Lifetime2].prepareMusic(3, VertexTransformSupport.field_g, UsernameSuggestionSupport.field_g);
            }
            RankingsScreen.field_N.clearInstrumentSampleIds(true);
            UsernameSuggestionSupport.field_g = null;
            VertexTransformSupport.field_g = null;
            ArrayWidgetGroup.resetFrameTiming(0);
            return false;
          }
          if (QuickChatMenu.field_Zb != null) {
            var69 = NineBallRules.unpackingGraphics;
            KeyHandler.setLoadingProgress(var69, (float)GrowableIntListFactory.field_i[23], false);
            this.paintFrame((byte) 120);
            FreePlayRules.field_e = PaletteFontLoader.loadPaletteFont(Ball.field_z, 32362, "", "font", ViewportController.field_q);
            CollisionContact.field_h = CanvasInputSupport.loadBinaryFontByName(Under13NoticePanel.field_R, "", 0, QuickChatMenu.field_Zb, "arialish12");
            ModernTableScene.field_Z = CanvasInputSupport.loadBinaryFontByName(Under13NoticePanel.field_R, "", 0, QuickChatMenu.field_Zb, "arialbold14");
            MouseWheelInput.field_c = new CueStick();
            MouseWheelInput.field_c.buildSegments(2);
            SoundCache.loadGameSprites(0, ViewportController.field_q);
            ScrollPane.loadSceneBackgrounds((byte) 27, MonotonicClock.field_h);
            Camera.field_j = WidgetStyleLayer.loadSprite("basic", (byte) 83, "locked", Under13NoticePanel.field_R);
            UsernameAvailabilityValidator.field_r = WidgetStyleLayer.loadSprite("basic", (byte) 122, "unachieved", Under13NoticePanel.field_R);
            TextInputPainter.field_u = WidgetStyleLayer.loadSprite("basic", (byte) 60, "orbcoin", Under13NoticePanel.field_R);
            TextInputValidator.padSpriteToFourPixelAlignment(UsernameAvailabilityValidator.field_r, (byte) -12);
            TextInputValidator.padSpriteToFourPixelAlignment(TextInputPainter.field_u, (byte) -12);
            TransformRotationSupport.field_k = new Sprite(32, 32);
            TransformRotationSupport.field_k.bindAsRenderTarget();
            TextInputPainter.field_u.drawScaledAveraged(0, 0, 32, 32);
            OpacityWidget.field_P.bindAsRenderTarget(15100);
            TextInputPainter.field_u = null;
            SpriteState.initializeLobbyInterface((byte) -72, true, ScrollPane.field_Lb, Under13NoticePanel.field_R, InputIdleSupport.field_a, 2, PoolUiText.field_c, 4, QuickChatMenu.field_Zb, DisplayModeSupport.gameoptlabels, BrowserCookieWriter.field_a, BitmapTextLayout.field_q, EmailValidator.field_n, ByteArrayNode.field_p, SlidingPanelSupport.field_f);
            KillerBallSkin.field_n = WidgetStyleLayer.loadSprite("", (byte) 121, "lobby_game_logo", ViewportController.field_q);
            ArchiveLoadStep.field_m = LoginMethod.field_h;
            DualLinkNode.field_s = true;
            Pocket.field_j = PolarBallSkin.field_m;
            DraggableWidget.initializeChatHistory(200, -77);
            BallDebugOverlay.readAppletParameters(0, 0, 37, DialRenderer.textBenefits, (java.applet.Applet) (this), 16777215);
            QuickChatMenu.field_Zb = null;
            Ball.field_z = null;
            ArrayWidgetGroup.resetFrameTiming(0);
            return false;
          }
          if (param0 < 56) {
            this.releaseAllStatics((byte) 13);
          }
          if (ArchiveFactory.field_b != null) {
            MusicPatchEnvelope.setChatHuffmanCodec(new HuffmanCodec(ArchiveFactory.field_b.getFileByName(false, "huffman", "")), (byte) -92);
            ArchiveFactory.field_b = null;
            ArrayWidgetGroup.resetFrameTiming(0);
            return false;
          }
          if (null != DisplayModeSupport.field_a) {
            var70 = ValidationIconWidget.unpackingModels;
            KeyHandler.setLoadingProgress(var70, (float)GrowableIntListFactory.field_i[24], false);
            this.paintFrame((byte) 120);
            ViewportController.loadSceneAndBallModels(DisplayModeSupport.field_a, 0);
            DisplayModeSupport.field_a = null;
            ArrayWidgetGroup.resetFrameTiming(0);
            return false;
          }
          RenderingInitializationSupport.initializeRendering(32);
          DateInputWidget.initializeMenuScreens((byte) 124);
          MatchingTextValidator.field_w = 0;
          GameRules.field_b = 0;
          TutorialFactory.createTutorials(4313);
          QuickChatCategoryCache.setFrameRate(50, -74);
          RankingsScreen.field_N.setChannelVolumeScale((byte) -125, -1, 256);
          AnimatedNotification.field_u = HalloweenBallSkin.field_m;
          RankingsScreen.field_N.startMusicScore(HalloweenBallSkin.field_m, 8821, true);
          IntrusiveNodeHashTable.a(FreePlayRules.field_e.field_L, 8, CollisionContact.field_h.maxDescent + CollisionContact.field_h.field_L, 240, FreePlayRules.field_e.field_L + FreePlayRules.field_e.maxDescent, 2, MidiPcmStream.field_y[0].field_z + 5, 5 + MidiPcmStream.field_y[0].field_A, 8, 480, 3, MeshSymmetrySupport.field_g, -23994, CollisionContact.field_h, 4, 13421772, CollisionContact.field_h.field_L, 320, MidiPcmStream.field_y, MeshSymmetrySupport.field_g, FreePlayRules.field_e);
          PlasmaBallSkin.configureSharedInterfaceStyle(240, MidiPcmStream.field_y[0].field_A + 5, MeshSymmetrySupport.field_g, 8, MeshSymmetrySupport.field_g, 4, 8, FreePlayRules.field_e, 5 + MidiPcmStream.field_y[0].field_z, 2, MidiPcmStream.field_y, -1373633266, 2, 3, 320);
          ArrayWidgetGroup.resetFrameTiming(0);
          return true;
        }
        if (Under13NoticePanel.field_R.isIndexReady(-62) &&
          Under13NoticePanel.field_R.ensureGroupAvailableByName("arialbold14", 0)) {
          if (Under13NoticePanel.field_R.isIndexReady(-64) &&
            Under13NoticePanel.field_R.ensureGroupAvailableByName("arialish12", 0)) {
            if (QuickChatMenu.field_Zb.isIndexReady(48) &&
              QuickChatMenu.field_Zb.ensureGroupAvailableByName("arialbold14", 0)) {
              if (QuickChatMenu.field_Zb.isIndexReady(123) &&
                QuickChatMenu.field_Zb.ensureGroupAvailableByName("arialish12", 0)) {
                if (Under13NoticePanel.field_R.isIndexReady(107) &&
                  Under13NoticePanel.field_R.ensureGroupAvailableByName("basic", 0)) {
                  if (Under13NoticePanel.field_R.isIndexReady(-43) &&
                    Under13NoticePanel.field_R.ensureGroupAvailableByName("lobby", 0)) {
                    if (QuickChatMenu.field_Zb.isIndexReady(-47) &&
                      QuickChatMenu.field_Zb.ensureGroupAvailableByName("lobby", 0)) {
                      if (WeightedLruCache.field_d.isIndexReady(79) &&
                        WeightedLruCache.field_d.ensureAllGroupsAvailable(-63)) {
                        if (CanvasInputSupport.field_b.isIndexReady(105) &&
                          CanvasInputSupport.field_b.ensureAllGroupsAvailable(-63)) {
                          if (UsernameSuggestionSupport.field_g.isIndexReady(-50) &&
                            UsernameSuggestionSupport.field_g.ensureAllGroupsAvailable(-63)) {
                            if (AppletUrlSupport.field_a.isIndexReady(-114) &&
                              AppletUrlSupport.field_a.ensureAllGroupsAvailable(-63)) {
                              if (ViewportController.field_q.isIndexReady(-43) &&
                                ViewportController.field_q.ensureGroupAvailableByName("", 0)) {
                                if (MonotonicClock.field_h.isIndexReady(-90) &&
                                  MonotonicClock.field_h.ensureGroupAvailableByName("", 0)) {
                                  if (Ball.field_z.isIndexReady(120) &&
                                    Ball.field_z.ensureGroupAvailableByName("", 0)) {
                                    if (ArchiveFactory.field_b.isIndexReady(-76) &&
                                      ArchiveFactory.field_b.ensureAllGroupsAvailable(-63)) {
                                      if (InputIdleSupport.field_a.isIndexReady(-90) &&
                                        InputIdleSupport.field_a.ensureAllGroupsAvailable(-63)) {
                                        if (DisplayModeSupport.field_a.isIndexReady(-116) &&
                                          DisplayModeSupport.field_a.ensureAllGroupsAvailable(-63)) {
                                          if (NetworkGameClient.field_F.isIndexReady(-118) &&
                                            NetworkGameClient.field_F.ensureAllGroupsAvailable(-63)) {
                                            if (!param1) {
                                              var61 = NetworkGameClient.field_F;
                                              var62 = DebugTuningSupport.waitingforExtradata;
                                              var63 = SoundCache.loadingExtradata;
                                              KeyHandler.setLoadingProgress(SupportPageLauncher.formatProgressLabel(var61, var62, -641, var63), (float)(GrowableIntListFactory.field_i[18] + (GrowableIntListFactory.field_i[19] - GrowableIntListFactory.field_i[18]) * var61.getOverallProgress(0) / 100), false);
                                              return false;
                                            }
                                            StartupInterfaceSupport.a(true);
                                            var64 = TutorialFactory.unpackingSoundeffects;
                                            KeyHandler.setLoadingProgress(var64, (float)GrowableIntListFactory.field_i[19], false);
                                            this.paintFrame((byte) 120);
                                            IntKeyLookup.a(true);
                                            VertexTransformSupport.field_g = new SoundCache(WeightedLruCache.field_d, CanvasInputSupport.field_b);
                                            BeveledFrameSpriteFactory.field_c[0] = VertexTransformSupport.field_g.getVorbisSound("interface_mouseover_menuitems", true, "");
                                            BeveledFrameSpriteFactory.field_c[1] = VertexTransformSupport.field_g.getVorbisSound("interface_music_level_change", true, "");
                                            BeveledFrameSpriteFactory.field_c[2] = VertexTransformSupport.field_g.getVorbisSound("interface_SFX_level_change_chalk", true, "");
                                            BeveledFrameSpriteFactory.field_c[3] = VertexTransformSupport.field_g.getVorbisSound("interface_select_ballroll_transition", true, "");
                                            for (var3Lifetime1 = 0; var3Lifetime1 < BrowserCookieWriter.field_b.length; var3Lifetime1++) {
                                              BrowserCookieWriter.field_b[var3Lifetime1].loadSounds(VertexTransformSupport.field_g, 124);
                                            }
                                            if (2 < BrowserCookieWriter.field_b.length) {
                                              var65_ref = (TikiTableScene) (BrowserCookieWriter.field_b[2]);
                                              var4 = (PolarTableScene) (BrowserCookieWriter.field_b[3]);
                                              var4.field_X = var65_ref.field_mb;
                                              var4.field_bb = var65_ref.field_bb;
                                              var4.field_hb = var65_ref.field_S;
                                              var4.field_Y = var65_ref.field_rb;
                                            }
                                            WeightedLruCache.field_d = null;
                                            ArrayWidgetGroup.resetFrameTiming(0);
                                            return false;
                                          }
                                          var58 = NetworkGameClient.field_F;
                                          var59 = DebugTuningSupport.waitingforExtradata;
                                          var60 = SoundCache.loadingExtradata;
                                          KeyHandler.setLoadingProgress(SupportPageLauncher.formatProgressLabel(var58, var59, -641, var60), (float)(GrowableIntListFactory.field_i[18] + (-GrowableIntListFactory.field_i[18] + GrowableIntListFactory.field_i[19]) * var58.getOverallProgress(0) / 100), false);
                                          return false;
                                        }
                                        var55 = DisplayModeSupport.field_a;
                                        var56 = DebugTuningSupport.waitingforExtradata;
                                        var57 = SoundCache.loadingExtradata;
                                        KeyHandler.setLoadingProgress(SupportPageLauncher.formatProgressLabel(var55, var56, -641, var57), (float)(GrowableIntListFactory.field_i[17] + (GrowableIntListFactory.field_i[18] - GrowableIntListFactory.field_i[17]) * var55.getOverallProgress(0) / 100), false);
                                        return false;
                                      }
                                      var52 = InputIdleSupport.field_a;
                                      var53 = DebugTuningSupport.waitingforExtradata;
                                      var54 = SoundCache.loadingExtradata;
                                      KeyHandler.setLoadingProgress(SupportPageLauncher.formatProgressLabel(var52, var53, -641, var54), (float)(GrowableIntListFactory.field_i[16] + (-GrowableIntListFactory.field_i[16] + GrowableIntListFactory.field_i[17]) * var52.getOverallProgress(0) / 100), false);
                                      return false;
                                    }
                                    var49 = ArchiveFactory.field_b;
                                    var50 = DebugTuningSupport.waitingforExtradata;
                                    var51 = SoundCache.loadingExtradata;
                                    KeyHandler.setLoadingProgress(SupportPageLauncher.formatProgressLabel(var49, var50, -641, var51), (float)(GrowableIntListFactory.field_i[15] + (GrowableIntListFactory.field_i[16] - GrowableIntListFactory.field_i[15]) * var49.getOverallProgress(0) / 100), false);
                                    return false;
                                  }
                                  var46 = Ball.field_z;
                                  var48 = SpaceTableScene.waitingforFonts;
                                  var47 = TickClock.loadingFonts;
                                  KeyHandler.setLoadingProgress(GlowParticle.formatProgressLabel((byte) -21, "", var46, var47, var48), (float)(GrowableIntListFactory.field_i[14] + (GrowableIntListFactory.field_i[15] - GrowableIntListFactory.field_i[14]) * var46.getGroupProgressByName(100, "") / 100), false);
                                  return false;
                                }
                                var43 = MonotonicClock.field_h;
                                var45 = NineSliceFrameSupport.waitingforGraphics;
                                var44 = HighScoreSubmission.loadingGraphics;
                                KeyHandler.setLoadingProgress(GlowParticle.formatProgressLabel((byte) -1, "", var43, var44, var45), (float)(GrowableIntListFactory.field_i[13] + (GrowableIntListFactory.field_i[14] - GrowableIntListFactory.field_i[13]) * var43.getGroupProgressByName(100, "") / 100), false);
                                return false;
                              }
                              var40 = ViewportController.field_q;
                              var42 = NineSliceFrameSupport.waitingforGraphics;
                              var41 = HighScoreSubmission.loadingGraphics;
                              KeyHandler.setLoadingProgress(GlowParticle.formatProgressLabel((byte) 119, "", var40, var41, var42), (float)(GrowableIntListFactory.field_i[12] + (GrowableIntListFactory.field_i[13] - GrowableIntListFactory.field_i[12]) * var40.getGroupProgressByName(100, "") / 100), false);
                              return false;
                            }
                            var37 = AppletUrlSupport.field_a;
                            var38 = NameEntryPopup.waitingforMusic;
                            var39 = Camera.loadingMusic;
                            KeyHandler.setLoadingProgress(SupportPageLauncher.formatProgressLabel(var37, var38, -641, var39), (float)(GrowableIntListFactory.field_i[11] + (GrowableIntListFactory.field_i[12] - GrowableIntListFactory.field_i[11]) * var37.getOverallProgress(0) / 100), false);
                            return false;
                          }
                          var34 = UsernameSuggestionSupport.field_g;
                          var35 = NameEntryPopup.waitingforMusic;
                          var36 = Camera.loadingMusic;
                          KeyHandler.setLoadingProgress(SupportPageLauncher.formatProgressLabel(var34, var35, -641, var36), (float)(GrowableIntListFactory.field_i[10] + (-GrowableIntListFactory.field_i[10] + GrowableIntListFactory.field_i[11]) * var34.getOverallProgress(0) / 100), false);
                          return false;
                        }
                        var31 = CanvasInputSupport.field_b;
                        var32 = HuffmanCodec.waitingforSoundeffects;
                        var33 = AudioService.loadingSoundeffects;
                        KeyHandler.setLoadingProgress(SupportPageLauncher.formatProgressLabel(var31, var32, -641, var33), (float)(GrowableIntListFactory.field_i[9] + (-GrowableIntListFactory.field_i[9] + GrowableIntListFactory.field_i[10]) * var31.getOverallProgress(0) / 100), false);
                        return false;
                      }
                      var28 = WeightedLruCache.field_d;
                      var29 = HuffmanCodec.waitingforSoundeffects;
                      var30 = AudioService.loadingSoundeffects;
                      KeyHandler.setLoadingProgress(SupportPageLauncher.formatProgressLabel(var28, var29, -641, var30), (float)(GrowableIntListFactory.field_i[8] + (GrowableIntListFactory.field_i[9] - GrowableIntListFactory.field_i[8]) * var28.getOverallProgress(0) / 100), false);
                      return false;
                    }
                    var25 = QuickChatMenu.field_Zb;
                    var27 = SpaceTableScene.waitingforFonts;
                    var26 = TickClock.loadingFonts;
                    KeyHandler.setLoadingProgress(GlowParticle.formatProgressLabel((byte) 118, "lobby", var25, var26, var27), (float)(GrowableIntListFactory.field_i[7] + (-GrowableIntListFactory.field_i[7] + GrowableIntListFactory.field_i[8]) * var25.getGroupProgressByName(100, "lobby") / 100), false);
                    return false;
                  }
                  var22 = Under13NoticePanel.field_R;
                  var24 = NineSliceFrameSupport.waitingforGraphics;
                  var23 = HighScoreSubmission.loadingGraphics;
                  KeyHandler.setLoadingProgress(GlowParticle.formatProgressLabel((byte) 122, "lobby", var22, var23, var24), (float)(GrowableIntListFactory.field_i[6] + (-GrowableIntListFactory.field_i[6] + GrowableIntListFactory.field_i[7]) * var22.getGroupProgressByName(100, "lobby") / 100), false);
                  return false;
                }
                var19 = Under13NoticePanel.field_R;
                var21 = NineSliceFrameSupport.waitingforGraphics;
                var20 = HighScoreSubmission.loadingGraphics;
                KeyHandler.setLoadingProgress(GlowParticle.formatProgressLabel((byte) 101, "basic", var19, var20, var21), (float)(GrowableIntListFactory.field_i[5] + (GrowableIntListFactory.field_i[6] - GrowableIntListFactory.field_i[5]) * var19.getGroupProgressByName(100, "basic") / 100), false);
                return false;
              }
              var16 = QuickChatMenu.field_Zb;
              var18 = SpaceTableScene.waitingforFonts;
              var17 = TickClock.loadingFonts;
              KeyHandler.setLoadingProgress(GlowParticle.formatProgressLabel((byte) -116, "arialish12", var16, var17, var18), (float)(GrowableIntListFactory.field_i[4] + (-GrowableIntListFactory.field_i[4] + GrowableIntListFactory.field_i[5]) * var16.getGroupProgressByName(100, "arialish12") / 100), false);
              return false;
            }
            var13 = QuickChatMenu.field_Zb;
            var15 = SpaceTableScene.waitingforFonts;
            var14 = TickClock.loadingFonts;
            KeyHandler.setLoadingProgress(GlowParticle.formatProgressLabel((byte) -61, "arialbold14", var13, var14, var15), (float)(GrowableIntListFactory.field_i[3] + (-GrowableIntListFactory.field_i[3] + GrowableIntListFactory.field_i[4]) * var13.getGroupProgressByName(100, "arialbold14") / 100), false);
            return false;
          }
          var10 = Under13NoticePanel.field_R;
          var12 = NineSliceFrameSupport.waitingforGraphics;
          var11 = HighScoreSubmission.loadingGraphics;
          KeyHandler.setLoadingProgress(GlowParticle.formatProgressLabel((byte) -17, "arialish12", var10, var11, var12), (float)(GrowableIntListFactory.field_i[2] + (-GrowableIntListFactory.field_i[2] + GrowableIntListFactory.field_i[3]) * var10.getGroupProgressByName(100, "arialish12") / 100), false);
          return false;
        }
        var7 = Under13NoticePanel.field_R;
        var9 = NineSliceFrameSupport.waitingforGraphics;
        var8 = HighScoreSubmission.loadingGraphics;
        KeyHandler.setLoadingProgress(GlowParticle.formatProgressLabel((byte) -22, "arialbold14", var7, var8, var9), (float)(GrowableIntListFactory.field_i[1] + (GrowableIntListFactory.field_i[2] - GrowableIntListFactory.field_i[1]) * var7.getGroupProgressByName(100, "arialbold14") / 100), false);
        return false;
    }

    static {
        field_N = new PlayingSound[2];
        potBallsInAnyOrderFinishOnBlack = "Pot the balls in any order and finish on the black.";
        muChatLobbyHide = "Hide lobby chat";
        field_L = new int[4];
    }
}
