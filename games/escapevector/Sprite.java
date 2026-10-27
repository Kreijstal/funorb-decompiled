/*
 * Decompiled by CFR-JS 0.4.0.
 */
class Sprite extends SpriteState {
    int[] pixels;

    void f(int param0, int param1, int param2) {
        param0 = param0 + this.offsetX;
        param1 = param1 + this.offsetY;
        int var4 = param0 + param1 * SoftwareRasterizer.width;
        int var5 = 0;
        int var6 = this.height;
        int var7 = this.width;
        int var8 = SoftwareRasterizer.width - var7;
        int var9 = 0;
        if (param1 < SoftwareRasterizer.clipTop) {
          int var10 = SoftwareRasterizer.clipTop - param1;
          var6 = var6 - var10;
          param1 = SoftwareRasterizer.clipTop;
          var5 = var5 + var10 * var7;
          var4 = var4 + var10 * SoftwareRasterizer.width;
        }
        if (param1 + var6 > SoftwareRasterizer.clipBottom) {
          var6 = var6 - (param1 + var6 - SoftwareRasterizer.clipBottom);
        }
        if (param0 < SoftwareRasterizer.clipLeft) {
          int var10Lifetime1 = SoftwareRasterizer.clipLeft - param0;
          var7 = var7 - var10Lifetime1;
          param0 = SoftwareRasterizer.clipLeft;
          var5 = var5 + var10Lifetime1;
          var4 = var4 + var10Lifetime1;
          var9 = var9 + var10Lifetime1;
          var8 = var8 + var10Lifetime1;
        }
        if (param0 + var7 > SoftwareRasterizer.clipRight) {
          int var10Lifetime2 = param0 + var7 - SoftwareRasterizer.clipRight;
          var7 = var7 - var10Lifetime2;
          var9 = var9 + var10Lifetime2;
          var8 = var8 + var10Lifetime2;
        }
        if (var7 > 0) {
          if (var6 <= 0) {
            return;
          }
          Sprite.c(SoftwareRasterizer.pixels, this.pixels, 0, var5, var4, var7, var6, var8, var9, param2);
          return;
        }
    }

    final void g() {
        SoftwareRasterizer.a(this.pixels, this.width, this.height);
    }

    private final static void a(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11) {
        int var12 = param11 & 16711935;
        int var13 = param11 >> 8 & 255;
        for (param6 = -param8; param6 < 0; param6++) {
          for (param5 = -param7; param5 < 0; param5++) {
            param2 = param1[param3++];
            if (param2 == 0) {
              param4++;
            } else if (param2 >> 8 != (param2 & 65535)) {
              param0[param4++] = param2;
            } else {
              param2 = param2 & 255;
              int incrementValue$14 = param4;
              param4++;
              param0[incrementValue$14] = (param2 * var12 >> 8 & 16711934) + (param2 * var13 & 65280) + 1;
            }
          }
          param4 = param4 + param9;
          param3 = param3 + param10;
        }
    }

