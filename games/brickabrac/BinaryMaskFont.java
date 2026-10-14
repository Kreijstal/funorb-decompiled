/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class BinaryMaskFont extends TextFont {
    private byte[][] glyphMasks;

    final void drawGlyphAlpha(int glyphId, int x, int y, int width, int height, int paint, int alpha, boolean shadow) {
        int clippedTopRows = 0;
        int destinationIndex = x + y * Rasterizer2D.width;
        int destinationRowSkip = Rasterizer2D.width - width;
        int sourceRowSkip = 0;
        int sourceIndex = 0;
        int clippedLeftColumns;
        int clippedRightColumns;
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
        if (width <= 0 ||
          height <= 0) {
          return;
        }
        BinaryMaskFont.blitMaskAlpha(Rasterizer2D.pixels, this.glyphMasks[glyphId], paint, sourceIndex, destinationIndex, width, height, destinationRowSkip, sourceRowSkip, alpha);
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
          if (Rasterizer2D.scanlineMaskOffsets == null) {
            BinaryMaskFont.blitMask(Rasterizer2D.pixels, this.glyphMasks[glyphId], paint, sourceIndex, destinationIndex, width, height, destinationRowSkip, sourceRowSkip);
          } else {
            BinaryMaskFont.blitMaskWithinScanlines(Rasterizer2D.pixels, this.glyphMasks[glyphId], x, y, width, height, paint, sourceIndex, destinationIndex, destinationRowSkip, sourceRowSkip, Rasterizer2D.scanlineMaskOffsets, Rasterizer2D.scanlineMaskWidths);
          }
          return;
        }
    }

    final static void blitMask(int[] destination, byte[] mask, int paint, int sourceIndex, int destinationIndex, int width, int height, int destinationRowSkip, int sourceRowSkip) {
        int negativeRow = 0;
        int negativeFourPixelGroups;
        int negativeGroup;
        int negativeTailPixel;
        negativeFourPixelGroups = -(width >> 2);
        width = -(width & 3);
        for (negativeRow = -height; negativeRow < 0; negativeRow++) {
          for (negativeGroup = negativeFourPixelGroups; negativeGroup < 0; negativeGroup++) {
            if (mask[sourceIndex++] == 0) {
              destinationIndex++;
            } else {
              destination[destinationIndex++] = paint;
            }
            if (mask[sourceIndex++] == 0) {
              destinationIndex++;
            } else {
              destination[destinationIndex++] = paint;
            }
            if (mask[sourceIndex++] == 0) {
              destinationIndex++;
            } else {
              destination[destinationIndex++] = paint;
            }
            if (mask[sourceIndex++] == 0) {
              destinationIndex++;
            } else {
              destination[destinationIndex++] = paint;
            }
          }
          for (negativeTailPixel = width; negativeTailPixel < 0; negativeTailPixel++) {
            if (mask[sourceIndex++] == 0) {
              destinationIndex++;
            } else {
              destination[destinationIndex++] = paint;
            }
          }
          destinationIndex = destinationIndex + destinationRowSkip;
          sourceIndex = sourceIndex + sourceRowSkip;
        }
    }

    private final static void blitMaskWithinScanlines(int[] unusedDestination, byte[] mask, int x, int y, int width, int height, int paint, int sourceIndex, int destinationIndex, int destinationRowSkip, int sourceRowSkip, int[] rowOffsets, int[] rowWidths) {
        int maskRow = 0;
        int negativeColumn = 0;
        int pixelIndex = 0;
        int relativeX;
        int relativeY;
        int spanStart;
        int spanWidth;
        int remainingGlyphWidth;
        int leftTrim;
        int rightTrim;
        relativeX = x - Rasterizer2D.clipLeft;
        relativeY = y - Rasterizer2D.clipTop;
        for (maskRow = relativeY; maskRow < relativeY + height; maskRow++) {
          boolean rowIntersectsSpan = true;
          spanStart = rowOffsets[maskRow];
          spanWidth = rowWidths[maskRow];
          remainingGlyphWidth = width;
          if (relativeX <= spanStart) {
            leftTrim = spanStart - relativeX;
            if (leftTrim >= width) {
              sourceIndex = sourceIndex + (width + sourceRowSkip);
              destinationIndex = destinationIndex + (width + destinationRowSkip);
              rowIntersectsSpan = false;
            }
            else {
              sourceIndex = sourceIndex + leftTrim;
              remainingGlyphWidth = remainingGlyphWidth - leftTrim;
              destinationIndex = destinationIndex + leftTrim;
            }
          } else {
            leftTrim = relativeX - spanStart;
            if (leftTrim >= spanWidth) {
              sourceIndex = sourceIndex + (width + sourceRowSkip);
              destinationIndex = destinationIndex + (width + destinationRowSkip);
              rowIntersectsSpan = false;
            }
            else {
              spanWidth = spanWidth - leftTrim;
            }
          }
          if (rowIntersectsSpan) {
            rightTrim = 0;
            if (remainingGlyphWidth >= spanWidth) {
              rightTrim = remainingGlyphWidth - spanWidth;
            } else {
              spanWidth = remainingGlyphWidth;
            }
            for (negativeColumn = -spanWidth; negativeColumn < 0; negativeColumn++) {
              if (mask[sourceIndex++] == 0) {
                destinationIndex++;
              } else {
                pixelIndex = destinationIndex;
                destinationIndex++;
                Rasterizer2D.pixels[pixelIndex] = paint;
              }
            }
            sourceIndex = sourceIndex + (rightTrim + sourceRowSkip);
            destinationIndex = destinationIndex + (rightTrim + destinationRowSkip);
          }
        }
    }

    final static void blitMaskAlpha(int[] destination, byte[] mask, int paint, int sourceIndex, int destinationIndex, int width, int height, int destinationRowSkip, int sourceRowSkip, int alpha) {
        int negativeRow = 0;
        int negativeColumn = 0;
        int pixelIndex = 0;
        int background;
        paint = ((paint & 16711935) * alpha & -16711936) + ((paint & 65280) * alpha & 16711680) >> 8;
        alpha = 256 - alpha;
        for (negativeRow = -height; negativeRow < 0; negativeRow++) {
          for (negativeColumn = -width; negativeColumn < 0; negativeColumn++) {
            if (mask[sourceIndex++] == 0) {
              destinationIndex++;
            } else {
              background = destination[destinationIndex];
              pixelIndex = destinationIndex;
              destinationIndex++;
              destination[pixelIndex] = (((background & 16711935) * alpha & -16711936) + ((background & 65280) * alpha & 16711680) >> 8) + paint;
            }
          }
          destinationIndex = destinationIndex + destinationRowSkip;
          sourceIndex = sourceIndex + sourceRowSkip;
        }
    }

    BinaryMaskFont(byte[] metrics, int[] glyphOffsetX, int[] glyphOffsetY, int[] glyphWidths, int[] glyphHeights, byte[][] glyphMasks) {
        super(metrics, glyphOffsetX, glyphOffsetY, glyphWidths, glyphHeights);
        this.glyphMasks = new byte[256][];
        this.glyphMasks = glyphMasks;
    }
}
