/*
 * Decompiled by CFR-JS 0.4.0.
 */
class RgbSprite extends SpriteGeometry {
    int[] pixels;

    final boolean containsPixel(int originX, int originY, int pointX, int pointY) {
        boolean stackIn_11_0 = false;
        pointX = pointX - (originX + this.offsetX);
        if (pointX < 0) {
          return false;
        }
        if (pointX >= this.width) {
          return false;
        }
        pointY = pointY - (originY + this.offsetY);
        if (pointY >= 0 &&
          pointY < this.height) {
          stackIn_11_0 = (this.pixels[pointY * this.width + pointX] != 0);
          return stackIn_11_0;
        }
        return false;
    }

    final void replaceZeroWithOne() {
        int var1;
        int var2;
        var1 = -1;
        var2 = this.width * this.height - 4;
        while (var1 < var2) {
          var1++;
          if (this.pixels[var1] == 0) {
            this.pixels[var1] = 1;
          }
          var1++;
          if (this.pixels[var1] == 0) {
            this.pixels[var1] = 1;
          }
          var1++;
          if (this.pixels[var1] == 0) {
            this.pixels[var1] = 1;
          }
          var1++;
          if (this.pixels[var1] != 0) {
            continue;
          }
          this.pixels[var1] = 1;
        }
        var2 += 3;
        while (var1 < var2) {
          var1++;
          if (this.pixels[var1] != 0) {
            continue;
          }
          this.pixels[var1] = 1;
        }
    }

    void c(int param0, int param1, int param2) {
        int var10 = 0;
        int var10Lifetime1;
        int var10Lifetime2;
        param0 = param0 + this.offsetX;
        param1 = param1 + this.offsetY;
        int var4 = param0 + param1 * Rasterizer2D.width;
        int var5 = 0;
        int var6 = this.height;
        int var7 = this.width;
        int var8 = Rasterizer2D.width - var7;
        int var9 = 0;
        if (param1 < Rasterizer2D.clipTop) {
          var10 = Rasterizer2D.clipTop - param1;
          var6 = var6 - var10;
          param1 = Rasterizer2D.clipTop;
          var5 = var5 + var10 * var7;
          var4 = var4 + var10 * Rasterizer2D.width;
        }
        if (param1 + var6 > Rasterizer2D.clipBottom) {
          var6 = var6 - (param1 + var6 - Rasterizer2D.clipBottom);
        }
        if (param0 < Rasterizer2D.clipLeft) {
          var10Lifetime1 = Rasterizer2D.clipLeft - param0;
          var7 = var7 - var10Lifetime1;
          param0 = Rasterizer2D.clipLeft;
          var5 = var5 + var10Lifetime1;
          var4 = var4 + var10Lifetime1;
          var9 = var9 + var10Lifetime1;
          var8 = var8 + var10Lifetime1;
        }
        if (param0 + var7 > Rasterizer2D.clipRight) {
          var10Lifetime2 = param0 + var7 - Rasterizer2D.clipRight;
          var7 = var7 - var10Lifetime2;
          var9 = var9 + var10Lifetime2;
          var8 = var8 + var10Lifetime2;
        }
        if (var7 > 0) {
          if (var6 <= 0) {
            return;
          }
          RgbSprite.b(Rasterizer2D.pixels, this.pixels, 0, var5, var4, 0, 0, var7, var6, var8, var9, param2);
          return;
        }
    }

    void drawVerticallyFlipped(int x, int y) {
        int clippedBottomRows = 0;
        int clippedLeftColumns;
        int clippedRightColumns;
        x = x + this.offsetX;
        y = y + (this.canvasHeight - this.height - this.offsetY);
        int destinationOffset = x + (y + this.height - 1) * Rasterizer2D.width;
        int sourceOffset = 0;
        int height = this.height;
        int width = this.width;
        int destinationRowSkip = -Rasterizer2D.width - width;
        int sourceRowSkip = 0;
        if (y < Rasterizer2D.clipTop) {
          height = height - (Rasterizer2D.clipTop - y);
          y = Rasterizer2D.clipTop;
        }
        if (y + height > Rasterizer2D.clipBottom) {
          clippedBottomRows = y + height - Rasterizer2D.clipBottom;
          height = height - clippedBottomRows;
          destinationOffset = destinationOffset - clippedBottomRows * Rasterizer2D.width;
          sourceOffset = sourceOffset + clippedBottomRows * width;
        }
        if (x < Rasterizer2D.clipLeft) {
          clippedLeftColumns = Rasterizer2D.clipLeft - x;
          width = width - clippedLeftColumns;
          x = Rasterizer2D.clipLeft;
          sourceOffset = sourceOffset + clippedLeftColumns;
          destinationOffset = destinationOffset + clippedLeftColumns;
          sourceRowSkip = sourceRowSkip + clippedLeftColumns;
          destinationRowSkip = destinationRowSkip + clippedLeftColumns;
        }
        if (x + width > Rasterizer2D.clipRight) {
          clippedRightColumns = x + width - Rasterizer2D.clipRight;
          width = width - clippedRightColumns;
          sourceRowSkip = sourceRowSkip + clippedRightColumns;
          destinationRowSkip = destinationRowSkip + clippedRightColumns;
        }
        if (width > 0) {
          if (height <= 0) {
            return;
          }
          RgbSprite.b(Rasterizer2D.pixels, this.pixels, 0, sourceOffset, destinationOffset, width, height, destinationRowSkip, sourceRowSkip);
          return;
        }
    }

    void b(int param0, int param1, int param2, int param3) {
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
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
        param0 = param0 + this.offsetX;
        param1 = param1 + this.offsetY;
        var5 = this.height;
        var6 = this.width;
        var7 = param2 << 8;
        var8 = (param3 - param2 << 8) / var5;
        var9 = 0;
        if (param0 < Rasterizer2D.clipLeft) {
          var6 = var6 - (Rasterizer2D.clipLeft - param0);
          var9 = var9 + (Rasterizer2D.clipLeft - param0);
          param0 = Rasterizer2D.clipLeft;
        }
        if (param1 < Rasterizer2D.clipTop) {
          var7 = var7 + (Rasterizer2D.clipTop - param1) * var8;
          var5 = var5 - (Rasterizer2D.clipTop - param1);
          var9 = var9 + (Rasterizer2D.clipTop - param1) * this.width;
          param1 = Rasterizer2D.clipTop;
        }
        if (param0 + var6 > Rasterizer2D.clipRight) {
          var6 = Rasterizer2D.clipRight - param0;
        }
        if (param1 + var5 > Rasterizer2D.clipBottom) {
          var5 = Rasterizer2D.clipBottom - param1;
        }
        var10 = Rasterizer2D.width - var6;
        var11 = this.width - var6;
        var12 = param0 + param1 * Rasterizer2D.width;
        for (param1 = -var5; param1 < 0; param1++) {
          var13 = var7 >> 8;
          var14 = 256 - var13;
          if (var13 >= 0) {
            if (var13 > 255) {
              for (param0 = -var6; param0 < 0; param0++) {
                incrementValue$2 = var9;
                var9++;
                var15 = this.pixels[incrementValue$2];
                if (var15 == 0) {
                  var12++;
                } else {
                  incrementValue$3 = var12;
                  var12++;
                  Rasterizer2D.pixels[incrementValue$3] = var15;
                }
              }
            } else {
              for (param0 = -var6; param0 < 0; param0++) {
                incrementValue$0 = var9;
                var9++;
                var15 = this.pixels[incrementValue$0];
                if (var15 == 0) {
                  var12++;
                } else {
                  var16 = Rasterizer2D.pixels[var12];
                  var17 = (var16 & 16711935) * var14 + (var15 & 16711935) * var13 >> 8 & 16711935;
                  incrementValue$1 = var12;
                  var12++;
                  Rasterizer2D.pixels[incrementValue$1] = var17 + ((var16 & 65280) * var14 + (var15 & 65280) * var13 >> 8 & 65280);
                }
              }
            }
            var12 = var12 + var10;
            var9 = var9 + var11;
            var7 = var7 + var8;
          }
        }
        return;
    }

