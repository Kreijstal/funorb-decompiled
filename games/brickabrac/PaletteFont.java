/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PaletteFont extends TextFont {
    private byte[][] glyphIndices;
    int[][] palettes;

    private final static void a(int param0, int[] param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10) {
        int var12 = 0;
        int var13 = 0;
        int incrementValue$16 = 0;
        byte dupTemp$17 = 0;
        int incrementValue$18 = 0;
        int var11;
        int var14;
        int var15;
        var11 = 256 - param10;
        for (var12 = -param7; var12 < 0; var12++) {
          for (var13 = -param6; var13 < 0; var13++) {
            incrementValue$16 = param4;
            param4++;
            dupTemp$17 = param2[incrementValue$16];
            param0 = dupTemp$17;
            if (dupTemp$17 == 0) {
              param5++;
            } else {
              var14 = param1[param5];
              var15 = param3[param0 & 255];
              incrementValue$18 = param5;
              param5++;
              param1[incrementValue$18] = ((var15 & 16711935) * param10 + (var14 & 16711935) * var11 & -16711936) + ((var15 & 65280) * param10 + (var14 & 65280) * var11 & 16711680) >> 8;
            }
          }
          param5 = param5 + param8;
          param4 = param4 + param9;
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
            PaletteFont.a(0, Rasterizer2D.pixels, this.glyphIndices[glyphId], this.palettes[paint], var12, var9, width, height, var10, var11, alpha);
          } else {
            hl.a(Rasterizer2D.pixels, this.glyphIndices[glyphId], paint, var12, var9, width, height, var10, var11, alpha);
          }
          return;
        }
    }

    private final static void a(int param0, int[] param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int var11 = 0;
        int incrementValue$3 = 0;
        byte dupTemp$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        byte dupTemp$7 = 0;
        int incrementValue$8 = 0;
        int incrementValue$9 = 0;
        byte dupTemp$10 = 0;
        int incrementValue$11 = 0;
        int incrementValue$12 = 0;
        byte dupTemp$13 = 0;
        int incrementValue$14 = 0;
        int incrementValue$0 = 0;
        byte dupTemp$1 = 0;
        int incrementValue$2 = 0;
        int var10;
        int var12;
        int var12Lifetime1;
        var10 = -(param6 >> 2);
        param6 = -(param6 & 3);
        for (var11 = -param7; var11 < 0; var11++) {
          for (var12 = var10; var12 < 0; var12++) {
            incrementValue$3 = param4;
            param4++;
            dupTemp$4 = param2[incrementValue$3];
            param0 = dupTemp$4;
            if (dupTemp$4 == 0) {
              param5++;
            } else {
              incrementValue$5 = param5;
              param5++;
              param1[incrementValue$5] = param3[param0 & 255];
            }
            incrementValue$6 = param4;
            param4++;
            dupTemp$7 = param2[incrementValue$6];
            param0 = dupTemp$7;
            if (dupTemp$7 == 0) {
              param5++;
            } else {
              incrementValue$8 = param5;
              param5++;
              param1[incrementValue$8] = param3[param0 & 255];
            }
            incrementValue$9 = param4;
            param4++;
            dupTemp$10 = param2[incrementValue$9];
            param0 = dupTemp$10;
            if (dupTemp$10 == 0) {
              param5++;
            } else {
              incrementValue$11 = param5;
              param5++;
              param1[incrementValue$11] = param3[param0 & 255];
            }
            incrementValue$12 = param4;
            param4++;
            dupTemp$13 = param2[incrementValue$12];
            param0 = dupTemp$13;
            if (dupTemp$13 == 0) {
              param5++;
            } else {
              incrementValue$14 = param5;
              param5++;
              param1[incrementValue$14] = param3[param0 & 255];
            }
          }
          for (var12Lifetime1 = param6; var12Lifetime1 < 0; var12Lifetime1++) {
            incrementValue$0 = param4;
            param4++;
            dupTemp$1 = param2[incrementValue$0];
            param0 = dupTemp$1;
            if (dupTemp$1 == 0) {
              param5++;
            } else {
              incrementValue$2 = param5;
              param5++;
              param1[incrementValue$2] = param3[param0 & 255];
            }
          }
          param5 = param5 + param8;
          param4 = param4 + param9;
        }
    }

    PaletteFont(byte[] metrics, int[] glyphOffsetX, int[] glyphOffsetY, int[] glyphWidths, int[] glyphHeights, int[] palette, byte[][] glyphData) {
        super(metrics, glyphOffsetX, glyphOffsetY, glyphWidths, glyphHeights);
        this.glyphIndices = new byte[256][];
        this.glyphIndices = glyphData;
        this.palettes = new int[4][];
        this.palettes[0] = palette;
    }

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
            PaletteFont.a(0, Rasterizer2D.pixels, this.glyphIndices[glyphId], this.palettes[paint], var11, var8, width, height, var9, var10);
          } else {
            hl.a(Rasterizer2D.pixels, this.glyphIndices[glyphId], paint, var11, var8, width, height, var9, var10);
          }
          return;
        }
    }
}
