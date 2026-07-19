/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sj extends dd {
    final void b(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        L0: {
          param0 = param0 + this.field_q;
          param1 = param1 + (this.field_r - this.field_t - this.field_v);
          var3 = param0 + (param1 + this.field_t - 1) * gb.field_d;
          var4 = 0;
          var5 = this.field_t;
          var6 = this.field_w;
          var7 = -gb.field_d - var6;
          var8 = 0;
          if (param1 >= gb.field_b) {
            break L0;
          } else {
            var5 = var5 - (gb.field_b - param1);
            param1 = gb.field_b;
            break L0;
          }
        }
        L1: {
          if (param1 + var5 <= gb.field_i) {
            break L1;
          } else {
            var9 = param1 + var5 - gb.field_i;
            var5 = var5 - var9;
            var3 = var3 - var9 * gb.field_d;
            var4 = var4 + var9 * var6;
            break L1;
          }
        }
        L2: {
          if (param0 >= gb.field_l) {
            break L2;
          } else {
            var9 = gb.field_l - param0;
            var6 = var6 - var9;
            param0 = gb.field_l;
            var4 = var4 + var9;
            var3 = var3 + var9;
            var8 = var8 + var9;
            var7 = var7 + var9;
            break L2;
          }
        }
        L3: {
          if (param0 + var6 <= gb.field_h) {
            break L3;
          } else {
            var9 = param0 + var6 - gb.field_h;
            var6 = var6 - var9;
            var8 = var8 + var9;
            var7 = var7 + var9;
            break L3;
          }
        }
        L4: {
          if (var6 <= 0) {
            break L4;
          } else {
            if (var5 > 0) {
              sj.e(gb.field_a, this.field_B, 0, var4, var3, var6, var5, var7, var8);
              return;
            } else {
              break L4;
            }
          }
        }
    }

    private final static void e(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int incrementValue$66 = 0;
        int incrementValue$67 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
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
                incrementValue$66 = param3;
                param3++;
                param2 = param1[incrementValue$66];
                var12 = param2 >>> 24;
                if (var12 == 0) {
                  param4++;
                  var11++;
                  continue L1;
                } else {
                  var13 = 256 - var12;
                  var14 = param0[param4];
                  incrementValue$67 = param4;
                  param4++;
                  param0[incrementValue$67] = ((param2 & 16711935) * var12 + (var14 & 16711935) * var13 & -16711936) + ((param2 & 65280) * var12 + (var14 & 65280) * var13 & 16711680) >>> 8;
                  var11++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    private final static void d(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int incrementValue$66 = 0;
        int incrementValue$67 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
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
                incrementValue$66 = param3;
                param3--;
                param2 = param1[incrementValue$66];
                var12 = param2 >>> 24;
                if (var12 == 0) {
                  param4++;
                  var11++;
                  continue L1;
                } else {
                  var13 = 256 - var12;
                  var14 = param0[param4];
                  incrementValue$67 = param4;
                  param4++;
                  param0[incrementValue$67] = ((param2 & 16711935) * var12 + (var14 & 16711935) * var13 & -16711936) + ((param2 & 65280) * var12 + (var14 & 65280) * var13 & 16711680) >>> 8;
                  var11++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    final void f(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (param2 != 256) {
          L0: {
            param0 = param0 + this.field_q;
            param1 = param1 + this.field_v;
            var4 = param0 + param1 * gb.field_d;
            var5 = 0;
            var6 = this.field_t;
            var7 = this.field_w;
            var8 = gb.field_d - var7;
            var9 = 0;
            if (param1 >= gb.field_b) {
              break L0;
            } else {
              var10 = gb.field_b - param1;
              var6 = var6 - var10;
              param1 = gb.field_b;
              var5 = var5 + var10 * var7;
              var4 = var4 + var10 * gb.field_d;
              break L0;
            }
          }
          L1: {
            if (param1 + var6 <= gb.field_i) {
              break L1;
            } else {
              var6 = var6 - (param1 + var6 - gb.field_i);
              break L1;
            }
          }
          L2: {
            if (param0 >= gb.field_l) {
              break L2;
            } else {
              var10 = gb.field_l - param0;
              var7 = var7 - var10;
              param0 = gb.field_l;
              var5 = var5 + var10;
              var4 = var4 + var10;
              var9 = var9 + var10;
              var8 = var8 + var10;
              break L2;
            }
          }
          L3: {
            if (param0 + var7 <= gb.field_h) {
              break L3;
            } else {
              var10 = param0 + var7 - gb.field_h;
              var7 = var7 - var10;
              var9 = var9 + var10;
              var8 = var8 + var10;
              break L3;
            }
          }
          L4: {
            if (var7 <= 0) {
              break L4;
            } else {
              if (var6 > 0) {
                sj.d(gb.field_a, this.field_B, 0, var5, var4, var7, var6, var8, var9, param2);
                return;
              } else {
                break L4;
              }
            }
          }
          return;
        } else {
          this.d(param0, param1);
          return;
        }
    }

    final void d(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        L0: {
          param0 = param0 + this.field_q;
          param1 = param1 + this.field_v;
          var4 = param0 + param1 * gb.field_d;
          var5 = 0;
          var6 = this.field_t;
          var7 = this.field_w;
          var8 = gb.field_d - var7;
          var9 = 0;
          if (param1 >= gb.field_b) {
            break L0;
          } else {
            var10 = gb.field_b - param1;
            var6 = var6 - var10;
            param1 = gb.field_b;
            var5 = var5 + var10 * var7;
            var4 = var4 + var10 * gb.field_d;
            break L0;
          }
        }
        L1: {
          if (param1 + var6 <= gb.field_i) {
            break L1;
          } else {
            var6 = var6 - (param1 + var6 - gb.field_i);
            break L1;
          }
        }
        L2: {
          if (param0 >= gb.field_l) {
            break L2;
          } else {
            var10 = gb.field_l - param0;
            var7 = var7 - var10;
            param0 = gb.field_l;
            var5 = var5 + var10;
            var4 = var4 + var10;
            var9 = var9 + var10;
            var8 = var8 + var10;
            break L2;
          }
        }
        L3: {
          if (param0 + var7 <= gb.field_h) {
            break L3;
          } else {
            var10 = param0 + var7 - gb.field_h;
            var7 = var7 - var10;
            var9 = var9 + var10;
            var8 = var8 + var10;
            break L3;
          }
        }
        L4: {
          if (var7 <= 0) {
            break L4;
          } else {
            if (var6 > 0) {
              sj.d(gb.field_a, this.field_B, 0, var5, var4, 0, 0, var7, var6, var8, var9, param2);
              return;
            } else {
              break L4;
            }
          }
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

    private final static void b(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12) {
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

    private final static void b(int param0, int param1, int param2, int[] param3, int[] param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13) {
        int incrementValue$66 = 0;
        int incrementValue$67 = 0;
        int var14 = 0;
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
                incrementValue$66 = param5;
                param5++;
                param0 = param4[incrementValue$66];
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
                  incrementValue$67 = param7;
                  param7++;
                  param3[incrementValue$67] = param2 - param1 | param1 - (param1 >>> 8);
                  param6++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    private final static void d(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11) {
        int incrementValue$66 = 0;
        int incrementValue$67 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
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
                incrementValue$66 = param3;
                param3++;
                param2 = param1[incrementValue$66];
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
                  incrementValue$67 = param4;
                  param4++;
                  param0[incrementValue$67] = ((var15 & 16711935) * var14 + (var17 & 16711935) * var16 & -16711936) + ((var15 & 65280) * var14 + (var17 & 65280) * var16 & 16711680) >>> 8;
                  param5++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    private final static void d(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int incrementValue$66 = 0;
        int incrementValue$67 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        var10 = -param6;
        L0: while (true) {
          if (var10 >= 0) {
            return;
          } else {
            var11 = -param5;
            L1: while (true) {
              if (var11 >= 0) {
                param4 = param4 + param7;
                param3 = param3 + param8;
                var10++;
                continue L0;
              } else {
                incrementValue$66 = param3;
                param3++;
                param2 = param1[incrementValue$66];
                var12 = param2 >>> 24;
                if (var12 == 0) {
                  param4++;
                  var11++;
                  continue L1;
                } else {
                  var13 = param0[param4];
                  var14 = 256 - var12;
                  var15 = (param2 & 16711935) * param9 & -16711936;
                  var16 = (param2 & 65280) * param9 & 16711680;
                  param2 = (var15 | var16) >>> 8;
                  incrementValue$67 = param4;
                  param4++;
                  param0[incrementValue$67] = ((param2 & 16711935) * var12 + (var13 & 16711935) * var14 & -16711936) + ((param2 & 65280) * var12 + (var13 & 65280) * var14 & 16711680) >>> 8;
                  var11++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    final void e(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int[] stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int[] stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        int[] stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        int stackIn_21_2 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int[] stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        int[] stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        int stackOut_20_2 = 0;
        int[] stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        int stackOut_19_2 = 0;
        L0: {
          var3 = this.field_w >> 1;
          var4 = this.field_t >> 1;
          param0 = param0 + this.field_q / 2;
          param1 = param1 + this.field_v / 2;
          if (param0 >= gb.field_l) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = gb.field_l - param0 << 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var5 = stackIn_3_0;
          if (param0 + var3 <= gb.field_h) {
            stackOut_5_0 = this.field_w - 2;
            stackIn_6_0 = stackOut_5_0;
            break L1;
          } else {
            stackOut_4_0 = (gb.field_h - param0 << 1) - 2;
            stackIn_6_0 = stackOut_4_0;
            break L1;
          }
        }
        L2: {
          var6 = stackIn_6_0;
          if (param1 >= gb.field_b) {
            stackOut_8_0 = 0;
            stackIn_9_0 = stackOut_8_0;
            break L2;
          } else {
            stackOut_7_0 = gb.field_b - param1 << 1;
            stackIn_9_0 = stackOut_7_0;
            break L2;
          }
        }
        L3: {
          var7 = stackIn_9_0;
          if (param1 + var4 <= gb.field_i) {
            stackOut_11_0 = this.field_t - 2;
            stackIn_12_0 = stackOut_11_0;
            break L3;
          } else {
            stackOut_10_0 = (gb.field_i - param1 << 1) - 2;
            stackIn_12_0 = stackOut_10_0;
            break L3;
          }
        }
        var8 = stackIn_12_0;
        var9 = var7;
        L4: while (true) {
          if (var9 > var8) {
            return;
          } else {
            var10 = var9 * this.field_w + var5;
            var11 = (param1 + (var9 >> 1)) * gb.field_d + (param0 + (var5 >> 1));
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
                      var21 = gb.field_a[var11];
                      gb.field_a[var11] = (var19 * var15 + var20 * (var21 & 16711935) & -16711936) + (var19 * var16 + var20 * (var21 & 65280) & 16711680) >>> 8;
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
                      stackOut_18_0 = this.field_B;
                      stackOut_18_1 = var10 + (var19 & 1);
                      stackIn_20_0 = stackOut_18_0;
                      stackIn_20_1 = stackOut_18_1;
                      stackIn_19_0 = stackOut_18_0;
                      stackIn_19_1 = stackOut_18_1;
                      if ((var19 & 2) != 0) {
                        stackOut_20_0 = (int[]) ((Object) stackIn_20_0);
                        stackOut_20_1 = stackIn_20_1;
                        stackOut_20_2 = 0;
                        stackIn_21_0 = stackOut_20_0;
                        stackIn_21_1 = stackOut_20_1;
                        stackIn_21_2 = stackOut_20_2;
                        break L7;
                      } else {
                        stackOut_19_0 = (int[]) ((Object) stackIn_19_0);
                        stackOut_19_1 = stackIn_19_1;
                        stackOut_19_2 = this.field_w;
                        stackIn_21_0 = stackOut_19_0;
                        stackIn_21_1 = stackOut_19_1;
                        stackIn_21_2 = stackOut_19_2;
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

    final void d(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        L0: {
          if (param2 <= 0) {
            break L0;
          } else {
            if (param3 > 0) {
              L1: {
                var5 = this.field_w;
                var6 = this.field_t;
                var7 = 0;
                var8 = 0;
                var9 = this.field_x;
                var10 = this.field_r;
                var11 = (var9 << 16) / param2;
                var12 = (var10 << 16) / param3;
                if (this.field_q <= 0) {
                  break L1;
                } else {
                  var13 = ((this.field_q << 16) + var11 - 1) / var11;
                  param0 = param0 + var13;
                  var7 = var7 + (var13 * var11 - (this.field_q << 16));
                  break L1;
                }
              }
              L2: {
                if (this.field_v <= 0) {
                  break L2;
                } else {
                  var13 = ((this.field_v << 16) + var12 - 1) / var12;
                  param1 = param1 + var13;
                  var8 = var8 + (var13 * var12 - (this.field_v << 16));
                  break L2;
                }
              }
              L3: {
                if (var5 >= var9) {
                  break L3;
                } else {
                  param2 = ((var5 << 16) - var7 + var11 - 1) / var11;
                  break L3;
                }
              }
              L4: {
                if (var6 >= var10) {
                  break L4;
                } else {
                  param3 = ((var6 << 16) - var8 + var12 - 1) / var12;
                  break L4;
                }
              }
              L5: {
                var13 = param0 + param1 * gb.field_d;
                var14 = gb.field_d - param2;
                if (param1 + param3 <= gb.field_i) {
                  break L5;
                } else {
                  param3 = param3 - (param1 + param3 - gb.field_i);
                  break L5;
                }
              }
              L6: {
                if (param1 >= gb.field_b) {
                  break L6;
                } else {
                  var15 = gb.field_b - param1;
                  param3 = param3 - var15;
                  var13 = var13 + var15 * gb.field_d;
                  var8 = var8 + var12 * var15;
                  break L6;
                }
              }
              L7: {
                if (param0 + param2 <= gb.field_h) {
                  break L7;
                } else {
                  var15 = param0 + param2 - gb.field_h;
                  param2 = param2 - var15;
                  var14 = var14 + var15;
                  break L7;
                }
              }
              L8: {
                if (param0 >= gb.field_l) {
                  break L8;
                } else {
                  var15 = gb.field_l - param0;
                  param2 = param2 - var15;
                  var13 = var13 + var15;
                  var7 = var7 + var11 * var15;
                  var14 = var14 + var15;
                  break L8;
                }
              }
              sj.c(gb.field_a, this.field_B, 0, var7, var8, var13, var14, param2, param3, var11, var12, var5);
              return;
            } else {
              break L0;
            }
          }
        }
    }

    private final static void f(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
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
                incrementValue$2 = param3;
                param3++;
                param2 = param1[incrementValue$2];
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
                  incrementValue$3 = param4;
                  param4++;
                  param0[incrementValue$3] = ((var18 & 16711935) * var17 + (var23 & 16711935) * var22 & -16711936) + ((var18 & 65280) * var17 + (var23 & 65280) * var22 & 16711680) >>> 8;
                  var16++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    sj(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6) {
        super(param0, param1, param2, param3, param4, param5, param6);
    }

    final void e(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        L0: {
          param0 = param0 + this.field_q;
          param1 = param1 + this.field_v;
          var4 = param0 + param1 * gb.field_d;
          var5 = 0;
          var6 = this.field_t;
          var7 = this.field_w;
          var8 = gb.field_d - var7;
          var9 = 0;
          if (param1 >= gb.field_b) {
            break L0;
          } else {
            var10 = gb.field_b - param1;
            var6 = var6 - var10;
            param1 = gb.field_b;
            var5 = var5 + var10 * var7;
            var4 = var4 + var10 * gb.field_d;
            break L0;
          }
        }
        L1: {
          if (param1 + var6 <= gb.field_i) {
            break L1;
          } else {
            var6 = var6 - (param1 + var6 - gb.field_i);
            break L1;
          }
        }
        L2: {
          if (param0 >= gb.field_l) {
            break L2;
          } else {
            var10 = gb.field_l - param0;
            var7 = var7 - var10;
            param0 = gb.field_l;
            var5 = var5 + var10;
            var4 = var4 + var10;
            var9 = var9 + var10;
            var8 = var8 + var10;
            break L2;
          }
        }
        L3: {
          if (param0 + var7 <= gb.field_h) {
            break L3;
          } else {
            var10 = param0 + var7 - gb.field_h;
            var7 = var7 - var10;
            var9 = var9 + var10;
            var8 = var8 + var10;
            break L3;
          }
        }
        L4: {
          if (var7 <= 0) {
            break L4;
          } else {
            if (var6 > 0) {
              sj.f(gb.field_a, this.field_B, 0, var5, var4, var7, var6, var8, var9, param2);
              return;
            } else {
              break L4;
            }
          }
        }
    }

    final void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        L0: {
          param0 = param0 + this.field_q;
          param1 = param1 + this.field_v;
          var4 = param0 + param1 * gb.field_d;
          var5 = 0;
          var6 = this.field_t;
          var7 = this.field_w;
          var8 = gb.field_d - var7;
          var9 = 0;
          if (param1 >= gb.field_b) {
            break L0;
          } else {
            var10 = gb.field_b - param1;
            var6 = var6 - var10;
            param1 = gb.field_b;
            var5 = var5 + var10 * var7;
            var4 = var4 + var10 * gb.field_d;
            break L0;
          }
        }
        L1: {
          if (param1 + var6 <= gb.field_i) {
            break L1;
          } else {
            var6 = var6 - (param1 + var6 - gb.field_i);
            break L1;
          }
        }
        L2: {
          if (param0 >= gb.field_l) {
            break L2;
          } else {
            var10 = gb.field_l - param0;
            var7 = var7 - var10;
            param0 = gb.field_l;
            var5 = var5 + var10;
            var4 = var4 + var10;
            var9 = var9 + var10;
            var8 = var8 + var10;
            break L2;
          }
        }
        L3: {
          if (param0 + var7 <= gb.field_h) {
            break L3;
          } else {
            var10 = param0 + var7 - gb.field_h;
            var7 = var7 - var10;
            var9 = var9 + var10;
            var8 = var8 + var10;
            break L3;
          }
        }
        L4: {
          if (var7 <= 0) {
            break L4;
          } else {
            if (var6 > 0) {
              sj.b(0, 0, 0, gb.field_a, this.field_B, var5, 0, var4, 0, var7, var6, var8, var9, param2);
              return;
            } else {
              break L4;
            }
          }
        }
    }

    final void g(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        L0: {
          param0 = param0 + (this.field_x - this.field_w - this.field_q);
          param1 = param1 + this.field_v;
          var3 = param0 + param1 * gb.field_d;
          var4 = this.field_w - 1;
          var5 = this.field_t;
          var6 = this.field_w;
          var7 = gb.field_d - var6;
          var8 = var6 + var6;
          if (param1 >= gb.field_b) {
            break L0;
          } else {
            var9 = gb.field_b - param1;
            var5 = var5 - var9;
            param1 = gb.field_b;
            var4 = var4 + var9 * var6;
            var3 = var3 + var9 * gb.field_d;
            break L0;
          }
        }
        L1: {
          if (param1 + var5 <= gb.field_i) {
            break L1;
          } else {
            var5 = var5 - (param1 + var5 - gb.field_i);
            break L1;
          }
        }
        L2: {
          if (param0 >= gb.field_l) {
            break L2;
          } else {
            var9 = gb.field_l - param0;
            var6 = var6 - var9;
            param0 = gb.field_l;
            var4 = var4 - var9;
            var3 = var3 + var9;
            var8 = var8 - var9;
            var7 = var7 + var9;
            break L2;
          }
        }
        L3: {
          if (param0 + var6 <= gb.field_h) {
            break L3;
          } else {
            var9 = param0 + var6 - gb.field_h;
            var6 = var6 - var9;
            var8 = var8 - var9;
            var7 = var7 + var9;
            break L3;
          }
        }
        L4: {
          if (var6 <= 0) {
            break L4;
          } else {
            if (var5 > 0) {
              sj.d(gb.field_a, this.field_B, 0, var4, var3, var6, var5, var7, var8);
              return;
            } else {
              break L4;
            }
          }
        }
    }

    final void d(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        L0: {
          param0 = param0 + this.field_q;
          param1 = param1 + this.field_v;
          var3 = param0 + param1 * gb.field_d;
          var4 = 0;
          var5 = this.field_t;
          var6 = this.field_w;
          var7 = gb.field_d - var6;
          var8 = 0;
          if (param1 >= gb.field_b) {
            break L0;
          } else {
            var9 = gb.field_b - param1;
            var5 = var5 - var9;
            param1 = gb.field_b;
            var4 = var4 + var9 * var6;
            var3 = var3 + var9 * gb.field_d;
            break L0;
          }
        }
        L1: {
          if (param1 + var5 <= gb.field_i) {
            break L1;
          } else {
            var5 = var5 - (param1 + var5 - gb.field_i);
            break L1;
          }
        }
        L2: {
          if (param0 >= gb.field_l) {
            break L2;
          } else {
            var9 = gb.field_l - param0;
            var6 = var6 - var9;
            param0 = gb.field_l;
            var4 = var4 + var9;
            var3 = var3 + var9;
            var8 = var8 + var9;
            var7 = var7 + var9;
            break L2;
          }
        }
        L3: {
          if (param0 + var6 <= gb.field_h) {
            break L3;
          } else {
            var9 = param0 + var6 - gb.field_h;
            var6 = var6 - var9;
            var8 = var8 + var9;
            var7 = var7 + var9;
            break L3;
          }
        }
        L4: {
          if (var6 <= 0) {
            break L4;
          } else {
            if (var5 > 0) {
              sj.e(gb.field_a, this.field_B, 0, var4, var3, var6, var5, var7, var8);
              return;
            } else {
              break L4;
            }
          }
        }
    }

    sj(int param0, int param1) {
        super(param0, param1);
    }

    final void c(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int[] var22 = null;
        int[] var23 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        L0: {
          var3 = this.field_w >> 2;
          var4 = this.field_t >> 2;
          param0 = param0 + this.field_q / 4;
          param1 = param1 + this.field_v / 4;
          if (param0 >= gb.field_l) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = gb.field_l - param0 << 2;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var5 = stackIn_3_0;
          if (param0 + var3 <= gb.field_h) {
            stackOut_5_0 = this.field_w - 4;
            stackIn_6_0 = stackOut_5_0;
            break L1;
          } else {
            stackOut_4_0 = (gb.field_h - param0 << 2) - 4;
            stackIn_6_0 = stackOut_4_0;
            break L1;
          }
        }
        L2: {
          var6 = stackIn_6_0;
          if (param1 >= gb.field_b) {
            stackOut_8_0 = 0;
            stackIn_9_0 = stackOut_8_0;
            break L2;
          } else {
            stackOut_7_0 = gb.field_b - param1 << 2;
            stackIn_9_0 = stackOut_7_0;
            break L2;
          }
        }
        L3: {
          var7 = stackIn_9_0;
          if (param1 + var4 <= gb.field_i) {
            stackOut_11_0 = this.field_t - 4;
            stackIn_12_0 = stackOut_11_0;
            break L3;
          } else {
            stackOut_10_0 = (gb.field_i - param1 << 2) - 4;
            stackIn_12_0 = stackOut_10_0;
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
                var12 = var10 * this.field_w + var11;
                var13 = (param1 + (var10 >> 2)) * gb.field_d + (param0 + (var11 >> 2));
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
                          var21 = gb.field_a[var13];
                          gb.field_a[var13] = (var19 * var16 + var20 * (var21 & 16711935) & -16711936) + (var19 * var17 + var20 * (var21 & 65280) & 16711680) >>> 8;
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
                        var9[(var14 << 2) + var15] = this.field_B[var12 + var14 * this.field_w + var15];
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

    final void c(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        L0: {
          param0 = param0 + this.field_q;
          param1 = param1 + this.field_v;
          var4 = param0 + param1 * gb.field_d;
          var5 = 0;
          var6 = this.field_t;
          var7 = this.field_w;
          var8 = gb.field_d - var7;
          var9 = 0;
          if (param1 >= gb.field_b) {
            break L0;
          } else {
            var10 = gb.field_b - param1;
            var6 = var6 - var10;
            param1 = gb.field_b;
            var5 = var5 + var10 * var7;
            var4 = var4 + var10 * gb.field_d;
            break L0;
          }
        }
        L1: {
          if (param1 + var6 <= gb.field_i) {
            break L1;
          } else {
            var6 = var6 - (param1 + var6 - gb.field_i);
            break L1;
          }
        }
        L2: {
          if (param0 >= gb.field_l) {
            break L2;
          } else {
            var10 = gb.field_l - param0;
            var7 = var7 - var10;
            param0 = gb.field_l;
            var5 = var5 + var10;
            var4 = var4 + var10;
            var9 = var9 + var10;
            var8 = var8 + var10;
            break L2;
          }
        }
        L3: {
          if (param0 + var7 <= gb.field_h) {
            break L3;
          } else {
            var10 = param0 + var7 - gb.field_h;
            var7 = var7 - var10;
            var9 = var9 + var10;
            var8 = var8 + var10;
            break L3;
          }
        }
        L4: {
          if (var7 <= 0) {
            break L4;
          } else {
            if (var6 > 0) {
              sj.e(gb.field_a, this.field_B, 0, var5, var4, var7, var6, var8, var9, param2);
              return;
            } else {
              break L4;
            }
          }
        }
    }

    final void f(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        L0: {
          param0 = param0 + this.field_q;
          param1 = param1 + this.field_v;
          var3 = param0 + param1 * gb.field_d;
          var4 = 0;
          var5 = this.field_t;
          var6 = this.field_w;
          var7 = gb.field_d - var6;
          var8 = 0;
          if (param1 >= gb.field_b) {
            break L0;
          } else {
            var9 = gb.field_b - param1;
            var5 = var5 - var9;
            param1 = gb.field_b;
            var4 = var4 + var9 * var6;
            var3 = var3 + var9 * gb.field_d;
            break L0;
          }
        }
        L1: {
          if (param1 + var5 <= gb.field_i) {
            break L1;
          } else {
            var5 = var5 - (param1 + var5 - gb.field_i);
            break L1;
          }
        }
        L2: {
          if (param0 >= gb.field_l) {
            break L2;
          } else {
            var9 = gb.field_l - param0;
            var6 = var6 - var9;
            param0 = gb.field_l;
            var4 = var4 + var9;
            var3 = var3 + var9;
            var8 = var8 + var9;
            var7 = var7 + var9;
            break L2;
          }
        }
        L3: {
          if (param0 + var6 <= gb.field_h) {
            break L3;
          } else {
            var9 = param0 + var6 - gb.field_h;
            var6 = var6 - var9;
            var8 = var8 + var9;
            var7 = var7 + var9;
            break L3;
          }
        }
        L4: {
          if (var6 <= 0) {
            break L4;
          } else {
            if (var5 > 0) {
              sj.e(gb.field_a, this.field_B, 0, var4, var3, var6, var5, var7, var8);
              return;
            } else {
              break L4;
            }
          }
        }
    }

    private final static void e(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
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

    final void c(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        L0: {
          if (param2 <= 0) {
            break L0;
          } else {
            if (param3 > 0) {
              L1: {
                var6 = this.field_w;
                var7 = this.field_t;
                var8 = 0;
                var9 = 0;
                var10 = this.field_x;
                var11 = this.field_r;
                var12 = (var10 << 16) / param2;
                var13 = (var11 << 16) / param3;
                if (this.field_q <= 0) {
                  break L1;
                } else {
                  var14 = ((this.field_q << 16) + var12 - 1) / var12;
                  param0 = param0 + var14;
                  var8 = var8 + (var14 * var12 - (this.field_q << 16));
                  break L1;
                }
              }
              L2: {
                if (this.field_v <= 0) {
                  break L2;
                } else {
                  var14 = ((this.field_v << 16) + var13 - 1) / var13;
                  param1 = param1 + var14;
                  var9 = var9 + (var14 * var13 - (this.field_v << 16));
                  break L2;
                }
              }
              L3: {
                if (var6 >= var10) {
                  break L3;
                } else {
                  param2 = ((var6 << 16) - var8 + var12 - 1) / var12;
                  break L3;
                }
              }
              L4: {
                if (var7 >= var11) {
                  break L4;
                } else {
                  param3 = ((var7 << 16) - var9 + var13 - 1) / var13;
                  break L4;
                }
              }
              L5: {
                var14 = param0 + param1 * gb.field_d;
                var15 = gb.field_d - param2;
                if (param1 + param3 <= gb.field_i) {
                  break L5;
                } else {
                  param3 = param3 - (param1 + param3 - gb.field_i);
                  break L5;
                }
              }
              L6: {
                if (param1 >= gb.field_b) {
                  break L6;
                } else {
                  var16 = gb.field_b - param1;
                  param3 = param3 - var16;
                  var14 = var14 + var16 * gb.field_d;
                  var9 = var9 + var13 * var16;
                  break L6;
                }
              }
              L7: {
                if (param0 + param2 <= gb.field_h) {
                  break L7;
                } else {
                  var16 = param0 + param2 - gb.field_h;
                  param2 = param2 - var16;
                  var15 = var15 + var16;
                  break L7;
                }
              }
              L8: {
                if (param0 >= gb.field_l) {
                  break L8;
                } else {
                  var16 = gb.field_l - param0;
                  param2 = param2 - var16;
                  var14 = var14 + var16;
                  var8 = var8 + var12 * var16;
                  var15 = var15 + var16;
                  break L8;
                }
              }
              sj.b(gb.field_a, this.field_B, 0, var8, var9, var14, var15, param2, param3, var12, var13, var6, param4);
              return;
            } else {
              break L0;
            }
          }
        }
    }
}
