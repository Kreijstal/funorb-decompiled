/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rd extends ll {
    final void b(int param0, int param1, int param2) {
        int var10 = 0;
        param0 = param0 + this.field_u;
        param1 = param1 + this.field_p;
        int var4 = param0 + param1 * vp.field_i;
        int var5 = 0;
        int var6 = this.field_n;
        int var7 = this.field_r;
        int var8 = vp.field_i - var7;
        int var9 = 0;
        if (param1 < vp.field_f) {
            var10 = vp.field_f - param1;
            var6 = var6 - var10;
            param1 = vp.field_f;
            var5 = var5 + var10 * var7;
            var4 = var4 + var10 * vp.field_i;
        }
        if (param1 + var6 > vp.field_d) {
            var6 = var6 - (param1 + var6 - vp.field_d);
        }
        if (param0 < vp.field_b) {
            var10 = vp.field_b - param0;
            var7 = var7 - var10;
            param0 = vp.field_b;
            var5 = var5 + var10;
            var4 = var4 + var10;
            var9 = var9 + var10;
            var8 = var8 + var10;
        }
        if (param0 + var7 > vp.field_k) {
            var10 = param0 + var7 - vp.field_k;
            var7 = var7 - var10;
            var9 = var9 + var10;
            var8 = var8 + var10;
        }
        if (var7 <= 0 || var6 <= 0) {
            return;
        }
        rd.c(vp.field_j, this.field_x, 0, var5, var4, var7, var6, var8, var9, param2);
    }

    final void d(int param0, int param1, int param2) {
        int var10 = 0;
        param0 = param0 + this.field_u;
        param1 = param1 + this.field_p;
        int var4 = param0 + param1 * vp.field_i;
        int var5 = 0;
        int var6 = this.field_n;
        int var7 = this.field_r;
        int var8 = vp.field_i - var7;
        int var9 = 0;
        if (param1 < vp.field_f) {
            var10 = vp.field_f - param1;
            var6 = var6 - var10;
            param1 = vp.field_f;
            var5 = var5 + var10 * var7;
            var4 = var4 + var10 * vp.field_i;
        }
        if (param1 + var6 > vp.field_d) {
            var6 = var6 - (param1 + var6 - vp.field_d);
        }
        if (param0 < vp.field_b) {
            var10 = vp.field_b - param0;
            var7 = var7 - var10;
            param0 = vp.field_b;
            var5 = var5 + var10;
            var4 = var4 + var10;
            var9 = var9 + var10;
            var8 = var8 + var10;
        }
        if (param0 + var7 > vp.field_k) {
            var10 = param0 + var7 - vp.field_k;
            var7 = var7 - var10;
            var9 = var9 + var10;
            var8 = var8 + var10;
        }
        if (var7 <= 0 || var6 <= 0) {
            return;
        }
        rd.b(0, 0, 0, vp.field_j, this.field_x, var5, 0, var4, 0, var7, var6, var8, var9, param2);
    }

    final void b(int param0, int param1) {
        int var9 = 0;
        param0 = param0 + this.field_u;
        param1 = param1 + this.field_p;
        int var3 = param0 + param1 * vp.field_i;
        int var4 = 0;
        int var5 = this.field_n;
        int var6 = this.field_r;
        int var7 = vp.field_i - var6;
        int var8 = 0;
        if (param1 < vp.field_f) {
            var9 = vp.field_f - param1;
            var5 = var5 - var9;
            param1 = vp.field_f;
            var4 = var4 + var9 * var6;
            var3 = var3 + var9 * vp.field_i;
        }
        if (param1 + var5 > vp.field_d) {
            var5 = var5 - (param1 + var5 - vp.field_d);
        }
        if (param0 < vp.field_b) {
            var9 = vp.field_b - param0;
            var6 = var6 - var9;
            param0 = vp.field_b;
            var4 = var4 + var9;
            var3 = var3 + var9;
            var8 = var8 + var9;
            var7 = var7 + var9;
        }
        if (param0 + var6 > vp.field_k) {
            var9 = param0 + var6 - vp.field_k;
            var6 = var6 - var9;
            var8 = var8 + var9;
            var7 = var7 + var9;
        }
        if (var6 <= 0 || var5 <= 0) {
            return;
        }
        rd.c(vp.field_j, this.field_x, 0, var4, var3, var6, var5, var7, var8);
    }

    rd(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6) {
        super(param0, param1, param2, param3, param4, param5, param6);
    }

    rd(int param0, int param1) {
        super(param0, param1);
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
        L0: {
          var3 = this.field_r >> 1;
          var4 = this.field_n >> 1;
          param0 = param0 + this.field_u / 2;
          param1 = param1 + this.field_p / 2;
          if (param0 >= vp.field_b) {
            stackIn_3_0 = 0;
            break L0;
          } else {
            stackIn_3_0 = vp.field_b - param0 << 1;
            break L0;
          }
        }
        L1: {
          var5 = stackIn_3_0;
          if (param0 + var3 <= vp.field_k) {
            stackIn_6_0 = this.field_r - 2;
            break L1;
          } else {
            stackIn_6_0 = (vp.field_k - param0 << 1) - 2;
            break L1;
          }
        }
        L2: {
          var6 = stackIn_6_0;
          if (param1 >= vp.field_f) {
            stackIn_9_0 = 0;
            break L2;
          } else {
            stackIn_9_0 = vp.field_f - param1 << 1;
            break L2;
          }
        }
        L3: {
          var7 = stackIn_9_0;
          if (param1 + var4 <= vp.field_d) {
            stackIn_12_0 = this.field_n - 2;
            break L3;
          } else {
            stackIn_12_0 = (vp.field_d - param1 << 1) - 2;
            break L3;
          }
        }
        var8 = stackIn_12_0;
        var9 = var7;
        L4: while (true) {
          if (var9 > var8) {
            return;
          } else {
            var10 = var9 * this.field_r + var5;
            var11 = (param1 + (var9 >> 1)) * vp.field_i + (param0 + (var5 >> 1));
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
                      var21 = vp.field_j[var11];
                      vp.field_j[var11] = (var19 * var15 + var20 * (var21 & 16711935) & -16711936) + (var19 * var16 + var20 * (var21 & 65280) & 16711680) >>> 8;
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
                      stackIn_20_0 = this.field_x;

                      stackIn_20_1 = var10 + (var19 & 1);

                      if ((var19 & 2) != 0) {
                        stackIn_21_0 = (int[]) ((Object) stackIn_20_0);
                        stackIn_21_1 = stackIn_20_1;
                        stackIn_21_2 = 0;
                        break L7;
                      } else {
                        stackIn_21_0 = (int[]) ((Object) stackIn_20_0);
                        stackIn_21_1 = stackIn_20_1;
                        stackIn_21_2 = this.field_r;
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

    final void a(int param0, int param1, int param2) {
        int var10 = 0;
        param0 = param0 + this.field_u;
        param1 = param1 + this.field_p;
        int var4 = param0 + param1 * vp.field_i;
        int var5 = 0;
        int var6 = this.field_n;
        int var7 = this.field_r;
        int var8 = vp.field_i - var7;
        int var9 = 0;
        if (param1 < vp.field_f) {
            var10 = vp.field_f - param1;
            var6 = var6 - var10;
            param1 = vp.field_f;
            var5 = var5 + var10 * var7;
            var4 = var4 + var10 * vp.field_i;
        }
        if (param1 + var6 > vp.field_d) {
            var6 = var6 - (param1 + var6 - vp.field_d);
        }
        if (param0 < vp.field_b) {
            var10 = vp.field_b - param0;
            var7 = var7 - var10;
            param0 = vp.field_b;
            var5 = var5 + var10;
            var4 = var4 + var10;
            var9 = var9 + var10;
            var8 = var8 + var10;
        }
        if (param0 + var7 > vp.field_k) {
            var10 = param0 + var7 - vp.field_k;
            var7 = var7 - var10;
            var9 = var9 + var10;
            var8 = var8 + var10;
        }
        if (var7 <= 0 || var6 <= 0) {
            return;
        }
        rd.d(vp.field_j, this.field_x, 0, var5, var4, var7, var6, var8, var9, param2);
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

    final void c(int param0, int param1) {
        int var9 = 0;
        param0 = param0 + this.field_u;
        param1 = param1 + this.field_p;
        int var3 = param0 + param1 * vp.field_i;
        int var4 = 0;
        int var5 = this.field_n;
        int var6 = this.field_r;
        int var7 = vp.field_i - var6;
        int var8 = 0;
        if (param1 < vp.field_f) {
            var9 = vp.field_f - param1;
            var5 = var5 - var9;
            param1 = vp.field_f;
            var4 = var4 + var9 * var6;
            var3 = var3 + var9 * vp.field_i;
        }
        if (param1 + var5 > vp.field_d) {
            var5 = var5 - (param1 + var5 - vp.field_d);
        }
        if (param0 < vp.field_b) {
            var9 = vp.field_b - param0;
            var6 = var6 - var9;
            param0 = vp.field_b;
            var4 = var4 + var9;
            var3 = var3 + var9;
            var8 = var8 + var9;
            var7 = var7 + var9;
        }
        if (param0 + var6 > vp.field_k) {
            var9 = param0 + var6 - vp.field_k;
            var6 = var6 - var9;
            var8 = var8 + var9;
            var7 = var7 + var9;
        }
        if (var6 <= 0 || var5 <= 0) {
            return;
        }
        rd.c(vp.field_j, this.field_x, 0, var4, var3, var6, var5, var7, var8);
    }
}
