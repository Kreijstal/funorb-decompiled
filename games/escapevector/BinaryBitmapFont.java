/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class BinaryBitmapFont extends BitmapFont {
    private byte[][] glyphMasks;

    BinaryBitmapFont(byte[] metrics, int[] offsetX, int[] offsetY, int[] widths, int[] heights, byte[][] masks) {
        super(metrics, offsetX, offsetY, widths, heights);
        this.glyphMasks = new byte[256][];
        this.glyphMasks = masks;
    }

    final void drawGlyphAlpha(int glyph, int x, int y, int width, int height, int color, int alpha, boolean shadow) {
        int var9 = x + y * SoftwareRasterizer.width;
        int var10 = SoftwareRasterizer.width - width;
        int var11 = 0;
        int var12 = 0;
        if (y < SoftwareRasterizer.clipTop) {
          int var13 = SoftwareRasterizer.clipTop - y;
          height = height - var13;
          y = SoftwareRasterizer.clipTop;
          var12 = var12 + var13 * width;
          var9 = var9 + var13 * SoftwareRasterizer.width;
        }
        if (y + height > SoftwareRasterizer.clipBottom) {
          height = height - (y + height - SoftwareRasterizer.clipBottom);
        }
        if (x < SoftwareRasterizer.clipLeft) {
          int var13Lifetime1 = SoftwareRasterizer.clipLeft - x;
          width = width - var13Lifetime1;
          x = SoftwareRasterizer.clipLeft;
          var12 = var12 + var13Lifetime1;
          var9 = var9 + var13Lifetime1;
          var11 = var11 + var13Lifetime1;
          var10 = var10 + var13Lifetime1;
        }
        if (x + width > SoftwareRasterizer.clipRight) {
          int var13Lifetime2 = x + width - SoftwareRasterizer.clipRight;
          width = width - var13Lifetime2;
          var11 = var11 + var13Lifetime2;
          var10 = var10 + var13Lifetime2;
        }
        if (width <= 0 ||
          height <= 0) {
          return;
        }
        BinaryBitmapFont.blitMaskAlpha(SoftwareRasterizer.pixels, this.glyphMasks[glyph], color, var12, var9, width, height, var10, var11, alpha);
    }

    final static void blitMaskAlpha(int[] pixels, byte[] mask, int color, int sourceIndex, int destinationIndex, int width, int height, int destinationSkip, int sourceSkip, int alpha) {
        color = ((color & 16711935) * alpha & -16711936) + ((color & 65280) * alpha & 16711680) >> 8;
        alpha = 256 - alpha;
        for (int var10 = -height; var10 < 0; var10++) {
          for (int var11 = -width; var11 < 0; var11++) {
            if (mask[sourceIndex++] == 0) {
              destinationIndex++;
            } else {
              int var12 = pixels[destinationIndex];
              int incrementValue$12 = destinationIndex;
              destinationIndex++;
              pixels[incrementValue$12] = (((var12 & 16711935) * alpha & -16711936) + ((var12 & 65280) * alpha & 16711680) >> 8) + color;
            }
          }
          destinationIndex = destinationIndex + destinationSkip;
          sourceIndex = sourceIndex + sourceSkip;
        }
    }

    final void drawGlyph(int glyph, int x, int y, int width, int height, int color, boolean shadow) {
        int var8 = x + y * SoftwareRasterizer.width;
        int var9 = SoftwareRasterizer.width - width;
        int var10 = 0;
        int var11 = 0;
        if (y < SoftwareRasterizer.clipTop) {
          int var12 = SoftwareRasterizer.clipTop - y;
          height = height - var12;
          y = SoftwareRasterizer.clipTop;
          var11 = var11 + var12 * width;
          var8 = var8 + var12 * SoftwareRasterizer.width;
        }
        if (y + height > SoftwareRasterizer.clipBottom) {
          height = height - (y + height - SoftwareRasterizer.clipBottom);
        }
        if (x < SoftwareRasterizer.clipLeft) {
          int var12Lifetime1 = SoftwareRasterizer.clipLeft - x;
          width = width - var12Lifetime1;
          x = SoftwareRasterizer.clipLeft;
          var11 = var11 + var12Lifetime1;
          var8 = var8 + var12Lifetime1;
          var10 = var10 + var12Lifetime1;
          var9 = var9 + var12Lifetime1;
        }
        if (x + width > SoftwareRasterizer.clipRight) {
          int var12Lifetime2 = x + width - SoftwareRasterizer.clipRight;
          width = width - var12Lifetime2;
          var10 = var10 + var12Lifetime2;
          var9 = var9 + var12Lifetime2;
        }
        if (width > 0 &&
          height > 0) {
          if (SoftwareRasterizer.maskStarts == null) {
            BinaryBitmapFont.blitMask(SoftwareRasterizer.pixels, this.glyphMasks[glyph], color, var11, var8, width, height, var9, var10);
          } else {
            BinaryBitmapFont.blitMaskedGlyph(SoftwareRasterizer.pixels, this.glyphMasks[glyph], x, y, width, height, color, var11, var8, var9, var10, SoftwareRasterizer.maskStarts, SoftwareRasterizer.maskWidths);
          }
          return;
        }
    }

    final static void blitMask(int[] pixels, byte[] mask, int color, int sourceIndex, int destinationIndex, int width, int height, int destinationSkip, int sourceSkip) {
        int var9 = -(width >> 2);
        width = -(width & 3);
        for (int var10 = -height; var10 < 0; var10++) {
          for (int var11 = var9; var11 < 0; var11++) {
            if (mask[sourceIndex++] == 0) {
              destinationIndex++;
            } else {
              pixels[destinationIndex++] = color;
            }
            if (mask[sourceIndex++] == 0) {
              destinationIndex++;
            } else {
              pixels[destinationIndex++] = color;
            }
            if (mask[sourceIndex++] == 0) {
              destinationIndex++;
            } else {
              pixels[destinationIndex++] = color;
            }
            if (mask[sourceIndex++] == 0) {
              destinationIndex++;
            } else {
              pixels[destinationIndex++] = color;
            }
          }
          for (int var11Lifetime1 = width; var11Lifetime1 < 0; var11Lifetime1++) {
            if (mask[sourceIndex++] == 0) {
              destinationIndex++;
            } else {
              pixels[destinationIndex++] = color;
            }
          }
          destinationIndex = destinationIndex + destinationSkip;
          sourceIndex = sourceIndex + sourceSkip;
        }
    }

    private final static void blitMaskedGlyph(int[] pixels, byte[] mask, int x, int y, int width, int height, int color, int sourceIndex, int destinationIndex, int destinationSkip, int sourceSkip, int[] starts, int[] widths) {
        int var19;
        int var13 = x - SoftwareRasterizer.clipLeft;
        int var14 = y - SoftwareRasterizer.clipTop;
        for (int var15 = var14; var15 < var14 + height; var15++) {
          boolean decompiledFrameRemainder0 = true;
          int var16 = starts[var15];
          int var17 = widths[var15];
          int var18 = width;
          if (var13 <= var16) {
            var19 = var16 - var13;
            if (var19 >= width) {
              sourceIndex = sourceIndex + (width + sourceSkip);
              destinationIndex = destinationIndex + (width + destinationSkip);
              decompiledFrameRemainder0 = false;
            }
            else {
              sourceIndex = sourceIndex + var19;
              var18 = var18 - var19;
              destinationIndex = destinationIndex + var19;
            }
          } else {
            var19 = var13 - var16;
            if (var19 >= var17) {
              sourceIndex = sourceIndex + (width + sourceSkip);
              destinationIndex = destinationIndex + (width + destinationSkip);
              decompiledFrameRemainder0 = false;
            }
            else {
              var17 = var17 - var19;
            }
          }
          if (decompiledFrameRemainder0) {
            int var19Lifetime1 = 0;
            if (var18 >= var17) {
              var19Lifetime1 = var18 - var17;
            } else {
              var17 = var18;
            }
            for (int var20 = -var17; var20 < 0; var20++) {
              if (mask[sourceIndex++] == 0) {
                destinationIndex++;
              } else {
                int incrementValue$1 = destinationIndex;
                destinationIndex++;
                SoftwareRasterizer.pixels[incrementValue$1] = color;
              }
            }
            sourceIndex = sourceIndex + (var19Lifetime1 + sourceSkip);
            destinationIndex = destinationIndex + (var19Lifetime1 + destinationSkip);
          }
        }
    }
}
