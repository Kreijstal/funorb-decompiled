/*
 * Decompiled by CFR-JS 0.4.0.
 */
public final class ShatteredPlansClient extends GameClientShell {
    static int[] field_E;
    static SecondaryNodeHashTable field_H;
    static String field_L;
    private IntrusiveDeque field_G;
    static boolean field_K;
    static String field_J;
    private int field_I;
    public static boolean field_F;

    final static boolean canMessageRecipient(int param0, long param1, String param2) {
        SocialListEntry var4 = null;
        RuntimeException var4_ref = null;
        boolean stackIn_12_0 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 16) {
            return false;
          }
          var4 = NodeSequence.findFriendByName((byte) -90, param2);
          if (var4 != null &&
            var4.field_xb != null) {
            return true;
          }
          stackIn_12_0 = (null != MenuInputState.field_a) && (MutableIntPairNode.findRoomMember(-101, param1) != null);
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_15_0 = var4_ref;
          stackIn_15_1 = new StringBuilder().append("ShatteredPlansClient.KA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final void shutdown(boolean param0) {
        if (param0) {
          this.update(-37);
        }
        GameApplet.closeAudioPlayers(120);
        if (null != NameSuggestionsPanel.field_K) {
          BufferedCacheFile.exitFullscreen(0);
        }
        Dialog.f((byte) 89);
    }

    final void initialise(int param0) {
        this.initialiseShell(param0 + 257, 1, 14, 25, false, 0, 2, 4);
        MusicCrossfadeStream var3 = new MusicCrossfadeStream();
        var3.field_u.d(128, (byte) -110, 9);
        var3.field_r.d(128, (byte) -110, 9);
        var3.field_u.setMasterVolume(598, UiSpriteSupport.field_b);
        var3.field_r.setMasterVolume(param0 ^ -599, UiSpriteSupport.field_b);
        DebouncedValidator.initializeAudioPlayback((java.awt.Component) ((Object) NotificationEntry.field_i), ValidatedTextInputWidget.field_W, var3, 1102, false, 22050, 22050, true);
        IterableNodeHashTable.field_b = 2458760;
        LoginResultSupport.field_a = 2805974;
        ProductionContent.field_j = 2458760;
        AccountNoticeKind.field_b = 2458760;
        ValidationMessageWidget.field_P = 2458760;
        StarAnnotation.field_n = 2805974;
        ProductionContent.setGraphicsSettings(ClientRenderSupport.createHighGraphicsSettings(0), 1);
        this.allowOpcodeGroups(false, true, -2839, true, true, false, false);
        SliderWidget.field_K = TaskAi.field_a;
        HighscoreResponseSupport.field_a[71] = 4;
        HighscoreResponseSupport.field_a[74] = -2;
        HighscoreResponseSupport.field_a[58] = -2;
        HighscoreResponseSupport.field_a[10] = -1;
        HighscoreResponseSupport.field_a[63] = 1;
        HighscoreResponseSupport.field_a[69] = 1;
        HighscoreResponseSupport.field_a[64] = 1;
        HighscoreResponseSupport.field_a[72] = 0;
        HighscoreResponseSupport.field_a[70] = -2;
        HighscoreResponseSupport.field_a[67] = -2;
        HighscoreResponseSupport.field_a[9] = -1;
        HighscoreResponseSupport.field_a[73] = 3;
        HighscoreResponseSupport.field_a[66] = 15;
        HighscoreResponseSupport.field_a[68] = param0;
        NodeHashTableIterator.field_h = MouseInputHandler.field_f;
        HighscoreResponseSupport.field_a[62] = 1;
        HighscoreResponseSupport.field_a[61] = 1;
        HighscoreResponseSupport.field_a[65] = 1;
    }

