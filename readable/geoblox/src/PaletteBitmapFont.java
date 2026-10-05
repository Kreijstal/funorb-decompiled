/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PaletteBitmapFont extends BitmapFont {
    private byte[][] glyphPaletteIndices;
    int[][] colorPalettes;

    PaletteBitmapFont(byte[] metrics, int[] xOffsets, int[] yOffsets, int[] widths, int[] heights, int[] palette, byte[][] glyphs) {
        super(metrics, xOffsets, yOffsets, widths, heights);
        this.glyphPaletteIndices = new byte[256][];
        this.glyphPaletteIndices = glyphs;
        this.colorPalettes = new int[4][];
        this.colorPalettes[0] = palette;
    }

    private final static void blitPaletteGlyphAlpha(int signedGlyphIndex, int[] destinationPixels, byte[] glyphIndices, int[] palette, int sourceIndex, int destinationIndex, int width, int height, int destinationRowSkip, int sourceRowSkip, int alpha256) {
        int sourceIndexBeforeIncrement = 0;
        byte glyphIndexByte = 0;
        int destinationIndexBeforeIncrement = 0;
        int destinationWeight256;
        int negativeRowCounter;
        int negativeColumnCounter;
        int destinationColor;
        int sourceColor;
        destinationWeight256 = 256 - alpha256;
        negativeRowCounter = -height;
        while (true) {
          if (negativeRowCounter >= 0) {
            return;
          }
          negativeColumnCounter = -width;
          while (true) {
            if (negativeColumnCounter >= 0) {
              destinationIndex = destinationIndex + destinationRowSkip;
              sourceIndex = sourceIndex + sourceRowSkip;
              negativeRowCounter++;
              break;
            }
            sourceIndexBeforeIncrement = sourceIndex;
            sourceIndex++;
            glyphIndexByte = glyphIndices[sourceIndexBeforeIncrement];
            signedGlyphIndex = glyphIndexByte;
            if (glyphIndexByte == 0) {
              destinationIndex++;
              negativeColumnCounter++;
              continue;
            }
            destinationColor = destinationPixels[destinationIndex];
            sourceColor = palette[signedGlyphIndex & 255];
            destinationIndexBeforeIncrement = destinationIndex;
            destinationIndex++;
            destinationPixels[destinationIndexBeforeIncrement] = ((sourceColor & 16711935) * alpha256 + (destinationColor & 16711935) * destinationWeight256 & -16711936) + ((sourceColor & 65280) * alpha256 + (destinationColor & 65280) * destinationWeight256 & 16711680) >> 8;
            negativeColumnCounter++;
          }
        }
    }

    final void drawGlyph(int glyphIndex, int x, int y, int width, int height, int color, boolean shadowPass) {
        int destinationIndex;
        int destinationRowSkip;
        int sourceRowSkip;
        int sourceIndex;
        int clippedPixels;
        destinationIndex = x + y * SoftwareRasterizer.stride;
        destinationRowSkip = SoftwareRasterizer.stride - width;
        sourceRowSkip = 0;
        sourceIndex = 0;
        if (y < SoftwareRasterizer.clipTop) {
          clippedPixels = SoftwareRasterizer.clipTop - y;
          height = height - clippedPixels;
          y = SoftwareRasterizer.clipTop;
          sourceIndex = sourceIndex + clippedPixels * width;
          destinationIndex = destinationIndex + clippedPixels * SoftwareRasterizer.stride;
        }
        if (y + height > SoftwareRasterizer.clipBottom) {
          height = height - (y + height - SoftwareRasterizer.clipBottom);
        }
        if (x < SoftwareRasterizer.clipLeft) {
          clippedPixels = SoftwareRasterizer.clipLeft - x;
          width = width - clippedPixels;
          x = SoftwareRasterizer.clipLeft;
          sourceIndex = sourceIndex + clippedPixels;
          destinationIndex = destinationIndex + clippedPixels;
          sourceRowSkip = sourceRowSkip + clippedPixels;
          destinationRowSkip = destinationRowSkip + clippedPixels;
        }
        if (x + width > SoftwareRasterizer.clipRight) {
          clippedPixels = x + width - SoftwareRasterizer.clipRight;
          width = width - clippedPixels;
          sourceRowSkip = sourceRowSkip + clippedPixels;
          destinationRowSkip = destinationRowSkip + clippedPixels;
        }
        if (width > 0 &&
            height > 0) {
          if (!shadowPass) {
            PaletteBitmapFont.blitPaletteGlyph(0, SoftwareRasterizer.framebuffer, this.glyphPaletteIndices[glyphIndex], this.colorPalettes[color], sourceIndex, destinationIndex, width, height, destinationRowSkip, sourceRowSkip);
          } else {
            MonochromeBitmapFont.blitGlyphMask(SoftwareRasterizer.framebuffer, this.glyphPaletteIndices[glyphIndex], color, sourceIndex, destinationIndex, width, height, destinationRowSkip, sourceRowSkip);
          }
          return;
        }
    }

    final void drawGlyphAlpha(int glyphIndex, int x, int y, int width, int height, int color, int alpha256, boolean shadowPass) {
        int destinationIndex;
        int destinationRowSkip;
        int sourceRowSkip;
        int sourceIndex;
        int clippedPixels;
        destinationIndex = x + y * SoftwareRasterizer.stride;
        destinationRowSkip = SoftwareRasterizer.stride - width;
        sourceRowSkip = 0;
        sourceIndex = 0;
        if (y < SoftwareRasterizer.clipTop) {
          clippedPixels = SoftwareRasterizer.clipTop - y;
          height = height - clippedPixels;
          y = SoftwareRasterizer.clipTop;
          sourceIndex = sourceIndex + clippedPixels * width;
          destinationIndex = destinationIndex + clippedPixels * SoftwareRasterizer.stride;
        }
        if (y + height > SoftwareRasterizer.clipBottom) {
          height = height - (y + height - SoftwareRasterizer.clipBottom);
        }
        if (x < SoftwareRasterizer.clipLeft) {
          clippedPixels = SoftwareRasterizer.clipLeft - x;
          width = width - clippedPixels;
          x = SoftwareRasterizer.clipLeft;
          sourceIndex = sourceIndex + clippedPixels;
          destinationIndex = destinationIndex + clippedPixels;
          sourceRowSkip = sourceRowSkip + clippedPixels;
          destinationRowSkip = destinationRowSkip + clippedPixels;
        }
        if (x + width > SoftwareRasterizer.clipRight) {
          clippedPixels = x + width - SoftwareRasterizer.clipRight;
          width = width - clippedPixels;
          sourceRowSkip = sourceRowSkip + clippedPixels;
          destinationRowSkip = destinationRowSkip + clippedPixels;
        }
        if (width > 0 &&
            height > 0) {
          if (!shadowPass) {
            PaletteBitmapFont.blitPaletteGlyphAlpha(0, SoftwareRasterizer.framebuffer, this.glyphPaletteIndices[glyphIndex], this.colorPalettes[color], sourceIndex, destinationIndex, width, height, destinationRowSkip, sourceRowSkip, alpha256);
          } else {
            MonochromeBitmapFont.blitGlyphMaskAlpha(SoftwareRasterizer.framebuffer, this.glyphPaletteIndices[glyphIndex], color, sourceIndex, destinationIndex, width, height, destinationRowSkip, sourceRowSkip, alpha256);
          }
          return;
        }
    }

    private final static int findNearestPaletteIndex(int[] palette, int targetColor) {
        int candidateIndex = 0;
        int nearestIndex;
        int minimumSquaredDistance;
        int candidateColor;
        int redDifference;
        int greenDifference;
        int blueDifference;
        int squaredDistance;
        nearestIndex = 0;
        minimumSquaredDistance = 2147483647;
        for (candidateIndex = 1; candidateIndex < palette.length; candidateIndex++) {
          candidateColor = palette[candidateIndex];
          redDifference = (candidateColor >> 16) - (targetColor >> 16);
          greenDifference = (candidateColor >> 8 & 255) - (targetColor >> 8 & 255);
          blueDifference = (candidateColor & 255) - (targetColor & 255);
          squaredDistance = redDifference * redDifference + greenDifference * greenDifference + blueDifference * blueDifference;
          if (squaredDistance >= minimumSquaredDistance) {
            continue;
          }
          nearestIndex = candidateIndex;
          minimumSquaredDistance = squaredDistance;
        }
        return nearestIndex;
    }

    final int findNearestBasePaletteIndex(int targetColor) {
        return PaletteBitmapFont.findNearestPaletteIndex(this.colorPalettes[0], targetColor);
    }

    private final static void blitPaletteGlyph(int signedGlyphIndex, int[] destinationPixels, byte[] glyphIndices, int[] palette, int sourceIndex, int destinationIndex, int widthOrNegativeTailCount, int height, int destinationRowSkip, int sourceRowSkip) {
        int tailSourceIndexBeforeIncrement = 0;
        byte tailGlyphIndexByte = 0;
        int tailDestinationIndexBeforeIncrement = 0;
        int firstSourceIndexBeforeIncrement = 0;
        byte firstGlyphIndexByte = 0;
        int firstDestinationIndexBeforeIncrement = 0;
        int secondSourceIndexBeforeIncrement = 0;
        byte secondGlyphIndexByte = 0;
        int secondDestinationIndexBeforeIncrement = 0;
        int thirdSourceIndexBeforeIncrement = 0;
        byte thirdGlyphIndexByte = 0;
        int thirdDestinationIndexBeforeIncrement = 0;
        int fourthSourceIndexBeforeIncrement = 0;
        byte fourthGlyphIndexByte = 0;
        int fourthDestinationIndexBeforeIncrement = 0;
        int negativeFourPixelGroupCount;
        int negativeRowCounter;
        int negativeGroupOrTailCounter;
        negativeFourPixelGroupCount = -(widthOrNegativeTailCount >> 2);
        widthOrNegativeTailCount = -(widthOrNegativeTailCount & 3);
        negativeRowCounter = -height;
        paletteGlyphRows: while (true) {
          if (negativeRowCounter >= 0) {
            return;
          }
          negativeGroupOrTailCounter = negativeFourPixelGroupCount;
          while (true) {
            if (negativeGroupOrTailCounter >= 0) {
              negativeGroupOrTailCounter = widthOrNegativeTailCount;
              while (true) {
                if (negativeGroupOrTailCounter >= 0) {
                  destinationIndex = destinationIndex + destinationRowSkip;
                  sourceIndex = sourceIndex + sourceRowSkip;
                  negativeRowCounter++;
                  continue paletteGlyphRows;
                }
                tailSourceIndexBeforeIncrement = sourceIndex;
                sourceIndex++;
                tailGlyphIndexByte = glyphIndices[tailSourceIndexBeforeIncrement];
                signedGlyphIndex = tailGlyphIndexByte;
                if (tailGlyphIndexByte == 0) {
                  destinationIndex++;
                  negativeGroupOrTailCounter++;
                  continue;
                }
                tailDestinationIndexBeforeIncrement = destinationIndex;
                destinationIndex++;
                destinationPixels[tailDestinationIndexBeforeIncrement] = palette[signedGlyphIndex & 255];
                negativeGroupOrTailCounter++;
              }
            }
            firstSourceIndexBeforeIncrement = sourceIndex;
            sourceIndex++;
            firstGlyphIndexByte = glyphIndices[firstSourceIndexBeforeIncrement];
            signedGlyphIndex = firstGlyphIndexByte;
            if (firstGlyphIndexByte == 0) {
              destinationIndex++;
            } else {
              firstDestinationIndexBeforeIncrement = destinationIndex;
              destinationIndex++;
              destinationPixels[firstDestinationIndexBeforeIncrement] = palette[signedGlyphIndex & 255];
            }
            secondSourceIndexBeforeIncrement = sourceIndex;
            sourceIndex++;
            secondGlyphIndexByte = glyphIndices[secondSourceIndexBeforeIncrement];
            signedGlyphIndex = secondGlyphIndexByte;
            if (secondGlyphIndexByte == 0) {
              destinationIndex++;
            } else {
              secondDestinationIndexBeforeIncrement = destinationIndex;
              destinationIndex++;
              destinationPixels[secondDestinationIndexBeforeIncrement] = palette[signedGlyphIndex & 255];
            }
            thirdSourceIndexBeforeIncrement = sourceIndex;
            sourceIndex++;
            thirdGlyphIndexByte = glyphIndices[thirdSourceIndexBeforeIncrement];
            signedGlyphIndex = thirdGlyphIndexByte;
            if (thirdGlyphIndexByte == 0) {
              destinationIndex++;
            } else {
              thirdDestinationIndexBeforeIncrement = destinationIndex;
              destinationIndex++;
              destinationPixels[thirdDestinationIndexBeforeIncrement] = palette[signedGlyphIndex & 255];
            }
            fourthSourceIndexBeforeIncrement = sourceIndex;
            sourceIndex++;
            fourthGlyphIndexByte = glyphIndices[fourthSourceIndexBeforeIncrement];
            signedGlyphIndex = fourthGlyphIndexByte;
            if (fourthGlyphIndexByte == 0) {
              destinationIndex++;
              negativeGroupOrTailCounter++;
              continue;
            }
            fourthDestinationIndexBeforeIncrement = destinationIndex;
            destinationIndex++;
            destinationPixels[fourthDestinationIndexBeforeIncrement] = palette[signedGlyphIndex & 255];
            negativeGroupOrTailCounter++;
          }
        }
    }
}
