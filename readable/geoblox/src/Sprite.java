/*
 * Decompiled by CFR-JS 0.4.0.
 */
class Sprite extends SpriteState {
    int[] pixels;

    private final void sampleBilinear(int destinationIndex, int sourceX, int sourceY, int fractionX, int fractionY) {
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_25_0 = 0;
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
        var6 = sourceY * this.width + sourceX;
        fractionX = fractionX & 4095;
        fractionY = fractionY & 4095;
        if (sourceY < 0) {
          var12 = 0;
          var11 = 0;
          var8 = 0;
          var7 = 0;
        } else {
          if (sourceX < 0) {
            var11 = 0;
            var7 = 0;
          } else {
            var7 = this.pixels[var6];
            if (var7 == 0) {
              stackIn_5_0 = 0;
            } else {
              stackIn_5_0 = (4096 - fractionX) * (4096 - fractionY);
            }
            var11 = stackIn_5_0;
          }
          if (sourceX >= this.width - 1) {
            var12 = 0;
            var8 = 0;
          } else {
            var8 = this.pixels[var6 + 1];
            if (var8 == 0) {
              stackIn_11_0 = 0;
            } else {
              stackIn_11_0 = fractionX * (4096 - fractionY);
            }
            var12 = stackIn_11_0;
          }
        }
        if (sourceY >= this.height - 1) {
          var14 = 0;
          var13 = 0;
          var10 = 0;
          var9 = 0;
        } else {
          if (sourceX < 0) {
            var13 = 0;
            var9 = 0;
          } else {
            var9 = this.pixels[var6 + this.width];
            if (var9 == 0) {
              stackIn_19_0 = 0;
            } else {
              stackIn_19_0 = (4096 - fractionX) * fractionY;
            }
            var13 = stackIn_19_0;
          }
          if (sourceX >= this.width - 1) {
            var14 = 0;
            var10 = 0;
          } else {
            var10 = this.pixels[var6 + this.width + 1];
            if (var10 == 0) {
              stackIn_25_0 = 0;
            } else {
              stackIn_25_0 = fractionX * fractionY;
            }
            var14 = stackIn_25_0;
          }
        }
        var11 = var11 >> 16;
        var12 = var12 >> 16;
        var13 = var13 >> 16;
        var14 = var14 >> 16;
        var15 = var11 + var12 + var13 + var14;
        if (var15 < 256) {
          if (var15 < 128) {
            return;
          }
          {
            var16 = (var7 & 16711935) * var11 + (var8 & 16711935) * var12;
            var16 = var16 + ((var9 & 16711935) * var13 + (var10 & 16711935) * var14);
            var17 = (var7 & 65280) * var11 + (var8 & 65280) * var12;
            var17 = var17 + ((var9 & 65280) * var13 + (var10 & 65280) * var14);
            var18 = ((var16 >>> 16) / var15 << 16) + (var17 / var15 & 65280) + (var16 & 65535) / var15;
            if (var18 == 0) {
              var18 = 1;
            }
            SoftwareRasterizer.framebuffer[destinationIndex] = var18;
          }
        } else {
          var16 = (var7 & 16711935) * var11 + (var8 & 16711935) * var12;
          var16 = var16 + ((var9 & 16711935) * var13 + (var10 & 16711935) * var14);
          var17 = (var7 & 65280) * var11 + (var8 & 65280) * var12;
          var17 = var17 + ((var9 & 65280) * var13 + (var10 & 65280) * var14);
          var18 = (var16 >>> 8 & 16711935) + (var17 >>> 8 & 65280);
          if (var18 == 0) {
            var18 = 1;
          }
          SoftwareRasterizer.framebuffer[destinationIndex] = var18;
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
            Sprite.a(SoftwareRasterizer.framebuffer, this.pixels, color, sourceIndex, destinationIndex, drawWidth, drawHeight, destinationRowSkip, sourceRowSkip);
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
        {
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
                L67: while (negativeRowCounter < 0) {
                  destinationIndex = rowDestinationIndex;
                  sourceXQ12 = rowSourceXQ12;
                  sourceYQ12 = rowSourceYQ12;
                  negativePixelCounter = rightThenNegativeWidth;
                  if (sourceXQ12 < 0) {
                    negativeRowCounter++;
                    rowDestinationIndex = rowDestinationIndex + SoftwareRasterizer.stride;
                    continue L67;
                  }
                  L68: {
                    if (sourceYQ12 >= 0) {
                      if (sourceXQ12 - (this.width << 12) < 0) {
                        if (sourceYQ12 - (this.height << 12) < 0) {
                          L69: while (true) {
                            if (negativePixelCounter >= 0) {
                              break L68;
                            }
                            sampledPixel = this.pixels[(sourceYQ12 >> 12) * this.width + (sourceXQ12 >> 12)];
                            if (sampledPixel == 0) {
                              destinationIndex++;
                              negativePixelCounter++;
                              continue L69;
                            }
                            {
                              writeIndexFixedXFixedY = destinationIndex;
                              destinationIndex++;
                              SoftwareRasterizer.framebuffer[writeIndexFixedXFixedY] = sampledPixel;
                              negativePixelCounter++;
                              continue L69;
                            }
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
                L55: while (negativeRowCounter < 0) {
                  L56: {
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
                        L59: while (negativePixelCounter < 0) {
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
                        break L56;
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
              L61: while (negativeRowCounter < 0) {
                L62: {
                  destinationIndex = rowDestinationIndex;
                  sourceXQ12 = rowSourceXQ12;
                  sourceYQ12 = rowSourceYQ12 + (destinationOffsetX * inverseSinStep >> 4);
                  negativePixelCounter = rightThenNegativeWidth;
                  if (sourceXQ12 >= 0) {
                    if (sourceXQ12 - (this.width << 12) >= 0) {
                      negativeRowCounter++;
                      rowSourceXQ12 = rowSourceXQ12 - inverseSinStep;
                      rowDestinationIndex = rowDestinationIndex + SoftwareRasterizer.stride;
                      continue L61;
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
                    L65: while (negativePixelCounter < 0) {
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
                    break L62;
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
                L29: while (negativeRowCounter < 0) {
                  L30: {
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
                        L33: while (negativePixelCounter < 0) {
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
                        break L30;
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
                L15: while (negativeRowCounter < 0) {
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
                  L20: while (negativePixelCounter < 0) {
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
                break L14;
              }
              negativeRowCounter = bottomThenNegativeHeight;
              L22: while (negativeRowCounter < 0) {
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
                L27: while (negativePixelCounter < 0) {
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
              break L14;
            }
            if (inverseSinStep == 0) {
              negativeRowCounter = bottomThenNegativeHeight;
              L49: while (negativeRowCounter < 0) {
                L50: {
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
                      L53: while (negativePixelCounter < 0) {
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
                      break L50;
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
              L35: while (negativeRowCounter < 0) {
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
                L40: while (negativePixelCounter < 0) {
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
              break L14;
            }
            negativeRowCounter = bottomThenNegativeHeight;
            L42: while (negativeRowCounter < 0) {
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
              L47: while (negativePixelCounter < 0) {
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
            break L14;
          }
          return;
        }
    }

    private final static void a(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11) {
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int incrementValue$1 = 0;
        int var12 = param3;
        for (var13 = -param8; var13 < 0; var13++) {
            var14 = (param4 >> 16) * param11;
            for (var15 = -param7; var15 < 0; var15++) {
                param2 = param1[(param3 >> 16) + var14];
                if (param2 != 0) {
                    incrementValue$1 = param5;
                    param5++;
                    param0[incrementValue$1] = param2;
                } else {
                    param5++;
                }
                param3 = param3 + param9;
            }
            param4 = param4 + param10;
            param3 = var12;
            param5 = param5 + param6;
        }
    }

    final void trimTransparentBorders() {
        int var8 = 0;
        int var9 = 0;
        int var1;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int[] var7;
        var1 = this.height - 1;
        L0: while (true) {
          L1: {
            if (var1 >= 0) {
              var2 = var1 * this.width;
              for (var3 = 0; var3 < this.width; var3++) {
                if (this.pixels[var2 + var3] != 0) {
                  break L1;
                }
              }
              var1--;
              continue L0;
            }
          }
          var2 = 0;
          L3: while (true) {
            L4: {
              if (var2 < var1) {
                var3 = var2 * this.width;
                for (var4 = 0; var4 < this.width; var4++) {
                  if (this.pixels[var3 + var4] != 0) {
                    break L4;
                  }
                }
                var2++;
                continue L3;
              }
            }
            var3 = this.width - 1;
            L6: while (true) {
              L7: {
                if (var3 >= 0) {
                  for (var4 = var2; var4 <= var1; var4++) {
                    if (this.pixels[var4 * this.width + var3] != 0) {
                      break L7;
                    }
                  }
                  var3--;
                  continue L6;
                }
              }
              var4 = 0;
              L9: while (true) {
                L10: {
                  if (var4 < var3) {
                    for (var5 = var2; var5 <= var1; var5++) {
                      if (this.pixels[var5 * this.width + var4] != 0) {
                        break L10;
                      }
                    }
                    var4++;
                    continue L9;
                  }
                }
                if (var4 == 0) {
                  if (var3 == this.width - 1) {
                    if (var2 == 0) {
                      if (var1 == this.height - 1) {
                        return;
                      }
                    }
                  }
                }
                var5 = var3 + 1 - var4;
                var6 = var1 + 1 - var2;
                var7 = new int[var5 * var6];
                for (var8 = 0; var8 < var6; var8++) {
                  for (var9 = 0; var9 < var5; var9++) {
                    var7[var8 * var5 + var9] = this.pixels[(var8 + var2) * this.width + (var9 + var4)];
                  }
                }
                this.pixels = var7;
                this.width = var5;
                this.height = var6;
                this.trimX = this.trimX + var4;
                this.trimY = this.trimY + var2;
                return;
              }
            }
          }
        }
    }

    final void addOutline(int color) {
        int var4 = 0;
        int var5 = 0;
        int incrementValue$1 = 0;
        int[] var2;
        int var3;
        int var6;
        var2 = new int[this.width * this.height];
        var3 = 0;
        for (var4 = 0; var4 < this.height; var4++) {
          for (var5 = 0; var5 < this.width; var5++) {
            L2: {
              var6 = this.pixels[var3];
              if (var6 == 0) {
                if (var5 > 0) {
                  if (this.pixels[var3 - 1] != 0) {
                    var6 = color;
                    break L2;
                  }
                }
                if (var4 > 0) {
                  if (this.pixels[var3 - this.width] != 0) {
                    var6 = color;
                    break L2;
                  }
                }
                if (var5 < this.width - 1) {
                  if (this.pixels[var3 + 1] != 0) {
                    var6 = color;
                    break L2;
                  }
                }
                if (var4 < this.height - 1) {
                  if (this.pixels[var3 + this.width] != 0) {
                    var6 = color;
                  }
                }
              }
            }
            incrementValue$1 = var3;
            var3++;
            var2[incrementValue$1] = var6;
          }
        }
        this.pixels = var2;
    }

    private final static void b(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int incrementValue$11 = 0;
        int incrementValue$12 = 0;
        int var10;
        int var11;
        int var12;
        int var13;
        var10 = 256 - param9;
        var11 = -param6;
        L0: while (true) {
          if (var11 >= 0) {
            return;
          }
          var12 = -param5;
          L1: while (true) {
            if (var12 >= 0) {
              param4 = param4 + param7;
              param3 = param3 + param8;
              var11++;
              continue L0;
            }
            {
              incrementValue$11 = param3;
              param3++;
              param2 = param1[incrementValue$11];
              if (param2 == 0) {
                param4++;
                var12++;
                continue L1;
              }
              {
                var13 = param0[param4];
                incrementValue$12 = param4;
                param4++;
                param0[incrementValue$12] = ((param2 & 16711935) * param9 + (var13 & 16711935) * var10 & -16711936) + ((param2 & 65280) * param9 + (var13 & 65280) * var10 & 16711680) >> 8;
                var12++;
                continue L1;
              }
            }
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
            Sprite.a(0, SoftwareRasterizer.framebuffer, this.pixels, 0, sourceIndex, destinationIndex, drawWidth, drawHeight, destinationRowSkip, sourceRowSkip);
            return;
        }
    }

    void drawScaled(int x, int y, int destinationWidth, int destinationHeight) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var14 = 0;
        int var13 = 0;
        int var15 = 0;
        if (destinationWidth > 0) {
            if (destinationHeight <= 0) {
                return;
            }
            var5 = this.width;
            var6 = this.height;
            var7 = 0;
            var8 = 0;
            var9 = this.fullWidth;
            var10 = this.fullHeight;
            var11 = (var9 << 16) / destinationWidth;
            var12 = (var10 << 16) / destinationHeight;
            if (this.trimX > 0) {
                var13 = ((this.trimX << 16) + var11 - 1) / var11;
                x = x + var13;
                var7 = var7 + (var13 * var11 - (this.trimX << 16));
            }
            if (this.trimY > 0) {
                var13 = ((this.trimY << 16) + var12 - 1) / var12;
                y = y + var13;
                var8 = var8 + (var13 * var12 - (this.trimY << 16));
            }
            if (var5 < var9) {
                destinationWidth = ((var5 << 16) - var7 + var11 - 1) / var11;
            }
            if (var6 < var10) {
                destinationHeight = ((var6 << 16) - var8 + var12 - 1) / var12;
            }
            var13 = x + y * SoftwareRasterizer.stride;
            var14 = SoftwareRasterizer.stride - destinationWidth;
            if (y + destinationHeight > SoftwareRasterizer.clipBottom) {
                destinationHeight = destinationHeight - (y + destinationHeight - SoftwareRasterizer.clipBottom);
            }
            if (y < SoftwareRasterizer.clipTop) {
                var15 = SoftwareRasterizer.clipTop - y;
                destinationHeight = destinationHeight - var15;
                var13 = var13 + var15 * SoftwareRasterizer.stride;
                var8 = var8 + var12 * var15;
            }
            if (x + destinationWidth > SoftwareRasterizer.clipRight) {
                var15 = x + destinationWidth - SoftwareRasterizer.clipRight;
                destinationWidth = destinationWidth - var15;
                var14 = var14 + var15;
            }
            if (x < SoftwareRasterizer.clipLeft) {
                var15 = SoftwareRasterizer.clipLeft - x;
                destinationWidth = destinationWidth - var15;
                var13 = var13 + var15;
                var7 = var7 + var11 * var15;
                var14 = var14 + var15;
            }
            Sprite.a(SoftwareRasterizer.framebuffer, this.pixels, 0, var7, var8, var13, var14, destinationWidth, destinationHeight, var11, var12, var5);
            return;
        }
    }

    void drawScaledAlpha(int x, int y, int destinationWidth, int destinationHeight, int alpha256) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var15 = 0;
        int var14 = 0;
        int var16 = 0;
        if (destinationWidth > 0) {
            if (destinationHeight <= 0) {
                return;
            }
            var6 = this.width;
            var7 = this.height;
            var8 = 0;
            var9 = 0;
            var10 = this.fullWidth;
            var11 = this.fullHeight;
            var12 = (var10 << 16) / destinationWidth;
            var13 = (var11 << 16) / destinationHeight;
            if (this.trimX > 0) {
                var14 = ((this.trimX << 16) + var12 - 1) / var12;
                x = x + var14;
                var8 = var8 + (var14 * var12 - (this.trimX << 16));
            }
            if (this.trimY > 0) {
                var14 = ((this.trimY << 16) + var13 - 1) / var13;
                y = y + var14;
                var9 = var9 + (var14 * var13 - (this.trimY << 16));
            }
            if (var6 < var10) {
                destinationWidth = ((var6 << 16) - var8 + var12 - 1) / var12;
            }
            if (var7 < var11) {
                destinationHeight = ((var7 << 16) - var9 + var13 - 1) / var13;
            }
            var14 = x + y * SoftwareRasterizer.stride;
            var15 = SoftwareRasterizer.stride - destinationWidth;
            if (y + destinationHeight > SoftwareRasterizer.clipBottom) {
                destinationHeight = destinationHeight - (y + destinationHeight - SoftwareRasterizer.clipBottom);
            }
            if (y < SoftwareRasterizer.clipTop) {
                var16 = SoftwareRasterizer.clipTop - y;
                destinationHeight = destinationHeight - var16;
                var14 = var14 + var16 * SoftwareRasterizer.stride;
                var9 = var9 + var13 * var16;
            }
            if (x + destinationWidth > SoftwareRasterizer.clipRight) {
                var16 = x + destinationWidth - SoftwareRasterizer.clipRight;
                destinationWidth = destinationWidth - var16;
                var15 = var15 + var16;
            }
            if (x < SoftwareRasterizer.clipLeft) {
                var16 = SoftwareRasterizer.clipLeft - x;
                destinationWidth = destinationWidth - var16;
                var14 = var14 + var16;
                var8 = var8 + var12 * var16;
                var15 = var15 + var16;
            }
            Sprite.a(SoftwareRasterizer.framebuffer, this.pixels, 0, var8, var9, var14, var15, destinationWidth, destinationHeight, var12, var13, var6, alpha256);
            return;
        }
    }

    final void drawRotatedCentered(int centerX, int centerY, int angle, int scale) {
        int var5 = this.fullWidth << 3;
        int var6 = this.fullHeight << 3;
        centerX = (centerX << 4) + (var5 & 15);
        centerY = (centerY << 4) + (var6 & 15);
        this.rotateSmooth(var5, var6, centerX, centerY, angle, scale);
    }

    private final static void a(int param0, int[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        var10 = -param7;
        L0: while (true) {
          if (var10 >= 0) {
            return;
          }
          var11 = -param6;
          L1: while (true) {
            if (var11 >= 0) {
              param5 = param5 + param8;
              param4 = param4 + param9;
              var10++;
              continue L0;
            }
            {
              incrementValue$4 = param4;
              param4++;
              param3 = param2[incrementValue$4];
              if (param3 == 0) {
                param5++;
                var11++;
                continue L1;
              }
              param0 = param1[param5];
              if (param0 == 0) {
                param5++;
                var11++;
                continue L1;
              }
              {
                var12 = ((param3 & 16711680) >>> 16) * ((param0 & 16711680) >>> 16) >>> 8;
                var13 = (param3 & 65280) * (param0 & 65280) >>> 24;
                var14 = (param3 & 255) * (param0 & 255) >>> 8;
                incrementValue$5 = param5;
                param5++;
                param1[incrementValue$5] = (var12 << 16) + (var13 << 8) + var14;
                var11++;
                continue L1;
              }
            }
          }
        }
    }

    private final static void a(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12) {
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int incrementValue$0 = 0;
        int var18 = 0;
        int var13 = 256 - param12;
        int var14 = param3;
        for (var15 = -param8; var15 < 0; var15++) {
            var16 = (param4 >> 16) * param11;
            for (var17 = -param7; var17 < 0; var17++) {
                param2 = param1[(param3 >> 16) + var16];
                if (param2 != 0) {
                    var18 = param0[param5];
                    incrementValue$0 = param5;
                    param5++;
                    param0[incrementValue$0] = ((param2 & 16711935) * param12 + (var18 & 16711935) * var13 & -16711936) + ((param2 & 65280) * param12 + (var18 & 65280) * var13 & 16711680) >> 8;
                } else {
                    param5++;
                }
                param3 = param3 + param9;
            }
            param4 = param4 + param10;
            param3 = var14;
            param5 = param5 + param6;
        }
    }

    private final static void a(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
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
        var10 = param9 >> 16 & 255;
        var11 = param9 >> 8 & 255;
        var12 = param9 & 255;
        var13 = -(param5 >> 2);
        param5 = -(param5 & 3);
        var14 = var13 + var13 + var13 + var13 + param5;
        var15 = -param6;
        L0: while (true) {
          if (var15 >= 0) {
            return;
          }
          {
            var16 = var14;
            L1: while (true) {
              if (var16 >= 0) {
                param4 = param4 + param7;
                param3 = param3 + param8;
                var15++;
                continue L0;
              }
              {
                incrementValue$0 = param3;
                param3++;
                param2 = param1[incrementValue$0];
                if (param2 == 0) {
                  param4++;
                  var16++;
                  continue L1;
                }
                {
                  var17 = param2 >> 16 & 255;
                  var18 = param2 >> 8 & 255;
                  var19 = param2 & 255;
                  if (var17 == var18) {
                    if (var18 == var19) {
                      if (var17 > 128) {
                        incrementValue$1 = param4;
                        param4++;
                        param0[incrementValue$1] = (var10 * (256 - var17) + 255 * (var17 - 128) >> 7 << 16) + (var11 * (256 - var18) + 255 * (var18 - 128) >> 7 << 8) + (var12 * (256 - var19) + 255 * (var19 - 128) >> 7);
                        var16++;
                        continue L1;
                      }
                      {
                        incrementValue$2 = param4;
                        param4++;
                        param0[incrementValue$2] = (var17 * var10 >> 7 << 16) + (var18 * var11 >> 7 << 8) + (var19 * var12 >> 7);
                        var16++;
                        continue L1;
                      }
                    }
                  }
                  incrementValue$3 = param4;
                  param4++;
                  param0[incrementValue$3] = param2;
                  var16++;
                  continue L1;
                }
              }
            }
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
                Sprite.a(0, 0, 0, SoftwareRasterizer.framebuffer, this.pixels, sourceIndex, 0, destinationIndex, 0, drawWidth, drawHeight, destinationRowSkip, sourceRowSkip);
            } else {
                Sprite.a(0, 0, 0, SoftwareRasterizer.framebuffer, this.pixels, sourceIndex, 0, destinationIndex, 0, drawWidth, drawHeight, destinationRowSkip, sourceRowSkip, intensity256);
            }
            return;
        }
    }

    final void rotateClockwise() {
        int var4 = 0;
        int incrementValue$0 = 0;
        int var3 = 0;
        int[] var1 = new int[this.width * this.height];
        int var2 = 0;
        for (var3 = 0; var3 < this.width; var3++) {
            for (var4 = this.height - 1; var4 >= 0; var4--) {
                incrementValue$0 = var2;
                var2++;
                var1[incrementValue$0] = this.pixels[var3 + var4 * this.width];
            }
        }
        this.pixels = var1;
        var3 = this.trimY;
        this.trimY = this.trimX;
        this.trimX = this.fullHeight - this.height - var3;
        var3 = this.height;
        this.height = this.width;
        this.width = var3;
        var3 = this.fullHeight;
        this.fullHeight = this.fullWidth;
        this.fullWidth = var3;
    }

    final void setAsRasterTarget() {
        SoftwareRasterizer.setRasterTarget(this.pixels, this.width, this.height);
    }

    final Sprite copyMirroredHorizontally() {
        int var2 = 0;
        int var3 = 0;
        Sprite var1 = new Sprite(this.width, this.height);
        var1.fullWidth = this.fullWidth;
        var1.fullHeight = this.fullHeight;
        var1.trimX = this.fullWidth - this.width - this.trimX;
        var1.trimY = this.trimY;
        for (var2 = 0; var2 < this.height; var2++) {
            for (var3 = 0; var3 < this.width; var3++) {
                var1.pixels[var2 * this.width + var3] = this.pixels[var2 * this.width + this.width - 1 - var3];
            }
        }
        return var1;
    }

    void drawHalfSize(int x, int y) {
        x = x + (this.trimX >> 1);
        y = y + (this.trimY >> 1);
        int var3 = x < SoftwareRasterizer.clipLeft ? SoftwareRasterizer.clipLeft - x << 1 : 0;
        int var4 = x + (this.width >> 1) > SoftwareRasterizer.clipRight ? SoftwareRasterizer.clipRight - x << 1 : this.width;
        int var5 = y < SoftwareRasterizer.clipTop ? SoftwareRasterizer.clipTop - y << 1 : 0;
        int var6 = y + (this.height >> 1) > SoftwareRasterizer.clipBottom ? SoftwareRasterizer.clipBottom - y << 1 : this.height;
        Sprite.a(this.pixels, var5 * this.width + var3, (y + (var5 >> 1)) * SoftwareRasterizer.stride + (x + (var3 >> 1)), (this.width << 1) - (var4 - var3) + (this.width & 1), SoftwareRasterizer.stride - (var4 - var3 >> 1), this.width, var4 - var3 >> 1, var6 - var5 >> 1);
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
            Sprite.b(SoftwareRasterizer.framebuffer, this.pixels, 0, sourceIndex, destinationIndex, drawWidth, drawHeight, destinationRowSkip, sourceRowSkip);
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
            Sprite.a(SoftwareRasterizer.framebuffer, this.pixels, 0, sourceIndex, destinationIndex, drawWidth, drawHeight, destinationRowSkip, sourceRowSkip, tintColor);
            return;
        }
    }

    private final static void b(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$8 = 0;
        int incrementValue$9 = 0;
        int var9;
        int var10;
        int var11;
        var9 = -(param5 >> 2);
        param5 = -(param5 & 3);
        var10 = -param6;
        L0: while (true) {
          if (var10 >= 0) {
            return;
          }
          {
            var11 = var9;
            L1: while (true) {
              if (var11 >= 0) {
                var11 = param5;
                L2: while (true) {
                  if (var11 >= 0) {
                    param4 = param4 + param7;
                    param3 = param3 + param8;
                    var10++;
                    continue L0;
                  }
                  {
                    incrementValue$0 = param3;
                    param3++;
                    param2 = param1[incrementValue$0];
                    if (param2 == 0) {
                      param4++;
                      var11++;
                      continue L2;
                    }
                    {
                      incrementValue$1 = param4;
                      param4++;
                      param0[incrementValue$1] = param2;
                      var11++;
                      continue L2;
                    }
                  }
                }
              }
              {
                incrementValue$2 = param3;
                param3++;
                param2 = param1[incrementValue$2];
                if (param2 == 0) {
                  param4++;
                } else {
                  incrementValue$3 = param4;
                  param4++;
                  param0[incrementValue$3] = param2;
                }
                incrementValue$4 = param3;
                param3++;
                param2 = param1[incrementValue$4];
                if (param2 == 0) {
                  param4++;
                } else {
                  incrementValue$5 = param4;
                  param4++;
                  param0[incrementValue$5] = param2;
                }
                incrementValue$6 = param3;
                param3++;
                param2 = param1[incrementValue$6];
                if (param2 == 0) {
                  param4++;
                } else {
                  incrementValue$7 = param4;
                  param4++;
                  param0[incrementValue$7] = param2;
                }
                incrementValue$8 = param3;
                param3++;
                param2 = param1[incrementValue$8];
                if (param2 == 0) {
                  param4++;
                  var11++;
                  continue L1;
                }
                {
                  incrementValue$9 = param4;
                  param4++;
                  param0[incrementValue$9] = param2;
                  var11++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    void drawQuarterSize(int x, int y) {
        int var9 = 0;
        int var16 = 0;
        int var17 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
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
        var3 = this.width >> 2;
        var4 = this.height >> 2;
        x = x + this.trimX / 4;
        y = y + this.trimY / 4;
        if (x >= SoftwareRasterizer.clipLeft) {
          stackIn_3_0 = 0;
        } else {
          stackIn_3_0 = SoftwareRasterizer.clipLeft - x << 2;
        }
        var5 = stackIn_3_0;
        if (x + var3 <= SoftwareRasterizer.clipRight) {
          stackIn_6_0 = this.width - 4;
        } else {
          stackIn_6_0 = (SoftwareRasterizer.clipRight - x << 2) - 4;
        }
        var6 = stackIn_6_0;
        if (y >= SoftwareRasterizer.clipTop) {
          stackIn_9_0 = 0;
        } else {
          stackIn_9_0 = SoftwareRasterizer.clipTop - y << 2;
        }
        var7 = stackIn_9_0;
        if (y + var4 <= SoftwareRasterizer.clipBottom) {
          stackIn_12_0 = this.height - 4;
        } else {
          stackIn_12_0 = (SoftwareRasterizer.clipBottom - y << 2) - 4;
        }
        var8 = stackIn_12_0;
        for (var9 = var7; var9 <= var8; var9 += 4) {
          var10 = var9 * this.width + var5;
          var11 = (y + (var9 >> 2)) * SoftwareRasterizer.stride + (x + (var5 >> 2));
          var12 = var5;
          L5: while (var12 <= var6) {
            var13 = 0;
            var14 = 0;
            var15 = 0;
            for (var16 = 0; var16 < 4; var16++) {
              for (var17 = 0; var17 < 4; var17++) {
                var13 = this.pixels[var10 + var16 * this.width + var17];
                if (var13 == 0) {
                  var13 = SoftwareRasterizer.framebuffer[var11];
                }
                var14 = var14 + (var13 & 16711935);
                var15 = var15 + (var13 & 65280);
              }
            }
            SoftwareRasterizer.framebuffer[var11] = (var14 & 267390960 | var15 & 1044480) >> 4;
            var12 += 4;
            var10 += 4;
            var11++;
          }
        }
    }

    private final static void a(int[] param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int dupTemp$0 = 0;
        int dupTemp$1 = 0;
        int dupTemp$2 = 0;
        int dupTemp$3 = 0;
        int incrementValue$4 = 0;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        var8 = 0;
        L0: while (var8 < param7) {
          var9 = 0;
          L1: while (var9 < param6) {
            var11 = SoftwareRasterizer.framebuffer[param2] & 16711935;
            var12 = SoftwareRasterizer.framebuffer[param2] & 65280;
            var13 = 0;
            var14 = 0;
            dupTemp$0 = param0[param1];
            var10 = dupTemp$0;
            if (dupTemp$0 != 0) {
              var13 = var13 + (var10 & 16711935);
              var14 = var14 + (var10 & 65280);
            } else {
              var13 = var13 + var11;
              var14 = var14 + var12;
            }
            dupTemp$1 = param0[param1 + 1];
            var10 = dupTemp$1;
            if (dupTemp$1 != 0) {
              var13 = var13 + (var10 & 16711935);
              var14 = var14 + (var10 & 65280);
            } else {
              var13 = var13 + var11;
              var14 = var14 + var12;
            }
            dupTemp$2 = param0[param1 + param5];
            var10 = dupTemp$2;
            if (dupTemp$2 != 0) {
              var13 = var13 + (var10 & 16711935);
              var14 = var14 + (var10 & 65280);
            } else {
              var13 = var13 + var11;
              var14 = var14 + var12;
            }
            dupTemp$3 = param0[param1 + param5 + 1];
            var10 = dupTemp$3;
            if (dupTemp$3 != 0) {
              var13 = var13 + (var10 & 16711935);
              var14 = var14 + (var10 & 65280);
            } else {
              var13 = var13 + var11;
              var14 = var14 + var12;
            }
            incrementValue$4 = param2;
            param2++;
            SoftwareRasterizer.framebuffer[incrementValue$4] = (var13 & 66847740 | var14 & 261120) >> 2;
            var9++;
            param1 += 2;
          }
          var8++;
          param1 = param1 + param3;
          param2 = param2 + param4;
        }
    }

    private final static void a(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$8 = 0;
        int incrementValue$9 = 0;
        int var9;
        int var10;
        int var11;
        var9 = -(param5 >> 2);
        param5 = -(param5 & 3);
        var10 = -param6;
        L0: while (true) {
          if (var10 >= 0) {
            return;
          }
          {
            var11 = var9;
            L1: while (true) {
              if (var11 >= 0) {
                var11 = param5;
                L2: while (true) {
                  if (var11 >= 0) {
                    param4 = param4 + param7;
                    param3 = param3 + param8;
                    var10++;
                    continue L0;
                  }
                  {
                    incrementValue$0 = param3;
                    param3++;
                    if (param1[incrementValue$0] == 0) {
                      param4++;
                      var11++;
                      continue L2;
                    }
                    {
                      incrementValue$1 = param4;
                      param4++;
                      param0[incrementValue$1] = param2;
                      var11++;
                      continue L2;
                    }
                  }
                }
              }
              {
                incrementValue$2 = param3;
                param3++;
                if (param1[incrementValue$2] == 0) {
                  param4++;
                } else {
                  incrementValue$3 = param4;
                  param4++;
                  param0[incrementValue$3] = param2;
                }
                incrementValue$4 = param3;
                param3++;
                if (param1[incrementValue$4] == 0) {
                  param4++;
                } else {
                  incrementValue$5 = param4;
                  param4++;
                  param0[incrementValue$5] = param2;
                }
                incrementValue$6 = param3;
                param3++;
                if (param1[incrementValue$6] == 0) {
                  param4++;
                } else {
                  incrementValue$7 = param4;
                  param4++;
                  param0[incrementValue$7] = param2;
                }
                incrementValue$8 = param3;
                param3++;
                if (param1[incrementValue$8] == 0) {
                  param4++;
                  var11++;
                  continue L1;
                }
                {
                  incrementValue$9 = param4;
                  param4++;
                  param0[incrementValue$9] = param2;
                  var11++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    final void drawScaledSilhouette(int x, int y, int destinationWidth, int destinationHeight, int color) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var15 = 0;
        int var14 = 0;
        int var16 = 0;
        if (destinationWidth > 0) {
            if (destinationHeight <= 0) {
                return;
            }
            if (destinationWidth == this.width && destinationHeight == this.height) {
                this.drawSilhouette(x, y, color);
                return;
            }
            var6 = this.width;
            var7 = this.height;
            var8 = 0;
            var9 = 0;
            var10 = this.fullWidth;
            var11 = this.fullHeight;
            var12 = (var10 << 16) / destinationWidth;
            var13 = (var11 << 16) / destinationHeight;
            if (this.trimX > 0) {
                var14 = ((this.trimX << 16) + var12 - 1) / var12;
                x = x + var14;
                var8 = var8 + (var14 * var12 - (this.trimX << 16));
            }
            if (this.trimY > 0) {
                var14 = ((this.trimY << 16) + var13 - 1) / var13;
                y = y + var14;
                var9 = var9 + (var14 * var13 - (this.trimY << 16));
            }
            if (var6 < var10) {
                destinationWidth = ((var6 << 16) - var8 + var12 - 1) / var12;
            }
            if (var7 < var11) {
                destinationHeight = ((var7 << 16) - var9 + var13 - 1) / var13;
            }
            var14 = x + y * SoftwareRasterizer.stride;
            var15 = SoftwareRasterizer.stride - destinationWidth;
            if (y + destinationHeight > SoftwareRasterizer.clipBottom) {
                destinationHeight = destinationHeight - (y + destinationHeight - SoftwareRasterizer.clipBottom);
            }
            if (y < SoftwareRasterizer.clipTop) {
                var16 = SoftwareRasterizer.clipTop - y;
                destinationHeight = destinationHeight - var16;
                var14 = var14 + var16 * SoftwareRasterizer.stride;
                var9 = var9 + var13 * var16;
            }
            if (x + destinationWidth > SoftwareRasterizer.clipRight) {
                var16 = x + destinationWidth - SoftwareRasterizer.clipRight;
                destinationWidth = destinationWidth - var16;
                var15 = var15 + var16;
            }
            if (x < SoftwareRasterizer.clipLeft) {
                var16 = SoftwareRasterizer.clipLeft - x;
                destinationWidth = destinationWidth - var16;
                var14 = var14 + var16;
                var8 = var8 + var12 * var16;
                var15 = var15 + var16;
            }
            Sprite.b(SoftwareRasterizer.framebuffer, this.pixels, 0, var8, var9, var14, var15, destinationWidth, destinationHeight, var12, var13, var6, color);
            return;
        }
    }

    private final static void a(int param0, int param1, int param2, int[] param3, int[] param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13) {
        int incrementValue$11 = 0;
        int incrementValue$12 = 0;
        param8 = -param10;
        L0: while (true) {
          if (param8 >= 0) {
            return;
          }
          param6 = -param9;
          L1: while (true) {
            if (param6 >= 0) {
              param7 = param7 + param11;
              param5 = param5 + param12;
              param8++;
              continue L0;
            }
            {
              incrementValue$11 = param5;
              param5++;
              param0 = param4[incrementValue$11];
              if (param0 == 0) {
                param7++;
                param6++;
                continue L1;
              }
              {
                param1 = (param0 & 16711935) * param13;
                param0 = (param1 & -16711936) + (param0 * param13 - param1 & 16711680) >>> 8;
                param1 = param3[param7];
                param2 = param0 + param1;
                param0 = (param0 & 16711935) + (param1 & 16711935);
                param1 = (param0 & 16777472) + (param2 - param0 & 65536);
                incrementValue$12 = param7;
                param7++;
                param3[incrementValue$12] = param2 - param1 | param1 - (param1 >>> 8);
                param6++;
                continue L1;
              }
            }
          }
        }
    }

    private final static void a(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var8 = 0;
        int var9 = 0;
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$8 = 0;
        int incrementValue$9 = 0;
        for (var8 = -param5; var8 < 0; var8++) {
            var9 = param3 + param4 - 3;
            while (param3 < var9) {
                incrementValue$0 = param3;
                param3++;
                incrementValue$1 = param2;
                param2++;
                param0[incrementValue$0] = param1[incrementValue$1];
                incrementValue$2 = param3;
                param3++;
                incrementValue$3 = param2;
                param2++;
                param0[incrementValue$2] = param1[incrementValue$3];
                incrementValue$4 = param3;
                param3++;
                incrementValue$5 = param2;
                param2++;
                param0[incrementValue$4] = param1[incrementValue$5];
                incrementValue$6 = param3;
                param3++;
                incrementValue$7 = param2;
                param2++;
                param0[incrementValue$6] = param1[incrementValue$7];
            }
            var9 += 3;
            while (param3 < var9) {
                incrementValue$8 = param3;
                param3++;
                incrementValue$9 = param2;
                param2++;
                param0[incrementValue$8] = param1[incrementValue$9];
            }
            param3 = param3 + param6;
            param2 = param2 + param7;
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
            Sprite.a(SoftwareRasterizer.framebuffer, this.pixels, sourceIndex, destinationIndex, drawWidth, drawHeight, destinationRowSkip, sourceRowSkip);
            return;
        }
    }

    private final static void b(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11) {
        int incrementValue$12 = 0;
        int incrementValue$13 = 0;
        int incrementValue$14 = 0;
        int var12;
        int var13;
        var12 = param11 & 16711935;
        var13 = param11 >> 8 & 255;
        param6 = -param8;
        L0: while (true) {
          if (param6 >= 0) {
            return;
          }
          param5 = -param7;
          L1: while (true) {
            if (param5 >= 0) {
              param4 = param4 + param9;
              param3 = param3 + param10;
              param6++;
              continue L0;
            }
            {
              incrementValue$12 = param3;
              param3++;
              param2 = param1[incrementValue$12];
              if (param2 == 0) {
                param4++;
                param5++;
                continue L1;
              }
              if (param2 >> 8 != (param2 & 65535)) {
                incrementValue$13 = param4;
                param4++;
                param0[incrementValue$13] = param2;
                param5++;
                continue L1;
              }
              {
                param2 = param2 & 255;
                incrementValue$14 = param4;
                param4++;
                param0[incrementValue$14] = (param2 * var12 >> 8 & 16711934) + (param2 * var13 & 65280) + 1;
                param5++;
                continue L1;
              }
            }
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
        {
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
                L15: while (negativeRowCounter < 0) {
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
                  L17: {
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
                        L19: while (negativePixelCounter < 0) {
                          sourcePixelX = sourceXQ12 >> 12;
                          if (sourceXQ12 >> 12 < this.width) {
                            sourcePixelY = sourceYQ12 >> 12;
                            if (sourceYQ12 >> 12 < this.height) {
                              this.sampleBilinear(destinationIndex, sourcePixelX, sourcePixelY, sourceXQ12, sourceYQ12);
                              negativePixelCounter++;
                              sourceXQ12 = sourceXQ12 + inverseCosStep;
                              sourceYQ12 = sourceYQ12 + inverseSinStep;
                              destinationIndex++;
                              continue L19;
                            }
                          }
                          break;
                        }
                        destinationIndex = destinationIndex - negativePixelCounter;
                        break L17;
                      }
                    }
                  }
                  negativeRowCounter++;
                  rowSourceXQ12 = rowSourceXQ12 - inverseSinStep;
                  rowSourceYQ12 = rowSourceYQ12 + inverseCosStep;
                  destinationIndex = destinationIndex + rowSkip;
                }
                break L14;
              }
              negativeRowCounter = bottomThenNegativeHeight;
              L21: while (negativeRowCounter < 0) {
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
                L23: {
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
                      L25: while (negativePixelCounter < 0) {
                        if (sourceYQ12 >= -4096) {
                          sourcePixelX = sourceXQ12 >> 12;
                          if (sourceXQ12 >> 12 < this.width) {
                            sourcePixelY = sourceYQ12 >> 12;
                            this.sampleBilinear(destinationIndex, sourcePixelX, sourcePixelY, sourceXQ12, sourceYQ12);
                            negativePixelCounter++;
                            sourceXQ12 = sourceXQ12 + inverseCosStep;
                            sourceYQ12 = sourceYQ12 + inverseSinStep;
                            destinationIndex++;
                            continue L25;
                          }
                        }
                        break;
                      }
                      destinationIndex = destinationIndex - negativePixelCounter;
                      break L23;
                    }
                  }
                }
                negativeRowCounter++;
                rowSourceXQ12 = rowSourceXQ12 - inverseSinStep;
                rowSourceYQ12 = rowSourceYQ12 + inverseCosStep;
                destinationIndex = destinationIndex + rowSkip;
              }
              break L14;
            }
            if (inverseSinStep >= 0) {
              negativeRowCounter = bottomThenNegativeHeight;
              L27: while (negativeRowCounter < 0) {
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
                L29: {
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
                      L31: while (negativePixelCounter < 0) {
                        if (sourceXQ12 >= -4096) {
                          sourcePixelY = sourceYQ12 >> 12;
                          if (sourceYQ12 >> 12 < this.height) {
                            sourcePixelX = sourceXQ12 >> 12;
                            this.sampleBilinear(destinationIndex, sourcePixelX, sourcePixelY, sourceXQ12, sourceYQ12);
                            negativePixelCounter++;
                            sourceXQ12 = sourceXQ12 + inverseCosStep;
                            sourceYQ12 = sourceYQ12 + inverseSinStep;
                            destinationIndex++;
                            continue L31;
                          }
                        }
                        break;
                      }
                      destinationIndex = destinationIndex - negativePixelCounter;
                      break L29;
                    }
                  }
                }
                negativeRowCounter++;
                rowSourceXQ12 = rowSourceXQ12 - inverseSinStep;
                rowSourceYQ12 = rowSourceYQ12 + inverseCosStep;
                destinationIndex = destinationIndex + rowSkip;
              }
              break L14;
            }
            negativeRowCounter = bottomThenNegativeHeight;
            L33: while (negativeRowCounter < 0) {
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
              L35: {
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
                    L37: while (negativePixelCounter < 0) {
                      if (sourceXQ12 >= -4096) {
                        if (sourceYQ12 >= -4096) {
                          sourcePixelX = sourceXQ12 >> 12;
                          sourcePixelY = sourceYQ12 >> 12;
                          this.sampleBilinear(destinationIndex, sourcePixelX, sourcePixelY, sourceXQ12, sourceYQ12);
                          negativePixelCounter++;
                          sourceXQ12 = sourceXQ12 + inverseCosStep;
                          sourceYQ12 = sourceYQ12 + inverseSinStep;
                          destinationIndex++;
                          continue L37;
                        }
                      }
                      break;
                    }
                    destinationIndex = destinationIndex - negativePixelCounter;
                    break L35;
                  }
                }
              }
              negativeRowCounter++;
              rowSourceXQ12 = rowSourceXQ12 - inverseSinStep;
              rowSourceYQ12 = rowSourceYQ12 + inverseCosStep;
              destinationIndex = destinationIndex + rowSkip;
            }
            return;
          }
          return;
        }
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
            Sprite.b(SoftwareRasterizer.framebuffer, this.pixels, 0, sourceIndex, destinationIndex, 0, 0, drawWidth, drawHeight, destinationRowSkip, sourceRowSkip, tintColor);
            return;
        }
    }

    final Sprite copy() {
        int var3 = 0;
        Sprite var1 = new Sprite(this.width, this.height);
        var1.fullWidth = this.fullWidth;
        var1.fullHeight = this.fullHeight;
        var1.trimX = this.trimX;
        var1.trimY = this.trimY;
        int var2 = this.pixels.length;
        for (var3 = 0; var3 < var2; var3++) {
            var1.pixels[var3] = this.pixels[var3];
        }
        return var1;
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

    private final static void a(int param0, int param1, int param2, int[] param3, int[] param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12) {
        int incrementValue$11 = 0;
        int incrementValue$12 = 0;
        param8 = -param10;
        L0: while (true) {
          if (param8 >= 0) {
            return;
          }
          param6 = -param9;
          L1: while (true) {
            if (param6 >= 0) {
              param7 = param7 + param11;
              param5 = param5 + param12;
              param8++;
              continue L0;
            }
            {
              incrementValue$11 = param5;
              param5++;
              param0 = param4[incrementValue$11];
              if (param0 == 0) {
                param7++;
                param6++;
                continue L1;
              }
              {
                param1 = param3[param7];
                param2 = param0 + param1;
                param0 = (param0 & 16711935) + (param1 & 16711935);
                param1 = (param0 & 16777472) + (param2 - param0 & 65536);
                incrementValue$12 = param7;
                param7++;
                param3[incrementValue$12] = param2 - param1 | param1 - (param1 >>> 8);
                param6++;
                continue L1;
              }
            }
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
            Sprite.b(SoftwareRasterizer.framebuffer, this.pixels, 0, sourceIndex, destinationIndex, drawWidth, drawHeight, destinationRowSkip, sourceRowSkip, alpha256);
            return;
        }
    }

    private final static void b(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12) {
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int incrementValue$1 = 0;
        int var13 = param3;
        for (var14 = -param8; var14 < 0; var14++) {
            var15 = (param4 >> 16) * param11;
            for (var16 = -param7; var16 < 0; var16++) {
                param2 = param1[(param3 >> 16) + var15];
                if (param2 != 0) {
                    incrementValue$1 = param5;
                    param5++;
                    param0[incrementValue$1] = param12;
                } else {
                    param5++;
                }
                param3 = param3 + param9;
            }
            param4 = param4 + param10;
            param3 = var13;
            param5 = param5 + param6;
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

    Sprite(byte[] param0, java.awt.Component param1) {
        Throwable decompiledCaughtException = null;
        java.awt.Image var3 = null;
        InterruptedException var3_ref = null;
        java.awt.MediaTracker var4 = null;
        java.awt.image.PixelGrabber var5 = null;
        try {
          var3 = java.awt.Toolkit.getDefaultToolkit().createImage(param0);
          var4 = new java.awt.MediaTracker(param1);
          var4.addImage(var3, 0);
          var4.waitForAll();
          this.width = var3.getWidth((java.awt.image.ImageObserver) ((Object) param1));
          this.height = var3.getHeight((java.awt.image.ImageObserver) ((Object) param1));
          this.fullWidth = this.width;
          this.fullHeight = this.height;
          this.trimX = 0;
          this.trimY = 0;
          this.pixels = new int[this.width * this.height];
          var5 = new java.awt.image.PixelGrabber(var3, 0, 0, this.width, this.height, this.pixels, 0, this.width);
          var5.grabPixels();
        } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = (InterruptedException) (Object) decompiledCaughtException;
        }
    }
}
