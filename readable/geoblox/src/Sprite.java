/*
 * Decompiled by CFR-JS 0.4.0.
 */
class Sprite extends SpriteState {
    int[] pixels;

    private final void sampleBilinear(int destinationIndex, int sourceX, int sourceY, int fractionX, int fractionY) {
        int topLeftWeightCandidateQ24 = 0;
        int topRightWeightCandidateQ24 = 0;
        int bottomLeftWeightCandidateQ24 = 0;
        int bottomRightWeightCandidateQ24 = 0;
        int sourceIndex;
        int topLeftPixel;
        int topRightPixel;
        int bottomLeftPixel;
        int bottomRightPixel;
        int topLeftWeightQ24ThenQ8;
        int topRightWeightQ24ThenQ8;
        int bottomLeftWeightQ24ThenQ8;
        int bottomRightWeightQ24ThenQ8;
        int totalWeightQ8;
        int weightedRedBlue;
        int weightedGreen;
        int filteredPixel;
        sourceIndex = sourceY * this.width + sourceX;
        fractionX = fractionX & 4095;
        fractionY = fractionY & 4095;
        if (sourceY < 0) {
          topRightWeightQ24ThenQ8 = 0;
          topLeftWeightQ24ThenQ8 = 0;
          topRightPixel = 0;
          topLeftPixel = 0;
        } else {
          if (sourceX < 0) {
            topLeftWeightQ24ThenQ8 = 0;
            topLeftPixel = 0;
          } else {
            topLeftPixel = this.pixels[sourceIndex];
            if (topLeftPixel == 0) {
              topLeftWeightCandidateQ24 = 0;
            } else {
              topLeftWeightCandidateQ24 = (4096 - fractionX) * (4096 - fractionY);
            }
            topLeftWeightQ24ThenQ8 = topLeftWeightCandidateQ24;
          }
          if (sourceX >= this.width - 1) {
            topRightWeightQ24ThenQ8 = 0;
            topRightPixel = 0;
          } else {
            topRightPixel = this.pixels[sourceIndex + 1];
            if (topRightPixel == 0) {
              topRightWeightCandidateQ24 = 0;
            } else {
              topRightWeightCandidateQ24 = fractionX * (4096 - fractionY);
            }
            topRightWeightQ24ThenQ8 = topRightWeightCandidateQ24;
          }
        }
        if (sourceY >= this.height - 1) {
          bottomRightWeightQ24ThenQ8 = 0;
          bottomLeftWeightQ24ThenQ8 = 0;
          bottomRightPixel = 0;
          bottomLeftPixel = 0;
        } else {
          if (sourceX < 0) {
            bottomLeftWeightQ24ThenQ8 = 0;
            bottomLeftPixel = 0;
          } else {
            bottomLeftPixel = this.pixels[sourceIndex + this.width];
            if (bottomLeftPixel == 0) {
              bottomLeftWeightCandidateQ24 = 0;
            } else {
              bottomLeftWeightCandidateQ24 = (4096 - fractionX) * fractionY;
            }
            bottomLeftWeightQ24ThenQ8 = bottomLeftWeightCandidateQ24;
          }
          if (sourceX >= this.width - 1) {
            bottomRightWeightQ24ThenQ8 = 0;
            bottomRightPixel = 0;
          } else {
            bottomRightPixel = this.pixels[sourceIndex + this.width + 1];
            if (bottomRightPixel == 0) {
              bottomRightWeightCandidateQ24 = 0;
            } else {
              bottomRightWeightCandidateQ24 = fractionX * fractionY;
            }
            bottomRightWeightQ24ThenQ8 = bottomRightWeightCandidateQ24;
          }
        }
        topLeftWeightQ24ThenQ8 = topLeftWeightQ24ThenQ8 >> 16;
        topRightWeightQ24ThenQ8 = topRightWeightQ24ThenQ8 >> 16;
        bottomLeftWeightQ24ThenQ8 = bottomLeftWeightQ24ThenQ8 >> 16;
        bottomRightWeightQ24ThenQ8 = bottomRightWeightQ24ThenQ8 >> 16;
        totalWeightQ8 = topLeftWeightQ24ThenQ8 + topRightWeightQ24ThenQ8 + bottomLeftWeightQ24ThenQ8 + bottomRightWeightQ24ThenQ8;
        if (totalWeightQ8 < 256) {
          if (totalWeightQ8 < 128) {
            return;
          }
          weightedRedBlue = (topLeftPixel & 16711935) * topLeftWeightQ24ThenQ8 + (topRightPixel & 16711935) * topRightWeightQ24ThenQ8;
          weightedRedBlue = weightedRedBlue + ((bottomLeftPixel & 16711935) * bottomLeftWeightQ24ThenQ8 + (bottomRightPixel & 16711935) * bottomRightWeightQ24ThenQ8);
          weightedGreen = (topLeftPixel & 65280) * topLeftWeightQ24ThenQ8 + (topRightPixel & 65280) * topRightWeightQ24ThenQ8;
          weightedGreen = weightedGreen + ((bottomLeftPixel & 65280) * bottomLeftWeightQ24ThenQ8 + (bottomRightPixel & 65280) * bottomRightWeightQ24ThenQ8);
          filteredPixel = ((weightedRedBlue >>> 16) / totalWeightQ8 << 16) + (weightedGreen / totalWeightQ8 & 65280) + (weightedRedBlue & 65535) / totalWeightQ8;
          if (filteredPixel == 0) {
            filteredPixel = 1;
          }
          SoftwareRasterizer.framebuffer[destinationIndex] = filteredPixel;
        } else {
          weightedRedBlue = (topLeftPixel & 16711935) * topLeftWeightQ24ThenQ8 + (topRightPixel & 16711935) * topRightWeightQ24ThenQ8;
          weightedRedBlue = weightedRedBlue + ((bottomLeftPixel & 16711935) * bottomLeftWeightQ24ThenQ8 + (bottomRightPixel & 16711935) * bottomRightWeightQ24ThenQ8);
          weightedGreen = (topLeftPixel & 65280) * topLeftWeightQ24ThenQ8 + (topRightPixel & 65280) * topRightWeightQ24ThenQ8;
          weightedGreen = weightedGreen + ((bottomLeftPixel & 65280) * bottomLeftWeightQ24ThenQ8 + (bottomRightPixel & 65280) * bottomRightWeightQ24ThenQ8);
          filteredPixel = (weightedRedBlue >>> 8 & 16711935) + (weightedGreen >>> 8 & 65280);
          if (filteredPixel == 0) {
            filteredPixel = 1;
          }
          SoftwareRasterizer.framebuffer[destinationIndex] = filteredPixel;
        }
    }

