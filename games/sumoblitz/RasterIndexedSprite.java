/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class RasterIndexedSprite extends IndexedSprite {
    int[] palette;
    byte[] indices;

    private final static void blitIndexedAlpha(int[] destination, byte[] indices, int[] palette, int sourceOffset, int destinationOffset, int width, int height, int destinationStride, int sourceStride, int alpha) {
        int var11 = 0;
        int var12 = 0;
        int incrementValue$12 = 0;
        int var10;
        int var13;
        int var14;
        var10 = 256 - alpha;
        for (var11 = -height; var11 < 0; var11++) {
          for (var12 = -width; var12 < 0; var12++) {
            var13 = indices[sourceOffset++];
            if (var13 == 0) {
              destinationOffset++;
            } else {
              var13 = palette[var13 & 255];
              var14 = destination[destinationOffset];
              incrementValue$12 = destinationOffset;
              destinationOffset++;
              destination[incrementValue$12] = ((var13 & 16711935) * alpha + (var14 & 16711935) * var10 & -16711936) + ((var13 & 65280) * alpha + (var14 & 65280) * var10 & 16711680) >> 8;
            }
          }
          destinationOffset = destinationOffset + destinationStride;
          sourceOffset = sourceOffset + sourceStride;
        }
    }

    final void drawAlpha(int x, int y, int alpha) {
        int var10 = 0;
        int var10Lifetime1;
        int var10Lifetime2;
        x = x + this.offsetX;
        y = y + this.offsetY;
        int var4 = x + y * SoftwareRasterizer.width;
        int var5 = 0;
        int var6 = this.height;
        int var7 = this.width;
        int var8 = SoftwareRasterizer.width - var7;
        int var9 = 0;
        if (y < SoftwareRasterizer.clipTop) {
          var10 = SoftwareRasterizer.clipTop - y;
          var6 = var6 - var10;
          y = SoftwareRasterizer.clipTop;
          var5 = var5 + var10 * var7;
          var4 = var4 + var10 * SoftwareRasterizer.width;
        }
        if (y + var6 > SoftwareRasterizer.clipBottom) {
          var6 = var6 - (y + var6 - SoftwareRasterizer.clipBottom);
        }
        if (x < SoftwareRasterizer.clipLeft) {
          var10Lifetime1 = SoftwareRasterizer.clipLeft - x;
          var7 = var7 - var10Lifetime1;
          x = SoftwareRasterizer.clipLeft;
          var5 = var5 + var10Lifetime1;
          var4 = var4 + var10Lifetime1;
          var9 = var9 + var10Lifetime1;
          var8 = var8 + var10Lifetime1;
        }
        if (x + var7 > SoftwareRasterizer.clipRight) {
          var10Lifetime2 = x + var7 - SoftwareRasterizer.clipRight;
          var7 = var7 - var10Lifetime2;
          var9 = var9 + var10Lifetime2;
          var8 = var8 + var10Lifetime2;
        }
        if (var7 <= 0 ||
          var6 <= 0) {
          return;
        }
        RasterIndexedSprite.blitIndexedAlpha(SoftwareRasterizer.pixels, this.indices, this.palette, var5, var4, var7, var6, var8, var9, alpha);
    }

    RasterIndexedSprite(int canvasWidth, int canvasHeight, int left, int top, int pixelWidth, int pixelHeight, byte[] pixelIndices, int[] colors) {
        this.fullWidth = canvasWidth;
        this.fullHeight = canvasHeight;
        this.offsetX = left;
        this.offsetY = top;
        this.width = pixelWidth;
        this.height = pixelHeight;
        this.indices = pixelIndices;
        this.palette = colors;
    }

    RasterIndexedSprite(int pixelWidth, int pixelHeight, int paletteSize) {
        this.width = pixelWidth;
        this.fullWidth = pixelWidth;
        this.height = pixelHeight;
        this.fullHeight = pixelHeight;
        this.offsetY = 0;
        this.offsetX = 0;
        this.indices = new byte[pixelWidth * pixelHeight];
        this.palette = new int[paletteSize];
    }

    private final static void blitIndexed(int[] destination, byte[] indices, int[] palette, int paletteIndex, int sourceOffset, int destinationOffset, int width, int height, int destinationStride, int sourceStride) {
        int var11 = 0;
        int incrementValue$3 = 0;
        int incrementValue$5 = 0;
        int incrementValue$7 = 0;
        int incrementValue$9 = 0;
        int incrementValue$1 = 0;
        int var10;
        int var12;
        int var12Lifetime1;
        var10 = -(width >> 2);
        width = -(width & 3);
        for (var11 = -height; var11 < 0; var11++) {
          for (var12 = var10; var12 < 0; var12++) {
            paletteIndex = indices[sourceOffset++];
            if (paletteIndex == 0) {
              destinationOffset++;
            } else {
              incrementValue$3 = destinationOffset;
              destinationOffset++;
              destination[incrementValue$3] = palette[paletteIndex & 255];
            }
            paletteIndex = indices[sourceOffset++];
            if (paletteIndex == 0) {
              destinationOffset++;
            } else {
              incrementValue$5 = destinationOffset;
              destinationOffset++;
              destination[incrementValue$5] = palette[paletteIndex & 255];
            }
            paletteIndex = indices[sourceOffset++];
            if (paletteIndex == 0) {
              destinationOffset++;
            } else {
              incrementValue$7 = destinationOffset;
              destinationOffset++;
              destination[incrementValue$7] = palette[paletteIndex & 255];
            }
            paletteIndex = indices[sourceOffset++];
            if (paletteIndex == 0) {
              destinationOffset++;
            } else {
              incrementValue$9 = destinationOffset;
              destinationOffset++;
              destination[incrementValue$9] = palette[paletteIndex & 255];
            }
          }
          for (var12Lifetime1 = width; var12Lifetime1 < 0; var12Lifetime1++) {
            paletteIndex = indices[sourceOffset++];
            if (paletteIndex == 0) {
              destinationOffset++;
            } else {
              incrementValue$1 = destinationOffset;
              destinationOffset++;
              destination[incrementValue$1] = palette[paletteIndex & 255];
            }
          }
          destinationOffset = destinationOffset + destinationStride;
          sourceOffset = sourceOffset + sourceStride;
        }
    }

    final void draw(int x, int y) {
        int var9 = 0;
        int var9Lifetime1;
        int var9Lifetime2;
        x = x + this.offsetX;
        y = y + this.offsetY;
        int var3 = x + y * SoftwareRasterizer.width;
        int var4 = 0;
        int var5 = this.height;
        int var6 = this.width;
        int var7 = SoftwareRasterizer.width - var6;
        int var8 = 0;
        if (y < SoftwareRasterizer.clipTop) {
          var9 = SoftwareRasterizer.clipTop - y;
          var5 = var5 - var9;
          y = SoftwareRasterizer.clipTop;
          var4 = var4 + var9 * var6;
          var3 = var3 + var9 * SoftwareRasterizer.width;
        }
        if (y + var5 > SoftwareRasterizer.clipBottom) {
          var5 = var5 - (y + var5 - SoftwareRasterizer.clipBottom);
        }
        if (x < SoftwareRasterizer.clipLeft) {
          var9Lifetime1 = SoftwareRasterizer.clipLeft - x;
          var6 = var6 - var9Lifetime1;
          x = SoftwareRasterizer.clipLeft;
          var4 = var4 + var9Lifetime1;
          var3 = var3 + var9Lifetime1;
          var8 = var8 + var9Lifetime1;
          var7 = var7 + var9Lifetime1;
        }
        if (x + var6 > SoftwareRasterizer.clipRight) {
          var9Lifetime2 = x + var6 - SoftwareRasterizer.clipRight;
          var6 = var6 - var9Lifetime2;
          var8 = var8 + var9Lifetime2;
          var7 = var7 + var9Lifetime2;
        }
        if (var6 <= 0 ||
          var5 <= 0) {
          return;
        }
        RasterIndexedSprite.blitIndexed(SoftwareRasterizer.pixels, this.indices, this.palette, 0, var4, var3, var6, var5, var7, var8);
    }
}
