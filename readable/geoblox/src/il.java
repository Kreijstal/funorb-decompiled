/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class il extends Sprite {
    final void e(int param0, int param1, int param2) {
        int var10 = 0;
        param0 = param0 + this.trimX;
        param1 = param1 + this.trimY;
        int var4 = param0 + param1 * SoftwareRasterizer.stride;
        int var5 = 0;
        int var6 = this.height;
        int var7 = this.width;
        int var8 = SoftwareRasterizer.stride - var7;
        int var9 = 0;
        if (param1 < SoftwareRasterizer.clipTop) {
            var10 = SoftwareRasterizer.clipTop - param1;
            var6 = var6 - var10;
            param1 = SoftwareRasterizer.clipTop;
            var5 = var5 + var10 * var7;
            var4 = var4 + var10 * SoftwareRasterizer.stride;
        }
        if (param1 + var6 > SoftwareRasterizer.clipBottom) {
            var6 = var6 - (param1 + var6 - SoftwareRasterizer.clipBottom);
        }
        if (param0 < SoftwareRasterizer.clipLeft) {
            var10 = SoftwareRasterizer.clipLeft - param0;
            var7 = var7 - var10;
            param0 = SoftwareRasterizer.clipLeft;
            var5 = var5 + var10;
            var4 = var4 + var10;
            var9 = var9 + var10;
            var8 = var8 + var10;
        }
        if (param0 + var7 > SoftwareRasterizer.clipRight) {
            var10 = param0 + var7 - SoftwareRasterizer.clipRight;
            var7 = var7 - var10;
            var9 = var9 + var10;
            var8 = var8 + var10;
        }
        if (var7 > 0) {
            if (var6 <= 0) {
                return;
            }
            il.c(SoftwareRasterizer.framebuffer, this.pixels, 0, var5, var4, var7, var6, var8, var9, param2);
            return;
        }
    }

    private final static void c(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11) {
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var18 = 0;
        int incrementValue$0 = 0;
        int var17 = 0;
        int var12 = param3;
        for (var13 = -param8; var13 < 0; var13++) {
            var14 = (param4 >> 16) * param11;
            for (var15 = -param7; var15 < 0; var15++) {
                param2 = param1[(param3 >> 16) + var14];
                var16 = param2 >>> 24;
                if (var16 != 0) {
                    var17 = 256 - var16;
                    var18 = param0[param5];
                    incrementValue$0 = param5;
                    param5++;
                    param0[incrementValue$0] = ((param2 & 16711935) * var16 + (var18 & 16711935) * var17 & -16711936) + ((param2 & 65280) * var16 + (var18 & 65280) * var17 & 16711680) >>> 8;
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

    final void b(int param0, int param1, int param2) {
        int var10 = 0;
        param0 = param0 + this.trimX;
        param1 = param1 + this.trimY;
        int var4 = param0 + param1 * SoftwareRasterizer.stride;
        int var5 = 0;
        int var6 = this.height;
        int var7 = this.width;
        int var8 = SoftwareRasterizer.stride - var7;
        int var9 = 0;
        if (param1 < SoftwareRasterizer.clipTop) {
            var10 = SoftwareRasterizer.clipTop - param1;
            var6 = var6 - var10;
            param1 = SoftwareRasterizer.clipTop;
            var5 = var5 + var10 * var7;
            var4 = var4 + var10 * SoftwareRasterizer.stride;
        }
        if (param1 + var6 > SoftwareRasterizer.clipBottom) {
            var6 = var6 - (param1 + var6 - SoftwareRasterizer.clipBottom);
        }
        if (param0 < SoftwareRasterizer.clipLeft) {
            var10 = SoftwareRasterizer.clipLeft - param0;
            var7 = var7 - var10;
            param0 = SoftwareRasterizer.clipLeft;
            var5 = var5 + var10;
            var4 = var4 + var10;
            var9 = var9 + var10;
            var8 = var8 + var10;
        }
        if (param0 + var7 > SoftwareRasterizer.clipRight) {
            var10 = param0 + var7 - SoftwareRasterizer.clipRight;
            var7 = var7 - var10;
            var9 = var9 + var10;
            var8 = var8 + var10;
        }
        if (var7 > 0) {
            if (var6 <= 0) {
                return;
            }
            il.d(SoftwareRasterizer.framebuffer, this.pixels, 0, var5, var4, 0, 0, var7, var6, var8, var9, param2);
            return;
        }
    }

    final void d(int param0, int param1, int param2) {
        int var10 = 0;
        param0 = param0 + this.trimX;
        param1 = param1 + this.trimY;
        int var4 = param0 + param1 * SoftwareRasterizer.stride;
        int var5 = 0;
        int var6 = this.height;
        int var7 = this.width;
        int var8 = SoftwareRasterizer.stride - var7;
        int var9 = 0;
        if (param1 < SoftwareRasterizer.clipTop) {
            var10 = SoftwareRasterizer.clipTop - param1;
            var6 = var6 - var10;
            param1 = SoftwareRasterizer.clipTop;
            var5 = var5 + var10 * var7;
            var4 = var4 + var10 * SoftwareRasterizer.stride;
        }
        if (param1 + var6 > SoftwareRasterizer.clipBottom) {
            var6 = var6 - (param1 + var6 - SoftwareRasterizer.clipBottom);
        }
        if (param0 < SoftwareRasterizer.clipLeft) {
            var10 = SoftwareRasterizer.clipLeft - param0;
            var7 = var7 - var10;
            param0 = SoftwareRasterizer.clipLeft;
            var5 = var5 + var10;
            var4 = var4 + var10;
            var9 = var9 + var10;
            var8 = var8 + var10;
        }
        if (param0 + var7 > SoftwareRasterizer.clipRight) {
            var10 = param0 + var7 - SoftwareRasterizer.clipRight;
            var7 = var7 - var10;
            var9 = var9 + var10;
            var8 = var8 + var10;
        }
        if (var7 > 0) {
            if (var6 <= 0) {
                return;
            }
            il.d(SoftwareRasterizer.framebuffer, this.pixels, 0, var5, var4, var7, var6, var8, var9, param2);
            return;
        }
    }

    private final static void c(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
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
        int var21;
        int var22;
        int var23;
        var10 = param9 >> 16 & 255;
        var11 = param9 >> 8 & 255;
        var12 = param9 & 255;
        var13 = -(param5 >> 2);
        param5 = -(param5 & 3);
        var14 = var13 + var13 + var13 + var13 + param5;
        var15 = -param6;
        L0: while (true) {
          if (var15 >= 0) {
            return;
          }
          var16 = var14;
          L1: while (true) {
            if (var16 >= 0) {
              param4 = param4 + param7;
              param3 = param3 + param8;
              var15++;
              continue L0;
            }
            {
              incrementValue$5 = param3;
              param3++;
              param2 = param1[incrementValue$5];
              var17 = param2 >>> 24;
              if (var17 == 0) {
                param4++;
                var16++;
                continue L1;
              }
              {
                L2: {
                  var19 = param2 >> 16 & 255;
                  var20 = param2 >> 8 & 255;
                  var21 = param2 & 255;
                  if (var19 == var20) {
                    if (var20 == var21) {
                      if (var19 > 128) {
                        var18 = (var10 * (256 - var19) + 255 * (var19 - 128) >> 7 << 16) + (var11 * (256 - var20) + 255 * (var20 - 128) >> 7 << 8) + (var12 * (256 - var21) + 255 * (var21 - 128) >> 7);
                        break L2;
                      }
                      var18 = (var19 * var10 >> 7 << 16) + (var20 * var11 >> 7 << 8) + (var21 * var12 >> 7);
                      break L2;
                    }
                  }
                  var18 = param2;
                }
                var22 = 256 - var17;
                var23 = param0[param4];
                incrementValue$6 = param4;
                param4++;
                param0[incrementValue$6] = ((var18 & 16711935) * var17 + (var23 & 16711935) * var22 & -16711936) + ((var18 & 65280) * var17 + (var23 & 65280) * var22 & 16711680) >>> 8;
                var16++;
                continue L1;
              }
            }
          }
        }
    }

    private final static void c(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int incrementValue$11 = 0;
        int incrementValue$12 = 0;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        var9 = -param5;
        var10 = -param6;
        L0: while (true) {
          if (var10 >= 0) {
            return;
          }
          var11 = var9;
          L1: while (true) {
            if (var11 >= 0) {
              param4 = param4 + param7;
              param3 = param3 + param8;
              var10++;
              continue L0;
            }
            {
              incrementValue$11 = param3;
              param3++;
              param2 = param1[incrementValue$11];
              var12 = param2 >>> 24;
              if (var12 == 0) {
                param4++;
                var11++;
                continue L1;
              }
              {
                var13 = 256 - var12;
                var14 = param0[param4];
                incrementValue$12 = param4;
                param4++;
                param0[incrementValue$12] = ((param2 & 16711935) * var12 + (var14 & 16711935) * var13 & -16711936) + ((param2 & 65280) * var12 + (var14 & 65280) * var13 & 16711680) >>> 8;
                var11++;
                continue L1;
              }
            }
          }
        }
    }

    private final static void c(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12) {
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int incrementValue$0 = 0;
        int var13 = param3;
        for (var14 = -param8; var14 < 0; var14++) {
            var15 = (param4 >> 16) * param11;
            for (var16 = -param7; var16 < 0; var16++) {
                var17 = param1[(param3 >> 16) + var15];
                var18 = param0[param5];
                var19 = (var17 >>> 24) * param12 >> 8;
                var20 = 256 - var19;
                incrementValue$0 = param5;
                param5++;
                param0[incrementValue$0] = ((var17 & 16711935) * var19 + (var18 & 16711935) * var20 & -16711936) + ((var17 & 65280) * var19 + (var18 & 65280) * var20 & 16711680) >>> 8;
                param3 = param3 + param9;
            }
            param4 = param4 + param10;
            param3 = var13;
            param5 = param5 + param6;
        }
    }

    final void rotateNearest(int param0, int param1, int param2, int param3, int param4, int param5) {
        int incrementValue$8 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$2 = 0;
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$5 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        double var7;
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
        int var21;
        int var22;
        int var23;
        double var24;
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
        if (param5 == 0) {
          return;
        }
        {
          param0 = param0 - (this.trimX << 4);
          param1 = param1 - (this.trimY << 4);
          var7 = (double)(param4 & 65535) * 0.00009587379924285257;
          var9 = (int)Math.floor(Math.sin(var7) * (double)param5 + 0.5);
          var10 = (int)Math.floor(Math.cos(var7) * (double)param5 + 0.5);
          var11 = -param0 * var10 + -param1 * var9;
          var12 = -(-param0) * var9 + -param1 * var10;
          var13 = ((this.width << 4) - param0) * var10 + -param1 * var9;
          var14 = -((this.width << 4) - param0) * var9 + -param1 * var10;
          var15 = -param0 * var10 + ((this.height << 4) - param1) * var9;
          var16 = -(-param0) * var9 + ((this.height << 4) - param1) * var10;
          var17 = ((this.width << 4) - param0) * var10 + ((this.height << 4) - param1) * var9;
          var18 = -((this.width << 4) - param0) * var9 + ((this.height << 4) - param1) * var10;
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
          L14: {
            var23 = var21 * SoftwareRasterizer.stride + var19;
            var24 = 16777216.0 / (double)param5;
            var26 = (int)Math.floor(Math.sin(var7) * var24 + 0.5);
            var27 = (int)Math.floor(Math.cos(var7) * var24 + 0.5);
            var28 = (var19 << 4) + 8 - param2;
            var29 = (var21 << 4) + 8 - param3;
            var30 = (param0 << 8) - (var29 * var26 >> 4);
            var31 = (param1 << 8) + (var29 * var27 >> 4);
            if (var27 == 0) {
              if (var26 == 0) {
                var33 = var22;
                L59: while (var33 < 0) {
                  L60: {
                    var34 = var23;
                    var35 = var30;
                    var36 = var31;
                    var37 = var20;
                    if (var35 >= 0) {
                      if (var36 >= 0) {
                        if (var35 - (this.width << 12) < 0) {
                          if (var36 - (this.height << 12) < 0) {
                            L61: while (var37 < 0) {
                              var38 = this.pixels[(var36 >> 12) * this.width + (var35 >> 12)];
                              var39 = SoftwareRasterizer.framebuffer[var34];
                              var40 = var38 >>> 24;
                              var41 = 256 - var40;
                              incrementValue$8 = var34;
                              var34++;
                              SoftwareRasterizer.framebuffer[incrementValue$8] = ((var38 & 16711935) * var40 + (var39 & 16711935) * var41 & -16711936) + ((var38 & 65280) * var40 + (var39 & 65280) * var41 & 16711680) >>> 8;
                              var37++;
                            }
                            break L60;
                          }
                        }
                      }
                    }
                  }
                  var33++;
                  var23 = var23 + SoftwareRasterizer.stride;
                }
                return;
              }
              if (var26 >= 0) {
                var33 = var22;
                L49: while (var33 < 0) {
                  L50: {
                    var34 = var23;
                    var35 = var30;
                    var36 = var31 + (var28 * var26 >> 4);
                    var37 = var20;
                    if (var35 >= 0) {
                      if (var35 - (this.width << 12) < 0) {
                        if (var36 < 0) {
                          var32 = (var26 - 1 - var36) / var26;
                          var37 = var37 + var32;
                          var36 = var36 + var26 * var32;
                          var34 = var34 + var32;
                        }
                        var32 = (1 + var36 - (this.height << 12) - var26) / var26;
                        if ((1 + var36 - (this.height << 12) - var26) / var26 > var37) {
                          var37 = var32;
                        }
                        L53: while (var37 < 0) {
                          var38 = this.pixels[(var36 >> 12) * this.width + (var35 >> 12)];
                          var39 = SoftwareRasterizer.framebuffer[var34];
                          var40 = var38 >>> 24;
                          var41 = 256 - var40;
                          incrementValue$6 = var34;
                          var34++;
                          SoftwareRasterizer.framebuffer[incrementValue$6] = ((var38 & 16711935) * var40 + (var39 & 16711935) * var41 & -16711936) + ((var38 & 65280) * var40 + (var39 & 65280) * var41 & 16711680) >>> 8;
                          var36 = var36 + var26;
                          var37++;
                        }
                        break L50;
                      }
                    }
                  }
                  var33++;
                  var30 = var30 - var26;
                  var23 = var23 + SoftwareRasterizer.stride;
                }
                break L14;
              }
              var33 = var22;
              L54: while (var33 < 0) {
                L55: {
                  var34 = var23;
                  var35 = var30;
                  var36 = var31 + (var28 * var26 >> 4);
                  var37 = var20;
                  if (var35 >= 0) {
                    if (var35 - (this.width << 12) < 0) {
                      var32 = var36 - (this.height << 12);
                      if (var36 - (this.height << 12) >= 0) {
                        var32 = (var26 - var32) / var26;
                        var37 = var37 + var32;
                        var36 = var36 + var26 * var32;
                        var34 = var34 + var32;
                      }
                      var32 = (var36 - var26) / var26;
                      if ((var36 - var26) / var26 > var37) {
                        var37 = var32;
                      }
                      L58: while (var37 < 0) {
                        var38 = this.pixels[(var36 >> 12) * this.width + (var35 >> 12)];
                        var39 = SoftwareRasterizer.framebuffer[var34];
                        var40 = var38 >>> 24;
                        var41 = 256 - var40;
                        incrementValue$7 = var34;
                        var34++;
                        SoftwareRasterizer.framebuffer[incrementValue$7] = ((var38 & 16711935) * var40 + (var39 & 16711935) * var41 & -16711936) + ((var38 & 65280) * var40 + (var39 & 65280) * var41 & 16711680) >>> 8;
                        var36 = var36 + var26;
                        var37++;
                      }
                      break L55;
                    }
                  }
                }
                var33++;
                var30 = var30 - var26;
                var23 = var23 + SoftwareRasterizer.stride;
              }
              break L14;
            }
            if (var27 >= 0) {
              if (var26 == 0) {
                var33 = var22;
                L27: while (var33 < 0) {
                  L28: {
                    var34 = var23;
                    var35 = var30 + (var28 * var27 >> 4);
                    var36 = var31;
                    var37 = var20;
                    if (var36 >= 0) {
                      if (var36 - (this.height << 12) < 0) {
                        if (var35 < 0) {
                          var32 = (var27 - 1 - var35) / var27;
                          var37 = var37 + var32;
                          var35 = var35 + var27 * var32;
                          var34 = var34 + var32;
                        }
                        var32 = (1 + var35 - (this.width << 12) - var27) / var27;
                        if ((1 + var35 - (this.width << 12) - var27) / var27 > var37) {
                          var37 = var32;
                        }
                        L31: while (var37 < 0) {
                          var38 = this.pixels[(var36 >> 12) * this.width + (var35 >> 12)];
                          var39 = SoftwareRasterizer.framebuffer[var34];
                          var40 = var38 >>> 24;
                          var41 = 256 - var40;
                          incrementValue$2 = var34;
                          var34++;
                          SoftwareRasterizer.framebuffer[incrementValue$2] = ((var38 & 16711935) * var40 + (var39 & 16711935) * var41 & -16711936) + ((var38 & 65280) * var40 + (var39 & 65280) * var41 & 16711680) >>> 8;
                          var35 = var35 + var27;
                          var37++;
                        }
                        break L28;
                      }
                    }
                  }
                  var33++;
                  var31 = var31 + var27;
                  var23 = var23 + SoftwareRasterizer.stride;
                }
                break L14;
              }
              if (var26 >= 0) {
                var33 = var22;
                L15: while (var33 < 0) {
                  var34 = var23;
                  var35 = var30 + (var28 * var27 >> 4);
                  var36 = var31 + (var28 * var26 >> 4);
                  var37 = var20;
                  if (var35 < 0) {
                    var32 = (var27 - 1 - var35) / var27;
                    var37 = var37 + var32;
                    var35 = var35 + var27 * var32;
                    var36 = var36 + var26 * var32;
                    var34 = var34 + var32;
                  }
                  var32 = (1 + var35 - (this.width << 12) - var27) / var27;
                  if ((1 + var35 - (this.width << 12) - var27) / var27 > var37) {
                    var37 = var32;
                  }
                  if (var36 < 0) {
                    var32 = (var26 - 1 - var36) / var26;
                    var37 = var37 + var32;
                    var35 = var35 + var27 * var32;
                    var36 = var36 + var26 * var32;
                    var34 = var34 + var32;
                  }
                  var32 = (1 + var36 - (this.height << 12) - var26) / var26;
                  if ((1 + var36 - (this.height << 12) - var26) / var26 > var37) {
                    var37 = var32;
                  }
                  L20: while (var37 < 0) {
                    var38 = this.pixels[(var36 >> 12) * this.width + (var35 >> 12)];
                    var39 = SoftwareRasterizer.framebuffer[var34];
                    var40 = var38 >>> 24;
                    var41 = 256 - var40;
                    incrementValue$0 = var34;
                    var34++;
                    SoftwareRasterizer.framebuffer[incrementValue$0] = ((var38 & 16711935) * var40 + (var39 & 16711935) * var41 & -16711936) + ((var38 & 65280) * var40 + (var39 & 65280) * var41 & 16711680) >>> 8;
                    var35 = var35 + var27;
                    var36 = var36 + var26;
                    var37++;
                  }
                  var33++;
                  var30 = var30 - var26;
                  var31 = var31 + var27;
                  var23 = var23 + SoftwareRasterizer.stride;
                }
                break L14;
              }
              var33 = var22;
              L21: while (var33 < 0) {
                var34 = var23;
                var35 = var30 + (var28 * var27 >> 4);
                var36 = var31 + (var28 * var26 >> 4);
                var37 = var20;
                if (var35 < 0) {
                  var32 = (var27 - 1 - var35) / var27;
                  var37 = var37 + var32;
                  var35 = var35 + var27 * var32;
                  var36 = var36 + var26 * var32;
                  var34 = var34 + var32;
                }
                var32 = (1 + var35 - (this.width << 12) - var27) / var27;
                if ((1 + var35 - (this.width << 12) - var27) / var27 > var37) {
                  var37 = var32;
                }
                var32 = var36 - (this.height << 12);
                if (var36 - (this.height << 12) >= 0) {
                  var32 = (var26 - var32) / var26;
                  var37 = var37 + var32;
                  var35 = var35 + var27 * var32;
                  var36 = var36 + var26 * var32;
                  var34 = var34 + var32;
                }
                var32 = (var36 - var26) / var26;
                if ((var36 - var26) / var26 > var37) {
                  var37 = var32;
                }
                L26: while (var37 < 0) {
                  var38 = this.pixels[(var36 >> 12) * this.width + (var35 >> 12)];
                  var39 = SoftwareRasterizer.framebuffer[var34];
                  var40 = var38 >>> 24;
                  var41 = 256 - var40;
                  incrementValue$1 = var34;
                  var34++;
                  SoftwareRasterizer.framebuffer[incrementValue$1] = ((var38 & 16711935) * var40 + (var39 & 16711935) * var41 & -16711936) + ((var38 & 65280) * var40 + (var39 & 65280) * var41 & 16711680) >>> 8;
                  var35 = var35 + var27;
                  var36 = var36 + var26;
                  var37++;
                }
                var33++;
                var30 = var30 - var26;
                var31 = var31 + var27;
                var23 = var23 + SoftwareRasterizer.stride;
              }
              break L14;
            }
            if (var26 == 0) {
              var33 = var22;
              L44: while (var33 < 0) {
                L45: {
                  var34 = var23;
                  var35 = var30 + (var28 * var27 >> 4);
                  var36 = var31;
                  var37 = var20;
                  if (var36 >= 0) {
                    if (var36 - (this.height << 12) < 0) {
                      var32 = var35 - (this.width << 12);
                      if (var35 - (this.width << 12) >= 0) {
                        var32 = (var27 - var32) / var27;
                        var37 = var37 + var32;
                        var35 = var35 + var27 * var32;
                        var34 = var34 + var32;
                      }
                      var32 = (var35 - var27) / var27;
                      if ((var35 - var27) / var27 > var37) {
                        var37 = var32;
                      }
                      L48: while (var37 < 0) {
                        var38 = this.pixels[(var36 >> 12) * this.width + (var35 >> 12)];
                        var39 = SoftwareRasterizer.framebuffer[var34];
                        var40 = var38 >>> 24;
                        var41 = 256 - var40;
                        incrementValue$5 = var34;
                        var34++;
                        SoftwareRasterizer.framebuffer[incrementValue$5] = ((var38 & 16711935) * var40 + (var39 & 16711935) * var41 & -16711936) + ((var38 & 65280) * var40 + (var39 & 65280) * var41 & 16711680) >>> 8;
                        var35 = var35 + var27;
                        var37++;
                      }
                      break L45;
                    }
                  }
                }
                var33++;
                var31 = var31 + var27;
                var23 = var23 + SoftwareRasterizer.stride;
              }
              break L14;
            }
            if (var26 >= 0) {
              var33 = var22;
              L32: while (var33 < 0) {
                var34 = var23;
                var35 = var30 + (var28 * var27 >> 4);
                var36 = var31 + (var28 * var26 >> 4);
                var37 = var20;
                var32 = var35 - (this.width << 12);
                if (var35 - (this.width << 12) >= 0) {
                  var32 = (var27 - var32) / var27;
                  var37 = var37 + var32;
                  var35 = var35 + var27 * var32;
                  var36 = var36 + var26 * var32;
                  var34 = var34 + var32;
                }
                var32 = (var35 - var27) / var27;
                if ((var35 - var27) / var27 > var37) {
                  var37 = var32;
                }
                if (var36 < 0) {
                  var32 = (var26 - 1 - var36) / var26;
                  var37 = var37 + var32;
                  var35 = var35 + var27 * var32;
                  var36 = var36 + var26 * var32;
                  var34 = var34 + var32;
                }
                var32 = (1 + var36 - (this.height << 12) - var26) / var26;
                if ((1 + var36 - (this.height << 12) - var26) / var26 > var37) {
                  var37 = var32;
                }
                L37: while (var37 < 0) {
                  var38 = this.pixels[(var36 >> 12) * this.width + (var35 >> 12)];
                  var39 = SoftwareRasterizer.framebuffer[var34];
                  var40 = var38 >>> 24;
                  var41 = 256 - var40;
                  incrementValue$3 = var34;
                  var34++;
                  SoftwareRasterizer.framebuffer[incrementValue$3] = ((var38 & 16711935) * var40 + (var39 & 16711935) * var41 & -16711936) + ((var38 & 65280) * var40 + (var39 & 65280) * var41 & 16711680) >>> 8;
                  var35 = var35 + var27;
                  var36 = var36 + var26;
                  var37++;
                }
                var33++;
                var30 = var30 - var26;
                var31 = var31 + var27;
                var23 = var23 + SoftwareRasterizer.stride;
              }
              break L14;
            }
            var33 = var22;
            L38: while (var33 < 0) {
              var34 = var23;
              var35 = var30 + (var28 * var27 >> 4);
              var36 = var31 + (var28 * var26 >> 4);
              var37 = var20;
              var32 = var35 - (this.width << 12);
              if (var35 - (this.width << 12) >= 0) {
                var32 = (var27 - var32) / var27;
                var37 = var37 + var32;
                var35 = var35 + var27 * var32;
                var36 = var36 + var26 * var32;
                var34 = var34 + var32;
              }
              var32 = (var35 - var27) / var27;
              if ((var35 - var27) / var27 > var37) {
                var37 = var32;
              }
              var32 = var36 - (this.height << 12);
              if (var36 - (this.height << 12) >= 0) {
                var32 = (var26 - var32) / var26;
                var37 = var37 + var32;
                var35 = var35 + var27 * var32;
                var36 = var36 + var26 * var32;
                var34 = var34 + var32;
              }
              var32 = (var36 - var26) / var26;
              if ((var36 - var26) / var26 > var37) {
                var37 = var32;
              }
              L43: while (var37 < 0) {
                var38 = this.pixels[(var36 >> 12) * this.width + (var35 >> 12)];
                var39 = SoftwareRasterizer.framebuffer[var34];
                var40 = var38 >>> 24;
                var41 = 256 - var40;
                incrementValue$4 = var34;
                var34++;
                SoftwareRasterizer.framebuffer[incrementValue$4] = ((var38 & 16711935) * var40 + (var39 & 16711935) * var41 & -16711936) + ((var38 & 65280) * var40 + (var39 & 65280) * var41 & 16711680) >>> 8;
                var35 = var35 + var27;
                var36 = var36 + var26;
                var37++;
              }
              var33++;
              var30 = var30 - var26;
              var31 = var31 + var27;
              var23 = var23 + SoftwareRasterizer.stride;
            }
            break L14;
          }
          return;
        }
    }

    private final static void b(int param0, int param1, int param2, int[] param3, int[] param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13) {
        int incrementValue$11 = 0;
        int incrementValue$12 = 0;
        int var14;
        param8 = -param10;
        L0: while (true) {
          if (param8 >= 0) {
            return;
          }
          param6 = -param9;
          L1: while (true) {
            if (param6 >= 0) {
              param7 = param7 + param11;
              param5 = param5 + param12;
              param8++;
              continue L0;
            }
            {
              incrementValue$11 = param5;
              param5++;
              param0 = param4[incrementValue$11];
              if (param0 == 0) {
                param7++;
                param6++;
                continue L1;
              }
              {
                var14 = param13 * (param0 >>> 24) >> 8 & 255;
                param1 = (param0 & 16711935) * var14;
                param0 = (param1 & -16711936) + (param0 * var14 - param1 & 16711680) >>> 8;
                param1 = param3[param7];
                param2 = param0 + param1;
                param0 = (param0 & 16711935) + (param1 & 16711935);
                param1 = (param0 & 16777472) + (param2 - param0 & 65536);
                incrementValue$12 = param7;
                param7++;
                param3[incrementValue$12] = param2 - param1 | param1 - (param1 >>> 8);
                param6++;
                continue L1;
              }
            }
          }
        }
    }

    final void d(int param0, int param1) {
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int[] stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        int[] stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        int stackIn_21_2 = 0;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
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
        int var21;
        var3 = this.width >> 1;
        var4 = this.height >> 1;
        param0 = param0 + this.trimX / 2;
        param1 = param1 + this.trimY / 2;
        if (param0 >= SoftwareRasterizer.clipLeft) {
          stackIn_3_0 = 0;
        } else {
          stackIn_3_0 = SoftwareRasterizer.clipLeft - param0 << 1;
        }
        var5 = stackIn_3_0;
        if (param0 + var3 <= SoftwareRasterizer.clipRight) {
          stackIn_6_0 = this.width - 2;
        } else {
          stackIn_6_0 = (SoftwareRasterizer.clipRight - param0 << 1) - 2;
        }
        var6 = stackIn_6_0;
        if (param1 >= SoftwareRasterizer.clipTop) {
          stackIn_9_0 = 0;
        } else {
          stackIn_9_0 = SoftwareRasterizer.clipTop - param1 << 1;
        }
        var7 = stackIn_9_0;
        if (param1 + var4 <= SoftwareRasterizer.clipBottom) {
          stackIn_12_0 = this.height - 2;
        } else {
          stackIn_12_0 = (SoftwareRasterizer.clipBottom - param1 << 1) - 2;
        }
        var8 = stackIn_12_0;
        var9 = var7;
        L4: while (true) {
          if (var9 > var8) {
            return;
          }
          {
            var10 = var9 * this.width + var5;
            var11 = (param1 + (var9 >> 1)) * SoftwareRasterizer.stride + (param0 + (var5 >> 1));
            var12 = var5;
            L5: while (true) {
              if (var12 > var6) {
                var9 += 2;
                continue L4;
              }
              {
                var13 = 0;
                var14 = 0;
                var15 = 0;
                var16 = 0;
                var17 = 0;
                var18 = 0;
                for (var19 = 0; var19 < 4; var19++) {
                  stackIn_20_0 = this.pixels;

                  stackIn_20_1 = var10 + (var19 & 1);

                  if ((var19 & 2) != 0) {
                    stackIn_21_0 = (int[]) ((Object) stackIn_20_0);
                    stackIn_21_1 = stackIn_20_1;
                    stackIn_21_2 = 0;
                  } else {
                    stackIn_21_0 = (int[]) ((Object) stackIn_20_0);
                    stackIn_21_1 = stackIn_20_1;
                    stackIn_21_2 = this.width;
                  }
                  var13 = stackIn_21_0[stackIn_21_1 + stackIn_21_2];
                  var14 = var13 >>> 24;
                  var18 = var18 + var14;
                  var15 = var15 + var14 * (var13 >> 16 & 255);
                  var16 = var16 + var14 * (var13 >> 8 & 255);
                  var17 = var17 + var14 * (var13 & 255);
                }
                if (var18 == 0) {
                  var12 += 2;
                  var11++;
                  var10 += 2;
                  continue L5;
                }
                {
                  var15 = (var15 / var18 << 16) + var17 / var18;
                  var16 = var16 / var18 << 8;
                  var19 = var18 >> 2;
                  var20 = 256 - var19;
                  var21 = SoftwareRasterizer.framebuffer[var11];
                  SoftwareRasterizer.framebuffer[var11] = (var19 * var15 + var20 * (var21 & 16711935) & -16711936) + (var19 * var16 + var20 * (var21 & 65280) & 16711680) >>> 8;
                  var12 += 2;
                  var11++;
                  var10 += 2;
                  continue L5;
                }
              }
            }
          }
        }
    }

    il(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6) {
        super(param0, param1, param2, param3, param4, param5, param6);
    }

    final void f(int param0, int param1) {
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int[] var9;
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
        int var21;
        int[] var22;
        int[] var23;
        var3 = this.width >> 2;
        var4 = this.height >> 2;
        param0 = param0 + this.trimX / 4;
        param1 = param1 + this.trimY / 4;
        if (param0 >= SoftwareRasterizer.clipLeft) {
          stackIn_3_0 = 0;
        } else {
          stackIn_3_0 = SoftwareRasterizer.clipLeft - param0 << 2;
        }
        var5 = stackIn_3_0;
        if (param0 + var3 <= SoftwareRasterizer.clipRight) {
          stackIn_6_0 = this.width - 4;
        } else {
          stackIn_6_0 = (SoftwareRasterizer.clipRight - param0 << 2) - 4;
        }
        var6 = stackIn_6_0;
        if (param1 >= SoftwareRasterizer.clipTop) {
          stackIn_9_0 = 0;
        } else {
          stackIn_9_0 = SoftwareRasterizer.clipTop - param1 << 2;
        }
        var7 = stackIn_9_0;
        if (param1 + var4 <= SoftwareRasterizer.clipBottom) {
          stackIn_12_0 = this.height - 4;
        } else {
          stackIn_12_0 = (SoftwareRasterizer.clipBottom - param1 << 2) - 4;
        }
        var8 = stackIn_12_0;
        var23 = new int[16];
        var22 = var23;
        var9 = var22;
        var10 = var7;
        L4: while (true) {
          if (var10 > var8) {
            return;
          }
          {
            var11 = var5;
            L5: while (true) {
              if (var11 > var6) {
                var10 += 4;
                continue L4;
              }
              {
                var12 = var10 * this.width + var11;
                var13 = (param1 + (var10 >> 2)) * SoftwareRasterizer.stride + (param0 + (var11 >> 2));
                for (var14 = 0; var14 < 4; var14++) {
                  for (var15 = 0; var15 < 4; var15++) {
                    var9[(var14 << 2) + var15] = this.pixels[var12 + var14 * this.width + var15];
                  }
                }
                var23 = var22;
                var14 = 0;
                var15 = 0;
                var16 = 0;
                var17 = 0;
                var18 = 0;
                for (var19 = 0; var19 < 16; var19++) {
                  var14 = var23[var19] >>> 24;
                  var15 = var15 + var14;
                  var16 = var16 + var14 * (var23[var19] >> 16 & 255);
                  var17 = var17 + var14 * (var23[var19] >> 8 & 255);
                  var18 = var18 + var14 * (var23[var19] & 255);
                }
                if (var15 == 0) {
                  var11 += 4;
                  continue L5;
                }
                {
                  var16 = (var16 / var15 << 16) + var18 / var15;
                  var17 = var17 / var15 << 8;
                  var19 = var15 >> 4;
                  var20 = 256 - var19;
                  var21 = SoftwareRasterizer.framebuffer[var13];
                  SoftwareRasterizer.framebuffer[var13] = (var19 * var16 + var20 * (var21 & 16711935) & -16711936) + (var19 * var17 + var20 * (var21 & 65280) & 16711680) >>> 8;
                  var11 += 4;
                  continue L5;
                }
              }
            }
          }
        }
    }

    il(int param0, int param1) {
        super(param0, param1);
    }

    private final static void d(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        var12 = param11 & 16711935;
        var13 = param11 >> 8 & 255;
        param6 = -param8;
        L0: while (true) {
          if (param6 >= 0) {
            return;
          }
          param5 = -param7;
          L1: while (true) {
            if (param5 >= 0) {
              param4 = param4 + param9;
              param3 = param3 + param10;
              param6++;
              continue L0;
            }
            {
              incrementValue$0 = param3;
              param3++;
              param2 = param1[incrementValue$0];
              var14 = param2 >>> 24;
              param2 = param2 & 16777215;
              if (var14 == 0) {
                param4++;
                param5++;
                continue L1;
              }
              {
                var15 = 0;
                if (param2 >> 8 != (param2 & 65535)) {
                  var15 = param2;
                } else {
                  param2 = param2 & 255;
                  var15 = (param2 * var12 >> 8 & 16711934) + (param2 * var13 & 65280) + 1;
                }
                var16 = 256 - var14;
                var17 = param0[param4];
                incrementValue$1 = param4;
                param4++;
                param0[incrementValue$1] = ((var15 & 16711935) * var14 + (var17 & 16711935) * var16 & -16711936) + ((var15 & 65280) * var14 + (var17 & 65280) * var16 & 16711680) >>> 8;
                param5++;
                continue L1;
              }
            }
          }
        }
    }

    final void c(int param0, int param1, int param2) {
        int var10 = 0;
        param0 = param0 + this.trimX;
        param1 = param1 + this.trimY;
        int var4 = param0 + param1 * SoftwareRasterizer.stride;
        int var5 = 0;
        int var6 = this.height;
        int var7 = this.width;
        int var8 = SoftwareRasterizer.stride - var7;
        int var9 = 0;
        if (param1 < SoftwareRasterizer.clipTop) {
            var10 = SoftwareRasterizer.clipTop - param1;
            var6 = var6 - var10;
            param1 = SoftwareRasterizer.clipTop;
            var5 = var5 + var10 * var7;
            var4 = var4 + var10 * SoftwareRasterizer.stride;
        }
        if (param1 + var6 > SoftwareRasterizer.clipBottom) {
            var6 = var6 - (param1 + var6 - SoftwareRasterizer.clipBottom);
        }
        if (param0 < SoftwareRasterizer.clipLeft) {
            var10 = SoftwareRasterizer.clipLeft - param0;
            var7 = var7 - var10;
            param0 = SoftwareRasterizer.clipLeft;
            var5 = var5 + var10;
            var4 = var4 + var10;
            var9 = var9 + var10;
            var8 = var8 + var10;
        }
        if (param0 + var7 > SoftwareRasterizer.clipRight) {
            var10 = param0 + var7 - SoftwareRasterizer.clipRight;
            var7 = var7 - var10;
            var9 = var9 + var10;
            var8 = var8 + var10;
        }
        if (var7 > 0) {
            if (var6 <= 0) {
                return;
            }
            il.b(0, 0, 0, SoftwareRasterizer.framebuffer, this.pixels, var5, 0, var4, 0, var7, var6, var8, var9, param2);
            return;
        }
    }

    final void b(int param0, int param1) {
        int var9 = 0;
        param0 = param0 + this.trimX;
        param1 = param1 + this.trimY;
        int var3 = param0 + param1 * SoftwareRasterizer.stride;
        int var4 = 0;
        int var5 = this.height;
        int var6 = this.width;
        int var7 = SoftwareRasterizer.stride - var6;
        int var8 = 0;
        if (param1 < SoftwareRasterizer.clipTop) {
            var9 = SoftwareRasterizer.clipTop - param1;
            var5 = var5 - var9;
            param1 = SoftwareRasterizer.clipTop;
            var4 = var4 + var9 * var6;
            var3 = var3 + var9 * SoftwareRasterizer.stride;
        }
        if (param1 + var5 > SoftwareRasterizer.clipBottom) {
            var5 = var5 - (param1 + var5 - SoftwareRasterizer.clipBottom);
        }
        if (param0 < SoftwareRasterizer.clipLeft) {
            var9 = SoftwareRasterizer.clipLeft - param0;
            var6 = var6 - var9;
            param0 = SoftwareRasterizer.clipLeft;
            var4 = var4 + var9;
            var3 = var3 + var9;
            var8 = var8 + var9;
            var7 = var7 + var9;
        }
        if (param0 + var6 > SoftwareRasterizer.clipRight) {
            var9 = param0 + var6 - SoftwareRasterizer.clipRight;
            var6 = var6 - var9;
            var8 = var8 + var9;
            var7 = var7 + var9;
        }
        if (var6 > 0) {
            if (var5 <= 0) {
                return;
            }
            il.c(SoftwareRasterizer.framebuffer, this.pixels, 0, var4, var3, var6, var5, var7, var8);
            return;
        }
    }

    private final static void d(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int incrementValue$0 = 0;
        int var14 = 0;
        int var15 = 0;
        int incrementValue$1 = 0;
        for (var10 = -param6; var10 < 0; var10++) {
            for (var11 = -param5; var11 < 0; var11++) {
                var12 = (param1[param3] >>> 24) * param9 >> 8;
                var13 = 256 - var12;
                incrementValue$0 = param3;
                param3++;
                var14 = param1[incrementValue$0];
                var15 = param0[param4];
                incrementValue$1 = param4;
                param4++;
                param0[incrementValue$1] = ((var14 & 16711935) * var12 + (var15 & 16711935) * var13 & -16711936) + ((var14 & 65280) * var12 + (var15 & 65280) * var13 & 16711680) >>> 8;
            }
            param4 = param4 + param7;
            param3 = param3 + param8;
        }
    }

    final void b(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var15 = 0;
        int var14 = 0;
        int var16 = 0;
        if (param2 > 0) {
            if (param3 <= 0) {
                return;
            }
            var6 = this.width;
            var7 = this.height;
            var8 = 0;
            var9 = 0;
            var10 = this.field_s;
            var11 = this.field_o;
            var12 = (var10 << 16) / param2;
            var13 = (var11 << 16) / param3;
            if (this.trimX > 0) {
                var14 = ((this.trimX << 16) + var12 - 1) / var12;
                param0 = param0 + var14;
                var8 = var8 + (var14 * var12 - (this.trimX << 16));
            }
            if (this.trimY > 0) {
                var14 = ((this.trimY << 16) + var13 - 1) / var13;
                param1 = param1 + var14;
                var9 = var9 + (var14 * var13 - (this.trimY << 16));
            }
            if (var6 < var10) {
                param2 = ((var6 << 16) - var8 + var12 - 1) / var12;
            }
            if (var7 < var11) {
                param3 = ((var7 << 16) - var9 + var13 - 1) / var13;
            }
            var14 = param0 + param1 * SoftwareRasterizer.stride;
            var15 = SoftwareRasterizer.stride - param2;
            if (param1 + param3 > SoftwareRasterizer.clipBottom) {
                param3 = param3 - (param1 + param3 - SoftwareRasterizer.clipBottom);
            }
            if (param1 < SoftwareRasterizer.clipTop) {
                var16 = SoftwareRasterizer.clipTop - param1;
                param3 = param3 - var16;
                var14 = var14 + var16 * SoftwareRasterizer.stride;
                var9 = var9 + var13 * var16;
            }
            if (param0 + param2 > SoftwareRasterizer.clipRight) {
                var16 = param0 + param2 - SoftwareRasterizer.clipRight;
                param2 = param2 - var16;
                var15 = var15 + var16;
            }
            if (param0 < SoftwareRasterizer.clipLeft) {
                var16 = SoftwareRasterizer.clipLeft - param0;
                param2 = param2 - var16;
                var14 = var14 + var16;
                var8 = var8 + var12 * var16;
                var15 = var15 + var16;
            }
            il.c(SoftwareRasterizer.framebuffer, this.pixels, 0, var8, var9, var14, var15, param2, param3, var12, var13, var6, param4);
            return;
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var14 = 0;
        int var13 = 0;
        int var15 = 0;
        if (param2 > 0) {
            if (param3 <= 0) {
                return;
            }
            var5 = this.width;
            var6 = this.height;
            var7 = 0;
            var8 = 0;
            var9 = this.field_s;
            var10 = this.field_o;
            var11 = (var9 << 16) / param2;
            var12 = (var10 << 16) / param3;
            if (this.trimX > 0) {
                var13 = ((this.trimX << 16) + var11 - 1) / var11;
                param0 = param0 + var13;
                var7 = var7 + (var13 * var11 - (this.trimX << 16));
            }
            if (this.trimY > 0) {
                var13 = ((this.trimY << 16) + var12 - 1) / var12;
                param1 = param1 + var13;
                var8 = var8 + (var13 * var12 - (this.trimY << 16));
            }
            if (var5 < var9) {
                param2 = ((var5 << 16) - var7 + var11 - 1) / var11;
            }
            if (var6 < var10) {
                param3 = ((var6 << 16) - var8 + var12 - 1) / var12;
            }
            var13 = param0 + param1 * SoftwareRasterizer.stride;
            var14 = SoftwareRasterizer.stride - param2;
            if (param1 + param3 > SoftwareRasterizer.clipBottom) {
                param3 = param3 - (param1 + param3 - SoftwareRasterizer.clipBottom);
            }
            if (param1 < SoftwareRasterizer.clipTop) {
                var15 = SoftwareRasterizer.clipTop - param1;
                param3 = param3 - var15;
                var13 = var13 + var15 * SoftwareRasterizer.stride;
                var8 = var8 + var12 * var15;
            }
            if (param0 + param2 > SoftwareRasterizer.clipRight) {
                var15 = param0 + param2 - SoftwareRasterizer.clipRight;
                param2 = param2 - var15;
                var14 = var14 + var15;
            }
            if (param0 < SoftwareRasterizer.clipLeft) {
                var15 = SoftwareRasterizer.clipLeft - param0;
                param2 = param2 - var15;
                var13 = var13 + var15;
                var7 = var7 + var11 * var15;
                var14 = var14 + var15;
            }
            il.c(SoftwareRasterizer.framebuffer, this.pixels, 0, var7, var8, var13, var14, param2, param3, var11, var12, var5);
            return;
        }
    }

    final void c(int param0, int param1) {
        int var9 = 0;
        param0 = param0 + this.trimX;
        param1 = param1 + this.trimY;
        int var3 = param0 + param1 * SoftwareRasterizer.stride;
        int var4 = 0;
        int var5 = this.height;
        int var6 = this.width;
        int var7 = SoftwareRasterizer.stride - var6;
        int var8 = 0;
        if (param1 < SoftwareRasterizer.clipTop) {
            var9 = SoftwareRasterizer.clipTop - param1;
            var5 = var5 - var9;
            param1 = SoftwareRasterizer.clipTop;
            var4 = var4 + var9 * var6;
            var3 = var3 + var9 * SoftwareRasterizer.stride;
        }
        if (param1 + var5 > SoftwareRasterizer.clipBottom) {
            var5 = var5 - (param1 + var5 - SoftwareRasterizer.clipBottom);
        }
        if (param0 < SoftwareRasterizer.clipLeft) {
            var9 = SoftwareRasterizer.clipLeft - param0;
            var6 = var6 - var9;
            param0 = SoftwareRasterizer.clipLeft;
            var4 = var4 + var9;
            var3 = var3 + var9;
            var8 = var8 + var9;
            var7 = var7 + var9;
        }
        if (param0 + var6 > SoftwareRasterizer.clipRight) {
            var9 = param0 + var6 - SoftwareRasterizer.clipRight;
            var6 = var6 - var9;
            var8 = var8 + var9;
            var7 = var7 + var9;
        }
        if (var6 > 0) {
            if (var5 <= 0) {
                return;
            }
            il.c(SoftwareRasterizer.framebuffer, this.pixels, 0, var4, var3, var6, var5, var7, var8);
            return;
        }
    }
}
