/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SoftwareFlatTriangleRasterizer {
    static int clipHeight;
    private static boolean horizontalClipping;
    static int[] rowOffsets;
    private static int[] sineTable;
    private static int[] cosineTable;
    static int destinationWeight;
    static int clipWidth;
    static int centerX;
    private static int[] reciprocal16;
    static int centerY;
    private static int[] reciprocal15;

    final static int getOriginX() {
        return rowOffsets[0] % SoftwareRasterizer2D.width;
    }

    private final static void updateCenter() {
        centerX = clipWidth / 2;
        centerY = clipHeight / 2;
    }

    public static void clearSharedReferences() {
        rowOffsets = null;
        reciprocal15 = null;
        reciprocal16 = null;
        sineTable = null;
        cosineTable = null;
    }

    final static int getOriginY() {
        return rowOffsets[0] / SoftwareRasterizer2D.width;
    }

    final static void setClipFromRaster() {
        SoftwareFlatTriangleRasterizer.setClip(SoftwareRasterizer2D.clipLeft, SoftwareRasterizer2D.clipTop, SoftwareRasterizer2D.clipRight, SoftwareRasterizer2D.clipBottom);
    }

    private final static void fillSpan(int[] param0, int param1, int param2, int param3, int param4, int param5) {
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
        if (horizontalClipping) {
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
        if (destinationWeight == 0) {
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
          if (destinationWeight == 254) {
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
          var6 = destinationWeight;
          var7 = 256 - destinationWeight;
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

    final static void updateHorizontalClipping(int param0, int param1, int param2) {
        boolean stackIn_8_0 = false;
        stackIn_8_0 = !(param0 >= 0) || !(param0 <= clipWidth) || !(param1 >= 0) || !(param1 <= clipWidth) || !(param2 >= 0) || !(param2 <= clipWidth);
        horizontalClipping = stackIn_8_0;
    }

    final static void fillTriangle(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
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
        if (param1 != param0) {
          var7 = (param4 - param3 << 16) / (param1 - param0);
        }
        var8 = 0;
        if (param2 != param1) {
          var8 = (param5 - param4 << 16) / (param2 - param1);
        }
        var9 = 0;
        if (param2 != param0) {
          var9 = (param3 - param5 << 16) / (param0 - param2);
        }
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
          if (param1 >= param2) {
            localTemp$0 = param3 << 16;
            param3 = localTemp$0;
            param4 = localTemp$0;
            if (param0 < 0) {
              param4 = param4 - var9 * param0;
              param3 = param3 - var7 * param0;
              param0 = 0;
            }
            param5 = param5 << 16;
            if (param2 < 0) {
              param5 = param5 - var8 * param2;
              param2 = 0;
            }
            if ((param0 == param2 ||
              var9 >= var7) &&
              (param0 != param2 ||
              var8 <= var7)) {
              param1 = param1 - param2;
              param2 = param2 - param0;
              param0 = rowOffsets[param0];
              while (true) {
                param2--;
                if (param2 >= 0) {
                  SoftwareFlatTriangleRasterizer.fillSpan(SoftwareRasterizer2D.pixels, param0, param6, 0, param3 >> 16, param4 >> 16);
                  param4 = param4 + var9;
                  param3 = param3 + var7;
                  param0 = param0 + SoftwareRasterizer2D.width;
                  continue;
                }
                break;
              }
              param1--;
              while (param1 >= 0) {
                SoftwareFlatTriangleRasterizer.fillSpan(SoftwareRasterizer2D.pixels, param0, param6, 0, param3 >> 16, param5 >> 16);
                param5 = param5 + var8;
                param3 = param3 + var7;
                param0 = param0 + SoftwareRasterizer2D.width;
                param1--;
              }
              return;
            }
            param1 = param1 - param2;
            param2 = param2 - param0;
            param0 = rowOffsets[param0];
            while (true) {
              param2--;
              if (param2 >= 0) {
                SoftwareFlatTriangleRasterizer.fillSpan(SoftwareRasterizer2D.pixels, param0, param6, 0, param4 >> 16, param3 >> 16);
                param4 = param4 + var9;
                param3 = param3 + var7;
                param0 = param0 + SoftwareRasterizer2D.width;
                continue;
              }
              break;
            }
            param1--;
            while (param1 >= 0) {
              SoftwareFlatTriangleRasterizer.fillSpan(SoftwareRasterizer2D.pixels, param0, param6, 0, param5 >> 16, param3 >> 16);
              param5 = param5 + var8;
              param3 = param3 + var7;
              param0 = param0 + SoftwareRasterizer2D.width;
              param1--;
            }
            return;
          }
          localTemp$1 = param3 << 16;
          param3 = localTemp$1;
          param5 = localTemp$1;
          if (param0 < 0) {
            param5 = param5 - var9 * param0;
            param3 = param3 - var7 * param0;
            param0 = 0;
          }
          param4 = param4 << 16;
          if (param1 < 0) {
            param4 = param4 - var8 * param1;
            param1 = 0;
          }
          if ((param0 == param1 ||
            var9 >= var7) &&
            (param0 != param1 ||
            var9 <= var8)) {
            param2 = param2 - param1;
            param1 = param1 - param0;
            param0 = rowOffsets[param0];
            while (true) {
              param1--;
              if (param1 >= 0) {
                SoftwareFlatTriangleRasterizer.fillSpan(SoftwareRasterizer2D.pixels, param0, param6, 0, param3 >> 16, param5 >> 16);
                param5 = param5 + var9;
                param3 = param3 + var7;
                param0 = param0 + SoftwareRasterizer2D.width;
                continue;
              }
              break;
            }
            param2--;
            while (param2 >= 0) {
              SoftwareFlatTriangleRasterizer.fillSpan(SoftwareRasterizer2D.pixels, param0, param6, 0, param4 >> 16, param5 >> 16);
              param5 = param5 + var9;
              param4 = param4 + var8;
              param0 = param0 + SoftwareRasterizer2D.width;
              param2--;
            }
            return;
          }
          param2 = param2 - param1;
          param1 = param1 - param0;
          param0 = rowOffsets[param0];
          while (true) {
            param1--;
            if (param1 >= 0) {
              SoftwareFlatTriangleRasterizer.fillSpan(SoftwareRasterizer2D.pixels, param0, param6, 0, param5 >> 16, param3 >> 16);
              param5 = param5 + var9;
              param3 = param3 + var7;
              param0 = param0 + SoftwareRasterizer2D.width;
              continue;
            }
            break;
          }
          param2--;
          while (param2 >= 0) {
            SoftwareFlatTriangleRasterizer.fillSpan(SoftwareRasterizer2D.pixels, param0, param6, 0, param5 >> 16, param4 >> 16);
            param5 = param5 + var9;
            param4 = param4 + var8;
            param0 = param0 + SoftwareRasterizer2D.width;
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
          if (param0 >= param1) {
            localTemp$2 = param5 << 16;
            param5 = localTemp$2;
            param3 = localTemp$2;
            if (param2 < 0) {
              param3 = param3 - var8 * param2;
              param5 = param5 - var9 * param2;
              param2 = 0;
            }
            param4 = param4 << 16;
            if (param1 < 0) {
              param4 = param4 - var7 * param1;
              param1 = 0;
            }
            if (var8 >= var9) {
              param0 = param0 - param1;
              param1 = param1 - param2;
              param2 = rowOffsets[param2];
              while (true) {
                param1--;
                if (param1 >= 0) {
                  SoftwareFlatTriangleRasterizer.fillSpan(SoftwareRasterizer2D.pixels, param2, param6, 0, param5 >> 16, param3 >> 16);
                  param3 = param3 + var8;
                  param5 = param5 + var9;
                  param2 = param2 + SoftwareRasterizer2D.width;
                  continue;
                }
                break;
              }
              param0--;
              while (param0 >= 0) {
                SoftwareFlatTriangleRasterizer.fillSpan(SoftwareRasterizer2D.pixels, param2, param6, 0, param5 >> 16, param4 >> 16);
                param4 = param4 + var7;
                param5 = param5 + var9;
                param2 = param2 + SoftwareRasterizer2D.width;
                param0--;
              }
              return;
            }
            param0 = param0 - param1;
            param1 = param1 - param2;
            param2 = rowOffsets[param2];
            while (true) {
              param1--;
              if (param1 >= 0) {
                SoftwareFlatTriangleRasterizer.fillSpan(SoftwareRasterizer2D.pixels, param2, param6, 0, param3 >> 16, param5 >> 16);
                param3 = param3 + var8;
                param5 = param5 + var9;
                param2 = param2 + SoftwareRasterizer2D.width;
                continue;
              }
              break;
            }
            param0--;
            while (param0 >= 0) {
              SoftwareFlatTriangleRasterizer.fillSpan(SoftwareRasterizer2D.pixels, param2, param6, 0, param4 >> 16, param5 >> 16);
              param4 = param4 + var7;
              param5 = param5 + var9;
              param2 = param2 + SoftwareRasterizer2D.width;
              param0--;
            }
            return;
          }
          localTemp$3 = param5 << 16;
          param5 = localTemp$3;
          param4 = localTemp$3;
          if (param2 < 0) {
            param4 = param4 - var8 * param2;
            param5 = param5 - var9 * param2;
            param2 = 0;
          }
          param3 = param3 << 16;
          if (param0 < 0) {
            param3 = param3 - var7 * param0;
            param0 = 0;
          }
          if (var8 >= var9) {
            param1 = param1 - param0;
            param0 = param0 - param2;
            param2 = rowOffsets[param2];
            while (true) {
              param0--;
              if (param0 >= 0) {
                SoftwareFlatTriangleRasterizer.fillSpan(SoftwareRasterizer2D.pixels, param2, param6, 0, param5 >> 16, param4 >> 16);
                param4 = param4 + var8;
                param5 = param5 + var9;
                param2 = param2 + SoftwareRasterizer2D.width;
                continue;
              }
              break;
            }
            param1--;
            while (param1 >= 0) {
              SoftwareFlatTriangleRasterizer.fillSpan(SoftwareRasterizer2D.pixels, param2, param6, 0, param3 >> 16, param4 >> 16);
              param4 = param4 + var8;
              param3 = param3 + var7;
              param2 = param2 + SoftwareRasterizer2D.width;
              param1--;
            }
            return;
          }
          param1 = param1 - param0;
          param0 = param0 - param2;
          param2 = rowOffsets[param2];
          while (true) {
            param0--;
            if (param0 >= 0) {
              SoftwareFlatTriangleRasterizer.fillSpan(SoftwareRasterizer2D.pixels, param2, param6, 0, param4 >> 16, param5 >> 16);
              param4 = param4 + var8;
              param5 = param5 + var9;
              param2 = param2 + SoftwareRasterizer2D.width;
              continue;
            }
            break;
          }
          param1--;
          while (param1 >= 0) {
            SoftwareFlatTriangleRasterizer.fillSpan(SoftwareRasterizer2D.pixels, param2, param6, 0, param4 >> 16, param3 >> 16);
            param4 = param4 + var8;
            param3 = param3 + var7;
            param2 = param2 + SoftwareRasterizer2D.width;
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
        if (param2 >= param0) {
          localTemp$4 = param4 << 16;
          param4 = localTemp$4;
          param5 = localTemp$4;
          if (param1 < 0) {
            param5 = param5 - var7 * param1;
            param4 = param4 - var8 * param1;
            param1 = 0;
          }
          param3 = param3 << 16;
          if (param0 < 0) {
            param3 = param3 - var9 * param0;
            param0 = 0;
          }
          if (var7 >= var8) {
            param2 = param2 - param0;
            param0 = param0 - param1;
            param1 = rowOffsets[param1];
            while (true) {
              param0--;
              if (param0 >= 0) {
                SoftwareFlatTriangleRasterizer.fillSpan(SoftwareRasterizer2D.pixels, param1, param6, 0, param4 >> 16, param5 >> 16);
                param5 = param5 + var7;
                param4 = param4 + var8;
                param1 = param1 + SoftwareRasterizer2D.width;
                continue;
              }
              break;
            }
            param2--;
            while (param2 >= 0) {
              SoftwareFlatTriangleRasterizer.fillSpan(SoftwareRasterizer2D.pixels, param1, param6, 0, param4 >> 16, param3 >> 16);
              param3 = param3 + var9;
              param4 = param4 + var8;
              param1 = param1 + SoftwareRasterizer2D.width;
              param2--;
            }
            return;
          }
          param2 = param2 - param0;
          param0 = param0 - param1;
          param1 = rowOffsets[param1];
          while (true) {
            param0--;
            if (param0 >= 0) {
              SoftwareFlatTriangleRasterizer.fillSpan(SoftwareRasterizer2D.pixels, param1, param6, 0, param5 >> 16, param4 >> 16);
              param5 = param5 + var7;
              param4 = param4 + var8;
              param1 = param1 + SoftwareRasterizer2D.width;
              continue;
            }
            break;
          }
          param2--;
          while (param2 >= 0) {
            SoftwareFlatTriangleRasterizer.fillSpan(SoftwareRasterizer2D.pixels, param1, param6, 0, param3 >> 16, param4 >> 16);
            param3 = param3 + var9;
            param4 = param4 + var8;
            param1 = param1 + SoftwareRasterizer2D.width;
            param2--;
          }
          return;
        }
        localTemp$5 = param4 << 16;
        param4 = localTemp$5;
        param3 = localTemp$5;
        if (param1 < 0) {
          param3 = param3 - var7 * param1;
          param4 = param4 - var8 * param1;
          param1 = 0;
        }
        param5 = param5 << 16;
        if (param2 < 0) {
          param5 = param5 - var9 * param2;
          param2 = 0;
        }
        if ((param1 == param2 ||
          var7 >= var8) &&
          (param1 != param2 ||
          var7 <= var9)) {
          param0 = param0 - param2;
          param2 = param2 - param1;
          param1 = rowOffsets[param1];
          while (true) {
            param2--;
            if (param2 >= 0) {
              SoftwareFlatTriangleRasterizer.fillSpan(SoftwareRasterizer2D.pixels, param1, param6, 0, param4 >> 16, param3 >> 16);
              param3 = param3 + var7;
              param4 = param4 + var8;
              param1 = param1 + SoftwareRasterizer2D.width;
              continue;
            }
            break;
          }
          param0--;
          while (param0 >= 0) {
            SoftwareFlatTriangleRasterizer.fillSpan(SoftwareRasterizer2D.pixels, param1, param6, 0, param5 >> 16, param3 >> 16);
            param3 = param3 + var7;
            param5 = param5 + var9;
            param1 = param1 + SoftwareRasterizer2D.width;
            param0--;
          }
          return;
        }
        param0 = param0 - param2;
        param2 = param2 - param1;
        param1 = rowOffsets[param1];
        while (true) {
          param2--;
          if (param2 >= 0) {
            SoftwareFlatTriangleRasterizer.fillSpan(SoftwareRasterizer2D.pixels, param1, param6, 0, param3 >> 16, param4 >> 16);
            param3 = param3 + var7;
            param4 = param4 + var8;
            param1 = param1 + SoftwareRasterizer2D.width;
            continue;
          }
          break;
        }
        param0--;
        while (param0 >= 0) {
          SoftwareFlatTriangleRasterizer.fillSpan(SoftwareRasterizer2D.pixels, param1, param6, 0, param3 >> 16, param5 >> 16);
          param3 = param3 + var7;
          param5 = param5 + var9;
          param1 = param1 + SoftwareRasterizer2D.width;
          param0--;
        }
        return;
    }

    private final static void setClip(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        clipWidth = param2 - param0;
        clipHeight = param3 - param1;
        SoftwareFlatTriangleRasterizer.updateCenter();
        if (rowOffsets.length < clipHeight) {
          rowOffsets = new int[GetSalvoaim.a(clipHeight, (byte) -105)];
        }
        int var4 = param1 * SoftwareRasterizer2D.width + param0;
        for (var5 = 0; var5 < clipHeight; var5++) {
          rowOffsets[var5] = var4;
          var4 = var4 + SoftwareRasterizer2D.width;
        }
    }

    static {
        int var0 = 0;
        int var0Lifetime1;
        int var0Lifetime2;
        horizontalClipping = false;
        cosineTable = new int[2048];
        sineTable = new int[2048];
        reciprocal16 = new int[2048];
        rowOffsets = new int[1024];
        destinationWeight = 0;
        reciprocal15 = new int[512];
        for (var0 = 1; var0 < 512; var0++) {
          reciprocal15[var0] = 32768 / var0;
        }
        for (var0Lifetime1 = 1; var0Lifetime1 < 2048; var0Lifetime1++) {
          reciprocal16[var0Lifetime1] = 65536 / var0Lifetime1;
        }
        for (var0Lifetime2 = 0; var0Lifetime2 < 2048; var0Lifetime2++) {
          sineTable[var0Lifetime2] = (int)(65536.0 * Math.sin((double)var0Lifetime2 * 0.0030679615));
          cosineTable[var0Lifetime2] = (int)(65536.0 * Math.cos((double)var0Lifetime2 * 0.0030679615));
        }
    }
}
