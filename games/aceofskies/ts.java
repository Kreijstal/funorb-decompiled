/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ts extends RendererBitmapFont {
    private int[] field_e;
    private kj field_f;
    private int[] field_j;
    private int[] field_h;
    private int[] field_i;
    private byte[][] field_g;

    private final void a(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, aa param12, int param13, int param14) {
        int stackIn_5_0 = 0;
        int var26;
        Object var16 = null;
        nj var16_ref = (nj) (param12);
        int[] var32 = var16_ref.field_h;
        int[] var31 = var32;
        int[] var17 = var31;
        int[] var18 = var16_ref.field_g;
        int var19 = param9 - this.field_f.field_z;
        int var20 = param10;
        if (param14 > var20) {
          var20 = param14;
          param4 = param4 + (param14 - param10) * this.field_f.field_f;
          param3 = param3 + (param14 - param10) * param11;
        }
        if (param14 + var32.length >= param10 + param6) {
          stackIn_5_0 = param10 + param6;
        } else {
          stackIn_5_0 = param14 + var32.length;
        }
        int var21 = stackIn_5_0;
        for (int var22 = var20; var22 < var21; var22++) {
          boolean decompiledFrameRemainder0 = true;
          int var23 = var17[var22 - param14] + param13;
          int var24 = var18[var22 - param14];
          int var25 = param5;
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
            int var26Lifetime1 = 0;
            if (var25 >= var24) {
              var26Lifetime1 = var25 - var24;
            } else {
              var24 = var25;
            }
            for (int var27 = -var24; var27 < 0; var27++) {
              int incrementValue$0 = param3;
              param3++;
              int var28 = param0[incrementValue$0] & 255;
              if (var28 == 0) {
                param4++;
              } else {
                int var29 = ((param2 & 16711935) * var28 & -16711936) + ((param2 & 65280) * var28 & 16711680) >> 8;
                var28 = 256 - var28;
                int var30 = param1[param4];
                int incrementValue$1 = param4;
                param4++;
                param1[incrementValue$1] = (((var30 & 16711935) * var28 & -16711936) + ((var30 & 65280) * var28 & 16711680) >> 8) + var29;
              }
            }
            param3 = param3 + (var26Lifetime1 + param8);
            param4 = param4 + (var26Lifetime1 + param7);
          }
        }
    }

    final void drawGlyphWithMask(char glyph, int x, int y, int color, boolean shadowPass, aa mask, int maskX, int maskY) {
        if (mask == null) {
          this.drawGlyph(glyph, x, y, color, shadowPass);
          return;
        }
        x = x + this.field_h[glyph];
        y = y + this.field_i[glyph];
        int var9 = this.field_e[glyph];
        int var10 = this.field_j[glyph];
        int var11 = this.field_f.field_f;
        int var12 = x + y * var11;
        int var13 = var11 - var9;
        int var14 = 0;
        int var15 = 0;
        if (y < this.field_f.field_w) {
          int var16 = this.field_f.field_w - y;
          var10 = var10 - var16;
          y = this.field_f.field_w;
          var15 = var15 + var16 * var9;
          var12 = var12 + var16 * var11;
        }
        if (y + var10 > this.field_f.field_D) {
          var10 = var10 - (y + var10 - this.field_f.field_D);
        }
        if (x < this.field_f.field_z) {
          int var16Lifetime1 = this.field_f.field_z - x;
          var9 = var9 - var16Lifetime1;
          x = this.field_f.field_z;
          var15 = var15 + var16Lifetime1;
          var12 = var12 + var16Lifetime1;
          var14 = var14 + var16Lifetime1;
          var13 = var13 + var16Lifetime1;
        }
        if (x + var9 > this.field_f.field_k) {
          int var16Lifetime2 = x + var9 - this.field_f.field_k;
          var9 = var9 - var16Lifetime2;
          var14 = var14 + var16Lifetime2;
          var13 = var13 + var16Lifetime2;
        }
        if (var9 <= 0 ||
          var10 <= 0) {
          return;
        }
        this.a(this.field_g[glyph], this.field_f.field_E, color, var15, var12, var9, var10, var13, var14, x, y, this.field_e[glyph], mask, maskX, maskY);
    }

    ts(kj param0, BitmapFontMetrics param1, SpriteData[] param2, int[] param3, int[] param4) {
        super(param0, param1);
        int stackIn_9_2 = 0;
        this.field_f = param0;
        this.field_f = param0;
        this.field_e = param3;
        this.field_j = param4;
        this.field_g = new byte[param2.length][];
        this.field_i = new int[param2.length];
        this.field_h = new int[param2.length];
        for (int var6 = 0; var6 < param2.length; var6++) {
          SpriteData var7 = param2[var6];
          if (var7.alpha == null) {
            byte[] var14 = var7.indices;
            byte[] array$0 = new byte[var14.length];
            this.field_g[var6] = array$0;
            byte[] var9 = array$0;
            for (int var10 = 0; var10 < var14.length; var10++) {
              byte[] stackIn_8_0 = var9;
              int stackIn_8_1 = var10;
              stackIn_9_2 = (var14[var10] != 0) ? (-1) : (0);
              stackIn_8_0[stackIn_8_1] = (byte)stackIn_9_2;
            }
          } else {
            this.field_g[var6] = var7.alpha;
          }
          this.field_i[var6] = var7.padTop;
          this.field_h[var6] = var7.padLeft;
        }
    }

    private final void a(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        for (int var10 = -param6; var10 < 0; var10++) {
          for (int var11 = -param5; var11 < 0; var11++) {
            int incrementValue$11 = param3;
            param3++;
            int var12 = param0[incrementValue$11] & 255;
            if (var12 == 0) {
              param4++;
            } else {
              int var13 = ((param2 & 16711935) * var12 & -16711936) + ((param2 & 65280) * var12 & 16711680) >> 8;
              var12 = 256 - var12;
              int var14 = param1[param4];
              int incrementValue$12 = param4;
              param4++;
              param1[incrementValue$12] = (((var14 & 16711935) * var12 & -16711936) + ((var14 & 65280) * var12 & 16711680) >> 8) + var13;
            }
          }
          param4 = param4 + param7;
          param3 = param3 + param8;
        }
    }

    final void drawGlyph(char glyph, int x, int y, int color, boolean shadowPass) {
        x = x + this.field_h[glyph];
        y = y + this.field_i[glyph];
        int var6 = this.field_e[glyph];
        int var7 = this.field_j[glyph];
        int var8 = this.field_f.field_f;
        int var9 = x + y * var8;
        int var10 = var8 - var6;
        int var11 = 0;
        int var12 = 0;
        if (y < this.field_f.field_w) {
          int var13 = this.field_f.field_w - y;
          var7 = var7 - var13;
          y = this.field_f.field_w;
          var12 = var12 + var13 * var6;
          var9 = var9 + var13 * var8;
        }
        if (y + var7 > this.field_f.field_D) {
          var7 = var7 - (y + var7 - this.field_f.field_D);
        }
        if (x < this.field_f.field_z) {
          int var13Lifetime1 = this.field_f.field_z - x;
          var6 = var6 - var13Lifetime1;
          x = this.field_f.field_z;
          var12 = var12 + var13Lifetime1;
          var9 = var9 + var13Lifetime1;
          var11 = var11 + var13Lifetime1;
          var10 = var10 + var13Lifetime1;
        }
        if (x + var6 > this.field_f.field_k) {
          int var13Lifetime2 = x + var6 - this.field_f.field_k;
          var6 = var6 - var13Lifetime2;
          var11 = var11 + var13Lifetime2;
          var10 = var10 + var13Lifetime2;
        }
        if (var6 <= 0 ||
          var7 <= 0) {
          return;
        }
        this.a(this.field_g[glyph], this.field_f.field_E, color, var12, var9, var6, var7, var10, var11);
    }
}
