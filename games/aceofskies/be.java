/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class be extends RendererBitmapFont {
    private int[] field_g;
    private byte[][] field_k;
    private int[] field_f;
    private int[] field_i;
    private int[] field_e;
    private kj field_h;
    private int[] field_j;

    final void drawGlyphWithMask(char glyph, int x, int y, int color, boolean shadowPass, aa mask, int maskX, int maskY) {
        if (mask == null) {
          this.drawGlyph(glyph, x, y, color, shadowPass);
          return;
        }
        x = x + this.field_e[glyph];
        y = y + this.field_f[glyph];
        int var9 = this.field_j[glyph];
        int var10 = this.field_g[glyph];
        int var11 = this.field_h.field_f;
        int var12 = x + y * var11;
        int var13 = var11 - var9;
        int var14 = 0;
        int var15 = 0;
        if (y < this.field_h.field_w) {
          int var16 = this.field_h.field_w - y;
          var10 = var10 - var16;
          y = this.field_h.field_w;
          var15 = var15 + var16 * var9;
          var12 = var12 + var16 * var11;
        }
        if (y + var10 > this.field_h.field_D) {
          var10 = var10 - (y + var10 - this.field_h.field_D);
        }
        if (x < this.field_h.field_z) {
          int var16Lifetime1 = this.field_h.field_z - x;
          var9 = var9 - var16Lifetime1;
          x = this.field_h.field_z;
          var15 = var15 + var16Lifetime1;
          var12 = var12 + var16Lifetime1;
          var14 = var14 + var16Lifetime1;
          var13 = var13 + var16Lifetime1;
        }
        if (x + var9 > this.field_h.field_k) {
          int var16Lifetime2 = x + var9 - this.field_h.field_k;
          var9 = var9 - var16Lifetime2;
          var14 = var14 + var16Lifetime2;
          var13 = var13 + var16Lifetime2;
        }
        if (var9 <= 0 ||
          var10 <= 0) {
          return;
        }
        if (shadowPass) {
          this.a(this.field_k[glyph], this.field_h.field_E, color, var15, var12, var9, var10, var13, var14, x, y, this.field_j[glyph], mask, maskX, maskY);
        } else {
          this.a(this.field_k[glyph], this.field_h.field_E, this.field_i, color, var15, var12, var9, var10, var13, var14, x, y, this.field_j[glyph], mask, maskX, maskY);
        }
    }

    private final void a(byte[] param0, int[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var10 = -(param5 >> 2);
        param5 = -(param5 & 3);
        int var11 = 0;
        for (int var12 = -param6; var12 < 0; var12++) {
          for (int var13 = var10; var13 < 0; var13++) {
            int incrementValue$3 = param3;
            param3++;
            byte dupTemp$4 = param0[incrementValue$3];
            int var11Lifetime1 = dupTemp$4;
            if (dupTemp$4 == 0) {
              param4++;
            } else {
              int incrementValue$5 = param4;
              param4++;
              param1[incrementValue$5] = param2[var11Lifetime1 & 255];
            }
            int incrementValue$6 = param3;
            param3++;
            byte dupTemp$7 = param0[incrementValue$6];
            int var11Lifetime1Lifetime2 = dupTemp$7;
            if (dupTemp$7 == 0) {
              param4++;
            } else {
              int incrementValue$8 = param4;
              param4++;
              param1[incrementValue$8] = param2[var11Lifetime1Lifetime2 & 255];
            }
            int incrementValue$9 = param3;
            param3++;
            byte dupTemp$10 = param0[incrementValue$9];
            int var11Lifetime1Lifetime3 = dupTemp$10;
            if (dupTemp$10 == 0) {
              param4++;
            } else {
              int incrementValue$11 = param4;
              param4++;
              param1[incrementValue$11] = param2[var11Lifetime1Lifetime3 & 255];
            }
            int incrementValue$12 = param3;
            param3++;
            byte dupTemp$13 = param0[incrementValue$12];
            int var11Lifetime1Lifetime4 = dupTemp$13;
            if (dupTemp$13 == 0) {
              param4++;
            } else {
              int incrementValue$14 = param4;
              param4++;
              param1[incrementValue$14] = param2[var11Lifetime1Lifetime4 & 255];
            }
          }
          for (int var13Lifetime1 = param5; var13Lifetime1 < 0; var13Lifetime1++) {
            int incrementValue$0 = param3;
            param3++;
            byte dupTemp$1 = param0[incrementValue$0];
            int var11Lifetime1Lifetime1 = dupTemp$1;
            if (dupTemp$1 == 0) {
              param4++;
            } else {
              int incrementValue$2 = param4;
              param4++;
              param1[incrementValue$2] = param2[var11Lifetime1Lifetime1 & 255];
            }
          }
          param4 = param4 + param7;
          param3 = param3 + param8;
        }
    }

    private final void a(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
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

    be(kj param0, BitmapFontMetrics param1, SpriteData[] param2, int[] param3, int[] param4) {
        super(param0, param1);
        this.field_h = param0;
        this.field_h = param0;
        this.field_j = param3;
        this.field_g = param4;
        this.field_k = new byte[param2.length][];
        this.field_f = new int[param2.length];
        this.field_e = new int[param2.length];
        for (int var6 = 0; var6 < param2.length; var6++) {
          this.field_k[var6] = param2[var6].indices;
          this.field_f[var6] = param2[var6].padTop;
          this.field_e[var6] = param2[var6].padLeft;
        }
        this.field_i = param2[0].palette;
    }

    private final void a(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, aa param12, int param13, int param14) {
        int stackIn_5_0 = 0;
        int var26;
        Object var16 = null;
        nj var16_ref = (nj) (param12);
        int[] var29 = var16_ref.field_h;
        int[] var28 = var29;
        int[] var17 = var28;
        int[] var18 = var16_ref.field_g;
        int var19 = param9 - this.field_h.field_z;
        int var20 = param10;
        if (param14 > var20) {
          var20 = param14;
          param4 = param4 + (param14 - param10) * this.field_h.field_f;
          param3 = param3 + (param14 - param10) * param11;
        }
        if (param14 + var29.length >= param10 + param6) {
          stackIn_5_0 = param10 + param6;
        } else {
          stackIn_5_0 = param14 + var29.length;
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
              if (param0[param3++] == 0) {
                param4++;
              } else {
                param1[param4++] = param2;
              }
            }
            param3 = param3 + (var26Lifetime1 + param3);
            param4 = param4 + (var26Lifetime1 + param7);
          }
        }
    }

    private final void a(byte[] param0, int[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, aa param13, int param14, int param15) {
        int stackIn_5_0 = 0;
        int var28;
        Object var17 = null;
        nj var17_ref = (nj) (param13);
        int[] var31 = var17_ref.field_h;
        int[] var30 = var31;
        int[] var18 = var30;
        int[] var19 = var17_ref.field_g;
        int var20 = param10 - this.field_h.field_z;
        int var21 = param11;
        if (param15 > var21) {
          var21 = param15;
          param5 = param5 + (param15 - param11) * this.field_h.field_f;
          param4 = param4 + (param15 - param11) * param12;
        }
        if (param15 + var31.length >= param11 + param7) {
          stackIn_5_0 = param11 + param7;
        } else {
          stackIn_5_0 = param15 + var31.length;
        }
        int var22 = stackIn_5_0;
        int var23 = 0;
        for (int var24 = var21; var24 < var22; var24++) {
          boolean decompiledFrameRemainder0 = true;
          int var25 = var18[var24 - param15] + param14;
          int var26 = var19[var24 - param15];
          int var27 = param6;
          if (var20 <= var25) {
            var28 = var25 - var20;
            if (var28 >= param6) {
              param4 = param4 + (param6 + param9);
              param5 = param5 + (param6 + param8);
              decompiledFrameRemainder0 = false;
            }
            else {
              param4 = param4 + var28;
              var27 = var27 - var28;
              param5 = param5 + var28;
            }
          } else {
            var28 = var20 - var25;
            if (var28 >= var26) {
              param4 = param4 + (param6 + param9);
              param5 = param5 + (param6 + param8);
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
              int incrementValue$0 = param4;
              param4++;
              byte dupTemp$1 = param0[incrementValue$0];
              int var23Lifetime1 = dupTemp$1;
              if (dupTemp$1 == 0) {
                param5++;
              } else {
                int incrementValue$2 = param5;
                param5++;
                param1[incrementValue$2] = param2[var23Lifetime1 & 255];
              }
            }
            param4 = param4 + (var28Lifetime1 + param9);
            param5 = param5 + (var28Lifetime1 + param8);
          }
        }
    }

    final void drawGlyph(char glyph, int x, int y, int color, boolean shadowPass) {
        x = x + this.field_e[glyph];
        y = y + this.field_f[glyph];
        int var6 = this.field_j[glyph];
        int var7 = this.field_g[glyph];
        int var8 = this.field_h.field_f;
        int var9 = x + y * var8;
        int var10 = var8 - var6;
        int var11 = 0;
        int var12 = 0;
        if (y < this.field_h.field_w) {
          int var13 = this.field_h.field_w - y;
          var7 = var7 - var13;
          y = this.field_h.field_w;
          var12 = var12 + var13 * var6;
          var9 = var9 + var13 * var8;
        }
        if (y + var7 > this.field_h.field_D) {
          var7 = var7 - (y + var7 - this.field_h.field_D);
        }
        if (x < this.field_h.field_z) {
          int var13Lifetime1 = this.field_h.field_z - x;
          var6 = var6 - var13Lifetime1;
          x = this.field_h.field_z;
          var12 = var12 + var13Lifetime1;
          var9 = var9 + var13Lifetime1;
          var11 = var11 + var13Lifetime1;
          var10 = var10 + var13Lifetime1;
        }
        if (x + var6 > this.field_h.field_k) {
          int var13Lifetime2 = x + var6 - this.field_h.field_k;
          var6 = var6 - var13Lifetime2;
          var11 = var11 + var13Lifetime2;
          var10 = var10 + var13Lifetime2;
        }
        if (var6 <= 0 ||
          var7 <= 0) {
          return;
        }
        if (shadowPass) {
          this.a(this.field_k[glyph], this.field_h.field_E, color, var12, var9, var6, var7, var10, var11);
        } else {
          this.a(this.field_k[glyph], this.field_h.field_E, this.field_i, var12, var9, var6, var7, var10, var11);
        }
    }
}
