/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class CoverageBitmapFont extends BitmapFont {
    private byte[][] glyphCoverage;

    final void drawGlyph(int glyphIndex, int x, int y, int width, int height, int color, boolean shadowPass) {
        int destinationIndex;
        int destinationRowSkip;
        int sourceRowSkip;
        int sourceIndex;
        int clippedPixels;
        int leftClipPixels;
        int rightClipPixels;
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
          leftClipPixels = SoftwareRasterizer.clipLeft - x;
          width = width - leftClipPixels;
          x = SoftwareRasterizer.clipLeft;
          sourceIndex = sourceIndex + leftClipPixels;
          destinationIndex = destinationIndex + leftClipPixels;
          sourceRowSkip = sourceRowSkip + leftClipPixels;
          destinationRowSkip = destinationRowSkip + leftClipPixels;
        }
        if (x + width > SoftwareRasterizer.clipRight) {
          rightClipPixels = x + width - SoftwareRasterizer.clipRight;
          width = width - rightClipPixels;
          sourceRowSkip = sourceRowSkip + rightClipPixels;
          destinationRowSkip = destinationRowSkip + rightClipPixels;
        }
        if (width > 0 &&
            height > 0) {
          if (!shadowPass) {
            CoverageBitmapFont.blitCoverageGlyph(SoftwareRasterizer.framebuffer, this.glyphCoverage[glyphIndex], color, sourceIndex, destinationIndex, width, height, destinationRowSkip, sourceRowSkip);
          } else {
            MonochromeBitmapFont.blitGlyphMask(SoftwareRasterizer.framebuffer, this.glyphCoverage[glyphIndex], color, sourceIndex, destinationIndex, width, height, destinationRowSkip, sourceRowSkip);
          }
          return;
        }
    }

    private final static byte[][] convertPaletteGlyphsToCoverageInPlace(int[] palette, byte[][] glyphs) {
        int paletteIndex = 0;
        int glyphPixelIndex = 0;
        byte[][] glyphsSnapshot;
        int paletteColorOrGlyphIndex;
        int twiceRedPlusBlue;
        byte[] glyphPixels;
        int signedPaletteIndex;
        int glyphIndex;
        for (paletteIndex = 0; paletteIndex < palette.length; paletteIndex++) {
          paletteColorOrGlyphIndex = palette[paletteIndex];
          twiceRedPlusBlue = (paletteColorOrGlyphIndex >> 15 & 510) + (paletteColorOrGlyphIndex & 255);
          palette[paletteIndex] = twiceRedPlusBlue / 3 + (paletteColorOrGlyphIndex >> 8 & 255) >> 1;
        }
        glyphsSnapshot = glyphs;
        for (glyphIndex = 0; glyphIndex < glyphsSnapshot.length; glyphIndex++) {
          glyphPixels = glyphsSnapshot[glyphIndex];
          for (glyphPixelIndex = 0; glyphPixelIndex < glyphPixels.length; glyphPixelIndex++) {
            signedPaletteIndex = glyphPixels[glyphPixelIndex];
            if (signedPaletteIndex == 0) {
              continue;
            }
            glyphPixels[glyphPixelIndex] = (byte)palette[signedPaletteIndex];
          }
        }
        return glyphs;
    }

    final void drawGlyphAlpha(int glyphIndex, int x, int y, int width, int height, int color, int alpha256, boolean shadowPass) {
        int destinationIndex;
        int destinationRowSkip;
        int sourceRowSkip;
        int sourceIndex;
        int clippedPixels;
        int leftClipPixels;
        int rightClipPixels;
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
          leftClipPixels = SoftwareRasterizer.clipLeft - x;
          width = width - leftClipPixels;
          x = SoftwareRasterizer.clipLeft;
          sourceIndex = sourceIndex + leftClipPixels;
          destinationIndex = destinationIndex + leftClipPixels;
          sourceRowSkip = sourceRowSkip + leftClipPixels;
          destinationRowSkip = destinationRowSkip + leftClipPixels;
        }
        if (x + width > SoftwareRasterizer.clipRight) {
          rightClipPixels = x + width - SoftwareRasterizer.clipRight;
          width = width - rightClipPixels;
          sourceRowSkip = sourceRowSkip + rightClipPixels;
          destinationRowSkip = destinationRowSkip + rightClipPixels;
        }
        if (width > 0 &&
            height > 0) {
          if (!shadowPass) {
            CoverageBitmapFont.blitCoverageGlyphAlpha(SoftwareRasterizer.framebuffer, this.glyphCoverage[glyphIndex], color, sourceIndex, destinationIndex, width, height, destinationRowSkip, sourceRowSkip, alpha256);
          } else {
            MonochromeBitmapFont.blitGlyphMaskAlpha(SoftwareRasterizer.framebuffer, this.glyphCoverage[glyphIndex], color, sourceIndex, destinationIndex, width, height, destinationRowSkip, sourceRowSkip, alpha256);
          }
          return;
        }
    }

    CoverageBitmapFont(byte[] metrics, int[] xOffsets, int[] yOffsets, int[] widths, int[] heights, int[] palette, byte[][] glyphs) {
        super(metrics, xOffsets, yOffsets, widths, heights);
        this.glyphCoverage = new byte[256][];
        this.glyphCoverage = CoverageBitmapFont.convertPaletteGlyphsToCoverageInPlace(palette, glyphs);
    }

    private final static void blitCoverageGlyphAlpha(int[] destinationPixels, byte[] glyphCoverage, int color, int sourceIndex, int destinationIndex, int width, int height, int destinationRowSkip, int sourceRowSkip, int alpha256) {
        int sourceIndexBeforeIncrement = 0;
        int destinationIndexBeforeIncrement = 0;
        int negativeRowCounter;
        int negativeColumnCounter;
        int effectiveAlphaOrDestinationWeight256;
        int weightedSourceColor;
        int destinationColor;
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
            effectiveAlphaOrDestinationWeight256 = (255 & glyphCoverage[sourceIndexBeforeIncrement]) * alpha256 >> 8;
            if (effectiveAlphaOrDestinationWeight256 == 0) {
              destinationIndex++;
              negativeColumnCounter++;
              continue;
            }
            weightedSourceColor = ((color & 16711935) * effectiveAlphaOrDestinationWeight256 & -16711936) + ((color & 65280) * effectiveAlphaOrDestinationWeight256 & 16711680) >> 8;
            effectiveAlphaOrDestinationWeight256 = 256 - effectiveAlphaOrDestinationWeight256;
            destinationColor = destinationPixels[destinationIndex];
            destinationIndexBeforeIncrement = destinationIndex;
            destinationIndex++;
            destinationPixels[destinationIndexBeforeIncrement] = (((destinationColor & 16711935) * effectiveAlphaOrDestinationWeight256 & -16711936) + ((destinationColor & 65280) * effectiveAlphaOrDestinationWeight256 & 16711680) >> 8) + weightedSourceColor;
            negativeColumnCounter++;
          }
        }
    }

    private final static void blitCoverageGlyph(int[] destinationPixels, byte[] glyphCoverage, int color, int sourceIndex, int destinationIndex, int width, int height, int destinationRowSkip, int sourceRowSkip) {
        int sourceIndexBeforeIncrement = 0;
        int destinationIndexBeforeIncrement = 0;
        int negativeRowCounter;
        int negativeColumnCounter;
        int coverageOrDestinationWeight256;
        int weightedSourceColor;
        int destinationColor;
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
            coverageOrDestinationWeight256 = 255 & glyphCoverage[sourceIndexBeforeIncrement];
            if (coverageOrDestinationWeight256 == 0) {
              destinationIndex++;
              negativeColumnCounter++;
              continue;
            }
            weightedSourceColor = ((color & 16711935) * coverageOrDestinationWeight256 & -16711936) + ((color & 65280) * coverageOrDestinationWeight256 & 16711680) >> 8;
            coverageOrDestinationWeight256 = 256 - coverageOrDestinationWeight256;
            destinationColor = destinationPixels[destinationIndex];
            destinationIndexBeforeIncrement = destinationIndex;
            destinationIndex++;
            destinationPixels[destinationIndexBeforeIncrement] = (((destinationColor & 16711935) * coverageOrDestinationWeight256 & -16711936) + ((destinationColor & 65280) * coverageOrDestinationWeight256 & 16711680) >> 8) + weightedSourceColor;
            negativeColumnCounter++;
          }
        }
    }
}
