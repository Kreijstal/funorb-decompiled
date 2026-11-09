/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class LegacyBinaryFont extends LegacyBitmapFont {
    LegacyBinaryFont() { super(null, null, null, null, null); }

    final static void blitBinaryMask(int[] destination, byte[] mask, int color, int sourceOffset, int destinationOffset, int width, int height, int destinationStride, int sourceStride) {
        int var10 = 0;
        int var9;
        int var11;
        int var11Lifetime1;
        var9 = -(width >> 2);
        width = -(width & 3);
        for (var10 = -height; var10 < 0; var10++) {
          for (var11 = var9; var11 < 0; var11++) {
            if (mask[sourceOffset++] == 0) {
              destinationOffset++;
            } else {
              destination[destinationOffset++] = color;
            }
            if (mask[sourceOffset++] == 0) {
              destinationOffset++;
            } else {
              destination[destinationOffset++] = color;
            }
            if (mask[sourceOffset++] == 0) {
              destinationOffset++;
            } else {
              destination[destinationOffset++] = color;
            }
            if (mask[sourceOffset++] == 0) {
              destinationOffset++;
            } else {
              destination[destinationOffset++] = color;
            }
          }
          for (var11Lifetime1 = width; var11Lifetime1 < 0; var11Lifetime1++) {
            if (mask[sourceOffset++] == 0) {
              destinationOffset++;
            } else {
              destination[destinationOffset++] = color;
            }
          }
          destinationOffset = destinationOffset + destinationStride;
          sourceOffset = sourceOffset + sourceStride;
        }
    }

    final static void blitBinaryMaskAlpha(int[] destination, byte[] mask, int color, int sourceOffset, int destinationOffset, int width, int height, int destinationStride, int sourceStride, int opacity) {
        int var10 = 0;
        int var11 = 0;
        int incrementValue$12 = 0;
        int var12;
        color = ((color & 16711935) * opacity & -16711936) + ((color & 65280) * opacity & 16711680) >> 8;
        opacity = 256 - opacity;
        for (var10 = -height; var10 < 0; var10++) {
          for (var11 = -width; var11 < 0; var11++) {
            if (mask[sourceOffset++] == 0) {
              destinationOffset++;
            } else {
              var12 = destination[destinationOffset];
              incrementValue$12 = destinationOffset;
              destinationOffset++;
              destination[incrementValue$12] = (((var12 & 16711935) * opacity & -16711936) + ((var12 & 65280) * opacity & 16711680) >> 8) + color;
            }
          }
          destinationOffset = destinationOffset + destinationStride;
          sourceOffset = sourceOffset + sourceStride;
        }
    }
}
