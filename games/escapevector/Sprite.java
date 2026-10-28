/*
 * Decompiled by CFR-JS 0.4.0.
 */
class Sprite extends SpriteState {
    int[] pixels;

    void drawShadedTint(int x, int y, int tint) {
        x = x + this.offsetX;
        y = y + this.offsetY;
        int var4 = x + y * SoftwareRasterizer.width;
        int var5 = 0;
        int var6 = this.height;
        int var7 = this.width;
        int var8 = SoftwareRasterizer.width - var7;
        int var9 = 0;
        if (y < SoftwareRasterizer.clipTop) {
          int var10 = SoftwareRasterizer.clipTop - y;
          var6 = var6 - var10;
          y = SoftwareRasterizer.clipTop;
          var5 = var5 + var10 * var7;
          var4 = var4 + var10 * SoftwareRasterizer.width;
        }
        if (y + var6 > SoftwareRasterizer.clipBottom) {
          var6 = var6 - (y + var6 - SoftwareRasterizer.clipBottom);
        }
        if (x < SoftwareRasterizer.clipLeft) {
          int var10Lifetime1 = SoftwareRasterizer.clipLeft - x;
          var7 = var7 - var10Lifetime1;
          x = SoftwareRasterizer.clipLeft;
          var5 = var5 + var10Lifetime1;
          var4 = var4 + var10Lifetime1;
          var9 = var9 + var10Lifetime1;
          var8 = var8 + var10Lifetime1;
        }
        if (x + var7 > SoftwareRasterizer.clipRight) {
          int var10Lifetime2 = x + var7 - SoftwareRasterizer.clipRight;
          var7 = var7 - var10Lifetime2;
          var9 = var9 + var10Lifetime2;
          var8 = var8 + var10Lifetime2;
        }
        if (var7 > 0) {
          if (var6 <= 0) {
            return;
          }
          Sprite.blitShadedTint(SoftwareRasterizer.pixels, this.pixels, 0, var5, var4, var7, var6, var8, var9, tint);
          return;
        }
    }

    final void bindAsFramebuffer() {
        SoftwareRasterizer.bind(this.pixels, this.width, this.height);
    }

    private final static void blitTinted(int[] destination, int[] source, int sourceColor, int sourceIndex, int destinationIndex, int column, int row, int rowWidth, int rowCount, int destinationRowSkip, int sourceRowSkip, int tint) {
        int var12 = tint & 16711935;
        int var13 = tint >> 8 & 255;
        for (row = -rowCount; row < 0; row++) {
          for (column = -rowWidth; column < 0; column++) {
            sourceColor = source[sourceIndex++];
            if (sourceColor == 0) {
              destinationIndex++;
            } else if (sourceColor >> 8 != (sourceColor & 65535)) {
              destination[destinationIndex++] = sourceColor;
            } else {
              sourceColor = sourceColor & 255;
              int incrementValue$14 = destinationIndex;
              destinationIndex++;
              destination[incrementValue$14] = (sourceColor * var12 >> 8 & 16711934) + (sourceColor * var13 & 65280) + 1;
            }
          }
          destinationIndex = destinationIndex + destinationRowSkip;
          sourceIndex = sourceIndex + sourceRowSkip;
        }
    }