    private final static void a(int param0, int[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        for (int var10 = -param7; var10 < 0; var10++) {
          for (int var11 = -param6; var11 < 0; var11++) {
            param3 = param2[param4++];
            if (param3 != 0) {
              param0 = param1[param5];
              if (param0 != 0) {
                int var12 = ((param3 & 16711680) >>> 16) * ((param0 & 16711680) >>> 16) >>> 8;
                int var13 = (param3 & 65280) * (param0 & 65280) >>> 24;
                int var14 = (param3 & 255) * (param0 & 255) >>> 8;
                int incrementValue$5 = param5;
                param5++;
                param1[incrementValue$5] = (var12 << 16) + (var13 << 8) + var14;
              } else {
                param5++;
              }
            } else {
              param5++;
            }
          }
          param5 = param5 + param8;
          param4 = param4 + param9;
        }
    }

    void b(int param0, int param1, int param2) {
        if (param2 == 256) {
          this.e(param0, param1);
          return;
        }
        param0 = param0 + this.offsetX;
        param1 = param1 + this.offsetY;
        int var4 = param0 + param1 * SoftwareRasterizer.width;
        int var5 = 0;
        int var6 = this.height;
        int var7 = this.width;
        int var8 = SoftwareRasterizer.width - var7;
        int var9 = 0;
        if (param1 < SoftwareRasterizer.clipTop) {
          int var10 = SoftwareRasterizer.clipTop - param1;
          var6 = var6 - var10;
          param1 = SoftwareRasterizer.clipTop;
          var5 = var5 + var10 * var7;
          var4 = var4 + var10 * SoftwareRasterizer.width;
        }
        if (param1 + var6 > SoftwareRasterizer.clipBottom) {
          var6 = var6 - (param1 + var6 - SoftwareRasterizer.clipBottom);
        }
        if (param0 < SoftwareRasterizer.clipLeft) {
          int var10Lifetime1 = SoftwareRasterizer.clipLeft - param0;
          var7 = var7 - var10Lifetime1;
          param0 = SoftwareRasterizer.clipLeft;
          var5 = var5 + var10Lifetime1;
          var4 = var4 + var10Lifetime1;
          var9 = var9 + var10Lifetime1;
          var8 = var8 + var10Lifetime1;
        }
        if (param0 + var7 > SoftwareRasterizer.clipRight) {
          int var10Lifetime2 = param0 + var7 - SoftwareRasterizer.clipRight;
          var7 = var7 - var10Lifetime2;
          var9 = var9 + var10Lifetime2;
          var8 = var8 + var10Lifetime2;
        }
        if (var7 > 0) {
          if (var6 <= 0) {
            return;
          }
          Sprite.a(SoftwareRasterizer.pixels, this.pixels, 0, var5, var4, var7, var6, var8, var9, param2);
          return;
        }
    }

    final Sprite b() {
        Sprite var1 = new Sprite(this.width, this.height);
        var1.fullWidth = this.fullWidth;
        var1.fullHeight = this.fullHeight;
        var1.offsetX = this.offsetX;
        var1.offsetY = this.offsetY;
        int var2 = this.pixels.length;
        for (int var3 = 0; var3 < var2; var3++) {
          var1.pixels[var3] = this.pixels[var3];
        }
        return var1;
    }

    private final static void a(int param0, int param1, int param2, int[] param3, int[] param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12) {
        for (param8 = -param10; param8 < 0; param8++) {
          for (param6 = -param9; param6 < 0; param6++) {
            param0 = param4[param5++];
            if (param0 == 0) {
              param7++;
            } else {
              param1 = param3[param7];
              param2 = param0 + param1;
              param0 = (param0 & 16711935) + (param1 & 16711935);
              param1 = (param0 & 16777472) + (param2 - param0 & 65536);
              int incrementValue$12 = param7;
              param7++;
              param3[incrementValue$12] = param2 - param1 | param1 - (param1 >>> 8);
            }
          }
          param7 = param7 + param11;
          param5 = param5 + param12;
        }
    }

    final void f() {
        int var1 = this.height - 1;
        scanLoop1: while (true) {
          if (var1 >= 0) {
            int var2 = var1 * this.width;
            for (int var3 = 0; var3 < this.width; var3++) {
              if (this.pixels[var2 + var3] != 0) {
                break scanLoop1;
              }
            }
            var1--;
            continue;
          }
          break;
        }
        int var2Lifetime1 = 0;
        scanLoop2: while (true) {
          if (var2Lifetime1 < var1) {
            int var3Lifetime1 = var2Lifetime1 * this.width;
            for (int var4 = 0; var4 < this.width; var4++) {
              if (this.pixels[var3Lifetime1 + var4] != 0) {
                break scanLoop2;
              }
            }
            var2Lifetime1++;
            continue;
          }
          break;
        }
        int var3Lifetime2 = this.width - 1;
        scanLoop3: while (true) {
          if (var3Lifetime2 >= 0) {
            for (int var4Lifetime1 = var2Lifetime1; var4Lifetime1 <= var1; var4Lifetime1++) {
              if (this.pixels[var4Lifetime1 * this.width + var3Lifetime2] != 0) {
                break scanLoop3;
              }
            }
            var3Lifetime2--;
            continue;
          }
          break;
        }
        int var4Lifetime2 = 0;
        scanLoop4: while (true) {
          if (var4Lifetime2 < var3Lifetime2) {
            for (int var5 = var2Lifetime1; var5 <= var1; var5++) {
              if (this.pixels[var5 * this.width + var4Lifetime2] != 0) {
                break scanLoop4;
              }
            }
            var4Lifetime2++;
            continue;
          }
          break;
        }
        if (var4Lifetime2 == 0 &&
          var3Lifetime2 == this.width - 1 &&
          var2Lifetime1 == 0 &&
          var1 == this.height - 1) {
          return;
        }
        int var5Lifetime1 = var3Lifetime2 + 1 - var4Lifetime2;
        int var6 = var1 + 1 - var2Lifetime1;
        int[] var7 = new int[var5Lifetime1 * var6];
        for (int var8 = 0; var8 < var6; var8++) {
          for (int var9 = 0; var9 < var5Lifetime1; var9++) {
            var7[var8 * var5Lifetime1 + var9] = this.pixels[(var8 + var2Lifetime1) * this.width + (var9 + var4Lifetime2)];
          }
        }
        this.pixels = var7;
        this.width = var5Lifetime1;
        this.height = var6;
        this.offsetX = this.offsetX + var4Lifetime2;
        this.offsetY = this.offsetY + var2Lifetime1;
        return;
    }

    final void b(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var19;
        int var20;
        int var21;
        int var22;
        if (param5 == 0) {
          return;
        }
        param0 = param0 - (this.offsetX << 4);
        param1 = param1 - (this.offsetY << 4);
        double var7 = (double)(param4 & 65535) * 0.00009587379924285257;
        int var9 = (int)Math.floor(Math.sin(var7) * (double)param5 + 0.5);
        int var10 = (int)Math.floor(Math.cos(var7) * (double)param5 + 0.5);
        int var11 = -param0 * var10 + -param1 * var9;
        int var12 = -(-param0) * var9 + -param1 * var10;
        int var13 = ((this.width << 4) - param0) * var10 + -param1 * var9;
        int var14 = -((this.width << 4) - param0) * var9 + -param1 * var10;
        int var15 = -param0 * var10 + ((this.height << 4) - param1) * var9;
        int var16 = -(-param0) * var9 + ((this.height << 4) - param1) * var10;
        int var17 = ((this.width << 4) - param0) * var10 + ((this.height << 4) - param1) * var9;
        int var18 = -((this.width << 4) - param0) * var9 + ((this.height << 4) - param1) * var10;
        if (var11 >= var13) {
          var19 = var13;
          var20 = var11;
        } else {
          var19 = var11;
          var20 = var13;
        }
        if (var15 < var19) {
          var19 = var15;
        }
        if (var17 < var19) {
          var19 = var17;
        }
        if (var15 > var20) {
          var20 = var15;
        }
        if (var17 > var20) {
          var20 = var17;
        }
        if (var12 >= var14) {
          var21 = var14;
          var22 = var12;
        } else {
          var21 = var12;
          var22 = var14;
        }
        if (var16 < var21) {
          var21 = var16;
        }
        if (var18 < var21) {
          var21 = var18;
        }
        if (var16 > var22) {
          var22 = var16;
        }
        if (var18 > var22) {
          var22 = var18;
        }
        var19 = var19 >> 12;
        var20 = var20 + 4095 >> 12;
        var21 = var21 >> 12;
        var22 = var22 + 4095 >> 12;
        var19 = var19 + param2;
        var20 = var20 + param2;
        var21 = var21 + param3;
        var22 = var22 + param3;
        var19 = var19 >> 4;
        var20 = var20 + 15 >> 4;
        var21 = var21 >> 4;
        var22 = var22 + 15 >> 4;
        if (var19 < SoftwareRasterizer.clipLeft) {
          var19 = SoftwareRasterizer.clipLeft;
        }
        if (var20 > SoftwareRasterizer.clipRight) {
          var20 = SoftwareRasterizer.clipRight;
        }
        if (var21 < SoftwareRasterizer.clipTop) {
          var21 = SoftwareRasterizer.clipTop;
        }
        if (var22 > SoftwareRasterizer.clipBottom) {
          var22 = SoftwareRasterizer.clipBottom;
        }
        var20 = var19 - var20;
        if (var20 >= 0) {
          return;
        }
        var22 = var21 - var22;
        if (var22 >= 0) {
          return;
        }
        int var23 = var21 * SoftwareRasterizer.width + var19;
        int var24 = SoftwareRasterizer.width + var20;
        double var25 = 16777216.0 / (double)param5;
        int var27 = (int)Math.floor(Math.sin(var7) * var25 + 0.5);
        int var28 = (int)Math.floor(Math.cos(var7) * var25 + 0.5);
        int var29 = (var19 << 4) + 8 - param2;
        int var30 = (var21 << 4) + 8 - param3;
        int var31 = (param0 << 8) - 2048 - (var30 * var27 >> 4);
        int var32 = (param1 << 8) - 2048 + (var30 * var28 >> 4);
        if (var28 >= 0) {
          if (var27 >= 0) {
            int var36 = var22;
            while (var36 < 0) {
              int var37 = var31 + (var29 * var28 >> 4);
              int var38 = var32 + (var29 * var27 >> 4);
              int var39 = var20;
              boolean var40 = false;
              int var35 = var37 + 4096;
              if (!(var35 < 0)) {
                var40 = true;
              } else if (var28 != 0) {
                var35 = (var28 - 1 - var35) / var28;
                var39 = var39 + var35;
                var37 = var37 + var28 * var35;
                var38 = var38 + var27 * var35;
                var23 = var23 + var35;
                var40 = true;
              } else {
                var23 = var23 - var39;
              }
              if (var40) {
                var40 = false;
                int var35Lifetime4 = var38 + 4096;
                if (!(var35Lifetime4 < 0)) {
                  var40 = true;
                } else if (var27 != 0) {
                  var35Lifetime4 = (var27 - 1 - var35Lifetime4) / var27;
                  var39 = var39 + var35Lifetime4;
                  var37 = var37 + var28 * var35Lifetime4;
                  var38 = var38 + var27 * var35Lifetime4;
                  var23 = var23 + var35Lifetime4;
                  var40 = true;
                } else {
                  var23 = var23 - var39;
                }
                if (var40) {
                  while (var39 < 0) {
                    int var33 = var37 >> 12;
                    if (var37 >> 12 < this.width) {
                      int var34 = var38 >> 12;
                      if (var38 >> 12 < this.height) {
                        this.b(var23, var33, var34, var37, var38);
                        var39++;
                        var37 = var37 + var28;
                        var38 = var38 + var27;
                        var23++;
                        continue;
                      }
                    }
                    break;
                  }
                  var23 = var23 - var39;
                }
              }
              var36++;
              var31 = var31 - var27;
              var32 = var32 + var28;
              var23 = var23 + var24;
            }
            return;
          }
          int var36Lifetime3 = var22;
          while (var36Lifetime3 < 0) {
            int var37Lifetime3 = var31 + (var29 * var28 >> 4);
            int var38Lifetime3 = var32 + (var29 * var27 >> 4);
            int var39Lifetime3 = var20;
            boolean var40Lifetime3 = false;
            int var35Lifetime3 = var37Lifetime3 + 4096;
            if (!(var35Lifetime3 < 0)) {
              var40Lifetime3 = true;
            } else if (var28 != 0) {
              var35Lifetime3 = (var28 - 1 - var35Lifetime3) / var28;
              var39Lifetime3 = var39Lifetime3 + var35Lifetime3;
              var37Lifetime3 = var37Lifetime3 + var28 * var35Lifetime3;
              var38Lifetime3 = var38Lifetime3 + var27 * var35Lifetime3;
              var23 = var23 + var35Lifetime3;
              var40Lifetime3 = true;
            } else {
              var23 = var23 - var39Lifetime3;
            }
            if (var40Lifetime3) {
              var40Lifetime3 = false;
              int var35Lifetime3Lifetime1 = var38Lifetime3 - (this.height << 12);
              if (!(var35Lifetime3Lifetime1 >= 0)) {
                var40Lifetime3 = true;
              } else if (var27 != 0) {
                var35Lifetime3Lifetime1 = (var27 - var35Lifetime3Lifetime1) / var27;
                var39Lifetime3 = var39Lifetime3 + var35Lifetime3Lifetime1;
                var37Lifetime3 = var37Lifetime3 + var28 * var35Lifetime3Lifetime1;
                var38Lifetime3 = var38Lifetime3 + var27 * var35Lifetime3Lifetime1;
                var23 = var23 + var35Lifetime3Lifetime1;
                var40Lifetime3 = true;
              } else {
                var23 = var23 - var39Lifetime3;
              }
              if (var40Lifetime3) {
                while (var39Lifetime3 < 0) {
                  if (var38Lifetime3 >= -4096) {
                    int var33Lifetime3 = var37Lifetime3 >> 12;
                    if (var37Lifetime3 >> 12 < this.width) {
                      int var34Lifetime3 = var38Lifetime3 >> 12;
                      this.b(var23, var33Lifetime3, var34Lifetime3, var37Lifetime3, var38Lifetime3);
                      var39Lifetime3++;
                      var37Lifetime3 = var37Lifetime3 + var28;
                      var38Lifetime3 = var38Lifetime3 + var27;
                      var23++;
                      continue;
                    }
                  }
                  break;
                }
                var23 = var23 - var39Lifetime3;
              }
            }
            var36Lifetime3++;
            var31 = var31 - var27;
            var32 = var32 + var28;
            var23 = var23 + var24;
          }
          return;
        }
        if (var27 >= 0) {
          int var36Lifetime1 = var22;
          while (var36Lifetime1 < 0) {
            int var37Lifetime1 = var31 + (var29 * var28 >> 4);
            int var38Lifetime1 = var32 + (var29 * var27 >> 4);
            int var39Lifetime1 = var20;
            boolean var40Lifetime1 = false;
            int var35Lifetime1 = var37Lifetime1 - (this.width << 12);
            if (!(var35Lifetime1 >= 0)) {
              var40Lifetime1 = true;
            } else if (var28 != 0) {
              var35Lifetime1 = (var28 - var35Lifetime1) / var28;
              var39Lifetime1 = var39Lifetime1 + var35Lifetime1;
              var37Lifetime1 = var37Lifetime1 + var28 * var35Lifetime1;
              var38Lifetime1 = var38Lifetime1 + var27 * var35Lifetime1;
              var23 = var23 + var35Lifetime1;
              var40Lifetime1 = true;
            } else {
              var23 = var23 - var39Lifetime1;
            }
            if (var40Lifetime1) {
              var40Lifetime1 = false;
              int var35Lifetime1Lifetime1 = var38Lifetime1 + 4096;
              if (!(var35Lifetime1Lifetime1 < 0)) {
                var40Lifetime1 = true;
              } else if (var27 != 0) {
                var35Lifetime1Lifetime1 = (var27 - 1 - var35Lifetime1Lifetime1) / var27;
                var39Lifetime1 = var39Lifetime1 + var35Lifetime1Lifetime1;
                var37Lifetime1 = var37Lifetime1 + var28 * var35Lifetime1Lifetime1;
                var38Lifetime1 = var38Lifetime1 + var27 * var35Lifetime1Lifetime1;
                var23 = var23 + var35Lifetime1Lifetime1;
                var40Lifetime1 = true;
              } else {
                var23 = var23 - var39Lifetime1;
              }
              if (var40Lifetime1) {
                while (var39Lifetime1 < 0) {
                  if (var37Lifetime1 >= -4096) {
                    int var34Lifetime1 = var38Lifetime1 >> 12;
                    if (var38Lifetime1 >> 12 < this.height) {
                      int var33Lifetime1 = var37Lifetime1 >> 12;
                      this.b(var23, var33Lifetime1, var34Lifetime1, var37Lifetime1, var38Lifetime1);
                      var39Lifetime1++;
                      var37Lifetime1 = var37Lifetime1 + var28;
                      var38Lifetime1 = var38Lifetime1 + var27;
                      var23++;
                      continue;
                    }
                  }
                  break;
                }
                var23 = var23 - var39Lifetime1;
              }
            }
            var36Lifetime1++;
            var31 = var31 - var27;
            var32 = var32 + var28;
            var23 = var23 + var24;
          }
          return;
        }
        int var36Lifetime2 = var22;
        while (var36Lifetime2 < 0) {
          int var37Lifetime2 = var31 + (var29 * var28 >> 4);
          int var38Lifetime2 = var32 + (var29 * var27 >> 4);
          int var39Lifetime2 = var20;
          boolean var40Lifetime2 = false;
          int var35Lifetime2 = var37Lifetime2 - (this.width << 12);
          if (!(var35Lifetime2 >= 0)) {
            var40Lifetime2 = true;
          } else if (var28 != 0) {
            var35Lifetime2 = (var28 - var35Lifetime2) / var28;
            var39Lifetime2 = var39Lifetime2 + var35Lifetime2;
            var37Lifetime2 = var37Lifetime2 + var28 * var35Lifetime2;
            var38Lifetime2 = var38Lifetime2 + var27 * var35Lifetime2;
            var23 = var23 + var35Lifetime2;
            var40Lifetime2 = true;
          } else {
            var23 = var23 - var39Lifetime2;
          }
          if (var40Lifetime2) {
            var40Lifetime2 = false;
            int var35Lifetime2Lifetime1 = var38Lifetime2 - (this.height << 12);
            if (!(var35Lifetime2Lifetime1 >= 0)) {
              var40Lifetime2 = true;
            } else if (var27 != 0) {
              var35Lifetime2Lifetime1 = (var27 - var35Lifetime2Lifetime1) / var27;
              var39Lifetime2 = var39Lifetime2 + var35Lifetime2Lifetime1;
              var37Lifetime2 = var37Lifetime2 + var28 * var35Lifetime2Lifetime1;
              var38Lifetime2 = var38Lifetime2 + var27 * var35Lifetime2Lifetime1;
              var23 = var23 + var35Lifetime2Lifetime1;
              var40Lifetime2 = true;
            } else {
              var23 = var23 - var39Lifetime2;
            }
            if (var40Lifetime2) {
              while (var39Lifetime2 < 0) {
                if (var37Lifetime2 >= -4096 &&
                  var38Lifetime2 >= -4096) {
                  int var33Lifetime2 = var37Lifetime2 >> 12;
                  int var34Lifetime2 = var38Lifetime2 >> 12;
                  this.b(var23, var33Lifetime2, var34Lifetime2, var37Lifetime2, var38Lifetime2);
                  var39Lifetime2++;
                  var37Lifetime2 = var37Lifetime2 + var28;
                  var38Lifetime2 = var38Lifetime2 + var27;
                  var23++;
                  continue;
                }
                break;
              }
              var23 = var23 - var39Lifetime2;
            }
          }
          var36Lifetime2++;
          var31 = var31 - var27;
          var32 = var32 + var28;
          var23 = var23 + var24;
        }
        return;
    }

    private final static void a(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        for (int var8 = -param5; var8 < 0; var8++) {
          int var9 = param3 + param4 - 3;
          while (param3 < var9) {
            param0[param3++] = param1[param2++];
            param0[param3++] = param1[param2++];
            param0[param3++] = param1[param2++];
            param0[param3++] = param1[param2++];
          }
          var9 += 3;
          while (param3 < var9) {
            param0[param3++] = param1[param2++];
          }
          param3 = param3 + param6;
          param2 = param2 + param7;
        }
    }

    private final static void a(int[] param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var8 = 0;
        while (var8 < param7) {
          int var9 = 0;
          while (var9 < param6) {
            int var11 = SoftwareRasterizer.pixels[param2] & 16711935;
            int var12 = SoftwareRasterizer.pixels[param2] & 65280;
            int var13 = 0;
            int var14 = 0;
            int dupTemp$0 = param0[param1];
            int var10 = dupTemp$0;
            if (dupTemp$0 != 0) {
              var13 = var13 + (var10 & 16711935);
              var14 = var14 + (var10 & 65280);
            } else {
              var13 = var13 + var11;
              var14 = var14 + var12;
            }
            int dupTemp$1 = param0[param1 + 1];
            int var10Lifetime1 = dupTemp$1;
            if (dupTemp$1 != 0) {
              var13 = var13 + (var10Lifetime1 & 16711935);
              var14 = var14 + (var10Lifetime1 & 65280);
            } else {
              var13 = var13 + var11;
              var14 = var14 + var12;
            }
            int dupTemp$2 = param0[param1 + param5];
            int var10Lifetime2 = dupTemp$2;
            if (dupTemp$2 != 0) {
              var13 = var13 + (var10Lifetime2 & 16711935);
              var14 = var14 + (var10Lifetime2 & 65280);
            } else {
              var13 = var13 + var11;
              var14 = var14 + var12;
            }
            int dupTemp$3 = param0[param1 + param5 + 1];
            int var10Lifetime3 = dupTemp$3;
            if (dupTemp$3 != 0) {
              var13 = var13 + (var10Lifetime3 & 16711935);
              var14 = var14 + (var10Lifetime3 & 65280);
            } else {
              var13 = var13 + var11;
              var14 = var14 + var12;
            }
            int incrementValue$4 = param2;
            param2++;
            SoftwareRasterizer.pixels[incrementValue$4] = (var13 & 66847740 | var14 & 261120) >> 2;
            var9++;
            param1 += 2;
          }
          var8++;
          param1 = param1 + param3;
          param2 = param2 + param4;
        }
    }

    void a(int param0, int param1, int param2) {
        param0 = param0 + this.offsetX;
        param1 = param1 + this.offsetY;
        int var4 = param0 + param1 * SoftwareRasterizer.width;
        int var5 = 0;
        int var6 = this.height;
        int var7 = this.width;
        int var8 = SoftwareRasterizer.width - var7;
        int var9 = 0;
        if (param1 < SoftwareRasterizer.clipTop) {
          int var10 = SoftwareRasterizer.clipTop - param1;
          var6 = var6 - var10;
          param1 = SoftwareRasterizer.clipTop;
          var5 = var5 + var10 * var7;
          var4 = var4 + var10 * SoftwareRasterizer.width;
        }
        if (param1 + var6 > SoftwareRasterizer.clipBottom) {
          var6 = var6 - (param1 + var6 - SoftwareRasterizer.clipBottom);
        }
        if (param0 < SoftwareRasterizer.clipLeft) {
          int var10Lifetime1 = SoftwareRasterizer.clipLeft - param0;
          var7 = var7 - var10Lifetime1;
          param0 = SoftwareRasterizer.clipLeft;
          var5 = var5 + var10Lifetime1;
          var4 = var4 + var10Lifetime1;
          var9 = var9 + var10Lifetime1;
          var8 = var8 + var10Lifetime1;
        }
        if (param0 + var7 > SoftwareRasterizer.clipRight) {
          int var10Lifetime2 = param0 + var7 - SoftwareRasterizer.clipRight;
          var7 = var7 - var10Lifetime2;
          var9 = var9 + var10Lifetime2;
          var8 = var8 + var10Lifetime2;
        }
        if (var7 > 0) {
          if (var6 <= 0) {
            return;
          }
          Sprite.a(SoftwareRasterizer.pixels, this.pixels, 0, var5, var4, 0, 0, var7, var6, var8, var9, param2);
          return;
        }
    }

    void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var19;
        int var20;
        int var21;
        int var22;
        if (param5 == 0) {
          return;
        }
        param0 = param0 - (this.offsetX << 4);
        param1 = param1 - (this.offsetY << 4);
        double var7 = (double)(param4 & 65535) * 0.00009587379924285257;
        int var9 = (int)Math.floor(Math.sin(var7) * (double)param5 + 0.5);
        int var10 = (int)Math.floor(Math.cos(var7) * (double)param5 + 0.5);
        int var11 = -param0 * var10 + -param1 * var9;
        int var12 = -(-param0) * var9 + -param1 * var10;
        int var13 = ((this.width << 4) - param0) * var10 + -param1 * var9;
        int var14 = -((this.width << 4) - param0) * var9 + -param1 * var10;
        int var15 = -param0 * var10 + ((this.height << 4) - param1) * var9;
        int var16 = -(-param0) * var9 + ((this.height << 4) - param1) * var10;
        int var17 = ((this.width << 4) - param0) * var10 + ((this.height << 4) - param1) * var9;
        int var18 = -((this.width << 4) - param0) * var9 + ((this.height << 4) - param1) * var10;
        if (var11 >= var13) {
          var19 = var13;
          var20 = var11;
        } else {
          var19 = var11;
          var20 = var13;
        }
        if (var15 < var19) {
          var19 = var15;
        }
        if (var17 < var19) {
          var19 = var17;
        }
        if (var15 > var20) {
          var20 = var15;
        }
        if (var17 > var20) {
          var20 = var17;
        }
        if (var12 >= var14) {
          var21 = var14;
          var22 = var12;
        } else {
          var21 = var12;
          var22 = var14;
        }
        if (var16 < var21) {
          var21 = var16;
        }
        if (var18 < var21) {
          var21 = var18;
        }
        if (var16 > var22) {
          var22 = var16;
        }
        if (var18 > var22) {
          var22 = var18;
        }
        var19 = var19 >> 12;
        var20 = var20 + 4095 >> 12;
        var21 = var21 >> 12;
        var22 = var22 + 4095 >> 12;
        var19 = var19 + param2;
        var20 = var20 + param2;
        var21 = var21 + param3;
        var22 = var22 + param3;
        var19 = var19 >> 4;
        var20 = var20 + 15 >> 4;
        var21 = var21 >> 4;
        var22 = var22 + 15 >> 4;
        if (var19 < SoftwareRasterizer.clipLeft) {
          var19 = SoftwareRasterizer.clipLeft;
        }
        if (var20 > SoftwareRasterizer.clipRight) {
          var20 = SoftwareRasterizer.clipRight;
        }
        if (var21 < SoftwareRasterizer.clipTop) {
          var21 = SoftwareRasterizer.clipTop;
        }
        if (var22 > SoftwareRasterizer.clipBottom) {
          var22 = SoftwareRasterizer.clipBottom;
        }
        var20 = var19 - var20;
        if (var20 >= 0) {
          return;
        }
        var22 = var21 - var22;
        if (var22 >= 0) {
          return;
        }
        int var23 = var21 * SoftwareRasterizer.width + var19;
        double var24 = 16777216.0 / (double)param5;
        int var26 = (int)Math.floor(Math.sin(var7) * var24 + 0.5);
        int var27 = (int)Math.floor(Math.cos(var7) * var24 + 0.5);
        int var28 = (var19 << 4) + 8 - param2;
        int var29 = (var21 << 4) + 8 - param3;
        int var30 = (param0 << 8) - (var29 * var26 >> 4);
        int var31 = (param1 << 8) + (var29 * var27 >> 4);
        if (var27 == 0) {
          if (var26 == 0) {
            int var33 = var22;
            while (var33 < 0) {
              int var34 = var23;
              int var35 = var30;
              int var36 = var31;
              int var37 = var20;
              if (var35 < 0) {
                var33++;
                var23 = var23 + SoftwareRasterizer.width;
                continue;
              }
              if (var36 >= 0 &&
                var35 - (this.width << 12) < 0 &&
                var36 - (this.height << 12) < 0) {
                while (var37 < 0) {
                  int var38 = this.pixels[(var36 >> 12) * this.width + (var35 >> 12)];
                  if (var38 == 0) {
                    var34++;
                  } else {
                    int incrementValue$8 = var34;
                    var34++;
                    SoftwareRasterizer.pixels[incrementValue$8] = var38;
                  }
                  var37++;
                }
              }
              var33++;
              var23 = var23 + SoftwareRasterizer.width;
            }
            return;
          }
          if (var26 >= 0) {
            int var33Lifetime5 = var22;
            while (var33Lifetime5 < 0) {
              int var34Lifetime5 = var23;
              int var35Lifetime5 = var30;
              int var36Lifetime5 = var31 + (var28 * var26 >> 4);
              int var37Lifetime5 = var20;
              if (var35Lifetime5 >= 0 &&
                var35Lifetime5 - (this.width << 12) < 0) {
                if (var36Lifetime5 < 0) {
                  int var32 = (var26 - 1 - var36Lifetime5) / var26;
                  var37Lifetime5 = var37Lifetime5 + var32;
                  var36Lifetime5 = var36Lifetime5 + var26 * var32;
                  var34Lifetime5 = var34Lifetime5 + var32;
                }
                int var32Lifetime6 = (1 + var36Lifetime5 - (this.height << 12) - var26) / var26;
                if ((1 + var36Lifetime5 - (this.height << 12) - var26) / var26 > var37Lifetime5) {
                  var37Lifetime5 = var32Lifetime6;
                }
                while (var37Lifetime5 < 0) {
                  int var38Lifetime5 = this.pixels[(var36Lifetime5 >> 12) * this.width + (var35Lifetime5 >> 12)];
                  if (var38Lifetime5 == 0) {
                    var34Lifetime5++;
                  } else {
                    int incrementValue$6 = var34Lifetime5;
                    var34Lifetime5++;
                    SoftwareRasterizer.pixels[incrementValue$6] = var38Lifetime5;
                  }
                  var36Lifetime5 = var36Lifetime5 + var26;
                  var37Lifetime5++;
                }
              }
              var33Lifetime5++;
              var30 = var30 - var26;
              var23 = var23 + SoftwareRasterizer.width;
            }
            return;
          }
          int var33Lifetime6 = var22;
          while (var33Lifetime6 < 0) {
            int var34Lifetime6 = var23;
            int var35Lifetime6 = var30;
            int var36Lifetime6 = var31 + (var28 * var26 >> 4);
            int var37Lifetime6 = var20;
            if (var35Lifetime6 >= 0) {
              if (var35Lifetime6 - (this.width << 12) >= 0) {
                var33Lifetime6++;
                var30 = var30 - var26;
                var23 = var23 + SoftwareRasterizer.width;
                continue;
              }
              int var32Lifetime5 = var36Lifetime6 - (this.height << 12);
              if (var36Lifetime6 - (this.height << 12) >= 0) {
                var32Lifetime5 = (var26 - var32Lifetime5) / var26;
                var37Lifetime6 = var37Lifetime6 + var32Lifetime5;
                var36Lifetime6 = var36Lifetime6 + var26 * var32Lifetime5;
                var34Lifetime6 = var34Lifetime6 + var32Lifetime5;
              }
              int var32Lifetime5Lifetime1 = (var36Lifetime6 - var26) / var26;
              if ((var36Lifetime6 - var26) / var26 > var37Lifetime6) {
                var37Lifetime6 = var32Lifetime5Lifetime1;
              }
              while (var37Lifetime6 < 0) {
                int var38Lifetime6 = this.pixels[(var36Lifetime6 >> 12) * this.width + (var35Lifetime6 >> 12)];
                if (var38Lifetime6 == 0) {
                  var34Lifetime6++;
                } else {
                  int incrementValue$7 = var34Lifetime6;
                  var34Lifetime6++;
                  SoftwareRasterizer.pixels[incrementValue$7] = var38Lifetime6;
                }
                var36Lifetime6 = var36Lifetime6 + var26;
                var37Lifetime6++;
              }
            }
            var33Lifetime6++;
            var30 = var30 - var26;
            var23 = var23 + SoftwareRasterizer.width;
          }
          return;
        }
        if (var27 >= 0) {
          if (var26 == 0) {
            int var33Lifetime1 = var22;
            while (var33Lifetime1 < 0) {
              int var34Lifetime1 = var23;
              int var35Lifetime1 = var30 + (var28 * var27 >> 4);
              int var36Lifetime1 = var31;
              int var37Lifetime1 = var20;
              if (var36Lifetime1 >= 0 &&
                var36Lifetime1 - (this.height << 12) < 0) {
                if (var35Lifetime1 < 0) {
                  int var32Lifetime1 = (var27 - 1 - var35Lifetime1) / var27;
                  var37Lifetime1 = var37Lifetime1 + var32Lifetime1;
                  var35Lifetime1 = var35Lifetime1 + var27 * var32Lifetime1;
                  var34Lifetime1 = var34Lifetime1 + var32Lifetime1;
                }
                int var32Lifetime1Lifetime3 = (1 + var35Lifetime1 - (this.width << 12) - var27) / var27;
                if ((1 + var35Lifetime1 - (this.width << 12) - var27) / var27 > var37Lifetime1) {
                  var37Lifetime1 = var32Lifetime1Lifetime3;
                }
                while (var37Lifetime1 < 0) {
                  int var38Lifetime1 = this.pixels[(var36Lifetime1 >> 12) * this.width + (var35Lifetime1 >> 12)];
                  if (var38Lifetime1 == 0) {
                    var34Lifetime1++;
                  } else {
                    int incrementValue$2 = var34Lifetime1;
                    var34Lifetime1++;
                    SoftwareRasterizer.pixels[incrementValue$2] = var38Lifetime1;
                  }
                  var35Lifetime1 = var35Lifetime1 + var27;
                  var37Lifetime1++;
                }
              }
              var33Lifetime1++;
              var31 = var31 + var27;
              var23 = var23 + SoftwareRasterizer.width;
            }
            return;
          }
          if (var26 >= 0) {
            int var33Lifetime1Lifetime1 = var22;
            while (var33Lifetime1Lifetime1 < 0) {
              int var34Lifetime1Lifetime1 = var23;
              int var35Lifetime1Lifetime1 = var30 + (var28 * var27 >> 4);
              int var36Lifetime1Lifetime1 = var31 + (var28 * var26 >> 4);
              int var37Lifetime1Lifetime1 = var20;
              if (var35Lifetime1Lifetime1 < 0) {
                int var32Lifetime1Lifetime1 = (var27 - 1 - var35Lifetime1Lifetime1) / var27;
                var37Lifetime1Lifetime1 = var37Lifetime1Lifetime1 + var32Lifetime1Lifetime1;
                var35Lifetime1Lifetime1 = var35Lifetime1Lifetime1 + var27 * var32Lifetime1Lifetime1;
                var36Lifetime1Lifetime1 = var36Lifetime1Lifetime1 + var26 * var32Lifetime1Lifetime1;
                var34Lifetime1Lifetime1 = var34Lifetime1Lifetime1 + var32Lifetime1Lifetime1;
              }
              int var32Lifetime1Lifetime1Lifetime1 = (1 + var35Lifetime1Lifetime1 - (this.width << 12) - var27) / var27;
              if ((1 + var35Lifetime1Lifetime1 - (this.width << 12) - var27) / var27 > var37Lifetime1Lifetime1) {
                var37Lifetime1Lifetime1 = var32Lifetime1Lifetime1Lifetime1;
              }
              if (var36Lifetime1Lifetime1 < 0) {
                int var32Lifetime1Lifetime1Lifetime2 = (var26 - 1 - var36Lifetime1Lifetime1) / var26;
                var37Lifetime1Lifetime1 = var37Lifetime1Lifetime1 + var32Lifetime1Lifetime1Lifetime2;
                var35Lifetime1Lifetime1 = var35Lifetime1Lifetime1 + var27 * var32Lifetime1Lifetime1Lifetime2;
                var36Lifetime1Lifetime1 = var36Lifetime1Lifetime1 + var26 * var32Lifetime1Lifetime1Lifetime2;
                var34Lifetime1Lifetime1 = var34Lifetime1Lifetime1 + var32Lifetime1Lifetime1Lifetime2;
              }
              int var32Lifetime1Lifetime1Lifetime3 = (1 + var36Lifetime1Lifetime1 - (this.height << 12) - var26) / var26;
              if ((1 + var36Lifetime1Lifetime1 - (this.height << 12) - var26) / var26 > var37Lifetime1Lifetime1) {
                var37Lifetime1Lifetime1 = var32Lifetime1Lifetime1Lifetime3;
              }
              while (var37Lifetime1Lifetime1 < 0) {
                int var38Lifetime1Lifetime1 = this.pixels[(var36Lifetime1Lifetime1 >> 12) * this.width + (var35Lifetime1Lifetime1 >> 12)];
                if (var38Lifetime1Lifetime1 == 0) {
                  var34Lifetime1Lifetime1++;
                } else {
                  int incrementValue$0 = var34Lifetime1Lifetime1;
                  var34Lifetime1Lifetime1++;
                  SoftwareRasterizer.pixels[incrementValue$0] = var38Lifetime1Lifetime1;
                }
                var35Lifetime1Lifetime1 = var35Lifetime1Lifetime1 + var27;
                var36Lifetime1Lifetime1 = var36Lifetime1Lifetime1 + var26;
                var37Lifetime1Lifetime1++;
              }
              var33Lifetime1Lifetime1++;
              var30 = var30 - var26;
              var31 = var31 + var27;
              var23 = var23 + SoftwareRasterizer.width;
            }
            return;
          }
          int var33Lifetime1Lifetime2 = var22;
          while (var33Lifetime1Lifetime2 < 0) {
            int var34Lifetime1Lifetime2 = var23;
            int var35Lifetime1Lifetime2 = var30 + (var28 * var27 >> 4);
            int var36Lifetime1Lifetime2 = var31 + (var28 * var26 >> 4);
            int var37Lifetime1Lifetime2 = var20;
            if (var35Lifetime1Lifetime2 < 0) {
              int var32Lifetime1Lifetime2 = (var27 - 1 - var35Lifetime1Lifetime2) / var27;
              var37Lifetime1Lifetime2 = var37Lifetime1Lifetime2 + var32Lifetime1Lifetime2;
              var35Lifetime1Lifetime2 = var35Lifetime1Lifetime2 + var27 * var32Lifetime1Lifetime2;
              var36Lifetime1Lifetime2 = var36Lifetime1Lifetime2 + var26 * var32Lifetime1Lifetime2;
              var34Lifetime1Lifetime2 = var34Lifetime1Lifetime2 + var32Lifetime1Lifetime2;
            }
            int var32Lifetime1Lifetime2Lifetime1 = (1 + var35Lifetime1Lifetime2 - (this.width << 12) - var27) / var27;
            if ((1 + var35Lifetime1Lifetime2 - (this.width << 12) - var27) / var27 > var37Lifetime1Lifetime2) {
              var37Lifetime1Lifetime2 = var32Lifetime1Lifetime2Lifetime1;
            }
            int var32Lifetime1Lifetime2Lifetime2 = var36Lifetime1Lifetime2 - (this.height << 12);
            if (var36Lifetime1Lifetime2 - (this.height << 12) >= 0) {
              var32Lifetime1Lifetime2Lifetime2 = (var26 - var32Lifetime1Lifetime2Lifetime2) / var26;
              var37Lifetime1Lifetime2 = var37Lifetime1Lifetime2 + var32Lifetime1Lifetime2Lifetime2;
              var35Lifetime1Lifetime2 = var35Lifetime1Lifetime2 + var27 * var32Lifetime1Lifetime2Lifetime2;
              var36Lifetime1Lifetime2 = var36Lifetime1Lifetime2 + var26 * var32Lifetime1Lifetime2Lifetime2;
              var34Lifetime1Lifetime2 = var34Lifetime1Lifetime2 + var32Lifetime1Lifetime2Lifetime2;
            }
            int var32Lifetime1Lifetime2Lifetime3 = (var36Lifetime1Lifetime2 - var26) / var26;
            if ((var36Lifetime1Lifetime2 - var26) / var26 > var37Lifetime1Lifetime2) {
              var37Lifetime1Lifetime2 = var32Lifetime1Lifetime2Lifetime3;
            }
            while (var37Lifetime1Lifetime2 < 0) {
              int var38Lifetime1Lifetime2 = this.pixels[(var36Lifetime1Lifetime2 >> 12) * this.width + (var35Lifetime1Lifetime2 >> 12)];
              if (var38Lifetime1Lifetime2 == 0) {
                var34Lifetime1Lifetime2++;
              } else {
                int incrementValue$1 = var34Lifetime1Lifetime2;
                var34Lifetime1Lifetime2++;
                SoftwareRasterizer.pixels[incrementValue$1] = var38Lifetime1Lifetime2;
              }
              var35Lifetime1Lifetime2 = var35Lifetime1Lifetime2 + var27;
              var36Lifetime1Lifetime2 = var36Lifetime1Lifetime2 + var26;
              var37Lifetime1Lifetime2++;
            }
            var33Lifetime1Lifetime2++;
            var30 = var30 - var26;
            var31 = var31 + var27;
            var23 = var23 + SoftwareRasterizer.width;
          }
          return;
        }
        if (var26 == 0) {
          int var33Lifetime2 = var22;
          while (var33Lifetime2 < 0) {
            int var34Lifetime2 = var23;
            int var35Lifetime2 = var30 + (var28 * var27 >> 4);
            int var36Lifetime2 = var31;
            int var37Lifetime2 = var20;
            if (var36Lifetime2 >= 0 &&
              var36Lifetime2 - (this.height << 12) < 0) {
              int var32Lifetime2 = var35Lifetime2 - (this.width << 12);
              if (var35Lifetime2 - (this.width << 12) >= 0) {
                var32Lifetime2 = (var27 - var32Lifetime2) / var27;
                var37Lifetime2 = var37Lifetime2 + var32Lifetime2;
                var35Lifetime2 = var35Lifetime2 + var27 * var32Lifetime2;
                var34Lifetime2 = var34Lifetime2 + var32Lifetime2;
              }
              int var32Lifetime2Lifetime1 = (var35Lifetime2 - var27) / var27;
              if ((var35Lifetime2 - var27) / var27 > var37Lifetime2) {
                var37Lifetime2 = var32Lifetime2Lifetime1;
              }
              while (var37Lifetime2 < 0) {
                int var38Lifetime2 = this.pixels[(var36Lifetime2 >> 12) * this.width + (var35Lifetime2 >> 12)];
                if (var38Lifetime2 == 0) {
                  var34Lifetime2++;
                } else {
                  int incrementValue$5 = var34Lifetime2;
                  var34Lifetime2++;
                  SoftwareRasterizer.pixels[incrementValue$5] = var38Lifetime2;
                }
                var35Lifetime2 = var35Lifetime2 + var27;
                var37Lifetime2++;
              }
            }
            var33Lifetime2++;
            var31 = var31 + var27;
            var23 = var23 + SoftwareRasterizer.width;
          }
          return;
        }
        if (var26 >= 0) {
          int var33Lifetime3 = var22;
          while (var33Lifetime3 < 0) {
            int var34Lifetime3 = var23;
            int var35Lifetime3 = var30 + (var28 * var27 >> 4);
            int var36Lifetime3 = var31 + (var28 * var26 >> 4);
            int var37Lifetime3 = var20;
            int var32Lifetime3 = var35Lifetime3 - (this.width << 12);
            if (var35Lifetime3 - (this.width << 12) >= 0) {
              var32Lifetime3 = (var27 - var32Lifetime3) / var27;
              var37Lifetime3 = var37Lifetime3 + var32Lifetime3;
              var35Lifetime3 = var35Lifetime3 + var27 * var32Lifetime3;
              var36Lifetime3 = var36Lifetime3 + var26 * var32Lifetime3;
              var34Lifetime3 = var34Lifetime3 + var32Lifetime3;
            }
            int var32Lifetime3Lifetime1 = (var35Lifetime3 - var27) / var27;
            if ((var35Lifetime3 - var27) / var27 > var37Lifetime3) {
              var37Lifetime3 = var32Lifetime3Lifetime1;
            }
            if (var36Lifetime3 < 0) {
              int var32Lifetime3Lifetime2 = (var26 - 1 - var36Lifetime3) / var26;
              var37Lifetime3 = var37Lifetime3 + var32Lifetime3Lifetime2;
              var35Lifetime3 = var35Lifetime3 + var27 * var32Lifetime3Lifetime2;
              var36Lifetime3 = var36Lifetime3 + var26 * var32Lifetime3Lifetime2;
              var34Lifetime3 = var34Lifetime3 + var32Lifetime3Lifetime2;
            }
            int var32Lifetime3Lifetime3 = (1 + var36Lifetime3 - (this.height << 12) - var26) / var26;
            if ((1 + var36Lifetime3 - (this.height << 12) - var26) / var26 > var37Lifetime3) {
              var37Lifetime3 = var32Lifetime3Lifetime3;
            }
            while (var37Lifetime3 < 0) {
              int var38Lifetime3 = this.pixels[(var36Lifetime3 >> 12) * this.width + (var35Lifetime3 >> 12)];
              if (var38Lifetime3 == 0) {
                var34Lifetime3++;
              } else {
                int incrementValue$3 = var34Lifetime3;
                var34Lifetime3++;
                SoftwareRasterizer.pixels[incrementValue$3] = var38Lifetime3;
              }
              var35Lifetime3 = var35Lifetime3 + var27;
              var36Lifetime3 = var36Lifetime3 + var26;
              var37Lifetime3++;
            }
            var33Lifetime3++;
            var30 = var30 - var26;
            var31 = var31 + var27;
            var23 = var23 + SoftwareRasterizer.width;
          }
          return;
        }
        int var33Lifetime4 = var22;
        while (var33Lifetime4 < 0) {
          int var34Lifetime4 = var23;
          int var35Lifetime4 = var30 + (var28 * var27 >> 4);
          int var36Lifetime4 = var31 + (var28 * var26 >> 4);
          int var37Lifetime4 = var20;
          int var32Lifetime4 = var35Lifetime4 - (this.width << 12);
          if (var35Lifetime4 - (this.width << 12) >= 0) {
            var32Lifetime4 = (var27 - var32Lifetime4) / var27;
            var37Lifetime4 = var37Lifetime4 + var32Lifetime4;
            var35Lifetime4 = var35Lifetime4 + var27 * var32Lifetime4;
            var36Lifetime4 = var36Lifetime4 + var26 * var32Lifetime4;
            var34Lifetime4 = var34Lifetime4 + var32Lifetime4;
          }
          int var32Lifetime4Lifetime1 = (var35Lifetime4 - var27) / var27;
          if ((var35Lifetime4 - var27) / var27 > var37Lifetime4) {
            var37Lifetime4 = var32Lifetime4Lifetime1;
          }
          int var32Lifetime4Lifetime2 = var36Lifetime4 - (this.height << 12);
          if (var36Lifetime4 - (this.height << 12) >= 0) {
            var32Lifetime4Lifetime2 = (var26 - var32Lifetime4Lifetime2) / var26;
            var37Lifetime4 = var37Lifetime4 + var32Lifetime4Lifetime2;
            var35Lifetime4 = var35Lifetime4 + var27 * var32Lifetime4Lifetime2;
            var36Lifetime4 = var36Lifetime4 + var26 * var32Lifetime4Lifetime2;
            var34Lifetime4 = var34Lifetime4 + var32Lifetime4Lifetime2;
          }
          int var32Lifetime4Lifetime3 = (var36Lifetime4 - var26) / var26;
          if ((var36Lifetime4 - var26) / var26 > var37Lifetime4) {
            var37Lifetime4 = var32Lifetime4Lifetime3;
          }
          while (var37Lifetime4 < 0) {
            int var38Lifetime4 = this.pixels[(var36Lifetime4 >> 12) * this.width + (var35Lifetime4 >> 12)];
            if (var38Lifetime4 == 0) {
              var34Lifetime4++;
            } else {
              int incrementValue$4 = var34Lifetime4;
              var34Lifetime4++;
              SoftwareRasterizer.pixels[incrementValue$4] = var38Lifetime4;
            }
            var35Lifetime4 = var35Lifetime4 + var27;
            var36Lifetime4 = var36Lifetime4 + var26;
            var37Lifetime4++;
          }
          var33Lifetime4++;
          var30 = var30 - var26;
          var31 = var31 + var27;
          var23 = var23 + SoftwareRasterizer.width;
        }
        return;
    }

