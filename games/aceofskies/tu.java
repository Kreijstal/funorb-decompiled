/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tu extends RendererBitmapFont {
    private int[] field_e;
    private int[] field_j;
    private int[] field_g;
    private kj field_f;
    private int[] field_i;
    private byte[][] field_h;

    private final void b(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var10 = -(param5 >> 2);
        param5 = -(param5 & 3);
        for (int var11 = -param6; var11 < 0; var11++) {
          for (int var12 = var10; var12 < 0; var12++) {
            if (param0[param3++] == 0) {
              param4++;
            } else {
              param1[param4++] = param2;
            }
            if (param0[param3++] == 0) {
              param4++;
            } else {
              param1[param4++] = param2;
            }
            if (param0[param3++] == 0) {
              param4++;
            } else {
              param1[param4++] = param2;
            }
            if (param0[param3++] == 0) {
              param4++;
            } else {
              param1[param4++] = param2;
            }
          }
          for (int var12Lifetime1 = param5; var12Lifetime1 < 0; var12Lifetime1++) {
            if (param0[param3++] == 0) {
              param4++;
            } else {
              param1[param4++] = param2;
            }
          }
          param4 = param4 + param7;
          param3 = param3 + param8;
        }
    }

    final void drawGlyph(char glyph, int x, int y, int color, boolean shadowPass) {
        x = x + this.field_g[glyph];
        y = y + this.field_j[glyph];
        int var6 = this.field_i[glyph];
        int var7 = this.field_e[glyph];
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
        if ((color & -16777216) == -16777216) {
          this.b(this.field_h[glyph], this.field_f.field_E, color, var12, var9, var6, var7, var10, var11);
        } else if ((color & -16777216) != 0) {
          this.a(this.field_h[glyph], this.field_f.field_E, color, var12, var9, var6, var7, var10, var11);
        }
    }

    final void drawGlyphWithMask(char glyph, int x, int y, int color, boolean shadowPass, aa mask, int maskX, int maskY) {
        if (mask == null) {
          this.drawGlyph(glyph, x, y, color, shadowPass);
          return;
        }
        x = x + this.field_g[glyph];
        y = y + this.field_j[glyph];
        int var9 = this.field_i[glyph];
        int var10 = this.field_e[glyph];
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
        if ((color & -16777216) == -16777216) {
          this.a(this.field_h[glyph], this.field_f.field_E, color, var15, var12, var9, var10, var13, var14, x, y, this.field_i[glyph], mask, maskX, maskY);
        } else {
          this.b(this.field_h[glyph], this.field_f.field_E, color, var15, var12, var9, var10, var13, var14, x, y, this.field_i[glyph], mask, maskX, maskY);
        }
    }

    private final void b(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, aa param12, int param13, int param14) {
        int stackIn_5_0 = 0;
        int var28;
        Object var16 = null;
        nj var16_ref = (nj) (param12);
        int[] var33 = var16_ref.field_h;
        int[] var32 = var33;
        int[] var17 = var32;
        int[] var18 = var16_ref.field_g;
        int var19 = param9 - this.field_f.field_z;
        int var20 = param10;
        if (param14 > var20) {
          var20 = param14;
          param4 = param4 + (param14 - param10) * this.field_f.field_f;
          param3 = param3 + (param14 - param10) * param11;
        }
        if (param14 + var33.length >= param10 + param6) {
          stackIn_5_0 = param10 + param6;
        } else {
          stackIn_5_0 = param14 + var33.length;
        }
        int var21 = stackIn_5_0;
        int var22 = param2 >>> 24;
        int var23 = 255 - var22;
        for (int var24 = var20; var24 < var21; var24++) {
          boolean decompiledFrameRemainder0 = true;
          int var25 = var17[var24 - param14] + param13;
          int var26 = var18[var24 - param14];
          int var27 = param5;
          if (var19 <= var25) {
            var28 = var25 - var19;
            if (var28 >= param5) {
              param3 = param3 + (param5 + param8);
              param4 = param4 + (param5 + param7);
              decompiledFrameRemainder0 = false;
            }
            else {
              param3 = param3 + var28;
              var27 = var27 - var28;
              param4 = param4 + var28;
            }
          } else {
            var28 = var19 - var25;
            if (var28 >= var26) {
              param3 = param3 + (param5 + param8);
              param4 = param4 + (param5 + param7);
              decompiledFrameRemainder0 = false;
            }
            else {
              var26 = var26 - var28;
            }
          }
          if (decompiledFrameRemainder0) {
            int var28Lifetime1 = 0;
            if (var27 >= var26) {
              var28Lifetime1 = var27 - var26;
            } else {
              var26 = var27;
            }
            for (int var29 = -var26; var29 < 0; var29++) {
              if (param0[param3++] == 0) {
                param4++;
              } else {
                int var30 = ((param2 & 16711935) * var22 & -16711936) + ((param2 & 65280) * var22 & 16711680) >> 8;
                int var31 = param1[param4];
                int incrementValue$1 = param4;
                param4++;
                param1[incrementValue$1] = (((var31 & 16711935) * var23 & -16711936) + ((var31 & 65280) * var23 & 16711680) >> 8) + var30;
              }
            }
            param3 = param3 + (var28Lifetime1 + param8);
            param4 = param4 + (var28Lifetime1 + param7);
          }
        }
    }

    private final void a(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, aa param12, int param13, int param14) {
        int stackIn_5_0 = 0;
        int var25;
        Object var16 = null;
        nj var16_ref = (nj) (param12);
        int[] var28 = var16_ref.field_h;
        int[] var27 = var28;
        int[] var17 = var27;
        int[] var18 = var16_ref.field_g;
        int var19 = param10;
        if (param14 > var19) {
          var19 = param14;
          param4 = param4 + (param14 - param10) * this.field_f.field_f;
          param3 = param3 + (param14 - param10) * param11;
        }
        if (param14 + var28.length >= param10 + param6) {
          stackIn_5_0 = param10 + param6;
        } else {
          stackIn_5_0 = param14 + var28.length;
        }
        int var20 = stackIn_5_0;
        for (int var21 = var19; var21 < var20; var21++) {
          boolean decompiledFrameRemainder0 = true;
          int var22 = param13 + var17[var21 - param14];
          int var23 = var18[var21 - param14];
          int var24 = param5;
          if (param9 <= var22) {
            var25 = var22 - param9;
            if (var25 >= param5) {
              param3 = param3 + (param5 + param8);
              param4 = param4 + (param5 + param7);
              decompiledFrameRemainder0 = false;
            }
            else {
              param3 = param3 + var25;
              var24 = var24 - var25;
              param4 = param4 + var25;
            }
          } else {
            var25 = param9 - var22;
            if (var25 >= var23) {
              param3 = param3 + (param5 + param8);
              param4 = param4 + (param5 + param7);
              decompiledFrameRemainder0 = false;
            }
            else {
              var23 = var23 - var25;
            }
          }
          if (decompiledFrameRemainder0) {
            int var25Lifetime1 = 0;
            if (var24 >= var23) {
              var25Lifetime1 = var24 - var23;
            } else {
              var23 = var24;
            }
            for (int var26 = 0; var26 < var23; var26++) {
              if (param0[param3++] == 0) {
                param4++;
              } else {
                param1[param4++] = param2;
              }
            }
            param3 = param3 + (var25Lifetime1 + param8);
            param4 = param4 + (var25Lifetime1 + param7);
          }
        }
    }

    private final void a(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var10 = param2 >>> 24;
        int var11 = 255 - var10;
        for (int var12 = -param6; var12 < 0; var12++) {
          for (int var13 = -param5; var13 < 0; var13++) {
            if (param0[param3++] == 0) {
              param4++;
            } else {
              int var14 = ((param2 & 16711935) * var10 & -16711936) + ((param2 & 65280) * var10 & 16711680) >> 8;
              int var15 = param1[param4];
              int incrementValue$12 = param4;
              param4++;
              param1[incrementValue$12] = (((var15 & 16711935) * var11 & -16711936) + ((var15 & 65280) * var11 & 16711680) >> 8) + var14;
            }
          }
          param4 = param4 + param7;
          param3 = param3 + param8;
        }
    }

    tu(kj param0, BitmapFontMetrics param1, SpriteData[] param2, int[] param3, int[] param4) {
        super(param0, param1);
        this.field_f = param0;
        this.field_i = param3;
        this.field_e = param4;
        this.field_h = new byte[param2.length][];
        this.field_j = new int[param2.length];
        this.field_g = new int[param2.length];
        for (int var6 = 0; var6 < param2.length; var6++) {
          this.field_h[var6] = param2[var6].indices;
          this.field_j[var6] = param2[var6].padTop;
          this.field_g[var6] = param2[var6].padLeft;
        }
    }
}
