/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PaletteFont extends TextFont {
    private byte[][] glyphIndices;
    int[][] palettes;

    private final static void blitIndexedGlyphAlpha(int paletteIndex, int[] destination, byte[] indices, int[] palette, int sourceIndex, int destinationIndex, int width, int height, int destinationRowSkip, int sourceRowSkip, int alpha) {
        int negativeRow = 0;
        int negativeColumn = 0;
        int sourcePixel = 0;
        byte indexByte = 0;
        int destinationPixel = 0;
        int inverseAlpha;
        int background;
        int foreground;
        inverseAlpha = 256 - alpha;
        for (negativeRow = -height; negativeRow < 0; negativeRow++) {
          for (negativeColumn = -width; negativeColumn < 0; negativeColumn++) {
            sourcePixel = sourceIndex;
            sourceIndex++;
            indexByte = indices[sourcePixel];
            paletteIndex = indexByte;
            if (indexByte == 0) {
              destinationIndex++;
            } else {
              background = destination[destinationIndex];
              foreground = palette[paletteIndex & 255];
              destinationPixel = destinationIndex;
              destinationIndex++;
              destination[destinationPixel] = ((foreground & 16711935) * alpha + (background & 16711935) * inverseAlpha & -16711936) + ((foreground & 65280) * alpha + (background & 65280) * inverseAlpha & 16711680) >> 8;
            }
          }
          destinationIndex = destinationIndex + destinationRowSkip;
          sourceIndex = sourceIndex + sourceRowSkip;
        }
    }

    final void drawGlyphAlpha(int glyphId, int x, int y, int width, int height, int paint, int alpha, boolean shadow) {
        int destinationIndex;
        int destinationRowSkip;
        int sourceRowSkip;
        int sourceIndex;
        int clippedTopRows;
        int clippedLeftColumns;
        int clippedRightColumns;
        destinationIndex = x + y * Rasterizer2D.width;
        destinationRowSkip = Rasterizer2D.width - width;
        sourceRowSkip = 0;
        sourceIndex = 0;
        if (y < Rasterizer2D.clipTop) {
          clippedTopRows = Rasterizer2D.clipTop - y;
          height = height - clippedTopRows;
          y = Rasterizer2D.clipTop;
          sourceIndex = sourceIndex + clippedTopRows * width;
          destinationIndex = destinationIndex + clippedTopRows * Rasterizer2D.width;
        }
        if (y + height > Rasterizer2D.clipBottom) {
          height = height - (y + height - Rasterizer2D.clipBottom);
        }
        if (x < Rasterizer2D.clipLeft) {
          clippedLeftColumns = Rasterizer2D.clipLeft - x;
          width = width - clippedLeftColumns;
          x = Rasterizer2D.clipLeft;
          sourceIndex = sourceIndex + clippedLeftColumns;
          destinationIndex = destinationIndex + clippedLeftColumns;
          sourceRowSkip = sourceRowSkip + clippedLeftColumns;
          destinationRowSkip = destinationRowSkip + clippedLeftColumns;
        }
        if (x + width > Rasterizer2D.clipRight) {
          clippedRightColumns = x + width - Rasterizer2D.clipRight;
          width = width - clippedRightColumns;
          sourceRowSkip = sourceRowSkip + clippedRightColumns;
          destinationRowSkip = destinationRowSkip + clippedRightColumns;
        }
        if (width > 0 &&
          height > 0) {
          if (!shadow) {
            PaletteFont.blitIndexedGlyphAlpha(0, Rasterizer2D.pixels, this.glyphIndices[glyphId], this.palettes[paint], sourceIndex, destinationIndex, width, height, destinationRowSkip, sourceRowSkip, alpha);
          } else {
            BinaryMaskFont.blitMaskAlpha(Rasterizer2D.pixels, this.glyphIndices[glyphId], paint, sourceIndex, destinationIndex, width, height, destinationRowSkip, sourceRowSkip, alpha);
          }
          return;
        }
    }

    private final static void blitIndexedGlyph(int paletteIndex, int[] destination, byte[] indices, int[] palette, int sourceIndex, int destinationIndex, int width, int height, int destinationRowSkip, int sourceRowSkip) {
        int negativeRow = 0;
        int sourcePixelZero = 0;
        byte indexByteZero = 0;
        int destinationPixelZero = 0;
        int sourcePixelOne = 0;
        byte indexByteOne = 0;
        int destinationPixelOne = 0;
        int sourcePixelTwo = 0;
        byte indexByteTwo = 0;
        int destinationPixelTwo = 0;
        int sourcePixelThree = 0;
        byte indexByteThree = 0;
        int destinationPixelThree = 0;
        int sourceTailPixel = 0;
        byte indexByteTail = 0;
        int destinationTailPixel = 0;
        int negativeFourPixelGroups;
        int negativeGroup;
        int negativeTailPixel;
        negativeFourPixelGroups = -(width >> 2);
        width = -(width & 3);
        for (negativeRow = -height; negativeRow < 0; negativeRow++) {
          for (negativeGroup = negativeFourPixelGroups; negativeGroup < 0; negativeGroup++) {
            sourcePixelZero = sourceIndex;
            sourceIndex++;
            indexByteZero = indices[sourcePixelZero];
            paletteIndex = indexByteZero;
            if (indexByteZero == 0) {
              destinationIndex++;
            } else {
              destinationPixelZero = destinationIndex;
              destinationIndex++;
              destination[destinationPixelZero] = palette[paletteIndex & 255];
            }
            sourcePixelOne = sourceIndex;
            sourceIndex++;
            indexByteOne = indices[sourcePixelOne];
            paletteIndex = indexByteOne;
            if (indexByteOne == 0) {
              destinationIndex++;
            } else {
              destinationPixelOne = destinationIndex;
              destinationIndex++;
              destination[destinationPixelOne] = palette[paletteIndex & 255];
            }
            sourcePixelTwo = sourceIndex;
            sourceIndex++;
            indexByteTwo = indices[sourcePixelTwo];
            paletteIndex = indexByteTwo;
            if (indexByteTwo == 0) {
              destinationIndex++;
            } else {
              destinationPixelTwo = destinationIndex;
              destinationIndex++;
              destination[destinationPixelTwo] = palette[paletteIndex & 255];
            }
            sourcePixelThree = sourceIndex;
            sourceIndex++;
            indexByteThree = indices[sourcePixelThree];
            paletteIndex = indexByteThree;
            if (indexByteThree == 0) {
              destinationIndex++;
            } else {
              destinationPixelThree = destinationIndex;
              destinationIndex++;
              destination[destinationPixelThree] = palette[paletteIndex & 255];
            }
          }
          for (negativeTailPixel = width; negativeTailPixel < 0; negativeTailPixel++) {
            sourceTailPixel = sourceIndex;
            sourceIndex++;
            indexByteTail = indices[sourceTailPixel];
            paletteIndex = indexByteTail;
            if (indexByteTail == 0) {
              destinationIndex++;
            } else {
              destinationTailPixel = destinationIndex;
              destinationIndex++;
              destination[destinationTailPixel] = palette[paletteIndex & 255];
            }
          }
          destinationIndex = destinationIndex + destinationRowSkip;
          sourceIndex = sourceIndex + sourceRowSkip;
        }
    }

    PaletteFont(byte[] metrics, int[] glyphOffsetX, int[] glyphOffsetY, int[] glyphWidths, int[] glyphHeights, int[] palette, byte[][] glyphData) {
        super(metrics, glyphOffsetX, glyphOffsetY, glyphWidths, glyphHeights);
        this.glyphIndices = new byte[256][];
        this.glyphIndices = glyphData;
        this.palettes = new int[4][];
        this.palettes[0] = palette;
    }

    final void drawGlyph(int glyphId, int x, int y, int width, int height, int paint, boolean shadow) {
        int destinationIndex;
        int destinationRowSkip;
        int sourceRowSkip;
        int sourceIndex;
        int clippedTopRows;
        int clippedLeftColumns;
        int clippedRightColumns;
        destinationIndex = x + y * Rasterizer2D.width;
        destinationRowSkip = Rasterizer2D.width - width;
        sourceRowSkip = 0;
        sourceIndex = 0;
        if (y < Rasterizer2D.clipTop) {
          clippedTopRows = Rasterizer2D.clipTop - y;
          height = height - clippedTopRows;
          y = Rasterizer2D.clipTop;
          sourceIndex = sourceIndex + clippedTopRows * width;
          destinationIndex = destinationIndex + clippedTopRows * Rasterizer2D.width;
        }
        if (y + height > Rasterizer2D.clipBottom) {
          height = height - (y + height - Rasterizer2D.clipBottom);
        }
        if (x < Rasterizer2D.clipLeft) {
          clippedLeftColumns = Rasterizer2D.clipLeft - x;
          width = width - clippedLeftColumns;
          x = Rasterizer2D.clipLeft;
          sourceIndex = sourceIndex + clippedLeftColumns;
          destinationIndex = destinationIndex + clippedLeftColumns;
          sourceRowSkip = sourceRowSkip + clippedLeftColumns;
          destinationRowSkip = destinationRowSkip + clippedLeftColumns;
        }
        if (x + width > Rasterizer2D.clipRight) {
          clippedRightColumns = x + width - Rasterizer2D.clipRight;
          width = width - clippedRightColumns;
          sourceRowSkip = sourceRowSkip + clippedRightColumns;
          destinationRowSkip = destinationRowSkip + clippedRightColumns;
        }
        if (width > 0 &&
          height > 0) {
          if (!shadow) {
            PaletteFont.blitIndexedGlyph(0, Rasterizer2D.pixels, this.glyphIndices[glyphId], this.palettes[paint], sourceIndex, destinationIndex, width, height, destinationRowSkip, sourceRowSkip);
          } else {
            BinaryMaskFont.blitMask(Rasterizer2D.pixels, this.glyphIndices[glyphId], paint, sourceIndex, destinationIndex, width, height, destinationRowSkip, sourceRowSkip);
          }
          return;
        }
    }
}
