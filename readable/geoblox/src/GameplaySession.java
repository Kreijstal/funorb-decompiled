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
    static String field_z;
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
        clientControlFlowGuard = Geoblox.field_C;
        if (0 != this.tutorialStepPhase) {
          return;
        }
        L0: {
          promptText = uk.tutorialMessageForStep(this.tutorialStepId, 24146);
          lineSpacing = fi.smallFont.maxAscent - fi.smallFont.maxDescent + lineSpacingOffset;
          promptWidthThenButtonX = 460;
          promptHeight = 30 + fi.smallFont.countWrappedLines(promptText, promptWidthThenButtonX) * lineSpacing;
          promptTop = 300;
          if (this.tutorialStepId == 0) {
            promptTop = 232;
            if (clientControlFlowGuard == 0) {
              break L0;
            }
          }
          if (this.tutorialStepId != 3) {
            if (1 != this.tutorialStepId) {
              break L0;
            }
            promptTop = 280;
            if (clientControlFlowGuard == 0) {
              break L0;
            }
          }
          promptTop = 270;
        }
        L3: {
          ma.drawNineSlicePanel(promptTop, 70, 10 + promptHeight, (byte) -92, 500, ll.frameNineSliceSprites);
          fi.smallFont.drawParagraph(promptText, 95, 15 + promptTop, promptWidthThenButtonX, 300, 1, -1, 0, 0, lineSpacing);
          if (this.tutorialStepId == 5) {
            if (PrefixCodeDecoder.pointerXSnapshot > 100) {
              if (PrefixCodeDecoder.pointerXSnapshot < 340) {
                if (ue.pointerYSnapshot > 440) {
                  if (ue.pointerYSnapshot < 476) {
                    dd.uiPaletteFont.colorPalettes[0][wf.field_p] = 15488514;
                  }
                }
              }
            }
            ma.drawNineSlicePanel(440, 100, 36, (byte) -92, 240, eb.mouseBoxFrames);
            dd.uiPaletteFont.drawCenteredText(cf.field_j, 220, 468, 0, -1);
            dd.uiPaletteFont.colorPalettes[0][wf.field_p] = 16689938;
            ma.drawNineSlicePanel(440, 380, 36, (byte) -92, 160, eb.mouseBoxFrames);
            if (380 < PrefixCodeDecoder.pointerXSnapshot) {
              if (540 > PrefixCodeDecoder.pointerXSnapshot) {
                if (ue.pointerYSnapshot > 440) {
                  if (476 > ue.pointerYSnapshot) {
                    dd.uiPaletteFont.colorPalettes[0][wf.field_p] = 15488514;
                  }
                }
              }
            }
            dd.uiPaletteFont.drawCenteredText(nk.startGameText, promptWidthThenButtonX, 468, 0, -1);
            dd.uiPaletteFont.colorPalettes[0][wf.field_p] = 16689938;
            if (clientControlFlowGuard == 0) {
              break L3;
            }
          }
          ma.drawNineSlicePanel(440, 240, 36, (byte) -92, 160, eb.mouseBoxFrames);
          if (250 < PrefixCodeDecoder.pointerXSnapshot) {
            if (PrefixCodeDecoder.pointerXSnapshot < 389) {
              if (ue.pointerYSnapshot > 440) {
                if (476 > ue.pointerYSnapshot) {
                  dd.uiPaletteFont.colorPalettes[0][wf.field_p] = 15488514;
                }
              }
            }
          }
          dd.uiPaletteFont.drawCenteredText(mi.field_y, 320, 468, 0, -1);
          dd.uiPaletteFont.colorPalettes[0][wf.field_p] = 16689938;
        }
    }

    final static boolean a(String param0, boolean param1) {
        String var2 = null;
        Exception var2_ref = null;
        RuntimeException var2_ref2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        Throwable decompiledCaughtException = null;
        var4 = Geoblox.field_C;
        try {
          try {
            if (!PlatformTaskDispatcher.osNameLowerCase.startsWith("win")) {
              return false;
            }
            if (param1) {
              return true;
            }
            if (!param0.startsWith("http://")) {
              if (!param0.startsWith("https://")) {
                return false;
              }
            }
            var2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
            var3 = 0;
            L1: while (true) {
              L2: {
                if (param0.length() > var3) {
                  stackIn_20_0 = var2.indexOf((int) param0.charAt(var3));
                  if (var4 != 0) {
                    break L2;
                  }
                  if (stackIn_20_0 == -1) {
                    return false;
                  }
                  var3++;
                  if (var4 == 0) {
                    continue L1;
                  }
                }
                Runtime.getRuntime().exec("cmd /c start \"j\" \"" + param0 + "\"");
                stackIn_20_0 = 1;
              }
              return stackIn_20_0 != 0;
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2_ref = (Exception) (Object) decompiledCaughtException;
            return false;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_25_0 = (RuntimeException) (var2_ref2);
          stackIn_25_1 = new StringBuilder().append("gh.U(");
          if (param0 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param1).append(')').toString());
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
        clientControlFlowGuard = Geoblox.field_C;
        if (!ll.themesLoaded[GameScreen.selectedThemeId]) {
          L0: {
            L1: {
              L2: {
                L3: {
                  L4: {
                    L5: {
                      L6: {
                        selectedThemeIdOrScoreBoxX = GameScreen.selectedThemeId;
                        if (selectedThemeIdOrScoreBoxX == 4) {
                          if (clientControlFlowGuard == 0) {
                            themeResourceGroup = "baking";
                            if (clientControlFlowGuard == 0) {
                              break L0;
                            }
                            break L6;
                          }
                        }
                        if (selectedThemeIdOrScoreBoxX == 6) {
                          if (clientControlFlowGuard == 0) {
                            break L6;
                          }
                        }
                        if (selectedThemeIdOrScoreBoxX == 5) {
                          if (clientControlFlowGuard == 0) {
                            break L5;
                          }
                        }
                        if (selectedThemeIdOrScoreBoxX == 0) {
                          break L4;
                        }
                        if (3 == selectedThemeIdOrScoreBoxX) {
                          if (clientControlFlowGuard == 0) {
                            break L3;
                          }
                        }
                        if (selectedThemeIdOrScoreBoxX == 2) {
                          break L2;
                        }
                        break L1;
                      }
                      themeResourceGroup = "space";
                      if (clientControlFlowGuard == 0) {
                        break L0;
                      }
                    }
                    themeResourceGroup = "sports";
                    if (clientControlFlowGuard == 0) {
                      break L0;
                    }
                  }
                  themeResourceGroup = "jewels";
                  if (clientControlFlowGuard == 0) {
                    break L0;
                  }
                }
                themeResourceGroup = "germs";
                if (clientControlFlowGuard == 0) {
                  break L0;
                }
              }
              themeResourceGroup = "sweets";
              if (clientControlFlowGuard == 0) {
                break L0;
              }
            }
            themeResourceGroup = "";
          }
          graphicsLoadingMessage = gf.formatArchiveGroupProgress(ff.waitingForGraphicsText, ll.gameGraphicsArchive, themeResourceGroup, AccountWelcomePanel.loadingGraphicsText, true);
          loadingPanelWidthOrScoreBoxY = 30 + dd.uiPaletteFont.measureTextWidth(graphicsLoadingMessage);
          ma.drawNineSlicePanel(215, 320 - loadingPanelWidthOrScoreBoxY / 2, 50, (byte) -92, loadingPanelWidthOrScoreBoxY, ll.frameNineSliceSprites);
          dd.uiPaletteFont.drawCenteredText(graphicsLoadingMessage, 320, 250, 0, -1);
          return;
        }
        L11: {
          if (ih.areEntityQueuesSettled(0)) {
            if (this.sceneTransitionRequested) {
              if (this.sceneTransitionInProgress) {
                selectedSceneTransitionFlag = 1;
                break L11;
              }
            }
          }
          selectedSceneTransitionFlag = 0;
        }
        L13: {
          sceneTransitionFlag = selectedSceneTransitionFlag;
          if (sceneTransitionFlag == 0) {
            if (!this.boardRasterDirty) {
              oc.boardSceneRaster.setAsRasterTarget();
              if (this.debugReducedRendering) {
                break L13;
              }
              gj.drawSpecialAttachedEntities((byte) -63);
              if (clientControlFlowGuard == 0) {
                break L13;
              }
            }
            oc.boardSceneRaster.setAsRasterTarget();
            SoftwareRasterizer.clearFramebuffer();
            if (!this.debugReducedRendering) {
              dc.drawAttachedEntities(7838);
            }
            k.a(10, 90, 460, -27085, 460);
            this.boardRasterDirty = false;
          }
        }
        sh.mainRasterBuffer.setAsRasterTarget(255);
        mf.selectedThemeBackground.drawRunEncoded(0, 0);
        selectedThemeIdOrScoreBoxX = 4;
        loadingPanelWidthOrScoreBoxY = 4;
        if (methodGuard >= -28) {
          this.updateSession(-63);
        }
        L17: {
          if (this.showGameOverOverlay) {
            if (this.sceneAnimationTick <= 266) {
              gameOverAnimationProgress = (float)this.sceneAnimationTick / 266.0f;
              gameOverAnimationRemainder = -gameOverAnimationProgress + 1.0f;
              gameOverAnimationRemainderSquared = gameOverAnimationRemainder * gameOverAnimationRemainder;
              selectedThemeIdOrScoreBoxX = (int)(0.5f + (70.0f * (2.0f * gameOverAnimationProgress * gameOverAnimationRemainder) + 10.0f * gameOverAnimationRemainderSquared + 220.0f * (gameOverAnimationProgress * gameOverAnimationProgress)));
              loadingPanelWidthOrScoreBoxY = (int)(170.0f * (gameOverAnimationProgress * gameOverAnimationProgress) + (gameOverAnimationRemainderSquared * 10.0f + 140.0f * (gameOverAnimationProgress * 2.0f * gameOverAnimationRemainder)) + 0.5f);
              if (clientControlFlowGuard == 0) {
                break L17;
              }
            }
            selectedThemeIdOrScoreBoxX = 220;
            loadingPanelWidthOrScoreBoxY = 170;
          }
        }
        L19: {
          if (this.tutorialMode) {
            tutorialTopOrDebugColorOrTransitionClipTop = 176 - this.updateTick / 2;
            if (10 > tutorialTopOrDebugColorOrTransitionClipTop) {
              tutorialTopOrDebugColorOrTransitionClipTop = 10;
            }
            tutorialLineHeightOrDebugEntityRadius = -fi.smallFont.maxDescent + fi.smallFont.maxAscent;
            tutorialPanelWidth = fi.smallFont.measureMaximumWrappedWidth(v.tutorialSkipMessage, 640) + 40;
            tutorialTextHeightOrDebugPanelTop = fi.smallFont.countWrappedLines(v.tutorialSkipMessage, 640) * tutorialLineHeightOrDebugEntityRadius + 10;
            ma.drawNineSlicePanel(tutorialTopOrDebugColorOrTransitionClipTop, -(tutorialPanelWidth / 2) + 320, 20 + tutorialTextHeightOrDebugPanelTop, (byte) -92, tutorialPanelWidth, ll.frameNineSliceSprites);
            fi.smallFont.drawCenteredText(v.tutorialSkipMessage, 320, tutorialTopOrDebugColorOrTransitionClipTop + 28, 1, -1);
            fi.smallFont.drawCenteredText(v.tutorialSkipMessage, 319, 28 + tutorialTopOrDebugColorOrTransitionClipTop, 1, -1);
            if (clientControlFlowGuard == 0) {
              break L19;
            }
          }
          L22: {
            lj.smallBoxSprite.draw(selectedThemeIdOrScoreBoxX, loadingPanelWidthOrScoreBoxY);
            if (0 == this.sessionPhase) {
              if (!ih.areEntityQueuesSettled(0)) {
                break L22;
              }
            }
            vh.largeBoxSprite.draw(446, 410);
            if (clientControlFlowGuard == 0) {
              break L19;
            }
          }
          g.countBoxSprite.draw(468, 410);
        }
        L24: {
          if (!this.tutorialMode) {
            if (ih.areEntityQueuesSettled(0)) {
              if (sceneTransitionFlag == 0) {
                break L24;
              }
              if (0 != this.sessionPhase) {
                if (this.sessionPhase != 1) {
                  break L24;
                }
              }
            }
            this.renderProgressHud(-46);
          }
        }
        if (!this.debugReducedRendering) {
          h.drawMovingEntities(-1);
        }
        if (!this.debugReducedRendering) {
          if (sceneTransitionFlag == 0) {
            oc.boardSceneRaster.draw(0, 0);
          }
        }
        ij.drawAvatarFaceOrCryFrame((byte) 18);
        if (!this.debugReducedRendering) {
          ni.drawTransientEntities(484842465);
        }
        jf.rotatedThemeForegroundRaster.setAsRasterTarget();
        SoftwareRasterizer.clearFramebuffer();
        ec.selectedThemeForeground.rotateNearest(ec.selectedThemeForeground.fullWidth << 3, ec.selectedThemeForeground.fullHeight << 3, jf.rotatedThemeForegroundRaster.fullWidth << 3, jf.rotatedThemeForegroundRaster.fullHeight << 3, (int)(65535.0 * ((double)(-this.boardAngleRadians) / 6.283185307179586)), 4096);
        sh.mainRasterBuffer.setAsRasterTarget(255);
        w.a(jf.rotatedThemeForegroundRaster, -(jf.rotatedThemeForegroundRaster.fullWidth >> 1) + 320, -(jf.rotatedThemeForegroundRaster.fullHeight >> 1) + 240);
        if (!this.debugReducedRendering) {
          uh.drawSpawnQueueAndHighlight(4740);
        }
        L30: {
          if (this.showDebugOverview) {
            af.debugOverviewRaster.setAsRasterTarget();
            SoftwareRasterizer.fillRectangle(0, 0, SoftwareRasterizer.stride, SoftwareRasterizer.framebufferHeight, 1118481);
            tutorialTopOrDebugColorOrTransitionClipTop = 16777215;
            SoftwareRasterizer.drawCircle(160, 120, 115, 16711680);
            tutorialLineHeightOrDebugEntityRadius = 20;
            debugSpawnQueueSnapshot = SecondaryDeque.spawnQueue;
            renderedEntity = (GameplayEntity) ((Object) debugSpawnQueueSnapshot.lastForIteration(false));
            L31: while (true) {
              L32: {
                if (renderedEntity != null) {
                  entityOffsetX = -320.0f + renderedEntity.positionX;
                  entityOffsetY = -240.0f + renderedEntity.positionY;
                  debugEntityXOrTutorialTextHeight = (int)(320.0 + (Math.cos((double)el.gameplaySession.boardAngleRadians) * (double)entityOffsetX - Math.sin((double)el.gameplaySession.boardAngleRadians) * (double)entityOffsetY));
                  renderedEntityY = (int)(240.0 + ((double)entityOffsetX * Math.sin((double)el.gameplaySession.boardAngleRadians) + (double)entityOffsetY * Math.cos((double)el.gameplaySession.boardAngleRadians)));
                  spawnEntityGrayLevel = 255 - renderedEntity.remainingLifetimeTicks * 255 / renderedEntity.initialLifetimeTicks;
                  minimumGrayLevelOrCompositeHeight = 11;
                  grayLevelForComparisonOrCompositeEnabled = spawnEntityGrayLevel;
                  if (clientControlFlowGuard != 0) {
                    break L32;
                  }
                  if (minimumGrayLevelOrCompositeHeight > grayLevelForComparisonOrCompositeEnabled) {
                    spawnEntityGrayLevel = 11;
                  }
                  if (spawnEntityGrayLevel > 255) {
                    spawnEntityGrayLevel = 255;
                  }
                  SoftwareRasterizer.fillCircle(debugEntityXOrTutorialTextHeight / 2, renderedEntityY / 2, tutorialLineHeightOrDebugEntityRadius, spawnEntityGrayLevel << 8 | spawnEntityGrayLevel << 16 | spawnEntityGrayLevel);
                  renderedEntity = (GameplayEntity) ((Object) debugSpawnQueueSnapshot.previousForIteration(0));
                  if (clientControlFlowGuard == 0) {
                    continue L31;
                  }
                }
                debugMovingQueueSnapshot = ArchiveNetworkClient.movingEntities;
                debugEntityQueue = debugMovingQueueSnapshot;
                renderedEntity = (GameplayEntity) ((Object) debugMovingQueueSnapshot.firstForIteration(0));
                L36: while (true) {
                  L37: {
                    if (null != renderedEntity) {
                      entityOffsetX = -320.0f + renderedEntity.positionX;
                      entityOffsetY = -240.0f + renderedEntity.positionY;
                      debugEntityXOrTutorialTextHeight = (int)(Math.cos((double)el.gameplaySession.boardAngleRadians) * (double)entityOffsetX - Math.sin((double)el.gameplaySession.boardAngleRadians) * (double)entityOffsetY + 320.0);
                      renderedEntityY = (int)(240.0 + ((double)entityOffsetX * Math.sin((double)el.gameplaySession.boardAngleRadians) + (double)entityOffsetY * Math.cos((double)el.gameplaySession.boardAngleRadians)));
                      SoftwareRasterizer.fillCircle(debugEntityXOrTutorialTextHeight / 2, renderedEntityY / 2, tutorialLineHeightOrDebugEntityRadius, tutorialTopOrDebugColorOrTransitionClipTop);
                      renderedEntity = (GameplayEntity) ((Object) debugMovingQueueSnapshot.nextForIteration(1));
                      if (clientControlFlowGuard != 0) {
                        break L37;
                      }
                      if (clientControlFlowGuard == 0) {
                        continue L36;
                      }
                    }
                    debugEntityQueue = a.attachedEntities;
                  }
                  renderedEntity = (GameplayEntity) ((Object) debugEntityQueue.firstForIteration(0));
                  L39: while (true) {
                    L40: {
                      if (renderedEntity != null) {
                        SoftwareRasterizer.fillCircle((int)(renderedEntity.positionX / 2.0f), (int)(renderedEntity.positionY / 2.0f), tutorialLineHeightOrDebugEntityRadius, tutorialTopOrDebugColorOrTransitionClipTop);
                        renderedEntity = (GameplayEntity) ((Object) debugEntityQueue.nextForIteration(1));
                        if (clientControlFlowGuard != 0) {
                          break L40;
                        }
                        if (clientControlFlowGuard == 0) {
                          continue L39;
                        }
                      }
                      debugEntityQueue = bh.transientEntities;
                    }
                    renderedEntity = (GameplayEntity) ((Object) debugEntityQueue.firstForIteration(0));
                    L42: while (true) {
                      L43: {
                        L44: {
                          if (renderedEntity != null) {
                            SoftwareRasterizer.fillCircle((int)(renderedEntity.positionX / 2.0f), (int)(renderedEntity.positionY / 2.0f), tutorialLineHeightOrDebugEntityRadius, tutorialTopOrDebugColorOrTransitionClipTop);
                            renderedEntity = (GameplayEntity) ((Object) debugEntityQueue.nextForIteration(1));
                            if (clientControlFlowGuard != 0) {
                              break L44;
                            }
                            if (clientControlFlowGuard == 0) {
                              continue L42;
                            }
                          }
                          if (this.tutorialMode) {
                            tutorialTextHeightOrDebugPanelTop = -(this.updateTick / 2) + 176;
                            if (tutorialTextHeightOrDebugPanelTop < 10) {
                              tutorialTextHeightOrDebugPanelTop = 10;
                            }
                            debugTutorialLineHeight = fi.smallFont.maxAscent - fi.smallFont.maxDescent;
                            debugTutorialPanelWidth = fi.smallFont.measureMaximumWrappedWidth(v.tutorialSkipMessage, 640) + 40;
                            debugEntityXOrTutorialTextHeight = fi.smallFont.countWrappedLines(v.tutorialSkipMessage, 640) * debugTutorialLineHeight + 10;
                            SoftwareRasterizer.fillRectangle((320 - debugTutorialPanelWidth / 2) / 2, tutorialTextHeightOrDebugPanelTop / 2, debugTutorialPanelWidth / 2, (20 + debugEntityXOrTutorialTextHeight) / 2, tutorialTopOrDebugColorOrTransitionClipTop);
                            break L43;
                          }
                          lj.smallBoxSprite.drawScaledSilhouette(selectedThemeIdOrScoreBoxX / 2, loadingPanelWidthOrScoreBoxY / 2, lj.smallBoxSprite.fullWidth / 2, lj.smallBoxSprite.fullHeight / 2, tutorialTopOrDebugColorOrTransitionClipTop);
                        }
                        if (this.sessionPhase == 0) {
                          if (!ih.areEntityQueuesSettled(0)) {
                            g.countBoxSprite.drawScaledSilhouette(234, 205, g.countBoxSprite.fullWidth / 2, g.countBoxSprite.fullHeight / 2, tutorialTopOrDebugColorOrTransitionClipTop);
                            if (clientControlFlowGuard == 0) {
                              break L43;
                            }
                          }
                        }
                        vh.largeBoxSprite.drawScaledSilhouette(223, 205, vh.largeBoxSprite.fullWidth / 2, vh.largeBoxSprite.fullHeight / 2, tutorialTopOrDebugColorOrTransitionClipTop);
                      }
                      SoftwareRasterizer.fillCircle(160, 120, 21, 16777215);
                      SoftwareRasterizer.blurRasterRegion(2, 2, 0, 0, SoftwareRasterizer.stride, SoftwareRasterizer.framebufferHeight);
                      sh.mainRasterBuffer.setAsRasterTarget(255);
                      minimumGrayLevelOrCompositeHeight = SoftwareRasterizer.framebufferHeight;
                      grayLevelForComparisonOrCompositeEnabled = 1;
                      break L32;
                    }
                  }
                }
              }
              ek.compositeScaledDebugOverview(minimumGrayLevelOrCompositeHeight, grayLevelForComparisonOrCompositeEnabled != 0, af.debugOverviewRaster, 0, SoftwareRasterizer.stride, 0);
              break L30;
            }
          }
        }
        L48: {
          if (!this.tutorialMode) {
            if (this.delayedActionCountdown > 0) {
              lj.smallBoxSprite.draw(-(lj.smallBoxSprite.fullWidth >> 1) + 320, 60 - (lj.smallBoxSprite.fullHeight >> 1) + 240);
              dd.uiPaletteFont.drawCenteredText(KeyboardInputListener.field_b, 320, 310, 0, -1);
            }
            eg.pointsPanelGlowFrames[this.pointsPanelFrameIndex].draw(this.pointsPanelX, 4);
            if (640 > this.pointsPanelX) {
              if (0 < this.pendingPopupPoints) {
                dd.uiPaletteFont.drawText(wj.a(ic.field_a, new String[]{this.popupPointsText.toString()}, (byte) -79), this.pointsPanelX + 20, 34, 0, -1);
              }
            }
            if (this.showSessionCounters) {
              dd.uiPaletteFont.drawText(wj.a(sh.field_z, new String[]{Integer.toString(ec.field_b)}, (byte) -26), 400, 50, 0, -1);
              dd.uiPaletteFont.drawText(wj.a(qg.field_e, new String[]{Integer.toString(ArchiveNetworkClient.difficultyStep)}, (byte) -71), 400, 80, 0, -1);
            }
            L53: {
              bd.drawScorePopups(-117);
              this.c((byte) 64);
              if (this.showGameOverOverlay) {
                lj.smallBoxSprite.draw(selectedThemeIdOrScoreBoxX, loadingPanelWidthOrScoreBoxY);
                if (this.sceneAnimationTick < 266) {
                  kh.screenTitleSprites[6].draw(0, (this.sceneAnimationTick >> 1) - 113);
                  if (clientControlFlowGuard == 0) {
                    break L53;
                  }
                }
                kh.screenTitleSprites[6].draw(0, 20);
                kh.screenTitleSprites[6].drawAdditive(0, 20, (int)(Math.cos((double)(-266 + this.sceneAnimationTick) / 40.0) * -64.0 + 64.0));
              }
            }
            L55: {
              dd.uiPaletteFont.drawText(wj.a(pa.field_a, new String[]{this.scoreText.toString()}, (byte) -53), 15 + selectedThemeIdOrScoreBoxX, 30 + loadingPanelWidthOrScoreBoxY, 0, -1);
              if (ih.areEntityQueuesSettled(0)) {
                L56: {
                  if (0 != this.sessionPhase) {
                    if (this.sessionPhase != 1) {
                      break L56;
                    }
                  }
                  if (sceneTransitionFlag == 0) {
                    break L55;
                  }
                  tutorialTopOrDebugColorOrTransitionClipTop = 35 + (6 * this.sceneAnimationTick - 480);
                  sh.mainRasterBuffer.setAsRasterTarget(255);
                  SoftwareRasterizer.setClip(0, tutorialTopOrDebugColorOrTransitionClipTop, 640, 480);
                  oc.boardSceneRaster.draw(0, 0);
                  SoftwareRasterizer.setClip(0, 0, 640, 480);
                  qj.transitionCurtain.draw(0, -480 + 6 * this.sceneAnimationTick);
                  if (clientControlFlowGuard == 0) {
                    break L55;
                  }
                }
                this.renderResultSequence(false);
              }
            }
            vc.drawPendingActionPanel(-1);
            if (clientControlFlowGuard == 0) {
              break L48;
            }
          }
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
        L0: {
          clientControlFlowGuard = Geoblox.field_C;
          lh.a(methodGuard ^ 1578896222);
          pointsPanelTickBeforeIncrement = this.updateTick;
          this.updateTick = this.updateTick + 1;
          if ((pointsPanelTickBeforeIncrement & 15) == 0) {
            this.pointsPanelFrameIndex = this.pointsPanelFrameIndex + this.pointsPanelFrameDirection;
            if (7 != this.pointsPanelFrameIndex) {
              if (this.pointsPanelFrameIndex != 0) {
                break L0;
              }
              this.pointsPanelFrameDirection = 1;
              if (clientControlFlowGuard == 0) {
                break L0;
              }
            }
            this.pointsPanelFrameDirection = -1;
          }
        }
        L2: {
          if (0 == (this.updateTick & 1)) {
            L3: {
              if (-1 == this.pointsPanelSlideDirection) {
                if (463 < this.pointsPanelX) {
                  break L3;
                }
              }
              L5: {
                if (this.pointsPanelSlideDirection == 1) {
                  if (this.pointsPanelX < 640) {
                    break L5;
                  }
                }
                if (this.pointsPanelX != 463) {
                  break L2;
                }
                if (gf.matchChainLength != 0) {
                  break L2;
                }
                this.pointsPanelSlideDirection = 1;
                el.gameplaySession.emitPointsPopup(false);
                if (clientControlFlowGuard == 0) {
                  break L2;
                }
              }
              this.pointsPanelX = this.pointsPanelX + 1;
              if (clientControlFlowGuard == 0) {
                break L2;
              }
            }
            this.pointsPanelX = this.pointsPanelX - 1;
          }
        }
        L7: {
          if (!this.sessionEnding) {
            L9: {
              L10: {
                if (ih.areEntityQueuesSettled(0)) {
                  if (!this.matchBatchProcessedThisTick) {
                    break L10;
                  }
                }
                if (this.preserveScoreOnTransition) {
                  break L9;
                }
              }
              if (this.canAdvanceSession(true)) {
                L12: {
                  if (0 != this.sessionPhase) {
                    if (this.sessionPhase != 5) {
                      break L12;
                    }
                  }
                  if (!this.sceneTransitionRequested) {
                    break L7;
                  }
                  this.updateSceneTransition((byte) -80);
                  if (clientControlFlowGuard == 0) {
                    break L7;
                  }
                }
                this.updateResultSequence(10);
                if (clientControlFlowGuard == 0) {
                  break L7;
                }
              }
            }
            if (!ll.themesLoaded[GameScreen.selectedThemeId]) {
              return;
            }
            L14: {
              if (!this.rotationControlsSwapped) {
                negativeRotationKeyCode = 96;
                positiveRotationKeyCode = 97;
                if (clientControlFlowGuard == 0) {
                  break L14;
                }
              }
              positiveRotationKeyCode = 96;
              negativeRotationKeyCode = 97;
            }
            if (kj.heldInternalKeys[negativeRotationKeyCode]) {
              L17: {
                this.boardAngleRadians = this.boardAngleRadians - DualLinkNode.rotationStepRadians;
                ScorePopup.setAvatarNegativeRotationSteering((byte) 38);
                inputDerivedModuloIndex = (ki.currentKeyboardEventCode + kd.field_c + PrefixCodeDecoder.pointerXSnapshot + he.pointerPressYSnapshot) % 8;
                if (inputDerivedModuloIndex == 0) {
                  oa.field_a = oa.field_a + kb.field_d;
                  gb.field_g = gb.field_g - 1;
                  if (clientControlFlowGuard == 0) {
                    break L17;
                  }
                }
                if (inputDerivedModuloIndex == 1) {
                  oa.field_a = oa.field_a + gb.field_g;
                  kb.field_d = kb.field_d - 1;
                  if (clientControlFlowGuard == 0) {
                    break L17;
                  }
                }
                if (inputDerivedModuloIndex != 2) {
                  if (3 == inputDerivedModuloIndex) {
                    oa.field_a = oa.field_a - gb.field_g;
                    kb.field_d = kb.field_d + 1;
                    if (clientControlFlowGuard == 0) {
                      break L17;
                    }
                  }
                  if (4 == inputDerivedModuloIndex) {
                    ml.field_r = ml.field_r + kb.field_d;
                    gb.field_g = gb.field_g + 1;
                    if (clientControlFlowGuard == 0) {
                      break L17;
                    }
                  }
                  if (inputDerivedModuloIndex == 5) {
                    kb.field_d = kb.field_d + 1;
                    ml.field_r = ml.field_r + gb.field_g;
                    if (clientControlFlowGuard == 0) {
                      break L17;
                    }
                  }
                  if (inputDerivedModuloIndex == 6) {
                    ml.field_r = ml.field_r - kb.field_d;
                    gb.field_g = gb.field_g - 1;
                    if (clientControlFlowGuard == 0) {
                      break L17;
                    }
                  }
                  if (inputDerivedModuloIndex != 7) {
                    break L17;
                  }
                  kb.field_d = kb.field_d - 1;
                  ml.field_r = ml.field_r - gb.field_g;
                  if (clientControlFlowGuard == 0) {
                    break L17;
                  }
                }
                gb.field_g = gb.field_g + 1;
                oa.field_a = oa.field_a - kb.field_d;
              }
              L25: {
                inputDerivedModuloIndex = (kd.field_c + he.pointerPressYSnapshot + PrefixCodeDecoder.pointerXSnapshot + ki.currentKeyboardEventCode) % 5;
                if (0 == inputDerivedModuloIndex) {
                  dc.field_a = dc.field_a | lb.field_b + el.field_g << 17;
                  if (clientControlFlowGuard == 0) {
                    break L25;
                  }
                }
                if (inputDerivedModuloIndex != 1) {
                  if (inputDerivedModuloIndex != 2) {
                    if (3 == inputDerivedModuloIndex) {
                      AwtRasterBuffer.field_f = AwtRasterBuffer.field_f + 1;
                      el.field_g = el.field_g + lb.field_b;
                      if (clientControlFlowGuard == 0) {
                        break L25;
                      }
                    }
                    if (inputDerivedModuloIndex != 4) {
                      break L25;
                    }
                    AwtRasterBuffer.field_f = AwtRasterBuffer.field_f - 1;
                    el.field_g = el.field_g - lb.field_b;
                    if (clientControlFlowGuard == 0) {
                      break L25;
                    }
                  }
                  lb.field_b = lb.field_b - 1;
                  el.field_g = el.field_g - AwtRasterBuffer.field_f;
                  if (clientControlFlowGuard == 0) {
                    break L25;
                  }
                }
                el.field_g = el.field_g + AwtRasterBuffer.field_f;
                lb.field_b = lb.field_b + 1;
              }
              if (this.tutorialStepId == 0) {
                this.tutorialProgressMetric = this.tutorialProgressMetric + 1;
              }
            }
            L30: {
              if (kj.heldInternalKeys[positiveRotationKeyCode]) {
                this.boardAngleRadians = this.boardAngleRadians + DualLinkNode.rotationStepRadians;
                SecondaryDeque.setAvatarPositiveRotationSteering((byte) 74);
                if (this.tutorialStepId == 0) {
                  this.tutorialProgressMetric = this.tutorialProgressMetric + 1;
                }
                L32: {
                  inputDerivedModuloIndex = (he.pointerPressYSnapshot + (PrefixCodeDecoder.pointerXSnapshot + kd.field_c) + ki.currentKeyboardEventCode) % 8;
                  if (inputDerivedModuloIndex != 0) {
                    if (1 != inputDerivedModuloIndex) {
                      if (inputDerivedModuloIndex != 2) {
                        if (inputDerivedModuloIndex == 3) {
                          kb.field_d = kb.field_d + 1;
                          oa.field_a = oa.field_a - gb.field_g;
                          if (clientControlFlowGuard == 0) {
                            break L32;
                          }
                        }
                        if (4 == inputDerivedModuloIndex) {
                          gb.field_g = gb.field_g + 1;
                          ml.field_r = ml.field_r + kb.field_d;
                          if (clientControlFlowGuard == 0) {
                            break L32;
                          }
                        }
                        if (5 == inputDerivedModuloIndex) {
                          kb.field_d = kb.field_d + 1;
                          ml.field_r = ml.field_r + gb.field_g;
                          if (clientControlFlowGuard == 0) {
                            break L32;
                          }
                        }
                        if (inputDerivedModuloIndex == 6) {
                          ml.field_r = ml.field_r - kb.field_d;
                          gb.field_g = gb.field_g - 1;
                          if (clientControlFlowGuard == 0) {
                            break L32;
                          }
                        }
                        if (inputDerivedModuloIndex != 7) {
                          break L32;
                        }
                        kb.field_d = kb.field_d - 1;
                        ml.field_r = ml.field_r - gb.field_g;
                        if (clientControlFlowGuard == 0) {
                          break L32;
                        }
                      }
                      gb.field_g = gb.field_g + 1;
                      oa.field_a = oa.field_a - kb.field_d;
                      if (clientControlFlowGuard == 0) {
                        break L32;
                      }
                    }
                    oa.field_a = oa.field_a + gb.field_g;
                    kb.field_d = kb.field_d - 1;
                    if (clientControlFlowGuard == 0) {
                      break L32;
                    }
                  }
                  gb.field_g = gb.field_g - 1;
                  oa.field_a = oa.field_a + kb.field_d;
                }
                inputDerivedModuloIndex = (kd.field_c + PrefixCodeDecoder.pointerXSnapshot + he.pointerPressYSnapshot + ki.currentKeyboardEventCode) % 5;
                if (inputDerivedModuloIndex != 0) {
                  if (1 != inputDerivedModuloIndex) {
                    if (2 != inputDerivedModuloIndex) {
                      if (inputDerivedModuloIndex == 3) {
                        AwtRasterBuffer.field_f = AwtRasterBuffer.field_f + 1;
                        el.field_g = el.field_g + lb.field_b;
                        if (clientControlFlowGuard == 0) {
                          break L30;
                        }
                      }
                      if (4 != inputDerivedModuloIndex) {
                        break L30;
                      }
                      el.field_g = el.field_g - lb.field_b;
                      AwtRasterBuffer.field_f = AwtRasterBuffer.field_f - 1;
                      if (clientControlFlowGuard == 0) {
                        break L30;
                      }
                    }
                    lb.field_b = lb.field_b - 1;
                    el.field_g = el.field_g - AwtRasterBuffer.field_f;
                    if (clientControlFlowGuard == 0) {
                      break L30;
                    }
                  }
                  lb.field_b = lb.field_b + 1;
                  el.field_g = el.field_g + AwtRasterBuffer.field_f;
                  if (clientControlFlowGuard == 0) {
                    break L30;
                  }
                }
                dc.field_a = dc.field_a | el.field_g + lb.field_b << 17;
              }
            }
            L44: {
              L45: {
                if (kj.heldInternalKeys[99]) {
                  if (!this.tutorialPromptActive) {
                    fastForwardEntity = (GameplayEntity) ((Object) ArchiveNetworkClient.movingEntities.firstForIteration(0));
                    L46: while (true) {
                      if (null == fastForwardEntity) {
                        break L45;
                      }
                      detachedEntityOrPositiveRotationKeySnapshot = fastForwardEntity.detachedFromBoard;
                      if (clientControlFlowGuard != 0) {
                        break L44;
                      }
                      if (!detachedEntityOrPositiveRotationKeySnapshot) {
                        fastForwardEntity.positionY = fastForwardEntity.positionY + 4.0f * fastForwardEntity.velocityY;
                        fastForwardEntity.positionX = fastForwardEntity.positionX + 4.0f * fastForwardEntity.velocityX;
                        if (clientControlFlowGuard == 0) {
                          break L45;
                        }
                      }
                      fastForwardEntity = (GameplayEntity) ((Object) ArchiveNetworkClient.movingEntities.nextForIteration(1));
                      if (clientControlFlowGuard == 0) {
                        continue L46;
                      }
                      break L45;
                    }
                  }
                }
              }
              detachedEntityOrPositiveRotationKeySnapshot = kj.heldInternalKeys[positiveRotationKeyCode];
            }
            if (!detachedEntityOrPositiveRotationKeySnapshot) {
              if (!kj.heldInternalKeys[negativeRotationKeyCode]) {
                jj.clearAvatarSteering(-106);
              }
            }
            this.delayedActionCountdown = this.delayedActionCountdown - 1;
            if (this.delayedActionCountdown == 0) {
              ld.spawnPointsPopup(310, 320, 123, 100 + 100 * ArchiveNetworkClient.difficultyStep);
            }
            L50: {
              if (!fa.entitiesDetachedThisTick) {
                if (a.attachedEntities.isEmpty(13519)) {
                  if (0 < ul.releasedInCurrentTheme) {
                    nextBoardClearBonusEligible = true;
                    break L50;
                  }
                }
              }
              nextBoardClearBonusEligible = false;
            }
            L52: {
              ((GameplaySession) (this)).boardClearBonusEligible = nextBoardClearBonusEligible;
              if (this.boardClearBonusEligible) {
                if (this.connectivityRebuiltThisTick) {
                  this.connectivityRebuiltThisTick = false;
                  this.delayedActionCountdown = 300;
                  this.boardClearBonusEligible = false;
                  ra.a(PointerInputListener.field_a ^ 255, -88, PointerInputListener.field_a);
                  if (clientControlFlowGuard == 0) {
                    break L52;
                  }
                }
              }
              this.connectivityRebuiltThisTick = false;
            }
            this.boundaryCheckRequested = ab.boardContactStateDirty;
            ef.advanceActiveEntityAnimations((byte) -15);
            kc.reconcileBoardEntities(methodGuard + 1578896101);
            if (ab.boardContactStateDirty) {
              ul.collectMatchCandidates(-2);
            }
            this.matchBatchProcessedThisTick = ec.processMatchCandidates(-18913);
            if (this.boundaryCheckRequested) {
              sk.checkBoundaryLossAndStartCascade(methodGuard ^ 1578896190);
            }
            cf.advanceScorePopups((byte) 27);
            f.advanceGameplayAvatarAnimation(600);
            if (this.tutorialMode) {
              this.advanceTutorialStep(109);
            }
            if (clientControlFlowGuard == 0) {
              break L7;
            }
          }
          if (this.sceneAnimationTick == 0) {
            fi.a(methodGuard ^ -1578896191, pi.field_S);
          }
          if (pf.field_D) {
            if (od.a(-3)) {
              if (this.sceneAnimationTick > 1000) {
                this.requestSessionExitScreen(28809);
              }
            }
          }
          fc.a(19);
          cf.advanceScorePopups((byte) 24);
          f.advanceGameplayAvatarAnimation(600);
          this.sceneAnimationTick = this.sceneAnimationTick + 1;
          this.boardRasterDirty = true;
        }
        if (methodGuard != -1578896191) {
          this.scoreText = (StringBuilder) null;
        }
        L60: while (true) {
          L61: {
            if (hh.pollKeyboardEvent(111)) {
              if (te.currentKeyboardEventCharacter > 0) {
                PacketBuffer.field_r = PacketBuffer.field_r.substring(1) + te.currentKeyboardEventCharacter;
                if (PacketBuffer.field_r.equalsIgnoreCase("fog")) {
                  if (this.showDebugOverview) {
                    toggledDebugOverview = false;
                  } else {
                    toggledDebugOverview = true;
                  }
                  ((GameplaySession) (this)).showDebugOverview = toggledDebugOverview;
                }
                if (oc.field_f >= 2) {
                  if (PacketBuffer.field_r.equalsIgnoreCase("brk")) {
                    this.gameApplet.h((byte) 41);
                  }
                }
              }
              if (ki.currentKeyboardEventCode == 13) {
                if (!this.sessionEnding) {
                  ai.requestedScreenId = 1;
                  if (clientControlFlowGuard == 0) {
                    return;
                  }
                }
                this.requestSessionExitScreen(28809);
                return;
              }
              if (ki.currentKeyboardEventCode == 83) {
                if (this.tutorialMode) {
                  this.leaveTutorial(7000);
                }
              }
              L67: {
                if (ki.currentKeyboardEventCode == 84) {
                  if (this.tutorialStepPhase == 0) {
                    this.tutorialStepPhase = 1;
                    this.tutorialPromptActive = false;
                    if (this.tutorialStepId != 0) {
                      if (this.tutorialStepId != 1) {
                        if (this.tutorialStepId != 2) {
                          break L67;
                        }
                        this.tutorialProgressMetric = dk.categoryMatchCandidateCount;
                        if (clientControlFlowGuard == 0) {
                          break L67;
                        }
                      }
                      this.tutorialProgressMetric = dd.variantMatchCandidateCount;
                      if (clientControlFlowGuard == 0) {
                        break L67;
                      }
                    }
                    this.tutorialProgressMetric = 0;
                  }
                }
              }
              if (ki.currentKeyboardEventCode == 85) {
                if (5 == this.tutorialStepId) {
                  if (this.tutorialStepPhase == 0) {
                    this.leaveTutorial(methodGuard ^ -1578897511);
                    this.tutorialMode = true;
                    this.tutorialStepId = 0;
                    this.tutorialPromptActive = true;
                  }
                }
              }
              if (jg.swapRotationControlsKeyCode == ki.currentKeyboardEventCode) {
                if (this.rotationControlsSwapped) {
                  toggledRotationControlsSwapped = false;
                } else {
                  toggledRotationControlsSwapped = true;
                }
                ((GameplaySession) (this)).rotationControlsSwapped = toggledRotationControlsSwapped;
                jc.requestAvatarFeedback(7, false);
              }
              if (2 > oc.field_f) {
                continue L60;
              }
              debugKeyCodeOrPointerEventComplement = ki.currentKeyboardEventCode;
              debugKeySentinelOrPointerEventSentinel = 48;
              if (clientControlFlowGuard != 0) {
                break L61;
              }
              if (debugKeyCodeOrPointerEventComplement == debugKeySentinelOrPointerEventSentinel) {
                this.debugSpawnVariantId = this.debugSpawnVariantId - 1;
                if (this.debugSpawnVariantId < 0) {
                  this.debugSpawnVariantId = 6;
                }
              }
              if (ki.currentKeyboardEventCode == 49) {
                this.debugSpawnVariantId = this.debugSpawnVariantId + 1;
                if (this.debugSpawnVariantId == 7) {
                  this.debugSpawnVariantId = 0;
                }
              }
              if (ki.currentKeyboardEventCode == 64) {
                this.debugSpawnCategoryId = this.debugSpawnCategoryId - 1;
                if (this.debugSpawnCategoryId < 0) {
                  this.debugSpawnCategoryId = 6;
                }
              }
              if (32 == ki.currentKeyboardEventCode) {
                if (this.debugSpawnSpecialKinds) {
                  toggledSpecialKindSpawn = false;
                } else {
                  toggledSpecialKindSpawn = true;
                }
                ((GameplaySession) (this)).debugSpawnSpecialKinds = toggledSpecialKindSpawn;
              }
              if (ki.currentKeyboardEventCode == 65) {
                this.debugSpawnCategoryId = this.debugSpawnCategoryId + 1;
                if (this.debugSpawnCategoryId == 7) {
                  this.debugSpawnCategoryId = 0;
                }
              }
              if (ki.currentKeyboardEventCode == 16) {
                this.tutorialAdvanceRequested = true;
              }
              if (68 == ki.currentKeyboardEventCode) {
                this.sessionPhase = 1;
                this.submissionBlocked = true;
              }
              if (ki.currentKeyboardEventCode == 1) {
                this.submissionBlocked = true;
                if (this.debugPointerSpawnEnabled) {
                  toggledDebugPointerSpawn = false;
                } else {
                  toggledDebugPointerSpawn = true;
                }
                ((GameplaySession) (this)).debugPointerSpawnEnabled = toggledDebugPointerSpawn;
              }
              if (2 == ki.currentKeyboardEventCode) {
                if (this.spawnReleaseDisabled) {
                  toggledSpawnReleaseDisabled = false;
                } else {
                  toggledSpawnReleaseDisabled = true;
                }
                ((GameplaySession) (this)).spawnReleaseDisabled = toggledSpawnReleaseDisabled;
                this.submissionBlocked = true;
              }
              if (ki.currentKeyboardEventCode == 3) {
                ag.availableSpriteVariantCount = 7;
                f.availableEntityCategoryCount = 7;
              }
              if (ki.currentKeyboardEventCode == 4) {
                hd.recordEntityRelease(2);
                this.submissionBlocked = true;
              }
              if (ki.currentKeyboardEventCode == 5) {
                GameScreen.selectedThemeId = 1;
                IntrusiveNode.a(methodGuard ^ 1578896207, GameScreen.selectedThemeId);
                cd.selectThemeRenderAssets((byte) 110);
              }
              if (ki.currentKeyboardEventCode == 6) {
                GameScreen.selectedThemeId = 0;
                IntrusiveNode.a(-126, GameScreen.selectedThemeId);
                cd.selectThemeRenderAssets((byte) 126);
              }
              if (7 == ki.currentKeyboardEventCode) {
                GameScreen.selectedThemeId = 6;
                IntrusiveNode.a(-99, GameScreen.selectedThemeId);
                cd.selectThemeRenderAssets((byte) 113);
              }
              if (ki.currentKeyboardEventCode == 8) {
                GameScreen.selectedThemeId = 5;
                IntrusiveNode.a(-124, GameScreen.selectedThemeId);
                cd.selectThemeRenderAssets((byte) 115);
              }
              if (ki.currentKeyboardEventCode == 9) {
                GameScreen.selectedThemeId = 3;
                IntrusiveNode.a(-98, GameScreen.selectedThemeId);
                cd.selectThemeRenderAssets((byte) 122);
              }
              if (10 == ki.currentKeyboardEventCode) {
                GameScreen.selectedThemeId = 4;
                IntrusiveNode.a(methodGuard ^ 1578896198, GameScreen.selectedThemeId);
                cd.selectThemeRenderAssets((byte) 101);
              }
              if (ki.currentKeyboardEventCode == 11) {
                GameScreen.selectedThemeId = 2;
                IntrusiveNode.a(-118, GameScreen.selectedThemeId);
                cd.selectThemeRenderAssets((byte) 82);
              }
              if (ki.currentKeyboardEventCode == 12) {
                if (this.debugReducedRendering) {
                  toggledReducedRendering = false;
                } else {
                  toggledReducedRendering = true;
                }
                ((GameplaySession) (this)).debugReducedRendering = toggledReducedRendering;
              }
              if (36 == ki.currentKeyboardEventCode) {
                GameScreen.selectedThemeId = GameScreen.selectedThemeId + 1;
                GameScreen.selectedThemeId = GameScreen.selectedThemeId % 7;
                cd.selectThemeRenderAssets((byte) 108);
              }
              if (ki.currentKeyboardEventCode != 39) {
                continue L60;
              }
              this.showSessionCounters = true;
              if (clientControlFlowGuard == 0) {
                continue L60;
              }
            }
            debugKeyCodeOrPointerEventComplement = ~bi.pointerPressButtonSnapshot;
            debugKeySentinelOrPointerEventSentinel = -1;
          }
          L98: {
            if (debugKeyCodeOrPointerEventComplement != debugKeySentinelOrPointerEventSentinel) {
              if (this.debugPointerSpawnEnabled) {
                if (oc.field_f >= 2) {
                  nb.spawnEntityAtPointer(-28195, mc.pointerPressXSnapshot, this.debugSpawnCategoryId, he.pointerPressYSnapshot, this.debugSpawnVariantId, this.debugSpawnSpecialKinds);
                }
              }
              L100: {
                if (this.tutorialMode) {
                  if (this.tutorialStepPhase == 0) {
                    if (this.tutorialStepId != 5) {
                      this.tutorialPromptActive = false;
                      this.tutorialStepPhase = 1;
                      if (this.tutorialStepId == 0) {
                        this.tutorialProgressMetric = 0;
                        if (clientControlFlowGuard == 0) {
                          break L100;
                        }
                      }
                      if (this.tutorialStepId == 1) {
                        this.tutorialProgressMetric = dd.variantMatchCandidateCount;
                        if (clientControlFlowGuard == 0) {
                          break L100;
                        }
                      }
                      if (this.tutorialStepId != 2) {
                        break L98;
                      }
                      this.tutorialProgressMetric = dk.categoryMatchCandidateCount;
                      if (clientControlFlowGuard == 0) {
                        break L100;
                      }
                    }
                    if (mc.pointerPressXSnapshot > 100) {
                      if (340 > mc.pointerPressXSnapshot) {
                        if (he.pointerPressYSnapshot > 440) {
                          if (476 > he.pointerPressYSnapshot) {
                            this.leaveTutorial(methodGuard ^ -1578897511);
                            this.tutorialStepId = 0;
                            this.tutorialMode = true;
                            this.tutorialPromptActive = true;
                          }
                        }
                      }
                    }
                    if (mc.pointerPressXSnapshot > 380) {
                      if (540 > mc.pointerPressXSnapshot) {
                        if (he.pointerPressYSnapshot > 440) {
                          if (he.pointerPressYSnapshot >= 476) {
                            break L98;
                          }
                          this.tutorialPromptActive = false;
                          this.tutorialStepPhase = 1;
                        }
                      }
                    }
                  }
                }
              }
            }
          }
          return;
        }
    }

    final void addScore(byte methodGuard, int points) {
        int pointsForCounters;
        int counterSplitMode;
        int oneThirdPoints;
        int controlFlowGuard;
        CharSequence cappedScoreText;
        CharSequence scoreValueText;
        controlFlowGuard = Geoblox.field_C;
        if (this.tutorialMode) {
          return;
        }
        {
          L0: {
            this.score = this.score + points;
            if (this.score > 9999999) {
              cappedScoreText = (CharSequence) ((Object) Integer.toString(9999999));
              td.writeTextAtOffset(cappedScoreText, this.scoreText, 0, 47);
              if (controlFlowGuard == 0) {
                break L0;
              }
            }
            scoreValueText = (CharSequence) ((Object) Integer.toString(this.score));
            td.writeTextAtOffset(scoreValueText, this.scoreText, 0, 69);
          }
          pointsForCounters = points;
          if (methodGuard != 127) {
            this.renderProgressHud(-17);
          }
          L3: {
            counterSplitMode = kd.field_c % 3;
            if (counterSplitMode != 0) {
              if (counterSplitMode == 1) {
                ml.field_r = ml.field_r - pointsForCounters;
                if (controlFlowGuard == 0) {
                  break L3;
                }
              }
              oneThirdPoints = pointsForCounters / 3;
              oa.field_a = oa.field_a + oneThirdPoints;
              ml.field_r = ml.field_r - (pointsForCounters - oneThirdPoints);
              if (controlFlowGuard == 0) {
                break L3;
              }
            }
            oa.field_a = oa.field_a + pointsForCounters;
          }
          if (da.a(0, -117)) {
            if (this.score >= 7000) {
              ra.a(239, -120, 16);
            }
          }
          return;
        }
    }

    public static void i(int param0) {
        decodedSpriteXOffsets = null;
        field_z = null;
        if (param0 != -17199) {
          pointerIdleTicks = 53;
        }
    }

    final void startSessionEndSequence(byte methodGuard) {
        if (methodGuard != 116) {
          this.score = -46;
        }
        L1: {
          if (!this.tutorialMode) {
            this.sessionEnding = true;
            this.showGameOverOverlay = true;
            this.emitPointsPopup(false);
            this.addScore((byte) 127, wa.collectUnfinishedPopupPoints(-25866));
            this.submitScore((byte) -70);
            if (Geoblox.field_C == 0) {
              break L1;
            }
          }
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
        L0: {
          if (!this.sceneTransitionRequested) {
            if (0 == this.sessionPhase) {
              hasPendingTransitionOrPhase = false;
              break L0;
            }
          }
          hasPendingTransitionOrPhase = true;
        }
        return hasPendingTransitionOrPhase;
    }

    private final void advanceTutorialStep(int methodGuard) {
        int clientControlFlowGuard;
        L0: {
          clientControlFlowGuard = Geoblox.field_C;
          if (this.tutorialStepPhase == 2) {
            this.tutorialStepId = this.tutorialStepId + 1;
            this.tutorialPromptActive = true;
            this.tutorialStepPhase = 0;
            if (clientControlFlowGuard == 0) {
              break L0;
            }
          }
          if (1 == this.tutorialStepPhase) {
            L2: {
              if (this.tutorialStepId != 3) {
                if (this.tutorialStepId != 5) {
                  break L2;
                }
              }
              this.leaveTutorial(7000);
            }
            if (this.tutorialAdvanceRequested) {
              this.tutorialAdvanceRequested = false;
              this.tutorialStepPhase = 2;
            }
            if (this.tutorialStepId == 0) {
              if (this.tutorialProgressMetric > 450) {
                this.tutorialStepPhase = 2;
                if (clientControlFlowGuard == 0) {
                  break L0;
                }
              }
            }
            L6: {
              if (this.tutorialStepId == 1) {
                if (0 < dd.variantMatchCandidateCount - this.tutorialProgressMetric) {
                  break L6;
                }
              }
              if (this.tutorialStepId != 2) {
                break L0;
              }
              if (dk.categoryMatchCandidateCount - this.tutorialProgressMetric <= 0) {
                break L0;
              }
              this.tutorialStepPhase = 2;
              if (clientControlFlowGuard == 0) {
                break L0;
              }
            }
            this.tutorialStepPhase = 2;
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
        clientControlFlowGuard = Geoblox.field_C;
        if (this.sceneAnimationTick == 0) {
          L1: {
            if (!this.preserveScoreOnTransition) {
              this.resetScoreState(122);
              if (clientControlFlowGuard == 0) {
                break L1;
              }
            }
            this.prepareNextTheme(867);
          }
          this.sceneTransitionInProgress = true;
          sf.a(sh.mainRasterBuffer.pixels, 0, oc.boardSceneRaster.pixels, 0, sh.mainRasterBuffer.pixels.length);
          PointerInputListener.a((byte) -39);
          bk.boardOwnershipRaster.setAsRasterTarget();
          SoftwareRasterizer.clearFramebuffer();
          i.avatarMaskRaster.drawSilhouette(this.boardMaskOffsetX + 320, this.boardMaskOffsetY + 240, 16777215);
          sh.mainRasterBuffer.setAsRasterTarget(255);
        }
        int nextSceneAnimationTick = this.sceneAnimationTick + 1;
        this.sceneAnimationTick = this.sceneAnimationTick + 1;
        if (160 == nextSceneAnimationTick) {
          L4: {
            if (this.preserveScoreOnTransition) {
              precedingThemeId = 0;
              themeIndexThenId = 0;
              L5: while (true) {
                L6: {
                  L7: {
                    if (7 > themeIndexThenId) {
                      selectedThemeComplementOrThemeSentinel = ~GameScreen.selectedThemeId;
                      themeEntryComplementOrThemeId = ~ee.field_B[themeIndexThenId];
                      if (clientControlFlowGuard != 0) {
                        break L6;
                      }
                      if (selectedThemeComplementOrThemeSentinel == themeEntryComplementOrThemeId) {
                        if (0 < themeIndexThenId) {
                          precedingThemeId = ee.field_B[themeIndexThenId - 1];
                          if (clientControlFlowGuard == 0) {
                            break L7;
                          }
                        }
                        precedingThemeId = ee.field_B[6];
                        if (clientControlFlowGuard == 0) {
                          break L7;
                        }
                      }
                      themeIndexThenId++;
                      if (clientControlFlowGuard == 0) {
                        continue L5;
                      }
                    }
                  }
                  themeIndexThenId = precedingThemeId;
                  selectedThemeComplementOrThemeSentinel = 4;
                  themeEntryComplementOrThemeId = themeIndexThenId;
                }
                L10: {
                  L11: {
                    L12: {
                      L13: {
                        L14: {
                          L15: {
                            L16: {
                              L17: {
                                if (selectedThemeComplementOrThemeSentinel == themeEntryComplementOrThemeId) {
                                  if (clientControlFlowGuard == 0) {
                                    break L17;
                                  }
                                }
                                if (themeIndexThenId == 1) {
                                  if (clientControlFlowGuard == 0) {
                                    break L16;
                                  }
                                }
                                if (themeIndexThenId == 3) {
                                  if (clientControlFlowGuard == 0) {
                                    break L15;
                                  }
                                }
                                if (themeIndexThenId == 0) {
                                  if (clientControlFlowGuard == 0) {
                                    break L14;
                                  }
                                }
                                if (themeIndexThenId == 6) {
                                  break L13;
                                }
                                if (5 == themeIndexThenId) {
                                  if (clientControlFlowGuard == 0) {
                                    break L12;
                                  }
                                }
                                if (2 != themeIndexThenId) {
                                  break L10;
                                }
                                if (clientControlFlowGuard == 0) {
                                  break L11;
                                }
                              }
                              ra.a(fa.field_f ^ 255, -61, fa.field_f);
                              if (clientControlFlowGuard == 0) {
                                break L4;
                              }
                            }
                            ra.a(255 ^ hj.field_b, -84, hj.field_b);
                            if (clientControlFlowGuard == 0) {
                              break L4;
                            }
                          }
                          ra.a(255 ^ ac.field_u, -50, ac.field_u);
                          if (clientControlFlowGuard == 0) {
                            break L4;
                          }
                        }
                        ra.a(255 ^ kf.field_d, -71, kf.field_d);
                        if (clientControlFlowGuard == 0) {
                          break L4;
                        }
                      }
                      ra.a(255 ^ vi.field_E, -115, vi.field_E);
                      if (clientControlFlowGuard == 0) {
                        break L4;
                      }
                    }
                    ra.a(255 ^ jj.field_g, -92, jj.field_g);
                    if (clientControlFlowGuard == 0) {
                      break L4;
                    }
                  }
                  ra.a(255 ^ jg.field_a, -121, jg.field_a);
                  if (clientControlFlowGuard == 0) {
                    break L4;
                  }
                }
                ra.a(hj.field_b ^ 255, -95, hj.field_b);
                break L4;
              }
            }
          }
          this.connectivityRebuiltThisTick = false;
          this.boardRasterDirty = true;
          this.sceneTransitionInProgress = false;
          this.preserveScoreOnTransition = true;
          this.sceneTransitionRequested = false;
          this.sceneAnimationTick = 0;
          if (ArchiveNetworkClient.difficultyStep > 0) {
            qe.adjustThemeReleaseQuota(10);
            ld.advanceDifficulty(false);
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
        clientControlFlowGuard = Geoblox.field_C;
        if (methodGuard) {
          this.addScore((byte) 71, 49);
        }
        L1: {
          if (2 == this.sessionPhase) {
            PacketBuffer.resultBubbleSprite.drawScaledAlpha(320 - (this.sceneAnimationTick >> 1), 240 - (this.sceneAnimationTick >> 1), this.sceneAnimationTick, this.sceneAnimationTick, 150);
            lj.smallBoxSprite.draw(this.resultPanelX, -(lj.smallBoxSprite.fullHeight >> 1) + 240 + 60);
            dd.uiPaletteFont.drawText(sg.field_f, 15 + this.resultPanelX, 312, 0, -1);
            if (clientControlFlowGuard == 0) {
              break L1;
            }
          }
          shrinkingDiameter = -this.sceneAnimationTick + 460 + 460;
          if (this.sessionPhase == 3) {
            PacketBuffer.resultBubbleSprite.drawScaledAlpha(-(shrinkingDiameter >> 1) + 320, 240 - (shrinkingDiameter >> 1), shrinkingDiameter, shrinkingDiameter, 150);
            lj.smallBoxSprite.draw(-(lj.smallBoxSprite.fullWidth >> 1) + 320, -(lj.smallBoxSprite.fullHeight >> 1) + 240 + 60);
            shrinkingBonusText = Integer.toString(this.resultBonusPoints);
            dd.uiPaletteFont.drawCenteredText(shrinkingBonusText, 320, 312, 0, -1);
            if (this.boardEmptyAtResultStart) {
              dd.uiPaletteFont.drawCenteredText(ld.field_a, 320, 352, 0, -1);
            }
            if (clientControlFlowGuard == 0) {
              break L1;
            }
          }
          k.popSprite.drawAlpha(-(k.popSprite.fullWidth >> 1) + 320, 240 - (k.popSprite.fullHeight >> 1), this.resultSequenceCountdown - 150 + 150);
          lj.smallBoxSprite.draw(-(lj.smallBoxSprite.fullWidth >> 1) + 320, 300 - (lj.smallBoxSprite.fullHeight >> 1));
          countdownBonusText = Integer.toString(this.resultBonusPoints);
          dd.uiPaletteFont.drawCenteredText(countdownBonusText, 320, 312, 0, -1);
          if (this.boardEmptyAtResultStart) {
            dd.uiPaletteFont.drawCenteredText(ld.field_a, 320, 352, 0, -1);
          }
        }
        dd.uiPaletteFont.drawParagraph(kd.field_d, 426, 404, 200, 100, 0, -1, 2, 0, 30);
    }

    private final void updateResultSequence(int methodGuard) {
        int nextSceneAnimationTick = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_23_0 = 0;
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
        controlFlowGuard = Geoblox.field_C;
        if (0 == this.sceneAnimationTick) {
          gf.matchChainLength = 0;
          if (sk.checkBoundaryLossAndStartCascade(methodGuard - 11)) {
            this.pointsPanelSlideDirection = 0;
            return;
          }
          L1: {
            L2: {
              this.resultBonusPoints = this.resultBonusPoints + 179;
              this.boardEmptyAtResultStart = a.attachedEntities.isEmpty(13519);
              this.resultSequenceCountdown = 150;
              endingEntity = i.findOutermostAttachedEntity((byte) -128);
              if (null == endingEntity) {
                this.endingEntityRadius = 29;
                if (controlFlowGuard == 0) {
                  break L2;
                }
              }
              vf.spriteScratchRaster.setAsRasterTarget();
              SoftwareRasterizer.clearFramebuffer();
              endingEntity.entitySprite.rotateSmooth(endingEntity.entitySprite.fullWidth << 3, endingEntity.entitySprite.fullHeight << 3, vf.spriteScratchRaster.fullWidth << 3, vf.spriteScratchRaster.fullHeight << 3, (int)(65535.0 * ((double)endingEntity.spriteAngleRadians / 6.283185307179586)), 4096);
              sh.mainRasterBuffer.setAsRasterTarget(255);
              maxRadiusSquared = 0;
              spriteOffsetFromCenterX = (int)(endingEntity.positionX + 0.5f) + (-(vf.spriteScratchRaster.width >> 1) - 320);
              spriteOffsetFromCenterY = -240 + ((int)(endingEntity.positionY + 0.5f) - (vf.spriteScratchRaster.height >> 1));
              spriteColumn = 0;
              L4: while (true) {
                stackIn_11_0 = spriteColumn;
                stackIn_11_1 = vf.spriteScratchRaster.width;
                L5: while (true) {
                  L6: {
                    if (stackIn_11_0 < stackIn_11_1) {
                      stackIn_23_0 = 0;
                      if (controlFlowGuard != 0) {
                        break L1;
                      }
                      {
                        spriteRow = stackIn_23_0;
                        L7: while (vf.spriteScratchRaster.height > spriteRow) {
                          stackIn_11_0 = 0;
                          stackIn_11_1 = vf.spriteScratchRaster.pixels[vf.spriteScratchRaster.width * spriteRow + spriteColumn];
                          if (controlFlowGuard != 0) {
                            continue L5;
                          }
                          if (stackIn_11_0 != stackIn_11_1) {
                            pixelOffsetFromCenterX = spriteOffsetFromCenterX + spriteColumn;
                            pixelOffsetFromCenterY = spriteRow + spriteOffsetFromCenterY;
                            pixelRadiusSquared = pixelOffsetFromCenterX * pixelOffsetFromCenterX + pixelOffsetFromCenterY * pixelOffsetFromCenterY;
                            if (pixelRadiusSquared > maxRadiusSquared) {
                              maxRadiusSquared = pixelRadiusSquared;
                            }
                          }
                          spriteRow++;
                          if (controlFlowGuard == 0) {
                            continue L7;
                          }
                          break;
                        }
                        spriteColumn++;
                        if (controlFlowGuard == 0) {
                          continue L4;
                        }
                        break L6;
                      }
                    }
                  }
                  this.endingEntityRadius = (int)(0.5 + Math.sqrt((double)maxRadiusSquared));
                  break L2;
                }
              }
            }
            this.resultCompletionTickOffset = 920 + (-(2 * this.endingEntityRadius) - 58 - 1);
            stackIn_23_0 = methodGuard ^ 10;
          }
          ra.selectBackgroundMusic(stackIn_23_0, qf.resultMusicTrack);
        }
        L10: {
          nextSceneAnimationTick = this.sceneAnimationTick + 1;
          this.sceneAnimationTick = this.sceneAnimationTick + 1;
          if (nextSceneAnimationTick != 150 + this.resultCompletionTickOffset) {
            L12: {
              if (460 > this.sceneAnimationTick) {
                this.sessionPhase = 2;
                if (controlFlowGuard == 0) {
                  break L12;
                }
              }
              if (~(460 - this.sceneAnimationTick + 460) > ~(this.endingEntityRadius * 2)) {
                this.sessionPhase = 4;
                if (controlFlowGuard == 0) {
                  break L12;
                }
              }
              this.sessionPhase = 3;
            }
            if (3 == this.sessionPhase) {
              this.resultBonusPoints = this.resultBonusPoints + 7;
              if (controlFlowGuard == 0) {
                break L10;
              }
            }
            if (this.sessionPhase != 2) {
              if (this.resultSequenceCountdown == 150) {
                td.playPcmSample(-348, fl.field_c[28]);
              }
              this.resultSequenceCountdown = this.resultSequenceCountdown - 1;
              if (controlFlowGuard == 0) {
                break L10;
              }
            }
            L18: {
              if (this.resultExpansionAudioStream != null) {
                if (!this.resultExpansionAudioStream.isSamplePositionOutOfRange()) {
                  break L18;
                }
              }
              resultProgressPercent = this.sceneAnimationTick * 100 / 460;
              this.resultExpansionAudioStream = PcmSampleStream.createForPlaybackRate(fl.field_c[28], 2 * resultProgressPercent + 200, 45);
              GameplayEntity.registerAudioStream(false, this.resultExpansionAudioStream);
            }
            if (this.resultPanelX <= 320 - (lj.smallBoxSprite.fullWidth >> 1)) {
              break L10;
            }
            this.resultPanelX = this.resultPanelX - 1;
            if (controlFlowGuard == 0) {
              break L10;
            }
          }
          this.sceneTransitionRequested = true;
          this.sceneAnimationTick = 0;
          this.sessionPhase = 5;
          if (this.boardEmptyAtResultStart) {
            ld.spawnPointsPopup(350, 320, 66, 2000);
            ra.a(eb.field_i ^ 255, methodGuard - 101, eb.field_i);
            this.connectivityRebuiltThisTick = false;
          }
          ld.spawnPointsPopup(310, 320, 90, this.resultBonusPoints);
        }
        cf.advanceScorePopups((byte) 33);
        f.advanceGameplayAvatarAnimation(600);
        if (methodGuard != 10) {
          GameplaySession.i(-70);
        }
    }

    final void submitScore(byte methodGuard) {
        if (methodGuard != -70) {
            return;
        }
        if (0 < this.score && !this.submissionBlocked) {
            if (!fh.c(-102)) {
                qf.a(oa.field_a, 22, kb.field_d, 25134, new int[]{this.score}, ml.field_r, 65513, 3, gb.field_g);
            }
        }
        ca.field_f = null;
    }

    final void addPopupPoints(int points, int methodGuard) {
        int clientControlFlowGuard;
        CharSequence cappedPopupPointsText;
        CharSequence popupPointsValueText;
        if (this.tutorialMode) {
          return;
        }
        L0: {
          this.pendingPopupPoints = this.pendingPopupPoints + points;
          if (this.pendingPopupPoints > 99999) {
            cappedPopupPointsText = (CharSequence) ((Object) Integer.toString(99999));
            td.writeTextAtOffset(cappedPopupPointsText, this.popupPointsText, 0, 26);
            if (Geoblox.field_C == 0) {
              break L0;
            }
          }
          popupPointsValueText = (CharSequence) ((Object) Integer.toString(this.pendingPopupPoints));
          td.writeTextAtOffset(popupPointsValueText, this.popupPointsText, 0, 73);
        }
        clientControlFlowGuard = -83 % ((-19 - methodGuard) / 54);
    }

    private final void renderProgressHud(int methodGuard) {
        int remainingThemeReleases;
        int clientControlFlowGuard;
        clientControlFlowGuard = Geoblox.field_C;
        if (!this.preserveScoreOnTransition) {
          return;
        }
        L0: {
          if (this.sessionPhase != 0) {
            dd.uiPaletteFont.drawParagraph(tj.field_a, 426, 404, 200, 100, 0, -1, 2, 0, 30);
            if (clientControlFlowGuard == 0) {
              break L0;
            }
          }
          remainingThemeReleases = -ul.releasedInCurrentTheme + fa.releasesPerTheme;
          dd.uiPaletteFont.colorPalettes[0][wf.field_p] = 15488514;
          dd.uiPaletteFont.drawRightAlignedText(w.field_e, 621, 441, 0, -1);
          dd.uiPaletteFont.colorPalettes[0][wf.field_p] = 16689938;
          dd.uiPaletteFont.drawRightAlignedText(od.field_b, 621, 468, 0, -1);
          if (remainingThemeReleases <= 10) {
            dd.uiPaletteFont.colorPalettes[0][wf.field_p] = mk.field_k[remainingThemeReleases % 5];
            dd.uiPaletteFont.drawRightAlignedText(Integer.toString(remainingThemeReleases), 515, 468, 0, -1);
            dd.uiPaletteFont.colorPalettes[0][wf.field_p] = 16689938;
            if (clientControlFlowGuard == 0) {
              break L0;
            }
          }
          if (remainingThemeReleases <= 99999) {
            dd.uiPaletteFont.drawRightAlignedText(Integer.toString(remainingThemeReleases), 515, 468, 0, -1);
            if (clientControlFlowGuard == 0) {
              break L0;
            }
          }
          dd.uiPaletteFont.drawRightAlignedText(Integer.toString(99999), 515, 468, 0, -1);
        }
        if (methodGuard >= -39) {
          this.resultBonusPoints = 7;
        }
    }

    private final void requestSessionExitScreen(int methodGuard) {
        int clientControlFlowGuard;
        clientControlFlowGuard = Geoblox.field_C;
        if (methodGuard != 28809) {
          this.debugPointerSpawnEnabled = true;
        }
        L1: {
          if (!fh.c(-93)) {
            if (this.newActionCount <= 0) {
              if (this.score > 0) {
                ai.requestedScreenId = 2;
                if (clientControlFlowGuard == 0) {
                  break L1;
                }
              }
              ai.requestedScreenId = 0;
              if (clientControlFlowGuard == 0) {
                break L1;
              }
            }
            ai.requestedScreenId = 6;
            if (clientControlFlowGuard == 0) {
              break L1;
            }
          }
          L5: {
            if (this.score <= 0) {
              if (this.newActionCount <= 0) {
                break L5;
              }
            }
            ai.requestedScreenId = 4;
            if (clientControlFlowGuard == 0) {
              break L1;
            }
          }
          ai.requestedScreenId = 0;
        }
        fi.a(0, ll.field_d);
    }

    private final void resetScoreState(int methodGuard) {
        this.score = 0;
        this.pendingPopupPoints = 0;
        AwtRasterBuffer.field_f = 3382;
        el.field_g = 8801;
        ml.field_r = 1385;
        dc.field_a = 0;
        oa.field_a = 4703;
        gb.field_g = 5997;
        kb.field_d = 275;
        lb.field_b = 935;
        this.addScore((byte) 127, 0);
        this.addPopupPoints(0, -96);
        gf.matchChainLength = 1;
        this.pointsPanelSlideDirection = 1;
        this.pointsPanelX = 640;
        td.a((byte) -93);
        if (methodGuard < 104) {
          GameplaySession.i(-111);
        }
    }

    private final void c(byte param0) {
        if (param0 <= 40) {
          GameplaySession.i(100);
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
            ra.a(255 ^ PacketBuffer.field_m, -103, PacketBuffer.field_m);
        }
        int nextThemeId = uh.b(16);
        GameScreen.selectedThemeId = nextThemeId;
        cd.selectThemeRenderAssets((byte) 116);
        IntrusiveNode.a(methodGuard ^ -796, nextThemeId);
    }

    final void emitPointsPopup(boolean markSubmissionBlocked) {
        if (this.pendingPopupPoints == 0) {
            return;
        }
        if (markSubmissionBlocked) {
            this.submissionBlocked = true;
        }
        ld.spawnPointsPopup(34, 20 + (this.pointsPanelX + 60), 79, this.pendingPopupPoints);
        td.playPcmSample(-348, fl.field_c[32]);
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
          ug.field_c = 0;
          ArchiveRequest.pendingActionMarkers.clearNodes((byte) -126);
          this.pendingPopupPoints = 0;
          this.boardMaskOffsetX = -(i.avatarMaskRaster.width >> 1);
          this.tutorialMode = enableTutorial;
          this.tutorialPromptActive = enableTutorial;
          this.score = 0;
          this.boardMaskOffsetY = -(i.avatarMaskRaster.height >> 1);
          this.boardAngleRadians = 0.0f;
          bk.boardOwnershipRaster.setAsRasterTarget();
          SoftwareRasterizer.clearFramebuffer();
          i.avatarMaskRaster.drawSilhouette(320 + this.boardMaskOffsetX, this.boardMaskOffsetY + 240, 16777215);
          oc.boardSceneRaster.setAsRasterTarget();
          SoftwareRasterizer.clearFramebuffer();
          sh.mainRasterBuffer.setAsRasterTarget(255);
          this.sceneTransitionRequested = false;
          this.sceneAnimationTick = 0;
          this.boardRasterDirty = true;
          this.sessionPhase = 0;
          this.sessionEnding = false;
          this.addScore((byte) 127, 0);
          if (da.a(0, 111)) {
            DiskCacheWorker.avatarTintPalette[0] = 14788623;
            DiskCacheWorker.avatarTintPalette[1] = 15439657;
          }
          td.a((byte) -93);
          GameplayEntity.resetAvatarFeedbackState(0);
          GameScreen.selectedThemeId = ee.field_B[0];
          cd.selectThemeRenderAssets((byte) 104);
          this.debugPointerSpawnEnabled = false;
          this.submissionBlocked = false;
          this.spawnReleaseDisabled = false;
          this.showGameOverOverlay = false;
          IntrusiveNode.a(-116, 1);
          if (jf.rotatedThemeForegroundRaster == null) {
            jf.rotatedThemeForegroundRaster = new Sprite(ec.selectedThemeForeground.width, ec.selectedThemeForeground.height);
          }
          oa.field_a = 4703;
          kb.field_d = 275;
          lb.field_b = 935;
          dc.field_a = 0;
          ml.field_r = 1385;
          el.field_g = 8801;
          AwtRasterBuffer.field_f = 3382;
          gb.field_g = 5997;
          this.newActionCount = 0;
          return;
        } catch (java.lang.RuntimeException sessionConstructorException) {
          caughtConstructorFailure = sessionConstructorException;
          constructorFailure = caughtConstructorFailure;
          constructorFailureForContext = (RuntimeException) (constructorFailure);
          constructorMessagePrefix = new StringBuilder().append("gh.<init>(");
          if (ownerApplet == null) {
            appletArgumentDescription = "null";
          } else {
            appletArgumentDescription = "{...}";
          }
          throw t.a((Throwable) ((Object) constructorFailureForContext), ((StringBuilder) (Object) constructorMessagePrefix).append(appletArgumentDescription).append(',').append(enableTutorial).append(')').toString());
        }
    }

    static {
        pointerIdleTicks = 0;
    }
}
