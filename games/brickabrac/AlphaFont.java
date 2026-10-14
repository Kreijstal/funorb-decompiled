/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AlphaFont extends TextFont {
    private byte[][] glyphCoverage;

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
            AlphaFont.blitCoverageGlyph(Rasterizer2D.pixels, this.glyphCoverage[glyphId], paint, sourceIndex, destinationIndex, width, height, destinationRowSkip, sourceRowSkip);
          } else {
            BinaryMaskFont.blitMask(Rasterizer2D.pixels, this.glyphCoverage[glyphId], paint, sourceIndex, destinationIndex, width, height, destinationRowSkip, sourceRowSkip);
          }
          return;
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
            AlphaFont.blitCoverageGlyphAlpha(Rasterizer2D.pixels, this.glyphCoverage[glyphId], paint, sourceIndex, destinationIndex, width, height, destinationRowSkip, sourceRowSkip, alpha);
          } else {
            BinaryMaskFont.blitMaskAlpha(Rasterizer2D.pixels, this.glyphCoverage[glyphId], paint, sourceIndex, destinationIndex, width, height, destinationRowSkip, sourceRowSkip, alpha);
          }
          return;
        }
    }

    AlphaFont(byte[] metrics, int[] glyphOffsetX, int[] glyphOffsetY, int[] glyphWidths, int[] glyphHeights, int[] palette, byte[][] glyphData) {
        super(metrics, glyphOffsetX, glyphOffsetY, glyphWidths, glyphHeights);
        this.glyphCoverage = new byte[256][];
        this.glyphCoverage = AlphaFont.convertToCoverage(palette, glyphData);
    }

    private final static byte[][] convertToCoverage(int[] palette, byte[][] glyphData) {
        int paletteIndex = 0;
        int pixelIndex = 0;
        byte[][] glyphs;
        int color;
        int weightedRedBlue;
        byte[] glyph;
        int signedPaletteIndex;
        int glyphIndex;
        for (paletteIndex = 0; paletteIndex < palette.length; paletteIndex++) {
          color = palette[paletteIndex];
          weightedRedBlue = (color >> 15 & 510) + (color & 255);
          palette[paletteIndex] = weightedRedBlue / 3 + (color >> 8 & 255) >> 1;
        }
        glyphs = glyphData;
        for (glyphIndex = 0; glyphIndex < glyphs.length; glyphIndex++) {
          glyph = glyphs[glyphIndex];
          for (pixelIndex = 0; pixelIndex < glyph.length; pixelIndex++) {
            signedPaletteIndex = glyph[pixelIndex];
            if (signedPaletteIndex != 0) {
              glyph[pixelIndex] = (byte)palette[signedPaletteIndex];
            }
          }
        }
        return glyphData;
    }

    private final static void blitCoverageGlyphAlpha(int[] destination, byte[] coverage, int paint, int sourceIndex, int destinationIndex, int width, int height, int destinationRowSkip, int sourceRowSkip, int alpha) {
        int negativeRow = 0;
        int negativeColumn = 0;
        int sourcePixel = 0;
        int destinationPixel = 0;
        int coverageOrInverseAlpha;
        int sourceContribution;
        int background;
        for (negativeRow = -height; negativeRow < 0; negativeRow++) {
          for (negativeColumn = -width; negativeColumn < 0; negativeColumn++) {
            sourcePixel = sourceIndex;
            sourceIndex++;
            coverageOrInverseAlpha = (255 & coverage[sourcePixel]) * alpha >> 8;
            if (coverageOrInverseAlpha == 0) {
              destinationIndex++;
            } else {
              sourceContribution = ((paint & 16711935) * coverageOrInverseAlpha & -16711936) + ((paint & 65280) * coverageOrInverseAlpha & 16711680) >> 8;
              coverageOrInverseAlpha = 256 - coverageOrInverseAlpha;
              background = destination[destinationIndex];
              destinationPixel = destinationIndex;
              destinationIndex++;
              destination[destinationPixel] = (((background & 16711935) * coverageOrInverseAlpha & -16711936) + ((background & 65280) * coverageOrInverseAlpha & 16711680) >> 8) + sourceContribution;
            }
          }
          destinationIndex = destinationIndex + destinationRowSkip;
          sourceIndex = sourceIndex + sourceRowSkip;
        }
    }

    private final static void blitCoverageGlyph(int[] destination, byte[] coverage, int paint, int sourceIndex, int destinationIndex, int width, int height, int destinationRowSkip, int sourceRowSkip) {
        int negativeRow = 0;
        int negativeColumn = 0;
        int sourcePixel = 0;
        int destinationPixel = 0;
        int coverageOrInverseAlpha;
        int sourceContribution;
        int background;
        for (negativeRow = -height; negativeRow < 0; negativeRow++) {
          for (negativeColumn = -width; negativeColumn < 0; negativeColumn++) {
            sourcePixel = sourceIndex;
            sourceIndex++;
            coverageOrInverseAlpha = 255 & coverage[sourcePixel];
            if (coverageOrInverseAlpha == 0) {
              destinationIndex++;
            } else {
              sourceContribution = ((paint & 16711935) * coverageOrInverseAlpha & -16711936) + ((paint & 65280) * coverageOrInverseAlpha & 16711680) >> 8;
              coverageOrInverseAlpha = 256 - coverageOrInverseAlpha;
              background = destination[destinationIndex];
              destinationPixel = destinationIndex;
              destinationIndex++;
              destination[destinationPixel] = (((background & 16711935) * coverageOrInverseAlpha & -16711936) + ((background & 65280) * coverageOrInverseAlpha & 16711680) >> 8) + sourceContribution;
            }
          }
          destinationIndex = destinationIndex + destinationRowSkip;
          sourceIndex = sourceIndex + sourceRowSkip;
        }
    }
}