    void c(int param0, int param1, int param2) {
        param0 = param0 + this.offsetX;
        param1 = param1 + this.offsetY;
        int var4 = param0 + param1 * SoftwareRasterizer.width;
        int var5 = 0;
        int var6 = this.height;
        int var7 = this.width;
        int var8 = SoftwareRasterizer.width - var7;
        int var9 = 0;
        if (param1 < SoftwareRasterizer.clipTop) {
          int var10 = SoftwareRasterizer.clipTop - param1;
          var6 = var6 - var10;
          param1 = SoftwareRasterizer.clipTop;
          var5 = var5 + var10 * var7;
          var4 = var4 + var10 * SoftwareRasterizer.width;
        }
        if (param1 + var6 > SoftwareRasterizer.clipBottom) {
          var6 = var6 - (param1 + var6 - SoftwareRasterizer.clipBottom);
        }
        if (param0 < SoftwareRasterizer.clipLeft) {
          int var10Lifetime1 = SoftwareRasterizer.clipLeft - param0;
          var7 = var7 - var10Lifetime1;
          param0 = SoftwareRasterizer.clipLeft;
          var5 = var5 + var10Lifetime1;
          var4 = var4 + var10Lifetime1;
          var9 = var9 + var10Lifetime1;
          var8 = var8 + var10Lifetime1;
        }
        if (param0 + var7 > SoftwareRasterizer.clipRight) {
          int var10Lifetime2 = param0 + var7 - SoftwareRasterizer.clipRight;
          var7 = var7 - var10Lifetime2;
          var9 = var9 + var10Lifetime2;
          var8 = var8 + var10Lifetime2;
        }
        if (var7 > 0) {
          if (var6 <= 0) {
            return;
          }
          if (param2 == 256) {
            Sprite.a(0, 0, 0, SoftwareRasterizer.pixels, this.pixels, var5, 0, var4, 0, var7, var6, var8, var9);
          } else {
            Sprite.a(0, 0, 0, SoftwareRasterizer.pixels, this.pixels, var5, 0, var4, 0, var7, var6, var8, var9, param2);
          }
          return;
        }
    }