    private final static void blitMultiply(int destinationColor, int[] destination, int[] source, int sourceColor, int sourceIndex, int destinationIndex, int rowWidth, int rowCount, int destinationRowSkip, int sourceRowSkip) {
        for (int var10 = -rowCount; var10 < 0; var10++) {
          for (int var11 = -rowWidth; var11 < 0; var11++) {
            sourceColor = source[sourceIndex++];
            if (sourceColor != 0) {
              destinationColor = destination[destinationIndex];
              if (destinationColor != 0) {
                int var12 = ((sourceColor & 16711680) >>> 16) * ((destinationColor & 16711680) >>> 16) >>> 8;
                int var13 = (sourceColor & 65280) * (destinationColor & 65280) >>> 24;
                int var14 = (sourceColor & 255) * (destinationColor & 255) >>> 8;
                int incrementValue$5 = destinationIndex;
                destinationIndex++;
                destination[incrementValue$5] = (var12 << 16) + (var13 << 8) + var14;
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

    void drawWithBrightness(int x, int y, int brightness) {
        if (brightness == 256) {
          this.drawTransparent(x, y);
          return;
        }
        x = x + this.offsetX;
        y = y + this.offsetY;
        int var4 = x + y * SoftwareRasterizer.width;
        int var5 = 0;
        int var6 = this.height;
        int var7 = this.width;
        int var8 = SoftwareRasterizer.width - var7;
        int var9 = 0;
        if (y < SoftwareRasterizer.clipTop) {
          int var10 = SoftwareRasterizer.clipTop - y;
          var6 = var6 - var10;
          y = SoftwareRasterizer.clipTop;
          var5 = var5 + var10 * var7;
          var4 = var4 + var10 * SoftwareRasterizer.width;
        }
        if (y + var6 > SoftwareRasterizer.clipBottom) {
          var6 = var6 - (y + var6 - SoftwareRasterizer.clipBottom);
        }
        if (x < SoftwareRasterizer.clipLeft) {
          int var10Lifetime1 = SoftwareRasterizer.clipLeft - x;
          var7 = var7 - var10Lifetime1;
          x = SoftwareRasterizer.clipLeft;
          var5 = var5 + var10Lifetime1;
          var4 = var4 + var10Lifetime1;
          var9 = var9 + var10Lifetime1;
          var8 = var8 + var10Lifetime1;
        }
        if (x + var7 > SoftwareRasterizer.clipRight) {
          int var10Lifetime2 = x + var7 - SoftwareRasterizer.clipRight;
          var7 = var7 - var10Lifetime2;
          var9 = var9 + var10Lifetime2;
          var8 = var8 + var10Lifetime2;
        }
        if (var7 > 0) {
          if (var6 <= 0) {
            return;
          }
          Sprite.blitBrightness(SoftwareRasterizer.pixels, this.pixels, 0, var5, var4, var7, var6, var8, var9, brightness);
          return;
        }
    }

    final Sprite copy() {
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

    private final static void blitAdditive(int sourceColor, int destinationColor, int sum, int[] destination, int[] source, int sourceIndex, int column, int destinationIndex, int row, int rowWidth, int rowCount, int destinationRowSkip, int sourceRowSkip) {
        for (row = -rowCount; row < 0; row++) {
          for (column = -rowWidth; column < 0; column++) {
            sourceColor = source[sourceIndex++];
            if (sourceColor == 0) {
              destinationIndex++;
            } else {
              destinationColor = destination[destinationIndex];
              sum = sourceColor + destinationColor;
              sourceColor = (sourceColor & 16711935) + (destinationColor & 16711935);
              destinationColor = (sourceColor & 16777472) + (sum - sourceColor & 65536);
              int incrementValue$12 = destinationIndex;
              destinationIndex++;
              destination[incrementValue$12] = sum - destinationColor | destinationColor - (destinationColor >>> 8);
            }
          }
          destinationIndex = destinationIndex + destinationRowSkip;
          sourceIndex = sourceIndex + sourceRowSkip;
        }
    }

    final void trimTransparentEdges() {
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

    final void drawRotatedScaledBilinear(int pivotXQ4, int pivotYQ4, int destinationXQ4, int destinationYQ4, int angle65536, int scaleQ12) {
        int var19;
        int var20;
        int var21;
        int var22;
        if (scaleQ12 == 0) {
          return;
        }
        pivotXQ4 = pivotXQ4 - (this.offsetX << 4);
        pivotYQ4 = pivotYQ4 - (this.offsetY << 4);
        double var7 = (double)(angle65536 & 65535) * 0.00009587379924285257;
        int var9 = (int)Math.floor(Math.sin(var7) * (double)scaleQ12 + 0.5);
        int var10 = (int)Math.floor(Math.cos(var7) * (double)scaleQ12 + 0.5);
        int var11 = -pivotXQ4 * var10 + -pivotYQ4 * var9;
        int var12 = -(-pivotXQ4) * var9 + -pivotYQ4 * var10;
        int var13 = ((this.width << 4) - pivotXQ4) * var10 + -pivotYQ4 * var9;
        int var14 = -((this.width << 4) - pivotXQ4) * var9 + -pivotYQ4 * var10;
        int var15 = -pivotXQ4 * var10 + ((this.height << 4) - pivotYQ4) * var9;
        int var16 = -(-pivotXQ4) * var9 + ((this.height << 4) - pivotYQ4) * var10;
        int var17 = ((this.width << 4) - pivotXQ4) * var10 + ((this.height << 4) - pivotYQ4) * var9;
        int var18 = -((this.width << 4) - pivotXQ4) * var9 + ((this.height << 4) - pivotYQ4) * var10;
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
        var19 = var19 + destinationXQ4;
        var20 = var20 + destinationXQ4;
        var21 = var21 + destinationYQ4;
        var22 = var22 + destinationYQ4;
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
        double var25 = 16777216.0 / (double)scaleQ12;
        int var27 = (int)Math.floor(Math.sin(var7) * var25 + 0.5);
        int var28 = (int)Math.floor(Math.cos(var7) * var25 + 0.5);
        int var29 = (var19 << 4) + 8 - destinationXQ4;
        int var30 = (var21 << 4) + 8 - destinationYQ4;
        int var31 = (pivotXQ4 << 8) - 2048 - (var30 * var27 >> 4);
        int var32 = (pivotYQ4 << 8) - 2048 + (var30 * var28 >> 4);
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
                        this.drawBilinearPixel(var23, var33, var34, var37, var38);
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
                      this.drawBilinearPixel(var23, var33Lifetime3, var34Lifetime3, var37Lifetime3, var38Lifetime3);
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
                      this.drawBilinearPixel(var23, var33Lifetime1, var34Lifetime1, var37Lifetime1, var38Lifetime1);
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
                  this.drawBilinearPixel(var23, var33Lifetime2, var34Lifetime2, var37Lifetime2, var38Lifetime2);
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

    private final static void blitOpaque(int[] destination, int[] source, int sourceIndex, int destinationIndex, int rowWidth, int rowCount, int destinationRowSkip, int sourceRowSkip) {
        for (int var8 = -rowCount; var8 < 0; var8++) {
          int var9 = destinationIndex + rowWidth - 3;
          while (destinationIndex < var9) {
            destination[destinationIndex++] = source[sourceIndex++];
            destination[destinationIndex++] = source[sourceIndex++];
            destination[destinationIndex++] = source[sourceIndex++];
            destination[destinationIndex++] = source[sourceIndex++];
          }
          var9 += 3;
          while (destinationIndex < var9) {
            destination[destinationIndex++] = source[sourceIndex++];
          }
          destinationIndex = destinationIndex + destinationRowSkip;
          sourceIndex = sourceIndex + sourceRowSkip;
        }
    }

    private final static void blitHalfSize(int[] source, int sourceIndex, int destinationIndex, int sourceRowSkip, int destinationRowSkip, int sourceWidth, int rowWidth, int rowCount) {
        int var8 = 0;
        while (var8 < rowCount) {
          int var9 = 0;
          while (var9 < rowWidth) {
            int var11 = SoftwareRasterizer.pixels[destinationIndex] & 16711935;
            int var12 = SoftwareRasterizer.pixels[destinationIndex] & 65280;
            int var13 = 0;
            int var14 = 0;
            int dupTemp$0 = source[sourceIndex];
            int var10 = dupTemp$0;
            if (dupTemp$0 != 0) {
              var13 = var13 + (var10 & 16711935);
              var14 = var14 + (var10 & 65280);
            } else {
              var13 = var13 + var11;
              var14 = var14 + var12;
            }
            int dupTemp$1 = source[sourceIndex + 1];
            int var10Lifetime1 = dupTemp$1;
            if (dupTemp$1 != 0) {
              var13 = var13 + (var10Lifetime1 & 16711935);
              var14 = var14 + (var10Lifetime1 & 65280);
            } else {
              var13 = var13 + var11;
              var14 = var14 + var12;
            }
            int dupTemp$2 = source[sourceIndex + sourceWidth];
            int var10Lifetime2 = dupTemp$2;
            if (dupTemp$2 != 0) {
              var13 = var13 + (var10Lifetime2 & 16711935);
              var14 = var14 + (var10Lifetime2 & 65280);
            } else {
              var13 = var13 + var11;
              var14 = var14 + var12;
            }
            int dupTemp$3 = source[sourceIndex + sourceWidth + 1];
            int var10Lifetime3 = dupTemp$3;
            if (dupTemp$3 != 0) {
              var13 = var13 + (var10Lifetime3 & 16711935);
              var14 = var14 + (var10Lifetime3 & 65280);
            } else {
              var13 = var13 + var11;
              var14 = var14 + var12;
            }
            int incrementValue$4 = destinationIndex;
            destinationIndex++;
            SoftwareRasterizer.pixels[incrementValue$4] = (var13 & 66847740 | var14 & 261120) >> 2;
            var9++;
            sourceIndex += 2;
          }
          var8++;
          sourceIndex = sourceIndex + sourceRowSkip;
          destinationIndex = destinationIndex + destinationRowSkip;
        }
    }

    void drawTinted(int x, int y, int tint) {
        x = x + this.offsetX;
        y = y + this.offsetY;
        int var4 = x + y * SoftwareRasterizer.width;
        int var5 = 0;
        int var6 = this.height;
        int var7 = this.width;
        int var8 = SoftwareRasterizer.width - var7;
        int var9 = 0;
        if (y < SoftwareRasterizer.clipTop) {
          int var10 = SoftwareRasterizer.clipTop - y;
          var6 = var6 - var10;
          y = SoftwareRasterizer.clipTop;
          var5 = var5 + var10 * var7;
          var4 = var4 + var10 * SoftwareRasterizer.width;
        }
        if (y + var6 > SoftwareRasterizer.clipBottom) {
          var6 = var6 - (y + var6 - SoftwareRasterizer.clipBottom);
        }
        if (x < SoftwareRasterizer.clipLeft) {
          int var10Lifetime1 = SoftwareRasterizer.clipLeft - x;
          var7 = var7 - var10Lifetime1;
          x = SoftwareRasterizer.clipLeft;
          var5 = var5 + var10Lifetime1;
          var4 = var4 + var10Lifetime1;
          var9 = var9 + var10Lifetime1;
          var8 = var8 + var10Lifetime1;
        }
        if (x + var7 > SoftwareRasterizer.clipRight) {
          int var10Lifetime2 = x + var7 - SoftwareRasterizer.clipRight;
          var7 = var7 - var10Lifetime2;
          var9 = var9 + var10Lifetime2;
          var8 = var8 + var10Lifetime2;
        }
        if (var7 > 0) {
          if (var6 <= 0) {
            return;
          }
          Sprite.blitTinted(SoftwareRasterizer.pixels, this.pixels, 0, var5, var4, 0, 0, var7, var6, var8, var9, tint);
          return;
        }
    }

    void drawRotatedScaled(int pivotXQ4, int pivotYQ4, int destinationXQ4, int destinationYQ4, int angle65536, int scaleQ12) {
        int var19;
        int var20;
        int var21;
        int var22;
        if (scaleQ12 == 0) {
          return;
        }
        pivotXQ4 = pivotXQ4 - (this.offsetX << 4);
        pivotYQ4 = pivotYQ4 - (this.offsetY << 4);
        double var7 = (double)(angle65536 & 65535) * 0.00009587379924285257;
        int var9 = (int)Math.floor(Math.sin(var7) * (double)scaleQ12 + 0.5);
        int var10 = (int)Math.floor(Math.cos(var7) * (double)scaleQ12 + 0.5);
        int var11 = -pivotXQ4 * var10 + -pivotYQ4 * var9;
        int var12 = -(-pivotXQ4) * var9 + -pivotYQ4 * var10;
        int var13 = ((this.width << 4) - pivotXQ4) * var10 + -pivotYQ4 * var9;
        int var14 = -((this.width << 4) - pivotXQ4) * var9 + -pivotYQ4 * var10;
        int var15 = -pivotXQ4 * var10 + ((this.height << 4) - pivotYQ4) * var9;
        int var16 = -(-pivotXQ4) * var9 + ((this.height << 4) - pivotYQ4) * var10;
        int var17 = ((this.width << 4) - pivotXQ4) * var10 + ((this.height << 4) - pivotYQ4) * var9;
        int var18 = -((this.width << 4) - pivotXQ4) * var9 + ((this.height << 4) - pivotYQ4) * var10;
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
        var19 = var19 + destinationXQ4;
        var20 = var20 + destinationXQ4;
        var21 = var21 + destinationYQ4;
        var22 = var22 + destinationYQ4;
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
        double var24 = 16777216.0 / (double)scaleQ12;
        int var26 = (int)Math.floor(Math.sin(var7) * var24 + 0.5);
        int var27 = (int)Math.floor(Math.cos(var7) * var24 + 0.5);
        int var28 = (var19 << 4) + 8 - destinationXQ4;
        int var29 = (var21 << 4) + 8 - destinationYQ4;
        int var30 = (pivotXQ4 << 8) - (var29 * var26 >> 4);
        int var31 = (pivotYQ4 << 8) + (var29 * var27 >> 4);
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

    void drawAdditive(int x, int y, int intensity) {
        x = x + this.offsetX;
        y = y + this.offsetY;
        int var4 = x + y * SoftwareRasterizer.width;
        int var5 = 0;
        int var6 = this.height;
        int var7 = this.width;
        int var8 = SoftwareRasterizer.width - var7;
        int var9 = 0;
        if (y < SoftwareRasterizer.clipTop) {
          int var10 = SoftwareRasterizer.clipTop - y;
          var6 = var6 - var10;
          y = SoftwareRasterizer.clipTop;
          var5 = var5 + var10 * var7;
          var4 = var4 + var10 * SoftwareRasterizer.width;
        }
        if (y + var6 > SoftwareRasterizer.clipBottom) {
          var6 = var6 - (y + var6 - SoftwareRasterizer.clipBottom);
        }
        if (x < SoftwareRasterizer.clipLeft) {
          int var10Lifetime1 = SoftwareRasterizer.clipLeft - x;
          var7 = var7 - var10Lifetime1;
          x = SoftwareRasterizer.clipLeft;
          var5 = var5 + var10Lifetime1;
          var4 = var4 + var10Lifetime1;
          var9 = var9 + var10Lifetime1;
          var8 = var8 + var10Lifetime1;
        }
        if (x + var7 > SoftwareRasterizer.clipRight) {
          int var10Lifetime2 = x + var7 - SoftwareRasterizer.clipRight;
          var7 = var7 - var10Lifetime2;
          var9 = var9 + var10Lifetime2;
          var8 = var8 + var10Lifetime2;
        }
        if (var7 > 0) {
          if (var6 <= 0) {
            return;
          }
          if (intensity == 256) {
            Sprite.blitAdditive(0, 0, 0, SoftwareRasterizer.pixels, this.pixels, var5, 0, var4, 0, var7, var6, var8, var9);
          } else {
            Sprite.blitAdditiveIntensity(0, 0, 0, SoftwareRasterizer.pixels, this.pixels, var5, 0, var4, 0, var7, var6, var8, var9, intensity);
          }
          return;
        }
    }

    void drawHalfSize(int x, int y) {
        x = x + (this.offsetX >> 1);
        y = y + (this.offsetY >> 1);
        int var3 = x < SoftwareRasterizer.clipLeft ? SoftwareRasterizer.clipLeft - x << 1 : 0;
        int var4 = x + (this.width >> 1) > SoftwareRasterizer.clipRight ? SoftwareRasterizer.clipRight - x << 1 : this.width;
        int var5 = y < SoftwareRasterizer.clipTop ? SoftwareRasterizer.clipTop - y << 1 : 0;
        int var6 = y + (this.height >> 1) > SoftwareRasterizer.clipBottom ? SoftwareRasterizer.clipBottom - y << 1 : this.height;
        Sprite.blitHalfSize(this.pixels, var5 * this.width + var3, (y + (var5 >> 1)) * SoftwareRasterizer.width + (x + (var3 >> 1)), (this.width << 1) - (var4 - var3) + (this.width & 1), SoftwareRasterizer.width - (var4 - var3 >> 1), this.width, var4 - var3 >> 1, var6 - var5 >> 1);
    }

    private final static void blitSilhouette(int[] destination, int[] source, int color, int sourceIndex, int destinationIndex, int rowWidth, int rowCount, int destinationRowSkip, int sourceRowSkip) {
        int var9 = -(rowWidth >> 2);
        rowWidth = -(rowWidth & 3);
        for (int var10 = -rowCount; var10 < 0; var10++) {
          for (int var11 = var9; var11 < 0; var11++) {
            if (source[sourceIndex++] == 0) {
              destinationIndex++;
            } else {
              destination[destinationIndex++] = color;
            }
            if (source[sourceIndex++] == 0) {
              destinationIndex++;
            } else {
              destination[destinationIndex++] = color;
            }
            if (source[sourceIndex++] == 0) {
              destinationIndex++;
            } else {
              destination[destinationIndex++] = color;
            }
            if (source[sourceIndex++] == 0) {
              destinationIndex++;
            } else {
              destination[destinationIndex++] = color;
            }
          }
          for (int var11Lifetime1 = rowWidth; var11Lifetime1 < 0; var11Lifetime1++) {
            if (source[sourceIndex++] == 0) {
              destinationIndex++;
            } else {
              destination[destinationIndex++] = color;
            }
          }
          destinationIndex = destinationIndex + destinationRowSkip;
          sourceIndex = sourceIndex + sourceRowSkip;
        }
    }

    final void expandToFullSize() {
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

    private final static void blitTransparent(int[] destination, int[] source, int sourceColor, int sourceIndex, int destinationIndex, int rowWidth, int rowCount, int destinationRowSkip, int sourceRowSkip) {
        int var9 = -(rowWidth >> 2);
        rowWidth = -(rowWidth & 3);
        for (int var10 = -rowCount; var10 < 0; var10++) {
          for (int var11 = var9; var11 < 0; var11++) {
            sourceColor = source[sourceIndex++];
            if (sourceColor == 0) {
              destinationIndex++;
            } else {
              destination[destinationIndex++] = sourceColor;
            }
            sourceColor = source[sourceIndex++];
            if (sourceColor == 0) {
              destinationIndex++;
            } else {
              destination[destinationIndex++] = sourceColor;
            }
            sourceColor = source[sourceIndex++];
            if (sourceColor == 0) {
              destinationIndex++;
            } else {
              destination[destinationIndex++] = sourceColor;
            }
            sourceColor = source[sourceIndex++];
            if (sourceColor == 0) {
              destinationIndex++;
            } else {
              destination[destinationIndex++] = sourceColor;
            }
          }
          for (int var11Lifetime1 = rowWidth; var11Lifetime1 < 0; var11Lifetime1++) {
            sourceColor = source[sourceIndex++];
            if (sourceColor == 0) {
              destinationIndex++;
            } else {
              destination[destinationIndex++] = sourceColor;
            }
          }
          destinationIndex = destinationIndex + destinationRowSkip;
          sourceIndex = sourceIndex + sourceRowSkip;
        }
    }

    private final static void blitShadedTint(int[] destination, int[] source, int sourceColor, int sourceIndex, int destinationIndex, int rowWidth, int rowCount, int destinationRowSkip, int sourceRowSkip, int tint) {
        int var10 = tint >> 16 & 255;
        int var11 = tint >> 8 & 255;
        int var12 = tint & 255;
        int var13 = -(rowWidth >> 2);
        rowWidth = -(rowWidth & 3);
        int var14 = var13 + var13 + var13 + var13 + rowWidth;
        for (int var15 = -rowCount; var15 < 0; var15++) {
          for (int var16 = var14; var16 < 0; var16++) {
            sourceColor = source[sourceIndex++];
            if (sourceColor == 0) {
              destinationIndex++;
            } else {
              int var17 = sourceColor >> 16 & 255;
              int var18 = sourceColor >> 8 & 255;
              int var19 = sourceColor & 255;
              if (var17 == var18 &&
                var18 == var19) {
                if (var17 > 128) {
                  int incrementValue$1 = destinationIndex;
                  destinationIndex++;
                  destination[incrementValue$1] = (var10 * (256 - var17) + 255 * (var17 - 128) >> 7 << 16) + (var11 * (256 - var18) + 255 * (var18 - 128) >> 7 << 8) + (var12 * (256 - var19) + 255 * (var19 - 128) >> 7);
                } else {
                  int incrementValue$2 = destinationIndex;
                  destinationIndex++;
                  destination[incrementValue$2] = (var17 * var10 >> 7 << 16) + (var18 * var11 >> 7 << 8) + (var19 * var12 >> 7);
                }
                boolean decompiledFrameRemainder0 = false;
              }
              else {
                destination[destinationIndex++] = sourceColor;
              }
            }
          }
          destinationIndex = destinationIndex + destinationRowSkip;
          sourceIndex = sourceIndex + sourceRowSkip;
        }
    }

    private final static void blitScaled(int[] destination, int[] source, int sourceColor, int sourceXQ16, int sourceYQ16, int destinationIndex, int destinationRowSkip, int rowWidth, int rowCount, int stepXQ16, int stepYQ16, int sourceWidth) {
        int var12 = sourceXQ16;
        for (int var13 = -rowCount; var13 < 0; var13++) {
          int var14 = (sourceYQ16 >> 16) * sourceWidth;
          for (int var15 = -rowWidth; var15 < 0; var15++) {
            sourceColor = source[(sourceXQ16 >> 16) + var14];
            if (sourceColor != 0) {
              destination[destinationIndex++] = sourceColor;
            } else {
              destinationIndex++;
            }
            sourceXQ16 = sourceXQ16 + stepXQ16;
          }
          sourceYQ16 = sourceYQ16 + stepYQ16;
          sourceXQ16 = var12;
          destinationIndex = destinationIndex + destinationRowSkip;
        }
    }

    final void flipHorizontally() {
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

    private final static void blitBrightness(int[] destination, int[] source, int sourceColor, int sourceIndex, int destinationIndex, int rowWidth, int rowCount, int destinationRowSkip, int sourceRowSkip, int brightness) {
        for (int var10 = -rowCount; var10 < 0; var10++) {
          for (int var11 = -rowWidth; var11 < 0; var11++) {
            sourceColor = source[sourceIndex++];
            if (sourceColor == 0) {
              destinationIndex++;
            } else {
              int var12 = (sourceColor & 16711935) * brightness & -16711936;
              int var13 = (sourceColor & 65280) * brightness & 16711680;
              int incrementValue$12 = destinationIndex;
              destinationIndex++;
              destination[incrementValue$12] = (var12 | var13) >>> 8;
            }
          }
          destinationIndex = destinationIndex + destinationRowSkip;
          sourceIndex = sourceIndex + sourceRowSkip;
        }
    }

    final Sprite copyMirroredHorizontally() {
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

    private final static void blitScaledAlpha(int[] destination, int[] source, int sourceColor, int sourceXQ16, int sourceYQ16, int destinationIndex, int destinationRowSkip, int rowWidth, int rowCount, int stepXQ16, int stepYQ16, int sourceWidth, int alpha) {
        int var13 = 256 - alpha;
        int var14 = sourceXQ16;
        for (int var15 = -rowCount; var15 < 0; var15++) {
          int var16 = (sourceYQ16 >> 16) * sourceWidth;
          for (int var17 = -rowWidth; var17 < 0; var17++) {
            sourceColor = source[(sourceXQ16 >> 16) + var16];
            if (sourceColor != 0) {
              int var18 = destination[destinationIndex];
              int incrementValue$0 = destinationIndex;
              destinationIndex++;
              destination[incrementValue$0] = ((sourceColor & 16711935) * alpha + (var18 & 16711935) * var13 & -16711936) + ((sourceColor & 65280) * alpha + (var18 & 65280) * var13 & 16711680) >> 8;
            } else {
              destinationIndex++;
            }
            sourceXQ16 = sourceXQ16 + stepXQ16;
          }
          sourceYQ16 = sourceYQ16 + stepYQ16;
          sourceXQ16 = var14;
          destinationIndex = destinationIndex + destinationRowSkip;
        }
    }

    final void addOutline(int color) {
        int[] var2 = new int[this.width * this.height];
        int var3 = 0;
        for (int var4 = 0; var4 < this.height; var4++) {
          for (int var5 = 0; var5 < this.width; var5++) {
            int var6 = this.pixels[var3];
            if (var6 == 0) {
              if (var5 > 0 &&
                this.pixels[var3 - 1] != 0) {
                var6 = color;
              } else if (var4 > 0 &&
                this.pixels[var3 - this.width] != 0) {
                var6 = color;
              } else if (var5 < this.width - 1 &&
                this.pixels[var3 + 1] != 0) {
                var6 = color;
              } else if (var4 < this.height - 1 &&
                this.pixels[var3 + this.width] != 0) {
                var6 = color;
              }
            }
            var2[var3++] = var6;
          }
        }
        this.pixels = var2;
    }

    void drawMirrored(int x, int y) {
        x = x + (this.fullWidth - this.width - this.offsetX);
        y = y + this.offsetY;
        int var3 = x + y * SoftwareRasterizer.width;
        int var4 = this.width - 1;
        int var5 = this.height;
        int var6 = this.width;
        int var7 = SoftwareRasterizer.width - var6;
        int var8 = var6 + var6;
        if (y < SoftwareRasterizer.clipTop) {
          int var9 = SoftwareRasterizer.clipTop - y;
          var5 = var5 - var9;
          y = SoftwareRasterizer.clipTop;
          var4 = var4 + var9 * var6;
          var3 = var3 + var9 * SoftwareRasterizer.width;
        }
        if (y + var5 > SoftwareRasterizer.clipBottom) {
          var5 = var5 - (y + var5 - SoftwareRasterizer.clipBottom);
        }
        if (x < SoftwareRasterizer.clipLeft) {
          int var9Lifetime1 = SoftwareRasterizer.clipLeft - x;
          var6 = var6 - var9Lifetime1;
          x = SoftwareRasterizer.clipLeft;
          var4 = var4 - var9Lifetime1;
          var3 = var3 + var9Lifetime1;
          var8 = var8 - var9Lifetime1;
          var7 = var7 + var9Lifetime1;
        }
        if (x + var6 > SoftwareRasterizer.clipRight) {
          int var9Lifetime2 = x + var6 - SoftwareRasterizer.clipRight;
          var6 = var6 - var9Lifetime2;
          var8 = var8 - var9Lifetime2;
          var7 = var7 + var9Lifetime2;
        }
        if (var6 > 0) {
          if (var5 <= 0) {
            return;
          }
          Sprite.blitMirrored(SoftwareRasterizer.pixels, this.pixels, 0, var4, var3, var6, var5, var7, var8);
          return;
        }
    }

    void drawOpaque(int x, int y) {
        x = x + this.offsetX;
        y = y + this.offsetY;
        int var3 = x + y * SoftwareRasterizer.width;
        int var4 = 0;
        int var5 = this.height;
        int var6 = this.width;
        int var7 = SoftwareRasterizer.width - var6;
        int var8 = 0;
        if (y < SoftwareRasterizer.clipTop) {
          int var9 = SoftwareRasterizer.clipTop - y;
          var5 = var5 - var9;
          y = SoftwareRasterizer.clipTop;
          var4 = var4 + var9 * var6;
          var3 = var3 + var9 * SoftwareRasterizer.width;
        }
        if (y + var5 > SoftwareRasterizer.clipBottom) {
          var5 = var5 - (y + var5 - SoftwareRasterizer.clipBottom);
        }
        if (x < SoftwareRasterizer.clipLeft) {
          int var9Lifetime1 = SoftwareRasterizer.clipLeft - x;
          var6 = var6 - var9Lifetime1;
          x = SoftwareRasterizer.clipLeft;
          var4 = var4 + var9Lifetime1;
          var3 = var3 + var9Lifetime1;
          var8 = var8 + var9Lifetime1;
          var7 = var7 + var9Lifetime1;
        }
        if (x + var6 > SoftwareRasterizer.clipRight) {
          int var9Lifetime2 = x + var6 - SoftwareRasterizer.clipRight;
          var6 = var6 - var9Lifetime2;
          var8 = var8 + var9Lifetime2;
          var7 = var7 + var9Lifetime2;
        }
        if (var6 > 0) {
          if (var5 <= 0) {
            return;
          }
          Sprite.blitOpaque(SoftwareRasterizer.pixels, this.pixels, var4, var3, var6, var5, var7, var8);
          return;
        }
    }

    final void rotateClockwise() {
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

    void drawScaled(int x, int y, int targetWidth, int targetHeight) {
        if (targetWidth > 0) {
          if (targetHeight <= 0) {
            return;
          }
          int var5 = this.width;
          int var6 = this.height;
          int var7 = 0;
          int var8 = 0;
          int var9 = this.fullWidth;
          int var10 = this.fullHeight;
          int var11 = (var9 << 16) / targetWidth;
          int var12 = (var10 << 16) / targetHeight;
          if (this.offsetX > 0) {
            int var13 = ((this.offsetX << 16) + var11 - 1) / var11;
            x = x + var13;
            var7 = var7 + (var13 * var11 - (this.offsetX << 16));
          }
          if (this.offsetY > 0) {
            int var13Lifetime1 = ((this.offsetY << 16) + var12 - 1) / var12;
            y = y + var13Lifetime1;
            var8 = var8 + (var13Lifetime1 * var12 - (this.offsetY << 16));
          }
          if (var5 < var9) {
            targetWidth = ((var5 << 16) - var7 + var11 - 1) / var11;
          }
          if (var6 < var10) {
            targetHeight = ((var6 << 16) - var8 + var12 - 1) / var12;
          }
          int var13Lifetime2 = x + y * SoftwareRasterizer.width;
          int var14 = SoftwareRasterizer.width - targetWidth;
          if (y + targetHeight > SoftwareRasterizer.clipBottom) {
            targetHeight = targetHeight - (y + targetHeight - SoftwareRasterizer.clipBottom);
          }
          if (y < SoftwareRasterizer.clipTop) {
            int var15 = SoftwareRasterizer.clipTop - y;
            targetHeight = targetHeight - var15;
            var13Lifetime2 = var13Lifetime2 + var15 * SoftwareRasterizer.width;
            var8 = var8 + var12 * var15;
          }
          if (x + targetWidth > SoftwareRasterizer.clipRight) {
            int var15Lifetime1 = x + targetWidth - SoftwareRasterizer.clipRight;
            targetWidth = targetWidth - var15Lifetime1;
            var14 = var14 + var15Lifetime1;
          }
          if (x < SoftwareRasterizer.clipLeft) {
            int var15Lifetime2 = SoftwareRasterizer.clipLeft - x;
            targetWidth = targetWidth - var15Lifetime2;
            var13Lifetime2 = var13Lifetime2 + var15Lifetime2;
            var7 = var7 + var11 * var15Lifetime2;
            var14 = var14 + var15Lifetime2;
          }
          Sprite.blitScaled(SoftwareRasterizer.pixels, this.pixels, 0, var7, var8, var13Lifetime2, var14, targetWidth, targetHeight, var11, var12, var5);
          return;
        }
    }

    final void drawSilhouette(int x, int y, int color) {
        x = x + this.offsetX;
        y = y + this.offsetY;
        int var4 = x + y * SoftwareRasterizer.width;
        int var5 = 0;
        int var6 = this.height;
        int var7 = this.width;
        int var8 = SoftwareRasterizer.width - var7;
        int var9 = 0;
        if (y < SoftwareRasterizer.clipTop) {
          int var10 = SoftwareRasterizer.clipTop - y;
          var6 = var6 - var10;
          y = SoftwareRasterizer.clipTop;
          var5 = var5 + var10 * var7;
          var4 = var4 + var10 * SoftwareRasterizer.width;
        }
        if (y + var6 > SoftwareRasterizer.clipBottom) {
          var6 = var6 - (y + var6 - SoftwareRasterizer.clipBottom);
        }
        if (x < SoftwareRasterizer.clipLeft) {
          int var10Lifetime1 = SoftwareRasterizer.clipLeft - x;
          var7 = var7 - var10Lifetime1;
          x = SoftwareRasterizer.clipLeft;
          var5 = var5 + var10Lifetime1;
          var4 = var4 + var10Lifetime1;
          var9 = var9 + var10Lifetime1;
          var8 = var8 + var10Lifetime1;
        }
        if (x + var7 > SoftwareRasterizer.clipRight) {
          int var10Lifetime2 = x + var7 - SoftwareRasterizer.clipRight;
          var7 = var7 - var10Lifetime2;
          var9 = var9 + var10Lifetime2;
          var8 = var8 + var10Lifetime2;
        }
        if (var7 > 0) {
          if (var6 <= 0) {
            return;
          }
          Sprite.blitSilhouette(SoftwareRasterizer.pixels, this.pixels, color, var5, var4, var7, var6, var8, var9);
          return;
        }
    }

    final void drawDownscaled(int x, int y, int targetWidth, int targetHeight) {
        if (targetWidth <= this.fullWidth &&
          targetHeight <= this.fullHeight) {
          int var5 = x + this.offsetX * targetWidth / this.fullWidth;
          int var6 = x + ((this.offsetX + this.width) * targetWidth + this.fullWidth - 1) / this.fullWidth;
          int var7 = y + this.offsetY * targetHeight / this.fullHeight;
          int var8 = y + ((this.offsetY + this.height) * targetHeight + this.fullHeight - 1) / this.fullHeight;
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
              int var13 = var12 - x << 4;
              int var14 = var11 - y << 4;
              int var15 = var13 * this.fullWidth / targetWidth - (this.offsetX << 4);
              int var16 = (var13 + 16) * this.fullWidth / targetWidth - (this.offsetX << 4);
              int var17 = var14 * this.fullHeight / targetHeight - (this.offsetY << 4);
              int var18 = (var14 + 16) * this.fullHeight / targetHeight - (this.offsetY << 4);
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

    private final void drawBilinearPixel(int destinationIndex, int sourceX, int sourceY, int sourceXQ12, int sourceYQ12) {
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
        int var6 = sourceY * this.width + sourceX;
        sourceXQ12 = sourceXQ12 & 4095;
        sourceYQ12 = sourceYQ12 & 4095;
        if (sourceY < 0) {
          var12 = 0;
          var11 = 0;
          var8 = 0;
          var7 = 0;
        } else {
          if (sourceX < 0) {
            var11 = 0;
            var7 = 0;
          } else {
            var7 = this.pixels[var6];
            if (var7 == 0) {
              stackIn_5_0 = 0;
            } else {
              stackIn_5_0 = (4096 - sourceXQ12) * (4096 - sourceYQ12);
            }
            var11 = stackIn_5_0;
          }
          if (sourceX >= this.width - 1) {
            var12 = 0;
            var8 = 0;
          } else {
            var8 = this.pixels[var6 + 1];
            if (var8 == 0) {
              stackIn_11_0 = 0;
            } else {
              stackIn_11_0 = sourceXQ12 * (4096 - sourceYQ12);
            }
            var12 = stackIn_11_0;
          }
        }
        if (sourceY >= this.height - 1) {
          var14 = 0;
          var13 = 0;
          var10 = 0;
          var9 = 0;
        } else {
          if (sourceX < 0) {
            var13 = 0;
            var9 = 0;
          } else {
            var9 = this.pixels[var6 + this.width];
            if (var9 == 0) {
              stackIn_19_0 = 0;
            } else {
              stackIn_19_0 = (4096 - sourceXQ12) * sourceYQ12;
            }
            var13 = stackIn_19_0;
          }
          if (sourceX >= this.width - 1) {
            var14 = 0;
            var10 = 0;
          } else {
            var10 = this.pixels[var6 + this.width + 1];
            if (var10 == 0) {
              stackIn_25_0 = 0;
            } else {
              stackIn_25_0 = sourceXQ12 * sourceYQ12;
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
          SoftwareRasterizer.pixels[destinationIndex] = var18;
        } else {
          var16 = (var7 & 16711935) * var11 + (var8 & 16711935) * var12;
          var16 = var16 + ((var9 & 16711935) * var13 + (var10 & 16711935) * var14);
          var17 = (var7 & 65280) * var11 + (var8 & 65280) * var12;
          var17 = var17 + ((var9 & 65280) * var13 + (var10 & 65280) * var14);
          var18 = (var16 >>> 8 & 16711935) + (var17 >>> 8 & 65280);
          if (var18 == 0) {
            var18 = 1;
          }
          SoftwareRasterizer.pixels[destinationIndex] = var18;
        }
    }

    void drawTransparent(int x, int y) {
        x = x + this.offsetX;
        y = y + this.offsetY;
        int var3 = x + y * SoftwareRasterizer.width;
        int var4 = 0;
        int var5 = this.height;
        int var6 = this.width;
        int var7 = SoftwareRasterizer.width - var6;
        int var8 = 0;
        if (y < SoftwareRasterizer.clipTop) {
          int var9 = SoftwareRasterizer.clipTop - y;
          var5 = var5 - var9;
          y = SoftwareRasterizer.clipTop;
          var4 = var4 + var9 * var6;
          var3 = var3 + var9 * SoftwareRasterizer.width;
        }
        if (y + var5 > SoftwareRasterizer.clipBottom) {
          var5 = var5 - (y + var5 - SoftwareRasterizer.clipBottom);
        }
        if (x < SoftwareRasterizer.clipLeft) {
          int var9Lifetime1 = SoftwareRasterizer.clipLeft - x;
          var6 = var6 - var9Lifetime1;
          x = SoftwareRasterizer.clipLeft;
          var4 = var4 + var9Lifetime1;
          var3 = var3 + var9Lifetime1;
          var8 = var8 + var9Lifetime1;
          var7 = var7 + var9Lifetime1;
        }
        if (x + var6 > SoftwareRasterizer.clipRight) {
          int var9Lifetime2 = x + var6 - SoftwareRasterizer.clipRight;
          var6 = var6 - var9Lifetime2;
          var8 = var8 + var9Lifetime2;
          var7 = var7 + var9Lifetime2;
        }
        if (var6 > 0) {
          if (var5 <= 0) {
            return;
          }
          Sprite.blitTransparent(SoftwareRasterizer.pixels, this.pixels, 0, var4, var3, var6, var5, var7, var8);
          return;
        }
    }

    private final static void blitAdditiveIntensity(int sourceColor, int destinationColor, int sum, int[] destination, int[] source, int sourceIndex, int column, int destinationIndex, int row, int rowWidth, int rowCount, int destinationRowSkip, int sourceRowSkip, int intensity) {
        for (row = -rowCount; row < 0; row++) {
          for (column = -rowWidth; column < 0; column++) {
            sourceColor = source[sourceIndex++];
            if (sourceColor == 0) {
              destinationIndex++;
            } else {
              destinationColor = (sourceColor & 16711935) * intensity;
              sourceColor = (destinationColor & -16711936) + (sourceColor * intensity - destinationColor & 16711680) >>> 8;
              destinationColor = destination[destinationIndex];
              sum = sourceColor + destinationColor;
              sourceColor = (sourceColor & 16711935) + (destinationColor & 16711935);
              destinationColor = (sourceColor & 16777472) + (sum - sourceColor & 65536);
              int incrementValue$12 = destinationIndex;
              destinationIndex++;
              destination[incrementValue$12] = sum - destinationColor | destinationColor - (destinationColor >>> 8);
            }
          }
          destinationIndex = destinationIndex + destinationRowSkip;
          sourceIndex = sourceIndex + sourceRowSkip;
        }
    }

    private final static void blitMirrored(int[] destination, int[] source, int sourceColor, int sourceIndex, int destinationIndex, int rowWidth, int rowCount, int destinationRowSkip, int sourceRowSkip) {
        int var9 = -(rowWidth >> 2);
        rowWidth = -(rowWidth & 3);
        for (int var10 = -rowCount; var10 < 0; var10++) {
          for (int var11 = var9; var11 < 0; var11++) {
            sourceColor = source[sourceIndex--];
            if (sourceColor == 0) {
              destinationIndex++;
            } else {
              destination[destinationIndex++] = sourceColor;
            }
            sourceColor = source[sourceIndex--];
            if (sourceColor == 0) {
              destinationIndex++;
            } else {
              destination[destinationIndex++] = sourceColor;
            }
            sourceColor = source[sourceIndex--];
            if (sourceColor == 0) {
              destinationIndex++;
            } else {
              destination[destinationIndex++] = sourceColor;
            }
            sourceColor = source[sourceIndex--];
            if (sourceColor == 0) {
              destinationIndex++;
            } else {
              destination[destinationIndex++] = sourceColor;
            }
          }
          for (int var11Lifetime1 = rowWidth; var11Lifetime1 < 0; var11Lifetime1++) {
            sourceColor = source[sourceIndex--];
            if (sourceColor == 0) {
              destinationIndex++;
            } else {
              destination[destinationIndex++] = sourceColor;
            }
          }
          destinationIndex = destinationIndex + destinationRowSkip;
          sourceIndex = sourceIndex + sourceRowSkip;
        }
    }

    private final static void blitAlpha(int[] destination, int[] source, int sourceColor, int sourceIndex, int destinationIndex, int rowWidth, int rowCount, int destinationRowSkip, int sourceRowSkip, int alpha) {
        int var10 = 256 - alpha;
        for (int var11 = -rowCount; var11 < 0; var11++) {
          for (int var12 = -rowWidth; var12 < 0; var12++) {
            sourceColor = source[sourceIndex++];
            if (sourceColor == 0) {
              destinationIndex++;
            } else {
              int var13 = destination[destinationIndex];
              int incrementValue$12 = destinationIndex;
              destinationIndex++;
              destination[incrementValue$12] = ((sourceColor & 16711935) * alpha + (var13 & 16711935) * var10 & -16711936) + ((sourceColor & 65280) * alpha + (var13 & 65280) * var10 & 16711680) >> 8;
            }
          }
          destinationIndex = destinationIndex + destinationRowSkip;
          sourceIndex = sourceIndex + sourceRowSkip;
        }
    }

    final void drawMultiply(int x, int y) {
        x = x + this.offsetX;
        y = y + this.offsetY;
        int var3 = x + y * SoftwareRasterizer.width;
        int var4 = 0;
        int var5 = this.height;
        int var6 = this.width;
        int var7 = SoftwareRasterizer.width - var6;
        int var8 = 0;
        if (y < SoftwareRasterizer.clipTop) {
          int var9 = SoftwareRasterizer.clipTop - y;
          var5 = var5 - var9;
          y = SoftwareRasterizer.clipTop;
          var4 = var4 + var9 * var6;
          var3 = var3 + var9 * SoftwareRasterizer.width;
        }
        if (y + var5 > SoftwareRasterizer.clipBottom) {
          var5 = var5 - (y + var5 - SoftwareRasterizer.clipBottom);
        }
        if (x < SoftwareRasterizer.clipLeft) {
          int var9Lifetime1 = SoftwareRasterizer.clipLeft - x;
          var6 = var6 - var9Lifetime1;
          x = SoftwareRasterizer.clipLeft;
          var4 = var4 + var9Lifetime1;
          var3 = var3 + var9Lifetime1;
          var8 = var8 + var9Lifetime1;
          var7 = var7 + var9Lifetime1;
        }
        if (x + var6 > SoftwareRasterizer.clipRight) {
          int var9Lifetime2 = x + var6 - SoftwareRasterizer.clipRight;
          var6 = var6 - var9Lifetime2;
          var8 = var8 + var9Lifetime2;
          var7 = var7 + var9Lifetime2;
        }
        if (var6 > 0) {
          if (var5 <= 0) {
            return;
          }
          Sprite.blitMultiply(0, SoftwareRasterizer.pixels, this.pixels, 0, var4, var3, var6, var5, var7, var8);
          return;
        }
    }

    void drawAlpha(int x, int y, int alpha) {
        x = x + this.offsetX;
        y = y + this.offsetY;
        int var4 = x + y * SoftwareRasterizer.width;
        int var5 = 0;
        int var6 = this.height;
        int var7 = this.width;
        int var8 = SoftwareRasterizer.width - var7;
        int var9 = 0;
        if (y < SoftwareRasterizer.clipTop) {
          int var10 = SoftwareRasterizer.clipTop - y;
          var6 = var6 - var10;
          y = SoftwareRasterizer.clipTop;
          var5 = var5 + var10 * var7;
          var4 = var4 + var10 * SoftwareRasterizer.width;
        }
        if (y + var6 > SoftwareRasterizer.clipBottom) {
          var6 = var6 - (y + var6 - SoftwareRasterizer.clipBottom);
        }
        if (x < SoftwareRasterizer.clipLeft) {
          int var10Lifetime1 = SoftwareRasterizer.clipLeft - x;
          var7 = var7 - var10Lifetime1;
          x = SoftwareRasterizer.clipLeft;
          var5 = var5 + var10Lifetime1;
          var4 = var4 + var10Lifetime1;
          var9 = var9 + var10Lifetime1;
          var8 = var8 + var10Lifetime1;
        }
        if (x + var7 > SoftwareRasterizer.clipRight) {
          int var10Lifetime2 = x + var7 - SoftwareRasterizer.clipRight;
          var7 = var7 - var10Lifetime2;
          var9 = var9 + var10Lifetime2;
          var8 = var8 + var10Lifetime2;
        }
        if (var7 > 0) {
          if (var6 <= 0) {
            return;
          }
          Sprite.blitAlpha(SoftwareRasterizer.pixels, this.pixels, 0, var5, var4, var7, var6, var8, var9, alpha);
          return;
        }
    }

    final void drawCenteredRotatedScaledBilinear(int centerX, int centerY, int angle65536, int scaleQ12) {
        int var5 = this.fullWidth << 3;
        int var6 = this.fullHeight << 3;
        centerX = (centerX << 4) + (var5 & 15);
        centerY = (centerY << 4) + (var6 & 15);
        this.drawRotatedScaledBilinear(var5, var6, centerX, centerY, angle65536, scaleQ12);
    }

    void drawScaledAlpha(int x, int y, int targetWidth, int targetHeight, int alpha) {
        if (targetWidth > 0) {
          if (targetHeight <= 0) {
            return;
          }
          int var6 = this.width;
          int var7 = this.height;
          int var8 = 0;
          int var9 = 0;
          int var10 = this.fullWidth;
          int var11 = this.fullHeight;
          int var12 = (var10 << 16) / targetWidth;
          int var13 = (var11 << 16) / targetHeight;
          if (this.offsetX > 0) {
            int var14 = ((this.offsetX << 16) + var12 - 1) / var12;
            x = x + var14;
            var8 = var8 + (var14 * var12 - (this.offsetX << 16));
          }
          if (this.offsetY > 0) {
            int var14Lifetime1 = ((this.offsetY << 16) + var13 - 1) / var13;
            y = y + var14Lifetime1;
            var9 = var9 + (var14Lifetime1 * var13 - (this.offsetY << 16));
          }
          if (var6 < var10) {
            targetWidth = ((var6 << 16) - var8 + var12 - 1) / var12;
          }
          if (var7 < var11) {
            targetHeight = ((var7 << 16) - var9 + var13 - 1) / var13;
          }
          int var14Lifetime2 = x + y * SoftwareRasterizer.width;
          int var15 = SoftwareRasterizer.width - targetWidth;
          if (y + targetHeight > SoftwareRasterizer.clipBottom) {
            targetHeight = targetHeight - (y + targetHeight - SoftwareRasterizer.clipBottom);
          }
          if (y < SoftwareRasterizer.clipTop) {
            int var16 = SoftwareRasterizer.clipTop - y;
            targetHeight = targetHeight - var16;
            var14Lifetime2 = var14Lifetime2 + var16 * SoftwareRasterizer.width;
            var9 = var9 + var13 * var16;
          }
          if (x + targetWidth > SoftwareRasterizer.clipRight) {
            int var16Lifetime1 = x + targetWidth - SoftwareRasterizer.clipRight;
            targetWidth = targetWidth - var16Lifetime1;
            var15 = var15 + var16Lifetime1;
          }
          if (x < SoftwareRasterizer.clipLeft) {
            int var16Lifetime2 = SoftwareRasterizer.clipLeft - x;
            targetWidth = targetWidth - var16Lifetime2;
            var14Lifetime2 = var14Lifetime2 + var16Lifetime2;
            var8 = var8 + var12 * var16Lifetime2;
            var15 = var15 + var16Lifetime2;
          }
          Sprite.blitScaledAlpha(SoftwareRasterizer.pixels, this.pixels, 0, var8, var9, var14Lifetime2, var15, targetWidth, targetHeight, var12, var13, var6, alpha);
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
