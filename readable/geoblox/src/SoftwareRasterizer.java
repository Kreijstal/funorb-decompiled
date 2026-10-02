/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SoftwareRasterizer {
    private static int[] blurColumnRedSums;
    static int[] field_l;
    static int clipBottom;
    private static int[] blurColumnBlueSums;
    static int clipRight;
    static int[] field_a;
    static int clipTop;
    static int stride;
    static int framebufferHeight;
    static int[] framebuffer;
    static int clipLeft;
    private static int[] blurColumnGreenSums;

    final static void fillVerticalGradient(int x, int y, int width, int height, int topColor, int bottomColor) {
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
        var7 = 65536 / height;
        if (x < clipLeft) {
          width = width - (clipLeft - x);
          x = clipLeft;
        }
        if (y < clipTop) {
          var6 = var6 + (clipTop - y) * var7;
          height = height - (clipTop - y);
          y = clipTop;
        }
        if (x + width > clipRight) {
          width = clipRight - x;
        }
        if (y + height > clipBottom) {
          height = clipBottom - y;
        }
        var8 = stride - width;
        var9 = x + y * stride;
        for (var10 = -height; var10 < 0; var10++) {
          var11 = 65536 - var6 >> 8;
          var12 = var6 >> 8;
          var13 = ((topColor & 16711935) * var11 + (bottomColor & 16711935) * var12 & -16711936) + ((topColor & 65280) * var11 + (bottomColor & 65280) * var12 & 16711680) >>> 8;
          for (var14 = -width; var14 < 0; var14++) {
            incrementValue$0 = var9;
            var9++;
            framebuffer[incrementValue$0] = var13;
          }
          var9 = var9 + var8;
          var6 = var6 + var7;
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
        SoftwareRasterizer.clearScanlineMasks();
    }

    final static void drawRectangleDropShadow(int x, int y, int width, int height, int color) {
        int var6 = 0;
        int var5 = 0;
        for (var6 = 0; var6 < 4; var6++) {
            var5 = 128 - (var6 << 5);
            SoftwareRasterizer.drawHorizontalLineAlpha(x + var6, y + height + var6, width, color, var5);
            SoftwareRasterizer.drawVerticalLineAlpha(x + width + var6, y + var6, height + 1, color, var5);
        }
    }

    final static void saveClip(int[] clipBounds) {
        clipBounds[0] = clipLeft;
        clipBounds[1] = clipTop;
        clipBounds[2] = clipRight;
        clipBounds[3] = clipBottom;
    }

    final static void grayscaleRectangle(int x, int y, int width, int height) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int incrementValue$0 = 0;
        if (x < clipLeft) {
            width = width - (clipLeft - x);
            x = clipLeft;
        }
        if (x + width > clipRight) {
            width = clipRight - x;
        }
        if (y < clipTop) {
            height = height - (clipTop - y);
            y = clipTop;
        }
        if (y + height > clipBottom) {
            height = clipBottom - y;
        }
        int var4 = x + y * stride;
        if (width > 0) {
            if (height <= 0) {
                return;
            }
            for (var5 = 0; var5 < height; var5++) {
                for (var6 = 0; var6 < width; var6++) {
                    var7 = framebuffer[var4];
                    var8 = var7 >> 15 & 510;
                    var9 = var7 >> 8 & 255;
                    var10 = var7 & 255;
                    var11 = (var10 + var8) / 3 + var9 >> 1;
                    incrementValue$0 = var4;
                    var4++;
                    framebuffer[incrementValue$0] = (var11 << 16) + (var11 << 8) + var11;
                }
                var4 = var4 + (stride - width);
            }
            return;
        }
    }

    final static void drawRoundedRectangle(int x, int y, int width, int height, int cornerRadius, int color) {
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
        if (cornerRadius == 0) {
          SoftwareRasterizer.drawRectangle(x, y, width, height, color);
          return;
        }
        {
          if (cornerRadius < 0) {
            cornerRadius = -cornerRadius;
          }
          var6 = x + cornerRadius;
          var7 = y + cornerRadius;
          var8 = x + width - cornerRadius - 1;
          var9 = y + height - cornerRadius - 1;
          if (clipRight > clipLeft) {
            if (clipBottom <= clipTop) {
              return;
            }
            if (x + width > clipLeft) {
              if (x < clipRight) {
                if (y + height >= clipTop) {
                  if (y < clipBottom) {
                    L3: {
                      var10 = var6 + (var7 - cornerRadius) * stride;
                      var11 = var8 + (var7 - cornerRadius) * stride;
                      var12 = var6 + var7 * stride;
                      var13 = var8 + var7 * stride;
                      var14 = var6 + var9 * stride;
                      var15 = var8 + var9 * stride;
                      var16 = var6 + (var9 + cornerRadius) * stride;
                      var17 = var8 + (var9 + cornerRadius) * stride;
                      var18 = cornerRadius;
                      var19 = 0;
                      var20 = cornerRadius * cornerRadius;
                      var21 = var20 - var18;
                      if (x >= clipLeft) {
                        if (x + width < clipRight) {
                          if (y >= clipTop) {
                            if (y + height < clipBottom) {
                              for (var22 = var12; var22 <= var14; var22 = var22 + stride) {
                                framebuffer[var22 - var18] = color;
                              }
                              for (var22 = var13; var22 <= var15; var22 = var22 + stride) {
                                framebuffer[var22 + var18] = color;
                              }
                              for (var22 = var10; var22 <= var11; var22++) {
                                framebuffer[var22] = color;
                              }
                              for (var22 = var16; var22 <= var17; var22++) {
                                framebuffer[var22] = color;
                              }
                              L9: while (true) {
                                incrementValue$0 = var19;
                                var19++;
                                var21 = var21 + (incrementValue$0 + var19);
                                var12 = var12 - stride;
                                var13 = var13 - stride;
                                var14 = var14 + stride;
                                var15 = var15 + stride;
                                if (var21 > var20) {
                                  var18--;
                                  var21 = var21 - (var18 + var18);
                                  var10 = var10 + stride;
                                  var11 = var11 + stride;
                                  var16 = var16 - stride;
                                  var17 = var17 - stride;
                                }
                                if (var18 < var19) {
                                  break L3;
                                }
                                framebuffer[var10 - var19] = color;
                                framebuffer[var11 + var19] = color;
                                framebuffer[var12 - var18] = color;
                                framebuffer[var13 + var18] = color;
                                framebuffer[var14 - var18] = color;
                                framebuffer[var15 + var18] = color;
                                framebuffer[var16 - var19] = color;
                                framebuffer[var17 + var19] = color;
                                continue L9;
                              }
                            }
                          }
                        }
                      }
                      SoftwareRasterizer.drawVerticalLine(x, y + var18, height - var18 - var18, color);
                      SoftwareRasterizer.drawVerticalLine(x + width - 1, y + var18, height - var18 - var18, color);
                      SoftwareRasterizer.drawHorizontalLine(x + var18, y, width - var18 - var18, color);
                      SoftwareRasterizer.drawHorizontalLine(x + var18, y + height - 1, width - var18 - var18, color);
                      L11: while (true) {
                        incrementValue$1 = var19;
                        var19++;
                        var21 = var21 + (incrementValue$1 + var19);
                        var12 = var12 - stride;
                        var13 = var13 - stride;
                        var14 = var14 + stride;
                        var15 = var15 + stride;
                        if (var21 > var20) {
                          var18--;
                          var21 = var21 - (var18 + var18);
                          var10 = var10 + stride;
                          var11 = var11 + stride;
                          var16 = var16 - stride;
                          var17 = var17 - stride;
                        }
                        if (var18 < var19) {
                          break L3;
                        }
                        if (var7 - var18 >= clipTop) {
                          if (var7 - var18 < clipBottom) {
                            if (var6 - var19 >= clipLeft) {
                              if (var6 - var19 < clipRight) {
                                framebuffer[var10 - var19] = color;
                              }
                            }
                            if (var8 + var19 >= clipLeft) {
                              if (var8 + var19 < clipRight) {
                                framebuffer[var11 + var19] = color;
                              }
                            }
                          }
                        }
                        if (var7 - var19 >= clipTop) {
                          if (var7 - var19 < clipBottom) {
                            if (var6 - var18 >= clipLeft) {
                              if (var6 - var18 < clipRight) {
                                framebuffer[var12 - var18] = color;
                              }
                            }
                            if (var8 + var18 >= clipLeft) {
                              if (var8 + var18 < clipRight) {
                                framebuffer[var13 + var18] = color;
                              }
                            }
                          }
                        }
                        if (var9 + var19 >= clipTop) {
                          if (var9 + var19 < clipBottom) {
                            if (var6 - var18 >= clipLeft) {
                              if (var6 - var18 < clipRight) {
                                framebuffer[var14 - var18] = color;
                              }
                            }
                            if (var8 + var18 >= clipLeft) {
                              if (var8 + var18 < clipRight) {
                                framebuffer[var15 + var18] = color;
                              }
                            }
                          }
                        }
                        if (var9 + var18 < clipTop) {
                          continue L11;
                        }
                        if (var9 + var18 >= clipBottom) {
                          continue L11;
                        }
                        if (var6 - var19 >= clipLeft) {
                          if (var6 - var19 < clipRight) {
                            framebuffer[var16 - var19] = color;
                          }
                        }
                        if (var8 + var19 < clipLeft) {
                          continue L11;
                        }
                        if (var8 + var19 >= clipRight) {
                          continue L11;
                        }
                        framebuffer[var17 + var19] = color;
                        continue L11;
                      }
                    }
                    return;
                  }
                }
              }
              return;
            }
          }
          return;
        }
    }

    private final static void blurRowsInPlace(int[] pixels, int scratchPixel, int destinationIndex, int radius, int regionLeft, int regionWidth, int rowSkip, int regionHeight) {
        int negativeRowCounter = 0;
        int initialDestinationIndexBeforeIncrement = 0;
        int growingDestinationIndexBeforeIncrement = 0;
        int fullWindowLeavingIndexBeforeIncrement = 0;
        int fullWindowDestinationIndexBeforeIncrement = 0;
        int shrinkingLeavingIndexBeforeIncrement = 0;
        int shrinkingDestinationIndexBeforeIncrement = 0;
        int reciprocalWindowScaleQ14;
        int growingWindowEndCounter;
        int fullWindowEndCounter;
        int initialRightWindowOvershoot;
        int initialWindowRight;
        int runningRedSum;
        int runningGreenSum;
        int runningBlueSum;
        int enteringPixelIndex;
        int leavingPixelIndex;
        int windowXOrNegativeOutputCounter;
        int windowSampleCount;
        int outputRed;
        int outputGreen;
        int outputBlue;
        reciprocalWindowScaleQ14 = 16384 / (2 * radius + 1);
        growingWindowEndCounter = 1 + radius - regionWidth - regionLeft;
        if (0 < growingWindowEndCounter) {
          growingWindowEndCounter = 0;
        }
        fullWindowEndCounter = stride - regionLeft - regionWidth - radius;
        if (0 < fullWindowEndCounter) {
          fullWindowEndCounter = 0;
        }
        initialRightWindowOvershoot = 0;
        initialWindowRight = regionLeft + radius + 1;
        if (stride < initialWindowRight) {
          initialRightWindowOvershoot = initialWindowRight - stride;
          initialWindowRight = stride;
        }
        for (negativeRowCounter = -regionHeight; negativeRowCounter < 0; negativeRowCounter++) {
          runningRedSum = 0;
          runningGreenSum = 0;
          runningBlueSum = 0;
          enteringPixelIndex = destinationIndex - radius;
          leavingPixelIndex = enteringPixelIndex - (radius << 1) - 1;
          windowXOrNegativeOutputCounter = regionLeft - radius;
          if (windowXOrNegativeOutputCounter < 0) {
            enteringPixelIndex = enteringPixelIndex - windowXOrNegativeOutputCounter;
            leavingPixelIndex = leavingPixelIndex - windowXOrNegativeOutputCounter;
            windowXOrNegativeOutputCounter = 0;
          }
          windowSampleCount = initialWindowRight - windowXOrNegativeOutputCounter;
          L5: while (windowXOrNegativeOutputCounter < initialWindowRight) {
            scratchPixel = pixels[enteringPixelIndex];
            runningRedSum = runningRedSum + (scratchPixel >> 16 & 255);
            runningGreenSum = runningGreenSum + (scratchPixel >> 8 & 255);
            runningBlueSum = runningBlueSum + (scratchPixel & 255);
            enteringPixelIndex++;
            leavingPixelIndex++;
            windowXOrNegativeOutputCounter++;
          }
          leavingPixelIndex = leavingPixelIndex + initialRightWindowOvershoot;
          initialDestinationIndexBeforeIncrement = destinationIndex;
          destinationIndex++;
          pixels[initialDestinationIndexBeforeIncrement] = (runningRedSum / windowSampleCount << 16) + (runningGreenSum / windowSampleCount << 8) + runningBlueSum / windowSampleCount;
          for (windowXOrNegativeOutputCounter = 1 - regionWidth; windowXOrNegativeOutputCounter < growingWindowEndCounter; windowXOrNegativeOutputCounter++) {
            leavingPixelIndex++;
            if (regionLeft + regionWidth + windowXOrNegativeOutputCounter + radius < clipRight) {
              scratchPixel = pixels[enteringPixelIndex];
              enteringPixelIndex++;
              runningRedSum = runningRedSum + (scratchPixel >> 16 & 255);
              runningGreenSum = runningGreenSum + (scratchPixel >> 8 & 255);
              runningBlueSum = runningBlueSum + (scratchPixel & 255);
              windowSampleCount++;
            }
            outputRed = runningRedSum / windowSampleCount;
            outputGreen = runningGreenSum / windowSampleCount;
            outputBlue = runningBlueSum / windowSampleCount;
            growingDestinationIndexBeforeIncrement = destinationIndex;
            destinationIndex++;
            pixels[growingDestinationIndexBeforeIncrement] = (outputRed << 16) + (outputGreen << 8) + outputBlue;
          }
          L7: while (windowXOrNegativeOutputCounter < fullWindowEndCounter) {
            fullWindowLeavingIndexBeforeIncrement = leavingPixelIndex;
            leavingPixelIndex++;
            scratchPixel = pixels[fullWindowLeavingIndexBeforeIncrement];
            runningRedSum = runningRedSum - (scratchPixel >> 16 & 255);
            if (runningRedSum < 0) {
              runningRedSum = 0;
            }
            runningGreenSum = runningGreenSum - (scratchPixel >> 8 & 255);
            if (runningGreenSum < 0) {
              runningGreenSum = 0;
            }
            runningBlueSum = runningBlueSum - (scratchPixel & 255);
            if (runningBlueSum < 0) {
              runningBlueSum = 0;
            }
            scratchPixel = pixels[enteringPixelIndex];
            enteringPixelIndex++;
            runningRedSum = runningRedSum + (scratchPixel >> 16 & 255);
            runningGreenSum = runningGreenSum + (scratchPixel >> 8 & 255);
            runningBlueSum = runningBlueSum + (scratchPixel & 255);
            outputRed = runningRedSum * reciprocalWindowScaleQ14 >> 14;
            outputGreen = runningGreenSum * reciprocalWindowScaleQ14 >> 14;
            outputBlue = runningBlueSum * reciprocalWindowScaleQ14 >> 14;
            if (outputRed > 255) {
              outputRed = 255;
            }
            if (outputGreen > 255) {
              outputGreen = 255;
            }
            if (outputBlue > 255) {
              outputBlue = 255;
            }
            fullWindowDestinationIndexBeforeIncrement = destinationIndex;
            destinationIndex++;
            pixels[fullWindowDestinationIndexBeforeIncrement] = (outputRed << 16) + (outputGreen << 8) + outputBlue;
            windowXOrNegativeOutputCounter++;
          }
          L8: while (windowXOrNegativeOutputCounter < 0) {
            shrinkingLeavingIndexBeforeIncrement = leavingPixelIndex;
            leavingPixelIndex++;
            scratchPixel = pixels[shrinkingLeavingIndexBeforeIncrement];
            runningRedSum = runningRedSum - (scratchPixel >> 16 & 255);
            runningGreenSum = runningGreenSum - (scratchPixel >> 8 & 255);
            runningBlueSum = runningBlueSum - (scratchPixel & 255);
            windowSampleCount--;
            outputRed = runningRedSum / windowSampleCount;
            outputGreen = runningGreenSum / windowSampleCount;
            outputBlue = runningBlueSum / windowSampleCount;
            if (outputRed >= 0) {
              if (outputRed > 255) {
                outputRed = 255;
              }
            } else {
              outputRed = 0;
            }
            if (outputGreen >= 0) {
              if (outputGreen > 255) {
                outputGreen = 255;
              }
            } else {
              outputGreen = 0;
            }
            if (outputBlue >= 0) {
              if (outputBlue > 255) {
                outputBlue = 255;
              }
            } else {
              outputBlue = 0;
            }
            shrinkingDestinationIndexBeforeIncrement = destinationIndex;
            destinationIndex++;
            pixels[shrinkingDestinationIndexBeforeIncrement] = (outputRed << 16) + (outputGreen << 8) + outputBlue;
            windowXOrNegativeOutputCounter++;
          }
          destinationIndex = destinationIndex + rowSkip;
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
            var12 = x + y * stride;
            for (var13 = 0; var13 < length; var13++) {
                var9 = (framebuffer[var12] >> 16 & 255) * var5;
                var10 = (framebuffer[var12] >> 8 & 255) * var5;
                var11 = (framebuffer[var12] & 255) * var5;
                var14 = (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8) + (var8 + var11 >> 8);
                incrementValue$0 = var12;
                var12++;
                framebuffer[incrementValue$0] = var14;
            }
            return;
        }
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
            var12 = x + y * stride;
            for (var13 = 0; var13 < length; var13++) {
                var9 = (framebuffer[var12] >> 16 & 255) * var5;
                var10 = (framebuffer[var12] >> 8 & 255) * var5;
                var11 = (framebuffer[var12] & 255) * var5;
                var14 = (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8) + (var8 + var11 >> 8);
                framebuffer[var12] = var14;
                var12 = var12 + stride;
            }
            return;
        }
    }

    public static void releaseRasterStorage() {
        framebuffer = null;
        field_a = null;
        field_l = null;
        blurColumnRedSums = null;
        blurColumnGreenSums = null;
        blurColumnBlueSums = null;
    }

    final static void setPixel(int x, int y, int color) {
        if (x >= clipLeft) {
            if (y < clipTop || x >= clipRight || y >= clipBottom) {
                return;
            }
            framebuffer[x + y * stride] = color;
            return;
        }
    }

    final static void blurRasterRegion(int horizontalRadius, int verticalRadius, int regionLeft, int regionTop, int regionWidth, int regionHeight) {
        SoftwareRasterizer.blurRowsInPlace(framebuffer, 0, regionLeft + regionTop * stride, horizontalRadius, regionLeft, regionWidth, stride - regionWidth, regionHeight);
        SoftwareRasterizer.blurColumnsInPlace(framebuffer, 0, regionLeft + regionTop * stride, verticalRadius, regionTop, regionHeight, stride - regionWidth, regionLeft, regionWidth);
    }

    private final static void clearScanlineMasks() {
        field_a = null;
        field_l = null;
    }

    final static void fillCircleAlpha(int centerX, int centerY, int radius, int color, int alpha256) {
        int incrementValue$4 = 0;
        int incrementValue$3 = 0;
        int incrementValue$5 = 0;
        int incrementValue$0 = 0;
        int incrementValue$2 = 0;
        int incrementValue$1 = 0;
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
        int var17;
        int var18;
        int var19;
        int var20;
        int var21;
        int var22;
        int var23;
        int var24;
        int var25;
        if (alpha256 == 0) {
          return;
        }
        if (alpha256 == 256) {
          SoftwareRasterizer.fillCircle(centerX, centerY, radius, color);
          return;
        }
        {
          if (radius < 0) {
            radius = -radius;
          }
          var5 = 256 - alpha256;
          var6 = (color >> 16 & 255) * alpha256;
          var7 = (color >> 8 & 255) * alpha256;
          var8 = (color & 255) * alpha256;
          var12 = centerY - radius;
          if (var12 < clipTop) {
            var12 = clipTop;
          }
          var13 = centerY + radius + 1;
          if (var13 > clipBottom) {
            var13 = clipBottom;
          }
          var14 = var12;
          var15 = radius * radius;
          var16 = 0;
          var17 = centerY - var14;
          var18 = var17 * var17;
          var19 = var18 - var17;
          if (centerY > var13) {
            centerY = var13;
          }
          L4: while (true) {
            if (var14 < centerY) {
              L11: while (true) {
                if (var19 > var15) {
                  if (var18 > var15) {
                    var20 = centerX - var16 + 1;
                    if (var20 < clipLeft) {
                      var20 = clipLeft;
                    }
                    var21 = centerX + var16;
                    if (var21 > clipRight) {
                      var21 = clipRight;
                    }
                    var22 = var20 + var14 * stride;
                    for (var23 = var20; var23 < var21; var23++) {
                      var9 = (framebuffer[var22] >> 16 & 255) * var5;
                      var10 = (framebuffer[var22] >> 8 & 255) * var5;
                      var11 = (framebuffer[var22] & 255) * var5;
                      var24 = (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8) + (var8 + var11 >> 8);
                      incrementValue$4 = var22;
                      var22++;
                      framebuffer[incrementValue$4] = var24;
                    }
                    var14++;
                    incrementValue$3 = var17;
                    var17--;
                    var18 = var18 - (incrementValue$3 + var17);
                    var19 = var19 - (var17 + var17);
                    continue L4;
                  }
                }
                var18 = var18 + (var16 + var16);
                incrementValue$5 = var16;
                var16++;
                var19 = var19 + (incrementValue$5 + var16);
                continue L11;
              }
            }
            var16 = radius;
            var17 = -var17;
            var19 = var17 * var17 + var15;
            var18 = var19 - var16;
            var19 = var19 - var17;
            L5: while (var14 < var13) {
              L6: while (var19 > var15) {
                if (var18 > var15) {
                  incrementValue$0 = var16;
                  var16--;
                  var19 = var19 - (incrementValue$0 + var16);
                  var18 = var18 - (var16 + var16);
                  continue L6;
                }
                break;
              }
              var20 = centerX - var16;
              if (var20 < clipLeft) {
                var20 = clipLeft;
              }
              var21 = centerX + var16;
              if (var21 > clipRight - 1) {
                var21 = clipRight - 1;
              }
              var25 = var20 + var14 * stride;
              var22 = var25;
              for (var23 = var20; var23 <= var21; var23++) {
                var9 = (framebuffer[var25] >> 16 & 255) * var5;
                var10 = (framebuffer[var25] >> 8 & 255) * var5;
                var11 = (framebuffer[var25] & 255) * var5;
                var24 = (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8) + (var8 + var11 >> 8);
                incrementValue$2 = var25;
                var25++;
                framebuffer[incrementValue$2] = var24;
              }
              var14++;
              var19 = var19 + (var17 + var17);
              incrementValue$1 = var17;
              var17++;
              var18 = var18 + (incrementValue$1 + var17);
            }
            return;
          }
        }
    }

    final static void fillRectangle(int x, int y, int width, int height, int color) {
        int var7 = 0;
        int var8 = 0;
        int incrementValue$0 = 0;
        if (x < clipLeft) {
            width = width - (clipLeft - x);
            x = clipLeft;
        }
        if (y < clipTop) {
            height = height - (clipTop - y);
            y = clipTop;
        }
        if (x + width > clipRight) {
            width = clipRight - x;
        }
        if (y + height > clipBottom) {
            height = clipBottom - y;
        }
        int var5 = stride - width;
        int var6 = x + y * stride;
        for (var7 = -height; var7 < 0; var7++) {
            for (var8 = -width; var8 < 0; var8++) {
                incrementValue$0 = var6;
                var6++;
                framebuffer[incrementValue$0] = color;
            }
            var6 = var6 + var5;
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
            var4 = x + y * stride;
            for (var5 = 0; var5 < length; var5++) {
                framebuffer[var4 + var5] = color;
            }
            return;
        }
    }

    final static void fillCircle(int centerX, int centerY, int radius, int color) {
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
        if (radius == 0) {
          SoftwareRasterizer.setPixel(centerX, centerY, color);
          return;
        }
        {
          if (radius < 0) {
            radius = -radius;
          }
          var4 = centerY - radius;
          if (var4 < clipTop) {
            var4 = clipTop;
          }
          var5 = centerY + radius + 1;
          if (var5 > clipBottom) {
            var5 = clipBottom;
          }
          var6 = var4;
          var7 = radius * radius;
          var8 = 0;
          var9 = centerY - var6;
          var10 = var9 * var9;
          var11 = var10 - var9;
          if (centerY > var5) {
            centerY = var5;
          }
          L4: while (true) {
            if (var6 < centerY) {
              L11: while (true) {
                if (var11 > var7) {
                  if (var10 > var7) {
                    var12 = centerX - var8 + 1;
                    if (var12 < clipLeft) {
                      var12 = clipLeft;
                    }
                    var13 = centerX + var8;
                    if (var13 > clipRight) {
                      var13 = clipRight;
                    }
                    var14 = var12 + var6 * stride;
                    for (var15 = var12; var15 < var13; var15++) {
                      incrementValue$4 = var14;
                      var14++;
                      framebuffer[incrementValue$4] = color;
                    }
                    var6++;
                    incrementValue$3 = var9;
                    var9--;
                    var10 = var10 - (incrementValue$3 + var9);
                    var11 = var11 - (var9 + var9);
                    continue L4;
                  }
                }
                var10 = var10 + (var8 + var8);
                incrementValue$5 = var8;
                var8++;
                var11 = var11 + (incrementValue$5 + var8);
                continue L11;
              }
            }
            var8 = radius;
            var9 = var6 - centerY;
            var11 = var9 * var9 + var7;
            var10 = var11 - var8;
            var11 = var11 - var9;
            L5: while (var6 < var5) {
              L6: while (var11 > var7) {
                if (var10 > var7) {
                  incrementValue$0 = var8;
                  var8--;
                  var11 = var11 - (incrementValue$0 + var8);
                  var10 = var10 - (var8 + var8);
                  continue L6;
                }
                break;
              }
              var12 = centerX - var8;
              if (var12 < clipLeft) {
                var12 = clipLeft;
              }
              var13 = centerX + var8;
              if (var13 > clipRight - 1) {
                var13 = clipRight - 1;
              }
              var14 = var12 + var6 * stride;
              for (var15 = var12; var15 <= var13; var15++) {
                incrementValue$2 = var14;
                var14++;
                framebuffer[incrementValue$2] = color;
              }
              var6++;
              var11 = var11 + (var9 + var9);
              incrementValue$1 = var9;
              var9++;
              var10 = var10 + (incrementValue$1 + var9);
            }
            return;
          }
        }
    }

    final static void drawLine(int startX, int startY, int endX, int endY, int color) {
        int var5;
        int var6;
        endX = endX - startX;
        endY = endY - startY;
        if (endY == 0) {
          if (endX < 0) {
            SoftwareRasterizer.drawHorizontalLine(startX + endX, startY, -endX + 1, color);
          } else {
            SoftwareRasterizer.drawHorizontalLine(startX, startY, endX + 1, color);
          }
          return;
        }
        if (endX == 0) {
          if (endY < 0) {
            SoftwareRasterizer.drawVerticalLine(startX, startY + endY, -endY + 1, color);
          } else {
            SoftwareRasterizer.drawVerticalLine(startX, startY, endY + 1, color);
          }
          return;
        }
        if (endX + endY < 0) {
          startX = startX + endX;
          endX = -endX;
          startY = startY + endY;
          endY = -endY;
        }
        if (endX <= endY) {
          startX = startX << 16;
          startX = startX + 32768;
          endX = endX << 16;
          var5 = (int)Math.floor((double)endX / (double)endY + 0.5);
          endY = endY + startY;
          if (startY < clipTop) {
            startX = startX + var5 * (clipTop - startY);
            startY = clipTop;
          }
          if (endY >= clipBottom) {
            endY = clipBottom - 1;
          }
          L3: while (startY <= endY) {
            var6 = startX >> 16;
            if (var6 >= clipLeft) {
              if (var6 < clipRight) {
                framebuffer[var6 + startY * stride] = color;
              }
            }
            startX = startX + var5;
            startY++;
          }
          return;
        }
        startY = startY << 16;
        startY = startY + 32768;
        endY = endY << 16;
        var5 = (int)Math.floor((double)endY / (double)endX + 0.5);
        endX = endX + startX;
        if (startX < clipLeft) {
          startY = startY + var5 * (clipLeft - startX);
          startX = clipLeft;
        }
        if (endX >= clipRight) {
          endX = clipRight - 1;
        }
        L7: while (startX <= endX) {
          var6 = startY >> 16;
          if (var6 >= clipTop) {
            if (var6 < clipBottom) {
              framebuffer[startX + var6 * stride] = color;
            }
          }
          startY = startY + var5;
          startX++;
        }
    }

    final static void drawCircle(int centerX, int centerY, int radius, int color) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        if (radius == 0) {
          SoftwareRasterizer.setPixel(centerX, centerY, color);
          return;
        }
        if (radius < 0) {
          radius = -radius;
        }
        if (clipRight > clipLeft) {
          if (clipBottom <= clipTop) {
            return;
          }
          if (centerX + radius >= clipLeft) {
            if (centerX - radius < clipRight) {
              if (centerY + radius >= clipTop) {
                if (centerY - radius < clipBottom) {
                  L3: {
                    var4 = centerX + centerY * stride;
                    var5 = var4;
                    var6 = var4 - radius * stride;
                    var7 = var4 + radius * stride;
                    var8 = radius;
                    var9 = 0;
                    radius = radius * radius;
                    var10 = radius - var8;
                    if (centerX - var8 >= clipLeft) {
                      if (centerX + var8 < clipRight) {
                        if (centerY - var8 >= clipTop) {
                          if (centerY + var8 < clipBottom) {
                            framebuffer[var4 - var8] = color;
                            framebuffer[var4 + var8] = color;
                            framebuffer[var6] = color;
                            framebuffer[var7] = color;
                            L5: while (true) {
                              incrementValue$0 = var9;
                              var9++;
                              var10 = var10 + (incrementValue$0 + var9);
                              var4 = var4 - stride;
                              var5 = var5 + stride;
                              if (var10 > radius) {
                                var8--;
                                var10 = var10 - (var8 + var8);
                                var6 = var6 + stride;
                                var7 = var7 - stride;
                              }
                              if (var8 < var9) {
                                break L3;
                              }
                              framebuffer[var6 - var9] = color;
                              framebuffer[var6 + var9] = color;
                              framebuffer[var4 - var8] = color;
                              framebuffer[var4 + var8] = color;
                              framebuffer[var5 - var8] = color;
                              framebuffer[var5 + var8] = color;
                              framebuffer[var7 - var9] = color;
                              framebuffer[var7 + var9] = color;
                              continue L5;
                            }
                          }
                        }
                      }
                    }
                    if (centerX - var8 >= clipLeft) {
                      if (centerY >= clipTop) {
                        if (centerY < clipBottom) {
                          framebuffer[var4 - var8] = color;
                        }
                      }
                    }
                    if (centerX + var8 < clipRight) {
                      if (centerY >= clipTop) {
                        if (centerY < clipBottom) {
                          framebuffer[var4 + var8] = color;
                        }
                      }
                    }
                    if (centerY - var8 >= clipTop) {
                      if (centerX >= clipLeft) {
                        if (centerX < clipRight) {
                          framebuffer[var6] = color;
                          if (centerY + var8 < clipBottom) {
                            if (centerX >= clipLeft) {
                              if (centerX < clipRight) {
                                framebuffer[var7] = color;
                              }
                            }
                          }
                        } else {
                          if (centerY + var8 < clipBottom) {
                            if (centerX >= clipLeft) {
                              if (centerX < clipRight) {
                                framebuffer[var7] = color;
                              }
                            }
                          }
                        }
                      } else {
                        if (centerY + var8 < clipBottom) {
                          if (centerX >= clipLeft) {
                            if (centerX < clipRight) {
                              framebuffer[var7] = color;
                            }
                          }
                        }
                      }
                    } else {
                      if (centerY + var8 < clipBottom) {
                        if (centerX >= clipLeft) {
                          if (centerX < clipRight) {
                            framebuffer[var7] = color;
                          }
                        }
                      }
                    }
                    L10: while (true) {
                      incrementValue$1 = var9;
                      var9++;
                      var10 = var10 + (incrementValue$1 + var9);
                      var4 = var4 - stride;
                      var5 = var5 + stride;
                      if (var10 > radius) {
                        var8--;
                        var10 = var10 - (var8 + var8);
                        var6 = var6 + stride;
                        var7 = var7 - stride;
                      }
                      if (var8 < var9) {
                        break L3;
                      }
                      if (centerY - var8 >= clipTop) {
                        if (centerY - var8 < clipBottom) {
                          if (centerX - var9 >= clipLeft) {
                            if (centerX - var9 < clipRight) {
                              framebuffer[var6 - var9] = color;
                            }
                          }
                          if (centerX + var9 >= clipLeft) {
                            if (centerX + var9 < clipRight) {
                              framebuffer[var6 + var9] = color;
                            }
                          }
                        }
                      }
                      if (centerY - var9 >= clipTop) {
                        if (centerY - var9 < clipBottom) {
                          if (centerX - var8 >= clipLeft) {
                            if (centerX - var8 < clipRight) {
                              framebuffer[var4 - var8] = color;
                            }
                          }
                          if (centerX + var8 >= clipLeft) {
                            if (centerX + var8 < clipRight) {
                              framebuffer[var4 + var8] = color;
                            }
                          }
                        }
                      }
                      if (centerY + var9 >= clipTop) {
                        if (centerY + var9 < clipBottom) {
                          if (centerX - var8 >= clipLeft) {
                            if (centerX - var8 < clipRight) {
                              framebuffer[var5 - var8] = color;
                            }
                          }
                          if (centerX + var8 >= clipLeft) {
                            if (centerX + var8 < clipRight) {
                              framebuffer[var5 + var8] = color;
                            }
                          }
                        }
                      }
                      if (centerY + var8 < clipTop) {
                        continue L10;
                      }
                      if (centerY + var8 >= clipBottom) {
                        continue L10;
                      }
                      if (centerX - var9 >= clipLeft) {
                        if (centerX - var9 < clipRight) {
                          framebuffer[var7 - var9] = color;
                        }
                      }
                      if (centerX + var9 < clipLeft) {
                        continue L10;
                      }
                      if (centerX + var9 >= clipRight) {
                        continue L10;
                      }
                      framebuffer[var7 + var9] = color;
                      continue L10;
                    }
                  }
                  return;
                }
              }
            }
            return;
          }
        }
    }

    final static void clearFramebuffer() {
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
        int var1 = stride * framebufferHeight - 7;
        while (var0 < var1) {
            incrementValue$0 = var0;
            var0++;
            framebuffer[incrementValue$0] = 0;
            incrementValue$1 = var0;
            var0++;
            framebuffer[incrementValue$1] = 0;
            incrementValue$2 = var0;
            var0++;
            framebuffer[incrementValue$2] = 0;
            incrementValue$3 = var0;
            var0++;
            framebuffer[incrementValue$3] = 0;
            incrementValue$4 = var0;
            var0++;
            framebuffer[incrementValue$4] = 0;
            incrementValue$5 = var0;
            var0++;
            framebuffer[incrementValue$5] = 0;
            incrementValue$6 = var0;
            var0++;
            framebuffer[incrementValue$6] = 0;
            incrementValue$7 = var0;
            var0++;
            framebuffer[incrementValue$7] = 0;
        }
        var1 += 7;
        while (var0 < var1) {
            incrementValue$8 = var0;
            var0++;
            framebuffer[incrementValue$8] = 0;
        }
    }

    final static void drawRectangle(int x, int y, int width, int height, int color) {
        SoftwareRasterizer.drawHorizontalLine(x, y, width, color);
        SoftwareRasterizer.drawHorizontalLine(x, y + height - 1, width, color);
        SoftwareRasterizer.drawVerticalLine(x, y, height, color);
        SoftwareRasterizer.drawVerticalLine(x + width - 1, y, height, color);
    }

    final static void fillRectangleAlpha(int x, int y, int width, int height, int color, int alpha256) {
        int var9 = 0;
        int var10 = 0;
        int incrementValue$0 = 0;
        int var6;
        int var7;
        int var8;
        int var11;
        if (x < clipLeft) {
          width = width - (clipLeft - x);
          x = clipLeft;
        }
        if (y < clipTop) {
          height = height - (clipTop - y);
          y = clipTop;
        }
        if (x + width > clipRight) {
          width = clipRight - x;
        }
        if (y + height > clipBottom) {
          height = clipBottom - y;
        }
        color = ((color & 16711935) * alpha256 >> 8 & 16711935) + ((color & 65280) * alpha256 >> 8 & 65280);
        var6 = 256 - alpha256;
        var7 = stride - width;
        var8 = x + y * stride;
        for (var9 = 0; var9 < height; var9++) {
          for (var10 = -width; var10 < 0; var10++) {
            var11 = framebuffer[var8];
            var11 = ((var11 & 16711935) * var6 >> 8 & 16711935) + ((var11 & 65280) * var6 >> 8 & 65280);
            incrementValue$0 = var8;
            var8++;
            framebuffer[incrementValue$0] = color + var11;
          }
          var8 = var8 + var7;
        }
    }

    final static void fillRoundedRectangle(int x, int y, int width, int height, int cornerRadius, int color) {
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
        if (cornerRadius == 0) {
          SoftwareRasterizer.fillRectangle(x, y, width, height, color);
          return;
        }
        {
          if (cornerRadius < 0) {
            cornerRadius = -cornerRadius;
          }
          var6 = x + cornerRadius;
          var7 = y + cornerRadius;
          var8 = y;
          if (var8 < clipTop) {
            var8 = clipTop;
          }
          var9 = y + height;
          if (var9 > clipBottom) {
            var9 = clipBottom;
          }
          var10 = width - cornerRadius - cornerRadius - 1;
          var11 = var8;
          var12 = cornerRadius * cornerRadius;
          var13 = 0;
          var14 = var7 - var11;
          var15 = var14 * var14;
          var16 = var15 - var14;
          if (var7 > var9) {
            var7 = var9;
          }
          L4: while (true) {
            if (var11 < var7) {
              L16: while (true) {
                if (var16 > var12) {
                  if (var15 > var12) {
                    var17 = var6 - var13 + 1;
                    if (var17 < clipLeft) {
                      var17 = clipLeft;
                    }
                    var18 = var6 + var10 + var13;
                    if (var18 > clipRight) {
                      var18 = clipRight;
                    }
                    var19 = var17 + var11 * stride;
                    for (var20 = var17; var20 < var18; var20++) {
                      incrementValue$5 = var19;
                      var19++;
                      framebuffer[incrementValue$5] = color;
                    }
                    var11++;
                    incrementValue$4 = var14;
                    var14--;
                    var15 = var15 - (incrementValue$4 + var14);
                    var16 = var16 - (var14 + var14);
                    continue L4;
                  }
                }
                var15 = var15 + (var13 + var13);
                incrementValue$6 = var13;
                var13++;
                var16 = var16 + (incrementValue$6 + var13);
                continue L16;
              }
            }
            {
              var14 = var11 - var7;
              var17 = x;
              if (var17 < clipLeft) {
                var17 = clipLeft;
              }
              var18 = x + width;
              if (var18 > clipRight) {
                var18 = clipRight;
              }
              var19 = var17 + var11 * stride;
              var20 = stride + var17 - var18;
              var21 = y + height - cornerRadius - 1;
              if (var21 > clipBottom) {
                var21 = clipBottom;
              }
              L8: while (var11 < var21) {
                for (var22 = var17; var22 < var18; var22++) {
                  incrementValue$3 = var19;
                  var19++;
                  framebuffer[incrementValue$3] = color;
                }
                var11++;
                var19 = var19 + var20;
              }
              var14 = 0;
              var13 = cornerRadius;
              var16 = var14 * var14 + var12;
              var15 = var16 - var13;
              var16 = var16 - var14;
              L9: while (var11 < var9) {
                L10: while (var16 > var12) {
                  if (var15 > var12) {
                    incrementValue$0 = var13;
                    var13--;
                    var16 = var16 - (incrementValue$0 + var13);
                    var15 = var15 - (var13 + var13);
                    continue L10;
                  }
                  break;
                }
                var17 = var6 - var13;
                if (var17 < clipLeft) {
                  var17 = clipLeft;
                }
                var18 = var6 + var10 + var13;
                if (var18 > clipRight - 1) {
                  var18 = clipRight - 1;
                }
                var19 = var17 + var11 * stride;
                for (var20 = var17; var20 <= var18; var20++) {
                  incrementValue$2 = var19;
                  var19++;
                  framebuffer[incrementValue$2] = color;
                }
                var11++;
                var16 = var16 + (var14 + var14);
                incrementValue$1 = var14;
                var14++;
                var15 = var15 + (incrementValue$1 + var14);
              }
              return;
            }
          }
        }
    }

    final static void setClip(int left, int top, int right, int bottom) {
        if (left < 0) {
            left = 0;
        }
        if (top < 0) {
            top = 0;
        }
        if (right > stride) {
            right = stride;
        }
        if (bottom > framebufferHeight) {
            bottom = framebufferHeight;
        }
        clipLeft = left;
        clipTop = top;
        clipRight = right;
        clipBottom = bottom;
        SoftwareRasterizer.clearScanlineMasks();
    }

    private final static void blurColumnsInPlace(int[] pixels, int scratchPixel, int destinationIndex, int radius, int regionTop, int regionHeight, int rowSkip, int regionLeft, int regionWidth) {
        int initialEnteringIndexBeforeIncrement = 0;
        int initialDestinationIndexBeforeIncrement = 0;
        int growingEnteringIndexBeforeIncrement = 0;
        int growingDestinationIndexBeforeIncrement = 0;
        int fullWindowLeavingIndexBeforeIncrement = 0;
        int fullWindowEnteringIndexBeforeIncrement = 0;
        int fullWindowDestinationIndexBeforeIncrement = 0;
        int shrinkingLeavingIndexBeforeIncrement = 0;
        int shrinkingDestinationIndexBeforeIncrement = 0;
        int[] redSumsForClampedStore = null;
        int redColumnForClampedStore = 0;
        int nonnegativeRedSum = 0;
        int[] greenSumsForClampedStore = null;
        int greenColumnForClampedStore = 0;
        int nonnegativeGreenSum = 0;
        int[] blueSumsForClampedStore = null;
        int blueColumnForClampedStore = 0;
        int nonnegativeBlueSum = 0;
        int[] redSumsForUpdates;
        int[] greenSumsForUpdates;
        int[] blueSumsForUpdates;
        int reciprocalWindowScaleQ14;
        int initialWindowRowOrNegativeOutputCounter;
        int enteringPixelIndex;
        int initialWindowBottom;
        int initialBottomWindowOvershoot;
        int windowSampleCount;
        int columnIndexOrWindowEndCounter;
        int leavingPixelIndex;
        int columnIndex;
        int channelSumAfterRemovalOrOutputRed;
        int outputGreen;
        int outputBlue;
        int[] redSumsForwarded;
        int[] greenSumsForwarded;
        int[] blueSumsForwarded;
        int[] redSumsSnapshot;
        int[] greenSumsSnapshot;
        int[] blueSumsSnapshot;
        L0: {
          if (blurColumnRedSums != null) {
            if (blurColumnRedSums.length >= regionWidth) {
              break L0;
            }
          }
          blurColumnRedSums = new int[regionWidth];
          blurColumnGreenSums = new int[regionWidth];
          blurColumnBlueSums = new int[regionWidth];
        }
        redSumsSnapshot = blurColumnRedSums;
        redSumsForwarded = redSumsSnapshot;
        redSumsForUpdates = redSumsForwarded;
        greenSumsSnapshot = blurColumnGreenSums;
        greenSumsForwarded = greenSumsSnapshot;
        greenSumsForUpdates = greenSumsForwarded;
        blueSumsSnapshot = blurColumnBlueSums;
        blueSumsForwarded = blueSumsSnapshot;
        blueSumsForUpdates = blueSumsForwarded;
        sf.a(redSumsSnapshot, 0, regionWidth);
        sf.a(greenSumsSnapshot, 0, regionWidth);
        sf.a(blueSumsSnapshot, 0, regionWidth);
        reciprocalWindowScaleQ14 = 16384 / (2 * radius + 1);
        initialWindowRowOrNegativeOutputCounter = regionTop - radius;
        if (initialWindowRowOrNegativeOutputCounter < 0) {
          initialWindowRowOrNegativeOutputCounter = 0;
        }
        enteringPixelIndex = regionLeft + initialWindowRowOrNegativeOutputCounter * stride;
        initialWindowBottom = regionTop + radius;
        initialBottomWindowOvershoot = 0;
        if (initialWindowBottom >= framebufferHeight) {
          initialBottomWindowOvershoot = initialWindowBottom - framebufferHeight + 1;
          initialWindowBottom = framebufferHeight - 1;
        }
        windowSampleCount = initialWindowBottom - initialWindowRowOrNegativeOutputCounter + 1;
        L4: while (initialWindowRowOrNegativeOutputCounter <= initialWindowBottom) {
          for (columnIndexOrWindowEndCounter = 0; columnIndexOrWindowEndCounter < regionWidth; columnIndexOrWindowEndCounter++) {
            initialEnteringIndexBeforeIncrement = enteringPixelIndex;
            enteringPixelIndex++;
            scratchPixel = pixels[initialEnteringIndexBeforeIncrement];
            redSumsForUpdates[columnIndexOrWindowEndCounter] = redSumsForUpdates[columnIndexOrWindowEndCounter] + (scratchPixel >> 16 & 255);
            greenSumsForUpdates[columnIndexOrWindowEndCounter] = greenSumsForUpdates[columnIndexOrWindowEndCounter] + (scratchPixel >> 8 & 255);
            blueSumsForUpdates[columnIndexOrWindowEndCounter] = blueSumsForUpdates[columnIndexOrWindowEndCounter] + (scratchPixel & 255);
          }
          enteringPixelIndex = enteringPixelIndex + rowSkip;
          initialWindowRowOrNegativeOutputCounter++;
        }
        enteringPixelIndex = enteringPixelIndex + initialBottomWindowOvershoot * stride;
        for (columnIndexOrWindowEndCounter = 0; columnIndexOrWindowEndCounter < regionWidth; columnIndexOrWindowEndCounter++) {
          initialDestinationIndexBeforeIncrement = destinationIndex;
          destinationIndex++;
          pixels[initialDestinationIndexBeforeIncrement] = (redSumsSnapshot[columnIndexOrWindowEndCounter] / windowSampleCount << 16) + (greenSumsSnapshot[columnIndexOrWindowEndCounter] / windowSampleCount << 8) + blueSumsSnapshot[columnIndexOrWindowEndCounter] / windowSampleCount;
        }
        destinationIndex = destinationIndex + rowSkip;
        initialWindowRowOrNegativeOutputCounter = 1 - regionHeight;
        columnIndexOrWindowEndCounter = 1 + radius - regionHeight - regionTop;
        if (0 < columnIndexOrWindowEndCounter) {
          columnIndexOrWindowEndCounter = 0;
        }
        leavingPixelIndex = regionLeft + (regionTop - radius) * stride;
        if (initialWindowRowOrNegativeOutputCounter < columnIndexOrWindowEndCounter) {
          leavingPixelIndex = leavingPixelIndex + (columnIndexOrWindowEndCounter - initialWindowRowOrNegativeOutputCounter) * stride;
        }
        L8: while (initialWindowRowOrNegativeOutputCounter < columnIndexOrWindowEndCounter) {
          L26: {
            if (initialWindowRowOrNegativeOutputCounter + regionTop + regionHeight + radius < clipBottom) {
              for (columnIndex = 0; columnIndex < regionWidth; columnIndex++) {
                growingEnteringIndexBeforeIncrement = enteringPixelIndex;
                enteringPixelIndex++;
                scratchPixel = pixels[growingEnteringIndexBeforeIncrement];
                redSumsForUpdates[columnIndex] = redSumsForUpdates[columnIndex] + (scratchPixel >> 16 & 255);
                greenSumsForUpdates[columnIndex] = greenSumsForUpdates[columnIndex] + (scratchPixel >> 8 & 255);
                blueSumsForUpdates[columnIndex] = blueSumsForUpdates[columnIndex] + (scratchPixel & 255);
              }
              enteringPixelIndex = enteringPixelIndex + rowSkip;
              windowSampleCount++;
              break L26;
            }
            enteringPixelIndex = enteringPixelIndex + stride;
          }
          for (columnIndex = 0; columnIndex < regionWidth; columnIndex++) {
            channelSumAfterRemovalOrOutputRed = redSumsSnapshot[columnIndex] / windowSampleCount;
            outputGreen = greenSumsSnapshot[columnIndex] / windowSampleCount;
            outputBlue = blueSumsSnapshot[columnIndex] / windowSampleCount;
            growingDestinationIndexBeforeIncrement = destinationIndex;
            destinationIndex++;
            pixels[growingDestinationIndexBeforeIncrement] = (channelSumAfterRemovalOrOutputRed << 16) + (outputGreen << 8) + outputBlue;
          }
          destinationIndex = destinationIndex + rowSkip;
          initialWindowRowOrNegativeOutputCounter++;
        }
        columnIndexOrWindowEndCounter = framebufferHeight - regionTop - regionHeight - radius;
        if (0 < columnIndexOrWindowEndCounter) {
          columnIndexOrWindowEndCounter = 0;
        }
        L10: while (initialWindowRowOrNegativeOutputCounter < columnIndexOrWindowEndCounter) {
          for (columnIndex = 0; columnIndex < regionWidth; columnIndex++) {
            fullWindowLeavingIndexBeforeIncrement = leavingPixelIndex;
            leavingPixelIndex++;
            scratchPixel = pixels[fullWindowLeavingIndexBeforeIncrement];
            channelSumAfterRemovalOrOutputRed = redSumsSnapshot[columnIndex] - (scratchPixel >> 16 & 255);
            redSumsForClampedStore = (int[]) (redSumsForUpdates);
            redColumnForClampedStore = columnIndex;
            if (channelSumAfterRemovalOrOutputRed >= 0) {
              nonnegativeRedSum = channelSumAfterRemovalOrOutputRed;
            } else {
              nonnegativeRedSum = 0;
            }
            redSumsForClampedStore[redColumnForClampedStore] = nonnegativeRedSum;
            channelSumAfterRemovalOrOutputRed = greenSumsSnapshot[columnIndex] - (scratchPixel >> 8 & 255);
            greenSumsForClampedStore = (int[]) (greenSumsForUpdates);
            greenColumnForClampedStore = columnIndex;
            if (channelSumAfterRemovalOrOutputRed >= 0) {
              nonnegativeGreenSum = channelSumAfterRemovalOrOutputRed;
            } else {
              nonnegativeGreenSum = 0;
            }
            greenSumsForClampedStore[greenColumnForClampedStore] = nonnegativeGreenSum;
            channelSumAfterRemovalOrOutputRed = blueSumsSnapshot[columnIndex] - (scratchPixel & 255);
            blueSumsForClampedStore = (int[]) (blueSumsForUpdates);
            blueColumnForClampedStore = columnIndex;
            if (channelSumAfterRemovalOrOutputRed >= 0) {
              nonnegativeBlueSum = channelSumAfterRemovalOrOutputRed;
            } else {
              nonnegativeBlueSum = 0;
            }
            blueSumsForClampedStore[blueColumnForClampedStore] = nonnegativeBlueSum;
          }
          leavingPixelIndex = leavingPixelIndex + rowSkip;
          for (columnIndex = 0; columnIndex < regionWidth; columnIndex++) {
            fullWindowEnteringIndexBeforeIncrement = enteringPixelIndex;
            enteringPixelIndex++;
            scratchPixel = pixels[fullWindowEnteringIndexBeforeIncrement];
            redSumsForUpdates[columnIndex] = redSumsForUpdates[columnIndex] + (scratchPixel >> 16 & 255);
            greenSumsForUpdates[columnIndex] = greenSumsForUpdates[columnIndex] + (scratchPixel >> 8 & 255);
            blueSumsForUpdates[columnIndex] = blueSumsForUpdates[columnIndex] + (scratchPixel & 255);
          }
          enteringPixelIndex = enteringPixelIndex + rowSkip;
          for (columnIndex = 0; columnIndex < regionWidth; columnIndex++) {
            channelSumAfterRemovalOrOutputRed = redSumsSnapshot[columnIndex] * reciprocalWindowScaleQ14 >> 14;
            outputGreen = greenSumsSnapshot[columnIndex] * reciprocalWindowScaleQ14 >> 14;
            outputBlue = blueSumsSnapshot[columnIndex] * reciprocalWindowScaleQ14 >> 14;
            if (channelSumAfterRemovalOrOutputRed > 255) {
              channelSumAfterRemovalOrOutputRed = 255;
            }
            if (outputGreen > 255) {
              outputGreen = 255;
            }
            if (outputBlue > 255) {
              outputBlue = 255;
            }
            fullWindowDestinationIndexBeforeIncrement = destinationIndex;
            destinationIndex++;
            pixels[fullWindowDestinationIndexBeforeIncrement] = (channelSumAfterRemovalOrOutputRed << 16) + (outputGreen << 8) + outputBlue;
          }
          destinationIndex = destinationIndex + rowSkip;
          initialWindowRowOrNegativeOutputCounter++;
        }
        L11: while (initialWindowRowOrNegativeOutputCounter < 0) {
          for (columnIndex = 0; columnIndex < regionWidth; columnIndex++) {
            shrinkingLeavingIndexBeforeIncrement = leavingPixelIndex;
            leavingPixelIndex++;
            scratchPixel = pixels[shrinkingLeavingIndexBeforeIncrement];
            redSumsForUpdates[columnIndex] = redSumsForUpdates[columnIndex] - (scratchPixel >> 16 & 255);
            greenSumsForUpdates[columnIndex] = greenSumsForUpdates[columnIndex] - (scratchPixel >> 8 & 255);
            blueSumsForUpdates[columnIndex] = blueSumsForUpdates[columnIndex] - (scratchPixel & 255);
          }
          leavingPixelIndex = leavingPixelIndex + rowSkip;
          windowSampleCount--;
          for (columnIndex = 0; columnIndex < regionWidth; columnIndex++) {
            channelSumAfterRemovalOrOutputRed = redSumsSnapshot[columnIndex] / windowSampleCount;
            outputGreen = greenSumsSnapshot[columnIndex] / windowSampleCount;
            outputBlue = blueSumsSnapshot[columnIndex] / windowSampleCount;
            if (channelSumAfterRemovalOrOutputRed >= 0) {
              if (channelSumAfterRemovalOrOutputRed > 255) {
                channelSumAfterRemovalOrOutputRed = 255;
              }
            } else {
              channelSumAfterRemovalOrOutputRed = 0;
            }
            if (outputGreen >= 0) {
              if (outputGreen > 255) {
                outputGreen = 255;
              }
            } else {
              outputGreen = 0;
            }
            if (outputBlue >= 0) {
              if (outputBlue > 255) {
                outputBlue = 255;
              }
            } else {
              outputBlue = 0;
            }
            shrinkingDestinationIndexBeforeIncrement = destinationIndex;
            destinationIndex++;
            pixels[shrinkingDestinationIndexBeforeIncrement] = (channelSumAfterRemovalOrOutputRed << 16) + (outputGreen << 8) + outputBlue;
          }
          destinationIndex = destinationIndex + rowSkip;
          initialWindowRowOrNegativeOutputCounter++;
        }
    }

    final static void restoreClip(int[] clipBounds) {
        clipLeft = clipBounds[0];
        clipTop = clipBounds[1];
        clipRight = clipBounds[2];
        clipBottom = clipBounds[3];
        SoftwareRasterizer.clearScanlineMasks();
    }

    private final static void drawVerticalLine(int x, int y, int length, int color) {
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
            var4 = x + y * stride;
            var5 = 0;
            while (var5 < length) {
                framebuffer[var4] = color;
                var5++;
                var4 = var4 + stride;
            }
            return;
        }
    }

    final static void setRasterTarget(int[] targetPixels, int targetWidth, int targetHeight) {
        framebuffer = targetPixels;
        stride = targetWidth;
        framebufferHeight = targetHeight;
        SoftwareRasterizer.setClip(0, 0, targetWidth, targetHeight);
    }

    static {
        clipBottom = 0;
        clipRight = 0;
        clipTop = 0;
        clipLeft = 0;
    }
}