    void g(int param0, int param1) {
        param0 = param0 + (this.offsetX >> 1);
        param1 = param1 + (this.offsetY >> 1);
        int var3 = param0 < SoftwareRasterizer.clipLeft ? SoftwareRasterizer.clipLeft - param0 << 1 : 0;
        int var4 = param0 + (this.width >> 1) > SoftwareRasterizer.clipRight ? SoftwareRasterizer.clipRight - param0 << 1 : this.width;
        int var5 = param1 < SoftwareRasterizer.clipTop ? SoftwareRasterizer.clipTop - param1 << 1 : 0;
        int var6 = param1 + (this.height >> 1) > SoftwareRasterizer.clipBottom ? SoftwareRasterizer.clipBottom - param1 << 1 : this.height;
        Sprite.a(this.pixels, var5 * this.width + var3, (param1 + (var5 >> 1)) * SoftwareRasterizer.width + (param0 + (var3 >> 1)), (this.width << 1) - (var4 - var3) + (this.width & 1), SoftwareRasterizer.width - (var4 - var3 >> 1), this.width, var4 - var3 >> 1, var6 - var5 >> 1);
    }

    private final static void a(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var9 = -(param5 >> 2);
        param5 = -(param5 & 3);
        for (int var10 = -param6; var10 < 0; var10++) {
          for (int var11 = var9; var11 < 0; var11++) {
            if (param1[param3++] == 0) {
              param4++;
            } else {
              param0[param4++] = param2;
            }
            if (param1[param3++] == 0) {
              param4++;
            } else {
              param0[param4++] = param2;
            }
            if (param1[param3++] == 0) {
              param4++;
            } else {
              param0[param4++] = param2;
            }
            if (param1[param3++] == 0) {
              param4++;
            } else {
              param0[param4++] = param2;
            }
          }
          for (int var11Lifetime1 = param5; var11Lifetime1 < 0; var11Lifetime1++) {
            if (param1[param3++] == 0) {
              param4++;
            } else {
              param0[param4++] = param2;
            }
          }
          param4 = param4 + param7;
          param3 = param3 + param8;
        }
    }

