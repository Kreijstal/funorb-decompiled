/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AntialiasedBitmapFont extends BitmapFont {
    private byte[][] glyphCoverage;

    private final static byte[][] convertGlyphCoverage(int[] palette, byte[][] glyphIndices) {
        int paletteIndex = 0;
        int pixelIndex = 0;
        byte[][] glyphs;
        int colour;
        int weightedRedBlue;
        byte[] glyph;
        int signedIndex;
        int glyphIndex;
        for (paletteIndex = 0; paletteIndex < palette.length; paletteIndex++) {
          colour = palette[paletteIndex];
          weightedRedBlue = (colour >> 15 & 510) + (colour & 255);
          palette[paletteIndex] = weightedRedBlue / 3 + (colour >> 8 & 255) >> 1;
        }
        glyphs = glyphIndices;
        for (glyphIndex = 0; glyphIndex < glyphs.length; glyphIndex++) {
          glyph = glyphs[glyphIndex];
          for (pixelIndex = 0; pixelIndex < glyph.length; pixelIndex++) {
            signedIndex = glyph[pixelIndex];
            if (signedIndex != 0) {
              glyph[pixelIndex] = (byte)palette[signedIndex];
            }
          }
        }
        return glyphIndices;
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
            AntialiasedBitmapFont.blitCoverageGlyph(SoftwareRaster.pixels, this.glyphCoverage[glyph], colour, sourceIndex, destinationIndex, width, height, destinationRowSkip, sourceRowSkip);
          } else {
            BinaryBitmapFont.blitBinaryGlyph(SoftwareRaster.pixels, this.glyphCoverage[glyph], colour, sourceIndex, destinationIndex, width, height, destinationRowSkip, sourceRowSkip);
          }
          return;
        }
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
            AntialiasedBitmapFont.blitCoverageGlyphWithAlpha(SoftwareRaster.pixels, this.glyphCoverage[glyph], colour, sourceIndex, destinationIndex, width, height, destinationRowSkip, sourceRowSkip, alpha);
          } else {
            BinaryBitmapFont.blitBinaryGlyphWithAlpha(SoftwareRaster.pixels, this.glyphCoverage[glyph], colour, sourceIndex, destinationIndex, width, height, destinationRowSkip, sourceRowSkip, alpha);
          }
          return;
        }
    }

    private final static void blitCoverageGlyph(int[] destination, byte[] source, int colour, int sourceIndex, int destinationIndex, int width, int height, int destinationRowSkip, int sourceRowSkip) {
        int row = 0;
        int column = 0;
        int coverageIndex = 0;
        int pixelIndex = 0;
        int coverage;
        int foreground;
        int background;
        for (row = -height; row < 0; row++) {
          for (column = -width; column < 0; column++) {
            coverageIndex = sourceIndex;
            sourceIndex++;
            coverage = 255 & source[coverageIndex];
            if (coverage == 0) {
              destinationIndex++;
            } else {
              foreground = ((colour & 16711935) * coverage & -16711936) + ((colour & 65280) * coverage & 16711680) >> 8;
              coverage = 256 - coverage;
              background = destination[destinationIndex];
              pixelIndex = destinationIndex;
              destinationIndex++;
              destination[pixelIndex] = (((background & 16711935) * coverage & -16711936) + ((background & 65280) * coverage & 16711680) >> 8) + foreground;
            }
          }
          destinationIndex = destinationIndex + destinationRowSkip;
          sourceIndex = sourceIndex + sourceRowSkip;
        }
    }

    private final static void blitCoverageGlyphWithAlpha(int[] destination, byte[] source, int colour, int sourceIndex, int destinationIndex, int width, int height, int destinationRowSkip, int sourceRowSkip, int alpha) {
        int row = 0;
        int column = 0;
        int coverageIndex = 0;
        int pixelIndex = 0;
        int coverage;
        int foreground;
        int background;
        for (row = -height; row < 0; row++) {
          for (column = -width; column < 0; column++) {
            coverageIndex = sourceIndex;
            sourceIndex++;
            coverage = (255 & source[coverageIndex]) * alpha >> 8;
            if (coverage == 0) {
              destinationIndex++;
            } else {
              foreground = ((colour & 16711935) * coverage & -16711936) + ((colour & 65280) * coverage & 16711680) >> 8;
              coverage = 256 - coverage;
              background = destination[destinationIndex];
              pixelIndex = destinationIndex;
              destinationIndex++;
              destination[pixelIndex] = (((background & 16711935) * coverage & -16711936) + ((background & 65280) * coverage & 16711680) >> 8) + foreground;
            }
          }
          destinationIndex = destinationIndex + destinationRowSkip;
          sourceIndex = sourceIndex + sourceRowSkip;
        }
    }

    AntialiasedBitmapFont(byte[] metrics, int[] glyphOffsetXs, int[] glyphOffsetYs, int[] glyphWidths, int[] glyphHeights, int[] palette, byte[][] glyphIndices) {
        super(metrics, glyphOffsetXs, glyphOffsetYs, glyphWidths, glyphHeights);
        this.glyphCoverage = new byte[256][];
        this.glyphCoverage = AntialiasedBitmapFont.convertGlyphCoverage(palette, glyphIndices);
    }
}
