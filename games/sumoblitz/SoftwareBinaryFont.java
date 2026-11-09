/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SoftwareBinaryFont extends ToolkitFont {
    private int[] field_c;
    private SoftwareGraphicsToolkit field_e;
    private int[] field_h;
    private int[] field_f;
    private int[] field_g;
    private byte[][] field_d;

    final void drawMaskedGlyph(char param0, int param1, int param2, int param3, boolean param4, SpriteMask param5, int param6, int param7) {
        int var16 = 0;
        int var16Lifetime1;
        int var16Lifetime2;
        if (param5 == null) {
          this.drawGlyph(param0, param1, param2, param3, param4);
          return;
        }
        param1 = param1 + this.field_f[param0];
        param2 = param2 + this.field_g[param0];
        int var9 = this.field_h[param0];
        int var10 = this.field_c[param0];
        int var11 = this.field_e.targetWidth;
        int var12 = param1 + param2 * var11;
        int var13 = var11 - var9;
        int var14 = 0;
        int var15 = 0;
        if (param2 < this.field_e.clipTop) {
          var16 = this.field_e.clipTop - param2;
          var10 = var10 - var16;
          param2 = this.field_e.clipTop;
          var15 = var15 + var16 * var9;
          var12 = var12 + var16 * var11;
        }
        if (param2 + var10 > this.field_e.clipBottom) {
          var10 = var10 - (param2 + var10 - this.field_e.clipBottom);
        }
        if (param1 < this.field_e.clipLeft) {
          var16Lifetime1 = this.field_e.clipLeft - param1;
          var9 = var9 - var16Lifetime1;
          param1 = this.field_e.clipLeft;
          var15 = var15 + var16Lifetime1;
          var12 = var12 + var16Lifetime1;
          var14 = var14 + var16Lifetime1;
          var13 = var13 + var16Lifetime1;
        }
        if (param1 + var9 > this.field_e.clipRight) {
          var16Lifetime2 = param1 + var9 - this.field_e.clipRight;
          var9 = var9 - var16Lifetime2;
          var14 = var14 + var16Lifetime2;
          var13 = var13 + var16Lifetime2;
        }
        if (var9 <= 0 ||
          var10 <= 0) {
          return;
        }
        if ((param3 & -16777216) == -16777216) {
          this.blitMaskedGlyph(this.field_d[param0], this.field_e.pixels, param3, var15, var12, var9, var10, var13, var14, param1, param2, this.field_h[param0], param5, param6, param7);
        } else {
          this.blitMaskedGlyphAlpha(this.field_d[param0], this.field_e.pixels, param3, var15, var12, var9, var10, var13, var14, param1, param2, this.field_h[param0], param5, param6, param7);
        }
    }

    private final void blitGlyphAlpha(byte[] glyph, int[] pixels, int color, int sourceOffset, int destinationOffset, int width, int height, int destinationRowSkip, int sourceRowSkip) {
        int var12 = 0;
        int var13 = 0;
        int incrementValue$12 = 0;
        int var10;
        int var11;
        int var14;
        int var15;
        var10 = color >>> 24;
        var11 = 255 - var10;
        for (var12 = -height; var12 < 0; var12++) {
          for (var13 = -width; var13 < 0; var13++) {
            if (glyph[sourceOffset++] == 0) {
              destinationOffset++;
            } else {
              var14 = ((color & 16711935) * var10 & -16711936) + ((color & 65280) * var10 & 16711680) >> 8;
              var15 = pixels[destinationOffset];
              incrementValue$12 = destinationOffset;
              destinationOffset++;
              pixels[incrementValue$12] = (((var15 & 16711935) * var11 & -16711936) + ((var15 & 65280) * var11 & 16711680) >> 8) + var14;
            }
          }
          destinationOffset = destinationOffset + destinationRowSkip;
          sourceOffset = sourceOffset + sourceRowSkip;
        }
    }

    final void drawGlyph(char param0, int param1, int param2, int param3, boolean param4) {
        int var13 = 0;
        int var13Lifetime1;
        int var13Lifetime2;
        param1 = param1 + this.field_f[param0];
        param2 = param2 + this.field_g[param0];
        int var6 = this.field_h[param0];
        int var7 = this.field_c[param0];
        int var8 = this.field_e.targetWidth;
        int var9 = param1 + param2 * var8;
        int var10 = var8 - var6;
        int var11 = 0;
        int var12 = 0;
        if (param2 < this.field_e.clipTop) {
          var13 = this.field_e.clipTop - param2;
          var7 = var7 - var13;
          param2 = this.field_e.clipTop;
          var12 = var12 + var13 * var6;
          var9 = var9 + var13 * var8;
        }
        if (param2 + var7 > this.field_e.clipBottom) {
          var7 = var7 - (param2 + var7 - this.field_e.clipBottom);
        }
        if (param1 < this.field_e.clipLeft) {
          var13Lifetime1 = this.field_e.clipLeft - param1;
          var6 = var6 - var13Lifetime1;
          param1 = this.field_e.clipLeft;
          var12 = var12 + var13Lifetime1;
          var9 = var9 + var13Lifetime1;
          var11 = var11 + var13Lifetime1;
          var10 = var10 + var13Lifetime1;
        }
        if (param1 + var6 > this.field_e.clipRight) {
          var13Lifetime2 = param1 + var6 - this.field_e.clipRight;
          var6 = var6 - var13Lifetime2;
          var11 = var11 + var13Lifetime2;
          var10 = var10 + var13Lifetime2;
        }
        if (var6 <= 0 ||
          var7 <= 0) {
          return;
        }
        if ((param3 & -16777216) == -16777216) {
          this.blitGlyph(this.field_d[param0], this.field_e.pixels, param3, var12, var9, var6, var7, var10, var11);
        } else {
          if ((param3 & -16777216) != 0) {
            this.blitGlyphAlpha(this.field_d[param0], this.field_e.pixels, param3, var12, var9, var6, var7, var10, var11);
          }
        }
    }

    SoftwareBinaryFont(SoftwareGraphicsToolkit param0, FontMetrics param1, SpriteData[] param2, int[] param3, int[] param4) {
        super(param0, param1);
        int var6 = 0;
        this.field_e = param0;
        this.field_h = param3;
        this.field_c = param4;
        this.field_d = new byte[param2.length][];
        this.field_g = new int[param2.length];
        this.field_f = new int[param2.length];
        for (var6 = 0; var6 < param2.length; var6++) {
          this.field_d[var6] = param2[var6].indices;
          this.field_g[var6] = param2[var6].topInset;
          this.field_f[var6] = param2[var6].leftInset;
        }
    }

    private final void blitGlyph(byte[] glyph, int[] pixels, int color, int sourceOffset, int destinationOffset, int width, int height, int destinationRowSkip, int sourceRowSkip) {
        int var11 = 0;
        int var10;
        int var12;
        int var12Lifetime1;
        var10 = -(width >> 2);
        width = -(width & 3);
        for (var11 = -height; var11 < 0; var11++) {
          for (var12 = var10; var12 < 0; var12++) {
            if (glyph[sourceOffset++] == 0) {
              destinationOffset++;
            } else {
              pixels[destinationOffset++] = color;
            }
            if (glyph[sourceOffset++] == 0) {
              destinationOffset++;
            } else {
              pixels[destinationOffset++] = color;
            }
            if (glyph[sourceOffset++] == 0) {
              destinationOffset++;
            } else {
              pixels[destinationOffset++] = color;
            }
            if (glyph[sourceOffset++] == 0) {
              destinationOffset++;
            } else {
              pixels[destinationOffset++] = color;
            }
          }
          for (var12Lifetime1 = width; var12Lifetime1 < 0; var12Lifetime1++) {
            if (glyph[sourceOffset++] == 0) {
              destinationOffset++;
            } else {
              pixels[destinationOffset++] = color;
            }
          }
          destinationOffset = destinationOffset + destinationRowSkip;
          sourceOffset = sourceOffset + sourceRowSkip;
        }
    }

    private final void blitMaskedGlyph(byte[] glyph, int[] pixels, int color, int sourceOffset, int destinationOffset, int width, int height, int destinationRowSkip, int sourceRowSkip, int x, int y, int glyphStride, SpriteMask mask, int maskX, int maskY) {
        int var21 = 0;
        int var26 = 0;
        int stackIn_5_0 = 0;
        Object var16;
        ScanlineSpriteMask var16_ref;
        int[] var17;
        int[] var18;
        int var19;
        int var20;
        int var22;
        int var23;
        int var24;
        int var25;
        int[] var27;
        int[] var28;
        int var25Lifetime1;
        var16 = null;
        var16_ref = (ScanlineSpriteMask) (mask);
        var28 = var16_ref.rowStarts;
        var27 = var28;
        var17 = var27;
        var18 = var16_ref.rowWidths;
        var19 = y;
        if (maskY > var19) {
          var19 = maskY;
          destinationOffset = destinationOffset + (maskY - y) * this.field_e.targetWidth;
          sourceOffset = sourceOffset + (maskY - y) * glyphStride;
        }
        if (maskY + var28.length >= y + height) {
          stackIn_5_0 = y + height;
        } else {
          stackIn_5_0 = maskY + var28.length;
        }
        var20 = stackIn_5_0;
        for (var21 = var19; var21 < var20; var21++) {
          boolean decompiledFrameRemainder0 = true;
          var22 = maskX + var17[var21 - maskY];
          var23 = var18[var21 - maskY];
          var24 = width;
          if (x <= var22) {
            var25 = var22 - x;
            if (var25 >= width) {
              sourceOffset = sourceOffset + (width + sourceRowSkip);
              destinationOffset = destinationOffset + (width + destinationRowSkip);
              decompiledFrameRemainder0 = false;
            }
            else {
              sourceOffset = sourceOffset + var25;
              var24 = var24 - var25;
              destinationOffset = destinationOffset + var25;
            }
          } else {
            var25 = x - var22;
            if (var25 >= var23) {
              sourceOffset = sourceOffset + (width + sourceRowSkip);
              destinationOffset = destinationOffset + (width + destinationRowSkip);
              decompiledFrameRemainder0 = false;
            }
            else {
              var23 = var23 - var25;
            }
          }
          if (decompiledFrameRemainder0) {
            var25Lifetime1 = 0;
            if (var24 >= var23) {
              var25Lifetime1 = var24 - var23;
            } else {
              var23 = var24;
            }
            for (var26 = 0; var26 < var23; var26++) {
              if (glyph[sourceOffset++] == 0) {
                destinationOffset++;
              } else {
                pixels[destinationOffset++] = color;
              }
            }
            sourceOffset = sourceOffset + (var25Lifetime1 + sourceRowSkip);
            destinationOffset = destinationOffset + (var25Lifetime1 + destinationRowSkip);
          }
        }
    }

    private final void blitMaskedGlyphAlpha(byte[] glyph, int[] pixels, int color, int sourceOffset, int destinationOffset, int width, int height, int destinationRowSkip, int sourceRowSkip, int x, int y, int glyphStride, SpriteMask mask, int maskX, int maskY) {
        int var24 = 0;
        int var29 = 0;
        int incrementValue$1 = 0;
        int stackIn_5_0 = 0;
        Object var16;
        ScanlineSpriteMask var16_ref;
        int[] var17;
        int[] var18;
        int var19;
        int var20;
        int var21;
        int var22;
        int var23;
        int var25;
        int var26;
        int var27;
        int var28;
        int var30;
        int var31;
        int[] var32;
        int[] var33;
        int var28Lifetime1;
        var16 = null;
        var16_ref = (ScanlineSpriteMask) (mask);
        var33 = var16_ref.rowStarts;
        var32 = var33;
        var17 = var32;
        var18 = var16_ref.rowWidths;
        var19 = x - this.field_e.clipLeft;
        var20 = y;
        if (maskY > var20) {
          var20 = maskY;
          destinationOffset = destinationOffset + (maskY - y) * this.field_e.targetWidth;
          sourceOffset = sourceOffset + (maskY - y) * glyphStride;
        }
        if (maskY + var33.length >= y + height) {
          stackIn_5_0 = y + height;
        } else {
          stackIn_5_0 = maskY + var33.length;
        }
        var21 = stackIn_5_0;
        var22 = color >>> 24;
        var23 = 255 - var22;
        for (var24 = var20; var24 < var21; var24++) {
          boolean decompiledFrameRemainder0 = true;
          var25 = var17[var24 - maskY] + maskX;
          var26 = var18[var24 - maskY];
          var27 = width;
          if (var19 <= var25) {
            var28 = var25 - var19;
            if (var28 >= width) {
              sourceOffset = sourceOffset + (width + sourceRowSkip);
              destinationOffset = destinationOffset + (width + destinationRowSkip);
              decompiledFrameRemainder0 = false;
            }
            else {
              sourceOffset = sourceOffset + var28;
              var27 = var27 - var28;
              destinationOffset = destinationOffset + var28;
            }
          } else {
            var28 = var19 - var25;
            if (var28 >= var26) {
              sourceOffset = sourceOffset + (width + sourceRowSkip);
              destinationOffset = destinationOffset + (width + destinationRowSkip);
              decompiledFrameRemainder0 = false;
            }
            else {
              var26 = var26 - var28;
            }
          }
          if (decompiledFrameRemainder0) {
            var28Lifetime1 = 0;
            if (var27 >= var26) {
              var28Lifetime1 = var27 - var26;
            } else {
              var26 = var27;
            }
            for (var29 = -var26; var29 < 0; var29++) {
              if (glyph[sourceOffset++] == 0) {
                destinationOffset++;
              } else {
                var30 = ((color & 16711935) * var22 & -16711936) + ((color & 65280) * var22 & 16711680) >> 8;
                var31 = pixels[destinationOffset];
                incrementValue$1 = destinationOffset;
                destinationOffset++;
                pixels[incrementValue$1] = (((var31 & 16711935) * var23 & -16711936) + ((var31 & 65280) * var23 & 16711680) >> 8) + var30;
              }
            }
            sourceOffset = sourceOffset + (var28Lifetime1 + sourceRowSkip);
            destinationOffset = destinationOffset + (var28Lifetime1 + destinationRowSkip);
          }
        }
    }
}
