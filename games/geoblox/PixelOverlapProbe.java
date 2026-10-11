/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PixelOverlapProbe {
    static int firstOverlapX;
    static int firstOverlapY;

    final static boolean findFirstNonzeroPixelOverlap(Sprite firstRaster, int firstOriginX, int firstOriginY, Sprite secondRaster, int secondOriginX, int secondOriginY) {
        int remainingOverlapRows = 0;
        int remainingOverlapColumns = 0;
        int positiveHorizontalOffset = 0;
        int positiveVerticalOffset = 0;
        int secondRasterOffsetX;
        int firstRasterWidth;
        int secondRasterWidth;
        int secondRasterOffsetY;
        int firstRasterHeight;
        int secondRasterHeight;
        int overlapLeftInFirst;
        int overlapRightThenWidth;
        int overlapTopInFirst;
        int overlapBottomThenHeight;
        int firstPixelIndex;
        int firstRowSkip;
        int secondPixelIndex;
        int secondRowSkip;
        int[] firstPixels;
        int[] secondPixels;
        firstOriginX = firstOriginX + firstRaster.trimX;
        secondOriginX = secondOriginX + secondRaster.trimX;
        secondRasterOffsetX = secondOriginX - firstOriginX;
        firstRasterWidth = firstRaster.width;
        if (secondRasterOffsetX < firstRaster.width) {
          secondRasterWidth = secondRaster.width;
          if (secondRasterOffsetX > -secondRaster.width) {
            firstOriginY = firstOriginY + firstRaster.trimY;
            secondOriginY = secondOriginY + secondRaster.trimY;
            secondRasterOffsetY = secondOriginY - firstOriginY;
            firstRasterHeight = firstRaster.height;
            if (secondRasterOffsetY < firstRaster.height) {
              secondRasterHeight = secondRaster.height;
              if (secondRasterOffsetY > -secondRaster.height) {
                positiveHorizontalOffset = (secondRasterOffsetX > 0) ? secondRasterOffsetX : 0;
                overlapLeftInFirst = positiveHorizontalOffset;
                overlapRightThenWidth = secondRasterOffsetX + secondRasterWidth;
                if (overlapRightThenWidth > firstRasterWidth) {
                  overlapRightThenWidth = firstRasterWidth;
                }
                positiveVerticalOffset = (secondRasterOffsetY > 0) ? secondRasterOffsetY : 0;
                overlapTopInFirst = positiveVerticalOffset;
                overlapBottomThenHeight = secondRasterOffsetY + secondRasterHeight;
                if (overlapBottomThenHeight > firstRasterHeight) {
                  overlapBottomThenHeight = firstRasterHeight;
                }
                overlapRightThenWidth = overlapRightThenWidth - overlapLeftInFirst;
                overlapBottomThenHeight = overlapBottomThenHeight - overlapTopInFirst;
                firstPixelIndex = overlapTopInFirst * firstRasterWidth + overlapLeftInFirst;
                firstRowSkip = firstRasterWidth - overlapRightThenWidth;
                secondPixelIndex = (overlapTopInFirst - secondRasterOffsetY) * secondRasterWidth + (overlapLeftInFirst - secondRasterOffsetX);
                secondRowSkip = secondRasterWidth - overlapRightThenWidth;
                firstPixels = firstRaster.pixels;
                secondPixels = secondRaster.pixels;
                for (remainingOverlapRows = overlapBottomThenHeight; remainingOverlapRows > 0; remainingOverlapRows--) {
                  for (remainingOverlapColumns = overlapRightThenWidth; remainingOverlapColumns > 0; remainingOverlapColumns--) {
                    if (firstPixels[firstPixelIndex] == 0) {
                      firstPixelIndex++;
                      secondPixelIndex++;
                      continue;
                    }
                    if (secondPixels[secondPixelIndex] != 0) {
                      firstOverlapX = firstOriginX + overlapLeftInFirst + overlapRightThenWidth - remainingOverlapColumns;
                      firstOverlapY = firstOriginY + overlapTopInFirst + overlapBottomThenHeight - remainingOverlapRows;
                      return true;
                    }
                    firstPixelIndex++;
                    secondPixelIndex++;
                  }
                  firstPixelIndex = firstPixelIndex + firstRowSkip;
                  secondPixelIndex = secondPixelIndex + secondRowSkip;
                }
                return false;
              }
            }
            return false;
          }
        }
        return false;
    }
}
