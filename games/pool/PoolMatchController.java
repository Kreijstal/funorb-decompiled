/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class PoolMatchController {
    private int strikeAnimationFrame;
    private int powerPulseTick;
    private CueAim lastSentCueAim;
    private CueAim[] playerCueAims;
    boolean unrated;
    private TutorialController tutorial;
    static int field_X;
    private boolean ballManhandled;
    static String mouseYAxisNormal;
    private boolean debugPaused;
    private int[] playerNameWidths;
    int modeFlags;
    private int shotCameraStrategy;
    private int dragLastMouseX;
    private int lastHoverMouseX;
    private int placementSyncTicks;
    int localPlayerIndex;
    private String[] playerNameCache;
    private int dragLastMouseY;
    static int field_z;
    private int draggedBallIndex;
    private int cuePower;
    private boolean shotModeActive;
    private int cueSyncTicks;
    PoolGameModel gameModel;
    static String tickerHintLeaveShotMode;
    private boolean shotConfirmedByServer;
    int introDelayTicks;
    private int shotModeFade;
    private int hoveredBallIndex;
    Camera camera;
    static String createAgeTooltip;
    private int lastHoverMouseY;
    static int field_hb;
    private int mouseDragMode;
    static int field_jb;
    int cuePullbackDistance;
    CueAim cueAim;
    private static int field_fb;
    private boolean cheatsUnlocked;
    private boolean mouseButtonHeld;
    private int keyRotationRamp;
    private int keyPowerRamp;
    static int field_W;
    static wc field_gb;
    private boolean cheatMode;
    private CueAim remoteCueTarget;
    static byte[][] field_y;
    private Camera cameraGoal;
    private int[] rackBallIndices;
    private int rackHeight;
    private int clockTicks;
    private int idleOrbitDistance;
    private int rackBallCount;
    private int rackWidth;
    int field_cb;
    int[] viewMatrix;
    private int rackTop;
    private int idleOrbitStep;
    private boolean viewMatrixDirty;
    private int cameraPresetIndex;
    private int field_v;
    private int rackBottom;

    private final void layoutBallRack(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          this.rackBallIndices = new int[this.gameModel.balls.length];
          this.rackHeight = 16 * (-1 + this.gameModel.balls.length);
          if (param0 != 4476) {
            this.tutorial = (TutorialController) null;
          }
          this.rackBottom = this.rackHeight + SoftwareRasterizer.height >> 1;
          this.rackWidth = MouseWheelInput.field_a[3].field_z + 18 + MouseWheelInput.field_a[5].field_z;
          this.rackTop = SoftwareRasterizer.height - this.rackHeight >> 1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var2), "uf.WD(" + param0 + ')');
        }
    }

    private final String formatPlayerGroupMessage(String param0, String param1, String param2, String param3, byte param4, int param5, String param6, String param7) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        int stackIn_7_0 = 0;
        Object stackIn_28_0 = null;
        String stackIn_34_0 = null;
        String stackIn_36_0 = null;
        String stackIn_42_0 = null;
        String stackIn_44_0 = null;
        String[] stackIn_68_0 = null;
        int stackIn_68_1 = 0;
        String stackIn_69_2 = null;
        String stackIn_70_0 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_75_2 = null;
        StringBuilder stackIn_78_1 = null;
        String stackIn_79_2 = null;
        StringBuilder stackIn_82_1 = null;
        String stackIn_83_2 = null;
        StringBuilder stackIn_86_1 = null;
        String stackIn_87_2 = null;
        StringBuilder stackIn_90_1 = null;
        String stackIn_91_2 = null;
        StringBuilder stackIn_94_1 = null;
        String stackIn_95_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var9_int = 0;
        RuntimeException var9 = null;
        int[] var10 = null;
        int var11 = 0;
        int var12_int = 0;
        StringBuilder var12 = null;
        int var13 = 0;
        try {
          if (0 != (param5 & 1 << this.localPlayerIndex) &&
            0 != (this.modeFlags & TutorialController.field_c)) {
            stackIn_7_0 = 1;
          } else {
            stackIn_7_0 = 0;
          }
          var9_int = stackIn_7_0;
          var10 = new int[this.gameModel.playerCount];
          var11 = 0;
          var12_int = 0;
          for (var13 = 0; var13 < this.gameModel.playerCount; var13++) {
            if ((param5 & 1 << var13) != 0) {
              if (this.localPlayerIndex != var13 ||
                (this.modeFlags & TutorialController.field_c) == 0) {
                var10[var12_int++] = var13;
              }
              var11++;
            }
          }
          if (param4 != 61) {
            this.cuePower = -77;
          }
          if (var11 == 0) {
            stackIn_28_0 = null;
            return (String) (stackIn_28_0);
          }
          if (var11 == 1) {
            if (var9_int != 0) {
              stackIn_36_0 = (String) (param7);
              return stackIn_36_0;
            }
            stackIn_34_0 = AccountWelcomePanel.substituteTemplateArguments(new String[]{this.getPlayerName(param4 ^ -30379, var10[0]), "<%1>", "<%2>"}, -1, param1);
            return stackIn_34_0;
          }
          if (var11 == 2) {
            if (var9_int != 0) {
              stackIn_44_0 = AccountWelcomePanel.substituteTemplateArguments(new String[]{this.getPlayerName(-30360, var10[0]), "<%1>", "<%2>"}, param4 - 62, param3);
              return stackIn_44_0;
            }
            stackIn_42_0 = AccountWelcomePanel.substituteTemplateArguments(new String[]{this.getPlayerName(-30360, var10[0]), this.getPlayerName(-30360, var10[1]), "<%2>"}, -1, param2);
            return stackIn_42_0;
          }
          var12 = new StringBuilder(128);
          if (var9_int != 0) {
            var11--;
          }
          for (var13 = 0; var11 > var13; var13++) {
            if (0 == var13 &&
              var9_int == 0) {
              discarded$0 = var12.append(AccountWelcomePanel.substituteTemplateArguments(new String[]{this.getPlayerName(param4 ^ -30379, var10[var13]), "<%1>", "<%2>"}, param4 - 62, en.playerListFirst));
            } else {
              if (~var13 == ~(-1 + var11)) {
                discarded$1 = var12.append(AccountWelcomePanel.substituteTemplateArguments(new String[]{this.getPlayerName(-30360, var10[var13]), "<%1>", "<%2>"}, -1, DialogLayer.playerListLast));
              } else {
                discarded$2 = var12.append(AccountWelcomePanel.substituteTemplateArguments(new String[]{this.getPlayerName(-30360, var10[var13]), "<%1>", "<%2>"}, -1, bc.playerListMiddle));
              }
            }
          }
          stackIn_68_0 = new String[]{var12.toString(), "<%1>", "<%2>"};
          stackIn_68_1 = -1;
          if (var9_int == 0) {
            stackIn_69_2 = (String) (param6);
          } else {
            stackIn_69_2 = (String) (param0);
          }
          stackIn_70_0 = AccountWelcomePanel.substituteTemplateArguments(stackIn_68_0, stackIn_68_1, stackIn_69_2);
          return stackIn_70_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_74_0 = var9;
          stackIn_74_1 = new StringBuilder().append("uf.OC(");
          if (param0 == null) {
            stackIn_75_2 = "null";
          } else {
            stackIn_75_2 = "{...}";
          }
          stackIn_78_1 = ((StringBuilder) (Object) stackIn_74_1).append(stackIn_75_2).append(',');
          if (param1 == null) {
            stackIn_79_2 = "null";
          } else {
            stackIn_79_2 = "{...}";
          }
          stackIn_82_1 = ((StringBuilder) (Object) stackIn_78_1).append(stackIn_79_2).append(',');
          if (param2 == null) {
            stackIn_83_2 = "null";
          } else {
            stackIn_83_2 = "{...}";
          }
          stackIn_86_1 = ((StringBuilder) (Object) stackIn_82_1).append(stackIn_83_2).append(',');
          if (param3 == null) {
            stackIn_87_2 = "null";
          } else {
            stackIn_87_2 = "{...}";
          }
          stackIn_90_1 = ((StringBuilder) (Object) stackIn_86_1).append(stackIn_87_2).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_91_2 = "null";
          } else {
            stackIn_91_2 = "{...}";
          }
          stackIn_94_1 = ((StringBuilder) (Object) stackIn_90_1).append(stackIn_91_2).append(',');
          if (param7 == null) {
            stackIn_95_2 = "null";
          } else {
            stackIn_95_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_74_0), ((StringBuilder) (Object) stackIn_94_1).append(stackIn_95_2).append(')').toString());
        }
    }

    private final void updatePlayerInfoButtonSprites(boolean param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          stackIn_4_0 = (RasterBuffer.field_i) ? 1 : 0;
          var2_int = stackIn_4_0;
          DualLinkNodeHashTable.field_k.disabledSprite = dq.field_e[var2_int + 0];
          if (param0) {
            return;
          }
          DualLinkNodeHashTable.field_k.sprite = dq.field_e[var2_int + 2];
          DualLinkNodeHashTable.field_k.activeSprite = dq.field_e[4 + var2_int];
          DualLinkNodeHashTable.field_k.selectedSprite = dq.field_e[6 + var2_int];
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "uf.PC(" + param0 + ')');
        }
    }

    private final void setCuePower(int param0, boolean param1) {
        int[] var3 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          if (!param1) {
            tickerHintLeaveShotMode = (String) null;
          }
          if (param0 < 0) {
            param0 = 0;
          }
          if (param0 > 4096) {
            param0 = 4096;
          }
          if (~this.cuePower != ~param0) {
            var3 = this.findValidCueAim(this.cueAim.field_e, this.cueAim.field_d, this.cueAim.polarAngle, param0, (byte) 95, this.cueAim.azimuth);
            if (null != var3) {
              this.cueAim.polarAngle = var3[0];
              this.cueAim.field_d = var3[1];
              this.cueAim.field_e = var3[2];
              this.cuePower = param0;
              MouseWheelInput.field_c.field_g = true;
            } else {
              this.raiseCueBlockedWarning(107);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var3_ref), "uf.CA(" + param0 + ',' + param1 + ')');
        }
    }

    private final void sendManhandledBall(byte param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        ShotRecord var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = -122 % ((-69 - param0) / 45);
          var3 = this.gameModel.currentShot(92);
          if (var3.ballInHandMode != 0 &&
            this.ballManhandled) {
            JaggrabDownloader.field_j.writeCipheredOpcode(false, 72);
            var3.writeCueBallPlacement(this.gameModel, JaggrabDownloader.field_j, -7478);
            if ((LinkButtonPainter.field_i & 2097152L) != 0L) {
              System.out.println("->C2S_MANHANDLE_BALL: " + vi.a((byte) 108, 16, 4, (long)var3.cueBallX) + "," + vi.a((byte) 64, 16, 4, (long)var3.cueBallY));
            }
            this.ballManhandled = false;
            this.placementSyncTicks = 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "uf.A(" + param0 + ')');
        }
    }

    private final boolean x(byte param0) {
        ShotRecord var2 = null;
        RuntimeException var2_ref = null;
        boolean stackIn_16_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -102) {
            this.openInGameMenu(5, true);
          }
          var2 = this.gameModel.currentShot(52);
          stackIn_16_0 = !(0 > var2.breakSeed) || !(this.gameModel.field_y <= 0) || (var2.ballInHandMode != 0) || (var2.field_E);
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var2_ref), "uf.UA(" + param0 + ')');
        }
    }

    final void handleStartTurnPacket(boolean param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (!param0) {
            this.ballManhandled = true;
          }
          this.introDelayTicks = -1;
          this.beginTurn((byte) -37);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var2), "uf.K(" + param0 + ')');
        }
    }

    private final void v(int param0) {
        try {
          this.gameModel.currentShot(109).power = (short)param0;
          this.gameModel.snapshotFinishedShot((byte) -124);
          this.handleShotFinished(this.gameModel.currentShot(param0 + 126), 1);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "uf.KD(" + param0 + ')');
        }
    }

    final void openInGameMenu(int param0, boolean param1) {
        int var3_int = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_11_2 = 0;
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        int stackIn_17_2 = 0;
        int stackIn_21_0 = 0;
        int stackIn_21_1 = 0;
        int stackIn_22_2 = 0;
        int stackIn_30_0 = 0;
        int stackIn_30_1 = 0;
        int stackIn_31_2 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if ((TutorialController.field_c & this.modeFlags) == 0) {
            if (NanoTickClock.b(-119)) {
              if (!FadingDialog.a(false, hp.field_c) &&
                ti.field_d == null) {
                fq.a(param0 - 3661, 21, 0, param1);
              } else {
                var3_int = param1 ? 1 : 0;
                stackIn_30_0 = -3405;
                stackIn_30_1 = 19;
                if (mg.a(true)) {
                  stackIn_31_2 = 21;
                } else {
                  stackIn_31_2 = 0;
                }
                fq.a(stackIn_30_0, stackIn_30_1, stackIn_31_2, var3_int != 0);
              }
            } else {
              if (!FadingDialog.a(false, hp.field_c)) {
                if (null == ti.field_d) {
                  var3_int = param1 ? 1 : 0;
                  stackIn_21_0 = -3405;
                  stackIn_21_1 = 0;
                  if (!mg.a(true)) {
                    stackIn_22_2 = 0;
                  } else {
                    stackIn_22_2 = 21;
                  }
                  fq.a(stackIn_21_0, stackIn_21_1, stackIn_22_2, var3_int != 0);
                } else {
                  var3_int = param1 ? 1 : 0;
                  stackIn_16_0 = -3405;
                  stackIn_16_1 = 16;
                  if (!mg.a(true)) {
                    stackIn_17_2 = 0;
                  } else {
                    stackIn_17_2 = 21;
                  }
                  fq.a(stackIn_16_0, stackIn_16_1, stackIn_17_2, var3_int != 0);
                }
              } else {
                var3_int = param1 ? 1 : 0;
                stackIn_10_0 = -3405;
                stackIn_10_1 = 18;
                if (mg.a(true)) {
                  stackIn_11_2 = 21;
                } else {
                  stackIn_11_2 = 0;
                }
                fq.a(stackIn_10_0, stackIn_10_1, stackIn_11_2, var3_int != 0);
              }
            }
          }
          LobbyGame.field_gc.stopLoopSounds(false);
          if (param0 != 256) {
            this.setAimAzimuth(-75, -111);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var3), "uf.OD(" + param0 + ',' + param1 + ')');
        }
    }

    private final void beginBallDrag(int param0) {
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        try {
          var2_int = -121 % ((48 - param0) / 36);
          if (this.introDelayTicks < 0 &&
            this.isLocalPlayersTurn(-1) &&
            this.gameModel.balls[this.hoveredBallIndex].inPlay) {
            if ((524288L & LinkButtonPainter.field_i) == 0L) {
              if (this.gameModel.currentShot(70).phase != 0) {
                return;
              }
              if (this.gameModel.currentShot(55).ballInHandMode == 0) {
                return;
              }
              if (0 != this.hoveredBallIndex) {
                return;
              }
            }
            var3 = wn.field_i - vn.field_b;
            var4 = -CachedArchiveSource.field_m + DebouncedValidationProvider.field_f;
            if (var3 >= -3 &&
              var3 <= 3 &&
              var4 >= -3 &&
              3 >= var4) {
              return;
            }
            this.draggedBallIndex = this.hoveredBallIndex;
            this.mouseButtonHeld = false;
            if (this.draggedBallIndex == 0 &&
              this.shotModeActive) {
              this.tryLeaveShotMode(-92);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var2), "uf.ND(" + param0 + ')');
        }
    }

    private final void moveCameraTargetToMousePoint(byte param0) {
        RuntimeException decompiledCaughtException = null;
        double[] var2 = null;
        RuntimeException var2_ref = null;
        try {
          if (param0 != 11) {
            this.playerCueAims = (CueAim[]) null;
          }
          if (this.checkTutorialAction(1, 2, false)) {
            var2 = new double[2];
            if (MusicCrossfadeStream.a(64, UsernameAvailabilityValidator.field_o, false, this.cameraGoal.getDistance(8), DialogLayer.field_W, var2, this.viewMatrix)) {
              this.cameraGoal.targetX = var2[0];
              this.cameraGoal.targetY = var2[1];
              this.cameraGoal.c((byte) -40);
              this.idleOrbitStep = -1;
              this.cameraPresetIndex = -1;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var2_ref), "uf.JD(" + param0 + ')');
        }
    }

    private final int classifyMouseDragMode(int param0, int param1, boolean param2) {
        int stackIn_110_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        try {
          if (param0 != 9587) {
            this.dragLastMouseY = -110;
          }
          var4_int = 0;
          if (!this.shotModeActive) {
            if (param1 == 1 &&
              !TextLineLayout.field_c[82] &&
              !TextLineLayout.field_c[86] &&
              TextLineLayout.field_c[81]) {
              var4_int = 2;
            }
            if (param1 == 2 &&
              !TextLineLayout.field_c[82] &&
              !TextLineLayout.field_c[86] &&
              !TextLineLayout.field_c[81]) {
              var4_int = 1;
            }
            if ((param1 == 1) &&
              (TextLineLayout.field_c[82]) &&
              (!TextLineLayout.field_c[86]) &&
              (!TextLineLayout.field_c[81])) {
              var4_int = 1;
              if (Pool.field_O != 0) {
                if (0 == this.gameModel.currentShot(102).phase &&
                  param1 == 1 &&
                  !TextLineLayout.field_c[82] &&
                  !TextLineLayout.field_c[86] &&
                  TextLineLayout.field_c[81]) {
                  var4_int = 4;
                }
                if (this.gameModel.currentShot(74).phase == 0 &&
                  param1 == 2 &&
                  !TextLineLayout.field_c[82] &&
                  !TextLineLayout.field_c[86] &&
                  !TextLineLayout.field_c[81]) {
                  var4_int = 3;
                }
                if (0 == this.gameModel.currentShot(75).phase &&
                  param1 == 1 &&
                  TextLineLayout.field_c[82] &&
                  !TextLineLayout.field_c[86] &&
                  !TextLineLayout.field_c[81]) {
                  var4_int = 3;
                }
              }
            }
          } else {
            if (0 == this.gameModel.currentShot(102).phase &&
              param1 == 1 &&
              !TextLineLayout.field_c[82] &&
              !TextLineLayout.field_c[86] &&
              TextLineLayout.field_c[81]) {
              var4_int = 4;
            }
            if (this.gameModel.currentShot(74).phase == 0 &&
              param1 == 2 &&
              !TextLineLayout.field_c[82] &&
              !TextLineLayout.field_c[86] &&
              !TextLineLayout.field_c[81]) {
              var4_int = 3;
            }
            if (0 == this.gameModel.currentShot(75).phase &&
              param1 == 1 &&
              TextLineLayout.field_c[82] &&
              !TextLineLayout.field_c[86] &&
              !TextLineLayout.field_c[81]) {
              var4_int = 3;
            }
          }
          if (param1 == 1 &&
            !TextLineLayout.field_c[82] &&
            !TextLineLayout.field_c[86] &&
            !TextLineLayout.field_c[81] && (param2 &&
            this.mouseDragMode == 5 ||
            this.getPowerFromBarPosition((byte) 124) != -1)) {
            var4_int = 5;
          }
          stackIn_110_0 = var4_int;
          return stackIn_110_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var4), "uf.SC(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void setAimAzimuth(int param0, int param1) {
        RuntimeException decompiledCaughtException = null;
        int[] var3 = null;
        RuntimeException var3_ref = null;
        try {
          if (param0 != -69) {
            this.keyPowerRamp = -13;
          }
          if (this.checkTutorialAction(1, 4, false)) {
            var3 = this.findValidCueAim(this.cueAim.field_e, this.cueAim.field_d, this.cueAim.polarAngle, this.cuePower, (byte) 95, param1);
            if (var3 == null) {
              this.raiseCueBlockedWarning(99);
            } else {
              this.cueAim.polarAngle = var3[0];
              this.cueAim.azimuth = param1;
              this.cueAim.field_d = var3[1];
              this.cueAim.field_e = var3[2];
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var3_ref), "uf.DC(" + param0 + ',' + param1 + ')');
        }
    }

    private final static void loadCommonUiSprites(ResourceArchive param0, int param1, ResourceArchive param2, ResourceArchive param3) {
        int stackIn_20_0 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        Sprite var4 = null;
        RuntimeException var4_ref = null;
        IndexedSprite[] var5 = null;
        IndexedSprite[][] var6 = null;
        int[][] var7 = null;
        int var8 = 0;
        int var9 = 0;
        IndexedSprite[] var10 = null;
        Sprite var10_ref = null;
        int var11_int = 0;
        Sprite var11 = null;
        Sprite var12 = null;
        int var13 = 0;
        var13 = Pool.field_O;
        try {
          ArchiveRequest.field_I = NameEntryPopup.a(0, "commonui", param2, "frame_top");
          ArchiveLoadSequence.field_d = NameEntryPopup.a(0, "commonui", param2, "frame_bottom");
          EmailAvailabilityValidator.field_p = WidgetStyleLayer.loadSprite("commonui", (byte) 124, "jagex_logo_grey", param2);
          jj.field_S = NameEntryPopup.a(0, "commonui", param2, "button");
          bo.field_a = NetworkGameClient.a(param1 ^ -22692, param2, "validation", "commonui");
          PoolUiText.field_a = (BitmapFont) ((Object) hn.a(param3, "commonui", "arezzo12", -25154, param2));
          ValidationIconWidget.field_O = (BitmapFont) ((Object) hn.a(param3, "commonui", "arezzo14", -25154, param2));
          bi.field_e = (BitmapFont) ((Object) hn.a(param3, "commonui", "arezzo14bold", -25154, param2));
          var4 = new Sprite(param0.getFileByName(false, "", "button.gif"), (java.awt.Component) ((Object) TimeTrialSelectScreen.field_K));
          RankingsScreen.a(param2, 3812, "dropdown", "commonui");
          var5 = ArchiveRequest.a(param2, "commonui", -24155, "screen_options");
          PlasmaBallSkin.field_l = new IndexedSprite[4];
          la.field_c = new IndexedSprite[4];
          BirthDateValidator.field_h = new IndexedSprite[4];
          var6 = new IndexedSprite[][]{PlasmaBallSkin.field_l, BirthDateValidator.field_h, la.field_c};
          var7 = new int[4][];
          var7[0] = var5[0].field_i;
          var8 = 1;
          do {
            if (var8 >= var7.length) {
              var8 = var5[0].field_j[0];
              var7[2][var8] = 16777215;
              var7[1][var8] = 2394342;
              var7[3][var8] = 4767999;
              break;
            }
            var7[var8] = (int[]) ((Object) var7[0].clone());
            var8++;
          } while (var13 == 0);
          var9 = 0;
          scanLoop1: while (true) {
            if (var9 < 3) {
              var10 = var6[var9];
              stackIn_20_0 = 0;
              if (var13 != 0) {
                break scanLoop1;
              }
              var11_int = stackIn_20_0;
              while (var10.length > var11_int) {
                var10[var11_int] = SingleChildWidget.a(var5[var9], (byte) 91, var7[var11_int]);
                var11_int++;
              }
              var9++;
              continue scanLoop1;
            }
            var9 = var4.field_A;
            uc.pushRasterSnapshot((byte) 125);
            var4.bindAsRenderTarget();
            stackIn_20_0 = 0;
            break;
          }
          SoftwareRasterizer.grayscaleRectangle(stackIn_20_0, 0, SoftwareRasterizer.width, SoftwareRasterizer.height);
          var10_ref = new Sprite(var9, var9);
          var10_ref.bindAsRenderTarget();
          var4.a(0, 0);
          var11 = new Sprite(var9, var9);
          var11.bindAsRenderTarget();
          var4.a(var9 - var4.field_z, 0);
          if (param1 != -22764) {
            PoolMatchController.loadInterfaceAssets(26, false, (ResourceArchive) null, (ResourceArchive) null, (ResourceArchive) null);
          }
          var12 = new Sprite(var4.field_z - var9 * 2, var9);
          var12.bindAsRenderTarget();
          var4.a(-var9, 0);
          TriangleMesh.a(112);
          jj.field_S = new Sprite[]{var10_ref, var12, var11};
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_28_0 = var4_ref;
          stackIn_28_1 = new StringBuilder().append("uf.PA(");
          if (param0 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          stackIn_32_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          stackIn_36_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',');
          if (param3 == null) {
            stackIn_37_2 = "null";
          } else {
            stackIn_37_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(')').toString());
        }
    }

    private final void awardAchievement(byte param0, int achievementId, int param2) {
        RuntimeException runtimeException = null;
        int[] var4 = null;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        int[] var4Lifetime1;
        int var5Lifetime1;
        try {
          if (ButtonWidget.a(ClientException.field_g, -13671, achievementId)) {
            return;
          }
          var4 = ClientException.field_g;
          var5 = achievementId;
          var4[var5 >> 5] = md.a(var4[var5 >> 5], 1 << ArchiveLoadSequence.b(var5, 31));
          var4Lifetime1 = hp.field_c;
          var5Lifetime1 = achievementId;
          var4Lifetime1[var5Lifetime1 >> 5] = md.a(var4Lifetime1[var5Lifetime1 >> 5], 1 << ArchiveLoadSequence.b(var5Lifetime1, 31));
          if (param0 != 104) {
            this.idleOrbitDistance = 100;
          }
          LoginForm.field_U.addFirst((byte) 115, new bq(achievementId));
          ProgressBarWidget.a(true, 0, md.achievementNames[achievementId], ef.a((String) null, kc.achievementCriteria[achievementId], (byte) 4, (String) null));
          if (!this.cheatMode) {
            ArchiveIndex.field_l.addFirst((byte) 84, new i(achievementId, param2, vm.field_f, wq.field_c, field_fb, dk.field_f + this.clockTicks));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "uf.OB(" + param0 + ',' + achievementId + ',' + param2 + ')');
        }
    }

    private final void tryLeaveShotMode(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (param0 >= -40) {
            this.setUpTheme(45, -72, -20);
          }
          if (this.checkTutorialAction(0, 6, false)) {
            this.leaveShotMode(false, (byte) -114);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var2), "uf.G(" + param0 + ')');
        }
    }

    private final void drawPowerBar(boolean param0) {
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        try {
          if (!param0) {
            this.markBallTransformsDirty(35);
          }
          if (0 < this.shotModeFade) {
            var2_int = -5 + il.field_f.field_w - 5;
            var3 = -14 + il.field_f.field_y;
            var4 = this.powerBarLeft(-16439);
            var5 = fl.field_q.screenY - il.field_f.field_y >> 1;
            var6 = this.powerToBarPixels(this.cuePower, 0, var3);
            SoftwareRasterizer.saveClip(ho.field_s);
            SoftwareRasterizer.setClip(var4 + 5, -var6 + (7 + (var5 + var3)), var2_int + (var4 + 5), var5 - (-7 - var3));
            LimitedRandomAccessFile.field_c.draw(var4, var5);
            SoftwareRasterizer.restoreClip(ho.field_s);
            il.field_f.draw(var4, var5);
            if ((2L & LinkButtonPainter.field_i) != 0L) {
              sa.field_h.c("power=" + this.cuePower + ", bar_filled=" + var6, var4, var5, 16777215, 1);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var2), "uf.L(" + param0 + ')');
        }
    }

    private final void tryEnterShotMode(byte param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.isLocalPlayersTurn(-1) &&
            !this.gameModel.field_o &&
            this.gameModel.currentShot(36).phase == 0) {
            var2_int = -36 % ((param0 + 15) / 63);
            if (this.checkTutorialAction(0, 3, false)) {
              this.enterShotMode((byte) 117);
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "uf.BA(" + param0 + ')');
        }
    }

    private final void selectCurrentPlayerAim(int param0) {
        hh.field_c = true;
        this.cueAim = this.playerCueAims[this.gameModel.currentShot(57).playerIndex];
        if (param0 < 15) {
          return;
        }
        try {
          this.cuePower = this.cueAim.field_n;
          this.powerPulseTick = 0;
          if (null != this.remoteCueTarget) {
            this.remoteCueTarget.b((byte) 63);
          }
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "uf.B(" + param0 + ')');
        }
    }

    final void tick(boolean param0, boolean param1, byte param2) {
        boolean discarded$0 = false;
        boolean discarded$1 = false;
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int fieldTemp$4 = 0;
        int fieldTemp$5 = 0;
        int stackIn_7_0 = 0;
        int stackIn_8_1 = 0;
        boolean stackIn_44_0 = false;
        boolean stackIn_72_0 = false;
        int stackIn_280_0 = 0;
        int stackIn_281_1 = 0;
        boolean stackIn_295_0 = false;
        int stackIn_396_0 = 0;
        int stackIn_400_0 = 0;
        int stackIn_479_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_294_0;
        long var4_long = 0L;
        int var4_int = 0;
        ShotRecord var4 = null;
        int[] var4_array = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        String var5_ref_String = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = Pool.field_O;
        try {
          var4_long = LinkButtonPainter.field_i;
          var4_long = var4_long | var4_long >>> 32;
          var4_long = var4_long | var4_long << 16;
          var4_long = var4_long | var4_long << 8;
          wq.field_c = (int)((long)wq.field_c | var4_long >>> 16 & 65280L);
          vm.field_f = (int)((long)vm.field_f | -16777216L & var4_long);
          var6 = -117 % ((param2 + 60) / 47);
          var4_int = this.clockTicks;
          var5 = var4_int;
          var6 = var5 + dk.field_f;
          var7 = var6 % 7621;
          var6 = (var7 + 2) % 7621 + (-var7 + var6);
          dk.field_f = -var5 + var6;
          field_fb = ((field_fb >>> 16) + 2) % 30484 << 16 | field_fb & 65535;
          var4_int = TimeTrialSelectScreen.f(-1);
          if ((vm.field_f & 255) < var4_int) {
            stackIn_7_0 = -256 & vm.field_f;
            if (var4_int > 255) {
              stackIn_8_1 = 255;
            } else {
              stackIn_8_1 = var4_int;
            }
            vm.field_f = stackIn_7_0 + stackIn_8_1;
          }
          if ((sk.field_d & this.modeFlags) != 0) {
            this.tutorial.update(25);
            if (!param0) {
              param0 = this.tutorial.handleButtonPress(99);
            }
          }
          if ((this.modeFlags & TutorialController.field_c) != 0) {
            if (ValidationIconWidget.field_U != null) {
              if (MidiNoteMixer.field_r > 0) {
                ValidationIconWidget.field_U.sprite = jh.field_e;
                if (var9 != 0) {
                  ValidationIconWidget.field_U.sprite = ta.field_e;
                }
              } else {
                ValidationIconWidget.field_U.sprite = ta.field_e;
              }
              ValidationIconWidget.field_U.sprite.field_B = 5;
              ValidationIconWidget.field_U.sprite.field_G = 9;
              ValidationIconWidget.field_U.height = ValidationIconWidget.field_U.sprite.field_A + 5 + 5;
              ValidationIconWidget.field_U.width = 9 + (ValidationIconWidget.field_U.sprite.field_z + 9);
              ValidationIconWidget.field_U.localY = fl.field_q.screenY - 5 - ValidationIconWidget.field_U.sprite.field_A - 5;
            }
            if (!un.field_b) {
            }
          }
          if ((this.modeFlags & TutorialController.field_c) != 0 &&
            param1 &&
            !DualLinkNode.field_p) {
            ValidationIconWidget.field_U.updateRoot(true, false);
            if (ValidationIconWidget.field_U.pressedButton == 1) {
              param0 = true;
              stackIn_44_0 = !(un.field_b);
              un.field_b = stackIn_44_0;
              if (-1 != this.cameraPresetIndex) {
                this.applyCameraPreset(false, 22, this.cameraPresetIndex);
              }
            }
          }
          if (param1) {
            if ((0 == (this.modeFlags & TutorialController.field_c) ||
              !DualLinkNode.field_p) &&
              (this.isLocalPlayersTurn(-1) &&
              this.introDelayTicks < 0)) {
              this.handleAimKeys(0);
            }
            DualLinkNodeHashTable.field_k.updateRoot(true, false);
            if (!param0 &&
              DualLinkNodeHashTable.field_k.pressedButton == 1) {
              stackIn_72_0 = !(RasterBuffer.field_i);
              RasterBuffer.field_i = stackIn_72_0;
              param0 = true;
              this.updatePlayerInfoButtonSprites(false);
            }
            if (this.shotModeActive) {
              if (wn.field_i != this.lastHoverMouseX ||
                this.lastHoverMouseY != DebouncedValidationProvider.field_f) {
                this.updateHoveredBall(false);
                if (this.hoveredBallIndex == 0) {
                  this.updateStrikePointFromMouse(-119, DebouncedValidationProvider.field_f, wn.field_i);
                }
              }
              if (0 != this.hoveredBallIndex) {
                discarded$0 = this.setStrikePoint(false, this.cueAim.field_e * 3 / 4, this.cueAim.field_d * 3 / 4);
              }
            }
            if (!param0 &&
              this.updateMouseDrag(3460)) {
              param0 = true;
            }
            if (e.handleChoiceButtons(-19839, this)) {
              var4 = this.gameModel.currentShot(70);
              if ((TutorialController.field_c & this.modeFlags) != 0) {
                JaggrabDownloader.field_j.writeCipheredOpcode(false, 71);
                var4.writeChoices(JaggrabDownloader.field_j, (byte) 0);
              }
              if (!var4.isAnyChoicePending(126)) {
                this.gameModel.beginNextShot((byte) 38);
                this.announceBallGroups(127, var4);
              }
              param0 = true;
            }
            boolean decompiledFrameRemainder4 = true;
            if (!TextLineLayout.field_c[82] &&
              !TextLineLayout.field_c[86]) {
              if ((cd.field_b != 1) &&
                (decompiledFrameRemainder4 = (cd.field_b == 0))) {
                if (this.mouseButtonHeld &&
                  !this.shotModeActive) {
                  this.updateHoveredBall(false);
                }
                if (this.mouseButtonHeld) {
                  boolean decompiledFrameRemainder3 = true;
                  if (this.shotModeActive) {
                    if (this.hoveredBallIndex != 0) {
                      this.tryLeaveShotMode(-98);
                      this.moveCameraTargetToMousePoint((byte) 11);
                      decompiledFrameRemainder3 = (var9 != 0);
                    }
                    if (decompiledFrameRemainder3) {
                      this.fireShot(1);
                      if (var9 != 0) {
                        if (this.introDelayTicks < 0 &&
                          0 == this.hoveredBallIndex) {
                          this.tryEnterShotMode((byte) 78);
                          this.moveCameraTargetToMousePoint((byte) 11);
                        } else {
                          this.moveCameraTargetToMousePoint((byte) 11);
                        }
                      }
                    }
                  } else {
                    if (this.introDelayTicks < 0 &&
                      0 == this.hoveredBallIndex) {
                      this.tryEnterShotMode((byte) 78);
                      if (var9 != 0) {
                        this.moveCameraTargetToMousePoint((byte) 11);
                      }
                    } else {
                      this.moveCameraTargetToMousePoint((byte) 11);
                    }
                  }
                  this.mouseButtonHeld = false;
                }
                this.draggedBallIndex = -1;
                decompiledFrameRemainder4 = (var9 != 0);
              }
              if (decompiledFrameRemainder4) {
                var4_int = this.clockTicks;
                wq.field_c = ((65535 & wq.field_c) + 2) % 31676 | wq.field_c & -65536;
                var5 = var4_int;
                var6 = dk.field_f + var5;
                var7 = var6 % 7621;
                var8 = var6 / 7621;
                var6 = var7 + (var8 + 2) % 31676 * 7621;
                dk.field_f = -var5 + var6;
                var4_int = this.clockTicks;
                field_fb = 65535 & field_fb | (16 + (field_fb >>> 16)) % 30484 << 16;
                var5 = var4_int;
                var6 = dk.field_f + var5;
                var7 = var6 % 7621;
                var6 = -var7 + (var6 + (16 + var7) % 7621);
                dk.field_f = -var5 + var6;
                if (!param0 &&
                  (LinkButtonPainter.field_i & 1L) != 0L &&
                  ti.a((byte) 94)) {
                  param0 = true;
                }
                if (!param0 &&
                  ScrollPane.field_Ob < DialogLayer.field_W &&
                  (ScrollPane.field_Ob + Js5Transport.field_q.field_w) > DialogLayer.field_W &&
                  UsernameAvailabilityValidator.field_o > ArrayWidgetGroup.field_M &&
                  UsernameAvailabilityValidator.field_o < (ArrayWidgetGroup.field_M + Js5Transport.field_q.field_y)) {
                  param0 = true;
                }
                if (!param0) {
                  if (1 == MatchingTextValidator.field_s) {
                    if (!this.shotModeActive) {
                      this.updateHoveredBall(false);
                    }
                    if (this.hoveredBallIndex == -1) {
                      if (this.shotModeActive) {
                        this.tryLeaveShotMode(-69);
                      }
                      this.moveCameraTargetToMousePoint((byte) 11);
                      decompiledFrameRemainder4 = (var9 != 0);
                    }
                    if (decompiledFrameRemainder4) {
                      vn.field_b = wn.field_i;
                      this.mouseButtonHeld = true;
                      CachedArchiveSource.field_m = DebouncedValidationProvider.field_f;
                      decompiledFrameRemainder4 = (var9 != 0);
                    }
                  }
                  if (decompiledFrameRemainder4) {
                    if (!this.mouseButtonHeld) {
                      if (this.draggedBallIndex != -1) {
                        this.dragSelectedBall((byte) 112);
                        if (var9 != 0) {
                          this.beginBallDrag(-72);
                        }
                      }
                    } else {
                      this.beginBallDrag(-72);
                    }
                  }
                }
              }
            }
            if (wp.field_d != 0 &&
              !fl.field_q.activeInside) {
              var4_int = 0;
              if (this.isLocalPlayersTurn(-1)) {
                if (var4_int == 0 &&
                  (LinkButtonPainter.field_i & 1L) != 0L &&
                  bi.a((byte) -92)) {
                  var4_int = 1;
                }
                if (var4_int == 0 &&
                  this.tryApplyMouseWheel(122)) {
                  var4_int = 1;
                }
              }
              if (var4_int == 0) {
                discarded$1 = this.zoomCameraWithWheel((byte) -118);
              }
            }
            if (this.isLocalPlayersTurn(-1) &&
              this.gameModel.currentShot(65).phase == 0) {
              if (!this.gameModel.isCuePathClear(this.cueAim.field_e, this.cueAim.azimuth, this.cueAim.polarAngle, 359, this.cuePower, this.cueAim.field_d)) {
                var4_array = this.findValidCueAim(this.cueAim.field_e, this.cueAim.field_d, this.cueAim.polarAngle, this.cuePower, (byte) 95, this.cueAim.azimuth);
                boolean decompiledSharedTail1 = (var4_array != null);
                if (!decompiledSharedTail1) {
                  this.raiseCueBlockedWarning(110);
                  decompiledSharedTail1 = (var9 != 0);
                }
                if (decompiledSharedTail1) {
                  this.cueAim.field_d = var4_array[1];
                  this.cueAim.field_e = var4_array[2];
                  this.cueAim.polarAngle = var4_array[0];
                }
              }
              this.updateCueBlockedWarning((byte) -47);
            }
          }
          if ((this.modeFlags & TutorialController.field_c) != 0 &&
            !this.isLocalPlayersTurn(-1) &&
            this.remoteCueTarget.a(false)) {
            this.cueAim.easeToward(255, this.remoteCueTarget);
            if (this.cueAim.equalsAim(-2043, this.remoteCueTarget)) {
              this.remoteCueTarget.b((byte) 94);
            }
            hh.field_c = true;
            MouseWheelInput.field_c.field_g = true;
          }
          boolean decompiledSharedTail0 = (!(param1) ||
            !(this.shotModeActive) ||
            this.hoveredBallIndex != 0 ||
            !(this.isLocalPlayersTurn(-1)));
          if (!decompiledSharedTail0) {
            StatefulTextPainter.field_s.setCursorVisible(false, (byte) 106, (java.awt.Component) ((Object) TextLineLayout.a((byte) -46)));
            decompiledSharedTail0 = (var9 != 0);
          }
          if (decompiledSharedTail0) {
            StatefulTextPainter.field_s.setCursorVisible(true, (byte) 106, (java.awt.Component) ((Object) TextLineLayout.a((byte) -83)));
          }
          this.fadeShotModeOverlay(-114);
          var4_int = f.field_g;
          if (var4_int > (vm.field_f & 255)) {
            stackIn_280_0 = vm.field_f & -256;
            if (var4_int <= 255) {
              stackIn_281_1 = var4_int;
            } else {
              stackIn_281_1 = 255;
            }
            vm.field_f = stackIn_280_0 + stackIn_281_1;
          }
          regionExit1: {
            regionExit2: {
              var4 = this.gameModel.currentShot(71);
              if (MatchingTextValidator.field_r.isEmpty(0) &&
                (this.modeFlags & sk.field_d) == 0) {
                if (!this.gameModel.field_o) {
                  var6 = 0;
                  var7 = 0;
                  while (this.gameModel.playerCount > var7) {
                    stackOut_294_0 = this.gameModel.rules.isPlayerActive((byte) 94, var7);
                    stackIn_396_0 = stackOut_294_0 ? 1 : 0;
                    stackIn_295_0 = stackOut_294_0;
                    if (var9 != 0) {
                      break regionExit1;
                    }
                    if (!stackIn_295_0) {
                      var6 = var6 | 1 << var7;
                    }
                    var7++;
                  }
                  var5_ref_String = this.formatPlayerGroupMessage(HuffmanCodec.playerYouFirstListAreOut, ShotRecord.playerIsOut, mg.playerX2AreOut, TextInputWidget.playerYouX2AreOut, (byte) 61, var6, jl.playerListAreOut, TextLineLayout.playerYouAreOut);
                  if (var5_ref_String != null) {
                    HighscoresScreen.$cfr$intArgs$a$c9c3307e6488(127, false, 1, var5_ref_String);
                  }
                  var5_ref_String = this.formatPlayerGroupMessage(DraggableWidget.playerYouFirstListHaveResigned, ah.mpXHasresigned, w.playerX2HaveResigned, WireframeQuad.playerYouX2HaveResigned, (byte) 61, this.gameModel.field_p & ~var6, Pocket.playerListHaveResigned, cd.mpYouresigned);
                  if (var5_ref_String != null) {
                    HighscoresScreen.$cfr$intArgs$a$c9c3307e6488(124, false, 1, var5_ref_String);
                  }
                  var5_ref_String = this.formatPlayerGroupMessage(CueStick.playerYouFirstListAreOfferingDraw, DiskCacheWorker.mpXWantstodraw, DualLinkNode.playerX2AreOfferingDraw, QuickChatMenu.playerYouX2AreOfferingDraw, (byte) 61, this.gameModel.field_x, StrongCacheEntry.playerListAreOfferingDraw, ae.mpYouofferdraw);
                  if (var5_ref_String != null) {
                    HighscoresScreen.$cfr$intArgs$a$c9c3307e6488(119, false, 1, var5_ref_String);
                  }
                } else {
                  var5_ref_String = this.formatPlayerGroupMessage(UiComponentNode.playerYouFirstListAreOfferingRematch, ModelInstance.mpXOffersrematch, hp.playerX2AreOfferingRematch, Ball.playerYouX2AreOfferingRematch, (byte) 61, this.gameModel.field_b, ee.playerListAreOfferingRematch, TickClock.mpYouofferrematch);
                  if (var5_ref_String != null) {
                    HighscoresScreen.$cfr$intArgs$a$c9c3307e6488(122, false, 1, var5_ref_String);
                  }
                }
                if (0 == var4.phase) {
                  if (!this.isLocalPlayersTurn(-1)) {
                    fieldTemp$2 = (1 + mk.field_b) % 4;
                    mk.field_b = (1 + mk.field_b) % 4;
                    var6 = fieldTemp$2;
                    if (var6 == 0 &&
                      var9 == 0) {
                      HighscoresScreen.$cfr$intArgs$a$c9c3307e6488(119, true, 1, sm.tickerHintZoom);
                      break regionExit2;
                    } else {
                      if (1 != var6) {
                        break regionExit2;
                      }
                    }
                    HighscoresScreen.$cfr$intArgs$a$c9c3307e6488(119, true, 1, pm.tickerHintRotate);
                    if (var9 == 0) {
                      break regionExit2;
                    }
                  }
                  if (this.shotModeActive) {
                    regionExit3: {
                      regionExit4: {
                        regionExit5: {
                          regionExit6: {
                            fieldTemp$3 = (mk.field_b + 1) % 5;
                            mk.field_b = (mk.field_b + 1) % 5;
                            var6 = fieldTemp$3;
                            if (var6 != 0 ||
                              var9 != 0) {
                              switch (var6) {
                                case 1:
                                  break regionExit6;
                                case 2:
                                  break regionExit5;
                                case 3:
                                  break regionExit4;
                                default:
                                  break regionExit2;
                                case 4:
                                  if (var9 == 0) {
                                    break regionExit3;
                                  }
                                  break;
                              }
                            }
                            HighscoresScreen.$cfr$intArgs$a$c9c3307e6488(118, true, 1, tickerHintLeaveShotMode);
                            if (var9 == 0) {
                              break regionExit2;
                            }
                          }
                          HighscoresScreen.$cfr$intArgs$a$c9c3307e6488(126, true, 1, FullscreenErrorDialog.tickerHintSetPower);
                          if (var9 == 0) {
                            break regionExit2;
                          }
                        }
                        HighscoresScreen.$cfr$intArgs$a$c9c3307e6488(119, true, 1, QuickChatCategoryDefinition.tickerHintShoot);
                        if (var9 == 0) {
                          break regionExit2;
                        }
                      }
                      HighscoresScreen.$cfr$intArgs$a$c9c3307e6488(117, true, 1, HighscoresScreen.tickerHintShotModeAim);
                      if (var9 == 0) {
                        break regionExit2;
                      }
                    }
                    if (var4.ballInHandMode == 0) {
                      break regionExit2;
                    }
                    HighscoresScreen.$cfr$intArgs$a$c9c3307e6488(119, true, 1, CachedArchiveSource.tickerHintMoveCueball);
                    if (var9 == 0) {
                      break regionExit2;
                    }
                  }
                  boolean decompiledFrameRemainder2 = true;
                  boolean decompiledFrameRemainder1 = true;
                  fieldTemp$4 = (1 + mk.field_b) % 4;
                  mk.field_b = (1 + mk.field_b) % 4;
                  var6 = fieldTemp$4;
                  if (var6 == 0 &&
                    var9 == 0) {
                    HighscoresScreen.$cfr$intArgs$a$c9c3307e6488(127, true, 1, ah.tickerHintEnterShotMode);
                    break regionExit2;
                  } else if (var6 != 1 ||
                    var9 != 0) {
                    decompiledFrameRemainder1 = (var6 != 2);
                    if ((decompiledFrameRemainder1) &&
                      (decompiledFrameRemainder2 = (var6 != 3))) {
                      break regionExit2;
                    }
                  }
                  if ((decompiledFrameRemainder2) &&
                    (decompiledFrameRemainder1)) {
                    HighscoresScreen.$cfr$intArgs$a$c9c3307e6488(117, true, 1, sm.tickerHintZoom);
                    break regionExit2;
                  }
                  if (decompiledFrameRemainder2) {
                    HighscoresScreen.$cfr$intArgs$a$c9c3307e6488(127, true, 1, pm.tickerHintRotate);
                    if (var9 == 0) {
                      break regionExit2;
                    }
                  }
                  HighscoresScreen.$cfr$intArgs$a$c9c3307e6488(119, true, 1, sa.tickerHintAim);
                }
              }
            }
            ie.a(false, (Js5Transport.field_q.field_y >> 1) + ArrayWidgetGroup.field_M, 300);
            stackIn_396_0 = -1;
          }
          if (stackIn_396_0 <= ~this.clockTicks) {
            stackIn_400_0 = 0;
          } else {
            stackIn_400_0 = this.clockTicks;
          }
          var5 = stackIn_400_0;
          if (0 != (f.field_f & this.modeFlags) &&
            0 <= this.clockTicks &&
            !this.gameModel.field_o) {
            this.clockTicks = this.clockTicks + 1;
          }
          boolean decompiledFrameRemainder5 = true;
          boolean decompiledFrameRemainder0 = true;
          var6 = var4.phase;
          if (var6 == 0 &&
            var9 == 0) {
            this.tickClockAndSendCueAim(var4, -17601);
            decompiledFrameRemainder5 = false;
          } else if (var6 != 1 ||
            var9 != 0) {
            decompiledFrameRemainder0 = (2 != var6);
            decompiledFrameRemainder5 = !(decompiledFrameRemainder0);
          }
          if ((decompiledFrameRemainder5) &&
            (decompiledFrameRemainder0)) {
            this.stepShotAnimation(-65, var4);
            decompiledFrameRemainder5 = false;
          }
          if ((decompiledFrameRemainder5) && (0 != (TutorialController.field_c & this.modeFlags) &&
            var4.isAnyChoicePending(116) &&
            1 < this.clockTicks)) {
            this.clockTicks = this.clockTicks - 1;
          }
          if (this.shotModeActive) {
            this.cameraGoal.focusOnCueBall(this, 1);
            if (this.cuePower != 0 &&
              this.mouseDragMode != 5 &&
              this.mouseDragMode != 4) {
              if (this.gameModel.currentShot(112).phase == 0) {
                this.setCuePower(this.cueAim.field_n + (int)(0.5 + 192.0 * Math.sin(3.141592653589793 * (double)this.powerPulseTick * 2.0 / 150.0)), true);
              }
              if (0L != (LinkButtonPainter.field_i & 1024L)) {
                this.powerPulseTick = 0;
                if (var9 != 0) {
                  this.powerPulseTick = this.powerPulseTick + 1;
                }
              } else {
                this.powerPulseTick = this.powerPulseTick + 1;
              }
            }
          }
          if (this.idleOrbitStep != -1) {
            fieldTemp$5 = this.idleOrbitStep + 1;
            this.idleOrbitStep = this.idleOrbitStep + 1;
            if (400 < fieldTemp$5) {
              this.idleOrbitStep = 0;
            }
            this.cameraGoal.setOrbit((double)this.idleOrbitStep * 3.141592653589793 * 2.0 / 400.0, 2.356194490192345, (double)this.idleOrbitDistance, -6861);
            this.viewMatrixDirty = true;
          }
          if (this.camera.easeTowards(this.cameraGoal, (byte) -78)) {
            this.viewMatrixDirty = true;
          }
          if (this.clockTicks > 0) {
            stackIn_479_0 = this.clockTicks;
          } else {
            stackIn_479_0 = 0;
          }
          var6 = stackIn_479_0;
          if (0 < this.introDelayTicks) {
            this.introDelayTicks = this.introDelayTicks - 1;
            if (this.introDelayTicks == 0) {
              if (0 != (TutorialController.field_c & this.modeFlags)) {
                JaggrabDownloader.field_j.writeCipheredOpcode(false, 73);
                if (var9 != 0) {
                  this.beginTurn((byte) -101);
                  this.introDelayTicks = -1;
                }
              } else {
                this.beginTurn((byte) -101);
                this.introDelayTicks = -1;
              }
            }
          }
          var7 = -1;
          if ((this.modeFlags & sk.field_d) != 0) {
            var7 = pm.a(-27011);
          }
          if (var7 == -1) {
            var7 = this.getHoveredIndicator(1163);
            if (q.field_b.pressedButton != 0) {
              this.highlightCurrentGroupBalls((byte) 75);
            }
          }
          if (0 != (sk.field_d & this.modeFlags) &&
            -1 == var7) {
            this.tutorial.currentStep.buildOutline(-62);
            if (this.tutorial.currentStep.field_q != null) {
              var7 = 256 | this.tutorial.currentStep.field_q.field_p;
            }
          }
          LongAndTextLoginPayload.field_l = 12;
          SocialListEntry.field_Vb = 12;
          PauseMenuScreen.g(0, var7);
          if (q.field_b.enabled &&
            q.field_b.activeInside &&
            -1 != TextureCache.a(104)) {
            this.highlightCurrentGroupBalls((byte) -108);
          }
          ea.field_p = ea.field_p + 1;
          ea.field_p = ea.field_p & 31;
          this.updateRackBalls((byte) 127);
          LobbyGame.field_gc.updatePottedBalls(10, this);
          dq.field_a.updateAnimation(-56);
          NetworkGameClient.a((byte) -73, this);
          this.updateStatusBarSlide(87);
          if (SocialListEntry.field_Tb % 100 == 0) {
            this.d(0);
          }
          wc.b(127);
          if (var6 > var5) {
            dk.field_f = dk.field_f + (-var6 + var5);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var4_ref), "uf.AD(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void readGameStateSync(PacketBuffer param0, boolean param1) {
        RuntimeException runtimeException = null;
        PacketBuffer var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1) {
            return;
          }
          var3 = param0;
          this.clockTicks = var3.readUnsignedShort(-1034);
          this.gameModel.readShotFromPacket(2, param0);
          this.beginTurn((byte) -43);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_7_0 = runtimeException;
          stackIn_7_1 = new StringBuilder().append("uf.GB(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void playShotOutcomeSound(ShotRecord param0, byte param1) {
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if ((param0.endResolution & ag.field_e) == 0) {
            if (0 != (param0.endResolution & Quaternion.field_e)) {
              LobbyGame.field_gc.playTableSound(11, 128, (byte) 96, 128);
            }
          } else {
            LobbyGame.field_gc.playTableSound(12, 128, (byte) -123, 128);
          }
          if (param1 != -28) {
            this.camera = (Camera) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("uf.NA(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
    }

    final void readMovePacket(PacketBuffer param0, int param1) {
        try {
          RuntimeException stackIn_45_0 = null;
          StringBuilder stackIn_45_1 = null;
          String stackIn_46_2 = null;
          RuntimeException decompiledCaughtException = null;
          ShotRecord var3 = null;
          RuntimeException var3_ref = null;
          int var4 = 0;
          int var5 = 0;
          var5 = Pool.field_O;
          try {
            var3 = this.gameModel.currentShot(62);
            if (param1 != 0) {
              this.gameModel = (PoolGameModel) null;
            }
            regionExit1: {
              regionExit2: {
                var4 = var3.readMove((byte) -28, param0);
                switch (var4) {
                  case 1:
                    break regionExit2;
                  default:
                    return;
                  case 2:
                    if (var5 == 0) {
                      break regionExit1;
                    }
                  case 0:
                    if (1 > var3.phase) {
                      if (var3.power <= 0) {
                        this.gameModel.snapshotFinishedShot((byte) 85);
                        if (var5 != 0) {
                          this.beginShotAnimation((byte) 17);
                        }
                      } else {
                        this.beginShotAnimation((byte) 17);
                      }
                    }
                    this.shotConfirmedByServer = true;
                    if (var5 == 0) {
                      return;
                    }
                    break;
                }
              }
              GrowableIntList.reportClientError(new Throwable(), "Wrong shot!", -8555);
              dn.c(-115);
              if (var5 == 0) {
                return;
              }
            }
            if (var3.phase == 1) {
              ProgressBarWidget.a(true, 0, "Just too late!", (String) null);
            }
            if (var3.power <= 0) {
              this.gameModel.snapshotFinishedShot((byte) -114);
              if (var5 == 0) {
                return;
              }
            }
            this.beginShotAnimation((byte) 17);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3_ref = decompiledCaughtException;
            stackIn_45_0 = var3_ref;
            stackIn_45_1 = new StringBuilder().append("uf.BB(");
            if (param0 == null) {
              stackIn_46_2 = "null";
            } else {
              stackIn_46_2 = "{...}";
            }
            throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_45_0), ((StringBuilder) (Object) stackIn_45_1).append(stackIn_46_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void updateHoveredBall(boolean param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = this.pickBallAtScreenPoint(param0, true, wn.field_i, DebouncedValidationProvider.field_f);
          if (this.mouseButtonHeld &&
            cd.field_b == 1 &&
            this.hoveredBallIndex != var2_int) {
            this.mouseButtonHeld = false;
          }
          this.hoveredBallIndex = var2_int;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "uf.JE(" + param0 + ')');
        }
    }

    private final void sendEndShotChecksum(ShotRecord param0, int param1) {
        PacketBuffer stackIn_13_0 = null;
        boolean stackIn_13_1 = false;
        int stackIn_14_2 = 0;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        PacketBuffer var3 = null;
        RuntimeException var3_ref = null;
        PoolGameModel var4 = null;
        PacketBuffer var5 = null;
        int var6 = 0;
        int var6Lifetime1;
        try {
          this.postShotMessages(param0, (byte) 93);
          var3 = new PacketBuffer(this.gameModel.a(-1) + 8);
          var3.writeInt(true, f.field_g);
          var4 = this.gameModel;
          var5 = var3;
          var5.writeByte(var4.balls.length, false);
          for (var6 = 0; var4.balls.length > var6; var6++) {
            var4.balls[var6].writeState(0, var5);
          }
          if (param1 >= -124) {
            return;
          }
          for (var6Lifetime1 = 0; var6Lifetime1 < var4.pockets.length; var6Lifetime1++) {
            var4.pockets[var6Lifetime1].write(var5, 0);
          }
          stackIn_13_0 = var3;
          stackIn_13_1 = true;
          if (Ball.field_B != null) {
            stackIn_14_2 = Ball.field_B.length;
          } else {
            stackIn_14_2 = 0;
          }
          ((PacketBuffer) (Object) stackIn_13_0).writeInt(stackIn_13_1, stackIn_14_2);
          param0.field_x = ii.crc64(var3.payload, var3.position, 0, 154302664);
          if ((this.modeFlags & TutorialController.field_c) == 0 &&
            this.gameModel.field_q != -1) {
            this.clockTicks = wn.field_f[this.gameModel.field_q];
          }
          this.setCuePower((int) param0.power, true);
          if ((this.modeFlags & TutorialController.field_c) == 0) {
            this.handleShotFinished(param0, 1);
          } else {
            JaggrabDownloader.field_j.writeCipheredOpcode(false, 69);
            JaggrabDownloader.field_j.writeLong(param0.field_x, (byte) -127);
          }
          MouseWheelInput.field_c.field_g = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_29_0 = var3_ref;
          stackIn_29_1 = new StringBuilder().append("uf.DD(");
          if (param0 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void initGameModel(String[] param0, int param1, int param2, int param3) {
        int var6 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        try {
          hp.field_c = ek.a(120);
          var5_int = -61 / ((-59 - param2) / 38);
          this.gameModel = new PoolGameModel(param3, param1, param0, -1);
          this.playerNameWidths = new int[this.gameModel.field_h.length];
          this.playerNameCache = new String[this.gameModel.field_h.length];
          this.playerCueAims = new CueAim[param0.length];
          for (var6 = 0; this.playerCueAims.length > var6; var6++) {
            this.playerCueAims[var6] = new CueAim();
          }
          this.layoutBallRack(4476);
          if (this.cueAim == null) {
            this.cueAim = this.playerCueAims[0];
          }
          if (-1 != this.gameModel.field_q) {
            this.clockTicks = wn.field_f[this.gameModel.field_q];
          }
          GzipDecoder.field_h = false;
          if (0 != (f.field_f & this.modeFlags)) {
            this.clockTicks = -1;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_19_0 = var5;
          stackIn_19_1 = new StringBuilder().append("uf.QD(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final boolean zoomCameraWithWheel(byte param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        double var3 = 0.0;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = -106 % ((param0 + 69) / 46);
          if (!this.checkTutorialAction(1, 1, false)) {
            return false;
          }
          this.idleOrbitStep = -1;
          var3 = Math.max(12.0, this.camera.getDistance(8) * ((double)wp.field_d / 32.0 + 1.0));
          this.camera.setDistance(true, var3);
          this.cameraGoal.setDistance(true, var3);
          this.viewMatrixDirty = true;
          this.cameraPresetIndex = -1;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var2), "uf.GA(" + param0 + ')');
        }
    }

    private final void drawBallRack(int param0) {
        int var2_int = 0;
        RuntimeException decompiledCaughtException = null;
        Object var2 = null;
        int var3 = 0;
        Ball var4 = null;
        int var3Lifetime1;
        try {
          SoftwareRasterizer.saveClip(TutorialStep.field_w);
          SoftwareRasterizer.setClip(t.field_e + DebouncedValidationProvider.field_b[3].field_z, (fl.field_q.screenY >> 1) - 240 + this.rackTop - 16, t.field_e + DebouncedValidationProvider.field_b[3].field_z + 18, -240 - (-(fl.field_q.screenY >> 1) - 16) + this.rackBottom);
          TriangleRasterizer.useRasterClip();
          TriangleRasterizer.setProjectionCenter(320 + t.field_e, fl.field_q.screenY >> 1);
          for (var2_int = 0; this.rackBallCount > var2_int; var2_int++) {
            var3 = this.rackBallIndices[var2_int];
            var4 = this.gameModel.balls[var3];
            if (var4.transformDirty) {
              var4.updateRenderTransform(param0 ^ 34);
              dq.field_a.buildBallModel(false, var4.renderTransform, var3);
            }
            dq.field_a.drawBallAndShadow(param0 - 1912602401, var3, var4.renderTransform, sa.field_m, false);
          }
          if (param0 != 32) {
            this.cueAim = (CueAim) null;
          }
          SoftwareRasterizer.restoreClip(TutorialStep.field_w);
          TriangleRasterizer.useRasterClip();
          TriangleRasterizer.setProjectionCenter(320, 240);
          nj.drawNineSlice(MouseWheelInput.field_a, (byte) -82, this.rackWidth, t.field_e, -240 + (fl.field_q.screenY >> 1) - 8 + this.rackTop - MouseWheelInput.field_a[1].field_y, 16 + (this.rackHeight - (-MouseWheelInput.field_a[1].field_y - MouseWheelInput.field_a[7].field_y)));
          if (0L != (LinkButtonPainter.field_i & 268435456L)) {
            var2 = null;
            for (var3Lifetime1 = 0; this.rackBallCount > var3Lifetime1; var3Lifetime1++) {
              if (null != var2) {
                var2 = (String) (var2) + ", " + this.rackBallIndices[var3Lifetime1];
              } else {
                var2 = "rack: " + this.rackBallIndices[var3Lifetime1];
              }
            }
            if (var2 == null) {
              return;
            }
            sa.field_h.d((String) (var2), 40, 400, 13421772, 3355443);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) (var2), "uf.HA(" + param0 + ')');
        }
    }

    final void readEndResolutionPacket(int param0, PacketBuffer param1) {
        ShotRecord var3 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          if (param0 != 4096) {
            this.updatePlayerInfoButtonSprites(false);
          }
          var3 = this.gameModel.currentShot(param0 - 4029);
          var3.readChoices((byte) 111, param1);
          if (!var3.isAnyChoicePending(param0 - 3985)) {
            this.gameModel.beginNextShot((byte) 78);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_10_0 = var3_ref;
          stackIn_10_1 = new StringBuilder().append("uf.JB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final void beginTurn(byte param0) {
        GzipDecoder.field_h = false;
        this.selectCurrentPlayerAim(120);
        this.alignCueWithCamera((byte) -37);
        if (param0 > -23) {
          return;
        }
        try {
          this.announceTurnStatus(-14034);
          this.highlightCurrentGroupBalls((byte) -99);
          if (dq.field_a instanceof HalloweenBallSkin) {
            ((HalloweenBallSkin) (dq.field_a)).a(this.gameModel.currentShot(108).field_I, (byte) -37, this.gameModel.balls);
          }
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "uf.P(" + param0 + ')');
        }
    }

    private final int[] findValidCueAim(int param0, int param1, int param2, int param3, byte param4, int param5) {
        Object stackIn_23_0 = null;
        int[] stackIn_26_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        try {
          if (param4 != 95) {
            this.applyCameraPreset(false, 33, 64);
          }
          do {
            if (this.gameModel.isCuePathClear(param0, param5, param2, 359, param3, param1)) {
              stackIn_26_0 = new int[]{param2, param1, param0};
              return stackIn_26_0;
            }
            var7_int = 1;
            if (param0 < 96) {
              var7_int = 0;
              param0++;
            }
            while (param0 * param0 + param1 * param1 > 9216) {
              if (param1 > 0) {
                var7_int = 0;
                param1--;
                continue;
              }
              if (param1 < 0) {
                param1++;
                var7_int = 0;
                continue;
              }
              var7_int = 1;
              break;
            }
            if (var7_int != 0 &&
              param2 < 768) {
              var7_int = 0;
              param2++;
            }
          } while (var7_int == 0);
          stackIn_23_0 = null;
          return (int[]) (stackIn_23_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var7), "uf.LD(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    private final void updateStrikePointFromMouse(int param0, int param1, int param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        int var5 = 0;
        double var6 = 0.0;
        double var8 = 0.0;
        double var10 = 0.0;
        double var12 = 0.0;
        double var14 = 0.0;
        double var16 = 0.0;
        double var18 = 0.0;
        double var20 = 0.0;
        double var22 = 0.0;
        double var24 = 0.0;
        double var26 = 0.0;
        double var28 = 0.0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.gameModel.currentShot(31).phase != 0) {
            return;
          }
          this.lastHoverMouseX = param2;
          this.lastHoverMouseY = param1;
          var4_int = param2 - 320;
          var5 = -240 + param1;
          var6 = this.camera.getDistance(8);
          var8 = -var6 * ((double)this.viewMatrix[9] * 0.0000152587890625) + 0.0000152587890625 * (double)this.viewMatrix[3] * (double)var4_int * -var6 / 512.0 + (double)var5 * ((double)this.viewMatrix[6] * 0.0000152587890625) * -var6 / 512.0;
          var10 = -var6 * (0.0000152587890625 * (double)this.viewMatrix[10]) + -var6 * (0.0000152587890625 * (double)this.viewMatrix[4] * (double)var4_int) / 512.0 + -var6 * (0.0000152587890625 * (double)this.viewMatrix[7] * (double)var5) / 512.0;
          if (param0 > -89) {
            return;
          }
          var12 = (double)this.viewMatrix[8] * 0.0000152587890625 * (double)var5 * -var6 / 512.0 + (-var6 * (0.0000152587890625 * (double)this.viewMatrix[11]) + (double)var4_int * ((double)this.viewMatrix[5] * 0.0000152587890625) * -var6 / 512.0);
          var14 = (double)(-((float)this.gameModel.balls[0].positionX / 8192.0f * (float)MouseWheelInput.field_c.field_l[9] + (float)MouseWheelInput.field_c.field_l[10] * ((float)this.gameModel.balls[0].positionY / 8192.0f) + (float)MouseWheelInput.field_c.field_l[11] * ((float)this.gameModel.balls[0].positionZ / 8192.0f))) * 0.0000152587890625;
          var16 = -((double)(MouseWheelInput.field_c.field_l[11] * this.viewMatrix[2]) * 0.0000152587890625 + (0.0000152587890625 * (double)(this.viewMatrix[0] * MouseWheelInput.field_c.field_l[9]) + var14 + 0.0000152587890625 * (double)(this.viewMatrix[1] * MouseWheelInput.field_c.field_l[10]))) / (0.0000152587890625 * ((double)MouseWheelInput.field_c.field_l[10] * var10 + (double)MouseWheelInput.field_c.field_l[9] * var8 + (double)MouseWheelInput.field_c.field_l[11] * var12));
          var18 = var8 * var16 + (double)this.viewMatrix[0];
          var20 = var10 * var16 + (double)this.viewMatrix[1];
          var22 = (double)this.viewMatrix[2] + var12 * var16;
          var18 = var18 - (double)this.gameModel.balls[0].positionX / 8192.0;
          var20 = -((double)this.gameModel.balls[0].positionY / 8192.0) + var20;
          var22 = -((double)this.gameModel.balls[0].positionZ / 8192.0) + var22;
          var24 = var22 * ((double)MouseWheelInput.field_c.field_l[5] / 65536.0) + (var20 * ((double)MouseWheelInput.field_c.field_l[4] / 65536.0) + var18 * ((double)MouseWheelInput.field_c.field_l[3] / 65536.0));
          var26 = var22 * ((double)MouseWheelInput.field_c.field_l[8] / 65536.0) + ((double)MouseWheelInput.field_c.field_l[7] / 65536.0 * var20 + var18 * ((double)MouseWheelInput.field_c.field_l[6] / 65536.0));
          var24 = var24 * 2.0;
          var26 = var26 * 2.0;
          var28 = var26 * var26 + var24 * var24;
          if (var28 < 16384.0) {
            if (9216.0 < var28) {
              var26 = 96.0 * var26 / 128.0;
              var24 = 96.0 * var24 / 128.0;
            }
            if (this.setStrikePoint(false, (int)(0.5 + var26), (int)(0.5 + var24))) {
              MouseWheelInput.field_c.field_g = true;
              hh.field_c = true;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "uf.I(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void applyCameraPreset(boolean param0, int param1, int param2) {
        double[][] var4 = null;
        double[][] stackIn_10_0 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        try {
          this.cameraPresetIndex = param2;
          if (param1 <= 1) {
            this.rackBallCount = -73;
          }
          if (un.field_b &&
            0 != (TutorialController.field_c & this.modeFlags)) {
            stackIn_10_0 = f.field_a;
          } else {
            stackIn_10_0 = f.field_c;
          }
          var4 = stackIn_10_0;
          this.idleOrbitStep = -1;
          this.cameraGoal.setFromArray(var4[param2], (byte) -55);
          if (param0) {
            this.camera.setFromArray(var4[param2], (byte) -106);
          }
          this.viewMatrixDirty = true;
          this.tryLeaveShotMode(-69);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var4_ref), "uf.CD(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void setAimPower(boolean param0, int param1) {
        RuntimeException decompiledCaughtException = null;
        int[] var3 = null;
        RuntimeException var3_ref = null;
        try {
          if (param1 < 0) {
            param1 = 0;
          }
          if (param1 > 4096) {
            param1 = 4096;
          }
          if (!param0) {
            return;
          }
          if (~param1 != ~this.cueAim.field_n) {
            var3 = this.findValidCueAim(this.cueAim.field_e, this.cueAim.field_d, this.cueAim.polarAngle, param1, (byte) 95, this.cueAim.azimuth);
            if (var3 == null) {
              this.raiseCueBlockedWarning(97);
            } else {
              this.cueAim.field_n = param1;
              LobbyGame.field_gc.updateHumPitch(99, this.cueAim.field_n);
              this.cueAim.field_e = var3[2];
              this.cueAim.field_d = var3[1];
              this.cueAim.polarAngle = var3[0];
              MouseWheelInput.field_c.field_g = true;
              hh.field_c = true;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var3_ref), "uf.UD(" + param0 + ',' + param1 + ')');
        }
    }

    private final void resetCameraToDefaultPreset(int param0) {
        Camera stackIn_4_0 = null;
        double[][] stackIn_7_1 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          stackIn_4_0 = this.cameraGoal;
          if (un.field_b &&
            0 != (this.modeFlags & TutorialController.field_c)) {
            stackIn_7_1 = f.field_a;
          } else {
            stackIn_7_1 = f.field_c;
          }
          ((Camera) (Object) stackIn_4_0).setFromArray(stackIn_7_1[0], (byte) -117);
          this.viewMatrixDirty = true;
          this.cameraPresetIndex = param0;
          this.tryLeaveShotMode(param0 - 96);
          this.idleOrbitStep = -1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var2), "uf.HD(" + param0 + ')');
        }
    }

    final void drawHud(boolean param0, int param1) {
        int var11 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        String[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var3_intLifetime1;
        int var4Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        try {
          if (this.viewMatrixDirty) {
            this.camera.writeViewMatrix(this.viewMatrix, true);
            LobbyGame.field_gc.setViewMatrix((byte) -123, this.viewMatrix);
            this.viewMatrixDirty = false;
            this.lastHoverMouseX = -1;
            this.lastHoverMouseY = -1;
          }
          if (param1 != -29423) {
            return;
          }
          LobbyGame.field_gc.drawScene((byte) -55, this);
          if (this.gameModel.currentShot(param1 + 29476).phase == 0 &&
            0 == this.hoveredBallIndex) {
            this.drawStrikePointMarker(false);
          }
          if (0L == (131072L & LinkButtonPainter.field_i)) {
            this.drawStatusBar(true, param0);
          }
          this.drawBallTooltip(-9449);
          if ((LinkButtonPainter.field_i & 4294967296L) == 0L) {
            LoginPayload.a((byte) 121);
          }
          UsernameAvailabilityValidator.b(true);
          if (this.gameModel.playerCount > 1) {
            boolean decompiledFrameRemainder0 = true;
            var3_int = 60;
            var4 = 55;
            if (!RasterBuffer.field_i && (!(wn.field_i >= 0) ||
              !((SoftwareRasterizer.width >> 1) > wn.field_i) ||
              !(0 <= DebouncedValidationProvider.field_f) ||
              !(DebouncedValidationProvider.field_f < var4))) {
              if (!(0 >= ChatMessageLine.field_u)) {
                ChatMessageLine.field_u = ChatMessageLine.field_u - 16;
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              if (ChatMessageLine.field_u < 256) {
                ChatMessageLine.field_u = ChatMessageLine.field_u + 16;
              }
            }
            var5 = this.buildPlayerStatusLines(true);
            var6 = 0;
            for (var7 = 0; var7 < var5.length; var7++) {
              var8 = sa.field_h.b(var5[var7]);
              if (var8 > var6) {
                var6 = var8;
              }
            }
            var7Lifetime1 = ScrollPane.field_Ob;
            var8Lifetime1 = Js5Transport.field_q.field_A + ArrayWidgetGroup.field_M + 2;
            var9 = 16 + var6 - (-DateInputWidget.field_Q[4].field_z - DateInputWidget.field_Q[6].field_z);
            var10 = 4 + DateInputWidget.field_Q[1].field_A + (var5.length * sa.field_h.baselineHeight + DateInputWidget.field_Q[7].field_A);
            var4Lifetime1 = var8Lifetime1 + DateInputWidget.field_Q[1].field_A + sa.field_h.baselineHeight;
            SoftwareRasterizer.fillRoundedRectangleBlended(var7Lifetime1, var8Lifetime1, var9, var10, 8, 4144959, 192 * ChatMessageLine.field_u >> 8);
            HuffmanCodec.drawNineSlice(114, var8Lifetime1, ChatMessageLine.field_u, var7Lifetime1, var9, var10, DateInputWidget.field_Q);
            for (var11 = 0; var5.length > var11; var11++) {
              sa.field_h.drawLeftAlpha(var5[var11], var3_int, var4Lifetime1, 15658734, 2039583, ChatMessageLine.field_u);
              var4Lifetime1 = var4Lifetime1 + sa.field_h.baselineHeight;
            }
          }
          if (0 != (this.modeFlags & sk.field_d)) {
            this.tutorial.draw(param1 + 29451);
          }
          if (param0) {
            var3_intLifetime1 = TextureCache.a(104);
            if (var3_intLifetime1 >= 0) {
              if (0 != (256 & var3_intLifetime1)) {
                if ((this.modeFlags & sk.field_d) != 0 &&
                  this.tutorial.currentStep.field_q != null) {
                  this.tutorial.currentStep.drawOutline(15658734, 128, 9750);
                }
                WidgetStyleLayer.a(4144959, 15658734, param1 + 29427, sa.field_h, LoginPayload.field_e[var3_intLifetime1 - 256]);
              } else {
                WidgetStyleLayer.a(4144959, 15658734, 4, sa.field_h, DraggableWidget.field_S[var3_intLifetime1]);
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var3), "uf.BD(" + param0 + ',' + param1 + ')');
        }
    }

    private final void startNewRack(byte param0) {
        try {
          this.gameModel.addOrUpdateShot(ga.nextRandomInt(512, true, ea.field_r), -1, 0, 0, 19063);
          if (param0 >= -67) {
            this.alignCueWithCamera((byte) 34);
          }
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "uf.TA(" + param0 + ')');
        }
    }

    private final void adjustPower(byte param0, int param1) {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 <= 38) {
            this.rerackBalls(48);
          }
          if (0 != this.gameModel.currentShot(117).phase) {
            return;
          }
          if (this.checkTutorialAction(1, 5, false)) {
            this.setAimPower(true, param1 + this.cueAim.field_n);
            this.setCuePower(param1 + this.cuePower, true);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "uf.HE(" + param0 + ',' + param1 + ')');
        }
    }

    final void leaveShotMode(boolean param0, byte param1) {
        try {
          AlignedIconLabel.c(false);
          this.shotModeActive = false;
          this.cuePower = this.cueAim.field_n;
          LobbyGame.field_gc.a((byte) 124, param0, 9);
          if (param1 >= -100) {
            this.cueSyncTicks = -118;
          }
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "uf.JA(" + param0 + ',' + param1 + ')');
        }
    }

    private final int powerBarLeft(int param0) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -16439) {
            this.sendEndShotChecksum((ShotRecord) null, 120);
          }
          stackIn_4_0 = SoftwareRasterizer.width - ((65536 - hc.cosine(2047, this.shotModeFade)) * (1 + il.field_f.field_w) >> 17);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var2), "uf.TB(" + param0 + ')');
        }
    }

    private final void beginShotAnimation(byte param0) {
        RuntimeException runtimeException = null;
        ShotRecord var2 = null;
        TableScene stackIn_3_0;
        int stackIn_3_1;
        int[] stackIn_3_2;
        int stackIn_3_3;
        int[] stackIn_3_4;
        int stackIn_4_5 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          var2 = this.gameModel.currentShot(69);
          hh.field_c = true;
          var2.phase = 1;
          stackIn_3_0 = LobbyGame.field_gc;
          stackIn_3_1 = 1336449640;
          stackIn_3_2 = this.viewMatrix;
          stackIn_3_3 = 32 + 192 * this.cueAim.field_n / 4096;
          stackIn_3_4 = MouseWheelInput.field_c.field_l;
          if (this.cueAim.field_n > 2048) {
            stackIn_4_5 = 7;
          } else {
            stackIn_4_5 = 8;
          }
          ((TableScene) (Object) stackIn_3_0).a(stackIn_3_1, stackIn_3_2, stackIn_3_3, stackIn_3_4, stackIn_4_5);
          this.strikeAnimationFrame = -37;
          this.leaveShotMode(true, (byte) -114);
          if (!this.isLocalPlayersTurn(-1)) {
            this.snapCameraToPreset(-24070);
          }
          vm.field_f = 2147483647 & vm.field_f + 1048576;
          if (param0 != 17) {
            this.fastForwardTableScene(50);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "uf.RB(" + param0 + ')');
        }
    }

    final static void loadInterfaceAssets(int param0, boolean param1, ResourceArchive param2, ResourceArchive param3, ResourceArchive param4) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (param0 != -11934) {
            PoolMatchController.loadInterfaceAssets(-105, true, (ResourceArchive) null, (ResourceArchive) null, (ResourceArchive) null);
          }
          TextInputValidator.field_j = GzipDecoder.a(-71, "");
          TextInputValidator.field_j.a(false, (byte) 120);
          PoolMatchController.loadCommonUiSprites(param3, -22764, param2, param4);
          MarkerSliderPainter.b((byte) -124);
          TimeTrialSelectScreen.field_I = IntrusiveDequeCursor.field_c;
          TabbedPane.field_Lb = IntrusiveDequeCursor.field_c;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("uf.H(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param4 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    private final int pickBallAtScreenPoint(boolean param0, boolean param1, int param2, int param3) {
        int var26 = 0;
        int var5_int = 0;
        RuntimeException var5 = null;
        int[] var6 = null;
        double var7 = 0.0;
        double var9 = 0.0;
        double var11 = 0.0;
        double var13 = 0.0;
        double var15 = 0.0;
        double var17 = 0.0;
        double var19 = 0.0;
        double var21 = 0.0;
        double var23 = 0.0;
        int var25 = 0;
        int var27 = 0;
        int[] stackIn_12_0 = null;
        double stackIn_16_0 = 0.0;
        double stackIn_23_0 = 0.0;
        int stackIn_28_0 = 0;
        int stackIn_36_0 = 0;
        RuntimeException decompiledCaughtException = null;
        Ball var28 = null;
        double var29 = 0.0;
        double var31 = 0.0;
        double var33 = 0.0;
        double var35 = 0.0;
        double var37 = 0.0;
        double var39 = 0.0;
        double var41 = 0.0;
        double var43 = 0.0;
        int[] var6Lifetime1;
        int[] var6Lifetime2;
        int var5_intLifetime1;
        try {
          param2 -= 320;
          var5_int = -240 + param3;
          var6 = this.viewMatrix;
          var7 = (double)((var6[9] << 9) + param2 * var6[3] + var6[6] * var5_int);
          var9 = (double)((var6[10] << 9) + var6[4] * param2 + var5_int * var6[7]);
          var11 = (double)(var6[8] * var5_int + (var6[5] * param2 + (var6[11] << 9)));
          var13 = Math.sqrt(var9 * var9 + var7 * var7 + var11 * var11);
          var11 = var11 / var13;
          var5_intLifetime1 = -(fl.field_q.screenY >> 1) + param3;
          var6Lifetime1 = sa.field_m;
          var9 = var9 / var13;
          var7 = var7 / var13;
          var15 = (double)((var6Lifetime1[9] << 9) + var6Lifetime1[3] * param2 + var6Lifetime1[6] * var5_intLifetime1);
          var17 = (double)(var5_intLifetime1 * var6Lifetime1[7] + (var6Lifetime1[4] * param2 + (var6Lifetime1[10] << 9)));
          var19 = (double)(param2 * var6Lifetime1[5] + ((var6Lifetime1[11] << 9) + var6Lifetime1[8] * var5_intLifetime1));
          var21 = Math.sqrt(var19 * var19 + (var17 * var17 + var15 * var15));
          var15 = var15 / var21;
          var19 = var19 / var21;
          var17 = var17 / var21;
          var23 = -1.0;
          if (param0) {
            field_y = (byte[][]) null;
          }
          var25 = -1;
          for (var26 = 0; LinkButtonPainter.field_f.length > var26; var26++) {
            var27 = LinkButtonPainter.field_f[var26];
            if (var27 < this.gameModel.balls.length) {
              var28 = this.gameModel.balls[var27];
              if (!var28.field_o) {
                stackIn_12_0 = this.viewMatrix;
              } else {
                stackIn_12_0 = sa.field_m;
              }
              var6Lifetime2 = stackIn_12_0;
              var29 = (double)KillerRules.e(-(var28.positionX >> 13) + var6Lifetime2[0], 3);
              var31 = (double)KillerRules.e(var6Lifetime2[1] - (var28.positionY >> 13), 3);
              var33 = (double)KillerRules.e(-(var28.positionZ >> 13) + var6Lifetime2[2], 3);
              var35 = var31 * var17 + var15 * var29 + var19 * var33;
              var37 = var9 * var31 + var7 * var29 + var33 * var11;
              if (var28.field_o) {
                stackIn_16_0 = -var35;
              } else {
                stackIn_16_0 = -var37;
              }
              var39 = stackIn_16_0;
              if (0.0 < var39) {
                var41 = var33 * var33 + (var29 * var29 + var31 * var31);
                if (!var28.field_o) {
                  stackIn_23_0 = var41 + var39 * (var39 + var37 * 2.0);
                } else {
                  stackIn_23_0 = var41 + (var35 * 2.0 + var39) * var39;
                }
                var43 = stackIn_23_0;
                if (param1) {
                  if (!(var43 > 64.0)) {
                    stackIn_28_0 = var27;
                    return stackIn_28_0;
                  }
                } else {
                  if (var25 == -1 ||
                    var43 < var23) {
                    var23 = var43;
                    var25 = var27;
                  }
                }
              }
            }
          }
          stackIn_36_0 = var25;
          return stackIn_36_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var5), "uf.T(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void updateStatusBarSlide(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (param0 < 24) {
            return;
          }
          boolean decompiledSharedTail0 = (!(wb.field_a) ||
            !(ArrayWidgetGroup.field_M < 10));
          if (!decompiledSharedTail0) {
            KillerBallSkin.b(1, (byte) 103);
            decompiledSharedTail0 = (Pool.field_O != 0);
          }
          if ((decompiledSharedTail0) && (!wb.field_a &&
            -Js5Transport.field_q.field_A < ArrayWidgetGroup.field_M)) {
            KillerBallSkin.b(-1, (byte) 69);
          }
          tq.field_q = (sa.field_h.maxAscent + Js5Transport.field_q.field_y >> 1) + ArrayWidgetGroup.field_M;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var2), "uf.IB(" + param0 + ')');
        }
    }

    private final void fireShot(int param0) {
        RuntimeException decompiledCaughtException = null;
        ShotRecord var2 = null;
        RuntimeException var2_ref = null;
        ShotRecord var3 = null;
        CueAim var4 = null;
        CipherPacketBuffer var4_ref = null;
        ShotRecord var3Lifetime1;
        try {
          if (this.gameModel.field_o) {
            return;
          }
          if (0 == this.cuePower) {
            return;
          }
          if (param0 != 1) {
            this.startNewRack((byte) -56);
          }
          if (this.isLocalPlayersTurn(-1) &&
            this.checkTutorialAction(1, 7, false)) {
            var2 = this.gameModel.currentShot(96);
            if (var2.phase >= 1) {
              return;
            }
            this.cueAim.field_n = this.cuePower;
            this.shotConfirmedByServer = false;
            var2.endResolution = IntrusiveNodeHashTable.field_a;
            var3 = var2;
            var4 = this.cueAim;
            var3.aimAngle = (short)((1024 + var4.azimuth) % 2048);
            var3.power = (short)var4.field_n;
            var3.field_D = (byte)var4.field_d;
            var3.elevation = (short)var4.polarAngle;
            var3.field_H = (byte)var4.field_e;
            if ((TutorialController.field_c & this.modeFlags) != 0) {
              this.sendManhandledBall((byte) -118);
              JaggrabDownloader.field_j.writeCipheredOpcode(false, 65);
              var3Lifetime1 = var2;
              var4_ref = JaggrabDownloader.field_j;
              ((PacketBuffer) ((Object) var4_ref)).writeByte(var3Lifetime1.shotNumber, false);
              ((PacketBuffer) ((Object) var4_ref)).writeShort((byte) -81, (int) var3Lifetime1.aimAngle);
              ((PacketBuffer) ((Object) var4_ref)).writeShort((byte) -81, (int) var3Lifetime1.elevation);
              ((PacketBuffer) ((Object) var4_ref)).writeShort((byte) -81, (int) var3Lifetime1.power);
              ((PacketBuffer) ((Object) var4_ref)).writeByte((int) var3Lifetime1.field_D, false);
              ((PacketBuffer) ((Object) var4_ref)).writeByte((int) var3Lifetime1.field_H, false);
            }
            this.gameModel.field_i = null;
            this.beginShotAnimation((byte) 17);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var2_ref), "uf.Q(" + param0 + ')');
        }
    }

    final static void r(byte param0) {
        try {
          PotEvent.a(16, NanoTickClock.getApplet(122));
          if (param0 != -80) {
            field_gb = (wc) null;
          }
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "uf.VA(" + param0 + ')');
        }
    }

    private final void centerCameraOnMovingBalls(int param0) {
        int var8 = 0;
        int var12_int = 0;
        RuntimeException decompiledCaughtException = null;
        double var2_double = 0.0;
        RuntimeException var2 = null;
        double var4 = 0.0;
        long var6 = 0L;
        double var9 = 0.0;
        int var11 = 0;
        double var12 = 0.0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        try {
          var2_double = 0.0;
          var4 = 0.0;
          var6 = 0L;
          for (var8 = 0; this.gameModel.balls.length > var8; var8++) {
            if (this.gameModel.balls[var8].inPlay &&
              this.gameModel.balls[var8].motionState != 0) {
              var9 = Math.sqrt((double)(this.gameModel.balls[0].velocityX * this.gameModel.balls[0].velocityX + this.gameModel.balls[0].velocityY * this.gameModel.balls[0].velocityY) / 65536.0 / 65536.0);
              var11 = -1;
              for (var12_int = 0; this.gameModel.pockets.length > var12_int; var12_int++) {
                var13 = -this.gameModel.balls[var8].positionX + this.gameModel.pockets[var12_int].centerX;
                var14 = this.gameModel.pockets[var12_int].centerY - this.gameModel.balls[var8].positionY;
                var15 = NameEntryPopup.a(var13, false, var13) + NameEntryPopup.a(var14, false, var14);
                if (var11 < 0 ||
                  var11 > var15) {
                  var11 = var15;
                }
              }
              var12 = Math.sqrt((double)var11 / 65536.0) * Math.max(0.0, -0.04998779296875 + var9);
              var2_double = var2_double + var12 * ((double)this.gameModel.balls[var8].positionX / 65536.0);
              var4 = var4 + var12 * ((double)this.gameModel.balls[var8].positionY / 65536.0);
              var6 = (long)((double)var6 + var12);
            }
          }
          if (var6 > 0L) {
            this.idleOrbitStep = -1;
            this.cameraGoal.targetY = var4 / (double)var6;
            this.cameraGoal.targetX = var2_double / (double)var6;
          }
          if (param0 != 1) {
            field_X = 98;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var2), "uf.MB(" + param0 + ')');
        }
    }

    final void loadStateSnapshot(int param0, PacketBuffer param1) {
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          this.gameModel.readState(param1, (byte) 123);
          if (param0 != 16915) {
            this.setCuePower(34, false);
          }
          LobbyGame.field_gc.createDebugOverlays(this.gameModel, 0);
          this.refillRackFromPockets((byte) 93);
          if ((TutorialController.field_c & this.modeFlags) == 0 &&
            this.gameModel.currentShot(72).phase == 0) {
            this.beginTurn((byte) -74);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("uf.IA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    private final void drawShotHistory(int param0, IntrusiveDeque param1, byte param2) {
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_42_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        IntrusiveDequeCursor var5 = null;
        ShotRecord var6 = null;
        try {
          if (param2 != 27) {
            this.shotModeActive = false;
          }
          var4_int = -sa.field_h.maxDescent + SoftwareRasterizer.height;
          var5 = new IntrusiveDequeCursor(param1);
          var6 = (ShotRecord) (var5.first(0));
          while (var6 != null) {
            if (var6.phase >= 3) {
              sa.field_h.d(var6.describeChoices(true), param0, var4_int, 16724787, 1);
              var4_int = var4_int - 5 * (sa.field_h.maxDescent + sa.field_h.maxAscent) / 4;
              if (sa.field_h.maxAscent >= var4_int) {
                return;
              }
            }
            if (var6.phase >= 2) {
              sa.field_h.d(var6.describeOutcome(param2 ^ 26864), param0, var4_int, 16724787, 1);
              var4_int = var4_int - (sa.field_h.maxAscent + sa.field_h.maxDescent) * 5 / 4;
              if (sa.field_h.maxAscent >= var4_int) {
                return;
              }
            }
            if (!(1 > var6.phase) ||
              var6.power != -1) {
              if (var6.phase != 0) {
                sa.field_h.d(var6.describeAim(0), param0, var4_int, 16750899, 1);
              } else {
                sa.field_h.drawLeftAlpha(var6.describeAim(0), param0, var4_int, 16750899, 1, 128);
              }
              var4_int = var4_int - 5 * (sa.field_h.maxAscent + sa.field_h.maxDescent) / 4;
              if (var4_int <= sa.field_h.maxAscent) {
                return;
              }
            }
            if (var6.phase >= 0) {
              sa.field_h.d(var6.describe(param2 ^ 26, this.gameModel), param0, var4_int, 10092339, 1);
              var4_int = var4_int - (sa.field_h.maxDescent + sa.field_h.maxAscent) * 5 / 4;
              if (sa.field_h.maxAscent >= var4_int) {
                return;
              }
            }
            var6 = (ShotRecord) (var5.next((byte) -71));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_41_0 = var4;
          stackIn_41_1 = new StringBuilder().append("uf.EB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_42_2 = "null";
          } else {
            stackIn_42_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_41_0), ((StringBuilder) (Object) stackIn_41_1).append(stackIn_42_2).append(',').append(param2).append(')').toString());
        }
    }

    private final void nudgeAimElevation(int param0, int param1) {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          param1 = param1 + this.cueAim.polarAngle;
          if (param0 <= param1) {
            if (param1 > 1024) {
              param1 = 1024;
            }
          } else {
            param1 = 512;
          }
          if (this.cueAim.polarAngle != param1) {
            this.trySetCueElevation(param0 - 511, param1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "uf.AB(" + param0 + ',' + param1 + ')');
        }
    }

    private final void postShotMessages(ShotRecord param0, byte param1) {
        int discarded$1 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        dn var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        try {
          if (null != param0.field_R &&
            !param0.field_R.isEmpty(0)) {
            var3 = (dn) (param0.field_R.last((byte) -54));
            while (var3 != null) {
              var4 = AccountWelcomePanel.substituteTemplateArguments(new String[]{this.gameModel.field_h[param0.playerIndex]}, -1, e.shotMessages[var3.field_q]);
              HighscoresScreen.$cfr$intArgs$a$c9c3307e6488(120, false, 1, var4);
              var3 = (dn) (param0.field_R.previous((byte) -5));
            }
          }
          if (param1 < 86) {
            discarded$1 = this.placeIndicator(-95, 0, -15, (UiComponent) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_16_0 = var3_ref;
          stackIn_16_1 = new StringBuilder().append("uf.QC(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void handleAimKeys(int param0) {
        int stackIn_7_0 = 0;
        int stackIn_14_1 = 0;
        int stackIn_18_0 = 0;
        int stackIn_22_1 = 0;
        int stackIn_29_0 = 0;
        int stackIn_36_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        try {
          if (!TextLineLayout.field_c[bc.keycodeDefaultLeft1] &&
            !TextLineLayout.field_c[ByteStorage.keycodeDefaultLeft2]) {
            stackIn_7_0 = 0;
          } else {
            stackIn_7_0 = -1;
          }
          if (!TextLineLayout.field_c[gn.keycodeDefaultRight1] &&
            !TextLineLayout.field_c[ResourceArchive.keycodeDefaultRight2]) {
            stackIn_14_1 = 0;
          } else {
            stackIn_14_1 = 1;
          }
          var2_int = stackIn_7_0 + stackIn_14_1;
          stackIn_18_0 = (!TextLineLayout.field_c[105]) ? 0 : -1;
          if (TextLineLayout.field_c[104]) {
            stackIn_22_1 = 1;
          } else {
            stackIn_22_1 = 0;
          }
          var3 = stackIn_18_0 + stackIn_22_1;
          if (!TextLineLayout.field_c[gp.keycodeDefaultUp1] &&
            !TextLineLayout.field_c[fl.keycodeDefaultUp2]) {
            stackIn_29_0 = 0;
          } else {
            stackIn_29_0 = -1;
          }
          if (!TextLineLayout.field_c[Quaternion.keycodeDefaultDown1] &&
            !TextLineLayout.field_c[ProxySocketConnector.keycodeDefaultDown2]) {
            stackIn_36_1 = 0;
          } else {
            stackIn_36_1 = 1;
          }
          var4 = stackIn_29_0 + stackIn_36_1;
          if (param0 == this.gameModel.currentShot(72).phase &&
            0 != var2_int) {
            if (this.checkTutorialAction(1, 4, false)) {
              this.keyRotationRamp = this.keyRotationRamp - var2_int;
              this.setAimAzimuth(param0 - 69, 2047 & this.keyRotationRamp + this.cueAim.azimuth);
              hh.field_c = true;
              MouseWheelInput.field_c.field_g = true;
            }
          } else {
            if (this.keyRotationRamp != 0) {
              this.keyRotationRamp = 0;
            }
          }
          if (0 == this.gameModel.currentShot(28).phase &&
            var3 != 0) {
            this.nudgeAimElevation(512, var3 * 8);
            hh.field_c = true;
            MouseWheelInput.field_c.field_g = true;
          }
          if (this.gameModel.currentShot(77).phase == 0 &&
            var4 != 0) {
            if (!this.checkTutorialAction(1, 5, false)) {
              return;
            }
            if (0 == this.keyPowerRamp) {
              this.keyPowerRamp = var4 << 16;
            } else {
              this.keyPowerRamp = this.keyPowerRamp + (var4 << 15);
            }
            this.cueAim.field_n = this.cuePower;
            LobbyGame.field_gc.updateHumPitch(101, this.cueAim.field_n);
            if (this.keyPowerRamp >= 0) {
              this.powerPulseTick = 75;
            } else {
              this.powerPulseTick = 0;
            }
            this.adjustPower((byte) 74, -(this.keyPowerRamp >> 16));
            MouseWheelInput.field_c.field_g = true;
            hh.field_c = true;
            return;
          }
          if (this.keyPowerRamp != 0) {
            this.keyPowerRamp = 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var2), "uf.VC(" + param0 + ')');
        }
    }

    final void resetView(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          this.cameraPresetIndex = -1;
          this.cameraGoal.a(105);
          if (param0 != -23095) {
            this.strikeAnimationFrame = 121;
          }
          this.tryLeaveShotMode(param0 ^ 23155);
          this.idleOrbitStep = (int)(this.cameraGoal.getYaw(true) * 400.0 / 3.141592653589793 / 2.0) % 400;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var2), "uf.LA(" + param0 + ')');
        }
    }

    private final void stepShotAnimation(int param0, ShotRecord param1) {
        TableScene stackIn_34_0 = null;
        int stackIn_35_1 = 0;
        TableScene stackIn_41_0;
        int stackIn_41_1;
        int[] stackIn_41_2;
        int stackIn_41_3;
        int[] stackIn_41_4;
        int stackIn_42_5;
        int stackIn_59_0 = 0;
        boolean stackIn_85_0 = false;
        int stackIn_98_0 = 0;
        int stackIn_121_0 = 0;
        int stackIn_121_1 = 0;
        RuntimeException stackIn_133_0 = null;
        StringBuilder stackIn_133_1 = null;
        String stackIn_134_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_84_0;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        ij var5 = null;
        IntrusiveDequeCursor var5_ref = null;
        int[] var6 = null;
        PotEvent var6_ref = null;
        ij var7_ref_ij = null;
        int var7 = 0;
        Pocket var8 = null;
        int var9 = 0;
        ij var5Lifetime1;
        IntrusiveDequeCursor var5_refLifetime1;
        PotEvent var6_refLifetime1;
        int var3_intLifetime1;
        var9 = Pool.field_O;
        try {
          boolean decompiledFrameRemainder0 = true;
          if ((LinkButtonPainter.field_i & 2048L) == 0L ||
            this.debugPaused) {
            if (this.strikeAnimationFrame < 0) {
              if ((this.strikeAnimationFrame >= -12) &&
                (decompiledFrameRemainder0 = ((TutorialController.field_c & this.modeFlags) == 0 ||
                this.shotConfirmedByServer))) {
                MouseWheelInput.field_c.field_g = true;
                this.cuePullbackDistance = -this.strikeAnimationFrame * this.cueAim.field_n * 228 / 4096 / 12;
                this.strikeAnimationFrame = this.strikeAnimationFrame + 1;
                decompiledFrameRemainder0 = (var9 != 0);
              }
              if (decompiledFrameRemainder0) {
                this.cuePullbackDistance = (this.strikeAnimationFrame + 37) * this.cueAim.field_n * 228 / 4096 / 25;
                MouseWheelInput.field_c.field_g = true;
                this.strikeAnimationFrame = this.strikeAnimationFrame + 1;
                decompiledFrameRemainder0 = (var9 != 0);
              }
            }
            if (decompiledFrameRemainder0) {
              if (0 == this.strikeAnimationFrame) {
                this.cuePullbackDistance = 57;
                if (this.isLocalPlayersTurn(-1)) {
                  stackIn_34_0 = LobbyGame.field_gc;
                  if (this.cueAim.field_n > 2048) {
                    stackIn_35_1 = 0;
                  } else {
                    stackIn_35_1 = 1;
                  }
                  ((TableScene) (Object) stackIn_34_0).playTableSound(stackIn_35_1, this.cueAim.field_n * 128 / 4096 + 32, (byte) -115, 128);
                  if (var9 != 0) {
                    stackIn_41_0 = LobbyGame.field_gc;
                    stackIn_41_1 = 1336449640;
                    stackIn_41_2 = this.viewMatrix;
                    stackIn_41_3 = 32 + this.cueAim.field_n * 128 / 4096;
                    stackIn_41_4 = MouseWheelInput.field_c.field_l;
                    if (this.cueAim.field_n > 2048) {
                      stackIn_42_5 = 0;
                    } else {
                      stackIn_42_5 = 1;
                    }
                    ((TableScene) (Object) stackIn_41_0).a(stackIn_41_1, stackIn_41_2, stackIn_41_3, stackIn_41_4, stackIn_42_5);
                  }
                } else {
                  stackIn_41_0 = LobbyGame.field_gc;
                  stackIn_41_1 = 1336449640;
                  stackIn_41_2 = this.viewMatrix;
                  stackIn_41_3 = 32 + this.cueAim.field_n * 128 / 4096;
                  stackIn_41_4 = MouseWheelInput.field_c.field_l;
                  if (this.cueAim.field_n > 2048) {
                    stackIn_42_5 = 0;
                  } else {
                    stackIn_42_5 = 1;
                  }
                  ((TableScene) (Object) stackIn_41_0).a(stackIn_41_1, stackIn_41_2, stackIn_41_3, stackIn_41_4, stackIn_42_5);
                }
                this.gameModel.startShot((byte) -51);
                if (this.isLocalPlayersTurn(-1)) {
                  this.snapCameraToPreset(-24070);
                }
                this.strikeAnimationFrame = this.strikeAnimationFrame + 1;
                decompiledFrameRemainder0 = ((f.field_f & this.modeFlags) != 0);
                if ((decompiledFrameRemainder0) &&
                  (decompiledFrameRemainder0 = (this.clockTicks == -1))) {
                  this.clockTicks = 0;
                  decompiledFrameRemainder0 = (var9 != 0);
                }
              }
              if (decompiledFrameRemainder0) {
                this.debugPaused = false;
                stackIn_59_0 = (param1.field_n == -1) ? 0 : 1;
                var3_int = stackIn_59_0;
                var4 = param1.field_t ? 1 : 0;
                this.gameModel.updateShotState((byte) -126);
                if (var4 == 0) {
                  if (var3_int == 0 &&
                    param1.field_n != -1 &&
                    !this.gameModel.rules.isFirstContactLegal(param1, -110) &&
                    !UiTheme.a((byte) 49, 4)) {
                    var5 = ProgressBarWidget.a(true, 4, bq.foulExclamation, (String) null);
                    var6 = ReportAbuseDialog.field_ac[0];
                    param1.field_t = true;
                    var5.field_D = new int[]{var6[0] >> 13, var6[1] >> 13, var6[2] >> 13};
                    var5.field_F = new int[]{var6[0] >> 13, var6[1] >> 13, var6[2] >> 13};
                    var5.field_p = new int[]{var6[0] >> 13, var6[1] >> 13, var6[2] >> 13};
                    if ((16711680 & wq.field_c) != 16711680) {
                      wq.field_c = wq.field_c + 65536;
                    }
                    var5.field_v = 5;
                  }
                  boolean decompiledFrameCompleted1 = true;
                  if (this.gameModel.field_j > 0) {
                    var5_ref = new IntrusiveDequeCursor(param1.pottedBalls);
                    var6_ref = (PotEvent) (var5_ref.last((byte) -92));
                    while (null != var6_ref) {
                      stackOut_84_0 = this.gameModel.rules.isPotLegal(var6_ref.ballIndex, (byte) 9, param1);
                      stackIn_98_0 = stackOut_84_0 ? 1 : 0;
                      stackIn_85_0 = stackOut_84_0;
                      if (var9 != 0) {
                        decompiledFrameCompleted1 = false;
                        break;
                      }
                      if (!stackIn_85_0 &&
                        !UiTheme.a((byte) 95, 4)) {
                        var7_ref_ij = ProgressBarWidget.a(true, 4, bq.foulExclamation, (String) null);
                        var8 = this.gameModel.pockets[var6_ref.pocketIndex];
                        if ((16711680 & wq.field_c) != 16711680) {
                          wq.field_c = wq.field_c + 65536;
                        }
                        param1.field_t = true;
                        var7_ref_ij.field_v = 5;
                        var7_ref_ij.field_D = new int[]{var8.centerX >> 13, var8.centerY >> 13, 0};
                        var7_ref_ij.field_F = new int[]{var8.centerX >> 13, var8.centerY >> 13, 0};
                        var7_ref_ij.field_p = new int[]{var8.centerX >> 13, var8.centerY >> 13, 0};
                        break;
                      }
                      var6_ref = (PotEvent) (var5_ref.previous(-126));
                    }
                  }
                  if (decompiledFrameCompleted1) {
                    stackIn_98_0 = param1.phase;
                  }
                  if (stackIn_98_0 == 2 &&
                    param1.field_n == -1 &&
                    param1.field_t) {
                    var5Lifetime1 = ProgressBarWidget.a(true, 4, bq.foulExclamation, (String) null);
                    var5Lifetime1.field_v = 5;
                    var5Lifetime1.field_D = new int[]{this.gameModel.balls[0].positionX >> 13, this.gameModel.balls[0].positionY >> 13, this.gameModel.balls[0].positionZ >> 13};
                    var5Lifetime1.field_F = new int[]{this.gameModel.balls[0].positionX >> 13, this.gameModel.balls[0].positionY >> 13, this.gameModel.balls[0].positionZ >> 13};
                    var5Lifetime1.field_p = new int[]{this.gameModel.balls[0].positionX >> 13, this.gameModel.balls[0].positionY >> 13, this.gameModel.balls[0].positionZ >> 13};
                  }
                }
                boolean decompiledFrameCompleted0 = true;
                if (this.gameModel.field_j > 0) {
                  var5_refLifetime1 = new IntrusiveDequeCursor(param1.pottedBalls);
                  var6_refLifetime1 = (PotEvent) (var5_refLifetime1.first(0));
                  var7 = 0;
                  while (!(var7 >= this.gameModel.field_j)) {
                    stackIn_121_0 = -1;
                    stackIn_121_1 = ~var6_refLifetime1.ballIndex;
                    if (var9 != 0) {
                      decompiledFrameCompleted0 = false;
                      break;
                    }
                    if (stackIn_121_0 != stackIn_121_1) {
                      vm.field_f = vm.field_f + 65536;
                    }
                    var6_refLifetime1 = (PotEvent) (var5_refLifetime1.next((byte) -71));
                    var7++;
                  }
                }
                if (decompiledFrameCompleted0) {
                  this.spawnCollisionEffects((byte) -113);
                  stackIn_121_0 = this.modeFlags;
                  stackIn_121_1 = sk.field_d;
                }
                if ((stackIn_121_0 & stackIn_121_1) == 0) {
                  this.playBallEventSounds(-709);
                }
                this.updateShotCamera(-118);
                if (param1.phase == 2) {
                  this.sendEndShotChecksum(param1, -128);
                }
                this.strikeAnimationFrame = this.strikeAnimationFrame + 1;
              }
            }
          }
          var3_intLifetime1 = 104 % ((-12 - param0) / 32);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_133_0 = var3;
          stackIn_133_1 = new StringBuilder().append("uf.SB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_134_2 = "null";
          } else {
            stackIn_134_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_133_0), ((StringBuilder) (Object) stackIn_133_1).append(stackIn_134_2).append(')').toString());
        }
    }

    private final void q(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          this.gameModel.undoLastShot((byte) -79);
          MouseWheelInput.field_c.field_g = true;
          hh.field_c = true;
          if (param0 != 114) {
            this.cheatsUnlocked = true;
          }
          this.markBallTransformsDirty(0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var2), "uf.EA(" + param0 + ')');
        }
    }

    private final void announceBallGroups(int param0, ShotRecord param1) {
        int var6_int = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        EightBallRules var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        int var5 = 0;
        ij var6 = null;
        try {
          if (!(this.gameModel.rules instanceof EightBallRules)) {
            return;
          }
          var3 = (EightBallRules) (this.gameModel.rules);
          var4 = dq.field_a.groupLabel(var3.groupOfPlayer(22533, param1.playerIndex), (byte) 116);
          var5 = 0;
          for (var6_int = 0; var6_int < this.gameModel.playerCount; var6_int++) {
            if (~this.gameModel.rules.teamIndex(-107, var6_int) == ~this.gameModel.rules.teamIndex(-64, param1.playerIndex)) {
              var5 = var5 | 1 << var6_int;
            }
          }
          if (param0 <= 114) {
            this.cuePullbackDistance = 23;
          }
          var6 = ProgressBarWidget.a(true, 10, AccountWelcomePanel.substituteTemplateArguments(new String[]{null, null, var4}, -1, this.formatPlayerGroupMessage(ij.playerYouFirstListAreGroupName, Under13NoticePanel.playerIsGroupName, ScrollPane.playerX2AreGroupName, MessageDialog.playerYouX2AreGroupName, (byte) 61, var5, w.playerListAreGroupName, KillerRules.youAreGroupName)), (String) null);
          var6.field_q = q.field_b;
          var6.field_r = 5;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_17_0 = var3_ref;
          stackIn_17_1 = new StringBuilder().append("uf.DE(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    final void k(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (0 == (this.modeFlags & TutorialController.field_c)) {
            throw new IllegalStateException();
          }
          if (param0 > -89) {
            this.playerNameWidths = (int[]) null;
          }
          JaggrabDownloader.field_j.writeCipheredOpcode(false, 66);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var2), "uf.PD(" + param0 + ')');
        }
    }

    private final void redoShot(int param0) {
        RuntimeException decompiledCaughtException = null;
        ShotRecord var2 = null;
        RuntimeException var2_ref = null;
        Ball var3 = null;
        try {
          if (0 != (TutorialController.field_c & this.modeFlags)) {
            if (this.cheatMode | false) {
              ProgressBarWidget.a(true, 0, "Sorry", "Redo not supported for networked multiplayer, you can still dump the state though.");
            }
            return;
          }
          if (this.gameModel.field_o) {
            System.out.println("Can't redo: Game is finished.");
            return;
          }
          var2 = this.gameModel.currentShot(29);
          if (param0 <= 62) {
            this.setCuePower(8, true);
          }
          if (var2.phase != 0) {
            System.out.println("Can't redo: Shot is waiting.");
            return;
          }
          if (0 > var2.power) {
            System.out.println("Can't redo: Power less than zero.");
            return;
          }
          if (var2.power == 0) {
            this.v(0);
            return;
          }
          if (-1 != var2.cueBallX &&
            var2.cueBallY != -1) {
            var3 = this.gameModel.balls[0];
            var3.transformDirty = true;
            var3.positionX = var2.cueBallX;
            var3.positionY = var2.cueBallY;
            System.out.println("moved cueball to " + var2.cueBallX + "," + var2.cueBallY);
          }
          this.cueAim.field_d = var2.field_D;
          this.cueAim.field_e = var2.field_H;
          this.cuePower = var2.power;
          this.cueAim.field_n = var2.power;
          this.cueAim.azimuth = (1024 + var2.aimAngle) % 2048;
          this.cueAim.polarAngle = var2.elevation;
          System.out.println("Redoing shot: " + var2.describeAim(0));
          this.beginShotAnimation((byte) 17);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var2_ref), "uf.IE(" + param0 + ')');
        }
    }

    private final void d(int param0) {
        RuntimeException runtimeException = null;
        ShotRecord var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = Pool.field_O;
        try {
          var2 = this.gameModel.currentShot(58);
          if (var2 == null) {
            return;
          }
          var3 = var2.field_I;
          if (~var3 == param0) {
            return;
          }
          var4 = 0;
          while (this.gameModel.balls.length > var4) {
            if (var5 != 0) {
              return;
            }
            if (this.gameModel.balls[var4].inPlay) {
              if (~var4 == ~var3) {
                ji.field_b[var4] = 32;
              }
            } else {
              ji.field_b[var4] = 0;
              Js5Transport.field_n[var4] = 0;
            }
            var4++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "uf.GC(" + param0 + ')');
        }
    }

    private final String getPlayerName(int param0, int param1) {
        String dupTemp$2 = null;
        String var3 = null;
        RuntimeException var3_ref = null;
        String stackIn_7_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null != this.playerNameCache[param1]) {
            var3 = this.playerNameCache[param1];
          } else {
            dupTemp$2 = this.gameModel.field_h[param1];
            this.playerNameCache[param1] = dupTemp$2;
            var3 = dupTemp$2;
            this.playerNameWidths[param1] = sa.field_h.b(this.playerNameCache[param1]);
          }
          if (param0 != -30360) {
            this.viewMatrixDirty = true;
          }
          stackIn_7_0 = var3;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var3_ref), "uf.PB(" + param0 + ',' + param1 + ')');
        }
    }

    private final void drawBallTooltip(int param0) {
        int[] discarded$1 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        String var3 = null;
        try {
          boolean decompiledFrameRemainder0 = true;
          if (0L == (LinkButtonPainter.field_i & 4294967296L) &&
            wn.field_i >= 0 &&
            0 <= DebouncedValidationProvider.field_f) {
            var2_int = this.pickBallAtScreenPoint(false, true, wn.field_i, DebouncedValidationProvider.field_f);
            if (!this.shotModeActive) {
              decompiledFrameRemainder0 = (-1 != var2_int);
            } else {
              decompiledFrameRemainder0 = !(var2_int <= 0);
            }
            if (decompiledFrameRemainder0) {
              var3 = dq.field_a.ballLabel(var2_int, this.gameModel.rules, (byte) -111);
              DialWidget.a(DebouncedValidationProvider.field_f, var3, wn.field_i, 3355443, sa.field_h, true, dq.field_a.ballColor(var2_int, true));
            }
          }
          if (param0 != -9449) {
            discarded$1 = this.findValidCueAim(27, -92, 8, -80, (byte) 101, -122);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var2), "uf.D(" + param0 + ')');
        }
    }

    final void readEndShotPacket(int param0, PacketBuffer param1) {
        try {
          RuntimeException runtimeException = null;
          ShotRecord var3 = null;
          PacketBuffer var4 = null;
          RuntimeException stackIn_18_0 = null;
          StringBuilder stackIn_18_1 = null;
          String stackIn_19_2 = null;
          RuntimeException decompiledCaughtException = null;
          try {
            var3 = this.gameModel.currentShot(31);
            if (var3.phase != 2) {
              if (this.isLocalPlayersTurn(-1) &&
                !this.shotConfirmedByServer) {
                this.gameModel.snapshotFinishedShot((byte) 80);
              } else {
                GrowableIntList.reportClientError(new Throwable(), "Reading end shot packet before we have finished this shot!", -8555);
                dn.c(54);
                return;
              }
            }
            var4 = param1;
            this.clockTicks = var4.readUnsignedShort(-1034);
            if (param0 <= 55) {
              this.cheatsUnlocked = false;
            }
            var3.readEndShot((byte) 112, param1);
            this.handleShotFinished(var3, 1);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            runtimeException = decompiledCaughtException;
            stackIn_18_0 = runtimeException;
            stackIn_18_1 = new StringBuilder().append("uf.GE(").append(param0).append(',');
            if (param1 == null) {
              stackIn_19_2 = "null";
            } else {
              stackIn_19_2 = "{...}";
            }
            throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final boolean checkTutorialAction(int param0, int param1, boolean param2) {
        RuntimeException var4 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if ((this.modeFlags & sk.field_d) != 0) {
            if ((1 << param1 & this.tutorial.currentStep.field_o) != 0) {
              this.tutorial.g(-123);
              return false;
            }
            this.tutorial.onStepEvent(param0, param1, -28186);
          }
          if (param2) {
            this.lastHoverMouseY = -113;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var4), "uf.ED(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void submitTimeTrialScore(byte param0) {
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        try {
          var2_int = -35 % ((-34 - param0) / 42);
          if (null == ti.field_d &&
            0 < this.clockTicks &&
            !this.cheatMode &&
            0 != (this.modeFlags & f.field_f) &&
            this.gameModel.field_m) {
            if (f.field_g > 0) {
              ti.field_d = new oj(0, 65535, vm.field_f, wq.field_c, field_fb, dk.field_f, new int[]{-this.clockTicks});
            } else {
              ti.field_d = new oj(1, 65534, vm.field_f, wq.field_c, field_fb, dk.field_f, new int[]{-this.clockTicks});
            }
            if (!NanoTickClock.b(77)) {
              ml.a(25756, ti.field_d, 3);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var2), "uf.VB(" + param0 + ')');
        }
    }

    final void handleKeyTyped(byte param0) {
        int stackIn_39_0 = 0;
        int stackIn_74_0 = 0;
        int stackIn_74_1 = 0;
        int stackIn_75_2 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var2_intLifetime1;
        int var2_intLifetime2;
        int var2_intLifetime3;
        int var3Lifetime1;
        int var4Lifetime1;
        var7 = Pool.field_O;
        try {
          boolean decompiledFrameRemainder0 = true;
          var2_int = 3 + f.field_g;
          wq.field_c = wq.field_c & -65536 | (var2_int + (wq.field_c & 65535)) % 31676;
          if (-1 != IterableDualLinkDeque.field_a &&
            !this.cheatMode) {
            if (59 == IterableDualLinkDeque.field_a) {
              if (PasswordValidator.field_r == null) {
                PasswordValidator.field_r = new PacketBuffer(30);
                decompiledFrameRemainder0 = (var7 != 0);
              }
              if (decompiledFrameRemainder0) {
                if (PasswordValidator.field_r.position == 30 &&
                  cp.crc64(PasswordValidator.field_r.payload, (byte) -83, 30) == 1099305073022L) {
                  this.cheatMode = true;
                  HighscoresScreen.$cfr$intArgs$a$c9c3307e6488(121, false, 1, BallDebugOverlay.decodeBase37Name((byte) -119, 64525515431L));
                }
                PasswordValidator.field_r = null;
                if (var7 != 0) {
                  if (null != PasswordValidator.field_r &&
                    PasswordValidator.field_r.position < 30) {
                    PasswordValidator.field_r.writeByte(IterableDualLinkDeque.field_a, false);
                    PasswordValidator.field_r = null;
                  } else {
                    PasswordValidator.field_r = null;
                  }
                }
              }
            } else {
              if (null != PasswordValidator.field_r &&
                PasswordValidator.field_r.position < 30) {
                PasswordValidator.field_r.writeByte(IterableDualLinkDeque.field_a, false);
                if (var7 != 0) {
                  PasswordValidator.field_r = null;
                }
              } else {
                PasswordValidator.field_r = null;
              }
            }
          }
          if (null != Ball.field_B) {
            stackIn_39_0 = Ball.field_B.length + 3;
          } else {
            stackIn_39_0 = 3;
          }
          var2_intLifetime1 = stackIn_39_0;
          var3 = this.clockTicks;
          var4 = dk.field_f + var3;
          var5 = var4 % 7621;
          var6 = var4 / 7621;
          var4Lifetime1 = 7621 * ((var2_intLifetime1 + var6) % 31676) + var5;
          dk.field_f = -var3 + var4Lifetime1;
          if (param0 <= 78) {
            this.setUpTheme(61, 127, -6);
          }
          if (IterableDualLinkDeque.field_a == 13) {
            regionExit1: {
              if ((TutorialController.field_c & this.modeFlags) == 0) {
                if ((oj.field_m & this.modeFlags) != 0 &&
                  this.gameModel.field_o) {
                  var2_intLifetime2 = 9;
                  if (var7 == 0) {
                    break regionExit1;
                  }
                }
                if ((this.modeFlags & f.field_f) != 0) {
                  var2_intLifetime2 = 3;
                  if (var7 == 0) {
                    break regionExit1;
                  }
                }
                if ((this.modeFlags & sk.field_d) == 0) {
                  var2_intLifetime2 = 8;
                  if (var7 == 0) {
                    break regionExit1;
                  }
                }
                var2_intLifetime2 = 24;
                if (var7 == 0) {
                  break regionExit1;
                }
              }
              if (this.localPlayerIndex >= 0) {
                if (!this.gameModel.field_o) {
                  var2_intLifetime2 = 10;
                  if (var7 != 0) {
                    var2_intLifetime2 = 11;
                    var2_intLifetime2 = 12;
                  }
                } else {
                  var2_intLifetime2 = 11;
                  if (var7 != 0) {
                    var2_intLifetime2 = 12;
                  }
                }
              } else {
                var2_intLifetime2 = 12;
              }
            }
            var3Lifetime1 = var2_intLifetime2;
            stackIn_74_0 = -3405;
            stackIn_74_1 = var3Lifetime1;
            if (mg.a(true)) {
              stackIn_75_2 = 21;
            } else {
              stackIn_75_2 = 0;
            }
            fq.a(stackIn_74_0, stackIn_74_1, stackIn_75_2, false);
            StatefulTextPainter.field_s.setCursorVisible(true, (byte) 106, (java.awt.Component) ((Object) TextLineLayout.a((byte) -100)));
            return;
          }
          if (!oj.c(-62)) {
            if (0 != (this.modeFlags & TutorialController.field_c) &&
              DualLinkNode.field_p) {
              return;
            }
            if (this.cheatMode &&
              !sm.d(-18791)) {
              this.handleDebugKeys((byte) -116);
            }
            if (this.introDelayTicks < 0) {
              var2_intLifetime3 = IterableDualLinkDeque.field_a;
              if (var2_intLifetime3 == 83 &&
                var7 == 0) {
                if (!this.shotModeActive) {
                  if (this.gameModel.currentShot(101).phase == 1) {
                    return;
                  }
                  if (!this.checkTutorialAction(1, 3, false)) {
                    return;
                  }
                  this.tryEnterShotMode((byte) 79);
                  return;
                }
                if (!this.checkTutorialAction(1, 6, false)) {
                  return;
                }
                this.resetCameraToDefaultPreset(0);
                return;
              } else {
                if (var2_intLifetime3 != 59) {
                  return;
                }
              }
              if (!this.cheatMode &&
                this.cheatsUnlocked &&
                TextLineLayout.field_c[82] &&
                TextLineLayout.field_c[86] &&
                TextLineLayout.field_c[81]) {
                this.cheatMode = true;
                HighscoresScreen.$cfr$intArgs$a$c9c3307e6488(118, false, 1, "Cheat mode enabled.");
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var2), "uf.TD(" + param0 + ')');
        }
    }

    final static boolean d(boolean param0) {
        RuntimeException var1 = null;
        boolean stackIn_10_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            PoolMatchController.c(true);
          }
          stackIn_10_0 = (HighscoresScreen.field_K) || (NanoTickClock.b(-126));
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var1), "uf.AC(" + param0 + ')');
        }
    }

    private final void announceTurnStatus(int param0) {
        boolean stackIn_13_0 = false;
        int stackIn_13_1 = 0;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        ShotRecord var2 = null;
        RuntimeException var2_ref = null;
        ij var3 = null;
        ij var3Lifetime1;
        try {
          if (this.gameModel.playerCount > 1) {
            if (this.gameModel.currentShot(param0 + 14107).next != this.gameModel.shots.field_e) {
              if (((ShotRecord) (this.gameModel.currentShot(85).next)).playerIndex != this.gameModel.field_A) {
                var2 = (ShotRecord) (this.gameModel.currentShot(53).next);
                if ((ThemeSelectScreen.field_O & var2.endResolution) != 0) {
                  var3 = ProgressBarWidget.a(true, 3, AccountWelcomePanel.substituteTemplateArguments(new String[]{this.getPlayerName(-30360, this.gameModel.field_A)}, -1, ArchiveRequest.playerNameTwoShots), (String) null);
                  var3.field_q = SpriteState.field_F;
                  var3.field_r = 5;
                }
                if (0 != (var2.endResolution & AccountWelcomePanel.field_Y)) {
                  var3Lifetime1 = ProgressBarWidget.a(true, 8, AccountWelcomePanel.substituteTemplateArguments(new String[]{this.getPlayerName(-30360, this.gameModel.field_A)}, -1, AlignedIconLabel.playerNameBallInHand), (String) null);
                  var3Lifetime1.field_q = AimTarget.field_f;
                  var3Lifetime1.field_r = 5;
                }
              } else {
                stackIn_13_0 = true;
                stackIn_13_1 = 3;
                if (this.gameModel.field_z <= 0 &&
                  0 >= this.gameModel.field_y) {
                  stackIn_16_2 = this.getPlayerName(-30360, this.gameModel.field_A);
                } else {
                  stackIn_16_2 = AccountWelcomePanel.substituteTemplateArguments(new String[]{this.getPlayerName(-30360, this.gameModel.field_A)}, -1, TimeTrialRules.playerNameYouHaveAnExtraShot);
                }
                ProgressBarWidget.a(stackIn_13_0, stackIn_13_1, stackIn_16_2, (String) null);
              }
            } else {
              ProgressBarWidget.a(true, 3, this.getPlayerName(-30360, this.gameModel.field_A), (String) null);
            }
          }
          if (param0 != -14034) {
            this.playerCueAims = (CueAim[]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var2_ref), "uf.RA(" + param0 + ')');
        }
    }

    private final void highlightCurrentGroupBalls(byte param0) {
        int var4 = 0;
        int var2_int = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          var3 = 50 / ((18 - param0) / 54);
          var2_int = this.gameModel.rules.initialGroup(-1);
          if (var2_int == -1) {
            return;
          }
          for (var4 = 0; this.gameModel.balls.length > var4; var4++) {
            if (this.gameModel.balls[var4].inPlay) {
              if (~var2_int == ~this.gameModel.rules.ballGroup(var4, 30554)) {
                ji.field_b[var4] = 32;
              }
            } else {
              ji.field_b[var4] = 0;
              Js5Transport.field_n[var4] = 0;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var2), "uf.LC(" + param0 + ')');
        }
    }

    private final int getPowerFromBarPosition(byte param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_2_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 <= 82) {
            stackIn_2_0 = -58;
            return stackIn_2_0;
          }
          if (this.shotModeFade <= 0) {
            stackIn_21_0 = -1;
            return stackIn_21_0;
          }
          var2_int = -5 + il.field_f.field_w - 5;
          var3 = -7 + (il.field_f.field_y - 7);
          var4 = this.powerBarLeft(-16439) + 5;
          var5 = (-il.field_f.field_A + fl.field_q.screenY >> 1) + 7;
          var6 = wn.field_i - var4;
          if (var6 >= 0 &&
            var2_int >= var6) {
            var7 = -var5 + DebouncedValidationProvider.field_f;
            if (0 <= var7 &&
              var3 >= var7) {
              stackIn_19_0 = this.squaredRatioFixed(var3, -var7 + var3, (byte) 30);
              return stackIn_19_0;
            }
            stackIn_17_0 = -1;
            return stackIn_17_0;
          }
          stackIn_9_0 = -1;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var2), "uf.AA(" + param0 + ')');
        }
    }

    private final void drawStatusBar(boolean param0, boolean param1) {
        int discarded$0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_81_0 = 0;
        RuntimeException decompiledCaughtException = null;
        ShotRecord var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        String var5 = null;
        int var6 = 0;
        String var7_ref_String = null;
        int var7 = 0;
        int var8_int = 0;
        String var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        String var7_ref_StringLifetime1;
        String var7_ref_StringLifetime2;
        try {
          if (-Js5Transport.field_q.field_A < ArrayWidgetGroup.field_M) {
            bq.field_n.drawShadedGrayscale(ScrollPane.field_Ob, ArrayWidgetGroup.field_M, 128);
            Js5Transport.field_q.draw(ScrollPane.field_Ob, ArrayWidgetGroup.field_M);
            var3 = this.gameModel.currentShot(109);
            if (0 > this.gameModel.field_A) {
              stackIn_5_0 = var3.playerIndex;
            } else {
              stackIn_5_0 = this.gameModel.field_A;
            }
            var4 = stackIn_5_0;
            var5 = this.getPlayerName(-30360, var4);
            var6 = 16 + ScrollPane.field_Ob;
            if (this.gameModel.playerCount <= 1) {
              DualLinkNodeHashTable.field_k.enabled = false;
            } else {
              var6 = this.placeIndicator(-30818, var6, Js5Transport.field_q.field_y / 2 + ArrayWidgetGroup.field_M, DualLinkNodeHashTable.field_k);
            }
            if (!this.x((byte) -102) &&
              !this.gameModel.rules.showsTargetBall(114) &&
              !(this.gameModel.rules instanceof KillerRules)) {
              sa.field_h.d(var5, var6, tq.field_q, 16777215, 0);
              var6 = var6 + this.playerNameWidths[var4];
            } else {
              var7_ref_String = AccountWelcomePanel.substituteTemplateArguments(new String[]{var5}, -1, this.getPlayerColonText(2));
              sa.field_h.d(var7_ref_String, var6, tq.field_q, 16777215, 0);
              var6 = var6 + sa.field_h.b(var7_ref_String);
            }
            if (this.gameModel.rules.showsTargetBall(119)) {
              q.field_b.sprite = this.gameModel.rules.targetBallSprite(var3, 1);
              var6 = this.placeIndicator(-30818, var6, ArrayWidgetGroup.field_M + Js5Transport.field_q.field_y / 2, q.field_b);
            }
            if (this.gameModel.rules instanceof KillerRules) {
              var7_ref_StringLifetime1 = Integer.toString(((KillerRules) (this.gameModel.rules)).field_e[var4]);
              sa.field_h.d(var7_ref_StringLifetime1, var6, tq.field_q, 16777215, 0);
              var6 = var6 + sa.field_h.b(var7_ref_StringLifetime1);
            }
            if (this.gameModel.field_o) {
              if (param1 ||
                23 == MatchingTextValidator.field_w) {
                if (0 > this.gameModel.field_A) {
                  var7_ref_StringLifetime2 = Js5Transport.mpGamedrawn;
                } else {
                  if ((TutorialController.field_c & this.modeFlags) != 0) {
                    var8_int = this.gameModel.rules.sideMask((byte) -121, this.gameModel.rules.teamIndex(-59, this.gameModel.field_A));
                    if (LongAndTextLoginPayload.countSetBits(false, var8_int) <= 1) {
                      if (this.gameModel.field_A != this.localPlayerIndex) {
                        var7_ref_StringLifetime2 = AccountWelcomePanel.substituteTemplateArguments(new String[]{this.getPlayerName(-30360, this.gameModel.field_A)}, -1, PacketBuffer.mpXHaswon);
                      } else {
                        var7_ref_StringLifetime2 = il.mpYouhavewon;
                      }
                    } else {
                      var7_ref_StringLifetime2 = this.formatPlayerGroupMessage(jq.playerYouFirstListHaveWon, PacketBuffer.mpXHaswon, FullscreenErrorDialog.playerX2HaveWon, AccountCreationForm.playerYouX2HaveWon, (byte) 61, var8_int, sk.playerListHaveWon, il.mpYouhavewon);
                    }
                  } else {
                    if ((f.field_f & this.modeFlags) != 0) {
                      if (this.gameModel.field_m) {
                        var7_ref_StringLifetime2 = bc.timeTrialCompleted + "<br>" + ArchiveProvider.formatTimeSpan(this.clockTicks, (byte) -80);
                      } else {
                        var7_ref_StringLifetime2 = MouseHandler.timeTrialFailed;
                      }
                    } else {
                      if ((sk.field_d & this.modeFlags) == 0) {
                        var7_ref_StringLifetime2 = AccountWelcomePanel.substituteTemplateArguments(new String[]{this.gameModel.field_h[this.gameModel.field_A]}, -1, PacketBuffer.mpXHaswon);
                      } else {
                        if ((var3.endResolution & ag.field_e) == 0) {
                          var7_ref_StringLifetime2 = MarkerSliderPainter.youhavelost;
                        } else {
                          var7_ref_StringLifetime2 = il.mpYouhavewon;
                        }
                      }
                    }
                  }
                }
                if (sa.field_v != var7_ref_StringLifetime2 &&
                  !var7_ref_StringLifetime2.equals(sa.field_v)) {
                  sa.field_v = var7_ref_StringLifetime2;
                  TextInputValidator.field_i = ic.a(1, param0, 320, var7_ref_StringLifetime2, 4);
                }
                TextInputValidator.field_i.draw(SoftwareRasterizer.width - TextInputValidator.field_i.field_z >> 1, 80);
                if ((f.field_f & this.modeFlags) == 0) {
                  sa.field_h.setInlineSprites(AccountCreationForm.field_Z, bi.field_d);
                  sa.field_h.drawCentered(fl.endOfGamePressEscapeToContinue, SoftwareRasterizer.width >> 1, 150, 16777215, 0);
                }
              }
            } else {
              if (var4 >= 0) {
                discarded$0 = this.layoutShotIndicators(var6, Js5Transport.field_q.field_y / 2 + ArrayWidgetGroup.field_M, (byte) -51);
              }
            }
            if (-1 != this.gameModel.field_q ||
              (f.field_f & this.modeFlags) != 0) {
              stackIn_81_0 = ((this.modeFlags & f.field_f) != 0) ? 0 : 49;
              var7 = (stackIn_81_0 + this.clockTicks) / 50;
              var9 = -1;
              if ((this.modeFlags & f.field_f) == 0) {
                var8 = Integer.toString(var7);
                if (this.clockTicks > 1 &&
                  this.clockTicks < 250 &&
                  this.gameModel.currentShot(72).phase == 0) {
                  var9 = (-250 + this.clockTicks << 14) / 50;
                }
              } else {
                var10 = 150;
                var11 = this.field_v + 750;
                if (-1 != this.field_v &&
                  var10 > this.clockTicks - var11) {
                  var9 = (-var11 + this.clockTicks << 14) / 50;
                  var12 = this.field_v + (this.clockTicks - this.field_v) * (this.clockTicks - var11) / var10;
                  var7 = (var12 + 49) / 50;
                }
                if (var7 < 3600) {
                  var8 = ek.formatMinutesSeconds(var7 / 60, var7 % 60, 10);
                } else {
                  var8 = ModelInstance.a(var7 / 60 % 60, var7 % 60, 45, var7 / 60 / 60);
                }
              }
              var8 = AccountWelcomePanel.substituteTemplateArguments(new String[]{var8}, -1, ModelInstance.mpTimeremaining);
              if (var9 == -1) {
                sa.field_h.d(var8, MidiPcmStream.field_H + 4, tq.field_q, 16777215, 0);
              } else {
                sa.field_h.drawLeftAlpha(var8, 4 + MidiPcmStream.field_H, tq.field_q, 16777215, 0, (UiComponentNode.sineFixed(var9, (byte) -64) >> 11) + 191);
              }
            }
            ScrollPane.a(353, false, (Js5Transport.field_q.field_y >> 1) + ArrayWidgetGroup.field_M);
          }
          this.drawPowerBar(param0);
          if ((TutorialController.field_c & this.modeFlags) != 0 &&
            ValidationIconWidget.field_U != null) {
            ValidationIconWidget.field_U.drawRoot((byte) -79, false);
          }
          if (!param0) {
            field_y = (byte[][]) null;
          }
          this.drawBallRack(32);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var3_ref), "uf.HC(" + param0 + ',' + param1 + ')');
        }
    }

    private final void drawAudioFalloffDebug(byte param0) {
        int var5_int = 0;
        int var7 = 0;
        float[] var2 = null;
        int[] var3 = null;
        int[] var4 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        float var5 = 0.0f;
        float var6 = 0.0f;
        try {
          var2 = new float[640];
          var3 = mj.identityTransform(-31121);
          var4 = mj.identityTransform(-31121);
          for (var5_int = 0; var5_int < 640; var5_int++) {
            if (Float.isNaN(var2[var5_int])) {
              var2[var5_int] = 0.0f;
            }
            var3[2] = var5_int * 9216 / 640;
            IntrusiveNode.a(2, var3, var4);
            var2[var5_int] = (float)DualLinkDequeIterator.field_g;
          }
          sa.field_h.d("audio falloff start=" + LoginPayload.field_a + " speed=" + DropTargetWidget.a((long)QuickChatPhraseDefinition.field_G, 3, true, 8) + " (" + QuickChatPhraseDefinition.field_G + ")" + ", slope=" + ue.field_e, 10, 50, 65280, 3355443);
          SoftwareRasterizer.drawLine(0, 440, 0, 445, 65280);
          sa.field_h.d("camera", 1, 460, 65280, 1);
          SoftwareRasterizer.drawLine(SoftwareRasterizer.width / 2, 440, SoftwareRasterizer.width / 2, 445, 65280);
          sa.field_h.drawCentered("table length dist", SoftwareRasterizer.width / 2, 460, 65280, 1);
          SoftwareRasterizer.drawLine(-1 + SoftwareRasterizer.width, 440, SoftwareRasterizer.width - 1, 445, 65280);
          sa.field_h.c("2x table length dist", -1 + SoftwareRasterizer.width, 460, 65280, 1);
          var5 = -16.0f;
          var6 = 300.0f;
          for (var7 = 1; var7 < 640; var7++) {
            SoftwareRasterizer.drawLine(var7 - 1, -(int)((-var5 + var2[-1 + var7]) * 480.0f / (-var5 + var6)) + 479, var7, 479 - (int)((var2[var7] - var5) * 480.0f / (var6 - var5)), 65280);
          }
          if (param0 < 43) {
            this.dragLastMouseX = 27;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var2_ref), "uf.FB(" + param0 + ')');
        }
    }

    private final void selectBallSkin(int param0, byte param1) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param1 != -43) {
            this.introDelayTicks = 64;
          }
          if (PoolGameModel.field_B[param0] != dq.field_a) {
            dq.field_a.e(-26707);
            dq.field_a = PoolGameModel.field_B[param0];
            dq.field_a.prepareForGame(2147483647, this.gameModel);
            this.markBallTransformsDirty(0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var3), "uf.CB(" + param0 + ',' + param1 + ')');
        }
    }

    private final boolean setStrikePoint(boolean param0, int param1, int param2) {
        int[] var4 = null;
        RuntimeException var4_ref = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            this.cuePullbackDistance = -56;
          }
          if (~this.cueAim.field_d == ~param2 &&
            this.cueAim.field_e == param1) {
            return true;
          }
          var4 = this.findValidCueAim(param1, param2, this.cueAim.polarAngle, this.cuePower, (byte) 95, this.cueAim.azimuth);
          if (null == var4) {
            this.raiseCueBlockedWarning(93);
            return false;
          }
          this.cueAim.field_d = param2;
          this.cueAim.polarAngle = var4[0];
          this.cueAim.field_e = var4[2];
          this.cueAim.field_d = var4[1];
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var4_ref), "uf.WC(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final String getPlayerColonText(int param0) {
        RuntimeException var2 = null;
        String stackIn_2_0 = null;
        String stackIn_7_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 2) {
            stackIn_2_0 = (String) null;
            return stackIn_2_0;
          }
          if (ProgressBarWidget.field_S != 2) {
            stackIn_7_0 = PlasmaBallSkin.playerColon;
          } else {
            stackIn_7_0 = rc.playerColonFr;
          }
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var2), "uf.LB(" + param0 + ')');
        }
    }

    private final boolean updateMouseDrag(int param0) {
        double stackIn_71_0 = 0.0;
        int stackIn_72_1 = 0;
        int stackIn_105_1 = 0;
        int stackIn_106_2 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5_int = 0;
        double var5 = 0.0;
        int var6 = 0;
        double var7 = 0.0;
        int var9 = 0;
        int var2_intLifetime1;
        int var3Lifetime1;
        int var4Lifetime1;
        int var5_intLifetime1;
        double var5Lifetime1;
        int var4Lifetime2;
        var9 = Pool.field_O;
        try {
          if (0 != this.mouseDragMode) {
            if (this.classifyMouseDragMode(9587, cd.field_b, true) != this.mouseDragMode) {
              this.mouseDragMode = 0;
              if (var9 != 0) {
                this.mouseDragMode = this.classifyMouseDragMode(param0 ^ 10487, MatchingTextValidator.field_s, false);
              }
            }
          } else {
            this.mouseDragMode = this.classifyMouseDragMode(param0 ^ 10487, MatchingTextValidator.field_s, false);
          }
          if (this.mouseDragMode != 0) {
            var2_int = this.clockTicks;
            var3 = var2_int;
            var4 = var3 + dk.field_f;
            var5_int = var4 % 7621;
            var6 = var4 / 7621;
            var4Lifetime2 = var5_int + 7621 * ((4 + var6) % 31676);
            dk.field_f = var4Lifetime2 - var3;
            wq.field_c = wq.field_c & -65536 | ((wq.field_c & 65535) + 4) % 31676;
          }
          var2_intLifetime1 = 0;
          if (param0 != 3460) {
            field_hb = -62;
          }
          boolean decompiledFrameRemainder3 = true;
          if (this.dragLastMouseX != -1 &&
            this.dragLastMouseY != -1) {
            boolean decompiledFrameRemainder2 = true;
            var5_intLifetime1 = this.mouseDragMode;
            if (var5_intLifetime1 != 2 ||
              var9 != 0) {
              if (var5_intLifetime1 == 1 &&
                var9 == 0) {
                if ((this.dragLastMouseX != wn.field_i ||
                  DebouncedValidationProvider.field_f != this.dragLastMouseY) &&
                  this.checkTutorialAction(1, 0, false)) {
                  this.idleOrbitStep = -1;
                  var5 = this.camera.getYaw(true);
                  var7 = this.camera.getPitch((byte) 116);
                  if (this.dragLastMouseY != DebouncedValidationProvider.field_f) {
                    stackIn_71_0 = var7;
                    if (th.field_h) {
                      stackIn_72_1 = -(this.dragLastMouseY - DebouncedValidationProvider.field_f);
                    } else {
                      stackIn_72_1 = -DebouncedValidationProvider.field_f + this.dragLastMouseY;
                    }
                    var7 = stackIn_71_0 + (double)stackIn_72_1 * 3.141592653589793 / 2.0 / 480.0;
                  }
                  if (~wn.field_i != ~this.dragLastMouseX) {
                    var5 = var5 + 3.141592653589793 * (double)((wn.field_i - this.dragLastMouseX) * 2) / 640.0;
                  }
                  this.camera.setOrbitAngles(var7, 1, var5);
                  this.cameraGoal.copyFrom(144, this.camera);
                  this.viewMatrixDirty = true;
                  this.cameraPresetIndex = -1;
                }
                var2_intLifetime1 = 1;
              } else {
                boolean decompiledFrameRemainder1 = true;
                if (4 == var5_intLifetime1 &&
                  var9 == 0) {
                  this.idleOrbitStep = -1;
                  var2_intLifetime1 = 1;
                  this.adjustPower((byte) 86, this.dragLastMouseY - DebouncedValidationProvider.field_f);
                  decompiledFrameRemainder3 = false;
                } else {
                  if ((3 != var5_intLifetime1) &&
                    (decompiledFrameRemainder3 = (var5_intLifetime1 == 5))) {
                    decompiledFrameRemainder1 = (var9 != 0);
                    decompiledFrameRemainder2 = !(decompiledFrameRemainder1);
                  }
                }
                if ((decompiledFrameRemainder3) &&
                  (decompiledFrameRemainder2) &&
                  (decompiledFrameRemainder1)) {
                  boolean decompiledFrameRemainder0 = true;
                  var3Lifetime1 = -(-this.dragLastMouseX + wn.field_i);
                  this.idleOrbitStep = -1;
                  if (-20 > var3Lifetime1) {
                    var3Lifetime1 = 3 * (var3Lifetime1 + 20) - 30;
                    decompiledFrameRemainder0 = (var9 != 0);
                  }
                  if (decompiledFrameRemainder0) {
                    if (-10 > var3Lifetime1) {
                      var3Lifetime1 = -10 + 2 * (var3Lifetime1 + 10);
                      decompiledFrameRemainder0 = (var9 != 0);
                    }
                    if (decompiledFrameRemainder0) {
                      if (var3Lifetime1 <= 20) {
                        if (10 < var3Lifetime1) {
                          var3Lifetime1 = (-20 + var3Lifetime1) * 3 + 30;
                          if (var9 != 0) {
                            var3Lifetime1 = var3Lifetime1 * 2 - 20 + 10;
                          }
                        }
                      } else {
                        var3Lifetime1 = var3Lifetime1 * 2 - 20 + 10;
                      }
                    }
                  }
                  if (this.dragLastMouseX != wn.field_i) {
                    this.setAimAzimuth(param0 ^ -3521, this.cueAim.azimuth + var3Lifetime1);
                  }
                  if (~this.dragLastMouseY != ~DebouncedValidationProvider.field_f) {
                    stackIn_105_1 = 512;
                    if (th.field_h) {
                      stackIn_106_2 = -(-DebouncedValidationProvider.field_f + this.dragLastMouseY);
                    } else {
                      stackIn_106_2 = -DebouncedValidationProvider.field_f + this.dragLastMouseY;
                    }
                    this.nudgeAimElevation(stackIn_105_1, stackIn_106_2);
                  }
                  var2_intLifetime1 = 1;
                  MouseWheelInput.field_c.field_g = true;
                  hh.field_c = true;
                  decompiledFrameRemainder3 = (var9 != 0);
                }
                if ((decompiledFrameRemainder3) &&
                  (decompiledFrameRemainder2)) {
                  this.idleOrbitStep = -1;
                  var4Lifetime1 = this.getPowerFromBarPosition((byte) 113);
                  if ((-1 != var4Lifetime1)) {
                    this.setCuePower(var4Lifetime1, true);
                    this.setAimPower(true, var4Lifetime1);
                  }
                }
              }
              if (decompiledFrameRemainder3) {
                decompiledFrameRemainder3 = !(decompiledFrameRemainder2);
              }
            }
            if (decompiledFrameRemainder3) {
              var2_intLifetime1 = 1;
              if ((~this.dragLastMouseX != ~wn.field_i ||
                ~this.dragLastMouseY != ~DebouncedValidationProvider.field_f) && this.checkTutorialAction(1, 1, false)) {
                this.idleOrbitStep = -1;
                var5Lifetime1 = Math.max(12.0, this.camera.getDistance(8) * ((double)(-this.dragLastMouseY + DebouncedValidationProvider.field_f) / 256.0 + 1.0));
                this.camera.setDistance(true, var5Lifetime1);
                this.cameraGoal.setDistance(true, var5Lifetime1);
                this.cameraPresetIndex = -1;
                this.viewMatrixDirty = true;
              }
            }
          }
          if (0 == this.mouseDragMode) {
            this.dragLastMouseY = -1;
            this.dragLastMouseX = -1;
            return false;
          }
          if (var2_intLifetime1 == 0 ||
            this.dragLastMouseX == -1 ||
            this.dragLastMouseY == -1) {
            this.dragLastMouseY = DebouncedValidationProvider.field_f;
            this.dragLastMouseX = wn.field_i;
            if (var9 != 0) {
              StatefulTextPainter.field_s.setCursorPosition((java.awt.Component) ((Object) TextLineLayout.a((byte) -54)), this.dragLastMouseX, -80, this.dragLastMouseY);
            }
          } else {
            StatefulTextPainter.field_s.setCursorPosition((java.awt.Component) ((Object) TextLineLayout.a((byte) -54)), this.dragLastMouseX, -80, this.dragLastMouseY);
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var2), "uf.EE(" + param0 + ')');
        }
    }

    private final int powerToBarPixels(int param0, int param1, int param2) {
        RuntimeException var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == 0) {
            stackIn_4_0 = (int)Math.round((double)param2 * Math.pow((double)param0 / 4096.0, 0.5));
            return stackIn_4_0;
          }
          stackIn_2_0 = 124;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var4), "uf.DA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void playBallEventSounds(int param0) {
        int stackIn_3_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_87_0 = 0;
        int stackIn_87_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        Ball var3 = null;
        BallEvent var4 = null;
        int var5 = 0;
        ShotRecord var5_ref_qe = null;
        int var6_int = 0;
        long var6 = 0L;
        IntrusiveDequeCursor var7 = null;
        PotEvent var8_ref_cr = null;
        long var8 = 0L;
        long var10 = 0L;
        int var12 = 0;
        int stackIn_87_0Lifetime1;
        int stackIn_87_1Lifetime1;
        int var5Lifetime1;
        var12 = Pool.field_O;
        try {
          var2_int = 0;
          while (true) {
            stackIn_3_0 = var2_int;
            boolean decompiledFrameRemainder2 = true;
            if (stackIn_3_0 < this.gameModel.balls.length) {
              var3 = this.gameModel.balls[var2_int];
              var4 = var3.field_q;
              if (var12 != 0) {
                return;
              }
              boolean decompiledFrameRemainder1 = true;
              if ((null != var4 ||
                var12 != 0) && !var4.field_c) {
                if (1 != var4.eventKind) {
                  if (var4.eventKind != 5) {
                    if ((0 == var4.eventKind)) {
                      var5 = 2;
                      scanLoop1: while (true) {
                        var4 = var4.field_f;
                        if (null == var4) {
                          while (true) {
                            stackIn_26_0 = var5;
                            break scanLoop1;
                          }
                        }
                        stackIn_26_0 = var4.field_c ? 1 : 0;
                        while (true) {
                          if (stackIn_26_0 == 0 && (var4.a(-5877, this.gameModel.cushionSegments) ||
                            var12 != 0)) {
                            var5--;
                            if (var5 > 0) {
                              continue scanLoop1;
                            }
                          }
                          stackIn_26_0 = var5;
                          break;
                        }
                        break;
                      }
                      if (stackIn_26_0 == 0) {
                        if (!LobbyGame.field_gc.isSoundPlaying(param0 ^ -657)) {
                          LobbyGame.field_gc.playTableSound(13, 128, (byte) 125, 128);
                        }
                        var3.field_q.field_c = true;
                        decompiledFrameRemainder2 = false;
                      }
                    }
                    if (decompiledFrameRemainder2) {
                      decompiledFrameRemainder1 = false;
                    }
                  }
                  if ((decompiledFrameRemainder2) &&
                    (decompiledFrameRemainder1)) {
                    var5_ref_qe = this.gameModel.currentShot(param0 ^ -704);
                    if (!this.gameModel.rules.isBallInGroup(var5_ref_qe.groupBefore, (byte) 125, var2_int)) {
                      LobbyGame.field_gc.playTableSound(14, 128, (byte) 99, 128);
                      var3.field_q.field_c = true;
                    } else {
                      var6_int = 0;
                      var7 = new IntrusiveDequeCursor(var5_ref_qe.pottedBalls);
                      var8_ref_cr = (PotEvent) (var7.last((byte) -92));
                      while (null != var8_ref_cr) {
                        stackIn_87_0 = var2_int;
                        stackIn_87_1 = var8_ref_cr.ballIndex;
                        if (stackIn_87_0 != stackIn_87_1 &&
                          this.gameModel.rules.isBallInGroup(var5_ref_qe.groupBefore, (byte) 124, var8_ref_cr.ballIndex)) {
                          var6_int = 1;
                        } else {
                          var8_ref_cr = (PotEvent) (var7.previous(param0 ^ 697));
                          continue;
                        }
                        break;
                      }
                      boolean decompiledFrameRemainder0 = true;
                      if (!var5_ref_qe.field_t) {
                        if (var6_int == 0) {
                          if (!(LobbyGame.field_gc.isSoundPlaying(124))) {
                            LobbyGame.field_gc.playTableSound(11, 128, (byte) -112, 128);
                          }
                          decompiledFrameRemainder0 = false;
                        }
                        else {
                          LobbyGame.field_gc.playTableSound(12, 128, (byte) -106, 128);
                        }
                      }
                      var3.field_q.field_c = true;
                    }
                    decompiledFrameRemainder2 = false;
                  }
                }
                if ((decompiledFrameRemainder2) &&
                  (decompiledFrameRemainder1)) {
                  var5Lifetime1 = 0;
                  while (!(this.gameModel.pockets.length <= var5Lifetime1)) {
                    var6 = (long)(-this.gameModel.pockets[var5Lifetime1].centerX + var3.positionX);
                    var8 = (long)(-this.gameModel.pockets[var5Lifetime1].centerY + var3.positionY);
                    var10 = var6 * var6 + var8 * var8 >> 16;
                    stackIn_3_0 = $cfr$lcmp(~var10, -75759617L);
                    if (stackIn_3_0 > 0) {
                      LobbyGame.field_gc.playTableSound(13, 128, (byte) -101, 128);
                      var3.field_q.field_c = true;
                      var3.field_q = null;
                      break;
                    }
                    var5Lifetime1++;
                  }
                }
              }
              if (decompiledFrameRemainder2) {
                var2_int++;
                continue;
              }
            }
            stackIn_87_0Lifetime1 = param0;
            stackIn_87_1Lifetime1 = -709;
            if (stackIn_87_0Lifetime1 != stackIn_87_1Lifetime1) {
              this.k((byte) 81);
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var2), "uf.R(" + param0 + ')');
        }
    }

    final void drawDebugOverlay(int param0, boolean param1) {
        int stackIn_53_0 = 0;
        StringBuilder stackIn_53_1 = null;
        String stackIn_54_2 = null;
        BinaryBitmapFont stackIn_88_0 = null;
        StringBuilder stackIn_88_1 = null;
        String stackIn_89_2 = null;
        BinaryBitmapFont stackIn_96_0 = null;
        String stackIn_97_1 = null;
        int stackIn_154_0 = 0;
        int stackIn_182_0 = 0;
        int stackIn_182_1 = 0;
        int stackIn_182_2 = 0;
        int stackIn_183_3 = 0;
        int stackIn_187_4 = 0;
        int stackIn_190_0 = 0;
        int stackIn_190_1 = 0;
        int stackIn_190_2 = 0;
        int stackIn_191_3 = 0;
        int stackIn_195_4;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        float[] var3 = null;
        String var3_ref = null;
        long var3_long = 0L;
        IntrusiveDequeCursor var3_ref2 = null;
        RuntimeException var3_ref3 = null;
        int[] var4_ref_int__ = null;
        CushionSegment var4_ref_bf = null;
        int var4 = 0;
        ShotRecord var4_ref_qe = null;
        EightBallRules var4_ref_af = null;
        int var5 = 0;
        ShotRecord var5_ref_qe = null;
        String var5_ref_String = null;
        int var6 = 0;
        Ball var6_ref_pq = null;
        CueAim var6_ref_kj = null;
        GrowableIntList var6_ref_tc = null;
        AimTarget var6_ref_df = null;
        int var7 = 0;
        String var7_ref_String = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        String var13 = null;
        ShotRecord var4_ref_qeLifetime1;
        int var3_intLifetime1;
        int var3_intLifetime2;
        int var3_intLifetime3;
        int var3_intLifetime4;
        int var3_intLifetime5;
        int var3_intLifetime6;
        int var3_intLifetime7;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var4Lifetime4;
        int var4Lifetime5;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime3;
        int var5Lifetime4;
        int var5Lifetime5;
        int var5Lifetime6;
        int var6Lifetime1;
        int var6Lifetime2;
        int var6Lifetime3;
        int var7Lifetime1;
        int var7Lifetime2;
        int var7Lifetime3;
        int var7Lifetime4;
        int var8Lifetime1;
        int var8Lifetime2;
        int var8Lifetime3;
        int var8Lifetime4;
        int var9Lifetime1;
        int var9Lifetime2;
        int var10Lifetime1;
        int var10Lifetime2;
        int var11Lifetime1;
        int var12Lifetime1;
        int var3_intLifetime8;
        int var5Lifetime7;
        int var6Lifetime4;
        int var7Lifetime5;
        int var8Lifetime5;
        int var9Lifetime3;
        int var10Lifetime3;
        try {
          if ((2L & LinkButtonPainter.field_i) != 0L) {
            cl.drawProjectedLine(16751001, param0 ^ 301, this.viewMatrix, new float[]{288.0f, 144.0f, 0.0f}, new float[]{432.0f, 144.0f, 0.0f});
            cl.drawProjectedLine(10092441, 1, this.viewMatrix, new float[]{288.0f, 144.0f, 0.0f}, new float[]{288.0f, 288.0f, 0.0f});
            cl.drawProjectedLine(10066431, 1, this.viewMatrix, new float[]{288.0f, 144.0f, 0.0f}, new float[]{288.0f, 144.0f, 144.0f});
          }
          if ((LinkButtonPainter.field_i & 16L) != 0L &&
            !this.gameModel.isCuePathClear(this.cueAim.field_e, this.cueAim.azimuth, this.cueAim.polarAngle, 359, this.cuePower, this.cueAim.field_d)) {
            sa.field_h.drawCentered("cue intersects something!", 320, 240, 16764142, 1);
          }
          if ((8192L & LinkButtonPainter.field_i) != 0L) {
            for (var3_int = 0; var3_int < this.gameModel.cushionSegments.length; var3_int++) {
              var4_ref_bf = this.gameModel.cushionSegments[var3_int];
              var5 = -this.viewMatrix[0] + (var4_ref_bf.startX + var4_ref_bf.endX >> 14);
              var6 = (var4_ref_bf.endY + var4_ref_bf.startY >> 14) - this.viewMatrix[1];
              var7 = -64 - this.viewMatrix[2];
              var8 = var6 * this.viewMatrix[10] + var5 * this.viewMatrix[9] + var7 * this.viewMatrix[11] >> 16;
              if (var8 > 0) {
                var9 = 320 + (this.viewMatrix[3] * var5 + (var6 * this.viewMatrix[4] + this.viewMatrix[5] * var7) >> 7) / var8;
                var10 = (var6 * this.viewMatrix[7] + (this.viewMatrix[6] * var5 + var7 * this.viewMatrix[8]) >> 7) / var8 + 240;
                if (SoftwareRasterizer.clipLeft < var9 &&
                  var9 < SoftwareRasterizer.clipRight &&
                  var10 > SoftwareRasterizer.clipTop &&
                  SoftwareRasterizer.clipBottom > var10) {
                  sa.field_h.drawCentered("wall " + var3_int, var9, var10, 16768409, 3355443);
                  SoftwareRasterizer.drawLine(-4 + var9, var10, var9 + 4, var10, 16768409);
                  SoftwareRasterizer.drawLine(var9, -4 + var10, var9, var10 + 4, 16768409);
                }
              }
            }
            for (var3_intLifetime8 = 0; var3_intLifetime8 < this.gameModel.field_e.length; var3_intLifetime8++) {
              var4_ref_int__ = this.gameModel.field_e[var3_intLifetime8];
              var5Lifetime7 = (var4_ref_int__[0] >> 13) - this.viewMatrix[0];
              var6Lifetime4 = -this.viewMatrix[1] + (var4_ref_int__[1] >> 13);
              var7Lifetime5 = -64 - this.viewMatrix[2];
              var8Lifetime5 = this.viewMatrix[11] * var7Lifetime5 + this.viewMatrix[10] * var6Lifetime4 + this.viewMatrix[9] * var5Lifetime7 >> 16;
              if (0 < var8Lifetime5) {
                var9Lifetime3 = (this.viewMatrix[4] * var6Lifetime4 + (this.viewMatrix[3] * var5Lifetime7 + this.viewMatrix[5] * var7Lifetime5) >> 7) / var8Lifetime5 + 320;
                var10Lifetime3 = 240 + (var5Lifetime7 * this.viewMatrix[6] + var6Lifetime4 * this.viewMatrix[7] + var7Lifetime5 * this.viewMatrix[8] >> 7) / var8Lifetime5;
                if (SoftwareRasterizer.clipLeft < var9Lifetime3 &&
                  SoftwareRasterizer.clipRight > var9Lifetime3 &&
                  var10Lifetime3 > SoftwareRasterizer.clipTop &&
                  var10Lifetime3 < SoftwareRasterizer.clipBottom) {
                  sa.field_h.d("point " + var3_intLifetime8, var9Lifetime3, var10Lifetime3, 14522879, 3355443);
                  SoftwareRasterizer.drawLine(-4 + var9Lifetime3, var10Lifetime3, var9Lifetime3 + 4, var10Lifetime3, 16768409);
                  SoftwareRasterizer.drawLine(var9Lifetime3, var10Lifetime3 - 4, var9Lifetime3, var10Lifetime3 + 4, 16768409);
                }
              }
            }
          }
          if ((8L & LinkButtonPainter.field_i) != 0L) {
            var3 = new float[3];
            for (var4 = -1 + LinkButtonPainter.field_f.length; var4 >= 0; var4--) {
              var5Lifetime1 = LinkButtonPainter.field_f[var4];
              if (var5Lifetime1 < this.gameModel.balls.length) {
                var6_ref_pq = this.gameModel.balls[var5Lifetime1];
                var3[0] = (float)(var6_ref_pq.positionX / 8192);
                var3[2] = (float)(var6_ref_pq.positionZ / 8192);
                var3[1] = (float)(var6_ref_pq.positionY / 8192);
                ag.projectToScreen(this.viewMatrix, var3, param0 ^ 293);
                var7Lifetime1 = (int)(0.5f + var3[0]);
                var8Lifetime1 = (int)(0.5f + var3[1]);
                stackIn_53_0 = var8Lifetime1;
                stackIn_53_1 = new StringBuilder();
                if (var6_ref_pq.inPlay) {
                  stackIn_54_2 = "in play: ";
                } else {
                  stackIn_54_2 = "potted: ";
                }
                DialWidget.a(stackIn_53_0, ((StringBuilder) (Object) stackIn_53_1).append(stackIn_54_2).append(var6_ref_pq.describeMotionState(param0 - 12350)).toString(), var7Lifetime1, 1, sa.field_h, true, 11193599);
                var8Lifetime1 = var8Lifetime1 - (sa.field_h.maxDescent + sa.field_h.maxAscent);
                if (QuickChatPhraseDefinition.field_D != null &&
                  QuickChatPhraseDefinition.field_D[var5Lifetime1] != null) {
                  DialWidget.a(var8Lifetime1, "finished: " + QuickChatPhraseDefinition.field_D[var5Lifetime1].field_o.isSamplePositionOutOfRange(), var7Lifetime1, 1, sa.field_h, true, 11193599);
                  var8Lifetime1 = var8Lifetime1 - (sa.field_h.maxAscent + sa.field_h.maxDescent);
                }
                DialWidget.a(var8Lifetime1, "@" + var6_ref_pq.positionX + "," + var6_ref_pq.positionY, var7Lifetime1, 1, sa.field_h, true, 65535);
                var8Lifetime1 = var8Lifetime1 - (sa.field_h.maxAscent + sa.field_h.maxDescent);
                DialWidget.a(var8Lifetime1, Integer.toString(var5Lifetime1), var7Lifetime1, 1, sa.field_h, true, 11193599);
                var8Lifetime1 = var8Lifetime1 - (sa.field_h.maxDescent + sa.field_h.maxAscent);
              }
            }
          }
          if (0L != (32768L & LinkButtonPainter.field_i)) {
            sa.field_h.d(LobbyGame.field_gc.describeLighting((byte) 123), 10, 50, 16772795, 1);
            sa.field_h.d(LobbyGame.field_gc.describeAmbientLight((byte) 32), 10, 70, 16772795, 1);
            cl.drawProjectedLine(16772795, 1, this.viewMatrix, new float[]{KillerRules.e(2304, 3), KillerRules.e(1152, param0 - 297), 0.0f}, new float[]{KillerRules.e(LobbyGame.field_gc.field_q + 2304, 3), KillerRules.e(1152 + LobbyGame.field_gc.field_e, 3), KillerRules.e(0 + LobbyGame.field_gc.field_u, 3)});
          }
          if ((LinkButtonPainter.field_i & 4194304L) != 0L) {
            var3_ref = "extra_model_dist=" + hf.field_a + "; extra_model_dist_scatter=" + fl.field_l + "; extra_model_z=" + LobbyGame.field_vc + "; num_extra_models=" + ek.field_a;
            sa.field_h.d(var3_ref, 10, 70, 15650047, 1);
          }
          if ((LinkButtonPainter.field_i & 65536L) != 0L) {
            sa.field_h.d("Generated balls: Segments=" + MatchingTextValidator.field_v + ", slices=" + ViewportController.field_b + ", polys/ball=" + MatchingTextValidator.field_v * (ViewportController.field_b * 2), 10, 70, 16772795, 1);
            var3_intLifetime1 = -sa.field_h.maxDescent + 480 - 4;
            for (var4Lifetime1 = 0; var4Lifetime1 < LinkButtonPainter.field_f.length; var4Lifetime1++) {
              sa.field_h.d(var4Lifetime1 + ": " + LinkButtonPainter.field_f[var4Lifetime1] + " dist=" + GrowableIntList.field_d[var4Lifetime1], 300, var3_intLifetime1, 16772829, 0);
              var3_intLifetime1 = var3_intLifetime1 - 3 * sa.field_h.maxAscent / 2;
            }
          }
          if (param0 != 300) {
            this.adjustPower((byte) -76, 91);
          }
          if ((1L & LinkButtonPainter.field_i) != 0L) {
            HuffmanCodec.a((byte) 114);
          }
          if (0L != (8192L & LinkButtonPainter.field_i)) {
            var3_intLifetime2 = 476 - sa.field_h.maxDescent;
            sa.field_h.d("currentplayer " + this.gameModel.field_A + ", extra shots " + this.gameModel.field_z + ", extra visits " + this.gameModel.field_y, 300, var3_intLifetime2, 16772829, 0);
            var3_intLifetime2 = var3_intLifetime2 - sa.field_h.maxAscent * 3 / 2;
          }
          if ((2L & LinkButtonPainter.field_i) != 0L) {
            var3_intLifetime3 = -4 - sa.field_h.maxDescent + 480;
            sa.field_h.d("cur cam ang " + (int)(this.camera.getYaw(true) * 180.0 / 3.141592653589793) + ", " + (int)(180.0 * this.camera.getPitch((byte) 106) / 3.141592653589793) + ", dist " + this.camera.getDistance(param0 ^ 292), 300, var3_intLifetime3, 16772829, 0);
            var3_intLifetime3 = var3_intLifetime3 - 3 * sa.field_h.maxAscent / 2;
            sa.field_h.d("drag " + this.mouseDragMode + ", prev=" + this.dragLastMouseX + ", " + this.dragLastMouseY, 300, var3_intLifetime3, 16772829, 0);
            var3_intLifetime3 = var3_intLifetime3 - 3 * sa.field_h.maxAscent / 2;
            sa.field_h.d("cur tgt " + this.camera.targetX / 576.0 + ", " + this.camera.targetY / 288.0 + ", " + (this.camera.targetZ + 8.0) / 512.0, 300, var3_intLifetime3, 16772829, 0);
            var3_intLifetime3 = var3_intLifetime3 - sa.field_h.maxAscent * 3 / 2;
            sa.field_h.d("cur pos " + this.camera.eyeX / 576.0 + ", " + this.camera.eyeY / 288.0 + ", " + this.camera.eyeZ / 512.0, 300, var3_intLifetime3, 16772829, 0);
            var3_intLifetime3 = var3_intLifetime3 - 3 * sa.field_h.maxAscent / 2;
            var4_ref_qe = new ShotRecord();
            var5_ref_qe = var4_ref_qe;
            var6_ref_kj = this.cueAim;
            var5_ref_qe.power = (short)var6_ref_kj.field_n;
            var5_ref_qe.elevation = (short)var6_ref_kj.polarAngle;
            var5_ref_qe.field_H = (byte)var6_ref_kj.field_e;
            var5_ref_qe.field_D = (byte)var6_ref_kj.field_d;
            var5_ref_qe.aimAngle = (short)((var6_ref_kj.azimuth + 1024) % 2048);
            sa.field_h.d(var4_ref_qe.describeAim(param0 - 300), 300, var3_intLifetime3, 16772829, 0);
            var3_intLifetime3 = var3_intLifetime3 - sa.field_h.maxAscent * 3 / 2;
            sa.field_h.d("cue ang " + this.cueAim.azimuth + ", " + this.cueAim.polarAngle + ", power " + this.cuePower + ", loc " + MouseWheelInput.field_c.field_l[0] + ",  " + MouseWheelInput.field_c.field_l[1] + ", " + MouseWheelInput.field_c.field_l[2], 300, var3_intLifetime3, 16772829, 0);
            var3_intLifetime3 = var3_intLifetime3 - sa.field_h.maxAscent * 3 / 2;
            stackIn_88_0 = sa.field_h;
            stackIn_88_1 = new StringBuilder().append("shot_camera_strategy  ").append(this.shotCameraStrategy);
            if (this.shotModeActive) {
              stackIn_89_2 = " tracking";
            } else {
              stackIn_89_2 = "";
            }
            ((BinaryBitmapFont) (Object) stackIn_88_0).d(((StringBuilder) (Object) stackIn_88_1).append(stackIn_89_2).toString(), 300, var3_intLifetime3, 16772829, 0);
            var3_intLifetime3 = var3_intLifetime3 - 3 * sa.field_h.maxAscent / 2;
            sa.field_h.d("camera_location " + this.cameraPresetIndex, 300, var3_intLifetime3, 16772829, 0);
          }
          if ((2048L & LinkButtonPainter.field_i) != 0L) {
            stackIn_96_0 = sa.field_h;
            if (!this.debugPaused) {
              stackIn_97_1 = "||";
            } else {
              stackIn_97_1 = "|>";
            }
            ((BinaryBitmapFont) (Object) stackIn_96_0).d(stackIn_97_1, -(sa.field_h.maxAscent * 2) + 640, -10 + (480 + (-(2 * sa.field_h.maxDescent) - sa.field_h.maxAscent)), 16777215, 1);
          }
          if ((128L & LinkButtonPainter.field_i) != 0L) {
            this.drawShotListsDebug((byte) -28);
          }
          if ((16777216L & LinkButtonPainter.field_i) != 0L) {
            if (RankingsScreen.field_N.d(-11414)) {
              var3_long = RankingsScreen.field_N.c((byte) -93);
              var5Lifetime2 = (int)(var3_long / 1000L);
              var6Lifetime1 = var5Lifetime2 / 1000;
              var5Lifetime2 = var5Lifetime2 % 1000;
              var7Lifetime2 = var6Lifetime1 / 60;
              sa.field_h.d("midip: ", 10, 380, 13421823, 1118515);
              var6Lifetime1 = var6Lifetime1 % 60;
              sa.field_h.c(Integer.toString(var7Lifetime2), 68, 380, 13421823, 1118515);
              sa.field_h.c(Integer.toString(var6Lifetime1), 85, 380, 13421823, 1118515);
              sa.field_h.c(Integer.toString(var5Lifetime2), 110, 380, 13421823, 1118515);
            } else {
              sa.field_h.d("midip: stopped", 10, 380, 13421823, 1118515);
            }
          }
          if ((1048576L & LinkButtonPainter.field_i) != 0L) {
            var3_intLifetime4 = 320;
            var4Lifetime2 = 40;
            for (var5Lifetime3 = 0; this.gameModel.pockets.length > var5Lifetime3; var5Lifetime3++) {
              var6_ref_tc = this.gameModel.pockets[var5Lifetime3].pottedBalls;
              if (null != var6_ref_tc &&
                var6_ref_tc.size((byte) 122) > 0) {
                var7_ref_String = "pocket " + var5Lifetime3 + ": " + var6_ref_tc.get(0, 2229);
                for (var8Lifetime2 = 1; var6_ref_tc.size((byte) 112) > var8Lifetime2; var8Lifetime2++) {
                  var7_ref_String = var7_ref_String + ", " + var6_ref_tc.get(var8Lifetime2, param0 + 1929);
                }
                sa.field_h.d(var7_ref_String, var3_intLifetime4, var4Lifetime2, 10066329, 8947848);
                var4Lifetime2 = var4Lifetime2 + sa.field_h.baselineHeight;
              }
            }
          }
          if ((67108864L & LinkButtonPainter.field_i) != 0L) {
            var3_intLifetime5 = 60;
            var4Lifetime3 = 0;
            while (!(SoftwareRasterizer.height <= var3_intLifetime5)) {
              if (md.achievementNames.length <= var4Lifetime3) {
                break;
              }
              var5_ref_String = md.achievementNames[var4Lifetime3];
              if (ButtonWidget.a(ClientException.field_g, -13671, var4Lifetime3)) {
                var5_ref_String = var5_ref_String + " [all]";
              }
              if (ButtonWidget.a(hp.field_c, -13671, var4Lifetime3)) {
                var5_ref_String = var5_ref_String + " [this game]";
              }
              if (md.achievementNames[var4Lifetime3] != var5_ref_String) {
                sa.field_h.d(var5_ref_String, 40, var3_intLifetime5, 16764074, 1);
                var3_intLifetime5 = var3_intLifetime5 + sa.field_h.baselineHeight;
              }
              var4Lifetime3++;
            }
          }
          if ((134217728L & LinkButtonPainter.field_i) != 0L) {
            var3_ref2 = new IntrusiveDequeCursor(this.gameModel.shots);
            var4_ref_qeLifetime1 = (ShotRecord) (var3_ref2.last((byte) -92));
            var5Lifetime4 = 0;
            var6Lifetime2 = 0;
            var7Lifetime3 = 60;
            var8Lifetime3 = 40;
            var9Lifetime1 = 80;
            while (SoftwareRasterizer.height > var7Lifetime3) {
              if (null != var4_ref_qeLifetime1) {
                if (null != var4_ref_qeLifetime1.field_U) {
                  var10Lifetime1 = 0;
                  stackIn_154_0 = ((1 & var4_ref_qeLifetime1.playerIndex) != 0) ? var9Lifetime1 : var8Lifetime3;
                  var11 = stackIn_154_0;
                  for (var12 = 0; var12 < var4_ref_qeLifetime1.field_U.length; var12++) {
                    var13 = "+" + var4_ref_qeLifetime1.field_U[var12];
                    sa.field_h.d(var13, var11, var7Lifetime3, 16777215, 1);
                    var11 = var11 + sa.field_h.b(var13);
                    var10Lifetime1 = var10Lifetime1 + var4_ref_qeLifetime1.field_U[var12];
                  }
                  sa.field_h.d(" =" + var10Lifetime1, var11, var7Lifetime3, 16764074, 1);
                  if ((1 & var4_ref_qeLifetime1.playerIndex) == 0) {
                    var5Lifetime4 = var5Lifetime4 + var10Lifetime1;
                  } else {
                    var6Lifetime2 = var6Lifetime2 + var10Lifetime1;
                  }
                  var7Lifetime3 = var7Lifetime3 + sa.field_h.baselineHeight;
                }
                var4_ref_qeLifetime1 = (ShotRecord) (var3_ref2.previous(-96));
                continue;
              }
              break;
            }
            sa.field_h.d("p1=" + var5Lifetime4, var8Lifetime3, var7Lifetime3, 16764074, 1);
            sa.field_h.d("p2=" + var6Lifetime2, var9Lifetime1, var7Lifetime3, 16764074, 1);
            var7Lifetime3 = var7Lifetime3 + sa.field_h.baselineHeight;
          }
          if ((LinkButtonPainter.field_i & 262144L) != 0L &&
            Ball.field_i != null) {
            dn.drawBallEventDebug(0, param0 + 30109, 3, Ball.field_i);
          }
          if ((LinkButtonPainter.field_i & 16777216L) != 0L) {
            this.drawAudioFalloffDebug((byte) 95);
          }
          if ((8388608L & LinkButtonPainter.field_i) != 0L) {
            this.gameModel.computeAimTargets(12226, 0);
            var3_intLifetime6 = this.gameModel.balls[0].positionX >> 13;
            var4Lifetime4 = this.gameModel.balls[0].positionY >> 13;
            for (var5Lifetime5 = 1; this.gameModel.field_r.length > var5Lifetime5; var5Lifetime5++) {
              var6_ref_df = this.gameModel.field_r[var5Lifetime5];
              if (var6_ref_df.a((byte) -8, 0, this.gameModel)) {
                stackIn_182_0 = param0 - 293;
                stackIn_182_1 = var4Lifetime4;
                stackIn_182_2 = -64;
                if (var6_ref_df.field_j) {
                  stackIn_183_3 = 255;
                } else {
                  stackIn_183_3 = 64;
                }
                if (var6_ref_df.targetIsBall) {
                  stackIn_187_4 = 16727871;
                } else {
                  stackIn_187_4 = 4145151;
                }
                co.a(stackIn_182_0, stackIn_182_1, stackIn_182_2, stackIn_183_3, stackIn_187_4, this.viewMatrix, var3_intLifetime6 + (UiComponentNode.sineFixed(var6_ref_df.field_k, (byte) -120) * (var6_ref_df.distance >> 13) >> 16), -64, (EightBallRules.sineLookup((byte) -128, var6_ref_df.field_k) * (var6_ref_df.distance >> 13) >> 16) + var4Lifetime4, var3_intLifetime6);
                stackIn_190_0 = 7;
                stackIn_190_1 = var4Lifetime4;
                stackIn_190_2 = -64;
                if (!var6_ref_df.field_j) {
                  stackIn_191_3 = 64;
                } else {
                  stackIn_191_3 = 255;
                }
                if (var6_ref_df.targetIsBall) {
                  stackIn_195_4 = 16744255;
                } else {
                  stackIn_195_4 = 4161535;
                }
                co.a(stackIn_190_0, stackIn_190_1, stackIn_190_2, stackIn_191_3, stackIn_195_4, this.viewMatrix, (UiComponentNode.sineFixed(var6_ref_df.field_d, (byte) 92) * (var6_ref_df.distance >> 13) >> 16) + var3_intLifetime6, -64, var4Lifetime4 + (EightBallRules.sineLookup((byte) -128, var6_ref_df.field_d) * (var6_ref_df.distance >> 13) >> 16), var3_intLifetime6);
              }
            }
          }
          if ((LinkButtonPainter.field_i & 536870912L) != 0L) {
            var3_intLifetime7 = 480 - sa.field_h.maxDescent - 4;
            if (this.gameModel.rules instanceof EightBallRules) {
              var4_ref_af = (EightBallRules) (this.gameModel.rules);
              sa.field_h.d("groups allocations: {" + var4_ref_af.field_g[0] + ", " + var4_ref_af.field_g[1] + "}", 300, var3_intLifetime7, 16772829, 0);
              var3_intLifetime7 = var3_intLifetime7 - sa.field_h.maxAscent * 3 / 2;
            }
            sa.field_h.d("shot mode: " + this.shotModeActive, 300, var3_intLifetime7, 16772829, 0);
            var3_intLifetime7 = var3_intLifetime7 - 3 * sa.field_h.maxAscent / 2;
            sa.field_h.d("ruleset: " + this.gameModel.rules.getClass().getName(), 300, var3_intLifetime7, 16772829, 0);
            var3_intLifetime7 = var3_intLifetime7 - sa.field_h.maxAscent * 3 / 2;
            sa.field_h.d("cg.currentplayer: " + this.gameModel.field_A, 300, var3_intLifetime7, 16772829, 0);
            var3_intLifetime7 = var3_intLifetime7 - 3 * sa.field_h.maxAscent / 2;
            var4Lifetime5 = 0;
            var5Lifetime6 = 0;
            var6Lifetime3 = 3456;
            var7Lifetime4 = 1152;
            for (var8Lifetime4 = 0; var8Lifetime4 < 2000; var8Lifetime4++) {
              var4Lifetime5 += 2048;
              if (var4Lifetime5 >= 262144) {
                var5Lifetime6 = var5Lifetime6 + dn.a(67108864 / (var4Lifetime5 >> 8), false);
              } else {
                var5Lifetime6 += 256;
              }
              var5Lifetime6 = var5Lifetime6 % 4096;
              var9Lifetime2 = (EightBallRules.sineLookup((byte) -123, var5Lifetime6) >> 4) * (var4Lifetime5 >> 12);
              var10Lifetime2 = (UiComponentNode.sineFixed(var5Lifetime6, (byte) -67) >> 4) * (var4Lifetime5 >> 12);
              var11Lifetime1 = 3456 + (var9Lifetime2 >> 13);
              var12Lifetime1 = 1152 + (var10Lifetime2 >> 13);
              IndexedSpriteState.drawProjectedLine(var12Lifetime1, this.viewMatrix, var6Lifetime3, -28361, 13408614, var11Lifetime1, var7Lifetime4, 0, 0);
              cd.drawProjectedCross(var11Lifetime1, var12Lifetime1, this.viewMatrix, 16764057, 10521, 0);
              var7Lifetime4 = var12Lifetime1;
              var6Lifetime3 = var11Lifetime1;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref3 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var3_ref3), "uf.AE(" + param0 + ',' + param1 + ')');
        }
    }

    private final void enterShotMode(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          this.cameraPresetIndex = -1;
          this.cameraGoal.focusOnCueBall(this, 1);
          if (param0 != 117) {
            this.leaveShotMode(false, (byte) 49);
          }
          this.viewMatrixDirty = true;
          this.cameraGoal.setDistance(true, 1.0);
          this.shotModeActive = true;
          AlignedIconLabel.c(false);
          this.cueAim.field_n = this.cuePower;
          this.idleOrbitStep = -1;
          LobbyGame.field_gc.playTableSound(9, 256, (byte) -112, 128);
          LobbyGame.field_gc.updateHumPitch(-50, this.cueAim.field_n);
          this.powerPulseTick = 0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var2), "uf.M(" + param0 + ')');
        }
    }

    final void attachTutorial(int param0, String[] param1, TutorialController param2) {
        Ball[] array$0 = null;
        int var7 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        PoolGameModel var4 = null;
        RuntimeException var4_ref = null;
        PoolGameModel var5 = null;
        int var6 = 0;
        int var6Lifetime1;
        try {
          un.a(676);
          vi.a(-7414);
          this.tutorial = param2;
          this.introDelayTicks = 200;
          this.tutorial.field_a = this;
          this.initGameModel(param1, this.tutorial.field_n, -115, -1);
          this.startNewRack((byte) -121);
          var4 = this.gameModel;
          f.field_g = 12;
          var5 = var4;
          Ball.field_B = new Ball[12][];
          for (var6 = 0; var6 < Ball.field_B.length; var6++) {
            array$0 = new Ball[var5.balls.length];
            Ball.field_B[var6] = array$0;
            for (var7 = 0; var7 < Ball.field_B[var6].length; var7++) {
              Ball.field_B[var6][var7] = new Ball();
            }
          }
          ArchiveLoadSequence.field_e = new GlowSprite[Ball.field_B.length * 12];
          if (param0 <= 25) {
            return;
          }
          for (var6Lifetime1 = 0; ArchiveLoadSequence.field_e.length > var6Lifetime1; var6Lifetime1++) {
            ArchiveLoadSequence.field_e[var6Lifetime1] = new GlowSprite();
          }
          QuickChatPhraseRegistry.field_g = 0;
          this.setUpTheme(0, 0, 126);
          this.tutorial.restart(-1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_18_0 = var4_ref;
          stackIn_18_1 = new StringBuilder().append("uf.UC(").append(param0).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param2 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    private final void aimCameraAtMovingBalls(int param0) {
        long var2_long = 0L;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var7Lifetime1;
        try {
          var2_long = 0L;
          var4 = 0L;
          var6 = 0;
          for (var7 = 0; this.gameModel.balls.length > var7; var7++) {
            if (this.gameModel.balls[var7].inPlay &&
              this.gameModel.balls[var7].motionState != 0) {
              var2_long = var2_long + (long)this.gameModel.balls[var7].positionX;
              var4 = var4 + (long)this.gameModel.balls[var7].positionY;
              var6++;
            }
          }
          var7Lifetime1 = 45 % ((-21 - param0) / 58);
          this.idleOrbitStep = -1;
          this.cameraGoal.targetX = PotEvent.a((byte) 89, var2_long) / (double)var6;
          this.cameraGoal.targetY = PotEvent.a((byte) 89, var4) / (double)var6;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var2), "uf.IC(" + param0 + ')');
        }
    }

    private final void updateCueBlockedWarning(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (ij.field_G > 0) {
            if (ij.field_G > 25) {
              AlignedIconLabel.c(false);
              LoginForm.a(RasterSnapshot.cannotPositionCueThere, 16729156, -6, false, 1);
              TextLineLayout.a((String) null, (byte) 18, jd.cueCantGoThere, 7);
            }
            ij.field_G = ij.field_G - 1;
            if (ij.field_G == 0) {
              qg.a((byte) 48, 7);
            }
          }
          if (param0 != -47) {
            this.loadStateSnapshot(-48, (PacketBuffer) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var2), "uf.KC(" + param0 + ')');
        }
    }

    final void rerackBalls(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          MouseWheelInput.field_c.field_g = true;
          if (param0 != 0) {
            this.cuePower = -11;
          }
          hh.field_c = true;
          this.gameModel.c(param0 ^ -88);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var2), "uf.OA(" + param0 + ')');
        }
    }

    private final void raiseCueBlockedWarning(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (ij.field_G < 50) {
            ij.field_G = ij.field_G + 2;
          }
          if (param0 <= 88) {
            this.refillRackFromPockets((byte) 65);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var2), "uf.BC(" + param0 + ')');
        }
    }

    private final void setUpTheme(int param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          DualLinkNodeHashTable.field_k = new UiComponent();
          q.field_b = new UiComponent();
          InstructionsScreen.field_H = new UiComponent();
          SpriteState.field_F = new UiComponent();
          AimTarget.field_f = new UiComponent();
          AlternateLongAndTextLoginPayload.field_q = new UiComponent();
          this.updatePlayerInfoButtonSprites(false);
          q.field_b.sprite = ClassicBallSkin.field_n;
          InstructionsScreen.field_H.sprite = RasterBuffer.field_d;
          SpriteState.field_F.sprite = gd.field_e;
          AimTarget.field_f.sprite = il.field_a;
          AlternateLongAndTextLoginPayload.field_q.sprite = TableScene.field_D;
          if (LobbyGame.field_gc != nn.field_b[param1]) {
            if (null != LobbyGame.field_gc) {
              LobbyGame.field_gc.releaseModels(true);
            }
            LobbyGame.field_gc = nn.field_b[param1];
            LobbyGame.field_gc.buildTableGeometry(this.gameModel, 21894);
          }
          LobbyGame.field_gc.createDebugOverlays(this.gameModel, 0);
          LobbyGame.field_gc.b(false);
          if (PoolGameModel.field_B[param0] == dq.field_a) {
            if (dq.field_a.field_j == null ||
              dq.field_a.field_j.length != this.gameModel.balls.length) {
              dq.field_a.prepareForGame(2147483647, this.gameModel);
            }
          } else {
            if (dq.field_a != null) {
              dq.field_a.e(-26707);
            }
            dq.field_a = PoolGameModel.field_B[param0];
            dq.field_a.prepareForGame(2147483647, this.gameModel);
          }
          MouseWheelInput.field_c = LobbyGame.field_gc.field_A;
          MouseWheelInput.field_c.field_g = true;
          LobbyGame.field_gc.setViewMatrix((byte) -116, this.viewMatrix);
          this.gameModel.rules.updateGroupLabels(-83);
          for (var4_int = 0; this.gameModel.balls.length > var4_int; var4_int++) {
            this.gameModel.balls[var4_int].a(120);
            this.gameModel.balls[var4_int].transformDirty = true;
          }
          TextWidgetPainter.field_q = 150;
          ff.field_c = true;
          this.lastHoverMouseY = -1;
          MouseWheelInput.field_c.field_g = true;
          hh.field_c = true;
          wb.field_a = true;
          if (param2 <= 70) {
            this.camera = (Camera) null;
          }
          this.lastHoverMouseX = -1;
          this.viewMatrixDirty = true;
          aq.b(0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var4), "uf.CC(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final String playerStatusText(int param0, int param1) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        StringBuilder discarded$6 = null;
        StringBuilder discarded$7 = null;
        StringBuilder discarded$8 = null;
        StringBuilder discarded$9 = null;
        StringBuilder discarded$10 = null;
        StringBuilder discarded$11 = null;
        StringBuilder discarded$12 = null;
        StringBuilder stackIn_25_0 = null;
        String stackIn_29_1 = null;
        String stackIn_56_0 = null;
        RuntimeException decompiledCaughtException = null;
        StringBuilder var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        try {
          if (param1 != -22804) {
            this.shotModeActive = true;
          }
          var3 = new StringBuilder(this.getPlayerName(-30360, param0));
          var4 = 0;
          if (!(this.gameModel.rules instanceof KillerRules)) {
            if ((this.gameModel.field_p & 1 << param0) != 0) {
              if (var4 != 0) {
                discarded$0 = var3.append(' ');
              } else {
                var4 = 1;
                var3 = new StringBuilder(AccountWelcomePanel.substituteTemplateArguments(new String[]{var3.toString()}, -1, this.getPlayerColonText(2)));
              }
              discarded$1 = var3.append(LabeledChildWidget.statusResigned);
            }
          } else {
            var5 = ((KillerRules) (this.gameModel.rules)).field_e[param0];
            if (var4 != 0) {
              discarded$2 = var3.append(' ');
            } else {
              var3 = new StringBuilder(AccountWelcomePanel.substituteTemplateArguments(new String[]{var3.toString()}, -1, this.getPlayerColonText(2)));
              var4 = 1;
            }
            if (1 >= var5) {
              discarded$3 = var3.append("<col=ff9999>");
            } else {
              if (var5 == 2) {
                discarded$4 = var3.append("<col=ffff99>");
              } else {
                if (3 == var5) {
                  discarded$5 = var3.append("<col=99ff99>");
                } else {
                  if (var5 > 3) {
                    discarded$6 = var3.append("<col=99ffff>");
                  }
                }
              }
            }
            stackIn_25_0 = var3;
            if (this.gameModel.rules.isPlayerActive((byte) 50, param0)) {
              if ((this.gameModel.field_p & 1 << param0) != 0) {
                stackIn_29_1 = LabeledChildWidget.statusResigned;
              } else {
                stackIn_29_1 = Integer.toString(var5);
              }
            } else {
              stackIn_29_1 = DualLinkNode.statusOutOfLives;
            }
            discarded$7 = ((StringBuilder) (Object) stackIn_25_0).append(stackIn_29_1);
            discarded$8 = var3.append("</col>");
          }
          if (this.gameModel.field_o &&
            (1 << param0 & this.gameModel.field_b) != 0) {
            if (var4 != 0) {
              discarded$9 = var3.append(' ');
            } else {
              var3 = new StringBuilder(AccountWelcomePanel.substituteTemplateArguments(new String[]{var3.toString()}, param1 + 22803, this.getPlayerColonText(2)));
              var4 = 1;
            }
            discarded$10 = var3.append(PacketBuffer.statusWantsARematch);
          } else {
            if ((this.gameModel.field_x & 1 << param0) != 0) {
              if (var4 == 0) {
                var3 = new StringBuilder(AccountWelcomePanel.substituteTemplateArguments(new String[]{var3.toString()}, param1 ^ 22803, this.getPlayerColonText(param1 + 22806)));
                var4 = 1;
              } else {
                discarded$11 = var3.append(' ');
              }
              discarded$12 = var3.append(OpacityWidget.statusWantsToDraw);
            }
          }
          stackIn_56_0 = var3.toString();
          return stackIn_56_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var3_ref), "uf.VD(" + param0 + ',' + param1 + ')');
        }
    }

    private final void reseedBreak(int param0, boolean param1) {
        if (param1) {
          return;
        }
        try {
          MouseWheelInput.field_c.field_g = true;
          hh.field_c = true;
          this.gameModel.setBreakSeed(param0, 456);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "uf.FD(" + param0 + ',' + param1 + ')');
        }
    }

    private final void dragSelectedBall(byte param0) {
        RuntimeException decompiledCaughtException = null;
        Ball var2 = null;
        RuntimeException var2_ref = null;
        double[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        ShotRecord var6 = null;
        PoolGameModel var7 = null;
        Ball var8 = null;
        try {
          if (param0 < 106) {
            field_X = 61;
          }
          var2 = this.gameModel.balls[this.draggedBallIndex];
          if (~wn.field_i == ~vn.field_b &&
            CachedArchiveSource.field_m == DebouncedValidationProvider.field_f) {
            return;
          }
          boolean decompiledFrameRemainder0 = true;
          var3 = new double[]{(double)var2.positionX / 65536.0, (double)var2.positionY / 65536.0, (double)var2.positionZ / 65536.0};
          MusicCrossfadeStream.a(-64, DebouncedValidationProvider.field_f, false, this.camera.getDistance(8), wn.field_i, var3, this.viewMatrix);
          var4 = var2.positionX;
          var5 = var2.positionY;
          if (this.gameModel.tryPlaceBall((int)(65536.0 * var3[1] + 0.5), (int)(65536.0 * var3[0] + 0.5), -96, this.draggedBallIndex, true)) {
            vm.field_f = vm.field_f | this.draggedBallIndex;
            if (!this.checkTutorialAction(1, 13, false)) {
              var2.positionX = var4;
              var2.positionY = var5;
              decompiledFrameRemainder0 = (Pool.field_O != 0);
            }
            if (decompiledFrameRemainder0) {
              var2.transformDirty = true;
              hh.field_c = true;
              var2.positionZ = -524288;
              this.ballManhandled = true;
              if (this.draggedBallIndex == 0) {
                MouseWheelInput.field_c.field_g = true;
              }
              var6 = this.gameModel.currentShot(83);
              var7 = this.gameModel;
              var8 = var7.balls[0];
              var6.cueBallY = var8.positionY;
              var6.cueBallX = var8.positionX;
            }
          }
          vn.field_b = wn.field_i;
          CachedArchiveSource.field_m = DebouncedValidationProvider.field_f;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var2_ref), "uf.BE(" + param0 + ')');
        }
    }

    private final void switchTableTheme(byte param0, int param1) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param1 < nn.field_b.length &&
            LobbyGame.field_gc != nn.field_b[param1]) {
            dq.field_a.e(param0 - 26831);
            LobbyGame.field_gc.releaseModels(true);
            LobbyGame.field_gc = nn.field_b[param1];
            MouseWheelInput.field_c = LobbyGame.field_gc.field_A;
            MouseWheelInput.field_c.field_g = true;
            dq.field_a = PoolGameModel.field_B[param1];
            dq.field_a.prepareForGame(2147483647, this.gameModel);
            LobbyGame.field_gc.buildTableGeometry(this.gameModel, 21894);
            LobbyGame.field_gc.setViewMatrix((byte) 115, this.viewMatrix);
            this.gameModel.rules.updateGroupLabels(-42);
          }
          if (param0 != 124) {
            this.playerNameCache = (String[]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var3), "uf.SD(" + param0 + ',' + param1 + ')');
        }
    }

    final boolean isLocalPlayersTurn(int param0) {
        RuntimeException var2 = null;
        boolean stackIn_7_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (~(this.modeFlags & TutorialController.field_c) != param0) {
            stackIn_7_0 = (this.localPlayerIndex == this.gameModel.field_A);
            return stackIn_7_0;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var2), "uf.TC(" + param0 + ')');
        }
    }

    private final void drawStrikePointMarker(boolean param0) {
        float[] var2 = null;
        float var3 = 0.0f;
        float var4 = 0.0f;
        float var5 = 0.0f;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        try {
          if (param0) {
            this.gameModel = (PoolGameModel) null;
          }
          var2 = new float[]{(float)this.gameModel.balls[0].positionX / 65536.0f, (float)this.gameModel.balls[0].positionY / 65536.0f, (float)this.gameModel.balls[0].positionZ / 65536.0f};
          var3 = (float)this.cueAim.field_d / 128.0f;
          var4 = (float)this.cueAim.field_e / 128.0f;
          var5 = (float)Math.sqrt((double)(-(var3 * var3) + 1.0f - var4 * var4));
          var2[1] = var2[1] + 8.0f * (var5 * (float)MouseWheelInput.field_c.field_l[10] + ((float)MouseWheelInput.field_c.field_l[7] * var4 + var3 * (float)MouseWheelInput.field_c.field_l[4])) / 65536.0f;
          var2[0] = var2[0] + 8.0f * (var5 * (float)MouseWheelInput.field_c.field_l[9] + (var3 * (float)MouseWheelInput.field_c.field_l[3] + var4 * (float)MouseWheelInput.field_c.field_l[6])) / 65536.0f;
          var2[2] = var2[2] + 8.0f * (var4 * (float)MouseWheelInput.field_c.field_l[8] + var3 * (float)MouseWheelInput.field_c.field_l[5] + (float)MouseWheelInput.field_c.field_l[11] * var5) / 65536.0f;
          if (this.shotModeActive) {
            ViewportController.a(var2, 16724787, -114, this.viewMatrix);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var2_ref), "uf.WA(" + param0 + ')');
        }
    }

    final void markBallTransformsDirty(int param0) {
        int var2_int = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          for (var2_int = param0; this.gameModel.balls.length > var2_int; var2_int++) {
            this.gameModel.balls[var2_int].transformDirty = true;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var2), "uf.V(" + param0 + ')');
        }
    }

    private final void updateRackBalls(byte param0) {
        int fieldTemp$0 = 0;
        int stackIn_54_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        Ball var8 = null;
        int var9 = 0;
        int var10 = 0;
        int stackIn_54_0Lifetime1;
        int var7Lifetime1;
        var10 = Pool.field_O;
        try {
          var2_int = -240 + this.rackBottom << 16;
          if (param0 < 112) {
            this.updateStatusBarSlide(-58);
          }
          var3 = 240 - (fl.field_q.screenY >> 1);
          var4 = -var3 + this.rackBottom;
          var5 = this.rackTop - var3;
          boolean decompiledSharedTail0 = (!(var5 <= DebouncedValidationProvider.field_f) ||
            !(DebouncedValidationProvider.field_f <= var4) ||
            !(wn.field_i < this.rackWidth));
          if (!decompiledSharedTail0) {
            ff.field_c = true;
            TextWidgetPainter.field_q = 150;
            decompiledSharedTail0 = (var10 != 0);
          }
          if ((decompiledSharedTail0) &&
            (TextWidgetPainter.field_q > 0)) {
            fieldTemp$0 = TextWidgetPainter.field_q - 1;
            TextWidgetPainter.field_q = TextWidgetPainter.field_q - 1;
            if (fieldTemp$0 == 0) {
              ff.field_c = false;
            }
          }
          if (!ff.field_c ||
            !(t.field_e < 0)) {
            if ((!ff.field_c) &&
              (!(-this.rackWidth >= t.field_e))) {
              t.field_e = t.field_e - 1;
              if (var10 != 0) {
                t.field_e = t.field_e + 2;
              }
            }
          } else {
            t.field_e = t.field_e + 2;
          }
          var6 = 0;
          while (this.rackBallCount > var6) {
            var7 = this.rackBallIndices[var6];
            if (var10 != 0) {
              return;
            }
            var8 = this.gameModel.balls[var7];
            scanLoop1: while (true) {
              if (var8.inPlay) {
                var8.field_o = false;
                var8.stop((byte) 87);
                stackIn_54_0 = 1 + var6;
                var9 = stackIn_54_0;
                while (var9 < this.rackBallCount) {
                  this.rackBallIndices[var9 - 1] = this.rackBallIndices[var9];
                  var9++;
                }
                this.rackBallCount = this.rackBallCount - 1;
                if (~this.rackBallCount == ~var6) {
                  return;
                }
                var7Lifetime1 = this.rackBallIndices[var6];
                var8 = this.gameModel.balls[var7Lifetime1];
                continue scanLoop1;
              }
              break;
            }
            var8.transformDirty = true;
            stackIn_54_0Lifetime1 = var8.motionState;
            if (stackIn_54_0Lifetime1 != 0 ||
              !(var8.positionY >= var2_int)) {
              if (var8.velocityY < 262144) {
                var8.velocityY = var8.velocityY + 4096;
                if (var8.motionState == 0) {
                  var8.motionState = 1;
                }
              }
              var8.a((byte) -124);
              var8.lastAdvanceTime = 0;
              var8.a(false);
            }
            if (var2_int <= var8.positionY) {
              var8.positionY = var2_int;
              var8.stop((byte) 102);
            } else {
              var2_int = var8.positionY;
            }
            var2_int = var2_int - 1048576;
            var6++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var2), "uf.UB(" + param0 + ')');
        }
    }

    public static void c(boolean param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          createAgeTooltip = null;
          field_y = (byte[][]) null;
          mouseYAxisNormal = null;
          field_gb = null;
          if (!param0) {
            field_y = (byte[][]) null;
          }
          tickerHintLeaveShotMode = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var1), "uf.KB(" + param0 + ')');
        }
    }

    private final String[] buildPlayerStatusLines(boolean param0) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_11_1 = 0;
        String[] stackIn_35_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        String[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        try {
          if (!param0) {
            this.updateShotCamera(-32);
          }
          stackIn_7_0 = (~this.gameModel.rules.sideCount(111) == ~this.gameModel.playerCount) ? 0 : 1;
          var2_int = stackIn_7_0;
          stackIn_10_0 = this.gameModel.playerCount;
          if (var2_int != 0) {
            stackIn_11_1 = this.gameModel.rules.sideCount(119) - 1;
          } else {
            stackIn_11_1 = 0;
          }
          var3 = new String[stackIn_10_0 + stackIn_11_1];
          var4 = -1;
          var6 = 0;
          var7 = 0;
          while (var6 < var3.length) {
            if (var7 < this.gameModel.playerCount) {
              if (var2_int != 0) {
                var5 = this.gameModel.rules.teamIndex(-119, var7);
                if (var4 != -1 &&
                  ~var5 != ~var4) {
                  incrementValue$0 = var6;
                  var6++;
                  var3[incrementValue$0] = tp.statusVersus;
                }
                var4 = var5;
              }
              if (~this.gameModel.field_A == ~var7) {
                incrementValue$1 = var6;
                var6++;
                var3[incrementValue$1] = "<col=9999ff>" + this.playerStatusText(var7, -22804) + "</col>";
              } else {
                incrementValue$2 = var6;
                var6++;
                var3[incrementValue$2] = this.playerStatusText(var7, -22804);
              }
              var7++;
              continue;
            }
            break;
          }
          stackIn_35_0 = var3;
          return stackIn_35_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var2), "uf.QA(" + param0 + ')');
        }
    }

    final void snapCameraToPreset(int param0) {
        Camera stackIn_7_1 = null;
        int stackIn_7_2 = 0;
        Object stackIn_10_0;
        double[][] stackIn_10_3;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          this.idleOrbitStep = -1;
          if (param0 != -24070) {
            this.drawShotListsDebug((byte) 96);
          }
          stackIn_7_1 = this.cameraGoal;
          stackIn_7_2 = param0 ^ 29962;
          if (un.field_b &&
            (TutorialController.field_c & this.modeFlags) != 0) {
            stackIn_10_0 = this;
            stackIn_10_3 = f.field_a;
          } else {
            stackIn_10_0 = this;
            stackIn_10_3 = f.field_c;
          }
          this.cameraPresetIndex = ((Camera) (Object) stackIn_7_1).snapToNearestPreset(stackIn_7_2, stackIn_10_3);
          this.viewMatrixDirty = true;
          this.tryLeaveShotMode(param0 + 23954);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var2), "uf.GD(" + param0 + ')');
        }
    }

    private final void refillRackFromPockets(byte param0) {
        int var2_int = 0;
        int var4 = 0;
        Pocket var3 = null;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (param0 <= 88) {
            this.camera = (Camera) null;
          }
          this.layoutBallRack(4476);
          this.rackBallCount = 0;
          for (var2_int = 0; var2_int < this.gameModel.pockets.length; var2_int++) {
            var3 = this.gameModel.pockets[var2_int];
            if (null != var3.pottedBalls) {
              for (var4 = 0; var3.pottedBalls.size((byte) 117) > var4; var4++) {
                var5 = var3.pottedBalls.get(var4, 2229);
                this.gameModel.balls[var5].field_o = false;
                this.addBallToRack(0, var5);
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var2), "uf.KA(" + param0 + ')');
        }
    }

    final void requestRematch(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (0 == (TutorialController.field_c & this.modeFlags)) {
            throw new IllegalStateException();
          }
          if (param0 > -15) {
            this.drawDebugOverlay(63, true);
          }
          JaggrabDownloader.field_j.writeCipheredOpcode(false, 68);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var2), "uf.JC(" + param0 + ')');
        }
    }

    private final int placeIndicator(int param0, int param1, int param2, UiComponent param3) {
        RuntimeException var5 = null;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          param3.height = param3.sprite.field_y;
          param3.enabled = true;
          if (param0 != -30818) {
            this.cuePower = -110;
          }
          param3.localX = param1;
          param3.localY = -(param3.sprite.field_y >> 1) + param2;
          param3.width = param3.sprite.field_w;
          param3.drawRoot((byte) -79, false);
          stackIn_4_0 = param1 + param3.sprite.field_w + 2;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("uf.ID(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    private final void fadeShotModeOverlay(int param0) {
        int var2_int = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (this.shotModeActive) {
            if (this.shotModeFade < 1024) {
              this.shotModeFade = this.shotModeFade + 64;
              if (1024 < this.shotModeFade) {
                this.shotModeFade = 1024;
                if (Pool.field_O != 0 &&
                  this.shotModeFade > 0) {
                  this.shotModeFade = this.shotModeFade - 64;
                  if (this.shotModeFade < 0) {
                    this.shotModeFade = 0;
                  }
                }
              }
            }
          } else {
            if (this.shotModeFade > 0) {
              this.shotModeFade = this.shotModeFade - 64;
              if (this.shotModeFade < 0) {
                this.shotModeFade = 0;
              }
            }
          }
          var2_int = -33 / ((20 - param0) / 62);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var2), "uf.WB(" + param0 + ')');
        }
    }

    final void z(byte param0) {
        int[] var2 = null;
        try {
          var2 = dq.field_a.gradientPalette(0, param0 - 1);
          TextLayout.a(gd.field_a, 2, DebugTuningSlider.field_s, 1, this.viewMatrix, (byte) 1, (var2.length - 1) / 4, var2, TextLayout.field_d, param0, kg.field_s);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "uf.SA(" + param0 + ')');
        }
    }

    private final void trySetCueElevation(int param0, int param1) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param1 > 768) {
            param1 = 768;
          }
          if (this.gameModel.isCuePathClear(this.cueAim.field_e, this.cueAim.azimuth, param1, 359, this.cuePower, this.cueAim.field_d)) {
            this.cueAim.polarAngle = param1;
          }
          if (param0 != 1) {
            this.announceBallGroups(10, (ShotRecord) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var3), "uf.DB(" + param0 + ',' + param1 + ')');
        }
    }

    private final void handleDebugKeys(byte param0) {
        MusicTrack dupTemp$0 = null;
        MusicTrack dupTemp$1 = null;
        MusicTrack dupTemp$2 = null;
        MusicTrack dupTemp$3 = null;
        MusicTrack dupTemp$4 = null;
        TableScene stackIn_618_0 = null;
        boolean stackIn_619_1 = false;
        int stackIn_622_0 = 0;
        boolean stackIn_622_1 = false;
        int stackIn_622_2 = 0;
        String stackIn_623_3 = null;
        boolean stackIn_851_0 = false;
        boolean stackIn_858_0 = false;
        int stackIn_863_0 = 0;
        int stackIn_866_0 = 0;
        int stackIn_867_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        Camera var2 = null;
        ij var2_ref = null;
        RuntimeException var2_ref2 = null;
        Camera var3_ref_mm = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = Pool.field_O;
        try {
          if (param0 >= -99) {
            this.updateStrikePointFromMouse(1, -99, 85);
          }
          if (!TextLineLayout.field_c[82]) {
            if (TextLineLayout.field_c[86]) {
              regionExit1: {
                regionExit2: {
                  regionExit3: {
                    boolean decompiledFrameRemainder79 = true;
                    boolean decompiledFrameRemainder78 = true;
                    boolean decompiledFrameRemainder77 = true;
                    boolean decompiledFrameRemainder76 = true;
                    boolean decompiledFrameRemainder75 = true;
                    boolean decompiledFrameRemainder74 = true;
                    boolean decompiledFrameRemainder73 = true;
                    boolean decompiledFrameRemainder72 = true;
                    boolean decompiledFrameRemainder71 = true;
                    boolean decompiledFrameRemainder70 = true;
                    boolean decompiledFrameRemainder69 = true;
                    boolean decompiledFrameRemainder68 = true;
                    boolean decompiledFrameRemainder67 = true;
                    boolean decompiledFrameRemainder66 = true;
                    boolean decompiledFrameRemainder65 = true;
                    boolean decompiledFrameRemainder64 = true;
                    boolean decompiledFrameRemainder63 = true;
                    boolean decompiledFrameRemainder62 = true;
                    boolean decompiledFrameRemainder61 = true;
                    boolean decompiledFrameRemainder60 = true;
                    boolean decompiledFrameRemainder59 = true;
                    boolean decompiledFrameRemainder58 = true;
                    boolean decompiledFrameRemainder57 = true;
                    boolean decompiledFrameRemainder56 = true;
                    boolean decompiledFrameRemainder55 = true;
                    var2_int = IterableDualLinkDeque.field_a;
                    if ((var2_int != 32) &&
                      (decompiledFrameRemainder55 = (var2_int != 48 ||
                      var8 != 0)) &&
                      (decompiledFrameRemainder56 = (var2_int != 33 ||
                      var8 != 0)) &&
                      (decompiledFrameRemainder57 = (49 != var2_int)) &&
                      (decompiledFrameRemainder58 = (var2_int != 34 ||
                      var8 != 0)) &&
                      (decompiledFrameRemainder59 = (var2_int != 50)) &&
                      (decompiledFrameRemainder60 = (var2_int != 35)) &&
                      (decompiledFrameRemainder61 = (var2_int != 51)) &&
                      (decompiledFrameRemainder62 = (var2_int != 36 ||
                      var8 != 0)) &&
                      (decompiledFrameRemainder63 = (var2_int != 52)) &&
                      (decompiledFrameRemainder64 = (var2_int != 37)) &&
                      (decompiledFrameRemainder65 = (53 != var2_int ||
                      var8 != 0)) &&
                      (decompiledFrameRemainder66 = (38 != var2_int ||
                      var8 != 0)) &&
                      (decompiledFrameRemainder67 = (var2_int != 54 ||
                      var8 != 0)) &&
                      (decompiledFrameRemainder68 = (var2_int != 39 ||
                      var8 != 0)) &&
                      (decompiledFrameRemainder69 = (55 != var2_int)) &&
                      (decompiledFrameRemainder70 = (40 != var2_int)) &&
                      (decompiledFrameRemainder71 = (var2_int != 56 ||
                      var8 != 0)) &&
                      (decompiledFrameRemainder72 = (var2_int != 41)) &&
                      (decompiledFrameRemainder73 = (var2_int != 57 ||
                      var8 != 0)) &&
                      (decompiledFrameRemainder74 = (64 != var2_int)) &&
                      (decompiledFrameRemainder75 = (var2_int != 65)) &&
                      (decompiledFrameRemainder76 = (var2_int != 66 ||
                      var8 != 0)) &&
                      (decompiledFrameRemainder77 = (var2_int != 67)) &&
                      (decompiledFrameRemainder78 = (var2_int != 68 ||
                      var8 != 0)) &&
                      (decompiledFrameRemainder79 = (var2_int != 69))) {
                      if (var2_int == 59 &&
                        var8 == 0) {
                        break regionExit3;
                      }
                      if (var2_int == 87 &&
                        var8 == 0) {
                        break regionExit2;
                      }
                      if (var2_int != 88) {
                        return;
                      }
                      if (var8 == 0) {
                        break regionExit1;
                      }
                    }
                    if ((decompiledFrameRemainder79) &&
                      (decompiledFrameRemainder78) &&
                      (decompiledFrameRemainder77) &&
                      (decompiledFrameRemainder76) &&
                      (decompiledFrameRemainder75) &&
                      (decompiledFrameRemainder74) &&
                      (decompiledFrameRemainder73) &&
                      (decompiledFrameRemainder72) &&
                      (decompiledFrameRemainder71) &&
                      (decompiledFrameRemainder70) &&
                      (decompiledFrameRemainder69) &&
                      (decompiledFrameRemainder68) &&
                      (decompiledFrameRemainder67) &&
                      (decompiledFrameRemainder66) &&
                      (decompiledFrameRemainder65) &&
                      (decompiledFrameRemainder64) &&
                      (decompiledFrameRemainder63) &&
                      (decompiledFrameRemainder62) &&
                      (decompiledFrameRemainder61) &&
                      (decompiledFrameRemainder60) &&
                      (decompiledFrameRemainder59) &&
                      (decompiledFrameRemainder58) &&
                      (decompiledFrameRemainder57) &&
                      (decompiledFrameRemainder56) &&
                      (decompiledFrameRemainder55)) {
                      if (!TextLineLayout.field_c[81]) {
                        LobbyGame.field_gc.field_C = LobbyGame.field_gc.field_C + 1;
                        if (var8 == 0) {
                          return;
                        }
                      }
                      LobbyGame.field_gc.field_d = LobbyGame.field_gc.field_d + 1;
                      this.markBallTransformsDirty(0);
                      if (var8 == 0) {
                        return;
                      }
                    }
                    if ((decompiledFrameRemainder79) &&
                      (decompiledFrameRemainder78) &&
                      (decompiledFrameRemainder77) &&
                      (decompiledFrameRemainder76) &&
                      (decompiledFrameRemainder75) &&
                      (decompiledFrameRemainder74) &&
                      (decompiledFrameRemainder73) &&
                      (decompiledFrameRemainder72) &&
                      (decompiledFrameRemainder71) &&
                      (decompiledFrameRemainder70) &&
                      (decompiledFrameRemainder69) &&
                      (decompiledFrameRemainder68) &&
                      (decompiledFrameRemainder67) &&
                      (decompiledFrameRemainder66) &&
                      (decompiledFrameRemainder65) &&
                      (decompiledFrameRemainder64) &&
                      (decompiledFrameRemainder63) &&
                      (decompiledFrameRemainder62) &&
                      (decompiledFrameRemainder61) &&
                      (decompiledFrameRemainder60) &&
                      (decompiledFrameRemainder59) &&
                      (decompiledFrameRemainder58) &&
                      (decompiledFrameRemainder57) &&
                      (decompiledFrameRemainder56)) {
                      if (!TextLineLayout.field_c[81]) {
                        LobbyGame.field_gc.field_C = LobbyGame.field_gc.field_C - 1;
                        if (var8 == 0) {
                          return;
                        }
                      }
                      LobbyGame.field_gc.field_d = LobbyGame.field_gc.field_d - 1;
                      this.markBallTransformsDirty(0);
                      if (var8 == 0) {
                        return;
                      }
                    }
                    if ((decompiledFrameRemainder79) &&
                      (decompiledFrameRemainder78) &&
                      (decompiledFrameRemainder77) &&
                      (decompiledFrameRemainder76) &&
                      (decompiledFrameRemainder75) &&
                      (decompiledFrameRemainder74) &&
                      (decompiledFrameRemainder73) &&
                      (decompiledFrameRemainder72) &&
                      (decompiledFrameRemainder71) &&
                      (decompiledFrameRemainder70) &&
                      (decompiledFrameRemainder69) &&
                      (decompiledFrameRemainder68) &&
                      (decompiledFrameRemainder67) &&
                      (decompiledFrameRemainder66) &&
                      (decompiledFrameRemainder65) &&
                      (decompiledFrameRemainder64) &&
                      (decompiledFrameRemainder63) &&
                      (decompiledFrameRemainder62) &&
                      (decompiledFrameRemainder61) &&
                      (decompiledFrameRemainder60) &&
                      (decompiledFrameRemainder59) &&
                      (decompiledFrameRemainder58) &&
                      (decompiledFrameRemainder57)) {
                      if (TextLineLayout.field_c[81]) {
                        LobbyGame.field_gc.field_m = LobbyGame.field_gc.field_m + 1;
                        this.markBallTransformsDirty(0);
                        if (var8 == 0) {
                          return;
                        }
                      }
                      LobbyGame.field_gc.field_x = LobbyGame.field_gc.field_x + 1;
                      if (var8 == 0) {
                        return;
                      }
                    }
                    if ((decompiledFrameRemainder79) &&
                      (decompiledFrameRemainder78) &&
                      (decompiledFrameRemainder77) &&
                      (decompiledFrameRemainder76) &&
                      (decompiledFrameRemainder75) &&
                      (decompiledFrameRemainder74) &&
                      (decompiledFrameRemainder73) &&
                      (decompiledFrameRemainder72) &&
                      (decompiledFrameRemainder71) &&
                      (decompiledFrameRemainder70) &&
                      (decompiledFrameRemainder69) &&
                      (decompiledFrameRemainder68) &&
                      (decompiledFrameRemainder67) &&
                      (decompiledFrameRemainder66) &&
                      (decompiledFrameRemainder65) &&
                      (decompiledFrameRemainder64) &&
                      (decompiledFrameRemainder63) &&
                      (decompiledFrameRemainder62) &&
                      (decompiledFrameRemainder61) &&
                      (decompiledFrameRemainder60) &&
                      (decompiledFrameRemainder59) &&
                      (decompiledFrameRemainder58)) {
                      if (TextLineLayout.field_c[81]) {
                        LobbyGame.field_gc.field_m = LobbyGame.field_gc.field_m - 1;
                        this.markBallTransformsDirty(0);
                        if (var8 == 0) {
                          return;
                        }
                      }
                      LobbyGame.field_gc.field_x = LobbyGame.field_gc.field_x - 1;
                      if (var8 == 0) {
                        return;
                      }
                    }
                    if ((decompiledFrameRemainder79) &&
                      (decompiledFrameRemainder78) &&
                      (decompiledFrameRemainder77) &&
                      (decompiledFrameRemainder76) &&
                      (decompiledFrameRemainder75) &&
                      (decompiledFrameRemainder74) &&
                      (decompiledFrameRemainder73) &&
                      (decompiledFrameRemainder72) &&
                      (decompiledFrameRemainder71) &&
                      (decompiledFrameRemainder70) &&
                      (decompiledFrameRemainder69) &&
                      (decompiledFrameRemainder68) &&
                      (decompiledFrameRemainder67) &&
                      (decompiledFrameRemainder66) &&
                      (decompiledFrameRemainder65) &&
                      (decompiledFrameRemainder64) &&
                      (decompiledFrameRemainder63) &&
                      (decompiledFrameRemainder62) &&
                      (decompiledFrameRemainder61) &&
                      (decompiledFrameRemainder60) &&
                      (decompiledFrameRemainder59)) {
                      LobbyGame.field_gc.field_j = LobbyGame.field_gc.field_j + 0.04908738521234052;
                      if (var8 == 0) {
                        return;
                      }
                    }
                    if ((decompiledFrameRemainder79) &&
                      (decompiledFrameRemainder78) &&
                      (decompiledFrameRemainder77) &&
                      (decompiledFrameRemainder76) &&
                      (decompiledFrameRemainder75) &&
                      (decompiledFrameRemainder74) &&
                      (decompiledFrameRemainder73) &&
                      (decompiledFrameRemainder72) &&
                      (decompiledFrameRemainder71) &&
                      (decompiledFrameRemainder70) &&
                      (decompiledFrameRemainder69) &&
                      (decompiledFrameRemainder68) &&
                      (decompiledFrameRemainder67) &&
                      (decompiledFrameRemainder66) &&
                      (decompiledFrameRemainder65) &&
                      (decompiledFrameRemainder64) &&
                      (decompiledFrameRemainder63) &&
                      (decompiledFrameRemainder62) &&
                      (decompiledFrameRemainder61) &&
                      (decompiledFrameRemainder60)) {
                      LobbyGame.field_gc.field_j = LobbyGame.field_gc.field_j - 0.04908738521234052;
                      if (var8 == 0) {
                        return;
                      }
                    }
                    if ((decompiledFrameRemainder79) &&
                      (decompiledFrameRemainder78) &&
                      (decompiledFrameRemainder77) &&
                      (decompiledFrameRemainder76) &&
                      (decompiledFrameRemainder75) &&
                      (decompiledFrameRemainder74) &&
                      (decompiledFrameRemainder73) &&
                      (decompiledFrameRemainder72) &&
                      (decompiledFrameRemainder71) &&
                      (decompiledFrameRemainder70) &&
                      (decompiledFrameRemainder69) &&
                      (decompiledFrameRemainder68) &&
                      (decompiledFrameRemainder67) &&
                      (decompiledFrameRemainder66) &&
                      (decompiledFrameRemainder65) &&
                      (decompiledFrameRemainder64) &&
                      (decompiledFrameRemainder63) &&
                      (decompiledFrameRemainder62) &&
                      (decompiledFrameRemainder61)) {
                      LobbyGame.field_gc.field_p = LobbyGame.field_gc.field_p + 0.04908738521234052;
                      if (var8 == 0) {
                        return;
                      }
                    }
                    if ((decompiledFrameRemainder79) &&
                      (decompiledFrameRemainder78) &&
                      (decompiledFrameRemainder77) &&
                      (decompiledFrameRemainder76) &&
                      (decompiledFrameRemainder75) &&
                      (decompiledFrameRemainder74) &&
                      (decompiledFrameRemainder73) &&
                      (decompiledFrameRemainder72) &&
                      (decompiledFrameRemainder71) &&
                      (decompiledFrameRemainder70) &&
                      (decompiledFrameRemainder69) &&
                      (decompiledFrameRemainder68) &&
                      (decompiledFrameRemainder67) &&
                      (decompiledFrameRemainder66) &&
                      (decompiledFrameRemainder65) &&
                      (decompiledFrameRemainder64) &&
                      (decompiledFrameRemainder63) &&
                      (decompiledFrameRemainder62)) {
                      LobbyGame.field_gc.field_p = LobbyGame.field_gc.field_p - 0.04908738521234052;
                      if (var8 == 0) {
                        return;
                      }
                    }
                    if ((decompiledFrameRemainder79) &&
                      (decompiledFrameRemainder78) &&
                      (decompiledFrameRemainder77) &&
                      (decompiledFrameRemainder76) &&
                      (decompiledFrameRemainder75) &&
                      (decompiledFrameRemainder74) &&
                      (decompiledFrameRemainder73) &&
                      (decompiledFrameRemainder72) &&
                      (decompiledFrameRemainder71) &&
                      (decompiledFrameRemainder70) &&
                      (decompiledFrameRemainder69) &&
                      (decompiledFrameRemainder68) &&
                      (decompiledFrameRemainder67) &&
                      (decompiledFrameRemainder66) &&
                      (decompiledFrameRemainder65) &&
                      (decompiledFrameRemainder64) &&
                      (decompiledFrameRemainder63)) {
                      LobbyGame.field_gc.field_E = LobbyGame.field_gc.field_E * 1.0625;
                      if (var8 == 0) {
                        return;
                      }
                    }
                    if ((decompiledFrameRemainder79) &&
                      (decompiledFrameRemainder78) &&
                      (decompiledFrameRemainder77) &&
                      (decompiledFrameRemainder76) &&
                      (decompiledFrameRemainder75) &&
                      (decompiledFrameRemainder74) &&
                      (decompiledFrameRemainder73) &&
                      (decompiledFrameRemainder72) &&
                      (decompiledFrameRemainder71) &&
                      (decompiledFrameRemainder70) &&
                      (decompiledFrameRemainder69) &&
                      (decompiledFrameRemainder68) &&
                      (decompiledFrameRemainder67) &&
                      (decompiledFrameRemainder66) &&
                      (decompiledFrameRemainder65) &&
                      (decompiledFrameRemainder64)) {
                      LobbyGame.field_gc.field_E = LobbyGame.field_gc.field_E * 0.9375;
                      if (var8 == 0) {
                        return;
                      }
                    }
                    if ((decompiledFrameRemainder79) &&
                      (decompiledFrameRemainder78) &&
                      (decompiledFrameRemainder77) &&
                      (decompiledFrameRemainder76) &&
                      (decompiledFrameRemainder75) &&
                      (decompiledFrameRemainder74) &&
                      (decompiledFrameRemainder73) &&
                      (decompiledFrameRemainder72) &&
                      (decompiledFrameRemainder71) &&
                      (decompiledFrameRemainder70) &&
                      (decompiledFrameRemainder69) &&
                      (decompiledFrameRemainder68) &&
                      (decompiledFrameRemainder67) &&
                      (decompiledFrameRemainder66) &&
                      (decompiledFrameRemainder65)) {
                      LobbyGame.field_gc.field_z = LobbyGame.field_gc.field_z * 1.0078125f;
                      if (var8 == 0) {
                        return;
                      }
                    }
                    if ((decompiledFrameRemainder79) &&
                      (decompiledFrameRemainder78) &&
                      (decompiledFrameRemainder77) &&
                      (decompiledFrameRemainder76) &&
                      (decompiledFrameRemainder75) &&
                      (decompiledFrameRemainder74) &&
                      (decompiledFrameRemainder73) &&
                      (decompiledFrameRemainder72) &&
                      (decompiledFrameRemainder71) &&
                      (decompiledFrameRemainder70) &&
                      (decompiledFrameRemainder69) &&
                      (decompiledFrameRemainder68) &&
                      (decompiledFrameRemainder67) &&
                      (decompiledFrameRemainder66)) {
                      LobbyGame.field_gc.field_z = LobbyGame.field_gc.field_z * 0.9921875f;
                      if (var8 == 0) {
                        return;
                      }
                    }
                    if ((decompiledFrameRemainder79) &&
                      (decompiledFrameRemainder78) &&
                      (decompiledFrameRemainder77) &&
                      (decompiledFrameRemainder76) &&
                      (decompiledFrameRemainder75) &&
                      (decompiledFrameRemainder74) &&
                      (decompiledFrameRemainder73) &&
                      (decompiledFrameRemainder72) &&
                      (decompiledFrameRemainder71) &&
                      (decompiledFrameRemainder70) &&
                      (decompiledFrameRemainder69) &&
                      (decompiledFrameRemainder68) &&
                      (decompiledFrameRemainder67)) {
                      hf.field_a = 17 * hf.field_a / 16;
                      if (var8 == 0) {
                        return;
                      }
                    }
                    if ((decompiledFrameRemainder79) &&
                      (decompiledFrameRemainder78) &&
                      (decompiledFrameRemainder77) &&
                      (decompiledFrameRemainder76) &&
                      (decompiledFrameRemainder75) &&
                      (decompiledFrameRemainder74) &&
                      (decompiledFrameRemainder73) &&
                      (decompiledFrameRemainder72) &&
                      (decompiledFrameRemainder71) &&
                      (decompiledFrameRemainder70) &&
                      (decompiledFrameRemainder69) &&
                      (decompiledFrameRemainder68)) {
                      hf.field_a = hf.field_a * 15 / 16;
                      if (var8 == 0) {
                        return;
                      }
                    }
                    if ((decompiledFrameRemainder79) &&
                      (decompiledFrameRemainder78) &&
                      (decompiledFrameRemainder77) &&
                      (decompiledFrameRemainder76) &&
                      (decompiledFrameRemainder75) &&
                      (decompiledFrameRemainder74) &&
                      (decompiledFrameRemainder73) &&
                      (decompiledFrameRemainder72) &&
                      (decompiledFrameRemainder71) &&
                      (decompiledFrameRemainder70) &&
                      (decompiledFrameRemainder69)) {
                      fl.field_l = fl.field_l * 17 / 16;
                      if (var8 == 0) {
                        return;
                      }
                    }
                    if ((decompiledFrameRemainder79) &&
                      (decompiledFrameRemainder78) &&
                      (decompiledFrameRemainder77) &&
                      (decompiledFrameRemainder76) &&
                      (decompiledFrameRemainder75) &&
                      (decompiledFrameRemainder74) &&
                      (decompiledFrameRemainder73) &&
                      (decompiledFrameRemainder72) &&
                      (decompiledFrameRemainder71) &&
                      (decompiledFrameRemainder70)) {
                      fl.field_l = fl.field_l * 15 / 16;
                      if (var8 == 0) {
                        return;
                      }
                    }
                    if ((decompiledFrameRemainder79) &&
                      (decompiledFrameRemainder78) &&
                      (decompiledFrameRemainder77) &&
                      (decompiledFrameRemainder76) &&
                      (decompiledFrameRemainder75) &&
                      (decompiledFrameRemainder74) &&
                      (decompiledFrameRemainder73) &&
                      (decompiledFrameRemainder72) &&
                      (decompiledFrameRemainder71)) {
                      LobbyGame.field_vc = LobbyGame.field_vc - 50;
                      if (var8 == 0) {
                        return;
                      }
                    }
                    if ((decompiledFrameRemainder79) &&
                      (decompiledFrameRemainder78) &&
                      (decompiledFrameRemainder77) &&
                      (decompiledFrameRemainder76) &&
                      (decompiledFrameRemainder75) &&
                      (decompiledFrameRemainder74) &&
                      (decompiledFrameRemainder73) &&
                      (decompiledFrameRemainder72)) {
                      LobbyGame.field_vc = LobbyGame.field_vc + 50;
                      if (var8 == 0) {
                        return;
                      }
                    }
                    if ((decompiledFrameRemainder79) &&
                      (decompiledFrameRemainder78) &&
                      (decompiledFrameRemainder77) &&
                      (decompiledFrameRemainder76) &&
                      (decompiledFrameRemainder75) &&
                      (decompiledFrameRemainder74) &&
                      (decompiledFrameRemainder73)) {
                      ek.field_a = ek.field_a + 1;
                      if (var8 == 0) {
                        return;
                      }
                    }
                    if ((decompiledFrameRemainder79) &&
                      (decompiledFrameRemainder78) &&
                      (decompiledFrameRemainder77) &&
                      (decompiledFrameRemainder76) &&
                      (decompiledFrameRemainder75) &&
                      (decompiledFrameRemainder74)) {
                      ek.field_a = ek.field_a - 1;
                      if (var8 == 0) {
                        return;
                      }
                    }
                    if ((decompiledFrameRemainder79) &&
                      (decompiledFrameRemainder78) &&
                      (decompiledFrameRemainder77) &&
                      (decompiledFrameRemainder76) &&
                      (decompiledFrameRemainder75)) {
                      if ((LinkButtonPainter.field_i & 16777216L) == 0L) {
                        return;
                      }
                      if (LoginPayload.field_a <= 16) {
                        return;
                      }
                      LoginPayload.field_a = LoginPayload.field_a - 8;
                      if (var8 == 0) {
                        return;
                      }
                    }
                    if ((decompiledFrameRemainder79) &&
                      (decompiledFrameRemainder78) &&
                      (decompiledFrameRemainder77) &&
                      (decompiledFrameRemainder76)) {
                      if ((16777216L & LinkButtonPainter.field_i) == 0L) {
                        return;
                      }
                      if (2304 <= LoginPayload.field_a) {
                        return;
                      }
                      LoginPayload.field_a = LoginPayload.field_a + 8;
                      if (var8 == 0) {
                        return;
                      }
                    }
                    if ((decompiledFrameRemainder79) &&
                      (decompiledFrameRemainder78) &&
                      (decompiledFrameRemainder77)) {
                      if ((LinkButtonPainter.field_i & 16777216L) == 0L) {
                        return;
                      }
                      if (ue.field_e <= 16) {
                        return;
                      }
                      ue.field_e = ue.field_e * 15 / 16;
                      if (var8 == 0) {
                        return;
                      }
                    }
                    if ((decompiledFrameRemainder79) &&
                      (decompiledFrameRemainder78)) {
                      if ((LinkButtonPainter.field_i & 16777216L) == 0L) {
                        return;
                      }
                      if (ue.field_e >= 65536) {
                        return;
                      }
                      ue.field_e = ue.field_e * 17 / 16;
                      if (var8 == 0) {
                        return;
                      }
                    }
                    if (decompiledFrameRemainder79) {
                      if ((16777216L & LinkButtonPainter.field_i) == 0L) {
                        return;
                      }
                      if (QuickChatPhraseDefinition.field_G <= 4) {
                        return;
                      }
                      QuickChatPhraseDefinition.field_G = QuickChatPhraseDefinition.field_G - 4;
                      if (var8 == 0) {
                        return;
                      }
                    }
                    if ((16777216L & LinkButtonPainter.field_i) == 0L) {
                      return;
                    }
                    if (QuickChatPhraseDefinition.field_G >= 65536) {
                      return;
                    }
                    QuickChatPhraseDefinition.field_G = QuickChatPhraseDefinition.field_G + 4;
                    if (var8 == 0) {
                      return;
                    }
                  }
                  this.fastForwardTableScene(3);
                  if (var8 == 0) {
                    return;
                  }
                }
                if ((LinkButtonPainter.field_i & 65536L) == 0L) {
                  return;
                }
                if (ViewportController.field_b >= 26) {
                  return;
                }
                MatchingTextValidator.field_v = MatchingTextValidator.field_v + 2;
                ViewportController.field_b = ViewportController.field_b + 1;
                this.rebuildBallSkinMeshes(46);
                if (var8 == 0) {
                  return;
                }
              }
              if ((65536L & LinkButtonPainter.field_i) == 0L) {
                return;
              }
              if (ViewportController.field_b <= 2) {
                return;
              }
              MatchingTextValidator.field_v = MatchingTextValidator.field_v - 2;
              ViewportController.field_b = ViewportController.field_b - 1;
              this.rebuildBallSkinMeshes(-93);
              if (var8 == 0) {
                return;
              }
            }
            regionExit4: {
              regionExit5: {
                regionExit6: {
                  regionExit7: {
                    regionExit8: {
                      regionExit9: {
                        regionExit10: {
                          regionExit11: {
                            boolean decompiledFrameRemainder54 = true;
                            boolean decompiledFrameRemainder53 = true;
                            boolean decompiledFrameRemainder52 = true;
                            boolean decompiledFrameRemainder51 = true;
                            boolean decompiledFrameRemainder50 = true;
                            boolean decompiledFrameRemainder49 = true;
                            boolean decompiledFrameRemainder48 = true;
                            boolean decompiledFrameRemainder47 = true;
                            var4 = IterableDualLinkDeque.field_a;
                            if ((16 != var4) &&
                              (decompiledFrameRemainder47 = (17 != var4)) &&
                              (decompiledFrameRemainder48 = (18 != var4 ||
                              var8 != 0)) &&
                              (decompiledFrameRemainder49 = (var4 != 19 ||
                              var8 != 0)) &&
                              (decompiledFrameRemainder50 = (20 != var4)) &&
                              (decompiledFrameRemainder51 = (var4 != 21 ||
                              var8 != 0)) &&
                              (decompiledFrameRemainder52 = (var4 != 22 ||
                              var8 != 0)) &&
                              (decompiledFrameRemainder53 = (var4 != 23 ||
                              var8 != 0)) &&
                              (decompiledFrameRemainder54 = (var4 != 24 ||
                              var8 != 0))) {
                              switch (var4) {
                                case 25:
                                  break regionExit11;
                                case 26:
                                  break regionExit10;
                                case 43:
                                  break regionExit9;
                                default:
                                  if (var4 == 85 &&
                                    var8 == 0) {
                                    break regionExit8;
                                  }
                                  switch (var4) {
                                    case 64:
                                      break regionExit7;
                                    case 65:
                                      break regionExit6;
                                    case 66:
                                      break regionExit5;
                                    default:
                                      return;
                                    case 67:
                                      if (var8 == 0) {
                                        break regionExit4;
                                      }
                                      break;
                                  }
                                  break;
                              }
                            }
                            if ((decompiledFrameRemainder54) &&
                              (decompiledFrameRemainder53) &&
                              (decompiledFrameRemainder52) &&
                              (decompiledFrameRemainder51) &&
                              (decompiledFrameRemainder50) &&
                              (decompiledFrameRemainder49) &&
                              (decompiledFrameRemainder48) &&
                              (decompiledFrameRemainder47)) {
                              this.applyCameraPreset(TextLineLayout.field_c[82], 6, 0);
                              if (var8 == 0) {
                                return;
                              }
                            }
                            if ((decompiledFrameRemainder54) &&
                              (decompiledFrameRemainder53) &&
                              (decompiledFrameRemainder52) &&
                              (decompiledFrameRemainder51) &&
                              (decompiledFrameRemainder50) &&
                              (decompiledFrameRemainder49) &&
                              (decompiledFrameRemainder48)) {
                              this.applyCameraPreset(TextLineLayout.field_c[82], 115, 1);
                              if (var8 == 0) {
                                return;
                              }
                            }
                            if ((decompiledFrameRemainder54) &&
                              (decompiledFrameRemainder53) &&
                              (decompiledFrameRemainder52) &&
                              (decompiledFrameRemainder51) &&
                              (decompiledFrameRemainder50) &&
                              (decompiledFrameRemainder49)) {
                              this.applyCameraPreset(TextLineLayout.field_c[82], 14, 2);
                              if (var8 == 0) {
                                return;
                              }
                            }
                            if ((decompiledFrameRemainder54) &&
                              (decompiledFrameRemainder53) &&
                              (decompiledFrameRemainder52) &&
                              (decompiledFrameRemainder51) &&
                              (decompiledFrameRemainder50)) {
                              this.applyCameraPreset(TextLineLayout.field_c[82], 56, 3);
                              if (var8 == 0) {
                                return;
                              }
                            }
                            if ((decompiledFrameRemainder54) &&
                              (decompiledFrameRemainder53) &&
                              (decompiledFrameRemainder52) &&
                              (decompiledFrameRemainder51)) {
                              this.applyCameraPreset(TextLineLayout.field_c[82], 100, 4);
                              if (var8 == 0) {
                                return;
                              }
                            }
                            if ((decompiledFrameRemainder54) &&
                              (decompiledFrameRemainder53) &&
                              (decompiledFrameRemainder52)) {
                              this.applyCameraPreset(TextLineLayout.field_c[82], 78, 5);
                              if (var8 == 0) {
                                return;
                              }
                            }
                            if ((decompiledFrameRemainder54) &&
                              (decompiledFrameRemainder53)) {
                              this.applyCameraPreset(TextLineLayout.field_c[82], 42, 6);
                              if (var8 == 0) {
                                return;
                              }
                            }
                            if (decompiledFrameRemainder54) {
                              this.applyCameraPreset(TextLineLayout.field_c[82], 19, 7);
                              if (var8 == 0) {
                                return;
                              }
                            }
                            this.applyCameraPreset(TextLineLayout.field_c[82], 33, 8);
                            if (var8 == 0) {
                              return;
                            }
                          }
                          this.applyCameraPreset(TextLineLayout.field_c[82], 106, 9);
                          if (var8 == 0) {
                            return;
                          }
                        }
                        this.applyCameraPreset(TextLineLayout.field_c[82], 99, 10);
                        if (var8 == 0) {
                          return;
                        }
                      }
                      this.debugPaused = true;
                      if (var8 == 0) {
                        return;
                      }
                    }
                    this.gameModel.stopAllBalls(-51);
                    if (var8 == 0) {
                      return;
                    }
                  }
                  this.camera.eyeX = this.camera.targetX;
                  this.cameraGoal.copyFrom(144, this.camera);
                  this.viewMatrixDirty = true;
                  if (var8 == 0) {
                    return;
                  }
                }
                this.camera.eyeY = this.camera.targetY;
                this.cameraGoal.copyFrom(144, this.camera);
                this.viewMatrixDirty = true;
                if (var8 == 0) {
                  return;
                }
              }
              this.camera.targetX = 288.0;
              var2 = this.camera;
              var2.eyeX = 288.0;
              this.cameraGoal.copyFrom(144, this.camera);
              this.viewMatrixDirty = true;
              if (var8 == 0) {
                return;
              }
            }
            var3_ref_mm = this.camera;
            this.camera.targetY = 144.0;
            var3_ref_mm.eyeY = 144.0;
            this.cameraGoal.copyFrom(144, this.camera);
            this.viewMatrixDirty = true;
            if (var8 == 0) {
              return;
            }
          }
          if (!TextLineLayout.field_c[81]) {
            boolean decompiledFrameRemainder46 = true;
            boolean decompiledFrameRemainder45 = true;
            boolean decompiledFrameRemainder44 = true;
            boolean decompiledFrameRemainder43 = true;
            boolean decompiledFrameRemainder42 = true;
            boolean decompiledFrameRemainder41 = true;
            boolean decompiledFrameRemainder40 = true;
            boolean decompiledFrameRemainder39 = true;
            boolean decompiledFrameRemainder38 = true;
            boolean decompiledFrameRemainder37 = true;
            boolean decompiledFrameRemainder36 = true;
            boolean decompiledFrameRemainder35 = true;
            boolean decompiledFrameRemainder34 = true;
            boolean decompiledFrameRemainder33 = true;
            boolean decompiledFrameRemainder32 = true;
            boolean decompiledFrameRemainder31 = true;
            boolean decompiledFrameRemainder30 = true;
            boolean decompiledFrameRemainder29 = true;
            boolean decompiledFrameRemainder28 = true;
            boolean decompiledFrameRemainder27 = true;
            boolean decompiledFrameRemainder26 = true;
            var2_int = IterableDualLinkDeque.field_a;
            if (var2_int == 70 &&
              var8 == 0) {
              this.refreshBallTransforms(17);
              return;
            } else {
              if ((var2_int != 40) &&
                (decompiledFrameRemainder26 = (var2_int != 1)) &&
                (decompiledFrameRemainder27 = (2 != var2_int ||
                var8 != 0)) &&
                (decompiledFrameRemainder28 = (var2_int != 3)) &&
                (decompiledFrameRemainder29 = (var2_int != 4 ||
                var8 != 0)) &&
                (decompiledFrameRemainder30 = (5 != var2_int ||
                var8 != 0)) &&
                (decompiledFrameRemainder31 = (6 != var2_int)) &&
                (decompiledFrameRemainder32 = (var2_int != 7 ||
                var8 != 0)) &&
                (decompiledFrameRemainder33 = (8 != var2_int ||
                var8 != 0)) &&
                (decompiledFrameRemainder34 = (var2_int != 9 ||
                var8 != 0)) &&
                (decompiledFrameRemainder35 = (var2_int != 68))) {
                if (var2_int == 69 &&
                  var8 == 0) {
                  return;
                }
                decompiledFrameRemainder36 = (var2_int != 50 ||
                  var8 != 0);
                if ((decompiledFrameRemainder36) &&
                  (decompiledFrameRemainder37 = (var2_int != 71)) &&
                  (decompiledFrameRemainder38 = (var2_int != 72 ||
                  var8 != 0))) {
                  if (var2_int == 51) {
                    return;
                  }
                  if (52 == var2_int) {
                    return;
                  }
                  decompiledFrameRemainder39 = (var2_int != 67);
                  if ((decompiledFrameRemainder39) &&
                    (decompiledFrameRemainder40 = (var2_int != 59 ||
                    var8 != 0)) &&
                    (decompiledFrameRemainder41 = (41 != var2_int))) {
                    if (var2_int == 38 &&
                      var8 == 0) {
                      return;
                    }
                    if (39 == var2_int) {
                      return;
                    }
                    decompiledFrameRemainder42 = (var2_int != 32 ||
                      var8 != 0);
                    if ((decompiledFrameRemainder42) &&
                      (decompiledFrameRemainder43 = (64 != var2_int ||
                      var8 != 0)) &&
                      (decompiledFrameRemainder44 = (var2_int != 49))) {
                      if (var2_int == 56 &&
                        var8 == 0) {
                        return;
                      }
                      decompiledFrameRemainder45 = (36 != var2_int ||
                        var8 != 0);
                      if ((decompiledFrameRemainder45) &&
                        (decompiledFrameRemainder46 = (var2_int != 35))) {
                        return;
                      }
                    }
                  }
                }
              }
            }
            if ((decompiledFrameRemainder46) &&
              (decompiledFrameRemainder45) &&
              (decompiledFrameRemainder44) &&
              (decompiledFrameRemainder43) &&
              (decompiledFrameRemainder42) &&
              (decompiledFrameRemainder41) &&
              (decompiledFrameRemainder40) &&
              (decompiledFrameRemainder39) &&
              (decompiledFrameRemainder38) &&
              (decompiledFrameRemainder37) &&
              (decompiledFrameRemainder36) &&
              (decompiledFrameRemainder35) &&
              (decompiledFrameRemainder34) &&
              (decompiledFrameRemainder33) &&
              (decompiledFrameRemainder32) &&
              (decompiledFrameRemainder31) &&
              (decompiledFrameRemainder30) &&
              (decompiledFrameRemainder29) &&
              (decompiledFrameRemainder28) &&
              (decompiledFrameRemainder27) &&
              (decompiledFrameRemainder26)) {
              this.shotCameraStrategy = (this.shotCameraStrategy + 1) % 6;
              if (var8 == 0) {
                return;
              }
            }
            if ((decompiledFrameRemainder46) &&
              (decompiledFrameRemainder45) &&
              (decompiledFrameRemainder44) &&
              (decompiledFrameRemainder43) &&
              (decompiledFrameRemainder42) &&
              (decompiledFrameRemainder41) &&
              (decompiledFrameRemainder40) &&
              (decompiledFrameRemainder39) &&
              (decompiledFrameRemainder38) &&
              (decompiledFrameRemainder37) &&
              (decompiledFrameRemainder36) &&
              (decompiledFrameRemainder35) &&
              (decompiledFrameRemainder34) &&
              (decompiledFrameRemainder33) &&
              (decompiledFrameRemainder32) &&
              (decompiledFrameRemainder31) &&
              (decompiledFrameRemainder30) &&
              (decompiledFrameRemainder29) &&
              (decompiledFrameRemainder28) &&
              (decompiledFrameRemainder27)) {
              this.switchTableTheme((byte) 124, 0);
              if (var8 == 0) {
                return;
              }
            }
            if ((decompiledFrameRemainder46) &&
              (decompiledFrameRemainder45) &&
              (decompiledFrameRemainder44) &&
              (decompiledFrameRemainder43) &&
              (decompiledFrameRemainder42) &&
              (decompiledFrameRemainder41) &&
              (decompiledFrameRemainder40) &&
              (decompiledFrameRemainder39) &&
              (decompiledFrameRemainder38) &&
              (decompiledFrameRemainder37) &&
              (decompiledFrameRemainder36) &&
              (decompiledFrameRemainder35) &&
              (decompiledFrameRemainder34) &&
              (decompiledFrameRemainder33) &&
              (decompiledFrameRemainder32) &&
              (decompiledFrameRemainder31) &&
              (decompiledFrameRemainder30) &&
              (decompiledFrameRemainder29) &&
              (decompiledFrameRemainder28)) {
              this.switchTableTheme((byte) 124, 1);
              if (var8 == 0) {
                return;
              }
            }
            if ((decompiledFrameRemainder46) &&
              (decompiledFrameRemainder45) &&
              (decompiledFrameRemainder44) &&
              (decompiledFrameRemainder43) &&
              (decompiledFrameRemainder42) &&
              (decompiledFrameRemainder41) &&
              (decompiledFrameRemainder40) &&
              (decompiledFrameRemainder39) &&
              (decompiledFrameRemainder38) &&
              (decompiledFrameRemainder37) &&
              (decompiledFrameRemainder36) &&
              (decompiledFrameRemainder35) &&
              (decompiledFrameRemainder34) &&
              (decompiledFrameRemainder33) &&
              (decompiledFrameRemainder32) &&
              (decompiledFrameRemainder31) &&
              (decompiledFrameRemainder30) &&
              (decompiledFrameRemainder29)) {
              this.switchTableTheme((byte) 124, 2);
              if (var8 == 0) {
                return;
              }
            }
            if ((decompiledFrameRemainder46) &&
              (decompiledFrameRemainder45) &&
              (decompiledFrameRemainder44) &&
              (decompiledFrameRemainder43) &&
              (decompiledFrameRemainder42) &&
              (decompiledFrameRemainder41) &&
              (decompiledFrameRemainder40) &&
              (decompiledFrameRemainder39) &&
              (decompiledFrameRemainder38) &&
              (decompiledFrameRemainder37) &&
              (decompiledFrameRemainder36) &&
              (decompiledFrameRemainder35) &&
              (decompiledFrameRemainder34) &&
              (decompiledFrameRemainder33) &&
              (decompiledFrameRemainder32) &&
              (decompiledFrameRemainder31) &&
              (decompiledFrameRemainder30)) {
              this.switchTableTheme((byte) 124, 3);
              if (var8 == 0) {
                return;
              }
            }
            if ((decompiledFrameRemainder46) &&
              (decompiledFrameRemainder45) &&
              (decompiledFrameRemainder44) &&
              (decompiledFrameRemainder43) &&
              (decompiledFrameRemainder42) &&
              (decompiledFrameRemainder41) &&
              (decompiledFrameRemainder40) &&
              (decompiledFrameRemainder39) &&
              (decompiledFrameRemainder38) &&
              (decompiledFrameRemainder37) &&
              (decompiledFrameRemainder36) &&
              (decompiledFrameRemainder35) &&
              (decompiledFrameRemainder34) &&
              (decompiledFrameRemainder33) &&
              (decompiledFrameRemainder32) &&
              (decompiledFrameRemainder31)) {
              this.switchTableTheme((byte) 124, 4);
              if (var8 == 0) {
                return;
              }
            }
            if ((decompiledFrameRemainder46) &&
              (decompiledFrameRemainder45) &&
              (decompiledFrameRemainder44) &&
              (decompiledFrameRemainder43) &&
              (decompiledFrameRemainder42) &&
              (decompiledFrameRemainder41) &&
              (decompiledFrameRemainder40) &&
              (decompiledFrameRemainder39) &&
              (decompiledFrameRemainder38) &&
              (decompiledFrameRemainder37) &&
              (decompiledFrameRemainder36) &&
              (decompiledFrameRemainder35) &&
              (decompiledFrameRemainder34) &&
              (decompiledFrameRemainder33) &&
              (decompiledFrameRemainder32)) {
              this.switchTableTheme((byte) 124, 5);
              if (var8 == 0) {
                return;
              }
            }
            if ((decompiledFrameRemainder46) &&
              (decompiledFrameRemainder45) &&
              (decompiledFrameRemainder44) &&
              (decompiledFrameRemainder43) &&
              (decompiledFrameRemainder42) &&
              (decompiledFrameRemainder41) &&
              (decompiledFrameRemainder40) &&
              (decompiledFrameRemainder39) &&
              (decompiledFrameRemainder38) &&
              (decompiledFrameRemainder37) &&
              (decompiledFrameRemainder36) &&
              (decompiledFrameRemainder35) &&
              (decompiledFrameRemainder34) &&
              (decompiledFrameRemainder33)) {
              this.switchTableTheme((byte) 124, 6);
              if (var8 == 0) {
                return;
              }
            }
            if ((decompiledFrameRemainder46) &&
              (decompiledFrameRemainder45) &&
              (decompiledFrameRemainder44) &&
              (decompiledFrameRemainder43) &&
              (decompiledFrameRemainder42) &&
              (decompiledFrameRemainder41) &&
              (decompiledFrameRemainder40) &&
              (decompiledFrameRemainder39) &&
              (decompiledFrameRemainder38) &&
              (decompiledFrameRemainder37) &&
              (decompiledFrameRemainder36) &&
              (decompiledFrameRemainder35) &&
              (decompiledFrameRemainder34)) {
              this.switchTableTheme((byte) 124, 7);
              if (var8 == 0) {
                return;
              }
            }
            if ((decompiledFrameRemainder46) &&
              (decompiledFrameRemainder45) &&
              (decompiledFrameRemainder44) &&
              (decompiledFrameRemainder43) &&
              (decompiledFrameRemainder42) &&
              (decompiledFrameRemainder41) &&
              (decompiledFrameRemainder40) &&
              (decompiledFrameRemainder39) &&
              (decompiledFrameRemainder38) &&
              (decompiledFrameRemainder37) &&
              (decompiledFrameRemainder36) &&
              (decompiledFrameRemainder35)) {
              this.switchTableTheme((byte) 124, 8);
              if (var8 == 0) {
                return;
              }
            }
            if ((decompiledFrameRemainder46) &&
              (decompiledFrameRemainder45) &&
              (decompiledFrameRemainder44) &&
              (decompiledFrameRemainder43) &&
              (decompiledFrameRemainder42) &&
              (decompiledFrameRemainder41) &&
              (decompiledFrameRemainder40) &&
              (decompiledFrameRemainder39) &&
              (decompiledFrameRemainder38) &&
              (decompiledFrameRemainder37) &&
              (decompiledFrameRemainder36)) {
              this.markBallTransformsDirty(0);
              if (var8 == 0) {
                return;
              }
            }
            if ((decompiledFrameRemainder46) &&
              (decompiledFrameRemainder45) &&
              (decompiledFrameRemainder44) &&
              (decompiledFrameRemainder43) &&
              (decompiledFrameRemainder42) &&
              (decompiledFrameRemainder41) &&
              (decompiledFrameRemainder40) &&
              (decompiledFrameRemainder39) &&
              (decompiledFrameRemainder38) &&
              (decompiledFrameRemainder37)) {
              this.gameModel.printState(0);
              if (var8 == 0) {
                return;
              }
            }
            if ((decompiledFrameRemainder46) &&
              (decompiledFrameRemainder45) &&
              (decompiledFrameRemainder44) &&
              (decompiledFrameRemainder43) &&
              (decompiledFrameRemainder42) &&
              (decompiledFrameRemainder41) &&
              (decompiledFrameRemainder40) &&
              (decompiledFrameRemainder39) &&
              (decompiledFrameRemainder38)) {
              if ((TutorialController.field_c & this.modeFlags) != 0) {
                return;
              }
              this.clockTicks = this.clockTicks - 1000;
              if (var8 == 0) {
                return;
              }
            }
            if ((decompiledFrameRemainder46) &&
              (decompiledFrameRemainder45) &&
              (decompiledFrameRemainder44) &&
              (decompiledFrameRemainder43) &&
              (decompiledFrameRemainder42) &&
              (decompiledFrameRemainder41) &&
              (decompiledFrameRemainder40) &&
              (decompiledFrameRemainder39)) {
              if ((TutorialController.field_c & this.modeFlags) != 0) {
                return;
              }
              this.clockTicks = this.clockTicks + 1000;
              if (var8 == 0) {
                return;
              }
            }
            if ((decompiledFrameRemainder46) &&
              (decompiledFrameRemainder45) &&
              (decompiledFrameRemainder44) &&
              (decompiledFrameRemainder43) &&
              (decompiledFrameRemainder42) &&
              (decompiledFrameRemainder41) &&
              (decompiledFrameRemainder40)) {
              this.gameModel.computeAimTargets(12226, 0);
              if (var8 == 0) {
                return;
              }
            }
            if ((decompiledFrameRemainder46) &&
              (decompiledFrameRemainder45) &&
              (decompiledFrameRemainder44) &&
              (decompiledFrameRemainder43) &&
              (decompiledFrameRemainder42) &&
              (decompiledFrameRemainder41)) {
              dq.field_a.allocateMeshes(7096);
              dq.field_a.prepareForGame(2147483647, this.gameModel);
              LobbyGame.field_gc.buildPalettes(25879);
              LobbyGame.field_gc.buildTableGeometry(this.gameModel, 21894);
              LobbyGame.field_gc.setViewMatrix((byte) -128, this.viewMatrix);
              if (var8 == 0) {
                return;
              }
            }
            if ((decompiledFrameRemainder46) &&
              (decompiledFrameRemainder45) &&
              (decompiledFrameRemainder44) &&
              (decompiledFrameRemainder43) &&
              (decompiledFrameRemainder42)) {
              hh.field_c = true;
              if (var8 == 0) {
                return;
              }
            }
            if ((decompiledFrameRemainder46) &&
              (decompiledFrameRemainder45) &&
              (decompiledFrameRemainder44) &&
              (decompiledFrameRemainder43)) {
              stackIn_618_0 = LobbyGame.field_gc;
              stackIn_619_1 = !(LobbyGame.field_gc.field_h);
              stackIn_618_0.field_h = stackIn_619_1;
              stackIn_622_0 = 122;
              stackIn_622_1 = false;
              stackIn_622_2 = 1;
              if (!LobbyGame.field_gc.field_h) {
                stackIn_623_3 = "Linear sorting";
              } else {
                stackIn_623_3 = "Radial sorting";
              }
              HighscoresScreen.$cfr$intArgs$a$c9c3307e6488(stackIn_622_0, stackIn_622_1, stackIn_622_2, stackIn_623_3);
              if (var8 == 0) {
                return;
              }
            }
            if ((decompiledFrameRemainder46) &&
              (decompiledFrameRemainder45) &&
              (decompiledFrameRemainder44)) {
              this.q((byte) 114);
              if (var8 == 0) {
                return;
              }
            }
            if ((decompiledFrameRemainder46) &&
              (decompiledFrameRemainder45)) {
              IsaacCipher.a(2243, this.gameModel);
              if (var8 == 0) {
                return;
              }
            }
            if (decompiledFrameRemainder46) {
              if ((this.modeFlags & sk.field_d) == 0) {
                return;
              }
              this.tutorial.restart(-1);
              if (var8 == 0) {
                return;
              }
            }
            this.gameModel.stopAllBalls(-54);
            this.reseedBreak(1 + ga.nextRandomInt(512, true, ea.field_r), false);
            if (!(this.gameModel.rules instanceof EightBallRules)) {
              return;
            }
            this.gameModel.rules = (GameRules) ((Object) new EightBallRules(this.gameModel));
            if (var8 == 0) {
              return;
            }
          }
          boolean decompiledFrameRemainder25 = true;
          boolean decompiledFrameRemainder24 = true;
          boolean decompiledFrameRemainder23 = true;
          boolean decompiledFrameRemainder22 = true;
          boolean decompiledFrameRemainder21 = true;
          boolean decompiledFrameRemainder20 = true;
          boolean decompiledFrameRemainder19 = true;
          boolean decompiledFrameRemainder18 = true;
          boolean decompiledFrameRemainder17 = true;
          boolean decompiledFrameRemainder16 = true;
          boolean decompiledFrameRemainder15 = true;
          boolean decompiledFrameRemainder14 = true;
          boolean decompiledFrameRemainder13 = true;
          boolean decompiledFrameRemainder12 = true;
          boolean decompiledFrameRemainder11 = true;
          boolean decompiledFrameRemainder10 = true;
          boolean decompiledFrameRemainder9 = true;
          boolean decompiledFrameRemainder8 = true;
          boolean decompiledFrameRemainder7 = true;
          boolean decompiledFrameRemainder6 = true;
          boolean decompiledFrameRemainder5 = true;
          boolean decompiledFrameRemainder4 = true;
          boolean decompiledFrameRemainder3 = true;
          boolean decompiledFrameRemainder2 = true;
          boolean decompiledFrameRemainder1 = true;
          boolean decompiledFrameRemainder0 = true;
          var3 = IterableDualLinkDeque.field_a;
          if (var3 == 1 &&
            var8 == 0) {
            this.selectBallSkin(0, (byte) -43);
            return;
          } else {
            if ((var3 != 2) &&
              (decompiledFrameRemainder0 = (var3 != 3)) &&
              (decompiledFrameRemainder1 = (var3 != 4 ||
              var8 != 0)) &&
              (decompiledFrameRemainder2 = (var3 != 5 ||
              var8 != 0)) &&
              (decompiledFrameRemainder3 = (var3 != 6)) &&
              (decompiledFrameRemainder4 = (var3 != 7 ||
              var8 != 0)) &&
              (decompiledFrameRemainder5 = (var3 != 8 ||
              var8 != 0)) &&
              (decompiledFrameRemainder6 = (var3 != 16)) &&
              (decompiledFrameRemainder7 = (var3 != 17)) &&
              (decompiledFrameRemainder8 = (var3 != 18 ||
              var8 != 0)) &&
              (decompiledFrameRemainder9 = (19 != var3 ||
              var8 != 0)) &&
              (decompiledFrameRemainder10 = (var3 != 20)) &&
              (decompiledFrameRemainder11 = (21 != var3)) &&
              (decompiledFrameRemainder12 = (var3 != 64))) {
              if (var3 == 48 &&
                var8 == 0) {
                return;
              }
              decompiledFrameRemainder13 = (var3 != 40 ||
                var8 != 0);
              if ((decompiledFrameRemainder13) &&
                (decompiledFrameRemainder14 = (66 != var3 ||
                var8 != 0)) &&
                (decompiledFrameRemainder15 = (var3 != 36 ||
                var8 != 0)) &&
                (decompiledFrameRemainder16 = (var3 != 56 ||
                var8 != 0)) &&
                (decompiledFrameRemainder17 = (39 != var3)) &&
                (decompiledFrameRemainder18 = (var3 != 70)) &&
                (decompiledFrameRemainder19 = (var3 != 69 ||
                var8 != 0)) &&
                (decompiledFrameRemainder20 = (41 != var3 ||
                var8 != 0))) {
                if (49 == var3) {
                  return;
                }
                decompiledFrameRemainder21 = (var3 != 53);
                if ((decompiledFrameRemainder21) &&
                  (decompiledFrameRemainder22 = (var3 != 54 ||
                  var8 != 0)) &&
                  (decompiledFrameRemainder23 = (var3 != 51)) &&
                  (decompiledFrameRemainder24 = (var3 != 67)) &&
                  (decompiledFrameRemainder25 = (68 != var3))) {
                  return;
                }
              }
            }
          }
          if ((decompiledFrameRemainder25) &&
            (decompiledFrameRemainder24) &&
            (decompiledFrameRemainder23) &&
            (decompiledFrameRemainder22) &&
            (decompiledFrameRemainder21) &&
            (decompiledFrameRemainder20) &&
            (decompiledFrameRemainder19) &&
            (decompiledFrameRemainder18) &&
            (decompiledFrameRemainder17) &&
            (decompiledFrameRemainder16) &&
            (decompiledFrameRemainder15) &&
            (decompiledFrameRemainder14) &&
            (decompiledFrameRemainder13) &&
            (decompiledFrameRemainder12) &&
            (decompiledFrameRemainder11) &&
            (decompiledFrameRemainder10) &&
            (decompiledFrameRemainder9) &&
            (decompiledFrameRemainder8) &&
            (decompiledFrameRemainder7) &&
            (decompiledFrameRemainder6) &&
            (decompiledFrameRemainder5) &&
            (decompiledFrameRemainder4) &&
            (decompiledFrameRemainder3) &&
            (decompiledFrameRemainder2) &&
            (decompiledFrameRemainder1) &&
            (decompiledFrameRemainder0)) {
            this.selectBallSkin(1, (byte) -43);
            if (var8 == 0) {
              return;
            }
          }
          if ((decompiledFrameRemainder25) &&
            (decompiledFrameRemainder24) &&
            (decompiledFrameRemainder23) &&
            (decompiledFrameRemainder22) &&
            (decompiledFrameRemainder21) &&
            (decompiledFrameRemainder20) &&
            (decompiledFrameRemainder19) &&
            (decompiledFrameRemainder18) &&
            (decompiledFrameRemainder17) &&
            (decompiledFrameRemainder16) &&
            (decompiledFrameRemainder15) &&
            (decompiledFrameRemainder14) &&
            (decompiledFrameRemainder13) &&
            (decompiledFrameRemainder12) &&
            (decompiledFrameRemainder11) &&
            (decompiledFrameRemainder10) &&
            (decompiledFrameRemainder9) &&
            (decompiledFrameRemainder8) &&
            (decompiledFrameRemainder7) &&
            (decompiledFrameRemainder6) &&
            (decompiledFrameRemainder5) &&
            (decompiledFrameRemainder4) &&
            (decompiledFrameRemainder3) &&
            (decompiledFrameRemainder2) &&
            (decompiledFrameRemainder1)) {
            this.selectBallSkin(2, (byte) -43);
            if (var8 == 0) {
              return;
            }
          }
          if ((decompiledFrameRemainder25) &&
            (decompiledFrameRemainder24) &&
            (decompiledFrameRemainder23) &&
            (decompiledFrameRemainder22) &&
            (decompiledFrameRemainder21) &&
            (decompiledFrameRemainder20) &&
            (decompiledFrameRemainder19) &&
            (decompiledFrameRemainder18) &&
            (decompiledFrameRemainder17) &&
            (decompiledFrameRemainder16) &&
            (decompiledFrameRemainder15) &&
            (decompiledFrameRemainder14) &&
            (decompiledFrameRemainder13) &&
            (decompiledFrameRemainder12) &&
            (decompiledFrameRemainder11) &&
            (decompiledFrameRemainder10) &&
            (decompiledFrameRemainder9) &&
            (decompiledFrameRemainder8) &&
            (decompiledFrameRemainder7) &&
            (decompiledFrameRemainder6) &&
            (decompiledFrameRemainder5) &&
            (decompiledFrameRemainder4) &&
            (decompiledFrameRemainder3) &&
            (decompiledFrameRemainder2)) {
            this.selectBallSkin(3, (byte) -43);
            if (var8 == 0) {
              return;
            }
          }
          if ((decompiledFrameRemainder25) &&
            (decompiledFrameRemainder24) &&
            (decompiledFrameRemainder23) &&
            (decompiledFrameRemainder22) &&
            (decompiledFrameRemainder21) &&
            (decompiledFrameRemainder20) &&
            (decompiledFrameRemainder19) &&
            (decompiledFrameRemainder18) &&
            (decompiledFrameRemainder17) &&
            (decompiledFrameRemainder16) &&
            (decompiledFrameRemainder15) &&
            (decompiledFrameRemainder14) &&
            (decompiledFrameRemainder13) &&
            (decompiledFrameRemainder12) &&
            (decompiledFrameRemainder11) &&
            (decompiledFrameRemainder10) &&
            (decompiledFrameRemainder9) &&
            (decompiledFrameRemainder8) &&
            (decompiledFrameRemainder7) &&
            (decompiledFrameRemainder6) &&
            (decompiledFrameRemainder5) &&
            (decompiledFrameRemainder4) &&
            (decompiledFrameRemainder3)) {
            this.selectBallSkin(4, (byte) -43);
            if (var8 == 0) {
              return;
            }
          }
          if ((decompiledFrameRemainder25) &&
            (decompiledFrameRemainder24) &&
            (decompiledFrameRemainder23) &&
            (decompiledFrameRemainder22) &&
            (decompiledFrameRemainder21) &&
            (decompiledFrameRemainder20) &&
            (decompiledFrameRemainder19) &&
            (decompiledFrameRemainder18) &&
            (decompiledFrameRemainder17) &&
            (decompiledFrameRemainder16) &&
            (decompiledFrameRemainder15) &&
            (decompiledFrameRemainder14) &&
            (decompiledFrameRemainder13) &&
            (decompiledFrameRemainder12) &&
            (decompiledFrameRemainder11) &&
            (decompiledFrameRemainder10) &&
            (decompiledFrameRemainder9) &&
            (decompiledFrameRemainder8) &&
            (decompiledFrameRemainder7) &&
            (decompiledFrameRemainder6) &&
            (decompiledFrameRemainder5) &&
            (decompiledFrameRemainder4)) {
            this.selectBallSkin(5, (byte) -43);
            if (var8 == 0) {
              return;
            }
          }
          if ((decompiledFrameRemainder25) &&
            (decompiledFrameRemainder24) &&
            (decompiledFrameRemainder23) &&
            (decompiledFrameRemainder22) &&
            (decompiledFrameRemainder21) &&
            (decompiledFrameRemainder20) &&
            (decompiledFrameRemainder19) &&
            (decompiledFrameRemainder18) &&
            (decompiledFrameRemainder17) &&
            (decompiledFrameRemainder16) &&
            (decompiledFrameRemainder15) &&
            (decompiledFrameRemainder14) &&
            (decompiledFrameRemainder13) &&
            (decompiledFrameRemainder12) &&
            (decompiledFrameRemainder11) &&
            (decompiledFrameRemainder10) &&
            (decompiledFrameRemainder9) &&
            (decompiledFrameRemainder8) &&
            (decompiledFrameRemainder7) &&
            (decompiledFrameRemainder6) &&
            (decompiledFrameRemainder5)) {
            this.selectBallSkin(6, (byte) -43);
            if (var8 == 0) {
              return;
            }
          }
          if ((decompiledFrameRemainder25) &&
            (decompiledFrameRemainder24) &&
            (decompiledFrameRemainder23) &&
            (decompiledFrameRemainder22) &&
            (decompiledFrameRemainder21) &&
            (decompiledFrameRemainder20) &&
            (decompiledFrameRemainder19) &&
            (decompiledFrameRemainder18) &&
            (decompiledFrameRemainder17) &&
            (decompiledFrameRemainder16) &&
            (decompiledFrameRemainder15) &&
            (decompiledFrameRemainder14) &&
            (decompiledFrameRemainder13) &&
            (decompiledFrameRemainder12) &&
            (decompiledFrameRemainder11) &&
            (decompiledFrameRemainder10) &&
            (decompiledFrameRemainder9) &&
            (decompiledFrameRemainder8) &&
            (decompiledFrameRemainder7) &&
            (decompiledFrameRemainder6)) {
            this.selectBallSkin(7, (byte) -43);
            if (var8 == 0) {
              return;
            }
          }
          if ((decompiledFrameRemainder25) &&
            (decompiledFrameRemainder24) &&
            (decompiledFrameRemainder23) &&
            (decompiledFrameRemainder22) &&
            (decompiledFrameRemainder21) &&
            (decompiledFrameRemainder20) &&
            (decompiledFrameRemainder19) &&
            (decompiledFrameRemainder18) &&
            (decompiledFrameRemainder17) &&
            (decompiledFrameRemainder16) &&
            (decompiledFrameRemainder15) &&
            (decompiledFrameRemainder14) &&
            (decompiledFrameRemainder13) &&
            (decompiledFrameRemainder12) &&
            (decompiledFrameRemainder11) &&
            (decompiledFrameRemainder10) &&
            (decompiledFrameRemainder9) &&
            (decompiledFrameRemainder8) &&
            (decompiledFrameRemainder7)) {
            ij.field_u = HalloweenBallSkin.field_m;
            KillerBallSkin.a(256, false, true, HalloweenBallSkin.field_m);
            if (var8 == 0) {
              return;
            }
          }
          if ((decompiledFrameRemainder25) &&
            (decompiledFrameRemainder24) &&
            (decompiledFrameRemainder23) &&
            (decompiledFrameRemainder22) &&
            (decompiledFrameRemainder21) &&
            (decompiledFrameRemainder20) &&
            (decompiledFrameRemainder19) &&
            (decompiledFrameRemainder18) &&
            (decompiledFrameRemainder17) &&
            (decompiledFrameRemainder16) &&
            (decompiledFrameRemainder15) &&
            (decompiledFrameRemainder14) &&
            (decompiledFrameRemainder13) &&
            (decompiledFrameRemainder12) &&
            (decompiledFrameRemainder11) &&
            (decompiledFrameRemainder10) &&
            (decompiledFrameRemainder9) &&
            (decompiledFrameRemainder8)) {
            dupTemp$0 = nn.field_b[0].field_b;
            ij.field_u = dupTemp$0;
            KillerBallSkin.a(256, false, true, dupTemp$0);
            if (var8 == 0) {
              return;
            }
          }
          if ((decompiledFrameRemainder25) &&
            (decompiledFrameRemainder24) &&
            (decompiledFrameRemainder23) &&
            (decompiledFrameRemainder22) &&
            (decompiledFrameRemainder21) &&
            (decompiledFrameRemainder20) &&
            (decompiledFrameRemainder19) &&
            (decompiledFrameRemainder18) &&
            (decompiledFrameRemainder17) &&
            (decompiledFrameRemainder16) &&
            (decompiledFrameRemainder15) &&
            (decompiledFrameRemainder14) &&
            (decompiledFrameRemainder13) &&
            (decompiledFrameRemainder12) &&
            (decompiledFrameRemainder11) &&
            (decompiledFrameRemainder10) &&
            (decompiledFrameRemainder9)) {
            dupTemp$1 = nn.field_b[1].field_b;
            ij.field_u = dupTemp$1;
            KillerBallSkin.a(256, false, true, dupTemp$1);
            if (var8 == 0) {
              return;
            }
          }
          if ((decompiledFrameRemainder25) &&
            (decompiledFrameRemainder24) &&
            (decompiledFrameRemainder23) &&
            (decompiledFrameRemainder22) &&
            (decompiledFrameRemainder21) &&
            (decompiledFrameRemainder20) &&
            (decompiledFrameRemainder19) &&
            (decompiledFrameRemainder18) &&
            (decompiledFrameRemainder17) &&
            (decompiledFrameRemainder16) &&
            (decompiledFrameRemainder15) &&
            (decompiledFrameRemainder14) &&
            (decompiledFrameRemainder13) &&
            (decompiledFrameRemainder12) &&
            (decompiledFrameRemainder11) &&
            (decompiledFrameRemainder10)) {
            dupTemp$2 = nn.field_b[2].field_b;
            ij.field_u = dupTemp$2;
            KillerBallSkin.a(256, false, true, dupTemp$2);
            if (var8 == 0) {
              return;
            }
          }
          if ((decompiledFrameRemainder25) &&
            (decompiledFrameRemainder24) &&
            (decompiledFrameRemainder23) &&
            (decompiledFrameRemainder22) &&
            (decompiledFrameRemainder21) &&
            (decompiledFrameRemainder20) &&
            (decompiledFrameRemainder19) &&
            (decompiledFrameRemainder18) &&
            (decompiledFrameRemainder17) &&
            (decompiledFrameRemainder16) &&
            (decompiledFrameRemainder15) &&
            (decompiledFrameRemainder14) &&
            (decompiledFrameRemainder13) &&
            (decompiledFrameRemainder12) &&
            (decompiledFrameRemainder11)) {
            dupTemp$3 = nn.field_b[3].field_b;
            ij.field_u = dupTemp$3;
            KillerBallSkin.a(256, false, true, dupTemp$3);
            if (var8 == 0) {
              return;
            }
          }
          if ((decompiledFrameRemainder25) &&
            (decompiledFrameRemainder24) &&
            (decompiledFrameRemainder23) &&
            (decompiledFrameRemainder22) &&
            (decompiledFrameRemainder21) &&
            (decompiledFrameRemainder20) &&
            (decompiledFrameRemainder19) &&
            (decompiledFrameRemainder18) &&
            (decompiledFrameRemainder17) &&
            (decompiledFrameRemainder16) &&
            (decompiledFrameRemainder15) &&
            (decompiledFrameRemainder14) &&
            (decompiledFrameRemainder13) &&
            (decompiledFrameRemainder12)) {
            dupTemp$4 = nn.field_b[4].field_b;
            ij.field_u = dupTemp$4;
            KillerBallSkin.a(256, false, true, dupTemp$4);
            if (var8 == 0) {
              return;
            }
          }
          if ((decompiledFrameRemainder25) &&
            (decompiledFrameRemainder24) &&
            (decompiledFrameRemainder23) &&
            (decompiledFrameRemainder22) &&
            (decompiledFrameRemainder21) &&
            (decompiledFrameRemainder20) &&
            (decompiledFrameRemainder19) &&
            (decompiledFrameRemainder18) &&
            (decompiledFrameRemainder17) &&
            (decompiledFrameRemainder16) &&
            (decompiledFrameRemainder15) &&
            (decompiledFrameRemainder14) &&
            (decompiledFrameRemainder13)) {
            this.redoShot(72);
            if (var8 == 0) {
              return;
            }
          }
          if ((decompiledFrameRemainder25) &&
            (decompiledFrameRemainder24) &&
            (decompiledFrameRemainder23) &&
            (decompiledFrameRemainder22) &&
            (decompiledFrameRemainder21) &&
            (decompiledFrameRemainder20) &&
            (decompiledFrameRemainder19) &&
            (decompiledFrameRemainder18) &&
            (decompiledFrameRemainder17) &&
            (decompiledFrameRemainder16) &&
            (decompiledFrameRemainder15) &&
            (decompiledFrameRemainder14)) {
            this.resetView(-23095);
            if (var8 == 0) {
              return;
            }
          }
          if ((decompiledFrameRemainder25) &&
            (decompiledFrameRemainder24) &&
            (decompiledFrameRemainder23) &&
            (decompiledFrameRemainder22) &&
            (decompiledFrameRemainder21) &&
            (decompiledFrameRemainder20) &&
            (decompiledFrameRemainder19) &&
            (decompiledFrameRemainder18) &&
            (decompiledFrameRemainder17) &&
            (decompiledFrameRemainder16) &&
            (decompiledFrameRemainder15)) {
            hi.g(-128);
            if (var8 == 0) {
              return;
            }
          }
          if ((decompiledFrameRemainder25) &&
            (decompiledFrameRemainder24) &&
            (decompiledFrameRemainder23) &&
            (decompiledFrameRemainder22) &&
            (decompiledFrameRemainder21) &&
            (decompiledFrameRemainder20) &&
            (decompiledFrameRemainder19) &&
            (decompiledFrameRemainder18) &&
            (decompiledFrameRemainder17) &&
            (decompiledFrameRemainder16)) {
            if (this.tutorial == null) {
              return;
            }
            this.tutorial.restart(-1);
            if (var8 == 0) {
              return;
            }
          }
          if ((decompiledFrameRemainder25) &&
            (decompiledFrameRemainder24) &&
            (decompiledFrameRemainder23) &&
            (decompiledFrameRemainder22) &&
            (decompiledFrameRemainder21) &&
            (decompiledFrameRemainder20) &&
            (decompiledFrameRemainder19) &&
            (decompiledFrameRemainder18) &&
            (decompiledFrameRemainder17)) {
            this.cameraGoal.eyeY = 144.0;
            this.cameraGoal.eyeZ = -143.19449088;
            this.cameraGoal.targetY = 144.0;
            this.cameraGoal.targetZ = 0.0;
            this.cameraGoal.targetX = 379.3516416;
            this.cameraGoal.eyeX = 718.8717888;
            this.cameraGoal.targetZ = this.cameraGoal.targetZ - 8.0;
            if (var8 == 0) {
              return;
            }
          }
          if ((decompiledFrameRemainder25) &&
            (decompiledFrameRemainder24) &&
            (decompiledFrameRemainder23) &&
            (decompiledFrameRemainder22) &&
            (decompiledFrameRemainder21) &&
            (decompiledFrameRemainder20) &&
            (decompiledFrameRemainder19) &&
            (decompiledFrameRemainder18)) {
            this.highlightCurrentGroupBalls((byte) 99);
            if (var8 == 0) {
              return;
            }
          }
          if ((decompiledFrameRemainder25) &&
            (decompiledFrameRemainder24) &&
            (decompiledFrameRemainder23) &&
            (decompiledFrameRemainder22) &&
            (decompiledFrameRemainder21) &&
            (decompiledFrameRemainder20) &&
            (decompiledFrameRemainder19)) {
            var2_ref = ProgressBarWidget.a(true, 0, "Wowsers, penny!", (String) null);
            var2_ref.field_r = 8;
            var2_ref.field_v = 8;
            if (var8 == 0) {
              return;
            }
          }
          if ((decompiledFrameRemainder25) &&
            (decompiledFrameRemainder24) &&
            (decompiledFrameRemainder23) &&
            (decompiledFrameRemainder22) &&
            (decompiledFrameRemainder21) &&
            (decompiledFrameRemainder20)) {
            HighscoresScreen.$cfr$intArgs$a$c9c3307e6488(123, false, 2, "Test message in the ticker!");
            if (var8 == 0) {
              return;
            }
          }
          if ((decompiledFrameRemainder25) &&
            (decompiledFrameRemainder24) &&
            (decompiledFrameRemainder23) &&
            (decompiledFrameRemainder22) &&
            (decompiledFrameRemainder21)) {
            this.refillRackFromPockets((byte) 99);
            if (var8 == 0) {
              return;
            }
          }
          if ((decompiledFrameRemainder25) &&
            (decompiledFrameRemainder24) &&
            (decompiledFrameRemainder23) &&
            (decompiledFrameRemainder22)) {
            stackIn_851_0 = !(wb.field_a);
            wb.field_a = stackIn_851_0;
            if (var8 == 0) {
              return;
            }
          }
          if ((decompiledFrameRemainder25) &&
            (decompiledFrameRemainder24) &&
            (decompiledFrameRemainder23)) {
            stackIn_858_0 = !(ff.field_c);
            ff.field_c = stackIn_858_0;
            if (var8 == 0) {
              return;
            }
          }
          if ((decompiledFrameRemainder25) &&
            (decompiledFrameRemainder24)) {
            var3 = ((ShotRecord) (this.gameModel.shots.last((byte) -52))).breakSeed;
            var4 = f.field_g;
            if (Ball.field_B != null) {
              stackIn_863_0 = Ball.field_B.length;
            } else {
              stackIn_863_0 = 0;
            }
            var5 = stackIn_863_0;
            var6 = -var4 + var3 + 1465;
            var7 = var5 + (-var3 + 940);
            wq.field_c = 39595 + var6 | wq.field_c & -16777216;
            vm.field_f = vm.field_f & 65280;
            dk.field_f = var7 + 7621 * var6;
            field_fb = (var7 << 16) + 998899712;
            stackIn_866_0 = dk.field_f;
            if (this.clockTicks <= 0) {
              stackIn_867_1 = 0;
            } else {
              stackIn_867_1 = this.clockTicks;
            }
            dk.field_f = stackIn_866_0 - stackIn_867_1;
            if (var8 == 0) {
              return;
            }
          }
          if (decompiledFrameRemainder25) {
            var3 = this.clockTicks;
            field_fb = 65535 & field_fb | (100 + (field_fb >>> 16)) % 30484 << 16;
            var4 = var3;
            var5 = var4 + dk.field_f;
            var6 = var5 % 7621;
            var5 = (100 + var6) % 7621 - var6 + var5;
            dk.field_f = var5 - var4;
            if (var8 == 0) {
              return;
            }
          }
          var3 = this.clockTicks;
          var4 = var3;
          var5 = var4 + dk.field_f;
          var6 = var5 % 7621;
          var7 = var5 / 7621;
          var5 = 7621 * ((100 + var7) % 31676) + var6;
          dk.field_f = var5 - var4;
          wq.field_c = -65536 & wq.field_c | ((65535 & wq.field_c) + 100) % 31676;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref2 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var2_ref2), "uf.MD(" + param0 + ')');
        }
    }

    private final int layoutShotIndicators(int param0, int param1, byte param2) {
        ShotRecord var4 = null;
        RuntimeException var4_ref = null;
        int stackIn_18_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = this.gameModel.currentShot(122);
          if (var4.breakSeed < 0) {
            InstructionsScreen.field_H.enabled = false;
          } else {
            param0 = this.placeIndicator(-30818, param0, param1, InstructionsScreen.field_H);
          }
          if (param2 != -51) {
            this.shotCameraStrategy = -70;
          }
          if (this.gameModel.field_y <= 0) {
            SpriteState.field_F.enabled = false;
          } else {
            param0 = this.placeIndicator(-30818, param0, param1, SpriteState.field_F);
          }
          if (var4.ballInHandMode != 0) {
            param0 = this.placeIndicator(-30818, param0, param1, AimTarget.field_f);
          } else {
            AimTarget.field_f.enabled = false;
          }
          if (var4.field_E) {
            param0 = this.placeIndicator(-30818, param0, param1, AlternateLongAndTextLoginPayload.field_q);
          } else {
            AlternateLongAndTextLoginPayload.field_q.enabled = false;
          }
          stackIn_18_0 = param0;
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var4_ref), "uf.MA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final int getHoveredIndicator(int param0) {
        int stackIn_24_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_57_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (AimTarget.field_f.enabled) {
            AimTarget.field_f.updateRoot(true, false);
          }
          if (InstructionsScreen.field_H.enabled) {
            InstructionsScreen.field_H.updateRoot(true, false);
          }
          if (SpriteState.field_F.enabled) {
            SpriteState.field_F.updateRoot(true, false);
          }
          if (AlternateLongAndTextLoginPayload.field_q.enabled) {
            AlternateLongAndTextLoginPayload.field_q.updateRoot(true, false);
          }
          if (q.field_b.enabled) {
            q.field_b.updateRoot(true, false);
          }
          if (AimTarget.field_f.enabled &&
            AimTarget.field_f.activeInside) {
            stackIn_24_0 = 4;
            return stackIn_24_0;
          }
          if (InstructionsScreen.field_H.enabled &&
            InstructionsScreen.field_H.activeInside) {
            stackIn_30_0 = 5;
            return stackIn_30_0;
          }
          if (SpriteState.field_F.enabled &&
            SpriteState.field_F.activeInside) {
            stackIn_38_0 = 6;
            return stackIn_38_0;
          }
          if (param0 != 1163) {
            PoolMatchController.loadCommonUiSprites((ResourceArchive) null, -44, (ResourceArchive) null, (ResourceArchive) null);
          }
          if (AlternateLongAndTextLoginPayload.field_q.enabled &&
            AlternateLongAndTextLoginPayload.field_q.activeInside) {
            stackIn_49_0 = 8;
            return stackIn_49_0;
          }
          if (q.field_b.enabled &&
            q.field_b.activeInside) {
            stackIn_55_0 = this.gameModel.rules.groupMessageIndex(this.gameModel.currentShot(113), param0 ^ -1223);
            return stackIn_55_0;
          }
          stackIn_57_0 = -1;
          return stackIn_57_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var2), "uf.O(" + param0 + ')');
        }
    }

    private final void rebuildBallSkinMeshes(int param0) {
        try {
          dq.field_a.allocateMeshes(7096);
          dq.field_a.prepareForGame(2147483647, this.gameModel);
          LobbyGame.field_gc.buildTableGeometry(this.gameModel, 21894);
          LobbyGame.field_gc.setViewMatrix((byte) 0, this.viewMatrix);
          int var2_int = 90 % ((-12 - param0) / 58);
          this.markBallTransformsDirty(0);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "uf.W(" + param0 + ')');
        }
    }

    private final void handleShotFinished(ShotRecord param0, int param1) {
        int stackIn_60_0 = 0;
        boolean stackIn_81_0 = false;
        int stackIn_81_1 = 0;
        String stackIn_82_2 = null;
        boolean stackIn_86_0 = false;
        int stackIn_86_1 = 0;
        String stackIn_87_2 = null;
        boolean stackIn_91_0 = false;
        int stackIn_91_1 = 0;
        String stackIn_92_2 = null;
        int stackIn_118_0 = 0;
        int stackIn_195_0 = 0;
        int stackIn_195_1 = 0;
        int stackIn_196_2 = 0;
        Object stackIn_254_0 = null;
        StringBuilder stackIn_254_1 = null;
        String stackIn_255_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object var3 = null;
        int var3_int = 0;
        PotEvent var4_ref_cr = null;
        int var4 = 0;
        IntrusiveDequeCursor var5_ref_aa = null;
        int var5 = 0;
        String var5_ref_String = null;
        ShotRecord var6 = null;
        IntrusiveDequeCursor var6_ref = null;
        int var6_int = 0;
        IntrusiveDequeCursor var7 = null;
        ShotRecord var8 = null;
        int var9 = 0;
        PotEvent var10 = null;
        ShotRecord var8Lifetime1;
        try {
          if (param0.pottedBalls != null &&
            !param0.pottedBalls.isEmpty(0)) {
            var3 = new IntrusiveDequeCursor(param0.pottedBalls);
            var4_ref_cr = (PotEvent) (((IntrusiveDequeCursor) (var3)).last((byte) -92));
            while (var4_ref_cr != null) {
              if (0 != var4_ref_cr.ballIndex) {
                field_fb = field_fb + 1;
              }
              var4_ref_cr = (PotEvent) (((IntrusiveDequeCursor) (var3)).previous(-100));
            }
          }
          field_fb = 16 + field_fb & 65535 | -65536 & field_fb;
          if (param1 != 1) {
            this.drawAudioFalloffDebug((byte) -46);
          }
          if (0 != (this.gameModel.currentShot(69).endResolution & um.field_c)) {
            LobbyGame.field_gc.playTableSound(6, 256, (byte) 18, 128);
          }
          if ((sk.field_d & this.modeFlags) != 0 &&
            (Quaternion.field_e & param0.endResolution) != 0) {
            if (this.gameModel.rules instanceof EightBallRules) {
              ProgressBarWidget.a(true, 0, ph.tutorialLose, c.tutorialLoseEightBallGame);
              this.gameModel.placeCueBall(9437184, (IsaacCipher) null, (byte) -114, 9437184, 8);
              param0.endResolution = param0.endResolution & ~Quaternion.field_e;
              if (this.gameModel.isCueBallPotted((byte) 105)) {
                param0.endResolution = param0.endResolution | um.field_c;
              }
            }
            if (this.gameModel.rules instanceof NineBallRules) {
              ProgressBarWidget.a(true, 0, ph.tutorialLose, PotEvent.tutorialLoseNineBallGame);
              this.gameModel.placeCueBall(9437184, (IsaacCipher) null, (byte) -108, 9437184, 9);
              param0.endResolution = param0.endResolution & ~Quaternion.field_e;
              if (this.gameModel.isCueBallPotted((byte) 127)) {
                param0.endResolution = param0.endResolution | um.field_c;
              }
            }
          }
          if (this.gameModel.finishShot(param1 + 22041)) {
            if ((this.modeFlags & TutorialController.field_c) == 0) {
              if ((ag.field_e & param0.endResolution) != 0) {
                this.gameModel.finishGame(-14286, param0.playerIndex);
                if (0 != (f.field_f & this.modeFlags)) {
                  dk.field_f = dk.field_f - 1;
                  this.gameModel.field_m = true;
                  this.submitTimeTrialScore((byte) -102);
                  stackIn_118_0 = (9000 <= this.clockTicks) ? 0 : 1;
                  var3_int = stackIn_118_0;
                  var4 = 1;
                  var5_ref_aa = new IntrusiveDequeCursor(this.gameModel.shots);
                  var6 = (ShotRecord) (var5_ref_aa.last((byte) -92));
                  while (var6 != null) {
                    if (!var6.field_t &&
                      (var6.endResolution & OptionsScreen.field_I) == 0) {
                      var6 = (ShotRecord) (var5_ref_aa.previous(param1 - 106));
                      continue;
                    }
                    var4 = 0;
                    break;
                  }
                  var5 = 1;
                  var6_ref = new IntrusiveDequeCursor(this.gameModel.shots);
                  var7 = new IntrusiveDequeCursor();
                  var8 = (ShotRecord) (var6_ref.last((byte) -92));
                  var8Lifetime1 = (ShotRecord) (var6_ref.previous(-97));
                  while (true) {
                    if (var8Lifetime1 != null) {
                      if (var8Lifetime1.pottedBalls != null) {
                        var7.a(var8Lifetime1.pottedBalls, false);
                        var9 = 0;
                        var10 = (PotEvent) (var7.last((byte) -92));
                        while (var10 != null) {
                          if (var10.ballIndex == 0) {
                            var10 = (PotEvent) (var7.previous(-113));
                            continue;
                          }
                          var9 = 1;
                          break;
                        }
                        if (var9 != 0) {
                          var8Lifetime1 = (ShotRecord) (var6_ref.previous(-125));
                          continue;
                        }
                        var5 = 0;
                      } else {
                        var5 = 0;
                      }
                    }
                    if (Ball.field_B != null &&
                      Ball.field_B.length > 0) {
                      if (var4 != 0 &&
                        t.a(0, ClientException.field_g, 21)) {
                        this.awardAchievement((byte) 104, 21, 234);
                      }
                      if (var5 != 0 &&
                        t.a(param1 - 1, ClientException.field_g, 22)) {
                        this.awardAchievement((byte) 104, 22, 233);
                      }
                      if (var3_int == 0) {
                        break;
                      }
                      if (!t.a(0, ClientException.field_g, 20)) {
                        break;
                      }
                      this.awardAchievement((byte) 104, 20, 235);
                      break;
                    }
                    if (var4 != 0 &&
                      t.a(0, ClientException.field_g, 24)) {
                      this.awardAchievement((byte) 104, 24, 231);
                    }
                    if (var5 != 0 &&
                      t.a(0, ClientException.field_g, 25)) {
                      this.awardAchievement((byte) 104, 25, 230);
                    }
                    if (var3_int == 0) {
                      break;
                    }
                    if (!t.a(param1 ^ 1, ClientException.field_g, 23)) {
                      break;
                    }
                    this.awardAchievement((byte) 104, 23, 232);
                    break;
                  }
                }
                LobbyGame.field_gc.playTableSound(17, 256, (byte) -100, 128);
              } else {
                if ((Quaternion.field_e & param0.endResolution) != 0) {
                  this.gameModel.finishGame(-14286, this.gameModel.rules.nextPlayerIndex(param0, (byte) 114));
                  if (0 != (this.modeFlags & f.field_f)) {
                    this.gameModel.field_m = false;
                  }
                  if ((this.modeFlags & oj.field_m) == 0) {
                    LobbyGame.field_gc.playTableSound(18, 256, (byte) 98, 128);
                  } else {
                    LobbyGame.field_gc.playTableSound(17, 256, (byte) -103, 128);
                  }
                }
              }
              stackIn_195_0 = -3405;
              stackIn_195_1 = -1;
              if (mg.a(true)) {
                stackIn_196_2 = 21;
              } else {
                stackIn_196_2 = 0;
              }
              fq.a(stackIn_195_0, stackIn_195_1, stackIn_196_2, false);
              this.resetView(-23095);
              if ((this.modeFlags & f.field_f) != 0) {
                GameRules.field_b = 23;
                MatchingTextValidator.field_w = 23;
              }
            }
          } else {
            if (this.gameModel.rules.isPlayerActive((byte) -83, param0.playerIndex)) {
              if (this.gameModel.rules instanceof KillerRules &&
                0 == (this.gameModel.field_p & 1 << param0.playerIndex)) {
                if (param0.playerIndex == this.localPlayerIndex &&
                  (this.modeFlags & TutorialController.field_c) != 0) {
                  stackIn_60_0 = 1;
                } else {
                  stackIn_60_0 = 0;
                }
                var3_int = stackIn_60_0;
                var4 = ((KillerRules) (this.gameModel.rules)).field_e[param0.playerIndex];
                if (var3_int == 0) {
                  if (var4 != 1) {
                    var5_ref_String = AccountWelcomePanel.substituteTemplateArguments(new String[]{this.getPlayerName(-30360, param0.playerIndex), Integer.toString(var4)}, -1, TikiTableScene.playerXNowHasNLives);
                  } else {
                    var5_ref_String = AccountWelcomePanel.substituteTemplateArguments(new String[]{this.getPlayerName(-30360, param0.playerIndex)}, -1, PlayerContextMenu.playerXIsOnTheirLastLife);
                  }
                } else {
                  if (1 == var4) {
                    var5_ref_String = bh.youAreOnYourLastLife;
                  } else {
                    var5_ref_String = AccountWelcomePanel.substituteTemplateArguments(new String[]{Integer.toString(var4)}, param1 ^ -2, NanoTickClock.youNowHaveNLives);
                  }
                }
                var6_int = -param0.field_N + var4;
                if (var6_int != 1) {
                  if (var6_int == -1) {
                    stackIn_86_0 = true;
                    stackIn_86_1 = 0;
                    if (var3_int != 0) {
                      stackIn_87_2 = UiComponentNode.youLostALife;
                    } else {
                      stackIn_87_2 = AccountWelcomePanel.substituteTemplateArguments(new String[]{this.getPlayerName(-30360, param0.playerIndex)}, -1, CueStick.playerXLostALife);
                    }
                    ProgressBarWidget.a(stackIn_86_0, stackIn_86_1, stackIn_87_2, var5_ref_String);
                  } else {
                    if (-2 == var6_int) {
                      stackIn_91_0 = true;
                      stackIn_91_1 = 0;
                      if (var3_int == 0) {
                        stackIn_92_2 = AccountWelcomePanel.substituteTemplateArguments(new String[]{this.getPlayerName(-30360, param0.playerIndex)}, -1, GzipDecoder.playerXLostTwoLives);
                      } else {
                        stackIn_92_2 = CueStick.youLostTwoLives;
                      }
                      ProgressBarWidget.a(stackIn_91_0, stackIn_91_1, stackIn_92_2, var5_ref_String);
                    }
                  }
                } else {
                  stackIn_81_0 = true;
                  stackIn_81_1 = 0;
                  if (var3_int != 0) {
                    stackIn_82_2 = oj.youGainedALife;
                  } else {
                    stackIn_82_2 = AccountWelcomePanel.substituteTemplateArguments(new String[]{this.getPlayerName(-30360, param0.playerIndex)}, -1, ArchiveIndex.playerXGainedALife);
                  }
                  ProgressBarWidget.a(stackIn_81_0, stackIn_81_1, stackIn_82_2, var5_ref_String);
                }
              }
            } else {
              ProgressBarWidget.a(true, 0, AccountWelcomePanel.substituteTemplateArguments(new String[]{this.getPlayerName(-30360, param0.playerIndex)}, -1, ShotRecord.playerIsOut), (String) null);
            }
          }
          if ((param0.endResolution & i.field_m) != 0 &&
            (param0.endResolution & ClientException.field_b) == 0) {
            this.announceBallGroups(124, param0);
          }
          if ((sk.field_d & this.modeFlags) == 0) {
            if (param0.field_w > -3) {
              if (param0.field_w != -2) {
                if (param0.field_w != -1) {
                  if (param0.field_w != 1) {
                    if (param0.field_w != 2) {
                      if (param0.field_w < 3) {
                        var3 = null;
                      } else {
                        var3 = DualLinkDeque.doubleplusgoodShot;
                      }
                    } else {
                      var3 = Ball.plusgoodShot;
                    }
                  } else {
                    var3 = LimitedRandomAccessFile.goodShot;
                  }
                } else {
                  var3 = QuickChatMenu.ungoodShot;
                }
              } else {
                var3 = he.plusungoodShot;
              }
            } else {
              var3 = TikiBallSkin.doubleplusungoodShot;
            }
            if (null != var3) {
              ProgressBarWidget.a(true, 5, (String) (((Object[]) (var3))[ga.nextRandomInt(java.lang.reflect.Array.getLength(var3), true, ea.field_r)]), (String) null);
            }
          }
          this.playShotOutcomeSound(param0, (byte) -28);
          RasterSnapshot.a(this, -16813);
          if ((this.modeFlags & sk.field_d) != 0) {
            this.tutorial.checkStepAfterShot(false, param0);
          }
          if ((f.field_f & this.modeFlags) != 0 &&
            (param0.endResolution & OptionsScreen.field_I) != 0) {
            ProgressBarWidget.a(true, 6, AccountWelcomePanel.substituteTemplateArguments(new String[]{Integer.toString(15)}, -1, RasterBuffer.nSecondTimePenalty), (String) null);
            this.field_v = this.clockTicks;
            this.clockTicks = this.clockTicks + 750;
            if ((16711680 & wq.field_c) != 16711680) {
              wq.field_c = wq.field_c + 65536;
            }
          }
          if (0 == (this.modeFlags & TutorialController.field_c) &&
            this.gameModel.currentShot(param1 + 114) != param0) {
            this.beginTurn((byte) -84);
            if (this.gameModel.field_q != -1) {
              this.clockTicks = wn.field_f[this.gameModel.field_q];
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_254_0 = var3;
          stackIn_254_1 = new StringBuilder().append("uf.F(");
          if (param0 == null) {
            stackIn_255_2 = "null";
          } else {
            stackIn_255_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) (stackIn_254_0), ((StringBuilder) (Object) stackIn_254_1).append(stackIn_255_2).append(',').append(param1).append(')').toString());
        }
    }

    final void addBallToRack(int param0, int param1) {
        int fieldTemp$1 = 0;
        Ball var3 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          if (param0 != 0) {
            this.shotCameraStrategy = 125;
          }
          var3 = this.gameModel.balls[param1];
          if (!var3.field_o) {
            var3.positionY = this.rackTop - 264 << 16;
            var3.positionZ = 33554432;
            var3.positionX = MouseWheelInput.field_a[3].field_z + 9 - 320 << 16;
            var3.stop((byte) 115);
            var3.field_o = true;
            var3.transformDirty = true;
            fieldTemp$1 = this.rackBallCount;
            this.rackBallCount = this.rackBallCount + 1;
            this.rackBallIndices[fieldTemp$1] = param1;
            TextWidgetPainter.field_q = 250;
            ff.field_c = true;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var3_ref), "uf.QB(" + param0 + ',' + param1 + ')');
        }
    }

    private final void refreshBallTransforms(int param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = Pool.field_O;
        try {
          var2_int = 0;
          do {
            if (!(this.gameModel.balls.length > var2_int)) {
              dq.field_a.prepareForGame(param0 ^ 2147483630, this.gameModel);
              MouseWheelInput.field_c.field_g = true;
              hh.field_c = true;
              break;
            }
            this.gameModel.balls[var2_int].a(118);
            this.gameModel.balls[var2_int].transformDirty = true;
            var2_int++;
          } while (var3 == 0);
          if (param0 != 17) {
            this.cueSyncTicks = 107;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "uf.E(" + param0 + ')');
        }
    }

    final void updateCueStick(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (param0 != -1) {
            return;
          }
          if (this.canControlCue(-38)) {
            if (MouseWheelInput.field_c.field_g) {
              MouseWheelInput.field_c.update(param0 + 1, this);
              this.lastHoverMouseX = -1;
              this.lastHoverMouseY = -1;
            }
            MouseWheelInput.field_c.drawSegments(32624, this.viewMatrix);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var2), "uf.RD(" + param0 + ')');
        }
    }

    final void readRemoteCueAim(PacketBuffer param0, boolean param1) {
        boolean discarded$1 = false;
        RuntimeException runtimeException = null;
        ShotRecord var3 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = this.gameModel.currentShot(23);
          if (0 != var3.phase) {
            param0.position = param0.position + 8;
            return;
          }
          if (this.localPlayerIndex == var3.playerIndex) {
            param0.position = param0.position + 8;
            return;
          }
          this.remoteCueTarget.readFrom(65280, param0);
          hh.field_c = true;
          MouseWheelInput.field_c.field_g = true;
          if (param1) {
            discarded$1 = this.isPointOnScreen(44, 37, -38, -117);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_12_0 = runtimeException;
          stackIn_12_1 = new StringBuilder().append("uf.N(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    final void buildAimPreviewTrail(int param0) {
        int dupTemp$0 = 0;
        boolean stackIn_52_0 = false;
        int stackIn_75_0 = 0;
        int stackIn_75_1 = 0;
        int stackIn_80_1 = 0;
        RuntimeException decompiledCaughtException = null;
        ShotRecord var2 = null;
        int[] var2_array = null;
        RuntimeException var2_ref = null;
        ShotRecord var3_ref_qe = null;
        PoolGameModel var3_ref_al = null;
        int var3 = 0;
        CueAim var4_ref_kj = null;
        ShotRecord var4_ref_qe = null;
        int var4 = 0;
        PoolGameModel var5_ref_al = null;
        Ball[] var5_ref_pq__ = null;
        int var5 = 0;
        ShotRecord var6_ref_qe = null;
        int var6 = 0;
        Ball[] var6_ref_pq__ = null;
        int var7 = 0;
        ShotRecord var7_ref_qe = null;
        Ball var8 = null;
        int var9 = 0;
        int var10_int = 0;
        Ball var10 = null;
        int var11_int = 0;
        Ball var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19_int = 0;
        long var19 = 0L;
        int var20 = 0;
        int var21_int = 0;
        long var21 = 0L;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        var27 = Pool.field_O;
        try {
          if (0 != this.gameModel.currentShot(43).phase) {
            return;
          }
          if (hh.field_c) {
            var2 = new ShotRecord();
            var3_ref_qe = var2;
            var4_ref_kj = this.cueAim;
            var3_ref_qe.field_H = (byte)var4_ref_kj.field_e;
            var3_ref_qe.aimAngle = (short)((1024 + var4_ref_kj.azimuth) % 2048);
            var3_ref_qe.field_D = (byte)var4_ref_kj.field_d;
            var3_ref_qe.power = (short)var4_ref_kj.field_n;
            var3_ref_qe.elevation = (short)var4_ref_kj.polarAngle;
            var2.power = (short) 2048;
            var3_ref_al = this.gameModel;
            var4_ref_qe = var2;
            UiComponentNode.field_y = 0;
            if (null != Ball.field_B && (Ball.field_B.length != 0 ||
              var27 != 0) && (!(var4_ref_qe.field_D * var4_ref_qe.field_D + var4_ref_qe.field_H * var4_ref_qe.field_H > 9216) ||
              var27 != 0)) {
              var5_ref_al = var3_ref_al;
              var6_ref_qe = var4_ref_qe;
              var7 = 0;
              do {
                if (!(var7 < var5_ref_al.balls.length)) {
                  pc.field_a = Ball.field_B[0];
                  break;
                }
                Ball.field_B[0][var7].copyFrom(var5_ref_al.balls[var7], (byte) -12);
                var7++;
              } while (var27 == 0);
              var7_ref_qe = var6_ref_qe;
              var8 = Ball.field_B[0][0];
              var9 = var7_ref_qe.field_D * var7_ref_qe.field_D + var7_ref_qe.field_H * var7_ref_qe.field_H;
              if (var9 > 9216) {
                throw new IllegalStateException("Strike point out of range! " + var7_ref_qe.field_D + "," + var7_ref_qe.field_H);
              }
              var10_int = -rf.inverseSquareRoot(65536 - (var9 << 2), -125) >> 9;
              var11_int = ScrollPaneWithFooter.sine((int) var7_ref_qe.elevation, true);
              var12 = hc.cosine(2047, (int) var7_ref_qe.elevation);
              var13 = ScrollPaneWithFooter.sine((int) var7_ref_qe.aimAngle, true);
              var14 = hc.cosine(2047, (int) var7_ref_qe.aimAngle);
              var15 = var13;
              var16 = -var14;
              var17 = NameEntryPopup.a(var11_int, false, -var16);
              var18 = NameEntryPopup.a(var11_int, false, var15);
              var19_int = var12;
              var20 = -(var19_int * var16) + var18 * 0 >> 16;
              var21_int = -(var17 * 0) + var19_int * var15 >> 16;
              var22 = var17 * var16 - var18 * var15 >> 16;
              var23 = var20 * var7_ref_qe.field_H + (var15 * var7_ref_qe.field_D + var10_int * var17) >> 9;
              var24 = var16 * var7_ref_qe.field_D + (var18 * var10_int + var7_ref_qe.field_H * var21_int) >> 9;
              var25 = var10_int * var19_int + var7_ref_qe.field_D * 0 + var22 * var7_ref_qe.field_H >> 9;
              var8.velocityX = ArchiveProvider.divideFixed16(PasswordValidator.field_q, (byte) -79, (long)(int)(FullscreenFocusCanvas.multiplyFixedChecked((long)(var7_ref_qe.power * var17), (long)CueAim.field_f, false) / 4096L));
              var8.velocityY = ArchiveProvider.divideFixed16(PasswordValidator.field_q, (byte) -116, (long)(int)(FullscreenFocusCanvas.multiplyFixedChecked((long)(var7_ref_qe.power * var18), (long)CueAim.field_f, false) / 4096L));
              var8.motionState = 1;
              var26 = ArchiveProvider.divideFixed16(PasswordValidator.field_w, (byte) -93, (long)(int)(FullscreenFocusCanvas.multiplyFixedChecked((long)(var7_ref_qe.power * WireframeQuad.field_g), (long)CueAim.field_f, false) / 4096L));
              var8.angularVelocityX = NameEntryPopup.a(-NameEntryPopup.a(var18, false, var25), false, var26);
              var8.angularVelocityY = NameEntryPopup.a(NameEntryPopup.a(var17, false, var25), false, var26);
              var8.angularVelocityZ = NameEntryPopup.a(NameEntryPopup.a(var18, false, var23) - NameEntryPopup.a(var17, false, var24), false, var26);
              QuickChatHelpDialog.f(-13164);
              scanLoop1: do {
                NodeHashTableIterator.field_s = -1;
                td.field_b = 0;
                BallEvent.field_l = 0;
                var5_ref_pq__ = pc.field_a;
                var6 = 0;
                while (var6 < var5_ref_pq__.length) {
                  var5_ref_pq__[var6].lastAdvanceTime = 0;
                  var6++;
                  if (var27 != 0) {
                    break scanLoop1;
                  }
                }
                var5 = 0;
                while (true) {
                  dupTemp$0 = FadingDialog.detectAndApplyBallCollisions(var3_ref_al.cushionSegments, var5, pc.field_a, var3_ref_al.field_e, 0);
                  var5 = dupTemp$0;
                  if (dupTemp$0 != -1) {
                    if (QuickChatHelpDialog.f(-13164)) {
                      continue;
                    }
                    break scanLoop1;
                  }
                  break;
                }
                var6_ref_pq__ = pc.field_a;
                var7 = 0;
                boolean decompiledNaturalLoopExit0 = false;
                while (!(decompiledNaturalLoopExit0 = (var6_ref_pq__.length <= var7))) {
                  stackIn_52_0 = var6_ref_pq__[var7].inPlay;
                  if (var27 == 0) {
                    if (stackIn_52_0) {
                      var6_ref_pq__[var7].a(false);
                    }
                    var7++;
                    continue;
                  }
                  break;
                }
                if (decompiledNaturalLoopExit0) {
                  var3_ref_al.potBallsInPockets(6582, pc.field_a, var4_ref_qe);
                  stackIn_52_0 = QuickChatHelpDialog.f(-13164);
                }
                if (!stackIn_52_0) {
                  break scanLoop1;
                }
              } while (TutorialStep.areAllBallsStopped(pc.field_a, (byte) 57));
            }
            hh.field_c = false;
          }
          if (param0 >= -120) {
            this.cameraGoal = (Camera) null;
          }
          var2_array = this.viewMatrix;
          QuickChatPhraseRegistry.field_g = 0;
          if (0L != (LinkButtonPainter.field_i & 16384L) &&
            var27 == 0) {
            return;
          }
          if (null != Ball.field_B) {
            if (Ball.field_B.length == 0 &&
              var27 == 0) {
              return;
            }
            var3 = 0;
            do {
              stackIn_75_0 = var3;
              stackIn_75_1 = $cfr$lcmp(~(LinkButtonPainter.field_i & 8589934592L), -1L);
              scanLoop2: while (true) {
                if (stackIn_75_1 == 0) {
                  stackIn_80_1 = pc.field_a.length;
                } else {
                  stackIn_80_1 = 1;
                  if (var27 == 0) {
                  }
                }
                if (stackIn_75_0 >= stackIn_80_1) {
                  return;
                }
                var4 = ea.field_p << 11;
                var5 = 0;
                var8 = Ball.field_B[0][var3];
                var9 = 1;
                while (UiComponentNode.field_y > var9) {
                  var10 = Ball.field_B[-1 + var9][var3];
                  var11 = Ball.field_B[var9][var3];
                  var6 = var5 + (var10.lastAdvanceTime & 65535);
                  stackIn_75_0 = 0;
                  stackIn_75_1 = var11.lastAdvanceTime;
                  if (var27 != 0) {
                    continue scanLoop2;
                  }
                  if (stackIn_75_0 == stackIn_75_1 ||
                    !(var11.lastAdvanceTime < 65536)) {
                    var7 = var5 + 65536;
                  } else {
                    var7 = var5 + var11.lastAdvanceTime;
                  }
                  boolean decompiledFrameRemainder0 = true;
                  if (~var10.positionX == ~var11.positionX &&
                    ~var10.positionY == ~var11.positionY) {
                    var5 = var5 + 65536;
                  } else {
                    var12 = var4 + var5;
                    if (var12 >= var6 &&
                      var7 > var12 && ((0 != var10.motionState ||
                      0 != var11.motionState) &&
                      (var10.motionState != 2 ||
                      var11.motionState != 2))) {
                      var13 = (-var12 + (UiComponentNode.field_y << 16)) / UiComponentNode.field_y >> 8;
                      var14 = (var11.positionX - var10.positionX >> 13) * (var12 - var6) / (var7 - var6) + (var10.positionX >> 13);
                      var15 = (var10.positionY >> 13) + (-var10.positionY + var11.positionY >> 13) * (-var6 + var12) / (-var6 + var7);
                      var16 = -64;
                      var17 = -(var8.positionX >> 13) + var14;
                      var18 = -(var8.positionY >> 13) + var15;
                      var19 = (long)(var17 * var17 + var18 * var18);
                      var21 = IterableNodeHashTable.a(-127, var19 << 10) >> 13;
                      decompiledFrameRemainder0 = (!(var21 < 48L) ||
                        var27 != 0);
                      if (decompiledFrameRemainder0) {
                        if (80L > var21) {
                          var23 = (int)(-48L + var21);
                          var13 = var13 * var23 / 32;
                        }
                        var16 = var16 - var2_array[2];
                        var14 = var14 - var2_array[0];
                        var15 = var15 - var2_array[1];
                        var23 = var2_array[10] * var15 + var14 * var2_array[9] + var16 * var2_array[11] >> 16;
                        decompiledFrameRemainder0 = (!(0 >= var23) ||
                          var27 != 0);
                        if (decompiledFrameRemainder0) {
                          var24 = var2_array[5] * var16 + var2_array[3] * var14 + var2_array[4] * var15 >> 3;
                          var25 = var2_array[8] * var16 + (var2_array[6] * var14 + var2_array[7] * var15) >> 3;
                          if (var23 == 0) {
                            var23 = 1;
                          }
                          var24 = var24 / var23 + 5120;
                          var25 = 3840 + var25 / var23;
                          var13 = (var13 << 10) / var23;
                          if (4088 < var13) {
                            var13 = 4088;
                          }
                          ArchiveLoadSequence.field_e[QuickChatPhraseRegistry.field_g].field_c = var14;
                          ArchiveLoadSequence.field_e[QuickChatPhraseRegistry.field_g].field_e = var15;
                          ArchiveLoadSequence.field_e[QuickChatPhraseRegistry.field_g].field_a = var16;
                          ArchiveLoadSequence.field_e[QuickChatPhraseRegistry.field_g].field_h = var24;
                          ArchiveLoadSequence.field_e[QuickChatPhraseRegistry.field_g].field_f = var25;
                          ArchiveLoadSequence.field_e[QuickChatPhraseRegistry.field_g].field_b = var13;
                          ArchiveLoadSequence.field_e[QuickChatPhraseRegistry.field_g].field_d = var3;
                          QuickChatPhraseRegistry.field_g = QuickChatPhraseRegistry.field_g + 1;
                        }
                      }
                    }
                    if ((decompiledFrameRemainder0) && (var11.lastAdvanceTime == 0 ||
                      !(var11.lastAdvanceTime < 65536))) {
                      var5 = var5 + 65536;
                    }
                  }
                  var9++;
                }
                break;
              }
              var3++;
            } while (var27 == 0);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var2_ref), "uf.FA(" + param0 + ')');
        }
    }

    private final void spawnCollisionEffects(byte param0) {
        int fieldTemp$0 = 0;
        TableScene stackIn_16_0;
        int stackIn_16_1;
        int[] stackIn_16_2;
        int stackIn_16_3;
        int[] stackIn_16_4;
        int stackIn_17_5 = 0;
        int stackIn_19_0 = 0;
        int stackIn_38_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        IntrusiveDequeCursor var2 = null;
        RuntimeException var2_ref = null;
        int var3_int = 0;
        PotEvent var3 = null;
        int var4 = 0;
        int var3_intLifetime1;
        var4 = Pool.field_O;
        try {
          boolean decompiledFrameCompleted1 = true;
          if (BallEvent.field_l > 0) {
            var2_int = 0;
            while (!(BallEvent.field_l <= var2_int)) {
              var3_int = TabbedPane.field_Qb[var2_int];
              stackIn_19_0 = $cfr$lcmp(16777216L & LinkButtonPainter.field_i, 0L);
              if (var4 != 0) {
                decompiledFrameCompleted1 = false;
                break;
              }
              if (stackIn_19_0 != 0) {
                System.out.println("bbmom: " + lo.a((long)var3_int, 7697781));
              }
              if (var3_int > 16777216) {
                var3_int = 192;
              } else {
                var3_int = 192 * var3_int >> 23;
              }
              stackIn_16_0 = LobbyGame.field_gc;
              stackIn_16_1 = 1336449640;
              stackIn_16_2 = this.viewMatrix;
              stackIn_16_3 = 32 + var3_int;
              stackIn_16_4 = new int[]{ReportAbuseDialog.field_ac[var2_int][0] >> 13, ReportAbuseDialog.field_ac[var2_int][1] >> 13, ReportAbuseDialog.field_ac[var2_int][2] >> 13};
              if (65536 >= var3_int) {
                stackIn_17_5 = 3;
              } else {
                stackIn_17_5 = 2;
              }
              ((TableScene) (Object) stackIn_16_0).a(stackIn_16_1, stackIn_16_2, stackIn_16_3, stackIn_16_4, stackIn_17_5);
              var2_int++;
            }
          }
          if (decompiledFrameCompleted1) {
            stackIn_19_0 = param0;
          }
          if (stackIn_19_0 >= -69) {
            this.cheatMode = true;
          }
          boolean decompiledFrameCompleted0 = true;
          if (td.field_b > 0) {
            var2_int = 0;
            while (!(td.field_b <= var2_int)) {
              var3_intLifetime1 = SoundCache.field_g[var2_int];
              stackIn_38_0 = $cfr$lcmp(-1L, ~(16777216L & LinkButtonPainter.field_i));
              if (var4 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
              if (stackIn_38_0 != 0) {
                System.out.println("bwmom: " + lo.a((long)var3_intLifetime1, 7697781));
              }
              if (var3_intLifetime1 <= 134217728) {
                var3_intLifetime1 = 192 * var3_intLifetime1 >> 26;
              } else {
                var3_intLifetime1 = 192;
              }
              LobbyGame.field_gc.a(1336449640, this.viewMatrix, 32 + var3_intLifetime1, new int[]{nn.field_e[var2_int][0] >> 13, nn.field_e[var2_int][1] >> 13, nn.field_e[var2_int][2] >> 13}, 5);
              var2_int++;
            }
          }
          if (decompiledFrameCompleted0) {
            stackIn_38_0 = 0;
          }
          if (stackIn_38_0 < this.gameModel.field_j) {
            var2 = new IntrusiveDequeCursor(this.gameModel.currentShot(25).pottedBalls);
            var3 = (PotEvent) (var2.first(0));
            do {
              if (var3 == null) {
                return;
              }
              fieldTemp$0 = this.gameModel.field_j;
              this.gameModel.field_j = this.gameModel.field_j - 1;
              if (fieldTemp$0 <= 0) {
                return;
              }
              LobbyGame.field_gc.a(this.viewMatrix, 4, -94, new int[]{this.gameModel.pockets[var3.pocketIndex].centerX >> 13, this.gameModel.pockets[var3.pocketIndex].centerY >> 13, -64});
              var3 = (PotEvent) (var2.next((byte) -71));
            } while (var4 == 0);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var2_ref), "uf.MC(" + param0 + ')');
        }
    }

    private final int squaredRatioFixed(int param0, int param1, byte param2) {
        String discarded$1 = null;
        RuntimeException var4 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 <= 4) {
            discarded$1 = this.getPlayerColonText(-68);
          }
          stackIn_4_0 = (int)Math.round(Math.pow((double)param1 / (double)param0, 2.0) * 4096.0);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var4), "uf.S(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void alignCueWithCamera(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (param0 != -37) {
            this.handleAimKeys(53);
          }
          if (!this.isLocalPlayersTurn(-1)) {
            this.snapCameraToPreset(param0 ^ 24097);
          } else {
            if (0 <= this.gameModel.currentShot(param0 ^ -86).breakSeed) {
              this.cueAim.azimuth = 0;
            } else {
              if (this.cameraPresetIndex != 0) {
                this.cueAim.aimAt(this.camera, this.gameModel.balls[0], (byte) -106);
              }
            }
            this.tryEnterShotMode((byte) -116);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var2), "uf.EC(" + param0 + ')');
        }
    }

    private final boolean areMovingBallsOnScreen(byte param0) {
        int var3 = 0;
        int var2_int = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          var2_int = -79 % ((param0 + 33) / 60);
          for (var3 = 0; var3 < this.gameModel.balls.length; var3++) {
            if (this.gameModel.balls[var3].inPlay &&
              this.gameModel.balls[var3].motionState != 0 &&
              !this.isPointOnScreen(this.gameModel.balls[var3].positionZ, this.gameModel.balls[var3].positionX, -98, this.gameModel.balls[var3].positionY)) {
              return false;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var2), "uf.NC(" + param0 + ')');
        }
    }

    private final boolean isPointOnScreen(int param0, int param1, int param2, int param3) {
        float[] var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        boolean stackIn_13_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          var6 = 82 / ((-30 - param2) / 57);
          var5 = new float[]{(float)(0 * param1), (float)(param3 * 0), (float)(param0 * 0)};
          ag.projectToScreen(this.viewMatrix, var5, 9);
          stackIn_13_0 = (0.0f <= var5[0]) && (var5[0] <= 640.0f) && (var5[1] >= 0.0f) && (480.0f >= var5[1]);
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var5_ref), "uf.HB(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void resignGame(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if ((TutorialController.field_c & this.modeFlags) == 0) {
            throw new IllegalStateException();
          }
          if (param0 != 1791) {
            this.tutorial = (TutorialController) null;
          }
          JaggrabDownloader.field_j.writeCipheredOpcode(false, 67);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var2), "uf.C(" + param0 + ')');
        }
    }

    private final void drawShotListsDebug(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          this.drawShotHistory(sa.field_h.maxDescent, this.gameModel.shots, (byte) 27);
          if (this.gameModel.field_i != null) {
            this.drawShotHistory(sa.field_h.maxDescent + 320, this.gameModel.field_i, (byte) 27);
          }
          if (param0 != -28) {
            this.aimCameraAtMovingBalls(35);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var2), "uf.U(" + param0 + ')');
        }
    }

    private final void fastForwardTableScene(int param0) {
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = Pool.field_O;
        try {
          LobbyGame.field_gc.updateLightPosition(122);
          if (param0 != 3) {
            field_W = -119;
          }
          LobbyGame.field_gc.initializeScene(true);
          while (true) {
            if (LobbyGame.field_gc.field_H < LobbyGame.field_gc.field_G) {
              LobbyGame.field_gc.buildSceneryLayers(2);
              if (var3 != 0) {
                return;
              }
              continue;
            }
            break;
          }
          this.markBallTransformsDirty(0);
          MouseWheelInput.field_c.field_g = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var2), "uf.J(" + param0 + ')');
        }
    }

    private final boolean tryApplyMouseWheel(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (0 != this.gameModel.currentShot(66).phase) {
            return false;
          }
          var2_int = this.getPowerFromBarPosition((byte) 102);
          var3 = -81 % ((-57 - param0) / 54);
          if (var2_int == -1 &&
            !this.shotModeActive) {
            return false;
          }
          this.adjustPower((byte) 121, -wp.field_d << 7);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var2), "uf.CE(" + param0 + ')');
        }
    }

    final boolean canControlCue(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        boolean stackIn_13_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -38) {
            this.requestRematch((byte) 53);
          }
          boolean decompiledFrameRemainder0 = true;
          var2_int = this.gameModel.currentShot(52).phase;
          if (var2_int != 0 && (1 != var2_int ||
            this.strikeAnimationFrame >= 37)) {
            stackIn_13_0 = false;
            decompiledFrameRemainder0 = false;
          }
          else {
            stackIn_13_0 = true;
          }
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var2), "uf.NB(" + param0 + ')');
        }
    }

    private final void tickClockAndSendCueAim(ShotRecord param0, int param1) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        String stackIn_81_2 = null;
        RuntimeException decompiledCaughtException = null;
        Ball var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        var4 = Pool.field_O;
        try {
          if (this.introDelayTicks < 0) {
            if ((TutorialController.field_c & this.modeFlags) == 0) {
              if ((f.field_f & this.modeFlags) == 0 && !this.gameModel.field_o && (this.gameModel.field_i == null ||
                this.gameModel.field_i.isEmpty(0)) && 0L == (512L & LinkButtonPainter.field_i) && this.gameModel.field_q != -1) {
                this.clockTicks = this.clockTicks - 1;
                if (0 == this.clockTicks) {
                  this.v(0);
                  if (var4 != 0 &&
                    this.clockTicks > 1) {
                    this.clockTicks = this.clockTicks - 1;
                  }
                }
              }
            } else {
              if (this.clockTicks > 1) {
                this.clockTicks = this.clockTicks - 1;
              }
            }
            if (0 != (this.modeFlags & TutorialController.field_c) &&
              this.isLocalPlayersTurn(-1)) {
              fieldTemp$0 = this.cueSyncTicks;
              this.cueSyncTicks = this.cueSyncTicks + 1;
              if (fieldTemp$0 >= 50) {
                if (this.lastSentCueAim == null ||
                  !this.cueAim.equalsAim(-2043, this.lastSentCueAim)) {
                  JaggrabDownloader.field_j.writeCipheredOpcode(false, 70);
                  this.cueAim.writeTo(JaggrabDownloader.field_j, (byte) 106);
                  if (this.lastSentCueAim != null) {
                    this.lastSentCueAim.copyFrom(param1 ^ -17639, this.cueAim);
                    if (var4 != 0) {
                      this.lastSentCueAim = this.cueAim.copy(-14513);
                    }
                  } else {
                    this.lastSentCueAim = this.cueAim.copy(-14513);
                  }
                }
                this.cueSyncTicks = 0;
              }
              if (param0.ballInHandMode != 0) {
                fieldTemp$1 = this.placementSyncTicks;
                this.placementSyncTicks = this.placementSyncTicks + 1;
                if (fieldTemp$1 >= 50) {
                  this.sendManhandledBall((byte) -8);
                }
              }
            }
          }
          if (param1 != -17601) {
            this.raiseCueBlockedWarning(-67);
          }
          if (!this.isLocalPlayersTurn(-1)) {
            var3 = this.gameModel.balls[0];
            if (~param0.cueBallX == ~var3.positionX &&
              ~param0.cueBallY == ~var3.positionY) {
              return;
            }
            var3.positionY = var3.positionY + (-var3.positionY + param0.cueBallY >> 3);
            hh.field_c = true;
            var3.positionX = var3.positionX + (param0.cueBallX - var3.positionX >> 3);
            MouseWheelInput.field_c.field_g = true;
            var3.transformDirty = true;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_80_0 = var3_ref;
          stackIn_80_1 = new StringBuilder().append("uf.FE(");
          if (param0 == null) {
            stackIn_81_2 = "null";
          } else {
            stackIn_81_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_80_0), ((StringBuilder) (Object) stackIn_80_1).append(stackIn_81_2).append(',').append(param1).append(')').toString());
        }
    }

    final void readBallManhandled(int param0, PacketBuffer param1) {
        RuntimeException runtimeException = null;
        ShotRecord var3 = null;
        ShotRecord var4 = null;
        PacketBuffer var5 = null;
        int var6 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = this.gameModel.currentShot(23);
          var6 = 62 % ((-58 - param0) / 63);
          var4 = var3;
          var5 = param1;
          var4.cueBallX = var5.readInt(true);
          var4.cueBallY = var5.readInt(true);
          if (0L != (LinkButtonPainter.field_i & 2097152L)) {
            System.out.println("<-S2C_BALL_MANHANDLED: " + vi.a((byte) 111, 16, 4, (long)var3.cueBallX) + "," + vi.a((byte) 55, 16, 4, (long)var3.cueBallY));
          }
          MouseWheelInput.field_c.field_g = true;
          hh.field_c = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_9_0 = runtimeException;
          stackIn_9_1 = new StringBuilder().append("uf.RC(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    private final void updateShotCamera(int param0) {
        RuntimeException decompiledCaughtException = null;
        double var2_double = 0.0;
        RuntimeException var2 = null;
        double var4 = 0.0;
        double var6 = 0.0;
        double var8 = 0.0;
        Ball var10 = null;
        float var11 = 0.0f;
        int var12 = 0;
        try {
          var12 = this.shotCameraStrategy;
          if (var12 != 0) {
            if (1 == var12) {
              this.centerCameraOnMovingBalls(1);
              var2_double = Math.abs(this.camera.eyeX);
              var4 = Math.abs(576.0 - this.camera.eyeX);
              var6 = Math.abs(this.camera.eyeY);
              var8 = Math.abs(288.0 - this.camera.eyeY);
              this.cameraGoal.eyeZ = -256.0;
              if (var2_double < var4 &&
                var2_double < var6 &&
                var8 > var2_double) {
                this.cameraGoal.eyeX = -120.0;
              } else if (var6 > var4 &&
                var4 < var8) {
                this.cameraGoal.eyeX = 696.0;
              } else {
                if (!(var8 > var6)) {
                  this.cameraGoal.eyeY = 408.0;
                } else {
                  this.cameraGoal.eyeY = -120.0;
                }
              }
              this.idleOrbitStep = -1;
            } else {
              if (var12 != 2) {
                if (var12 != 3) {
                  if (var12 == 4) {
                    this.resetCameraToDefaultPreset(0);
                  }
                } else {
                  var10 = this.gameModel.balls[0];
                  var11 = (float)var10.horizontalSpeed(-8);
                  if (var10.inPlay) {
                    this.cameraGoal.targetX = (double)WidgetStyleLayer.b(127, var10.positionX);
                    this.cameraGoal.targetY = (double)WidgetStyleLayer.b(126, var10.positionY);
                    this.cameraGoal.targetZ = (double)WidgetStyleLayer.b(127, var10.positionZ);
                    this.cameraGoal.eyeX = (double)(WidgetStyleLayer.b(126, var10.positionX) - 80.0f * ((float)var10.velocityX / var11));
                    this.cameraGoal.eyeY = (double)(WidgetStyleLayer.b(127, var10.positionY) - 80.0f * ((float)var10.velocityY / var11));
                    this.cameraGoal.eyeZ = (double)(-24.0f + WidgetStyleLayer.b(126, var10.positionZ));
                  }
                }
              } else {
                this.aimCameraAtMovingBalls(124);
                if (this.areMovingBallsOnScreen((byte) -96)) {
                }
              }
            }
          }
          if (param0 > -25) {
            this.drawHud(false, -39);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var2), "uf.FC(" + param0 + ')');
        }
    }

    PoolMatchController(int param0, int param1, int param2, int param3, int param4, boolean param5, String[] param6, int param7, boolean param8) {
        Ball[] array$0 = null;
        Ball[] array$1 = null;
        boolean stackIn_4_1 = false;
        String stackIn_20_0 = null;
        int stackIn_53_0 = 0;
        int stackIn_73_0 = 0;
        int stackIn_85_0 = 0;
        Object stackIn_93_0 = null;
        StringBuilder stackIn_93_1 = null;
        String stackIn_94_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object var10 = null;
        int var11 = 0;
        String var11_ref_String = null;
        PoolGameModel var11_ref_al = null;
        PoolGameModel var12_ref_al = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var11Lifetime1;
        var16 = Pool.field_O;
        this.powerPulseTick = 0;
        this.ballManhandled = false;
        this.debugPaused = false;
        this.placementSyncTicks = 0;
        this.draggedBallIndex = -1;
        this.cueSyncTicks = 0;
        this.shotModeActive = false;
        this.lastHoverMouseX = -1;
        this.hoveredBallIndex = -1;
        this.dragLastMouseY = -1;
        this.mouseDragMode = 0;
        this.mouseButtonHeld = false;
        this.lastHoverMouseY = -1;
        this.cuePower = 0;
        this.shotConfirmedByServer = false;
        this.dragLastMouseX = -1;
        this.keyRotationRamp = 0;
        this.keyPowerRamp = 0;
        this.cuePullbackDistance = 57;
        this.shotModeFade = 0;
        this.cheatMode = false;
        this.shotCameraStrategy = 0;
        this.camera = new Camera();
        this.cameraGoal = new Camera();
        this.clockTicks = 0;
        this.viewMatrix = new int[12];
        this.idleOrbitDistance = 500;
        this.idleOrbitStep = -1;
        this.viewMatrixDirty = true;
        this.cameraPresetIndex = -1;
        this.field_v = -1;
        this.rackBallCount = 0;
        try {
          this.modeFlags = param0;
          this.localPlayerIndex = param7;
          this.unrated = param8;
          stackIn_4_1 = !(TutorialController.field_i < 2);
          this.cheatsUnlocked = stackIn_4_1;
          un.a(676);
          vi.a(-7414);
          this.initGameModel(param6, param2, -112, param1);
          var10 = null;
          if ((f.field_f & this.modeFlags) != 0) {
            var10 = ProgressBarWidget.a(true, 0, TableScene.timeTrial, Pool.potBallsInAnyOrderFinishOnBlack);
          } else {
            if (0 != (TutorialController.field_c & this.modeFlags) &&
              LobbyPlayer.rulesetNames[param2] != null) {
              var11 = 0;
              while (true) {
                if (var11 < this.gameModel.playerCount) {
                  stackIn_20_0 = this.getPlayerName(-30360, var11);
                  if (var16 == 0) {
                    var11++;
                    continue;
                  }
                } else {
                  stackIn_20_0 = this.gameModel.rules.joinPlayerNames(1, this.playerNameCache);
                }
                break;
              }
              var11_ref_String = stackIn_20_0;
              if (null != var11_ref_String) {
                var10 = ProgressBarWidget.a(true, 0, LobbyPlayer.rulesetNames[param2], var11_ref_String);
              }
            }
          }
          this.introDelayTicks = 200;
          if (var10 != null) {
            ((ij) (var10)).field_B = 250;
          }
          if (0 == (TutorialController.field_c & this.modeFlags)) {
            this.startNewRack((byte) -102);
          }
          boolean decompiledSharedTail0 = ((TutorialController.field_c & this.modeFlags) != 0 &&
            -2 != this.localPlayerIndex);
          if (!decompiledSharedTail0) {
            ValidationIconWidget.field_U = null;
            decompiledSharedTail0 = (var16 != 0);
          }
          if (decompiledSharedTail0) {
            ValidationIconWidget.field_U = new UiComponent("chat_toggle", (UiComponent) null, 0, 440, 60, 20, UsernameAvailabilityValidator.chatButton);
            ValidationIconWidget.field_U.activeFrameSprites = lb.field_O;
            ValidationIconWidget.field_U.frameSprites = Quaternion.field_l;
            ValidationIconWidget.field_U.sprite = ta.field_e;
          }
          boolean decompiledFrameCompleted0 = true;
          if (param5) {
            var11_ref_al = this.gameModel;
            f.field_g = 12;
            var12_ref_al = var11_ref_al;
            Ball.field_B = new Ball[12][];
            var13 = 0;
            scanLoop1: while (true) {
              if (var13 < Ball.field_B.length) {
                array$0 = new Ball[var12_ref_al.balls.length];
                Ball.field_B[var13] = array$0;
                stackIn_53_0 = 0;
                if (var16 != 0) {
                  break scanLoop1;
                }
                var14 = stackIn_53_0;
                while (Ball.field_B[var13].length > var14) {
                  Ball.field_B[var13][var14] = new Ball();
                  var14++;
                }
                var13++;
                continue;
              }
              ArchiveLoadSequence.field_e = new GlowSprite[12 * Ball.field_B.length];
              stackIn_53_0 = 0;
              break;
            }
            var13 = stackIn_53_0;
            do {
              if (!(var13 < ArchiveLoadSequence.field_e.length)) {
                QuickChatPhraseRegistry.field_g = 0;
                break;
              }
              ArchiveLoadSequence.field_e[var13] = new GlowSprite();
              var13++;
            } while (var16 == 0);
          }
          if (!param5 ||
            var16 != 0) {
            var11_ref_al = this.gameModel;
            f.field_g = 0;
            var12_ref_al = var11_ref_al;
            Ball.field_B = new Ball[][]{};
            var13 = 0;
            scanLoop2: while (true) {
              if (Ball.field_B.length > var13) {
                array$1 = new Ball[var12_ref_al.balls.length];
                Ball.field_B[var13] = array$1;
                stackIn_73_0 = 0;
                if (var16 != 0) {
                  break scanLoop2;
                }
                var14 = stackIn_73_0;
                while (Ball.field_B[var13].length > var14) {
                  Ball.field_B[var13][var14] = new Ball();
                  var14++;
                }
                var13++;
                continue;
              }
              ArchiveLoadSequence.field_e = new GlowSprite[Ball.field_B.length * 0];
              stackIn_73_0 = 0;
              break;
            }
            var13 = stackIn_73_0;
            while (ArchiveLoadSequence.field_e.length > var13) {
              ArchiveLoadSequence.field_e[var13] = new GlowSprite();
              var13++;
              if (var16 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
            }
            if (decompiledFrameCompleted0) {
              QuickChatPhraseRegistry.field_g = 0;
            }
          }
          if (decompiledFrameCompleted0) {
            this.setUpTheme(param4, param3, 125);
          }
          var11Lifetime1 = this.gameModel.currentShot(97).breakSeed;
          var12 = f.field_g;
          if (null != Ball.field_B) {
            stackIn_85_0 = Ball.field_B.length;
          } else {
            stackIn_85_0 = 0;
          }
          var13 = stackIn_85_0;
          var14 = 1465 + var11Lifetime1 - var12;
          vm.field_f = vm.field_f & 65280;
          var15 = -var11Lifetime1 + 940 + var13;
          wq.field_c = -16777216 & wq.field_c | 39595 + var14;
          dk.field_f = 7621 * var14 + var15;
          field_fb = 998899712 + (var15 << 16);
          if ((this.modeFlags & TutorialController.field_c) != 0) {
            this.remoteCueTarget = new CueAim();
          }
          this.resetView(-23095);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          stackIn_93_0 = var10;
          stackIn_93_1 = new StringBuilder().append("uf.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_94_2 = "null";
          } else {
            stackIn_94_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) (stackIn_93_0), ((StringBuilder) (Object) stackIn_93_1).append(stackIn_94_2).append(',').append(param7).append(',').append(param8).append(')').toString());
        }
    }

    PoolMatchController(TutorialController param0, String[] param1) {
        RuntimeException runtimeException = null;
        boolean stackIn_4_1 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.powerPulseTick = 0;
        this.ballManhandled = false;
        this.debugPaused = false;
        this.placementSyncTicks = 0;
        this.draggedBallIndex = -1;
        this.cueSyncTicks = 0;
        this.shotModeActive = false;
        this.lastHoverMouseX = -1;
        this.hoveredBallIndex = -1;
        this.dragLastMouseY = -1;
        this.mouseDragMode = 0;
        this.mouseButtonHeld = false;
        this.lastHoverMouseY = -1;
        this.cuePower = 0;
        this.shotConfirmedByServer = false;
        this.dragLastMouseX = -1;
        this.keyRotationRamp = 0;
        this.keyPowerRamp = 0;
        this.cuePullbackDistance = 57;
        this.shotModeFade = 0;
        this.cheatMode = false;
        this.shotCameraStrategy = 0;
        this.camera = new Camera();
        this.cameraGoal = new Camera();
        this.clockTicks = 0;
        this.viewMatrix = new int[12];
        this.idleOrbitDistance = 500;
        this.idleOrbitStep = -1;
        this.viewMatrixDirty = true;
        this.cameraPresetIndex = -1;
        this.field_v = -1;
        this.rackBallCount = 0;
        try {
          stackIn_4_1 = !(TutorialController.field_i < 2);
          this.cheatsUnlocked = stackIn_4_1;
          this.localPlayerIndex = 0;
          this.modeFlags = sk.field_d;
          this.attachTutorial(76, param1, param0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_9_0 = runtimeException;
          stackIn_9_1 = new StringBuilder().append("uf.<init>(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    static {
        tickerHintLeaveShotMode = "Press <img=4> to leave shot mode for top-view.";
        createAgeTooltip = "Type your age in years";
        field_X = 0;
        mouseYAxisNormal = "Mouse Y-axis: Normal";
        field_fb = 0;
        field_y = new byte[1000][];
    }

    private static int $cfr$lcmp(long left, long right) {
        return left < right ? -1 : (left == right ? 0 : 1);
    }
}
