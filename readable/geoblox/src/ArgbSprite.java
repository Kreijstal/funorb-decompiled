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
          L1: while (true) {
            if (negativeColumn >= 0) {
              destinationIndex = destinationIndex + destinationRowSkip;
              sourceIndex = sourceIndex + sourceRowSkip;
              negativeRow++;
              continue L0;
            }
            {
              sourceReadIndex = sourceIndex;
              sourceIndex++;
              sourcePixel = sourcePixels[sourceReadIndex];
              storedAlpha = sourcePixel >>> 24;
              if (storedAlpha == 0) {
                destinationIndex++;
                negativeColumn++;
                continue L1;
              }
              {
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
                continue L1;
              }
            }
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
          L1: while (true) {
            if (negativeColumn >= 0) {
              destinationIndex = destinationIndex + destinationRowSkip;
              sourceIndex = sourceIndex + sourceRowSkip;
              negativeRow++;
              continue L0;
            }
            {
              sourceReadIndex = sourceIndex;
              sourceIndex++;
              sourcePixel = sourcePixels[sourceReadIndex];
              storedAlpha = sourcePixel >>> 24;
              if (storedAlpha == 0) {
                destinationIndex++;
                negativeColumn++;
                continue L1;
              }
              {
                inverseAlpha256 = 256 - storedAlpha;
                destinationPixel = destinationPixels[destinationIndex];
                destinationWriteIndex = destinationIndex;
                destinationIndex++;
                destinationPixels[destinationWriteIndex] = ((sourcePixel & 16711935) * storedAlpha + (destinationPixel & 16711935) * inverseAlpha256 & -16711936) + ((sourcePixel & 65280) * storedAlpha + (destinationPixel & 65280) * inverseAlpha256 & 16711680) >>> 8;
                negativeColumn++;
                continue L1;
              }
            }
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
        int incrementValue$8 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$2 = 0;
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$5 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        double var7;
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
        double var24;
        int var26;
        int var27;
        int var28;
        int var29;
        int var30;
        int var31;
        int var32;
        int var33;
        int var34;
        int var35;
        int var36;
        int var37;
        int var38;
        int var39;
        int var40;
        int var41;
        if (scale == 0) {
          return;
        }
        {
          sourcePivotX = sourcePivotX - (this.trimX << 4);
          sourcePivotY = sourcePivotY - (this.trimY << 4);
          var7 = (double)(angle & 65535) * 0.00009587379924285257;
          var9 = (int)Math.floor(Math.sin(var7) * (double)scale + 0.5);
          var10 = (int)Math.floor(Math.cos(var7) * (double)scale + 0.5);
          var11 = -sourcePivotX * var10 + -sourcePivotY * var9;
          var12 = -(-sourcePivotX) * var9 + -sourcePivotY * var10;
          var13 = ((this.width << 4) - sourcePivotX) * var10 + -sourcePivotY * var9;
          var14 = -((this.width << 4) - sourcePivotX) * var9 + -sourcePivotY * var10;
          var15 = -sourcePivotX * var10 + ((this.height << 4) - sourcePivotY) * var9;
          var16 = -(-sourcePivotX) * var9 + ((this.height << 4) - sourcePivotY) * var10;
          var17 = ((this.width << 4) - sourcePivotX) * var10 + ((this.height << 4) - sourcePivotY) * var9;
          var18 = -((this.width << 4) - sourcePivotX) * var9 + ((this.height << 4) - sourcePivotY) * var10;
          if (var11 >= var13) {
            var19 = var13;
            var20 = var11;
          } else {
            var19 = var11;
            var20 = var13;
          }
          if (var15 < var19) {
            var19 = var15;
          }
          if (var17 < var19) {
            var19 = var17;
          }
          if (var15 > var20) {
            var20 = var15;
          }
          if (var17 > var20) {
            var20 = var17;
          }
          if (var12 >= var14) {
            var21 = var14;
            var22 = var12;
          } else {
            var21 = var12;
            var22 = var14;
          }
          if (var16 < var21) {
            var21 = var16;
          }
          if (var18 < var21) {
            var21 = var18;
          }
          if (var16 > var22) {
            var22 = var16;
          }
          if (var18 > var22) {
            var22 = var18;
          }
          var19 = var19 >> 12;
          var20 = var20 + 4095 >> 12;
          var21 = var21 >> 12;
          var22 = var22 + 4095 >> 12;
          var19 = var19 + destinationX;
          var20 = var20 + destinationX;
          var21 = var21 + destinationY;
          var22 = var22 + destinationY;
          var19 = var19 >> 4;
          var20 = var20 + 15 >> 4;
          var21 = var21 >> 4;
          var22 = var22 + 15 >> 4;
          if (var19 < SoftwareRasterizer.clipLeft) {
            var19 = SoftwareRasterizer.clipLeft;
          }
          if (var20 > SoftwareRasterizer.clipRight) {
            var20 = SoftwareRasterizer.clipRight;
          }
          if (var21 < SoftwareRasterizer.clipTop) {
            var21 = SoftwareRasterizer.clipTop;
          }
          if (var22 > SoftwareRasterizer.clipBottom) {
            var22 = SoftwareRasterizer.clipBottom;
          }
          var20 = var19 - var20;
          if (var20 >= 0) {
            return;
          }
          var22 = var21 - var22;
          if (var22 >= 0) {
            return;
          }
          L14: {
            var23 = var21 * SoftwareRasterizer.stride + var19;
            var24 = 16777216.0 / (double)scale;
            var26 = (int)Math.floor(Math.sin(var7) * var24 + 0.5);
            var27 = (int)Math.floor(Math.cos(var7) * var24 + 0.5);
            var28 = (var19 << 4) + 8 - destinationX;
            var29 = (var21 << 4) + 8 - destinationY;
            var30 = (sourcePivotX << 8) - (var29 * var26 >> 4);
            var31 = (sourcePivotY << 8) + (var29 * var27 >> 4);
            if (var27 == 0) {
              if (var26 == 0) {
                var33 = var22;
                L59: while (var33 < 0) {
                  L60: {
                    var34 = var23;
                    var35 = var30;
                    var36 = var31;
                    var37 = var20;
                    if (var35 >= 0) {
                      if (var36 >= 0) {
                        if (var35 - (this.width << 12) < 0) {
                          if (var36 - (this.height << 12) < 0) {
                            L61: while (var37 < 0) {
                              var38 = this.pixels[(var36 >> 12) * this.width + (var35 >> 12)];
                              var39 = SoftwareRasterizer.framebuffer[var34];
                              var40 = var38 >>> 24;
                              var41 = 256 - var40;
                              incrementValue$8 = var34;
                              var34++;
                              SoftwareRasterizer.framebuffer[incrementValue$8] = ((var38 & 16711935) * var40 + (var39 & 16711935) * var41 & -16711936) + ((var38 & 65280) * var40 + (var39 & 65280) * var41 & 16711680) >>> 8;
                              var37++;
                            }
                            break L60;
                          }
                        }
                      }
                    }
                  }
                  var33++;
                  var23 = var23 + SoftwareRasterizer.stride;
                }
                return;
              }
              if (var26 >= 0) {
                var33 = var22;
                L49: while (var33 < 0) {
                  L50: {
                    var34 = var23;
                    var35 = var30;
                    var36 = var31 + (var28 * var26 >> 4);
                    var37 = var20;
                    if (var35 >= 0) {
                      if (var35 - (this.width << 12) < 0) {
                        if (var36 < 0) {
                          var32 = (var26 - 1 - var36) / var26;
                          var37 = var37 + var32;
                          var36 = var36 + var26 * var32;
                          var34 = var34 + var32;
                        }
                        var32 = (1 + var36 - (this.height << 12) - var26) / var26;
                        if ((1 + var36 - (this.height << 12) - var26) / var26 > var37) {
                          var37 = var32;
                        }
                        L53: while (var37 < 0) {
                          var38 = this.pixels[(var36 >> 12) * this.width + (var35 >> 12)];
                          var39 = SoftwareRasterizer.framebuffer[var34];
                          var40 = var38 >>> 24;
                          var41 = 256 - var40;
                          incrementValue$6 = var34;
                          var34++;
                          SoftwareRasterizer.framebuffer[incrementValue$6] = ((var38 & 16711935) * var40 + (var39 & 16711935) * var41 & -16711936) + ((var38 & 65280) * var40 + (var39 & 65280) * var41 & 16711680) >>> 8;
                          var36 = var36 + var26;
                          var37++;
                        }
                        break L50;
                      }
                    }
                  }
                  var33++;
                  var30 = var30 - var26;
                  var23 = var23 + SoftwareRasterizer.stride;
                }
                break L14;
              }
              var33 = var22;
              L54: while (var33 < 0) {
                L55: {
                  var34 = var23;
                  var35 = var30;
                  var36 = var31 + (var28 * var26 >> 4);
                  var37 = var20;
                  if (var35 >= 0) {
                    if (var35 - (this.width << 12) < 0) {
                      var32 = var36 - (this.height << 12);
                      if (var36 - (this.height << 12) >= 0) {
                        var32 = (var26 - var32) / var26;
                        var37 = var37 + var32;
                        var36 = var36 + var26 * var32;
                        var34 = var34 + var32;
                      }
                      var32 = (var36 - var26) / var26;
                      if ((var36 - var26) / var26 > var37) {
                        var37 = var32;
                      }
                      L58: while (var37 < 0) {
                        var38 = this.pixels[(var36 >> 12) * this.width + (var35 >> 12)];
                        var39 = SoftwareRasterizer.framebuffer[var34];
                        var40 = var38 >>> 24;
                        var41 = 256 - var40;
                        incrementValue$7 = var34;
                        var34++;
                        SoftwareRasterizer.framebuffer[incrementValue$7] = ((var38 & 16711935) * var40 + (var39 & 16711935) * var41 & -16711936) + ((var38 & 65280) * var40 + (var39 & 65280) * var41 & 16711680) >>> 8;
                        var36 = var36 + var26;
                        var37++;
                      }
                      break L55;
                    }
                  }
                }
                var33++;
                var30 = var30 - var26;
                var23 = var23 + SoftwareRasterizer.stride;
              }
              break L14;
            }
            if (var27 >= 0) {
              if (var26 == 0) {
                var33 = var22;
                L27: while (var33 < 0) {
                  L28: {
                    var34 = var23;
                    var35 = var30 + (var28 * var27 >> 4);
                    var36 = var31;
                    var37 = var20;
                    if (var36 >= 0) {
                      if (var36 - (this.height << 12) < 0) {
                        if (var35 < 0) {
                          var32 = (var27 - 1 - var35) / var27;
                          var37 = var37 + var32;
                          var35 = var35 + var27 * var32;
                          var34 = var34 + var32;
                        }
                        var32 = (1 + var35 - (this.width << 12) - var27) / var27;
                        if ((1 + var35 - (this.width << 12) - var27) / var27 > var37) {
                          var37 = var32;
                        }
                        L31: while (var37 < 0) {
                          var38 = this.pixels[(var36 >> 12) * this.width + (var35 >> 12)];
                          var39 = SoftwareRasterizer.framebuffer[var34];
                          var40 = var38 >>> 24;
                          var41 = 256 - var40;
                          incrementValue$2 = var34;
                          var34++;
                          SoftwareRasterizer.framebuffer[incrementValue$2] = ((var38 & 16711935) * var40 + (var39 & 16711935) * var41 & -16711936) + ((var38 & 65280) * var40 + (var39 & 65280) * var41 & 16711680) >>> 8;
                          var35 = var35 + var27;
                          var37++;
                        }
                        break L28;
                      }
                    }
                  }
                  var33++;
                  var31 = var31 + var27;
                  var23 = var23 + SoftwareRasterizer.stride;
                }
                break L14;
              }
              if (var26 >= 0) {
                var33 = var22;
                L15: while (var33 < 0) {
                  var34 = var23;
                  var35 = var30 + (var28 * var27 >> 4);
                  var36 = var31 + (var28 * var26 >> 4);
                  var37 = var20;
                  if (var35 < 0) {
                    var32 = (var27 - 1 - var35) / var27;
                    var37 = var37 + var32;
                    var35 = var35 + var27 * var32;
                    var36 = var36 + var26 * var32;
                    var34 = var34 + var32;
                  }
                  var32 = (1 + var35 - (this.width << 12) - var27) / var27;
                  if ((1 + var35 - (this.width << 12) - var27) / var27 > var37) {
                    var37 = var32;
                  }
                  if (var36 < 0) {
                    var32 = (var26 - 1 - var36) / var26;
                    var37 = var37 + var32;
                    var35 = var35 + var27 * var32;
                    var36 = var36 + var26 * var32;
                    var34 = var34 + var32;
                  }
                  var32 = (1 + var36 - (this.height << 12) - var26) / var26;
                  if ((1 + var36 - (this.height << 12) - var26) / var26 > var37) {
                    var37 = var32;
                  }
                  L20: while (var37 < 0) {
                    var38 = this.pixels[(var36 >> 12) * this.width + (var35 >> 12)];
                    var39 = SoftwareRasterizer.framebuffer[var34];
                    var40 = var38 >>> 24;
                    var41 = 256 - var40;
                    incrementValue$0 = var34;
                    var34++;
                    SoftwareRasterizer.framebuffer[incrementValue$0] = ((var38 & 16711935) * var40 + (var39 & 16711935) * var41 & -16711936) + ((var38 & 65280) * var40 + (var39 & 65280) * var41 & 16711680) >>> 8;
                    var35 = var35 + var27;
                    var36 = var36 + var26;
                    var37++;
                  }
                  var33++;
                  var30 = var30 - var26;
                  var31 = var31 + var27;
                  var23 = var23 + SoftwareRasterizer.stride;
                }
                break L14;
              }
              var33 = var22;
              L21: while (var33 < 0) {
                var34 = var23;
                var35 = var30 + (var28 * var27 >> 4);
                var36 = var31 + (var28 * var26 >> 4);
                var37 = var20;
                if (var35 < 0) {
                  var32 = (var27 - 1 - var35) / var27;
                  var37 = var37 + var32;
                  var35 = var35 + var27 * var32;
                  var36 = var36 + var26 * var32;
                  var34 = var34 + var32;
                }
                var32 = (1 + var35 - (this.width << 12) - var27) / var27;
                if ((1 + var35 - (this.width << 12) - var27) / var27 > var37) {
                  var37 = var32;
                }
                var32 = var36 - (this.height << 12);
                if (var36 - (this.height << 12) >= 0) {
                  var32 = (var26 - var32) / var26;
                  var37 = var37 + var32;
                  var35 = var35 + var27 * var32;
                  var36 = var36 + var26 * var32;
                  var34 = var34 + var32;
                }
                var32 = (var36 - var26) / var26;
                if ((var36 - var26) / var26 > var37) {
                  var37 = var32;
                }
                L26: while (var37 < 0) {
                  var38 = this.pixels[(var36 >> 12) * this.width + (var35 >> 12)];
                  var39 = SoftwareRasterizer.framebuffer[var34];
                  var40 = var38 >>> 24;
                  var41 = 256 - var40;
                  incrementValue$1 = var34;
                  var34++;
                  SoftwareRasterizer.framebuffer[incrementValue$1] = ((var38 & 16711935) * var40 + (var39 & 16711935) * var41 & -16711936) + ((var38 & 65280) * var40 + (var39 & 65280) * var41 & 16711680) >>> 8;
                  var35 = var35 + var27;
                  var36 = var36 + var26;
                  var37++;
                }
                var33++;
                var30 = var30 - var26;
                var31 = var31 + var27;
                var23 = var23 + SoftwareRasterizer.stride;
              }
              break L14;
            }
            if (var26 == 0) {
              var33 = var22;
              L44: while (var33 < 0) {
                L45: {
                  var34 = var23;
                  var35 = var30 + (var28 * var27 >> 4);
                  var36 = var31;
                  var37 = var20;
                  if (var36 >= 0) {
                    if (var36 - (this.height << 12) < 0) {
                      var32 = var35 - (this.width << 12);
                      if (var35 - (this.width << 12) >= 0) {
                        var32 = (var27 - var32) / var27;
                        var37 = var37 + var32;
                        var35 = var35 + var27 * var32;
                        var34 = var34 + var32;
                      }
                      var32 = (var35 - var27) / var27;
                      if ((var35 - var27) / var27 > var37) {
                        var37 = var32;
                      }
                      L48: while (var37 < 0) {
                        var38 = this.pixels[(var36 >> 12) * this.width + (var35 >> 12)];
                        var39 = SoftwareRasterizer.framebuffer[var34];
                        var40 = var38 >>> 24;
                        var41 = 256 - var40;
                        incrementValue$5 = var34;
                        var34++;
                        SoftwareRasterizer.framebuffer[incrementValue$5] = ((var38 & 16711935) * var40 + (var39 & 16711935) * var41 & -16711936) + ((var38 & 65280) * var40 + (var39 & 65280) * var41 & 16711680) >>> 8;
                        var35 = var35 + var27;
                        var37++;
                      }
                      break L45;
                    }
                  }
                }
                var33++;
                var31 = var31 + var27;
                var23 = var23 + SoftwareRasterizer.stride;
              }
              break L14;
            }
            if (var26 >= 0) {
              var33 = var22;
              L32: while (var33 < 0) {
                var34 = var23;
                var35 = var30 + (var28 * var27 >> 4);
                var36 = var31 + (var28 * var26 >> 4);
                var37 = var20;
                var32 = var35 - (this.width << 12);
                if (var35 - (this.width << 12) >= 0) {
                  var32 = (var27 - var32) / var27;
                  var37 = var37 + var32;
                  var35 = var35 + var27 * var32;
                  var36 = var36 + var26 * var32;
                  var34 = var34 + var32;
                }
                var32 = (var35 - var27) / var27;
                if ((var35 - var27) / var27 > var37) {
                  var37 = var32;
                }
                if (var36 < 0) {
                  var32 = (var26 - 1 - var36) / var26;
                  var37 = var37 + var32;
                  var35 = var35 + var27 * var32;
                  var36 = var36 + var26 * var32;
                  var34 = var34 + var32;
                }
                var32 = (1 + var36 - (this.height << 12) - var26) / var26;
                if ((1 + var36 - (this.height << 12) - var26) / var26 > var37) {
                  var37 = var32;
                }
                L37: while (var37 < 0) {
                  var38 = this.pixels[(var36 >> 12) * this.width + (var35 >> 12)];
                  var39 = SoftwareRasterizer.framebuffer[var34];
                  var40 = var38 >>> 24;
                  var41 = 256 - var40;
                  incrementValue$3 = var34;
                  var34++;
                  SoftwareRasterizer.framebuffer[incrementValue$3] = ((var38 & 16711935) * var40 + (var39 & 16711935) * var41 & -16711936) + ((var38 & 65280) * var40 + (var39 & 65280) * var41 & 16711680) >>> 8;
                  var35 = var35 + var27;
                  var36 = var36 + var26;
                  var37++;
                }
                var33++;
                var30 = var30 - var26;
                var31 = var31 + var27;
                var23 = var23 + SoftwareRasterizer.stride;
              }
              break L14;
            }
            var33 = var22;
            L38: while (var33 < 0) {
              var34 = var23;
              var35 = var30 + (var28 * var27 >> 4);
              var36 = var31 + (var28 * var26 >> 4);
              var37 = var20;
              var32 = var35 - (this.width << 12);
              if (var35 - (this.width << 12) >= 0) {
                var32 = (var27 - var32) / var27;
                var37 = var37 + var32;
                var35 = var35 + var27 * var32;
                var36 = var36 + var26 * var32;
                var34 = var34 + var32;
              }
              var32 = (var35 - var27) / var27;
              if ((var35 - var27) / var27 > var37) {
                var37 = var32;
              }
              var32 = var36 - (this.height << 12);
              if (var36 - (this.height << 12) >= 0) {
                var32 = (var26 - var32) / var26;
                var37 = var37 + var32;
                var35 = var35 + var27 * var32;
                var36 = var36 + var26 * var32;
                var34 = var34 + var32;
              }
              var32 = (var36 - var26) / var26;
              if ((var36 - var26) / var26 > var37) {
                var37 = var32;
              }
              L43: while (var37 < 0) {
                var38 = this.pixels[(var36 >> 12) * this.width + (var35 >> 12)];
                var39 = SoftwareRasterizer.framebuffer[var34];
                var40 = var38 >>> 24;
                var41 = 256 - var40;
                incrementValue$4 = var34;
                var34++;
                SoftwareRasterizer.framebuffer[incrementValue$4] = ((var38 & 16711935) * var40 + (var39 & 16711935) * var41 & -16711936) + ((var38 & 65280) * var40 + (var39 & 65280) * var41 & 16711680) >>> 8;
                var35 = var35 + var27;
                var36 = var36 + var26;
                var37++;
              }
              var33++;
              var30 = var30 - var26;
              var31 = var31 + var27;
              var23 = var23 + SoftwareRasterizer.stride;
            }
            break L14;
          }
          return;
        }
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
          L1: while (true) {
            if (negativeColumnScratch >= 0) {
              destinationIndex = destinationIndex + destinationRowSkip;
              sourceIndex = sourceIndex + sourceRowSkip;
              negativeRowScratch++;
              continue L0;
            }
            {
              sourceReadIndex = sourceIndex;
              sourceIndex++;
              sourceColorScratch = sourcePixels[sourceReadIndex];
              if (sourceColorScratch == 0) {
                destinationIndex++;
                negativeColumnScratch++;
                continue L1;
              }
              {
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
                continue L1;
              }
            }
          }
        }
    }

    final void drawHalfSize(int x, int y) {
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int[] stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        int[] stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        int stackIn_21_2 = 0;
        int var3;
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
        int var16;
        int var17;
        int var18;
        int var19;
        int var20;
        int var21;
        var3 = this.width >> 1;
        var4 = this.height >> 1;
        x = x + this.trimX / 2;
        y = y + this.trimY / 2;
        if (x >= SoftwareRasterizer.clipLeft) {
          stackIn_3_0 = 0;
        } else {
          stackIn_3_0 = SoftwareRasterizer.clipLeft - x << 1;
        }
        var5 = stackIn_3_0;
        if (x + var3 <= SoftwareRasterizer.clipRight) {
          stackIn_6_0 = this.width - 2;
        } else {
          stackIn_6_0 = (SoftwareRasterizer.clipRight - x << 1) - 2;
        }
        var6 = stackIn_6_0;
        if (y >= SoftwareRasterizer.clipTop) {
          stackIn_9_0 = 0;
        } else {
          stackIn_9_0 = SoftwareRasterizer.clipTop - y << 1;
        }
        var7 = stackIn_9_0;
        if (y + var4 <= SoftwareRasterizer.clipBottom) {
          stackIn_12_0 = this.height - 2;
        } else {
          stackIn_12_0 = (SoftwareRasterizer.clipBottom - y << 1) - 2;
        }
        var8 = stackIn_12_0;
        var9 = var7;
        L4: while (true) {
          if (var9 > var8) {
            return;
          }
          {
            var10 = var9 * this.width + var5;
            var11 = (y + (var9 >> 1)) * SoftwareRasterizer.stride + (x + (var5 >> 1));
            var12 = var5;
            L5: while (true) {
              if (var12 > var6) {
                var9 += 2;
                continue L4;
              }
              {
                var13 = 0;
                var14 = 0;
                var15 = 0;
                var16 = 0;
                var17 = 0;
                var18 = 0;
                for (var19 = 0; var19 < 4; var19++) {
                  stackIn_20_0 = this.pixels;

                  stackIn_20_1 = var10 + (var19 & 1);

                  if ((var19 & 2) != 0) {
                    stackIn_21_0 = (int[]) ((Object) stackIn_20_0);
                    stackIn_21_1 = stackIn_20_1;
                    stackIn_21_2 = 0;
                  } else {
                    stackIn_21_0 = (int[]) ((Object) stackIn_20_0);
                    stackIn_21_1 = stackIn_20_1;
                    stackIn_21_2 = this.width;
                  }
                  var13 = stackIn_21_0[stackIn_21_1 + stackIn_21_2];
                  var14 = var13 >>> 24;
                  var18 = var18 + var14;
                  var15 = var15 + var14 * (var13 >> 16 & 255);
                  var16 = var16 + var14 * (var13 >> 8 & 255);
                  var17 = var17 + var14 * (var13 & 255);
                }
                if (var18 == 0) {
                  var12 += 2;
                  var11++;
                  var10 += 2;
                  continue L5;
                }
                {
                  var15 = (var15 / var18 << 16) + var17 / var18;
                  var16 = var16 / var18 << 8;
                  var19 = var18 >> 2;
                  var20 = 256 - var19;
                  var21 = SoftwareRasterizer.framebuffer[var11];
                  SoftwareRasterizer.framebuffer[var11] = (var19 * var15 + var20 * (var21 & 16711935) & -16711936) + (var19 * var16 + var20 * (var21 & 65280) & 16711680) >>> 8;
                  var12 += 2;
                  var11++;
                  var10 += 2;
                  continue L5;
                }
              }
            }
          }
        }
    }

    ArgbSprite(int fullWidth, int fullHeight, int trimX, int trimY, int width, int height, int[] pixels) {
        super(fullWidth, fullHeight, trimX, trimY, width, height, pixels);
    }

    final void drawQuarterSize(int x, int y) {
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
        int[] var9;
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
        int[] var22;
        int[] var23;
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
        var23 = new int[16];
        var22 = var23;
        var9 = var22;
        var10 = var7;
        L4: while (true) {
          if (var10 > var8) {
            return;
          }
          {
            var11 = var5;
            L5: while (true) {
              if (var11 > var6) {
                var10 += 4;
                continue L4;
              }
              {
                var12 = var10 * this.width + var11;
                var13 = (y + (var10 >> 2)) * SoftwareRasterizer.stride + (x + (var11 >> 2));
                for (var14 = 0; var14 < 4; var14++) {
                  for (var15 = 0; var15 < 4; var15++) {
                    var9[(var14 << 2) + var15] = this.pixels[var12 + var14 * this.width + var15];
                  }
                }
                var23 = var22;
                var14 = 0;
                var15 = 0;
                var16 = 0;
                var17 = 0;
                var18 = 0;
                for (var19 = 0; var19 < 16; var19++) {
                  var14 = var23[var19] >>> 24;
                  var15 = var15 + var14;
                  var16 = var16 + var14 * (var23[var19] >> 16 & 255);
                  var17 = var17 + var14 * (var23[var19] >> 8 & 255);
                  var18 = var18 + var14 * (var23[var19] & 255);
                }
                if (var15 == 0) {
                  var11 += 4;
                  continue L5;
                }
                {
                  var16 = (var16 / var15 << 16) + var18 / var15;
                  var17 = var17 / var15 << 8;
                  var19 = var15 >> 4;
                  var20 = 256 - var19;
                  var21 = SoftwareRasterizer.framebuffer[var13];
                  SoftwareRasterizer.framebuffer[var13] = (var19 * var16 + var20 * (var21 & 16711935) & -16711936) + (var19 * var17 + var20 * (var21 & 65280) & 16711680) >>> 8;
                  var11 += 4;
                  continue L5;
                }
              }
            }
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
          L1: while (true) {
            if (negativeColumnScratch >= 0) {
              destinationIndex = destinationIndex + destinationRowSkip;
              sourceIndex = sourceIndex + sourceRowSkip;
              negativeRowScratch++;
              continue L0;
            }
            {
              sourceReadIndex = sourceIndex;
              sourceIndex++;
              sourcePixel = sourcePixels[sourceReadIndex];
              storedAlpha = sourcePixel >>> 24;
              sourcePixel = sourcePixel & 16777215;
              if (storedAlpha == 0) {
                destinationIndex++;
                negativeColumnScratch++;
                continue L1;
              }
              {
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
                continue L1;
              }
            }
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
