/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class PowerupProgressCard extends IntrusiveNode {
    static String field_r;
    private int field_f;
    private int field_t;
    private int field_n;
    static boolean field_l;
    static int field_i;
    private int field_h;
    static String field_g;
    private int field_s;
    static boolean field_o;
    int field_m;
    private int field_q;
    private Sprite field_p;
    static int[] field_j;
    private int field_k;

    final static void flushPackets(int param0, boolean param1) {
        try {
          IOException iOException = null;
          Throwable decompiledCaughtException = null;
          if (SpriteHotspot.field_h != null && (0 > param0 ||
            IntroScreen.field_l == CredentialKind.field_a)) {
            if (param1) {
              field_g = (String) null;
            }
            if (TextValidationFailure.field_a.position == 0 &&
              UiWidget.field_g + 10000L < ClockAndScreenHelpers.monotonicMillis((byte) 59)) {
              TextValidationFailure.field_a.writeCipheredOpcode((byte) -35, param0);
            }
            if (0 < TextValidationFailure.field_a.position) {
              try {
                SpriteHotspot.field_h.write(0, -100, TextValidationFailure.field_a.position, TextValidationFailure.field_a.payload);
                UiWidget.field_g = ClockAndScreenHelpers.monotonicMillis((byte) 125);
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                iOException = (IOException) (Object) decompiledCaughtException;
                ClientShellHelpers.closeGameSocket((byte) -121);
              }
              TextValidationFailure.field_a.position = 0;
            }
            return;
          }
          TextValidationFailure.field_a.position = 0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void resetDisplayedProgress(byte param0) {
        this.field_n = this.field_q;
        if (param0 != 99) {
          FramePainter var3 = (FramePainter) null;
          PowerupProgressCard.setMenuFrameAndPadding(96, 89, 115, (FramePainter) null);
        }
    }

    final static void drawHorizontalFadeSprite(int param0, boolean param1, int param2, int param3, Sprite param4, int param5) {
        int incrementValue$0 = 0;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
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
        int var14Lifetime1;
        int var14Lifetime2;
        int var14Lifetime3;
        var20 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          var6_int = (param2 - param5 << 8) / param4.fullWidth;
          param3 = param3 + param4.offsetX;
          var7 = var6_int * param4.offsetX + (param5 << 8);
          param0 = param0 + param4.field_y;
          var8 = param3 + param0 * SoftwareRasterizer.width;
          var9 = 0;
          if (param1) {
            field_o = false;
          }
          var10 = param4.height;
          var11 = param4.width;
          var12 = SoftwareRasterizer.width - var11;
          if (SoftwareRasterizer.clipTop > param0) {
            var14 = SoftwareRasterizer.clipTop - param0;
            var9 = var9 + var14 * var11;
            var8 = var8 + var14 * SoftwareRasterizer.width;
            var10 = var10 - var14;
            param0 = SoftwareRasterizer.clipTop;
          }
          var13 = 0;
          if (param3 < SoftwareRasterizer.clipLeft) {
            var14Lifetime1 = SoftwareRasterizer.clipLeft - param3;
            var13 = var13 + var14Lifetime1;
            var9 = var9 + var14Lifetime1;
            var12 = var12 + var14Lifetime1;
            var11 = var11 - var14Lifetime1;
            param3 = SoftwareRasterizer.clipLeft;
            var7 = var7 + var6_int * var14Lifetime1;
            var8 = var8 + var14Lifetime1;
          }
          if (var10 + param0 > SoftwareRasterizer.clipBottom) {
            var10 = var10 - (-SoftwareRasterizer.clipBottom + (var10 + param0));
          }
          if (SoftwareRasterizer.clipRight < param3 + var11) {
            var14Lifetime2 = -SoftwareRasterizer.clipRight + (var11 + param3);
            var12 = var12 + var14Lifetime2;
            var13 = var13 + var14Lifetime2;
            var11 = var11 - var14Lifetime2;
          }
          if (var11 > 0 &&
            var10 > 0) {
            for (param0 = -var10; 0 > param0; param0++) {
              var14Lifetime3 = var7;
              for (param3 = -var11; 0 > param3; param3++) {
                var15 = var14Lifetime3 >> 8;
                var16 = -var15 + 256;
                var14Lifetime3 = var14Lifetime3 + var6_int;
                if (var15 < 0) {
                  var9++;
                  var8++;
                } else {
                  incrementValue$0 = var9;
                  var9++;
                  var17 = param4.pixels[incrementValue$0];
                  if (var17 != 0) {
                    if (255 >= var15) {
                      var18 = SoftwareRasterizer.pixels[var8];
                      var19 = (var18 & 16711935) * var16 + var15 * (var17 & 16711935) >> 8 & 16711935;
                      SoftwareRasterizer.pixels[var8] = (ScrollPane.bitAnd(var15 * ScrollPane.bitAnd(var17, 65280) + var16 * ScrollPane.bitAnd(var18, 65280), 16711705) >> 8) + var19;
                    } else {
                      SoftwareRasterizer.pixels[var8] = var17;
                    }
                    var8++;
                  } else {
                    var8++;
                  }
                }
              }
              var9 = var9 + var13;
              var8 = var8 + var12;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_35_0 = var6;
          stackIn_35_1 = new StringBuilder().append("cb.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_35_0), ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(',').append(param5).append(')').toString());
        }
    }

    final void setupForPowerup(int param0, int param1, int param2, int param3) {
        int stackIn_5_1 = 0;
        this.field_m = param2;
        this.field_h = param3;
        this.field_k = 70;
        this.field_p = new Sprite(this.field_k, this.field_h);
        if (!FullscreenFocusCanvas.field_k.isResearchable(param3 ^ 57, this.field_m)) {
          this.field_s = 0;
          this.field_n = 0;
        } else {
          this.field_s = PendingStatusRequest.getMaxResearchLevel(this.field_m, param3 - 193);
          if (FullscreenFocusCanvas.field_k.isUpgradeUnlocked(this.field_m, 53)) {
            stackIn_5_1 = this.field_s;
          } else {
            stackIn_5_1 = FullscreenFocusCanvas.field_k.field_t[this.field_m];
          }
          this.field_n = stackIn_5_1;
          if (this.field_s < this.field_n) {
            this.field_n = this.field_s;
          }
        }
        this.field_f = 0;
        this.field_q = this.field_n;
        this.renderCard((byte) -117);
    }

    final void advanceProgressAnimation(byte param0) {
        if (param0 != -102) {
          field_g = (String) null;
        }
        if (this.field_f > this.field_n) {
          this.field_n = this.field_n + 1;
        }
        if (this.field_s < this.field_n) {
          this.field_n = this.field_s;
        }
    }

    final static void showLoginForm(String param0, int param1, String param2) {
        if (param1 != 32) {
          return;
        }
        try {
          if (PortalView.field_L != null) {
            PortalView.field_L.dismissDialog(-7435);
          }
          IdleTickHelpers.field_c = new LoginForm(param2, param0, false, true, true);
          SoundEffectInstance.field_i.transitionToContent((UiWidget) (IdleTickHelpers.field_c), (byte) -110);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "cb.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void releaseStatics(int param0) {
        field_g = null;
        if (param0 != 0) {
          PowerupProgressCard.releaseStatics(-85);
          field_r = null;
          field_j = null;
          return;
        }
        field_r = null;
        field_j = null;
    }

    final static int nextPowerOfTwo(int param0, int param1) {
        param1--;
        param1 = param1 | param1 >>> 1;
        param1 = param1 | param1 >>> 2;
        param1 = param1 | param1 >>> 4;
        param1 = param1 | param1 >>> 8;
        param1 = param1 | param1 >>> 16;
        if (param0 < -69) {
          return 1 + param1;
        }
        field_r = (String) null;
        return 1 + param1;
    }

    private final void renderCard(byte param0) {
        int var2;
        Sprite var3;
        int var5;
        Sprite var4;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        RasterEffectHelpers.pushSpriteTarget(this.field_p);
        var2 = 60 % ((param0 + 53) / 55);
        if (this.field_t == 0) {
          var3 = ScoreUpdateEvent.field_m;
        } else {
          if (this.field_t == 1) {
            var3 = Camera.field_w;
          } else {
            var3 = InstructionsScreen.field_n;
          }
        }
        if (this.field_m < 19) {
          var3.drawRecoloredNeutral(0, 0, 6707010);
          if (this.field_s == 0) {
            SoftwareRasterizer.fillRectAlpha(5, 5, -10 + this.field_k, this.field_h - 10, 0, 96);
            EffectAudioHelpers.field_e.drawCenteredAlpha(LocalGameWorld.field_N, this.field_k / 2, 32, 16777215, 0, 128);
          } else {
            if (19 > this.field_m) {
              var4 = MarkerSliderPainter.field_b[this.field_m];
            } else {
              if (32 > this.field_m) {
                var4 = MarkerSliderPainter.field_b[26 + (this.field_m - 44)];
              } else {
                if (this.field_m > 38) {
                  var4 = MarkerSliderPainter.field_b[26 + (this.field_m - 44)];
                } else {
                  var4 = MarkerSliderPainter.field_b[-32 + (this.field_m + 19)];
                }
              }
            }
            var4.drawTransparent((var3.width - var4.width) / 2, (var3.height - var4.height) / 2 + 4);
          }
        } else {
          if (this.field_m < 44) {
            if (IntrusiveDequeCursor.isModifierUpgrade(this.field_m, false)) {
              var3.drawRecoloredNeutral(0, 0, 4202528);
            }
            if (this.field_s == 0) {
              SoftwareRasterizer.fillRectAlpha(5, 5, -10 + this.field_k, this.field_h - 10, 0, 96);
              EffectAudioHelpers.field_e.drawCenteredAlpha(LocalGameWorld.field_N, this.field_k / 2, 32, 16777215, 0, 128);
            } else {
              if (19 > this.field_m) {
                var4 = MarkerSliderPainter.field_b[this.field_m];
              } else {
                if (32 > this.field_m) {
                  var4 = MarkerSliderPainter.field_b[26 + (this.field_m - 44)];
                } else {
                  if (this.field_m > 38) {
                    var4 = MarkerSliderPainter.field_b[26 + (this.field_m - 44)];
                    var4.drawTransparent((var3.width - var4.width) / 2, (var3.height - var4.height) / 2 + 4);
                    RasterEffectHelpers.popRaster();
                    return;
                  }
                  var4 = MarkerSliderPainter.field_b[-32 + (this.field_m + 19)];
                }
              }
              var4.drawTransparent((var3.width - var4.width) / 2, (var3.height - var4.height) / 2 + 4);
            }
          } else {
            if (this.field_m <= 62) {
              var3.drawRecoloredNeutral(0, 0, 1922601);
              if (this.field_s == 0) {
                SoftwareRasterizer.fillRectAlpha(5, 5, -10 + this.field_k, this.field_h - 10, 0, 96);
                EffectAudioHelpers.field_e.drawCenteredAlpha(LocalGameWorld.field_N, this.field_k / 2, 32, 16777215, 0, 128);
              } else {
                if (19 > this.field_m) {
                  var4 = MarkerSliderPainter.field_b[this.field_m];
                } else {
                  if (32 > this.field_m) {
                    var4 = MarkerSliderPainter.field_b[26 + (this.field_m - 44)];
                  } else {
                    if (this.field_m > 38) {
                      var4 = MarkerSliderPainter.field_b[26 + (this.field_m - 44)];
                    } else {
                      var4 = MarkerSliderPainter.field_b[-32 + (this.field_m + 19)];
                    }
                  }
                }
                var4.drawTransparent((var3.width - var4.width) / 2, (var3.height - var4.height) / 2 + 4);
              }
            } else {
              if (!IntrusiveDequeCursor.isModifierUpgrade(this.field_m, false)) {
                if (this.field_s != 0) {
                  if (19 <= this.field_m) {
                    if (32 <= this.field_m &&
                      this.field_m <= 38) {
                      var4 = MarkerSliderPainter.field_b[-32 + (this.field_m + 19)];
                    } else {
                      var4 = MarkerSliderPainter.field_b[26 + (this.field_m - 44)];
                    }
                  } else {
                    var4 = MarkerSliderPainter.field_b[this.field_m];
                  }
                  var4.drawTransparent((var3.width - var4.width) / 2, (var3.height - var4.height) / 2 + 4);
                } else {
                  SoftwareRasterizer.fillRectAlpha(5, 5, -10 + this.field_k, this.field_h - 10, 0, 96);
                  EffectAudioHelpers.field_e.drawCenteredAlpha(LocalGameWorld.field_N, this.field_k / 2, 32, 16777215, 0, 128);
                }
              } else {
                var3.drawRecoloredNeutral(0, 0, 4202528);
                if (this.field_s != 0) {
                  if (19 <= this.field_m) {
                    if (32 > this.field_m) {
                      var4 = MarkerSliderPainter.field_b[26 + (this.field_m - 44)];
                    } else {
                      if (this.field_m <= 38) {
                        var4 = MarkerSliderPainter.field_b[-32 + (this.field_m + 19)];
                      } else {
                        var4 = MarkerSliderPainter.field_b[26 + (this.field_m - 44)];
                      }
                    }
                    var4.drawTransparent((var3.width - var4.width) / 2, (var3.height - var4.height) / 2 + 4);
                    RasterEffectHelpers.popRaster();
                    return;
                  }
                  var4 = MarkerSliderPainter.field_b[this.field_m];
                  var4.drawTransparent((var3.width - var4.width) / 2, (var3.height - var4.height) / 2 + 4);
                } else {
                  SoftwareRasterizer.fillRectAlpha(5, 5, -10 + this.field_k, this.field_h - 10, 0, 96);
                  EffectAudioHelpers.field_e.drawCenteredAlpha(LocalGameWorld.field_N, this.field_k / 2, 32, 16777215, 0, 128);
                }
              }
            }
          }
        }
        RasterEffectHelpers.popRaster();
    }

    final void setTargetProgress(int param0, int param1) {
        this.field_f = this.field_n + param1;
        if (param0 != 0) {
          this.field_q = -95;
        }
    }

    public PowerupProgressCard() {
        this.field_k = 70;
        this.field_h = 70;
        this.field_p = new Sprite(this.field_k, this.field_h);
    }

    final static void setMenuFrameAndPadding(int param0, int param1, int param2, FramePainter param3) {
        try {
          SecondaryNodeDeque.field_a = param1;
          if (param2 != -8388) {
            Sprite var5 = (Sprite) null;
            PowerupProgressCard.drawHorizontalFadeSprite(97, false, 53, -73, (Sprite) null, -43);
          }
          LoginCredentials.field_g = param0;
          TextPopupHelpers.field_c = param3;
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "cb.H(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_l = false;
        field_g = "RuneScape clan";
        field_r = "Powerups with this modifier will work even on enemy zombies.";
        field_j = new int[]{2, 4};
        field_o = true;
    }
}
