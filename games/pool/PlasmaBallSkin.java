/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class PlasmaBallSkin extends BallSkin {
    static boolean[] field_p;
    static String muRequestWithdrawn;
    static String playerColon;
    static volatile boolean field_q;
    static PlayerContextMenu field_m;
    private static int[][] field_n;
    static IndexedSprite[] field_l;
    static String muGamelistAllGames;

    final static void a(int param0, int param1, Sprite[] param2, int param3, Sprite[] param4, int param5, int param6, BitmapFont param7, int param8, int param9, Sprite[] param10, int param11, int param12, int param13, int param14) {
        RuntimeException runtimeException = null;
        int var15_int = 0;
        int var16 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param11 != -1373633266) {
            return;
          }
          var15_int = param7.maxDescent + param7.field_L;
          var16 = param7.field_L;
          HighScoreRequest.a(param5, var16, param4, param7, param1, param10, param14, param6, 19539, param0, param2, var16, param13, param7, param3, param8, param12, param9, var15_int, var15_int);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_7_0 = runtimeException;
          stackIn_7_1 = new StringBuilder().append("vl.I(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param5).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param8).append(',').append(param9).append(',');
          if (param10 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param11).append(',').append(param12).append(',').append(param13).append(',').append(param14).append(')').toString());
        }
    }

    final void loadTopBarSprites(int param0, ResourceArchive param1) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          CollisionContact.field_q = WidgetStyleLayer.loadSprite("", (byte) 101, "grad_ball_purple", param1).field_D;
          TextInputPainter.field_r = WidgetStyleLayer.loadSprite("", (byte) 113, "grad_ball_blue", param1).field_D;
          PotEvent.field_p = WidgetStyleLayer.loadSprite("", (byte) 126, "grad_ball_red", param1).field_D;
          MembershipBenefitsLoader.field_e = WidgetStyleLayer.loadSprite("", (byte) 86, "grad_ball_white", param1).field_D;
          FontPaletteSupport.field_c = WidgetStyleLayer.loadSprite("", (byte) 68, "grad_lightning_purple", param1).field_D;
          if (param0 != 198123656) {
            field_p = (boolean[]) null;
          }
          TransformRotationSupport.field_i = WidgetStyleLayer.loadSprite("", (byte) 46, "grad_lightning_blue", param1).field_D;
          LimitedRandomAccessFile.field_a = WidgetStyleLayer.loadSprite("", (byte) 53, "grad_lightning_red", param1).field_D;
          AppletUrlSupport.field_i = WidgetStyleLayer.loadSprite("", (byte) 37, "grad_lightning_white", param1).field_D;
          this.field_e = NameEntryPopup.loadSpritesByName(0, "", param1, "top_bar_balls_plasma");
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("vl.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final void buildBallModel(boolean param0, int[] param1, int param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            this.drawBall((int[]) null, (int[]) null, 93, 33);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("vl.O(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(')').toString());
        }
    }

    final static void drawActiveScreen(int param0, int param1, boolean param2, boolean param3) {
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = Pool.field_O;
        try {
          if (param1 != -21972) {
            return;
          }
          if (DebugTuningSupport.field_g) {
            return;
          }
          if (param0 != -1) {
            if (param0 == -2) {
              SoftwareRasterizer.drawRectangle(0, 0, SoftwareRasterizer.width, SoftwareRasterizer.height, 0);
              if (var5 == 0) {
                return;
              }
            }
            if (!param3) {
              if (param0 >= 0) {
                DisplayModeSupport.field_c[param0].clearBackground(0);
              }
              if (!(param0 >= 0) ||
                var5 != 0) {
                SoftwareRasterizer.drawRectangle(0, 0, SoftwareRasterizer.width, SoftwareRasterizer.height, 0);
                if (var5 != 0) {
                  TextInputPainter.a(-96, false);
                  if (param0 < 0) {
                    SoftwareRasterizer.darkenRectangle(0, 0, SoftwareRasterizer.width, SoftwareRasterizer.height);
                    DisplayModeSupport.field_c[param0].darkenBackground((byte) 108);
                  } else {
                    DisplayModeSupport.field_c[param0].darkenBackground((byte) 108);
                  }
                }
              }} else {
              TextInputPainter.a(-96, false);
              if (param0 < 0) {
                SoftwareRasterizer.darkenRectangle(0, 0, SoftwareRasterizer.width, SoftwareRasterizer.height);
                if (var5 != 0) {
                  DisplayModeSupport.field_c[param0].darkenBackground((byte) 108);
                }
              } else {
                DisplayModeSupport.field_c[param0].darkenBackground((byte) 108);
              }
            }
            DisplayModeSupport.field_c[param0].drawScreen(param1 ^ -21891);
            if (var5 == 0) {
              return;
            }
          }
          TextInputPainter.a(93, param2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var4), "vl.H(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static BrowserCookieSupport validateEmailLocalPart(int obfuscationGuard, String localPart) {
        BrowserCookieSupport stackIn_5_0 = null;
        BrowserCookieSupport stackIn_10_0 = null;
        BrowserCookieSupport stackIn_16_0 = null;
        int stackIn_26_0 = 0;
        BrowserCookieSupport stackIn_36_0 = null;
        Object stackIn_40_0 = null;
        BrowserCookieSupport stackIn_43_0 = null;
        BrowserCookieSupport stackIn_57_0 = null;
        BrowserCookieSupport stackIn_63_0 = null;
        Object stackIn_67_0 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_72_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var3Lifetime1;
        int var4Lifetime1;
        int var5Lifetime1;
        var6 = Pool.field_O;
        try {
          var2_int = localPart.length();
          if (var2_int == 0) {
            stackIn_5_0 = WorldPointProjectionSupport.field_e;
            return stackIn_5_0;
          }
          if (64 < var2_int) {
            stackIn_10_0 = ChatPanelSupport.field_h;
            return stackIn_10_0;
          }
          if (localPart.charAt(0) == 34) {
            if (localPart.charAt(-1 + var2_int) != 34) {
              stackIn_16_0 = MessageScreen.field_K;
              return stackIn_16_0;
            }
            var3 = 0;
            var4 = 1;
            while (-1 + var2_int > var4) {
              var5 = localPart.charAt(var4);
              if (92 == var5) {
                stackIn_26_0 = (var3 != 0) ? 0 : 1;
                var3 = stackIn_26_0;
              }
              if (92 != var5 ||
                var6 != 0) {
                if (var5 == 34 &&
                  var3 == 0) {
                  stackIn_36_0 = MessageScreen.field_K;
                  return stackIn_36_0;
                }
                var3 = 0;
              }
              var4++;
              if (var6 == 0) {
                continue;
              }
              break;
            }
            stackIn_40_0 = null;
            return (BrowserCookieSupport) (stackIn_40_0);
          }
          if (obfuscationGuard != 7) {
            stackIn_43_0 = (BrowserCookieSupport) null;
            return stackIn_43_0;
          }
          var3Lifetime1 = 0;
          var4Lifetime1 = 0;
          while (var4Lifetime1 < var2_int) {
            boolean decompiledFrameRemainder0 = true;
            var5Lifetime1 = localPart.charAt(var4Lifetime1);
            if (var5Lifetime1 == 46) {
              if (0 != var4Lifetime1 &&
                var2_int - 1 != var4Lifetime1 &&
                var3Lifetime1 == 0) {
                var3Lifetime1 = 1;
                decompiledFrameRemainder0 = (var6 != 0);
              } else {
                stackIn_57_0 = MessageScreen.field_K;
                return stackIn_57_0;
              }
            }
            if (decompiledFrameRemainder0) {
              if (FullscreenDisplayMode.field_b.indexOf(var5Lifetime1) == -1) {
                stackIn_63_0 = MessageScreen.field_K;
                return stackIn_63_0;
              }
              var3Lifetime1 = 0;
            }
            var4Lifetime1++;
            if (var6 == 0) {
              continue;
            }
            break;
          }
          stackIn_67_0 = null;
          return (BrowserCookieSupport) (stackIn_67_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_71_0 = var2;
          stackIn_71_1 = new StringBuilder().append("vl.EA(").append(obfuscationGuard).append(',');
          if (localPart == null) {
            stackIn_72_2 = "null";
          } else {
            stackIn_72_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_71_0), ((StringBuilder) (Object) stackIn_71_1).append(stackIn_72_2).append(')').toString());
        }
    }

    private final void drawBallLightning(int[] cameraTransform, int[] ballTransform, int ballIndex, byte obfuscationGuard, int fade) {
        int[] dupTemp$2 = null;
        int[] dupTemp$3 = null;
        RuntimeException runtimeException = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int[] stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        int stackIn_18_2 = 0;
        int stackIn_27_0 = 0;
        int stackIn_27_1 = 0;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var18Lifetime1;
        int var18Lifetime2;
        int var19Lifetime1;
        int var19Lifetime2;
        int var20Lifetime1;
        int var20Lifetime2;
        var27 = Pool.field_O;
        try {
          var18 = cameraTransform[3] >> 2;
          var19 = cameraTransform[4] >> 2;
          var20 = cameraTransform[5] >> 2;
          var21 = cameraTransform[6] >> 2;
          var22 = cameraTransform[7] >> 2;
          var23 = cameraTransform[8] >> 2;
          var24 = cameraTransform[9] >> 2;
          var25 = cameraTransform[10] >> 2;
          if (obfuscationGuard >= -37) {
            return;
          }
          var26 = cameraTransform[11] >> 2;
          var9 = ballTransform[5] * var20 + ballTransform[4] * var19 + ballTransform[3] * var18 >> 14;
          var10 = ballTransform[3] * var21 + ballTransform[4] * var22 + ballTransform[5] * var23 >> 14;
          var13 = ballTransform[6] * var21 + var22 * ballTransform[7] + ballTransform[8] * var23 >> 14;
          var17 = var26 * ballTransform[11] + ballTransform[10] * var25 + var24 * ballTransform[9] >> 14;
          var15 = ballTransform[11] * var20 + ballTransform[9] * var18 + var19 * ballTransform[10] >> 14;
          var12 = var18 * ballTransform[6] + var19 * ballTransform[7] + ballTransform[8] * var20 >> 14;
          var11 = ballTransform[5] * var26 + ballTransform[4] * var25 + var24 * ballTransform[3] >> 14;
          var14 = var26 * ballTransform[8] + ballTransform[7] * var25 + var24 * ballTransform[6] >> 14;
          var16 = var22 * ballTransform[10] + ballTransform[9] * var21 + ballTransform[11] * var23 >> 14;
          var18Lifetime1 = ballTransform[0] - cameraTransform[0];
          var19Lifetime1 = -cameraTransform[1] + ballTransform[1];
          var20Lifetime1 = -cameraTransform[2] + ballTransform[2];
          var7 = var19Lifetime1 * cameraTransform[7] + (var18Lifetime1 * cameraTransform[6] + cameraTransform[8] * var20Lifetime1) >> 16;
          var8 = cameraTransform[10] * var19Lifetime1 + (var18Lifetime1 * cameraTransform[9] + cameraTransform[11] * var20Lifetime1) >> 16;
          var6_int = var20Lifetime1 * cameraTransform[5] + (var18Lifetime1 * cameraTransform[3] + var19Lifetime1 * cameraTransform[4]) >> 16;
          var18Lifetime2 = 0;
          var19Lifetime2 = 0;
          scanLoop1: while (true) {
            regionExit2: {
              if (var19Lifetime2 < QuickChatDynamicCommand.field_d[ballIndex].length) {
                var20Lifetime2 = 2 + (128 * var19Lifetime2 / QuickChatDynamicCommand.field_d[ballIndex].length - 64);
                MusicPatchEnvelope.field_i[ballIndex][var19Lifetime2] = var20Lifetime2 * var15 + var12 * ResizableDialog.field_ab[ballIndex][var19Lifetime2] + QuickChatDynamicCommand.field_d[ballIndex][var19Lifetime2] * var9 >> 16;
                field_n[ballIndex][var19Lifetime2] = var13 * ResizableDialog.field_ab[ballIndex][var19Lifetime2] + (var10 * QuickChatDynamicCommand.field_d[ballIndex][var19Lifetime2] + var16 * var20Lifetime2) >> 16;
                var20Lifetime2 = var14 * ResizableDialog.field_ab[ballIndex][var19Lifetime2] + QuickChatDynamicCommand.field_d[ballIndex][var19Lifetime2] * var11 + var20Lifetime2 * var17 >> 16;
                dupTemp$2 = MusicPatchEnvelope.field_i[ballIndex];
                dupTemp$2[var19Lifetime2] = dupTemp$2[var19Lifetime2] + var6_int;
                dupTemp$3 = field_n[ballIndex];
                dupTemp$3[var19Lifetime2] = dupTemp$3[var19Lifetime2] + var7;
                var20Lifetime2 = var20Lifetime2 + var8;
                stackIn_27_0 = 0;
                stackIn_27_1 = var20Lifetime2;
                if (var27 != 0) {
                  break scanLoop1;
                }
                if (stackIn_27_0 < stackIn_27_1) {
                  MusicPatchEnvelope.field_i[ballIndex][var19Lifetime2] = (SoftwareRasterizer.clipLeft + TriangleRasterizer.projectionCenterX << 2) + (MusicPatchEnvelope.field_i[ballIndex][var19Lifetime2] << 11) / var20Lifetime2;
                  field_n[ballIndex][var19Lifetime2] = (SoftwareRasterizer.clipTop + TriangleRasterizer.projectionCenterY << 2) + (field_n[ballIndex][var19Lifetime2] << 11) / var20Lifetime2;
                  stackIn_15_0 = TikiBallSkin.field_o[ballIndex];
                  stackIn_15_1 = var19Lifetime2;
                  if (0 != var19Lifetime2 &&
                    var18Lifetime2 == 0) {
                    stackIn_18_2 = (int)(((long)BrowserCookieSupport.field_a[ballIndex][var19Lifetime2] << 10) / (long)var20Lifetime2);
                  } else {
                    stackIn_18_2 = 0;
                  }
                  stackIn_15_0[stackIn_15_1] = stackIn_18_2;
                } else {
                  var18Lifetime2 = 1;
                  break regionExit2;
                }
                var19Lifetime2++;
                continue;
              }
            }
            if (var18Lifetime2 != 0) {
              return;
            }
            stackIn_27_0 = 0;
            stackIn_27_1 = 0;
            break;
          }
          ReflectionReplySupport.$cfr$intArgs$a$2435eea43ef1(stackIn_27_0, stackIn_27_1, DisplayModeSupport.a(ballIndex, 115), field_n[ballIndex], 32512 - fade * 127 >> 8, 0, MusicPatchEnvelope.field_i[ballIndex], TikiBallSkin.field_o[ballIndex]);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_32_0 = runtimeException;
          stackIn_32_1 = new StringBuilder().append("vl.J(");
          if (cameraTransform == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          stackIn_36_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',');
          if (ballTransform == null) {
            stackIn_37_2 = "null";
          } else {
            stackIn_37_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(',').append(ballIndex).append(',').append(obfuscationGuard).append(',').append(fade).append(')').toString());
        }
    }

    final void updateAnimation(int param0) {
        int[] dupTemp$2 = null;
        int var7 = 0;
        int[] dupTemp$0 = null;
        int[] dupTemp$1 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var8 = 0;
        int var5Lifetime1;
        int var6Lifetime1;
        var8 = Pool.field_O;
        try {
          var3 = -74 / ((29 - param0) / 44);
          var4 = QuickChatDynamicCommand.field_d[0].length;
          for (var5 = 0; QuickChatDynamicCommand.field_d.length > var5; var5++) {
            dupTemp$2 = BrowserCookieSupport.field_a[var5];
            dupTemp$2[1] = dupTemp$2[1] + (-3 + MaxLengthTextInputWidget.nextRandomInt(5, true, RankingsRequest.field_r));
            BrowserCookieSupport.field_a[var5][QuickChatDynamicCommand.field_d[var5].length - 1] = 0;
            if (48 >= BrowserCookieSupport.field_a[var5][1]) {
              if (BrowserCookieSupport.field_a[var5][1] < 16) {
                BrowserCookieSupport.field_a[var5][1] = 16;
              }
            } else {
              BrowserCookieSupport.field_a[var5][1] = 48;
            }
            for (var6 = var4 - 2; 1 < var6; var6--) {
              BrowserCookieSupport.field_a[var5][var6] = BrowserCookieSupport.field_a[var5][-1 + var6];
            }
          }
          for (var5Lifetime1 = 1; (var4 - 1) > var5Lifetime1; var5Lifetime1++) {
            var2_int = var5Lifetime1 - var4 / 2;
            var6Lifetime1 = AccountDisplayNameSupport.inverseSquareRoot(65536 - (var2_int * var2_int << 16) / (var4 * var4 / 4), -120) * 8 >> 13 >> 1;
            for (var7 = 0; var7 < QuickChatDynamicCommand.field_d.length; var7++) {
              if (var6Lifetime1 > 0) {
                QuickChatDynamicCommand.field_d[var7][var5Lifetime1] = QuickChatDynamicCommand.field_d[var7][var5Lifetime1] + QuickChatDynamicCommand.field_d[var7][-1 + var5Lifetime1] >> 1;
                ResizableDialog.field_ab[var7][var5Lifetime1] = ResizableDialog.field_ab[var7][var5Lifetime1] + ResizableDialog.field_ab[var7][var5Lifetime1 - 1] >> 1;
                dupTemp$0 = QuickChatDynamicCommand.field_d[var7];
                dupTemp$0[var5Lifetime1] = dupTemp$0[var5Lifetime1] + (MaxLengthTextInputWidget.nextRandomInt(5, true, RankingsRequest.field_r) - 2);
                dupTemp$1 = ResizableDialog.field_ab[var7];
                dupTemp$1[var5Lifetime1] = dupTemp$1[var5Lifetime1] + (MaxLengthTextInputWidget.nextRandomInt(5, true, RankingsRequest.field_r) - 2);
                if (var6Lifetime1 >= QuickChatDynamicCommand.field_d[var7][var5Lifetime1]) {
                  if (-var6Lifetime1 > QuickChatDynamicCommand.field_d[var7][var5Lifetime1]) {
                    QuickChatDynamicCommand.field_d[var7][var5Lifetime1] = -var6Lifetime1;
                  }
                } else {
                  QuickChatDynamicCommand.field_d[var7][var5Lifetime1] = var6Lifetime1;
                }
                if (ResizableDialog.field_ab[var7][var5Lifetime1] <= var6Lifetime1) {
                  if (ResizableDialog.field_ab[var7][var5Lifetime1] < -var6Lifetime1) {
                    ResizableDialog.field_ab[var7][var5Lifetime1] = -var6Lifetime1;
                  }
                } else {
                  ResizableDialog.field_ab[var7][var5Lifetime1] = var6Lifetime1;
                }
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var2), "vl.CA(" + param0 + ')');
        }
    }

    public static void releaseStatics(int param0) {
        try {
          muRequestWithdrawn = null;
          int var1_int = -50 % ((40 - param0) / 58);
          field_n = (int[][]) null;
          playerColon = null;
          field_p = null;
          field_l = null;
          muGamelistAllGames = null;
          field_m = null;
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "vl.E(" + param0 + ')');
        }
    }

    final void prepareForGame(int param0, PoolGameModel param1) {
        int stackIn_13_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        var5 = Pool.field_O;
        try {
          QuickChatDynamicCommand.field_d = new int[param1.balls.length][12];
          ResizableDialog.field_ab = new int[param1.balls.length][12];
          BrowserCookieSupport.field_a = new int[param1.balls.length][12];
          MusicPatchEnvelope.field_i = new int[QuickChatDynamicCommand.field_d.length][QuickChatDynamicCommand.field_d[0].length];
          field_n = new int[QuickChatDynamicCommand.field_d.length][QuickChatDynamicCommand.field_d[0].length];
          TikiBallSkin.field_o = new int[QuickChatDynamicCommand.field_d.length][QuickChatDynamicCommand.field_d[0].length];
          var3_int = 0;
          scanLoop1: while (true) {
            if (QuickChatDynamicCommand.field_d.length > var3_int) {
              stackIn_13_0 = 0;
              if (var5 != 0) {
                break scanLoop1;
              }
              var4 = stackIn_13_0;
              while (var4 < QuickChatDynamicCommand.field_d[var3_int].length) {
                QuickChatDynamicCommand.field_d[var3_int][var4] = 0;
                ResizableDialog.field_ab[var3_int][var4] = 0;
                BrowserCookieSupport.field_a[var3_int][var4] = 16;
                var4++;
              }
              BrowserCookieSupport.field_a[var3_int][0] = 0;
              BrowserCookieSupport.field_a[var3_int][-1 + BrowserCookieSupport.field_a[var3_int].length] = 0;
              var3_int++;
              continue scanLoop1;
            }
            stackIn_13_0 = param0;
            break;
          }
          if (stackIn_13_0 != 2147483647) {
            PlasmaBallSkin.validateEmailLocalPart(106, (String) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_20_0 = var3;
          stackIn_20_1 = new StringBuilder().append("vl.AA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    final String groupLabel(int param0, byte param1) {
        RuntimeException var3 = null;
        String stackIn_7_0 = null;
        String stackIn_12_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 < 108) {
            PlasmaBallSkin.validateEmailLocalPart(7, (String) null);
          }
          if (param0 == 0) {
            stackIn_7_0 = ChatMessage.ballsetPlasmaGroup0Nocolour;
            return stackIn_7_0;
          }
          if (param0 != 1) {
            throw new IllegalStateException("Invalid group number");
          }
          stackIn_12_0 = FadingDialog.ballsetPlasmaGroup1Nocolour;
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var3), "vl.W(" + param0 + ',' + param1 + ')');
        }
    }

    private final void drawBallGlow(int fade, byte obfuscationGuard, int ballIndex, int[] cameraTransform, int[] ballTransform) {
        RuntimeException runtimeException = null;
        int var6_int = 0;
        long var7 = 0L;
        long var9 = 0L;
        long var11 = 0L;
        long var13 = 0L;
        long var15 = 0L;
        long var17 = 0L;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6_int = -100 / ((47 - obfuscationGuard) / 45);
          var7 = (long)(-cameraTransform[0] + ballTransform[0]);
          var9 = (long)(-cameraTransform[1] + ballTransform[1]);
          var11 = (long)(-cameraTransform[2] + ballTransform[2]);
          var13 = (long)cameraTransform[9] * var7 + ((long)cameraTransform[10] * var9 + (long)cameraTransform[11] * var11);
          if (var13 <= 0L) {
            return;
          }
          var15 = (long)cameraTransform[4] * var9 + (long)cameraTransform[3] * var7 + (long)cameraTransform[5] * var11;
          var17 = var9 * (long)cameraTransform[7] + (var7 * (long)cameraTransform[6] + var11 * (long)cameraTransform[8]);
          var15 = (var15 << 13) / var13 + (long)(SoftwareRasterizer.clipLeft + TriangleRasterizer.projectionCenterX << 4);
          var17 = (var17 << 13) / var13 + (long)(SoftwareRasterizer.clipTop + TriangleRasterizer.projectionCenterY << 4);
          SoftwareRasterizer.fillCircleBlended((int)(var15 >> 4), (int)(var17 >> 4), -2 + ((int)(2147483648L / var13) * (256 - fade) >> 8), 0, 224);
          if (2147483647L > 127L * (34359738368L / var13) * (34359738368L / var13)) {
            SoftwareRasterizer.fillRadialGlow((int)var15, (int)var17, (int)(34359738368L / var13) * (256 - fade) >> 8, 127, DiskArchiveRequest.a(-9, ballIndex));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_12_0 = runtimeException;
          stackIn_12_1 = new StringBuilder().append("vl.FA(").append(fade).append(',').append(obfuscationGuard).append(',').append(ballIndex).append(',');
          if (cameraTransform == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (ballTransform == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final static void updateReportAbuseDialog(boolean param0, int param1, boolean param2) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param0) {
            return;
          }
          if (AccountMenuText.field_b != null) {
            var3_int = AccountMenuText.field_b.updateAndPollReason(param2, -27403);
            if (var3_int != -2) {
              if (var3_int != -1) {
                var4 = AccountMenuText.field_b.isMuteRequested(-10459) ? 1 : 0;
                ValidationIconWidget.a(var4 != 0, AccountMenuText.field_b.getReportedName(1), var3_int, param1, AccountMenuText.field_b.reportTargetId, -121);
              }
              AccountMenuText.field_b = null;
              ProgressDialog.m(8421504);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "vl.F(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    PlasmaBallSkin() {
    }

    final int ballColor(int param0, boolean param1) {
        int stackIn_84_0 = 0;
        int stackIn_86_0 = 0;
        int stackIn_88_0 = 0;
        int stackIn_90_0 = 0;
        int stackIn_95_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        var4 = Pool.field_O;
        try {
          boolean decompiledFrameRemainder0 = true;
          var3_int = param0;
          if (0 != var3_int) {
            if ((1 != var3_int ||
              var4 != 0) && var3_int != 2 && (var3_int != 3 ||
              var4 != 0) && (var3_int != 4 ||
              var4 != 0) && var3_int != 5 && (var3_int != 6 ||
              var4 != 0) && (var3_int != 7 ||
              var4 != 0)) {
              if (8 == var3_int &&
                var4 == 0) {
                stackIn_88_0 = 3355443;
                return stackIn_88_0;
              }
              if ((var3_int != 9 ||
                var4 != 0) && (var3_int != 10 ||
                var4 != 0) && (var3_int != 11 ||
                var4 != 0) && var3_int != 12 && (13 != var3_int ||
                var4 != 0) && (var3_int != 14 ||
                var4 != 0)) {
                if (15 != var3_int) {
                  if (!param1) {
                    playerColon = (String) null;
                  }
                  stackIn_95_0 = 16711935;
                  return stackIn_95_0;
                }
                decompiledFrameRemainder0 = (var4 == 0);
              }
              if (decompiledFrameRemainder0) {
                stackIn_90_0 = 255;
                return stackIn_90_0;
              }
            }
            if (decompiledFrameRemainder0) {
              stackIn_86_0 = 16711680;
              return stackIn_86_0;
            }
          }
          stackIn_84_0 = 16777215;
          return stackIn_84_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var3), "vl.A(" + param0 + ',' + param1 + ')');
        }
    }

    final void drawBall(int[] param0, int[] param1, int param2, int param3) {
        RuntimeException runtimeException = null;
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = Pool.field_O;
        try {
          if (param3 != -3637) {
            return;
          }
          if (16384 >= param0[2]) {
            var5_int = 0;
            if (var6 != 0) {
              if (32768 > param0[2]) {
                var5_int = (param0[2] * 256 - 4194304) / 16384;
                var5_int = 256;
              } else {
                var5_int = 256;
              }
            }
          } else {
            if (32768 > param0[2]) {
              var5_int = (param0[2] * 256 - 4194304) / 16384;
              if (var6 != 0) {
                var5_int = 256;
              }
            } else {
              var5_int = 256;
            }
          }
          this.drawBallGlow(var5_int, (byte) 106, param2, param1, param0);
          this.drawBallLightning(param1, param0, param2, (byte) -56, var5_int);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_15_0 = runtimeException;
          stackIn_15_1 = new StringBuilder().append("vl.DA(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static boolean allowRateLimitedMessage(int obfuscationGuard) {
        long var1_long = 0L;
        RuntimeException var1 = null;
        long var3 = 0L;
        int var5 = 0;
        int var6 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = Pool.field_O;
        try {
          var1_long = MonotonicClock.monotonicTimeMillis((byte) -101);
          if (obfuscationGuard != 12000) {
            PlasmaBallSkin.releaseStatics(32);
          }
          var3 = var1_long - VerticalScrollbar.field_Pb;
          if (var3 <= 30000L) {
            boolean decompiledFrameRemainder0 = true;
            var5 = 3000;
            if (7 <= CachedArchiveSource.field_j) {
              var5 = 12000;
              decompiledFrameRemainder0 = (var6 != 0);
            }
            if (decompiledFrameRemainder0) {
              if (5 > CachedArchiveSource.field_j) {
                if (!(CachedArchiveSource.field_j < 3)) {
                  var5 = 6000;
                  if (var6 != 0) {
                    var5 = 9000;
                  }
                }
              } else {
                var5 = 9000;
              }
            }
            if (var3 > (long)var5) {
              VerticalScrollbar.field_Pb = var1_long;
              CachedArchiveSource.field_j = CachedArchiveSource.field_j + 1;
              return true;
            }
            if (var6 == 0) {
              return false;
            }
          }
          CachedArchiveSource.field_j = 0;
          VerticalScrollbar.field_Pb = var1_long;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var1), "vl.GA(" + obfuscationGuard + ')');
        }
    }

    final int meshCount(int param0) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 384) {
            this.drawBallLightning((int[]) null, (int[]) null, 41, (byte) 82, 126);
          }
          stackIn_4_0 = QuickChatDynamicCommand.field_d.length;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var2), "vl.P(" + param0 + ')');
        }
    }

    final void drawBallAndShadow(int param0, int param1, int[] param2, int[] param3, boolean param4) {
        int var6_int = 0;
        int var7 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = Pool.field_O;
        try {
          if (param0 != -1912602369) {
            this.groupName((byte) -54, -91);
          }
          this.drawBallShadow(param4, param2, param1, param3, -20263);
          if (param2[2] > 16384) {
            if (param2[2] >= 32768) {
              var6_int = 256;
              if (var7 != 0) {
                var6_int = (param2[2] - 16384) * 256 / 16384;
                var6_int = 0;
              }
            } else {
              var6_int = (param2[2] - 16384) * 256 / 16384;
              if (var7 != 0) {
                var6_int = 0;
              }
            }
          } else {
            var6_int = 0;
          }
          this.drawBallGlow(var6_int, (byte) -93, param1, param3, param2);
          this.drawBallLightning(param3, param2, param1, (byte) -77, var6_int);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_16_0 = var6;
          stackIn_16_1 = new StringBuilder().append("vl.K(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (param3 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param4).append(')').toString());
        }
    }

    final boolean usesNumberedBallLabels(int obfuscationGuard) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard == 2) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var2), "vl.B(" + obfuscationGuard + ')');
        }
    }

    final int[] gradientPalette(int param0, int param1) {
        int[] stackIn_78_0 = null;
        int[] stackIn_80_0 = null;
        int[] stackIn_82_0 = null;
        int[] stackIn_84_0 = null;
        Object stackIn_86_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        var4 = Pool.field_O;
        try {
          if (param1 != 0) {
            muGamelistAllGames = (String) null;
          }
          boolean decompiledFrameRemainder0 = true;
          var3_int = param0;
          if (var3_int != 0 ||
            var4 != 0) {
            if (1 != var3_int && (var3_int != 2 ||
              var4 != 0) && var3_int != 3 && (var3_int != 4 ||
              var4 != 0) && (5 != var3_int &&
              var3_int != 6) && (var3_int != 7 ||
              var4 != 0)) {
              if (var3_int == 8 &&
                var4 == 0) {
                stackIn_82_0 = FontPaletteSupport.field_c;
                return stackIn_82_0;
              }
              if (var3_int != 9 && (var3_int != 10 ||
                var4 != 0) && (var3_int != 11 ||
                var4 != 0) && (var3_int != 12 &&
                var3_int != 13) && (14 != var3_int ||
                var4 != 0)) {
                if (var3_int != 15) {
                  stackIn_86_0 = null;
                  return (int[]) (stackIn_86_0);
                }
                decompiledFrameRemainder0 = (var4 == 0);
              }
              if (decompiledFrameRemainder0) {
                stackIn_84_0 = TransformRotationSupport.field_i;
                return stackIn_84_0;
              }
            }
            if (decompiledFrameRemainder0) {
              stackIn_80_0 = LimitedRandomAccessFile.field_a;
              return stackIn_80_0;
            }
          }
          stackIn_78_0 = AppletUrlSupport.field_i;
          return stackIn_78_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var3), "vl.T(" + param0 + ',' + param1 + ')');
        }
    }

    final String groupName(byte param0, int param1) {
        RuntimeException var3 = null;
        String stackIn_4_0 = null;
        String stackIn_7_0 = null;
        String stackIn_12_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == 0) {
            stackIn_4_0 = CacheEntry.ballsetPlasmaGroup0;
            return stackIn_4_0;
          }
          if (param0 <= 9) {
            stackIn_7_0 = (String) null;
            return stackIn_7_0;
          }
          if (1 != param1) {
            throw new IllegalStateException("Invalid group number");
          }
          stackIn_12_0 = DirectByteStorage.ballsetPlasmaGroup1;
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var3), "vl.G(" + param0 + ',' + param1 + ')');
        }
    }

    static {
        playerColon = "<%0>: ";
        field_q = true;
        muRequestWithdrawn = "You have withdrawn your request to join.";
        muGamelistAllGames = "All games";
    }
}
