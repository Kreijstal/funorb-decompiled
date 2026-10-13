/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class BinaryBitmapFont extends BitmapFont {
    private byte[][] glyphMasks;

    private final static void blitMaskedGlyph(int[] unusedDestination, byte[] source, int left, int top, int width, int height, int colour, int sourceIndex, int destinationIndex, int destinationRowSkip, int sourceRowSkip, int[] maskStarts, int[] maskWidths) {
        int maskRow = 0;
        int column = 0;
        int pixelIndex = 0;
        int relativeLeft;
        int relativeTop;
        int maskStart;
        int maskWidth;
        int remainingWidth;
        int clippedToMask;
        int rightSkip;
        relativeLeft = left - SoftwareRaster.clipLeft;
        relativeTop = top - SoftwareRaster.clipTop;
        for (maskRow = relativeTop; maskRow < relativeTop + height; maskRow++) {
          boolean rowIntersectsMask = true;
          maskStart = maskStarts[maskRow];
          maskWidth = maskWidths[maskRow];
          remainingWidth = width;
          if (relativeLeft <= maskStart) {
            clippedToMask = maskStart - relativeLeft;
            if (clippedToMask >= width) {
              sourceIndex = sourceIndex + (width + sourceRowSkip);
              destinationIndex = destinationIndex + (width + destinationRowSkip);
              rowIntersectsMask = false;
            }
            else {
              sourceIndex = sourceIndex + clippedToMask;
              remainingWidth = remainingWidth - clippedToMask;
              destinationIndex = destinationIndex + clippedToMask;
            }
          } else {
            clippedToMask = relativeLeft - maskStart;
            if (clippedToMask >= maskWidth) {
              sourceIndex = sourceIndex + (width + sourceRowSkip);
              destinationIndex = destinationIndex + (width + destinationRowSkip);
              rowIntersectsMask = false;
            }
            else {
              maskWidth = maskWidth - clippedToMask;
            }
          }
          if (rowIntersectsMask) {
            rightSkip = 0;
            if (remainingWidth >= maskWidth) {
              rightSkip = remainingWidth - maskWidth;
            } else {
              maskWidth = remainingWidth;
            }
            for (column = -maskWidth; column < 0; column++) {
              if (source[sourceIndex++] == 0) {
                destinationIndex++;
              } else {
                pixelIndex = destinationIndex;
                destinationIndex++;
                SoftwareRaster.pixels[pixelIndex] = colour;
              }
            }
            sourceIndex = sourceIndex + (rightSkip + sourceRowSkip);
            destinationIndex = destinationIndex + (rightSkip + destinationRowSkip);
          }
        }
    }

    final void drawGlyphWithAlpha(int glyph, int left, int top, int width, int height, int colour, int alpha, boolean shadow) {
        int clippedTop = 0;
        int destinationIndex = left + top * SoftwareRaster.width;
        int destinationRowSkip = SoftwareRaster.width - width;
        int sourceRowSkip = 0;
        int sourceIndex = 0;
        int clippedLeft;
        int clippedRight;
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
        if (width <= 0 ||
          height <= 0) {
          return;
        }
        BinaryBitmapFont.blitBinaryGlyphWithAlpha(SoftwareRaster.pixels, this.glyphMasks[glyph], colour, sourceIndex, destinationIndex, width, height, destinationRowSkip, sourceRowSkip, alpha);
    }

    final static void blitBinaryGlyphWithAlpha(int[] destination, byte[] source, int colour, int sourceIndex, int destinationIndex, int width, int height, int destinationRowSkip, int sourceRowSkip, int alpha) {
        int row = 0;
        int column = 0;
        int pixelIndex = 0;
        int background;
        colour = ((colour & 16711935) * alpha & -16711936) + ((colour & 65280) * alpha & 16711680) >> 8;
        alpha = 256 - alpha;
        for (row = -height; row < 0; row++) {
          for (column = -width; column < 0; column++) {
            if (source[sourceIndex++] == 0) {
              destinationIndex++;
            } else {
              background = destination[destinationIndex];
              pixelIndex = destinationIndex;
              destinationIndex++;
              destination[pixelIndex] = (((background & 16711935) * alpha & -16711936) + ((background & 65280) * alpha & 16711680) >> 8) + colour;
            }
          }
          destinationIndex = destinationIndex + destinationRowSkip;
          sourceIndex = sourceIndex + sourceRowSkip;
        }
    }

    final static void blitBinaryGlyph(int[] destination, byte[] source, int colour, int sourceIndex, int destinationIndex, int width, int height, int destinationRowSkip, int sourceRowSkip) {
        int row = 0;
        int negativeBlockCount;
        int block;
        int remainderPixel;
        negativeBlockCount = -(width >> 2);
        width = -(width & 3);
        for (row = -height; row < 0; row++) {
          for (block = negativeBlockCount; block < 0; block++) {
            if (source[sourceIndex++] == 0) {
              destinationIndex++;
            } else {
              destination[destinationIndex++] = colour;
            }
            if (source[sourceIndex++] == 0) {
              destinationIndex++;
            } else {
              destination[destinationIndex++] = colour;
            }
            if (source[sourceIndex++] == 0) {
              destinationIndex++;
            } else {
              destination[destinationIndex++] = colour;
            }
            if (source[sourceIndex++] == 0) {
              destinationIndex++;
            } else {
              destination[destinationIndex++] = colour;
            }
          }
          for (remainderPixel = width; remainderPixel < 0; remainderPixel++) {
            if (source[sourceIndex++] == 0) {
              destinationIndex++;
            } else {
              destination[destinationIndex++] = colour;
            }
          }
          destinationIndex = destinationIndex + destinationRowSkip;
          sourceIndex = sourceIndex + sourceRowSkip;
        }
    }

    BinaryBitmapFont(byte[] metrics, int[] glyphOffsetXs, int[] glyphOffsetYs, int[] glyphWidths, int[] glyphHeights, byte[][] glyphMasks) {
        super(metrics, glyphOffsetXs, glyphOffsetYs, glyphWidths, glyphHeights);
        this.glyphMasks = new byte[256][];
        this.glyphMasks = glyphMasks;
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
          if (SoftwareRaster.scanlineMaskStarts == null) {
            BinaryBitmapFont.blitBinaryGlyph(SoftwareRaster.pixels, this.glyphMasks[glyph], colour, sourceIndex, destinationIndex, width, height, destinationRowSkip, sourceRowSkip);
          } else {
            BinaryBitmapFont.blitMaskedGlyph(SoftwareRaster.pixels, this.glyphMasks[glyph], left, top, width, height, colour, sourceIndex, destinationIndex, destinationRowSkip, sourceRowSkip, SoftwareRaster.scanlineMaskStarts, SoftwareRaster.scanlineMaskWidths);
          }
          return;
        }
    }
}
