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

    final static void a(int[] param0) {
        param0[0] = clipLeft;
        param0[1] = clipTop;
        param0[2] = clipRight;
        param0[3] = clipBottom;
    }

    final static void g(int param0, int param1, int param2, int param3, int param4) {
        if (param4 == 0) {
          return;
        }
        if (param4 == 256) {
          SoftwareRasterizer.d(param0, param1, param2, param3);
          return;
        }
        if (param2 < 0) {
          param2 = -param2;
        }
        int var5 = 256 - param4;
        int var6 = (param3 >> 16 & 255) * param4;
        int var7 = (param3 >> 8 & 255) * param4;
        int var8 = (param3 & 255) * param4;
        int var12 = param1 - param2;
        if (var12 < clipTop) {
          var12 = clipTop;
        }
        int var13 = param1 + param2 + 1;
        if (var13 > clipBottom) {
          var13 = clipBottom;
        }
        int var14 = var12;
        int var15 = param2 * param2;
        int var16 = 0;
        int var17 = param1 - var14;
        int var18 = var17 * var17;
        int var19 = var18 - var17;
        if (param1 > var13) {
          param1 = var13;
        }
        while (var14 < param1) {
          while (true) {
            if (var19 > var15 &&
              var18 > var15) {
              int var20 = param0 - var16 + 1;
              if (var20 < clipLeft) {
                var20 = clipLeft;
              }
              int var21 = param0 + var16;
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
        int var16Lifetime1 = param2;
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
          int var20Lifetime1 = param0 - var16Lifetime1;
          if (var20Lifetime1 < clipLeft) {
            var20Lifetime1 = clipLeft;
          }
          int var21Lifetime1 = param0 + var16Lifetime1;
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

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        if (param0 < clipLeft) {
          param2 = param2 - (clipLeft - param0);
          param0 = clipLeft;
        }
        if (param1 < clipTop) {
          param3 = param3 - (clipTop - param1);
          param1 = clipTop;
        }
        if (param0 + param2 > clipRight) {
          param2 = clipRight - param0;
        }
        if (param1 + param3 > clipBottom) {
          param3 = clipBottom - param1;
        }
        param4 = ((param4 & 16711935) * param5 >> 8 & 16711935) + ((param4 & 65280) * param5 >> 8 & 65280);
        int var6 = 256 - param5;
        int var7 = width - param2;
        int var8 = param0 + param1 * width;
        for (int var9 = 0; var9 < param3; var9++) {
          for (int var10 = -param2; var10 < 0; var10++) {
            int var11 = pixels[var8];
            var11 = ((var11 & 16711935) * var6 >> 8 & 16711935) + ((var11 & 65280) * var6 >> 8 & 65280);
            int incrementValue$0 = var8;
            var8++;
            pixels[incrementValue$0] = param4 + var11;
          }
          var8 = var8 + var7;
        }
    }

    private final static void f(int param0, int param1, int param2, int param3, int param4) {
        if (param0 >= clipLeft) {
          if (param0 >= clipRight) {
            return;
          }
          if (param1 < clipTop) {
            param2 = param2 - (clipTop - param1);
            param1 = clipTop;
          }
          if (param1 + param2 > clipBottom) {
            param2 = clipBottom - param1;
          }
          int var5 = 256 - param4;
          int var6 = (param3 >> 16 & 255) * param4;
          int var7 = (param3 >> 8 & 255) * param4;
          int var8 = (param3 & 255) * param4;
          int var12 = param0 + param1 * width;
          for (int var13 = 0; var13 < param2; var13++) {
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

    final static void a(int[] param0, int param1, int param2) {
        pixels = param0;
        width = param1;
        height = param2;
        SoftwareRasterizer.setClip(0, 0, param1, param2);
    }

    final static void c() {
        clipLeft = 0;
        clipTop = 0;
        clipRight = width;
        clipBottom = height;
        SoftwareRasterizer.b();
    }

    final static void c(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var6 = 0;
        int var7 = 65536 / param3;
        if (param0 < clipLeft) {
          param2 = param2 - (clipLeft - param0);
          param0 = clipLeft;
        }
        if (param1 < clipTop) {
          var6 = var6 + (clipTop - param1) * var7;
          param3 = param3 - (clipTop - param1);
          param1 = clipTop;
        }
        if (param0 + param2 > clipRight) {
          param2 = clipRight - param0;
        }
        if (param1 + param3 > clipBottom) {
          param3 = clipBottom - param1;
        }
        int var8 = width - param2;
        int var9 = param0 + param1 * width;
        for (int var10 = -param3; var10 < 0; var10++) {
          int var11 = 65536 - var6 >> 8;
          int var12 = var6 >> 8;
          int var13 = ((param4 & 16711935) * var11 + (param5 & 16711935) * var12 & -16711936) + ((param4 & 65280) * var11 + (param5 & 65280) * var12 & 16711680) >>> 8;
          for (int var14 = -param2; var14 < 0; var14++) {
            int incrementValue$0 = var9;
            var9++;
            pixels[incrementValue$0] = var13;
          }
          var9 = var9 + var8;
          var6 = var6 + var7;
        }
    }

    final static void d(int param0, int param1, int param2, int param3, int param4, int param5) {
        SoftwareRasterizer.a(pixels, 0, param2 + param3 * width, param0, param2, param4, width - param4, param5);
        SoftwareRasterizer.a(pixels, 0, param2 + param3 * width, param1, param3, param5, width - param4, param2, param4);
    }

    final static void e(int param0, int param1, int param2, int param3, int param4) {
        for (int var6 = 0; var6 < 4; var6++) {
          int var5 = 128 - (var6 << 5);
          SoftwareRasterizer.c(param0 + var6, param1 + param3 + var6, param2, param4, var5);
          SoftwareRasterizer.f(param0 + param2 + var6, param1 + var6, param3 + 1, param4, var5);
        }
    }

    final static void b(int param0, int param1, int param2, int param3, int param4) {
        SoftwareRasterizer.drawHorizontalLine(param0, param1, param2, param4);
        SoftwareRasterizer.drawHorizontalLine(param0, param1 + param3 - 1, param2, param4);
        SoftwareRasterizer.g(param0, param1, param3, param4);
        SoftwareRasterizer.g(param0 + param2 - 1, param1, param3, param4);
    }

    private final static void c(int param0, int param1, int param2, int param3, int param4) {
        if (param1 >= clipTop) {
          if (param1 >= clipBottom) {
            return;
          }
          if (param0 < clipLeft) {
            param2 = param2 - (clipLeft - param0);
            param0 = clipLeft;
          }
          if (param0 + param2 > clipRight) {
            param2 = clipRight - param0;
          }
          int var5 = 256 - param4;
          int var6 = (param3 >> 16 & 255) * param4;
          int var7 = (param3 >> 8 & 255) * param4;
          int var8 = (param3 & 255) * param4;
          int var12 = param0 + param1 * width;
          for (int var13 = 0; var13 < param2; var13++) {
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

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        if (param0 < clipLeft) {
          param2 = param2 - (clipLeft - param0);
          param0 = clipLeft;
        }
        if (param1 < clipTop) {
          param3 = param3 - (clipTop - param1);
          param1 = clipTop;
        }
        if (param0 + param2 > clipRight) {
          param2 = clipRight - param0;
        }
        if (param1 + param3 > clipBottom) {
          param3 = clipBottom - param1;
        }
        int var5 = width - param2;
        int var6 = param0 + param1 * width;
        for (int var7 = -param3; var7 < 0; var7++) {
          for (int var8 = -param2; var8 < 0; var8++) {
            int incrementValue$0 = var6;
            var6++;
            pixels[incrementValue$0] = param4;
          }
          var6 = var6 + var5;
        }
    }

    private final static void b() {
        maskStarts = null;
        maskWidths = null;
    }

    final static void h(int param0, int param1, int param2, int param3) {
        if (clipLeft < param0) {
          clipLeft = param0;
        }
        if (clipTop < param1) {
          clipTop = param1;
        }
        if (clipRight > param2) {
          clipRight = param2;
        }
        if (clipBottom > param3) {
          clipBottom = param3;
        }
        SoftwareRasterizer.b();
    }

    final static void c(int param0, int param1, int param2, int param3) {
        if (param0 < clipLeft) {
          param2 = param2 - (clipLeft - param0);
          param0 = clipLeft;
        }
        if (param0 + param2 > clipRight) {
          param2 = clipRight - param0;
        }
        if (param1 < clipTop) {
          param3 = param3 - (clipTop - param1);
          param1 = clipTop;
        }
        if (param1 + param3 > clipBottom) {
          param3 = clipBottom - param1;
        }
        int var4 = param0 + param1 * width;
        if (param2 > 0) {
          if (param3 <= 0) {
            return;
          }
          for (int var5 = 0; var5 < param3; var5++) {
            for (int var6 = 0; var6 < param2; var6++) {
              int var7 = pixels[var4];
              int var8 = var7 >> 15 & 510;
              int var9 = var7 >> 8 & 255;
              int var10 = var7 & 255;
              int var11 = (var10 + var8) / 3 + var9 >> 1;
              int incrementValue$0 = var4;
              var4++;
              pixels[incrementValue$0] = (var11 << 16) + (var11 << 8) + var11;
            }
            var4 = var4 + (width - param2);
          }
          return;
        }
    }

    final static void b(int[] param0) {
        clipLeft = param0[0];
        clipTop = param0[1];
        clipRight = param0[2];
        clipBottom = param0[3];
        SoftwareRasterizer.b();
    }

    final static void g(int param0, int param1, int param2, int param3) {
        if (param0 >= clipLeft) {
          if (param0 >= clipRight) {
            return;
          }
          if (param1 < clipTop) {
            param2 = param2 - (clipTop - param1);
            param1 = clipTop;
          }
          if (param1 + param2 > clipBottom) {
            param2 = clipBottom - param1;
          }
          int var4 = param0 + param1 * width;
          int var5 = 0;
          while (var5 < param2) {
            pixels[var4] = param3;
            var5++;
            var4 = var4 + width;
          }
          return;
        }
    }

    private final static void a(int[] param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
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

    final static void b(int param0, int param1, int param2, int param3, int param4, int param5) {
        SoftwareRasterizer.c(param0, param1, param2, param4, param5);
        SoftwareRasterizer.c(param0, param1 + param3 - 1, param2, param4, param5);
        if (param3 >= 3) {
          SoftwareRasterizer.f(param0, param1 + 1, param3 - 2, param4, param5);
          SoftwareRasterizer.f(param0 + param2 - 1, param1 + 1, param3 - 2, param4, param5);
          return;
        }
    }

    final static void d(int param0, int param1, int param2, int param3, int param4) {
        param2 = param2 - param0;
        param3 = param3 - param1;
        if (param3 == 0) {
          if (param2 < 0) {
            SoftwareRasterizer.drawHorizontalLine(param0 + param2, param1, -param2 + 1, param4);
          } else {
            SoftwareRasterizer.drawHorizontalLine(param0, param1, param2 + 1, param4);
          }
          return;
        }
        if (param2 == 0) {
          if (param3 < 0) {
            SoftwareRasterizer.g(param0, param1 + param3, -param3 + 1, param4);
          } else {
            SoftwareRasterizer.g(param0, param1, param3 + 1, param4);
          }
          return;
        }
        if (param2 + param3 < 0) {
          param0 = param0 + param2;
          param2 = -param2;
          param1 = param1 + param3;
          param3 = -param3;
        }
        if (param2 <= param3) {
          param0 = param0 << 16;
          param0 = param0 + 32768;
          param2 = param2 << 16;
          int var5 = (int)Math.floor((double)param2 / (double)param3 + 0.5);
          param3 = param3 + param1;
          if (param1 < clipTop) {
            param0 = param0 + var5 * (clipTop - param1);
            param1 = clipTop;
          }
          if (param3 >= clipBottom) {
            param3 = clipBottom - 1;
          }
          while (param1 <= param3) {
            int var6 = param0 >> 16;
            if (var6 >= clipLeft &&
              var6 < clipRight) {
              pixels[var6 + param1 * width] = param4;
            }
            param0 = param0 + var5;
            param1++;
          }
          return;
        }
        param1 = param1 << 16;
        param1 = param1 + 32768;
        param3 = param3 << 16;
        int var5Lifetime1 = (int)Math.floor((double)param3 / (double)param2 + 0.5);
        param2 = param2 + param0;
        if (param0 < clipLeft) {
          param1 = param1 + var5Lifetime1 * (clipLeft - param0);
          param0 = clipLeft;
        }
        if (param2 >= clipRight) {
          param2 = clipRight - 1;
        }
        while (param0 <= param2) {
          int var6Lifetime1 = param1 >> 16;
          if (var6Lifetime1 >= clipTop &&
            var6Lifetime1 < clipBottom) {
            pixels[param0 + var6Lifetime1 * width] = param4;
          }
          param1 = param1 + var5Lifetime1;
          param0++;
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
        SoftwareRasterizer.b();
    }

    private final static void a(int[] param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
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
        qg.a(var27, 0, param8);
        qg.a(var28, 0, param8);
        qg.a(var29, 0, param8);
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

    private final static void a(int param0, int[] param1, int param2, int param3, int param4, int param5) {
        while (param4 < 0) {
          param2 = param0 + param3 - 7;
          while (param0 < param2) {
            param1[param0] = (param1[param0] & 16711422) >> 1;
            param0++;
            param1[param0] = (param1[param0] & 16711422) >> 1;
            param0++;
            param1[param0] = (param1[param0] & 16711422) >> 1;
            param0++;
            param1[param0] = (param1[param0] & 16711422) >> 1;
            param0++;
            param1[param0] = (param1[param0] & 16711422) >> 1;
            param0++;
            param1[param0] = (param1[param0] & 16711422) >> 1;
            param0++;
            param1[param0] = (param1[param0] & 16711422) >> 1;
            param0++;
            param1[param0] = (param1[param0] & 16711422) >> 1;
            param0++;
          }
          param2 += 7;
          while (param0 < param2) {
            param1[param0] = (param1[param0] & 16711422) >> 1;
            param0++;
          }
          param0 = param0 + param5;
          param4++;
        }
    }

    final static void a(int param0, int param1, int param2) {
        if (param0 >= clipLeft) {
          if (param1 < clipTop ||
            param0 >= clipRight ||
            param1 >= clipBottom) {
            return;
          }
          int var3 = param0 + param1 * width;
          int var4 = pixels[var3];
          int var5 = param2 + var4;
          param2 = (param2 & 16711935) + (var4 & 16711935);
          int var4Lifetime1 = (param2 & 16777472) + (var5 - param2 & 65536);
          pixels[var3] = var5 - var4Lifetime1 | var4Lifetime1 - (var4Lifetime1 >>> 8);
          return;
        }
    }

    final static void d(int param0, int param1, int param2, int param3) {
        if (param2 == 0) {
          SoftwareRasterizer.b(param0, param1, param3);
          return;
        }
        if (param2 < 0) {
          param2 = -param2;
        }
        int var4 = param1 - param2;
        if (var4 < clipTop) {
          var4 = clipTop;
        }
        int var5 = param1 + param2 + 1;
        if (var5 > clipBottom) {
          var5 = clipBottom;
        }
        int var6 = var4;
        int var7 = param2 * param2;
        int var8 = 0;
        int var9 = param1 - var6;
        int var10 = var9 * var9;
        int var11 = var10 - var9;
        if (param1 > var5) {
          param1 = var5;
        }
        while (var6 < param1) {
          while (true) {
            if (var11 > var7 &&
              var10 > var7) {
              int var12 = param0 - var8 + 1;
              if (var12 < clipLeft) {
                var12 = clipLeft;
              }
              int var13 = param0 + var8;
              if (var13 > clipRight) {
                var13 = clipRight;
              }
              int var14 = var12 + var6 * width;
              for (int var15 = var12; var15 < var13; var15++) {
                int incrementValue$4 = var14;
                var14++;
                pixels[incrementValue$4] = param3;
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
        int var8Lifetime1 = param2;
        int var9Lifetime1 = var6 - param1;
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
          int var12Lifetime1 = param0 - var8Lifetime1;
          if (var12Lifetime1 < clipLeft) {
            var12Lifetime1 = clipLeft;
          }
          int var13Lifetime1 = param0 + var8Lifetime1;
          if (var13Lifetime1 > clipRight - 1) {
            var13Lifetime1 = clipRight - 1;
          }
          int var14Lifetime1 = var12Lifetime1 + var6 * width;
          for (int var15Lifetime1 = var12Lifetime1; var15Lifetime1 <= var13Lifetime1; var15Lifetime1++) {
            int incrementValue$2 = var14Lifetime1;
            var14Lifetime1++;
            pixels[incrementValue$2] = param3;
          }
          var6++;
          var11Lifetime1 = var11Lifetime1 + (var9Lifetime1 + var9Lifetime1);
          int incrementValue$1 = var9Lifetime1;
          var9Lifetime1++;
          var10Lifetime1 = var10Lifetime1 + (incrementValue$1 + var9Lifetime1);
        }
        return;
    }

    final static void b(int param0, int param1, int param2, int param3) {
        if (param0 < clipLeft) {
          param2 = param2 - (clipLeft - param0);
          param0 = clipLeft;
        }
        if (param1 < clipTop) {
          param3 = param3 - (clipTop - param1);
          param1 = clipTop;
        }
        if (param0 + param2 > clipRight) {
          param2 = clipRight - param0;
        }
        if (param1 + param3 > clipBottom) {
          param3 = clipBottom - param1;
        }
        int var4 = width - param2;
        int var5 = param0 + param1 * width;
        SoftwareRasterizer.a(var5, pixels, 0, param2, -param3, var4);
    }

    final static void a(int param0, int param1, int param2, int param3) {
        if (param2 == 0) {
          SoftwareRasterizer.b(param0, param1, param3);
          return;
        }
        if (param2 < 0) {
          param2 = -param2;
        }
        if (clipRight > clipLeft) {
          if (clipBottom <= clipTop) {
            return;
          }
          if (param0 + param2 >= clipLeft) {
            if (param0 - param2 < clipRight &&
              param1 + param2 >= clipTop &&
              param1 - param2 < clipBottom) {
              int var4 = param0 + param1 * width;
              int var5 = var4;
              int var6 = var4 - param2 * width;
              int var7 = var4 + param2 * width;
              int var8 = param2;
              int var9 = 0;
              param2 = param2 * param2;
              int var10 = param2 - var8;
              if (param0 - var8 >= clipLeft &&
                param0 + var8 < clipRight &&
                param1 - var8 >= clipTop &&
                param1 + var8 < clipBottom) {
                pixels[var4 - var8] = param3;
                pixels[var4 + var8] = param3;
                pixels[var6] = param3;
                pixels[var7] = param3;
                while (true) {
                  int incrementValue$0 = var9;
                  var9++;
                  var10 = var10 + (incrementValue$0 + var9);
                  var4 = var4 - width;
                  var5 = var5 + width;
                  if (var10 > param2) {
                    var8--;
                    var10 = var10 - (var8 + var8);
                    var6 = var6 + width;
                    var7 = var7 - width;
                  }
                  if (var8 < var9) {
                    return;
                  }
                  pixels[var6 - var9] = param3;
                  pixels[var6 + var9] = param3;
                  pixels[var4 - var8] = param3;
                  pixels[var4 + var8] = param3;
                  pixels[var5 - var8] = param3;
                  pixels[var5 + var8] = param3;
                  pixels[var7 - var9] = param3;
                  pixels[var7 + var9] = param3;
                }
              }
              if (param0 - var8 >= clipLeft &&
                param1 >= clipTop &&
                param1 < clipBottom) {
                pixels[var4 - var8] = param3;
              }
              if (param0 + var8 < clipRight &&
                param1 >= clipTop &&
                param1 < clipBottom) {
                pixels[var4 + var8] = param3;
              }
              if (param1 - var8 >= clipTop) {
                if (param0 >= clipLeft) {
                  if (param0 < clipRight) {
                    pixels[var6] = param3;
                    if (param1 + var8 < clipBottom &&
                      param0 >= clipLeft &&
                      param0 < clipRight) {
                      pixels[var7] = param3;
                    }
                  } else if (param1 + var8 < clipBottom &&
                    param0 >= clipLeft &&
                    param0 < clipRight) {
                    pixels[var7] = param3;
                  }
                } else if (param1 + var8 < clipBottom &&
                  param0 >= clipLeft &&
                  param0 < clipRight) {
                  pixels[var7] = param3;
                }
              } else if (param1 + var8 < clipBottom &&
                param0 >= clipLeft &&
                param0 < clipRight) {
                pixels[var7] = param3;
              }
              while (true) {
                int incrementValue$1 = var9;
                var9++;
                var10 = var10 + (incrementValue$1 + var9);
                var4 = var4 - width;
                var5 = var5 + width;
                if (var10 > param2) {
                  var8--;
                  var10 = var10 - (var8 + var8);
                  var6 = var6 + width;
                  var7 = var7 - width;
                }
                if (var8 < var9) {
                  return;
                }
                if (param1 - var8 >= clipTop &&
                  param1 - var8 < clipBottom) {
                  if (param0 - var9 >= clipLeft &&
                    param0 - var9 < clipRight) {
                    pixels[var6 - var9] = param3;
                  }
                  if (param0 + var9 >= clipLeft &&
                    param0 + var9 < clipRight) {
                    pixels[var6 + var9] = param3;
                  }
                }
                if (param1 - var9 >= clipTop &&
                  param1 - var9 < clipBottom) {
                  if (param0 - var8 >= clipLeft &&
                    param0 - var8 < clipRight) {
                    pixels[var4 - var8] = param3;
                  }
                  if (param0 + var8 >= clipLeft &&
                    param0 + var8 < clipRight) {
                    pixels[var4 + var8] = param3;
                  }
                }
                if (param1 + var9 >= clipTop &&
                  param1 + var9 < clipBottom) {
                  if (param0 - var8 >= clipLeft &&
                    param0 - var8 < clipRight) {
                    pixels[var5 - var8] = param3;
                  }
                  if (param0 + var8 >= clipLeft &&
                    param0 + var8 < clipRight) {
                    pixels[var5 + var8] = param3;
                  }
                }
                if (param1 + var8 < clipTop) {
                  continue;
                }
                if (param1 + var8 >= clipBottom) {
                  continue;
                }
                if (param0 - var9 >= clipLeft &&
                  param0 - var9 < clipRight) {
                  pixels[var7 - var9] = param3;
                }
                if (param0 + var9 < clipLeft) {
                  continue;
                }
                if (param0 + var9 >= clipRight) {
                  continue;
                }
                pixels[var7 + var9] = param3;
              }
            }
            return;
          }
        }
    }

    final static void b(int param0, int param1, int param2) {
        if (param0 >= clipLeft) {
          if (param1 < clipTop ||
            param0 >= clipRight ||
            param1 >= clipBottom) {
            return;
          }
          pixels[param0 + param1 * width] = param2;
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
