/*
 * Decompiled by CFR-JS 0.4.0.
 */
public final class ZombieDawnMulti extends NetworkGameClient {
    static String field_M;
    static String[] field_K;
    private StringBuffer field_G;
    static Sprite[][] field_L;
    static int field_H;
    private StringBuffer field_J;
    static String field_F;
    static Sprite[] field_I;
    public static boolean field_E;

    final void drawFrame(int param0) {
        Object stackIn_5_0 = null;
        boolean stackIn_15_0 = false;
        int stackIn_32_0 = 0;
        boolean stackIn_94_0 = false;
        boolean stackIn_95_1 = false;
        RuntimeException decompiledCaughtException = null;
        Object var2 = null;
        RuntimeException var2_ref = null;
        int var3_int = 0;
        int[][] var3 = null;
        Runtime var3_ref = null;
        MenuScreen var4_ref_nc = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var3_intLifetime1;
        var7 = field_E ? 1 : 0;
        try {
          if (null == FullscreenSupport.field_f) {
            stackIn_5_0 = NameEntryPopup.field_Ib;
          } else {
            stackIn_5_0 = FullscreenSupport.field_f;
          }
          var2 = stackIn_5_0;
          if (LinkButtonPainter.field_a) {
            if (!ValidationIconWidget.field_O) {
              return;
            }
          } else {
            if (DialogLayer.canShowAdvert((byte) -127)) {
              if (null != FullscreenSupport.field_f) {
                stackIn_15_0 = true;
              } else {
                stackIn_15_0 = LocalGameWorld.field_L;
              }
              NetworkArchiveRequest.renderStartupScreen(stackIn_15_0, param0 ^ -30144, (java.awt.Canvas) (var2));
              return;
            }
            if (!ValidationIconWidget.field_O) {
              PendingIntArrayReply.renderLoadingScreen((java.awt.Canvas) (var2), -93);
              return;
            }
            if (null != FontPaletteHelpers.field_g) {
              LoginForm.setLoadingProgress(100.0f, param0 ^ -30089, FramePainter.field_a);
              PendingIntArrayReply.renderLoadingScreen((java.awt.Canvas) (var2), -92);
              return;
            }
          }
          if (ArrayWidgetGroup.field_I != CachedTextLayout.field_g) {
            if (CachedTextLayout.field_g >= 0) {
              stackIn_32_0 = CachedTextLayout.field_g;
            } else {
              stackIn_32_0 = ArrayWidgetGroup.field_I;
            }
            var3_int = stackIn_32_0;
            if (var3_int < 0) {
              var3_int = 11;
            }
            var4_ref_nc = NoticeMenuHelpers.lookupMenuScreen(2, var3_int);
            if (NoticeMenuHelpers.field_b >= 16) {
              AudioPumpThread.drawScreenOverlays((byte) -77, false, CachedTextLayout.field_g);
              if (var4_ref_nc != null) {
                var4_ref_nc.drawFadeTransition(-128, 512 - (NoticeMenuHelpers.field_b << 4), true);
                if (var7 != 0) {
                  AudioPumpThread.drawScreenOverlays((byte) -11, false, ArrayWidgetGroup.field_I);
                  if (null != var4_ref_nc) {
                    var4_ref_nc.drawFadeTransition(-109, NoticeMenuHelpers.field_b << 4, false);
                  }
                }
              }
            } else {
              AudioPumpThread.drawScreenOverlays((byte) -11, false, ArrayWidgetGroup.field_I);
              if (null != var4_ref_nc) {
                var4_ref_nc.drawFadeTransition(-109, NoticeMenuHelpers.field_b << 4, false);
              }
            }
            if (var7 != 0) {
              AudioPumpThread.drawScreenOverlays((byte) -16, true, ArrayWidgetGroup.field_I);
            }
          } else {
            AudioPumpThread.drawScreenOverlays((byte) -16, true, ArrayWidgetGroup.field_I);
          }
          if (param0 != -30169) {
            field_L = (Sprite[][]) null;
          }
          if (PendingDataRequest.isMessageBoxOpen((byte) -50)) {
            SoftwareRasterizer.clearRect(0, 0, SoftwareRasterizer.width, SoftwareRasterizer.height);
            DualLinkNodeHashTable.drawFramedMenu(0);
            var3 = TutorialAndMenuHelpers.getMenuOptionBounds(45);
            var4 = 0;
            var5 = 0;
            while (true) {
              if (var3.length > var5) {
                if (var7 == 0) {
                  if (null != var3[var5] &&
                    MouseInputHandler.field_g >= var3[var5][0] &&
                    (var3[var5][2] + var3[var5][0]) >= MouseInputHandler.field_g &&
                    LoginMethod.field_d >= var3[var5][1] &&
                    LoginMethod.field_d <= (var3[var5][0] + var3[var5][3])) {
                    var4 = 1;
                  }
                  var5++;
                  continue;
                }
              } else {
                if (var4 != 0) {
                  ChatPanelSetupHelpers.setCursorType(-1, 1);
                  if (var7 == 0) {
                    break;
                  }
                }
              }
              ChatPanelSetupHelpers.setCursorType(-1, 4);
              break;
            }
          }
          if (0 != TipPanelHelpers.field_i) {
            var3_intLifetime1 = NoticeMenuHelpers.field_b * 256 / 32;
            if (0 < var3_intLifetime1) {
              SoftwareRasterizer.fillRectAlpha(0, 0, SoftwareRasterizer.width, SoftwareRasterizer.height, 0, var3_intLifetime1);
            }
          }
          boolean decompiledSharedTail0 = (!(QuitPageHelpers.deferReconnect(15000)) ||
            PendingDataRequest.isMessageBoxOpen((byte) -39));
          if (!decompiledSharedTail0) {
            stackIn_94_0 = true;
            if (FullscreenSupport.field_f != null) {
              stackIn_95_1 = true;
            } else {
              stackIn_95_1 = LocalGameWorld.field_L;
            }
            MatchingTextValidator.drawModalOverlay(stackIn_94_0, stackIn_95_1);
            decompiledSharedTail0 = (var7 != 0);
          }
          if ((decompiledSharedTail0) && (GameCharacter.isMessageBoxOpen((byte) 113) &&
            !PendingDataRequest.isMessageBoxOpen((byte) -39))) {
            SoftwareRasterizer.clearRect(0, 0, SoftwareRasterizer.width, SoftwareRasterizer.height);
            TextDecodeHelpers.setMenuFrameStyle(RankingEntry.field_h[0].width, RankingEntry.field_h[0].height, RankingEntry.field_h, (byte) -21);
          }
          if (FriendListHelpers.field_q >= 2 &&
            MeltdownPuddle.field_m) {
            if (this.field_J == null) {
              this.field_J = new StringBuffer("Mem: 000000KiB");
              this.field_G = new StringBuffer("FPS: 00");
            }
            boolean decompiledFrameCompleted0 = true;
            if (0 == PowerupEvent.field_m % 50) {
              var3_ref = Runtime.getRuntime();
              var4 = (int)(var3_ref.totalMemory() - var3_ref.freeMemory()) >> 10;
              var5 = SupportPageHelpers.field_b;
              var6 = 10;
              do {
                if (4 >= var6) {
                  var6 = 6;
                  break;
                }
                this.field_J.setCharAt(var6, (char)(var4 % 10 + 48));
                var4 = var4 / 10;
                var6--;
              } while (var7 == 0);
              while (var6 > 4) {
                this.field_G.setCharAt(var6, (char)(48 + var5 % 10));
                var5 = var5 / 10;
                var6--;
                if (var7 != 0) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
              }
            }
            if (decompiledFrameCompleted0) {
              MatchingTextValidator.field_w.drawLeft(this.field_J.toString(), 5, 20, 16777215, 1);
            }
            MatchingTextValidator.field_w.drawLeft(this.field_G.toString(), 5, 35, 16777215, 1);
          }
          ByteStorage.drawRasterToCanvas(false, 0, (java.awt.Canvas) (var2), 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var2_ref), "ZombieDawnMulti.IA(" + param0 + ')');
        }
    }

    final void initializeGame(int param0) {
        MidiPcmStream var2 = null;
        try {
          this.initializeFramework(0, false, 9, 13, 1, 72, 10, (byte) -99);
          IsaacRandom.field_j = true;
          PowerupEvent.field_m = 5000 * (int)Math.random();
          FullscreenFocusCanvas.field_k = new PlayerProfile();
          FadingDialog.field_H = true;
          var2 = new MidiPcmStream();
          var2.changeChannelBank(128, 15, 9);
          AudioStartupHelpers.startAudioOutputs(ArrayWidgetGroup.field_J, 22050, (java.awt.Component) ((Object) NameEntryPopup.field_Ib), var2, 1024, true);
          this.enableOptionalPacketHandlers(true, (byte) -27, false, true, true, false, true);
          HotspotTextWidget.field_U[64] = 1;
          HotspotTextWidget.field_U[79] = 14;
          HotspotTextWidget.field_U[10] = -1;
          HotspotTextWidget.field_U[9] = -1;
          HotspotTextWidget.field_U[76] = 5;
          HotspotTextWidget.field_U[66] = 1;
          HotspotTextWidget.field_U[61] = 25;
          HotspotTextWidget.field_U[65] = 1;
          HotspotTextWidget.field_U[62] = -1;
          HotspotTextWidget.field_U[77] = -1;
          HotspotTextWidget.field_U[57] = -2;
          HotspotTextWidget.field_U[81] = 25;
          HotspotTextWidget.field_U[70] = 2;
          HotspotTextWidget.field_U[71] = -1;
          HotspotTextWidget.field_U[74] = 10;
          HotspotTextWidget.field_U[param0] = 17;
          HotspotTextWidget.field_U[80] = 11;
          HotspotTextWidget.field_U[82] = 4;
          HotspotTextWidget.field_U[69] = -1;
          HotspotTextWidget.field_U[58] = -2;
          HotspotTextWidget.field_U[78] = 5;
          HotspotTextWidget.field_U[72] = 6;
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "ZombieDawnMulti.JA(" + param0 + ')');
        }
    }

    private final void updateScreens(boolean param0, boolean param1) {
        int fieldTemp$0 = 0;
        boolean stackIn_98_0 = false;
        boolean stackIn_120_0 = false;
        boolean stackIn_123_1 = false;
        boolean stackIn_127_2 = false;
        boolean stackIn_129_0 = false;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var3_intLifetime1;
        var8 = field_E ? 1 : 0;
        try {
          boolean decompiledFrameRemainder2 = true;
          if (TipPanelHelpers.field_h == TipPanelHelpers.field_i) {
            boolean decompiledFrameRemainder1 = true;
            var3_int = 0;
            var4 = 0;
            if (!param1) {
              if (~CachedTextLayout.field_g != ~ArrayWidgetGroup.field_I) {
                NoticeMenuHelpers.field_b = NoticeMenuHelpers.field_b + 1;
                decompiledFrameRemainder1 = (NoticeMenuHelpers.field_b == 32);
                if (decompiledFrameRemainder1) {
                  ClockAndScreenHelpers.switchToRequestedScreen(-9);
                  decompiledFrameRemainder1 = (var8 != 0);
                }
              }
              if (decompiledFrameRemainder1) {
                if (ArrayWidgetGroup.field_I != -7) {
                  if ((ArrayWidgetGroup.field_I != -2) &&
                    (decompiledFrameRemainder1 = !(!PasswordCheckHelpers.isNonNegative((byte) 53, ArrayWidgetGroup.field_I)))) {
                    NoticeMenuHelpers.lookupMenuScreen(2, ArrayWidgetGroup.field_I).updateScreen(0);
                    decompiledFrameRemainder1 = (var8 != 0);
                  }
                  if (decompiledFrameRemainder1) {
                    TutorialAndMenuHelpers.field_f = true;
                    var3_int = 1;
                    if (var8 != 0) {
                      if (UiWidget.field_s != null) {
                        this.syncClientWithSimulation(-50);
                      }
                      if (SupportPageHelpers.field_c) {
                        var4 = 1;
                        var3_int = 1;
                        UnitMoveEvent.field_m.update((byte) 121, true);
                      } else {
                        UnitMoveEvent.field_m.update((byte) 121, true);
                      }
                    }
                  }
                } else {
                  if (UiWidget.field_s != null) {
                    this.syncClientWithSimulation(-50);
                  }
                  if (SupportPageHelpers.field_c) {
                    var4 = 1;
                    var3_int = 1;
                    if (var8 != 0) {
                      UnitMoveEvent.field_m.update((byte) 121, true);
                    }
                  } else {
                    UnitMoveEvent.field_m.update((byte) 121, true);
                  }
                }
              }
            }
            if (ChatAndOptionHelpers.field_d.last(61) != null) {
              fieldTemp$0 = TipPanelHelpers.field_k + 1;
              TipPanelHelpers.field_k = TipPanelHelpers.field_k + 1;
              if (fieldTemp$0 >= 335) {
                TipPanelHelpers.field_k = 0;
                ChatAndOptionHelpers.field_d.removeLast(49);
              }
            }
            boolean decompiledFrameCompleted1 = true;
            if (SupportPageHelpers.field_c &&
              !AccountServerResult.field_g &&
              !IntroScreen.field_q) {
              if (ValidationState.field_b &&
                MenuInputState.field_b &&
                HotspotTextWidget.field_N) {
                var3_int = 0;
              }
              if (TeamSpriteHelpers.isGameScreenActive(-116)) {
                var3_int = 1;
              }
              ScorePopup.updateLobbyRequests(15, var3_int != 0);
              if (DisplayNamePanel.field_K) {
                MeshMaterial.field_e.update((byte) 125, var4 != 0);
              }
              if (MenuInputState.field_b) {
                if (ValidationState.field_b) {
                  PasswordValidator.updateChatInputBox(320, 180, var4 != 0, 0);
                }
                UnitMoveEvent.field_m.update((byte) 119, var4 != 0);
              }
              while (MusicPatchPcmStream.pollKeyEvent(-1)) {
                if (TutorialAndMenuHelpers.field_f) {
                  if (ValidationState.field_b &&
                    MenuInputState.field_b) {
                    if (FightEvent.handleChatComposerKey(13, -23936, 15, 12)) {
                      continue;
                    }
                  } else {
                    MusicCrossfadeStream.routeKeyInput(13, 15, 12, 18663);
                  }
                }
                if (DisplayNamePanel.field_K) {
                  MeshMaterial.field_e.handleKeyPress(-59, InfectionEvent.field_p);
                }
                if (!MenuInputState.field_b) {
                  continue;
                }
                stackIn_98_0 = TutorialAndMenuHelpers.field_f;
                if (var8 != 0) {
                  decompiledFrameCompleted1 = false;
                  break;
                }
                if (stackIn_98_0 &&
                  HotspotTextWidget.field_N) {
                  continue;
                }
                UnitMoveEvent.field_m.handleKeyPress(-78, InfectionEvent.field_p);
              }
            }
            if (decompiledFrameCompleted1) {
              stackIn_98_0 = SupportPageHelpers.field_c;
            }
            boolean decompiledFrameCompleted0 = true;
            boolean decompiledFrameRemainder0 = true;
            if (!stackIn_98_0) {
              if (!TeamSpriteHelpers.isGameScreenActive(-98)) {
                ClientTickHelpers.tickUiTimers(0);
                while (MusicPatchPcmStream.pollKeyEvent(-1)) {
                  if (!MenuInputState.field_b) {
                    continue;
                  }
                  stackIn_129_0 = TutorialAndMenuHelpers.field_f;
                  if (var8 != 0) {
                    decompiledFrameCompleted0 = false;
                    break;
                  }
                  if (stackIn_129_0 &&
                    HotspotTextWidget.field_N) {
                    continue;
                  }
                  UnitMoveEvent.field_m.handleKeyPress(119, InfectionEvent.field_p);
                }
                decompiledFrameRemainder0 = !(decompiledFrameCompleted0);
              }
              if ((decompiledFrameRemainder0) &&
                (decompiledFrameCompleted0)) {
                stackIn_120_0 = true;
                stackIn_123_1 = (MenuInputState.field_b) || (DisplayNamePanel.field_K);
                stackIn_127_2 = !(TickButtonPainter.field_a <= 50);
                FadingDialog.updateLobbyScreenWhiteText(stackIn_120_0, stackIn_123_1, stackIn_127_2, -92, 15, 0, false, 11, 13, ByteStorage.field_d, 14, true);
              }
            }
            if (decompiledFrameCompleted0) {
              stackIn_129_0 = TutorialAndMenuHelpers.field_f;
            }
            if (!stackIn_129_0) {
              if (!(PlayModeChoiceDialog.field_M <= 0)) {
                PlayModeChoiceDialog.field_M = PlayModeChoiceDialog.field_M - 1;
                if ((var8 != 0) &&
                  (IdleTickHelpers.field_d > PlayModeChoiceDialog.field_M)) {
                  PlayModeChoiceDialog.field_M = PlayModeChoiceDialog.field_M + 1;
                }
              }
            } else {
              if (IdleTickHelpers.field_d > PlayModeChoiceDialog.field_M) {
                PlayModeChoiceDialog.field_M = PlayModeChoiceDialog.field_M + 1;
              }
            }
            var5 = IdleTickHelpers.field_d * IdleTickHelpers.field_d;
            var6 = -(PlayModeChoiceDialog.field_M * PlayModeChoiceDialog.field_M) + var5;
            var7 = var6 * 120 / var5 + ProgramNoteUsage.field_g;
            UiTheme.setChatPanelY(false, var7);
            decompiledFrameRemainder2 = (var8 != 0);
          }
          if (decompiledFrameRemainder2) {
            if (~TextInputValidator.field_k != ~TipPanelHelpers.field_i) {
              if (QuitPageHelpers.field_f != TipPanelHelpers.field_i) {
                LoginDialog.field_yb = LoginDialog.field_yb - 1;
                decompiledFrameRemainder2 = (LoginDialog.field_yb == 0);
                if (decompiledFrameRemainder2) {
                  TipPanelHelpers.field_i = TipPanelHelpers.field_h;
                  decompiledFrameRemainder2 = (var8 != 0);
                }
              }
              if (decompiledFrameRemainder2) {
                if (!ScorePopup.isGuestSession(124)) {
                  AlignedIconLabel.closeMenuMessageBox(-109);
                  LevelActorSpawner.requestMenuScreen(true, 1, 127, 1);
                  if (MouseInputHandler.field_f) {
                    MouseInputHandler.field_f = false;
                    ReflectionCheckRequest.toggleFullscreen((byte) -59, false);
                  }
                  if (PasswordCheckHelpers.isNonNegative((byte) 53, CachedTextLayout.field_g)) {
                    ClockAndScreenHelpers.switchToRequestedScreen(-9);
                  }
                }
                TipPanelHelpers.field_i = EmailLoginCredentials.field_m;
                decompiledFrameRemainder2 = (var8 != 0);
              }
            }
            if (decompiledFrameRemainder2) {
              LoginDialog.field_yb = LoginDialog.field_yb + 1;
              if (16 == LoginDialog.field_yb) {
                if (!MouseInputHandler.field_f) {
                  LevelUpgradeHelpers.openLoginPanelAtStage(0);
                  if (var8 != 0) {
                    ValidationMessageWidget.openGuestLoginPanel(0);
                  }
                } else {
                  ValidationMessageWidget.openGuestLoginPanel(0);
                }
                TipPanelHelpers.field_i = QuitPageHelpers.field_f;
              }
            }
          }
          if (CachedTextLayout.field_g == -4) {
            TextValidationFailure.field_a.writeCipheredOpcode((byte) -35, 9);
            AccountServerResult.field_g = true;
            CachedTextLayout.field_g = ArrayWidgetGroup.field_I;
            PlayModeChoiceDialog.field_M = IdleTickHelpers.field_d;
          }
          if (!param0) {
            return;
          }
          if (CachedTextLayout.field_g == -5) {
            if (JaggrabDownloader.field_c != null) {
              SocialListRow.sendPlayerActionRequest(JaggrabDownloader.field_c.getGameId(6), 11, -76);
              IntroScreen.field_q = true;
              CachedTextLayout.field_g = ArrayWidgetGroup.field_I;
              if (var8 == 0) {
                return;
              }
            }
            var3_intLifetime1 = SleepAndNameHelpers.field_d;
            LevelActorSpawner.requestMenuScreen(false, var3_intLifetime1, 127, CachedTextLayout.field_g);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var3), "ZombieDawnMulti.BA(" + param0 + ',' + param1 + ')');
        }
    }

    final void tick(int param0) {
        boolean discarded$0 = false;
        int dupTemp$1 = 0;
        int dupTemp$2 = 0;
        int dupTemp$3 = 0;
        int stackIn_31_1 = 0;
        boolean stackIn_32_2 = false;
        boolean stackIn_72_1 = false;
        boolean stackIn_126_0 = false;
        int stackIn_334_0 = 0;
        int stackIn_334_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        String[] var2 = null;
        int[] var2_array = null;
        UnitStateEvent var2_ref = null;
        GameEvent var2_ref2 = null;
        InfectionEvent var2_ref3 = null;
        PowerupEvent var2_ref4 = null;
        RuntimeException var2_ref5 = null;
        int var3 = 0;
        int[] var3_ref_int__ = null;
        MenuScreen var3_ref_nc = null;
        int var4 = 0;
        CipherPacketBuffer var4_ref_ga = null;
        int[] var4_ref_int__ = null;
        int var5 = 0;
        LevelData var6 = null;
        GameWorld var7 = null;
        PlayerLoadout var8 = null;
        int var9_int = 0;
        GameScreen var9 = null;
        int var10 = 0;
        var10 = field_E ? 1 : 0;
        try {
          TickButtonPainter.field_a = IdleTickHelpers.getIdleTicks(true);
          if (ValidationIconWidget.field_O) {
            if (DialogLayer.canShowAdvert((byte) -122)) {
              if (!IsaacRandom.field_i) {
                IsaacRandom.field_i = true;
                if ((var10 != 0) && (LaboratoryScreen.field_q != NameEntryPopup.field_Ib ||
                  IsaacRandom.field_i)) {
                  IsaacRandom.field_i = false;
                  LaboratoryScreen.field_q = NameEntryPopup.field_Ib;
                }
              }
            } else {
              if (LaboratoryScreen.field_q != NameEntryPopup.field_Ib ||
                IsaacRandom.field_i) {
                IsaacRandom.field_i = false;
                LaboratoryScreen.field_q = NameEntryPopup.field_Ib;
              }
            }
          }
          if (param0 >= -3) {
            return;
          }
          SceneObject.removeFinishedSounds((byte) 20);
          if (null != FullscreenSupport.field_f &&
            FullscreenSupport.field_f.field_e) {
            FullscreenSupport.exitActiveFullscreen(-110);
            MenuFrameHelpers.refreshOpenMenu(-29507);
          }
          stackIn_31_1 = 95;
          stackIn_32_2 = (FullscreenSupport.field_f != null);
          this.serviceFramework((byte) stackIn_31_1, stackIn_32_2);
          if (LoginStartHelpers.field_f) {
            this.openGameArchives(-126);
            LoginStartHelpers.field_f = false;
          }
          PowerupEvent.field_m = PowerupEvent.field_m + 1;
          if (DialogLayer.canShowAdvert((byte) -123)) {
            this.updateLoginFlow(50);
            if (DialogLayer.canShowAdvert((byte) -126)) {
              if (SimZombie.isSessionReady(-88)) {
                discarded$0 = this.advanceLoading(false, 123);
              }
              return;
            }
          }
          boolean decompiledFrameRemainder0 = true;
          if (!ValidationIconWidget.field_O) {
            DialSelectorWidget.updateLoginDialog(ByteStorage.field_d, 1000);
            decompiledFrameRemainder0 = !(!this.advanceLoading(true, 121));
            if (decompiledFrameRemainder0) {
              ValidationIconWidget.field_O = true;
              decompiledFrameRemainder0 = (var10 != 0);
            }
          }
          if (decompiledFrameRemainder0) {
            if (!PendingDataRequest.isPlayerDataReady((byte) 107)) {
              this.pollUnlockAndSettingsReplies(-123);
              decompiledFrameRemainder0 = (var10 != 0);
            }
            if (decompiledFrameRemainder0) {
              if (!PendingDataRequest.isMessageBoxOpen((byte) -68)) {
                if (QuitPageHelpers.deferReconnect(15000)) {
                  stackIn_72_1 = (null != FullscreenSupport.field_f);
                  var2_int = this.updateAccountUi(stackIn_72_1, -124);
                  if (var2_int == 1 ||
                    2 == var2_int) {
                    if (null != FullscreenSupport.field_f) {
                      FullscreenSupport.exitActiveFullscreen(-96);
                    }
                    if (var2_int == 2) {
                      QuitPageHelpers.openQuitPage((java.applet.Applet) (this), false);
                    }
                  }
                  this.updateScreens(true, true);
                  decompiledFrameRemainder0 = (var10 != 0);
                }
                if (decompiledFrameRemainder0) {
                  if (GameCharacter.isMessageBoxOpen((byte) 115)) {
                    if (~TipPanelHelpers.field_i != ~TipPanelHelpers.field_h) {
                      this.updateScreens(true, false);
                      decompiledFrameRemainder0 = (var10 != 0);
                    }
                    if (decompiledFrameRemainder0) {
                      var2_int = SettingsCookieHelpers.pollMenuDialogAction((byte) -85);
                      if (var2_int == 1) {
                        RubbleChunk.setPopupId(IdleTickHelpers.field_b, (byte) -72, MusicVoice.field_g);
                      }
                      this.updateScreens(true, true);
                      decompiledFrameRemainder0 = (var10 != 0);
                    }
                  }
                  if (decompiledFrameRemainder0) {
                    this.updateScreens(true, false);
                    decompiledFrameRemainder0 = (var10 != 0);
                  }
                }
              }
              if (decompiledFrameRemainder0) {
                if (TipPanelHelpers.field_i == TipPanelHelpers.field_h) {
                  var2_int = PendingIntArrayRequest.pollFullscreenDialogAction((byte) -58);
                  switch (var2_int) {
                    case 2:
                      FullscreenSupport.exitActiveFullscreen(-92);
                      break;
                    case 3:
                      MouseInputHandler.field_f = false;
                      ReflectionCheckRequest.toggleFullscreen((byte) -90, true);
                      break;
                    case 4:
                      MouseInputHandler.field_f = true;
                      RubbleChunk.setPopupId(1, (byte) 124, BufferedSocket.field_o);
                      break;
                    default:
                      break;
                  }
                  this.updateScreens(true, true);
                  if (var10 != 0) {
                    this.updateScreens(true, false);
                  }
                } else {
                  this.updateScreens(true, false);
                }
              }
            }
          }
          while (true) {
            stackIn_126_0 = DefaultQuickChatContext.pollIncomingPacket(HotspotTextWidget.field_U, (byte) -126);
            if (stackIn_126_0) {
              stackIn_334_0 = 9;
              stackIn_334_1 = PortalEntryEvent.field_i;
              if (var10 == 0) {
                if (stackIn_334_0 == stackIn_334_1) {
                  ClockAndScreenHelpers.switchToRequestedScreen(-9);
                  CachedTextLayout.field_g = 13;
                  AccountServerResult.field_g = false;
                  ColourPickerWidget.field_Fb = StatusAndMeshHelpers.field_e.readString((byte) -48);
                  continue;
                }
                if (PortalEntryEvent.field_i == 14) {
                  ClockAndScreenHelpers.switchToRequestedScreen(-9);
                  LobbyStateHelpers.initializeLobbyState(StrongCacheEntry.field_E, (byte) 75, PacketBuffer.getLobbyScrollContent(23000), 150, ContextMenuHolder.getGameListContent(-11834), PowerupProgressCard.field_j.length, PowerupProgressCard.nextPowerOfTwo(-122, 4), ChatPanelSetupHelpers.getScrollPaneContent((byte) -110), PowerupProgressCard.nextPowerOfTwo(-123, 500), 1024);
                  AudioPumpThread.field_a[0] = (byte) 16;
                  TextValidationFailure.initializeSocialLists(NetworkGameClient.getPlayerListContent(-55), FullscreenSupport.getIgnoreListContent(28579), true);
                  AccountServerResult.field_g = false;
                  CachedTextLayout.field_g = -2;
                  SupportPageHelpers.field_c = true;
                  continue;
                }
                if (PortalEntryEvent.field_i == 15) {
                  if (SupportPageHelpers.field_c) {
                    ClockAndScreenHelpers.switchToRequestedScreen(-9);
                    QuickChatMenu.closeTransientPopups(1481707568);
                    MusicCrossfadeStream.clearChatHistory(0);
                    MenuInputState.field_b = false;
                    SupportPageHelpers.field_c = false;
                    DisplayNamePanel.field_K = false;
                    AccountTextGlobals.field_e = true;
                    CachedTextLayout.field_g = 1;
                    IntrusiveDequeCursor.field_k = true;
                    if (ValidationState.field_b) {
                      NoticeMenuHelpers.closeChatContext((byte) 16);
                    }
                  }
                  IntroScreen.field_q = false;
                  AccountServerResult.field_g = false;
                  continue;
                }
                if (PortalEntryEvent.field_i == 10 &&
                  SupportPageHelpers.field_c) {
                  LobbyUpdateHandler.readLobbyUpdate(-2061);
                  continue;
                }
                if (PortalEntryEvent.field_i == 57 ||
                  58 == PortalEntryEvent.field_i) {
                  ClockAndScreenHelpers.switchToRequestedScreen(-9);
                  StatusAndMeshHelpers.field_e.readUnsignedByte(31365);
                  var2 = new String[StatusAndMeshHelpers.field_e.readUnsignedByte(31365)];
                  var3 = -2;
                  var3 = StatusAndMeshHelpers.field_e.readUnsignedByte(31365);
                  var4 = 0;
                  while (var4 < var2.length) {
                    var2[var4] = StatusAndMeshHelpers.field_e.readVersionedString(0);
                    var4++;
                  }
                  if (var3 >= 254) {
                    var3 = -2;
                  }
                  var4 = StatusAndMeshHelpers.field_e.readUnsignedByte(31365);
                  var5 = 0;
                  if (var2.length <= 2) {
                    if (var2.length > 1) {
                      var5 = 1;
                    }
                  } else {
                    var5 = 2;
                  }
                  if (var5 == 0) {
                    var4 = 0;
                  }
                  var6 = IterableNodeHashTable.decodeLevelData(LevelFileListHolder.field_d.getLevelFileData((byte) -85, var4), -86);
                  var7 = new GameWorld(var2, var6);
                  var8 = new PlayerLoadout();
                  var7.decodeFromPacket(2, StatusAndMeshHelpers.field_e);
                  var7.field_r = var4;
                  StatusAndMeshHelpers.field_e.readUnsignedByte(31365);
                  if (PortalEntryEvent.field_i == 57) {
                    var9_int = 0;
                    while (var9_int < 5) {
                      dupTemp$1 = StatusAndMeshHelpers.field_e.readUnsignedByte(31365);
                      FullscreenFocusCanvas.field_k.field_m[var9_int] = dupTemp$1;
                      var8.powerupTypes[var9_int] = dupTemp$1;
                      var9_int++;
                    }
                    var9_int = 0;
                    while (var9_int < 5) {
                      dupTemp$2 = StatusAndMeshHelpers.field_e.readUnsignedByte(31365);
                      FullscreenFocusCanvas.field_k.field_g[var9_int] = dupTemp$2;
                      var8.powerupLevels[var9_int] = dupTemp$2;
                      var9_int++;
                    }
                    var9_int = 0;
                    while (var9_int < 3) {
                      dupTemp$3 = StatusAndMeshHelpers.field_e.readUnsignedByte(31365);
                      FullscreenFocusCanvas.field_k.field_s[var9_int] = dupTemp$3;
                      var8.field_c[var9_int] = dupTemp$3;
                      var9_int++;
                    }
                    var8.readPowerupReadyTicks(7054, StatusAndMeshHelpers.field_e);
                  }
                  var9 = new GameScreen(var7, var8, var3);
                  if (57 != PortalEntryEvent.field_i) {
                    MeshMaterial.field_e = var9;
                    DisplayNamePanel.field_K = true;
                    AudioServiceHelpers.field_h = var9;
                  } else {
                    MenuInputState.field_b = true;
                    AudioServiceHelpers.field_h = var9;
                    UnitMoveEvent.field_m = var9;
                    SettingsCookieHelpers.openChatContextState((byte) 68);
                    ValidationState.field_b = true;
                  }
                  CachedTextLayout.field_g = -7;
                  IntroScreen.field_q = false;
                  continue;
                }
                if (PortalEntryEvent.field_i == 59) {
                  if (MenuInputState.field_b ||
                    DisplayNamePanel.field_K) {
                    if (PortalEntryEvent.field_m.teamCount == 1) {
                      continue;
                    }
                    ClockAndScreenHelpers.switchToRequestedScreen(-9);
                    if (MenuInputState.field_b) {
                      UnitMoveEvent.field_m.leaveGame(false, 24295, false);
                    }
                    SceneObject.field_D = 0;
                    AccountTextGlobals.field_e = true;
                    MenuInputState.field_b = false;
                    DisplayNamePanel.field_K = false;
                    CachedTextLayout.field_g = -2;
                    if (ValidationState.field_b) {
                      NoticeMenuHelpers.closeChatContext((byte) 16);
                    }
                    GameScreen.field_bb = false;
                  }
                  IntroScreen.field_q = false;
                  continue;
                }
                if (71 == PortalEntryEvent.field_i) {
                  var2_array = InflaterDecompressor.newEightInts(8);
                  var3_ref_int__ = var2_array;
                  var4_ref_ga = StatusAndMeshHelpers.field_e;
                  var5 = 0;
                  while (var5 < 8) {
                    var3_ref_int__[var5] = ((PacketBuffer) ((Object) var4_ref_ga)).readInt(-1478490344);
                    var5++;
                  }
                  var3_ref_int__ = var2_array;
                  var4_ref_int__ = PacketBuffer.field_n;
                  var5 = 0;
                  while (var5 < 8) {
                    var3_ref_int__[var5] = ScrollPane.bitAnd(var3_ref_int__[var5], ~var4_ref_int__[var5]);
                    var5++;
                  }
                  var3 = 0;
                  while (256 > var3) {
                    stackIn_126_0 = PhaseChangeEvent.isBitSet(var3, 127, var2_array);
                    if (stackIn_126_0) {
                      ChatAndOptionHelpers.field_d.addFirst(new TipPanelHelpers(var3), false);
                      var4_ref_int__ = LevelData.field_m;
                      var5 = var3;
                      var4_ref_int__[var5 >> 5] = PendingStatusRequest.bitOr(var4_ref_int__[var5 >> 5], 1 << ScrollPane.bitAnd(31, var5));
                      var4_ref_int__ = PacketBuffer.field_n;
                      var5 = var3;
                      var4_ref_int__[var5 >> 5] = PendingStatusRequest.bitOr(var4_ref_int__[var5 >> 5], 1 << ScrollPane.bitAnd(31, var5));
                    }
                    var3++;
                  }
                  continue;
                }
                if (PortalEntryEvent.field_i == 61 &&
                  AudioServiceHelpers.field_h == null) {
                  MouseInputHandler.reportClientError("got MOVE without a game", (Throwable) null, false);
                  continue;
                }
                if (AudioServiceHelpers.field_h != null) {
                  if (70 == PortalEntryEvent.field_i) {
                    AudioServiceHelpers.field_h.field_W = StatusAndMeshHelpers.field_e.readShort((byte) -18);
                    AudioServiceHelpers.field_h.field_t = ClockAndScreenHelpers.monotonicMillis((byte) 107);
                    continue;
                  }
                  if (62 == PortalEntryEvent.field_i) {
                    var2_int = StatusAndMeshHelpers.field_e.readUnsignedByte(31365);
                    var3_ref_int__ = new int[PortalEntryEvent.field_m.teamCount];
                    var4 = 0;
                    while (PortalEntryEvent.field_m.teamCount > var4) {
                      var3_ref_int__[var4] = StatusAndMeshHelpers.field_e.readUnsignedShort((byte) 69);
                      PortalEntryEvent.field_m.field_v[var4] = StatusAndMeshHelpers.field_e.readUnsignedShort((byte) 69);
                      PortalEntryEvent.field_m.field_o[var4] = StatusAndMeshHelpers.field_e.readUnsignedShort((byte) 69);
                      var4++;
                    }
                    var4 = StatusAndMeshHelpers.field_e.readUnsignedShort((byte) 69);
                    if (ValidationState.field_b) {
                      NoticeMenuHelpers.closeChatContext((byte) 16);
                      ValidationState.field_b = false;
                    }
                    AudioServiceHelpers.field_h.showGameResults(var2_int, var4, (byte) 121, var3_ref_int__);
                    continue;
                  }
                  if (61 == PortalEntryEvent.field_i) {
                    var2_ref = LoginStartHelpers.readUnitStateEvent((byte) 127, StatusAndMeshHelpers.field_e);
                    AudioServiceHelpers.field_h.receiveEvent(false, var2_ref);
                    continue;
                  }
                  if (PortalEntryEvent.field_i == 72) {
                    var2_ref2 = SpriteState.readChaseEvent(22272, StatusAndMeshHelpers.field_e);
                    AudioServiceHelpers.field_h.receiveEvent(false, var2_ref2);
                    continue;
                  }
                  if (PortalEntryEvent.field_i == 73) {
                    var2_ref3 = LobbyPlayer.readInfectionEvent((byte) 74, StatusAndMeshHelpers.field_e);
                    AudioServiceHelpers.field_h.receiveEvent(false, var2_ref3);
                    continue;
                  }
                  if (PortalEntryEvent.field_i == 79) {
                    AudioServiceHelpers.field_h.receiveEvent(false, ZombieDetonation.readFightEvent(20399, StatusAndMeshHelpers.field_e));
                    continue;
                  }
                  if (PortalEntryEvent.field_i == 81) {
                    AudioServiceHelpers.field_h.receiveEvent(false, DiskArchiveRequest.readUnitMoveEvent((byte) -119, StatusAndMeshHelpers.field_e));
                    continue;
                  }
                  if (PortalEntryEvent.field_i == 78) {
                    AudioServiceHelpers.field_h.receiveEvent(false, ClientTickHelpers.readPhaseChangeEvent(StatusAndMeshHelpers.field_e, 14));
                    continue;
                  }
                  if (PortalEntryEvent.field_i == 74) {
                    AudioServiceHelpers.field_h.receiveEvent(false, LoginForm.readAttackEvent(StatusAndMeshHelpers.field_e, true));
                    continue;
                  }
                  if (PortalEntryEvent.field_i == 77) {
                    AudioServiceHelpers.field_h.receiveEvent(false, Waypoint.readScoreUpdateEvent(StatusAndMeshHelpers.field_e, (byte) -114));
                    continue;
                  }
                  if (PortalEntryEvent.field_i == 76) {
                    AudioServiceHelpers.field_h.receiveEvent(false, ButtonWidget.readPortalEntryEvent(-1, StatusAndMeshHelpers.field_e));
                    continue;
                  }
                  if (PortalEntryEvent.field_i == 80) {
                    var2_ref4 = MenuStyleHelpers.readPowerupEvent(StatusAndMeshHelpers.field_e, -128);
                    if (var2_ref4.field_q == 255) {
                      continue;
                    }
                    AudioServiceHelpers.field_h.receiveEvent(false, var2_ref4);
                    continue;
                  }
                  if (82 == PortalEntryEvent.field_i) {
                    AudioServiceHelpers.field_h.receiveEvent(false, AntialiasedFontHelpers.readEffectResistedEvent(0, StatusAndMeshHelpers.field_e));
                    continue;
                  }
                  if (65 == PortalEntryEvent.field_i) {
                    PortalEntryEvent.field_m.field_j = StatusAndMeshHelpers.field_e.readUnsignedByte(31365);
                    if (null == UnitMoveEvent.field_m) {
                      continue;
                    }
                    MusicPatchNode.field_h.updatePlayAgainCaption(125);
                    continue;
                  }
                  if (PortalEntryEvent.field_i == 64) {
                    var2_int = StatusAndMeshHelpers.field_e.readUnsignedByte(31365);
                    System.out.println(" players resigned: " + Integer.toBinaryString(var2_int));
                    PortalEntryEvent.field_m.field_F = var2_int;
                    continue;
                  }
                  if (PortalEntryEvent.field_i == 66) {
                    StatusAndMeshHelpers.field_e.readUnsignedByte(31365);
                    continue;
                  }
                }
                this.dispatchServerPacket(-13);
                continue;
              }
            } else {
              stackIn_334_0 = 0;
              stackIn_334_1 = 0;
            }
            PowerupProgressCard.flushPackets(stackIn_334_0, stackIn_334_1 != 0);
            if (TutorialAndMenuHelpers.field_f) {
              SceneObject.field_D = 0;
            }
            if (AccountServerResult.isLoggedInWithAccount(80)) {
              var2_int = this.pollReconnectAndResend(10);
              if (var2_int == 0 ||
                var2_int == 1) {
                BufferedFile.clearReflectionChecks((byte) 119);
                if (var2_int == 1) {
                  IntroScreen.field_q = true;
                  AccountServerResult.field_g = true;
                }
                if (var2_int != 1 ||
                  var10 != 0) {
                  if (SupportPageHelpers.field_c) {
                    IntrusiveDequeCursor.field_k = true;
                    AccountTextGlobals.field_e = true;
                    if (MenuInputState.field_b) {
                      ColourPickerWidget.field_Fb = GameScreen.field_V;
                      LevelActorSpawner.requestMenuScreen(false, 13, 127, 1);
                      if (var10 != 0) {
                        LevelActorSpawner.requestMenuScreen(false, 1, 125, 1);
                      }
                    } else {
                      LevelActorSpawner.requestMenuScreen(false, 1, 125, 1);
                    }
                    ClockAndScreenHelpers.switchToRequestedScreen(-9);
                    var3_ref_nc = NoticeMenuHelpers.lookupMenuScreen(2, ArrayWidgetGroup.field_I);
                    if (var3_ref_nc != null) {
                      var3_ref_nc.onEnter(0, false, 0);
                    }
                    DisplayNamePanel.field_K = false;
                    MenuInputState.field_b = false;
                    SupportPageHelpers.field_c = false;
                    if (ValidationState.field_b) {
                      NoticeMenuHelpers.closeChatContext((byte) 16);
                      ValidationState.field_b = false;
                    }
                  }
                  AccountServerResult.field_g = false;
                  IntroScreen.field_q = false;
                }}
              var3 = 0;
              if (var2_int == 2) {
                var3 = 1;
              }
              if (SupportPageHelpers.field_c ||
                AccountServerResult.field_g ||
                IntroScreen.field_q) {
                var3 = 1;
              }
              if (!AccountServerResult.isLoggedInWithAccount(83)) {
                var3 = 0;
              }
              if (var3 != 0) {
                TickButtonPainter.advanceToLoginRequest(-101);
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref5 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var2_ref5), "ZombieDawnMulti.MA(" + param0 + ')');
        }
    }

    public static void releaseStatics(int param0) {
        try {
          field_F = null;
          field_L = (Sprite[][]) null;
          int var1_int = 127 % ((param0 + 76) / 45);
          field_I = null;
          field_K = null;
          field_M = null;
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "ZombieDawnMulti.EA(" + param0 + ')');
        }
    }

    private final void openGameArchives(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (ArchiveRequest.field_s != null) {
            PortalView.loadGraphics(ArchiveRequest.field_s, -65);
            UnitStateEvent.initializeUiStringTables(-6445);
            ArchiveRequest.field_s = null;
            IsaacRandom.resetFrameTimingHistory(26673);
          }
          TickClock.field_a = PendingIntArrayRequest.createResourceArchive(5, 2);
          if (param0 > -117) {
            ZombieDawnMulti.loadAntialiasedFont(-2, (byte) -9, (ResourceArchive) null, (ResourceArchive) null, -109);
          }
          MeltdownPuddleView.field_n = PendingIntArrayRequest.createResourceArchive(5, 3);
          SpriteHotspot.field_m = PendingIntArrayRequest.createResourceArchive(5, 8);
          ChatInputHelpers.field_b = PendingIntArrayRequest.createResourceArchive(5, 4);
          FullscreenSupport.field_e = PendingIntArrayRequest.createResourceArchive(5, 5);
          AwtEventPumpHelpers.field_e = PendingIntArrayRequest.createResourceArchive(5, 6);
          FadingDialog.field_M = PendingIntArrayRequest.createResourceArchive(5, 7);
          DetonationTarget.field_g = PendingIntArrayRequest.createResourceArchive(5, 11);
          RasterSnapshot.field_n = PendingIntArrayRequest.createResourceArchive(5, 12);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var2), "ZombieDawnMulti.LA(" + param0 + ')');
        }
    }

    private final void syncClientWithSimulation(int param0) {
        RuntimeException runtimeException = null;
        GameEvent var2 = null;
        GameEvent var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = field_E ? 1 : 0;
        try {
          UiWidget.field_s.tick(-198);
          if (AccountTextGlobals.field_e) {
            return;
          }
          PortalEntryEvent.field_m.currentTick = param0 + UiWidget.field_s.world.currentTick;
          var2 = (GameEvent) (UiWidget.field_s.eventQueue.last(71));
          while (var2 != null) {
            var3 = (GameEvent) (UiWidget.field_s.eventQueue.previous(6));
            var2.removeFromQueue((byte) -123);
            var2.field_f = var2.field_f + 50;
            AudioServiceHelpers.field_h.receiveEvent(false, var2);
            var2 = var3;
            if (var4 != 0) {
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "ZombieDawnMulti.GA(" + param0 + ')');
        }
    }

    final static AntialiasedBitmapFont loadAntialiasedFont(int param0, byte param1, ResourceArchive param2, ResourceArchive param3, int param4) {
        RuntimeException var5 = null;
        Object stackIn_2_0 = null;
        AntialiasedBitmapFont stackIn_5_0 = null;
        AntialiasedBitmapFont stackIn_7_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!DialSelectorWidget.loadSpriteSheet(param0, param3, param4, (byte) -42)) {
            stackIn_2_0 = null;
            return (AntialiasedBitmapFont) (stackIn_2_0);
          }
          if (param1 == -19) {
            stackIn_7_0 = AntialiasedFontHelpers.createAntialiasedFont(true, param2.getFile(param0, true, param4));
            return stackIn_7_0;
          }
          stackIn_5_0 = (AntialiasedBitmapFont) null;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_11_0 = var5;
          stackIn_11_1 = new StringBuilder().append("ZombieDawnMulti.CA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param4).append(')').toString());
        }
    }

    private final boolean advanceLoading(boolean param0, int param1) {
        int var3_int = 0;
        IndexedSprite[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        IndexedSprite var5 = null;
        int var6 = 0;
        Sprite[] stackIn_160_0 = null;
        int stackIn_160_1 = 0;
        int stackIn_160_2 = 0;
        double stackIn_161_3;
        int stackIn_164_0 = 0;
        int stackIn_164_1 = 0;
        RuntimeException decompiledCaughtException = null;
        Sprite[][] var3_array = null;
        Sprite[][] var4_ref_ja____ = null;
        String[][] var5_array = null;
        int var3_intLifetime1;
        var6 = field_E ? 1 : 0;
        try {
          UnitStateEvent.initializeUiStringTables(-6445);
          if (ChatInputHelpers.field_b != null) {
            if (ResizableDialog.field_eb.ensureIndex((byte) -110) &&
              ResizableDialog.field_eb.isGroupAvailableByName(false, "basic")) {
              if (ResizableDialog.field_eb.ensureIndex((byte) -124) &&
                ResizableDialog.field_eb.isGroupAvailableByName(false, "lobby")) {
                if (LinkButtonPainter.field_f.ensureIndex((byte) -108) &&
                  LinkButtonPainter.field_f.isGroupAvailableByName(false, "lobby")) {
                  if (ResizableDialog.field_eb.ensureIndex((byte) -120) &&
                    ResizableDialog.field_eb.isGroupAvailableByName(false, "arialish12")) {
                    if (LinkButtonPainter.field_f.ensureIndex((byte) -128) &&
                      LinkButtonPainter.field_f.isGroupAvailableByName(false, "arialish12")) {
                      if (ChatInputHelpers.field_b.ensureIndex((byte) -116) &&
                        ChatInputHelpers.field_b.areAllGroupsAvailable(0)) {
                        if (SpriteHotspot.field_m.ensureIndex((byte) -122) &&
                          SpriteHotspot.field_m.areAllGroupsAvailable(0)) {
                          if (FullscreenSupport.field_e.ensureIndex((byte) -114) &&
                            FullscreenSupport.field_e.areAllGroupsAvailable(0)) {
                            if (AwtEventPumpHelpers.field_e.ensureIndex((byte) -118) &&
                              AwtEventPumpHelpers.field_e.areAllGroupsAvailable(0)) {
                              if (FadingDialog.field_M.ensureIndex((byte) -126) &&
                                FadingDialog.field_M.areAllGroupsAvailable(0)) {
                                if (TickClock.field_a.ensureIndex((byte) -115) &&
                                  TickClock.field_a.areAllGroupsAvailable(0)) {
                                  if (MeltdownPuddleView.field_n.ensureIndex((byte) -124) &&
                                    MeltdownPuddleView.field_n.areAllGroupsAvailable(0)) {
                                    if (DetonationTarget.field_g.ensureIndex((byte) -111) &&
                                      DetonationTarget.field_g.areAllGroupsAvailable(0)) {
                                      if (RasterSnapshot.field_n.ensureIndex((byte) -121) &&
                                        RasterSnapshot.field_n.areAllGroupsAvailable(0)) {
                                        LoginForm.setLoadingProgress(65.0f, 80, PackedArrayHelpers.field_b);
                                        if (!param0) {
                                          return false;
                                        }
                                        LoginDialog.finishUiAnimations(-121);
                                        this.drawFrame(-30169);
                                        MidiPcmStream.field_Q = new SoundCache(ChatInputHelpers.field_b, FullscreenSupport.field_e);
                                        LayoutCenterHelpers.field_a[68] = SoundEffect.loadNamed(ChatInputHelpers.field_b, "", "zombie_dawn_menu_button").toPcmSample();
                                        LayoutCenterHelpers.field_a[69] = SoundEffect.loadNamed(ChatInputHelpers.field_b, "", "zombie_dawn_menu_screen_mouseover").toPcmSample();
                                        LayoutCenterHelpers.field_a[0] = SoundEffect.loadNamed(ChatInputHelpers.field_b, "", "zombie_detonate").toPcmSample();
                                        LayoutCenterHelpers.field_a[44] = SoundEffect.loadNamed(ChatInputHelpers.field_b, "", "zombie_dawn_gunfire").toPcmSample();
                                        LayoutCenterHelpers.field_a[45] = SoundEffect.loadNamed(ChatInputHelpers.field_b, "", "zombie_dawn_shotgun_fire").toPcmSample();
                                        LayoutCenterHelpers.field_a[8] = SoundEffect.loadNamed(ChatInputHelpers.field_b, "", "zombie_dawn_machinegun_fire").toPcmSample();
                                        LayoutCenterHelpers.field_a[20] = SoundEffect.loadNamed(ChatInputHelpers.field_b, "", "zombie_dawn_click_mouse").toPcmSample();
                                        LayoutCenterHelpers.field_a[30] = SoundEffect.loadNamed(ChatInputHelpers.field_b, "", "zombie_dawn_thump_1").toPcmSample();
                                        LayoutCenterHelpers.field_a[31] = SoundEffect.loadNamed(ChatInputHelpers.field_b, "", "zombie_dawn_thump_2").toPcmSample();
                                        LayoutCenterHelpers.field_a[32] = SoundEffect.loadNamed(ChatInputHelpers.field_b, "", "zombie_dawn_swipe_1").toPcmSample();
                                        LayoutCenterHelpers.field_a[33] = SoundEffect.loadNamed(ChatInputHelpers.field_b, "", "zombie_dawn_swipe_2").toPcmSample();
                                        LayoutCenterHelpers.field_a[34] = SoundEffect.loadNamed(ChatInputHelpers.field_b, "", "zombie_dawn_slap_1").toPcmSample();
                                        LayoutCenterHelpers.field_a[47] = SoundEffect.loadNamed(ChatInputHelpers.field_b, "", "zombie_dawn_second_tick").toPcmSample();
                                        LayoutCenterHelpers.field_a[53] = SoundEffect.loadNamed(ChatInputHelpers.field_b, "", "zombie_dawn_reactor_ambience").toPcmSample();
                                        LayoutCenterHelpers.field_a[54] = SoundEffect.loadNamed(ChatInputHelpers.field_b, "", "zombie_dawn_score_10").toPcmSample();
                                        LayoutCenterHelpers.field_a[55] = SoundEffect.loadNamed(ChatInputHelpers.field_b, "", "zombie_dawn_score_20").toPcmSample();
                                        LayoutCenterHelpers.field_a[56] = SoundEffect.loadNamed(ChatInputHelpers.field_b, "", "zombie_dawn_score_30").toPcmSample();
                                        LayoutCenterHelpers.field_a[57] = SoundEffect.loadNamed(ChatInputHelpers.field_b, "", "zombie_dawn_countup_victims").toPcmSample();
                                        LayoutCenterHelpers.field_a[58] = SoundEffect.loadNamed(ChatInputHelpers.field_b, "", "zombie_dawn_countup_score").toPcmSample();
                                        LayoutCenterHelpers.field_a[59] = SoundEffect.loadNamed(ChatInputHelpers.field_b, "", "zombie_dawn_click_mouse_wrong").toPcmSample();
                                        LayoutCenterHelpers.field_a[63] = SoundEffect.loadNamed(ChatInputHelpers.field_b, "", "zombie_dawn_gun_empty").toPcmSample();
                                        LayoutCenterHelpers.field_a[12] = SoundEffect.loadNamed(ChatInputHelpers.field_b, "", "zombie_dawn_squelch_3").toPcmSample();
                                        LayoutCenterHelpers.field_a[66] = SoundEffect.loadNamed(ChatInputHelpers.field_b, "", "zombie_dawn_squelch_2_AND_3").toPcmSample();
                                        LayoutCenterHelpers.field_a[64] = SoundEffect.loadNamed(ChatInputHelpers.field_b, "", "zombie_dawn_smash_wood_and_glass_1").toPcmSample();
                                        LayoutCenterHelpers.field_a[65] = SoundEffect.loadNamed(ChatInputHelpers.field_b, "", "zombie_dawn_smash_wood_and_glass_2").toPcmSample();
                                        LayoutCenterHelpers.field_a[67] = SoundEffect.loadNamed(ChatInputHelpers.field_b, "", "zombie_dawn_use_powerup").toPcmSample();
                                        LayoutCenterHelpers.field_a[36] = SoundEffect.loadNamed(ChatInputHelpers.field_b, "", "zombie_dawn_bounce").toPcmSample();
                                        LayoutCenterHelpers.field_a[35] = SoundEffect.loadNamed(ChatInputHelpers.field_b, "", "zd_multi_hammer").toPcmSample();
                                        LayoutCenterHelpers.field_a[81] = SoundEffect.loadNamed(ChatInputHelpers.field_b, "", "zd_multi_barrier").toPcmSample();
                                        LayoutCenterHelpers.field_a[82] = SoundEffect.loadNamed(ChatInputHelpers.field_b, "", "zd_multi_bonefall").toPcmSample();
                                        LayoutCenterHelpers.field_a[83] = SoundEffect.loadNamed(ChatInputHelpers.field_b, "", "zd_multi_breach").toPcmSample();
                                        LayoutCenterHelpers.field_a[84] = SoundEffect.loadNamed(ChatInputHelpers.field_b, "", "zd_multi_charm").toPcmSample();
                                        LayoutCenterHelpers.field_a[85] = SoundEffect.loadNamed(ChatInputHelpers.field_b, "", "zd_multi_fireball").toPcmSample();
                                        LayoutCenterHelpers.field_a[86] = SoundEffect.loadNamed(ChatInputHelpers.field_b, "", "zd_multi_haze").toPcmSample();
                                        LayoutCenterHelpers.field_a[87] = SoundEffect.loadNamed(ChatInputHelpers.field_b, "", "zd_multi_place_ability").toPcmSample();
                                        LayoutCenterHelpers.field_a[88] = SoundEffect.loadNamed(ChatInputHelpers.field_b, "", "zd_multi_portal_ambience").toPcmSample();
                                        LayoutCenterHelpers.field_a[89] = SoundEffect.loadNamed(ChatInputHelpers.field_b, "", "zd_multi_quake").toPcmSample();
                                        LayoutCenterHelpers.field_a[90] = SoundEffect.loadNamed(ChatInputHelpers.field_b, "", "zd_multi_select_ability").toPcmSample();
                                        LayoutCenterHelpers.field_a[91] = SoundEffect.loadNamed(ChatInputHelpers.field_b, "", "zd_multi_select_tree").toPcmSample();
                                        ChatInputHelpers.field_b = null;
                                        IsaacRandom.resetFrameTimingHistory(26673);
                                        return false;
                                      }
                                      LoginForm.setLoadingProgress(80.0f, 80, PhantomDecoy.formatArchiveProgress(StatusAndMeshHelpers.field_h, (byte) 113, RasterSnapshot.field_n, FramePainter.field_a));
                                      return false;
                                    }
                                    LoginForm.setLoadingProgress(75.0f, 80, SpriteHotspot.formatArchiveGroupProgress(FramePainter.field_a, "", DetonationTarget.field_g, (byte) 76, StatusAndMeshHelpers.field_h));
                                    return false;
                                  }
                                  LoginForm.setLoadingProgress(60.0f, 80, SpriteHotspot.formatArchiveGroupProgress(DisplayMode.field_b, "", MeltdownPuddleView.field_n, (byte) 76, GlintButtonHelpers.field_b));
                                  return false;
                                }
                                LoginForm.setLoadingProgress(50.0f, 80, SpriteHotspot.formatArchiveGroupProgress(GlintButtonHelpers.field_a, "", TickClock.field_a, (byte) 76, LayoutCenterHelpers.field_e));
                                return false;
                              }
                              LoginForm.setLoadingProgress(40.0f, 80, SpriteHotspot.formatArchiveGroupProgress(PasswordTextPainter.field_A, "", FadingDialog.field_M, (byte) 76, SharedTransportGlobals.field_d));
                              return false;
                            }
                            LoginForm.setLoadingProgress(30.0f, 80, AlignedIconLabel.formatArchiveProgress(DirectByteStorage.field_k, 0, -3, DelayedPacket.field_o, AwtEventPumpHelpers.field_e));
                            return false;
                          }
                          LoginForm.setLoadingProgress(20.0f, 80, SpriteHotspot.formatArchiveGroupProgress(PowerupBar.field_i, "", FullscreenSupport.field_e, (byte) 76, ArmedHumanView.field_tb));
                          return false;
                        }
                        LoginForm.setLoadingProgress(15.0f, 80, SpriteHotspot.formatArchiveGroupProgress(SocialRequestHelpers.field_f, "", SpriteHotspot.field_m, (byte) 76, SpriteAlphaBuffers.field_c));
                        return false;
                      }
                      LoginForm.setLoadingProgress(10.0f, 80, SpriteHotspot.formatArchiveGroupProgress(PowerupBar.field_i, "", ChatInputHelpers.field_b, (byte) 76, ArmedHumanView.field_tb));
                      return false;
                    }
                    LoginForm.setLoadingProgress(5.0f, 80, SpriteHotspot.formatArchiveGroupProgress(GlintButtonHelpers.field_a, "arialish12", LinkButtonPainter.field_f, (byte) 76, LayoutCenterHelpers.field_e));
                    return false;
                  }
                  LoginForm.setLoadingProgress(4.0f, 80, SpriteHotspot.formatArchiveGroupProgress(GlintButtonHelpers.field_a, "arialish12", ResizableDialog.field_eb, (byte) 76, LayoutCenterHelpers.field_e));
                  return false;
                }
                LoginForm.setLoadingProgress(17.0f, 80, SpriteHotspot.formatArchiveGroupProgress(DisplayMode.field_b, "lobby", LinkButtonPainter.field_f, (byte) 76, GlintButtonHelpers.field_b));
                return false;
              }
              LoginForm.setLoadingProgress(3.0f, 80, SpriteHotspot.formatArchiveGroupProgress(GlintButtonHelpers.field_a, "basic", ResizableDialog.field_eb, (byte) 76, LayoutCenterHelpers.field_e));
              return false;
            }
            LoginForm.setLoadingProgress(3.0f, 80, SpriteHotspot.formatArchiveGroupProgress(GlintButtonHelpers.field_a, "basic", ResizableDialog.field_eb, (byte) 76, LayoutCenterHelpers.field_e));
            return false;
          }
          if (FullscreenSupport.field_e != null) {
            LoginForm.setLoadingProgress(70.0f, 80, PackedArrayHelpers.field_b);
            this.drawFrame(-30169);
            LayoutCenterHelpers.field_a[37] = VorbisSample.load(FullscreenSupport.field_e, "", "zombie_dawn_human_female_ow").decodeAllToPcm();
            LayoutCenterHelpers.field_a[38] = VorbisSample.load(FullscreenSupport.field_e, "", "zombie_dawn_human_female_eek").decodeAllToPcm();
            LayoutCenterHelpers.field_a[39] = VorbisSample.load(FullscreenSupport.field_e, "", "zombie_dawn_human_female_oof").decodeAllToPcm();
            LayoutCenterHelpers.field_a[40] = VorbisSample.load(FullscreenSupport.field_e, "", "zombie_dawn_human_male_oof").decodeAllToPcm();
            LayoutCenterHelpers.field_a[41] = VorbisSample.load(FullscreenSupport.field_e, "", "zombie_dawn_human_male_argh").decodeAllToPcm();
            LayoutCenterHelpers.field_a[42] = VorbisSample.load(FullscreenSupport.field_e, "", "zombie_dawn_human_male_urgh").decodeAllToPcm();
            LayoutCenterHelpers.field_a[43] = VorbisSample.load(FullscreenSupport.field_e, "", "zombie_dawn_human_male_uuh").decodeAllToPcm();
            LayoutCenterHelpers.field_a[46] = VorbisSample.load(FullscreenSupport.field_e, "", "zombie_dawn_use_powerup").decodeAllToPcm();
            LayoutCenterHelpers.field_a[48] = VorbisSample.load(FullscreenSupport.field_e, "", "zombie_dawn_cinema_ambience").decodeAllToPcm();
            LayoutCenterHelpers.field_a[26] = VorbisSample.load(FullscreenSupport.field_e, "", "zombie_dawn_female_scream_1").decodeAllToPcm();
            LayoutCenterHelpers.field_a[27] = VorbisSample.load(FullscreenSupport.field_e, "", "zombie_dawn_female_scream_2").decodeAllToPcm();
            LayoutCenterHelpers.field_a[28] = VorbisSample.load(FullscreenSupport.field_e, "", "zombie_dawn_female_scream_4").decodeAllToPcm();
            LayoutCenterHelpers.field_a[29] = LayoutCenterHelpers.field_a[28];
            LayoutCenterHelpers.field_a[49] = VorbisSample.load(FullscreenSupport.field_e, "", "zombie_dawn_male_scream_1").decodeAllToPcm();
            LayoutCenterHelpers.field_a[50] = VorbisSample.load(FullscreenSupport.field_e, "", "zombie_dawn_male_scream_2").decodeAllToPcm();
            LayoutCenterHelpers.field_a[51] = VorbisSample.load(FullscreenSupport.field_e, "", "zombie_dawn_male_scream_3").decodeAllToPcm();
            LayoutCenterHelpers.field_a[52] = VorbisSample.load(FullscreenSupport.field_e, "", "zombie_dawn_female_scream_3").decodeAllToPcm();
            LayoutCenterHelpers.field_a[9] = VorbisSample.load(FullscreenSupport.field_e, "", "zombie_dawn_collect_powerup").decodeAllToPcm();
            LayoutCenterHelpers.field_a[15] = VorbisSample.load(FullscreenSupport.field_e, "", "zombie_chase_human_male").decodeAllToPcm();
            LayoutCenterHelpers.field_a[25] = VorbisSample.load(FullscreenSupport.field_e, "", "zombie_chase_human_female").decodeAllToPcm();
            LayoutCenterHelpers.field_a[17] = VorbisSample.load(FullscreenSupport.field_e, "", "zombie_screech").decodeAllToPcm();
            LayoutCenterHelpers.field_a[70] = VorbisSample.load(FullscreenSupport.field_e, "", "zombie_groan_short_1").decodeAllToPcm();
            LayoutCenterHelpers.field_a[71] = VorbisSample.load(FullscreenSupport.field_e, "", "zombie_groan_short_2").decodeAllToPcm();
            LayoutCenterHelpers.field_a[72] = VorbisSample.load(FullscreenSupport.field_e, "", "zombie_groan_female_3").decodeAllToPcm();
            LayoutCenterHelpers.field_a[73] = VorbisSample.load(FullscreenSupport.field_e, "", "zombie_groan_female_4").decodeAllToPcm();
            LayoutCenterHelpers.field_a[93] = VorbisSample.load(FullscreenSupport.field_e, "", "zd_multi_bird_twitter").decodeAllToPcm();
            LayoutCenterHelpers.field_a[92] = VorbisSample.load(FullscreenSupport.field_e, "", "zd_multi_cloak_of_fear").decodeAllToPcm();
            LayoutCenterHelpers.field_a[75] = VorbisSample.load(FullscreenSupport.field_e, "", "zd_multi_counter").decodeAllToPcm();
            LayoutCenterHelpers.field_a[76] = VorbisSample.load(FullscreenSupport.field_e, "", "ZD_multi_human_into_portal_female").decodeAllToPcm();
            LayoutCenterHelpers.field_a[77] = VorbisSample.load(FullscreenSupport.field_e, "", "ZD_multi_human_into_portal_male").decodeAllToPcm();
            LayoutCenterHelpers.field_a[78] = VorbisSample.load(FullscreenSupport.field_e, "", "zd_multi_zombie_into_portal").decodeAllToPcm();
            LayoutCenterHelpers.field_a[79] = VorbisSample.load(FullscreenSupport.field_e, "", "zd_multi_into_portal_opponent").decodeAllToPcm();
            LayoutCenterHelpers.field_a[80] = VorbisSample.load(FullscreenSupport.field_e, "", "zd_multi_shackles").decodeAllToPcm();
            FullscreenSupport.field_e = null;
            IsaacRandom.resetFrameTimingHistory(26673);
            return false;
          }
          if (null != FadingDialog.field_M) {
            LoginForm.setLoadingProgress(75.0f, 80, SoundCache.field_e);
            this.drawFrame(-30169);
            LobbyStateHelpers.field_d[0] = MusicTrack.load(FadingDialog.field_M, "", "ZD_multi_TITLESCREEn");
            LobbyStateHelpers.field_d[10] = MusicTrack.load(FadingDialog.field_M, "", "ZD_multi_laboratory");
            LobbyStateHelpers.field_d[12] = MusicTrack.load(FadingDialog.field_M, "", "ZD_multi_PANIC_LOOP");
            LobbyStateHelpers.field_d[11] = MusicTrack.load(FadingDialog.field_M, "", "ZD_multi_GAME_FINISH");
            LobbyStateHelpers.field_d[13] = MusicTrack.load(FadingDialog.field_M, "", "ZD_multi_GAME_WIN");
            LobbyStateHelpers.field_d[14] = MusicTrack.load(FadingDialog.field_M, "", "ZD_multi_GAME_LOSE");
            LobbyStateHelpers.field_d[1] = MusicTrack.load(FadingDialog.field_M, "", "zombie dawn mall");
            LobbyStateHelpers.field_d[2] = MusicTrack.load(FadingDialog.field_M, "", "zombie dawn powerplant");
            LobbyStateHelpers.field_d[3] = MusicTrack.load(FadingDialog.field_M, "", "zombie dawn precinct");
            LobbyStateHelpers.field_d[4] = MusicTrack.load(FadingDialog.field_M, "", "zombie dawn white house");
            LobbyStateHelpers.field_d[9] = MusicTrack.load(FadingDialog.field_M, "", "zombie dawn instructions loop");
            FadingDialog.field_M = null;
            IsaacRandom.resetFrameTimingHistory(26673);
            return false;
          }
          if (param1 <= 75) {
            return true;
          }
          if (null != AwtEventPumpHelpers.field_e) {
            LoginForm.setLoadingProgress(77.0f, 80, SoundCache.field_e);
            this.drawFrame(-30169);
            var3_int = 0;
            boolean decompiledNaturalLoopExit1 = false;
            while (!(decompiledNaturalLoopExit1 = (var3_int >= 15))) {
              if (var6 == 0) {
                if (LobbyStateHelpers.field_d[var3_int] != null &&
                  !MessageDialogContent.field_L.prepareTrack(-10783, MidiPcmStream.field_Q, 176400, LobbyStateHelpers.field_d[var3_int], AwtEventPumpHelpers.field_e)) {
                  IsaacRandom.resetFrameTimingHistory(26673);
                  return false;
                }
                var3_int++;
                continue;
              }
              break;
            }
            if (decompiledNaturalLoopExit1) {
              MessageDialogContent.field_L.releasePatchSamples(125);
              AwtEventPumpHelpers.field_e = null;
              MidiPcmStream.field_Q = null;
              IsaacRandom.resetFrameTimingHistory(26673);
            }
            return false;
          }
          if (null != SpriteHotspot.field_m) {
            LoginForm.setLoadingProgress(80.0f, 80, ClockAndScreenHelpers.field_b);
            this.drawFrame(-30169);
            LevelFileListHolder.field_d = LevelFileCatalog.loadLevelFiles(SpriteHotspot.field_m, -2852);
            BufferedFile.field_e[0] = new Sprite(SpriteHotspot.field_m.getNamedFile("", "background1.jpg", false), (java.awt.Component) ((Object) NameEntryPopup.field_Ib));
            FeatureSupportHelpers.field_d = new Sprite(SpriteHotspot.field_m.getNamedFile("", "panorama.jpg", false), (java.awt.Component) ((Object) NameEntryPopup.field_Ib));
            SpriteHotspot.field_m = null;
            IsaacRandom.resetFrameTimingHistory(26673);
            return false;
          }
          if (null != ResizableDialog.field_eb &&
            null != TickClock.field_a) {
            LoginForm.setLoadingProgress(85.0f, 80, LevelFileListHolder.field_c);
            this.drawFrame(-30169);
            MatchingTextValidator.field_w = Under13NoticePanel.loadBinaryFontByName(ResizableDialog.field_eb, 4, LinkButtonPainter.field_f, "", "arialish12");
            if (!LinkButtonPainter.field_a) {
              InflaterDecompressor.loadIndexedSpritesByName("locked", ResizableDialog.field_eb, (byte) 19, "basic");
              WhirlpoolHasher.field_l = InflaterDecompressor.loadIndexedSpritesByName("unachieved", ResizableDialog.field_eb, (byte) 19, "basic")[0];
              BufferedFile.field_k = ByteArrayPool.loadSpriteByName("basic", "orbcoin", ResizableDialog.field_eb, 11091);
              CheckboxWidget.padToFourPixelAlignment(100, BufferedFile.field_k);
              var3_array = new Sprite[2][];
              var3_array[0] = EffectAudioHelpers.loadSpritesByName("", TickClock.field_a, -256, "levelstyle_iconssmall");
              var3_array[1] = null;
              var4_ref_ja____ = new Sprite[1][];
              var4_ref_ja____[0] = EffectAudioHelpers.loadSpritesByName("", TickClock.field_a, -256, "levelstyle_iconslarge");
              var5_array = EffectVolumeHelpers.field_e;
              LoginDialog.initializeLobbyAssets(var5_array, LinkButtonPainter.field_f, true, (String[][]) null, field_K, ResizableDialog.field_eb, 4, InflaterDecompressor.field_b, RasterSnapshot.field_n, 1, PowerupProgressCard.field_j, StrongCacheEntry.field_E, true, var3_array, var4_ref_ja____);
              LoginMethod.field_e = true;
              ReflectionCheckRequest.initializeChatHistory(200, -82);
              DraggableWidget.setBenefitsArchives(LinkButtonPainter.field_f, ResizableDialog.field_eb, (byte) 23);
              LoginMethod.readGameAppletParameters(16777215, 0, 0, FlaggedTextValue.field_b, 0, (java.applet.Applet) (this));
            }
            LinkButtonPainter.field_f = null;
            ResizableDialog.field_eb = null;
            IsaacRandom.resetFrameTimingHistory(26673);
            LoginForm.setLoadingProgress(90.0f, 80, LevelFileListHolder.field_c);
            this.drawFrame(-30169);
            TranslatedUiText.field_e = SocketJs5Transport.loadPaletteFont(TickClock.field_a, MeltdownPuddleView.field_n, "", 4, "font");
            TertiaryLinkNode.field_r = IntroScreen.loadNamedSprite((byte) -46, "", "font_title", MeltdownPuddleView.field_n, TickClock.field_a);
            EffectAudioHelpers.field_e = Under13NoticePanel.loadBinaryFontByName(TickClock.field_a, 4, MeltdownPuddleView.field_n, "font_medium", "");
            TransitionPhase.scaleIconToFont(EffectAudioHelpers.field_e, 0);
            KeyMapHelpers.mapTextColoursToPalette(true);
            LoginSuccessHelpers.field_a = new IndexedSprite[7][];
            LoginSuccessHelpers.field_a[0] = InflaterDecompressor.loadIndexedSpritesByName("cursor_grab", TickClock.field_a, (byte) 19, "");
            LoginSuccessHelpers.field_a[1] = InflaterDecompressor.loadIndexedSpritesByName("cursor_point", TickClock.field_a, (byte) 19, "");
            LoginSuccessHelpers.field_a[6] = InflaterDecompressor.loadIndexedSpritesByName("cursor_point_forbidden", TickClock.field_a, (byte) 19, "");
            LoginSuccessHelpers.field_a[2] = InflaterDecompressor.loadIndexedSpritesByName("cursor_reticule", TickClock.field_a, (byte) 19, "");
            LoginSuccessHelpers.field_a[3] = InflaterDecompressor.loadIndexedSpritesByName("cursor_poweringup", TickClock.field_a, (byte) 19, "");
            LoginSuccessHelpers.field_a[5] = InflaterDecompressor.loadIndexedSpritesByName("cursor_targeting", TickClock.field_a, (byte) 19, "");
            LoginSuccessHelpers.field_a[4] = InflaterDecompressor.loadIndexedSpritesByName("cursor_idle", TickClock.field_a, (byte) 19, "");
            MessageDialogContent.field_P = MenuStyleHelpers.loadSpriteSheetByName(-22, "", TickClock.field_a, "intro_1");
            Js5ArchiveManager.field_c = MenuStyleHelpers.loadSpriteSheetByName(-127, "", TickClock.field_a, "intro_2");
            ClockAndScreenHelpers.field_g = MenuStyleHelpers.loadSpriteSheetByName(88, "", TickClock.field_a, "intro_3");
            ColourPickerWidget.field_Lb = MenuStyleHelpers.loadSpriteSheetByName(47, "", TickClock.field_a, "menu_pipe1");
            LobbyPlayer.field_Wb = MenuStyleHelpers.loadSpriteSheetByName(-122, "", TickClock.field_a, "menu_pipe2");
            AccountCreationHelpers.field_c = MenuStyleHelpers.loadSpriteSheetByName(-126, "", TickClock.field_a, "menu_pipebox");
            MenuStyleHelpers.loadSpriteSheetByName(-121, "", TickClock.field_a, "menu_pipebox2");
            QuickChatHelpDialog.field_Jb = MenuStyleHelpers.loadSpriteSheetByName(97, "", TickClock.field_a, "menu_title");
            DefaultQuickChatContext.field_g = MenuStyleHelpers.loadSpriteSheetByName(-118, "", TickClock.field_a, "menu_title_blank");
            QuickChatCommandType.field_b = new Sprite[DisplayMode.field_g.length];
            var3_intLifetime1 = 0;
            boolean decompiledNaturalLoopExit0 = false;
            while (!(decompiledNaturalLoopExit0 = (!(QuickChatCommandType.field_b.length > var3_intLifetime1)))) {
              stackIn_164_0 = ~DisplayMode.field_g[var3_intLifetime1].length();
              stackIn_164_1 = -1;
              if (var6 == 0) {
                if (stackIn_164_0 < stackIn_164_1) {
                  stackIn_160_0 = QuickChatCommandType.field_b;
                  stackIn_160_1 = var3_intLifetime1;
                  stackIn_160_2 = 113;
                  if (var3_intLifetime1 != 15) {
                    stackIn_161_3 = 1.0;
                  } else {
                    stackIn_161_3 = 0.65;
                  }
                  stackIn_160_0[stackIn_160_1] = IterableNodeHashTable.createTitleBannerSprite(stackIn_160_2, stackIn_161_3, var3_intLifetime1);
                }
                var3_intLifetime1++;
                continue;
              }
              break;
            }
            if (decompiledNaturalLoopExit0) {
              FullscreenErrorDialog.field_lb = ByteArrayPool.loadSpriteByName("", "lobby_game_logo", TickClock.field_a, 11091);
              ClientProtocolStage.field_e = MenuStyleHelpers.loadSpriteSheetByName(-117, "", TickClock.field_a, "help_arrow");
              StatefulTextPainter.field_u = MenuStyleHelpers.loadSpriteSheetByName(-119, "", TickClock.field_a, "info_help_button");
              RankingEntry.field_k = ClientProtocolStage.field_e.copy();
              RankingEntry.field_k.flipHorizontally();
              ArchiveLoadSequence.field_m = ClientProtocolStage.field_e.copy();
              ArchiveLoadSequence.field_m.rotateClockwise();
              AttackEvent.field_n = ClientProtocolStage.field_e.copy();
              AttackEvent.field_n.rotateCounterclockwise();
              PowerGaugeHelpers.field_c = MenuStyleHelpers.loadSpriteSheetByName(-116, "", TickClock.field_a, "battery_small_empty");
              BirthDateValidator.field_p = MenuStyleHelpers.loadSpriteSheetByName(-117, "", TickClock.field_a, "battery_big_empty");
              MenuStyleHelpers.loadSpriteSheetByName(-121, "", TickClock.field_a, "battery_big_full");
              InstructionsScreen.field_n = ByteArrayPool.loadSpriteByName("", "vat", TickClock.field_a, 11091);
              MenuStyleHelpers.loadSpriteSheetByName(70, "", TickClock.field_a, "vat_outline");
              BirthDateInputWidget.field_X = MenuStyleHelpers.loadSpriteSheetByName(47, "", TickClock.field_a, "lab_pipe");
              Camera.field_w = ByteArrayPool.loadSpriteByName("", "lab_box_1", TickClock.field_a, 11091);
              MenuStyleHelpers.loadSpriteSheetByName(-122, "", TickClock.field_a, "lab_box_2");
              MenuStyleHelpers.loadSpriteSheetByName(-125, "", TickClock.field_a, "lab_box_3");
              MenuStyleHelpers.loadSpriteSheetByName(-123, "", TickClock.field_a, "lab_box_1_outline");
              MenuStyleHelpers.loadSpriteSheetByName(15, "", TickClock.field_a, "lab_box_2_outline");
              MenuStyleHelpers.loadSpriteSheetByName(-118, "", TickClock.field_a, "lab_box_3_outline");
              ScoreUpdateEvent.field_m = ByteArrayPool.loadSpriteByName("", "lab_tree_frame_bw", TickClock.field_a, 11091);
              LobbySlideLayout.field_e = MenuStyleHelpers.loadSpriteSheetByName(15, "", TickClock.field_a, "lab_menu_bg_center");
              CredentialKind.field_f = MenuStyleHelpers.loadSpriteSheetByName(95, "", TickClock.field_a, "lab_menu_bg_bottom");
              MenuStyleHelpers.loadSpriteSheetByName(4, "", TickClock.field_a, "lab_tree_bg");
              SimHuman.field_eb = ByteArrayPool.loadSpriteByName("", "slider", TickClock.field_a, 11091);
              StatusAndMeshHelpers.field_c = MenuStyleHelpers.loadSpriteSheetByName(14, "", TickClock.field_a, "research_trait_slot");
              ChatInputHelpers.field_a = MenuStyleHelpers.loadSpriteSheetByName(-119, "", TickClock.field_a, "research_powerup_modifier_slot");
              LabeledChildWidget.field_E = MenuStyleHelpers.loadSpriteSheetByName(-120, "", TickClock.field_a, "forbidden_big");
              MusicPatchEnvelope.field_d = MenuStyleHelpers.loadSpriteSheetByName(-124, "", TickClock.field_a, "scrollbar_arrow_over");
              PhaseChangeEvent.field_k = ByteArrayPool.loadSpriteByName("", "scrollbar_arrow_off", TickClock.field_a, 11091);
              FadingDialog.field_Q = EffectAudioHelpers.loadSpritesByName("", TickClock.field_a, -256, "scrollbar_block");
              ScorePopup.field_M = EffectAudioHelpers.loadSpritesByName("", TickClock.field_a, -256, "scrollbar_background");
              FriendListHelpers.field_m = MenuStyleHelpers.loadSpriteSheetByName(102, "", TickClock.field_a, "scrollbar_bg");
              MenuStyleHelpers.loadSpriteSheetByName(-127, "", TickClock.field_a, "scrollbar_bar_h");
              MenuStyleHelpers.loadSpriteSheetByName(79, "", TickClock.field_a, "scrollbar_bar_v");
              QueuedListRequest.field_f = MusicPatchEnvelope.field_d.copy();
              SimEntity.field_J = PhaseChangeEvent.field_k.copy();
              RandomHelpers.field_t = FriendListHelpers.field_m.copy();
              QueuedListRequest.field_f.rotateCounterclockwise();
              SimEntity.field_J.rotateCounterclockwise();
              RandomHelpers.field_t.rotateCounterclockwise();
              Js5Transport.field_h = MenuStyleHelpers.loadSpriteSheetByName(-126, "", TickClock.field_a, "results_tube");
              AlphaChildWidget.field_I = MenuStyleHelpers.loadSpriteSheetByName(0, "", TickClock.field_a, "crate_box");
              PowerupCommand.field_m = MenuStyleHelpers.loadSpriteSheetByName(-42, "", TickClock.field_a, "curve_tube");
              DateInputWidget.field_J = MenuStyleHelpers.loadSpriteSheetByName(24, "", TickClock.field_a, "curve_tube_empty");
              FrameCycleAnimation.field_i = MenuStyleHelpers.loadSpriteSheetByName(93, "", TickClock.field_a, "empty_jar");
              SingleChildWidget.field_C = MenuStyleHelpers.loadSpriteSheetByName(-124, "", TickClock.field_a, "main_tube");
              ResourceArchive.field_f = MenuStyleHelpers.loadSpriteSheetByName(-122, "", TickClock.field_a, "plug_01");
              MiasmaPuff.field_l = MenuStyleHelpers.loadSpriteSheetByName(35, "", TickClock.field_a, "plug_02");
              PowerupAuraEffect.field_o = MenuStyleHelpers.loadSpriteSheetByName(56, "", TickClock.field_a, "vert_tube");
              LobbyDrawHelpers.field_f = MenuStyleHelpers.loadSpriteSheetByName(109, "", TickClock.field_a, "vert_tube_empty");
              TextInputWidget.field_N = MenuStyleHelpers.loadSpriteSheetByName(31, "", TickClock.field_a, "curve_tube_mask");
              MusicCrossfadeStream.field_z = MenuStyleHelpers.loadSpriteSheetByName(116, "", TickClock.field_a, "vert_tube_mask");
              MenuStyleHelpers.loadSpriteSheetByName(27, "", TickClock.field_a, "stars");
              UsernameCredentials.field_q = InflaterDecompressor.loadIndexedSpritesByName("engine_icons", TickClock.field_a, (byte) 19, "");
              PowerGaugeHelpers.field_e = MenuStyleHelpers.loadSpriteSheetByName(-126, "", TickClock.field_a, "pipe_frame");
              PowerGaugeHelpers.field_e.encodeTransparentRuns();
              DelayedPacket.field_n = new Sprite(48, 48);
              AlphaChildWidget.field_H[0] = InflaterDecompressor.loadIndexedSpritesByName("portal2", TickClock.field_a, (byte) 19, "");
              DialSelectorWidget.field_Q = MenuStyleHelpers.loadSpriteSheetByName(-116, "", TickClock.field_a, "portal_foo_mask");
              DisplayNamePanel.field_X = EffectAudioHelpers.loadSpritesByName("", TickClock.field_a, -256, "blood");
              MarkerSliderPainter.field_b = EffectAudioHelpers.loadSpritesByName("", TickClock.field_a, -256, "powerups");
              TextLayoutLine.field_c = EffectAudioHelpers.loadSpritesByName("", TickClock.field_a, -256, "explosion");
              SimArmedHuman.field_Fb = EffectAudioHelpers.loadSpritesByName("", TickClock.field_a, -256, "miasma");
              QuickChatHelpDialog.field_Hb[0] = EffectAudioHelpers.loadSpritesByName("", TickClock.field_a, -256, "character_zombie0");
              QuickChatHelpDialog.field_Hb[1] = EffectAudioHelpers.loadSpritesByName("", TickClock.field_a, -256, "character_zombie1");
              MenuStyleHelpers.field_c[0] = EffectAudioHelpers.loadSpritesByName("", TickClock.field_a, -256, "character_human0");
              MenuStyleHelpers.field_c[1] = EffectAudioHelpers.loadSpritesByName("", TickClock.field_a, -256, "character_human1");
              MenuStyleHelpers.field_c[2] = EffectAudioHelpers.loadSpritesByName("", TickClock.field_a, -256, "character_human2");
              MenuStyleHelpers.field_c[3] = EffectAudioHelpers.loadSpritesByName("", TickClock.field_a, -256, "character_human3");
              MenuStyleHelpers.field_c[4] = EffectAudioHelpers.loadSpritesByName("", TickClock.field_a, -256, "character_human4");
              MenuStyleHelpers.field_c[5] = EffectAudioHelpers.loadSpritesByName("", TickClock.field_a, -256, "character_human5");
              MenuStyleHelpers.field_c[6] = EffectAudioHelpers.loadSpritesByName("", TickClock.field_a, -256, "character_human6");
              MenuStyleHelpers.field_c[7] = EffectAudioHelpers.loadSpritesByName("", TickClock.field_a, -256, "character_human7");
              MenuStyleHelpers.field_c[8] = EffectAudioHelpers.loadSpritesByName("", TickClock.field_a, -256, "character_human8");
              MenuStyleHelpers.field_c[9] = EffectAudioHelpers.loadSpritesByName("", TickClock.field_a, -256, "character_human9");
              MenuStyleHelpers.field_c[10] = EffectAudioHelpers.loadSpritesByName("", TickClock.field_a, -256, "character_human10");
              MenuStyleHelpers.field_c[11] = EffectAudioHelpers.loadSpritesByName("", TickClock.field_a, -256, "character_human11");
              MenuStyleHelpers.field_c[12] = EffectAudioHelpers.loadSpritesByName("", TickClock.field_a, -256, "character_human12");
              MenuStyleHelpers.field_c[13] = EffectAudioHelpers.loadSpritesByName("", TickClock.field_a, -256, "character_human13");
              MenuStyleHelpers.field_c[14] = EffectAudioHelpers.loadSpritesByName("", TickClock.field_a, -256, "character_human14");
              MenuStyleHelpers.field_c[15] = EffectAudioHelpers.loadSpritesByName("", TickClock.field_a, -256, "character_human15");
              MenuStyleHelpers.field_c[16] = EffectAudioHelpers.loadSpritesByName("", TickClock.field_a, -256, "character_human16");
              MenuStyleHelpers.field_c[17] = EffectAudioHelpers.loadSpritesByName("", TickClock.field_a, -256, "character_human17");
              MenuStyleHelpers.field_c[18] = EffectAudioHelpers.loadSpritesByName("", TickClock.field_a, -256, "character_human18");
              MenuStyleHelpers.field_c[19] = EffectAudioHelpers.loadSpritesByName("", TickClock.field_a, -256, "character_human19");
              MenuStyleHelpers.field_c[20] = EffectAudioHelpers.loadSpritesByName("", TickClock.field_a, -256, "character_human20");
              stackIn_164_0 = 0;
              stackIn_164_1 = -70;
            }
            if (ProgressBarWidget.hasFeatureBit(stackIn_164_0, stackIn_164_1)) {
              MenuStyleHelpers.field_c[21] = EffectAudioHelpers.loadSpritesByName("halloween", TickClock.field_a, -256, "halloween_human1");
              MenuStyleHelpers.field_c[22] = EffectAudioHelpers.loadSpritesByName("halloween", TickClock.field_a, -256, "halloween_human2");
            }
            boolean decompiledFrameCompleted0 = true;
            ArchiveAvailabilityHelpers.field_c = InflaterDecompressor.loadIndexedSpritesByName("character_charming", TickClock.field_a, (byte) 19, "");
            SimPortal.field_N = InflaterDecompressor.loadIndexedSpritesByName("character_charmed", TickClock.field_a, (byte) 19, "");
            NanoTickClock.field_h = InflaterDecompressor.loadIndexedSpritesByName("character_stunned", TickClock.field_a, (byte) 19, "");
            QuickChatCategoryRegistry.field_d = EffectAudioHelpers.loadSpritesByName("", TickClock.field_a, -256, "character_common");
            BufferedSocket.createGlowSprites(ByteArrayPool.loadSpriteByName("", "zombie_counter_instructions", TickClock.field_a, 11091), (byte) -100, ByteArrayPool.loadSpriteByName("", "hud", TickClock.field_a, 11091));
            MiasmaPuff.createPopupSprites(EffectAudioHelpers.loadSpritesByName("", TickClock.field_a, -256, "popup"), 16777215);
            HotspotTextWidget.buildIconSprites(4, EffectAudioHelpers.loadSpritesByName("", TickClock.field_a, -256, "carpark_floor"), false);
            MidiPcmStream.setLevelTileSprites(false, 4, EffectAudioHelpers.loadSpritesByName("", TickClock.field_a, -256, "carpark_tiles"));
            HotspotTextWidget.buildIconSprites(0, EffectAudioHelpers.loadSpritesByName("", TickClock.field_a, -256, "mall_floor"), false);
            MidiPcmStream.setLevelTileSprites(false, 0, EffectAudioHelpers.loadSpritesByName("", TickClock.field_a, -256, "mall_tiles"));
            HotspotTextWidget.buildIconSprites(1, EffectAudioHelpers.loadSpritesByName("", TickClock.field_a, -256, "powerplant_floor"), false);
            MidiPcmStream.setLevelTileSprites(false, 1, EffectAudioHelpers.loadSpritesByName("", TickClock.field_a, -256, "powerplant_tiles"));
            HotspotTextWidget.buildIconSprites(2, EffectAudioHelpers.loadSpritesByName("", TickClock.field_a, -256, "precinct_floor"), false);
            MidiPcmStream.setLevelTileSprites(false, 2, EffectAudioHelpers.loadSpritesByName("", TickClock.field_a, -256, "precinct_tiles"));
            HotspotTextWidget.buildIconSprites(3, EffectAudioHelpers.loadSpritesByName("", TickClock.field_a, -256, "whitehouse_floor"), false);
            MidiPcmStream.setLevelTileSprites(false, 3, EffectAudioHelpers.loadSpritesByName("", TickClock.field_a, -256, "whitehouse_tiles"));
            ChatInputHelpers.field_e[0] = EffectAudioHelpers.loadSpritesByName("", TickClock.field_a, -256, "dimming0");
            ChatInputHelpers.field_e[1] = EffectAudioHelpers.loadSpritesByName("", TickClock.field_a, -256, "dimming1");
            ChatInputHelpers.field_e[2] = EffectAudioHelpers.loadSpritesByName("", TickClock.field_a, -256, "dimming2");
            ChatInputHelpers.field_e[3] = EffectAudioHelpers.loadSpritesByName("", TickClock.field_a, -256, "dimming3");
            ChatInputHelpers.field_e[4] = EffectAudioHelpers.loadSpritesByName("", TickClock.field_a, -256, "dimming4");
            QuickChatCategoryRegistry.field_b = ByteArrayPool.loadSpriteByName("", "tutorial_arrow", TickClock.field_a, 11091);
            IsaacRandom.field_h = ByteArrayPool.loadSpriteByName("", "tutorial", TickClock.field_a, 11091);
            InfectionEvent.field_j = ByteArrayPool.loadSpriteByName("", "frameh", TickClock.field_a, 11091);
            SimHuman.field_fb = ByteArrayPool.loadSpriteByName("", "framev", TickClock.field_a, 11091);
            PlayerProfile.field_r = EffectAudioHelpers.loadSpritesByName("", TickClock.field_a, -256, "framecorners");
            GradientOutlineTextPainter.field_s = SimHuman.field_fb.copyFlippedHorizontal();
            IntroScreen.field_p = InfectionEvent.field_j.copy();
            IntroScreen.field_p.flipVertical();
            TriangleMesh.field_N = EffectAudioHelpers.loadSpritesByName("", TickClock.field_a, -256, "instructions_controls");
            IntrusiveDequeCursor.field_b = EffectAudioHelpers.loadSpritesByName("", TickClock.field_a, -256, "instructions_survivors");
            AccountCreationDialog.field_Hb = EffectAudioHelpers.loadSpritesByName("", TickClock.field_a, -256, "instructions_zombies");
            AccountCreationHelpers.field_b = CheckboxWidget.loadFrameSprites("frame", "", 3, TickClock.field_a);
            field_I = CheckboxWidget.loadFrameSprites("button_frame", "", 3, TickClock.field_a);
            TransitionPhase.field_c = CheckboxWidget.loadFrameSprites("button_raised", "", 3, TickClock.field_a);
            CheckboxWidget.loadFrameSprites("button_depressed", "", 3, TickClock.field_a);
            RankingEntry.field_h = CheckboxWidget.loadFrameSprites("frame_comp", "", 3, TickClock.field_a);
            GameSimulation.field_a = CheckboxWidget.loadFrameSprites("frame_comp_filled", "", 3, TickClock.field_a);
            if (!LinkButtonPainter.field_a) {
              GrowableIntList.field_l = InflaterDecompressor.loadIndexedSpritesByName("achievements_large", TickClock.field_a, (byte) 19, "");
              var3 = GrowableIntList.field_l;
              var4 = 0;
              while (var4 < var3.length) {
                var5 = var3[var4];
                SecondaryNodeDeque.padToFourPixelAlignment((byte) 48, var5);
                var4++;
                if (var6 != 0) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
              }
              if (decompiledFrameCompleted0) {
                SecondaryNodeDeque.padToFourPixelAlignment((byte) 48, WhirlpoolHasher.field_l);
              }
            }
            if (decompiledFrameCompleted0) {
              SocketConnector.field_h.bindRaster((byte) 104);
              TickClock.field_a = null;
              MeltdownPuddleView.field_n = null;
              IsaacRandom.resetFrameTimingHistory(26673);
            }
            return false;
          }
          if (DetonationTarget.field_g != null) {
            PlayModeChoiceDialog.setHuffmanCodec(new HuffmanCodec(DetonationTarget.field_g.getNamedFile("", "huffman", false)), -40);
            DetonationTarget.field_g = null;
            IsaacRandom.resetFrameTimingHistory(26673);
            return false;
          }
          GlintButtonHelpers.updateToggleLabelWidths((byte) 76);
          GlintButtonHelpers.updateToggleLabelWidths((byte) 15);
          ArrayWidgetGroup.field_I = 11;
          CachedTextLayout.field_g = 12;
          ClientProtocolStage.setFrameRate(-127, 50);
          EffectVolumeHelpers.setSoundEffectVolume(3273, 224);
          TertiaryLinkNode.setMusicVolume(200, 123);
          UiComponent.playMusicTrack(false, 0);
          IsaacRandom.resetFrameTimingHistory(26673);
          ArrayWidgetGroup.field_J.requestCursorVisible(true, (java.awt.Component) ((Object) NameEntryPopup.field_Ib), -14697);
          LaboratoryScreen.field_q = NameEntryPopup.field_Ib;
          GameWorld.initializeUiTheme(16777215, 5, field_I, 15, TransitionPhase.field_c, EffectAudioHelpers.field_e, 65280, 240, 16711680, 320, RankingEntry.field_h, (byte) -128, 15, 20, 20);
          CacheEntry.field_w = new PortalView(10, 10, true);
          SecondaryNodeDeque.field_e = new Camera(100, 100);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var3_ref), "ZombieDawnMulti.DA(" + param0 + ',' + param1 + ')');
        }
    }

    final void shutdownGame(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          PlayModeChoiceDialog.shutdownAudioPlayers(-95);
          if (null != FullscreenSupport.field_f) {
            FullscreenSupport.exitActiveFullscreen(-92);
          }
          PendingDataRequest.shutdownSession(false);
          if (param0 != -18941) {
            field_H = 24;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var2), "ZombieDawnMulti.HA(" + param0 + ')');
        }
    }

    public final void init() {
        try {
          this.startWithDefaultSize("zombiedawnmulti", 14, (byte) 82);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "ZombieDawnMulti.init()");
        }
    }

    private final void pollUnlockAndSettingsReplies(int param0) {
        boolean discarded$0 = false;
        RuntimeException decompiledCaughtException = null;
        int[] var2 = null;
        RuntimeException var2_ref = null;
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        var5 = field_E ? 1 : 0;
        try {
          if (!PasswordValidator.field_r) {
            if (FontPaletteHelpers.field_g == null) {
              FontPaletteHelpers.field_g = NanoTickClock.queueOutgoingRequest(-19300, 4);
            }
            if (FontPaletteHelpers.field_g.field_k) {
              var2 = PacketBuffer.field_n;
              var3 = FontPaletteHelpers.field_g.field_h;
              var4 = 0;
              do {
                if (var4 >= 8) {
                  var2 = LevelData.field_m;
                  var3 = FontPaletteHelpers.field_g.field_h;
                  break;
                }
                var2[var4] = PendingStatusRequest.bitOr(var2[var4], var3[var4]);
                var4++;
              } while (var5 == 0);
              var4 = 0;
              do {
                if (var4 >= 8) {
                  PasswordValidator.field_r = true;
                  break;
                }
                var2[var4] = ScrollPane.bitAnd(var2[var4], ~var3[var4]);
                var4++;
              } while (var5 == 0);
              FontPaletteHelpers.field_g = null;
            }
          }
          if (param0 > -117) {
            discarded$0 = this.advanceLoading(true, 49);
          }
          if (!GameScreen.field_bb) {
            if (null == LoginDialog.field_vb) {
              LoginDialog.field_vb = BufferedSocket.queueStatusRequest((byte) -57, 6);
            }
            if (LoginDialog.field_vb.field_h) {
              FullscreenFocusCanvas.field_k.decodeProfile(0, LoginDialog.field_vb.field_f);
              ThreeSliceButtonPainter.toggleNoticeBar((byte) 120);
              if ((FullscreenFocusCanvas.field_k.field_i & 2) == 0) {
                ThreeSliceButtonPainter.toggleNoticeBar((byte) 119);
              }
              PlayingSound.field_g[47] = MenuFrameHelpers.field_d[FullscreenFocusCanvas.field_k.getControlScheme((byte) -1)];
              if (ClientException.field_b) {
                IntrusiveDeque.saveProfile((byte) -61);
              }
              LoginDialog.field_vb = null;
              GameScreen.field_bb = true;
            }
          }
          if (PasswordValidator.field_r &&
            GameScreen.field_bb) {
            LoginDialog.finishUiAnimations(116);
            TickClock.initializeAllMenuScreens(103);
            if (ArrayWidgetGroup.field_I == 6 &&
              !ClientTickHelpers.isAllZero(-9, LevelData.field_m)) {
              ArrayWidgetGroup.field_I = 3;
              LevelActorSpawner.requestMenuScreen(false, 3, 127, CachedTextLayout.field_g);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var2_ref), "ZombieDawnMulti.FA(" + param0 + ')');
        }
    }

    final void clearAllStatics(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          ZombieDawnMulti.releaseStatics(-121);
          GameKeyHandler.releaseStatics(103);
          KeyMapHelpers.releaseStatics(10066329);
          TextDecodeHelpers.releaseStatics(-9162);
          HudSpriteStore.releaseStatics((byte) -116);
          TipPanelHelpers.releaseStatics(4);
          IntrusiveDeque.releaseStatics(92);
          ResourceArchive.releaseStatics((byte) -35);
          SleepAndNameHelpers.releaseStatics(1);
          ArchiveAvailabilityHelpers.releaseStatics(31);
          PowerGaugeHelpers.releaseStatics(8);
          ObjectFactoryHelpers.releaseStatics(5);
          LobbyRequestHelpers.releaseStatics((byte) 127);
          ClientTickHelpers.releaseStatics(3732);
          LoginStartHelpers.releaseStatics(false);
          UiComponent.releaseStatics(false);
          UnitView.releaseStatics((byte) 119);
          EffectAudioHelpers.releaseStatics((byte) -116);
          Js5Transport.releaseStatics((byte) -7);
          DiskCacheWorker.releaseStatics(127);
          Js5ArchiveManager.releaseStatics(0);
          BufferedFile.releaseStatics(-1);
          BufferedSocket.releaseStatics((byte) 16);
          StatSubmissionHelpers.releaseStatics(108);
          NetworkGameClient.releaseStatics(10);
          ClientException.releaseStatics(26677);
          GameApplet.releaseStatics(true);
          JaggrabDownloader.releaseStatics(17);
          MouseInputHandler.releaseStatics(-1);
          MouseWheelInput.releaseStatics(54);
          SoftwareRasterizer.clearStatics();
          PacketBuffer.releaseStatics(false);
          ClockAndScreenHelpers.releaseStatics(0);
          LobbySlideLayout.releaseStatics(true);
          SoundStopHelpers.releaseStatics((byte) 91);
          UrlLaunchHelpers.releaseStatics(127);
          PasswordCheckHelpers.releaseStatics((byte) 43);
          ReportDialogGlobals.releaseStatics((byte) -98);
          ChatMessage.releaseStatics((byte) 118);
          ChatInputHelpers.releaseStatics(6345);
          SharedTransportGlobals.releaseStatics(false);
          TickClock.releaseStatics(-26028);
          RasterBuffer.releaseStatics(64);
          ArchiveLoadSequence.releaseStatics((byte) -50);
          FullscreenFocusCanvas.releaseStatics((byte) -46);
          ViewportController.releaseStatics(12);
          GameScreen.releaseStatics(256);
          LevelEncodingHelpers.releaseStatics(112);
          LevelFileList.releaseStatics(1475);
          StatusAndMeshHelpers.releaseStatics(-96);
          PortalView.releaseStatics(false);
          Camera.releaseStatics(6);
          PlayerProfile.releaseStatics(5);
          GameSimulation.releaseStatics(78);
          IntrusiveNode.releaseStatics((byte) 48);
          SpriteState.releaseStatics(-119);
          DualLinkNode.releaseStatics((byte) 43);
          TriangleRasterizer.releaseStatics();
          ContextMenuHolder.releaseStatics(619119521);
          TextPopupHelpers.releaseStatics(241);
          UpgradeAccessHelpers.releaseStatics(2);
          LayoutCenterHelpers.releaseStatics(-5794);
          MenuFrameHelpers.releaseStatics(96);
          UiComponentNode.releaseStatics(false);
          ClickMarker.releaseStatics((byte) 55);
          HumanView.releaseStatics(24461);
          MeltdownPuddleView.releaseStatics((byte) -87);
          PowerupAuraEffect.releaseStatics((byte) 44);
          PulseEffect.releaseStatics((byte) 87);
          SceneObject.releaseStatics((byte) 107);
          TerrainEffectZone.releaseStatics(24);
          GameCharacter.releaseStatics((byte) -45);
          PhantomDecoy.releaseStatics(1);
          GameEvent.releaseStatics(false);
          PhaseChangeEvent.releaseStatics(true);
          MenuScreen.releaseStatics(false);
          LaboratoryScreen.releaseStatics((byte) -88);
          GameResultsScreen.releaseStatics(true);
          PlayerLoadout.releaseStatics((byte) 39);
          GameWorld.releaseStatics(-6);
          NavigationGrid.releaseStatics(true);
          GameHud.releaseStatics((byte) 7);
          PowerupBar.releaseStatics(-66);
          MoveOrderMarker.releaseStatics(16737894);
          DualLinkDeque.releaseStatics(110);
          if (param0 >= -43) {
            field_H = -75;
          }
          LevelData.releaseStatics(-1);
          Waypoint.releaseStatics(false);
          LoginPacketHelpers.releaseStatics((byte) -17);
          SoundCache.releaseStatics((byte) 119);
          MidiPcmStream.releaseStatics(0);
          NodeHashTable.releaseStatics((byte) -44);
          MusicVoice.releaseStatics(false);
          MidiFileReader.releaseStatics();
          MusicPatchPcmStream.releaseStatics(16652);
          PcmPlayerService.releaseStatics();
          MusicCrossfadeStream.releaseStatics((byte) -83);
          AwtEventPumpHelpers.releaseStatics(19091);
          LobbyGame.releaseStatics(-36);
          DualLinkNodeHashTable.releaseStatics(true);
          LobbyPlayer.releaseStatics(0);
          UnitStateEvent.releaseStatics(-123);
          CipherPacketBuffer.releaseStatics(-125);
          InfectionEvent.releaseStatics(true);
          ScoreUpdateEvent.releaseStatics(-125);
          AttackEvent.releaseStatics((byte) 121);
          FightEvent.releaseStatics((byte) 59);
          PortalEntryEvent.releaseStatics((byte) -9);
          PowerupEvent.releaseStatics(17);
          UnitMoveEvent.releaseStatics(true);
          EffectResistedEvent.releaseStatics(-110);
          ContainerUnpackHelpers.releaseStatics(false);
          ArchiveIndex.releaseStatics(0);
          InflaterDecompressor.releaseStatics((byte) -95);
          ArchiveProvider.releaseStatics(816);
          GlintButtonHelpers.releaseStatics(22382);
          RasterStackHelpers.releaseStatics(4);
          DialogLayer.releaseStatics((byte) 95);
          AccountCreationDialog.releaseStatics(101);
          ProgressDialog.releaseStatics((byte) -66);
          LoginDialog.releaseStatics(61);
          MessageDialog.releaseStatics(10);
          AccountCreationForm.releaseStatics(false);
          PlayModeChoiceDialog.releaseStatics((byte) 84);
          LoginForm.releaseStatics(64);
          DisplayNamePanel.releaseStatics(true);
          ConditionalTextValue.releaseStatics((byte) 45);
          UiTheme.releaseStatics(-1020346174);
          AudioServiceHelpers.releaseStatics((byte) 26);
          SynthInstrument.releaseStatics();
          VorbisSample.releaseStatics();
          VorbisFloor1.releaseStatics();
          ChatPromptHelpers.releaseStatics((byte) -80);
          MenuInputState.releaseStatics(true);
          IntroScreen.releaseStatics(-14680);
          LobbyUpdateHandler.releaseStatics(-120);
          AchievementsScreen.releaseStatics(22324);
          TranslatedUiText.releaseStatics((byte) -79);
          PackedArrayHelpers.releaseStatics(16130);
          StateIconLabel.releaseStatics(false);
          VerticalScrollbar.releaseStatics((byte) -81);
          ContextMenu.releaseStatics((byte) 117);
          ScrollPaneWithFooter.releaseStatics(false);
          PlayerContextMenu.releaseStatics(-2);
          ScrollPane.releaseStatics(0);
          ReportAbuseDialog.releaseStatics(57);
          MenuStyleHelpers.releaseStatics((byte) 121);
          BitPackedArrayHelpers.releaseStatics(0);
          BitmapFont.releaseStatics();
          BrowserPageHelpers.releaseStatics(3);
          LobbyGameListHelpers.releaseStatics(119);
          QuitPageHelpers.releaseStatics((byte) -110);
          LevelFileListHolder.releaseStatics(23376);
          AlignedIconLabel.releaseStatics(2);
          TabbedOverlayPanel.releaseStatics(-22);
          IndexedSpriteState.releaseStatics(76);
          RasterEffectHelpers.releaseStatics();
          TertiaryLinkNode.releaseStatics(-1130232991);
          RubbleChunk.releaseStatics(8784);
          MiasmaParticle.releaseStatics(11041);
          LightningBolt.releaseStatics((byte) 104);
          NoticeMenuHelpers.releaseStatics(125);
          InstructionsScreen.releaseStatics((byte) -56);
          SpriteAlphaBuffers.releaseStatics((byte) 9);
          HuffmanCodec.releaseStatics((byte) 87);
          RandomAccessCacheFile.releaseStatics((byte) 124);
          SettingsCookieHelpers.releaseStatics((byte) -123);
          FramePainter.releaseStatics((byte) 91);
          LobbyUiSetupHelpers.releaseStatics(false);
          ViewFactoryHelpers.releaseStatics(true);
          AntialiasedFontHelpers.releaseStatics(0);
          LevelFileCatalog.releaseStatics(12814);
          FontPaletteHelpers.releaseStatics(false);
          FeatureSupportHelpers.releaseStatics(false);
          CredentialKind.releaseStatics(-19162);
          LoginCredentials.releaseStatics(70);
          MessageMenuScreen.releaseStatics(-29690);
          IsaacRandom.releaseStatics(-13532);
          CookieHelpers.releaseStatics((byte) -12);
          TabbedPane.releaseStatics((byte) 82);
          NameEntryPopup.releaseStatics((byte) 92);
          DisplayNameRequestHelpers.releaseStatics(0);
          QuickChatHelpDialog.releaseStatics(15);
          BirthDateEntryPanel.clearSharedReferences(16777215);
          LobbyDrawHelpers.releaseStatics(-125);
          PowerupProgressCard.releaseStatics(0);
          LevelUpgradeHelpers.releaseStatics(7);
          KeyboardListenerHelpers.releaseStatics((byte) 125);
          SimHuman.releaseStatics(0);
          SimPortal.releaseStatics(true);
          SimEntity.releaseStatics((byte) -83);
          SimZombie.releaseStatics(-121);
          LocalGameWorld.releaseStatics((byte) 71);
          SimUnit.releaseStatics((byte) -86);
          MeltdownPuddle.releaseStatics(29919);
          ZombieDrop.releaseStatics((byte) -119);
          TertiaryLinkDeque.releaseStatics(-6);
          SocketJs5Transport.releaseStatics(16682);
          NetworkArchiveRequest.releaseStatics(0);
          SectorCacheStore.releaseStatics((byte) 77);
          DiskArchiveRequest.releaseStatics(66);
          CachedArchiveSource.releaseStatics(-124);
          LobbyStateHelpers.releaseStatics(16777215);
          ArchiveRequest.releaseStatics((byte) 109);
          IntHashIndex.releaseStatics((byte) 21);
          ByteStorage.releaseStatics((byte) 4);
          Bzip2Decoder.releaseStatics();
          PopupMenuBuilder.releaseStatics(true);
          ReflectionCheckRequest.releaseStatics(-97);
          SpriteDecodeGlobals.releaseStatics(27964);
          LoginSuccessHelpers.releaseStatics(false);
          AudioPumpThread.releaseStatics((byte) -72);
          SocketConnector.releaseStatics((byte) -109);
          ChatPanelSetupHelpers.releaseStatics(20964);
          WhirlpoolHasher.releaseStatics(true);
          TutorialAndMenuHelpers.releaseStatics(true);
          DefaultQuickChatContext.releaseStatics(false);
          MusicPatchLoadHelpers.releaseStatics(true);
          QuickChatMenu.releaseStatics(-113);
          QuickChatCategoryRegistry.releaseStatics(false);
          QuickChatCategoryDefinition.releaseStatics((byte) -52);
          KeyboardStateHelpers.releaseStatics(49);
          FullscreenErrorDialog.releaseStatics((byte) -29);
          TextWidgetPainter.releaseStatics((byte) 82);
          MeshMaterial.releaseStatics(-128);
          TriangleMesh.releaseStatics((byte) 119);
          ScreenSizeGlobals.releaseStatics(-111);
          TeamSpriteHelpers.releaseStatics(-7);
          PowerupEventFactory.releaseStatics(80);
          StringHashHelpers.releaseStatics(2791);
          DelegatingCanvas.releaseStatics((byte) 60);
          SocialRequestHelpers.releaseStatics(4);
          ByteArrayPool.releaseStatics((byte) 109);
          CheckboxPainter.releaseStatics(true);
          StatefulTextPainter.releaseStatics(false);
          DialWidgetPainter.releaseStatics((byte) -104);
          MarkerSliderPainter.releaseStatics(2);
          TextLayout.releaseStatics(12);
          UiWidget.releaseStatics((byte) -90);
          ButtonWidget.releaseStatics(-118);
          SingleChildWidget.releaseStatics((byte) -39);
          ResizableDialog.releaseStatics((byte) -92);
          FadingDialog.releaseStatics((byte) 84);
          WidgetContainer.releaseStatics(false);
          IntrusiveDequeCursor.releaseStatics(-1);
          ChatAndOptionHelpers.releaseStatics((byte) -8);
          SupportPageHelpers.releaseStatics(13377);
          QuickChatPhraseDefinition.releaseStatics(32768);
          WeightedLruCache.releaseStatics((byte) 8);
          NanoTickClock.releaseStatics(0);
          ImageProducerRasterBuffer.releaseStatics(-2);
          DisplayMode.releaseStatics(-12970);
          PropObject.releaseStatics((byte) 97);
          FrameCycleAnimation.releaseStatics(0);
          AccountCreationHelpers.releaseStatics((byte) -52);
          ScorePopup.releaseStatics((byte) -66);
          ScrollBar.releaseStatics(22767);
          EffectVolumeHelpers.releaseStatics(false);
          ScreechAura.releaseStatics(-119);
          ZombieDetonation.releaseStatics((byte) -26);
          BirthDateValidator.releaseStatics(-3);
          BirthDateInputWidget.releaseStatics(4);
          ArrayWidgetGroup.releaseStatics(114);
          FullscreenSupport.releaseStatics((byte) 88);
          ArmedHumanView.releaseStatics(true);
          OptionsMenuScreen.releaseStatics(30833);
          RankingsScreen.releaseStatics(225);
          AppearanceScreen.releaseStatics(31592);
          ColourPickerWidget.releaseStatics((byte) -113);
          ProgramNoteUsage.releaseStatics(360);
          MusicPatch.releaseStatics(-60);
          MusicPatchEnvelope.releaseStatics((byte) 78);
          LabeledChildWidget.releaseStatics(3);
          ValidatedTextInputWidget.releaseStatics(29829);
          TextInputWidget.releaseStatics(false);
          ContentTransitionDialog.releaseStatics(7181);
          ProgressBarWidget.releaseStatics(0);
          UsernameSuggestionsPanel.releaseStatics(true);
          HotspotTextWidget.releaseStatics(2);
          ValidationIconWidget.releaseStatics(-1562977759);
          ValidationMessageWidget.releaseStatics(0);
          TextInputValidator.releaseStatics(-1317848592);
          SineTableHelpers.releaseStatics((byte) -109);
          Under13NoticePanel.releaseStatics(true);
          DialSelectorWidget.releaseStatics(38);
          MarkerSliderWidget.releaseStatics((byte) 107);
          AudioFilter.releaseStatics();
          AccountTextGlobals.releaseStatics(4302);
          DialogLayerHolder.releaseStatics((byte) 119);
          DateInputWidget.releaseStatics(-127);
          SimArmedHuman.releaseStatics((byte) -50);
          DirectByteStorage.releaseStatics(4912);
          ProxySocketConnector.releaseStatics(3);
          IterableNodeHashTable.releaseStatics(false);
          SecondaryNodeDeque.releaseStatics(118);
          CacheEntry.releaseStatics(true);
          GrowableIntList.releaseStatics(-113);
          DraggableWidget.releaseStatics((byte) -33);
          DropTargetWidget.releaseStatics((byte) -81);
          QuickChatCommandType.releaseStatics(-23);
          StrongCacheEntry.releaseStatics((byte) 5);
          IdleTickHelpers.releaseStatics(94);
          NodeHashTableIterator.releaseStatics((byte) -30);
          SecondaryNodeDequeIterator.releaseStatics(18358);
          QueuedListRequest.releaseStatics(0);
          RankingsRequest.releaseStatics(8220);
          PlayingSound.releaseStatics((byte) 103);
          ThreeSliceButtonPainter.releaseStatics((byte) -39);
          LinkButtonPainter.releaseStatics((byte) -122);
          GradientOutlineTextPainter.releaseStatics((byte) 109);
          PasswordTextPainter.releaseStatics(false);
          AlphaChildWidget.releaseStatics((byte) -108);
          PendingRankingRequest.releaseStatics((byte) 48);
          FriendListHelpers.releaseStatics(-2);
          RankingEntry.releaseStatics(5378);
          SocialListRow.releaseStatics((byte) -102);
          ArchiveLoadStep.releaseStatics((byte) -126);
          PendingIntArrayReply.releaseStatics(true);
          MusicPatchNode.releaseStatics(0);
          LevelFileEntry.releaseStatics(-1569388056);
          PendingStatusRequest.releaseStatics(true);
          PowerupCommand.releaseStatics(false);
          FlaggedTextValue.releaseStatics(118);
          ClientProtocolStage.releaseStatics((byte) 124);
          DelayedPacket.clearSharedReferences(-18535);
          ClickMarkerParticle.releaseStatics(-98);
          MiasmaPuff.releaseStatics(false);
          SpriteHotspot.releaseStatics(-23636);
          PowerupButton.releaseStatics(-90);
          SoundEffectInstance.releaseStatics(-6298);
          ClientShellHelpers.releaseStatics(-5937);
          AccountServerResult.releaseStatics((byte) 106);
          MessageDialogContent.releaseStatics((byte) -84);
          RasterSnapshot.releaseStatics(27467);
          LoginMethod.releaseStatics(6);
          UsernameCredentials.releaseStatics(false);
          AlternateUsernameCredentials.releaseStatics(true);
          EmailLoginCredentials.releaseStatics(3);
          MeltdownPuddleCell.releaseStatics((byte) -48);
          AudioStartupHelpers.releaseStatics(26);
          PendingIntArrayRequest.releaseStatics(-7406);
          RandomHelpers.releaseStatics(120);
          WidgetStyleLayer.releaseStatics(53);
          TextLayoutLine.releaseStatics((byte) 94);
          DetonationTarget.releaseStatics(21342);
          ValidationState.releaseStatics(89);
          DebouncedValidationProvider.releaseStatics(true);
          UsernameAvailabilityValidator.releaseStatics(66);
          PasswordValidator.releaseStatics(0);
          EmailValidator.releaseStatics(false);
          EmailAvailabilityValidator.releaseStatics(11702);
          AgeValidator.releaseStatics(-3);
          MatchingTextValidator.releaseStatics(1);
          TransitionPhase.releaseStatics(0);
          TextHotspot.releaseStatics(0);
          TextValidationFailure.releaseStatics(64);
          this.field_v = null;
          this.field_J = null;
          this.field_G = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var2), "ZombieDawnMulti.KA(" + param0 + ')');
        }
    }

    public ZombieDawnMulti() {
    }

    static {
        field_M = "Annoying";
        field_K = new String[]{"Map type", "Map name"};
        field_F = "Test Chamber";
    }
}
