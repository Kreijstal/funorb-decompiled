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
    static volatile int field_P;
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
    static int[] field_m;
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

    private final void leaveTutorial(int param0) {
        this.tutorialMode = false;
        this.sceneTransitionRequested = true;
        if (param0 != 7000) {
            this.boardEmptyAtResultStart = true;
        }
        this.preserveScoreOnTransition = false;
        this.tutorialPromptActive = false;
    }

    private final void renderTutorialPrompt(int param0) {
        int lineSpacing;
        int promptWidthThenButtonX;
        int promptHeight;
        int promptTop;
        int var7;
        String promptText;
        var7 = Geoblox.field_C;
        if (0 != this.tutorialStepPhase) {
          return;
        }
        L0: {
          promptText = uk.tutorialMessageForStep(this.tutorialStepId, 24146);
          lineSpacing = fi.smallFont.field_o - fi.smallFont.field_q + param0;
          promptWidthThenButtonX = 460;
          promptHeight = 30 + fi.smallFont.b(promptText, promptWidthThenButtonX) * lineSpacing;
          promptTop = 300;
          if (this.tutorialStepId == 0) {
            promptTop = 232;
            if (var7 == 0) {
              break L0;
            }
          }
          if (this.tutorialStepId != 3) {
            if (1 != this.tutorialStepId) {
              break L0;
            }
            promptTop = 280;
            if (var7 == 0) {
              break L0;
            }
          }
          promptTop = 270;
        }
        L3: {
          ma.a(promptTop, 70, 10 + promptHeight, (byte) -92, 500, ll.frameNineSliceSprites);
          fi.smallFont.a(promptText, 95, 15 + promptTop, promptWidthThenButtonX, 300, 1, -1, 0, 0, lineSpacing);
          if (this.tutorialStepId == 5) {
            if (qa.field_a > 100) {
              if (qa.field_a < 340) {
                if (ue.field_e > 440) {
                  if (ue.field_e < 476) {
                    dd.uiPaletteFont.colorPalettes[0][wf.field_p] = 15488514;
                  }
                }
              }
            }
            ma.a(440, 100, 36, (byte) -92, 240, eb.mouseBoxFrames);
            dd.uiPaletteFont.b(cf.field_j, 220, 468, 0, -1);
            dd.uiPaletteFont.colorPalettes[0][wf.field_p] = 16689938;
            ma.a(440, 380, 36, (byte) -92, 160, eb.mouseBoxFrames);
            if (380 < qa.field_a) {
              if (540 > qa.field_a) {
                if (ue.field_e > 440) {
                  if (476 > ue.field_e) {
                    dd.uiPaletteFont.colorPalettes[0][wf.field_p] = 15488514;
                  }
                }
              }
            }
            dd.uiPaletteFont.b(nk.startGameText, promptWidthThenButtonX, 468, 0, -1);
            dd.uiPaletteFont.colorPalettes[0][wf.field_p] = 16689938;
            if (var7 == 0) {
              break L3;
            }
          }
          ma.a(440, 240, 36, (byte) -92, 160, eb.mouseBoxFrames);
          if (250 < qa.field_a) {
            if (qa.field_a < 389) {
              if (ue.field_e > 440) {
                if (476 > ue.field_e) {
                  dd.uiPaletteFont.colorPalettes[0][wf.field_p] = 15488514;
                }
              }
            }
          }
          dd.uiPaletteFont.b(mi.field_y, 320, 468, 0, -1);
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
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        Throwable decompiledCaughtException = null;
        var4 = Geoblox.field_C;
        try {
          try {
            if (!d.field_b.startsWith("win")) {
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
            stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
            stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
            stackIn_26_2 = "null";
          } else {
            stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
            stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
            stackIn_26_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(',').append(param1).append(')').toString());
        }
    }

    final void renderSession(byte param0) {
        int stackIn_49_0 = 0;
        int stackIn_168_0 = 0;
        int stackIn_168_1 = 0;
        String var2_ref_String = null;
        int var2 = 0;
        int var3 = 0;
        String var3_ref_String = null;
        int var4 = 0;
        float var5_float = 0.0f;
        int var5 = 0;
        float var6_float = 0.0f;
        int var6 = 0;
        float var7_float = 0.0f;
        int var7_int = 0;
        IntrusiveDeque var7 = null;
        int var8 = 0;
        GameplayEntity renderedEntity = null;
        float entityOffsetX = 0.0f;
        int var9 = 0;
        float entityOffsetY = 0.0f;
        int var10 = 0;
        int renderedEntityX = 0;
        int renderedEntityY = 0;
        int entityOpacity = 0;
        int var14 = 0;
        IntrusiveDeque var15 = null;
        IntrusiveDeque var16 = null;
        var14 = Geoblox.field_C;
        if (!ll.themesLoaded[GameScreen.selectedThemeId]) {
          L0: {
            L1: {
              L2: {
                L3: {
                  L4: {
                    L5: {
                      L6: {
                        var3 = GameScreen.selectedThemeId;
                        if (var3 == 4) {
                          if (var14 == 0) {
                            var2_ref_String = "baking";
                            if (var14 == 0) {
                              break L0;
                            }
                            break L6;
                          }
                        }
                        if (var3 == 6) {
                          if (var14 == 0) {
                            break L6;
                          }
                        }
                        if (var3 == 5) {
                          if (var14 == 0) {
                            break L5;
                          }
                        }
                        if (var3 == 0) {
                          break L4;
                        }
                        if (3 == var3) {
                          if (var14 == 0) {
                            break L3;
                          }
                        }
                        if (var3 == 2) {
                          break L2;
                        }
                        break L1;
                      }
                      var2_ref_String = "space";
                      if (var14 == 0) {
                        break L0;
                      }
                    }
                    var2_ref_String = "sports";
                    if (var14 == 0) {
                      break L0;
                    }
                  }
                  var2_ref_String = "jewels";
                  if (var14 == 0) {
                    break L0;
                  }
                }
                var2_ref_String = "germs";
                if (var14 == 0) {
                  break L0;
                }
              }
              var2_ref_String = "sweets";
              if (var14 == 0) {
                break L0;
              }
            }
            var2_ref_String = "";
          }
          var3_ref_String = gf.a(ff.waitingForGraphicsText, ll.gameGraphicsArchive, var2_ref_String, AccountWelcomePanel.loadingGraphicsText, true);
          var4 = 30 + dd.uiPaletteFont.a(var3_ref_String);
          ma.a(215, 320 - var4 / 2, 50, (byte) -92, var4, ll.frameNineSliceSprites);
          dd.uiPaletteFont.b(var3_ref_String, 320, 250, 0, -1);
          return;
        }
        L11: {
          if (ih.areEntityQueuesSettled(0)) {
            if (this.sceneTransitionRequested) {
              if (this.sceneTransitionInProgress) {
                stackIn_49_0 = 1;
                break L11;
              }
            }
          }
          stackIn_49_0 = 0;
        }
        L13: {
          var2 = stackIn_49_0;
          if (var2 == 0) {
            if (!this.boardRasterDirty) {
              oc.boardSceneRaster.e();
              if (this.debugReducedRendering) {
                break L13;
              }
              gj.drawSpecialAttachedEntities((byte) -63);
              if (var14 == 0) {
                break L13;
              }
            }
            oc.boardSceneRaster.e();
            SoftwareRasterizer.c();
            if (!this.debugReducedRendering) {
              dc.drawAttachedEntities(7838);
            }
            k.a(10, 90, 460, -27085, 460);
            this.boardRasterDirty = false;
          }
        }
        sh.field_y.a(255);
        mf.selectedThemeBackground.b(0, 0);
        var3 = 4;
        var4 = 4;
        if (param0 >= -28) {
          this.updateSession(-63);
        }
        L17: {
          if (this.showGameOverOverlay) {
            if (this.sceneAnimationTick <= 266) {
              var5_float = (float)this.sceneAnimationTick / 266.0f;
              var6_float = -var5_float + 1.0f;
              var7_float = var6_float * var6_float;
              var3 = (int)(0.5f + (70.0f * (2.0f * var5_float * var6_float) + 10.0f * var7_float + 220.0f * (var5_float * var5_float)));
              var4 = (int)(170.0f * (var5_float * var5_float) + (var7_float * 10.0f + 140.0f * (var5_float * 2.0f * var6_float)) + 0.5f);
              if (var14 == 0) {
                break L17;
              }
            }
            var3 = 220;
            var4 = 170;
          }
        }
        L19: {
          if (this.tutorialMode) {
            var5 = 176 - this.updateTick / 2;
            if (10 > var5) {
              var5 = 10;
            }
            var6 = -fi.smallFont.field_q + fi.smallFont.field_o;
            var7_int = fi.smallFont.c(v.field_n, 640) + 40;
            var8 = fi.smallFont.b(v.field_n, 640) * var6 + 10;
            ma.a(var5, -(var7_int / 2) + 320, 20 + var8, (byte) -92, var7_int, ll.frameNineSliceSprites);
            fi.smallFont.b(v.field_n, 320, var5 + 28, 1, -1);
            fi.smallFont.b(v.field_n, 319, 28 + var5, 1, -1);
            if (var14 == 0) {
              break L19;
            }
          }
          L22: {
            lj.smallBoxSprite.b(var3, var4);
            if (0 == this.sessionPhase) {
              if (!ih.areEntityQueuesSettled(0)) {
                break L22;
              }
            }
            vh.largeBoxSprite.b(446, 410);
            if (var14 == 0) {
              break L19;
            }
          }
          g.countBoxSprite.b(468, 410);
        }
        L24: {
          if (!this.tutorialMode) {
            if (ih.areEntityQueuesSettled(0)) {
              if (var2 == 0) {
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
          h.c(-1);
        }
        if (!this.debugReducedRendering) {
          if (var2 == 0) {
            oc.boardSceneRaster.b(0, 0);
          }
        }
        ij.h((byte) 18);
        if (!this.debugReducedRendering) {
          ni.f(484842465);
        }
        jf.rotatedThemeForegroundRaster.e();
        SoftwareRasterizer.c();
        ec.selectedThemeForeground.rotateNearest(ec.selectedThemeForeground.field_s << 3, ec.selectedThemeForeground.field_o << 3, jf.rotatedThemeForegroundRaster.field_s << 3, jf.rotatedThemeForegroundRaster.field_o << 3, (int)(65535.0 * ((double)(-this.boardAngleRadians) / 6.283185307179586)), 4096);
        sh.field_y.a(255);
        w.a(jf.rotatedThemeForegroundRaster, -(jf.rotatedThemeForegroundRaster.field_s >> 1) + 320, -(jf.rotatedThemeForegroundRaster.field_o >> 1) + 240);
        if (!this.debugReducedRendering) {
          uh.d(4740);
        }
        L30: {
          if (this.showDebugOverview) {
            af.field_a.e();
            SoftwareRasterizer.a(0, 0, SoftwareRasterizer.stride, SoftwareRasterizer.field_b, 1118481);
            var5 = 16777215;
            SoftwareRasterizer.f(160, 120, 115, 16711680);
            var6 = 20;
            var15 = SecondaryDeque.spawnQueue;
            renderedEntity = (GameplayEntity) ((Object) var15.lastForIteration(false));
            L31: while (true) {
              L32: {
                if (renderedEntity != null) {
                  entityOffsetX = -320.0f + renderedEntity.positionX;
                  entityOffsetY = -240.0f + renderedEntity.positionY;
                  renderedEntityX = (int)(320.0 + (Math.cos((double)el.gameplaySession.boardAngleRadians) * (double)entityOffsetX - Math.sin((double)el.gameplaySession.boardAngleRadians) * (double)entityOffsetY));
                  renderedEntityY = (int)(240.0 + ((double)entityOffsetX * Math.sin((double)el.gameplaySession.boardAngleRadians) + (double)entityOffsetY * Math.cos((double)el.gameplaySession.boardAngleRadians)));
                  entityOpacity = 255 - renderedEntity.remainingLifetimeTicks * 255 / renderedEntity.initialLifetimeTicks;
                  stackIn_168_0 = 11;

                  stackIn_168_1 = entityOpacity;

                  if (var14 != 0) {
                    break L32;
                  }
                  if (stackIn_168_0 > stackIn_168_1) {
                    entityOpacity = 11;
                  }
                  if (entityOpacity > 255) {
                    entityOpacity = 255;
                  }
                  SoftwareRasterizer.d(renderedEntityX / 2, renderedEntityY / 2, var6, entityOpacity << 8 | entityOpacity << 16 | entityOpacity);
                  renderedEntity = (GameplayEntity) ((Object) var15.previousForIteration(0));
                  if (var14 == 0) {
                    continue L31;
                  }
                }
                var16 = ji.movingEntities;
                var7 = var16;
                renderedEntity = (GameplayEntity) ((Object) var16.firstForIteration(0));
                L36: while (true) {
                  L37: {
                    if (null != renderedEntity) {
                      entityOffsetX = -320.0f + renderedEntity.positionX;
                      entityOffsetY = -240.0f + renderedEntity.positionY;
                      renderedEntityX = (int)(Math.cos((double)el.gameplaySession.boardAngleRadians) * (double)entityOffsetX - Math.sin((double)el.gameplaySession.boardAngleRadians) * (double)entityOffsetY + 320.0);
                      renderedEntityY = (int)(240.0 + ((double)entityOffsetX * Math.sin((double)el.gameplaySession.boardAngleRadians) + (double)entityOffsetY * Math.cos((double)el.gameplaySession.boardAngleRadians)));
                      SoftwareRasterizer.d(renderedEntityX / 2, renderedEntityY / 2, var6, var5);
                      renderedEntity = (GameplayEntity) ((Object) var16.nextForIteration(1));
                      if (var14 != 0) {
                        break L37;
                      }
                      if (var14 == 0) {
                        continue L36;
                      }
                    }
                    var7 = a.attachedEntities;
                  }
                  renderedEntity = (GameplayEntity) ((Object) var7.firstForIteration(0));
                  L39: while (true) {
                    L40: {
                      if (renderedEntity != null) {
                        SoftwareRasterizer.d((int)(renderedEntity.positionX / 2.0f), (int)(renderedEntity.positionY / 2.0f), var6, var5);
                        renderedEntity = (GameplayEntity) ((Object) var7.nextForIteration(1));
                        if (var14 != 0) {
                          break L40;
                        }
                        if (var14 == 0) {
                          continue L39;
                        }
                      }
                      var7 = bh.field_c;
                    }
                    renderedEntity = (GameplayEntity) ((Object) var7.firstForIteration(0));
                    L42: while (true) {
                      L43: {
                        L44: {
                          if (renderedEntity != null) {
                            SoftwareRasterizer.d((int)(renderedEntity.positionX / 2.0f), (int)(renderedEntity.positionY / 2.0f), var6, var5);
                            renderedEntity = (GameplayEntity) ((Object) var7.nextForIteration(1));
                            if (var14 != 0) {
                              break L44;
                            }
                            if (var14 == 0) {
                              continue L42;
                            }
                          }
                          if (this.tutorialMode) {
                            var8 = -(this.updateTick / 2) + 176;
                            if (var8 < 10) {
                              var8 = 10;
                            }
                            var9 = fi.smallFont.field_o - fi.smallFont.field_q;
                            var10 = fi.smallFont.c(v.field_n, 640) + 40;
                            renderedEntityX = fi.smallFont.b(v.field_n, 640) * var9 + 10;
                            SoftwareRasterizer.a((320 - var10 / 2) / 2, var8 / 2, var10 / 2, (20 + renderedEntityX) / 2, var5);
                            break L43;
                          }
                          lj.smallBoxSprite.a(var3 / 2, var4 / 2, lj.smallBoxSprite.field_s / 2, lj.smallBoxSprite.field_o / 2, var5);
                        }
                        if (this.sessionPhase == 0) {
                          if (!ih.areEntityQueuesSettled(0)) {
                            g.countBoxSprite.a(234, 205, g.countBoxSprite.field_s / 2, g.countBoxSprite.field_o / 2, var5);
                            if (var14 == 0) {
                              break L43;
                            }
                          }
                        }
                        vh.largeBoxSprite.a(223, 205, vh.largeBoxSprite.field_s / 2, vh.largeBoxSprite.field_o / 2, var5);
                      }
                      SoftwareRasterizer.d(160, 120, 21, 16777215);
                      SoftwareRasterizer.e(2, 2, 0, 0, SoftwareRasterizer.stride, SoftwareRasterizer.field_b);
                      sh.field_y.a(255);
                      stackIn_168_0 = SoftwareRasterizer.field_b;
                      stackIn_168_1 = 1;
                      break L32;
                    }
                  }
                }
              }
              ek.a(stackIn_168_0, stackIn_168_1 != 0, af.field_a, 0, SoftwareRasterizer.stride, 0);
              break L30;
            }
          }
        }
        L48: {
          if (!this.tutorialMode) {
            if (this.delayedActionCountdown > 0) {
              lj.smallBoxSprite.b(-(lj.smallBoxSprite.field_s >> 1) + 320, 60 - (lj.smallBoxSprite.field_o >> 1) + 240);
              dd.uiPaletteFont.b(wl.field_b, 320, 310, 0, -1);
            }
            eg.pointsPanelGlowFrames[this.pointsPanelFrameIndex].b(this.pointsPanelX, 4);
            if (640 > this.pointsPanelX) {
              if (0 < this.pendingPopupPoints) {
                dd.uiPaletteFont.a(wj.a(ic.field_a, new String[]{this.popupPointsText.toString()}, (byte) -79), this.pointsPanelX + 20, 34, 0, -1);
              }
            }
            if (this.showSessionCounters) {
              dd.uiPaletteFont.a(wj.a(sh.field_z, new String[]{Integer.toString(ec.field_b)}, (byte) -26), 400, 50, 0, -1);
              dd.uiPaletteFont.a(wj.a(qg.field_e, new String[]{Integer.toString(ji.difficultyStep)}, (byte) -71), 400, 80, 0, -1);
            }
            L53: {
              bd.drawScorePopups(-117);
              this.c((byte) 64);
              if (this.showGameOverOverlay) {
                lj.smallBoxSprite.b(var3, var4);
                if (this.sceneAnimationTick < 266) {
                  kh.screenTitleSprites[6].b(0, (this.sceneAnimationTick >> 1) - 113);
                  if (var14 == 0) {
                    break L53;
                  }
                }
                kh.screenTitleSprites[6].b(0, 20);
                kh.screenTitleSprites[6].c(0, 20, (int)(Math.cos((double)(-266 + this.sceneAnimationTick) / 40.0) * -64.0 + 64.0));
              }
            }
            L55: {
              dd.uiPaletteFont.a(wj.a(pa.field_a, new String[]{this.scoreText.toString()}, (byte) -53), 15 + var3, 30 + var4, 0, -1);
              if (ih.areEntityQueuesSettled(0)) {
                L56: {
                  if (0 != this.sessionPhase) {
                    if (this.sessionPhase != 1) {
                      break L56;
                    }
                  }
                  if (var2 == 0) {
                    break L55;
                  }
                  var5 = 35 + (6 * this.sceneAnimationTick - 480);
                  sh.field_y.a(255);
                  SoftwareRasterizer.e(0, var5, 640, 480);
                  oc.boardSceneRaster.b(0, 0);
                  SoftwareRasterizer.e(0, 0, 640, 480);
                  qj.transitionCurtain.b(0, -480 + 6 * this.sceneAnimationTick);
                  if (var14 == 0) {
                    break L55;
                  }
                }
                this.renderResultSequence(false);
              }
            }
            vc.c(-1);
            if (var14 == 0) {
              break L48;
            }
          }
          this.renderTutorialPrompt(2);
        }
    }

    final void updateSession(int param0) {
        int fieldTemp$0 = 0;
        boolean stackIn_233_0 = false;
        Object stackIn_246_0 = null;
        Object stackIn_249_0 = null;
        Object stackIn_251_0 = null;
        Object stackIn_252_0 = null;
        boolean stackIn_252_1 = false;
        Object stackIn_303_0 = null;
        Object stackIn_304_0 = null;
        boolean stackIn_304_1 = false;
        Object stackIn_356_0 = null;
        Object stackIn_358_0 = null;
        Object stackIn_359_0 = null;
        boolean stackIn_359_1 = false;
        Object stackIn_387_0 = null;
        Object stackIn_388_0 = null;
        boolean stackIn_388_1 = false;
        Object stackIn_407_0 = null;
        Object stackIn_408_0 = null;
        boolean stackIn_408_1 = false;
        Object stackIn_413_0 = null;
        Object stackIn_415_0 = null;
        Object stackIn_416_0 = null;
        boolean stackIn_416_1 = false;
        Object stackIn_454_0 = null;
        Object stackIn_455_0 = null;
        boolean stackIn_455_1 = false;
        int stackIn_464_0 = 0;
        int stackIn_464_1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4_int = 0;
        GameplayEntity var4 = null;
        int var5 = 0;
        L0: {
          var5 = Geoblox.field_C;
          lh.a(param0 ^ 1578896222);
          fieldTemp$0 = this.updateTick;
          this.updateTick = this.updateTick + 1;
          if ((fieldTemp$0 & 15) == 0) {
            this.pointsPanelFrameIndex = this.pointsPanelFrameIndex + this.pointsPanelFrameDirection;
            if (7 != this.pointsPanelFrameIndex) {
              if (this.pointsPanelFrameIndex != 0) {
                break L0;
              }
              this.pointsPanelFrameDirection = 1;
              if (var5 == 0) {
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
                if (var5 == 0) {
                  break L2;
                }
              }
              this.pointsPanelX = this.pointsPanelX + 1;
              if (var5 == 0) {
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
                  if (var5 == 0) {
                    break L7;
                  }
                }
                this.updateResultSequence(10);
                if (var5 == 0) {
                  break L7;
                }
              }
            }
            if (!ll.themesLoaded[GameScreen.selectedThemeId]) {
              return;
            }
            L14: {
              if (!this.rotationControlsSwapped) {
                var2 = 96;
                var3 = 97;
                if (var5 == 0) {
                  break L14;
                }
              }
              var3 = 96;
              var2 = 97;
            }
            if (kj.field_o[var2]) {
              L17: {
                this.boardAngleRadians = this.boardAngleRadians - DualLinkNode.rotationStepRadians;
                ScorePopup.a((byte) 38);
                var4_int = (ki.field_d + kd.field_c + qa.field_a + he.field_d) % 8;
                if (var4_int == 0) {
                  oa.field_a = oa.field_a + kb.field_d;
                  gb.field_g = gb.field_g - 1;
                  if (var5 == 0) {
                    break L17;
                  }
                }
                if (var4_int == 1) {
                  oa.field_a = oa.field_a + gb.field_g;
                  kb.field_d = kb.field_d - 1;
                  if (var5 == 0) {
                    break L17;
                  }
                }
                if (var4_int != 2) {
                  if (3 == var4_int) {
                    oa.field_a = oa.field_a - gb.field_g;
                    kb.field_d = kb.field_d + 1;
                    if (var5 == 0) {
                      break L17;
                    }
                  }
                  if (4 == var4_int) {
                    ml.field_r = ml.field_r + kb.field_d;
                    gb.field_g = gb.field_g + 1;
                    if (var5 == 0) {
                      break L17;
                    }
                  }
                  if (var4_int == 5) {
                    kb.field_d = kb.field_d + 1;
                    ml.field_r = ml.field_r + gb.field_g;
                    if (var5 == 0) {
                      break L17;
                    }
                  }
                  if (var4_int == 6) {
                    ml.field_r = ml.field_r - kb.field_d;
                    gb.field_g = gb.field_g - 1;
                    if (var5 == 0) {
                      break L17;
                    }
                  }
                  if (var4_int != 7) {
                    break L17;
                  }
                  kb.field_d = kb.field_d - 1;
                  ml.field_r = ml.field_r - gb.field_g;
                  if (var5 == 0) {
                    break L17;
                  }
                }
                gb.field_g = gb.field_g + 1;
                oa.field_a = oa.field_a - kb.field_d;
              }
              L25: {
                var4_int = (kd.field_c + he.field_d + qa.field_a + ki.field_d) % 5;
                if (0 == var4_int) {
                  dc.field_a = dc.field_a | lb.field_b + el.field_g << 17;
                  if (var5 == 0) {
                    break L25;
                  }
                }
                if (var4_int != 1) {
                  if (var4_int != 2) {
                    if (3 == var4_int) {
                      sc.field_f = sc.field_f + 1;
                      el.field_g = el.field_g + lb.field_b;
                      if (var5 == 0) {
                        break L25;
                      }
                    }
                    if (var4_int != 4) {
                      break L25;
                    }
                    sc.field_f = sc.field_f - 1;
                    el.field_g = el.field_g - lb.field_b;
                    if (var5 == 0) {
                      break L25;
                    }
                  }
                  lb.field_b = lb.field_b - 1;
                  el.field_g = el.field_g - sc.field_f;
                  if (var5 == 0) {
                    break L25;
                  }
                }
                el.field_g = el.field_g + sc.field_f;
                lb.field_b = lb.field_b + 1;
              }
              if (this.tutorialStepId == 0) {
                this.tutorialProgressMetric = this.tutorialProgressMetric + 1;
              }
            }
            L30: {
              if (kj.field_o[var3]) {
                this.boardAngleRadians = this.boardAngleRadians + DualLinkNode.rotationStepRadians;
                SecondaryDeque.a((byte) 74);
                if (this.tutorialStepId == 0) {
                  this.tutorialProgressMetric = this.tutorialProgressMetric + 1;
                }
                L32: {
                  var4_int = (he.field_d + (qa.field_a + kd.field_c) + ki.field_d) % 8;
                  if (var4_int != 0) {
                    if (1 != var4_int) {
                      if (var4_int != 2) {
                        if (var4_int == 3) {
                          kb.field_d = kb.field_d + 1;
                          oa.field_a = oa.field_a - gb.field_g;
                          if (var5 == 0) {
                            break L32;
                          }
                        }
                        if (4 == var4_int) {
                          gb.field_g = gb.field_g + 1;
                          ml.field_r = ml.field_r + kb.field_d;
                          if (var5 == 0) {
                            break L32;
                          }
                        }
                        if (5 == var4_int) {
                          kb.field_d = kb.field_d + 1;
                          ml.field_r = ml.field_r + gb.field_g;
                          if (var5 == 0) {
                            break L32;
                          }
                        }
                        if (var4_int == 6) {
                          ml.field_r = ml.field_r - kb.field_d;
                          gb.field_g = gb.field_g - 1;
                          if (var5 == 0) {
                            break L32;
                          }
                        }
                        if (var4_int != 7) {
                          break L32;
                        }
                        kb.field_d = kb.field_d - 1;
                        ml.field_r = ml.field_r - gb.field_g;
                        if (var5 == 0) {
                          break L32;
                        }
                      }
                      gb.field_g = gb.field_g + 1;
                      oa.field_a = oa.field_a - kb.field_d;
                      if (var5 == 0) {
                        break L32;
                      }
                    }
                    oa.field_a = oa.field_a + gb.field_g;
                    kb.field_d = kb.field_d - 1;
                    if (var5 == 0) {
                      break L32;
                    }
                  }
                  gb.field_g = gb.field_g - 1;
                  oa.field_a = oa.field_a + kb.field_d;
                }
                var4_int = (kd.field_c + qa.field_a + he.field_d + ki.field_d) % 5;
                if (var4_int != 0) {
                  if (1 != var4_int) {
                    if (2 != var4_int) {
                      if (var4_int == 3) {
                        sc.field_f = sc.field_f + 1;
                        el.field_g = el.field_g + lb.field_b;
                        if (var5 == 0) {
                          break L30;
                        }
                      }
                      if (4 != var4_int) {
                        break L30;
                      }
                      el.field_g = el.field_g - lb.field_b;
                      sc.field_f = sc.field_f - 1;
                      if (var5 == 0) {
                        break L30;
                      }
                    }
                    lb.field_b = lb.field_b - 1;
                    el.field_g = el.field_g - sc.field_f;
                    if (var5 == 0) {
                      break L30;
                    }
                  }
                  lb.field_b = lb.field_b + 1;
                  el.field_g = el.field_g + sc.field_f;
                  if (var5 == 0) {
                    break L30;
                  }
                }
                dc.field_a = dc.field_a | el.field_g + lb.field_b << 17;
              }
            }
            L44: {
              L45: {
                if (kj.field_o[99]) {
                  if (!this.tutorialPromptActive) {
                    var4 = (GameplayEntity) ((Object) ji.movingEntities.firstForIteration(0));
                    L46: while (true) {
                      if (null == var4) {
                        break L45;
                      }
                      stackIn_233_0 = var4.detachedFromBoard;

                      if (var5 != 0) {
                        break L44;
                      }
                      if (!stackIn_233_0) {
                        var4.positionY = var4.positionY + 4.0f * var4.velocityY;
                        var4.positionX = var4.positionX + 4.0f * var4.velocityX;
                        if (var5 == 0) {
                          break L45;
                        }
                      }
                      var4 = (GameplayEntity) ((Object) ji.movingEntities.nextForIteration(1));
                      if (var5 == 0) {
                        continue L46;
                      }
                      break L45;
                    }
                  }
                }
              }
              stackIn_233_0 = kj.field_o[var3];
            }
            if (!stackIn_233_0) {
              if (!kj.field_o[var2]) {
                jj.b(-106);
              }
            }
            this.delayedActionCountdown = this.delayedActionCountdown - 1;
            if (this.delayedActionCountdown == 0) {
              ld.spawnPointsPopup(310, 320, 123, 100 + 100 * ji.difficultyStep);
            }
            L50: {
              stackIn_251_0 = this;

              if (!fa.entitiesDetachedThisTick) {
                stackIn_251_0 = this;

                if (a.attachedEntities.isEmpty(13519)) {
                  stackIn_246_0 = this;
                  stackIn_251_0 = this;

                  if (0 < ul.releasedInCurrentTheme) {
                    stackIn_249_0 = this;
                    stackIn_252_0 = this;
                    stackIn_252_1 = true;
                    break L50;
                  }
                }
              }
              stackIn_252_0 = this;
              stackIn_252_1 = false;
            }
            L52: {
              ((GameplaySession) (this)).boardClearBonusEligible = stackIn_252_1;
              if (this.boardClearBonusEligible) {
                if (this.connectivityRebuiltThisTick) {
                  this.connectivityRebuiltThisTick = false;
                  this.delayedActionCountdown = 300;
                  this.boardClearBonusEligible = false;
                  ra.a(le.field_a ^ 255, -88, le.field_a);
                  if (var5 == 0) {
                    break L52;
                  }
                }
              }
              this.connectivityRebuiltThisTick = false;
            }
            this.boundaryCheckRequested = ab.boardContactStateDirty;
            ef.advanceActiveEntityAnimations((byte) -15);
            kc.reconcileBoardEntities(param0 + 1578896101);
            if (ab.boardContactStateDirty) {
              ul.collectMatchCandidates(-2);
            }
            this.matchBatchProcessedThisTick = ec.processMatchCandidates(-18913);
            if (this.boundaryCheckRequested) {
              sk.checkBoundaryLossAndStartCascade(param0 ^ 1578896190);
            }
            cf.advanceScorePopups((byte) 27);
            f.advanceGameplayAvatarAnimation(600);
            if (this.tutorialMode) {
              this.advanceTutorialStep(109);
            }
            if (var5 == 0) {
              break L7;
            }
          }
          if (this.sceneAnimationTick == 0) {
            fi.a(param0 ^ -1578896191, pi.field_S);
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
        if (param0 != -1578896191) {
          this.scoreText = (StringBuilder) null;
        }
        L60: while (true) {
          L61: {
            if (hh.a(111)) {
              if (te.field_a > 0) {
                pk.field_r = pk.field_r.substring(1) + te.field_a;
                if (pk.field_r.equalsIgnoreCase("fog")) {
                  stackIn_303_0 = this;

                  if (this.showDebugOverview) {
                    stackIn_304_0 = this;
                    stackIn_304_1 = false;
                  } else {
                    stackIn_304_0 = this;
                    stackIn_304_1 = true;
                  }
                  ((GameplaySession) (this)).showDebugOverview = stackIn_304_1;
                }
                if (oc.field_f >= 2) {
                  if (pk.field_r.equalsIgnoreCase("brk")) {
                    this.gameApplet.h((byte) 41);
                  }
                }
              }
              if (ki.field_d == 13) {
                if (!this.sessionEnding) {
                  ai.requestedScreenId = 1;
                  if (var5 == 0) {
                    return;
                  }
                }
                this.requestSessionExitScreen(28809);
                return;
              }
              if (ki.field_d == 83) {
                if (this.tutorialMode) {
                  this.leaveTutorial(7000);
                }
              }
              L67: {
                if (ki.field_d == 84) {
                  if (this.tutorialStepPhase == 0) {
                    this.tutorialStepPhase = 1;
                    this.tutorialPromptActive = false;
                    if (this.tutorialStepId != 0) {
                      if (this.tutorialStepId != 1) {
                        if (this.tutorialStepId != 2) {
                          break L67;
                        }
                        this.tutorialProgressMetric = dk.categoryMatchCandidateCount;
                        if (var5 == 0) {
                          break L67;
                        }
                      }
                      this.tutorialProgressMetric = dd.variantMatchCandidateCount;
                      if (var5 == 0) {
                        break L67;
                      }
                    }
                    this.tutorialProgressMetric = 0;
                  }
                }
              }
              if (ki.field_d == 85) {
                if (5 == this.tutorialStepId) {
                  if (this.tutorialStepPhase == 0) {
                    this.leaveTutorial(param0 ^ -1578897511);
                    this.tutorialMode = true;
                    this.tutorialStepId = 0;
                    this.tutorialPromptActive = true;
                  }
                }
              }
              if (jg.field_g == ki.field_d) {
                stackIn_358_0 = this;

                if (this.rotationControlsSwapped) {
                  stackIn_359_0 = this;
                  stackIn_359_1 = false;
                } else {
                  stackIn_356_0 = this;
                  stackIn_359_0 = this;
                  stackIn_359_1 = true;
                }
                ((GameplaySession) (this)).rotationControlsSwapped = stackIn_359_1;
                jc.requestAvatarFeedback(7, false);
              }
              if (2 > oc.field_f) {
                continue L60;
              }
              stackIn_464_0 = ki.field_d;

              stackIn_464_1 = 48;

              if (var5 != 0) {
                break L61;
              }
              if (stackIn_464_0 == stackIn_464_1) {
                this.debugSpawnVariantId = this.debugSpawnVariantId - 1;
                if (this.debugSpawnVariantId < 0) {
                  this.debugSpawnVariantId = 6;
                }
              }
              if (ki.field_d == 49) {
                this.debugSpawnVariantId = this.debugSpawnVariantId + 1;
                if (this.debugSpawnVariantId == 7) {
                  this.debugSpawnVariantId = 0;
                }
              }
              if (ki.field_d == 64) {
                this.debugSpawnCategoryId = this.debugSpawnCategoryId - 1;
                if (this.debugSpawnCategoryId < 0) {
                  this.debugSpawnCategoryId = 6;
                }
              }
              if (32 == ki.field_d) {
                stackIn_387_0 = this;

                if (this.debugSpawnSpecialKinds) {
                  stackIn_388_0 = this;
                  stackIn_388_1 = false;
                } else {
                  stackIn_388_0 = this;
                  stackIn_388_1 = true;
                }
                ((GameplaySession) (this)).debugSpawnSpecialKinds = stackIn_388_1;
              }
              if (ki.field_d == 65) {
                this.debugSpawnCategoryId = this.debugSpawnCategoryId + 1;
                if (this.debugSpawnCategoryId == 7) {
                  this.debugSpawnCategoryId = 0;
                }
              }
              if (ki.field_d == 16) {
                this.tutorialAdvanceRequested = true;
              }
              if (68 == ki.field_d) {
                this.sessionPhase = 1;
                this.submissionBlocked = true;
              }
              if (ki.field_d == 1) {
                this.submissionBlocked = true;
                stackIn_407_0 = this;

                if (this.debugPointerSpawnEnabled) {
                  stackIn_408_0 = this;
                  stackIn_408_1 = false;
                } else {
                  stackIn_408_0 = this;
                  stackIn_408_1 = true;
                }
                ((GameplaySession) (this)).debugPointerSpawnEnabled = stackIn_408_1;
              }
              if (2 == ki.field_d) {
                stackIn_415_0 = this;

                if (this.spawnReleaseDisabled) {
                  stackIn_416_0 = this;
                  stackIn_416_1 = false;
                } else {
                  stackIn_413_0 = this;
                  stackIn_416_0 = this;
                  stackIn_416_1 = true;
                }
                ((GameplaySession) (this)).spawnReleaseDisabled = stackIn_416_1;
                this.submissionBlocked = true;
              }
              if (ki.field_d == 3) {
                ag.availableSpriteVariantCount = 7;
                f.availableEntityCategoryCount = 7;
              }
              if (ki.field_d == 4) {
                hd.recordEntityRelease(2);
                this.submissionBlocked = true;
              }
              if (ki.field_d == 5) {
                GameScreen.selectedThemeId = 1;
                IntrusiveNode.a(param0 ^ 1578896207, GameScreen.selectedThemeId);
                cd.selectThemeRenderAssets((byte) 110);
              }
              if (ki.field_d == 6) {
                GameScreen.selectedThemeId = 0;
                IntrusiveNode.a(-126, GameScreen.selectedThemeId);
                cd.selectThemeRenderAssets((byte) 126);
              }
              if (7 == ki.field_d) {
                GameScreen.selectedThemeId = 6;
                IntrusiveNode.a(-99, GameScreen.selectedThemeId);
                cd.selectThemeRenderAssets((byte) 113);
              }
              if (ki.field_d == 8) {
                GameScreen.selectedThemeId = 5;
                IntrusiveNode.a(-124, GameScreen.selectedThemeId);
                cd.selectThemeRenderAssets((byte) 115);
              }
              if (ki.field_d == 9) {
                GameScreen.selectedThemeId = 3;
                IntrusiveNode.a(-98, GameScreen.selectedThemeId);
                cd.selectThemeRenderAssets((byte) 122);
              }
              if (10 == ki.field_d) {
                GameScreen.selectedThemeId = 4;
                IntrusiveNode.a(param0 ^ 1578896198, GameScreen.selectedThemeId);
                cd.selectThemeRenderAssets((byte) 101);
              }
              if (ki.field_d == 11) {
                GameScreen.selectedThemeId = 2;
                IntrusiveNode.a(-118, GameScreen.selectedThemeId);
                cd.selectThemeRenderAssets((byte) 82);
              }
              if (ki.field_d == 12) {
                stackIn_454_0 = this;

                if (this.debugReducedRendering) {
                  stackIn_455_0 = this;
                  stackIn_455_1 = false;
                } else {
                  stackIn_455_0 = this;
                  stackIn_455_1 = true;
                }
                ((GameplaySession) (this)).debugReducedRendering = stackIn_455_1;
              }
              if (36 == ki.field_d) {
                GameScreen.selectedThemeId = GameScreen.selectedThemeId + 1;
                GameScreen.selectedThemeId = GameScreen.selectedThemeId % 7;
                cd.selectThemeRenderAssets((byte) 108);
              }
              if (ki.field_d != 39) {
                continue L60;
              }
              this.showSessionCounters = true;
              if (var5 == 0) {
                continue L60;
              }
            }
            stackIn_464_0 = ~bi.field_g;
            stackIn_464_1 = -1;
          }
          L98: {
            if (stackIn_464_0 != stackIn_464_1) {
              if (this.debugPointerSpawnEnabled) {
                if (oc.field_f >= 2) {
                  nb.spawnEntityAtPointer(-28195, mc.field_a, this.debugSpawnCategoryId, he.field_d, this.debugSpawnVariantId, this.debugSpawnSpecialKinds);
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
                        if (var5 == 0) {
                          break L100;
                        }
                      }
                      if (this.tutorialStepId == 1) {
                        this.tutorialProgressMetric = dd.variantMatchCandidateCount;
                        if (var5 == 0) {
                          break L100;
                        }
                      }
                      if (this.tutorialStepId != 2) {
                        break L98;
                      }
                      this.tutorialProgressMetric = dk.categoryMatchCandidateCount;
                      if (var5 == 0) {
                        break L100;
                      }
                    }
                    if (mc.field_a > 100) {
                      if (340 > mc.field_a) {
                        if (he.field_d > 440) {
                          if (476 > he.field_d) {
                            this.leaveTutorial(param0 ^ -1578897511);
                            this.tutorialStepId = 0;
                            this.tutorialMode = true;
                            this.tutorialPromptActive = true;
                          }
                        }
                      }
                    }
                    if (mc.field_a > 380) {
                      if (540 > mc.field_a) {
                        if (he.field_d > 440) {
                          if (he.field_d >= 476) {
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
        field_m = null;
        field_z = null;
        if (param0 != -17199) {
          field_P = 53;
        }
    }

    final void startSessionEndSequence(byte param0) {
        if (param0 != 116) {
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

    final boolean canAdvanceSession(boolean param0) {
        boolean stackIn_9_0 = false;
        if (!param0) {
          return true;
        }
        L0: {
          if (!this.sceneTransitionRequested) {
            if (0 == this.sessionPhase) {
              stackIn_9_0 = false;
              break L0;
            }
          }
          stackIn_9_0 = true;
        }
        return stackIn_9_0;
    }

    private final void advanceTutorialStep(int param0) {
        int var3;
        L0: {
          var3 = Geoblox.field_C;
          if (this.tutorialStepPhase == 2) {
            this.tutorialStepId = this.tutorialStepId + 1;
            this.tutorialPromptActive = true;
            this.tutorialStepPhase = 0;
            if (var3 == 0) {
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
                if (var3 == 0) {
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
              if (var3 == 0) {
                break L0;
              }
            }
            this.tutorialStepPhase = 2;
          }
        }
        if (param0 < 59) {
          this.spawnReleaseDisabled = true;
        }
    }

    private final void updateSceneTransition(byte param0) {
        int stackIn_27_0 = 0;
        int stackIn_27_1 = 0;
        int precedingThemeId = 0;
        int themeIndexThenId = 0;
        int var4 = 0;
        var4 = Geoblox.field_C;
        if (this.sceneAnimationTick == 0) {
          L1: {
            if (!this.preserveScoreOnTransition) {
              this.resetScoreState(122);
              if (var4 == 0) {
                break L1;
              }
            }
            this.prepareNextTheme(867);
          }
          this.sceneTransitionInProgress = true;
          sf.a(sh.field_y.field_d, 0, oc.boardSceneRaster.pixels, 0, sh.field_y.field_d.length);
          le.a((byte) -39);
          bk.boardOwnershipRaster.e();
          SoftwareRasterizer.c();
          i.avatarMaskRaster.a(this.boardMaskOffsetX + 320, this.boardMaskOffsetY + 240, 16777215);
          sh.field_y.a(255);
        }
        int fieldTemp$0 = this.sceneAnimationTick + 1;
        this.sceneAnimationTick = this.sceneAnimationTick + 1;
        if (160 == fieldTemp$0) {
          L4: {
            if (this.preserveScoreOnTransition) {
              precedingThemeId = 0;
              themeIndexThenId = 0;
              L5: while (true) {
                L6: {
                  L7: {
                    if (7 > themeIndexThenId) {
                      stackIn_27_0 = ~GameScreen.selectedThemeId;

                      stackIn_27_1 = ~ee.field_B[themeIndexThenId];

                      if (var4 != 0) {
                        break L6;
                      }
                      if (stackIn_27_0 == stackIn_27_1) {
                        if (0 < themeIndexThenId) {
                          precedingThemeId = ee.field_B[themeIndexThenId - 1];
                          if (var4 == 0) {
                            break L7;
                          }
                        }
                        precedingThemeId = ee.field_B[6];
                        if (var4 == 0) {
                          break L7;
                        }
                      }
                      themeIndexThenId++;
                      if (var4 == 0) {
                        continue L5;
                      }
                    }
                  }
                  themeIndexThenId = precedingThemeId;
                  stackIn_27_0 = 4;
                  stackIn_27_1 = themeIndexThenId;
                }
                L10: {
                  L11: {
                    L12: {
                      L13: {
                        L14: {
                          L15: {
                            L16: {
                              L17: {
                                if (stackIn_27_0 == stackIn_27_1) {
                                  if (var4 == 0) {
                                    break L17;
                                  }
                                }
                                if (themeIndexThenId == 1) {
                                  if (var4 == 0) {
                                    break L16;
                                  }
                                }
                                if (themeIndexThenId == 3) {
                                  if (var4 == 0) {
                                    break L15;
                                  }
                                }
                                if (themeIndexThenId == 0) {
                                  if (var4 == 0) {
                                    break L14;
                                  }
                                }
                                if (themeIndexThenId == 6) {
                                  break L13;
                                }
                                if (5 == themeIndexThenId) {
                                  if (var4 == 0) {
                                    break L12;
                                  }
                                }
                                if (2 != themeIndexThenId) {
                                  break L10;
                                }
                                if (var4 == 0) {
                                  break L11;
                                }
                              }
                              ra.a(fa.field_f ^ 255, -61, fa.field_f);
                              if (var4 == 0) {
                                break L4;
                              }
                            }
                            ra.a(255 ^ hj.field_b, -84, hj.field_b);
                            if (var4 == 0) {
                              break L4;
                            }
                          }
                          ra.a(255 ^ ac.field_u, -50, ac.field_u);
                          if (var4 == 0) {
                            break L4;
                          }
                        }
                        ra.a(255 ^ kf.field_d, -71, kf.field_d);
                        if (var4 == 0) {
                          break L4;
                        }
                      }
                      ra.a(255 ^ vi.field_E, -115, vi.field_E);
                      if (var4 == 0) {
                        break L4;
                      }
                    }
                    ra.a(255 ^ jj.field_g, -92, jj.field_g);
                    if (var4 == 0) {
                      break L4;
                    }
                  }
                  ra.a(255 ^ jg.field_a, -121, jg.field_a);
                  if (var4 == 0) {
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
          if (ji.difficultyStep > 0) {
            qe.adjustThemeReleaseQuota(10);
            ld.advanceDifficulty(false);
          }
        }
        if (param0 > -76) {
          this.showSessionCounters = true;
        }
    }

    private final void renderResultSequence(boolean param0) {
        int shrinkingDiameter;
        int var4;
        String shrinkingBonusText;
        String countdownBonusText;
        var4 = Geoblox.field_C;
        if (param0) {
          this.addScore((byte) 71, 49);
        }
        L1: {
          if (2 == this.sessionPhase) {
            pk.resultBubbleSprite.b(320 - (this.sceneAnimationTick >> 1), 240 - (this.sceneAnimationTick >> 1), this.sceneAnimationTick, this.sceneAnimationTick, 150);
            lj.smallBoxSprite.b(this.resultPanelX, -(lj.smallBoxSprite.field_o >> 1) + 240 + 60);
            dd.uiPaletteFont.a(sg.field_f, 15 + this.resultPanelX, 312, 0, -1);
            if (var4 == 0) {
              break L1;
            }
          }
          shrinkingDiameter = -this.sceneAnimationTick + 460 + 460;
          if (this.sessionPhase == 3) {
            pk.resultBubbleSprite.b(-(shrinkingDiameter >> 1) + 320, 240 - (shrinkingDiameter >> 1), shrinkingDiameter, shrinkingDiameter, 150);
            lj.smallBoxSprite.b(-(lj.smallBoxSprite.field_s >> 1) + 320, -(lj.smallBoxSprite.field_o >> 1) + 240 + 60);
            shrinkingBonusText = Integer.toString(this.resultBonusPoints);
            dd.uiPaletteFont.b(shrinkingBonusText, 320, 312, 0, -1);
            if (this.boardEmptyAtResultStart) {
              dd.uiPaletteFont.b(ld.field_a, 320, 352, 0, -1);
            }
            if (var4 == 0) {
              break L1;
            }
          }
          k.popSprite.d(-(k.popSprite.field_s >> 1) + 320, 240 - (k.popSprite.field_o >> 1), this.resultSequenceCountdown - 150 + 150);
          lj.smallBoxSprite.b(-(lj.smallBoxSprite.field_s >> 1) + 320, 300 - (lj.smallBoxSprite.field_o >> 1));
          countdownBonusText = Integer.toString(this.resultBonusPoints);
          dd.uiPaletteFont.b(countdownBonusText, 320, 312, 0, -1);
          if (this.boardEmptyAtResultStart) {
            dd.uiPaletteFont.b(ld.field_a, 320, 352, 0, -1);
          }
        }
        dd.uiPaletteFont.a(kd.field_d, 426, 404, 200, 100, 0, -1, 2, 0, 30);
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
              vf.spriteScratchRaster.e();
              SoftwareRasterizer.c();
              endingEntity.entitySprite.rotateSmooth(endingEntity.entitySprite.field_s << 3, endingEntity.entitySprite.field_o << 3, vf.spriteScratchRaster.field_s << 3, vf.spriteScratchRaster.field_o << 3, (int)(65535.0 * ((double)endingEntity.spriteAngleRadians / 6.283185307179586)), 4096);
              sh.field_y.a(255);
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
            if (this.resultPanelX <= 320 - (lj.smallBoxSprite.field_s >> 1)) {
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

    final void submitScore(byte param0) {
        if (param0 != -70) {
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
        int var3;
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
        var3 = -83 % ((-19 - methodGuard) / 54);
    }

    private final void renderProgressHud(int param0) {
        int remainingThemeReleases;
        int var3;
        var3 = Geoblox.field_C;
        if (!this.preserveScoreOnTransition) {
          return;
        }
        L0: {
          if (this.sessionPhase != 0) {
            dd.uiPaletteFont.a(tj.field_a, 426, 404, 200, 100, 0, -1, 2, 0, 30);
            if (var3 == 0) {
              break L0;
            }
          }
          remainingThemeReleases = -ul.releasedInCurrentTheme + fa.releasesPerTheme;
          dd.uiPaletteFont.colorPalettes[0][wf.field_p] = 15488514;
          dd.uiPaletteFont.c(w.field_e, 621, 441, 0, -1);
          dd.uiPaletteFont.colorPalettes[0][wf.field_p] = 16689938;
          dd.uiPaletteFont.c(od.field_b, 621, 468, 0, -1);
          if (remainingThemeReleases <= 10) {
            dd.uiPaletteFont.colorPalettes[0][wf.field_p] = mk.field_k[remainingThemeReleases % 5];
            dd.uiPaletteFont.c(Integer.toString(remainingThemeReleases), 515, 468, 0, -1);
            dd.uiPaletteFont.colorPalettes[0][wf.field_p] = 16689938;
            if (var3 == 0) {
              break L0;
            }
          }
          if (remainingThemeReleases <= 99999) {
            dd.uiPaletteFont.c(Integer.toString(remainingThemeReleases), 515, 468, 0, -1);
            if (var3 == 0) {
              break L0;
            }
          }
          dd.uiPaletteFont.c(Integer.toString(99999), 515, 468, 0, -1);
        }
        if (param0 >= -39) {
          this.resultBonusPoints = 7;
        }
    }

    private final void requestSessionExitScreen(int param0) {
        int var3;
        var3 = Geoblox.field_C;
        if (param0 != 28809) {
          this.debugPointerSpawnEnabled = true;
        }
        L1: {
          if (!fh.c(-93)) {
            if (this.newActionCount <= 0) {
              if (this.score > 0) {
                ai.requestedScreenId = 2;
                if (var3 == 0) {
                  break L1;
                }
              }
              ai.requestedScreenId = 0;
              if (var3 == 0) {
                break L1;
              }
            }
            ai.requestedScreenId = 6;
            if (var3 == 0) {
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
            if (var3 == 0) {
              break L1;
            }
          }
          ai.requestedScreenId = 0;
        }
        fi.a(0, ll.field_d);
    }

    private final void resetScoreState(int param0) {
        this.score = 0;
        this.pendingPopupPoints = 0;
        sc.field_f = 3382;
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
        if (param0 < 104) {
          GameplaySession.i(-111);
        }
    }

    private final void c(byte param0) {
        if (param0 <= 40) {
          GameplaySession.i(100);
        }
    }

    private final void prepareNextTheme(int param0) {
        this.sessionPhase = 0;
        this.resultPanelX = 640;
        this.resultBonusPoints = 0;
        this.endingEntityRadius = 0;
        if (param0 != 867) {
            this.renderTutorialPrompt(20);
        }
        if (ji.difficultyStep >= 41) {
            ra.a(255 ^ pk.field_m, -103, pk.field_m);
        }
        int var2 = uh.b(16);
        GameScreen.selectedThemeId = var2;
        cd.selectThemeRenderAssets((byte) 116);
        IntrusiveNode.a(param0 ^ -796, var2);
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

    GameplaySession(Geoblox param0, boolean param1) {
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
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
          this.gameApplet = param0;
          ug.field_c = 0;
          pb.pendingActionMarkers.clearNodes((byte) -126);
          this.pendingPopupPoints = 0;
          this.boardMaskOffsetX = -(i.avatarMaskRaster.width >> 1);
          this.tutorialMode = param1;
          this.tutorialPromptActive = param1;
          this.score = 0;
          this.boardMaskOffsetY = -(i.avatarMaskRaster.height >> 1);
          this.boardAngleRadians = 0.0f;
          bk.boardOwnershipRaster.e();
          SoftwareRasterizer.c();
          i.avatarMaskRaster.a(320 + this.boardMaskOffsetX, this.boardMaskOffsetY + 240, 16777215);
          oc.boardSceneRaster.e();
          SoftwareRasterizer.c();
          sh.field_y.a(255);
          this.sceneTransitionRequested = false;
          this.sceneAnimationTick = 0;
          this.boardRasterDirty = true;
          this.sessionPhase = 0;
          this.sessionEnding = false;
          this.addScore((byte) 127, 0);
          if (da.a(0, 111)) {
            uf.avatarTintPalette[0] = 14788623;
            uf.avatarTintPalette[1] = 15439657;
          }
          td.a((byte) -93);
          GameplayEntity.h(0);
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
          sc.field_f = 3382;
          gb.field_g = 5997;
          this.newActionCount = 0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = (RuntimeException) (var3);

          stackIn_12_1 = new StringBuilder().append("gh.<init>(");

          if (param0 == null) {
            stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
            stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
            stackIn_13_2 = "null";
          } else {
            stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
            stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
            stackIn_13_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_P = 0;
    }
}
