/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PalettedBitmapFont extends BitmapFont {
    private int[][] palettes;
    private byte[][] glyphIndices;

    private final static void blitPalettedGlyph(int paletteIndex, int[] destination, byte[] source, int[] palette, int sourceIndex, int destinationIndex, int width, int height, int destinationRowSkip, int sourceRowSkip) {
        int row = 0;
        int sourceOffsetFirst = 0;
        byte indexFirst = 0;
        int destinationOffsetFirst = 0;
        int sourceOffsetSecond = 0;
        byte indexSecond = 0;
        int destinationOffsetSecond = 0;
        int sourceOffsetThird = 0;
        byte indexThird = 0;
        int destinationOffsetThird = 0;
        int sourceOffsetFourth = 0;
        byte indexFourth = 0;
        int destinationOffsetFourth = 0;
        int sourceOffsetRemainder = 0;
        byte indexRemainder = 0;
        int destinationOffsetRemainder = 0;
        int negativeBlockCount;
        int block;
        int remainderPixel;
        negativeBlockCount = -(width >> 2);
        width = -(width & 3);
        for (row = -height; row < 0; row++) {
          for (block = negativeBlockCount; block < 0; block++) {
            sourceOffsetFirst = sourceIndex;
            sourceIndex++;
            indexFirst = source[sourceOffsetFirst];
            paletteIndex = indexFirst;
            if (indexFirst == 0) {
              destinationIndex++;
            } else {
              destinationOffsetFirst = destinationIndex;
              destinationIndex++;
              destination[destinationOffsetFirst] = palette[paletteIndex & 255];
            }
            sourceOffsetSecond = sourceIndex;
            sourceIndex++;
            indexSecond = source[sourceOffsetSecond];
            paletteIndex = indexSecond;
            if (indexSecond == 0) {
              destinationIndex++;
            } else {
              destinationOffsetSecond = destinationIndex;
              destinationIndex++;
              destination[destinationOffsetSecond] = palette[paletteIndex & 255];
            }
            sourceOffsetThird = sourceIndex;
            sourceIndex++;
            indexThird = source[sourceOffsetThird];
            paletteIndex = indexThird;
            if (indexThird == 0) {
              destinationIndex++;
            } else {
              destinationOffsetThird = destinationIndex;
              destinationIndex++;
              destination[destinationOffsetThird] = palette[paletteIndex & 255];
            }
            sourceOffsetFourth = sourceIndex;
            sourceIndex++;
            indexFourth = source[sourceOffsetFourth];
            paletteIndex = indexFourth;
            if (indexFourth == 0) {
              destinationIndex++;
            } else {
              destinationOffsetFourth = destinationIndex;
              destinationIndex++;
              destination[destinationOffsetFourth] = palette[paletteIndex & 255];
            }
          }
          for (remainderPixel = width; remainderPixel < 0; remainderPixel++) {
            sourceOffsetRemainder = sourceIndex;
            sourceIndex++;
            indexRemainder = source[sourceOffsetRemainder];
            paletteIndex = indexRemainder;
            if (indexRemainder == 0) {
              destinationIndex++;
            } else {
              destinationOffsetRemainder = destinationIndex;
              destinationIndex++;
              destination[destinationOffsetRemainder] = palette[paletteIndex & 255];
            }
          }
          destinationIndex = destinationIndex + destinationRowSkip;
          sourceIndex = sourceIndex + sourceRowSkip;
        }
    }

    PalettedBitmapFont(byte[] metrics, int[] glyphOffsetXs, int[] glyphOffsetYs, int[] glyphWidths, int[] glyphHeights, int[] palette, byte[][] glyphIndices) {
        super(metrics, glyphOffsetXs, glyphOffsetYs, glyphWidths, glyphHeights);
        this.glyphIndices = new byte[256][];
        this.glyphIndices = glyphIndices;
        this.palettes = new int[4][];
        this.palettes[0] = palette;
    }

    final void drawGlyphWithAlpha(int glyph, int left, int top, int width, int height, int colour, int alpha, boolean shadow) {
        int destinationIndex;
        int destinationRowSkip;
        int sourceRowSkip;
        int sourceIndex;
        int clippedTop;
        int clippedLeft;
        int clippedRight;
        destinationIndex = left + top * SoftwareRaster.width;
        destinationRowSkip = SoftwareRaster.width - width;
        sourceRowSkip = 0;
        sourceIndex = 0;
        if (top < SoftwareRaster.clipTop) {
          clippedTop = SoftwareRaster.clipTop - top;
          height = height - clippedTop;
          top = SoftwareRaster.clipTop;
          sourceIndex = sourceIndex + clippedTop * width;
          destinationIndex = destinationIndex + clippedTop * SoftwareRaster.width;
        }
        if (top + height > SoftwareRaster.clipBottom) {
          height = height - (top + height - SoftwareRaster.clipBottom);
        }
        if (left < SoftwareRaster.clipLeft) {
          clippedLeft = SoftwareRaster.clipLeft - left;
          width = width - clippedLeft;
          left = SoftwareRaster.clipLeft;
          sourceIndex = sourceIndex + clippedLeft;
          destinationIndex = destinationIndex + clippedLeft;
          sourceRowSkip = sourceRowSkip + clippedLeft;
          destinationRowSkip = destinationRowSkip + clippedLeft;
        }
        if (left + width > SoftwareRaster.clipRight) {
          clippedRight = left + width - SoftwareRaster.clipRight;
          width = width - clippedRight;
          sourceRowSkip = sourceRowSkip + clippedRight;
          destinationRowSkip = destinationRowSkip + clippedRight;
        }
        if (width > 0 &&
          height > 0) {
          if (!shadow) {
            PalettedBitmapFont.blitPalettedGlyphWithAlpha(0, SoftwareRaster.pixels, this.glyphIndices[glyph], this.palettes[colour], sourceIndex, destinationIndex, width, height, destinationRowSkip, sourceRowSkip, alpha);
          } else {
            BinaryBitmapFont.blitBinaryGlyphWithAlpha(SoftwareRaster.pixels, this.glyphIndices[glyph], colour, sourceIndex, destinationIndex, width, height, destinationRowSkip, sourceRowSkip, alpha);
          }
          return;
        }
    }

    final void drawGlyph(int glyph, int left, int top, int width, int height, int colour, boolean shadow) {
        int destinationIndex;
        int destinationRowSkip;
        int sourceRowSkip;
        int sourceIndex;
        int clippedTop;
        int clippedLeft;
        int clippedRight;
        destinationIndex = left + top * SoftwareRaster.width;
        destinationRowSkip = SoftwareRaster.width - width;
        sourceRowSkip = 0;
        sourceIndex = 0;
        if (top < SoftwareRaster.clipTop) {
          clippedTop = SoftwareRaster.clipTop - top;
          height = height - clippedTop;
          top = SoftwareRaster.clipTop;
          sourceIndex = sourceIndex + clippedTop * width;
          destinationIndex = destinationIndex + clippedTop * SoftwareRaster.width;
        }
        if (top + height > SoftwareRaster.clipBottom) {
          height = height - (top + height - SoftwareRaster.clipBottom);
        }
        if (left < SoftwareRaster.clipLeft) {
          clippedLeft = SoftwareRaster.clipLeft - left;
          width = width - clippedLeft;
          left = SoftwareRaster.clipLeft;
          sourceIndex = sourceIndex + clippedLeft;
          destinationIndex = destinationIndex + clippedLeft;
          sourceRowSkip = sourceRowSkip + clippedLeft;
          destinationRowSkip = destinationRowSkip + clippedLeft;
        }
        if (left + width > SoftwareRaster.clipRight) {
          clippedRight = left + width - SoftwareRaster.clipRight;
          width = width - clippedRight;
          sourceRowSkip = sourceRowSkip + clippedRight;
          destinationRowSkip = destinationRowSkip + clippedRight;
        }
        if (width > 0 &&
          height > 0) {
          if (!shadow) {
            PalettedBitmapFont.blitPalettedGlyph(0, SoftwareRaster.pixels, this.glyphIndices[glyph], this.palettes[colour], sourceIndex, destinationIndex, width, height, destinationRowSkip, sourceRowSkip);
          } else {
            BinaryBitmapFont.blitBinaryGlyph(SoftwareRaster.pixels, this.glyphIndices[glyph], colour, sourceIndex, destinationIndex, width, height, destinationRowSkip, sourceRowSkip);
          }
          return;
        }
    }

    private final static void blitPalettedGlyphWithAlpha(int paletteIndex, int[] destination, byte[] source, int[] palette, int sourceIndex, int destinationIndex, int width, int height, int destinationRowSkip, int sourceRowSkip, int alpha) {
        int row = 0;
        int column = 0;
        int sourceOffset = 0;
        byte index = 0;
        int destinationOffset = 0;
        int inverseAlpha;
        int background;
        int foreground;
        inverseAlpha = 256 - alpha;
        for (row = -height; row < 0; row++) {
          for (column = -width; column < 0; column++) {
            sourceOffset = sourceIndex;
            sourceIndex++;
            index = source[sourceOffset];
            paletteIndex = index;
            if (index == 0) {
              destinationIndex++;
            } else {
              background = destination[destinationIndex];
              foreground = palette[paletteIndex & 255];
              destinationOffset = destinationIndex;
              destinationIndex++;
              destination[destinationOffset] = ((foreground & 16711935) * alpha + (background & 16711935) * inverseAlpha & -16711936) + ((foreground & 65280) * alpha + (background & 65280) * inverseAlpha & 16711680) >> 8;
            }
          }
          destinationIndex = destinationIndex + destinationRowSkip;
          sourceIndex = sourceIndex + sourceRowSkip;
        }
    }
}
