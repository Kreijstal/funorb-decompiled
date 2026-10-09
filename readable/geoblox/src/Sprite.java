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
        int clipPixelCount;
        int negativeRowCounter;
        int destinationIndex;
        int sourceXQ12;
        int sourceYQ12;
        int negativePixelCounter;
        int sampledPixel;
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
              if (sourceXQ12 < 0) {
                negativeRowCounter++;
                rowDestinationIndex = rowDestinationIndex + SoftwareRasterizer.stride;
                continue;
              }
              if (sourceYQ12 >= 0 &&
                  sourceXQ12 - (this.width << 12) < 0 &&
                  sourceYQ12 - (this.height << 12) < 0) {
                while (negativePixelCounter < 0) {
                  sampledPixel = this.pixels[(sourceYQ12 >> 12) * this.width + (sourceXQ12 >> 12)];
                  if (sampledPixel == 0) {
                    destinationIndex++;
                    negativePixelCounter++;
                    continue;
                  }
                  writeIndexFixedXFixedY = destinationIndex;
                  destinationIndex++;
                  SoftwareRasterizer.framebuffer[writeIndexFixedXFixedY] = sampledPixel;
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
                  if (sampledPixelNestedPhase2 == 0) {
                    destinationIndexNestedPhase2++;
                  } else {
                    writeIndexFixedXForwardY = destinationIndexNestedPhase2;
                    destinationIndexNestedPhase2++;
                    SoftwareRasterizer.framebuffer[writeIndexFixedXForwardY] = sampledPixelNestedPhase2;
                  }
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
            if (sourceXQ12NestedPhase3 >= 0) {
              if (sourceXQ12NestedPhase3 - (this.width << 12) >= 0) {
                negativeRowCounterNestedPhase3++;
                rowSourceXQ12 = rowSourceXQ12 - inverseSinStep;
                rowDestinationIndex = rowDestinationIndex + SoftwareRasterizer.stride;
                continue;
              }
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
                if (sampledPixelNestedPhase3 == 0) {
                  destinationIndexNestedPhase3++;
                } else {
                  writeIndexFixedXReverseY = destinationIndexNestedPhase3;
                  destinationIndexNestedPhase3++;
                  SoftwareRasterizer.framebuffer[writeIndexFixedXReverseY] = sampledPixelNestedPhase3;
                }
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
                  if (sampledPixelPhase2 == 0) {
                    destinationIndexPhase2++;
                  } else {
                    writeIndexForwardXFixedY = destinationIndexPhase2;
                    destinationIndexPhase2++;
                    SoftwareRasterizer.framebuffer[writeIndexForwardXFixedY] = sampledPixelPhase2;
                  }
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
                if (sampledPixelPhase2NestedPhase2 == 0) {
                  destinationIndexPhase2NestedPhase2++;
                } else {
                  writeIndexForwardXForwardY = destinationIndexPhase2NestedPhase2;
                  destinationIndexPhase2NestedPhase2++;
                  SoftwareRasterizer.framebuffer[writeIndexForwardXForwardY] = sampledPixelPhase2NestedPhase2;
                }
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
              if (sampledPixelPhase2NestedPhase3 == 0) {
                destinationIndexPhase2NestedPhase3++;
              } else {
                writeIndexForwardXReverseY = destinationIndexPhase2NestedPhase3;
                destinationIndexPhase2NestedPhase3++;
                SoftwareRasterizer.framebuffer[writeIndexForwardXReverseY] = sampledPixelPhase2NestedPhase3;
              }
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
                if (sampledPixelPhase3 == 0) {
                  destinationIndexPhase3++;
                } else {
                  writeIndexReverseXFixedY = destinationIndexPhase3;
                  destinationIndexPhase3++;
                  SoftwareRasterizer.framebuffer[writeIndexReverseXFixedY] = sampledPixelPhase3;
                }
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
              if (sampledPixelPhase4 == 0) {
                destinationIndexPhase4++;
              } else {
                writeIndexReverseXForwardY = destinationIndexPhase4;
                destinationIndexPhase4++;
                SoftwareRasterizer.framebuffer[writeIndexReverseXForwardY] = sampledPixelPhase4;
              }
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
            if (sampledPixelPhase5 == 0) {
              destinationIndexPhase5++;
            } else {
              writeIndexReverseXReverseY = destinationIndexPhase5;
              destinationIndexPhase5++;
              SoftwareRasterizer.framebuffer[writeIndexReverseXReverseY] = sampledPixelPhase5;
            }
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
        int scanRowThenCroppedWidth;
        int croppedHeight;
        int[] croppedPixels;
        int rowOffsetThenTopEdgePhase2;
        int scanThenRightEdgePhase2;
        int scanThenRightEdgePhase3;
        int scanThenLeftEdgePhase2;
        int scanThenLeftEdgePhase3;
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
        rowOffsetThenTopEdgePhase2 = 0;
        topBorderScan: while (true) {
          if (rowOffsetThenTopEdgePhase2 < bottomEdge) {
            scanThenRightEdgePhase2 = rowOffsetThenTopEdgePhase2 * this.width;
            for (scanThenLeftEdge = 0; scanThenLeftEdge < this.width; scanThenLeftEdge++) {
              if (this.pixels[scanThenRightEdgePhase2 + scanThenLeftEdge] != 0) {
                break topBorderScan;
              }
            }
            rowOffsetThenTopEdgePhase2++;
            continue;
          }
          break;
        }
        scanThenRightEdgePhase3 = this.width - 1;
        rightBorderScan: while (true) {
          if (scanThenRightEdgePhase3 >= 0) {
            for (scanThenLeftEdgePhase2 = rowOffsetThenTopEdgePhase2; scanThenLeftEdgePhase2 <= bottomEdge; scanThenLeftEdgePhase2++) {
              if (this.pixels[scanThenLeftEdgePhase2 * this.width + scanThenRightEdgePhase3] != 0) {
                break rightBorderScan;
              }
            }
            scanThenRightEdgePhase3--;
            continue;
          }
          break;
        }
        scanThenLeftEdgePhase3 = 0;
        leftBorderScan: while (true) {
          if (scanThenLeftEdgePhase3 < scanThenRightEdgePhase3) {
            for (scanRowThenCroppedWidth = rowOffsetThenTopEdgePhase2; scanRowThenCroppedWidth <= bottomEdge; scanRowThenCroppedWidth++) {
              if (this.pixels[scanRowThenCroppedWidth * this.width + scanThenLeftEdgePhase3] != 0) {
                break leftBorderScan;
              }
            }
            scanThenLeftEdgePhase3++;
            continue;
          }
          break;
        }
        if (scanThenLeftEdgePhase3 == 0 &&
            scanThenRightEdgePhase3 == this.width - 1 &&
            rowOffsetThenTopEdgePhase2 == 0 &&
            bottomEdge == this.height - 1) {
          return;
        }
        scanRowThenCroppedWidth = scanThenRightEdgePhase3 + 1 - scanThenLeftEdgePhase3;
        croppedHeight = bottomEdge + 1 - rowOffsetThenTopEdgePhase2;
        croppedPixels = new int[scanRowThenCroppedWidth * croppedHeight];
        for (copyRow = 0; copyRow < croppedHeight; copyRow++) {
          for (copyColumn = 0; copyColumn < scanRowThenCroppedWidth; copyColumn++) {
            croppedPixels[copyRow * scanRowThenCroppedWidth + copyColumn] = this.pixels[(copyRow + rowOffsetThenTopEdgePhase2) * this.width + (copyColumn + scanThenLeftEdgePhase3)];
          }
        }
        this.pixels = croppedPixels;
        this.width = scanRowThenCroppedWidth;
        this.height = croppedHeight;
        this.trimX = this.trimX + scanThenLeftEdgePhase3;
        this.trimY = this.trimY + rowOffsetThenTopEdgePhase2;
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
            Sprite.blitColorKeyScaled(SoftwareRasterizer.framebuffer, this.pixels, 0, sourceX16, sourceY16, trimStepsThenDestinationIndex, destinationRowSkip, destinationWidth, destinationHeight, stepX16, stepY16, sourceWidth);
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
            Sprite.blitColorKeyScaledAlpha(SoftwareRasterizer.framebuffer, this.pixels, 0, sourceX16, sourceY16, trimStepsThenDestinationIndex, destinationRowSkip, destinationWidth, destinationHeight, stepX16, stepY16, sourceWidth, alpha256);
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
        int sourceColumnThenGeometrySwap = 0;
        int[] rotatedPixels = new int[this.width * this.height];
        int destinationIndex = 0;
        for (sourceColumnThenGeometrySwap = 0; sourceColumnThenGeometrySwap < this.width; sourceColumnThenGeometrySwap++) {
            for (sourceRow = this.height - 1; sourceRow >= 0; sourceRow--) {
                destinationWriteIndex = destinationIndex;
                destinationIndex++;
                rotatedPixels[destinationWriteIndex] = this.pixels[sourceColumnThenGeometrySwap + sourceRow * this.width];
            }
        }
        this.pixels = rotatedPixels;
        sourceColumnThenGeometrySwap = this.trimY;
        this.trimY = this.trimX;
        this.trimX = this.fullHeight - this.height - sourceColumnThenGeometrySwap;
        sourceColumnThenGeometrySwap = this.height;
        this.height = this.width;
        this.width = sourceColumnThenGeometrySwap;
        sourceColumnThenGeometrySwap = this.fullHeight;
        this.fullHeight = this.fullWidth;
        this.fullWidth = sourceColumnThenGeometrySwap;
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
            Sprite.blitColorKey(SoftwareRasterizer.framebuffer, this.pixels, 0, sourceIndex, destinationIndex, drawWidth, drawHeight, destinationRowSkip, sourceRowSkip);
            return;
        }
    }

    void drawGrayTinted(int x, int y, int tintColor) {
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
        int sourcePixelOrDestinationNestedPhase2;
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
                sourcePixelOrDestinationNestedPhase2 = this.pixels[sourceIndex + sampleRow * this.width + sampleColumn];
                if (sourcePixelOrDestinationNestedPhase2 == 0) {
                  sourcePixelOrDestinationNestedPhase2 = SoftwareRasterizer.framebuffer[destinationIndex];
                }
                sumRedBlue = sumRedBlue + (sourcePixelOrDestinationNestedPhase2 & 16711935);
                sumGreen = sumGreen + (sourcePixelOrDestinationNestedPhase2 & 65280);
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
        int samplePixelNestedPhase2;
        int samplePixelNestedPhase3;
        int samplePixelNestedPhase4;
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
            samplePixelNestedPhase2 = sampleTopRight;
            if (sampleTopRight != 0) {
              sumRedBlue = sumRedBlue + (samplePixelNestedPhase2 & 16711935);
              sumGreen = sumGreen + (samplePixelNestedPhase2 & 65280);
            } else {
              sumRedBlue = sumRedBlue + destinationRedBlue;
              sumGreen = sumGreen + destinationGreen;
            }
            sampleBottomLeft = sourcePixels[sourceIndex + sourceWidth];
            samplePixelNestedPhase3 = sampleBottomLeft;
            if (sampleBottomLeft != 0) {
              sumRedBlue = sumRedBlue + (samplePixelNestedPhase3 & 16711935);
              sumGreen = sumGreen + (samplePixelNestedPhase3 & 65280);
            } else {
              sumRedBlue = sumRedBlue + destinationRedBlue;
              sumGreen = sumGreen + destinationGreen;
            }
            sampleBottomRight = sourcePixels[sourceIndex + sourceWidth + 1];
            samplePixelNestedPhase4 = sampleBottomRight;
            if (sampleBottomRight != 0) {
              sumRedBlue = sumRedBlue + (samplePixelNestedPhase4 & 16711935);
              sumGreen = sumGreen + (samplePixelNestedPhase4 & 65280);
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
        int trimStepsThenDestinationIndex = 0;
        int clippedEdgePixels = 0;
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
            Sprite.blitScaledSilhouette(SoftwareRasterizer.framebuffer, this.pixels, 0, sourceX16, sourceY16, trimStepsThenDestinationIndex, destinationRowSkip, destinationWidth, destinationHeight, stepX16, stepY16, sourceWidth, color);
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
        int sourcePixelXPhase2;
        int sourcePixelXPhase3;
        int sourcePixelYPhase2;
        int sourcePixelYPhase3;
        int clipScratchPhase2;
        int clipScratchPhase3;
        int negativeRowCounterPhase2;
        int negativeRowCounterPhase3;
        int sourceXQ12Phase2;
        int sourceXQ12Phase3;
        int sourceYQ12Phase2;
        int sourceYQ12Phase3;
        int negativePixelCounterPhase2;
        int negativePixelCounterPhase3;
        int canSamplePhase2;
        int canSamplePhase3;
        int sourcePixelXNestedPhase2;
        int sourcePixelYNestedPhase2;
        int clipScratchNestedPhase2;
        int negativeRowCounterNestedPhase2;
        int sourceXQ12NestedPhase2;
        int sourceYQ12NestedPhase2;
        int negativePixelCounterNestedPhase2;
        int canSampleNestedPhase2;
        int clipScratchPhase2NestedPhase2;
        int clipScratchPhase3NestedPhase2;
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
                clipScratch = sourceYQ12 + 4096;
                if (clipScratch < 0) {
                  if (inverseSinStep != 0) {
                    clipScratch = (inverseSinStep - 1 - clipScratch) / inverseSinStep;
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
          negativeRowCounterNestedPhase2 = bottomThenNegativeHeight;
          while (negativeRowCounterNestedPhase2 < 0) {
            sourceXQ12NestedPhase2 = rowSourceXQ12 + (destinationOffsetX * inverseCosStep >> 4);
            sourceYQ12NestedPhase2 = rowSourceYQ12 + (destinationOffsetX * inverseSinStep >> 4);
            negativePixelCounterNestedPhase2 = rightThenNegativeWidth;
            canSampleNestedPhase2 = 0;
            clipScratchNestedPhase2 = sourceXQ12NestedPhase2 + 4096;
            if (clipScratchNestedPhase2 < 0) {
              if (inverseCosStep != 0) {
                clipScratchNestedPhase2 = (inverseCosStep - 1 - clipScratchNestedPhase2) / inverseCosStep;
                negativePixelCounterNestedPhase2 = negativePixelCounterNestedPhase2 + clipScratchNestedPhase2;
                sourceXQ12NestedPhase2 = sourceXQ12NestedPhase2 + inverseCosStep * clipScratchNestedPhase2;
                sourceYQ12NestedPhase2 = sourceYQ12NestedPhase2 + inverseSinStep * clipScratchNestedPhase2;
                destinationIndex = destinationIndex + clipScratchNestedPhase2;
                canSampleNestedPhase2 = 1;
              } else {
                destinationIndex = destinationIndex - negativePixelCounterNestedPhase2;
              }
            } else {
              canSampleNestedPhase2 = 1;
            }
            if (canSampleNestedPhase2 != 0) {
              canSampleNestedPhase2 = 0;
              clipScratchNestedPhase2 = sourceYQ12NestedPhase2 - (this.height << 12);
              if (clipScratchNestedPhase2 >= 0) {
                if (inverseSinStep != 0) {
                  clipScratchNestedPhase2 = (inverseSinStep - clipScratchNestedPhase2) / inverseSinStep;
                  negativePixelCounterNestedPhase2 = negativePixelCounterNestedPhase2 + clipScratchNestedPhase2;
                  sourceXQ12NestedPhase2 = sourceXQ12NestedPhase2 + inverseCosStep * clipScratchNestedPhase2;
                  sourceYQ12NestedPhase2 = sourceYQ12NestedPhase2 + inverseSinStep * clipScratchNestedPhase2;
                  destinationIndex = destinationIndex + clipScratchNestedPhase2;
                  canSampleNestedPhase2 = 1;
                } else {
                  destinationIndex = destinationIndex - negativePixelCounterNestedPhase2;
                }
              } else {
                canSampleNestedPhase2 = 1;
              }
              if (canSampleNestedPhase2 != 0) {
                while (negativePixelCounterNestedPhase2 < 0) {
                  if (sourceYQ12NestedPhase2 >= -4096) {
                    sourcePixelXNestedPhase2 = sourceXQ12NestedPhase2 >> 12;
                    if (sourceXQ12NestedPhase2 >> 12 < this.width) {
                      sourcePixelYNestedPhase2 = sourceYQ12NestedPhase2 >> 12;
                      this.sampleBilinear(destinationIndex, sourcePixelXNestedPhase2, sourcePixelYNestedPhase2, sourceXQ12NestedPhase2, sourceYQ12NestedPhase2);
                      negativePixelCounterNestedPhase2++;
                      sourceXQ12NestedPhase2 = sourceXQ12NestedPhase2 + inverseCosStep;
                      sourceYQ12NestedPhase2 = sourceYQ12NestedPhase2 + inverseSinStep;
                      destinationIndex++;
                      continue;
                    }
                  }
                  break;
                }
                destinationIndex = destinationIndex - negativePixelCounterNestedPhase2;
              }
            }
            negativeRowCounterNestedPhase2++;
            rowSourceXQ12 = rowSourceXQ12 - inverseSinStep;
            rowSourceYQ12 = rowSourceYQ12 + inverseCosStep;
            destinationIndex = destinationIndex + rowSkip;
          }
          return;
        }
        if (inverseSinStep >= 0) {
          negativeRowCounterPhase2 = bottomThenNegativeHeight;
          while (negativeRowCounterPhase2 < 0) {
            sourceXQ12Phase2 = rowSourceXQ12 + (destinationOffsetX * inverseCosStep >> 4);
            sourceYQ12Phase2 = rowSourceYQ12 + (destinationOffsetX * inverseSinStep >> 4);
            negativePixelCounterPhase2 = rightThenNegativeWidth;
            canSamplePhase2 = 0;
            clipScratchPhase2 = sourceXQ12Phase2 - (this.width << 12);
            if (clipScratchPhase2 >= 0) {
              if (inverseCosStep != 0) {
                clipScratchPhase2 = (inverseCosStep - clipScratchPhase2) / inverseCosStep;
                negativePixelCounterPhase2 = negativePixelCounterPhase2 + clipScratchPhase2;
                sourceXQ12Phase2 = sourceXQ12Phase2 + inverseCosStep * clipScratchPhase2;
                sourceYQ12Phase2 = sourceYQ12Phase2 + inverseSinStep * clipScratchPhase2;
                destinationIndex = destinationIndex + clipScratchPhase2;
                canSamplePhase2 = 1;
              } else {
                destinationIndex = destinationIndex - negativePixelCounterPhase2;
              }
            } else {
              canSamplePhase2 = 1;
            }
            if (canSamplePhase2 != 0) {
              canSamplePhase2 = 0;
              clipScratchPhase2NestedPhase2 = sourceYQ12Phase2 + 4096;
              if (clipScratchPhase2NestedPhase2 < 0) {
                if (inverseSinStep != 0) {
                  clipScratchPhase2NestedPhase2 = (inverseSinStep - 1 - clipScratchPhase2NestedPhase2) / inverseSinStep;
                  negativePixelCounterPhase2 = negativePixelCounterPhase2 + clipScratchPhase2NestedPhase2;
                  sourceXQ12Phase2 = sourceXQ12Phase2 + inverseCosStep * clipScratchPhase2NestedPhase2;
                  sourceYQ12Phase2 = sourceYQ12Phase2 + inverseSinStep * clipScratchPhase2NestedPhase2;
                  destinationIndex = destinationIndex + clipScratchPhase2NestedPhase2;
                  canSamplePhase2 = 1;
                } else {
                  destinationIndex = destinationIndex - negativePixelCounterPhase2;
                }
              } else {
                canSamplePhase2 = 1;
              }
              if (canSamplePhase2 != 0) {
                while (negativePixelCounterPhase2 < 0) {
                  if (sourceXQ12Phase2 >= -4096) {
                    sourcePixelYPhase2 = sourceYQ12Phase2 >> 12;
                    if (sourceYQ12Phase2 >> 12 < this.height) {
                      sourcePixelXPhase2 = sourceXQ12Phase2 >> 12;
                      this.sampleBilinear(destinationIndex, sourcePixelXPhase2, sourcePixelYPhase2, sourceXQ12Phase2, sourceYQ12Phase2);
                      negativePixelCounterPhase2++;
                      sourceXQ12Phase2 = sourceXQ12Phase2 + inverseCosStep;
                      sourceYQ12Phase2 = sourceYQ12Phase2 + inverseSinStep;
                      destinationIndex++;
                      continue;
                    }
                  }
                  break;
                }
                destinationIndex = destinationIndex - negativePixelCounterPhase2;
              }
            }
            negativeRowCounterPhase2++;
            rowSourceXQ12 = rowSourceXQ12 - inverseSinStep;
            rowSourceYQ12 = rowSourceYQ12 + inverseCosStep;
            destinationIndex = destinationIndex + rowSkip;
          }
          return;
        }
        negativeRowCounterPhase3 = bottomThenNegativeHeight;
        while (negativeRowCounterPhase3 < 0) {
          sourceXQ12Phase3 = rowSourceXQ12 + (destinationOffsetX * inverseCosStep >> 4);
          sourceYQ12Phase3 = rowSourceYQ12 + (destinationOffsetX * inverseSinStep >> 4);
          negativePixelCounterPhase3 = rightThenNegativeWidth;
          canSamplePhase3 = 0;
          clipScratchPhase3 = sourceXQ12Phase3 - (this.width << 12);
          if (clipScratchPhase3 >= 0) {
            if (inverseCosStep != 0) {
              clipScratchPhase3 = (inverseCosStep - clipScratchPhase3) / inverseCosStep;
              negativePixelCounterPhase3 = negativePixelCounterPhase3 + clipScratchPhase3;
              sourceXQ12Phase3 = sourceXQ12Phase3 + inverseCosStep * clipScratchPhase3;
              sourceYQ12Phase3 = sourceYQ12Phase3 + inverseSinStep * clipScratchPhase3;
              destinationIndex = destinationIndex + clipScratchPhase3;
              canSamplePhase3 = 1;
            } else {
              destinationIndex = destinationIndex - negativePixelCounterPhase3;
            }
          } else {
            canSamplePhase3 = 1;
          }
          if (canSamplePhase3 != 0) {
            canSamplePhase3 = 0;
            clipScratchPhase3NestedPhase2 = sourceYQ12Phase3 - (this.height << 12);
            if (clipScratchPhase3NestedPhase2 >= 0) {
              if (inverseSinStep != 0) {
                clipScratchPhase3NestedPhase2 = (inverseSinStep - clipScratchPhase3NestedPhase2) / inverseSinStep;
                negativePixelCounterPhase3 = negativePixelCounterPhase3 + clipScratchPhase3NestedPhase2;
                sourceXQ12Phase3 = sourceXQ12Phase3 + inverseCosStep * clipScratchPhase3NestedPhase2;
                sourceYQ12Phase3 = sourceYQ12Phase3 + inverseSinStep * clipScratchPhase3NestedPhase2;
                destinationIndex = destinationIndex + clipScratchPhase3NestedPhase2;
                canSamplePhase3 = 1;
              } else {
                destinationIndex = destinationIndex - negativePixelCounterPhase3;
              }
            } else {
              canSamplePhase3 = 1;
            }
            if (canSamplePhase3 != 0) {
              while (negativePixelCounterPhase3 < 0) {
                if (sourceXQ12Phase3 >= -4096 &&
                    sourceYQ12Phase3 >= -4096) {
                  sourcePixelXPhase3 = sourceXQ12Phase3 >> 12;
                  sourcePixelYPhase3 = sourceYQ12Phase3 >> 12;
                  this.sampleBilinear(destinationIndex, sourcePixelXPhase3, sourcePixelYPhase3, sourceXQ12Phase3, sourceYQ12Phase3);
                  negativePixelCounterPhase3++;
                  sourceXQ12Phase3 = sourceXQ12Phase3 + inverseCosStep;
                  sourceYQ12Phase3 = sourceYQ12Phase3 + inverseSinStep;
                  destinationIndex++;
                  continue;
                }
                break;
              }
              destinationIndex = destinationIndex - negativePixelCounterPhase3;
            }
          }
          negativeRowCounterPhase3++;
          rowSourceXQ12 = rowSourceXQ12 - inverseSinStep;
          rowSourceYQ12 = rowSourceYQ12 + inverseCosStep;
          destinationIndex = destinationIndex + rowSkip;
        }
        return;
    }

    void drawGrayModulated(int x, int y, int tintColor) {
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
