/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LegacyAlphaFont extends LegacyBitmapFont {
    private byte[][] glyphCoverage;

    final void drawGlyph(int glyph, int x, int y, int width, int height, int color, boolean shadow) {
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var12Lifetime1;
        int var12Lifetime2;
        var8 = x + y * SoftwareRasterizer.width;
        var9 = SoftwareRasterizer.width - width;
        var10 = 0;
        var11 = 0;
        if (y < SoftwareRasterizer.clipTop) {
          var12 = SoftwareRasterizer.clipTop - y;
          height = height - var12;
          y = SoftwareRasterizer.clipTop;
          var11 = var11 + var12 * width;
          var8 = var8 + var12 * SoftwareRasterizer.width;
        }
        if (y + height > SoftwareRasterizer.clipBottom) {
          height = height - (y + height - SoftwareRasterizer.clipBottom);
        }
        if (x < SoftwareRasterizer.clipLeft) {
          var12Lifetime1 = SoftwareRasterizer.clipLeft - x;
          width = width - var12Lifetime1;
          x = SoftwareRasterizer.clipLeft;
          var11 = var11 + var12Lifetime1;
          var8 = var8 + var12Lifetime1;
          var10 = var10 + var12Lifetime1;
          var9 = var9 + var12Lifetime1;
        }
        if (x + width > SoftwareRasterizer.clipRight) {
          var12Lifetime2 = x + width - SoftwareRasterizer.clipRight;
          width = width - var12Lifetime2;
          var10 = var10 + var12Lifetime2;
          var9 = var9 + var12Lifetime2;
        }
        if (width > 0 &&
          height > 0) {
          if (!shadow) {
            LegacyAlphaFont.blitCoverage(SoftwareRasterizer.pixels, this.glyphCoverage[glyph], color, var11, var8, width, height, var9, var10);
          } else {
            LegacyBinaryFont.blitBinaryMask(SoftwareRasterizer.pixels, this.glyphCoverage[glyph], color, var11, var8, width, height, var9, var10);
          }
          return;
        }
    }

    LegacyAlphaFont(byte[] metrics, int[] offsetsX, int[] offsetsY, int[] widths, int[] heights, int[] palette, byte[][] glyphs) {
        super(metrics, offsetsX, offsetsY, widths, heights);
        this.glyphCoverage = new byte[256][];
        this.glyphCoverage = LegacyAlphaFont.convertPaletteIndicesToCoverage(palette, glyphs);
    }

    private final static void blitCoverage(int[] destination, byte[] coverage, int color, int sourceOffset, int destinationOffset, int width, int height, int destinationStride, int sourceStride) {
        int var9 = 0;
        int var10 = 0;
        int incrementValue$11 = 0;
        int incrementValue$12 = 0;
        int var11;
        int var12;
        int var13;
        for (var9 = -height; var9 < 0; var9++) {
          for (var10 = -width; var10 < 0; var10++) {
            incrementValue$11 = sourceOffset;
            sourceOffset++;
            var11 = 255 & coverage[incrementValue$11];
            if (var11 == 0) {
              destinationOffset++;
            } else {
              var12 = ((color & 16711935) * var11 & -16711936) + ((color & 65280) * var11 & 16711680) >> 8;
              var11 = 256 - var11;
              var13 = destination[destinationOffset];
              incrementValue$12 = destinationOffset;
              destinationOffset++;
              destination[incrementValue$12] = (((var13 & 16711935) * var11 & -16711936) + ((var13 & 65280) * var11 & 16711680) >> 8) + var12;
            }
          }
          destinationOffset = destinationOffset + destinationStride;
          sourceOffset = sourceOffset + sourceStride;
        }
    }

    private final static void blitCoverageAlpha(int[] destination, byte[] coverage, int color, int sourceOffset, int destinationOffset, int width, int height, int destinationStride, int sourceStride, int opacity) {
        int var10 = 0;
        int var11 = 0;
        int incrementValue$11 = 0;
        int incrementValue$12 = 0;
        int var12;
        int var13;
        int var14;
        for (var10 = -height; var10 < 0; var10++) {
          for (var11 = -width; var11 < 0; var11++) {
            incrementValue$11 = sourceOffset;
            sourceOffset++;
            var12 = (255 & coverage[incrementValue$11]) * opacity >> 8;
            if (var12 == 0) {
              destinationOffset++;
            } else {
              var13 = ((color & 16711935) * var12 & -16711936) + ((color & 65280) * var12 & 16711680) >> 8;
              var12 = 256 - var12;
              var14 = destination[destinationOffset];
              incrementValue$12 = destinationOffset;
              destinationOffset++;
              destination[incrementValue$12] = (((var14 & 16711935) * var12 & -16711936) + ((var14 & 65280) * var12 & 16711680) >> 8) + var13;
            }
          }
          destinationOffset = destinationOffset + destinationStride;
          sourceOffset = sourceOffset + sourceStride;
        }
    }

    final void drawGlyphAlpha(int glyph, int x, int y, int width, int height, int color, int opacity, boolean shadow) {
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var13Lifetime1;
        int var13Lifetime2;
        var9 = x + y * SoftwareRasterizer.width;
        var10 = SoftwareRasterizer.width - width;
        var11 = 0;
        var12 = 0;
        if (y < SoftwareRasterizer.clipTop) {
          var13 = SoftwareRasterizer.clipTop - y;
          height = height - var13;
          y = SoftwareRasterizer.clipTop;
          var12 = var12 + var13 * width;
          var9 = var9 + var13 * SoftwareRasterizer.width;
        }
        if (y + height > SoftwareRasterizer.clipBottom) {
          height = height - (y + height - SoftwareRasterizer.clipBottom);
        }
        if (x < SoftwareRasterizer.clipLeft) {
          var13Lifetime1 = SoftwareRasterizer.clipLeft - x;
          width = width - var13Lifetime1;
          x = SoftwareRasterizer.clipLeft;
          var12 = var12 + var13Lifetime1;
          var9 = var9 + var13Lifetime1;
          var11 = var11 + var13Lifetime1;
          var10 = var10 + var13Lifetime1;
        }
        if (x + width > SoftwareRasterizer.clipRight) {
          var13Lifetime2 = x + width - SoftwareRasterizer.clipRight;
          width = width - var13Lifetime2;
          var11 = var11 + var13Lifetime2;
          var10 = var10 + var13Lifetime2;
        }
        if (width > 0 &&
          height > 0) {
          if (!shadow) {
            LegacyAlphaFont.blitCoverageAlpha(SoftwareRasterizer.pixels, this.glyphCoverage[glyph], color, var12, var9, width, height, var10, var11, opacity);
          } else {
            LegacyBinaryFont.blitBinaryMaskAlpha(SoftwareRasterizer.pixels, this.glyphCoverage[glyph], color, var12, var9, width, height, var10, var11, opacity);
          }
          return;
        }
    }

    private final static byte[][] convertPaletteIndicesToCoverage(int[] palette, byte[][] glyphs) {
        int var2_int = 0;
        int var5 = 0;
        byte[][] var2;
        int var3;
        int var4_int;
        byte[] var4;
        int var6;
        int var3Lifetime1;
        for (var2_int = 0; var2_int < palette.length; var2_int++) {
          var3 = palette[var2_int];
          var4_int = (var3 >> 15 & 510) + (var3 & 255);
          palette[var2_int] = var4_int / 3 + (var3 >> 8 & 255) >> 1;
        }
        var2 = glyphs;
        for (var3Lifetime1 = 0; var3Lifetime1 < var2.length; var3Lifetime1++) {
          var4 = var2[var3Lifetime1];
          for (var5 = 0; var5 < var4.length; var5++) {
            var6 = var4[var5];
            if (var6 != 0) {
              var4[var5] = (byte)palette[var6];
            }
          }
        }
        return glyphs;
    }
}
