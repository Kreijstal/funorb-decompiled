/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ArgbSprite extends RgbSprite {
    final void drawTransparent(int x, int y) {
        int topClip = 0;
        int leftClip;
        int rightClip;
        x = x + this.offsetX;
        y = y + this.offsetY;
        int destinationIndex = x + y * SoftwareRaster.width;
        int sourceIndex = 0;
        int drawHeight = this.pixelHeight;
        int drawWidth = this.pixelWidth;
        int destinationRowSkip = SoftwareRaster.width - drawWidth;
        int sourceRowSkip = 0;
        if (y < SoftwareRaster.clipTop) {
          topClip = SoftwareRaster.clipTop - y;
          drawHeight = drawHeight - topClip;
          y = SoftwareRaster.clipTop;
          sourceIndex = sourceIndex + topClip * drawWidth;
          destinationIndex = destinationIndex + topClip * SoftwareRaster.width;
        }
        if (y + drawHeight > SoftwareRaster.clipBottom) {
          drawHeight = drawHeight - (y + drawHeight - SoftwareRaster.clipBottom);
        }
        if (x < SoftwareRaster.clipLeft) {
          leftClip = SoftwareRaster.clipLeft - x;
          drawWidth = drawWidth - leftClip;
          x = SoftwareRaster.clipLeft;
          sourceIndex = sourceIndex + leftClip;
          destinationIndex = destinationIndex + leftClip;
          sourceRowSkip = sourceRowSkip + leftClip;
          destinationRowSkip = destinationRowSkip + leftClip;
        }
        if (x + drawWidth > SoftwareRaster.clipRight) {
          rightClip = x + drawWidth - SoftwareRaster.clipRight;
          drawWidth = drawWidth - rightClip;
          sourceRowSkip = sourceRowSkip + rightClip;
          destinationRowSkip = destinationRowSkip + rightClip;
        }
        if (drawWidth <= 0 ||
          drawHeight <= 0) {
          return;
        }
        ArgbSprite.blendArgbRows(SoftwareRaster.pixels, this.pixels, 0, sourceIndex, destinationIndex, drawWidth, drawHeight, destinationRowSkip, sourceRowSkip);
    }

    private final static void blendBrightenedArgbRows(int[] destination, int[] source, int sourceColour, int sourceIndex, int destinationIndex, int width, int height, int destinationRowSkip, int sourceRowSkip, int brightness) {
        int row = 0;
        int column = 0;
        int destinationWriteIndex = 0;
        int sourceAlpha;
        int destinationColour;
        int inverseAlpha;
        int scaledRedBlue;
        int scaledGreen;
        for (row = -height; row < 0; row++) {
          for (column = -width; column < 0; column++) {
            sourceColour = source[sourceIndex++];
            sourceAlpha = sourceColour >>> 24;
            if (sourceAlpha == 0) {
              destinationIndex++;
            } else {
              destinationColour = destination[destinationIndex];
              inverseAlpha = 256 - sourceAlpha;
              scaledRedBlue = (sourceColour & 16711935) * brightness & -16711936;
              scaledGreen = (sourceColour & 65280) * brightness & 16711680;
              sourceColour = (scaledRedBlue | scaledGreen) >>> 8;
              destinationWriteIndex = destinationIndex;
              destinationIndex++;
              destination[destinationWriteIndex] = ((sourceColour & 16711935) * sourceAlpha + (destinationColour & 16711935) * inverseAlpha & -16711936) + ((sourceColour & 65280) * sourceAlpha + (destinationColour & 65280) * inverseAlpha & 16711680) >>> 8;
            }
          }
          destinationIndex = destinationIndex + destinationRowSkip;
          sourceIndex = sourceIndex + sourceRowSkip;
        }
    }

    private final static void blendScaledArgbRows(int[] destination, int[] source, int sourceColour, int sourceXFixed, int sourceYFixed, int destinationIndex, int destinationRowSkip, int width, int height, int xStepFixed, int yStepFixed, int sourceWidth) {
        int row = 0;
        int sourceRowOffset = 0;
        int column = 0;
        int sourceAlpha = 0;
        int destinationColour = 0;
        int destinationWriteIndex = 0;
        int inverseAlpha = 0;
        int initialSourceXFixed = sourceXFixed;
        for (row = -height; row < 0; row++) {
          sourceRowOffset = (sourceYFixed >> 16) * sourceWidth;
          for (column = -width; column < 0; column++) {
            sourceColour = source[(sourceXFixed >> 16) + sourceRowOffset];
            sourceAlpha = sourceColour >>> 24;
            if (sourceAlpha != 0) {
              inverseAlpha = 256 - sourceAlpha;
              destinationColour = destination[destinationIndex];
              destinationWriteIndex = destinationIndex;
              destinationIndex++;
              destination[destinationWriteIndex] = ((sourceColour & 16711935) * sourceAlpha + (destinationColour & 16711935) * inverseAlpha & -16711936) + ((sourceColour & 65280) * sourceAlpha + (destinationColour & 65280) * inverseAlpha & 16711680) >>> 8;
            } else {
              destinationIndex++;
            }
            sourceXFixed = sourceXFixed + xStepFixed;
          }
          sourceYFixed = sourceYFixed + yStepFixed;
          sourceXFixed = initialSourceXFixed;
          destinationIndex = destinationIndex + destinationRowSkip;
        }
    }

    final void drawVerticalFlip(int x, int y) {
        int bottomClip = 0;
        int leftClip;
        int rightClip;
        x = x + this.offsetX;
        y = y + (this.canvasHeight - this.pixelHeight - this.offsetY);
        int destinationIndex = x + (y + this.pixelHeight - 1) * SoftwareRaster.width;
        int sourceIndex = 0;
        int drawHeight = this.pixelHeight;
        int drawWidth = this.pixelWidth;
        int destinationRowSkip = -SoftwareRaster.width - drawWidth;
        int sourceRowSkip = 0;
        if (y < SoftwareRaster.clipTop) {
          drawHeight = drawHeight - (SoftwareRaster.clipTop - y);
          y = SoftwareRaster.clipTop;
        }
        if (y + drawHeight > SoftwareRaster.clipBottom) {
          bottomClip = y + drawHeight - SoftwareRaster.clipBottom;
          drawHeight = drawHeight - bottomClip;
          destinationIndex = destinationIndex - bottomClip * SoftwareRaster.width;
          sourceIndex = sourceIndex + bottomClip * drawWidth;
        }
        if (x < SoftwareRaster.clipLeft) {
          leftClip = SoftwareRaster.clipLeft - x;
          drawWidth = drawWidth - leftClip;
          x = SoftwareRaster.clipLeft;
          sourceIndex = sourceIndex + leftClip;
          destinationIndex = destinationIndex + leftClip;
          sourceRowSkip = sourceRowSkip + leftClip;
          destinationRowSkip = destinationRowSkip + leftClip;
        }
        if (x + drawWidth > SoftwareRaster.clipRight) {
          rightClip = x + drawWidth - SoftwareRaster.clipRight;
          drawWidth = drawWidth - rightClip;
          sourceRowSkip = sourceRowSkip + rightClip;
          destinationRowSkip = destinationRowSkip + rightClip;
        }
        if (drawWidth <= 0 ||
          drawHeight <= 0) {
          return;
        }
        ArgbSprite.blendArgbRows(SoftwareRaster.pixels, this.pixels, 0, sourceIndex, destinationIndex, drawWidth, drawHeight, destinationRowSkip, sourceRowSkip);
    }

    private final static void blendTintedGrayscaleRows(int[] destination, int[] source, int sourceColour, int sourceIndex, int destinationIndex, int columnLoopIndex, int rowLoopIndex, int width, int height, int destinationRowSkip, int sourceRowSkip, int tintColour) {
        int destinationWriteIndex = 0;
        int tintRedBlue;
        int tintGreen;
        int sourceAlpha;
        int unusedColour;
        int inverseAlpha;
        int destinationColour;
        int tintedColour;
        tintRedBlue = tintColour & 16711935;
        tintGreen = tintColour >> 8 & 255;
        for (rowLoopIndex = -height; rowLoopIndex < 0; rowLoopIndex++) {
          for (columnLoopIndex = -width; columnLoopIndex < 0; columnLoopIndex++) {
            sourceColour = source[sourceIndex++];
            sourceAlpha = sourceColour >>> 24;
            sourceColour = sourceColour & 16777215;
            if (sourceAlpha == 0) {
              destinationIndex++;
            } else {
              unusedColour = 0;
              if (sourceColour >> 8 != (sourceColour & 65535)) {
                tintedColour = sourceColour;
              } else {
                sourceColour = sourceColour & 255;
                tintedColour = (sourceColour * tintRedBlue >> 8 & 16711934) + (sourceColour * tintGreen & 65280) + 1;
              }
              inverseAlpha = 256 - sourceAlpha;
              destinationColour = destination[destinationIndex];
              destinationWriteIndex = destinationIndex;
              destinationIndex++;
              destination[destinationWriteIndex] = ((tintedColour & 16711935) * sourceAlpha + (destinationColour & 16711935) * inverseAlpha & -16711936) + ((tintedColour & 65280) * sourceAlpha + (destinationColour & 65280) * inverseAlpha & 16711680) >>> 8;
            }
          }
          destinationIndex = destinationIndex + destinationRowSkip;
          sourceIndex = sourceIndex + sourceRowSkip;
        }
    }

    final void drawAdditive(int x, int y, int opacity) {
        int topClip = 0;
        int leftClip;
        int rightClip;
        x = x + this.offsetX;
        y = y + this.offsetY;
        int destinationIndex = x + y * SoftwareRaster.width;
        int sourceIndex = 0;
        int drawHeight = this.pixelHeight;
        int drawWidth = this.pixelWidth;
        int destinationRowSkip = SoftwareRaster.width - drawWidth;
        int sourceRowSkip = 0;
        if (y < SoftwareRaster.clipTop) {
          topClip = SoftwareRaster.clipTop - y;
          drawHeight = drawHeight - topClip;
          y = SoftwareRaster.clipTop;
          sourceIndex = sourceIndex + topClip * drawWidth;
          destinationIndex = destinationIndex + topClip * SoftwareRaster.width;
        }
        if (y + drawHeight > SoftwareRaster.clipBottom) {
          drawHeight = drawHeight - (y + drawHeight - SoftwareRaster.clipBottom);
        }
        if (x < SoftwareRaster.clipLeft) {
          leftClip = SoftwareRaster.clipLeft - x;
          drawWidth = drawWidth - leftClip;
          x = SoftwareRaster.clipLeft;
          sourceIndex = sourceIndex + leftClip;
          destinationIndex = destinationIndex + leftClip;
          sourceRowSkip = sourceRowSkip + leftClip;
          destinationRowSkip = destinationRowSkip + leftClip;
        }
        if (x + drawWidth > SoftwareRaster.clipRight) {
          rightClip = x + drawWidth - SoftwareRaster.clipRight;
          drawWidth = drawWidth - rightClip;
          sourceRowSkip = sourceRowSkip + rightClip;
          destinationRowSkip = destinationRowSkip + rightClip;
        }
        if (drawWidth <= 0 ||
          drawHeight <= 0) {
          return;
        }
        ArgbSprite.addArgbRows(0, 0, 0, SoftwareRaster.pixels, this.pixels, sourceIndex, 0, destinationIndex, 0, drawWidth, drawHeight, destinationRowSkip, sourceRowSkip, opacity);
    }

    final void drawTintedGrayscale(int x, int y, int tintColour) {
        int topClip = 0;
        int leftClip;
        int rightClip;
        x = x + this.offsetX;
        y = y + this.offsetY;
        int destinationIndex = x + y * SoftwareRaster.width;
        int sourceIndex = 0;
        int drawHeight = this.pixelHeight;
        int drawWidth = this.pixelWidth;
        int destinationRowSkip = SoftwareRaster.width - drawWidth;
        int sourceRowSkip = 0;
        if (y < SoftwareRaster.clipTop) {
          topClip = SoftwareRaster.clipTop - y;
          drawHeight = drawHeight - topClip;
          y = SoftwareRaster.clipTop;
          sourceIndex = sourceIndex + topClip * drawWidth;
          destinationIndex = destinationIndex + topClip * SoftwareRaster.width;
        }
        if (y + drawHeight > SoftwareRaster.clipBottom) {
          drawHeight = drawHeight - (y + drawHeight - SoftwareRaster.clipBottom);
        }
        if (x < SoftwareRaster.clipLeft) {
          leftClip = SoftwareRaster.clipLeft - x;
          drawWidth = drawWidth - leftClip;
          x = SoftwareRaster.clipLeft;
          sourceIndex = sourceIndex + leftClip;
          destinationIndex = destinationIndex + leftClip;
          sourceRowSkip = sourceRowSkip + leftClip;
          destinationRowSkip = destinationRowSkip + leftClip;
        }
        if (x + drawWidth > SoftwareRaster.clipRight) {
          rightClip = x + drawWidth - SoftwareRaster.clipRight;
          drawWidth = drawWidth - rightClip;
          sourceRowSkip = sourceRowSkip + rightClip;
          destinationRowSkip = destinationRowSkip + rightClip;
        }
        if (drawWidth <= 0 ||
          drawHeight <= 0) {
          return;
        }
        ArgbSprite.blendTintedGrayscaleRows(SoftwareRaster.pixels, this.pixels, 0, sourceIndex, destinationIndex, 0, 0, drawWidth, drawHeight, destinationRowSkip, sourceRowSkip, tintColour);
    }

    final void drawShadedGrayscale(int x, int y, int tintColour) {
        int topClip = 0;
        int leftClip;
        int rightClip;
        x = x + this.offsetX;
        y = y + this.offsetY;
        int destinationIndex = x + y * SoftwareRaster.width;
        int sourceIndex = 0;
        int drawHeight = this.pixelHeight;
        int drawWidth = this.pixelWidth;
        int destinationRowSkip = SoftwareRaster.width - drawWidth;
        int sourceRowSkip = 0;
        if (y < SoftwareRaster.clipTop) {
          topClip = SoftwareRaster.clipTop - y;
          drawHeight = drawHeight - topClip;
          y = SoftwareRaster.clipTop;
          sourceIndex = sourceIndex + topClip * drawWidth;
          destinationIndex = destinationIndex + topClip * SoftwareRaster.width;
        }
        if (y + drawHeight > SoftwareRaster.clipBottom) {
          drawHeight = drawHeight - (y + drawHeight - SoftwareRaster.clipBottom);
        }
        if (x < SoftwareRaster.clipLeft) {
          leftClip = SoftwareRaster.clipLeft - x;
          drawWidth = drawWidth - leftClip;
          x = SoftwareRaster.clipLeft;
          sourceIndex = sourceIndex + leftClip;
          destinationIndex = destinationIndex + leftClip;
          sourceRowSkip = sourceRowSkip + leftClip;
          destinationRowSkip = destinationRowSkip + leftClip;
        }
        if (x + drawWidth > SoftwareRaster.clipRight) {
          rightClip = x + drawWidth - SoftwareRaster.clipRight;
          drawWidth = drawWidth - rightClip;
          sourceRowSkip = sourceRowSkip + rightClip;
          destinationRowSkip = destinationRowSkip + rightClip;
        }
        if (drawWidth <= 0 ||
          drawHeight <= 0) {
          return;
        }
        ArgbSprite.blendShadedGrayscaleRows(SoftwareRaster.pixels, this.pixels, 0, sourceIndex, destinationIndex, drawWidth, drawHeight, destinationRowSkip, sourceRowSkip, tintColour);
    }

    final void drawScaled(int x, int y, int width, int height) {
        int leftPaddingPixels = 0;
        int topClip = 0;
        int topPaddingPixels;
        int destinationIndex;
        int rightClip;
        int leftClip;
        if (width <= 0 ||
          height <= 0) {
          return;
        }
        int sourceWidth = this.pixelWidth;
        int sourceHeight = this.pixelHeight;
        int sourceXFixed = 0;
        int sourceYFixed = 0;
        int canvasWidth = this.canvasWidth;
        int canvasHeight = this.canvasHeight;
        int xStepFixed = (canvasWidth << 16) / width;
        int yStepFixed = (canvasHeight << 16) / height;
        if (this.offsetX > 0) {
          leftPaddingPixels = ((this.offsetX << 16) + xStepFixed - 1) / xStepFixed;
          x = x + leftPaddingPixels;
          sourceXFixed = sourceXFixed + (leftPaddingPixels * xStepFixed - (this.offsetX << 16));
        }
        if (this.offsetY > 0) {
          topPaddingPixels = ((this.offsetY << 16) + yStepFixed - 1) / yStepFixed;
          y = y + topPaddingPixels;
          sourceYFixed = sourceYFixed + (topPaddingPixels * yStepFixed - (this.offsetY << 16));
        }
        if (sourceWidth < canvasWidth) {
          width = ((sourceWidth << 16) - sourceXFixed + xStepFixed - 1) / xStepFixed;
        }
        if (sourceHeight < canvasHeight) {
          height = ((sourceHeight << 16) - sourceYFixed + yStepFixed - 1) / yStepFixed;
        }
        destinationIndex = x + y * SoftwareRaster.width;
        int destinationRowSkip = SoftwareRaster.width - width;
        if (y + height > SoftwareRaster.clipBottom) {
          height = height - (y + height - SoftwareRaster.clipBottom);
        }
        if (y < SoftwareRaster.clipTop) {
          topClip = SoftwareRaster.clipTop - y;
          height = height - topClip;
          destinationIndex = destinationIndex + topClip * SoftwareRaster.width;
          sourceYFixed = sourceYFixed + yStepFixed * topClip;
        }
        if (x + width > SoftwareRaster.clipRight) {
          rightClip = x + width - SoftwareRaster.clipRight;
          width = width - rightClip;
          destinationRowSkip = destinationRowSkip + rightClip;
        }
        if (x < SoftwareRaster.clipLeft) {
          leftClip = SoftwareRaster.clipLeft - x;
          width = width - leftClip;
          destinationIndex = destinationIndex + leftClip;
          sourceXFixed = sourceXFixed + xStepFixed * leftClip;
          destinationRowSkip = destinationRowSkip + leftClip;
        }
        ArgbSprite.blendScaledArgbRows(SoftwareRaster.pixels, this.pixels, 0, sourceXFixed, sourceYFixed, destinationIndex, destinationRowSkip, width, height, xStepFixed, yStepFixed, sourceWidth);
    }

    private final static void blendScaledArgbRowsWithOpacity(int[] destination, int[] source, int sourceColour, int sourceXFixed, int sourceYFixed, int destinationIndex, int destinationRowSkip, int width, int height, int xStepFixed, int yStepFixed, int sourceWidth, int opacity) {
        int row = 0;
        int sourceRowOffset = 0;
        int column = 0;
        int pixelColour = 0;
        int destinationColour = 0;
        int effectiveAlpha = 0;
        int inverseAlpha = 0;
        int destinationWriteIndex = 0;
        int initialSourceXFixed = sourceXFixed;
        for (row = -height; row < 0; row++) {
          sourceRowOffset = (sourceYFixed >> 16) * sourceWidth;
          for (column = -width; column < 0; column++) {
            pixelColour = source[(sourceXFixed >> 16) + sourceRowOffset];
            destinationColour = destination[destinationIndex];
            effectiveAlpha = (pixelColour >>> 24) * opacity >> 8;
            inverseAlpha = 256 - effectiveAlpha;
            destinationWriteIndex = destinationIndex;
            destinationIndex++;
            destination[destinationWriteIndex] = ((pixelColour & 16711935) * effectiveAlpha + (destinationColour & 16711935) * inverseAlpha & -16711936) + ((pixelColour & 65280) * effectiveAlpha + (destinationColour & 65280) * inverseAlpha & 16711680) >>> 8;
            sourceXFixed = sourceXFixed + xStepFixed;
          }
          sourceYFixed = sourceYFixed + yStepFixed;
          sourceXFixed = initialSourceXFixed;
          destinationIndex = destinationIndex + destinationRowSkip;
        }
    }

    final void drawHalfSize(int x, int y) {
        int sampleY = 0;
        int firstSampleXValue = 0;
        int lastSampleXValue = 0;
        int firstSampleYValue = 0;
        int lastSampleYValue = 0;
        int[] sourcePixels = null;
        int sourcePixelIndex = 0;
        int sampleRowOffset = 0;
        int halfWidth;
        int halfHeight;
        int firstSampleX;
        int lastSampleX;
        int firstSampleY;
        int lastSampleY;
        int sourceIndex;
        int destinationIndex;
        int sampleX;
        int unusedColour;
        int unusedAlpha;
        int weightedRedOrPackedRedBlue;
        int weightedGreenOrPackedGreen;
        int weightedBlue;
        int alphaSum;
        int sampleIndex;
        int inverseAlpha;
        int destinationColour;
        int sourceColour;
        int sourceAlpha;
        int meanAlpha;
        halfWidth = this.pixelWidth >> 1;
        halfHeight = this.pixelHeight >> 1;
        x = x + this.offsetX / 2;
        y = y + this.offsetY / 2;
        if (x >= SoftwareRaster.clipLeft) {
          firstSampleXValue = 0;
        } else {
          firstSampleXValue = SoftwareRaster.clipLeft - x << 1;
        }
        firstSampleX = firstSampleXValue;
        if (x + halfWidth <= SoftwareRaster.clipRight) {
          lastSampleXValue = this.pixelWidth - 2;
        } else {
          lastSampleXValue = (SoftwareRaster.clipRight - x << 1) - 2;
        }
        lastSampleX = lastSampleXValue;
        if (y >= SoftwareRaster.clipTop) {
          firstSampleYValue = 0;
        } else {
          firstSampleYValue = SoftwareRaster.clipTop - y << 1;
        }
        firstSampleY = firstSampleYValue;
        if (y + halfHeight <= SoftwareRaster.clipBottom) {
          lastSampleYValue = this.pixelHeight - 2;
        } else {
          lastSampleYValue = (SoftwareRaster.clipBottom - y << 1) - 2;
        }
        lastSampleY = lastSampleYValue;
        for (sampleY = firstSampleY; sampleY <= lastSampleY; sampleY += 2) {
          sourceIndex = sampleY * this.pixelWidth + firstSampleX;
          destinationIndex = (y + (sampleY >> 1)) * SoftwareRaster.width + (x + (firstSampleX >> 1));
          sampleX = firstSampleX;
          while (sampleX <= lastSampleX) {
            unusedColour = 0;
            unusedAlpha = 0;
            weightedRedOrPackedRedBlue = 0;
            weightedGreenOrPackedGreen = 0;
            weightedBlue = 0;
            alphaSum = 0;
            for (sampleIndex = 0; sampleIndex < 4; sampleIndex++) {
              sourcePixels = this.pixels;
              sourcePixelIndex = sourceIndex + (sampleIndex & 1);
              if ((sampleIndex & 2) != 0) {
                sampleRowOffset = 0;
              } else {
                sampleRowOffset = this.pixelWidth;
              }
              sourceColour = sourcePixels[sourcePixelIndex + sampleRowOffset];
              sourceAlpha = sourceColour >>> 24;
              alphaSum = alphaSum + sourceAlpha;
              weightedRedOrPackedRedBlue = weightedRedOrPackedRedBlue + sourceAlpha * (sourceColour >> 16 & 255);
              weightedGreenOrPackedGreen = weightedGreenOrPackedGreen + sourceAlpha * (sourceColour >> 8 & 255);
              weightedBlue = weightedBlue + sourceAlpha * (sourceColour & 255);
            }
            if (alphaSum != 0) {
              weightedRedOrPackedRedBlue = (weightedRedOrPackedRedBlue / alphaSum << 16) + weightedBlue / alphaSum;
              weightedGreenOrPackedGreen = weightedGreenOrPackedGreen / alphaSum << 8;
              meanAlpha = alphaSum >> 2;
              inverseAlpha = 256 - meanAlpha;
              destinationColour = SoftwareRaster.pixels[destinationIndex];
              SoftwareRaster.pixels[destinationIndex] = (meanAlpha * weightedRedOrPackedRedBlue + inverseAlpha * (destinationColour & 16711935) & -16711936) + (meanAlpha * weightedGreenOrPackedGreen + inverseAlpha * (destinationColour & 65280) & 16711680) >>> 8;
            }
            sampleX += 2;
            destinationIndex++;
            sourceIndex += 2;
          }
        }
    }

    private final static void blendArgbRows(int[] destination, int[] source, int sourceColour, int sourceIndex, int destinationIndex, int width, int height, int destinationRowSkip, int sourceRowSkip) {
        int row = 0;
        int column = 0;
        int destinationWriteIndex = 0;
        int negativeWidth;
        int sourceAlpha;
        int inverseAlpha;
        int destinationColour;
        negativeWidth = -width;
        for (row = -height; row < 0; row++) {
          for (column = negativeWidth; column < 0; column++) {
            sourceColour = source[sourceIndex++];
            sourceAlpha = sourceColour >>> 24;
            if (sourceAlpha == 0) {
              destinationIndex++;
            } else {
              inverseAlpha = 256 - sourceAlpha;
              destinationColour = destination[destinationIndex];
              destinationWriteIndex = destinationIndex;
              destinationIndex++;
              destination[destinationWriteIndex] = ((sourceColour & 16711935) * sourceAlpha + (destinationColour & 16711935) * inverseAlpha & -16711936) + ((sourceColour & 65280) * sourceAlpha + (destinationColour & 65280) * inverseAlpha & 16711680) >>> 8;
            }
          }
          destinationIndex = destinationIndex + destinationRowSkip;
          sourceIndex = sourceIndex + sourceRowSkip;
        }
    }

    final void drawPixels(int x, int y) {
        int topClip = 0;
        int leftClip;
        int rightClip;
        x = x + this.offsetX;
        y = y + this.offsetY;
        int destinationIndex = x + y * SoftwareRaster.width;
        int sourceIndex = 0;
        int drawHeight = this.pixelHeight;
        int drawWidth = this.pixelWidth;
        int destinationRowSkip = SoftwareRaster.width - drawWidth;
        int sourceRowSkip = 0;
        if (y < SoftwareRaster.clipTop) {
          topClip = SoftwareRaster.clipTop - y;
          drawHeight = drawHeight - topClip;
          y = SoftwareRaster.clipTop;
          sourceIndex = sourceIndex + topClip * drawWidth;
          destinationIndex = destinationIndex + topClip * SoftwareRaster.width;
        }
        if (y + drawHeight > SoftwareRaster.clipBottom) {
          drawHeight = drawHeight - (y + drawHeight - SoftwareRaster.clipBottom);
        }
        if (x < SoftwareRaster.clipLeft) {
          leftClip = SoftwareRaster.clipLeft - x;
          drawWidth = drawWidth - leftClip;
          x = SoftwareRaster.clipLeft;
          sourceIndex = sourceIndex + leftClip;
          destinationIndex = destinationIndex + leftClip;
          sourceRowSkip = sourceRowSkip + leftClip;
          destinationRowSkip = destinationRowSkip + leftClip;
        }
        if (x + drawWidth > SoftwareRaster.clipRight) {
          rightClip = x + drawWidth - SoftwareRaster.clipRight;
          drawWidth = drawWidth - rightClip;
          sourceRowSkip = sourceRowSkip + rightClip;
          destinationRowSkip = destinationRowSkip + rightClip;
        }
        if (drawWidth <= 0 ||
          drawHeight <= 0) {
          return;
        }
        ArgbSprite.blendArgbRows(SoftwareRaster.pixels, this.pixels, 0, sourceIndex, destinationIndex, drawWidth, drawHeight, destinationRowSkip, sourceRowSkip);
    }

    private final static void blendArgbReversedRows(int[] destination, int[] source, int sourceColour, int sourceIndex, int destinationIndex, int width, int height, int destinationRowSkip, int sourceRowSkip) {
        int row = 0;
        int column = 0;
        int destinationWriteIndex = 0;
        int negativeWidth;
        int sourceAlpha;
        int inverseAlpha;
        int destinationColour;
        negativeWidth = -width;
        for (row = -height; row < 0; row++) {
          for (column = negativeWidth; column < 0; column++) {
            sourceColour = source[sourceIndex--];
            sourceAlpha = sourceColour >>> 24;
            if (sourceAlpha == 0) {
              destinationIndex++;
            } else {
              inverseAlpha = 256 - sourceAlpha;
              destinationColour = destination[destinationIndex];
              destinationWriteIndex = destinationIndex;
              destinationIndex++;
              destination[destinationWriteIndex] = ((sourceColour & 16711935) * sourceAlpha + (destinationColour & 16711935) * inverseAlpha & -16711936) + ((sourceColour & 65280) * sourceAlpha + (destinationColour & 65280) * inverseAlpha & 16711680) >>> 8;
            }
          }
          destinationIndex = destinationIndex + destinationRowSkip;
          sourceIndex = sourceIndex + sourceRowSkip;
        }
    }

    ArgbSprite(int canvasWidth, int canvasHeight, int offsetX, int offsetY, int pixelWidth, int pixelHeight, int[] pixels) {
        super(canvasWidth, canvasHeight, offsetX, offsetY, pixelWidth, pixelHeight, pixels);
    }

    ArgbSprite(int width, int height) {
        super(width, height);
    }

    final void drawScaledWithBrightness(int x, int y, int width, int height, int brightness) {
        int leftPaddingPixels = 0;
        int topClip = 0;
        int topPaddingPixels;
        int destinationIndex;
        int rightClip;
        int leftClip;
        if (brightness == 256) {
          this.drawScaled(x, y, width, height);
          return;
        }
        if (width <= 0 ||
          height <= 0) {
          return;
        }
        int sourceWidth = this.pixelWidth;
        int sourceHeight = this.pixelHeight;
        int sourceXFixed = 0;
        int sourceYFixed = 0;
        int canvasWidth = this.canvasWidth;
        int canvasHeight = this.canvasHeight;
        int xStepFixed = (canvasWidth << 16) / width;
        int yStepFixed = (canvasHeight << 16) / height;
        if (this.offsetX > 0) {
          leftPaddingPixels = ((this.offsetX << 16) + xStepFixed - 1) / xStepFixed;
          x = x + leftPaddingPixels;
          sourceXFixed = sourceXFixed + (leftPaddingPixels * xStepFixed - (this.offsetX << 16));
        }
        if (this.offsetY > 0) {
          topPaddingPixels = ((this.offsetY << 16) + yStepFixed - 1) / yStepFixed;
          y = y + topPaddingPixels;
          sourceYFixed = sourceYFixed + (topPaddingPixels * yStepFixed - (this.offsetY << 16));
        }
        if (sourceWidth < canvasWidth) {
          width = ((sourceWidth << 16) - sourceXFixed + xStepFixed - 1) / xStepFixed;
        }
        if (sourceHeight < canvasHeight) {
          height = ((sourceHeight << 16) - sourceYFixed + yStepFixed - 1) / yStepFixed;
        }
        destinationIndex = x + y * SoftwareRaster.width;
        int destinationRowSkip = SoftwareRaster.width - width;
        if (y + height > SoftwareRaster.clipBottom) {
          height = height - (y + height - SoftwareRaster.clipBottom);
        }
        if (y < SoftwareRaster.clipTop) {
          topClip = SoftwareRaster.clipTop - y;
          height = height - topClip;
          destinationIndex = destinationIndex + topClip * SoftwareRaster.width;
          sourceYFixed = sourceYFixed + yStepFixed * topClip;
        }
        if (x + width > SoftwareRaster.clipRight) {
          rightClip = x + width - SoftwareRaster.clipRight;
          width = width - rightClip;
          destinationRowSkip = destinationRowSkip + rightClip;
        }
        if (x < SoftwareRaster.clipLeft) {
          leftClip = SoftwareRaster.clipLeft - x;
          width = width - leftClip;
          destinationIndex = destinationIndex + leftClip;
          sourceXFixed = sourceXFixed + xStepFixed * leftClip;
          destinationRowSkip = destinationRowSkip + leftClip;
        }
        ArgbSprite.blendScaledBrightenedArgbRows(SoftwareRaster.pixels, this.pixels, 0, sourceXFixed, sourceYFixed, destinationIndex, destinationRowSkip, width, height, xStepFixed, yStepFixed, sourceWidth, brightness);
    }

    final void drawWithOpacity(int x, int y, int opacity) {
        int topClip = 0;
        int leftClip;
        int rightClip;
        x = x + this.offsetX;
        y = y + this.offsetY;
        int destinationIndex = x + y * SoftwareRaster.width;
        int sourceIndex = 0;
        int drawHeight = this.pixelHeight;
        int drawWidth = this.pixelWidth;
        int destinationRowSkip = SoftwareRaster.width - drawWidth;
        int sourceRowSkip = 0;
        if (y < SoftwareRaster.clipTop) {
          topClip = SoftwareRaster.clipTop - y;
          drawHeight = drawHeight - topClip;
          y = SoftwareRaster.clipTop;
          sourceIndex = sourceIndex + topClip * drawWidth;
          destinationIndex = destinationIndex + topClip * SoftwareRaster.width;
        }
        if (y + drawHeight > SoftwareRaster.clipBottom) {
          drawHeight = drawHeight - (y + drawHeight - SoftwareRaster.clipBottom);
        }
        if (x < SoftwareRaster.clipLeft) {
          leftClip = SoftwareRaster.clipLeft - x;
          drawWidth = drawWidth - leftClip;
          x = SoftwareRaster.clipLeft;
          sourceIndex = sourceIndex + leftClip;
          destinationIndex = destinationIndex + leftClip;
          sourceRowSkip = sourceRowSkip + leftClip;
          destinationRowSkip = destinationRowSkip + leftClip;
        }
        if (x + drawWidth > SoftwareRaster.clipRight) {
          rightClip = x + drawWidth - SoftwareRaster.clipRight;
          drawWidth = drawWidth - rightClip;
          sourceRowSkip = sourceRowSkip + rightClip;
          destinationRowSkip = destinationRowSkip + rightClip;
        }
        if (drawWidth <= 0 ||
          drawHeight <= 0) {
          return;
        }
        ArgbSprite.blendArgbRowsWithOpacity(SoftwareRaster.pixels, this.pixels, 0, sourceIndex, destinationIndex, drawWidth, drawHeight, destinationRowSkip, sourceRowSkip, opacity);
    }

    private final static void blendScaledBrightenedArgbRows(int[] destination, int[] source, int sourceColour, int sourceXFixed, int sourceYFixed, int destinationIndex, int destinationRowSkip, int width, int height, int xStepFixed, int yStepFixed, int sourceWidth, int brightness) {
        int row = 0;
        int sourceRowOffset = 0;
        int column = 0;
        int sourceAlpha = 0;
        int inverseAlpha = 0;
        int scaledRedBlue = 0;
        int scaledGreen = 0;
        int destinationWriteIndex = 0;
        int destinationColour = 0;
        int initialSourceXFixed = sourceXFixed;
        for (row = -height; row < 0; row++) {
          sourceRowOffset = (sourceYFixed >> 16) * sourceWidth;
          for (column = -width; column < 0; column++) {
            sourceColour = source[(sourceXFixed >> 16) + sourceRowOffset];
            sourceAlpha = sourceColour >>> 24;
            if (sourceAlpha != 0) {
              destinationColour = destination[destinationIndex];
              inverseAlpha = 256 - sourceAlpha;
              scaledRedBlue = (sourceColour & 16711935) * brightness & -16711936;
              scaledGreen = (sourceColour & 65280) * brightness & 16711680;
              sourceColour = (scaledRedBlue | scaledGreen) >>> 8;
              destinationWriteIndex = destinationIndex;
              destinationIndex++;
              destination[destinationWriteIndex] = ((sourceColour & 16711935) * sourceAlpha + (destinationColour & 16711935) * inverseAlpha & -16711936) + ((sourceColour & 65280) * sourceAlpha + (destinationColour & 65280) * inverseAlpha & 16711680) >>> 8;
            } else {
              destinationIndex++;
            }
            sourceXFixed = sourceXFixed + xStepFixed;
          }
          sourceYFixed = sourceYFixed + yStepFixed;
          sourceXFixed = initialSourceXFixed;
          destinationIndex = destinationIndex + destinationRowSkip;
        }
    }

    private final static void blendArgbRowsWithOpacity(int[] destination, int[] source, int sourceColour, int sourceIndex, int destinationIndex, int width, int height, int destinationRowSkip, int sourceRowSkip, int opacity) {
        int row = 0;
        int column = 0;
        int effectiveAlpha = 0;
        int inverseAlpha = 0;
        int pixelColour = 0;
        int pixelDestination = 0;
        int destinationWriteIndex = 0;
        for (row = -height; row < 0; row++) {
          for (column = -width; column < 0; column++) {
            effectiveAlpha = (source[sourceIndex] >>> 24) * opacity >> 8;
            inverseAlpha = 256 - effectiveAlpha;
            pixelColour = source[sourceIndex++];
            pixelDestination = destination[destinationIndex];
            destinationWriteIndex = destinationIndex;
            destinationIndex++;
            destination[destinationWriteIndex] = ((pixelColour & 16711935) * effectiveAlpha + (pixelDestination & 16711935) * inverseAlpha & -16711936) + ((pixelColour & 65280) * effectiveAlpha + (pixelDestination & 65280) * inverseAlpha & 16711680) >>> 8;
          }
          destinationIndex = destinationIndex + destinationRowSkip;
          sourceIndex = sourceIndex + sourceRowSkip;
        }
    }

    final void drawHorizontalFlip(int x, int y) {
        int topClip = 0;
        int leftClip;
        int rightClip;
        x = x + (this.canvasWidth - this.pixelWidth - this.offsetX);
        y = y + this.offsetY;
        int destinationIndex = x + y * SoftwareRaster.width;
        int sourceIndex = this.pixelWidth - 1;
        int drawHeight = this.pixelHeight;
        int drawWidth = this.pixelWidth;
        int destinationRowSkip = SoftwareRaster.width - drawWidth;
        int sourceRowSkip = drawWidth + drawWidth;
        if (y < SoftwareRaster.clipTop) {
          topClip = SoftwareRaster.clipTop - y;
          drawHeight = drawHeight - topClip;
          y = SoftwareRaster.clipTop;
          sourceIndex = sourceIndex + topClip * drawWidth;
          destinationIndex = destinationIndex + topClip * SoftwareRaster.width;
        }
        if (y + drawHeight > SoftwareRaster.clipBottom) {
          drawHeight = drawHeight - (y + drawHeight - SoftwareRaster.clipBottom);
        }
        if (x < SoftwareRaster.clipLeft) {
          leftClip = SoftwareRaster.clipLeft - x;
          drawWidth = drawWidth - leftClip;
          x = SoftwareRaster.clipLeft;
          sourceIndex = sourceIndex - leftClip;
          destinationIndex = destinationIndex + leftClip;
          sourceRowSkip = sourceRowSkip - leftClip;
          destinationRowSkip = destinationRowSkip + leftClip;
        }
        if (x + drawWidth > SoftwareRaster.clipRight) {
          rightClip = x + drawWidth - SoftwareRaster.clipRight;
          drawWidth = drawWidth - rightClip;
          sourceRowSkip = sourceRowSkip - rightClip;
          destinationRowSkip = destinationRowSkip + rightClip;
        }
        if (drawWidth <= 0 ||
          drawHeight <= 0) {
          return;
        }
        ArgbSprite.blendArgbReversedRows(SoftwareRaster.pixels, this.pixels, 0, sourceIndex, destinationIndex, drawWidth, drawHeight, destinationRowSkip, sourceRowSkip);
    }

    final void drawScaledWithOpacity(int x, int y, int width, int height, int opacity) {
        int leftPaddingPixels = 0;
        int topClip = 0;
        int topPaddingPixels;
        int destinationIndex;
        int rightClip;
        int leftClip;
        if (width <= 0 ||
          height <= 0) {
          return;
        }
        int sourceWidth = this.pixelWidth;
        int sourceHeight = this.pixelHeight;
        int sourceXFixed = 0;
        int sourceYFixed = 0;
        int canvasWidth = this.canvasWidth;
        int canvasHeight = this.canvasHeight;
        int xStepFixed = (canvasWidth << 16) / width;
        int yStepFixed = (canvasHeight << 16) / height;
        if (this.offsetX > 0) {
          leftPaddingPixels = ((this.offsetX << 16) + xStepFixed - 1) / xStepFixed;
          x = x + leftPaddingPixels;
          sourceXFixed = sourceXFixed + (leftPaddingPixels * xStepFixed - (this.offsetX << 16));
        }
        if (this.offsetY > 0) {
          topPaddingPixels = ((this.offsetY << 16) + yStepFixed - 1) / yStepFixed;
          y = y + topPaddingPixels;
          sourceYFixed = sourceYFixed + (topPaddingPixels * yStepFixed - (this.offsetY << 16));
        }
        if (sourceWidth < canvasWidth) {
          width = ((sourceWidth << 16) - sourceXFixed + xStepFixed - 1) / xStepFixed;
        }
        if (sourceHeight < canvasHeight) {
          height = ((sourceHeight << 16) - sourceYFixed + yStepFixed - 1) / yStepFixed;
        }
        destinationIndex = x + y * SoftwareRaster.width;
        int destinationRowSkip = SoftwareRaster.width - width;
        if (y + height > SoftwareRaster.clipBottom) {
          height = height - (y + height - SoftwareRaster.clipBottom);
        }
        if (y < SoftwareRaster.clipTop) {
          topClip = SoftwareRaster.clipTop - y;
          height = height - topClip;
          destinationIndex = destinationIndex + topClip * SoftwareRaster.width;
          sourceYFixed = sourceYFixed + yStepFixed * topClip;
        }
        if (x + width > SoftwareRaster.clipRight) {
          rightClip = x + width - SoftwareRaster.clipRight;
          width = width - rightClip;
          destinationRowSkip = destinationRowSkip + rightClip;
        }
        if (x < SoftwareRaster.clipLeft) {
          leftClip = SoftwareRaster.clipLeft - x;
          width = width - leftClip;
          destinationIndex = destinationIndex + leftClip;
          sourceXFixed = sourceXFixed + xStepFixed * leftClip;
          destinationRowSkip = destinationRowSkip + leftClip;
        }
        ArgbSprite.blendScaledArgbRowsWithOpacity(SoftwareRaster.pixels, this.pixels, 0, sourceXFixed, sourceYFixed, destinationIndex, destinationRowSkip, width, height, xStepFixed, yStepFixed, sourceWidth, opacity);
    }

    final void drawWithBrightness(int x, int y, int brightness) {
        int topClip = 0;
        int leftClip;
        int rightClip;
        if (brightness == 256) {
          this.drawTransparent(x, y);
          return;
        }
        x = x + this.offsetX;
        y = y + this.offsetY;
        int destinationIndex = x + y * SoftwareRaster.width;
        int sourceIndex = 0;
        int drawHeight = this.pixelHeight;
        int drawWidth = this.pixelWidth;
        int destinationRowSkip = SoftwareRaster.width - drawWidth;
        int sourceRowSkip = 0;
        if (y < SoftwareRaster.clipTop) {
          topClip = SoftwareRaster.clipTop - y;
          drawHeight = drawHeight - topClip;
          y = SoftwareRaster.clipTop;
          sourceIndex = sourceIndex + topClip * drawWidth;
          destinationIndex = destinationIndex + topClip * SoftwareRaster.width;
        }
        if (y + drawHeight > SoftwareRaster.clipBottom) {
          drawHeight = drawHeight - (y + drawHeight - SoftwareRaster.clipBottom);
        }
        if (x < SoftwareRaster.clipLeft) {
          leftClip = SoftwareRaster.clipLeft - x;
          drawWidth = drawWidth - leftClip;
          x = SoftwareRaster.clipLeft;
          sourceIndex = sourceIndex + leftClip;
          destinationIndex = destinationIndex + leftClip;
          sourceRowSkip = sourceRowSkip + leftClip;
          destinationRowSkip = destinationRowSkip + leftClip;
        }
        if (x + drawWidth > SoftwareRaster.clipRight) {
          rightClip = x + drawWidth - SoftwareRaster.clipRight;
          drawWidth = drawWidth - rightClip;
          sourceRowSkip = sourceRowSkip + rightClip;
          destinationRowSkip = destinationRowSkip + rightClip;
        }
        if (drawWidth <= 0 ||
          drawHeight <= 0) {
          return;
        }
        ArgbSprite.blendBrightenedArgbRows(SoftwareRaster.pixels, this.pixels, 0, sourceIndex, destinationIndex, drawWidth, drawHeight, destinationRowSkip, sourceRowSkip, brightness);
    }

    final void drawHalfSizeWithOpacity(int x, int y, int opacity) {
        int sampleY = 0;
        int firstSampleXValue = 0;
        int lastSampleXValue = 0;
        int firstSampleYValue = 0;
        int lastSampleYValue = 0;
        int[] sourcePixels = null;
        int sourcePixelIndex = 0;
        int sampleRowOffset = 0;
        int halfWidth;
        int halfHeight;
        int firstSampleX;
        int lastSampleX;
        int firstSampleY;
        int lastSampleY;
        int sourceIndex;
        int destinationIndex;
        int sampleX;
        int unusedColour;
        int unusedAlpha;
        int weightedRedOrPackedRedBlue;
        int weightedGreenOrPackedGreen;
        int weightedBlue;
        int alphaSum;
        int sampleIndex;
        int inverseAlpha;
        int destinationColour;
        int sourceColour;
        int sourceAlpha;
        int effectiveAlpha;
        halfWidth = this.pixelWidth >> 1;
        halfHeight = this.pixelHeight >> 1;
        x = x + this.offsetX / 2;
        y = y + this.offsetY / 2;
        if (x >= SoftwareRaster.clipLeft) {
          firstSampleXValue = 0;
        } else {
          firstSampleXValue = SoftwareRaster.clipLeft - x << 1;
        }
        firstSampleX = firstSampleXValue;
        if (x + halfWidth <= SoftwareRaster.clipRight) {
          lastSampleXValue = this.pixelWidth - 2;
        } else {
          lastSampleXValue = (SoftwareRaster.clipRight - x << 1) - 2;
        }
        lastSampleX = lastSampleXValue;
        if (y >= SoftwareRaster.clipTop) {
          firstSampleYValue = 0;
        } else {
          firstSampleYValue = SoftwareRaster.clipTop - y << 1;
        }
        firstSampleY = firstSampleYValue;
        if (y + halfHeight <= SoftwareRaster.clipBottom) {
          lastSampleYValue = this.pixelHeight - 2;
        } else {
          lastSampleYValue = (SoftwareRaster.clipBottom - y << 1) - 2;
        }
        lastSampleY = lastSampleYValue;
        for (sampleY = firstSampleY; sampleY <= lastSampleY; sampleY += 2) {
          sourceIndex = sampleY * this.pixelWidth + firstSampleX;
          destinationIndex = (y + (sampleY >> 1)) * SoftwareRaster.width + (x + (firstSampleX >> 1));
          sampleX = firstSampleX;
          while (sampleX <= lastSampleX) {
            unusedColour = 0;
            unusedAlpha = 0;
            weightedRedOrPackedRedBlue = 0;
            weightedGreenOrPackedGreen = 0;
            weightedBlue = 0;
            alphaSum = 0;
            for (sampleIndex = 0; sampleIndex < 4; sampleIndex++) {
              sourcePixels = this.pixels;
              sourcePixelIndex = sourceIndex + (sampleIndex & 1);
              if ((sampleIndex & 2) != 0) {
                sampleRowOffset = 0;
              } else {
                sampleRowOffset = this.pixelWidth;
              }
              sourceColour = sourcePixels[sourcePixelIndex + sampleRowOffset];
              sourceAlpha = sourceColour >>> 24;
              alphaSum = alphaSum + sourceAlpha;
              weightedRedOrPackedRedBlue = weightedRedOrPackedRedBlue + sourceAlpha * (sourceColour >> 16 & 255);
              weightedGreenOrPackedGreen = weightedGreenOrPackedGreen + sourceAlpha * (sourceColour >> 8 & 255);
              weightedBlue = weightedBlue + sourceAlpha * (sourceColour & 255);
            }
            if (alphaSum != 0) {
              weightedRedOrPackedRedBlue = (weightedRedOrPackedRedBlue / alphaSum << 16) + weightedBlue / alphaSum;
              weightedGreenOrPackedGreen = weightedGreenOrPackedGreen / alphaSum << 8;
              effectiveAlpha = alphaSum * opacity >> 10;
              inverseAlpha = 256 - effectiveAlpha;
              destinationColour = SoftwareRaster.pixels[destinationIndex];
              SoftwareRaster.pixels[destinationIndex] = (effectiveAlpha * weightedRedOrPackedRedBlue + inverseAlpha * (destinationColour & 16711935) & -16711936) + (effectiveAlpha * weightedGreenOrPackedGreen + inverseAlpha * (destinationColour & 65280) & 16711680) >>> 8;
            }
            sampleX += 2;
            destinationIndex++;
            sourceIndex += 2;
          }
        }
    }

    private final static void addArgbRows(int sourceColour, int destinationColour, int channelSum, int[] destination, int[] source, int sourceIndex, int columnLoopIndex, int destinationIndex, int rowLoopIndex, int width, int height, int destinationRowSkip, int sourceRowSkip, int opacity) {
        int destinationWriteIndex = 0;
        int effectiveAlpha;
        for (rowLoopIndex = -height; rowLoopIndex < 0; rowLoopIndex++) {
          for (columnLoopIndex = -width; columnLoopIndex < 0; columnLoopIndex++) {
            sourceColour = source[sourceIndex++];
            if (sourceColour == 0) {
              destinationIndex++;
            } else {
              effectiveAlpha = opacity * (sourceColour >>> 24) >> 8 & 255;
              destinationColour = (sourceColour & 16711935) * effectiveAlpha;
              sourceColour = (destinationColour & -16711936) + (sourceColour * effectiveAlpha - destinationColour & 16711680) >>> 8;
              destinationColour = destination[destinationIndex];
              channelSum = sourceColour + destinationColour;
              sourceColour = (sourceColour & 16711935) + (destinationColour & 16711935);
              destinationColour = (sourceColour & 16777472) + (channelSum - sourceColour & 65536);
              destinationWriteIndex = destinationIndex;
              destinationIndex++;
              destination[destinationWriteIndex] = channelSum - destinationColour | destinationColour - (destinationColour >>> 8);
            }
          }
          destinationIndex = destinationIndex + destinationRowSkip;
          sourceIndex = sourceIndex + sourceRowSkip;
        }
    }

    private final static void blendShadedGrayscaleRows(int[] destination, int[] source, int sourceColour, int sourceIndex, int destinationIndex, int width, int height, int destinationRowSkip, int sourceRowSkip, int tintColour) {
        int row = 0;
        int column = 0;
        int destinationWriteIndex = 0;
        int tintRed;
        int tintGreen;
        int tintBlue;
        int negativeFourPixelGroups;
        int negativeWidth;
        int sourceAlpha;
        int shadedColour;
        int sourceRed;
        int sourceGreen;
        int sourceBlue;
        int inverseAlpha;
        int destinationColour;
        tintRed = tintColour >> 16 & 255;
        tintGreen = tintColour >> 8 & 255;
        tintBlue = tintColour & 255;
        negativeFourPixelGroups = -(width >> 2);
        width = -(width & 3);
        negativeWidth = negativeFourPixelGroups + negativeFourPixelGroups + negativeFourPixelGroups + negativeFourPixelGroups + width;
        for (row = -height; row < 0; row++) {
          for (column = negativeWidth; column < 0; column++) {
            sourceColour = source[sourceIndex++];
            sourceAlpha = sourceColour >>> 24;
            if (sourceAlpha == 0) {
              destinationIndex++;
            } else {
              sourceRed = sourceColour >> 16 & 255;
              sourceGreen = sourceColour >> 8 & 255;
              sourceBlue = sourceColour & 255;
              if (sourceRed == sourceGreen &&
                sourceGreen == sourceBlue) {
                if (sourceRed > 128) {
                  shadedColour = (tintRed * (256 - sourceRed) + 255 * (sourceRed - 128) >> 7 << 16) + (tintGreen * (256 - sourceGreen) + 255 * (sourceGreen - 128) >> 7 << 8) + (tintBlue * (256 - sourceBlue) + 255 * (sourceBlue - 128) >> 7);
                } else {
                  shadedColour = (sourceRed * tintRed >> 7 << 16) + (sourceGreen * tintGreen >> 7 << 8) + (sourceBlue * tintBlue >> 7);
                }
              } else {
                shadedColour = sourceColour;
              }
              inverseAlpha = 256 - sourceAlpha;
              destinationColour = destination[destinationIndex];
              destinationWriteIndex = destinationIndex;
              destinationIndex++;
              destination[destinationWriteIndex] = ((shadedColour & 16711935) * sourceAlpha + (destinationColour & 16711935) * inverseAlpha & -16711936) + ((shadedColour & 65280) * sourceAlpha + (destinationColour & 65280) * inverseAlpha & 16711680) >>> 8;
            }
          }
          destinationIndex = destinationIndex + destinationRowSkip;
          sourceIndex = sourceIndex + sourceRowSkip;
        }
    }

    final void drawQuarterSize(int x, int y) {
        int sampleY = 0;
        int sampleX = 0;
        int firstSampleXValue = 0;
        int lastSampleXValue = 0;
        int firstSampleYValue = 0;
        int lastSampleYValue = 0;
        int quarterWidth;
        int quarterHeight;
        int firstSampleX;
        int lastSampleX;
        int firstSampleY;
        int lastSampleY;
        int[] pixelBlock;
        int sourceIndex;
        int destinationIndex;
        int blockRow;
        int blockColumn;
        int weightedRedOrPackedRedBlue;
        int weightedGreenOrPackedGreen;
        int weightedBlue;
        int sampleIndex;
        int inverseAlpha;
        int destinationColour;
        int[] pixelBlockAlias;
        int[] allocatedPixelBlock;
        int unusedAlpha;
        int sourceAlpha;
        int alphaSum;
        int meanAlpha;
        int[] sourceBlock;
        quarterWidth = this.pixelWidth >> 2;
        quarterHeight = this.pixelHeight >> 2;
        x = x + this.offsetX / 4;
        y = y + this.offsetY / 4;
        if (x >= SoftwareRaster.clipLeft) {
          firstSampleXValue = 0;
        } else {
          firstSampleXValue = SoftwareRaster.clipLeft - x << 2;
        }
        firstSampleX = firstSampleXValue;
        if (x + quarterWidth <= SoftwareRaster.clipRight) {
          lastSampleXValue = this.pixelWidth - 4;
        } else {
          lastSampleXValue = (SoftwareRaster.clipRight - x << 2) - 4;
        }
        lastSampleX = lastSampleXValue;
        if (y >= SoftwareRaster.clipTop) {
          firstSampleYValue = 0;
        } else {
          firstSampleYValue = SoftwareRaster.clipTop - y << 2;
        }
        firstSampleY = firstSampleYValue;
        if (y + quarterHeight <= SoftwareRaster.clipBottom) {
          lastSampleYValue = this.pixelHeight - 4;
        } else {
          lastSampleYValue = (SoftwareRaster.clipBottom - y << 2) - 4;
        }
        lastSampleY = lastSampleYValue;
        allocatedPixelBlock = new int[16];
        pixelBlockAlias = allocatedPixelBlock;
        pixelBlock = pixelBlockAlias;
        for (sampleY = firstSampleY; sampleY <= lastSampleY; sampleY += 4) {
          for (sampleX = firstSampleX; sampleX <= lastSampleX; sampleX += 4) {
            sourceIndex = sampleY * this.pixelWidth + sampleX;
            destinationIndex = (y + (sampleY >> 2)) * SoftwareRaster.width + (x + (sampleX >> 2));
            for (blockRow = 0; blockRow < 4; blockRow++) {
              for (blockColumn = 0; blockColumn < 4; blockColumn++) {
                pixelBlock[(blockRow << 2) + blockColumn] = this.pixels[sourceIndex + blockRow * this.pixelWidth + blockColumn];
              }
            }
            sourceBlock = pixelBlockAlias;
            unusedAlpha = 0;
            alphaSum = 0;
            weightedRedOrPackedRedBlue = 0;
            weightedGreenOrPackedGreen = 0;
            weightedBlue = 0;
            for (sampleIndex = 0; sampleIndex < 16; sampleIndex++) {
              sourceAlpha = sourceBlock[sampleIndex] >>> 24;
              alphaSum = alphaSum + sourceAlpha;
              weightedRedOrPackedRedBlue = weightedRedOrPackedRedBlue + sourceAlpha * (sourceBlock[sampleIndex] >> 16 & 255);
              weightedGreenOrPackedGreen = weightedGreenOrPackedGreen + sourceAlpha * (sourceBlock[sampleIndex] >> 8 & 255);
              weightedBlue = weightedBlue + sourceAlpha * (sourceBlock[sampleIndex] & 255);
            }
            if (alphaSum != 0) {
              weightedRedOrPackedRedBlue = (weightedRedOrPackedRedBlue / alphaSum << 16) + weightedBlue / alphaSum;
              weightedGreenOrPackedGreen = weightedGreenOrPackedGreen / alphaSum << 8;
              meanAlpha = alphaSum >> 4;
              inverseAlpha = 256 - meanAlpha;
              destinationColour = SoftwareRaster.pixels[destinationIndex];
              SoftwareRaster.pixels[destinationIndex] = (meanAlpha * weightedRedOrPackedRedBlue + inverseAlpha * (destinationColour & 16711935) & -16711936) + (meanAlpha * weightedGreenOrPackedGreen + inverseAlpha * (destinationColour & 65280) & 16711680) >>> 8;
            }
          }
        }
    }
}