    final void c() {
        if (this.width == this.fullWidth &&
          this.height == this.fullHeight) {
          return;
        }
        int[] var1 = new int[this.fullWidth * this.fullHeight];
        for (int var2 = 0; var2 < this.height; var2++) {
          for (int var3 = 0; var3 < this.width; var3++) {
            var1[(var2 + this.offsetY) * this.fullWidth + (var3 + this.offsetX)] = this.pixels[var2 * this.width + var3];
          }
        }
        this.pixels = var1;
        this.width = this.fullWidth;
        this.height = this.fullHeight;
        this.offsetX = 0;
        this.offsetY = 0;
    }

    private final static void c(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var9 = -(param5 >> 2);
        param5 = -(param5 & 3);
        for (int var10 = -param6; var10 < 0; var10++) {
          for (int var11 = var9; var11 < 0; var11++) {
            param2 = param1[param3++];
            if (param2 == 0) {
              param4++;
            } else {
              param0[param4++] = param2;
            }
            param2 = param1[param3++];
            if (param2 == 0) {
              param4++;
            } else {
              param0[param4++] = param2;
            }
            param2 = param1[param3++];
            if (param2 == 0) {
              param4++;
            } else {
              param0[param4++] = param2;
            }
            param2 = param1[param3++];
            if (param2 == 0) {
              param4++;
            } else {
              param0[param4++] = param2;
            }
          }
          for (int var11Lifetime1 = param5; var11Lifetime1 < 0; var11Lifetime1++) {
            param2 = param1[param3++];
            if (param2 == 0) {
              param4++;
            } else {
              param0[param4++] = param2;
            }
          }
          param4 = param4 + param7;
          param3 = param3 + param8;
        }
    }

