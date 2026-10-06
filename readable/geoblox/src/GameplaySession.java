/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GameplaySession {
    float boardAngleRadians;
    boolean connectivityRebuiltThisTick;
    boolean tutorialMode;
    private StringBuilder scoreText;
    int boardMaskOffsetX;
    int boardMaskOffsetY;
    private boolean boardEmptyAtResultStart;
    private boolean debugSpawnSpecialKinds;
    boolean tutorialPromptActive;
    private boolean debugPointerSpawnEnabled;
    int pointsPanelX;
    boolean spawnReleaseDisabled;
    private int delayedActionCountdown;
    int resultBonusPoints;
    static volatile int pointerIdleTicks;
    private boolean debugReducedRendering;
    private int debugSpawnVariantId;
    boolean submissionBlocked;
    int updateTick;
    private int tutorialProgressMetric;
    int score;
    private boolean showDebugOverview;
    private int pointsPanelFrameDirection;
    boolean sessionEnding;
    private boolean tutorialAdvanceRequested;
    private boolean preserveScoreOnTransition;
    int pointsPanelSlideDirection;
    private int debugSpawnCategoryId;
    private boolean boardClearBonusEligible;
    private int tutorialStepPhase;
    static int[] decodedSpriteXOffsets;
    private Geoblox gameApplet;
    private int tutorialStepId;
    static String archiveHost;
    private boolean showSessionCounters;
    private boolean sceneTransitionInProgress;
    private int pointsPanelFrameIndex;
    private int pendingPopupPoints;
    private StringBuilder popupPointsText;
    private int resultCompletionTickOffset;
    private int resultPanelX;
    boolean sceneTransitionRequested;
    private int sceneAnimationTick;
    private boolean rotationControlsSwapped;
    private boolean matchBatchProcessedThisTick;
    private boolean showGameOverOverlay;
    boolean boardRasterDirty;
    private PcmSampleStream resultExpansionAudioStream;
    int newActionCount;
    private int resultSequenceCountdown;
    private boolean boundaryCheckRequested;
    private int endingEntityRadius;
    int sessionPhase;

    private final void leaveTutorial(int methodGuard) {
        this.tutorialMode = false;
        this.sceneTransitionRequested = true;
        if (methodGuard != 7000) {
            this.boardEmptyAtResultStart = true;
        }
        this.preserveScoreOnTransition = false;
        this.tutorialPromptActive = false;
    }

    private final void renderTutorialPrompt(int lineSpacingOffset) {
        int lineSpacing;
        int promptWidthThenButtonX;
        int promptHeight;
        int promptTop;
        int clientControlFlowGuard;
        String promptText;
        clientControlFlowGuard = Geoblox.clientControlFlowFlag;
        if (0 != this.tutorialStepPhase) {
          return;
        }
        tutorialPromptPlacement: {
          promptText = UsernameAvailabilityValidator.tutorialMessageForStep(this.tutorialStepId, 24146);
          lineSpacing = IntrusiveNodeHashTable.smallFont.maxAscent - IntrusiveNodeHashTable.smallFont.maxDescent + lineSpacingOffset;
          promptWidthThenButtonX = 460;
          promptHeight = 30 + IntrusiveNodeHashTable.smallFont.countWrappedLines(promptText, promptWidthThenButtonX) * lineSpacing;
          promptTop = 300;
          if (this.tutorialStepId == 0) {
            promptTop = 232;
            if (clientControlFlowGuard == 0) {
              break tutorialPromptPlacement;
            }
          }
          if (this.tutorialStepId != 3) {
            if (1 == this.tutorialStepId) {
              promptTop = 280;
              if (clientControlFlowGuard != 0) {
                promptTop = 270;
              }
            }
          } else {
            promptTop = 270;
          }
        }
        tutorialPromptButtonRendering: {
          DelayedIncomingPacket.drawNineSlicePanel(promptTop, 70, 10 + promptHeight, (byte) -92, 500, GameGraphicsResources.frameNineSliceSprites);
          IntrusiveNodeHashTable.smallFont.drawParagraph(promptText, 95, 15 + promptTop, promptWidthThenButtonX, 300, 1, -1, 0, 0, lineSpacing);
          if (this.tutorialStepId == 5) {
            if (PrefixCodeDecoder.pointerXSnapshot > 100 &&
                PrefixCodeDecoder.pointerXSnapshot < 340 &&
                PcmResampler.pointerYSnapshot > 440 &&
                PcmResampler.pointerYSnapshot < 476) {
              FadingDialog.uiPaletteFont.colorPalettes[0][SessionGameApplet.uiAccentPaletteIndex] = 15488514;
            }
            DelayedIncomingPacket.drawNineSlicePanel(440, 100, 36, (byte) -92, 240, ArchiveLoadSequence.mouseBoxFrames);
            FadingDialog.uiPaletteFont.drawCenteredText(AgeValidator.restartTutorialText, 220, 468, 0, -1);
            FadingDialog.uiPaletteFont.colorPalettes[0][SessionGameApplet.uiAccentPaletteIndex] = 16689938;
            DelayedIncomingPacket.drawNineSlicePanel(440, 380, 36, (byte) -92, 160, ArchiveLoadSequence.mouseBoxFrames);
            if (380 < PrefixCodeDecoder.pointerXSnapshot &&
                540 > PrefixCodeDecoder.pointerXSnapshot &&
                PcmResampler.pointerYSnapshot > 440 &&
                476 > PcmResampler.pointerYSnapshot) {
              FadingDialog.uiPaletteFont.colorPalettes[0][SessionGameApplet.uiAccentPaletteIndex] = 15488514;
            }
            FadingDialog.uiPaletteFont.drawCenteredText(TextPairLoginPayload.startGameText, promptWidthThenButtonX, 468, 0, -1);
            FadingDialog.uiPaletteFont.colorPalettes[0][SessionGameApplet.uiAccentPaletteIndex] = 16689938;
            if (clientControlFlowGuard == 0) {
              break tutorialPromptButtonRendering;
            }
          }
          DelayedIncomingPacket.drawNineSlicePanel(440, 240, 36, (byte) -92, 160, ArchiveLoadSequence.mouseBoxFrames);
          if (250 < PrefixCodeDecoder.pointerXSnapshot &&
              PrefixCodeDecoder.pointerXSnapshot < 389 &&
              PcmResampler.pointerYSnapshot > 440 &&
              476 > PcmResampler.pointerYSnapshot) {
            FadingDialog.uiPaletteFont.colorPalettes[0][SessionGameApplet.uiAccentPaletteIndex] = 15488514;
          }
          FadingDialog.uiPaletteFont.drawCenteredText(VisualPropertyOverrides.continueText, 320, 468, 0, -1);
          FadingDialog.uiPaletteFont.colorPalettes[0][SessionGameApplet.uiAccentPaletteIndex] = 16689938;
        }
    }

    final static boolean tryOpenUrlWithWindowsShell(String url, boolean methodGuard) {
        String allowedUrlCharacters = null;
        Exception urlLaunchException = null;
        RuntimeException urlLaunchFailure = null;
        int urlCharacterIndex = 0;
        int clientControlFlowGuard = 0;
        int allowedCharacterIndexOrSuccessFlag = 0;
        RuntimeException failureContextCause = null;
        StringBuilder failureContextBuilder = null;
        String urlContextDescription = null;
        Throwable caughtThrowable = null;
        clientControlFlowGuard = Geoblox.clientControlFlowFlag;
        try {
          try {
            if (!PlatformTaskDispatcher.osNameLowerCase.startsWith("win")) {
              return false;
            }
            if (methodGuard) {
              return true;
            }
            if (!url.startsWith("http://") &&
                !url.startsWith("https://")) {
              return false;
            }
            allowedUrlCharacters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
            urlCharacterIndex = 0;
            while (true) {
              if (!(url.length() > urlCharacterIndex)) {
                Runtime.getRuntime().exec("cmd /c start \"j\" \"" + url + "\"");
                allowedCharacterIndexOrSuccessFlag = 1;
                break;
              }
              allowedCharacterIndexOrSuccessFlag = allowedUrlCharacters.indexOf((int) url.charAt(urlCharacterIndex));
              if (clientControlFlowGuard == 0) {
                if (allowedCharacterIndexOrSuccessFlag == -1) {
                  return false;
                }
                urlCharacterIndex++;
                continue;
              }
              break;
            }
            return allowedCharacterIndexOrSuccessFlag != 0;
          } catch (java.lang.Exception caughtLaunchException) {
            caughtThrowable = caughtLaunchException;
            urlLaunchException = (Exception) (Object) caughtThrowable;
            return false;
          }
        } catch (java.lang.RuntimeException caughtFailure) {
          caughtThrowable = caughtFailure;
          urlLaunchFailure = (RuntimeException) (Object) caughtThrowable;
          failureContextCause = urlLaunchFailure;
          failureContextBuilder = new StringBuilder().append("gh.U(");
          if (url == null) {
            urlContextDescription = "null";
          } else {
            urlContextDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) failureContextCause), ((StringBuilder) (Object) failureContextBuilder).append(urlContextDescription).append(',').append(methodGuard).append(')').toString());
        }
    }

    final void renderSession(byte methodGuard) {
        int selectedSceneTransitionFlag = 0;
        int minimumGrayLevelOrCompositeHeight = 0;
        int grayLevelForComparisonOrCompositeEnabled = 0;
        String themeResourceGroup = null;
        int sceneTransitionFlag = 0;
        int selectedThemeIdOrScoreBoxX = 0;
        String graphicsLoadingMessage = null;
        int loadingPanelWidthOrScoreBoxY = 0;
        float gameOverAnimationProgress = 0.0f;
        int tutorialTopOrDebugColorOrTransitionClipTop = 0;
        float gameOverAnimationRemainder = 0.0f;
        int tutorialLineHeightOrDebugEntityRadius = 0;
        float gameOverAnimationRemainderSquared = 0.0f;
        int tutorialPanelWidth = 0;
        IntrusiveDeque debugEntityQueue = null;
        int tutorialTextHeightOrDebugPanelTop = 0;
        GameplayEntity renderedEntity = null;
        float entityOffsetX = 0.0f;
        int debugTutorialLineHeight = 0;
        float entityOffsetY = 0.0f;
        int debugTutorialPanelWidth = 0;
        int debugEntityXOrTutorialTextHeight = 0;
        int renderedEntityY = 0;
        int spawnEntityGrayLevel = 0;
        int clientControlFlowGuard = 0;
        IntrusiveDeque debugSpawnQueueSnapshot = null;
        IntrusiveDeque debugMovingQueueSnapshot = null;
        clientControlFlowGuard = Geoblox.clientControlFlowFlag;
        if (!GameGraphicsResources.themesLoaded[GameScreen.selectedThemeId]) {
          selectedThemeIdOrScoreBoxX = GameScreen.selectedThemeId;
          switch ((clientControlFlowGuard == 0
              || selectedThemeIdOrScoreBoxX == 0
              || selectedThemeIdOrScoreBoxX == 2
            ) ? selectedThemeIdOrScoreBoxX : -1) {
            case 4:
              themeResourceGroup = "baking";
              if (clientControlFlowGuard == 0) {
                break;
              }
            case 6:
              themeResourceGroup = "space";
              if (clientControlFlowGuard == 0) {
                break;
              }
            case 5:
              themeResourceGroup = "sports";
              if (clientControlFlowGuard == 0) {
                break;
              }
            case 0:
              themeResourceGroup = "jewels";
              if (clientControlFlowGuard == 0) {
                break;
              }
            case 3:
              themeResourceGroup = "germs";
              if (clientControlFlowGuard == 0) {
                break;
              }
            case 2:
              themeResourceGroup = "sweets";
              if (clientControlFlowGuard == 0) {
                break;
              }
            default:
              themeResourceGroup = "";
          }
          graphicsLoadingMessage = EntityCollisionSupport.formatArchiveGroupProgress(TextWidgetRenderer.waitingForGraphicsText, GameGraphicsResources.gameGraphicsArchive, themeResourceGroup, AccountWelcomePanel.loadingGraphicsText, true);
          loadingPanelWidthOrScoreBoxY = 30 + FadingDialog.uiPaletteFont.measureTextWidth(graphicsLoadingMessage);
          DelayedIncomingPacket.drawNineSlicePanel(215, 320 - loadingPanelWidthOrScoreBoxY / 2, 50, (byte) -92, loadingPanelWidthOrScoreBoxY, GameGraphicsResources.frameNineSliceSprites);
          FadingDialog.uiPaletteFont.drawCenteredText(graphicsLoadingMessage, 320, 250, 0, -1);
          return;
        }
        if (EntityContactSupport.areEntityQueuesSettled(0) &&
            this.sceneTransitionRequested &&
            this.sceneTransitionInProgress) {
          selectedSceneTransitionFlag = 1;
        } else {
          selectedSceneTransitionFlag = 0;
        }
        boardRasterPreparation: {
          sceneTransitionFlag = selectedSceneTransitionFlag;
          if (sceneTransitionFlag == 0) {
            if (!this.boardRasterDirty) {
              SpriteCheckboxRenderer.boardSceneRaster.setAsRasterTarget();
              if (this.debugReducedRendering) {
                break boardRasterPreparation;
              }
              StrongCacheReference.drawSpecialAttachedEntities((byte) -63);
              if (clientControlFlowGuard == 0) {
                break boardRasterPreparation;
              }
            }
            SpriteCheckboxRenderer.boardSceneRaster.setAsRasterTarget();
            SoftwareRasterizer.clearFramebuffer();
            if (!this.debugReducedRendering) {
              AttachedEntityRenderer.drawAttachedEntities(7838);
            }
            NodeHashTableIterator.markInsetZeroOutlinePixels(10, 90, 460, -27085, 460);
            this.boardRasterDirty = false;
          }
        }
        SingleChildWidget.mainRasterBuffer.setAsRasterTarget(255);
        SpawnQuotaSupport.selectedThemeBackground.drawRunEncoded(0, 0);
        selectedThemeIdOrScoreBoxX = 4;
        loadingPanelWidthOrScoreBoxY = 4;
        if (methodGuard >= -28) {
          this.updateSession(-63);
        }
        if (this.showGameOverOverlay) {
          if (this.sceneAnimationTick <= 266) {
            gameOverAnimationProgress = (float)this.sceneAnimationTick / 266.0f;
            gameOverAnimationRemainder = -gameOverAnimationProgress + 1.0f;
            gameOverAnimationRemainderSquared = gameOverAnimationRemainder * gameOverAnimationRemainder;
            selectedThemeIdOrScoreBoxX = (int)(0.5f + (70.0f * (2.0f * gameOverAnimationProgress * gameOverAnimationRemainder) + 10.0f * gameOverAnimationRemainderSquared + 220.0f * (gameOverAnimationProgress * gameOverAnimationProgress)));
            loadingPanelWidthOrScoreBoxY = (int)(170.0f * (gameOverAnimationProgress * gameOverAnimationProgress) + (gameOverAnimationRemainderSquared * 10.0f + 140.0f * (gameOverAnimationProgress * 2.0f * gameOverAnimationRemainder)) + 0.5f);
            if (clientControlFlowGuard != 0) {
              selectedThemeIdOrScoreBoxX = 220;
              loadingPanelWidthOrScoreBoxY = 170;
            }
          } else {
            selectedThemeIdOrScoreBoxX = 220;
            loadingPanelWidthOrScoreBoxY = 170;
          }
        }
        tutorialOrCountBoxRendering: {
          if (this.tutorialMode) {
            tutorialTopOrDebugColorOrTransitionClipTop = 176 - this.updateTick / 2;
            if (10 > tutorialTopOrDebugColorOrTransitionClipTop) {
              tutorialTopOrDebugColorOrTransitionClipTop = 10;
            }
            tutorialLineHeightOrDebugEntityRadius = -IntrusiveNodeHashTable.smallFont.maxDescent + IntrusiveNodeHashTable.smallFont.maxAscent;
            tutorialPanelWidth = IntrusiveNodeHashTable.smallFont.measureMaximumWrappedWidth(CanvasResizeController.tutorialSkipMessage, 640) + 40;
            tutorialTextHeightOrDebugPanelTop = IntrusiveNodeHashTable.smallFont.countWrappedLines(CanvasResizeController.tutorialSkipMessage, 640) * tutorialLineHeightOrDebugEntityRadius + 10;
            DelayedIncomingPacket.drawNineSlicePanel(tutorialTopOrDebugColorOrTransitionClipTop, -(tutorialPanelWidth / 2) + 320, 20 + tutorialTextHeightOrDebugPanelTop, (byte) -92, tutorialPanelWidth, GameGraphicsResources.frameNineSliceSprites);
            IntrusiveNodeHashTable.smallFont.drawCenteredText(CanvasResizeController.tutorialSkipMessage, 320, tutorialTopOrDebugColorOrTransitionClipTop + 28, 1, -1);
            IntrusiveNodeHashTable.smallFont.drawCenteredText(CanvasResizeController.tutorialSkipMessage, 319, 28 + tutorialTopOrDebugColorOrTransitionClipTop, 1, -1);
            if (clientControlFlowGuard == 0) {
              break tutorialOrCountBoxRendering;
            }
          }
          PointerMenuState.smallBoxSprite.draw(selectedThemeIdOrScoreBoxX, loadingPanelWidthOrScoreBoxY);
          if (0 != this.sessionPhase ||
              EntityContactSupport.areEntityQueuesSettled(0)) {
            UsernameSuggestionsPanel.largeBoxSprite.draw(446, 410);
            if (clientControlFlowGuard != 0) {
              PasswordValidator.countBoxSprite.draw(468, 410);
            }
          } else {
            PasswordValidator.countBoxSprite.draw(468, 410);
          }
        }
        if (!this.tutorialMode) {
          if (!EntityContactSupport.areEntityQueuesSettled(0) ||
              sceneTransitionFlag != 0 &&
                (0 == this.sessionPhase ||
                this.sessionPhase == 1)) {
            this.renderProgressHud(-46);
          }
        }
        if (!this.debugReducedRendering) {
          EmailAvailabilityQuery.drawMovingEntities(-1);
        }
        if (!this.debugReducedRendering &&
            sceneTransitionFlag == 0) {
          SpriteCheckboxRenderer.boardSceneRaster.draw(0, 0);
        }
        FullscreenErrorDialog.drawAvatarFaceOrCryFrame((byte) 18);
        if (!this.debugReducedRendering) {
          MessageDialogContent.drawTransientEntities(484842465);
        }
        MultiHandleSliderRenderer.rotatedThemeForegroundRaster.setAsRasterTarget();
        SoftwareRasterizer.clearFramebuffer();
        MatchScoringSupport.selectedThemeForeground.rotateNearest(MatchScoringSupport.selectedThemeForeground.fullWidth << 3, MatchScoringSupport.selectedThemeForeground.fullHeight << 3, MultiHandleSliderRenderer.rotatedThemeForegroundRaster.fullWidth << 3, MultiHandleSliderRenderer.rotatedThemeForegroundRaster.fullHeight << 3, (int)(65535.0 * ((double)(-this.boardAngleRadians) / 6.283185307179586)), 4096);
        SingleChildWidget.mainRasterBuffer.setAsRasterTarget(255);
        SessionSocketSupport.drawSpriteIntoEmptyDestination(MultiHandleSliderRenderer.rotatedThemeForegroundRaster, -(MultiHandleSliderRenderer.rotatedThemeForegroundRaster.fullWidth >> 1) + 320, -(MultiHandleSliderRenderer.rotatedThemeForegroundRaster.fullHeight >> 1) + 240);
        if (!this.debugReducedRendering) {
          PasswordWidgetRenderer.drawSpawnQueueAndHighlight(4740);
        }
        if (this.showDebugOverview) {
          CacheFileState.debugOverviewRaster.setAsRasterTarget();
          SoftwareRasterizer.fillRectangle(0, 0, SoftwareRasterizer.stride, SoftwareRasterizer.framebufferHeight, 1118481);
          tutorialTopOrDebugColorOrTransitionClipTop = 16777215;
          SoftwareRasterizer.drawCircle(160, 120, 115, 16711680);
          tutorialLineHeightOrDebugEntityRadius = 20;
          debugSpawnQueueSnapshot = SecondaryDeque.spawnQueue;
          renderedEntity = (GameplayEntity) ((Object) debugSpawnQueueSnapshot.lastForIteration(false));
          while (true) {
            if (renderedEntity != null) {
              entityOffsetX = -320.0f + renderedEntity.positionX;
              entityOffsetY = -240.0f + renderedEntity.positionY;
              debugEntityXOrTutorialTextHeight = (int)(320.0 + (Math.cos((double)UiWidget.gameplaySession.boardAngleRadians) * (double)entityOffsetX - Math.sin((double)UiWidget.gameplaySession.boardAngleRadians) * (double)entityOffsetY));
              renderedEntityY = (int)(240.0 + ((double)entityOffsetX * Math.sin((double)UiWidget.gameplaySession.boardAngleRadians) + (double)entityOffsetY * Math.cos((double)UiWidget.gameplaySession.boardAngleRadians)));
              spawnEntityGrayLevel = 255 - renderedEntity.remainingLifetimeTicks * 255 / renderedEntity.initialLifetimeTicks;
              minimumGrayLevelOrCompositeHeight = 11;
              grayLevelForComparisonOrCompositeEnabled = spawnEntityGrayLevel;
              if (clientControlFlowGuard == 0) {
                if (minimumGrayLevelOrCompositeHeight > grayLevelForComparisonOrCompositeEnabled) {
                  spawnEntityGrayLevel = 11;
                }
                if (spawnEntityGrayLevel > 255) {
                  spawnEntityGrayLevel = 255;
                }
                SoftwareRasterizer.fillCircle(debugEntityXOrTutorialTextHeight / 2, renderedEntityY / 2, tutorialLineHeightOrDebugEntityRadius, spawnEntityGrayLevel << 8 | spawnEntityGrayLevel << 16 | spawnEntityGrayLevel);
                renderedEntity = (GameplayEntity) ((Object) debugSpawnQueueSnapshot.previousForIteration(0));
                continue;
              }
            } else {
              debugMovingQueueSnapshot = ArchiveNetworkClient.movingEntities;
              debugEntityQueue = debugMovingQueueSnapshot;
              renderedEntity = (GameplayEntity) ((Object) debugMovingQueueSnapshot.firstForIteration(0));
              do {
                if (null == renderedEntity) {
                  debugEntityQueue = BoardEntityState.attachedEntities;
                  break;
                }
                entityOffsetX = -320.0f + renderedEntity.positionX;
                entityOffsetY = -240.0f + renderedEntity.positionY;
                debugEntityXOrTutorialTextHeight = (int)(Math.cos((double)UiWidget.gameplaySession.boardAngleRadians) * (double)entityOffsetX - Math.sin((double)UiWidget.gameplaySession.boardAngleRadians) * (double)entityOffsetY + 320.0);
                renderedEntityY = (int)(240.0 + ((double)entityOffsetX * Math.sin((double)UiWidget.gameplaySession.boardAngleRadians) + (double)entityOffsetY * Math.cos((double)UiWidget.gameplaySession.boardAngleRadians)));
                SoftwareRasterizer.fillCircle(debugEntityXOrTutorialTextHeight / 2, renderedEntityY / 2, tutorialLineHeightOrDebugEntityRadius, tutorialTopOrDebugColorOrTransitionClipTop);
                renderedEntity = (GameplayEntity) ((Object) debugMovingQueueSnapshot.nextForIteration(1));
              } while (clientControlFlowGuard == 0);
              renderedEntity = (GameplayEntity) ((Object) debugEntityQueue.firstForIteration(0));
              do {
                if (renderedEntity == null) {
                  debugEntityQueue = DelegatingCanvas.transientEntities;
                  break;
                }
                SoftwareRasterizer.fillCircle((int)(renderedEntity.positionX / 2.0f), (int)(renderedEntity.positionY / 2.0f), tutorialLineHeightOrDebugEntityRadius, tutorialTopOrDebugColorOrTransitionClipTop);
                renderedEntity = (GameplayEntity) ((Object) debugEntityQueue.nextForIteration(1));
              } while (clientControlFlowGuard == 0);
              renderedEntity = (GameplayEntity) ((Object) debugEntityQueue.firstForIteration(0));
              debugCounterPanelSelection: while (true) {
                if (renderedEntity != null) {
                  SoftwareRasterizer.fillCircle((int)(renderedEntity.positionX / 2.0f), (int)(renderedEntity.positionY / 2.0f), tutorialLineHeightOrDebugEntityRadius, tutorialTopOrDebugColorOrTransitionClipTop);
                  renderedEntity = (GameplayEntity) ((Object) debugEntityQueue.nextForIteration(1));
                  if (clientControlFlowGuard == 0) {
                    continue;
                  }
                } else {
                  if (this.tutorialMode) {
                    tutorialTextHeightOrDebugPanelTop = -(this.updateTick / 2) + 176;
                    if (tutorialTextHeightOrDebugPanelTop < 10) {
                      tutorialTextHeightOrDebugPanelTop = 10;
                    }
                    debugTutorialLineHeight = IntrusiveNodeHashTable.smallFont.maxAscent - IntrusiveNodeHashTable.smallFont.maxDescent;
                    debugTutorialPanelWidth = IntrusiveNodeHashTable.smallFont.measureMaximumWrappedWidth(CanvasResizeController.tutorialSkipMessage, 640) + 40;
                    debugEntityXOrTutorialTextHeight = IntrusiveNodeHashTable.smallFont.countWrappedLines(CanvasResizeController.tutorialSkipMessage, 640) * debugTutorialLineHeight + 10;
                    SoftwareRasterizer.fillRectangle((320 - debugTutorialPanelWidth / 2) / 2, tutorialTextHeightOrDebugPanelTop / 2, debugTutorialPanelWidth / 2, (20 + debugEntityXOrTutorialTextHeight) / 2, tutorialTopOrDebugColorOrTransitionClipTop);
                    break debugCounterPanelSelection;
                  }
                  PointerMenuState.smallBoxSprite.drawScaledSilhouette(selectedThemeIdOrScoreBoxX / 2, loadingPanelWidthOrScoreBoxY / 2, PointerMenuState.smallBoxSprite.fullWidth / 2, PointerMenuState.smallBoxSprite.fullHeight / 2, tutorialTopOrDebugColorOrTransitionClipTop);
                }
                if (this.sessionPhase == 0 &&
                    !EntityContactSupport.areEntityQueuesSettled(0)) {
                  PasswordValidator.countBoxSprite.drawScaledSilhouette(234, 205, PasswordValidator.countBoxSprite.fullWidth / 2, PasswordValidator.countBoxSprite.fullHeight / 2, tutorialTopOrDebugColorOrTransitionClipTop);
                  if (clientControlFlowGuard == 0) {
                    break debugCounterPanelSelection;
                  }
                }
                UsernameSuggestionsPanel.largeBoxSprite.drawScaledSilhouette(223, 205, UsernameSuggestionsPanel.largeBoxSprite.fullWidth / 2, UsernameSuggestionsPanel.largeBoxSprite.fullHeight / 2, tutorialTopOrDebugColorOrTransitionClipTop);
                break;
              }
              SoftwareRasterizer.fillCircle(160, 120, 21, 16777215);
              SoftwareRasterizer.blurRasterRegion(2, 2, 0, 0, SoftwareRasterizer.stride, SoftwareRasterizer.framebufferHeight);
              SingleChildWidget.mainRasterBuffer.setAsRasterTarget(255);
              minimumGrayLevelOrCompositeHeight = SoftwareRasterizer.framebufferHeight;
              grayLevelForComparisonOrCompositeEnabled = 1;
            }
            break;
          }
          DebugOverviewCompositor.compositeScaledDebugOverview(minimumGrayLevelOrCompositeHeight, grayLevelForComparisonOrCompositeEnabled != 0, CacheFileState.debugOverviewRaster, 0, SoftwareRasterizer.stride, 0);
        }
        if (!this.tutorialMode) {
          if (this.delayedActionCountdown > 0) {
            PointerMenuState.smallBoxSprite.draw(-(PointerMenuState.smallBoxSprite.fullWidth >> 1) + 320, 60 - (PointerMenuState.smallBoxSprite.fullHeight >> 1) + 240);
            FadingDialog.uiPaletteFont.drawCenteredText(KeyboardInputListener.clearBonusText, 320, 310, 0, -1);
          }
          ReflectionCheckRequest.pointsPanelGlowFrames[this.pointsPanelFrameIndex].draw(this.pointsPanelX, 4);
          if (640 > this.pointsPanelX &&
              0 < this.pendingPopupPoints) {
            FadingDialog.uiPaletteFont.drawText(OpacityWidget.replaceIndexedTextMarkers(SessionBootstrapSupport.bonusAmountTemplateText, new String[]{this.popupPointsText.toString()}, (byte) -79), this.pointsPanelX + 20, 34, 0, -1);
          }
          if (this.showSessionCounters) {
            FadingDialog.uiPaletteFont.drawText(OpacityWidget.replaceIndexedTextMarkers(SingleChildWidget.fpsTextTemplate, new String[]{Integer.toString(MatchScoringSupport.frameLoopRateEstimate)}, (byte) -26), 400, 50, 0, -1);
            FadingDialog.uiPaletteFont.drawText(OpacityWidget.replaceIndexedTextMarkers(LoginPayloadKind.levelTextTemplate, new String[]{Integer.toString(ArchiveNetworkClient.difficultyStep)}, (byte) -71), 400, 80, 0, -1);
          }
          gameOverTitleRendering: {
            ProxyAuthenticationRequiredException.drawScorePopups(-117);
            this.runGuardedStaticCleanup((byte) 64);
            if (this.showGameOverOverlay) {
              PointerMenuState.smallBoxSprite.draw(selectedThemeIdOrScoreBoxX, loadingPanelWidthOrScoreBoxY);
              if (this.sceneAnimationTick < 266) {
                AudioService.screenTitleSprites[6].draw(0, (this.sceneAnimationTick >> 1) - 113);
                if (clientControlFlowGuard == 0) {
                  break gameOverTitleRendering;
                }
              }
              AudioService.screenTitleSprites[6].draw(0, 20);
              AudioService.screenTitleSprites[6].drawAdditive(0, 20, (int)(Math.cos((double)(-266 + this.sceneAnimationTick) / 40.0) * -64.0 + 64.0));
            }
          }
          FadingDialog.uiPaletteFont.drawText(OpacityWidget.replaceIndexedTextMarkers(LimitedRandomAccessFile.scoreTextTemplate, new String[]{this.scoreText.toString()}, (byte) -53), 15 + selectedThemeIdOrScoreBoxX, 30 + loadingPanelWidthOrScoreBoxY, 0, -1);
          if (EntityContactSupport.areEntityQueuesSettled(0)) {
            if (0 == this.sessionPhase ||
                  this.sessionPhase == 1) {
              if (sceneTransitionFlag != 0) {
                tutorialTopOrDebugColorOrTransitionClipTop = 35 + (6 * this.sceneAnimationTick - 480);
                SingleChildWidget.mainRasterBuffer.setAsRasterTarget(255);
                SoftwareRasterizer.setClip(0, tutorialTopOrDebugColorOrTransitionClipTop, 640, 480);
                SpriteCheckboxRenderer.boardSceneRaster.draw(0, 0);
                SoftwareRasterizer.setClip(0, 0, 640, 480);
                CharacterReplacementSupport.transitionCurtain.draw(0, -480 + 6 * this.sceneAnimationTick);
                if (clientControlFlowGuard != 0) {
                  this.renderResultSequence(false);
                }
              }
            } else {
              this.renderResultSequence(false);
            }
          }
          CachedTextLayout.drawPendingActionPanel(-1);
          if (clientControlFlowGuard != 0) {
            this.renderTutorialPrompt(2);
          }
        } else {
          this.renderTutorialPrompt(2);
        }
    }

    final void updateSession(int methodGuard) {
        int pointsPanelTickBeforeIncrement = 0;
        boolean detachedEntityOrPositiveRotationKeySnapshot = false;
        boolean nextBoardClearBonusEligible = false;
        boolean toggledDebugOverview = false;
        boolean toggledRotationControlsSwapped = false;
        boolean toggledSpecialKindSpawn = false;
        boolean toggledDebugPointerSpawn = false;
        boolean toggledSpawnReleaseDisabled = false;
        boolean toggledReducedRendering = false;
        int debugKeyCodeOrPointerEventComplement = 0;
        int debugKeySentinelOrPointerEventSentinel = 0;
        int negativeRotationKeyCode = 0;
        int positiveRotationKeyCode = 0;
        int inputDerivedModuloIndex = 0;
        GameplayEntity fastForwardEntity = null;
        int clientControlFlowGuard = 0;
        clientControlFlowGuard = Geoblox.clientControlFlowFlag;
        ValidationState.updatePendingActionPanel(methodGuard ^ 1578896222);
        pointsPanelTickBeforeIncrement = this.updateTick;
        this.updateTick = this.updateTick + 1;
        if ((pointsPanelTickBeforeIncrement & 15) == 0) {
          this.pointsPanelFrameIndex = this.pointsPanelFrameIndex + this.pointsPanelFrameDirection;
          if (7 != this.pointsPanelFrameIndex) {
            if (this.pointsPanelFrameIndex == 0) {
              this.pointsPanelFrameDirection = 1;
              if (clientControlFlowGuard != 0) {
                this.pointsPanelFrameDirection = -1;
              }
            }
          } else {
            this.pointsPanelFrameDirection = -1;
          }
        }
        pointsPanelSlideStep: {
          if (0 == (this.updateTick & 1)) {
            if (-1 != this.pointsPanelSlideDirection ||
                  463 >= this.pointsPanelX) {
              if (this.pointsPanelSlideDirection != 1 ||
                    this.pointsPanelX >= 640) {
                if (this.pointsPanelX != 463) {
                  break pointsPanelSlideStep;
                }
                if (EntityCollisionSupport.matchChainLength != 0) {
                  break pointsPanelSlideStep;
                }
                this.pointsPanelSlideDirection = 1;
                UiWidget.gameplaySession.emitPointsPopup(false);
                if (clientControlFlowGuard == 0) {
                  break pointsPanelSlideStep;
                }
              }
              this.pointsPanelX = this.pointsPanelX + 1;
              if (clientControlFlowGuard == 0) {
                break pointsPanelSlideStep;
              }
            }
            this.pointsPanelX = this.pointsPanelX - 1;
          }
        }
        sessionProgressionAndEnding: {
          if (!this.sessionEnding) {
            if ((EntityContactSupport.areEntityQueuesSettled(0) &&
                    !this.matchBatchProcessedThisTick ||
                  !this.preserveScoreOnTransition) &&
                this.canAdvanceSession(true)) {
              if (0 == this.sessionPhase ||
                    this.sessionPhase == 5) {
                if (!this.sceneTransitionRequested) {
                  break sessionProgressionAndEnding;
                }
                this.updateSceneTransition((byte) -80);
                if (clientControlFlowGuard == 0) {
                  break sessionProgressionAndEnding;
                }
              }
              this.updateResultSequence(10);
              if (clientControlFlowGuard == 0) {
                break sessionProgressionAndEnding;
              }
            }
            if (!GameGraphicsResources.themesLoaded[GameScreen.selectedThemeId]) {
              return;
            }
            if (!this.rotationControlsSwapped && clientControlFlowGuard == 0) {
              negativeRotationKeyCode = 96;
              positiveRotationKeyCode = 97;
            } else {
              positiveRotationKeyCode = 96;
              negativeRotationKeyCode = 97;
            }
            if (MidiPcmStream.heldInternalKeys[negativeRotationKeyCode]) {
              this.boardAngleRadians = this.boardAngleRadians - DualLinkNode.rotationStepRadians;
              ScorePopup.setAvatarNegativeRotationSteering((byte) 38);
              inputDerivedModuloIndex = (SessionTextHistorySupport.currentKeyboardEventCode + ClientFlowState.inputAndScoreContextSelectorSeed + PrefixCodeDecoder.pointerXSnapshot + FullscreenFocusCanvas.pointerPressYSnapshot) % 8;
              switch (inputDerivedModuloIndex) {
                case 0:
                  ClientClockSupport.firstScoreContextAccumulator = ClientClockSupport.firstScoreContextAccumulator + UsernameResponseSupport.thirdScoreContextCounter;
                  DequeCursor.fourthScoreContextCounter = DequeCursor.fourthScoreContextCounter - 1;
                  break;
                case 1:
                  ClientClockSupport.firstScoreContextAccumulator = ClientClockSupport.firstScoreContextAccumulator + DequeCursor.fourthScoreContextCounter;
                  UsernameResponseSupport.thirdScoreContextCounter = UsernameResponseSupport.thirdScoreContextCounter - 1;
                  break;
                case 3:
                  ClientClockSupport.firstScoreContextAccumulator = ClientClockSupport.firstScoreContextAccumulator - DequeCursor.fourthScoreContextCounter;
                  UsernameResponseSupport.thirdScoreContextCounter = UsernameResponseSupport.thirdScoreContextCounter + 1;
                  break;
                case 4:
                  SpriteButtonRenderer.secondScoreContextAccumulator = SpriteButtonRenderer.secondScoreContextAccumulator + UsernameResponseSupport.thirdScoreContextCounter;
                  DequeCursor.fourthScoreContextCounter = DequeCursor.fourthScoreContextCounter + 1;
                  break;
                case 5:
                  UsernameResponseSupport.thirdScoreContextCounter = UsernameResponseSupport.thirdScoreContextCounter + 1;
                  SpriteButtonRenderer.secondScoreContextAccumulator = SpriteButtonRenderer.secondScoreContextAccumulator + DequeCursor.fourthScoreContextCounter;
                  break;
                case 6:
                  SpriteButtonRenderer.secondScoreContextAccumulator = SpriteButtonRenderer.secondScoreContextAccumulator - UsernameResponseSupport.thirdScoreContextCounter;
                  DequeCursor.fourthScoreContextCounter = DequeCursor.fourthScoreContextCounter - 1;
                default:
                  break;
                case 7:
                  UsernameResponseSupport.thirdScoreContextCounter = UsernameResponseSupport.thirdScoreContextCounter - 1;
                  SpriteButtonRenderer.secondScoreContextAccumulator = SpriteButtonRenderer.secondScoreContextAccumulator - DequeCursor.fourthScoreContextCounter;
                  if (clientControlFlowGuard == 0) {
                    break;
                  }
                case 2:
                  DequeCursor.fourthScoreContextCounter = DequeCursor.fourthScoreContextCounter + 1;
                  ClientClockSupport.firstScoreContextAccumulator = ClientClockSupport.firstScoreContextAccumulator - UsernameResponseSupport.thirdScoreContextCounter;
                  break;
              }
              inputDerivedModuloIndex = (ClientFlowState.inputAndScoreContextSelectorSeed + FullscreenFocusCanvas.pointerPressYSnapshot + PrefixCodeDecoder.pointerXSnapshot + SessionTextHistorySupport.currentKeyboardEventCode) % 5;
              switch (inputDerivedModuloIndex) {
                case 0:
                  AttachedEntityRenderer.achievementTrackingBits = AttachedEntityRenderer.achievementTrackingBits | SessionInstanceState.secondaryAchievementTrackingCounter + UiWidget.achievementTrackingAccumulator << 17;
                  break;
                case 3:
                  AwtRasterBuffer.primaryAchievementTrackingCounter = AwtRasterBuffer.primaryAchievementTrackingCounter + 1;
                  UiWidget.achievementTrackingAccumulator = UiWidget.achievementTrackingAccumulator + SessionInstanceState.secondaryAchievementTrackingCounter;
                default:
                  break;
                case 4:
                  AwtRasterBuffer.primaryAchievementTrackingCounter = AwtRasterBuffer.primaryAchievementTrackingCounter - 1;
                  UiWidget.achievementTrackingAccumulator = UiWidget.achievementTrackingAccumulator - SessionInstanceState.secondaryAchievementTrackingCounter;
                  if (clientControlFlowGuard == 0) {
                    break;
                  }
                case 2:
                  SessionInstanceState.secondaryAchievementTrackingCounter = SessionInstanceState.secondaryAchievementTrackingCounter - 1;
                  UiWidget.achievementTrackingAccumulator = UiWidget.achievementTrackingAccumulator - AwtRasterBuffer.primaryAchievementTrackingCounter;
                  if (clientControlFlowGuard == 0) {
                    break;
                  }
                case 1:
                  UiWidget.achievementTrackingAccumulator = UiWidget.achievementTrackingAccumulator + AwtRasterBuffer.primaryAchievementTrackingCounter;
                  SessionInstanceState.secondaryAchievementTrackingCounter = SessionInstanceState.secondaryAchievementTrackingCounter + 1;
                  break;
              }
              if (this.tutorialStepId == 0) {
                this.tutorialProgressMetric = this.tutorialProgressMetric + 1;
              }
            }
            if (MidiPcmStream.heldInternalKeys[positiveRotationKeyCode]) {
              this.boardAngleRadians = this.boardAngleRadians + DualLinkNode.rotationStepRadians;
              SecondaryDeque.setAvatarPositiveRotationSteering((byte) 74);
              if (this.tutorialStepId == 0) {
                this.tutorialProgressMetric = this.tutorialProgressMetric + 1;
              }
              inputDerivedModuloIndex = (FullscreenFocusCanvas.pointerPressYSnapshot + (PrefixCodeDecoder.pointerXSnapshot + ClientFlowState.inputAndScoreContextSelectorSeed) + SessionTextHistorySupport.currentKeyboardEventCode) % 8;
              switch (inputDerivedModuloIndex) {
                case 3:
                  UsernameResponseSupport.thirdScoreContextCounter = UsernameResponseSupport.thirdScoreContextCounter + 1;
                  ClientClockSupport.firstScoreContextAccumulator = ClientClockSupport.firstScoreContextAccumulator - DequeCursor.fourthScoreContextCounter;
                  break;
                case 4:
                  DequeCursor.fourthScoreContextCounter = DequeCursor.fourthScoreContextCounter + 1;
                  SpriteButtonRenderer.secondScoreContextAccumulator = SpriteButtonRenderer.secondScoreContextAccumulator + UsernameResponseSupport.thirdScoreContextCounter;
                  break;
                case 5:
                  UsernameResponseSupport.thirdScoreContextCounter = UsernameResponseSupport.thirdScoreContextCounter + 1;
                  SpriteButtonRenderer.secondScoreContextAccumulator = SpriteButtonRenderer.secondScoreContextAccumulator + DequeCursor.fourthScoreContextCounter;
                  break;
                case 6:
                  SpriteButtonRenderer.secondScoreContextAccumulator = SpriteButtonRenderer.secondScoreContextAccumulator - UsernameResponseSupport.thirdScoreContextCounter;
                  DequeCursor.fourthScoreContextCounter = DequeCursor.fourthScoreContextCounter - 1;
                default:
                  break;
                case 7:
                  UsernameResponseSupport.thirdScoreContextCounter = UsernameResponseSupport.thirdScoreContextCounter - 1;
                  SpriteButtonRenderer.secondScoreContextAccumulator = SpriteButtonRenderer.secondScoreContextAccumulator - DequeCursor.fourthScoreContextCounter;
                  if (clientControlFlowGuard == 0) {
                    break;
                  }
                case 2:
                  DequeCursor.fourthScoreContextCounter = DequeCursor.fourthScoreContextCounter + 1;
                  ClientClockSupport.firstScoreContextAccumulator = ClientClockSupport.firstScoreContextAccumulator - UsernameResponseSupport.thirdScoreContextCounter;
                  if (clientControlFlowGuard == 0) {
                    break;
                  }
                case 1:
                  ClientClockSupport.firstScoreContextAccumulator = ClientClockSupport.firstScoreContextAccumulator + DequeCursor.fourthScoreContextCounter;
                  UsernameResponseSupport.thirdScoreContextCounter = UsernameResponseSupport.thirdScoreContextCounter - 1;
                  if (clientControlFlowGuard == 0) {
                    break;
                  }
                case 0:
                  DequeCursor.fourthScoreContextCounter = DequeCursor.fourthScoreContextCounter - 1;
                  ClientClockSupport.firstScoreContextAccumulator = ClientClockSupport.firstScoreContextAccumulator + UsernameResponseSupport.thirdScoreContextCounter;
                  break;
              }
              inputDerivedModuloIndex = (ClientFlowState.inputAndScoreContextSelectorSeed + PrefixCodeDecoder.pointerXSnapshot + FullscreenFocusCanvas.pointerPressYSnapshot + SessionTextHistorySupport.currentKeyboardEventCode) % 5;
              switch (inputDerivedModuloIndex) {
                case 3:
                  AwtRasterBuffer.primaryAchievementTrackingCounter = AwtRasterBuffer.primaryAchievementTrackingCounter + 1;
                  UiWidget.achievementTrackingAccumulator = UiWidget.achievementTrackingAccumulator + SessionInstanceState.secondaryAchievementTrackingCounter;
                  if (clientControlFlowGuard == 0) {
                    break;
                  }
                default:
                  break;
                case 4:
                  UiWidget.achievementTrackingAccumulator = UiWidget.achievementTrackingAccumulator - SessionInstanceState.secondaryAchievementTrackingCounter;
                  AwtRasterBuffer.primaryAchievementTrackingCounter = AwtRasterBuffer.primaryAchievementTrackingCounter - 1;
                  if (clientControlFlowGuard == 0) {
                    break;
                  }
                case 2:
                  SessionInstanceState.secondaryAchievementTrackingCounter = SessionInstanceState.secondaryAchievementTrackingCounter - 1;
                  UiWidget.achievementTrackingAccumulator = UiWidget.achievementTrackingAccumulator - AwtRasterBuffer.primaryAchievementTrackingCounter;
                  if (clientControlFlowGuard == 0) {
                    break;
                  }
                case 1:
                  SessionInstanceState.secondaryAchievementTrackingCounter = SessionInstanceState.secondaryAchievementTrackingCounter + 1;
                  UiWidget.achievementTrackingAccumulator = UiWidget.achievementTrackingAccumulator + AwtRasterBuffer.primaryAchievementTrackingCounter;
                  if (clientControlFlowGuard == 0) {
                    break;
                  }
                case 0:
                  AttachedEntityRenderer.achievementTrackingBits = AttachedEntityRenderer.achievementTrackingBits | UiWidget.achievementTrackingAccumulator + SessionInstanceState.secondaryAchievementTrackingCounter << 17;
                  break;
              }
            }
            fastForwardAndRotationSnapshot: {
              if (MidiPcmStream.heldInternalKeys[99] &&
                  !this.tutorialPromptActive) {
                fastForwardEntity = (GameplayEntity) ((Object) ArchiveNetworkClient.movingEntities.firstForIteration(0));
                while (null != fastForwardEntity) {
                  detachedEntityOrPositiveRotationKeySnapshot = fastForwardEntity.detachedFromBoard;
                  if (clientControlFlowGuard != 0) {
                    break fastForwardAndRotationSnapshot;
                  }
                  if (!detachedEntityOrPositiveRotationKeySnapshot) {
                    fastForwardEntity.positionY = fastForwardEntity.positionY + 4.0f * fastForwardEntity.velocityY;
                    fastForwardEntity.positionX = fastForwardEntity.positionX + 4.0f * fastForwardEntity.velocityX;
                    break;
                  }
                  fastForwardEntity = (GameplayEntity) ((Object) ArchiveNetworkClient.movingEntities.nextForIteration(1));
                }
              }
              detachedEntityOrPositiveRotationKeySnapshot = MidiPcmStream.heldInternalKeys[positiveRotationKeyCode];
            }
            if (!detachedEntityOrPositiveRotationKeySnapshot &&
                !MidiPcmStream.heldInternalKeys[negativeRotationKeyCode]) {
              WeightedObjectCache.clearAvatarSteering(-106);
            }
            this.delayedActionCountdown = this.delayedActionCountdown - 1;
            if (this.delayedActionCountdown == 0) {
              PlayfieldRules.spawnPointsPopup(310, 320, 123, 100 + 100 * ArchiveNetworkClient.difficultyStep);
            }
            nextBoardClearBonusEligible = (!MessageDialogSupport.entitiesDetachedThisTick) && (BoardEntityState.attachedEntities.isEmpty(13519)) && (0 < MatchCandidateSupport.releasedInCurrentTheme);
            this.boardClearBonusEligible = nextBoardClearBonusEligible;
            if (this.boardClearBonusEligible &&
                this.connectivityRebuiltThisTick) {
              this.connectivityRebuiltThisTick = false;
              this.delayedActionCountdown = 300;
              this.boardClearBonusEligible = false;
              SecondaryNodeDeque.recordAchievement(PointerInputListener.boardClearAchievementId ^ 255, -88, PointerInputListener.boardClearAchievementId);
              if (clientControlFlowGuard != 0) {
                this.connectivityRebuiltThisTick = false;
              }
            } else {
              this.connectivityRebuiltThisTick = false;
            }
            this.boundaryCheckRequested = EntityMotionSupport.boardContactStateDirty;
            SecondaryNodeDequeIterator.advanceActiveEntityAnimations((byte) -15);
            BoardReconciliationSupport.reconcileBoardEntities(methodGuard + 1578896101);
            if (EntityMotionSupport.boardContactStateDirty) {
              MatchCandidateSupport.collectMatchCandidates(-2);
            }
            this.matchBatchProcessedThisTick = MatchScoringSupport.processMatchCandidates(-18913);
            if (this.boundaryCheckRequested) {
              BufferedRandomAccessFile.checkBoundaryLossAndStartCascade(methodGuard ^ 1578896190);
            }
            AgeValidator.advanceScorePopups((byte) 27);
            MessageDialog.advanceGameplayAvatarAnimation(600);
            if (this.tutorialMode) {
              this.advanceTutorialStep(109);
            }
            if (clientControlFlowGuard == 0) {
              break sessionProgressionAndEnding;
            }
          }
          if (this.sceneAnimationTick == 0) {
            IntrusiveNodeHashTable.selectLoopingBackgroundMusic(methodGuard ^ -1578896191, ValidationMessageWidget.gameOverMusicTrack);
          }
          if (LoginPanel.endingEntityScanClear &&
              LoginMethod.isAvatarCryHoldExpired(-3) &&
              this.sceneAnimationTick > 1000) {
            this.requestSessionExitScreen(28809);
          }
          EndingAnimationSupport.advanceEndingEntityAnimations(19);
          AgeValidator.advanceScorePopups((byte) 24);
          MessageDialog.advanceGameplayAvatarAnimation(600);
          this.sceneAnimationTick = this.sceneAnimationTick + 1;
          this.boardRasterDirty = true;
        }
        if (methodGuard != -1578896191) {
          this.scoreText = (StringBuilder) null;
        }
        while (true) {
          if (!UiFontResources.pollKeyboardEvent(111)) {
            debugKeyCodeOrPointerEventComplement = ~CheckboxRenderer.pointerPressButtonSnapshot;
            debugKeySentinelOrPointerEventSentinel = -1;
            break;
          }
          if (GameAudioState.currentKeyboardEventCharacter > 0) {
            PacketBuffer.debugCommandCharacterWindow = PacketBuffer.debugCommandCharacterWindow.substring(1) + GameAudioState.currentKeyboardEventCharacter;
            if (PacketBuffer.debugCommandCharacterWindow.equalsIgnoreCase("fog")) {
              toggledDebugOverview = !(this.showDebugOverview);
              this.showDebugOverview = toggledDebugOverview;
            }
            if (SpriteCheckboxRenderer.loginDebugPermissionLevel >= 2 &&
                PacketBuffer.debugCommandCharacterWindow.equalsIgnoreCase("brk")) {
              this.gameApplet.requestIdleDisconnect((byte) 41);
            }
          }
          if (SessionTextHistorySupport.currentKeyboardEventCode == 13) {
            if (!this.sessionEnding) {
              ScoreSubmission.requestedScreenId = 1;
              if (clientControlFlowGuard == 0) {
                return;
              }
            }
            this.requestSessionExitScreen(28809);
            return;
          }
          if (SessionTextHistorySupport.currentKeyboardEventCode == 83 &&
              this.tutorialMode) {
            this.leaveTutorial(7000);
          }
          tutorialKeyAdvance: {
            if (SessionTextHistorySupport.currentKeyboardEventCode == 84 &&
                this.tutorialStepPhase == 0) {
              this.tutorialStepPhase = 1;
              this.tutorialPromptActive = false;
              if (this.tutorialStepId != 0) {
                if (this.tutorialStepId != 1) {
                  if (this.tutorialStepId != 2) {
                    break tutorialKeyAdvance;
                  }
                  this.tutorialProgressMetric = TextLayout.categoryMatchCandidateCount;
                  if (clientControlFlowGuard == 0) {
                    break tutorialKeyAdvance;
                  }
                }
                this.tutorialProgressMetric = FadingDialog.variantMatchCandidateCount;
                if (clientControlFlowGuard != 0) {
                  this.tutorialProgressMetric = 0;
                }
              } else {
                this.tutorialProgressMetric = 0;
              }
            }
          }
          if (SessionTextHistorySupport.currentKeyboardEventCode == 85 &&
              5 == this.tutorialStepId &&
              this.tutorialStepPhase == 0) {
            this.leaveTutorial(methodGuard ^ -1578897511);
            this.tutorialMode = true;
            this.tutorialStepId = 0;
            this.tutorialPromptActive = true;
          }
          if (SocketConnector.swapRotationControlsKeyCode == SessionTextHistorySupport.currentKeyboardEventCode) {
            toggledRotationControlsSwapped = !(this.rotationControlsSwapped);
            this.rotationControlsSwapped = toggledRotationControlsSwapped;
            AvatarFeedbackSupport.requestAvatarFeedback(7, false);
          }
          if (2 > SpriteCheckboxRenderer.loginDebugPermissionLevel) {
            continue;
          }
          debugKeyCodeOrPointerEventComplement = SessionTextHistorySupport.currentKeyboardEventCode;
          debugKeySentinelOrPointerEventSentinel = 48;
          if (clientControlFlowGuard == 0) {
            if (debugKeyCodeOrPointerEventComplement == debugKeySentinelOrPointerEventSentinel) {
              this.debugSpawnVariantId = this.debugSpawnVariantId - 1;
              if (this.debugSpawnVariantId < 0) {
                this.debugSpawnVariantId = 6;
              }
            }
            if (SessionTextHistorySupport.currentKeyboardEventCode == 49) {
              this.debugSpawnVariantId = this.debugSpawnVariantId + 1;
              if (this.debugSpawnVariantId == 7) {
                this.debugSpawnVariantId = 0;
              }
            }
            if (SessionTextHistorySupport.currentKeyboardEventCode == 64) {
              this.debugSpawnCategoryId = this.debugSpawnCategoryId - 1;
              if (this.debugSpawnCategoryId < 0) {
                this.debugSpawnCategoryId = 6;
              }
            }
            if (32 == SessionTextHistorySupport.currentKeyboardEventCode) {
              toggledSpecialKindSpawn = !(this.debugSpawnSpecialKinds);
              this.debugSpawnSpecialKinds = toggledSpecialKindSpawn;
            }
            if (SessionTextHistorySupport.currentKeyboardEventCode == 65) {
              this.debugSpawnCategoryId = this.debugSpawnCategoryId + 1;
              if (this.debugSpawnCategoryId == 7) {
                this.debugSpawnCategoryId = 0;
              }
            }
            if (SessionTextHistorySupport.currentKeyboardEventCode == 16) {
              this.tutorialAdvanceRequested = true;
            }
            if (68 == SessionTextHistorySupport.currentKeyboardEventCode) {
              this.sessionPhase = 1;
              this.submissionBlocked = true;
            }
            if (SessionTextHistorySupport.currentKeyboardEventCode == 1) {
              this.submissionBlocked = true;
              toggledDebugPointerSpawn = !(this.debugPointerSpawnEnabled);
              this.debugPointerSpawnEnabled = toggledDebugPointerSpawn;
            }
            if (2 == SessionTextHistorySupport.currentKeyboardEventCode) {
              toggledSpawnReleaseDisabled = !(this.spawnReleaseDisabled);
              this.spawnReleaseDisabled = toggledSpawnReleaseDisabled;
              this.submissionBlocked = true;
            }
            if (SessionTextHistorySupport.currentKeyboardEventCode == 3) {
              EmailValidator.availableSpriteVariantCount = 7;
              MessageDialog.availableEntityCategoryCount = 7;
            }
            if (SessionTextHistorySupport.currentKeyboardEventCode == 4) {
              LabeledChildWidget.recordEntityRelease(2);
              this.submissionBlocked = true;
            }
            if (SessionTextHistorySupport.currentKeyboardEventCode == 5) {
              GameScreen.selectedThemeId = 1;
              IntrusiveNode.selectThemeAudio(methodGuard ^ 1578896207, GameScreen.selectedThemeId);
              ProxySocketConnector.selectThemeRenderAssets((byte) 110);
            }
            if (SessionTextHistorySupport.currentKeyboardEventCode == 6) {
              GameScreen.selectedThemeId = 0;
              IntrusiveNode.selectThemeAudio(-126, GameScreen.selectedThemeId);
              ProxySocketConnector.selectThemeRenderAssets((byte) 126);
            }
            if (7 == SessionTextHistorySupport.currentKeyboardEventCode) {
              GameScreen.selectedThemeId = 6;
              IntrusiveNode.selectThemeAudio(-99, GameScreen.selectedThemeId);
              ProxySocketConnector.selectThemeRenderAssets((byte) 113);
            }
            if (SessionTextHistorySupport.currentKeyboardEventCode == 8) {
              GameScreen.selectedThemeId = 5;
              IntrusiveNode.selectThemeAudio(-124, GameScreen.selectedThemeId);
              ProxySocketConnector.selectThemeRenderAssets((byte) 115);
            }
            if (SessionTextHistorySupport.currentKeyboardEventCode == 9) {
              GameScreen.selectedThemeId = 3;
              IntrusiveNode.selectThemeAudio(-98, GameScreen.selectedThemeId);
              ProxySocketConnector.selectThemeRenderAssets((byte) 122);
            }
            if (10 == SessionTextHistorySupport.currentKeyboardEventCode) {
              GameScreen.selectedThemeId = 4;
              IntrusiveNode.selectThemeAudio(methodGuard ^ 1578896198, GameScreen.selectedThemeId);
              ProxySocketConnector.selectThemeRenderAssets((byte) 101);
            }
            if (SessionTextHistorySupport.currentKeyboardEventCode == 11) {
              GameScreen.selectedThemeId = 2;
              IntrusiveNode.selectThemeAudio(-118, GameScreen.selectedThemeId);
              ProxySocketConnector.selectThemeRenderAssets((byte) 82);
            }
            if (SessionTextHistorySupport.currentKeyboardEventCode == 12) {
              toggledReducedRendering = !(this.debugReducedRendering);
              this.debugReducedRendering = toggledReducedRendering;
            }
            if (36 == SessionTextHistorySupport.currentKeyboardEventCode) {
              GameScreen.selectedThemeId = GameScreen.selectedThemeId + 1;
              GameScreen.selectedThemeId = GameScreen.selectedThemeId % 7;
              ProxySocketConnector.selectThemeRenderAssets((byte) 108);
            }
            if (SessionTextHistorySupport.currentKeyboardEventCode != 39) {
              continue;
            }
            this.showSessionCounters = true;
            continue;
          }
          break;
        }
        if (debugKeyCodeOrPointerEventComplement != debugKeySentinelOrPointerEventSentinel) {
          if (this.debugPointerSpawnEnabled &&
              SpriteCheckboxRenderer.loginDebugPermissionLevel >= 2) {
            EntitySpawnSupport.spawnEntityAtPointer(-28195, AccountCreationSupport.pointerPressXSnapshot, this.debugSpawnCategoryId, FullscreenFocusCanvas.pointerPressYSnapshot, this.debugSpawnVariantId, this.debugSpawnSpecialKinds);
          }
          tutorialAutoAdvance: {
            if (this.tutorialMode &&
                this.tutorialStepPhase == 0) {
              if (this.tutorialStepId != 5) {
                this.tutorialPromptActive = false;
                this.tutorialStepPhase = 1;
                if (this.tutorialStepId == 0) {
                  this.tutorialProgressMetric = 0;
                  if (clientControlFlowGuard == 0) {
                    break tutorialAutoAdvance;
                  }
                }
                if (this.tutorialStepId == 1) {
                  this.tutorialProgressMetric = FadingDialog.variantMatchCandidateCount;
                  if (clientControlFlowGuard == 0) {
                    break tutorialAutoAdvance;
                  }
                }
                if (this.tutorialStepId != 2) {
                  return;
                }
                this.tutorialProgressMetric = TextLayout.categoryMatchCandidateCount;
                if (clientControlFlowGuard == 0) {
                  break tutorialAutoAdvance;
                }
              }
              if (AccountCreationSupport.pointerPressXSnapshot > 100 &&
                  340 > AccountCreationSupport.pointerPressXSnapshot &&
                  FullscreenFocusCanvas.pointerPressYSnapshot > 440 &&
                  476 > FullscreenFocusCanvas.pointerPressYSnapshot) {
                this.leaveTutorial(methodGuard ^ -1578897511);
                this.tutorialStepId = 0;
                this.tutorialMode = true;
                this.tutorialPromptActive = true;
              }
              if (AccountCreationSupport.pointerPressXSnapshot > 380 &&
                  540 > AccountCreationSupport.pointerPressXSnapshot &&
                  FullscreenFocusCanvas.pointerPressYSnapshot > 440) {
                if (FullscreenFocusCanvas.pointerPressYSnapshot >= 476) {
                  return;
                }
                this.tutorialPromptActive = false;
                this.tutorialStepPhase = 1;
              }
            }
          }
        }
        return;
    }

    final void addScore(byte methodGuard, int points) {
        int pointsForCounters;
        int counterSplitMode;
        int oneThirdPoints;
        int controlFlowGuard;
        CharSequence cappedScoreText;
        CharSequence scoreValueText;
        controlFlowGuard = Geoblox.clientControlFlowFlag;
        if (this.tutorialMode) {
          return;
        }
        scoreTextUpdate: {
          this.score = this.score + points;
          if (this.score > 9999999) {
            cappedScoreText = (CharSequence) ((Object) Integer.toString(9999999));
            ValidationIconWidget.writeTextAtOffset(cappedScoreText, this.scoreText, 0, 47);
            if (controlFlowGuard == 0) {
              break scoreTextUpdate;
            }
          }
          scoreValueText = (CharSequence) ((Object) Integer.toString(this.score));
          ValidationIconWidget.writeTextAtOffset(scoreValueText, this.scoreText, 0, 69);
        }
        pointsForCounters = points;
        if (methodGuard != 127) {
          this.renderProgressHud(-17);
        }
        scoreContextCounterUpdate: {
          counterSplitMode = ClientFlowState.inputAndScoreContextSelectorSeed % 3;
          if (counterSplitMode != 0) {
            if (counterSplitMode == 1) {
              SpriteButtonRenderer.secondScoreContextAccumulator = SpriteButtonRenderer.secondScoreContextAccumulator - pointsForCounters;
              if (controlFlowGuard == 0) {
                break scoreContextCounterUpdate;
              }
            }
            oneThirdPoints = pointsForCounters / 3;
            ClientClockSupport.firstScoreContextAccumulator = ClientClockSupport.firstScoreContextAccumulator + oneThirdPoints;
            SpriteButtonRenderer.secondScoreContextAccumulator = SpriteButtonRenderer.secondScoreContextAccumulator - (pointsForCounters - oneThirdPoints);
            if (controlFlowGuard == 0) {
              break scoreContextCounterUpdate;
            }
          }
          ClientClockSupport.firstScoreContextAccumulator = ClientClockSupport.firstScoreContextAccumulator + pointsForCounters;
        }
        if (ClientOptionSupport.isClientOptionEnabled(0, -117) &&
            this.score >= 7000) {
          SecondaryNodeDeque.recordAchievement(239, -120, 16);
        }
        return;
    }

    public static void releaseStaticReferences(int methodGuard) {
        decodedSpriteXOffsets = null;
        archiveHost = null;
        if (methodGuard != -17199) {
          pointerIdleTicks = 53;
        }
    }

    final void startSessionEndSequence(byte methodGuard) {
        if (methodGuard != 116) {
          this.score = -46;
        }
        if (!this.tutorialMode) {
          this.sessionEnding = true;
          this.showGameOverOverlay = true;
          this.emitPointsPopup(false);
          this.addScore((byte) 127, WidgetTheme.collectUnfinishedPopupPoints(-25866));
          this.submitScore((byte) -70);
          if (Geoblox.clientControlFlowFlag != 0) {
            this.tutorialStepId = 5;
            this.tutorialStepPhase = 0;
            this.tutorialPromptActive = true;
          }
        } else {
          this.tutorialStepId = 5;
          this.tutorialStepPhase = 0;
          this.tutorialPromptActive = true;
        }
    }

    final boolean canAdvanceSession(boolean requirePendingTransitionOrPhase) {
        boolean hasPendingTransitionOrPhase = false;
        if (!requirePendingTransitionOrPhase) {
          return true;
        }
        hasPendingTransitionOrPhase = (this.sceneTransitionRequested) || !(0 == this.sessionPhase);
        return hasPendingTransitionOrPhase;
    }

    private final void advanceTutorialStep(int methodGuard) {
        int clientControlFlowGuard;
        tutorialStepPhaseUpdate: {
          clientControlFlowGuard = Geoblox.clientControlFlowFlag;
          if (this.tutorialStepPhase == 2) {
            this.tutorialStepId = this.tutorialStepId + 1;
            this.tutorialPromptActive = true;
            this.tutorialStepPhase = 0;
            if (clientControlFlowGuard == 0) {
              break tutorialStepPhaseUpdate;
            }
          }
          if (1 == this.tutorialStepPhase) {
            if (this.tutorialStepId == 3 ||
                  this.tutorialStepId == 5) {
              this.leaveTutorial(7000);
            }
            if (this.tutorialAdvanceRequested) {
              this.tutorialAdvanceRequested = false;
              this.tutorialStepPhase = 2;
            }
            if (this.tutorialStepId == 0 &&
                this.tutorialProgressMetric > 450) {
              this.tutorialStepPhase = 2;
              if (clientControlFlowGuard == 0) {
                break tutorialStepPhaseUpdate;
              }
            }
            if (this.tutorialStepId != 1 ||
                  !(0 < FadingDialog.variantMatchCandidateCount - this.tutorialProgressMetric)) {
              if (this.tutorialStepId == 2) {
                if (!(TextLayout.categoryMatchCandidateCount - this.tutorialProgressMetric <= 0)) {
                  this.tutorialStepPhase = 2;
                  if (clientControlFlowGuard != 0) {
                    this.tutorialStepPhase = 2;
                  }
                }
              }
            } else {
              this.tutorialStepPhase = 2;
            }
          }
        }
        if (methodGuard < 59) {
          this.spawnReleaseDisabled = true;
        }
    }

    private final void updateSceneTransition(byte methodGuard) {
        int selectedThemeComplementOrThemeSentinel = 0;
        int themeEntryComplementOrThemeId = 0;
        int precedingThemeId = 0;
        int themeIndexThenId = 0;
        int clientControlFlowGuard = 0;
        clientControlFlowGuard = Geoblox.clientControlFlowFlag;
        if (this.sceneAnimationTick == 0) {
          if (!this.preserveScoreOnTransition) {
            this.resetScoreState(122);
            if (clientControlFlowGuard != 0) {
              this.prepareNextTheme(867);
            }
          } else {
            this.prepareNextTheme(867);
          }
          this.sceneTransitionInProgress = true;
          ArrayOperations.copyInts(SingleChildWidget.mainRasterBuffer.pixels, 0, SpriteCheckboxRenderer.boardSceneRaster.pixels, 0, SingleChildWidget.mainRasterBuffer.pixels.length);
          PointerInputListener.resetEntityQueuesAndContactState((byte) -39);
          LogoPreparationSupport.boardOwnershipRaster.setAsRasterTarget();
          SoftwareRasterizer.clearFramebuffer();
          MeshDepthSupport.avatarMaskRaster.drawSilhouette(this.boardMaskOffsetX + 320, this.boardMaskOffsetY + 240, 16777215);
          SingleChildWidget.mainRasterBuffer.setAsRasterTarget(255);
        }
        int nextSceneAnimationTick = this.sceneAnimationTick + 1;
        this.sceneAnimationTick = this.sceneAnimationTick + 1;
        if (160 == nextSceneAnimationTick) {
          if (this.preserveScoreOnTransition) {
            precedingThemeId = 0;
            themeIndexThenId = 0;
            while (true) {
              precedingThemeDispatchPreparation: {
                precedingThemeLookup: {
                  if (7 > themeIndexThenId) {
                    selectedThemeComplementOrThemeSentinel = ~GameScreen.selectedThemeId;
                    themeEntryComplementOrThemeId = ~WidgetContainer.themeCycleOrder[themeIndexThenId];
                    if (clientControlFlowGuard != 0) {
                      break precedingThemeDispatchPreparation;
                    }
                    if (selectedThemeComplementOrThemeSentinel == themeEntryComplementOrThemeId) {
                      if (0 < themeIndexThenId) {
                        precedingThemeId = WidgetContainer.themeCycleOrder[themeIndexThenId - 1];
                        break precedingThemeLookup;
                      }
                      precedingThemeId = WidgetContainer.themeCycleOrder[6];
                      break precedingThemeLookup;
                    }
                    themeIndexThenId++;
                    continue;
                  }
                }
                themeIndexThenId = precedingThemeId;
                selectedThemeComplementOrThemeSentinel = 4;
                themeEntryComplementOrThemeId = themeIndexThenId;
              }
              fallbackSunAchievementEntry: {
                sweetsAchievementEntry: {
                  sportsAchievementEntry: {
                    spaceAchievementEntry: {
                      jewelsAchievementEntry: {
                        germsAchievementEntry: {
                          sunAchievementEntry: {
                            if (selectedThemeComplementOrThemeSentinel != themeEntryComplementOrThemeId ||
                                  clientControlFlowGuard != 0) {
                              if (themeIndexThenId == 1 &&
                                  clientControlFlowGuard == 0) {
                                break sunAchievementEntry;
                              }
                              if (themeIndexThenId == 3 &&
                                  clientControlFlowGuard == 0) {
                                break germsAchievementEntry;
                              }
                              if (themeIndexThenId == 0 &&
                                  clientControlFlowGuard == 0) {
                                break jewelsAchievementEntry;
                              }
                              if (themeIndexThenId == 6) {
                                break spaceAchievementEntry;
                              }
                              if (5 == themeIndexThenId &&
                                  clientControlFlowGuard == 0) {
                                break sportsAchievementEntry;
                              }
                              if (2 != themeIndexThenId) {
                                break fallbackSunAchievementEntry;
                              }
                              if (clientControlFlowGuard == 0) {
                                break sweetsAchievementEntry;
                              }
                            }
                            SecondaryNodeDeque.recordAchievement(MessageDialogSupport.bakingThemeCompletionAchievementId ^ 255, -61, MessageDialogSupport.bakingThemeCompletionAchievementId);
                            if (clientControlFlowGuard == 0) {
                              break;
                            }
                          }
                          SecondaryNodeDeque.recordAchievement(255 ^ SpriteConstructionSupport.sunThemeCompletionAchievementId, -84, SpriteConstructionSupport.sunThemeCompletionAchievementId);
                          if (clientControlFlowGuard == 0) {
                            break;
                          }
                        }
                        SecondaryNodeDeque.recordAchievement(255 ^ TextInputRenderer.germsThemeCompletionAchievementId, -50, TextInputRenderer.germsThemeCompletionAchievementId);
                        if (clientControlFlowGuard == 0) {
                          break;
                        }
                      }
                      SecondaryNodeDeque.recordAchievement(255 ^ AccountEligibilitySupport.jewelsThemeCompletionAchievementId, -71, AccountEligibilitySupport.jewelsThemeCompletionAchievementId);
                      if (clientControlFlowGuard == 0) {
                        break;
                      }
                    }
                    SecondaryNodeDeque.recordAchievement(255 ^ CheckboxWidget.spaceThemeCompletionAchievementId, -115, CheckboxWidget.spaceThemeCompletionAchievementId);
                    if (clientControlFlowGuard == 0) {
                      break;
                    }
                  }
                  SecondaryNodeDeque.recordAchievement(255 ^ WeightedObjectCache.sportsThemeCompletionAchievementId, -92, WeightedObjectCache.sportsThemeCompletionAchievementId);
                  if (clientControlFlowGuard == 0) {
                    break;
                  }
                }
                SecondaryNodeDeque.recordAchievement(255 ^ SocketConnector.sweetsThemeCompletionAchievementId, -121, SocketConnector.sweetsThemeCompletionAchievementId);
                if (clientControlFlowGuard == 0) {
                  break;
                }
              }
              SecondaryNodeDeque.recordAchievement(SpriteConstructionSupport.sunThemeCompletionAchievementId ^ 255, -95, SpriteConstructionSupport.sunThemeCompletionAchievementId);
              break;
            }
          }
          this.connectivityRebuiltThisTick = false;
          this.boardRasterDirty = true;
          this.sceneTransitionInProgress = false;
          this.preserveScoreOnTransition = true;
          this.sceneTransitionRequested = false;
          this.sceneAnimationTick = 0;
          if (ArchiveNetworkClient.difficultyStep > 0) {
            FullscreenEntrySupport.adjustThemeReleaseQuota(10);
            PlayfieldRules.advanceDifficulty(false);
          }
        }
        if (methodGuard > -76) {
          this.showSessionCounters = true;
        }
    }

    private final void renderResultSequence(boolean methodGuard) {
        int shrinkingDiameter;
        int clientControlFlowGuard;
        String shrinkingBonusText;
        String countdownBonusText;
        clientControlFlowGuard = Geoblox.clientControlFlowFlag;
        if (methodGuard) {
          this.addScore((byte) 71, 49);
        }
        resultSequenceRendering: {
          if (2 == this.sessionPhase) {
            PacketBuffer.resultBubbleSprite.drawScaledAlpha(320 - (this.sceneAnimationTick >> 1), 240 - (this.sceneAnimationTick >> 1), this.sceneAnimationTick, this.sceneAnimationTick, 150);
            PointerMenuState.smallBoxSprite.draw(this.resultPanelX, -(PointerMenuState.smallBoxSprite.fullHeight >> 1) + 240 + 60);
            FadingDialog.uiPaletteFont.drawText(SharedBufferPools.bubbleBonusText, 15 + this.resultPanelX, 312, 0, -1);
            if (clientControlFlowGuard == 0) {
              break resultSequenceRendering;
            }
          }
          shrinkingDiameter = -this.sceneAnimationTick + 460 + 460;
          if (this.sessionPhase == 3) {
            PacketBuffer.resultBubbleSprite.drawScaledAlpha(-(shrinkingDiameter >> 1) + 320, 240 - (shrinkingDiameter >> 1), shrinkingDiameter, shrinkingDiameter, 150);
            PointerMenuState.smallBoxSprite.draw(-(PointerMenuState.smallBoxSprite.fullWidth >> 1) + 320, -(PointerMenuState.smallBoxSprite.fullHeight >> 1) + 240 + 60);
            shrinkingBonusText = Integer.toString(this.resultBonusPoints);
            FadingDialog.uiPaletteFont.drawCenteredText(shrinkingBonusText, 320, 312, 0, -1);
            if (this.boardEmptyAtResultStart) {
              FadingDialog.uiPaletteFont.drawCenteredText(PlayfieldRules.twoThousandBonusText, 320, 352, 0, -1);
            }
            if (clientControlFlowGuard == 0) {
              break resultSequenceRendering;
            }
          }
          NodeHashTableIterator.popSprite.drawAlpha(-(NodeHashTableIterator.popSprite.fullWidth >> 1) + 320, 240 - (NodeHashTableIterator.popSprite.fullHeight >> 1), this.resultSequenceCountdown - 150 + 150);
          PointerMenuState.smallBoxSprite.draw(-(PointerMenuState.smallBoxSprite.fullWidth >> 1) + 320, 300 - (PointerMenuState.smallBoxSprite.fullHeight >> 1));
          countdownBonusText = Integer.toString(this.resultBonusPoints);
          FadingDialog.uiPaletteFont.drawCenteredText(countdownBonusText, 320, 312, 0, -1);
          if (this.boardEmptyAtResultStart) {
            FadingDialog.uiPaletteFont.drawCenteredText(PlayfieldRules.twoThousandBonusText, 320, 352, 0, -1);
          }
        }
        FadingDialog.uiPaletteFont.drawParagraph(ClientFlowState.bubbleBonusAnnouncementText, 426, 404, 200, 100, 0, -1, 2, 0, 30);
    }

    private final void updateResultSequence(int methodGuard) {
        int nextSceneAnimationTick = 0;
        int comparisonLeftColumnOrZero = 0;
        int comparisonRightWidthOrPixel = 0;
        int rowStartOrMusicGuard = 0;
        int resultProgressPercent = 0;
        int maxRadiusSquared = 0;
        int spriteOffsetFromCenterX = 0;
        int spriteOffsetFromCenterY = 0;
        int spriteColumn = 0;
        int spriteRow = 0;
        int pixelOffsetFromCenterX = 0;
        int pixelOffsetFromCenterY = 0;
        int pixelRadiusSquared = 0;
        int controlFlowGuard = 0;
        GameplayEntity endingEntity = null;
        controlFlowGuard = Geoblox.clientControlFlowFlag;
        if (0 == this.sceneAnimationTick) {
          EntityCollisionSupport.matchChainLength = 0;
          if (BufferedRandomAccessFile.checkBoundaryLossAndStartCascade(methodGuard - 11)) {
            this.pointsPanelSlideDirection = 0;
            return;
          }
          resultRadiusAndMusicPreparation: {
            endingEntityRadiusMeasurement: {
              this.resultBonusPoints = this.resultBonusPoints + 179;
              this.boardEmptyAtResultStart = BoardEntityState.attachedEntities.isEmpty(13519);
              this.resultSequenceCountdown = 150;
              endingEntity = MeshDepthSupport.findOutermostAttachedEntity((byte) -128);
              if (null == endingEntity) {
                this.endingEntityRadius = 29;
                if (controlFlowGuard == 0) {
                  break endingEntityRadiusMeasurement;
                }
              }
              HotspotTextWidget.spriteScratchRaster.setAsRasterTarget();
              SoftwareRasterizer.clearFramebuffer();
              endingEntity.entitySprite.rotateSmooth(endingEntity.entitySprite.fullWidth << 3, endingEntity.entitySprite.fullHeight << 3, HotspotTextWidget.spriteScratchRaster.fullWidth << 3, HotspotTextWidget.spriteScratchRaster.fullHeight << 3, (int)(65535.0 * ((double)endingEntity.spriteAngleRadians / 6.283185307179586)), 4096);
              SingleChildWidget.mainRasterBuffer.setAsRasterTarget(255);
              maxRadiusSquared = 0;
              spriteOffsetFromCenterX = (int)(endingEntity.positionX + 0.5f) + (-(HotspotTextWidget.spriteScratchRaster.width >> 1) - 320);
              spriteOffsetFromCenterY = -240 + ((int)(endingEntity.positionY + 0.5f) - (HotspotTextWidget.spriteScratchRaster.height >> 1));
              spriteColumn = 0;
              while (true) {
                comparisonLeftColumnOrZero = spriteColumn;
                comparisonRightWidthOrPixel = HotspotTextWidget.spriteScratchRaster.width;
                if (comparisonLeftColumnOrZero < comparisonRightWidthOrPixel) {
                  rowStartOrMusicGuard = 0;
                  if (controlFlowGuard != 0) {
                    break resultRadiusAndMusicPreparation;
                  }
                  spriteRow = rowStartOrMusicGuard;
                  while (HotspotTextWidget.spriteScratchRaster.height > spriteRow) {
                    comparisonLeftColumnOrZero = 0;
                    comparisonRightWidthOrPixel = HotspotTextWidget.spriteScratchRaster.pixels[HotspotTextWidget.spriteScratchRaster.width * spriteRow + spriteColumn];
                    if (comparisonLeftColumnOrZero != comparisonRightWidthOrPixel) {
                      pixelOffsetFromCenterX = spriteOffsetFromCenterX + spriteColumn;
                      pixelOffsetFromCenterY = spriteRow + spriteOffsetFromCenterY;
                      pixelRadiusSquared = pixelOffsetFromCenterX * pixelOffsetFromCenterX + pixelOffsetFromCenterY * pixelOffsetFromCenterY;
                      if (pixelRadiusSquared > maxRadiusSquared) {
                        maxRadiusSquared = pixelRadiusSquared;
                      }
                    }
                    spriteRow++;
                  }
                  spriteColumn++;
                  continue;
                }
                break;
              }
              this.endingEntityRadius = (int)(0.5 + Math.sqrt((double)maxRadiusSquared));
            }
            this.resultCompletionTickOffset = 920 + (-(2 * this.endingEntityRadius) - 58 - 1);
            rowStartOrMusicGuard = methodGuard ^ 10;
          }
          SecondaryNodeDeque.selectBackgroundMusic(rowStartOrMusicGuard, ContentTransitionDialog.resultMusicTrack);
        }
        resultSequenceTickAndCompletion: {
          nextSceneAnimationTick = this.sceneAnimationTick + 1;
          this.sceneAnimationTick = this.sceneAnimationTick + 1;
          if (nextSceneAnimationTick != 150 + this.resultCompletionTickOffset) {
            resultSequencePhaseSelection: {
              if (460 > this.sceneAnimationTick) {
                this.sessionPhase = 2;
                if (controlFlowGuard == 0) {
                  break resultSequencePhaseSelection;
                }
              }
              if (~(460 - this.sceneAnimationTick + 460) > ~(this.endingEntityRadius * 2)) {
                this.sessionPhase = 4;
                if (controlFlowGuard != 0) {
                  this.sessionPhase = 3;
                }
              } else {
                this.sessionPhase = 3;
              }
            }
            if (3 == this.sessionPhase) {
              this.resultBonusPoints = this.resultBonusPoints + 7;
              if (controlFlowGuard == 0) {
                break resultSequenceTickAndCompletion;
              }
            }
            if (this.sessionPhase != 2) {
              if (this.resultSequenceCountdown == 150) {
                ValidationIconWidget.playPcmSample(-348, GameSoundResources.gameSoundSamples[28]);
              }
              this.resultSequenceCountdown = this.resultSequenceCountdown - 1;
              if (controlFlowGuard == 0) {
                break resultSequenceTickAndCompletion;
              }
            }
            if (this.resultExpansionAudioStream == null ||
                  this.resultExpansionAudioStream.isSamplePositionOutOfRange()) {
              resultProgressPercent = this.sceneAnimationTick * 100 / 460;
              this.resultExpansionAudioStream = PcmSampleStream.createForPlaybackRate(GameSoundResources.gameSoundSamples[28], 2 * resultProgressPercent + 200, 45);
              GameplayEntity.registerAudioStream(false, this.resultExpansionAudioStream);
            }
            if (this.resultPanelX <= 320 - (PointerMenuState.smallBoxSprite.fullWidth >> 1)) {
              break resultSequenceTickAndCompletion;
            }
            this.resultPanelX = this.resultPanelX - 1;
            if (controlFlowGuard == 0) {
              break resultSequenceTickAndCompletion;
            }
          }
          this.sceneTransitionRequested = true;
          this.sceneAnimationTick = 0;
          this.sessionPhase = 5;
          if (this.boardEmptyAtResultStart) {
            PlayfieldRules.spawnPointsPopup(350, 320, 66, 2000);
            SecondaryNodeDeque.recordAchievement(ArchiveLoadSequence.emptyBoardResultAchievementId ^ 255, methodGuard - 101, ArchiveLoadSequence.emptyBoardResultAchievementId);
            this.connectivityRebuiltThisTick = false;
          }
          PlayfieldRules.spawnPointsPopup(310, 320, 90, this.resultBonusPoints);
        }
        AgeValidator.advanceScorePopups((byte) 33);
        MessageDialog.advanceGameplayAvatarAnimation(600);
        if (methodGuard != 10) {
          GameplaySession.releaseStaticReferences(-70);
        }
    }

    final void submitScore(byte methodGuard) {
        if (methodGuard != -70) {
            return;
        }
        if (0 < this.score && !this.submissionBlocked &&
            !UnderlinedButtonRenderer.isGuestSessionMode(-102)) {
            ContentTransitionDialog.createAndSubmitScore(ClientClockSupport.firstScoreContextAccumulator, 22, UsernameResponseSupport.thirdScoreContextCounter, 25134, new int[]{this.score}, SpriteButtonRenderer.secondScoreContextAccumulator, 65513, 3, DequeCursor.fourthScoreContextCounter);
        }
        FifoResponseToken.activeHighscoreQuery = null;
    }

    final void addPopupPoints(int points, int methodGuard) {
        int clientControlFlowGuard;
        CharSequence cappedPopupPointsText;
        CharSequence popupPointsValueText;
        if (this.tutorialMode) {
          return;
        }
        popupPointsTextUpdate: {
          this.pendingPopupPoints = this.pendingPopupPoints + points;
          if (this.pendingPopupPoints > 99999) {
            cappedPopupPointsText = (CharSequence) ((Object) Integer.toString(99999));
            ValidationIconWidget.writeTextAtOffset(cappedPopupPointsText, this.popupPointsText, 0, 26);
            if (Geoblox.clientControlFlowFlag == 0) {
              break popupPointsTextUpdate;
            }
          }
          popupPointsValueText = (CharSequence) ((Object) Integer.toString(this.pendingPopupPoints));
          ValidationIconWidget.writeTextAtOffset(popupPointsValueText, this.popupPointsText, 0, 73);
        }
        clientControlFlowGuard = -83 % ((-19 - methodGuard) / 54);
    }

    private final void renderProgressHud(int methodGuard) {
        int remainingThemeReleases;
        int clientControlFlowGuard;
        clientControlFlowGuard = Geoblox.clientControlFlowFlag;
        if (!this.preserveScoreOnTransition) {
          return;
        }
        themeProgressHudRendering: {
          if (this.sessionPhase != 0) {
            FadingDialog.uiPaletteFont.drawParagraph(LoginUiSupport.lastGeobloxOfLevelText, 426, 404, 200, 100, 0, -1, 2, 0, 30);
            if (clientControlFlowGuard == 0) {
              break themeProgressHudRendering;
            }
          }
          remainingThemeReleases = -MatchCandidateSupport.releasedInCurrentTheme + MessageDialogSupport.releasesPerTheme;
          FadingDialog.uiPaletteFont.colorPalettes[0][SessionGameApplet.uiAccentPaletteIndex] = 15488514;
          FadingDialog.uiPaletteFont.drawRightAlignedText(SessionSocketSupport.countdownLabelText, 621, 441, 0, -1);
          FadingDialog.uiPaletteFont.colorPalettes[0][SessionGameApplet.uiAccentPaletteIndex] = 16689938;
          FadingDialog.uiPaletteFont.drawRightAlignedText(LoginMethod.gameNameText, 621, 468, 0, -1);
          if (remainingThemeReleases <= 10) {
            FadingDialog.uiPaletteFont.colorPalettes[0][SessionGameApplet.uiAccentPaletteIndex] = EmailAvailabilityValidator.remainingThemeReleaseTextColors[remainingThemeReleases % 5];
            FadingDialog.uiPaletteFont.drawRightAlignedText(Integer.toString(remainingThemeReleases), 515, 468, 0, -1);
            FadingDialog.uiPaletteFont.colorPalettes[0][SessionGameApplet.uiAccentPaletteIndex] = 16689938;
            if (clientControlFlowGuard == 0) {
              break themeProgressHudRendering;
            }
          }
          if (remainingThemeReleases <= 99999) {
            FadingDialog.uiPaletteFont.drawRightAlignedText(Integer.toString(remainingThemeReleases), 515, 468, 0, -1);
            if (clientControlFlowGuard == 0) {
              break themeProgressHudRendering;
            }
          }
          FadingDialog.uiPaletteFont.drawRightAlignedText(Integer.toString(99999), 515, 468, 0, -1);
        }
        if (methodGuard >= -39) {
          this.resultBonusPoints = 7;
        }
    }

    private final void requestSessionExitScreen(int methodGuard) {
        int clientControlFlowGuard;
        clientControlFlowGuard = Geoblox.clientControlFlowFlag;
        if (methodGuard != 28809) {
          this.debugPointerSpawnEnabled = true;
        }
        sessionExitScreenSelection: {
          if (!UnderlinedButtonRenderer.isGuestSessionMode(-93)) {
            if (this.newActionCount <= 0) {
              if (this.score > 0) {
                ScoreSubmission.requestedScreenId = 2;
                if (clientControlFlowGuard == 0) {
                  break sessionExitScreenSelection;
                }
              }
              ScoreSubmission.requestedScreenId = 0;
              if (clientControlFlowGuard == 0) {
                break sessionExitScreenSelection;
              }
            }
            ScoreSubmission.requestedScreenId = 6;
            if (clientControlFlowGuard == 0) {
              break sessionExitScreenSelection;
            }
          }
          if (this.score > 0 ||
                this.newActionCount > 0) {
            ScoreSubmission.requestedScreenId = 4;
            if (clientControlFlowGuard == 0) {
              break sessionExitScreenSelection;
            }
          }
          ScoreSubmission.requestedScreenId = 0;
        }
        IntrusiveNodeHashTable.selectLoopingBackgroundMusic(0, GameGraphicsResources.titleMusicTrack);
    }

    private final void resetScoreState(int methodGuard) {
        this.score = 0;
        this.pendingPopupPoints = 0;
        AwtRasterBuffer.primaryAchievementTrackingCounter = 3382;
        UiWidget.achievementTrackingAccumulator = 8801;
        SpriteButtonRenderer.secondScoreContextAccumulator = 1385;
        AttachedEntityRenderer.achievementTrackingBits = 0;
        ClientClockSupport.firstScoreContextAccumulator = 4703;
        DequeCursor.fourthScoreContextCounter = 5997;
        UsernameResponseSupport.thirdScoreContextCounter = 275;
        SessionInstanceState.secondaryAchievementTrackingCounter = 935;
        this.addScore((byte) 127, 0);
        this.addPopupPoints(0, -96);
        EntityCollisionSupport.matchChainLength = 1;
        this.pointsPanelSlideDirection = 1;
        this.pointsPanelX = 640;
        ValidationIconWidget.recycleAllScorePopups((byte) -93);
        if (methodGuard < 104) {
          GameplaySession.releaseStaticReferences(-111);
        }
    }

    private final void runGuardedStaticCleanup(byte methodGuard) {
        if (methodGuard <= 40) {
          GameplaySession.releaseStaticReferences(100);
        }
    }

    private final void prepareNextTheme(int methodGuard) {
        this.sessionPhase = 0;
        this.resultPanelX = 640;
        this.resultBonusPoints = 0;
        this.endingEntityRadius = 0;
        if (methodGuard != 867) {
            this.renderTutorialPrompt(20);
        }
        if (ArchiveNetworkClient.difficultyStep >= 41) {
            SecondaryNodeDeque.recordAchievement(255 ^ PacketBuffer.difficultyFortyOneAchievementId, -103, PacketBuffer.difficultyFortyOneAchievementId);
        }
        int nextThemeId = PasswordWidgetRenderer.getThemeForProgress(16);
        GameScreen.selectedThemeId = nextThemeId;
        ProxySocketConnector.selectThemeRenderAssets((byte) 116);
        IntrusiveNode.selectThemeAudio(methodGuard ^ -796, nextThemeId);
    }

    final void emitPointsPopup(boolean markSubmissionBlocked) {
        if (this.pendingPopupPoints == 0) {
            return;
        }
        if (markSubmissionBlocked) {
            this.submissionBlocked = true;
        }
        PlayfieldRules.spawnPointsPopup(34, 20 + (this.pointsPanelX + 60), 79, this.pendingPopupPoints);
        ValidationIconWidget.playPcmSample(-348, GameSoundResources.gameSoundSamples[32]);
        this.pendingPopupPoints = 0;
    }

    GameplaySession(Geoblox ownerApplet, boolean enableTutorial) {
        RuntimeException constructorFailureForContext = null;
        StringBuilder constructorMessagePrefix = null;
        String appletArgumentDescription = null;
        RuntimeException caughtConstructorFailure = null;
        RuntimeException constructorFailure = null;
        this.boardEmptyAtResultStart = false;
        this.pointsPanelX = 640;
        this.delayedActionCountdown = 0;
        this.submissionBlocked = false;
        this.tutorialPromptActive = false;
        this.debugSpawnSpecialKinds = false;
        this.pointsPanelFrameDirection = 1;
        this.pointsPanelSlideDirection = 0;
        this.spawnReleaseDisabled = false;
        this.boardClearBonusEligible = false;
        this.score = 0;
        this.sessionEnding = false;
        this.debugPointerSpawnEnabled = false;
        this.tutorialAdvanceRequested = false;
        this.resultBonusPoints = 0;
        this.preserveScoreOnTransition = true;
        this.tutorialStepId = 0;
        this.tutorialStepPhase = 0;
        this.connectivityRebuiltThisTick = false;
        this.showSessionCounters = false;
        this.sceneTransitionInProgress = false;
        this.scoreText = new StringBuilder(5);
        this.pendingPopupPoints = 0;
        this.popupPointsText = new StringBuilder(5);
        this.showGameOverOverlay = false;
        this.sceneAnimationTick = 0;
        this.boardRasterDirty = false;
        this.sceneTransitionRequested = false;
        this.resultPanelX = 640;
        this.resultSequenceCountdown = 150;
        this.resultCompletionTickOffset = 0;
        this.endingEntityRadius = 0;
        this.sessionPhase = 0;
        try {
          this.gameApplet = ownerApplet;
          ScorePopupSupport.newAchievementMask = 0;
          ArchiveRequest.pendingActionMarkers.clearNodes((byte) -126);
          this.pendingPopupPoints = 0;
          this.boardMaskOffsetX = -(MeshDepthSupport.avatarMaskRaster.width >> 1);
          this.tutorialMode = enableTutorial;
          this.tutorialPromptActive = enableTutorial;
          this.score = 0;
          this.boardMaskOffsetY = -(MeshDepthSupport.avatarMaskRaster.height >> 1);
          this.boardAngleRadians = 0.0f;
          LogoPreparationSupport.boardOwnershipRaster.setAsRasterTarget();
          SoftwareRasterizer.clearFramebuffer();
          MeshDepthSupport.avatarMaskRaster.drawSilhouette(320 + this.boardMaskOffsetX, this.boardMaskOffsetY + 240, 16777215);
          SpriteCheckboxRenderer.boardSceneRaster.setAsRasterTarget();
          SoftwareRasterizer.clearFramebuffer();
          SingleChildWidget.mainRasterBuffer.setAsRasterTarget(255);
          this.sceneTransitionRequested = false;
          this.sceneAnimationTick = 0;
          this.boardRasterDirty = true;
          this.sessionPhase = 0;
          this.sessionEnding = false;
          this.addScore((byte) 127, 0);
          if (ClientOptionSupport.isClientOptionEnabled(0, 111)) {
            DiskCacheWorker.avatarTintPalette[0] = 14788623;
            DiskCacheWorker.avatarTintPalette[1] = 15439657;
          }
          ValidationIconWidget.recycleAllScorePopups((byte) -93);
          GameplayEntity.resetAvatarFeedbackState(0);
          GameScreen.selectedThemeId = WidgetContainer.themeCycleOrder[0];
          ProxySocketConnector.selectThemeRenderAssets((byte) 104);
          this.debugPointerSpawnEnabled = false;
          this.submissionBlocked = false;
          this.spawnReleaseDisabled = false;
          this.showGameOverOverlay = false;
          IntrusiveNode.selectThemeAudio(-116, 1);
          if (MultiHandleSliderRenderer.rotatedThemeForegroundRaster == null) {
            MultiHandleSliderRenderer.rotatedThemeForegroundRaster = new Sprite(MatchScoringSupport.selectedThemeForeground.width, MatchScoringSupport.selectedThemeForeground.height);
          }
          ClientClockSupport.firstScoreContextAccumulator = 4703;
          UsernameResponseSupport.thirdScoreContextCounter = 275;
          SessionInstanceState.secondaryAchievementTrackingCounter = 935;
          AttachedEntityRenderer.achievementTrackingBits = 0;
          SpriteButtonRenderer.secondScoreContextAccumulator = 1385;
          UiWidget.achievementTrackingAccumulator = 8801;
          AwtRasterBuffer.primaryAchievementTrackingCounter = 3382;
          DequeCursor.fourthScoreContextCounter = 5997;
          this.newActionCount = 0;
          return;
        } catch (java.lang.RuntimeException sessionConstructorException) {
          caughtConstructorFailure = sessionConstructorException;
          constructorFailure = caughtConstructorFailure;
          constructorFailureForContext = constructorFailure;
          constructorMessagePrefix = new StringBuilder().append("gh.<init>(");
          if (ownerApplet == null) {
            appletArgumentDescription = "null";
          } else {
            appletArgumentDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) constructorFailureForContext), ((StringBuilder) (Object) constructorMessagePrefix).append(appletArgumentDescription).append(',').append(enableTutorial).append(')').toString());
        }
    }

    static {
        pointerIdleTicks = 0;
    }
}
