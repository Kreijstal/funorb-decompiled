/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pi extends db {
    final void g(int param0, int param1) {
        int var9 = 0;
        param0 = param0 + (this.field_r - this.field_p - this.field_s);
        param1 = param1 + this.field_w;
        int var3 = param0 + param1 * lf.field_f;
        int var4 = this.field_p - 1;
        int var5 = this.field_u;
        int var6 = this.field_p;
        int var7 = lf.field_f - var6;
        int var8 = var6 + var6;
        if (param1 < lf.field_c) {
            var9 = lf.field_c - param1;
            var5 = var5 - var9;
            param1 = lf.field_c;
            var4 = var4 + var9 * var6;
            var3 = var3 + var9 * lf.field_f;
        }
        if (param1 + var5 > lf.field_h) {
            var5 = var5 - (param1 + var5 - lf.field_h);
        }
        if (param0 < lf.field_g) {
            var9 = lf.field_g - param0;
            var6 = var6 - var9;
            param0 = lf.field_g;
            var4 = var4 - var9;
            var3 = var3 + var9;
            var8 = var8 - var9;
            var7 = var7 + var9;
        }
        if (param0 + var6 > lf.field_e) {
            var9 = param0 + var6 - lf.field_e;
            var6 = var6 - var9;
            var8 = var8 - var9;
            var7 = var7 + var9;
        }
        if (var6 <= 0 || var5 <= 0) {
            return;
        }
        pi.e(lf.field_b, this.field_y, 0, var4, var3, var6, var5, var7, var8);
    }

    final void b(int param0, int param1) {
        int var9 = 0;
        param0 = param0 + this.field_s;
        param1 = param1 + this.field_w;
        int var3 = param0 + param1 * lf.field_f;
        int var4 = 0;
        int var5 = this.field_u;
        int var6 = this.field_p;
        int var7 = lf.field_f - var6;
        int var8 = 0;
        if (param1 < lf.field_c) {
            var9 = lf.field_c - param1;
            var5 = var5 - var9;
            param1 = lf.field_c;
            var4 = var4 + var9 * var6;
            var3 = var3 + var9 * lf.field_f;
        }
        if (param1 + var5 > lf.field_h) {
            var5 = var5 - (param1 + var5 - lf.field_h);
        }
        if (param0 < lf.field_g) {
            var9 = lf.field_g - param0;
            var6 = var6 - var9;
            param0 = lf.field_g;
            var4 = var4 + var9;
            var3 = var3 + var9;
            var8 = var8 + var9;
            var7 = var7 + var9;
        }
        if (param0 + var6 > lf.field_e) {
            var9 = param0 + var6 - lf.field_e;
            var6 = var6 - var9;
            var8 = var8 + var9;
            var7 = var7 + var9;
        }
        if (var6 <= 0 || var5 <= 0) {
            return;
        }
        pi.d(lf.field_b, this.field_y, 0, var4, var3, var6, var5, var7, var8);
    }

    private final static void b(int param0, int param1, int param2, int[] param3, int[] param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13) {
        int incrementValue$11 = 0;
        int incrementValue$12 = 0;
        int var14;
        param8 = -param10;
        L0: while (true) {
          if (param8 >= 0) {
            return;
          } else {
            param6 = -param9;
            L1: while (true) {
              if (param6 >= 0) {
                param7 = param7 + param11;
                param5 = param5 + param12;
                param8++;
                continue L0;
              } else {
                incrementValue$11 = param5;
                param5++;
                param0 = param4[incrementValue$11];
                if (param0 == 0) {
                  param7++;
                  param6++;
                  continue L1;
                } else {
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
    }

    final void d(int param0, int param1, int param2) {
        int var10 = 0;
        param0 = param0 + this.field_s;
        param1 = param1 + this.field_w;
        int var4 = param0 + param1 * lf.field_f;
        int var5 = 0;
        int var6 = this.field_u;
        int var7 = this.field_p;
        int var8 = lf.field_f - var7;
        int var9 = 0;
        if (param1 < lf.field_c) {
            var10 = lf.field_c - param1;
            var6 = var6 - var10;
            param1 = lf.field_c;
            var5 = var5 + var10 * var7;
            var4 = var4 + var10 * lf.field_f;
        }
        if (param1 + var6 > lf.field_h) {
            var6 = var6 - (param1 + var6 - lf.field_h);
        }
        if (param0 < lf.field_g) {
            var10 = lf.field_g - param0;
            var7 = var7 - var10;
            param0 = lf.field_g;
            var5 = var5 + var10;
            var4 = var4 + var10;
            var9 = var9 + var10;
            var8 = var8 + var10;
        }
        if (param0 + var7 > lf.field_e) {
            var10 = param0 + var7 - lf.field_e;
            var7 = var7 - var10;
            var9 = var9 + var10;
            var8 = var8 + var10;
        }
        if (var7 <= 0 || var6 <= 0) {
            return;
        }
        pi.b(0, 0, 0, lf.field_b, this.field_y, var5, 0, var4, 0, var7, var6, var8, var9, param2);
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

    final void b(int param0, int param1, int param2) {
        int var10 = 0;
        param0 = param0 + this.field_s;
        param1 = param1 + this.field_w;
        int var4 = param0 + param1 * lf.field_f;
        int var5 = 0;
        int var6 = this.field_u;
        int var7 = this.field_p;
        int var8 = lf.field_f - var7;
        int var9 = 0;
        if (param1 < lf.field_c) {
            var10 = lf.field_c - param1;
            var6 = var6 - var10;
            param1 = lf.field_c;
            var5 = var5 + var10 * var7;
            var4 = var4 + var10 * lf.field_f;
        }
        if (param1 + var6 > lf.field_h) {
            var6 = var6 - (param1 + var6 - lf.field_h);
        }
        if (param0 < lf.field_g) {
            var10 = lf.field_g - param0;
            var7 = var7 - var10;
            param0 = lf.field_g;
            var5 = var5 + var10;
            var4 = var4 + var10;
            var9 = var9 + var10;
            var8 = var8 + var10;
        }
        if (param0 + var7 > lf.field_e) {
            var10 = param0 + var7 - lf.field_e;
            var7 = var7 - var10;
            var9 = var9 + var10;
            var8 = var8 + var10;
        }
        if (var7 <= 0 || var6 <= 0) {
            return;
        }
        pi.d(lf.field_b, this.field_y, 0, var5, var4, var7, var6, var8, var9, param2);
    }

    final void e(int param0, int param1, int param2) {
        int var10 = 0;
        param0 = param0 + this.field_s;
        param1 = param1 + this.field_w;
        int var4 = param0 + param1 * lf.field_f;
        int var5 = 0;
        int var6 = this.field_u;
        int var7 = this.field_p;
        int var8 = lf.field_f - var7;
        int var9 = 0;
        if (param1 < lf.field_c) {
            var10 = lf.field_c - param1;
            var6 = var6 - var10;
            param1 = lf.field_c;
            var5 = var5 + var10 * var7;
            var4 = var4 + var10 * lf.field_f;
        }
        if (param1 + var6 > lf.field_h) {
            var6 = var6 - (param1 + var6 - lf.field_h);
        }
        if (param0 < lf.field_g) {
            var10 = lf.field_g - param0;
            var7 = var7 - var10;
            param0 = lf.field_g;
            var5 = var5 + var10;
            var4 = var4 + var10;
            var9 = var9 + var10;
            var8 = var8 + var10;
        }
        if (param0 + var7 > lf.field_e) {
            var10 = param0 + var7 - lf.field_e;
            var7 = var7 - var10;
            var9 = var9 + var10;
            var8 = var8 + var10;
        }
        if (var7 <= 0 || var6 <= 0) {
            return;
        }
        pi.b(lf.field_b, this.field_y, 0, var5, var4, 0, 0, var7, var6, var8, var9, param2);
    }

    private final static void d(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
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
          } else {
            var11 = var9;
            L1: while (true) {
              if (var11 >= 0) {
                param4 = param4 + param7;
                param3 = param3 + param8;
                var10++;
                continue L0;
              } else {
                incrementValue$11 = param3;
                param3++;
                param2 = param1[incrementValue$11];
                var12 = param2 >>> 24;
                if (var12 == 0) {
                  param4++;
                  var11++;
                  continue L1;
                } else {
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
    }

    private final static void e(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
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
          } else {
            var11 = var9;
            L1: while (true) {
              if (var11 >= 0) {
                param4 = param4 + param7;
                param3 = param3 + param8;
                var10++;
                continue L0;
              } else {
                incrementValue$11 = param3;
                param3--;
                param2 = param1[incrementValue$11];
                var12 = param2 >>> 24;
                if (var12 == 0) {
                  param4++;
                  var11++;
                  continue L1;
                } else {
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
    }

    private final static void c(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
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
          } else {
            var16 = var14;
            L1: while (true) {
              if (var16 >= 0) {
                param4 = param4 + param7;
                param3 = param3 + param8;
                var15++;
                continue L0;
              } else {
                incrementValue$0 = param3;
                param3++;
                param2 = param1[incrementValue$0];
                var17 = param2 >>> 24;
                if (var17 == 0) {
                  param4++;
                  var16++;
                  continue L1;
                } else {
                  L2: {
                    L3: {
                      var19 = param2 >> 16 & 255;
                      var20 = param2 >> 8 & 255;
                      var21 = param2 & 255;
                      if (var19 != var20) {
                        break L3;
                      } else {
                        if (var20 != var21) {
                          break L3;
                        } else {
                          if (var19 > 128) {
                            var18 = (var10 * (256 - var19) + 255 * (var19 - 128) >> 7 << 16) + (var11 * (256 - var20) + 255 * (var20 - 128) >> 7 << 8) + (var12 * (256 - var21) + 255 * (var21 - 128) >> 7);
                            break L2;
                          } else {
                            var18 = (var19 * var10 >> 7 << 16) + (var20 * var11 >> 7 << 8) + (var21 * var12 >> 7);
                            break L2;
                          }
                        }
                      }
                    }
                    var18 = param2;
                    break L2;
                  }
                  var22 = 256 - var17;
                  var23 = param0[param4];
                  incrementValue$1 = param4;
                  param4++;
                  param0[incrementValue$1] = ((var18 & 16711935) * var17 + (var23 & 16711935) * var22 & -16711936) + ((var18 & 65280) * var17 + (var23 & 65280) * var22 & 16711680) >>> 8;
                  var16++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    final void a(int param0, int param1, int param2) {
        int var10 = 0;
        param0 = param0 + this.field_s;
        param1 = param1 + this.field_w;
        int var4 = param0 + param1 * lf.field_f;
        int var5 = 0;
        int var6 = this.field_u;
        int var7 = this.field_p;
        int var8 = lf.field_f - var7;
        int var9 = 0;
        if (param1 < lf.field_c) {
            var10 = lf.field_c - param1;
            var6 = var6 - var10;
            param1 = lf.field_c;
            var5 = var5 + var10 * var7;
            var4 = var4 + var10 * lf.field_f;
        }
        if (param1 + var6 > lf.field_h) {
            var6 = var6 - (param1 + var6 - lf.field_h);
        }
        if (param0 < lf.field_g) {
            var10 = lf.field_g - param0;
            var7 = var7 - var10;
            param0 = lf.field_g;
            var5 = var5 + var10;
            var4 = var4 + var10;
            var9 = var9 + var10;
            var8 = var8 + var10;
        }
        if (param0 + var7 > lf.field_e) {
            var10 = param0 + var7 - lf.field_e;
            var7 = var7 - var10;
            var9 = var9 + var10;
            var8 = var8 + var10;
        }
        if (var7 <= 0 || var6 <= 0) {
            return;
        }
        pi.c(lf.field_b, this.field_y, 0, var5, var4, var7, var6, var8, var9, param2);
    }

    final void c(int param0, int param1) {
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
        L0: {
          var3 = this.field_p >> 2;
          var4 = this.field_u >> 2;
          param0 = param0 + this.field_s / 4;
          param1 = param1 + this.field_w / 4;
          if (param0 >= lf.field_g) {
            stackIn_3_0 = 0;
            break L0;
          } else {
            stackIn_3_0 = lf.field_g - param0 << 2;
            break L0;
          }
        }
        L1: {
          var5 = stackIn_3_0;
          if (param0 + var3 <= lf.field_e) {
            stackIn_6_0 = this.field_p - 4;
            break L1;
          } else {
            stackIn_6_0 = (lf.field_e - param0 << 2) - 4;
            break L1;
          }
        }
        L2: {
          var6 = stackIn_6_0;
          if (param1 >= lf.field_c) {
            stackIn_9_0 = 0;
            break L2;
          } else {
            stackIn_9_0 = lf.field_c - param1 << 2;
            break L2;
          }
        }
        L3: {
          var7 = stackIn_9_0;
          if (param1 + var4 <= lf.field_h) {
            stackIn_12_0 = this.field_u - 4;
            break L3;
          } else {
            stackIn_12_0 = (lf.field_h - param1 << 2) - 4;
            break L3;
          }
        }
        var8 = stackIn_12_0;
        var23 = new int[16];
        var22 = var23;
        var9 = var22;
        var10 = var7;
        L4: while (true) {
          if (var10 > var8) {
            return;
          } else {
            var11 = var5;
            L5: while (true) {
              if (var11 > var6) {
                var10 += 4;
                continue L4;
              } else {
                var12 = var10 * this.field_p + var11;
                var13 = (param1 + (var10 >> 2)) * lf.field_f + (param0 + (var11 >> 2));
                var14 = 0;
                L6: while (true) {
                  if (var14 >= 4) {
                    var23 = var22;
                    var14 = 0;
                    var15 = 0;
                    var16 = 0;
                    var17 = 0;
                    var18 = 0;
                    var19 = 0;
                    L7: while (true) {
                      if (var19 >= 16) {
                        if (var15 != 0) {
                          var16 = (var16 / var15 << 16) + var18 / var15;
                          var17 = var17 / var15 << 8;
                          var19 = var15 >> 4;
                          var20 = 256 - var19;
                          var21 = lf.field_b[var13];
                          lf.field_b[var13] = (var19 * var16 + var20 * (var21 & 16711935) & -16711936) + (var19 * var17 + var20 * (var21 & 65280) & 16711680) >>> 8;
                          var11 += 4;
                          continue L5;
                        } else {
                          var11 += 4;
                          continue L5;
                        }
                      } else {
                        var14 = var23[var19] >>> 24;
                        var15 = var15 + var14;
                        var16 = var16 + var14 * (var23[var19] >> 16 & 255);
                        var17 = var17 + var14 * (var23[var19] >> 8 & 255);
                        var18 = var18 + var14 * (var23[var19] & 255);
                        var19++;
                        continue L7;
                      }
                    }
                  } else {
                    var15 = 0;
                    L8: while (true) {
                      if (var15 >= 4) {
                        var14++;
                        continue L6;
                      } else {
                        var9[(var14 << 2) + var15] = this.field_y[var12 + var14 * this.field_p + var15];
                        var15++;
                        continue L8;
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    final void d(int param0, int param1) {
        int var9 = 0;
        param0 = param0 + this.field_s;
        param1 = param1 + this.field_w;
        int var3 = param0 + param1 * lf.field_f;
        int var4 = 0;
        int var5 = this.field_u;
        int var6 = this.field_p;
        int var7 = lf.field_f - var6;
        int var8 = 0;
        if (param1 < lf.field_c) {
            var9 = lf.field_c - param1;
            var5 = var5 - var9;
            param1 = lf.field_c;
            var4 = var4 + var9 * var6;
            var3 = var3 + var9 * lf.field_f;
        }
        if (param1 + var5 > lf.field_h) {
            var5 = var5 - (param1 + var5 - lf.field_h);
        }
        if (param0 < lf.field_g) {
            var9 = lf.field_g - param0;
            var6 = var6 - var9;
            param0 = lf.field_g;
            var4 = var4 + var9;
            var3 = var3 + var9;
            var8 = var8 + var9;
            var7 = var7 + var9;
        }
        if (param0 + var6 > lf.field_e) {
            var9 = param0 + var6 - lf.field_e;
            var6 = var6 - var9;
            var8 = var8 + var9;
            var7 = var7 + var9;
        }
        if (var6 <= 0 || var5 <= 0) {
            return;
        }
        pi.d(lf.field_b, this.field_y, 0, var4, var3, var6, var5, var7, var8);
    }

    pi(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6) {
        super(param0, param1, param2, param3, param4, param5, param6);
    }

    final void f(int param0, int param1) {
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
        L0: {
          var3 = this.field_p >> 1;
          var4 = this.field_u >> 1;
          param0 = param0 + this.field_s / 2;
          param1 = param1 + this.field_w / 2;
          if (param0 >= lf.field_g) {
            stackIn_3_0 = 0;
            break L0;
          } else {
            stackIn_3_0 = lf.field_g - param0 << 1;
            break L0;
          }
        }
        L1: {
          var5 = stackIn_3_0;
          if (param0 + var3 <= lf.field_e) {
            stackIn_6_0 = this.field_p - 2;
            break L1;
          } else {
            stackIn_6_0 = (lf.field_e - param0 << 1) - 2;
            break L1;
          }
        }
        L2: {
          var6 = stackIn_6_0;
          if (param1 >= lf.field_c) {
            stackIn_9_0 = 0;
            break L2;
          } else {
            stackIn_9_0 = lf.field_c - param1 << 1;
            break L2;
          }
        }
        L3: {
          var7 = stackIn_9_0;
          if (param1 + var4 <= lf.field_h) {
            stackIn_12_0 = this.field_u - 2;
            break L3;
          } else {
            stackIn_12_0 = (lf.field_h - param1 << 1) - 2;
            break L3;
          }
        }
        var8 = stackIn_12_0;
        var9 = var7;
        L4: while (true) {
          if (var9 > var8) {
            return;
          } else {
            var10 = var9 * this.field_p + var5;
            var11 = (param1 + (var9 >> 1)) * lf.field_f + (param0 + (var5 >> 1));
            var12 = var5;
            L5: while (true) {
              if (var12 > var6) {
                var9 += 2;
                continue L4;
              } else {
                var13 = 0;
                var14 = 0;
                var15 = 0;
                var16 = 0;
                var17 = 0;
                var18 = 0;
                var19 = 0;
                L6: while (true) {
                  if (var19 >= 4) {
                    if (var18 != 0) {
                      var15 = (var15 / var18 << 16) + var17 / var18;
                      var16 = var16 / var18 << 8;
                      var19 = var18 >> 2;
                      var20 = 256 - var19;
                      var21 = lf.field_b[var11];
                      lf.field_b[var11] = (var19 * var15 + var20 * (var21 & 16711935) & -16711936) + (var19 * var16 + var20 * (var21 & 65280) & 16711680) >>> 8;
                      var12 += 2;
                      var11++;
                      var10 += 2;
                      continue L5;
                    } else {
                      var12 += 2;
                      var11++;
                      var10 += 2;
                      continue L5;
                    }
                  } else {
                    L7: {
                      stackIn_20_0 = this.field_y;

                      stackIn_20_1 = var10 + (var19 & 1);

                      if ((var19 & 2) != 0) {
                        stackIn_21_0 = (int[]) ((Object) stackIn_20_0);
                        stackIn_21_1 = stackIn_20_1;
                        stackIn_21_2 = 0;
                        break L7;
                      } else {
                        stackIn_21_0 = (int[]) ((Object) stackIn_20_0);
                        stackIn_21_1 = stackIn_20_1;
                        stackIn_21_2 = this.field_p;
                        break L7;
                      }
                    }
                    var13 = stackIn_21_0[stackIn_21_1 + stackIn_21_2];
                    var14 = var13 >>> 24;
                    var18 = var18 + var14;
                    var15 = var15 + var14 * (var13 >> 16 & 255);
                    var16 = var16 + var14 * (var13 >> 8 & 255);
                    var17 = var17 + var14 * (var13 & 255);
                    var19++;
                    continue L6;
                  }
                }
              }
            }
          }
        }
    }

    private final static void b(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11) {
        int incrementValue$11 = 0;
        int incrementValue$12 = 0;
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
          } else {
            param5 = -param7;
            L1: while (true) {
              if (param5 >= 0) {
                param4 = param4 + param9;
                param3 = param3 + param10;
                param6++;
                continue L0;
              } else {
                incrementValue$11 = param3;
                param3++;
                param2 = param1[incrementValue$11];
                var14 = param2 >>> 24;
                param2 = param2 & 16777215;
                if (var14 == 0) {
                  param4++;
                  param5++;
                  continue L1;
                } else {
                  L2: {
                    var15 = 0;
                    if (param2 >> 8 != (param2 & 65535)) {
                      var15 = param2;
                      break L2;
                    } else {
                      param2 = param2 & 255;
                      var15 = (param2 * var12 >> 8 & 16711934) + (param2 * var13 & 65280) + 1;
                      break L2;
                    }
                  }
                  var16 = 256 - var14;
                  var17 = param0[param4];
                  incrementValue$12 = param4;
                  param4++;
                  param0[incrementValue$12] = ((var15 & 16711935) * var14 + (var17 & 16711935) * var16 & -16711936) + ((var15 & 65280) * var14 + (var17 & 65280) * var16 & 16711680) >>> 8;
                  param5++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    pi(int param0, int param1) {
        super(param0, param1);
    }
}
