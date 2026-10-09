/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class SessionGameApplet extends GameApplet {
    private int serverNumber;
    private long instanceId;
    private int affiliateId;
    static MusicScore spaceMusicTrack;
    private boolean forceIdleDisconnect;
    private boolean isJagexCodeBase;
    String serverHost;
    private boolean requestedMemberMode;
    private int languageId;
    static String fullscreenText;
    private int alternateServerPort;
    private int primaryServerPort;
    private int gameCrc;
    static int uiAccentPaletteIndex;

    private final int pollReconnectHandshake(int pendingResultCode) {
        int handshakeResult;
        if (this.errorPageShown) {
          return -1;
        }
        if (!ClientTimingSupport.isClientReadyForSessionActions(75)) {
          return -1;
        }
        if (ArchiveLoadStep.loginRetrySuspended) {
          return -1;
        }
        handshakeResult = LoginProtocolSupport.advanceLoginHandshake(true, ContextualRuntimeException.getActiveLoginPassword(true), this.affiliateId, this.isJagexCodeBase, ClientFlowToken.getActiveLoginIdentifier(pendingResultCode + 1), 0);
        if (handshakeResult == pendingResultCode) {
          return -1;
        }
        if (handshakeResult != 0 &&
            handshakeResult != 1) {
          if (!TextWidgetRenderer.suppressReconnectErrorPage) {
            this.showGameError((byte) 79, "reconnect");
          }
          ClientFlowState.requestSessionExit((byte) 103);
          TextInputValidator.handleLoginUiResponse((byte) 124, handshakeResult, AudioService.sessionResponseText);
          ArchiveLoadStep.loginRetrySuspended = true;
          DisplayNamePanel.connectionRetryDeadlineMillis = ClientClockSupport.correctedCurrentTimeMillis(-12520) + 15000L;
          return handshakeResult;
        }
        if (SpriteConstructionSupport.clientScreenStage != 11) {
          return handshakeResult;
        }
        if (DebouncedValidationProvider.archiveLoadStatus != 0) {
          return handshakeResult;
        }
        IterableNodeHashTable.refreshLoginTicketMessage(pendingResultCode - 12617);
        return handshakeResult;
    }

    final static java.net.URL applySessionOverridesToUrl(java.net.URL url, int methodGuard, java.applet.Applet applet) {
        Object settingsOverrideOrFailure = null;
        int guardResidue = 0;
        Object sessionOverrideOrSettingsAlias = null;
        java.net.URL urlBeforeReturn = null;
        Object urlFailureBeforeContext = null;
        StringBuilder urlMessagePrefix = null;
        String urlDescription = null;
        StringBuilder messageBeforeAppletDescription = null;
        String appletDescription = null;
        RuntimeException caughtUrlFailure = null;
        try {
          guardResidue = -16 / ((methodGuard + 4) / 62);
          settingsOverrideOrFailure = null;
          sessionOverrideOrSettingsAlias = null;
          if (null != NetworkArchiveRequest.settingsCookieValue &&
              !NetworkArchiveRequest.settingsCookieValue.equals(applet.getParameter("settings"))) {
            settingsOverrideOrFailure = NetworkArchiveRequest.settingsCookieValue;
            sessionOverrideOrSettingsAlias = settingsOverrideOrFailure;
            sessionOverrideOrSettingsAlias = settingsOverrideOrFailure;
          }
          if (ScorePopup.sessionCookieOverride != null &&
              !ScorePopup.sessionCookieOverride.equals(applet.getParameter("session"))) {
            sessionOverrideOrSettingsAlias = ScorePopup.sessionCookieOverride;
          }
          urlBeforeReturn = ScoreSubmission.rewriteSessionUrlPath((String) (sessionOverrideOrSettingsAlias), (String) (settingsOverrideOrFailure), url, -1, true);
          return urlBeforeReturn;
        } catch (java.lang.RuntimeException urlFailure) {
          caughtUrlFailure = urlFailure;
          settingsOverrideOrFailure = caughtUrlFailure;
          urlFailureBeforeContext = settingsOverrideOrFailure;
          urlMessagePrefix = new StringBuilder().append("wf.KA(");
          if (url == null) {
            urlDescription = "null";
          } else {
            urlDescription = "{...}";
          }
          messageBeforeAppletDescription = ((StringBuilder) (Object) urlMessagePrefix).append(urlDescription).append(',').append(methodGuard).append(',');
          if (applet == null) {
            appletDescription = "null";
          } else {
            appletDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) (urlFailureBeforeContext), ((StringBuilder) (Object) messageBeforeAppletDescription).append(appletDescription).append(')').toString());
        }
    }

    final void initializeSessionAppletServices(byte methodGuard, int gameTextArchiveId, int interfaceTextArchiveId, int buttonAndLogoArchiveId, int commonUiSpriteArchiveId, boolean responseExtensionEnabled, int uiFontArchiveId, int clientId) {
        java.awt.Frame awtPreparationFrame = new java.awt.Frame("Jagex");
        awtPreparationFrame.pack();
        awtPreparationFrame.dispose();
        this.setBackground(java.awt.Color.black);
        MeshPrioritySupport.bootstrapLanguageId = this.languageId;
        ClientOptionSupport.selectBootstrapLanguageText(true, MeshPrioritySupport.bootstrapLanguageId);
        if (methodGuard == -70) {
            SessionBootstrapSupport.initializeSessionServices(this.gameCrc, this.instanceId, 5000, clientId, this.requestedMemberMode, responseExtensionEnabled, MeshPrioritySupport.bootstrapLanguageId, this.alternateServerPort, 5000, this.serverHost, this.serverNumber, MenuScreen.platformTaskDispatcher, 64, this.primaryServerPort);
            TextInputValidator.initializeArchiveServices(clientId, MeshPrioritySupport.bootstrapLanguageId, this.primaryServerPort, this.serverNumber, -23949, MenuScreen.platformTaskDispatcher, this.serverHost, this.gameCrc, this.alternateServerPort);
            StatefulWidgetRenderer.initializePunctuationKeyCodes(28);
            CachedTextLayout.mouseWheelInput = TextValidationFailure.createMouseWheelInput(methodGuard + 113);
            UsernameAvailabilityQuery.attachCanvasInputListeners(MessageDialog.gameCanvas, 57);
            TextLayoutLine.interfaceTextArchiveId = interfaceTextArchiveId;
            DebouncedValidationProvider.commonUiSpriteArchiveId = commonUiSpriteArchiveId;
            ArchiveRequest.uiFontArchiveId = uiFontArchiveId;
            ClientTimingSupport.buttonAndLogoArchiveId = buttonAndLogoArchiveId;
            TextWidgetSupport.gameTextArchiveId = gameTextArchiveId;
            this.initializeSessionPacketLengths(123);
            PacketBuffer.resetClientOptionMask((byte) -13);
            return;
        }
    }

    private final void handleSessionCookiePacket(int methodGuard) {
        if (methodGuard != -11) {
            return;
        }
        String sessionCookieValue = HotspotTextWidget.readSessionPacketText(1000);
        MeshPrioritySupport.updateSessionCookie(sessionCookieValue, NodeHashTableIterator.getActiveApplet(111), methodGuard + 10);
    }

    final void enableOptionalSessionPacketFamilies(boolean allowIntRecordReplies, boolean allowSessionAcknowledgements, boolean allowScoreReplies, boolean allowByteShortReplies, int methodGuard) {
        this.enableBaseSessionPacketFamilies(false, (byte) -91);
        if (allowByteShortReplies) {
            this.enableByteShortReplies((byte) 32);
        }
        if (allowScoreReplies) {
            this.enableScoreReplies(16072);
        }
        if (methodGuard > -87) {
            this.alternateServerPort = -34;
        }
        if (allowIntRecordReplies) {
            this.enableIntRecordReplies((byte) -19);
        }
        if (allowSessionAcknowledgements) {
            this.setSessionAcknowledgementsEnabled(true);
        }
    }

    final void initializeGameApplet(int cacheIndexCount, String gameName, int canvasWidth) {
        try {
            this.initializeFromAppletParameters(480, gameName, cacheIndexCount, (byte) 81, canvasWidth);
        } catch (RuntimeException initializationFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) initializationFailure), "wf.EA(" + cacheIndexCount + ',' + (gameName != null ? "{...}" : "null") + ',' + canvasWidth + ')');
        }
    }

    final int pollReconnectAndResendRequests(byte methodGuard) {
        int handshakeResult;
        java.applet.Applet unusedNullApplet;
        if (methodGuard != -67) {
          unusedNullApplet = (java.applet.Applet) null;
          SessionGameApplet.applySessionOverridesToUrl((java.net.URL) null, 48, (java.applet.Applet) null);
        }
        handshakeResult = this.pollReconnectHandshake(-1);
        if (handshakeResult == 0 ||
            1 == handshakeResult) {
          if (OpacityWidget.enabledSessionPacketOpcodes[1]) {
            ByteArrayBuffer.resendByteShortQueries(true, 2);
          }
          if (OpacityWidget.enabledSessionPacketOpcodes[2]) {
            MatchScoringSupport.resendScoreAndHighscoreRequests(methodGuard ^ 76, 3);
          }
          if (OpacityWidget.enabledSessionPacketOpcodes[3]) {
            AchievementProtocolSupport.resendAchievementMessages((byte) -125, 4);
          }
          if (OpacityWidget.enabledSessionPacketOpcodes[4]) {
            ByteArrayPoolSupport.resendIntRecordRequests(5, 116);
          }
          if (OpacityWidget.enabledSessionPacketOpcodes[5]) {
            TextTemplateDefinitionLoader.sendPendingAcknowledgementPackets(6, methodGuard + 21789);
          }
          if (OpacityWidget.enabledSessionPacketOpcodes[6]) {
            SecondaryDeque.resendRankedListQueries(true, 7);
          }
          if (OpacityWidget.enabledSessionPacketOpcodes[8]) {
            DialogLayer.initializeReflectionCheckQueue(-13912);
          }
        }
        return handshakeResult;
    }

    private final void enableBaseSessionPacketFamilies(boolean allowReflectionChecks, byte methodGuard) {
        OpacityWidget.enabledSessionPacketOpcodes[18] = true;
        OpacityWidget.enabledSessionPacketOpcodes[17] = true;
        OpacityWidget.enabledSessionPacketOpcodes[8] = allowReflectionChecks;
        OpacityWidget.enabledSessionPacketOpcodes[0] = true;
        OpacityWidget.enabledSessionPacketOpcodes[3] = true;
        if (methodGuard != -91) {
            this.enableIntRecordReplies((byte) 55);
        }
        OpacityWidget.enabledSessionPacketOpcodes[7] = true;
        OpacityWidget.enabledSessionPacketOpcodes[16] = true;
    }

    private final void initializeSessionPacketLengths(int methodGuard) {
        ArchiveRequest.sessionPacketLengthByOpcode[11] = -1;
        ArchiveRequest.sessionPacketLengthByOpcode[3] = -1;
        ArchiveRequest.sessionPacketLengthByOpcode[10] = -1;
        ArchiveRequest.sessionPacketLengthByOpcode[17] = -1;
        ArchiveRequest.sessionPacketLengthByOpcode[5] = -1;
        ArchiveRequest.sessionPacketLengthByOpcode[16] = -1;
        ArchiveRequest.sessionPacketLengthByOpcode[6] = -2;
        ArchiveRequest.sessionPacketLengthByOpcode[1] = 16;
        ArchiveRequest.sessionPacketLengthByOpcode[9] = -1;
        ArchiveRequest.sessionPacketLengthByOpcode[13] = -1;
        int guardResidue = -13 / ((methodGuard - 56) / 60);
        ArchiveRequest.sessionPacketLengthByOpcode[7] = -1;
        ArchiveRequest.sessionPacketLengthByOpcode[2] = -2;
        ArchiveRequest.sessionPacketLengthByOpcode[4] = -1;
        ArchiveRequest.sessionPacketLengthByOpcode[8] = -2;
        ArchiveRequest.sessionPacketLengthByOpcode[18] = 1;
        ArchiveRequest.sessionPacketLengthByOpcode[12] = -1;
    }

    final void updateSessionBootstrapAndInput(boolean fullscreenActive, int methodGuard) {
        int archiveWasPendingSnapshot = 0;
        int loginPanelGuardSnapshot = 0;
        String loginPanelMessageSnapshot = null;
        boolean allowRetrySnapshot = false;
        boolean allowCancelSnapshot;
        int bootstrapSequenceReadySnapshot = 0;
        int idleThresholdOrArchivePendingOrSequenceReady;
        java.awt.Dimension containerSize;
        int clientControlFlowGuard;
        java.awt.Container canvasContainer;
        int idleThresholdOrArchivePendingOrSequenceReadyPhase2;
        int idleThresholdOrArchivePendingOrSequenceReadyPhase3;
        clientControlFlowGuard = Geoblox.clientControlFlowFlag;
        if (null != FontLoadingSupport.canvasResizeController) {
          if (InstrumentPatch.activeFullscreenCanvas == null) {
            canvasContainer = MultiHandleSliderRenderer.getActiveCanvasContainer(true);
            containerSize = canvasContainer.getSize();
            FontLoadingSupport.canvasResizeController.setRequestedSize((byte) 126, containerSize.height, containerSize.width);
          }
          FontLoadingSupport.canvasResizeController.updateResize((byte) -126);
        }
        RankedListQuery.updateKeyboardStateForFrame(true);
        AccountCreationSupport.snapshotPointerInput((byte) -128);
        if (!BootstrapUiSupport.shouldShowBootstrapLoadingScreen(255) &&
            SpriteConstructionSupport.clientScreenStage != 11) {
          TextTemplateArgumentType.updateFullscreenDialogFrame(1);
        }
        if (null != CachedTextLayout.mouseWheelInput) {
          CachedTextLayout.wheelRotationSnapshot = CachedTextLayout.mouseWheelInput.drainWheelRotation(true);
        }
        if (InstrumentEnvelope.isSessionConnected(methodGuard ^ 19649)) {
          idleThresholdOrArchivePendingOrSequenceReady = 1200 * ClientTimingSupport.getConfiguredUpdateRate(true);
          if (this.forceIdleDisconnect ||
              !(idleThresholdOrArchivePendingOrSequenceReady >= IndexedSpriteState.getKeyboardIdleTicks(-76)) &&
                !(idleThresholdOrArchivePendingOrSequenceReady >= FullscreenSupport.getPointerIdleTicks(false))) {
            this.forceIdleDisconnect = false;
            Bzip2DecoderState.closeSessionSocket((byte) -115);
            ClientFlowState.requestSessionExit((byte) 81);
            TextInputValidator.handleLoginUiResponse((byte) 124, 2, MessageDialogSupport.idleMessage20MinText);
            BootstrapUiSupport.clearAchievementsTextWhenGuardAllows(-113);
            ArchiveLoadStep.loginRetrySuspended = true;
            DisplayNamePanel.connectionRetryDeadlineMillis = ClientClockSupport.correctedCurrentTimeMillis(-12520) + 15000L;
          }
        }
        if (DebouncedValidationProvider.archiveLoadStatus == -1 ||
              DebouncedValidationProvider.archiveLoadStatus == 0) {
          archiveWasPendingSnapshot = (-1 != DebouncedValidationProvider.archiveLoadStatus) ? 0 : 1;
          idleThresholdOrArchivePendingOrSequenceReadyPhase2 = archiveWasPendingSnapshot;
          DebouncedValidationProvider.archiveLoadStatus = DelayedIncomingPacket.tickArchiveLoading(15869);
          if (idleThresholdOrArchivePendingOrSequenceReadyPhase2 != 0 &&
              DebouncedValidationProvider.archiveLoadStatus == 0 &&
              11 == SpriteConstructionSupport.clientScreenStage &&
              !ClientTimingSupport.isClientReadyForSessionActions(73)) {
            IterableNodeHashTable.refreshLoginTicketMessage(-12618);
          }
          if (-1 != DebouncedValidationProvider.archiveLoadStatus &&
              DebouncedValidationProvider.archiveLoadStatus != 0) {
            DisplayNamePanel.connectionRetryDeadlineMillis = 15000L + ClientClockSupport.correctedCurrentTimeMillis(-12520);
          }
        }
        if (DebouncedValidationProvider.archiveLoadStatus != -1 &&
            DebouncedValidationProvider.archiveLoadStatus != 0) {
          if (VisualPropertyOverrides.clientBootstrapStage >= 10) {
            if (SpriteConstructionSupport.clientScreenStage >= 10) {
              ClientFlowState.requestSessionExit((byte) 114);
              if (DebouncedValidationProvider.archiveLoadStatus != 3) {
                if (4 != DebouncedValidationProvider.archiveLoadStatus) {
                  if (2 == DebouncedValidationProvider.archiveLoadStatus) {
                    TextInputValidator.handleLoginUiResponse((byte) 124, 256, DualLinkNode.js5ConnectFullErrorText);
                  } else {
                    if (DebouncedValidationProvider.archiveLoadStatus != 5) {
                      TextInputValidator.handleLoginUiResponse((byte) 124, 256, SessionTextHistorySupport.js5ConnectErrorText);
                    } else {
                      TextInputValidator.handleLoginUiResponse((byte) 124, 5, SocketConnector.loginGameUpdatedText);
                    }
                  }
                } else {
                  TextInputValidator.handleLoginUiResponse((byte) 124, 256, DialWidget.js5IoErrorText);
                }
              } else {
                TextInputValidator.handleLoginUiResponse((byte) 124, 256, LoginPanel.js5CrcErrorText);
              }
              ArchiveLoadStep.loginRetrySuspended = true;
            }
          } else {
            if (DebouncedValidationProvider.archiveLoadStatus != 3) {
              if (DebouncedValidationProvider.archiveLoadStatus != 4) {
                if (2 == DebouncedValidationProvider.archiveLoadStatus) {
                  this.showGameError((byte) 79, "js5connect_full");
                } else {
                  if (DebouncedValidationProvider.archiveLoadStatus != 5) {
                    this.showGameError((byte) 79, "js5connect");
                  } else {
                    this.showGameError((byte) 79, "outofdate");
                  }
                }
              } else {
                this.showGameError((byte) 79, "js5io");
              }
            } else {
              this.showGameError((byte) 79, "js5crc");
            }
          }
        }
        if ((DebouncedValidationProvider.archiveLoadStatus != -1 &&
                DebouncedValidationProvider.archiveLoadStatus != 0 ||
              ClientTimingSupport.isClientReadyForSessionActions(methodGuard - 19585)) &&
            DisplayNamePanel.connectionRetryDeadlineMillis <= ClientClockSupport.correctedCurrentTimeMillis(methodGuard - 32180)) {
          ArchiveLoadStep.loginRetrySuspended = false;
          if (-1 != DebouncedValidationProvider.archiveLoadStatus &&
              DebouncedValidationProvider.archiveLoadStatus != 0) {
            DebouncedValidationProvider.archiveLoadStatus = -1;
            SocialListEntry.resetArchiveConnectionFailures(-21754);
          }
        }
        if (DebouncedValidationProvider.archiveLoadStatus == 0 &&
            !ClientTimingSupport.isClientReadyForSessionActions(93)) {
          SessionInstanceState.sessionExitRequested = false;
        }
        if (VisualPropertyOverrides.clientBootstrapStage == 0 &&
            AchievementQuery.ensureArchiveCatalogLoaded(108)) {
          VisualPropertyOverrides.clientBootstrapStage = 1;
        }
        if (VisualPropertyOverrides.clientBootstrapStage == 1) {
          if (MeshPrioritySupport.bootstrapLanguageId != 0) {
            FadingDialog.interfaceTextArchive = SocketArchiveNetworkClient.createResourceArchive(TextLayoutLine.interfaceTextArchiveId, (byte) -62);
          }
          DirectByteStorage.initialCommonUiSpriteArchive = DisplayModeInfo.createBootstrapResourceArchive(DebouncedValidationProvider.commonUiSpriteArchiveId, (byte) -18, true, false, 1);
          AttachedEntityRenderer.initialUiFontArchive = DisplayModeInfo.createBootstrapResourceArchive(ArchiveRequest.uiFontArchiveId, (byte) -124, true, false, 1);
          DialRenderer.initialButtonAndLogoArchive = DisplayModeInfo.createBootstrapResourceArchive(ClientTimingSupport.buttonAndLogoArchiveId, (byte) -41, true, false, 1);
          SessionTextHistorySupport.basicUiGraphicsArchive = DirectByteStorage.initialCommonUiSpriteArchive;
          VisualPropertyOverrides.clientBootstrapStage = 2;
          RankedListQuery.basicUiFontArchive = AttachedEntityRenderer.initialUiFontArchive;
        }
        if (VisualPropertyOverrides.clientBootstrapStage == 2) {
          if (FadingDialog.interfaceTextArchive != null &&
              FadingDialog.interfaceTextArchive.ensureIndexLoaded(0)) {
            if (!FadingDialog.interfaceTextArchive.hasGroupName((byte) -116, "")) {
              FadingDialog.interfaceTextArchive = null;
            } else {
              if (FadingDialog.interfaceTextArchive.loadGroupByName("", (byte) -126)) {
                AccountWelcomePanel.loadInterfaceText((byte) 74, FadingDialog.interfaceTextArchive);
                FadingDialog.interfaceTextArchive = null;
                EntityContactSupport.resetFrameTimingHistory(-50);
              }
            }
          }
          if (null == FadingDialog.interfaceTextArchive) {
            VisualPropertyOverrides.clientBootstrapStage = 3;
          }
        }
        if (3 == VisualPropertyOverrides.clientBootstrapStage &&
            DelayedIncomingPacket.loadRequiredLoginUiGroups(DialRenderer.initialButtonAndLogoArchive, AttachedEntityRenderer.initialUiFontArchive, DirectByteStorage.initialCommonUiSpriteArchive, -11652) &&
            DisplayModeInfo.loadAllArchiveGroups((byte) -127, DialRenderer.initialButtonAndLogoArchive)) {
          LoginUiSupport.releaseAwtLoadingFonts((byte) -105);
          ConnectionHeaderSupport.evaluateConnectionHeaderGuard((byte) 120);
          ByteArrayPoolSupport.loadingStatusText = ArchiveSource.loadingText;
          AccountEligibilitySupport.loginReturnAllowed = false;
          CacheReference.initializeAccountUiResources((byte) 114, DialRenderer.initialButtonAndLogoArchive, FontLoadingSupport.memberAccountMode, AttachedEntityRenderer.initialUiFontArchive, DirectByteStorage.initialCommonUiSpriteArchive);
          if (LoginProtocolSupport.lockBootstrapLoginPanelActions ||
              SocketConnector.bootstrapLoginPanelMessage != null) {
            loginPanelGuardSnapshot = 2274;
            loginPanelMessageSnapshot = SocketConnector.bootstrapLoginPanelMessage;
            allowRetrySnapshot = !(LoginProtocolSupport.lockBootstrapLoginPanelActions);
            allowCancelSnapshot = !(LoginProtocolSupport.lockBootstrapLoginPanelActions);
            TextTemplateDefinition.showAccountLoginPanel(loginPanelGuardSnapshot, loginPanelMessageSnapshot, allowRetrySnapshot, allowCancelSnapshot);
          }
          if (AchievementSubmission.simpleUiMode) {
            ButtonWidget.requestJustPlay(83);
          }
          if (null == DelegatingCanvas.logoAudioMixerReference) {
            DelegatingCanvas.logoAudioMixerReference = LoginPayload.getSharedPcmMixer((byte) 72);
            ValidatedTextInputWidget.logoStartDelayMillis = GzipInflater.getLogoStartDelayMillis(110);
          }
          LogoPreparationSupport.prepareLogoAnimation(DialRenderer.initialButtonAndLogoArchive, ValidatedTextInputWidget.logoStartDelayMillis, 111, DelegatingCanvas.logoAudioMixerReference);
          DialRenderer.initialButtonAndLogoArchive = null;
          AttachedEntityRenderer.initialUiFontArchive = null;
          DirectByteStorage.initialCommonUiSpriteArchive = null;
          MeshMaterial.inspectAppletUsernameParameter((java.applet.Applet) (this), -82);
          EntityContactSupport.resetFrameTimingHistory(-69);
          VisualPropertyOverrides.clientBootstrapStage = 10;
        }
        if (10 == VisualPropertyOverrides.clientBootstrapStage) {
          if (MeshPrioritySupport.bootstrapLanguageId != 0) {
            TextValidationSupport.bootstrapGameTextArchive = SocketArchiveNetworkClient.createResourceArchive(TextWidgetSupport.gameTextArchiveId, (byte) -62);
          }
          VisualPropertyOverrides.clientBootstrapStage = 11;
        }
        bootstrapTextArchiveGate: {
          if (VisualPropertyOverrides.clientBootstrapStage == 11) {
            if (null != TextValidationSupport.bootstrapGameTextArchive && (!TextValidationSupport.bootstrapGameTextArchive.ensureIndexLoaded(0) ||
                !TextValidationSupport.bootstrapGameTextArchive.loadAllGroups(true))) {
              HighscoreNameEntry.setLoadingProgress(WidgetSkinState.formatArchiveLoadingProgress(LoginProtocolSupport.waitingForBootstrapText, 2147483647, CachedTextLayout.loadingBootstrapText, TextValidationSupport.bootstrapGameTextArchive), -2, 0.0f);
              break bootstrapTextArchiveGate;
            }
            AgeValidator.gameArchiveRequestPending = true;
            VisualPropertyOverrides.clientBootstrapStage = 12;
          }
        }
        if (methodGuard != 19660) {
          return;
        }
        if (VisualPropertyOverrides.clientBootstrapStage == 12 &&
            !AgeValidator.gameArchiveRequestPending) {
          VisualPropertyOverrides.clientBootstrapStage = 13;
        }
        if (VisualPropertyOverrides.clientBootstrapStage == 13) {
          idleThresholdOrArchivePendingOrSequenceReadyPhase3 = 1;
          if (null != TextTemplateLookupSupport.bootstrapArchiveLoadSequence) {
            bootstrapSequenceReadySnapshot = (!TextTemplateLookupSupport.bootstrapArchiveLoadSequence.pollLoaded(true)) ? 0 : 1;
            idleThresholdOrArchivePendingOrSequenceReadyPhase3 = bootstrapSequenceReadySnapshot;
            HighscoreNameEntry.setLoadingProgress(TextTemplateLookupSupport.bootstrapArchiveLoadSequence.statusText, -2, TextTemplateLookupSupport.bootstrapArchiveLoadSequence.scaledProgress);
          }
          if (idleThresholdOrArchivePendingOrSequenceReadyPhase3 != 0) {
            VisualPropertyOverrides.clientBootstrapStage = 20;
          }
        }
        if (!fullscreenActive &&
            EntityMotionSupport.canvasReplacementRequested) {
          EntitySpawnSupport.detachCanvasInputListeners(-2, MessageDialog.gameCanvas);
          this.rebuildGameCanvas(true);
          UsernameAvailabilityQuery.attachCanvasInputListeners(MessageDialog.gameCanvas, 57);
        }
        if (OpacityWidget.enabledSessionPacketOpcodes[8]) {
          ArchiveNetworkClient.sendReadyReflectionCheckReplies(-102);
        }
    }

    final void updateBootstrapUi(int methodGuard) {
        int discardedNormalUiResult = 0;
        int discardedFullscreenUiResult = 0;
        int clientControlFlowGuard;
        boolean suppressLoginHandshakeSnapshot = false;
        boolean fullscreenActiveSnapshot = false;
        clientControlFlowGuard = Geoblox.clientControlFlowFlag;
        if (!CacheReference.haveRequiredClientStages(-31456)) {
          if (VisualPropertyOverrides.clientBootstrapStage >= 10) {
            if (!OpacityWidget.isLogoAnimationComplete(7426)) {
              ValidationIconWidget.advanceLogoAnimationTick((byte) 88);
            } else {
              if (SpriteConstructionSupport.clientScreenStage != 0) {
                ByteStorage.pollAccountDialogUi(CachedTextLayout.wheelRotationSnapshot, (byte) -96);
              } else {
                discardedNormalUiResult = this.processAccountUiActions(false, false, -1);
              }
            }
          }
        } else {
          suppressLoginHandshakeSnapshot = false;
          fullscreenActiveSnapshot = !(InstrumentPatch.activeFullscreenCanvas == null);
          discardedFullscreenUiResult = this.processAccountUiActions(suppressLoginHandshakeSnapshot, fullscreenActiveSnapshot, -1);
        }
        if (methodGuard < 104) {
          this.handleSessionCookiePacket(80);
        }
    }

    public static void releaseSessionAppletResources(int methodGuard) {
        spaceMusicTrack = null;
        fullscreenText = null;
        if (methodGuard != 30344) {
            SessionGameApplet.createAchievementStateValues(-29);
        }
    }

    private final int processAccountUiActions(boolean suppressLoginHandshake, boolean fullscreenActive, int actionGuard) {
        try {
            Throwable caughtUiFailure = null;
            int uiAction = 0;
            int queryOrHandshakeResult = 0;
            Exception countryListFailureForReport = null;
            String countryListText = null;
            int clientControlFlowGuard = 0;
            String unusedNullCountryList = null;
            String unusedNullCountryListAfterFailure = null;
            Boolean emailAvailabilityResult = null;
            ByteArrayBuffer countryListBytes = null;
            int accountCreationResultCode;
            int loginHandshakeResultCode;
            clientControlFlowGuard = Geoblox.clientControlFlowFlag;
            uiAction = ClientProtocolStage.pollAccountUiAction(MeshPrioritySupport.bootstrapLanguageId, CachedTextLayout.wheelRotationSnapshot, fullscreenActive, (byte) -117);
            if (actionGuard == ~uiAction) {
              throw new IllegalStateException();
            }
            if (uiAction == 1) {
              queryOrHandshakeResult = ByteArrayBuffer.advanceAccountLookupRequest(AccountCreationForm.createActiveLoginLookupValue(actionGuard ^ -26), LoginPanel.createActiveEmailLookupValue((byte) -42), -121);
              if (queryOrHandshakeResult != -1) {
                UsernameResponseSupport.handleUsernameResponse(queryOrHandshakeResult, 6568, WidgetSkinState.pendingUsernameSuggestions, AudioService.sessionResponseText);
                AudioService.sessionResponseText = null;
                WidgetSkinState.pendingUsernameSuggestions = null;
              }
              emailAvailabilityResult = HotspotTextWidget.takePendingLoginBooleanReply((byte) 111);
              if (emailAvailabilityResult != null) {
                EmailAvailabilityValidator.completeActiveEmailAvailabilityQuery(actionGuard ^ 110, emailAvailabilityResult.booleanValue());
              }
            }
            if (uiAction == 2) {
              accountCreationResultCode = DiskCacheWorker.advanceAccountCreationRequest((byte) -94, ContextualRuntimeException.getActiveLoginPassword(true), CharacterReplacementSupport.getAccountAgeYears((byte) 81), this.affiliateId, UsernameSuggestionsPanel.getActiveEmailOrLoginIdentifier(100), ClientFlowToken.getActiveLoginIdentifier(0), DelayedPcmStream.getAccountNewsOptIn((byte) 27));
              if (accountCreationResultCode != -1) {
                StrongCacheReference.publishAccountUsernameResult(AudioService.sessionResponseText, accountCreationResultCode, (byte) 30, WidgetSkinState.pendingUsernameSuggestions);
                AudioService.sessionResponseText = null;
                WidgetSkinState.pendingUsernameSuggestions = null;
              }
            }
            if (uiAction == 3) {
              if (-1 != DebouncedValidationProvider.archiveLoadStatus &&
                  DebouncedValidationProvider.archiveLoadStatus != 0) {
                DebouncedValidationProvider.archiveLoadStatus = -1;
                SocialListEntry.resetArchiveConnectionFailures(-21754);
              }
              if (!suppressLoginHandshake) {
                loginHandshakeResultCode = LoginProtocolSupport.advanceLoginHandshake(false, ContextualRuntimeException.getActiveLoginPassword(true), this.affiliateId, this.isJagexCodeBase, ClientFlowToken.getActiveLoginIdentifier(~actionGuard), ~actionGuard);
                if (loginHandshakeResultCode != -1) {
                  if (loginHandshakeResultCode == 0) {
                    CheckboxWidget.errorReportLoginLongValue = ClientClockSupport.loginResponseLongValue;
                    IterableNodeHashTable.refreshLoginTicketMessage(-12618);
                    ProgressBarWidget.guestSessionMode = false;
                    SpriteConstructionSupport.clientScreenStage = 10;
                  } else {
                    TextInputValidator.handleLoginUiResponse((byte) 124, loginHandshakeResultCode, AudioService.sessionResponseText);
                    AudioService.sessionResponseText = null;
                  }
                }
              } else {
                ArchiveLoadStep.loginRetrySuspended = false;
              }
            }
            if (uiAction == 4) {
              if (!FontLoadingSupport.memberAccountMode) {
                ProgressBarWidget.guestSessionMode = true;
                SpriteConstructionSupport.clientScreenStage = 10;
              } else {
                BufferedSocket.clearSessionAndReload((byte) 116, NodeHashTableIterator.getActiveApplet(actionGuard ^ -122));
              }
            }
            if (5 == uiAction) {
              EntityCollisionSupport.openQuitPage(NodeHashTableIterator.getActiveApplet(120), 62);
            }
            if (uiAction == 6 &&
                AccountEligibilitySupport.loginReturnAllowed) {
              SpriteConstructionSupport.clientScreenStage = 10;
            }
            if (uiAction == 7) {
              TrackedPcmStream.navigateToServerListPage((byte) 114, NodeHashTableIterator.getActiveApplet(107));
            }
            if (uiAction == 8) {
              BufferedSocket.clearSessionAndReload((byte) 116, NodeHashTableIterator.getActiveApplet(119));
            }
            if (9 == uiAction) {
              RasterTargetSnapshot.navigateToSupportPage(NodeHashTableIterator.getActiveApplet(115), (byte) -91);
            }
            if (uiAction == 10) {
              CacheReference.outgoingSessionBuffer.writeCipherByte(17, (byte) -21);
            }
            if (uiAction == 11) {
              EmailAvailabilityQuery.navigateToReloadPage(NodeHashTableIterator.getActiveApplet(110), false);
            }
            if (uiAction == 12) {
              ArchiveLoadSequence.openRelativeUrlInNewWindow(NodeHashTableIterator.getActiveApplet(121), (byte) 117, EntityCollisionSupport.getSharedNavigationTarget(actionGuard ^ -241));
            }
            if (uiAction == 13) {
              try {
                if (null == EmailAvailabilityValidator.countryListDownloader) {
                  EmailAvailabilityValidator.countryListDownloader = new AsyncResourceDownloader(MenuScreen.platformTaskDispatcher, new java.net.URL(this.getCodeBase(), "countrylist.ws"), 5000);
                }
                if (EmailAvailabilityValidator.countryListDownloader.pollDownloadAttempts((byte) 45)) {
                  countryListBytes = EmailAvailabilityValidator.countryListDownloader.getDownloadedBuffer((byte) 91);
                  if (countryListBytes == null) {
                    unusedNullCountryList = (String) null;
                    SecondaryDeque.applyCountryListGuardSideEffect((byte) 69, (String) null);
                  } else {
                    countryListText = ByteTextDecodingSupport.decodeTextSlice(-46, countryListBytes.bytes, 0, countryListBytes.position);
                    SecondaryDeque.applyCountryListGuardSideEffect((byte) 69, countryListText);
                  }
                  EmailAvailabilityValidator.countryListDownloader = null;
                }
              } catch (java.lang.Exception countryListFailure) {
                caughtUiFailure = countryListFailure;
                countryListFailureForReport = (Exception) (Object) caughtUiFailure;
                IterableNodeHashTable.reportClientError((Throwable) ((Object) countryListFailureForReport), "S1", (byte) 125);
                unusedNullCountryListAfterFailure = (String) null;
                SecondaryDeque.applyCountryListGuardSideEffect((byte) 69, (String) null);
                EmailAvailabilityValidator.countryListDownloader = null;
              }
            }
            if (uiAction == 15) {
              SpriteConstructionSupport.clientScreenStage = 10;
            }
            if (16 == uiAction) {
              return 1;
            }
            if (uiAction != 17) {
              return 0;
            }
            return 2;
        } catch (RuntimeException | Error uncheckedUiFailure) {
            throw uncheckedUiFailure;
        } catch (Throwable checkedUiFailure) {
            throw new RuntimeException(checkedUiFailure);
        }
    }

    private final void enableIntRecordReplies(byte methodGuard) {
        OpacityWidget.enabledSessionPacketOpcodes[4] = true;
        int guardResidue = 10 % ((-61 - methodGuard) / 32);
    }

    private final void initializeFromAppletParameters(int canvasHeight, String gameName, int cacheIndexCount, byte methodGuard, int canvasWidth) {
        boolean isJagexHostSnapshot = false;
        RuntimeException initializationFailureBeforeContext = null;
        StringBuilder initializationMessagePrefix = null;
        String gameNameDescription = null;
        Throwable caughtInitializationFailure = null;
        String lowercaseServerHost = null;
        Exception initializationFailureForReport = null;
        RuntimeException initializationFailureForContext = null;
        String serverNumberParameter = null;
        String languageParameter = null;
        String affiliateParameter = null;
        String unusedNullErrorMessage = null;
        try {
          try {
            if (!this.isAppletStartupAllowed(false)) {
              return;
            }
            this.serverHost = this.getCodeBase().getHost();
            lowercaseServerHost = this.serverHost.toLowerCase();
            isJagexHostSnapshot = (lowercaseServerHost.equals("jagex.com")) || (lowercaseServerHost.endsWith(".jagex.com"));
            this.isJagexCodeBase = isJagexHostSnapshot;
            this.primaryServerPort = Integer.parseInt(this.getParameter("gameport1"));
            this.alternateServerPort = Integer.parseInt(this.getParameter("gameport2"));
            serverNumberParameter = this.getParameter("servernum");
            if (serverNumberParameter != null) {
              this.serverNumber = Integer.parseInt(serverNumberParameter);
            }
            this.gameCrc = Integer.parseInt(this.getParameter("gamecrc"));
            this.instanceId = Long.parseLong(this.getParameter("instanceid"));
            this.requestedMemberMode = this.getParameter("member").equals("yes");
            languageParameter = this.getParameter("lang");
            if (languageParameter != null) {
              this.languageId = Integer.parseInt(languageParameter);
            }
            if (this.languageId >= 5) {
              this.languageId = 0;
            }
            affiliateParameter = this.getParameter("affid");
            if (affiliateParameter != null) {
              this.affiliateId = Integer.parseInt(affiliateParameter);
            }
            AchievementSubmission.simpleUiMode = Boolean.valueOf(this.getParameter("simplemode")).booleanValue();
            this.startAppletServices(32, -14948, this.gameCrc, canvasHeight, canvasWidth, gameName, cacheIndexCount);
            if (methodGuard != 81) {
              this.initializeSessionAppletServices((byte) -103, -111, -55, -20, 80, false, -81, 86);
            }
          } catch (java.lang.Exception parameterInitializationFailure) {
            caughtInitializationFailure = parameterInitializationFailure;
            initializationFailureForReport = (Exception) (Object) caughtInitializationFailure;
            unusedNullErrorMessage = (String) null;
            IterableNodeHashTable.reportClientError((Throwable) ((Object) initializationFailureForReport), (String) null, (byte) 125);
            this.showGameError((byte) 79, "crash");
          }
          return;
        } catch (java.lang.RuntimeException initializationContextFailure) {
          caughtInitializationFailure = initializationContextFailure;
          initializationFailureForContext = (RuntimeException) (Object) caughtInitializationFailure;
          initializationFailureBeforeContext = initializationFailureForContext;
          initializationMessagePrefix = new StringBuilder().append("wf.UA(").append(canvasHeight).append(',');
          if (gameName == null) {
            gameNameDescription = "null";
          } else {
            gameNameDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) initializationFailureBeforeContext), ((StringBuilder) (Object) initializationMessagePrefix).append(gameNameDescription).append(',').append(cacheIndexCount).append(',').append(methodGuard).append(',').append(canvasWidth).append(')').toString());
        }
    }

    final static int[] createAchievementStateValues(int methodGuard) {
        if (methodGuard < 81) {
            uiAccentPaletteIndex = -43;
        }
        return new int[8];
    }

    final void dispatchSessionPacket(int methodGuard) {
        boolean useTextTemplate = false;
        int packetOpcode;
        ReceivedTextRecord receivedRecord;
        int clientControlFlowGuard;
        clientControlFlowGuard = Geoblox.clientControlFlowFlag;
        if (methodGuard < 119) {
          this.requestedMemberMode = true;
        }
        packetOpcode = ScorePopup.currentPacketOpcode;
        if (packetOpcode < 64 &&
            OpacityWidget.enabledSessionPacketOpcodes[packetOpcode]) {
          if (packetOpcode == 0) {
            return;
          }
          if (packetOpcode == 1) {
            MatchScoringSupport.handleByteShortReply(-1073741824);
          } else {
            if (packetOpcode == 2) {
              NanoFrameTimer.handleRankingResponse(-24839);
            } else {
              if (3 == packetOpcode) {
                AchievementProtocolSupport.handleAchievementResponse(119);
              } else {
                if (packetOpcode != 4) {
                  if (5 == packetOpcode) {
                    ClientFlowToken.handleSessionAcknowledgement(26146);
                  } else {
                    if (packetOpcode == 6) {
                      DelegatingCanvas.handleRankedListResponse(2);
                    } else {
                      if (packetOpcode != 7) {
                        if (8 == packetOpcode) {
                          GameplaySetupSupport.readReflectionCheckRequest(-4, MenuScreen.platformTaskDispatcher, AchievementSubmission.sessionPacketPayloadLength, LogoCompositor.sessionPacketBuffer);
                        } else {
                          if (packetOpcode == 16) {
                            DualLinkNode.readSessionNameAndNormalize(1);
                          } else {
                            if (11 != packetOpcode &&
                                12 != packetOpcode) {
                              if (packetOpcode == 13) {
                                HighscoreNameEntry.handleSocialListResponse((byte) 104);
                                return;
                              }
                              if (17 == packetOpcode) {
                                this.handleOpenUrlPacket((byte) 12);
                                return;
                              }
                              if (packetOpcode == 18) {
                                UsernameQueryState.handleSessionFlagReset(11560);
                                return;
                              }
                              IterableNodeHashTable.reportClientError((Throwable) null, "MGS1: " + TextTemplateDefinition.formatSessionPacketDiagnostic(55), (byte) 125);
                              Bzip2DecoderState.closeSessionSocket((byte) -122);
                              return;
                            }
                            useTextTemplate = !(packetOpcode != 12);
                            receivedRecord = LogoPreparationSupport.readSessionTextRecord(useTextTemplate, 128);
                            Under13TermsPanel.retainReceivedTextRecordIfNew(receivedRecord, 0);
                          }
                        }
                      } else {
                        this.handleSessionCookiePacket(-11);
                      }
                    }
                  }
                } else {
                  LoginPanel.handleIntRecordReply(-103);
                }
              }
            }
          }
          return;
        }
        IterableNodeHashTable.reportClientError((Throwable) null, "MGS2: " + TextTemplateDefinition.formatSessionPacketDiagnostic(55), (byte) 125);
        Bzip2DecoderState.closeSessionSocket((byte) -118);
    }

    private final void handleOpenUrlPacket(byte methodGuard) {
        int urlHeaderByte = LogoCompositor.sessionPacketBuffer.readUnsignedByte((byte) 34);
        int navigationFlagInt = (urlHeaderByte & 1) != 0 ? 1 : 0;
        if (methodGuard != 12) {
            this.updateBootstrapUi(106);
        }
        int urlByteCount = -1 + AchievementSubmission.sessionPacketPayloadLength;
        byte[] cipheredUrlBytes = new byte[urlByteCount];
        LogoCompositor.sessionPacketBuffer.readCipherBytes(96, 0, cipheredUrlBytes, urlByteCount);
        LimitedRandomAccessFile.openUrlInNewWindow(EmailValidator.decodeTextBytes(1, cipheredUrlBytes), (byte) -128, navigationFlagInt != 0, NodeHashTableIterator.getActiveApplet(112));
    }

    private final void enableScoreReplies(int methodGuard) {
        OpacityWidget.enabledSessionPacketOpcodes[2] = true;
        if (methodGuard != 16072) {
            SessionGameApplet.releaseSessionAppletResources(124);
        }
    }

    private final void setSessionAcknowledgementsEnabled(boolean enabled) {
        OpacityWidget.enabledSessionPacketOpcodes[5] = enabled;
    }

    private final void enableByteShortReplies(byte methodGuard) {
        if (methodGuard != 32) {
            this.languageId = 72;
        }
        OpacityWidget.enabledSessionPacketOpcodes[1] = true;
    }

    final void requestIdleDisconnect(byte methodGuard) {
        this.forceIdleDisconnect = true;
        int guardResidue = -21 / ((-82 - methodGuard) / 37);
    }

    final int processAccountUiActionsWithoutLogin(boolean fullscreenActive, int methodGuard) {
        if (methodGuard != -17978) {
            this.initializeSessionPacketLengths(-61);
        }
        return this.processAccountUiActions(true, fullscreenActive, -1);
    }

    protected SessionGameApplet() {
    }

    static {
        fullscreenText = "Fullscreen";
    }
}
