/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uh extends Sprite {
    final void a(int param0, int param1, int param2, int param3, int param4) {
        if (param2 > 0) {
          if (param3 <= 0) {
            return;
          }
          int var6 = this.width;
          int var7 = this.height;
          int var8 = 0;
          int var9 = 0;
          int var10 = this.fullWidth;
          int var11 = this.fullHeight;
          int var12 = (var10 << 16) / param2;
          int var13 = (var11 << 16) / param3;
          if (this.offsetX > 0) {
            int var14 = ((this.offsetX << 16) + var12 - 1) / var12;
            param0 = param0 + var14;
            var8 = var8 + (var14 * var12 - (this.offsetX << 16));
          }
          if (this.offsetY > 0) {
            int var14Lifetime1 = ((this.offsetY << 16) + var13 - 1) / var13;
            param1 = param1 + var14Lifetime1;
            var9 = var9 + (var14Lifetime1 * var13 - (this.offsetY << 16));
          }
          if (var6 < var10) {
            param2 = ((var6 << 16) - var8 + var12 - 1) / var12;
          }
          if (var7 < var11) {
            param3 = ((var7 << 16) - var9 + var13 - 1) / var13;
          }
          int var14Lifetime2 = param0 + param1 * SoftwareRasterizer.width;
          int var15 = SoftwareRasterizer.width - param2;
          if (param1 + param3 > SoftwareRasterizer.clipBottom) {
            param3 = param3 - (param1 + param3 - SoftwareRasterizer.clipBottom);
          }
          if (param1 < SoftwareRasterizer.clipTop) {
            int var16 = SoftwareRasterizer.clipTop - param1;
            param3 = param3 - var16;
            var14Lifetime2 = var14Lifetime2 + var16 * SoftwareRasterizer.width;
            var9 = var9 + var13 * var16;
          }
          if (param0 + param2 > SoftwareRasterizer.clipRight) {
            int var16Lifetime1 = param0 + param2 - SoftwareRasterizer.clipRight;
            param2 = param2 - var16Lifetime1;
            var15 = var15 + var16Lifetime1;
          }
          if (param0 < SoftwareRasterizer.clipLeft) {
            int var16Lifetime2 = SoftwareRasterizer.clipLeft - param0;
            param2 = param2 - var16Lifetime2;
            var14Lifetime2 = var14Lifetime2 + var16Lifetime2;
            var8 = var8 + var12 * var16Lifetime2;
            var15 = var15 + var16Lifetime2;
          }
          uh.b(SoftwareRasterizer.pixels, this.pixels, 0, var8, var9, var14Lifetime2, var15, param2, param3, var12, var13, var6, param4);
          return;
        }
    }

    final void g(int param0, int param1) {
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_21_2 = 0;
        int var3 = this.width >> 1;
        int var4 = this.height >> 1;
        param0 = param0 + this.offsetX / 2;
        param1 = param1 + this.offsetY / 2;
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
          int var11 = (param1 + (var9 >> 1)) * SoftwareRasterizer.width + (param0 + (var5 >> 1));
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
              int var21 = SoftwareRasterizer.pixels[var11];
              SoftwareRasterizer.pixels[var11] = (var19Lifetime1 * var15 + var20 * (var21 & 16711935) & -16711936) + (var19Lifetime1 * var16 + var20 * (var21 & 65280) & 16711680) >>> 8;
            }
            var12 += 2;
            var11++;
            var10 += 2;
          }
        }
    }

    final void d(int param0, int param1) {
        param0 = param0 + this.offsetX;
        param1 = param1 + this.offsetY;
        int var3 = param0 + param1 * SoftwareRasterizer.width;
        int var4 = 0;
        int var5 = this.height;
        int var6 = this.width;
        int var7 = SoftwareRasterizer.width - var6;
        int var8 = 0;
        if (param1 < SoftwareRasterizer.clipTop) {
          int var9 = SoftwareRasterizer.clipTop - param1;
          var5 = var5 - var9;
          param1 = SoftwareRasterizer.clipTop;
          var4 = var4 + var9 * var6;
          var3 = var3 + var9 * SoftwareRasterizer.width;
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
        if (var6 > 0) {
          if (var5 <= 0) {
            return;
          }
          uh.d(SoftwareRasterizer.pixels, this.pixels, 0, var4, var3, var6, var5, var7, var8);
          return;
        }
    }

    uh(int param0, int param1) {
        super(param0, param1);
    }

    final void b(int param0, int param1, int param2, int param3) {
        if (param2 > 0) {
          if (param3 <= 0) {
            return;
          }
          int var5 = this.width;
          int var6 = this.height;
          int var7 = 0;
          int var8 = 0;
          int var9 = this.fullWidth;
          int var10 = this.fullHeight;
          int var11 = (var9 << 16) / param2;
          int var12 = (var10 << 16) / param3;
          if (this.offsetX > 0) {
            int var13 = ((this.offsetX << 16) + var11 - 1) / var11;
            param0 = param0 + var13;
            var7 = var7 + (var13 * var11 - (this.offsetX << 16));
          }
          if (this.offsetY > 0) {
            int var13Lifetime1 = ((this.offsetY << 16) + var12 - 1) / var12;
            param1 = param1 + var13Lifetime1;
            var8 = var8 + (var13Lifetime1 * var12 - (this.offsetY << 16));
          }
          if (var5 < var9) {
            param2 = ((var5 << 16) - var7 + var11 - 1) / var11;
          }
          if (var6 < var10) {
            param3 = ((var6 << 16) - var8 + var12 - 1) / var12;
          }
          int var13Lifetime2 = param0 + param1 * SoftwareRasterizer.width;
          int var14 = SoftwareRasterizer.width - param2;
          if (param1 + param3 > SoftwareRasterizer.clipBottom) {
            param3 = param3 - (param1 + param3 - SoftwareRasterizer.clipBottom);
          }
          if (param1 < SoftwareRasterizer.clipTop) {
            int var15 = SoftwareRasterizer.clipTop - param1;
            param3 = param3 - var15;
            var13Lifetime2 = var13Lifetime2 + var15 * SoftwareRasterizer.width;
            var8 = var8 + var12 * var15;
          }
          if (param0 + param2 > SoftwareRasterizer.clipRight) {
            int var15Lifetime1 = param0 + param2 - SoftwareRasterizer.clipRight;
            param2 = param2 - var15Lifetime1;
            var14 = var14 + var15Lifetime1;
          }
          if (param0 < SoftwareRasterizer.clipLeft) {
            int var15Lifetime2 = SoftwareRasterizer.clipLeft - param0;
            param2 = param2 - var15Lifetime2;
            var13Lifetime2 = var13Lifetime2 + var15Lifetime2;
            var7 = var7 + var11 * var15Lifetime2;
            var14 = var14 + var15Lifetime2;
          }
          uh.c(SoftwareRasterizer.pixels, this.pixels, 0, var7, var8, var13Lifetime2, var14, param2, param3, var11, var12, var5);
          return;
        }
    }

    final void b(int param0, int param1, int param2) {
        if (param2 == 256) {
          this.e(param0, param1);
          return;
        }
        param0 = param0 + this.offsetX;
        param1 = param1 + this.offsetY;
        int var4 = param0 + param1 * SoftwareRasterizer.width;
        int var5 = 0;
        int var6 = this.height;
        int var7 = this.width;
        int var8 = SoftwareRasterizer.width - var7;
        int var9 = 0;
        if (param1 < SoftwareRasterizer.clipTop) {
          int var10 = SoftwareRasterizer.clipTop - param1;
          var6 = var6 - var10;
          param1 = SoftwareRasterizer.clipTop;
          var5 = var5 + var10 * var7;
          var4 = var4 + var10 * SoftwareRasterizer.width;
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
        if (var7 > 0) {
          if (var6 <= 0) {
            return;
          }
          uh.d(SoftwareRasterizer.pixels, this.pixels, 0, var5, var4, var7, var6, var8, var9, param2);
          return;
        }
    }

    final void c(int param0, int param1, int param2) {
        param0 = param0 + this.offsetX;
        param1 = param1 + this.offsetY;
        int var4 = param0 + param1 * SoftwareRasterizer.width;
        int var5 = 0;
        int var6 = this.height;
        int var7 = this.width;
        int var8 = SoftwareRasterizer.width - var7;
        int var9 = 0;
        if (param1 < SoftwareRasterizer.clipTop) {
          int var10 = SoftwareRasterizer.clipTop - param1;
          var6 = var6 - var10;
          param1 = SoftwareRasterizer.clipTop;
          var5 = var5 + var10 * var7;
          var4 = var4 + var10 * SoftwareRasterizer.width;
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
        if (var7 > 0) {
          if (var6 <= 0) {
            return;
          }
          uh.b(0, 0, 0, SoftwareRasterizer.pixels, this.pixels, var5, 0, var4, 0, var7, var6, var8, var9, param2);
          return;
        }
    }

    private final static void d(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11) {
        int var15Lifetime1;
        int var12 = param11 & 16711935;
        int var13 = param11 >> 8 & 255;
        for (param6 = -param8; param6 < 0; param6++) {
          for (param5 = -param7; param5 < 0; param5++) {
            param2 = param1[param3++];
            int var14 = param2 >>> 24;
            param2 = param2 & 16777215;
            if (var14 == 0) {
              param4++;
            } else {
              int var15 = 0;
              if (param2 >> 8 != (param2 & 65535)) {
                var15Lifetime1 = param2;
              } else {
                param2 = param2 & 255;
                var15Lifetime1 = (param2 * var12 >> 8 & 16711934) + (param2 * var13 & 65280) + 1;
              }
              int var16 = 256 - var14;
              int var17 = param0[param4];
              int incrementValue$1 = param4;
              param4++;
              param0[incrementValue$1] = ((var15Lifetime1 & 16711935) * var14 + (var17 & 16711935) * var16 & -16711936) + ((var15Lifetime1 & 65280) * var14 + (var17 & 65280) * var16 & 16711680) >>> 8;
            }
          }
          param4 = param4 + param9;
          param3 = param3 + param10;
        }
    }

    private final static void e(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var9 = -param5;
        for (int var10 = -param6; var10 < 0; var10++) {
          for (int var11 = var9; var11 < 0; var11++) {
            param2 = param1[param3--];
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

    final void a(int param0, int param1, int param2) {
        param0 = param0 + this.offsetX;
        param1 = param1 + this.offsetY;
        int var4 = param0 + param1 * SoftwareRasterizer.width;
        int var5 = 0;
        int var6 = this.height;
        int var7 = this.width;
        int var8 = SoftwareRasterizer.width - var7;
        int var9 = 0;
        if (param1 < SoftwareRasterizer.clipTop) {
          int var10 = SoftwareRasterizer.clipTop - param1;
          var6 = var6 - var10;
          param1 = SoftwareRasterizer.clipTop;
          var5 = var5 + var10 * var7;
          var4 = var4 + var10 * SoftwareRasterizer.width;
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
        if (var7 > 0) {
          if (var6 <= 0) {
            return;
          }
          uh.d(SoftwareRasterizer.pixels, this.pixels, 0, var5, var4, 0, 0, var7, var6, var8, var9, param2);
          return;
        }
    }

    private final static void d(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
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

    final void c(int param0, int param1) {
        param0 = param0 + (this.fullWidth - this.width - this.offsetX);
        param1 = param1 + this.offsetY;
        int var3 = param0 + param1 * SoftwareRasterizer.width;
        int var4 = this.width - 1;
        int var5 = this.height;
        int var6 = this.width;
        int var7 = SoftwareRasterizer.width - var6;
        int var8 = var6 + var6;
        if (param1 < SoftwareRasterizer.clipTop) {
          int var9 = SoftwareRasterizer.clipTop - param1;
          var5 = var5 - var9;
          param1 = SoftwareRasterizer.clipTop;
          var4 = var4 + var9 * var6;
          var3 = var3 + var9 * SoftwareRasterizer.width;
        }
        if (param1 + var5 > SoftwareRasterizer.clipBottom) {
          var5 = var5 - (param1 + var5 - SoftwareRasterizer.clipBottom);
        }
        if (param0 < SoftwareRasterizer.clipLeft) {
          int var9Lifetime1 = SoftwareRasterizer.clipLeft - param0;
          var6 = var6 - var9Lifetime1;
          param0 = SoftwareRasterizer.clipLeft;
          var4 = var4 - var9Lifetime1;
          var3 = var3 + var9Lifetime1;
          var8 = var8 - var9Lifetime1;
          var7 = var7 + var9Lifetime1;
        }
        if (param0 + var6 > SoftwareRasterizer.clipRight) {
          int var9Lifetime2 = param0 + var6 - SoftwareRasterizer.clipRight;
          var6 = var6 - var9Lifetime2;
          var8 = var8 - var9Lifetime2;
          var7 = var7 + var9Lifetime2;
        }
        if (var6 > 0) {
          if (var5 <= 0) {
            return;
          }
          uh.e(SoftwareRasterizer.pixels, this.pixels, 0, var4, var3, var6, var5, var7, var8);
          return;
        }
    }

    private final static void b(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12) {
        int var13 = param3;
        for (int var14 = -param8; var14 < 0; var14++) {
          int var15 = (param4 >> 16) * param11;
          for (int var16 = -param7; var16 < 0; var16++) {
            int var17 = param1[(param3 >> 16) + var15];
            int var18 = param0[param5];
            int var19 = (var17 >>> 24) * param12 >> 8;
            int var20 = 256 - var19;
            int incrementValue$0 = param5;
            param5++;
            param0[incrementValue$0] = ((var17 & 16711935) * var19 + (var18 & 16711935) * var20 & -16711936) + ((var17 & 65280) * var19 + (var18 & 65280) * var20 & 16711680) >>> 8;
            param3 = param3 + param9;
          }
          param4 = param4 + param10;
          param3 = var13;
          param5 = param5 + param6;
        }
    }

    final void e(int param0, int param1) {
        param0 = param0 + this.offsetX;
        param1 = param1 + this.offsetY;
        int var3 = param0 + param1 * SoftwareRasterizer.width;
        int var4 = 0;
        int var5 = this.height;
        int var6 = this.width;
        int var7 = SoftwareRasterizer.width - var6;
        int var8 = 0;
        if (param1 < SoftwareRasterizer.clipTop) {
          int var9 = SoftwareRasterizer.clipTop - param1;
          var5 = var5 - var9;
          param1 = SoftwareRasterizer.clipTop;
          var4 = var4 + var9 * var6;
          var3 = var3 + var9 * SoftwareRasterizer.width;
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
        if (var6 > 0) {
          if (var5 <= 0) {
            return;
          }
          uh.d(SoftwareRasterizer.pixels, this.pixels, 0, var4, var3, var6, var5, var7, var8);
          return;
        }
    }

    private final static void e(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
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

    private final static void c(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11) {
        int var12 = param3;
        for (int var13 = -param8; var13 < 0; var13++) {
          int var14 = (param4 >> 16) * param11;
          for (int var15 = -param7; var15 < 0; var15++) {
            param2 = param1[(param3 >> 16) + var14];
            int var16 = param2 >>> 24;
            if (var16 != 0) {
              int var17 = 256 - var16;
              int var18 = param0[param5];
              int incrementValue$0 = param5;
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

    private final static void d(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        for (int var10 = -param6; var10 < 0; var10++) {
          for (int var11 = -param5; var11 < 0; var11++) {
            param2 = param1[param3++];
            int var12 = param2 >>> 24;
            if (var12 == 0) {
              param4++;
            } else {
              int var13 = param0[param4];
              int var14 = 256 - var12;
              int var15 = (param2 & 16711935) * param9 & -16711936;
              int var16 = (param2 & 65280) * param9 & 16711680;
              param2 = (var15 | var16) >>> 8;
              int incrementValue$12 = param4;
              param4++;
              param0[incrementValue$12] = ((param2 & 16711935) * var12 + (var13 & 16711935) * var14 & -16711936) + ((param2 & 65280) * var12 + (var13 & 65280) * var14 & 16711680) >>> 8;
            }
          }
          param4 = param4 + param7;
          param3 = param3 + param8;
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var19;
        int var20;
        int var21;
        int var22;
        if (param5 == 0) {
          return;
        }
        param0 = param0 - (this.offsetX << 4);
        param1 = param1 - (this.offsetY << 4);
        double var7 = (double)(param4 & 65535) * 0.00009587379924285257;
        int var9 = (int)Math.floor(Math.sin(var7) * (double)param5 + 0.5);
        int var10 = (int)Math.floor(Math.cos(var7) * (double)param5 + 0.5);
        int var11 = -param0 * var10 + -param1 * var9;
        int var12 = -(-param0) * var9 + -param1 * var10;
        int var13 = ((this.width << 4) - param0) * var10 + -param1 * var9;
        int var14 = -((this.width << 4) - param0) * var9 + -param1 * var10;
        int var15 = -param0 * var10 + ((this.height << 4) - param1) * var9;
        int var16 = -(-param0) * var9 + ((this.height << 4) - param1) * var10;
        int var17 = ((this.width << 4) - param0) * var10 + ((this.height << 4) - param1) * var9;
        int var18 = -((this.width << 4) - param0) * var9 + ((this.height << 4) - param1) * var10;
        if (var11 >= var13) {
          var19 = var13;
          var20 = var11;
        } else {
          var19 = var11;
          var20 = var13;
        }
        if (var15 < var19) {
          var19 = var15;
        }
        if (var17 < var19) {
          var19 = var17;
        }
        if (var15 > var20) {
          var20 = var15;
        }
        if (var17 > var20) {
          var20 = var17;
        }
        if (var12 >= var14) {
          var21 = var14;
          var22 = var12;
        } else {
          var21 = var12;
          var22 = var14;
        }
        if (var16 < var21) {
          var21 = var16;
        }
        if (var18 < var21) {
          var21 = var18;
        }
        if (var16 > var22) {
          var22 = var16;
        }
        if (var18 > var22) {
          var22 = var18;
        }
        var19 = var19 >> 12;
        var20 = var20 + 4095 >> 12;
        var21 = var21 >> 12;
        var22 = var22 + 4095 >> 12;
        var19 = var19 + param2;
        var20 = var20 + param2;
        var21 = var21 + param3;
        var22 = var22 + param3;
        var19 = var19 >> 4;
        var20 = var20 + 15 >> 4;
        var21 = var21 >> 4;
        var22 = var22 + 15 >> 4;
        if (var19 < SoftwareRasterizer.clipLeft) {
          var19 = SoftwareRasterizer.clipLeft;
        }
        if (var20 > SoftwareRasterizer.clipRight) {
          var20 = SoftwareRasterizer.clipRight;
        }
        if (var21 < SoftwareRasterizer.clipTop) {
          var21 = SoftwareRasterizer.clipTop;
        }
        if (var22 > SoftwareRasterizer.clipBottom) {
          var22 = SoftwareRasterizer.clipBottom;
        }
        var20 = var19 - var20;
        if (var20 >= 0) {
          return;
        }
        var22 = var21 - var22;
        if (var22 >= 0) {
          return;
        }
        int var23 = var21 * SoftwareRasterizer.width + var19;
        double var24 = 16777216.0 / (double)param5;
        int var26 = (int)Math.floor(Math.sin(var7) * var24 + 0.5);
        int var27 = (int)Math.floor(Math.cos(var7) * var24 + 0.5);
        int var28 = (var19 << 4) + 8 - param2;
        int var29 = (var21 << 4) + 8 - param3;
        int var30 = (param0 << 8) - (var29 * var26 >> 4);
        int var31 = (param1 << 8) + (var29 * var27 >> 4);
        if (var27 == 0) {
          if (var26 == 0) {
            int var33 = var22;
            while (var33 < 0) {
              int var34 = var23;
              int var35 = var30;
              int var36 = var31;
              int var37 = var20;
              if (var35 >= 0 &&
                var36 >= 0 &&
                var35 - (this.width << 12) < 0 &&
                var36 - (this.height << 12) < 0) {
                while (var37 < 0) {
                  int var38 = this.pixels[(var36 >> 12) * this.width + (var35 >> 12)];
                  int var39 = SoftwareRasterizer.pixels[var34];
                  int var40 = var38 >>> 24;
                  int var41 = 256 - var40;
                  int incrementValue$8 = var34;
                  var34++;
                  SoftwareRasterizer.pixels[incrementValue$8] = ((var38 & 16711935) * var40 + (var39 & 16711935) * var41 & -16711936) + ((var38 & 65280) * var40 + (var39 & 65280) * var41 & 16711680) >>> 8;
                  var37++;
                }
              }
              var33++;
              var23 = var23 + SoftwareRasterizer.width;
            }
            return;
          }
          if (var26 >= 0) {
            int var33Lifetime5 = var22;
            while (var33Lifetime5 < 0) {
              int var34Lifetime5 = var23;
              int var35Lifetime5 = var30;
              int var36Lifetime5 = var31 + (var28 * var26 >> 4);
              int var37Lifetime5 = var20;
              if (var35Lifetime5 >= 0 &&
                var35Lifetime5 - (this.width << 12) < 0) {
                if (var36Lifetime5 < 0) {
                  int var32 = (var26 - 1 - var36Lifetime5) / var26;
                  var37Lifetime5 = var37Lifetime5 + var32;
                  var36Lifetime5 = var36Lifetime5 + var26 * var32;
                  var34Lifetime5 = var34Lifetime5 + var32;
                }
                int var32Lifetime6 = (1 + var36Lifetime5 - (this.height << 12) - var26) / var26;
                if ((1 + var36Lifetime5 - (this.height << 12) - var26) / var26 > var37Lifetime5) {
                  var37Lifetime5 = var32Lifetime6;
                }
                while (var37Lifetime5 < 0) {
                  int var38Lifetime5 = this.pixels[(var36Lifetime5 >> 12) * this.width + (var35Lifetime5 >> 12)];
                  int var39Lifetime5 = SoftwareRasterizer.pixels[var34Lifetime5];
                  int var40Lifetime5 = var38Lifetime5 >>> 24;
                  int var41Lifetime5 = 256 - var40Lifetime5;
                  int incrementValue$6 = var34Lifetime5;
                  var34Lifetime5++;
                  SoftwareRasterizer.pixels[incrementValue$6] = ((var38Lifetime5 & 16711935) * var40Lifetime5 + (var39Lifetime5 & 16711935) * var41Lifetime5 & -16711936) + ((var38Lifetime5 & 65280) * var40Lifetime5 + (var39Lifetime5 & 65280) * var41Lifetime5 & 16711680) >>> 8;
                  var36Lifetime5 = var36Lifetime5 + var26;
                  var37Lifetime5++;
                }
              }
              var33Lifetime5++;
              var30 = var30 - var26;
              var23 = var23 + SoftwareRasterizer.width;
            }
            return;
          }
          int var33Lifetime6 = var22;
          while (var33Lifetime6 < 0) {
            int var34Lifetime6 = var23;
            int var35Lifetime6 = var30;
            int var36Lifetime6 = var31 + (var28 * var26 >> 4);
            int var37Lifetime6 = var20;
            if (var35Lifetime6 >= 0 &&
              var35Lifetime6 - (this.width << 12) < 0) {
              int var32Lifetime5 = var36Lifetime6 - (this.height << 12);
              if (var36Lifetime6 - (this.height << 12) >= 0) {
                var32Lifetime5 = (var26 - var32Lifetime5) / var26;
                var37Lifetime6 = var37Lifetime6 + var32Lifetime5;
                var36Lifetime6 = var36Lifetime6 + var26 * var32Lifetime5;
                var34Lifetime6 = var34Lifetime6 + var32Lifetime5;
              }
              int var32Lifetime5Lifetime1 = (var36Lifetime6 - var26) / var26;
              if ((var36Lifetime6 - var26) / var26 > var37Lifetime6) {
                var37Lifetime6 = var32Lifetime5Lifetime1;
              }
              while (var37Lifetime6 < 0) {
                int var38Lifetime6 = this.pixels[(var36Lifetime6 >> 12) * this.width + (var35Lifetime6 >> 12)];
                int var39Lifetime6 = SoftwareRasterizer.pixels[var34Lifetime6];
                int var40Lifetime6 = var38Lifetime6 >>> 24;
                int var41Lifetime6 = 256 - var40Lifetime6;
                int incrementValue$7 = var34Lifetime6;
                var34Lifetime6++;
                SoftwareRasterizer.pixels[incrementValue$7] = ((var38Lifetime6 & 16711935) * var40Lifetime6 + (var39Lifetime6 & 16711935) * var41Lifetime6 & -16711936) + ((var38Lifetime6 & 65280) * var40Lifetime6 + (var39Lifetime6 & 65280) * var41Lifetime6 & 16711680) >>> 8;
                var36Lifetime6 = var36Lifetime6 + var26;
                var37Lifetime6++;
              }
            }
            var33Lifetime6++;
            var30 = var30 - var26;
            var23 = var23 + SoftwareRasterizer.width;
          }
          return;
        }
        if (var27 >= 0) {
          if (var26 == 0) {
            int var33Lifetime1 = var22;
            while (var33Lifetime1 < 0) {
              int var34Lifetime1 = var23;
              int var35Lifetime1 = var30 + (var28 * var27 >> 4);
              int var36Lifetime1 = var31;
              int var37Lifetime1 = var20;
              if (var36Lifetime1 >= 0 &&
                var36Lifetime1 - (this.height << 12) < 0) {
                if (var35Lifetime1 < 0) {
                  int var32Lifetime1 = (var27 - 1 - var35Lifetime1) / var27;
                  var37Lifetime1 = var37Lifetime1 + var32Lifetime1;
                  var35Lifetime1 = var35Lifetime1 + var27 * var32Lifetime1;
                  var34Lifetime1 = var34Lifetime1 + var32Lifetime1;
                }
                int var32Lifetime1Lifetime3 = (1 + var35Lifetime1 - (this.width << 12) - var27) / var27;
                if ((1 + var35Lifetime1 - (this.width << 12) - var27) / var27 > var37Lifetime1) {
                  var37Lifetime1 = var32Lifetime1Lifetime3;
                }
                while (var37Lifetime1 < 0) {
                  int var38Lifetime1 = this.pixels[(var36Lifetime1 >> 12) * this.width + (var35Lifetime1 >> 12)];
                  int var39Lifetime1 = SoftwareRasterizer.pixels[var34Lifetime1];
                  int var40Lifetime1 = var38Lifetime1 >>> 24;
                  int var41Lifetime1 = 256 - var40Lifetime1;
                  int incrementValue$2 = var34Lifetime1;
                  var34Lifetime1++;
                  SoftwareRasterizer.pixels[incrementValue$2] = ((var38Lifetime1 & 16711935) * var40Lifetime1 + (var39Lifetime1 & 16711935) * var41Lifetime1 & -16711936) + ((var38Lifetime1 & 65280) * var40Lifetime1 + (var39Lifetime1 & 65280) * var41Lifetime1 & 16711680) >>> 8;
                  var35Lifetime1 = var35Lifetime1 + var27;
                  var37Lifetime1++;
                }
              }
              var33Lifetime1++;
              var31 = var31 + var27;
              var23 = var23 + SoftwareRasterizer.width;
            }
            return;
          }
          if (var26 >= 0) {
            int var33Lifetime1Lifetime1 = var22;
            while (var33Lifetime1Lifetime1 < 0) {
              int var34Lifetime1Lifetime1 = var23;
              int var35Lifetime1Lifetime1 = var30 + (var28 * var27 >> 4);
              int var36Lifetime1Lifetime1 = var31 + (var28 * var26 >> 4);
              int var37Lifetime1Lifetime1 = var20;
              if (var35Lifetime1Lifetime1 < 0) {
                int var32Lifetime1Lifetime1 = (var27 - 1 - var35Lifetime1Lifetime1) / var27;
                var37Lifetime1Lifetime1 = var37Lifetime1Lifetime1 + var32Lifetime1Lifetime1;
                var35Lifetime1Lifetime1 = var35Lifetime1Lifetime1 + var27 * var32Lifetime1Lifetime1;
                var36Lifetime1Lifetime1 = var36Lifetime1Lifetime1 + var26 * var32Lifetime1Lifetime1;
                var34Lifetime1Lifetime1 = var34Lifetime1Lifetime1 + var32Lifetime1Lifetime1;
              }
              int var32Lifetime1Lifetime1Lifetime1 = (1 + var35Lifetime1Lifetime1 - (this.width << 12) - var27) / var27;
              if ((1 + var35Lifetime1Lifetime1 - (this.width << 12) - var27) / var27 > var37Lifetime1Lifetime1) {
                var37Lifetime1Lifetime1 = var32Lifetime1Lifetime1Lifetime1;
              }
              if (var36Lifetime1Lifetime1 < 0) {
                int var32Lifetime1Lifetime1Lifetime2 = (var26 - 1 - var36Lifetime1Lifetime1) / var26;
                var37Lifetime1Lifetime1 = var37Lifetime1Lifetime1 + var32Lifetime1Lifetime1Lifetime2;
                var35Lifetime1Lifetime1 = var35Lifetime1Lifetime1 + var27 * var32Lifetime1Lifetime1Lifetime2;
                var36Lifetime1Lifetime1 = var36Lifetime1Lifetime1 + var26 * var32Lifetime1Lifetime1Lifetime2;
                var34Lifetime1Lifetime1 = var34Lifetime1Lifetime1 + var32Lifetime1Lifetime1Lifetime2;
              }
              int var32Lifetime1Lifetime1Lifetime3 = (1 + var36Lifetime1Lifetime1 - (this.height << 12) - var26) / var26;
              if ((1 + var36Lifetime1Lifetime1 - (this.height << 12) - var26) / var26 > var37Lifetime1Lifetime1) {
                var37Lifetime1Lifetime1 = var32Lifetime1Lifetime1Lifetime3;
              }
              while (var37Lifetime1Lifetime1 < 0) {
                int var38Lifetime1Lifetime1 = this.pixels[(var36Lifetime1Lifetime1 >> 12) * this.width + (var35Lifetime1Lifetime1 >> 12)];
                int var39Lifetime1Lifetime1 = SoftwareRasterizer.pixels[var34Lifetime1Lifetime1];
                int var40Lifetime1Lifetime1 = var38Lifetime1Lifetime1 >>> 24;
                int var41Lifetime1Lifetime1 = 256 - var40Lifetime1Lifetime1;
                int incrementValue$0 = var34Lifetime1Lifetime1;
                var34Lifetime1Lifetime1++;
                SoftwareRasterizer.pixels[incrementValue$0] = ((var38Lifetime1Lifetime1 & 16711935) * var40Lifetime1Lifetime1 + (var39Lifetime1Lifetime1 & 16711935) * var41Lifetime1Lifetime1 & -16711936) + ((var38Lifetime1Lifetime1 & 65280) * var40Lifetime1Lifetime1 + (var39Lifetime1Lifetime1 & 65280) * var41Lifetime1Lifetime1 & 16711680) >>> 8;
                var35Lifetime1Lifetime1 = var35Lifetime1Lifetime1 + var27;
                var36Lifetime1Lifetime1 = var36Lifetime1Lifetime1 + var26;
                var37Lifetime1Lifetime1++;
              }
              var33Lifetime1Lifetime1++;
              var30 = var30 - var26;
              var31 = var31 + var27;
              var23 = var23 + SoftwareRasterizer.width;
            }
            return;
          }
          int var33Lifetime1Lifetime2 = var22;
          while (var33Lifetime1Lifetime2 < 0) {
            int var34Lifetime1Lifetime2 = var23;
            int var35Lifetime1Lifetime2 = var30 + (var28 * var27 >> 4);
            int var36Lifetime1Lifetime2 = var31 + (var28 * var26 >> 4);
            int var37Lifetime1Lifetime2 = var20;
            if (var35Lifetime1Lifetime2 < 0) {
              int var32Lifetime1Lifetime2 = (var27 - 1 - var35Lifetime1Lifetime2) / var27;
              var37Lifetime1Lifetime2 = var37Lifetime1Lifetime2 + var32Lifetime1Lifetime2;
              var35Lifetime1Lifetime2 = var35Lifetime1Lifetime2 + var27 * var32Lifetime1Lifetime2;
              var36Lifetime1Lifetime2 = var36Lifetime1Lifetime2 + var26 * var32Lifetime1Lifetime2;
              var34Lifetime1Lifetime2 = var34Lifetime1Lifetime2 + var32Lifetime1Lifetime2;
            }
            int var32Lifetime1Lifetime2Lifetime1 = (1 + var35Lifetime1Lifetime2 - (this.width << 12) - var27) / var27;
            if ((1 + var35Lifetime1Lifetime2 - (this.width << 12) - var27) / var27 > var37Lifetime1Lifetime2) {
              var37Lifetime1Lifetime2 = var32Lifetime1Lifetime2Lifetime1;
            }
            int var32Lifetime1Lifetime2Lifetime2 = var36Lifetime1Lifetime2 - (this.height << 12);
            if (var36Lifetime1Lifetime2 - (this.height << 12) >= 0) {
              var32Lifetime1Lifetime2Lifetime2 = (var26 - var32Lifetime1Lifetime2Lifetime2) / var26;
              var37Lifetime1Lifetime2 = var37Lifetime1Lifetime2 + var32Lifetime1Lifetime2Lifetime2;
              var35Lifetime1Lifetime2 = var35Lifetime1Lifetime2 + var27 * var32Lifetime1Lifetime2Lifetime2;
              var36Lifetime1Lifetime2 = var36Lifetime1Lifetime2 + var26 * var32Lifetime1Lifetime2Lifetime2;
              var34Lifetime1Lifetime2 = var34Lifetime1Lifetime2 + var32Lifetime1Lifetime2Lifetime2;
            }
            int var32Lifetime1Lifetime2Lifetime3 = (var36Lifetime1Lifetime2 - var26) / var26;
            if ((var36Lifetime1Lifetime2 - var26) / var26 > var37Lifetime1Lifetime2) {
              var37Lifetime1Lifetime2 = var32Lifetime1Lifetime2Lifetime3;
            }
            while (var37Lifetime1Lifetime2 < 0) {
              int var38Lifetime1Lifetime2 = this.pixels[(var36Lifetime1Lifetime2 >> 12) * this.width + (var35Lifetime1Lifetime2 >> 12)];
              int var39Lifetime1Lifetime2 = SoftwareRasterizer.pixels[var34Lifetime1Lifetime2];
              int var40Lifetime1Lifetime2 = var38Lifetime1Lifetime2 >>> 24;
              int var41Lifetime1Lifetime2 = 256 - var40Lifetime1Lifetime2;
              int incrementValue$1 = var34Lifetime1Lifetime2;
              var34Lifetime1Lifetime2++;
              SoftwareRasterizer.pixels[incrementValue$1] = ((var38Lifetime1Lifetime2 & 16711935) * var40Lifetime1Lifetime2 + (var39Lifetime1Lifetime2 & 16711935) * var41Lifetime1Lifetime2 & -16711936) + ((var38Lifetime1Lifetime2 & 65280) * var40Lifetime1Lifetime2 + (var39Lifetime1Lifetime2 & 65280) * var41Lifetime1Lifetime2 & 16711680) >>> 8;
              var35Lifetime1Lifetime2 = var35Lifetime1Lifetime2 + var27;
              var36Lifetime1Lifetime2 = var36Lifetime1Lifetime2 + var26;
              var37Lifetime1Lifetime2++;
            }
            var33Lifetime1Lifetime2++;
            var30 = var30 - var26;
            var31 = var31 + var27;
            var23 = var23 + SoftwareRasterizer.width;
          }
          return;
        }
        if (var26 == 0) {
          int var33Lifetime2 = var22;
          while (var33Lifetime2 < 0) {
            int var34Lifetime2 = var23;
            int var35Lifetime2 = var30 + (var28 * var27 >> 4);
            int var36Lifetime2 = var31;
            int var37Lifetime2 = var20;
            if (var36Lifetime2 >= 0 &&
              var36Lifetime2 - (this.height << 12) < 0) {
              int var32Lifetime2 = var35Lifetime2 - (this.width << 12);
              if (var35Lifetime2 - (this.width << 12) >= 0) {
                var32Lifetime2 = (var27 - var32Lifetime2) / var27;
                var37Lifetime2 = var37Lifetime2 + var32Lifetime2;
                var35Lifetime2 = var35Lifetime2 + var27 * var32Lifetime2;
                var34Lifetime2 = var34Lifetime2 + var32Lifetime2;
              }
              int var32Lifetime2Lifetime1 = (var35Lifetime2 - var27) / var27;
              if ((var35Lifetime2 - var27) / var27 > var37Lifetime2) {
                var37Lifetime2 = var32Lifetime2Lifetime1;
              }
              while (var37Lifetime2 < 0) {
                int var38Lifetime2 = this.pixels[(var36Lifetime2 >> 12) * this.width + (var35Lifetime2 >> 12)];
                int var39Lifetime2 = SoftwareRasterizer.pixels[var34Lifetime2];
                int var40Lifetime2 = var38Lifetime2 >>> 24;
                int var41Lifetime2 = 256 - var40Lifetime2;
                int incrementValue$5 = var34Lifetime2;
                var34Lifetime2++;
                SoftwareRasterizer.pixels[incrementValue$5] = ((var38Lifetime2 & 16711935) * var40Lifetime2 + (var39Lifetime2 & 16711935) * var41Lifetime2 & -16711936) + ((var38Lifetime2 & 65280) * var40Lifetime2 + (var39Lifetime2 & 65280) * var41Lifetime2 & 16711680) >>> 8;
                var35Lifetime2 = var35Lifetime2 + var27;
                var37Lifetime2++;
              }
            }
            var33Lifetime2++;
            var31 = var31 + var27;
            var23 = var23 + SoftwareRasterizer.width;
          }
          return;
        }
        if (var26 >= 0) {
          int var33Lifetime3 = var22;
          while (var33Lifetime3 < 0) {
            int var34Lifetime3 = var23;
            int var35Lifetime3 = var30 + (var28 * var27 >> 4);
            int var36Lifetime3 = var31 + (var28 * var26 >> 4);
            int var37Lifetime3 = var20;
            int var32Lifetime3 = var35Lifetime3 - (this.width << 12);
            if (var35Lifetime3 - (this.width << 12) >= 0) {
              var32Lifetime3 = (var27 - var32Lifetime3) / var27;
              var37Lifetime3 = var37Lifetime3 + var32Lifetime3;
              var35Lifetime3 = var35Lifetime3 + var27 * var32Lifetime3;
              var36Lifetime3 = var36Lifetime3 + var26 * var32Lifetime3;
              var34Lifetime3 = var34Lifetime3 + var32Lifetime3;
            }
            int var32Lifetime3Lifetime1 = (var35Lifetime3 - var27) / var27;
            if ((var35Lifetime3 - var27) / var27 > var37Lifetime3) {
              var37Lifetime3 = var32Lifetime3Lifetime1;
            }
            if (var36Lifetime3 < 0) {
              int var32Lifetime3Lifetime2 = (var26 - 1 - var36Lifetime3) / var26;
              var37Lifetime3 = var37Lifetime3 + var32Lifetime3Lifetime2;
              var35Lifetime3 = var35Lifetime3 + var27 * var32Lifetime3Lifetime2;
              var36Lifetime3 = var36Lifetime3 + var26 * var32Lifetime3Lifetime2;
              var34Lifetime3 = var34Lifetime3 + var32Lifetime3Lifetime2;
            }
            int var32Lifetime3Lifetime3 = (1 + var36Lifetime3 - (this.height << 12) - var26) / var26;
            if ((1 + var36Lifetime3 - (this.height << 12) - var26) / var26 > var37Lifetime3) {
              var37Lifetime3 = var32Lifetime3Lifetime3;
            }
            while (var37Lifetime3 < 0) {
              int var38Lifetime3 = this.pixels[(var36Lifetime3 >> 12) * this.width + (var35Lifetime3 >> 12)];
              int var39Lifetime3 = SoftwareRasterizer.pixels[var34Lifetime3];
              int var40Lifetime3 = var38Lifetime3 >>> 24;
              int var41Lifetime3 = 256 - var40Lifetime3;
              int incrementValue$3 = var34Lifetime3;
              var34Lifetime3++;
              SoftwareRasterizer.pixels[incrementValue$3] = ((var38Lifetime3 & 16711935) * var40Lifetime3 + (var39Lifetime3 & 16711935) * var41Lifetime3 & -16711936) + ((var38Lifetime3 & 65280) * var40Lifetime3 + (var39Lifetime3 & 65280) * var41Lifetime3 & 16711680) >>> 8;
              var35Lifetime3 = var35Lifetime3 + var27;
              var36Lifetime3 = var36Lifetime3 + var26;
              var37Lifetime3++;
            }
            var33Lifetime3++;
            var30 = var30 - var26;
            var31 = var31 + var27;
            var23 = var23 + SoftwareRasterizer.width;
          }
          return;
        }
        int var33Lifetime4 = var22;
        while (var33Lifetime4 < 0) {
          int var34Lifetime4 = var23;
          int var35Lifetime4 = var30 + (var28 * var27 >> 4);
          int var36Lifetime4 = var31 + (var28 * var26 >> 4);
          int var37Lifetime4 = var20;
          int var32Lifetime4 = var35Lifetime4 - (this.width << 12);
          if (var35Lifetime4 - (this.width << 12) >= 0) {
            var32Lifetime4 = (var27 - var32Lifetime4) / var27;
            var37Lifetime4 = var37Lifetime4 + var32Lifetime4;
            var35Lifetime4 = var35Lifetime4 + var27 * var32Lifetime4;
            var36Lifetime4 = var36Lifetime4 + var26 * var32Lifetime4;
            var34Lifetime4 = var34Lifetime4 + var32Lifetime4;
          }
          int var32Lifetime4Lifetime1 = (var35Lifetime4 - var27) / var27;
          if ((var35Lifetime4 - var27) / var27 > var37Lifetime4) {
            var37Lifetime4 = var32Lifetime4Lifetime1;
          }
          int var32Lifetime4Lifetime2 = var36Lifetime4 - (this.height << 12);
          if (var36Lifetime4 - (this.height << 12) >= 0) {
            var32Lifetime4Lifetime2 = (var26 - var32Lifetime4Lifetime2) / var26;
            var37Lifetime4 = var37Lifetime4 + var32Lifetime4Lifetime2;
            var35Lifetime4 = var35Lifetime4 + var27 * var32Lifetime4Lifetime2;
            var36Lifetime4 = var36Lifetime4 + var26 * var32Lifetime4Lifetime2;
            var34Lifetime4 = var34Lifetime4 + var32Lifetime4Lifetime2;
          }
          int var32Lifetime4Lifetime3 = (var36Lifetime4 - var26) / var26;
          if ((var36Lifetime4 - var26) / var26 > var37Lifetime4) {
            var37Lifetime4 = var32Lifetime4Lifetime3;
          }
          while (var37Lifetime4 < 0) {
            int var38Lifetime4 = this.pixels[(var36Lifetime4 >> 12) * this.width + (var35Lifetime4 >> 12)];
            int var39Lifetime4 = SoftwareRasterizer.pixels[var34Lifetime4];
            int var40Lifetime4 = var38Lifetime4 >>> 24;
            int var41Lifetime4 = 256 - var40Lifetime4;
            int incrementValue$4 = var34Lifetime4;
            var34Lifetime4++;
            SoftwareRasterizer.pixels[incrementValue$4] = ((var38Lifetime4 & 16711935) * var40Lifetime4 + (var39Lifetime4 & 16711935) * var41Lifetime4 & -16711936) + ((var38Lifetime4 & 65280) * var40Lifetime4 + (var39Lifetime4 & 65280) * var41Lifetime4 & 16711680) >>> 8;
            var35Lifetime4 = var35Lifetime4 + var27;
            var36Lifetime4 = var36Lifetime4 + var26;
            var37Lifetime4++;
          }
          var33Lifetime4++;
          var30 = var30 - var26;
          var31 = var31 + var27;
          var23 = var23 + SoftwareRasterizer.width;
        }
        return;
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

    final void f(int param0, int param1, int param2) {
        param0 = param0 + this.offsetX;
        param1 = param1 + this.offsetY;
        int var4 = param0 + param1 * SoftwareRasterizer.width;
        int var5 = 0;
        int var6 = this.height;
        int var7 = this.width;
        int var8 = SoftwareRasterizer.width - var7;
        int var9 = 0;
        if (param1 < SoftwareRasterizer.clipTop) {
          int var10 = SoftwareRasterizer.clipTop - param1;
          var6 = var6 - var10;
          param1 = SoftwareRasterizer.clipTop;
          var5 = var5 + var10 * var7;
          var4 = var4 + var10 * SoftwareRasterizer.width;
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
        if (var7 > 0) {
          if (var6 <= 0) {
            return;
          }
          uh.f(SoftwareRasterizer.pixels, this.pixels, 0, var5, var4, var7, var6, var8, var9, param2);
          return;
        }
    }

    private final static void f(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
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
              if (var19 != var20 ||
                var20 != var21) {
                var18 = param2;
              } else if (var19 > 128) {
                var18 = (var10 * (256 - var19) + 255 * (var19 - 128) >> 7 << 16) + (var11 * (256 - var20) + 255 * (var20 - 128) >> 7 << 8) + (var12 * (256 - var21) + 255 * (var21 - 128) >> 7);
              } else {
                var18 = (var19 * var10 >> 7 << 16) + (var20 * var11 >> 7 << 8) + (var21 * var12 >> 7);
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

    uh(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6) {
        super(param0, param1, param2, param3, param4, param5, param6);
    }

    final void d(int param0, int param1, int param2) {
        param0 = param0 + this.offsetX;
        param1 = param1 + this.offsetY;
        int var4 = param0 + param1 * SoftwareRasterizer.width;
        int var5 = 0;
        int var6 = this.height;
        int var7 = this.width;
        int var8 = SoftwareRasterizer.width - var7;
        int var9 = 0;
        if (param1 < SoftwareRasterizer.clipTop) {
          int var10 = SoftwareRasterizer.clipTop - param1;
          var6 = var6 - var10;
          param1 = SoftwareRasterizer.clipTop;
          var5 = var5 + var10 * var7;
          var4 = var4 + var10 * SoftwareRasterizer.width;
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
        if (var7 > 0) {
          if (var6 <= 0) {
            return;
          }
          uh.e(SoftwareRasterizer.pixels, this.pixels, 0, var5, var4, var7, var6, var8, var9, param2);
          return;
        }
    }
}
