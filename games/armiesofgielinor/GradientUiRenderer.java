/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GradientUiRenderer {
    private static PalettedBitmapFont font;
    static int particlePhasePercent;
    private static String[] wrappedLines;
    private static int savedClipTop;
    private static RgbSprite textMask;
    private static int circleClipCenterX;
    static RgbSprite[] textBackdropSprites;
    private static int[] wrapWidths;
    private static int circleClipCenterY;
    static int[][] particlePalettes;
    private static int savedClipLeft;
    private static int savedClipBottom;
    private static int savedClipRight;
    private static int circleClipRadius;
    private static int[] fractionalColumnCarries;

    private final static void drawUnclippedGradientFrame(int x, int y, int width, int height, RgbSprite[] frameSprites, int[] gradient, boolean fillCenter) {
        int row = 0;
        int textureRow;
        int gradientStep16;
        int gradientPosition16;
        int rowColour;
        int tileWidth;
        int tileHeight;
        int spriteIndex;
        int columnCounter;
        int centerWidth;
        int destinationIndex;
        int sliceColumn;
        int sourceIndex;
        int pixelColour;
        textureRow = 0;
        gradientStep16 = (gradient.length << 16) / height;
        gradientPosition16 = 0;
        tileWidth = frameSprites[0].pixelWidth;
        tileHeight = frameSprites[0].pixelHeight;
        for (row = 0; row < height; row++) {
          if (row >= tileHeight) {
            if (height - row > tileHeight) {
              spriteIndex = 3;
            } else {
              spriteIndex = 6;
              if (height - row == tileHeight) {
                textureRow = 0;
              }
            }
          } else {
            spriteIndex = 0;
          }
          rowColour = gradient[gradientPosition16 >> 16];
          gradientPosition16 = gradientPosition16 + gradientStep16;
          destinationIndex = (y + row) * SoftwareRaster.width + x;
          sliceColumn = 0;
          while (sliceColumn < 3) {
            sourceIndex = textureRow % tileHeight * tileWidth;
            if (sliceColumn != 1) {
              columnCounter = -tileWidth;
              while (columnCounter < 0) {
                pixelColour = frameSprites[spriteIndex].pixels[sourceIndex];
                if (pixelColour != 0) {
                  if ((pixelColour & -65281) == 0) {
                    pixelColour = GradientUiRenderer.shadeColour(rowColour, pixelColour >> 8, 0, 0);
                  }
                  SoftwareRaster.pixels[destinationIndex] = pixelColour;
                }
                columnCounter++;
                sourceIndex++;
                destinationIndex++;
              }
            } else {
              centerWidth = width - (tileWidth << 1);
              if (spriteIndex == 4 &&
                !fillCenter) {
                destinationIndex = destinationIndex + centerWidth;
              } else {
                pixelColour = frameSprites[spriteIndex].pixels[sourceIndex];
                if (pixelColour != 0) {
                  if ((pixelColour & -65281) == 0) {
                    pixelColour = GradientUiRenderer.shadeColour(rowColour, pixelColour >> 8, 0, 0);
                  }
                  columnCounter = -centerWidth;
                  while (columnCounter < 0) {
                    SoftwareRaster.pixels[destinationIndex] = pixelColour;
                    columnCounter++;
                    destinationIndex++;
                  }
                } else {
                  destinationIndex = destinationIndex + centerWidth;
                }
              }
            }
            sliceColumn++;
            spriteIndex++;
          }
          textureRow++;
        }
    }

    final static void drawFilledGradientFrame(int x, int y, int width, int height, RgbSprite[] frameSprites, int[] gradient, int underlayColour, int underlayOpacity) {
        GradientUiRenderer.drawGradientFrame(x, y, width, height, frameSprites, gradient, underlayColour, underlayOpacity, true);
    }

    final static void drawWrappedCenteredGradientText(String text, int centerX, int baselineY, int wrapWidth, int[] gradient, boolean halfSize, int boxHeight, int verticalAlignment) {
        int var12 = 0;
        wrapWidths[0] = wrapWidth << (halfSize ? 1 : 0);
        int var8 = font.wrapLines(text, wrapWidths, wrappedLines);
        int var9 = font.baselineHeight >> (halfSize ? 1 : 0);
        int var10 = var9 * var8;
        int var11 = 0;
        if (verticalAlignment == 1) {
          var11 = (boxHeight - var10) / 2;
        } else {
          if (verticalAlignment == 2) {
            var11 = boxHeight - var10;
          }
        }
        for (var12 = 0; var12 < var8; var12++) {
          GradientUiRenderer.drawCenteredGradientText(wrappedLines[var12], centerX, baselineY + var11 + var9 * var12, gradient, halfSize);
        }
    }

    final static void drawRightAlignedGradientText(String text, int rightX, int baselineY, int[] gradient, boolean halfSize) {
        rightX = rightX - (font.textWidth(text) >> (halfSize ? 1 : 0));
        GradientUiRenderer.drawGradientText(text, rightX, baselineY, gradient, halfSize);
    }

    final static int boundedIntegerSquareRoot(int value) {
        int root = 0;
        int bit = 16384;
        while (bit > value) {
          bit = bit >> 2;
        }
        while (bit != 0) {
          if (root + bit < value) {
            value = value - (root + bit);
            root = root + 2 * bit;
          }
          root = root >> 1;
          bit = bit >> 2;
        }
        return root;
    }

    private final static boolean outsideCircleClip(int x, int y) {
        if (circleClipRadius < 0) {
          return false;
        }
        int deltaX = circleClipCenterX - x;
        int deltaY = circleClipCenterY - y;
        int distanceSquared = deltaX * deltaX + deltaY * deltaY;
        if (distanceSquared > circleClipRadius * circleClipRadius) {
          return true;
        }
        return false;
    }

    final static void drawCornerShadow(int x, int y, int width, int height, RgbSprite[] cornerSprites, int opacity) {
        int var6;
        int var7;
        int var8;
        cornerSprites[0].drawWithOpacity(x, y, opacity);
        cornerSprites[1].drawWithOpacity(x + width - cornerSprites[0].pixelWidth, y, opacity);
        cornerSprites[2].drawWithOpacity(x, y + height - cornerSprites[0].pixelHeight, opacity);
        cornerSprites[3].drawWithOpacity(x + width - cornerSprites[0].pixelWidth, y + height - cornerSprites[0].pixelHeight, opacity);
        var6 = y;
        var7 = height - cornerSprites[0].pixelHeight;
        var8 = width - cornerSprites[0].pixelWidth;
        for (y = 0; y < height; y++) {
          if (y >= cornerSprites[0].pixelHeight) {
            if (y < var7) {
              SoftwareRaster.d(x, var6, x + width - 1, var6, 0, opacity);
            } else {
              SoftwareRaster.d(x + cornerSprites[0].pixelWidth, var6, x + var8 - 1, var6, 0, opacity);
            }
          } else {
            SoftwareRaster.d(x + cornerSprites[0].pixelWidth, var6, x + var8 - 1, var6, 0, opacity);
          }
          var6++;
        }
    }

    final static void drawParticleRings(int centerX, int centerY, int paletteIndex, int particleCount, int phasePercent, int orbitRadius, int stampRadius16) {
        int var8 = 0;
        double var9 = 0.0;
        double var11 = 0.0;
        int var7 = orbitRadius / 2 + 1;
        double var9Lifetime1;
        double var9Lifetime2;
        for (var8 = 0; var8 < particleCount; var8++) {
          var9 = (double)phasePercent * 3.141592653589793 * 2.0 / 100.0;
          var11 = (double)var8 * 3.141592653589793 * 2.0 / (double)particleCount;
          SoftwareRaster.a((int)(((double)centerX + (Math.cos(var9) * Math.cos(var11) * (double)orbitRadius - Math.sin(var9) * Math.sin(var11) * (double)var7)) * 16.0), (int)(((double)centerY + (Math.sin(var9) * Math.cos(var11) * (double)var7 + Math.cos(var9) * Math.sin(var11) * (double)orbitRadius)) * 16.0), stampRadius16, 15, particlePalettes[paletteIndex]);
          var9Lifetime1 = (double)(phasePercent + 5) * 3.141592653589793 * 2.0 / 100.0;
          SoftwareRaster.a((int)(((double)centerX + (Math.cos(var9Lifetime1) * Math.cos(var11) * (double)orbitRadius - Math.sin(var9Lifetime1) * Math.sin(var11) * (double)var7)) * 16.0), (int)(((double)centerY + (Math.sin(var9Lifetime1) * Math.cos(var11) * (double)var7 + Math.cos(var9Lifetime1) * Math.sin(var11) * (double)orbitRadius)) * 16.0), stampRadius16, 31, particlePalettes[paletteIndex]);
          var9Lifetime2 = (double)(phasePercent + 10) * 3.141592653589793 * 2.0 / 100.0;
          SoftwareRaster.a((int)(((double)centerX + (Math.cos(var9Lifetime2) * Math.cos(var11) * (double)orbitRadius - Math.sin(var9Lifetime2) * Math.sin(var11) * (double)var7)) * 16.0), (int)(((double)centerY + (Math.sin(var9Lifetime2) * Math.cos(var11) * (double)var7 + Math.cos(var9Lifetime2) * Math.sin(var11) * (double)orbitRadius)) * 16.0), stampRadius16, 63, particlePalettes[paletteIndex]);
        }
    }

    final static void drawTextBackdrop(String text, int x, int y, boolean halfSize) {
        int var4 = font.textWidth(text) + 40;
        if (halfSize) {
          var4 = var4 >> 1;
          y -= 26;
          x -= 10;
          GradientUiRenderer.multiplyScaledSprite(textBackdropSprites[0], x, y, textBackdropSprites[2].pixelWidth >> 1, textBackdropSprites[2].pixelHeight >> 1);
          GradientUiRenderer.multiplyScaledSprite(textBackdropSprites[2], x + var4 - (textBackdropSprites[2].pixelWidth >> 1), y, textBackdropSprites[2].pixelWidth >> 1, textBackdropSprites[2].pixelHeight >> 1);
          GradientUiRenderer.multiplyScaledSprite(textBackdropSprites[1], x + (textBackdropSprites[0].pixelWidth >> 1), y, var4 - textBackdropSprites[0].pixelWidth, textBackdropSprites[1].pixelHeight >> 1);
        } else {
          y -= 26;
          x -= 20;
          GradientUiRenderer.multiplySprite(textBackdropSprites[0], x, y);
          GradientUiRenderer.multiplySprite(textBackdropSprites[2], x + var4 - textBackdropSprites[2].pixelWidth, y);
          GradientUiRenderer.multiplyScaledSprite(textBackdropSprites[1], x + textBackdropSprites[0].pixelWidth, y, var4 - (textBackdropSprites[0].pixelWidth << 1), textBackdropSprites[1].pixelHeight);
        }
    }

    private final static void multiplyScaledPixels(int colourScratch, int backgroundScratch, int unusedScratch, int sourceX16, int[] source, int[] destination, int columnCounter, int sourceRowOffset, int negativeRows, int sourceY16, int destinationIndex, int destinationRowSkip, int width, int stepX16, int stepY16, int sourceWidth) {
        int writeIndex = 0;
        int rowStartX16;
        int productRed;
        int productGreen;
        int productBlue;
        rowStartX16 = sourceX16;
        while (negativeRows < 0) {
          sourceRowOffset = (sourceY16 >> 16) * sourceWidth;
          for (columnCounter = -width; columnCounter < 0; columnCounter++) {
            boolean advanceSourceAtEnd = true;
            colourScratch = source[(sourceX16 >> 16) + sourceRowOffset];
            if (colourScratch == 0) {
              destinationIndex++;
            } else {
              backgroundScratch = destination[destinationIndex];
              if (backgroundScratch != 0) {
                productRed = ((colourScratch & 16711680) >>> 16) * ((backgroundScratch & 16711680) >>> 16) >>> 8;
                productGreen = (colourScratch & 65280) * (backgroundScratch & 65280) >>> 24;
                productBlue = (colourScratch & 255) * (backgroundScratch & 255) >>> 8;
                writeIndex = destinationIndex;
                destinationIndex++;
                destination[writeIndex] = (productRed << 16) + (productGreen << 8) + productBlue;
                sourceX16 = sourceX16 + stepX16;
                advanceSourceAtEnd = false;
              }
              else {
                destinationIndex++;
              }
            }
            if (advanceSourceAtEnd) {
              sourceX16 = sourceX16 + stepX16;
            }
          }
          sourceY16 = sourceY16 + stepY16;
          sourceX16 = rowStartX16;
          destinationIndex = destinationIndex + destinationRowSkip;
          negativeRows++;
        }
    }

    final static void drawCenteredGradientText(String text, int centerX, int baselineY, int[] gradient, boolean halfSize) {
        centerX = centerX - (font.textWidth(text) >> (halfSize ? 2 : 1));
        GradientUiRenderer.drawGradientText(text, centerX, baselineY, gradient, halfSize);
    }

    final static int adjustBrightness(int colour, int brightness) {
        int additiveBrightness = 0;
        if (brightness > 256) {
          additiveBrightness = brightness - 256;
          brightness = 256;
        }
        int red = ((colour & 16711680) * brightness >> 8 & 16711680) + (additiveBrightness << 16);
        int green = ((colour & 65280) * brightness >> 8 & 65280) + (additiveBrightness << 8);
        int blue = ((colour & 255) * brightness >> 8 & 255) + additiveBrightness;
        if (red > 16711680) {
          red = 16711680;
        }
        if (green > 65280) {
          green = 65280;
        }
        if (blue > 255) {
          blue = 255;
        }
        return red | green | blue;
    }

    final static void drawGradientText(String text, int x, int baselineY, int[] gradient, boolean halfSize) {
        int textPixelWidth = 0;
        GradientUiRenderer.saveClip();
        int[] savedPixels = SoftwareRaster.pixels;
        int savedWidth = SoftwareRaster.width;
        int savedHeight = SoftwareRaster.height;
        if (textMask != null) {
          if (font == null) {
            return;
          }
          baselineY = baselineY - (font.baselineHeight - font.maxDescent);
          textPixelWidth = font.textWidth(text);
          if ((textPixelWidth & 1) == 1) {
            textPixelWidth++;
          }
          textMask.b();
          SoftwareRaster.b();
          font.drawText(text, 0, font.maxAscent + 3, 0, -1);
          SoftwareRaster.setTarget(savedPixels, savedWidth, savedHeight);
          GradientUiRenderer.restoreClip();
          if (halfSize) {
            GradientUiRenderer.drawHalfGradientMask(textMask, x, baselineY, textPixelWidth, gradient);
          } else {
            GradientUiRenderer.drawGradientMask(textMask, x, baselineY, textPixelWidth, gradient);
          }
          return;
        }
    }

    final static void multiplyScaledSprite(RgbSprite sprite, int x, int y, int width, int height) {
        int sourceWidth = 0;
        int sourceHeight = 0;
        int sourceX16 = 0;
        int sourceY16 = 0;
        int canvasWidth = 0;
        int canvasHeight = 0;
        int stepX16 = 0;
        int stepY16 = 0;
        int destinationRowSkip = 0;
        int offsetSkipX = 0;
        int clippedTop = 0;
        int offsetSkipY;
        int destinationIndex;
        int clippedRight;
        int clippedLeft;
        if (width > 0) {
          if (height <= 0) {
            return;
          }
          sourceWidth = sprite.pixelWidth;
          sourceHeight = sprite.pixelHeight;
          sourceX16 = 0;
          sourceY16 = 0;
          canvasWidth = sprite.canvasWidth;
          canvasHeight = sprite.canvasHeight;
          stepX16 = (canvasWidth << 16) / width;
          stepY16 = (canvasHeight << 16) / height;
          if (sprite.offsetX > 0) {
            offsetSkipX = ((sprite.offsetX << 16) + stepX16 - 1) / stepX16;
            x = x + offsetSkipX;
            sourceX16 = sourceX16 + (offsetSkipX * stepX16 - (sprite.offsetX << 16));
          }
          if (sprite.offsetY > 0) {
            offsetSkipY = ((sprite.offsetY << 16) + stepY16 - 1) / stepY16;
            y = y + offsetSkipY;
            sourceY16 = sourceY16 + (offsetSkipY * stepY16 - (sprite.offsetY << 16));
          }
          if (sourceWidth < canvasWidth) {
            width = ((sourceWidth << 16) - sourceX16 + stepX16 - 1) / stepX16;
          }
          if (sourceHeight < canvasHeight) {
            height = ((sourceHeight << 16) - sourceY16 + stepY16 - 1) / stepY16;
          }
          destinationIndex = x + y * SoftwareRaster.width;
          destinationRowSkip = SoftwareRaster.width - width;
          if (y + height > SoftwareRaster.clipBottom) {
            height = height - (y + height - SoftwareRaster.clipBottom);
          }
          if (y < SoftwareRaster.clipTop) {
            clippedTop = SoftwareRaster.clipTop - y;
            height = height - clippedTop;
            destinationIndex = destinationIndex + clippedTop * SoftwareRaster.width;
            sourceY16 = sourceY16 + stepY16 * clippedTop;
          }
          if (x + width > SoftwareRaster.clipRight) {
            clippedRight = x + width - SoftwareRaster.clipRight;
            width = width - clippedRight;
            destinationRowSkip = destinationRowSkip + clippedRight;
          }
          if (x < SoftwareRaster.clipLeft) {
            clippedLeft = SoftwareRaster.clipLeft - x;
            width = width - clippedLeft;
            destinationIndex = destinationIndex + clippedLeft;
            sourceX16 = sourceX16 + stepX16 * clippedLeft;
            destinationRowSkip = destinationRowSkip + clippedLeft;
          }
          GradientUiRenderer.multiplyScaledPixels(0, 0, 0, sourceX16, sprite.pixels, SoftwareRaster.pixels, 0, 0, -height, sourceY16, destinationIndex, destinationRowSkip, width, stepX16, stepY16, sourceWidth);
          return;
        }
    }

    final static void multiplySpriteWithOpacity(RgbSprite sprite, int x, int y, int opacity) {
        int clippedTop = 0;
        int clippedLeft;
        int clippedRight;
        x = x + sprite.offsetX;
        y = y + sprite.offsetY;
        int destinationIndex = x + y * SoftwareRaster.width;
        int sourceIndex = 0;
        int drawHeight = sprite.pixelHeight;
        int drawWidth = sprite.pixelWidth;
        int destinationRowSkip = SoftwareRaster.width - drawWidth;
        int sourceRowSkip = 0;
        if (y < SoftwareRaster.clipTop) {
          clippedTop = SoftwareRaster.clipTop - y;
          drawHeight = drawHeight - clippedTop;
          y = SoftwareRaster.clipTop;
          sourceIndex = sourceIndex + clippedTop * drawWidth;
          destinationIndex = destinationIndex + clippedTop * SoftwareRaster.width;
        }
        if (y + drawHeight > SoftwareRaster.clipBottom) {
          drawHeight = drawHeight - (y + drawHeight - SoftwareRaster.clipBottom);
        }
        if (x < SoftwareRaster.clipLeft) {
          clippedLeft = SoftwareRaster.clipLeft - x;
          drawWidth = drawWidth - clippedLeft;
          x = SoftwareRaster.clipLeft;
          sourceIndex = sourceIndex + clippedLeft;
          destinationIndex = destinationIndex + clippedLeft;
          sourceRowSkip = sourceRowSkip + clippedLeft;
          destinationRowSkip = destinationRowSkip + clippedLeft;
        }
        if (x + drawWidth > SoftwareRaster.clipRight) {
          clippedRight = x + drawWidth - SoftwareRaster.clipRight;
          drawWidth = drawWidth - clippedRight;
          sourceRowSkip = sourceRowSkip + clippedRight;
          destinationRowSkip = destinationRowSkip + clippedRight;
        }
        if (drawWidth > 0) {
          if (drawHeight <= 0) {
            return;
          }
          GradientUiRenderer.multiplyPixelsWithOpacity(0, SoftwareRaster.pixels, sprite.pixels, 0, sourceIndex, destinationIndex, drawWidth, drawHeight, destinationRowSkip, sourceRowSkip, opacity);
          return;
        }
    }

    final static void drawSolidText(String text, int x, int baselineY, int colour, boolean halfSize) {
        int textPixelWidth = 0;
        GradientUiRenderer.saveClip();
        int[] savedPixels = SoftwareRaster.pixels;
        int savedWidth = SoftwareRaster.width;
        int savedHeight = SoftwareRaster.height;
        if (textMask != null) {
          if (font == null) {
            return;
          }
          baselineY = baselineY - (font.maxAscent - font.maxDescent);
          textPixelWidth = font.textWidth(text);
          if ((textPixelWidth & 1) == 1) {
            textPixelWidth++;
          }
          textMask.b();
          SoftwareRaster.b();
          font.drawText(text, 0, font.maxAscent + 3, 0, -1);
          SoftwareRaster.setTarget(savedPixels, savedWidth, savedHeight);
          GradientUiRenderer.restoreClip();
          if (halfSize) {
            GradientUiRenderer.drawHalfSolidMask(textMask, x, baselineY, textPixelWidth, colour);
          } else {
            GradientUiRenderer.drawSolidMask(textMask, x, baselineY, textPixelWidth, colour);
          }
          return;
        }
    }

    final static void drawRightAlignedSolidText(String text, int rightX, int baselineY, int colour, boolean halfSize) {
        rightX = rightX - (font.textWidth(text) >> (halfSize ? 1 : 0));
        GradientUiRenderer.drawSolidText(text, rightX, baselineY, colour, halfSize);
    }

    final static RgbSprite[] bakeGradientFrameBorders(int unusedX, int unusedY, int width, int height, RgbSprite[] frameSprites, int[] gradient) {
        int row = 0;
        RgbSprite[] borderSprites;
        int sliceColumn;
        int sliceRowStart;
        int textureRow;
        int textureColumn;
        int unusedGradientColour;
        int gradientStep16;
        int gradientPosition16;
        int column;
        int spriteIndex;
        int pixelColour;
        int rowColour;
        borderSprites = new RgbSprite[4];
        borderSprites[0] = new RgbSprite(width, frameSprites[0].pixelHeight);
        borderSprites[3] = new RgbSprite(width, frameSprites[0].pixelHeight);
        borderSprites[1] = new RgbSprite(frameSprites[0].pixelWidth, height - frameSprites[0].pixelHeight * 2);
        borderSprites[2] = new RgbSprite(frameSprites[0].pixelWidth, height - frameSprites[0].pixelHeight * 2);
        textureRow = 0;
        textureColumn = 0;
        unusedGradientColour = 0;
        gradientStep16 = (gradient.length << 16) / height;
        gradientPosition16 = 0;
        for (row = 0; row < height; row++) {
          rowColour = gradient[gradientPosition16 >> 16];
          gradientPosition16 = gradientPosition16 + gradientStep16;
          if (row < frameSprites[0].pixelHeight) {
            sliceRowStart = 0;
            for (column = 0; column < width; column++) {
              if (column >= frameSprites[0].pixelWidth) {
                if (width - column > frameSprites[0].pixelWidth) {
                  sliceColumn = 1;
                } else {
                  if (width - column == frameSprites[0].pixelWidth) {
                    textureColumn = 0;
                  }
                  sliceColumn = 2;
                }
              } else {
                sliceColumn = 0;
              }
              spriteIndex = sliceColumn + sliceRowStart;
              pixelColour = frameSprites[spriteIndex].pixels[textureColumn % frameSprites[0].pixelWidth + textureRow % frameSprites[0].pixelHeight * frameSprites[0].pixelWidth];
              textureColumn++;
              if (pixelColour != 0) {
                if ((pixelColour & 65280) == pixelColour) {
                  pixelColour = GradientUiRenderer.shadeColour(rowColour, pixelColour >> 8, 0, 0);
                }
                borderSprites[0].pixels[column + row * width] = pixelColour;
              }
            }
          } else if (row < height - frameSprites[0].pixelHeight) {
            textureColumn = 0;
            for (column = 0; column < frameSprites[0].pixelWidth; column++) {
              spriteIndex = 3;
              pixelColour = frameSprites[spriteIndex].pixels[textureColumn % frameSprites[0].pixelWidth + textureRow % frameSprites[0].pixelHeight * frameSprites[0].pixelWidth];
              if (pixelColour != 0) {
                if ((pixelColour & 65280) == pixelColour) {
                  pixelColour = GradientUiRenderer.shadeColour(rowColour, pixelColour >> 8, 0, 0);
                }
                borderSprites[1].pixels[column + (row - frameSprites[0].pixelHeight) * frameSprites[0].pixelWidth] = pixelColour;
              }
              spriteIndex = 5;
              pixelColour = frameSprites[spriteIndex].pixels[textureColumn % frameSprites[0].pixelWidth + textureRow % frameSprites[0].pixelHeight * frameSprites[0].pixelWidth];
              if (pixelColour != 0) {
                if ((pixelColour & 65280) == pixelColour) {
                  pixelColour = GradientUiRenderer.shadeColour(rowColour, pixelColour >> 8, 0, 0);
                }
                borderSprites[2].pixels[column + (row - frameSprites[0].pixelHeight) * frameSprites[0].pixelWidth] = pixelColour;
              }
              textureColumn++;
            }
            textureRow++;
          } else {
            if (row == height - frameSprites[0].pixelHeight) {
              textureRow = 0;
            }
            sliceRowStart = 6;
            for (column = 0; column < width; column++) {
              if (column >= frameSprites[0].pixelWidth) {
                if (width - column > frameSprites[0].pixelWidth) {
                  sliceColumn = 1;
                } else {
                  if (width - column == frameSprites[0].pixelWidth) {
                    textureColumn = 0;
                  }
                  sliceColumn = 2;
                }
              } else {
                sliceColumn = 0;
              }
              spriteIndex = sliceColumn + sliceRowStart;
              pixelColour = frameSprites[spriteIndex].pixels[textureColumn % frameSprites[0].pixelWidth + textureRow % frameSprites[0].pixelHeight * frameSprites[0].pixelWidth];
              textureColumn++;
              if (pixelColour != 0) {
                if ((pixelColour & 65280) == pixelColour) {
                  pixelColour = GradientUiRenderer.shadeColour(rowColour, pixelColour >> 8, 0, 0);
                }
                borderSprites[3].pixels[column + (row - height + frameSprites[0].pixelHeight) * width] = pixelColour;
              }
            }
          }
          textureRow++;
        }
        return borderSprites;
    }

    final static void clearSentinelPixels(RgbSprite sprite) {
        int var1 = 0;
        if (sprite == null) {
          return;
        }
        if (sprite.pixels == null) {
          return;
        }
        for (var1 = 0; var1 < sprite.pixels.length; var1++) {
          if (sprite.pixels[var1] == 1) {
            sprite.pixels[var1] = 0;
          }
        }
    }

    private final static void drawTextBackdrop(String text, int x, int y) {
        GradientUiRenderer.drawTextBackdrop(text, x, y, false);
    }

    final static void resampleSpriteWithCarry(RgbSprite sprite, int sourceX16, int sourceY16, int destinationX, int destinationY, int copyWidth, int[] rowCarries) {
        Throwable decompiledCaughtException = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19_int = 0;
        Exception var19 = null;
        int var20 = 0;
        int var21 = 0;
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        int var14Lifetime1;
        if (fractionalColumnCarries == null ||
          fractionalColumnCarries.length != SoftwareRaster.width) {
          fractionalColumnCarries = new int[SoftwareRaster.width];
        }
        var7 = sourceY16 & 15;
        var8 = sourceX16 & 15;
        sourceY16 = sourceY16 >> 4;
        sourceX16 = sourceX16 >> 4;
        var15 = destinationX + destinationY * SoftwareRaster.width;
        var16 = SoftwareRaster.width - copyWidth;
        var17 = sourceY16 * sprite.pixelWidth + sourceX16;
        var18 = sprite.pixelWidth - copyWidth;
        try {
          var19_int = -SoftwareRaster.height;
          while (var19_int < 0) {
            var20 = rowCarries[-1 - var19_int];
            var21 = copyWidth - 1;
            while (var21 >= 0) {
              var9 = sprite.pixels[var17];
              var10 = var9 & 16711935;
              var11 = var9 & 65280;
              var13 = var10 * var8 & 267390960;
              var14 = var11 * var8 & 1044480;
              var12 = var13 | var14;
              var11Lifetime1 = var12 + var20;
              var20 = (var9 << 4) - var12;
              var10Lifetime1 = var11Lifetime1 & 267390960;
              var9Lifetime1 = var11Lifetime1 & 1044480;
              var13Lifetime1 = var10Lifetime1 * var7 & -16711936;
              var14Lifetime1 = var9Lifetime1 * var7 & 16711680;
              var12Lifetime1 = var13Lifetime1 | var14Lifetime1;
              SoftwareRaster.pixels[var15] = var12Lifetime1 + fractionalColumnCarries[var21] >> 8;
              fractionalColumnCarries[var21] = (var11Lifetime1 << 4) - var12Lifetime1;
              var21--;
              var15++;
              var17++;
            }
            var15 = var15 + var16;
            rowCarries[-1 - var19_int] = var20;
            var19_int++;
            var17 = var17 + var18;
          }
          return;
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var19 = (Exception) (Object) decompiledCaughtException;
          return;
        }
    }

    final static void drawFeatheredCircle(int centerX, int centerY, int radius, int colour) {
        int featherWidth;
        int outerSquared;
        int innerSquared;
        int featherSquaredBand;
        int left;
        int right;
        int top;
        int bottom;
        int circleClipLeft;
        int circleClipRight;
        int circleClipTop;
        int circleClipBottom;
        int deltaX;
        int deltaY;
        int distanceOrOpacity;
        int filledPixels;
        int destinationIndex;
        int destinationRowSkip;
        int y;
        int x;
        featherWidth = 1;
        outerSquared = radius * radius;
        innerSquared = (radius - featherWidth) * (radius - featherWidth);
        featherSquaredBand = outerSquared - innerSquared;
        left = centerX - radius - 1;
        right = centerX + radius + 1;
        if (left < SoftwareRaster.clipLeft) {
          left = SoftwareRaster.clipLeft;
        }
        if (left > SoftwareRaster.clipRight) {
          return;
        }
        if (right < SoftwareRaster.clipLeft) {
          return;
        }
        if (right > SoftwareRaster.clipRight) {
          right = SoftwareRaster.clipRight;
        }
        top = centerY - radius - 1;
        bottom = centerY + radius + 1;
        if (top < SoftwareRaster.clipTop) {
          top = SoftwareRaster.clipTop;
        }
        if (top > SoftwareRaster.clipBottom) {
          return;
        }
        if (bottom < SoftwareRaster.clipTop) {
          return;
        }
        if (bottom > SoftwareRaster.clipBottom) {
          bottom = SoftwareRaster.clipBottom;
        }
        if (circleClipRadius > 0) {
          circleClipLeft = circleClipCenterX - circleClipRadius;
          circleClipRight = circleClipCenterX + circleClipRadius;
          circleClipTop = circleClipCenterY - circleClipRadius;
          circleClipBottom = circleClipCenterY + circleClipRadius;
          if (left < circleClipLeft) {
            left = circleClipLeft;
          }
          if (left > circleClipRight) {
            return;
          }
          if (right < circleClipLeft) {
            return;
          }
          if (right > circleClipRight) {
            right = circleClipRight;
          }
          if (top < circleClipTop) {
            top = circleClipTop;
          }
          if (top > circleClipBottom) {
            return;
          }
          if (bottom < circleClipTop) {
            return;
          }
          if (bottom > circleClipBottom) {
            bottom = circleClipBottom;
          }
        }
        destinationIndex = left + top * SoftwareRaster.width;
        destinationRowSkip = SoftwareRaster.width + left - right;
        for (y = top; y < bottom; y++) {
          x = left;
          while (x < right) {
            boolean advanceDestination = true;
            boolean spanNotComplete = true;
            boolean spanWithinBounds = true;
            if (!GradientUiRenderer.outsideCircleClip(x, y)) {
              deltaX = centerX - x;
              deltaY = centerY - y;
              distanceOrOpacity = deltaX * deltaX + deltaY * deltaY;
              if (distanceOrOpacity < outerSquared) {
                if (distanceOrOpacity >= innerSquared) {
                  distanceOrOpacity = 256 - (distanceOrOpacity - innerSquared << 8) / featherSquaredBand;
                  SoftwareRaster.pixels[destinationIndex] = GradientUiRenderer.blendColours(SoftwareRaster.pixels[destinationIndex], colour, distanceOrOpacity);
                } else {
                  SoftwareRaster.pixels[destinationIndex] = colour;
                  if (deltaX > 0) {
                    filledPixels = 0;
                    while (true) {
                      if (filledPixels >= deltaX * 2) {
                        x--;
                        spanNotComplete = false;
                        break;
                      }
                      if (x >= right) {
                        x--;
                        spanWithinBounds = false;
                        break;
                      }
                      SoftwareRaster.pixels[destinationIndex] = colour;
                      destinationIndex++;
                      x++;
                      if (!GradientUiRenderer.outsideCircleClip(x, y)) {
                        filledPixels++;
                        continue;
                      }
                      break;
                    }
                    if ((spanNotComplete) &&
                      (spanWithinBounds)) {
                      x--;
                      advanceDestination = false;
                    }
                  }
                }
              }
            }
            if ((advanceDestination) &&
              (spanNotComplete) &&
              (spanWithinBounds)) {
              destinationIndex++;
            }
            x++;
          }
          destinationIndex = destinationIndex + destinationRowSkip;
        }
        return;
    }

    final static void drawCenteredSolidText(String text, int centerX, int baselineY, int colour, boolean halfSize) {
        centerX = centerX - (font.textWidth(text) >> (halfSize ? 2 : 1));
        GradientUiRenderer.drawSolidText(text, centerX, baselineY, colour, halfSize);
    }

    private final static int blendColours(int background, int colour, int opacity) {
        if (opacity < 1) {
          return background;
        }
        if (opacity > 255) {
          return colour;
        }
        int backgroundRedBlue = background & 16711935;
        int backgroundGreen = background & 65280;
        int colourRedBlue = colour & 16711935;
        int colourGreen = colour & 65280;
        int inverseOpacity = 256 - opacity;
        return backgroundRedBlue * inverseOpacity + colourRedBlue * opacity >> 8 & 16711935 | backgroundGreen * inverseOpacity + colourGreen * opacity >> 8 & 65280;
    }

    public static void releaseCaches() {
        particlePalettes = (int[][]) null;
        textBackdropSprites = null;
        font = null;
        textMask = null;
        wrapWidths = null;
        wrappedLines = null;
        fractionalColumnCarries = null;
    }

    final static void drawSolidMask(RgbSprite mask, int x, int y, int width, int colour) {
        int row = 0;
        int column = 0;
        int sourceIndex;
        y -= 3;
        x = x + mask.offsetX;
        y = y + mask.offsetY;
        sourceIndex = 0;
        for (row = 0; row < mask.pixelHeight; row++) {
          for (column = 0; column < width; column++) {
            if (mask.pixels[sourceIndex] > 0) {
              GradientUiRenderer.blendPixel(x + column, y + row, colour, mask.pixels[sourceIndex] & 255);
            }
            sourceIndex++;
          }
          sourceIndex = sourceIndex + (mask.pixelWidth - width);
        }
    }

    private final static void multiplyPixels(int backgroundScratch, int[] destination, int[] source, int colourScratch, int sourceIndex, int destinationIndex, int width, int height, int destinationRowSkip, int sourceRowSkip) {
        int row = 0;
        int column = 0;
        int writeIndex = 0;
        int productRed;
        int productGreen;
        int productBlue;
        for (row = -height; row < 0; row++) {
          for (column = -width; column < 0; column++) {
            colourScratch = source[sourceIndex++];
            if (colourScratch != 0) {
              backgroundScratch = destination[destinationIndex];
              if (backgroundScratch != 0) {
                productRed = ((colourScratch & 16711680) >>> 16) * ((backgroundScratch & 16711680) >>> 16) >>> 8;
                productGreen = (colourScratch & 65280) * (backgroundScratch & 65280) >>> 24;
                productBlue = (colourScratch & 255) * (backgroundScratch & 255) >>> 8;
                writeIndex = destinationIndex;
                destinationIndex++;
                destination[writeIndex] = (productRed << 16) + (productGreen << 8) + productBlue;
              } else {
                destinationIndex++;
              }
            } else {
              destinationIndex++;
            }
          }
          destinationIndex = destinationIndex + destinationRowSkip;
          sourceIndex = sourceIndex + sourceRowSkip;
        }
    }

    final static void drawWrappedCenteredTextBackdrop(String text, int centerX, int y, int wrapWidth, boolean halfSize) {
        int var7 = 0;
        wrapWidths[0] = wrapWidth << (halfSize ? 1 : 0);
        int var5 = font.wrapLines(text, wrapWidths, wrappedLines);
        int var6 = font.baselineHeight >> (halfSize ? 1 : 0);
        for (var7 = 0; var7 < var5; var7++) {
          GradientUiRenderer.drawCenteredTextBackdrop(wrappedLines[var7], centerX, y + var6 * var7, halfSize);
        }
    }

    final static int scaleColour(int colour, int scale) {
        int scaledRedBlue = (colour & 16711935) * scale >>> 8;
        int scaledGreen = (colour & 65280) * scale >>> 8;
        return scaledRedBlue & 16711935 | scaledGreen & 65280;
    }

    final static void drawParticleRings(int centerX, int centerY, int paletteIndex, int particleCount, int phasePercent) {
        int var5 = 15;
        int var6 = 64;
        GradientUiRenderer.drawParticleRings(centerX, centerY, paletteIndex, particleCount, phasePercent, var5, var6);
    }

    private final static void saveClip() {
        savedClipLeft = SoftwareRaster.clipLeft;
        savedClipTop = SoftwareRaster.clipTop;
        savedClipRight = SoftwareRaster.clipRight;
        savedClipBottom = SoftwareRaster.clipBottom;
    }

    private final static void blendPixel(int x, int y, int colour, int opacity) {
        if (x < SoftwareRaster.clipLeft) {
          return;
        }
        if (x >= SoftwareRaster.clipRight) {
          return;
        }
        if (y < SoftwareRaster.clipTop) {
          return;
        }
        if (y >= SoftwareRaster.clipBottom) {
          return;
        }
        int greenTerm = colour & 65280;
        colour = colour & 16711935;
        greenTerm = greenTerm * opacity;
        colour = colour * opacity;
        greenTerm = greenTerm & 16711680;
        colour = colour & -16711936;
        int destinationIndex = SoftwareRaster.width * y + x;
        int backgroundColour = SoftwareRaster.pixels[destinationIndex];
        greenTerm = greenTerm + ((backgroundColour & 65280) * (256 - opacity) & 16711680);
        colour = colour + ((backgroundColour & 16711935) * (256 - opacity) & -16711936);
        SoftwareRaster.pixels[destinationIndex] = (colour | greenTerm) >>> 8;
    }

    final static void multiplySprite(RgbSprite sprite, int x, int y) {
        int clippedTop = 0;
        int clippedLeft;
        int clippedRight;
        x = x + sprite.offsetX;
        y = y + sprite.offsetY;
        int destinationIndex = x + y * SoftwareRaster.width;
        int sourceIndex = 0;
        int drawHeight = sprite.pixelHeight;
        int drawWidth = sprite.pixelWidth;
        int destinationRowSkip = SoftwareRaster.width - drawWidth;
        int sourceRowSkip = 0;
        if (y < SoftwareRaster.clipTop) {
          clippedTop = SoftwareRaster.clipTop - y;
          drawHeight = drawHeight - clippedTop;
          y = SoftwareRaster.clipTop;
          sourceIndex = sourceIndex + clippedTop * drawWidth;
          destinationIndex = destinationIndex + clippedTop * SoftwareRaster.width;
        }
        if (y + drawHeight > SoftwareRaster.clipBottom) {
          drawHeight = drawHeight - (y + drawHeight - SoftwareRaster.clipBottom);
        }
        if (x < SoftwareRaster.clipLeft) {
          clippedLeft = SoftwareRaster.clipLeft - x;
          drawWidth = drawWidth - clippedLeft;
          x = SoftwareRaster.clipLeft;
          sourceIndex = sourceIndex + clippedLeft;
          destinationIndex = destinationIndex + clippedLeft;
          sourceRowSkip = sourceRowSkip + clippedLeft;
          destinationRowSkip = destinationRowSkip + clippedLeft;
        }
        if (x + drawWidth > SoftwareRaster.clipRight) {
          clippedRight = x + drawWidth - SoftwareRaster.clipRight;
          drawWidth = drawWidth - clippedRight;
          sourceRowSkip = sourceRowSkip + clippedRight;
          destinationRowSkip = destinationRowSkip + clippedRight;
        }
        if (drawWidth > 0) {
          if (drawHeight <= 0) {
            return;
          }
          GradientUiRenderer.multiplyPixels(0, SoftwareRaster.pixels, sprite.pixels, 0, sourceIndex, destinationIndex, drawWidth, drawHeight, destinationRowSkip, sourceRowSkip);
          return;
        }
    }

    private final static void drawHalfGradientMask(RgbSprite mask, int x, int y, int width, int[] gradient) {
        int row = 0;
        int column = 0;
        int topFirstIndex = 0;
        int topSecondIndex = 0;
        int bottomFirstIndex = 0;
        int bottomSecondIndex = 0;
        int topRowIndex;
        int bottomRowIndex;
        int rowColour;
        int coverage;
        y -= 3;
        if (width > mask.pixelWidth) {
          width = mask.pixelWidth;
        }
        topRowIndex = 0;
        bottomRowIndex = mask.pixelWidth;
        for (row = 0; row < mask.pixelHeight >> 1; row++) {
          rowColour = gradient[row * gradient.length / (mask.pixelHeight >> 1)];
          for (column = 0; column < width >> 1; column++) {
            topFirstIndex = topRowIndex;
            topRowIndex++;
            coverage = mask.pixels[topFirstIndex] & 255;
            topSecondIndex = topRowIndex;
            topRowIndex++;
            coverage = coverage + (mask.pixels[topSecondIndex] & 255);
            bottomFirstIndex = bottomRowIndex;
            bottomRowIndex++;
            coverage = coverage + (mask.pixels[bottomFirstIndex] & 255);
            bottomSecondIndex = bottomRowIndex;
            bottomRowIndex++;
            coverage = coverage + (mask.pixels[bottomSecondIndex] & 255);
            coverage = coverage >> 2;
            if (coverage > 0) {
              GradientUiRenderer.blendPixel(x + column, y + row, rowColour, coverage);
            }
          }
          topRowIndex = topRowIndex + (mask.pixelWidth - width);
          topRowIndex = topRowIndex + mask.pixelWidth;
          bottomRowIndex = bottomRowIndex + (mask.pixelWidth - width);
          bottomRowIndex = bottomRowIndex + mask.pixelWidth;
        }
    }

    private final static void restoreClip() {
        SoftwareRaster.clipLeft = savedClipLeft;
        SoftwareRaster.clipTop = savedClipTop;
        SoftwareRaster.clipRight = savedClipRight;
        SoftwareRaster.clipBottom = savedClipBottom;
    }

    private final static void drawHalfSolidMask(RgbSprite mask, int x, int y, int width, int colour) {
        int row = 0;
        int column = 0;
        int topFirstIndex = 0;
        int topSecondIndex = 0;
        int bottomFirstIndex = 0;
        int bottomSecondIndex = 0;
        int topRowIndex;
        int bottomRowIndex;
        int coverage;
        y -= 3;
        if (width > mask.pixelWidth) {
          width = mask.pixelWidth;
        }
        topRowIndex = 0;
        bottomRowIndex = mask.pixelWidth;
        for (row = 0; row < mask.pixelHeight >> 1; row++) {
          for (column = 0; column < width >> 1; column++) {
            topFirstIndex = topRowIndex;
            topRowIndex++;
            coverage = mask.pixels[topFirstIndex] & 255;
            topSecondIndex = topRowIndex;
            topRowIndex++;
            coverage = coverage + (mask.pixels[topSecondIndex] & 255);
            bottomFirstIndex = bottomRowIndex;
            bottomRowIndex++;
            coverage = coverage + (mask.pixels[bottomFirstIndex] & 255);
            bottomSecondIndex = bottomRowIndex;
            bottomRowIndex++;
            coverage = coverage + (mask.pixels[bottomSecondIndex] & 255);
            coverage = coverage >> 2;
            if (coverage > 0) {
              GradientUiRenderer.blendPixel(x + column, y + row, colour, coverage);
            }
          }
          topRowIndex = topRowIndex + (mask.pixelWidth - width);
          topRowIndex = topRowIndex + mask.pixelWidth;
          bottomRowIndex = bottomRowIndex + (mask.pixelWidth - width);
          bottomRowIndex = bottomRowIndex + mask.pixelWidth;
        }
    }

    final static void drawAlignedGradientText(String text, int x, int baselineY, int[] gradient, int alignment, boolean halfSize) {
        if (alignment != 0) {
          if (alignment != 1) {
            if (alignment != 2) {
              return;
            }
            GradientUiRenderer.drawRightAlignedGradientText(text, x, baselineY, gradient, halfSize);
          } else {
            GradientUiRenderer.drawCenteredTextBackdrop(text, x, baselineY, halfSize);
            GradientUiRenderer.drawCenteredGradientText(text, x, baselineY, gradient, halfSize);
          }
        } else {
          GradientUiRenderer.drawTextBackdrop(text, x, baselineY, halfSize);
          GradientUiRenderer.drawGradientText(text, x, baselineY, gradient, halfSize);
        }
    }

    final static void drawWrappedCenteredSolidText(String text, int centerX, int baselineY, int wrapWidth, int colour, boolean halfSize) {
        int var8 = 0;
        wrapWidths[0] = wrapWidth << (halfSize ? 1 : 0);
        int var6 = font.wrapLines(text, wrapWidths, wrappedLines);
        int var7 = font.baselineHeight >> (halfSize ? 1 : 0);
        for (var8 = 0; var8 < var6; var8++) {
          GradientUiRenderer.drawCenteredSolidText(wrappedLines[var8], centerX, baselineY + var7 * var8, colour, halfSize);
        }
    }

    final static void drawGradientFrame(int x, int y, int width, int height, RgbSprite[] frameSprites, int[] gradient, int underlayColour, int underlayOpacity, boolean fillCenter) {
        int row = 0;
        int textureRow;
        int unusedGradientColour;
        int gradientStep16;
        int gradientPosition16;
        int tileWidth;
        int tileHeight;
        int spriteIndex;
        int columnCounter;
        int centerWidth;
        int destinationX;
        int sliceColumn;
        int sourceIndex;
        int pixelColour;
        int rowColour;
        if (underlayOpacity > 0) {
          SoftwareRaster.b(x, y, width, height, underlayColour, underlayOpacity);
        }
        if (x >= SoftwareRaster.clipLeft &&
          y >= SoftwareRaster.clipTop &&
          x + width < SoftwareRaster.clipRight &&
          y + height < SoftwareRaster.clipBottom) {
          GradientUiRenderer.drawUnclippedGradientFrame(x, y, width, height, frameSprites, gradient, fillCenter);
          return;
        }
        textureRow = 0;
        unusedGradientColour = 0;
        gradientStep16 = (gradient.length << 16) / height;
        gradientPosition16 = 0;
        tileWidth = frameSprites[0].pixelWidth;
        tileHeight = frameSprites[0].pixelHeight;
        for (row = 0; row < height; row++) {
          if (row >= tileHeight) {
            if (height - row > tileHeight) {
              spriteIndex = 3;
            } else {
              spriteIndex = 6;
              if (height - row == tileHeight) {
                textureRow = 0;
              }
            }
          } else {
            spriteIndex = 0;
          }
          rowColour = gradient[gradientPosition16 >> 16];
          gradientPosition16 = gradientPosition16 + gradientStep16;
          destinationX = x;
          sliceColumn = 0;
          while (sliceColumn < 3) {
            sourceIndex = textureRow % tileHeight * tileWidth;
            if (sliceColumn != 1) {
              columnCounter = -tileWidth;
              while (columnCounter < 0) {
                pixelColour = frameSprites[spriteIndex].pixels[sourceIndex];
                if (pixelColour != 0) {
                  if ((pixelColour & -65281) == 0) {
                    pixelColour = GradientUiRenderer.shadeColour(rowColour, pixelColour >> 8, 0, 0);
                  }
                  SoftwareRaster.a(destinationX, y + row, pixelColour);
                }
                columnCounter++;
                sourceIndex++;
                destinationX++;
              }
            } else {
              centerWidth = width - (tileWidth << 1);
              if (spriteIndex == 4 &&
                !fillCenter) {
                destinationX = destinationX + centerWidth;
              } else {
                pixelColour = frameSprites[spriteIndex].pixels[sourceIndex];
                if (pixelColour != 0) {
                  columnCounter = -centerWidth;
                  while (columnCounter < 0) {
                    if ((pixelColour & -65281) == 0) {
                      pixelColour = GradientUiRenderer.shadeColour(rowColour, pixelColour >> 8, 0, 0);
                    }
                    SoftwareRaster.a(destinationX, y + row, pixelColour);
                    columnCounter++;
                    destinationX++;
                  }
                } else {
                  destinationX = destinationX + centerWidth;
                }
              }
            }
            sliceColumn++;
            spriteIndex++;
          }
          textureRow++;
        }
    }

    final static void drawCenteredTextBackdrop(String text, int centerX, int y, boolean halfSize) {
        centerX = centerX - (font.textWidth(text) >> (halfSize ? 2 : 1));
        GradientUiRenderer.drawTextBackdrop(text, centerX, y, halfSize);
    }

    final static void installFont(PalettedBitmapFont newFont) {
        font = newFont;
        int maskWidth = 1000;
        int maskHeight = font.baselineHeight + font.maxDescent + 6;
        if ((maskHeight & 1) == 1) {
          maskHeight++;
        }
        textMask = new RgbSprite(maskWidth, maskHeight);
    }

    final static void drawTitledGradientFrame(int x, int y, int width, int height, RgbSprite[] frameSprites, int[] gradient, int underlayColour, int underlayOpacity, String title, boolean halfSize, int[] textGradient) {
        GradientUiRenderer.drawHollowGradientFrame(x, y, width, height, frameSprites, gradient, underlayColour, underlayOpacity);
        int titleCenterX = x + width / 2;
        int titleBaselineY = y + font.baselineHeight / (halfSize ? 2 : 1) - 4;
        GradientUiRenderer.drawAlignedGradientText(title, titleCenterX, titleBaselineY, textGradient, 1, halfSize);
    }

    final static void drawWrappedCenteredGradientText(String text, int centerX, int baselineY, int wrapWidth, int[] gradient, boolean halfSize) {
        GradientUiRenderer.drawWrappedCenteredGradientText(text, centerX, baselineY, wrapWidth, gradient, halfSize, 0, 0);
    }

    final static void drawCenteredTextBackdrop(String text, int centerX, int y) {
        centerX = centerX - (font.textWidth(text) >> 1);
        GradientUiRenderer.drawTextBackdrop(text, centerX, y);
    }

    private final static int shadeColour(int colour, int shade, int redBlueScratch, int greenScratch) {
        int inverseWhiteMix = 0;
        redBlueScratch = colour & 16711935;
        greenScratch = colour & 65280;
        if (shade < 128) {
          colour = (redBlueScratch * shade & 2139127680 | greenScratch * shade & 8355840) >>> 7;
        } else {
          shade -= 128;
          inverseWhiteMix = 256 - shade;
          redBlueScratch = redBlueScratch * inverseWhiteMix;
          greenScratch = greenScratch * inverseWhiteMix;
          redBlueScratch = redBlueScratch + 16711935 * shade;
          greenScratch = greenScratch + 65280 * shade;
          colour = (redBlueScratch & -16711936 | greenScratch & 16711680) >>> 8;
        }
        return colour;
    }

    final static void drawHollowGradientFrame(int x, int y, int width, int height, RgbSprite[] frameSprites, int[] gradient, int underlayColour, int underlayOpacity) {
        GradientUiRenderer.drawGradientFrame(x, y, width, height, frameSprites, gradient, underlayColour, underlayOpacity, false);
    }

    private final static void multiplyPixelsWithOpacity(int backgroundScratch, int[] destination, int[] source, int colourScratch, int sourceIndex, int destinationIndex, int width, int height, int destinationRowSkip, int sourceRowSkip, int opacity) {
        int row = 0;
        int column = 0;
        int writeIndex = 0;
        int blendedRed;
        int blendedGreen;
        int blendedBlue;
        for (row = -height; row < 0; row++) {
          for (column = -width; column < 0; column++) {
            colourScratch = source[sourceIndex++];
            if (colourScratch != 0) {
              backgroundScratch = destination[destinationIndex];
              if (backgroundScratch != 0) {
                blendedRed = ((colourScratch & 16711680) >>> 16) * ((backgroundScratch & 16711680) >>> 16) >>> 8;
                blendedGreen = (colourScratch & 65280) * (backgroundScratch & 65280) >>> 24;
                blendedBlue = (colourScratch & 255) * (backgroundScratch & 255) >>> 8;
                blendedRed = blendedRed * opacity + ((backgroundScratch & 16711680) >>> 16) * (256 - opacity) >> 8;
                blendedGreen = blendedGreen * opacity + ((backgroundScratch & 65280) >>> 8) * (256 - opacity) >> 8;
                blendedBlue = blendedBlue * opacity + (backgroundScratch & 255) * (256 - opacity) >> 8;
                writeIndex = destinationIndex;
                destinationIndex++;
                destination[writeIndex] = (blendedRed << 16) + (blendedGreen << 8) + blendedBlue;
              } else {
                destinationIndex++;
              }
            } else {
              destinationIndex++;
            }
          }
          destinationIndex = destinationIndex + destinationRowSkip;
          sourceIndex = sourceIndex + sourceRowSkip;
        }
    }

    private final static void drawGradientMask(RgbSprite mask, int x, int y, int width, int[] gradient) {
        int row = 0;
        int column = 0;
        int sourceIndex;
        int rowColour;
        y -= 3;
        sourceIndex = 0;
        if (width > mask.pixelWidth) {
          width = mask.pixelWidth;
        }
        for (row = 0; row < mask.pixelHeight; row++) {
          rowColour = gradient[row * gradient.length / mask.pixelHeight];
          for (column = 0; column < width; column++) {
            if (mask.pixels[sourceIndex] > 0) {
              GradientUiRenderer.blendPixel(x + column, y + row, rowColour, mask.pixels[sourceIndex] & 255);
            }
            sourceIndex++;
          }
          sourceIndex = sourceIndex + (mask.pixelWidth - width);
        }
    }

    static {
        particlePhasePercent = 0;
        wrappedLines = new String[20];
        circleClipRadius = -1;
        wrapWidths = new int[]{0};
    }
}
