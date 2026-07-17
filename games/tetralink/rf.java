/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rf {
    static int field_b;
    static int[] field_a;

    final static void a(int param0) {
        if (!(mf.field_s == null)) {
            mf.field_s.e((byte) -110);
        }
        if (!(nl.field_a == null)) {
            nl.field_a.e(true);
        }
        ve.a((byte) -83);
    }

    final static mh a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Object stackIn_8_0 = null;
        mh stackIn_11_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        mh stackOut_10_0 = null;
        Object stackOut_7_0 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var5 = TetraLink.field_J;
        try {
          L0: {
            L1: {
              var2_int = param1.length();
              var3 = 0;
              if (param0 == -1723) {
                break L1;
              } else {
                field_b = -18;
                break L1;
              }
            }
            L2: while (true) {
              if (var2_int <= var3) {
                stackOut_10_0 = jg.field_h;
                stackIn_11_0 = stackOut_10_0;
                break L0;
              } else {
                var4 = param1.charAt(var3);
                if (var4 >= 48) {
                  if (var4 <= 57) {
                    var3++;
                    continue L2;
                  } else {
                    stackOut_7_0 = null;
                    stackIn_8_0 = stackOut_7_0;
                    return (mh) (Object) stackIn_8_0;
                  }
                } else {
                  return null;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var2;
            stackOut_12_1 = new StringBuilder().append("rf.B(").append(param0).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L3;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 41);
        }
        return stackIn_11_0;
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
          if (var11 >= ra.field_j) {
            break L2;
          } else {
            var11 = ra.field_j;
            break L2;
          }
        }
        L3: {
          if (var12 >= ra.field_i) {
            break L3;
          } else {
            var12 = ra.field_i;
            break L3;
          }
        }
        L4: {
          if (var13 <= ra.field_l) {
            break L4;
          } else {
            var13 = ra.field_l;
            break L4;
          }
        }
        L5: {
          if (var14 <= ra.field_g) {
            break L5;
          } else {
            var14 = ra.field_g;
            break L5;
          }
        }
        dk.field_b = 256 / param4;
        ng.field_n = param5 * 128 / param4;
        kl.field_b = (var12 - param1) * var7;
        ud.field_Sb = (var12 - param1) * var8;
        ic.field_e = (var11 - param0) * var7;
        bj.field_b = (var11 - param0) * var8;
        bg.field_k = param6;
        rf.a(param0, param1, param4, 0, 0, var9, ra.field_b, var12 * ra.field_f + var11, param5, var7, var8, var12 - var14, var11 - var13, ra.field_f - (var13 - var11));
    }

    private final static void b(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13) {
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
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        var14 = (param0 << 4) - param13;
        var15 = param11;
        var16 = param1;
        var17 = param2;
        var18 = param8;
        L0: while (true) {
          L1: {
            if (var18 >= param9) {
              break L1;
            } else {
              if (var16 >= param5) {
                break L1;
              } else {
                L2: {
                  var19 = (var18 << 4) - param12;
                  var20 = (var16 << param4) / param6;
                  var21 = ce.field_e[var20] * param10 >> 15;
                  var22 = var18 + (var19 * var21 + 131072 >> 18);
                  if (var22 <= 639) {
                    break L2;
                  } else {
                    var22 = 639;
                    break L2;
                  }
                }
                L3: {
                  var23 = param0 + (var14 * var21 + 131072 >> 18);
                  if (var23 >= 0) {
                    break L3;
                  } else {
                    var23 = 0;
                    break L3;
                  }
                }
                L4: {
                  var24 = ra.field_b[var23 * 640 + var22];
                  var25 = 64;
                  if (var25 >= 0) {
                    break L4;
                  } else {
                    var25 = -var25;
                    break L4;
                  }
                }
                var26 = (var24 & 16711935) * var25;
                var25 = (var24 & 65280) * var25;
                var24 = (var26 & 1069563840) + (var25 & 4177920);
                var26 = (var26 & -1073692672) + (var25 & 12582912);
                var26 = (var26 | var26 >>> 1) & 1077952512;
                int incrementValue$1 = var15;
                var15++;
                ra.field_b[incrementValue$1] = (var24 | var26 - (var26 >>> 8)) >>> 6;
                var16 = var16 + var17;
                var17 = var17 + param3;
                var18++;
                continue L0;
              }
            }
          }
          var15 = param11;
          var16 = param1;
          var17 = param2;
          var18 = param8 - 1;
          L5: while (true) {
            if (var18 < param7) {
              return;
            } else {
              var17 = var17 - param3;
              var16 = var16 - var17;
              if (var16 < param5) {
                L6: {
                  var19 = (var18 << 4) - param12;
                  var20 = (var16 << param4) / param6;
                  var21 = ce.field_e[var20] * param10 >> 15;
                  var22 = var18 + (var19 * var21 + 131072 >> 18);
                  if (var22 >= 0) {
                    break L6;
                  } else {
                    var22 = 0;
                    break L6;
                  }
                }
                L7: {
                  var23 = param0 + (var14 * var21 + 131072 >> 18);
                  if (var23 >= 0) {
                    break L7;
                  } else {
                    var23 = 0;
                    break L7;
                  }
                }
                L8: {
                  var24 = ra.field_b[var23 * 640 + var22];
                  var25 = 64;
                  if (var25 >= 0) {
                    break L8;
                  } else {
                    var25 = -var25;
                    break L8;
                  }
                }
                var26 = (var24 & 16711935) * var25;
                var25 = (var24 & 65280) * var25;
                var24 = (var26 & 1069563840) + (var25 & 4177920);
                var26 = (var26 & -1073692672) + (var25 & 12582912);
                var26 = (var26 | var26 >>> 1) & 1077952512;
                var15--;
                ra.field_b[var15] = (var24 | var26 - (var26 >>> 8)) >>> 6;
                var18--;
                continue L5;
              } else {
                return;
              }
            }
          }
        }
    }

    final static void a(int param0, int param1, int param2, int param3) {
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
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        L0: {
          var4 = param2 * param2;
          var5 = param0 - param2 >> 4;
          var6 = param0 + 15 >> 4;
          var7 = param0 + param2 + 15 >> 4;
          var8 = param1 - param2 >> 4;
          var9 = param1 + 15 >> 4;
          var10 = param1 + param2 + 15 >> 4;
          if (var5 >= 0) {
            break L0;
          } else {
            var5 = 0;
            break L0;
          }
        }
        L1: {
          if (var7 <= 640) {
            break L1;
          } else {
            var7 = 640;
            break L1;
          }
        }
        L2: {
          if (var8 >= 0) {
            break L2;
          } else {
            var8 = 0;
            break L2;
          }
        }
        L3: {
          if (var10 <= ra.field_e) {
            break L3;
          } else {
            var10 = ra.field_e;
            break L3;
          }
        }
        L4: {
          if (var6 >= 0) {
            break L4;
          } else {
            var6 = 0;
            break L4;
          }
        }
        L5: {
          if (var6 <= 640) {
            break L5;
          } else {
            var6 = 640;
            break L5;
          }
        }
        L6: {
          if (var9 >= 0) {
            break L6;
          } else {
            var9 = 0;
            break L6;
          }
        }
        L7: {
          if (var9 <= ra.field_e) {
            break L7;
          } else {
            var9 = ra.field_e;
            break L7;
          }
        }
        var11 = (var6 << 4) - param0;
        var11 = var11 * var11;
        var12 = (var6 + 1 << 4) - param0;
        var12 = var12 * var12;
        var13 = (var6 + 2 << 4) - param0;
        var13 = var13 * var13;
        var14 = var12 - var11;
        var15 = var13 - var12;
        var16 = var15 - var14;
        var17 = (var9 << 4) - param1;
        var17 = var17 * var17;
        var18 = (var9 + 1 << 4) - param1;
        var18 = var18 * var18;
        var19 = (var9 + 2 << 4) - param1;
        var19 = var19 * var19;
        var20 = var18 - var17;
        var21 = var19 - var18;
        var22 = var21 - var20;
        var23 = 16;
        var24 = var4;
        L8: while (true) {
          if (var4 <= 2147483647 >>> var23) {
            var25 = var9 * 640 + var6;
            var26 = var11 + var17;
            var27 = var20;
            var28 = var9;
            L9: while (true) {
              if (var28 >= var10) {
                var25 = var9 * 640 + var6;
                var26 = var11 + var17;
                var27 = var20;
                var28 = var9 - 1;
                L10: while (true) {
                  if (var28 < var8) {
                    return;
                  } else {
                    var27 = var27 - var22;
                    var26 = var26 - var27;
                    var25 -= 640;
                    rf.b(var28, var26, var14, var16, var23, var4, var24, var5, var6, var7, 10000, var25, param0, param1);
                    var28--;
                    continue L10;
                  }
                }
              } else {
                rf.a(var28, var26, var14, var16, var23, var4, var24, var5, var6, var7, 10000, var25, param0, param1);
                var26 = var26 + var27;
                var27 = var27 + var22;
                var25 += 640;
                var28++;
                continue L9;
              }
            }
          } else {
            var23--;
            var24 = var24 + 1 >>> 1;
            continue L8;
          }
        }
    }

    public static void b(int param0) {
        field_a = null;
        int var1 = 0;
    }

    private final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13) {
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
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        var14 = (param0 << 4) - param13;
        var15 = param11;
        var16 = param1;
        var17 = param2;
        var18 = param8;
        L0: while (true) {
          L1: {
            if (var18 >= param9) {
              break L1;
            } else {
              if (var16 >= param5) {
                break L1;
              } else {
                L2: {
                  var19 = (var18 << 4) - param12;
                  var20 = (var16 << param4) / param6;
                  var21 = ce.field_e[var20] * param10 >> 15;
                  var22 = var18 + (var19 * var21 + 131072 >> 18);
                  if (var22 <= 639) {
                    break L2;
                  } else {
                    var22 = 639;
                    break L2;
                  }
                }
                L3: {
                  var23 = param0 + (var14 * var21 + 131072 >> 18);
                  if (var23 <= ra.field_e - 1) {
                    break L3;
                  } else {
                    var23 = ra.field_e - 1;
                    break L3;
                  }
                }
                var24 = ra.field_b[var23 * 640 + var22];
                var25 = 64;
                if (var25 >= 0) {
                  var26 = (var24 & 16711935) * var25;
                  var25 = (var24 & 65280) * var25;
                  var24 = (var26 & 1069563840) + (var25 & 4177920);
                  var26 = (var26 & -1073692672) + (var25 & 12582912);
                  var26 = (var26 | var26 >>> 1) & 1077952512;
                  int incrementValue$1 = var15;
                  var15++;
                  ra.field_b[incrementValue$1] = (var24 | var26 - (var26 >>> 8)) >>> 6;
                  var16 = var16 + var17;
                  var17 = var17 + param3;
                  var18++;
                  continue L0;
                } else {
                  throw new Error();
                }
              }
            }
          }
          var15 = param11;
          var16 = param1;
          var17 = param2;
          var18 = param8 - 1;
          L4: while (true) {
            if (var18 < param7) {
              return;
            } else {
              var17 = var17 - param3;
              var16 = var16 - var17;
              if (var16 < param5) {
                L5: {
                  var19 = (var18 << 4) - param12;
                  var20 = (var16 << param4) / param6;
                  var21 = ce.field_e[var20] * param10 >> 15;
                  var22 = var18 + (var19 * var21 + 131072 >> 18);
                  if (var22 >= 0) {
                    break L5;
                  } else {
                    var22 = 0;
                    break L5;
                  }
                }
                L6: {
                  var23 = param0 + (var14 * var21 + 131072 >> 18);
                  if (var23 <= ra.field_e - 1) {
                    break L6;
                  } else {
                    var23 = ra.field_e - 1;
                    break L6;
                  }
                }
                L7: {
                  var24 = ra.field_b[var23 * 640 + var22];
                  var25 = 64;
                  if (var25 >= 0) {
                    break L7;
                  } else {
                    var25 = -var25;
                    break L7;
                  }
                }
                var26 = (var24 & 16711935) * var25;
                var25 = (var24 & 65280) * var25;
                var24 = (var26 & 1069563840) + (var25 & 4177920);
                var26 = (var26 & -1073692672) + (var25 & 12582912);
                var26 = (var26 | var26 >>> 1) & 1077952512;
                var15--;
                ra.field_b[var15] = (var24 | var26 - (var26 >>> 8)) >>> 6;
                var18--;
                continue L4;
              } else {
                return;
              }
            }
          }
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
            io.field_i = ic.field_e;
            nj.field_g = bj.field_b;
            var14 = param12;
            L1: while (true) {
              if (var14 >= 0) {
                param7 = param7 + param13;
                param11++;
                kl.field_b = kl.field_b + param9;
                ud.field_Sb = ud.field_Sb + param10;
                continue L0;
              } else {
                L2: {
                  param1 = nj.field_g - kl.field_b >> 16;
                  if (param1 >= -param2) {
                    if (param1 <= param2) {
                      param0 = io.field_i + ud.field_Sb >> 16;
                      if (param0 >= -param2) {
                        if (param0 <= param5 + param2) {
                          L3: {
                            if (param0 >= param2) {
                              if (param0 <= param5 - param2) {
                                stackOut_15_0 = param8;
                                stackIn_16_0 = stackOut_15_0;
                                break L3;
                              } else {
                                stackOut_14_0 = (param5 + param2 - param0) * ng.field_n >> 8;
                                stackIn_16_0 = stackOut_14_0;
                                break L3;
                              }
                            } else {
                              stackOut_12_0 = (param0 + param2) * ng.field_n >> 8;
                              stackIn_16_0 = stackOut_12_0;
                              break L3;
                            }
                          }
                          L4: {
                            param3 = stackIn_16_0;
                            param4 = param1 * param3 * dk.field_b >> 8;
                            if (param4 < 0) {
                              stackOut_18_0 = bg.field_k[param3 + param4];
                              stackIn_19_0 = stackOut_18_0;
                              break L4;
                            } else {
                              stackOut_17_0 = bg.field_k[param3 - param4];
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
                io.field_i = io.field_i + param9;
                nj.field_g = nj.field_g + param10;
                continue L1;
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 0;
        field_a = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, 2147483647, -1};
    }
}
