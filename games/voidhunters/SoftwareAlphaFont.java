/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SoftwareAlphaFont extends ToolkitFont {
    private SoftwareToolkit toolkit;
    private int[] glyphYOffsets;
    private int[] glyphXOffsets;
    private byte[][] glyphCoverage;
    private int[] glyphWidths;
    private int[] glyphHeights;

    private final void blitCoverage(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
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
            var12 = param0[incrementValue$11] & 255;
            if (var12 == 0) {
              param4++;
            } else {
              var13 = ((param2 & 16711935) * var12 & -16711936) + ((param2 & 65280) * var12 & 16711680) >> 8;
              var12 = 256 - var12;
              var14 = param1[param4];
              incrementValue$12 = param4;
              param4++;
              param1[incrementValue$12] = (((var14 & 16711935) * var12 & -16711936) + ((var14 & 65280) * var12 & 16711680) >> 8) + var13;
            }
          }
          param4 = param4 + param7;
          param3 = param3 + param8;
        }
    }

    final void drawGlyphMasked(char param0, int param1, int param2, int param3, boolean param4, GlyphMask param5, int param6, int param7) {
        int var16 = 0;
        int var16Lifetime1;
        int var16Lifetime2;
        if (param5 == null) {
          this.drawGlyph(param0, param1, param2, param3, param4);
          return;
        }
        param1 = param1 + this.glyphXOffsets[param0];
        param2 = param2 + this.glyphYOffsets[param0];
        int var9 = this.glyphWidths[param0];
        int var10 = this.glyphHeights[param0];
        int var11 = this.toolkit.width;
        int var12 = param1 + param2 * var11;
        int var13 = var11 - var9;
        int var14 = 0;
        int var15 = 0;
        if (param2 < this.toolkit.clipTop) {
          var16 = this.toolkit.clipTop - param2;
          var10 = var10 - var16;
          param2 = this.toolkit.clipTop;
          var15 = var15 + var16 * var9;
          var12 = var12 + var16 * var11;
        }
        if (param2 + var10 > this.toolkit.clipBottom) {
          var10 = var10 - (param2 + var10 - this.toolkit.clipBottom);
        }
        if (param1 < this.toolkit.clipLeft) {
          var16Lifetime1 = this.toolkit.clipLeft - param1;
          var9 = var9 - var16Lifetime1;
          param1 = this.toolkit.clipLeft;
          var15 = var15 + var16Lifetime1;
          var12 = var12 + var16Lifetime1;
          var14 = var14 + var16Lifetime1;
          var13 = var13 + var16Lifetime1;
        }
        if (param1 + var9 > this.toolkit.clipRight) {
          var16Lifetime2 = param1 + var9 - this.toolkit.clipRight;
          var9 = var9 - var16Lifetime2;
          var14 = var14 + var16Lifetime2;
          var13 = var13 + var16Lifetime2;
        }
        if (var9 <= 0 ||
          var10 <= 0) {
          return;
        }
        this.blitCoverageMasked(this.glyphCoverage[param0], this.toolkit.pixels, param3, var15, var12, var9, var10, var13, var14, param1, param2, this.glyphWidths[param0], param5, param6, param7);
    }

    private final void blitCoverageMasked(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, GlyphMask param12, int param13, int param14) {
        int var22 = 0;
        int var27 = 0;
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int stackIn_5_0 = 0;
        Object var16;
        SoftwareGlyphMask var16_ref;
        int[] var17;
        int[] var18;
        int var19;
        int var20;
        int var21;
        int var23;
        int var24;
        int var25;
        int var26;
        int var28;
        int var29;
        int var30;
        int[] var31;
        int[] var32;
        int var26Lifetime1;
        var16 = null;
        var16_ref = (SoftwareGlyphMask) (param12);
        var32 = var16_ref.rowStarts;
        var31 = var32;
        var17 = var31;
        var18 = var16_ref.rowWidths;
        var19 = param9 - this.toolkit.clipLeft;
        var20 = param10;
        if (param14 > var20) {
          var20 = param14;
          param4 = param4 + (param14 - param10) * this.toolkit.width;
          param3 = param3 + (param14 - param10) * param11;
        }
        if (param14 + var32.length >= param10 + param6) {
          stackIn_5_0 = param10 + param6;
        } else {
          stackIn_5_0 = param14 + var32.length;
        }
        var21 = stackIn_5_0;
        for (var22 = var20; var22 < var21; var22++) {
          boolean decompiledFrameRemainder0 = true;
          var23 = var17[var22 - param14] + param13;
          var24 = var18[var22 - param14];
          var25 = param5;
          if (var19 <= var23) {
            var26 = var23 - var19;
            if (var26 >= param5) {
              param3 = param3 + (param5 + param8);
              param4 = param4 + (param5 + param7);
              decompiledFrameRemainder0 = false;
            }
            else {
              param3 = param3 + var26;
              var25 = var25 - var26;
              param4 = param4 + var26;
            }
          } else {
            var26 = var19 - var23;
            if (var26 >= var24) {
              param3 = param3 + (param5 + param8);
              param4 = param4 + (param5 + param7);
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
              incrementValue$0 = param3;
              param3++;
              var28 = param0[incrementValue$0] & 255;
              if (var28 == 0) {
                param4++;
              } else {
                var29 = ((param2 & 16711935) * var28 & -16711936) + ((param2 & 65280) * var28 & 16711680) >> 8;
                var28 = 256 - var28;
                var30 = param1[param4];
                incrementValue$1 = param4;
                param4++;
                param1[incrementValue$1] = (((var30 & 16711935) * var28 & -16711936) + ((var30 & 65280) * var28 & 16711680) >> 8) + var29;
              }
            }
            param3 = param3 + (var26Lifetime1 + param8);
            param4 = param4 + (var26Lifetime1 + param7);
          }
        }
    }

    SoftwareAlphaFont(SoftwareToolkit param0, ToolkitFontMetrics param1, IndexedSpriteData[] param2, int[] param3, int[] param4) {
        super(param0, param1);
        int var6 = 0;
        byte[] array$0 = null;
        int var10 = 0;
        byte[] stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        int stackIn_9_2 = 0;
        IndexedSpriteData var7;
        byte[] var9;
        byte[] var14;
        this.toolkit = param0;
        this.toolkit = param0;
        this.glyphWidths = param3;
        this.glyphHeights = param4;
        this.glyphCoverage = new byte[param2.length][];
        this.glyphYOffsets = new int[param2.length];
        this.glyphXOffsets = new int[param2.length];
        for (var6 = 0; var6 < param2.length; var6++) {
          var7 = param2[var6];
          if (var7.alpha == null) {
            var14 = var7.pixels;
            array$0 = new byte[var14.length];
            this.glyphCoverage[var6] = array$0;
            var9 = array$0;
            for (var10 = 0; var10 < var14.length; var10++) {
              stackIn_8_0 = var9;
              stackIn_8_1 = var10;
              if (var14[var10] != 0) {
                stackIn_9_2 = -1;
              } else {
                stackIn_9_2 = 0;
              }
              stackIn_8_0[stackIn_8_1] = (byte)stackIn_9_2;
            }
          } else {
            this.glyphCoverage[var6] = var7.alpha;
          }
          this.glyphYOffsets[var6] = var7.topPadding;
          this.glyphXOffsets[var6] = var7.leftPadding;
        }
    }

    final void drawGlyph(char param0, int param1, int param2, int param3, boolean param4) {
        int var13 = 0;
        int var13Lifetime1;
        int var13Lifetime2;
        param1 = param1 + this.glyphXOffsets[param0];
        param2 = param2 + this.glyphYOffsets[param0];
        int var6 = this.glyphWidths[param0];
        int var7 = this.glyphHeights[param0];
        int var8 = this.toolkit.width;
        int var9 = param1 + param2 * var8;
        int var10 = var8 - var6;
        int var11 = 0;
        int var12 = 0;
        if (param2 < this.toolkit.clipTop) {
          var13 = this.toolkit.clipTop - param2;
          var7 = var7 - var13;
          param2 = this.toolkit.clipTop;
          var12 = var12 + var13 * var6;
          var9 = var9 + var13 * var8;
        }
        if (param2 + var7 > this.toolkit.clipBottom) {
          var7 = var7 - (param2 + var7 - this.toolkit.clipBottom);
        }
        if (param1 < this.toolkit.clipLeft) {
          var13Lifetime1 = this.toolkit.clipLeft - param1;
          var6 = var6 - var13Lifetime1;
          param1 = this.toolkit.clipLeft;
          var12 = var12 + var13Lifetime1;
          var9 = var9 + var13Lifetime1;
          var11 = var11 + var13Lifetime1;
          var10 = var10 + var13Lifetime1;
        }
        if (param1 + var6 > this.toolkit.clipRight) {
          var13Lifetime2 = param1 + var6 - this.toolkit.clipRight;
          var6 = var6 - var13Lifetime2;
          var11 = var11 + var13Lifetime2;
          var10 = var10 + var13Lifetime2;
        }
        if (var6 <= 0 ||
          var7 <= 0) {
          return;
        }
        this.blitCoverage(this.glyphCoverage[param0], this.toolkit.pixels, param3, var12, var9, var6, var7, var10, var11);
    }
}
