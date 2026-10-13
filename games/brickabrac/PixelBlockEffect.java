/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PixelBlockEffect {
    final static void pixelate(int blockSize, int sourceWeight, int tint, boolean alignRight, boolean alignBottom) {
        int sampleY = 0;
        int sampleX = 0;
        int var19 = 0;
        int var20 = 0;
        int incrementValue$0 = 0;
        int tintRedBlue;
        int startX;
        int startY;
        int reverseBlockOffset;
        int samplePixelIndex;
        int sampleRowSkip;
        int blockColor;
        int sourceRedBlue;
        int var15;
        int var16;
        int outputPixelIndex;
        int outputRowSkip;
        tintRedBlue = (tint & 16711935) * (256 - sourceWeight) >>> 8 & 16711935;
        tint = tintRedBlue | (tint & 65280) * (256 - sourceWeight) >>> 8 & 65280;
        reverseBlockOffset = 0;
        if (!alignRight) {
          startX = 0;
        } else {
          startX = (Rasterizer2D.width - 1) % blockSize;
          reverseBlockOffset = reverseBlockOffset + (blockSize - 1);
        }
        if (!alignBottom) {
          startY = 0;
        } else {
          startY = (Rasterizer2D.height - 1) % blockSize;
          reverseBlockOffset = reverseBlockOffset + (blockSize - 1) * Rasterizer2D.width;
        }
        samplePixelIndex = startY * Rasterizer2D.width + startX;
        sampleRowSkip = Rasterizer2D.width * blockSize - (Rasterizer2D.width + blockSize - 1) / blockSize * blockSize;
        for (sampleY = startY; sampleY < Rasterizer2D.height; sampleY = sampleY + blockSize) {
          for (sampleX = startX; sampleX < Rasterizer2D.width; sampleX = sampleX + blockSize) {
            blockColor = Rasterizer2D.pixels[samplePixelIndex];
            sourceRedBlue = (blockColor & 16711935) * sourceWeight >>> 8 & 16711935;
            blockColor = (sourceRedBlue | (blockColor & 65280) * sourceWeight >>> 8 & 65280) + tint;
            var15 = blockSize;
            var16 = blockSize;
            outputPixelIndex = samplePixelIndex - reverseBlockOffset;
            outputRowSkip = Rasterizer2D.width;
            if (!alignRight) {
              if (var15 > Rasterizer2D.width - sampleX) {
                var15 = Rasterizer2D.width - sampleX;
              }
            } else {
              if (var15 > sampleX + 1) {
                outputPixelIndex = outputPixelIndex + (var15 - sampleX - 1);
                var15 = sampleX + 1;
              }
            }
            if (!alignBottom) {
              if (var16 > Rasterizer2D.height - sampleY) {
                var16 = Rasterizer2D.height - sampleY;
              }
            } else {
              if (var16 > sampleY + 1) {
                outputPixelIndex = outputPixelIndex + (var16 - sampleY - 1) * outputRowSkip;
                var16 = sampleY + 1;
              }
            }
            outputRowSkip = outputRowSkip - var15;
            var15 = -var15;
            var16 = -var16;
            for (var19 = var16; var19 < 0; var19++) {
              for (var20 = var15; var20 < 0; var20++) {
                incrementValue$0 = outputPixelIndex;
                outputPixelIndex++;
                Rasterizer2D.pixels[incrementValue$0] = blockColor;
              }
              outputPixelIndex = outputPixelIndex + outputRowSkip;
            }
            samplePixelIndex = samplePixelIndex + blockSize;
          }
          samplePixelIndex = samplePixelIndex + sampleRowSkip;
        }
    }
}
