/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class la {
    static lo field_a;
    static mh field_b;
    static boolean field_c;

    private final static void b(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13) {
        int incrementValue$1 = 0;
        int var14;
        int var15;
        int var16;
        int var17;
        int var18;
        int var19;
        int var20;
        int var21;
        int var22;
        int var23;
        int var24;
        int var25;
        int var26;
        int var15Lifetime1;
        int var16Lifetime1;
        int var17Lifetime1;
        int var18Lifetime1;
        int var19Lifetime1;
        int var20Lifetime1;
        int var21Lifetime1;
        int var22Lifetime1;
        int var23Lifetime1;
        int var24Lifetime1;
        int var25Lifetime1;
        int var26Lifetime1;
        int var24Lifetime2;
        int var24Lifetime1Lifetime1;
        var14 = (param0 << 4) - param13;
        var15 = param11;
        var16 = param1;
        var17 = param2;
        for (var18 = param8; var18 < param9; var18++) {
          if (var16 < param5) {
            var19 = (var18 << 4) - param12;
            var20 = (var16 << param4) / param6;
            var21 = Brick.field_L[var20] * param10 >> 15;
            var22 = var18 + (var19 * var21 + 131072 >> 18);
            if (var22 > Rasterizer2D.width - 1) {
              var22 = Rasterizer2D.width - 1;
            }
            var23 = param0 + (var14 * var21 + 131072 >> 18);
            if (var23 < 0) {
              var23 = 0;
            }
            var24 = Rasterizer2D.pixels[var23 * Rasterizer2D.width + var22];
            var25 = 64;
            if (var25 < 0) {
              var25 = -var25;
            }
            var26 = (var24 & 16711935) * var25;
            var25 = (var24 & 65280) * var25;
            var24Lifetime2 = (var26 & 1069563840) + (var25 & 4177920);
            var26 = (var26 & -1073692672) + (var25 & 12582912);
            var26 = (var26 | var26 >>> 1) & 1077952512;
            incrementValue$1 = var15;
            var15++;
            Rasterizer2D.pixels[incrementValue$1] = (var24Lifetime2 | var26 - (var26 >>> 8)) >>> 6;
            var16 = var16 + var17;
            var17 = var17 + param3;
            continue;
          }
          break;
        }
        var15Lifetime1 = param11;
        var16Lifetime1 = param1;
        var17Lifetime1 = param2;
        for (var18Lifetime1 = param8 - 1; var18Lifetime1 >= param7; var18Lifetime1--) {
          var17Lifetime1 = var17Lifetime1 - param3;
          var16Lifetime1 = var16Lifetime1 - var17Lifetime1;
          if (var16Lifetime1 < param5) {
            var19Lifetime1 = (var18Lifetime1 << 4) - param12;
            var20Lifetime1 = (var16Lifetime1 << param4) / param6;
            var21Lifetime1 = Brick.field_L[var20Lifetime1] * param10 >> 15;
            var22Lifetime1 = var18Lifetime1 + (var19Lifetime1 * var21Lifetime1 + 131072 >> 18);
            if (var22Lifetime1 < 0) {
              var22Lifetime1 = 0;
            }
            var23Lifetime1 = param0 + (var14 * var21Lifetime1 + 131072 >> 18);
            if (var23Lifetime1 < 0) {
              var23Lifetime1 = 0;
            }
            var24Lifetime1 = Rasterizer2D.pixels[var23Lifetime1 * Rasterizer2D.width + var22Lifetime1];
            var25Lifetime1 = 64;
            if (var25Lifetime1 < 0) {
              var25Lifetime1 = -var25Lifetime1;
            }
            var26Lifetime1 = (var24Lifetime1 & 16711935) * var25Lifetime1;
            var25Lifetime1 = (var24Lifetime1 & 65280) * var25Lifetime1;
            var24Lifetime1Lifetime1 = (var26Lifetime1 & 1069563840) + (var25Lifetime1 & 4177920);
            var26Lifetime1 = (var26Lifetime1 & -1073692672) + (var25Lifetime1 & 12582912);
            var26Lifetime1 = (var26Lifetime1 | var26Lifetime1 >>> 1) & 1077952512;
            var15Lifetime1--;
            Rasterizer2D.pixels[var15Lifetime1] = (var24Lifetime1Lifetime1 | var26Lifetime1 - (var26Lifetime1 >>> 8)) >>> 6;
            continue;
          }
          break;
        }
    }

    private final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13) {
        int incrementValue$1 = 0;
        int var14;
        int var15;
        int var16;
        int var17;
        int var18;
        int var19;
        int var20;
        int var21;
        int var22;
        int var23;
        int var24;
        int var25;
        int var26;
        int var15Lifetime1;
        int var16Lifetime1;
        int var17Lifetime1;
        int var18Lifetime1;
        int var19Lifetime1;
        int var20Lifetime1;
        int var21Lifetime1;
        int var22Lifetime1;
        int var23Lifetime1;
        int var24Lifetime1;
        int var25Lifetime1;
        int var26Lifetime1;
        int var24Lifetime2;
        int var24Lifetime1Lifetime1;
        var14 = (param0 << 4) - param13;
        var15 = param11;
        var16 = param1;
        var17 = param2;
        for (var18 = param8; var18 < param9; var18++) {
          if (var16 < param5) {
            var19 = (var18 << 4) - param12;
            var20 = (var16 << param4) / param6;
            var21 = Brick.field_L[var20] * param10 >> 15;
            var22 = var18 + (var19 * var21 + 131072 >> 18);
            if (var22 > Rasterizer2D.width - 1) {
              var22 = Rasterizer2D.width - 1;
            }
            var23 = param0 + (var14 * var21 + 131072 >> 18);
            if (var23 > Rasterizer2D.height - 1) {
              var23 = Rasterizer2D.height - 1;
            }
            var24 = Rasterizer2D.pixels[var23 * Rasterizer2D.width + var22];
            var25 = 64;
            if (var25 < 0) {
              throw new Error();
            }
            var26 = (var24 & 16711935) * var25;
            var25 = (var24 & 65280) * var25;
            var24Lifetime2 = (var26 & 1069563840) + (var25 & 4177920);
            var26 = (var26 & -1073692672) + (var25 & 12582912);
            var26 = (var26 | var26 >>> 1) & 1077952512;
            incrementValue$1 = var15;
            var15++;
            Rasterizer2D.pixels[incrementValue$1] = (var24Lifetime2 | var26 - (var26 >>> 8)) >>> 6;
            var16 = var16 + var17;
            var17 = var17 + param3;
            continue;
          }
          break;
        }
        var15Lifetime1 = param11;
        var16Lifetime1 = param1;
        var17Lifetime1 = param2;
        for (var18Lifetime1 = param8 - 1; var18Lifetime1 >= param7; var18Lifetime1--) {
          var17Lifetime1 = var17Lifetime1 - param3;
          var16Lifetime1 = var16Lifetime1 - var17Lifetime1;
          if (var16Lifetime1 < param5) {
            var19Lifetime1 = (var18Lifetime1 << 4) - param12;
            var20Lifetime1 = (var16Lifetime1 << param4) / param6;
            var21Lifetime1 = Brick.field_L[var20Lifetime1] * param10 >> 15;
            var22Lifetime1 = var18Lifetime1 + (var19Lifetime1 * var21Lifetime1 + 131072 >> 18);
            if (var22Lifetime1 < 0) {
              var22Lifetime1 = 0;
            }
            var23Lifetime1 = param0 + (var14 * var21Lifetime1 + 131072 >> 18);
            if (var23Lifetime1 > Rasterizer2D.height - 1) {
              var23Lifetime1 = Rasterizer2D.height - 1;
            }
            var24Lifetime1 = Rasterizer2D.pixels[var23Lifetime1 * Rasterizer2D.width + var22Lifetime1];
            var25Lifetime1 = 64;
            if (var25Lifetime1 < 0) {
              var25Lifetime1 = -var25Lifetime1;
            }
            var26Lifetime1 = (var24Lifetime1 & 16711935) * var25Lifetime1;
            var25Lifetime1 = (var24Lifetime1 & 65280) * var25Lifetime1;
            var24Lifetime1Lifetime1 = (var26Lifetime1 & 1069563840) + (var25Lifetime1 & 4177920);
            var26Lifetime1 = (var26Lifetime1 & -1073692672) + (var25Lifetime1 & 12582912);
            var26Lifetime1 = (var26Lifetime1 | var26Lifetime1 >>> 1) & 1077952512;
            var15Lifetime1--;
            Rasterizer2D.pixels[var15Lifetime1] = (var24Lifetime1Lifetime1 | var26Lifetime1 - (var26Lifetime1 >>> 8)) >>> 6;
            continue;
          }
          break;
        }
    }

    private final static void a(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int[] param11) {
        int incrementValue$14 = 0;
        for (param6 = -param8; param6 < 0; param6++) {
          for (param5 = -param7; param5 < 0; param5++) {
            param2 = param1[param3++];
            if (param2 == 0) {
              param4++;
            } else {
              if (param2 >> 8 != (param2 & 65535)) {
                param0[param4++] = param2;
              } else {
                param2 = param2 & 255;
                incrementValue$14 = param4;
                param4++;
                param0[incrementValue$14] = param11[param2];
              }
            }
          }
          param4 = param4 + param9;
          param3 = param3 + param10;
        }
    }

    final static void a(int[] param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var9 = 0;
        param7--;
        while (param7 >= 0) {
          for (var9 = param6 - 1; var9 >= 0; var9--) {
            if (param0[param1] > 1) {
              param2 = param1 - 1;
              param3 = param1 + 1;
              param4 = param1 - Rasterizer2D.width;
              param5 = param1 + Rasterizer2D.width;
              if (param0[param4 + 1] == 0) {
                param0[param4 + 1] = 1;
              }
              if (param0[param5 + 1] == 0) {
                param0[param5 + 1] = 1;
              }
              if (param0[param4 - 1] == 0) {
                param0[param4 - 1] = 1;
              }
              if (param0[param5 - 1] == 0) {
                param0[param5 - 1] = 1;
              }
              if (param0[param2] == 0) {
                param0[param2] = 1;
              }
              if (param0[param3] == 0) {
                param0[param3] = 1;
              }
              if (param0[param4] == 0) {
                param0[param4] = 1;
              }
              if (param0[param5] == 0) {
                param0[param5] = 1;
              }
              if (param0[param2 - 1] == 0) {
                param0[param2 - 1] = 1;
              }
              if (param0[param3 + 1] == 0) {
                param0[param3 + 1] = 1;
              }
              if (param0[param4 - Rasterizer2D.width] == 0) {
                param0[param4 - Rasterizer2D.width] = 1;
              }
              if (param0[param5 + Rasterizer2D.width] == 0) {
                param0[param5 + Rasterizer2D.width] = 1;
              }
            }
            param1++;
          }
          param1 = param1 + param8;
          param7--;
        }
    }

    final static void drawBubbleDistortion(int centerX16, int centerY16, int radius16, int distortionAmount) {
        int var28 = 0;
        int var4 = radius16 * radius16;
        int var5 = centerX16 - radius16 >> 4;
        int var6 = centerX16 + 15 >> 4;
        int var7 = centerX16 + radius16 + 15 >> 4;
        int var8 = centerY16 - radius16 >> 4;
        int var9 = centerY16 + 15 >> 4;
        int var10 = centerY16 + radius16 + 15 >> 4;
        int var28Lifetime1;
        if (var5 < 0) {
          var5 = 0;
        }
        if (var7 > Rasterizer2D.width) {
          var7 = Rasterizer2D.width;
        }
        if (var8 < 0) {
          var8 = 0;
        }
        if (var10 > Rasterizer2D.height) {
          var10 = Rasterizer2D.height;
        }
        if (var6 < 0) {
          var6 = 0;
        }
        if (var6 > Rasterizer2D.width) {
          var6 = Rasterizer2D.width;
        }
        if (var9 < 0) {
          var9 = 0;
        }
        if (var9 > Rasterizer2D.height) {
          var9 = Rasterizer2D.height;
        }
        int var11 = (var6 << 4) - centerX16;
        var11 = var11 * var11;
        int var12 = (var6 + 1 << 4) - centerX16;
        var12 = var12 * var12;
        int var13 = (var6 + 2 << 4) - centerX16;
        var13 = var13 * var13;
        int var14 = var12 - var11;
        int var15 = var13 - var12;
        int var16 = var15 - var14;
        int var17 = (var9 << 4) - centerY16;
        var17 = var17 * var17;
        int var18 = (var9 + 1 << 4) - centerY16;
        var18 = var18 * var18;
        int var19 = (var9 + 2 << 4) - centerY16;
        var19 = var19 * var19;
        int var20 = var18 - var17;
        int var21 = var19 - var18;
        int var22 = var21 - var20;
        int var23 = 16;
        int var24 = var4;
        while (var4 > 2147483647 >>> var23) {
          var23--;
          var24 = var24 + 1 >>> 1;
        }
        int var25 = var9 * Rasterizer2D.width + var6;
        int var26 = var11 + var17;
        int var27 = var20;
        for (var28 = var9; var28 < var10; var28++) {
          la.a(var28, var26, var14, var16, var23, var4, var24, var5, var6, var7, distortionAmount, var25, centerX16, centerY16);
          var26 = var26 + var27;
          var27 = var27 + var22;
          var25 = var25 + Rasterizer2D.width;
        }
        var25 = var9 * Rasterizer2D.width + var6;
        var26 = var11 + var17;
        var27 = var20;
        for (var28Lifetime1 = var9 - 1; var28Lifetime1 >= var8; var28Lifetime1--) {
          var27 = var27 - var22;
          var26 = var26 - var27;
          var25 = var25 - Rasterizer2D.width;
          la.b(var28Lifetime1, var26, var14, var16, var23, var4, var24, var5, var6, var7, distortionAmount, var25, centerX16, centerY16);
        }
    }

    final static void a(RgbSprite param0, int param1, int param2, int[] param3) {
        int var10 = 0;
        int var10Lifetime1;
        int var10Lifetime2;
        param1 = param1 + param0.offsetX;
        param2 = param2 + param0.offsetY;
        int var4 = param1 + param2 * Rasterizer2D.width;
        int var5 = 0;
        int var6 = param0.height;
        int var7 = param0.width;
        int var8 = Rasterizer2D.width - var7;
        int var9 = 0;
        if (param2 < Rasterizer2D.clipTop) {
          var10 = Rasterizer2D.clipTop - param2;
          var6 = var6 - var10;
          param2 = Rasterizer2D.clipTop;
          var5 = var5 + var10 * var7;
          var4 = var4 + var10 * Rasterizer2D.width;
        }
        if (param2 + var6 > Rasterizer2D.clipBottom) {
          var6 = var6 - (param2 + var6 - Rasterizer2D.clipBottom);
        }
        if (param1 < Rasterizer2D.clipLeft) {
          var10Lifetime1 = Rasterizer2D.clipLeft - param1;
          var7 = var7 - var10Lifetime1;
          param1 = Rasterizer2D.clipLeft;
          var5 = var5 + var10Lifetime1;
          var4 = var4 + var10Lifetime1;
          var9 = var9 + var10Lifetime1;
          var8 = var8 + var10Lifetime1;
        }
        if (param1 + var7 > Rasterizer2D.clipRight) {
          var10Lifetime2 = param1 + var7 - Rasterizer2D.clipRight;
          var7 = var7 - var10Lifetime2;
          var9 = var9 + var10Lifetime2;
          var8 = var8 + var10Lifetime2;
        }
        if (var7 <= 0 ||
          var6 <= 0) {
          return;
        }
        la.a(Rasterizer2D.pixels, param0.pixels, 0, var5, var4, 0, 0, var7, var6, var8, var9, param3);
    }

    public static void a(byte param0) {
        field_a = null;
        field_b = null;
        if (param0 >= -59) {
          int[] var2 = (int[]) null;
          la.a(4, 89, -93, -46, -111, (int[]) null, 101);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int incrementValue$0 = 0;
        int var7 = 0;
        int var8 = 65536 / param3;
        int var9 = 255 - param6;
        if (param0 < Rasterizer2D.clipLeft) {
          param2 = param2 - (Rasterizer2D.clipLeft - param0);
          param0 = Rasterizer2D.clipLeft;
        }
        if (param1 < Rasterizer2D.clipTop) {
          var7 = var7 + (Rasterizer2D.clipTop - param1) * var8;
          param3 = param3 - (Rasterizer2D.clipTop - param1);
          param1 = Rasterizer2D.clipTop;
        }
        if (param0 + param2 > Rasterizer2D.clipRight) {
          param2 = Rasterizer2D.clipRight - param0;
        }
        if (param1 + param3 > Rasterizer2D.clipBottom) {
          param3 = Rasterizer2D.clipBottom - param1;
        }
        int var10 = Rasterizer2D.width - param2;
        int var11 = param0 + param1 * Rasterizer2D.width;
        for (var12 = -param3; var12 < 0; var12++) {
          var13 = 65536 - var7 >> 8;
          var14 = var7 >> 8;
          var15 = ((param4 & 16711935) * var13 + (param5 & 16711935) * var14 & -16711936) >>> 8;
          var16 = ((param4 & 65280) * var13 + (param5 & 65280) * var14 & 16711680) >> 8;
          for (var17 = -param2; var17 < 0; var17++) {
            var18 = Rasterizer2D.pixels[var11];
            incrementValue$0 = var11;
            var11++;
            Rasterizer2D.pixels[incrementValue$0] = (var15 * param6 + (var18 & 16711935) * var9 & -16711936) + (var16 * param6 + (var18 & 65280) * var9 & 16711680) >>> 8;
          }
          var11 = var11 + var10;
          var7 = var7 + var8;
        }
    }

    final static boolean b(byte param0) {
        if (param0 < 117) {
          return true;
        }
        return MusicVoice.field_l == MusicEnvelope.field_f ? true : false;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int[] param5, int param6) {
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int incrementValue$0 = 0;
        int var15 = 0;
        int incrementValue$1 = 0;
        int var16 = 0;
        int incrementValue$2 = 0;
        int var17 = 0;
        int var18 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$8 = 0;
        pa.field_i[0] = param0;
        pa.field_i[1] = param1;
        pa.field_i[2] = param3;
        int var7 = 0;
        int var8 = 3;
        int var9 = 1;
        int var10 = 254;
        int var11 = param2;
        param6 = 273 * param6 + 36;
        Rasterizer2D.a(param0, param1, 2 * param2, 254, param5);
        for (var12 = 0; var12 < param3; var12++) {
          Rasterizer2D.a(param0, param1, var12 * param2, 254 / (1 + var12), param5);
          Rasterizer2D.a(param0, param1, var12 * param2, 196 / (1 + var12), param5);
          var13 = 0;
          for (var14 = 0; var14 < var9; var14++) {
            var7 = var7 % pa.field_i.length;
            incrementValue$0 = var7;
            var7++;
            var15 = pa.field_i[incrementValue$0];
            incrementValue$1 = var7;
            var7++;
            var16 = pa.field_i[incrementValue$1];
            incrementValue$2 = var7;
            var7++;
            var17 = pa.field_i[incrementValue$2];
            var13 = var13 + var17;
            Rasterizer2D.a(var15, var16, var11, var10, param5);
            Rasterizer2D.a(var15, var16, var11 >> 1, var10 >> 1, param5);
            for (var18 = 0; var18 < var17; var18++) {
              var8 = var8 % pa.field_i.length;
              param6 = param6 % mh.field_F.length;
              incrementValue$3 = var8;
              var8++;
              incrementValue$4 = param6;
              param6++;
              pa.field_i[incrementValue$3] = var15 + (var11 * InteractiveGameClient.sine8192(mh.field_F[incrementValue$4], -4097) >> 16);
              incrementValue$5 = var8;
              var8++;
              incrementValue$6 = param6;
              param6++;
              pa.field_i[incrementValue$5] = var16 + (var11 * BrickABrac.cosine8192(2048, mh.field_F[incrementValue$6]) >> 16);
              incrementValue$7 = var8;
              var8++;
              incrementValue$8 = param6;
              param6++;
              pa.field_i[incrementValue$7] = 1 + er.nonnegativeRemainder(-1560508993, param4, mh.field_F[incrementValue$8]);
            }
          }
          var9 = var13;
          var11 = var11 / 2;
          var10 = 60 + 126 * var11 / param2;
        }
    }

    final static int a(int param0, int param1, int param2) {
        int var4Lifetime1;
        param0 = param0 / 60;
        int var3 = (param0 >> 8) % 6;
        param0 = param0 & 255;
        int var4 = 256;
        int var5 = 255 * (param2 * (var4 - param1)) >> 8 >> 8;
        int var6 = 255 * (param2 * (var4 - (param0 * param1 >> 8)) >> 8) >> 8;
        int var7 = 255 * (param2 * (var4 - ((var4 - param0) * param1 >> 8)) >> 8) >> 8;
        var4Lifetime1 = var3 & 1;
        var3 = var3 >> 1;
        return (var5 << (2 - (2 + var3) % 3 << 3)) + (param2 << (2 - (var3 + var4Lifetime1) % 3 << 3)) + (var7 + (-var4Lifetime1 >> 31 & var6 - var7) << (2 - (4 + var3 - var4Lifetime1) % 3 << 3));
    }

    static {
        field_a = new lo();
    }
}
