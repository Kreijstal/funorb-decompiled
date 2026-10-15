/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ProducerFramebuffer extends SoftwareFramebuffer implements java.awt.image.ImageProducer, java.awt.image.ImageObserver {
    static String field_k;
    static String field_h;
    private java.awt.image.ColorModel colorModel;
    static String field_j;
    private java.awt.image.ImageConsumer consumer;

    public final void requestTopDownLeftRightResend(java.awt.image.ImageConsumer param0) {
    }

    public final synchronized void removeConsumer(java.awt.image.ImageConsumer param0) {
        try {
          if (this.consumer == param0) {
            this.consumer = null;
          }
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "jo.removeConsumer(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void b(int param0) {
        field_j = null;
        field_k = null;
        if (param0 != 11) {
          field_k = (String) null;
        }
        field_h = null;
    }

    final void draw(int y, int x, int obfuscationGuard, java.awt.Graphics graphics) {
        try {
          this.publishPixels(0);
          graphics.drawImage(this.image, x, y, (java.awt.image.ImageObserver) (this));
          if (obfuscationGuard != -17260) {
            java.awt.Component var6 = (java.awt.Component) null;
            this.initialize((java.awt.Component) null, 25, false, -96);
          }
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "jo.B(" + y + ',' + x + ',' + obfuscationGuard + ',' + (graphics != null ? "{...}" : "null") + ')');
        }
    }

    final void initialize(java.awt.Component component, int height, boolean obfuscationGuard, int width) {
        this.height = height;
        this.pixels = new int[1 + height * width];
        this.width = width;
        this.colorModel = (java.awt.image.ColorModel) ((Object) new java.awt.image.DirectColorModel(32, 16711680, 65280, 255));
        this.image = component.createImage((java.awt.image.ImageProducer) (this));
        this.publishPixels(0);
        component.prepareImage(this.image, (java.awt.image.ImageObserver) (this));
        this.publishPixels(0);
        component.prepareImage(this.image, (java.awt.image.ImageObserver) (this));
        if (!obfuscationGuard) {
          return;
        }
        try {
          this.publishPixels(0);
          component.prepareImage(this.image, (java.awt.image.ImageObserver) (this));
          this.bindRaster((byte) 100);
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "jo.D(" + (component != null ? "{...}" : "null") + ',' + height + ',' + obfuscationGuard + ',' + width + ')');
        }
    }

    public final synchronized boolean isConsumer(java.awt.image.ImageConsumer param0) {
        return this.consumer == param0;
    }

    public final boolean imageUpdate(java.awt.Image param0, int param1, int param2, int param3, int param4, int param5) {
        RuntimeException var7 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_4_0 = var7;
          stackIn_4_1 = new StringBuilder().append("jo.imageUpdate(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    public final synchronized void addConsumer(java.awt.image.ImageConsumer param0) {
        try {
          this.consumer = param0;
          param0.setDimensions(this.width, this.height);
          param0.setProperties((Hashtable) null);
          param0.setColorModel(this.colorModel);
          param0.setHints(14);
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "jo.addConsumer(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    private final synchronized void publishPixels(int offset) {
        if (this.consumer == null) {
          return;
        }
        this.consumer.setPixels(0, 0, this.width, this.height, this.colorModel, this.pixels, offset, this.width);
        this.consumer.imageComplete(2);
    }

    public final void startProduction(java.awt.image.ImageConsumer param0) {
        try {
          this.addConsumer(param0);
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "jo.startProduction(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, PlayerBoard param1, int param2, MultiplayerMatch param3, int param4, int param5, int param6) {
        int var12 = 0;
        int stackIn_6_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_15_1 = 0;
        RgbSprite stackIn_18_0 = null;
        int stackIn_35_0 = 0;
        int stackIn_35_1 = 0;
        int stackIn_36_2 = 0;
        int stackIn_71_0 = 0;
        RuntimeException stackIn_86_0 = null;
        StringBuilder stackIn_86_1 = null;
        String stackIn_87_2 = null;
        StringBuilder stackIn_89_1 = null;
        String stackIn_90_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        RgbSprite var10 = null;
        int var11 = 0;
        NodeDeque var13 = null;
        Brick var14 = null;
        int var15 = 0;
        RgbSprite var16 = null;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int[] var24 = null;
        var20 = BrickABrac.field_J ? 1 : 0;
        try {
          var7_int = 0;
          if (param5 != 30) {
            ProducerFramebuffer.b(42);
          }
          var8 = 0;
          var24 = new int[4];
          Rasterizer2D.saveClip(var24);
          var10 = new RgbSprite(FireworkBurst.activeBrickSprites[0].canvasWidth, FireworkBurst.activeBrickSprites[0].canvasHeight);
          var10.bindRasterTarget();
          FireworkBurst.activeBrickSprites[24].c(0, 0, ScorePopup.a(255, param1.simulationTick % 360 << 8));
          BallPulseEffect.framebuffer.bindRaster((byte) 105);
          Rasterizer2D.restoreClip(var24);
          stackIn_6_0 = ((1 << param2 & (param3.playerMaskThree | (param3.playerMaskOne | param3.playerMaskTwo))) != 0) ? 0 : 1;
          var11 = stackIn_6_0;
          for (var12 = 0; var12 < param1.brickGroups.length; var12++) {
            var13 = param1.brickGroups[var12];
            var14 = (Brick) (var13.first(-105));
            while (var14 != null) {
              boolean decompiledFrameRemainder0 = true;
              if ((1 & var14.flags) == 0) {
                var8 = param6 + (var14.y256 >> 8) / param0;
                var7_int = (var14.x256 >> 8) / param0 + param4;
                stackIn_14_0 = var14.typeId;
                if ((var14.flags & 2) != 0) {
                  stackIn_15_1 = 29;
                } else {
                  stackIn_15_1 = 0;
                }
                var15 = stackIn_14_0 + stackIn_15_1;
                if (var15 != 24) {
                  stackIn_18_0 = FireworkBurst.activeBrickSprites[var15];
                } else {
                  stackIn_18_0 = var10;
                }
                var16 = stackIn_18_0;
                if (var14.pendingTypeId < 0) {
                  if (param3.playerCount != 1 &&
                    var11 == 0) {
                    if (!(param1.maskedTicks >= 50)) {
                      var16.b(var7_int, var8, (-(256 * param1.maskedTicks) + 12800) / 50);
                    }
                    decompiledFrameRemainder0 = false;
                  }
                  else {
                    var16.drawTransparent(var7_int, var8);
                    if (TextFieldRenderer.field_A &&
                      MusicVoice.a((byte) 89) &&
                      4 == LobbyOverlayHelpers.field_i &&
                      (2 & var14.flags) != 0) {
                      var17 = MembershipBenefitsScreen.clientTick - SpriteGeometry.field_v;
                      var16.f(var7_int, var8, 64 + (InteractiveGameClient.sine8192(200 * var17, param5 ^ -4127) >> 10));
                    }
                  }
                } else {
                  var17 = var14.transitionCode;
                  var18 = -(var14.stateWord * 16) + 256;
                  if (var11 == 0) {
                    var19 = var14.stateWord + param1.maskedTicks;
                    stackIn_35_0 = 256;
                    stackIn_35_1 = 16;
                    if (16 >= var19) {
                      stackIn_36_2 = var19;
                    } else {
                      stackIn_36_2 = 16;
                    }
                    var18 = stackIn_35_0 - stackIn_35_1 * stackIn_36_2;
                  }
                  if (var17 == 12) {
                    var16.drawTransparent(var7_int, var8);
                    Rasterizer2D.setClip(var7_int, var8, var7_int + var16.canvasWidth, var16.canvasHeight + var8);
                    for (var19 = 0; var19 < 10; var19++) {
                      if (var19 <= 5 ||
                        var19 >= 8) {
                        Rasterizer2D.f(var7_int + (var19 + var14.stateWord * 2), var8 + var16.canvasHeight, 10 + var7_int + var19 + 2 * var14.stateWord, var8, 16777215, var18);
                      }
                    }
                  } else {
                    switch (var17) {
                      case 0:
                        var16.b(var7_int, var8, var18);
                        break;
                      case 5:
                        var16.b(var7_int, var8, -var18 + 256);
                        break;
                      case 2:
                        var19 = -(2 * var14.stateWord) + 34;
                        var16.a(var14.stateWord / param0 + var7_int, var8, var19 / param0, var16.canvasHeight);
                        break;
                      case 9:
                        var16.b(var7_int, var8, var16.canvasWidth, var16.canvasHeight, -(var14.stateWord * 4) + 64);
                        Rasterizer2D.setClip(var7_int, var8, var7_int + (var16.canvasWidth - var14.stateWord * 2 / param0), var16.canvasHeight + var8);
                        var16.drawTransparent(var7_int, var8);
                        break;
                      case 4:
                        var19 = 16 - var14.stateWord;
                        var16.a(var7_int, var8 + var14.stateWord / (param0 * 2), 34 / param0, var19 / param0);
                        break;
                      default:
                        Rasterizer2D.restoreClip(var24);
                        var14 = (Brick) (var13.next((byte) 116));
                        continue;
                      case 14:
                        if (2 * var14.stateWord <= 8) {
                          stackIn_71_0 = 2 * var14.stateWord;
                        } else {
                          stackIn_71_0 = 8;
                        }
                        var19 = stackIn_71_0;
                        var19 = var14.stateWord - var19;
                        if (var19 > 0) {
                          var19 = 0;
                        }
                        var16.a(var7_int + var19 / param0, var19 / param0 + var8, var16.canvasWidth - 2 * var19 / param0, -(var19 * 2 / param0) + var16.canvasHeight);
                        break;
                      case 3:
                        Rasterizer2D.setClip(-(var14.stateWord / param0) + var7_int, -(var14.stateWord / param0) + var8, var16.canvasWidth / 2 - var14.stateWord / param0 + var7_int, var16.canvasHeight / 2 + var8 - var14.stateWord / param0);
                        var16.b(-(var14.stateWord / param0) + var7_int, -(var14.stateWord / param0) + var8, var18);
                        Rasterizer2D.setClip(var16.canvasWidth / 2 + var14.stateWord / param0 + var7_int, var8 - var14.stateWord / param0, var14.stateWord / param0 + (var7_int + var16.canvasWidth), -(var14.stateWord / param0) + var8 + var16.canvasHeight / 2);
                        var16.b(var14.stateWord / param0 + var7_int, var8 - var14.stateWord / param0, var18);
                        Rasterizer2D.setClip(-(var14.stateWord / param0) + var7_int, var14.stateWord / param0 + (var8 + var16.canvasHeight / 2), -(var14.stateWord / param0) + var7_int + var16.canvasWidth / 2, var16.canvasHeight + var8 + var14.stateWord / param0);
                        var16.b(var7_int - var14.stateWord / param0, var14.stateWord / param0 + var8, var18);
                        Rasterizer2D.setClip(var16.canvasWidth / 2 + var14.stateWord / param0 + var7_int, var14.stateWord / param0 + var8 + var16.canvasHeight / 2, var7_int + var14.stateWord / param0 + var16.canvasWidth, var8 + var14.stateWord / param0 + var16.canvasHeight);
                        var16.b(var7_int + var14.stateWord / param0, var8 + var14.stateWord / param0, var18);
                        break;
                      case 1:
                        var19 = var14.stateWord - 6;
                        var16.b(var7_int + var19 / param0, var19 / param0 + var8, -(var19 * 2 / param0) + var16.canvasWidth, var16.canvasHeight - var19 * 2 / param0, var18);
                        break;
                      case 8:
                        var16.b(var7_int, var8, var16.canvasWidth, var16.canvasHeight, -(var14.stateWord * 4) + 64);
                        Rasterizer2D.setClip(var7_int + var14.stateWord * 2 / param0, var8, var7_int + var16.canvasWidth, var16.canvasHeight + var8);
                        var16.drawTransparent(var7_int, var8);
                        break;
                      case 7:
                        var16.b(var7_int, var8, var16.canvasWidth, var16.canvasHeight, -(4 * var14.stateWord) + 64);
                        Rasterizer2D.setClip(var7_int, var8, var7_int + var16.canvasWidth, var8 + (var16.canvasHeight - var14.stateWord / param0));
                        var16.drawTransparent(var7_int, var8);
                        break;
                      case 6:
                        var16.b(var7_int, var8, var16.canvasWidth, var16.canvasHeight, -(4 * var14.stateWord) + 64);
                        Rasterizer2D.setClip(var7_int, var14.stateWord / param0 + var8, var16.canvasWidth + var7_int, var8 + var16.canvasHeight);
                        var16.drawTransparent(var7_int, var8);
                        break;
                      case 10:
                        if (var14.stateWord < 8) {
                          var19 = 34 - var14.stateWord * 4;
                          var16.a(var14.stateWord * 2 / param0 + var7_int, var8, var19 / param0, var16.canvasHeight);
                        } else {
                          var19 = -26 + var14.stateWord * 4;
                          FireworkBurst.activeBrickSprites[var14.pendingTypeId].a((-(2 * var14.stateWord) + 30) / param0 + var7_int, var8, var19 / param0, var16.canvasHeight);
                        }
                        break;
                      case 11:
                        FireworkBurst.activeBrickSprites[var14.pendingTypeId].drawTransparent(var7_int, var8);
                        var16.b(var7_int, var8, var18);
                        break;
                    }
                  }
                  Rasterizer2D.restoreClip(var24);
                }
              }
              var14 = (Brick) (var13.next((byte) 116));
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_86_0 = var7;
          stackIn_86_1 = new StringBuilder().append("jo.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_87_2 = "null";
          } else {
            stackIn_87_2 = "{...}";
          }
          stackIn_89_1 = ((StringBuilder) (Object) stackIn_86_1).append(stackIn_87_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_90_2 = "null";
          } else {
            stackIn_90_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_86_0), ((StringBuilder) (Object) stackIn_89_1).append(stackIn_90_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    ProducerFramebuffer() {
    }

    static {
        field_h = "Mouse over an icon for details";
        field_k = "The '<%0>' setting needs to be changed.";
    }
}
