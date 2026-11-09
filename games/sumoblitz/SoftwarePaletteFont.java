/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SoftwarePaletteFont extends ToolkitFont {
    private byte[][] field_e;
    private int[] field_i;
    private int[] field_f;
    private int[] field_c;
    private SoftwareGraphicsToolkit field_g;
    private int[] field_h;
    private int[] field_d;

    private final void blitPaletteGlyph(byte[] indices, int[] pixels, int[] palette, int sourceOffset, int destinationOffset, int width, int height, int destinationRowSkip, int sourceRowSkip) {
        int var12 = 0;
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
        int var11;
        int var13;
        int var11Lifetime1;
        int var13Lifetime1;
        int var11Lifetime1Lifetime1;
        int var11Lifetime1Lifetime2;
        int var11Lifetime1Lifetime3;
        int var11Lifetime1Lifetime4;
        var10 = -(width >> 2);
        width = -(width & 3);
        var11 = 0;
        for (var12 = -height; var12 < 0; var12++) {
          for (var13 = var10; var13 < 0; var13++) {
            incrementValue$3 = sourceOffset;
            sourceOffset++;
            dupTemp$4 = indices[incrementValue$3];
            var11Lifetime1 = dupTemp$4;
            if (dupTemp$4 == 0) {
              destinationOffset++;
            } else {
              incrementValue$5 = destinationOffset;
              destinationOffset++;
              pixels[incrementValue$5] = palette[var11Lifetime1 & 255];
            }
            incrementValue$6 = sourceOffset;
            sourceOffset++;
            dupTemp$7 = indices[incrementValue$6];
            var11Lifetime1Lifetime2 = dupTemp$7;
            if (dupTemp$7 == 0) {
              destinationOffset++;
            } else {
              incrementValue$8 = destinationOffset;
              destinationOffset++;
              pixels[incrementValue$8] = palette[var11Lifetime1Lifetime2 & 255];
            }
            incrementValue$9 = sourceOffset;
            sourceOffset++;
            dupTemp$10 = indices[incrementValue$9];
            var11Lifetime1Lifetime3 = dupTemp$10;
            if (dupTemp$10 == 0) {
              destinationOffset++;
            } else {
              incrementValue$11 = destinationOffset;
              destinationOffset++;
              pixels[incrementValue$11] = palette[var11Lifetime1Lifetime3 & 255];
            }
            incrementValue$12 = sourceOffset;
            sourceOffset++;
            dupTemp$13 = indices[incrementValue$12];
            var11Lifetime1Lifetime4 = dupTemp$13;
            if (dupTemp$13 == 0) {
              destinationOffset++;
            } else {
              incrementValue$14 = destinationOffset;
              destinationOffset++;
              pixels[incrementValue$14] = palette[var11Lifetime1Lifetime4 & 255];
            }
          }
          for (var13Lifetime1 = width; var13Lifetime1 < 0; var13Lifetime1++) {
            incrementValue$0 = sourceOffset;
            sourceOffset++;
            dupTemp$1 = indices[incrementValue$0];
            var11Lifetime1Lifetime1 = dupTemp$1;
            if (dupTemp$1 == 0) {
              destinationOffset++;
            } else {
              incrementValue$2 = destinationOffset;
              destinationOffset++;
              pixels[incrementValue$2] = palette[var11Lifetime1Lifetime1 & 255];
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
        param1 = param1 + this.field_d[param0];
        param2 = param2 + this.field_f[param0];
        int var6 = this.field_c[param0];
        int var7 = this.field_h[param0];
        int var8 = this.field_g.targetWidth;
        int var9 = param1 + param2 * var8;
        int var10 = var8 - var6;
        int var11 = 0;
        int var12 = 0;
        if (param2 < this.field_g.clipTop) {
          var13 = this.field_g.clipTop - param2;
          var7 = var7 - var13;
          param2 = this.field_g.clipTop;
          var12 = var12 + var13 * var6;
          var9 = var9 + var13 * var8;
        }
        if (param2 + var7 > this.field_g.clipBottom) {
          var7 = var7 - (param2 + var7 - this.field_g.clipBottom);
        }
        if (param1 < this.field_g.clipLeft) {
          var13Lifetime1 = this.field_g.clipLeft - param1;
          var6 = var6 - var13Lifetime1;
          param1 = this.field_g.clipLeft;
          var12 = var12 + var13Lifetime1;
          var9 = var9 + var13Lifetime1;
          var11 = var11 + var13Lifetime1;
          var10 = var10 + var13Lifetime1;
        }
        if (param1 + var6 > this.field_g.clipRight) {
          var13Lifetime2 = param1 + var6 - this.field_g.clipRight;
          var6 = var6 - var13Lifetime2;
          var11 = var11 + var13Lifetime2;
          var10 = var10 + var13Lifetime2;
        }
        if (var6 <= 0 ||
          var7 <= 0) {
          return;
        }
        if (param4) {
          this.blitSolidGlyph(this.field_e[param0], this.field_g.pixels, param3, var12, var9, var6, var7, var10, var11);
        } else {
          this.blitPaletteGlyph(this.field_e[param0], this.field_g.pixels, this.field_i, var12, var9, var6, var7, var10, var11);
        }
    }

    final void drawMaskedGlyph(char param0, int param1, int param2, int param3, boolean param4, SpriteMask param5, int param6, int param7) {
        int var16 = 0;
        int var16Lifetime1;
        int var16Lifetime2;
        if (param5 == null) {
          this.drawGlyph(param0, param1, param2, param3, param4);
          return;
        }
        param1 = param1 + this.field_d[param0];
        param2 = param2 + this.field_f[param0];
        int var9 = this.field_c[param0];
        int var10 = this.field_h[param0];
        int var11 = this.field_g.targetWidth;
        int var12 = param1 + param2 * var11;
        int var13 = var11 - var9;
        int var14 = 0;
        int var15 = 0;
        if (param2 < this.field_g.clipTop) {
          var16 = this.field_g.clipTop - param2;
          var10 = var10 - var16;
          param2 = this.field_g.clipTop;
          var15 = var15 + var16 * var9;
          var12 = var12 + var16 * var11;
        }
        if (param2 + var10 > this.field_g.clipBottom) {
          var10 = var10 - (param2 + var10 - this.field_g.clipBottom);
        }
        if (param1 < this.field_g.clipLeft) {
          var16Lifetime1 = this.field_g.clipLeft - param1;
          var9 = var9 - var16Lifetime1;
          param1 = this.field_g.clipLeft;
          var15 = var15 + var16Lifetime1;
          var12 = var12 + var16Lifetime1;
          var14 = var14 + var16Lifetime1;
          var13 = var13 + var16Lifetime1;
        }
        if (param1 + var9 > this.field_g.clipRight) {
          var16Lifetime2 = param1 + var9 - this.field_g.clipRight;
          var9 = var9 - var16Lifetime2;
          var14 = var14 + var16Lifetime2;
          var13 = var13 + var16Lifetime2;
        }
        if (var9 <= 0 ||
          var10 <= 0) {
          return;
        }
        if (param4) {
          this.blitMaskedSolidGlyph(this.field_e[param0], this.field_g.pixels, param3, var15, var12, var9, var10, var13, var14, param1, param2, this.field_c[param0], param5, param6, param7);
        } else {
          this.blitMaskedPaletteGlyph(this.field_e[param0], this.field_g.pixels, this.field_i, param3, var15, var12, var9, var10, var13, var14, param1, param2, this.field_c[param0], param5, param6, param7);
        }
    }

    private final void blitMaskedSolidGlyph(byte[] glyph, int[] pixels, int color, int sourceOffset, int destinationOffset, int width, int height, int destinationRowSkip, int sourceRowSkip, int x, int y, int glyphStride, SpriteMask mask, int maskX, int maskY) {
        int var22 = 0;
        int var27 = 0;
        int stackIn_5_0 = 0;
        Object var16;
        ScanlineSpriteMask var16_ref;
        int[] var17;
        int[] var18;
        int var19;
        int var20;
        int var21;
        int var23;
        int var24;
        int var25;
        int var26;
        int[] var28;
        int[] var29;
        int var26Lifetime1;
        var16 = null;
        var16_ref = (ScanlineSpriteMask) (mask);
        var29 = var16_ref.rowStarts;
        var28 = var29;
        var17 = var28;
        var18 = var16_ref.rowWidths;
        var19 = x - this.field_g.clipLeft;
        var20 = y;
        if (maskY > var20) {
          var20 = maskY;
          destinationOffset = destinationOffset + (maskY - y) * this.field_g.targetWidth;
          sourceOffset = sourceOffset + (maskY - y) * glyphStride;
        }
        if (maskY + var29.length >= y + height) {
          stackIn_5_0 = y + height;
        } else {
          stackIn_5_0 = maskY + var29.length;
        }
        var21 = stackIn_5_0;
        for (var22 = var20; var22 < var21; var22++) {
          boolean decompiledFrameRemainder0 = true;
          var23 = var17[var22 - maskY] + maskX;
          var24 = var18[var22 - maskY];
          var25 = width;
          if (var19 <= var23) {
            var26 = var23 - var19;
            if (var26 >= width) {
              sourceOffset = sourceOffset + (width + sourceRowSkip);
              destinationOffset = destinationOffset + (width + destinationRowSkip);
              decompiledFrameRemainder0 = false;
            }
            else {
              sourceOffset = sourceOffset + var26;
              var25 = var25 - var26;
              destinationOffset = destinationOffset + var26;
            }
          } else {
            var26 = var19 - var23;
            if (var26 >= var24) {
              sourceOffset = sourceOffset + (width + sourceRowSkip);
              destinationOffset = destinationOffset + (width + destinationRowSkip);
              decompiledFrameRemainder0 = false;
            }
            else {
              var24 = var24 - var26;
            }
          }
          if (decompiledFrameRemainder0) {
            var26Lifetime1 = 0;
            if (var25 >= var24) {
              var26Lifetime1 = var25 - var24;
            } else {
              var24 = var25;
            }
            for (var27 = -var24; var27 < 0; var27++) {
              if (glyph[sourceOffset++] == 0) {
                destinationOffset++;
              } else {
                pixels[destinationOffset++] = color;
              }
            }
            sourceOffset = sourceOffset + (var26Lifetime1 + sourceOffset);
            destinationOffset = destinationOffset + (var26Lifetime1 + destinationRowSkip);
          }
        }
    }

    private final void blitSolidGlyph(byte[] glyph, int[] pixels, int color, int sourceOffset, int destinationOffset, int width, int height, int destinationRowSkip, int sourceRowSkip) {
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

    private final void blitMaskedPaletteGlyph(byte[] indices, int[] pixels, int[] palette, int unused, int sourceOffset, int destinationOffset, int width, int height, int destinationRowSkip, int sourceRowSkip, int x, int y, int glyphStride, SpriteMask mask, int maskX, int maskY) {
        int var24 = 0;
        int var29 = 0;
        int incrementValue$0 = 0;
        byte dupTemp$1 = 0;
        int incrementValue$2 = 0;
        int stackIn_5_0 = 0;
        Object var17;
        ScanlineSpriteMask var17_ref;
        int[] var18;
        int[] var19;
        int var20;
        int var21;
        int var22;
        int var23;
        int var25;
        int var26;
        int var27;
        int var28;
        int[] var30;
        int[] var31;
        int var23Lifetime1;
        int var28Lifetime1;
        var17 = null;
        var17_ref = (ScanlineSpriteMask) (mask);
        var31 = var17_ref.rowStarts;
        var30 = var31;
        var18 = var30;
        var19 = var17_ref.rowWidths;
        var20 = x - this.field_g.clipLeft;
        var21 = y;
        if (maskY > var21) {
          var21 = maskY;
          destinationOffset = destinationOffset + (maskY - y) * this.field_g.targetWidth;
          sourceOffset = sourceOffset + (maskY - y) * glyphStride;
        }
        if (maskY + var31.length >= y + height) {
          stackIn_5_0 = y + height;
        } else {
          stackIn_5_0 = maskY + var31.length;
        }
        var22 = stackIn_5_0;
        var23 = 0;
        for (var24 = var21; var24 < var22; var24++) {
          boolean decompiledFrameRemainder0 = true;
          var25 = var18[var24 - maskY] + maskX;
          var26 = var19[var24 - maskY];
          var27 = width;
          if (var20 <= var25) {
            var28 = var25 - var20;
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
            var28 = var20 - var25;
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
              incrementValue$0 = sourceOffset;
              sourceOffset++;
              dupTemp$1 = indices[incrementValue$0];
              var23Lifetime1 = dupTemp$1;
              if (dupTemp$1 == 0) {
                destinationOffset++;
              } else {
                incrementValue$2 = destinationOffset;
                destinationOffset++;
                pixels[incrementValue$2] = palette[var23Lifetime1 & 255];
              }
            }
            sourceOffset = sourceOffset + (var28Lifetime1 + sourceRowSkip);
            destinationOffset = destinationOffset + (var28Lifetime1 + destinationRowSkip);
          }
        }
    }

    SoftwarePaletteFont(SoftwareGraphicsToolkit param0, FontMetrics param1, SpriteData[] param2, int[] param3, int[] param4) {
        super(param0, param1);
        int var6 = 0;
        this.field_g = param0;
        this.field_g = param0;
        this.field_c = param3;
        this.field_h = param4;
        this.field_e = new byte[param2.length][];
        this.field_f = new int[param2.length];
        this.field_d = new int[param2.length];
        for (var6 = 0; var6 < param2.length; var6++) {
          this.field_e[var6] = param2[var6].indices;
          this.field_f[var6] = param2[var6].topInset;
          this.field_d[var6] = param2[var6].leftInset;
        }
        this.field_i = param2[0].palette;
    }
}
