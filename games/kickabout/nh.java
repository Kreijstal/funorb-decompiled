/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nh {
    private static int[] field_b;
    private static int field_c;
    private static int field_i;
    private static int field_a;
    private static int field_h;
    private static int field_d;
    private static int field_f;
    private static int field_e;
    private static int field_g;

    private final static int b(int param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var1 = param0 >> 16 & 255;
        var2 = param0 >> 8 & 255;
        var3 = param0 & 255;
        if (var1 < var2) {
          if (var1 < var3) {
            if (var2 < var3) {
              var4 = var3 - var1;
              return (4096 + 1024 * (var1 - var2) / var4) % 6144 << 19 | var4 * 524032 / var3 & 524032 | var3;
            } else {
              var4 = var2 - var1;
              return (2048 + 1024 * (var3 - var1) / var4) % 6144 << 19 | var4 * 524032 / var2 & 524032 | var2;
            }
          } else {
            var4 = var2 - var3;
            return (2048 + 1024 * (var3 - var1) / var4) % 6144 << 19 | var4 * 524032 / var2 & 524032 | var2;
          }
        } else {
          if (var2 < var3) {
            if (var1 < var3) {
              var4 = var3 - var2;
              return (4096 + 1024 * (var1 - var2) / var4) % 6144 << 19 | var4 * 524032 / var3 & 524032 | var3;
            } else {
              var4 = var1 - var2;
              return (6144 + 1024 * (var2 - var3) / var4) % 6144 << 19 | var4 * 524032 / var1 & 524032 | var1;
            }
          } else {
            L0: {
              if (var3 != var2) {
                break L0;
              } else {
                if (var3 != var1) {
                  break L0;
                } else {
                  return var3;
                }
              }
            }
            var4 = var1 - var3;
            return (6144 + 1024 * (var2 - var3) / var4) % 6144 << 19 | var4 * 524032 / var1 & 524032 | var1;
          }
        }
    }

    public static void a() {
        field_b = null;
    }

    private final static void a(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11) {
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var12 = param3;
        for (var13 = -param8; var13 < 0; var13++) {
            var14 = (param4 >> 16) * param11;
            for (var15 = -param7; var15 < 0; var15++) {
                param2 = param1[(param3 >> 16) + var14];
                if ((param2 & -16777216) != 0) {
                    param5++;
                    param0[param5] = param2;
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

    final static void a(ot param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        L0: {
          param1 = param1 + param0.field_s;
          param2 = param2 + param0.field_n;
          var3 = param1 + param2 * on.field_g;
          var4 = 0;
          var5 = param0.field_w;
          var6 = param0.field_q;
          var7 = on.field_g - var6;
          var8 = 0;
          if (param2 >= on.field_e) {
            break L0;
          } else {
            var9 = on.field_e - param2;
            var5 = var5 - var9;
            param2 = on.field_e;
            var4 = var4 + var9 * var6;
            var3 = var3 + var9 * on.field_g;
            break L0;
          }
        }
        L1: {
          if (param2 + var5 <= on.field_h) {
            break L1;
          } else {
            var5 = var5 - (param2 + var5 - on.field_h);
            break L1;
          }
        }
        L2: {
          if (param1 >= on.field_b) {
            break L2;
          } else {
            var9 = on.field_b - param1;
            var6 = var6 - var9;
            param1 = on.field_b;
            var4 = var4 + var9;
            var3 = var3 + var9;
            var8 = var8 + var9;
            var7 = var7 + var9;
            break L2;
          }
        }
        L3: {
          if (param1 + var6 <= on.field_c) {
            break L3;
          } else {
            var9 = param1 + var6 - on.field_c;
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
              nh.a(on.field_a, param0.field_y, 0, var4, var3, var6, var5, var7, var8);
              return;
            } else {
              break L4;
            }
          }
        }
    }

    final static ot a(ut param0) {
        int var1 = 0;
        int var2 = 0;
        int[] var3 = null;
        ot var4 = null;
        int[] var5 = null;
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
        var1 = param0.field_q;
        var2 = param0.field_w;
        var3 = param0.field_y;
        var4 = new ot(var1 >> 1, var2 >> 1);
        var5 = var4.field_y;
        var6 = 0;
        var7 = 0;
        var8 = 0;
        L0: while (true) {
          if (var8 >= var2) {
            var4.field_s = param0.field_s >> 1;
            var4.field_n = param0.field_s >> 1;
            var4.field_o = param0.field_o >> 1;
            var4.field_v = param0.field_v >> 1;
            return var4;
          } else {
            var9 = 0;
            L1: while (true) {
              if (var9 >= var1) {
                var8 += 2;
                var6 = var6 + (param0.field_q << 1);
                continue L0;
              } else {
                var10 = var3[var6 + var9];
                var11 = var3[var6 + var9 + 1];
                var12 = var3[var6 + var1 + var9];
                var13 = var3[var6 + var1 + var9 + 1];
                var14 = (-var10 >>> 31) + (-var11 >>> 31) + (-var12 >>> 31) + (-var13 >>> 31) << 6;
                var15 = var14 & 256;
                var7++;
                var5[var7] = ((var14 | var15 - (var15 >> 8)) << 24) + ((var10 & 16711935) + (var11 & 16711935) + (var12 & 16711935) + (var13 & 16711935) >> 2 & 16711935) + (((var10 & 65280) >>> 2) + ((var11 & 65280) >>> 2) + ((var12 & 65280) >>> 2) + ((var13 & 65280) >>> 2) & 65280);
                var9 += 2;
                continue L1;
              }
            }
          }
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6) {
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
          var7 = param2 - param0;
          var8 = param3 - param1;
          var9 = (int)Math.sqrt((double)(var7 * var7 + var8 * var8));
          var10 = (int)(65536.0 / Math.sqrt((double)(var7 * var7 + var8 * var8)));
          var7 = var7 * var10;
          var8 = var8 * var10;
          var11 = param0;
          var12 = param1;
          var13 = param2;
          var14 = param3;
          if (var11 <= var13) {
            break L0;
          } else {
            var15 = var11;
            var11 = var13;
            var13 = var15;
            break L0;
          }
        }
        L1: {
          if (var12 <= var14) {
            break L1;
          } else {
            var15 = var12;
            var12 = var14;
            var14 = var15;
            break L1;
          }
        }
        L2: {
          var11 = var11 - param4;
          var12 = var12 - param4;
          var13 = var13 + param4;
          var14 = var14 + param4;
          if (var11 >= on.field_b) {
            break L2;
          } else {
            var11 = on.field_b;
            break L2;
          }
        }
        L3: {
          if (var12 >= on.field_e) {
            break L3;
          } else {
            var12 = on.field_e;
            break L3;
          }
        }
        L4: {
          if (var13 <= on.field_c) {
            break L4;
          } else {
            var13 = on.field_c;
            break L4;
          }
        }
        L5: {
          if (var14 <= on.field_h) {
            break L5;
          } else {
            var14 = on.field_h;
            break L5;
          }
        }
        field_c = 256 / param4;
        field_g = param5 * 128 / param4;
        field_a = (var12 - param1) * var7;
        field_e = (var12 - param1) * var8;
        field_d = (var11 - param0) * var7;
        field_f = (var11 - param0) * var8;
        field_b = param6;
        nh.a(param0, param1, param4, 0, 0, var9, on.field_a, var12 * on.field_g + var11, param5, var7, var8, var12 - var14, var11 - var13, on.field_g - (var13 - var11));
    }

    private final static int a(int param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var1 = param0 >>> 19 & 8191;
        var2 = param0 >>> 8 & 2047;
        var3 = param0 & 255;
        var4 = var1 % 1024;
        var5 = var3 * (2047 - var2) + 1024 >>> 11 & 255;
        var6 = var1 >> 10;
        var6--;
        if (var6 != 0) {
          var6--;
          if (var6 != 0) {
            var6--;
            if (var6 != 0) {
              var6--;
              if (var6 != 0) {
                var6--;
                if (var6 != 0) {
                  if (var6 != 0) {
                    return 16711935;
                  } else {
                    return var3 << 16 | var5 << 8 | var3 * (2097152 - var4 * var2) + 1048576 >>> 21 & 255;
                  }
                } else {
                  return (var3 * (2097152 - (1023 - var4) * var2) + 1048576 >>> 21 & 255) << 16 | var5 << 8 | var3;
                }
              } else {
                return var5 << 16 | (var3 * (2097152 - var4 * var2) + 1048576 >>> 21 & 255) << 8 | var3;
              }
            } else {
              return var5 << 16 | var3 << 8 | var3 * (2097152 - (1023 - var4) * var2) + 1048576 >>> 21 & 255;
            }
          } else {
            return (var3 * (2097152 - var4 * var2) + 1048576 >>> 21 & 255) << 16 | var3 << 8 | var5;
          }
        } else {
          return var3 << 16 | (var3 * (2097152 - (1023 - var4) * var2) + 1048576 >>> 21 & 255) << 8 | var5;
        }
    }

    private final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13) {
        int var14 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        L0: while (true) {
          if (param11 >= 0) {
            return;
          } else {
            field_i = field_d;
            field_h = field_f;
            var14 = param12;
            L1: while (true) {
              if (var14 >= 0) {
                param7 = param7 + param13;
                param11++;
                field_a = field_a + param9;
                field_e = field_e + param10;
                continue L0;
              } else {
                L2: {
                  param1 = field_h - field_a >> 16;
                  if (param1 >= -param2) {
                    if (param1 <= param2) {
                      param0 = field_i + field_e >> 16;
                      if (param0 >= -param2) {
                        if (param0 <= param5 + param2) {
                          L3: {
                            if (param0 >= param2) {
                              if (param0 <= param5 - param2) {
                                stackOut_15_0 = param8;
                                stackIn_16_0 = stackOut_15_0;
                                break L3;
                              } else {
                                stackOut_14_0 = (param5 + param2 - param0) * field_g >> 8;
                                stackIn_16_0 = stackOut_14_0;
                                break L3;
                              }
                            } else {
                              stackOut_12_0 = (param0 + param2) * field_g >> 8;
                              stackIn_16_0 = stackOut_12_0;
                              break L3;
                            }
                          }
                          L4: {
                            param3 = stackIn_16_0;
                            param4 = param1 * param3 * field_c >> 8;
                            if (param4 < 0) {
                              stackOut_18_0 = field_b[param3 + param4];
                              stackIn_19_0 = stackOut_18_0;
                              break L4;
                            } else {
                              stackOut_17_0 = field_b[param3 - param4];
                              stackIn_19_0 = stackOut_17_0;
                              break L4;
                            }
                          }
                          param1 = stackIn_19_0;
                          param0 = param6[param7];
                          param3 = param1 + param0;
                          param1 = (param1 & 16711935) + (param0 & 16711935);
                          param0 = (param1 & 16777472) + (param3 - param1 & 65536);
                          param6[param7] = param3 - param0 | param0 - (param0 >>> 8);
                          break L2;
                        } else {
                          break L2;
                        }
                      } else {
                        break L2;
                      }
                    } else {
                      break L2;
                    }
                  } else {
                    break L2;
                  }
                }
                var14++;
                param7++;
                field_i = field_i + param9;
                field_h = field_h + param10;
                continue L1;
              }
            }
          }
        }
    }

    private final static void a(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var9 = -(param5 >> 2);
        param5 = -(param5 & 3);
        var10 = -param6;
        L0: while (true) {
          if (var10 >= 0) {
            return;
          } else {
            var11 = var9;
            L1: while (true) {
              if (var11 >= 0) {
                var11 = param5;
                L2: while (true) {
                  if (var11 >= 0) {
                    param4 = param4 + param7;
                    param3 = param3 + param8;
                    var10++;
                    continue L0;
                  } else {
                    param3++;
                    param2 = param1[param3];
                    if ((param2 & -16777216) == 0) {
                      param4++;
                      var11++;
                      continue L2;
                    } else {
                      param4++;
                      param0[param4] = param2;
                      var11++;
                      continue L2;
                    }
                  }
                }
              } else {
                L3: {
                  param3++;
                  param2 = param1[param3];
                  if ((param2 & -16777216) == 0) {
                    param4++;
                    break L3;
                  } else {
                    param4++;
                    param0[param4] = param2;
                    break L3;
                  }
                }
                L4: {
                  param3++;
                  param2 = param1[param3];
                  if ((param2 & -16777216) == 0) {
                    param4++;
                    break L4;
                  } else {
                    param4++;
                    param0[param4] = param2;
                    break L4;
                  }
                }
                L5: {
                  param3++;
                  param2 = param1[param3];
                  if ((param2 & -16777216) == 0) {
                    param4++;
                    break L5;
                  } else {
                    param4++;
                    param0[param4] = param2;
                    break L5;
                  }
                }
                param3++;
                param2 = param1[param3];
                if ((param2 & -16777216) == 0) {
                  param4++;
                  var11++;
                  continue L1;
                } else {
                  param4++;
                  param0[param4] = param2;
                  var11++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    final static void a(ut param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        L0: {
          param1 = param1 + param0.field_s;
          param2 = param2 + param0.field_n;
          var3 = param1 + param2 * on.field_g;
          var4 = 0;
          var5 = param0.field_w;
          var6 = param0.field_q;
          var7 = on.field_g - var6;
          var8 = 0;
          if (param2 >= on.field_e) {
            break L0;
          } else {
            var9 = on.field_e - param2;
            var5 = var5 - var9;
            param2 = on.field_e;
            var4 = var4 + var9 * var6;
            var3 = var3 + var9 * on.field_g;
            break L0;
          }
        }
        L1: {
          if (param2 + var5 <= on.field_h) {
            break L1;
          } else {
            var5 = var5 - (param2 + var5 - on.field_h);
            break L1;
          }
        }
        L2: {
          if (param1 >= on.field_b) {
            break L2;
          } else {
            var9 = on.field_b - param1;
            var6 = var6 - var9;
            param1 = on.field_b;
            var4 = var4 + var9;
            var3 = var3 + var9;
            var8 = var8 + var9;
            var7 = var7 + var9;
            break L2;
          }
        }
        L3: {
          if (param1 + var6 <= on.field_c) {
            break L3;
          } else {
            var9 = param1 + var6 - on.field_c;
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
              nh.b(on.field_a, param0.field_y, 0, var4, var3, var6, var5, var7, var8);
              return;
            } else {
              break L4;
            }
          }
        }
    }

    final static void a(int[] param0, double param1, double param2, double param3) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var7 = (int)(param1 * 6144.0);
        for (var8 = 0; var8 < param0.length; var8++) {
            var9 = param0[var8];
            var10 = nh.b(var9);
            var11 = var10 >>> 19 & 8191;
            var12 = var10 >> 8 & 2047;
            var13 = var10 & 255;
            var11 = (var11 + var7) % 6144;
            var12 = (int)((double)var12 * param2);
            var13 = (int)((double)var13 * param3);
            if (var12 > 2047) {
                var12 = 2047;
            }
            if (var13 > 255) {
                var13 = 255;
            }
            var10 = var11 << 19 | var12 << 8 | var13;
            var14 = nh.a(var10);
            if (var14 == 0) {
                if ((var9 & 16777215) != 0) {
                    var14 = 65793;
                }
            }
            var9 = var9 & -16777216 | var14;
            param0[var8] = var9;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int[] param4) {
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
        int var22 = 0;
        int var23 = 0;
        L0: {
          var5 = param2 * param2;
          var6 = param0 - param2 >> 4;
          var7 = param0 + param2 + 15 >> 4;
          var8 = param1 - param2 >> 4;
          var9 = param1 + param2 + 15 >> 4;
          if (var6 >= on.field_b) {
            break L0;
          } else {
            var6 = on.field_b;
            break L0;
          }
        }
        L1: {
          if (var7 <= on.field_c) {
            break L1;
          } else {
            var7 = on.field_c;
            break L1;
          }
        }
        L2: {
          if (var8 >= on.field_e) {
            break L2;
          } else {
            var8 = on.field_e;
            break L2;
          }
        }
        L3: {
          if (var9 <= on.field_h) {
            break L3;
          } else {
            var9 = on.field_h;
            break L3;
          }
        }
        var10 = (var6 << 4) - param0;
        var10 = var10 * var10;
        var11 = (var6 + 1 << 4) - param0;
        var11 = var11 * var11;
        var12 = (var6 + 2 << 4) - param0;
        var12 = var12 * var12;
        var13 = var11 - var10;
        var14 = var12 - var11;
        var15 = var14 - var13;
        var16 = (var8 << 4) - param1;
        var16 = var16 * var16;
        var17 = (var8 + 1 << 4) - param1;
        var17 = var17 * var17;
        var18 = (var8 + 2 << 4) - param1;
        var18 = var18 * var18;
        var19 = var17 - var16;
        var20 = var18 - var17;
        var21 = var20 - var19;
        var22 = var6 + var8 * on.field_g;
        var23 = on.field_g + var6 - var7;
        nh.a(0, 0, 0, 0, 0, var15, var5, var22, on.field_a, param3, param4, var23, var13, var6 - var7, var16 + var10, var19, var21, var8 - var9);
    }

    final static ut a(ot param0) {
        ut var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int[] stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        int[] stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        int stackIn_6_2 = 0;
        int[] stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        int[] stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        int stackOut_5_2 = 0;
        int[] stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        int stackOut_4_2 = 0;
        var1 = new ut(param0.field_q, param0.field_w);
        var1.field_s = param0.field_s;
        var1.field_n = param0.field_n;
        var1.field_o = param0.field_o;
        var1.field_v = param0.field_v;
        var2 = param0.field_y.length;
        var3 = 0;
        L0: while (true) {
          if (var3 >= var2) {
            return var1;
          } else {
            var4 = param0.field_y[var3];
            if ((var4 & -2147483648) == 0) {
              var1.field_y[var3] = 0;
              var3++;
              continue L0;
            } else {
              L1: {
                var4 = var4 & 16777215;
                stackOut_3_0 = var1.field_y;
                stackOut_3_1 = var3;
                stackIn_5_0 = stackOut_3_0;
                stackIn_5_1 = stackOut_3_1;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                if (var4 != 0) {
                  stackOut_5_0 = (int[]) (Object) stackIn_5_0;
                  stackOut_5_1 = stackIn_5_1;
                  stackOut_5_2 = var4;
                  stackIn_6_0 = stackOut_5_0;
                  stackIn_6_1 = stackOut_5_1;
                  stackIn_6_2 = stackOut_5_2;
                  break L1;
                } else {
                  stackOut_4_0 = (int[]) (Object) stackIn_4_0;
                  stackOut_4_1 = stackIn_4_1;
                  stackOut_4_2 = 65793;
                  stackIn_6_0 = stackOut_4_0;
                  stackIn_6_1 = stackOut_4_1;
                  stackIn_6_2 = stackOut_4_2;
                  break L1;
                }
              }
              stackIn_6_0[stackIn_6_1] = stackIn_6_2;
              var3++;
              continue L0;
            }
          }
        }
    }

    private final static void b(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var11 = -param6;
        L0: while (true) {
          if (var11 >= 0) {
            return;
          } else {
            var12 = -param5;
            L1: while (true) {
              if (var12 >= 0) {
                param4 = param4 + param7;
                param3 = param3 + param8;
                var11++;
                continue L0;
              } else {
                param3++;
                param2 = param1[param3];
                if (param2 == 0) {
                  param4++;
                  var12++;
                  continue L1;
                } else {
                  var9 = param0[param4];
                  var10 = 256 - (param2 & 255);
                  param4++;
                  param0[param4] = ((var9 & 16711935) * var10 & -16711936 | (var9 & 65280) * var10 & 16711680) >> 8;
                  var12++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    private final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int[] param8, int param9, int[] param10, int param11, int param12, int param13, int param14, int param15, int param16, int param17) {
        int var19 = 0;
        int var18 = 0;
        while (param17 < 0) {
            param3 = param14;
            param4 = param12;
            for (var19 = param13; var19 < 0; var19++) {
                if (param3 < param6) {
                    param0 = param10[(param6 - param3) * param9 / param6];
                    param1 = param8[param7];
                    var18 = 256 - (param0 & 255);
                    param8[param7] = (param1 & 16711935) * var18 >> 8 & 16711935 | (param1 & 65280) * var18 >> 8 & 65280;
                }
                param7++;
                param3 = param3 + param4;
                param4 = param4 + param5;
            }
            param7 = param7 + param11;
            param14 = param14 + param15;
            param15 = param15 + param16;
            param17++;
        }
    }

    final static void a(ot param0, int param1, int param2, int param3, int param4) {
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
          if (param3 <= 0) {
            break L0;
          } else {
            if (param4 > 0) {
              L1: {
                var5 = param0.field_q;
                var6 = param0.field_w;
                var7 = 0;
                var8 = 0;
                var9 = param0.field_o;
                var10 = param0.field_v;
                var11 = (var9 << 16) / param3;
                var12 = (var10 << 16) / param4;
                if (param0.field_s <= 0) {
                  break L1;
                } else {
                  var13 = ((param0.field_s << 16) + var11 - 1) / var11;
                  param1 = param1 + var13;
                  var7 = var7 + (var13 * var11 - (param0.field_s << 16));
                  break L1;
                }
              }
              L2: {
                if (param0.field_n <= 0) {
                  break L2;
                } else {
                  var13 = ((param0.field_n << 16) + var12 - 1) / var12;
                  param2 = param2 + var13;
                  var8 = var8 + (var13 * var12 - (param0.field_n << 16));
                  break L2;
                }
              }
              L3: {
                if (var5 >= var9) {
                  break L3;
                } else {
                  param3 = ((var5 << 16) - var7 + var11 - 1) / var11;
                  break L3;
                }
              }
              L4: {
                if (var6 >= var10) {
                  break L4;
                } else {
                  param4 = ((var6 << 16) - var8 + var12 - 1) / var12;
                  break L4;
                }
              }
              L5: {
                var13 = param1 + param2 * on.field_g;
                var14 = on.field_g - param3;
                if (param2 + param4 <= on.field_h) {
                  break L5;
                } else {
                  param4 = param4 - (param2 + param4 - on.field_h);
                  break L5;
                }
              }
              L6: {
                if (param2 >= on.field_e) {
                  break L6;
                } else {
                  var15 = on.field_e - param2;
                  param4 = param4 - var15;
                  var13 = var13 + var15 * on.field_g;
                  var8 = var8 + var12 * var15;
                  break L6;
                }
              }
              L7: {
                if (param1 + param3 <= on.field_c) {
                  break L7;
                } else {
                  var15 = param1 + param3 - on.field_c;
                  param3 = param3 - var15;
                  var14 = var14 + var15;
                  break L7;
                }
              }
              L8: {
                if (param1 >= on.field_b) {
                  break L8;
                } else {
                  var15 = on.field_b - param1;
                  param3 = param3 - var15;
                  var13 = var13 + var15;
                  var7 = var7 + var11 * var15;
                  var14 = var14 + var15;
                  break L8;
                }
              }
              nh.a(on.field_a, param0.field_y, 0, var7, var8, var13, var14, param3, param4, var11, var12, var5);
              return;
            } else {
              break L0;
            }
          }
        }
    }

    final static void a(ut param0, double param1, double param2, double param3) {
        nh.a(param0.field_y, param1, param2, param3);
    }

    final static ot b(ot param0) {
        int var1 = 0;
        int var2 = 0;
        int[] var3 = null;
        ot var4 = null;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        var1 = param0.field_q;
        var2 = param0.field_w;
        var3 = param0.field_y;
        var4 = new ot(var1 >> 1, var2 >> 1);
        var5 = var4.field_y;
        var6 = 0;
        var7 = 0;
        var8 = 0;
        L0: while (true) {
          if (var8 >= var2) {
            var4.field_s = param0.field_s >> 1;
            var4.field_n = param0.field_s >> 1;
            var4.field_o = param0.field_o >> 1;
            var4.field_v = param0.field_v >> 1;
            return var4;
          } else {
            var9 = 0;
            L1: while (true) {
              if (var9 >= var1) {
                var8 += 2;
                var6 = var6 + (param0.field_q << 1);
                continue L0;
              } else {
                var10 = var3[var6 + var9];
                var11 = var3[var6 + var9 + 1];
                var12 = var3[var6 + var1 + var9];
                var13 = var3[var6 + var1 + var9 + 1];
                var7++;
                var5[var7] = ((var10 & 16711935) + (var11 & 16711935) + (var12 & 16711935) + (var13 & 16711935) >> 2 & 16711935) + (((var10 & -16711936) >>> 2) + ((var11 & -16711936) >>> 2) + ((var12 & -16711936) >>> 2) + ((var13 & -16711936) >>> 2) & -16711936);
                var9 += 2;
                continue L1;
              }
            }
          }
        }
    }
}