    private final static void c(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int var10 = param9 >> 16 & 255;
        int var11 = param9 >> 8 & 255;
        int var12 = param9 & 255;
        int var13 = -(param5 >> 2);
        param5 = -(param5 & 3);
        int var14 = var13 + var13 + var13 + var13 + param5;
        for (int var15 = -param6; var15 < 0; var15++) {
          for (int var16 = var14; var16 < 0; var16++) {
            param2 = param1[param3++];
            if (param2 == 0) {
              param4++;
            } else {
              int var17 = param2 >> 16 & 255;
              int var18 = param2 >> 8 & 255;
              int var19 = param2 & 255;
              if (var17 == var18 &&
                var18 == var19) {
                if (var17 > 128) {
                  int incrementValue$1 = param4;
                  param4++;
                  param0[incrementValue$1] = (var10 * (256 - var17) + 255 * (var17 - 128) >> 7 << 16) + (var11 * (256 - var18) + 255 * (var18 - 128) >> 7 << 8) + (var12 * (256 - var19) + 255 * (var19 - 128) >> 7);
                } else {
                  int incrementValue$2 = param4;
                  param4++;
                  param0[incrementValue$2] = (var17 * var10 >> 7 << 16) + (var18 * var11 >> 7 << 8) + (var19 * var12 >> 7);
                }
                boolean decompiledFrameRemainder0 = false;
              }
              else {
                param0[param4++] = param2;
              }
            }
          }
          param4 = param4 + param7;
          param3 = param3 + param8;
        }
    }

    private final static void b(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11) {
        int var12 = param3;
        for (int var13 = -param8; var13 < 0; var13++) {
          int var14 = (param4 >> 16) * param11;
          for (int var15 = -param7; var15 < 0; var15++) {
            param2 = param1[(param3 >> 16) + var14];
            if (param2 != 0) {
              param0[param5++] = param2;
            } else {
              param5++;
            }
            param3 = param3 + param9;
          }
          param4 = param4 + param10;
          param3 = var12;
          param5 = param5 + param6;
        }
    }

    final void e() {
        int[] var1 = this.pixels;
        for (int var2 = this.height - 1; var2 >= 0; var2--) {
          int var3 = var2 * this.width;
          int var4 = (var2 + 1) * this.width;
          while (var3 < var4) {
            var4--;
            int var5 = var1[var3];
            var1[var3] = var1[var4];
            var1[var4] = var5;
            var3++;
          }
        }
        this.offsetX = this.fullWidth - this.width - this.offsetX;
    }

    private final static void a(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        for (int var10 = -param6; var10 < 0; var10++) {
          for (int var11 = -param5; var11 < 0; var11++) {
            param2 = param1[param3++];
            if (param2 == 0) {
              param4++;
            } else {
              int var12 = (param2 & 16711935) * param9 & -16711936;
              int var13 = (param2 & 65280) * param9 & 16711680;
              int incrementValue$12 = param4;
              param4++;
              param0[incrementValue$12] = (var12 | var13) >>> 8;
            }
          }
          param4 = param4 + param7;
          param3 = param3 + param8;
        }
    }

    final Sprite d() {
        Sprite var1 = new Sprite(this.width, this.height);
        var1.fullWidth = this.fullWidth;
        var1.fullHeight = this.fullHeight;
        var1.offsetX = this.fullWidth - this.width - this.offsetX;
        var1.offsetY = this.offsetY;
        for (int var2 = 0; var2 < this.height; var2++) {
          for (int var3 = 0; var3 < this.width; var3++) {
            var1.pixels[var2 * this.width + var3] = this.pixels[var2 * this.width + this.width - 1 - var3];
          }
        }
        return var1;
    }

    private final static void a(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12) {
        int var13 = 256 - param12;
        int var14 = param3;
        for (int var15 = -param8; var15 < 0; var15++) {
          int var16 = (param4 >> 16) * param11;
          for (int var17 = -param7; var17 < 0; var17++) {
            param2 = param1[(param3 >> 16) + var16];
            if (param2 != 0) {
              int var18 = param0[param5];
              int incrementValue$0 = param5;
              param5++;
              param0[incrementValue$0] = ((param2 & 16711935) * param12 + (var18 & 16711935) * var13 & -16711936) + ((param2 & 65280) * param12 + (var18 & 65280) * var13 & 16711680) >> 8;
            } else {
              param5++;
            }
            param3 = param3 + param9;
          }
          param4 = param4 + param10;
          param3 = var14;
          param5 = param5 + param6;
        }
    }

    final void h(int param0) {
        int[] var2 = new int[this.width * this.height];
        int var3 = 0;
        for (int var4 = 0; var4 < this.height; var4++) {
          for (int var5 = 0; var5 < this.width; var5++) {
            int var6 = this.pixels[var3];
            if (var6 == 0) {
              if (var5 > 0 &&
                this.pixels[var3 - 1] != 0) {
                var6 = param0;
              } else if (var4 > 0 &&
                this.pixels[var3 - this.width] != 0) {
                var6 = param0;
              } else if (var5 < this.width - 1 &&
                this.pixels[var3 + 1] != 0) {
                var6 = param0;
              } else if (var4 < this.height - 1 &&
                this.pixels[var3 + this.width] != 0) {
                var6 = param0;
              }
            }
            var2[var3++] = var6;
          }
        }
        this.pixels = var2;
    }

    void c(int param0, int param1) {
        param0 = param0 + (this.fullWidth - this.width - this.offsetX);
        param1 = param1 + this.offsetY;
        int var3 = param0 + param1 * SoftwareRasterizer.width;
        int var4 = this.width - 1;
        int var5 = this.height;
        int var6 = this.width;
        int var7 = SoftwareRasterizer.width - var6;
        int var8 = var6 + var6;
        if (param1 < SoftwareRasterizer.clipTop) {
          int var9 = SoftwareRasterizer.clipTop - param1;
          var5 = var5 - var9;
          param1 = SoftwareRasterizer.clipTop;
          var4 = var4 + var9 * var6;
          var3 = var3 + var9 * SoftwareRasterizer.width;
        }
        if (param1 + var5 > SoftwareRasterizer.clipBottom) {
          var5 = var5 - (param1 + var5 - SoftwareRasterizer.clipBottom);
        }
        if (param0 < SoftwareRasterizer.clipLeft) {
          int var9Lifetime1 = SoftwareRasterizer.clipLeft - param0;
          var6 = var6 - var9Lifetime1;
          param0 = SoftwareRasterizer.clipLeft;
          var4 = var4 - var9Lifetime1;
          var3 = var3 + var9Lifetime1;
          var8 = var8 - var9Lifetime1;
          var7 = var7 + var9Lifetime1;
        }
        if (param0 + var6 > SoftwareRasterizer.clipRight) {
          int var9Lifetime2 = param0 + var6 - SoftwareRasterizer.clipRight;
          var6 = var6 - var9Lifetime2;
          var8 = var8 - var9Lifetime2;
          var7 = var7 + var9Lifetime2;
        }
        if (var6 > 0) {
          if (var5 <= 0) {
            return;
          }
          Sprite.b(SoftwareRasterizer.pixels, this.pixels, 0, var4, var3, var6, var5, var7, var8);
          return;
        }
    }

    void d(int param0, int param1) {
        param0 = param0 + this.offsetX;
        param1 = param1 + this.offsetY;
        int var3 = param0 + param1 * SoftwareRasterizer.width;
        int var4 = 0;
        int var5 = this.height;
        int var6 = this.width;
        int var7 = SoftwareRasterizer.width - var6;
        int var8 = 0;
        if (param1 < SoftwareRasterizer.clipTop) {
          int var9 = SoftwareRasterizer.clipTop - param1;
          var5 = var5 - var9;
          param1 = SoftwareRasterizer.clipTop;
          var4 = var4 + var9 * var6;
          var3 = var3 + var9 * SoftwareRasterizer.width;
        }
        if (param1 + var5 > SoftwareRasterizer.clipBottom) {
          var5 = var5 - (param1 + var5 - SoftwareRasterizer.clipBottom);
        }
        if (param0 < SoftwareRasterizer.clipLeft) {
          int var9Lifetime1 = SoftwareRasterizer.clipLeft - param0;
          var6 = var6 - var9Lifetime1;
          param0 = SoftwareRasterizer.clipLeft;
          var4 = var4 + var9Lifetime1;
          var3 = var3 + var9Lifetime1;
          var8 = var8 + var9Lifetime1;
          var7 = var7 + var9Lifetime1;
        }
        if (param0 + var6 > SoftwareRasterizer.clipRight) {
          int var9Lifetime2 = param0 + var6 - SoftwareRasterizer.clipRight;
          var6 = var6 - var9Lifetime2;
          var8 = var8 + var9Lifetime2;
          var7 = var7 + var9Lifetime2;
        }
        if (var6 > 0) {
          if (var5 <= 0) {
            return;
          }
          Sprite.a(SoftwareRasterizer.pixels, this.pixels, var4, var3, var6, var5, var7, var8);
          return;
        }
    }

    final void a() {
        int[] var1 = new int[this.width * this.height];
        int var2 = 0;
        for (int var3 = 0; var3 < this.width; var3++) {
          for (int var4 = this.height - 1; var4 >= 0; var4--) {
            int incrementValue$0 = var2;
            var2++;
            var1[incrementValue$0] = this.pixels[var3 + var4 * this.width];
          }
        }
        this.pixels = var1;
        int var3Lifetime1 = this.offsetY;
        this.offsetY = this.offsetX;
        this.offsetX = this.fullHeight - this.height - var3Lifetime1;
        int var3Lifetime2 = this.height;
        this.height = this.width;
        this.width = var3Lifetime2;
        int var3Lifetime3 = this.fullHeight;
        this.fullHeight = this.fullWidth;
        this.fullWidth = var3Lifetime3;
    }

