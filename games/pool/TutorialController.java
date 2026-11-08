/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class TutorialController {
    static String field_m;
    static String findOpponentsPlural;
    TutorialStep currentStep;
    private TutorialStep previousStep;
    IntrusiveDeque field_d;
    static int field_i;
    int field_n;
    static String joinRequestsMany;
    private int field_k;
    static String sendQcToX;
    private String field_g;
    TutorialController field_j;
    private boolean field_b;
    PoolMatchController field_a;
    static int field_c;

    private final void renderPanel(int param0, int param1) {
        int var3 = PoolGameModel.field_k.localX;
        int var4 = PoolGameModel.field_k.localY;
        int var5 = SoftwareRasterizer.width - NetworkGameClient.field_s.field_z >> 1;
        PoolGameModel.field_k.localX = PoolGameModel.field_k.localX - var5;
        int var6 = -NetworkGameClient.field_s.field_A + SoftwareRasterizer.height;
        PoolGameModel.field_k.localY = PoolGameModel.field_k.localY - var6;
        NetworkGameClient.field_s.bindAsRenderTarget();
        SoftwareRasterizer.clear();
        this.drawStepProgress((byte) -109);
        PoolGameModel.field_k.drawRoot((byte) -79, false);
        this.currentStep.draw(false);
        PoolGameModel.field_k.localX = var3;
        PoolGameModel.field_k.localY = var4;
        OpacityWidget.field_P.bindAsRenderTarget(15100);
        SoftwareRasterizer.fillRectangleAlpha(5 + PoolGameModel.field_k.localX, 5 + PoolGameModel.field_k.localY, -10 + PoolGameModel.field_k.width, PoolGameModel.field_k.height - param0, 0, 128 * param1 >> 8);
        NetworkGameClient.field_s.drawWithVerticalAlphaGradient(var5, var6, param1, param1);
    }

    final static void sortParallelArrays(int param0, int[] param1, int[] param2, int param3, byte param4) {
        int var10 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var11 = 0;
        int var12 = 0;
        try {
          if (param4 != 80) {
            joinRequestsMany = (String) null;
          }
          if (param3 > param0) {
            var5_int = (param0 + param3) / 2;
            var6 = param0;
            var7 = param1[var5_int];
            param1[var5_int] = param1[param3];
            param1[param3] = var7;
            var8 = param2[var5_int];
            param2[var5_int] = param2[param3];
            param2[param3] = var8;
            stackIn_6_0 = (var7 == 2147483647) ? 0 : 1;
            var9 = stackIn_6_0;
            for (var10 = param0; var10 < param3; var10++) {
              if (param1[var10] > -(var9 & var10) + var7) {
                var11 = param1[var10];
                param1[var10] = param1[var6];
                param1[var6] = var11;
                var12 = param2[var10];
                param2[var10] = param2[var6];
                param2[var6++] = var12;
              }
            }
            param1[param3] = param1[var6];
            param1[var6] = var7;
            param2[param3] = param2[var6];
            param2[var6] = var8;
            TutorialController.sortParallelArrays(param0, param1, param2, -1 + var6, (byte) 80);
            TutorialController.sortParallelArrays(1 + var6, param1, param2, param3, (byte) 80);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_16_0 = var5;
          stackIn_16_1 = new StringBuilder().append("hq.L(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (param2 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final boolean handleButtonPress(int param0) {
        int var2 = -86 % ((40 - param0) / 46);
        int var3 = 0;
        if (HotspotRectangle.field_v.pressedButton != 0) {
          this.togglePanel((byte) -105);
          var3 = 1;
        } else {
          if (!this.field_b) {
            return false;
          }
        }
        if (0 != QuickChatNavigationSupport.field_d.pressedButton) {
          this.setUpStepState((byte) 89);
          this.goToPreviousStep(255);
          var3 = 1;
        }
        if (0 != VertexProjectionSupport.field_b.pressedButton) {
          var3 = 1;
          this.goToNextStep((byte) -87);
        }
        if (PoolGameModel.field_k.pressedButton != 0) {
          var3 = 1;
        }
        return var3 != 0;
    }

    final void updateStepCount(boolean param0) {
        this.field_k = this.field_d.size(116);
        if (param0) {
          this.field_b = false;
        }
    }

    final void update(int param0) {
        int var2;
        int var3;
        if (param0 != 25) {
          findOpponentsPlural = (String) null;
        }
        if (this.field_b) {
          PoolGameModel.field_k.updateRoot(true, false);
        }
        if (!HotspotRectangle.field_v.b(param0 - 142)) {
          HotspotRectangle.field_v.updateRoot(true, false);
        }
        if (ThreeSliceButtonPainter.field_s >= 0) {
          var2 = this.previousStep.getHeight((byte) -111);
          var3 = this.currentStep.getHeight((byte) -122);
          PoolGameModel.field_k.height = (var2 * (25 - ThreeSliceButtonPainter.field_s) + ThreeSliceButtonPainter.field_s * var3) / 25;
          PoolGameModel.field_k.localY = -PoolGameModel.field_k.height + SoftwareRasterizer.height - 5;
          this.layoutButtons(1);
          ThreeSliceButtonPainter.field_s = ThreeSliceButtonPainter.field_s + 1;
          if (ThreeSliceButtonPainter.field_s > 25) {
            ThreeSliceButtonPainter.field_s = -1;
          }
        }
        if (TextPairLoginPayload.field_i >= 0) {
          TextPairLoginPayload.field_i = TextPairLoginPayload.field_i + 1;
          if (25 < TextPairLoginPayload.field_i) {
            TextPairLoginPayload.field_i = -1;
            if (this.field_b) {
              this.layoutButtons(1);
            }
          }
        }
        if (!(HighScoreSubmission.field_q < 0) ||
          TranslatedUiText.field_e) {
          HighScoreSubmission.field_q = HighScoreSubmission.field_q + 1;
          LogoMaterial.field_c = SceneNodeFactory.cosine(2047, HighScoreSubmission.field_q * 2048 / 25) + 163840 >> 10;
          if (HighScoreSubmission.field_q >= 25) {
            if (TranslatedUiText.field_e) {
              TranslatedUiText.field_e = false;
              HighScoreSubmission.field_q = 0;
            } else {
              HighScoreSubmission.field_q = -1;
              LogoMaterial.field_c = 256;
            }
          }
        }
    }

    final void draw(int param0) {
        int var9 = 0;
        int var10 = 0;
        Sprite stackIn_21_0 = null;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var11;
        if (param0 <= 24) {
          return;
        }
        if (!this.field_b) {
          if (0 <= TextPairLoginPayload.field_i) {
            this.renderPanel(10, (-TextPairLoginPayload.field_i + 25) * 255 / 25);
          }
          if (!HotspotRectangle.field_v.b(-119)) {
            HotspotRectangle.field_v.drawRoot((byte) -79, false);
          }
        } else {
          if (ThreeSliceButtonPainter.field_s >= 0) {
            SoftwareRasterizer.fillRectangleAlpha(PoolGameModel.field_k.localX + 5, 5 + PoolGameModel.field_k.localY, PoolGameModel.field_k.width - 10, -10 + PoolGameModel.field_k.height, 0, 128);
            this.drawStepProgress((byte) -109);
            var2 = PoolGameModel.field_k.localX;
            PoolGameModel.field_k.localX = PoolGameModel.field_k.localX - 160;
            var3 = PoolGameModel.field_k.localY;
            PoolGameModel.field_k.localY = PoolGameModel.field_k.localY - 240;
            NetworkGameClient.field_s.bindAsRenderTarget();
            SoftwareRasterizer.clear();
            this.previousStep.draw(false);
            NanoTickClock.field_r.bindAsRenderTarget();
            SoftwareRasterizer.clear();
            this.drawStepProgress((byte) -109);
            this.currentStep.draw(false);
            var4 = -5 + (-HotspotRectangle.field_v.height + (PoolGameModel.field_k.height + PoolGameModel.field_k.localY));
            var5 = PoolGameModel.field_k.localY;
            var6 = PoolGameModel.field_k.localX + 5;
            var7 = PoolGameModel.field_k.width + PoolGameModel.field_k.localX - 10;
            PoolGameModel.field_k.localX = var2;
            PoolGameModel.field_k.localY = var3;
            OpacityWidget.field_P.bindAsRenderTarget(15100);
            PoolGameModel.field_k.drawRoot((byte) -79, false);
            HotspotRectangle.field_v.drawRoot((byte) -79, false);
            if (SoftwareRasterizer.clipLeft > var6) {
              var6 = SoftwareRasterizer.clipLeft;
            }
            if (SoftwareRasterizer.clipBottom < var4) {
              var4 = SoftwareRasterizer.clipBottom;
            }
            if (var7 > SoftwareRasterizer.clipRight) {
              var7 = SoftwareRasterizer.clipRight;
            }
            if (var5 < SoftwareRasterizer.clipTop) {
              var5 = SoftwareRasterizer.clipTop;
            }
            var8 = -var6 + (var7 + (var4 - var5));
            for (var9 = var5; var4 > var9; var9++) {
              for (var10 = var6; var7 > var10; var10++) {
                if (ThreeSliceButtonPainter.field_s + MaxLengthTextInputWidget.nextRandomInt(5, true, RankingsRequest.field_r) - 3 >= 25 * (-var6 + (var10 - var5) + var9) / var8) {
                  stackIn_21_0 = NanoTickClock.field_r;
                } else {
                  stackIn_21_0 = NetworkGameClient.field_s;
                }
                var11 = stackIn_21_0.field_D[NetworkGameClient.field_s.field_z * var9 + var10];
                if (var11 != 0) {
                  SoftwareRasterizer.setPixel(var10 + 160, 240 + var9, var11);
                }
              }
            }
          } else {
            if (TextPairLoginPayload.field_i < 0) {
              SoftwareRasterizer.fillRectangleAlpha(5 + PoolGameModel.field_k.localX, PoolGameModel.field_k.localY + 5, -10 + PoolGameModel.field_k.width, PoolGameModel.field_k.height - 10, 0, 128);
              this.drawStepProgress((byte) -109);
              PoolGameModel.field_k.drawRoot((byte) -79, false);
              HotspotRectangle.field_v.drawRoot((byte) -79, false);
              this.currentStep.draw(false);
            } else {
              this.renderPanel(10, 255 * TextPairLoginPayload.field_i / 25);
              HotspotRectangle.field_v.drawRoot((byte) -79, false);
            }
          }
        }
    }

    private final void togglePanel(byte obfuscationGuard) {
        int var2 = 52 % ((7 - obfuscationGuard) / 41);
        if (this.field_b) {
          this.collapsePanel(-128);
        } else {
          this.expandPanel(-84);
        }
    }

    private final void goToPreviousStep(int param0) {
        if (param0 != 255) {
          this.field_d = (IntrusiveDeque) null;
        }
        if (this.field_d.field_e != this.currentStep.previous) {
          if (this.currentStep != null &&
            this.field_d.field_e != this.currentStep) {
            ThreeSliceButtonPainter.field_s = 0;
            this.previousStep = this.currentStep;
          }
          this.setCurrentStep((TutorialStep) (this.currentStep.previous), param0 ^ 254);
          this.expandPanel(-120);
        } else {
          if (null != this.field_j) {
            this.field_j.previousStep = this.currentStep;
            this.field_a.attachTutorial(104, this.field_a.gameModel.field_h, this.field_j);
          }
        }
    }

    final static MeshBuilder createEmptyMesh(byte obfuscationGuard) {
        MeshBuilder var1 = new MeshBuilder(0, 0, 0);
        if (obfuscationGuard < 120) {
          field_i = 107;
        }
        var1.releaseNormals();
        return var1;
    }

    final static boolean containsForwardOrReversed(String param0, String param1, int param2) {
        String var3 = null;
        boolean stackIn_14_0 = false;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          if (param2 != 17924) {
            TutorialController.drawClientNotice(36);
          }
          var3 = HotspotRectangle.reverseString(param1, 0);
          if (param0.indexOf(param1) == -1 &&
            param0.indexOf(var3) == -1) {
            stackIn_14_0 = (param0.startsWith(param1)) || (param0.startsWith(var3)) || (param0.endsWith(param1)) || (param0.endsWith(var3));
            return stackIn_14_0;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_17_0 = var3_ref;
          stackIn_17_1 = new StringBuilder().append("hq.AA(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param2).append(')').toString());
        }
    }

    private final void setUpStepState(byte param0) {
        boolean stackIn_27_0 = false;
        Ball[] var2;
        int var3;
        int var4_int;
        ShotRecord var4;
        Object var5;
        int var5_int;
        int var6;
        int var8;
        Ball var8_ref_pq;
        int var10;
        String var12;
        Ball[] var13;
        int var14;
        ShotRecord var15;
        Pocket var16;
        Ball var17;
        Pocket var18;
        var10 = Pool.field_O;
        if (param0 < 85) {
          return;
        }
        var4_int = this.currentStep.field_s;
        if (var4_int != 512) {
          if (var4_int == 2048) {
            var12 = (String) null;
            ProgressBarWidget.replaceNotification(true, 0, CueAim.pottingTheRestOfYourGroup, (String) null);
            var13 = this.field_a.gameModel.balls;
            var2 = var13;
            var3 = this.field_a.gameModel.rules.initialGroup(-1);
            if (0 == var3 ||
              var3 == 1) {
              var4 = this.field_a.gameModel.currentShot(105);
              var5 = null;
              var14 = 0;
              var6 = var14;
              while (var13.length > var14) {
                var17 = var13[var14];
                if (var17.inPlay &&
                  var3 == this.field_a.gameModel.rules.ballGroup(var14, 30554)) {
                  var8 = this.field_a.gameModel.nearestPocketIndex(17897, var14);
                  var18 = this.field_a.gameModel.pockets[var8];
                  var17.positionX = var18.centerX;
                  var17.inPlay = false;
                  var17.positionY = var18.centerY;
                  var17.transformDirty = true;
                  var18.addBall(var14, -106);
                  if (var5 == null) {
                    var5 = new IntrusiveDeque();
                  }
                  ((IntrusiveDeque) (var5)).addFirst((byte) -43, new PotEvent(var14, var8));
                }
                var14++;
              }
              if (var5 != null) {
                this.field_a.gameModel.stopAllBalls(-54);
                var4.endResolution = MarkerSliderPainter.field_j;
                var4.field_n = ((PotEvent) (((IntrusiveDeque) (var5)).last((byte) -64))).ballIndex;
                var4.pottedBalls = (IntrusiveDeque) (var5);
                var4.phase = 2;
                stackIn_27_0 = this.field_a.gameModel.beginNextShot((byte) 117);
                this.field_a.beginTurn((byte) -62);
              }
            }
          }
        } else {
          if (this.field_a.gameModel.rules.initialGroup(-1) == -1) {
            var4_int = MaxLengthTextInputWidget.nextRandomInt(2, true, RankingsRequest.field_r);
            var5_int = MaxLengthTextInputWidget.nextRandomInt(7, true, RankingsRequest.field_r) - (-(var4_int << 3) - 1);
            var6 = MaxLengthTextInputWidget.nextRandomInt(this.field_a.gameModel.pockets.length, true, RankingsRequest.field_r);
            var16 = this.field_a.gameModel.pockets[var6];
            var18 = var16;
            var18 = var16;
            var8_ref_pq = this.field_a.gameModel.balls[var5_int];
            var15 = this.field_a.gameModel.currentShot(75);
            ProgressBarWidget.replaceNotification(true, 0, AccountWelcomePanel.substituteTemplateArguments(new String[]{TransformRotationSupport.field_a.groupName((byte) 92, var4_int)}, -1, ModelTableScene.pottingBallForYou), (String) null);
            this.field_a.gameModel.stopAllBalls(-95);
            this.field_a.gameModel.rules.assignGroups(var4_int, -1, 0);
            var15.endResolution = AchievementSubmission.field_m | MarkerSliderPainter.field_j;
            var15.phase = 2;
            var15.pottedBalls = new IntrusiveDeque();
            var15.pottedBalls.addFirst((byte) 105, new PotEvent(var5_int, var6));
            var15.field_n = var5_int;
            this.field_a.gameModel.beginNextShot((byte) 53);
            this.field_a.beginTurn((byte) -36);
            var16.addBall(var5_int, 69);
            var8_ref_pq.inPlay = false;
            var8_ref_pq.positionY = var16.centerY;
            var8_ref_pq.positionX = var16.centerX;
          }
        }
    }

    final void checkStepAfterShot(boolean param0, ShotRecord param1) {
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_49_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        Object var5 = null;
        PotEvent var5_ref = null;
        String var6 = null;
        EightBallRules var7 = null;
        IntrusiveDeque var8 = null;
        IntrusiveDequeCursor var9 = null;
        IntrusiveDeque var10 = null;
        IntrusiveDequeCursor var11 = null;
        PotEvent var5_refLifetime1;
        var5 = null;
        try {
          if (this.currentStep.field_s == 256) {
            if (param1.breakSeed >= 0 &&
              2 < Ball.field_i.countEvents((byte) 2)) {
              this.onStepEvent(1, 8, -28186);
            } else {
              this.field_a.rerackBalls(0);
              var6 = (String) null;
              ProgressBarWidget.replaceNotification(true, 0, BallDebugOverlay.tutorialBreakTryAgain, (String) null);
            }
          }
          if (this.currentStep.field_s == 512 &&
            0 != (param1.endResolution & AchievementSubmission.field_m)) {
            this.onStepEvent(1, 9, -28186);
          }
          if (2048 == this.currentStep.field_s &&
            this.field_a.gameModel.rules instanceof EightBallRules) {
            var7 = (EightBallRules) (this.field_a.gameModel.rules);
            var4 = var7.groupOfPlayer(22533, 0);
            if (var4 == 0 ||
              var4 == 1) {
              this.currentStep.field_u = var7.pottedBallCount(var4, 125);
              if (this.currentStep.field_u >= 7) {
                this.goToPreviousStep(255);
              }
            }
          }
          if (this.currentStep.field_s == 4096 &&
            param1.hasPotted((byte) -122, 8)) {
            this.onStepEvent(1, 12, -28186);
          }
          if (param0) {
            return;
          }
          if (this.currentStep.field_s == 32768) {
            var8 = param1.pottedBalls;
            if (var8 != null) {
              var9 = new IntrusiveDequeCursor(var8);
              var5_ref = (PotEvent) (var9.last((byte) -92));
              while (var5_ref != null) {
                if (0 != var5_ref.ballIndex) {
                  this.onStepEvent(1, 15, -28186);
                }
                if (var5_ref.ballIndex == 9) {
                  this.onStepEvent(1, 16, -28186);
                  break;
                }
                var5_ref = (PotEvent) (var9.previous(-121));
              }
            }
          }
          if (this.currentStep.field_s == 65536) {
            var10 = param1.pottedBalls;
            if (var10 != null) {
              var11 = new IntrusiveDequeCursor(var10);
              var5_refLifetime1 = (PotEvent) (var11.last((byte) -92));
              while (var5_refLifetime1 != null) {
                if (9 == var5_refLifetime1.ballIndex) {
                  this.onStepEvent(1, 16, -28186);
                  break;
                }
                var5_refLifetime1 = (PotEvent) (var11.previous(-114));
              }
            }
          }
          if (this.currentStep.field_s == 16384 &&
            param1.groupBefore == this.field_a.gameModel.rules.ballGroup(param1.field_n, 30554)) {
            this.onStepEvent(1, 14, -28186);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_48_0 = var3;
          stackIn_48_1 = new StringBuilder().append("hq.W(").append(param0).append(',');
          if (param1 == null) {
            stackIn_49_2 = "null";
          } else {
            stackIn_49_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_48_0), ((StringBuilder) (Object) stackIn_48_1).append(stackIn_49_2).append(')').toString());
        }
    }

    private final void drawStepProgress(byte param0) {
        int var13 = 0;
        int var17 = 0;
        int[] stackIn_18_0 = null;
        int stackIn_19_1 = 0;
        int var3;
        int var4;
        int var5;
        int var6;
        TutorialStep var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var14;
        int var15;
        int var16;
        int var18;
        int var19;
        int var20;
        int var21;
        int var22;
        IntrusiveDequeCursor var23;
        int var20Lifetime1;
        int var21Lifetime1;
        int var22Lifetime1;
        int var20Lifetime2;
        var23 = new IntrusiveDequeCursor(this.field_d);
        var3 = 0;
        var4 = PoolGameModel.field_k.localX + VertexTransformSupport.field_b.field_G;
        var5 = PoolGameModel.field_k.height + (PoolGameModel.field_k.localY + (-PoolGameModel.field_k.frameSprites[7].field_A - PoolGameModel.field_k.frameSprites[4].field_A) + (-PoolGameModel.field_k.frameSprites[1].field_A + VertexTransformSupport.field_b.field_B));
        var6 = var5 + VertexTransformSupport.field_b.field_A;
        var7 = (TutorialStep) (var23.last((byte) -92));
        while (this.field_d.field_e != var7.previous) {
          var8 = (var3 + 1) * (-VertexTransformSupport.field_b.field_G + VertexTransformSupport.field_b.field_w) / (this.field_k - 1) + VertexTransformSupport.field_b.field_G + PoolGameModel.field_k.localX;
          var9 = var4;
          if (var9 < SoftwareRasterizer.clipLeft) {
            var9 = SoftwareRasterizer.clipLeft;
          }
          var10 = var8;
          if (SoftwareRasterizer.clipRight < var10) {
            var10 = SoftwareRasterizer.clipRight;
          }
          var11 = var5;
          if (SoftwareRasterizer.clipTop > var11) {
            var11 = SoftwareRasterizer.clipTop;
          }
          var12 = var6;
          if (var12 > SoftwareRasterizer.clipBottom) {
            var12 = SoftwareRasterizer.clipBottom;
          }
          for (var13 = var11; var13 < var12; var13++) {
            var14 = var13 - var5;
            stackIn_18_0 = VertexTransformSupport.field_b.field_D;
            if (this.currentStep != var7) {
              stackIn_19_1 = 0;
            } else {
              stackIn_19_1 = 1;
            }
            var15 = stackIn_18_0[stackIn_19_1 + VertexTransformSupport.field_b.field_z * (var13 - var5)];
            var16 = VertexTransformSupport.field_b.field_D[VertexTransformSupport.field_b.field_z * (var13 - var5) + 2];
            for (var17 = var9; var17 < var10; var17++) {
              if (var9 == var17) {
                var21 = var15 >> 8 & 255;
                var20 = 255 & var15 >> 16;
                var20 = 255 & var20 + (255 - var20 >> 2);
                var21 = 255 & var21 + (-var21 + 255 >> 2);
                var22 = 255 & var15;
                var22 = var22 + (-var22 + 255 >> 2) & 255;
                var18 = var21 << 8 | var20 << 16 | var22;
                var21Lifetime1 = (var16 & 65303) >> 8;
                var20Lifetime2 = var16 >> 16 & 255;
                var22Lifetime1 = var16 & 255;
                var20Lifetime2 = (-var20Lifetime2 + 255 >> 2) + var20Lifetime2 & 255;
                var22Lifetime1 = (-var22Lifetime1 + 255 >> 2) + var22Lifetime1 & 255;
                var21Lifetime1 = (-var21Lifetime1 + 255 >> 2) + var21Lifetime1 & 255;
                var19 = var22Lifetime1 | (var21Lifetime1 << 8 | var20Lifetime2 << 16);
              } else {
                if (-1 + var10 != var17) {
                  var18 = var15;
                  var19 = var16;
                } else {
                  var18 = var15 >> 1 & 8355711;
                  var19 = 8355711 & var16 >> 1;
                }
              }
              var20Lifetime1 = var17 - var4;
              if (var14 + var20Lifetime1 >= var7.field_u * (-var4 + (var8 + VertexTransformSupport.field_b.field_A)) / var7.field_l) {
                SoftwareRasterizer.pixels[SoftwareRasterizer.width * var13 + var17] = var18;
              } else {
                if (this.currentStep == var7) {
                  SoftwareRasterizer.pixels[SoftwareRasterizer.width * var13 + var17] = RenderingInitializationSupport.bitwiseOr(RenderingInitializationSupport.bitwiseOr(ArchiveLoadSequence.bitwiseAnd(16711898, (-LogoMaterial.field_c + 256) * (ArchiveLoadSequence.bitwiseAnd(16744119, var18) >> 16) + (ArchiveLoadSequence.bitwiseAnd(var19, 16714394) >> 16) * LogoMaterial.field_c << 8), ArchiveLoadSequence.bitwiseAnd((256 - LogoMaterial.field_c) * ArchiveLoadSequence.bitwiseAnd(var18 >> 8, 255) + (ArchiveLoadSequence.bitwiseAnd(65295, var19) >> 8) * LogoMaterial.field_c, 65280)), ArchiveLoadSequence.bitwiseAnd(LogoMaterial.field_c * ArchiveLoadSequence.bitwiseAnd(var19, 255) + (256 - LogoMaterial.field_c) * ArchiveLoadSequence.bitwiseAnd(var18, 255) >> 8, 255));
                } else {
                  if (var7.field_u > var7.field_l) {
                    SoftwareRasterizer.pixels[var17 + SoftwareRasterizer.width * var13] = var18;
                  } else {
                    SoftwareRasterizer.pixels[var17 + SoftwareRasterizer.width * var13] = var19;
                  }
                }
              }
            }
          }
          var3++;
          var4 = var8;
          var7 = (TutorialStep) (var23.previous(param0 ^ 61));
        }
        if (param0 != -109) {
          this.collapsePanel(-29);
        }
    }

    private final void collapsePanel(int obfuscationGuard) {
        if (!this.field_b) {
        } else {
          HotspotRectangle.field_v.capturedSprite = PolarObject.field_d[13];
          this.field_b = false;
          HotspotRectangle.field_v.disabledSprite = PolarObject.field_d[1];
          HotspotRectangle.field_v.activeSprite = PolarObject.field_d[9];
          HotspotRectangle.field_v.sprite = PolarObject.field_d[5];
          if (TextPairLoginPayload.field_i == -1) {
            TextPairLoginPayload.field_i = 0;
          } else {
            TextPairLoginPayload.field_i = 25 - TextPairLoginPayload.field_i;
          }
        }
        if (obfuscationGuard > -121) {
          this.renderPanel(113, -115);
        }
    }

    final static int daysInMonth(int month, int year, int februaryIndex) {
        if (februaryIndex == month &&
          FixedAngleSupport.isLeapYear(year, (byte) 43)) {
          return 29;
        }
        return TickClock.field_d[month];
    }

    final void restart(int param0) {
        IntrusiveDequeCursor var4 = new IntrusiveDequeCursor(this.field_d);
        TutorialStep var3 = (TutorialStep) (var4.last((byte) -92));
        while (var3 != null) {
          var3.field_u = 0;
          var3 = (TutorialStep) (var4.previous(param0 - 98));
        }
        this.setCurrentStep((TutorialStep) (this.field_d.last((byte) 109)), 1);
        this.expandPanel(-94);
        PoolGameModel.field_k.height = null == this.currentStep ? 10 : this.currentStep.getHeight((byte) -112);
        PoolGameModel.field_k.localY = -5 - PoolGameModel.field_k.height + SoftwareRasterizer.height;
        this.layoutButtons(1);
        this.field_a.rerackBalls(0);
        if (param0 != -1) {
          this.goToPreviousStep(127);
        }
        this.field_a.gameModel.setGameType(this.field_n, (byte) -118);
        this.field_a.cueAim.azimuth = 0;
        this.field_a.snapCameraToPreset(-24070);
        ProgressBarWidget.replaceNotification(true, 0, this.field_g, LoginTextValue.pressEscapeForOptionsMenu);
    }

    final static void drawClientNotice(int obfuscationGuard) {
        if (obfuscationGuard != -29322) {
          field_c = -7;
        }
        int var1 = QuickChatCategoryCache.clientNoticeWidth((byte) -62);
        int var2 = CheckboxPainter.clientNoticeHeight(23467);
        Pool.field_I.draw(var1 + (TutorialStep.field_v << 1), -WhirlpoolHasher.field_b + PasswordValidator.field_n, -6316, -TutorialStep.field_v + PlasmaTableScene.field_Z, (WhirlpoolHasher.field_b << 1) + var2);
        ChoiceButtonSupport.drawClientNotice(obfuscationGuard ^ 29411);
    }

    final static String joinText(int param0, byte param1, CharSequence[] param2, int param3) {
        int var7_int = 0;
        int var8 = 0;
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        String stackIn_3_0 = null;
        String stackIn_8_0 = null;
        String stackIn_10_0 = null;
        String stackIn_24_0 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        CharSequence var4 = null;
        int var4_int = 0;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        StringBuilder var7 = null;
        CharSequence var8_ref_CharSequence = null;
        CharSequence var9 = null;
        int var10 = 0;
        CharSequence var11 = null;
        var10 = Pool.field_O;
        try {
          if (param3 == 0) {
            stackIn_3_0 = "";
            return stackIn_3_0;
          }
          if (param3 == 1) {
            var11 = param2[param0];
            var4 = var11;
            if (var4 != null) {
              stackIn_10_0 = var11.toString();
              return stackIn_10_0;
            }
            stackIn_8_0 = "null";
            return stackIn_8_0;
          }
          var5 = -47 % ((-50 - param1) / 56);
          var4_int = param0 + param3;
          var6 = 0;
          for (var7_int = param0; var4_int > var7_int; var7_int++) {
            var8_ref_CharSequence = param2[var7_int];
            if (var8_ref_CharSequence != null) {
              var6 = var6 + var8_ref_CharSequence.length();
            } else {
              var6 += 4;
            }
          }
          var7 = new StringBuilder(var6);
          for (var8 = param0; var4_int > var8; var8++) {
            var9 = param2[var8];
            if (var9 == null) {
              discarded$0 = var7.append("null");
            } else {
              discarded$1 = var7.append(var9);
            }
          }
          stackIn_24_0 = var7.toString();
          return stackIn_24_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_27_0 = var4_ref;
          stackIn_27_1 = new StringBuilder().append("hq.Q(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param3).append(')').toString());
        }
    }

    final static String normalizeDisplayName(int param0, CharSequence param1) {
        int var6 = 0;
        StringBuilder discarded$0 = null;
        Object stackIn_2_0 = null;
        Object stackIn_17_0 = null;
        Object stackIn_29_0 = null;
        String stackIn_31_0 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        StringBuilder var5 = null;
        int var7 = 0;
        int var8 = 0;
        CharSequence var9 = null;
        try {
          if (param1 == null) {
            stackIn_2_0 = null;
            return (String) (stackIn_2_0);
          }
          var2_int = 0;
          var3 = param1.length();
          while (var3 > var2_int) {
            if (Js5ArchiveManager.a(0, param1.charAt(var2_int))) {
              var2_int++;
              continue;
            }
            break;
          }
          while (var3 > var2_int) {
            if (Js5ArchiveManager.a(0, param1.charAt(var3 - 1))) {
              var3--;
              continue;
            }
            break;
          }
          if (param0 < 59) {
            var9 = (CharSequence) null;
            TutorialController.normalizeDisplayName(53, (CharSequence) null);
          }
          var4 = -var2_int + var3;
          if (1 > var4) {
            return null;
          }
          if (var4 > 12) {
            stackIn_17_0 = null;
            return (String) (stackIn_17_0);
          }
          var5 = new StringBuilder(var4);
          for (var6 = var2_int; var6 < var3; var6++) {
            var7 = param1.charAt(var6);
            if (HalloweenBallSkin.isAllowedNameCharacter((char) var7, (byte) 125)) {
              var8 = IntKeyLookup.stripAccent(true, (char) var7);
              if (var8 != 0) {
                discarded$0 = var5.append((char) var8);
              }
            }
          }
          if (var5.length() != 0) {
            stackIn_31_0 = var5.toString();
            return stackIn_31_0;
          }
          stackIn_29_0 = null;
          return (String) (stackIn_29_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_34_0 = var2;
          stackIn_34_1 = new StringBuilder().append("hq.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_34_0), ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(')').toString());
        }
    }

    final void onStepEvent(int param0, int param1, int param2) {
        if (param2 != -28186) {
          this.layoutButtons(20);
        }
        if (1 << param1 == this.currentStep.field_s) {
          if (!this.currentStep.advanceProgress(param0, (byte) 127)) {
            TranslatedUiText.field_e = true;
            this.expandPanel(20);
          } else {
            this.goToPreviousStep(param2 ^ -28391);
            TranslatedUiText.field_e = false;
          }
        }
    }

    private final void layoutButtons(int param0) {
        int var2 = 0;
        VertexProjectionSupport.field_b.localY = -3 + PoolGameModel.field_k.height - VertexProjectionSupport.field_b.height;
        VertexProjectionSupport.field_b.localX = 277;
        if (param0 != 1) {
          return;
        }
        HotspotRectangle.field_v.localX = 297 + PoolGameModel.field_k.localX;
        HotspotRectangle.field_v.localY = -HotspotRectangle.field_v.height + PoolGameModel.field_k.localY - (-PoolGameModel.field_k.height + 3);
        QuickChatNavigationSupport.field_d.localY = -3 + (PoolGameModel.field_k.height - QuickChatNavigationSupport.field_d.height);
        QuickChatNavigationSupport.field_d.localX = 317;
        for (var2 = 0; var2 < this.field_k; var2++) {
        }
    }

    final void expandPanel(int obfuscationGuard) {
        if (!this.field_b) {
          this.field_b = true;
          if (null != this.currentStep) {
            this.currentStep.attachToTutorial(this, 74);
          }
          HotspotRectangle.field_v.capturedSprite = PolarObject.field_d[14];
          HotspotRectangle.field_v.sprite = PolarObject.field_d[6];
          if (TextPairLoginPayload.field_i == -1) {
            TextPairLoginPayload.field_i = 0;
          } else {
            TextPairLoginPayload.field_i = 25 - TextPairLoginPayload.field_i;
          }
          HotspotRectangle.field_v.activeSprite = PolarObject.field_d[10];
          HotspotRectangle.field_v.disabledSprite = PolarObject.field_d[2];
        }
        int var2 = -81 % ((-32 - obfuscationGuard) / 38);
    }

    private final void setCurrentStep(TutorialStep param0, int param1) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param1 != 1) {
            return;
          }
          this.currentStep = param0;
          if (this.currentStep != null) {
            this.currentStep.attachToTutorial(this, 94);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("hq.V(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void goToNextStep(byte param0) {
        if (param0 != -87) {
          this.field_g = (String) null;
        }
        if (this.currentStep.next != this.field_d.field_e) {
          if (this.currentStep != null &&
            this.currentStep != this.field_d.field_e) {
            this.previousStep = this.currentStep;
            ThreeSliceButtonPainter.field_s = 0;
          }
          this.setCurrentStep((TutorialStep) (this.currentStep.next), 1);
          this.expandPanel(-109);
        }
    }

    TutorialController(String param0, int param1, int param2) {
        try {
          this.field_g = param0;
          this.field_d = new IntrusiveDeque();
          this.field_n = param2;
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "hq.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void releaseStatics(int param0) {
        joinRequestsMany = null;
        findOpponentsPlural = null;
        sendQcToX = null;
        field_m = null;
        if (param0 != 5) {
          TutorialController.createEmptyMesh((byte) 8);
        }
    }

    static {
        findOpponentsPlural = "Find opponents";
        sendQcToX = "Send private Quick Chat to <%0>";
        joinRequestsMany = "(<%0> players want to join)";
        field_c = 2;
    }
}
