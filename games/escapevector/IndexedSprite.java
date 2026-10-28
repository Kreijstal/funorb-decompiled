/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class IndexedSprite extends IndexedSpriteState {
    int[] field_l;
    byte[] field_k;

    final void draw(int x, int y) {
        x = x + this.field_f;
        y = y + this.field_i;
        int var3 = x + y * SoftwareRasterizer.width;
        int var4 = 0;
        int var5 = this.field_d;
        int var6 = this.field_g;
        int var7 = SoftwareRasterizer.width - var6;
        int var8 = 0;
        if (y < SoftwareRasterizer.clipTop) {
          int var9 = SoftwareRasterizer.clipTop - y;
          var5 = var5 - var9;
          y = SoftwareRasterizer.clipTop;
          var4 = var4 + var9 * var6;
          var3 = var3 + var9 * SoftwareRasterizer.width;
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
        IndexedSprite.blitTransparent(SoftwareRasterizer.pixels, this.field_k, this.field_l, 0, var4, var3, var6, var5, var7, var8);
    }

    IndexedSprite(int param0, int param1, int param2, int param3, int param4, int param5, byte[] param6, int[] param7) {
        this.field_a = param0;
        this.field_h = param1;
        this.field_f = param2;
        this.field_i = param3;
        this.field_g = param4;
        this.field_d = param5;
        this.field_k = param6;
        this.field_l = param7;
    }

    final void drawAlpha(int x, int y, int alpha) {
        x = x + this.field_f;
        y = y + this.field_i;
        int var4 = x + y * SoftwareRasterizer.width;
        int var5 = 0;
        int var6 = this.field_d;
        int var7 = this.field_g;
        int var8 = SoftwareRasterizer.width - var7;
        int var9 = 0;
        if (y < SoftwareRasterizer.clipTop) {
          int var10 = SoftwareRasterizer.clipTop - y;
          var6 = var6 - var10;
          y = SoftwareRasterizer.clipTop;
          var5 = var5 + var10 * var7;
          var4 = var4 + var10 * SoftwareRasterizer.width;
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
        IndexedSprite.blitAlpha(SoftwareRasterizer.pixels, this.field_k, this.field_l, var5, var4, var7, var6, var8, var9, alpha);
    }

    IndexedSprite(int param0, int param1, int param2) {
        this.field_g = param0;
        this.field_a = param0;
        this.field_d = param1;
        this.field_h = param1;
        this.field_i = 0;
        this.field_f = 0;
        this.field_k = new byte[param0 * param1];
        this.field_l = new int[param2];
    }

    private final static void blitAlpha(int[] destination, byte[] indices, int[] palette, int sourceIndex, int destinationIndex, int width, int height, int destinationSkip, int sourceSkip, int alpha) {
        int var10 = 256 - alpha;
        for (int var11 = -height; var11 < 0; var11++) {
          for (int var12 = -width; var12 < 0; var12++) {
            int var13 = indices[sourceIndex++];
            if (var13 == 0) {
              destinationIndex++;
            } else {
              var13 = palette[var13 & 255];
              int var14 = destination[destinationIndex];
              int incrementValue$12 = destinationIndex;
              destinationIndex++;
              destination[incrementValue$12] = ((var13 & 16711935) * alpha + (var14 & 16711935) * var10 & -16711936) + ((var13 & 65280) * alpha + (var14 & 65280) * var10 & 16711680) >> 8;
            }
          }
          destinationIndex = destinationIndex + destinationSkip;
          sourceIndex = sourceIndex + sourceSkip;
        }
    }

    private final static void blitTransparent(int[] destination, byte[] indices, int[] palette, int pixelScratch, int sourceIndex, int destinationIndex, int width, int height, int destinationSkip, int sourceSkip) {
        int var10 = -(width >> 2);
        width = -(width & 3);
        for (int var11 = -height; var11 < 0; var11++) {
          for (int var12 = var10; var12 < 0; var12++) {
            pixelScratch = indices[sourceIndex++];
            if (pixelScratch == 0) {
              destinationIndex++;
            } else {
              int incrementValue$3 = destinationIndex;
              destinationIndex++;
              destination[incrementValue$3] = palette[pixelScratch & 255];
            }
            pixelScratch = indices[sourceIndex++];
            if (pixelScratch == 0) {
              destinationIndex++;
            } else {
              int incrementValue$5 = destinationIndex;
              destinationIndex++;
              destination[incrementValue$5] = palette[pixelScratch & 255];
            }
            pixelScratch = indices[sourceIndex++];
            if (pixelScratch == 0) {
              destinationIndex++;
            } else {
              int incrementValue$7 = destinationIndex;
              destinationIndex++;
              destination[incrementValue$7] = palette[pixelScratch & 255];
            }
            pixelScratch = indices[sourceIndex++];
            if (pixelScratch == 0) {
              destinationIndex++;
            } else {
              int incrementValue$9 = destinationIndex;
              destinationIndex++;
              destination[incrementValue$9] = palette[pixelScratch & 255];
            }
          }
          for (int var12Lifetime1 = width; var12Lifetime1 < 0; var12Lifetime1++) {
            pixelScratch = indices[sourceIndex++];
            if (pixelScratch == 0) {
              destinationIndex++;
            } else {
              int incrementValue$1 = destinationIndex;
              destinationIndex++;
              destination[incrementValue$1] = palette[pixelScratch & 255];
            }
          }
          destinationIndex = destinationIndex + destinationSkip;
          sourceIndex = sourceIndex + sourceSkip;
        }
    }
}
