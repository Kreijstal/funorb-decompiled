/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MonochromeBitmapFont extends BitmapFont {
    private byte[][] glyphMasks;

    final static void a(int[] param0, byte[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        param2 = ((param2 & 16711935) * param9 & -16711936) + ((param2 & 65280) * param9 & 16711680) >> 8;
        param9 = 256 - param9;
        for (int var10 = -param6; var10 < 0; var10++) {
          for (int var11 = -param5; var11 < 0; var11++) {
            if (param1[param3++] == 0) {
              param4++;
            } else {
              int var12 = param0[param4];
              int incrementValue$12 = param4;
              param4++;
              param0[incrementValue$12] = (((var12 & 16711935) * param9 & -16711936) + ((var12 & 65280) * param9 & 16711680) >> 8) + param2;
            }
          }
          param4 = param4 + param7;
          param3 = param3 + param8;
        }
    }

    private final static void a(int[] param0, byte[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int[] param11, int[] param12) {
        int var19;
        int var13 = param2 - SoftwareRasterizer.clipLeft;
        int var14 = param3 - SoftwareRasterizer.clipTop;
        for (int var15 = var14; var15 < var14 + param5; var15++) {
          boolean decompiledFrameRemainder0 = true;
          int var16 = param11[var15];
          int var17 = param12[var15];
          int var18 = param4;
          if (var13 <= var16) {
            var19 = var16 - var13;
            if (var19 >= param4) {
              param7 = param7 + (param4 + param10);
              param8 = param8 + (param4 + param9);
              decompiledFrameRemainder0 = false;
            }
            else {
              param7 = param7 + var19;
              var18 = var18 - var19;
              param8 = param8 + var19;
            }
          } else {
            var19 = var13 - var16;
            if (var19 >= var17) {
              param7 = param7 + (param4 + param10);
              param8 = param8 + (param4 + param9);
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
              if (param1[param7++] == 0) {
                param8++;
              } else {
                int incrementValue$1 = param8;
                param8++;
                SoftwareRasterizer.framebuffer[incrementValue$1] = param6;
              }
            }
            param7 = param7 + (var19Lifetime1 + param10);
            param8 = param8 + (var19Lifetime1 + param9);
          }
        }
    }

    final void drawGlyphAlpha(int glyphIndex, int x, int y, int width, int height, int color, int alpha256, boolean shadowPass) {
        int var9 = x + y * SoftwareRasterizer.stride;
        int var10 = SoftwareRasterizer.stride - width;
        int var11 = 0;
        int var12 = 0;
        if (y < SoftwareRasterizer.clipTop) {
          int var13 = SoftwareRasterizer.clipTop - y;
          height = height - var13;
          y = SoftwareRasterizer.clipTop;
          var12 = var12 + var13 * width;
          var9 = var9 + var13 * SoftwareRasterizer.stride;
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
        MonochromeBitmapFont.a(SoftwareRasterizer.framebuffer, this.glyphMasks[glyphIndex], color, var12, var9, width, height, var10, var11, alpha256);
    }

    final static void a(int[] param0, byte[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var9 = -(param5 >> 2);
        param5 = -(param5 & 3);
        for (int var10 = -param6; var10 < 0; var10++) {
          for (int var11 = var9; var11 < 0; var11++) {
            if (param1[param3++] == 0) {
              param4++;
            } else {
              param0[param4++] = param2;
            }
            if (param1[param3++] == 0) {
              param4++;
            } else {
              param0[param4++] = param2;
            }
            if (param1[param3++] == 0) {
              param4++;
            } else {
              param0[param4++] = param2;
            }
            if (param1[param3++] == 0) {
              param4++;
            } else {
              param0[param4++] = param2;
            }
          }
          for (int var11Lifetime1 = param5; var11Lifetime1 < 0; var11Lifetime1++) {
            if (param1[param3++] == 0) {
              param4++;
            } else {
              param0[param4++] = param2;
            }
          }
          param4 = param4 + param7;
          param3 = param3 + param8;
        }
    }

    MonochromeBitmapFont(byte[] encodedMetrics, int[] glyphXOffsets, int[] glyphYOffsets, int[] glyphWidths, int[] glyphHeights, byte[][] glyphMasks) {
        super(encodedMetrics, glyphXOffsets, glyphYOffsets, glyphWidths, glyphHeights);
        this.glyphMasks = new byte[256][];
        this.glyphMasks = glyphMasks;
    }

    final void drawGlyph(int glyphIndex, int x, int y, int width, int height, int color, boolean shadowPass) {
        int var8 = x + y * SoftwareRasterizer.stride;
        int var9 = SoftwareRasterizer.stride - width;
        int var10 = 0;
        int var11 = 0;
        if (y < SoftwareRasterizer.clipTop) {
          int var12 = SoftwareRasterizer.clipTop - y;
          height = height - var12;
          y = SoftwareRasterizer.clipTop;
          var11 = var11 + var12 * width;
          var8 = var8 + var12 * SoftwareRasterizer.stride;
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
          if (SoftwareRasterizer.scanlineMaskStarts == null) {
            MonochromeBitmapFont.a(SoftwareRasterizer.framebuffer, this.glyphMasks[glyphIndex], color, var11, var8, width, height, var9, var10);
          } else {
            MonochromeBitmapFont.a(SoftwareRasterizer.framebuffer, this.glyphMasks[glyphIndex], x, y, width, height, color, var11, var8, var9, var10, SoftwareRasterizer.scanlineMaskStarts, SoftwareRasterizer.scanlineMaskWidths);
          }
          return;
        }
    }
}
