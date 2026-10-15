/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class Rasterizer2D {
    private static int[] field_k;
    static int clipRight;
    static int[] scanlineMaskWidths;
    static int clipBottom;
    static int[] pixels;
    private static int[] field_a;
    static int clipLeft;
    static int clipTop;
    static int height;
    private static int[] field_g;
    static int[] scanlineMaskOffsets;
    static int width;

    private final static void addRadialGlowScanlines(int sourceColor, int destinationColor, int colorSum, int distanceSquared, int distanceStepX, int distanceSecondDifferenceX, int radiusSquared, int destinationIndex, int[] destination, int peakIntensity, int[] colorRamp, int destinationRowSkip, int initialDistanceStepX, int negativeWidth, int rowDistanceSquared, int distanceStepY, int distanceSecondDifferenceY, int negativeHeight) {
        int negativeColumn = 0;
        while (negativeHeight < 0) {
          distanceSquared = rowDistanceSquared;
          distanceStepX = initialDistanceStepX;
          for (negativeColumn = negativeWidth; negativeColumn < 0; negativeColumn++) {
            if (distanceSquared < radiusSquared) {
              sourceColor = colorRamp[(radiusSquared - distanceSquared) * peakIntensity / radiusSquared];
              destinationColor = destination[destinationIndex];
              colorSum = sourceColor + destinationColor;
              sourceColor = (sourceColor & 16711935) + (destinationColor & 16711935);
              destinationColor = (sourceColor & 16777472) + (colorSum - sourceColor & 65536);
              destination[destinationIndex] = colorSum - destinationColor | destinationColor - (destinationColor >>> 8);
            }
            destinationIndex++;
            distanceSquared = distanceSquared + distanceStepX;
            distanceStepX = distanceStepX + distanceSecondDifferenceX;
          }
          destinationIndex = destinationIndex + destinationRowSkip;
          rowDistanceSquared = rowDistanceSquared + distanceStepY;
          distanceStepY = distanceStepY + distanceSecondDifferenceY;
          negativeHeight++;
        }
    }

    private final static void a(int param0, int[] param1, int param2, int param3, int param4, int param5) {
        while (param4 < 0) {
          param2 = param0 + param3 - 7;
          while (param0 < param2) {
            param1[param0] = (param1[param0] & 16711422) >> 1;
            param0++;
            param1[param0] = (param1[param0] & 16711422) >> 1;
            param0++;
            param1[param0] = (param1[param0] & 16711422) >> 1;
            param0++;
            param1[param0] = (param1[param0] & 16711422) >> 1;
            param0++;
            param1[param0] = (param1[param0] & 16711422) >> 1;
            param0++;
            param1[param0] = (param1[param0] & 16711422) >> 1;
            param0++;
            param1[param0] = (param1[param0] & 16711422) >> 1;
            param0++;
            param1[param0] = (param1[param0] & 16711422) >> 1;
            param0++;
          }
          param2 += 7;
          while (param0 < param2) {
            param1[param0] = (param1[param0] & 16711422) >> 1;
            param0++;
          }
          param0 = param0 + param5;
          param4++;
        }
    }

    final static void resetClip() {
        clipLeft = 0;
        clipTop = 0;
        clipRight = width;
        clipBottom = height;
        Rasterizer2D.clearScanlineMask();
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int incrementValue$5 = 0;
        int incrementValue$4 = 0;
        int incrementValue$6 = 0;
        int var24 = 0;
        int incrementValue$3 = 0;
        int incrementValue$0 = 0;
        int incrementValue$2 = 0;
        int incrementValue$1 = 0;
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
        int var17;
        int var18;
        int var19;
        int var20;
        int var21;
        int var22;
        int var23;
        int var25;
        int var15Lifetime1;
        int var16Lifetime1;
        int var16Lifetime2;
        int var17Lifetime1;
        int var18Lifetime1;
        int var19Lifetime1;
        int var19Lifetime2;
        int var20Lifetime1;
        int var20Lifetime2;
        int var21Lifetime1;
        int var21Lifetime2;
        int var22Lifetime1;
        int var22Lifetime2;
        int var23Lifetime1;
        int var23Lifetime2;
        if (param6 == 256) {
          Rasterizer2D.b(param0, param1, param2, param3, param4, param5);
          return;
        }
        if (param4 == 0) {
          Rasterizer2D.fillRectangleAlpha(param0, param1, param2, param3, param5, param6);
          return;
        }
        var7 = 256 - param6;
        param5 = ((param5 & 16711935) * param6 >> 8 & 16711935) + ((param5 & 65280) * param6 >> 8 & 65280);
        if (param4 < 0) {
          param4 = -param4;
        }
        var8 = param0 + param4;
        var9 = param1 + param4;
        var10 = param1;
        if (var10 < clipTop) {
          var10 = clipTop;
        }
        var11 = param1 + param3;
        if (var11 > clipBottom) {
          var11 = clipBottom;
        }
        var12 = param2 - param4 - param4 - 1;
        var13 = var10;
        var14 = param4 * param4;
        var15 = 0;
        var16 = var9 - var13;
        var17 = var16 * var16;
        var18 = var17 - var16;
        if (var9 > var11) {
          var9 = var11;
        }
        while (var13 < var9) {
          while (true) {
            if (var18 > var14 &&
              var17 > var14) {
              var19 = var8 - var15 + 1;
              if (var19 < clipLeft) {
                var19 = clipLeft;
              }
              var20 = var8 + var12 + var15;
              if (var20 > clipRight) {
                var20 = clipRight;
              }
              var21 = var19 + var13 * width;
              for (var22 = var19; var22 < var20; var22++) {
                var23 = pixels[var21];
                var23 = ((var23 & 16711935) * var7 >> 8 & 16711935) + ((var23 & 65280) * var7 >> 8 & 65280);
                incrementValue$5 = var21;
                var21++;
                pixels[incrementValue$5] = param5 + var23;
              }
              var13++;
              incrementValue$4 = var16;
              var16--;
              var17 = var17 - (incrementValue$4 + var16);
              var18 = var18 - (var16 + var16);
              break;
            }
            var17 = var17 + (var15 + var15);
            incrementValue$6 = var15;
            var15++;
            var18 = var18 + (incrementValue$6 + var15);
          }
        }
        var16Lifetime1 = var13 - var9;
        var19Lifetime1 = param0;
        if (var19Lifetime1 < clipLeft) {
          var19Lifetime1 = clipLeft;
        }
        var20Lifetime1 = param0 + param2;
        if (var20Lifetime1 > clipRight) {
          var20Lifetime1 = clipRight;
        }
        var21Lifetime1 = var19Lifetime1 + var13 * width;
        var22Lifetime1 = width + var19Lifetime1 - var20Lifetime1;
        var23Lifetime1 = param1 + param3 - param4 - 1;
        if (var23Lifetime1 > clipBottom) {
          var23Lifetime1 = clipBottom;
        }
        while (var13 < var23Lifetime1) {
          for (var24 = var19Lifetime1; var24 < var20Lifetime1; var24++) {
            var25 = pixels[var21Lifetime1];
            var25 = ((var25 & 16711935) * var7 >> 8 & 16711935) + ((var25 & 65280) * var7 >> 8 & 65280);
            incrementValue$3 = var21Lifetime1;
            var21Lifetime1++;
            pixels[incrementValue$3] = param5 + var25;
          }
          var13++;
          var21Lifetime1 = var21Lifetime1 + var22Lifetime1;
        }
        var16Lifetime2 = 0;
        var15Lifetime1 = param4;
        var18Lifetime1 = var16Lifetime2 * var16Lifetime2 + var14;
        var17Lifetime1 = var18Lifetime1 - var15Lifetime1;
        var18Lifetime1 = var18Lifetime1 - var16Lifetime2;
        while (var13 < var11) {
          while (var18Lifetime1 > var14) {
            if (var17Lifetime1 > var14) {
              incrementValue$0 = var15Lifetime1;
              var15Lifetime1--;
              var18Lifetime1 = var18Lifetime1 - (incrementValue$0 + var15Lifetime1);
              var17Lifetime1 = var17Lifetime1 - (var15Lifetime1 + var15Lifetime1);
              continue;
            }
            break;
          }
          var19Lifetime2 = var8 - var15Lifetime1;
          if (var19Lifetime2 < clipLeft) {
            var19Lifetime2 = clipLeft;
          }
          var20Lifetime2 = var8 + var12 + var15Lifetime1;
          if (var20Lifetime2 > clipRight - 1) {
            var20Lifetime2 = clipRight - 1;
          }
          var21Lifetime2 = var19Lifetime2 + var13 * width;
          for (var22Lifetime2 = var19Lifetime2; var22Lifetime2 <= var20Lifetime2; var22Lifetime2++) {
            var23Lifetime2 = pixels[var21Lifetime2];
            var23Lifetime2 = ((var23Lifetime2 & 16711935) * var7 >> 8 & 16711935) + ((var23Lifetime2 & 65280) * var7 >> 8 & 65280);
            incrementValue$2 = var21Lifetime2;
            var21Lifetime2++;
            pixels[incrementValue$2] = param5 + var23Lifetime2;
          }
          var13++;
          var18Lifetime1 = var18Lifetime1 + (var16Lifetime2 + var16Lifetime2);
          incrementValue$1 = var16Lifetime2;
          var16Lifetime2++;
          var17Lifetime1 = var17Lifetime1 + (incrementValue$1 + var16Lifetime2);
        }
        return;
    }

    final static void bind(int[] targetPixels, int targetWidth, int targetHeight) {
        pixels = targetPixels;
        width = targetWidth;
        height = targetHeight;
        Rasterizer2D.setClip(0, 0, targetWidth, targetHeight);
    }

    final static void drawVerticalLine(int x, int y, int length, int color) {
        int var4 = 0;
        int var5 = 0;
        if (x >= clipLeft) {
          if (x >= clipRight) {
            return;
          }
          if (y < clipTop) {
            length = length - (clipTop - y);
            y = clipTop;
          }
          if (y + length > clipBottom) {
            length = clipBottom - y;
          }
          var4 = x + y * width;
          var5 = 0;
          while (var5 < length) {
            pixels[var4] = color;
            var5++;
            var4 = var4 + width;
          }
          return;
        }
    }

    final static void f(int param0, int param1, int param2, int param3) {
        int incrementValue$4 = 0;
        int incrementValue$3 = 0;
        int incrementValue$5 = 0;
        int incrementValue$0 = 0;
        int incrementValue$2 = 0;
        int incrementValue$1 = 0;
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
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        int var14Lifetime1;
        int var15Lifetime1;
        if (param2 == 0) {
          Rasterizer2D.setPixel(param0, param1, param3);
          return;
        }
        if (param2 < 0) {
          param2 = -param2;
        }
        var4 = param1 - param2;
        if (var4 < clipTop) {
          var4 = clipTop;
        }
        var5 = param1 + param2 + 1;
        if (var5 > clipBottom) {
          var5 = clipBottom;
        }
        var6 = var4;
        var7 = param2 * param2;
        var8 = 0;
        var9 = param1 - var6;
        var10 = var9 * var9;
        var11 = var10 - var9;
        if (param1 > var5) {
          param1 = var5;
        }
        while (var6 < param1) {
          while (true) {
            if (var11 > var7 &&
              var10 > var7) {
              var12 = param0 - var8 + 1;
              if (var12 < clipLeft) {
                var12 = clipLeft;
              }
              var13 = param0 + var8;
              if (var13 > clipRight) {
                var13 = clipRight;
              }
              var14 = var12 + var6 * width;
              for (var15 = var12; var15 < var13; var15++) {
                incrementValue$4 = var14;
                var14++;
                pixels[incrementValue$4] = param3;
              }
              var6++;
              incrementValue$3 = var9;
              var9--;
              var10 = var10 - (incrementValue$3 + var9);
              var11 = var11 - (var9 + var9);
              break;
            }
            var10 = var10 + (var8 + var8);
            incrementValue$5 = var8;
            var8++;
            var11 = var11 + (incrementValue$5 + var8);
          }
        }
        var8Lifetime1 = param2;
        var9Lifetime1 = var6 - param1;
        var11Lifetime1 = var9Lifetime1 * var9Lifetime1 + var7;
        var10Lifetime1 = var11Lifetime1 - var8Lifetime1;
        var11Lifetime1 = var11Lifetime1 - var9Lifetime1;
        while (var6 < var5) {
          while (var11Lifetime1 > var7) {
            if (var10Lifetime1 > var7) {
              incrementValue$0 = var8Lifetime1;
              var8Lifetime1--;
              var11Lifetime1 = var11Lifetime1 - (incrementValue$0 + var8Lifetime1);
              var10Lifetime1 = var10Lifetime1 - (var8Lifetime1 + var8Lifetime1);
              continue;
            }
            break;
          }
          var12Lifetime1 = param0 - var8Lifetime1;
          if (var12Lifetime1 < clipLeft) {
            var12Lifetime1 = clipLeft;
          }
          var13Lifetime1 = param0 + var8Lifetime1;
          if (var13Lifetime1 > clipRight - 1) {
            var13Lifetime1 = clipRight - 1;
          }
          var14Lifetime1 = var12Lifetime1 + var6 * width;
          for (var15Lifetime1 = var12Lifetime1; var15Lifetime1 <= var13Lifetime1; var15Lifetime1++) {
            incrementValue$2 = var14Lifetime1;
            var14Lifetime1++;
            pixels[incrementValue$2] = param3;
          }
          var6++;
          var11Lifetime1 = var11Lifetime1 + (var9Lifetime1 + var9Lifetime1);
          incrementValue$1 = var9Lifetime1;
          var9Lifetime1++;
          var10Lifetime1 = var10Lifetime1 + (incrementValue$1 + var9Lifetime1);
        }
        return;
    }

    final static void darkenRectangle(int x, int y, int rectangleWidth, int rectangleHeight) {
        if (x < clipLeft) {
          rectangleWidth = rectangleWidth - (clipLeft - x);
          x = clipLeft;
        }
        if (y < clipTop) {
          rectangleHeight = rectangleHeight - (clipTop - y);
          y = clipTop;
        }
        if (x + rectangleWidth > clipRight) {
          rectangleWidth = clipRight - x;
        }
        if (y + rectangleHeight > clipBottom) {
          rectangleHeight = clipBottom - y;
        }
        int var4 = width - rectangleWidth;
        int var5 = x + y * width;
        Rasterizer2D.a(var5, pixels, 0, rectangleWidth, -rectangleHeight, var4);
    }

    final static void setClip(int left, int top, int right, int bottom) {
        if (left < 0) {
          left = 0;
        }
        if (top < 0) {
          top = 0;
        }
        if (right > width) {
          right = width;
        }
        if (bottom > height) {
          bottom = height;
        }
        clipLeft = left;
        clipTop = top;
        clipRight = right;
        clipBottom = bottom;
        Rasterizer2D.clearScanlineMask();
    }

    private final static void c(int param0, int param1, int param2, int param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int incrementValue$0 = 0;
        int var6Lifetime1;
        if (param1 >= clipTop) {
          if (param1 >= clipBottom) {
            return;
          }
          if (param0 < clipLeft) {
            param2 = param2 - (clipLeft - param0);
            param0 = clipLeft;
          }
          if (param0 + param2 > clipRight) {
            param2 = clipRight - param0;
          }
          var5 = param0 + param1 * width;
          var6 = (param3 & 16711935) * param4;
          param3 = (var6 & -16711936) + (param3 * param4 - var6 & 16711680) >>> 8;
          for (var7 = 0; var7 < param2; var7++) {
            var6Lifetime1 = pixels[var5];
            var8 = param3 + var6Lifetime1;
            var6Lifetime1 = (param3 & 16711935) + (var6Lifetime1 & 16711935);
            var6Lifetime1 = (var6Lifetime1 & 16777472) + (var8 - var6Lifetime1 & 65536);
            incrementValue$0 = var5;
            var5++;
            pixels[incrementValue$0] = var8 - var6Lifetime1 | var6Lifetime1 - (var6Lifetime1 >>> 8);
          }
          return;
        }
    }

    final static void c(int param0, int param1, int param2, int param3, int param4, int param5) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
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
        int var17;
        int var18;
        int var19;
        int var20;
        int var21;
        int var22;
        int var22Lifetime1;
        int var22Lifetime2;
        int var22Lifetime3;
        if (param4 == 0) {
          Rasterizer2D.drawRectangle(param0, param1, param2, param3, param5);
          return;
        }
        if (param4 < 0) {
          param4 = -param4;
        }
        var6 = param0 + param4;
        var7 = param1 + param4;
        var8 = param0 + param2 - param4 - 1;
        var9 = param1 + param3 - param4 - 1;
        if (clipRight > clipLeft) {
          if (clipBottom <= clipTop) {
            return;
          }
          if (param0 + param2 > clipLeft) {
            if (param0 < clipRight &&
              param1 + param3 >= clipTop &&
              param1 < clipBottom) {
              var10 = var6 + (var7 - param4) * width;
              var11 = var8 + (var7 - param4) * width;
              var12 = var6 + var7 * width;
              var13 = var8 + var7 * width;
              var14 = var6 + var9 * width;
              var15 = var8 + var9 * width;
              var16 = var6 + (var9 + param4) * width;
              var17 = var8 + (var9 + param4) * width;
              var18 = param4;
              var19 = 0;
              var20 = param4 * param4;
              var21 = var20 - var18;
              if (param0 >= clipLeft &&
                param0 + param2 < clipRight &&
                param1 >= clipTop &&
                param1 + param3 < clipBottom) {
                for (var22 = var12; var22 <= var14; var22 = var22 + width) {
                  pixels[var22 - var18] = param5;
                }
                for (var22Lifetime1 = var13; var22Lifetime1 <= var15; var22Lifetime1 = var22Lifetime1 + width) {
                  pixels[var22Lifetime1 + var18] = param5;
                }
                for (var22Lifetime2 = var10; var22Lifetime2 <= var11; var22Lifetime2++) {
                  pixels[var22Lifetime2] = param5;
                }
                for (var22Lifetime3 = var16; var22Lifetime3 <= var17; var22Lifetime3++) {
                  pixels[var22Lifetime3] = param5;
                }
                while (true) {
                  incrementValue$0 = var19;
                  var19++;
                  var21 = var21 + (incrementValue$0 + var19);
                  var12 = var12 - width;
                  var13 = var13 - width;
                  var14 = var14 + width;
                  var15 = var15 + width;
                  if (var21 > var20) {
                    var18--;
                    var21 = var21 - (var18 + var18);
                    var10 = var10 + width;
                    var11 = var11 + width;
                    var16 = var16 - width;
                    var17 = var17 - width;
                  }
                  if (var18 < var19) {
                    return;
                  }
                  pixels[var10 - var19] = param5;
                  pixels[var11 + var19] = param5;
                  pixels[var12 - var18] = param5;
                  pixels[var13 + var18] = param5;
                  pixels[var14 - var18] = param5;
                  pixels[var15 + var18] = param5;
                  pixels[var16 - var19] = param5;
                  pixels[var17 + var19] = param5;
                }
              }
              Rasterizer2D.drawVerticalLine(param0, param1 + var18, param3 - var18 - var18, param5);
              Rasterizer2D.drawVerticalLine(param0 + param2 - 1, param1 + var18, param3 - var18 - var18, param5);
              Rasterizer2D.drawHorizontalLine(param0 + var18, param1, param2 - var18 - var18, param5);
              Rasterizer2D.drawHorizontalLine(param0 + var18, param1 + param3 - 1, param2 - var18 - var18, param5);
              while (true) {
                incrementValue$1 = var19;
                var19++;
                var21 = var21 + (incrementValue$1 + var19);
                var12 = var12 - width;
                var13 = var13 - width;
                var14 = var14 + width;
                var15 = var15 + width;
                if (var21 > var20) {
                  var18--;
                  var21 = var21 - (var18 + var18);
                  var10 = var10 + width;
                  var11 = var11 + width;
                  var16 = var16 - width;
                  var17 = var17 - width;
                }
                if (var18 < var19) {
                  return;
                }
                if (var7 - var18 >= clipTop &&
                  var7 - var18 < clipBottom) {
                  if (var6 - var19 >= clipLeft &&
                    var6 - var19 < clipRight) {
                    pixels[var10 - var19] = param5;
                  }
                  if (var8 + var19 >= clipLeft &&
                    var8 + var19 < clipRight) {
                    pixels[var11 + var19] = param5;
                  }
                }
                if (var7 - var19 >= clipTop &&
                  var7 - var19 < clipBottom) {
                  if (var6 - var18 >= clipLeft &&
                    var6 - var18 < clipRight) {
                    pixels[var12 - var18] = param5;
                  }
                  if (var8 + var18 >= clipLeft &&
                    var8 + var18 < clipRight) {
                    pixels[var13 + var18] = param5;
                  }
                }
                if (var9 + var19 >= clipTop &&
                  var9 + var19 < clipBottom) {
                  if (var6 - var18 >= clipLeft &&
                    var6 - var18 < clipRight) {
                    pixels[var14 - var18] = param5;
                  }
                  if (var8 + var18 >= clipLeft &&
                    var8 + var18 < clipRight) {
                    pixels[var15 + var18] = param5;
                  }
                }
                if (var9 + var18 < clipTop) {
                  continue;
                }
                if (var9 + var18 >= clipBottom) {
                  continue;
                }
                if (var6 - var19 >= clipLeft &&
                  var6 - var19 < clipRight) {
                  pixels[var16 - var19] = param5;
                }
                if (var8 + var19 < clipLeft) {
                  continue;
                }
                if (var8 + var19 >= clipRight) {
                  continue;
                }
                pixels[var17 + var19] = param5;
              }
            }
            return;
          }
        }
        return;
    }

    private final static void a(int[] param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int incrementValue$7 = 0;
        int incrementValue$6 = 0;
        int incrementValue$2 = 0;
        int incrementValue$0 = 0;
        int[] stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        int stackIn_39_2 = 0;
        int[] stackIn_41_0 = null;
        int stackIn_41_1 = 0;
        int stackIn_42_2 = 0;
        int[] stackIn_44_0 = null;
        int stackIn_44_1 = 0;
        int stackIn_45_2 = 0;
        int[] var9;
        int[] var10;
        int[] var11;
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
        int var22;
        int var23;
        int[] var24;
        int[] var25;
        int[] var26;
        int[] var27;
        int[] var28;
        int[] var29;
        int var13Lifetime1;
        int var18Lifetime1;
        int var18Lifetime2;
        int var18Lifetime3;
        int var20Lifetime1;
        int var20Lifetime2;
        int var21Lifetime1;
        int var21Lifetime2;
        int var22Lifetime1;
        int var22Lifetime2;
        int var23Lifetime1;
        int var23Lifetime2;
        int var20Lifetime3;
        int var20Lifetime1Lifetime1;
        int var20Lifetime1Lifetime2;
        int var20Lifetime2Lifetime1;
        int var21Lifetime1Lifetime1;
        int var21Lifetime1Lifetime2;
        int var21Lifetime1Lifetime3;
        if (field_g == null ||
          !(field_g.length >= param8)) {
          field_g = new int[param8];
          field_a = new int[param8];
          field_k = new int[param8];
        }
        var27 = field_g;
        var24 = var27;
        var9 = var24;
        var28 = field_a;
        var25 = var28;
        var10 = var25;
        var29 = field_k;
        var26 = var29;
        var11 = var26;
        ArrayOperations.clearInts(var27, 0, param8);
        ArrayOperations.clearInts(var28, 0, param8);
        ArrayOperations.clearInts(var29, 0, param8);
        var12 = 16384 / (2 * param3 + 1);
        var13 = param4 - param3;
        if (var13 < 0) {
          var13 = 0;
        }
        var14 = param7 + var13 * width;
        var15 = param4 + param3;
        var16 = 0;
        if (var15 >= height) {
          var16 = var15 - height + 1;
          var15 = height - 1;
        }
        var17 = var15 - var13 + 1;
        while (var13 <= var15) {
          for (var18 = 0; var18 < param8; var18++) {
            param1 = param0[var14++];
            var9[var18] = var9[var18] + (param1 >> 16 & 255);
            var10[var18] = var10[var18] + (param1 >> 8 & 255);
            var11[var18] = var11[var18] + (param1 & 255);
          }
          var14 = var14 + param6;
          var13++;
        }
        var14 = var14 + var16 * width;
        for (var18Lifetime1 = 0; var18Lifetime1 < param8; var18Lifetime1++) {
          incrementValue$7 = param2;
          param2++;
          param0[incrementValue$7] = (var27[var18Lifetime1] / var17 << 16) + (var28[var18Lifetime1] / var17 << 8) + var29[var18Lifetime1] / var17;
        }
        param2 = param2 + param6;
        var13Lifetime1 = 1 - param5;
        var18Lifetime2 = 1 + param3 - param5 - param4;
        if (0 < var18Lifetime2) {
          var18Lifetime2 = 0;
        }
        var19 = param7 + (param4 - param3) * width;
        if (var13Lifetime1 < var18Lifetime2) {
          var19 = var19 + (var18Lifetime2 - var13Lifetime1) * width;
        }
        while (var13Lifetime1 < var18Lifetime2) {
          if (var13Lifetime1 + param4 + param5 + param3 < clipBottom) {
            for (var20 = 0; var20 < param8; var20++) {
              param1 = param0[var14++];
              var9[var20] = var9[var20] + (param1 >> 16 & 255);
              var10[var20] = var10[var20] + (param1 >> 8 & 255);
              var11[var20] = var11[var20] + (param1 & 255);
            }
            var14 = var14 + param6;
            var17++;
          } else {
            var14 = var14 + width;
          }
          for (var20Lifetime3 = 0; var20Lifetime3 < param8; var20Lifetime3++) {
            var21 = var27[var20Lifetime3] / var17;
            var22 = var28[var20Lifetime3] / var17;
            var23 = var29[var20Lifetime3] / var17;
            incrementValue$6 = param2;
            param2++;
            param0[incrementValue$6] = (var21 << 16) + (var22 << 8) + var23;
          }
          param2 = param2 + param6;
          var13Lifetime1++;
        }
        var18Lifetime3 = height - param4 - param5 - param3;
        if (0 < var18Lifetime3) {
          var18Lifetime3 = 0;
        }
        while (var13Lifetime1 < var18Lifetime3) {
          for (var20Lifetime1 = 0; var20Lifetime1 < param8; var20Lifetime1++) {
            param1 = param0[var19++];
            var21Lifetime1 = var27[var20Lifetime1] - (param1 >> 16 & 255);
            stackIn_38_0 = var9;
            stackIn_38_1 = var20Lifetime1;
            if (var21Lifetime1 >= 0) {
              stackIn_39_2 = var21Lifetime1;
            } else {
              stackIn_39_2 = 0;
            }
            stackIn_38_0[stackIn_38_1] = stackIn_39_2;
            var21Lifetime1Lifetime2 = var28[var20Lifetime1] - (param1 >> 8 & 255);
            stackIn_41_0 = var10;
            stackIn_41_1 = var20Lifetime1;
            if (var21Lifetime1Lifetime2 >= 0) {
              stackIn_42_2 = var21Lifetime1Lifetime2;
            } else {
              stackIn_42_2 = 0;
            }
            stackIn_41_0[stackIn_41_1] = stackIn_42_2;
            var21Lifetime1Lifetime3 = var29[var20Lifetime1] - (param1 & 255);
            stackIn_44_0 = var11;
            stackIn_44_1 = var20Lifetime1;
            if (var21Lifetime1Lifetime3 >= 0) {
              stackIn_45_2 = var21Lifetime1Lifetime3;
            } else {
              stackIn_45_2 = 0;
            }
            stackIn_44_0[stackIn_44_1] = stackIn_45_2;
          }
          var19 = var19 + param6;
          for (var20Lifetime1Lifetime1 = 0; var20Lifetime1Lifetime1 < param8; var20Lifetime1Lifetime1++) {
            param1 = param0[var14++];
            var9[var20Lifetime1Lifetime1] = var9[var20Lifetime1Lifetime1] + (param1 >> 16 & 255);
            var10[var20Lifetime1Lifetime1] = var10[var20Lifetime1Lifetime1] + (param1 >> 8 & 255);
            var11[var20Lifetime1Lifetime1] = var11[var20Lifetime1Lifetime1] + (param1 & 255);
          }
          var14 = var14 + param6;
          for (var20Lifetime1Lifetime2 = 0; var20Lifetime1Lifetime2 < param8; var20Lifetime1Lifetime2++) {
            var21Lifetime1Lifetime1 = var27[var20Lifetime1Lifetime2] * var12 >> 14;
            var22Lifetime1 = var28[var20Lifetime1Lifetime2] * var12 >> 14;
            var23Lifetime1 = var29[var20Lifetime1Lifetime2] * var12 >> 14;
            if (var21Lifetime1Lifetime1 > 255) {
              var21Lifetime1Lifetime1 = 255;
            }
            if (var22Lifetime1 > 255) {
              var22Lifetime1 = 255;
            }
            if (var23Lifetime1 > 255) {
              var23Lifetime1 = 255;
            }
            incrementValue$2 = param2;
            param2++;
            param0[incrementValue$2] = (var21Lifetime1Lifetime1 << 16) + (var22Lifetime1 << 8) + var23Lifetime1;
          }
          param2 = param2 + param6;
          var13Lifetime1++;
        }
        while (var13Lifetime1 < 0) {
          for (var20Lifetime2 = 0; var20Lifetime2 < param8; var20Lifetime2++) {
            param1 = param0[var19++];
            var9[var20Lifetime2] = var9[var20Lifetime2] - (param1 >> 16 & 255);
            var10[var20Lifetime2] = var10[var20Lifetime2] - (param1 >> 8 & 255);
            var11[var20Lifetime2] = var11[var20Lifetime2] - (param1 & 255);
          }
          var19 = var19 + param6;
          var17--;
          for (var20Lifetime2Lifetime1 = 0; var20Lifetime2Lifetime1 < param8; var20Lifetime2Lifetime1++) {
            var21Lifetime2 = var27[var20Lifetime2Lifetime1] / var17;
            var22Lifetime2 = var28[var20Lifetime2Lifetime1] / var17;
            var23Lifetime2 = var29[var20Lifetime2Lifetime1] / var17;
            if (var21Lifetime2 >= 0) {
              if (var21Lifetime2 > 255) {
                var21Lifetime2 = 255;
              }
            } else {
              var21Lifetime2 = 0;
            }
            if (var22Lifetime2 >= 0) {
              if (var22Lifetime2 > 255) {
                var22Lifetime2 = 255;
              }
            } else {
              var22Lifetime2 = 0;
            }
            if (var23Lifetime2 >= 0) {
              if (var23Lifetime2 > 255) {
                var23Lifetime2 = 255;
              }
            } else {
              var23Lifetime2 = 0;
            }
            incrementValue$0 = param2;
            param2++;
            param0[incrementValue$0] = (var21Lifetime2 << 16) + (var22Lifetime2 << 8) + var23Lifetime2;
          }
          param2 = param2 + param6;
          var13Lifetime1++;
        }
    }

    final static void fillVerticalGradient(int x, int y, int rectangleWidth, int rectangleHeight, int topColor, int bottomColor) {
        int var10 = 0;
        int var14 = 0;
        int incrementValue$0 = 0;
        int var6;
        int var7;
        int var8;
        int var9;
        int var11;
        int var12;
        int var13;
        var6 = 0;
        var7 = 65536 / rectangleHeight;
        if (x < clipLeft) {
          rectangleWidth = rectangleWidth - (clipLeft - x);
          x = clipLeft;
        }
        if (y < clipTop) {
          var6 = var6 + (clipTop - y) * var7;
          rectangleHeight = rectangleHeight - (clipTop - y);
          y = clipTop;
        }
        if (x + rectangleWidth > clipRight) {
          rectangleWidth = clipRight - x;
        }
        if (y + rectangleHeight > clipBottom) {
          rectangleHeight = clipBottom - y;
        }
        var8 = width - rectangleWidth;
        var9 = x + y * width;
        for (var10 = -rectangleHeight; var10 < 0; var10++) {
          var11 = 65536 - var6 >> 8;
          var12 = var6 >> 8;
          var13 = ((topColor & 16711935) * var11 + (bottomColor & 16711935) * var12 & -16711936) + ((topColor & 65280) * var11 + (bottomColor & 65280) * var12 & 16711680) >>> 8;
          for (var14 = -rectangleWidth; var14 < 0; var14++) {
            incrementValue$0 = var9;
            var9++;
            pixels[incrementValue$0] = var13;
          }
          var9 = var9 + var8;
          var6 = var6 + var7;
        }
    }

    final static void drawLine(int x1, int y1, int x2, int y2, int color) {
        int var5;
        int var6;
        int var5Lifetime1;
        int var6Lifetime1;
        x2 = x2 - x1;
        y2 = y2 - y1;
        if (y2 == 0) {
          if (x2 < 0) {
            Rasterizer2D.drawHorizontalLine(x1 + x2, y1, -x2 + 1, color);
          } else {
            Rasterizer2D.drawHorizontalLine(x1, y1, x2 + 1, color);
          }
          return;
        }
        if (x2 == 0) {
          if (y2 < 0) {
            Rasterizer2D.drawVerticalLine(x1, y1 + y2, -y2 + 1, color);
          } else {
            Rasterizer2D.drawVerticalLine(x1, y1, y2 + 1, color);
          }
          return;
        }
        if (x2 + y2 < 0) {
          x1 = x1 + x2;
          x2 = -x2;
          y1 = y1 + y2;
          y2 = -y2;
        }
        if (x2 <= y2) {
          x1 = x1 << 16;
          x1 = x1 + 32768;
          x2 = x2 << 16;
          var5 = (int)Math.floor((double)x2 / (double)y2 + 0.5);
          y2 = y2 + y1;
          if (y1 < clipTop) {
            x1 = x1 + var5 * (clipTop - y1);
            y1 = clipTop;
          }
          if (y2 >= clipBottom) {
            y2 = clipBottom - 1;
          }
          while (y1 <= y2) {
            var6 = x1 >> 16;
            if (var6 >= clipLeft &&
              var6 < clipRight) {
              pixels[var6 + y1 * width] = color;
            }
            x1 = x1 + var5;
            y1++;
          }
          return;
        }
        y1 = y1 << 16;
        y1 = y1 + 32768;
        y2 = y2 << 16;
        var5Lifetime1 = (int)Math.floor((double)y2 / (double)x2 + 0.5);
        x2 = x2 + x1;
        if (x1 < clipLeft) {
          y1 = y1 + var5Lifetime1 * (clipLeft - x1);
          x1 = clipLeft;
        }
        if (x2 >= clipRight) {
          x2 = clipRight - 1;
        }
        while (x1 <= x2) {
          var6Lifetime1 = y1 >> 16;
          if (var6Lifetime1 >= clipTop &&
            var6Lifetime1 < clipBottom) {
            pixels[x1 + var6Lifetime1 * width] = color;
          }
          y1 = y1 + var5Lifetime1;
          x1++;
        }
    }

    final static void drawHorizontalLine(int x, int y, int length, int color) {
        int var4 = 0;
        int var5 = 0;
        if (y >= clipTop) {
          if (y >= clipBottom) {
            return;
          }
          if (x < clipLeft) {
            length = length - (clipLeft - x);
            x = clipLeft;
          }
          if (x + length > clipRight) {
            length = clipRight - x;
          }
          var4 = x + y * width;
          for (var5 = 0; var5 < length; var5++) {
            pixels[var4 + var5] = color;
          }
          return;
        }
    }

    private final static boolean a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int[] param9, int param10, int[] param11, int param12, int param13, int param14) {
        param3 = param14;
        param4 = param13;
        while (param8 < 0) {
          param1 = (param6 - param3) * param10 / param6;
          if (param1 >= param11.length) {
            return true;
          }
          param0 = param11[param1];
          param1 = param9[param7];
          param2 = param0 + param1;
          param0 = (param0 & 16711935) + (param1 & 16711935);
          param1 = (param0 & 16777472) + (param2 - param0 & 65536);
          param9[param7] = param2 - param1 | param1 - (param1 >>> 8);
          param7 = param7 + param12;
          param3 = param3 + param4;
          param4 = param4 + param5;
          param8++;
        }
        return false;
    }

    private final static void h(int param0, int param1, int param2, int param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var6Lifetime1;
        int var6Lifetime1Lifetime1;
        if (param0 >= clipLeft) {
          if (param0 >= clipRight) {
            return;
          }
          if (param1 < clipTop) {
            param2 = param2 - (clipTop - param1);
            param1 = clipTop;
          }
          if (param1 + param2 > clipBottom) {
            param2 = clipBottom - param1;
          }
          var5 = param0 + param1 * width;
          var6 = (param3 & 16711935) * param4;
          param3 = (var6 & -16711936) + (param3 * param4 - var6 & 16711680) >>> 8;
          for (var7 = 0; var7 < param2; var7++) {
            var6Lifetime1 = pixels[var5];
            var8 = param3 + var6Lifetime1;
            var9 = (param3 & 16711935) + (var6Lifetime1 & 16711935);
            var6Lifetime1Lifetime1 = (var9 & 16777472) + (var8 - var9 & 65536);
            pixels[var5] = var8 - var6Lifetime1Lifetime1 | var6Lifetime1Lifetime1 - (var6Lifetime1Lifetime1 >>> 8);
            var5 = var5 + width;
          }
          return;
        }
    }

    final static void clear() {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$8 = 0;
        int var0 = 0;
        int var1 = width * height - 7;
        while (var0 < var1) {
          incrementValue$0 = var0;
          var0++;
          pixels[incrementValue$0] = 0;
          incrementValue$1 = var0;
          var0++;
          pixels[incrementValue$1] = 0;
          incrementValue$2 = var0;
          var0++;
          pixels[incrementValue$2] = 0;
          incrementValue$3 = var0;
          var0++;
          pixels[incrementValue$3] = 0;
          incrementValue$4 = var0;
          var0++;
          pixels[incrementValue$4] = 0;
          incrementValue$5 = var0;
          var0++;
          pixels[incrementValue$5] = 0;
          incrementValue$6 = var0;
          var0++;
          pixels[incrementValue$6] = 0;
          incrementValue$7 = var0;
          var0++;
          pixels[incrementValue$7] = 0;
        }
        var1 += 7;
        while (var0 < var1) {
          incrementValue$8 = var0;
          var0++;
          pixels[incrementValue$8] = 0;
        }
    }

    final static void setPixel(int x, int y, int color) {
        if (x >= clipLeft) {
          if (y < clipTop ||
            x >= clipRight ||
            y >= clipBottom) {
            return;
          }
          pixels[x + y * width] = color;
          return;
        }
    }

    final static void fillRectangleAlpha(int x, int y, int rectangleWidth, int rectangleHeight, int color, int alpha256) {
        int var9 = 0;
        int var10 = 0;
        int incrementValue$0 = 0;
        int var6;
        int var7;
        int var8;
        int var11;
        if (x < clipLeft) {
          rectangleWidth = rectangleWidth - (clipLeft - x);
          x = clipLeft;
        }
        if (y < clipTop) {
          rectangleHeight = rectangleHeight - (clipTop - y);
          y = clipTop;
        }
        if (x + rectangleWidth > clipRight) {
          rectangleWidth = clipRight - x;
        }
        if (y + rectangleHeight > clipBottom) {
          rectangleHeight = clipBottom - y;
        }
        color = ((color & 16711935) * alpha256 >> 8 & 16711935) + ((color & 65280) * alpha256 >> 8 & 65280);
        var6 = 256 - alpha256;
        var7 = width - rectangleWidth;
        var8 = x + y * width;
        for (var9 = 0; var9 < rectangleHeight; var9++) {
          for (var10 = -rectangleWidth; var10 < 0; var10++) {
            var11 = pixels[var8];
            var11 = ((var11 & 16711935) * var6 >> 8 & 16711935) + ((var11 & 65280) * var6 >> 8 & 65280);
            incrementValue$0 = var8;
            var8++;
            pixels[incrementValue$0] = color + var11;
          }
          var8 = var8 + var7;
        }
    }

    final static void intersectClip(int left, int top, int right, int bottom) {
        if (clipLeft < left) {
          clipLeft = left;
        }
        if (clipTop < top) {
          clipTop = top;
        }
        if (clipRight > right) {
          clipRight = right;
        }
        if (clipBottom > bottom) {
          clipBottom = bottom;
        }
        Rasterizer2D.clearScanlineMask();
    }

    final static void restoreClip(int[] saved) {
        clipLeft = saved[0];
        clipTop = saved[1];
        clipRight = saved[2];
        clipBottom = saved[3];
        Rasterizer2D.clearScanlineMask();
    }

    final static void f(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var6Lifetime1;
        int var6Lifetime2;
        int var7Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        int var6Lifetime1Lifetime1;
        int var6Lifetime2Lifetime1;
        param2 = param2 - param0;
        param3 = param3 - param1;
        if (param3 == 0) {
          if (param2 < 0) {
            Rasterizer2D.c(param0 + param2, param1, -param2 + 1, param4, param5);
          } else {
            Rasterizer2D.c(param0, param1, param2 + 1, param4, param5);
          }
          return;
        }
        if (param2 == 0) {
          if (param3 < 0) {
            Rasterizer2D.h(param0, param1 + param3, -param3 + 1, param4, param5);
          } else {
            Rasterizer2D.h(param0, param1, param3 + 1, param4, param5);
          }
          return;
        }
        var6 = (param4 & 16711935) * param5;
        param4 = (var6 & -16711936) + (param4 * param5 - var6 & 16711680) >>> 8;
        if (param2 + param3 < 0) {
          param0 = param0 + param2;
          param2 = -param2;
          param1 = param1 + param3;
          param3 = -param3;
        }
        if (param2 <= param3) {
          param0 = param0 << 16;
          param0 = param0 + 32768;
          param2 = param2 << 16;
          var9 = (int)Math.floor((double)param2 / (double)param3 + 0.5);
          param3 = param3 + param1;
          if (param1 < clipTop) {
            param0 = param0 + var9 * (clipTop - param1);
            param1 = clipTop;
          }
          if (param3 >= clipBottom) {
            param3 = clipBottom - 1;
          }
          while (param1 <= param3) {
            var10 = param0 >> 16;
            if (var10 >= clipLeft &&
              var10 < clipRight) {
              var8 = var10 + param1 * width;
              var6Lifetime1 = pixels[var8];
              var7 = param4 + var6Lifetime1;
              var11 = (param4 & 16711935) + (var6Lifetime1 & 16711935);
              var6Lifetime1Lifetime1 = (var11 & 16777472) + (var7 - var11 & 65536);
              pixels[var8] = var7 - var6Lifetime1Lifetime1 | var6Lifetime1Lifetime1 - (var6Lifetime1Lifetime1 >>> 8);
            }
            param0 = param0 + var9;
            param1++;
          }
          return;
        }
        param1 = param1 << 16;
        param1 = param1 + 32768;
        param3 = param3 << 16;
        var9Lifetime1 = (int)Math.floor((double)param3 / (double)param2 + 0.5);
        param2 = param2 + param0;
        if (param0 < clipLeft) {
          param1 = param1 + var9Lifetime1 * (clipLeft - param0);
          param0 = clipLeft;
        }
        if (param2 >= clipRight) {
          param2 = clipRight - 1;
        }
        while (param0 <= param2) {
          var10Lifetime1 = param1 >> 16;
          if (var10Lifetime1 >= clipTop &&
            var10Lifetime1 < clipBottom) {
            var8Lifetime1 = param0 + var10Lifetime1 * width;
            var6Lifetime2 = pixels[var8Lifetime1];
            var7Lifetime1 = param4 + var6Lifetime2;
            var11Lifetime1 = (param4 & 16711935) + (var6Lifetime2 & 16711935);
            var6Lifetime2Lifetime1 = (var11Lifetime1 & 16777472) + (var7Lifetime1 - var11Lifetime1 & 65536);
            pixels[var8Lifetime1] = var7Lifetime1 - var6Lifetime2Lifetime1 | var6Lifetime2Lifetime1 - (var6Lifetime2Lifetime1 >>> 8);
          }
          param1 = param1 + var9Lifetime1;
          param0++;
        }
        return;
    }

    final static void b(int param0, int param1, int param2, int param3, int[] param4) {
        int var16 = 0;
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
        int var17;
        int var18;
        int var19;
        int var20;
        int var21;
        int var22;
        int var23;
        int var24;
        int var25;
        int var26;
        int var27;
        int var28;
        int var29;
        int var21Lifetime1;
        int var21Lifetime2;
        int var22Lifetime1;
        int var22Lifetime2;
        var5 = param2 * param2;
        var6 = param1 - param2 >> 4;
        var7 = param1 + param2 + 15 >> 4;
        if (var6 < clipTop) {
          var6 = clipTop;
        }
        if (var7 > clipBottom) {
          var7 = clipBottom;
        }
        var8 = (var6 << 4) - param1;
        var8 = var8 * var8;
        var9 = (var6 + 1 << 4) - param1;
        var9 = var9 * var9;
        var10 = (var6 + 2 << 4) - param1;
        var10 = var10 * var10;
        var11 = var9 - var8;
        var12 = var10 - var9;
        var13 = var12 - var11;
        var14 = var6 * width;
        var15 = width;
        for (var16 = var6 - var7; var16 < 0; var16++) {
          var17 = param0 - param2 >> 4;
          var18 = param0 + param2 + 15 >> 4;
          if (var17 < clipLeft) {
            var17 = clipLeft;
          }
          if (var18 > clipRight) {
            var18 = clipRight;
          }
          var19 = param0 + 15 >> 4;
          var20 = var19;
          while (var17 < var19) {
            var21 = var17 + var19 >> 1;
            var22 = (var21 << 4) - param0;
            var22 = var22 * var22;
            if (var8 + var22 >= var5) {
              var17 = var21 + 1;
              continue;
            }
            var19 = var21;
          }
          while (var18 > var20) {
            var21Lifetime1 = var20 + var18 >> 1;
            var22Lifetime1 = (var21Lifetime1 << 4) - param0;
            var22Lifetime1 = var22Lifetime1 * var22Lifetime1;
            if (var8 + var22Lifetime1 >= var5) {
              var18 = var21Lifetime1;
              continue;
            }
            var20 = var21Lifetime1 + 1;
          }
          var21Lifetime2 = (var17 << 4) - param0;
          var21Lifetime2 = var21Lifetime2 * var21Lifetime2;
          var22Lifetime2 = (var17 + 1 << 4) - param0;
          var22Lifetime2 = var22Lifetime2 * var22Lifetime2;
          var23 = (var17 + 2 << 4) - param0;
          var23 = var23 * var23;
          var24 = var22Lifetime2 - var21Lifetime2;
          var25 = var23 - var22Lifetime2;
          var26 = var25 - var24;
          var27 = (var18 - 1 << 4) - param0;
          var27 = var27 * var27;
          var28 = (var18 - 2 << 4) - param0;
          var28 = var28 * var28;
          var29 = var28 - var27;
          if (Rasterizer2D.a(0, 0, 0, 0, 0, var26, var5, var14 + var17, var17 - var18, pixels, param3, param4, 1, var24, var8 + var21Lifetime2)) {
            Rasterizer2D.a(0, 0, 0, 0, 0, var26, var5, var14 + var18 - 1, var17 - var18, pixels, param3, param4, -1, var29, var8 + var27);
          }
          var14 = var14 + var15;
          var8 = var8 + var11;
          var11 = var11 + var13;
        }
    }

    final static void grayscaleRectangle(int x, int y, int rectangleWidth, int rectangleHeight) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int incrementValue$0 = 0;
        if (x < clipLeft) {
          rectangleWidth = rectangleWidth - (clipLeft - x);
          x = clipLeft;
        }
        if (x + rectangleWidth > clipRight) {
          rectangleWidth = clipRight - x;
        }
        if (y < clipTop) {
          rectangleHeight = rectangleHeight - (clipTop - y);
          y = clipTop;
        }
        if (y + rectangleHeight > clipBottom) {
          rectangleHeight = clipBottom - y;
        }
        int var4 = x + y * width;
        if (rectangleWidth > 0) {
          if (rectangleHeight <= 0) {
            return;
          }
          for (var5 = 0; var5 < rectangleHeight; var5++) {
            for (var6 = 0; var6 < rectangleWidth; var6++) {
              var7 = pixels[var4];
              var8 = var7 >> 15 & 510;
              var9 = var7 >> 8 & 255;
              var10 = var7 & 255;
              var11 = (var10 + var8) / 3 + var9 >> 1;
              incrementValue$0 = var4;
              var4++;
              pixels[incrementValue$0] = (var11 << 16) + (var11 << 8) + var11;
            }
            var4 = var4 + (width - rectangleWidth);
          }
          return;
        }
    }

    private final static void drawHorizontalLineAlpha(int x, int y, int length, int color, int alpha256) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var12 = 0;
        int var13 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var14 = 0;
        int incrementValue$0 = 0;
        if (y >= clipTop) {
          if (y >= clipBottom) {
            return;
          }
          if (x < clipLeft) {
            length = length - (clipLeft - x);
            x = clipLeft;
          }
          if (x + length > clipRight) {
            length = clipRight - x;
          }
          var5 = 256 - alpha256;
          var6 = (color >> 16 & 255) * alpha256;
          var7 = (color >> 8 & 255) * alpha256;
          var8 = (color & 255) * alpha256;
          var12 = x + y * width;
          for (var13 = 0; var13 < length; var13++) {
            var9 = (pixels[var12] >> 16 & 255) * var5;
            var10 = (pixels[var12] >> 8 & 255) * var5;
            var11 = (pixels[var12] & 255) * var5;
            var14 = (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8) + (var8 + var11 >> 8);
            incrementValue$0 = var12;
            var12++;
            pixels[incrementValue$0] = var14;
          }
          return;
        }
    }

    final static void drawRadialGlow(int centerX16, int centerY16, int radius16, int peakIntensity, int[] colorRamp) {
        int radiusSquared = radius16 * radius16;
        int left = centerX16 - radius16 >> 4;
        int right = centerX16 + radius16 + 15 >> 4;
        int top = centerY16 - radius16 >> 4;
        int bottom = centerY16 + radius16 + 15 >> 4;
        if (left < clipLeft) {
          left = clipLeft;
        }
        if (right > clipRight) {
          right = clipRight;
        }
        if (top < clipTop) {
          top = clipTop;
        }
        if (bottom > clipBottom) {
          bottom = clipBottom;
        }
        int leftDistanceSquared = (left << 4) - centerX16;
        leftDistanceSquared = leftDistanceSquared * leftDistanceSquared;
        int nextXDistanceSquared = (left + 1 << 4) - centerX16;
        nextXDistanceSquared = nextXDistanceSquared * nextXDistanceSquared;
        int nextNextXDistanceSquared = (left + 2 << 4) - centerX16;
        nextNextXDistanceSquared = nextNextXDistanceSquared * nextNextXDistanceSquared;
        int xDistanceStep = nextXDistanceSquared - leftDistanceSquared;
        int nextXDistanceStep = nextNextXDistanceSquared - nextXDistanceSquared;
        int xDistanceSecondDifference = nextXDistanceStep - xDistanceStep;
        int topDistanceSquared = (top << 4) - centerY16;
        topDistanceSquared = topDistanceSquared * topDistanceSquared;
        int nextYDistanceSquared = (top + 1 << 4) - centerY16;
        nextYDistanceSquared = nextYDistanceSquared * nextYDistanceSquared;
        int nextNextYDistanceSquared = (top + 2 << 4) - centerY16;
        nextNextYDistanceSquared = nextNextYDistanceSquared * nextNextYDistanceSquared;
        int yDistanceStep = nextYDistanceSquared - topDistanceSquared;
        int nextYDistanceStep = nextNextYDistanceSquared - nextYDistanceSquared;
        int yDistanceSecondDifference = nextYDistanceStep - yDistanceStep;
        int destinationIndex = left + top * width;
        int destinationRowSkip = width + left - right;
        Rasterizer2D.addRadialGlowScanlines(0, 0, 0, 0, 0, xDistanceSecondDifference, radiusSquared, destinationIndex, pixels, peakIntensity, colorRamp, destinationRowSkip, xDistanceStep, left - right, topDistanceSquared + leftDistanceSquared, yDistanceStep, yDistanceSecondDifference, top - bottom);
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var5 = 0;
        for (var6 = 0; var6 < 4; var6++) {
          var5 = 128 - (var6 << 5);
          Rasterizer2D.drawHorizontalLineAlpha(param0 + var6, param1 + param3 + var6, param2, param4, var5);
          Rasterizer2D.drawVerticalLineAlpha(param0 + param2 + var6, param1 + var6, param3 + 1, param4, var5);
        }
    }

    final static void drawRectangle(int x, int y, int rectangleWidth, int rectangleHeight, int color) {
        Rasterizer2D.drawHorizontalLine(x, y, rectangleWidth, color);
        Rasterizer2D.drawHorizontalLine(x, y + rectangleHeight - 1, rectangleWidth, color);
        Rasterizer2D.drawVerticalLine(x, y, rectangleHeight, color);
        Rasterizer2D.drawVerticalLine(x + rectangleWidth - 1, y, rectangleHeight, color);
    }

    final static void e(int param0, int param1, int param2, int param3, int param4, int param5) {
        Rasterizer2D.a(pixels, 0, param2 + param3 * width, param0, param2, param4, width - param4, param5);
        Rasterizer2D.a(pixels, 0, param2 + param3 * width, param1, param3, param5, width - param4, param2, param4);
    }

    private final static void drawVerticalLineAlpha(int x, int y, int length, int color, int alpha256) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var12 = 0;
        int var13 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var14 = 0;
        if (x >= clipLeft) {
          if (x >= clipRight) {
            return;
          }
          if (y < clipTop) {
            length = length - (clipTop - y);
            y = clipTop;
          }
          if (y + length > clipBottom) {
            length = clipBottom - y;
          }
          var5 = 256 - alpha256;
          var6 = (color >> 16 & 255) * alpha256;
          var7 = (color >> 8 & 255) * alpha256;
          var8 = (color & 255) * alpha256;
          var12 = x + y * width;
          for (var13 = 0; var13 < length; var13++) {
            var9 = (pixels[var12] >> 16 & 255) * var5;
            var10 = (pixels[var12] >> 8 & 255) * var5;
            var11 = (pixels[var12] & 255) * var5;
            var14 = (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8) + (var8 + var11 >> 8);
            pixels[var12] = var14;
            var12 = var12 + width;
          }
          return;
        }
    }

    final static void fillRectangle(int x, int y, int rectangleWidth, int rectangleHeight, int color) {
        int var7 = 0;
        int var8 = 0;
        int incrementValue$0 = 0;
        if (x < clipLeft) {
          rectangleWidth = rectangleWidth - (clipLeft - x);
          x = clipLeft;
        }
        if (y < clipTop) {
          rectangleHeight = rectangleHeight - (clipTop - y);
          y = clipTop;
        }
        if (x + rectangleWidth > clipRight) {
          rectangleWidth = clipRight - x;
        }
        if (y + rectangleHeight > clipBottom) {
          rectangleHeight = clipBottom - y;
        }
        int var5 = width - rectangleWidth;
        int var6 = x + y * width;
        for (var7 = -rectangleHeight; var7 < 0; var7++) {
          for (var8 = -rectangleWidth; var8 < 0; var8++) {
            incrementValue$0 = var6;
            var6++;
            pixels[incrementValue$0] = color;
          }
          var6 = var6 + var5;
        }
    }

    final static void b(int param0, int param1, int param2, int param3, int param4, int param5) {
        int incrementValue$5 = 0;
        int incrementValue$4 = 0;
        int incrementValue$6 = 0;
        int var22 = 0;
        int incrementValue$3 = 0;
        int incrementValue$0 = 0;
        int incrementValue$2 = 0;
        int incrementValue$1 = 0;
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
        int var17;
        int var18;
        int var19;
        int var20;
        int var21;
        int var13Lifetime1;
        int var14Lifetime1;
        int var14Lifetime2;
        int var15Lifetime1;
        int var16Lifetime1;
        int var17Lifetime1;
        int var17Lifetime2;
        int var18Lifetime1;
        int var18Lifetime2;
        int var19Lifetime1;
        int var19Lifetime2;
        int var20Lifetime1;
        int var20Lifetime2;
        if (param4 == 0) {
          Rasterizer2D.fillRectangle(param0, param1, param2, param3, param5);
          return;
        }
        if (param4 < 0) {
          param4 = -param4;
        }
        var6 = param0 + param4;
        var7 = param1 + param4;
        var8 = param1;
        if (var8 < clipTop) {
          var8 = clipTop;
        }
        var9 = param1 + param3;
        if (var9 > clipBottom) {
          var9 = clipBottom;
        }
        var10 = param2 - param4 - param4 - 1;
        var11 = var8;
        var12 = param4 * param4;
        var13 = 0;
        var14 = var7 - var11;
        var15 = var14 * var14;
        var16 = var15 - var14;
        if (var7 > var9) {
          var7 = var9;
        }
        while (var11 < var7) {
          while (true) {
            if (var16 > var12 &&
              var15 > var12) {
              var17 = var6 - var13 + 1;
              if (var17 < clipLeft) {
                var17 = clipLeft;
              }
              var18 = var6 + var10 + var13;
              if (var18 > clipRight) {
                var18 = clipRight;
              }
              var19 = var17 + var11 * width;
              for (var20 = var17; var20 < var18; var20++) {
                incrementValue$5 = var19;
                var19++;
                pixels[incrementValue$5] = param5;
              }
              var11++;
              incrementValue$4 = var14;
              var14--;
              var15 = var15 - (incrementValue$4 + var14);
              var16 = var16 - (var14 + var14);
              break;
            }
            var15 = var15 + (var13 + var13);
            incrementValue$6 = var13;
            var13++;
            var16 = var16 + (incrementValue$6 + var13);
          }
        }
        var14Lifetime1 = var11 - var7;
        var17Lifetime1 = param0;
        if (var17Lifetime1 < clipLeft) {
          var17Lifetime1 = clipLeft;
        }
        var18Lifetime1 = param0 + param2;
        if (var18Lifetime1 > clipRight) {
          var18Lifetime1 = clipRight;
        }
        var19Lifetime1 = var17Lifetime1 + var11 * width;
        var20Lifetime1 = width + var17Lifetime1 - var18Lifetime1;
        var21 = param1 + param3 - param4 - 1;
        if (var21 > clipBottom) {
          var21 = clipBottom;
        }
        while (var11 < var21) {
          for (var22 = var17Lifetime1; var22 < var18Lifetime1; var22++) {
            incrementValue$3 = var19Lifetime1;
            var19Lifetime1++;
            pixels[incrementValue$3] = param5;
          }
          var11++;
          var19Lifetime1 = var19Lifetime1 + var20Lifetime1;
        }
        var14Lifetime2 = 0;
        var13Lifetime1 = param4;
        var16Lifetime1 = var14Lifetime2 * var14Lifetime2 + var12;
        var15Lifetime1 = var16Lifetime1 - var13Lifetime1;
        var16Lifetime1 = var16Lifetime1 - var14Lifetime2;
        while (var11 < var9) {
          while (var16Lifetime1 > var12) {
            if (var15Lifetime1 > var12) {
              incrementValue$0 = var13Lifetime1;
              var13Lifetime1--;
              var16Lifetime1 = var16Lifetime1 - (incrementValue$0 + var13Lifetime1);
              var15Lifetime1 = var15Lifetime1 - (var13Lifetime1 + var13Lifetime1);
              continue;
            }
            break;
          }
          var17Lifetime2 = var6 - var13Lifetime1;
          if (var17Lifetime2 < clipLeft) {
            var17Lifetime2 = clipLeft;
          }
          var18Lifetime2 = var6 + var10 + var13Lifetime1;
          if (var18Lifetime2 > clipRight - 1) {
            var18Lifetime2 = clipRight - 1;
          }
          var19Lifetime2 = var17Lifetime2 + var11 * width;
          for (var20Lifetime2 = var17Lifetime2; var20Lifetime2 <= var18Lifetime2; var20Lifetime2++) {
            incrementValue$2 = var19Lifetime2;
            var19Lifetime2++;
            pixels[incrementValue$2] = param5;
          }
          var11++;
          var16Lifetime1 = var16Lifetime1 + (var14Lifetime2 + var14Lifetime2);
          incrementValue$1 = var14Lifetime2;
          var14Lifetime2++;
          var15Lifetime1 = var15Lifetime1 + (incrementValue$1 + var14Lifetime2);
        }
        return;
    }

    final static void drawRectangleAlpha(int x, int y, int rectangleWidth, int rectangleHeight, int color, int alpha256) {
        Rasterizer2D.drawHorizontalLineAlpha(x, y, rectangleWidth, color, alpha256);
        Rasterizer2D.drawHorizontalLineAlpha(x, y + rectangleHeight - 1, rectangleWidth, color, alpha256);
        if (rectangleHeight >= 3) {
          Rasterizer2D.drawVerticalLineAlpha(x, y + 1, rectangleHeight - 2, color, alpha256);
          Rasterizer2D.drawVerticalLineAlpha(x + rectangleWidth - 1, y + 1, rectangleHeight - 2, color, alpha256);
          return;
        }
    }

    final static void saveClip(int[] destination) {
        destination[0] = clipLeft;
        destination[1] = clipTop;
        destination[2] = clipRight;
        destination[3] = clipBottom;
    }

    private final static void a(int[] param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var13 = 0;
        int incrementValue$0 = 0;
        int incrementValue$5 = 0;
        int incrementValue$4 = 0;
        int incrementValue$2 = 0;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var14;
        int var15;
        int var16;
        int var17;
        int var18;
        int var19;
        int var20;
        int var21;
        int var22;
        int var23;
        int var19Lifetime1;
        int var21Lifetime1;
        int var21Lifetime2;
        int var22Lifetime1;
        int var22Lifetime2;
        int var23Lifetime1;
        int var23Lifetime2;
        var8 = 16384 / (2 * param3 + 1);
        var9 = 1 + param3 - param5 - param4;
        if (0 < var9) {
          var9 = 0;
        }
        var10 = width - param4 - param5 - param3;
        if (0 < var10) {
          var10 = 0;
        }
        var11 = 0;
        var12 = param4 + param3 + 1;
        if (width < var12) {
          var11 = var12 - width;
          var12 = width;
        }
        for (var13 = -param7; var13 < 0; var13++) {
          var14 = 0;
          var15 = 0;
          var16 = 0;
          var17 = param2 - param3;
          var18 = var17 - (param3 << 1) - 1;
          var19 = param4 - param3;
          if (var19 < 0) {
            var17 = var17 - var19;
            var18 = var18 - var19;
            var19 = 0;
          }
          var20 = var12 - var19;
          while (var19 < var12) {
            param1 = param0[var17];
            var14 = var14 + (param1 >> 16 & 255);
            var15 = var15 + (param1 >> 8 & 255);
            var16 = var16 + (param1 & 255);
            var17++;
            var18++;
            var19++;
          }
          var18 = var18 + var11;
          incrementValue$0 = param2;
          param2++;
          param0[incrementValue$0] = (var14 / var20 << 16) + (var15 / var20 << 8) + var16 / var20;
          for (var19Lifetime1 = 1 - param5; var19Lifetime1 < var9; var19Lifetime1++) {
            var18++;
            if (param4 + param5 + var19Lifetime1 + param3 < clipRight) {
              param1 = param0[var17];
              var17++;
              var14 = var14 + (param1 >> 16 & 255);
              var15 = var15 + (param1 >> 8 & 255);
              var16 = var16 + (param1 & 255);
              var20++;
            }
            var21 = var14 / var20;
            var22 = var15 / var20;
            var23 = var16 / var20;
            incrementValue$5 = param2;
            param2++;
            param0[incrementValue$5] = (var21 << 16) + (var22 << 8) + var23;
          }
          while (var19Lifetime1 < var10) {
            param1 = param0[var18++];
            var14 = var14 - (param1 >> 16 & 255);
            if (var14 < 0) {
              var14 = 0;
            }
            var15 = var15 - (param1 >> 8 & 255);
            if (var15 < 0) {
              var15 = 0;
            }
            var16 = var16 - (param1 & 255);
            if (var16 < 0) {
              var16 = 0;
            }
            param1 = param0[var17];
            var17++;
            var14 = var14 + (param1 >> 16 & 255);
            var15 = var15 + (param1 >> 8 & 255);
            var16 = var16 + (param1 & 255);
            var21Lifetime1 = var14 * var8 >> 14;
            var22Lifetime1 = var15 * var8 >> 14;
            var23Lifetime1 = var16 * var8 >> 14;
            if (var21Lifetime1 > 255) {
              var21Lifetime1 = 255;
            }
            if (var22Lifetime1 > 255) {
              var22Lifetime1 = 255;
            }
            if (var23Lifetime1 > 255) {
              var23Lifetime1 = 255;
            }
            incrementValue$4 = param2;
            param2++;
            param0[incrementValue$4] = (var21Lifetime1 << 16) + (var22Lifetime1 << 8) + var23Lifetime1;
            var19Lifetime1++;
          }
          while (var19Lifetime1 < 0) {
            param1 = param0[var18++];
            var14 = var14 - (param1 >> 16 & 255);
            var15 = var15 - (param1 >> 8 & 255);
            var16 = var16 - (param1 & 255);
            var20--;
            var21Lifetime2 = var14 / var20;
            var22Lifetime2 = var15 / var20;
            var23Lifetime2 = var16 / var20;
            if (var21Lifetime2 >= 0) {
              if (var21Lifetime2 > 255) {
                var21Lifetime2 = 255;
              }
            } else {
              var21Lifetime2 = 0;
            }
            if (var22Lifetime2 >= 0) {
              if (var22Lifetime2 > 255) {
                var22Lifetime2 = 255;
              }
            } else {
              var22Lifetime2 = 0;
            }
            if (var23Lifetime2 >= 0) {
              if (var23Lifetime2 > 255) {
                var23Lifetime2 = 255;
              }
            } else {
              var23Lifetime2 = 0;
            }
            incrementValue$2 = param2;
            param2++;
            param0[incrementValue$2] = (var21Lifetime2 << 16) + (var22Lifetime2 << 8) + var23Lifetime2;
            var19Lifetime1++;
          }
          param2 = param2 + param6;
        }
    }

    public static void clearStaticReferences() {
        pixels = null;
        scanlineMaskOffsets = null;
        scanlineMaskWidths = null;
        field_g = null;
        field_a = null;
        field_k = null;
    }

    private final static void clearScanlineMask() {
        scanlineMaskOffsets = null;
        scanlineMaskWidths = null;
    }

    static {
        clipBottom = 0;
        clipRight = 0;
        clipTop = 0;
        clipLeft = 0;
    }
}
