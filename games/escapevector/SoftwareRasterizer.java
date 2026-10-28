/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SoftwareRasterizer {
    static int height;
    static int[] maskStarts;
    static int clipBottom;
    private static int[] field_h;
    static int clipRight;
    private static int[] field_g;
    static int clipTop;
    static int width;
    static int clipLeft;
    static int[] maskWidths;
    private static int[] field_e;
    static int[] pixels;

    final static void saveClip(int[] bounds) {
        bounds[0] = clipLeft;
        bounds[1] = clipTop;
        bounds[2] = clipRight;
        bounds[3] = clipBottom;
    }

    final static void fillCircleAlpha(int centerX, int centerY, int radius, int color, int alpha) {
        if (alpha == 0) {
          return;
        }
        if (alpha == 256) {
          SoftwareRasterizer.fillCircle(centerX, centerY, radius, color);
          return;
        }
        if (radius < 0) {
          radius = -radius;
        }
        int var5 = 256 - alpha;
        int var6 = (color >> 16 & 255) * alpha;
        int var7 = (color >> 8 & 255) * alpha;
        int var8 = (color & 255) * alpha;
        int var12 = centerY - radius;
        if (var12 < clipTop) {
          var12 = clipTop;
        }
        int var13 = centerY + radius + 1;
        if (var13 > clipBottom) {
          var13 = clipBottom;
        }
        int var14 = var12;
        int var15 = radius * radius;
        int var16 = 0;
        int var17 = centerY - var14;
        int var18 = var17 * var17;
        int var19 = var18 - var17;
        if (centerY > var13) {
          centerY = var13;
        }
        while (var14 < centerY) {
          while (true) {
            if (var19 > var15 &&
              var18 > var15) {
              int var20 = centerX - var16 + 1;
              if (var20 < clipLeft) {
                var20 = clipLeft;
              }
              int var21 = centerX + var16;
              if (var21 > clipRight) {
                var21 = clipRight;
              }
              int var22 = var20 + var14 * width;
              for (int var23 = var20; var23 < var21; var23++) {
                int var9 = (pixels[var22] >> 16 & 255) * var5;
                int var10 = (pixels[var22] >> 8 & 255) * var5;
                int var11 = (pixels[var22] & 255) * var5;
                int var24 = (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8) + (var8 + var11 >> 8);
                int incrementValue$4 = var22;
                var22++;
                pixels[incrementValue$4] = var24;
              }
              var14++;
              int incrementValue$3 = var17;
              var17--;
              var18 = var18 - (incrementValue$3 + var17);
              var19 = var19 - (var17 + var17);
              break;
            }
            var18 = var18 + (var16 + var16);
            int incrementValue$5 = var16;
            var16++;
            var19 = var19 + (incrementValue$5 + var16);
          }
        }
        int var16Lifetime1 = radius;
        var17 = -var17;
        int var19Lifetime1 = var17 * var17 + var15;
        int var18Lifetime1 = var19Lifetime1 - var16Lifetime1;
        var19Lifetime1 = var19Lifetime1 - var17;
        while (var14 < var13) {
          while (var19Lifetime1 > var15) {
            if (var18Lifetime1 > var15) {
              int incrementValue$0 = var16Lifetime1;
              var16Lifetime1--;
              var19Lifetime1 = var19Lifetime1 - (incrementValue$0 + var16Lifetime1);
              var18Lifetime1 = var18Lifetime1 - (var16Lifetime1 + var16Lifetime1);
              continue;
            }
            break;
          }
          int var20Lifetime1 = centerX - var16Lifetime1;
          if (var20Lifetime1 < clipLeft) {
            var20Lifetime1 = clipLeft;
          }
          int var21Lifetime1 = centerX + var16Lifetime1;
          if (var21Lifetime1 > clipRight - 1) {
            var21Lifetime1 = clipRight - 1;
          }
          int var25 = var20Lifetime1 + var14 * width;
          int var22Lifetime1 = var25;
          for (int var23Lifetime1 = var20Lifetime1; var23Lifetime1 <= var21Lifetime1; var23Lifetime1++) {
            int var9Lifetime1 = (pixels[var25] >> 16 & 255) * var5;
            int var10Lifetime1 = (pixels[var25] >> 8 & 255) * var5;
            int var11Lifetime1 = (pixels[var25] & 255) * var5;
            int var24Lifetime1 = (var6 + var9Lifetime1 >> 8 << 16) + (var7 + var10Lifetime1 >> 8 << 8) + (var8 + var11Lifetime1 >> 8);
            int incrementValue$2 = var25;
            var25++;
            pixels[incrementValue$2] = var24Lifetime1;
          }
          var14++;
          var19Lifetime1 = var19Lifetime1 + (var17 + var17);
          int incrementValue$1 = var17;
          var17++;
          var18Lifetime1 = var18Lifetime1 + (incrementValue$1 + var17);
        }
        return;
    }

    final static void fillRectangleAlpha(int x, int y, int rectangleWidth, int rectangleHeight, int color, int alpha) {
        if (x < clipLeft) {
          rectangleWidth = rectangleWidth - (clipLeft - x);
          x = clipLeft;
        }
        if (y < clipTop) {
          rectangleHeight = rectangleHeight - (clipTop - y);
          y = clipTop;
        }
        if (x + rectangleWidth > clipRight) {
          rectangleWidth = clipRight - x;
        }
        if (y + rectangleHeight > clipBottom) {
          rectangleHeight = clipBottom - y;
        }
        color = ((color & 16711935) * alpha >> 8 & 16711935) + ((color & 65280) * alpha >> 8 & 65280);
        int var6 = 256 - alpha;
        int var7 = width - rectangleWidth;
        int var8 = x + y * width;
        for (int var9 = 0; var9 < rectangleHeight; var9++) {
          for (int var10 = -rectangleWidth; var10 < 0; var10++) {
            int var11 = pixels[var8];
            var11 = ((var11 & 16711935) * var6 >> 8 & 16711935) + ((var11 & 65280) * var6 >> 8 & 65280);
            int incrementValue$0 = var8;
            var8++;
            pixels[incrementValue$0] = color + var11;
          }
          var8 = var8 + var7;
        }
    }

    private final static void drawVerticalLineAlpha(int x, int y, int length, int color, int alpha) {
        if (x >= clipLeft) {
          if (x >= clipRight) {
            return;
          }
          if (y < clipTop) {
            length = length - (clipTop - y);
            y = clipTop;
          }
          if (y + length > clipBottom) {
            length = clipBottom - y;
          }
          int var5 = 256 - alpha;
          int var6 = (color >> 16 & 255) * alpha;
          int var7 = (color >> 8 & 255) * alpha;
          int var8 = (color & 255) * alpha;
          int var12 = x + y * width;
          for (int var13 = 0; var13 < length; var13++) {
            int var9 = (pixels[var12] >> 16 & 255) * var5;
            int var10 = (pixels[var12] >> 8 & 255) * var5;
            int var11 = (pixels[var12] & 255) * var5;
            int var14 = (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8) + (var8 + var11 >> 8);
            pixels[var12] = var14;
            var12 = var12 + width;
          }
          return;
        }
    }

    final static void bind(int[] framebuffer, int framebufferWidth, int framebufferHeight) {
        pixels = framebuffer;
        width = framebufferWidth;
        height = framebufferHeight;
        SoftwareRasterizer.setClip(0, 0, framebufferWidth, framebufferHeight);
    }

    final static void resetClip() {
        clipLeft = 0;
        clipTop = 0;
        clipRight = width;
        clipBottom = height;
        SoftwareRasterizer.clearMask();
    }

    final static void fillVerticalGradient(int x, int y, int rectangleWidth, int rectangleHeight, int topColor, int bottomColor) {
        int var6 = 0;
        int var7 = 65536 / rectangleHeight;
        if (x < clipLeft) {
          rectangleWidth = rectangleWidth - (clipLeft - x);
          x = clipLeft;
        }
        if (y < clipTop) {
          var6 = var6 + (clipTop - y) * var7;
          rectangleHeight = rectangleHeight - (clipTop - y);
          y = clipTop;
        }
        if (x + rectangleWidth > clipRight) {
          rectangleWidth = clipRight - x;
        }
        if (y + rectangleHeight > clipBottom) {
          rectangleHeight = clipBottom - y;
        }
        int var8 = width - rectangleWidth;
        int var9 = x + y * width;
        for (int var10 = -rectangleHeight; var10 < 0; var10++) {
          int var11 = 65536 - var6 >> 8;
          int var12 = var6 >> 8;
          int var13 = ((topColor & 16711935) * var11 + (bottomColor & 16711935) * var12 & -16711936) + ((topColor & 65280) * var11 + (bottomColor & 65280) * var12 & 16711680) >>> 8;
          for (int var14 = -rectangleWidth; var14 < 0; var14++) {
            int incrementValue$0 = var9;
            var9++;
            pixels[incrementValue$0] = var13;
          }
          var9 = var9 + var8;
          var6 = var6 + var7;
        }
    }

    final static void blurRectangle(int horizontalRadius, int verticalRadius, int x, int y, int rectangleWidth, int rectangleHeight) {
        SoftwareRasterizer.blurHorizontal(pixels, 0, x + y * width, horizontalRadius, x, rectangleWidth, width - rectangleWidth, rectangleHeight);
        SoftwareRasterizer.blurVertical(pixels, 0, x + y * width, verticalRadius, y, rectangleHeight, width - rectangleWidth, x, rectangleWidth);
    }

    final static void drawDropShadow(int x, int y, int rectangleWidth, int rectangleHeight, int color) {
        for (int var6 = 0; var6 < 4; var6++) {
          int var5 = 128 - (var6 << 5);
          SoftwareRasterizer.drawHorizontalLineAlpha(x + var6, y + rectangleHeight + var6, rectangleWidth, color, var5);
          SoftwareRasterizer.drawVerticalLineAlpha(x + rectangleWidth + var6, y + var6, rectangleHeight + 1, color, var5);
        }
    }

    final static void drawRectangle(int x, int y, int rectangleWidth, int rectangleHeight, int color) {
        SoftwareRasterizer.drawHorizontalLine(x, y, rectangleWidth, color);
        SoftwareRasterizer.drawHorizontalLine(x, y + rectangleHeight - 1, rectangleWidth, color);
        SoftwareRasterizer.drawVerticalLine(x, y, rectangleHeight, color);
        SoftwareRasterizer.drawVerticalLine(x + rectangleWidth - 1, y, rectangleHeight, color);
    }

    private final static void drawHorizontalLineAlpha(int x, int y, int length, int color, int alpha) {
        if (y >= clipTop) {
          if (y >= clipBottom) {
            return;
          }
          if (x < clipLeft) {
            length = length - (clipLeft - x);
            x = clipLeft;
          }
          if (x + length > clipRight) {
            length = clipRight - x;
          }
          int var5 = 256 - alpha;
          int var6 = (color >> 16 & 255) * alpha;
          int var7 = (color >> 8 & 255) * alpha;
          int var8 = (color & 255) * alpha;
          int var12 = x + y * width;
          for (int var13 = 0; var13 < length; var13++) {
            int var9 = (pixels[var12] >> 16 & 255) * var5;
            int var10 = (pixels[var12] >> 8 & 255) * var5;
            int var11 = (pixels[var12] & 255) * var5;
            int var14 = (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8) + (var8 + var11 >> 8);
            int incrementValue$0 = var12;
            var12++;
            pixels[incrementValue$0] = var14;
          }
          return;
        }
    }

    final static void fillRectangle(int x, int y, int rectangleWidth, int rectangleHeight, int color) {
        if (x < clipLeft) {
          rectangleWidth = rectangleWidth - (clipLeft - x);
          x = clipLeft;
        }
        if (y < clipTop) {
          rectangleHeight = rectangleHeight - (clipTop - y);
          y = clipTop;
        }
        if (x + rectangleWidth > clipRight) {
          rectangleWidth = clipRight - x;
        }
        if (y + rectangleHeight > clipBottom) {
          rectangleHeight = clipBottom - y;
        }
        int var5 = width - rectangleWidth;
        int var6 = x + y * width;
        for (int var7 = -rectangleHeight; var7 < 0; var7++) {
          for (int var8 = -rectangleWidth; var8 < 0; var8++) {
            int incrementValue$0 = var6;
            var6++;
            pixels[incrementValue$0] = color;
          }
          var6 = var6 + var5;
        }
    }

    private final static void clearMask() {
        maskStarts = null;
        maskWidths = null;
    }

    final static void intersectClip(int left, int top, int right, int bottom) {
        if (clipLeft < left) {
          clipLeft = left;
        }
        if (clipTop < top) {
          clipTop = top;
        }
        if (clipRight > right) {
          clipRight = right;
        }
        if (clipBottom > bottom) {
          clipBottom = bottom;
        }
        SoftwareRasterizer.clearMask();
    }

    final static void grayscaleRectangle(int x, int y, int rectangleWidth, int rectangleHeight) {
        if (x < clipLeft) {
          rectangleWidth = rectangleWidth - (clipLeft - x);
          x = clipLeft;
        }
        if (x + rectangleWidth > clipRight) {
          rectangleWidth = clipRight - x;
        }
        if (y < clipTop) {
          rectangleHeight = rectangleHeight - (clipTop - y);
          y = clipTop;
        }
        if (y + rectangleHeight > clipBottom) {
          rectangleHeight = clipBottom - y;
        }
        int var4 = x + y * width;
        if (rectangleWidth > 0) {
          if (rectangleHeight <= 0) {
            return;
          }
          for (int var5 = 0; var5 < rectangleHeight; var5++) {
            for (int var6 = 0; var6 < rectangleWidth; var6++) {
              int var7 = pixels[var4];
              int var8 = var7 >> 15 & 510;
              int var9 = var7 >> 8 & 255;
              int var10 = var7 & 255;
              int var11 = (var10 + var8) / 3 + var9 >> 1;
              int incrementValue$0 = var4;
              var4++;
              pixels[incrementValue$0] = (var11 << 16) + (var11 << 8) + var11;
            }
            var4 = var4 + (width - rectangleWidth);
          }
          return;
        }
    }

    final static void restoreClip(int[] bounds) {
        clipLeft = bounds[0];
        clipTop = bounds[1];
        clipRight = bounds[2];
        clipBottom = bounds[3];
        SoftwareRasterizer.clearMask();
    }

    final static void drawVerticalLine(int x, int y, int length, int color) {
        if (x >= clipLeft) {
          if (x >= clipRight) {
            return;
          }
          if (y < clipTop) {
            length = length - (clipTop - y);
            y = clipTop;
          }
          if (y + length > clipBottom) {
            length = clipBottom - y;
          }
          int var4 = x + y * width;
          int var5 = 0;
          while (var5 < length) {
            pixels[var4] = color;
            var5++;
            var4 = var4 + width;
          }
          return;
        }
    }

    private final static void blurHorizontal(int[] param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var19Lifetime1;
        int var8 = 16384 / (2 * param3 + 1);
        int var9 = 1 + param3 - param5 - param4;
        if (0 < var9) {
          var9 = 0;
        }
        int var10 = width - param4 - param5 - param3;
        if (0 < var10) {
          var10 = 0;
        }
        int var11 = 0;
        int var12 = param4 + param3 + 1;
        if (width < var12) {
          var11 = var12 - width;
          var12 = width;
        }
        for (int var13 = -param7; var13 < 0; var13++) {
          int var14 = 0;
          int var15 = 0;
          int var16 = 0;
          int var17 = param2 - param3;
          int var18 = var17 - (param3 << 1) - 1;
          int var19 = param4 - param3;
          if (var19 < 0) {
            var17 = var17 - var19;
            var18 = var18 - var19;
            var19 = 0;
          }
          int var20 = var12 - var19;
          while (var19 < var12) {
            param1 = param0[var17];
            var14 = var14 + (param1 >> 16 & 255);
            var15 = var15 + (param1 >> 8 & 255);
            var16 = var16 + (param1 & 255);
            var17++;
            var18++;
            var19++;
          }
          var18 = var18 + var11;
          int incrementValue$0 = param2;
          param2++;
          param0[incrementValue$0] = (var14 / var20 << 16) + (var15 / var20 << 8) + var16 / var20;
          for (var19Lifetime1 = 1 - param5; var19Lifetime1 < var9; var19Lifetime1++) {
            var18++;
            if (param4 + param5 + var19Lifetime1 + param3 < clipRight) {
              param1 = param0[var17];
              var17++;
              var14 = var14 + (param1 >> 16 & 255);
              var15 = var15 + (param1 >> 8 & 255);
              var16 = var16 + (param1 & 255);
              var20++;
            }
            int var21 = var14 / var20;
            int var22 = var15 / var20;
            int var23 = var16 / var20;
            int incrementValue$5 = param2;
            param2++;
            param0[incrementValue$5] = (var21 << 16) + (var22 << 8) + var23;
          }
          while (var19Lifetime1 < var10) {
            param1 = param0[var18++];
            var14 = var14 - (param1 >> 16 & 255);
            if (var14 < 0) {
              var14 = 0;
            }
            var15 = var15 - (param1 >> 8 & 255);
            if (var15 < 0) {
              var15 = 0;
            }
            var16 = var16 - (param1 & 255);
            if (var16 < 0) {
              var16 = 0;
            }
            param1 = param0[var17];
            var17++;
            var14 = var14 + (param1 >> 16 & 255);
            var15 = var15 + (param1 >> 8 & 255);
            var16 = var16 + (param1 & 255);
            int var21Lifetime1 = var14 * var8 >> 14;
            int var22Lifetime1 = var15 * var8 >> 14;
            int var23Lifetime1 = var16 * var8 >> 14;
            if (var21Lifetime1 > 255) {
              var21Lifetime1 = 255;
            }
            if (var22Lifetime1 > 255) {
              var22Lifetime1 = 255;
            }
            if (var23Lifetime1 > 255) {
              var23Lifetime1 = 255;
            }
            int incrementValue$4 = param2;
            param2++;
            param0[incrementValue$4] = (var21Lifetime1 << 16) + (var22Lifetime1 << 8) + var23Lifetime1;
            var19Lifetime1++;
          }
          while (var19Lifetime1 < 0) {
            param1 = param0[var18++];
            var14 = var14 - (param1 >> 16 & 255);
            var15 = var15 - (param1 >> 8 & 255);
            var16 = var16 - (param1 & 255);
            var20--;
            int var21Lifetime2 = var14 / var20;
            int var22Lifetime2 = var15 / var20;
            int var23Lifetime2 = var16 / var20;
            if (!(var21Lifetime2 >= 0)) {
              var21Lifetime2 = 0;
            } else if (var21Lifetime2 > 255) {
              var21Lifetime2 = 255;
            }
            if (!(var22Lifetime2 >= 0)) {
              var22Lifetime2 = 0;
            } else if (var22Lifetime2 > 255) {
              var22Lifetime2 = 255;
            }
            if (!(var23Lifetime2 >= 0)) {
              var23Lifetime2 = 0;
            } else if (var23Lifetime2 > 255) {
              var23Lifetime2 = 255;
            }
            int incrementValue$2 = param2;
            param2++;
            param0[incrementValue$2] = (var21Lifetime2 << 16) + (var22Lifetime2 << 8) + var23Lifetime2;
            var19Lifetime1++;
          }
          param2 = param2 + param6;
        }
    }

    final static void drawRectangleAlpha(int x, int y, int rectangleWidth, int rectangleHeight, int color, int alpha) {
        SoftwareRasterizer.drawHorizontalLineAlpha(x, y, rectangleWidth, color, alpha);
        SoftwareRasterizer.drawHorizontalLineAlpha(x, y + rectangleHeight - 1, rectangleWidth, color, alpha);
        if (rectangleHeight >= 3) {
          SoftwareRasterizer.drawVerticalLineAlpha(x, y + 1, rectangleHeight - 2, color, alpha);
          SoftwareRasterizer.drawVerticalLineAlpha(x + rectangleWidth - 1, y + 1, rectangleHeight - 2, color, alpha);
          return;
        }
    }

    final static void drawLine(int startX, int startY, int endX, int endY, int color) {
        endX = endX - startX;
        endY = endY - startY;
        if (endY == 0) {
          if (endX < 0) {
            SoftwareRasterizer.drawHorizontalLine(startX + endX, startY, -endX + 1, color);
          } else {
            SoftwareRasterizer.drawHorizontalLine(startX, startY, endX + 1, color);
          }
          return;
        }
        if (endX == 0) {
          if (endY < 0) {
            SoftwareRasterizer.drawVerticalLine(startX, startY + endY, -endY + 1, color);
          } else {
            SoftwareRasterizer.drawVerticalLine(startX, startY, endY + 1, color);
          }
          return;
        }
        if (endX + endY < 0) {
          startX = startX + endX;
          endX = -endX;
          startY = startY + endY;
          endY = -endY;
        }
        if (endX <= endY) {
          startX = startX << 16;
          startX = startX + 32768;
          endX = endX << 16;
          int var5 = (int)Math.floor((double)endX / (double)endY + 0.5);
          endY = endY + startY;
          if (startY < clipTop) {
            startX = startX + var5 * (clipTop - startY);
            startY = clipTop;
          }
          if (endY >= clipBottom) {
            endY = clipBottom - 1;
          }
          while (startY <= endY) {
            int var6 = startX >> 16;
            if (var6 >= clipLeft &&
              var6 < clipRight) {
              pixels[var6 + startY * width] = color;
            }
            startX = startX + var5;
            startY++;
          }
          return;
        }
        startY = startY << 16;
        startY = startY + 32768;
        endY = endY << 16;
        int var5Lifetime1 = (int)Math.floor((double)endY / (double)endX + 0.5);
        endX = endX + startX;
        if (startX < clipLeft) {
          startY = startY + var5Lifetime1 * (clipLeft - startX);
          startX = clipLeft;
        }
        if (endX >= clipRight) {
          endX = clipRight - 1;
        }
        while (startX <= endX) {
          int var6Lifetime1 = startY >> 16;
          if (var6Lifetime1 >= clipTop &&
            var6Lifetime1 < clipBottom) {
            pixels[startX + var6Lifetime1 * width] = color;
          }
          startY = startY + var5Lifetime1;
          startX++;
        }
    }

    final static void setClip(int left, int top, int right, int bottom) {
        if (left < 0) {
          left = 0;
        }
        if (top < 0) {
          top = 0;
        }
        if (right > width) {
          right = width;
        }
        if (bottom > height) {
          bottom = height;
        }
        clipLeft = left;
        clipTop = top;
        clipRight = right;
        clipBottom = bottom;
        SoftwareRasterizer.clearMask();
    }

    private final static void blurVertical(int[] param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int stackIn_39_2 = 0;
        int stackIn_42_2 = 0;
        int stackIn_45_2 = 0;
        if (field_h == null ||
          !(field_h.length >= param8)) {
          field_h = new int[param8];
          field_e = new int[param8];
          field_g = new int[param8];
        }
        int[] var27 = field_h;
        int[] var24 = var27;
        int[] var9 = var24;
        int[] var28 = field_e;
        int[] var25 = var28;
        int[] var10 = var25;
        int[] var29 = field_g;
        int[] var26 = var29;
        int[] var11 = var26;
        ArraySupport.clear(var27, 0, param8);
        ArraySupport.clear(var28, 0, param8);
        ArraySupport.clear(var29, 0, param8);
        int var12 = 16384 / (2 * param3 + 1);
        int var13 = param4 - param3;
        if (var13 < 0) {
          var13 = 0;
        }
        int var14 = param7 + var13 * width;
        int var15 = param4 + param3;
        int var16 = 0;
        if (var15 >= height) {
          var16 = var15 - height + 1;
          var15 = height - 1;
        }
        int var17 = var15 - var13 + 1;
        while (var13 <= var15) {
          for (int var18 = 0; var18 < param8; var18++) {
            param1 = param0[var14++];
            var9[var18] = var9[var18] + (param1 >> 16 & 255);
            var10[var18] = var10[var18] + (param1 >> 8 & 255);
            var11[var18] = var11[var18] + (param1 & 255);
          }
          var14 = var14 + param6;
          var13++;
        }
        var14 = var14 + var16 * width;
        for (int var18Lifetime1 = 0; var18Lifetime1 < param8; var18Lifetime1++) {
          int incrementValue$7 = param2;
          param2++;
          param0[incrementValue$7] = (var27[var18Lifetime1] / var17 << 16) + (var28[var18Lifetime1] / var17 << 8) + var29[var18Lifetime1] / var17;
        }
        param2 = param2 + param6;
        int var13Lifetime1 = 1 - param5;
        int var18Lifetime2 = 1 + param3 - param5 - param4;
        if (0 < var18Lifetime2) {
          var18Lifetime2 = 0;
        }
        int var19 = param7 + (param4 - param3) * width;
        if (var13Lifetime1 < var18Lifetime2) {
          var19 = var19 + (var18Lifetime2 - var13Lifetime1) * width;
        }
        while (var13Lifetime1 < var18Lifetime2) {
          if (var13Lifetime1 + param4 + param5 + param3 < clipBottom) {
            for (int var20 = 0; var20 < param8; var20++) {
              param1 = param0[var14++];
              var9[var20] = var9[var20] + (param1 >> 16 & 255);
              var10[var20] = var10[var20] + (param1 >> 8 & 255);
              var11[var20] = var11[var20] + (param1 & 255);
            }
            var14 = var14 + param6;
            var17++;
          } else {
            var14 = var14 + width;
          }
          for (int var20Lifetime3 = 0; var20Lifetime3 < param8; var20Lifetime3++) {
            int var21 = var27[var20Lifetime3] / var17;
            int var22 = var28[var20Lifetime3] / var17;
            int var23 = var29[var20Lifetime3] / var17;
            int incrementValue$6 = param2;
            param2++;
            param0[incrementValue$6] = (var21 << 16) + (var22 << 8) + var23;
          }
          param2 = param2 + param6;
          var13Lifetime1++;
        }
        int var18Lifetime3 = height - param4 - param5 - param3;
        if (0 < var18Lifetime3) {
          var18Lifetime3 = 0;
        }
        while (var13Lifetime1 < var18Lifetime3) {
          for (int var20Lifetime1 = 0; var20Lifetime1 < param8; var20Lifetime1++) {
            param1 = param0[var19++];
            int var21Lifetime1 = var27[var20Lifetime1] - (param1 >> 16 & 255);
            int[] stackIn_38_0 = var9;
            int stackIn_38_1 = var20Lifetime1;
            stackIn_39_2 = (var21Lifetime1 >= 0) ? (var21Lifetime1) : (0);
            stackIn_38_0[stackIn_38_1] = stackIn_39_2;
            int var21Lifetime1Lifetime2 = var28[var20Lifetime1] - (param1 >> 8 & 255);
            int[] stackIn_41_0 = var10;
            int stackIn_41_1 = var20Lifetime1;
            stackIn_42_2 = (var21Lifetime1Lifetime2 >= 0) ? (var21Lifetime1Lifetime2) : (0);
            stackIn_41_0[stackIn_41_1] = stackIn_42_2;
            int var21Lifetime1Lifetime3 = var29[var20Lifetime1] - (param1 & 255);
            int[] stackIn_44_0 = var11;
            int stackIn_44_1 = var20Lifetime1;
            stackIn_45_2 = (var21Lifetime1Lifetime3 >= 0) ? (var21Lifetime1Lifetime3) : (0);
            stackIn_44_0[stackIn_44_1] = stackIn_45_2;
          }
          var19 = var19 + param6;
          for (int var20Lifetime1Lifetime1 = 0; var20Lifetime1Lifetime1 < param8; var20Lifetime1Lifetime1++) {
            param1 = param0[var14++];
            var9[var20Lifetime1Lifetime1] = var9[var20Lifetime1Lifetime1] + (param1 >> 16 & 255);
            var10[var20Lifetime1Lifetime1] = var10[var20Lifetime1Lifetime1] + (param1 >> 8 & 255);
            var11[var20Lifetime1Lifetime1] = var11[var20Lifetime1Lifetime1] + (param1 & 255);
          }
          var14 = var14 + param6;
          for (int var20Lifetime1Lifetime2 = 0; var20Lifetime1Lifetime2 < param8; var20Lifetime1Lifetime2++) {
            int var21Lifetime1Lifetime1 = var27[var20Lifetime1Lifetime2] * var12 >> 14;
            int var22Lifetime1 = var28[var20Lifetime1Lifetime2] * var12 >> 14;
            int var23Lifetime1 = var29[var20Lifetime1Lifetime2] * var12 >> 14;
            if (var21Lifetime1Lifetime1 > 255) {
              var21Lifetime1Lifetime1 = 255;
            }
            if (var22Lifetime1 > 255) {
              var22Lifetime1 = 255;
            }
            if (var23Lifetime1 > 255) {
              var23Lifetime1 = 255;
            }
            int incrementValue$2 = param2;
            param2++;
            param0[incrementValue$2] = (var21Lifetime1Lifetime1 << 16) + (var22Lifetime1 << 8) + var23Lifetime1;
          }
          param2 = param2 + param6;
          var13Lifetime1++;
        }
        while (var13Lifetime1 < 0) {
          for (int var20Lifetime2 = 0; var20Lifetime2 < param8; var20Lifetime2++) {
            param1 = param0[var19++];
            var9[var20Lifetime2] = var9[var20Lifetime2] - (param1 >> 16 & 255);
            var10[var20Lifetime2] = var10[var20Lifetime2] - (param1 >> 8 & 255);
            var11[var20Lifetime2] = var11[var20Lifetime2] - (param1 & 255);
          }
          var19 = var19 + param6;
          var17--;
          for (int var20Lifetime2Lifetime1 = 0; var20Lifetime2Lifetime1 < param8; var20Lifetime2Lifetime1++) {
            int var21Lifetime2 = var27[var20Lifetime2Lifetime1] / var17;
            int var22Lifetime2 = var28[var20Lifetime2Lifetime1] / var17;
            int var23Lifetime2 = var29[var20Lifetime2Lifetime1] / var17;
            if (!(var21Lifetime2 >= 0)) {
              var21Lifetime2 = 0;
            } else if (var21Lifetime2 > 255) {
              var21Lifetime2 = 255;
            }
            if (!(var22Lifetime2 >= 0)) {
              var22Lifetime2 = 0;
            } else if (var22Lifetime2 > 255) {
              var22Lifetime2 = 255;
            }
            if (!(var23Lifetime2 >= 0)) {
              var23Lifetime2 = 0;
            } else if (var23Lifetime2 > 255) {
              var23Lifetime2 = 255;
            }
            int incrementValue$0 = param2;
            param2++;
            param0[incrementValue$0] = (var21Lifetime2 << 16) + (var22Lifetime2 << 8) + var23Lifetime2;
          }
          param2 = param2 + param6;
          var13Lifetime1++;
        }
    }

    private final static void darkenRows(int destinationIndex, int[] destination, int rowEnd, int rowWidth, int negativeHeight, int rowSkip) {
        while (negativeHeight < 0) {
          rowEnd = destinationIndex + rowWidth - 7;
          while (destinationIndex < rowEnd) {
            destination[destinationIndex] = (destination[destinationIndex] & 16711422) >> 1;
            destinationIndex++;
            destination[destinationIndex] = (destination[destinationIndex] & 16711422) >> 1;
            destinationIndex++;
            destination[destinationIndex] = (destination[destinationIndex] & 16711422) >> 1;
            destinationIndex++;
            destination[destinationIndex] = (destination[destinationIndex] & 16711422) >> 1;
            destinationIndex++;
            destination[destinationIndex] = (destination[destinationIndex] & 16711422) >> 1;
            destinationIndex++;
            destination[destinationIndex] = (destination[destinationIndex] & 16711422) >> 1;
            destinationIndex++;
            destination[destinationIndex] = (destination[destinationIndex] & 16711422) >> 1;
            destinationIndex++;
            destination[destinationIndex] = (destination[destinationIndex] & 16711422) >> 1;
            destinationIndex++;
          }
          rowEnd += 7;
          while (destinationIndex < rowEnd) {
            destination[destinationIndex] = (destination[destinationIndex] & 16711422) >> 1;
            destinationIndex++;
          }
          destinationIndex = destinationIndex + rowSkip;
          negativeHeight++;
        }
    }

    final static void addPixel(int x, int y, int color) {
        if (x >= clipLeft) {
          if (y < clipTop ||
            x >= clipRight ||
            y >= clipBottom) {
            return;
          }
          int var3 = x + y * width;
          int var4 = pixels[var3];
          int var5 = color + var4;
          color = (color & 16711935) + (var4 & 16711935);
          int var4Lifetime1 = (color & 16777472) + (var5 - color & 65536);
          pixels[var3] = var5 - var4Lifetime1 | var4Lifetime1 - (var4Lifetime1 >>> 8);
          return;
        }
    }

    final static void fillCircle(int centerX, int centerY, int radius, int color) {
        if (radius == 0) {
          SoftwareRasterizer.setPixel(centerX, centerY, color);
          return;
        }
        if (radius < 0) {
          radius = -radius;
        }
        int var4 = centerY - radius;
        if (var4 < clipTop) {
          var4 = clipTop;
        }
        int var5 = centerY + radius + 1;
        if (var5 > clipBottom) {
          var5 = clipBottom;
        }
        int var6 = var4;
        int var7 = radius * radius;
        int var8 = 0;
        int var9 = centerY - var6;
        int var10 = var9 * var9;
        int var11 = var10 - var9;
        if (centerY > var5) {
          centerY = var5;
        }
        while (var6 < centerY) {
          while (true) {
            if (var11 > var7 &&
              var10 > var7) {
              int var12 = centerX - var8 + 1;
              if (var12 < clipLeft) {
                var12 = clipLeft;
              }
              int var13 = centerX + var8;
              if (var13 > clipRight) {
                var13 = clipRight;
              }
              int var14 = var12 + var6 * width;
              for (int var15 = var12; var15 < var13; var15++) {
                int incrementValue$4 = var14;
                var14++;
                pixels[incrementValue$4] = color;
              }
              var6++;
              int incrementValue$3 = var9;
              var9--;
              var10 = var10 - (incrementValue$3 + var9);
              var11 = var11 - (var9 + var9);
              break;
            }
            var10 = var10 + (var8 + var8);
            int incrementValue$5 = var8;
            var8++;
            var11 = var11 + (incrementValue$5 + var8);
          }
        }
        int var8Lifetime1 = radius;
        int var9Lifetime1 = var6 - centerY;
        int var11Lifetime1 = var9Lifetime1 * var9Lifetime1 + var7;
        int var10Lifetime1 = var11Lifetime1 - var8Lifetime1;
        var11Lifetime1 = var11Lifetime1 - var9Lifetime1;
        while (var6 < var5) {
          while (var11Lifetime1 > var7) {
            if (var10Lifetime1 > var7) {
              int incrementValue$0 = var8Lifetime1;
              var8Lifetime1--;
              var11Lifetime1 = var11Lifetime1 - (incrementValue$0 + var8Lifetime1);
              var10Lifetime1 = var10Lifetime1 - (var8Lifetime1 + var8Lifetime1);
              continue;
            }
            break;
          }
          int var12Lifetime1 = centerX - var8Lifetime1;
          if (var12Lifetime1 < clipLeft) {
            var12Lifetime1 = clipLeft;
          }
          int var13Lifetime1 = centerX + var8Lifetime1;
          if (var13Lifetime1 > clipRight - 1) {
            var13Lifetime1 = clipRight - 1;
          }
          int var14Lifetime1 = var12Lifetime1 + var6 * width;
          for (int var15Lifetime1 = var12Lifetime1; var15Lifetime1 <= var13Lifetime1; var15Lifetime1++) {
            int incrementValue$2 = var14Lifetime1;
            var14Lifetime1++;
            pixels[incrementValue$2] = color;
          }
          var6++;
          var11Lifetime1 = var11Lifetime1 + (var9Lifetime1 + var9Lifetime1);
          int incrementValue$1 = var9Lifetime1;
          var9Lifetime1++;
          var10Lifetime1 = var10Lifetime1 + (incrementValue$1 + var9Lifetime1);
        }
        return;
    }

    final static void darkenRectangle(int x, int y, int rectangleWidth, int rectangleHeight) {
        if (x < clipLeft) {
          rectangleWidth = rectangleWidth - (clipLeft - x);
          x = clipLeft;
        }
        if (y < clipTop) {
          rectangleHeight = rectangleHeight - (clipTop - y);
          y = clipTop;
        }
        if (x + rectangleWidth > clipRight) {
          rectangleWidth = clipRight - x;
        }
        if (y + rectangleHeight > clipBottom) {
          rectangleHeight = clipBottom - y;
        }
        int var4 = width - rectangleWidth;
        int var5 = x + y * width;
        SoftwareRasterizer.darkenRows(var5, pixels, 0, rectangleWidth, -rectangleHeight, var4);
    }

    final static void drawCircle(int centerX, int centerY, int radius, int color) {
        if (radius == 0) {
          SoftwareRasterizer.setPixel(centerX, centerY, color);
          return;
        }
        if (radius < 0) {
          radius = -radius;
        }
        if (clipRight > clipLeft) {
          if (clipBottom <= clipTop) {
            return;
          }
          if (centerX + radius >= clipLeft) {
            if (centerX - radius < clipRight &&
              centerY + radius >= clipTop &&
              centerY - radius < clipBottom) {
              int var4 = centerX + centerY * width;
              int var5 = var4;
              int var6 = var4 - radius * width;
              int var7 = var4 + radius * width;
              int var8 = radius;
              int var9 = 0;
              radius = radius * radius;
              int var10 = radius - var8;
              if (centerX - var8 >= clipLeft &&
                centerX + var8 < clipRight &&
                centerY - var8 >= clipTop &&
                centerY + var8 < clipBottom) {
                pixels[var4 - var8] = color;
                pixels[var4 + var8] = color;
                pixels[var6] = color;
                pixels[var7] = color;
                while (true) {
                  int incrementValue$0 = var9;
                  var9++;
                  var10 = var10 + (incrementValue$0 + var9);
                  var4 = var4 - width;
                  var5 = var5 + width;
                  if (var10 > radius) {
                    var8--;
                    var10 = var10 - (var8 + var8);
                    var6 = var6 + width;
                    var7 = var7 - width;
                  }
                  if (var8 < var9) {
                    return;
                  }
                  pixels[var6 - var9] = color;
                  pixels[var6 + var9] = color;
                  pixels[var4 - var8] = color;
                  pixels[var4 + var8] = color;
                  pixels[var5 - var8] = color;
                  pixels[var5 + var8] = color;
                  pixels[var7 - var9] = color;
                  pixels[var7 + var9] = color;
                }
              }
              if (centerX - var8 >= clipLeft &&
                centerY >= clipTop &&
                centerY < clipBottom) {
                pixels[var4 - var8] = color;
              }
              if (centerX + var8 < clipRight &&
                centerY >= clipTop &&
                centerY < clipBottom) {
                pixels[var4 + var8] = color;
              }
              if (centerY - var8 >= clipTop) {
                if (centerX >= clipLeft) {
                  if (centerX < clipRight) {
                    pixels[var6] = color;
                    if (centerY + var8 < clipBottom &&
                      centerX >= clipLeft &&
                      centerX < clipRight) {
                      pixels[var7] = color;
                    }
                  } else if (centerY + var8 < clipBottom &&
                    centerX >= clipLeft &&
                    centerX < clipRight) {
                    pixels[var7] = color;
                  }
                } else if (centerY + var8 < clipBottom &&
                  centerX >= clipLeft &&
                  centerX < clipRight) {
                  pixels[var7] = color;
                }
              } else if (centerY + var8 < clipBottom &&
                centerX >= clipLeft &&
                centerX < clipRight) {
                pixels[var7] = color;
              }
              while (true) {
                int incrementValue$1 = var9;
                var9++;
                var10 = var10 + (incrementValue$1 + var9);
                var4 = var4 - width;
                var5 = var5 + width;
                if (var10 > radius) {
                  var8--;
                  var10 = var10 - (var8 + var8);
                  var6 = var6 + width;
                  var7 = var7 - width;
                }
                if (var8 < var9) {
                  return;
                }
                if (centerY - var8 >= clipTop &&
                  centerY - var8 < clipBottom) {
                  if (centerX - var9 >= clipLeft &&
                    centerX - var9 < clipRight) {
                    pixels[var6 - var9] = color;
                  }
                  if (centerX + var9 >= clipLeft &&
                    centerX + var9 < clipRight) {
                    pixels[var6 + var9] = color;
                  }
                }
                if (centerY - var9 >= clipTop &&
                  centerY - var9 < clipBottom) {
                  if (centerX - var8 >= clipLeft &&
                    centerX - var8 < clipRight) {
                    pixels[var4 - var8] = color;
                  }
                  if (centerX + var8 >= clipLeft &&
                    centerX + var8 < clipRight) {
                    pixels[var4 + var8] = color;
                  }
                }
                if (centerY + var9 >= clipTop &&
                  centerY + var9 < clipBottom) {
                  if (centerX - var8 >= clipLeft &&
                    centerX - var8 < clipRight) {
                    pixels[var5 - var8] = color;
                  }
                  if (centerX + var8 >= clipLeft &&
                    centerX + var8 < clipRight) {
                    pixels[var5 + var8] = color;
                  }
                }
                if (centerY + var8 < clipTop) {
                  continue;
                }
                if (centerY + var8 >= clipBottom) {
                  continue;
                }
                if (centerX - var9 >= clipLeft &&
                  centerX - var9 < clipRight) {
                  pixels[var7 - var9] = color;
                }
                if (centerX + var9 < clipLeft) {
                  continue;
                }
                if (centerX + var9 >= clipRight) {
                  continue;
                }
                pixels[var7 + var9] = color;
              }
            }
            return;
          }
        }
    }

    final static void setPixel(int x, int y, int color) {
        if (x >= clipLeft) {
          if (y < clipTop ||
            x >= clipRight ||
            y >= clipBottom) {
            return;
          }
          pixels[x + y * width] = color;
          return;
        }
    }

    final static void drawHorizontalLine(int x, int y, int length, int color) {
        if (y >= clipTop) {
          if (y >= clipBottom) {
            return;
          }
          if (x < clipLeft) {
            length = length - (clipLeft - x);
            x = clipLeft;
          }
          if (x + length > clipRight) {
            length = clipRight - x;
          }
          int var4 = x + y * width;
          for (int var5 = 0; var5 < length; var5++) {
            pixels[var4 + var5] = color;
          }
          return;
        }
    }

    public static void releaseStatics() {
        pixels = null;
        maskStarts = null;
        maskWidths = null;
        field_h = null;
        field_e = null;
        field_g = null;
    }

    final static void clearFramebuffer() {
        int var0 = 0;
        int var1 = width * height - 7;
        while (var0 < var1) {
          int incrementValue$0 = var0;
          var0++;
          pixels[incrementValue$0] = 0;
          int incrementValue$1 = var0;
          var0++;
          pixels[incrementValue$1] = 0;
          int incrementValue$2 = var0;
          var0++;
          pixels[incrementValue$2] = 0;
          int incrementValue$3 = var0;
          var0++;
          pixels[incrementValue$3] = 0;
          int incrementValue$4 = var0;
          var0++;
          pixels[incrementValue$4] = 0;
          int incrementValue$5 = var0;
          var0++;
          pixels[incrementValue$5] = 0;
          int incrementValue$6 = var0;
          var0++;
          pixels[incrementValue$6] = 0;
          int incrementValue$7 = var0;
          var0++;
          pixels[incrementValue$7] = 0;
        }
        var1 += 7;
        while (var0 < var1) {
          int incrementValue$8 = var0;
          var0++;
          pixels[incrementValue$8] = 0;
        }
    }

    static {
        clipBottom = 0;
        clipRight = 0;
        clipTop = 0;
        clipLeft = 0;
    }
}
