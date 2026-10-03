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
        int sourceReadIndex = 0;
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
        L0: while (true) {
          if (negativeRow >= 0) {
            return;
          }
          negativeColumn = negativeRowPixelCount;
          while (true) {
            if (negativeColumn >= 0) {
              destinationIndex = destinationIndex + destinationRowSkip;
              sourceIndex = sourceIndex + sourceRowSkip;
              negativeRow++;
              continue L0;
            }
            sourceReadIndex = sourceIndex;
            sourceIndex++;
            sourcePixel = sourcePixels[sourceReadIndex];
            storedAlpha = sourcePixel >>> 24;
            if (storedAlpha == 0) {
              destinationIndex++;
              negativeColumn++;
              continue;
            }
            L2: {
              sourceRed = sourcePixel >> 16 & 255;
              sourceGreen = sourcePixel >> 8 & 255;
              sourceBlue = sourcePixel & 255;
              if (sourceRed == sourceGreen) {
                if (sourceGreen == sourceBlue) {
                  if (sourceRed > 128) {
                    tintedPixel = (tintRed * (256 - sourceRed) + 255 * (sourceRed - 128) >> 7 << 16) + (tintGreen * (256 - sourceGreen) + 255 * (sourceGreen - 128) >> 7 << 8) + (tintBlue * (256 - sourceBlue) + 255 * (sourceBlue - 128) >> 7);
                    break L2;
                  }
                  tintedPixel = (sourceRed * tintRed >> 7 << 16) + (sourceGreen * tintGreen >> 7 << 8) + (sourceBlue * tintBlue >> 7);
                  break L2;
                }
              }
              tintedPixel = sourcePixel;
            }
            inverseAlpha256 = 256 - storedAlpha;
            destinationPixel = destinationPixels[destinationIndex];
            destinationWriteIndex = destinationIndex;
            destinationIndex++;
            destinationPixels[destinationWriteIndex] = ((tintedPixel & 16711935) * storedAlpha + (destinationPixel & 16711935) * inverseAlpha256 & -16711936) + ((tintedPixel & 65280) * storedAlpha + (destinationPixel & 65280) * inverseAlpha256 & 16711680) >>> 8;
            negativeColumn++;
            continue;
          }
        }
    }

    private final static void blitArgb(int[] destinationPixels, int[] sourcePixels, int sourcePixel, int sourceIndex, int destinationIndex, int drawWidth, int drawHeight, int destinationRowSkip, int sourceRowSkip) {
        int sourceReadIndex = 0;
        int destinationWriteIndex = 0;
        int negativeRowPixelCount;
        int negativeRow;
        int negativeColumn;
        int storedAlpha;
        int inverseAlpha256;
        int destinationPixel;
        negativeRowPixelCount = -drawWidth;
        negativeRow = -drawHeight;
        L0: while (true) {
          if (negativeRow >= 0) {
            return;
          }
          negativeColumn = negativeRowPixelCount;
          while (true) {
            if (negativeColumn >= 0) {
              destinationIndex = destinationIndex + destinationRowSkip;
              sourceIndex = sourceIndex + sourceRowSkip;
              negativeRow++;
              continue L0;
            }
            sourceReadIndex = sourceIndex;
            sourceIndex++;
            sourcePixel = sourcePixels[sourceReadIndex];
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
            continue;
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
        L14: {
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
                L60: {
                  destinationIndex = rowDestinationIndex;
                  sourceXQ12 = rowSourceXQ12;
                  sourceYQ12 = rowSourceYQ12;
                  negativePixelCounter = rightThenNegativeWidth;
                  if (sourceXQ12 >= 0) {
                    if (sourceYQ12 >= 0) {
                      if (sourceXQ12 - (this.width << 12) < 0) {
                        if (sourceYQ12 - (this.height << 12) < 0) {
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
                          break L60;
                        }
                      }
                    }
                  }
                }
                negativeRowCounter++;
                rowDestinationIndex = rowDestinationIndex + SoftwareRasterizer.stride;
              }
              return;
            }
            if (inverseSinStep >= 0) {
              negativeRowCounter = bottomThenNegativeHeight;
              while (negativeRowCounter < 0) {
                L50: {
                  destinationIndex = rowDestinationIndex;
                  sourceXQ12 = rowSourceXQ12;
                  sourceYQ12 = rowSourceYQ12 + (destinationOffsetX * inverseSinStep >> 4);
                  negativePixelCounter = rightThenNegativeWidth;
                  if (sourceXQ12 >= 0) {
                    if (sourceXQ12 - (this.width << 12) < 0) {
                      if (sourceYQ12 < 0) {
                        clipPixelCount = (inverseSinStep - 1 - sourceYQ12) / inverseSinStep;
                        negativePixelCounter = negativePixelCounter + clipPixelCount;
                        sourceYQ12 = sourceYQ12 + inverseSinStep * clipPixelCount;
                        destinationIndex = destinationIndex + clipPixelCount;
                      }
                      clipPixelCount = (1 + sourceYQ12 - (this.height << 12) - inverseSinStep) / inverseSinStep;
                      if ((1 + sourceYQ12 - (this.height << 12) - inverseSinStep) / inverseSinStep > negativePixelCounter) {
                        negativePixelCounter = clipPixelCount;
                      }
                      while (negativePixelCounter < 0) {
                        sampledPixel = this.pixels[(sourceYQ12 >> 12) * this.width + (sourceXQ12 >> 12)];
                        destinationPixel = SoftwareRasterizer.framebuffer[destinationIndex];
                        storedAlpha = sampledPixel >>> 24;
                        inverseAlpha256 = 256 - storedAlpha;
                        writeIndexFixedXForwardY = destinationIndex;
                        destinationIndex++;
                        SoftwareRasterizer.framebuffer[writeIndexFixedXForwardY] = ((sampledPixel & 16711935) * storedAlpha + (destinationPixel & 16711935) * inverseAlpha256 & -16711936) + ((sampledPixel & 65280) * storedAlpha + (destinationPixel & 65280) * inverseAlpha256 & 16711680) >>> 8;
                        sourceYQ12 = sourceYQ12 + inverseSinStep;
                        negativePixelCounter++;
                      }
                      break L50;
                    }
                  }
                }
                negativeRowCounter++;
                rowSourceXQ12 = rowSourceXQ12 - inverseSinStep;
                rowDestinationIndex = rowDestinationIndex + SoftwareRasterizer.stride;
              }
              break L14;
            }
            negativeRowCounter = bottomThenNegativeHeight;
            while (negativeRowCounter < 0) {
              L55: {
                destinationIndex = rowDestinationIndex;
                sourceXQ12 = rowSourceXQ12;
                sourceYQ12 = rowSourceYQ12 + (destinationOffsetX * inverseSinStep >> 4);
                negativePixelCounter = rightThenNegativeWidth;
                if (sourceXQ12 >= 0) {
                  if (sourceXQ12 - (this.width << 12) < 0) {
                    clipPixelCount = sourceYQ12 - (this.height << 12);
                    if (sourceYQ12 - (this.height << 12) >= 0) {
                      clipPixelCount = (inverseSinStep - clipPixelCount) / inverseSinStep;
                      negativePixelCounter = negativePixelCounter + clipPixelCount;
                      sourceYQ12 = sourceYQ12 + inverseSinStep * clipPixelCount;
                      destinationIndex = destinationIndex + clipPixelCount;
                    }
                    clipPixelCount = (sourceYQ12 - inverseSinStep) / inverseSinStep;
                    if ((sourceYQ12 - inverseSinStep) / inverseSinStep > negativePixelCounter) {
                      negativePixelCounter = clipPixelCount;
                    }
                    while (negativePixelCounter < 0) {
                      sampledPixel = this.pixels[(sourceYQ12 >> 12) * this.width + (sourceXQ12 >> 12)];
                      destinationPixel = SoftwareRasterizer.framebuffer[destinationIndex];
                      storedAlpha = sampledPixel >>> 24;
                      inverseAlpha256 = 256 - storedAlpha;
                      writeIndexFixedXReverseY = destinationIndex;
                      destinationIndex++;
                      SoftwareRasterizer.framebuffer[writeIndexFixedXReverseY] = ((sampledPixel & 16711935) * storedAlpha + (destinationPixel & 16711935) * inverseAlpha256 & -16711936) + ((sampledPixel & 65280) * storedAlpha + (destinationPixel & 65280) * inverseAlpha256 & 16711680) >>> 8;
                      sourceYQ12 = sourceYQ12 + inverseSinStep;
                      negativePixelCounter++;
                    }
                    break L55;
                  }
                }
              }
              negativeRowCounter++;
              rowSourceXQ12 = rowSourceXQ12 - inverseSinStep;
              rowDestinationIndex = rowDestinationIndex + SoftwareRasterizer.stride;
            }
            break L14;
          }
          if (inverseCosStep >= 0) {
            if (inverseSinStep == 0) {
              negativeRowCounter = bottomThenNegativeHeight;
              while (negativeRowCounter < 0) {
                L28: {
                  destinationIndex = rowDestinationIndex;
                  sourceXQ12 = rowSourceXQ12 + (destinationOffsetX * inverseCosStep >> 4);
                  sourceYQ12 = rowSourceYQ12;
                  negativePixelCounter = rightThenNegativeWidth;
                  if (sourceYQ12 >= 0) {
                    if (sourceYQ12 - (this.height << 12) < 0) {
                      if (sourceXQ12 < 0) {
                        clipPixelCount = (inverseCosStep - 1 - sourceXQ12) / inverseCosStep;
                        negativePixelCounter = negativePixelCounter + clipPixelCount;
                        sourceXQ12 = sourceXQ12 + inverseCosStep * clipPixelCount;
                        destinationIndex = destinationIndex + clipPixelCount;
                      }
                      clipPixelCount = (1 + sourceXQ12 - (this.width << 12) - inverseCosStep) / inverseCosStep;
                      if ((1 + sourceXQ12 - (this.width << 12) - inverseCosStep) / inverseCosStep > negativePixelCounter) {
                        negativePixelCounter = clipPixelCount;
                      }
                      while (negativePixelCounter < 0) {
                        sampledPixel = this.pixels[(sourceYQ12 >> 12) * this.width + (sourceXQ12 >> 12)];
                        destinationPixel = SoftwareRasterizer.framebuffer[destinationIndex];
                        storedAlpha = sampledPixel >>> 24;
                        inverseAlpha256 = 256 - storedAlpha;
                        writeIndexForwardXFixedY = destinationIndex;
                        destinationIndex++;
                        SoftwareRasterizer.framebuffer[writeIndexForwardXFixedY] = ((sampledPixel & 16711935) * storedAlpha + (destinationPixel & 16711935) * inverseAlpha256 & -16711936) + ((sampledPixel & 65280) * storedAlpha + (destinationPixel & 65280) * inverseAlpha256 & 16711680) >>> 8;
                        sourceXQ12 = sourceXQ12 + inverseCosStep;
                        negativePixelCounter++;
                      }
                      break L28;
                    }
                  }
                }
                negativeRowCounter++;
                rowSourceYQ12 = rowSourceYQ12 + inverseCosStep;
                rowDestinationIndex = rowDestinationIndex + SoftwareRasterizer.stride;
              }
              break L14;
            }
            if (inverseSinStep >= 0) {
              negativeRowCounter = bottomThenNegativeHeight;
              while (negativeRowCounter < 0) {
                destinationIndex = rowDestinationIndex;
                sourceXQ12 = rowSourceXQ12 + (destinationOffsetX * inverseCosStep >> 4);
                sourceYQ12 = rowSourceYQ12 + (destinationOffsetX * inverseSinStep >> 4);
                negativePixelCounter = rightThenNegativeWidth;
                if (sourceXQ12 < 0) {
                  clipPixelCount = (inverseCosStep - 1 - sourceXQ12) / inverseCosStep;
                  negativePixelCounter = negativePixelCounter + clipPixelCount;
                  sourceXQ12 = sourceXQ12 + inverseCosStep * clipPixelCount;
                  sourceYQ12 = sourceYQ12 + inverseSinStep * clipPixelCount;
                  destinationIndex = destinationIndex + clipPixelCount;
                }
                clipPixelCount = (1 + sourceXQ12 - (this.width << 12) - inverseCosStep) / inverseCosStep;
                if ((1 + sourceXQ12 - (this.width << 12) - inverseCosStep) / inverseCosStep > negativePixelCounter) {
                  negativePixelCounter = clipPixelCount;
                }
                if (sourceYQ12 < 0) {
                  clipPixelCount = (inverseSinStep - 1 - sourceYQ12) / inverseSinStep;
                  negativePixelCounter = negativePixelCounter + clipPixelCount;
                  sourceXQ12 = sourceXQ12 + inverseCosStep * clipPixelCount;
                  sourceYQ12 = sourceYQ12 + inverseSinStep * clipPixelCount;
                  destinationIndex = destinationIndex + clipPixelCount;
                }
                clipPixelCount = (1 + sourceYQ12 - (this.height << 12) - inverseSinStep) / inverseSinStep;
                if ((1 + sourceYQ12 - (this.height << 12) - inverseSinStep) / inverseSinStep > negativePixelCounter) {
                  negativePixelCounter = clipPixelCount;
                }
                while (negativePixelCounter < 0) {
                  sampledPixel = this.pixels[(sourceYQ12 >> 12) * this.width + (sourceXQ12 >> 12)];
                  destinationPixel = SoftwareRasterizer.framebuffer[destinationIndex];
                  storedAlpha = sampledPixel >>> 24;
                  inverseAlpha256 = 256 - storedAlpha;
                  writeIndexForwardXForwardY = destinationIndex;
                  destinationIndex++;
                  SoftwareRasterizer.framebuffer[writeIndexForwardXForwardY] = ((sampledPixel & 16711935) * storedAlpha + (destinationPixel & 16711935) * inverseAlpha256 & -16711936) + ((sampledPixel & 65280) * storedAlpha + (destinationPixel & 65280) * inverseAlpha256 & 16711680) >>> 8;
                  sourceXQ12 = sourceXQ12 + inverseCosStep;
                  sourceYQ12 = sourceYQ12 + inverseSinStep;
                  negativePixelCounter++;
                }
                negativeRowCounter++;
                rowSourceXQ12 = rowSourceXQ12 - inverseSinStep;
                rowSourceYQ12 = rowSourceYQ12 + inverseCosStep;
                rowDestinationIndex = rowDestinationIndex + SoftwareRasterizer.stride;
              }
              break L14;
            }
            negativeRowCounter = bottomThenNegativeHeight;
            while (negativeRowCounter < 0) {
              destinationIndex = rowDestinationIndex;
              sourceXQ12 = rowSourceXQ12 + (destinationOffsetX * inverseCosStep >> 4);
              sourceYQ12 = rowSourceYQ12 + (destinationOffsetX * inverseSinStep >> 4);
              negativePixelCounter = rightThenNegativeWidth;
              if (sourceXQ12 < 0) {
                clipPixelCount = (inverseCosStep - 1 - sourceXQ12) / inverseCosStep;
                negativePixelCounter = negativePixelCounter + clipPixelCount;
                sourceXQ12 = sourceXQ12 + inverseCosStep * clipPixelCount;
                sourceYQ12 = sourceYQ12 + inverseSinStep * clipPixelCount;
                destinationIndex = destinationIndex + clipPixelCount;
              }
              clipPixelCount = (1 + sourceXQ12 - (this.width << 12) - inverseCosStep) / inverseCosStep;
              if ((1 + sourceXQ12 - (this.width << 12) - inverseCosStep) / inverseCosStep > negativePixelCounter) {
                negativePixelCounter = clipPixelCount;
              }
              clipPixelCount = sourceYQ12 - (this.height << 12);
              if (sourceYQ12 - (this.height << 12) >= 0) {
                clipPixelCount = (inverseSinStep - clipPixelCount) / inverseSinStep;
                negativePixelCounter = negativePixelCounter + clipPixelCount;
                sourceXQ12 = sourceXQ12 + inverseCosStep * clipPixelCount;
                sourceYQ12 = sourceYQ12 + inverseSinStep * clipPixelCount;
                destinationIndex = destinationIndex + clipPixelCount;
              }
              clipPixelCount = (sourceYQ12 - inverseSinStep) / inverseSinStep;
              if ((sourceYQ12 - inverseSinStep) / inverseSinStep > negativePixelCounter) {
                negativePixelCounter = clipPixelCount;
              }
              while (negativePixelCounter < 0) {
                sampledPixel = this.pixels[(sourceYQ12 >> 12) * this.width + (sourceXQ12 >> 12)];
                destinationPixel = SoftwareRasterizer.framebuffer[destinationIndex];
                storedAlpha = sampledPixel >>> 24;
                inverseAlpha256 = 256 - storedAlpha;
                writeIndexForwardXReverseY = destinationIndex;
                destinationIndex++;
                SoftwareRasterizer.framebuffer[writeIndexForwardXReverseY] = ((sampledPixel & 16711935) * storedAlpha + (destinationPixel & 16711935) * inverseAlpha256 & -16711936) + ((sampledPixel & 65280) * storedAlpha + (destinationPixel & 65280) * inverseAlpha256 & 16711680) >>> 8;
                sourceXQ12 = sourceXQ12 + inverseCosStep;
                sourceYQ12 = sourceYQ12 + inverseSinStep;
                negativePixelCounter++;
              }
              negativeRowCounter++;
              rowSourceXQ12 = rowSourceXQ12 - inverseSinStep;
              rowSourceYQ12 = rowSourceYQ12 + inverseCosStep;
              rowDestinationIndex = rowDestinationIndex + SoftwareRasterizer.stride;
            }
            break L14;
          }
          if (inverseSinStep == 0) {
            negativeRowCounter = bottomThenNegativeHeight;
            while (negativeRowCounter < 0) {
              L45: {
                destinationIndex = rowDestinationIndex;
                sourceXQ12 = rowSourceXQ12 + (destinationOffsetX * inverseCosStep >> 4);
                sourceYQ12 = rowSourceYQ12;
                negativePixelCounter = rightThenNegativeWidth;
                if (sourceYQ12 >= 0) {
                  if (sourceYQ12 - (this.height << 12) < 0) {
                    clipPixelCount = sourceXQ12 - (this.width << 12);
                    if (sourceXQ12 - (this.width << 12) >= 0) {
                      clipPixelCount = (inverseCosStep - clipPixelCount) / inverseCosStep;
                      negativePixelCounter = negativePixelCounter + clipPixelCount;
                      sourceXQ12 = sourceXQ12 + inverseCosStep * clipPixelCount;
                      destinationIndex = destinationIndex + clipPixelCount;
                    }
                    clipPixelCount = (sourceXQ12 - inverseCosStep) / inverseCosStep;
                    if ((sourceXQ12 - inverseCosStep) / inverseCosStep > negativePixelCounter) {
                      negativePixelCounter = clipPixelCount;
                    }
                    while (negativePixelCounter < 0) {
                      sampledPixel = this.pixels[(sourceYQ12 >> 12) * this.width + (sourceXQ12 >> 12)];
                      destinationPixel = SoftwareRasterizer.framebuffer[destinationIndex];
                      storedAlpha = sampledPixel >>> 24;
                      inverseAlpha256 = 256 - storedAlpha;
                      writeIndexReverseXFixedY = destinationIndex;
                      destinationIndex++;
                      SoftwareRasterizer.framebuffer[writeIndexReverseXFixedY] = ((sampledPixel & 16711935) * storedAlpha + (destinationPixel & 16711935) * inverseAlpha256 & -16711936) + ((sampledPixel & 65280) * storedAlpha + (destinationPixel & 65280) * inverseAlpha256 & 16711680) >>> 8;
                      sourceXQ12 = sourceXQ12 + inverseCosStep;
                      negativePixelCounter++;
                    }
                    break L45;
                  }
                }
              }
              negativeRowCounter++;
              rowSourceYQ12 = rowSourceYQ12 + inverseCosStep;
              rowDestinationIndex = rowDestinationIndex + SoftwareRasterizer.stride;
            }
            break L14;
          }
          if (inverseSinStep >= 0) {
            negativeRowCounter = bottomThenNegativeHeight;
            while (negativeRowCounter < 0) {
              destinationIndex = rowDestinationIndex;
              sourceXQ12 = rowSourceXQ12 + (destinationOffsetX * inverseCosStep >> 4);
              sourceYQ12 = rowSourceYQ12 + (destinationOffsetX * inverseSinStep >> 4);
              negativePixelCounter = rightThenNegativeWidth;
              clipPixelCount = sourceXQ12 - (this.width << 12);
              if (sourceXQ12 - (this.width << 12) >= 0) {
                clipPixelCount = (inverseCosStep - clipPixelCount) / inverseCosStep;
                negativePixelCounter = negativePixelCounter + clipPixelCount;
                sourceXQ12 = sourceXQ12 + inverseCosStep * clipPixelCount;
                sourceYQ12 = sourceYQ12 + inverseSinStep * clipPixelCount;
                destinationIndex = destinationIndex + clipPixelCount;
              }
              clipPixelCount = (sourceXQ12 - inverseCosStep) / inverseCosStep;
              if ((sourceXQ12 - inverseCosStep) / inverseCosStep > negativePixelCounter) {
                negativePixelCounter = clipPixelCount;
              }
              if (sourceYQ12 < 0) {
                clipPixelCount = (inverseSinStep - 1 - sourceYQ12) / inverseSinStep;
                negativePixelCounter = negativePixelCounter + clipPixelCount;
                sourceXQ12 = sourceXQ12 + inverseCosStep * clipPixelCount;
                sourceYQ12 = sourceYQ12 + inverseSinStep * clipPixelCount;
                destinationIndex = destinationIndex + clipPixelCount;
              }
              clipPixelCount = (1 + sourceYQ12 - (this.height << 12) - inverseSinStep) / inverseSinStep;
              if ((1 + sourceYQ12 - (this.height << 12) - inverseSinStep) / inverseSinStep > negativePixelCounter) {
                negativePixelCounter = clipPixelCount;
              }
              while (negativePixelCounter < 0) {
                sampledPixel = this.pixels[(sourceYQ12 >> 12) * this.width + (sourceXQ12 >> 12)];
                destinationPixel = SoftwareRasterizer.framebuffer[destinationIndex];
                storedAlpha = sampledPixel >>> 24;
                inverseAlpha256 = 256 - storedAlpha;
                writeIndexReverseXForwardY = destinationIndex;
                destinationIndex++;
                SoftwareRasterizer.framebuffer[writeIndexReverseXForwardY] = ((sampledPixel & 16711935) * storedAlpha + (destinationPixel & 16711935) * inverseAlpha256 & -16711936) + ((sampledPixel & 65280) * storedAlpha + (destinationPixel & 65280) * inverseAlpha256 & 16711680) >>> 8;
                sourceXQ12 = sourceXQ12 + inverseCosStep;
                sourceYQ12 = sourceYQ12 + inverseSinStep;
                negativePixelCounter++;
              }
              negativeRowCounter++;
              rowSourceXQ12 = rowSourceXQ12 - inverseSinStep;
              rowSourceYQ12 = rowSourceYQ12 + inverseCosStep;
              rowDestinationIndex = rowDestinationIndex + SoftwareRasterizer.stride;
            }
            break L14;
          }
          negativeRowCounter = bottomThenNegativeHeight;
          while (negativeRowCounter < 0) {
            destinationIndex = rowDestinationIndex;
            sourceXQ12 = rowSourceXQ12 + (destinationOffsetX * inverseCosStep >> 4);
            sourceYQ12 = rowSourceYQ12 + (destinationOffsetX * inverseSinStep >> 4);
            negativePixelCounter = rightThenNegativeWidth;
            clipPixelCount = sourceXQ12 - (this.width << 12);
            if (sourceXQ12 - (this.width << 12) >= 0) {
              clipPixelCount = (inverseCosStep - clipPixelCount) / inverseCosStep;
              negativePixelCounter = negativePixelCounter + clipPixelCount;
              sourceXQ12 = sourceXQ12 + inverseCosStep * clipPixelCount;
              sourceYQ12 = sourceYQ12 + inverseSinStep * clipPixelCount;
              destinationIndex = destinationIndex + clipPixelCount;
            }
            clipPixelCount = (sourceXQ12 - inverseCosStep) / inverseCosStep;
            if ((sourceXQ12 - inverseCosStep) / inverseCosStep > negativePixelCounter) {
              negativePixelCounter = clipPixelCount;
            }
            clipPixelCount = sourceYQ12 - (this.height << 12);
            if (sourceYQ12 - (this.height << 12) >= 0) {
              clipPixelCount = (inverseSinStep - clipPixelCount) / inverseSinStep;
              negativePixelCounter = negativePixelCounter + clipPixelCount;
              sourceXQ12 = sourceXQ12 + inverseCosStep * clipPixelCount;
              sourceYQ12 = sourceYQ12 + inverseSinStep * clipPixelCount;
              destinationIndex = destinationIndex + clipPixelCount;
            }
            clipPixelCount = (sourceYQ12 - inverseSinStep) / inverseSinStep;
            if ((sourceYQ12 - inverseSinStep) / inverseSinStep > negativePixelCounter) {
              negativePixelCounter = clipPixelCount;
            }
            while (negativePixelCounter < 0) {
              sampledPixel = this.pixels[(sourceYQ12 >> 12) * this.width + (sourceXQ12 >> 12)];
              destinationPixel = SoftwareRasterizer.framebuffer[destinationIndex];
              storedAlpha = sampledPixel >>> 24;
              inverseAlpha256 = 256 - storedAlpha;
              writeIndexReverseXReverseY = destinationIndex;
              destinationIndex++;
              SoftwareRasterizer.framebuffer[writeIndexReverseXReverseY] = ((sampledPixel & 16711935) * storedAlpha + (destinationPixel & 16711935) * inverseAlpha256 & -16711936) + ((sampledPixel & 65280) * storedAlpha + (destinationPixel & 65280) * inverseAlpha256 & 16711680) >>> 8;
              sourceXQ12 = sourceXQ12 + inverseCosStep;
              sourceYQ12 = sourceYQ12 + inverseSinStep;
              negativePixelCounter++;
            }
            negativeRowCounter++;
            rowSourceXQ12 = rowSourceXQ12 - inverseSinStep;
            rowSourceYQ12 = rowSourceYQ12 + inverseCosStep;
            rowDestinationIndex = rowDestinationIndex + SoftwareRasterizer.stride;
          }
          break L14;
        }
        return;
    }

    private final static void blitArgbAdditive(int sourceColorScratch, int blendScratch, int rgbSum, int[] destinationPixels, int[] sourcePixels, int sourceIndex, int negativeColumnScratch, int destinationIndex, int negativeRowScratch, int drawWidth, int drawHeight, int destinationRowSkip, int sourceRowSkip, int intensity256) {
        int sourceReadIndex = 0;
        int destinationWriteIndex = 0;
        int effectiveAlpha256;
        negativeRowScratch = -drawHeight;
        L0: while (true) {
          if (negativeRowScratch >= 0) {
            return;
          }
          negativeColumnScratch = -drawWidth;
          while (true) {
            if (negativeColumnScratch >= 0) {
              destinationIndex = destinationIndex + destinationRowSkip;
              sourceIndex = sourceIndex + sourceRowSkip;
              negativeRowScratch++;
              continue L0;
            }
            sourceReadIndex = sourceIndex;
            sourceIndex++;
            sourceColorScratch = sourcePixels[sourceReadIndex];
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
            continue;
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
        L4: while (true) {
          if (sourceBlockY > lastBlockSourceY) {
            return;
          }
          sourceIndex = sourceBlockY * this.width + firstSourceX;
          destinationIndex = (y + (sourceBlockY >> 1)) * SoftwareRasterizer.stride + (x + (firstSourceX >> 1));
          sourceBlockX = firstSourceX;
          while (true) {
            if (sourceBlockX > lastBlockSourceX) {
              sourceBlockY += 2;
              continue L4;
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
              samplePixel = samplePixelBuffer[sampleBaseIndex + sampleRowOffset];
              sampleAlpha = samplePixel >>> 24;
              alphaSum = alphaSum + sampleAlpha;
              weightedRedThenRedBlue = weightedRedThenRedBlue + sampleAlpha * (samplePixel >> 16 & 255);
              weightedGreenThenPackedGreen = weightedGreenThenPackedGreen + sampleAlpha * (samplePixel >> 8 & 255);
              weightedBlue = weightedBlue + sampleAlpha * (samplePixel & 255);
            }
            if (alphaSum == 0) {
              sourceBlockX += 2;
              destinationIndex++;
              sourceIndex += 2;
              continue;
            }
            weightedRedThenRedBlue = (weightedRedThenRedBlue / alphaSum << 16) + weightedBlue / alphaSum;
            weightedGreenThenPackedGreen = weightedGreenThenPackedGreen / alphaSum << 8;
            sampleIndexThenAverageAlpha = alphaSum >> 2;
            inverseAlpha256 = 256 - sampleIndexThenAverageAlpha;
            destinationPixel = SoftwareRasterizer.framebuffer[destinationIndex];
            SoftwareRasterizer.framebuffer[destinationIndex] = (sampleIndexThenAverageAlpha * weightedRedThenRedBlue + inverseAlpha256 * (destinationPixel & 16711935) & -16711936) + (sampleIndexThenAverageAlpha * weightedGreenThenPackedGreen + inverseAlpha256 * (destinationPixel & 65280) & 16711680) >>> 8;
            sourceBlockX += 2;
            destinationIndex++;
            sourceIndex += 2;
            continue;
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
        int[] sampleBlockAllocationThenReadAlias;
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
        sampleBlockAllocationThenReadAlias = new int[16];
        sampleBlockStorage = sampleBlockAllocationThenReadAlias;
        sampleBlockAlias = sampleBlockStorage;
        sourceBlockY = firstSourceY;
        L4: while (true) {
          if (sourceBlockY > lastBlockSourceY) {
            return;
          }
          sourceBlockX = firstSourceX;
          while (true) {
            if (sourceBlockX > lastBlockSourceX) {
              sourceBlockY += 4;
              continue L4;
            }
            sourceIndex = sourceBlockY * this.width + sourceBlockX;
            destinationIndex = (y + (sourceBlockY >> 2)) * SoftwareRasterizer.stride + (x + (sourceBlockX >> 2));
            for (sampleRowThenAlpha = 0; sampleRowThenAlpha < 4; sampleRowThenAlpha++) {
              for (sampleColumnThenAlphaSum = 0; sampleColumnThenAlphaSum < 4; sampleColumnThenAlphaSum++) {
                sampleBlockAlias[(sampleRowThenAlpha << 2) + sampleColumnThenAlphaSum] = this.pixels[sourceIndex + sampleRowThenAlpha * this.width + sampleColumnThenAlphaSum];
              }
            }
            sampleBlockAllocationThenReadAlias = sampleBlockStorage;
            sampleRowThenAlpha = 0;
            sampleColumnThenAlphaSum = 0;
            weightedRedThenRedBlue = 0;
            weightedGreenThenPackedGreen = 0;
            weightedBlue = 0;
            for (sampleIndexThenAverageAlpha = 0; sampleIndexThenAverageAlpha < 16; sampleIndexThenAverageAlpha++) {
              sampleRowThenAlpha = sampleBlockAllocationThenReadAlias[sampleIndexThenAverageAlpha] >>> 24;
              sampleColumnThenAlphaSum = sampleColumnThenAlphaSum + sampleRowThenAlpha;
              weightedRedThenRedBlue = weightedRedThenRedBlue + sampleRowThenAlpha * (sampleBlockAllocationThenReadAlias[sampleIndexThenAverageAlpha] >> 16 & 255);
              weightedGreenThenPackedGreen = weightedGreenThenPackedGreen + sampleRowThenAlpha * (sampleBlockAllocationThenReadAlias[sampleIndexThenAverageAlpha] >> 8 & 255);
              weightedBlue = weightedBlue + sampleRowThenAlpha * (sampleBlockAllocationThenReadAlias[sampleIndexThenAverageAlpha] & 255);
            }
            if (sampleColumnThenAlphaSum == 0) {
              sourceBlockX += 4;
              continue;
            }
            weightedRedThenRedBlue = (weightedRedThenRedBlue / sampleColumnThenAlphaSum << 16) + weightedBlue / sampleColumnThenAlphaSum;
            weightedGreenThenPackedGreen = weightedGreenThenPackedGreen / sampleColumnThenAlphaSum << 8;
            sampleIndexThenAverageAlpha = sampleColumnThenAlphaSum >> 4;
            inverseAlpha256 = 256 - sampleIndexThenAverageAlpha;
            destinationPixel = SoftwareRasterizer.framebuffer[destinationIndex];
            SoftwareRasterizer.framebuffer[destinationIndex] = (sampleIndexThenAverageAlpha * weightedRedThenRedBlue + inverseAlpha256 * (destinationPixel & 16711935) & -16711936) + (sampleIndexThenAverageAlpha * weightedGreenThenPackedGreen + inverseAlpha256 * (destinationPixel & 65280) & 16711680) >>> 8;
            sourceBlockX += 4;
            continue;
          }
        }
    }

    ArgbSprite(int width, int height) {
        super(width, height);
    }

    private final static void blitArgbGrayModulated(int[] destinationPixels, int[] sourcePixels, int sourcePixel, int sourceIndex, int destinationIndex, int negativeColumnScratch, int negativeRowScratch, int drawWidth, int drawHeight, int destinationRowSkip, int sourceRowSkip, int tintColor) {
        int sourceReadIndex = 0;
        int destinationWriteIndex = 0;
        int tintRedBlue;
        int tintGreen;
        int storedAlpha;
        int modulatedPixel;
        int inverseAlpha256;
        int destinationPixel;
        tintRedBlue = tintColor & 16711935;
        tintGreen = tintColor >> 8 & 255;
        negativeRowScratch = -drawHeight;
        L0: while (true) {
          if (negativeRowScratch >= 0) {
            return;
          }
          negativeColumnScratch = -drawWidth;
          while (true) {
            if (negativeColumnScratch >= 0) {
              destinationIndex = destinationIndex + destinationRowSkip;
              sourceIndex = sourceIndex + sourceRowSkip;
              negativeRowScratch++;
              continue L0;
            }
            sourceReadIndex = sourceIndex;
            sourceIndex++;
            sourcePixel = sourcePixels[sourceReadIndex];
            storedAlpha = sourcePixel >>> 24;
            sourcePixel = sourcePixel & 16777215;
            if (storedAlpha == 0) {
              destinationIndex++;
              negativeColumnScratch++;
              continue;
            }
            modulatedPixel = 0;
            if (sourcePixel >> 8 != (sourcePixel & 65535)) {
              modulatedPixel = sourcePixel;
            } else {
              sourcePixel = sourcePixel & 255;
              modulatedPixel = (sourcePixel * tintRedBlue >> 8 & 16711934) + (sourcePixel * tintGreen & 65280) + 1;
            }
            inverseAlpha256 = 256 - storedAlpha;
            destinationPixel = destinationPixels[destinationIndex];
            destinationWriteIndex = destinationIndex;
            destinationIndex++;
            destinationPixels[destinationWriteIndex] = ((modulatedPixel & 16711935) * storedAlpha + (destinationPixel & 16711935) * inverseAlpha256 & -16711936) + ((modulatedPixel & 65280) * storedAlpha + (destinationPixel & 65280) * inverseAlpha256 & 16711680) >>> 8;
            negativeColumnScratch++;
            continue;
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
        int sourceReadIndex = 0;
        int sourcePixel = 0;
        int destinationPixel = 0;
        int destinationWriteIndex = 0;
        for (negativeRow = -drawHeight; negativeRow < 0; negativeRow++) {
            for (negativeColumn = -drawWidth; negativeColumn < 0; negativeColumn++) {
                effectiveAlpha256 = (sourcePixels[sourceIndex] >>> 24) * alpha256 >> 8;
                inverseAlpha256 = 256 - effectiveAlpha256;
                sourceReadIndex = sourceIndex;
                sourceIndex++;
                sourcePixel = sourcePixels[sourceReadIndex];
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
