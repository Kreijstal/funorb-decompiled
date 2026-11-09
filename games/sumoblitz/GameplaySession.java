/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class GameplaySession {
    private double backdropY;
    private boolean showBlastHint;
    private double field_h;
    static Object legacyTurbulentWaterData;
    static int field_k;
    private int[] secondGradientColors;
    private double field_m;
    private double backdropX;
    private int[] firstGradientColors;
    private double backdropVelocityX;
    static float[][] noiseGradients;
    private static int targetMarkerYQ8;
    private double backdropVelocityY;

    private final void renderArenaBackground(int param0) {
        int[][] stackIn_25_0 = null;
        int stackIn_26_1 = 0;
        int[][] stackIn_33_0 = null;
        int stackIn_34_1 = 0;
        int[][] stackIn_41_0 = null;
        int stackIn_42_1 = 0;
        RuntimeException decompiledCaughtException = null;
        GraphicsToolkit var2 = null;
        RuntimeException var2_ref = null;
        int var3_int = 0;
        int[] var3 = null;
        int var4_int = 0;
        SceneryParticle var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var4_intLifetime1;
        var9 = Sumoblitz.field_L ? 1 : 0;
        try {
          var2 = MatchingTextValidator.field_h.getToolkit(param0 ^ -80);
          if (param0 != 60) {
            return;
          }
          if (0 == lg.field_c % 500 ||
            null == this.firstGradientColors ||
            this.secondGradientColors == null) {
            var3_int = OpenGlShaderProgram.levelIndex % 6;
            if (var3_int == -1) {
              var3_int = 0;
            }
            var4_int = (PowerupPickup.field_t + 1) % bi.field_a[var3_int].length;
            var5 = (2 + PowerupPickup.field_t) % bi.field_a[var3_int].length;
            var6 = bi.field_a[var3_int][PowerupPickup.field_t];
            var7 = bi.field_a[var3_int][var4_int];
            var8 = bi.field_a[var3_int][var5];
            if (AccountCreationProgressDialog.field_ob) {
              if (2 <= kr.field_e) {
                stackIn_25_0 = bi.field_a;
                if ((var3_int - 1) % 6 < 0) {
                  stackIn_26_1 = 5;
                } else {
                  stackIn_26_1 = (var3_int - 1) % 6;
                }
                var7 = stackIn_25_0[stackIn_26_1][var4_int];
              }
              if (kr.field_e >= 1) {
                stackIn_33_0 = bi.field_a;
                if (0 > (var3_int - 1) % 6) {
                  stackIn_34_1 = 5;
                } else {
                  stackIn_34_1 = (var3_int - 1) % 6;
                }
                var6 = stackIn_33_0[stackIn_34_1][PowerupPickup.field_t];
              }
              if (kr.field_e == 3) {
                stackIn_41_0 = bi.field_a;
                if (0 > (-1 + var3_int) % 6) {
                  stackIn_42_1 = 5;
                } else {
                  stackIn_42_1 = (-1 + var3_int) % 6;
                }
                var8 = stackIn_41_0[stackIn_42_1][var5];
              }
              kr.field_e = kr.field_e - 1;
              if (kr.field_e <= 0) {
                AccountCreationProgressDialog.field_ob = false;
              }
            }
            this.firstGradientColors = nf.a(var6, (byte) -117, 501, var7);
            this.secondGradientColors = nf.a(var7, (byte) -87, 501, var8);
            PowerupPickup.field_t = PowerupPickup.field_t + 1;
            if (bi.field_a[var3_int].length <= PowerupPickup.field_t) {
              PowerupPickup.field_t = 0;
            }
          }
          var3 = nf.a(this.firstGradientColors[lg.field_c % 500], (byte) -118, 480, this.secondGradientColors[lg.field_c % 500]);
          var4_intLifetime1 = 0;
          scanLoop1: while (true) {
            boolean decompiledFrameCompleted0 = true;
            if (var4_intLifetime1 < 480) {
              var2.drawHorizontalLineAlpha(var3[var4_intLifetime1] - 16777216, param0 + 23, var4_intLifetime1, 640, 0);
              var4_intLifetime1++;
              if (var9 == 0) {
                continue;
              }
            } else {
              if (ul.field_f == 0) {
                OpenGlEnvironmentWaterEffect.field_i.draw((int)this.backdropX, (int)this.backdropY, 0, 1140850688, 1);
                if (null != FallbackShaderEffect.sceneryParticles) {
                  var4 = (SceneryParticle) (FallbackShaderEffect.sceneryParticles.first(125));
                  while (var4 != null) {
                    var4.render(var2, -123);
                    var4 = (SceneryParticle) (FallbackShaderEffect.sceneryParticles.next((byte) 18));
                    if (var9 != 0) {
                      decompiledFrameCompleted0 = false;
                      break;
                    }
                  }
                }
              }
            }
            if ((decompiledFrameCompleted0) &&
              (ul.field_f == 1)) {
              this.renderSimpleArenaBorder(24, var2);
              if (var9 == 0) {
                break scanLoop1;
              }
            }
            this.renderAnimatedArenaBorder(-109, var2);
            break;
          }
          lg.field_c = lg.field_c + 1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) var2_ref), "qu.I(" + param0 + ')');
        }
    }

    private final void renderSimpleArenaBorder(int guard, GraphicsToolkit toolkit) {
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        int stackIn_23_0 = 0;
        int stackIn_23_1 = 0;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_12_0Lifetime1;
        int stackIn_12_1Lifetime1;
        var6 = Sumoblitz.field_L ? 1 : 0;
        try {
          RidgedNoise3D.field_w[2].draw(0, 0);
          RidgedNoise3D.field_w[3].draw(608, 0);
          RidgedNoise3D.field_w[0].draw(0, 448);
          RidgedNoise3D.field_w[1].draw(608, 448);
          var3_int = 0;
          var4 = (lg.field_c >> 1) % ok.field_f.length;
          var5 = 32;
          scanLoop1: while (true) {
            boolean decompiledFrameRemainder0 = true;
            if (var5 < 608) {
              ok.field_f[0].draw(var5, 5, 1, var3_int << 24, 1);
              var4++;
              ok.field_f[0].draw(var5, 440, 1, var3_int << 24, 1);
              stackIn_12_0 = var4;
              stackIn_12_1 = ok.field_f.length;
              if (var6 != 0) {
                if (stackIn_12_0 < stackIn_12_1) {
                  TurbulenceNoise3D.field_k[0].draw(9, -16 + var5, 1, var3_int << 24, 1);
                  TurbulenceNoise3D.field_k[0].draw(598, var5 - 16, 1, var3_int << 24, 1);
                  var4++;
                  stackIn_23_0 = ~ok.field_f.length;
                  stackIn_23_1 = ~var4;
                  break scanLoop1;
                }
                decompiledFrameRemainder0 = false;
              }
              else {
                if (stackIn_12_0 == stackIn_12_1) {
                  var4 = 0;
                }
                var5 = var5 + ok.field_f[0].width();
                continue;
              }
            }
            if (decompiledFrameRemainder0) {
              var5 = 48;
              while (true) {
                stackIn_12_0Lifetime1 = -449;
                stackIn_12_1Lifetime1 = ~var5;
                if (stackIn_12_0Lifetime1 >= stackIn_12_1Lifetime1) {
                  break;
                }
                TurbulenceNoise3D.field_k[0].draw(9, -16 + var5, 1, var3_int << 24, 1);
                TurbulenceNoise3D.field_k[0].draw(598, var5 - 16, 1, var3_int << 24, 1);
                var4++;
                stackIn_23_0 = ~ok.field_f.length;
                stackIn_23_1 = ~var4;
                if (var6 != 0) {
                  break scanLoop1;
                }
                if (stackIn_23_0 == stackIn_23_1) {
                  var4 = 0;
                }
                var5 = var5 + ok.field_f[0].width();
              }
            }
            stackIn_23_0 = guard;
            stackIn_23_1 = 24;
            break;
          }
          if (stackIn_23_0 != stackIn_23_1) {
            this.updatePowerupPickups(-88);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_30_0 = var3;
          stackIn_30_1 = new StringBuilder().append("qu.H(").append(guard).append(',');
          if (toolkit == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(')').toString());
        }
    }

    final void render(int guard, GraphicsToolkit toolkit, boolean unused) {
        Object stackIn_20_0 = null;
        int stackIn_34_0 = 0;
        HudMessage stackIn_44_0 = null;
        Object stackIn_54_0 = null;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        String stackIn_69_2 = null;
        RuntimeException decompiledCaughtException = null;
        HudMessage stackOut_43_0;
        ArenaPad var4 = null;
        int var4_int = 0;
        PowerupPickup var4_ref = null;
        HudMessage var4_ref2 = null;
        TimedSceneEffect var4_ref3 = null;
        RuntimeException var4_ref4 = null;
        Drone var5 = null;
        int var6 = 0;
        int var4_intLifetime1;
        var6 = Sumoblitz.field_L ? 1 : 0;
        try {
          boolean decompiledFrameCompleted3 = true;
          boolean decompiledFrameCompleted4 = true;
          toolkit.clear(0);
          this.renderArenaBackground(60);
          if (null != QuickChatPhraseProvider.arenaPads) {
            var4 = (ArenaPad) (QuickChatPhraseProvider.arenaPads.first(-81));
            while (var4 != null) {
              var4.render(toolkit, -15687169);
              var4 = (ArenaPad) (QuickChatPhraseProvider.arenaPads.next((byte) 18));
              if (var6 != 0) {
                decompiledFrameCompleted4 = false;
                break;
              }
            }
          }
          if ((decompiledFrameCompleted4) &&
            (SpriteMask.drones != null)) {
            var4_int = 0;
            while (!(var4_int >= SpriteMask.drones.length)) {
              var5 = SpriteMask.drones[var4_int];
              stackIn_20_0 = null;
              if (var6 != 0) {
                decompiledFrameCompleted3 = false;
                break;
              }
              if (stackIn_20_0 != var5) {
                var5.render(toolkit, 19399);
              }
              var4_int++;
            }
          }
          if (decompiledFrameCompleted3) {
            stackIn_20_0 = null;
          }
          boolean decompiledFrameRemainder1 = true;
          boolean decompiledFrameCompleted2 = true;
          if (stackIn_20_0 != bj.powerupPickups) {
            var4_ref = (PowerupPickup) (bj.powerupPickups.first(-90));
            while (var4_ref != null) {
              var4_ref.render(-62, toolkit);
              var4_ref = (PowerupPickup) (bj.powerupPickups.next((byte) 18));
              if (var6 != 0) {
                decompiledFrameCompleted2 = false;
                break;
              }
            }
          }
          if (decompiledFrameCompleted2) {
            decompiledFrameRemainder1 = !(60 <= fa.field_b);
          }
          if (decompiledFrameRemainder1) {
            if (fa.field_b <= 30) {
              stackIn_34_0 = fa.field_b;
            } else {
              stackIn_34_0 = 30;
            }
            var4_intLifetime1 = stackIn_34_0;
            if (0 == ul.field_f) {
              HardwareSpecularEffect.field_f[1].drawRotated((float)(64 + (OpenGlBuffer.targetMarkerXQ8 >> 8)), (float)(targetMarkerYQ8 >> 8), 4096, 0, 1, 0, 2);
              HardwareSpecularEffect.field_f[1].drawRotated((float)((OpenGlBuffer.targetMarkerXQ8 >> 8) - 64), (float)(targetMarkerYQ8 >> 8), 4096, 32768, 1, 0, 2);
              HardwareSpecularEffect.field_f[1].drawRotated((float)(OpenGlBuffer.targetMarkerXQ8 >> 8), (float)((targetMarkerYQ8 >> 8) + 64), 4096, 49152, 1, 0, 2);
              HardwareSpecularEffect.field_f[1].drawRotated((float)(OpenGlBuffer.targetMarkerXQ8 >> 8), (float)(-64 + (targetMarkerYQ8 >> 8)), 4096, 16384, 1, 0, 2);
              HardwareSpecularEffect.field_f[0].drawRotated((float)(OpenGlBuffer.targetMarkerXQ8 >> 8), (float)(targetMarkerYQ8 >> 8), (int)((double)var4_intLifetime1 * 97.52380952380952), 0, 1, 0, 2);
              if (var6 != 0) {
                OpenGlUnderwaterEffect.field_t.draw((OpenGlBuffer.targetMarkerXQ8 >> 8) - (OpenGlUnderwaterEffect.field_t.width() >> 1), (targetMarkerYQ8 >> 8) - (OpenGlUnderwaterEffect.field_t.height() >> 1), 1, 0, 2);
              }
            } else {
              OpenGlUnderwaterEffect.field_t.draw((OpenGlBuffer.targetMarkerXQ8 >> 8) - (OpenGlUnderwaterEffect.field_t.width() >> 1), (targetMarkerYQ8 >> 8) - (OpenGlUnderwaterEffect.field_t.height() >> 1), 1, 0, 2);
            }
          }
          boolean decompiledFrameCompleted0 = true;
          boolean decompiledFrameRemainder0 = true;
          boolean decompiledFrameCompleted1 = true;
          if (!MusicPatch.simulationPaused) {
            var4_ref2 = (HudMessage) (ig.hudMessages.first(-59));
            while (var4_ref2 != null) {
              stackOut_43_0 = (HudMessage) (var4_ref2);
              stackIn_54_0 = stackOut_43_0;
              stackIn_44_0 = stackOut_43_0;
              if (var6 != 0) {
                decompiledFrameCompleted1 = false;
                break;
              }
              if (stackIn_44_0 != null) {
                var4_ref2.render((byte) -70);
              }
              var4_ref2 = (HudMessage) (ig.hudMessages.next((byte) 18));
            }
          }
          if ((decompiledFrameCompleted1) &&
            (decompiledFrameRemainder0 = (OpenGlCubeTexture.sceneEffects != null))) {
            stackIn_54_0 = OpenGlCubeTexture.sceneEffects.first(-84);
          }
          if (decompiledFrameRemainder0) {
            var4_ref3 = (TimedSceneEffect) (stackIn_54_0);
            while (null != var4_ref3) {
              var4_ref3.render(toolkit, -127);
              var4_ref3 = (TimedSceneEffect) (OpenGlCubeTexture.sceneEffects.next((byte) 18));
              if (var6 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
            }
          }
          if (decompiledFrameCompleted0) {
            this.renderHud((byte) -106, toolkit);
            uc.a(toolkit, false);
          }
          if (guard < 117) {
            this.showHudMessage(6, 60, (String) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref4 = decompiledCaughtException;
          stackIn_68_0 = var4_ref4;
          stackIn_68_1 = new StringBuilder().append("qu.S(").append(guard).append(',');
          if (toolkit == null) {
            stackIn_69_2 = "null";
          } else {
            stackIn_69_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_68_0), ((StringBuilder) (Object) stackIn_68_1).append(stackIn_69_2).append(',').append(unused).append(')').toString());
        }
    }

    private final void updateArenaPads(byte param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        IntrusiveDequeCursor var3 = null;
        ArenaPad var4 = null;
        int var5 = 0;
        Drone var6 = null;
        int var7 = 0;
        int stackIn_20_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = Sumoblitz.field_L ? 1 : 0;
        try {
          var2_int = 0;
          var3 = new IntrusiveDequeCursor(QuickChatPhraseProvider.arenaPads);
          if (param0 < 59) {
            return;
          }
          var4 = (ArenaPad) (var3.first((byte) -80));
          scanLoop1: while (true) {
            if (var4 != null) {
              var4.update(1048149637);
              stackIn_20_0 = 0;
              if (var7 != 0) {
                break scanLoop1;
              }
              var5 = stackIn_20_0;
              while (var5 < SpriteMask.drones.length) {
                var6 = SpriteMask.drones[var5];
                if (null != var6 &&
                  var4.overlapsDrone(var6, 2145812808)) {
                  var2_int = 1;
                  var4.applyToDrone(var6, 16776960);
                }
                var5++;
              }
              var4 = (ArenaPad) (var3.next(0));
              continue scanLoop1;
            }
            stackIn_20_0 = var2_int;
            break;
          }
          if (stackIn_20_0 == 0) {
            GameInstructions.field_b = -1;
            lf.b((byte) -128);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "qu.P(" + param0 + ')');
        }
    }

    final void closePauseMenu(byte param0) {
        try {
          po.pauseMenuOpen = false;
          if (param0 != 112) {
            noiseGradients = (float[][]) null;
          }
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "qu.O(" + param0 + ')');
        }
    }

    final static void renderLitMeshFaces(int param0, CompactMeshGeometry param1, int param2, int param3, int param4, int param5, byte param6, int param7) {
        int stackIn_25_0 = 0;
        int[] stackIn_28_0 = null;
        int stackIn_29_1 = 0;
        int stackIn_31_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_44_0 = 0;
        int stackIn_48_0 = 0;
        l stackIn_64_0 = null;
        int stackIn_72_0 = 0;
        int stackIn_77_0 = 0;
        RuntimeException stackIn_83_0 = null;
        StringBuilder stackIn_83_1 = null;
        String stackIn_84_2 = null;
        RuntimeException decompiledCaughtException = null;
        CompactMeshGeometry var8 = null;
        int[] var8_array = null;
        RuntimeException var8_ref = null;
        byte[] var9 = null;
        int[] var9_array = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        l var21 = null;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int var40 = 0;
        int var13Lifetime1;
        int var14Lifetime1;
        int var15Lifetime1;
        int var15Lifetime2;
        var40 = Sumoblitz.field_L ? 1 : 0;
        try {
          var8 = param1;
          if (null != var8.field_a &&
            var8.field_E > 1) {
            var9 = var8.field_a;
            GraphicsHeap.a(var9, LoginForm.field_G, 0, 0, 0);
            if (var40 != 0) {
              vf.a(0);
            }
          } else {
            vf.a(0);
          }
          if (param6 >= -1) {
            return;
          }
          var8_array = new int[param1.field_c];
          var9_array = new int[param1.field_c];
          var10 = of.field_t;
          var11 = r.field_r;
          var12 = qr.field_d;
          var13 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (!(var13 < param1.field_c)))) {
            var14 = param4 * var12[var13] + (param0 * var10[var13] + var11[var13] * param7) >> 8;
            stackIn_31_0 = var14;
            if (var40 == 0) {
              if (stackIn_31_0 < 0) {
                var14 = -var14;
              }
              if (0 > var14) {
                stackIn_25_0 = 128;
              } else {
                if (var14 >= 128) {
                  stackIn_25_0 = 256;
                } else {
                  stackIn_25_0 = var14 + 128;
                }
              }
              var14 = stackIn_25_0;
              var15 = param3 * var10[var13] + (var11[var13] * param5 + var12[var13] * param2) >> 8;
              stackIn_28_0 = sq.field_a;
              if (var15 < 0) {
                stackIn_29_1 = -var15;
              } else {
                stackIn_29_1 = var15;
              }
              var15Lifetime2 = stackIn_28_0[stackIn_29_1];
              var14 = var14 * (256 - var15Lifetime2) >>> 8;
              var8_array[var13] = var14;
              var9_array[var13] = var15Lifetime2;
              var13++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_31_0 = 0;
          }
          var13Lifetime1 = stackIn_31_0;
          while (sv.field_b > var13Lifetime1) {
            var14Lifetime1 = Sumoblitz.field_G[var13Lifetime1];
            var15Lifetime1 = param1.field_A[var14Lifetime1];
            var16 = param1.field_b[var14Lifetime1];
            var17 = param1.field_l[var14Lifetime1];
            if (var40 != 0) {
              return;
            }
            if (param1.field_e[var14Lifetime1] < of.field_t.length) {
              stackIn_40_0 = param1.field_e[var14Lifetime1];
            } else {
              stackIn_40_0 = -1;
            }
            var18 = stackIn_40_0;
            if (param1.field_k[var14Lifetime1] < of.field_t.length) {
              stackIn_44_0 = param1.field_k[var14Lifetime1];
            } else {
              stackIn_44_0 = -1;
            }
            var19 = stackIn_44_0;
            if (param1.field_h[var14Lifetime1] < of.field_t.length) {
              stackIn_48_0 = param1.field_h[var14Lifetime1];
            } else {
              stackIn_48_0 = -1;
            }
            var20 = stackIn_48_0;
            if (LegacyOpenGlReflectionEffect.field_i != null &&
              param1.field_K != null &&
              var14Lifetime1 < param1.field_K.length &&
              param1.field_K[var14Lifetime1] != -1 &&
              LegacyOpenGlReflectionEffect.field_i.length > param1.field_K[var14Lifetime1]) {
              stackIn_64_0 = LegacyOpenGlReflectionEffect.field_i[param1.field_K[var14Lifetime1]];
            } else {
              stackIn_64_0 = null;
            }
            var21 = stackIn_64_0;
            var22 = ScrollViewport.field_z[var15Lifetime1];
            var23 = LegacyOpenGlCubeTexture.field_o[var15Lifetime1];
            var24 = ScrollViewport.field_z[var16];
            var25 = LegacyOpenGlCubeTexture.field_o[var16];
            var26 = ScrollViewport.field_z[var17];
            var27 = LegacyOpenGlCubeTexture.field_o[var17];
            if (var19 == var18 &&
              var20 == var19) {
              var28 = var8_array[var18];
              var29 = var9_array[var18];
              if (null == var21) {
                stackIn_72_0 = 8355711;
              } else {
                stackIn_72_0 = var21.field_b;
              }
              var30 = stackIn_72_0;
              var31 = 16711935 & var30;
              var32 = 65280 & var30;
              var33 = (-16711696 & var31 * var28) >>> 8 | (16711739 & var28 * var32) >>> 8;
              var33 = var33 + var29 * 65793;
              SoftLruCache.a(var24, 8355711 & var33 >> 1, var27, (byte) 27, var25, var23, var26, var22);
            } else {
              var28 = var8_array[var18];
              var29 = var8_array[var19];
              var30 = var8_array[var20];
              var31 = var9_array[var18];
              var32 = var9_array[var19];
              var33 = var9_array[var20];
              if (null != var21) {
                stackIn_77_0 = var21.field_b;
              } else {
                stackIn_77_0 = 8355711;
              }
              var34 = stackIn_77_0;
              var35 = 16711935 & var34;
              var36 = 65280 & var34;
              var37 = (-16711691 & var35 * var28) >>> 8 | -1862205696 & var28 * var36 >>> 8;
              var38 = (16711795 & var29 * var36) >>> 8 | var29 * var35 >>> 8 & 1711210751;
              var38 = var38 + var32 * 65793;
              var37 = var37 + 65793 * var31;
              var39 = (16711933 & var30 * var36) >>> 8 | (var35 * var30 & -16711934) >>> 8;
              var39 = var39 + var33 * 65793;
              SoftwareRenderTarget.a(var26, var39 >> 16, var27, (byte) 27, 255 & var37, var22, var38 >> 16, (var39 & 65340) >> 8, var25, var37 >> 16, (65513 & var38) >> 8, var39 & 255, var23, var38 & 255, (65436 & var37) >> 8, var24);
            }
            var13Lifetime1++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_83_0 = var8_ref;
          stackIn_83_1 = new StringBuilder().append("qu.T(").append(param0).append(',');
          if (param1 == null) {
            stackIn_84_2 = "null";
          } else {
            stackIn_84_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_83_0), ((StringBuilder) (Object) stackIn_83_1).append(stackIn_84_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    private final void updateSceneryParticles(byte param0) {
        RuntimeException runtimeException = null;
        SceneryParticle var2 = null;
        int var3 = 0;
        int var4 = 0;
        boolean stackIn_4_0 = false;
        int stackIn_11_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0;
        var4 = Sumoblitz.field_L ? 1 : 0;
        try {
          var2 = (SceneryParticle) (FallbackShaderEffect.sceneryParticles.first(-68));
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (null == var2))) {
            stackOut_3_0 = var2.updateAndIsExpired(-2567);
            stackIn_11_0 = stackOut_3_0 ? 1 : 0;
            stackIn_4_0 = stackOut_3_0;
            if (var4 == 0) {
              if (stackIn_4_0) {
                var2.unlink(false);
              }
              var2 = (SceneryParticle) (FallbackShaderEffect.sceneryParticles.next((byte) 18));
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_11_0 = 61 / ((-13 - param0) / 54);
          }
          var3 = stackIn_11_0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "qu.F(" + param0 + ')');
        }
    }

    private final void updatePowerupPickups(int param0) {
        RuntimeException decompiledCaughtException = null;
        Drone var2 = null;
        RuntimeException var2_ref = null;
        PowerupPickup var3 = null;
        int var4 = 0;
        int var5 = 0;
        var5 = Sumoblitz.field_L ? 1 : 0;
        try {
          var2 = SpriteMask.drones[0];
          var3 = (PowerupPickup) (bj.powerupPickups.first(param0 + 14762));
          while (var3 != null) {
            var3.update(param0 - 16401);
            if (var5 != 0) {
              return;
            }
            if (null != var2) {
              var4 = var2.radiusQ8 + var3.radiusQ8(-127);
              if (wn.a(var2.yQ8, var4, -127, var3.xQ8((byte) 70), var2.xQ8, var3.yQ8(param0 ^ 14936)) &&
                !var3.isMoving(0)) {
                var2.applyPowerup((byte) 88, var3);
                gn.a(27, true);
                if (2 == var3.effectIndex) {
                  LegacyOpenGlNormalMapGenerator.field_c = true;
                  rn.a(UpgradeStatNames.names[2] + "+", var2.xQ8 >> 8, var2.yQ8 >> 8, 16732416, 28807);
                } else if (var3.effectIndex != 0) {
                  if (var3.effectIndex == 1) {
                    DroneChargeParticle.field_w = true;
                    rn.a(UpgradeStatNames.names[1] + "+", var2.xQ8 >> 8, var2.yQ8 >> 8, 12714108, param0 + 43661);
                  } else if (3 != var3.effectIndex) {
                    if (4 == var3.effectIndex) {
                      DroneChargeParticle.field_w = true;
                      rn.a(UpgradeStatNames.names[4], var2.xQ8 >> 8, var2.yQ8 >> 8, 44031, param0 + 43661);
                    }
                  } else {
                    DroneChargeParticle.field_w = true;
                    rn.a(UpgradeStatNames.names[3], var2.xQ8 >> 8, var2.yQ8 >> 8, 16711680, 28807);
                  }
                } else {
                  SecondaryNodeDeque.field_e = true;
                  rn.a(UpgradeStatNames.names[0] + "+", var2.xQ8 >> 8, var2.yQ8 >> 8, 32780, 28807);
                }
                RotarySelectorWidget.field_E = true;
                var3.unlink(false);
              }
            }
            if (var3.remainingTicks <= 0) {
              var3.unlink(false);
            }
            var3 = (PowerupPickup) (bj.powerupPickups.next((byte) 18));
          }
          if (param0 != -14854) {
            field_k = -94;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) var2_ref), "qu.E(" + param0 + ')');
        }
    }

    private final void handleGameKey(byte param0) {
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        var3 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (TextureCombineOperation.field_a == 13) {
            po.pauseMenuOpen = true;
            StrongCacheReference.switchMenuScreen(-7753, false, 1);
          }
          if (!MusicPatch.simulationPaused) {
          }
          if (param0 > -68) {
            field_k = -6;
          }
          if (Bzip2State.field_j < 2) {
            return;
          }
          regionExit1: {
            regionExit2: {
              regionExit3: {
                regionExit4: {
                  boolean decompiledFrameRemainder0 = true;
                  var2_int = TextureCombineOperation.field_a;
                  if (var2_int != 13 && (var2_int != 35 ||
                    var3 != 0)) {
                    if (var2_int == 34) {
                      return;
                    }
                    decompiledFrameRemainder0 = (var2_int != 56 ||
                      var3 != 0);
                    if (decompiledFrameRemainder0) {
                      switch (var2_int) {
                        case 12:
                          break regionExit4;
                        case 11:
                          break regionExit3;
                        case 10:
                          break regionExit2;
                        default:
                          return;
                        case 9:
                          if (var3 == 0) {
                            break regionExit1;
                          }
                          break;
                      }
                    }
                  }
                  if (decompiledFrameRemainder0) {
                    if (hw.field_b[81]) {
                      gg.a((byte) 125);
                    }
                    LegacyOpenGlSpriteTexture.field_w = true;
                    if (var3 == 0) {
                      return;
                    }
                  }
                  GridWidgetContainer.livesRemaining = GridWidgetContainer.livesRemaining + 1;
                  LegacyOpenGlSpriteTexture.field_w = true;
                  if (var3 == 0) {
                    return;
                  }
                }
                SpriteMask.drones[0].upgradeStat(-42, 2);
                LegacyOpenGlSpriteTexture.field_w = true;
                if (var3 == 0) {
                  return;
                }
              }
              SpriteMask.drones[0].upgradeStat(-34, 1);
              LegacyOpenGlSpriteTexture.field_w = true;
              if (var3 == 0) {
                return;
              }
            }
            SpriteMask.drones[0].upgradeStat(-32, 0);
            LegacyOpenGlSpriteTexture.field_w = true;
            if (var3 == 0) {
              return;
            }
          }
          o.a(0);
          gg.a((byte) 87);
          LegacyOpenGlSpriteTexture.field_w = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) var2), "qu.J(" + param0 + ')');
        }
    }

    public static void releaseStatics(byte param0) {
        try {
          legacyTurbulentWaterData = null;
          noiseGradients = (float[][]) null;
          if (param0 <= 33) {
            noiseGradients = (float[][]) null;
          }
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "qu.L(" + param0 + ')');
        }
    }

    final void startArcadeGame(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (param0 != -120) {
            this.renderSimpleArenaBorder(109, (GraphicsToolkit) null);
          }
          GameKeyHandler.field_a = null;
          ig.hudMessages.clear(116);
          FadingWidget.score = 0;
          LegacyOpenGlSpriteTexture.field_w = false;
          LoginPacketWriter.field_a = 0;
          GraphicsToolkit.field_f = 0;
          ts.field_a = 0;
          OpenGlTransparentWaterEffect.field_e = 0;
          TextureFormat.elapsedTicks = 0;
          SoftwareTransform3D.field_b = 0;
          IntrusiveNodeHashTable.field_c = 0;
          PasswordValidator.e(101);
          HardwareRidgedWaterNoise.resetArcadeGameplay(true);
          MessageDialog.arcadeMode = true;
          MusicPatch.simulationPaused = false;
          this.closePauseMenu((byte) 112);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) var2), "qu.G(" + param0 + ')');
        }
    }

    private final void renderAnimatedArenaBorder(int guard, GraphicsToolkit toolkit) {
        int stackIn_10_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_24_1 = 0;
        int stackIn_36_0 = 0;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        String stackIn_52_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var3_intLifetime1;
        int var3_intLifetime2;
        int var5Lifetime1;
        var6 = Sumoblitz.field_L ? 1 : 0;
        try {
          AccountServiceResult.field_f.drawRotated(26.0f, 26.0f, 4915, 0);
          OpenGlIndexBuffer.field_p[0].drawRotated(16.0f, 16.0f, 4096, -16384);
          OpenGlIndexBuffer.field_p[1].drawRotated(16.0f, 16.0f, 4096, -16384);
          AccountServiceResult.field_f.drawRotated(616.0f, 26.0f, 4915, 0);
          OpenGlIndexBuffer.field_p[0].drawRotated(624.0f, 16.0f, 4096, 32768);
          OpenGlIndexBuffer.field_p[1].drawRotated(624.0f, 16.0f, 4096, 32768);
          AccountServiceResult.field_f.drawRotated(26.0f, 454.0f, 4915, 0);
          OpenGlIndexBuffer.field_p[0].drawRotated(16.0f, 464.0f, 4096, 0);
          OpenGlIndexBuffer.field_p[1].drawRotated(16.0f, 464.0f, 4096, 0);
          AccountServiceResult.field_f.drawRotated(614.0f, 454.0f, 4915, 0);
          OpenGlIndexBuffer.field_p[0].drawRotated(624.0f, 464.0f, 4096, 16384);
          OpenGlIndexBuffer.field_p[1].drawRotated(624.0f, 464.0f, 4096, 16384);
          var3_int = 0;
          var4 = (lg.field_c >> 1) % ok.field_f.length;
          var5 = 32;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var5 >= 608))) {
            stackIn_24_0 = -256;
            stackIn_24_1 = ~(((var4 << 3) + (lg.field_c << 2)) % 512);
            if (var6 == 0) {
              if (stackIn_24_0 <= stackIn_24_1) {
                stackIn_10_0 = ((var4 << 3) + (lg.field_c << 2)) % 512;
              } else {
                stackIn_10_0 = 512 - ((var4 << 3) + (lg.field_c << 2)) % 512;
              }
              var3_intLifetime1 = stackIn_10_0;
              if (var3_intLifetime1 > 240) {
                var3_intLifetime1 = 240;
              }
              if (var3_intLifetime1 < 20) {
                var3_intLifetime1 = 20;
              }
              ok.field_f[0].drawRotated((float)(var5 + 16), 25.0f, 4096, 0, 3, var3_intLifetime1 << 24, 1);
              var4++;
              ok.field_f[0].drawRotated((float)(var5 + 16), 454.0f, 4096, 0, 3, var3_intLifetime1 << 24, 1);
              if (~ok.field_f.length == ~var4) {
                var4 = 0;
              }
              var5 = var5 + ok.field_f[0].width();
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_24_0 = guard;
            stackIn_24_1 = -76;
          }
          if (stackIn_24_0 >= stackIn_24_1) {
            GameplaySession.renderLitMeshFaces(84, (CompactMeshGeometry) null, -85, 57, -45, 101, (byte) 84, -26);
          }
          var5Lifetime1 = 48;
          while (var5Lifetime1 < 448) {
            if (var6 != 0) {
              return;
            }
            if (255 < ((var4 << 3) + (lg.field_c << 2)) % 512) {
              stackIn_36_0 = -(((var4 << 3) + (lg.field_c << 2)) % 512) + 512;
            } else {
              stackIn_36_0 = ((lg.field_c << 2) + (var4 << 3)) % 512;
            }
            var3_intLifetime2 = stackIn_36_0;
            if (240 < var3_intLifetime2) {
              var3_intLifetime2 = 240;
            }
            if (var3_intLifetime2 < 20) {
              var3_intLifetime2 = 20;
            }
            ok.field_f[0].drawRotated(25.0f, (float)var5Lifetime1, 4096, 16384, 3, var3_intLifetime2 << 24, 1);
            var4++;
            ok.field_f[0].drawRotated(614.0f, (float)var5Lifetime1, 4096, 16384, 3, var3_intLifetime2 << 24, 1);
            if (ok.field_f.length == var4) {
              var4 = 0;
            }
            var5Lifetime1 = var5Lifetime1 + ok.field_f[0].width();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_51_0 = var3;
          stackIn_51_1 = new StringBuilder().append("qu.N(").append(guard).append(',');
          if (toolkit == null) {
            stackIn_52_2 = "null";
          } else {
            stackIn_52_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_51_0), ((StringBuilder) (Object) stackIn_51_1).append(stackIn_52_2).append(')').toString());
        }
    }

    final void update(boolean processInput, byte guard) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        boolean stackIn_31_0 = false;
        boolean stackIn_151_0 = false;
        int stackIn_158_0 = 0;
        int stackIn_233_0 = 0;
        Object stackIn_336_0 = null;
        Drone stackIn_336_1 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_150_0;
        TimedSceneEffect var3 = null;
        Drone var3_ref = null;
        HudMessage var3_ref2 = null;
        RuntimeException var3_ref3 = null;
        int var4_int = 0;
        Drone var4 = null;
        int var5 = 0;
        int var6 = 0;
        Drone var4Lifetime1;
        int var4_intLifetime1;
        int var5Lifetime1;
        var6 = Sumoblitz.field_L ? 1 : 0;
        try {
          boolean decompiledFrameCompleted3 = true;
          if (processInput) {
            while (EmailCredentials.c(-112)) {
              this.handleGameKey((byte) -122);
              if (var6 != 0) {
                decompiledFrameCompleted3 = false;
                break;
              }
            }
          }
          if (decompiledFrameCompleted3) {
            if (ul.field_f == 0) {
              this.spawnSceneryAndChooseDrift(2500);
            }
            this.backdropY = this.backdropY + this.backdropVelocityY;
            this.backdropX = this.backdropX + this.backdropVelocityX;
          }
          if (null != FallbackShaderEffect.sceneryParticles &&
            ul.field_f == 0) {
            this.updateSceneryParticles((byte) 55);
          }
          boolean decompiledFrameCompleted2 = true;
          if (null != OpenGlCubeTexture.sceneEffects) {
            var3 = (TimedSceneEffect) (OpenGlCubeTexture.sceneEffects.first(95));
            while (null != var3) {
              stackIn_31_0 = var3.updateAndIsExpired(-2567);
              if (var6 != 0) {
                decompiledFrameCompleted2 = false;
                break;
              }
              if (stackIn_31_0) {
                var3.unlink(false);
              }
              var3 = (TimedSceneEffect) (OpenGlCubeTexture.sceneEffects.next((byte) 18));
            }
          }
          if (decompiledFrameCompleted2) {
            stackIn_31_0 = po.pauseMenuOpen;
          }
          if (stackIn_31_0) {
            return;
          }
          if (DropDownWidget.field_N.a(false)) {
            DropDownWidget.field_N.c(5008);
            return;
          }
          if (cd.a(false)) {
            return;
          }
          if (guard >= -65) {
            this.renderSimpleArenaBorder(-55, (GraphicsToolkit) null);
          }
          if (TextureFormat.elapsedTicks - uc.field_f == 100 &&
            !MusicPatch.simulationPaused &&
            !MessageDialog.arcadeMode) {
            sj.a(-1, AccountServiceResult.waveIndex, OpenGlShaderProgram.levelIndex);
          }
          boolean decompiledFrameRemainder2 = true;
          if (GridWidgetContainer.livesRemaining > 0) {
            ts.field_a = ts.field_a + 8;
            GraphicsToolkit.field_f = GraphicsToolkit.field_f + 10;
            LoginPacketWriter.field_a = LoginPacketWriter.field_a - 5;
            SoftwareTransform3D.field_b = SoftwareTransform3D.field_b - 3;
            TextureFormat.elapsedTicks = TextureFormat.elapsedTicks + 1;
            if (BufferedCacheFile.a((byte) -84, 10) >= 5) {
              if (5 <= BufferedCacheFile.a((byte) -84, 10)) {
                SoftwareTransform3D.field_b = SoftwareTransform3D.field_b + 1;
                decompiledFrameRemainder2 = (var6 != 0);
              }
              if (decompiledFrameRemainder2) {
                ts.field_a = ts.field_a + 1;
                if (var6 != 0) {
                  if (BufferedCacheFile.a((byte) -84, 10) >= 5) {
                    LoginPacketWriter.field_a = LoginPacketWriter.field_a - 1;
                    GraphicsToolkit.field_f = GraphicsToolkit.field_f - 1;
                  } else {
                    GraphicsToolkit.field_f = GraphicsToolkit.field_f - 1;
                  }
                }
              }
            } else {
              if (BufferedCacheFile.a((byte) -84, 10) >= 5) {
                LoginPacketWriter.field_a = LoginPacketWriter.field_a - 1;
                if (var6 != 0) {
                  GraphicsToolkit.field_f = GraphicsToolkit.field_f - 1;
                }
              } else {
                GraphicsToolkit.field_f = GraphicsToolkit.field_f - 1;
              }
            }
          }
          MusicPatch.c((byte) 77);
          if (TextureFormat.elapsedTicks != uc.field_f &&
            (TextureFormat.elapsedTicks - uc.field_f) % 50 == 0 &&
            !DroneDebris.field_C) {
            DroneDebris.field_C = ig.b(114);
          }
          if (MusicPatch.simulationPaused) {
            return;
          }
          qv.a(2);
          if (QuickChatPhraseProvider.arenaPads != null) {
            this.updateArenaPads((byte) 111);
          }
          this.compatibilityTickHook(-112);
          boolean decompiledSharedTail1 = !(MessageDialog.field_ab <= 0);
          if (!decompiledSharedTail1) {
            PowerupPickup.field_v = 0;
            decompiledSharedTail1 = (var6 != 0);
          }
          if (decompiledSharedTail1) {
            MessageDialog.field_ab = MessageDialog.field_ab - 1;
            if (PowerupPickup.field_v >= ps.field_e[11]) {
              UnderageAccountInfoPanel.b(24753, 244, 11);
            }
          }
          if (SpriteMask.drones[0] != null && (!(6 > OpenGlShaderProgram.levelIndex) ||
            TextureMetadata.field_f[6] ||
            MessageDialog.arcadeMode)) {
            boolean decompiledFrameRemainder1 = true;
            if (fa.field_b > 0 &&
              30 >= fa.field_b) {
              fa.field_b = fa.field_b - 1;
              decompiledFrameRemainder1 = (var6 != 0);
            }
            if (decompiledFrameRemainder1) {
              var3_ref = SpriteMask.drones[0];
              if (fa.field_b <= 0 &&
                !var3_ref.isBlastActive(126)) {
                if (wn.a(targetMarkerYQ8, var3_ref.radiusQ8, -105, var3_ref.xQ8, OpenGlBuffer.targetMarkerXQ8, var3_ref.yQ8)) {
                  SecondaryNodeQueue.a(var3_ref, (byte) 113);
                  if (ul.field_f == 0) {
                    OpenGlCubeTexture.sceneEffects.addLast((IntrusiveNode) (new ExpandingRingEffect(OpenGlBuffer.targetMarkerXQ8, targetMarkerYQ8, -1)), (byte) 39);
                  }
                  gn.a(30, true);
                }
                fa.field_b = 250;
              }
              targetMarkerYQ8 = var3_ref.yQ8;
              OpenGlBuffer.targetMarkerXQ8 = var3_ref.xQ8;
              fa.field_b = fa.field_b - 1;
            }
            if (fa.field_b == 30 &&
              0 == ul.field_f) {
              OpenGlCubeTexture.sceneEffects.addLast((IntrusiveNode) (new ShrinkingRingEffect(OpenGlBuffer.targetMarkerXQ8, targetMarkerYQ8, -1)), (byte) 39);
            }
            if (30 == fa.field_b) {
              gn.a(32, true);
            }
            if (fa.field_b == 30) {
              Js5Client.a(10, targetMarkerYQ8, OpenGlCubeTexture.sceneEffects, 61, OpenGlBuffer.targetMarkerXQ8, 16711680);
            }
          }
          var3_ref2 = (HudMessage) (ig.hudMessages.first(111));
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (null == var3_ref2))) {
            stackOut_150_0 = var3_ref2.updateAndIsExpired(80);
            stackIn_158_0 = stackOut_150_0 ? 1 : 0;
            stackIn_151_0 = stackOut_150_0;
            if (var6 == 0) {
              if (stackIn_151_0) {
                var3_ref2.unlink(false);
              }
              var3_ref2 = (HudMessage) (ig.hudMessages.next((byte) 18));
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_158_0 = ~AccountServiceResult.waveIndex;
          }
          if (stackIn_158_0 != -1) {
            boolean decompiledSharedTail0 = (-LimitedRandomAccessFile.field_b + TextureFormat.elapsedTicks != 5);
            if (!decompiledSharedTail0) {
              rn.a(TurbulenceNoise3D.warningText, 320, 240, 16755456, 28807);
              decompiledSharedTail0 = (var6 != 0);
            }
            if ((decompiledSharedTail0) &&
              (10 == -LimitedRandomAccessFile.field_b + TextureFormat.elapsedTicks)) {
              rn.a(TurbulenceNoise3D.warningText, 320, 255, 16776960, 28807);
            }
          }
          boolean decompiledFrameCompleted1 = true;
          boolean decompiledFrameCompleted0 = true;
          if (ok.field_b) {
            var4_int = 4;
            var5 = 0;
            while (var5 < db.droneSlotLimit) {
              stackIn_336_0 = null;
              stackIn_336_1 = SpriteMask.drones[var5];
              if (var6 != 0) {
                decompiledFrameCompleted1 = false;
                break;
              }
              if (stackIn_336_0 != stackIn_336_1) {
                var4_int--;
              }
              var5++;
            }
            if (decompiledFrameCompleted1) {
              while (true) {
                incrementValue$0 = var4_int;
                var4_int--;
                if (incrementValue$0 <= 0) {
                  break;
                }
                HardwareUnlitEffect.a(uj.createEnemyDrone(Math.max(7, ExpandingRingEffect.nextRandomInt((int)(Math.log((double)FadingWidget.score) / Math.log(10.0)), ResourceArchive.field_b, (byte) -96)), ExpandingRingEffect.nextRandomInt(588, ResourceArchive.field_b, (byte) -96) + 26 << 8, 0, (byte) 84, 26 + ExpandingRingEffect.nextRandomInt(428, ResourceArchive.field_b, (byte) -96) << 8), false);
                if (var6 != 0) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
              }
            }
          }
          if ((decompiledFrameCompleted1) &&
            (decompiledFrameCompleted0)) {
            OpenGlTransparentWaterEffect.d(22403);
          }
          if (decompiledFrameCompleted1) {
            if (processInput &&
              null != SpriteMask.drones[0]) {
              DelayedInboundPacket.updatePlayerControls(20);
            }
            if (kp.field_a) {
              km.updateEnemySteering((byte) 32);
            }
            boolean decompiledFrameRemainder0 = true;
            er.c((byte) 54);
            if ((MessageDialog.arcadeMode) &&
              (decompiledFrameRemainder0 = (0 == TextureFormat.elapsedTicks % 250)) &&
              (decompiledFrameRemainder0 = !(AgeValidator.countEnemyDrones(true) >= (SpriteMask.drones.length - 1)))) {
              var4 = uj.createEnemyDrone(1, ExpandingRingEffect.nextRandomInt(588, ResourceArchive.field_b, (byte) -96) + 26 << 8, 4, (byte) 84, 26 + ExpandingRingEffect.nextRandomInt(428, ResourceArchive.field_b, (byte) -96) << 8);
              HardwareUnlitEffect.a(var4, false);
              decompiledFrameRemainder0 = (var6 != 0);
            }
            if (decompiledFrameRemainder0) {
              if (SpriteMask.drones[0] != null &&
                Bzip2State.field_J.length > AccountServiceResult.waveIndex &&
                AccountServiceResult.waveIndex != -1) {
                var4_intLifetime1 = Bzip2State.field_J[AccountServiceResult.waveIndex].countDrones(0) + 3 >> 2;
                var5Lifetime1 = 0;
                while (true) {
                  if (db.droneSlotLimit > var5Lifetime1) {
                    stackIn_233_0 = var5Lifetime1;
                    if (var6 == 0) {
                      if (stackIn_233_0 != 0 &&
                        SpriteMask.drones[var5Lifetime1] != null) {
                        incrementValue$1 = var4_intLifetime1;
                        var4_intLifetime1--;
                        if (0 >= incrementValue$1) {
                          break;
                        }
                      }
                      var5Lifetime1++;
                      continue;
                    }
                  } else {
                    stackIn_233_0 = AccountServiceResult.waveIndex;
                  }
                  if (stackIn_233_0 == -1) {
                    break;
                  }
                  if (!DroneDebris.field_C) {
                    break;
                  }
                  if (~AccountServiceResult.waveIndex != ~(-1 + Bzip2State.field_J.length)) {
                    LimitedRandomAccessFile.field_b = TextureFormat.elapsedTicks;
                    rn.a(TurbulenceNoise3D.warningText, 320, 225, 16711680, 28807);
                  }
                  AccountServiceResult.waveIndex = AccountServiceResult.waveIndex + 1;
                  gn.a(14, true);
                  ke.a(false);
                  break;
                }
              }
              if (null != Bzip2State.field_J &&
                Bzip2State.field_J.length <= AccountServiceResult.waveIndex &&
                jl.a(-62) &&
                AgeValidator.countEnemyDrones(true) == 0) {
                o.a(0);
                if (MusicPatchEnvelope.a(8230, 10)) {
                  UnderageAccountInfoPanel.b(24753, 239, 16);
                  if (sl.a((byte) 90, 10)) {
                    UnderageAccountInfoPanel.b(24753, 238, 17);
                  }
                }
                if (MusicPatchEnvelope.a(8230, 25)) {
                  UnderageAccountInfoPanel.b(24753, 237, 18);
                  if (sl.a((byte) 90, 25)) {
                    UnderageAccountInfoPanel.b(24753, 236, 19);
                  }
                  if (ByteArrayStorage.a(25, 115)) {
                    UnderageAccountInfoPanel.b(24753, 234, 21);
                  }
                }
                if (MatchingTextValidator.field_i == 10 &&
                  !RotarySelectorWidget.field_E) {
                  UnderageAccountInfoPanel.b(24753, 251, 4);
                }
                if (MatchingTextValidator.field_i == 5 &&
                  !SecondaryNodeDeque.field_e) {
                  UnderageAccountInfoPanel.b(24753, 250, 5);
                }
                if (MatchingTextValidator.field_i == 5 &&
                  !DroneChargeParticle.field_w) {
                  UnderageAccountInfoPanel.b(24753, 249, 6);
                }
                if (MatchingTextValidator.field_i == 5 &&
                  !LegacyOpenGlNormalMapGenerator.field_c) {
                  UnderageAccountInfoPanel.b(24753, 248, 7);
                }
                if (SoundCache.isLevelIndexTwentyFour(-102)) {
                  OpenGlShaderProgram.levelIndex = OpenGlShaderProgram.levelIndex + 1;
                }
                if (Bzip2State.field_J != null &&
                  Bzip2State.field_J.length <= AccountServiceResult.waveIndex &&
                  !jl.a(-36) &&
                  AgeValidator.countEnemyDrones(true) == 0) {
                  if (Bzip2State.a((byte) -94) > ps.field_e[20]) {
                    UnderageAccountInfoPanel.b(24753, 235, 20);
                  }
                  if (DropDownWidget.field_C == 0) {
                    UnderageAccountInfoPanel.b(24753, 252, 3);
                  }
                  if (OpenGlShaderProgram.levelIndex == 25) {
                    if (ResourceArchive.field_f == 10) {
                      UnderageAccountInfoPanel.b(24753, 255, 0);
                    }
                    if (LegacyOpenGlEffectManager.field_i == 10) {
                      UnderageAccountInfoPanel.b(24753, 254, 1);
                    }
                    if (hc.field_f == 10) {
                      UnderageAccountInfoPanel.b(24753, 253, 2);
                    }
                  }
                  OpenGlBuffer.a(35040, new PlayerDrone(81920, 61440));
                  StrongCacheReference.switchMenuScreen(-7753, true, 12);
                  TextLayout.a(0, 6);
                  return;
                }
              }
            }
            stackIn_336_0 = null;
            stackIn_336_1 = SpriteMask.drones[0];
          }
          if (stackIn_336_0 == stackIn_336_1 &&
            GridWidgetContainer.livesRemaining > 0) {
            GridWidgetContainer.livesRemaining = GridWidgetContainer.livesRemaining - 1;
            if (GridWidgetContainer.livesRemaining <= 0) {
              jk.field_a = TextureFormat.elapsedTicks;
              uq.a(7, 8);
              StrongCacheReference.switchMenuScreen(-7753, true, 11);
              if (var6 != 0) {
                if (!MessageDialog.arcadeMode) {
                  LoginCredentialFactory.initializePlayerFromUpgradeSettings(107);
                  WidgetStateStyle.initializePlayerDrone(72);
                } else {
                  WidgetStateStyle.initializePlayerDrone(72);
                }
              }
            } else {
              if (!MessageDialog.arcadeMode) {
                LoginCredentialFactory.initializePlayerFromUpgradeSettings(107);
                if (var6 != 0) {
                  WidgetStateStyle.initializePlayerDrone(72);
                }
              } else {
                WidgetStateStyle.initializePlayerDrone(72);
              }
            }
            DisplayModeConfirmationDialog.droneTypeStreakMask = 0;
            bi.uniqueDroneTypeStreak = 0;
          }
          if (null != SpriteMask.drones[0]) {
            var4Lifetime1 = SpriteMask.drones[0];
            if (var4Lifetime1.isBlastChargeParticleTick(-2)) {
              this.showHudMessage(231, 6356832, pu.blastReadyText);
            }
            if (var4Lifetime1.isBlastWarningTick((byte) -59) &&
              this.showBlastHint) {
              EmailCredentials.a((byte) 99, 17);
              this.showBlastHint = false;
            }
          }
          if (null != bj.powerupPickups) {
            this.updatePowerupPickups(-14854);
          }
          GameOverScreen.a(true);
          if (MessageDialog.arcadeMode &&
            SpriteMask.drones[0] != null) {
            if (300 <= TextureFormat.elapsedTicks * 20 / 1000) {
              UnderageAccountInfoPanel.b(24753, 231, 24);
            }
            if (180 <= 20 * TextureFormat.elapsedTicks / 1000) {
              UnderageAccountInfoPanel.b(24753, 232, 23);
            }
            if (20 * TextureFormat.elapsedTicks / 1000 >= 60) {
              UnderageAccountInfoPanel.b(24753, 233, 22);
            }
            if (RenderPresentationException.a(false)) {
              if (TextureFormat.elapsedTicks * 20 / 1000 >= 300) {
                UnderageAccountInfoPanel.b(24753, 228, 27);
              }
              if (TextureFormat.elapsedTicks * 20 / 1000 >= 180) {
                UnderageAccountInfoPanel.b(24753, 229, 26);
              }
              if (60 <= TextureFormat.elapsedTicks * 20 / 1000) {
                UnderageAccountInfoPanel.b(24753, 230, 25);
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref3 = decompiledCaughtException;
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) var3_ref3), "qu.C(" + processInput + ',' + guard + ')');
        }
    }

    private final void showHudMessage(int guard, int color, String text) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          ig.hudMessages.addLast((IntrusiveNode) (new HudMessage(text, color)), (byte) 39);
          if (guard != 231) {
            this.spawnSceneryAndChooseDrift(-6);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("qu.A(").append(guard).append(',').append(color).append(',');
          if (text == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    private final void spawnSceneryAndChooseDrift(int param0) {
        SceneryParticle stackIn_28_0;
        SceneryParticle stackIn_28_1;
        int stackIn_28_2;
        int stackIn_28_3;
        int stackIn_28_4;
        int stackIn_28_5;
        int stackIn_28_6;
        SceneryParticle stackIn_29_0;
        SceneryParticle stackIn_29_1;
        int stackIn_29_7;
        SceneryParticle stackIn_51_0;
        SceneryParticle stackIn_51_1;
        int stackIn_51_2;
        int stackIn_51_3;
        int stackIn_51_4;
        int stackIn_51_5;
        int stackIn_51_6;
        SceneryParticle stackIn_52_0;
        SceneryParticle stackIn_52_1;
        int stackIn_52_7;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        double var5 = 0.0;
        int var7 = 0;
        int var8 = 0;
        SceneryParticle var9 = null;
        int var10 = 0;
        SceneryParticle var9Lifetime1;
        int var2_intLifetime1;
        int var2_intLifetime2;
        int var3Lifetime1;
        int var3Lifetime2;
        int var4Lifetime1;
        double var5Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        var10 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (lg.field_c % param0 == 0 ||
            this.field_h == this.backdropX &&
            this.field_m == this.backdropY) {
            var2_int = ExpandingRingEffect.nextRandomInt(640 + OpenGlEnvironmentWaterEffect.field_i.width(), ResourceArchive.field_b, (byte) -96) - OpenGlEnvironmentWaterEffect.field_i.width();
            var3 = ExpandingRingEffect.nextRandomInt(480 + OpenGlEnvironmentWaterEffect.field_i.height(), ResourceArchive.field_b, (byte) -96) - OpenGlEnvironmentWaterEffect.field_i.height();
            this.backdropVelocityY = (-this.backdropY + (double)var3) / 2500.0;
            this.backdropVelocityX = (-this.backdropX + (double)var2_int) / 2500.0;
          }
          if (lg.field_c % 100 == 0 &&
            FallbackShaderEffect.sceneryParticles != null) {
            var2_intLifetime1 = 0;
            var3Lifetime1 = 0;
            if (0 == ExpandingRingEffect.nextRandomInt(2, ResourceArchive.field_b, (byte) -96)) {
              var2_intLifetime1 = ExpandingRingEffect.nextRandomInt(163840, ResourceArchive.field_b, (byte) -96);
              if (var10 != 0) {
                var3Lifetime1 = ExpandingRingEffect.nextRandomInt(163840, ResourceArchive.field_b, (byte) -96);
              }
            } else {
              var3Lifetime1 = ExpandingRingEffect.nextRandomInt(163840, ResourceArchive.field_b, (byte) -96);
            }
            var4 = ExpandingRingEffect.nextRandomInt(65536, ResourceArchive.field_b, (byte) -96);
            var5 = Math.random() / 500.0;
            var7 = 1 + ExpandingRingEffect.nextRandomInt(256, ResourceArchive.field_b, (byte) -96);
            var8 = 1 + ExpandingRingEffect.nextRandomInt(256, ResourceArchive.field_b, (byte) -96);
            if (ExpandingRingEffect.nextRandomInt(2, ResourceArchive.field_b, (byte) -96) == 0) {
              if (var2_intLifetime1 > 0) {
                var8 = var8 * -1;
                var3Lifetime1 = 122880;
                if (var10 != 0 &&
                  0 < var3Lifetime1) {
                  var2_intLifetime1 = 163840;
                  var7 = var7 * -1;
                }
              } else {
                if (0 < var3Lifetime1) {
                  var2_intLifetime1 = 163840;
                  var7 = var7 * -1;
                }
              }
            }
            stackIn_28_0 = null;
            stackIn_28_1 = null;
            stackIn_28_2 = 5000;
            stackIn_28_3 = var2_intLifetime1;
            stackIn_28_4 = var3Lifetime1;
            stackIn_28_5 = 16777215;
            stackIn_28_6 = 1;
            if (OpenGlShaderProgram.levelIndex > -1) {
              stackIn_29_0 = null;
              stackIn_29_1 = null;
              stackIn_29_7 = OpenGlShaderProgram.levelIndex % 3;
            } else {
              stackIn_29_0 = null;
              stackIn_29_1 = null;
              stackIn_29_7 = 0;
            }
            var9 = new SceneryParticle(stackIn_28_2, stackIn_28_3, stackIn_28_4, stackIn_28_5, stackIn_28_6, stackIn_29_7, (double)var4, var5, var7, var8);
            FallbackShaderEffect.sceneryParticles.addLast((IntrusiveNode) (var9), (byte) 39);
          }
          if (lg.field_c % 200 == 0 &&
            FallbackShaderEffect.sceneryParticles != null) {
            var2_intLifetime2 = 0;
            var3Lifetime2 = 0;
            if (0 != ExpandingRingEffect.nextRandomInt(2, ResourceArchive.field_b, (byte) -96)) {
              var3Lifetime2 = ExpandingRingEffect.nextRandomInt(163840, ResourceArchive.field_b, (byte) -96);
              if (var10 != 0) {
                var2_intLifetime2 = ExpandingRingEffect.nextRandomInt(163840, ResourceArchive.field_b, (byte) -96);
              }
            } else {
              var2_intLifetime2 = ExpandingRingEffect.nextRandomInt(163840, ResourceArchive.field_b, (byte) -96);
            }
            var4Lifetime1 = ExpandingRingEffect.nextRandomInt(65536, ResourceArchive.field_b, (byte) -96);
            var5Lifetime1 = Math.random() / 1000.0;
            var7Lifetime1 = ExpandingRingEffect.nextRandomInt(64, ResourceArchive.field_b, (byte) -96) + 1;
            var8Lifetime1 = 1 + ExpandingRingEffect.nextRandomInt(64, ResourceArchive.field_b, (byte) -96);
            if (ExpandingRingEffect.nextRandomInt(2, ResourceArchive.field_b, (byte) -96) == 0) {
              if (0 < var2_intLifetime2) {
                var3Lifetime2 = 122880;
                var8Lifetime1 = var8Lifetime1 * -1;
                if (var10 != 0 &&
                  var3Lifetime2 > 0) {
                  var7Lifetime1 = var7Lifetime1 * -1;
                  var2_intLifetime2 = 163840;
                }
              } else {
                if (var3Lifetime2 > 0) {
                  var7Lifetime1 = var7Lifetime1 * -1;
                  var2_intLifetime2 = 163840;
                }
              }
            }
            stackIn_51_0 = null;
            stackIn_51_1 = null;
            stackIn_51_2 = 5000;
            stackIn_51_3 = var2_intLifetime2;
            stackIn_51_4 = var3Lifetime2;
            stackIn_51_5 = 16777215;
            stackIn_51_6 = 0;
            if (OpenGlShaderProgram.levelIndex > -1) {
              stackIn_52_0 = null;
              stackIn_52_1 = null;
              stackIn_52_7 = OpenGlShaderProgram.levelIndex % 3;
            } else {
              stackIn_52_0 = null;
              stackIn_52_1 = null;
              stackIn_52_7 = 0;
            }
            var9Lifetime1 = new SceneryParticle(stackIn_51_2, stackIn_51_3, stackIn_51_4, stackIn_51_5, stackIn_51_6, stackIn_52_7, (double)var4Lifetime1, var5Lifetime1, var7Lifetime1, var8Lifetime1);
            FallbackShaderEffect.sceneryParticles.addLast((IntrusiveNode) (var9Lifetime1), (byte) 39);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) var2), "qu.R(" + param0 + ')');
        }
    }

    final void submitSessionStatistics(int param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = 54 / ((-65 - param0) / 47);
          if (null == GameKeyHandler.field_a &&
            0 < IntrusiveNodeHashTable.field_c &&
            !LegacyOpenGlSpriteTexture.field_w) {
            boolean decompiledSharedTail0 = !(!MessageDialog.arcadeMode);
            if (!decompiledSharedTail0) {
              GameKeyHandler.field_a = new id(0, 65535, GraphicsToolkit.field_f, LoginPacketWriter.field_a, ts.field_a, SoftwareTransform3D.field_b, new int[]{IntrusiveNodeHashTable.field_c, TextureFormat.elapsedTicks});
              decompiledSharedTail0 = (Sumoblitz.field_L);
            }
            if (decompiledSharedTail0) {
              GameKeyHandler.field_a = new id(1, 65534, GraphicsToolkit.field_f, LoginPacketWriter.field_a, ts.field_a, SoftwareTransform3D.field_b, new int[]{IntrusiveNodeHashTable.field_c, TextureFormat.elapsedTicks});
            }
            if (!vs.b((byte) 9)) {
              kp.a(3, GameKeyHandler.field_a, 79);
            }
            GameKeyHandler.field_a = null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "qu.D(" + param0 + ')');
        }
    }

    private final void compatibilityTickHook(int param0) {
        try {
          if (MusicPatch.simulationPaused) {
          }
          int var2_int = 31 / ((-57 - param0) / 49);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "qu.Q(" + param0 + ')');
        }
    }

    private final void renderHud(byte guard, GraphicsToolkit toolkit) {
        int stackIn_40_0 = 0;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        String stackIn_57_2 = null;
        RuntimeException decompiledCaughtException = null;
        ToolkitRasterStateStack var3 = null;
        RuntimeException var3_ref = null;
        PlayerDrone var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var5Lifetime1;
        var7 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (guard > -75) {
            return;
          }
          var3 = wq.rasterStateForToolkit(toolkit, (byte) 36);
          if ((0 != GridWidgetContainer.livesRemaining ||
            MusicPatch.simulationPaused) && !MusicPatch.simulationPaused) {
            var4 = (PlayerDrone) (SpriteMask.drones[0]);
            if (!MessageDialog.arcadeMode &&
              Bzip2State.field_J != null) {
              HudMessage.field_s[0].draw(55, 0);
              HudMessage.field_s[1].draw(HudMessage.field_s[0].width() + 55, 0);
              var5 = 55 + HudMessage.field_s[1].width() * 2;
              while (true) {
                if (var5 < 530) {
                  HudMessage.field_s[2].draw(var5, 0);
                  var5 = var5 + HudMessage.field_s[1].width();
                  if (var7 == 0) {
                    continue;
                  }
                } else {
                  HudMessage.field_s[3].draw(-HudMessage.field_s[4].width() + 567, 0);
                  HudMessage.field_s[4].draw(567, 0);
                  qv.field_k.a(19, 85, -11753985, ps.scoreText + "" + FadingWidget.score, (byte) -21, -1);
                  uq.field_a.a(19, 85, -4720129, "<col=ffffff>" + ps.scoreText + "</col>" + FadingWidget.score, (byte) -18, -1);
                  qv.field_k.a(-1, 560, pl.levelText + "" + (OpenGlShaderProgram.levelIndex + 1) + " " + OpenGlVertexLayout.multiplierText + "" + pd.scoreMultiplier + "x " + InwardSparkParticle.livesText + "" + GridWidgetContainer.livesRemaining + "", 19, -11753985, 74);
                }
                break;
              }
              uq.field_a.a(-1, 560, "<col=ffffff> " + pl.levelText + "</col>" + (1 + OpenGlShaderProgram.levelIndex) + "<col=ffffff> " + OpenGlVertexLayout.multiplierText + "</col>" + pd.scoreMultiplier + "x" + "<col=ffffff> " + InwardSparkParticle.livesText + "</col>" + GridWidgetContainer.livesRemaining + "", 19, -4720129, 120);
            }
            SpriteState.field_B[0].draw(139, 448);
            SpriteState.field_B[1].draw(-16 + HudMessage.field_s[0].width() + 155, 448);
            var5Lifetime1 = 145 + 2 * HudMessage.field_s[1].width();
            while (true) {
              if (var5Lifetime1 < 408) {
                SpriteState.field_B[2].draw(-6 + var5Lifetime1, 448);
                var5Lifetime1 = var5Lifetime1 + HudMessage.field_s[1].width();
                if (var7 == 0) {
                  continue;
                }
              } else {
                SpriteState.field_B[3].draw(-HudMessage.field_s[4].width() + 475 - 16, 448);
                SpriteState.field_B[4].draw(459, 448);
                qv.field_k.a(473, 320, -11753985, InstrumentNoteMask.timeText + dp.b(TextureFormat.elapsedTicks, -23620) + "", (byte) -73, -1);
                uq.field_a.a(473, 320, -4720129, "<col=ffffff>" + InstrumentNoteMask.timeText + "</col>" + dp.b(TextureFormat.elapsedTicks, -23620) + "</col>", (byte) -76, -1);
              }
              if (MessageDialog.arcadeMode) {
                qv.field_k.a(473, 175, -11753985, ps.scoreText + "" + FadingWidget.score, (byte) -125, -1);
                uq.field_a.a(473, 175, -4720129, "<col=ffffff>" + ps.scoreText + "</col>" + FadingWidget.score, (byte) -112, -1);
              }
              LegacyOpenGlTexture1D.field_k[0].draw(3, 42);
              var3.pushClip((byte) 75, 395 - var4.blastChargeGaugeWidth((byte) -106) + 42, 42 + LegacyOpenGlTexture1D.field_k[0].height(), 0, 40);
              LegacyOpenGlTexture1D.field_k[1].draw(3, 42);
              var3.pop(29709);
              if (var4.isBlastReady(20)) {
                var5Lifetime1 = lg.field_c << 2;
                if (255 >= var5Lifetime1 % 510) {
                  stackIn_40_0 = var5Lifetime1 % 255;
                } else {
                  stackIn_40_0 = -(var5Lifetime1 % 255) + 510;
                }
                var6 = stackIn_40_0;
                LegacyOpenGlTexture1D.field_k[2].draw(3, 42, 0, 16777215 | var6 << 24, 1);
              }
              if (MessageDialog.arcadeMode) {
                break;
              }
              if (var4 == null) {
                break;
              }
              MusicCrossfadeStream.field_q[0].drawRotated(190.0f, 468.0f, 1600, 0, 1, 0, 2);
              qv.field_k.a(473, 202, -11753985, Integer.toString(var4.speedLevel), (byte) -10, -1);
              uq.field_a.a(473, 202, -1, Integer.toString(var4.speedLevel), (byte) -30, -1);
              MusicCrossfadeStream.field_q[1].drawRotated(240.0f, 468.0f, 1600, 0, 1, 0, 2);
              qv.field_k.a(473, 252, -11753985, Integer.toString(var4.tractionLevel), (byte) -30, -1);
              uq.field_a.a(473, 252, -1, Integer.toString(var4.tractionLevel), (byte) -30, -1);
              MusicCrossfadeStream.field_q[2].drawRotated(290.0f, 468.0f, 1600, 0, 1, 0, 2);
              qv.field_k.a(473, 302, -11753985, Integer.toString(var4.bounceLevel), (byte) -34, -1);
              uq.field_a.a(473, 302, -1, Integer.toString(var4.bounceLevel), (byte) -24, -1);
              break;
            }
          }
          if (DropDownWidget.field_N.a(false)) {
            DropDownWidget.field_N.a(true, toolkit);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_56_0 = var3_ref;
          stackIn_56_1 = new StringBuilder().append("qu.M(").append(guard).append(',');
          if (toolkit == null) {
            stackIn_57_2 = "null";
          } else {
            stackIn_57_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_56_0), ((StringBuilder) (Object) stackIn_56_1).append(stackIn_57_2).append(')').toString());
        }
    }

    final void resetSession(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          ig.hudMessages.clear(117);
          AccountServiceResult.waveIndex = -1;
          MusicPatch.simulationPaused = true;
          SpriteMask.drones = new Drone[100];
          if (param0 < 53) {
            GameplaySession.renderLitMeshFaces(-125, (CompactMeshGeometry) null, -52, -77, 38, -62, (byte) 105, 54);
          }
          kp.field_a = true;
          ke.a(false);
          this.closePauseMenu((byte) 112);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) var2), "qu.K(" + param0 + ')');
        }
    }

    final void startLevel(int levelIndex, boolean unused, boolean arcadeMode) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          GameKeyHandler.field_a = null;
          ig.hudMessages.clear(119);
          OpenGlTransparentWaterEffect.field_e = 0;
          FadingWidget.score = 0;
          SoftwareTransform3D.field_b = 0;
          DropDownWidget.field_C = levelIndex;
          LegacyOpenGlSpriteTexture.field_w = false;
          IntrusiveNodeHashTable.field_c = 0;
          OpenGlShaderProgram.levelIndex = levelIndex;
          GraphicsToolkit.field_f = 0;
          ts.field_a = 0;
          TextureFormat.elapsedTicks = 0;
          LoginPacketWriter.field_a = 0;
          PasswordValidator.e(104);
          if (OpenGlShaderProgram.levelIndex == 0 &&
            !TextureMetadata.field_f[0]) {
            bw.field_d = true;
            this.showBlastHint = true;
          }
          gg.a((byte) 105);
          MusicPatch.simulationPaused = false;
          MessageDialog.arcadeMode = arcadeMode;
          this.closePauseMenu((byte) 112);
          lg.field_c = 0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) var4), "qu.B(" + levelIndex + ',' + unused + ',' + arcadeMode + ')');
        }
    }

    GameplaySession() {
        LevelCompleteUpgradeScreen discarded$0 = null;
        GameOverScreen discarded$1 = null;
        try {
          FallbackShaderEffect.sceneryParticles = new IntrusiveDeque();
          OpenGlCubeTexture.sceneEffects = new IntrusiveDeque();
          this.resetSession(127);
          discarded$0 = new LevelCompleteUpgradeScreen();
          DropDownWidget.field_N = new bw();
          discarded$1 = new GameOverScreen();
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "qu.<init>()");
        }
    }

    static {
        noiseGradients = new float[][]{new float[]{-0.33333298563957214f, -0.33333298563957214f, -0.33333298563957214f}, new float[]{0.33333298563957214f, -0.33333298563957214f, -0.33333298563957214f}, new float[]{-0.33333298563957214f, 0.33333298563957214f, -0.33333298563957214f}, new float[]{0.33333298563957214f, 0.33333298563957214f, -0.33333298563957214f}, new float[]{-0.33333298563957214f, -0.33333298563957214f, 0.33333298563957214f}, new float[]{0.33333298563957214f, -0.33333298563957214f, 0.33333298563957214f}, new float[]{-0.33333298563957214f, 0.33333298563957214f, 0.33333298563957214f}, new float[]{0.33333298563957214f, 0.33333298563957214f, 0.33333298563957214f}};
    }
}
