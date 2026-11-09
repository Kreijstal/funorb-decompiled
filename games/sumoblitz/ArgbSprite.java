/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ArgbSprite extends Sprite {
    final void drawAdditive(int x, int y, int intensity) {
        int var10 = 0;
        int var10Lifetime1;
        int var10Lifetime2;
        x = x + this.offsetX;
        y = y + this.offsetY;
        int var4 = x + y * SoftwareRasterizer.width;
        int var5 = 0;
        int var6 = this.height;
        int var7 = this.width;
        int var8 = SoftwareRasterizer.width - var7;
        int var9 = 0;
        if (y < SoftwareRasterizer.clipTop) {
          var10 = SoftwareRasterizer.clipTop - y;
          var6 = var6 - var10;
          y = SoftwareRasterizer.clipTop;
          var5 = var5 + var10 * var7;
          var4 = var4 + var10 * SoftwareRasterizer.width;
        }
        if (y + var6 > SoftwareRasterizer.clipBottom) {
          var6 = var6 - (y + var6 - SoftwareRasterizer.clipBottom);
        }
        if (x < SoftwareRasterizer.clipLeft) {
          var10Lifetime1 = SoftwareRasterizer.clipLeft - x;
          var7 = var7 - var10Lifetime1;
          x = SoftwareRasterizer.clipLeft;
          var5 = var5 + var10Lifetime1;
          var4 = var4 + var10Lifetime1;
          var9 = var9 + var10Lifetime1;
          var8 = var8 + var10Lifetime1;
        }
        if (x + var7 > SoftwareRasterizer.clipRight) {
          var10Lifetime2 = x + var7 - SoftwareRasterizer.clipRight;
          var7 = var7 - var10Lifetime2;
          var9 = var9 + var10Lifetime2;
          var8 = var8 + var10Lifetime2;
        }
        if (var7 <= 0 ||
          var6 <= 0) {
          return;
        }
        ArgbSprite.addArgbPixelsSaturating(0, 0, 0, SoftwareRasterizer.pixels, this.pixels, var5, 0, var4, 0, var7, var6, var8, var9, intensity);
    }

    private final static void addArgbPixelsSaturating(int pixel, int componentSum, int sum, int[] destination, int[] source, int sourceOffset, int column, int destinationOffset, int row, int width, int height, int destinationRowSkip, int sourceRowSkip, int intensity) {
        int incrementValue$12 = 0;
        int var14;
        for (row = -height; row < 0; row++) {
          for (column = -width; column < 0; column++) {
            pixel = source[sourceOffset++];
            if (pixel == 0) {
              destinationOffset++;
            } else {
              var14 = intensity * (pixel >>> 24) >> 8 & 255;
              componentSum = (pixel & 16711935) * var14;
              pixel = (componentSum & -16711936) + (pixel * var14 - componentSum & 16711680) >>> 8;
              componentSum = destination[destinationOffset];
              sum = pixel + componentSum;
              pixel = (pixel & 16711935) + (componentSum & 16711935);
              componentSum = (pixel & 16777472) + (sum - pixel & 65536);
              incrementValue$12 = destinationOffset;
              destinationOffset++;
              destination[incrementValue$12] = sum - componentSum | componentSum - (componentSum >>> 8);
            }
          }
          destinationOffset = destinationOffset + destinationRowSkip;
          sourceOffset = sourceOffset + sourceRowSkip;
        }
    }

    private final static void blitArgb(int[] destination, int[] source, int pixel, int sourceOffset, int destinationOffset, int width, int height, int destinationSkip, int sourceSkip) {
        int var10 = 0;
        int var11 = 0;
        int incrementValue$12 = 0;
        int var9;
        int var12;
        int var13;
        int var14;
        var9 = -width;
        for (var10 = -height; var10 < 0; var10++) {
          for (var11 = var9; var11 < 0; var11++) {
            pixel = source[sourceOffset++];
            var12 = pixel >>> 24;
            if (var12 == 0) {
              destinationOffset++;
            } else {
              var13 = 256 - var12;
              var14 = destination[destinationOffset];
              incrementValue$12 = destinationOffset;
              destinationOffset++;
              destination[incrementValue$12] = ((pixel & 16711935) * var12 + (var14 & 16711935) * var13 & -16711936) + ((pixel & 65280) * var12 + (var14 & 65280) * var13 & 16711680) >>> 8;
            }
          }
          destinationOffset = destinationOffset + destinationSkip;
          sourceOffset = sourceOffset + sourceSkip;
        }
    }

    final void drawHalfSize(int param0, int param1) {
        int var9 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int[] stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        int stackIn_21_2 = 0;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int var18;
        int var19;
        int var20;
        int var21;
        int var13Lifetime1;
        int var14Lifetime1;
        int var19Lifetime1;
        var3 = this.width >> 1;
        var4 = this.height >> 1;
        param0 = param0 + this.offsetX / 2;
        param1 = param1 + this.offsetY / 2;
        if (param0 >= SoftwareRasterizer.clipLeft) {
          stackIn_3_0 = 0;
        } else {
          stackIn_3_0 = SoftwareRasterizer.clipLeft - param0 << 1;
        }
        var5 = stackIn_3_0;
        if (param0 + var3 <= SoftwareRasterizer.clipRight) {
          stackIn_6_0 = this.width - 2;
        } else {
          stackIn_6_0 = (SoftwareRasterizer.clipRight - param0 << 1) - 2;
        }
        var6 = stackIn_6_0;
        if (param1 >= SoftwareRasterizer.clipTop) {
          stackIn_9_0 = 0;
        } else {
          stackIn_9_0 = SoftwareRasterizer.clipTop - param1 << 1;
        }
        var7 = stackIn_9_0;
        if (param1 + var4 <= SoftwareRasterizer.clipBottom) {
          stackIn_12_0 = this.height - 2;
        } else {
          stackIn_12_0 = (SoftwareRasterizer.clipBottom - param1 << 1) - 2;
        }
        var8 = stackIn_12_0;
        for (var9 = var7; var9 <= var8; var9 += 2) {
          var10 = var9 * this.width + var5;
          var11 = (param1 + (var9 >> 1)) * SoftwareRasterizer.width + (param0 + (var5 >> 1));
          var12 = var5;
          while (var12 <= var6) {
            var13 = 0;
            var14 = 0;
            var15 = 0;
            var16 = 0;
            var17 = 0;
            var18 = 0;
            for (var19 = 0; var19 < 4; var19++) {
              stackIn_20_0 = this.pixels;
              stackIn_20_1 = var10 + (var19 & 1);
              if ((var19 & 2) != 0) {
                stackIn_21_2 = 0;
              } else {
                stackIn_21_2 = this.width;
              }
              var13Lifetime1 = stackIn_20_0[stackIn_20_1 + stackIn_21_2];
              var14Lifetime1 = var13Lifetime1 >>> 24;
              var18 = var18 + var14Lifetime1;
              var15 = var15 + var14Lifetime1 * (var13Lifetime1 >> 16 & 255);
              var16 = var16 + var14Lifetime1 * (var13Lifetime1 >> 8 & 255);
              var17 = var17 + var14Lifetime1 * (var13Lifetime1 & 255);
            }
            if (var18 != 0) {
              var15 = (var15 / var18 << 16) + var17 / var18;
              var16 = var16 / var18 << 8;
              var19Lifetime1 = var18 >> 2;
              var20 = 256 - var19Lifetime1;
              var21 = SoftwareRasterizer.pixels[var11];
              SoftwareRasterizer.pixels[var11] = (var19Lifetime1 * var15 + var20 * (var21 & 16711935) & -16711936) + (var19Lifetime1 * var16 + var20 * (var21 & 65280) & 16711680) >>> 8;
            }
            var12 += 2;
            var11++;
            var10 += 2;
          }
        }
    }

    final void draw(int param0, int param1) {
        int var9 = 0;
        int var9Lifetime1;
        int var9Lifetime2;
        param0 = param0 + this.offsetX;
        param1 = param1 + this.offsetY;
        int var3 = param0 + param1 * SoftwareRasterizer.width;
        int var4 = 0;
        int var5 = this.height;
        int var6 = this.width;
        int var7 = SoftwareRasterizer.width - var6;
        int var8 = 0;
        if (param1 < SoftwareRasterizer.clipTop) {
          var9 = SoftwareRasterizer.clipTop - param1;
          var5 = var5 - var9;
          param1 = SoftwareRasterizer.clipTop;
          var4 = var4 + var9 * var6;
          var3 = var3 + var9 * SoftwareRasterizer.width;
        }
        if (param1 + var5 > SoftwareRasterizer.clipBottom) {
          var5 = var5 - (param1 + var5 - SoftwareRasterizer.clipBottom);
        }
        if (param0 < SoftwareRasterizer.clipLeft) {
          var9Lifetime1 = SoftwareRasterizer.clipLeft - param0;
          var6 = var6 - var9Lifetime1;
          param0 = SoftwareRasterizer.clipLeft;
          var4 = var4 + var9Lifetime1;
          var3 = var3 + var9Lifetime1;
          var8 = var8 + var9Lifetime1;
          var7 = var7 + var9Lifetime1;
        }
        if (param0 + var6 > SoftwareRasterizer.clipRight) {
          var9Lifetime2 = param0 + var6 - SoftwareRasterizer.clipRight;
          var6 = var6 - var9Lifetime2;
          var8 = var8 + var9Lifetime2;
          var7 = var7 + var9Lifetime2;
        }
        if (var6 <= 0 ||
          var5 <= 0) {
          return;
        }
        ArgbSprite.blitArgb(SoftwareRasterizer.pixels, this.pixels, 0, var4, var3, var6, var5, var7, var8);
    }

    final void drawPixels(int x, int y) {
        int var9 = 0;
        int var9Lifetime1;
        int var9Lifetime2;
        x = x + this.offsetX;
        y = y + this.offsetY;
        int var3 = x + y * SoftwareRasterizer.width;
        int var4 = 0;
        int var5 = this.height;
        int var6 = this.width;
        int var7 = SoftwareRasterizer.width - var6;
        int var8 = 0;
        if (y < SoftwareRasterizer.clipTop) {
          var9 = SoftwareRasterizer.clipTop - y;
          var5 = var5 - var9;
          y = SoftwareRasterizer.clipTop;
          var4 = var4 + var9 * var6;
          var3 = var3 + var9 * SoftwareRasterizer.width;
        }
        if (y + var5 > SoftwareRasterizer.clipBottom) {
          var5 = var5 - (y + var5 - SoftwareRasterizer.clipBottom);
        }
        if (x < SoftwareRasterizer.clipLeft) {
          var9Lifetime1 = SoftwareRasterizer.clipLeft - x;
          var6 = var6 - var9Lifetime1;
          x = SoftwareRasterizer.clipLeft;
          var4 = var4 + var9Lifetime1;
          var3 = var3 + var9Lifetime1;
          var8 = var8 + var9Lifetime1;
          var7 = var7 + var9Lifetime1;
        }
        if (x + var6 > SoftwareRasterizer.clipRight) {
          var9Lifetime2 = x + var6 - SoftwareRasterizer.clipRight;
          var6 = var6 - var9Lifetime2;
          var8 = var8 + var9Lifetime2;
          var7 = var7 + var9Lifetime2;
        }
        if (var6 <= 0 ||
          var5 <= 0) {
          return;
        }
        ArgbSprite.blitArgb(SoftwareRasterizer.pixels, this.pixels, 0, var4, var3, var6, var5, var7, var8);
    }

    final void drawRecolored(int x, int y, int color) {
        int var10 = 0;
        int var10Lifetime1;
        int var10Lifetime2;
        x = x + this.offsetX;
        y = y + this.offsetY;
        int var4 = x + y * SoftwareRasterizer.width;
        int var5 = 0;
        int var6 = this.height;
        int var7 = this.width;
        int var8 = SoftwareRasterizer.width - var7;
        int var9 = 0;
        if (y < SoftwareRasterizer.clipTop) {
          var10 = SoftwareRasterizer.clipTop - y;
          var6 = var6 - var10;
          y = SoftwareRasterizer.clipTop;
          var5 = var5 + var10 * var7;
          var4 = var4 + var10 * SoftwareRasterizer.width;
        }
        if (y + var6 > SoftwareRasterizer.clipBottom) {
          var6 = var6 - (y + var6 - SoftwareRasterizer.clipBottom);
        }
        if (x < SoftwareRasterizer.clipLeft) {
          var10Lifetime1 = SoftwareRasterizer.clipLeft - x;
          var7 = var7 - var10Lifetime1;
          x = SoftwareRasterizer.clipLeft;
          var5 = var5 + var10Lifetime1;
          var4 = var4 + var10Lifetime1;
          var9 = var9 + var10Lifetime1;
          var8 = var8 + var10Lifetime1;
        }
        if (x + var7 > SoftwareRasterizer.clipRight) {
          var10Lifetime2 = x + var7 - SoftwareRasterizer.clipRight;
          var7 = var7 - var10Lifetime2;
          var9 = var9 + var10Lifetime2;
          var8 = var8 + var10Lifetime2;
        }
        if (var7 <= 0 ||
          var6 <= 0) {
          return;
        }
        ArgbSprite.recolorNeutralArgbPixels(SoftwareRasterizer.pixels, this.pixels, 0, var5, var4, var7, var6, var8, var9, color);
    }

    private final static void recolorNeutralArgbPixels(int[] destination, int[] source, int pixel, int sourceOffset, int destinationOffset, int width, int height, int destinationRowSkip, int sourceRowSkip, int color) {
        int var15 = 0;
        int var16 = 0;
        int incrementValue$6 = 0;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var17;
        int var18;
        int var19;
        int var20;
        int var21;
        int var22;
        int var23;
        var10 = color >> 16 & 255;
        var11 = color >> 8 & 255;
        var12 = color & 255;
        var13 = -(width >> 2);
        width = -(width & 3);
        var14 = var13 + var13 + var13 + var13 + width;
        for (var15 = -height; var15 < 0; var15++) {
          for (var16 = var14; var16 < 0; var16++) {
            pixel = source[sourceOffset++];
            var17 = pixel >>> 24;
            if (var17 == 0) {
              destinationOffset++;
            } else {
              var19 = pixel >> 16 & 255;
              var20 = pixel >> 8 & 255;
              var21 = pixel & 255;
              if (var19 == var20 &&
                var20 == var21) {
                if (var19 > 128) {
                  var18 = (var10 * (256 - var19) + 255 * (var19 - 128) >> 7 << 16) + (var11 * (256 - var20) + 255 * (var20 - 128) >> 7 << 8) + (var12 * (256 - var21) + 255 * (var21 - 128) >> 7);
                } else {
                  var18 = (var19 * var10 >> 7 << 16) + (var20 * var11 >> 7 << 8) + (var21 * var12 >> 7);
                }
              } else {
                var18 = pixel;
              }
              var22 = 256 - var17;
              var23 = destination[destinationOffset];
              incrementValue$6 = destinationOffset;
              destinationOffset++;
              destination[incrementValue$6] = ((var18 & 16711935) * var17 + (var23 & 16711935) * var22 & -16711936) + ((var18 & 65280) * var17 + (var23 & 65280) * var22 & 16711680) >>> 8;
            }
          }
          destinationOffset = destinationOffset + destinationRowSkip;
          sourceOffset = sourceOffset + sourceRowSkip;
        }
    }

    ArgbSprite(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6) {
        super(param0, param1, param2, param3, param4, param5, param6);
    }

    private final static void blitArgbAlpha(int[] destination, int[] source, int pixel, int sourceOffset, int destinationOffset, int width, int height, int destinationSkip, int sourceSkip, int opacity) {
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int incrementValue$1 = 0;
        for (var10 = -height; var10 < 0; var10++) {
          for (var11 = -width; var11 < 0; var11++) {
            var12 = (source[sourceOffset] >>> 24) * opacity >> 8;
            var13 = 256 - var12;
            var14 = source[sourceOffset++];
            var15 = destination[destinationOffset];
            incrementValue$1 = destinationOffset;
            destinationOffset++;
            destination[incrementValue$1] = ((var14 & 16711935) * var12 + (var15 & 16711935) * var13 & -16711936) + ((var14 & 65280) * var12 + (var15 & 65280) * var13 & 16711680) >>> 8;
          }
          destinationOffset = destinationOffset + destinationSkip;
          sourceOffset = sourceOffset + sourceSkip;
        }
    }

    ArgbSprite(int param0, int param1) {
        super(param0, param1);
    }

    final void drawAlpha(int x, int y, int opacity) {
        int var10 = 0;
        int var10Lifetime1;
        int var10Lifetime2;
        x = x + this.offsetX;
        y = y + this.offsetY;
        int var4 = x + y * SoftwareRasterizer.width;
        int var5 = 0;
        int var6 = this.height;
        int var7 = this.width;
        int var8 = SoftwareRasterizer.width - var7;
        int var9 = 0;
        if (y < SoftwareRasterizer.clipTop) {
          var10 = SoftwareRasterizer.clipTop - y;
          var6 = var6 - var10;
          y = SoftwareRasterizer.clipTop;
          var5 = var5 + var10 * var7;
          var4 = var4 + var10 * SoftwareRasterizer.width;
        }
        if (y + var6 > SoftwareRasterizer.clipBottom) {
          var6 = var6 - (y + var6 - SoftwareRasterizer.clipBottom);
        }
        if (x < SoftwareRasterizer.clipLeft) {
          var10Lifetime1 = SoftwareRasterizer.clipLeft - x;
          var7 = var7 - var10Lifetime1;
          x = SoftwareRasterizer.clipLeft;
          var5 = var5 + var10Lifetime1;
          var4 = var4 + var10Lifetime1;
          var9 = var9 + var10Lifetime1;
          var8 = var8 + var10Lifetime1;
        }
        if (x + var7 > SoftwareRasterizer.clipRight) {
          var10Lifetime2 = x + var7 - SoftwareRasterizer.clipRight;
          var7 = var7 - var10Lifetime2;
          var9 = var9 + var10Lifetime2;
          var8 = var8 + var10Lifetime2;
        }
        if (var7 <= 0 ||
          var6 <= 0) {
          return;
        }
        ArgbSprite.blitArgbAlpha(SoftwareRasterizer.pixels, this.pixels, 0, var5, var4, var7, var6, var8, var9, opacity);
    }
}
