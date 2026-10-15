/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class RasterEffectHelpers {
    static lo field_a;
    static UiComponent field_b;
    static boolean viewKeyWasHeld;

    private final static void drawBubbleRowAboveCenter(int y, int distanceSquared, int distanceStepX, int distanceStep2X, int falloffIndexShift, int radiusSquared, int scaledRadiusSquared, int leftBound, int centerColumn, int rightBound, int distortionAmount, int destinationOffset, int centerX16, int centerY16) {
        int writtenOffset = 0;
        int deltaY16;
        int rightDestination;
        int rightDistanceSquared;
        int rightDistanceStep;
        int rightX;
        int rightDeltaX16;
        int rightFalloffIndex;
        int rightDistortion;
        int rightSourceX;
        int rightSourceY;
        int rightSourceColor;
        int rightGain64OrGreen;
        int rightRedBlueOrCarry;
        int leftDestination;
        int leftDistanceSquared;
        int leftDistanceStep;
        int leftX;
        int leftDeltaX16;
        int leftFalloffIndex;
        int leftDistortion;
        int leftSourceX;
        int leftSourceY;
        int leftSourceColor;
        int leftGain64OrGreen;
        int leftRedBlueOrCarry;
        int rightPackedColor;
        int leftPackedColor;
        deltaY16 = (y << 4) - centerY16;
        rightDestination = destinationOffset;
        rightDistanceSquared = distanceSquared;
        rightDistanceStep = distanceStepX;
        for (rightX = centerColumn; rightX < rightBound; rightX++) {
          if (rightDistanceSquared < radiusSquared) {
            rightDeltaX16 = (rightX << 4) - centerX16;
            rightFalloffIndex = (rightDistanceSquared << falloffIndexShift) / scaledRadiusSquared;
            rightDistortion = Brick.bubbleDistortionFalloff[rightFalloffIndex] * distortionAmount >> 15;
            rightSourceX = rightX + (rightDeltaX16 * rightDistortion + 131072 >> 18);
            if (rightSourceX > Rasterizer2D.width - 1) {
              rightSourceX = Rasterizer2D.width - 1;
            }
            rightSourceY = y + (deltaY16 * rightDistortion + 131072 >> 18);
            if (rightSourceY < 0) {
              rightSourceY = 0;
            }
            rightSourceColor = Rasterizer2D.pixels[rightSourceY * Rasterizer2D.width + rightSourceX];
            rightGain64OrGreen = 64;
            if (rightGain64OrGreen < 0) {
              rightGain64OrGreen = -rightGain64OrGreen;
            }
            rightRedBlueOrCarry = (rightSourceColor & 16711935) * rightGain64OrGreen;
            rightGain64OrGreen = (rightSourceColor & 65280) * rightGain64OrGreen;
            rightPackedColor = (rightRedBlueOrCarry & 1069563840) + (rightGain64OrGreen & 4177920);
            rightRedBlueOrCarry = (rightRedBlueOrCarry & -1073692672) + (rightGain64OrGreen & 12582912);
            rightRedBlueOrCarry = (rightRedBlueOrCarry | rightRedBlueOrCarry >>> 1) & 1077952512;
            writtenOffset = rightDestination;
            rightDestination++;
            Rasterizer2D.pixels[writtenOffset] = (rightPackedColor | rightRedBlueOrCarry - (rightRedBlueOrCarry >>> 8)) >>> 6;
            rightDistanceSquared = rightDistanceSquared + rightDistanceStep;
            rightDistanceStep = rightDistanceStep + distanceStep2X;
            continue;
          }
          break;
        }
        leftDestination = destinationOffset;
        leftDistanceSquared = distanceSquared;
        leftDistanceStep = distanceStepX;
        for (leftX = centerColumn - 1; leftX >= leftBound; leftX--) {
          leftDistanceStep = leftDistanceStep - distanceStep2X;
          leftDistanceSquared = leftDistanceSquared - leftDistanceStep;
          if (leftDistanceSquared < radiusSquared) {
            leftDeltaX16 = (leftX << 4) - centerX16;
            leftFalloffIndex = (leftDistanceSquared << falloffIndexShift) / scaledRadiusSquared;
            leftDistortion = Brick.bubbleDistortionFalloff[leftFalloffIndex] * distortionAmount >> 15;
            leftSourceX = leftX + (leftDeltaX16 * leftDistortion + 131072 >> 18);
            if (leftSourceX < 0) {
              leftSourceX = 0;
            }
            leftSourceY = y + (deltaY16 * leftDistortion + 131072 >> 18);
            if (leftSourceY < 0) {
              leftSourceY = 0;
            }
            leftSourceColor = Rasterizer2D.pixels[leftSourceY * Rasterizer2D.width + leftSourceX];
            leftGain64OrGreen = 64;
            if (leftGain64OrGreen < 0) {
              leftGain64OrGreen = -leftGain64OrGreen;
            }
            leftRedBlueOrCarry = (leftSourceColor & 16711935) * leftGain64OrGreen;
            leftGain64OrGreen = (leftSourceColor & 65280) * leftGain64OrGreen;
            leftPackedColor = (leftRedBlueOrCarry & 1069563840) + (leftGain64OrGreen & 4177920);
            leftRedBlueOrCarry = (leftRedBlueOrCarry & -1073692672) + (leftGain64OrGreen & 12582912);
            leftRedBlueOrCarry = (leftRedBlueOrCarry | leftRedBlueOrCarry >>> 1) & 1077952512;
            leftDestination--;
            Rasterizer2D.pixels[leftDestination] = (leftPackedColor | leftRedBlueOrCarry - (leftRedBlueOrCarry >>> 8)) >>> 6;
            continue;
          }
          break;
        }
    }

    private final static void drawBubbleRowBelowCenter(int y, int distanceSquared, int distanceStepX, int distanceStep2X, int falloffIndexShift, int radiusSquared, int scaledRadiusSquared, int leftBound, int centerColumn, int rightBound, int distortionAmount, int destinationOffset, int centerX16, int centerY16) {
        int writtenOffset = 0;
        int deltaY16;
        int rightDestination;
        int rightDistanceSquared;
        int rightDistanceStep;
        int rightX;
        int rightDeltaX16;
        int rightFalloffIndex;
        int rightDistortion;
        int rightSourceX;
        int rightSourceY;
        int rightSourceColor;
        int rightGain64OrGreen;
        int rightRedBlueOrCarry;
        int leftDestination;
        int leftDistanceSquared;
        int leftDistanceStep;
        int leftX;
        int leftDeltaX16;
        int leftFalloffIndex;
        int leftDistortion;
        int leftSourceX;
        int leftSourceY;
        int leftSourceColor;
        int leftGain64OrGreen;
        int leftRedBlueOrCarry;
        int rightPackedColor;
        int leftPackedColor;
        deltaY16 = (y << 4) - centerY16;
        rightDestination = destinationOffset;
        rightDistanceSquared = distanceSquared;
        rightDistanceStep = distanceStepX;
        for (rightX = centerColumn; rightX < rightBound; rightX++) {
          if (rightDistanceSquared < radiusSquared) {
            rightDeltaX16 = (rightX << 4) - centerX16;
            rightFalloffIndex = (rightDistanceSquared << falloffIndexShift) / scaledRadiusSquared;
            rightDistortion = Brick.bubbleDistortionFalloff[rightFalloffIndex] * distortionAmount >> 15;
            rightSourceX = rightX + (rightDeltaX16 * rightDistortion + 131072 >> 18);
            if (rightSourceX > Rasterizer2D.width - 1) {
              rightSourceX = Rasterizer2D.width - 1;
            }
            rightSourceY = y + (deltaY16 * rightDistortion + 131072 >> 18);
            if (rightSourceY > Rasterizer2D.height - 1) {
              rightSourceY = Rasterizer2D.height - 1;
            }
            rightSourceColor = Rasterizer2D.pixels[rightSourceY * Rasterizer2D.width + rightSourceX];
            rightGain64OrGreen = 64;
            if (rightGain64OrGreen < 0) {
              throw new Error();
            }
            rightRedBlueOrCarry = (rightSourceColor & 16711935) * rightGain64OrGreen;
            rightGain64OrGreen = (rightSourceColor & 65280) * rightGain64OrGreen;
            rightPackedColor = (rightRedBlueOrCarry & 1069563840) + (rightGain64OrGreen & 4177920);
            rightRedBlueOrCarry = (rightRedBlueOrCarry & -1073692672) + (rightGain64OrGreen & 12582912);
            rightRedBlueOrCarry = (rightRedBlueOrCarry | rightRedBlueOrCarry >>> 1) & 1077952512;
            writtenOffset = rightDestination;
            rightDestination++;
            Rasterizer2D.pixels[writtenOffset] = (rightPackedColor | rightRedBlueOrCarry - (rightRedBlueOrCarry >>> 8)) >>> 6;
            rightDistanceSquared = rightDistanceSquared + rightDistanceStep;
            rightDistanceStep = rightDistanceStep + distanceStep2X;
            continue;
          }
          break;
        }
        leftDestination = destinationOffset;
        leftDistanceSquared = distanceSquared;
        leftDistanceStep = distanceStepX;
        for (leftX = centerColumn - 1; leftX >= leftBound; leftX--) {
          leftDistanceStep = leftDistanceStep - distanceStep2X;
          leftDistanceSquared = leftDistanceSquared - leftDistanceStep;
          if (leftDistanceSquared < radiusSquared) {
            leftDeltaX16 = (leftX << 4) - centerX16;
            leftFalloffIndex = (leftDistanceSquared << falloffIndexShift) / scaledRadiusSquared;
            leftDistortion = Brick.bubbleDistortionFalloff[leftFalloffIndex] * distortionAmount >> 15;
            leftSourceX = leftX + (leftDeltaX16 * leftDistortion + 131072 >> 18);
            if (leftSourceX < 0) {
              leftSourceX = 0;
            }
            leftSourceY = y + (deltaY16 * leftDistortion + 131072 >> 18);
            if (leftSourceY > Rasterizer2D.height - 1) {
              leftSourceY = Rasterizer2D.height - 1;
            }
            leftSourceColor = Rasterizer2D.pixels[leftSourceY * Rasterizer2D.width + leftSourceX];
            leftGain64OrGreen = 64;
            if (leftGain64OrGreen < 0) {
              leftGain64OrGreen = -leftGain64OrGreen;
            }
            leftRedBlueOrCarry = (leftSourceColor & 16711935) * leftGain64OrGreen;
            leftGain64OrGreen = (leftSourceColor & 65280) * leftGain64OrGreen;
            leftPackedColor = (leftRedBlueOrCarry & 1069563840) + (leftGain64OrGreen & 4177920);
            leftRedBlueOrCarry = (leftRedBlueOrCarry & -1073692672) + (leftGain64OrGreen & 12582912);
            leftRedBlueOrCarry = (leftRedBlueOrCarry | leftRedBlueOrCarry >>> 1) & 1077952512;
            leftDestination--;
            Rasterizer2D.pixels[leftDestination] = (leftPackedColor | leftRedBlueOrCarry - (leftRedBlueOrCarry >>> 8)) >>> 6;
            continue;
          }
          break;
        }
    }

    private final static void blitGrayscalePalette(int[] destination, int[] source, int sourceColor, int sourceOffset, int destinationOffset, int columnCountdown, int rowCountdown, int width, int height, int destinationRowSkip, int sourceRowSkip, int[] grayPalette) {
        int writtenOffset = 0;
        for (rowCountdown = -height; rowCountdown < 0; rowCountdown++) {
          for (columnCountdown = -width; columnCountdown < 0; columnCountdown++) {
            sourceColor = source[sourceOffset++];
            if (sourceColor == 0) {
              destinationOffset++;
            } else {
              if (sourceColor >> 8 != (sourceColor & 65535)) {
                destination[destinationOffset++] = sourceColor;
              } else {
                sourceColor = sourceColor & 255;
                writtenOffset = destinationOffset;
                destinationOffset++;
                destination[writtenOffset] = grayPalette[sourceColor];
              }
            }
          }
          destinationOffset = destinationOffset + destinationRowSkip;
          sourceOffset = sourceOffset + sourceRowSkip;
        }
    }

    final static void markOutlineNeighbors(int[] pixels, int offset, int leftIndex, int rightIndex, int aboveIndex, int belowIndex, int width, int height, int rowSkip) {
        int columnCountdown = 0;
        height--;
        while (height >= 0) {
          for (columnCountdown = width - 1; columnCountdown >= 0; columnCountdown--) {
            if (pixels[offset] > 1) {
              leftIndex = offset - 1;
              rightIndex = offset + 1;
              aboveIndex = offset - Rasterizer2D.width;
              belowIndex = offset + Rasterizer2D.width;
              if (pixels[aboveIndex + 1] == 0) {
                pixels[aboveIndex + 1] = 1;
              }
              if (pixels[belowIndex + 1] == 0) {
                pixels[belowIndex + 1] = 1;
              }
              if (pixels[aboveIndex - 1] == 0) {
                pixels[aboveIndex - 1] = 1;
              }
              if (pixels[belowIndex - 1] == 0) {
                pixels[belowIndex - 1] = 1;
              }
              if (pixels[leftIndex] == 0) {
                pixels[leftIndex] = 1;
              }
              if (pixels[rightIndex] == 0) {
                pixels[rightIndex] = 1;
              }
              if (pixels[aboveIndex] == 0) {
                pixels[aboveIndex] = 1;
              }
              if (pixels[belowIndex] == 0) {
                pixels[belowIndex] = 1;
              }
              if (pixels[leftIndex - 1] == 0) {
                pixels[leftIndex - 1] = 1;
              }
              if (pixels[rightIndex + 1] == 0) {
                pixels[rightIndex + 1] = 1;
              }
              if (pixels[aboveIndex - Rasterizer2D.width] == 0) {
                pixels[aboveIndex - Rasterizer2D.width] = 1;
              }
              if (pixels[belowIndex + Rasterizer2D.width] == 0) {
                pixels[belowIndex + Rasterizer2D.width] = 1;
              }
            }
            offset++;
          }
          offset = offset + rowSkip;
          height--;
        }
    }

    final static void drawBubbleDistortion(int centerX16, int centerY16, int radius16, int distortionAmount) {
        int lowerRow = 0;
        int radiusSquared = radius16 * radius16;
        int leftX = centerX16 - radius16 >> 4;
        int centerColumn = centerX16 + 15 >> 4;
        int rightX = centerX16 + radius16 + 15 >> 4;
        int topY = centerY16 - radius16 >> 4;
        int centerRow = centerY16 + 15 >> 4;
        int bottomY = centerY16 + radius16 + 15 >> 4;
        int upperRow;
        if (leftX < 0) {
          leftX = 0;
        }
        if (rightX > Rasterizer2D.width) {
          rightX = Rasterizer2D.width;
        }
        if (topY < 0) {
          topY = 0;
        }
        if (bottomY > Rasterizer2D.height) {
          bottomY = Rasterizer2D.height;
        }
        if (centerColumn < 0) {
          centerColumn = 0;
        }
        if (centerColumn > Rasterizer2D.width) {
          centerColumn = Rasterizer2D.width;
        }
        if (centerRow < 0) {
          centerRow = 0;
        }
        if (centerRow > Rasterizer2D.height) {
          centerRow = Rasterizer2D.height;
        }
        int xSquared0 = (centerColumn << 4) - centerX16;
        xSquared0 = xSquared0 * xSquared0;
        int xSquared1 = (centerColumn + 1 << 4) - centerX16;
        xSquared1 = xSquared1 * xSquared1;
        int xSquared2 = (centerColumn + 2 << 4) - centerX16;
        xSquared2 = xSquared2 * xSquared2;
        int xStep0 = xSquared1 - xSquared0;
        int xStep1 = xSquared2 - xSquared1;
        int xSecondDifference = xStep1 - xStep0;
        int ySquared0 = (centerRow << 4) - centerY16;
        ySquared0 = ySquared0 * ySquared0;
        int ySquared1 = (centerRow + 1 << 4) - centerY16;
        ySquared1 = ySquared1 * ySquared1;
        int ySquared2 = (centerRow + 2 << 4) - centerY16;
        ySquared2 = ySquared2 * ySquared2;
        int yStep0 = ySquared1 - ySquared0;
        int yStep1 = ySquared2 - ySquared1;
        int ySecondDifference = yStep1 - yStep0;
        int falloffIndexShift = 16;
        int scaledRadiusSquared = radiusSquared;
        while (radiusSquared > 2147483647 >>> falloffIndexShift) {
          falloffIndexShift--;
          scaledRadiusSquared = scaledRadiusSquared + 1 >>> 1;
        }
        int destinationOffset = centerRow * Rasterizer2D.width + centerColumn;
        int distanceSquared = xSquared0 + ySquared0;
        int distanceStepY = yStep0;
        for (lowerRow = centerRow; lowerRow < bottomY; lowerRow++) {
          RasterEffectHelpers.drawBubbleRowBelowCenter(lowerRow, distanceSquared, xStep0, xSecondDifference, falloffIndexShift, radiusSquared, scaledRadiusSquared, leftX, centerColumn, rightX, distortionAmount, destinationOffset, centerX16, centerY16);
          distanceSquared = distanceSquared + distanceStepY;
          distanceStepY = distanceStepY + ySecondDifference;
          destinationOffset = destinationOffset + Rasterizer2D.width;
        }
        destinationOffset = centerRow * Rasterizer2D.width + centerColumn;
        distanceSquared = xSquared0 + ySquared0;
        distanceStepY = yStep0;
        for (upperRow = centerRow - 1; upperRow >= topY; upperRow--) {
          distanceStepY = distanceStepY - ySecondDifference;
          distanceSquared = distanceSquared - distanceStepY;
          destinationOffset = destinationOffset - Rasterizer2D.width;
          RasterEffectHelpers.drawBubbleRowAboveCenter(upperRow, distanceSquared, xStep0, xSecondDifference, falloffIndexShift, radiusSquared, scaledRadiusSquared, leftX, centerColumn, rightX, distortionAmount, destinationOffset, centerX16, centerY16);
        }
    }

    final static void drawGrayscalePaletteSprite(RgbSprite sprite, int x, int y, int[] grayPalette) {
        int clippedTopRows = 0;
        int clippedLeftColumns;
        int clippedRightColumns;
        x = x + sprite.offsetX;
        y = y + sprite.offsetY;
        int destinationOffset = x + y * Rasterizer2D.width;
        int sourceOffset = 0;
        int height = sprite.height;
        int width = sprite.width;
        int destinationRowSkip = Rasterizer2D.width - width;
        int sourceRowSkip = 0;
        if (y < Rasterizer2D.clipTop) {
          clippedTopRows = Rasterizer2D.clipTop - y;
          height = height - clippedTopRows;
          y = Rasterizer2D.clipTop;
          sourceOffset = sourceOffset + clippedTopRows * width;
          destinationOffset = destinationOffset + clippedTopRows * Rasterizer2D.width;
        }
        if (y + height > Rasterizer2D.clipBottom) {
          height = height - (y + height - Rasterizer2D.clipBottom);
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
        if (width <= 0 ||
          height <= 0) {
          return;
        }
        RasterEffectHelpers.blitGrayscalePalette(Rasterizer2D.pixels, sprite.pixels, 0, sourceOffset, destinationOffset, 0, 0, width, height, destinationRowSkip, sourceRowSkip, grayPalette);
    }

    public static void a(byte param0) {
        field_a = null;
        field_b = null;
        if (param0 >= -59) {
          int[] var2 = (int[]) null;
          RasterEffectHelpers.drawBranchedGlow(4, 89, -93, -46, -111, (int[]) null, 101);
        }
    }

    final static void fillVerticalGradientAlpha255(int x, int y, int width, int height, int topColor, int bottomColor, int alpha255) {
        int rowCountdown = 0;
        int topWeight256 = 0;
        int bottomWeight256 = 0;
        int gradientRedBlue = 0;
        int gradientGreen = 0;
        int columnCountdown = 0;
        int destinationColor = 0;
        int writtenOffset = 0;
        int gradientPosition16 = 0;
        int gradientStep16 = 65536 / height;
        int inverseAlpha255 = 255 - alpha255;
        if (x < Rasterizer2D.clipLeft) {
          width = width - (Rasterizer2D.clipLeft - x);
          x = Rasterizer2D.clipLeft;
        }
        if (y < Rasterizer2D.clipTop) {
          gradientPosition16 = gradientPosition16 + (Rasterizer2D.clipTop - y) * gradientStep16;
          height = height - (Rasterizer2D.clipTop - y);
          y = Rasterizer2D.clipTop;
        }
        if (x + width > Rasterizer2D.clipRight) {
          width = Rasterizer2D.clipRight - x;
        }
        if (y + height > Rasterizer2D.clipBottom) {
          height = Rasterizer2D.clipBottom - y;
        }
        int destinationRowSkip = Rasterizer2D.width - width;
        int destinationOffset = x + y * Rasterizer2D.width;
        for (rowCountdown = -height; rowCountdown < 0; rowCountdown++) {
          topWeight256 = 65536 - gradientPosition16 >> 8;
          bottomWeight256 = gradientPosition16 >> 8;
          gradientRedBlue = ((topColor & 16711935) * topWeight256 + (bottomColor & 16711935) * bottomWeight256 & -16711936) >>> 8;
          gradientGreen = ((topColor & 65280) * topWeight256 + (bottomColor & 65280) * bottomWeight256 & 16711680) >> 8;
          for (columnCountdown = -width; columnCountdown < 0; columnCountdown++) {
            destinationColor = Rasterizer2D.pixels[destinationOffset];
            writtenOffset = destinationOffset;
            destinationOffset++;
            Rasterizer2D.pixels[writtenOffset] = (gradientRedBlue * alpha255 + (destinationColor & 16711935) * inverseAlpha255 & -16711936) + (gradientGreen * alpha255 + (destinationColor & 65280) * inverseAlpha255 & 16711680) >>> 8;
          }
          destinationOffset = destinationOffset + destinationRowSkip;
          gradientPosition16 = gradientPosition16 + gradientStep16;
        }
    }

    final static boolean b(byte param0) {
        if (param0 < 117) {
          return true;
        }
        return MusicVoice.field_l == MusicEnvelope.field_f ? true : false;
    }

    final static void drawBranchedGlow(int centerX16, int centerY16, int radiusStep16, int generations, int maximumChildren, int[] colors, int sequenceSeed) {
        int generation = 0;
        int nextGenerationCount = 0;
        int node = 0;
        int xReadIndex = 0;
        int nodeX16 = 0;
        int yReadIndex = 0;
        int nodeY16 = 0;
        int childrenReadIndex = 0;
        int childCount = 0;
        int child = 0;
        int xWriteIndex = 0;
        int xWordIndex = 0;
        int yWriteIndex = 0;
        int yWordIndex = 0;
        int childrenWriteIndex = 0;
        int childrenWordIndex = 0;
        TranslucentNineSliceFrame.glowBranchScratch[0] = centerX16;
        TranslucentNineSliceFrame.glowBranchScratch[1] = centerY16;
        TranslucentNineSliceFrame.glowBranchScratch[2] = generations;
        int readIndex = 0;
        int writeIndex = 3;
        int generationCount = 1;
        int intensity = 254;
        int radius16 = radiusStep16;
        sequenceSeed = 273 * sequenceSeed + 36;
        Rasterizer2D.drawRadialGlow(centerX16, centerY16, 2 * radiusStep16, 254, colors);
        for (generation = 0; generation < generations; generation++) {
          Rasterizer2D.drawRadialGlow(centerX16, centerY16, generation * radiusStep16, 254 / (1 + generation), colors);
          Rasterizer2D.drawRadialGlow(centerX16, centerY16, generation * radiusStep16, 196 / (1 + generation), colors);
          nextGenerationCount = 0;
          for (node = 0; node < generationCount; node++) {
            readIndex = readIndex % TranslucentNineSliceFrame.glowBranchScratch.length;
            xReadIndex = readIndex;
            readIndex++;
            nodeX16 = TranslucentNineSliceFrame.glowBranchScratch[xReadIndex];
            yReadIndex = readIndex;
            readIndex++;
            nodeY16 = TranslucentNineSliceFrame.glowBranchScratch[yReadIndex];
            childrenReadIndex = readIndex;
            readIndex++;
            childCount = TranslucentNineSliceFrame.glowBranchScratch[childrenReadIndex];
            nextGenerationCount = nextGenerationCount + childCount;
            Rasterizer2D.drawRadialGlow(nodeX16, nodeY16, radius16, intensity, colors);
            Rasterizer2D.drawRadialGlow(nodeX16, nodeY16, radius16 >> 1, intensity >> 1, colors);
            for (child = 0; child < childCount; child++) {
              writeIndex = writeIndex % TranslucentNineSliceFrame.glowBranchScratch.length;
              sequenceSeed = sequenceSeed % UiComponent.glowSequenceWords.length;
              xWriteIndex = writeIndex;
              writeIndex++;
              xWordIndex = sequenceSeed;
              sequenceSeed++;
              TranslucentNineSliceFrame.glowBranchScratch[xWriteIndex] = nodeX16 + (radius16 * InteractiveGameClient.sine8192(UiComponent.glowSequenceWords[xWordIndex], -4097) >> 16);
              yWriteIndex = writeIndex;
              writeIndex++;
              yWordIndex = sequenceSeed;
              sequenceSeed++;
              TranslucentNineSliceFrame.glowBranchScratch[yWriteIndex] = nodeY16 + (radius16 * BrickABrac.cosine8192(2048, UiComponent.glowSequenceWords[yWordIndex]) >> 16);
              childrenWriteIndex = writeIndex;
              writeIndex++;
              childrenWordIndex = sequenceSeed;
              sequenceSeed++;
              TranslucentNineSliceFrame.glowBranchScratch[childrenWriteIndex] = 1 + er.nonnegativeRemainder(-1560508993, maximumChildren, UiComponent.glowSequenceWords[childrenWordIndex]);
            }
          }
          generationCount = nextGenerationCount;
          radius16 = radius16 / 2;
          intensity = 60 + 126 * radius16 / radiusStep16;
        }
    }

    final static int hsvFixed8ToRgb(int hueDegrees256, int saturation256, int value255) {
        int sectorParity;
        hueDegrees256 = hueDegrees256 / 60;
        int sectorThenPairIndex = (hueDegrees256 >> 8) % 6;
        hueDegrees256 = hueDegrees256 & 255;
        int one256 = 256;
        int minimumChannel = 255 * (value255 * (one256 - saturation256)) >> 8 >> 8;
        int fallingChannel = 255 * (value255 * (one256 - (hueDegrees256 * saturation256 >> 8)) >> 8) >> 8;
        int risingChannel = 255 * (value255 * (one256 - ((one256 - hueDegrees256) * saturation256 >> 8)) >> 8) >> 8;
        sectorParity = sectorThenPairIndex & 1;
        sectorThenPairIndex = sectorThenPairIndex >> 1;
        return (minimumChannel << (2 - (2 + sectorThenPairIndex) % 3 << 3)) + (value255 << (2 - (sectorThenPairIndex + sectorParity) % 3 << 3)) + (risingChannel + (-sectorParity >> 31 & fallingChannel - risingChannel) << (2 - (4 + sectorThenPairIndex - sectorParity) % 3 << 3));
    }

    static {
        field_a = new lo();
    }
}