    final void drawSilhouette(int x, int y, int color) {
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
            Sprite.blitSilhouette(SoftwareRasterizer.framebuffer, this.pixels, color, sourceIndex, destinationIndex, drawWidth, drawHeight, destinationRowSkip, sourceRowSkip);
            return;
        }
    }

    void rotateNearest(int sourcePivotX, int sourcePivotY, int destinationX, int destinationY, int angle, int scale) {
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
              if (fixedXFixedYSourceXQ12 < 0) {
                fixedXFixedYNegativeRowCounter++;
                rowDestinationIndex = rowDestinationIndex + SoftwareRasterizer.stride;
                continue;
              }
              if (fixedXFixedYSourceYQ12 >= 0 &&
                  fixedXFixedYSourceXQ12 - (this.width << 12) < 0 &&
                  fixedXFixedYSourceYQ12 - (this.height << 12) < 0) {
                while (fixedXFixedYNegativePixelCounter < 0) {
                  fixedXFixedYSampledPixel = this.pixels[(fixedXFixedYSourceYQ12 >> 12) * this.width + (fixedXFixedYSourceXQ12 >> 12)];
                  if (fixedXFixedYSampledPixel == 0) {
                    fixedXFixedYDestinationIndex++;
                    fixedXFixedYNegativePixelCounter++;
                    continue;
                  }
                  writeIndexFixedXFixedY = fixedXFixedYDestinationIndex;
                  fixedXFixedYDestinationIndex++;
                  SoftwareRasterizer.framebuffer[writeIndexFixedXFixedY] = fixedXFixedYSampledPixel;
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
                  if (fixedXForwardYSampledPixel == 0) {
                    fixedXForwardYDestinationIndex++;
                  } else {
                    writeIndexFixedXForwardY = fixedXForwardYDestinationIndex;
                    fixedXForwardYDestinationIndex++;
                    SoftwareRasterizer.framebuffer[writeIndexFixedXForwardY] = fixedXForwardYSampledPixel;
                  }
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
            if (fixedXReverseYSourceXQ12 >= 0) {
              if (fixedXReverseYSourceXQ12 - (this.width << 12) >= 0) {
                fixedXReverseYNegativeRowCounter++;
                rowSourceXQ12 = rowSourceXQ12 - inverseSinStep;
                rowDestinationIndex = rowDestinationIndex + SoftwareRasterizer.stride;
                continue;
              }
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
                if (fixedXReverseYSampledPixel == 0) {
                  fixedXReverseYDestinationIndex++;
                } else {
                  writeIndexFixedXReverseY = fixedXReverseYDestinationIndex;
                  fixedXReverseYDestinationIndex++;
                  SoftwareRasterizer.framebuffer[writeIndexFixedXReverseY] = fixedXReverseYSampledPixel;
                }
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
                  if (forwardXFixedYSampledPixel == 0) {
                    forwardXFixedYDestinationIndex++;
                  } else {
                    writeIndexForwardXFixedY = forwardXFixedYDestinationIndex;
                    forwardXFixedYDestinationIndex++;
                    SoftwareRasterizer.framebuffer[writeIndexForwardXFixedY] = forwardXFixedYSampledPixel;
                  }
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
                if (forwardXForwardYSampledPixel == 0) {
                  forwardXForwardYDestinationIndex++;
                } else {
                  writeIndexForwardXForwardY = forwardXForwardYDestinationIndex;
                  forwardXForwardYDestinationIndex++;
                  SoftwareRasterizer.framebuffer[writeIndexForwardXForwardY] = forwardXForwardYSampledPixel;
                }
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
              if (forwardXReverseYSampledPixel == 0) {
                forwardXReverseYDestinationIndex++;
              } else {
                writeIndexForwardXReverseY = forwardXReverseYDestinationIndex;
                forwardXReverseYDestinationIndex++;
                SoftwareRasterizer.framebuffer[writeIndexForwardXReverseY] = forwardXReverseYSampledPixel;
              }
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
                if (reverseXFixedYSampledPixel == 0) {
                  reverseXFixedYDestinationIndex++;
                } else {
                  writeIndexReverseXFixedY = reverseXFixedYDestinationIndex;
                  reverseXFixedYDestinationIndex++;
                  SoftwareRasterizer.framebuffer[writeIndexReverseXFixedY] = reverseXFixedYSampledPixel;
                }
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
              if (reverseXForwardYSampledPixel == 0) {
                reverseXForwardYDestinationIndex++;
              } else {
                writeIndexReverseXForwardY = reverseXForwardYDestinationIndex;
                reverseXForwardYDestinationIndex++;
                SoftwareRasterizer.framebuffer[writeIndexReverseXForwardY] = reverseXForwardYSampledPixel;
              }
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
            if (reverseXReverseYSampledPixel == 0) {
              reverseXReverseYDestinationIndex++;
            } else {
              writeIndexReverseXReverseY = reverseXReverseYDestinationIndex;
              reverseXReverseYDestinationIndex++;
              SoftwareRasterizer.framebuffer[writeIndexReverseXReverseY] = reverseXReverseYSampledPixel;
            }
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

    private final static void blitColorKeyScaled(int[] destinationPixels, int[] sourcePixels, int sourcePixel, int sourceX16, int sourceY16, int destinationIndex, int destinationRowSkip, int drawWidth, int drawHeight, int stepX16, int stepY16, int sourceWidth) {
        int negativeRow = 0;
        int sourceRowOffset = 0;
        int negativeColumn = 0;
        int rowSourceX16 = sourceX16;
        for (negativeRow = -drawHeight; negativeRow < 0; negativeRow++) {
            sourceRowOffset = (sourceY16 >> 16) * sourceWidth;
            for (negativeColumn = -drawWidth; negativeColumn < 0; negativeColumn++) {
                sourcePixel = sourcePixels[(sourceX16 >> 16) + sourceRowOffset];
                if (sourcePixel != 0) {
                    destinationPixels[destinationIndex++] = sourcePixel;
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

    final void trimTransparentBorders() {
        int copyRow = 0;
        int copyColumn = 0;
        int bottomEdge;
        int rowOffsetThenTopEdge;
        int scanThenRightEdge;
        int scanThenLeftEdge;
        int borderScanRow;
        int croppedHeight;
        int[] croppedPixels;
        int topEdgeRow;
        int topScanRowOffset;
        int rightEdgeColumn;
        int rightEdgeScanRow;
        int leftEdgeColumn;
        int croppedWidth;
        bottomEdge = this.height - 1;
        bottomBorderScan: while (true) {
          if (bottomEdge >= 0) {
            rowOffsetThenTopEdge = bottomEdge * this.width;
            for (scanThenRightEdge = 0; scanThenRightEdge < this.width; scanThenRightEdge++) {
              if (this.pixels[rowOffsetThenTopEdge + scanThenRightEdge] != 0) {
                break bottomBorderScan;
              }
            }
            bottomEdge--;
            continue;
          }
          break;
        }
        topEdgeRow = 0;
        topBorderScan: while (true) {
          if (topEdgeRow < bottomEdge) {
            topScanRowOffset = topEdgeRow * this.width;
            for (scanThenLeftEdge = 0; scanThenLeftEdge < this.width; scanThenLeftEdge++) {
              if (this.pixels[topScanRowOffset + scanThenLeftEdge] != 0) {
                break topBorderScan;
              }
            }
            topEdgeRow++;
            continue;
          }
          break;
        }
        rightEdgeColumn = this.width - 1;
        rightBorderScan: while (true) {
          if (rightEdgeColumn >= 0) {
            for (rightEdgeScanRow = topEdgeRow; rightEdgeScanRow <= bottomEdge; rightEdgeScanRow++) {
              if (this.pixels[rightEdgeScanRow * this.width + rightEdgeColumn] != 0) {
                break rightBorderScan;
              }
            }
            rightEdgeColumn--;
            continue;
          }
          break;
        }
        leftEdgeColumn = 0;
        leftBorderScan: while (true) {
          if (leftEdgeColumn < rightEdgeColumn) {
            for (borderScanRow = topEdgeRow; borderScanRow <= bottomEdge; borderScanRow++) {
              if (this.pixels[borderScanRow * this.width + leftEdgeColumn] != 0) {
                break leftBorderScan;
              }
            }
            leftEdgeColumn++;
            continue;
          }
          break;
        }
        if (leftEdgeColumn == 0 &&
            rightEdgeColumn == this.width - 1 &&
            topEdgeRow == 0 &&
            bottomEdge == this.height - 1) {
          return;
        }
        croppedWidth = rightEdgeColumn + 1 - leftEdgeColumn;
        croppedHeight = bottomEdge + 1 - topEdgeRow;
        croppedPixels = new int[croppedWidth * croppedHeight];
        for (copyRow = 0; copyRow < croppedHeight; copyRow++) {
          for (copyColumn = 0; copyColumn < croppedWidth; copyColumn++) {
            croppedPixels[copyRow * croppedWidth + copyColumn] = this.pixels[(copyRow + topEdgeRow) * this.width + (copyColumn + leftEdgeColumn)];
          }
        }
        this.pixels = croppedPixels;
        this.width = croppedWidth;
        this.height = croppedHeight;
        this.trimX = this.trimX + leftEdgeColumn;
        this.trimY = this.trimY + topEdgeRow;
        return;
    }

    final void addOutline(int color) {
        int row = 0;
        int column = 0;
        int[] outlinedPixels;
        int pixelIndex;
        int pixelOrOutlineColor;
        outlinedPixels = new int[this.width * this.height];
        pixelIndex = 0;
        for (row = 0; row < this.height; row++) {
          for (column = 0; column < this.width; column++) {
            pixelOrOutlineColor = this.pixels[pixelIndex];
            if (pixelOrOutlineColor == 0) {
              if (column > 0 &&
                  this.pixels[pixelIndex - 1] != 0) {
                pixelOrOutlineColor = color;
              } else {
                if (row > 0 &&
                    this.pixels[pixelIndex - this.width] != 0) {
                  pixelOrOutlineColor = color;
                } else {
                  if (column < this.width - 1 &&
                      this.pixels[pixelIndex + 1] != 0) {
                    pixelOrOutlineColor = color;
                  } else {
                    if (row < this.height - 1 &&
                        this.pixels[pixelIndex + this.width] != 0) {
                      pixelOrOutlineColor = color;
                    }
                  }
                }
              }
            }
            outlinedPixels[pixelIndex++] = pixelOrOutlineColor;
          }
        }
        this.pixels = outlinedPixels;
    }

    private final static void blitColorKeyAlpha(int[] destinationPixels, int[] sourcePixels, int sourcePixel, int sourceIndex, int destinationIndex, int drawWidth, int drawHeight, int destinationRowSkip, int sourceRowSkip, int alpha256) {
        int destinationWriteIndex = 0;
        int inverseAlpha256;
        int negativeRow;
        int negativeColumn;
        int destinationPixel;
        inverseAlpha256 = 256 - alpha256;
        negativeRow = -drawHeight;
        while (true) {
          if (negativeRow >= 0) {
            return;
          }
          negativeColumn = -drawWidth;
          while (true) {
            if (negativeColumn >= 0) {
              destinationIndex = destinationIndex + destinationRowSkip;
              sourceIndex = sourceIndex + sourceRowSkip;
              negativeRow++;
              break;
            }
            sourcePixel = sourcePixels[sourceIndex++];
            if (sourcePixel == 0) {
              destinationIndex++;
              negativeColumn++;
              continue;
            }
            destinationPixel = destinationPixels[destinationIndex];
            destinationWriteIndex = destinationIndex;
            destinationIndex++;
            destinationPixels[destinationWriteIndex] = ((sourcePixel & 16711935) * alpha256 + (destinationPixel & 16711935) * inverseAlpha256 & -16711936) + ((sourcePixel & 65280) * alpha256 + (destinationPixel & 65280) * inverseAlpha256 & 16711680) >> 8;
            negativeColumn++;
          }
        }
    }

    final void drawMultiply(int x, int y) {
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
            Sprite.blitMultiply(0, SoftwareRasterizer.framebuffer, this.pixels, 0, sourceIndex, destinationIndex, drawWidth, drawHeight, destinationRowSkip, sourceRowSkip);
            return;
        }
    }

    void drawScaled(int x, int y, int destinationWidth, int destinationHeight) {
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
            Sprite.blitColorKeyScaled(SoftwareRasterizer.framebuffer, this.pixels, 0, sourceX16, sourceY16, destinationIndex, destinationRowSkip, destinationWidth, destinationHeight, stepX16, stepY16, sourceWidth);
            return;
        }
    }

    void drawScaledAlpha(int x, int y, int destinationWidth, int destinationHeight, int alpha256) {
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
            Sprite.blitColorKeyScaledAlpha(SoftwareRasterizer.framebuffer, this.pixels, 0, sourceX16, sourceY16, destinationIndex, destinationRowSkip, destinationWidth, destinationHeight, stepX16, stepY16, sourceWidth, alpha256);
            return;
        }
    }

    final void drawRotatedCentered(int centerX, int centerY, int angle, int scale) {
        int sourcePivotXQ4 = this.fullWidth << 3;
        int sourcePivotYQ4 = this.fullHeight << 3;
        centerX = (centerX << 4) + (sourcePivotXQ4 & 15);
        centerY = (centerY << 4) + (sourcePivotYQ4 & 15);
        this.rotateSmooth(sourcePivotXQ4, sourcePivotYQ4, centerX, centerY, angle, scale);
    }

    private final static void blitMultiply(int destinationPixel, int[] destinationPixels, int[] sourcePixels, int sourcePixel, int sourceIndex, int destinationIndex, int drawWidth, int drawHeight, int destinationRowSkip, int sourceRowSkip) {
        int destinationWriteIndex = 0;
        int negativeRow;
        int negativeColumn;
        int productRed;
        int productGreen;
        int productBlue;
        negativeRow = -drawHeight;
        while (true) {
          if (negativeRow >= 0) {
            return;
          }
          negativeColumn = -drawWidth;
          while (true) {
            if (negativeColumn >= 0) {
              destinationIndex = destinationIndex + destinationRowSkip;
              sourceIndex = sourceIndex + sourceRowSkip;
              negativeRow++;
              break;
            }
            sourcePixel = sourcePixels[sourceIndex++];
            if (sourcePixel == 0) {
              destinationIndex++;
              negativeColumn++;
              continue;
            }
            destinationPixel = destinationPixels[destinationIndex];
            if (destinationPixel == 0) {
              destinationIndex++;
              negativeColumn++;
              continue;
            }
            productRed = ((sourcePixel & 16711680) >>> 16) * ((destinationPixel & 16711680) >>> 16) >>> 8;
            productGreen = (sourcePixel & 65280) * (destinationPixel & 65280) >>> 24;
            productBlue = (sourcePixel & 255) * (destinationPixel & 255) >>> 8;
            destinationWriteIndex = destinationIndex;
            destinationIndex++;
            destinationPixels[destinationWriteIndex] = (productRed << 16) + (productGreen << 8) + productBlue;
            negativeColumn++;
          }
        }
    }

    private final static void blitColorKeyScaledAlpha(int[] destinationPixels, int[] sourcePixels, int sourcePixel, int sourceX16, int sourceY16, int destinationIndex, int destinationRowSkip, int drawWidth, int drawHeight, int stepX16, int stepY16, int sourceWidth, int alpha256) {
        int negativeRow = 0;
        int sourceRowOffset = 0;
        int negativeColumn = 0;
        int destinationWriteIndex = 0;
        int destinationPixel = 0;
        int inverseAlpha256 = 256 - alpha256;
        int rowSourceX16 = sourceX16;
        for (negativeRow = -drawHeight; negativeRow < 0; negativeRow++) {
            sourceRowOffset = (sourceY16 >> 16) * sourceWidth;
            for (negativeColumn = -drawWidth; negativeColumn < 0; negativeColumn++) {
                sourcePixel = sourcePixels[(sourceX16 >> 16) + sourceRowOffset];
                if (sourcePixel != 0) {
                    destinationPixel = destinationPixels[destinationIndex];
                    destinationWriteIndex = destinationIndex;
                    destinationIndex++;
                    destinationPixels[destinationWriteIndex] = ((sourcePixel & 16711935) * alpha256 + (destinationPixel & 16711935) * inverseAlpha256 & -16711936) + ((sourcePixel & 65280) * alpha256 + (destinationPixel & 65280) * inverseAlpha256 & 16711680) >> 8;
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

    private final static void blitGrayTinted(int[] destinationPixels, int[] sourcePixels, int sourcePixel, int sourceIndex, int destinationIndex, int widthThenNegativeTail, int drawHeight, int destinationRowSkip, int sourceRowSkip, int tintColor) {
        int destinationWriteIndex = 0;
        int destinationWriteIndex2 = 0;
        int tintRed;
        int tintGreen;
        int tintBlue;
        int negativeQuadCount;
        int negativeRowPixelCount;
        int negativeRow;
        int negativeColumn;
        int sourceRed;
        int sourceGreen;
        int sourceBlue;
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
            if (sourcePixel == 0) {
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
                destinationWriteIndex = destinationIndex;
                destinationIndex++;
                destinationPixels[destinationWriteIndex] = (tintRed * (256 - sourceRed) + 255 * (sourceRed - 128) >> 7 << 16) + (tintGreen * (256 - sourceGreen) + 255 * (sourceGreen - 128) >> 7 << 8) + (tintBlue * (256 - sourceBlue) + 255 * (sourceBlue - 128) >> 7);
                negativeColumn++;
                continue;
              }
              destinationWriteIndex2 = destinationIndex;
              destinationIndex++;
              destinationPixels[destinationWriteIndex2] = (sourceRed * tintRed >> 7 << 16) + (sourceGreen * tintGreen >> 7 << 8) + (sourceBlue * tintBlue >> 7);
              negativeColumn++;
              continue;
            }
            destinationPixels[destinationIndex++] = sourcePixel;
            negativeColumn++;
          }
        }
    }

    void drawAdditive(int x, int y, int intensity256) {
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
            if (intensity256 == 256) {
                Sprite.blitAdditive(0, 0, 0, SoftwareRasterizer.framebuffer, this.pixels, sourceIndex, 0, destinationIndex, 0, drawWidth, drawHeight, destinationRowSkip, sourceRowSkip);
            } else {
                Sprite.blitAdditiveIntensity(0, 0, 0, SoftwareRasterizer.framebuffer, this.pixels, sourceIndex, 0, destinationIndex, 0, drawWidth, drawHeight, destinationRowSkip, sourceRowSkip, intensity256);
            }
            return;
        }
    }

    final void rotateClockwise() {
        int sourceRow = 0;
        int destinationWriteIndex = 0;
        int sourceColumn = 0;
        int[] rotatedPixels = new int[this.width * this.height];
        int destinationIndex = 0;
        int originalTrimY;
        int originalHeight;
        int originalFullHeight;
        for (sourceColumn = 0; sourceColumn < this.width; sourceColumn++) {
            for (sourceRow = this.height - 1; sourceRow >= 0; sourceRow--) {
                destinationWriteIndex = destinationIndex;
                destinationIndex++;
                rotatedPixels[destinationWriteIndex] = this.pixels[sourceColumn + sourceRow * this.width];
            }
        }
        this.pixels = rotatedPixels;
        originalTrimY = this.trimY;
        this.trimY = this.trimX;
        this.trimX = this.fullHeight - this.height - originalTrimY;
        originalHeight = this.height;
        this.height = this.width;
        this.width = originalHeight;
        originalFullHeight = this.fullHeight;
        this.fullHeight = this.fullWidth;
        this.fullWidth = originalFullHeight;
    }

    final void setAsRasterTarget() {
        SoftwareRasterizer.setRasterTarget(this.pixels, this.width, this.height);
    }

    final Sprite copyMirroredHorizontally() {
        int copyRow = 0;
        int copyColumn = 0;
        Sprite mirroredSprite = new Sprite(this.width, this.height);
        mirroredSprite.fullWidth = this.fullWidth;
        mirroredSprite.fullHeight = this.fullHeight;
        mirroredSprite.trimX = this.fullWidth - this.width - this.trimX;
        mirroredSprite.trimY = this.trimY;
        for (copyRow = 0; copyRow < this.height; copyRow++) {
            for (copyColumn = 0; copyColumn < this.width; copyColumn++) {
                mirroredSprite.pixels[copyRow * this.width + copyColumn] = this.pixels[copyRow * this.width + this.width - 1 - copyColumn];
            }
        }
        return mirroredSprite;
    }

    void drawHalfSize(int x, int y) {
        x = x + (this.trimX >> 1);
        y = y + (this.trimY >> 1);
        int firstSourceX = x < SoftwareRasterizer.clipLeft ? SoftwareRasterizer.clipLeft - x << 1 : 0;
        int sourceRightExclusive = x + (this.width >> 1) > SoftwareRasterizer.clipRight ? SoftwareRasterizer.clipRight - x << 1 : this.width;
        int firstSourceY = y < SoftwareRasterizer.clipTop ? SoftwareRasterizer.clipTop - y << 1 : 0;
        int sourceBottomExclusive = y + (this.height >> 1) > SoftwareRasterizer.clipBottom ? SoftwareRasterizer.clipBottom - y << 1 : this.height;
        Sprite.blitHalfSize(this.pixels, firstSourceY * this.width + firstSourceX, (y + (firstSourceY >> 1)) * SoftwareRasterizer.stride + (x + (firstSourceX >> 1)), (this.width << 1) - (sourceRightExclusive - firstSourceX) + (this.width & 1), SoftwareRasterizer.stride - (sourceRightExclusive - firstSourceX >> 1), this.width, sourceRightExclusive - firstSourceX >> 1, sourceBottomExclusive - firstSourceY >> 1);
    }

    void draw(int x, int y) {
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
            Sprite.blitColorKey(SoftwareRasterizer.framebuffer, this.pixels, 0, sourceIndex, destinationIndex, drawWidth, drawHeight, destinationRowSkip, sourceRowSkip);
            return;
        }
    }

    void drawGrayTinted(int x, int y, int tintColor) {
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
            Sprite.blitGrayTinted(SoftwareRasterizer.framebuffer, this.pixels, 0, sourceIndex, destinationIndex, drawWidth, drawHeight, destinationRowSkip, sourceRowSkip, tintColor);
            return;
        }
    }

    private final static void blitColorKey(int[] destinationPixels, int[] sourcePixels, int sourcePixel, int sourceIndex, int destinationIndex, int widthThenNegativeTail, int drawHeight, int destinationRowSkip, int sourceRowSkip) {
        int negativeQuadCount;
        int negativeRow;
        int quadOrTailCounter;
        negativeQuadCount = -(widthThenNegativeTail >> 2);
        widthThenNegativeTail = -(widthThenNegativeTail & 3);
        negativeRow = -drawHeight;
        colorKeyRows: while (true) {
          if (negativeRow >= 0) {
            return;
          }
          quadOrTailCounter = negativeQuadCount;
          while (true) {
            if (quadOrTailCounter >= 0) {
              quadOrTailCounter = widthThenNegativeTail;
              while (true) {
                if (quadOrTailCounter >= 0) {
                  destinationIndex = destinationIndex + destinationRowSkip;
                  sourceIndex = sourceIndex + sourceRowSkip;
                  negativeRow++;
                  continue colorKeyRows;
                }
                sourcePixel = sourcePixels[sourceIndex++];
                if (sourcePixel == 0) {
                  destinationIndex++;
                  quadOrTailCounter++;
                  continue;
                }
                destinationPixels[destinationIndex++] = sourcePixel;
                quadOrTailCounter++;
              }
            }
            sourcePixel = sourcePixels[sourceIndex++];
            if (sourcePixel == 0) {
              destinationIndex++;
            } else {
              destinationPixels[destinationIndex++] = sourcePixel;
            }
            sourcePixel = sourcePixels[sourceIndex++];
            if (sourcePixel == 0) {
              destinationIndex++;
            } else {
              destinationPixels[destinationIndex++] = sourcePixel;
            }
            sourcePixel = sourcePixels[sourceIndex++];
            if (sourcePixel == 0) {
              destinationIndex++;
            } else {
              destinationPixels[destinationIndex++] = sourcePixel;
            }
            sourcePixel = sourcePixels[sourceIndex++];
            if (sourcePixel == 0) {
              destinationIndex++;
              quadOrTailCounter++;
              continue;
            }
            destinationPixels[destinationIndex++] = sourcePixel;
            quadOrTailCounter++;
          }
        }
    }

    void drawQuarterSize(int x, int y) {
        int sourceBlockY = 0;
        int sampleRow = 0;
        int sampleColumn = 0;
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
        int sourceIndex;
        int destinationIndex;
        int sourceBlockX;
        int sourcePixelOrDestination;
        int sumRedBlue;
        int sumGreen;
        int sampleOrBackgroundPixel;
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
        for (sourceBlockY = firstSourceY; sourceBlockY <= lastBlockSourceY; sourceBlockY += 4) {
          sourceIndex = sourceBlockY * this.width + firstSourceX;
          destinationIndex = (y + (sourceBlockY >> 2)) * SoftwareRasterizer.stride + (x + (firstSourceX >> 2));
          sourceBlockX = firstSourceX;
          while (sourceBlockX <= lastBlockSourceX) {
            sourcePixelOrDestination = 0;
            sumRedBlue = 0;
            sumGreen = 0;
            for (sampleRow = 0; sampleRow < 4; sampleRow++) {
              for (sampleColumn = 0; sampleColumn < 4; sampleColumn++) {
                sampleOrBackgroundPixel = this.pixels[sourceIndex + sampleRow * this.width + sampleColumn];
                if (sampleOrBackgroundPixel == 0) {
                  sampleOrBackgroundPixel = SoftwareRasterizer.framebuffer[destinationIndex];
                }
                sumRedBlue = sumRedBlue + (sampleOrBackgroundPixel & 16711935);
                sumGreen = sumGreen + (sampleOrBackgroundPixel & 65280);
              }
            }
            SoftwareRasterizer.framebuffer[destinationIndex] = (sumRedBlue & 267390960 | sumGreen & 1044480) >> 4;
            sourceBlockX += 4;
            sourceIndex += 4;
            destinationIndex++;
          }
        }
    }

    private final static void blitHalfSize(int[] sourcePixels, int sourceIndex, int destinationIndex, int sourceRowSkip, int destinationRowSkip, int sourceWidth, int drawWidth, int drawHeight) {
        int sampleTopLeft = 0;
        int sampleTopRight = 0;
        int sampleBottomLeft = 0;
        int sampleBottomRight = 0;
        int destinationWriteIndex = 0;
        int row;
        int column;
        int samplePixel;
        int destinationRedBlue;
        int destinationGreen;
        int sumRedBlue;
        int sumGreen;
        int topRightSampleRgb;
        int bottomLeftSampleRgb;
        int bottomRightSampleRgb;
        row = 0;
        while (row < drawHeight) {
          column = 0;
          while (column < drawWidth) {
            destinationRedBlue = SoftwareRasterizer.framebuffer[destinationIndex] & 16711935;
            destinationGreen = SoftwareRasterizer.framebuffer[destinationIndex] & 65280;
            sumRedBlue = 0;
            sumGreen = 0;
            sampleTopLeft = sourcePixels[sourceIndex];
            samplePixel = sampleTopLeft;
            if (sampleTopLeft != 0) {
              sumRedBlue = sumRedBlue + (samplePixel & 16711935);
              sumGreen = sumGreen + (samplePixel & 65280);
            } else {
              sumRedBlue = sumRedBlue + destinationRedBlue;
              sumGreen = sumGreen + destinationGreen;
            }
            sampleTopRight = sourcePixels[sourceIndex + 1];
            topRightSampleRgb = sampleTopRight;
            if (sampleTopRight != 0) {
              sumRedBlue = sumRedBlue + (topRightSampleRgb & 16711935);
              sumGreen = sumGreen + (topRightSampleRgb & 65280);
            } else {
              sumRedBlue = sumRedBlue + destinationRedBlue;
              sumGreen = sumGreen + destinationGreen;
            }
            sampleBottomLeft = sourcePixels[sourceIndex + sourceWidth];
            bottomLeftSampleRgb = sampleBottomLeft;
            if (sampleBottomLeft != 0) {
              sumRedBlue = sumRedBlue + (bottomLeftSampleRgb & 16711935);
              sumGreen = sumGreen + (bottomLeftSampleRgb & 65280);
            } else {
              sumRedBlue = sumRedBlue + destinationRedBlue;
              sumGreen = sumGreen + destinationGreen;
            }
            sampleBottomRight = sourcePixels[sourceIndex + sourceWidth + 1];
            bottomRightSampleRgb = sampleBottomRight;
            if (sampleBottomRight != 0) {
              sumRedBlue = sumRedBlue + (bottomRightSampleRgb & 16711935);
              sumGreen = sumGreen + (bottomRightSampleRgb & 65280);
            } else {
              sumRedBlue = sumRedBlue + destinationRedBlue;
              sumGreen = sumGreen + destinationGreen;
            }
            destinationWriteIndex = destinationIndex;
            destinationIndex++;
            SoftwareRasterizer.framebuffer[destinationWriteIndex] = (sumRedBlue & 66847740 | sumGreen & 261120) >> 2;
            column++;
            sourceIndex += 2;
          }
          row++;
          sourceIndex = sourceIndex + sourceRowSkip;
          destinationIndex = destinationIndex + destinationRowSkip;
        }
    }

    private final static void blitSilhouette(int[] destinationPixels, int[] sourcePixels, int color, int sourceIndex, int destinationIndex, int widthThenNegativeTail, int drawHeight, int destinationRowSkip, int sourceRowSkip) {
        int negativeQuadCount;
        int negativeRow;
        int quadOrTailCounter;
        negativeQuadCount = -(widthThenNegativeTail >> 2);
        widthThenNegativeTail = -(widthThenNegativeTail & 3);
        negativeRow = -drawHeight;
        silhouetteRows: while (true) {
          if (negativeRow >= 0) {
            return;
          }
          quadOrTailCounter = negativeQuadCount;
          while (true) {
            if (quadOrTailCounter >= 0) {
              quadOrTailCounter = widthThenNegativeTail;
              while (true) {
                if (quadOrTailCounter >= 0) {
                  destinationIndex = destinationIndex + destinationRowSkip;
                  sourceIndex = sourceIndex + sourceRowSkip;
                  negativeRow++;
                  continue silhouetteRows;
                }
                if (sourcePixels[sourceIndex++] == 0) {
                  destinationIndex++;
                  quadOrTailCounter++;
                  continue;
                }
                destinationPixels[destinationIndex++] = color;
                quadOrTailCounter++;
              }
            }
            if (sourcePixels[sourceIndex++] == 0) {
              destinationIndex++;
            } else {
              destinationPixels[destinationIndex++] = color;
            }
            if (sourcePixels[sourceIndex++] == 0) {
              destinationIndex++;
            } else {
              destinationPixels[destinationIndex++] = color;
            }
            if (sourcePixels[sourceIndex++] == 0) {
              destinationIndex++;
            } else {
              destinationPixels[destinationIndex++] = color;
            }
            if (sourcePixels[sourceIndex++] == 0) {
              destinationIndex++;
              quadOrTailCounter++;
              continue;
            }
            destinationPixels[destinationIndex++] = color;
            quadOrTailCounter++;
          }
        }
    }

    final void drawScaledSilhouette(int x, int y, int destinationWidth, int destinationHeight, int color) {
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
            if (destinationWidth == this.width && destinationHeight == this.height) {
                this.drawSilhouette(x, y, color);
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
            Sprite.blitScaledSilhouette(SoftwareRasterizer.framebuffer, this.pixels, 0, sourceX16, sourceY16, destinationIndex, destinationRowSkip, destinationWidth, destinationHeight, stepX16, stepY16, sourceWidth, color);
            return;
        }
    }

    private final static void blitAdditiveIntensity(int sourceColorScratch, int blendScratch, int rgbSum, int[] destinationPixels, int[] sourcePixels, int sourceIndex, int negativeColumnScratch, int destinationIndex, int negativeRowScratch, int drawWidth, int drawHeight, int destinationRowSkip, int sourceRowSkip, int intensity256) {
        int destinationWriteIndex = 0;
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
            blendScratch = (sourceColorScratch & 16711935) * intensity256;
            sourceColorScratch = (blendScratch & -16711936) + (sourceColorScratch * intensity256 - blendScratch & 16711680) >>> 8;
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

    private final static void blitUnmasked(int[] destinationPixels, int[] sourcePixels, int sourceIndex, int destinationIndex, int drawWidth, int drawHeight, int destinationRowSkip, int sourceRowSkip) {
        int negativeRow = 0;
        int quadEndThenRowEnd = 0;
        for (negativeRow = -drawHeight; negativeRow < 0; negativeRow++) {
            quadEndThenRowEnd = destinationIndex + drawWidth - 3;
            while (destinationIndex < quadEndThenRowEnd) {
                destinationPixels[destinationIndex++] = sourcePixels[sourceIndex++];
                destinationPixels[destinationIndex++] = sourcePixels[sourceIndex++];
                destinationPixels[destinationIndex++] = sourcePixels[sourceIndex++];
                destinationPixels[destinationIndex++] = sourcePixels[sourceIndex++];
            }
            quadEndThenRowEnd += 3;
            while (destinationIndex < quadEndThenRowEnd) {
                destinationPixels[destinationIndex++] = sourcePixels[sourceIndex++];
            }
            destinationIndex = destinationIndex + destinationRowSkip;
            sourceIndex = sourceIndex + sourceRowSkip;
        }
    }

    void drawUnmasked(int x, int y) {
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
            Sprite.blitUnmasked(SoftwareRasterizer.framebuffer, this.pixels, sourceIndex, destinationIndex, drawWidth, drawHeight, destinationRowSkip, sourceRowSkip);
            return;
        }
    }

    private final static void blitGrayModulated(int[] destinationPixels, int[] sourcePixels, int sourcePixel, int sourceIndex, int destinationIndex, int negativeColumnScratch, int negativeRowScratch, int drawWidth, int drawHeight, int destinationRowSkip, int sourceRowSkip, int tintColor) {
        int destinationWriteIndex2 = 0;
        int tintRedBlue;
        int tintGreen;
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
            if (sourcePixel == 0) {
              destinationIndex++;
              negativeColumnScratch++;
              continue;
            }
            if (sourcePixel >> 8 != (sourcePixel & 65535)) {
              destinationPixels[destinationIndex++] = sourcePixel;
              negativeColumnScratch++;
              continue;
            }
            sourcePixel = sourcePixel & 255;
            destinationWriteIndex2 = destinationIndex;
            destinationIndex++;
            destinationPixels[destinationWriteIndex2] = (sourcePixel * tintRedBlue >> 8 & 16711934) + (sourcePixel * tintGreen & 65280) + 1;
            negativeColumnScratch++;
          }
        }
    }

    final void rotateSmooth(int sourcePivotX, int sourcePivotY, int destinationX, int destinationY, int angle, int scale) {
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
        int destinationIndex;
        int rowSkip;
        double inverseScaleFactor;
        int inverseSinStep;
        int inverseCosStep;
        int destinationOffsetX;
        int destinationOffsetY;
        int rowSourceXQ12;
        int rowSourceYQ12;
        int sourcePixelX;
        int sourcePixelY;
        int clipScratch;
        int negativeRowCounter;
        int sourceXQ12;
        int sourceYQ12;
        int negativePixelCounter;
        int canSample;
        int leftDownPixelX;
        int leftUpPixelX;
        int leftDownPixelY;
        int leftUpPixelY;
        int leftDownRightExcessOrSkipCount;
        int leftUpRightExcessOrSkipCount;
        int leftDownNegativeRow;
        int leftUpNegativeRow;
        int leftDownSourceXQ12;
        int leftUpSourceXQ12;
        int leftDownSourceYQ12;
        int leftUpSourceYQ12;
        int leftDownNegativePixel;
        int leftUpNegativePixel;
        int leftDownSampleGate;
        int leftUpSampleGate;
        int rightUpPixelX;
        int rightUpPixelY;
        int rightUpLeftPaddingOrSkipCount;
        int rightUpNegativeRow;
        int rightUpSourceXQ12;
        int rightUpSourceYQ12;
        int rightUpNegativePixel;
        int rightUpSampleGate;
        int leftDownTopPaddingOrSkipCount;
        int leftUpBottomExcessOrSkipCount;
        int topPaddingOffsetThenSkipPixels;
        int bottomExcessThenSkipPixels;
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
        destinationIndex = topBound * SoftwareRasterizer.stride + leftBound;
        rowSkip = SoftwareRasterizer.stride + rightThenNegativeWidth;
        inverseScaleFactor = 16777216.0 / (double)scale;
        inverseSinStep = (int)Math.floor(Math.sin(angleRadians) * inverseScaleFactor + 0.5);
        inverseCosStep = (int)Math.floor(Math.cos(angleRadians) * inverseScaleFactor + 0.5);
        destinationOffsetX = (leftBound << 4) + 8 - destinationX;
        destinationOffsetY = (topBound << 4) + 8 - destinationY;
        rowSourceXQ12 = (sourcePivotX << 8) - 2048 - (destinationOffsetY * inverseSinStep >> 4);
        rowSourceYQ12 = (sourcePivotY << 8) - 2048 + (destinationOffsetY * inverseCosStep >> 4);
        if (inverseCosStep >= 0) {
          if (inverseSinStep >= 0) {
            negativeRowCounter = bottomThenNegativeHeight;
            while (negativeRowCounter < 0) {
              sourceXQ12 = rowSourceXQ12 + (destinationOffsetX * inverseCosStep >> 4);
              sourceYQ12 = rowSourceYQ12 + (destinationOffsetX * inverseSinStep >> 4);
              negativePixelCounter = rightThenNegativeWidth;
              canSample = 0;
              clipScratch = sourceXQ12 + 4096;
              if (clipScratch < 0) {
                if (inverseCosStep != 0) {
                  clipScratch = (inverseCosStep - 1 - clipScratch) / inverseCosStep;
                  negativePixelCounter = negativePixelCounter + clipScratch;
                  sourceXQ12 = sourceXQ12 + inverseCosStep * clipScratch;
                  sourceYQ12 = sourceYQ12 + inverseSinStep * clipScratch;
                  destinationIndex = destinationIndex + clipScratch;
                  canSample = 1;
                } else {
                  destinationIndex = destinationIndex - negativePixelCounter;
                }
              } else {
                canSample = 1;
              }
              if (canSample != 0) {
                canSample = 0;
                topPaddingOffsetThenSkipPixels = sourceYQ12 + 4096;
                if (topPaddingOffsetThenSkipPixels < 0) {
                  if (inverseSinStep != 0) {
                    topPaddingOffsetThenSkipPixels = (inverseSinStep - 1 - topPaddingOffsetThenSkipPixels) / inverseSinStep;
                    negativePixelCounter = negativePixelCounter + topPaddingOffsetThenSkipPixels;
                    sourceXQ12 = sourceXQ12 + inverseCosStep * topPaddingOffsetThenSkipPixels;
                    sourceYQ12 = sourceYQ12 + inverseSinStep * topPaddingOffsetThenSkipPixels;
                    destinationIndex = destinationIndex + topPaddingOffsetThenSkipPixels;
                    canSample = 1;
                  } else {
                    destinationIndex = destinationIndex - negativePixelCounter;
                  }
                } else {
                  canSample = 1;
                }
                if (canSample != 0) {
                  while (negativePixelCounter < 0) {
                    sourcePixelX = sourceXQ12 >> 12;
                    if (sourceXQ12 >> 12 < this.width) {
                      sourcePixelY = sourceYQ12 >> 12;
                      if (sourceYQ12 >> 12 < this.height) {
                        this.sampleBilinear(destinationIndex, sourcePixelX, sourcePixelY, sourceXQ12, sourceYQ12);
                        negativePixelCounter++;
                        sourceXQ12 = sourceXQ12 + inverseCosStep;
                        sourceYQ12 = sourceYQ12 + inverseSinStep;
                        destinationIndex++;
                        continue;
                      }
                    }
                    break;
                  }
                  destinationIndex = destinationIndex - negativePixelCounter;
                }
              }
              negativeRowCounter++;
              rowSourceXQ12 = rowSourceXQ12 - inverseSinStep;
              rowSourceYQ12 = rowSourceYQ12 + inverseCosStep;
              destinationIndex = destinationIndex + rowSkip;
            }
            return;
          }
          rightUpNegativeRow = bottomThenNegativeHeight;
          while (rightUpNegativeRow < 0) {
            rightUpSourceXQ12 = rowSourceXQ12 + (destinationOffsetX * inverseCosStep >> 4);
            rightUpSourceYQ12 = rowSourceYQ12 + (destinationOffsetX * inverseSinStep >> 4);
            rightUpNegativePixel = rightThenNegativeWidth;
            rightUpSampleGate = 0;
            rightUpLeftPaddingOrSkipCount = rightUpSourceXQ12 + 4096;
            if (rightUpLeftPaddingOrSkipCount < 0) {
              if (inverseCosStep != 0) {
                rightUpLeftPaddingOrSkipCount = (inverseCosStep - 1 - rightUpLeftPaddingOrSkipCount) / inverseCosStep;
                rightUpNegativePixel = rightUpNegativePixel + rightUpLeftPaddingOrSkipCount;
                rightUpSourceXQ12 = rightUpSourceXQ12 + inverseCosStep * rightUpLeftPaddingOrSkipCount;
                rightUpSourceYQ12 = rightUpSourceYQ12 + inverseSinStep * rightUpLeftPaddingOrSkipCount;
                destinationIndex = destinationIndex + rightUpLeftPaddingOrSkipCount;
                rightUpSampleGate = 1;
              } else {
                destinationIndex = destinationIndex - rightUpNegativePixel;
              }
            } else {
              rightUpSampleGate = 1;
            }
            if (rightUpSampleGate != 0) {
              rightUpSampleGate = 0;
              bottomExcessThenSkipPixels = rightUpSourceYQ12 - (this.height << 12);
              if (bottomExcessThenSkipPixels >= 0) {
                if (inverseSinStep != 0) {
                  bottomExcessThenSkipPixels = (inverseSinStep - bottomExcessThenSkipPixels) / inverseSinStep;
                  rightUpNegativePixel = rightUpNegativePixel + bottomExcessThenSkipPixels;
                  rightUpSourceXQ12 = rightUpSourceXQ12 + inverseCosStep * bottomExcessThenSkipPixels;
                  rightUpSourceYQ12 = rightUpSourceYQ12 + inverseSinStep * bottomExcessThenSkipPixels;
                  destinationIndex = destinationIndex + bottomExcessThenSkipPixels;
                  rightUpSampleGate = 1;
                } else {
                  destinationIndex = destinationIndex - rightUpNegativePixel;
                }
              } else {
                rightUpSampleGate = 1;
              }
              if (rightUpSampleGate != 0) {
                while (rightUpNegativePixel < 0) {
                  if (rightUpSourceYQ12 >= -4096) {
                    rightUpPixelX = rightUpSourceXQ12 >> 12;
                    if (rightUpSourceXQ12 >> 12 < this.width) {
                      rightUpPixelY = rightUpSourceYQ12 >> 12;
                      this.sampleBilinear(destinationIndex, rightUpPixelX, rightUpPixelY, rightUpSourceXQ12, rightUpSourceYQ12);
                      rightUpNegativePixel++;
                      rightUpSourceXQ12 = rightUpSourceXQ12 + inverseCosStep;
                      rightUpSourceYQ12 = rightUpSourceYQ12 + inverseSinStep;
                      destinationIndex++;
                      continue;
                    }
                  }
                  break;
                }
                destinationIndex = destinationIndex - rightUpNegativePixel;
              }
            }
            rightUpNegativeRow++;
            rowSourceXQ12 = rowSourceXQ12 - inverseSinStep;
            rowSourceYQ12 = rowSourceYQ12 + inverseCosStep;
            destinationIndex = destinationIndex + rowSkip;
          }
          return;
        }
        if (inverseSinStep >= 0) {
          leftDownNegativeRow = bottomThenNegativeHeight;
          while (leftDownNegativeRow < 0) {
            leftDownSourceXQ12 = rowSourceXQ12 + (destinationOffsetX * inverseCosStep >> 4);
            leftDownSourceYQ12 = rowSourceYQ12 + (destinationOffsetX * inverseSinStep >> 4);
            leftDownNegativePixel = rightThenNegativeWidth;
            leftDownSampleGate = 0;
            leftDownRightExcessOrSkipCount = leftDownSourceXQ12 - (this.width << 12);
            if (leftDownRightExcessOrSkipCount >= 0) {
              if (inverseCosStep != 0) {
                leftDownRightExcessOrSkipCount = (inverseCosStep - leftDownRightExcessOrSkipCount) / inverseCosStep;
                leftDownNegativePixel = leftDownNegativePixel + leftDownRightExcessOrSkipCount;
                leftDownSourceXQ12 = leftDownSourceXQ12 + inverseCosStep * leftDownRightExcessOrSkipCount;
                leftDownSourceYQ12 = leftDownSourceYQ12 + inverseSinStep * leftDownRightExcessOrSkipCount;
                destinationIndex = destinationIndex + leftDownRightExcessOrSkipCount;
                leftDownSampleGate = 1;
              } else {
                destinationIndex = destinationIndex - leftDownNegativePixel;
              }
            } else {
              leftDownSampleGate = 1;
            }
            if (leftDownSampleGate != 0) {
              leftDownSampleGate = 0;
              leftDownTopPaddingOrSkipCount = leftDownSourceYQ12 + 4096;
              if (leftDownTopPaddingOrSkipCount < 0) {
                if (inverseSinStep != 0) {
                  leftDownTopPaddingOrSkipCount = (inverseSinStep - 1 - leftDownTopPaddingOrSkipCount) / inverseSinStep;
                  leftDownNegativePixel = leftDownNegativePixel + leftDownTopPaddingOrSkipCount;
                  leftDownSourceXQ12 = leftDownSourceXQ12 + inverseCosStep * leftDownTopPaddingOrSkipCount;
                  leftDownSourceYQ12 = leftDownSourceYQ12 + inverseSinStep * leftDownTopPaddingOrSkipCount;
                  destinationIndex = destinationIndex + leftDownTopPaddingOrSkipCount;
                  leftDownSampleGate = 1;
                } else {
                  destinationIndex = destinationIndex - leftDownNegativePixel;
                }
              } else {
                leftDownSampleGate = 1;
              }
              if (leftDownSampleGate != 0) {
                while (leftDownNegativePixel < 0) {
                  if (leftDownSourceXQ12 >= -4096) {
                    leftDownPixelY = leftDownSourceYQ12 >> 12;
                    if (leftDownSourceYQ12 >> 12 < this.height) {
                      leftDownPixelX = leftDownSourceXQ12 >> 12;
                      this.sampleBilinear(destinationIndex, leftDownPixelX, leftDownPixelY, leftDownSourceXQ12, leftDownSourceYQ12);
                      leftDownNegativePixel++;
                      leftDownSourceXQ12 = leftDownSourceXQ12 + inverseCosStep;
                      leftDownSourceYQ12 = leftDownSourceYQ12 + inverseSinStep;
                      destinationIndex++;
                      continue;
                    }
                  }
                  break;
                }
                destinationIndex = destinationIndex - leftDownNegativePixel;
              }
            }
            leftDownNegativeRow++;
            rowSourceXQ12 = rowSourceXQ12 - inverseSinStep;
            rowSourceYQ12 = rowSourceYQ12 + inverseCosStep;
            destinationIndex = destinationIndex + rowSkip;
          }
          return;
        }
        leftUpNegativeRow = bottomThenNegativeHeight;
        while (leftUpNegativeRow < 0) {
          leftUpSourceXQ12 = rowSourceXQ12 + (destinationOffsetX * inverseCosStep >> 4);
          leftUpSourceYQ12 = rowSourceYQ12 + (destinationOffsetX * inverseSinStep >> 4);
          leftUpNegativePixel = rightThenNegativeWidth;
          leftUpSampleGate = 0;
          leftUpRightExcessOrSkipCount = leftUpSourceXQ12 - (this.width << 12);
          if (leftUpRightExcessOrSkipCount >= 0) {
            if (inverseCosStep != 0) {
              leftUpRightExcessOrSkipCount = (inverseCosStep - leftUpRightExcessOrSkipCount) / inverseCosStep;
              leftUpNegativePixel = leftUpNegativePixel + leftUpRightExcessOrSkipCount;
              leftUpSourceXQ12 = leftUpSourceXQ12 + inverseCosStep * leftUpRightExcessOrSkipCount;
              leftUpSourceYQ12 = leftUpSourceYQ12 + inverseSinStep * leftUpRightExcessOrSkipCount;
              destinationIndex = destinationIndex + leftUpRightExcessOrSkipCount;
              leftUpSampleGate = 1;
            } else {
              destinationIndex = destinationIndex - leftUpNegativePixel;
            }
          } else {
            leftUpSampleGate = 1;
          }
          if (leftUpSampleGate != 0) {
            leftUpSampleGate = 0;
            leftUpBottomExcessOrSkipCount = leftUpSourceYQ12 - (this.height << 12);
            if (leftUpBottomExcessOrSkipCount >= 0) {
              if (inverseSinStep != 0) {
                leftUpBottomExcessOrSkipCount = (inverseSinStep - leftUpBottomExcessOrSkipCount) / inverseSinStep;
                leftUpNegativePixel = leftUpNegativePixel + leftUpBottomExcessOrSkipCount;
                leftUpSourceXQ12 = leftUpSourceXQ12 + inverseCosStep * leftUpBottomExcessOrSkipCount;
                leftUpSourceYQ12 = leftUpSourceYQ12 + inverseSinStep * leftUpBottomExcessOrSkipCount;
                destinationIndex = destinationIndex + leftUpBottomExcessOrSkipCount;
                leftUpSampleGate = 1;
              } else {
                destinationIndex = destinationIndex - leftUpNegativePixel;
              }
            } else {
              leftUpSampleGate = 1;
            }
            if (leftUpSampleGate != 0) {
              while (leftUpNegativePixel < 0) {
                if (leftUpSourceXQ12 >= -4096 &&
                    leftUpSourceYQ12 >= -4096) {
                  leftUpPixelX = leftUpSourceXQ12 >> 12;
                  leftUpPixelY = leftUpSourceYQ12 >> 12;
                  this.sampleBilinear(destinationIndex, leftUpPixelX, leftUpPixelY, leftUpSourceXQ12, leftUpSourceYQ12);
                  leftUpNegativePixel++;
                  leftUpSourceXQ12 = leftUpSourceXQ12 + inverseCosStep;
                  leftUpSourceYQ12 = leftUpSourceYQ12 + inverseSinStep;
                  destinationIndex++;
                  continue;
                }
                break;
              }
              destinationIndex = destinationIndex - leftUpNegativePixel;
            }
          }
          leftUpNegativeRow++;
          rowSourceXQ12 = rowSourceXQ12 - inverseSinStep;
          rowSourceYQ12 = rowSourceYQ12 + inverseCosStep;
          destinationIndex = destinationIndex + rowSkip;
        }
        return;
    }

    void drawGrayModulated(int x, int y, int tintColor) {
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
            Sprite.blitGrayModulated(SoftwareRasterizer.framebuffer, this.pixels, 0, sourceIndex, destinationIndex, 0, 0, drawWidth, drawHeight, destinationRowSkip, sourceRowSkip, tintColor);
            return;
        }
    }

    final Sprite copy() {
        int copyIndex = 0;
        Sprite copiedSprite = new Sprite(this.width, this.height);
        copiedSprite.fullWidth = this.fullWidth;
        copiedSprite.fullHeight = this.fullHeight;
        copiedSprite.trimX = this.trimX;
        copiedSprite.trimY = this.trimY;
        int pixelCount = this.pixels.length;
        for (copyIndex = 0; copyIndex < pixelCount; copyIndex++) {
            copiedSprite.pixels[copyIndex] = this.pixels[copyIndex];
        }
        return copiedSprite;
    }

    Sprite(int fullWidth, int fullHeight, int trimX, int trimY, int width, int height, int[] pixels) {
        this.fullWidth = fullWidth;
        this.fullHeight = fullHeight;
        this.trimX = trimX;
        this.trimY = trimY;
        this.width = width;
        this.height = height;
        this.pixels = pixels;
    }

    private final static void blitAdditive(int sourceColorScratch, int blendScratch, int rgbSum, int[] destinationPixels, int[] sourcePixels, int sourceIndex, int negativeColumnScratch, int destinationIndex, int negativeRowScratch, int drawWidth, int drawHeight, int destinationRowSkip, int sourceRowSkip) {
        int destinationWriteIndex = 0;
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

    void drawAlpha(int x, int y, int alpha256) {
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
            Sprite.blitColorKeyAlpha(SoftwareRasterizer.framebuffer, this.pixels, 0, sourceIndex, destinationIndex, drawWidth, drawHeight, destinationRowSkip, sourceRowSkip, alpha256);
            return;
        }
    }

    private final static void blitScaledSilhouette(int[] destinationPixels, int[] sourcePixels, int sourcePixel, int sourceX16, int sourceY16, int destinationIndex, int destinationRowSkip, int drawWidth, int drawHeight, int stepX16, int stepY16, int sourceWidth, int color) {
        int negativeRow = 0;
        int sourceRowOffset = 0;
        int negativeColumn = 0;
        int rowSourceX16 = sourceX16;
        for (negativeRow = -drawHeight; negativeRow < 0; negativeRow++) {
            sourceRowOffset = (sourceY16 >> 16) * sourceWidth;
            for (negativeColumn = -drawWidth; negativeColumn < 0; negativeColumn++) {
                sourcePixel = sourcePixels[(sourceX16 >> 16) + sourceRowOffset];
                if (sourcePixel != 0) {
                    destinationPixels[destinationIndex++] = color;
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

    Sprite(int width, int height) {
        this.pixels = new int[width * height];
        this.fullWidth = width;
        this.width = width;
        this.fullHeight = height;
        this.height = height;
        this.trimY = 0;
        this.trimX = 0;
    }

    Sprite(byte[] encodedImageBytes, java.awt.Component imageObserverComponent) {
        Throwable caughtImageLoadError = null;
        java.awt.Image decodedImage = null;
        InterruptedException interruptedImageLoadError = null;
        java.awt.MediaTracker imageLoadTracker = null;
        java.awt.image.PixelGrabber pixelGrabber = null;
        try {
          decodedImage = java.awt.Toolkit.getDefaultToolkit().createImage(encodedImageBytes);
          imageLoadTracker = new java.awt.MediaTracker(imageObserverComponent);
          imageLoadTracker.addImage(decodedImage, 0);
          imageLoadTracker.waitForAll();
          this.width = decodedImage.getWidth((java.awt.image.ImageObserver) ((Object) imageObserverComponent));
          this.height = decodedImage.getHeight((java.awt.image.ImageObserver) ((Object) imageObserverComponent));
          this.fullWidth = this.width;
          this.fullHeight = this.height;
          this.trimX = 0;
          this.trimY = 0;
          this.pixels = new int[this.width * this.height];
          pixelGrabber = new java.awt.image.PixelGrabber(decodedImage, 0, 0, this.width, this.height, this.pixels, 0, this.width);
          pixelGrabber.grabPixels();
        } catch (java.lang.InterruptedException imageLoadInterrupted) {
          caughtImageLoadError = imageLoadInterrupted;
          interruptedImageLoadError = (InterruptedException) (Object) caughtImageLoadError;
        }
    }
}
