/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MonochromeBitmapFont extends BitmapFont {
    private byte[][] glyphMasks;

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
        if ((width > 0) &&
            (height > 0)) {
          if (SoftwareRasterizer.scanlineMaskStarts == null) {
            MonochromeBitmapFont.blitGlyphMask(SoftwareRasterizer.framebuffer, this.glyphMasks[glyphIndex], color, sourceIndex, destinationIndex, width, height, destinationRowSkip, sourceRowSkip);
          } else {
            MonochromeBitmapFont.blitGlyphThroughScanlineMask(SoftwareRasterizer.framebuffer, this.glyphMasks[glyphIndex], x, y, width, height, color, sourceIndex, destinationIndex, destinationRowSkip, sourceRowSkip, SoftwareRasterizer.scanlineMaskStarts, SoftwareRasterizer.scanlineMaskWidths);
          }
          return;
        }
    }

    private final static void blitGlyphThroughScanlineMask(int[] unusedDestinationPixels, byte[] glyphMask, int x, int y, int width, int height, int color, int sourceIndex, int destinationIndex, int destinationRowSkip, int sourceRowSkip, int[] maskStarts, int[] maskWidths) {
        int destinationIndexBeforeIncrement = 0;
        int glyphLeftRelativeToClip;
        int glyphTopRelativeToClip;
        int maskRow;
        int maskStartRelativeToClip;
        int maskWidth;
        int availableGlyphWidth;
        int leadingClipOrTrailingSkip;
        int negativePixelCounter;
        glyphLeftRelativeToClip = x - SoftwareRasterizer.clipLeft;
        glyphTopRelativeToClip = y - SoftwareRasterizer.clipTop;
        maskRow = glyphTopRelativeToClip;
        L0: while (true) {
          if (maskRow >= glyphTopRelativeToClip + height) {
            return;
          }
          maskStartRelativeToClip = maskStarts[maskRow];
          maskWidth = maskWidths[maskRow];
          availableGlyphWidth = width;
          if (glyphLeftRelativeToClip <= maskStartRelativeToClip) {
            leadingClipOrTrailingSkip = maskStartRelativeToClip - glyphLeftRelativeToClip;
            if (leadingClipOrTrailingSkip >= width) {
              sourceIndex = sourceIndex + (width + sourceRowSkip);
              destinationIndex = destinationIndex + (width + destinationRowSkip);
              maskRow++;
              continue;
            }
            sourceIndex = sourceIndex + leadingClipOrTrailingSkip;
            availableGlyphWidth = availableGlyphWidth - leadingClipOrTrailingSkip;
            destinationIndex = destinationIndex + leadingClipOrTrailingSkip;
          } else {
            leadingClipOrTrailingSkip = glyphLeftRelativeToClip - maskStartRelativeToClip;
            if (leadingClipOrTrailingSkip >= maskWidth) {
              sourceIndex = sourceIndex + (width + sourceRowSkip);
              destinationIndex = destinationIndex + (width + destinationRowSkip);
              maskRow++;
              continue;
            }
            maskWidth = maskWidth - leadingClipOrTrailingSkip;
          }
          leadingClipOrTrailingSkip = 0;
          if (availableGlyphWidth >= maskWidth) {
            leadingClipOrTrailingSkip = availableGlyphWidth - maskWidth;
          } else {
            maskWidth = availableGlyphWidth;
          }
          negativePixelCounter = -maskWidth;
          while (true) {
            if (negativePixelCounter >= 0) {
              sourceIndex = sourceIndex + (leadingClipOrTrailingSkip + sourceRowSkip);
              destinationIndex = destinationIndex + (leadingClipOrTrailingSkip + destinationRowSkip);
              maskRow++;
              continue L0;
            }
            if (glyphMask[sourceIndex++] == 0) {
              destinationIndex++;
              negativePixelCounter++;
              continue;
            }
            destinationIndexBeforeIncrement = destinationIndex;
            destinationIndex++;
            SoftwareRasterizer.framebuffer[destinationIndexBeforeIncrement] = color;
            negativePixelCounter++;
            continue;
          }
        }
    }

    final void drawGlyphAlpha(int glyphIndex, int x, int y, int width, int height, int color, int alpha256, boolean shadowPass) {
        int clippedPixels = 0;
        int destinationIndex = x + y * SoftwareRasterizer.stride;
        int destinationRowSkip = SoftwareRasterizer.stride - width;
        int sourceRowSkip = 0;
        int sourceIndex = 0;
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
        if (width <= 0 || height <= 0) {
            return;
        }
        MonochromeBitmapFont.blitGlyphMaskAlpha(SoftwareRasterizer.framebuffer, this.glyphMasks[glyphIndex], color, sourceIndex, destinationIndex, width, height, destinationRowSkip, sourceRowSkip, alpha256);
    }

    MonochromeBitmapFont(byte[] metrics, int[] xOffsets, int[] yOffsets, int[] widths, int[] heights, byte[][] masks) {
        super(metrics, xOffsets, yOffsets, widths, heights);
        this.glyphMasks = new byte[256][];
        this.glyphMasks = masks;
    }

    final static void blitGlyphMask(int[] destinationPixels, byte[] glyphMask, int color, int sourceIndex, int destinationIndex, int widthOrNegativeTailCount, int height, int destinationRowSkip, int sourceRowSkip) {
        int negativeFourPixelGroupCount;
        int negativeRowCounter;
        int negativeGroupOrTailCounter;
        negativeFourPixelGroupCount = -(widthOrNegativeTailCount >> 2);
        widthOrNegativeTailCount = -(widthOrNegativeTailCount & 3);
        negativeRowCounter = -height;
        L0: while (true) {
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
                  continue L0;
                }
                if (glyphMask[sourceIndex++] == 0) {
                  destinationIndex++;
                  negativeGroupOrTailCounter++;
                  continue;
                }
                destinationPixels[destinationIndex++] = color;
                negativeGroupOrTailCounter++;
                continue;
              }
            }
            if (glyphMask[sourceIndex++] == 0) {
              destinationIndex++;
            } else {
              destinationPixels[destinationIndex++] = color;
            }
            if (glyphMask[sourceIndex++] == 0) {
              destinationIndex++;
            } else {
              destinationPixels[destinationIndex++] = color;
            }
            if (glyphMask[sourceIndex++] == 0) {
              destinationIndex++;
            } else {
              destinationPixels[destinationIndex++] = color;
            }
            if (glyphMask[sourceIndex++] == 0) {
              destinationIndex++;
              negativeGroupOrTailCounter++;
              continue;
            }
            destinationPixels[destinationIndex++] = color;
            negativeGroupOrTailCounter++;
            continue;
          }
        }
    }

    final static void blitGlyphMaskAlpha(int[] destinationPixels, byte[] glyphMask, int colorOrWeightedColor, int sourceIndex, int destinationIndex, int width, int height, int destinationRowSkip, int sourceRowSkip, int alphaOrDestinationWeight256) {
        int destinationIndexBeforeIncrement = 0;
        int negativeRowCounter;
        int negativeColumnCounter;
        int destinationColor;
        colorOrWeightedColor = ((colorOrWeightedColor & 16711935) * alphaOrDestinationWeight256 & -16711936) + ((colorOrWeightedColor & 65280) * alphaOrDestinationWeight256 & 16711680) >> 8;
        alphaOrDestinationWeight256 = 256 - alphaOrDestinationWeight256;
        negativeRowCounter = -height;
        L0: while (true) {
          if (negativeRowCounter >= 0) {
            return;
          }
          negativeColumnCounter = -width;
          while (true) {
            if (negativeColumnCounter >= 0) {
              destinationIndex = destinationIndex + destinationRowSkip;
              sourceIndex = sourceIndex + sourceRowSkip;
              negativeRowCounter++;
              continue L0;
            }
            if (glyphMask[sourceIndex++] == 0) {
              destinationIndex++;
              negativeColumnCounter++;
              continue;
            }
            destinationColor = destinationPixels[destinationIndex];
            destinationIndexBeforeIncrement = destinationIndex;
            destinationIndex++;
            destinationPixels[destinationIndexBeforeIncrement] = (((destinationColor & 16711935) * alphaOrDestinationWeight256 & -16711936) + ((destinationColor & 65280) * alphaOrDestinationWeight256 & 16711680) >> 8) + colorOrWeightedColor;
            negativeColumnCounter++;
            continue;
          }
        }
    }
}