    final void update(int param0) {
        try {
          int fieldTemp$0 = 0;
          int fieldTemp$1 = 0;
          int var11_int = 0;
          boolean stackIn_7_1 = false;
          boolean stackIn_45_1 = false;
          boolean stackIn_46_2 = false;
          int stackIn_97_0 = 0;
          int stackIn_97_1 = 0;
          int stackIn_102_0 = 0;
          int stackIn_105_0 = 0;
          GameSession stackIn_111_0 = null;
          GameScreen stackIn_114_0 = null;
          int stackIn_118_0 = 0;
          GameSession stackIn_126_0 = null;
          boolean stackIn_127_1 = false;
          int stackIn_150_0 = 0;
          int stackIn_150_1 = 0;
          int stackIn_167_0 = 0;
          int stackIn_172_0 = 0;
          int decompiledRegionSelector0 = 0;
          Throwable decompiledCaughtException = null;
          int var2 = 0;
          int var3 = 0;
          FourIntSubmissionRequest var3_ref_lq = null;
          Object var4_ref = null;
          int var4 = 0;
          GameRules var5_ref_vr = null;
          int var5 = 0;
          int var6 = 0;
          int var7 = 0;
          int var8 = 0;
          int var9 = 0;
          String[] var10 = null;
          GameSession var11 = null;
          GameScreen var12 = null;
          GameSession var13 = null;
          int var14 = 0;
          MapGenerationException var15 = null;
          InvalidMapConnectionException var15_ref = null;
          Exception var15_ref2 = null;
          int var16 = 0;
          int stackIn_97_0Lifetime1;
          int stackIn_97_1Lifetime1;
          int var3Lifetime1;
          var16 = field_F ? 1 : 0;
          ClientInputSupport.getMouseIdleTicks(-87);
          GalaxyMap.field_f = ClientInputSupport.getMouseIdleTicks(-80);
          TextHotspotRegion.updateAudio(-26848);
          if (null != NameSuggestionsPanel.field_K &&
            NameSuggestionsPanel.field_K.field_c) {
            BufferedCacheFile.exitFullscreen(0);
            GameScreen.setFullscreenDialogModeIfOpen(4);
          }
          stackIn_7_1 = (null != NameSuggestionsPanel.field_K);
          this.tickClientShell(stackIn_7_1, 77);
          if (PlayerStats.field_n) {
            this.openGameArchives(false);
            PlayerStats.field_n = false;
          }
          RasterStateFrame.field_n = RasterStateFrame.field_n + 1;
          if (ArchiveLoadStep.isClientNotReady(false)) {
            this.tickLoginAndIntroUi((byte) -123);
            if (ArchiveLoadStep.isClientNotReady(false)) {
              if (MutableIntPairNode.field_h) {
                return;
              }
              if (QuaternaryNodeList.isGameClientReady(91)) {
                MutableIntPairNode.field_h = this.pollGameAssetInitialization(82, false);
              }
              return;
            }
          }
          var2 = 0;
          if (!MutableIntPairNode.field_h) {
            ChatAreaLayoutSupport.updateLoginUi(0, BattleExplosionVisual.field_o);
            if (this.pollGameAssetInitialization(82, true)) {
              MutableIntPairNode.field_h = true;
            }
          } else {
            if (!StrongCacheEntry.areClientPreferencesReady((byte) 122)) {
              DialogRoot.pollClientPreferences((byte) 125);
            } else {
              if (DisplayModeInfo.field_e) {
                if (!TutorialScene.isFullscreenDialogOpen(false)) {
                  if (PlayerReportPanel.refreshClientActivityDeadline((byte) -67)) {
                    var2 = 1;
                    stackIn_45_1 = true;
                    stackIn_46_2 = (NameSuggestionsPanel.field_K != null);
                    var3 = this.pollLoginUiActions(stackIn_45_1, stackIn_46_2);
                    if (var3 == 1 ||
                      var3 == 2) {
                      if (NameSuggestionsPanel.field_K != null) {
                        BufferedCacheFile.exitFullscreen(0);
                      }
                      if (2 == var3) {
                        DebouncedValidator.openQuitPage(1, (java.applet.Applet) (this));
                      }
                    }
                    this.tickMenusAndLobby(false, true);
                  } else {
                    if (DialPainter.isAccountChoiceMenuOpen(0)) {
                      var2 = 1;
                      if (~ClientOverlayDrawSupport.field_c != ~ClientOverlayDrawSupport.field_g) {
                        this.tickMenusAndLobby(false, false);
                      } else {
                        var3 = RoundedFrameSupport.pollAccountChoiceAction(106);
                        if (var3 == 1) {
                          AccountStatusDialog.field_ob = true;
                          MenuLabel.requestMenuLogin(AchievementProgress.field_a, 0, (byte) 122);
                        }
                        this.tickMenusAndLobby(false, true);
                      }
                    } else {
                      this.tickMenusAndLobby(false, false);
                    }
                  }
                } else {
                  boolean decompiledFrameRemainder1 = true;
                  if (~ClientOverlayDrawSupport.field_g != ~ClientOverlayDrawSupport.field_c) {
                    this.tickMenusAndLobby(false, false);
                  } else {
                    var3 = GuestPlayForm.pollFullscreenDialogAction(false);
                    if (var3 == 2) {
                      BufferedCacheFile.exitFullscreen(0);
                    } else {
                      if (3 == var3) {
                        BattleContribution.field_s = false;
                        StrongCacheEntry.configureSharedUiSpriteResources(8, 13421772, IterableNodeHashTable.field_b, 8, AccountRequestState.field_b.field_K, DerelictMapReader.field_i, 240, AccountRequestState.field_b.field_K + AccountRequestState.field_b.field_q, DerelictMapReader.field_i, 320, AccountRequestState.field_b, AccountRequestState.field_b, 0, AccountRequestState.field_b.field_K, ValidationMessageWidget.field_P, AccountRequestState.field_b.field_q + AccountRequestState.field_b.field_K, 0, 2, 480, (Sprite[]) null, StarAnnotation.field_n);
                        HuffmanCodec.requestFullscreen(true, -1);
                      } else {
                        if (var3 != 4) {
                          this.tickMenusAndLobby(false, true);
                          decompiledFrameRemainder1 = false;
                        }
                        else {
                          BattleContribution.field_s = true;
                          MenuLabel.requestMenuLogin(RasterSpanFactory.field_b, 0, (byte) 125);
                        }
                      }
                    }
                    if (decompiledFrameRemainder1) {
                      this.tickMenusAndLobby(false, true);
                    }
                  }
                  var2 = 1;
                }
              } else {
                if (!Dialog.d(true)) {
                  GzipInflater.initializeClientMenus(1);
                }
                DisplayModeInfo.field_e = true;
              }
            }
          }
          if (var2 != 0) {
            if (SoundEffectSupport.field_a > FullscreenFocusCanvas.field_b) {
              fieldTemp$0 = FullscreenFocusCanvas.field_b + ResizingDialog.field_U;
              FullscreenFocusCanvas.field_b = FullscreenFocusCanvas.field_b + ResizingDialog.field_U;
              if (SoundEffectSupport.field_a < fieldTemp$0) {
                FullscreenFocusCanvas.field_b = SoundEffectSupport.field_a;
              }
            }
          } else {
            if (0 < FullscreenFocusCanvas.field_b) {
              fieldTemp$1 = FullscreenFocusCanvas.field_b - ResizingDialog.field_U;
              FullscreenFocusCanvas.field_b = FullscreenFocusCanvas.field_b - ResizingDialog.field_U;
              if (fieldTemp$1 < 0) {
                FullscreenFocusCanvas.field_b = 0;
              }
            }
          }
          if (!Dialog.d(true)) {
            while (true) {
              var3_ref_lq = (FourIntSubmissionRequest) (GameKeyHandler.field_a.pollFirst(54));
              if (var3_ref_lq == null) {
                break;
              }
              IntroLoadingSupport.queueFourIntSubmission(var3_ref_lq, 1500005281, 4);
            }
          }
          var3Lifetime1 = -87 % ((15 - param0) / 35);
          scanLoop1: while (FleetTrailPoint.pollInboundPacket(HighscoreResponseSupport.field_a, 1)) {
            stackIn_150_0 = -10;
            stackIn_150_1 = ~BufferedCacheFile.field_e;
            if (stackIn_150_0 == stackIn_150_1) {
              DiskCacheWorker.commitMenuTransition(1048576);
              StripedProgressWidget.field_Q = false;
              PlayerRankingRequest.field_o = 10;
              GameSpriteResources.field_c = SpriteWipeSupport.field_a.readString(-1);
              continue;
            }
            if (BufferedCacheFile.field_e == 14) {
              DiskCacheWorker.commitMenuTransition(1048576);
              BytePayloadNode.initializeLobbySessionState(HitRegion.getLobbyRoomListContent(20605), LobbyOptionSupport.nextPowerOfTwo(2000, (byte) 122), UnderageAccountInfoPanel.getRoomPlayerListContent(42), 1024, LobbyOptionSupport.nextPowerOfTwo(6, (byte) 122), (byte) -122, IntList.field_j.length, LobbyRoomControlsSupport.getLobbyScrollContent((byte) 100), LabeledChildWidget.field_C, 150);
              SocialListSetupSupport.initializeSocialLists((byte) 77, LobbyOptionSupport.getFriendListContent((byte) 121), NodeHashTableIterator.a(83));
              EmailValidator.field_p = true;
              StripedProgressWidget.field_Q = false;
              PlayerRankingRequest.field_o = -2;
              continue;
            }
            if (15 == BufferedCacheFile.field_e) {
              if (EmailValidator.field_p) {
                DiskCacheWorker.commitMenuTransition(1048576);
                ProjectsContent.closeClientOverlays((byte) -122);
                IntroRenderSupport.clearChatHistory(112);
                MenuTransitionSupport.beginMenuTransition(0, 0, (byte) 96, false);
                EmailValidator.field_p = false;
                ProxyAuthenticationRequiredException.field_b = true;
                Wormhole.field_i = false;
                MusicEnvelope.field_d = false;
                TiledNineSlicePainter.field_b = false;
                DiskArchiveRequest.field_A = true;
                UiSpriteSupport.closeChatPanelOverlay(0);
              }
              ArchiveConnectionRetrySupport.field_a = false;
              StripedProgressWidget.field_Q = false;
              continue;
            }
            if (BufferedCacheFile.field_e == 10 &&
              EmailValidator.field_p) {
              DialWidget.readLobbyUpdate(112);
              continue;
            }
            if (BufferedCacheFile.field_e == 71) {
              if (!IsolationistAi.field_r) {
                continue;
              }
              var4 = SpriteWipeSupport.field_a.readInt(16711680);
              var4 = var4 & ~ReflectionCheckDecoder.field_a;
              var5 = 0;
              while (var5 < 25) {
                var6 = 1 << var5;
                stackIn_97_0 = ~(var6 & var4);
                stackIn_97_1 = -1;
                if (stackIn_97_0 != stackIn_97_1) {
                  this.field_G.addLast((byte) -113, new IntNode(var5));
                }
                var5++;
              }
              stackIn_97_0Lifetime1 = ReflectionCheckDecoder.field_a;
              stackIn_97_1Lifetime1 = var4;
              ReflectionCheckDecoder.field_a = stackIn_97_0Lifetime1 | stackIn_97_1Lifetime1;
              continue scanLoop1;
            }
            if (58 != BufferedCacheFile.field_e) {
              if (60 != BufferedCacheFile.field_e) {
                var4_ref = null;
                if (!TiledNineSlicePainter.field_b) {
                  if (MusicEnvelope.field_d) {
                    var4_ref = SecondaryNodeHashTable.field_g;
                  }
                } else {
                  var4_ref = PasswordInputPainter.field_x;
                }
                if (var4_ref != null &&
                  ((GameSession) (var4_ref)).handleTurnResultPacket(14759)) {
                  continue;
                }
                this.dispatchBasePacket((byte) -84);
                continue;
              }
              if (TiledNineSlicePainter.field_b ||
                MusicEnvelope.field_d) {
                DiskCacheWorker.commitMenuTransition(1048576);
                if (TiledNineSlicePainter.field_b) {
                  PasswordInputPainter.field_x.handleGameExit(false, false);
                }
                ProxyAuthenticationRequiredException.field_b = true;
                TiledNineSlicePainter.field_b = false;
                PlayerRankingRequest.field_o = -2;
                Wormhole.field_i = false;
                MusicEnvelope.field_d = false;
                ImageProducerRasterBuffer.field_n = true;
                UiSpriteSupport.closeChatPanelOverlay(0);
              }
              ArchiveConnectionRetrySupport.field_a = false;
              continue;
            }
            DiskCacheWorker.commitMenuTransition(1048576);
            var4 = SpriteWipeSupport.field_a.readUnsignedByte(-93);
            var5_ref_vr = AccountRequestResult.readGameRules((byte) -85, SpriteWipeSupport.field_a);
            var6 = SpriteWipeSupport.field_a.readSignedByte(-2852);
            stackIn_102_0 = (SpriteWipeSupport.field_a.readUnsignedByte(-95) == 0) ? 0 : 1;
            var7 = stackIn_102_0;
            var8 = SpriteWipeSupport.field_a.readSignedByte(-2852);
            stackIn_105_0 = (var8 < 0) ? 0 : 1;
            var9 = stackIn_105_0;
            var10 = new String[SpriteWipeSupport.field_a.readUnsignedByte(-128)];
            for (var11_int = 0; var11_int < var10.length; var11_int++) {
              var10[var11_int] = SpriteWipeSupport.field_a.readMarkedString((byte) -111);
            }
            StringList.field_b = null;
            if (var9 == 0) {
              stackIn_111_0 = SecondaryNodeHashTable.field_g;
            } else {
              stackIn_111_0 = PasswordInputPainter.field_x;
            }
            var11 = stackIn_111_0;
            if (var11 == null) {
              stackIn_114_0 = null;
            } else {
              stackIn_114_0 = var11.field_Y;
            }
            var12 = stackIn_114_0;
            var13 = new GameSession(true, false, var4, var5_ref_vr, var6, var10, var8, var7 != 0, var12);
            var14 = 1;
            if (var13.field_n != null) {
              stackIn_118_0 = (1 != SpriteWipeSupport.field_a.readUnsignedByte(-122)) ? 0 : 1;
              var14 = stackIn_118_0;
            }
            try {
              var13.field_P.readMap(SpriteWipeSupport.field_a, var13.field_n, false);
              decompiledRegionSelector0 = 0;
            } catch (MapGenerationException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var15 = (MapGenerationException) (Object) decompiledCaughtException;
              GameKeyHandler.a(-29901, (Throwable) ((Object) var15), "Map Generation failed when receiving initial game state from server.");
              TabbedPanel.closeClientSocket(-96);
              decompiledRegionSelector0 = 1;
            } catch (InvalidMapConnectionException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var15_ref = (InvalidMapConnectionException) (Object) decompiledCaughtException;
              GameKeyHandler.a(-29901, (Throwable) ((Object) var15_ref), "Gamestate received from server is invalid.");
              TabbedPanel.closeClientSocket(-96);
              decompiledRegionSelector0 = 1;
            } catch (java.lang.Exception decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var15_ref2 = (Exception) (Object) decompiledCaughtException;
              GameKeyHandler.a(-29901, (Throwable) ((Object) var15_ref2), "Error receiving gamestate from server.");
              TabbedPanel.closeClientSocket(-119);
              decompiledRegionSelector0 = 1;
            }
            if (decompiledRegionSelector0 != 0) {
              continue;
            }
            var13.initializeGameScreen((byte) -81);
            stackIn_126_0 = var13;
            stackIn_127_1 = (var14 != 0);
            stackIn_126_0.field_L = stackIn_127_1;
            if (var9 != 0) {
              TiledNineSlicePainter.field_b = true;
              PasswordInputPainter.field_x = var13;
              LoginForm.updateDrawOfferCaption(8);
              RematchMenuSupport.updateRematchCaption(-2);
              SoundEffectDefinition.openChatPanelOverlay((byte) -98);
            } else {
              SecondaryNodeHashTable.field_g = var13;
              MusicEnvelope.field_d = true;
            }
            MenuTransitionSupport.beginMenuTransition(0, -1, (byte) 96, false);
            ImageProducerRasterBuffer.field_n = false;
            Wormhole.field_i = true;
            ArchiveConnectionRetrySupport.field_a = false;
          }
          stackIn_150_0 = 0;
          stackIn_150_1 = 82;
          ClientPacketFlushSupport.flushOutboundPacketsFullInts(stackIn_150_0, stackIn_150_1);
          if (null != ScrollBar.field_zb &&
            ScrollBar.field_zb.field_j) {
            ReflectionCheckDecoder.field_a = ReflectionCheckDecoder.field_a | ScrollBar.field_zb.field_h;
            ClientRuntimeState.field_e = ScrollBar.field_zb.field_l;
            ScrollBar.field_zb = null;
            IsolationistAi.field_r = true;
          }
          if (GameRules.field_c == -2 &&
            PlayerRankingRequest.field_o != -1) {
            ImageProducerRasterBuffer.field_n = true;
          }
          if (ImageProducerRasterBuffer.field_n) {
          }
          boolean decompiledFrameRemainder0 = true;
          if (!AchievementProgress.field_g && ((PasswordInputPainter.field_x == null ||
            !PasswordInputPainter.field_x.field_j) &&
            (SecondaryNodeHashTable.field_g == null ||
            !SecondaryNodeHashTable.field_g.field_j))) {
            stackIn_167_0 = 0;
            decompiledFrameRemainder0 = false;
          }
          else {
            stackIn_167_0 = 1;
          }
          var4 = stackIn_167_0;
          if (var4 != 0 &&
            FleetTrailPoint.field_p[82] &&
            FleetTrailPoint.field_p[73]) {
            stackIn_172_0 = 1;
          } else {
            stackIn_172_0 = 0;
          }
          var5 = stackIn_172_0;
          if (var5 != 0) {
            TabbedPanel.closeClientSocket(-108);
          }
          if (ArchiveRequest.shouldServiceLobbyConnection(-11)) {
            var6 = this.serviceConnection((byte) 16);
            if (var6 == 0 ||
              var6 == 1) {
              ServerRequestRetrySupport.resendPendingRequests(4, (byte) -103);
              AchievementProgress.resendRankingRequests(7, true);
              TextReplacementEntry.resendByteRequests(6, 37);
              ReflectionQueueSupport.initializeReflectionCheckQueue(true);
              if (1 == var6) {
                ArchiveConnectionRetrySupport.field_a = true;
                StripedProgressWidget.field_Q = true;
              } else {
                if (EmailValidator.field_p) {
                  ProxyAuthenticationRequiredException.field_b = true;
                  Wormhole.field_i = false;
                  DiskArchiveRequest.field_A = true;
                  if (!TiledNineSlicePainter.field_b) {
                    MenuTransitionSupport.beginMenuTransition(0, 0, (byte) 96, false);
                  } else {
                    GameSpriteResources.field_c = RoundedFrameSupport.field_a;
                    MenuTransitionSupport.beginMenuTransition(0, 10, (byte) 96, false);
                  }
                  DiskCacheWorker.commitMenuTransition(1048576);
                  LobbyPlayerEntry.field_Hb[GameRules.field_c].resetMenuInput(0, (byte) 84, false);
                  MusicEnvelope.field_d = false;
                  TiledNineSlicePainter.field_b = false;
                  EmailValidator.field_p = false;
                  UiSpriteSupport.closeChatPanelOverlay(0);
                }
                StripedProgressWidget.field_Q = false;
                ArchiveConnectionRetrySupport.field_a = false;
              }
            }
            var7 = 0;
            if (var6 == 2) {
              var7 = 1;
            }
            if (var5 != 0) {
              var7 = 1;
            }
            if (EmailValidator.field_p ||
              StripedProgressWidget.field_Q ||
              ArchiveConnectionRetrySupport.field_a) {
              var7 = 1;
            }
            if (var7 != 0) {
              IntrusiveNode.requestReconnectUi(-11);
            }
          }
          return;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void initializeGameTextReplacements(int param0) {
        int var2_int = 0;
        int var3 = field_F ? 1 : 0;
        ClientLobbyResources.field_e = new TextReplacementContext();
        ClientLobbyResources.field_e.putReplacement("<col=2F5FBF>", 27275, "key");
        ClientLobbyResources.field_e.putReplacement("<col=FF8080>", 27275, "highlight");
        ClientLobbyResources.field_e.putReplacement("<col=2F5FBF>", 27275, "glossary");
        for (var2_int = 0; var2_int < 4; var2_int++) {
          ClientLobbyResources.field_e.putReplacement(QuickChatPhraseRegistry.replaceNumberedPlaceholders("<col=<%0>><%1></col>", 4371, new String[]{Integer.toString(SoundPlayback.field_k[var2_int], 16), MusicCrossfadeStream.field_x[var2_int].toLowerCase()}), 27275, "resource" + var2_int);
          ClientLobbyResources.field_e.putReplacement(QuickChatPhraseRegistry.replaceNumberedPlaceholders("<col=<%0>><%1></col>", param0 ^ 4370, new String[]{Integer.toString(SoundPlayback.field_k[var2_int], 16), MusicCrossfadeStream.field_x[var2_int]}), 27275, "Resource" + var2_int);
        }
        ClientLobbyResources.field_e.putReplacement(field_L, 27275, "territories");
        ClientLobbyResources.field_e.putReplacement(ObjectList.field_c, 27275, "uioptions");
        ClientLobbyResources.field_e.putReplacement(ChatPanelSetupSupport.field_a, 27275, "fleetinfo");
        ClientLobbyResources.field_e.putReplacement(MouseWheelInput.field_c, param0 ^ 27274, "projects");
        ClientLobbyResources.field_e.putReplacement(DropTargetWidget.field_B, 27275, "diplomacy");
        ClientLobbyResources.field_e.putReplacement(PopupPlacementSupport.field_l, 27275, "messages");
        ClientLobbyResources.field_e.putReplacement(Integer.toString(SoundPlayback.field_k[0], 16), 27275, "colmetal");
        ClientLobbyResources.field_e.putReplacement(Integer.toString(SoundPlayback.field_k[1], 16), 27275, "colbiomass");
        ClientLobbyResources.field_e.putReplacement(Integer.toString(SoundPlayback.field_k[2], 16), 27275, "colenergy");
        ClientLobbyResources.field_e.putReplacement(Integer.toString(SoundPlayback.field_k[3], 16), 27275, "colexotics");
        String var2 = "<col=<%0>><%1></col>";
        ClientLobbyResources.field_e.putReplacement(QuickChatPhraseRegistry.replaceNumberedPlaceholders(var2, 4371, new String[]{Integer.toString(SoundPlayback.field_k[0], 16), UiTextSupport.field_d[0].toLowerCase()}), 27275, "project_metal");
        ClientLobbyResources.field_e.putReplacement(QuickChatPhraseRegistry.replaceNumberedPlaceholders(var2, 4371, new String[]{Integer.toString(SoundPlayback.field_k[1], 16), UiTextSupport.field_d[param0].toLowerCase()}), 27275, "project_biomass");
        ClientLobbyResources.field_e.putReplacement(QuickChatPhraseRegistry.replaceNumberedPlaceholders(var2, 4371, new String[]{Integer.toString(SoundPlayback.field_k[2], 16), UiTextSupport.field_d[2].toLowerCase()}), 27275, "project_energy");
        ClientLobbyResources.field_e.putReplacement(QuickChatPhraseRegistry.replaceNumberedPlaceholders(var2, 4371, new String[]{Integer.toString(SoundPlayback.field_k[0], 16), UiTextSupport.field_d[0]}), 27275, "Project_Metal");
        ClientLobbyResources.field_e.putReplacement(QuickChatPhraseRegistry.replaceNumberedPlaceholders(var2, 4371, new String[]{Integer.toString(SoundPlayback.field_k[1], 16), UiTextSupport.field_d[1]}), param0 + 27274, "Project_Biomass");
        ClientLobbyResources.field_e.putReplacement(QuickChatPhraseRegistry.replaceNumberedPlaceholders(var2, 4371, new String[]{Integer.toString(SoundPlayback.field_k[2], 16), UiTextSupport.field_d[2]}), 27275, "Project_Energy");
        ClientLobbyResources.field_e.putReplacement(QuickChatPhraseRegistry.replaceNumberedPlaceholders(var2, 4371, new String[]{Integer.toString(SoundPlayback.field_k[3], 16), UiTextSupport.field_d[3]}), param0 ^ 27274, "Project_Exotics");
        ClientLobbyResources.field_e.putReplacement(QuickChatPhraseRegistry.replaceNumberedPlaceholders(var2, 4371, new String[]{Integer.toString(SoundPlayback.field_k[0], 16), UiTextSupport.field_d[0].toUpperCase()}), 27275, "PROJECT_METAL");
        ClientLobbyResources.field_e.putReplacement(QuickChatPhraseRegistry.replaceNumberedPlaceholders(var2, param0 ^ 4370, new String[]{Integer.toString(SoundPlayback.field_k[1], 16), UiTextSupport.field_d[1].toUpperCase()}), 27275, "PROJECT_BIOMASS");
        ClientLobbyResources.field_e.putReplacement(QuickChatPhraseRegistry.replaceNumberedPlaceholders(var2, param0 ^ 4370, new String[]{Integer.toString(SoundPlayback.field_k[2], 16), UiTextSupport.field_d[2].toUpperCase()}), param0 ^ 27274, "PROJECT_ENERGY");
        ClientLobbyResources.field_e.putReplacement(QuickChatPhraseRegistry.replaceNumberedPlaceholders(var2, param0 + 4370, new String[]{Integer.toString(SoundPlayback.field_k[3], 16), UiTextSupport.field_d[3].toUpperCase()}), 27275, "PROJECT_EXOTICS");
    }

    private final boolean pollGameAssetInitialization(int param0, boolean param1) {
        int var3 = 0;
        boolean stackIn_77_0 = false;
        int var4;
        var4 = field_F ? 1 : 0;
        Bzip2State.initializeMenuTextTables((byte) 51);
        if (null == IntHashIndex.field_a) {
          if (StrongCacheEntry.field_z != null) {
            ClientDialogSupport.setLoadingProgress(75.0f, 2, GuestPlayForm.field_I);
            this.draw(1);
            SpriteState.loadGameMusic(StrongCacheEntry.field_z, DualLinkNode.field_n, param0 - 47);
            DualLinkNode.field_n = null;
            StrongCacheEntry.field_z = null;
            ValidationState.resetFrameTiming(126);
            return false;
          }
          if (IntrusiveNodeHashTable.field_g != null) {
            ClientDialogSupport.setLoadingProgress(90.0f, 2, PasswordValidator.field_p);
            this.draw(1);
            GameAssetSetupSupport.initializeGameAssets(ChatMessage.field_d, (java.applet.Applet) (this), AttackTask.field_s, TextReplacementContext.field_f, IntrusiveNodeHashTable.field_g, RichTextLayout.field_k, (byte) -8);
            TextReplacementContext.field_f = null;
            IntrusiveNodeHashTable.field_g = null;
            RichTextLayout.field_k = null;
            ValidationState.resetFrameTiming(122);
            return false;
          }
          if (PointsVictoryChecker.field_l != null) {
            GameSpriteResources.loadGameBackdropSprites((byte) -126, PointsVictoryChecker.field_l);
            PointsVictoryChecker.field_l = null;
            ValidationState.resetFrameTiming(125);
            return false;
          }
          if (null != LeaderboardSortSupport.field_c) {
            ListContent.loadTutorialScenes(LeaderboardSortSupport.field_c, param0 - 167);
            IsaacRandom.field_h = TextReplacementEntry.decodeTrimmedLines(LeaderboardSortSupport.field_c.getFileByName(true, "starnames.txt", ""), (byte) -17);
            LeaderboardSortSupport.field_c = null;
            ValidationState.resetFrameTiming(121);
            return false;
          }
          if (null != GameSpriteResources.field_h) {
            CellVertex.setChatHuffmanCodec(1, new HuffmanCodec(GameSpriteResources.field_h.getFileByName(true, "huffman", "")));
            GameSpriteResources.field_h = null;
            ValidationState.resetFrameTiming(126);
            return false;
          }
          this.initializeGameTextReplacements(1);
          WhirlpoolHasher.measureAudioSettingLabels(true);
          SoundEffectDefinition.initializeIntro((byte) -125);
          for (var3 = 0; 14 > var3; var3++) {
            LobbyPlayerEntry.field_Hb[var3] = new GameMenuController(var3);
          }
          if (param0 != 82) {
            this.initializeGameTextReplacements(64);
          }
          PlayerRankingRequest.field_o = 0;
          stackIn_77_0 = !(RasterTargetSupport.field_b < 2);
          AchievementProgress.field_g = stackIn_77_0;
          HorizontalGradientComponent.field_A = -1;
          GameRules.field_c = 0;
          StringNode.field_j = -1;
          PaddedContentDialog.setTargetFrameRate(50, (byte) 52);
          UsernameAvailabilityValidator.requireSupportedFrameRate(param0 ^ -86, 50);
          ValidationState.resetFrameTiming(122);
          QuickChatCategoryRegistry.transitionMusicTrack(32767, PaddedContentDialog.field_nb, true, 1048576);
          return true;
        }
        if (AttackTask.field_s.isIndexLoaded((byte) 127) &&
          AttackTask.field_s.ensureGroupLoadedByName("basic", -70)) {
          if (AttackTask.field_s.isIndexLoaded((byte) -45) &&
            AttackTask.field_s.ensureGroupLoadedByName("lobby", param0 + 16)) {
            if (TextReplacementContext.field_f.isIndexLoaded((byte) 120) &&
              TextReplacementContext.field_f.ensureGroupLoadedByName("lobby", param0 ^ -62)) {
              if (IntHashIndex.field_a.isIndexLoaded((byte) 120) &&
                IntHashIndex.field_a.preloadAll(param0 - 83)) {
                if (ByteArrayReadRequest.field_m.isIndexLoaded((byte) -70) &&
                  ByteArrayReadRequest.field_m.preloadAll(param0 - 83)) {
                  if (DualLinkNode.field_n.isIndexLoaded((byte) 111) &&
                    DualLinkNode.field_n.preloadAll(param0 - 83)) {
                    if (StrongCacheEntry.field_z.isIndexLoaded((byte) -121) &&
                      StrongCacheEntry.field_z.preloadAll(-1)) {
                      if (ChatMessage.field_d.isIndexLoaded((byte) -81) &&
                        ChatMessage.field_d.ensureGroupLoadedByName("", -67)) {
                        if (PointsVictoryChecker.field_l.isIndexLoaded((byte) -19) &&
                          PointsVictoryChecker.field_l.preloadAll(param0 ^ -83)) {
                          if (IntrusiveNodeHashTable.field_g.isIndexLoaded((byte) -79) &&
                            IntrusiveNodeHashTable.field_g.preloadAll(-1)) {
                            if (LeaderboardSortSupport.field_c.isIndexLoaded((byte) -40) &&
                              LeaderboardSortSupport.field_c.preloadAll(param0 ^ -83)) {
                              if (GameSpriteResources.field_h.isIndexLoaded((byte) -125) &&
                                GameSpriteResources.field_h.preloadAll(-1)) {
                                if (RichTextLayout.field_k.isIndexLoaded((byte) -87) &&
                                  RichTextLayout.field_k.preloadAll(-1)) {
                                  QuickChatPhraseDefinition.resetDialogProgressAndInteractionState(-23771);
                                  ClientDialogSupport.setLoadingProgress(65.0f, 2, SocialNameInputPanel.field_xb);
                                  this.draw(param0 - 81);
                                  if (!param1) {
                                    return false;
                                  }
                                  GameSoundSetupSupport.initializeGameSounds(ByteArrayReadRequest.field_m, IntHashIndex.field_a, param0 + 18);
                                  IntHashIndex.field_a = null;
                                  ByteArrayReadRequest.field_m = null;
                                  ValidationState.resetFrameTiming(122);
                                  return false;
                                }
                                ClientDialogSupport.setLoadingProgress(75.0f, 2, CandidateLink.formatArchiveLoadingProgress(MouseInputHandler.field_e, RichTextLayout.field_k, param0 ^ 118, ToggleButton.field_v));
                                return false;
                              }
                              ClientDialogSupport.setLoadingProgress(75.0f, 2, BoundsRect.formatArchiveGroupLoadingProgress("", GameSpriteResources.field_h, (byte) 77, MouseInputHandler.field_e, ToggleButton.field_v));
                              return false;
                            }
                            ClientDialogSupport.setLoadingProgress(75.0f, 2, BoundsRect.formatArchiveGroupLoadingProgress("", LeaderboardSortSupport.field_c, (byte) 39, MouseInputHandler.field_e, ToggleButton.field_v));
                            return false;
                          }
                          ClientDialogSupport.setLoadingProgress(75.0f, 2, BoundsRect.formatArchiveGroupLoadingProgress("", IntrusiveNodeHashTable.field_g, (byte) 12, ValidatedTextInputWidget.field_J, SpriteState.field_r));
                          return false;
                        }
                        ClientDialogSupport.setLoadingProgress(75.0f, 2, BoundsRect.formatArchiveGroupLoadingProgress("", PointsVictoryChecker.field_l, (byte) 61, ValidatedTextInputWidget.field_J, SpriteState.field_r));
                        return false;
                      }
                      ClientDialogSupport.setLoadingProgress(75.0f, 2, BoundsRect.formatArchiveGroupLoadingProgress("", ChatMessage.field_d, (byte) 11, ValidatedTextInputWidget.field_J, SpriteState.field_r));
                      return false;
                    }
                    ClientDialogSupport.setLoadingProgress(60.0f, param0 - 80, BoundsRect.formatArchiveGroupLoadingProgress("", StrongCacheEntry.field_z, (byte) 62, ByteArrayStorage.field_a, MeshMaterial.field_b));
                    return false;
                  }
                  ClientDialogSupport.setLoadingProgress(45.0f, 2, SocialListEntry.formatArchiveGroupProgress(DualLinkNode.field_n, 0, ByteArrayStorage.field_a, MeshMaterial.field_b, param0 - 15012));
                  return false;
                }
                ClientDialogSupport.setLoadingProgress(40.0f, 2, BoundsRect.formatArchiveGroupLoadingProgress("", ByteArrayReadRequest.field_m, (byte) 47, PlayerReportPanel.field_Db, TurnEventLog.field_e));
                return false;
              }
              ClientDialogSupport.setLoadingProgress(20.0f, 2, BoundsRect.formatArchiveGroupLoadingProgress("", IntHashIndex.field_a, (byte) 117, PlayerReportPanel.field_Db, TurnEventLog.field_e));
              return false;
            }
            ClientDialogSupport.setLoadingProgress(17.0f, 2, BoundsRect.formatArchiveGroupLoadingProgress("lobby", TextReplacementContext.field_f, (byte) 94, LinkPainter.field_h, IntrusiveDequeCursor.field_h));
            return false;
          }
          ClientDialogSupport.setLoadingProgress(13.0f, 2, BoundsRect.formatArchiveGroupLoadingProgress("lobby", AttackTask.field_s, (byte) 19, ValidatedTextInputWidget.field_J, SpriteState.field_r));
          return false;
        }
        ClientDialogSupport.setLoadingProgress(10.0f, param0 ^ 80, BoundsRect.formatArchiveGroupLoadingProgress("basic", AttackTask.field_s, (byte) 38, ValidatedTextInputWidget.field_J, SpriteState.field_r));
        return false;
    }

    final void disposeResources(int param0) {
        ShatteredPlansClient.clearStatics((byte) -46);
        IntNode.clearStatics(23811);
        IntrusiveDeque.clearStatics(0);
        DateValidationSupport.clearStatics(82);
        RasterSpanFactory.clearStatics((byte) 111);
        TutorialStageSupport.clearStatics(-6);
        MusicCrossfadeStream.clearStatics(param0 ^ 24068);
        SpriteResourceSupport.clearStatics((byte) -77);
        GraphicsSettings.clearStatics(102);
        GameScreen.clearStatics(param0 ^ -24389);
        InvalidMapConnectionException.clearStatics((byte) 16);
        GameRules.clearStatics(true);
        GalaxyMap.clearStatics((byte) -98);
        TextReplacementContext.clearStatics(param0 ^ -24069);
        GameKeyHandler.a((byte) -102);
        LobbyRoomInteractionSupport.clearStatics(true);
        SettingsCookieSupport.releaseSettingsCookieStatics((byte) -23);
        LoginResultSupport.clearStatics((byte) -103);
        GameSoundSetupSupport.clearStatics(256);
        GameClientShell.clearStatics(-38);
        ClientException.clearStatics(108);
        GameApplet.b(param0 ^ -24187);
        UrlLoader.clearStatics(0);
        MouseInputHandler.clearMouseInputStatics(param0 ^ -24150);
        MouseWheelInput.clearStatics(param0 ^ -24163);
        SoftwareRasterizer.clearStatics();
        Archive.clearStatics(-466);
        SoundEffectSupport.clearStatics(param0 + 24069);
        PacketBuffer.clearStatics((byte) 78);
        ClientClockSupport.releaseClientClockStatics(21455);
        RasterTargetSupport.clearStatics(53);
        SpriteWipeSupport.clearStatics(2029303720);
        ChatPanelSetupSupport.releaseChatPanelSetupStatics(0);
        QuickChatMenuSupport.clearStatics(109);
        MenuTextResources.clearStatics(1);
        LobbyCommandSupport.releaseLobbyCommandStatics(1);
        TooltipSupport.clearStatics((byte) 125);
        ChatHistoryEntry.clearStatics((byte) -25);
        AccountHandshakeSupport.clearStatics(108);
        FrameTimer.clearStatics((byte) 47);
        ArchiveLoadProgress.clearStatics(param0 ^ -24161);
        FullscreenFocusCanvas.clearStatics(-1314558012);
        CanvasResizeController.clearStatics(false);
        ArchiveNetworkClient.clearArchiveNetworkStatics(16967);
        DiskCacheWorker.clearStatics(true);
        ArchiveSourceManager.clearStatics((byte) 124);
        BufferedCacheFile.clearStatics(false);
        BufferedSocket.clearStatics((byte) -127);
        PlayerStats.clearStatics((byte) -17);
        SolVictoryChecker.clearStatics(-26088);
        IntrusiveNode.clearIntrusiveNodeStatics(true);
        PolygonSpanIterator.clearStatics();
        BitmapFont.clearStatics();
        SocialListSetupSupport.clearStatics((byte) -106);
        ObjectList.clearStatics(false);
        QuickChatHelpPanelSupport.clearStatics(param0 ^ -17251);
        GameTextResources.releaseGameTextStatics((byte) 123);
        ClientCapabilitySupport.clearStatics((byte) -98);
        AccountInputSupport.releaseAccountInputStatics(64);
        AwtEventQueueSupport.clearStatics(127);
        ClientContextMenuSupport.clearStatics(21805);
        ProjectsWindowSupport.clearStatics((byte) -29);
        SoundCache.clearStatics((byte) 120);
        GameMenuController.clearStatics(-25370);
        GameSession.clearStatics(11);
        ChatAreaLayoutSupport.clearStatics(param0 + 24069);
        AccountNameValidationSupport.clearStatics((byte) 63);
        MidiPcmStream.clearStatics(-17876);
        IntrusiveNodeHashTable.clearStatics(0);
        MusicVoice.clearStatics(-109);
        MidiFileReader.clearStatics();
        PcmPlayerService.clearStatics();
        ClientPacketFlushSupport.clearStatics(-28065);
        MenuInputState.clearStatics(true);
        PanelNode.clearStatics(false);
        TiledNineSlicePainter.clearStatics(3);
        RematchMenuSupport.clearStatics((byte) -90);
        HighscoreResponseSupport.clearStatics(-17358);
        AnimatedPanel.clearStatics(-14115);
        LobbyRoomEntry.clearStatics(32);
        SecondaryNodeHashTable.clearStatics(true);
        LobbyPlayerEntry.clearStatics(-4923);
        IntroRenderSupport.clearStatics(-989994556);
        ExternalLinkSupport.releaseExternalLinkStatics(18031);
        IconTextPanel.clearStatics(2616);
        ScrollBar.clearStatics((byte) -118);
        ContextActionMenu.releaseContextMenuStatics(param0 ^ -24045);
        SocialListPanel.clearStatics(param0 + 47949);
        PlayerContextMenuController.clearStatics((byte) -87);
        ScrollPane.clearStatics(param0 ^ param0);
        PlayerReportPanel.clearStatics(param0 ^ 24070);
        ClientLobbyResources.clearStatics((byte) -117);
        ArchiveIndex.clearStatics(true);
        GzipInflater.clearStatics((byte) 114);
        ArchiveSource.clearStatics(false);
        ClientUiLoadingSupport.clearStatics((byte) 92);
        MenuTransitionSupport.clearStatics((byte) 118);
        DialogRoot.clearStatics(true);
        AccountCreationDialog.clearStatics(-17682);
        ProgressDialog.clearStatics((byte) -94);
        PaddedContentDialog.clearStatics(param0 + 24089);
        AccountStatusDialog.clearStatics((byte) -121);
        AccountCreationForm.clearStatics((byte) 32);
        GuestPlayForm.clearStatics((byte) 121);
        LoginForm.clearStatics((byte) -73);
        AccountFieldValue.clearStatics(param0 + 2129445);
        WidgetStyle.clearStatics(3);
        AdditiveSpriteWipeSupport.clearStatics(-23092);
        IsaacBackedRandom.clearStatics((byte) -109);
        Player.a(param0 ^ -24065);
        QuickChatHelpSupport.releaseQuickChatHelpSupportStatics(520);
        GameState.clearStatics((byte) -67);
        Star.clearStatics(param0 ^ -24069);
        FleetMove.clearStatics((byte) -106);
        PlacementOrder.clearStatics(21758);
        TerritoryResourcePanelSupport.clearStatics(true);
        HuffmanCodec.clearStatics(110);
        MapViewState.clearStatics(param0 ^ 28675);
        MapView.clearStatics(0);
        ConquestVictoryChecker.clearStatics(45);
        DerelictVictoryChecker.clearStatics((byte) -64);
        PointsVictoryChecker.clearPointsVictoryStatics((byte) 59);
        VictoryChecker.clearStatics(true);
        ClientOverlayDrawSupport.clearStatics(30);
        ServerRequestRetrySupport.clearStatics(param0 ^ -24162);
        ClientRasterSupport.clearStatics(4);
        LobbyOptionResources.releaseLobbyOptionResources((byte) -58);
        MessageKind.clearStatics(false);
        ChatMessage.clearChatMessageStatics(param0 ^ 24068);
        CipherPacketBuffer.clearStatics(0);
        LeaderboardSortSupport.clearStatics((byte) 1);
        ClientInputSupport.clearStatics((byte) 87);
        IsaacRandom.clearStatics(-117);
        TutorialTextSupport.clearStatics((byte) -20);
        UiTextSupport.clearStatics(126);
        IconLabelPanel.clearStatics((byte) 34);
        ChatAndSocialPanel.clearStatics(true);
        LobbyUiSetupSupport.clearStatics(58);
        DiplomacyRowSupport.clearStatics(-87);
        TabbedPanel.clearStatics((byte) 125);
        SocialNameInputPanel.releaseSocialNameInputStatics(param0 + 23965);
        ChatMessageFactory.clearStatics(param0 ^ 27074);
        QuickChatHelpPanel.clearStatics((byte) -124);
        StandardAi.clearStatics((byte) 79);
        TaskAi.clearStatics(param0 ^ 24118);
        FleetVisual.clearStatics(param0 ^ -24081);
        BattleSnapshot.clearStatics((byte) 68);
        Territory.clearStatics(-28714);
        BattleEvent.clearStatics(param0 + 24195);
        PlacementEvent.clearStatics((byte) 12);
        BattleContribution.clearStatics(false);
        StellarBombEvent.clearStatics(0);
        StarAbandonedEvent.clearStatics((byte) 48);
        TurnEventLog.clearStatics(0);
        NodeSequence.clearStatics((byte) -122);
        SoundTriggerTick.releaseSoundTriggerStatics((byte) 82);
        DualLinkDeque.clearStatics(param0 ^ -8957);
        QuaternaryNodeList.clearStatics(-79);
        UiSpriteSupport.clearStatics(false);
        LobbyRoomDecoder.clearStatics((byte) 99);
        GalaxyMapLayoutSupport.clearStatics(param0 - 4458);
        TutorialVictoryChecker.clearStatics(-124);
        ListContent.clearStatics((byte) 118);
        StatusContent.clearStatics(18973);
        ProductionContent.clearStatics(param0 + 24072);
        ProjectsContent.clearStatics(5);
        MenuButton.clearStatics(128);
        GradientMenuLabel.clearStatics(true);
        MenuComponent.clearMenuComponentStatics((byte) -124);
        HorizontalGradientComponent.clearStatics((byte) 106);
        SpriteButton.clearStatics((byte) -68);
        MenuList.clearStatics(1546006977);
        MenuLabel.clearStatics(104);
        ToggleButton.clearStatics((byte) 124);
        RoundedMenuPanel.clearStatics(true);
        MenuWindow.clearStatics((byte) 6);
        CombinedTerritory.clearStatics(0);
        DerelictMapGenerator.clearStatics(84);
        StandardMapGenerator.clearStatics(0);
        SolMapGenerator.clearStatics((byte) -80);
        TutorialMapGenerator.d(-10);
        TertiaryNodeList.clearTertiaryListStatics(-5731);
        AchievementProgress.clearStatics((byte) -37);
        GameAssetSetupSupport.clearStatics(100);
        BirthDateConfirmationForm.clearStatics(-105);
        DualLinkNode.clearStatics(9768448);
        IndexedSpriteState.clearStatics(1);
        SpriteState.clearSpriteStateStatics(997342595);
        ReflectionCheck.clearStatics((byte) -70);
        RandomAccessCacheFile.clearStatics(false);
        AccountStatusSupport.clearStatics((byte) -57);
        ClientUiResourceState.clearStatics((byte) 110);
        AudioService.clearStatics(-102);
        AlignedMenuLabel.clearStatics(-110);
        VerticalMenuSlider.clearStatics(5);
        IntroLoadingSupport.clearStatics(param0 + 24189);
        NotificationEntry.clearStatics(param0 ^ 11083);
        StringList.clearStatics(param0 ^ 10214);
        StringNode.clearStatics((byte) 102);
        TutorialScene.clearStatics((byte) 127);
        CellVertex.clearStatics(14077);
        StarLink.clearStatics(param0 + 24110);
        IntroLogoSupport.clearStatics(param0 ^ -24146);
        Wormhole.clearStatics(-93);
        HitRegion.clearStatics((byte) 15);
        AllianceExpiredEvent.clearStatics(true);
        SocketArchiveNetworkClient.clearStatics(-126);
        NetworkArchiveRequest.clearNetworkRequestStatics(false);
        SectorCacheStore.clearStatics(4);
        DiskArchiveRequest.clearStatics(param0 + 24092);
        CachedArchiveSource.clearStatics((byte) 114);
        ClientSessionSupport.clearStatics((byte) 123);
        ArchiveRequest.clearStatics(param0 ^ 6520);
        PacketBooleanSupport.clearStatics(-109);
        AccountNoticeDialog.clearStatics(param0 ^ -24069);
        WidgetTheme.clearStatics((byte) -77);
        RasterViewportState.clearStatics();
        VorbisSample.clearStatics();
        MeshMaterial.clearStatics((byte) 66);
        MeshData.clearStatics((byte) -74);
        PairedIntSortSupport.clearStatics((byte) 4);
        PlayerOverlaySupport.clearStatics(-27153);
        ClientRuntimeState.clearStatics(param0 ^ -24069);
        MapStateReader.clearStatics((byte) 91);
        DelegatingCanvas.clearDelegatingCanvasStatics(param0 ^ 24068);
        LobbyRoomControlsSupport.clearStatics((byte) 26);
        IntHashIndex.clearStatics((byte) -26);
        ByteArrayStorage.clearStatics(124);
        Bzip2Decoder.clearStatics();
        Bzip2State.clearStatics((byte) -105);
        ClientDrawingSupport.clearStatics(3);
        LoginRequestSupport.clearStatics(32);
        CheckboxPainter.clearCheckboxPainterStatics(false);
        StatefulWidgetTheme.clearStatics(true);
        DialPainter.clearStatics(16711935);
        SliderPainter.clearStatics((byte) 49);
        TextLayout.clearStatics(-109);
        UiWidget.clearStatics(0);
        FocusableWidget.clearStatics(true);
        SingleChildWidget.clearStatics((byte) 109);
        ResizingDialog.clearStatics(-123);
        Dialog.clearStatics(-1);
        WidgetContainer.clearStatics(param0 ^ -24192);
        IntrusiveDequeCursor.clearStatics(22256);
        OrderableInsertionSupport.releaseOrderableInsertionStatics((byte) 85);
        VorbisFloor1.clearStatics();
        AccountValidationText.clearStatics((byte) -121);
        TutorialOverlaySupport.clearStatics((byte) 127);
        RoundedFrameSupport.clearStatics((byte) 72);
        ChatPanelLayoutSupport.clearStatics(5);
        QuickChatMenu.clearStatics(param0 ^ 2556);
        QuickChatCategoryRegistry.clearStatics(true);
        QuickChatPhraseRegistry.clearStatics((byte) 125);
        QuickChatCategoryDefinition.clearStatics((byte) -117);
        QuickChatPhraseDefinition.clearStatics((byte) -50);
        WeightedLruCache.clearWeightedLruCacheStatics(false);
        SocketConnector.clearStatics((byte) 23);
        ProxyAuthenticationRequiredException.clearStatics(101);
        NanoFrameTimer.clearStatics((byte) 78);
        ImageProducerRasterBuffer.clearStatics(6);
        ClientRenderSupport.clearStatics(param0 ^ -24069);
        DisplayModeInfo.clearDisplayModeStatics(param0 + 24155);
        WhirlpoolHasher.clearStatics(0);
        StarLinkPlanner.clearStatics((byte) -11);
        LobbyUiSupport.clearStatics((byte) -81);
        KeyboardStateSupport.clearStatics(-122);
        TutorialConditionalText.clearStatics(true);
        TertiaryLinkNode.clearStatics((byte) -21);
        QuaternaryLinkNode.clearStatics(true);
        ClientOverlaySupport.clearStatics(640);
        BytePayloadNode.clearStatics((byte) 123);
        SynthInstrument.clearStatics();
        AttackTask.clearStatics(-62);
        DefendTask.clearStatics(-127);
        GarrisonTask.clearStatics((byte) -99);
        AiTask.clearStatics((byte) -122);
        DiplomacyNotice.clearStatics(11209);
        MusicPatch.clearStatics(59114);
        MusicEnvelope.clearStatics(false);
        LabeledChildWidget.clearStatics((byte) -43);
        ValidatedTextInputWidget.clearStatics(5);
        TextFieldWidget.clearStatics(102);
        ContentDialog.releaseDialogStatics((byte) 88);
        StripedProgressWidget.clearStatics(-125);
        NameSuggestionsPanel.clearStatics(param0 ^ -32120);
        TextHotspotWidget.clearStatics((byte) -104);
        ValidationIndicator.clearStatics((byte) 107);
        ValidationMessageWidget.clearStatics(4096);
        CheckboxWidget.clearStatics(-22429);
        TextFieldValidator.clearStatics((byte) -65);
        ChatCompositionSupport.releaseChatCompositionStatics(param0 + 26631);
        UnderageAccountInfoPanel.clearUnderagePanelStatics((byte) -75);
        DialWidget.clearStatics(4);
        SliderWidget.clearStatics(-104);
        LobbyLayoutSupport.clearStatics(-5);
        UniformNineSliceFactory.clearStatics((byte) 41);
        DerelictMapReader.clearStatics(false);
        StandardMapReader.clearStatics(-90);
        SolMapReader.clearStatics((byte) 87);
        StarAnnotation.clearStatics(param0 ^ 24068);
        BattleExplosionVisual.clearStatics(2);
        StarSoundState.clearStatics((byte) 93);
        FleetTrailPoint.clearStatics(true);
        LobbyOptionSupport.clearStatics((byte) 115);
        BirthDateValidator.clearStatics((byte) 124);
        NumericDateInputWidget.clearStatics(false);
        ArrayWidgetGroup.clearStatics(-1);
        TutorialAi.clearStatics(false);
        LegacyAi.clearStatics(19333);
        AggressiveAi.clearStatics((byte) 97);
        RecklessAi.clearStatics(388178881);
        IsolationistAi.clearStatics(false);
        DefensiveAi.clearStatics(30);
        PlayerEliminatedEvent.clearStatics(2105376);
        DateInputWidget.clearStatics((byte) -113);
        RichTextLayout.clearStatics((byte) 36);
        DirectByteArrayStorage.clearDirectByteArrayStorageStatics((byte) 104);
        IntList.clearIntListStatics(19568);
        DraggableWidget.clearStatics(-950540796);
        DropTargetWidget.clearDropTargetStatics((byte) 111);
        IterableNodeHashTable.clearStatics(-1215);
        SecondaryNodeDeque.clearStatics(param0 ^ -24167);
        WeightedCacheEntry.clearStatics(false);
        QuickChatParameterType.clearStatics(118);
        StrongCacheEntry.clearStatics(-120);
        ProxySocketConnector.clearStatics(1);
        CandidateLink.clearStatics(param0 + 24068);
        GameSpriteResources.clearStatics(-1);
        AudioFilter.clearStatics();
        ReflectionQueueSupport.releaseReflectionQueueSupportStatics(0);
        NodeHashTableIterator.clearStatics(param0 + 24068);
        SecondaryNodeDequeIterator.clearDequeIteratorStatics(124);
        HighscoreQueryRequest.clearStatics(1885);
        MenuPointerSupport.clearStatics((byte) 59);
        HighscorePlayerRecord.clearStatics((byte) -36);
        PlayerRankingRequest.clearStatics(-47);
        SoundPlayback.clearStatics((byte) -111);
        SoundEffectDefinition.clearStatics(9952);
        PopupPlacementSupport.releasePopupPlacementStatics(param0 + 24123);
        BoundsRect.clearStatics(0);
        TextReplacementEntry.clearStatics(param0 + 24098);
        SpriteStripButtonPainter.clearStatics((byte) -128);
        LinkPainter.clearStatics(-110);
        PasswordInputPainter.clearStatics(true);
        CheckboxWidgetPainter.clearStatics(-1);
        OpacityWidget.releaseOpacityWidgetStatics(124);
        SocialListEntry.clearStatics(0);
        ArchiveLoadStep.clearStatics((byte) 68);
        IntroTextLine.clearStatics((byte) -99);
        ClientRandomSupport.clearStatics(-67);
        IntroGlowPoint.clearStatics(true);
        AccountBooleanRequest.releaseAccountBooleanRequestStatics((byte) 127);
        AccountConnectionPhase.clearStatics(param0 ^ -24186);
        DelayedInboundPacket.clearStatics(param0 + 24021);
        ServerIntArrayRequest.clearStatics((byte) -115);
        FourIntSubmissionRequest.clearStatics((byte) 67);
        ByteArrayReadRequest.clearStatics(16711680);
        ByteArrayNode.clearByteArrayNodeStatics((byte) 93);
        AccountRequestState.clearStatics(param0 + 16160);
        AccountRequestResult.releaseAccountRequestStatics(1);
        StatusMessagePanel.clearStatics(240);
        LoginMethodPreference.clearStatics(16928);
        TargetedChatMessage.clearStatics((byte) -47);
        AlternateLoginCredentials.clearStatics(22595);
        PrivateChatMessage.clearStatics(false);
        RasterStateFrame.clearStatics(16777215);
        IntrusiveDequeSequence.clearStatics(11);
        DualLinkDequeSequence.clearStatics((byte) -107);
        TertiaryListSequence.clearStatics(0);
        QuaternaryListSequence.clearStatics(17593);
        RasterCoverageSpan.clearStatics(param0 ^ -14291);
        AccountNoticeKind.clearStatics(-1);
        IntArrayReadRequest.clearStatics(-13095);
        IntValueWriteRequest.clearStatics((byte) 107);
        WidgetStateStyle.clearStatics((byte) 70);
        TextLayoutLine.clearStatics(4324);
        UsernameAvailabilityValidator.clearStatics(true);
        PasswordValidator.clearStatics(param0 + 24324);
        EmailSyntaxValidator.clearStatics(param0 + 23978);
        EmailValidator.clearStatics(0);
        AgeValidator.clearStatics(127);
        MatchingTextValidator.clearStatics(param0 + 24147);
        ContentTransitionPhase.clearStatics(78);
        TextHotspotRegion.clearStatics((byte) -53);
        ValidationState.clearStatics(-31);
        DebouncedValidator.clearStatics((byte) -37);
        EmailValidationError.clearStatics((byte) -92);
        this.field_s = null;
        this.field_G = null;
    }

    public static void clearStatics(byte param0) {
        if (param0 != -46) {
          field_L = (String) null;
        }
        field_H = null;
        field_L = null;
        field_J = null;
        field_E = null;
    }

    public final void init() {
        this.configureGame("shatteredplans", 15, (byte) 112);
    }

    private final void tickMenusAndLobby(boolean param0, boolean param1) {
        int fieldTemp$0 = 0;
        boolean stackIn_47_0 = false;
        boolean stackIn_82_0 = false;
        int stackIn_102_0 = 0;
        int stackIn_107_0 = 0;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        String var9;
        String[] var11;
        String[] var12;
        int var4Lifetime1;
        int var4Lifetime2;
        boolean stackIn_47_0Lifetime1;
        var8 = field_F ? 1 : 0;
        if (~ClientOverlayDrawSupport.field_c != ~ClientOverlayDrawSupport.field_g) {
          if (ClientOverlayDrawSupport.field_g != ClientInputSupport.field_f) {
            if (~ClientOverlayDrawSupport.field_g == ~NanoFrameTimer.field_d) {
              if (!Dialog.d(true)) {
                if (null != StringList.field_b) {
                  AccountBooleanRequest.queueHighscoreSubmission(20, StringList.field_b, 3);
                }
                stackIn_82_0 = !(RasterTargetSupport.field_b < 2);
                AchievementProgress.field_g = stackIn_82_0;
                PlayerRankingRequest.field_o = SolMapReader.field_b;
                ArchiveRequest.prepareAchievementPlaceholderSprites(75, SpriteResourceSupport.loadSpriteByName(2, AttackTask.field_s, "basic", "unachieved"));
                GameSpriteResources.clearAccountChoiceFlag(!param0);
                if (BattleContribution.field_s) {
                  BattleContribution.field_s = false;
                  StrongCacheEntry.configureSharedUiSpriteResources(8, 13421772, IterableNodeHashTable.field_b, 8, AccountRequestState.field_b.field_K, DerelictMapReader.field_i, 240, AccountRequestState.field_b.field_q + AccountRequestState.field_b.field_K, DerelictMapReader.field_i, 320, AccountRequestState.field_b, AccountRequestState.field_b, 0, AccountRequestState.field_b.field_K, ValidationMessageWidget.field_P, AccountRequestState.field_b.field_q + AccountRequestState.field_b.field_K, 0, 2, 480, (Sprite[]) null, StarAnnotation.field_n);
                  HuffmanCodec.requestFullscreen(false, -1);
                }
                if (AccountStatusDialog.field_ob) {
                  MenuTransitionSupport.beginMenuTransition(PlayerRankingRequest.field_o, -6, (byte) 96, false);
                }
                if (PointsVictoryChecker.isMenuScreen((byte) -111, PlayerRankingRequest.field_o)) {
                  DiskCacheWorker.commitMenuTransition(1048576);
                }
                GzipInflater.initializeClientMenus(1);
              }
              AccountStatusDialog.field_ob = false;
              BattleContribution.field_s = false;
              ClientOverlayDrawSupport.field_g = WidgetTheme.field_n;
            } else {
              Bzip2State.field_F = Bzip2State.field_F - 1;
              if (Bzip2State.field_F == 0) {
                ClientOverlayDrawSupport.field_g = ClientOverlayDrawSupport.field_c;
              }
            }
          } else {
            Bzip2State.field_F = Bzip2State.field_F + 1;
            if (Bzip2State.field_F == 16) {
              if (BattleContribution.field_s) {
                TextReplacementEntry.openRequiredLoginForm(param0);
              } else {
                if (!AccountStatusDialog.field_ob) {
                  QuickChatCategoryDefinition.requestLoginForm((byte) -91);
                } else {
                  QuickChatCategoryDefinition.requestLoginForm((byte) -91);
                }
              }
              ClientOverlayDrawSupport.field_g = NanoFrameTimer.field_d;
            }
          }
        } else {
          var3 = 0;
          var4 = 0;
          if (!param1) {
            if (GameRules.field_c == PlayerRankingRequest.field_o) {
              if (GameRules.field_c != -1) {
                if (GameRules.field_c != -2) {
                  if (GameRules.field_c == -3) {
                    ScrollPane.tickIntroSequence((byte) 93);
                  } else {
                    if (PointsVictoryChecker.isMenuScreen((byte) -121, GameRules.field_c)) {
                      LobbyPlayerEntry.field_Hb[GameRules.field_c].updateMenu(2664);
                    }
                  }
                } else {
                  var3 = 1;
                }
              } else {
                if (!EmailValidator.field_p) {
                  PasswordInputPainter.field_x.tick(true, true);
                  while (PasswordValidator.pollKeyEventFullInts(55)) {
                    PasswordInputPainter.field_x.handleKeyInput(-86);
                  }
                } else {
                  var3 = 1;
                  var4 = 1;
                }
              }
            } else {
              if (BirthDateConfirmationForm.field_Q != 0 ||
                !PointsVictoryChecker.isMenuScreen((byte) -76, GameRules.field_c) ||
                LobbyPlayerEntry.field_Hb[GameRules.field_c].advanceCloseAnimation((byte) 95)) {
                BirthDateConfirmationForm.field_Q = BirthDateConfirmationForm.field_Q + 1;
              }
              if (BirthDateConfirmationForm.field_Q == 32) {
                DiskCacheWorker.commitMenuTransition(1048576);
              }
            }
          }
          if (EmailValidator.field_p &&
            !StripedProgressWidget.field_Q &&
            !ArchiveConnectionRetrySupport.field_a) {
            if (TiledNineSlicePainter.field_b &&
              MeshData.field_h) {
              var3 = 0;
            }
            StatusMessagePanel.updateLobby(2, var3 != 0);
            if (MusicEnvelope.field_d) {
              SecondaryNodeHashTable.field_g.tick(var4 != 0, true);
            }
            if (TiledNineSlicePainter.field_b) {
              StatusMessagePanel.updateChatInputOverlay(320, 8, 180, var4 != 0);
              PasswordInputPainter.field_x.tick(var4 != 0, true);
            }
            while (PasswordValidator.pollKeyEventFullInts(55)) {
              if (TiledNineSlicePainter.field_b) {
                if (StatefulWidgetTheme.handleChatKeyInput(13, -9861, 12, 15)) {
                  continue;
                }
              } else {
                SoundEffectDefinition.handleOverlayInput(0, 13, 15, 12);
              }
              stackIn_47_0 = MusicEnvelope.field_d;
              if (stackIn_47_0) {
                SecondaryNodeHashTable.field_g.handleKeyInput(-98);
              }
              if (!TiledNineSlicePainter.field_b) {
                continue;
              }
              PasswordInputPainter.field_x.handleKeyInput(-99);
            }
          }
          stackIn_47_0Lifetime1 = EmailValidator.field_p;
          if (!stackIn_47_0Lifetime1) {
            DelegatingCanvas.tickChatAndLobbyTransitions(0);
          }
          if (!ImageProducerRasterBuffer.field_n) {
            if (NodeHashTableIterator.field_h > 0) {
              NodeHashTableIterator.field_h = NodeHashTableIterator.field_h - 1;
            }
          } else {
            if (NodeHashTableIterator.field_h < MouseInputHandler.field_f) {
              NodeHashTableIterator.field_h = NodeHashTableIterator.field_h + 1;
            }
          }
          var5 = MouseInputHandler.field_f * MouseInputHandler.field_f;
          var6 = -(NodeHashTableIterator.field_h * NodeHashTableIterator.field_h) + var5;
          var7 = 120 * var6 / var5 + Player.field_z;
          ValidatedTextInputWidget.layoutChatPanelAtY(var7, (byte) -47);
          if (HorizontalGradientComponent.field_v > 0) {
            HorizontalGradientComponent.field_v = HorizontalGradientComponent.field_v - 1;
          }
          if (this.field_G.startForward(0) != null) {
            fieldTemp$0 = this.field_I + 1;
            this.field_I = this.field_I + 1;
            if (fieldTemp$0 == 335) {
              this.field_I = 0;
              this.field_G.pollFirst(64);
            }
          }
        }
        if (param0) {
          var9 = (String) null;
          ShatteredPlansClient.canMessageRecipient(64, 68L, (String) null);
        }
        if (PlayerRankingRequest.field_o == -4) {
          StringList.field_b = null;
          var11 = new String[]{IntList.field_f[0], IntList.field_f[1], IntList.field_f[2], IntList.field_f[3]};
          PasswordInputPainter.field_x = new GameSession(false, false, (int) MidiPcmStream.field_w[0], SliderWidget.field_K, PlacementEvent.field_k, var11, 0, false, (GameScreen) null);
          stackIn_102_0 = (!ArchiveLoadProgress.field_i) ? 0 : 1;
          var4Lifetime1 = stackIn_102_0;
          MenuTransitionSupport.beginMenuTransition(0, -1, (byte) 96, var4Lifetime1 != 0);
          Wormhole.field_i = true;
        }
        if (PlayerRankingRequest.field_o == -5) {
          StringList.field_b = null;
          var12 = new String[]{IntList.field_f[0]};
          PasswordInputPainter.field_x = new GameSession(false, true, 0, TaskAi.field_a, 0, var12, 0, false, (GameScreen) null);
          stackIn_107_0 = (!ArchiveLoadProgress.field_i) ? 0 : 1;
          var4Lifetime2 = stackIn_107_0;
          MenuTransitionSupport.beginMenuTransition(0, -1, (byte) 96, var4Lifetime2 != 0);
          Wormhole.field_i = true;
        }
        if (PlayerRankingRequest.field_o == -7) {
          NetworkArchiveRequest.writeLeaveGameRequest(11, MenuInputState.field_a.getRoomId(-79), (byte) -2);
          PlayerRankingRequest.field_o = GameRules.field_c;
          ArchiveConnectionRetrySupport.field_a = true;
        }
    }

    private final void openGameArchives(boolean param0) {
        if (StandardAi.field_e != null) {
          PrivateChatMessage.loadGameText(-47, StandardAi.field_e);
          StandardAi.field_e = null;
          ValidationState.resetFrameTiming(121);
        }
        GameSpriteResources.field_h = SoundCache.createArchive(3, 50);
        ChatMessage.field_d = IterableNodeHashTable.createArchive(5, true, param0, !param0 ? true : false, false);
        PointsVictoryChecker.field_l = SoundCache.createArchive(6, 93);
        IntrusiveNodeHashTable.field_g = SoundCache.createArchive(7, 110);
        IntHashIndex.field_a = SoundCache.createArchive(8, 90);
        ByteArrayReadRequest.field_m = SoundCache.createArchive(9, 28);
        DualLinkNode.field_n = SoundCache.createArchive(10, 55);
        StrongCacheEntry.field_z = SoundCache.createArchive(11, 67);
        LeaderboardSortSupport.field_c = SoundCache.createArchive(12, 28);
        RichTextLayout.field_k = SoundCache.createArchive(13, 52);
    }

    final void draw(int param0) {
        Object stackIn_3_0 = null;
        boolean stackIn_7_0 = false;
        boolean stackIn_18_0 = false;
        boolean stackIn_28_0 = false;
        int stackIn_69_0 = 0;
        boolean stackIn_71_1 = false;
        Object var2;
        IntNode var3_ref_he;
        int var3_int;
        long var3;
        String var4;
        int var5_int;
        long var5;
        int var6;
        int var7_int;
        long var7;
        int var8;
        int var9;
        int var10;
        int var11;
        Sprite var13;
        int var14;
        int[] var18;
        var14 = field_F ? 1 : 0;
        if (NameSuggestionsPanel.field_K != null) {
          stackIn_3_0 = NameSuggestionsPanel.field_K;
        } else {
          stackIn_3_0 = NotificationEntry.field_i;
        }
        var2 = stackIn_3_0;
        if (ArchiveLoadStep.isClientNotReady(false)) {
          if (NameSuggestionsPanel.field_K == null) {
            stackIn_7_0 = MusicPatch.field_i;
          } else {
            stackIn_7_0 = true;
          }
          TutorialStageSupport.drawLoadingOrAccountUi(stackIn_7_0, 10, (java.awt.Canvas) (var2));
          return;
        }
        if (!MutableIntPairNode.field_h) {
          ProxySocketConnector.drawAccountLoadingScreen(9242, (java.awt.Canvas) (var2));
          return;
        }
        if (!StrongCacheEntry.areClientPreferencesReady((byte) 116)) {
          ClientDialogSupport.setLoadingProgress(100.0f, 2, ToggleButton.field_v);
          ProxySocketConnector.drawAccountLoadingScreen(9242, (java.awt.Canvas) (var2));
          return;
        }
        if (~PlayerRankingRequest.field_o != ~GameRules.field_c) {
          stackIn_28_0 = (-1 == GameRules.field_c);
          ValidationState.drawCurrentClientScreen(stackIn_28_0, false);
          if (~GameRules.field_c != ~PlayerRankingRequest.field_o ||
            -2 != GameRules.field_c) {
            ShatteredPlansClient.drawIdleMenuLogo((byte) 67);
          }
          if (PointsVictoryChecker.isMenuScreen((byte) -105, GameRules.field_c) &&
            !PointsVictoryChecker.isMenuScreen((byte) -123, PlayerRankingRequest.field_o)) {
            LobbyPlayerEntry.field_Hb[GameRules.field_c].drawFadeTransition(94, 128 * BirthDateConfirmationForm.field_Q / 32);
          } else {
            if (!PointsVictoryChecker.isMenuScreen((byte) -75, GameRules.field_c) &&
              PointsVictoryChecker.isMenuScreen((byte) -127, PlayerRankingRequest.field_o)) {
              LobbyPlayerEntry.field_Hb[PlayerRankingRequest.field_o].drawFadeTransition(89, -(BirthDateConfirmationForm.field_Q * 128 / 32) + 128);
            } else {
              if (PointsVictoryChecker.isMenuScreen((byte) -125, GameRules.field_c) &&
                PointsVictoryChecker.isMenuScreen((byte) -74, PlayerRankingRequest.field_o)) {
                LobbyPlayerEntry.field_Hb[GameRules.field_c].drawMenuTransition(PlayerRankingRequest.field_o, -6469, 128 * BirthDateConfirmationForm.field_Q / 32);
              }
            }
          }
        } else {
          if (GameRules.field_c != -2) {
            stackIn_18_0 = (GameRules.field_c == -1);
            ValidationState.drawCurrentClientScreen(stackIn_18_0, false);
            if (GameRules.field_c != PlayerRankingRequest.field_o ||
              GameRules.field_c != -2) {
              ShatteredPlansClient.drawIdleMenuLogo((byte) 67);
            }
            if (PointsVictoryChecker.isMenuScreen((byte) -99, GameRules.field_c)) {
              LobbyPlayerEntry.field_Hb[GameRules.field_c].drawMenu(-121);
            }
          } else {
            SoftwareRasterizer.clear();
          }
        }
        if (PlayerRankingRequest.field_o != GameRules.field_c) {
          if (PlayerRankingRequest.field_o == -2) {
            SoftwareRasterizer.fillRectAlpha(0, 0, 640, 480, 0, 256 * BirthDateConfirmationForm.field_Q / 32);
          } else {
            if (GameRules.field_c == -2) {
              SoftwareRasterizer.fillRectAlpha(0, 0, 640, 480, 0, -(256 * BirthDateConfirmationForm.field_Q / 32) + 256);
            }
          }
        }
        if (!TutorialAi.field_x ||
          !Wormhole.field_i) {
          AnimatedPanel.drawClientAndLobbyOverlays(VictoryChecker.isCaretBlinkOn(30), (byte) 111);
        }
        if (FullscreenFocusCanvas.field_b > 0) {
          SoftwareRasterizer.fillRectAlpha(0, 0, 640, 480, 0, FullscreenFocusCanvas.field_b);
        }
        if (TutorialScene.isFullscreenDialogOpen(false)) {
          TextHotspotWidget.drawCenteredMenuPanel(SpriteWipeSupport.getFullscreenDialogWidth(-27572), param0 ^ -2, FleetMove.getFullscreenDialogHeight(param0 ^ -84));
          QuickChatMenuSupport.drawFullscreenDialog((byte) -119);
        } else {
          if (PlayerReportPanel.refreshClientActivityDeadline((byte) -67)) {
            stackIn_69_0 = 95;
            stackIn_71_1 = (null != NameSuggestionsPanel.field_K) || (MusicPatch.field_i);
            Player.$cfr$intArgs$a$7ffe4b125357(stackIn_69_0, stackIn_71_1);
          } else {
            if (!DialPainter.isAccountChoiceMenuOpen(0)) {
              if (!this.field_G.isEmpty(27)) {
                var3_ref_he = (IntNode) (this.field_G.startForward(param0 ^ 1));
                var4 = AwtEventQueueSupport.field_a[var3_ref_he.field_k];
                var5_int = AccountRequestState.field_b.stringWidth(var4) + 50;
                var6 = 36;
                var7_int = 10 + var5_int / 2;
                var8 = 10;
                var9 = this.field_I;
                if (303 < var9) {
                  var9 = 335 - var9;
                } else {
                  if (var9 > 32) {
                    var9 = 32;
                  }
                }
                var10 = QuickChatPhraseRegistry.interpolateSmoothStep(0, 32, var9, var5_int, param0 ^ 1);
                var11 = 10 + (var5_int - var10 >> 1);
                var18 = new int[4];
                SoftwareRasterizer.saveClip(var18);
                MidiPcmStream.a(var6, var8, var11, (byte) -78, var10);
                SoftwareRasterizer.setClip(var11, var8, var10 + var11, var8 + var6);
                var13 = GameSpriteResources.getAchievementIcon(var3_ref_he.field_k, (byte) 66);
                var13.draw(-36 + (var7_int + var5_int / 2), 4 + var8);
                AccountRequestState.field_b.drawString(var4, -(var5_int / 2) + (var7_int + 10), -2 + (AccountRequestState.field_b.field_J + var6 >> 1) + var8, 2805974, -1);
                SoftwareRasterizer.restoreClip(var18);
              }
            } else {
              TextHotspotWidget.drawCenteredMenuPanel(QuickChatParameterType.getMenuSpanWidth(-118), param0 - 2, ValidationMessageWidget.getMenuSpanHeight(param0 + 107));
              ClientException.drawAccountChoiceMenu(94);
            }
          }
        }
        if (ClientOverlayDrawSupport.field_g != ClientOverlayDrawSupport.field_c) {
          var3_int = Bzip2State.field_F * 256 / 16;
          if (var3_int > 0) {
            SoftwareRasterizer.fillRectAlpha(0, 0, SoftwareRasterizer.field_b, SoftwareRasterizer.field_k, 0, var3_int);
          }
        }
        if (EmailSyntaxValidator.field_n &&
          AchievementProgress.field_g) {
          AccountRequestState.field_b.drawString(Integer.toString(LinkPainter.field_i), 4, 4 + AccountRequestState.field_b.field_J, 16777215, -1);
          var3 = Runtime.getRuntime().totalMemory();
          var5 = Runtime.getRuntime().freeMemory();
          var7 = -var5 + var3;
          AccountRequestState.field_b.drawString((int)(var7 >> 10) + "kb", 4, 2 * AccountRequestState.field_b.field_J + 8, 16777215, -1);
        }
        if (param0 != 1) {
          this.shutdown(true);
        }
        WeightedCacheEntry.paintRasterToCanvas(110, 0, (java.awt.Canvas) (var2), 0);
    }

    public ShatteredPlansClient() {
        this.field_G = new IntrusiveDeque();
        this.field_I = 0;
    }

    private final static void drawIdleMenuLogo(byte param0) {
        int var1 = 0;
        int var2 = 0;
        double var3 = 0.0;
        int var2Lifetime1;
        if (-3 != GameRules.field_c) {
          if (PasswordInputPainter.field_x != null ||
            SecondaryNodeHashTable.field_g != null) {
            return;
          }
          var1 = -320 + (RasterStateFrame.field_n % 640 << 1);
          var2 = -320 + var1;
          if (param0 != 67) {
            return;
          }
          var3 = (Math.cos(3.141592653589793 * (double)var2 / 640.0) + 1.0) * 12.0;
          if (var3 > 16.0) {
            var3 = var3 + 5.0 * (var3 - 16.0);
          }
          BattleExplosionVisual.darkenThroughSpriteMaskFromOffset(param0 - 67, (640 - SecondaryNodeHashTable.field_f.field_o) / 2, 10, SettingsCookieSupport.field_a);
          var2Lifetime1 = (int)var3;
          SecondaryNodeHashTable.field_f.drawAdditive((640 - SecondaryNodeHashTable.field_f.field_o) / 2, 10, 256);
          return;
        }
    }

    static {
        field_K = true;
        field_L = "Production";
        field_J = "Target: <%0> points";
    }
}
