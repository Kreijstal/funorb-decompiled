/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TriangleRasterizer {
    static int projectionCenterX;
    private static boolean field_g;
    static int clipWidth;
    static TextureProvider textureProvider;
    private static int[] field_i;
    static int projectionCenterY;
    static boolean clipHorizontalSpans;
    private static boolean field_d;
    private static float field_b;
    static int[] sineTable;
    static int clipHeight;
    static int[] scanlineOffsets;
    private static boolean field_p;
    static int[] cosineTable;
    static int blendAlpha;
    static int[] colorPalette;
    static int[] field_m;

    private final static void a(int[] param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int incrementValue$14 = 0;
        int incrementValue$13 = 0;
        int incrementValue$15 = 0;
        int incrementValue$16 = 0;
        int incrementValue$17 = 0;
        int incrementValue$18 = 0;
        int incrementValue$19 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (clipHorizontalSpans) {
          if (param5 > clipWidth) {
            param5 = clipWidth;
          }
          if (param4 < 0) {
            param4 = 0;
          }
        }
        if (param4 >= param5) {
          return;
        }
        param1 = param1 + param4;
        param6 = param6 + param7 * param4;
        if (!field_g) {
          param3 = param5 - param4;
          if (blendAlpha == 0) {
            do {
              incrementValue$14 = param1;
              param1++;
              param0[incrementValue$14] = colorPalette[param6 >> 8];
              param6 = param6 + param7;
              param3--;
            } while (param3 > 0);
            return;
          }
          var8 = blendAlpha;
          var9 = 256 - blendAlpha;
          do {
            param2 = colorPalette[param6 >> 8];
            param6 = param6 + param7;
            param2 = ((param2 & 16711935) * var9 >> 8 & 16711935) + ((param2 & 65280) * var9 >> 8 & 65280);
            var10 = param0[param1];
            incrementValue$13 = param1;
            param1++;
            param0[incrementValue$13] = param2 + ((var10 & 16711935) * var8 >> 8 & 16711935) + ((var10 & 65280) * var8 >> 8 & 65280);
            param3--;
          } while (param3 > 0);
          return;
        }
        boolean decompiledFrameRemainder0 = true;
        param3 = param5 - param4 >> 2;
        param7 = param7 << 2;
        if (blendAlpha == 0) {
          if (param3 > 0) {
            do {
              param2 = colorPalette[param6 >> 8];
              param6 = param6 + param7;
              param0[param1++] = param2;
              param0[param1++] = param2;
              param0[param1++] = param2;
              param0[param1++] = param2;
              param3--;
            } while (param3 > 0);
          }
          param3 = param5 - param4 & 3;
          if (param3 <= 0) {
            return;
          }
          param2 = colorPalette[param6 >> 8];
          do {
            param0[param1++] = param2;
            param3--;
          } while (param3 > 0);
          decompiledFrameRemainder0 = false;
        }
        else {
          var8 = blendAlpha;
          var9 = 256 - blendAlpha;
          if (param3 > 0) {
            do {
              param2 = colorPalette[param6 >> 8];
              param6 = param6 + param7;
              param2 = ((param2 & 16711935) * var9 >> 8 & 16711935) + ((param2 & 65280) * var9 >> 8 & 65280);
              var10 = param0[param1];
              incrementValue$15 = param1;
              param1++;
              param0[incrementValue$15] = param2 + ((var10 & 16711935) * var8 >> 8 & 16711935) + ((var10 & 65280) * var8 >> 8 & 65280);
              var10 = param0[param1];
              incrementValue$16 = param1;
              param1++;
              param0[incrementValue$16] = param2 + ((var10 & 16711935) * var8 >> 8 & 16711935) + ((var10 & 65280) * var8 >> 8 & 65280);
              var10 = param0[param1];
              incrementValue$17 = param1;
              param1++;
              param0[incrementValue$17] = param2 + ((var10 & 16711935) * var8 >> 8 & 16711935) + ((var10 & 65280) * var8 >> 8 & 65280);
              var10 = param0[param1];
              incrementValue$18 = param1;
              param1++;
              param0[incrementValue$18] = param2 + ((var10 & 16711935) * var8 >> 8 & 16711935) + ((var10 & 65280) * var8 >> 8 & 65280);
              param3--;
            } while (param3 > 0);
          }
          param3 = param5 - param4 & 3;
          if (param3 > 0) {
            param2 = colorPalette[param6 >> 8];
            param2 = ((param2 & 16711935) * var9 >> 8 & 16711935) + ((param2 & 65280) * var9 >> 8 & 65280);
            do {
              var10 = param0[param1];
              incrementValue$19 = param1;
              param1++;
              param0[incrementValue$19] = param2 + ((var10 & 16711935) * var8 >> 8 & 16711935) + ((var10 & 65280) * var8 >> 8 & 65280);
              param3--;
            } while (param3 > 0);
          }
        }

    }

    private final static void a(int[] param0, int param1, int param2, int param3, int param4, int param5) {
        int incrementValue$12 = 0;
        int incrementValue$13 = 0;
        int incrementValue$14 = 0;
        int incrementValue$15 = 0;
        int incrementValue$16 = 0;
        int incrementValue$7 = 0;
        int incrementValue$8 = 0;
        int incrementValue$9 = 0;
        int incrementValue$10 = 0;
        int incrementValue$11 = 0;
        int var6;
        int var7;
        int var8;
        int var8Lifetime1;
        int var8Lifetime2;
        int var8Lifetime3;
        int var8Lifetime4;
        if (clipHorizontalSpans) {
          if (param5 > clipWidth) {
            param5 = clipWidth;
          }
          if (param4 < 0) {
            param4 = 0;
          }
        }
        if (param4 >= param5) {
          return;
        }
        param1 = param1 + param4;
        param3 = param5 - param4 >> 2;
        if (blendAlpha == 0) {
          while (true) {
            param3--;
            if (param3 < 0) {
              param3 = param5 - param4 & 3;
              while (true) {
                param3--;
                if (param3 < 0) {
                  return;
                }
                param0[param1++] = param2;
              }
            }
            param0[param1++] = param2;
            param0[param1++] = param2;
            param0[param1++] = param2;
            param0[param1++] = param2;
          }
        }
        regionExit1: {
          if (blendAlpha == 254) {
            while (true) {
              param3--;
              if (param3 < 0) {
                param3 = param5 - param4 & 3;
                while (true) {
                  param3--;
                  if (param3 < 0) {
                    break regionExit1;
                  }
                  incrementValue$12 = param1;
                  param1++;
                  param0[incrementValue$12] = param0[param1];
                }
              }
              incrementValue$13 = param1;
              param1++;
              param0[incrementValue$13] = param0[param1];
              incrementValue$14 = param1;
              param1++;
              param0[incrementValue$14] = param0[param1];
              incrementValue$15 = param1;
              param1++;
              param0[incrementValue$15] = param0[param1];
              incrementValue$16 = param1;
              param1++;
              param0[incrementValue$16] = param0[param1];
            }
          }
          var6 = blendAlpha;
          var7 = 256 - blendAlpha;
          param2 = ((param2 & 16711935) * var7 >> 8 & 16711935) + ((param2 & 65280) * var7 >> 8 & 65280);
          while (true) {
            param3--;
            if (param3 < 0) {
              param3 = param5 - param4 & 3;
              while (true) {
                param3--;
                if (param3 < 0) {
                  break regionExit1;
                }
                var8 = param0[param1];
                incrementValue$7 = param1;
                param1++;
                param0[incrementValue$7] = param2 + ((var8 & 16711935) * var6 >> 8 & 16711935) + ((var8 & 65280) * var6 >> 8 & 65280);
              }
            }
            var8Lifetime1 = param0[param1];
            incrementValue$8 = param1;
            param1++;
            param0[incrementValue$8] = param2 + ((var8Lifetime1 & 16711935) * var6 >> 8 & 16711935) + ((var8Lifetime1 & 65280) * var6 >> 8 & 65280);
            var8Lifetime2 = param0[param1];
            incrementValue$9 = param1;
            param1++;
            param0[incrementValue$9] = param2 + ((var8Lifetime2 & 16711935) * var6 >> 8 & 16711935) + ((var8Lifetime2 & 65280) * var6 >> 8 & 65280);
            var8Lifetime3 = param0[param1];
            incrementValue$10 = param1;
            param1++;
            param0[incrementValue$10] = param2 + ((var8Lifetime3 & 16711935) * var6 >> 8 & 16711935) + ((var8Lifetime3 & 65280) * var6 >> 8 & 65280);
            var8Lifetime4 = param0[param1];
            incrementValue$11 = param1;
            param1++;
            param0[incrementValue$11] = param2 + ((var8Lifetime4 & 16711935) * var6 >> 8 & 16711935) + ((var8Lifetime4 & 65280) * var6 >> 8 & 65280);
          }
        }
    }

    final static void useRasterClip() {
        TriangleRasterizer.setClip(SoftwareRaster.clipLeft, SoftwareRaster.clipTop, SoftwareRaster.clipRight, SoftwareRaster.clipBottom);
    }

    final static void centerProjection() {
        projectionCenterX = clipWidth / 2;
        projectionCenterY = clipHeight / 2;
    }

    final static void setClip(int left, int top, int right, int bottom) {
        int var5 = 0;
        clipWidth = right - left;
        clipHeight = bottom - top;
        TriangleRasterizer.centerProjection();
        if (scanlineOffsets.length < clipHeight) {
          scanlineOffsets = new int[rs.nextPowerOfTwo((byte) 84, clipHeight)];
        }
        int var4 = top * SoftwareRaster.width + left;
        for (var5 = 0; var5 < clipHeight; var5++) {
          scanlineOffsets[var5] = var4;
          var4 = var4 + SoftwareRaster.width;
        }
    }

    private final static void a(float param0) {
        field_b = param0;
        field_b = (float)((double)field_b + (Math.random() * 0.03 - 0.015));
    }

    final static void drawFlatTriangle(int yA, int yB, int yC, int xA, int xB, int xC, int rgbColor) {
        int localTemp$0 = 0;
        int localTemp$1 = 0;
        int localTemp$2 = 0;
        int localTemp$3 = 0;
        int localTemp$4 = 0;
        int localTemp$5 = 0;
        int var7;
        int var8;
        int var9;
        var7 = 0;
        if (yB != yA) {
          var7 = (xB - xA << 16) / (yB - yA);
        }
        var8 = 0;
        if (yC != yB) {
          var8 = (xC - xB << 16) / (yC - yB);
        }
        var9 = 0;
        if (yC != yA) {
          var9 = (xA - xC << 16) / (yA - yC);
        }
        if (yA <= yB &&
          yA <= yC) {
          if (yA >= clipHeight) {
            return;
          }
          if (yB > clipHeight) {
            yB = clipHeight;
          }
          if (yC > clipHeight) {
            yC = clipHeight;
          }
          if (yB >= yC) {
            localTemp$0 = xA << 16;
            xA = localTemp$0;
            xB = localTemp$0;
            if (yA < 0) {
              xB = xB - var9 * yA;
              xA = xA - var7 * yA;
              yA = 0;
            }
            xC = xC << 16;
            if (yC < 0) {
              xC = xC - var8 * yC;
              yC = 0;
            }
            if ((yA == yC ||
              var9 >= var7) &&
              (yA != yC ||
              var8 <= var7)) {
              yB = yB - yC;
              yC = yC - yA;
              yA = scanlineOffsets[yA];
              while (true) {
                yC--;
                if (yC >= 0) {
                  TriangleRasterizer.a(SoftwareRaster.pixels, yA, rgbColor, 0, xA >> 16, xB >> 16);
                  xB = xB + var9;
                  xA = xA + var7;
                  yA = yA + SoftwareRaster.width;
                  continue;
                }
                break;
              }
              yB--;
              while (yB >= 0) {
                TriangleRasterizer.a(SoftwareRaster.pixels, yA, rgbColor, 0, xA >> 16, xC >> 16);
                xC = xC + var8;
                xA = xA + var7;
                yA = yA + SoftwareRaster.width;
                yB--;
              }
              return;
            }
            yB = yB - yC;
            yC = yC - yA;
            yA = scanlineOffsets[yA];
            while (true) {
              yC--;
              if (yC >= 0) {
                TriangleRasterizer.a(SoftwareRaster.pixels, yA, rgbColor, 0, xB >> 16, xA >> 16);
                xB = xB + var9;
                xA = xA + var7;
                yA = yA + SoftwareRaster.width;
                continue;
              }
              break;
            }
            yB--;
            while (yB >= 0) {
              TriangleRasterizer.a(SoftwareRaster.pixels, yA, rgbColor, 0, xC >> 16, xA >> 16);
              xC = xC + var8;
              xA = xA + var7;
              yA = yA + SoftwareRaster.width;
              yB--;
            }
            return;
          }
          localTemp$1 = xA << 16;
          xA = localTemp$1;
          xC = localTemp$1;
          if (yA < 0) {
            xC = xC - var9 * yA;
            xA = xA - var7 * yA;
            yA = 0;
          }
          xB = xB << 16;
          if (yB < 0) {
            xB = xB - var8 * yB;
            yB = 0;
          }
          if ((yA == yB ||
            var9 >= var7) &&
            (yA != yB ||
            var9 <= var8)) {
            yC = yC - yB;
            yB = yB - yA;
            yA = scanlineOffsets[yA];
            while (true) {
              yB--;
              if (yB >= 0) {
                TriangleRasterizer.a(SoftwareRaster.pixels, yA, rgbColor, 0, xA >> 16, xC >> 16);
                xC = xC + var9;
                xA = xA + var7;
                yA = yA + SoftwareRaster.width;
                continue;
              }
              break;
            }
            yC--;
            while (yC >= 0) {
              TriangleRasterizer.a(SoftwareRaster.pixels, yA, rgbColor, 0, xB >> 16, xC >> 16);
              xC = xC + var9;
              xB = xB + var8;
              yA = yA + SoftwareRaster.width;
              yC--;
            }
            return;
          }
          yC = yC - yB;
          yB = yB - yA;
          yA = scanlineOffsets[yA];
          while (true) {
            yB--;
            if (yB >= 0) {
              TriangleRasterizer.a(SoftwareRaster.pixels, yA, rgbColor, 0, xC >> 16, xA >> 16);
              xC = xC + var9;
              xA = xA + var7;
              yA = yA + SoftwareRaster.width;
              continue;
            }
            break;
          }
          yC--;
          while (yC >= 0) {
            TriangleRasterizer.a(SoftwareRaster.pixels, yA, rgbColor, 0, xC >> 16, xB >> 16);
            xC = xC + var9;
            xB = xB + var8;
            yA = yA + SoftwareRaster.width;
            yC--;
          }
          return;
        }
        if (yB > yC) {
          if (yC >= clipHeight) {
            return;
          }
          if (yA > clipHeight) {
            yA = clipHeight;
          }
          if (yB > clipHeight) {
            yB = clipHeight;
          }
          if (yA >= yB) {
            localTemp$2 = xC << 16;
            xC = localTemp$2;
            xA = localTemp$2;
            if (yC < 0) {
              xA = xA - var8 * yC;
              xC = xC - var9 * yC;
              yC = 0;
            }
            xB = xB << 16;
            if (yB < 0) {
              xB = xB - var7 * yB;
              yB = 0;
            }
            if (var8 >= var9) {
              yA = yA - yB;
              yB = yB - yC;
              yC = scanlineOffsets[yC];
              while (true) {
                yB--;
                if (yB >= 0) {
                  TriangleRasterizer.a(SoftwareRaster.pixels, yC, rgbColor, 0, xC >> 16, xA >> 16);
                  xA = xA + var8;
                  xC = xC + var9;
                  yC = yC + SoftwareRaster.width;
                  continue;
                }
                break;
              }
              yA--;
              while (yA >= 0) {
                TriangleRasterizer.a(SoftwareRaster.pixels, yC, rgbColor, 0, xC >> 16, xB >> 16);
                xB = xB + var7;
                xC = xC + var9;
                yC = yC + SoftwareRaster.width;
                yA--;
              }
              return;
            }
            yA = yA - yB;
            yB = yB - yC;
            yC = scanlineOffsets[yC];
            while (true) {
              yB--;
              if (yB >= 0) {
                TriangleRasterizer.a(SoftwareRaster.pixels, yC, rgbColor, 0, xA >> 16, xC >> 16);
                xA = xA + var8;
                xC = xC + var9;
                yC = yC + SoftwareRaster.width;
                continue;
              }
              break;
            }
            yA--;
            while (yA >= 0) {
              TriangleRasterizer.a(SoftwareRaster.pixels, yC, rgbColor, 0, xB >> 16, xC >> 16);
              xB = xB + var7;
              xC = xC + var9;
              yC = yC + SoftwareRaster.width;
              yA--;
            }
            return;
          }
          localTemp$3 = xC << 16;
          xC = localTemp$3;
          xB = localTemp$3;
          if (yC < 0) {
            xB = xB - var8 * yC;
            xC = xC - var9 * yC;
            yC = 0;
          }
          xA = xA << 16;
          if (yA < 0) {
            xA = xA - var7 * yA;
            yA = 0;
          }
          if (var8 >= var9) {
            yB = yB - yA;
            yA = yA - yC;
            yC = scanlineOffsets[yC];
            while (true) {
              yA--;
              if (yA >= 0) {
                TriangleRasterizer.a(SoftwareRaster.pixels, yC, rgbColor, 0, xC >> 16, xB >> 16);
                xB = xB + var8;
                xC = xC + var9;
                yC = yC + SoftwareRaster.width;
                continue;
              }
              break;
            }
            yB--;
            while (yB >= 0) {
              TriangleRasterizer.a(SoftwareRaster.pixels, yC, rgbColor, 0, xA >> 16, xB >> 16);
              xB = xB + var8;
              xA = xA + var7;
              yC = yC + SoftwareRaster.width;
              yB--;
            }
            return;
          }
          yB = yB - yA;
          yA = yA - yC;
          yC = scanlineOffsets[yC];
          while (true) {
            yA--;
            if (yA >= 0) {
              TriangleRasterizer.a(SoftwareRaster.pixels, yC, rgbColor, 0, xB >> 16, xC >> 16);
              xB = xB + var8;
              xC = xC + var9;
              yC = yC + SoftwareRaster.width;
              continue;
            }
            break;
          }
          yB--;
          while (yB >= 0) {
            TriangleRasterizer.a(SoftwareRaster.pixels, yC, rgbColor, 0, xB >> 16, xA >> 16);
            xB = xB + var8;
            xA = xA + var7;
            yC = yC + SoftwareRaster.width;
            yB--;
          }
          return;
        }
        if (yB >= clipHeight) {
          return;
        }
        if (yC > clipHeight) {
          yC = clipHeight;
        }
        if (yA > clipHeight) {
          yA = clipHeight;
        }
        if (yC >= yA) {
          localTemp$4 = xB << 16;
          xB = localTemp$4;
          xC = localTemp$4;
          if (yB < 0) {
            xC = xC - var7 * yB;
            xB = xB - var8 * yB;
            yB = 0;
          }
          xA = xA << 16;
          if (yA < 0) {
            xA = xA - var9 * yA;
            yA = 0;
          }
          if (var7 >= var8) {
            yC = yC - yA;
            yA = yA - yB;
            yB = scanlineOffsets[yB];
            while (true) {
              yA--;
              if (yA >= 0) {
                TriangleRasterizer.a(SoftwareRaster.pixels, yB, rgbColor, 0, xB >> 16, xC >> 16);
                xC = xC + var7;
                xB = xB + var8;
                yB = yB + SoftwareRaster.width;
                continue;
              }
              break;
            }
            yC--;
            while (yC >= 0) {
              TriangleRasterizer.a(SoftwareRaster.pixels, yB, rgbColor, 0, xB >> 16, xA >> 16);
              xA = xA + var9;
              xB = xB + var8;
              yB = yB + SoftwareRaster.width;
              yC--;
            }
            return;
          }
          yC = yC - yA;
          yA = yA - yB;
          yB = scanlineOffsets[yB];
          while (true) {
            yA--;
            if (yA >= 0) {
              TriangleRasterizer.a(SoftwareRaster.pixels, yB, rgbColor, 0, xC >> 16, xB >> 16);
              xC = xC + var7;
              xB = xB + var8;
              yB = yB + SoftwareRaster.width;
              continue;
            }
            break;
          }
          yC--;
          while (yC >= 0) {
            TriangleRasterizer.a(SoftwareRaster.pixels, yB, rgbColor, 0, xA >> 16, xB >> 16);
            xA = xA + var9;
            xB = xB + var8;
            yB = yB + SoftwareRaster.width;
            yC--;
          }
          return;
        }
        localTemp$5 = xB << 16;
        xB = localTemp$5;
        xA = localTemp$5;
        if (yB < 0) {
          xA = xA - var7 * yB;
          xB = xB - var8 * yB;
          yB = 0;
        }
        xC = xC << 16;
        if (yC < 0) {
          xC = xC - var9 * yC;
          yC = 0;
        }
        if ((yB == yC ||
          var7 >= var8) &&
          (yB != yC ||
          var7 <= var9)) {
          yA = yA - yC;
          yC = yC - yB;
          yB = scanlineOffsets[yB];
          while (true) {
            yC--;
            if (yC >= 0) {
              TriangleRasterizer.a(SoftwareRaster.pixels, yB, rgbColor, 0, xB >> 16, xA >> 16);
              xA = xA + var7;
              xB = xB + var8;
              yB = yB + SoftwareRaster.width;
              continue;
            }
            break;
          }
          yA--;
          while (yA >= 0) {
            TriangleRasterizer.a(SoftwareRaster.pixels, yB, rgbColor, 0, xC >> 16, xA >> 16);
            xA = xA + var7;
            xC = xC + var9;
            yB = yB + SoftwareRaster.width;
            yA--;
          }
          return;
        }
        yA = yA - yC;
        yC = yC - yB;
        yB = scanlineOffsets[yB];
        while (true) {
          yC--;
          if (yC >= 0) {
            TriangleRasterizer.a(SoftwareRaster.pixels, yB, rgbColor, 0, xA >> 16, xB >> 16);
            xA = xA + var7;
            xB = xB + var8;
            yB = yB + SoftwareRaster.width;
            continue;
          }
          break;
        }
        yA--;
        while (yA >= 0) {
          TriangleRasterizer.a(SoftwareRaster.pixels, yB, rgbColor, 0, xA >> 16, xC >> 16);
          xA = xA + var7;
          xC = xC + var9;
          yB = yB + SoftwareRaster.width;
          yA--;
        }
        return;
    }

    private final static void a(int param0, int param1) {
        int var3 = 0;
        int var8 = 0;
        int incrementValue$0 = 0;
        int var2;
        double var4;
        double var6;
        double var9;
        double var11;
        double var13;
        double var15;
        double var17_double;
        int var17;
        int var18;
        double var19_double;
        int var19;
        int var20;
        double var21;
        double var23;
        double var25;
        var2 = param0 * 128;
        for (var3 = param0; var3 < param1; var3++) {
          var4 = (double)(var3 >> 3) / 64.0 + 0.0078125;
          var6 = (double)(var3 & 7) / 8.0 + 0.0625;
          for (var8 = 0; var8 < 128; var8++) {
            var9 = (double)var8 / 128.0;
            var11 = var9;
            var13 = var9;
            var15 = var9;
            if (var6 != 0.0) {
              if (!(var9 < 0.5)) {
                var17_double = var9 + var6 - var9 * var6;
              } else {
                var17_double = var9 * (1.0 + var6);
              }
              var19_double = 2.0 * var9 - var17_double;
              var21 = var4 + 0.3333333333333333;
              if (var21 > 1.0) {
                var21 = var21 - 1.0;
              }
              var23 = var4;
              var25 = var4 - 0.3333333333333333;
              if (var25 < 0.0) {
                var25 = var25 + 1.0;
              }
              if (!(6.0 * var21 < 1.0)) {
                if (!(2.0 * var21 < 1.0)) {
                  if (!(3.0 * var21 < 2.0)) {
                    var11 = var19_double;
                  } else {
                    var11 = var19_double + (var17_double - var19_double) * (0.6666666666666666 - var21) * 6.0;
                  }
                } else {
                  var11 = var17_double;
                }
              } else {
                var11 = var19_double + (var17_double - var19_double) * 6.0 * var21;
              }
              if (!(6.0 * var23 < 1.0)) {
                if (!(2.0 * var23 < 1.0)) {
                  if (!(3.0 * var23 < 2.0)) {
                    var13 = var19_double;
                  } else {
                    var13 = var19_double + (var17_double - var19_double) * (0.6666666666666666 - var23) * 6.0;
                  }
                } else {
                  var13 = var17_double;
                }
              } else {
                var13 = var19_double + (var17_double - var19_double) * 6.0 * var23;
              }
              if (!(6.0 * var25 < 1.0)) {
                if (!(2.0 * var25 < 1.0)) {
                  if (!(3.0 * var25 < 2.0)) {
                    var15 = var19_double;
                  } else {
                    var15 = var19_double + (var17_double - var19_double) * (0.6666666666666666 - var25) * 6.0;
                  }
                } else {
                  var15 = var17_double;
                }
              } else {
                var15 = var19_double + (var17_double - var19_double) * 6.0 * var25;
              }
            }
            var11 = Math.pow(var11, (double)field_b);
            var13 = Math.pow(var13, (double)field_b);
            var15 = Math.pow(var15, (double)field_b);
            var17 = (int)(var11 * 256.0);
            var18 = (int)(var13 * 256.0);
            var19 = (int)(var15 * 256.0);
            var20 = (var17 << 16) + (var18 << 8) + var19;
            if (var20 == 0) {
              var20 = 1;
            }
            incrementValue$0 = var2;
            var2++;
            colorPalette[incrementValue$0] = var20;
          }
        }
    }

    final static void setProjectionCenter(int rasterX, int rasterY) {
        int var2 = scanlineOffsets[0];
        int var3 = var2 / SoftwareRaster.width;
        int var4 = var2 - var3 * SoftwareRaster.width;
        projectionCenterX = rasterX - var4;
        projectionCenterY = rasterY - var3;
    }

    final static void b(float param0) {
        TriangleRasterizer.a(param0);
        TriangleRasterizer.a(0, 512);
    }

    public static void b() {
        scanlineOffsets = null;
        colorPalette = null;
        textureProvider = null;
        field_i = null;
        field_m = null;
        sineTable = null;
        cosineTable = null;
    }

    private final static void a(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14) {
        int dupTemp$18 = 0;
        int dupTemp$19 = 0;
        int dupTemp$20 = 0;
        int dupTemp$21 = 0;
        int dupTemp$22 = 0;
        int dupTemp$23 = 0;
        int dupTemp$24 = 0;
        int dupTemp$25 = 0;
        int dupTemp$26 = 0;
        int incrementValue$27 = 0;
        int incrementValue$28 = 0;
        int incrementValue$29 = 0;
        int incrementValue$30 = 0;
        int incrementValue$31 = 0;
        int incrementValue$32 = 0;
        int incrementValue$33 = 0;
        int incrementValue$34 = 0;
        int incrementValue$35 = 0;
        int dupTemp$36 = 0;
        int dupTemp$37 = 0;
        int dupTemp$38 = 0;
        int dupTemp$39 = 0;
        int dupTemp$40 = 0;
        int dupTemp$41 = 0;
        int dupTemp$42 = 0;
        int dupTemp$43 = 0;
        int dupTemp$44 = 0;
        int incrementValue$45 = 0;
        int incrementValue$46 = 0;
        int incrementValue$47 = 0;
        int incrementValue$48 = 0;
        int incrementValue$49 = 0;
        int incrementValue$50 = 0;
        int incrementValue$51 = 0;
        int incrementValue$52 = 0;
        int incrementValue$53 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        if (clipHorizontalSpans) {
          if (param6 > clipWidth) {
            param6 = clipWidth;
          }
          if (param5 < 0) {
            param5 = 0;
          }
        }
        if (param5 >= param6) {
          return;
        }
        param4 = param4 + param5;
        param7 = param7 + param8 * param5;
        var17 = param6 - param5;
        if (!field_p) {
          var23 = param5 - projectionCenterX;
          param9 = param9 + (param12 >> 3) * var23;
          param10 = param10 + (param13 >> 3) * var23;
          param11 = param11 + (param14 >> 3) * var23;
          var22 = param11 >> 14;
          if (var22 == 0) {
            var18 = 0;
            var19 = 0;
          } else {
            var18 = param9 / var22;
            var19 = param10 / var22;
          }
          param9 = param9 + param12;
          param10 = param10 + param13;
          param11 = param11 + param14;
          var22 = param11 >> 14;
          if (var22 == 0) {
            var20 = 0;
            var21 = 0;
          } else {
            var20 = param9 / var22;
            var21 = param10 / var22;
          }
          param2 = (var18 << 18) + var19;
          var16 = (var20 - var18 >> 3 << 18) + (var21 - var19 >> 3);
          var17 = var17 >> 3;
          param8 = param8 << 3;
          var15 = param7 >> 8;
          if (!field_d) {
            if (var17 > 0) {
              do {
                dupTemp$18 = param1[(param2 & 16256) + (param2 >>> 25)];
                param3 = dupTemp$18;
                if (dupTemp$18 != 0) {
                  param0[param4] = ((param3 & 16711935) * var15 & -16711936) + ((param3 & 65280) * var15 & 16711680) >> 8;
                }
                param4++;
                param2 = param2 + var16;
                dupTemp$19 = param1[(param2 & 16256) + (param2 >>> 25)];
                param3 = dupTemp$19;
                if (dupTemp$19 != 0) {
                  param0[param4] = ((param3 & 16711935) * var15 & -16711936) + ((param3 & 65280) * var15 & 16711680) >> 8;
                }
                param4++;
                param2 = param2 + var16;
                dupTemp$20 = param1[(param2 & 16256) + (param2 >>> 25)];
                param3 = dupTemp$20;
                if (dupTemp$20 != 0) {
                  param0[param4] = ((param3 & 16711935) * var15 & -16711936) + ((param3 & 65280) * var15 & 16711680) >> 8;
                }
                param4++;
                param2 = param2 + var16;
                dupTemp$21 = param1[(param2 & 16256) + (param2 >>> 25)];
                param3 = dupTemp$21;
                if (dupTemp$21 != 0) {
                  param0[param4] = ((param3 & 16711935) * var15 & -16711936) + ((param3 & 65280) * var15 & 16711680) >> 8;
                }
                param4++;
                param2 = param2 + var16;
                dupTemp$22 = param1[(param2 & 16256) + (param2 >>> 25)];
                param3 = dupTemp$22;
                if (dupTemp$22 != 0) {
                  param0[param4] = ((param3 & 16711935) * var15 & -16711936) + ((param3 & 65280) * var15 & 16711680) >> 8;
                }
                param4++;
                param2 = param2 + var16;
                dupTemp$23 = param1[(param2 & 16256) + (param2 >>> 25)];
                param3 = dupTemp$23;
                if (dupTemp$23 != 0) {
                  param0[param4] = ((param3 & 16711935) * var15 & -16711936) + ((param3 & 65280) * var15 & 16711680) >> 8;
                }
                param4++;
                param2 = param2 + var16;
                dupTemp$24 = param1[(param2 & 16256) + (param2 >>> 25)];
                param3 = dupTemp$24;
                if (dupTemp$24 != 0) {
                  param0[param4] = ((param3 & 16711935) * var15 & -16711936) + ((param3 & 65280) * var15 & 16711680) >> 8;
                }
                param4++;
                param2 = param2 + var16;
                dupTemp$25 = param1[(param2 & 16256) + (param2 >>> 25)];
                param3 = dupTemp$25;
                if (dupTemp$25 != 0) {
                  param0[param4] = ((param3 & 16711935) * var15 & -16711936) + ((param3 & 65280) * var15 & 16711680) >> 8;
                }
                param4++;
                param2 = param2 + var16;
                var18 = var20;
                var19 = var21;
                param9 = param9 + param12;
                param10 = param10 + param13;
                param11 = param11 + param14;
                var22 = param11 >> 14;
                if (var22 == 0) {
                  var20 = 0;
                  var21 = 0;
                } else {
                  var20 = param9 / var22;
                  var21 = param10 / var22;
                }
                param2 = (var18 << 18) + var19;
                var16 = (var20 - var18 >> 3 << 18) + (var21 - var19 >> 3);
                param7 = param7 + param8;
                var15 = param7 >> 8;
                var17--;
              } while (var17 > 0);
            }
            var17 = param6 - param5 & 7;
            if (var17 > 0) {
              do {
                dupTemp$26 = param1[(param2 & 16256) + (param2 >>> 25)];
                param3 = dupTemp$26;
                if (dupTemp$26 != 0) {
                  param0[param4] = ((param3 & 16711935) * var15 & -16711936) + ((param3 & 65280) * var15 & 16711680) >> 8;
                }
                param4++;
                param2 = param2 + var16;
                var17--;
              } while (var17 > 0);
            }
          } else {
            if (var17 > 0) {
              do {
                param3 = param1[(param2 & 16256) + (param2 >>> 25)];
                incrementValue$27 = param4;
                param4++;
                param0[incrementValue$27] = ((param3 & 16711935) * var15 & -16711936) + ((param3 & 65280) * var15 & 16711680) >> 8;
                param2 = param2 + var16;
                param3 = param1[(param2 & 16256) + (param2 >>> 25)];
                incrementValue$28 = param4;
                param4++;
                param0[incrementValue$28] = ((param3 & 16711935) * var15 & -16711936) + ((param3 & 65280) * var15 & 16711680) >> 8;
                param2 = param2 + var16;
                param3 = param1[(param2 & 16256) + (param2 >>> 25)];
                incrementValue$29 = param4;
                param4++;
                param0[incrementValue$29] = ((param3 & 16711935) * var15 & -16711936) + ((param3 & 65280) * var15 & 16711680) >> 8;
                param2 = param2 + var16;
                param3 = param1[(param2 & 16256) + (param2 >>> 25)];
                incrementValue$30 = param4;
                param4++;
                param0[incrementValue$30] = ((param3 & 16711935) * var15 & -16711936) + ((param3 & 65280) * var15 & 16711680) >> 8;
                param2 = param2 + var16;
                param3 = param1[(param2 & 16256) + (param2 >>> 25)];
                incrementValue$31 = param4;
                param4++;
                param0[incrementValue$31] = ((param3 & 16711935) * var15 & -16711936) + ((param3 & 65280) * var15 & 16711680) >> 8;
                param2 = param2 + var16;
                param3 = param1[(param2 & 16256) + (param2 >>> 25)];
                incrementValue$32 = param4;
                param4++;
                param0[incrementValue$32] = ((param3 & 16711935) * var15 & -16711936) + ((param3 & 65280) * var15 & 16711680) >> 8;
                param2 = param2 + var16;
                param3 = param1[(param2 & 16256) + (param2 >>> 25)];
                incrementValue$33 = param4;
                param4++;
                param0[incrementValue$33] = ((param3 & 16711935) * var15 & -16711936) + ((param3 & 65280) * var15 & 16711680) >> 8;
                param2 = param2 + var16;
                param3 = param1[(param2 & 16256) + (param2 >>> 25)];
                incrementValue$34 = param4;
                param4++;
                param0[incrementValue$34] = ((param3 & 16711935) * var15 & -16711936) + ((param3 & 65280) * var15 & 16711680) >> 8;
                param2 = param2 + var16;
                var18 = var20;
                var19 = var21;
                param9 = param9 + param12;
                param10 = param10 + param13;
                param11 = param11 + param14;
                var22 = param11 >> 14;
                if (var22 == 0) {
                  var20 = 0;
                  var21 = 0;
                } else {
                  var20 = param9 / var22;
                  var21 = param10 / var22;
                }
                param2 = (var18 << 18) + var19;
                var16 = (var20 - var18 >> 3 << 18) + (var21 - var19 >> 3);
                param7 = param7 + param8;
                var15 = param7 >> 8;
                var17--;
              } while (var17 > 0);
            }
            var17 = param6 - param5 & 7;
            if (var17 > 0) {
              do {
                param3 = param1[(param2 & 16256) + (param2 >>> 25)];
                incrementValue$35 = param4;
                param4++;
                param0[incrementValue$35] = ((param3 & 16711935) * var15 & -16711936) + ((param3 & 65280) * var15 & 16711680) >> 8;
                param2 = param2 + var16;
                var17--;
              } while (var17 > 0);
            }
          }
        } else {
          var23 = param5 - projectionCenterX;
          param9 = param9 + (param12 >> 3) * var23;
          param10 = param10 + (param13 >> 3) * var23;
          param11 = param11 + (param14 >> 3) * var23;
          var22 = param11 >> 12;
          if (var22 == 0) {
            var18 = 0;
            var19 = 0;
          } else {
            var18 = param9 / var22;
            var19 = param10 / var22;
          }
          param9 = param9 + param12;
          param10 = param10 + param13;
          param11 = param11 + param14;
          var22 = param11 >> 12;
          if (var22 == 0) {
            var20 = 0;
            var21 = 0;
          } else {
            var20 = param9 / var22;
            var21 = param10 / var22;
          }
          param2 = (var18 << 20) + var19;
          var16 = (var20 - var18 >> 3 << 20) + (var21 - var19 >> 3);
          var17 = var17 >> 3;
          param8 = param8 << 3;
          var15 = param7 >> 8;
          if (!field_d) {
            if (var17 > 0) {
              do {
                dupTemp$36 = param1[(param2 & 4032) + (param2 >>> 26)];
                param3 = dupTemp$36;
                if (dupTemp$36 != 0) {
                  param0[param4] = ((param3 & 16711935) * var15 & -16711936) + ((param3 & 65280) * var15 & 16711680) >> 8;
                }
                param4++;
                param2 = param2 + var16;
                dupTemp$37 = param1[(param2 & 4032) + (param2 >>> 26)];
                param3 = dupTemp$37;
                if (dupTemp$37 != 0) {
                  param0[param4] = ((param3 & 16711935) * var15 & -16711936) + ((param3 & 65280) * var15 & 16711680) >> 8;
                }
                param4++;
                param2 = param2 + var16;
                dupTemp$38 = param1[(param2 & 4032) + (param2 >>> 26)];
                param3 = dupTemp$38;
                if (dupTemp$38 != 0) {
                  param0[param4] = ((param3 & 16711935) * var15 & -16711936) + ((param3 & 65280) * var15 & 16711680) >> 8;
                }
                param4++;
                param2 = param2 + var16;
                dupTemp$39 = param1[(param2 & 4032) + (param2 >>> 26)];
                param3 = dupTemp$39;
                if (dupTemp$39 != 0) {
                  param0[param4] = ((param3 & 16711935) * var15 & -16711936) + ((param3 & 65280) * var15 & 16711680) >> 8;
                }
                param4++;
                param2 = param2 + var16;
                dupTemp$40 = param1[(param2 & 4032) + (param2 >>> 26)];
                param3 = dupTemp$40;
                if (dupTemp$40 != 0) {
                  param0[param4] = ((param3 & 16711935) * var15 & -16711936) + ((param3 & 65280) * var15 & 16711680) >> 8;
                }
                param4++;
                param2 = param2 + var16;
                dupTemp$41 = param1[(param2 & 4032) + (param2 >>> 26)];
                param3 = dupTemp$41;
                if (dupTemp$41 != 0) {
                  param0[param4] = ((param3 & 16711935) * var15 & -16711936) + ((param3 & 65280) * var15 & 16711680) >> 8;
                }
                param4++;
                param2 = param2 + var16;
                dupTemp$42 = param1[(param2 & 4032) + (param2 >>> 26)];
                param3 = dupTemp$42;
                if (dupTemp$42 != 0) {
                  param0[param4] = ((param3 & 16711935) * var15 & -16711936) + ((param3 & 65280) * var15 & 16711680) >> 8;
                }
                param4++;
                param2 = param2 + var16;
                dupTemp$43 = param1[(param2 & 4032) + (param2 >>> 26)];
                param3 = dupTemp$43;
                if (dupTemp$43 != 0) {
                  param0[param4] = ((param3 & 16711935) * var15 & -16711936) + ((param3 & 65280) * var15 & 16711680) >> 8;
                }
                param4++;
                param2 = param2 + var16;
                var18 = var20;
                var19 = var21;
                param9 = param9 + param12;
                param10 = param10 + param13;
                param11 = param11 + param14;
                var22 = param11 >> 12;
                if (var22 == 0) {
                  var20 = 0;
                  var21 = 0;
                } else {
                  var20 = param9 / var22;
                  var21 = param10 / var22;
                }
                param2 = (var18 << 20) + var19;
                var16 = (var20 - var18 >> 3 << 20) + (var21 - var19 >> 3);
                param7 = param7 + param8;
                var15 = param7 >> 8;
                var17--;
              } while (var17 > 0);
            }
            var17 = param6 - param5 & 7;
            if (var17 > 0) {
              do {
                dupTemp$44 = param1[(param2 & 4032) + (param2 >>> 26)];
                param3 = dupTemp$44;
                if (dupTemp$44 != 0) {
                  param0[param4] = ((param3 & 16711935) * var15 & -16711936) + ((param3 & 65280) * var15 & 16711680) >> 8;
                }
                param4++;
                param2 = param2 + var16;
                var17--;
              } while (var17 > 0);
            }
          } else {
            if (var17 > 0) {
              do {
                param3 = param1[(param2 & 4032) + (param2 >>> 26)];
                incrementValue$45 = param4;
                param4++;
                param0[incrementValue$45] = ((param3 & 16711935) * var15 & -16711936) + ((param3 & 65280) * var15 & 16711680) >> 8;
                param2 = param2 + var16;
                param3 = param1[(param2 & 4032) + (param2 >>> 26)];
                incrementValue$46 = param4;
                param4++;
                param0[incrementValue$46] = ((param3 & 16711935) * var15 & -16711936) + ((param3 & 65280) * var15 & 16711680) >> 8;
                param2 = param2 + var16;
                param3 = param1[(param2 & 4032) + (param2 >>> 26)];
                incrementValue$47 = param4;
                param4++;
                param0[incrementValue$47] = ((param3 & 16711935) * var15 & -16711936) + ((param3 & 65280) * var15 & 16711680) >> 8;
                param2 = param2 + var16;
                param3 = param1[(param2 & 4032) + (param2 >>> 26)];
                incrementValue$48 = param4;
                param4++;
                param0[incrementValue$48] = ((param3 & 16711935) * var15 & -16711936) + ((param3 & 65280) * var15 & 16711680) >> 8;
                param2 = param2 + var16;
                param3 = param1[(param2 & 4032) + (param2 >>> 26)];
                incrementValue$49 = param4;
                param4++;
                param0[incrementValue$49] = ((param3 & 16711935) * var15 & -16711936) + ((param3 & 65280) * var15 & 16711680) >> 8;
                param2 = param2 + var16;
                param3 = param1[(param2 & 4032) + (param2 >>> 26)];
                incrementValue$50 = param4;
                param4++;
                param0[incrementValue$50] = ((param3 & 16711935) * var15 & -16711936) + ((param3 & 65280) * var15 & 16711680) >> 8;
                param2 = param2 + var16;
                param3 = param1[(param2 & 4032) + (param2 >>> 26)];
                incrementValue$51 = param4;
                param4++;
                param0[incrementValue$51] = ((param3 & 16711935) * var15 & -16711936) + ((param3 & 65280) * var15 & 16711680) >> 8;
                param2 = param2 + var16;
                param3 = param1[(param2 & 4032) + (param2 >>> 26)];
                incrementValue$52 = param4;
                param4++;
                param0[incrementValue$52] = ((param3 & 16711935) * var15 & -16711936) + ((param3 & 65280) * var15 & 16711680) >> 8;
                param2 = param2 + var16;
                var18 = var20;
                var19 = var21;
                param9 = param9 + param12;
                param10 = param10 + param13;
                param11 = param11 + param14;
                var22 = param11 >> 12;
                if (var22 == 0) {
                  var20 = 0;
                  var21 = 0;
                } else {
                  var20 = param9 / var22;
                  var21 = param10 / var22;
                }
                param2 = (var18 << 20) + var19;
                var16 = (var20 - var18 >> 3 << 20) + (var21 - var19 >> 3);
                param7 = param7 + param8;
                var15 = param7 >> 8;
                var17--;
              } while (var17 > 0);
            }
            var17 = param6 - param5 & 7;
            if (var17 > 0) {
              do {
                param3 = param1[(param2 & 4032) + (param2 >>> 26)];
                incrementValue$53 = param4;
                param4++;
                param0[incrementValue$53] = ((param3 & 16711935) * var15 & -16711936) + ((param3 & 65280) * var15 & 16711680) >> 8;
                param2 = param2 + var16;
                var17--;
              } while (var17 > 0);
            }
          }
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15, int param16, int param17, int param18) {
        int localTemp$4 = 0;
        int localTemp$5 = 0;
        int localTemp$6 = 0;
        int localTemp$7 = 0;
        int localTemp$8 = 0;
        int localTemp$9 = 0;
        int[] var19;
        int var20;
        int var21;
        int var22;
        int var23;
        int var24;
        int var25;
        int var26;
        int var27;
        int var28;
        int var29;
        int var30;
        int var31;
        int var32;
        int var33;
        int var34;
        int var35;
        int var36;
        int var37;
        int var38;
        int var39;
        int var40;
        int var41;
        int[] var42;
        int[] var43;
        boolean stackIn_6_0 = false;
        int var20Lifetime1;
        int var41Lifetime1;
        int var41Lifetime2;
        int var41Lifetime3;
        int var41Lifetime4;
        int var41Lifetime1Lifetime1;
        var43 = textureProvider.getTexturePixels(param18, field_b, -11606);
        var42 = var43;
        var19 = var42;
        if (var19 != null &&
          blendAlpha <= 10) {
          field_p = textureProvider.a(param18, 5409);
          stackIn_6_0 = (textureProvider.b(-26298, param18) == 0);
          field_d = stackIn_6_0;
          var20 = param4 - param3;
          var21 = param1 - param0;
          var22 = param5 - param3;
          var23 = param2 - param0;
          var24 = param7 - param6;
          var25 = param8 - param6;
          var26 = 0;
          if (param1 != param0) {
            var26 = (param4 - param3 << 16) / (param1 - param0);
          }
          var27 = 0;
          if (param2 != param1) {
            var27 = (param5 - param4 << 16) / (param2 - param1);
          }
          var28 = 0;
          if (param2 != param0) {
            var28 = (param3 - param5 << 16) / (param0 - param2);
          }
          var29 = var20 * var23 - var22 * var21;
          if (var29 == 0) {
            return;
          }
          var30 = (var24 * var23 - var25 * var21 << 9) / var29;
          var31 = (var25 * var20 - var24 * var22 << 9) / var29;
          param10 = param9 - param10;
          param13 = param12 - param13;
          param16 = param15 - param16;
          param11 = param11 - param9;
          param14 = param14 - param12;
          param17 = param17 - param15;
          var32 = param11 * param12 - param14 * param9 << 14;
          var33 = param14 * param15 - param17 * param12 << 8;
          var34 = param17 * param9 - param11 * param15 << 5;
          var35 = param10 * param12 - param13 * param9 << 14;
          var36 = param13 * param15 - param16 * param12 << 8;
          var37 = param16 * param9 - param10 * param15 << 5;
          var38 = param13 * param11 - param10 * param14 << 14;
          var39 = param16 * param14 - param13 * param17 << 8;
          var40 = param10 * param17 - param16 * param11 << 5;
          if (param0 <= param1 &&
            param0 <= param2) {
            if (param0 >= clipHeight) {
              return;
            }
            if (param1 > clipHeight) {
              param1 = clipHeight;
            }
            if (param2 > clipHeight) {
              param2 = clipHeight;
            }
            param6 = (param6 << 9) - var30 * param3 + var30;
            if (param1 >= param2) {
              localTemp$4 = param3 << 16;
              param3 = localTemp$4;
              param4 = localTemp$4;
              if (param0 < 0) {
                param4 = param4 - var28 * param0;
                param3 = param3 - var26 * param0;
                param6 = param6 - var31 * param0;
                param0 = 0;
              }
              param5 = param5 << 16;
              if (param2 < 0) {
                param5 = param5 - var27 * param2;
                param2 = 0;
              }
              var41 = param0 - projectionCenterY;
              var32 = var32 + var34 * var41;
              var35 = var35 + var37 * var41;
              var38 = var38 + var40 * var41;
              if ((param0 == param2 ||
                var28 >= var26) && (param0 != param2 ||
                var27 <= var26)) {
                param1 = param1 - param2;
                param2 = param2 - param0;
                param0 = scanlineOffsets[param0];
                while (true) {
                  param2--;
                  if (param2 >= 0) {
                    TriangleRasterizer.a(SoftwareRaster.pixels, var43, 0, 0, param0, param3 >> 16, param4 >> 16, param6, var30, var32, var35, var38, var33, var36, var39);
                    param4 = param4 + var28;
                    param3 = param3 + var26;
                    param6 = param6 + var31;
                    param0 = param0 + SoftwareRaster.width;
                    var32 = var32 + var34;
                    var35 = var35 + var37;
                    var38 = var38 + var40;
                    continue;
                  }
                  break;
                }
                param1--;
                while (param1 >= 0) {
                  TriangleRasterizer.a(SoftwareRaster.pixels, var43, 0, 0, param0, param3 >> 16, param5 >> 16, param6, var30, var32, var35, var38, var33, var36, var39);
                  param5 = param5 + var27;
                  param3 = param3 + var26;
                  param6 = param6 + var31;
                  param0 = param0 + SoftwareRaster.width;
                  var32 = var32 + var34;
                  var35 = var35 + var37;
                  var38 = var38 + var40;
                  param1--;
                }
                return;
              }
              param1 = param1 - param2;
              param2 = param2 - param0;
              param0 = scanlineOffsets[param0];
              while (true) {
                param2--;
                if (param2 >= 0) {
                  TriangleRasterizer.a(SoftwareRaster.pixels, var43, 0, 0, param0, param4 >> 16, param3 >> 16, param6, var30, var32, var35, var38, var33, var36, var39);
                  param4 = param4 + var28;
                  param3 = param3 + var26;
                  param6 = param6 + var31;
                  param0 = param0 + SoftwareRaster.width;
                  var32 = var32 + var34;
                  var35 = var35 + var37;
                  var38 = var38 + var40;
                  continue;
                }
                break;
              }
              param1--;
              while (param1 >= 0) {
                TriangleRasterizer.a(SoftwareRaster.pixels, var43, 0, 0, param0, param5 >> 16, param3 >> 16, param6, var30, var32, var35, var38, var33, var36, var39);
                param5 = param5 + var27;
                param3 = param3 + var26;
                param6 = param6 + var31;
                param0 = param0 + SoftwareRaster.width;
                var32 = var32 + var34;
                var35 = var35 + var37;
                var38 = var38 + var40;
                param1--;
              }
              return;
            }
            localTemp$5 = param3 << 16;
            param3 = localTemp$5;
            param5 = localTemp$5;
            if (param0 < 0) {
              param5 = param5 - var28 * param0;
              param3 = param3 - var26 * param0;
              param6 = param6 - var31 * param0;
              param0 = 0;
            }
            param4 = param4 << 16;
            if (param1 < 0) {
              param4 = param4 - var27 * param1;
              param1 = 0;
            }
            var41Lifetime4 = param0 - projectionCenterY;
            var32 = var32 + var34 * var41Lifetime4;
            var35 = var35 + var37 * var41Lifetime4;
            var38 = var38 + var40 * var41Lifetime4;
            if ((param0 == param1 ||
              var28 >= var26) && (param0 != param1 ||
              var28 <= var27)) {
              param2 = param2 - param1;
              param1 = param1 - param0;
              param0 = scanlineOffsets[param0];
              while (true) {
                param1--;
                if (param1 >= 0) {
                  TriangleRasterizer.a(SoftwareRaster.pixels, var43, 0, 0, param0, param3 >> 16, param5 >> 16, param6, var30, var32, var35, var38, var33, var36, var39);
                  param5 = param5 + var28;
                  param3 = param3 + var26;
                  param6 = param6 + var31;
                  param0 = param0 + SoftwareRaster.width;
                  var32 = var32 + var34;
                  var35 = var35 + var37;
                  var38 = var38 + var40;
                  continue;
                }
                break;
              }
              param2--;
              while (param2 >= 0) {
                TriangleRasterizer.a(SoftwareRaster.pixels, var43, 0, 0, param0, param4 >> 16, param5 >> 16, param6, var30, var32, var35, var38, var33, var36, var39);
                param5 = param5 + var28;
                param4 = param4 + var27;
                param6 = param6 + var31;
                param0 = param0 + SoftwareRaster.width;
                var32 = var32 + var34;
                var35 = var35 + var37;
                var38 = var38 + var40;
                param2--;
              }
              return;
            }
            param2 = param2 - param1;
            param1 = param1 - param0;
            param0 = scanlineOffsets[param0];
            while (true) {
              param1--;
              if (param1 >= 0) {
                TriangleRasterizer.a(SoftwareRaster.pixels, var43, 0, 0, param0, param5 >> 16, param3 >> 16, param6, var30, var32, var35, var38, var33, var36, var39);
                param5 = param5 + var28;
                param3 = param3 + var26;
                param6 = param6 + var31;
                param0 = param0 + SoftwareRaster.width;
                var32 = var32 + var34;
                var35 = var35 + var37;
                var38 = var38 + var40;
                continue;
              }
              break;
            }
            param2--;
            while (param2 >= 0) {
              TriangleRasterizer.a(SoftwareRaster.pixels, var43, 0, 0, param0, param5 >> 16, param4 >> 16, param6, var30, var32, var35, var38, var33, var36, var39);
              param5 = param5 + var28;
              param4 = param4 + var27;
              param6 = param6 + var31;
              param0 = param0 + SoftwareRaster.width;
              var32 = var32 + var34;
              var35 = var35 + var37;
              var38 = var38 + var40;
              param2--;
            }
            return;
          }
          if (param1 > param2) {
            if (param2 >= clipHeight) {
              return;
            }
            if (param0 > clipHeight) {
              param0 = clipHeight;
            }
            if (param1 > clipHeight) {
              param1 = clipHeight;
            }
            param8 = (param8 << 9) - var30 * param5 + var30;
            if (param0 >= param1) {
              localTemp$6 = param5 << 16;
              param5 = localTemp$6;
              param3 = localTemp$6;
              if (param2 < 0) {
                param3 = param3 - var27 * param2;
                param5 = param5 - var28 * param2;
                param8 = param8 - var31 * param2;
                param2 = 0;
              }
              param4 = param4 << 16;
              if (param1 < 0) {
                param4 = param4 - var26 * param1;
                param1 = 0;
              }
              var41Lifetime1 = param2 - projectionCenterY;
              var32 = var32 + var34 * var41Lifetime1;
              var35 = var35 + var37 * var41Lifetime1;
              var38 = var38 + var40 * var41Lifetime1;
              if (var27 >= var28) {
                param0 = param0 - param1;
                param1 = param1 - param2;
                param2 = scanlineOffsets[param2];
                while (true) {
                  param1--;
                  if (param1 >= 0) {
                    TriangleRasterizer.a(SoftwareRaster.pixels, var43, 0, 0, param2, param5 >> 16, param3 >> 16, param8, var30, var32, var35, var38, var33, var36, var39);
                    param3 = param3 + var27;
                    param5 = param5 + var28;
                    param8 = param8 + var31;
                    param2 = param2 + SoftwareRaster.width;
                    var32 = var32 + var34;
                    var35 = var35 + var37;
                    var38 = var38 + var40;
                    continue;
                  }
                  break;
                }
                param0--;
                while (param0 >= 0) {
                  TriangleRasterizer.a(SoftwareRaster.pixels, var43, 0, 0, param2, param5 >> 16, param4 >> 16, param8, var30, var32, var35, var38, var33, var36, var39);
                  param4 = param4 + var26;
                  param5 = param5 + var28;
                  param8 = param8 + var31;
                  param2 = param2 + SoftwareRaster.width;
                  var32 = var32 + var34;
                  var35 = var35 + var37;
                  var38 = var38 + var40;
                  param0--;
                }
                return;
              }
              param0 = param0 - param1;
              param1 = param1 - param2;
              param2 = scanlineOffsets[param2];
              while (true) {
                param1--;
                if (param1 >= 0) {
                  TriangleRasterizer.a(SoftwareRaster.pixels, var43, 0, 0, param2, param3 >> 16, param5 >> 16, param8, var30, var32, var35, var38, var33, var36, var39);
                  param3 = param3 + var27;
                  param5 = param5 + var28;
                  param8 = param8 + var31;
                  param2 = param2 + SoftwareRaster.width;
                  var32 = var32 + var34;
                  var35 = var35 + var37;
                  var38 = var38 + var40;
                  continue;
                }
                break;
              }
              param0--;
              while (param0 >= 0) {
                TriangleRasterizer.a(SoftwareRaster.pixels, var43, 0, 0, param2, param4 >> 16, param5 >> 16, param8, var30, var32, var35, var38, var33, var36, var39);
                param4 = param4 + var26;
                param5 = param5 + var28;
                param8 = param8 + var31;
                param2 = param2 + SoftwareRaster.width;
                var32 = var32 + var34;
                var35 = var35 + var37;
                var38 = var38 + var40;
                param0--;
              }
              return;
            }
            localTemp$7 = param5 << 16;
            param5 = localTemp$7;
            param4 = localTemp$7;
            if (param2 < 0) {
              param4 = param4 - var27 * param2;
              param5 = param5 - var28 * param2;
              param8 = param8 - var31 * param2;
              param2 = 0;
            }
            param3 = param3 << 16;
            if (param0 < 0) {
              param3 = param3 - var26 * param0;
              param0 = 0;
            }
            var41Lifetime1Lifetime1 = param2 - projectionCenterY;
            var32 = var32 + var34 * var41Lifetime1Lifetime1;
            var35 = var35 + var37 * var41Lifetime1Lifetime1;
            var38 = var38 + var40 * var41Lifetime1Lifetime1;
            if (var27 >= var28) {
              param1 = param1 - param0;
              param0 = param0 - param2;
              param2 = scanlineOffsets[param2];
              while (true) {
                param0--;
                if (param0 >= 0) {
                  TriangleRasterizer.a(SoftwareRaster.pixels, var43, 0, 0, param2, param5 >> 16, param4 >> 16, param8, var30, var32, var35, var38, var33, var36, var39);
                  param4 = param4 + var27;
                  param5 = param5 + var28;
                  param8 = param8 + var31;
                  param2 = param2 + SoftwareRaster.width;
                  var32 = var32 + var34;
                  var35 = var35 + var37;
                  var38 = var38 + var40;
                  continue;
                }
                break;
              }
              param1--;
              while (param1 >= 0) {
                TriangleRasterizer.a(SoftwareRaster.pixels, var43, 0, 0, param2, param3 >> 16, param4 >> 16, param8, var30, var32, var35, var38, var33, var36, var39);
                param4 = param4 + var27;
                param3 = param3 + var26;
                param8 = param8 + var31;
                param2 = param2 + SoftwareRaster.width;
                var32 = var32 + var34;
                var35 = var35 + var37;
                var38 = var38 + var40;
                param1--;
              }
              return;
            }
            param1 = param1 - param0;
            param0 = param0 - param2;
            param2 = scanlineOffsets[param2];
            while (true) {
              param0--;
              if (param0 >= 0) {
                TriangleRasterizer.a(SoftwareRaster.pixels, var43, 0, 0, param2, param4 >> 16, param5 >> 16, param8, var30, var32, var35, var38, var33, var36, var39);
                param4 = param4 + var27;
                param5 = param5 + var28;
                param8 = param8 + var31;
                param2 = param2 + SoftwareRaster.width;
                var32 = var32 + var34;
                var35 = var35 + var37;
                var38 = var38 + var40;
                continue;
              }
              break;
            }
            param1--;
            while (param1 >= 0) {
              TriangleRasterizer.a(SoftwareRaster.pixels, var43, 0, 0, param2, param4 >> 16, param3 >> 16, param8, var30, var32, var35, var38, var33, var36, var39);
              param4 = param4 + var27;
              param3 = param3 + var26;
              param8 = param8 + var31;
              param2 = param2 + SoftwareRaster.width;
              var32 = var32 + var34;
              var35 = var35 + var37;
              var38 = var38 + var40;
              param1--;
            }
            return;
          }
          if (param1 >= clipHeight) {
            return;
          }
          if (param2 > clipHeight) {
            param2 = clipHeight;
          }
          if (param0 > clipHeight) {
            param0 = clipHeight;
          }
          param7 = (param7 << 9) - var30 * param4 + var30;
          if (param2 >= param0) {
            localTemp$8 = param4 << 16;
            param4 = localTemp$8;
            param5 = localTemp$8;
            if (param1 < 0) {
              param5 = param5 - var26 * param1;
              param4 = param4 - var27 * param1;
              param7 = param7 - var31 * param1;
              param1 = 0;
            }
            param3 = param3 << 16;
            if (param0 < 0) {
              param3 = param3 - var28 * param0;
              param0 = 0;
            }
            var41Lifetime2 = param1 - projectionCenterY;
            var32 = var32 + var34 * var41Lifetime2;
            var35 = var35 + var37 * var41Lifetime2;
            var38 = var38 + var40 * var41Lifetime2;
            if (var26 >= var27) {
              param2 = param2 - param0;
              param0 = param0 - param1;
              param1 = scanlineOffsets[param1];
              while (true) {
                param0--;
                if (param0 >= 0) {
                  TriangleRasterizer.a(SoftwareRaster.pixels, var43, 0, 0, param1, param4 >> 16, param5 >> 16, param7, var30, var32, var35, var38, var33, var36, var39);
                  param5 = param5 + var26;
                  param4 = param4 + var27;
                  param7 = param7 + var31;
                  param1 = param1 + SoftwareRaster.width;
                  var32 = var32 + var34;
                  var35 = var35 + var37;
                  var38 = var38 + var40;
                  continue;
                }
                break;
              }
              param2--;
              while (param2 >= 0) {
                TriangleRasterizer.a(SoftwareRaster.pixels, var43, 0, 0, param1, param4 >> 16, param3 >> 16, param7, var30, var32, var35, var38, var33, var36, var39);
                param3 = param3 + var28;
                param4 = param4 + var27;
                param7 = param7 + var31;
                param1 = param1 + SoftwareRaster.width;
                var32 = var32 + var34;
                var35 = var35 + var37;
                var38 = var38 + var40;
                param2--;
              }
              return;
            }
            param2 = param2 - param0;
            param0 = param0 - param1;
            param1 = scanlineOffsets[param1];
            while (true) {
              param0--;
              if (param0 >= 0) {
                TriangleRasterizer.a(SoftwareRaster.pixels, var43, 0, 0, param1, param5 >> 16, param4 >> 16, param7, var30, var32, var35, var38, var33, var36, var39);
                param5 = param5 + var26;
                param4 = param4 + var27;
                param7 = param7 + var31;
                param1 = param1 + SoftwareRaster.width;
                var32 = var32 + var34;
                var35 = var35 + var37;
                var38 = var38 + var40;
                continue;
              }
              break;
            }
            param2--;
            while (param2 >= 0) {
              TriangleRasterizer.a(SoftwareRaster.pixels, var43, 0, 0, param1, param3 >> 16, param4 >> 16, param7, var30, var32, var35, var38, var33, var36, var39);
              param3 = param3 + var28;
              param4 = param4 + var27;
              param7 = param7 + var31;
              param1 = param1 + SoftwareRaster.width;
              var32 = var32 + var34;
              var35 = var35 + var37;
              var38 = var38 + var40;
              param2--;
            }
            return;
          }
          localTemp$9 = param4 << 16;
          param4 = localTemp$9;
          param3 = localTemp$9;
          if (param1 < 0) {
            param3 = param3 - var26 * param1;
            param4 = param4 - var27 * param1;
            param7 = param7 - var31 * param1;
            param1 = 0;
          }
          param5 = param5 << 16;
          if (param2 < 0) {
            param5 = param5 - var28 * param2;
            param2 = 0;
          }
          var41Lifetime3 = param1 - projectionCenterY;
          var32 = var32 + var34 * var41Lifetime3;
          var35 = var35 + var37 * var41Lifetime3;
          var38 = var38 + var40 * var41Lifetime3;
          if ((param1 == param2 ||
            var26 >= var27) && (param1 != param2 ||
            var26 <= var28)) {
            param0 = param0 - param2;
            param2 = param2 - param1;
            param1 = scanlineOffsets[param1];
            while (true) {
              param2--;
              if (param2 >= 0) {
                TriangleRasterizer.a(SoftwareRaster.pixels, var43, 0, 0, param1, param4 >> 16, param3 >> 16, param7, var30, var32, var35, var38, var33, var36, var39);
                param3 = param3 + var26;
                param4 = param4 + var27;
                param7 = param7 + var31;
                param1 = param1 + SoftwareRaster.width;
                var32 = var32 + var34;
                var35 = var35 + var37;
                var38 = var38 + var40;
                continue;
              }
              break;
            }
            param0--;
            while (param0 >= 0) {
              TriangleRasterizer.a(SoftwareRaster.pixels, var43, 0, 0, param1, param5 >> 16, param3 >> 16, param7, var30, var32, var35, var38, var33, var36, var39);
              param3 = param3 + var26;
              param5 = param5 + var28;
              param7 = param7 + var31;
              param1 = param1 + SoftwareRaster.width;
              var32 = var32 + var34;
              var35 = var35 + var37;
              var38 = var38 + var40;
              param0--;
            }
            return;
          }
          param0 = param0 - param2;
          param2 = param2 - param1;
          param1 = scanlineOffsets[param1];
          while (true) {
            param2--;
            if (param2 >= 0) {
              TriangleRasterizer.a(SoftwareRaster.pixels, var43, 0, 0, param1, param3 >> 16, param4 >> 16, param7, var30, var32, var35, var38, var33, var36, var39);
              param3 = param3 + var26;
              param4 = param4 + var27;
              param7 = param7 + var31;
              param1 = param1 + SoftwareRaster.width;
              var32 = var32 + var34;
              var35 = var35 + var37;
              var38 = var38 + var40;
              continue;
            }
            break;
          }
          param0--;
          while (param0 >= 0) {
            TriangleRasterizer.a(SoftwareRaster.pixels, var43, 0, 0, param1, param3 >> 16, param5 >> 16, param7, var30, var32, var35, var38, var33, var36, var39);
            param3 = param3 + var26;
            param5 = param5 + var28;
            param7 = param7 + var31;
            param1 = param1 + SoftwareRaster.width;
            var32 = var32 + var34;
            var35 = var35 + var37;
            var38 = var38 + var40;
            param0--;
          }
          return;
        }
        var20Lifetime1 = textureProvider.getAverageTextureColor(param18, (byte) -5);
        TriangleRasterizer.drawShadedTriangle(param0, param1, param2, param3, param4, param5, TriangleRasterizer.b(var20Lifetime1, param6), TriangleRasterizer.b(var20Lifetime1, param7), TriangleRasterizer.b(var20Lifetime1, param8));
    }

    final static void drawShadedTriangle(int yA, int yB, int yC, int xA, int xB, int xC, int colorA, int colorB, int colorC) {
        int localTemp$0 = 0;
        int localTemp$1 = 0;
        int localTemp$2 = 0;
        int localTemp$3 = 0;
        int localTemp$4 = 0;
        int localTemp$5 = 0;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int var18;
        int var19;
        int var20;
        var9 = xB - xA;
        var10 = yB - yA;
        var11 = xC - xA;
        var12 = yC - yA;
        var13 = colorB - colorA;
        var14 = colorC - colorA;
        if (yC == yB) {
          var15 = 0;
        } else {
          var15 = (xC - xB << 16) / (yC - yB);
        }
        if (yB == yA) {
          var16 = 0;
        } else {
          var16 = (var9 << 16) / var10;
        }
        if (yC == yA) {
          var17 = 0;
        } else {
          var17 = (var11 << 16) / var12;
        }
        var18 = var9 * var12 - var11 * var10;
        if (var18 == 0) {
          return;
        }
        var19 = (var13 * var12 - var14 * var10 << 8) / var18;
        var20 = (var14 * var9 - var13 * var11 << 8) / var18;
        if (yA <= yB &&
          yA <= yC) {
          if (yA >= clipHeight) {
            return;
          }
          if (yB > clipHeight) {
            yB = clipHeight;
          }
          if (yC > clipHeight) {
            yC = clipHeight;
          }
          colorA = (colorA << 8) - var19 * xA + var19;
          if (yB >= yC) {
            localTemp$0 = xA << 16;
            xA = localTemp$0;
            xB = localTemp$0;
            if (yA < 0) {
              xB = xB - var17 * yA;
              xA = xA - var16 * yA;
              colorA = colorA - var20 * yA;
              yA = 0;
            }
            xC = xC << 16;
            if (yC < 0) {
              xC = xC - var15 * yC;
              yC = 0;
            }
            if ((yA == yC ||
              var17 >= var16) &&
              (yA != yC ||
              var15 <= var16)) {
              yB = yB - yC;
              yC = yC - yA;
              yA = scanlineOffsets[yA];
              while (true) {
                yC--;
                if (yC >= 0) {
                  TriangleRasterizer.a(SoftwareRaster.pixels, yA, 0, 0, xA >> 16, xB >> 16, colorA, var19);
                  xB = xB + var17;
                  xA = xA + var16;
                  colorA = colorA + var20;
                  yA = yA + SoftwareRaster.width;
                  continue;
                }
                break;
              }
              yB--;
              while (yB >= 0) {
                TriangleRasterizer.a(SoftwareRaster.pixels, yA, 0, 0, xA >> 16, xC >> 16, colorA, var19);
                xC = xC + var15;
                xA = xA + var16;
                colorA = colorA + var20;
                yA = yA + SoftwareRaster.width;
                yB--;
              }
              return;
            }
            yB = yB - yC;
            yC = yC - yA;
            yA = scanlineOffsets[yA];
            while (true) {
              yC--;
              if (yC >= 0) {
                TriangleRasterizer.a(SoftwareRaster.pixels, yA, 0, 0, xB >> 16, xA >> 16, colorA, var19);
                xB = xB + var17;
                xA = xA + var16;
                colorA = colorA + var20;
                yA = yA + SoftwareRaster.width;
                continue;
              }
              break;
            }
            yB--;
            while (yB >= 0) {
              TriangleRasterizer.a(SoftwareRaster.pixels, yA, 0, 0, xC >> 16, xA >> 16, colorA, var19);
              xC = xC + var15;
              xA = xA + var16;
              colorA = colorA + var20;
              yA = yA + SoftwareRaster.width;
              yB--;
            }
            return;
          }
          localTemp$1 = xA << 16;
          xA = localTemp$1;
          xC = localTemp$1;
          if (yA < 0) {
            xC = xC - var17 * yA;
            xA = xA - var16 * yA;
            colorA = colorA - var20 * yA;
            yA = 0;
          }
          xB = xB << 16;
          if (yB < 0) {
            xB = xB - var15 * yB;
            yB = 0;
          }
          if ((yA == yB ||
            var17 >= var16) &&
            (yA != yB ||
            var17 <= var15)) {
            yC = yC - yB;
            yB = yB - yA;
            yA = scanlineOffsets[yA];
            while (true) {
              yB--;
              if (yB >= 0) {
                TriangleRasterizer.a(SoftwareRaster.pixels, yA, 0, 0, xA >> 16, xC >> 16, colorA, var19);
                xC = xC + var17;
                xA = xA + var16;
                colorA = colorA + var20;
                yA = yA + SoftwareRaster.width;
                continue;
              }
              break;
            }
            yC--;
            while (yC >= 0) {
              TriangleRasterizer.a(SoftwareRaster.pixels, yA, 0, 0, xB >> 16, xC >> 16, colorA, var19);
              xC = xC + var17;
              xB = xB + var15;
              colorA = colorA + var20;
              yA = yA + SoftwareRaster.width;
              yC--;
            }
            return;
          }
          yC = yC - yB;
          yB = yB - yA;
          yA = scanlineOffsets[yA];
          while (true) {
            yB--;
            if (yB >= 0) {
              TriangleRasterizer.a(SoftwareRaster.pixels, yA, 0, 0, xC >> 16, xA >> 16, colorA, var19);
              xC = xC + var17;
              xA = xA + var16;
              colorA = colorA + var20;
              yA = yA + SoftwareRaster.width;
              continue;
            }
            break;
          }
          yC--;
          while (yC >= 0) {
            TriangleRasterizer.a(SoftwareRaster.pixels, yA, 0, 0, xC >> 16, xB >> 16, colorA, var19);
            xC = xC + var17;
            xB = xB + var15;
            colorA = colorA + var20;
            yA = yA + SoftwareRaster.width;
            yC--;
          }
          return;
        }
        if (yB > yC) {
          if (yC >= clipHeight) {
            return;
          }
          if (yA > clipHeight) {
            yA = clipHeight;
          }
          if (yB > clipHeight) {
            yB = clipHeight;
          }
          colorC = (colorC << 8) - var19 * xC + var19;
          if (yA >= yB) {
            localTemp$2 = xC << 16;
            xC = localTemp$2;
            xA = localTemp$2;
            if (yC < 0) {
              xA = xA - var15 * yC;
              xC = xC - var17 * yC;
              colorC = colorC - var20 * yC;
              yC = 0;
            }
            xB = xB << 16;
            if (yB < 0) {
              xB = xB - var16 * yB;
              yB = 0;
            }
            if (var15 >= var17) {
              yA = yA - yB;
              yB = yB - yC;
              yC = scanlineOffsets[yC];
              while (true) {
                yB--;
                if (yB >= 0) {
                  TriangleRasterizer.a(SoftwareRaster.pixels, yC, 0, 0, xC >> 16, xA >> 16, colorC, var19);
                  xA = xA + var15;
                  xC = xC + var17;
                  colorC = colorC + var20;
                  yC = yC + SoftwareRaster.width;
                  continue;
                }
                break;
              }
              yA--;
              while (yA >= 0) {
                TriangleRasterizer.a(SoftwareRaster.pixels, yC, 0, 0, xC >> 16, xB >> 16, colorC, var19);
                xB = xB + var16;
                xC = xC + var17;
                colorC = colorC + var20;
                yC = yC + SoftwareRaster.width;
                yA--;
              }
              return;
            }
            yA = yA - yB;
            yB = yB - yC;
            yC = scanlineOffsets[yC];
            while (true) {
              yB--;
              if (yB >= 0) {
                TriangleRasterizer.a(SoftwareRaster.pixels, yC, 0, 0, xA >> 16, xC >> 16, colorC, var19);
                xA = xA + var15;
                xC = xC + var17;
                colorC = colorC + var20;
                yC = yC + SoftwareRaster.width;
                continue;
              }
              break;
            }
            yA--;
            while (yA >= 0) {
              TriangleRasterizer.a(SoftwareRaster.pixels, yC, 0, 0, xB >> 16, xC >> 16, colorC, var19);
              xB = xB + var16;
              xC = xC + var17;
              colorC = colorC + var20;
              yC = yC + SoftwareRaster.width;
              yA--;
            }
            return;
          }
          localTemp$3 = xC << 16;
          xC = localTemp$3;
          xB = localTemp$3;
          if (yC < 0) {
            xB = xB - var15 * yC;
            xC = xC - var17 * yC;
            colorC = colorC - var20 * yC;
            yC = 0;
          }
          xA = xA << 16;
          if (yA < 0) {
            xA = xA - var16 * yA;
            yA = 0;
          }
          if (var15 >= var17) {
            yB = yB - yA;
            yA = yA - yC;
            yC = scanlineOffsets[yC];
            while (true) {
              yA--;
              if (yA >= 0) {
                TriangleRasterizer.a(SoftwareRaster.pixels, yC, 0, 0, xC >> 16, xB >> 16, colorC, var19);
                xB = xB + var15;
                xC = xC + var17;
                colorC = colorC + var20;
                yC = yC + SoftwareRaster.width;
                continue;
              }
              break;
            }
            yB--;
            while (yB >= 0) {
              TriangleRasterizer.a(SoftwareRaster.pixels, yC, 0, 0, xA >> 16, xB >> 16, colorC, var19);
              xB = xB + var15;
              xA = xA + var16;
              colorC = colorC + var20;
              yC = yC + SoftwareRaster.width;
              yB--;
            }
            return;
          }
          yB = yB - yA;
          yA = yA - yC;
          yC = scanlineOffsets[yC];
          while (true) {
            yA--;
            if (yA >= 0) {
              TriangleRasterizer.a(SoftwareRaster.pixels, yC, 0, 0, xB >> 16, xC >> 16, colorC, var19);
              xB = xB + var15;
              xC = xC + var17;
              colorC = colorC + var20;
              yC = yC + SoftwareRaster.width;
              continue;
            }
            break;
          }
          yB--;
          while (yB >= 0) {
            TriangleRasterizer.a(SoftwareRaster.pixels, yC, 0, 0, xB >> 16, xA >> 16, colorC, var19);
            xB = xB + var15;
            xA = xA + var16;
            colorC = colorC + var20;
            yC = yC + SoftwareRaster.width;
            yB--;
          }
          return;
        }
        if (yB >= clipHeight) {
          return;
        }
        if (yC > clipHeight) {
          yC = clipHeight;
        }
        if (yA > clipHeight) {
          yA = clipHeight;
        }
        colorB = (colorB << 8) - var19 * xB + var19;
        if (yC >= yA) {
          localTemp$4 = xB << 16;
          xB = localTemp$4;
          xC = localTemp$4;
          if (yB < 0) {
            xC = xC - var16 * yB;
            xB = xB - var15 * yB;
            colorB = colorB - var20 * yB;
            yB = 0;
          }
          xA = xA << 16;
          if (yA < 0) {
            xA = xA - var17 * yA;
            yA = 0;
          }
          if (var16 >= var15) {
            yC = yC - yA;
            yA = yA - yB;
            yB = scanlineOffsets[yB];
            while (true) {
              yA--;
              if (yA >= 0) {
                TriangleRasterizer.a(SoftwareRaster.pixels, yB, 0, 0, xB >> 16, xC >> 16, colorB, var19);
                xC = xC + var16;
                xB = xB + var15;
                colorB = colorB + var20;
                yB = yB + SoftwareRaster.width;
                continue;
              }
              break;
            }
            yC--;
            while (yC >= 0) {
              TriangleRasterizer.a(SoftwareRaster.pixels, yB, 0, 0, xB >> 16, xA >> 16, colorB, var19);
              xA = xA + var17;
              xB = xB + var15;
              colorB = colorB + var20;
              yB = yB + SoftwareRaster.width;
              yC--;
            }
            return;
          }
          yC = yC - yA;
          yA = yA - yB;
          yB = scanlineOffsets[yB];
          while (true) {
            yA--;
            if (yA >= 0) {
              TriangleRasterizer.a(SoftwareRaster.pixels, yB, 0, 0, xC >> 16, xB >> 16, colorB, var19);
              xC = xC + var16;
              xB = xB + var15;
              colorB = colorB + var20;
              yB = yB + SoftwareRaster.width;
              continue;
            }
            break;
          }
          yC--;
          while (yC >= 0) {
            TriangleRasterizer.a(SoftwareRaster.pixels, yB, 0, 0, xA >> 16, xB >> 16, colorB, var19);
            xA = xA + var17;
            xB = xB + var15;
            colorB = colorB + var20;
            yB = yB + SoftwareRaster.width;
            yC--;
          }
          return;
        }
        localTemp$5 = xB << 16;
        xB = localTemp$5;
        xA = localTemp$5;
        if (yB < 0) {
          xA = xA - var16 * yB;
          xB = xB - var15 * yB;
          colorB = colorB - var20 * yB;
          yB = 0;
        }
        xC = xC << 16;
        if (yC < 0) {
          xC = xC - var17 * yC;
          yC = 0;
        }
        if ((yB == yC ||
          var16 >= var15) &&
          (yB != yC ||
          var16 <= var17)) {
          yA = yA - yC;
          yC = yC - yB;
          yB = scanlineOffsets[yB];
          while (true) {
            yC--;
            if (yC >= 0) {
              TriangleRasterizer.a(SoftwareRaster.pixels, yB, 0, 0, xB >> 16, xA >> 16, colorB, var19);
              xA = xA + var16;
              xB = xB + var15;
              colorB = colorB + var20;
              yB = yB + SoftwareRaster.width;
              continue;
            }
            break;
          }
          yA--;
          while (yA >= 0) {
            TriangleRasterizer.a(SoftwareRaster.pixels, yB, 0, 0, xC >> 16, xA >> 16, colorB, var19);
            xA = xA + var16;
            xC = xC + var17;
            colorB = colorB + var20;
            yB = yB + SoftwareRaster.width;
            yA--;
          }
          return;
        }
        yA = yA - yC;
        yC = yC - yB;
        yB = scanlineOffsets[yB];
        while (true) {
          yC--;
          if (yC >= 0) {
            TriangleRasterizer.a(SoftwareRaster.pixels, yB, 0, 0, xA >> 16, xB >> 16, colorB, var19);
            xA = xA + var16;
            xB = xB + var15;
            colorB = colorB + var20;
            yB = yB + SoftwareRaster.width;
            continue;
          }
          break;
        }
        yA--;
        while (yA >= 0) {
          TriangleRasterizer.a(SoftwareRaster.pixels, yB, 0, 0, xA >> 16, xC >> 16, colorB, var19);
          xA = xA + var16;
          xC = xC + var17;
          colorB = colorB + var20;
          yB = yB + SoftwareRaster.width;
          yA--;
        }
        return;
    }

    private final static int b(int param0, int param1) {
        param1 = param1 * (param0 & 127) >> 7;
        if (param1 < 2) {
          param1 = 2;
        } else {
          if (param1 > 126) {
            param1 = 126;
          }
        }
        return (param0 & 65408) + param1;
    }

    static {
        int var0 = 0;
        int var0Lifetime1;
        int var0Lifetime2;
        field_g = true;
        field_i = new int[512];
        field_d = false;
        clipHorizontalSpans = false;
        field_b = 1.0f;
        sineTable = new int[2048];
        field_p = false;
        scanlineOffsets = new int[1024];
        blendAlpha = 0;
        field_m = new int[2048];
        cosineTable = new int[2048];
        colorPalette = new int[65536];
        for (var0 = 1; var0 < 512; var0++) {
          field_i[var0] = 32768 / var0;
        }
        for (var0Lifetime1 = 1; var0Lifetime1 < 2048; var0Lifetime1++) {
          field_m[var0Lifetime1] = 65536 / var0Lifetime1;
        }
        for (var0Lifetime2 = 0; var0Lifetime2 < 2048; var0Lifetime2++) {
          sineTable[var0Lifetime2] = (int)(65536.0 * Math.sin((double)var0Lifetime2 * 0.0030679615));
          cosineTable[var0Lifetime2] = (int)(65536.0 * Math.cos((double)var0Lifetime2 * 0.0030679615));
        }
    }
}
