/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class IndexedSprite extends IndexedSpriteGeometry {
    byte[] indices;
    int[] palette;

    private final static void b(int[] param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int var11 = 0;
        int var12 = 0;
        int incrementValue$12 = 0;
        int var10;
        int var13;
        int var14;
        var10 = 256 - param9;
        for (var11 = -param6; var11 < 0; var11++) {
          for (var12 = -param5; var12 < 0; var12++) {
            var13 = param1[param3++];
            if (var13 == 0) {
              param4++;
            } else {
              var13 = param2[var13 & 255];
              var14 = param0[param4];
              incrementValue$12 = param4;
              param4++;
              param0[incrementValue$12] = ((var13 & 16711935) * param9 + (var14 & 16711935) * var10 & -16711936) + ((var13 & 65280) * param9 + (var14 & 65280) * var10 & 16711680) >> 8;
            }
          }
          param4 = param4 + param7;
          param3 = param3 + param8;
        }
    }

    private final static void a(int[] param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int var11 = 0;
        int incrementValue$3 = 0;
        int incrementValue$5 = 0;
        int incrementValue$7 = 0;
        int incrementValue$9 = 0;
        int incrementValue$1 = 0;
        int var10;
        int var12;
        int var12Lifetime1;
        var10 = -(param6 >> 2);
        param6 = -(param6 & 3);
        for (var11 = -param7; var11 < 0; var11++) {
          for (var12 = var10; var12 < 0; var12++) {
            param3 = param1[param4++];
            if (param3 == 0) {
              param5++;
            } else {
              incrementValue$3 = param5;
              param5++;
              param0[incrementValue$3] = param2[param3 & 255];
            }
            param3 = param1[param4++];
            if (param3 == 0) {
              param5++;
            } else {
              incrementValue$5 = param5;
              param5++;
              param0[incrementValue$5] = param2[param3 & 255];
            }
            param3 = param1[param4++];
            if (param3 == 0) {
              param5++;
            } else {
              incrementValue$7 = param5;
              param5++;
              param0[incrementValue$7] = param2[param3 & 255];
            }
            param3 = param1[param4++];
            if (param3 == 0) {
              param5++;
            } else {
              incrementValue$9 = param5;
              param5++;
              param0[incrementValue$9] = param2[param3 & 255];
            }
          }
          for (var12Lifetime1 = param6; var12Lifetime1 < 0; var12Lifetime1++) {
            param3 = param1[param4++];
            if (param3 == 0) {
              param5++;
            } else {
              incrementValue$1 = param5;
              param5++;
              param0[incrementValue$1] = param2[param3 & 255];
            }
          }
          param5 = param5 + param8;
          param4 = param4 + param9;
        }
    }

    final void drawAlpha(int x, int y, int alpha) {
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
        IndexedSprite.b(Rasterizer2D.pixels, this.indices, this.palette, var5, var4, var7, var6, var8, var9, alpha);
    }

    final void drawQuarter(int x, int y) {
        int var9 = 0;
        int var10 = 0;
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
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var13Lifetime1;
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
        for (var9 = var7; var9 <= var8; var9 += 4) {
          for (var10 = var5; var10 <= var6; var10 += 4) {
            var11 = var9 * this.width + var10;
            var12 = (y + (var9 >> 2)) * Rasterizer2D.width + (x + (var10 >> 2));
            var13 = 0;
            var14 = 0;
            var15 = 0;
            for (var16 = 0; var16 < 4; var16++) {
              for (var17 = 0; var17 < 4; var17++) {
                var13Lifetime1 = this.palette[this.indices[var11 + var16 * this.width + var17] & 255];
                if (var13Lifetime1 == 0) {
                  var13Lifetime1 = Rasterizer2D.pixels[var12];
                }
                var14 = var14 + (var13Lifetime1 & 16711935);
                var15 = var15 + (var13Lifetime1 & 65280);
              }
            }
            Rasterizer2D.pixels[var12] = (var14 & 267390960 | var15 & 1044480) >> 4;
          }
        }
    }

    final RgbSprite toRgbSprite() {
        int var3 = 0;
        int var1 = this.width * this.height;
        int[] var2 = new int[var1];
        for (var3 = 0; var3 < var1; var3++) {
          var2[var3] = this.palette[this.indices[var3] & 255];
        }
        return new RgbSprite(this.canvasWidth, this.canvasHeight, this.offsetX, this.offsetY, this.width, this.height, var2);
    }

    final void drawOpaque(int x, int y) {
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
        IndexedSprite.a(Rasterizer2D.pixels, this.indices, this.palette, var4, var3, var6, var5, var7, var8);
    }

    private final static void a(int[] param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var10 = 0;
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$8 = 0;
        int incrementValue$9 = 0;
        int var11 = 0;
        int var9 = -(param5 >> 2);
        int var11Lifetime1;
        param5 = -(param5 & 3);
        for (var10 = -param6; var10 < 0; var10++) {
          for (var11 = var9; var11 < 0; var11++) {
            incrementValue$0 = param4;
            param4++;
            incrementValue$1 = param3;
            param3++;
            param0[incrementValue$0] = param2[param1[incrementValue$1] & 255];
            incrementValue$2 = param4;
            param4++;
            incrementValue$3 = param3;
            param3++;
            param0[incrementValue$2] = param2[param1[incrementValue$3] & 255];
            incrementValue$4 = param4;
            param4++;
            incrementValue$5 = param3;
            param3++;
            param0[incrementValue$4] = param2[param1[incrementValue$5] & 255];
            incrementValue$6 = param4;
            param4++;
            incrementValue$7 = param3;
            param3++;
            param0[incrementValue$6] = param2[param1[incrementValue$7] & 255];
          }
          for (var11Lifetime1 = param5; var11Lifetime1 < 0; var11Lifetime1++) {
            incrementValue$8 = param4;
            param4++;
            incrementValue$9 = param3;
            param3++;
            param0[incrementValue$8] = param2[param1[incrementValue$9] & 255];
          }
          param4 = param4 + param7;
          param3 = param3 + param8;
        }
    }

    IndexedSprite(int canvasWidth, int canvasHeight, int offsetX, int offsetY, int width, int height, byte[] indices, int[] palette) {
        this.canvasWidth = canvasWidth;
        this.canvasHeight = canvasHeight;
        this.offsetX = offsetX;
        this.offsetY = offsetY;
        this.width = width;
        this.height = height;
        this.indices = indices;
        this.palette = palette;
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
        IndexedSprite.a(Rasterizer2D.pixels, this.indices, this.palette, 0, var4, var3, var6, var5, var7, var8);
    }

    IndexedSprite(int width, int height, int paletteSize) {
        this.width = width;
        this.canvasWidth = width;
        this.height = height;
        this.canvasHeight = height;
        this.offsetY = 0;
        this.offsetX = 0;
        this.indices = new byte[width * height];
        this.palette = new int[paletteSize];
    }
}
