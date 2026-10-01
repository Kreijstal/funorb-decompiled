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
        int stackIn_124_0 = 0;
        int stackIn_124_1 = 0;
        int stackIn_168_0 = 0;
        int stackIn_168_1 = 0;
        int statePc = 0;
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
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var14 = Geoblox.field_C;
                    if (!ll.themesLoaded[GameScreen.selectedThemeId]) {
                        statePc = 3;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 3: {
                    var3 = GameScreen.selectedThemeId;
                    if ((var3 ^ -1) != -5) {
                        statePc = 7;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    if (var14 == 0) {
                        statePc = 31;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    if (-7 != (var3 ^ -1)) {
                        statePc = 13;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    if (var14 == 0) {
                        statePc = 32;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    if (var3 != 5) {
                        statePc = 19;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    if (var14 == 0) {
                        statePc = 33;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    if (-1 == (var3 ^ -1)) {
                        statePc = 34;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    if (3 != var3) {
                        statePc = 28;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    if (var14 == 0) {
                        statePc = 35;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    if (-3 == (var3 ^ -1)) {
                        statePc = 36;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 31: {
                    var2_ref_String = "baking";
                    if (var14 == 0) {
                        statePc = 38;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    var2_ref_String = "space";
                    if (var14 == 0) {
                        statePc = 38;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    var2_ref_String = "sports";
                    if (var14 == 0) {
                        statePc = 38;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    var2_ref_String = "jewels";
                    if (var14 == 0) {
                        statePc = 38;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    var2_ref_String = "germs";
                    if (var14 == 0) {
                        statePc = 38;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    var2_ref_String = "sweets";
                    if (var14 == 0) {
                        statePc = 38;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    var2_ref_String = "";
                    statePc = 38;
                    continue stateLoop;
                }
                case 38: {
                    var3_ref_String = gf.a(ff.field_l, ll.field_f, var2_ref_String, wi.field_F, true);
                    var4 = 30 + dd.field_G.a(var3_ref_String);
                    ma.a(215, 320 - var4 / 2, 50, (byte) -92, var4, ll.field_h);
                    dd.field_G.b(var3_ref_String, 320, 250, 0, -1);
                    return;
                }
                case 39: {
                    if (!ih.areEntityQueuesSettled(0)) {
                        statePc = 48;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    if (!this.sceneTransitionRequested) {
                        statePc = 48;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    if (!this.sceneTransitionInProgress) {
                        statePc = 48;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    stackIn_49_0 = 1;
                    statePc = 49;
                    continue stateLoop;
                }
                case 48: {
                    stackIn_49_0 = 0;
                    statePc = 49;
                    continue stateLoop;
                }
                case 49: {
                    var2 = stackIn_49_0;
                    if (var2 != 0) {
                        statePc = 62;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 50: {
                    if (this.boardRasterDirty) {
                        statePc = 57;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 53: {
                    oc.boardSceneRaster.e();
                    if (!this.debugReducedRendering) {
                        statePc = 56;
                    } else {
                        statePc = 62;
                    }
                    continue stateLoop;
                }
                case 56: {
                    gj.drawSpecialAttachedEntities((byte) -63);
                    if (var14 == 0) {
                        statePc = 62;
                    } else {
                        statePc = 57;
                    }
                    continue stateLoop;
                }
                case 57: {
                    oc.boardSceneRaster.e();
                    SoftwareRasterizer.c();
                    if (!this.debugReducedRendering) {
                        statePc = 60;
                    } else {
                        statePc = 61;
                    }
                    continue stateLoop;
                }
                case 60: {
                    dc.drawAttachedEntities(7838);
                    statePc = 61;
                    continue stateLoop;
                }
                case 61: {
                    k.a(10, 90, 460, -27085, 460);
                    this.boardRasterDirty = false;
                    statePc = 62;
                    continue stateLoop;
                }
                case 62: {
                    sh.field_y.a(255);
                    mf.field_a.b(0, 0);
                    var3 = 4;
                    var4 = 4;
                    if (param0 < -28) {
                        statePc = 65;
                    } else {
                        statePc = 63;
                    }
                    continue stateLoop;
                }
                case 63: {
                    this.updateSession(-63);
                    statePc = 65;
                    continue stateLoop;
                }
                case 65: {
                    if (this.field_L) {
                        statePc = 68;
                    } else {
                        statePc = 71;
                    }
                    continue stateLoop;
                }
                case 68: {
                    if (this.sceneAnimationTick > 266) {
                        statePc = 70;
                    } else {
                        statePc = 69;
                    }
                    continue stateLoop;
                }
                case 69: {
                    var5_float = (float)this.sceneAnimationTick / 266.0f;
                    var6_float = -var5_float + 1.0f;
                    var7_float = var6_float * var6_float;
                    var3 = (int)(0.5f + (70.0f * (2.0f * var5_float * var6_float) + 10.0f * var7_float + 220.0f * (var5_float * var5_float)));
                    var4 = (int)(170.0f * (var5_float * var5_float) + (var7_float * 10.0f + 140.0f * (var5_float * 2.0f * var6_float)) + 0.5f);
                    if (var14 == 0) {
                        statePc = 71;
                    } else {
                        statePc = 70;
                    }
                    continue stateLoop;
                }
                case 70: {
                    var3 = 220;
                    var4 = 170;
                    statePc = 71;
                    continue stateLoop;
                }
                case 71: {
                    if (!this.tutorialMode) {
                        statePc = 77;
                    } else {
                        statePc = 72;
                    }
                    continue stateLoop;
                }
                case 72: {
                    var5 = 176 - this.updateTick / 2;
                    if (10 > var5) {
                        statePc = 75;
                    } else {
                        statePc = 76;
                    }
                    continue stateLoop;
                }
                case 75: {
                    var5 = 10;
                    statePc = 76;
                    continue stateLoop;
                }
                case 76: {
                    var6 = -fi.field_d.field_q + fi.field_d.field_o;
                    var7_int = fi.field_d.c(v.field_n, 640) + 40;
                    var8 = fi.field_d.b(v.field_n, 640) * var6 - -10;
                    ma.a(var5, -(var7_int / 2) + 320, 20 + var8, (byte) -92, var7_int, ll.field_h);
                    fi.field_d.b(v.field_n, 320, var5 + 28, 1, -1);
                    fi.field_d.b(v.field_n, 319, 28 + var5, 1, -1);
                    if (var14 == 0) {
                        statePc = 88;
                    } else {
                        statePc = 77;
                    }
                    continue stateLoop;
                }
                case 77: {
                    lj.field_d.b(var3, var4);
                    if (0 != this.sessionPhase) {
                        statePc = 83;
                    } else {
                        statePc = 80;
                    }
                    continue stateLoop;
                }
                case 80: {
                    if (!ih.areEntityQueuesSettled(0)) {
                        statePc = 86;
                    } else {
                        statePc = 83;
                    }
                    continue stateLoop;
                }
                case 83: {
                    vh.field_G.b(446, 410);
                    if (var14 == 0) {
                        statePc = 88;
                    } else {
                        statePc = 86;
                    }
                    continue stateLoop;
                }
                case 86: {
                    g.field_i.b(468, 410);
                    statePc = 88;
                    continue stateLoop;
                }
                case 88: {
                    if (this.tutorialMode) {
                        statePc = 103;
                    } else {
                        statePc = 89;
                    }
                    continue stateLoop;
                }
                case 89: {
                    if (!ih.areEntityQueuesSettled(0)) {
                        statePc = 101;
                    } else {
                        statePc = 92;
                    }
                    continue stateLoop;
                }
                case 92: {
                    if (var2 == 0) {
                        statePc = 103;
                    } else {
                        statePc = 95;
                    }
                    continue stateLoop;
                }
                case 95: {
                    if (0 == this.sessionPhase) {
                        statePc = 101;
                    } else {
                        statePc = 98;
                    }
                    continue stateLoop;
                }
                case 98: {
                    if (-2 != (this.sessionPhase ^ -1)) {
                        statePc = 103;
                    } else {
                        statePc = 101;
                    }
                    continue stateLoop;
                }
                case 101: {
                    this.renderProgressHud(-46);
                    statePc = 103;
                    continue stateLoop;
                }
                case 103: {
                    if (!this.debugReducedRendering) {
                        statePc = 106;
                    } else {
                        statePc = 107;
                    }
                    continue stateLoop;
                }
                case 106: {
                    h.c(-1);
                    statePc = 107;
                    continue stateLoop;
                }
                case 107: {
                    if (this.debugReducedRendering) {
                        statePc = 112;
                    } else {
                        statePc = 108;
                    }
                    continue stateLoop;
                }
                case 108: {
                    if (var2 == 0) {
                        statePc = 111;
                    } else {
                        statePc = 112;
                    }
                    continue stateLoop;
                }
                case 111: {
                    oc.boardSceneRaster.b(0, 0);
                    statePc = 112;
                    continue stateLoop;
                }
                case 112: {
                    ij.h((byte) 18);
                    if (!this.debugReducedRendering) {
                        statePc = 115;
                    } else {
                        statePc = 116;
                    }
                    continue stateLoop;
                }
                case 115: {
                    ni.f(484842465);
                    statePc = 116;
                    continue stateLoop;
                }
                case 116: {
                    jf.field_a.e();
                    SoftwareRasterizer.c();
                    ec.field_c.rotateNearest(ec.field_c.field_s << 1679206499, ec.field_c.field_o << 919227299, jf.field_a.field_s << -122785245, jf.field_a.field_o << 1137750627, (int)(65535.0 * ((double)(-this.boardAngleRadians) / 6.283185307179586)), 4096);
                    sh.field_y.a(255);
                    w.a(jf.field_a, -(jf.field_a.field_s >> -199505663) + 320, -(jf.field_a.field_o >> -1092517823) + 240);
                    if (!this.debugReducedRendering) {
                        statePc = 119;
                    } else {
                        statePc = 120;
                    }
                    continue stateLoop;
                }
                case 119: {
                    uh.d(4740);
                    statePc = 120;
                    continue stateLoop;
                }
                case 120: {
                    if (!this.showDebugOverview) {
                        statePc = 169;
                    } else {
                        statePc = 121;
                    }
                    continue stateLoop;
                }
                case 121: {
                    af.field_a.e();
                    SoftwareRasterizer.a(0, 0, SoftwareRasterizer.stride, SoftwareRasterizer.field_b, 1118481);
                    var5 = 16777215;
                    SoftwareRasterizer.f(160, 120, 115, 16711680);
                    var6 = 20;
                    var15 = wd.spawnQueue;
                    renderedEntity = (GameplayEntity) ((Object) var15.lastForIteration(false));
                    statePc = 122;
                    continue stateLoop;
                }
                case 122: {
                    if (renderedEntity == null) {
                        statePc = 133;
                    } else {
                        statePc = 123;
                    }
                    continue stateLoop;
                }
                case 123: {
                    entityOffsetX = -320.0f + renderedEntity.positionX;
                    entityOffsetY = -240.0f + renderedEntity.positionY;
                    renderedEntityX = (int)(320.0 + (Math.cos((double)el.gameplaySession.boardAngleRadians) * (double)entityOffsetX - Math.sin((double)el.gameplaySession.boardAngleRadians) * (double)entityOffsetY));
                    renderedEntityY = (int)(240.0 + ((double)entityOffsetX * Math.sin((double)el.gameplaySession.boardAngleRadians) + (double)entityOffsetY * Math.cos((double)el.gameplaySession.boardAngleRadians)));
                    entityOpacity = 255 - renderedEntity.remainingLifetimeTicks * 255 / renderedEntity.initialLifetimeTicks;
                    stackIn_168_0 = 11;
                    stackIn_124_0 = stackIn_168_0;
                    stackIn_168_1 = entityOpacity;
                    stackIn_124_1 = stackIn_168_1;
                    if (var14 != 0) {
                        statePc = 168;
                    } else {
                        statePc = 124;
                    }
                    continue stateLoop;
                }
                case 124: {
                    if (stackIn_124_0 > stackIn_124_1) {
                        statePc = 127;
                    } else {
                        statePc = 128;
                    }
                    continue stateLoop;
                }
                case 127: {
                    entityOpacity = 11;
                    statePc = 128;
                    continue stateLoop;
                }
                case 128: {
                    if (-256 > (entityOpacity ^ -1)) {
                        statePc = 131;
                    } else {
                        statePc = 132;
                    }
                    continue stateLoop;
                }
                case 131: {
                    entityOpacity = 255;
                    statePc = 132;
                    continue stateLoop;
                }
                case 132: {
                    SoftwareRasterizer.d(renderedEntityX / 2, renderedEntityY / 2, var6, entityOpacity << 269082696 | entityOpacity << -327781456 | entityOpacity);
                    renderedEntity = (GameplayEntity) ((Object) var15.previousForIteration(0));
                    if (var14 == 0) {
                        statePc = 122;
                    } else {
                        statePc = 133;
                    }
                    continue stateLoop;
                }
                case 133: {
                    var16 = ji.movingEntities;
                    var7 = var16;
                    renderedEntity = (GameplayEntity) ((Object) var16.firstForIteration(0));
                    statePc = 134;
                    continue stateLoop;
                }
                case 134: {
                    if (null == renderedEntity) {
                        statePc = 139;
                    } else {
                        statePc = 135;
                    }
                    continue stateLoop;
                }
                case 135: {
                    entityOffsetX = -320.0f + renderedEntity.positionX;
                    entityOffsetY = -240.0f + renderedEntity.positionY;
                    renderedEntityX = (int)(Math.cos((double)el.gameplaySession.boardAngleRadians) * (double)entityOffsetX - Math.sin((double)el.gameplaySession.boardAngleRadians) * (double)entityOffsetY + 320.0);
                    renderedEntityY = (int)(240.0 + ((double)entityOffsetX * Math.sin((double)el.gameplaySession.boardAngleRadians) + (double)entityOffsetY * Math.cos((double)el.gameplaySession.boardAngleRadians)));
                    SoftwareRasterizer.d(renderedEntityX / 2, renderedEntityY / 2, var6, var5);
                    renderedEntity = (GameplayEntity) ((Object) var16.nextForIteration(1));
                    if (var14 != 0) {
                        statePc = 140;
                    } else {
                        statePc = 136;
                    }
                    continue stateLoop;
                }
                case 136: {
                    if (var14 == 0) {
                        statePc = 134;
                    } else {
                        statePc = 139;
                    }
                    continue stateLoop;
                }
                case 139: {
                    var7 = a.attachedEntities;
                    statePc = 140;
                    continue stateLoop;
                }
                case 140: {
                    renderedEntity = (GameplayEntity) ((Object) var7.firstForIteration(0));
                    statePc = 141;
                    continue stateLoop;
                }
                case 141: {
                    if (renderedEntity == null) {
                        statePc = 146;
                    } else {
                        statePc = 142;
                    }
                    continue stateLoop;
                }
                case 142: {
                    SoftwareRasterizer.d((int)(renderedEntity.positionX / 2.0f), (int)(renderedEntity.positionY / 2.0f), var6, var5);
                    renderedEntity = (GameplayEntity) ((Object) var7.nextForIteration(1));
                    if (var14 != 0) {
                        statePc = 147;
                    } else {
                        statePc = 143;
                    }
                    continue stateLoop;
                }
                case 143: {
                    if (var14 == 0) {
                        statePc = 141;
                    } else {
                        statePc = 146;
                    }
                    continue stateLoop;
                }
                case 146: {
                    var7 = bh.field_c;
                    statePc = 147;
                    continue stateLoop;
                }
                case 147: {
                    renderedEntity = (GameplayEntity) ((Object) var7.firstForIteration(0));
                    statePc = 148;
                    continue stateLoop;
                }
                case 148: {
                    if (renderedEntity == null) {
                        statePc = 153;
                    } else {
                        statePc = 149;
                    }
                    continue stateLoop;
                }
                case 149: {
                    SoftwareRasterizer.d((int)(renderedEntity.positionX / 2.0f), (int)(renderedEntity.positionY / 2.0f), var6, var5);
                    renderedEntity = (GameplayEntity) ((Object) var7.nextForIteration(1));
                    if (var14 != 0) {
                        statePc = 158;
                    } else {
                        statePc = 150;
                    }
                    continue stateLoop;
                }
                case 150: {
                    if (var14 == 0) {
                        statePc = 148;
                    } else {
                        statePc = 153;
                    }
                    continue stateLoop;
                }
                case 153: {
                    if (!this.tutorialMode) {
                        statePc = 157;
                    } else {
                        statePc = 154;
                    }
                    continue stateLoop;
                }
                case 154: {
                    var8 = -(this.updateTick / 2) + 176;
                    if ((var8 ^ -1) <= -11) {
                        statePc = 156;
                    } else {
                        statePc = 155;
                    }
                    continue stateLoop;
                }
                case 155: {
                    var8 = 10;
                    statePc = 156;
                    continue stateLoop;
                }
                case 156: {
                    var9 = fi.field_d.field_o + -fi.field_d.field_q;
                    var10 = fi.field_d.c(v.field_n, 640) + 40;
                    renderedEntityX = fi.field_d.b(v.field_n, 640) * var9 - -10;
                    SoftwareRasterizer.a((320 - var10 / 2) / 2, var8 / 2, var10 / 2, (20 + renderedEntityX) / 2, var5);
                    statePc = 167;
                    continue stateLoop;
                }
                case 157: {
                    lj.field_d.a(var3 / 2, var4 / 2, lj.field_d.field_s / 2, lj.field_d.field_o / 2, var5);
                    statePc = 158;
                    continue stateLoop;
                }
                case 158: {
                    if (this.sessionPhase != 0) {
                        statePc = 165;
                    } else {
                        statePc = 159;
                    }
                    continue stateLoop;
                }
                case 159: {
                    if (ih.areEntityQueuesSettled(0)) {
                        statePc = 165;
                    } else {
                        statePc = 162;
                    }
                    continue stateLoop;
                }
                case 162: {
                    g.field_i.a(234, 205, g.field_i.field_s / 2, g.field_i.field_o / 2, var5);
                    if (var14 == 0) {
                        statePc = 167;
                    } else {
                        statePc = 165;
                    }
                    continue stateLoop;
                }
                case 165: {
                    vh.field_G.a(223, 205, vh.field_G.field_s / 2, vh.field_G.field_o / 2, var5);
                    statePc = 167;
                    continue stateLoop;
                }
                case 167: {
                    SoftwareRasterizer.d(160, 120, 21, 16777215);
                    SoftwareRasterizer.e(2, 2, 0, 0, SoftwareRasterizer.stride, SoftwareRasterizer.field_b);
                    sh.field_y.a(255);
                    stackIn_168_0 = SoftwareRasterizer.field_b;
                    stackIn_168_1 = 1;
                    statePc = 168;
                    continue stateLoop;
                }
                case 168: {
                    ek.a(stackIn_168_0, stackIn_168_1 != 0, af.field_a, 0, SoftwareRasterizer.stride, 0);
                    statePc = 169;
                    continue stateLoop;
                }
                case 169: {
                    if (this.tutorialMode) {
                        statePc = 206;
                    } else {
                        statePc = 170;
                    }
                    continue stateLoop;
                }
                case 170: {
                    if ((this.delayedActionCountdown ^ -1) < -1) {
                        statePc = 173;
                    } else {
                        statePc = 174;
                    }
                    continue stateLoop;
                }
                case 173: {
                    lj.field_d.b(-(lj.field_d.field_s >> -1133369407) + 320, 60 + -(lj.field_d.field_o >> -2072717343) + 240);
                    dd.field_G.b(wl.field_b, 320, 310, 0, -1);
                    statePc = 174;
                    continue stateLoop;
                }
                case 174: {
                    eg.field_q[this.pointsPanelFrameIndex].b(this.pointsPanelX, 4);
                    if (640 <= this.pointsPanelX) {
                        statePc = 179;
                    } else {
                        statePc = 175;
                    }
                    continue stateLoop;
                }
                case 175: {
                    if (0 < this.pendingPopupPoints) {
                        statePc = 178;
                    } else {
                        statePc = 179;
                    }
                    continue stateLoop;
                }
                case 178: {
                    dd.field_G.a(wj.a(ic.field_a, new String[]{this.popupPointsText.toString()}, (byte) -79), this.pointsPanelX + 20, 34, 0, -1);
                    statePc = 179;
                    continue stateLoop;
                }
                case 179: {
                    if (this.showSessionCounters) {
                        statePc = 182;
                    } else {
                        statePc = 183;
                    }
                    continue stateLoop;
                }
                case 182: {
                    dd.field_G.a(wj.a(sh.field_z, new String[]{Integer.toString(ec.field_b)}, (byte) -26), 400, 50, 0, -1);
                    dd.field_G.a(wj.a(qg.field_e, new String[]{Integer.toString(ji.difficultyStep)}, (byte) -71), 400, 80, 0, -1);
                    statePc = 183;
                    continue stateLoop;
                }
                case 183: {
                    bd.drawScorePopups(-117);
                    this.c((byte) 64);
                    if (this.field_L) {
                        statePc = 186;
                    } else {
                        statePc = 192;
                    }
                    continue stateLoop;
                }
                case 186: {
                    lj.field_d.b(var3, var4);
                    if (this.sceneAnimationTick >= 266) {
                        statePc = 190;
                    } else {
                        statePc = 187;
                    }
                    continue stateLoop;
                }
                case 187: {
                    kh.field_h[6].b(0, (this.sceneAnimationTick >> 1707498369) + -113);
                    if (var14 == 0) {
                        statePc = 192;
                    } else {
                        statePc = 190;
                    }
                    continue stateLoop;
                }
                case 190: {
                    kh.field_h[6].b(0, 20);
                    kh.field_h[6].c(0, 20, (int)(Math.cos((double)(-266 + this.sceneAnimationTick) / 40.0) * -64.0 + 64.0));
                    statePc = 192;
                    continue stateLoop;
                }
                case 192: {
                    dd.field_G.a(wj.a(pa.field_a, new String[]{this.scoreText.toString()}, (byte) -53), 15 + var3, 30 + var4, 0, -1);
                    if (!ih.areEntityQueuesSettled(0)) {
                        statePc = 205;
                    } else {
                        statePc = 193;
                    }
                    continue stateLoop;
                }
                case 193: {
                    if (0 == this.sessionPhase) {
                        statePc = 199;
                    } else {
                        statePc = 196;
                    }
                    continue stateLoop;
                }
                case 196: {
                    if (this.sessionPhase != 1) {
                        statePc = 203;
                    } else {
                        statePc = 199;
                    }
                    continue stateLoop;
                }
                case 199: {
                    if (var2 != 0) {
                        statePc = 202;
                    } else {
                        statePc = 205;
                    }
                    continue stateLoop;
                }
                case 202: {
                    var5 = 35 + (6 * this.sceneAnimationTick + -480);
                    sh.field_y.a(255);
                    SoftwareRasterizer.e(0, var5, 640, 480);
                    oc.boardSceneRaster.b(0, 0);
                    SoftwareRasterizer.e(0, 0, 640, 480);
                    qj.transitionCurtain.b(0, -480 + 6 * this.sceneAnimationTick);
                    if (var14 == 0) {
                        statePc = 205;
                    } else {
                        statePc = 203;
                    }
                    continue stateLoop;
                }
                case 203: {
                    this.renderResultSequence(false);
                    statePc = 205;
                    continue stateLoop;
                }
                case 205: {
                    vc.c(-1);
                    if (var14 == 0) {
                        statePc = 208;
                    } else {
                        statePc = 206;
                    }
                    continue stateLoop;
                }
                case 206: {
                    this.renderTutorialPrompt(2);
                    statePc = 208;
                    continue stateLoop;
                }
                case 208: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void updateSession(int param0) {
        int fieldTemp$0 = 0;
        boolean stackIn_227_0 = false;
        boolean stackIn_233_0 = false;
        Object stackIn_243_0 = null;
        Object stackIn_244_0 = null;
        Object stackIn_246_0 = null;
        Object stackIn_247_0 = null;
        Object stackIn_249_0 = null;
        Object stackIn_251_0 = null;
        Object stackIn_252_0 = null;
        int stackIn_252_1 = 0;
        Object stackIn_301_0 = null;
        Object stackIn_303_0 = null;
        Object stackIn_304_0 = null;
        int stackIn_304_1 = 0;
        Object stackIn_354_0 = null;
        Object stackIn_356_0 = null;
        Object stackIn_358_0 = null;
        Object stackIn_359_0 = null;
        int stackIn_359_1 = 0;
        int stackIn_362_0 = 0;
        int stackIn_362_1 = 0;
        Object stackIn_385_0 = null;
        Object stackIn_387_0 = null;
        Object stackIn_388_0 = null;
        int stackIn_388_1 = 0;
        Object stackIn_405_0 = null;
        Object stackIn_407_0 = null;
        Object stackIn_408_0 = null;
        int stackIn_408_1 = 0;
        Object stackIn_411_0 = null;
        Object stackIn_413_0 = null;
        Object stackIn_415_0 = null;
        Object stackIn_416_0 = null;
        int stackIn_416_1 = 0;
        Object stackIn_452_0 = null;
        Object stackIn_454_0 = null;
        Object stackIn_455_0 = null;
        int stackIn_455_1 = 0;
        int stackIn_464_0 = 0;
        int stackIn_464_1 = 0;
        int statePc = 0;
        int var2 = 0;
        int var3 = 0;
        int var4_int = 0;
        GameplayEntity var4 = null;
        int var5 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = Geoblox.field_C;
                    lh.a(param0 ^ 1578896222);
                    fieldTemp$0 = this.updateTick;
                    this.updateTick = this.updateTick + 1;
                    if ((fieldTemp$0 & 15) != 0) {
                        statePc = 10;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    this.pointsPanelFrameIndex = this.pointsPanelFrameIndex + this.pointsPanelFrameDirection;
                    if (7 == this.pointsPanelFrameIndex) {
                        statePc = 8;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    if (-1 == (this.pointsPanelFrameIndex ^ -1)) {
                        statePc = 7;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 7: {
                    this.pointsPanelFrameDirection = 1;
                    if (var5 == 0) {
                        statePc = 10;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    this.pointsPanelFrameDirection = -1;
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    if (0 == (this.updateTick & 1)) {
                        statePc = 13;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 13: {
                    if (-1 != this.pointsPanelSlideDirection) {
                        statePc = 17;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    if (463 < this.pointsPanelX) {
                        statePc = 33;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    if ((this.pointsPanelSlideDirection ^ -1) != -2) {
                        statePc = 23;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    if (this.pointsPanelX < 640) {
                        statePc = 30;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    if (-464 != (this.pointsPanelX ^ -1)) {
                        statePc = 35;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    if (-1 == (gf.matchChainLength ^ -1)) {
                        statePc = 29;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 29: {
                    this.pointsPanelSlideDirection = 1;
                    el.gameplaySession.emitPointsPopup(false);
                    if (var5 == 0) {
                        statePc = 35;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    this.pointsPanelX = this.pointsPanelX + 1;
                    if (var5 == 0) {
                        statePc = 35;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    this.pointsPanelX = this.pointsPanelX - 1;
                    statePc = 35;
                    continue stateLoop;
                }
                case 35: {
                    if (this.sessionEnding) {
                        statePc = 274;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    if (!ih.areEntityQueuesSettled(0)) {
                        statePc = 42;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    if (!this.matchBatchProcessedThisTick) {
                        statePc = 45;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    if (this.preserveScoreOnTransition) {
                        statePc = 61;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 45: {
                    if (!this.canAdvanceSession(true)) {
                        statePc = 61;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 48: {
                    if (0 == this.sessionPhase) {
                        statePc = 54;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 51: {
                    if (-6 != (this.sessionPhase ^ -1)) {
                        statePc = 58;
                    } else {
                        statePc = 54;
                    }
                    continue stateLoop;
                }
                case 54: {
                    if (this.sceneTransitionRequested) {
                        statePc = 57;
                    } else {
                        statePc = 288;
                    }
                    continue stateLoop;
                }
                case 57: {
                    this.updateSceneTransition((byte) -80);
                    if (var5 == 0) {
                        statePc = 288;
                    } else {
                        statePc = 58;
                    }
                    continue stateLoop;
                }
                case 58: {
                    this.updateResultSequence(10);
                    if (var5 == 0) {
                        statePc = 288;
                    } else {
                        statePc = 61;
                    }
                    continue stateLoop;
                }
                case 61: {
                    if (!ll.themesLoaded[GameScreen.selectedThemeId]) {
                        statePc = 64;
                    } else {
                        statePc = 65;
                    }
                    continue stateLoop;
                }
                case 64: {
                    return;
                }
                case 65: {
                    if (this.rotationControlsSwapped) {
                        statePc = 67;
                    } else {
                        statePc = 66;
                    }
                    continue stateLoop;
                }
                case 66: {
                    var2 = 96;
                    var3 = 97;
                    if (var5 == 0) {
                        statePc = 68;
                    } else {
                        statePc = 67;
                    }
                    continue stateLoop;
                }
                case 67: {
                    var3 = 96;
                    var2 = 97;
                    statePc = 68;
                    continue stateLoop;
                }
                case 68: {
                    if (kj.field_o[var2]) {
                        statePc = 71;
                    } else {
                        statePc = 146;
                    }
                    continue stateLoop;
                }
                case 71: {
                    this.boardAngleRadians = this.boardAngleRadians - DualLinkNode.rotationStepRadians;
                    ScorePopup.a((byte) 38);
                    var4_int = (ki.field_d + kd.field_c + qa.field_a + he.field_d) % 8;
                    if (var4_int != 0) {
                        statePc = 75;
                    } else {
                        statePc = 72;
                    }
                    continue stateLoop;
                }
                case 72: {
                    oa.field_a = oa.field_a + kb.field_d;
                    gb.field_g = gb.field_g - 1;
                    if (var5 == 0) {
                        statePc = 116;
                    } else {
                        statePc = 75;
                    }
                    continue stateLoop;
                }
                case 75: {
                    if (-2 != (var4_int ^ -1)) {
                        statePc = 81;
                    } else {
                        statePc = 78;
                    }
                    continue stateLoop;
                }
                case 78: {
                    oa.field_a = oa.field_a + gb.field_g;
                    kb.field_d = kb.field_d - 1;
                    if (var5 == 0) {
                        statePc = 116;
                    } else {
                        statePc = 81;
                    }
                    continue stateLoop;
                }
                case 81: {
                    if ((var4_int ^ -1) == -3) {
                        statePc = 114;
                    } else {
                        statePc = 84;
                    }
                    continue stateLoop;
                }
                case 84: {
                    if (3 != var4_int) {
                        statePc = 90;
                    } else {
                        statePc = 87;
                    }
                    continue stateLoop;
                }
                case 87: {
                    oa.field_a = oa.field_a - gb.field_g;
                    kb.field_d = kb.field_d + 1;
                    if (var5 == 0) {
                        statePc = 116;
                    } else {
                        statePc = 90;
                    }
                    continue stateLoop;
                }
                case 90: {
                    if (4 != var4_int) {
                        statePc = 96;
                    } else {
                        statePc = 93;
                    }
                    continue stateLoop;
                }
                case 93: {
                    ml.field_r = ml.field_r + kb.field_d;
                    gb.field_g = gb.field_g + 1;
                    if (var5 == 0) {
                        statePc = 116;
                    } else {
                        statePc = 96;
                    }
                    continue stateLoop;
                }
                case 96: {
                    if ((var4_int ^ -1) != -6) {
                        statePc = 102;
                    } else {
                        statePc = 99;
                    }
                    continue stateLoop;
                }
                case 99: {
                    kb.field_d = kb.field_d + 1;
                    ml.field_r = ml.field_r + gb.field_g;
                    if (var5 == 0) {
                        statePc = 116;
                    } else {
                        statePc = 102;
                    }
                    continue stateLoop;
                }
                case 102: {
                    if (-7 != (var4_int ^ -1)) {
                        statePc = 108;
                    } else {
                        statePc = 105;
                    }
                    continue stateLoop;
                }
                case 105: {
                    ml.field_r = ml.field_r - kb.field_d;
                    gb.field_g = gb.field_g - 1;
                    if (var5 == 0) {
                        statePc = 116;
                    } else {
                        statePc = 108;
                    }
                    continue stateLoop;
                }
                case 108: {
                    if ((var4_int ^ -1) != -8) {
                        statePc = 116;
                    } else {
                        statePc = 111;
                    }
                    continue stateLoop;
                }
                case 111: {
                    kb.field_d = kb.field_d - 1;
                    ml.field_r = ml.field_r - gb.field_g;
                    if (var5 == 0) {
                        statePc = 116;
                    } else {
                        statePc = 114;
                    }
                    continue stateLoop;
                }
                case 114: {
                    gb.field_g = gb.field_g + 1;
                    oa.field_a = oa.field_a - kb.field_d;
                    statePc = 116;
                    continue stateLoop;
                }
                case 116: {
                    var4_int = (kd.field_c + he.field_d + qa.field_a - -ki.field_d) % 5;
                    if (0 != var4_int) {
                        statePc = 120;
                    } else {
                        statePc = 117;
                    }
                    continue stateLoop;
                }
                case 117: {
                    dc.field_a = dc.field_a | lb.field_b + el.field_g << -751962927;
                    if (var5 == 0) {
                        statePc = 143;
                    } else {
                        statePc = 120;
                    }
                    continue stateLoop;
                }
                case 120: {
                    if ((var4_int ^ -1) == -2) {
                        statePc = 141;
                    } else {
                        statePc = 123;
                    }
                    continue stateLoop;
                }
                case 123: {
                    if (-3 == (var4_int ^ -1)) {
                        statePc = 138;
                    } else {
                        statePc = 126;
                    }
                    continue stateLoop;
                }
                case 126: {
                    if (3 != var4_int) {
                        statePc = 132;
                    } else {
                        statePc = 129;
                    }
                    continue stateLoop;
                }
                case 129: {
                    sc.field_f = sc.field_f + 1;
                    el.field_g = el.field_g + lb.field_b;
                    if (var5 == 0) {
                        statePc = 143;
                    } else {
                        statePc = 132;
                    }
                    continue stateLoop;
                }
                case 132: {
                    if ((var4_int ^ -1) != -5) {
                        statePc = 143;
                    } else {
                        statePc = 135;
                    }
                    continue stateLoop;
                }
                case 135: {
                    sc.field_f = sc.field_f - 1;
                    el.field_g = el.field_g - lb.field_b;
                    if (var5 == 0) {
                        statePc = 143;
                    } else {
                        statePc = 138;
                    }
                    continue stateLoop;
                }
                case 138: {
                    lb.field_b = lb.field_b - 1;
                    el.field_g = el.field_g - sc.field_f;
                    if (var5 == 0) {
                        statePc = 143;
                    } else {
                        statePc = 141;
                    }
                    continue stateLoop;
                }
                case 141: {
                    el.field_g = el.field_g + sc.field_f;
                    lb.field_b = lb.field_b + 1;
                    statePc = 143;
                    continue stateLoop;
                }
                case 143: {
                    if ((this.tutorialStepId ^ -1) != -1) {
                        statePc = 146;
                    } else {
                        statePc = 144;
                    }
                    continue stateLoop;
                }
                case 144: {
                    this.tutorialProgressMetric = this.tutorialProgressMetric + 1;
                    statePc = 146;
                    continue stateLoop;
                }
                case 146: {
                    if (!kj.field_o[var3]) {
                        statePc = 220;
                    } else {
                        statePc = 147;
                    }
                    continue stateLoop;
                }
                case 147: {
                    this.boardAngleRadians = this.boardAngleRadians + DualLinkNode.rotationStepRadians;
                    wd.a((byte) 74);
                    if ((this.tutorialStepId ^ -1) != -1) {
                        statePc = 152;
                    } else {
                        statePc = 150;
                    }
                    continue stateLoop;
                }
                case 150: {
                    this.tutorialProgressMetric = this.tutorialProgressMetric + 1;
                    statePc = 152;
                    continue stateLoop;
                }
                case 152: {
                    var4_int = (he.field_d + (qa.field_a - -kd.field_c) + ki.field_d) % 8;
                    if ((var4_int ^ -1) == -1) {
                        statePc = 193;
                    } else {
                        statePc = 153;
                    }
                    continue stateLoop;
                }
                case 153: {
                    if (1 == var4_int) {
                        statePc = 190;
                    } else {
                        statePc = 156;
                    }
                    continue stateLoop;
                }
                case 156: {
                    if ((var4_int ^ -1) == -3) {
                        statePc = 187;
                    } else {
                        statePc = 159;
                    }
                    continue stateLoop;
                }
                case 159: {
                    if (var4_int != 3) {
                        statePc = 165;
                    } else {
                        statePc = 162;
                    }
                    continue stateLoop;
                }
                case 162: {
                    kb.field_d = kb.field_d + 1;
                    oa.field_a = oa.field_a - gb.field_g;
                    if (var5 == 0) {
                        statePc = 195;
                    } else {
                        statePc = 165;
                    }
                    continue stateLoop;
                }
                case 165: {
                    if (4 != var4_int) {
                        statePc = 171;
                    } else {
                        statePc = 168;
                    }
                    continue stateLoop;
                }
                case 168: {
                    gb.field_g = gb.field_g + 1;
                    ml.field_r = ml.field_r + kb.field_d;
                    if (var5 == 0) {
                        statePc = 195;
                    } else {
                        statePc = 171;
                    }
                    continue stateLoop;
                }
                case 171: {
                    if (5 != var4_int) {
                        statePc = 177;
                    } else {
                        statePc = 174;
                    }
                    continue stateLoop;
                }
                case 174: {
                    kb.field_d = kb.field_d + 1;
                    ml.field_r = ml.field_r + gb.field_g;
                    if (var5 == 0) {
                        statePc = 195;
                    } else {
                        statePc = 177;
                    }
                    continue stateLoop;
                }
                case 177: {
                    if (var4_int != 6) {
                        statePc = 183;
                    } else {
                        statePc = 180;
                    }
                    continue stateLoop;
                }
                case 180: {
                    ml.field_r = ml.field_r - kb.field_d;
                    gb.field_g = gb.field_g - 1;
                    if (var5 == 0) {
                        statePc = 195;
                    } else {
                        statePc = 183;
                    }
                    continue stateLoop;
                }
                case 183: {
                    if (var4_int == 7) {
                        statePc = 186;
                    } else {
                        statePc = 195;
                    }
                    continue stateLoop;
                }
                case 186: {
                    kb.field_d = kb.field_d - 1;
                    ml.field_r = ml.field_r - gb.field_g;
                    if (var5 == 0) {
                        statePc = 195;
                    } else {
                        statePc = 187;
                    }
                    continue stateLoop;
                }
                case 187: {
                    gb.field_g = gb.field_g + 1;
                    oa.field_a = oa.field_a - kb.field_d;
                    if (var5 == 0) {
                        statePc = 195;
                    } else {
                        statePc = 190;
                    }
                    continue stateLoop;
                }
                case 190: {
                    oa.field_a = oa.field_a + gb.field_g;
                    kb.field_d = kb.field_d - 1;
                    if (var5 == 0) {
                        statePc = 195;
                    } else {
                        statePc = 193;
                    }
                    continue stateLoop;
                }
                case 193: {
                    gb.field_g = gb.field_g - 1;
                    oa.field_a = oa.field_a + kb.field_d;
                    statePc = 195;
                    continue stateLoop;
                }
                case 195: {
                    var4_int = (kd.field_c + qa.field_a - -he.field_d + ki.field_d) % 5;
                    if (-1 == (var4_int ^ -1)) {
                        statePc = 218;
                    } else {
                        statePc = 196;
                    }
                    continue stateLoop;
                }
                case 196: {
                    if (1 == var4_int) {
                        statePc = 215;
                    } else {
                        statePc = 199;
                    }
                    continue stateLoop;
                }
                case 199: {
                    if (2 == var4_int) {
                        statePc = 212;
                    } else {
                        statePc = 202;
                    }
                    continue stateLoop;
                }
                case 202: {
                    if (var4_int != 3) {
                        statePc = 208;
                    } else {
                        statePc = 205;
                    }
                    continue stateLoop;
                }
                case 205: {
                    sc.field_f = sc.field_f + 1;
                    el.field_g = el.field_g + lb.field_b;
                    if (var5 == 0) {
                        statePc = 220;
                    } else {
                        statePc = 208;
                    }
                    continue stateLoop;
                }
                case 208: {
                    if (4 == var4_int) {
                        statePc = 211;
                    } else {
                        statePc = 220;
                    }
                    continue stateLoop;
                }
                case 211: {
                    el.field_g = el.field_g - lb.field_b;
                    sc.field_f = sc.field_f - 1;
                    if (var5 == 0) {
                        statePc = 220;
                    } else {
                        statePc = 212;
                    }
                    continue stateLoop;
                }
                case 212: {
                    lb.field_b = lb.field_b - 1;
                    el.field_g = el.field_g - sc.field_f;
                    if (var5 == 0) {
                        statePc = 220;
                    } else {
                        statePc = 215;
                    }
                    continue stateLoop;
                }
                case 215: {
                    lb.field_b = lb.field_b + 1;
                    el.field_g = el.field_g + sc.field_f;
                    if (var5 == 0) {
                        statePc = 220;
                    } else {
                        statePc = 218;
                    }
                    continue stateLoop;
                }
                case 218: {
                    dc.field_a = dc.field_a | el.field_g + lb.field_b << -982889103;
                    statePc = 220;
                    continue stateLoop;
                }
                case 220: {
                    if (!kj.field_o[99]) {
                        statePc = 232;
                    } else {
                        statePc = 221;
                    }
                    continue stateLoop;
                }
                case 221: {
                    if (this.tutorialPromptActive) {
                        statePc = 232;
                    } else {
                        statePc = 224;
                    }
                    continue stateLoop;
                }
                case 224: {
                    var4 = (GameplayEntity) ((Object) ji.movingEntities.firstForIteration(0));
                    statePc = 225;
                    continue stateLoop;
                }
                case 225: {
                    if (null == var4) {
                        statePc = 232;
                    } else {
                        statePc = 226;
                    }
                    continue stateLoop;
                }
                case 226: {
                    stackIn_233_0 = var4.detachedFromBoard;
                    stackIn_227_0 = stackIn_233_0;
                    if (var5 != 0) {
                        statePc = 233;
                    } else {
                        statePc = 227;
                    }
                    continue stateLoop;
                }
                case 227: {
                    if (!stackIn_227_0) {
                        statePc = 230;
                    } else {
                        statePc = 231;
                    }
                    continue stateLoop;
                }
                case 230: {
                    var4.positionY = var4.positionY + 4.0f * var4.velocityY;
                    var4.positionX = var4.positionX + 4.0f * var4.velocityX;
                    if (var5 == 0) {
                        statePc = 232;
                    } else {
                        statePc = 231;
                    }
                    continue stateLoop;
                }
                case 231: {
                    var4 = (GameplayEntity) ((Object) ji.movingEntities.nextForIteration(1));
                    if (var5 == 0) {
                        statePc = 225;
                    } else {
                        statePc = 232;
                    }
                    continue stateLoop;
                }
                case 232: {
                    stackIn_233_0 = kj.field_o[var3];
                    statePc = 233;
                    continue stateLoop;
                }
                case 233: {
                    if (stackIn_233_0) {
                        statePc = 239;
                    } else {
                        statePc = 234;
                    }
                    continue stateLoop;
                }
                case 234: {
                    if (kj.field_o[var2]) {
                        statePc = 239;
                    } else {
                        statePc = 237;
                    }
                    continue stateLoop;
                }
                case 237: {
                    jj.b(-106);
                    statePc = 239;
                    continue stateLoop;
                }
                case 239: {
                    this.delayedActionCountdown = this.delayedActionCountdown - 1;
                    if ((this.delayedActionCountdown ^ -1) != -1) {
                        statePc = 242;
                    } else {
                        statePc = 240;
                    }
                    continue stateLoop;
                }
                case 240: {
                    ld.a(310, 320, 123, 100 + 100 * ji.difficultyStep);
                    statePc = 242;
                    continue stateLoop;
                }
                case 242: {
                    stackIn_251_0 = this;
                    stackIn_243_0 = stackIn_251_0;
                    if (fa.entitiesDetachedThisTick) {
                        statePc = 251;
                    } else {
                        statePc = 243;
                    }
                    continue stateLoop;
                }
                case 243: {
                    stackIn_251_0 = this;
                    stackIn_244_0 = stackIn_251_0;
                    if (!a.attachedEntities.isEmpty(13519)) {
                        statePc = 251;
                    } else {
                        statePc = 244;
                    }
                    continue stateLoop;
                }
                case 244: {
                    stackIn_246_0 = this;
                    statePc = 246;
                    continue stateLoop;
                }
                case 246: {
                    stackIn_251_0 = this;
                    stackIn_247_0 = stackIn_251_0;
                    if (0 >= ul.releasedInCurrentTheme) {
                        statePc = 251;
                    } else {
                        statePc = 247;
                    }
                    continue stateLoop;
                }
                case 247: {
                    stackIn_249_0 = this;
                    statePc = 249;
                    continue stateLoop;
                }
                case 249: {
                    stackIn_252_0 = this;
                    stackIn_252_1 = 1;
                    statePc = 252;
                    continue stateLoop;
                }
                case 251: {
                    stackIn_252_0 = this;
                    stackIn_252_1 = 0;
                    statePc = 252;
                    continue stateLoop;
                }
                case 252: {
                    ((GameplaySession) (this)).boardClearBonusEligible = stackIn_252_1 != 0;
                    if (!this.boardClearBonusEligible) {
                        statePc = 259;
                    } else {
                        statePc = 253;
                    }
                    continue stateLoop;
                }
                case 253: {
                    if (!this.connectivityRebuiltThisTick) {
                        statePc = 259;
                    } else {
                        statePc = 256;
                    }
                    continue stateLoop;
                }
                case 256: {
                    this.connectivityRebuiltThisTick = false;
                    this.delayedActionCountdown = 300;
                    this.boardClearBonusEligible = false;
                    ra.a(le.field_a ^ 255, -88, le.field_a);
                    if (var5 == 0) {
                        statePc = 261;
                    } else {
                        statePc = 259;
                    }
                    continue stateLoop;
                }
                case 259: {
                    this.connectivityRebuiltThisTick = false;
                    statePc = 261;
                    continue stateLoop;
                }
                case 261: {
                    this.boundaryCheckRequested = ab.boardContactStateDirty;
                    ef.advanceActiveEntityAnimations((byte) -15);
                    kc.reconcileBoardEntities(param0 + 1578896101);
                    if (ab.boardContactStateDirty) {
                        statePc = 264;
                    } else {
                        statePc = 265;
                    }
                    continue stateLoop;
                }
                case 264: {
                    ul.collectMatchCandidates(-2);
                    statePc = 265;
                    continue stateLoop;
                }
                case 265: {
                    this.matchBatchProcessedThisTick = ec.processMatchCandidates(-18913);
                    if (this.boundaryCheckRequested) {
                        statePc = 268;
                    } else {
                        statePc = 269;
                    }
                    continue stateLoop;
                }
                case 268: {
                    sk.checkBoundaryLossAndStartCascade(param0 ^ 1578896190);
                    statePc = 269;
                    continue stateLoop;
                }
                case 269: {
                    cf.advanceScorePopups((byte) 27);
                    f.o(600);
                    if (this.tutorialMode) {
                        statePc = 272;
                    } else {
                        statePc = 273;
                    }
                    continue stateLoop;
                }
                case 272: {
                    this.advanceTutorialStep(109);
                    statePc = 273;
                    continue stateLoop;
                }
                case 273: {
                    if (var5 == 0) {
                        statePc = 288;
                    } else {
                        statePc = 274;
                    }
                    continue stateLoop;
                }
                case 274: {
                    if (-1 != (this.sceneAnimationTick ^ -1)) {
                        statePc = 279;
                    } else {
                        statePc = 277;
                    }
                    continue stateLoop;
                }
                case 277: {
                    fi.a(param0 ^ -1578896191, pi.field_S);
                    statePc = 279;
                    continue stateLoop;
                }
                case 279: {
                    if (!pf.field_D) {
                        statePc = 287;
                    } else {
                        statePc = 280;
                    }
                    continue stateLoop;
                }
                case 280: {
                    if (!od.a(-3)) {
                        statePc = 287;
                    } else {
                        statePc = 283;
                    }
                    continue stateLoop;
                }
                case 283: {
                    if (this.sceneAnimationTick > 1000) {
                        statePc = 286;
                    } else {
                        statePc = 287;
                    }
                    continue stateLoop;
                }
                case 286: {
                    this.requestSessionExitScreen(28809);
                    statePc = 287;
                    continue stateLoop;
                }
                case 287: {
                    fc.a(19);
                    cf.advanceScorePopups((byte) 24);
                    f.o(600);
                    this.sceneAnimationTick = this.sceneAnimationTick + 1;
                    this.boardRasterDirty = true;
                    statePc = 288;
                    continue stateLoop;
                }
                case 288: {
                    if (param0 == -1578896191) {
                        statePc = 293;
                    } else {
                        statePc = 289;
                    }
                    continue stateLoop;
                }
                case 289: {
                    this.scoreText = (StringBuilder) null;
                    statePc = 293;
                    continue stateLoop;
                }
                case 293: {
                    if (!hh.a(111)) {
                        statePc = 463;
                    } else {
                        statePc = 294;
                    }
                    continue stateLoop;
                }
                case 294: {
                    if (te.field_a > 0) {
                        statePc = 297;
                    } else {
                        statePc = 311;
                    }
                    continue stateLoop;
                }
                case 297: {
                    pk.field_r = pk.field_r.substring(1) + te.field_a;
                    if (pk.field_r.equalsIgnoreCase("fog")) {
                        statePc = 300;
                    } else {
                        statePc = 305;
                    }
                    continue stateLoop;
                }
                case 300: {
                    stackIn_303_0 = this;
                    stackIn_301_0 = stackIn_303_0;
                    if (this.showDebugOverview) {
                        statePc = 303;
                    } else {
                        statePc = 301;
                    }
                    continue stateLoop;
                }
                case 301: {
                    stackIn_304_0 = this;
                    stackIn_304_1 = 1;
                    statePc = 304;
                    continue stateLoop;
                }
                case 303: {
                    stackIn_304_0 = this;
                    stackIn_304_1 = 0;
                    statePc = 304;
                    continue stateLoop;
                }
                case 304: {
                    ((GameplaySession) (this)).showDebugOverview = stackIn_304_1 != 0;
                    statePc = 305;
                    continue stateLoop;
                }
                case 305: {
                    if (oc.field_f < 2) {
                        statePc = 311;
                    } else {
                        statePc = 306;
                    }
                    continue stateLoop;
                }
                case 306: {
                    if (!pk.field_r.equalsIgnoreCase("brk")) {
                        statePc = 311;
                    } else {
                        statePc = 309;
                    }
                    continue stateLoop;
                }
                case 309: {
                    this.gameApplet.h((byte) 41);
                    statePc = 311;
                    continue stateLoop;
                }
                case 311: {
                    if ((ki.field_d ^ -1) != -14) {
                        statePc = 321;
                    } else {
                        statePc = 312;
                    }
                    continue stateLoop;
                }
                case 312: {
                    if (this.sessionEnding) {
                        statePc = 318;
                    } else {
                        statePc = 315;
                    }
                    continue stateLoop;
                }
                case 315: {
                    ai.requestedScreenId = 1;
                    if (var5 == 0) {
                        statePc = 523;
                    } else {
                        statePc = 318;
                    }
                    continue stateLoop;
                }
                case 318: {
                    this.requestSessionExitScreen(28809);
                    statePc = 320;
                    continue stateLoop;
                }
                case 320: {
                    return;
                }
                case 321: {
                    if (-84 == (ki.field_d ^ -1)) {
                        statePc = 324;
                    } else {
                        statePc = 327;
                    }
                    continue stateLoop;
                }
                case 324: {
                    if (!this.tutorialMode) {
                        statePc = 327;
                    } else {
                        statePc = 325;
                    }
                    continue stateLoop;
                }
                case 325: {
                    this.leaveTutorial(7000);
                    statePc = 327;
                    continue stateLoop;
                }
                case 327: {
                    if (ki.field_d != 84) {
                        statePc = 344;
                    } else {
                        statePc = 328;
                    }
                    continue stateLoop;
                }
                case 328: {
                    if (this.tutorialStepPhase == 0) {
                        statePc = 331;
                    } else {
                        statePc = 344;
                    }
                    continue stateLoop;
                }
                case 331: {
                    this.tutorialStepPhase = 1;
                    this.tutorialPromptActive = false;
                    if (-1 == (this.tutorialStepId ^ -1)) {
                        statePc = 342;
                    } else {
                        statePc = 332;
                    }
                    continue stateLoop;
                }
                case 332: {
                    if ((this.tutorialStepId ^ -1) == -2) {
                        statePc = 339;
                    } else {
                        statePc = 335;
                    }
                    continue stateLoop;
                }
                case 335: {
                    if (-3 == (this.tutorialStepId ^ -1)) {
                        statePc = 338;
                    } else {
                        statePc = 344;
                    }
                    continue stateLoop;
                }
                case 338: {
                    this.tutorialProgressMetric = dk.categoryMatchCandidateCount;
                    if (var5 == 0) {
                        statePc = 344;
                    } else {
                        statePc = 339;
                    }
                    continue stateLoop;
                }
                case 339: {
                    this.tutorialProgressMetric = dd.variantMatchCandidateCount;
                    if (var5 == 0) {
                        statePc = 344;
                    } else {
                        statePc = 342;
                    }
                    continue stateLoop;
                }
                case 342: {
                    this.tutorialProgressMetric = 0;
                    statePc = 344;
                    continue stateLoop;
                }
                case 344: {
                    if ((ki.field_d ^ -1) != -86) {
                        statePc = 352;
                    } else {
                        statePc = 345;
                    }
                    continue stateLoop;
                }
                case 345: {
                    if (5 != this.tutorialStepId) {
                        statePc = 352;
                    } else {
                        statePc = 348;
                    }
                    continue stateLoop;
                }
                case 348: {
                    if (-1 == (this.tutorialStepPhase ^ -1)) {
                        statePc = 351;
                    } else {
                        statePc = 352;
                    }
                    continue stateLoop;
                }
                case 351: {
                    this.leaveTutorial(param0 ^ -1578897511);
                    this.tutorialMode = true;
                    this.tutorialStepId = 0;
                    this.tutorialPromptActive = true;
                    statePc = 352;
                    continue stateLoop;
                }
                case 352: {
                    if (jg.field_g != ki.field_d) {
                        statePc = 360;
                    } else {
                        statePc = 353;
                    }
                    continue stateLoop;
                }
                case 353: {
                    stackIn_358_0 = this;
                    stackIn_354_0 = stackIn_358_0;
                    if (this.rotationControlsSwapped) {
                        statePc = 358;
                    } else {
                        statePc = 354;
                    }
                    continue stateLoop;
                }
                case 354: {
                    stackIn_356_0 = this;
                    statePc = 356;
                    continue stateLoop;
                }
                case 356: {
                    stackIn_359_0 = this;
                    stackIn_359_1 = 1;
                    statePc = 359;
                    continue stateLoop;
                }
                case 358: {
                    stackIn_359_0 = this;
                    stackIn_359_1 = 0;
                    statePc = 359;
                    continue stateLoop;
                }
                case 359: {
                    ((GameplaySession) (this)).rotationControlsSwapped = stackIn_359_1 != 0;
                    jc.a(7, false);
                    statePc = 360;
                    continue stateLoop;
                }
                case 360: {
                    if (2 > oc.field_f) {
                        statePc = 293;
                    } else {
                        statePc = 361;
                    }
                    continue stateLoop;
                }
                case 361: {
                    stackIn_464_0 = ki.field_d;
                    stackIn_362_0 = stackIn_464_0;
                    stackIn_464_1 = 48;
                    stackIn_362_1 = stackIn_464_1;
                    if (var5 != 0) {
                        statePc = 464;
                    } else {
                        statePc = 362;
                    }
                    continue stateLoop;
                }
                case 362: {
                    if (stackIn_362_0 != stackIn_362_1) {
                        statePc = 369;
                    } else {
                        statePc = 365;
                    }
                    continue stateLoop;
                }
                case 365: {
                    this.debugSpawnVariantId = this.debugSpawnVariantId - 1;
                    if ((this.debugSpawnVariantId ^ -1) > -1) {
                        statePc = 368;
                    } else {
                        statePc = 369;
                    }
                    continue stateLoop;
                }
                case 368: {
                    this.debugSpawnVariantId = 6;
                    statePc = 369;
                    continue stateLoop;
                }
                case 369: {
                    if (-50 == (ki.field_d ^ -1)) {
                        statePc = 372;
                    } else {
                        statePc = 375;
                    }
                    continue stateLoop;
                }
                case 372: {
                    this.debugSpawnVariantId = this.debugSpawnVariantId + 1;
                    if (this.debugSpawnVariantId != 7) {
                        statePc = 375;
                    } else {
                        statePc = 373;
                    }
                    continue stateLoop;
                }
                case 373: {
                    this.debugSpawnVariantId = 0;
                    statePc = 375;
                    continue stateLoop;
                }
                case 375: {
                    if (-65 != (ki.field_d ^ -1)) {
                        statePc = 381;
                    } else {
                        statePc = 376;
                    }
                    continue stateLoop;
                }
                case 376: {
                    this.debugSpawnCategoryId = this.debugSpawnCategoryId - 1;
                    if (-1 >= (this.debugSpawnCategoryId ^ -1)) {
                        statePc = 381;
                    } else {
                        statePc = 379;
                    }
                    continue stateLoop;
                }
                case 379: {
                    this.debugSpawnCategoryId = 6;
                    statePc = 381;
                    continue stateLoop;
                }
                case 381: {
                    if (32 == ki.field_d) {
                        statePc = 384;
                    } else {
                        statePc = 389;
                    }
                    continue stateLoop;
                }
                case 384: {
                    stackIn_387_0 = this;
                    stackIn_385_0 = stackIn_387_0;
                    if (this.debugSpawnSpecialKinds) {
                        statePc = 387;
                    } else {
                        statePc = 385;
                    }
                    continue stateLoop;
                }
                case 385: {
                    stackIn_388_0 = this;
                    stackIn_388_1 = 1;
                    statePc = 388;
                    continue stateLoop;
                }
                case 387: {
                    stackIn_388_0 = this;
                    stackIn_388_1 = 0;
                    statePc = 388;
                    continue stateLoop;
                }
                case 388: {
                    ((GameplaySession) (this)).debugSpawnSpecialKinds = stackIn_388_1 != 0;
                    statePc = 389;
                    continue stateLoop;
                }
                case 389: {
                    if (ki.field_d != 65) {
                        statePc = 394;
                    } else {
                        statePc = 390;
                    }
                    continue stateLoop;
                }
                case 390: {
                    this.debugSpawnCategoryId = this.debugSpawnCategoryId + 1;
                    if ((this.debugSpawnCategoryId ^ -1) == -8) {
                        statePc = 393;
                    } else {
                        statePc = 394;
                    }
                    continue stateLoop;
                }
                case 393: {
                    this.debugSpawnCategoryId = 0;
                    statePc = 394;
                    continue stateLoop;
                }
                case 394: {
                    if ((ki.field_d ^ -1) == -17) {
                        statePc = 397;
                    } else {
                        statePc = 398;
                    }
                    continue stateLoop;
                }
                case 397: {
                    this.tutorialAdvanceRequested = true;
                    statePc = 398;
                    continue stateLoop;
                }
                case 398: {
                    if (68 != ki.field_d) {
                        statePc = 401;
                    } else {
                        statePc = 399;
                    }
                    continue stateLoop;
                }
                case 399: {
                    this.sessionPhase = 1;
                    this.submissionBlocked = true;
                    statePc = 401;
                    continue stateLoop;
                }
                case 401: {
                    if (ki.field_d == 1) {
                        statePc = 404;
                    } else {
                        statePc = 409;
                    }
                    continue stateLoop;
                }
                case 404: {
                    this.submissionBlocked = true;
                    stackIn_407_0 = this;
                    stackIn_405_0 = stackIn_407_0;
                    if (this.debugPointerSpawnEnabled) {
                        statePc = 407;
                    } else {
                        statePc = 405;
                    }
                    continue stateLoop;
                }
                case 405: {
                    stackIn_408_0 = this;
                    stackIn_408_1 = 1;
                    statePc = 408;
                    continue stateLoop;
                }
                case 407: {
                    stackIn_408_0 = this;
                    stackIn_408_1 = 0;
                    statePc = 408;
                    continue stateLoop;
                }
                case 408: {
                    ((GameplaySession) (this)).debugPointerSpawnEnabled = stackIn_408_1 != 0;
                    statePc = 409;
                    continue stateLoop;
                }
                case 409: {
                    if (2 != ki.field_d) {
                        statePc = 417;
                    } else {
                        statePc = 410;
                    }
                    continue stateLoop;
                }
                case 410: {
                    stackIn_415_0 = this;
                    stackIn_411_0 = stackIn_415_0;
                    if (this.spawnReleaseDisabled) {
                        statePc = 415;
                    } else {
                        statePc = 411;
                    }
                    continue stateLoop;
                }
                case 411: {
                    stackIn_413_0 = this;
                    statePc = 413;
                    continue stateLoop;
                }
                case 413: {
                    stackIn_416_0 = this;
                    stackIn_416_1 = 1;
                    statePc = 416;
                    continue stateLoop;
                }
                case 415: {
                    stackIn_416_0 = this;
                    stackIn_416_1 = 0;
                    statePc = 416;
                    continue stateLoop;
                }
                case 416: {
                    ((GameplaySession) (this)).spawnReleaseDisabled = stackIn_416_1 != 0;
                    this.submissionBlocked = true;
                    statePc = 417;
                    continue stateLoop;
                }
                case 417: {
                    if ((ki.field_d ^ -1) != -4) {
                        statePc = 420;
                    } else {
                        statePc = 418;
                    }
                    continue stateLoop;
                }
                case 418: {
                    ag.field_k = 7;
                    f.field_qb = 7;
                    statePc = 420;
                    continue stateLoop;
                }
                case 420: {
                    if ((ki.field_d ^ -1) == -5) {
                        statePc = 423;
                    } else {
                        statePc = 424;
                    }
                    continue stateLoop;
                }
                case 423: {
                    hd.recordEntityRelease(2);
                    this.submissionBlocked = true;
                    statePc = 424;
                    continue stateLoop;
                }
                case 424: {
                    if ((ki.field_d ^ -1) != -6) {
                        statePc = 427;
                    } else {
                        statePc = 425;
                    }
                    continue stateLoop;
                }
                case 425: {
                    GameScreen.selectedThemeId = 1;
                    IntrusiveNode.a(param0 ^ 1578896207, GameScreen.selectedThemeId);
                    cd.a((byte) 110);
                    statePc = 427;
                    continue stateLoop;
                }
                case 427: {
                    if ((ki.field_d ^ -1) != -7) {
                        statePc = 430;
                    } else {
                        statePc = 428;
                    }
                    continue stateLoop;
                }
                case 428: {
                    GameScreen.selectedThemeId = 0;
                    IntrusiveNode.a(-126, GameScreen.selectedThemeId);
                    cd.a((byte) 126);
                    statePc = 430;
                    continue stateLoop;
                }
                case 430: {
                    if (7 == ki.field_d) {
                        statePc = 433;
                    } else {
                        statePc = 434;
                    }
                    continue stateLoop;
                }
                case 433: {
                    GameScreen.selectedThemeId = 6;
                    IntrusiveNode.a(-99, GameScreen.selectedThemeId);
                    cd.a((byte) 113);
                    statePc = 434;
                    continue stateLoop;
                }
                case 434: {
                    if (ki.field_d == 8) {
                        statePc = 437;
                    } else {
                        statePc = 438;
                    }
                    continue stateLoop;
                }
                case 437: {
                    GameScreen.selectedThemeId = 5;
                    IntrusiveNode.a(-124, GameScreen.selectedThemeId);
                    cd.a((byte) 115);
                    statePc = 438;
                    continue stateLoop;
                }
                case 438: {
                    if (-10 != (ki.field_d ^ -1)) {
                        statePc = 441;
                    } else {
                        statePc = 439;
                    }
                    continue stateLoop;
                }
                case 439: {
                    GameScreen.selectedThemeId = 3;
                    IntrusiveNode.a(-98, GameScreen.selectedThemeId);
                    cd.a((byte) 122);
                    statePc = 441;
                    continue stateLoop;
                }
                case 441: {
                    if (10 != ki.field_d) {
                        statePc = 444;
                    } else {
                        statePc = 442;
                    }
                    continue stateLoop;
                }
                case 442: {
                    GameScreen.selectedThemeId = 4;
                    IntrusiveNode.a(param0 ^ 1578896198, GameScreen.selectedThemeId);
                    cd.a((byte) 101);
                    statePc = 444;
                    continue stateLoop;
                }
                case 444: {
                    if ((ki.field_d ^ -1) == -12) {
                        statePc = 447;
                    } else {
                        statePc = 448;
                    }
                    continue stateLoop;
                }
                case 447: {
                    GameScreen.selectedThemeId = 2;
                    IntrusiveNode.a(-118, GameScreen.selectedThemeId);
                    cd.a((byte) 82);
                    statePc = 448;
                    continue stateLoop;
                }
                case 448: {
                    if (ki.field_d == 12) {
                        statePc = 451;
                    } else {
                        statePc = 456;
                    }
                    continue stateLoop;
                }
                case 451: {
                    stackIn_454_0 = this;
                    stackIn_452_0 = stackIn_454_0;
                    if (this.debugReducedRendering) {
                        statePc = 454;
                    } else {
                        statePc = 452;
                    }
                    continue stateLoop;
                }
                case 452: {
                    stackIn_455_0 = this;
                    stackIn_455_1 = 1;
                    statePc = 455;
                    continue stateLoop;
                }
                case 454: {
                    stackIn_455_0 = this;
                    stackIn_455_1 = 0;
                    statePc = 455;
                    continue stateLoop;
                }
                case 455: {
                    ((GameplaySession) (this)).debugReducedRendering = stackIn_455_1 != 0;
                    statePc = 456;
                    continue stateLoop;
                }
                case 456: {
                    if (36 != ki.field_d) {
                        statePc = 459;
                    } else {
                        statePc = 457;
                    }
                    continue stateLoop;
                }
                case 457: {
                    GameScreen.selectedThemeId = GameScreen.selectedThemeId + 1;
                    GameScreen.selectedThemeId = GameScreen.selectedThemeId % 7;
                    cd.a((byte) 108);
                    statePc = 459;
                    continue stateLoop;
                }
                case 459: {
                    if ((ki.field_d ^ -1) == -40) {
                        statePc = 462;
                    } else {
                        statePc = 293;
                    }
                    continue stateLoop;
                }
                case 462: {
                    this.showSessionCounters = true;
                    if (var5 == 0) {
                        statePc = 293;
                    } else {
                        statePc = 463;
                    }
                    continue stateLoop;
                }
                case 463: {
                    stackIn_464_0 = bi.field_g ^ -1;
                    stackIn_464_1 = -1;
                    statePc = 464;
                    continue stateLoop;
                }
                case 464: {
                    if (stackIn_464_0 == stackIn_464_1) {
                        statePc = 522;
                    } else {
                        statePc = 465;
                    }
                    continue stateLoop;
                }
                case 465: {
                    if (!this.debugPointerSpawnEnabled) {
                        statePc = 473;
                    } else {
                        statePc = 468;
                    }
                    continue stateLoop;
                }
                case 468: {
                    if ((oc.field_f ^ -1) > -3) {
                        statePc = 473;
                    } else {
                        statePc = 471;
                    }
                    continue stateLoop;
                }
                case 471: {
                    nb.spawnEntityAtPointer(-28195, mc.field_a, this.debugSpawnCategoryId, he.field_d, this.debugSpawnVariantId, this.debugSpawnSpecialKinds);
                    statePc = 473;
                    continue stateLoop;
                }
                case 473: {
                    if (!this.tutorialMode) {
                        statePc = 522;
                    } else {
                        statePc = 474;
                    }
                    continue stateLoop;
                }
                case 474: {
                    if ((this.tutorialStepPhase ^ -1) != -1) {
                        statePc = 522;
                    } else {
                        statePc = 477;
                    }
                    continue stateLoop;
                }
                case 477: {
                    if (-6 == (this.tutorialStepId ^ -1)) {
                        statePc = 496;
                    } else {
                        statePc = 480;
                    }
                    continue stateLoop;
                }
                case 480: {
                    this.tutorialPromptActive = false;
                    this.tutorialStepPhase = 1;
                    if (this.tutorialStepId != 0) {
                        statePc = 486;
                    } else {
                        statePc = 483;
                    }
                    continue stateLoop;
                }
                case 483: {
                    this.tutorialProgressMetric = 0;
                    if (var5 == 0) {
                        statePc = 522;
                    } else {
                        statePc = 486;
                    }
                    continue stateLoop;
                }
                case 486: {
                    if ((this.tutorialStepId ^ -1) != -2) {
                        statePc = 492;
                    } else {
                        statePc = 489;
                    }
                    continue stateLoop;
                }
                case 489: {
                    this.tutorialProgressMetric = dd.variantMatchCandidateCount;
                    if (var5 == 0) {
                        statePc = 522;
                    } else {
                        statePc = 492;
                    }
                    continue stateLoop;
                }
                case 492: {
                    if ((this.tutorialStepId ^ -1) == -3) {
                        statePc = 495;
                    } else {
                        statePc = 522;
                    }
                    continue stateLoop;
                }
                case 495: {
                    this.tutorialProgressMetric = dk.categoryMatchCandidateCount;
                    if (var5 == 0) {
                        statePc = 522;
                    } else {
                        statePc = 496;
                    }
                    continue stateLoop;
                }
                case 496: {
                    if (-101 <= (mc.field_a ^ -1)) {
                        statePc = 509;
                    } else {
                        statePc = 499;
                    }
                    continue stateLoop;
                }
                case 499: {
                    if (340 <= mc.field_a) {
                        statePc = 509;
                    } else {
                        statePc = 502;
                    }
                    continue stateLoop;
                }
                case 502: {
                    if (-441 <= (he.field_d ^ -1)) {
                        statePc = 509;
                    } else {
                        statePc = 505;
                    }
                    continue stateLoop;
                }
                case 505: {
                    if (476 > he.field_d) {
                        statePc = 508;
                    } else {
                        statePc = 509;
                    }
                    continue stateLoop;
                }
                case 508: {
                    this.leaveTutorial(param0 ^ -1578897511);
                    this.tutorialStepId = 0;
                    this.tutorialMode = true;
                    this.tutorialPromptActive = true;
                    statePc = 509;
                    continue stateLoop;
                }
                case 509: {
                    if (mc.field_a <= 380) {
                        statePc = 522;
                    } else {
                        statePc = 510;
                    }
                    continue stateLoop;
                }
                case 510: {
                    if (540 <= mc.field_a) {
                        statePc = 522;
                    } else {
                        statePc = 513;
                    }
                    continue stateLoop;
                }
                case 513: {
                    if (he.field_d <= 440) {
                        statePc = 522;
                    } else {
                        statePc = 516;
                    }
                    continue stateLoop;
                }
                case 516: {
                    if ((he.field_d ^ -1) > -477) {
                        statePc = 519;
                    } else {
                        statePc = 522;
                    }
                    continue stateLoop;
                }
                case 519: {
                    this.tutorialPromptActive = false;
                    this.tutorialStepPhase = 1;
                    statePc = 522;
                    continue stateLoop;
                }
                case 522: {
                    return;
                }
                case 523: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
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
        int fieldTemp$0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_17_1 = 0;
        int stackIn_27_0 = 0;
        int stackIn_27_1 = 0;
        int statePc = 0;
        int precedingThemeId = 0;
        int themeIndexThenId = 0;
        int var4 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = Geoblox.field_C;
                    if (-1 == (this.sceneAnimationTick ^ -1)) {
                        statePc = 3;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 3: {
                    if (this.preserveScoreOnTransition) {
                        statePc = 7;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    this.resetScoreState(122);
                    if (var4 == 0) {
                        statePc = 9;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    this.prepareNextTheme(867);
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    this.sceneTransitionInProgress = true;
                    sf.a(sh.field_y.field_d, 0, oc.boardSceneRaster.pixels, 0, sh.field_y.field_d.length);
                    le.a((byte) -39);
                    bk.boardOwnershipRaster.e();
                    SoftwareRasterizer.c();
                    i.avatarMaskRaster.a(this.boardMaskOffsetX + 320, this.boardMaskOffsetY + 240, 16777215);
                    sh.field_y.a(255);
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    fieldTemp$0 = this.sceneAnimationTick + 1;
                    this.sceneAnimationTick = this.sceneAnimationTick + 1;
                    if (160 != fieldTemp$0) {
                        statePc = 91;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    if (!this.preserveScoreOnTransition) {
                        statePc = 87;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    precedingThemeId = 0;
                    themeIndexThenId = 0;
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    if (7 <= themeIndexThenId) {
                        statePc = 26;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    stackIn_27_0 = GameScreen.selectedThemeId ^ -1;
                    stackIn_17_0 = stackIn_27_0;
                    stackIn_27_1 = ee.field_B[themeIndexThenId] ^ -1;
                    stackIn_17_1 = stackIn_27_1;
                    if (var4 != 0) {
                        statePc = 27;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    if (stackIn_17_0 == stackIn_17_1) {
                        statePc = 20;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 20: {
                    if (0 >= themeIndexThenId) {
                        statePc = 22;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    precedingThemeId = ee.field_B[themeIndexThenId + -1];
                    if (var4 == 0) {
                        statePc = 26;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    precedingThemeId = ee.field_B[6];
                    if (var4 == 0) {
                        statePc = 26;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    themeIndexThenId++;
                    if (var4 == 0) {
                        statePc = 15;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    themeIndexThenId = precedingThemeId;
                    stackIn_27_0 = 4;
                    stackIn_27_1 = themeIndexThenId;
                    statePc = 27;
                    continue stateLoop;
                }
                case 27: {
                    if (stackIn_27_0 != stackIn_27_1) {
                        statePc = 31;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    if (var4 == 0) {
                        statePc = 64;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    if (-2 != (themeIndexThenId ^ -1)) {
                        statePc = 37;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    if (var4 == 0) {
                        statePc = 67;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    if (-4 != (themeIndexThenId ^ -1)) {
                        statePc = 43;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    if (var4 == 0) {
                        statePc = 70;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    if (-1 != (themeIndexThenId ^ -1)) {
                        statePc = 49;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    if (var4 == 0) {
                        statePc = 73;
                    } else {
                        statePc = 49;
                    }
                    continue stateLoop;
                }
                case 49: {
                    if (-7 == (themeIndexThenId ^ -1)) {
                        statePc = 76;
                    } else {
                        statePc = 52;
                    }
                    continue stateLoop;
                }
                case 52: {
                    if (5 != themeIndexThenId) {
                        statePc = 58;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 55: {
                    if (var4 == 0) {
                        statePc = 79;
                    } else {
                        statePc = 58;
                    }
                    continue stateLoop;
                }
                case 58: {
                    if (2 != themeIndexThenId) {
                        statePc = 85;
                    } else {
                        statePc = 61;
                    }
                    continue stateLoop;
                }
                case 61: {
                    if (var4 == 0) {
                        statePc = 82;
                    } else {
                        statePc = 64;
                    }
                    continue stateLoop;
                }
                case 64: {
                    ra.a(fa.field_f ^ 255, -61, fa.field_f);
                    if (var4 == 0) {
                        statePc = 87;
                    } else {
                        statePc = 67;
                    }
                    continue stateLoop;
                }
                case 67: {
                    ra.a(255 ^ hj.field_b, -84, hj.field_b);
                    if (var4 == 0) {
                        statePc = 87;
                    } else {
                        statePc = 70;
                    }
                    continue stateLoop;
                }
                case 70: {
                    ra.a(255 ^ ac.field_u, -50, ac.field_u);
                    if (var4 == 0) {
                        statePc = 87;
                    } else {
                        statePc = 73;
                    }
                    continue stateLoop;
                }
                case 73: {
                    ra.a(255 ^ kf.field_d, -71, kf.field_d);
                    if (var4 == 0) {
                        statePc = 87;
                    } else {
                        statePc = 76;
                    }
                    continue stateLoop;
                }
                case 76: {
                    ra.a(255 ^ vi.field_E, -115, vi.field_E);
                    if (var4 == 0) {
                        statePc = 87;
                    } else {
                        statePc = 79;
                    }
                    continue stateLoop;
                }
                case 79: {
                    ra.a(255 ^ jj.field_g, -92, jj.field_g);
                    if (var4 == 0) {
                        statePc = 87;
                    } else {
                        statePc = 82;
                    }
                    continue stateLoop;
                }
                case 82: {
                    ra.a(255 ^ jg.field_a, -121, jg.field_a);
                    if (var4 == 0) {
                        statePc = 87;
                    } else {
                        statePc = 85;
                    }
                    continue stateLoop;
                }
                case 85: {
                    ra.a(hj.field_b ^ 255, -95, hj.field_b);
                    statePc = 87;
                    continue stateLoop;
                }
                case 87: {
                    this.connectivityRebuiltThisTick = false;
                    this.boardRasterDirty = true;
                    this.sceneTransitionInProgress = false;
                    this.preserveScoreOnTransition = true;
                    this.sceneTransitionRequested = false;
                    this.sceneAnimationTick = 0;
                    if (-1 > (ji.difficultyStep ^ -1)) {
                        statePc = 90;
                    } else {
                        statePc = 91;
                    }
                    continue stateLoop;
                }
                case 90: {
                    qe.b(10);
                    ld.advanceDifficulty(false);
                    statePc = 91;
                    continue stateLoop;
                }
                case 91: {
                    if (param0 <= -76) {
                        statePc = 94;
                    } else {
                        statePc = 92;
                    }
                    continue stateLoop;
                }
                case 92: {
                    this.showSessionCounters = true;
                    statePc = 94;
                    continue stateLoop;
                }
                case 94: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
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
                        statePc = 5;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    this.pointsPanelSlideDirection = 0;
                    return;
                }
                case 5: {
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
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    stackIn_23_0 = 0;
                    stackIn_13_0 = stackIn_23_0;
                    if (var11 != 0) {
                        statePc = 23;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    spriteRow = stackIn_13_0;
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    if (vf.spriteScratchRaster.height <= spriteRow) {
                        statePc = 20;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    stackIn_11_0 = 0;
                    stackIn_16_0 = stackIn_11_0;
                    stackIn_11_1 = vf.spriteScratchRaster.pixels[vf.spriteScratchRaster.width * spriteRow + spriteColumn];
                    stackIn_16_1 = stackIn_11_1;
                    if (var11 != 0) {
                        statePc = 11;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    if (stackIn_16_0 == stackIn_16_1) {
                        statePc = 19;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
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
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    this.sessionPhase = 2;
                    if (var11 == 0) {
                        statePc = 39;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    if ((460 + -this.sceneAnimationTick + 460 ^ -1) <= (this.endingEntityRadius * 2 ^ -1)) {
                        statePc = 37;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    this.sessionPhase = 4;
                    if (var11 == 0) {
                        statePc = 39;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    this.sessionPhase = 3;
                    statePc = 39;
                    continue stateLoop;
                }
                case 39: {
                    if (3 != this.sessionPhase) {
                        statePc = 43;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    this.resultBonusPoints = this.resultBonusPoints + 7;
                    if (var11 == 0) {
                        statePc = 69;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    if (-3 == (this.sessionPhase ^ -1)) {
                        statePc = 52;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    if ((this.resultSequenceCountdown ^ -1) != -151) {
                        statePc = 51;
                    } else {
                        statePc = 49;
                    }
                    continue stateLoop;
                }
                case 49: {
                    td.a(-348, fl.field_c[28]);
                    statePc = 51;
                    continue stateLoop;
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
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 55: {
                    if (this.field_M.l()) {
                        statePc = 58;
                    } else {
                        statePc = 59;
                    }
                    continue stateLoop;
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
                    } else {
                        statePc = 60;
                    }
                    continue stateLoop;
                }
                case 60: {
                    this.resultPanelX = this.resultPanelX - 1;
                    if (var11 == 0) {
                        statePc = 69;
                    } else {
                        statePc = 63;
                    }
                    continue stateLoop;
                }
                case 63: {
                    this.sceneTransitionRequested = true;
                    this.sceneAnimationTick = 0;
                    this.sessionPhase = 5;
                    if (!this.boardEmptyAtResultStart) {
                        statePc = 68;
                    } else {
                        statePc = 66;
                    }
                    continue stateLoop;
                }
                case 66: {
                    ld.a(350, 320, 66, 2000);
                    ra.a(eb.field_i ^ 255, param0 + -101, eb.field_i);
                    this.connectivityRebuiltThisTick = false;
                    statePc = 68;
                    continue stateLoop;
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
                    } else {
                        statePc = 70;
                    }
                    continue stateLoop;
                }
                case 70: {
                    GameplaySession.i(-70);
                    statePc = 72;
                    continue stateLoop;
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
