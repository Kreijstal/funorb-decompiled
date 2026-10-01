/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SoftwareRasterizer {
    private static int[] field_g;
    static int[] field_l;
    static int clipBottom;
    private static int[] field_j;
    static int clipRight;
    static int[] field_a;
    static int clipTop;
    static int stride;
    static int field_b;
    static int[] framebuffer;
    static int clipLeft;
    private static int[] field_h;

    final static void d(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var10 = 0;
        int var14 = 0;
        int incrementValue$0 = 0;
        int var6;
        int var7;
        int var8;
        int var9;
        int var11;
        int var12;
        int var13;
        var6 = 0;
        var7 = 65536 / param3;
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
        var8 = stride - param2;
        var9 = param0 + param1 * stride;
        for (var10 = -param3; var10 < 0; var10++) {
          var11 = 65536 - var6 >> 8;
          var12 = var6 >> 8;
          var13 = ((param4 & 16711935) * var11 + (param5 & 16711935) * var12 & -16711936) + ((param4 & 65280) * var11 + (param5 & 65280) * var12 & 16711680) >>> 8;
          for (var14 = -param2; var14 < 0; var14++) {
            incrementValue$0 = var9;
            var9++;
            framebuffer[incrementValue$0] = var13;
          }
          var9 = var9 + var8;
          var6 = var6 + var7;
        }
    }

    final static void b(int param0, int param1, int param2, int param3) {
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

    final static void f(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var5 = 0;
        for (var6 = 0; var6 < 4; var6++) {
            var5 = 128 - (var6 << 5);
            SoftwareRasterizer.b(param0 + var6, param1 + param3 + var6, param2, param4, var5);
            SoftwareRasterizer.c(param0 + param2 + var6, param1 + var6, param3 + 1, param4, var5);
        }
    }

    final static void a(int[] param0) {
        param0[0] = clipLeft;
        param0[1] = clipTop;
        param0[2] = clipRight;
        param0[3] = clipBottom;
    }

    final static void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int incrementValue$0 = 0;
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
        int var4 = param0 + param1 * stride;
        if (param2 > 0) {
            if (param3 <= 0) {
                return;
            }
            for (var5 = 0; var5 < param3; var5++) {
                for (var6 = 0; var6 < param2; var6++) {
                    var7 = framebuffer[var4];
                    var8 = var7 >> 15 & 510;
                    var9 = var7 >> 8 & 255;
                    var10 = var7 & 255;
                    var11 = (var10 + var8) / 3 + var9 >> 1;
                    incrementValue$0 = var4;
                    var4++;
                    framebuffer[incrementValue$0] = (var11 << 16) + (var11 << 8) + var11;
                }
                var4 = var4 + (stride - param2);
            }
            return;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
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
        int var22;
        if (param4 != 0) {
          if (param4 < 0) {
            param4 = -param4;
          }
          var6 = param0 + param4;
          var7 = param1 + param4;
          var8 = param0 + param2 - param4 - 1;
          var9 = param1 + param3 - param4 - 1;
          if (clipRight > clipLeft) {
            if (clipBottom > clipTop) {
              if (param0 + param2 > clipLeft) {
                if (param0 < clipRight) {
                  if (param1 + param3 >= clipTop) {
                    if (param1 < clipBottom) {
                      L3: {
                        var10 = var6 + (var7 - param4) * stride;
                        var11 = var8 + (var7 - param4) * stride;
                        var12 = var6 + var7 * stride;
                        var13 = var8 + var7 * stride;
                        var14 = var6 + var9 * stride;
                        var15 = var8 + var9 * stride;
                        var16 = var6 + (var9 + param4) * stride;
                        var17 = var8 + (var9 + param4) * stride;
                        var18 = param4;
                        var19 = 0;
                        var20 = param4 * param4;
                        var21 = var20 - var18;
                        if (param0 >= clipLeft) {
                          if (param0 + param2 < clipRight) {
                            if (param1 >= clipTop) {
                              if (param1 + param3 < clipBottom) {
                                for (var22 = var12; var22 <= var14; var22 = var22 + stride) {
                                  framebuffer[var22 - var18] = param5;
                                }
                                for (var22 = var13; var22 <= var15; var22 = var22 + stride) {
                                  framebuffer[var22 + var18] = param5;
                                }
                                for (var22 = var10; var22 <= var11; var22++) {
                                  framebuffer[var22] = param5;
                                }
                                for (var22 = var16; var22 <= var17; var22++) {
                                  framebuffer[var22] = param5;
                                }
                                L9: while (true) {
                                  incrementValue$0 = var19;
                                  var19++;
                                  var21 = var21 + (incrementValue$0 + var19);
                                  var12 = var12 - stride;
                                  var13 = var13 - stride;
                                  var14 = var14 + stride;
                                  var15 = var15 + stride;
                                  if (var21 > var20) {
                                    var18--;
                                    var21 = var21 - (var18 + var18);
                                    var10 = var10 + stride;
                                    var11 = var11 + stride;
                                    var16 = var16 - stride;
                                    var17 = var17 - stride;
                                  }
                                  if (var18 >= var19) {
                                    framebuffer[var10 - var19] = param5;
                                    framebuffer[var11 + var19] = param5;
                                    framebuffer[var12 - var18] = param5;
                                    framebuffer[var13 + var18] = param5;
                                    framebuffer[var14 - var18] = param5;
                                    framebuffer[var15 + var18] = param5;
                                    framebuffer[var16 - var19] = param5;
                                    framebuffer[var17 + var19] = param5;
                                    continue L9;
                                  } else {
                                    break L3;
                                  }
                                }
                              }
                            }
                          }
                        }
                        SoftwareRasterizer.g(param0, param1 + var18, param3 - var18 - var18, param5);
                        SoftwareRasterizer.g(param0 + param2 - 1, param1 + var18, param3 - var18 - var18, param5);
                        SoftwareRasterizer.c(param0 + var18, param1, param2 - var18 - var18, param5);
                        SoftwareRasterizer.c(param0 + var18, param1 + param3 - 1, param2 - var18 - var18, param5);
                        L11: while (true) {
                          incrementValue$1 = var19;
                          var19++;
                          var21 = var21 + (incrementValue$1 + var19);
                          var12 = var12 - stride;
                          var13 = var13 - stride;
                          var14 = var14 + stride;
                          var15 = var15 + stride;
                          if (var21 > var20) {
                            var18--;
                            var21 = var21 - (var18 + var18);
                            var10 = var10 + stride;
                            var11 = var11 + stride;
                            var16 = var16 - stride;
                            var17 = var17 - stride;
                          }
                          if (var18 >= var19) {
                            if (var7 - var18 >= clipTop) {
                              if (var7 - var18 < clipBottom) {
                                if (var6 - var19 >= clipLeft) {
                                  if (var6 - var19 < clipRight) {
                                    framebuffer[var10 - var19] = param5;
                                  }
                                }
                                if (var8 + var19 >= clipLeft) {
                                  if (var8 + var19 < clipRight) {
                                    framebuffer[var11 + var19] = param5;
                                  }
                                }
                              }
                            }
                            if (var7 - var19 >= clipTop) {
                              if (var7 - var19 < clipBottom) {
                                if (var6 - var18 >= clipLeft) {
                                  if (var6 - var18 < clipRight) {
                                    framebuffer[var12 - var18] = param5;
                                  }
                                }
                                if (var8 + var18 >= clipLeft) {
                                  if (var8 + var18 < clipRight) {
                                    framebuffer[var13 + var18] = param5;
                                  }
                                }
                              }
                            }
                            if (var9 + var19 >= clipTop) {
                              if (var9 + var19 < clipBottom) {
                                if (var6 - var18 >= clipLeft) {
                                  if (var6 - var18 < clipRight) {
                                    framebuffer[var14 - var18] = param5;
                                  }
                                }
                                if (var8 + var18 >= clipLeft) {
                                  if (var8 + var18 < clipRight) {
                                    framebuffer[var15 + var18] = param5;
                                  }
                                }
                              }
                            }
                            if (var9 + var18 < clipTop) {
                              continue L11;
                            } else {
                              if (var9 + var18 >= clipBottom) {
                                continue L11;
                              } else {
                                if (var6 - var19 >= clipLeft) {
                                  if (var6 - var19 < clipRight) {
                                    framebuffer[var16 - var19] = param5;
                                  }
                                }
                                if (var8 + var19 < clipLeft) {
                                  continue L11;
                                } else {
                                  if (var8 + var19 >= clipRight) {
                                    continue L11;
                                  } else {
                                    framebuffer[var17 + var19] = param5;
                                    continue L11;
                                  }
                                }
                              }
                            }
                          } else {
                            break L3;
                          }
                        }
                      }
                      return;
                    }
                  }
                }
                return;
              }
            } else {
              return;
            }
          }
          return;
        } else {
          SoftwareRasterizer.d(param0, param1, param2, param3, param5);
          return;
        }
    }

    private final static void a(int[] param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var13 = 0;
        int incrementValue$0 = 0;
        int incrementValue$5 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
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
        var8 = 16384 / (2 * param3 + 1);
        var9 = 1 + param3 - param5 - param4;
        if (0 < var9) {
          var9 = 0;
        }
        var10 = stride - param4 - param5 - param3;
        if (0 < var10) {
          var10 = 0;
        }
        var11 = 0;
        var12 = param4 + param3 + 1;
        if (stride < var12) {
          var11 = var12 - stride;
          var12 = stride;
        }
        for (var13 = -param7; var13 < 0; var13++) {
          var14 = 0;
          var15 = 0;
          var16 = 0;
          var17 = param2 - param3;
          var18 = var17 - (param3 << 1) - 1;
          var19 = param4 - param3;
          if (var19 < 0) {
            var17 = var17 - var19;
            var18 = var18 - var19;
            var19 = 0;
          }
          var20 = var12 - var19;
          L5: while (var19 < var12) {
            param1 = param0[var17];
            var14 = var14 + (param1 >> 16 & 255);
            var15 = var15 + (param1 >> 8 & 255);
            var16 = var16 + (param1 & 255);
            var17++;
            var18++;
            var19++;
          }
          var18 = var18 + var11;
          incrementValue$0 = param2;
          param2++;
          param0[incrementValue$0] = (var14 / var20 << 16) + (var15 / var20 << 8) + var16 / var20;
          for (var19 = 1 - param5; var19 < var9; var19++) {
            var18++;
            if (param4 + param5 + var19 + param3 < clipRight) {
              param1 = param0[var17];
              var17++;
              var14 = var14 + (param1 >> 16 & 255);
              var15 = var15 + (param1 >> 8 & 255);
              var16 = var16 + (param1 & 255);
              var20++;
            }
            var21 = var14 / var20;
            var22 = var15 / var20;
            var23 = var16 / var20;
            incrementValue$5 = param2;
            param2++;
            param0[incrementValue$5] = (var21 << 16) + (var22 << 8) + var23;
          }
          L7: while (var19 < var10) {
            incrementValue$3 = var18;
            var18++;
            param1 = param0[incrementValue$3];
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
            var21 = var14 * var8 >> 14;
            var22 = var15 * var8 >> 14;
            var23 = var16 * var8 >> 14;
            if (var21 > 255) {
              var21 = 255;
            }
            if (var22 > 255) {
              var22 = 255;
            }
            if (var23 > 255) {
              var23 = 255;
            }
            incrementValue$4 = param2;
            param2++;
            param0[incrementValue$4] = (var21 << 16) + (var22 << 8) + var23;
            var19++;
          }
          L8: while (var19 < 0) {
            incrementValue$1 = var18;
            var18++;
            param1 = param0[incrementValue$1];
            var14 = var14 - (param1 >> 16 & 255);
            var15 = var15 - (param1 >> 8 & 255);
            var16 = var16 - (param1 & 255);
            var20--;
            var21 = var14 / var20;
            var22 = var15 / var20;
            var23 = var16 / var20;
            if (var21 >= 0) {
              if (var21 > 255) {
                var21 = 255;
              }
            } else {
              var21 = 0;
            }
            if (var22 >= 0) {
              if (var22 > 255) {
                var22 = 255;
              }
            } else {
              var22 = 0;
            }
            if (var23 >= 0) {
              if (var23 > 255) {
                var23 = 255;
              }
            } else {
              var23 = 0;
            }
            incrementValue$2 = param2;
            param2++;
            param0[incrementValue$2] = (var21 << 16) + (var22 << 8) + var23;
            var19++;
          }
          param2 = param2 + param6;
        }
    }

    private final static void b(int param0, int param1, int param2, int param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var12 = 0;
        int var13 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var14 = 0;
        int incrementValue$0 = 0;
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
            var5 = 256 - param4;
            var6 = (param3 >> 16 & 255) * param4;
            var7 = (param3 >> 8 & 255) * param4;
            var8 = (param3 & 255) * param4;
            var12 = param0 + param1 * stride;
            for (var13 = 0; var13 < param2; var13++) {
                var9 = (framebuffer[var12] >> 16 & 255) * var5;
                var10 = (framebuffer[var12] >> 8 & 255) * var5;
                var11 = (framebuffer[var12] & 255) * var5;
                var14 = (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8) + (var8 + var11 >> 8);
                incrementValue$0 = var12;
                var12++;
                framebuffer[incrementValue$0] = var14;
            }
            return;
        }
    }

    private final static void c(int param0, int param1, int param2, int param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var12 = 0;
        int var13 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var14 = 0;
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
            var5 = 256 - param4;
            var6 = (param3 >> 16 & 255) * param4;
            var7 = (param3 >> 8 & 255) * param4;
            var8 = (param3 & 255) * param4;
            var12 = param0 + param1 * stride;
            for (var13 = 0; var13 < param2; var13++) {
                var9 = (framebuffer[var12] >> 16 & 255) * var5;
                var10 = (framebuffer[var12] >> 8 & 255) * var5;
                var11 = (framebuffer[var12] & 255) * var5;
                var14 = (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8) + (var8 + var11 >> 8);
                framebuffer[var12] = var14;
                var12 = var12 + stride;
            }
            return;
        }
    }

    public static void a() {
        framebuffer = null;
        field_a = null;
        field_l = null;
        field_g = null;
        field_h = null;
        field_j = null;
    }

    final static void a(int param0, int param1, int param2) {
        if (param0 >= clipLeft) {
            if (param1 < clipTop || param0 >= clipRight || param1 >= clipBottom) {
                return;
            }
            framebuffer[param0 + param1 * stride] = param2;
            return;
        }
    }

    final static void e(int param0, int param1, int param2, int param3, int param4, int param5) {
        SoftwareRasterizer.a(framebuffer, 0, param2 + param3 * stride, param0, param2, param4, stride - param4, param5);
        SoftwareRasterizer.a(framebuffer, 0, param2 + param3 * stride, param1, param3, param5, stride - param4, param2, param4);
    }

    private final static void b() {
        field_a = null;
        field_l = null;
    }

    final static void e(int param0, int param1, int param2, int param3, int param4) {
        int incrementValue$0 = 0;
        int incrementValue$2 = 0;
        int incrementValue$1 = 0;
        int incrementValue$4 = 0;
        int incrementValue$3 = 0;
        int incrementValue$5 = 0;
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
        int var22;
        int var23;
        int var24;
        int var25;
        if (param4 != 0) {
          if (param4 != 256) {
            if (param2 < 0) {
              param2 = -param2;
            }
            var5 = 256 - param4;
            var6 = (param3 >> 16 & 255) * param4;
            var7 = (param3 >> 8 & 255) * param4;
            var8 = (param3 & 255) * param4;
            var12 = param1 - param2;
            if (var12 < clipTop) {
              var12 = clipTop;
            }
            var13 = param1 + param2 + 1;
            if (var13 > clipBottom) {
              var13 = clipBottom;
            }
            var14 = var12;
            var15 = param2 * param2;
            var16 = 0;
            var17 = param1 - var14;
            var18 = var17 * var17;
            var19 = var18 - var17;
            if (param1 > var13) {
              param1 = var13;
            }
            L4: while (true) {
              if (var14 >= param1) {
                var16 = param2;
                var17 = -var17;
                var19 = var17 * var17 + var15;
                var18 = var19 - var16;
                var19 = var19 - var17;
                L5: while (var14 < var13) {
                  L6: while (var19 > var15) {
                    if (var18 > var15) {
                      incrementValue$0 = var16;
                      var16--;
                      var19 = var19 - (incrementValue$0 + var16);
                      var18 = var18 - (var16 + var16);
                      continue L6;
                    }
                    break;
                  }
                  var20 = param0 - var16;
                  if (var20 < clipLeft) {
                    var20 = clipLeft;
                  }
                  var21 = param0 + var16;
                  if (var21 > clipRight - 1) {
                    var21 = clipRight - 1;
                  }
                  var25 = var20 + var14 * stride;
                  var22 = var25;
                  for (var23 = var20; var23 <= var21; var23++) {
                    var9 = (framebuffer[var25] >> 16 & 255) * var5;
                    var10 = (framebuffer[var25] >> 8 & 255) * var5;
                    var11 = (framebuffer[var25] & 255) * var5;
                    var24 = (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8) + (var8 + var11 >> 8);
                    incrementValue$2 = var25;
                    var25++;
                    framebuffer[incrementValue$2] = var24;
                  }
                  var14++;
                  var19 = var19 + (var17 + var17);
                  incrementValue$1 = var17;
                  var17++;
                  var18 = var18 + (incrementValue$1 + var17);
                }
                return;
              } else {
                L11: while (true) {
                  if (var19 > var15) {
                    if (var18 > var15) {
                      var20 = param0 - var16 + 1;
                      if (var20 < clipLeft) {
                        var20 = clipLeft;
                      }
                      var21 = param0 + var16;
                      if (var21 > clipRight) {
                        var21 = clipRight;
                      }
                      var22 = var20 + var14 * stride;
                      for (var23 = var20; var23 < var21; var23++) {
                        var9 = (framebuffer[var22] >> 16 & 255) * var5;
                        var10 = (framebuffer[var22] >> 8 & 255) * var5;
                        var11 = (framebuffer[var22] & 255) * var5;
                        var24 = (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8) + (var8 + var11 >> 8);
                        incrementValue$4 = var22;
                        var22++;
                        framebuffer[incrementValue$4] = var24;
                      }
                      var14++;
                      incrementValue$3 = var17;
                      var17--;
                      var18 = var18 - (incrementValue$3 + var17);
                      var19 = var19 - (var17 + var17);
                      continue L4;
                    }
                  }
                  var18 = var18 + (var16 + var16);
                  incrementValue$5 = var16;
                  var16++;
                  var19 = var19 + (incrementValue$5 + var16);
                  continue L11;
                }
              }
            }
          } else {
            SoftwareRasterizer.d(param0, param1, param2, param3);
            return;
          }
        } else {
          return;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        int var7 = 0;
        int var8 = 0;
        int incrementValue$0 = 0;
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
        int var5 = stride - param2;
        int var6 = param0 + param1 * stride;
        for (var7 = -param3; var7 < 0; var7++) {
            for (var8 = -param2; var8 < 0; var8++) {
                incrementValue$0 = var6;
                var6++;
                framebuffer[incrementValue$0] = param4;
            }
            var6 = var6 + var5;
        }
    }

    final static void c(int param0, int param1, int param2, int param3) {
        int var4 = 0;
        int var5 = 0;
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
            var4 = param0 + param1 * stride;
            for (var5 = 0; var5 < param2; var5++) {
                framebuffer[var4 + var5] = param3;
            }
            return;
        }
    }

    final static void d(int param0, int param1, int param2, int param3) {
        int incrementValue$0 = 0;
        int incrementValue$2 = 0;
        int incrementValue$1 = 0;
        int incrementValue$4 = 0;
        int incrementValue$3 = 0;
        int incrementValue$5 = 0;
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
        if (param2 != 0) {
          if (param2 < 0) {
            param2 = -param2;
          }
          var4 = param1 - param2;
          if (var4 < clipTop) {
            var4 = clipTop;
          }
          var5 = param1 + param2 + 1;
          if (var5 > clipBottom) {
            var5 = clipBottom;
          }
          var6 = var4;
          var7 = param2 * param2;
          var8 = 0;
          var9 = param1 - var6;
          var10 = var9 * var9;
          var11 = var10 - var9;
          if (param1 > var5) {
            param1 = var5;
          }
          L4: while (true) {
            if (var6 >= param1) {
              var8 = param2;
              var9 = var6 - param1;
              var11 = var9 * var9 + var7;
              var10 = var11 - var8;
              var11 = var11 - var9;
              L5: while (var6 < var5) {
                L6: while (var11 > var7) {
                  if (var10 > var7) {
                    incrementValue$0 = var8;
                    var8--;
                    var11 = var11 - (incrementValue$0 + var8);
                    var10 = var10 - (var8 + var8);
                    continue L6;
                  }
                  break;
                }
                var12 = param0 - var8;
                if (var12 < clipLeft) {
                  var12 = clipLeft;
                }
                var13 = param0 + var8;
                if (var13 > clipRight - 1) {
                  var13 = clipRight - 1;
                }
                var14 = var12 + var6 * stride;
                for (var15 = var12; var15 <= var13; var15++) {
                  incrementValue$2 = var14;
                  var14++;
                  framebuffer[incrementValue$2] = param3;
                }
                var6++;
                var11 = var11 + (var9 + var9);
                incrementValue$1 = var9;
                var9++;
                var10 = var10 + (incrementValue$1 + var9);
              }
              return;
            } else {
              L11: while (true) {
                if (var11 > var7) {
                  if (var10 > var7) {
                    var12 = param0 - var8 + 1;
                    if (var12 < clipLeft) {
                      var12 = clipLeft;
                    }
                    var13 = param0 + var8;
                    if (var13 > clipRight) {
                      var13 = clipRight;
                    }
                    var14 = var12 + var6 * stride;
                    for (var15 = var12; var15 < var13; var15++) {
                      incrementValue$4 = var14;
                      var14++;
                      framebuffer[incrementValue$4] = param3;
                    }
                    var6++;
                    incrementValue$3 = var9;
                    var9--;
                    var10 = var10 - (incrementValue$3 + var9);
                    var11 = var11 - (var9 + var9);
                    continue L4;
                  }
                }
                var10 = var10 + (var8 + var8);
                incrementValue$5 = var8;
                var8++;
                var11 = var11 + (incrementValue$5 + var8);
                continue L11;
              }
            }
          }
        } else {
          SoftwareRasterizer.a(param0, param1, param3);
          return;
        }
    }

    final static void g(int param0, int param1, int param2, int param3, int param4) {
        int var5;
        int var6;
        param2 = param2 - param0;
        param3 = param3 - param1;
        if (param3 != 0) {
          if (param2 != 0) {
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
              var5 = (int)Math.floor((double)param2 / (double)param3 + 0.5);
              param3 = param3 + param1;
              if (param1 < clipTop) {
                param0 = param0 + var5 * (clipTop - param1);
                param1 = clipTop;
              }
              if (param3 >= clipBottom) {
                param3 = clipBottom - 1;
              }
              L3: while (param1 <= param3) {
                var6 = param0 >> 16;
                if (var6 >= clipLeft) {
                  if (var6 < clipRight) {
                    framebuffer[var6 + param1 * stride] = param4;
                  }
                }
                param0 = param0 + var5;
                param1++;
              }
              return;
            } else {
              param1 = param1 << 16;
              param1 = param1 + 32768;
              param3 = param3 << 16;
              var5 = (int)Math.floor((double)param3 / (double)param2 + 0.5);
              param2 = param2 + param0;
              if (param0 < clipLeft) {
                param1 = param1 + var5 * (clipLeft - param0);
                param0 = clipLeft;
              }
              if (param2 >= clipRight) {
                param2 = clipRight - 1;
              }
              L7: while (param0 <= param2) {
                var6 = param1 >> 16;
                if (var6 >= clipTop) {
                  if (var6 < clipBottom) {
                    framebuffer[param0 + var6 * stride] = param4;
                  }
                }
                param1 = param1 + var5;
                param0++;
              }
              return;
            }
          } else {
            if (param3 < 0) {
              SoftwareRasterizer.g(param0, param1 + param3, -param3 + 1, param4);
            } else {
              SoftwareRasterizer.g(param0, param1, param3 + 1, param4);
            }
            return;
          }
        } else {
          if (param2 < 0) {
            SoftwareRasterizer.c(param0 + param2, param1, -param2 + 1, param4);
          } else {
            SoftwareRasterizer.c(param0, param1, param2 + 1, param4);
          }
          return;
        }
    }

    final static void f(int param0, int param1, int param2, int param3) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        if (param2 != 0) {
          if (param2 < 0) {
            param2 = -param2;
          }
          if (clipRight > clipLeft) {
            if (clipBottom > clipTop) {
              if (param0 + param2 >= clipLeft) {
                if (param0 - param2 < clipRight) {
                  if (param1 + param2 >= clipTop) {
                    if (param1 - param2 < clipBottom) {
                      L3: {
                        var4 = param0 + param1 * stride;
                        var5 = var4;
                        var6 = var4 - param2 * stride;
                        var7 = var4 + param2 * stride;
                        var8 = param2;
                        var9 = 0;
                        param2 = param2 * param2;
                        var10 = param2 - var8;
                        if (param0 - var8 >= clipLeft) {
                          if (param0 + var8 < clipRight) {
                            if (param1 - var8 >= clipTop) {
                              if (param1 + var8 < clipBottom) {
                                framebuffer[var4 - var8] = param3;
                                framebuffer[var4 + var8] = param3;
                                framebuffer[var6] = param3;
                                framebuffer[var7] = param3;
                                L5: while (true) {
                                  incrementValue$0 = var9;
                                  var9++;
                                  var10 = var10 + (incrementValue$0 + var9);
                                  var4 = var4 - stride;
                                  var5 = var5 + stride;
                                  if (var10 > param2) {
                                    var8--;
                                    var10 = var10 - (var8 + var8);
                                    var6 = var6 + stride;
                                    var7 = var7 - stride;
                                  }
                                  if (var8 >= var9) {
                                    framebuffer[var6 - var9] = param3;
                                    framebuffer[var6 + var9] = param3;
                                    framebuffer[var4 - var8] = param3;
                                    framebuffer[var4 + var8] = param3;
                                    framebuffer[var5 - var8] = param3;
                                    framebuffer[var5 + var8] = param3;
                                    framebuffer[var7 - var9] = param3;
                                    framebuffer[var7 + var9] = param3;
                                    continue L5;
                                  } else {
                                    break L3;
                                  }
                                }
                              }
                            }
                          }
                        }
                        if (param0 - var8 >= clipLeft) {
                          if (param1 >= clipTop) {
                            if (param1 < clipBottom) {
                              framebuffer[var4 - var8] = param3;
                            }
                          }
                        }
                        if (param0 + var8 < clipRight) {
                          if (param1 >= clipTop) {
                            if (param1 < clipBottom) {
                              framebuffer[var4 + var8] = param3;
                            }
                          }
                        }
                        if (param1 - var8 >= clipTop) {
                          if (param0 >= clipLeft) {
                            if (param0 < clipRight) {
                              framebuffer[var6] = param3;
                              if (param1 + var8 < clipBottom) {
                                if (param0 >= clipLeft) {
                                  if (param0 < clipRight) {
                                    framebuffer[var7] = param3;
                                  }
                                }
                              }
                            } else {
                              if (param1 + var8 < clipBottom) {
                                if (param0 >= clipLeft) {
                                  if (param0 < clipRight) {
                                    framebuffer[var7] = param3;
                                  }
                                }
                              }
                            }
                          } else {
                            if (param1 + var8 < clipBottom) {
                              if (param0 >= clipLeft) {
                                if (param0 < clipRight) {
                                  framebuffer[var7] = param3;
                                }
                              }
                            }
                          }
                        } else {
                          if (param1 + var8 < clipBottom) {
                            if (param0 >= clipLeft) {
                              if (param0 < clipRight) {
                                framebuffer[var7] = param3;
                              }
                            }
                          }
                        }
                        L10: while (true) {
                          incrementValue$1 = var9;
                          var9++;
                          var10 = var10 + (incrementValue$1 + var9);
                          var4 = var4 - stride;
                          var5 = var5 + stride;
                          if (var10 > param2) {
                            var8--;
                            var10 = var10 - (var8 + var8);
                            var6 = var6 + stride;
                            var7 = var7 - stride;
                          }
                          if (var8 >= var9) {
                            if (param1 - var8 >= clipTop) {
                              if (param1 - var8 < clipBottom) {
                                if (param0 - var9 >= clipLeft) {
                                  if (param0 - var9 < clipRight) {
                                    framebuffer[var6 - var9] = param3;
                                  }
                                }
                                if (param0 + var9 >= clipLeft) {
                                  if (param0 + var9 < clipRight) {
                                    framebuffer[var6 + var9] = param3;
                                  }
                                }
                              }
                            }
                            if (param1 - var9 >= clipTop) {
                              if (param1 - var9 < clipBottom) {
                                if (param0 - var8 >= clipLeft) {
                                  if (param0 - var8 < clipRight) {
                                    framebuffer[var4 - var8] = param3;
                                  }
                                }
                                if (param0 + var8 >= clipLeft) {
                                  if (param0 + var8 < clipRight) {
                                    framebuffer[var4 + var8] = param3;
                                  }
                                }
                              }
                            }
                            if (param1 + var9 >= clipTop) {
                              if (param1 + var9 < clipBottom) {
                                if (param0 - var8 >= clipLeft) {
                                  if (param0 - var8 < clipRight) {
                                    framebuffer[var5 - var8] = param3;
                                  }
                                }
                                if (param0 + var8 >= clipLeft) {
                                  if (param0 + var8 < clipRight) {
                                    framebuffer[var5 + var8] = param3;
                                  }
                                }
                              }
                            }
                            if (param1 + var8 < clipTop) {
                              continue L10;
                            } else {
                              if (param1 + var8 >= clipBottom) {
                                continue L10;
                              } else {
                                if (param0 - var9 >= clipLeft) {
                                  if (param0 - var9 < clipRight) {
                                    framebuffer[var7 - var9] = param3;
                                  }
                                }
                                if (param0 + var9 < clipLeft) {
                                  continue L10;
                                } else {
                                  if (param0 + var9 >= clipRight) {
                                    continue L10;
                                  } else {
                                    framebuffer[var7 + var9] = param3;
                                    continue L10;
                                  }
                                }
                              }
                            }
                          } else {
                            break L3;
                          }
                        }
                      }
                      return;
                    }
                  }
                }
                return;
              }
            } else {
              return;
            }
          }
          return;
        } else {
          SoftwareRasterizer.a(param0, param1, param3);
          return;
        }
    }

    final static void c() {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$8 = 0;
        int var0 = 0;
        int var1 = stride * field_b - 7;
        while (var0 < var1) {
            incrementValue$0 = var0;
            var0++;
            framebuffer[incrementValue$0] = 0;
            incrementValue$1 = var0;
            var0++;
            framebuffer[incrementValue$1] = 0;
            incrementValue$2 = var0;
            var0++;
            framebuffer[incrementValue$2] = 0;
            incrementValue$3 = var0;
            var0++;
            framebuffer[incrementValue$3] = 0;
            incrementValue$4 = var0;
            var0++;
            framebuffer[incrementValue$4] = 0;
            incrementValue$5 = var0;
            var0++;
            framebuffer[incrementValue$5] = 0;
            incrementValue$6 = var0;
            var0++;
            framebuffer[incrementValue$6] = 0;
            incrementValue$7 = var0;
            var0++;
            framebuffer[incrementValue$7] = 0;
        }
        var1 += 7;
        while (var0 < var1) {
            incrementValue$8 = var0;
            var0++;
            framebuffer[incrementValue$8] = 0;
        }
    }

    final static void d(int param0, int param1, int param2, int param3, int param4) {
        SoftwareRasterizer.c(param0, param1, param2, param4);
        SoftwareRasterizer.c(param0, param1 + param3 - 1, param2, param4);
        SoftwareRasterizer.g(param0, param1, param3, param4);
        SoftwareRasterizer.g(param0 + param2 - 1, param1, param3, param4);
    }

    final static void b(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var9 = 0;
        int var10 = 0;
        int incrementValue$0 = 0;
        int var6;
        int var7;
        int var8;
        int var11;
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
        var6 = 256 - param5;
        var7 = stride - param2;
        var8 = param0 + param1 * stride;
        for (var9 = 0; var9 < param3; var9++) {
          for (var10 = -param2; var10 < 0; var10++) {
            var11 = framebuffer[var8];
            var11 = ((var11 & 16711935) * var6 >> 8 & 16711935) + ((var11 & 65280) * var6 >> 8 & 65280);
            incrementValue$0 = var8;
            var8++;
            framebuffer[incrementValue$0] = param4 + var11;
          }
          var8 = var8 + var7;
        }
    }

    final static void c(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var22 = 0;
        int incrementValue$3 = 0;
        int incrementValue$0 = 0;
        int incrementValue$2 = 0;
        int incrementValue$1 = 0;
        int incrementValue$5 = 0;
        int incrementValue$4 = 0;
        int incrementValue$6 = 0;
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
        if (param4 != 0) {
          if (param4 < 0) {
            param4 = -param4;
          }
          var6 = param0 + param4;
          var7 = param1 + param4;
          var8 = param1;
          if (var8 < clipTop) {
            var8 = clipTop;
          }
          var9 = param1 + param3;
          if (var9 > clipBottom) {
            var9 = clipBottom;
          }
          var10 = param2 - param4 - param4 - 1;
          var11 = var8;
          var12 = param4 * param4;
          var13 = 0;
          var14 = var7 - var11;
          var15 = var14 * var14;
          var16 = var15 - var14;
          if (var7 > var9) {
            var7 = var9;
          }
          L4: while (true) {
            if (var11 >= var7) {
              var14 = var11 - var7;
              var17 = param0;
              if (var17 < clipLeft) {
                var17 = clipLeft;
              }
              var18 = param0 + param2;
              if (var18 > clipRight) {
                var18 = clipRight;
              }
              var19 = var17 + var11 * stride;
              var20 = stride + var17 - var18;
              var21 = param1 + param3 - param4 - 1;
              if (var21 > clipBottom) {
                var21 = clipBottom;
              }
              L8: while (var11 < var21) {
                for (var22 = var17; var22 < var18; var22++) {
                  incrementValue$3 = var19;
                  var19++;
                  framebuffer[incrementValue$3] = param5;
                }
                var11++;
                var19 = var19 + var20;
              }
              var14 = 0;
              var13 = param4;
              var16 = var14 * var14 + var12;
              var15 = var16 - var13;
              var16 = var16 - var14;
              L9: while (var11 < var9) {
                L10: while (var16 > var12) {
                  if (var15 > var12) {
                    incrementValue$0 = var13;
                    var13--;
                    var16 = var16 - (incrementValue$0 + var13);
                    var15 = var15 - (var13 + var13);
                    continue L10;
                  }
                  break;
                }
                var17 = var6 - var13;
                if (var17 < clipLeft) {
                  var17 = clipLeft;
                }
                var18 = var6 + var10 + var13;
                if (var18 > clipRight - 1) {
                  var18 = clipRight - 1;
                }
                var19 = var17 + var11 * stride;
                for (var20 = var17; var20 <= var18; var20++) {
                  incrementValue$2 = var19;
                  var19++;
                  framebuffer[incrementValue$2] = param5;
                }
                var11++;
                var16 = var16 + (var14 + var14);
                incrementValue$1 = var14;
                var14++;
                var15 = var15 + (incrementValue$1 + var14);
              }
              return;
            } else {
              L16: while (true) {
                if (var16 > var12) {
                  if (var15 > var12) {
                    var17 = var6 - var13 + 1;
                    if (var17 < clipLeft) {
                      var17 = clipLeft;
                    }
                    var18 = var6 + var10 + var13;
                    if (var18 > clipRight) {
                      var18 = clipRight;
                    }
                    var19 = var17 + var11 * stride;
                    for (var20 = var17; var20 < var18; var20++) {
                      incrementValue$5 = var19;
                      var19++;
                      framebuffer[incrementValue$5] = param5;
                    }
                    var11++;
                    incrementValue$4 = var14;
                    var14--;
                    var15 = var15 - (incrementValue$4 + var14);
                    var16 = var16 - (var14 + var14);
                    continue L4;
                  }
                }
                var15 = var15 + (var13 + var13);
                incrementValue$6 = var13;
                var13++;
                var16 = var16 + (incrementValue$6 + var13);
                continue L16;
              }
            }
          }
        } else {
          SoftwareRasterizer.a(param0, param1, param2, param3, param5);
          return;
        }
    }

    final static void e(int param0, int param1, int param2, int param3) {
        if (param0 < 0) {
            param0 = 0;
        }
        if (param1 < 0) {
            param1 = 0;
        }
        if (param2 > stride) {
            param2 = stride;
        }
        if (param3 > field_b) {
            param3 = field_b;
        }
        clipLeft = param0;
        clipTop = param1;
        clipRight = param2;
        clipBottom = param3;
        SoftwareRasterizer.b();
    }

    private final static void a(int[] param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int incrementValue$8 = 0;
        int incrementValue$7 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$4 = 0;
        int incrementValue$3 = 0;
        int incrementValue$2 = 0;
        int incrementValue$1 = 0;
        int incrementValue$0 = 0;
        int[] stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        int[] stackIn_39_0 = null;
        int stackIn_39_1 = 0;
        int stackIn_39_2 = 0;
        int[] stackIn_41_0 = null;
        int stackIn_41_1 = 0;
        int[] stackIn_42_0 = null;
        int stackIn_42_1 = 0;
        int stackIn_42_2 = 0;
        int[] stackIn_44_0 = null;
        int stackIn_44_1 = 0;
        int[] stackIn_45_0 = null;
        int stackIn_45_1 = 0;
        int stackIn_45_2 = 0;
        int[] var9;
        int[] var10;
        int[] var11;
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
        int[] var24;
        int[] var25;
        int[] var26;
        int[] var27;
        int[] var28;
        int[] var29;
        L0: {
          if (field_g != null) {
            if (field_g.length >= param8) {
              break L0;
            }
          }
          field_g = new int[param8];
          field_h = new int[param8];
          field_j = new int[param8];
        }
        var27 = field_g;
        var24 = var27;
        var9 = var24;
        var28 = field_h;
        var25 = var28;
        var10 = var25;
        var29 = field_j;
        var26 = var29;
        var11 = var26;
        sf.a(var27, 0, param8);
        sf.a(var28, 0, param8);
        sf.a(var29, 0, param8);
        var12 = 16384 / (2 * param3 + 1);
        var13 = param4 - param3;
        if (var13 < 0) {
          var13 = 0;
        }
        var14 = param7 + var13 * stride;
        var15 = param4 + param3;
        var16 = 0;
        if (var15 >= field_b) {
          var16 = var15 - field_b + 1;
          var15 = field_b - 1;
        }
        var17 = var15 - var13 + 1;
        L4: while (var13 <= var15) {
          for (var18 = 0; var18 < param8; var18++) {
            incrementValue$8 = var14;
            var14++;
            param1 = param0[incrementValue$8];
            var9[var18] = var9[var18] + (param1 >> 16 & 255);
            var10[var18] = var10[var18] + (param1 >> 8 & 255);
            var11[var18] = var11[var18] + (param1 & 255);
          }
          var14 = var14 + param6;
          var13++;
        }
        var14 = var14 + var16 * stride;
        for (var18 = 0; var18 < param8; var18++) {
          incrementValue$7 = param2;
          param2++;
          param0[incrementValue$7] = (var27[var18] / var17 << 16) + (var28[var18] / var17 << 8) + var29[var18] / var17;
        }
        param2 = param2 + param6;
        var13 = 1 - param5;
        var18 = 1 + param3 - param5 - param4;
        if (0 < var18) {
          var18 = 0;
        }
        var19 = param7 + (param4 - param3) * stride;
        if (var13 < var18) {
          var19 = var19 + (var18 - var13) * stride;
        }
        L8: while (var13 < var18) {
          L26: {
            if (var13 + param4 + param5 + param3 >= clipBottom) {
              var14 = var14 + stride;
            } else {
              for (var20 = 0; var20 < param8; var20++) {
                incrementValue$5 = var14;
                var14++;
                param1 = param0[incrementValue$5];
                var9[var20] = var9[var20] + (param1 >> 16 & 255);
                var10[var20] = var10[var20] + (param1 >> 8 & 255);
                var11[var20] = var11[var20] + (param1 & 255);
              }
              var14 = var14 + param6;
              var17++;
              break L26;
            }
          }
          for (var20 = 0; var20 < param8; var20++) {
            var21 = var27[var20] / var17;
            var22 = var28[var20] / var17;
            var23 = var29[var20] / var17;
            incrementValue$6 = param2;
            param2++;
            param0[incrementValue$6] = (var21 << 16) + (var22 << 8) + var23;
          }
          param2 = param2 + param6;
          var13++;
        }
        var18 = field_b - param4 - param5 - param3;
        if (0 < var18) {
          var18 = 0;
        }
        L10: while (var13 < var18) {
          for (var20 = 0; var20 < param8; var20++) {
            incrementValue$4 = var19;
            var19++;
            param1 = param0[incrementValue$4];
            var21 = var27[var20] - (param1 >> 16 & 255);
            stackIn_38_0 = (int[]) (var9);

            stackIn_38_1 = var20;

            if (var21 >= 0) {
              stackIn_39_0 = (int[]) ((Object) stackIn_38_0);
              stackIn_39_1 = stackIn_38_1;
              stackIn_39_2 = var21;
            } else {
              stackIn_39_0 = (int[]) ((Object) stackIn_38_0);
              stackIn_39_1 = stackIn_38_1;
              stackIn_39_2 = 0;
            }
            stackIn_39_0[stackIn_39_1] = stackIn_39_2;
            var21 = var28[var20] - (param1 >> 8 & 255);
            stackIn_41_0 = (int[]) (var10);

            stackIn_41_1 = var20;

            if (var21 >= 0) {
              stackIn_42_0 = (int[]) ((Object) stackIn_41_0);
              stackIn_42_1 = stackIn_41_1;
              stackIn_42_2 = var21;
            } else {
              stackIn_42_0 = (int[]) ((Object) stackIn_41_0);
              stackIn_42_1 = stackIn_41_1;
              stackIn_42_2 = 0;
            }
            stackIn_42_0[stackIn_42_1] = stackIn_42_2;
            var21 = var29[var20] - (param1 & 255);
            stackIn_44_0 = (int[]) (var11);

            stackIn_44_1 = var20;

            if (var21 >= 0) {
              stackIn_45_0 = (int[]) ((Object) stackIn_44_0);
              stackIn_45_1 = stackIn_44_1;
              stackIn_45_2 = var21;
            } else {
              stackIn_45_0 = (int[]) ((Object) stackIn_44_0);
              stackIn_45_1 = stackIn_44_1;
              stackIn_45_2 = 0;
            }
            stackIn_45_0[stackIn_45_1] = stackIn_45_2;
          }
          var19 = var19 + param6;
          for (var20 = 0; var20 < param8; var20++) {
            incrementValue$3 = var14;
            var14++;
            param1 = param0[incrementValue$3];
            var9[var20] = var9[var20] + (param1 >> 16 & 255);
            var10[var20] = var10[var20] + (param1 >> 8 & 255);
            var11[var20] = var11[var20] + (param1 & 255);
          }
          var14 = var14 + param6;
          for (var20 = 0; var20 < param8; var20++) {
            var21 = var27[var20] * var12 >> 14;
            var22 = var28[var20] * var12 >> 14;
            var23 = var29[var20] * var12 >> 14;
            if (var21 > 255) {
              var21 = 255;
            }
            if (var22 > 255) {
              var22 = 255;
            }
            if (var23 > 255) {
              var23 = 255;
            }
            incrementValue$2 = param2;
            param2++;
            param0[incrementValue$2] = (var21 << 16) + (var22 << 8) + var23;
          }
          param2 = param2 + param6;
          var13++;
        }
        L11: while (var13 < 0) {
          for (var20 = 0; var20 < param8; var20++) {
            incrementValue$1 = var19;
            var19++;
            param1 = param0[incrementValue$1];
            var9[var20] = var9[var20] - (param1 >> 16 & 255);
            var10[var20] = var10[var20] - (param1 >> 8 & 255);
            var11[var20] = var11[var20] - (param1 & 255);
          }
          var19 = var19 + param6;
          var17--;
          for (var20 = 0; var20 < param8; var20++) {
            var21 = var27[var20] / var17;
            var22 = var28[var20] / var17;
            var23 = var29[var20] / var17;
            if (var21 >= 0) {
              if (var21 > 255) {
                var21 = 255;
              }
            } else {
              var21 = 0;
            }
            if (var22 >= 0) {
              if (var22 > 255) {
                var22 = 255;
              }
            } else {
              var22 = 0;
            }
            if (var23 >= 0) {
              if (var23 > 255) {
                var23 = 255;
              }
            } else {
              var23 = 0;
            }
            incrementValue$0 = param2;
            param2++;
            param0[incrementValue$0] = (var21 << 16) + (var22 << 8) + var23;
          }
          param2 = param2 + param6;
          var13++;
        }
    }

    final static void b(int[] param0) {
        clipLeft = param0[0];
        clipTop = param0[1];
        clipRight = param0[2];
        clipBottom = param0[3];
        SoftwareRasterizer.b();
    }

    private final static void g(int param0, int param1, int param2, int param3) {
        int var4 = 0;
        int var5 = 0;
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
            var4 = param0 + param1 * stride;
            var5 = 0;
            while (var5 < param2) {
                framebuffer[var4] = param3;
                var5++;
                var4 = var4 + stride;
            }
            return;
        }
    }

    final static void a(int[] param0, int param1, int param2) {
        framebuffer = param0;
        stride = param1;
        field_b = param2;
        SoftwareRasterizer.e(0, 0, param1, param2);
    }

    static {
        clipBottom = 0;
        clipRight = 0;
        clipTop = 0;
        clipLeft = 0;
    }
}
