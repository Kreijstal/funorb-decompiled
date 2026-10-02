/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class IndexedSprite extends IndexedSpriteState {
    int[] palette;
    byte[] indices;

    private final static void blitPaletteAlpha(int[] destinationPixels, byte[] sourceIndices, int[] palette, int sourceIndex, int destinationIndex, int drawWidth, int drawHeight, int destinationRowSkip, int sourceRowSkip, int alpha256) {
        int sourceReadIndex = 0;
        int destinationWriteIndex = 0;
        int inverseAlpha256;
        int negativeRow;
        int negativeColumn;
        int indexThenPaletteColor;
        int destinationPixel;
        inverseAlpha256 = 256 - alpha256;
        negativeRow = -drawHeight;
        L0: while (true) {
          if (negativeRow >= 0) {
            return;
          }
          negativeColumn = -drawWidth;
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
              indexThenPaletteColor = sourceIndices[sourceReadIndex];
              if (indexThenPaletteColor == 0) {
                destinationIndex++;
                negativeColumn++;
                continue L1;
              }
              {
                indexThenPaletteColor = palette[indexThenPaletteColor & 255];
                destinationPixel = destinationPixels[destinationIndex];
                destinationWriteIndex = destinationIndex;
                destinationIndex++;
                destinationPixels[destinationWriteIndex] = ((indexThenPaletteColor & 16711935) * alpha256 + (destinationPixel & 16711935) * inverseAlpha256 & -16711936) + ((indexThenPaletteColor & 65280) * alpha256 + (destinationPixel & 65280) * inverseAlpha256 & 16711680) >> 8;
                negativeColumn++;
                continue L1;
              }
            }
          }
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
            IndexedSprite.blitPalette(SoftwareRasterizer.framebuffer, this.indices, this.palette, 0, sourceIndex, destinationIndex, drawWidth, drawHeight, destinationRowSkip, sourceRowSkip);
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
            IndexedSprite.blitPaletteAlpha(SoftwareRasterizer.framebuffer, this.indices, this.palette, sourceIndex, destinationIndex, drawWidth, drawHeight, destinationRowSkip, sourceRowSkip, alpha256);
            return;
        }
    }

    private final static void blitPaletteRuns(int indexThenRunLength, byte[] sourceIndices, int sourceIndex, int destinationIndex, int remainingColumnsScratch, int[] destinationPixels, int[] palette, int drawWidth, int destinationRowSkip, int sourceRowSkip, int negativeRowScratch, int drawHeight) {
        int sourceReadIndex = 0;
        int destinationWriteIndex = 0;
        int sourceReadIndex2 = 0;
        negativeRowScratch = -drawHeight;
        L0: while (true) {
          if (negativeRowScratch >= 0) {
            return;
          }
          remainingColumnsScratch = drawWidth;
          if (sourceIndex > 0) {
            if (sourceIndices[sourceIndex - 1] == -1) {
              remainingColumnsScratch--;
              sourceIndex++;
              destinationIndex++;
            }
          }
          L2: while (true) {
            if (remainingColumnsScratch <= 0) {
              destinationIndex = destinationIndex + destinationRowSkip;
              sourceIndex = sourceIndex + sourceRowSkip;
              negativeRowScratch++;
              continue L0;
            }
            {
              sourceReadIndex = sourceIndex;
              sourceIndex++;
              indexThenRunLength = sourceIndices[sourceReadIndex];
              remainingColumnsScratch--;
              if (indexThenRunLength == 0) {
                destinationIndex++;
                continue L2;
              }
              if (indexThenRunLength != -1) {
                destinationWriteIndex = destinationIndex;
                destinationIndex++;
                destinationPixels[destinationWriteIndex] = palette[indexThenRunLength & 255];
                continue L2;
              }
              {
                sourceReadIndex2 = sourceIndex;
                sourceIndex++;
                indexThenRunLength = sourceIndices[sourceReadIndex2] & 255;
                remainingColumnsScratch--;
                indexThenRunLength = indexThenRunLength + indexThenRunLength;
                if (indexThenRunLength > remainingColumnsScratch) {
                  indexThenRunLength = remainingColumnsScratch;
                }
                sourceIndex = sourceIndex + indexThenRunLength;
                remainingColumnsScratch = remainingColumnsScratch - indexThenRunLength;
                destinationIndex = destinationIndex + (indexThenRunLength + 2);
                continue L2;
              }
            }
          }
        }
    }

    final void drawRunEncoded(int x, int y) {
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
            IndexedSprite.blitPaletteRuns(0, this.indices, sourceIndex, destinationIndex, 0, SoftwareRasterizer.framebuffer, this.palette, drawWidth, destinationRowSkip, sourceRowSkip, 0, drawHeight);
            return;
        }
    }

    private final static void blitPalette(int[] destinationPixels, byte[] sourceIndices, int[] palette, int paletteIndexScratch, int sourceIndex, int destinationIndex, int widthThenNegativeTail, int drawHeight, int destinationRowSkip, int sourceRowSkip) {
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
          {
            quadOrTailCounter = negativeQuadCount;
            L1: while (true) {
              if (quadOrTailCounter >= 0) {
                quadOrTailCounter = widthThenNegativeTail;
                L2: while (true) {
                  if (quadOrTailCounter >= 0) {
                    destinationIndex = destinationIndex + destinationRowSkip;
                    sourceIndex = sourceIndex + sourceRowSkip;
                    negativeRow++;
                    continue L0;
                  }
                  {
                    sourceReadIndex = sourceIndex;
                    sourceIndex++;
                    paletteIndexScratch = sourceIndices[sourceReadIndex];
                    if (paletteIndexScratch == 0) {
                      destinationIndex++;
                      quadOrTailCounter++;
                      continue L2;
                    }
                    {
                      destinationWriteIndex = destinationIndex;
                      destinationIndex++;
                      destinationPixels[destinationWriteIndex] = palette[paletteIndexScratch & 255];
                      quadOrTailCounter++;
                      continue L2;
                    }
                  }
                }
              }
              {
                sourceReadIndex2 = sourceIndex;
                sourceIndex++;
                paletteIndexScratch = sourceIndices[sourceReadIndex2];
                if (paletteIndexScratch == 0) {
                  destinationIndex++;
                } else {
                  destinationWriteIndex2 = destinationIndex;
                  destinationIndex++;
                  destinationPixels[destinationWriteIndex2] = palette[paletteIndexScratch & 255];
                }
                sourceReadIndex3 = sourceIndex;
                sourceIndex++;
                paletteIndexScratch = sourceIndices[sourceReadIndex3];
                if (paletteIndexScratch == 0) {
                  destinationIndex++;
                } else {
                  destinationWriteIndex3 = destinationIndex;
                  destinationIndex++;
                  destinationPixels[destinationWriteIndex3] = palette[paletteIndexScratch & 255];
                }
                sourceReadIndex4 = sourceIndex;
                sourceIndex++;
                paletteIndexScratch = sourceIndices[sourceReadIndex4];
                if (paletteIndexScratch == 0) {
                  destinationIndex++;
                } else {
                  destinationWriteIndex4 = destinationIndex;
                  destinationIndex++;
                  destinationPixels[destinationWriteIndex4] = palette[paletteIndexScratch & 255];
                }
                sourceReadIndex5 = sourceIndex;
                sourceIndex++;
                paletteIndexScratch = sourceIndices[sourceReadIndex5];
                if (paletteIndexScratch == 0) {
                  destinationIndex++;
                  quadOrTailCounter++;
                  continue L1;
                }
                {
                  destinationWriteIndex5 = destinationIndex;
                  destinationIndex++;
                  destinationPixels[destinationWriteIndex5] = palette[paletteIndexScratch & 255];
                  quadOrTailCounter++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    IndexedSprite(int fullWidth, int fullHeight, int trimX, int trimY, int width, int height, byte[] indices, int[] palette) {
        this.fullWidth = fullWidth;
        this.fullHeight = fullHeight;
        this.trimX = trimX;
        this.trimY = trimY;
        this.width = width;
        this.height = height;
        this.indices = indices;
        this.palette = palette;
    }

    IndexedSprite(int width, int height, int paletteSize) {
        this.width = width;
        this.fullWidth = width;
        this.height = height;
        this.fullHeight = height;
        this.trimY = 0;
        this.trimX = 0;
        this.indices = new byte[width * height];
        this.palette = new int[paletteSize];
    }
}
