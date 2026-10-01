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
    private boolean field_L;
    boolean boardRasterDirty;
    private PcmSampleStream field_M;
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
        } else {
          L0: {
            promptText = uk.tutorialMessageForStep(this.tutorialStepId, 24146);
            lineSpacing = fi.field_d.field_o - fi.field_d.field_q + param0;
            promptWidthThenButtonX = 460;
            promptHeight = 30 + fi.field_d.b(promptText, promptWidthThenButtonX) * lineSpacing;
            promptTop = 300;
            if ((this.tutorialStepId ^ -1) == -1) {
              promptTop = 232;
              if (var7 == 0) {
                break L0;
              }
            }
            if (this.tutorialStepId != 3) {
              if (1 == this.tutorialStepId) {
                promptTop = 280;
                if (var7 == 0) {
                  break L0;
                }
              } else {
                break L0;
              }
            }
            promptTop = 270;
          }
          L3: {
            ma.a(promptTop, 70, 10 + promptHeight, (byte) -92, 500, ll.field_h);
            fi.field_d.a(promptText, 95, 15 + promptTop, promptWidthThenButtonX, 300, 1, -1, 0, 0, lineSpacing);
            if (-6 == (this.tutorialStepId ^ -1)) {
              if (-101 > (qa.field_a ^ -1)) {
                if (-341 < (qa.field_a ^ -1)) {
                  if (-441 > (ue.field_e ^ -1)) {
                    if (ue.field_e < 476) {
                      dd.field_G.field_K[0][wf.field_p] = 15488514;
                    }
                  }
                }
              }
              ma.a(440, 100, 36, (byte) -92, 240, eb.field_g);
              dd.field_G.b(cf.field_j, 220, 468, 0, -1);
              dd.field_G.field_K[0][wf.field_p] = 16689938;
              ma.a(440, 380, 36, (byte) -92, 160, eb.field_g);
              if (380 < qa.field_a) {
                if (540 > qa.field_a) {
                  if (ue.field_e > 440) {
                    if (476 > ue.field_e) {
                      dd.field_G.field_K[0][wf.field_p] = 15488514;
                    }
                  }
                }
              }
              dd.field_G.b(nk.field_g, promptWidthThenButtonX, 468, 0, -1);
              dd.field_G.field_K[0][wf.field_p] = 16689938;
              if (var7 == 0) {
                break L3;
              }
            }
            ma.a(440, 240, 36, (byte) -92, 160, eb.field_g);
            if (250 < qa.field_a) {
              if (-390 < (qa.field_a ^ -1)) {
                if ((ue.field_e ^ -1) < -441) {
                  if (476 > ue.field_e) {
                    dd.field_G.field_K[0][wf.field_p] = 15488514;
                  }
                }
              }
            }
            dd.field_G.b(mi.field_y, 320, 468, 0, -1);
            dd.field_G.field_K[0][wf.field_p] = 16689938;
          }
          return;
        }
    }

    final static boolean a(String param0, boolean param1) {
        String var2 = null;
        Exception var2_ref = null;
        RuntimeException var2_ref2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        Throwable decompiledCaughtException = null;
        var4 = Geoblox.field_C;
        try {
          try {
            L1: {
              if (d.field_b.startsWith("win")) {
                if (!param1) {
                  if (!param0.startsWith("http://")) {
                    if (!param0.startsWith("https://")) {
                      return false;
                    }
                  }
                  var2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                  var3 = 0;
                  L3: while (true) {
                    L4: {
                      if (param0.length() > var3) {
                        stackIn_20_0 = var2.indexOf((int) param0.charAt(var3));

                        if (var4 != 0) {
                          break L4;
                        } else {
                          if (stackIn_20_0 != -1) {
                            var3++;
                            if (var4 == 0) {
                              continue L3;
                            }
                          } else {
                            stackIn_17_0 = 0;
                            decompiledRegionSelector0 = 3;
                            break L1;
                          }
                        }
                      }
                      Runtime.getRuntime().exec("cmd /c start \"j\" \"" + param0 + "\"");
                      stackIn_20_0 = 1;
                    }
                    decompiledRegionSelector0 = 2;
                    break L1;
                  }
                } else {
                  stackIn_6_0 = 1;
                  decompiledRegionSelector0 = 1;
                }
              } else {
                stackIn_3_0 = 0;
                decompiledRegionSelector0 = 0;
              }
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2_ref = (Exception) (Object) decompiledCaughtException;
            stackIn_22_0 = 0;
            return stackIn_22_0 != 0;
          }
          if (decompiledRegionSelector0 == 0) {
            decompiledRegionSelector1 = 0;
          } else {
            if (decompiledRegionSelector0 == 1) {
              decompiledRegionSelector1 = 1;
            } else {
              if (decompiledRegionSelector0 == 2) {
                decompiledRegionSelector1 = 2;
              } else {
                decompiledRegionSelector1 = 3;
              }
            }
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
          throw t.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector1 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector1 == 1) {
            return stackIn_6_0 != 0;
          } else {
            if (decompiledRegionSelector1 == 2) {
              return stackIn_20_0 != 0;
            } else {
              return stackIn_17_0 != 0;
            }
          }
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
                        if ((var3 ^ -1) == -5) {
                          if (var14 == 0) {
                            var2_ref_String = "baking";
                            if (var14 == 0) {
                              break L0;
                            } else {
                              break L6;
                            }
                          }
                        }
                        if (-7 == (var3 ^ -1)) {
                          if (var14 == 0) {
                            break L6;
                          }
                        }
                        if (var3 == 5) {
                          if (var14 == 0) {
                            break L5;
                          }
                        }
                        if (-1 == (var3 ^ -1)) {
                          break L4;
                        } else {
                          if (3 == var3) {
                            if (var14 == 0) {
                              break L3;
                            }
                          }
                          if (-3 == (var3 ^ -1)) {
                            break L2;
                          } else {
                            break L1;
                          }
                        }
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
          var3_ref_String = gf.a(ff.field_l, ll.field_f, var2_ref_String, wi.field_F, true);
          var4 = 30 + dd.field_G.a(var3_ref_String);
          ma.a(215, 320 - var4 / 2, 50, (byte) -92, var4, ll.field_h);
          dd.field_G.b(var3_ref_String, 320, 250, 0, -1);
          return;
        } else {
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
                if (!this.debugReducedRendering) {
                  gj.drawSpecialAttachedEntities((byte) -63);
                  if (var14 == 0) {
                    break L13;
                  }
                } else {
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
          mf.field_a.b(0, 0);
          var3 = 4;
          var4 = 4;
          if (param0 >= -28) {
            this.updateSession(-63);
          }
          L17: {
            if (this.field_L) {
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
              var6 = -fi.field_d.field_q + fi.field_d.field_o;
              var7_int = fi.field_d.c(v.field_n, 640) + 40;
              var8 = fi.field_d.b(v.field_n, 640) * var6 - -10;
              ma.a(var5, -(var7_int / 2) + 320, 20 + var8, (byte) -92, var7_int, ll.field_h);
              fi.field_d.b(v.field_n, 320, var5 + 28, 1, -1);
              fi.field_d.b(v.field_n, 319, 28 + var5, 1, -1);
              if (var14 == 0) {
                break L19;
              }
            }
            L22: {
              lj.field_d.b(var3, var4);
              if (0 == this.sessionPhase) {
                if (!ih.areEntityQueuesSettled(0)) {
                  break L22;
                }
              }
              vh.field_G.b(446, 410);
              if (var14 == 0) {
                break L19;
              }
            }
            g.field_i.b(468, 410);
          }
          L24: {
            if (!this.tutorialMode) {
              if (ih.areEntityQueuesSettled(0)) {
                if (var2 == 0) {
                  break L24;
                } else {
                  if (0 != this.sessionPhase) {
                    if (-2 != (this.sessionPhase ^ -1)) {
                      break L24;
                    }
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
          jf.field_a.e();
          SoftwareRasterizer.c();
          ec.field_c.rotateNearest(ec.field_c.field_s << 1679206499, ec.field_c.field_o << 919227299, jf.field_a.field_s << -122785245, jf.field_a.field_o << 1137750627, (int)(65535.0 * ((double)(-this.boardAngleRadians) / 6.283185307179586)), 4096);
          sh.field_y.a(255);
          w.a(jf.field_a, -(jf.field_a.field_s >> -199505663) + 320, -(jf.field_a.field_o >> -1092517823) + 240);
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
              var15 = wd.spawnQueue;
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
                    } else {
                      if (stackIn_168_0 > stackIn_168_1) {
                        entityOpacity = 11;
                      }
                      if (-256 > (entityOpacity ^ -1)) {
                        entityOpacity = 255;
                      }
                      SoftwareRasterizer.d(renderedEntityX / 2, renderedEntityY / 2, var6, entityOpacity << 269082696 | entityOpacity << -327781456 | entityOpacity);
                      renderedEntity = (GameplayEntity) ((Object) var15.previousForIteration(0));
                      if (var14 == 0) {
                        continue L31;
                      }
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
                        } else {
                          if (var14 == 0) {
                            continue L36;
                          }
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
                          } else {
                            if (var14 == 0) {
                              continue L39;
                            }
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
                              } else {
                                if (var14 == 0) {
                                  continue L42;
                                }
                              }
                            }
                            if (!this.tutorialMode) {
                              lj.field_d.a(var3 / 2, var4 / 2, lj.field_d.field_s / 2, lj.field_d.field_o / 2, var5);
                            } else {
                              var8 = -(this.updateTick / 2) + 176;
                              if ((var8 ^ -1) > -11) {
                                var8 = 10;
                              }
                              var9 = fi.field_d.field_o + -fi.field_d.field_q;
                              var10 = fi.field_d.c(v.field_n, 640) + 40;
                              renderedEntityX = fi.field_d.b(v.field_n, 640) * var9 - -10;
                              SoftwareRasterizer.a((320 - var10 / 2) / 2, var8 / 2, var10 / 2, (20 + renderedEntityX) / 2, var5);
                              break L43;
                            }
                          }
                          if (this.sessionPhase == 0) {
                            if (!ih.areEntityQueuesSettled(0)) {
                              g.field_i.a(234, 205, g.field_i.field_s / 2, g.field_i.field_o / 2, var5);
                              if (var14 == 0) {
                                break L43;
                              }
                            }
                          }
                          vh.field_G.a(223, 205, vh.field_G.field_s / 2, vh.field_G.field_o / 2, var5);
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
              if ((this.delayedActionCountdown ^ -1) < -1) {
                lj.field_d.b(-(lj.field_d.field_s >> -1133369407) + 320, 60 + -(lj.field_d.field_o >> -2072717343) + 240);
                dd.field_G.b(wl.field_b, 320, 310, 0, -1);
              }
              eg.field_q[this.pointsPanelFrameIndex].b(this.pointsPanelX, 4);
              if (640 > this.pointsPanelX) {
                if (0 < this.pendingPopupPoints) {
                  dd.field_G.a(wj.a(ic.field_a, new String[]{this.popupPointsText.toString()}, (byte) -79), this.pointsPanelX + 20, 34, 0, -1);
                }
              }
              if (this.showSessionCounters) {
                dd.field_G.a(wj.a(sh.field_z, new String[]{Integer.toString(ec.field_b)}, (byte) -26), 400, 50, 0, -1);
                dd.field_G.a(wj.a(qg.field_e, new String[]{Integer.toString(ji.difficultyStep)}, (byte) -71), 400, 80, 0, -1);
              }
              L53: {
                bd.drawScorePopups(-117);
                this.c((byte) 64);
                if (this.field_L) {
                  lj.field_d.b(var3, var4);
                  if (this.sceneAnimationTick < 266) {
                    kh.field_h[6].b(0, (this.sceneAnimationTick >> 1707498369) + -113);
                    if (var14 == 0) {
                      break L53;
                    }
                  }
                  kh.field_h[6].b(0, 20);
                  kh.field_h[6].c(0, 20, (int)(Math.cos((double)(-266 + this.sceneAnimationTick) / 40.0) * -64.0 + 64.0));
                }
              }
              L55: {
                dd.field_G.a(wj.a(pa.field_a, new String[]{this.scoreText.toString()}, (byte) -53), 15 + var3, 30 + var4, 0, -1);
                if (ih.areEntityQueuesSettled(0)) {
                  L56: {
                    if (0 != this.sessionPhase) {
                      if (this.sessionPhase != 1) {
                        break L56;
                      }
                    }
                    if (var2 != 0) {
                      var5 = 35 + (6 * this.sceneAnimationTick + -480);
                      sh.field_y.a(255);
                      SoftwareRasterizer.e(0, var5, 640, 480);
                      oc.boardSceneRaster.b(0, 0);
                      SoftwareRasterizer.e(0, 0, 640, 480);
                      qj.transitionCurtain.b(0, -480 + 6 * this.sceneAnimationTick);
                      if (var14 == 0) {
                        break L55;
                      }
                    } else {
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
          return;
        }
    }

    final void updateSession(int param0) {
        int fieldTemp$0 = 0;
        boolean stackIn_233_0 = false;
        Object stackIn_246_0 = null;
        Object stackIn_249_0 = null;
        Object stackIn_251_0 = null;
        Object stackIn_252_0 = null;
        int stackIn_252_1 = 0;
        Object stackIn_303_0 = null;
        Object stackIn_304_0 = null;
        int stackIn_304_1 = 0;
        Object stackIn_356_0 = null;
        Object stackIn_358_0 = null;
        Object stackIn_359_0 = null;
        int stackIn_359_1 = 0;
        Object stackIn_387_0 = null;
        Object stackIn_388_0 = null;
        int stackIn_388_1 = 0;
        Object stackIn_407_0 = null;
        Object stackIn_408_0 = null;
        int stackIn_408_1 = 0;
        Object stackIn_413_0 = null;
        Object stackIn_415_0 = null;
        Object stackIn_416_0 = null;
        int stackIn_416_1 = 0;
        Object stackIn_454_0 = null;
        Object stackIn_455_0 = null;
        int stackIn_455_1 = 0;
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
              if (-1 == (this.pointsPanelFrameIndex ^ -1)) {
                this.pointsPanelFrameDirection = 1;
                if (var5 == 0) {
                  break L0;
                }
              } else {
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
                if ((this.pointsPanelSlideDirection ^ -1) == -2) {
                  if (this.pointsPanelX < 640) {
                    break L5;
                  }
                }
                if (-464 != (this.pointsPanelX ^ -1)) {
                  break L2;
                } else {
                  if (-1 == (gf.matchChainLength ^ -1)) {
                    this.pointsPanelSlideDirection = 1;
                    el.gameplaySession.emitPointsPopup(false);
                    if (var5 == 0) {
                      break L2;
                    }
                  } else {
                    break L2;
                  }
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
                    if (-6 != (this.sessionPhase ^ -1)) {
                      break L12;
                    }
                  }
                  if (this.sceneTransitionRequested) {
                    this.updateSceneTransition((byte) -80);
                    if (var5 == 0) {
                      break L7;
                    }
                  } else {
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
            } else {
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
                  if (-2 == (var4_int ^ -1)) {
                    oa.field_a = oa.field_a + gb.field_g;
                    kb.field_d = kb.field_d - 1;
                    if (var5 == 0) {
                      break L17;
                    }
                  }
                  if ((var4_int ^ -1) != -3) {
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
                    if ((var4_int ^ -1) == -6) {
                      kb.field_d = kb.field_d + 1;
                      ml.field_r = ml.field_r + gb.field_g;
                      if (var5 == 0) {
                        break L17;
                      }
                    }
                    if (-7 == (var4_int ^ -1)) {
                      ml.field_r = ml.field_r - kb.field_d;
                      gb.field_g = gb.field_g - 1;
                      if (var5 == 0) {
                        break L17;
                      }
                    }
                    if ((var4_int ^ -1) != -8) {
                      break L17;
                    } else {
                      kb.field_d = kb.field_d - 1;
                      ml.field_r = ml.field_r - gb.field_g;
                      if (var5 == 0) {
                        break L17;
                      }
                    }
                  }
                  gb.field_g = gb.field_g + 1;
                  oa.field_a = oa.field_a - kb.field_d;
                }
                L25: {
                  var4_int = (kd.field_c + he.field_d + qa.field_a - -ki.field_d) % 5;
                  if (0 == var4_int) {
                    dc.field_a = dc.field_a | lb.field_b + el.field_g << -751962927;
                    if (var5 == 0) {
                      break L25;
                    }
                  }
                  if ((var4_int ^ -1) != -2) {
                    if (-3 != (var4_int ^ -1)) {
                      if (3 == var4_int) {
                        sc.field_f = sc.field_f + 1;
                        el.field_g = el.field_g + lb.field_b;
                        if (var5 == 0) {
                          break L25;
                        }
                      }
                      if ((var4_int ^ -1) != -5) {
                        break L25;
                      } else {
                        sc.field_f = sc.field_f - 1;
                        el.field_g = el.field_g - lb.field_b;
                        if (var5 == 0) {
                          break L25;
                        }
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
                if ((this.tutorialStepId ^ -1) == -1) {
                  this.tutorialProgressMetric = this.tutorialProgressMetric + 1;
                }
              }
              L30: {
                if (kj.field_o[var3]) {
                  this.boardAngleRadians = this.boardAngleRadians + DualLinkNode.rotationStepRadians;
                  wd.a((byte) 74);
                  if ((this.tutorialStepId ^ -1) == -1) {
                    this.tutorialProgressMetric = this.tutorialProgressMetric + 1;
                  }
                  L32: {
                    var4_int = (he.field_d + (qa.field_a - -kd.field_c) + ki.field_d) % 8;
                    if ((var4_int ^ -1) != -1) {
                      if (1 != var4_int) {
                        if ((var4_int ^ -1) != -3) {
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
                          if (var4_int == 7) {
                            kb.field_d = kb.field_d - 1;
                            ml.field_r = ml.field_r - gb.field_g;
                            if (var5 == 0) {
                              break L32;
                            }
                          } else {
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
                  var4_int = (kd.field_c + qa.field_a - -he.field_d + ki.field_d) % 5;
                  if (-1 != (var4_int ^ -1)) {
                    if (1 != var4_int) {
                      if (2 != var4_int) {
                        if (var4_int == 3) {
                          sc.field_f = sc.field_f + 1;
                          el.field_g = el.field_g + lb.field_b;
                          if (var5 == 0) {
                            break L30;
                          }
                        }
                        if (4 == var4_int) {
                          el.field_g = el.field_g - lb.field_b;
                          sc.field_f = sc.field_f - 1;
                          if (var5 == 0) {
                            break L30;
                          }
                        } else {
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
                  dc.field_a = dc.field_a | el.field_g + lb.field_b << -982889103;
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
                        } else {
                          stackIn_233_0 = var4.detachedFromBoard;

                          if (var5 != 0) {
                            break L44;
                          } else {
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
                            } else {
                              break L45;
                            }
                          }
                        }
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
              if ((this.delayedActionCountdown ^ -1) == -1) {
                ld.a(310, 320, 123, 100 + 100 * ji.difficultyStep);
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
                      stackIn_252_1 = 1;
                      break L50;
                    }
                  }
                }
                stackIn_252_0 = this;
                stackIn_252_1 = 0;
              }
              L52: {
                ((GameplaySession) (this)).boardClearBonusEligible = stackIn_252_1 != 0;
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
              f.o(600);
              if (this.tutorialMode) {
                this.advanceTutorialStep(109);
              }
              if (var5 == 0) {
                break L7;
              }
            }
          }
          if (-1 == (this.sceneAnimationTick ^ -1)) {
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
          f.o(600);
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
                    stackIn_304_1 = 0;
                  } else {
                    stackIn_304_0 = this;
                    stackIn_304_1 = 1;
                  }
                  ((GameplaySession) (this)).showDebugOverview = stackIn_304_1 != 0;
                }
                if (oc.field_f >= 2) {
                  if (pk.field_r.equalsIgnoreCase("brk")) {
                    this.gameApplet.h((byte) 41);
                  }
                }
              }
              if ((ki.field_d ^ -1) != -14) {
                if (-84 == (ki.field_d ^ -1)) {
                  if (this.tutorialMode) {
                    this.leaveTutorial(7000);
                  }
                }
                L67: {
                  if (ki.field_d == 84) {
                    if (this.tutorialStepPhase == 0) {
                      this.tutorialStepPhase = 1;
                      this.tutorialPromptActive = false;
                      if (-1 != (this.tutorialStepId ^ -1)) {
                        if ((this.tutorialStepId ^ -1) != -2) {
                          if (-3 == (this.tutorialStepId ^ -1)) {
                            this.tutorialProgressMetric = dk.categoryMatchCandidateCount;
                            if (var5 == 0) {
                              break L67;
                            }
                          } else {
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
                if ((ki.field_d ^ -1) == -86) {
                  if (5 == this.tutorialStepId) {
                    if (-1 == (this.tutorialStepPhase ^ -1)) {
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
                    stackIn_359_1 = 0;
                  } else {
                    stackIn_356_0 = this;
                    stackIn_359_0 = this;
                    stackIn_359_1 = 1;
                  }
                  ((GameplaySession) (this)).rotationControlsSwapped = stackIn_359_1 != 0;
                  jc.a(7, false);
                }
                if (2 > oc.field_f) {
                  continue L60;
                } else {
                  stackIn_464_0 = ki.field_d;

                  stackIn_464_1 = 48;

                  if (var5 != 0) {
                    break L61;
                  } else {
                    if (stackIn_464_0 == stackIn_464_1) {
                      this.debugSpawnVariantId = this.debugSpawnVariantId - 1;
                      if ((this.debugSpawnVariantId ^ -1) > -1) {
                        this.debugSpawnVariantId = 6;
                      }
                    }
                    if (-50 == (ki.field_d ^ -1)) {
                      this.debugSpawnVariantId = this.debugSpawnVariantId + 1;
                      if (this.debugSpawnVariantId == 7) {
                        this.debugSpawnVariantId = 0;
                      }
                    }
                    if (-65 == (ki.field_d ^ -1)) {
                      this.debugSpawnCategoryId = this.debugSpawnCategoryId - 1;
                      if (-1 < (this.debugSpawnCategoryId ^ -1)) {
                        this.debugSpawnCategoryId = 6;
                      }
                    }
                    if (32 == ki.field_d) {
                      stackIn_387_0 = this;

                      if (this.debugSpawnSpecialKinds) {
                        stackIn_388_0 = this;
                        stackIn_388_1 = 0;
                      } else {
                        stackIn_388_0 = this;
                        stackIn_388_1 = 1;
                      }
                      ((GameplaySession) (this)).debugSpawnSpecialKinds = stackIn_388_1 != 0;
                    }
                    if (ki.field_d == 65) {
                      this.debugSpawnCategoryId = this.debugSpawnCategoryId + 1;
                      if ((this.debugSpawnCategoryId ^ -1) == -8) {
                        this.debugSpawnCategoryId = 0;
                      }
                    }
                    if ((ki.field_d ^ -1) == -17) {
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
                        stackIn_408_1 = 0;
                      } else {
                        stackIn_408_0 = this;
                        stackIn_408_1 = 1;
                      }
                      ((GameplaySession) (this)).debugPointerSpawnEnabled = stackIn_408_1 != 0;
                    }
                    if (2 == ki.field_d) {
                      stackIn_415_0 = this;

                      if (this.spawnReleaseDisabled) {
                        stackIn_416_0 = this;
                        stackIn_416_1 = 0;
                      } else {
                        stackIn_413_0 = this;
                        stackIn_416_0 = this;
                        stackIn_416_1 = 1;
                      }
                      ((GameplaySession) (this)).spawnReleaseDisabled = stackIn_416_1 != 0;
                      this.submissionBlocked = true;
                    }
                    if ((ki.field_d ^ -1) == -4) {
                      ag.field_k = 7;
                      f.field_qb = 7;
                    }
                    if ((ki.field_d ^ -1) == -5) {
                      hd.recordEntityRelease(2);
                      this.submissionBlocked = true;
                    }
                    if ((ki.field_d ^ -1) == -6) {
                      GameScreen.selectedThemeId = 1;
                      IntrusiveNode.a(param0 ^ 1578896207, GameScreen.selectedThemeId);
                      cd.a((byte) 110);
                    }
                    if ((ki.field_d ^ -1) == -7) {
                      GameScreen.selectedThemeId = 0;
                      IntrusiveNode.a(-126, GameScreen.selectedThemeId);
                      cd.a((byte) 126);
                    }
                    if (7 == ki.field_d) {
                      GameScreen.selectedThemeId = 6;
                      IntrusiveNode.a(-99, GameScreen.selectedThemeId);
                      cd.a((byte) 113);
                    }
                    if (ki.field_d == 8) {
                      GameScreen.selectedThemeId = 5;
                      IntrusiveNode.a(-124, GameScreen.selectedThemeId);
                      cd.a((byte) 115);
                    }
                    if (-10 == (ki.field_d ^ -1)) {
                      GameScreen.selectedThemeId = 3;
                      IntrusiveNode.a(-98, GameScreen.selectedThemeId);
                      cd.a((byte) 122);
                    }
                    if (10 == ki.field_d) {
                      GameScreen.selectedThemeId = 4;
                      IntrusiveNode.a(param0 ^ 1578896198, GameScreen.selectedThemeId);
                      cd.a((byte) 101);
                    }
                    if ((ki.field_d ^ -1) == -12) {
                      GameScreen.selectedThemeId = 2;
                      IntrusiveNode.a(-118, GameScreen.selectedThemeId);
                      cd.a((byte) 82);
                    }
                    if (ki.field_d == 12) {
                      stackIn_454_0 = this;

                      if (this.debugReducedRendering) {
                        stackIn_455_0 = this;
                        stackIn_455_1 = 0;
                      } else {
                        stackIn_455_0 = this;
                        stackIn_455_1 = 1;
                      }
                      ((GameplaySession) (this)).debugReducedRendering = stackIn_455_1 != 0;
                    }
                    if (36 == ki.field_d) {
                      GameScreen.selectedThemeId = GameScreen.selectedThemeId + 1;
                      GameScreen.selectedThemeId = GameScreen.selectedThemeId % 7;
                      cd.a((byte) 108);
                    }
                    if ((ki.field_d ^ -1) == -40) {
                      this.showSessionCounters = true;
                      if (var5 == 0) {
                        continue L60;
                      }
                    } else {
                      continue L60;
                    }
                  }
                }
              } else {
                if (!this.sessionEnding) {
                  ai.requestedScreenId = 1;
                  if (var5 == 0) {
                    return;
                  }
                }
                this.requestSessionExitScreen(28809);
                return;
              }
            }
            stackIn_464_0 = bi.field_g ^ -1;
            stackIn_464_1 = -1;
          }
          L98: {
            if (stackIn_464_0 != stackIn_464_1) {
              if (this.debugPointerSpawnEnabled) {
                if ((oc.field_f ^ -1) <= -3) {
                  nb.spawnEntityAtPointer(-28195, mc.field_a, this.debugSpawnCategoryId, he.field_d, this.debugSpawnVariantId, this.debugSpawnSpecialKinds);
                }
              }
              L100: {
                if (this.tutorialMode) {
                  if ((this.tutorialStepPhase ^ -1) == -1) {
                    if (-6 != (this.tutorialStepId ^ -1)) {
                      this.tutorialPromptActive = false;
                      this.tutorialStepPhase = 1;
                      if (this.tutorialStepId == 0) {
                        this.tutorialProgressMetric = 0;
                        if (var5 == 0) {
                          break L100;
                        }
                      }
                      if ((this.tutorialStepId ^ -1) == -2) {
                        this.tutorialProgressMetric = dd.variantMatchCandidateCount;
                        if (var5 == 0) {
                          break L100;
                        }
                      }
                      if ((this.tutorialStepId ^ -1) == -3) {
                        this.tutorialProgressMetric = dk.categoryMatchCandidateCount;
                        if (var5 == 0) {
                          break L100;
                        }
                      } else {
                        break L98;
                      }
                    }
                    if (-101 > (mc.field_a ^ -1)) {
                      if (340 > mc.field_a) {
                        if (-441 > (he.field_d ^ -1)) {
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
                          if ((he.field_d ^ -1) > -477) {
                            this.tutorialPromptActive = false;
                            this.tutorialStepPhase = 1;
                          } else {
                            break L98;
                          }
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

    final void addScore(byte param0, int points) {
        int pointsForCounters;
        int counterSplitMode;
        int oneThirdPoints;
        int var6;
        CharSequence var7;
        CharSequence var8;
        var6 = Geoblox.field_C;
        if (!this.tutorialMode) {
          L0: {
            this.score = this.score + points;
            if ((this.score ^ -1) < -10000000) {
              var7 = (CharSequence) ((Object) Integer.toString(9999999));
              td.a(var7, this.scoreText, 0, 47);
              if (var6 == 0) {
                break L0;
              }
            }
            var8 = (CharSequence) ((Object) Integer.toString(this.score));
            td.a(var8, this.scoreText, 0, 69);
          }
          pointsForCounters = points;
          if (param0 != 127) {
            this.renderProgressHud(-17);
          }
          L3: {
            counterSplitMode = kd.field_c % 3;
            if ((counterSplitMode ^ -1) != -1) {
              if (counterSplitMode == 1) {
                ml.field_r = ml.field_r - pointsForCounters;
                if (var6 == 0) {
                  break L3;
                }
              }
              oneThirdPoints = pointsForCounters / 3;
              oa.field_a = oa.field_a + oneThirdPoints;
              ml.field_r = ml.field_r - (pointsForCounters - oneThirdPoints);
              if (var6 == 0) {
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
        } else {
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
            this.field_L = true;
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
        int stackIn_9_0 = 0;
        if (param0) {
          L0: {
            if (!this.sceneTransitionRequested) {
              if (0 == this.sessionPhase) {
                stackIn_9_0 = 0;
                break L0;
              }
            }
            stackIn_9_0 = 1;
          }
          return stackIn_9_0 != 0;
        } else {
          return true;
        }
    }

    private final void advanceTutorialStep(int param0) {
        int var3;
        L0: {
          var3 = Geoblox.field_C;
          if (-3 == (this.tutorialStepPhase ^ -1)) {
            this.tutorialStepId = this.tutorialStepId + 1;
            this.tutorialPromptActive = true;
            this.tutorialStepPhase = 0;
            if (var3 == 0) {
              break L0;
            }
          }
          if (1 == this.tutorialStepPhase) {
            L2: {
              if ((this.tutorialStepId ^ -1) != -4) {
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
            if (-1 == (this.tutorialStepId ^ -1)) {
              if (-451 > (this.tutorialProgressMetric ^ -1)) {
                this.tutorialStepPhase = 2;
                if (var3 == 0) {
                  break L0;
                }
              }
            }
            L6: {
              if (this.tutorialStepId == 1) {
                if (0 < dd.variantMatchCandidateCount + -this.tutorialProgressMetric) {
                  break L6;
                }
              }
              if (this.tutorialStepId != 2) {
                break L0;
              } else {
                if ((dk.categoryMatchCandidateCount + -this.tutorialProgressMetric ^ -1) >= -1) {
                  break L0;
                } else {
                  this.tutorialStepPhase = 2;
                  if (var3 == 0) {
                    break L0;
                  }
                }
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
        if (-1 == (this.sceneAnimationTick ^ -1)) {
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
                      stackIn_27_0 = GameScreen.selectedThemeId ^ -1;

                      stackIn_27_1 = ee.field_B[themeIndexThenId] ^ -1;

                      if (var4 != 0) {
                        break L6;
                      } else {
                        if (stackIn_27_0 == stackIn_27_1) {
                          if (0 < themeIndexThenId) {
                            precedingThemeId = ee.field_B[themeIndexThenId + -1];
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
                                if (-2 == (themeIndexThenId ^ -1)) {
                                  if (var4 == 0) {
                                    break L16;
                                  }
                                }
                                if (-4 == (themeIndexThenId ^ -1)) {
                                  if (var4 == 0) {
                                    break L15;
                                  }
                                }
                                if (-1 == (themeIndexThenId ^ -1)) {
                                  if (var4 == 0) {
                                    break L14;
                                  }
                                }
                                if (-7 == (themeIndexThenId ^ -1)) {
                                  break L13;
                                } else {
                                  if (5 == themeIndexThenId) {
                                    if (var4 == 0) {
                                      break L12;
                                    }
                                  }
                                  if (2 != themeIndexThenId) {
                                    break L10;
                                  } else {
                                    if (var4 == 0) {
                                      break L11;
                                    }
                                  }
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
          if (-1 > (ji.difficultyStep ^ -1)) {
            qe.b(10);
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
            pk.field_k.b(320 + -(this.sceneAnimationTick >> 883830849), 240 + -(this.sceneAnimationTick >> -1807064447), this.sceneAnimationTick, this.sceneAnimationTick, 150);
            lj.field_d.b(this.resultPanelX, -(lj.field_d.field_o >> -129235807) + 240 - -60);
            dd.field_G.a(sg.field_f, 15 + this.resultPanelX, 312, 0, -1);
            if (var4 == 0) {
              break L1;
            }
          }
          shrinkingDiameter = -this.sceneAnimationTick + 460 + 460;
          if (this.sessionPhase == 3) {
            pk.field_k.b(-(shrinkingDiameter >> 1946680609) + 320, 240 - (shrinkingDiameter >> -835172863), shrinkingDiameter, shrinkingDiameter, 150);
            lj.field_d.b(-(lj.field_d.field_s >> -1714325343) + 320, -(lj.field_d.field_o >> -174520511) + 240 + 60);
            shrinkingBonusText = Integer.toString(this.resultBonusPoints);
            dd.field_G.b(shrinkingBonusText, 320, 312, 0, -1);
            if (this.boardEmptyAtResultStart) {
              dd.field_G.b(ld.field_a, 320, 352, 0, -1);
            }
            if (var4 == 0) {
              break L1;
            }
          }
          k.field_a.d(-(k.field_a.field_s >> 2015782145) + 320, 240 - (k.field_a.field_o >> 738361857), this.resultSequenceCountdown - 150 + 150);
          lj.field_d.b(-(lj.field_d.field_s >> 1731342273) + 320, 300 + -(lj.field_d.field_o >> -1256391423));
          countdownBonusText = Integer.toString(this.resultBonusPoints);
          dd.field_G.b(countdownBonusText, 320, 312, 0, -1);
          if (this.boardEmptyAtResultStart) {
            dd.field_G.b(ld.field_a, 320, 352, 0, -1);
          }
        }
        dd.field_G.a(kd.field_d, 426, 404, 200, 100, 0, -1, 2, 0, 30);
    }

    private final void updateResultSequence(int param0) {
        int fieldTemp$0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        int stackIn_23_0 = 0;
        int statePc = 0;
        int resultProgressPercent = 0;
        int maxRadiusSquared = 0;
        int spriteOffsetFromCenterX = 0;
        int spriteOffsetFromCenterY = 0;
        int spriteColumn = 0;
        int spriteRow = 0;
        int pixelOffsetFromCenterX = 0;
        int pixelOffsetFromCenterY = 0;
        int pixelRadiusSquared = 0;
        int var11 = 0;
        GameplayEntity endingEntity = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var11 = Geoblox.field_C;
                    if (0 == this.sceneAnimationTick) {
                        statePc = 3;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 3: {
                    gf.matchChainLength = 0;
                    if (!sk.checkBoundaryLossAndStartCascade(param0 + -11)) {
                        /* Inlined CFG state: 5. */
                        {
                            this.resultBonusPoints = this.resultBonusPoints + 179;
                            this.boardEmptyAtResultStart = a.attachedEntities.isEmpty(13519);
                            this.resultSequenceCountdown = 150;
                            endingEntity = i.a((byte) -128);
                            if (null != endingEntity) {
                                statePc = 9;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        }
                    } else {
                        /* Inlined CFG state: 4. */
                        {
                            this.pointsPanelSlideDirection = 0;
                            return;
                        }
                    }
                }
                case 6: {
                    this.endingEntityRadius = 29;
                    if (var11 == 0) {
                        statePc = 22;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    vf.spriteScratchRaster.e();
                    SoftwareRasterizer.c();
                    endingEntity.entitySprite.rotateSmooth(endingEntity.entitySprite.field_s << -907967581, endingEntity.entitySprite.field_o << -2077405885, vf.spriteScratchRaster.field_s << -1078669405, vf.spriteScratchRaster.field_o << -1697489437, (int)(65535.0 * ((double)endingEntity.spriteAngleRadians / 6.283185307179586)), 4096);
                    sh.field_y.a(255);
                    maxRadiusSquared = 0;
                    spriteOffsetFromCenterX = (int)(endingEntity.positionX + 0.5f) + (-(vf.spriteScratchRaster.width >> 585464481) + -320);
                    spriteOffsetFromCenterY = -240 + ((int)(endingEntity.positionY + 0.5f) + -(vf.spriteScratchRaster.height >> -846006463));
                    spriteColumn = 0;
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    stackIn_11_0 = spriteColumn;
                    stackIn_11_1 = vf.spriteScratchRaster.width;
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    if (stackIn_11_0 >= stackIn_11_1) {
                        statePc = 21;
                        continue stateLoop;
                    } else {
                        /* Inlined CFG state: 12. */
                        {
                            stackIn_23_0 = 0;
                            stackIn_13_0 = stackIn_23_0;
                            if (var11 != 0) {
                                statePc = 23;
                                continue stateLoop;
                            } else {
                                /* Inlined CFG state: 13. */
                                {
                                    spriteRow = stackIn_13_0;
                                    statePc = 14;
                                    continue stateLoop;
                                }
                            }
                        }
                    }
                }
                case 14: {
                    if (vf.spriteScratchRaster.height <= spriteRow) {
                        statePc = 20;
                        continue stateLoop;
                    } else {
                        /* Inlined CFG state: 15. */
                        {
                            stackIn_11_0 = 0;
                            stackIn_16_0 = stackIn_11_0;
                            stackIn_11_1 = vf.spriteScratchRaster.pixels[vf.spriteScratchRaster.width * spriteRow + spriteColumn];
                            stackIn_16_1 = stackIn_11_1;
                            if (var11 != 0) {
                                statePc = 11;
                                continue stateLoop;
                            } else {
                                /* Inlined CFG state: 16. */
                                {
                                    if (stackIn_16_0 == stackIn_16_1) {
                                        statePc = 19;
                                        continue stateLoop;
                                    } else {
                                        /* Inlined CFG state: 17. */
                                        {
                                            pixelOffsetFromCenterX = spriteOffsetFromCenterX + spriteColumn;
                                            pixelOffsetFromCenterY = spriteRow + spriteOffsetFromCenterY;
                                            pixelRadiusSquared = pixelOffsetFromCenterX * pixelOffsetFromCenterX - -(pixelOffsetFromCenterY * pixelOffsetFromCenterY);
                                            if (pixelRadiusSquared <= maxRadiusSquared) {
                                                statePc = 19;
                                            } else {
                                                statePc = 18;
                                            }
                                            continue stateLoop;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                case 18: {
                    maxRadiusSquared = pixelRadiusSquared;
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    spriteRow++;
                    if (var11 == 0) {
                        statePc = 14;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    spriteColumn++;
                    if (var11 == 0) {
                        statePc = 10;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    this.endingEntityRadius = (int)(0.5 + Math.sqrt((double)maxRadiusSquared));
                    statePc = 22;
                    continue stateLoop;
                }
                case 22: {
                    this.resultCompletionTickOffset = 920 + (-(2 * this.endingEntityRadius) - 58 - 1);
                    stackIn_23_0 = param0 ^ 10;
                    statePc = 23;
                    continue stateLoop;
                }
                case 23: {
                    ra.a(stackIn_23_0, qf.field_bb);
                    statePc = 24;
                    continue stateLoop;
                }
                case 24: {
                    fieldTemp$0 = this.sceneAnimationTick + 1;
                    this.sceneAnimationTick = this.sceneAnimationTick + 1;
                    if (fieldTemp$0 == 150 + this.resultCompletionTickOffset) {
                        statePc = 63;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    if (460 <= this.sceneAnimationTick) {
                        statePc = 31;
                        continue stateLoop;
                    } else {
                        /* Inlined CFG state: 28. */
                        {
                            this.sessionPhase = 2;
                            if (var11 == 0) {
                                statePc = 39;
                            } else {
                                statePc = 31;
                            }
                            continue stateLoop;
                        }
                    }
                }
                case 31: {
                    if ((460 + -this.sceneAnimationTick + 460 ^ -1) <= (this.endingEntityRadius * 2 ^ -1)) {
                        statePc = 37;
                        continue stateLoop;
                    } else {
                        /* Inlined CFG state: 34. */
                        {
                            this.sessionPhase = 4;
                            if (var11 == 0) {
                                statePc = 39;
                            } else {
                                statePc = 37;
                            }
                            continue stateLoop;
                        }
                    }
                }
                case 37: {
                    this.sessionPhase = 3;
                    statePc = 39;
                    continue stateLoop;
                }
                case 39: {
                    if (3 != this.sessionPhase) {
                        statePc = 43;
                        continue stateLoop;
                    } else {
                        /* Inlined CFG state: 40. */
                        {
                            this.resultBonusPoints = this.resultBonusPoints + 7;
                            if (var11 == 0) {
                                statePc = 69;
                            } else {
                                statePc = 43;
                            }
                            continue stateLoop;
                        }
                    }
                }
                case 43: {
                    if (-3 == (this.sessionPhase ^ -1)) {
                        statePc = 52;
                        continue stateLoop;
                    } else {
                        /* Inlined CFG state: 46. */
                        {
                            if ((this.resultSequenceCountdown ^ -1) != -151) {
                                statePc = 51;
                                continue stateLoop;
                            } else {
                                /* Inlined CFG state: 49. */
                                {
                                    td.a(-348, fl.field_c[28]);
                                    statePc = 51;
                                    continue stateLoop;
                                }
                            }
                        }
                    }
                }
                case 51: {
                    this.resultSequenceCountdown = this.resultSequenceCountdown - 1;
                    if (var11 == 0) {
                        statePc = 69;
                    } else {
                        statePc = 52;
                    }
                    continue stateLoop;
                }
                case 52: {
                    if (this.field_M == null) {
                        statePc = 58;
                        continue stateLoop;
                    } else {
                        /* Inlined CFG state: 55. */
                        {
                            if (this.field_M.l()) {
                                statePc = 58;
                            } else {
                                statePc = 59;
                            }
                            continue stateLoop;
                        }
                    }
                }
                case 58: {
                    resultProgressPercent = this.sceneAnimationTick * 100 / 460;
                    this.field_M = PcmSampleStream.a(fl.field_c[28], 2 * resultProgressPercent - -200, 45);
                    GameplayEntity.registerAudioStream(false, this.field_M);
                    statePc = 59;
                    continue stateLoop;
                }
                case 59: {
                    if (this.resultPanelX <= 320 + -(lj.field_d.field_s >> -1578896191)) {
                        statePc = 69;
                        continue stateLoop;
                    } else {
                        /* Inlined CFG state: 60. */
                        {
                            this.resultPanelX = this.resultPanelX - 1;
                            if (var11 == 0) {
                                statePc = 69;
                            } else {
                                statePc = 63;
                            }
                            continue stateLoop;
                        }
                    }
                }
                case 63: {
                    this.sceneTransitionRequested = true;
                    this.sceneAnimationTick = 0;
                    this.sessionPhase = 5;
                    if (!this.boardEmptyAtResultStart) {
                        statePc = 68;
                        continue stateLoop;
                    } else {
                        /* Inlined CFG state: 66. */
                        {
                            ld.a(350, 320, 66, 2000);
                            ra.a(eb.field_i ^ 255, param0 + -101, eb.field_i);
                            this.connectivityRebuiltThisTick = false;
                            statePc = 68;
                            continue stateLoop;
                        }
                    }
                }
                case 68: {
                    ld.a(310, 320, 90, this.resultBonusPoints);
                    statePc = 69;
                    continue stateLoop;
                }
                case 69: {
                    cf.advanceScorePopups((byte) 33);
                    f.o(600);
                    if (param0 == 10) {
                        statePc = 72;
                        continue stateLoop;
                    } else {
                        /* Inlined CFG state: 70. */
                        {
                            GameplaySession.i(-70);
                            statePc = 72;
                            continue stateLoop;
                        }
                    }
                }
                case 72: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
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

    final void addPopupPoints(int points, int param1) {
        int var3;
        CharSequence var4;
        CharSequence var5;
        if (this.tutorialMode) {
          return;
        } else {
          L0: {
            this.pendingPopupPoints = this.pendingPopupPoints + points;
            if (-100000 > (this.pendingPopupPoints ^ -1)) {
              var4 = (CharSequence) ((Object) Integer.toString(99999));
              td.a(var4, this.popupPointsText, 0, 26);
              if (Geoblox.field_C == 0) {
                break L0;
              }
            }
            var5 = (CharSequence) ((Object) Integer.toString(this.pendingPopupPoints));
            td.a(var5, this.popupPointsText, 0, 73);
          }
          var3 = -83 % ((-19 - param1) / 54);
          return;
        }
    }

    private final void renderProgressHud(int param0) {
        int remainingThemeReleases;
        int var3;
        var3 = Geoblox.field_C;
        if (!this.preserveScoreOnTransition) {
          return;
        } else {
          L0: {
            if (-1 != (this.sessionPhase ^ -1)) {
              dd.field_G.a(tj.field_a, 426, 404, 200, 100, 0, -1, 2, 0, 30);
              if (var3 == 0) {
                break L0;
              }
            }
            remainingThemeReleases = -ul.releasedInCurrentTheme + fa.releasesPerTheme;
            dd.field_G.field_K[0][wf.field_p] = 15488514;
            dd.field_G.c(w.field_e, 621, 441, 0, -1);
            dd.field_G.field_K[0][wf.field_p] = 16689938;
            dd.field_G.c(od.field_b, 621, 468, 0, -1);
            if ((remainingThemeReleases ^ -1) >= -11) {
              dd.field_G.field_K[0][wf.field_p] = mk.field_k[remainingThemeReleases % 5];
              dd.field_G.c(Integer.toString(remainingThemeReleases), 515, 468, 0, -1);
              dd.field_G.field_K[0][wf.field_p] = 16689938;
              if (var3 == 0) {
                break L0;
              }
            }
            if (remainingThemeReleases <= 99999) {
              dd.field_G.c(Integer.toString(remainingThemeReleases), 515, 468, 0, -1);
              if (var3 == 0) {
                break L0;
              }
            }
            dd.field_G.c(Integer.toString(99999), 515, 468, 0, -1);
          }
          if (param0 >= -39) {
            this.resultBonusPoints = 7;
          }
          return;
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
              if ((this.newActionCount ^ -1) >= -1) {
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
        cd.a((byte) 116);
        IntrusiveNode.a(param0 ^ -796, var2);
    }

    final void emitPointsPopup(boolean markSubmissionBlocked) {
        if ((this.pendingPopupPoints ^ -1) == -1) {
            return;
        }
        if (markSubmissionBlocked) {
            this.submissionBlocked = true;
        }
        ld.a(34, 20 + (this.pointsPanelX - -60), 79, this.pendingPopupPoints);
        td.a(-348, fl.field_c[32]);
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
        this.field_L = false;
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
          this.boardMaskOffsetX = -(i.avatarMaskRaster.width >> -724246015);
          this.tutorialMode = param1;
          this.tutorialPromptActive = param1;
          this.score = 0;
          this.boardMaskOffsetY = -(i.avatarMaskRaster.height >> 30070753);
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
            uf.field_h[0] = 14788623;
            uf.field_h[1] = 15439657;
          }
          td.a((byte) -93);
          GameplayEntity.h(0);
          GameScreen.selectedThemeId = ee.field_B[0];
          cd.a((byte) 104);
          this.debugPointerSpawnEnabled = false;
          this.submissionBlocked = false;
          this.spawnReleaseDisabled = false;
          this.field_L = false;
          IntrusiveNode.a(-116, 1);
          if (jf.field_a == null) {
            jf.field_a = new Sprite(ec.field_c.width, ec.field_c.height);
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
          throw t.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ')');
        }
    }

    static {
        field_P = 0;
    }
}
