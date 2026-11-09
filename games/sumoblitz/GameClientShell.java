/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class GameClientShell extends GameApplet {
    private int primaryGamePort;
    private int affiliateId;
    private int secondaryGamePort;
    static int field_t;
    private int language;
    static int tooltipDelay;
    private boolean members;
    private boolean trustedJagexHost;
    static String waitingForSoundEffectsText;
    private long instanceId;
    private int gameCrc;
    private int serverNumber;
    static String[] menuActionLabels;
    String gameHost;
    private boolean field_B;

    private final void initializeAccountPacketLengths(int variableLength) {
        RasterBuffer.accountPacketLengths[1] = 16;
        RasterBuffer.accountPacketLengths[13] = -1;
        RasterBuffer.accountPacketLengths[16] = -1;
        RasterBuffer.accountPacketLengths[4] = -1;
        RasterBuffer.accountPacketLengths[9] = variableLength;
        RasterBuffer.accountPacketLengths[6] = -2;
        RasterBuffer.accountPacketLengths[12] = -1;
        RasterBuffer.accountPacketLengths[10] = -1;
        RasterBuffer.accountPacketLengths[11] = -1;
        RasterBuffer.accountPacketLengths[5] = -1;
        RasterBuffer.accountPacketLengths[17] = -1;
        RasterBuffer.accountPacketLengths[18] = 1;
        RasterBuffer.accountPacketLengths[3] = -1;
        RasterBuffer.accountPacketLengths[7] = -1;
        RasterBuffer.accountPacketLengths[2] = -2;
        RasterBuffer.accountPacketLengths[8] = -2;
    }

    private final void enableServerDataReplies(byte guard) {
        if (guard != 68) {
          return;
        }
        InteractiveWidget.enabledAccountPackets[5] = true;
    }

    final void updateClientServices(boolean deferCanvasReplacement, int guard) {
        int stackIn_27_0 = 0;
        int stackIn_106_0 = 0;
        boolean stackIn_107_1 = false;
        String stackIn_109_2 = null;
        boolean stackIn_110_3;
        int stackIn_138_0 = 0;
        int var3;
        java.awt.Dimension var4;
        int var5;
        java.awt.Container var6;
        int var3Lifetime1;
        int var3Lifetime2;
        var5 = Sumoblitz.field_L ? 1 : 0;
        if (SecondaryNodeDequeIterator.field_b != null) {
          if (null == CompactMeshGeometry.field_o) {
            var6 = FourStatHiscoreRequest.gameContainer(false);
            var4 = var6.getSize();
            SecondaryNodeDequeIterator.field_b.setPreferredSize(var4.height, var4.width, (byte) -123);
          }
          SecondaryNodeDequeIterator.field_b.update(2);
        }
        PasswordInputRenderer.pollKeyboardState((byte) 124);
        LegacyOpenGlReflectionEffect.snapshotMouseInput(123);
        if (!FadingWidget.needsPreparationScreen(-66) &&
          11 != LoginDialogNavigation.field_a) {
          LegacyRidgedWaterNoise.updateDisplayDialogs(1886067877);
        }
        if (null != InwardSparkParticle.field_w) {
          OpenGlUnderwaterEffect.field_r = InwardSparkParticle.field_w.pollDelta(-88);
        }
        if (guard >= -97) {
          this.gameHost = (String) null;
        }
        if (TimedSceneEffect.isAccountConnected((byte) 90)) {
          var3 = 1200 * Base37NameAlphabet.ticksPerSecond(-79);
          if (this.field_B ||
            !(var3 >= HiscorePlayerName.keyboardIdleTicks((byte) 114)) &&
            !(GraphicsHeap.mouseInputSnapshotCount(false) <= var3)) {
            this.field_B = false;
            LegacyOpenGlTextureCache.closeAccountSocket((byte) -112);
            ScrollViewport.handleAccountConnectionLoss((byte) 16);
            ArchiveCatalog.showAccountFailure((byte) 87, 2, NoiseSliceGenerator.weClosedTheConnectionText);
            GraphicsToolkit.onAccountDisconnected(-36);
            QuickChatCommand.field_d = true;
            DisplayPromptRenderer.field_a = 15000L + IntroMeshResources.monotonicTimeMillis(-96);
          }
        }
        if (LegacyOpenGlShoreWaveWaterEffect.field_l == -1 ||
          LegacyOpenGlShoreWaveWaterEffect.field_l == 0) {
          stackIn_27_0 = (LegacyOpenGlShoreWaveWaterEffect.field_l != -1) ? 0 : 1;
          var3Lifetime1 = stackIn_27_0;
          LegacyOpenGlShoreWaveWaterEffect.field_l = LegacyOpenGlFramebuffer.serviceJs5(-5);
          if (var3Lifetime1 != 0 &&
            LegacyOpenGlShoreWaveWaterEffect.field_l == 0 &&
            11 == LoginDialogNavigation.field_a &&
            !FixedPointPerlinNoise3D.isReconnectRequired(-23517)) {
            RasterBuffer.completeLogin(2);
          }
          if (LegacyOpenGlShoreWaveWaterEffect.field_l != -1 &&
            0 != LegacyOpenGlShoreWaveWaterEffect.field_l) {
            DisplayPromptRenderer.field_a = IntroMeshResources.monotonicTimeMillis(-47) + 15000L;
          }
        }
        if (LegacyOpenGlShoreWaveWaterEffect.field_l != -1 &&
          LegacyOpenGlShoreWaveWaterEffect.field_l != 0) {
          if (TextureCoordinateGeneration.clientPreparationPhase < 10) {
            if (3 != LegacyOpenGlShoreWaveWaterEffect.field_l) {
              if (LegacyOpenGlShoreWaveWaterEffect.field_l != 4) {
                if (LegacyOpenGlShoreWaveWaterEffect.field_l != 2) {
                  if (LegacyOpenGlShoreWaveWaterEffect.field_l != 5) {
                    this.showFatalError("js5connect", 21253);
                  } else {
                    this.showFatalError("outofdate", 21253);
                  }
                } else {
                  this.showFatalError("js5connect_full", 21253);
                }
              } else {
                this.showFatalError("js5io", 21253);
              }
            } else {
              this.showFatalError("js5crc", 21253);
            }
          } else {
            if (10 <= LoginDialogNavigation.field_a) {
              ScrollViewport.handleAccountConnectionLoss((byte) 70);
              if (LegacyOpenGlShoreWaveWaterEffect.field_l == 3) {
                ArchiveCatalog.showAccountFailure((byte) -97, 256, LevelCompletionSupport.field_a);
              } else {
                if (LegacyOpenGlShoreWaveWaterEffect.field_l == 4) {
                  ArchiveCatalog.showAccountFailure((byte) 61, 256, ServerIntArrayRequest.field_n);
                } else {
                  if (LegacyOpenGlShoreWaveWaterEffect.field_l == 2) {
                    ArchiveCatalog.showAccountFailure((byte) 90, 256, ValidationMessageWidget.dataServerFullOrText);
                  } else {
                    if (LegacyOpenGlShoreWaveWaterEffect.field_l == 5) {
                      ArchiveCatalog.showAccountFailure((byte) -113, 5, TextHotspot.thisGameHasBeenText);
                    } else {
                      ArchiveCatalog.showAccountFailure((byte) -97, 256, ArrayWidgetContainer.unableToConnectToText);
                    }
                  }
                }
              }
              QuickChatCommand.field_d = true;
            }
          }
        }
        if ((LegacyOpenGlShoreWaveWaterEffect.field_l != -1 &&
          LegacyOpenGlShoreWaveWaterEffect.field_l != 0 ||
          FixedPointPerlinNoise3D.isReconnectRequired(-23517)) &&
          IntroMeshResources.monotonicTimeMillis(-87) >= DisplayPromptRenderer.field_a) {
          QuickChatCommand.field_d = false;
          if (-1 != LegacyOpenGlShoreWaveWaterEffect.field_l &&
            0 != LegacyOpenGlShoreWaveWaterEffect.field_l) {
            LegacyOpenGlShoreWaveWaterEffect.field_l = -1;
            LegacyOpenGlInterleavedStream.clearJs5Failures(4);
          }
        }
        if (LegacyOpenGlShoreWaveWaterEffect.field_l == 0 &&
          !FixedPointPerlinNoise3D.isReconnectRequired(-23517)) {
          LegacyWaterTextureResources.field_h = false;
        }
        if (TextureCoordinateGeneration.clientPreparationPhase == 0 &&
          LegacyOpenGlSpriteTexture.loadMasterIndex((byte) 63)) {
          TextureCoordinateGeneration.clientPreparationPhase = 1;
        }
        if (TextureCoordinateGeneration.clientPreparationPhase == 1) {
          if (EmailValidationError.field_c != 0) {
            DropDownListWidget.field_H = EmailCredentials.openResourceArchive(DisplayModeErrorDialog.field_P, (byte) 125);
          }
          EmailCredentials.field_j = LegacyOpenGlPostProcessEffect.openResourceArchive(11880, true, OpenGlUnderwaterEffect.field_i, 1, false);
          LegacyOpenGlPostProcessManager.field_f = LegacyOpenGlPostProcessEffect.openResourceArchive(11880, true, AudioServiceThread.field_h, 1, false);
          AudioOutputBootstrap.field_a = LegacyOpenGlPostProcessEffect.openResourceArchive(11880, true, LegacyOpenGlUnlitEffect.field_f, 1, false);
          ArenaDefinitionCodec.field_c = EmailCredentials.field_j;
          TextureCoordinateGeneration.clientPreparationPhase = 2;
          RotarySelectorWidget.field_J = LegacyOpenGlPostProcessManager.field_f;
        }
        if (TextureCoordinateGeneration.clientPreparationPhase == 2) {
          if (null != DropDownListWidget.field_H &&
            DropDownListWidget.field_H.loadIndex((byte) 127)) {
            if (!DropDownListWidget.field_H.hasGroupName((byte) -99, "")) {
              DropDownListWidget.field_H = null;
            } else {
              if (DropDownListWidget.field_H.tryLoadNamedGroup("", 100)) {
                FallbackShaderEffect.loadClientText(7, DropDownListWidget.field_H);
                DropDownListWidget.field_H = null;
                VertexAttribute.resetAppletTiming(0);
              }
            }
          }
          if (DropDownListWidget.field_H == null) {
            TextureCoordinateGeneration.clientPreparationPhase = 3;
          }
        }
        if (3 == TextureCoordinateGeneration.clientPreparationPhase &&
          ReflectionCheck.commonUiResourcesReady(LegacyOpenGlPostProcessManager.field_f, (byte) 124, AudioOutputBootstrap.field_a, EmailCredentials.field_j) &&
          DroneWave.tryLoadArchive(AudioOutputBootstrap.field_a, 40)) {
          LruNodeCache.releaseValidationIcons((byte) -93);
          UnderageAccountInfoPanel.initializeFullscreenInstructions(true);
          HardwareTextureSprite.field_m = false;
          LegacyOpenGlVertexBuffer.field_k = ToolkitImageProducerBuffer.loadingText;
          AccountUiBootstrap.initializeAccountUi(AudioOutputBootstrap.field_a, NineSlicePanel.field_a, (byte) 40, LegacyOpenGlPostProcessManager.field_f, EmailCredentials.field_j);
          if (ProjectionMode.field_c ||
            DropTargetWidget.field_B != null) {
            stackIn_106_0 = 1;
            stackIn_107_1 = !(ProjectionMode.field_c);
            stackIn_109_2 = DropTargetWidget.field_B;
            stackIn_110_3 = !(ProjectionMode.field_c);
            AccountUiBootstrap.showLoginDialog(stackIn_106_0, stackIn_107_1, stackIn_109_2, stackIn_110_3);
          }
          if (ArchiveLoadRequirement.simpleMode) {
            SlowBurstParticle.showProgressDialogAndSetResult(4);
          }
          if (ProxyAuthenticationRequiredException.field_d == null) {
            ProxyAuthenticationRequiredException.field_d = AccountUiBootstrap.gameSoundMixer(14263);
            ContentTransitionDialog.field_O = LoginForm.soundOutputBufferSize(false);
          }
          IntroPreparation.prepareIntro(ProxyAuthenticationRequiredException.field_d, (byte) 127, AudioOutputBootstrap.field_a, ContentTransitionDialog.field_O);
          AudioOutputBootstrap.field_a = null;
          LegacyOpenGlPostProcessManager.field_f = null;
          EmailCredentials.field_j = null;
          DirectByteArrayStorage.checkAppletUsername((java.applet.Applet) (this), (byte) -96);
          VertexAttribute.resetAppletTiming(0);
          TextureCoordinateGeneration.clientPreparationPhase = 10;
        }
        if (TextureCoordinateGeneration.clientPreparationPhase == 10) {
          if (0 != EmailValidationError.field_c) {
            DisplayModeFailure.field_a = EmailCredentials.openResourceArchive(MenuScreen.field_f, (byte) 125);
          }
          TextureCoordinateGeneration.clientPreparationPhase = 11;
        }
        boolean decompiledFrameRemainder0 = true;
        if (TextureCoordinateGeneration.clientPreparationPhase == 11) {
          if (DisplayModeFailure.field_a != null && (!DisplayModeFailure.field_a.loadIndex((byte) 127) ||
            !DisplayModeFailure.field_a.tryLoadAllGroups(true))) {
            NameSuggestionsPanel.setLoadingProgress(20, 0.0f, IntroFinalFrameResources.archiveLoadingMessage(117, AccountRequestState.field_c, LegacyOpenGlTexture3D.field_k, DisplayModeFailure.field_a));
            decompiledFrameRemainder0 = false;
          }
          else {
            RidgedNoise3D.field_u = true;
            TextureCoordinateGeneration.clientPreparationPhase = 12;
          }
        }
        if (TextureCoordinateGeneration.clientPreparationPhase == 12 &&
          !RidgedNoise3D.field_u) {
          TextureCoordinateGeneration.clientPreparationPhase = 13;
        }
        if (TextureCoordinateGeneration.clientPreparationPhase == 13) {
          var3Lifetime2 = 1;
          if (LoginDialogState.field_a != null) {
            stackIn_138_0 = (!LoginDialogState.field_a.pollReady(100)) ? 0 : 1;
            var3Lifetime2 = stackIn_138_0;
            NameSuggestionsPanel.setLoadingProgress(20, LoginDialogState.field_a.progress, LoginDialogState.field_a.progressText);
          }
          if (var3Lifetime2 != 0) {
            TextureCoordinateGeneration.clientPreparationPhase = 20;
          }
        }
        if (!deferCanvasReplacement &&
          DroneDebris.field_A) {
          CheckboxWidget.detachInputHandlers(true, NineSlicePanel.field_f);
          this.replaceCanvas(1000);
          ServerDataWriteRequest.attachInputHandlers(false, NineSlicePanel.field_f);
        }
        if (InteractiveWidget.enabledAccountPackets[8]) {
          ReflectionReplySender.sendReflectionReplies(8);
        }
    }

    private final int pollReconnect(byte guard) {
        int var2;
        if (this.fatalErrorReported) {
          return -1;
        }
        if (!FixedPointPerlinNoise3D.isReconnectRequired(-23517)) {
          return -1;
        }
        if (QuickChatCommand.field_d) {
          return -1;
        }
        var2 = UsernameCredentials.pollLogin(LegacyOpenGlRidgedWaterEffect.accountFormIdentifier((byte) -2), this.trustedJagexHost, (byte) 56, true, this.affiliateId, ResourceRequest.accountFormPassword((byte) -97));
        if (-1 == var2) {
          return -1;
        }
        if (guard >= -38) {
          return 99;
        }
        if (0 != var2 &&
          var2 != 1) {
          if (!BeveledTextInputRenderer.field_o) {
            this.showFatalError("reconnect", 21253);
          }
          ScrollViewport.handleAccountConnectionLoss((byte) 63);
          ArchiveCatalog.showAccountFailure((byte) 114, var2, MouseWheelInput.field_c);
          QuickChatCommand.field_d = true;
          DisplayPromptRenderer.field_a = 15000L + IntroMeshResources.monotonicTimeMillis(-50);
          return var2;
        }
        if (LoginDialogNavigation.field_a == 11 &&
          LegacyOpenGlShoreWaveWaterEffect.field_l == 0) {
          RasterBuffer.completeLogin(2);
        }
        return var2;
    }

    private final void enableAccountPacket(int opcode) {
        InteractiveWidget.enabledAccountPackets[opcode] = true;
    }

    final void updateIntroAndLogin(int guard) {
        int discarded$33 = 0;
        int discarded$34 = 0;
        int var3;
        int stackIn_11_1 = 0;
        boolean stackIn_12_2 = false;
        var3 = Sumoblitz.field_L ? 1 : 0;
        if (guard <= 94) {
          waitingForSoundEffectsText = (String) null;
        }
        if (ScrollViewport.canRenderClientUi(-1)) {
          stackIn_11_1 = 16981;
          stackIn_12_2 = (CompactMeshGeometry.field_o != null);
          discarded$33 = this.processAccountDialogActions(stackIn_11_1, stackIn_12_2, false);
        } else {
          if (TextureCoordinateGeneration.clientPreparationPhase >= 10) {
            if (!LegacyOpenGlRenderBufferSet.isIntroFinished(-251)) {
              IntegerMath.advanceIntroTick((byte) 126);
            } else {
              if (LoginDialogNavigation.field_a != 0) {
                ModalDialog.pollAccountDialogs((byte) 55, OpenGlUnderwaterEffect.field_r);
              } else {
                discarded$34 = this.processAccountDialogActions(16981, false, false);
              }
            }
          }
        }
    }

    final void dispatchAccountPacket(int guard) {
        boolean stackIn_28_0 = false;
        int var2;
        ChatMessage var3;
        int var4;
        var4 = Sumoblitz.field_L ? 1 : 0;
        if (guard != 9289) {
          return;
        }
        var2 = TextureFormat.receivedAccountOpcode;
        if (var2 < 64 &&
          InteractiveWidget.enabledAccountPackets[var2]) {
          if (0 == var2) {
            return;
          }
          if (var2 != 1) {
            if (var2 == 2) {
              SpriteStripButtonRenderer.decodeHiscoreResponse((byte) -70);
            } else {
              if (var2 == 3) {
                LegacyOpenGlNormalMapGenerator.readServerIntReply(-30084);
              } else {
                if (var2 != 4) {
                  if (var2 != 5) {
                    if (var2 != 6) {
                      if (var2 != 7) {
                        if (var2 != 8) {
                          if (var2 == 16) {
                            ScrollViewport.readAccountDisplayName((byte) -93);
                          } else {
                            if (11 != var2 &&
                              var2 != 12) {
                              if (var2 == 13) {
                                AccountCreationForm.readSocialUpdate((byte) 117);
                                return;
                              }
                              if (var2 == 17) {
                                this.readBrowserNavigation((byte) -76);
                                return;
                              }
                              if (var2 == 18) {
                                LegacyOpenGlEffect.readStatusFlagReply(8192);
                                return;
                              }
                              IntrusiveNode.reportClientError("MGS1: " + VictoryScreen.accountPacketDiagnostic((byte) -22), (Throwable) null, 0);
                              LegacyOpenGlTextureCache.closeAccountSocket((byte) -128);
                              return;
                            }
                            stackIn_28_0 = (var2 == 12);
                            var3 = DualLinkedRenderResource.readChatMessage(stackIn_28_0, (byte) -62);
                            ByteArrayStorage.receiveChatMessage(var3, (byte) 60);
                          }
                        } else {
                          SecondaryNodeQueue.readReflectionCheck((byte) 127, NativeLibraryExtractor.incomingPacket, FourIntUpdateRequest.platformDispatcher, HardwareBufferSet.accountPacketLength);
                        }
                      } else {
                        this.storeSessionCookie(-1);
                      }
                    } else {
                      SlowBurstParticle.readFourStatHiscores((byte) -77);
                    }
                  } else {
                    HotspotTextWidget.readServerDataReply((byte) -93);
                  }
                } else {
                  CubeMapSource.decodeLoggingResponse(-22683);
                }
              }
            }
          } else {
            MusicVoice.readFourIntResponse(false);
          }
          return;
        }
        IntrusiveNode.reportClientError("MGS2: " + VictoryScreen.accountPacketDiagnostic((byte) 86), (Throwable) null, 0);
        LegacyOpenGlTextureCache.closeAccountSocket((byte) -112);
        return;
    }

    final void initializeDefaultClientServices(int param0, int param1, int param2, int param3, int param4, int param5, boolean param6) {
        this.initializeClientServices(false, param0, (byte) 111, param3, param5, param2, param4, param1);
        if (!param6) {
          this.updateIntroAndLogin(-95);
        }
    }

    final int processAccountDialogs(int guard, boolean param1) {
        if (guard != -1) {
          return 50;
        }
        return this.processAccountDialogActions(16981, param1, true);
    }

    private final void storeSessionCookie(int guard) {
        String var2 = VertexAttribute.readAccountString((byte) -62);
        if (guard != -1) {
          return;
        }
        SingleChildWidget.setSessionCookie(61, var2, LegacyOpenGlUnlitEffect.activeApplet(2));
    }

    private final void enableHiscoreReplies(int guard) {
        InteractiveWidget.enabledAccountPackets[2] = true;
        if (guard != 8) {
          this.secondaryGamePort = 114;
        }
    }

    final int pollReconnectAndResend(boolean guard) {
        int var2;
        var2 = this.pollReconnect((byte) -99);
        if (!guard) {
          return -127;
        }
        if (var2 == 0 ||
          var2 == 1) {
          if (InteractiveWidget.enabledAccountPackets[1]) {
            UiStyle.resendFourIntReadRequests((byte) 115, 2);
          }
          if (InteractiveWidget.enabledAccountPackets[2]) {
            SlowBurstParticle.resendStatisticsAndHiscores(3, (byte) -73);
          }
          if (InteractiveWidget.enabledAccountPackets[3]) {
            PointLight.resendProgressAndArrayRequests(0, 4);
          }
          if (InteractiveWidget.enabledAccountPackets[4]) {
            GraphicsOptionsDialog.resendLoggingRequests(28778, 5);
          }
          if (InteractiveWidget.enabledAccountPackets[5]) {
            TextureMetadata.resendServerDataRequests(false, 6);
          }
          if (InteractiveWidget.enabledAccountPackets[6]) {
            HardwareQuadBatchBuffers.resendFourStatHiscoreRequests(7, guard);
          }
          if (InteractiveWidget.enabledAccountPackets[8]) {
            LegacyOpenGlAssemblyProgram.resetReflectionChecks(-58);
          }
        }
        return var2;
    }

    private final void readBrowserNavigation(byte guard) {
        int var2 = NativeLibraryExtractor.incomingPacket.readUnsignedByte(-31302);
        int var3 = (var2 & 1) != 0 ? 1 : 0;
        int var4 = -1 + HardwareBufferSet.accountPacketLength;
        byte[] var5 = new byte[var4];
        NativeLibraryExtractor.incomingPacket.readCipherBytes(var5, 0, 0, var4);
        if (guard > -55) {
          this.affiliateId = -30;
        }
        LegacyOpenGlFlowingWaterEffect.openExternalUrl(-23166, LegacyOpenGlUnlitEffect.activeApplet(2), var3 != 0, MusicVoice.decodeCp1252(0, var5));
    }

    final void configureAccountFeatures(boolean serverData, boolean fourIntReads, byte guard, boolean hiscores, boolean logging) {
        if (guard == 60) {
          this.enableDefaultAccountPackets(false, -12605);
          if (fourIntReads) {
            this.enableAccountPacket(1);
          }
          if (hiscores) {
            this.enableHiscoreReplies(8);
          }
          if (logging) {
            this.enableLoggingReplies((byte) 30);
          }
          if (serverData) {
            this.enableServerDataReplies((byte) 68);
          }
          return;
        }
    }

    public static void releaseStatics(int param0) {
        if (param0 < 79) {
          field_t = -119;
        }
        menuActionLabels = null;
        waitingForSoundEffectsText = null;
    }

    final void startAppletWithDefaultWidth(int cacheIndexCount, String cacheName, int height) {
        try {
          this.startFromAppletParameters(cacheIndexCount, height ^ 480, 640, cacheName, height);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "fn.CA(" + cacheIndexCount + ',' + (cacheName != null ? "{...}" : "null") + ',' + height + ')');
        }
    }

    private final void startFromAppletParameters(int cacheIndexCount, int guard, int width, String cacheName, int height) {
        boolean stackIn_8_1 = false;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        Throwable decompiledCaughtException = null;
        String var6 = null;
        Exception var6_ref = null;
        RuntimeException var6_ref2 = null;
        String var7 = null;
        String var8 = null;
        String var9 = null;
        try {
          try {
            if (!this.allowStartup(-1)) {
              return;
            }
            this.gameHost = this.getCodeBase().getHost();
            var6 = this.gameHost.toLowerCase();
            stackIn_8_1 = (var6.equals("jagex.com")) || (var6.endsWith(".jagex.com"));
            this.trustedJagexHost = stackIn_8_1;
            if (guard != 0) {
              this.storeSessionCookie(-5);
            }
            this.primaryGamePort = Integer.parseInt(this.getParameter("gameport1"));
            this.secondaryGamePort = Integer.parseInt(this.getParameter("gameport2"));
            var7 = this.getParameter("servernum");
            if (var7 != null) {
              this.serverNumber = Integer.parseInt(var7);
            }
            this.gameCrc = Integer.parseInt(this.getParameter("gamecrc"));
            this.instanceId = Long.parseLong(this.getParameter("instanceid"));
            this.members = this.getParameter("member").equals("yes");
            var8 = this.getParameter("lang");
            if (var8 != null) {
              this.language = Integer.parseInt(var8);
            }
            if (this.language >= 5) {
              this.language = 0;
            }
            var9 = this.getParameter("affid");
            if (var9 != null) {
              this.affiliateId = Integer.parseInt(var9);
            }
            ArchiveLoadRequirement.simpleMode = Boolean.valueOf(this.getParameter("simplemode")).booleanValue();
            this.startApplet(32, height, (byte) 44, width, this.gameCrc, cacheName, cacheIndexCount);
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6_ref = (Exception) (Object) decompiledCaughtException;
            IntrusiveNode.reportClientError((String) null, (Throwable) ((Object) var6_ref), guard ^ 0);
            this.showFatalError("crash", 21253);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var6_ref2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_25_0 = var6_ref2;
          stackIn_25_1 = new StringBuilder().append("fn.S(").append(cacheIndexCount).append(',').append(guard).append(',').append(width).append(',');
          if (cacheName == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(height).append(')').toString());
        }
    }

    private final int processAccountDialogActions(int guard, boolean param1, boolean param2) {
        try {
          Throwable decompiledCaughtException = null;
          int var4 = 0;
          int var5_int = 0;
          Exception var5 = null;
          String var7 = null;
          int var8 = 0;
          String var9 = null;
          String var10 = null;
          Boolean var11 = null;
          PacketBuffer var12 = null;
          int var5_intLifetime1;
          int var5_intLifetime2;
          var8 = Sumoblitz.field_L ? 1 : 0;
          var4 = GameDefinitionLoader.pollAccountDialogResult(param1, OpenGlUnderwaterEffect.field_r, EmailValidationError.field_c, (byte) 81);
          if (var4 == 0) {
            throw new IllegalStateException();
          }
          if (guard != 16981) {
            this.affiliateId = 90;
          }
          if (var4 == 1) {
            var5_int = AlternateUsernameCredentials.pollNameAvailability(LegacyOpenGlTexture.accountServiceIdentifierValue(true), 0, SelectionOverlay.nameAvailabilityIdentifierValue((byte) 21));
            if (var5_int != -1) {
              LoginDialogNavigation.completeNameAvailability(var5_int, ArchiveLoadingStage.nameSuggestions, MouseWheelInput.field_c, true);
              MouseWheelInput.field_c = null;
              ArchiveLoadingStage.nameSuggestions = null;
            }
            var11 = ToolkitImageProducerBuffer.consumeEmailAvailabilityResult(82);
            if (var11 != null) {
              IntroLogoRenderer.completeEmailAvailability(var11.booleanValue(), -80);
            }
          }
          if (var4 == 2) {
            var5_intLifetime1 = IntList.pollAccountCreation(BeveledCheckboxRenderer.registrationEmailNews(-98), LegacyOpenGlRidgedWaterEffect.accountFormIdentifier((byte) -2), Transform3D.registrationAge((byte) -97), HiscoreRequest.accountServiceIdentifier(-86), this.affiliateId, 119, ResourceRequest.accountFormPassword((byte) -109));
            if (var5_intLifetime1 != -1) {
              Sumoblitz.completeAccountCreation(ArchiveLoadingStage.nameSuggestions, guard ^ 16984, var5_intLifetime1, MouseWheelInput.field_c);
              MouseWheelInput.field_c = null;
              ArchiveLoadingStage.nameSuggestions = null;
            }
          }
          if (3 == var4) {
            if (LegacyOpenGlShoreWaveWaterEffect.field_l != -1 &&
              LegacyOpenGlShoreWaveWaterEffect.field_l != 0) {
              LegacyOpenGlShoreWaveWaterEffect.field_l = -1;
              LegacyOpenGlInterleavedStream.clearJs5Failures(4);
            }
            if (param2) {
              QuickChatCommand.field_d = false;
            } else {
              var5_intLifetime2 = UsernameCredentials.pollLogin(LegacyOpenGlRidgedWaterEffect.accountFormIdentifier((byte) -2), this.trustedJagexHost, (byte) 21, false, this.affiliateId, ResourceRequest.accountFormPassword((byte) -124));
              if (-1 != var5_intLifetime2) {
                if (var5_intLifetime2 == 0) {
                  FourStatHiscoreRequest.field_k = StringBuilderSupport.field_a;
                  RasterBuffer.completeLogin(2);
                  LoginDialogNavigation.field_a = 10;
                  IntrusiveNode.field_a = false;
                } else {
                  ArchiveCatalog.showAccountFailure((byte) -118, var5_intLifetime2, MouseWheelInput.field_c);
                  MouseWheelInput.field_c = null;
                }
              }
            }
          }
          if (var4 == 4) {
            if (NineSlicePanel.field_a) {
              MessageDialog.clearCookieAndReload(-1540, LegacyOpenGlUnlitEffect.activeApplet(guard ^ 16983));
            } else {
              IntrusiveNode.field_a = true;
              LoginDialogNavigation.field_a = 10;
            }
          }
          if (var4 == 5) {
            HardwareQuadBatchBuffers.quitToWebsite(LegacyOpenGlUnlitEffect.activeApplet(guard - 16979), false);
          }
          if (var4 == 6 &&
            HardwareTextureSprite.field_m) {
            LoginDialogNavigation.field_a = 10;
          }
          if (var4 == 7) {
            LegacyOpenGlInterleavedStream.openServerList(false, LegacyOpenGlUnlitEffect.activeApplet(2));
          }
          if (8 == var4) {
            MessageDialog.clearCookieAndReload(-1540, LegacyOpenGlUnlitEffect.activeApplet(guard - 16979));
          }
          if (9 == var4) {
            LegacyOpenGlTexture2D.openSupportPage(LegacyOpenGlUnlitEffect.activeApplet(2), (byte) -124);
          }
          if (var4 == 10) {
            InwardSparkParticle.outgoingPacket.writeCipherByte(17, guard ^ 16989);
          }
          if (var4 == 11) {
            HiscoreRequest.reloadApplet(8192, LegacyOpenGlUnlitEffect.activeApplet(2));
          }
          if (var4 == 12) {
            SocialContact.openAppletPage(LegacyOpenGlSpriteTexture.requestedPolicyPath(false), LegacyOpenGlUnlitEffect.activeApplet(2), (byte) -103);
          }
          if (var4 == 13) {
            try {
              if (null == IntrusiveNode.field_e) {
                IntrusiveNode.field_e = new JaggrabDownloader(FourIntUpdateRequest.platformDispatcher, new java.net.URL(this.getCodeBase(), "countrylist.ws"), 5000);
              }
              if (IntrusiveNode.field_e.pollDownload((byte) -110)) {
                var12 = IntrusiveNode.field_e.completedDownload((byte) 126);
                if (var12 != null) {
                  var7 = SoftLruCache.decodeCp1252(var12.payload, 0, var12.position, 26564);
                  GraphicsToolkit.onCountryListResponse((byte) 115, var7);
                } else {
                  var9 = (String) null;
                  GraphicsToolkit.onCountryListResponse((byte) 122, (String) null);
                }
                IntrusiveNode.field_e = null;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var5 = (Exception) (Object) decompiledCaughtException;
              IntrusiveNode.reportClientError("S1", (Throwable) ((Object) var5), 0);
              var10 = (String) null;
              GraphicsToolkit.onCountryListResponse((byte) 111, (String) null);
              IntrusiveNode.field_e = null;
            }
          }
          if (15 == var4) {
            LoginDialogNavigation.field_a = 10;
          }
          if (var4 == 16) {
            return 1;
          }
          if (var4 == 17) {
            return 2;
          }
          return 0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void enableLoggingReplies(byte guard) {
        int var2 = 76 / ((guard + 76) / 48);
        InteractiveWidget.enabledAccountPackets[4] = true;
    }

    private final void enableDefaultAccountPackets(boolean reflectionChecks, int guard) {
        InteractiveWidget.enabledAccountPackets[0] = true;
        InteractiveWidget.enabledAccountPackets[7] = true;
        InteractiveWidget.enabledAccountPackets[18] = true;
        if (guard != -12605) {
          this.dispatchAccountPacket(112);
        }
        InteractiveWidget.enabledAccountPackets[3] = true;
        InteractiveWidget.enabledAccountPackets[8] = reflectionChecks;
        InteractiveWidget.enabledAccountPackets[17] = true;
        InteractiveWidget.enabledAccountPackets[16] = true;
    }

    protected GameClientShell() {
    }

    private final void initializeClientServices(boolean param0, int param1, byte param2, int param3, int param4, int param5, int param6, int param7) {
        java.awt.Frame var11 = new java.awt.Frame("Jagex");
        var11.pack();
        var11.dispose();
        this.setBackground(java.awt.Color.black);
        EmailValidationError.field_c = this.language;
        LegacyVertexAttribute.setLoadingLanguage(EmailValidationError.field_c, 13586);
        EmptyWidgetRenderer.initializeAccountService(param0, (byte) 84, FourIntUpdateRequest.platformDispatcher, 5000, this.secondaryGamePort, param1, this.gameCrc, this.primaryGamePort, 5000, this.gameHost, this.members, this.serverNumber, EmailValidationError.field_c, this.instanceId);
        PacketBuffer.initializeNetworkServices(FourIntUpdateRequest.platformDispatcher, this.primaryGamePort, this.secondaryGamePort, this.gameHost, (byte) -56, this.gameCrc, this.serverNumber, param1, EmailValidationError.field_c);
        SoftwareRenderContext.initializePunctuationKeyMap(false);
        InwardSparkParticle.field_w = EmailValidationError.createMouseWheelInput((byte) -126);
        int var10 = -116 / ((2 - param2) / 36);
        ServerDataWriteRequest.attachInputHandlers(false, NineSlicePanel.field_f);
        MenuScreen.field_f = param7;
        DisplayModeErrorDialog.field_P = param4;
        OpenGlUnderwaterEffect.field_i = param5;
        LegacyOpenGlUnlitEffect.field_f = param3;
        AudioServiceThread.field_h = param6;
        this.initializeAccountPacketLengths(-1);
        LegacyOpenGlSpecularEffect.initializeClientHook(8193);
    }

    static {
        tooltipDelay = 50;
        waitingForSoundEffectsText = "Waiting for sound effects";
    }
}
