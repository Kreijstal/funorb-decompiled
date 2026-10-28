/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ArgbSprite extends Sprite {
    final void drawScaledAlpha(int x, int y, int targetWidth, int targetHeight, int alpha) {
        if (targetWidth > 0) {
          if (targetHeight <= 0) {
            return;
          }
          int var6 = this.width;
          int var7 = this.height;
          int var8 = 0;
          int var9 = 0;
          int var10 = this.fullWidth;
          int var11 = this.fullHeight;
          int var12 = (var10 << 16) / targetWidth;
          int var13 = (var11 << 16) / targetHeight;
          if (this.offsetX > 0) {
            int var14 = ((this.offsetX << 16) + var12 - 1) / var12;
            x = x + var14;
            var8 = var8 + (var14 * var12 - (this.offsetX << 16));
          }
          if (this.offsetY > 0) {
            int var14Lifetime1 = ((this.offsetY << 16) + var13 - 1) / var13;
            y = y + var14Lifetime1;
            var9 = var9 + (var14Lifetime1 * var13 - (this.offsetY << 16));
          }
          if (var6 < var10) {
            targetWidth = ((var6 << 16) - var8 + var12 - 1) / var12;
          }
          if (var7 < var11) {
            targetHeight = ((var7 << 16) - var9 + var13 - 1) / var13;
          }
          int var14Lifetime2 = x + y * SoftwareRasterizer.width;
          int var15 = SoftwareRasterizer.width - targetWidth;
          if (y + targetHeight > SoftwareRasterizer.clipBottom) {
            targetHeight = targetHeight - (y + targetHeight - SoftwareRasterizer.clipBottom);
          }
          if (y < SoftwareRasterizer.clipTop) {
            int var16 = SoftwareRasterizer.clipTop - y;
            targetHeight = targetHeight - var16;
            var14Lifetime2 = var14Lifetime2 + var16 * SoftwareRasterizer.width;
            var9 = var9 + var13 * var16;
          }
          if (x + targetWidth > SoftwareRasterizer.clipRight) {
            int var16Lifetime1 = x + targetWidth - SoftwareRasterizer.clipRight;
            targetWidth = targetWidth - var16Lifetime1;
            var15 = var15 + var16Lifetime1;
          }
          if (x < SoftwareRasterizer.clipLeft) {
            int var16Lifetime2 = SoftwareRasterizer.clipLeft - x;
            targetWidth = targetWidth - var16Lifetime2;
            var14Lifetime2 = var14Lifetime2 + var16Lifetime2;
            var8 = var8 + var12 * var16Lifetime2;
            var15 = var15 + var16Lifetime2;
          }
          ArgbSprite.blitArgbScaledAlpha(SoftwareRasterizer.pixels, this.pixels, 0, var8, var9, var14Lifetime2, var15, targetWidth, targetHeight, var12, var13, var6, alpha);
          return;
        }
    }

    final void drawHalfSize(int x, int y) {
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_21_2 = 0;
        int var3 = this.width >> 1;
        int var4 = this.height >> 1;
        x = x + this.offsetX / 2;
        y = y + this.offsetY / 2;
        if (x >= SoftwareRasterizer.clipLeft) {
          stackIn_3_0 = 0;
        } else {
          stackIn_3_0 = SoftwareRasterizer.clipLeft - x << 1;
        }
        int var5 = stackIn_3_0;
        if (x + var3 <= SoftwareRasterizer.clipRight) {
          stackIn_6_0 = this.width - 2;
        } else {
          stackIn_6_0 = (SoftwareRasterizer.clipRight - x << 1) - 2;
        }
        int var6 = stackIn_6_0;
        if (y >= SoftwareRasterizer.clipTop) {
          stackIn_9_0 = 0;
        } else {
          stackIn_9_0 = SoftwareRasterizer.clipTop - y << 1;
        }
        int var7 = stackIn_9_0;
        if (y + var4 <= SoftwareRasterizer.clipBottom) {
          stackIn_12_0 = this.height - 2;
        } else {
          stackIn_12_0 = (SoftwareRasterizer.clipBottom - y << 1) - 2;
        }
        int var8 = stackIn_12_0;
        for (int var9 = var7; var9 <= var8; var9 += 2) {
          int var10 = var9 * this.width + var5;
          int var11 = (y + (var9 >> 1)) * SoftwareRasterizer.width + (x + (var5 >> 1));
          int var12 = var5;
          while (var12 <= var6) {
            int var13 = 0;
            int var14 = 0;
            int var15 = 0;
            int var16 = 0;
            int var17 = 0;
            int var18 = 0;
            for (int var19 = 0; var19 < 4; var19++) {
              int[] stackIn_20_0 = this.pixels;
              int stackIn_20_1 = var10 + (var19 & 1);
              if ((var19 & 2) != 0) {
                stackIn_21_2 = 0;
              } else {
                stackIn_21_2 = this.width;
              }
              int var13Lifetime1 = stackIn_20_0[stackIn_20_1 + stackIn_21_2];
              int var14Lifetime1 = var13Lifetime1 >>> 24;
              var18 = var18 + var14Lifetime1;
              var15 = var15 + var14Lifetime1 * (var13Lifetime1 >> 16 & 255);
              var16 = var16 + var14Lifetime1 * (var13Lifetime1 >> 8 & 255);
              var17 = var17 + var14Lifetime1 * (var13Lifetime1 & 255);
            }
            if (var18 != 0) {
              var15 = (var15 / var18 << 16) + var17 / var18;
              var16 = var16 / var18 << 8;
              int var19Lifetime1 = var18 >> 2;
              int var20 = 256 - var19Lifetime1;
              int var21 = SoftwareRasterizer.pixels[var11];
              SoftwareRasterizer.pixels[var11] = (var19Lifetime1 * var15 + var20 * (var21 & 16711935) & -16711936) + (var19Lifetime1 * var16 + var20 * (var21 & 65280) & 16711680) >>> 8;
            }
            var12 += 2;
            var11++;
            var10 += 2;
          }
        }
    }

    final void drawOpaque(int x, int y) {
        x = x + this.offsetX;
        y = y + this.offsetY;
        int var3 = x + y * SoftwareRasterizer.width;
        int var4 = 0;
        int var5 = this.height;
        int var6 = this.width;
        int var7 = SoftwareRasterizer.width - var6;
        int var8 = 0;
        if (y < SoftwareRasterizer.clipTop) {
          int var9 = SoftwareRasterizer.clipTop - y;
          var5 = var5 - var9;
          y = SoftwareRasterizer.clipTop;
          var4 = var4 + var9 * var6;
          var3 = var3 + var9 * SoftwareRasterizer.width;
        }
        if (y + var5 > SoftwareRasterizer.clipBottom) {
          var5 = var5 - (y + var5 - SoftwareRasterizer.clipBottom);
        }
        if (x < SoftwareRasterizer.clipLeft) {
          int var9Lifetime1 = SoftwareRasterizer.clipLeft - x;
          var6 = var6 - var9Lifetime1;
          x = SoftwareRasterizer.clipLeft;
          var4 = var4 + var9Lifetime1;
          var3 = var3 + var9Lifetime1;
          var8 = var8 + var9Lifetime1;
          var7 = var7 + var9Lifetime1;
        }
        if (x + var6 > SoftwareRasterizer.clipRight) {
          int var9Lifetime2 = x + var6 - SoftwareRasterizer.clipRight;
          var6 = var6 - var9Lifetime2;
          var8 = var8 + var9Lifetime2;
          var7 = var7 + var9Lifetime2;
        }
        if (var6 > 0) {
          if (var5 <= 0) {
            return;
          }
          ArgbSprite.blitArgb(SoftwareRasterizer.pixels, this.pixels, 0, var4, var3, var6, var5, var7, var8);
          return;
        }
    }

    ArgbSprite(int param0, int param1) {
        super(param0, param1);
    }

    final void drawScaled(int x, int y, int targetWidth, int targetHeight) {
        if (targetWidth > 0) {
          if (targetHeight <= 0) {
            return;
          }
          int var5 = this.width;
          int var6 = this.height;
          int var7 = 0;
          int var8 = 0;
          int var9 = this.fullWidth;
          int var10 = this.fullHeight;
          int var11 = (var9 << 16) / targetWidth;
          int var12 = (var10 << 16) / targetHeight;
          if (this.offsetX > 0) {
            int var13 = ((this.offsetX << 16) + var11 - 1) / var11;
            x = x + var13;
            var7 = var7 + (var13 * var11 - (this.offsetX << 16));
          }
          if (this.offsetY > 0) {
            int var13Lifetime1 = ((this.offsetY << 16) + var12 - 1) / var12;
            y = y + var13Lifetime1;
            var8 = var8 + (var13Lifetime1 * var12 - (this.offsetY << 16));
          }
          if (var5 < var9) {
            targetWidth = ((var5 << 16) - var7 + var11 - 1) / var11;
          }
          if (var6 < var10) {
            targetHeight = ((var6 << 16) - var8 + var12 - 1) / var12;
          }
          int var13Lifetime2 = x + y * SoftwareRasterizer.width;
          int var14 = SoftwareRasterizer.width - targetWidth;
          if (y + targetHeight > SoftwareRasterizer.clipBottom) {
            targetHeight = targetHeight - (y + targetHeight - SoftwareRasterizer.clipBottom);
          }
          if (y < SoftwareRasterizer.clipTop) {
            int var15 = SoftwareRasterizer.clipTop - y;
            targetHeight = targetHeight - var15;
            var13Lifetime2 = var13Lifetime2 + var15 * SoftwareRasterizer.width;
            var8 = var8 + var12 * var15;
          }
          if (x + targetWidth > SoftwareRasterizer.clipRight) {
            int var15Lifetime1 = x + targetWidth - SoftwareRasterizer.clipRight;
            targetWidth = targetWidth - var15Lifetime1;
            var14 = var14 + var15Lifetime1;
          }
          if (x < SoftwareRasterizer.clipLeft) {
            int var15Lifetime2 = SoftwareRasterizer.clipLeft - x;
            targetWidth = targetWidth - var15Lifetime2;
            var13Lifetime2 = var13Lifetime2 + var15Lifetime2;
            var7 = var7 + var11 * var15Lifetime2;
            var14 = var14 + var15Lifetime2;
          }
          ArgbSprite.blitArgbScaled(SoftwareRasterizer.pixels, this.pixels, 0, var7, var8, var13Lifetime2, var14, targetWidth, targetHeight, var11, var12, var5);
          return;
        }
    }

    final void drawWithBrightness(int x, int y, int brightness) {
        if (brightness == 256) {
          this.drawTransparent(x, y);
          return;
        }
        x = x + this.offsetX;
        y = y + this.offsetY;
        int var4 = x + y * SoftwareRasterizer.width;
        int var5 = 0;
        int var6 = this.height;
        int var7 = this.width;
        int var8 = SoftwareRasterizer.width - var7;
        int var9 = 0;
        if (y < SoftwareRasterizer.clipTop) {
          int var10 = SoftwareRasterizer.clipTop - y;
          var6 = var6 - var10;
          y = SoftwareRasterizer.clipTop;
          var5 = var5 + var10 * var7;
          var4 = var4 + var10 * SoftwareRasterizer.width;
        }
        if (y + var6 > SoftwareRasterizer.clipBottom) {
          var6 = var6 - (y + var6 - SoftwareRasterizer.clipBottom);
        }
        if (x < SoftwareRasterizer.clipLeft) {
          int var10Lifetime1 = SoftwareRasterizer.clipLeft - x;
          var7 = var7 - var10Lifetime1;
          x = SoftwareRasterizer.clipLeft;
          var5 = var5 + var10Lifetime1;
          var4 = var4 + var10Lifetime1;
          var9 = var9 + var10Lifetime1;
          var8 = var8 + var10Lifetime1;
        }
        if (x + var7 > SoftwareRasterizer.clipRight) {
          int var10Lifetime2 = x + var7 - SoftwareRasterizer.clipRight;
          var7 = var7 - var10Lifetime2;
          var9 = var9 + var10Lifetime2;
          var8 = var8 + var10Lifetime2;
        }
        if (var7 > 0) {
          if (var6 <= 0) {
            return;
          }
          ArgbSprite.blitArgbBrightness(SoftwareRasterizer.pixels, this.pixels, 0, var5, var4, var7, var6, var8, var9, brightness);
          return;
        }
    }

    final void drawAdditive(int x, int y, int intensity) {
        x = x + this.offsetX;
        y = y + this.offsetY;
        int var4 = x + y * SoftwareRasterizer.width;
        int var5 = 0;
        int var6 = this.height;
        int var7 = this.width;
        int var8 = SoftwareRasterizer.width - var7;
        int var9 = 0;
        if (y < SoftwareRasterizer.clipTop) {
          int var10 = SoftwareRasterizer.clipTop - y;
          var6 = var6 - var10;
          y = SoftwareRasterizer.clipTop;
          var5 = var5 + var10 * var7;
          var4 = var4 + var10 * SoftwareRasterizer.width;
        }
        if (y + var6 > SoftwareRasterizer.clipBottom) {
          var6 = var6 - (y + var6 - SoftwareRasterizer.clipBottom);
        }
        if (x < SoftwareRasterizer.clipLeft) {
          int var10Lifetime1 = SoftwareRasterizer.clipLeft - x;
          var7 = var7 - var10Lifetime1;
          x = SoftwareRasterizer.clipLeft;
          var5 = var5 + var10Lifetime1;
          var4 = var4 + var10Lifetime1;
          var9 = var9 + var10Lifetime1;
          var8 = var8 + var10Lifetime1;
        }
        if (x + var7 > SoftwareRasterizer.clipRight) {
          int var10Lifetime2 = x + var7 - SoftwareRasterizer.clipRight;
          var7 = var7 - var10Lifetime2;
          var9 = var9 + var10Lifetime2;
          var8 = var8 + var10Lifetime2;
        }
        if (var7 > 0) {
          if (var6 <= 0) {
            return;
          }
          ArgbSprite.blitArgbAdditive(0, 0, 0, SoftwareRasterizer.pixels, this.pixels, var5, 0, var4, 0, var7, var6, var8, var9, intensity);
          return;
        }
    }

    private final static void blitArgbTinted(int[] destination, int[] source, int sourceColor, int sourceIndex, int destinationIndex, int column, int row, int rowWidth, int rowCount, int destinationRowSkip, int sourceRowSkip, int tint) {
        int var15Lifetime1;
        int var12 = tint & 16711935;
        int var13 = tint >> 8 & 255;
        for (row = -rowCount; row < 0; row++) {
          for (column = -rowWidth; column < 0; column++) {
            sourceColor = source[sourceIndex++];
            int var14 = sourceColor >>> 24;
            sourceColor = sourceColor & 16777215;
            if (var14 == 0) {
              destinationIndex++;
            } else {
              int var15 = 0;
              if (sourceColor >> 8 != (sourceColor & 65535)) {
                var15Lifetime1 = sourceColor;
              } else {
                sourceColor = sourceColor & 255;
                var15Lifetime1 = (sourceColor * var12 >> 8 & 16711934) + (sourceColor * var13 & 65280) + 1;
              }
              int var16 = 256 - var14;
              int var17 = destination[destinationIndex];
              int incrementValue$1 = destinationIndex;
              destinationIndex++;
              destination[incrementValue$1] = ((var15Lifetime1 & 16711935) * var14 + (var17 & 16711935) * var16 & -16711936) + ((var15Lifetime1 & 65280) * var14 + (var17 & 65280) * var16 & 16711680) >>> 8;
            }
          }
          destinationIndex = destinationIndex + destinationRowSkip;
          sourceIndex = sourceIndex + sourceRowSkip;
        }
    }

    private final static void blitArgbMirrored(int[] destination, int[] source, int sourceColor, int sourceIndex, int destinationIndex, int rowWidth, int rowCount, int destinationRowSkip, int sourceRowSkip) {
        int var9 = -rowWidth;
        for (int var10 = -rowCount; var10 < 0; var10++) {
          for (int var11 = var9; var11 < 0; var11++) {
            sourceColor = source[sourceIndex--];
            int var12 = sourceColor >>> 24;
            if (var12 == 0) {
              destinationIndex++;
            } else {
              int var13 = 256 - var12;
              int var14 = destination[destinationIndex];
              int incrementValue$12 = destinationIndex;
              destinationIndex++;
              destination[incrementValue$12] = ((sourceColor & 16711935) * var12 + (var14 & 16711935) * var13 & -16711936) + ((sourceColor & 65280) * var12 + (var14 & 65280) * var13 & 16711680) >>> 8;
            }
          }
          destinationIndex = destinationIndex + destinationRowSkip;
          sourceIndex = sourceIndex + sourceRowSkip;
        }
    }

    final void drawTinted(int x, int y, int tint) {
        x = x + this.offsetX;
        y = y + this.offsetY;
        int var4 = x + y * SoftwareRasterizer.width;
        int var5 = 0;
        int var6 = this.height;
        int var7 = this.width;
        int var8 = SoftwareRasterizer.width - var7;
        int var9 = 0;
        if (y < SoftwareRasterizer.clipTop) {
          int var10 = SoftwareRasterizer.clipTop - y;
          var6 = var6 - var10;
          y = SoftwareRasterizer.clipTop;
          var5 = var5 + var10 * var7;
          var4 = var4 + var10 * SoftwareRasterizer.width;
        }
        if (y + var6 > SoftwareRasterizer.clipBottom) {
          var6 = var6 - (y + var6 - SoftwareRasterizer.clipBottom);
        }
        if (x < SoftwareRasterizer.clipLeft) {
          int var10Lifetime1 = SoftwareRasterizer.clipLeft - x;
          var7 = var7 - var10Lifetime1;
          x = SoftwareRasterizer.clipLeft;
          var5 = var5 + var10Lifetime1;
          var4 = var4 + var10Lifetime1;
          var9 = var9 + var10Lifetime1;
          var8 = var8 + var10Lifetime1;
        }
        if (x + var7 > SoftwareRasterizer.clipRight) {
          int var10Lifetime2 = x + var7 - SoftwareRasterizer.clipRight;
          var7 = var7 - var10Lifetime2;
          var9 = var9 + var10Lifetime2;
          var8 = var8 + var10Lifetime2;
        }
        if (var7 > 0) {
          if (var6 <= 0) {
            return;
          }
          ArgbSprite.blitArgbTinted(SoftwareRasterizer.pixels, this.pixels, 0, var5, var4, 0, 0, var7, var6, var8, var9, tint);
          return;
        }
    }

    private final static void blitArgb(int[] destination, int[] source, int sourceColor, int sourceIndex, int destinationIndex, int rowWidth, int rowCount, int destinationRowSkip, int sourceRowSkip) {
        int var9 = -rowWidth;
        for (int var10 = -rowCount; var10 < 0; var10++) {
          for (int var11 = var9; var11 < 0; var11++) {
            sourceColor = source[sourceIndex++];
            int var12 = sourceColor >>> 24;
            if (var12 == 0) {
              destinationIndex++;
            } else {
              int var13 = 256 - var12;
              int var14 = destination[destinationIndex];
              int incrementValue$12 = destinationIndex;
              destinationIndex++;
              destination[incrementValue$12] = ((sourceColor & 16711935) * var12 + (var14 & 16711935) * var13 & -16711936) + ((sourceColor & 65280) * var12 + (var14 & 65280) * var13 & 16711680) >>> 8;
            }
          }
          destinationIndex = destinationIndex + destinationRowSkip;
          sourceIndex = sourceIndex + sourceRowSkip;
        }
    }

    final void drawMirrored(int x, int y) {
        x = x + (this.fullWidth - this.width - this.offsetX);
        y = y + this.offsetY;
        int var3 = x + y * SoftwareRasterizer.width;
        int var4 = this.width - 1;
        int var5 = this.height;
        int var6 = this.width;
        int var7 = SoftwareRasterizer.width - var6;
        int var8 = var6 + var6;
        if (y < SoftwareRasterizer.clipTop) {
          int var9 = SoftwareRasterizer.clipTop - y;
          var5 = var5 - var9;
          y = SoftwareRasterizer.clipTop;
          var4 = var4 + var9 * var6;
          var3 = var3 + var9 * SoftwareRasterizer.width;
        }
        if (y + var5 > SoftwareRasterizer.clipBottom) {
          var5 = var5 - (y + var5 - SoftwareRasterizer.clipBottom);
        }
        if (x < SoftwareRasterizer.clipLeft) {
          int var9Lifetime1 = SoftwareRasterizer.clipLeft - x;
          var6 = var6 - var9Lifetime1;
          x = SoftwareRasterizer.clipLeft;
          var4 = var4 - var9Lifetime1;
          var3 = var3 + var9Lifetime1;
          var8 = var8 - var9Lifetime1;
          var7 = var7 + var9Lifetime1;
        }
        if (x + var6 > SoftwareRasterizer.clipRight) {
          int var9Lifetime2 = x + var6 - SoftwareRasterizer.clipRight;
          var6 = var6 - var9Lifetime2;
          var8 = var8 - var9Lifetime2;
          var7 = var7 + var9Lifetime2;
        }
        if (var6 > 0) {
          if (var5 <= 0) {
            return;
          }
          ArgbSprite.blitArgbMirrored(SoftwareRasterizer.pixels, this.pixels, 0, var4, var3, var6, var5, var7, var8);
          return;
        }
    }

    private final static void blitArgbScaledAlpha(int[] destination, int[] source, int sourceColor, int sourceXQ16, int sourceYQ16, int destinationIndex, int destinationRowSkip, int rowWidth, int rowCount, int stepXQ16, int stepYQ16, int sourceWidth, int alpha) {
        int var13 = sourceXQ16;
        for (int var14 = -rowCount; var14 < 0; var14++) {
          int var15 = (sourceYQ16 >> 16) * sourceWidth;
          for (int var16 = -rowWidth; var16 < 0; var16++) {
            int var17 = source[(sourceXQ16 >> 16) + var15];
            int var18 = destination[destinationIndex];
            int var19 = (var17 >>> 24) * alpha >> 8;
            int var20 = 256 - var19;
            int incrementValue$0 = destinationIndex;
            destinationIndex++;
            destination[incrementValue$0] = ((var17 & 16711935) * var19 + (var18 & 16711935) * var20 & -16711936) + ((var17 & 65280) * var19 + (var18 & 65280) * var20 & 16711680) >>> 8;
            sourceXQ16 = sourceXQ16 + stepXQ16;
          }
          sourceYQ16 = sourceYQ16 + stepYQ16;
          sourceXQ16 = var13;
          destinationIndex = destinationIndex + destinationRowSkip;
        }
    }

    final void drawTransparent(int x, int y) {
        x = x + this.offsetX;
        y = y + this.offsetY;
        int var3 = x + y * SoftwareRasterizer.width;
        int var4 = 0;
        int var5 = this.height;
        int var6 = this.width;
        int var7 = SoftwareRasterizer.width - var6;
        int var8 = 0;
        if (y < SoftwareRasterizer.clipTop) {
          int var9 = SoftwareRasterizer.clipTop - y;
          var5 = var5 - var9;
          y = SoftwareRasterizer.clipTop;
          var4 = var4 + var9 * var6;
          var3 = var3 + var9 * SoftwareRasterizer.width;
        }
        if (y + var5 > SoftwareRasterizer.clipBottom) {
          var5 = var5 - (y + var5 - SoftwareRasterizer.clipBottom);
        }
        if (x < SoftwareRasterizer.clipLeft) {
          int var9Lifetime1 = SoftwareRasterizer.clipLeft - x;
          var6 = var6 - var9Lifetime1;
          x = SoftwareRasterizer.clipLeft;
          var4 = var4 + var9Lifetime1;
          var3 = var3 + var9Lifetime1;
          var8 = var8 + var9Lifetime1;
          var7 = var7 + var9Lifetime1;
        }
        if (x + var6 > SoftwareRasterizer.clipRight) {
          int var9Lifetime2 = x + var6 - SoftwareRasterizer.clipRight;
          var6 = var6 - var9Lifetime2;
          var8 = var8 + var9Lifetime2;
          var7 = var7 + var9Lifetime2;
        }
        if (var6 > 0) {
          if (var5 <= 0) {
            return;
          }
          ArgbSprite.blitArgb(SoftwareRasterizer.pixels, this.pixels, 0, var4, var3, var6, var5, var7, var8);
          return;
        }
    }

    private final static void blitArgbAlpha(int[] destination, int[] source, int sourceColor, int sourceIndex, int destinationIndex, int rowWidth, int rowCount, int destinationRowSkip, int sourceRowSkip, int alpha) {
        for (int var10 = -rowCount; var10 < 0; var10++) {
          for (int var11 = -rowWidth; var11 < 0; var11++) {
            int var12 = (source[sourceIndex] >>> 24) * alpha >> 8;
            int var13 = 256 - var12;
            int var14 = source[sourceIndex++];
            int var15 = destination[destinationIndex];
            int incrementValue$1 = destinationIndex;
            destinationIndex++;
            destination[incrementValue$1] = ((var14 & 16711935) * var12 + (var15 & 16711935) * var13 & -16711936) + ((var14 & 65280) * var12 + (var15 & 65280) * var13 & 16711680) >>> 8;
          }
          destinationIndex = destinationIndex + destinationRowSkip;
          sourceIndex = sourceIndex + sourceRowSkip;
        }
    }

    private final static void blitArgbScaled(int[] destination, int[] source, int sourceColor, int sourceXQ16, int sourceYQ16, int destinationIndex, int destinationRowSkip, int rowWidth, int rowCount, int stepXQ16, int stepYQ16, int sourceWidth) {
        int var12 = sourceXQ16;
        for (int var13 = -rowCount; var13 < 0; var13++) {
          int var14 = (sourceYQ16 >> 16) * sourceWidth;
          for (int var15 = -rowWidth; var15 < 0; var15++) {
            sourceColor = source[(sourceXQ16 >> 16) + var14];
            int var16 = sourceColor >>> 24;
            if (var16 != 0) {
              int var17 = 256 - var16;
              int var18 = destination[destinationIndex];
              int incrementValue$0 = destinationIndex;
              destinationIndex++;
              destination[incrementValue$0] = ((sourceColor & 16711935) * var16 + (var18 & 16711935) * var17 & -16711936) + ((sourceColor & 65280) * var16 + (var18 & 65280) * var17 & 16711680) >>> 8;
            } else {
              destinationIndex++;
            }
            sourceXQ16 = sourceXQ16 + stepXQ16;
          }
          sourceYQ16 = sourceYQ16 + stepYQ16;
          sourceXQ16 = var12;
          destinationIndex = destinationIndex + destinationRowSkip;
        }
    }

    private final static void blitArgbBrightness(int[] destination, int[] source, int sourceColor, int sourceIndex, int destinationIndex, int rowWidth, int rowCount, int destinationRowSkip, int sourceRowSkip, int brightness) {
        for (int var10 = -rowCount; var10 < 0; var10++) {
          for (int var11 = -rowWidth; var11 < 0; var11++) {
            sourceColor = source[sourceIndex++];
            int var12 = sourceColor >>> 24;
            if (var12 == 0) {
              destinationIndex++;
            } else {
              int var13 = destination[destinationIndex];
              int var14 = 256 - var12;
              int var15 = (sourceColor & 16711935) * brightness & -16711936;
              int var16 = (sourceColor & 65280) * brightness & 16711680;
              sourceColor = (var15 | var16) >>> 8;
              int incrementValue$12 = destinationIndex;
              destinationIndex++;
              destination[incrementValue$12] = ((sourceColor & 16711935) * var12 + (var13 & 16711935) * var14 & -16711936) + ((sourceColor & 65280) * var12 + (var13 & 65280) * var14 & 16711680) >>> 8;
            }
          }
          destinationIndex = destinationIndex + destinationRowSkip;
          sourceIndex = sourceIndex + sourceRowSkip;
        }
    }

    final void drawRotatedScaled(int pivotXQ4, int pivotYQ4, int destinationXQ4, int destinationYQ4, int angle65536, int scaleQ12) {
        int var19;
        int var20;
        int var21;
        int var22;
        if (scaleQ12 == 0) {
          return;
        }
        pivotXQ4 = pivotXQ4 - (this.offsetX << 4);
        pivotYQ4 = pivotYQ4 - (this.offsetY << 4);
        double var7 = (double)(angle65536 & 65535) * 0.00009587379924285257;
        int var9 = (int)Math.floor(Math.sin(var7) * (double)scaleQ12 + 0.5);
        int var10 = (int)Math.floor(Math.cos(var7) * (double)scaleQ12 + 0.5);
        int var11 = -pivotXQ4 * var10 + -pivotYQ4 * var9;
        int var12 = -(-pivotXQ4) * var9 + -pivotYQ4 * var10;
        int var13 = ((this.width << 4) - pivotXQ4) * var10 + -pivotYQ4 * var9;
        int var14 = -((this.width << 4) - pivotXQ4) * var9 + -pivotYQ4 * var10;
        int var15 = -pivotXQ4 * var10 + ((this.height << 4) - pivotYQ4) * var9;
        int var16 = -(-pivotXQ4) * var9 + ((this.height << 4) - pivotYQ4) * var10;
        int var17 = ((this.width << 4) - pivotXQ4) * var10 + ((this.height << 4) - pivotYQ4) * var9;
        int var18 = -((this.width << 4) - pivotXQ4) * var9 + ((this.height << 4) - pivotYQ4) * var10;
        if (var11 >= var13) {
          var19 = var13;
          var20 = var11;
        } else {
          var19 = var11;
          var20 = var13;
        }
        if (var15 < var19) {
          var19 = var15;
        }
        if (var17 < var19) {
          var19 = var17;
        }
        if (var15 > var20) {
          var20 = var15;
        }
        if (var17 > var20) {
          var20 = var17;
        }
        if (var12 >= var14) {
          var21 = var14;
          var22 = var12;
        } else {
          var21 = var12;
          var22 = var14;
        }
        if (var16 < var21) {
          var21 = var16;
        }
        if (var18 < var21) {
          var21 = var18;
        }
        if (var16 > var22) {
          var22 = var16;
        }
        if (var18 > var22) {
          var22 = var18;
        }
        var19 = var19 >> 12;
        var20 = var20 + 4095 >> 12;
        var21 = var21 >> 12;
        var22 = var22 + 4095 >> 12;
        var19 = var19 + destinationXQ4;
        var20 = var20 + destinationXQ4;
        var21 = var21 + destinationYQ4;
        var22 = var22 + destinationYQ4;
        var19 = var19 >> 4;
        var20 = var20 + 15 >> 4;
        var21 = var21 >> 4;
        var22 = var22 + 15 >> 4;
        if (var19 < SoftwareRasterizer.clipLeft) {
          var19 = SoftwareRasterizer.clipLeft;
        }
        if (var20 > SoftwareRasterizer.clipRight) {
          var20 = SoftwareRasterizer.clipRight;
        }
        if (var21 < SoftwareRasterizer.clipTop) {
          var21 = SoftwareRasterizer.clipTop;
        }
        if (var22 > SoftwareRasterizer.clipBottom) {
          var22 = SoftwareRasterizer.clipBottom;
        }
        var20 = var19 - var20;
        if (var20 >= 0) {
          return;
        }
        var22 = var21 - var22;
        if (var22 >= 0) {
          return;
        }
        int var23 = var21 * SoftwareRasterizer.width + var19;
        double var24 = 16777216.0 / (double)scaleQ12;
        int var26 = (int)Math.floor(Math.sin(var7) * var24 + 0.5);
        int var27 = (int)Math.floor(Math.cos(var7) * var24 + 0.5);
        int var28 = (var19 << 4) + 8 - destinationXQ4;
        int var29 = (var21 << 4) + 8 - destinationYQ4;
        int var30 = (pivotXQ4 << 8) - (var29 * var26 >> 4);
        int var31 = (pivotYQ4 << 8) + (var29 * var27 >> 4);
        if (var27 == 0) {
          if (var26 == 0) {
            int var33 = var22;
            while (var33 < 0) {
              int var34 = var23;
              int var35 = var30;
              int var36 = var31;
              int var37 = var20;
              if (var35 >= 0 &&
                var36 >= 0 &&
                var35 - (this.width << 12) < 0 &&
                var36 - (this.height << 12) < 0) {
                while (var37 < 0) {
                  int var38 = this.pixels[(var36 >> 12) * this.width + (var35 >> 12)];
                  int var39 = SoftwareRasterizer.pixels[var34];
                  int var40 = var38 >>> 24;
                  int var41 = 256 - var40;
                  int incrementValue$8 = var34;
                  var34++;
                  SoftwareRasterizer.pixels[incrementValue$8] = ((var38 & 16711935) * var40 + (var39 & 16711935) * var41 & -16711936) + ((var38 & 65280) * var40 + (var39 & 65280) * var41 & 16711680) >>> 8;
                  var37++;
                }
              }
              var33++;
              var23 = var23 + SoftwareRasterizer.width;
            }
            return;
          }
          if (var26 >= 0) {
            int var33Lifetime5 = var22;
            while (var33Lifetime5 < 0) {
              int var34Lifetime5 = var23;
              int var35Lifetime5 = var30;
              int var36Lifetime5 = var31 + (var28 * var26 >> 4);
              int var37Lifetime5 = var20;
              if (var35Lifetime5 >= 0 &&
                var35Lifetime5 - (this.width << 12) < 0) {
                if (var36Lifetime5 < 0) {
                  int var32 = (var26 - 1 - var36Lifetime5) / var26;
                  var37Lifetime5 = var37Lifetime5 + var32;
                  var36Lifetime5 = var36Lifetime5 + var26 * var32;
                  var34Lifetime5 = var34Lifetime5 + var32;
                }
                int var32Lifetime6 = (1 + var36Lifetime5 - (this.height << 12) - var26) / var26;
                if ((1 + var36Lifetime5 - (this.height << 12) - var26) / var26 > var37Lifetime5) {
                  var37Lifetime5 = var32Lifetime6;
                }
                while (var37Lifetime5 < 0) {
                  int var38Lifetime5 = this.pixels[(var36Lifetime5 >> 12) * this.width + (var35Lifetime5 >> 12)];
                  int var39Lifetime5 = SoftwareRasterizer.pixels[var34Lifetime5];
                  int var40Lifetime5 = var38Lifetime5 >>> 24;
                  int var41Lifetime5 = 256 - var40Lifetime5;
                  int incrementValue$6 = var34Lifetime5;
                  var34Lifetime5++;
                  SoftwareRasterizer.pixels[incrementValue$6] = ((var38Lifetime5 & 16711935) * var40Lifetime5 + (var39Lifetime5 & 16711935) * var41Lifetime5 & -16711936) + ((var38Lifetime5 & 65280) * var40Lifetime5 + (var39Lifetime5 & 65280) * var41Lifetime5 & 16711680) >>> 8;
                  var36Lifetime5 = var36Lifetime5 + var26;
                  var37Lifetime5++;
                }
              }
              var33Lifetime5++;
              var30 = var30 - var26;
              var23 = var23 + SoftwareRasterizer.width;
            }
            return;
          }
          int var33Lifetime6 = var22;
          while (var33Lifetime6 < 0) {
            int var34Lifetime6 = var23;
            int var35Lifetime6 = var30;
            int var36Lifetime6 = var31 + (var28 * var26 >> 4);
            int var37Lifetime6 = var20;
            if (var35Lifetime6 >= 0 &&
              var35Lifetime6 - (this.width << 12) < 0) {
              int var32Lifetime5 = var36Lifetime6 - (this.height << 12);
              if (var36Lifetime6 - (this.height << 12) >= 0) {
                var32Lifetime5 = (var26 - var32Lifetime5) / var26;
                var37Lifetime6 = var37Lifetime6 + var32Lifetime5;
                var36Lifetime6 = var36Lifetime6 + var26 * var32Lifetime5;
                var34Lifetime6 = var34Lifetime6 + var32Lifetime5;
              }
              int var32Lifetime5Lifetime1 = (var36Lifetime6 - var26) / var26;
              if ((var36Lifetime6 - var26) / var26 > var37Lifetime6) {
                var37Lifetime6 = var32Lifetime5Lifetime1;
              }
              while (var37Lifetime6 < 0) {
                int var38Lifetime6 = this.pixels[(var36Lifetime6 >> 12) * this.width + (var35Lifetime6 >> 12)];
                int var39Lifetime6 = SoftwareRasterizer.pixels[var34Lifetime6];
                int var40Lifetime6 = var38Lifetime6 >>> 24;
                int var41Lifetime6 = 256 - var40Lifetime6;
                int incrementValue$7 = var34Lifetime6;
                var34Lifetime6++;
                SoftwareRasterizer.pixels[incrementValue$7] = ((var38Lifetime6 & 16711935) * var40Lifetime6 + (var39Lifetime6 & 16711935) * var41Lifetime6 & -16711936) + ((var38Lifetime6 & 65280) * var40Lifetime6 + (var39Lifetime6 & 65280) * var41Lifetime6 & 16711680) >>> 8;
                var36Lifetime6 = var36Lifetime6 + var26;
                var37Lifetime6++;
              }
            }
            var33Lifetime6++;
            var30 = var30 - var26;
            var23 = var23 + SoftwareRasterizer.width;
          }
          return;
        }
        if (var27 >= 0) {
          if (var26 == 0) {
            int var33Lifetime1 = var22;
            while (var33Lifetime1 < 0) {
              int var34Lifetime1 = var23;
              int var35Lifetime1 = var30 + (var28 * var27 >> 4);
              int var36Lifetime1 = var31;
              int var37Lifetime1 = var20;
              if (var36Lifetime1 >= 0 &&
                var36Lifetime1 - (this.height << 12) < 0) {
                if (var35Lifetime1 < 0) {
                  int var32Lifetime1 = (var27 - 1 - var35Lifetime1) / var27;
                  var37Lifetime1 = var37Lifetime1 + var32Lifetime1;
                  var35Lifetime1 = var35Lifetime1 + var27 * var32Lifetime1;
                  var34Lifetime1 = var34Lifetime1 + var32Lifetime1;
                }
                int var32Lifetime1Lifetime3 = (1 + var35Lifetime1 - (this.width << 12) - var27) / var27;
                if ((1 + var35Lifetime1 - (this.width << 12) - var27) / var27 > var37Lifetime1) {
                  var37Lifetime1 = var32Lifetime1Lifetime3;
                }
                while (var37Lifetime1 < 0) {
                  int var38Lifetime1 = this.pixels[(var36Lifetime1 >> 12) * this.width + (var35Lifetime1 >> 12)];
                  int var39Lifetime1 = SoftwareRasterizer.pixels[var34Lifetime1];
                  int var40Lifetime1 = var38Lifetime1 >>> 24;
                  int var41Lifetime1 = 256 - var40Lifetime1;
                  int incrementValue$2 = var34Lifetime1;
                  var34Lifetime1++;
                  SoftwareRasterizer.pixels[incrementValue$2] = ((var38Lifetime1 & 16711935) * var40Lifetime1 + (var39Lifetime1 & 16711935) * var41Lifetime1 & -16711936) + ((var38Lifetime1 & 65280) * var40Lifetime1 + (var39Lifetime1 & 65280) * var41Lifetime1 & 16711680) >>> 8;
                  var35Lifetime1 = var35Lifetime1 + var27;
                  var37Lifetime1++;
                }
              }
              var33Lifetime1++;
              var31 = var31 + var27;
              var23 = var23 + SoftwareRasterizer.width;
            }
            return;
          }
          if (var26 >= 0) {
            int var33Lifetime1Lifetime1 = var22;
            while (var33Lifetime1Lifetime1 < 0) {
              int var34Lifetime1Lifetime1 = var23;
              int var35Lifetime1Lifetime1 = var30 + (var28 * var27 >> 4);
              int var36Lifetime1Lifetime1 = var31 + (var28 * var26 >> 4);
              int var37Lifetime1Lifetime1 = var20;
              if (var35Lifetime1Lifetime1 < 0) {
                int var32Lifetime1Lifetime1 = (var27 - 1 - var35Lifetime1Lifetime1) / var27;
                var37Lifetime1Lifetime1 = var37Lifetime1Lifetime1 + var32Lifetime1Lifetime1;
                var35Lifetime1Lifetime1 = var35Lifetime1Lifetime1 + var27 * var32Lifetime1Lifetime1;
                var36Lifetime1Lifetime1 = var36Lifetime1Lifetime1 + var26 * var32Lifetime1Lifetime1;
                var34Lifetime1Lifetime1 = var34Lifetime1Lifetime1 + var32Lifetime1Lifetime1;
              }
              int var32Lifetime1Lifetime1Lifetime1 = (1 + var35Lifetime1Lifetime1 - (this.width << 12) - var27) / var27;
              if ((1 + var35Lifetime1Lifetime1 - (this.width << 12) - var27) / var27 > var37Lifetime1Lifetime1) {
                var37Lifetime1Lifetime1 = var32Lifetime1Lifetime1Lifetime1;
              }
              if (var36Lifetime1Lifetime1 < 0) {
                int var32Lifetime1Lifetime1Lifetime2 = (var26 - 1 - var36Lifetime1Lifetime1) / var26;
                var37Lifetime1Lifetime1 = var37Lifetime1Lifetime1 + var32Lifetime1Lifetime1Lifetime2;
                var35Lifetime1Lifetime1 = var35Lifetime1Lifetime1 + var27 * var32Lifetime1Lifetime1Lifetime2;
                var36Lifetime1Lifetime1 = var36Lifetime1Lifetime1 + var26 * var32Lifetime1Lifetime1Lifetime2;
                var34Lifetime1Lifetime1 = var34Lifetime1Lifetime1 + var32Lifetime1Lifetime1Lifetime2;
              }
              int var32Lifetime1Lifetime1Lifetime3 = (1 + var36Lifetime1Lifetime1 - (this.height << 12) - var26) / var26;
              if ((1 + var36Lifetime1Lifetime1 - (this.height << 12) - var26) / var26 > var37Lifetime1Lifetime1) {
                var37Lifetime1Lifetime1 = var32Lifetime1Lifetime1Lifetime3;
              }
              while (var37Lifetime1Lifetime1 < 0) {
                int var38Lifetime1Lifetime1 = this.pixels[(var36Lifetime1Lifetime1 >> 12) * this.width + (var35Lifetime1Lifetime1 >> 12)];
                int var39Lifetime1Lifetime1 = SoftwareRasterizer.pixels[var34Lifetime1Lifetime1];
                int var40Lifetime1Lifetime1 = var38Lifetime1Lifetime1 >>> 24;
                int var41Lifetime1Lifetime1 = 256 - var40Lifetime1Lifetime1;
                int incrementValue$0 = var34Lifetime1Lifetime1;
                var34Lifetime1Lifetime1++;
                SoftwareRasterizer.pixels[incrementValue$0] = ((var38Lifetime1Lifetime1 & 16711935) * var40Lifetime1Lifetime1 + (var39Lifetime1Lifetime1 & 16711935) * var41Lifetime1Lifetime1 & -16711936) + ((var38Lifetime1Lifetime1 & 65280) * var40Lifetime1Lifetime1 + (var39Lifetime1Lifetime1 & 65280) * var41Lifetime1Lifetime1 & 16711680) >>> 8;
                var35Lifetime1Lifetime1 = var35Lifetime1Lifetime1 + var27;
                var36Lifetime1Lifetime1 = var36Lifetime1Lifetime1 + var26;
                var37Lifetime1Lifetime1++;
              }
              var33Lifetime1Lifetime1++;
              var30 = var30 - var26;
              var31 = var31 + var27;
              var23 = var23 + SoftwareRasterizer.width;
            }
            return;
          }
          int var33Lifetime1Lifetime2 = var22;
          while (var33Lifetime1Lifetime2 < 0) {
            int var34Lifetime1Lifetime2 = var23;
            int var35Lifetime1Lifetime2 = var30 + (var28 * var27 >> 4);
            int var36Lifetime1Lifetime2 = var31 + (var28 * var26 >> 4);
            int var37Lifetime1Lifetime2 = var20;
            if (var35Lifetime1Lifetime2 < 0) {
              int var32Lifetime1Lifetime2 = (var27 - 1 - var35Lifetime1Lifetime2) / var27;
              var37Lifetime1Lifetime2 = var37Lifetime1Lifetime2 + var32Lifetime1Lifetime2;
              var35Lifetime1Lifetime2 = var35Lifetime1Lifetime2 + var27 * var32Lifetime1Lifetime2;
              var36Lifetime1Lifetime2 = var36Lifetime1Lifetime2 + var26 * var32Lifetime1Lifetime2;
              var34Lifetime1Lifetime2 = var34Lifetime1Lifetime2 + var32Lifetime1Lifetime2;
            }
            int var32Lifetime1Lifetime2Lifetime1 = (1 + var35Lifetime1Lifetime2 - (this.width << 12) - var27) / var27;
            if ((1 + var35Lifetime1Lifetime2 - (this.width << 12) - var27) / var27 > var37Lifetime1Lifetime2) {
              var37Lifetime1Lifetime2 = var32Lifetime1Lifetime2Lifetime1;
            }
            int var32Lifetime1Lifetime2Lifetime2 = var36Lifetime1Lifetime2 - (this.height << 12);
            if (var36Lifetime1Lifetime2 - (this.height << 12) >= 0) {
              var32Lifetime1Lifetime2Lifetime2 = (var26 - var32Lifetime1Lifetime2Lifetime2) / var26;
              var37Lifetime1Lifetime2 = var37Lifetime1Lifetime2 + var32Lifetime1Lifetime2Lifetime2;
              var35Lifetime1Lifetime2 = var35Lifetime1Lifetime2 + var27 * var32Lifetime1Lifetime2Lifetime2;
              var36Lifetime1Lifetime2 = var36Lifetime1Lifetime2 + var26 * var32Lifetime1Lifetime2Lifetime2;
              var34Lifetime1Lifetime2 = var34Lifetime1Lifetime2 + var32Lifetime1Lifetime2Lifetime2;
            }
            int var32Lifetime1Lifetime2Lifetime3 = (var36Lifetime1Lifetime2 - var26) / var26;
            if ((var36Lifetime1Lifetime2 - var26) / var26 > var37Lifetime1Lifetime2) {
              var37Lifetime1Lifetime2 = var32Lifetime1Lifetime2Lifetime3;
            }
            while (var37Lifetime1Lifetime2 < 0) {
              int var38Lifetime1Lifetime2 = this.pixels[(var36Lifetime1Lifetime2 >> 12) * this.width + (var35Lifetime1Lifetime2 >> 12)];
              int var39Lifetime1Lifetime2 = SoftwareRasterizer.pixels[var34Lifetime1Lifetime2];
              int var40Lifetime1Lifetime2 = var38Lifetime1Lifetime2 >>> 24;
              int var41Lifetime1Lifetime2 = 256 - var40Lifetime1Lifetime2;
              int incrementValue$1 = var34Lifetime1Lifetime2;
              var34Lifetime1Lifetime2++;
              SoftwareRasterizer.pixels[incrementValue$1] = ((var38Lifetime1Lifetime2 & 16711935) * var40Lifetime1Lifetime2 + (var39Lifetime1Lifetime2 & 16711935) * var41Lifetime1Lifetime2 & -16711936) + ((var38Lifetime1Lifetime2 & 65280) * var40Lifetime1Lifetime2 + (var39Lifetime1Lifetime2 & 65280) * var41Lifetime1Lifetime2 & 16711680) >>> 8;
              var35Lifetime1Lifetime2 = var35Lifetime1Lifetime2 + var27;
              var36Lifetime1Lifetime2 = var36Lifetime1Lifetime2 + var26;
              var37Lifetime1Lifetime2++;
            }
            var33Lifetime1Lifetime2++;
            var30 = var30 - var26;
            var31 = var31 + var27;
            var23 = var23 + SoftwareRasterizer.width;
          }
          return;
        }
        if (var26 == 0) {
          int var33Lifetime2 = var22;
          while (var33Lifetime2 < 0) {
            int var34Lifetime2 = var23;
            int var35Lifetime2 = var30 + (var28 * var27 >> 4);
            int var36Lifetime2 = var31;
            int var37Lifetime2 = var20;
            if (var36Lifetime2 >= 0 &&
              var36Lifetime2 - (this.height << 12) < 0) {
              int var32Lifetime2 = var35Lifetime2 - (this.width << 12);
              if (var35Lifetime2 - (this.width << 12) >= 0) {
                var32Lifetime2 = (var27 - var32Lifetime2) / var27;
                var37Lifetime2 = var37Lifetime2 + var32Lifetime2;
                var35Lifetime2 = var35Lifetime2 + var27 * var32Lifetime2;
                var34Lifetime2 = var34Lifetime2 + var32Lifetime2;
              }
              int var32Lifetime2Lifetime1 = (var35Lifetime2 - var27) / var27;
              if ((var35Lifetime2 - var27) / var27 > var37Lifetime2) {
                var37Lifetime2 = var32Lifetime2Lifetime1;
              }
              while (var37Lifetime2 < 0) {
                int var38Lifetime2 = this.pixels[(var36Lifetime2 >> 12) * this.width + (var35Lifetime2 >> 12)];
                int var39Lifetime2 = SoftwareRasterizer.pixels[var34Lifetime2];
                int var40Lifetime2 = var38Lifetime2 >>> 24;
                int var41Lifetime2 = 256 - var40Lifetime2;
                int incrementValue$5 = var34Lifetime2;
                var34Lifetime2++;
                SoftwareRasterizer.pixels[incrementValue$5] = ((var38Lifetime2 & 16711935) * var40Lifetime2 + (var39Lifetime2 & 16711935) * var41Lifetime2 & -16711936) + ((var38Lifetime2 & 65280) * var40Lifetime2 + (var39Lifetime2 & 65280) * var41Lifetime2 & 16711680) >>> 8;
                var35Lifetime2 = var35Lifetime2 + var27;
                var37Lifetime2++;
              }
            }
            var33Lifetime2++;
            var31 = var31 + var27;
            var23 = var23 + SoftwareRasterizer.width;
          }
          return;
        }
        if (var26 >= 0) {
          int var33Lifetime3 = var22;
          while (var33Lifetime3 < 0) {
            int var34Lifetime3 = var23;
            int var35Lifetime3 = var30 + (var28 * var27 >> 4);
            int var36Lifetime3 = var31 + (var28 * var26 >> 4);
            int var37Lifetime3 = var20;
            int var32Lifetime3 = var35Lifetime3 - (this.width << 12);
            if (var35Lifetime3 - (this.width << 12) >= 0) {
              var32Lifetime3 = (var27 - var32Lifetime3) / var27;
              var37Lifetime3 = var37Lifetime3 + var32Lifetime3;
              var35Lifetime3 = var35Lifetime3 + var27 * var32Lifetime3;
              var36Lifetime3 = var36Lifetime3 + var26 * var32Lifetime3;
              var34Lifetime3 = var34Lifetime3 + var32Lifetime3;
            }
            int var32Lifetime3Lifetime1 = (var35Lifetime3 - var27) / var27;
            if ((var35Lifetime3 - var27) / var27 > var37Lifetime3) {
              var37Lifetime3 = var32Lifetime3Lifetime1;
            }
            if (var36Lifetime3 < 0) {
              int var32Lifetime3Lifetime2 = (var26 - 1 - var36Lifetime3) / var26;
              var37Lifetime3 = var37Lifetime3 + var32Lifetime3Lifetime2;
              var35Lifetime3 = var35Lifetime3 + var27 * var32Lifetime3Lifetime2;
              var36Lifetime3 = var36Lifetime3 + var26 * var32Lifetime3Lifetime2;
              var34Lifetime3 = var34Lifetime3 + var32Lifetime3Lifetime2;
            }
            int var32Lifetime3Lifetime3 = (1 + var36Lifetime3 - (this.height << 12) - var26) / var26;
            if ((1 + var36Lifetime3 - (this.height << 12) - var26) / var26 > var37Lifetime3) {
              var37Lifetime3 = var32Lifetime3Lifetime3;
            }
            while (var37Lifetime3 < 0) {
              int var38Lifetime3 = this.pixels[(var36Lifetime3 >> 12) * this.width + (var35Lifetime3 >> 12)];
              int var39Lifetime3 = SoftwareRasterizer.pixels[var34Lifetime3];
              int var40Lifetime3 = var38Lifetime3 >>> 24;
              int var41Lifetime3 = 256 - var40Lifetime3;
              int incrementValue$3 = var34Lifetime3;
              var34Lifetime3++;
              SoftwareRasterizer.pixels[incrementValue$3] = ((var38Lifetime3 & 16711935) * var40Lifetime3 + (var39Lifetime3 & 16711935) * var41Lifetime3 & -16711936) + ((var38Lifetime3 & 65280) * var40Lifetime3 + (var39Lifetime3 & 65280) * var41Lifetime3 & 16711680) >>> 8;
              var35Lifetime3 = var35Lifetime3 + var27;
              var36Lifetime3 = var36Lifetime3 + var26;
              var37Lifetime3++;
            }
            var33Lifetime3++;
            var30 = var30 - var26;
            var31 = var31 + var27;
            var23 = var23 + SoftwareRasterizer.width;
          }
          return;
        }
        int var33Lifetime4 = var22;
        while (var33Lifetime4 < 0) {
          int var34Lifetime4 = var23;
          int var35Lifetime4 = var30 + (var28 * var27 >> 4);
          int var36Lifetime4 = var31 + (var28 * var26 >> 4);
          int var37Lifetime4 = var20;
          int var32Lifetime4 = var35Lifetime4 - (this.width << 12);
          if (var35Lifetime4 - (this.width << 12) >= 0) {
            var32Lifetime4 = (var27 - var32Lifetime4) / var27;
            var37Lifetime4 = var37Lifetime4 + var32Lifetime4;
            var35Lifetime4 = var35Lifetime4 + var27 * var32Lifetime4;
            var36Lifetime4 = var36Lifetime4 + var26 * var32Lifetime4;
            var34Lifetime4 = var34Lifetime4 + var32Lifetime4;
          }
          int var32Lifetime4Lifetime1 = (var35Lifetime4 - var27) / var27;
          if ((var35Lifetime4 - var27) / var27 > var37Lifetime4) {
            var37Lifetime4 = var32Lifetime4Lifetime1;
          }
          int var32Lifetime4Lifetime2 = var36Lifetime4 - (this.height << 12);
          if (var36Lifetime4 - (this.height << 12) >= 0) {
            var32Lifetime4Lifetime2 = (var26 - var32Lifetime4Lifetime2) / var26;
            var37Lifetime4 = var37Lifetime4 + var32Lifetime4Lifetime2;
            var35Lifetime4 = var35Lifetime4 + var27 * var32Lifetime4Lifetime2;
            var36Lifetime4 = var36Lifetime4 + var26 * var32Lifetime4Lifetime2;
            var34Lifetime4 = var34Lifetime4 + var32Lifetime4Lifetime2;
          }
          int var32Lifetime4Lifetime3 = (var36Lifetime4 - var26) / var26;
          if ((var36Lifetime4 - var26) / var26 > var37Lifetime4) {
            var37Lifetime4 = var32Lifetime4Lifetime3;
          }
          while (var37Lifetime4 < 0) {
            int var38Lifetime4 = this.pixels[(var36Lifetime4 >> 12) * this.width + (var35Lifetime4 >> 12)];
            int var39Lifetime4 = SoftwareRasterizer.pixels[var34Lifetime4];
            int var40Lifetime4 = var38Lifetime4 >>> 24;
            int var41Lifetime4 = 256 - var40Lifetime4;
            int incrementValue$4 = var34Lifetime4;
            var34Lifetime4++;
            SoftwareRasterizer.pixels[incrementValue$4] = ((var38Lifetime4 & 16711935) * var40Lifetime4 + (var39Lifetime4 & 16711935) * var41Lifetime4 & -16711936) + ((var38Lifetime4 & 65280) * var40Lifetime4 + (var39Lifetime4 & 65280) * var41Lifetime4 & 16711680) >>> 8;
            var35Lifetime4 = var35Lifetime4 + var27;
            var36Lifetime4 = var36Lifetime4 + var26;
            var37Lifetime4++;
          }
          var33Lifetime4++;
          var30 = var30 - var26;
          var31 = var31 + var27;
          var23 = var23 + SoftwareRasterizer.width;
        }
        return;
    }

    private final static void blitArgbAdditive(int sourceColor, int destinationColor, int sum, int[] destination, int[] source, int sourceIndex, int column, int destinationIndex, int row, int rowWidth, int rowCount, int destinationRowSkip, int sourceRowSkip, int intensity) {
        for (row = -rowCount; row < 0; row++) {
          for (column = -rowWidth; column < 0; column++) {
            sourceColor = source[sourceIndex++];
            if (sourceColor == 0) {
              destinationIndex++;
            } else {
              int var14 = intensity * (sourceColor >>> 24) >> 8 & 255;
              destinationColor = (sourceColor & 16711935) * var14;
              sourceColor = (destinationColor & -16711936) + (sourceColor * var14 - destinationColor & 16711680) >>> 8;
              destinationColor = destination[destinationIndex];
              sum = sourceColor + destinationColor;
              sourceColor = (sourceColor & 16711935) + (destinationColor & 16711935);
              destinationColor = (sourceColor & 16777472) + (sum - sourceColor & 65536);
              int incrementValue$12 = destinationIndex;
              destinationIndex++;
              destination[incrementValue$12] = sum - destinationColor | destinationColor - (destinationColor >>> 8);
            }
          }
          destinationIndex = destinationIndex + destinationRowSkip;
          sourceIndex = sourceIndex + sourceRowSkip;
        }
    }

    final void drawShadedTint(int x, int y, int tint) {
        x = x + this.offsetX;
        y = y + this.offsetY;
        int var4 = x + y * SoftwareRasterizer.width;
        int var5 = 0;
        int var6 = this.height;
        int var7 = this.width;
        int var8 = SoftwareRasterizer.width - var7;
        int var9 = 0;
        if (y < SoftwareRasterizer.clipTop) {
          int var10 = SoftwareRasterizer.clipTop - y;
          var6 = var6 - var10;
          y = SoftwareRasterizer.clipTop;
          var5 = var5 + var10 * var7;
          var4 = var4 + var10 * SoftwareRasterizer.width;
        }
        if (y + var6 > SoftwareRasterizer.clipBottom) {
          var6 = var6 - (y + var6 - SoftwareRasterizer.clipBottom);
        }
        if (x < SoftwareRasterizer.clipLeft) {
          int var10Lifetime1 = SoftwareRasterizer.clipLeft - x;
          var7 = var7 - var10Lifetime1;
          x = SoftwareRasterizer.clipLeft;
          var5 = var5 + var10Lifetime1;
          var4 = var4 + var10Lifetime1;
          var9 = var9 + var10Lifetime1;
          var8 = var8 + var10Lifetime1;
        }
        if (x + var7 > SoftwareRasterizer.clipRight) {
          int var10Lifetime2 = x + var7 - SoftwareRasterizer.clipRight;
          var7 = var7 - var10Lifetime2;
          var9 = var9 + var10Lifetime2;
          var8 = var8 + var10Lifetime2;
        }
        if (var7 > 0) {
          if (var6 <= 0) {
            return;
          }
          ArgbSprite.blitArgbShadedTint(SoftwareRasterizer.pixels, this.pixels, 0, var5, var4, var7, var6, var8, var9, tint);
          return;
        }
    }

    private final static void blitArgbShadedTint(int[] destination, int[] source, int sourceColor, int sourceIndex, int destinationIndex, int rowWidth, int rowCount, int destinationRowSkip, int sourceRowSkip, int tint) {
        int var18;
        int var10 = tint >> 16 & 255;
        int var11 = tint >> 8 & 255;
        int var12 = tint & 255;
        int var13 = -(rowWidth >> 2);
        rowWidth = -(rowWidth & 3);
        int var14 = var13 + var13 + var13 + var13 + rowWidth;
        for (int var15 = -rowCount; var15 < 0; var15++) {
          for (int var16 = var14; var16 < 0; var16++) {
            sourceColor = source[sourceIndex++];
            int var17 = sourceColor >>> 24;
            if (var17 == 0) {
              destinationIndex++;
            } else {
              int var19 = sourceColor >> 16 & 255;
              int var20 = sourceColor >> 8 & 255;
              int var21 = sourceColor & 255;
              if (var19 != var20 ||
                var20 != var21) {
                var18 = sourceColor;
              } else if (var19 > 128) {
                var18 = (var10 * (256 - var19) + 255 * (var19 - 128) >> 7 << 16) + (var11 * (256 - var20) + 255 * (var20 - 128) >> 7 << 8) + (var12 * (256 - var21) + 255 * (var21 - 128) >> 7);
              } else {
                var18 = (var19 * var10 >> 7 << 16) + (var20 * var11 >> 7 << 8) + (var21 * var12 >> 7);
              }
              int var22 = 256 - var17;
              int var23 = destination[destinationIndex];
              int incrementValue$6 = destinationIndex;
              destinationIndex++;
              destination[incrementValue$6] = ((var18 & 16711935) * var17 + (var23 & 16711935) * var22 & -16711936) + ((var18 & 65280) * var17 + (var23 & 65280) * var22 & 16711680) >>> 8;
            }
          }
          destinationIndex = destinationIndex + destinationRowSkip;
          sourceIndex = sourceIndex + sourceRowSkip;
        }
    }

    ArgbSprite(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6) {
        super(param0, param1, param2, param3, param4, param5, param6);
    }

    final void drawAlpha(int x, int y, int alpha) {
        x = x + this.offsetX;
        y = y + this.offsetY;
        int var4 = x + y * SoftwareRasterizer.width;
        int var5 = 0;
        int var6 = this.height;
        int var7 = this.width;
        int var8 = SoftwareRasterizer.width - var7;
        int var9 = 0;
        if (y < SoftwareRasterizer.clipTop) {
          int var10 = SoftwareRasterizer.clipTop - y;
          var6 = var6 - var10;
          y = SoftwareRasterizer.clipTop;
          var5 = var5 + var10 * var7;
          var4 = var4 + var10 * SoftwareRasterizer.width;
        }
        if (y + var6 > SoftwareRasterizer.clipBottom) {
          var6 = var6 - (y + var6 - SoftwareRasterizer.clipBottom);
        }
        if (x < SoftwareRasterizer.clipLeft) {
          int var10Lifetime1 = SoftwareRasterizer.clipLeft - x;
          var7 = var7 - var10Lifetime1;
          x = SoftwareRasterizer.clipLeft;
          var5 = var5 + var10Lifetime1;
          var4 = var4 + var10Lifetime1;
          var9 = var9 + var10Lifetime1;
          var8 = var8 + var10Lifetime1;
        }
        if (x + var7 > SoftwareRasterizer.clipRight) {
          int var10Lifetime2 = x + var7 - SoftwareRasterizer.clipRight;
          var7 = var7 - var10Lifetime2;
          var9 = var9 + var10Lifetime2;
          var8 = var8 + var10Lifetime2;
        }
        if (var7 > 0) {
          if (var6 <= 0) {
            return;
          }
          ArgbSprite.blitArgbAlpha(SoftwareRasterizer.pixels, this.pixels, 0, var5, var4, var7, var6, var8, var9, alpha);
          return;
        }
    }
}
