/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AlphaFont extends TextFont {
    private byte[][] glyphCoverage;

    final void drawGlyph(int glyphId, int x, int y, int width, int height, int paint, boolean shadow) {
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var12Lifetime1;
        int var12Lifetime2;
        var8 = x + y * Rasterizer2D.width;
        var9 = Rasterizer2D.width - width;
        var10 = 0;
        var11 = 0;
        if (y < Rasterizer2D.clipTop) {
          var12 = Rasterizer2D.clipTop - y;
          height = height - var12;
          y = Rasterizer2D.clipTop;
          var11 = var11 + var12 * width;
          var8 = var8 + var12 * Rasterizer2D.width;
        }
        if (y + height > Rasterizer2D.clipBottom) {
          height = height - (y + height - Rasterizer2D.clipBottom);
        }
        if (x < Rasterizer2D.clipLeft) {
          var12Lifetime1 = Rasterizer2D.clipLeft - x;
          width = width - var12Lifetime1;
          x = Rasterizer2D.clipLeft;
          var11 = var11 + var12Lifetime1;
          var8 = var8 + var12Lifetime1;
          var10 = var10 + var12Lifetime1;
          var9 = var9 + var12Lifetime1;
        }
        if (x + width > Rasterizer2D.clipRight) {
          var12Lifetime2 = x + width - Rasterizer2D.clipRight;
          width = width - var12Lifetime2;
          var10 = var10 + var12Lifetime2;
          var9 = var9 + var12Lifetime2;
        }
        if (width > 0 &&
          height > 0) {
          if (!shadow) {
            AlphaFont.a(Rasterizer2D.pixels, this.glyphCoverage[glyphId], paint, var11, var8, width, height, var9, var10);
          } else {
            hl.a(Rasterizer2D.pixels, this.glyphCoverage[glyphId], paint, var11, var8, width, height, var9, var10);
          }
          return;
        }
    }

    final void drawGlyphAlpha(int glyphId, int x, int y, int width, int height, int paint, int alpha, boolean shadow) {
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var13Lifetime1;
        int var13Lifetime2;
        var9 = x + y * Rasterizer2D.width;
        var10 = Rasterizer2D.width - width;
        var11 = 0;
        var12 = 0;
        if (y < Rasterizer2D.clipTop) {
          var13 = Rasterizer2D.clipTop - y;
          height = height - var13;
          y = Rasterizer2D.clipTop;
          var12 = var12 + var13 * width;
          var9 = var9 + var13 * Rasterizer2D.width;
        }
        if (y + height > Rasterizer2D.clipBottom) {
          height = height - (y + height - Rasterizer2D.clipBottom);
        }
        if (x < Rasterizer2D.clipLeft) {
          var13Lifetime1 = Rasterizer2D.clipLeft - x;
          width = width - var13Lifetime1;
          x = Rasterizer2D.clipLeft;
          var12 = var12 + var13Lifetime1;
          var9 = var9 + var13Lifetime1;
          var11 = var11 + var13Lifetime1;
          var10 = var10 + var13Lifetime1;
        }
        if (x + width > Rasterizer2D.clipRight) {
          var13Lifetime2 = x + width - Rasterizer2D.clipRight;
          width = width - var13Lifetime2;
          var11 = var11 + var13Lifetime2;
          var10 = var10 + var13Lifetime2;
        }
        if (width > 0 &&
          height > 0) {
          if (!shadow) {
            AlphaFont.a(Rasterizer2D.pixels, this.glyphCoverage[glyphId], paint, var12, var9, width, height, var10, var11, alpha);
          } else {
            hl.a(Rasterizer2D.pixels, this.glyphCoverage[glyphId], paint, var12, var9, width, height, var10, var11, alpha);
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
        var2 = glyphData;
        for (var3Lifetime1 = 0; var3Lifetime1 < var2.length; var3Lifetime1++) {
          var4 = var2[var3Lifetime1];
          for (var5 = 0; var5 < var4.length; var5++) {
            var6 = var4[var5];
            if (var6 != 0) {
              var4[var5] = (byte)palette[var6];
            }
          }
        }
        return glyphData;
    }

    private final static void a(int[] param0, byte[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int var10 = 0;
        int var11 = 0;
        int incrementValue$11 = 0;
        int incrementValue$12 = 0;
        int var12;
        int var13;
        int var14;
        for (var10 = -param6; var10 < 0; var10++) {
          for (var11 = -param5; var11 < 0; var11++) {
            incrementValue$11 = param3;
            param3++;
            var12 = (255 & param1[incrementValue$11]) * param9 >> 8;
            if (var12 == 0) {
              param4++;
            } else {
              var13 = ((param2 & 16711935) * var12 & -16711936) + ((param2 & 65280) * var12 & 16711680) >> 8;
              var12 = 256 - var12;
              var14 = param0[param4];
              incrementValue$12 = param4;
              param4++;
              param0[incrementValue$12] = (((var14 & 16711935) * var12 & -16711936) + ((var14 & 65280) * var12 & 16711680) >> 8) + var13;
            }
          }
          param4 = param4 + param7;
          param3 = param3 + param8;
        }
    }

    private final static void a(int[] param0, byte[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var9 = 0;
        int var10 = 0;
        int incrementValue$11 = 0;
        int incrementValue$12 = 0;
        int var11;
        int var12;
        int var13;
        for (var9 = -param6; var9 < 0; var9++) {
          for (var10 = -param5; var10 < 0; var10++) {
            incrementValue$11 = param3;
            param3++;
            var11 = 255 & param1[incrementValue$11];
            if (var11 == 0) {
              param4++;
            } else {
              var12 = ((param2 & 16711935) * var11 & -16711936) + ((param2 & 65280) * var11 & 16711680) >> 8;
              var11 = 256 - var11;
              var13 = param0[param4];
              incrementValue$12 = param4;
              param4++;
              param0[incrementValue$12] = (((var13 & 16711935) * var11 & -16711936) + ((var13 & 65280) * var11 & 16711680) >> 8) + var12;
            }
          }
          param4 = param4 + param7;
          param3 = param3 + param8;
        }
    }
}
