/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class di {
    static String field_a;
    static String field_c;
    static bd[] field_b;

    final static void a(int param0, int param1, pf param2, int param3, int param4, int param5, int param6, int param7) {
        RuntimeException var8 = null;
        int[] var8_array = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        Object var21 = null;
        u var21_ref = null;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int var40 = 0;
        int[] var41 = null;
        byte[] var43 = null;
        int var44 = 0;
        pf var45 = null;
        int[] var49 = null;
        int[] var53 = null;
        int[] var57 = null;
        int[] var59 = null;
        int[] var60 = null;
        int[] var61 = null;
        int[] var62 = null;
        int[] var63 = null;
        int stackIn_14_0 = 0;
        int[] stackIn_15_0 = null;
        int[] stackIn_16_0 = null;
        int[] stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        int stackIn_23_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_29_0 = 0;
        u stackIn_37_0 = null;
        int stackIn_43_0 = 0;
        int stackIn_47_0 = 0;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        String stackIn_53_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_22_0 = 0;
        short stackOut_21_0 = 0;
        int stackOut_25_0 = 0;
        short stackOut_24_0 = 0;
        short stackOut_28_0 = 0;
        int stackOut_27_0 = 0;
        u stackOut_36_0 = null;
        Object stackOut_35_0 = null;
        int stackOut_46_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int[] stackOut_14_0 = null;
        int[] stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        int[] stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        String stackOut_52_2 = null;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        String stackOut_51_2 = null;
        var40 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                var45 = param2;
                if (null == var45.field_x) {
                  break L2;
                } else {
                  if (var45.field_f <= 1) {
                    break L2;
                  } else {
                    var43 = var45.field_x;
                    int discarded$2 = 8965;
                    jc.a(ke.field_z, 0, 0, var43);
                    break L1;
                  }
                }
              }
              int discarded$3 = -122;
              jc.a();
              break L1;
            }
            var62 = new int[param2.field_L];
            var57 = var62;
            var53 = var57;
            var49 = var53;
            var41 = var49;
            var8_array = var41;
            var63 = new int[param2.field_L];
            var60 = oa.field_c;
            var59 = in.field_c;
            var61 = dl.field_o;
            var13 = 0;
            L3: while (true) {
              if (~param2.field_L >= ~var13) {
                var44 = 0;
                var13 = var44;
                L4: while (true) {
                  if (var44 >= th.field_Lb) {
                    break L0;
                  } else {
                    L5: {
                      var14 = lh.field_d[var44];
                      var15 = param2.field_i[var14];
                      var16 = param2.field_P[var14];
                      var17 = param2.field_z[var14];
                      if (param2.field_m[var14] >= oa.field_c.length) {
                        stackOut_22_0 = -1;
                        stackIn_23_0 = stackOut_22_0;
                        break L5;
                      } else {
                        stackOut_21_0 = param2.field_m[var14];
                        stackIn_23_0 = stackOut_21_0;
                        break L5;
                      }
                    }
                    L6: {
                      var18 = stackIn_23_0;
                      if (param2.field_y[var14] >= oa.field_c.length) {
                        stackOut_25_0 = -1;
                        stackIn_26_0 = stackOut_25_0;
                        break L6;
                      } else {
                        stackOut_24_0 = param2.field_y[var14];
                        stackIn_26_0 = stackOut_24_0;
                        break L6;
                      }
                    }
                    L7: {
                      var19 = stackIn_26_0;
                      if (oa.field_c.length > param2.field_q[var14]) {
                        stackOut_28_0 = param2.field_q[var14];
                        stackIn_29_0 = stackOut_28_0;
                        break L7;
                      } else {
                        stackOut_27_0 = -1;
                        stackIn_29_0 = stackOut_27_0;
                        break L7;
                      }
                    }
                    L8: {
                      L9: {
                        var20 = stackIn_29_0;
                        if (ce.field_f == null) {
                          break L9;
                        } else {
                          if (null == param2.field_g) {
                            break L9;
                          } else {
                            if (var14 >= param2.field_g.length) {
                              break L9;
                            } else {
                              if (param2.field_g[var14] == -1) {
                                break L9;
                              } else {
                                if (~ce.field_f.length < ~param2.field_g[var14]) {
                                  stackOut_36_0 = ce.field_f[param2.field_g[var14]];
                                  stackIn_37_0 = stackOut_36_0;
                                  break L8;
                                } else {
                                  break L9;
                                }
                              }
                            }
                          }
                        }
                      }
                      stackOut_35_0 = null;
                      stackIn_37_0 = (u) (Object) stackOut_35_0;
                      break L8;
                    }
                    L10: {
                      L11: {
                        var21_ref = stackIn_37_0;
                        var22 = tb.field_K[var15];
                        var23 = lc.field_c[var15];
                        var24 = tb.field_K[var16];
                        var25 = lc.field_c[var16];
                        var26 = tb.field_K[var17];
                        var27 = lc.field_c[var17];
                        if (var18 != var19) {
                          break L11;
                        } else {
                          if (var20 == var19) {
                            L12: {
                              var28 = var62[var18];
                              var29 = var63[var18];
                              if (var21_ref != null) {
                                stackOut_46_0 = var21_ref.field_i;
                                stackIn_47_0 = stackOut_46_0;
                                break L12;
                              } else {
                                stackOut_45_0 = 8355711;
                                stackIn_47_0 = stackOut_45_0;
                                break L12;
                              }
                            }
                            var30 = stackIn_47_0;
                            var31 = 16711935 & var30;
                            var32 = var30 & 65280;
                            var33 = (var32 * var28 & 16711842) >>> 8 | (var31 * var28 & -16711843) >>> 8;
                            var33 = var33 + 65793 * var29;
                            oe.a(var22, (byte) -121, var23, var26, 8355711 & var33 >> 1, var25, var27, var24);
                            break L10;
                          } else {
                            break L11;
                          }
                        }
                      }
                      L13: {
                        var28 = var62[var18];
                        var29 = var62[var19];
                        var30 = var62[var20];
                        var31 = var63[var18];
                        var32 = var63[var19];
                        var33 = var63[var20];
                        if (var21_ref != null) {
                          stackOut_42_0 = var21_ref.field_i;
                          stackIn_43_0 = stackOut_42_0;
                          break L13;
                        } else {
                          stackOut_41_0 = 8355711;
                          stackIn_43_0 = stackOut_41_0;
                          break L13;
                        }
                      }
                      var34 = stackIn_43_0;
                      var35 = var34 & 16711935;
                      var36 = var34 & 65280;
                      var37 = var28 * var35 >>> 8 & 738132223 | -1207894272 & var36 * var28 >>> 8;
                      var38 = (var35 * var29 & -16711797) >>> 8 | (16711793 & var29 * var36) >>> 8;
                      var37 = var37 + var31 * 65793;
                      var38 = var38 + 65793 * var32;
                      var39 = var30 * var35 >>> 8 & -536936193 | 1040252672 & var30 * var36 >>> 8;
                      var39 = var39 + var33 * 65793;
                      ml.a(var25, var39 >> 16, var22, var37 & 255, 255 & var38 >> 8, var39 & 255, var27, var37 >> 16, var23, 255 & var38, var24, (var37 & 65322) >> 8, 255 & var39 >> 8, var38 >> 16, false, var26);
                      break L10;
                    }
                    var44++;
                    continue L4;
                  }
                }
              } else {
                L14: {
                  var14 = param1 * var59[var13] + var60[var13] * param5 + var61[var13] * param0 >> 8;
                  if (var14 >= 0) {
                    break L14;
                  } else {
                    var14 = -var14;
                    break L14;
                  }
                }
                L15: {
                  if (var14 < 0) {
                    stackOut_13_0 = 128;
                    stackIn_14_0 = stackOut_13_0;
                    break L15;
                  } else {
                    if (var14 < 128) {
                      stackOut_12_0 = var14 + 128;
                      stackIn_14_0 = stackOut_12_0;
                      break L15;
                    } else {
                      stackOut_11_0 = 256;
                      stackIn_14_0 = stackOut_11_0;
                      break L15;
                    }
                  }
                }
                L16: {
                  var14 = stackIn_14_0;
                  var15 = param7 * var61[var13] + param3 * var60[var13] - -(param6 * var59[var13]) >> 8;
                  stackOut_14_0 = pk.field_i;
                  stackIn_16_0 = stackOut_14_0;
                  stackIn_15_0 = stackOut_14_0;
                  if (var15 < 0) {
                    stackOut_16_0 = (int[]) (Object) stackIn_16_0;
                    stackOut_16_1 = -var15;
                    stackIn_17_0 = stackOut_16_0;
                    stackIn_17_1 = stackOut_16_1;
                    break L16;
                  } else {
                    stackOut_15_0 = (int[]) (Object) stackIn_15_0;
                    stackOut_15_1 = var15;
                    stackIn_17_0 = stackOut_15_0;
                    stackIn_17_1 = stackOut_15_1;
                    break L16;
                  }
                }
                var15 = stackIn_17_0[stackIn_17_1];
                var14 = (-var15 + 256) * var14 >>> 8;
                var62[var13] = var14;
                var63[var13] = var15;
                var13++;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L17: {
            var8 = decompiledCaughtException;
            stackOut_50_0 = (RuntimeException) var8;
            stackOut_50_1 = new StringBuilder().append("di.C(").append(param0).append(',').append(param1).append(',');
            stackIn_52_0 = stackOut_50_0;
            stackIn_52_1 = stackOut_50_1;
            stackIn_51_0 = stackOut_50_0;
            stackIn_51_1 = stackOut_50_1;
            if (param2 == null) {
              stackOut_52_0 = (RuntimeException) (Object) stackIn_52_0;
              stackOut_52_1 = (StringBuilder) (Object) stackIn_52_1;
              stackOut_52_2 = "null";
              stackIn_53_0 = stackOut_52_0;
              stackIn_53_1 = stackOut_52_1;
              stackIn_53_2 = stackOut_52_2;
              break L17;
            } else {
              stackOut_51_0 = (RuntimeException) (Object) stackIn_51_0;
              stackOut_51_1 = (StringBuilder) (Object) stackIn_51_1;
              stackOut_51_2 = "{...}";
              stackIn_53_0 = stackOut_51_0;
              stackIn_53_1 = stackOut_51_1;
              stackIn_53_2 = stackOut_51_2;
              break L17;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_53_0, stackIn_53_2 + ',' + param3 + ',' + -536936193 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    public static void a() {
        field_b = null;
        field_c = null;
        field_a = null;
    }

    final static int a(double param0, int param1, double param2, double param3) {
        RuntimeException var7 = null;
        int var7_int = 0;
        double var8 = 0.0;
        double var10 = 0.0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int stackIn_23_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_59_0 = 0;
        int stackIn_64_0 = 0;
        int stackIn_69_0 = 0;
        int stackIn_74_0 = 0;
        int stackIn_79_0 = 0;
        int stackIn_83_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_47_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_68_0 = 0;
        int stackOut_73_0 = 0;
        int stackOut_58_0 = 0;
        int stackOut_63_0 = 0;
        int stackOut_82_0 = 0;
        int stackOut_81_0 = 0;
        int stackOut_78_0 = 0;
        int stackOut_77_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_22_0 = 0;
        var17 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              var7_int = 90;
              param3 = param3 * 0.02454369260617026;
              var8 = -Math.sin(param3);
              var10 = -Math.cos(param3);
              var12 = (int)param2;
              if ((double)var12 > param2) {
                var12--;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              var13 = (int)param0;
              if ((double)var13 <= param0) {
                break L2;
              } else {
                var13--;
                break L2;
              }
            }
            param2 = param2 - (double)var12;
            param0 = param0 - (double)var13;
            var14 = var12;
            var15 = var13;
            var16 = var12 + var13 * ln.field_a.field_d;
            L3: while (true) {
              if (ln.field_a.field_c[var16] == 2) {
                if (var12 != var14) {
                  if (var15 != var13) {
                    L4: {
                      if (var12 <= var14) {
                        L5: {
                          if (0.0 >= var10) {
                            break L5;
                          } else {
                            if (2 == ln.field_a.field_c[-ln.field_a.field_d + var16]) {
                              stackOut_47_0 = 64;
                              stackIn_48_0 = stackOut_47_0;
                              return stackIn_48_0;
                            } else {
                              break L5;
                            }
                          }
                        }
                        if (var10 >= 0.0) {
                          break L4;
                        } else {
                          if (ln.field_a.field_c[ln.field_a.field_d + var16] == 2) {
                            stackOut_52_0 = 64;
                            stackIn_53_0 = stackOut_52_0;
                            return stackIn_53_0;
                          } else {
                            break L4;
                          }
                        }
                      } else {
                        L6: {
                          if (var10 <= 0.0) {
                            break L6;
                          } else {
                            if (ln.field_a.field_c[-ln.field_a.field_d + var16] == 2) {
                              stackOut_38_0 = 192;
                              stackIn_39_0 = stackOut_38_0;
                              return stackIn_39_0;
                            } else {
                              break L6;
                            }
                          }
                        }
                        if (0.0 <= var10) {
                          break L4;
                        } else {
                          if (ln.field_a.field_c[var16 + ln.field_a.field_d] != 2) {
                            break L4;
                          } else {
                            stackOut_42_0 = 192;
                            stackIn_43_0 = stackOut_42_0;
                            return stackIn_43_0;
                          }
                        }
                      }
                    }
                    L7: {
                      if (var15 >= var13) {
                        L8: {
                          if (0.0 <= var8) {
                            break L8;
                          } else {
                            if (-3 == ln.field_a.field_c[var16 + 1]) {
                              stackOut_68_0 = 0;
                              stackIn_69_0 = stackOut_68_0;
                              return stackIn_69_0;
                            } else {
                              break L8;
                            }
                          }
                        }
                        if (var8 <= 0.0) {
                          break L7;
                        } else {
                          if (ln.field_a.field_c[var16 - 1] == 2) {
                            stackOut_73_0 = 0;
                            stackIn_74_0 = stackOut_73_0;
                            return stackIn_74_0;
                          } else {
                            break L7;
                          }
                        }
                      } else {
                        L9: {
                          if (0.0 <= var8) {
                            break L9;
                          } else {
                            if (ln.field_a.field_c[var16 - -1] == 2) {
                              stackOut_58_0 = 128;
                              stackIn_59_0 = stackOut_58_0;
                              return stackIn_59_0;
                            } else {
                              break L9;
                            }
                          }
                        }
                        if (0.0 >= var8) {
                          break L7;
                        } else {
                          if (ln.field_a.field_c[-1 + var16] == -3) {
                            stackOut_63_0 = 128;
                            stackIn_64_0 = stackOut_63_0;
                            return stackIn_64_0;
                          } else {
                            break L7;
                          }
                        }
                      }
                    }
                    if (var12 <= var14) {
                      L10: {
                        if (var15 < var13) {
                          stackOut_82_0 = 96;
                          stackIn_83_0 = stackOut_82_0;
                          break L10;
                        } else {
                          stackOut_81_0 = 32;
                          stackIn_83_0 = stackOut_81_0;
                          break L10;
                        }
                      }
                      break L0;
                    } else {
                      L11: {
                        if (var13 <= var15) {
                          stackOut_78_0 = 224;
                          stackIn_79_0 = stackOut_78_0;
                          break L11;
                        } else {
                          stackOut_77_0 = 160;
                          stackIn_79_0 = stackOut_77_0;
                          break L11;
                        }
                      }
                      return stackIn_79_0;
                    }
                  } else {
                    L12: {
                      if (var12 > var14) {
                        stackOut_32_0 = 192;
                        stackIn_33_0 = stackOut_32_0;
                        break L12;
                      } else {
                        stackOut_31_0 = 64;
                        stackIn_33_0 = stackOut_31_0;
                        break L12;
                      }
                    }
                    return stackIn_33_0;
                  }
                } else {
                  L13: {
                    if (var15 < var13) {
                      stackOut_27_0 = 128;
                      stackIn_28_0 = stackOut_27_0;
                      break L13;
                    } else {
                      stackOut_26_0 = 0;
                      stackIn_28_0 = stackOut_26_0;
                      break L13;
                    }
                  }
                  return stackIn_28_0;
                }
              } else {
                L14: {
                  var12 = var14;
                  var13 = var15;
                  param2 = param2 + var8;
                  param0 = param0 + var10;
                  if (1.0 > param2) {
                    if (0.0 > param2) {
                      param2 = param2 + 1.0;
                      var14--;
                      var16--;
                      break L14;
                    } else {
                      break L14;
                    }
                  } else {
                    var14++;
                    param2 = param2 - 1.0;
                    var16++;
                    break L14;
                  }
                }
                L15: {
                  if (1.0 > param0) {
                    if (0.0 <= param0) {
                      break L15;
                    } else {
                      param0 = param0 + 1.0;
                      var16 = var16 - ln.field_a.field_d;
                      var15--;
                      break L15;
                    }
                  } else {
                    var15++;
                    var16 = var16 + ln.field_a.field_d;
                    param0 = param0 - 1.0;
                    break L15;
                  }
                }
                L16: {
                  if (ln.field_a.field_d <= var14) {
                    break L16;
                  } else {
                    if (var14 < 0) {
                      break L16;
                    } else {
                      if (var15 >= ln.field_a.field_a) {
                        break L16;
                      } else {
                        if (var15 >= 0) {
                          continue L3;
                        } else {
                          break L16;
                        }
                      }
                    }
                  }
                }
                stackOut_22_0 = 128;
                stackIn_23_0 = stackOut_22_0;
                return stackIn_23_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw wg.a((Throwable) (Object) var7, "di.B(" + param0 + ',' + 124 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_83_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Visit the Account Management section on the main site to view.";
        field_c = "<col=ffffff>Rocket<nbsp>launcher</col><br>The rocket launcher fires electromagnetic pulse (EMP) rockets that instantly disable electrical equipment. The blast is also effective against groups of organic targets.";
    }
}
