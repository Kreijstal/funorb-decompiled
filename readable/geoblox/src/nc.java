/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nc extends BitmapFont {
    private byte[][] field_L;
    int[][] colorPalettes;

    nc(byte[] param0, int[] param1, int[] param2, int[] param3, int[] param4, int[] param5, byte[][] param6) {
        super(param0, param1, param2, param3, param4);
        this.field_L = new byte[256][];
        this.field_L = param6;
        this.colorPalettes = new int[4][];
        this.colorPalettes[0] = param5;
    }

    private final static void a(int param0, int[] param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10) {
        int incrementValue$16 = 0;
        byte dupTemp$17 = 0;
        int incrementValue$18 = 0;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        var11 = 256 - param10;
        var12 = -param7;
        L0: while (true) {
          if (var12 >= 0) {
            return;
          }
          var13 = -param6;
          L1: while (true) {
            if (var13 >= 0) {
              param5 = param5 + param8;
              param4 = param4 + param9;
              var12++;
              continue L0;
            }
            {
              incrementValue$16 = param4;
              param4++;
              dupTemp$17 = param2[incrementValue$16];
              param0 = dupTemp$17;
              if (dupTemp$17 == 0) {
                param5++;
                var13++;
                continue L1;
              }
              {
                var14 = param1[param5];
                var15 = param3[param0 & 255];
                incrementValue$18 = param5;
                param5++;
                param1[incrementValue$18] = ((var15 & 16711935) * param10 + (var14 & 16711935) * var11 & -16711936) + ((var15 & 65280) * param10 + (var14 & 65280) * var11 & 16711680) >> 8;
                var13++;
                continue L1;
              }
            }
          }
        }
    }

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
              nc.a(0, SoftwareRasterizer.framebuffer, this.field_L[glyphIndex], this.colorPalettes[color], sourceIndex, destinationIndex, width, height, destinationRowSkip, sourceRowSkip);
            } else {
              MonochromeBitmapFont.blitGlyphMask(SoftwareRasterizer.framebuffer, this.field_L[glyphIndex], color, sourceIndex, destinationIndex, width, height, destinationRowSkip, sourceRowSkip);
            }
            return;
          }
        }
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
              nc.a(0, SoftwareRasterizer.framebuffer, this.field_L[glyphIndex], this.colorPalettes[color], sourceIndex, destinationIndex, width, height, destinationRowSkip, sourceRowSkip, alpha256);
            } else {
              MonochromeBitmapFont.blitGlyphMaskAlpha(SoftwareRasterizer.framebuffer, this.field_L[glyphIndex], color, sourceIndex, destinationIndex, width, height, destinationRowSkip, sourceRowSkip, alpha256);
            }
            return;
          }
        }
    }

    private final static int a(int[] param0, int param1) {
        int var4 = 0;
        int var2;
        int var3;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        var2 = 0;
        var3 = 2147483647;
        L0: for (var4 = 1; var4 < param0.length; var4++) {
          var5 = param0[var4];
          var6 = (var5 >> 16) - (param1 >> 16);
          var7 = (var5 >> 8 & 255) - (param1 >> 8 & 255);
          var8 = (var5 & 255) - (param1 & 255);
          var9 = var6 * var6 + var7 * var7 + var8 * var8;
          if (var9 >= var3) {
            continue L0;
          }
          var2 = var4;
          var3 = var9;
        }
        return var2;
    }

    final int e(int param0) {
        return nc.a(this.colorPalettes[0], param0);
    }

    private final static void a(int param0, int[] param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int incrementValue$0 = 0;
        byte dupTemp$1 = 0;
        int incrementValue$2 = 0;
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
        int var10;
        int var11;
        int var12;
        var10 = -(param6 >> 2);
        param6 = -(param6 & 3);
        var11 = -param7;
        L0: while (true) {
          if (var11 >= 0) {
            return;
          }
          {
            var12 = var10;
            L1: while (true) {
              if (var12 >= 0) {
                var12 = param6;
                L2: while (true) {
                  if (var12 >= 0) {
                    param5 = param5 + param8;
                    param4 = param4 + param9;
                    var11++;
                    continue L0;
                  }
                  {
                    incrementValue$0 = param4;
                    param4++;
                    dupTemp$1 = param2[incrementValue$0];
                    param0 = dupTemp$1;
                    if (dupTemp$1 == 0) {
                      param5++;
                      var12++;
                      continue L2;
                    }
                    {
                      incrementValue$2 = param5;
                      param5++;
                      param1[incrementValue$2] = param3[param0 & 255];
                      var12++;
                      continue L2;
                    }
                  }
                }
              }
              {
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
                  var12++;
                  continue L1;
                }
                {
                  incrementValue$14 = param5;
                  param5++;
                  param1[incrementValue$14] = param3[param0 & 255];
                  var12++;
                  continue L1;
                }
              }
            }
          }
        }
    }
}
