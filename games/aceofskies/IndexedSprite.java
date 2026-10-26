/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class IndexedSprite extends IndexedSpriteState {
    int[] palette;
    byte[] indices;

    final void draw(int x, int y) {
        x = x + this.trimX;
        y = y + this.trimY;
        int var3 = x + y * SoftwareRasterizer.stride;
        int var4 = 0;
        int var5 = this.height;
        int var6 = this.width;
        int var7 = SoftwareRasterizer.stride - var6;
        int var8 = 0;
        if (y < SoftwareRasterizer.clipTop) {
          int var9 = SoftwareRasterizer.clipTop - y;
          var5 = var5 - var9;
          y = SoftwareRasterizer.clipTop;
          var4 = var4 + var9 * var6;
          var3 = var3 + var9 * SoftwareRasterizer.stride;
        }
        if (y + var5 > SoftwareRasterizer.clipBottom) {
          var5 = var5 - (y + var5 - SoftwareRasterizer.clipBottom);
        }
        if (x < SoftwareRasterizer.clipLeft) {
          int var9Lifetime1 = SoftwareRasterizer.clipLeft - x;
          var6 = var6 - var9Lifetime1;
          x = SoftwareRasterizer.clipLeft;
          var4 = var4 + var9Lifetime1;
          var3 = var3 + var9Lifetime1;
          var8 = var8 + var9Lifetime1;
          var7 = var7 + var9Lifetime1;
        }
        if (x + var6 > SoftwareRasterizer.clipRight) {
          int var9Lifetime2 = x + var6 - SoftwareRasterizer.clipRight;
          var6 = var6 - var9Lifetime2;
          var8 = var8 + var9Lifetime2;
          var7 = var7 + var9Lifetime2;
        }
        if (var6 <= 0 ||
          var5 <= 0) {
          return;
        }
        IndexedSprite.a(SoftwareRasterizer.framebuffer, this.indices, this.palette, 0, var4, var3, var6, var5, var7, var8);
    }

    private final static void a(int[] param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int var10 = -(param6 >> 2);
        param6 = -(param6 & 3);
        for (int var11 = -param7; var11 < 0; var11++) {
          for (int var12 = var10; var12 < 0; var12++) {
            param3 = param1[param4++];
            if (param3 == 0) {
              param5++;
            } else {
              int incrementValue$3 = param5;
              param5++;
              param0[incrementValue$3] = param2[param3 & 255];
            }
            param3 = param1[param4++];
            if (param3 == 0) {
              param5++;
            } else {
              int incrementValue$5 = param5;
              param5++;
              param0[incrementValue$5] = param2[param3 & 255];
            }
            param3 = param1[param4++];
            if (param3 == 0) {
              param5++;
            } else {
              int incrementValue$7 = param5;
              param5++;
              param0[incrementValue$7] = param2[param3 & 255];
            }
            param3 = param1[param4++];
            if (param3 == 0) {
              param5++;
            } else {
              int incrementValue$9 = param5;
              param5++;
              param0[incrementValue$9] = param2[param3 & 255];
            }
          }
          for (int var12Lifetime1 = param6; var12Lifetime1 < 0; var12Lifetime1++) {
            param3 = param1[param4++];
            if (param3 == 0) {
              param5++;
            } else {
              int incrementValue$1 = param5;
              param5++;
              param0[incrementValue$1] = param2[param3 & 255];
            }
          }
          param5 = param5 + param8;
          param4 = param4 + param9;
        }
    }

    private final static void b(int[] param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int var10 = 256 - param9;
        for (int var11 = -param6; var11 < 0; var11++) {
          for (int var12 = -param5; var12 < 0; var12++) {
            int var13 = param1[param3++];
            if (var13 == 0) {
              param4++;
            } else {
              var13 = param2[var13 & 255];
              int var14 = param0[param4];
              int incrementValue$12 = param4;
              param4++;
              param0[incrementValue$12] = ((var13 & 16711935) * param9 + (var14 & 16711935) * var10 & -16711936) + ((var13 & 65280) * param9 + (var14 & 65280) * var10 & 16711680) >> 8;
            }
          }
          param4 = param4 + param7;
          param3 = param3 + param8;
        }
    }

    final void drawAlpha(int x, int y, int alpha256) {
        x = x + this.trimX;
        y = y + this.trimY;
        int var4 = x + y * SoftwareRasterizer.stride;
        int var5 = 0;
        int var6 = this.height;
        int var7 = this.width;
        int var8 = SoftwareRasterizer.stride - var7;
        int var9 = 0;
        if (y < SoftwareRasterizer.clipTop) {
          int var10 = SoftwareRasterizer.clipTop - y;
          var6 = var6 - var10;
          y = SoftwareRasterizer.clipTop;
          var5 = var5 + var10 * var7;
          var4 = var4 + var10 * SoftwareRasterizer.stride;
        }
        if (y + var6 > SoftwareRasterizer.clipBottom) {
          var6 = var6 - (y + var6 - SoftwareRasterizer.clipBottom);
        }
        if (x < SoftwareRasterizer.clipLeft) {
          int var10Lifetime1 = SoftwareRasterizer.clipLeft - x;
          var7 = var7 - var10Lifetime1;
          x = SoftwareRasterizer.clipLeft;
          var5 = var5 + var10Lifetime1;
          var4 = var4 + var10Lifetime1;
          var9 = var9 + var10Lifetime1;
          var8 = var8 + var10Lifetime1;
        }
        if (x + var7 > SoftwareRasterizer.clipRight) {
          int var10Lifetime2 = x + var7 - SoftwareRasterizer.clipRight;
          var7 = var7 - var10Lifetime2;
          var9 = var9 + var10Lifetime2;
          var8 = var8 + var10Lifetime2;
        }
        if (var7 <= 0 ||
          var6 <= 0) {
          return;
        }
        IndexedSprite.b(SoftwareRasterizer.framebuffer, this.indices, this.palette, var5, var4, var7, var6, var8, var9, alpha256);
    }

    IndexedSprite(int fullWidth, int fullHeight, int trimX, int trimY, int width, int height, byte[] indices, int[] palette) {
        this.fullWidth = fullWidth;
        this.fullHeight = fullHeight;
        this.trimX = trimX;
        this.trimY = trimY;
        this.width = width;
        this.height = height;
        this.indices = indices;
        this.palette = palette;
    }

    IndexedSprite(int width, int height, int paletteSize) {
        this.width = width;
        this.fullWidth = width;
        this.height = height;
        this.fullHeight = height;
        this.trimY = 0;
        this.trimX = 0;
        this.indices = new byte[width * height];
        this.palette = new int[paletteSize];
    }
}
