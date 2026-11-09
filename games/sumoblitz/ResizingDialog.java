/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ResizingDialog extends ModalDialog {
    private int targetHeight;
    private int targetWidth;
    private int initialWidth;
    private int resizeTicks;
    static String[] field_F;
    static ToolkitSprite[] field_H;
    static String[] membershipPromoLines;
    private int initialHeight;
    private int resizeDuration;

    boolean finishAnimation(int guard) {
        this.finishResize((byte) -128);
        if (guard != 0) {
          PlatformTaskDispatcher var3 = (PlatformTaskDispatcher) null;
          ResizingDialog.enterFullscreen(true, (PlatformTaskDispatcher) null, -72, -89, 23, -11);
        }
        return super.finishAnimation(0);
    }

    final static ToolkitSprite createSprite(GraphicsToolkit toolkit, SpriteData data, byte guard) {
        RuntimeException var3 = null;
        PlatformTaskDispatcher var4 = null;
        ToolkitSprite stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (guard != -11) {
            var4 = (PlatformTaskDispatcher) null;
            ResizingDialog.enterFullscreen(false, (PlatformTaskDispatcher) null, -97, 35, 94, -35);
          }
          stackIn_3_0 = toolkit.createSprite(data, false);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("hf.FA(");
          if (toolkit == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (data == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(guard).append(')').toString());
        }
    }

    public static void releaseStatics(int param0) {
        if (param0 <= 8) {
          field_H = (ToolkitSprite[]) null;
        }
        field_H = null;
        field_F = null;
        membershipPromoLines = null;
    }

    void drawBackdrop(int guard, int originX, int originY) {
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var4Lifetime1;
        int var4Lifetime2;
        int var5Lifetime1;
        int var5Lifetime2;
        int var6Lifetime1;
        int var6Lifetime2;
        int var7Lifetime1;
        int var7Lifetime2;
        int var8Lifetime1;
        int var8Lifetime2;
        int var9Lifetime1;
        int var9Lifetime2;
        int var12Lifetime1;
        int var13Lifetime1;
        var16 = Sumoblitz.field_L ? 1 : 0;
        if (guard <= 110) {
          return;
        }
        SoftwareRasterizer.fillVerticalGradient(6 + originX, 35 + originY, this.width - 12, -40 + this.height, 2105376, 0);
        var4 = 35;
        var5 = 211;
        var6 = 194;
        var7 = 0;
        var8 = originY;
        while (var7 < var4) {
          if (var8 >= SoftwareRasterizer.clipTop &&
            SoftwareRasterizer.clipBottom > var8) {
            var9 = var5 + (-var5 + var6) * var7 / var4;
            var10 = 0;
            var11 = this.width;
            if (var7 <= 20) {
              while (var10 <= 20) {
                var12 = (20 - var7) * (-var7 + 20) + (20 - var10) * (-var10 + 20);
                if (var12 <= 462) {
                  if (var12 < 420) {
                    break;
                  }
                  var13 = var9 * (-var12 + 462) / 42;
                  var13 = var13 | (var13 << 16 | var13 << 8);
                  SoftwareRasterizer.pixels[originX + (var8 * SoftwareRasterizer.width + var10)] = var13;
                }
                var10++;
              }
            }
            if (var7 <= 20) {
              var12Lifetime1 = var11;
              var11 -= 21;
              for (var13Lifetime1 = 0; var13Lifetime1 <= 20; var13Lifetime1++) {
                var14 = (-var7 + 20) * (-var7 + 20) + var13Lifetime1 * var13Lifetime1;
                if (var14 <= 462) {
                  if (var14 < 420) {
                    var12Lifetime1 = 1 + var11;
                  } else {
                    var15 = var9 * (462 - var14) / 42;
                    var15 = var15 | (var15 << 8 | var15 << 16);
                    SoftwareRasterizer.pixels[originX + var8 * SoftwareRasterizer.width + var11] = var15;
                  }
                  var11++;
                  continue;
                }
                break;
              }
              var11 = var12Lifetime1;
            }
            var9 = var9 | (var9 << 8 | var9 << 16);
            SoftwareRasterizer.drawHorizontalLine(var10 + originX, var8, -var10 + var11, var9);
          }
          var8++;
          var7++;
        }
        var6Lifetime1 = 169;
        var5Lifetime1 = 194;
        var4Lifetime1 = 22;
        var7Lifetime1 = 0;
        var8Lifetime1 = 35 + originY;
        while (var4Lifetime1 > var7Lifetime1) {
          var9Lifetime1 = var5Lifetime1 + (-var5Lifetime1 + var6Lifetime1) * var7Lifetime1 / var4Lifetime1;
          var9Lifetime1 = var9Lifetime1 | (var9Lifetime1 << 16 | var9Lifetime1 << 8);
          SoftwareRasterizer.drawHorizontalLine(originX, var8Lifetime1, 6, var9Lifetime1);
          SoftwareRasterizer.drawHorizontalLine(originX + this.width - 6, var8Lifetime1, 6, var9Lifetime1);
          var7Lifetime1++;
          var8Lifetime1++;
        }
        HotspotTextWidget.field_E.draw(originX + (this.width - 90), 10 + originY);
        MusicCrossfadeStream.drawHorizontalSpriteStrip(35 + originY, this.width - 10, 2, originX + 5, ToolkitImageProducerBuffer.field_v);
        MusicCrossfadeStream.drawHorizontalSpriteStrip(-22 + this.height + originY, this.width, 2, originX, DropDownListWidget.field_O);
        var6Lifetime2 = 127;
        var5Lifetime2 = 169;
        var4Lifetime2 = this.height - 79;
        var7Lifetime2 = 0;
        var8Lifetime2 = originY + 57;
        while (var7Lifetime2 < var4Lifetime2) {
          var9Lifetime2 = var7Lifetime2 * (-var5Lifetime2 + var6Lifetime2) / var4Lifetime2 + var5Lifetime2;
          var9Lifetime2 = var9Lifetime2 | (var9Lifetime2 << 16 | var9Lifetime2 << 8);
          SoftwareRasterizer.drawHorizontalLine(originX, var8Lifetime2, 6, var9Lifetime2);
          SoftwareRasterizer.drawHorizontalLine(-6 + (this.width + originX), var8Lifetime2, 6, var9Lifetime2);
          var8Lifetime2++;
          var7Lifetime2++;
        }
        return;
    }

    void onResizeFinished(int guard) {
        if (guard != 0) {
          this.advanceAnimation(122);
        }
    }

    final static java.awt.Frame enterFullscreen(boolean guard, PlatformTaskDispatcher dispatcher, int refreshRate, int bitDepth, int height, int width) {
        int var8 = 0;
        Object stackIn_8_0 = null;
        Object stackIn_35_0 = null;
        Object stackIn_41_0 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_45_2 = null;
        RuntimeException decompiledCaughtException = null;
        FullscreenDisplayMode[] var6 = null;
        RuntimeException var6_ref = null;
        int var7_int = 0;
        java.awt.Frame var7 = null;
        int var9 = 0;
        FullscreenDisplayMode[] var10 = null;
        PlatformTask var11 = null;
        var9 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (!dispatcher.supportsFullscreen((byte) 125)) {
            return null;
          }
          if (bitDepth == 0) {
            var10 = DisplaySizeController.listFullscreenModes((byte) -73, dispatcher);
            var6 = var10;
            if (var6 == null) {
              stackIn_8_0 = null;
              return (java.awt.Frame) (stackIn_8_0);
            }
            var7_int = 0;
            for (var8 = 0; var8 < var10.length; var8++) {
              if (width == var10[var8].width &&
                var10[var8].height == height && ((refreshRate == 0 ||
                var10[var8].refreshRate == refreshRate) &&
                (var7_int == 0 ||
                !(bitDepth >= var10[var8].bitDepth)))) {
                bitDepth = var10[var8].bitDepth;
                var7_int = 1;
              }
            }
            if (var7_int == 0) {
              return null;
            }
          }
          var11 = dispatcher.enterFullscreen(false, refreshRate, bitDepth, width, height);
          while (0 == var11.status) {
            TextureCombineOperation.sleepMillis(10L, (byte) 118);
          }
          var7 = (java.awt.Frame) (var11.result);
          if (var7 == null) {
            stackIn_35_0 = null;
            return (java.awt.Frame) (stackIn_35_0);
          }
          if (!guard) {
            field_H = (ToolkitSprite[]) null;
          }
          if (var11.status != 2) {
            return var7;
          }
          OpenGlTransparentWaterEffect.exitFullscreen(var7, dispatcher, false);
          stackIn_41_0 = null;
          return (java.awt.Frame) (stackIn_41_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_44_0 = var6_ref;
          stackIn_44_1 = new StringBuilder().append("hf.IA(").append(guard).append(',');
          if (dispatcher == null) {
            stackIn_45_2 = "null";
          } else {
            stackIn_45_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_44_0), ((StringBuilder) (Object) stackIn_44_1).append(stackIn_45_2).append(',').append(refreshRate).append(',').append(bitDepth).append(',').append(height).append(',').append(width).append(')').toString());
        }
    }

    ResizingDialog(DialogLayer layer, int initialWidth, int initialHeight) {
        super(layer, initialWidth, initialHeight);
        this.resizeTicks = 0;
        this.resizeDuration = 0;
    }

    boolean advanceAnimation(int guard) {
        int var2 = 0;
        int var3 = 0;
        int fieldTemp$0 = 0;
        int var4 = 0;
        int var5 = 0;
        if (guard != -28778) {
          this.initialHeight = 52;
        }
        if (0 >= this.resizeDuration) {
        } else {
          var2 = this.targetWidth;
          var3 = this.targetHeight;
          fieldTemp$0 = this.resizeTicks + 1;
          this.resizeTicks = this.resizeTicks + 1;
          if (fieldTemp$0 >= this.resizeDuration) {
            this.resizeDuration = 0;
            this.onResizeFinished(0);
          } else {
            var4 = this.resizeTicks * (2 * this.resizeDuration - this.resizeTicks);
            var5 = this.resizeDuration * this.resizeDuration;
            var2 = this.initialWidth + var4 * (-this.initialWidth + this.targetWidth) / var5;
            var3 = this.initialHeight + var4 * (this.targetHeight - this.initialHeight) / var5;
          }
          this.resizeCentered(var2, var3, 109);
        }
        return super.advanceAnimation(-28778);
    }

    final void animateResize(boolean guard, int newHeight, int duration, int newWidth) {
        if (duration <= 0) {
          this.resizeCentered(newWidth, newHeight, 103);
          return;
        }
        this.initialWidth = this.width;
        this.resizeDuration = duration;
        this.targetHeight = newHeight;
        this.targetWidth = newWidth;
        this.resizeTicks = 0;
        this.initialHeight = this.height;
        if (guard) {
          this.animateResize(false, -70, -124, -36);
        }
    }

    void finishResize(byte guard) {
        if (this.resizeDuration <= 0) {
          return;
        }
        this.resizeCentered(this.targetWidth, this.targetHeight, 45);
        if (guard != -128) {
          this.resizeDuration = 65;
        }
        this.resizeDuration = 0;
        this.onResizeFinished(0);
    }

    static {
        membershipPromoLines = new String[]{"Access the new turrets!", "Challenging levels!", "Diabolical bosses!"};
    }
}