    void b(int param0, int param1, int param2, int param3) {
        if (param2 > 0) {
          if (param3 <= 0) {
            return;
          }
          int var5 = this.width;
          int var6 = this.height;
          int var7 = 0;
          int var8 = 0;
          int var9 = this.fullWidth;
          int var10 = this.fullHeight;
          int var11 = (var9 << 16) / param2;
          int var12 = (var10 << 16) / param3;
          if (this.offsetX > 0) {
            int var13 = ((this.offsetX << 16) + var11 - 1) / var11;
            param0 = param0 + var13;
            var7 = var7 + (var13 * var11 - (this.offsetX << 16));
          }
          if (this.offsetY > 0) {
            int var13Lifetime1 = ((this.offsetY << 16) + var12 - 1) / var12;
            param1 = param1 + var13Lifetime1;
            var8 = var8 + (var13Lifetime1 * var12 - (this.offsetY << 16));
          }
          if (var5 < var9) {
            param2 = ((var5 << 16) - var7 + var11 - 1) / var11;
          }
          if (var6 < var10) {
            param3 = ((var6 << 16) - var8 + var12 - 1) / var12;
          }
          int var13Lifetime2 = param0 + param1 * SoftwareRasterizer.width;
          int var14 = SoftwareRasterizer.width - param2;
          if (param1 + param3 > SoftwareRasterizer.clipBottom) {
            param3 = param3 - (param1 + param3 - SoftwareRasterizer.clipBottom);
          }
          if (param1 < SoftwareRasterizer.clipTop) {
            int var15 = SoftwareRasterizer.clipTop - param1;
            param3 = param3 - var15;
            var13Lifetime2 = var13Lifetime2 + var15 * SoftwareRasterizer.width;
            var8 = var8 + var12 * var15;
          }
          if (param0 + param2 > SoftwareRasterizer.clipRight) {
            int var15Lifetime1 = param0 + param2 - SoftwareRasterizer.clipRight;
            param2 = param2 - var15Lifetime1;
            var14 = var14 + var15Lifetime1;
          }
          if (param0 < SoftwareRasterizer.clipLeft) {
            int var15Lifetime2 = SoftwareRasterizer.clipLeft - param0;
            param2 = param2 - var15Lifetime2;
            var13Lifetime2 = var13Lifetime2 + var15Lifetime2;
            var7 = var7 + var11 * var15Lifetime2;
            var14 = var14 + var15Lifetime2;
          }
          Sprite.b(SoftwareRasterizer.pixels, this.pixels, 0, var7, var8, var13Lifetime2, var14, param2, param3, var11, var12, var5);
          return;
        }
    }

