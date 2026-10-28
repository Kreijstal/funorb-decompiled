/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class CoverageBitmapFont extends BitmapFont {
    private byte[][] glyphCoverage;

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
        if (width > 0 &&
          height > 0) {
          if (!shadow) {
            CoverageBitmapFont.blitCoverageAlpha(SoftwareRasterizer.pixels, this.glyphCoverage[glyph], color, var12, var9, width, height, var10, var11, alpha);
          } else {
            BinaryBitmapFont.blitMaskAlpha(SoftwareRasterizer.pixels, this.glyphCoverage[glyph], color, var12, var9, width, height, var10, var11, alpha);
          }
          return;
        }
    }

    private final static void blitCoverageAlpha(int[] pixels, byte[] mask, int color, int sourceIndex, int destinationIndex, int width, int height, int destinationSkip, int sourceSkip, int alpha) {
        for (int var10 = -height; var10 < 0; var10++) {
          for (int var11 = -width; var11 < 0; var11++) {
            int incrementValue$11 = sourceIndex;
            sourceIndex++;
            int var12 = (255 & mask[incrementValue$11]) * alpha >> 8;
            if (var12 == 0) {
              destinationIndex++;
            } else {
              int var13 = ((color & 16711935) * var12 & -16711936) + ((color & 65280) * var12 & 16711680) >> 8;
              var12 = 256 - var12;
              int var14 = pixels[destinationIndex];
              int incrementValue$12 = destinationIndex;
              destinationIndex++;
              pixels[incrementValue$12] = (((var14 & 16711935) * var12 & -16711936) + ((var14 & 65280) * var12 & 16711680) >> 8) + var13;
            }
          }
          destinationIndex = destinationIndex + destinationSkip;
          sourceIndex = sourceIndex + sourceSkip;
        }
    }

    private final static byte[][] convertPaletteToCoverage(int[] palette, byte[][] glyphPixels) {
        for (int var2_int = 0; var2_int < palette.length; var2_int++) {
          int var3 = palette[var2_int];
          int var4_int = (var3 >> 15 & 510) + (var3 & 255);
          palette[var2_int] = var4_int / 3 + (var3 >> 8 & 255) >> 1;
        }
        byte[][] var2 = glyphPixels;
        for (int var3Lifetime1 = 0; var3Lifetime1 < var2.length; var3Lifetime1++) {
          byte[] var4 = var2[var3Lifetime1];
          for (int var5 = 0; var5 < var4.length; var5++) {
            int var6 = var4[var5];
            if (var6 != 0) {
              var4[var5] = (byte)palette[var6];
            }
          }
        }
        return glyphPixels;
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
          if (!shadow) {
            CoverageBitmapFont.blitCoverage(SoftwareRasterizer.pixels, this.glyphCoverage[glyph], color, var11, var8, width, height, var9, var10);
          } else {
            BinaryBitmapFont.blitMask(SoftwareRasterizer.pixels, this.glyphCoverage[glyph], color, var11, var8, width, height, var9, var10);
          }
          return;
        }
    }

    CoverageBitmapFont(byte[] metrics, int[] offsetX, int[] offsetY, int[] widths, int[] heights, int[] palette, byte[][] glyphPixels) {
        super(metrics, offsetX, offsetY, widths, heights);
        this.glyphCoverage = new byte[256][];
        this.glyphCoverage = CoverageBitmapFont.convertPaletteToCoverage(palette, glyphPixels);
    }

    private final static void blitCoverage(int[] pixels, byte[] mask, int color, int sourceIndex, int destinationIndex, int width, int height, int destinationSkip, int sourceSkip) {
        for (int var9 = -height; var9 < 0; var9++) {
          for (int var10 = -width; var10 < 0; var10++) {
            int incrementValue$11 = sourceIndex;
            sourceIndex++;
            int var11 = 255 & mask[incrementValue$11];
            if (var11 == 0) {
              destinationIndex++;
            } else {
              int var12 = ((color & 16711935) * var11 & -16711936) + ((color & 65280) * var11 & 16711680) >> 8;
              var11 = 256 - var11;
              int var13 = pixels[destinationIndex];
              int incrementValue$12 = destinationIndex;
              destinationIndex++;
              pixels[incrementValue$12] = (((var13 & 16711935) * var11 & -16711936) + ((var13 & 65280) * var11 & 16711680) >> 8) + var12;
            }
          }
          destinationIndex = destinationIndex + destinationSkip;
          sourceIndex = sourceIndex + sourceSkip;
        }
    }
}