    private final static void a(int[] param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int dupTemp$0 = 0;
        int dupTemp$1 = 0;
        int dupTemp$2 = 0;
        int dupTemp$3 = 0;
        int incrementValue$4 = 0;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var10Lifetime1;
        int var10Lifetime2;
        int var10Lifetime3;
        var8 = 0;
        while (var8 < param7) {
          var9 = 0;
          while (var9 < param6) {
            var11 = Rasterizer2D.pixels[param2] & 16711935;
            var12 = Rasterizer2D.pixels[param2] & 65280;
            var13 = 0;
            var14 = 0;
            dupTemp$0 = param0[param1];
            var10 = dupTemp$0;
            if (dupTemp$0 != 0) {
              var13 = var13 + (var10 & 16711935);
              var14 = var14 + (var10 & 65280);
            } else {
              var13 = var13 + var11;
              var14 = var14 + var12;
            }
            dupTemp$1 = param0[param1 + 1];
            var10Lifetime1 = dupTemp$1;
            if (dupTemp$1 != 0) {
              var13 = var13 + (var10Lifetime1 & 16711935);
              var14 = var14 + (var10Lifetime1 & 65280);
            } else {
              var13 = var13 + var11;
              var14 = var14 + var12;
            }
            dupTemp$2 = param0[param1 + param5];
            var10Lifetime2 = dupTemp$2;
            if (dupTemp$2 != 0) {
              var13 = var13 + (var10Lifetime2 & 16711935);
              var14 = var14 + (var10Lifetime2 & 65280);
            } else {
              var13 = var13 + var11;
              var14 = var14 + var12;
            }
            dupTemp$3 = param0[param1 + param5 + 1];
            var10Lifetime3 = dupTemp$3;
            if (dupTemp$3 != 0) {
              var13 = var13 + (var10Lifetime3 & 16711935);
              var14 = var14 + (var10Lifetime3 & 65280);
            } else {
              var13 = var13 + var11;
              var14 = var14 + var12;
            }
            incrementValue$4 = param2;
            param2++;
            Rasterizer2D.pixels[incrementValue$4] = (var13 & 66847740 | var14 & 261120) >> 2;
            var9++;
            param1 += 2;
          }
          var8++;
          param1 = param1 + param3;
          param2 = param2 + param4;
        }
    }

    final void flipHorizontal() {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int[] var1 = this.pixels;
        for (var2 = this.height - 1; var2 >= 0; var2--) {
          var3 = var2 * this.width;
          var4 = (var2 + 1) * this.width;
          while (var3 < var4) {
            var4--;
            var5 = var1[var3];
            var1[var3] = var1[var4];
            var1[var4] = var5;
            var3++;
          }
        }
        this.offsetX = this.canvasWidth - this.width - this.offsetX;
    }

    private final static void a(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int var11 = 0;
        int var12 = 0;
        int incrementValue$12 = 0;
        int var10;
        int var13;
        var10 = 256 - param9;
        for (var11 = -param6; var11 < 0; var11++) {
          for (var12 = -param5; var12 < 0; var12++) {
            param2 = param1[param3++];
            if (param2 == 0) {
              param4++;
            } else {
              var13 = param0[param4];
              incrementValue$12 = param4;
              param4++;
              param0[incrementValue$12] = ((param2 & 16711935) * param9 + (var13 & 16711935) * var10 & -16711936) + ((param2 & 65280) * param9 + (var13 & 65280) * var10 & 16711680) >> 8;
            }
          }
          param4 = param4 + param7;
          param3 = param3 + param8;
        }
    }

