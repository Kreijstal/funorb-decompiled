/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qd extends BitmapFont {
    private byte[][] field_K;

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
        if (width > 0) {
          if (height > 0) {
            if (!shadowPass) {
              qd.a(SoftwareRasterizer.framebuffer, this.field_K[glyphIndex], color, sourceIndex, destinationIndex, width, height, destinationRowSkip, sourceRowSkip);
            } else {
              MonochromeBitmapFont.blitGlyphMask(SoftwareRasterizer.framebuffer, this.field_K[glyphIndex], color, sourceIndex, destinationIndex, width, height, destinationRowSkip, sourceRowSkip);
            }
            return;
          }
        }
    }

    private final static byte[][] a(int[] param0, byte[][] param1) {
        int var2_int = 0;
        int var5 = 0;
        byte[][] var2;
        int var3;
        int var4_int;
        byte[] var4;
        int var6;
        for (var2_int = 0; var2_int < param0.length; var2_int++) {
          var3 = param0[var2_int];
          var4_int = (var3 >> 15 & 510) + (var3 & 255);
          param0[var2_int] = var4_int / 3 + (var3 >> 8 & 255) >> 1;
        }
        var2 = param1;
        for (var3 = 0; var3 < var2.length; var3++) {
          var4 = var2[var3];
          L2: for (var5 = 0; var5 < var4.length; var5++) {
            var6 = var4[var5];
            if (var6 == 0) {
              continue L2;
            }
            var4[var5] = (byte)param0[var6];
          }
        }
        return param1;
    }

    final void drawGlyphAlpha(int glyphIndex, int x, int y, int width, int height, int color, int alpha256, boolean shadowPass) {
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
        if (width > 0) {
          if (height > 0) {
            if (!shadowPass) {
              qd.a(SoftwareRasterizer.framebuffer, this.field_K[glyphIndex], color, sourceIndex, destinationIndex, width, height, destinationRowSkip, sourceRowSkip, alpha256);
            } else {
              MonochromeBitmapFont.blitGlyphMaskAlpha(SoftwareRasterizer.framebuffer, this.field_K[glyphIndex], color, sourceIndex, destinationIndex, width, height, destinationRowSkip, sourceRowSkip, alpha256);
            }
            return;
          }
        }
    }

    qd(byte[] param0, int[] param1, int[] param2, int[] param3, int[] param4, int[] param5, byte[][] param6) {
        super(param0, param1, param2, param3, param4);
        this.field_K = new byte[256][];
        this.field_K = qd.a(param5, param6);
    }

    private final static void a(int[] param0, byte[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int incrementValue$11 = 0;
        int incrementValue$12 = 0;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        var10 = -param6;
        L0: while (true) {
          if (var10 >= 0) {
            return;
          }
          var11 = -param5;
          L1: while (true) {
            if (var11 >= 0) {
              param4 = param4 + param7;
              param3 = param3 + param8;
              var10++;
              continue L0;
            }
            {
              incrementValue$11 = param3;
              param3++;
              var12 = (255 & param1[incrementValue$11]) * param9 >> 8;
              if (var12 == 0) {
                param4++;
                var11++;
                continue L1;
              }
              {
                var13 = ((param2 & 16711935) * var12 & -16711936) + ((param2 & 65280) * var12 & 16711680) >> 8;
                var12 = 256 - var12;
                var14 = param0[param4];
                incrementValue$12 = param4;
                param4++;
                param0[incrementValue$12] = (((var14 & 16711935) * var12 & -16711936) + ((var14 & 65280) * var12 & 16711680) >> 8) + var13;
                var11++;
                continue L1;
              }
            }
          }
        }
    }

    private final static void a(int[] param0, byte[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int incrementValue$11 = 0;
        int incrementValue$12 = 0;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        var9 = -param6;
        L0: while (true) {
          if (var9 >= 0) {
            return;
          }
          var10 = -param5;
          L1: while (true) {
            if (var10 >= 0) {
              param4 = param4 + param7;
              param3 = param3 + param8;
              var9++;
              continue L0;
            }
            {
              incrementValue$11 = param3;
              param3++;
              var11 = 255 & param1[incrementValue$11];
              if (var11 == 0) {
                param4++;
                var10++;
                continue L1;
              }
              {
                var12 = ((param2 & 16711935) * var11 & -16711936) + ((param2 & 65280) * var11 & 16711680) >> 8;
                var11 = 256 - var11;
                var13 = param0[param4];
                incrementValue$12 = param4;
                param4++;
                param0[incrementValue$12] = (((var13 & 16711935) * var11 & -16711936) + ((var13 & 65280) * var11 & 16711680) >> 8) + var12;
                var10++;
                continue L1;
              }
            }
          }
        }
    }
}
