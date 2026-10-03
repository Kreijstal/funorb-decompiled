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
              L68: {
                if ((sourceYQ12 >= 0) &&
                    (sourceXQ12 - (this.width << 12) < 0) &&
                    (sourceYQ12 - (this.height << 12) < 0)) {
                  while (true) {
                    if (negativePixelCounter >= 0) {
                      break L68;
                    }
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
                    continue;
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
              destinationIndex = rowDestinationIndex;
              sourceXQ12 = rowSourceXQ12;
              sourceYQ12 = rowSourceYQ12 + (destinationOffsetX * inverseSinStep >> 4);
              negativePixelCounter = rightThenNegativeWidth;
              if ((sourceXQ12 >= 0) &&
                  (sourceXQ12 - (this.width << 12) < 0)) {
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
                  if (sampledPixel == 0) {
                    destinationIndex++;
                  } else {
                    writeIndexFixedXForwardY = destinationIndex;
                    destinationIndex++;
                    SoftwareRasterizer.framebuffer[writeIndexFixedXForwardY] = sampledPixel;
                  }
                  sourceYQ12 = sourceYQ12 + inverseSinStep;
                  negativePixelCounter++;
                }
              }
              negativeRowCounter++;
              rowSourceXQ12 = rowSourceXQ12 - inverseSinStep;
              rowDestinationIndex = rowDestinationIndex + SoftwareRasterizer.stride;
            }
            return;
          }
          negativeRowCounter = bottomThenNegativeHeight;
          while (negativeRowCounter < 0) {
            destinationIndex = rowDestinationIndex;
            sourceXQ12 = rowSourceXQ12;
            sourceYQ12 = rowSourceYQ12 + (destinationOffsetX * inverseSinStep >> 4);
            negativePixelCounter = rightThenNegativeWidth;
            if (sourceXQ12 >= 0) {
              if (sourceXQ12 - (this.width << 12) >= 0) {
                negativeRowCounter++;
                rowSourceXQ12 = rowSourceXQ12 - inverseSinStep;
                rowDestinationIndex = rowDestinationIndex + SoftwareRasterizer.stride;
                continue;
              }
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
                if (sampledPixel == 0) {
                  destinationIndex++;
                } else {
                  writeIndexFixedXReverseY = destinationIndex;
                  destinationIndex++;
                  SoftwareRasterizer.framebuffer[writeIndexFixedXReverseY] = sampledPixel;
                }
                sourceYQ12 = sourceYQ12 + inverseSinStep;
                negativePixelCounter++;
              }
            }
            negativeRowCounter++;
            rowSourceXQ12 = rowSourceXQ12 - inverseSinStep;
            rowDestinationIndex = rowDestinationIndex + SoftwareRasterizer.stride;
          }
          return;
        }
        if (inverseCosStep >= 0) {
          if (inverseSinStep == 0) {
            negativeRowCounter = bottomThenNegativeHeight;
            while (negativeRowCounter < 0) {
              destinationIndex = rowDestinationIndex;
              sourceXQ12 = rowSourceXQ12 + (destinationOffsetX * inverseCosStep >> 4);
              sourceYQ12 = rowSourceYQ12;
              negativePixelCounter = rightThenNegativeWidth;
              if ((sourceYQ12 >= 0) &&
                  (sourceYQ12 - (this.height << 12) < 0)) {
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
                  if (sampledPixel == 0) {
                    destinationIndex++;
                  } else {
                    writeIndexForwardXFixedY = destinationIndex;
                    destinationIndex++;
                    SoftwareRasterizer.framebuffer[writeIndexForwardXFixedY] = sampledPixel;
                  }
                  sourceXQ12 = sourceXQ12 + inverseCosStep;
                  negativePixelCounter++;
                }
              }
              negativeRowCounter++;
              rowSourceYQ12 = rowSourceYQ12 + inverseCosStep;
              rowDestinationIndex = rowDestinationIndex + SoftwareRasterizer.stride;
            }
            return;
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
                if (sampledPixel == 0) {
                  destinationIndex++;
                } else {
                  writeIndexForwardXForwardY = destinationIndex;
                  destinationIndex++;
                  SoftwareRasterizer.framebuffer[writeIndexForwardXForwardY] = sampledPixel;
                }
                sourceXQ12 = sourceXQ12 + inverseCosStep;
                sourceYQ12 = sourceYQ12 + inverseSinStep;
                negativePixelCounter++;
              }
              negativeRowCounter++;
              rowSourceXQ12 = rowSourceXQ12 - inverseSinStep;
              rowSourceYQ12 = rowSourceYQ12 + inverseCosStep;
              rowDestinationIndex = rowDestinationIndex + SoftwareRasterizer.stride;
            }
            return;
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
              if (sampledPixel == 0) {
                destinationIndex++;
              } else {
                writeIndexForwardXReverseY = destinationIndex;
                destinationIndex++;
                SoftwareRasterizer.framebuffer[writeIndexForwardXReverseY] = sampledPixel;
              }
              sourceXQ12 = sourceXQ12 + inverseCosStep;
              sourceYQ12 = sourceYQ12 + inverseSinStep;
              negativePixelCounter++;
            }
            negativeRowCounter++;
            rowSourceXQ12 = rowSourceXQ12 - inverseSinStep;
            rowSourceYQ12 = rowSourceYQ12 + inverseCosStep;
            rowDestinationIndex = rowDestinationIndex + SoftwareRasterizer.stride;
          }
          return;
        }
        if (inverseSinStep == 0) {
          negativeRowCounter = bottomThenNegativeHeight;
          while (negativeRowCounter < 0) {
            destinationIndex = rowDestinationIndex;
            sourceXQ12 = rowSourceXQ12 + (destinationOffsetX * inverseCosStep >> 4);
            sourceYQ12 = rowSourceYQ12;
            negativePixelCounter = rightThenNegativeWidth;
            if ((sourceYQ12 >= 0) &&
                (sourceYQ12 - (this.height << 12) < 0)) {
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
                if (sampledPixel == 0) {
                  destinationIndex++;
                } else {
                  writeIndexReverseXFixedY = destinationIndex;
                  destinationIndex++;
                  SoftwareRasterizer.framebuffer[writeIndexReverseXFixedY] = sampledPixel;
                }
                sourceXQ12 = sourceXQ12 + inverseCosStep;
                negativePixelCounter++;
              }
            }
            negativeRowCounter++;
            rowSourceYQ12 = rowSourceYQ12 + inverseCosStep;
            rowDestinationIndex = rowDestinationIndex + SoftwareRasterizer.stride;
          }
          return;
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
              if (sampledPixel == 0) {
                destinationIndex++;
              } else {
                writeIndexReverseXForwardY = destinationIndex;
                destinationIndex++;
                SoftwareRasterizer.framebuffer[writeIndexReverseXForwardY] = sampledPixel;
              }
              sourceXQ12 = sourceXQ12 + inverseCosStep;
              sourceYQ12 = sourceYQ12 + inverseSinStep;
              negativePixelCounter++;
            }
            negativeRowCounter++;
            rowSourceXQ12 = rowSourceXQ12 - inverseSinStep;
            rowSourceYQ12 = rowSourceYQ12 + inverseCosStep;
            rowDestinationIndex = rowDestinationIndex + SoftwareRasterizer.stride;
          }
          return;
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
            if (sampledPixel == 0) {
              destinationIndex++;
            } else {
              writeIndexReverseXReverseY = destinationIndex;
              destinationIndex++;
              SoftwareRasterizer.framebuffer[writeIndexReverseXReverseY] = sampledPixel;
            }
            sourceXQ12 = sourceXQ12 + inverseCosStep;
            sourceYQ12 = sourceYQ12 + inverseSinStep;
            negativePixelCounter++;
          }
          negativeRowCounter++;
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
        int destinationWriteIndex = 0;
        int rowSourceX16 = sourceX16;
        for (negativeRow = -drawHeight; negativeRow < 0; negativeRow++) {
            sourceRowOffset = (sourceY16 >> 16) * sourceWidth;
            for (negativeColumn = -drawWidth; negativeColumn < 0; negativeColumn++) {
                sourcePixel = sourcePixels[(sourceX16 >> 16) + sourceRowOffset];
                if (sourcePixel != 0) {
                    destinationWriteIndex = destinationIndex;
                    destinationIndex++;
                    destinationPixels[destinationWriteIndex] = sourcePixel;
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
        bottomEdge = this.height - 1;
        while (true) {
          L1: {
            if (bottomEdge >= 0) {
              rowOffsetThenTopEdge = bottomEdge * this.width;
              for (scanThenRightEdge = 0; scanThenRightEdge < this.width; scanThenRightEdge++) {
                if (this.pixels[rowOffsetThenTopEdge + scanThenRightEdge] != 0) {
                  break L1;
                }
              }
              bottomEdge--;
              continue;
            }
          }
          rowOffsetThenTopEdge = 0;
          while (true) {
            L4: {
              if (rowOffsetThenTopEdge < bottomEdge) {
                scanThenRightEdge = rowOffsetThenTopEdge * this.width;
                for (scanThenLeftEdge = 0; scanThenLeftEdge < this.width; scanThenLeftEdge++) {
                  if (this.pixels[scanThenRightEdge + scanThenLeftEdge] != 0) {
                    break L4;
                  }
                }
                rowOffsetThenTopEdge++;
                continue;
              }
            }
            scanThenRightEdge = this.width - 1;
            while (true) {
              L7: {
                if (scanThenRightEdge >= 0) {
                  for (scanThenLeftEdge = rowOffsetThenTopEdge; scanThenLeftEdge <= bottomEdge; scanThenLeftEdge++) {
                    if (this.pixels[scanThenLeftEdge * this.width + scanThenRightEdge] != 0) {
                      break L7;
                    }
                  }
                  scanThenRightEdge--;
                  continue;
                }
              }
              scanThenLeftEdge = 0;
              while (true) {
                L10: {
                  if (scanThenLeftEdge < scanThenRightEdge) {
                    for (scanRowThenCroppedWidth = rowOffsetThenTopEdge; scanRowThenCroppedWidth <= bottomEdge; scanRowThenCroppedWidth++) {
                      if (this.pixels[scanRowThenCroppedWidth * this.width + scanThenLeftEdge] != 0) {
                        break L10;
                      }
                    }
                    scanThenLeftEdge++;
                    continue;
                  }
                }
                if ((scanThenLeftEdge == 0) &&
                    (scanThenRightEdge == this.width - 1) &&
                    (rowOffsetThenTopEdge == 0) &&
                    (bottomEdge == this.height - 1)) {
                  return;
                }
                scanRowThenCroppedWidth = scanThenRightEdge + 1 - scanThenLeftEdge;
                croppedHeight = bottomEdge + 1 - rowOffsetThenTopEdge;
                croppedPixels = new int[scanRowThenCroppedWidth * croppedHeight];
                for (copyRow = 0; copyRow < croppedHeight; copyRow++) {
                  for (copyColumn = 0; copyColumn < scanRowThenCroppedWidth; copyColumn++) {
                    croppedPixels[copyRow * scanRowThenCroppedWidth + copyColumn] = this.pixels[(copyRow + rowOffsetThenTopEdge) * this.width + (copyColumn + scanThenLeftEdge)];
                  }
                }
                this.pixels = croppedPixels;
                this.width = scanRowThenCroppedWidth;
                this.height = croppedHeight;
                this.trimX = this.trimX + scanThenLeftEdge;
                this.trimY = this.trimY + rowOffsetThenTopEdge;
                return;
              }
            }
          }
        }
    }

    final void addOutline(int color) {
        int row = 0;
        int column = 0;
        int destinationWriteIndex = 0;
        int[] outlinedPixels;
        int pixelIndex;
        int pixelOrOutlineColor;
        outlinedPixels = new int[this.width * this.height];
        pixelIndex = 0;
        for (row = 0; row < this.height; row++) {
          for (column = 0; column < this.width; column++) {
            L2: {
              pixelOrOutlineColor = this.pixels[pixelIndex];
              if (pixelOrOutlineColor == 0) {
                if ((column > 0) &&
                    (this.pixels[pixelIndex - 1] != 0)) {
                  pixelOrOutlineColor = color;
                  break L2;
                }
                if ((row > 0) &&
                    (this.pixels[pixelIndex - this.width] != 0)) {
                  pixelOrOutlineColor = color;
                  break L2;
                }
                if ((column < this.width - 1) &&
                    (this.pixels[pixelIndex + 1] != 0)) {
                  pixelOrOutlineColor = color;
                  break L2;
                }
                if ((row < this.height - 1) &&
                    (this.pixels[pixelIndex + this.width] != 0)) {
                  pixelOrOutlineColor = color;
                }
              }
            }
            destinationWriteIndex = pixelIndex;
            pixelIndex++;
            outlinedPixels[destinationWriteIndex] = pixelOrOutlineColor;
          }
        }
        this.pixels = outlinedPixels;
    }

    private final static void blitColorKeyAlpha(int[] destinationPixels, int[] sourcePixels, int sourcePixel, int sourceIndex, int destinationIndex, int drawWidth, int drawHeight, int destinationRowSkip, int sourceRowSkip, int alpha256) {
        int sourceReadIndex = 0;
        int destinationWriteIndex = 0;
        int inverseAlpha256;
        int negativeRow;
        int negativeColumn;
        int destinationPixel;
        inverseAlpha256 = 256 - alpha256;
        negativeRow = -drawHeight;
        L0: while (true) {
          if (negativeRow >= 0) {
            return;
          }
          negativeColumn = -drawWidth;
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
            continue;
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
        int sourceReadIndex = 0;
        int destinationWriteIndex = 0;
        int negativeRow;
        int negativeColumn;
        int productRed;
        int productGreen;
        int productBlue;
        negativeRow = -drawHeight;
        L0: while (true) {
          if (negativeRow >= 0) {
            return;
          }
          negativeColumn = -drawWidth;
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
            continue;
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
        int sourceReadIndex = 0;
        int destinationWriteIndex = 0;
        int destinationWriteIndex2 = 0;
        int destinationWriteIndex3 = 0;
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
            if (sourcePixel == 0) {
              destinationIndex++;
              negativeColumn++;
              continue;
            }
            sourceRed = sourcePixel >> 16 & 255;
            sourceGreen = sourcePixel >> 8 & 255;
            sourceBlue = sourcePixel & 255;
            if ((sourceRed == sourceGreen) &&
                (sourceGreen == sourceBlue)) {
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
            destinationWriteIndex3 = destinationIndex;
            destinationIndex++;
            destinationPixels[destinationWriteIndex3] = sourcePixel;
            negativeColumn++;
            continue;
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
        int sourceReadIndex = 0;
        int destinationWriteIndex = 0;
        int sourceReadIndex2 = 0;
        int destinationWriteIndex2 = 0;
        int sourceReadIndex3 = 0;
        int destinationWriteIndex3 = 0;
        int sourceReadIndex4 = 0;
        int destinationWriteIndex4 = 0;
        int sourceReadIndex5 = 0;
        int destinationWriteIndex5 = 0;
        int negativeQuadCount;
        int negativeRow;
        int quadOrTailCounter;
        negativeQuadCount = -(widthThenNegativeTail >> 2);
        widthThenNegativeTail = -(widthThenNegativeTail & 3);
        negativeRow = -drawHeight;
        L0: while (true) {
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
                  continue L0;
                }
                sourceReadIndex = sourceIndex;
                sourceIndex++;
                sourcePixel = sourcePixels[sourceReadIndex];
                if (sourcePixel == 0) {
                  destinationIndex++;
                  quadOrTailCounter++;
                  continue;
                }
                destinationWriteIndex = destinationIndex;
                destinationIndex++;
                destinationPixels[destinationWriteIndex] = sourcePixel;
                quadOrTailCounter++;
                continue;
              }
            }
            sourceReadIndex2 = sourceIndex;
            sourceIndex++;
            sourcePixel = sourcePixels[sourceReadIndex2];
            if (sourcePixel == 0) {
              destinationIndex++;
            } else {
              destinationWriteIndex2 = destinationIndex;
              destinationIndex++;
              destinationPixels[destinationWriteIndex2] = sourcePixel;
            }
            sourceReadIndex3 = sourceIndex;
            sourceIndex++;
            sourcePixel = sourcePixels[sourceReadIndex3];
            if (sourcePixel == 0) {
              destinationIndex++;
            } else {
              destinationWriteIndex3 = destinationIndex;
              destinationIndex++;
              destinationPixels[destinationWriteIndex3] = sourcePixel;
            }
            sourceReadIndex4 = sourceIndex;
            sourceIndex++;
            sourcePixel = sourcePixels[sourceReadIndex4];
            if (sourcePixel == 0) {
              destinationIndex++;
            } else {
              destinationWriteIndex4 = destinationIndex;
              destinationIndex++;
              destinationPixels[destinationWriteIndex4] = sourcePixel;
            }
            sourceReadIndex5 = sourceIndex;
            sourceIndex++;
            sourcePixel = sourcePixels[sourceReadIndex5];
            if (sourcePixel == 0) {
              destinationIndex++;
              quadOrTailCounter++;
              continue;
            }
            destinationWriteIndex5 = destinationIndex;
            destinationIndex++;
            destinationPixels[destinationWriteIndex5] = sourcePixel;
            quadOrTailCounter++;
            continue;
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
                sourcePixelOrDestination = this.pixels[sourceIndex + sampleRow * this.width + sampleColumn];
                if (sourcePixelOrDestination == 0) {
                  sourcePixelOrDestination = SoftwareRasterizer.framebuffer[destinationIndex];
                }
                sumRedBlue = sumRedBlue + (sourcePixelOrDestination & 16711935);
                sumGreen = sumGreen + (sourcePixelOrDestination & 65280);
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
            samplePixel = sampleTopRight;
            if (sampleTopRight != 0) {
              sumRedBlue = sumRedBlue + (samplePixel & 16711935);
              sumGreen = sumGreen + (samplePixel & 65280);
            } else {
              sumRedBlue = sumRedBlue + destinationRedBlue;
              sumGreen = sumGreen + destinationGreen;
            }
            sampleBottomLeft = sourcePixels[sourceIndex + sourceWidth];
            samplePixel = sampleBottomLeft;
            if (sampleBottomLeft != 0) {
              sumRedBlue = sumRedBlue + (samplePixel & 16711935);
              sumGreen = sumGreen + (samplePixel & 65280);
            } else {
              sumRedBlue = sumRedBlue + destinationRedBlue;
              sumGreen = sumGreen + destinationGreen;
            }
            sampleBottomRight = sourcePixels[sourceIndex + sourceWidth + 1];
            samplePixel = sampleBottomRight;
            if (sampleBottomRight != 0) {
              sumRedBlue = sumRedBlue + (samplePixel & 16711935);
              sumGreen = sumGreen + (samplePixel & 65280);
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
        int sourceReadIndex = 0;
        int destinationWriteIndex = 0;
        int sourceReadIndex2 = 0;
        int destinationWriteIndex2 = 0;
        int sourceReadIndex3 = 0;
        int destinationWriteIndex3 = 0;
        int sourceReadIndex4 = 0;
        int destinationWriteIndex4 = 0;
        int sourceReadIndex5 = 0;
        int destinationWriteIndex5 = 0;
        int negativeQuadCount;
        int negativeRow;
        int quadOrTailCounter;
        negativeQuadCount = -(widthThenNegativeTail >> 2);
        widthThenNegativeTail = -(widthThenNegativeTail & 3);
        negativeRow = -drawHeight;
        L0: while (true) {
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
                  continue L0;
                }
                sourceReadIndex = sourceIndex;
                sourceIndex++;
                if (sourcePixels[sourceReadIndex] == 0) {
                  destinationIndex++;
                  quadOrTailCounter++;
                  continue;
                }
                destinationWriteIndex = destinationIndex;
                destinationIndex++;
                destinationPixels[destinationWriteIndex] = color;
                quadOrTailCounter++;
                continue;
              }
            }
            sourceReadIndex2 = sourceIndex;
            sourceIndex++;
            if (sourcePixels[sourceReadIndex2] == 0) {
              destinationIndex++;
            } else {
              destinationWriteIndex2 = destinationIndex;
              destinationIndex++;
              destinationPixels[destinationWriteIndex2] = color;
            }
            sourceReadIndex3 = sourceIndex;
            sourceIndex++;
            if (sourcePixels[sourceReadIndex3] == 0) {
              destinationIndex++;
            } else {
              destinationWriteIndex3 = destinationIndex;
              destinationIndex++;
              destinationPixels[destinationWriteIndex3] = color;
            }
            sourceReadIndex4 = sourceIndex;
            sourceIndex++;
            if (sourcePixels[sourceReadIndex4] == 0) {
              destinationIndex++;
            } else {
              destinationWriteIndex4 = destinationIndex;
              destinationIndex++;
              destinationPixels[destinationWriteIndex4] = color;
            }
            sourceReadIndex5 = sourceIndex;
            sourceIndex++;
            if (sourcePixels[sourceReadIndex5] == 0) {
              destinationIndex++;
              quadOrTailCounter++;
              continue;
            }
            destinationWriteIndex5 = destinationIndex;
            destinationIndex++;
            destinationPixels[destinationWriteIndex5] = color;
            quadOrTailCounter++;
            continue;
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
        int sourceReadIndex = 0;
        int destinationWriteIndex = 0;
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
            continue;
          }
        }
    }

    private final static void blitUnmasked(int[] destinationPixels, int[] sourcePixels, int sourceIndex, int destinationIndex, int drawWidth, int drawHeight, int destinationRowSkip, int sourceRowSkip) {
        int negativeRow = 0;
        int quadEndThenRowEnd = 0;
        int destinationWriteIndex = 0;
        int sourceReadIndex = 0;
        int destinationWriteIndex2 = 0;
        int sourceReadIndex2 = 0;
        int destinationWriteIndex3 = 0;
        int sourceReadIndex3 = 0;
        int destinationWriteIndex4 = 0;
        int sourceReadIndex4 = 0;
        int destinationWriteIndex5 = 0;
        int sourceReadIndex5 = 0;
        for (negativeRow = -drawHeight; negativeRow < 0; negativeRow++) {
            quadEndThenRowEnd = destinationIndex + drawWidth - 3;
            while (destinationIndex < quadEndThenRowEnd) {
                destinationWriteIndex = destinationIndex;
                destinationIndex++;
                sourceReadIndex = sourceIndex;
                sourceIndex++;
                destinationPixels[destinationWriteIndex] = sourcePixels[sourceReadIndex];
                destinationWriteIndex2 = destinationIndex;
                destinationIndex++;
                sourceReadIndex2 = sourceIndex;
                sourceIndex++;
                destinationPixels[destinationWriteIndex2] = sourcePixels[sourceReadIndex2];
                destinationWriteIndex3 = destinationIndex;
                destinationIndex++;
                sourceReadIndex3 = sourceIndex;
                sourceIndex++;
                destinationPixels[destinationWriteIndex3] = sourcePixels[sourceReadIndex3];
                destinationWriteIndex4 = destinationIndex;
                destinationIndex++;
                sourceReadIndex4 = sourceIndex;
                sourceIndex++;
                destinationPixels[destinationWriteIndex4] = sourcePixels[sourceReadIndex4];
            }
            quadEndThenRowEnd += 3;
            while (destinationIndex < quadEndThenRowEnd) {
                destinationWriteIndex5 = destinationIndex;
                destinationIndex++;
                sourceReadIndex5 = sourceIndex;
                sourceIndex++;
                destinationPixels[destinationWriteIndex5] = sourcePixels[sourceReadIndex5];
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
        int sourceReadIndex = 0;
        int destinationWriteIndex = 0;
        int destinationWriteIndex2 = 0;
        int tintRedBlue;
        int tintGreen;
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
            if (sourcePixel == 0) {
              destinationIndex++;
              negativeColumnScratch++;
              continue;
            }
            if (sourcePixel >> 8 != (sourcePixel & 65535)) {
              destinationWriteIndex = destinationIndex;
              destinationIndex++;
              destinationPixels[destinationWriteIndex] = sourcePixel;
              negativeColumnScratch++;
              continue;
            }
            sourcePixel = sourcePixel & 255;
            destinationWriteIndex2 = destinationIndex;
            destinationIndex++;
            destinationPixels[destinationWriteIndex2] = (sourcePixel * tintRedBlue >> 8 & 16711934) + (sourcePixel * tintGreen & 65280) + 1;
            negativeColumnScratch++;
            continue;
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
              clipScratch = sourceYQ12 - (this.height << 12);
              if (clipScratch >= 0) {
                if (inverseSinStep != 0) {
                  clipScratch = (inverseSinStep - clipScratch) / inverseSinStep;
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
                  if (sourceYQ12 >= -4096) {
                    sourcePixelX = sourceXQ12 >> 12;
                    if (sourceXQ12 >> 12 < this.width) {
                      sourcePixelY = sourceYQ12 >> 12;
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
        if (inverseSinStep >= 0) {
          negativeRowCounter = bottomThenNegativeHeight;
          while (negativeRowCounter < 0) {
            sourceXQ12 = rowSourceXQ12 + (destinationOffsetX * inverseCosStep >> 4);
            sourceYQ12 = rowSourceYQ12 + (destinationOffsetX * inverseSinStep >> 4);
            negativePixelCounter = rightThenNegativeWidth;
            canSample = 0;
            clipScratch = sourceXQ12 - (this.width << 12);
            if (clipScratch >= 0) {
              if (inverseCosStep != 0) {
                clipScratch = (inverseCosStep - clipScratch) / inverseCosStep;
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
                  if (sourceXQ12 >= -4096) {
                    sourcePixelY = sourceYQ12 >> 12;
                    if (sourceYQ12 >> 12 < this.height) {
                      sourcePixelX = sourceXQ12 >> 12;
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
        negativeRowCounter = bottomThenNegativeHeight;
        while (negativeRowCounter < 0) {
          sourceXQ12 = rowSourceXQ12 + (destinationOffsetX * inverseCosStep >> 4);
          sourceYQ12 = rowSourceYQ12 + (destinationOffsetX * inverseSinStep >> 4);
          negativePixelCounter = rightThenNegativeWidth;
          canSample = 0;
          clipScratch = sourceXQ12 - (this.width << 12);
          if (clipScratch >= 0) {
            if (inverseCosStep != 0) {
              clipScratch = (inverseCosStep - clipScratch) / inverseCosStep;
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
            clipScratch = sourceYQ12 - (this.height << 12);
            if (clipScratch >= 0) {
              if (inverseSinStep != 0) {
                clipScratch = (inverseSinStep - clipScratch) / inverseSinStep;
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
                if ((sourceXQ12 >= -4096) &&
                    (sourceYQ12 >= -4096)) {
                  sourcePixelX = sourceXQ12 >> 12;
                  sourcePixelY = sourceYQ12 >> 12;
                  this.sampleBilinear(destinationIndex, sourcePixelX, sourcePixelY, sourceXQ12, sourceYQ12);
                  negativePixelCounter++;
                  sourceXQ12 = sourceXQ12 + inverseCosStep;
                  sourceYQ12 = sourceYQ12 + inverseSinStep;
                  destinationIndex++;
                  continue;
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
        int sourceReadIndex = 0;
        int destinationWriteIndex = 0;
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
        int destinationWriteIndex = 0;
        int rowSourceX16 = sourceX16;
        for (negativeRow = -drawHeight; negativeRow < 0; negativeRow++) {
            sourceRowOffset = (sourceY16 >> 16) * sourceWidth;
            for (negativeColumn = -drawWidth; negativeColumn < 0; negativeColumn++) {
                sourcePixel = sourcePixels[(sourceX16 >> 16) + sourceRowOffset];
                if (sourcePixel != 0) {
                    destinationWriteIndex = destinationIndex;
                    destinationIndex++;
                    destinationPixels[destinationWriteIndex] = color;
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
