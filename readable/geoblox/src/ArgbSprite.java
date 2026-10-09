/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ArgbSprite extends Sprite {
    final void drawGrayTinted(int x, int y, int tintColor) {
        int clippedEdgePixels = 0;
        x = x + this.trimX;
        y = y + this.trimY;
        int destinationIndex = x + y * SoftwareRasterizer.stride;
        int sourceIndex = 0;
        int drawHeight = this.height;
        int drawWidth = this.width;
        int destinationRowSkip = SoftwareRasterizer.stride - drawWidth;
        int sourceRowSkip = 0;
        if (y < SoftwareRasterizer.clipTop) {
            clippedEdgePixels = SoftwareRasterizer.clipTop - y;
            drawHeight = drawHeight - clippedEdgePixels;
            y = SoftwareRasterizer.clipTop;
            sourceIndex = sourceIndex + clippedEdgePixels * drawWidth;
            destinationIndex = destinationIndex + clippedEdgePixels * SoftwareRasterizer.stride;
        }
        if (y + drawHeight > SoftwareRasterizer.clipBottom) {
            drawHeight = drawHeight - (y + drawHeight - SoftwareRasterizer.clipBottom);
        }
        if (x < SoftwareRasterizer.clipLeft) {
            clippedEdgePixels = SoftwareRasterizer.clipLeft - x;
            drawWidth = drawWidth - clippedEdgePixels;
            x = SoftwareRasterizer.clipLeft;
            sourceIndex = sourceIndex + clippedEdgePixels;
            destinationIndex = destinationIndex + clippedEdgePixels;
            sourceRowSkip = sourceRowSkip + clippedEdgePixels;
            destinationRowSkip = destinationRowSkip + clippedEdgePixels;
        }
        if (x + drawWidth > SoftwareRasterizer.clipRight) {
            clippedEdgePixels = x + drawWidth - SoftwareRasterizer.clipRight;
            drawWidth = drawWidth - clippedEdgePixels;
            sourceRowSkip = sourceRowSkip + clippedEdgePixels;
            destinationRowSkip = destinationRowSkip + clippedEdgePixels;
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
        int clippedEdgePixels = 0;
        x = x + this.trimX;
        y = y + this.trimY;
        int destinationIndex = x + y * SoftwareRasterizer.stride;
        int sourceIndex = 0;
        int drawHeight = this.height;
        int drawWidth = this.width;
        int destinationRowSkip = SoftwareRasterizer.stride - drawWidth;
        int sourceRowSkip = 0;
        if (y < SoftwareRasterizer.clipTop) {
            clippedEdgePixels = SoftwareRasterizer.clipTop - y;
            drawHeight = drawHeight - clippedEdgePixels;
            y = SoftwareRasterizer.clipTop;
            sourceIndex = sourceIndex + clippedEdgePixels * drawWidth;
            destinationIndex = destinationIndex + clippedEdgePixels * SoftwareRasterizer.stride;
        }
        if (y + drawHeight > SoftwareRasterizer.clipBottom) {
            drawHeight = drawHeight - (y + drawHeight - SoftwareRasterizer.clipBottom);
        }
        if (x < SoftwareRasterizer.clipLeft) {
            clippedEdgePixels = SoftwareRasterizer.clipLeft - x;
            drawWidth = drawWidth - clippedEdgePixels;
            x = SoftwareRasterizer.clipLeft;
            sourceIndex = sourceIndex + clippedEdgePixels;
            destinationIndex = destinationIndex + clippedEdgePixels;
            sourceRowSkip = sourceRowSkip + clippedEdgePixels;
            destinationRowSkip = destinationRowSkip + clippedEdgePixels;
        }
        if (x + drawWidth > SoftwareRasterizer.clipRight) {
            clippedEdgePixels = x + drawWidth - SoftwareRasterizer.clipRight;
            drawWidth = drawWidth - clippedEdgePixels;
            sourceRowSkip = sourceRowSkip + clippedEdgePixels;
            destinationRowSkip = destinationRowSkip + clippedEdgePixels;
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
        int clippedEdgePixels = 0;
        x = x + this.trimX;
        y = y + this.trimY;
        int destinationIndex = x + y * SoftwareRasterizer.stride;
        int sourceIndex = 0;
        int drawHeight = this.height;
        int drawWidth = this.width;
        int destinationRowSkip = SoftwareRasterizer.stride - drawWidth;
        int sourceRowSkip = 0;
        if (y < SoftwareRasterizer.clipTop) {
            clippedEdgePixels = SoftwareRasterizer.clipTop - y;
            drawHeight = drawHeight - clippedEdgePixels;
            y = SoftwareRasterizer.clipTop;
            sourceIndex = sourceIndex + clippedEdgePixels * drawWidth;
            destinationIndex = destinationIndex + clippedEdgePixels * SoftwareRasterizer.stride;
        }
        if (y + drawHeight > SoftwareRasterizer.clipBottom) {
            drawHeight = drawHeight - (y + drawHeight - SoftwareRasterizer.clipBottom);
        }
        if (x < SoftwareRasterizer.clipLeft) {
            clippedEdgePixels = SoftwareRasterizer.clipLeft - x;
            drawWidth = drawWidth - clippedEdgePixels;
            x = SoftwareRasterizer.clipLeft;
            sourceIndex = sourceIndex + clippedEdgePixels;
            destinationIndex = destinationIndex + clippedEdgePixels;
            sourceRowSkip = sourceRowSkip + clippedEdgePixels;
            destinationRowSkip = destinationRowSkip + clippedEdgePixels;
        }
        if (x + drawWidth > SoftwareRasterizer.clipRight) {
            clippedEdgePixels = x + drawWidth - SoftwareRasterizer.clipRight;
            drawWidth = drawWidth - clippedEdgePixels;
            sourceRowSkip = sourceRowSkip + clippedEdgePixels;
            destinationRowSkip = destinationRowSkip + clippedEdgePixels;
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
        int clipPixelCount;
        int negativeRowCounter;
        int destinationIndex;
        int sourceXQ12;
        int sourceYQ12;
        int negativePixelCounter;
        int sampledPixel;
        int destinationPixel;
        int storedAlpha;
        int inverseAlpha256;
        int clipPixelCountPhase2;
        int clipPixelCountPhase3;
        int clipPixelCountPhase4;
        int clipPixelCountPhase5;
        int negativeRowCounterPhase2;
        int negativeRowCounterPhase3;
        int negativeRowCounterPhase4;
        int negativeRowCounterPhase5;
        int destinationIndexPhase2;
        int destinationIndexPhase3;
        int destinationIndexPhase4;
        int destinationIndexPhase5;
        int sourceXQ12Phase2;
        int sourceXQ12Phase3;
        int sourceXQ12Phase4;
        int sourceXQ12Phase5;
        int sourceYQ12Phase2;
        int sourceYQ12Phase3;
        int sourceYQ12Phase4;
        int sourceYQ12Phase5;
        int negativePixelCounterPhase2;
        int negativePixelCounterPhase3;
        int negativePixelCounterPhase4;
        int negativePixelCounterPhase5;
        int sampledPixelPhase2;
        int sampledPixelPhase3;
        int sampledPixelPhase4;
        int sampledPixelPhase5;
        int destinationPixelPhase2;
        int destinationPixelPhase3;
        int destinationPixelPhase4;
        int destinationPixelPhase5;
        int storedAlphaPhase2;
        int storedAlphaPhase3;
        int storedAlphaPhase4;
        int storedAlphaPhase5;
        int inverseAlpha256Phase2;
        int inverseAlpha256Phase3;
        int inverseAlpha256Phase4;
        int inverseAlpha256Phase5;
        int clipPixelCountNestedPhase2;
        int negativeRowCounterNestedPhase2;
        int negativeRowCounterNestedPhase3;
        int destinationIndexNestedPhase2;
        int destinationIndexNestedPhase3;
        int sourceXQ12NestedPhase2;
        int sourceXQ12NestedPhase3;
        int sourceYQ12NestedPhase2;
        int sourceYQ12NestedPhase3;
        int negativePixelCounterNestedPhase2;
        int negativePixelCounterNestedPhase3;
        int sampledPixelNestedPhase2;
        int sampledPixelNestedPhase3;
        int destinationPixelNestedPhase2;
        int destinationPixelNestedPhase3;
        int storedAlphaNestedPhase2;
        int storedAlphaNestedPhase3;
        int inverseAlpha256NestedPhase2;
        int inverseAlpha256NestedPhase3;
        int clipPixelCountPhase2NestedPhase2;
        int clipPixelCountPhase2NestedPhase3;
        int clipPixelCountPhase3NestedPhase2;
        int clipPixelCountPhase4NestedPhase2;
        int clipPixelCountPhase4NestedPhase3;
        int clipPixelCountPhase4NestedPhase4;
        int clipPixelCountPhase5NestedPhase2;
        int clipPixelCountPhase5NestedPhase3;
        int clipPixelCountPhase5NestedPhase4;
        int negativeRowCounterPhase2NestedPhase2;
        int negativeRowCounterPhase2NestedPhase3;
        int destinationIndexPhase2NestedPhase2;
        int destinationIndexPhase2NestedPhase3;
        int sourceXQ12Phase2NestedPhase2;
        int sourceXQ12Phase2NestedPhase3;
        int sourceYQ12Phase2NestedPhase2;
        int sourceYQ12Phase2NestedPhase3;
        int negativePixelCounterPhase2NestedPhase2;
        int negativePixelCounterPhase2NestedPhase3;
        int sampledPixelPhase2NestedPhase2;
        int sampledPixelPhase2NestedPhase3;
        int destinationPixelPhase2NestedPhase2;
        int destinationPixelPhase2NestedPhase3;
        int storedAlphaPhase2NestedPhase2;
        int storedAlphaPhase2NestedPhase3;
        int inverseAlpha256Phase2NestedPhase2;
        int inverseAlpha256Phase2NestedPhase3;
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
            negativeRowCounter = bottomThenNegativeHeight;
            while (negativeRowCounter < 0) {
              destinationIndex = rowDestinationIndex;
              sourceXQ12 = rowSourceXQ12;
              sourceYQ12 = rowSourceYQ12;
              negativePixelCounter = rightThenNegativeWidth;
              if (sourceXQ12 >= 0 &&
                  sourceYQ12 >= 0 &&
                  sourceXQ12 - (this.width << 12) < 0 &&
                  sourceYQ12 - (this.height << 12) < 0) {
                while (negativePixelCounter < 0) {
                  sampledPixel = this.pixels[(sourceYQ12 >> 12) * this.width + (sourceXQ12 >> 12)];
                  destinationPixel = SoftwareRasterizer.framebuffer[destinationIndex];
                  storedAlpha = sampledPixel >>> 24;
                  inverseAlpha256 = 256 - storedAlpha;
                  writeIndexFixedXFixedY = destinationIndex;
                  destinationIndex++;
                  SoftwareRasterizer.framebuffer[writeIndexFixedXFixedY] = ((sampledPixel & 16711935) * storedAlpha + (destinationPixel & 16711935) * inverseAlpha256 & -16711936) + ((sampledPixel & 65280) * storedAlpha + (destinationPixel & 65280) * inverseAlpha256 & 16711680) >>> 8;
                  negativePixelCounter++;
                }
              }
              negativeRowCounter++;
              rowDestinationIndex = rowDestinationIndex + SoftwareRasterizer.stride;
            }
            return;
          }
          if (inverseSinStep >= 0) {
            negativeRowCounterNestedPhase2 = bottomThenNegativeHeight;
            while (negativeRowCounterNestedPhase2 < 0) {
              destinationIndexNestedPhase2 = rowDestinationIndex;
              sourceXQ12NestedPhase2 = rowSourceXQ12;
              sourceYQ12NestedPhase2 = rowSourceYQ12 + (destinationOffsetX * inverseSinStep >> 4);
              negativePixelCounterNestedPhase2 = rightThenNegativeWidth;
              if (sourceXQ12NestedPhase2 >= 0 &&
                  sourceXQ12NestedPhase2 - (this.width << 12) < 0) {
                if (sourceYQ12NestedPhase2 < 0) {
                  clipPixelCount = (inverseSinStep - 1 - sourceYQ12NestedPhase2) / inverseSinStep;
                  negativePixelCounterNestedPhase2 = negativePixelCounterNestedPhase2 + clipPixelCount;
                  sourceYQ12NestedPhase2 = sourceYQ12NestedPhase2 + inverseSinStep * clipPixelCount;
                  destinationIndexNestedPhase2 = destinationIndexNestedPhase2 + clipPixelCount;
                }
                clipPixelCount = (1 + sourceYQ12NestedPhase2 - (this.height << 12) - inverseSinStep) / inverseSinStep;
                if ((1 + sourceYQ12NestedPhase2 - (this.height << 12) - inverseSinStep) / inverseSinStep > negativePixelCounterNestedPhase2) {
                  negativePixelCounterNestedPhase2 = clipPixelCount;
                }
                while (negativePixelCounterNestedPhase2 < 0) {
                  sampledPixelNestedPhase2 = this.pixels[(sourceYQ12NestedPhase2 >> 12) * this.width + (sourceXQ12NestedPhase2 >> 12)];
                  destinationPixelNestedPhase2 = SoftwareRasterizer.framebuffer[destinationIndexNestedPhase2];
                  storedAlphaNestedPhase2 = sampledPixelNestedPhase2 >>> 24;
                  inverseAlpha256NestedPhase2 = 256 - storedAlphaNestedPhase2;
                  writeIndexFixedXForwardY = destinationIndexNestedPhase2;
                  destinationIndexNestedPhase2++;
                  SoftwareRasterizer.framebuffer[writeIndexFixedXForwardY] = ((sampledPixelNestedPhase2 & 16711935) * storedAlphaNestedPhase2 + (destinationPixelNestedPhase2 & 16711935) * inverseAlpha256NestedPhase2 & -16711936) + ((sampledPixelNestedPhase2 & 65280) * storedAlphaNestedPhase2 + (destinationPixelNestedPhase2 & 65280) * inverseAlpha256NestedPhase2 & 16711680) >>> 8;
                  sourceYQ12NestedPhase2 = sourceYQ12NestedPhase2 + inverseSinStep;
                  negativePixelCounterNestedPhase2++;
                }
              }
              negativeRowCounterNestedPhase2++;
              rowSourceXQ12 = rowSourceXQ12 - inverseSinStep;
              rowDestinationIndex = rowDestinationIndex + SoftwareRasterizer.stride;
            }
            return;
          }
          negativeRowCounterNestedPhase3 = bottomThenNegativeHeight;
          while (negativeRowCounterNestedPhase3 < 0) {
            destinationIndexNestedPhase3 = rowDestinationIndex;
            sourceXQ12NestedPhase3 = rowSourceXQ12;
            sourceYQ12NestedPhase3 = rowSourceYQ12 + (destinationOffsetX * inverseSinStep >> 4);
            negativePixelCounterNestedPhase3 = rightThenNegativeWidth;
            if (sourceXQ12NestedPhase3 >= 0 &&
                sourceXQ12NestedPhase3 - (this.width << 12) < 0) {
              clipPixelCountNestedPhase2 = sourceYQ12NestedPhase3 - (this.height << 12);
              if (sourceYQ12NestedPhase3 - (this.height << 12) >= 0) {
                clipPixelCountNestedPhase2 = (inverseSinStep - clipPixelCountNestedPhase2) / inverseSinStep;
                negativePixelCounterNestedPhase3 = negativePixelCounterNestedPhase3 + clipPixelCountNestedPhase2;
                sourceYQ12NestedPhase3 = sourceYQ12NestedPhase3 + inverseSinStep * clipPixelCountNestedPhase2;
                destinationIndexNestedPhase3 = destinationIndexNestedPhase3 + clipPixelCountNestedPhase2;
              }
              clipPixelCountNestedPhase2 = (sourceYQ12NestedPhase3 - inverseSinStep) / inverseSinStep;
              if ((sourceYQ12NestedPhase3 - inverseSinStep) / inverseSinStep > negativePixelCounterNestedPhase3) {
                negativePixelCounterNestedPhase3 = clipPixelCountNestedPhase2;
              }
              while (negativePixelCounterNestedPhase3 < 0) {
                sampledPixelNestedPhase3 = this.pixels[(sourceYQ12NestedPhase3 >> 12) * this.width + (sourceXQ12NestedPhase3 >> 12)];
                destinationPixelNestedPhase3 = SoftwareRasterizer.framebuffer[destinationIndexNestedPhase3];
                storedAlphaNestedPhase3 = sampledPixelNestedPhase3 >>> 24;
                inverseAlpha256NestedPhase3 = 256 - storedAlphaNestedPhase3;
                writeIndexFixedXReverseY = destinationIndexNestedPhase3;
                destinationIndexNestedPhase3++;
                SoftwareRasterizer.framebuffer[writeIndexFixedXReverseY] = ((sampledPixelNestedPhase3 & 16711935) * storedAlphaNestedPhase3 + (destinationPixelNestedPhase3 & 16711935) * inverseAlpha256NestedPhase3 & -16711936) + ((sampledPixelNestedPhase3 & 65280) * storedAlphaNestedPhase3 + (destinationPixelNestedPhase3 & 65280) * inverseAlpha256NestedPhase3 & 16711680) >>> 8;
                sourceYQ12NestedPhase3 = sourceYQ12NestedPhase3 + inverseSinStep;
                negativePixelCounterNestedPhase3++;
              }
            }
            negativeRowCounterNestedPhase3++;
            rowSourceXQ12 = rowSourceXQ12 - inverseSinStep;
            rowDestinationIndex = rowDestinationIndex + SoftwareRasterizer.stride;
          }
          return;
        }
        if (inverseCosStep >= 0) {
          if (inverseSinStep == 0) {
            negativeRowCounterPhase2 = bottomThenNegativeHeight;
            while (negativeRowCounterPhase2 < 0) {
              destinationIndexPhase2 = rowDestinationIndex;
              sourceXQ12Phase2 = rowSourceXQ12 + (destinationOffsetX * inverseCosStep >> 4);
              sourceYQ12Phase2 = rowSourceYQ12;
              negativePixelCounterPhase2 = rightThenNegativeWidth;
              if (sourceYQ12Phase2 >= 0 &&
                  sourceYQ12Phase2 - (this.height << 12) < 0) {
                if (sourceXQ12Phase2 < 0) {
                  clipPixelCountPhase2 = (inverseCosStep - 1 - sourceXQ12Phase2) / inverseCosStep;
                  negativePixelCounterPhase2 = negativePixelCounterPhase2 + clipPixelCountPhase2;
                  sourceXQ12Phase2 = sourceXQ12Phase2 + inverseCosStep * clipPixelCountPhase2;
                  destinationIndexPhase2 = destinationIndexPhase2 + clipPixelCountPhase2;
                }
                clipPixelCountPhase2 = (1 + sourceXQ12Phase2 - (this.width << 12) - inverseCosStep) / inverseCosStep;
                if ((1 + sourceXQ12Phase2 - (this.width << 12) - inverseCosStep) / inverseCosStep > negativePixelCounterPhase2) {
                  negativePixelCounterPhase2 = clipPixelCountPhase2;
                }
                while (negativePixelCounterPhase2 < 0) {
                  sampledPixelPhase2 = this.pixels[(sourceYQ12Phase2 >> 12) * this.width + (sourceXQ12Phase2 >> 12)];
                  destinationPixelPhase2 = SoftwareRasterizer.framebuffer[destinationIndexPhase2];
                  storedAlphaPhase2 = sampledPixelPhase2 >>> 24;
                  inverseAlpha256Phase2 = 256 - storedAlphaPhase2;
                  writeIndexForwardXFixedY = destinationIndexPhase2;
                  destinationIndexPhase2++;
                  SoftwareRasterizer.framebuffer[writeIndexForwardXFixedY] = ((sampledPixelPhase2 & 16711935) * storedAlphaPhase2 + (destinationPixelPhase2 & 16711935) * inverseAlpha256Phase2 & -16711936) + ((sampledPixelPhase2 & 65280) * storedAlphaPhase2 + (destinationPixelPhase2 & 65280) * inverseAlpha256Phase2 & 16711680) >>> 8;
                  sourceXQ12Phase2 = sourceXQ12Phase2 + inverseCosStep;
                  negativePixelCounterPhase2++;
                }
              }
              negativeRowCounterPhase2++;
              rowSourceYQ12 = rowSourceYQ12 + inverseCosStep;
              rowDestinationIndex = rowDestinationIndex + SoftwareRasterizer.stride;
            }
            return;
          }
          if (inverseSinStep >= 0) {
            negativeRowCounterPhase2NestedPhase2 = bottomThenNegativeHeight;
            while (negativeRowCounterPhase2NestedPhase2 < 0) {
              destinationIndexPhase2NestedPhase2 = rowDestinationIndex;
              sourceXQ12Phase2NestedPhase2 = rowSourceXQ12 + (destinationOffsetX * inverseCosStep >> 4);
              sourceYQ12Phase2NestedPhase2 = rowSourceYQ12 + (destinationOffsetX * inverseSinStep >> 4);
              negativePixelCounterPhase2NestedPhase2 = rightThenNegativeWidth;
              if (sourceXQ12Phase2NestedPhase2 < 0) {
                clipPixelCountPhase2NestedPhase2 = (inverseCosStep - 1 - sourceXQ12Phase2NestedPhase2) / inverseCosStep;
                negativePixelCounterPhase2NestedPhase2 = negativePixelCounterPhase2NestedPhase2 + clipPixelCountPhase2NestedPhase2;
                sourceXQ12Phase2NestedPhase2 = sourceXQ12Phase2NestedPhase2 + inverseCosStep * clipPixelCountPhase2NestedPhase2;
                sourceYQ12Phase2NestedPhase2 = sourceYQ12Phase2NestedPhase2 + inverseSinStep * clipPixelCountPhase2NestedPhase2;
                destinationIndexPhase2NestedPhase2 = destinationIndexPhase2NestedPhase2 + clipPixelCountPhase2NestedPhase2;
              }
              clipPixelCountPhase2NestedPhase2 = (1 + sourceXQ12Phase2NestedPhase2 - (this.width << 12) - inverseCosStep) / inverseCosStep;
              if ((1 + sourceXQ12Phase2NestedPhase2 - (this.width << 12) - inverseCosStep) / inverseCosStep > negativePixelCounterPhase2NestedPhase2) {
                negativePixelCounterPhase2NestedPhase2 = clipPixelCountPhase2NestedPhase2;
              }
              if (sourceYQ12Phase2NestedPhase2 < 0) {
                clipPixelCountPhase2NestedPhase2 = (inverseSinStep - 1 - sourceYQ12Phase2NestedPhase2) / inverseSinStep;
                negativePixelCounterPhase2NestedPhase2 = negativePixelCounterPhase2NestedPhase2 + clipPixelCountPhase2NestedPhase2;
                sourceXQ12Phase2NestedPhase2 = sourceXQ12Phase2NestedPhase2 + inverseCosStep * clipPixelCountPhase2NestedPhase2;
                sourceYQ12Phase2NestedPhase2 = sourceYQ12Phase2NestedPhase2 + inverseSinStep * clipPixelCountPhase2NestedPhase2;
                destinationIndexPhase2NestedPhase2 = destinationIndexPhase2NestedPhase2 + clipPixelCountPhase2NestedPhase2;
              }
              clipPixelCountPhase2NestedPhase2 = (1 + sourceYQ12Phase2NestedPhase2 - (this.height << 12) - inverseSinStep) / inverseSinStep;
              if ((1 + sourceYQ12Phase2NestedPhase2 - (this.height << 12) - inverseSinStep) / inverseSinStep > negativePixelCounterPhase2NestedPhase2) {
                negativePixelCounterPhase2NestedPhase2 = clipPixelCountPhase2NestedPhase2;
              }
              while (negativePixelCounterPhase2NestedPhase2 < 0) {
                sampledPixelPhase2NestedPhase2 = this.pixels[(sourceYQ12Phase2NestedPhase2 >> 12) * this.width + (sourceXQ12Phase2NestedPhase2 >> 12)];
                destinationPixelPhase2NestedPhase2 = SoftwareRasterizer.framebuffer[destinationIndexPhase2NestedPhase2];
                storedAlphaPhase2NestedPhase2 = sampledPixelPhase2NestedPhase2 >>> 24;
                inverseAlpha256Phase2NestedPhase2 = 256 - storedAlphaPhase2NestedPhase2;
                writeIndexForwardXForwardY = destinationIndexPhase2NestedPhase2;
                destinationIndexPhase2NestedPhase2++;
                SoftwareRasterizer.framebuffer[writeIndexForwardXForwardY] = ((sampledPixelPhase2NestedPhase2 & 16711935) * storedAlphaPhase2NestedPhase2 + (destinationPixelPhase2NestedPhase2 & 16711935) * inverseAlpha256Phase2NestedPhase2 & -16711936) + ((sampledPixelPhase2NestedPhase2 & 65280) * storedAlphaPhase2NestedPhase2 + (destinationPixelPhase2NestedPhase2 & 65280) * inverseAlpha256Phase2NestedPhase2 & 16711680) >>> 8;
                sourceXQ12Phase2NestedPhase2 = sourceXQ12Phase2NestedPhase2 + inverseCosStep;
                sourceYQ12Phase2NestedPhase2 = sourceYQ12Phase2NestedPhase2 + inverseSinStep;
                negativePixelCounterPhase2NestedPhase2++;
              }
              negativeRowCounterPhase2NestedPhase2++;
              rowSourceXQ12 = rowSourceXQ12 - inverseSinStep;
              rowSourceYQ12 = rowSourceYQ12 + inverseCosStep;
              rowDestinationIndex = rowDestinationIndex + SoftwareRasterizer.stride;
            }
            return;
          }
          negativeRowCounterPhase2NestedPhase3 = bottomThenNegativeHeight;
          while (negativeRowCounterPhase2NestedPhase3 < 0) {
            destinationIndexPhase2NestedPhase3 = rowDestinationIndex;
            sourceXQ12Phase2NestedPhase3 = rowSourceXQ12 + (destinationOffsetX * inverseCosStep >> 4);
            sourceYQ12Phase2NestedPhase3 = rowSourceYQ12 + (destinationOffsetX * inverseSinStep >> 4);
            negativePixelCounterPhase2NestedPhase3 = rightThenNegativeWidth;
            if (sourceXQ12Phase2NestedPhase3 < 0) {
              clipPixelCountPhase2NestedPhase3 = (inverseCosStep - 1 - sourceXQ12Phase2NestedPhase3) / inverseCosStep;
              negativePixelCounterPhase2NestedPhase3 = negativePixelCounterPhase2NestedPhase3 + clipPixelCountPhase2NestedPhase3;
              sourceXQ12Phase2NestedPhase3 = sourceXQ12Phase2NestedPhase3 + inverseCosStep * clipPixelCountPhase2NestedPhase3;
              sourceYQ12Phase2NestedPhase3 = sourceYQ12Phase2NestedPhase3 + inverseSinStep * clipPixelCountPhase2NestedPhase3;
              destinationIndexPhase2NestedPhase3 = destinationIndexPhase2NestedPhase3 + clipPixelCountPhase2NestedPhase3;
            }
            clipPixelCountPhase2NestedPhase3 = (1 + sourceXQ12Phase2NestedPhase3 - (this.width << 12) - inverseCosStep) / inverseCosStep;
            if ((1 + sourceXQ12Phase2NestedPhase3 - (this.width << 12) - inverseCosStep) / inverseCosStep > negativePixelCounterPhase2NestedPhase3) {
              negativePixelCounterPhase2NestedPhase3 = clipPixelCountPhase2NestedPhase3;
            }
            clipPixelCountPhase2NestedPhase3 = sourceYQ12Phase2NestedPhase3 - (this.height << 12);
            if (sourceYQ12Phase2NestedPhase3 - (this.height << 12) >= 0) {
              clipPixelCountPhase2NestedPhase3 = (inverseSinStep - clipPixelCountPhase2NestedPhase3) / inverseSinStep;
              negativePixelCounterPhase2NestedPhase3 = negativePixelCounterPhase2NestedPhase3 + clipPixelCountPhase2NestedPhase3;
              sourceXQ12Phase2NestedPhase3 = sourceXQ12Phase2NestedPhase3 + inverseCosStep * clipPixelCountPhase2NestedPhase3;
              sourceYQ12Phase2NestedPhase3 = sourceYQ12Phase2NestedPhase3 + inverseSinStep * clipPixelCountPhase2NestedPhase3;
              destinationIndexPhase2NestedPhase3 = destinationIndexPhase2NestedPhase3 + clipPixelCountPhase2NestedPhase3;
            }
            clipPixelCountPhase2NestedPhase3 = (sourceYQ12Phase2NestedPhase3 - inverseSinStep) / inverseSinStep;
            if ((sourceYQ12Phase2NestedPhase3 - inverseSinStep) / inverseSinStep > negativePixelCounterPhase2NestedPhase3) {
              negativePixelCounterPhase2NestedPhase3 = clipPixelCountPhase2NestedPhase3;
            }
            while (negativePixelCounterPhase2NestedPhase3 < 0) {
              sampledPixelPhase2NestedPhase3 = this.pixels[(sourceYQ12Phase2NestedPhase3 >> 12) * this.width + (sourceXQ12Phase2NestedPhase3 >> 12)];
              destinationPixelPhase2NestedPhase3 = SoftwareRasterizer.framebuffer[destinationIndexPhase2NestedPhase3];
              storedAlphaPhase2NestedPhase3 = sampledPixelPhase2NestedPhase3 >>> 24;
              inverseAlpha256Phase2NestedPhase3 = 256 - storedAlphaPhase2NestedPhase3;
              writeIndexForwardXReverseY = destinationIndexPhase2NestedPhase3;
              destinationIndexPhase2NestedPhase3++;
              SoftwareRasterizer.framebuffer[writeIndexForwardXReverseY] = ((sampledPixelPhase2NestedPhase3 & 16711935) * storedAlphaPhase2NestedPhase3 + (destinationPixelPhase2NestedPhase3 & 16711935) * inverseAlpha256Phase2NestedPhase3 & -16711936) + ((sampledPixelPhase2NestedPhase3 & 65280) * storedAlphaPhase2NestedPhase3 + (destinationPixelPhase2NestedPhase3 & 65280) * inverseAlpha256Phase2NestedPhase3 & 16711680) >>> 8;
              sourceXQ12Phase2NestedPhase3 = sourceXQ12Phase2NestedPhase3 + inverseCosStep;
              sourceYQ12Phase2NestedPhase3 = sourceYQ12Phase2NestedPhase3 + inverseSinStep;
              negativePixelCounterPhase2NestedPhase3++;
            }
            negativeRowCounterPhase2NestedPhase3++;
            rowSourceXQ12 = rowSourceXQ12 - inverseSinStep;
            rowSourceYQ12 = rowSourceYQ12 + inverseCosStep;
            rowDestinationIndex = rowDestinationIndex + SoftwareRasterizer.stride;
          }
          return;
        }
        if (inverseSinStep == 0) {
          negativeRowCounterPhase3 = bottomThenNegativeHeight;
          while (negativeRowCounterPhase3 < 0) {
            destinationIndexPhase3 = rowDestinationIndex;
            sourceXQ12Phase3 = rowSourceXQ12 + (destinationOffsetX * inverseCosStep >> 4);
            sourceYQ12Phase3 = rowSourceYQ12;
            negativePixelCounterPhase3 = rightThenNegativeWidth;
            if (sourceYQ12Phase3 >= 0 &&
                sourceYQ12Phase3 - (this.height << 12) < 0) {
              clipPixelCountPhase3 = sourceXQ12Phase3 - (this.width << 12);
              if (sourceXQ12Phase3 - (this.width << 12) >= 0) {
                clipPixelCountPhase3 = (inverseCosStep - clipPixelCountPhase3) / inverseCosStep;
                negativePixelCounterPhase3 = negativePixelCounterPhase3 + clipPixelCountPhase3;
                sourceXQ12Phase3 = sourceXQ12Phase3 + inverseCosStep * clipPixelCountPhase3;
                destinationIndexPhase3 = destinationIndexPhase3 + clipPixelCountPhase3;
              }
              clipPixelCountPhase3NestedPhase2 = (sourceXQ12Phase3 - inverseCosStep) / inverseCosStep;
              if ((sourceXQ12Phase3 - inverseCosStep) / inverseCosStep > negativePixelCounterPhase3) {
                negativePixelCounterPhase3 = clipPixelCountPhase3NestedPhase2;
              }
              while (negativePixelCounterPhase3 < 0) {
                sampledPixelPhase3 = this.pixels[(sourceYQ12Phase3 >> 12) * this.width + (sourceXQ12Phase3 >> 12)];
                destinationPixelPhase3 = SoftwareRasterizer.framebuffer[destinationIndexPhase3];
                storedAlphaPhase3 = sampledPixelPhase3 >>> 24;
                inverseAlpha256Phase3 = 256 - storedAlphaPhase3;
                writeIndexReverseXFixedY = destinationIndexPhase3;
                destinationIndexPhase3++;
                SoftwareRasterizer.framebuffer[writeIndexReverseXFixedY] = ((sampledPixelPhase3 & 16711935) * storedAlphaPhase3 + (destinationPixelPhase3 & 16711935) * inverseAlpha256Phase3 & -16711936) + ((sampledPixelPhase3 & 65280) * storedAlphaPhase3 + (destinationPixelPhase3 & 65280) * inverseAlpha256Phase3 & 16711680) >>> 8;
                sourceXQ12Phase3 = sourceXQ12Phase3 + inverseCosStep;
                negativePixelCounterPhase3++;
              }
            }
            negativeRowCounterPhase3++;
            rowSourceYQ12 = rowSourceYQ12 + inverseCosStep;
            rowDestinationIndex = rowDestinationIndex + SoftwareRasterizer.stride;
          }
          return;
        }
        if (inverseSinStep >= 0) {
          negativeRowCounterPhase4 = bottomThenNegativeHeight;
          while (negativeRowCounterPhase4 < 0) {
            destinationIndexPhase4 = rowDestinationIndex;
            sourceXQ12Phase4 = rowSourceXQ12 + (destinationOffsetX * inverseCosStep >> 4);
            sourceYQ12Phase4 = rowSourceYQ12 + (destinationOffsetX * inverseSinStep >> 4);
            negativePixelCounterPhase4 = rightThenNegativeWidth;
            clipPixelCountPhase4 = sourceXQ12Phase4 - (this.width << 12);
            if (sourceXQ12Phase4 - (this.width << 12) >= 0) {
              clipPixelCountPhase4 = (inverseCosStep - clipPixelCountPhase4) / inverseCosStep;
              negativePixelCounterPhase4 = negativePixelCounterPhase4 + clipPixelCountPhase4;
              sourceXQ12Phase4 = sourceXQ12Phase4 + inverseCosStep * clipPixelCountPhase4;
              sourceYQ12Phase4 = sourceYQ12Phase4 + inverseSinStep * clipPixelCountPhase4;
              destinationIndexPhase4 = destinationIndexPhase4 + clipPixelCountPhase4;
            }
            clipPixelCountPhase4NestedPhase2 = (sourceXQ12Phase4 - inverseCosStep) / inverseCosStep;
            if ((sourceXQ12Phase4 - inverseCosStep) / inverseCosStep > negativePixelCounterPhase4) {
              negativePixelCounterPhase4 = clipPixelCountPhase4NestedPhase2;
            }
            if (sourceYQ12Phase4 < 0) {
              clipPixelCountPhase4NestedPhase3 = (inverseSinStep - 1 - sourceYQ12Phase4) / inverseSinStep;
              negativePixelCounterPhase4 = negativePixelCounterPhase4 + clipPixelCountPhase4NestedPhase3;
              sourceXQ12Phase4 = sourceXQ12Phase4 + inverseCosStep * clipPixelCountPhase4NestedPhase3;
              sourceYQ12Phase4 = sourceYQ12Phase4 + inverseSinStep * clipPixelCountPhase4NestedPhase3;
              destinationIndexPhase4 = destinationIndexPhase4 + clipPixelCountPhase4NestedPhase3;
            }
            clipPixelCountPhase4NestedPhase4 = (1 + sourceYQ12Phase4 - (this.height << 12) - inverseSinStep) / inverseSinStep;
            if ((1 + sourceYQ12Phase4 - (this.height << 12) - inverseSinStep) / inverseSinStep > negativePixelCounterPhase4) {
              negativePixelCounterPhase4 = clipPixelCountPhase4NestedPhase4;
            }
            while (negativePixelCounterPhase4 < 0) {
              sampledPixelPhase4 = this.pixels[(sourceYQ12Phase4 >> 12) * this.width + (sourceXQ12Phase4 >> 12)];
              destinationPixelPhase4 = SoftwareRasterizer.framebuffer[destinationIndexPhase4];
              storedAlphaPhase4 = sampledPixelPhase4 >>> 24;
              inverseAlpha256Phase4 = 256 - storedAlphaPhase4;
              writeIndexReverseXForwardY = destinationIndexPhase4;
              destinationIndexPhase4++;
              SoftwareRasterizer.framebuffer[writeIndexReverseXForwardY] = ((sampledPixelPhase4 & 16711935) * storedAlphaPhase4 + (destinationPixelPhase4 & 16711935) * inverseAlpha256Phase4 & -16711936) + ((sampledPixelPhase4 & 65280) * storedAlphaPhase4 + (destinationPixelPhase4 & 65280) * inverseAlpha256Phase4 & 16711680) >>> 8;
              sourceXQ12Phase4 = sourceXQ12Phase4 + inverseCosStep;
              sourceYQ12Phase4 = sourceYQ12Phase4 + inverseSinStep;
              negativePixelCounterPhase4++;
            }
            negativeRowCounterPhase4++;
            rowSourceXQ12 = rowSourceXQ12 - inverseSinStep;
            rowSourceYQ12 = rowSourceYQ12 + inverseCosStep;
            rowDestinationIndex = rowDestinationIndex + SoftwareRasterizer.stride;
          }
          return;
        }
        negativeRowCounterPhase5 = bottomThenNegativeHeight;
        while (negativeRowCounterPhase5 < 0) {
          destinationIndexPhase5 = rowDestinationIndex;
          sourceXQ12Phase5 = rowSourceXQ12 + (destinationOffsetX * inverseCosStep >> 4);
          sourceYQ12Phase5 = rowSourceYQ12 + (destinationOffsetX * inverseSinStep >> 4);
          negativePixelCounterPhase5 = rightThenNegativeWidth;
          clipPixelCountPhase5 = sourceXQ12Phase5 - (this.width << 12);
          if (sourceXQ12Phase5 - (this.width << 12) >= 0) {
            clipPixelCountPhase5 = (inverseCosStep - clipPixelCountPhase5) / inverseCosStep;
            negativePixelCounterPhase5 = negativePixelCounterPhase5 + clipPixelCountPhase5;
            sourceXQ12Phase5 = sourceXQ12Phase5 + inverseCosStep * clipPixelCountPhase5;
            sourceYQ12Phase5 = sourceYQ12Phase5 + inverseSinStep * clipPixelCountPhase5;
            destinationIndexPhase5 = destinationIndexPhase5 + clipPixelCountPhase5;
          }
          clipPixelCountPhase5NestedPhase2 = (sourceXQ12Phase5 - inverseCosStep) / inverseCosStep;
          if ((sourceXQ12Phase5 - inverseCosStep) / inverseCosStep > negativePixelCounterPhase5) {
            negativePixelCounterPhase5 = clipPixelCountPhase5NestedPhase2;
          }
          clipPixelCountPhase5NestedPhase3 = sourceYQ12Phase5 - (this.height << 12);
          if (sourceYQ12Phase5 - (this.height << 12) >= 0) {
            clipPixelCountPhase5NestedPhase3 = (inverseSinStep - clipPixelCountPhase5NestedPhase3) / inverseSinStep;
            negativePixelCounterPhase5 = negativePixelCounterPhase5 + clipPixelCountPhase5NestedPhase3;
            sourceXQ12Phase5 = sourceXQ12Phase5 + inverseCosStep * clipPixelCountPhase5NestedPhase3;
            sourceYQ12Phase5 = sourceYQ12Phase5 + inverseSinStep * clipPixelCountPhase5NestedPhase3;
            destinationIndexPhase5 = destinationIndexPhase5 + clipPixelCountPhase5NestedPhase3;
          }
          clipPixelCountPhase5NestedPhase4 = (sourceYQ12Phase5 - inverseSinStep) / inverseSinStep;
          if ((sourceYQ12Phase5 - inverseSinStep) / inverseSinStep > negativePixelCounterPhase5) {
            negativePixelCounterPhase5 = clipPixelCountPhase5NestedPhase4;
          }
          while (negativePixelCounterPhase5 < 0) {
            sampledPixelPhase5 = this.pixels[(sourceYQ12Phase5 >> 12) * this.width + (sourceXQ12Phase5 >> 12)];
            destinationPixelPhase5 = SoftwareRasterizer.framebuffer[destinationIndexPhase5];
            storedAlphaPhase5 = sampledPixelPhase5 >>> 24;
            inverseAlpha256Phase5 = 256 - storedAlphaPhase5;
            writeIndexReverseXReverseY = destinationIndexPhase5;
            destinationIndexPhase5++;
            SoftwareRasterizer.framebuffer[writeIndexReverseXReverseY] = ((sampledPixelPhase5 & 16711935) * storedAlphaPhase5 + (destinationPixelPhase5 & 16711935) * inverseAlpha256Phase5 & -16711936) + ((sampledPixelPhase5 & 65280) * storedAlphaPhase5 + (destinationPixelPhase5 & 65280) * inverseAlpha256Phase5 & 16711680) >>> 8;
            sourceXQ12Phase5 = sourceXQ12Phase5 + inverseCosStep;
            sourceYQ12Phase5 = sourceYQ12Phase5 + inverseSinStep;
            negativePixelCounterPhase5++;
          }
          negativeRowCounterPhase5++;
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
          while (true) {
            if (negativeColumnScratch >= 0) {
              destinationIndex = destinationIndex + destinationRowSkip;
              sourceIndex = sourceIndex + sourceRowSkip;
              negativeRowScratch++;
              break;
            }
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
        int samplePixelNestedPhase2;
        int sampleAlphaNestedPhase2;
        int sampleIndexThenAverageAlphaNestedPhase2;
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
              samplePixelNestedPhase2 = samplePixelBuffer[sampleBaseIndex + sampleRowOffset];
              sampleAlphaNestedPhase2 = samplePixelNestedPhase2 >>> 24;
              alphaSum = alphaSum + sampleAlphaNestedPhase2;
              weightedRedThenRedBlue = weightedRedThenRedBlue + sampleAlphaNestedPhase2 * (samplePixelNestedPhase2 >> 16 & 255);
              weightedGreenThenPackedGreen = weightedGreenThenPackedGreen + sampleAlphaNestedPhase2 * (samplePixelNestedPhase2 >> 8 & 255);
              weightedBlue = weightedBlue + sampleAlphaNestedPhase2 * (samplePixelNestedPhase2 & 255);
            }
            if (alphaSum == 0) {
              sourceBlockX += 2;
              destinationIndex++;
              sourceIndex += 2;
              continue;
            }
            weightedRedThenRedBlue = (weightedRedThenRedBlue / alphaSum << 16) + weightedBlue / alphaSum;
            weightedGreenThenPackedGreen = weightedGreenThenPackedGreen / alphaSum << 8;
            sampleIndexThenAverageAlphaNestedPhase2 = alphaSum >> 2;
            inverseAlpha256 = 256 - sampleIndexThenAverageAlphaNestedPhase2;
            destinationPixel = SoftwareRasterizer.framebuffer[destinationIndex];
            SoftwareRasterizer.framebuffer[destinationIndex] = (sampleIndexThenAverageAlphaNestedPhase2 * weightedRedThenRedBlue + inverseAlpha256 * (destinationPixel & 16711935) & -16711936) + (sampleIndexThenAverageAlphaNestedPhase2 * weightedGreenThenPackedGreen + inverseAlpha256 * (destinationPixel & 65280) & 16711680) >>> 8;
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
        int sampleRowThenAlphaNestedPhase2;
        int sampleRowThenAlphaNestedPhase3;
        int sampleColumnThenAlphaSumNestedPhase2;
        int sampleIndexThenAverageAlphaNestedPhase2;
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
            sampleRowThenAlphaNestedPhase2 = 0;
            sampleColumnThenAlphaSumNestedPhase2 = 0;
            weightedRedThenRedBlue = 0;
            weightedGreenThenPackedGreen = 0;
            weightedBlue = 0;
            for (sampleIndexThenAverageAlpha = 0; sampleIndexThenAverageAlpha < 16; sampleIndexThenAverageAlpha++) {
              sampleRowThenAlphaNestedPhase3 = sampleBlockReadAlias[sampleIndexThenAverageAlpha] >>> 24;
              sampleColumnThenAlphaSumNestedPhase2 = sampleColumnThenAlphaSumNestedPhase2 + sampleRowThenAlphaNestedPhase3;
              weightedRedThenRedBlue = weightedRedThenRedBlue + sampleRowThenAlphaNestedPhase3 * (sampleBlockReadAlias[sampleIndexThenAverageAlpha] >> 16 & 255);
              weightedGreenThenPackedGreen = weightedGreenThenPackedGreen + sampleRowThenAlphaNestedPhase3 * (sampleBlockReadAlias[sampleIndexThenAverageAlpha] >> 8 & 255);
              weightedBlue = weightedBlue + sampleRowThenAlphaNestedPhase3 * (sampleBlockReadAlias[sampleIndexThenAverageAlpha] & 255);
            }
            if (sampleColumnThenAlphaSumNestedPhase2 == 0) {
              sourceBlockX += 4;
              continue;
            }
            weightedRedThenRedBlue = (weightedRedThenRedBlue / sampleColumnThenAlphaSumNestedPhase2 << 16) + weightedBlue / sampleColumnThenAlphaSumNestedPhase2;
            weightedGreenThenPackedGreen = weightedGreenThenPackedGreen / sampleColumnThenAlphaSumNestedPhase2 << 8;
            sampleIndexThenAverageAlphaNestedPhase2 = sampleColumnThenAlphaSumNestedPhase2 >> 4;
            inverseAlpha256 = 256 - sampleIndexThenAverageAlphaNestedPhase2;
            destinationPixel = SoftwareRasterizer.framebuffer[destinationIndex];
            SoftwareRasterizer.framebuffer[destinationIndex] = (sampleIndexThenAverageAlphaNestedPhase2 * weightedRedThenRedBlue + inverseAlpha256 * (destinationPixel & 16711935) & -16711936) + (sampleIndexThenAverageAlphaNestedPhase2 * weightedGreenThenPackedGreen + inverseAlpha256 * (destinationPixel & 65280) & 16711680) >>> 8;
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
        int modulatedPixelNestedPhase2;
        tintRedBlue = tintColor & 16711935;
        tintGreen = tintColor >> 8 & 255;
        negativeRowScratch = -drawHeight;
        while (true) {
          if (negativeRowScratch >= 0) {
            return;
          }
          negativeColumnScratch = -drawWidth;
          while (true) {
            if (negativeColumnScratch >= 0) {
              destinationIndex = destinationIndex + destinationRowSkip;
              sourceIndex = sourceIndex + sourceRowSkip;
              negativeRowScratch++;
              break;
            }
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
              modulatedPixelNestedPhase2 = sourcePixel;
            } else {
              sourcePixel = sourcePixel & 255;
              modulatedPixelNestedPhase2 = (sourcePixel * tintRedBlue >> 8 & 16711934) + (sourcePixel * tintGreen & 65280) + 1;
            }
            inverseAlpha256 = 256 - storedAlpha;
            destinationPixel = destinationPixels[destinationIndex];
            destinationWriteIndex = destinationIndex;
            destinationIndex++;
            destinationPixels[destinationWriteIndex] = ((modulatedPixelNestedPhase2 & 16711935) * storedAlpha + (destinationPixel & 16711935) * inverseAlpha256 & -16711936) + ((modulatedPixelNestedPhase2 & 65280) * storedAlpha + (destinationPixel & 65280) * inverseAlpha256 & 16711680) >>> 8;
            negativeColumnScratch++;
          }
        }
    }

    final void drawAdditive(int x, int y, int intensity256) {
        int clippedEdgePixels = 0;
        x = x + this.trimX;
        y = y + this.trimY;
        int destinationIndex = x + y * SoftwareRasterizer.stride;
        int sourceIndex = 0;
        int drawHeight = this.height;
        int drawWidth = this.width;
        int destinationRowSkip = SoftwareRasterizer.stride - drawWidth;
        int sourceRowSkip = 0;
        if (y < SoftwareRasterizer.clipTop) {
            clippedEdgePixels = SoftwareRasterizer.clipTop - y;
            drawHeight = drawHeight - clippedEdgePixels;
            y = SoftwareRasterizer.clipTop;
            sourceIndex = sourceIndex + clippedEdgePixels * drawWidth;
            destinationIndex = destinationIndex + clippedEdgePixels * SoftwareRasterizer.stride;
        }
        if (y + drawHeight > SoftwareRasterizer.clipBottom) {
            drawHeight = drawHeight - (y + drawHeight - SoftwareRasterizer.clipBottom);
        }
        if (x < SoftwareRasterizer.clipLeft) {
            clippedEdgePixels = SoftwareRasterizer.clipLeft - x;
            drawWidth = drawWidth - clippedEdgePixels;
            x = SoftwareRasterizer.clipLeft;
            sourceIndex = sourceIndex + clippedEdgePixels;
            destinationIndex = destinationIndex + clippedEdgePixels;
            sourceRowSkip = sourceRowSkip + clippedEdgePixels;
            destinationRowSkip = destinationRowSkip + clippedEdgePixels;
        }
        if (x + drawWidth > SoftwareRasterizer.clipRight) {
            clippedEdgePixels = x + drawWidth - SoftwareRasterizer.clipRight;
            drawWidth = drawWidth - clippedEdgePixels;
            sourceRowSkip = sourceRowSkip + clippedEdgePixels;
            destinationRowSkip = destinationRowSkip + clippedEdgePixels;
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
        int clippedEdgePixels = 0;
        x = x + this.trimX;
        y = y + this.trimY;
        int destinationIndex = x + y * SoftwareRasterizer.stride;
        int sourceIndex = 0;
        int drawHeight = this.height;
        int drawWidth = this.width;
        int destinationRowSkip = SoftwareRasterizer.stride - drawWidth;
        int sourceRowSkip = 0;
        if (y < SoftwareRasterizer.clipTop) {
            clippedEdgePixels = SoftwareRasterizer.clipTop - y;
            drawHeight = drawHeight - clippedEdgePixels;
            y = SoftwareRasterizer.clipTop;
            sourceIndex = sourceIndex + clippedEdgePixels * drawWidth;
            destinationIndex = destinationIndex + clippedEdgePixels * SoftwareRasterizer.stride;
        }
        if (y + drawHeight > SoftwareRasterizer.clipBottom) {
            drawHeight = drawHeight - (y + drawHeight - SoftwareRasterizer.clipBottom);
        }
        if (x < SoftwareRasterizer.clipLeft) {
            clippedEdgePixels = SoftwareRasterizer.clipLeft - x;
            drawWidth = drawWidth - clippedEdgePixels;
            x = SoftwareRasterizer.clipLeft;
            sourceIndex = sourceIndex + clippedEdgePixels;
            destinationIndex = destinationIndex + clippedEdgePixels;
            sourceRowSkip = sourceRowSkip + clippedEdgePixels;
            destinationRowSkip = destinationRowSkip + clippedEdgePixels;
        }
        if (x + drawWidth > SoftwareRasterizer.clipRight) {
            clippedEdgePixels = x + drawWidth - SoftwareRasterizer.clipRight;
            drawWidth = drawWidth - clippedEdgePixels;
            sourceRowSkip = sourceRowSkip + clippedEdgePixels;
            destinationRowSkip = destinationRowSkip + clippedEdgePixels;
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
        int trimStepsThenDestinationIndex = 0;
        int clippedEdgePixels = 0;
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
                trimStepsThenDestinationIndex = ((this.trimX << 16) + stepX16 - 1) / stepX16;
                x = x + trimStepsThenDestinationIndex;
                sourceX16 = sourceX16 + (trimStepsThenDestinationIndex * stepX16 - (this.trimX << 16));
            }
            if (this.trimY > 0) {
                trimStepsThenDestinationIndex = ((this.trimY << 16) + stepY16 - 1) / stepY16;
                y = y + trimStepsThenDestinationIndex;
                sourceY16 = sourceY16 + (trimStepsThenDestinationIndex * stepY16 - (this.trimY << 16));
            }
            if (sourceWidth < canvasWidth) {
                destinationWidth = ((sourceWidth << 16) - sourceX16 + stepX16 - 1) / stepX16;
            }
            if (sourceHeight < canvasHeight) {
                destinationHeight = ((sourceHeight << 16) - sourceY16 + stepY16 - 1) / stepY16;
            }
            trimStepsThenDestinationIndex = x + y * SoftwareRasterizer.stride;
            destinationRowSkip = SoftwareRasterizer.stride - destinationWidth;
            if (y + destinationHeight > SoftwareRasterizer.clipBottom) {
                destinationHeight = destinationHeight - (y + destinationHeight - SoftwareRasterizer.clipBottom);
            }
            if (y < SoftwareRasterizer.clipTop) {
                clippedEdgePixels = SoftwareRasterizer.clipTop - y;
                destinationHeight = destinationHeight - clippedEdgePixels;
                trimStepsThenDestinationIndex = trimStepsThenDestinationIndex + clippedEdgePixels * SoftwareRasterizer.stride;
                sourceY16 = sourceY16 + stepY16 * clippedEdgePixels;
            }
            if (x + destinationWidth > SoftwareRasterizer.clipRight) {
                clippedEdgePixels = x + destinationWidth - SoftwareRasterizer.clipRight;
                destinationWidth = destinationWidth - clippedEdgePixels;
                destinationRowSkip = destinationRowSkip + clippedEdgePixels;
            }
            if (x < SoftwareRasterizer.clipLeft) {
                clippedEdgePixels = SoftwareRasterizer.clipLeft - x;
                destinationWidth = destinationWidth - clippedEdgePixels;
                trimStepsThenDestinationIndex = trimStepsThenDestinationIndex + clippedEdgePixels;
                sourceX16 = sourceX16 + stepX16 * clippedEdgePixels;
                destinationRowSkip = destinationRowSkip + clippedEdgePixels;
            }
            ArgbSprite.blitArgbScaledAlpha(SoftwareRasterizer.framebuffer, this.pixels, 0, sourceX16, sourceY16, trimStepsThenDestinationIndex, destinationRowSkip, destinationWidth, destinationHeight, stepX16, stepY16, sourceWidth, alpha256);
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
        int trimStepsThenDestinationIndex = 0;
        int clippedEdgePixels = 0;
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
                trimStepsThenDestinationIndex = ((this.trimX << 16) + stepX16 - 1) / stepX16;
                x = x + trimStepsThenDestinationIndex;
                sourceX16 = sourceX16 + (trimStepsThenDestinationIndex * stepX16 - (this.trimX << 16));
            }
            if (this.trimY > 0) {
                trimStepsThenDestinationIndex = ((this.trimY << 16) + stepY16 - 1) / stepY16;
                y = y + trimStepsThenDestinationIndex;
                sourceY16 = sourceY16 + (trimStepsThenDestinationIndex * stepY16 - (this.trimY << 16));
            }
            if (sourceWidth < canvasWidth) {
                destinationWidth = ((sourceWidth << 16) - sourceX16 + stepX16 - 1) / stepX16;
            }
            if (sourceHeight < canvasHeight) {
                destinationHeight = ((sourceHeight << 16) - sourceY16 + stepY16 - 1) / stepY16;
            }
            trimStepsThenDestinationIndex = x + y * SoftwareRasterizer.stride;
            destinationRowSkip = SoftwareRasterizer.stride - destinationWidth;
            if (y + destinationHeight > SoftwareRasterizer.clipBottom) {
                destinationHeight = destinationHeight - (y + destinationHeight - SoftwareRasterizer.clipBottom);
            }
            if (y < SoftwareRasterizer.clipTop) {
                clippedEdgePixels = SoftwareRasterizer.clipTop - y;
                destinationHeight = destinationHeight - clippedEdgePixels;
                trimStepsThenDestinationIndex = trimStepsThenDestinationIndex + clippedEdgePixels * SoftwareRasterizer.stride;
                sourceY16 = sourceY16 + stepY16 * clippedEdgePixels;
            }
            if (x + destinationWidth > SoftwareRasterizer.clipRight) {
                clippedEdgePixels = x + destinationWidth - SoftwareRasterizer.clipRight;
                destinationWidth = destinationWidth - clippedEdgePixels;
                destinationRowSkip = destinationRowSkip + clippedEdgePixels;
            }
            if (x < SoftwareRasterizer.clipLeft) {
                clippedEdgePixels = SoftwareRasterizer.clipLeft - x;
                destinationWidth = destinationWidth - clippedEdgePixels;
                trimStepsThenDestinationIndex = trimStepsThenDestinationIndex + clippedEdgePixels;
                sourceX16 = sourceX16 + stepX16 * clippedEdgePixels;
                destinationRowSkip = destinationRowSkip + clippedEdgePixels;
            }
            ArgbSprite.blitArgbScaled(SoftwareRasterizer.framebuffer, this.pixels, 0, sourceX16, sourceY16, trimStepsThenDestinationIndex, destinationRowSkip, destinationWidth, destinationHeight, stepX16, stepY16, sourceWidth);
            return;
        }
    }

    final void drawUnmasked(int x, int y) {
        int clippedEdgePixels = 0;
        x = x + this.trimX;
        y = y + this.trimY;
        int destinationIndex = x + y * SoftwareRasterizer.stride;
        int sourceIndex = 0;
        int drawHeight = this.height;
        int drawWidth = this.width;
        int destinationRowSkip = SoftwareRasterizer.stride - drawWidth;
        int sourceRowSkip = 0;
        if (y < SoftwareRasterizer.clipTop) {
            clippedEdgePixels = SoftwareRasterizer.clipTop - y;
            drawHeight = drawHeight - clippedEdgePixels;
            y = SoftwareRasterizer.clipTop;
            sourceIndex = sourceIndex + clippedEdgePixels * drawWidth;
            destinationIndex = destinationIndex + clippedEdgePixels * SoftwareRasterizer.stride;
        }
        if (y + drawHeight > SoftwareRasterizer.clipBottom) {
            drawHeight = drawHeight - (y + drawHeight - SoftwareRasterizer.clipBottom);
        }
        if (x < SoftwareRasterizer.clipLeft) {
            clippedEdgePixels = SoftwareRasterizer.clipLeft - x;
            drawWidth = drawWidth - clippedEdgePixels;
            x = SoftwareRasterizer.clipLeft;
            sourceIndex = sourceIndex + clippedEdgePixels;
            destinationIndex = destinationIndex + clippedEdgePixels;
            sourceRowSkip = sourceRowSkip + clippedEdgePixels;
            destinationRowSkip = destinationRowSkip + clippedEdgePixels;
        }
        if (x + drawWidth > SoftwareRasterizer.clipRight) {
            clippedEdgePixels = x + drawWidth - SoftwareRasterizer.clipRight;
            drawWidth = drawWidth - clippedEdgePixels;
            sourceRowSkip = sourceRowSkip + clippedEdgePixels;
            destinationRowSkip = destinationRowSkip + clippedEdgePixels;
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
