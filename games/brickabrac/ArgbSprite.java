/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ArgbSprite extends RgbSprite {
    ArgbSprite(int width, int height) {
        super(width, height);
    }

    private final static void blendPixelsReversed(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var10 = 0;
        int var11 = 0;
        int incrementValue$12 = 0;
        int var9;
        int var12;
        int var13;
        int var14;
        var9 = -param5;
        for (var10 = -param6; var10 < 0; var10++) {
          for (var11 = var9; var11 < 0; var11++) {
            param2 = param1[param3--];
            var12 = param2 >>> 24;
            if (var12 == 0) {
              param4++;
            } else {
              var13 = 256 - var12;
              var14 = param0[param4];
              incrementValue$12 = param4;
              param4++;
              param0[incrementValue$12] = ((param2 & 16711935) * var12 + (var14 & 16711935) * var13 & -16711936) + ((param2 & 65280) * var12 + (var14 & 65280) * var13 & 16711680) >>> 8;
            }
          }
          param4 = param4 + param7;
          param3 = param3 + param8;
        }
    }

    private final static void blendPixelsDimmed(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int var10 = 0;
        int var11 = 0;
        int incrementValue$12 = 0;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        for (var10 = -param6; var10 < 0; var10++) {
          for (var11 = -param5; var11 < 0; var11++) {
            param2 = param1[param3++];
            var12 = param2 >>> 24;
            if (var12 == 0) {
              param4++;
            } else {
              var13 = param0[param4];
              var14 = 256 - var12;
              var15 = (param2 & 16711935) * param9 & -16711936;
              var16 = (param2 & 65280) * param9 & 16711680;
              param2 = (var15 | var16) >>> 8;
              incrementValue$12 = param4;
              param4++;
              param0[incrementValue$12] = ((param2 & 16711935) * var12 + (var13 & 16711935) * var14 & -16711936) + ((param2 & 65280) * var12 + (var13 & 65280) * var14 & 16711680) >>> 8;
            }
          }
          param4 = param4 + param7;
          param3 = param3 + param8;
        }
    }

    final void drawVerticallyFlipped(int x, int y) {
        int var9 = 0;
        int var9Lifetime1;
        int var9Lifetime2;
        x = x + this.offsetX;
        y = y + (this.canvasHeight - this.height - this.offsetY);
        int var3 = x + (y + this.height - 1) * Rasterizer2D.width;
        int var4 = 0;
        int var5 = this.height;
        int var6 = this.width;
        int var7 = -Rasterizer2D.width - var6;
        int var8 = 0;
        if (y < Rasterizer2D.clipTop) {
          var5 = var5 - (Rasterizer2D.clipTop - y);
          y = Rasterizer2D.clipTop;
        }
        if (y + var5 > Rasterizer2D.clipBottom) {
          var9 = y + var5 - Rasterizer2D.clipBottom;
          var5 = var5 - var9;
          var3 = var3 - var9 * Rasterizer2D.width;
          var4 = var4 + var9 * var6;
        }
        if (x < Rasterizer2D.clipLeft) {
          var9Lifetime1 = Rasterizer2D.clipLeft - x;
          var6 = var6 - var9Lifetime1;
          x = Rasterizer2D.clipLeft;
          var4 = var4 + var9Lifetime1;
          var3 = var3 + var9Lifetime1;
          var8 = var8 + var9Lifetime1;
          var7 = var7 + var9Lifetime1;
        }
        if (x + var6 > Rasterizer2D.clipRight) {
          var9Lifetime2 = x + var6 - Rasterizer2D.clipRight;
          var6 = var6 - var9Lifetime2;
          var8 = var8 + var9Lifetime2;
          var7 = var7 + var9Lifetime2;
        }
        if (var6 <= 0 ||
          var5 <= 0) {
          return;
        }
        ArgbSprite.blendPixels(Rasterizer2D.pixels, this.pixels, 0, var4, var3, var6, var5, var7, var8);
    }

    private final static void blendNeutralPixelsTinted(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11) {
        int incrementValue$1 = 0;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int var15Lifetime1;
        var12 = param11 & 16711935;
        var13 = param11 >> 8 & 255;
        for (param6 = -param8; param6 < 0; param6++) {
          for (param5 = -param7; param5 < 0; param5++) {
            param2 = param1[param3++];
            var14 = param2 >>> 24;
            param2 = param2 & 16777215;
            if (var14 == 0) {
              param4++;
            } else {
              var15 = 0;
              if (param2 >> 8 != (param2 & 65535)) {
                var15Lifetime1 = param2;
              } else {
                param2 = param2 & 255;
                var15Lifetime1 = (param2 * var12 >> 8 & 16711934) + (param2 * var13 & 65280) + 1;
              }
              var16 = 256 - var14;
              var17 = param0[param4];
              incrementValue$1 = param4;
              param4++;
              param0[incrementValue$1] = ((var15Lifetime1 & 16711935) * var14 + (var17 & 16711935) * var16 & -16711936) + ((var15Lifetime1 & 65280) * var14 + (var17 & 65280) * var16 & 16711680) >>> 8;
            }
          }
          param4 = param4 + param9;
          param3 = param3 + param10;
        }
    }

    final void drawTransparent(int x, int y) {
        int var9 = 0;
        int var9Lifetime1;
        int var9Lifetime2;
        x = x + this.offsetX;
        y = y + this.offsetY;
        int var3 = x + y * Rasterizer2D.width;
        int var4 = 0;
        int var5 = this.height;
        int var6 = this.width;
        int var7 = Rasterizer2D.width - var6;
        int var8 = 0;
        if (y < Rasterizer2D.clipTop) {
          var9 = Rasterizer2D.clipTop - y;
          var5 = var5 - var9;
          y = Rasterizer2D.clipTop;
          var4 = var4 + var9 * var6;
          var3 = var3 + var9 * Rasterizer2D.width;
        }
        if (y + var5 > Rasterizer2D.clipBottom) {
          var5 = var5 - (y + var5 - Rasterizer2D.clipBottom);
        }
        if (x < Rasterizer2D.clipLeft) {
          var9Lifetime1 = Rasterizer2D.clipLeft - x;
          var6 = var6 - var9Lifetime1;
          x = Rasterizer2D.clipLeft;
          var4 = var4 + var9Lifetime1;
          var3 = var3 + var9Lifetime1;
          var8 = var8 + var9Lifetime1;
          var7 = var7 + var9Lifetime1;
        }
        if (x + var6 > Rasterizer2D.clipRight) {
          var9Lifetime2 = x + var6 - Rasterizer2D.clipRight;
          var6 = var6 - var9Lifetime2;
          var8 = var8 + var9Lifetime2;
          var7 = var7 + var9Lifetime2;
        }
        if (var6 <= 0 ||
          var5 <= 0) {
          return;
        }
        ArgbSprite.blendPixels(Rasterizer2D.pixels, this.pixels, 0, var4, var3, var6, var5, var7, var8);
    }

    private final static void blendScaledPixelsWithAlpha(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12) {
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int incrementValue$0 = 0;
        int var13 = param3;
        for (var14 = -param8; var14 < 0; var14++) {
          var15 = (param4 >> 16) * param11;
          for (var16 = -param7; var16 < 0; var16++) {
            var17 = param1[(param3 >> 16) + var15];
            var18 = param0[param5];
            var19 = (var17 >>> 24) * param12 >> 8;
            var20 = 256 - var19;
            incrementValue$0 = param5;
            param5++;
            param0[incrementValue$0] = ((var17 & 16711935) * var19 + (var18 & 16711935) * var20 & -16711936) + ((var17 & 65280) * var19 + (var18 & 65280) * var20 & 16711680) >>> 8;
            param3 = param3 + param9;
          }
          param4 = param4 + param10;
          param3 = var13;
          param5 = param5 + param6;
        }
    }

    final void drawAdditive(int x, int y, int intensity) {
        int var10 = 0;
        int var10Lifetime1;
        int var10Lifetime2;
        x = x + this.offsetX;
        y = y + this.offsetY;
        int var4 = x + y * Rasterizer2D.width;
        int var5 = 0;
        int var6 = this.height;
        int var7 = this.width;
        int var8 = Rasterizer2D.width - var7;
        int var9 = 0;
        if (y < Rasterizer2D.clipTop) {
          var10 = Rasterizer2D.clipTop - y;
          var6 = var6 - var10;
          y = Rasterizer2D.clipTop;
          var5 = var5 + var10 * var7;
          var4 = var4 + var10 * Rasterizer2D.width;
        }
        if (y + var6 > Rasterizer2D.clipBottom) {
          var6 = var6 - (y + var6 - Rasterizer2D.clipBottom);
        }
        if (x < Rasterizer2D.clipLeft) {
          var10Lifetime1 = Rasterizer2D.clipLeft - x;
          var7 = var7 - var10Lifetime1;
          x = Rasterizer2D.clipLeft;
          var5 = var5 + var10Lifetime1;
          var4 = var4 + var10Lifetime1;
          var9 = var9 + var10Lifetime1;
          var8 = var8 + var10Lifetime1;
        }
        if (x + var7 > Rasterizer2D.clipRight) {
          var10Lifetime2 = x + var7 - Rasterizer2D.clipRight;
          var7 = var7 - var10Lifetime2;
          var9 = var9 + var10Lifetime2;
          var8 = var8 + var10Lifetime2;
        }
        if (var7 <= 0 ||
          var6 <= 0) {
          return;
        }
        ArgbSprite.addPixelsWithAlpha(0, 0, 0, Rasterizer2D.pixels, this.pixels, var5, 0, var4, 0, var7, var6, var8, var9, intensity);
    }

    private final static void blendRecoloredNeutralPixels(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int var15 = 0;
        int var16 = 0;
        int incrementValue$6 = 0;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var17;
        int var18;
        int var19;
        int var20;
        int var21;
        int var22;
        int var23;
        var10 = param9 >> 16 & 255;
        var11 = param9 >> 8 & 255;
        var12 = param9 & 255;
        var13 = -(param5 >> 2);
        param5 = -(param5 & 3);
        var14 = var13 + var13 + var13 + var13 + param5;
        for (var15 = -param6; var15 < 0; var15++) {
          for (var16 = var14; var16 < 0; var16++) {
            param2 = param1[param3++];
            var17 = param2 >>> 24;
            if (var17 == 0) {
              param4++;
            } else {
              var19 = param2 >> 16 & 255;
              var20 = param2 >> 8 & 255;
              var21 = param2 & 255;
              if (var19 == var20 &&
                var20 == var21) {
                if (var19 > 128) {
                  var18 = (var10 * (256 - var19) + 255 * (var19 - 128) >> 7 << 16) + (var11 * (256 - var20) + 255 * (var20 - 128) >> 7 << 8) + (var12 * (256 - var21) + 255 * (var21 - 128) >> 7);
                } else {
                  var18 = (var19 * var10 >> 7 << 16) + (var20 * var11 >> 7 << 8) + (var21 * var12 >> 7);
                }
              } else {
                var18 = param2;
              }
              var22 = 256 - var17;
              var23 = param0[param4];
              incrementValue$6 = param4;
              param4++;
              param0[incrementValue$6] = ((var18 & 16711935) * var17 + (var23 & 16711935) * var22 & -16711936) + ((var18 & 65280) * var17 + (var23 & 65280) * var22 & 16711680) >>> 8;
            }
          }
          param4 = param4 + param7;
          param3 = param3 + param8;
        }
    }

    final void drawHalfSize(int x, int y) {
        int var9 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int[] stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        int stackIn_21_2 = 0;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int var18;
        int var19;
        int var20;
        int var21;
        int var13Lifetime1;
        int var14Lifetime1;
        int var19Lifetime1;
        var3 = this.width >> 1;
        var4 = this.height >> 1;
        x = x + this.offsetX / 2;
        y = y + this.offsetY / 2;
        if (x >= Rasterizer2D.clipLeft) {
          stackIn_3_0 = 0;
        } else {
          stackIn_3_0 = Rasterizer2D.clipLeft - x << 1;
        }
        var5 = stackIn_3_0;
        if (x + var3 <= Rasterizer2D.clipRight) {
          stackIn_6_0 = this.width - 2;
        } else {
          stackIn_6_0 = (Rasterizer2D.clipRight - x << 1) - 2;
        }
        var6 = stackIn_6_0;
        if (y >= Rasterizer2D.clipTop) {
          stackIn_9_0 = 0;
        } else {
          stackIn_9_0 = Rasterizer2D.clipTop - y << 1;
        }
        var7 = stackIn_9_0;
        if (y + var4 <= Rasterizer2D.clipBottom) {
          stackIn_12_0 = this.height - 2;
        } else {
          stackIn_12_0 = (Rasterizer2D.clipBottom - y << 1) - 2;
        }
        var8 = stackIn_12_0;
        for (var9 = var7; var9 <= var8; var9 += 2) {
          var10 = var9 * this.width + var5;
          var11 = (y + (var9 >> 1)) * Rasterizer2D.width + (x + (var5 >> 1));
          var12 = var5;
          while (var12 <= var6) {
            var13 = 0;
            var14 = 0;
            var15 = 0;
            var16 = 0;
            var17 = 0;
            var18 = 0;
            for (var19 = 0; var19 < 4; var19++) {
              stackIn_20_0 = this.pixels;
              stackIn_20_1 = var10 + (var19 & 1);
              if ((var19 & 2) != 0) {
                stackIn_21_2 = 0;
              } else {
                stackIn_21_2 = this.width;
              }
              var13Lifetime1 = stackIn_20_0[stackIn_20_1 + stackIn_21_2];
              var14Lifetime1 = var13Lifetime1 >>> 24;
              var18 = var18 + var14Lifetime1;
              var15 = var15 + var14Lifetime1 * (var13Lifetime1 >> 16 & 255);
              var16 = var16 + var14Lifetime1 * (var13Lifetime1 >> 8 & 255);
              var17 = var17 + var14Lifetime1 * (var13Lifetime1 & 255);
            }
            if (var18 != 0) {
              var15 = (var15 / var18 << 16) + var17 / var18;
              var16 = var16 / var18 << 8;
              var19Lifetime1 = var18 >> 2;
              var20 = 256 - var19Lifetime1;
              var21 = Rasterizer2D.pixels[var11];
              Rasterizer2D.pixels[var11] = (var19Lifetime1 * var15 + var20 * (var21 & 16711935) & -16711936) + (var19Lifetime1 * var16 + var20 * (var21 & 65280) & 16711680) >>> 8;
            }
            var12 += 2;
            var11++;
            var10 += 2;
          }
        }
    }

    final void drawQuarterSize(int x, int y) {
        int var10 = 0;
        int var11 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int[] var9;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int var18;
        int var19;
        int var20;
        int var21;
        int[] var22;
        int[] var23;
        int var14Lifetime1;
        int var14Lifetime2;
        int var15Lifetime1;
        int var19Lifetime1;
        int[] var23Lifetime1;
        var3 = this.width >> 2;
        var4 = this.height >> 2;
        x = x + this.offsetX / 4;
        y = y + this.offsetY / 4;
        if (x >= Rasterizer2D.clipLeft) {
          stackIn_3_0 = 0;
        } else {
          stackIn_3_0 = Rasterizer2D.clipLeft - x << 2;
        }
        var5 = stackIn_3_0;
        if (x + var3 <= Rasterizer2D.clipRight) {
          stackIn_6_0 = this.width - 4;
        } else {
          stackIn_6_0 = (Rasterizer2D.clipRight - x << 2) - 4;
        }
        var6 = stackIn_6_0;
        if (y >= Rasterizer2D.clipTop) {
          stackIn_9_0 = 0;
        } else {
          stackIn_9_0 = Rasterizer2D.clipTop - y << 2;
        }
        var7 = stackIn_9_0;
        if (y + var4 <= Rasterizer2D.clipBottom) {
          stackIn_12_0 = this.height - 4;
        } else {
          stackIn_12_0 = (Rasterizer2D.clipBottom - y << 2) - 4;
        }
        var8 = stackIn_12_0;
        var23 = new int[16];
        var22 = var23;
        var9 = var22;
        for (var10 = var7; var10 <= var8; var10 += 4) {
          for (var11 = var5; var11 <= var6; var11 += 4) {
            var12 = var10 * this.width + var11;
            var13 = (y + (var10 >> 2)) * Rasterizer2D.width + (x + (var11 >> 2));
            for (var14 = 0; var14 < 4; var14++) {
              for (var15 = 0; var15 < 4; var15++) {
                var9[(var14 << 2) + var15] = this.pixels[var12 + var14 * this.width + var15];
              }
            }
            var23Lifetime1 = var22;
            var14Lifetime1 = 0;
            var15Lifetime1 = 0;
            var16 = 0;
            var17 = 0;
            var18 = 0;
            for (var19 = 0; var19 < 16; var19++) {
              var14Lifetime2 = var23Lifetime1[var19] >>> 24;
              var15Lifetime1 = var15Lifetime1 + var14Lifetime2;
              var16 = var16 + var14Lifetime2 * (var23Lifetime1[var19] >> 16 & 255);
              var17 = var17 + var14Lifetime2 * (var23Lifetime1[var19] >> 8 & 255);
              var18 = var18 + var14Lifetime2 * (var23Lifetime1[var19] & 255);
            }
            if (var15Lifetime1 != 0) {
              var16 = (var16 / var15Lifetime1 << 16) + var18 / var15Lifetime1;
              var17 = var17 / var15Lifetime1 << 8;
              var19Lifetime1 = var15Lifetime1 >> 4;
              var20 = 256 - var19Lifetime1;
              var21 = Rasterizer2D.pixels[var13];
              Rasterizer2D.pixels[var13] = (var19Lifetime1 * var16 + var20 * (var21 & 16711935) & -16711936) + (var19Lifetime1 * var17 + var20 * (var21 & 65280) & 16711680) >>> 8;
            }
          }
        }
    }

    final void drawScaled(int x, int y, int destinationWidth, int destinationHeight) {
        int var13 = 0;
        int var15 = 0;
        int var13Lifetime1;
        int var13Lifetime2;
        int var15Lifetime1;
        int var15Lifetime2;
        if (destinationWidth <= 0 ||
          destinationHeight <= 0) {
          return;
        }
        int var5 = this.width;
        int var6 = this.height;
        int var7 = 0;
        int var8 = 0;
        int var9 = this.canvasWidth;
        int var10 = this.canvasHeight;
        int var11 = (var9 << 16) / destinationWidth;
        int var12 = (var10 << 16) / destinationHeight;
        if (this.offsetX > 0) {
          var13 = ((this.offsetX << 16) + var11 - 1) / var11;
          x = x + var13;
          var7 = var7 + (var13 * var11 - (this.offsetX << 16));
        }
        if (this.offsetY > 0) {
          var13Lifetime1 = ((this.offsetY << 16) + var12 - 1) / var12;
          y = y + var13Lifetime1;
          var8 = var8 + (var13Lifetime1 * var12 - (this.offsetY << 16));
        }
        if (var5 < var9) {
          destinationWidth = ((var5 << 16) - var7 + var11 - 1) / var11;
        }
        if (var6 < var10) {
          destinationHeight = ((var6 << 16) - var8 + var12 - 1) / var12;
        }
        var13Lifetime2 = x + y * Rasterizer2D.width;
        int var14 = Rasterizer2D.width - destinationWidth;
        if (y + destinationHeight > Rasterizer2D.clipBottom) {
          destinationHeight = destinationHeight - (y + destinationHeight - Rasterizer2D.clipBottom);
        }
        if (y < Rasterizer2D.clipTop) {
          var15 = Rasterizer2D.clipTop - y;
          destinationHeight = destinationHeight - var15;
          var13Lifetime2 = var13Lifetime2 + var15 * Rasterizer2D.width;
          var8 = var8 + var12 * var15;
        }
        if (x + destinationWidth > Rasterizer2D.clipRight) {
          var15Lifetime1 = x + destinationWidth - Rasterizer2D.clipRight;
          destinationWidth = destinationWidth - var15Lifetime1;
          var14 = var14 + var15Lifetime1;
        }
        if (x < Rasterizer2D.clipLeft) {
          var15Lifetime2 = Rasterizer2D.clipLeft - x;
          destinationWidth = destinationWidth - var15Lifetime2;
          var13Lifetime2 = var13Lifetime2 + var15Lifetime2;
          var7 = var7 + var11 * var15Lifetime2;
          var14 = var14 + var15Lifetime2;
        }
        ArgbSprite.blendScaledPixels(Rasterizer2D.pixels, this.pixels, 0, var7, var8, var13Lifetime2, var14, destinationWidth, destinationHeight, var11, var12, var5);
    }

    final void drawDimmed(int x, int y, int brightness) {
        int var10 = 0;
        int var10Lifetime1;
        int var10Lifetime2;
        if (brightness == 256) {
          this.drawTransparent(x, y);
          return;
        }
        x = x + this.offsetX;
        y = y + this.offsetY;
        int var4 = x + y * Rasterizer2D.width;
        int var5 = 0;
        int var6 = this.height;
        int var7 = this.width;
        int var8 = Rasterizer2D.width - var7;
        int var9 = 0;
        if (y < Rasterizer2D.clipTop) {
          var10 = Rasterizer2D.clipTop - y;
          var6 = var6 - var10;
          y = Rasterizer2D.clipTop;
          var5 = var5 + var10 * var7;
          var4 = var4 + var10 * Rasterizer2D.width;
        }
        if (y + var6 > Rasterizer2D.clipBottom) {
          var6 = var6 - (y + var6 - Rasterizer2D.clipBottom);
        }
        if (x < Rasterizer2D.clipLeft) {
          var10Lifetime1 = Rasterizer2D.clipLeft - x;
          var7 = var7 - var10Lifetime1;
          x = Rasterizer2D.clipLeft;
          var5 = var5 + var10Lifetime1;
          var4 = var4 + var10Lifetime1;
          var9 = var9 + var10Lifetime1;
          var8 = var8 + var10Lifetime1;
        }
        if (x + var7 > Rasterizer2D.clipRight) {
          var10Lifetime2 = x + var7 - Rasterizer2D.clipRight;
          var7 = var7 - var10Lifetime2;
          var9 = var9 + var10Lifetime2;
          var8 = var8 + var10Lifetime2;
        }
        if (var7 <= 0 ||
          var6 <= 0) {
          return;
        }
        ArgbSprite.blendPixelsDimmed(Rasterizer2D.pixels, this.pixels, 0, var5, var4, var7, var6, var8, var9, brightness);
    }

    ArgbSprite(int canvasWidth, int canvasHeight, int offsetX, int offsetY, int width, int height, int[] pixels) {
        super(canvasWidth, canvasHeight, offsetX, offsetY, width, height, pixels);
    }

    final void drawHorizontallyFlipped(int x, int y) {
        int var9 = 0;
        int var9Lifetime1;
        int var9Lifetime2;
        x = x + (this.canvasWidth - this.width - this.offsetX);
        y = y + this.offsetY;
        int var3 = x + y * Rasterizer2D.width;
        int var4 = this.width - 1;
        int var5 = this.height;
        int var6 = this.width;
        int var7 = Rasterizer2D.width - var6;
        int var8 = var6 + var6;
        if (y < Rasterizer2D.clipTop) {
          var9 = Rasterizer2D.clipTop - y;
          var5 = var5 - var9;
          y = Rasterizer2D.clipTop;
          var4 = var4 + var9 * var6;
          var3 = var3 + var9 * Rasterizer2D.width;
        }
        if (y + var5 > Rasterizer2D.clipBottom) {
          var5 = var5 - (y + var5 - Rasterizer2D.clipBottom);
        }
        if (x < Rasterizer2D.clipLeft) {
          var9Lifetime1 = Rasterizer2D.clipLeft - x;
          var6 = var6 - var9Lifetime1;
          x = Rasterizer2D.clipLeft;
          var4 = var4 - var9Lifetime1;
          var3 = var3 + var9Lifetime1;
          var8 = var8 - var9Lifetime1;
          var7 = var7 + var9Lifetime1;
        }
        if (x + var6 > Rasterizer2D.clipRight) {
          var9Lifetime2 = x + var6 - Rasterizer2D.clipRight;
          var6 = var6 - var9Lifetime2;
          var8 = var8 - var9Lifetime2;
          var7 = var7 + var9Lifetime2;
        }
        if (var6 <= 0 ||
          var5 <= 0) {
          return;
        }
        ArgbSprite.blendPixelsReversed(Rasterizer2D.pixels, this.pixels, 0, var4, var3, var6, var5, var7, var8);
    }

    final void drawScaledAlphaBlended(int x, int y, int destinationWidth, int destinationHeight, int alpha) {
        int var14 = 0;
        int var16 = 0;
        int var14Lifetime1;
        int var14Lifetime2;
        int var16Lifetime1;
        int var16Lifetime2;
        if (destinationWidth <= 0 ||
          destinationHeight <= 0) {
          return;
        }
        int var6 = this.width;
        int var7 = this.height;
        int var8 = 0;
        int var9 = 0;
        int var10 = this.canvasWidth;
        int var11 = this.canvasHeight;
        int var12 = (var10 << 16) / destinationWidth;
        int var13 = (var11 << 16) / destinationHeight;
        if (this.offsetX > 0) {
          var14 = ((this.offsetX << 16) + var12 - 1) / var12;
          x = x + var14;
          var8 = var8 + (var14 * var12 - (this.offsetX << 16));
        }
        if (this.offsetY > 0) {
          var14Lifetime1 = ((this.offsetY << 16) + var13 - 1) / var13;
          y = y + var14Lifetime1;
          var9 = var9 + (var14Lifetime1 * var13 - (this.offsetY << 16));
        }
        if (var6 < var10) {
          destinationWidth = ((var6 << 16) - var8 + var12 - 1) / var12;
        }
        if (var7 < var11) {
          destinationHeight = ((var7 << 16) - var9 + var13 - 1) / var13;
        }
        var14Lifetime2 = x + y * Rasterizer2D.width;
        int var15 = Rasterizer2D.width - destinationWidth;
        if (y + destinationHeight > Rasterizer2D.clipBottom) {
          destinationHeight = destinationHeight - (y + destinationHeight - Rasterizer2D.clipBottom);
        }
        if (y < Rasterizer2D.clipTop) {
          var16 = Rasterizer2D.clipTop - y;
          destinationHeight = destinationHeight - var16;
          var14Lifetime2 = var14Lifetime2 + var16 * Rasterizer2D.width;
          var9 = var9 + var13 * var16;
        }
        if (x + destinationWidth > Rasterizer2D.clipRight) {
          var16Lifetime1 = x + destinationWidth - Rasterizer2D.clipRight;
          destinationWidth = destinationWidth - var16Lifetime1;
          var15 = var15 + var16Lifetime1;
        }
        if (x < Rasterizer2D.clipLeft) {
          var16Lifetime2 = Rasterizer2D.clipLeft - x;
          destinationWidth = destinationWidth - var16Lifetime2;
          var14Lifetime2 = var14Lifetime2 + var16Lifetime2;
          var8 = var8 + var12 * var16Lifetime2;
          var15 = var15 + var16Lifetime2;
        }
        ArgbSprite.blendScaledPixelsWithAlpha(Rasterizer2D.pixels, this.pixels, 0, var8, var9, var14Lifetime2, var15, destinationWidth, destinationHeight, var12, var13, var6, alpha);
    }

    final void drawAt(int x, int y) {
        int var9 = 0;
        int var9Lifetime1;
        int var9Lifetime2;
        x = x + this.offsetX;
        y = y + this.offsetY;
        int var3 = x + y * Rasterizer2D.width;
        int var4 = 0;
        int var5 = this.height;
        int var6 = this.width;
        int var7 = Rasterizer2D.width - var6;
        int var8 = 0;
        if (y < Rasterizer2D.clipTop) {
          var9 = Rasterizer2D.clipTop - y;
          var5 = var5 - var9;
          y = Rasterizer2D.clipTop;
          var4 = var4 + var9 * var6;
          var3 = var3 + var9 * Rasterizer2D.width;
        }
        if (y + var5 > Rasterizer2D.clipBottom) {
          var5 = var5 - (y + var5 - Rasterizer2D.clipBottom);
        }
        if (x < Rasterizer2D.clipLeft) {
          var9Lifetime1 = Rasterizer2D.clipLeft - x;
          var6 = var6 - var9Lifetime1;
          x = Rasterizer2D.clipLeft;
          var4 = var4 + var9Lifetime1;
          var3 = var3 + var9Lifetime1;
          var8 = var8 + var9Lifetime1;
          var7 = var7 + var9Lifetime1;
        }
        if (x + var6 > Rasterizer2D.clipRight) {
          var9Lifetime2 = x + var6 - Rasterizer2D.clipRight;
          var6 = var6 - var9Lifetime2;
          var8 = var8 + var9Lifetime2;
          var7 = var7 + var9Lifetime2;
        }
        if (var6 <= 0 ||
          var5 <= 0) {
          return;
        }
        ArgbSprite.blendPixels(Rasterizer2D.pixels, this.pixels, 0, var4, var3, var6, var5, var7, var8);
    }

    private final static void blendScaledPixels(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11) {
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var18 = 0;
        int incrementValue$0 = 0;
        int var17 = 0;
        int var12 = param3;
        for (var13 = -param8; var13 < 0; var13++) {
          var14 = (param4 >> 16) * param11;
          for (var15 = -param7; var15 < 0; var15++) {
            param2 = param1[(param3 >> 16) + var14];
            var16 = param2 >>> 24;
            if (var16 != 0) {
              var17 = 256 - var16;
              var18 = param0[param5];
              incrementValue$0 = param5;
              param5++;
              param0[incrementValue$0] = ((param2 & 16711935) * var16 + (var18 & 16711935) * var17 & -16711936) + ((param2 & 65280) * var16 + (var18 & 65280) * var17 & 16711680) >>> 8;
            } else {
              param5++;
            }
            param3 = param3 + param9;
          }
          param4 = param4 + param10;
          param3 = var12;
          param5 = param5 + param6;
        }
    }

    private final static void blendPixels(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var10 = 0;
        int var11 = 0;
        int incrementValue$12 = 0;
        int var9;
        int var12;
        int var13;
        int var14;
        var9 = -param5;
        for (var10 = -param6; var10 < 0; var10++) {
          for (var11 = var9; var11 < 0; var11++) {
            param2 = param1[param3++];
            var12 = param2 >>> 24;
            if (var12 == 0) {
              param4++;
            } else {
              var13 = 256 - var12;
              var14 = param0[param4];
              incrementValue$12 = param4;
              param4++;
              param0[incrementValue$12] = ((param2 & 16711935) * var12 + (var14 & 16711935) * var13 & -16711936) + ((param2 & 65280) * var12 + (var14 & 65280) * var13 & 16711680) >>> 8;
            }
          }
          param4 = param4 + param7;
          param3 = param3 + param8;
        }
    }

    final void drawNeutralPixelsTinted(int x, int y, int tintRgb) {
        int var10 = 0;
        int var10Lifetime1;
        int var10Lifetime2;
        x = x + this.offsetX;
        y = y + this.offsetY;
        int var4 = x + y * Rasterizer2D.width;
        int var5 = 0;
        int var6 = this.height;
        int var7 = this.width;
        int var8 = Rasterizer2D.width - var7;
        int var9 = 0;
        if (y < Rasterizer2D.clipTop) {
          var10 = Rasterizer2D.clipTop - y;
          var6 = var6 - var10;
          y = Rasterizer2D.clipTop;
          var5 = var5 + var10 * var7;
          var4 = var4 + var10 * Rasterizer2D.width;
        }
        if (y + var6 > Rasterizer2D.clipBottom) {
          var6 = var6 - (y + var6 - Rasterizer2D.clipBottom);
        }
        if (x < Rasterizer2D.clipLeft) {
          var10Lifetime1 = Rasterizer2D.clipLeft - x;
          var7 = var7 - var10Lifetime1;
          x = Rasterizer2D.clipLeft;
          var5 = var5 + var10Lifetime1;
          var4 = var4 + var10Lifetime1;
          var9 = var9 + var10Lifetime1;
          var8 = var8 + var10Lifetime1;
        }
        if (x + var7 > Rasterizer2D.clipRight) {
          var10Lifetime2 = x + var7 - Rasterizer2D.clipRight;
          var7 = var7 - var10Lifetime2;
          var9 = var9 + var10Lifetime2;
          var8 = var8 + var10Lifetime2;
        }
        if (var7 <= 0 ||
          var6 <= 0) {
          return;
        }
        ArgbSprite.blendNeutralPixelsTinted(Rasterizer2D.pixels, this.pixels, 0, var5, var4, 0, 0, var7, var6, var8, var9, tintRgb);
    }

    final void drawNeutralPixelsRecolored(int x, int y, int tintRgb) {
        int var10 = 0;
        int var10Lifetime1;
        int var10Lifetime2;
        x = x + this.offsetX;
        y = y + this.offsetY;
        int var4 = x + y * Rasterizer2D.width;
        int var5 = 0;
        int var6 = this.height;
        int var7 = this.width;
        int var8 = Rasterizer2D.width - var7;
        int var9 = 0;
        if (y < Rasterizer2D.clipTop) {
          var10 = Rasterizer2D.clipTop - y;
          var6 = var6 - var10;
          y = Rasterizer2D.clipTop;
          var5 = var5 + var10 * var7;
          var4 = var4 + var10 * Rasterizer2D.width;
        }
        if (y + var6 > Rasterizer2D.clipBottom) {
          var6 = var6 - (y + var6 - Rasterizer2D.clipBottom);
        }
        if (x < Rasterizer2D.clipLeft) {
          var10Lifetime1 = Rasterizer2D.clipLeft - x;
          var7 = var7 - var10Lifetime1;
          x = Rasterizer2D.clipLeft;
          var5 = var5 + var10Lifetime1;
          var4 = var4 + var10Lifetime1;
          var9 = var9 + var10Lifetime1;
          var8 = var8 + var10Lifetime1;
        }
        if (x + var7 > Rasterizer2D.clipRight) {
          var10Lifetime2 = x + var7 - Rasterizer2D.clipRight;
          var7 = var7 - var10Lifetime2;
          var9 = var9 + var10Lifetime2;
          var8 = var8 + var10Lifetime2;
        }
        if (var7 <= 0 ||
          var6 <= 0) {
          return;
        }
        ArgbSprite.blendRecoloredNeutralPixels(Rasterizer2D.pixels, this.pixels, 0, var5, var4, var7, var6, var8, var9, tintRgb);
    }

    final void drawAlphaBlended(int x, int y, int alpha) {
        int var10 = 0;
        int var10Lifetime1;
        int var10Lifetime2;
        x = x + this.offsetX;
        y = y + this.offsetY;
        int var4 = x + y * Rasterizer2D.width;
        int var5 = 0;
        int var6 = this.height;
        int var7 = this.width;
        int var8 = Rasterizer2D.width - var7;
        int var9 = 0;
        if (y < Rasterizer2D.clipTop) {
          var10 = Rasterizer2D.clipTop - y;
          var6 = var6 - var10;
          y = Rasterizer2D.clipTop;
          var5 = var5 + var10 * var7;
          var4 = var4 + var10 * Rasterizer2D.width;
        }
        if (y + var6 > Rasterizer2D.clipBottom) {
          var6 = var6 - (y + var6 - Rasterizer2D.clipBottom);
        }
        if (x < Rasterizer2D.clipLeft) {
          var10Lifetime1 = Rasterizer2D.clipLeft - x;
          var7 = var7 - var10Lifetime1;
          x = Rasterizer2D.clipLeft;
          var5 = var5 + var10Lifetime1;
          var4 = var4 + var10Lifetime1;
          var9 = var9 + var10Lifetime1;
          var8 = var8 + var10Lifetime1;
        }
        if (x + var7 > Rasterizer2D.clipRight) {
          var10Lifetime2 = x + var7 - Rasterizer2D.clipRight;
          var7 = var7 - var10Lifetime2;
          var9 = var9 + var10Lifetime2;
          var8 = var8 + var10Lifetime2;
        }
        if (var7 <= 0 ||
          var6 <= 0) {
          return;
        }
        ArgbSprite.blendPixelsWithAlpha(Rasterizer2D.pixels, this.pixels, 0, var5, var4, var7, var6, var8, var9, alpha);
    }

    final void drawWithVerticalAlphaGradient(int x, int y, int startAlpha, int endAlpha) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        if (this.height == 0) {
          return;
        }
        var5 = this.height;
        var6 = this.width;
        var7 = startAlpha << 8;
        var8 = (endAlpha - startAlpha << 8) / var5;
        var9 = 0;
        if (x < Rasterizer2D.clipLeft) {
          var6 = var6 - (Rasterizer2D.clipLeft - x);
          var9 = var9 + (Rasterizer2D.clipLeft - x);
          x = Rasterizer2D.clipLeft;
        }
        if (y < Rasterizer2D.clipTop) {
          var7 = var7 + (Rasterizer2D.clipTop - y) * var8;
          var5 = var5 - (Rasterizer2D.clipTop - y);
          var9 = var9 + (Rasterizer2D.clipTop - y) * Rasterizer2D.width;
          y = Rasterizer2D.clipTop;
        }
        if (x + var6 > Rasterizer2D.clipRight) {
          var6 = Rasterizer2D.clipRight - x;
        }
        if (y + var5 > Rasterizer2D.clipBottom) {
          var5 = Rasterizer2D.clipBottom - y;
        }
        var10 = Rasterizer2D.width - var6;
        var11 = this.width - var6;
        var12 = x + y * Rasterizer2D.width;
        for (y = -var5; y < 0; y++) {
          var13 = var7 >> 8;
          if (var13 >= 0) {
            for (x = -var6; x < 0; x++) {
              var14 = (this.pixels[var9] >>> 24) * var13 >> 8;
              var15 = 256 - var14;
              incrementValue$0 = var9;
              var9++;
              var16 = this.pixels[incrementValue$0];
              var17 = Rasterizer2D.pixels[var12];
              incrementValue$1 = var12;
              var12++;
              Rasterizer2D.pixels[incrementValue$1] = ((var16 & 16711935) * var14 + (var17 & 16711935) * var15 & -16711936) + ((var16 & 65280) * var14 + (var17 & 65280) * var15 & 16711680) >>> 8;
            }
            var12 = var12 + var10;
            var9 = var9 + var11;
            var7 = var7 + var8;
          }
        }
        return;
    }

    private final static void addPixelsWithAlpha(int param0, int param1, int param2, int[] param3, int[] param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13) {
        int incrementValue$12 = 0;
        int var14;
        for (param8 = -param10; param8 < 0; param8++) {
          for (param6 = -param9; param6 < 0; param6++) {
            param0 = param4[param5++];
            if (param0 == 0) {
              param7++;
            } else {
              var14 = param13 * (param0 >>> 24) >> 8 & 255;
              param1 = (param0 & 16711935) * var14;
              param0 = (param1 & -16711936) + (param0 * var14 - param1 & 16711680) >>> 8;
              param1 = param3[param7];
              param2 = param0 + param1;
              param0 = (param0 & 16711935) + (param1 & 16711935);
              param1 = (param0 & 16777472) + (param2 - param0 & 65536);
              incrementValue$12 = param7;
              param7++;
              param3[incrementValue$12] = param2 - param1 | param1 - (param1 >>> 8);
            }
          }
          param7 = param7 + param11;
          param5 = param5 + param12;
        }
    }

    private final static void blendPixelsWithAlpha(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int incrementValue$1 = 0;
        for (var10 = -param6; var10 < 0; var10++) {
          for (var11 = -param5; var11 < 0; var11++) {
            var12 = (param1[param3] >>> 24) * param9 >> 8;
            var13 = 256 - var12;
            var14 = param1[param3++];
            var15 = param0[param4];
            incrementValue$1 = param4;
            param4++;
            param0[incrementValue$1] = ((var14 & 16711935) * var12 + (var15 & 16711935) * var13 & -16711936) + ((var14 & 65280) * var12 + (var15 & 65280) * var13 & 16711680) >>> 8;
          }
          param4 = param4 + param7;
          param3 = param3 + param8;
        }
    }
}