    final void e(int param0, int param1, int param2) {
        param0 = param0 + this.offsetX;
        param1 = param1 + this.offsetY;
        int var4 = param0 + param1 * SoftwareRasterizer.width;
        int var5 = 0;
        int var6 = this.height;
        int var7 = this.width;
        int var8 = SoftwareRasterizer.width - var7;
        int var9 = 0;
        if (param1 < SoftwareRasterizer.clipTop) {
          int var10 = SoftwareRasterizer.clipTop - param1;
          var6 = var6 - var10;
          param1 = SoftwareRasterizer.clipTop;
          var5 = var5 + var10 * var7;
          var4 = var4 + var10 * SoftwareRasterizer.width;
        }
        if (param1 + var6 > SoftwareRasterizer.clipBottom) {
          var6 = var6 - (param1 + var6 - SoftwareRasterizer.clipBottom);
        }
        if (param0 < SoftwareRasterizer.clipLeft) {
          int var10Lifetime1 = SoftwareRasterizer.clipLeft - param0;
          var7 = var7 - var10Lifetime1;
          param0 = SoftwareRasterizer.clipLeft;
          var5 = var5 + var10Lifetime1;
          var4 = var4 + var10Lifetime1;
          var9 = var9 + var10Lifetime1;
          var8 = var8 + var10Lifetime1;
        }
        if (param0 + var7 > SoftwareRasterizer.clipRight) {
          int var10Lifetime2 = param0 + var7 - SoftwareRasterizer.clipRight;
          var7 = var7 - var10Lifetime2;
          var9 = var9 + var10Lifetime2;
          var8 = var8 + var10Lifetime2;
        }
        if (var7 > 0) {
          if (var6 <= 0) {
            return;
          }
          Sprite.a(SoftwareRasterizer.pixels, this.pixels, param2, var5, var4, var7, var6, var8, var9);
          return;
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (param2 <= this.fullWidth &&
          param3 <= this.fullHeight) {
          int var5 = param0 + this.offsetX * param2 / this.fullWidth;
          int var6 = param0 + ((this.offsetX + this.width) * param2 + this.fullWidth - 1) / this.fullWidth;
          int var7 = param1 + this.offsetY * param3 / this.fullHeight;
          int var8 = param1 + ((this.offsetY + this.height) * param3 + this.fullHeight - 1) / this.fullHeight;
          if (var5 < SoftwareRasterizer.clipLeft) {
            var5 = SoftwareRasterizer.clipLeft;
          }
          if (var6 > SoftwareRasterizer.clipRight) {
            var6 = SoftwareRasterizer.clipRight;
          }
          if (var7 < SoftwareRasterizer.clipTop) {
            var7 = SoftwareRasterizer.clipTop;
          }
          if (var8 > SoftwareRasterizer.clipBottom) {
            var8 = SoftwareRasterizer.clipBottom;
          }
          if (var5 >= var6) {
            return;
          }
          if (var7 >= var8) {
            return;
          }
          int var9 = var7 * SoftwareRasterizer.width + var5;
          int var10 = SoftwareRasterizer.width - (var6 - var5);
          for (int var11 = var7; var11 < var8; var11++) {
            for (int var12 = var5; var12 < var6; var12++) {
              int var13 = var12 - param0 << 4;
              int var14 = var11 - param1 << 4;
              int var15 = var13 * this.fullWidth / param2 - (this.offsetX << 4);
              int var16 = (var13 + 16) * this.fullWidth / param2 - (this.offsetX << 4);
              int var17 = var14 * this.fullHeight / param3 - (this.offsetY << 4);
              int var18 = (var14 + 16) * this.fullHeight / param3 - (this.offsetY << 4);
              int var19 = (var16 - var15) * (var18 - var17) >> 1;
              if (var19 != 0) {
                if (var15 < 0) {
                  var15 = 0;
                }
                if (var16 > this.width << 4) {
                  var16 = this.width << 4;
                }
                if (var17 < 0) {
                  var17 = 0;
                }
                if (var18 > this.height << 4) {
                  var18 = this.height << 4;
                }
                var16--;
                var18--;
                int var20 = 16 - (var15 & 15);
                int var21 = (var16 & 15) + 1;
                int var22 = 16 - (var17 & 15);
                int var23 = (var18 & 15) + 1;
                var15 = var15 >> 4;
                var16 = var16 >> 4;
                var17 = var17 >> 4;
                var18 = var18 >> 4;
                int var24 = 0;
                int var25 = 0;
                int var26 = 0;
                int var27 = 0;
                for (int var28 = var17; var28 <= var18; var28++) {
                  int var29 = 16;
                  if (var28 == var17) {
                    var29 = var22;
                  }
                  if (var28 == var18) {
                    var29 = var23;
                  }
                  for (int var30 = var15; var30 <= var16; var30++) {
                    int var31 = this.pixels[var28 * this.width + var30];
                    if (var31 != 0) {
                      int var32 = var29;
                      if (var30 == var15) {
                        var32 = var32 * var20;
                      } else if (var30 != var16) {
                        var32 = var32 << 4;
                      } else {
                        var32 = var32 * var21;
                      }
                      var27 = var27 + var32;
                      var24 = var24 + (var31 >> 16 & 255) * var32;
                      var25 = var25 + (var31 >> 8 & 255) * var32;
                      var26 = var26 + (var31 & 255) * var32;
                    }
                  }
                }
                if (var27 >= var19) {
                  int var28Lifetime1 = (var24 / var27 << 16) + (var25 / var27 << 8) + var26 / var27;
                  if (var28Lifetime1 == 0) {
                    var28Lifetime1 = 1;
                  }
                  SoftwareRasterizer.pixels[var9] = var28Lifetime1;
                }
                var9++;
              }
            }
            var9 = var9 + var10;
          }
          return;
        }
        throw new IllegalArgumentException();
    }

    private final void b(int param0, int param1, int param2, int param3, int param4) {
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_25_0 = 0;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var16;
        int var17;
        int var18;
        int var6 = param2 * this.width + param1;
        param3 = param3 & 4095;
        param4 = param4 & 4095;
        if (param2 < 0) {
          var12 = 0;
          var11 = 0;
          var8 = 0;
          var7 = 0;
        } else {
          if (param1 < 0) {
            var11 = 0;
            var7 = 0;
          } else {
            var7 = this.pixels[var6];
            if (var7 == 0) {
              stackIn_5_0 = 0;
            } else {
              stackIn_5_0 = (4096 - param3) * (4096 - param4);
            }
            var11 = stackIn_5_0;
          }
          if (param1 >= this.width - 1) {
            var12 = 0;
            var8 = 0;
          } else {
            var8 = this.pixels[var6 + 1];
            if (var8 == 0) {
              stackIn_11_0 = 0;
            } else {
              stackIn_11_0 = param3 * (4096 - param4);
            }
            var12 = stackIn_11_0;
          }
        }
        if (param2 >= this.height - 1) {
          var14 = 0;
          var13 = 0;
          var10 = 0;
          var9 = 0;
        } else {
          if (param1 < 0) {
            var13 = 0;
            var9 = 0;
          } else {
            var9 = this.pixels[var6 + this.width];
            if (var9 == 0) {
              stackIn_19_0 = 0;
            } else {
              stackIn_19_0 = (4096 - param3) * param4;
            }
            var13 = stackIn_19_0;
          }
          if (param1 >= this.width - 1) {
            var14 = 0;
            var10 = 0;
          } else {
            var10 = this.pixels[var6 + this.width + 1];
            if (var10 == 0) {
              stackIn_25_0 = 0;
            } else {
              stackIn_25_0 = param3 * param4;
            }
            var14 = stackIn_25_0;
          }
        }
        var11 = var11 >> 16;
        var12 = var12 >> 16;
        var13 = var13 >> 16;
        var14 = var14 >> 16;
        int var15 = var11 + var12 + var13 + var14;
        if (var15 < 256) {
          if (var15 < 128) {
            return;
          }
          var16 = (var7 & 16711935) * var11 + (var8 & 16711935) * var12;
          var16 = var16 + ((var9 & 16711935) * var13 + (var10 & 16711935) * var14);
          var17 = (var7 & 65280) * var11 + (var8 & 65280) * var12;
          var17 = var17 + ((var9 & 65280) * var13 + (var10 & 65280) * var14);
          var18 = ((var16 >>> 16) / var15 << 16) + (var17 / var15 & 65280) + (var16 & 65535) / var15;
          if (var18 == 0) {
            var18 = 1;
          }
          SoftwareRasterizer.pixels[param0] = var18;
        } else {
          var16 = (var7 & 16711935) * var11 + (var8 & 16711935) * var12;
          var16 = var16 + ((var9 & 16711935) * var13 + (var10 & 16711935) * var14);
          var17 = (var7 & 65280) * var11 + (var8 & 65280) * var12;
          var17 = var17 + ((var9 & 65280) * var13 + (var10 & 65280) * var14);
          var18 = (var16 >>> 8 & 16711935) + (var17 >>> 8 & 65280);
          if (var18 == 0) {
            var18 = 1;
          }
          SoftwareRasterizer.pixels[param0] = var18;
        }
    }

    void e(int param0, int param1) {
        param0 = param0 + this.offsetX;
        param1 = param1 + this.offsetY;
        int var3 = param0 + param1 * SoftwareRasterizer.width;
        int var4 = 0;
        int var5 = this.height;
        int var6 = this.width;
        int var7 = SoftwareRasterizer.width - var6;
        int var8 = 0;
        if (param1 < SoftwareRasterizer.clipTop) {
          int var9 = SoftwareRasterizer.clipTop - param1;
          var5 = var5 - var9;
          param1 = SoftwareRasterizer.clipTop;
          var4 = var4 + var9 * var6;
          var3 = var3 + var9 * SoftwareRasterizer.width;
        }
        if (param1 + var5 > SoftwareRasterizer.clipBottom) {
          var5 = var5 - (param1 + var5 - SoftwareRasterizer.clipBottom);
        }
        if (param0 < SoftwareRasterizer.clipLeft) {
          int var9Lifetime1 = SoftwareRasterizer.clipLeft - param0;
          var6 = var6 - var9Lifetime1;
          param0 = SoftwareRasterizer.clipLeft;
          var4 = var4 + var9Lifetime1;
          var3 = var3 + var9Lifetime1;
          var8 = var8 + var9Lifetime1;
          var7 = var7 + var9Lifetime1;
        }
        if (param0 + var6 > SoftwareRasterizer.clipRight) {
          int var9Lifetime2 = param0 + var6 - SoftwareRasterizer.clipRight;
          var6 = var6 - var9Lifetime2;
          var8 = var8 + var9Lifetime2;
          var7 = var7 + var9Lifetime2;
        }
        if (var6 > 0) {
          if (var5 <= 0) {
            return;
          }
          Sprite.c(SoftwareRasterizer.pixels, this.pixels, 0, var4, var3, var6, var5, var7, var8);
          return;
        }
    }

    private final static void a(int param0, int param1, int param2, int[] param3, int[] param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13) {
        for (param8 = -param10; param8 < 0; param8++) {
          for (param6 = -param9; param6 < 0; param6++) {
            param0 = param4[param5++];
            if (param0 == 0) {
              param7++;
            } else {
              param1 = (param0 & 16711935) * param13;
              param0 = (param1 & -16711936) + (param0 * param13 - param1 & 16711680) >>> 8;
              param1 = param3[param7];
              param2 = param0 + param1;
              param0 = (param0 & 16711935) + (param1 & 16711935);
              param1 = (param0 & 16777472) + (param2 - param0 & 65536);
              int incrementValue$12 = param7;
              param7++;
              param3[incrementValue$12] = param2 - param1 | param1 - (param1 >>> 8);
            }
          }
          param7 = param7 + param11;
          param5 = param5 + param12;
        }
    }

    private final static void b(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var9 = -(param5 >> 2);
        param5 = -(param5 & 3);
        for (int var10 = -param6; var10 < 0; var10++) {
          for (int var11 = var9; var11 < 0; var11++) {
            param2 = param1[param3--];
            if (param2 == 0) {
              param4++;
            } else {
              param0[param4++] = param2;
            }
            param2 = param1[param3--];
            if (param2 == 0) {
              param4++;
            } else {
              param0[param4++] = param2;
            }
            param2 = param1[param3--];
            if (param2 == 0) {
              param4++;
            } else {
              param0[param4++] = param2;
            }
            param2 = param1[param3--];
            if (param2 == 0) {
              param4++;
            } else {
              param0[param4++] = param2;
            }
          }
          for (int var11Lifetime1 = param5; var11Lifetime1 < 0; var11Lifetime1++) {
            param2 = param1[param3--];
            if (param2 == 0) {
              param4++;
            } else {
              param0[param4++] = param2;
            }
          }
          param4 = param4 + param7;
          param3 = param3 + param8;
        }
    }

    private final static void b(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int var10 = 256 - param9;
        for (int var11 = -param6; var11 < 0; var11++) {
          for (int var12 = -param5; var12 < 0; var12++) {
            param2 = param1[param3++];
            if (param2 == 0) {
              param4++;
            } else {
              int var13 = param0[param4];
              int incrementValue$12 = param4;
              param4++;
              param0[incrementValue$12] = ((param2 & 16711935) * param9 + (var13 & 16711935) * var10 & -16711936) + ((param2 & 65280) * param9 + (var13 & 65280) * var10 & 16711680) >> 8;
            }
          }
          param4 = param4 + param7;
          param3 = param3 + param8;
        }
    }

    final void f(int param0, int param1) {
        param0 = param0 + this.offsetX;
        param1 = param1 + this.offsetY;
        int var3 = param0 + param1 * SoftwareRasterizer.width;
        int var4 = 0;
        int var5 = this.height;
        int var6 = this.width;
        int var7 = SoftwareRasterizer.width - var6;
        int var8 = 0;
        if (param1 < SoftwareRasterizer.clipTop) {
          int var9 = SoftwareRasterizer.clipTop - param1;
          var5 = var5 - var9;
          param1 = SoftwareRasterizer.clipTop;
          var4 = var4 + var9 * var6;
          var3 = var3 + var9 * SoftwareRasterizer.width;
        }
        if (param1 + var5 > SoftwareRasterizer.clipBottom) {
          var5 = var5 - (param1 + var5 - SoftwareRasterizer.clipBottom);
        }
        if (param0 < SoftwareRasterizer.clipLeft) {
          int var9Lifetime1 = SoftwareRasterizer.clipLeft - param0;
          var6 = var6 - var9Lifetime1;
          param0 = SoftwareRasterizer.clipLeft;
          var4 = var4 + var9Lifetime1;
          var3 = var3 + var9Lifetime1;
          var8 = var8 + var9Lifetime1;
          var7 = var7 + var9Lifetime1;
        }
        if (param0 + var6 > SoftwareRasterizer.clipRight) {
          int var9Lifetime2 = param0 + var6 - SoftwareRasterizer.clipRight;
          var6 = var6 - var9Lifetime2;
          var8 = var8 + var9Lifetime2;
          var7 = var7 + var9Lifetime2;
        }
        if (var6 > 0) {
          if (var5 <= 0) {
            return;
          }
          Sprite.a(0, SoftwareRasterizer.pixels, this.pixels, 0, var4, var3, var6, var5, var7, var8);
          return;
        }
    }

    void d(int param0, int param1, int param2) {
        param0 = param0 + this.offsetX;
        param1 = param1 + this.offsetY;
        int var4 = param0 + param1 * SoftwareRasterizer.width;
        int var5 = 0;
        int var6 = this.height;
        int var7 = this.width;
        int var8 = SoftwareRasterizer.width - var7;
        int var9 = 0;
        if (param1 < SoftwareRasterizer.clipTop) {
          int var10 = SoftwareRasterizer.clipTop - param1;
          var6 = var6 - var10;
          param1 = SoftwareRasterizer.clipTop;
          var5 = var5 + var10 * var7;
          var4 = var4 + var10 * SoftwareRasterizer.width;
        }
        if (param1 + var6 > SoftwareRasterizer.clipBottom) {
          var6 = var6 - (param1 + var6 - SoftwareRasterizer.clipBottom);
        }
        if (param0 < SoftwareRasterizer.clipLeft) {
          int var10Lifetime1 = SoftwareRasterizer.clipLeft - param0;
          var7 = var7 - var10Lifetime1;
          param0 = SoftwareRasterizer.clipLeft;
          var5 = var5 + var10Lifetime1;
          var4 = var4 + var10Lifetime1;
          var9 = var9 + var10Lifetime1;
          var8 = var8 + var10Lifetime1;
        }
        if (param0 + var7 > SoftwareRasterizer.clipRight) {
          int var10Lifetime2 = param0 + var7 - SoftwareRasterizer.clipRight;
          var7 = var7 - var10Lifetime2;
          var9 = var9 + var10Lifetime2;
          var8 = var8 + var10Lifetime2;
        }
        if (var7 > 0) {
          if (var6 <= 0) {
            return;
          }
          Sprite.b(SoftwareRasterizer.pixels, this.pixels, 0, var5, var4, var7, var6, var8, var9, param2);
          return;
        }
    }

    final void c(int param0, int param1, int param2, int param3) {
        int var5 = this.fullWidth << 3;
        int var6 = this.fullHeight << 3;
        param0 = (param0 << 4) + (var5 & 15);
        param1 = (param1 << 4) + (var6 & 15);
        this.b(var5, var6, param0, param1, param2, param3);
    }

    void a(int param0, int param1, int param2, int param3, int param4) {
        if (param2 > 0) {
          if (param3 <= 0) {
            return;
          }
          int var6 = this.width;
          int var7 = this.height;
          int var8 = 0;
          int var9 = 0;
          int var10 = this.fullWidth;
          int var11 = this.fullHeight;
          int var12 = (var10 << 16) / param2;
          int var13 = (var11 << 16) / param3;
          if (this.offsetX > 0) {
            int var14 = ((this.offsetX << 16) + var12 - 1) / var12;
            param0 = param0 + var14;
            var8 = var8 + (var14 * var12 - (this.offsetX << 16));
          }
          if (this.offsetY > 0) {
            int var14Lifetime1 = ((this.offsetY << 16) + var13 - 1) / var13;
            param1 = param1 + var14Lifetime1;
            var9 = var9 + (var14Lifetime1 * var13 - (this.offsetY << 16));
          }
          if (var6 < var10) {
            param2 = ((var6 << 16) - var8 + var12 - 1) / var12;
          }
          if (var7 < var11) {
            param3 = ((var7 << 16) - var9 + var13 - 1) / var13;
          }
          int var14Lifetime2 = param0 + param1 * SoftwareRasterizer.width;
          int var15 = SoftwareRasterizer.width - param2;
          if (param1 + param3 > SoftwareRasterizer.clipBottom) {
            param3 = param3 - (param1 + param3 - SoftwareRasterizer.clipBottom);
          }
          if (param1 < SoftwareRasterizer.clipTop) {
            int var16 = SoftwareRasterizer.clipTop - param1;
            param3 = param3 - var16;
            var14Lifetime2 = var14Lifetime2 + var16 * SoftwareRasterizer.width;
            var9 = var9 + var13 * var16;
          }
          if (param0 + param2 > SoftwareRasterizer.clipRight) {
            int var16Lifetime1 = param0 + param2 - SoftwareRasterizer.clipRight;
            param2 = param2 - var16Lifetime1;
            var15 = var15 + var16Lifetime1;
          }
          if (param0 < SoftwareRasterizer.clipLeft) {
            int var16Lifetime2 = SoftwareRasterizer.clipLeft - param0;
            param2 = param2 - var16Lifetime2;
            var14Lifetime2 = var14Lifetime2 + var16Lifetime2;
            var8 = var8 + var12 * var16Lifetime2;
            var15 = var15 + var16Lifetime2;
          }
          Sprite.a(SoftwareRasterizer.pixels, this.pixels, 0, var8, var9, var14Lifetime2, var15, param2, param3, var12, var13, var6, param4);
          return;
        }
    }

    Sprite(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6) {
        this.fullWidth = param0;
        this.fullHeight = param1;
        this.offsetX = param2;
        this.offsetY = param3;
        this.width = param4;
        this.height = param5;
        this.pixels = param6;
    }

    Sprite(int param0, int param1) {
        this.pixels = new int[param0 * param1];
        this.fullWidth = param0;
        this.width = param0;
        this.fullHeight = param1;
        this.height = param1;
        this.offsetY = 0;
        this.offsetX = 0;
    }

    Sprite(byte[] param0, java.awt.Component param1) {
        try {
          java.awt.Image var3 = java.awt.Toolkit.getDefaultToolkit().createImage(param0);
          java.awt.MediaTracker var4 = new java.awt.MediaTracker(param1);
          var4.addImage(var3, 0);
          var4.waitForAll();
          this.width = var3.getWidth((java.awt.image.ImageObserver) ((Object) param1));
          this.height = var3.getHeight((java.awt.image.ImageObserver) ((Object) param1));
          this.fullWidth = this.width;
          this.fullHeight = this.height;
          this.offsetX = 0;
          this.offsetY = 0;
          this.pixels = new int[this.width * this.height];
          java.awt.image.PixelGrabber var5 = new java.awt.image.PixelGrabber(var3, 0, 0, this.width, this.height, this.pixels, 0, this.width);
          var5.grabPixels();
        } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
          Throwable decompiledCaughtException = decompiledCaughtParameter0;
          InterruptedException var3_ref = (InterruptedException) (Object) decompiledCaughtException;
        }
    }
}
