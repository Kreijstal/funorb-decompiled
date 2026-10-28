/*
 * Decompiled by CFR-JS 0.4.0.
 */
public final class EscapeVector extends NetworkGameClient {
    static String field_z;
    public static int obfuscationControl;

    final void renderClient(byte guard) {
        try {
          int var2_int = -74 / ((-71 - guard) / 55);
          GameAppletShell.field_k = false;
          this.renderFrame(-27273);
          ByteArrayPoolSupport.updateMenuGridSounds((byte) -54);
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "EscapeVector.O(" + guard + ')');
        }
    }

    final void updateClient(int guard) {
        int var4 = obfuscationControl;
        try {
          if (ScoreSubmission.field_h[1]) {
            QuitPageSupport.field_c = false;
          }
          if (ScoreSubmission.field_h[2]) {
            QuitPageSupport.field_c = true;
          }
          int var2_int = 119 % ((guard + 39) / 33);
          if (null != IsaacRandom.field_d &&
            IsaacRandom.field_d.focusLost) {
            DisplayAndRatingSupport.exitFullscreen(-25123);
            ValidationIndicator.a((byte) 97);
          }
          UiContainer.field_C.serviceOutput();
          LevelSelectScreen.field_l.serviceOutput();
          int stackIn_16_1 = -1;
          boolean stackIn_17_2 = (null != IsaacRandom.field_d);
          this.serviceFramework(stackIn_16_1, stackIn_17_2);
          if (SpriteDecodeSupport.field_b) {
            this.initializeGameArchives(true);
            SpriteDecodeSupport.field_b = false;
          }
          SelfDestructEffects.field_s = false;
          IntValueNode.field_j = false;
          SingleChildContainer.field_y = false;
          if (!ChatSettingsSupport.needsFrameworkPreparation(16836)) {
            boolean decompiledFrameRemainder0 = true;
            if (!ShipHullGeometry.field_h) {
              this.advanceAssetLoading((byte) -96);
            } else if (AchievementThresholdRule.isAccountStateReady((byte) -120)) {
              if (!LoginHandshakeSupport.isLegacyMenuVisible((byte) 79)) {
                if (SessionMenuSupport.startRequestTimeout((byte) -127)) {
                  if (BoundedRandomAccessFile.activeSession != null) {
                    BoundedRandomAccessFile.activeSession.stopSessionAudio((byte) -41);
                  }
                  boolean stackIn_42_1 = (IsaacRandom.field_d != null);
                  int var3 = this.pollOverlayActions(stackIn_42_1, -556);
                  if (var3 == 1) {
                    DisplayAndRatingSupport.exitFullscreen(-25123);
                  }
                  if (var3 == 2) {
                    if (IsaacRandom.field_d != null) {
                      DisplayAndRatingSupport.exitFullscreen(-25123);
                    }
                    QuitPageSupport.openQuitPage(-9787, PointCloudEffect.activeApplet((byte) -119));
                  }
                  decompiledFrameRemainder0 = (var4 != 0);
                }
                if (decompiledFrameRemainder0) {
                  AchievementThresholdRule.advanceScreensAndAccountState((byte) -90);
                  this.updateSessionMusic(1);
                  decompiledFrameRemainder0 = (var4 != 0);
                }
              }
              if (decompiledFrameRemainder0) {
                if (BoundedRandomAccessFile.activeSession == null) {
                  GameModeSelectScreen.advanceMenuEdgeSegments((byte) -125);
                }
                if (LoginHandshakeSupport.field_d == 0) {
                  StringNode.playFrameAppearSound(8192, (byte) 51);
                }
                IntValueNode.field_j = true;
                if (null != BoundedRandomAccessFile.activeSession &&
                  20 <= LoginHandshakeSupport.field_d) {
                  IntValueNode.field_j = false;
                }
                if (1000 > LoginHandshakeSupport.field_d) {
                  LoginHandshakeSupport.field_d = LoginHandshakeSupport.field_d + 1;
                }
                int var3Lifetime2 = SpriteOffset.pollLegacyMenuAction(-14);
                if (var3Lifetime2 == 2) {
                  DisplayAndRatingSupport.exitFullscreen(-25123);
                }
                if (var3Lifetime2 == 3) {
                  TickClock.a(24, true);
                }
                if (var3Lifetime2 == 4) {
                  SessionMenuSupport.beginKeyboardAccountLogin((byte) -112);
                }
                if (!LoginHandshakeSupport.isLegacyMenuVisible((byte) 92)) {
                  if (null != BoundedRandomAccessFile.activeSession) {
                    SessionMenuSupport.field_c.updatePointerSelection(PauseMenuState.input.pointerDriven, 320);
                    if (var4 != 0) {
                      AlternateUsernameCredentials.field_q.updatePointerSelection(-26480, AlternateUsernameCredentials.field_q.input.pointerDriven);
                    }
                  } else {
                    AlternateUsernameCredentials.field_q.updatePointerSelection(-26480, AlternateUsernameCredentials.field_q.input.pointerDriven);
                  }
                  LoginHandshakeSupport.field_d = 0;
                  ChatMessage.clearFrameOffsets((byte) -67);
                }
                if (var4 != 0) {
                  KeyboardStateSupport.serviceAccountInput(25972, KeyboardIdleSupport.field_f);
                  DirectByteStorage.b((byte) -59);
                  this.advanceAssetLoading((byte) -96);
                }
              }
            } else {
              KeyboardStateSupport.serviceAccountInput(25972, KeyboardIdleSupport.field_f);
              DirectByteStorage.b((byte) -59);
              if (var4 != 0) {
                this.advanceAssetLoading((byte) -96);
              }
            }
            while (true) {
              if (BufferedRandomAccessFile.pollIncomingPacket(SpriteLabelColumns.field_u, 109)) {
                this.dispatchAccountPacket(127);
                if (var4 == 0) {
                  continue;
                }
              } else {
                ClientException.a(0, 30785);
              }
              break;
            }
            if (AccountSessionStatusSupport.hasAccountSession(17830)) {
              this.reconnectAndResendRequests((byte) -67);
              if (var4 != 0) {
                this.serviceAccountFlow(-9926);
                if (!ChatSettingsSupport.needsFrameworkPreparation(16836) &&
                  LoginHandshakeSupport.isLegacyMenuVisible((byte) 125)) {
                  TickClock.a(24, true);
                }
              }
            }
          } else {
            this.serviceAccountFlow(-9926);
            if (!ChatSettingsSupport.needsFrameworkPreparation(16836) &&
              LoginHandshakeSupport.isLegacyMenuVisible((byte) 125)) {
              TickClock.a(24, true);
            }
          }
          if (AccountPanelInputSupport.field_c != null &&
            !SingleChildContainer.field_y) {
            AccountPanelInputSupport.field_c.fadeOut(2048);
            AccountPanelInputSupport.field_c = null;
          }
          if (null != AchievementThresholdRule.field_a &&
            !IntValueNode.field_j) {
            AchievementThresholdRule.field_a.fadeOut(2048);
            AchievementThresholdRule.field_a = null;
          }
          if (!SelfDestructEffects.field_s) {
            int var3Lifetime1 = 0;
            while (!(ValidatedTextWidget.field_K.length <= var3Lifetime1)) {
              if (var4 != 0) {
                return;
              }
              if (ValidatedTextWidget.field_K[var3Lifetime1] != null) {
                ValidatedTextWidget.field_K[var3Lifetime1].fadeOut(256);
                ValidatedTextWidget.field_K[var3Lifetime1] = null;
              }
              var3Lifetime1++;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) var2), "EscapeVector.H(" + guard + ')');
        }
    }

    public static void releaseStatics(byte guard) {
        try {
          field_z = null;
          if (guard >= -76) {
            EscapeVector.drawOutlinedText((String) null, 38, -112, (byte) -73);
          }
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "EscapeVector.CB(" + guard + ')');
        }
    }

    final void releaseClientStatics(byte guard) {
        try {
          EscapeVector.releaseStatics((byte) -95);
          GameKeyHandler.releaseStatics(47);
          ConnectionSupport.releaseStatics(false);
          InstructionsNavigationSupport.releaseStatics(69);
          AccountPanelInputSupport.releaseStatics((byte) -116);
          NetworkGameClient.releaseStatics((byte) -73);
          ClientException.releaseStatics(false);
          GameAppletShell.releaseStatics((byte) -111);
          BoundedUrlRequest.releaseStatics(-1);
          MouseInputHandler.releaseStatics(-1);
          MouseWheelInput.releaseStatics((byte) 104);
          SoftwareRasterizer.releaseStatics();
          ResourceArchive.releaseStatics(124);
          BitmapFont.releaseStatics();
          MembershipAssetSupport.releaseStatics(-111);
          PacketBuffer.releaseStatics((byte) 70);
          MonotonicClockSupport.releaseStatics(128);
          RasterRestoreSupport.releaseStatics((byte) -96);
          CampaignLoadingSupport.releaseStatics(13);
          CanvasRenderSupport.releaseStatics(-49153);
          BrowserSessionMarkerState.releaseStatics(18);
          ArchiveSpriteLoader.releaseStatics(8192);
          SavedDataRequestSupport.releaseStatics((byte) -127);
          NameAvailabilityResultSupport.releaseStatics((byte) 110);
          ChatSettingsSupport.releaseStatics(20);
          ChatMessage.releaseStatics(-13885);
          KeyboardIdleSupport.releaseStatics(true);
          AccountSessionStatusSupport.releaseStatics(false);
          NameAvailabilityResponseSupport.releaseStatics(-76);
          IntroFrameRenderer.releaseStatics(true);
          TickClock.releaseStatics((byte) -72);
          RasterBuffer.releaseStatics((byte) 107);
          ArchivePreloader.releaseStatics((byte) -59);
          FullscreenFocusCanvas.releaseStatics((byte) 71);
          ViewportController.releaseStatics(false);
          HighscoresScreen.releaseStatics((byte) 77);
          InstructionsScreen.releaseStatics(-1);
          AchievementsScreen.releaseStatics(0);
          AchievementTracker.releaseStatics(1);
          GameProgressTracker.releaseStatics(80);
          SimulatorSpriteAssets.releaseStatics(99);
          Js5Transport.releaseStatics(-4470);
          DiskCacheWorker.releaseStatics(-4);
          Js5ArchiveManager.releaseStatics(true);
          BufferedRandomAccessFile.releaseStatics((byte) 123);
          BufferedSocket.releaseStatics((byte) 6);
          IntrusiveDeque.releaseStatics(true);
          TrackerMusicDefinition.releaseStatics(-32408);
          TrackerMusicPlayer.releaseStatics();
          AudioOutput.releaseStatics();
          GameplaySession.releaseStatics((byte) 69);
          MainMenuScreen.releaseStatics((byte) -34);
          LevelSelectScreen.releaseStatics(-60);
          GameModeSelectScreen.releaseStatics(459);
          PauseMenuScreen.releaseStatics(-92);
          MenuInputState.releaseStatics((byte) 49);
          PcmResampler.releaseStatics(104);
          SharedSpriteAssets.releaseStatics((byte) -106);
          LoginPromptSupport.releaseStatics(9);
          LevelObject.releaseStatics(false);
          IntrusiveNode.releaseStatics(-71);
          SpriteState.releaseStatics(-363232252);
          DualLinkNode.releaseStatics((byte) -11);
          IndexedSpriteState.releaseStatics(-26317);
          ArchiveFactorySupport.releaseStatics(2097152);
          AudioService.releaseStatics((byte) -58);
          ModeProgress.releaseStatics(false);
          SavedCompletionFlags.releaseStatics((byte) 80);
          ChatMessageDecoder.releaseStatics(127);
          FrameworkLoadingStatus.releaseStatics(91);
          ArchiveIndex.releaseStatics((byte) 18);
          GzipDecoder.releaseStatics((byte) 124);
          ArchiveProvider.releaseStatics((byte) 123);
          LoginHandshakeSupport.releaseStatics(true);
          KeyCodeSupport.releaseStatics(-1);
          QuitPageSupport.releaseStatics((byte) -98);
          AchievementFlagSupport.releaseStatics(true);
          LegacyMenuFontSupport.releaseStatics(-71);
          IntegerParseSupport.releaseStatics(false);
          SessionMenuSupport.releaseStatics(0);
          MembershipPromotionSupport.releaseStatics(-28377);
          ModalStack.releaseStatics(0);
          RegistrationRequestDialog.releaseStatics(-106);
          LoadingProgressDialog.releaseStatics(300);
          LoginDialog.releaseStatics((byte) 124);
          AccountRequestDialog.releaseStatics(-5);
          AccountRegistrationPanel.releaseStatics(-125);
          LoginForm.releaseStatics(96);
          DisplayNameForm.releaseStatics((byte) 95);
          LoginText.releaseStatics((byte) -118);
          UiTheme.releaseStatics(-27204);
          GuestLoginSupport.releaseStatics((byte) 103);
          LegacyButton.releaseStatics(1);
          AnimatedPathMarker.releaseStatics(0);
          SynthInstrument.releaseStatics();
          VorbisSample.releaseStatics();
          VorbisFloor.releaseStatics();
          SoundCache.releaseStatics((byte) -72);
          IntrusiveNodeHashTable.releaseStatics(0);
          SpriteArchiveSupport.releaseStatics((byte) 65);
          KeyboardStateSupport.releaseStatics(105);
          DynamicTerrainRenderer.releaseStatics(3);
          SelfDestructEffects.releaseStatics(-12548);
          PointCloudEffect.releaseStatics(109);
          Minimap.releaseStatics(68);
          TetherHumStream.releaseStatics(-1600199832);
          LaserGateSpan.releaseStatics((byte) -107);
          HudMessage.releaseStatics((byte) -85);
          RockBuster.releaseStatics((byte) 102);
          SeekerMine.releaseStatics(false);
          InputGlyphSupport.releaseStatics((byte) 63);
          LegacyStyleNode.releaseStatics(-1);
          NineSliceFrame.releaseStatics((byte) 86);
          FrameCadenceSupport.releaseStatics((byte) 23);
          LegacyMenuState.releaseStatics(-13379);
          AccountPayloadSupport.releaseStatics(true);
          MenuTitleSupport.releaseStatics((byte) 26);
          LevelAvailabilitySupport.releaseStatics(16558);
          LoginCredentialType.releaseStatics(124);
          LoginCredentials.releaseStatics(-102);
          CipherPacketBuffer.releaseStatics(106);
          DialogueScreen.releaseStatics(true);
          IsaacRandom.releaseStatics((byte) -88);
          SocketJs5Transport.releaseStatics(-24811);
          Js5NetworkRequest.releaseStatics((byte) 34);
          SectorCacheStore.releaseStatics(true);
          CachedArchiveProvider.releaseStatics((byte) 8);
          BoundedRandomAccessFile.releaseStatics(1);
          RegistrationFlowSupport.releaseStatics(32153);
          ArchiveRequest.releaseStatics(5);
          IntroAudioSupport.releaseStatics(127);
          AccountNoticeDialog.releaseStatics(-23008);
          TextWidgetPainter.releaseStatics(-24239);
          MeshRasterState.releaseStatics();
          DisplayAndRatingSupport.releaseStatics(-117);
          MeshMaterial.releaseStatics(true);
          TriangleMesh.releaseStatics(true);
          TrackerMusicLoader.releaseStatics(-117);
          RepeatedCharacterSupport.releaseStatics((byte) -96);
          ThemeAssetSupport.releaseStatics(56);
          MeshProjectionSupport.releaseStatics(3);
          SpaceCompactionSupport.releaseStatics(-56);
          SavedDataQuerySupport.releaseStatics(0);
          GameProgressSupport.releaseStatics(0);
          ModeProgressSupport.releaseStatics(true);
          LegacyWidgetStyle.releaseStatics(4095);
          SecondaryNodeHashTable.releaseStatics((byte) 103);
          DelegatingCanvas.releaseStatics(127);
          LoginIdentifierSupport.releaseStatics(true);
          ByteStorage.releaseStatics((byte) 86);
          Bzip2Decoder.releaseStatics();
          Bzip2State.releaseStatics(8192);
          ReflectionCheck.releaseStatics((byte) 96);
          ByteArrayPoolSupport.releaseStatics((byte) 77);
          BitCountSupport.releaseStatics(26);
          CheckboxPainter.releaseStatics((byte) -44);
          StatefulTextPainter.releaseStatics(true);
          DialWidgetPainter.releaseStatics((byte) -76);
          MarkerSliderPainter.releaseStatics(0);
          TextLayout.releaseStatics(0);
          UiComponent.releaseStatics((byte) 58);
          TextButton.releaseStatics(1);
          SingleChildContainer.releaseStatics((byte) 58);
          ResizableModalPanel.releaseStatics((byte) -112);
          ModalPanel.releaseStatics((byte) 127);
          UiContainer.releaseStatics((byte) -68);
          IntrusiveDequeCursor.releaseStatics(false);
          PauseMenuState.releaseStatics(-5691);
          TrackerGainSupport.releaseStatics(false);
          QuickChatPhraseDefinition.releaseStatics(95);
          ServerListNavigationSupport.releaseStatics((byte) -87);
          QuickChatPhraseCache.releaseStatics(100);
          WeightedLruCache.releaseStatics(true);
          AccountOverlayController.releaseStatics((byte) 118);
          HuffmanDecoder.releaseStatics((byte) 106);
          AccountSessionSupport.releaseStatics(0);
          LegacyMenuThemeSupport.releaseStatics((byte) -101);
          SocketConnector.releaseStatics(true);
          NanoTickClock.releaseStatics(116);
          ImageProducerRasterBuffer.releaseStatics(-1);
          ChatHistorySupport.releaseStatics(119);
          DisplayModeInfo.releaseStatics(123);
          IntroRasterSupport.releaseStatics(-17129);
          SessionCounterState.releaseStatics(false);
          SimulatorAssetSupport.releaseStatics((byte) -119);
          IntValueNode.releaseStatics(true);
          WhirlpoolHasher.releaseStatics(true);
          StringNode.releaseStatics((byte) 123);
          SpriteDecodeSupport.releaseStatics(122);
          MenuTitleRenderSupport.releaseStatics(false);
          PathPoint.releaseStatics(-10497);
          LabeledField.releaseStatics(88);
          ValidatedTextWidget.releaseStatics((byte) -87);
          EditableTextWidget.releaseStatics((byte) -96);
          ContentTransitionDialog.releaseStatics(-11555);
          StripedProgressBar.releaseStatics((byte) 127);
          NameSuggestionsPanel.releaseStatics(-24896);
          ValidationIndicator.releaseStatics((byte) 113);
          ValidationHelpWidget.releaseStatics((byte) 113);
          Checkbox.releaseStatics((byte) 105);
          TextFieldValidator.releaseStatics(-16187);
          AccountTermsPanel.releaseStatics(1);
          DialWidget.releaseStatics(true);
          MarkerSlider.releaseStatics((byte) 59);
          AudioFilter.releaseStatics();
          IntroFinalFrameSupport.releaseStatics(17159);
          CachedTextLayout.releaseStatics(true);
          DirectByteStorage.releaseStatics(-4);
          GrowableIntList.releaseStatics(true);
          DraggableWidget.releaseStatics(-105);
          DropTargetWidget.releaseStatics((byte) 59);
          QuickChatDynamicCommand.releaseStatics(5468);
          IterableNodeHashTable.releaseStatics((byte) 126);
          IterableDualLinkDeque.releaseStatics((byte) 99);
          WeightedCacheEntry.releaseStatics(0);
          StrongCacheEntry.releaseStatics(28);
          ProxySocketConnector.releaseStatics(true);
          LoginHandshakeState.releaseStatics(8123);
          NodeHashTableIterator.releaseStatics(false);
          DualLinkDequeIterator.releaseStatics(true);
          HighscoreQuery.releaseStatics(-83);
          ScoreSubmission.releaseStatics(65535);
          HighscorePlayerRecord.releaseStatics(0);
          ArchiveKeyRequest.releaseStatics((byte) -77);
          ThreeSliceButtonPainter.releaseStatics((byte) -31);
          LinkButtonPainter.releaseStatics((byte) 97);
          GradientOutlineTextPainter.releaseStatics(-11967);
          PasswordFieldPainter.releaseStatics((byte) -93);
          SpriteCheckboxPainter.releaseStatics(1);
          AlphaContainer.releaseStatics(119);
          ContactEntry.releaseStatics(0);
          RatingQuery.releaseStatics(29152);
          ArchiveLoadTask.releaseStatics((byte) -79);
          HighscoreTable.releaseStatics(3355);
          LegacyMenuColumn.releaseStatics(0);
          SpriteFactorySupport.releaseStatics(-109);
          LegacyTextBlock.releaseStatics(-30082);
          PairedTextColumns.releaseStatics(false);
          SpriteLabelColumns.releaseStatics(94);
          SpriteStrip.releaseStatics(96);
          AnimatedPanelFrame.releaseStatics(12474);
          TransitionPoint.releaseStatics(-5);
          SlidingSpriteTransition.releaseStatics((byte) 118);
          AchievementDefinition.releaseStatics(4);
          AchievementThresholdRule.releaseStatics(4);
          SpriteLoadTask.releaseStatics(7);
          TerrainMap.releaseStatics(-126);
          ShipHullGeometry.releaseStatics(-1);
          IntPoint.releaseStatics(-3217);
          AchievementQuery.releaseStatics(false);
          AchievementRecord.releaseStatics(false);
          ObjectSpriteSet.releaseStatics(122);
          SpriteOffset.releaseStatics(122);
          RasterSnapshot.releaseStatics((byte) 75);
          AccountFormStage.releaseStatics(-128);
          NameAvailabilityResult.releaseStatics((byte) -10);
          EmailAvailabilityRequest.releaseStatics((byte) 65);
          AccountMessagePanel.releaseStatics(8);
          MenuEdgeSegment.releaseStatics((byte) -20);
          TileSpriteCacheEntry.releaseStatics(64);
          SeekerPulseStream.releaseStatics((byte) -43);
          LoginMethod.releaseStatics(false);
          UsernameCredentials.releaseStatics((byte) -71);
          AlternateUsernameCredentials.releaseStatics(256);
          EmailCredentials.releaseStatics(11);
          ProgressQuery.releaseStatics(false);
          ProgressRecord.releaseStatics(50);
          SavedDataQuery.releaseStatics(-116);
          SavedDataWrite.releaseStatics(-119);
          if (guard >= -52) {
            this.loadObjectSprites(-97);
          }
          WidgetStyleLayer.releaseStatics(59);
          TextLayoutLine.releaseStatics(-19467);
          NameAvailabilityValidator.releaseStatics((byte) 0);
          PasswordValidator.releaseStatics(29779);
          EmailSyntaxValidator.releaseStatics(14);
          EmailAvailabilityValidator.releaseStatics(0);
          AgeValidator.releaseStatics(-17);
          MatchingTextValidator.releaseStatics(-17318);
          TerrainMaskSupport.releaseStatics((byte) 14);
          TextHotspotRegion.releaseStatics(255);
          DebouncedValidator.releaseStatics(true);
          EmailValidationError.releaseStatics(31167);
          this.serverHost = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) var2), "EscapeVector.E(" + guard + ')');
        }
    }

    private final void advanceAssetLoading(byte guard) {
        int var3 = obfuscationControl;
        try {
          KeyboardStateSupport.serviceAccountInput(guard ^ -25900, KeyboardIdleSupport.field_f);
          if (null == ByteStorage.gameFont) {
            ModeProgress.refreshAccountUi(-122);
            InstructionsScreen.setLoadingProgress(TextLayout.field_f, guard ^ -17595, 70.0f);
            this.renderClient((byte) -128);
            ByteStorage.gameFont = DisplayNameForm.loadBinaryFont(guard ^ -92, LoginText.field_c, "", "fonts_squarish16", IndexedSpriteState.field_j);
            LoginText.field_c = null;
            SlidingSpriteTransition.field_f = MembershipPromotionScreen.loadNamedSprite("", IndexedSpriteState.field_j, "titles_escape", true);
            ArchiveIndex.field_o = MembershipPromotionScreen.loadNamedSprite("", IndexedSpriteState.field_j, "titles_vector", true);
            DisplayNameForm.field_O = MembershipPromotionScreen.loadNamedSprite("", IndexedSpriteState.field_j, "titles_achievements", true);
            ValidationHelpWidget.field_I = MembershipPromotionScreen.loadNamedSprite("", IndexedSpriteState.field_j, "titles_achievements_this_game", true);
            DynamicTerrainRenderer.field_w = MembershipPromotionScreen.loadNamedSprite("", IndexedSpriteState.field_j, "titles_highscores", true);
            AccountTermsPanel.field_H = MembershipPromotionScreen.loadNamedSprite("", IndexedSpriteState.field_j, "titles_instructions", true);
            SocketConnector.field_c = MembershipPromotionScreen.loadNamedSprite("", IndexedSpriteState.field_j, "titles_retrieval_levels", true);
            SimulatorSpriteAssets.field_c = MembershipPromotionScreen.loadNamedSprite("", IndexedSpriteState.field_j, "titles_retribution_levels", true);
            ValidationIndicator.field_Q = MembershipPromotionScreen.loadNamedSprite("", IndexedSpriteState.field_j, "titles_simulator_levels", true);
            TextWidgetPainter.field_j = MembershipPromotionScreen.loadNamedSprite("", IndexedSpriteState.field_j, "titles_select_level_set", true);
            BufferedSocket.field_g = SpriteArchiveSupport.loadNamedSprites(IndexedSpriteState.field_j, (byte) 123, "", "level_set_icons");
            this.loadLevelObjectAssets((byte) 125);
            Js5NetworkRequest.field_H = MembershipPromotionScreen.loadNamedSprite("", IndexedSpriteState.field_j, "seeker_mine", true);
            SelfDestructEffects.field_b = MembershipPromotionScreen.loadNamedSprite("", IndexedSpriteState.field_j, "seeker_mine_glow", true);
            ResourceArchive.field_m = MembershipPromotionScreen.loadNamedSprite("", IndexedSpriteState.field_j, "rock_buster", true);
            IntPoint.field_b = MembershipPromotionScreen.loadNamedSprite("", IndexedSpriteState.field_j, "interface_level_complete", true);
            HighscoreQuery.field_g = MembershipPromotionScreen.loadNamedSprite("", IndexedSpriteState.field_j, "interface_game_over", true);
            LoginHandshakeState.achievementIcons = SpriteArchiveSupport.loadNamedSprites(IndexedSpriteState.field_j, (byte) 124, "", "achievements");
            AccountPayloadSupport.installAchievementIcons(LoginHandshakeState.achievementIcons, 0);
            CheckboxPainter.field_c = MembershipPromotionScreen.loadNamedSprite("basic", MarkerSliderPainter.field_h, "unachieved", true);
            DualLinkDequeIterator.field_e = MembershipPromotionScreen.loadNamedSprite("basic", MarkerSliderPainter.field_h, "locked", true);
            SpriteLoadTask.field_l = new Sprite(CheckboxPainter.field_c.fullWidth, CheckboxPainter.field_c.fullHeight);
            SpriteLoadTask.field_l.trimTransparentEdges();
            AchievementThresholdRule.setMirroredPanelBackground(MembershipPromotionScreen.loadNamedSprite("", IndexedSpriteState.field_j, "achievements_next_page_button", true), -84);
            RasterSnapshot.field_m = new Sprite[LoginHandshakeState.achievementIcons.length];
            int var2_int = 0;
            while (LoginHandshakeState.achievementIcons.length > var2_int) {
              RasterSnapshot.field_m[var2_int] = new Sprite(32, 32);
              RasterSnapshot.field_m[var2_int].bindAsFramebuffer();
              LoginHandshakeState.achievementIcons[var2_int].drawDownscaled(0, 0, 32, 32);
              var2_int++;
              if (var3 != 0) {
                return;
              }
            }
            IntroRasterSupport.field_a = new Sprite(32, 32);
            IntroRasterSupport.field_a.bindAsFramebuffer();
            CheckboxPainter.field_c.drawDownscaled(0, 0, 32, 32);
            SharedSpriteAssets.field_b = new Sprite(32, 32);
            SharedSpriteAssets.field_b.bindAsFramebuffer();
            DualLinkDequeIterator.field_e.drawDownscaled(0, 0, 32, 32);
            AlphaContainer.field_D.bindRaster(guard ^ -35);
            this.loadLevelSelectBackgrounds(false);
            SavedCompletionFlags.field_f = SpriteArchiveSupport.loadNamedSprites(IndexedSpriteState.field_j, (byte) 123, "", "level_complete_tick");
            FullscreenFocusCanvas.field_a = SpriteCheckboxPainter.loadIndexedSprites("scrshots", "", (byte) -48, IndexedSpriteState.field_j);
            MarkerSliderPainter.field_h = null;
            SpriteOffset.resetFrameTiming((byte) 92);
            return;
          }
          if (null != QuickChatPhraseCache.field_i) {
            if (null == ContentTransitionDialog.field_eb) {
              InstructionsScreen.setLoadingProgress(MarkerSlider.field_H, guard + 17733, 90.0f);
              this.renderClient((byte) 48);
              SoundCache var2_ref = new SoundCache(CheckboxPainter.field_h, StripedProgressBar.field_I);
              StripedProgressBar.field_I = null;
              CheckboxPainter.field_h = null;
              ContentTransitionDialog.field_eb = ConnectionSupport.loadNamedTrackerMusic(2, "", var2_ref, PointCloudEffect.field_D, "music/menu");
              EditableTextWidget.field_O = ConnectionSupport.loadNamedTrackerMusic(guard ^ -94, "", var2_ref, PointCloudEffect.field_D, "music/briefing");
              MenuInputState.panicMusic = ConnectionSupport.loadNamedTrackerMusic(2, "", var2_ref, PointCloudEffect.field_D, "music/panic");
              ObjectSpriteSet.field_d = new TrackerMusicDefinition[5];
              ObjectSpriteSet.field_d[0] = ConnectionSupport.loadNamedTrackerMusic(2, "", var2_ref, PointCloudEffect.field_D, "music/oss_area_1");
              ObjectSpriteSet.field_d[1] = ConnectionSupport.loadNamedTrackerMusic(2, "", var2_ref, PointCloudEffect.field_D, "music/oss_area_2");
              ObjectSpriteSet.field_d[2] = ConnectionSupport.loadNamedTrackerMusic(2, "", var2_ref, PointCloudEffect.field_D, "music/oss_area_3");
              ObjectSpriteSet.field_d[3] = ConnectionSupport.loadNamedTrackerMusic(2, "", var2_ref, PointCloudEffect.field_D, "music/oss_area_4");
              ObjectSpriteSet.field_d[4] = ConnectionSupport.loadNamedTrackerMusic(PacketBuffer.xor((int) guard, -94), "", var2_ref, PointCloudEffect.field_D, "music/simulator");
              PointCloudEffect.field_D = null;
              SpriteOffset.resetFrameTiming((byte) 93);
              return;
            }
            if (null == UsernameCredentials.field_h) {
              InstructionsScreen.setLoadingProgress(DropTargetWidget.field_H, guard ^ -17595, 100.0f);
              this.renderClient((byte) -127);
              UsernameCredentials.field_h = CampaignLoadingSupport.loadCampaigns(UiContainer.field_B, UsernameCredentials.field_h, StatefulTextPainter.field_u, 0);
              UiContainer.field_B = null;
              SpriteOffset.resetFrameTiming((byte) 51);
              return;
            }
            AccountMessagePanel.setTickRate(50, true);
            AlternateUsernameCredentials.field_q = new MainMenuScreen();
            CheckboxPainter.field_l = new LevelSelectScreen(1, Bullet.accountStateIndex(guard ^ -35));
            UiComponent.field_o = new GameModeSelectScreen(true);
            CanvasRenderSupport.field_a = new HighscoresScreen(false, 1);
            if (guard != -96) {
              field_z = (String) null;
            }
            SessionMenuSupport.field_b = new AchievementsScreen();
            ArchiveLoadTask.field_e = new InstructionsScreen(true);
            GameplaySession.resetSessionMenuState((byte) 115);
            SimulatorAssetSupport.c(0);
            this.initializeMembershipPromotion(guard + 95);
            ShipHullGeometry.field_h = true;
            TextLayoutLine.b(1, 0);
            return;
          }
          InstructionsScreen.setLoadingProgress(NanoTickClock.field_n, 17637, 80.0f);
          this.renderClient((byte) 7);
          PcmResampler var2 = new PcmResampler(22050, AudioOutput.sampleRate);
          QuickChatPhraseCache.field_i = SoundEffect.loadNamed(CheckboxPainter.field_h, "", "write-text").toPcmSample().resample(var2);
          AchievementTracker.field_d = SoundEffect.loadNamed(CheckboxPainter.field_h, "", "cursor").toPcmSample().resample(var2);
          NameAvailabilityResultSupport.field_a = SoundEffect.loadNamed(CheckboxPainter.field_h, "", "interference").toPcmSample().resample(var2);
          SpriteLoadTask.field_i = SoundEffect.loadNamed(CheckboxPainter.field_h, "", "interference_300ms").toPcmSample().resample(var2);
          SecondaryNodeHashTable.field_g = SoundEffect.loadNamed(CheckboxPainter.field_h, "", "mainmenu_formation").toPcmSample().resample(var2);
          ArchiveRequest.field_w = SoundEffect.loadNamed(CheckboxPainter.field_h, "", "mouseover").toPcmSample().resample(var2);
          AccountOverlayController.field_b = SoundEffect.loadNamed(CheckboxPainter.field_h, "", "level_indicator").toPcmSample().resample(var2);
          ModeProgressSupport.field_a = SoundEffect.loadNamed(CheckboxPainter.field_h, "", "button_formation").toPcmSample().resample(var2);
          UiTheme.field_g = SoundEffect.loadNamed(CheckboxPainter.field_h, "", "frame-appear").toPcmSample().resample(var2);
          QuickChatPhraseDefinition.field_t = SoundEffect.loadNamed(CheckboxPainter.field_h, "", "photo-blob-grow").toPcmSample().resample(var2);
          SavedCompletionFlags.field_g = SoundEffect.loadNamed(CheckboxPainter.field_h, "", "photo-body-explode").toPcmSample().resample(var2);
          ArchiveProvider.field_d = SoundEffect.loadNamed(CheckboxPainter.field_h, "", "grid_effect_1").toPcmSample().resample(var2);
          GuestLoginSupport.field_b = SoundEffect.loadNamed(CheckboxPainter.field_h, "", "grid_effect_2").toPcmSample().resample(var2);
          PcmResampler.field_g = VorbisSample.loadNamed(StripedProgressBar.field_I, "", "pixelate").decodeToPcm().resample(var2);
          ValidationIndicator.field_N = SoundEffect.loadNamed(CheckboxPainter.field_h, "", "gas-pump").toPcmSample().resample(var2);
          LoginDialog.field_mb = SoundEffect.loadNamed(CheckboxPainter.field_h, "", "gas-burn").toPcmSample().resample(var2);
          TerrainMaskSupport.field_e = SoundEffect.loadNamed(CheckboxPainter.field_h, "", "left-foot-down").toPcmSample().resample(var2);
          DisplayAndRatingSupport.field_b = SoundEffect.loadNamed(CheckboxPainter.field_h, "", "right-foot-down").toPcmSample().resample(var2);
          DraggableWidget.field_M = SoundEffect.loadNamed(CheckboxPainter.field_h, "", "ship-fire").toPcmSample().resample(var2);
          ModeProgress.field_e = SoundEffect.loadNamed(CheckboxPainter.field_h, "", "ship-fire-three").toPcmSample().resample(var2);
          ShipHullGeometry.field_j = SoundEffect.loadNamed(CheckboxPainter.field_h, "", "alien-fire").toPcmSample().resample(var2);
          Bzip2State.field_G = SoundEffect.loadNamed(CheckboxPainter.field_h, "", "shield").toPcmSample().resample(var2);
          InputGlyphSupport.field_d = SoundEffect.loadNamed(CheckboxPainter.field_h, "", "shield_impact").toPcmSample().resample(var2);
          ArchiveSpriteLoader.field_b = SoundEffect.loadNamed(CheckboxPainter.field_h, "", "shield_empty").toPcmSample().resample(var2);
          DropTargetWidget.field_E = SoundEffect.loadNamed(CheckboxPainter.field_h, "", "fuel-start").toPcmSample().resample(var2);
          NameAvailabilityResult.field_d = SoundEffect.loadNamed(CheckboxPainter.field_h, "", "fuel-filling").toPcmSample().resample(var2);
          AccountFormStage.field_b = SoundEffect.loadNamed(CheckboxPainter.field_h, "", "fuel-stop").toPcmSample().resample(var2);
          SpriteOffset.field_f = SoundEffect.loadNamed(CheckboxPainter.field_h, "", "fuel-full").toPcmSample().resample(var2);
          SimulatorAssetSupport.field_a = SoundEffect.loadNamed(CheckboxPainter.field_h, "", "crate-attach").toPcmSample().resample(var2);
          ObjectSpriteSet.field_c = SoundEffect.loadNamed(CheckboxPainter.field_h, "", "tether-tighten").toPcmSample().resample(var2);
          SavedDataQuerySupport.field_c = SoundEffect.loadNamed(CheckboxPainter.field_h, "", "tether-release").toPcmSample().resample(var2);
          ConnectionSupport.field_a = SoundEffect.loadNamed(CheckboxPainter.field_h, "", "powerup-collect").toPcmSample().resample(var2);
          ChatHistorySupport.field_c = SoundEffect.loadNamed(CheckboxPainter.field_h, "", "repeller-active").toPcmSample().resample(var2);
          LoadingProgressDialog.field_hb = SoundEffect.loadNamed(CheckboxPainter.field_h, "", "magnet-active").toPcmSample().resample(var2);
          SpriteDecodeSupport.field_h = SoundEffect.loadNamed(CheckboxPainter.field_h, "", "laser").toPcmSample().resample(var2);
          IntrusiveNodeHashTable.field_a = SoundEffect.loadNamed(CheckboxPainter.field_h, "", "explosion-ship").toPcmSample().resample(var2);
          RasterBuffer.fiveSecondExplosionSample = SoundEffect.loadNamed(CheckboxPainter.field_h, "", "explosion_5_seconds").toPcmSample().resample(var2);
          GuestLoginSupport.countdownBeepSample = VorbisSample.loadNamed(StripedProgressBar.field_I, "", "beeping").decodeToPcm().resample(var2);
          this.loadObjectExplosionSamples(guard + 97, var2);
          AchievementDefinition.field_a = SoundEffect.loadNamed(CheckboxPainter.field_h, "", "mine_inactive_hum_2").toPcmSample().resample(var2);
          AccountMessagePanel.field_J = SoundEffect.loadNamed(CheckboxPainter.field_h, "", "100Hz square").toPcmSample();
          MarkerSliderPainter.field_d = SoundEffect.loadNamed(CheckboxPainter.field_h, "", "explosion-seeker-mine").toPcmSample().resample(var2);
          NameAvailabilityValidator.field_p = SoundEffect.loadNamed(CheckboxPainter.field_h, "", "rockbuster").toPcmSample().resample(var2);
          MonotonicClockSupport.field_c = SoundEffect.loadNamed(CheckboxPainter.field_h, "", "explosion-rock-buster").toPcmSample().resample(var2);
          AchievementQuery.field_k = SoundEffect.loadNamed(CheckboxPainter.field_h, "", "level_complete").toPcmSample().resample(var2);
          AlternateUsernameCredentials.field_o = SoundEffect.loadNamed(CheckboxPainter.field_h, "", "level_complete_score").toPcmSample().resample(var2);
          SpriteOffset.resetFrameTiming((byte) 106);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2_ref2 = decompiledCaughtException;
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) var2_ref2), "EscapeVector.FB(" + guard + ')');
        }
    }

    private final void initializeMembershipPromotion(int guard) {
        try {
          if (guard != -1) {
            field_z = (String) null;
          }
          MembershipAssetSupport.initializePromotionAssets((java.applet.Applet) (this), 1585176, (byte) -125, 6340704, LoginCredentials.field_c, 192);
          AccountSessionSupport.field_a = new MembershipPromotionScreen((java.applet.Applet) (this), WeightedCacheEntry.field_r, FullscreenFocusCanvas.field_a, LoginCredentials.field_c);
          FullscreenFocusCanvas.field_a = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) var2), "EscapeVector.AB(" + guard + ')');
        }
    }

    final static void insertNodeBefore(IntrusiveNode node, IntrusiveNode before, byte guard) {
        String stackIn_12_2 = null;
        String stackIn_16_2 = null;
        try {
          if (node.previous != null) {
            node.unlink((byte) -69);
          }
          if (guard != -7) {
            return;
          }
          node.previous = before.previous;
          node.next = before;
          node.previous.next = node;
          node.next.previous = node;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException runtimeException = decompiledCaughtException;
          RuntimeException stackIn_11_0 = runtimeException;
          StringBuilder stackIn_11_1 = new StringBuilder().append("EscapeVector.WA(");
          if (node == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          StringBuilder stackIn_15_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (before == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(guard).append(')').toString());
        }
    }

    private final void loadObjectGlowSprites(int fuelIndex) {
        try {
          StripedProgressBar.objectGlowSprites[fuelIndex] = MembershipPromotionScreen.loadNamedSprite("", IndexedSpriteState.field_j, "sprites_fuel_glow", true);
          StripedProgressBar.objectGlowSprites[2] = MembershipPromotionScreen.loadNamedSprite("", IndexedSpriteState.field_j, "sprites_turret_glow", true);
          StripedProgressBar.objectGlowSprites[3] = MembershipPromotionScreen.loadNamedSprite("", IndexedSpriteState.field_j, "sprites_magnet_glow", true);
          StripedProgressBar.objectGlowSprites[4] = MembershipPromotionScreen.loadNamedSprite("", IndexedSpriteState.field_j, "sprites_repeller_glow", true);
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "EscapeVector.DB(" + fuelIndex + ')');
        }
    }

    final static MouseWheelInput createMouseWheelInput(int guard) {
        try {
          Throwable decompiledCaughtException = null;
          try {
            if (guard != 13) {
              MouseWheelInput stackIn_2_0 = (MouseWheelInput) null;
              return stackIn_2_0;
            }
            try {
              MouseWheelInput stackIn_4_0 = (MouseWheelInput) (Class.forName("MouseWheelHandler").newInstance());
              return stackIn_4_0;
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              Throwable var1 = decompiledCaughtException;
              Object stackIn_6_0 = null;
              return (MouseWheelInput) (stackIn_6_0);
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            RuntimeException var1_ref = (RuntimeException) (Object) decompiledCaughtException;
            throw MainMenuScreen.wrapClientException((Throwable) ((Object) var1_ref), "EscapeVector.GB(" + guard + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void shutdownClientServices(boolean guard) {
        try {
          if (IsaacRandom.field_d != null) {
            DisplayAndRatingSupport.exitFullscreen(-25123);
          }
          if (!guard) {
            field_z = (String) null;
          }
          if (UiContainer.field_C != null) {
            UiContainer.field_C.shutdown();
          }
          if (LevelSelectScreen.field_l != null) {
            LevelSelectScreen.field_l.shutdown();
          }
          HighscorePlayerRecord.shutdownClient(1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) var2), "EscapeVector.B(" + guard + ')');
        }
    }

    private final void initializeGameArchives(boolean guard) {
        try {
          if (null != KeyboardIdleSupport.field_c) {
            RegistrationRequestDialog.a(8, KeyboardIdleSupport.field_c);
            KeyboardIdleSupport.field_c = null;
            SpriteOffset.resetFrameTiming((byte) 57);
          }
          IndexedSpriteState.field_j = MarkerSliderPainter.createArchive(1, 0, guard, 1, true);
          LoginText.field_c = LoginHandshakeSupport.createDefaultArchive(6, -125);
          CheckboxPainter.field_h = LoginHandshakeSupport.createDefaultArchive(2, -126);
          StripedProgressBar.field_I = LoginHandshakeSupport.createDefaultArchive(3, -127);
          PointCloudEffect.field_D = LoginHandshakeSupport.createDefaultArchive(4, -126);
          UiContainer.field_B = LoginHandshakeSupport.createDefaultArchive(10, -124);
          StatefulTextPainter.field_u = LoginHandshakeSupport.createDefaultArchive(5, -128);
          HighscoreTable.archiveInitializationHook((byte) 57, SavedDataQuery.field_m, MarkerSliderPainter.field_h);
          UiTheme.a(MarkerSliderPainter.field_h, SavedDataQuery.field_m, (byte) -96);
          DualLinkNode.field_n = new ArchivePreloader(70);
          DualLinkNode.field_n.addNamedGroup(MarkerSliderPainter.field_h, TextFieldValidator.field_l, DebouncedValidator.field_d, "basic", 14826);
          DualLinkNode.field_n.addNamedGroup(IndexedSpriteState.field_j, TextFieldValidator.field_l, DebouncedValidator.field_d, "", 14826);
          DualLinkNode.field_n.addNamedGroup(IndexedSpriteState.field_j, TextFieldValidator.field_l, DebouncedValidator.field_d, "scrshots", 14826);
          DualLinkNode.field_n.addNamedGroup(LoginText.field_c, CipherPacketBuffer.field_o, NanoTickClock.field_h, "", 14826);
          DualLinkNode.field_n.addWholeArchive(SavedDataWrite.field_g, (byte) -125, ArchiveSpriteLoader.field_d, CheckboxPainter.field_h);
          DualLinkNode.field_n.addWholeArchive(SavedDataWrite.field_g, (byte) -115, ArchiveSpriteLoader.field_d, StripedProgressBar.field_I);
          DualLinkNode.field_n.addWholeArchive(NameAvailabilityResultSupport.field_f, (byte) -119, ArchivePreloader.field_d, PointCloudEffect.field_D);
          DualLinkNode.field_n.addWholeArchive(LegacyStyleNode.field_r, (byte) -121, InstructionsNavigationSupport.field_b, UiContainer.field_B);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) var2), "EscapeVector.HB(" + guard + ')');
        }
    }

    final static boolean isContactAfter(ContactEntry left, ContactEntry right, int guard) {
        String stackIn_31_2 = null;
        String stackIn_35_2 = null;
        int var4 = obfuscationControl;
        try {
          if (guard != -7457) {
            field_z = (String) null;
          }
          int var3_int = -right.insertionOrder + left.insertionOrder;
          if (left.location == HighscorePlayerRecord.field_f) {
            var3_int -= 200;
          } else if (null == left.location) {
            var3_int += 200;
            if (var4 != 0) {
              var3_int -= 200;
            }
          }
          if (HighscorePlayerRecord.field_f == right.location) {
            var3_int += 200;
          } else if (right.location == null) {
            var3_int -= 200;
            if (var4 != 0) {
              var3_int += 200;
            }
          }
          return !(var3_int <= 0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_30_0 = var3;
          StringBuilder stackIn_30_1 = new StringBuilder().append("EscapeVector.TA(");
          if (left == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          StringBuilder stackIn_34_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',');
          if (right == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(',').append(guard).append(')').toString());
        }
    }

    private final void loadObjectExplosionSamples(int crateIndex, PcmResampler resampler) {
        String stackIn_6_2 = null;
        try {
          SessionCounterState.objectExplosionSamples[0] = SoundEffect.loadNamed(CheckboxPainter.field_h, "", "explosion-fuel-tank").toPcmSample().resample(resampler);
          SessionCounterState.objectExplosionSamples[crateIndex] = SoundEffect.loadNamed(CheckboxPainter.field_h, "", "explosion-crate").toPcmSample().resample(resampler);
          PcmSample dupTemp$8 = SoundEffect.loadNamed(CheckboxPainter.field_h, "", "explosion-magnet-repeller").toPcmSample().resample(resampler);
          SessionCounterState.objectExplosionSamples[4] = dupTemp$8;
          SessionCounterState.objectExplosionSamples[3] = dupTemp$8;
          SessionCounterState.objectExplosionSamples[2] = SoundEffect.loadNamed(CheckboxPainter.field_h, "", "explosion-turret").toPcmSample().resample(resampler);
          PcmSample dupTemp$9 = SoundEffect.loadNamed(CheckboxPainter.field_h, "", "explosion-tnt").toPcmSample().resample(resampler);
          SessionCounterState.objectExplosionSamples[8] = dupTemp$9;
          SessionCounterState.objectExplosionSamples[5] = dupTemp$9;
          PcmSample dupTemp$10 = SoundEffect.loadNamed(CheckboxPainter.field_h, "", "explosion-laser").toPcmSample().resample(resampler);
          SessionCounterState.objectExplosionSamples[7] = dupTemp$10;
          SessionCounterState.objectExplosionSamples[6] = dupTemp$10;
          PcmSample dupTemp$11 = SoundEffect.loadNamed(CheckboxPainter.field_h, "", "explosion-powerup").toPcmSample().resample(resampler);
          SessionCounterState.objectExplosionSamples[13] = dupTemp$11;
          SessionCounterState.objectExplosionSamples[12] = dupTemp$11;
          SessionCounterState.objectExplosionSamples[11] = dupTemp$11;
          SessionCounterState.objectExplosionSamples[10] = dupTemp$11;
          SessionCounterState.objectExplosionSamples[9] = dupTemp$11;
          this.setExtraObjectExplosionSamples((byte) -60, SessionCounterState.objectExplosionSamples[0]);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException runtimeException = decompiledCaughtException;
          RuntimeException stackIn_5_0 = runtimeException;
          StringBuilder stackIn_5_1 = new StringBuilder().append("EscapeVector.LB(").append(crateIndex).append(',');
          if (resampler == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    private final void renderFrame(int guard) {
        int var9 = obfuscationControl;
        try {
          DialogueScreen var2 = DropTargetWidget.f((byte) -49);
          java.awt.Canvas var3 = AccountRegistrationPanel.currentCanvas((byte) 10);
          if (guard != -27273) {
            field_z = (String) null;
          }
          boolean var4 = (UiComponent.g(11187));
          if (ChatSettingsSupport.needsFrameworkPreparation(16836)) {
            TransitionPoint.renderAccountLayer((var4), (byte) 92, var3);
            return;
          }
          if (!ShipHullGeometry.field_h) {
            TextFieldValidator.drawLoadingProgress(var3, 0);
            return;
          }
          if (!AchievementThresholdRule.isAccountStateReady((byte) -64)) {
            InstructionsScreen.setLoadingProgress(QuickChatPhraseCache.field_a, 17637, 100.0f);
            TextFieldValidator.drawLoadingProgress(var3, 0);
            return;
          }
          boolean decompiledFrameRemainder0 = true;
          if (var2 != null) {
            var2.drawDialogue(107);
            decompiledFrameRemainder0 = (var9 != 0);
          }
          if (decompiledFrameRemainder0) {
            if (BoundedRandomAccessFile.activeSession != null) {
              BoundedRandomAccessFile.activeSession.renderSession(0);
            }
            if (IntegerParseSupport.field_c) {
              SoftwareRasterizer.clearFramebuffer();
              AccountSessionSupport.field_a.draw(-76);
              decompiledFrameRemainder0 = (var9 != 0);
            }
            if (decompiledFrameRemainder0) {
              if (!TextLayout.field_b) {
                if (SelfDestructEffects.field_q >= 0) {
                  CheckboxPainter.field_l.draw(3);
                  decompiledFrameRemainder0 = (var9 != 0);
                }
                if (decompiledFrameRemainder0) {
                  if (!PacketBuffer.field_h) {
                    if (RegistrationFlowSupport.field_a) {
                      SessionMenuSupport.field_b.draw(3);
                      decompiledFrameRemainder0 = (var9 != 0);
                    }
                    if (decompiledFrameRemainder0) {
                      if (CheckboxPainter.field_n) {
                        CanvasRenderSupport.field_a.draw(false);
                        decompiledFrameRemainder0 = (var9 != 0);
                      }
                      if (decompiledFrameRemainder0) {
                        if (PauseMenuState.instructionsVisible) {
                          ArchiveLoadTask.field_e.drawContents((byte) 120);
                          decompiledFrameRemainder0 = (var9 != 0);
                        }
                        if (decompiledFrameRemainder0) {
                          if (null != SessionMenuSupport.field_c) {
                            SessionMenuSupport.field_c.draw((byte) 126);
                            decompiledFrameRemainder0 = (var9 != 0);
                          }
                          if (decompiledFrameRemainder0 &&
                            null != AlternateUsernameCredentials.field_q) {
                            AlternateUsernameCredentials.field_q.draw((byte) -16);
                            if (var9 != 0) {
                              this.drawLoginOrDiscardPrompt(false);
                              UiComponent.field_o.draw(100);
                            }
                          }
                        }
                      }
                    }
                  } else {
                    this.drawLoginOrDiscardPrompt(false);
                    if (var9 != 0) {
                      UiComponent.field_o.draw(100);
                    }
                  }
                }
              } else {
                UiComponent.field_o.draw(100);
              }
            }
          }
          if (SelfDestructEffects.field_k &&
            null != BoundedRandomAccessFile.activeSession &&
            BoundedRandomAccessFile.activeSession.easyMode) {
            ByteStorage.gameFont.drawCentered("EASY PEASY MODE IS ON", 320, 40, 16744576, -1);
          }
          if (SelfDestructEffects.field_k &&
            null != BoundedRandomAccessFile.activeSession &&
            BoundedRandomAccessFile.activeSession.timeHackMode) {
            ByteStorage.gameFont.drawCentered("TIME HACK MODE IS ON", 320, 40, 16744576, -1);
          }
          if (2 <= KeyboardIdleSupport.field_b &&
            QuitPageSupport.field_c) {
            ByteStorage.gameFont.drawRight("FPS: " + Bzip2State.field_p, 636, 100, 16777215, 0);
            ByteStorage.gameFont.drawRight("LPS: " + NanoTickClock.field_j, 636, 120, 16777215, 0);
            long var5 = Runtime.getRuntime().totalMemory();
            long var7 = Runtime.getRuntime().freeMemory();
            ByteStorage.gameFont.drawRight((var5 - var7) / 1000L + " kB / " + var5 / 1000L + " kB", 636, 140, 16777215, 0);
          }
          if (SessionMenuSupport.startRequestTimeout((byte) -106) &&
            !LoginHandshakeSupport.isLegacyMenuVisible((byte) 122)) {
            LoginIdentifierSupport.drawAccountOverlay((byte) -111, (var4));
          }
          SecondaryNodeHashTable.presentRaster(var3, 0, -1, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2_ref = decompiledCaughtException;
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) var2_ref), "EscapeVector.BB(" + guard + ')');
        }
    }

    private final void drawLoginOrDiscardPrompt(boolean doubleBorder) {
        int stackIn_26_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_34_7 = 0;
        int stackIn_38_8 = 0;
        int stackIn_42_0 = 0;
        int stackIn_46_7 = 0;
        int stackIn_50_8 = 0;
        int stackIn_54_2 = 0;
        int stackIn_58_2 = 0;
        try {
          SoftwareRasterizer.clearFramebuffer();
          SelfDestructEffects.drawMenuEdges(2);
          String var2 = PasswordValidator.field_r;
          boolean var3 = (TrackerMusicDefinition.field_f.hasSessionAchievements(110));
          boolean stackIn_3_0 = var3;
          int stackIn_3_1 = 4;
          boolean stackIn_4_2 = (null != IntValueNode.field_i);
          String var4 = InstructionsScreen.loginRequirementText((stackIn_3_0), stackIn_3_1, stackIn_4_2, GameProgressSupport.field_c.hasPendingProgress(17523));
          boolean stackIn_7_0 = var3;
          boolean stackIn_7_1 = GameProgressSupport.field_c.hasPendingProgress(17523);
          int stackIn_7_2 = -8;
          boolean stackIn_8_3 = (null != IntValueNode.field_i);
          String var5 = AchievementRecord.chooseAlternateClickPromptWithIntGuard((stackIn_7_0), stackIn_7_1, stackIn_7_2, stackIn_8_3);
          boolean stackIn_11_0 = var3;
          boolean stackIn_12_1 = (IntValueNode.field_i != null);
          String var6 = ScoreSubmission.a((stackIn_11_0), stackIn_12_1, (byte) -112, GameProgressSupport.field_c.hasPendingProgress(17523));
          int var7 = ByteStorage.gameFont.stringWidth(var2);
          int var8 = ByteStorage.gameFont.stringWidth(var4);
          if (var8 > var7) {
            var7 = var8;
          }
          int var8Lifetime1 = ByteStorage.gameFont.stringWidth(var5);
          if (var8Lifetime1 > var7) {
            var7 = var8Lifetime1;
          }
          int var8Lifetime2 = ByteStorage.gameFont.stringWidth(var6);
          if (var8Lifetime2 > var7) {
            var7 = var8Lifetime2;
          }
          int var8Lifetime3 = var7 / 2 + 25;
          if (40 > LoginHandshakeSupport.field_d) {
            stackIn_26_0 = -LoginHandshakeSupport.field_d + 40;
          } else {
            stackIn_26_0 = 0;
          }
          AccountNoticeKind.drawAnimatedPanelFrame(stackIn_26_0, -var8Lifetime3 + 320, var8Lifetime3 + 321, 405, true, 29788, true, 6324320, 3162160, 0, 195, true);
          if (20 <= LoginHandshakeSupport.field_d) {
            stackIn_30_0 = 0;
          } else {
            stackIn_30_0 = (20 - LoginHandshakeSupport.field_d) * 2;
          }
          int stackIn_33_1 = 240;
          int stackIn_33_2 = 400;
          int stackIn_33_3 = 289;
          boolean stackIn_33_4 = true;
          int stackIn_33_5 = 29788;
          boolean stackIn_33_6 = false;
          stackIn_34_7 = (HighscorePlayerRecord.field_d.selectedIndex == 0) ? (16777215) : (6340704);
          stackIn_38_8 = (HighscorePlayerRecord.field_d.selectedIndex == 0) ? (8421504) : (3170352);
          AccountNoticeKind.drawAnimatedPanelFrame(stackIn_30_0, stackIn_33_1, stackIn_33_2, stackIn_33_3, stackIn_33_4, stackIn_33_5, stackIn_33_6, stackIn_34_7, stackIn_38_8, 1, 262, doubleBorder);
          if (LoginHandshakeSupport.field_d >= 30) {
            stackIn_42_0 = 0;
          } else {
            stackIn_42_0 = 2 * (30 - LoginHandshakeSupport.field_d);
          }
          int stackIn_45_1 = 280;
          int stackIn_45_2 = 360;
          int stackIn_45_3 = 359;
          boolean stackIn_45_4 = true;
          int stackIn_45_5 = 29788;
          boolean stackIn_45_6 = false;
          stackIn_46_7 = (HighscorePlayerRecord.field_d.selectedIndex == 1) ? (16777215) : (6340704);
          stackIn_50_8 = (HighscorePlayerRecord.field_d.selectedIndex == 1) ? (8421504) : (3170352);
          AccountNoticeKind.drawAnimatedPanelFrame(stackIn_42_0, stackIn_45_1, stackIn_45_2, stackIn_45_3, stackIn_45_4, stackIn_45_5, stackIn_45_6, stackIn_46_7, stackIn_50_8, 2, 332, false);
          MenuTitleRenderSupport.drawTitles(4);
          ByteStorage.gameFont.drawCentered(var2, 320, 235, 10551200, -1);
          ByteStorage.gameFont.drawCentered(var4, 320, 255, 10551200, -1);
          int stackIn_53_0 = 285;
          String stackIn_53_1 = IntrusiveDeque.field_e;
          stackIn_54_2 = (HighscorePlayerRecord.field_d.selectedIndex != 0) ? (6340704) : (16777215);
          MatchingTextValidator.drawOutlinedTitle(stackIn_53_0, stackIn_53_1, stackIn_54_2, -128, 320);
          ByteStorage.gameFont.drawCentered(var5, 320, 325, 10551200, -1);
          int stackIn_57_0 = 355;
          String stackIn_57_1 = StringNode.field_j;
          stackIn_58_2 = (HighscorePlayerRecord.field_d.selectedIndex == 1) ? (16777215) : (6340704);
          MatchingTextValidator.drawOutlinedTitle(stackIn_57_0, stackIn_57_1, stackIn_58_2, -118, 320);
          ByteStorage.gameFont.drawCentered(var6, 320, 385, 10551200, -1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2_ref = decompiledCaughtException;
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) var2_ref), "EscapeVector.UA(" + doubleBorder + ')');
        }
    }

    public final void init() {
        try {
          this.startApplet("escapevector", 640, 12);
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "EscapeVector.init()");
        }
    }

    final void initializeClient(byte guard) {
        try {
          this.initializeFramework(0, 11, 8, 7, 21, (byte) -99, false, 9);
          AudioOutput.configure(22050, true, 10);
          UiContainer.field_C = AudioOutput.create(NetworkGameClient.taskService, (java.awt.Component) ((Object) SpriteDecodeSupport.field_d), 0, 1024);
          LevelSelectScreen.field_l = AudioOutput.create(NetworkGameClient.taskService, (java.awt.Component) ((Object) SpriteDecodeSupport.field_d), 1, 22050);
          ObjectSpriteSet.field_e = new PcmStreamMixer();
          UiContainer.field_C.setStream(ObjectSpriteSet.field_e);
          AlternateUsernameCredentials.field_n = new PcmStreamMixer();
          SoundCache.field_a = new ReverbPcmStream(AlternateUsernameCredentials.field_n);
          SoundCache.field_a.setFeedback(0.9399999976158142f);
          SoundCache.field_a.setDampingTimeMicros(14.826103210449219f);
          ObjectSpriteSet.field_e.addSubstream(SoundCache.field_a);
          MembershipAssetSupport.field_c = new PcmStreamMixer();
          BoundedRandomAccessFile.field_b = new ReverbPcmStream(MembershipAssetSupport.field_c);
          if (guard != -97) {
            EscapeVector.drawOutlinedText((String) null, 31, 49, (byte) 88);
          }
          BoundedRandomAccessFile.field_b.setFeedback(0.9399999976158142f);
          BoundedRandomAccessFile.field_b.setDampingTimeMicros(14.826103210449219f);
          LevelSelectScreen.field_l.setStream(BoundedRandomAccessFile.field_b);
          this.configureAccountResponses(true, (byte) -35, true, true, true);
          GameProgressSupport.field_c = new GameProgressTracker();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) var2), "EscapeVector.P(" + guard + ')');
        }
    }

    public EscapeVector() {
    }

    private final void loadObjectSprites(int guard) {
        try {
          AchievementThresholdRule.objectSprites[0] = MembershipPromotionScreen.loadNamedSprite("", IndexedSpriteState.field_j, "sprites_fuel", true);
          AchievementThresholdRule.objectSprites[1] = MembershipPromotionScreen.loadNamedSprite("", IndexedSpriteState.field_j, "sprites_crate", true);
          AchievementThresholdRule.objectSprites[2] = MembershipPromotionScreen.loadNamedSprite("", IndexedSpriteState.field_j, "sprites_turret", true);
          AchievementThresholdRule.objectSprites[3] = MembershipPromotionScreen.loadNamedSprite("", IndexedSpriteState.field_j, "sprites_magnet", true);
          AchievementThresholdRule.objectSprites[4] = MembershipPromotionScreen.loadNamedSprite("", IndexedSpriteState.field_j, "sprites_repeller", true);
          AchievementThresholdRule.objectSprites[5] = MembershipPromotionScreen.loadNamedSprite("", IndexedSpriteState.field_j, "sprites_tnt", true);
          AchievementThresholdRule.objectSprites[6] = MembershipPromotionScreen.loadNamedSprite("", IndexedSpriteState.field_j, "sprites_laser_left", true);
          int var2_int = -111 / ((60 - guard) / 58);
          AchievementThresholdRule.objectSprites[7] = MembershipPromotionScreen.loadNamedSprite("", IndexedSpriteState.field_j, "sprites_laser_right", true);
          AchievementThresholdRule.objectSprites[8] = MembershipPromotionScreen.loadNamedSprite("", IndexedSpriteState.field_j, "sprites_barrier", true);
          AchievementThresholdRule.objectSprites[9] = MembershipPromotionScreen.loadNamedSprite("", IndexedSpriteState.field_j, "sprites_powerup_shield", true);
          AchievementThresholdRule.objectSprites[10] = MembershipPromotionScreen.loadNamedSprite("", IndexedSpriteState.field_j, "sprites_powerup_triple_shot", true);
          AchievementThresholdRule.objectSprites[11] = MembershipPromotionScreen.loadNamedSprite("", IndexedSpriteState.field_j, "sprites_powerup_thrust", true);
          AchievementThresholdRule.objectSprites[12] = MembershipPromotionScreen.loadNamedSprite("", IndexedSpriteState.field_j, "sprites_powerup_one_rockbuster", true);
          AchievementThresholdRule.objectSprites[13] = MembershipPromotionScreen.loadNamedSprite("", IndexedSpriteState.field_j, "sprites_powerup_five_rockbusters", true);
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "EscapeVector.MB(" + guard + ')');
        }
    }

    private final void updateSessionMusic(int guard) {
        int var4 = obfuscationControl;
        try {
          DialogueScreen var2 = DropTargetWidget.f((byte) -49);
          if (guard != 1) {
            return;
          }
          if (var2 != null &&
            !var2.fullWidthScene) {
            if (ValidationHelpWidget.field_H != 1) {
              TerrainMap.a(40, EditableTextWidget.field_O, true, (byte) -101);
              ValidationHelpWidget.field_H = 1;
            }
            if (-1 + var2.dialogueLines.length > var2.dialogueIndex) {
              return;
            }
            if (var2.wrappedLineCount != var2.revealedLine) {
              return;
            }
            TrackerGainSupport.limitTrackerGain(40 * var2.revealDelayTicks / 100, 32471);
            if (var4 == 0) {
              return;
            }
          }
          if (null != var2 ||
            BoundedRandomAccessFile.activeSession == null) {
            if (0 == ValidationHelpWidget.field_H) {
              return;
            }
            TerrainMap.a(64, ContentTransitionDialog.field_eb, true, (byte) -63);
            ValidationHelpWidget.field_H = 0;
            if (var4 == 0) {
              return;
            }
          }
          boolean stackIn_37_0 = !(ValidationHelpWidget.field_H == 2);
          boolean var3 = stackIn_37_0;
          if (BoundedRandomAccessFile.activeSession != null) {
            BoundedRandomAccessFile.activeSession.updateMusic((var3), 0);
          }
          ValidationHelpWidget.field_H = 2;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2_ref = decompiledCaughtException;
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) var2_ref), "EscapeVector.EB(" + guard + ')');
        }
    }

    final static void drawOutlinedText(String text, int x, int baselineY, byte guard) {
        String stackIn_6_2 = null;
        try {
          ByteStorage.gameFont.drawLeftAlpha(text, -1 + x, -1 + baselineY, 0, -1, 64);
          ByteStorage.gameFont.drawLeftAlpha(text, 1 + x, -1 + baselineY, 0, -1, 64);
          ByteStorage.gameFont.drawLeftAlpha(text, -1 + x, baselineY + 1, 0, -1, 64);
          ByteStorage.gameFont.drawLeftAlpha(text, 1 + x, 1 + baselineY, 0, -1, 64);
          int var4_int = 71 % ((52 - guard) / 53);
          ByteStorage.gameFont.drawLeft(text, x, baselineY, 16777215, -1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException runtimeException = decompiledCaughtException;
          RuntimeException stackIn_5_0 = runtimeException;
          StringBuilder stackIn_5_1 = new StringBuilder().append("EscapeVector.JB(");
          if (text == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',').append(x).append(',').append(baselineY).append(',').append(guard).append(')').toString());
        }
    }

    private final void loadLevelSelectBackgrounds(boolean guard) {
        try {
          if (guard) {
            this.loadLevelObjectAssets((byte) 29);
          }
          DirectByteStorage.field_k = MembershipPromotionScreen.loadNamedSprite("", IndexedSpriteState.field_j, "classic_level_select_bg", true);
          AccountSessionSupport.field_c = MembershipPromotionScreen.loadNamedSprite("", IndexedSpriteState.field_j, "vengeance_level_select_bg", true);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) var2), "EscapeVector.VA(" + guard + ')');
        }
    }

    private final void setExtraObjectExplosionSamples(byte guard, PcmSample sample) {
        String stackIn_14_2 = null;
        int var5 = obfuscationControl;
        try {
          int var3_int = 0;
          if (guard >= -17) {
            this.releaseClientStatics((byte) -2);
          }
          while (3 > var3_int) {
            int var4 = var3_int + 14;
            SessionCounterState.objectExplosionSamples[var4] = sample;
            var3_int++;
            if (var5 != 0) {
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException runtimeException = decompiledCaughtException;
          RuntimeException stackIn_13_0 = runtimeException;
          StringBuilder stackIn_13_1 = new StringBuilder().append("EscapeVector.KB(").append(guard).append(',');
          if (sample == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    private final void loadLevelObjectAssets(byte guard) {
        try {
          this.loadObjectSprites(-28);
          int var2_int = 116 / ((-30 - guard) / 47);
          this.loadObjectGlowSprites(0);
          SpriteLoadTask.loadInfrastructureSprites(IndexedSpriteState.field_j, (byte) -23);
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "EscapeVector.IB(" + guard + ')');
        }
    }

    static {
        field_z = "Members' Expansion";
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static void insertNodeBeforeWithIntGuard(IntrusiveNode node, IntrusiveNode before, int guard) {
        String stackIn_12_2 = null;
        String stackIn_16_2 = null;
        try {
          if (node.previous != null) {
            node.unlink((byte) -69);
          }
          if (guard != -7) {
            return;
          }
          node.previous = before.previous;
          node.next = before;
          node.previous.next = node;
          node.next.previous = node;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException runtimeException = decompiledCaughtException;
          RuntimeException stackIn_11_0 = runtimeException;
          StringBuilder stackIn_11_1 = new StringBuilder().append("EscapeVector.WA(");
          if (node == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          StringBuilder stackIn_15_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (before == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(guard).append(')').toString());
        }
    }
}
