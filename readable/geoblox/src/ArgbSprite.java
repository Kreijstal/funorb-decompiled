/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ArgbSprite extends Sprite {
    final void drawGrayTinted(int x, int y, int tintColor) {
        int topClipPixels = 0;
        int leftClipPixels;
        int rightClipPixels;
        x = x + this.trimX;
        y = y + this.trimY;
        int destinationIndex = x + y * SoftwareRasterizer.stride;
        int sourceIndex = 0;
        int drawHeight = this.height;
        int drawWidth = this.width;
        int destinationRowSkip = SoftwareRasterizer.stride - drawWidth;
        int sourceRowSkip = 0;
        if (y < SoftwareRasterizer.clipTop) {
            topClipPixels = SoftwareRasterizer.clipTop - y;
            drawHeight = drawHeight - topClipPixels;
            y = SoftwareRasterizer.clipTop;
            sourceIndex = sourceIndex + topClipPixels * drawWidth;
            destinationIndex = destinationIndex + topClipPixels * SoftwareRasterizer.stride;
        }
        if (y + drawHeight > SoftwareRasterizer.clipBottom) {
            drawHeight = drawHeight - (y + drawHeight - SoftwareRasterizer.clipBottom);
        }
        if (x < SoftwareRasterizer.clipLeft) {
            leftClipPixels = SoftwareRasterizer.clipLeft - x;
            drawWidth = drawWidth - leftClipPixels;
            x = SoftwareRasterizer.clipLeft;
            sourceIndex = sourceIndex + leftClipPixels;
            destinationIndex = destinationIndex + leftClipPixels;
            sourceRowSkip = sourceRowSkip + leftClipPixels;
            destinationRowSkip = destinationRowSkip + leftClipPixels;
        }
        if (x + drawWidth > SoftwareRasterizer.clipRight) {
            rightClipPixels = x + drawWidth - SoftwareRasterizer.clipRight;
            drawWidth = drawWidth - rightClipPixels;
            sourceRowSkip = sourceRowSkip + rightClipPixels;
            destinationRowSkip = destinationRowSkip + rightClipPixels;
        }
        if (drawWidth > 0) {
            if (drawHeight <= 0) {
                return;
            }
            ArgbSprite.blitArgbGrayTinted(SoftwareRasterizer.framebuffer, this.pixels, 0, sourceIndex, destinationIndex, drawWidth, drawHeight, destinationRowSkip, sourceRowSkip, tintColor);
            return;
        }
    }

    private final static void blitArgbScaled(int[] destinationPixels, int[] sourcePixels, int sourcePixel, int sourceX16, int sourceY16, int destinationIndex, int destinationRowSkip, int drawWidth, int drawHeight, int stepX16, int stepY16, int sourceWidth) {
        int negativeRow = 0;
        int sourceRowOffset = 0;
        int negativeColumn = 0;
        int storedAlpha = 0;
        int destinationPixel = 0;
        int destinationWriteIndex = 0;
        int inverseAlpha256 = 0;
        int rowSourceX16 = sourceX16;
        for (negativeRow = -drawHeight; negativeRow < 0; negativeRow++) {
            sourceRowOffset = (sourceY16 >> 16) * sourceWidth;
            for (negativeColumn = -drawWidth; negativeColumn < 0; negativeColumn++) {
                sourcePixel = sourcePixels[(sourceX16 >> 16) + sourceRowOffset];
                storedAlpha = sourcePixel >>> 24;
                if (storedAlpha != 0) {
                    inverseAlpha256 = 256 - storedAlpha;
                    destinationPixel = destinationPixels[destinationIndex];
                    destinationWriteIndex = destinationIndex;
                    destinationIndex++;
                    destinationPixels[destinationWriteIndex] = ((sourcePixel & 16711935) * storedAlpha + (destinationPixel & 16711935) * inverseAlpha256 & -16711936) + ((sourcePixel & 65280) * storedAlpha + (destinationPixel & 65280) * inverseAlpha256 & 16711680) >>> 8;
                } else {
                    destinationIndex++;
                }
                sourceX16 = sourceX16 + stepX16;
            }
            sourceY16 = sourceY16 + stepY16;
            sourceX16 = rowSourceX16;
            destinationIndex = destinationIndex + destinationRowSkip;
        }
    }

    final void drawGrayModulated(int x, int y, int tintColor) {
        int topClipPixels = 0;
        int leftClipPixels;
        int rightClipPixels;
        x = x + this.trimX;
        y = y + this.trimY;
        int destinationIndex = x + y * SoftwareRasterizer.stride;
        int sourceIndex = 0;
        int drawHeight = this.height;
        int drawWidth = this.width;
        int destinationRowSkip = SoftwareRasterizer.stride - drawWidth;
        int sourceRowSkip = 0;
        if (y < SoftwareRasterizer.clipTop) {
            topClipPixels = SoftwareRasterizer.clipTop - y;
            drawHeight = drawHeight - topClipPixels;
            y = SoftwareRasterizer.clipTop;
            sourceIndex = sourceIndex + topClipPixels * drawWidth;
            destinationIndex = destinationIndex + topClipPixels * SoftwareRasterizer.stride;
        }
        if (y + drawHeight > SoftwareRasterizer.clipBottom) {
            drawHeight = drawHeight - (y + drawHeight - SoftwareRasterizer.clipBottom);
        }
        if (x < SoftwareRasterizer.clipLeft) {
            leftClipPixels = SoftwareRasterizer.clipLeft - x;
            drawWidth = drawWidth - leftClipPixels;
            x = SoftwareRasterizer.clipLeft;
            sourceIndex = sourceIndex + leftClipPixels;
            destinationIndex = destinationIndex + leftClipPixels;
            sourceRowSkip = sourceRowSkip + leftClipPixels;
            destinationRowSkip = destinationRowSkip + leftClipPixels;
        }
        if (x + drawWidth > SoftwareRasterizer.clipRight) {
            rightClipPixels = x + drawWidth - SoftwareRasterizer.clipRight;
            drawWidth = drawWidth - rightClipPixels;
            sourceRowSkip = sourceRowSkip + rightClipPixels;
            destinationRowSkip = destinationRowSkip + rightClipPixels;
        }
        if (drawWidth > 0) {
            if (drawHeight <= 0) {
                return;
            }
            ArgbSprite.blitArgbGrayModulated(SoftwareRasterizer.framebuffer, this.pixels, 0, sourceIndex, destinationIndex, 0, 0, drawWidth, drawHeight, destinationRowSkip, sourceRowSkip, tintColor);
            return;
        }
    }

    final void drawAlpha(int x, int y, int alpha256) {
        int topClipPixels = 0;
        int leftClipPixels;
        int rightClipPixels;
        x = x + this.trimX;
        y = y + this.trimY;
        int destinationIndex = x + y * SoftwareRasterizer.stride;
        int sourceIndex = 0;
        int drawHeight = this.height;
        int drawWidth = this.width;
        int destinationRowSkip = SoftwareRasterizer.stride - drawWidth;
        int sourceRowSkip = 0;
        if (y < SoftwareRasterizer.clipTop) {
            topClipPixels = SoftwareRasterizer.clipTop - y;
            drawHeight = drawHeight - topClipPixels;
            y = SoftwareRasterizer.clipTop;
            sourceIndex = sourceIndex + topClipPixels * drawWidth;
            destinationIndex = destinationIndex + topClipPixels * SoftwareRasterizer.stride;
        }
        if (y + drawHeight > SoftwareRasterizer.clipBottom) {
            drawHeight = drawHeight - (y + drawHeight - SoftwareRasterizer.clipBottom);
        }
        if (x < SoftwareRasterizer.clipLeft) {
            leftClipPixels = SoftwareRasterizer.clipLeft - x;
            drawWidth = drawWidth - leftClipPixels;
            x = SoftwareRasterizer.clipLeft;
            sourceIndex = sourceIndex + leftClipPixels;
            destinationIndex = destinationIndex + leftClipPixels;
            sourceRowSkip = sourceRowSkip + leftClipPixels;
            destinationRowSkip = destinationRowSkip + leftClipPixels;
        }
        if (x + drawWidth > SoftwareRasterizer.clipRight) {
            rightClipPixels = x + drawWidth - SoftwareRasterizer.clipRight;
            drawWidth = drawWidth - rightClipPixels;
            sourceRowSkip = sourceRowSkip + rightClipPixels;
            destinationRowSkip = destinationRowSkip + rightClipPixels;
        }
        if (drawWidth > 0) {
            if (drawHeight <= 0) {
                return;
            }
            ArgbSprite.blitArgbAlpha(SoftwareRasterizer.framebuffer, this.pixels, 0, sourceIndex, destinationIndex, drawWidth, drawHeight, destinationRowSkip, sourceRowSkip, alpha256);
            return;
        }
    }

    private final static void blitArgbGrayTinted(int[] destinationPixels, int[] sourcePixels, int sourcePixel, int sourceIndex, int destinationIndex, int widthThenNegativeTail, int drawHeight, int destinationRowSkip, int sourceRowSkip, int tintColor) {
        int destinationWriteIndex = 0;
        int tintRed;
        int tintGreen;
        int tintBlue;
        int negativeQuadCount;
        int negativeRowPixelCount;
        int negativeRow;
        int negativeColumn;
        int storedAlpha;
        int tintedPixel;
        int sourceRed;
        int sourceGreen;
        int sourceBlue;
        int inverseAlpha256;
        int destinationPixel;
        tintRed = tintColor >> 16 & 255;
        tintGreen = tintColor >> 8 & 255;
        tintBlue = tintColor & 255;
        negativeQuadCount = -(widthThenNegativeTail >> 2);
        widthThenNegativeTail = -(widthThenNegativeTail & 3);
        negativeRowPixelCount = negativeQuadCount + negativeQuadCount + negativeQuadCount + negativeQuadCount + widthThenNegativeTail;
        negativeRow = -drawHeight;
        while (true) {
          if (negativeRow >= 0) {
            return;
          }
          negativeColumn = negativeRowPixelCount;
          while (true) {
            if (negativeColumn >= 0) {
              destinationIndex = destinationIndex + destinationRowSkip;
              sourceIndex = sourceIndex + sourceRowSkip;
              negativeRow++;
              break;
            }
            sourcePixel = sourcePixels[sourceIndex++];
            storedAlpha = sourcePixel >>> 24;
            if (storedAlpha == 0) {
              destinationIndex++;
              negativeColumn++;
              continue;
            }
            sourceRed = sourcePixel >> 16 & 255;
            sourceGreen = sourcePixel >> 8 & 255;
            sourceBlue = sourcePixel & 255;
            if (sourceRed == sourceGreen &&
                sourceGreen == sourceBlue) {
              if (sourceRed > 128) {
                tintedPixel = (tintRed * (256 - sourceRed) + 255 * (sourceRed - 128) >> 7 << 16) + (tintGreen * (256 - sourceGreen) + 255 * (sourceGreen - 128) >> 7 << 8) + (tintBlue * (256 - sourceBlue) + 255 * (sourceBlue - 128) >> 7);
              } else {
                tintedPixel = (sourceRed * tintRed >> 7 << 16) + (sourceGreen * tintGreen >> 7 << 8) + (sourceBlue * tintBlue >> 7);
              }
            } else {
              tintedPixel = sourcePixel;
            }
            inverseAlpha256 = 256 - storedAlpha;
            destinationPixel = destinationPixels[destinationIndex];
            destinationWriteIndex = destinationIndex;
            destinationIndex++;
            destinationPixels[destinationWriteIndex] = ((tintedPixel & 16711935) * storedAlpha + (destinationPixel & 16711935) * inverseAlpha256 & -16711936) + ((tintedPixel & 65280) * storedAlpha + (destinationPixel & 65280) * inverseAlpha256 & 16711680) >>> 8;
            negativeColumn++;
          }
        }
    }

    private final static void blitArgb(int[] destinationPixels, int[] sourcePixels, int sourcePixel, int sourceIndex, int destinationIndex, int drawWidth, int drawHeight, int destinationRowSkip, int sourceRowSkip) {
        int destinationWriteIndex = 0;
        int negativeRowPixelCount;
        int negativeRow;
        int negativeColumn;
        int storedAlpha;
        int inverseAlpha256;
        int destinationPixel;
        negativeRowPixelCount = -drawWidth;
        negativeRow = -drawHeight;
        while (true) {
          if (negativeRow >= 0) {
            return;
          }
          negativeColumn = negativeRowPixelCount;
          while (true) {
            if (negativeColumn >= 0) {
              destinationIndex = destinationIndex + destinationRowSkip;
              sourceIndex = sourceIndex + sourceRowSkip;
              negativeRow++;
              break;
            }
            sourcePixel = sourcePixels[sourceIndex++];
            storedAlpha = sourcePixel >>> 24;
            if (storedAlpha == 0) {
              destinationIndex++;
              negativeColumn++;
              continue;
            }
            inverseAlpha256 = 256 - storedAlpha;
            destinationPixel = destinationPixels[destinationIndex];
            destinationWriteIndex = destinationIndex;
            destinationIndex++;
            destinationPixels[destinationWriteIndex] = ((sourcePixel & 16711935) * storedAlpha + (destinationPixel & 16711935) * inverseAlpha256 & -16711936) + ((sourcePixel & 65280) * storedAlpha + (destinationPixel & 65280) * inverseAlpha256 & 16711680) >>> 8;
            negativeColumn++;
          }
        }
    }

    private final static void blitArgbScaledAlpha(int[] destinationPixels, int[] sourcePixels, int unusedPixelScratch, int sourceX16, int sourceY16, int destinationIndex, int destinationRowSkip, int drawWidth, int drawHeight, int stepX16, int stepY16, int sourceWidth, int alpha256) {
        int negativeRow = 0;
        int sourceRowOffset = 0;
        int negativeColumn = 0;
        int sourcePixel = 0;
        int destinationPixel = 0;
        int effectiveAlpha256 = 0;
        int inverseAlpha256 = 0;
        int destinationWriteIndex = 0;
        int rowSourceX16 = sourceX16;
        for (negativeRow = -drawHeight; negativeRow < 0; negativeRow++) {
            sourceRowOffset = (sourceY16 >> 16) * sourceWidth;
            for (negativeColumn = -drawWidth; negativeColumn < 0; negativeColumn++) {
                sourcePixel = sourcePixels[(sourceX16 >> 16) + sourceRowOffset];
                destinationPixel = destinationPixels[destinationIndex];
                effectiveAlpha256 = (sourcePixel >>> 24) * alpha256 >> 8;
                inverseAlpha256 = 256 - effectiveAlpha256;
                destinationWriteIndex = destinationIndex;
                destinationIndex++;
                destinationPixels[destinationWriteIndex] = ((sourcePixel & 16711935) * effectiveAlpha256 + (destinationPixel & 16711935) * inverseAlpha256 & -16711936) + ((sourcePixel & 65280) * effectiveAlpha256 + (destinationPixel & 65280) * inverseAlpha256 & 16711680) >>> 8;
                sourceX16 = sourceX16 + stepX16;
            }
            sourceY16 = sourceY16 + stepY16;
            sourceX16 = rowSourceX16;
            destinationIndex = destinationIndex + destinationRowSkip;
        }
    }

    final void rotateNearest(int sourcePivotX, int sourcePivotY, int destinationX, int destinationY, int angle, int scale) {
        int writeIndexFixedXFixedY = 0;
        int writeIndexFixedXForwardY = 0;
        int writeIndexFixedXReverseY = 0;
        int writeIndexForwardXFixedY = 0;
        int writeIndexForwardXForwardY = 0;
        int writeIndexForwardXReverseY = 0;
        int writeIndexReverseXFixedY = 0;
        int writeIndexReverseXForwardY = 0;
        int writeIndexReverseXReverseY = 0;
        double angleRadians;
        int scaledSin;
        int scaledCos;
        int corner0X;
        int corner0Y;
        int corner1X;
        int corner1Y;
        int corner2X;
        int corner2Y;
        int corner3X;
        int corner3Y;
        int leftBound;
        int rightThenNegativeWidth;
        int topBound;
        int bottomThenNegativeHeight;
        int rowDestinationIndex;
        double inverseScaleFactor;
        int inverseSinStep;
        int inverseCosStep;
        int destinationOffsetX;
        int destinationOffsetY;
        int rowSourceXQ12;
        int rowSourceYQ12;
        int fixedXForwardYTopSkipPixels;
        int fixedXFixedYNegativeRowCounter;
        int fixedXFixedYDestinationIndex;
        int fixedXFixedYSourceXQ12;
        int fixedXFixedYSourceYQ12;
        int fixedXFixedYNegativePixelCounter;
        int fixedXFixedYSampledPixel;
        int fixedXFixedYDestinationPixel;
        int fixedXFixedYStoredAlpha;
        int fixedXFixedYInverseAlpha256;
        int forwardXFixedYLeftSkipPixels;
        int reverseXFixedYRightExcessThenSkipPixels;
        int reverseXForwardYRightExcessThenSkipPixels;
        int reverseXReverseYRightExcessThenSkipPixels;
        int forwardXFixedYNegativeRowCounter;
        int reverseXFixedYNegativeRowCounter;
        int reverseXForwardYNegativeRowCounter;
        int reverseXReverseYNegativeRowCounter;
        int forwardXFixedYDestinationIndex;
        int reverseXFixedYDestinationIndex;
        int reverseXForwardYDestinationIndex;
        int reverseXReverseYDestinationIndex;
        int forwardXFixedYSourceXQ12;
        int reverseXFixedYSourceXQ12;
        int reverseXForwardYSourceXQ12;
        int reverseXReverseYSourceXQ12;
        int forwardXFixedYSourceYQ12;
        int reverseXFixedYSourceYQ12;
        int reverseXForwardYSourceYQ12;
        int reverseXReverseYSourceYQ12;
        int forwardXFixedYNegativePixelCounter;
        int reverseXFixedYNegativePixelCounter;
        int reverseXForwardYNegativePixelCounter;
        int reverseXReverseYNegativePixelCounter;
        int forwardXFixedYSampledPixel;
        int reverseXFixedYSampledPixel;
        int reverseXForwardYSampledPixel;
        int reverseXReverseYSampledPixel;
        int forwardXFixedYDestinationPixel;
        int reverseXFixedYDestinationPixel;
        int reverseXForwardYDestinationPixel;
        int reverseXReverseYDestinationPixel;
        int forwardXFixedYStoredAlpha;
        int reverseXFixedYStoredAlpha;
        int reverseXForwardYStoredAlpha;
        int reverseXReverseYStoredAlpha;
        int forwardXFixedYInverseAlpha256;
        int reverseXFixedYInverseAlpha256;
        int reverseXForwardYInverseAlpha256;
        int reverseXReverseYInverseAlpha256;
        int fixedXReverseYBottomExcessThenSkipPixels;
        int fixedXForwardYNegativeRowCounter;
        int fixedXReverseYNegativeRowCounter;
        int fixedXForwardYDestinationIndex;
        int fixedXReverseYDestinationIndex;
        int fixedXForwardYSourceXQ12;
        int fixedXReverseYSourceXQ12;
        int fixedXForwardYSourceYQ12;
        int fixedXReverseYSourceYQ12;
        int fixedXForwardYNegativePixelCounter;
        int fixedXReverseYNegativePixelCounter;
        int fixedXForwardYSampledPixel;
        int fixedXReverseYSampledPixel;
        int fixedXForwardYDestinationPixel;
        int fixedXReverseYDestinationPixel;
        int fixedXForwardYStoredAlpha;
        int fixedXReverseYStoredAlpha;
        int fixedXForwardYInverseAlpha256;
        int fixedXReverseYInverseAlpha256;
        int forwardXForwardYLeftSkipPixels;
        int forwardXReverseYLeftSkipPixels;
        int reverseXFixedYLeftStopCounter;
        int reverseXForwardYLeftStopCounter;
        int reverseXForwardYTopSkipPixels;
        int reverseXForwardYBottomStopCounter;
        int reverseXReverseYLeftStopCounter;
        int reverseXReverseYBottomExcessThenSkipPixels;
        int reverseXReverseYTopStopCounter;
        int forwardXForwardYNegativeRowCounter;
        int forwardXReverseYNegativeRowCounter;
        int forwardXForwardYDestinationIndex;
        int forwardXReverseYDestinationIndex;
        int forwardXForwardYSourceXQ12;
        int forwardXReverseYSourceXQ12;
        int forwardXForwardYSourceYQ12;
        int forwardXReverseYSourceYQ12;
        int forwardXForwardYNegativePixelCounter;
        int forwardXReverseYNegativePixelCounter;
        int forwardXForwardYSampledPixel;
        int forwardXReverseYSampledPixel;
        int forwardXForwardYDestinationPixel;
        int forwardXReverseYDestinationPixel;
        int forwardXForwardYStoredAlpha;
        int forwardXReverseYStoredAlpha;
        int forwardXForwardYInverseAlpha256;
        int forwardXReverseYInverseAlpha256;
        int fixedXForwardYBottomStopCounter;
        int forwardXFixedYRightStopCounter;
        int fixedXReverseYTopStopCounter;
        int forwardXForwardYRightStopCounter;
        int forwardXForwardYTopSkipPixels;
        int forwardXForwardYBottomStopCounter;
        int forwardXReverseYRightStopCounter;
        int forwardXReverseYBottomExcessThenSkipPixels;
        int forwardXReverseYTopStopCounter;
        if (scale == 0) {
          return;
        }
        sourcePivotX = sourcePivotX - (this.trimX << 4);
        sourcePivotY = sourcePivotY - (this.trimY << 4);
        angleRadians = (double)(angle & 65535) * 0.00009587379924285257;
        scaledSin = (int)Math.floor(Math.sin(angleRadians) * (double)scale + 0.5);
        scaledCos = (int)Math.floor(Math.cos(angleRadians) * (double)scale + 0.5);
        corner0X = -sourcePivotX * scaledCos + -sourcePivotY * scaledSin;
        corner0Y = -(-sourcePivotX) * scaledSin + -sourcePivotY * scaledCos;
        corner1X = ((this.width << 4) - sourcePivotX) * scaledCos + -sourcePivotY * scaledSin;
        corner1Y = -((this.width << 4) - sourcePivotX) * scaledSin + -sourcePivotY * scaledCos;
        corner2X = -sourcePivotX * scaledCos + ((this.height << 4) - sourcePivotY) * scaledSin;
        corner2Y = -(-sourcePivotX) * scaledSin + ((this.height << 4) - sourcePivotY) * scaledCos;
        corner3X = ((this.width << 4) - sourcePivotX) * scaledCos + ((this.height << 4) - sourcePivotY) * scaledSin;
        corner3Y = -((this.width << 4) - sourcePivotX) * scaledSin + ((this.height << 4) - sourcePivotY) * scaledCos;
        if (corner0X >= corner1X) {
          leftBound = corner1X;
          rightThenNegativeWidth = corner0X;
        } else {
          leftBound = corner0X;
          rightThenNegativeWidth = corner1X;
        }
        if (corner2X < leftBound) {
          leftBound = corner2X;
        }
        if (corner3X < leftBound) {
          leftBound = corner3X;
        }
        if (corner2X > rightThenNegativeWidth) {
          rightThenNegativeWidth = corner2X;
        }
        if (corner3X > rightThenNegativeWidth) {
          rightThenNegativeWidth = corner3X;
        }
        if (corner0Y >= corner1Y) {
          topBound = corner1Y;
          bottomThenNegativeHeight = corner0Y;
        } else {
          topBound = corner0Y;
          bottomThenNegativeHeight = corner1Y;
        }
        if (corner2Y < topBound) {
          topBound = corner2Y;
        }
        if (corner3Y < topBound) {
          topBound = corner3Y;
        }
        if (corner2Y > bottomThenNegativeHeight) {
          bottomThenNegativeHeight = corner2Y;
        }
        if (corner3Y > bottomThenNegativeHeight) {
          bottomThenNegativeHeight = corner3Y;
        }
        leftBound = leftBound >> 12;
        rightThenNegativeWidth = rightThenNegativeWidth + 4095 >> 12;
        topBound = topBound >> 12;
        bottomThenNegativeHeight = bottomThenNegativeHeight + 4095 >> 12;
        leftBound = leftBound + destinationX;
        rightThenNegativeWidth = rightThenNegativeWidth + destinationX;
        topBound = topBound + destinationY;
        bottomThenNegativeHeight = bottomThenNegativeHeight + destinationY;
        leftBound = leftBound >> 4;
        rightThenNegativeWidth = rightThenNegativeWidth + 15 >> 4;
        topBound = topBound >> 4;
        bottomThenNegativeHeight = bottomThenNegativeHeight + 15 >> 4;
        if (leftBound < SoftwareRasterizer.clipLeft) {
          leftBound = SoftwareRasterizer.clipLeft;
        }
        if (rightThenNegativeWidth > SoftwareRasterizer.clipRight) {
          rightThenNegativeWidth = SoftwareRasterizer.clipRight;
        }
        if (topBound < SoftwareRasterizer.clipTop) {
          topBound = SoftwareRasterizer.clipTop;
        }
        if (bottomThenNegativeHeight > SoftwareRasterizer.clipBottom) {
          bottomThenNegativeHeight = SoftwareRasterizer.clipBottom;
        }
        rightThenNegativeWidth = leftBound - rightThenNegativeWidth;
        if (rightThenNegativeWidth >= 0) {
          return;
        }
        bottomThenNegativeHeight = topBound - bottomThenNegativeHeight;
        if (bottomThenNegativeHeight >= 0) {
          return;
        }
        rowDestinationIndex = topBound * SoftwareRasterizer.stride + leftBound;
        inverseScaleFactor = 16777216.0 / (double)scale;
        inverseSinStep = (int)Math.floor(Math.sin(angleRadians) * inverseScaleFactor + 0.5);
        inverseCosStep = (int)Math.floor(Math.cos(angleRadians) * inverseScaleFactor + 0.5);
        destinationOffsetX = (leftBound << 4) + 8 - destinationX;
        destinationOffsetY = (topBound << 4) + 8 - destinationY;
        rowSourceXQ12 = (sourcePivotX << 8) - (destinationOffsetY * inverseSinStep >> 4);
        rowSourceYQ12 = (sourcePivotY << 8) + (destinationOffsetY * inverseCosStep >> 4);
        if (inverseCosStep == 0) {
          if (inverseSinStep == 0) {
            fixedXFixedYNegativeRowCounter = bottomThenNegativeHeight;
            while (fixedXFixedYNegativeRowCounter < 0) {
              fixedXFixedYDestinationIndex = rowDestinationIndex;
              fixedXFixedYSourceXQ12 = rowSourceXQ12;
              fixedXFixedYSourceYQ12 = rowSourceYQ12;
              fixedXFixedYNegativePixelCounter = rightThenNegativeWidth;
              if (fixedXFixedYSourceXQ12 >= 0 &&
                  fixedXFixedYSourceYQ12 >= 0 &&
                  fixedXFixedYSourceXQ12 - (this.width << 12) < 0 &&
                  fixedXFixedYSourceYQ12 - (this.height << 12) < 0) {
                while (fixedXFixedYNegativePixelCounter < 0) {
                  fixedXFixedYSampledPixel = this.pixels[(fixedXFixedYSourceYQ12 >> 12) * this.width + (fixedXFixedYSourceXQ12 >> 12)];
                  fixedXFixedYDestinationPixel = SoftwareRasterizer.framebuffer[fixedXFixedYDestinationIndex];
                  fixedXFixedYStoredAlpha = fixedXFixedYSampledPixel >>> 24;
                  fixedXFixedYInverseAlpha256 = 256 - fixedXFixedYStoredAlpha;
                  writeIndexFixedXFixedY = fixedXFixedYDestinationIndex;
                  fixedXFixedYDestinationIndex++;
                  SoftwareRasterizer.framebuffer[writeIndexFixedXFixedY] = ((fixedXFixedYSampledPixel & 16711935) * fixedXFixedYStoredAlpha + (fixedXFixedYDestinationPixel & 16711935) * fixedXFixedYInverseAlpha256 & -16711936) + ((fixedXFixedYSampledPixel & 65280) * fixedXFixedYStoredAlpha + (fixedXFixedYDestinationPixel & 65280) * fixedXFixedYInverseAlpha256 & 16711680) >>> 8;
                  fixedXFixedYNegativePixelCounter++;
                }
              }
              fixedXFixedYNegativeRowCounter++;
              rowDestinationIndex = rowDestinationIndex + SoftwareRasterizer.stride;
            }
            return;
          }
          if (inverseSinStep >= 0) {
            fixedXForwardYNegativeRowCounter = bottomThenNegativeHeight;
            while (fixedXForwardYNegativeRowCounter < 0) {
              fixedXForwardYDestinationIndex = rowDestinationIndex;
              fixedXForwardYSourceXQ12 = rowSourceXQ12;
              fixedXForwardYSourceYQ12 = rowSourceYQ12 + (destinationOffsetX * inverseSinStep >> 4);
              fixedXForwardYNegativePixelCounter = rightThenNegativeWidth;
              if (fixedXForwardYSourceXQ12 >= 0 &&
                  fixedXForwardYSourceXQ12 - (this.width << 12) < 0) {
                if (fixedXForwardYSourceYQ12 < 0) {
                  fixedXForwardYTopSkipPixels = (inverseSinStep - 1 - fixedXForwardYSourceYQ12) / inverseSinStep;
                  fixedXForwardYNegativePixelCounter = fixedXForwardYNegativePixelCounter + fixedXForwardYTopSkipPixels;
                  fixedXForwardYSourceYQ12 = fixedXForwardYSourceYQ12 + inverseSinStep * fixedXForwardYTopSkipPixels;
                  fixedXForwardYDestinationIndex = fixedXForwardYDestinationIndex + fixedXForwardYTopSkipPixels;
                }
                fixedXForwardYBottomStopCounter = (1 + fixedXForwardYSourceYQ12 - (this.height << 12) - inverseSinStep) / inverseSinStep;
                if ((1 + fixedXForwardYSourceYQ12 - (this.height << 12) - inverseSinStep) / inverseSinStep > fixedXForwardYNegativePixelCounter) {
                  fixedXForwardYNegativePixelCounter = fixedXForwardYBottomStopCounter;
                }
                while (fixedXForwardYNegativePixelCounter < 0) {
                  fixedXForwardYSampledPixel = this.pixels[(fixedXForwardYSourceYQ12 >> 12) * this.width + (fixedXForwardYSourceXQ12 >> 12)];
                  fixedXForwardYDestinationPixel = SoftwareRasterizer.framebuffer[fixedXForwardYDestinationIndex];
                  fixedXForwardYStoredAlpha = fixedXForwardYSampledPixel >>> 24;
                  fixedXForwardYInverseAlpha256 = 256 - fixedXForwardYStoredAlpha;
                  writeIndexFixedXForwardY = fixedXForwardYDestinationIndex;
                  fixedXForwardYDestinationIndex++;
                  SoftwareRasterizer.framebuffer[writeIndexFixedXForwardY] = ((fixedXForwardYSampledPixel & 16711935) * fixedXForwardYStoredAlpha + (fixedXForwardYDestinationPixel & 16711935) * fixedXForwardYInverseAlpha256 & -16711936) + ((fixedXForwardYSampledPixel & 65280) * fixedXForwardYStoredAlpha + (fixedXForwardYDestinationPixel & 65280) * fixedXForwardYInverseAlpha256 & 16711680) >>> 8;
                  fixedXForwardYSourceYQ12 = fixedXForwardYSourceYQ12 + inverseSinStep;
                  fixedXForwardYNegativePixelCounter++;
                }
              }
              fixedXForwardYNegativeRowCounter++;
              rowSourceXQ12 = rowSourceXQ12 - inverseSinStep;
              rowDestinationIndex = rowDestinationIndex + SoftwareRasterizer.stride;
            }
            return;
          }
          fixedXReverseYNegativeRowCounter = bottomThenNegativeHeight;
          while (fixedXReverseYNegativeRowCounter < 0) {
            fixedXReverseYDestinationIndex = rowDestinationIndex;
            fixedXReverseYSourceXQ12 = rowSourceXQ12;
            fixedXReverseYSourceYQ12 = rowSourceYQ12 + (destinationOffsetX * inverseSinStep >> 4);
            fixedXReverseYNegativePixelCounter = rightThenNegativeWidth;
            if (fixedXReverseYSourceXQ12 >= 0 &&
                fixedXReverseYSourceXQ12 - (this.width << 12) < 0) {
              fixedXReverseYBottomExcessThenSkipPixels = fixedXReverseYSourceYQ12 - (this.height << 12);
              if (fixedXReverseYSourceYQ12 - (this.height << 12) >= 0) {
                fixedXReverseYBottomExcessThenSkipPixels = (inverseSinStep - fixedXReverseYBottomExcessThenSkipPixels) / inverseSinStep;
                fixedXReverseYNegativePixelCounter = fixedXReverseYNegativePixelCounter + fixedXReverseYBottomExcessThenSkipPixels;
                fixedXReverseYSourceYQ12 = fixedXReverseYSourceYQ12 + inverseSinStep * fixedXReverseYBottomExcessThenSkipPixels;
                fixedXReverseYDestinationIndex = fixedXReverseYDestinationIndex + fixedXReverseYBottomExcessThenSkipPixels;
              }
              fixedXReverseYTopStopCounter = (fixedXReverseYSourceYQ12 - inverseSinStep) / inverseSinStep;
              if ((fixedXReverseYSourceYQ12 - inverseSinStep) / inverseSinStep > fixedXReverseYNegativePixelCounter) {
                fixedXReverseYNegativePixelCounter = fixedXReverseYTopStopCounter;
              }
              while (fixedXReverseYNegativePixelCounter < 0) {
                fixedXReverseYSampledPixel = this.pixels[(fixedXReverseYSourceYQ12 >> 12) * this.width + (fixedXReverseYSourceXQ12 >> 12)];
                fixedXReverseYDestinationPixel = SoftwareRasterizer.framebuffer[fixedXReverseYDestinationIndex];
                fixedXReverseYStoredAlpha = fixedXReverseYSampledPixel >>> 24;
                fixedXReverseYInverseAlpha256 = 256 - fixedXReverseYStoredAlpha;
                writeIndexFixedXReverseY = fixedXReverseYDestinationIndex;
                fixedXReverseYDestinationIndex++;
                SoftwareRasterizer.framebuffer[writeIndexFixedXReverseY] = ((fixedXReverseYSampledPixel & 16711935) * fixedXReverseYStoredAlpha + (fixedXReverseYDestinationPixel & 16711935) * fixedXReverseYInverseAlpha256 & -16711936) + ((fixedXReverseYSampledPixel & 65280) * fixedXReverseYStoredAlpha + (fixedXReverseYDestinationPixel & 65280) * fixedXReverseYInverseAlpha256 & 16711680) >>> 8;
                fixedXReverseYSourceYQ12 = fixedXReverseYSourceYQ12 + inverseSinStep;
                fixedXReverseYNegativePixelCounter++;
              }
            }
            fixedXReverseYNegativeRowCounter++;
            rowSourceXQ12 = rowSourceXQ12 - inverseSinStep;
            rowDestinationIndex = rowDestinationIndex + SoftwareRasterizer.stride;
          }
          return;
        }
        if (inverseCosStep >= 0) {
          if (inverseSinStep == 0) {
            forwardXFixedYNegativeRowCounter = bottomThenNegativeHeight;
            while (forwardXFixedYNegativeRowCounter < 0) {
              forwardXFixedYDestinationIndex = rowDestinationIndex;
              forwardXFixedYSourceXQ12 = rowSourceXQ12 + (destinationOffsetX * inverseCosStep >> 4);
              forwardXFixedYSourceYQ12 = rowSourceYQ12;
              forwardXFixedYNegativePixelCounter = rightThenNegativeWidth;
              if (forwardXFixedYSourceYQ12 >= 0 &&
                  forwardXFixedYSourceYQ12 - (this.height << 12) < 0) {
                if (forwardXFixedYSourceXQ12 < 0) {
                  forwardXFixedYLeftSkipPixels = (inverseCosStep - 1 - forwardXFixedYSourceXQ12) / inverseCosStep;
                  forwardXFixedYNegativePixelCounter = forwardXFixedYNegativePixelCounter + forwardXFixedYLeftSkipPixels;
                  forwardXFixedYSourceXQ12 = forwardXFixedYSourceXQ12 + inverseCosStep * forwardXFixedYLeftSkipPixels;
                  forwardXFixedYDestinationIndex = forwardXFixedYDestinationIndex + forwardXFixedYLeftSkipPixels;
                }
                forwardXFixedYRightStopCounter = (1 + forwardXFixedYSourceXQ12 - (this.width << 12) - inverseCosStep) / inverseCosStep;
                if ((1 + forwardXFixedYSourceXQ12 - (this.width << 12) - inverseCosStep) / inverseCosStep > forwardXFixedYNegativePixelCounter) {
                  forwardXFixedYNegativePixelCounter = forwardXFixedYRightStopCounter;
                }
                while (forwardXFixedYNegativePixelCounter < 0) {
                  forwardXFixedYSampledPixel = this.pixels[(forwardXFixedYSourceYQ12 >> 12) * this.width + (forwardXFixedYSourceXQ12 >> 12)];
                  forwardXFixedYDestinationPixel = SoftwareRasterizer.framebuffer[forwardXFixedYDestinationIndex];
                  forwardXFixedYStoredAlpha = forwardXFixedYSampledPixel >>> 24;
                  forwardXFixedYInverseAlpha256 = 256 - forwardXFixedYStoredAlpha;
                  writeIndexForwardXFixedY = forwardXFixedYDestinationIndex;
                  forwardXFixedYDestinationIndex++;
                  SoftwareRasterizer.framebuffer[writeIndexForwardXFixedY] = ((forwardXFixedYSampledPixel & 16711935) * forwardXFixedYStoredAlpha + (forwardXFixedYDestinationPixel & 16711935) * forwardXFixedYInverseAlpha256 & -16711936) + ((forwardXFixedYSampledPixel & 65280) * forwardXFixedYStoredAlpha + (forwardXFixedYDestinationPixel & 65280) * forwardXFixedYInverseAlpha256 & 16711680) >>> 8;
                  forwardXFixedYSourceXQ12 = forwardXFixedYSourceXQ12 + inverseCosStep;
                  forwardXFixedYNegativePixelCounter++;
                }
              }
              forwardXFixedYNegativeRowCounter++;
              rowSourceYQ12 = rowSourceYQ12 + inverseCosStep;
              rowDestinationIndex = rowDestinationIndex + SoftwareRasterizer.stride;
            }
            return;
          }
          if (inverseSinStep >= 0) {
            forwardXForwardYNegativeRowCounter = bottomThenNegativeHeight;
            while (forwardXForwardYNegativeRowCounter < 0) {
              forwardXForwardYDestinationIndex = rowDestinationIndex;
              forwardXForwardYSourceXQ12 = rowSourceXQ12 + (destinationOffsetX * inverseCosStep >> 4);
              forwardXForwardYSourceYQ12 = rowSourceYQ12 + (destinationOffsetX * inverseSinStep >> 4);
              forwardXForwardYNegativePixelCounter = rightThenNegativeWidth;
              if (forwardXForwardYSourceXQ12 < 0) {
                forwardXForwardYLeftSkipPixels = (inverseCosStep - 1 - forwardXForwardYSourceXQ12) / inverseCosStep;
                forwardXForwardYNegativePixelCounter = forwardXForwardYNegativePixelCounter + forwardXForwardYLeftSkipPixels;
                forwardXForwardYSourceXQ12 = forwardXForwardYSourceXQ12 + inverseCosStep * forwardXForwardYLeftSkipPixels;
                forwardXForwardYSourceYQ12 = forwardXForwardYSourceYQ12 + inverseSinStep * forwardXForwardYLeftSkipPixels;
                forwardXForwardYDestinationIndex = forwardXForwardYDestinationIndex + forwardXForwardYLeftSkipPixels;
              }
              forwardXForwardYRightStopCounter = (1 + forwardXForwardYSourceXQ12 - (this.width << 12) - inverseCosStep) / inverseCosStep;
              if ((1 + forwardXForwardYSourceXQ12 - (this.width << 12) - inverseCosStep) / inverseCosStep > forwardXForwardYNegativePixelCounter) {
                forwardXForwardYNegativePixelCounter = forwardXForwardYRightStopCounter;
              }
              if (forwardXForwardYSourceYQ12 < 0) {
                forwardXForwardYTopSkipPixels = (inverseSinStep - 1 - forwardXForwardYSourceYQ12) / inverseSinStep;
                forwardXForwardYNegativePixelCounter = forwardXForwardYNegativePixelCounter + forwardXForwardYTopSkipPixels;
                forwardXForwardYSourceXQ12 = forwardXForwardYSourceXQ12 + inverseCosStep * forwardXForwardYTopSkipPixels;
                forwardXForwardYSourceYQ12 = forwardXForwardYSourceYQ12 + inverseSinStep * forwardXForwardYTopSkipPixels;
                forwardXForwardYDestinationIndex = forwardXForwardYDestinationIndex + forwardXForwardYTopSkipPixels;
              }
              forwardXForwardYBottomStopCounter = (1 + forwardXForwardYSourceYQ12 - (this.height << 12) - inverseSinStep) / inverseSinStep;
              if ((1 + forwardXForwardYSourceYQ12 - (this.height << 12) - inverseSinStep) / inverseSinStep > forwardXForwardYNegativePixelCounter) {
                forwardXForwardYNegativePixelCounter = forwardXForwardYBottomStopCounter;
              }
              while (forwardXForwardYNegativePixelCounter < 0) {
                forwardXForwardYSampledPixel = this.pixels[(forwardXForwardYSourceYQ12 >> 12) * this.width + (forwardXForwardYSourceXQ12 >> 12)];
                forwardXForwardYDestinationPixel = SoftwareRasterizer.framebuffer[forwardXForwardYDestinationIndex];
                forwardXForwardYStoredAlpha = forwardXForwardYSampledPixel >>> 24;
                forwardXForwardYInverseAlpha256 = 256 - forwardXForwardYStoredAlpha;
                writeIndexForwardXForwardY = forwardXForwardYDestinationIndex;
                forwardXForwardYDestinationIndex++;
                SoftwareRasterizer.framebuffer[writeIndexForwardXForwardY] = ((forwardXForwardYSampledPixel & 16711935) * forwardXForwardYStoredAlpha + (forwardXForwardYDestinationPixel & 16711935) * forwardXForwardYInverseAlpha256 & -16711936) + ((forwardXForwardYSampledPixel & 65280) * forwardXForwardYStoredAlpha + (forwardXForwardYDestinationPixel & 65280) * forwardXForwardYInverseAlpha256 & 16711680) >>> 8;
                forwardXForwardYSourceXQ12 = forwardXForwardYSourceXQ12 + inverseCosStep;
                forwardXForwardYSourceYQ12 = forwardXForwardYSourceYQ12 + inverseSinStep;
                forwardXForwardYNegativePixelCounter++;
              }
              forwardXForwardYNegativeRowCounter++;
              rowSourceXQ12 = rowSourceXQ12 - inverseSinStep;
              rowSourceYQ12 = rowSourceYQ12 + inverseCosStep;
              rowDestinationIndex = rowDestinationIndex + SoftwareRasterizer.stride;
            }
            return;
          }
          forwardXReverseYNegativeRowCounter = bottomThenNegativeHeight;
          while (forwardXReverseYNegativeRowCounter < 0) {
            forwardXReverseYDestinationIndex = rowDestinationIndex;
            forwardXReverseYSourceXQ12 = rowSourceXQ12 + (destinationOffsetX * inverseCosStep >> 4);
            forwardXReverseYSourceYQ12 = rowSourceYQ12 + (destinationOffsetX * inverseSinStep >> 4);
            forwardXReverseYNegativePixelCounter = rightThenNegativeWidth;
            if (forwardXReverseYSourceXQ12 < 0) {
              forwardXReverseYLeftSkipPixels = (inverseCosStep - 1 - forwardXReverseYSourceXQ12) / inverseCosStep;
              forwardXReverseYNegativePixelCounter = forwardXReverseYNegativePixelCounter + forwardXReverseYLeftSkipPixels;
              forwardXReverseYSourceXQ12 = forwardXReverseYSourceXQ12 + inverseCosStep * forwardXReverseYLeftSkipPixels;
              forwardXReverseYSourceYQ12 = forwardXReverseYSourceYQ12 + inverseSinStep * forwardXReverseYLeftSkipPixels;
              forwardXReverseYDestinationIndex = forwardXReverseYDestinationIndex + forwardXReverseYLeftSkipPixels;
            }
            forwardXReverseYRightStopCounter = (1 + forwardXReverseYSourceXQ12 - (this.width << 12) - inverseCosStep) / inverseCosStep;
            if ((1 + forwardXReverseYSourceXQ12 - (this.width << 12) - inverseCosStep) / inverseCosStep > forwardXReverseYNegativePixelCounter) {
              forwardXReverseYNegativePixelCounter = forwardXReverseYRightStopCounter;
            }
            forwardXReverseYBottomExcessThenSkipPixels = forwardXReverseYSourceYQ12 - (this.height << 12);
            if (forwardXReverseYSourceYQ12 - (this.height << 12) >= 0) {
              forwardXReverseYBottomExcessThenSkipPixels = (inverseSinStep - forwardXReverseYBottomExcessThenSkipPixels) / inverseSinStep;
              forwardXReverseYNegativePixelCounter = forwardXReverseYNegativePixelCounter + forwardXReverseYBottomExcessThenSkipPixels;
              forwardXReverseYSourceXQ12 = forwardXReverseYSourceXQ12 + inverseCosStep * forwardXReverseYBottomExcessThenSkipPixels;
              forwardXReverseYSourceYQ12 = forwardXReverseYSourceYQ12 + inverseSinStep * forwardXReverseYBottomExcessThenSkipPixels;
              forwardXReverseYDestinationIndex = forwardXReverseYDestinationIndex + forwardXReverseYBottomExcessThenSkipPixels;
            }
            forwardXReverseYTopStopCounter = (forwardXReverseYSourceYQ12 - inverseSinStep) / inverseSinStep;
            if ((forwardXReverseYSourceYQ12 - inverseSinStep) / inverseSinStep > forwardXReverseYNegativePixelCounter) {
              forwardXReverseYNegativePixelCounter = forwardXReverseYTopStopCounter;
            }
            while (forwardXReverseYNegativePixelCounter < 0) {
              forwardXReverseYSampledPixel = this.pixels[(forwardXReverseYSourceYQ12 >> 12) * this.width + (forwardXReverseYSourceXQ12 >> 12)];
              forwardXReverseYDestinationPixel = SoftwareRasterizer.framebuffer[forwardXReverseYDestinationIndex];
              forwardXReverseYStoredAlpha = forwardXReverseYSampledPixel >>> 24;
              forwardXReverseYInverseAlpha256 = 256 - forwardXReverseYStoredAlpha;
              writeIndexForwardXReverseY = forwardXReverseYDestinationIndex;
              forwardXReverseYDestinationIndex++;
              SoftwareRasterizer.framebuffer[writeIndexForwardXReverseY] = ((forwardXReverseYSampledPixel & 16711935) * forwardXReverseYStoredAlpha + (forwardXReverseYDestinationPixel & 16711935) * forwardXReverseYInverseAlpha256 & -16711936) + ((forwardXReverseYSampledPixel & 65280) * forwardXReverseYStoredAlpha + (forwardXReverseYDestinationPixel & 65280) * forwardXReverseYInverseAlpha256 & 16711680) >>> 8;
              forwardXReverseYSourceXQ12 = forwardXReverseYSourceXQ12 + inverseCosStep;
              forwardXReverseYSourceYQ12 = forwardXReverseYSourceYQ12 + inverseSinStep;
              forwardXReverseYNegativePixelCounter++;
            }
            forwardXReverseYNegativeRowCounter++;
            rowSourceXQ12 = rowSourceXQ12 - inverseSinStep;
            rowSourceYQ12 = rowSourceYQ12 + inverseCosStep;
            rowDestinationIndex = rowDestinationIndex + SoftwareRasterizer.stride;
          }
          return;
        }
        if (inverseSinStep == 0) {
          reverseXFixedYNegativeRowCounter = bottomThenNegativeHeight;
          while (reverseXFixedYNegativeRowCounter < 0) {
            reverseXFixedYDestinationIndex = rowDestinationIndex;
            reverseXFixedYSourceXQ12 = rowSourceXQ12 + (destinationOffsetX * inverseCosStep >> 4);
            reverseXFixedYSourceYQ12 = rowSourceYQ12;
            reverseXFixedYNegativePixelCounter = rightThenNegativeWidth;
            if (reverseXFixedYSourceYQ12 >= 0 &&
                reverseXFixedYSourceYQ12 - (this.height << 12) < 0) {
              reverseXFixedYRightExcessThenSkipPixels = reverseXFixedYSourceXQ12 - (this.width << 12);
              if (reverseXFixedYSourceXQ12 - (this.width << 12) >= 0) {
                reverseXFixedYRightExcessThenSkipPixels = (inverseCosStep - reverseXFixedYRightExcessThenSkipPixels) / inverseCosStep;
                reverseXFixedYNegativePixelCounter = reverseXFixedYNegativePixelCounter + reverseXFixedYRightExcessThenSkipPixels;
                reverseXFixedYSourceXQ12 = reverseXFixedYSourceXQ12 + inverseCosStep * reverseXFixedYRightExcessThenSkipPixels;
                reverseXFixedYDestinationIndex = reverseXFixedYDestinationIndex + reverseXFixedYRightExcessThenSkipPixels;
              }
              reverseXFixedYLeftStopCounter = (reverseXFixedYSourceXQ12 - inverseCosStep) / inverseCosStep;
              if ((reverseXFixedYSourceXQ12 - inverseCosStep) / inverseCosStep > reverseXFixedYNegativePixelCounter) {
                reverseXFixedYNegativePixelCounter = reverseXFixedYLeftStopCounter;
              }
              while (reverseXFixedYNegativePixelCounter < 0) {
                reverseXFixedYSampledPixel = this.pixels[(reverseXFixedYSourceYQ12 >> 12) * this.width + (reverseXFixedYSourceXQ12 >> 12)];
                reverseXFixedYDestinationPixel = SoftwareRasterizer.framebuffer[reverseXFixedYDestinationIndex];
                reverseXFixedYStoredAlpha = reverseXFixedYSampledPixel >>> 24;
                reverseXFixedYInverseAlpha256 = 256 - reverseXFixedYStoredAlpha;
                writeIndexReverseXFixedY = reverseXFixedYDestinationIndex;
                reverseXFixedYDestinationIndex++;
                SoftwareRasterizer.framebuffer[writeIndexReverseXFixedY] = ((reverseXFixedYSampledPixel & 16711935) * reverseXFixedYStoredAlpha + (reverseXFixedYDestinationPixel & 16711935) * reverseXFixedYInverseAlpha256 & -16711936) + ((reverseXFixedYSampledPixel & 65280) * reverseXFixedYStoredAlpha + (reverseXFixedYDestinationPixel & 65280) * reverseXFixedYInverseAlpha256 & 16711680) >>> 8;
                reverseXFixedYSourceXQ12 = reverseXFixedYSourceXQ12 + inverseCosStep;
                reverseXFixedYNegativePixelCounter++;
              }
            }
            reverseXFixedYNegativeRowCounter++;
            rowSourceYQ12 = rowSourceYQ12 + inverseCosStep;
            rowDestinationIndex = rowDestinationIndex + SoftwareRasterizer.stride;
          }
          return;
        }
        if (inverseSinStep >= 0) {
          reverseXForwardYNegativeRowCounter = bottomThenNegativeHeight;
          while (reverseXForwardYNegativeRowCounter < 0) {
            reverseXForwardYDestinationIndex = rowDestinationIndex;
            reverseXForwardYSourceXQ12 = rowSourceXQ12 + (destinationOffsetX * inverseCosStep >> 4);
            reverseXForwardYSourceYQ12 = rowSourceYQ12 + (destinationOffsetX * inverseSinStep >> 4);
            reverseXForwardYNegativePixelCounter = rightThenNegativeWidth;
            reverseXForwardYRightExcessThenSkipPixels = reverseXForwardYSourceXQ12 - (this.width << 12);
            if (reverseXForwardYSourceXQ12 - (this.width << 12) >= 0) {
              reverseXForwardYRightExcessThenSkipPixels = (inverseCosStep - reverseXForwardYRightExcessThenSkipPixels) / inverseCosStep;
              reverseXForwardYNegativePixelCounter = reverseXForwardYNegativePixelCounter + reverseXForwardYRightExcessThenSkipPixels;
              reverseXForwardYSourceXQ12 = reverseXForwardYSourceXQ12 + inverseCosStep * reverseXForwardYRightExcessThenSkipPixels;
              reverseXForwardYSourceYQ12 = reverseXForwardYSourceYQ12 + inverseSinStep * reverseXForwardYRightExcessThenSkipPixels;
              reverseXForwardYDestinationIndex = reverseXForwardYDestinationIndex + reverseXForwardYRightExcessThenSkipPixels;
            }
            reverseXForwardYLeftStopCounter = (reverseXForwardYSourceXQ12 - inverseCosStep) / inverseCosStep;
            if ((reverseXForwardYSourceXQ12 - inverseCosStep) / inverseCosStep > reverseXForwardYNegativePixelCounter) {
              reverseXForwardYNegativePixelCounter = reverseXForwardYLeftStopCounter;
            }
            if (reverseXForwardYSourceYQ12 < 0) {
              reverseXForwardYTopSkipPixels = (inverseSinStep - 1 - reverseXForwardYSourceYQ12) / inverseSinStep;
              reverseXForwardYNegativePixelCounter = reverseXForwardYNegativePixelCounter + reverseXForwardYTopSkipPixels;
              reverseXForwardYSourceXQ12 = reverseXForwardYSourceXQ12 + inverseCosStep * reverseXForwardYTopSkipPixels;
              reverseXForwardYSourceYQ12 = reverseXForwardYSourceYQ12 + inverseSinStep * reverseXForwardYTopSkipPixels;
              reverseXForwardYDestinationIndex = reverseXForwardYDestinationIndex + reverseXForwardYTopSkipPixels;
            }
            reverseXForwardYBottomStopCounter = (1 + reverseXForwardYSourceYQ12 - (this.height << 12) - inverseSinStep) / inverseSinStep;
            if ((1 + reverseXForwardYSourceYQ12 - (this.height << 12) - inverseSinStep) / inverseSinStep > reverseXForwardYNegativePixelCounter) {
              reverseXForwardYNegativePixelCounter = reverseXForwardYBottomStopCounter;
            }
            while (reverseXForwardYNegativePixelCounter < 0) {
              reverseXForwardYSampledPixel = this.pixels[(reverseXForwardYSourceYQ12 >> 12) * this.width + (reverseXForwardYSourceXQ12 >> 12)];
              reverseXForwardYDestinationPixel = SoftwareRasterizer.framebuffer[reverseXForwardYDestinationIndex];
              reverseXForwardYStoredAlpha = reverseXForwardYSampledPixel >>> 24;
              reverseXForwardYInverseAlpha256 = 256 - reverseXForwardYStoredAlpha;
              writeIndexReverseXForwardY = reverseXForwardYDestinationIndex;
              reverseXForwardYDestinationIndex++;
              SoftwareRasterizer.framebuffer[writeIndexReverseXForwardY] = ((reverseXForwardYSampledPixel & 16711935) * reverseXForwardYStoredAlpha + (reverseXForwardYDestinationPixel & 16711935) * reverseXForwardYInverseAlpha256 & -16711936) + ((reverseXForwardYSampledPixel & 65280) * reverseXForwardYStoredAlpha + (reverseXForwardYDestinationPixel & 65280) * reverseXForwardYInverseAlpha256 & 16711680) >>> 8;
              reverseXForwardYSourceXQ12 = reverseXForwardYSourceXQ12 + inverseCosStep;
              reverseXForwardYSourceYQ12 = reverseXForwardYSourceYQ12 + inverseSinStep;
              reverseXForwardYNegativePixelCounter++;
            }
            reverseXForwardYNegativeRowCounter++;
            rowSourceXQ12 = rowSourceXQ12 - inverseSinStep;
            rowSourceYQ12 = rowSourceYQ12 + inverseCosStep;
            rowDestinationIndex = rowDestinationIndex + SoftwareRasterizer.stride;
          }
          return;
        }
        reverseXReverseYNegativeRowCounter = bottomThenNegativeHeight;
        while (reverseXReverseYNegativeRowCounter < 0) {
          reverseXReverseYDestinationIndex = rowDestinationIndex;
          reverseXReverseYSourceXQ12 = rowSourceXQ12 + (destinationOffsetX * inverseCosStep >> 4);
          reverseXReverseYSourceYQ12 = rowSourceYQ12 + (destinationOffsetX * inverseSinStep >> 4);
          reverseXReverseYNegativePixelCounter = rightThenNegativeWidth;
          reverseXReverseYRightExcessThenSkipPixels = reverseXReverseYSourceXQ12 - (this.width << 12);
          if (reverseXReverseYSourceXQ12 - (this.width << 12) >= 0) {
            reverseXReverseYRightExcessThenSkipPixels = (inverseCosStep - reverseXReverseYRightExcessThenSkipPixels) / inverseCosStep;
            reverseXReverseYNegativePixelCounter = reverseXReverseYNegativePixelCounter + reverseXReverseYRightExcessThenSkipPixels;
            reverseXReverseYSourceXQ12 = reverseXReverseYSourceXQ12 + inverseCosStep * reverseXReverseYRightExcessThenSkipPixels;
            reverseXReverseYSourceYQ12 = reverseXReverseYSourceYQ12 + inverseSinStep * reverseXReverseYRightExcessThenSkipPixels;
            reverseXReverseYDestinationIndex = reverseXReverseYDestinationIndex + reverseXReverseYRightExcessThenSkipPixels;
          }
          reverseXReverseYLeftStopCounter = (reverseXReverseYSourceXQ12 - inverseCosStep) / inverseCosStep;
          if ((reverseXReverseYSourceXQ12 - inverseCosStep) / inverseCosStep > reverseXReverseYNegativePixelCounter) {
            reverseXReverseYNegativePixelCounter = reverseXReverseYLeftStopCounter;
          }
          reverseXReverseYBottomExcessThenSkipPixels = reverseXReverseYSourceYQ12 - (this.height << 12);
          if (reverseXReverseYSourceYQ12 - (this.height << 12) >= 0) {
            reverseXReverseYBottomExcessThenSkipPixels = (inverseSinStep - reverseXReverseYBottomExcessThenSkipPixels) / inverseSinStep;
            reverseXReverseYNegativePixelCounter = reverseXReverseYNegativePixelCounter + reverseXReverseYBottomExcessThenSkipPixels;
            reverseXReverseYSourceXQ12 = reverseXReverseYSourceXQ12 + inverseCosStep * reverseXReverseYBottomExcessThenSkipPixels;
            reverseXReverseYSourceYQ12 = reverseXReverseYSourceYQ12 + inverseSinStep * reverseXReverseYBottomExcessThenSkipPixels;
            reverseXReverseYDestinationIndex = reverseXReverseYDestinationIndex + reverseXReverseYBottomExcessThenSkipPixels;
          }
          reverseXReverseYTopStopCounter = (reverseXReverseYSourceYQ12 - inverseSinStep) / inverseSinStep;
          if ((reverseXReverseYSourceYQ12 - inverseSinStep) / inverseSinStep > reverseXReverseYNegativePixelCounter) {
            reverseXReverseYNegativePixelCounter = reverseXReverseYTopStopCounter;
          }
          while (reverseXReverseYNegativePixelCounter < 0) {
            reverseXReverseYSampledPixel = this.pixels[(reverseXReverseYSourceYQ12 >> 12) * this.width + (reverseXReverseYSourceXQ12 >> 12)];
            reverseXReverseYDestinationPixel = SoftwareRasterizer.framebuffer[reverseXReverseYDestinationIndex];
            reverseXReverseYStoredAlpha = reverseXReverseYSampledPixel >>> 24;
            reverseXReverseYInverseAlpha256 = 256 - reverseXReverseYStoredAlpha;
            writeIndexReverseXReverseY = reverseXReverseYDestinationIndex;
            reverseXReverseYDestinationIndex++;
            SoftwareRasterizer.framebuffer[writeIndexReverseXReverseY] = ((reverseXReverseYSampledPixel & 16711935) * reverseXReverseYStoredAlpha + (reverseXReverseYDestinationPixel & 16711935) * reverseXReverseYInverseAlpha256 & -16711936) + ((reverseXReverseYSampledPixel & 65280) * reverseXReverseYStoredAlpha + (reverseXReverseYDestinationPixel & 65280) * reverseXReverseYInverseAlpha256 & 16711680) >>> 8;
            reverseXReverseYSourceXQ12 = reverseXReverseYSourceXQ12 + inverseCosStep;
            reverseXReverseYSourceYQ12 = reverseXReverseYSourceYQ12 + inverseSinStep;
            reverseXReverseYNegativePixelCounter++;
          }
          reverseXReverseYNegativeRowCounter++;
          rowSourceXQ12 = rowSourceXQ12 - inverseSinStep;
          rowSourceYQ12 = rowSourceYQ12 + inverseCosStep;
          rowDestinationIndex = rowDestinationIndex + SoftwareRasterizer.stride;
        }
        return;
    }

    private final static void blitArgbAdditive(int sourceColorScratch, int blendScratch, int rgbSum, int[] destinationPixels, int[] sourcePixels, int sourceIndex, int negativeColumnScratch, int destinationIndex, int negativeRowScratch, int drawWidth, int drawHeight, int destinationRowSkip, int sourceRowSkip, int intensity256) {
        int destinationWriteIndex = 0;
        int effectiveAlpha256;
        negativeRowScratch = -drawHeight;
        while (true) {
          if (negativeRowScratch >= 0) {
            return;
          }
          negativeColumnScratch = -drawWidth;
          {
          boolean rasterColumnsCompleted = false;
          while (!(rasterColumnsCompleted = (negativeColumnScratch >= 0))) {
            sourceColorScratch = sourcePixels[sourceIndex++];
            if (sourceColorScratch == 0) {
              destinationIndex++;
              negativeColumnScratch++;
              continue;
            }
            effectiveAlpha256 = intensity256 * (sourceColorScratch >>> 24) >> 8 & 255;
            blendScratch = (sourceColorScratch & 16711935) * effectiveAlpha256;
            sourceColorScratch = (blendScratch & -16711936) + (sourceColorScratch * effectiveAlpha256 - blendScratch & 16711680) >>> 8;
            blendScratch = destinationPixels[destinationIndex];
            rgbSum = sourceColorScratch + blendScratch;
            sourceColorScratch = (sourceColorScratch & 16711935) + (blendScratch & 16711935);
            blendScratch = (sourceColorScratch & 16777472) + (rgbSum - sourceColorScratch & 65536);
            destinationWriteIndex = destinationIndex;
            destinationIndex++;
            destinationPixels[destinationWriteIndex] = rgbSum - blendScratch | blendScratch - (blendScratch >>> 8);
            negativeColumnScratch++;
          }
          if (rasterColumnsCompleted) {
              destinationIndex = destinationIndex + destinationRowSkip;
              sourceIndex = sourceIndex + sourceRowSkip;
              negativeRowScratch++;
              }
          }
        }
    }

    final void drawHalfSize(int x, int y) {
        int firstSourceXCandidate = 0;
        int lastBlockSourceXCandidate = 0;
        int firstSourceYCandidate = 0;
        int lastBlockSourceYCandidate = 0;
        int[] samplePixelBuffer = null;
        int sampleBaseIndex = 0;
        int sampleRowOffset = 0;
        int reducedWidth;
        int reducedHeight;
        int firstSourceX;
        int lastBlockSourceX;
        int firstSourceY;
        int lastBlockSourceY;
        int sourceBlockY;
        int sourceIndex;
        int destinationIndex;
        int sourceBlockX;
        int samplePixel;
        int sampleAlpha;
        int weightedRedThenRedBlue;
        int weightedGreenThenPackedGreen;
        int weightedBlue;
        int alphaSum;
        int sampleIndexThenAverageAlpha;
        int inverseAlpha256;
        int destinationPixel;
        int sampleArgbPixel;
        int sampleAlphaForWeighting;
        int averageBlockAlpha;
        reducedWidth = this.width >> 1;
        reducedHeight = this.height >> 1;
        x = x + this.trimX / 2;
        y = y + this.trimY / 2;
        if (x >= SoftwareRasterizer.clipLeft) {
          firstSourceXCandidate = 0;
        } else {
          firstSourceXCandidate = SoftwareRasterizer.clipLeft - x << 1;
        }
        firstSourceX = firstSourceXCandidate;
        if (x + reducedWidth <= SoftwareRasterizer.clipRight) {
          lastBlockSourceXCandidate = this.width - 2;
        } else {
          lastBlockSourceXCandidate = (SoftwareRasterizer.clipRight - x << 1) - 2;
        }
        lastBlockSourceX = lastBlockSourceXCandidate;
        if (y >= SoftwareRasterizer.clipTop) {
          firstSourceYCandidate = 0;
        } else {
          firstSourceYCandidate = SoftwareRasterizer.clipTop - y << 1;
        }
        firstSourceY = firstSourceYCandidate;
        if (y + reducedHeight <= SoftwareRasterizer.clipBottom) {
          lastBlockSourceYCandidate = this.height - 2;
        } else {
          lastBlockSourceYCandidate = (SoftwareRasterizer.clipBottom - y << 1) - 2;
        }
        lastBlockSourceY = lastBlockSourceYCandidate;
        sourceBlockY = firstSourceY;
        while (true) {
          if (sourceBlockY > lastBlockSourceY) {
            return;
          }
          sourceIndex = sourceBlockY * this.width + firstSourceX;
          destinationIndex = (y + (sourceBlockY >> 1)) * SoftwareRasterizer.stride + (x + (firstSourceX >> 1));
          sourceBlockX = firstSourceX;
          while (true) {
            if (sourceBlockX > lastBlockSourceX) {
              sourceBlockY += 2;
              break;
            }
            samplePixel = 0;
            sampleAlpha = 0;
            weightedRedThenRedBlue = 0;
            weightedGreenThenPackedGreen = 0;
            weightedBlue = 0;
            alphaSum = 0;
            for (sampleIndexThenAverageAlpha = 0; sampleIndexThenAverageAlpha < 4; sampleIndexThenAverageAlpha++) {
              samplePixelBuffer = this.pixels;
              sampleBaseIndex = sourceIndex + (sampleIndexThenAverageAlpha & 1);
              if ((sampleIndexThenAverageAlpha & 2) != 0) {
                sampleRowOffset = 0;
              } else {
                sampleRowOffset = this.width;
              }
              sampleArgbPixel = samplePixelBuffer[sampleBaseIndex + sampleRowOffset];
              sampleAlphaForWeighting = sampleArgbPixel >>> 24;
              alphaSum = alphaSum + sampleAlphaForWeighting;
              weightedRedThenRedBlue = weightedRedThenRedBlue + sampleAlphaForWeighting * (sampleArgbPixel >> 16 & 255);
              weightedGreenThenPackedGreen = weightedGreenThenPackedGreen + sampleAlphaForWeighting * (sampleArgbPixel >> 8 & 255);
              weightedBlue = weightedBlue + sampleAlphaForWeighting * (sampleArgbPixel & 255);
            }
            if (alphaSum == 0) {
              sourceBlockX += 2;
              destinationIndex++;
              sourceIndex += 2;
              continue;
            }
            weightedRedThenRedBlue = (weightedRedThenRedBlue / alphaSum << 16) + weightedBlue / alphaSum;
            weightedGreenThenPackedGreen = weightedGreenThenPackedGreen / alphaSum << 8;
            averageBlockAlpha = alphaSum >> 2;
            inverseAlpha256 = 256 - averageBlockAlpha;
            destinationPixel = SoftwareRasterizer.framebuffer[destinationIndex];
            SoftwareRasterizer.framebuffer[destinationIndex] = (averageBlockAlpha * weightedRedThenRedBlue + inverseAlpha256 * (destinationPixel & 16711935) & -16711936) + (averageBlockAlpha * weightedGreenThenPackedGreen + inverseAlpha256 * (destinationPixel & 65280) & 16711680) >>> 8;
            sourceBlockX += 2;
            destinationIndex++;
            sourceIndex += 2;
          }
        }
    }

    ArgbSprite(int fullWidth, int fullHeight, int trimX, int trimY, int width, int height, int[] pixels) {
        super(fullWidth, fullHeight, trimX, trimY, width, height, pixels);
    }

    final void drawQuarterSize(int x, int y) {
        int firstSourceXCandidate = 0;
        int lastBlockSourceXCandidate = 0;
        int firstSourceYCandidate = 0;
        int lastBlockSourceYCandidate = 0;
        int reducedWidth;
        int reducedHeight;
        int firstSourceX;
        int lastBlockSourceX;
        int firstSourceY;
        int lastBlockSourceY;
        int[] sampleBlockAlias;
        int sourceBlockY;
        int sourceBlockX;
        int sourceIndex;
        int destinationIndex;
        int sampleRowThenAlpha;
        int sampleColumnThenAlphaSum;
        int weightedRedThenRedBlue;
        int weightedGreenThenPackedGreen;
        int weightedBlue;
        int sampleIndexThenAverageAlpha;
        int inverseAlpha256;
        int destinationPixel;
        int[] sampleBlockStorage;
        int[] allocatedSampleBlock;
        int unusedSampleAlphaInitialization;
        int sampleAlphaForWeighting;
        int blockAlphaSum;
        int averageBlockAlpha;
        int[] sampleBlockReadAlias;
        reducedWidth = this.width >> 2;
        reducedHeight = this.height >> 2;
        x = x + this.trimX / 4;
        y = y + this.trimY / 4;
        if (x >= SoftwareRasterizer.clipLeft) {
          firstSourceXCandidate = 0;
        } else {
          firstSourceXCandidate = SoftwareRasterizer.clipLeft - x << 2;
        }
        firstSourceX = firstSourceXCandidate;
        if (x + reducedWidth <= SoftwareRasterizer.clipRight) {
          lastBlockSourceXCandidate = this.width - 4;
        } else {
          lastBlockSourceXCandidate = (SoftwareRasterizer.clipRight - x << 2) - 4;
        }
        lastBlockSourceX = lastBlockSourceXCandidate;
        if (y >= SoftwareRasterizer.clipTop) {
          firstSourceYCandidate = 0;
        } else {
          firstSourceYCandidate = SoftwareRasterizer.clipTop - y << 2;
        }
        firstSourceY = firstSourceYCandidate;
        if (y + reducedHeight <= SoftwareRasterizer.clipBottom) {
          lastBlockSourceYCandidate = this.height - 4;
        } else {
          lastBlockSourceYCandidate = (SoftwareRasterizer.clipBottom - y << 2) - 4;
        }
        lastBlockSourceY = lastBlockSourceYCandidate;
        allocatedSampleBlock = new int[16];
        sampleBlockStorage = allocatedSampleBlock;
        sampleBlockAlias = sampleBlockStorage;
        sourceBlockY = firstSourceY;
        while (true) {
          if (sourceBlockY > lastBlockSourceY) {
            return;
          }
          sourceBlockX = firstSourceX;
          while (true) {
            if (sourceBlockX > lastBlockSourceX) {
              sourceBlockY += 4;
              break;
            }
            sourceIndex = sourceBlockY * this.width + sourceBlockX;
            destinationIndex = (y + (sourceBlockY >> 2)) * SoftwareRasterizer.stride + (x + (sourceBlockX >> 2));
            for (sampleRowThenAlpha = 0; sampleRowThenAlpha < 4; sampleRowThenAlpha++) {
              for (sampleColumnThenAlphaSum = 0; sampleColumnThenAlphaSum < 4; sampleColumnThenAlphaSum++) {
                sampleBlockAlias[(sampleRowThenAlpha << 2) + sampleColumnThenAlphaSum] = this.pixels[sourceIndex + sampleRowThenAlpha * this.width + sampleColumnThenAlphaSum];
              }
            }
            sampleBlockReadAlias = sampleBlockStorage;
            unusedSampleAlphaInitialization = 0;
            blockAlphaSum = 0;
            weightedRedThenRedBlue = 0;
            weightedGreenThenPackedGreen = 0;
            weightedBlue = 0;
            for (sampleIndexThenAverageAlpha = 0; sampleIndexThenAverageAlpha < 16; sampleIndexThenAverageAlpha++) {
              sampleAlphaForWeighting = sampleBlockReadAlias[sampleIndexThenAverageAlpha] >>> 24;
              blockAlphaSum = blockAlphaSum + sampleAlphaForWeighting;
              weightedRedThenRedBlue = weightedRedThenRedBlue + sampleAlphaForWeighting * (sampleBlockReadAlias[sampleIndexThenAverageAlpha] >> 16 & 255);
              weightedGreenThenPackedGreen = weightedGreenThenPackedGreen + sampleAlphaForWeighting * (sampleBlockReadAlias[sampleIndexThenAverageAlpha] >> 8 & 255);
              weightedBlue = weightedBlue + sampleAlphaForWeighting * (sampleBlockReadAlias[sampleIndexThenAverageAlpha] & 255);
            }
            if (blockAlphaSum == 0) {
              sourceBlockX += 4;
              continue;
            }
            weightedRedThenRedBlue = (weightedRedThenRedBlue / blockAlphaSum << 16) + weightedBlue / blockAlphaSum;
            weightedGreenThenPackedGreen = weightedGreenThenPackedGreen / blockAlphaSum << 8;
            averageBlockAlpha = blockAlphaSum >> 4;
            inverseAlpha256 = 256 - averageBlockAlpha;
            destinationPixel = SoftwareRasterizer.framebuffer[destinationIndex];
            SoftwareRasterizer.framebuffer[destinationIndex] = (averageBlockAlpha * weightedRedThenRedBlue + inverseAlpha256 * (destinationPixel & 16711935) & -16711936) + (averageBlockAlpha * weightedGreenThenPackedGreen + inverseAlpha256 * (destinationPixel & 65280) & 16711680) >>> 8;
            sourceBlockX += 4;
          }
        }
    }

    ArgbSprite(int width, int height) {
        super(width, height);
    }

    private final static void blitArgbGrayModulated(int[] destinationPixels, int[] sourcePixels, int sourcePixel, int sourceIndex, int destinationIndex, int negativeColumnScratch, int negativeRowScratch, int drawWidth, int drawHeight, int destinationRowSkip, int sourceRowSkip, int tintColor) {
        int destinationWriteIndex = 0;
        int tintRedBlue;
        int tintGreen;
        int storedAlpha;
        int modulatedPixel;
        int inverseAlpha256;
        int destinationPixel;
        int modulatedRgb;
        tintRedBlue = tintColor & 16711935;
        tintGreen = tintColor >> 8 & 255;
        negativeRowScratch = -drawHeight;
        while (true) {
          if (negativeRowScratch >= 0) {
            return;
          }
          negativeColumnScratch = -drawWidth;
          {
          boolean rasterColumnsCompleted = false;
          while (!(rasterColumnsCompleted = (negativeColumnScratch >= 0))) {
            sourcePixel = sourcePixels[sourceIndex++];
            storedAlpha = sourcePixel >>> 24;
            sourcePixel = sourcePixel & 16777215;
            if (storedAlpha == 0) {
              destinationIndex++;
              negativeColumnScratch++;
              continue;
            }
            modulatedPixel = 0;
            if (sourcePixel >> 8 != (sourcePixel & 65535)) {
              modulatedRgb = sourcePixel;
            } else {
              sourcePixel = sourcePixel & 255;
              modulatedRgb = (sourcePixel * tintRedBlue >> 8 & 16711934) + (sourcePixel * tintGreen & 65280) + 1;
            }
            inverseAlpha256 = 256 - storedAlpha;
            destinationPixel = destinationPixels[destinationIndex];
            destinationWriteIndex = destinationIndex;
            destinationIndex++;
            destinationPixels[destinationWriteIndex] = ((modulatedRgb & 16711935) * storedAlpha + (destinationPixel & 16711935) * inverseAlpha256 & -16711936) + ((modulatedRgb & 65280) * storedAlpha + (destinationPixel & 65280) * inverseAlpha256 & 16711680) >>> 8;
            negativeColumnScratch++;
          }
          if (rasterColumnsCompleted) {
              destinationIndex = destinationIndex + destinationRowSkip;
              sourceIndex = sourceIndex + sourceRowSkip;
              negativeRowScratch++;
              }
          }
        }
    }

    final void drawAdditive(int x, int y, int intensity256) {
        int topClipPixels = 0;
        int leftClipPixels;
        int rightClipPixels;
        x = x + this.trimX;
        y = y + this.trimY;
        int destinationIndex = x + y * SoftwareRasterizer.stride;
        int sourceIndex = 0;
        int drawHeight = this.height;
        int drawWidth = this.width;
        int destinationRowSkip = SoftwareRasterizer.stride - drawWidth;
        int sourceRowSkip = 0;
        if (y < SoftwareRasterizer.clipTop) {
            topClipPixels = SoftwareRasterizer.clipTop - y;
            drawHeight = drawHeight - topClipPixels;
            y = SoftwareRasterizer.clipTop;
            sourceIndex = sourceIndex + topClipPixels * drawWidth;
            destinationIndex = destinationIndex + topClipPixels * SoftwareRasterizer.stride;
        }
        if (y + drawHeight > SoftwareRasterizer.clipBottom) {
            drawHeight = drawHeight - (y + drawHeight - SoftwareRasterizer.clipBottom);
        }
        if (x < SoftwareRasterizer.clipLeft) {
            leftClipPixels = SoftwareRasterizer.clipLeft - x;
            drawWidth = drawWidth - leftClipPixels;
            x = SoftwareRasterizer.clipLeft;
            sourceIndex = sourceIndex + leftClipPixels;
            destinationIndex = destinationIndex + leftClipPixels;
            sourceRowSkip = sourceRowSkip + leftClipPixels;
            destinationRowSkip = destinationRowSkip + leftClipPixels;
        }
        if (x + drawWidth > SoftwareRasterizer.clipRight) {
            rightClipPixels = x + drawWidth - SoftwareRasterizer.clipRight;
            drawWidth = drawWidth - rightClipPixels;
            sourceRowSkip = sourceRowSkip + rightClipPixels;
            destinationRowSkip = destinationRowSkip + rightClipPixels;
        }
        if (drawWidth > 0) {
            if (drawHeight <= 0) {
                return;
            }
            ArgbSprite.blitArgbAdditive(0, 0, 0, SoftwareRasterizer.framebuffer, this.pixels, sourceIndex, 0, destinationIndex, 0, drawWidth, drawHeight, destinationRowSkip, sourceRowSkip, intensity256);
            return;
        }
    }

    final void draw(int x, int y) {
        int topClipPixels = 0;
        int leftClipPixels;
        int rightClipPixels;
        x = x + this.trimX;
        y = y + this.trimY;
        int destinationIndex = x + y * SoftwareRasterizer.stride;
        int sourceIndex = 0;
        int drawHeight = this.height;
        int drawWidth = this.width;
        int destinationRowSkip = SoftwareRasterizer.stride - drawWidth;
        int sourceRowSkip = 0;
        if (y < SoftwareRasterizer.clipTop) {
            topClipPixels = SoftwareRasterizer.clipTop - y;
            drawHeight = drawHeight - topClipPixels;
            y = SoftwareRasterizer.clipTop;
            sourceIndex = sourceIndex + topClipPixels * drawWidth;
            destinationIndex = destinationIndex + topClipPixels * SoftwareRasterizer.stride;
        }
        if (y + drawHeight > SoftwareRasterizer.clipBottom) {
            drawHeight = drawHeight - (y + drawHeight - SoftwareRasterizer.clipBottom);
        }
        if (x < SoftwareRasterizer.clipLeft) {
            leftClipPixels = SoftwareRasterizer.clipLeft - x;
            drawWidth = drawWidth - leftClipPixels;
            x = SoftwareRasterizer.clipLeft;
            sourceIndex = sourceIndex + leftClipPixels;
            destinationIndex = destinationIndex + leftClipPixels;
            sourceRowSkip = sourceRowSkip + leftClipPixels;
            destinationRowSkip = destinationRowSkip + leftClipPixels;
        }
        if (x + drawWidth > SoftwareRasterizer.clipRight) {
            rightClipPixels = x + drawWidth - SoftwareRasterizer.clipRight;
            drawWidth = drawWidth - rightClipPixels;
            sourceRowSkip = sourceRowSkip + rightClipPixels;
            destinationRowSkip = destinationRowSkip + rightClipPixels;
        }
        if (drawWidth > 0) {
            if (drawHeight <= 0) {
                return;
            }
            ArgbSprite.blitArgb(SoftwareRasterizer.framebuffer, this.pixels, 0, sourceIndex, destinationIndex, drawWidth, drawHeight, destinationRowSkip, sourceRowSkip);
            return;
        }
    }

    private final static void blitArgbAlpha(int[] destinationPixels, int[] sourcePixels, int unusedPixelScratch, int sourceIndex, int destinationIndex, int drawWidth, int drawHeight, int destinationRowSkip, int sourceRowSkip, int alpha256) {
        int negativeRow = 0;
        int negativeColumn = 0;
        int effectiveAlpha256 = 0;
        int inverseAlpha256 = 0;
        int sourcePixel = 0;
        int destinationPixel = 0;
        int destinationWriteIndex = 0;
        for (negativeRow = -drawHeight; negativeRow < 0; negativeRow++) {
            for (negativeColumn = -drawWidth; negativeColumn < 0; negativeColumn++) {
                effectiveAlpha256 = (sourcePixels[sourceIndex] >>> 24) * alpha256 >> 8;
                inverseAlpha256 = 256 - effectiveAlpha256;
                sourcePixel = sourcePixels[sourceIndex++];
                destinationPixel = destinationPixels[destinationIndex];
                destinationWriteIndex = destinationIndex;
                destinationIndex++;
                destinationPixels[destinationWriteIndex] = ((sourcePixel & 16711935) * effectiveAlpha256 + (destinationPixel & 16711935) * inverseAlpha256 & -16711936) + ((sourcePixel & 65280) * effectiveAlpha256 + (destinationPixel & 65280) * inverseAlpha256 & 16711680) >>> 8;
            }
            destinationIndex = destinationIndex + destinationRowSkip;
            sourceIndex = sourceIndex + sourceRowSkip;
        }
    }

    final void drawScaledAlpha(int x, int y, int destinationWidth, int destinationHeight, int alpha256) {
        int sourceWidth = 0;
        int sourceHeight = 0;
        int sourceX16 = 0;
        int sourceY16 = 0;
        int canvasWidth = 0;
        int canvasHeight = 0;
        int stepX16 = 0;
        int stepY16 = 0;
        int destinationRowSkip = 0;
        int horizontalTrimSteps = 0;
        int topClipPixels = 0;
        int verticalTrimSteps;
        int destinationIndex;
        int rightClipPixels;
        int leftClipPixels;
        if (destinationWidth > 0) {
            if (destinationHeight <= 0) {
                return;
            }
            sourceWidth = this.width;
            sourceHeight = this.height;
            sourceX16 = 0;
            sourceY16 = 0;
            canvasWidth = this.fullWidth;
            canvasHeight = this.fullHeight;
            stepX16 = (canvasWidth << 16) / destinationWidth;
            stepY16 = (canvasHeight << 16) / destinationHeight;
            if (this.trimX > 0) {
                horizontalTrimSteps = ((this.trimX << 16) + stepX16 - 1) / stepX16;
                x = x + horizontalTrimSteps;
                sourceX16 = sourceX16 + (horizontalTrimSteps * stepX16 - (this.trimX << 16));
            }
            if (this.trimY > 0) {
                verticalTrimSteps = ((this.trimY << 16) + stepY16 - 1) / stepY16;
                y = y + verticalTrimSteps;
                sourceY16 = sourceY16 + (verticalTrimSteps * stepY16 - (this.trimY << 16));
            }
            if (sourceWidth < canvasWidth) {
                destinationWidth = ((sourceWidth << 16) - sourceX16 + stepX16 - 1) / stepX16;
            }
            if (sourceHeight < canvasHeight) {
                destinationHeight = ((sourceHeight << 16) - sourceY16 + stepY16 - 1) / stepY16;
            }
            destinationIndex = x + y * SoftwareRasterizer.stride;
            destinationRowSkip = SoftwareRasterizer.stride - destinationWidth;
            if (y + destinationHeight > SoftwareRasterizer.clipBottom) {
                destinationHeight = destinationHeight - (y + destinationHeight - SoftwareRasterizer.clipBottom);
            }
            if (y < SoftwareRasterizer.clipTop) {
                topClipPixels = SoftwareRasterizer.clipTop - y;
                destinationHeight = destinationHeight - topClipPixels;
                destinationIndex = destinationIndex + topClipPixels * SoftwareRasterizer.stride;
                sourceY16 = sourceY16 + stepY16 * topClipPixels;
            }
            if (x + destinationWidth > SoftwareRasterizer.clipRight) {
                rightClipPixels = x + destinationWidth - SoftwareRasterizer.clipRight;
                destinationWidth = destinationWidth - rightClipPixels;
                destinationRowSkip = destinationRowSkip + rightClipPixels;
            }
            if (x < SoftwareRasterizer.clipLeft) {
                leftClipPixels = SoftwareRasterizer.clipLeft - x;
                destinationWidth = destinationWidth - leftClipPixels;
                destinationIndex = destinationIndex + leftClipPixels;
                sourceX16 = sourceX16 + stepX16 * leftClipPixels;
                destinationRowSkip = destinationRowSkip + leftClipPixels;
            }
            ArgbSprite.blitArgbScaledAlpha(SoftwareRasterizer.framebuffer, this.pixels, 0, sourceX16, sourceY16, destinationIndex, destinationRowSkip, destinationWidth, destinationHeight, stepX16, stepY16, sourceWidth, alpha256);
            return;
        }
    }

    final void drawScaled(int x, int y, int destinationWidth, int destinationHeight) {
        int sourceWidth = 0;
        int sourceHeight = 0;
        int sourceX16 = 0;
        int sourceY16 = 0;
        int canvasWidth = 0;
        int canvasHeight = 0;
        int stepX16 = 0;
        int stepY16 = 0;
        int destinationRowSkip = 0;
        int horizontalTrimSteps = 0;
        int topClipPixels = 0;
        int verticalTrimSteps;
        int destinationIndex;
        int rightClipPixels;
        int leftClipPixels;
        if (destinationWidth > 0) {
            if (destinationHeight <= 0) {
                return;
            }
            sourceWidth = this.width;
            sourceHeight = this.height;
            sourceX16 = 0;
            sourceY16 = 0;
            canvasWidth = this.fullWidth;
            canvasHeight = this.fullHeight;
            stepX16 = (canvasWidth << 16) / destinationWidth;
            stepY16 = (canvasHeight << 16) / destinationHeight;
            if (this.trimX > 0) {
                horizontalTrimSteps = ((this.trimX << 16) + stepX16 - 1) / stepX16;
                x = x + horizontalTrimSteps;
                sourceX16 = sourceX16 + (horizontalTrimSteps * stepX16 - (this.trimX << 16));
            }
            if (this.trimY > 0) {
                verticalTrimSteps = ((this.trimY << 16) + stepY16 - 1) / stepY16;
                y = y + verticalTrimSteps;
                sourceY16 = sourceY16 + (verticalTrimSteps * stepY16 - (this.trimY << 16));
            }
            if (sourceWidth < canvasWidth) {
                destinationWidth = ((sourceWidth << 16) - sourceX16 + stepX16 - 1) / stepX16;
            }
            if (sourceHeight < canvasHeight) {
                destinationHeight = ((sourceHeight << 16) - sourceY16 + stepY16 - 1) / stepY16;
            }
            destinationIndex = x + y * SoftwareRasterizer.stride;
            destinationRowSkip = SoftwareRasterizer.stride - destinationWidth;
            if (y + destinationHeight > SoftwareRasterizer.clipBottom) {
                destinationHeight = destinationHeight - (y + destinationHeight - SoftwareRasterizer.clipBottom);
            }
            if (y < SoftwareRasterizer.clipTop) {
                topClipPixels = SoftwareRasterizer.clipTop - y;
                destinationHeight = destinationHeight - topClipPixels;
                destinationIndex = destinationIndex + topClipPixels * SoftwareRasterizer.stride;
                sourceY16 = sourceY16 + stepY16 * topClipPixels;
            }
            if (x + destinationWidth > SoftwareRasterizer.clipRight) {
                rightClipPixels = x + destinationWidth - SoftwareRasterizer.clipRight;
                destinationWidth = destinationWidth - rightClipPixels;
                destinationRowSkip = destinationRowSkip + rightClipPixels;
            }
            if (x < SoftwareRasterizer.clipLeft) {
                leftClipPixels = SoftwareRasterizer.clipLeft - x;
                destinationWidth = destinationWidth - leftClipPixels;
                destinationIndex = destinationIndex + leftClipPixels;
                sourceX16 = sourceX16 + stepX16 * leftClipPixels;
                destinationRowSkip = destinationRowSkip + leftClipPixels;
            }
            ArgbSprite.blitArgbScaled(SoftwareRasterizer.framebuffer, this.pixels, 0, sourceX16, sourceY16, destinationIndex, destinationRowSkip, destinationWidth, destinationHeight, stepX16, stepY16, sourceWidth);
            return;
        }
    }

    final void drawUnmasked(int x, int y) {
        int topClipPixels = 0;
        int leftClipPixels;
        int rightClipPixels;
        x = x + this.trimX;
        y = y + this.trimY;
        int destinationIndex = x + y * SoftwareRasterizer.stride;
        int sourceIndex = 0;
        int drawHeight = this.height;
        int drawWidth = this.width;
        int destinationRowSkip = SoftwareRasterizer.stride - drawWidth;
        int sourceRowSkip = 0;
        if (y < SoftwareRasterizer.clipTop) {
            topClipPixels = SoftwareRasterizer.clipTop - y;
            drawHeight = drawHeight - topClipPixels;
            y = SoftwareRasterizer.clipTop;
            sourceIndex = sourceIndex + topClipPixels * drawWidth;
            destinationIndex = destinationIndex + topClipPixels * SoftwareRasterizer.stride;
        }
        if (y + drawHeight > SoftwareRasterizer.clipBottom) {
            drawHeight = drawHeight - (y + drawHeight - SoftwareRasterizer.clipBottom);
        }
        if (x < SoftwareRasterizer.clipLeft) {
            leftClipPixels = SoftwareRasterizer.clipLeft - x;
            drawWidth = drawWidth - leftClipPixels;
            x = SoftwareRasterizer.clipLeft;
            sourceIndex = sourceIndex + leftClipPixels;
            destinationIndex = destinationIndex + leftClipPixels;
            sourceRowSkip = sourceRowSkip + leftClipPixels;
            destinationRowSkip = destinationRowSkip + leftClipPixels;
        }
        if (x + drawWidth > SoftwareRasterizer.clipRight) {
            rightClipPixels = x + drawWidth - SoftwareRasterizer.clipRight;
            drawWidth = drawWidth - rightClipPixels;
            sourceRowSkip = sourceRowSkip + rightClipPixels;
            destinationRowSkip = destinationRowSkip + rightClipPixels;
        }
        if (drawWidth > 0) {
            if (drawHeight <= 0) {
                return;
            }
            ArgbSprite.blitArgb(SoftwareRasterizer.framebuffer, this.pixels, 0, sourceIndex, destinationIndex, drawWidth, drawHeight, destinationRowSkip, sourceRowSkip);
            return;
        }
    }
}