    private final static void a(int param0, int param1, int param2, int[] param3, int[] param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12) {
        int incrementValue$12 = 0;
        for (param8 = -param10; param8 < 0; param8++) {
          for (param6 = -param9; param6 < 0; param6++) {
            param0 = param4[param5++];
            if (param0 == 0) {
              param7++;
            } else {
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

    void f(int param0, int param1, int param2) {
        int var10 = 0;
        int var10Lifetime1;
        int var10Lifetime2;
        param0 = param0 + this.offsetX;
        param1 = param1 + this.offsetY;
        int var4 = param0 + param1 * Rasterizer2D.width;
        int var5 = 0;
        int var6 = this.height;
        int var7 = this.width;
        int var8 = Rasterizer2D.width - var7;
        int var9 = 0;
        if (param1 < Rasterizer2D.clipTop) {
          var10 = Rasterizer2D.clipTop - param1;
          var6 = var6 - var10;
          param1 = Rasterizer2D.clipTop;
          var5 = var5 + var10 * var7;
          var4 = var4 + var10 * Rasterizer2D.width;
        }
        if (param1 + var6 > Rasterizer2D.clipBottom) {
          var6 = var6 - (param1 + var6 - Rasterizer2D.clipBottom);
        }
        if (param0 < Rasterizer2D.clipLeft) {
          var10Lifetime1 = Rasterizer2D.clipLeft - param0;
          var7 = var7 - var10Lifetime1;
          param0 = Rasterizer2D.clipLeft;
          var5 = var5 + var10Lifetime1;
          var4 = var4 + var10Lifetime1;
          var9 = var9 + var10Lifetime1;
          var8 = var8 + var10Lifetime1;
        }
        if (param0 + var7 > Rasterizer2D.clipRight) {
          var10Lifetime2 = param0 + var7 - Rasterizer2D.clipRight;
          var7 = var7 - var10Lifetime2;
          var9 = var9 + var10Lifetime2;
          var8 = var8 + var10Lifetime2;
        }
        if (var7 > 0) {
          if (var6 <= 0) {
            return;
          }
          if (param2 == 256) {
            RgbSprite.a(0, 0, 0, Rasterizer2D.pixels, this.pixels, var5, 0, var4, 0, var7, var6, var8, var9);
          } else {
            RgbSprite.a(0, 0, 0, Rasterizer2D.pixels, this.pixels, var5, 0, var4, 0, var7, var6, var8, var9, param2);
          }
          return;
        }
    }

    private final static void a(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12) {
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int incrementValue$0 = 0;
        int var18 = 0;
        int var13 = 256 - param12;
        int var14 = param3;
        for (var15 = -param8; var15 < 0; var15++) {
          var16 = (param4 >> 16) * param11;
          for (var17 = -param7; var17 < 0; var17++) {
            param2 = param1[(param3 >> 16) + var16];
            if (param2 != 0) {
              var18 = param0[param5];
              incrementValue$0 = param5;
              param5++;
              param0[incrementValue$0] = ((param2 & 16711935) * param12 + (var18 & 16711935) * var13 & -16711936) + ((param2 & 65280) * param12 + (var18 & 65280) * var13 & 16711680) >> 8;
            } else {
              param5++;
            }
            param3 = param3 + param9;
          }
          param4 = param4 + param10;
          param3 = var14;
          param5 = param5 + param6;
        }
    }

    private final static void b(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var10 = 0;
        int var9;
        int var11;
        int var11Lifetime1;
        var9 = -(param5 >> 2);
        param5 = -(param5 & 3);
        for (var10 = -param6; var10 < 0; var10++) {
          for (var11 = var9; var11 < 0; var11++) {
            param2 = param1[param3++];
            if (param2 == 0) {
              param4++;
            } else {
              param0[param4++] = param2;
            }
            param2 = param1[param3++];
            if (param2 == 0) {
              param4++;
            } else {
              param0[param4++] = param2;
            }
            param2 = param1[param3++];
            if (param2 == 0) {
              param4++;
            } else {
              param0[param4++] = param2;
            }
            param2 = param1[param3++];
            if (param2 == 0) {
              param4++;
            } else {
              param0[param4++] = param2;
            }
          }
          for (var11Lifetime1 = param5; var11Lifetime1 < 0; var11Lifetime1++) {
            param2 = param1[param3++];
            if (param2 == 0) {
              param4++;
            } else {
              param0[param4++] = param2;
            }
          }
          param4 = param4 + param7;
          param3 = param3 + param8;
        }
    }

    void b(int param0, int param1, int param2) {
        int var10 = 0;
        int var10Lifetime1;
        int var10Lifetime2;
        param0 = param0 + this.offsetX;
        param1 = param1 + this.offsetY;
        int var4 = param0 + param1 * Rasterizer2D.width;
        int var5 = 0;
        int var6 = this.height;
        int var7 = this.width;
        int var8 = Rasterizer2D.width - var7;
        int var9 = 0;
        if (param1 < Rasterizer2D.clipTop) {
          var10 = Rasterizer2D.clipTop - param1;
          var6 = var6 - var10;
          param1 = Rasterizer2D.clipTop;
          var5 = var5 + var10 * var7;
          var4 = var4 + var10 * Rasterizer2D.width;
        }
        if (param1 + var6 > Rasterizer2D.clipBottom) {
          var6 = var6 - (param1 + var6 - Rasterizer2D.clipBottom);
        }
        if (param0 < Rasterizer2D.clipLeft) {
          var10Lifetime1 = Rasterizer2D.clipLeft - param0;
          var7 = var7 - var10Lifetime1;
          param0 = Rasterizer2D.clipLeft;
          var5 = var5 + var10Lifetime1;
          var4 = var4 + var10Lifetime1;
          var9 = var9 + var10Lifetime1;
          var8 = var8 + var10Lifetime1;
        }
        if (param0 + var7 > Rasterizer2D.clipRight) {
          var10Lifetime2 = param0 + var7 - Rasterizer2D.clipRight;
          var7 = var7 - var10Lifetime2;
          var9 = var9 + var10Lifetime2;
          var8 = var8 + var10Lifetime2;
        }
        if (var7 > 0) {
          if (var6 <= 0) {
            return;
          }
          RgbSprite.a(Rasterizer2D.pixels, this.pixels, 0, var5, var4, var7, var6, var8, var9, param2);
          return;
        }
    }

    void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var14 = 0;
        int var13 = 0;
        int var15 = 0;
        int var13Lifetime1;
        int var13Lifetime2;
        int var15Lifetime1;
        int var15Lifetime2;
        if (param2 > 0) {
          if (param3 <= 0) {
            return;
          }
          var5 = this.width;
          var6 = this.height;
          var7 = 0;
          var8 = 0;
          var9 = this.canvasWidth;
          var10 = this.canvasHeight;
          var11 = (var9 << 16) / param2;
          var12 = (var10 << 16) / param3;
          if (this.offsetX > 0) {
            var13 = ((this.offsetX << 16) + var11 - 1) / var11;
            param0 = param0 + var13;
            var7 = var7 + (var13 * var11 - (this.offsetX << 16));
          }
          if (this.offsetY > 0) {
            var13Lifetime1 = ((this.offsetY << 16) + var12 - 1) / var12;
            param1 = param1 + var13Lifetime1;
            var8 = var8 + (var13Lifetime1 * var12 - (this.offsetY << 16));
          }
          if (var5 < var9) {
            param2 = ((var5 << 16) - var7 + var11 - 1) / var11;
          }
          if (var6 < var10) {
            param3 = ((var6 << 16) - var8 + var12 - 1) / var12;
          }
          var13Lifetime2 = param0 + param1 * Rasterizer2D.width;
          var14 = Rasterizer2D.width - param2;
          if (param1 + param3 > Rasterizer2D.clipBottom) {
            param3 = param3 - (param1 + param3 - Rasterizer2D.clipBottom);
          }
          if (param1 < Rasterizer2D.clipTop) {
            var15 = Rasterizer2D.clipTop - param1;
            param3 = param3 - var15;
            var13Lifetime2 = var13Lifetime2 + var15 * Rasterizer2D.width;
            var8 = var8 + var12 * var15;
          }
          if (param0 + param2 > Rasterizer2D.clipRight) {
            var15Lifetime1 = param0 + param2 - Rasterizer2D.clipRight;
            param2 = param2 - var15Lifetime1;
            var14 = var14 + var15Lifetime1;
          }
          if (param0 < Rasterizer2D.clipLeft) {
            var15Lifetime2 = Rasterizer2D.clipLeft - param0;
            param2 = param2 - var15Lifetime2;
            var13Lifetime2 = var13Lifetime2 + var15Lifetime2;
            var7 = var7 + var11 * var15Lifetime2;
            var14 = var14 + var15Lifetime2;
          }
          RgbSprite.a(Rasterizer2D.pixels, this.pixels, 0, var7, var8, var13Lifetime2, var14, param2, param3, var11, var12, var5);
          return;
        }
    }

    final void c(int param0, int param1, int param2, int param3) {
        int var11 = 0;
        int var12 = 0;
        int var30 = 0;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int var18;
        int var19;
        int var20;
        int var21;
        int var22;
        int var23;
        int var24;
        int var25;
        int var26;
        int var27;
        int var28;
        int var29;
        int var31;
        int var32;
        int var28Lifetime1;
        if (param2 <= this.canvasWidth &&
          param3 <= this.canvasHeight) {
          var5 = param0 + this.offsetX * param2 / this.canvasWidth;
          var6 = param0 + ((this.offsetX + this.width) * param2 + this.canvasWidth - 1) / this.canvasWidth;
          var7 = param1 + this.offsetY * param3 / this.canvasHeight;
          var8 = param1 + ((this.offsetY + this.height) * param3 + this.canvasHeight - 1) / this.canvasHeight;
          if (var5 < Rasterizer2D.clipLeft) {
            var5 = Rasterizer2D.clipLeft;
          }
          if (var6 > Rasterizer2D.clipRight) {
            var6 = Rasterizer2D.clipRight;
          }
          if (var7 < Rasterizer2D.clipTop) {
            var7 = Rasterizer2D.clipTop;
          }
          if (var8 > Rasterizer2D.clipBottom) {
            var8 = Rasterizer2D.clipBottom;
          }
          if (var5 >= var6) {
            return;
          }
          if (var7 >= var8) {
            return;
          }
          var9 = var7 * Rasterizer2D.width + var5;
          var10 = Rasterizer2D.width - (var6 - var5);
          for (var11 = var7; var11 < var8; var11++) {
            for (var12 = var5; var12 < var6; var12++) {
              var13 = var12 - param0 << 4;
              var14 = var11 - param1 << 4;
              var15 = var13 * this.canvasWidth / param2 - (this.offsetX << 4);
              var16 = (var13 + 16) * this.canvasWidth / param2 - (this.offsetX << 4);
              var17 = var14 * this.canvasHeight / param3 - (this.offsetY << 4);
              var18 = (var14 + 16) * this.canvasHeight / param3 - (this.offsetY << 4);
              var19 = (var16 - var15) * (var18 - var17) >> 1;
              if (var19 != 0) {
                if (var15 < 0) {
                  var15 = 0;
                }
                if (var16 > this.width << 4) {
                  var16 = this.width << 4;
                }
                if (var17 < 0) {
                  var17 = 0;
                }
                if (var18 > this.height << 4) {
                  var18 = this.height << 4;
                }
                var16--;
                var18--;
                var20 = 16 - (var15 & 15);
                var21 = (var16 & 15) + 1;
                var22 = 16 - (var17 & 15);
                var23 = (var18 & 15) + 1;
                var15 = var15 >> 4;
                var16 = var16 >> 4;
                var17 = var17 >> 4;
                var18 = var18 >> 4;
                var24 = 0;
                var25 = 0;
                var26 = 0;
                var27 = 0;
                for (var28 = var17; var28 <= var18; var28++) {
                  var29 = 16;
                  if (var28 == var17) {
                    var29 = var22;
                  }
                  if (var28 == var18) {
                    var29 = var23;
                  }
                  for (var30 = var15; var30 <= var16; var30++) {
                    var31 = this.pixels[var28 * this.width + var30];
                    if (var31 != 0) {
                      var32 = var29;
                      if (var30 != var15) {
                        if (var30 != var16) {
                          var32 = var32 << 4;
                        } else {
                          var32 = var32 * var21;
                        }
                      } else {
                        var32 = var32 * var20;
                      }
                      var27 = var27 + var32;
                      var24 = var24 + (var31 >> 16 & 255) * var32;
                      var25 = var25 + (var31 >> 8 & 255) * var32;
                      var26 = var26 + (var31 & 255) * var32;
                    }
                  }
                }
                if (var27 >= var19) {
                  var28Lifetime1 = (var24 / var27 << 16) + (var25 / var27 << 8) + var26 / var27;
                  if (var28Lifetime1 == 0) {
                    var28Lifetime1 = 1;
                  }
                  Rasterizer2D.pixels[var9] = var28Lifetime1;
                }
                var9++;
              }
            }
            var9 = var9 + var10;
          }
          return;
        }
        throw new IllegalArgumentException();
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        double var7;
        int var9;
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
        int var22;
        int var23;
        int var24;
        double var25;
        int var27;
        int var28;
        int var29;
        int var30;
        int var31;
        int var32;
        int var33;
        int var34;
        int var35;
        int var36;
        int var37;
        int var38;
        int var39;
        int var40;
        int var33Lifetime1;
        int var33Lifetime2;
        int var34Lifetime1;
        int var34Lifetime2;
        int var35Lifetime1;
        int var35Lifetime2;
        int var36Lifetime1;
        int var36Lifetime2;
        int var37Lifetime1;
        int var37Lifetime2;
        int var38Lifetime1;
        int var38Lifetime2;
        int var39Lifetime1;
        int var39Lifetime2;
        int var40Lifetime1;
        int var40Lifetime2;
        int var33Lifetime3;
        int var34Lifetime3;
        int var35Lifetime3;
        int var36Lifetime3;
        int var37Lifetime3;
        int var38Lifetime3;
        int var39Lifetime3;
        int var40Lifetime3;
        int var35Lifetime1Lifetime1;
        int var35Lifetime2Lifetime1;
        int var35Lifetime4;
        int var35Lifetime3Lifetime1;
        if (param5 == 0) {
          return;
        }
        param0 = param0 - (this.offsetX << 4);
        param1 = param1 - (this.offsetY << 4);
        var7 = (double)(param4 & 65535) * 0.00009587379924285257;
        var9 = (int)Math.floor(Math.sin(var7) * (double)param5 + 0.5);
        var10 = (int)Math.floor(Math.cos(var7) * (double)param5 + 0.5);
        var11 = -param0 * var10 + -param1 * var9;
        var12 = -(-param0) * var9 + -param1 * var10;
        var13 = ((this.width << 4) - param0) * var10 + -param1 * var9;
        var14 = -((this.width << 4) - param0) * var9 + -param1 * var10;
        var15 = -param0 * var10 + ((this.height << 4) - param1) * var9;
        var16 = -(-param0) * var9 + ((this.height << 4) - param1) * var10;
        var17 = ((this.width << 4) - param0) * var10 + ((this.height << 4) - param1) * var9;
        var18 = -((this.width << 4) - param0) * var9 + ((this.height << 4) - param1) * var10;
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
        if (var19 < Rasterizer2D.clipLeft) {
          var19 = Rasterizer2D.clipLeft;
        }
        if (var20 > Rasterizer2D.clipRight) {
          var20 = Rasterizer2D.clipRight;
        }
        if (var21 < Rasterizer2D.clipTop) {
          var21 = Rasterizer2D.clipTop;
        }
        if (var22 > Rasterizer2D.clipBottom) {
          var22 = Rasterizer2D.clipBottom;
        }
        var20 = var19 - var20;
        if (var20 >= 0) {
          return;
        }
        var22 = var21 - var22;
        if (var22 >= 0) {
          return;
        }
        var23 = var21 * Rasterizer2D.width + var19;
        var24 = Rasterizer2D.width + var20;
        var25 = 16777216.0 / (double)param5;
        var27 = (int)Math.floor(Math.sin(var7) * var25 + 0.5);
        var28 = (int)Math.floor(Math.cos(var7) * var25 + 0.5);
        var29 = (var19 << 4) + 8 - param2;
        var30 = (var21 << 4) + 8 - param3;
        var31 = (param0 << 8) - 2048 - (var30 * var27 >> 4);
        var32 = (param1 << 8) - 2048 + (var30 * var28 >> 4);
        if (var28 >= 0) {
          if (var27 >= 0) {
            var36 = var22;
            while (var36 < 0) {
              var37 = var31 + (var29 * var28 >> 4);
              var38 = var32 + (var29 * var27 >> 4);
              var39 = var20;
              var40 = 0;
              var35 = var37 + 4096;
              if (var35 < 0) {
                if (var28 != 0) {
                  var35 = (var28 - 1 - var35) / var28;
                  var39 = var39 + var35;
                  var37 = var37 + var28 * var35;
                  var38 = var38 + var27 * var35;
                  var23 = var23 + var35;
                  var40 = 1;
                } else {
                  var23 = var23 - var39;
                }
              } else {
                var40 = 1;
              }
              if (var40 != 0) {
                var40 = 0;
                var35Lifetime4 = var38 + 4096;
                if (var35Lifetime4 < 0) {
                  if (var27 != 0) {
                    var35Lifetime4 = (var27 - 1 - var35Lifetime4) / var27;
                    var39 = var39 + var35Lifetime4;
                    var37 = var37 + var28 * var35Lifetime4;
                    var38 = var38 + var27 * var35Lifetime4;
                    var23 = var23 + var35Lifetime4;
                    var40 = 1;
                  } else {
                    var23 = var23 - var39;
                  }
                } else {
                  var40 = 1;
                }
                if (var40 != 0) {
                  while (var39 < 0) {
                    var33 = var37 >> 12;
                    if (var37 >> 12 < this.width) {
                      var34 = var38 >> 12;
                      if (var38 >> 12 < this.height) {
                        this.a(var23, var33, var34, var37, var38);
                        var39++;
                        var37 = var37 + var28;
                        var38 = var38 + var27;
                        var23++;
                        continue;
                      }
                    }
                    break;
                  }
                  var23 = var23 - var39;
                }
              }
              var36++;
              var31 = var31 - var27;
              var32 = var32 + var28;
              var23 = var23 + var24;
            }
            return;
          }
          var36Lifetime3 = var22;
          while (var36Lifetime3 < 0) {
            var37Lifetime3 = var31 + (var29 * var28 >> 4);
            var38Lifetime3 = var32 + (var29 * var27 >> 4);
            var39Lifetime3 = var20;
            var40Lifetime3 = 0;
            var35Lifetime3 = var37Lifetime3 + 4096;
            if (var35Lifetime3 < 0) {
              if (var28 != 0) {
                var35Lifetime3 = (var28 - 1 - var35Lifetime3) / var28;
                var39Lifetime3 = var39Lifetime3 + var35Lifetime3;
                var37Lifetime3 = var37Lifetime3 + var28 * var35Lifetime3;
                var38Lifetime3 = var38Lifetime3 + var27 * var35Lifetime3;
                var23 = var23 + var35Lifetime3;
                var40Lifetime3 = 1;
              } else {
                var23 = var23 - var39Lifetime3;
              }
            } else {
              var40Lifetime3 = 1;
            }
            if (var40Lifetime3 != 0) {
              var40Lifetime3 = 0;
              var35Lifetime3Lifetime1 = var38Lifetime3 - (this.height << 12);
              if (var35Lifetime3Lifetime1 >= 0) {
                if (var27 != 0) {
                  var35Lifetime3Lifetime1 = (var27 - var35Lifetime3Lifetime1) / var27;
                  var39Lifetime3 = var39Lifetime3 + var35Lifetime3Lifetime1;
                  var37Lifetime3 = var37Lifetime3 + var28 * var35Lifetime3Lifetime1;
                  var38Lifetime3 = var38Lifetime3 + var27 * var35Lifetime3Lifetime1;
                  var23 = var23 + var35Lifetime3Lifetime1;
                  var40Lifetime3 = 1;
                } else {
                  var23 = var23 - var39Lifetime3;
                }
              } else {
                var40Lifetime3 = 1;
              }
              if (var40Lifetime3 != 0) {
                while (var39Lifetime3 < 0) {
                  if (var38Lifetime3 >= -4096) {
                    var33Lifetime3 = var37Lifetime3 >> 12;
                    if (var37Lifetime3 >> 12 < this.width) {
                      var34Lifetime3 = var38Lifetime3 >> 12;
                      this.a(var23, var33Lifetime3, var34Lifetime3, var37Lifetime3, var38Lifetime3);
                      var39Lifetime3++;
                      var37Lifetime3 = var37Lifetime3 + var28;
                      var38Lifetime3 = var38Lifetime3 + var27;
                      var23++;
                      continue;
                    }
                  }
                  break;
                }
                var23 = var23 - var39Lifetime3;
              }
            }
            var36Lifetime3++;
            var31 = var31 - var27;
            var32 = var32 + var28;
            var23 = var23 + var24;
          }
          return;
        }
        if (var27 >= 0) {
          var36Lifetime1 = var22;
          while (var36Lifetime1 < 0) {
            var37Lifetime1 = var31 + (var29 * var28 >> 4);
            var38Lifetime1 = var32 + (var29 * var27 >> 4);
            var39Lifetime1 = var20;
            var40Lifetime1 = 0;
            var35Lifetime1 = var37Lifetime1 - (this.width << 12);
            if (var35Lifetime1 >= 0) {
              if (var28 != 0) {
                var35Lifetime1 = (var28 - var35Lifetime1) / var28;
                var39Lifetime1 = var39Lifetime1 + var35Lifetime1;
                var37Lifetime1 = var37Lifetime1 + var28 * var35Lifetime1;
                var38Lifetime1 = var38Lifetime1 + var27 * var35Lifetime1;
                var23 = var23 + var35Lifetime1;
                var40Lifetime1 = 1;
              } else {
                var23 = var23 - var39Lifetime1;
              }
            } else {
              var40Lifetime1 = 1;
            }
            if (var40Lifetime1 != 0) {
              var40Lifetime1 = 0;
              var35Lifetime1Lifetime1 = var38Lifetime1 + 4096;
              if (var35Lifetime1Lifetime1 < 0) {
                if (var27 != 0) {
                  var35Lifetime1Lifetime1 = (var27 - 1 - var35Lifetime1Lifetime1) / var27;
                  var39Lifetime1 = var39Lifetime1 + var35Lifetime1Lifetime1;
                  var37Lifetime1 = var37Lifetime1 + var28 * var35Lifetime1Lifetime1;
                  var38Lifetime1 = var38Lifetime1 + var27 * var35Lifetime1Lifetime1;
                  var23 = var23 + var35Lifetime1Lifetime1;
                  var40Lifetime1 = 1;
                } else {
                  var23 = var23 - var39Lifetime1;
                }
              } else {
                var40Lifetime1 = 1;
              }
              if (var40Lifetime1 != 0) {
                while (var39Lifetime1 < 0) {
                  if (var37Lifetime1 >= -4096) {
                    var34Lifetime1 = var38Lifetime1 >> 12;
                    if (var38Lifetime1 >> 12 < this.height) {
                      var33Lifetime1 = var37Lifetime1 >> 12;
                      this.a(var23, var33Lifetime1, var34Lifetime1, var37Lifetime1, var38Lifetime1);
                      var39Lifetime1++;
                      var37Lifetime1 = var37Lifetime1 + var28;
                      var38Lifetime1 = var38Lifetime1 + var27;
                      var23++;
                      continue;
                    }
                  }
                  break;
                }
                var23 = var23 - var39Lifetime1;
              }
            }
            var36Lifetime1++;
            var31 = var31 - var27;
            var32 = var32 + var28;
            var23 = var23 + var24;
          }
          return;
        }
        var36Lifetime2 = var22;
        while (var36Lifetime2 < 0) {
          var37Lifetime2 = var31 + (var29 * var28 >> 4);
          var38Lifetime2 = var32 + (var29 * var27 >> 4);
          var39Lifetime2 = var20;
          var40Lifetime2 = 0;
          var35Lifetime2 = var37Lifetime2 - (this.width << 12);
          if (var35Lifetime2 >= 0) {
            if (var28 != 0) {
              var35Lifetime2 = (var28 - var35Lifetime2) / var28;
              var39Lifetime2 = var39Lifetime2 + var35Lifetime2;
              var37Lifetime2 = var37Lifetime2 + var28 * var35Lifetime2;
              var38Lifetime2 = var38Lifetime2 + var27 * var35Lifetime2;
              var23 = var23 + var35Lifetime2;
              var40Lifetime2 = 1;
            } else {
              var23 = var23 - var39Lifetime2;
            }
          } else {
            var40Lifetime2 = 1;
          }
          if (var40Lifetime2 != 0) {
            var40Lifetime2 = 0;
            var35Lifetime2Lifetime1 = var38Lifetime2 - (this.height << 12);
            if (var35Lifetime2Lifetime1 >= 0) {
              if (var27 != 0) {
                var35Lifetime2Lifetime1 = (var27 - var35Lifetime2Lifetime1) / var27;
                var39Lifetime2 = var39Lifetime2 + var35Lifetime2Lifetime1;
                var37Lifetime2 = var37Lifetime2 + var28 * var35Lifetime2Lifetime1;
                var38Lifetime2 = var38Lifetime2 + var27 * var35Lifetime2Lifetime1;
                var23 = var23 + var35Lifetime2Lifetime1;
                var40Lifetime2 = 1;
              } else {
                var23 = var23 - var39Lifetime2;
              }
            } else {
              var40Lifetime2 = 1;
            }
            if (var40Lifetime2 != 0) {
              while (var39Lifetime2 < 0) {
                if (var37Lifetime2 >= -4096 &&
                  var38Lifetime2 >= -4096) {
                  var33Lifetime2 = var37Lifetime2 >> 12;
                  var34Lifetime2 = var38Lifetime2 >> 12;
                  this.a(var23, var33Lifetime2, var34Lifetime2, var37Lifetime2, var38Lifetime2);
                  var39Lifetime2++;
                  var37Lifetime2 = var37Lifetime2 + var28;
                  var38Lifetime2 = var38Lifetime2 + var27;
                  var23++;
                  continue;
                }
                break;
              }
              var23 = var23 - var39Lifetime2;
            }
          }
          var36Lifetime2++;
          var31 = var31 - var27;
          var32 = var32 + var28;
          var23 = var23 + var24;
        }
        return;
    }

    private final static void a(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var8 = 0;
        int var9 = 0;
        for (var8 = -param5; var8 < 0; var8++) {
          var9 = param3 + param4 - 3;
          while (param3 < var9) {
            param0[param3++] = param1[param2++];
            param0[param3++] = param1[param2++];
            param0[param3++] = param1[param2++];
            param0[param3++] = param1[param2++];
          }
          var9 += 3;
          while (param3 < var9) {
            param0[param3++] = param1[param2++];
          }
          param3 = param3 + param6;
          param2 = param2 + param7;
        }
    }

    RgbSprite(int canvasWidth, int canvasHeight, int offsetX, int offsetY, int width, int height, int[] pixels) {
        this.canvasWidth = canvasWidth;
        this.canvasHeight = canvasHeight;
        this.offsetX = offsetX;
        this.offsetY = offsetY;
        this.width = width;
        this.height = height;
        this.pixels = pixels;
    }

    private final void a(int param0, int param1, int param2, int param3, int param4) {
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_25_0 = 0;
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
        int var18;
        var6 = param2 * this.width + param1;
        param3 = param3 & 4095;
        param4 = param4 & 4095;
        if (param2 < 0) {
          var12 = 0;
          var11 = 0;
          var8 = 0;
          var7 = 0;
        } else {
          if (param1 < 0) {
            var11 = 0;
            var7 = 0;
          } else {
            var7 = this.pixels[var6];
            if (var7 == 0) {
              stackIn_5_0 = 0;
            } else {
              stackIn_5_0 = (4096 - param3) * (4096 - param4);
            }
            var11 = stackIn_5_0;
          }
          if (param1 >= this.width - 1) {
            var12 = 0;
            var8 = 0;
          } else {
            var8 = this.pixels[var6 + 1];
            if (var8 == 0) {
              stackIn_11_0 = 0;
            } else {
              stackIn_11_0 = param3 * (4096 - param4);
            }
            var12 = stackIn_11_0;
          }
        }
        if (param2 >= this.height - 1) {
          var14 = 0;
          var13 = 0;
          var10 = 0;
          var9 = 0;
        } else {
          if (param1 < 0) {
            var13 = 0;
            var9 = 0;
          } else {
            var9 = this.pixels[var6 + this.width];
            if (var9 == 0) {
              stackIn_19_0 = 0;
            } else {
              stackIn_19_0 = (4096 - param3) * param4;
            }
            var13 = stackIn_19_0;
          }
          if (param1 >= this.width - 1) {
            var14 = 0;
            var10 = 0;
          } else {
            var10 = this.pixels[var6 + this.width + 1];
            if (var10 == 0) {
              stackIn_25_0 = 0;
            } else {
              stackIn_25_0 = param3 * param4;
            }
            var14 = stackIn_25_0;
          }
        }
        var11 = var11 >> 16;
        var12 = var12 >> 16;
        var13 = var13 >> 16;
        var14 = var14 >> 16;
        var15 = var11 + var12 + var13 + var14;
        if (var15 < 256) {
          if (var15 < 128) {
            return;
          }
          var16 = (var7 & 16711935) * var11 + (var8 & 16711935) * var12;
          var16 = var16 + ((var9 & 16711935) * var13 + (var10 & 16711935) * var14);
          var17 = (var7 & 65280) * var11 + (var8 & 65280) * var12;
          var17 = var17 + ((var9 & 65280) * var13 + (var10 & 65280) * var14);
          var18 = ((var16 >>> 16) / var15 << 16) + (var17 / var15 & 65280) + (var16 & 65535) / var15;
          if (var18 == 0) {
            var18 = 1;
          }
          Rasterizer2D.pixels[param0] = var18;
        } else {
          var16 = (var7 & 16711935) * var11 + (var8 & 16711935) * var12;
          var16 = var16 + ((var9 & 16711935) * var13 + (var10 & 16711935) * var14);
          var17 = (var7 & 65280) * var11 + (var8 & 65280) * var12;
          var17 = var17 + ((var9 & 65280) * var13 + (var10 & 65280) * var14);
          var18 = (var16 >>> 8 & 16711935) + (var17 >>> 8 & 65280);
          if (var18 == 0) {
            var18 = 1;
          }
          Rasterizer2D.pixels[param0] = var18;
        }
    }

    private final static void a(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11) {
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var12 = param3;
        for (var13 = -param8; var13 < 0; var13++) {
          var14 = (param4 >> 16) * param11;
          for (var15 = -param7; var15 < 0; var15++) {
            param2 = param1[(param3 >> 16) + var14];
            if (param2 != 0) {
              param0[param5++] = param2;
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

    final void e(int param0, int param1, int param2, int param3) {
        int var5 = this.canvasWidth << 3;
        int var6 = this.canvasHeight << 3;
        param0 = (param0 << 4) + (var5 & 15);
        param1 = (param1 << 4) + (var6 & 15);
        this.a(var5, var6, param0, param1, param2, param3);
    }

    private final static void c(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var10 = 0;
        int var9;
        int var11;
        int var11Lifetime1;
        var9 = -(param5 >> 2);
        param5 = -(param5 & 3);
        for (var10 = -param6; var10 < 0; var10++) {
          for (var11 = var9; var11 < 0; var11++) {
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
          for (var11Lifetime1 = param5; var11Lifetime1 < 0; var11Lifetime1++) {
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

    private final static void a(int param0, int[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int var10 = 0;
        int var11 = 0;
        int incrementValue$5 = 0;
        int var12;
        int var13;
        int var14;
        for (var10 = -param7; var10 < 0; var10++) {
          for (var11 = -param6; var11 < 0; var11++) {
            param3 = param2[param4++];
            if (param3 != 0) {
              param0 = param1[param5];
              if (param0 != 0) {
                var12 = ((param3 & 16711680) >>> 16) * ((param0 & 16711680) >>> 16) >>> 8;
                var13 = (param3 & 65280) * (param0 & 65280) >>> 24;
                var14 = (param3 & 255) * (param0 & 255) >>> 8;
                incrementValue$5 = param5;
                param5++;
                param1[incrementValue$5] = (var12 << 16) + (var13 << 8) + var14;
              } else {
                param5++;
              }
            } else {
              param5++;
            }
          }
          param5 = param5 + param8;
          param4 = param4 + param9;
        }
    }

    void a(int param0, int param1) {
        param0 = param0 + (this.offsetX >> 1);
        param1 = param1 + (this.offsetY >> 1);
        int var3 = param0 < Rasterizer2D.clipLeft ? Rasterizer2D.clipLeft - param0 << 1 : 0;
        int var4 = param0 + (this.width >> 1) > Rasterizer2D.clipRight ? Rasterizer2D.clipRight - param0 << 1 : this.width;
        int var5 = param1 < Rasterizer2D.clipTop ? Rasterizer2D.clipTop - param1 << 1 : 0;
        int var6 = param1 + (this.height >> 1) > Rasterizer2D.clipBottom ? Rasterizer2D.clipBottom - param1 << 1 : this.height;
        RgbSprite.a(this.pixels, var5 * this.width + var3, (param1 + (var5 >> 1)) * Rasterizer2D.width + (param0 + (var3 >> 1)), (this.width << 1) - (var4 - var3) + (this.width & 1), Rasterizer2D.width - (var4 - var3 >> 1), this.width, var4 - var3 >> 1, var6 - var5 >> 1);
    }

    void f(int param0, int param1) {
        int var9 = 0;
        int var9Lifetime1;
        int var9Lifetime2;
        param0 = param0 + (this.canvasWidth - this.width - this.offsetX);
        param1 = param1 + this.offsetY;
        int var3 = param0 + param1 * Rasterizer2D.width;
        int var4 = this.width - 1;
        int var5 = this.height;
        int var6 = this.width;
        int var7 = Rasterizer2D.width - var6;
        int var8 = var6 + var6;
        if (param1 < Rasterizer2D.clipTop) {
          var9 = Rasterizer2D.clipTop - param1;
          var5 = var5 - var9;
          param1 = Rasterizer2D.clipTop;
          var4 = var4 + var9 * var6;
          var3 = var3 + var9 * Rasterizer2D.width;
        }
        if (param1 + var5 > Rasterizer2D.clipBottom) {
          var5 = var5 - (param1 + var5 - Rasterizer2D.clipBottom);
        }
        if (param0 < Rasterizer2D.clipLeft) {
          var9Lifetime1 = Rasterizer2D.clipLeft - param0;
          var6 = var6 - var9Lifetime1;
          param0 = Rasterizer2D.clipLeft;
          var4 = var4 - var9Lifetime1;
          var3 = var3 + var9Lifetime1;
          var8 = var8 - var9Lifetime1;
          var7 = var7 + var9Lifetime1;
        }
        if (param0 + var6 > Rasterizer2D.clipRight) {
          var9Lifetime2 = param0 + var6 - Rasterizer2D.clipRight;
          var6 = var6 - var9Lifetime2;
          var8 = var8 - var9Lifetime2;
          var7 = var7 + var9Lifetime2;
        }
        if (var6 > 0) {
          if (var5 <= 0) {
            return;
          }
          RgbSprite.a(Rasterizer2D.pixels, this.pixels, 0, var4, var3, var6, var5, var7, var8);
          return;
        }
    }

    private final static void b(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11) {
        int incrementValue$14 = 0;
        int var12;
        int var13;
        var12 = param11 & 16711935;
        var13 = param11 >> 8 & 255;
        for (param6 = -param8; param6 < 0; param6++) {
          for (param5 = -param7; param5 < 0; param5++) {
            param2 = param1[param3++];
            if (param2 == 0) {
              param4++;
            } else {
              if (param2 >> 8 != (param2 & 65535)) {
                param0[param4++] = param2;
              } else {
                param2 = param2 & 255;
                incrementValue$14 = param4;
                param4++;
                param0[incrementValue$14] = (param2 * var12 >> 8 & 16711934) + (param2 * var13 & 65280) + 1;
              }
            }
          }
          param4 = param4 + param9;
          param3 = param3 + param10;
        }
    }

    void b(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var15 = 0;
        int var14 = 0;
        int var16 = 0;
        int var14Lifetime1;
        int var14Lifetime2;
        int var16Lifetime1;
        int var16Lifetime2;
        if (param2 > 0) {
          if (param3 <= 0) {
            return;
          }
          var6 = this.width;
          var7 = this.height;
          var8 = 0;
          var9 = 0;
          var10 = this.canvasWidth;
          var11 = this.canvasHeight;
          var12 = (var10 << 16) / param2;
          var13 = (var11 << 16) / param3;
          if (this.offsetX > 0) {
            var14 = ((this.offsetX << 16) + var12 - 1) / var12;
            param0 = param0 + var14;
            var8 = var8 + (var14 * var12 - (this.offsetX << 16));
          }
          if (this.offsetY > 0) {
            var14Lifetime1 = ((this.offsetY << 16) + var13 - 1) / var13;
            param1 = param1 + var14Lifetime1;
            var9 = var9 + (var14Lifetime1 * var13 - (this.offsetY << 16));
          }
          if (var6 < var10) {
            param2 = ((var6 << 16) - var8 + var12 - 1) / var12;
          }
          if (var7 < var11) {
            param3 = ((var7 << 16) - var9 + var13 - 1) / var13;
          }
          var14Lifetime2 = param0 + param1 * Rasterizer2D.width;
          var15 = Rasterizer2D.width - param2;
          if (param1 + param3 > Rasterizer2D.clipBottom) {
            param3 = param3 - (param1 + param3 - Rasterizer2D.clipBottom);
          }
          if (param1 < Rasterizer2D.clipTop) {
            var16 = Rasterizer2D.clipTop - param1;
            param3 = param3 - var16;
            var14Lifetime2 = var14Lifetime2 + var16 * Rasterizer2D.width;
            var9 = var9 + var13 * var16;
          }
          if (param0 + param2 > Rasterizer2D.clipRight) {
            var16Lifetime1 = param0 + param2 - Rasterizer2D.clipRight;
            param2 = param2 - var16Lifetime1;
            var15 = var15 + var16Lifetime1;
          }
          if (param0 < Rasterizer2D.clipLeft) {
            var16Lifetime2 = Rasterizer2D.clipLeft - param0;
            param2 = param2 - var16Lifetime2;
            var14Lifetime2 = var14Lifetime2 + var16Lifetime2;
            var8 = var8 + var12 * var16Lifetime2;
            var15 = var15 + var16Lifetime2;
          }
          RgbSprite.a(Rasterizer2D.pixels, this.pixels, 0, var8, var9, var14Lifetime2, var15, param2, param3, var12, var13, var6, param4);
          return;
        }
    }

    final void d(int param0, int param1, int param2) {
        int var10 = 0;
        int var10Lifetime1;
        int var10Lifetime2;
        param0 = param0 + this.offsetX;
        param1 = param1 + this.offsetY;
        int var4 = param0 + param1 * Rasterizer2D.width;
        int var5 = 0;
        int var6 = this.height;
        int var7 = this.width;
        int var8 = Rasterizer2D.width - var7;
        int var9 = 0;
        if (param1 < Rasterizer2D.clipTop) {
          var10 = Rasterizer2D.clipTop - param1;
          var6 = var6 - var10;
          param1 = Rasterizer2D.clipTop;
          var5 = var5 + var10 * var7;
          var4 = var4 + var10 * Rasterizer2D.width;
        }
        if (param1 + var6 > Rasterizer2D.clipBottom) {
          var6 = var6 - (param1 + var6 - Rasterizer2D.clipBottom);
        }
        if (param0 < Rasterizer2D.clipLeft) {
          var10Lifetime1 = Rasterizer2D.clipLeft - param0;
          var7 = var7 - var10Lifetime1;
          param0 = Rasterizer2D.clipLeft;
          var5 = var5 + var10Lifetime1;
          var4 = var4 + var10Lifetime1;
          var9 = var9 + var10Lifetime1;
          var8 = var8 + var10Lifetime1;
        }
        if (param0 + var7 > Rasterizer2D.clipRight) {
          var10Lifetime2 = param0 + var7 - Rasterizer2D.clipRight;
          var7 = var7 - var10Lifetime2;
          var9 = var9 + var10Lifetime2;
          var8 = var8 + var10Lifetime2;
        }
        if (var7 > 0) {
          if (var6 <= 0) {
            return;
          }
          RgbSprite.c(Rasterizer2D.pixels, this.pixels, param2, var5, var4, var7, var6, var8, var9);
          return;
        }
    }

    private final static void b(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int var10 = 0;
        int var11 = 0;
        int incrementValue$12 = 0;
        int var12;
        int var13;
        for (var10 = -param6; var10 < 0; var10++) {
          for (var11 = -param5; var11 < 0; var11++) {
            param2 = param1[param3++];
            if (param2 == 0) {
              param4++;
            } else {
              var12 = (param2 & 16711935) * param9 & -16711936;
              var13 = (param2 & 65280) * param9 & 16711680;
              incrementValue$12 = param4;
              param4++;
              param0[incrementValue$12] = (var12 | var13) >>> 8;
            }
          }
          param4 = param4 + param7;
          param3 = param3 + param8;
        }
    }

    void drawTransparent(int x, int y) {
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
        if (var6 > 0) {
          if (var5 <= 0) {
            return;
          }
          RgbSprite.b(Rasterizer2D.pixels, this.pixels, 0, var4, var3, var6, var5, var7, var8);
          return;
        }
    }

    void e(int param0, int param1) {
        int var9 = 0;
        int var16 = 0;
        int var17 = 0;
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
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var13Lifetime1;
        var3 = this.width >> 2;
        var4 = this.height >> 2;
        param0 = param0 + this.offsetX / 4;
        param1 = param1 + this.offsetY / 4;
        if (param0 >= Rasterizer2D.clipLeft) {
          stackIn_3_0 = 0;
        } else {
          stackIn_3_0 = Rasterizer2D.clipLeft - param0 << 2;
        }
        var5 = stackIn_3_0;
        if (param0 + var3 <= Rasterizer2D.clipRight) {
          stackIn_6_0 = this.width - 4;
        } else {
          stackIn_6_0 = (Rasterizer2D.clipRight - param0 << 2) - 4;
        }
        var6 = stackIn_6_0;
        if (param1 >= Rasterizer2D.clipTop) {
          stackIn_9_0 = 0;
        } else {
          stackIn_9_0 = Rasterizer2D.clipTop - param1 << 2;
        }
        var7 = stackIn_9_0;
        if (param1 + var4 <= Rasterizer2D.clipBottom) {
          stackIn_12_0 = this.height - 4;
        } else {
          stackIn_12_0 = (Rasterizer2D.clipBottom - param1 << 2) - 4;
        }
        var8 = stackIn_12_0;
        for (var9 = var7; var9 <= var8; var9 += 4) {
          var10 = var9 * this.width + var5;
          var11 = (param1 + (var9 >> 2)) * Rasterizer2D.width + (param0 + (var5 >> 2));
          var12 = var5;
          while (var12 <= var6) {
            var13 = 0;
            var14 = 0;
            var15 = 0;
            for (var16 = 0; var16 < 4; var16++) {
              for (var17 = 0; var17 < 4; var17++) {
                var13Lifetime1 = this.pixels[var10 + var16 * this.width + var17];
                if (var13Lifetime1 == 0) {
                  var13Lifetime1 = Rasterizer2D.pixels[var11];
                }
                var14 = var14 + (var13Lifetime1 & 16711935);
                var15 = var15 + (var13Lifetime1 & 65280);
              }
            }
            Rasterizer2D.pixels[var11] = (var14 & 267390960 | var15 & 1044480) >> 4;
            var12 += 4;
            var10 += 4;
            var11++;
          }
        }
    }

    final RgbSprite copyFlippedHorizontal() {
        int var2 = 0;
        int var3 = 0;
        RgbSprite var1 = new RgbSprite(this.width, this.height);
        var1.canvasWidth = this.canvasWidth;
        var1.canvasHeight = this.canvasHeight;
        var1.offsetX = this.canvasWidth - this.width - this.offsetX;
        var1.offsetY = this.offsetY;
        for (var2 = 0; var2 < this.height; var2++) {
          for (var3 = 0; var3 < this.width; var3++) {
            var1.pixels[var2 * this.width + var3] = this.pixels[var2 * this.width + this.width - 1 - var3];
          }
        }
        return var1;
    }

    void e(int param0, int param1, int param2) {
        int var10 = 0;
        int var10Lifetime1;
        int var10Lifetime2;
        param0 = param0 + this.offsetX;
        param1 = param1 + this.offsetY;
        int var4 = param0 + param1 * Rasterizer2D.width;
        int var5 = 0;
        int var6 = this.height;
        int var7 = this.width;
        int var8 = Rasterizer2D.width - var7;
        int var9 = 0;
        if (param1 < Rasterizer2D.clipTop) {
          var10 = Rasterizer2D.clipTop - param1;
          var6 = var6 - var10;
          param1 = Rasterizer2D.clipTop;
          var5 = var5 + var10 * var7;
          var4 = var4 + var10 * Rasterizer2D.width;
        }
        if (param1 + var6 > Rasterizer2D.clipBottom) {
          var6 = var6 - (param1 + var6 - Rasterizer2D.clipBottom);
        }
        if (param0 < Rasterizer2D.clipLeft) {
          var10Lifetime1 = Rasterizer2D.clipLeft - param0;
          var7 = var7 - var10Lifetime1;
          param0 = Rasterizer2D.clipLeft;
          var5 = var5 + var10Lifetime1;
          var4 = var4 + var10Lifetime1;
          var9 = var9 + var10Lifetime1;
          var8 = var8 + var10Lifetime1;
        }
        if (param0 + var7 > Rasterizer2D.clipRight) {
          var10Lifetime2 = param0 + var7 - Rasterizer2D.clipRight;
          var7 = var7 - var10Lifetime2;
          var9 = var9 + var10Lifetime2;
          var8 = var8 + var10Lifetime2;
        }
        if (var7 > 0) {
          if (var6 <= 0) {
            return;
          }
          RgbSprite.c(Rasterizer2D.pixels, this.pixels, 0, var5, var4, var7, var6, var8, var9, param2);
          return;
        }
    }

    final void b(int param0, int param1) {
        int var9 = 0;
        int var9Lifetime1;
        int var9Lifetime2;
        param0 = param0 + this.offsetX;
        param1 = param1 + this.offsetY;
        int var3 = param0 + param1 * Rasterizer2D.width;
        int var4 = 0;
        int var5 = this.height;
        int var6 = this.width;
        int var7 = Rasterizer2D.width - var6;
        int var8 = 0;
        if (param1 < Rasterizer2D.clipTop) {
          var9 = Rasterizer2D.clipTop - param1;
          var5 = var5 - var9;
          param1 = Rasterizer2D.clipTop;
          var4 = var4 + var9 * var6;
          var3 = var3 + var9 * Rasterizer2D.width;
        }
        if (param1 + var5 > Rasterizer2D.clipBottom) {
          var5 = var5 - (param1 + var5 - Rasterizer2D.clipBottom);
        }
        if (param0 < Rasterizer2D.clipLeft) {
          var9Lifetime1 = Rasterizer2D.clipLeft - param0;
          var6 = var6 - var9Lifetime1;
          param0 = Rasterizer2D.clipLeft;
          var4 = var4 + var9Lifetime1;
          var3 = var3 + var9Lifetime1;
          var8 = var8 + var9Lifetime1;
          var7 = var7 + var9Lifetime1;
        }
        if (param0 + var6 > Rasterizer2D.clipRight) {
          var9Lifetime2 = param0 + var6 - Rasterizer2D.clipRight;
          var6 = var6 - var9Lifetime2;
          var8 = var8 + var9Lifetime2;
          var7 = var7 + var9Lifetime2;
        }
        if (var6 > 0) {
          if (var5 <= 0) {
            return;
          }
          RgbSprite.a(0, Rasterizer2D.pixels, this.pixels, 0, var4, var3, var6, var5, var7, var8);
          return;
        }
    }

    private final static void a(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var10 = 0;
        int var9;
        int var11;
        int var11Lifetime1;
        var9 = -(param5 >> 2);
        param5 = -(param5 & 3);
        for (var10 = -param6; var10 < 0; var10++) {
          for (var11 = var9; var11 < 0; var11++) {
            param2 = param1[param3--];
            if (param2 == 0) {
              param4++;
            } else {
              param0[param4++] = param2;
            }
            param2 = param1[param3--];
            if (param2 == 0) {
              param4++;
            } else {
              param0[param4++] = param2;
            }
            param2 = param1[param3--];
            if (param2 == 0) {
              param4++;
            } else {
              param0[param4++] = param2;
            }
            param2 = param1[param3--];
            if (param2 == 0) {
              param4++;
            } else {
              param0[param4++] = param2;
            }
          }
          for (var11Lifetime1 = param5; var11Lifetime1 < 0; var11Lifetime1++) {
            param2 = param1[param3--];
            if (param2 == 0) {
              param4++;
            } else {
              param0[param4++] = param2;
            }
          }
          param4 = param4 + param7;
          param3 = param3 + param8;
        }
    }

    void a(int param0, int param1, int param2) {
        int var10 = 0;
        int var10Lifetime1;
        int var10Lifetime2;
        if (param2 == 256) {
          this.drawTransparent(param0, param1);
          return;
        }
        param0 = param0 + this.offsetX;
        param1 = param1 + this.offsetY;
        int var4 = param0 + param1 * Rasterizer2D.width;
        int var5 = 0;
        int var6 = this.height;
        int var7 = this.width;
        int var8 = Rasterizer2D.width - var7;
        int var9 = 0;
        if (param1 < Rasterizer2D.clipTop) {
          var10 = Rasterizer2D.clipTop - param1;
          var6 = var6 - var10;
          param1 = Rasterizer2D.clipTop;
          var5 = var5 + var10 * var7;
          var4 = var4 + var10 * Rasterizer2D.width;
        }
        if (param1 + var6 > Rasterizer2D.clipBottom) {
          var6 = var6 - (param1 + var6 - Rasterizer2D.clipBottom);
        }
        if (param0 < Rasterizer2D.clipLeft) {
          var10Lifetime1 = Rasterizer2D.clipLeft - param0;
          var7 = var7 - var10Lifetime1;
          param0 = Rasterizer2D.clipLeft;
          var5 = var5 + var10Lifetime1;
          var4 = var4 + var10Lifetime1;
          var9 = var9 + var10Lifetime1;
          var8 = var8 + var10Lifetime1;
        }
        if (param0 + var7 > Rasterizer2D.clipRight) {
          var10Lifetime2 = param0 + var7 - Rasterizer2D.clipRight;
          var7 = var7 - var10Lifetime2;
          var9 = var9 + var10Lifetime2;
          var8 = var8 + var10Lifetime2;
        }
        if (var7 > 0) {
          if (var6 <= 0) {
            return;
          }
          RgbSprite.b(Rasterizer2D.pixels, this.pixels, 0, var5, var4, var7, var6, var8, var9, param2);
          return;
        }
    }

    private final static void a(int param0, int param1, int param2, int[] param3, int[] param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13) {
        int incrementValue$12 = 0;
        for (param8 = -param10; param8 < 0; param8++) {
          for (param6 = -param9; param6 < 0; param6++) {
            param0 = param4[param5++];
            if (param0 == 0) {
              param7++;
            } else {
              param1 = (param0 & 16711935) * param13;
              param0 = (param1 & -16711936) + (param0 * param13 - param1 & 16711680) >>> 8;
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

    final void rotateClockwise() {
        int var4 = 0;
        int incrementValue$0 = 0;
        int var3 = 0;
        int[] var1 = new int[this.width * this.height];
        int var2 = 0;
        int var3Lifetime1;
        int var3Lifetime2;
        int var3Lifetime3;
        for (var3 = 0; var3 < this.width; var3++) {
          for (var4 = this.height - 1; var4 >= 0; var4--) {
            incrementValue$0 = var2;
            var2++;
            var1[incrementValue$0] = this.pixels[var3 + var4 * this.width];
          }
        }
        this.pixels = var1;
        var3Lifetime1 = this.offsetY;
        this.offsetY = this.offsetX;
        this.offsetX = this.canvasHeight - this.height - var3Lifetime1;
        var3Lifetime2 = this.height;
        this.height = this.width;
        this.width = var3Lifetime2;
        var3Lifetime3 = this.canvasHeight;
        this.canvasHeight = this.canvasWidth;
        this.canvasWidth = var3Lifetime3;
    }

    RgbSprite(int width, int height) {
        this.pixels = new int[width * height];
        this.canvasWidth = width;
        this.width = width;
        this.canvasHeight = height;
        this.height = height;
        this.offsetY = 0;
        this.offsetX = 0;
    }

    private final static void c(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int var15 = 0;
        int var16 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var17;
        int var18;
        int var19;
        var10 = param9 >> 16 & 255;
        var11 = param9 >> 8 & 255;
        var12 = param9 & 255;
        var13 = -(param5 >> 2);
        param5 = -(param5 & 3);
        var14 = var13 + var13 + var13 + var13 + param5;
        for (var15 = -param6; var15 < 0; var15++) {
          for (var16 = var14; var16 < 0; var16++) {
            boolean decompiledFrameRemainder0 = true;
            param2 = param1[param3++];
            if (param2 == 0) {
              param4++;
            } else {
              var17 = param2 >> 16 & 255;
              var18 = param2 >> 8 & 255;
              var19 = param2 & 255;
              if (var17 == var18 &&
                var18 == var19) {
                if (var17 > 128) {
                  incrementValue$1 = param4;
                  param4++;
                  param0[incrementValue$1] = (var10 * (256 - var17) + 255 * (var17 - 128) >> 7 << 16) + (var11 * (256 - var18) + 255 * (var18 - 128) >> 7 << 8) + (var12 * (256 - var19) + 255 * (var19 - 128) >> 7);
                } else {
                  incrementValue$2 = param4;
                  param4++;
                  param0[incrementValue$2] = (var17 * var10 >> 7 << 16) + (var18 * var11 >> 7 << 8) + (var19 * var12 >> 7);
                }
                decompiledFrameRemainder0 = false;
              }
              else {
                param0[param4++] = param2;
              }
            }
          }
          param4 = param4 + param7;
          param3 = param3 + param8;
        }
    }

    final void trimTransparentBorders() {
        int var8 = 0;
        int var9 = 0;
        int var1;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int[] var7;
        int var2Lifetime1;
        int var3Lifetime1;
        int var3Lifetime2;
        int var4Lifetime1;
        int var4Lifetime2;
        int var5Lifetime1;
        var1 = this.height - 1;
        scanLoop1: while (true) {
          if (var1 >= 0) {
            var2 = var1 * this.width;
            for (var3 = 0; var3 < this.width; var3++) {
              if (this.pixels[var2 + var3] != 0) {
                break scanLoop1;
              }
            }
            var1--;
            continue;
          }
          break;
        }
        var2Lifetime1 = 0;
        scanLoop2: while (true) {
          if (var2Lifetime1 < var1) {
            var3Lifetime1 = var2Lifetime1 * this.width;
            for (var4 = 0; var4 < this.width; var4++) {
              if (this.pixels[var3Lifetime1 + var4] != 0) {
                break scanLoop2;
              }
            }
            var2Lifetime1++;
            continue;
          }
          break;
        }
        var3Lifetime2 = this.width - 1;
        scanLoop3: while (true) {
          if (var3Lifetime2 >= 0) {
            for (var4Lifetime1 = var2Lifetime1; var4Lifetime1 <= var1; var4Lifetime1++) {
              if (this.pixels[var4Lifetime1 * this.width + var3Lifetime2] != 0) {
                break scanLoop3;
              }
            }
            var3Lifetime2--;
            continue;
          }
          break;
        }
        var4Lifetime2 = 0;
        scanLoop4: while (true) {
          if (var4Lifetime2 < var3Lifetime2) {
            for (var5 = var2Lifetime1; var5 <= var1; var5++) {
              if (this.pixels[var5 * this.width + var4Lifetime2] != 0) {
                break scanLoop4;
              }
            }
            var4Lifetime2++;
            continue;
          }
          break;
        }
        if (var4Lifetime2 == 0 &&
          var3Lifetime2 == this.width - 1 &&
          var2Lifetime1 == 0 &&
          var1 == this.height - 1) {
          return;
        }
        var5Lifetime1 = var3Lifetime2 + 1 - var4Lifetime2;
        var6 = var1 + 1 - var2Lifetime1;
        var7 = new int[var5Lifetime1 * var6];
        for (var8 = 0; var8 < var6; var8++) {
          for (var9 = 0; var9 < var5Lifetime1; var9++) {
            var7[var8 * var5Lifetime1 + var9] = this.pixels[(var8 + var2Lifetime1) * this.width + (var9 + var4Lifetime2)];
          }
        }
        this.pixels = var7;
        this.width = var5Lifetime1;
        this.height = var6;
        this.offsetX = this.offsetX + var4Lifetime2;
        this.offsetY = this.offsetY + var2Lifetime1;
        return;
    }

    RgbSprite(byte[] param0, java.awt.Component param1) {
        Throwable decompiledCaughtException = null;
        java.awt.Image var3 = null;
        InterruptedException var3_ref = null;
        java.awt.MediaTracker var4 = null;
        java.awt.image.PixelGrabber var5 = null;
        try {
          var3 = java.awt.Toolkit.getDefaultToolkit().createImage(param0);
          var4 = new java.awt.MediaTracker(param1);
          var4.addImage(var3, 0);
          var4.waitForAll();
          this.width = var3.getWidth((java.awt.image.ImageObserver) ((Object) param1));
          this.height = var3.getHeight((java.awt.image.ImageObserver) ((Object) param1));
          this.canvasWidth = this.width;
          this.canvasHeight = this.height;
          this.offsetX = 0;
          this.offsetY = 0;
          this.pixels = new int[this.width * this.height];
          var5 = new java.awt.image.PixelGrabber(var3, 0, 0, this.width, this.height, this.pixels, 0, this.width);
          var5.grabPixels();
        } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = (InterruptedException) (Object) decompiledCaughtException;
        }
    }

    void drawAt(int x, int y) {
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
        if (var6 > 0) {
          if (var5 <= 0) {
            return;
          }
          RgbSprite.a(Rasterizer2D.pixels, this.pixels, var4, var3, var6, var5, var7, var8);
          return;
        }
    }

    final void bindRasterTarget() {
        Rasterizer2D.bind(this.pixels, this.width, this.height);
    }

    final void rotateCounterclockwise() {
        int var4 = 0;
        int incrementValue$0 = 0;
        int var3 = 0;
        int[] var1 = new int[this.width * this.height];
        int var2 = 0;
        int var3Lifetime1;
        int var3Lifetime2;
        int var3Lifetime3;
        for (var3 = this.width - 1; var3 >= 0; var3--) {
          for (var4 = 0; var4 < this.height; var4++) {
            incrementValue$0 = var2;
            var2++;
            var1[incrementValue$0] = this.pixels[var3 + var4 * this.width];
          }
        }
        this.pixels = var1;
        var3Lifetime1 = this.offsetX;
        this.offsetX = this.offsetY;
        this.offsetY = this.canvasWidth - this.width - var3Lifetime1;
        var3Lifetime2 = this.height;
        this.height = this.width;
        this.width = var3Lifetime2;
        var3Lifetime3 = this.canvasHeight;
        this.canvasHeight = this.canvasWidth;
        this.canvasWidth = var3Lifetime3;
    }

    final RgbSprite copy() {
        int var3 = 0;
        RgbSprite var1 = new RgbSprite(this.width, this.height);
        var1.canvasWidth = this.canvasWidth;
        var1.canvasHeight = this.canvasHeight;
        var1.offsetX = this.offsetX;
        var1.offsetY = this.offsetY;
        int var2 = this.pixels.length;
        for (var3 = 0; var3 < var2; var3++) {
          var1.pixels[var3] = this.pixels[var3];
        }
        return var1;
    }
}
