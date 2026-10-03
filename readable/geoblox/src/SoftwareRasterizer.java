/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SoftwareRasterizer {
    private static int[] blurColumnRedSums;
    static int[] scanlineMaskWidths;
    static int clipBottom;
    private static int[] blurColumnBlueSums;
    static int clipRight;
    static int[] scanlineMaskStarts;
    static int clipTop;
    static int stride;
    static int framebufferHeight;
    static int[] framebuffer;
    static int clipLeft;
    private static int[] blurColumnGreenSums;

    final static void fillVerticalGradient(int x, int y, int width, int height, int topColor, int bottomColor) {
        int negativeRowCounter = 0;
        int negativeColumnCounter = 0;
        int destinationIndexBeforeIncrement = 0;
        int gradientPositionQ16;
        int gradientStepQ16;
        int destinationRowSkip;
        int destinationIndex;
        int topWeight256;
        int bottomWeight256;
        int interpolatedColor;
        gradientPositionQ16 = 0;
        gradientStepQ16 = 65536 / height;
        if (x < clipLeft) {
          width = width - (clipLeft - x);
          x = clipLeft;
        }
        if (y < clipTop) {
          gradientPositionQ16 = gradientPositionQ16 + (clipTop - y) * gradientStepQ16;
          height = height - (clipTop - y);
          y = clipTop;
        }
        if (x + width > clipRight) {
          width = clipRight - x;
        }
        if (y + height > clipBottom) {
          height = clipBottom - y;
        }
        destinationRowSkip = stride - width;
        destinationIndex = x + y * stride;
        for (negativeRowCounter = -height; negativeRowCounter < 0; negativeRowCounter++) {
          topWeight256 = 65536 - gradientPositionQ16 >> 8;
          bottomWeight256 = gradientPositionQ16 >> 8;
          interpolatedColor = ((topColor & 16711935) * topWeight256 + (bottomColor & 16711935) * bottomWeight256 & -16711936) + ((topColor & 65280) * topWeight256 + (bottomColor & 65280) * bottomWeight256 & 16711680) >>> 8;
          for (negativeColumnCounter = -width; negativeColumnCounter < 0; negativeColumnCounter++) {
            destinationIndexBeforeIncrement = destinationIndex;
            destinationIndex++;
            framebuffer[destinationIndexBeforeIncrement] = interpolatedColor;
          }
          destinationIndex = destinationIndex + destinationRowSkip;
          gradientPositionQ16 = gradientPositionQ16 + gradientStepQ16;
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
        int shadowOffset = 0;
        int shadowAlpha256 = 0;
        for (shadowOffset = 0; shadowOffset < 4; shadowOffset++) {
            shadowAlpha256 = 128 - (shadowOffset << 5);
            SoftwareRasterizer.drawHorizontalLineAlpha(x + shadowOffset, y + height + shadowOffset, width, color, shadowAlpha256);
            SoftwareRasterizer.drawVerticalLineAlpha(x + width + shadowOffset, y + shadowOffset, height + 1, color, shadowAlpha256);
        }
    }

    final static void saveClip(int[] clipBounds) {
        clipBounds[0] = clipLeft;
        clipBounds[1] = clipTop;
        clipBounds[2] = clipRight;
        clipBounds[3] = clipBottom;
    }

    final static void grayscaleRectangle(int x, int y, int width, int height) {
        int rowIndex = 0;
        int columnIndex = 0;
        int destinationColor = 0;
        int twiceRed = 0;
        int green = 0;
        int blue = 0;
        int grayLevel = 0;
        int destinationIndexBeforeIncrement = 0;
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
        int destinationIndex = x + y * stride;
        if (width > 0) {
            if (height <= 0) {
                return;
            }
            for (rowIndex = 0; rowIndex < height; rowIndex++) {
                for (columnIndex = 0; columnIndex < width; columnIndex++) {
                    destinationColor = framebuffer[destinationIndex];
                    twiceRed = destinationColor >> 15 & 510;
                    green = destinationColor >> 8 & 255;
                    blue = destinationColor & 255;
                    grayLevel = (blue + twiceRed) / 3 + green >> 1;
                    destinationIndexBeforeIncrement = destinationIndex;
                    destinationIndex++;
                    framebuffer[destinationIndexBeforeIncrement] = (grayLevel << 16) + (grayLevel << 8) + grayLevel;
                }
                destinationIndex = destinationIndex + (stride - width);
            }
            return;
        }
    }

    final static void drawRoundedRectangle(int x, int y, int width, int height, int cornerRadius, int color) {
        int unclippedMinorOffsetBeforeIncrement = 0;
        int clippedMinorOffsetBeforeIncrement = 0;
        int leftCornerCenterX;
        int topCornerCenterY;
        int rightCornerCenterX;
        int bottomCornerCenterY;
        int upperLeftOuterRowCenterIndex;
        int upperRightOuterRowCenterIndex;
        int upperLeftInnerRowCenterIndex;
        int upperRightInnerRowCenterIndex;
        int lowerLeftInnerRowCenterIndex;
        int lowerRightInnerRowCenterIndex;
        int lowerLeftOuterRowCenterIndex;
        int lowerRightOuterRowCenterIndex;
        int arcMajorOffset;
        int arcMinorOffset;
        int radiusSquared;
        int xAdjustedSquaredDistance;
        int edgePixelIndex;
        if (cornerRadius == 0) {
          SoftwareRasterizer.drawRectangle(x, y, width, height, color);
          return;
        }
        if (cornerRadius < 0) {
          cornerRadius = -cornerRadius;
        }
        leftCornerCenterX = x + cornerRadius;
        topCornerCenterY = y + cornerRadius;
        rightCornerCenterX = x + width - cornerRadius - 1;
        bottomCornerCenterY = y + height - cornerRadius - 1;
        if (clipRight > clipLeft) {
          if (clipBottom <= clipTop) {
            return;
          }
          if (x + width > clipLeft) {
            if ((x < clipRight) &&
                (y + height >= clipTop) &&
                (y < clipBottom)) {
              upperLeftOuterRowCenterIndex = leftCornerCenterX + (topCornerCenterY - cornerRadius) * stride;
              upperRightOuterRowCenterIndex = rightCornerCenterX + (topCornerCenterY - cornerRadius) * stride;
              upperLeftInnerRowCenterIndex = leftCornerCenterX + topCornerCenterY * stride;
              upperRightInnerRowCenterIndex = rightCornerCenterX + topCornerCenterY * stride;
              lowerLeftInnerRowCenterIndex = leftCornerCenterX + bottomCornerCenterY * stride;
              lowerRightInnerRowCenterIndex = rightCornerCenterX + bottomCornerCenterY * stride;
              lowerLeftOuterRowCenterIndex = leftCornerCenterX + (bottomCornerCenterY + cornerRadius) * stride;
              lowerRightOuterRowCenterIndex = rightCornerCenterX + (bottomCornerCenterY + cornerRadius) * stride;
              arcMajorOffset = cornerRadius;
              arcMinorOffset = 0;
              radiusSquared = cornerRadius * cornerRadius;
              xAdjustedSquaredDistance = radiusSquared - arcMajorOffset;
              if ((x >= clipLeft) &&
                  (x + width < clipRight) &&
                  (y >= clipTop) &&
                  (y + height < clipBottom)) {
                for (edgePixelIndex = upperLeftInnerRowCenterIndex; edgePixelIndex <= lowerLeftInnerRowCenterIndex; edgePixelIndex = edgePixelIndex + stride) {
                  framebuffer[edgePixelIndex - arcMajorOffset] = color;
                }
                for (edgePixelIndex = upperRightInnerRowCenterIndex; edgePixelIndex <= lowerRightInnerRowCenterIndex; edgePixelIndex = edgePixelIndex + stride) {
                  framebuffer[edgePixelIndex + arcMajorOffset] = color;
                }
                for (edgePixelIndex = upperLeftOuterRowCenterIndex; edgePixelIndex <= upperRightOuterRowCenterIndex; edgePixelIndex++) {
                  framebuffer[edgePixelIndex] = color;
                }
                for (edgePixelIndex = lowerLeftOuterRowCenterIndex; edgePixelIndex <= lowerRightOuterRowCenterIndex; edgePixelIndex++) {
                  framebuffer[edgePixelIndex] = color;
                }
                while (true) {
                  unclippedMinorOffsetBeforeIncrement = arcMinorOffset;
                  arcMinorOffset++;
                  xAdjustedSquaredDistance = xAdjustedSquaredDistance + (unclippedMinorOffsetBeforeIncrement + arcMinorOffset);
                  upperLeftInnerRowCenterIndex = upperLeftInnerRowCenterIndex - stride;
                  upperRightInnerRowCenterIndex = upperRightInnerRowCenterIndex - stride;
                  lowerLeftInnerRowCenterIndex = lowerLeftInnerRowCenterIndex + stride;
                  lowerRightInnerRowCenterIndex = lowerRightInnerRowCenterIndex + stride;
                  if (xAdjustedSquaredDistance > radiusSquared) {
                    arcMajorOffset--;
                    xAdjustedSquaredDistance = xAdjustedSquaredDistance - (arcMajorOffset + arcMajorOffset);
                    upperLeftOuterRowCenterIndex = upperLeftOuterRowCenterIndex + stride;
                    upperRightOuterRowCenterIndex = upperRightOuterRowCenterIndex + stride;
                    lowerLeftOuterRowCenterIndex = lowerLeftOuterRowCenterIndex - stride;
                    lowerRightOuterRowCenterIndex = lowerRightOuterRowCenterIndex - stride;
                  }
                  if (arcMajorOffset < arcMinorOffset) {
                    return;
                  }
                  framebuffer[upperLeftOuterRowCenterIndex - arcMinorOffset] = color;
                  framebuffer[upperRightOuterRowCenterIndex + arcMinorOffset] = color;
                  framebuffer[upperLeftInnerRowCenterIndex - arcMajorOffset] = color;
                  framebuffer[upperRightInnerRowCenterIndex + arcMajorOffset] = color;
                  framebuffer[lowerLeftInnerRowCenterIndex - arcMajorOffset] = color;
                  framebuffer[lowerRightInnerRowCenterIndex + arcMajorOffset] = color;
                  framebuffer[lowerLeftOuterRowCenterIndex - arcMinorOffset] = color;
                  framebuffer[lowerRightOuterRowCenterIndex + arcMinorOffset] = color;
                  continue;
                }
              }
              SoftwareRasterizer.drawVerticalLine(x, y + arcMajorOffset, height - arcMajorOffset - arcMajorOffset, color);
              SoftwareRasterizer.drawVerticalLine(x + width - 1, y + arcMajorOffset, height - arcMajorOffset - arcMajorOffset, color);
              SoftwareRasterizer.drawHorizontalLine(x + arcMajorOffset, y, width - arcMajorOffset - arcMajorOffset, color);
              SoftwareRasterizer.drawHorizontalLine(x + arcMajorOffset, y + height - 1, width - arcMajorOffset - arcMajorOffset, color);
              while (true) {
                clippedMinorOffsetBeforeIncrement = arcMinorOffset;
                arcMinorOffset++;
                xAdjustedSquaredDistance = xAdjustedSquaredDistance + (clippedMinorOffsetBeforeIncrement + arcMinorOffset);
                upperLeftInnerRowCenterIndex = upperLeftInnerRowCenterIndex - stride;
                upperRightInnerRowCenterIndex = upperRightInnerRowCenterIndex - stride;
                lowerLeftInnerRowCenterIndex = lowerLeftInnerRowCenterIndex + stride;
                lowerRightInnerRowCenterIndex = lowerRightInnerRowCenterIndex + stride;
                if (xAdjustedSquaredDistance > radiusSquared) {
                  arcMajorOffset--;
                  xAdjustedSquaredDistance = xAdjustedSquaredDistance - (arcMajorOffset + arcMajorOffset);
                  upperLeftOuterRowCenterIndex = upperLeftOuterRowCenterIndex + stride;
                  upperRightOuterRowCenterIndex = upperRightOuterRowCenterIndex + stride;
                  lowerLeftOuterRowCenterIndex = lowerLeftOuterRowCenterIndex - stride;
                  lowerRightOuterRowCenterIndex = lowerRightOuterRowCenterIndex - stride;
                }
                if (arcMajorOffset < arcMinorOffset) {
                  return;
                }
                if ((topCornerCenterY - arcMajorOffset >= clipTop) &&
                    (topCornerCenterY - arcMajorOffset < clipBottom)) {
                  if ((leftCornerCenterX - arcMinorOffset >= clipLeft) &&
                      (leftCornerCenterX - arcMinorOffset < clipRight)) {
                    framebuffer[upperLeftOuterRowCenterIndex - arcMinorOffset] = color;
                  }
                  if ((rightCornerCenterX + arcMinorOffset >= clipLeft) &&
                      (rightCornerCenterX + arcMinorOffset < clipRight)) {
                    framebuffer[upperRightOuterRowCenterIndex + arcMinorOffset] = color;
                  }
                }
                if ((topCornerCenterY - arcMinorOffset >= clipTop) &&
                    (topCornerCenterY - arcMinorOffset < clipBottom)) {
                  if ((leftCornerCenterX - arcMajorOffset >= clipLeft) &&
                      (leftCornerCenterX - arcMajorOffset < clipRight)) {
                    framebuffer[upperLeftInnerRowCenterIndex - arcMajorOffset] = color;
                  }
                  if ((rightCornerCenterX + arcMajorOffset >= clipLeft) &&
                      (rightCornerCenterX + arcMajorOffset < clipRight)) {
                    framebuffer[upperRightInnerRowCenterIndex + arcMajorOffset] = color;
                  }
                }
                if ((bottomCornerCenterY + arcMinorOffset >= clipTop) &&
                    (bottomCornerCenterY + arcMinorOffset < clipBottom)) {
                  if ((leftCornerCenterX - arcMajorOffset >= clipLeft) &&
                      (leftCornerCenterX - arcMajorOffset < clipRight)) {
                    framebuffer[lowerLeftInnerRowCenterIndex - arcMajorOffset] = color;
                  }
                  if ((rightCornerCenterX + arcMajorOffset >= clipLeft) &&
                      (rightCornerCenterX + arcMajorOffset < clipRight)) {
                    framebuffer[lowerRightInnerRowCenterIndex + arcMajorOffset] = color;
                  }
                }
                if (bottomCornerCenterY + arcMajorOffset < clipTop) {
                  continue;
                }
                if (bottomCornerCenterY + arcMajorOffset >= clipBottom) {
                  continue;
                }
                if ((leftCornerCenterX - arcMinorOffset >= clipLeft) &&
                    (leftCornerCenterX - arcMinorOffset < clipRight)) {
                  framebuffer[lowerLeftOuterRowCenterIndex - arcMinorOffset] = color;
                }
                if (rightCornerCenterX + arcMinorOffset < clipLeft) {
                  continue;
                }
                if (rightCornerCenterX + arcMinorOffset >= clipRight) {
                  continue;
                }
                framebuffer[lowerRightOuterRowCenterIndex + arcMinorOffset] = color;
                continue;
              }
            }
            return;
          }
        }
        return;
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
          while (windowXOrNegativeOutputCounter < initialWindowRight) {
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
          while (windowXOrNegativeOutputCounter < fullWindowEndCounter) {
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
          while (windowXOrNegativeOutputCounter < 0) {
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
        int destinationWeight256 = 0;
        int sourceRedWeighted = 0;
        int sourceGreenWeighted = 0;
        int sourceBlueWeighted = 0;
        int destinationIndex = 0;
        int pixelOffset = 0;
        int destinationRedWeighted = 0;
        int destinationGreenWeighted = 0;
        int destinationBlueWeighted = 0;
        int blendedColor = 0;
        int destinationIndexBeforeIncrement = 0;
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
            destinationWeight256 = 256 - alpha256;
            sourceRedWeighted = (color >> 16 & 255) * alpha256;
            sourceGreenWeighted = (color >> 8 & 255) * alpha256;
            sourceBlueWeighted = (color & 255) * alpha256;
            destinationIndex = x + y * stride;
            for (pixelOffset = 0; pixelOffset < length; pixelOffset++) {
                destinationRedWeighted = (framebuffer[destinationIndex] >> 16 & 255) * destinationWeight256;
                destinationGreenWeighted = (framebuffer[destinationIndex] >> 8 & 255) * destinationWeight256;
                destinationBlueWeighted = (framebuffer[destinationIndex] & 255) * destinationWeight256;
                blendedColor = (sourceRedWeighted + destinationRedWeighted >> 8 << 16) + (sourceGreenWeighted + destinationGreenWeighted >> 8 << 8) + (sourceBlueWeighted + destinationBlueWeighted >> 8);
                destinationIndexBeforeIncrement = destinationIndex;
                destinationIndex++;
                framebuffer[destinationIndexBeforeIncrement] = blendedColor;
            }
            return;
        }
    }

    private final static void drawVerticalLineAlpha(int x, int y, int length, int color, int alpha256) {
        int destinationWeight256 = 0;
        int sourceRedWeighted = 0;
        int sourceGreenWeighted = 0;
        int sourceBlueWeighted = 0;
        int destinationIndex = 0;
        int pixelOffset = 0;
        int destinationRedWeighted = 0;
        int destinationGreenWeighted = 0;
        int destinationBlueWeighted = 0;
        int blendedColor = 0;
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
            destinationWeight256 = 256 - alpha256;
            sourceRedWeighted = (color >> 16 & 255) * alpha256;
            sourceGreenWeighted = (color >> 8 & 255) * alpha256;
            sourceBlueWeighted = (color & 255) * alpha256;
            destinationIndex = x + y * stride;
            for (pixelOffset = 0; pixelOffset < length; pixelOffset++) {
                destinationRedWeighted = (framebuffer[destinationIndex] >> 16 & 255) * destinationWeight256;
                destinationGreenWeighted = (framebuffer[destinationIndex] >> 8 & 255) * destinationWeight256;
                destinationBlueWeighted = (framebuffer[destinationIndex] & 255) * destinationWeight256;
                blendedColor = (sourceRedWeighted + destinationRedWeighted >> 8 << 16) + (sourceGreenWeighted + destinationGreenWeighted >> 8 << 8) + (sourceBlueWeighted + destinationBlueWeighted >> 8);
                framebuffer[destinationIndex] = blendedColor;
                destinationIndex = destinationIndex + stride;
            }
            return;
        }
    }

    public static void releaseRasterStorage() {
        framebuffer = null;
        scanlineMaskStarts = null;
        scanlineMaskWidths = null;
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
        scanlineMaskStarts = null;
        scanlineMaskWidths = null;
    }

    final static void fillCircleAlpha(int centerX, int centerY, int radius, int color, int alpha256) {
        int upperDestinationIndexBeforeIncrement = 0;
        int upperYOffsetBeforeDecrement = 0;
        int upperXExtentBeforeIncrement = 0;
        int lowerXExtentBeforeDecrement = 0;
        int lowerDestinationIndexBeforeIncrement = 0;
        int lowerYOffsetBeforeIncrement = 0;
        int destinationWeight256;
        int sourceRedWeighted;
        int sourceGreenWeighted;
        int sourceBlueWeighted;
        int destinationRedWeighted;
        int destinationGreenWeighted;
        int destinationBlueWeighted;
        int clippedTop;
        int clippedBottomExclusive;
        int rowY;
        int radiusSquared;
        int xExtent;
        int yOffset;
        int xAdjustedSquaredDistance;
        int yAdjustedSquaredDistance;
        int spanLeft;
        int spanRightExclusiveOrInclusive;
        int destinationIndex;
        int spanX;
        int blendedColor;
        int lowerDestinationIndex;
        if (alpha256 == 0) {
          return;
        }
        if (alpha256 == 256) {
          SoftwareRasterizer.fillCircle(centerX, centerY, radius, color);
          return;
        }
        if (radius < 0) {
          radius = -radius;
        }
        destinationWeight256 = 256 - alpha256;
        sourceRedWeighted = (color >> 16 & 255) * alpha256;
        sourceGreenWeighted = (color >> 8 & 255) * alpha256;
        sourceBlueWeighted = (color & 255) * alpha256;
        clippedTop = centerY - radius;
        if (clippedTop < clipTop) {
          clippedTop = clipTop;
        }
        clippedBottomExclusive = centerY + radius + 1;
        if (clippedBottomExclusive > clipBottom) {
          clippedBottomExclusive = clipBottom;
        }
        rowY = clippedTop;
        radiusSquared = radius * radius;
        xExtent = 0;
        yOffset = centerY - rowY;
        xAdjustedSquaredDistance = yOffset * yOffset;
        yAdjustedSquaredDistance = xAdjustedSquaredDistance - yOffset;
        if (centerY > clippedBottomExclusive) {
          centerY = clippedBottomExclusive;
        }
        L4: while (true) {
          if (rowY < centerY) {
            while (true) {
              if ((yAdjustedSquaredDistance > radiusSquared) &&
                  (xAdjustedSquaredDistance > radiusSquared)) {
                spanLeft = centerX - xExtent + 1;
                if (spanLeft < clipLeft) {
                  spanLeft = clipLeft;
                }
                spanRightExclusiveOrInclusive = centerX + xExtent;
                if (spanRightExclusiveOrInclusive > clipRight) {
                  spanRightExclusiveOrInclusive = clipRight;
                }
                destinationIndex = spanLeft + rowY * stride;
                for (spanX = spanLeft; spanX < spanRightExclusiveOrInclusive; spanX++) {
                  destinationRedWeighted = (framebuffer[destinationIndex] >> 16 & 255) * destinationWeight256;
                  destinationGreenWeighted = (framebuffer[destinationIndex] >> 8 & 255) * destinationWeight256;
                  destinationBlueWeighted = (framebuffer[destinationIndex] & 255) * destinationWeight256;
                  blendedColor = (sourceRedWeighted + destinationRedWeighted >> 8 << 16) + (sourceGreenWeighted + destinationGreenWeighted >> 8 << 8) + (sourceBlueWeighted + destinationBlueWeighted >> 8);
                  upperDestinationIndexBeforeIncrement = destinationIndex;
                  destinationIndex++;
                  framebuffer[upperDestinationIndexBeforeIncrement] = blendedColor;
                }
                rowY++;
                upperYOffsetBeforeDecrement = yOffset;
                yOffset--;
                xAdjustedSquaredDistance = xAdjustedSquaredDistance - (upperYOffsetBeforeDecrement + yOffset);
                yAdjustedSquaredDistance = yAdjustedSquaredDistance - (yOffset + yOffset);
                continue L4;
              }
              xAdjustedSquaredDistance = xAdjustedSquaredDistance + (xExtent + xExtent);
              upperXExtentBeforeIncrement = xExtent;
              xExtent++;
              yAdjustedSquaredDistance = yAdjustedSquaredDistance + (upperXExtentBeforeIncrement + xExtent);
              continue;
            }
          }
          xExtent = radius;
          yOffset = -yOffset;
          yAdjustedSquaredDistance = yOffset * yOffset + radiusSquared;
          xAdjustedSquaredDistance = yAdjustedSquaredDistance - xExtent;
          yAdjustedSquaredDistance = yAdjustedSquaredDistance - yOffset;
          while (rowY < clippedBottomExclusive) {
            while (yAdjustedSquaredDistance > radiusSquared) {
              if (xAdjustedSquaredDistance > radiusSquared) {
                lowerXExtentBeforeDecrement = xExtent;
                xExtent--;
                yAdjustedSquaredDistance = yAdjustedSquaredDistance - (lowerXExtentBeforeDecrement + xExtent);
                xAdjustedSquaredDistance = xAdjustedSquaredDistance - (xExtent + xExtent);
                continue;
              }
              break;
            }
            spanLeft = centerX - xExtent;
            if (spanLeft < clipLeft) {
              spanLeft = clipLeft;
            }
            spanRightExclusiveOrInclusive = centerX + xExtent;
            if (spanRightExclusiveOrInclusive > clipRight - 1) {
              spanRightExclusiveOrInclusive = clipRight - 1;
            }
            lowerDestinationIndex = spanLeft + rowY * stride;
            destinationIndex = lowerDestinationIndex;
            for (spanX = spanLeft; spanX <= spanRightExclusiveOrInclusive; spanX++) {
              destinationRedWeighted = (framebuffer[lowerDestinationIndex] >> 16 & 255) * destinationWeight256;
              destinationGreenWeighted = (framebuffer[lowerDestinationIndex] >> 8 & 255) * destinationWeight256;
              destinationBlueWeighted = (framebuffer[lowerDestinationIndex] & 255) * destinationWeight256;
              blendedColor = (sourceRedWeighted + destinationRedWeighted >> 8 << 16) + (sourceGreenWeighted + destinationGreenWeighted >> 8 << 8) + (sourceBlueWeighted + destinationBlueWeighted >> 8);
              lowerDestinationIndexBeforeIncrement = lowerDestinationIndex;
              lowerDestinationIndex++;
              framebuffer[lowerDestinationIndexBeforeIncrement] = blendedColor;
            }
            rowY++;
            yAdjustedSquaredDistance = yAdjustedSquaredDistance + (yOffset + yOffset);
            lowerYOffsetBeforeIncrement = yOffset;
            yOffset++;
            xAdjustedSquaredDistance = xAdjustedSquaredDistance + (lowerYOffsetBeforeIncrement + yOffset);
          }
          return;
        }
    }

    final static void fillRectangle(int x, int y, int width, int height, int color) {
        int negativeRowCounter = 0;
        int negativeColumnCounter = 0;
        int destinationIndexBeforeIncrement = 0;
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
        int destinationRowSkip = stride - width;
        int destinationIndex = x + y * stride;
        for (negativeRowCounter = -height; negativeRowCounter < 0; negativeRowCounter++) {
            for (negativeColumnCounter = -width; negativeColumnCounter < 0; negativeColumnCounter++) {
                destinationIndexBeforeIncrement = destinationIndex;
                destinationIndex++;
                framebuffer[destinationIndexBeforeIncrement] = color;
            }
            destinationIndex = destinationIndex + destinationRowSkip;
        }
    }

    final static void drawHorizontalLine(int x, int y, int length, int color) {
        int rowStartIndex = 0;
        int pixelOffset = 0;
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
            rowStartIndex = x + y * stride;
            for (pixelOffset = 0; pixelOffset < length; pixelOffset++) {
                framebuffer[rowStartIndex + pixelOffset] = color;
            }
            return;
        }
    }

    final static void fillCircle(int centerX, int centerY, int radius, int color) {
        int upperDestinationIndexBeforeIncrement = 0;
        int upperYOffsetBeforeDecrement = 0;
        int upperXExtentBeforeIncrement = 0;
        int lowerXExtentBeforeDecrement = 0;
        int lowerDestinationIndexBeforeIncrement = 0;
        int lowerYOffsetBeforeIncrement = 0;
        int clippedTop;
        int clippedBottomExclusive;
        int rowY;
        int radiusSquared;
        int xExtent;
        int yOffset;
        int xAdjustedSquaredDistance;
        int yAdjustedSquaredDistance;
        int spanLeft;
        int spanRightExclusiveOrInclusive;
        int destinationIndex;
        int spanX;
        if (radius == 0) {
          SoftwareRasterizer.setPixel(centerX, centerY, color);
          return;
        }
        if (radius < 0) {
          radius = -radius;
        }
        clippedTop = centerY - radius;
        if (clippedTop < clipTop) {
          clippedTop = clipTop;
        }
        clippedBottomExclusive = centerY + radius + 1;
        if (clippedBottomExclusive > clipBottom) {
          clippedBottomExclusive = clipBottom;
        }
        rowY = clippedTop;
        radiusSquared = radius * radius;
        xExtent = 0;
        yOffset = centerY - rowY;
        xAdjustedSquaredDistance = yOffset * yOffset;
        yAdjustedSquaredDistance = xAdjustedSquaredDistance - yOffset;
        if (centerY > clippedBottomExclusive) {
          centerY = clippedBottomExclusive;
        }
        L4: while (true) {
          if (rowY < centerY) {
            while (true) {
              if ((yAdjustedSquaredDistance > radiusSquared) &&
                  (xAdjustedSquaredDistance > radiusSquared)) {
                spanLeft = centerX - xExtent + 1;
                if (spanLeft < clipLeft) {
                  spanLeft = clipLeft;
                }
                spanRightExclusiveOrInclusive = centerX + xExtent;
                if (spanRightExclusiveOrInclusive > clipRight) {
                  spanRightExclusiveOrInclusive = clipRight;
                }
                destinationIndex = spanLeft + rowY * stride;
                for (spanX = spanLeft; spanX < spanRightExclusiveOrInclusive; spanX++) {
                  upperDestinationIndexBeforeIncrement = destinationIndex;
                  destinationIndex++;
                  framebuffer[upperDestinationIndexBeforeIncrement] = color;
                }
                rowY++;
                upperYOffsetBeforeDecrement = yOffset;
                yOffset--;
                xAdjustedSquaredDistance = xAdjustedSquaredDistance - (upperYOffsetBeforeDecrement + yOffset);
                yAdjustedSquaredDistance = yAdjustedSquaredDistance - (yOffset + yOffset);
                continue L4;
              }
              xAdjustedSquaredDistance = xAdjustedSquaredDistance + (xExtent + xExtent);
              upperXExtentBeforeIncrement = xExtent;
              xExtent++;
              yAdjustedSquaredDistance = yAdjustedSquaredDistance + (upperXExtentBeforeIncrement + xExtent);
              continue;
            }
          }
          xExtent = radius;
          yOffset = rowY - centerY;
          yAdjustedSquaredDistance = yOffset * yOffset + radiusSquared;
          xAdjustedSquaredDistance = yAdjustedSquaredDistance - xExtent;
          yAdjustedSquaredDistance = yAdjustedSquaredDistance - yOffset;
          while (rowY < clippedBottomExclusive) {
            while (yAdjustedSquaredDistance > radiusSquared) {
              if (xAdjustedSquaredDistance > radiusSquared) {
                lowerXExtentBeforeDecrement = xExtent;
                xExtent--;
                yAdjustedSquaredDistance = yAdjustedSquaredDistance - (lowerXExtentBeforeDecrement + xExtent);
                xAdjustedSquaredDistance = xAdjustedSquaredDistance - (xExtent + xExtent);
                continue;
              }
              break;
            }
            spanLeft = centerX - xExtent;
            if (spanLeft < clipLeft) {
              spanLeft = clipLeft;
            }
            spanRightExclusiveOrInclusive = centerX + xExtent;
            if (spanRightExclusiveOrInclusive > clipRight - 1) {
              spanRightExclusiveOrInclusive = clipRight - 1;
            }
            destinationIndex = spanLeft + rowY * stride;
            for (spanX = spanLeft; spanX <= spanRightExclusiveOrInclusive; spanX++) {
              lowerDestinationIndexBeforeIncrement = destinationIndex;
              destinationIndex++;
              framebuffer[lowerDestinationIndexBeforeIncrement] = color;
            }
            rowY++;
            yAdjustedSquaredDistance = yAdjustedSquaredDistance + (yOffset + yOffset);
            lowerYOffsetBeforeIncrement = yOffset;
            yOffset++;
            xAdjustedSquaredDistance = xAdjustedSquaredDistance + (lowerYOffsetBeforeIncrement + yOffset);
          }
          return;
        }
    }

    final static void drawLine(int startX, int startY, int endX, int endY, int color) {
        int minorAxisStepQ16;
        int minorAxisPixel;
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
          minorAxisStepQ16 = (int)Math.floor((double)endX / (double)endY + 0.5);
          endY = endY + startY;
          if (startY < clipTop) {
            startX = startX + minorAxisStepQ16 * (clipTop - startY);
            startY = clipTop;
          }
          if (endY >= clipBottom) {
            endY = clipBottom - 1;
          }
          while (startY <= endY) {
            minorAxisPixel = startX >> 16;
            if ((minorAxisPixel >= clipLeft) &&
                (minorAxisPixel < clipRight)) {
              framebuffer[minorAxisPixel + startY * stride] = color;
            }
            startX = startX + minorAxisStepQ16;
            startY++;
          }
          return;
        }
        startY = startY << 16;
        startY = startY + 32768;
        endY = endY << 16;
        minorAxisStepQ16 = (int)Math.floor((double)endY / (double)endX + 0.5);
        endX = endX + startX;
        if (startX < clipLeft) {
          startY = startY + minorAxisStepQ16 * (clipLeft - startX);
          startX = clipLeft;
        }
        if (endX >= clipRight) {
          endX = clipRight - 1;
        }
        while (startX <= endX) {
          minorAxisPixel = startY >> 16;
          if ((minorAxisPixel >= clipTop) &&
              (minorAxisPixel < clipBottom)) {
            framebuffer[startX + minorAxisPixel * stride] = color;
          }
          startY = startY + minorAxisStepQ16;
          startX++;
        }
    }

    final static void drawCircle(int centerX, int centerY, int radius, int color) {
        int unclippedMinorOffsetBeforeIncrement = 0;
        int clippedMinorOffsetBeforeIncrement = 0;
        int upperMinorRowCenterIndex;
        int lowerMinorRowCenterIndex;
        int upperMajorRowCenterIndex;
        int lowerMajorRowCenterIndex;
        int arcMajorOffset;
        int arcMinorOffset;
        int xAdjustedSquaredDistance;
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
            if ((centerX - radius < clipRight) &&
                (centerY + radius >= clipTop) &&
                (centerY - radius < clipBottom)) {
              upperMinorRowCenterIndex = centerX + centerY * stride;
              lowerMinorRowCenterIndex = upperMinorRowCenterIndex;
              upperMajorRowCenterIndex = upperMinorRowCenterIndex - radius * stride;
              lowerMajorRowCenterIndex = upperMinorRowCenterIndex + radius * stride;
              arcMajorOffset = radius;
              arcMinorOffset = 0;
              radius = radius * radius;
              xAdjustedSquaredDistance = radius - arcMajorOffset;
              if ((centerX - arcMajorOffset >= clipLeft) &&
                  (centerX + arcMajorOffset < clipRight) &&
                  (centerY - arcMajorOffset >= clipTop) &&
                  (centerY + arcMajorOffset < clipBottom)) {
                framebuffer[upperMinorRowCenterIndex - arcMajorOffset] = color;
                framebuffer[upperMinorRowCenterIndex + arcMajorOffset] = color;
                framebuffer[upperMajorRowCenterIndex] = color;
                framebuffer[lowerMajorRowCenterIndex] = color;
                while (true) {
                  unclippedMinorOffsetBeforeIncrement = arcMinorOffset;
                  arcMinorOffset++;
                  xAdjustedSquaredDistance = xAdjustedSquaredDistance + (unclippedMinorOffsetBeforeIncrement + arcMinorOffset);
                  upperMinorRowCenterIndex = upperMinorRowCenterIndex - stride;
                  lowerMinorRowCenterIndex = lowerMinorRowCenterIndex + stride;
                  if (xAdjustedSquaredDistance > radius) {
                    arcMajorOffset--;
                    xAdjustedSquaredDistance = xAdjustedSquaredDistance - (arcMajorOffset + arcMajorOffset);
                    upperMajorRowCenterIndex = upperMajorRowCenterIndex + stride;
                    lowerMajorRowCenterIndex = lowerMajorRowCenterIndex - stride;
                  }
                  if (arcMajorOffset < arcMinorOffset) {
                    return;
                  }
                  framebuffer[upperMajorRowCenterIndex - arcMinorOffset] = color;
                  framebuffer[upperMajorRowCenterIndex + arcMinorOffset] = color;
                  framebuffer[upperMinorRowCenterIndex - arcMajorOffset] = color;
                  framebuffer[upperMinorRowCenterIndex + arcMajorOffset] = color;
                  framebuffer[lowerMinorRowCenterIndex - arcMajorOffset] = color;
                  framebuffer[lowerMinorRowCenterIndex + arcMajorOffset] = color;
                  framebuffer[lowerMajorRowCenterIndex - arcMinorOffset] = color;
                  framebuffer[lowerMajorRowCenterIndex + arcMinorOffset] = color;
                  continue;
                }
              }
              if ((centerX - arcMajorOffset >= clipLeft) &&
                  (centerY >= clipTop) &&
                  (centerY < clipBottom)) {
                framebuffer[upperMinorRowCenterIndex - arcMajorOffset] = color;
              }
              if ((centerX + arcMajorOffset < clipRight) &&
                  (centerY >= clipTop) &&
                  (centerY < clipBottom)) {
                framebuffer[upperMinorRowCenterIndex + arcMajorOffset] = color;
              }
              if (centerY - arcMajorOffset >= clipTop) {
                if (centerX >= clipLeft) {
                  if (centerX < clipRight) {
                    framebuffer[upperMajorRowCenterIndex] = color;
                    if ((centerY + arcMajorOffset < clipBottom) &&
                        (centerX >= clipLeft) &&
                        (centerX < clipRight)) {
                      framebuffer[lowerMajorRowCenterIndex] = color;
                    }
                  } else {
                    if ((centerY + arcMajorOffset < clipBottom) &&
                        (centerX >= clipLeft) &&
                        (centerX < clipRight)) {
                      framebuffer[lowerMajorRowCenterIndex] = color;
                    }
                  }
                } else {
                  if ((centerY + arcMajorOffset < clipBottom) &&
                      (centerX >= clipLeft) &&
                      (centerX < clipRight)) {
                    framebuffer[lowerMajorRowCenterIndex] = color;
                  }
                }
              } else {
                if ((centerY + arcMajorOffset < clipBottom) &&
                    (centerX >= clipLeft) &&
                    (centerX < clipRight)) {
                  framebuffer[lowerMajorRowCenterIndex] = color;
                }
              }
              while (true) {
                clippedMinorOffsetBeforeIncrement = arcMinorOffset;
                arcMinorOffset++;
                xAdjustedSquaredDistance = xAdjustedSquaredDistance + (clippedMinorOffsetBeforeIncrement + arcMinorOffset);
                upperMinorRowCenterIndex = upperMinorRowCenterIndex - stride;
                lowerMinorRowCenterIndex = lowerMinorRowCenterIndex + stride;
                if (xAdjustedSquaredDistance > radius) {
                  arcMajorOffset--;
                  xAdjustedSquaredDistance = xAdjustedSquaredDistance - (arcMajorOffset + arcMajorOffset);
                  upperMajorRowCenterIndex = upperMajorRowCenterIndex + stride;
                  lowerMajorRowCenterIndex = lowerMajorRowCenterIndex - stride;
                }
                if (arcMajorOffset < arcMinorOffset) {
                  return;
                }
                if ((centerY - arcMajorOffset >= clipTop) &&
                    (centerY - arcMajorOffset < clipBottom)) {
                  if ((centerX - arcMinorOffset >= clipLeft) &&
                      (centerX - arcMinorOffset < clipRight)) {
                    framebuffer[upperMajorRowCenterIndex - arcMinorOffset] = color;
                  }
                  if ((centerX + arcMinorOffset >= clipLeft) &&
                      (centerX + arcMinorOffset < clipRight)) {
                    framebuffer[upperMajorRowCenterIndex + arcMinorOffset] = color;
                  }
                }
                if ((centerY - arcMinorOffset >= clipTop) &&
                    (centerY - arcMinorOffset < clipBottom)) {
                  if ((centerX - arcMajorOffset >= clipLeft) &&
                      (centerX - arcMajorOffset < clipRight)) {
                    framebuffer[upperMinorRowCenterIndex - arcMajorOffset] = color;
                  }
                  if ((centerX + arcMajorOffset >= clipLeft) &&
                      (centerX + arcMajorOffset < clipRight)) {
                    framebuffer[upperMinorRowCenterIndex + arcMajorOffset] = color;
                  }
                }
                if ((centerY + arcMinorOffset >= clipTop) &&
                    (centerY + arcMinorOffset < clipBottom)) {
                  if ((centerX - arcMajorOffset >= clipLeft) &&
                      (centerX - arcMajorOffset < clipRight)) {
                    framebuffer[lowerMinorRowCenterIndex - arcMajorOffset] = color;
                  }
                  if ((centerX + arcMajorOffset >= clipLeft) &&
                      (centerX + arcMajorOffset < clipRight)) {
                    framebuffer[lowerMinorRowCenterIndex + arcMajorOffset] = color;
                  }
                }
                if (centerY + arcMajorOffset < clipTop) {
                  continue;
                }
                if (centerY + arcMajorOffset >= clipBottom) {
                  continue;
                }
                if ((centerX - arcMinorOffset >= clipLeft) &&
                    (centerX - arcMinorOffset < clipRight)) {
                  framebuffer[lowerMajorRowCenterIndex - arcMinorOffset] = color;
                }
                if (centerX + arcMinorOffset < clipLeft) {
                  continue;
                }
                if (centerX + arcMinorOffset >= clipRight) {
                  continue;
                }
                framebuffer[lowerMajorRowCenterIndex + arcMinorOffset] = color;
                continue;
              }
            }
            return;
          }
        }
    }

    final static void clearFramebuffer() {
        int firstUnrolledIndexBeforeIncrement = 0;
        int secondUnrolledIndexBeforeIncrement = 0;
        int thirdUnrolledIndexBeforeIncrement = 0;
        int fourthUnrolledIndexBeforeIncrement = 0;
        int fifthUnrolledIndexBeforeIncrement = 0;
        int sixthUnrolledIndexBeforeIncrement = 0;
        int seventhUnrolledIndexBeforeIncrement = 0;
        int eighthUnrolledIndexBeforeIncrement = 0;
        int tailIndexBeforeIncrement = 0;
        int destinationIndex = 0;
        int unrolledThresholdOrPixelCount = stride * framebufferHeight - 7;
        while (destinationIndex < unrolledThresholdOrPixelCount) {
            firstUnrolledIndexBeforeIncrement = destinationIndex;
            destinationIndex++;
            framebuffer[firstUnrolledIndexBeforeIncrement] = 0;
            secondUnrolledIndexBeforeIncrement = destinationIndex;
            destinationIndex++;
            framebuffer[secondUnrolledIndexBeforeIncrement] = 0;
            thirdUnrolledIndexBeforeIncrement = destinationIndex;
            destinationIndex++;
            framebuffer[thirdUnrolledIndexBeforeIncrement] = 0;
            fourthUnrolledIndexBeforeIncrement = destinationIndex;
            destinationIndex++;
            framebuffer[fourthUnrolledIndexBeforeIncrement] = 0;
            fifthUnrolledIndexBeforeIncrement = destinationIndex;
            destinationIndex++;
            framebuffer[fifthUnrolledIndexBeforeIncrement] = 0;
            sixthUnrolledIndexBeforeIncrement = destinationIndex;
            destinationIndex++;
            framebuffer[sixthUnrolledIndexBeforeIncrement] = 0;
            seventhUnrolledIndexBeforeIncrement = destinationIndex;
            destinationIndex++;
            framebuffer[seventhUnrolledIndexBeforeIncrement] = 0;
            eighthUnrolledIndexBeforeIncrement = destinationIndex;
            destinationIndex++;
            framebuffer[eighthUnrolledIndexBeforeIncrement] = 0;
        }
        unrolledThresholdOrPixelCount += 7;
        while (destinationIndex < unrolledThresholdOrPixelCount) {
            tailIndexBeforeIncrement = destinationIndex;
            destinationIndex++;
            framebuffer[tailIndexBeforeIncrement] = 0;
        }
    }

    final static void drawRectangle(int x, int y, int width, int height, int color) {
        SoftwareRasterizer.drawHorizontalLine(x, y, width, color);
        SoftwareRasterizer.drawHorizontalLine(x, y + height - 1, width, color);
        SoftwareRasterizer.drawVerticalLine(x, y, height, color);
        SoftwareRasterizer.drawVerticalLine(x + width - 1, y, height, color);
    }

    final static void fillRectangleAlpha(int x, int y, int width, int height, int color, int alpha256) {
        int rowIndex = 0;
        int negativeColumnCounter = 0;
        int destinationIndexBeforeIncrement = 0;
        int destinationWeight256;
        int destinationRowSkip;
        int destinationIndex;
        int destinationColorOrWeightedColor;
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
        destinationWeight256 = 256 - alpha256;
        destinationRowSkip = stride - width;
        destinationIndex = x + y * stride;
        for (rowIndex = 0; rowIndex < height; rowIndex++) {
          for (negativeColumnCounter = -width; negativeColumnCounter < 0; negativeColumnCounter++) {
            destinationColorOrWeightedColor = framebuffer[destinationIndex];
            destinationColorOrWeightedColor = ((destinationColorOrWeightedColor & 16711935) * destinationWeight256 >> 8 & 16711935) + ((destinationColorOrWeightedColor & 65280) * destinationWeight256 >> 8 & 65280);
            destinationIndexBeforeIncrement = destinationIndex;
            destinationIndex++;
            framebuffer[destinationIndexBeforeIncrement] = color + destinationColorOrWeightedColor;
          }
          destinationIndex = destinationIndex + destinationRowSkip;
        }
    }

    final static void fillRoundedRectangle(int x, int y, int width, int height, int cornerRadius, int color) {
        int upperDestinationIndexBeforeIncrement = 0;
        int upperYOffsetBeforeDecrement = 0;
        int upperXExtentBeforeIncrement = 0;
        int middleSpanX = 0;
        int middleDestinationIndexBeforeIncrement = 0;
        int lowerXExtentBeforeDecrement = 0;
        int lowerDestinationIndexBeforeIncrement = 0;
        int lowerYOffsetBeforeIncrement = 0;
        int leftCornerCenterX;
        int topCornerCenterYOrUpperHalfEnd;
        int clippedTop;
        int clippedBottomExclusive;
        int horizontalCenterGap;
        int rowY;
        int radiusSquared;
        int xExtent;
        int yOffset;
        int xAdjustedSquaredDistance;
        int yAdjustedSquaredDistance;
        int spanLeft;
        int spanRightExclusiveOrInclusive;
        int destinationIndex;
        int spanXOrMiddleRowSkip;
        int middleBottomExclusive;
        if (cornerRadius == 0) {
          SoftwareRasterizer.fillRectangle(x, y, width, height, color);
          return;
        }
        if (cornerRadius < 0) {
          cornerRadius = -cornerRadius;
        }
        leftCornerCenterX = x + cornerRadius;
        topCornerCenterYOrUpperHalfEnd = y + cornerRadius;
        clippedTop = y;
        if (clippedTop < clipTop) {
          clippedTop = clipTop;
        }
        clippedBottomExclusive = y + height;
        if (clippedBottomExclusive > clipBottom) {
          clippedBottomExclusive = clipBottom;
        }
        horizontalCenterGap = width - cornerRadius - cornerRadius - 1;
        rowY = clippedTop;
        radiusSquared = cornerRadius * cornerRadius;
        xExtent = 0;
        yOffset = topCornerCenterYOrUpperHalfEnd - rowY;
        xAdjustedSquaredDistance = yOffset * yOffset;
        yAdjustedSquaredDistance = xAdjustedSquaredDistance - yOffset;
        if (topCornerCenterYOrUpperHalfEnd > clippedBottomExclusive) {
          topCornerCenterYOrUpperHalfEnd = clippedBottomExclusive;
        }
        L4: while (true) {
          if (rowY < topCornerCenterYOrUpperHalfEnd) {
            while (true) {
              if ((yAdjustedSquaredDistance > radiusSquared) &&
                  (xAdjustedSquaredDistance > radiusSquared)) {
                spanLeft = leftCornerCenterX - xExtent + 1;
                if (spanLeft < clipLeft) {
                  spanLeft = clipLeft;
                }
                spanRightExclusiveOrInclusive = leftCornerCenterX + horizontalCenterGap + xExtent;
                if (spanRightExclusiveOrInclusive > clipRight) {
                  spanRightExclusiveOrInclusive = clipRight;
                }
                destinationIndex = spanLeft + rowY * stride;
                for (spanXOrMiddleRowSkip = spanLeft; spanXOrMiddleRowSkip < spanRightExclusiveOrInclusive; spanXOrMiddleRowSkip++) {
                  upperDestinationIndexBeforeIncrement = destinationIndex;
                  destinationIndex++;
                  framebuffer[upperDestinationIndexBeforeIncrement] = color;
                }
                rowY++;
                upperYOffsetBeforeDecrement = yOffset;
                yOffset--;
                xAdjustedSquaredDistance = xAdjustedSquaredDistance - (upperYOffsetBeforeDecrement + yOffset);
                yAdjustedSquaredDistance = yAdjustedSquaredDistance - (yOffset + yOffset);
                continue L4;
              }
              xAdjustedSquaredDistance = xAdjustedSquaredDistance + (xExtent + xExtent);
              upperXExtentBeforeIncrement = xExtent;
              xExtent++;
              yAdjustedSquaredDistance = yAdjustedSquaredDistance + (upperXExtentBeforeIncrement + xExtent);
              continue;
            }
          }
          yOffset = rowY - topCornerCenterYOrUpperHalfEnd;
          spanLeft = x;
          if (spanLeft < clipLeft) {
            spanLeft = clipLeft;
          }
          spanRightExclusiveOrInclusive = x + width;
          if (spanRightExclusiveOrInclusive > clipRight) {
            spanRightExclusiveOrInclusive = clipRight;
          }
          destinationIndex = spanLeft + rowY * stride;
          spanXOrMiddleRowSkip = stride + spanLeft - spanRightExclusiveOrInclusive;
          middleBottomExclusive = y + height - cornerRadius - 1;
          if (middleBottomExclusive > clipBottom) {
            middleBottomExclusive = clipBottom;
          }
          while (rowY < middleBottomExclusive) {
            for (middleSpanX = spanLeft; middleSpanX < spanRightExclusiveOrInclusive; middleSpanX++) {
              middleDestinationIndexBeforeIncrement = destinationIndex;
              destinationIndex++;
              framebuffer[middleDestinationIndexBeforeIncrement] = color;
            }
            rowY++;
            destinationIndex = destinationIndex + spanXOrMiddleRowSkip;
          }
          yOffset = 0;
          xExtent = cornerRadius;
          yAdjustedSquaredDistance = yOffset * yOffset + radiusSquared;
          xAdjustedSquaredDistance = yAdjustedSquaredDistance - xExtent;
          yAdjustedSquaredDistance = yAdjustedSquaredDistance - yOffset;
          while (rowY < clippedBottomExclusive) {
            while (yAdjustedSquaredDistance > radiusSquared) {
              if (xAdjustedSquaredDistance > radiusSquared) {
                lowerXExtentBeforeDecrement = xExtent;
                xExtent--;
                yAdjustedSquaredDistance = yAdjustedSquaredDistance - (lowerXExtentBeforeDecrement + xExtent);
                xAdjustedSquaredDistance = xAdjustedSquaredDistance - (xExtent + xExtent);
                continue;
              }
              break;
            }
            spanLeft = leftCornerCenterX - xExtent;
            if (spanLeft < clipLeft) {
              spanLeft = clipLeft;
            }
            spanRightExclusiveOrInclusive = leftCornerCenterX + horizontalCenterGap + xExtent;
            if (spanRightExclusiveOrInclusive > clipRight - 1) {
              spanRightExclusiveOrInclusive = clipRight - 1;
            }
            destinationIndex = spanLeft + rowY * stride;
            for (spanXOrMiddleRowSkip = spanLeft; spanXOrMiddleRowSkip <= spanRightExclusiveOrInclusive; spanXOrMiddleRowSkip++) {
              lowerDestinationIndexBeforeIncrement = destinationIndex;
              destinationIndex++;
              framebuffer[lowerDestinationIndexBeforeIncrement] = color;
            }
            rowY++;
            yAdjustedSquaredDistance = yAdjustedSquaredDistance + (yOffset + yOffset);
            lowerYOffsetBeforeIncrement = yOffset;
            yOffset++;
            xAdjustedSquaredDistance = xAdjustedSquaredDistance + (lowerYOffsetBeforeIncrement + yOffset);
          }
          return;
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
          if ((blurColumnRedSums != null) &&
              (blurColumnRedSums.length >= regionWidth)) {
            break L0;
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
        while (initialWindowRowOrNegativeOutputCounter <= initialWindowBottom) {
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
        while (initialWindowRowOrNegativeOutputCounter < columnIndexOrWindowEndCounter) {
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
        while (initialWindowRowOrNegativeOutputCounter < columnIndexOrWindowEndCounter) {
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
        while (initialWindowRowOrNegativeOutputCounter < 0) {
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
        int destinationIndex = 0;
        int pixelOffset = 0;
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
            destinationIndex = x + y * stride;
            pixelOffset = 0;
            while (pixelOffset < length) {
                framebuffer[destinationIndex] = color;
                pixelOffset++;
                destinationIndex = destinationIndex + stride;
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
