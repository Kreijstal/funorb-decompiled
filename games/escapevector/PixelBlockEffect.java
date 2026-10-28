/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PixelBlockEffect {
    final static void apply(int blockSize, int sourceWeight, boolean reverseX, boolean reverseY) {
        PixelBlockEffect.applyTinted(blockSize, sourceWeight, 0, reverseX, reverseY);
    }

    private final static void applyTinted(int blockSize, int sourceWeight, int tint, boolean reverseX, boolean reverseY) {
        int var6;
        int var7;
        int var5 = (tint & 16711935) * (256 - sourceWeight) >>> 8 & 16711935;
        tint = var5 | (tint & 65280) * (256 - sourceWeight) >>> 8 & 65280;
        int var8 = 0;
        if (!reverseX) {
          var6 = 0;
        } else {
          var6 = (SoftwareRasterizer.width - 1) % blockSize;
          var8 = var8 + (blockSize - 1);
        }
        if (!reverseY) {
          var7 = 0;
        } else {
          var7 = (SoftwareRasterizer.height - 1) % blockSize;
          var8 = var8 + (blockSize - 1) * SoftwareRasterizer.width;
        }
        int var9 = var7 * SoftwareRasterizer.width + var6;
        int var10 = SoftwareRasterizer.width * blockSize - (SoftwareRasterizer.width + blockSize - 1) / blockSize * blockSize;
        for (int var11 = var7; var11 < SoftwareRasterizer.height; var11 = var11 + blockSize) {
          for (int var12 = var6; var12 < SoftwareRasterizer.width; var12 = var12 + blockSize) {
            int var13 = SoftwareRasterizer.pixels[var9];
            int var14 = (var13 & 16711935) * sourceWeight >>> 8 & 16711935;
            var13 = (var14 | (var13 & 65280) * sourceWeight >>> 8 & 65280) + tint;
            int var15 = blockSize;
            int var16 = blockSize;
            int var17 = var9 - var8;
            int var18 = SoftwareRasterizer.width;
            if (!reverseX) {
              if (var15 > SoftwareRasterizer.width - var12) {
                var15 = SoftwareRasterizer.width - var12;
              }
            } else if (var15 > var12 + 1) {
              var17 = var17 + (var15 - var12 - 1);
              var15 = var12 + 1;
            }
            if (!reverseY) {
              if (var16 > SoftwareRasterizer.height - var11) {
                var16 = SoftwareRasterizer.height - var11;
              }
            } else if (var16 > var11 + 1) {
              var17 = var17 + (var16 - var11 - 1) * var18;
              var16 = var11 + 1;
            }
            var18 = var18 - var15;
            var15 = -var15;
            var16 = -var16;
            for (int var19 = var16; var19 < 0; var19++) {
              for (int var20 = var15; var20 < 0; var20++) {
                int incrementValue$0 = var17;
                var17++;
                SoftwareRasterizer.pixels[incrementValue$0] = var13;
              }
              var17 = var17 + var18;
            }
            var9 = var9 + blockSize;
          }
          var9 = var9 + var10;
        }
    }
}
