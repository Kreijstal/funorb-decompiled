/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ArgbSprite extends Sprite {
    final void b(int param0, int param1, int param2) {
        param0 = param0 + this.trimX;
        param1 = param1 + this.trimY;
        int var4 = param0 + param1 * SoftwareRasterizer.stride;
        int var5 = 0;
        int var6 = this.height;
        int var7 = this.width;
        int var8 = SoftwareRasterizer.stride - var7;
        int var9 = 0;
        if (param1 < SoftwareRasterizer.clipTop) {
          int var10 = SoftwareRasterizer.clipTop - param1;
          var6 = var6 - var10;
          param1 = SoftwareRasterizer.clipTop;
          var5 = var5 + var10 * var7;
          var4 = var4 + var10 * SoftwareRasterizer.stride;
        }
        if (param1 + var6 > SoftwareRasterizer.clipBottom) {
          var6 = var6 - (param1 + var6 - SoftwareRasterizer.clipBottom);
        }
        if (param0 < SoftwareRasterizer.clipLeft) {
          int var10Lifetime1 = SoftwareRasterizer.clipLeft - param0;
          var7 = var7 - var10Lifetime1;
          param0 = SoftwareRasterizer.clipLeft;
          var5 = var5 + var10Lifetime1;
          var4 = var4 + var10Lifetime1;
          var9 = var9 + var10Lifetime1;
          var8 = var8 + var10Lifetime1;
        }
        if (param0 + var7 > SoftwareRasterizer.clipRight) {
          int var10Lifetime2 = param0 + var7 - SoftwareRasterizer.clipRight;
          var7 = var7 - var10Lifetime2;
          var9 = var9 + var10Lifetime2;
          var8 = var8 + var10Lifetime2;
        }
        if (var7 <= 0 ||
          var6 <= 0) {
          return;
        }
        ArgbSprite.c(SoftwareRasterizer.framebuffer, this.pixels, 0, var5, var4, var7, var6, var8, var9, param2);
    }

    final void d(int param0, int param1, int param2) {
        param0 = param0 + this.trimX;
        param1 = param1 + this.trimY;
        int var4 = param0 + param1 * SoftwareRasterizer.stride;
        int var5 = 0;
        int var6 = this.height;
        int var7 = this.width;
        int var8 = SoftwareRasterizer.stride - var7;
        int var9 = 0;
        if (param1 < SoftwareRasterizer.clipTop) {
          int var10 = SoftwareRasterizer.clipTop - param1;
          var6 = var6 - var10;
          param1 = SoftwareRasterizer.clipTop;
          var5 = var5 + var10 * var7;
          var4 = var4 + var10 * SoftwareRasterizer.stride;
        }
        if (param1 + var6 > SoftwareRasterizer.clipBottom) {
          var6 = var6 - (param1 + var6 - SoftwareRasterizer.clipBottom);
        }
        if (param0 < SoftwareRasterizer.clipLeft) {
          int var10Lifetime1 = SoftwareRasterizer.clipLeft - param0;
          var7 = var7 - var10Lifetime1;
          param0 = SoftwareRasterizer.clipLeft;
          var5 = var5 + var10Lifetime1;
          var4 = var4 + var10Lifetime1;
          var9 = var9 + var10Lifetime1;
          var8 = var8 + var10Lifetime1;
        }
        if (param0 + var7 > SoftwareRasterizer.clipRight) {
          int var10Lifetime2 = param0 + var7 - SoftwareRasterizer.clipRight;
          var7 = var7 - var10Lifetime2;
          var9 = var9 + var10Lifetime2;
          var8 = var8 + var10Lifetime2;
        }
        if (var7 <= 0 ||
          var6 <= 0) {
          return;
        }
        ArgbSprite.b(0, 0, 0, SoftwareRasterizer.framebuffer, this.pixels, var5, 0, var4, 0, var7, var6, var8, var9, param2);
    }

    final void b(int param0, int param1) {
        param0 = param0 + this.trimX;
        param1 = param1 + this.trimY;
        int var3 = param0 + param1 * SoftwareRasterizer.stride;
        int var4 = 0;
        int var5 = this.height;
        int var6 = this.width;
        int var7 = SoftwareRasterizer.stride - var6;
        int var8 = 0;
        if (param1 < SoftwareRasterizer.clipTop) {
          int var9 = SoftwareRasterizer.clipTop - param1;
          var5 = var5 - var9;
          param1 = SoftwareRasterizer.clipTop;
          var4 = var4 + var9 * var6;
          var3 = var3 + var9 * SoftwareRasterizer.stride;
        }
        if (param1 + var5 > SoftwareRasterizer.clipBottom) {
          var5 = var5 - (param1 + var5 - SoftwareRasterizer.clipBottom);
        }
        if (param0 < SoftwareRasterizer.clipLeft) {
          int var9Lifetime1 = SoftwareRasterizer.clipLeft - param0;
          var6 = var6 - var9Lifetime1;
          param0 = SoftwareRasterizer.clipLeft;
          var4 = var4 + var9Lifetime1;
          var3 = var3 + var9Lifetime1;
          var8 = var8 + var9Lifetime1;
          var7 = var7 + var9Lifetime1;
        }
        if (param0 + var6 > SoftwareRasterizer.clipRight) {
          int var9Lifetime2 = param0 + var6 - SoftwareRasterizer.clipRight;
          var6 = var6 - var9Lifetime2;
          var8 = var8 + var9Lifetime2;
          var7 = var7 + var9Lifetime2;
        }
        if (var6 <= 0 ||
          var5 <= 0) {
          return;
        }
        ArgbSprite.c(SoftwareRasterizer.framebuffer, this.pixels, 0, var4, var3, var6, var5, var7, var8);
    }

    ArgbSprite(int fullWidth, int fullHeight, int trimX, int trimY, int width, int height, int[] pixels) {
        super(fullWidth, fullHeight, trimX, trimY, width, height, pixels);
    }

    ArgbSprite(int width, int height) {
        super(width, height);
    }

    private final static void b(int param0, int param1, int param2, int[] param3, int[] param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13) {
        for (param8 = -param10; param8 < 0; param8++) {
          for (param6 = -param9; param6 < 0; param6++) {
            param0 = param4[param5++];
            if (param0 == 0) {
              param7++;
            } else {
              int var14 = param13 * (param0 >>> 24) >> 8 & 255;
              param1 = (param0 & 16711935) * var14;
              param0 = (param1 & -16711936) + (param0 * var14 - param1 & 16711680) >>> 8;
              param1 = param3[param7];
              param2 = param0 + param1;
              param0 = (param0 & 16711935) + (param1 & 16711935);
              param1 = (param0 & 16777472) + (param2 - param0 & 65536);
              int incrementValue$12 = param7;
              param7++;
              param3[incrementValue$12] = param2 - param1 | param1 - (param1 >>> 8);
            }
          }
          param7 = param7 + param11;
          param5 = param5 + param12;
        }
    }

    final void d(int param0, int param1) {
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_21_2 = 0;
        int var3 = this.width >> 1;
        int var4 = this.height >> 1;
        param0 = param0 + this.trimX / 2;
        param1 = param1 + this.trimY / 2;
        if (param0 >= SoftwareRasterizer.clipLeft) {
          stackIn_3_0 = 0;
        } else {
          stackIn_3_0 = SoftwareRasterizer.clipLeft - param0 << 1;
        }
        int var5 = stackIn_3_0;
        if (param0 + var3 <= SoftwareRasterizer.clipRight) {
          stackIn_6_0 = this.width - 2;
        } else {
          stackIn_6_0 = (SoftwareRasterizer.clipRight - param0 << 1) - 2;
        }
        int var6 = stackIn_6_0;
        if (param1 >= SoftwareRasterizer.clipTop) {
          stackIn_9_0 = 0;
        } else {
          stackIn_9_0 = SoftwareRasterizer.clipTop - param1 << 1;
        }
        int var7 = stackIn_9_0;
        if (param1 + var4 <= SoftwareRasterizer.clipBottom) {
          stackIn_12_0 = this.height - 2;
        } else {
          stackIn_12_0 = (SoftwareRasterizer.clipBottom - param1 << 1) - 2;
        }
        int var8 = stackIn_12_0;
        for (int var9 = var7; var9 <= var8; var9 += 2) {
          int var10 = var9 * this.width + var5;
          int var11 = (param1 + (var9 >> 1)) * SoftwareRasterizer.stride + (param0 + (var5 >> 1));
          int var12 = var5;
          while (var12 <= var6) {
            int var13 = 0;
            int var14 = 0;
            int var15 = 0;
            int var16 = 0;
            int var17 = 0;
            int var18 = 0;
            for (int var19 = 0; var19 < 4; var19++) {
              int[] stackIn_20_0 = this.pixels;
              int stackIn_20_1 = var10 + (var19 & 1);
              if ((var19 & 2) != 0) {
                stackIn_21_2 = 0;
              } else {
                stackIn_21_2 = this.width;
              }
              int var13Lifetime1 = stackIn_20_0[stackIn_20_1 + stackIn_21_2];
              int var14Lifetime1 = var13Lifetime1 >>> 24;
              var18 = var18 + var14Lifetime1;
              var15 = var15 + var14Lifetime1 * (var13Lifetime1 >> 16 & 255);
              var16 = var16 + var14Lifetime1 * (var13Lifetime1 >> 8 & 255);
              var17 = var17 + var14Lifetime1 * (var13Lifetime1 & 255);
            }
            if (var18 != 0) {
              var15 = (var15 / var18 << 16) + var17 / var18;
              var16 = var16 / var18 << 8;
              int var19Lifetime1 = var18 >> 2;
              int var20 = 256 - var19Lifetime1;
              int var21 = SoftwareRasterizer.framebuffer[var11];
              SoftwareRasterizer.framebuffer[var11] = (var19Lifetime1 * var15 + var20 * (var21 & 16711935) & -16711936) + (var19Lifetime1 * var16 + var20 * (var21 & 65280) & 16711680) >>> 8;
            }
            var12 += 2;
            var11++;
            var10 += 2;
          }
        }
    }

    private final static void d(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        for (int var10 = -param6; var10 < 0; var10++) {
          for (int var11 = -param5; var11 < 0; var11++) {
            int var12 = (param1[param3] >>> 24) * param9 >> 8;
            int var13 = 256 - var12;
            int var14 = param1[param3++];
            int var15 = param0[param4];
            int incrementValue$1 = param4;
            param4++;
            param0[incrementValue$1] = ((var14 & 16711935) * var12 + (var15 & 16711935) * var13 & -16711936) + ((var14 & 65280) * var12 + (var15 & 65280) * var13 & 16711680) >>> 8;
          }
          param4 = param4 + param7;
          param3 = param3 + param8;
        }
    }

    final void a(int param0, int param1, int param2) {
        param0 = param0 + this.trimX;
        param1 = param1 + this.trimY;
        int var4 = param0 + param1 * SoftwareRasterizer.stride;
        int var5 = 0;
        int var6 = this.height;
        int var7 = this.width;
        int var8 = SoftwareRasterizer.stride - var7;
        int var9 = 0;
        if (param1 < SoftwareRasterizer.clipTop) {
          int var10 = SoftwareRasterizer.clipTop - param1;
          var6 = var6 - var10;
          param1 = SoftwareRasterizer.clipTop;
          var5 = var5 + var10 * var7;
          var4 = var4 + var10 * SoftwareRasterizer.stride;
        }
        if (param1 + var6 > SoftwareRasterizer.clipBottom) {
          var6 = var6 - (param1 + var6 - SoftwareRasterizer.clipBottom);
        }
        if (param0 < SoftwareRasterizer.clipLeft) {
          int var10Lifetime1 = SoftwareRasterizer.clipLeft - param0;
          var7 = var7 - var10Lifetime1;
          param0 = SoftwareRasterizer.clipLeft;
          var5 = var5 + var10Lifetime1;
          var4 = var4 + var10Lifetime1;
          var9 = var9 + var10Lifetime1;
          var8 = var8 + var10Lifetime1;
        }
        if (param0 + var7 > SoftwareRasterizer.clipRight) {
          int var10Lifetime2 = param0 + var7 - SoftwareRasterizer.clipRight;
          var7 = var7 - var10Lifetime2;
          var9 = var9 + var10Lifetime2;
          var8 = var8 + var10Lifetime2;
        }
        if (var7 <= 0 ||
          var6 <= 0) {
          return;
        }
        ArgbSprite.d(SoftwareRasterizer.framebuffer, this.pixels, 0, var5, var4, var7, var6, var8, var9, param2);
    }

    private final static void c(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var9 = -param5;
        for (int var10 = -param6; var10 < 0; var10++) {
          for (int var11 = var9; var11 < 0; var11++) {
            param2 = param1[param3++];
            int var12 = param2 >>> 24;
            if (var12 == 0) {
              param4++;
            } else {
              int var13 = 256 - var12;
              int var14 = param0[param4];
              int incrementValue$12 = param4;
              param4++;
              param0[incrementValue$12] = ((param2 & 16711935) * var12 + (var14 & 16711935) * var13 & -16711936) + ((param2 & 65280) * var12 + (var14 & 65280) * var13 & 16711680) >>> 8;
            }
          }
          param4 = param4 + param7;
          param3 = param3 + param8;
        }
    }

    private final static void c(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int var18;
        int var10 = param9 >> 16 & 255;
        int var11 = param9 >> 8 & 255;
        int var12 = param9 & 255;
        int var13 = -(param5 >> 2);
        param5 = -(param5 & 3);
        int var14 = var13 + var13 + var13 + var13 + param5;
        for (int var15 = -param6; var15 < 0; var15++) {
          for (int var16 = var14; var16 < 0; var16++) {
            param2 = param1[param3++];
            int var17 = param2 >>> 24;
            if (var17 == 0) {
              param4++;
            } else {
              int var19 = param2 >> 16 & 255;
              int var20 = param2 >> 8 & 255;
              int var21 = param2 & 255;
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
              int var22 = 256 - var17;
              int var23 = param0[param4];
              int incrementValue$6 = param4;
              param4++;
              param0[incrementValue$6] = ((var18 & 16711935) * var17 + (var23 & 16711935) * var22 & -16711936) + ((var18 & 65280) * var17 + (var23 & 65280) * var22 & 16711680) >>> 8;
            }
          }
          param4 = param4 + param7;
          param3 = param3 + param8;
        }
    }

    final void c(int param0, int param1) {
        param0 = param0 + this.trimX;
        param1 = param1 + this.trimY;
        int var3 = param0 + param1 * SoftwareRasterizer.stride;
        int var4 = 0;
        int var5 = this.height;
        int var6 = this.width;
        int var7 = SoftwareRasterizer.stride - var6;
        int var8 = 0;
        if (param1 < SoftwareRasterizer.clipTop) {
          int var9 = SoftwareRasterizer.clipTop - param1;
          var5 = var5 - var9;
          param1 = SoftwareRasterizer.clipTop;
          var4 = var4 + var9 * var6;
          var3 = var3 + var9 * SoftwareRasterizer.stride;
        }
        if (param1 + var5 > SoftwareRasterizer.clipBottom) {
          var5 = var5 - (param1 + var5 - SoftwareRasterizer.clipBottom);
        }
        if (param0 < SoftwareRasterizer.clipLeft) {
          int var9Lifetime1 = SoftwareRasterizer.clipLeft - param0;
          var6 = var6 - var9Lifetime1;
          param0 = SoftwareRasterizer.clipLeft;
          var4 = var4 + var9Lifetime1;
          var3 = var3 + var9Lifetime1;
          var8 = var8 + var9Lifetime1;
          var7 = var7 + var9Lifetime1;
        }
        if (param0 + var6 > SoftwareRasterizer.clipRight) {
          int var9Lifetime2 = param0 + var6 - SoftwareRasterizer.clipRight;
          var6 = var6 - var9Lifetime2;
          var8 = var8 + var9Lifetime2;
          var7 = var7 + var9Lifetime2;
        }
        if (var6 <= 0 ||
          var5 <= 0) {
          return;
        }
        ArgbSprite.c(SoftwareRasterizer.framebuffer, this.pixels, 0, var4, var3, var6, var5, var7, var8);
    }
}
