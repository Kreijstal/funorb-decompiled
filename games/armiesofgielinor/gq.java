/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gq {
    final static void a(IndexedSprite param0, int param1, int param2, int param3) {
        int var10 = 0;
        int var10Lifetime1;
        int var10Lifetime2;
        param1 = param1 + param0.offsetX;
        param2 = param2 + param0.offsetY;
        int var4 = param1 + param2 * SoftwareRaster.width;
        int var5 = 0;
        int var6 = param0.pixelHeight;
        int var7 = param0.pixelWidth;
        int var8 = SoftwareRaster.width - var7;
        int var9 = 0;
        if (param2 < SoftwareRaster.clipTop) {
          var10 = SoftwareRaster.clipTop - param2;
          var6 = var6 - var10;
          param2 = SoftwareRaster.clipTop;
          var5 = var5 + var10 * var7;
          var4 = var4 + var10 * SoftwareRaster.width;
        }
        if (param2 + var6 > SoftwareRaster.clipBottom) {
          var6 = var6 - (param2 + var6 - SoftwareRaster.clipBottom);
        }
        if (param1 < SoftwareRaster.clipLeft) {
          var10Lifetime1 = SoftwareRaster.clipLeft - param1;
          var7 = var7 - var10Lifetime1;
          param1 = SoftwareRaster.clipLeft;
          var5 = var5 + var10Lifetime1;
          var4 = var4 + var10Lifetime1;
          var9 = var9 + var10Lifetime1;
          var8 = var8 + var10Lifetime1;
        }
        if (param1 + var7 > SoftwareRaster.clipRight) {
          var10Lifetime2 = param1 + var7 - SoftwareRaster.clipRight;
          var7 = var7 - var10Lifetime2;
          var9 = var9 + var10Lifetime2;
          var8 = var8 + var10Lifetime2;
        }
        if (var7 <= 0 ||
          var6 <= 0) {
          return;
        }
        gq.b(SoftwareRaster.pixels, param0.pixelIndices, param0.palette, param3, var5, var4, var7, var6, var8, var9);
    }

    final static int b(int param0) {
        int var1 = param0 >>> 19 & 8191;
        int var2 = param0 >>> 8 & 2047;
        int var3 = param0 & 255;
        int var4 = var1 % 1024;
        int var5 = var3 * (2047 - var2) + 1024 >>> 11 & 255;
        int var6 = var1 >> 10;
        int incrementValue$0 = var6;
        var6--;
        if (incrementValue$0 == 0) {
          return var3 << 16 | (var3 * (2097152 - (1023 - var4) * var2) + 1048576 >>> 21 & 255) << 8 | var5;
        }
        int incrementValue$1 = var6;
        var6--;
        if (incrementValue$1 == 0) {
          return (var3 * (2097152 - var4 * var2) + 1048576 >>> 21 & 255) << 16 | var3 << 8 | var5;
        }
        int incrementValue$2 = var6;
        var6--;
        if (incrementValue$2 == 0) {
          return var5 << 16 | var3 << 8 | var3 * (2097152 - (1023 - var4) * var2) + 1048576 >>> 21 & 255;
        }
        int incrementValue$3 = var6;
        var6--;
        if (incrementValue$3 == 0) {
          return var5 << 16 | (var3 * (2097152 - var4 * var2) + 1048576 >>> 21 & 255) << 8 | var3;
        }
        int incrementValue$4 = var6;
        var6--;
        if (incrementValue$4 == 0) {
          return (var3 * (2097152 - (1023 - var4) * var2) + 1048576 >>> 21 & 255) << 16 | var5 << 8 | var3;
        }
        if (var6 == 0) {
          return var3 << 16 | var5 << 8 | var3 * (2097152 - var4 * var2) + 1048576 >>> 21 & 255;
        }
        return 16711935;
    }

    final static void b(IndexedSprite param0, int param1, int param2, int param3) {
        int var10 = 0;
        int var10Lifetime1;
        int var10Lifetime2;
        param1 = param1 + param0.offsetX;
        param2 = param2 + param0.offsetY;
        int var4 = param1 + param2 * SoftwareRaster.width;
        int var5 = 0;
        int var6 = param0.pixelHeight;
        int var7 = param0.pixelWidth;
        int var8 = SoftwareRaster.width - var7;
        int var9 = 0;
        if (param2 < SoftwareRaster.clipTop) {
          var10 = SoftwareRaster.clipTop - param2;
          var6 = var6 - var10;
          param2 = SoftwareRaster.clipTop;
          var5 = var5 + var10 * var7;
          var4 = var4 + var10 * SoftwareRaster.width;
        }
        if (param2 + var6 > SoftwareRaster.clipBottom) {
          var6 = var6 - (param2 + var6 - SoftwareRaster.clipBottom);
        }
        if (param1 < SoftwareRaster.clipLeft) {
          var10Lifetime1 = SoftwareRaster.clipLeft - param1;
          var7 = var7 - var10Lifetime1;
          param1 = SoftwareRaster.clipLeft;
          var5 = var5 + var10Lifetime1;
          var4 = var4 + var10Lifetime1;
          var9 = var9 + var10Lifetime1;
          var8 = var8 + var10Lifetime1;
        }
        if (param1 + var7 > SoftwareRaster.clipRight) {
          var10Lifetime2 = param1 + var7 - SoftwareRaster.clipRight;
          var7 = var7 - var10Lifetime2;
          var9 = var9 + var10Lifetime2;
          var8 = var8 + var10Lifetime2;
        }
        if (var7 <= 0 ||
          var6 <= 0) {
          return;
        }
        gq.a(SoftwareRaster.pixels, param0.pixelIndices, param0.palette, var5, var4, var7, var6, var8, var9, param3);
    }

    final static int a(int param0) {
        int var4 = 0;
        int var1 = param0 >> 16 & 255;
        int var2 = param0 >> 8 & 255;
        int var3 = param0 & 255;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var4Lifetime4;
        int var4Lifetime5;
        if (var1 >= var2) {
          if (var2 >= var3) {
            if (var3 == var2 &&
              var3 == var1) {
              return var3;
            }
            var4 = var1 - var3;
            return (6144 + 1024 * (var2 - var3) / var4) % 6144 << 19 | var4 * 524032 / var1 & 524032 | var1;
          }
          if (var1 >= var3) {
            var4Lifetime4 = var1 - var2;
            return (6144 + 1024 * (var2 - var3) / var4Lifetime4) % 6144 << 19 | var4Lifetime4 * 524032 / var1 & 524032 | var1;
          }
          var4Lifetime5 = var3 - var2;
          return (4096 + 1024 * (var1 - var2) / var4Lifetime5) % 6144 << 19 | var4Lifetime5 * 524032 / var3 & 524032 | var3;
        }
        if (var1 >= var3) {
          var4Lifetime1 = var2 - var3;
          return (2048 + 1024 * (var3 - var1) / var4Lifetime1) % 6144 << 19 | var4Lifetime1 * 524032 / var2 & 524032 | var2;
        }
        if (var2 >= var3) {
          var4Lifetime2 = var2 - var1;
          return (2048 + 1024 * (var3 - var1) / var4Lifetime2) % 6144 << 19 | var4Lifetime2 * 524032 / var2 & 524032 | var2;
        }
        var4Lifetime3 = var3 - var1;
        return (4096 + 1024 * (var1 - var2) / var4Lifetime3) % 6144 << 19 | var4Lifetime3 * 524032 / var3 & 524032 | var3;
    }

    private final static void b(int[] param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int var11 = 0;
        int incrementValue$2 = 0;
        int incrementValue$4 = 0;
        int incrementValue$6 = 0;
        int incrementValue$8 = 0;
        int incrementValue$0 = 0;
        int var10;
        int var12;
        int var12Lifetime1;
        var10 = -(param6 >> 2);
        param6 = -(param6 & 3);
        for (var11 = -param7; var11 < 0; var11++) {
          for (var12 = var10; var12 < 0; var12++) {
            incrementValue$2 = param4;
            param4++;
            if (param2[param1[incrementValue$2] & 255] == 0) {
              param5++;
            } else {
              param0[param5++] = param3;
            }
            incrementValue$4 = param4;
            param4++;
            if (param2[param1[incrementValue$4] & 255] == 0) {
              param5++;
            } else {
              param0[param5++] = param3;
            }
            incrementValue$6 = param4;
            param4++;
            if (param2[param1[incrementValue$6] & 255] == 0) {
              param5++;
            } else {
              param0[param5++] = param3;
            }
            incrementValue$8 = param4;
            param4++;
            if (param2[param1[incrementValue$8] & 255] == 0) {
              param5++;
            } else {
              param0[param5++] = param3;
            }
          }
          for (var12Lifetime1 = param6; var12Lifetime1 < 0; var12Lifetime1++) {
            incrementValue$0 = param4;
            param4++;
            if (param2[param1[incrementValue$0] & 255] == 0) {
              param5++;
            } else {
              param0[param5++] = param3;
            }
          }
          param5 = param5 + param8;
          param4 = param4 + param9;
        }
    }

    private final static void a(int[] param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int var16 = 0;
        int var17 = 0;
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var18;
        int var19;
        int var20;
        var11 = param9 >> 16 & 255;
        var12 = param9 >> 8 & 255;
        var13 = param9 & 255;
        var14 = -(param5 >> 2);
        param5 = -(param5 & 3);
        var15 = var14 + var14 + var14 + var14 + param5;
        for (var16 = -param6; var16 < 0; var16++) {
          for (var17 = var15; var17 < 0; var17++) {
            boolean decompiledFrameRemainder0 = true;
            incrementValue$0 = param3;
            param3++;
            var10 = param2[param1[incrementValue$0] & 255];
            if (var10 == 0) {
              param4++;
            } else {
              var18 = var10 >> 16 & 255;
              var19 = var10 >> 8 & 255;
              var20 = var10 & 255;
              if (var18 == var19 &&
                var19 == var20) {
                if (var18 > 128) {
                  incrementValue$1 = param4;
                  param4++;
                  param0[incrementValue$1] = (var11 * (256 - var18) + 255 * (var18 - 128) >> 7 << 16) + (var12 * (256 - var19) + 255 * (var19 - 128) >> 7 << 8) + (var13 * (256 - var20) + 255 * (var20 - 128) >> 7);
                } else {
                  incrementValue$2 = param4;
                  param4++;
                  param0[incrementValue$2] = (var18 * var11 >> 7 << 16) + (var19 * var12 >> 7 << 8) + (var20 * var13 >> 7);
                }
                decompiledFrameRemainder0 = false;
              }
              else {
                param0[param4++] = var10;
              }
            }
          }
          param4 = param4 + param7;
          param3 = param3 + param8;
        }
    }
}
