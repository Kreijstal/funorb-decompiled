/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class kc {
    private long[] field_f;
    private int field_b;
    static int[] field_l;
    private long[] field_a;
    private byte[] field_g;
    private byte[] field_k;
    static int field_c;
    private int field_i;
    private long[] field_j;
    static byte[] field_d;
    static ke[] field_m;
    private long[] field_h;
    private long[] field_e;

    final static void a(int param0, int param1) {
        try {
            IOException iOException = null;
            Throwable decompiledCaughtException = null;
            L0: {
              if (null == jc.field_b) {
                break L0;
              } else {
                L1: {
                  if (0 > param0) {
                    break L1;
                  } else {
                    if (gg.field_b != uf.field_m) {
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
                L2: {
                  if ((ed.field_q.field_h ^ -1) != -1) {
                    break L2;
                  } else {
                    if (rf.c(0) > p.field_c - -10000L) {
                      ed.field_q.h(param0, param1 ^ -1);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  if ((ed.field_q.field_h ^ -1) < param1) {
                    try {
                      L4: {
                        jc.field_b.a(ed.field_q.field_j, ed.field_q.field_h, 120, 0);
                        p.field_c = rf.c(0);
                        break L4;
                      }
                    } catch (java.io.IOException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L5: {
                        iOException = (IOException) (Object) decompiledCaughtException;
                        ck.b((byte) -37);
                        break L5;
                      }
                    }
                    ed.field_q.field_h = 0;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                return;
              }
            }
            ed.field_q.field_h = 0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        if (param0 != 0) {
            return;
        }
        field_m = null;
        field_d = null;
        field_l = null;
    }

    final static void a(int param0, int param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int[] param8, int param9) {
        int incrementValue$10 = 0;
        int incrementValue$11 = 0;
        int incrementValue$12 = 0;
        int incrementValue$13 = 0;
        int incrementValue$14 = 0;
        int incrementValue$15 = 0;
        int incrementValue$16 = 0;
        int incrementValue$17 = 0;
        int incrementValue$18 = 0;
        int incrementValue$19 = 0;
        RuntimeException var10 = null;
        int var10_int = 0;
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
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_17_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_44_0 = 0;
        int stackIn_58_0 = 0;
        int stackIn_65_0 = 0;
        int stackIn_76_0 = 0;
        int stackIn_83_0 = 0;
        int stackIn_92_0 = 0;
        int stackIn_92_1 = 0;
        int stackIn_102_0 = 0;
        int stackIn_109_0 = 0;
        int stackIn_115_0 = 0;
        int stackIn_115_1 = 0;
        RuntimeException stackIn_118_0 = null;
        StringBuilder stackIn_118_1 = null;
        RuntimeException stackIn_119_0 = null;
        StringBuilder stackIn_119_1 = null;
        RuntimeException stackIn_120_0 = null;
        StringBuilder stackIn_120_1 = null;
        String stackIn_120_2 = null;
        RuntimeException stackIn_121_0 = null;
        StringBuilder stackIn_121_1 = null;
        RuntimeException stackIn_122_0 = null;
        StringBuilder stackIn_122_1 = null;
        RuntimeException stackIn_123_0 = null;
        StringBuilder stackIn_123_1 = null;
        String stackIn_123_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_57_0 = 0;
        int stackOut_56_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_64_0 = 0;
        int stackOut_63_0 = 0;
        int stackOut_61_0 = 0;
        int stackOut_60_0 = 0;
        int stackOut_75_0 = 0;
        int stackOut_74_0 = 0;
        int stackOut_72_0 = 0;
        int stackOut_71_0 = 0;
        int stackOut_82_0 = 0;
        int stackOut_81_0 = 0;
        int stackOut_79_0 = 0;
        int stackOut_78_0 = 0;
        int stackOut_91_0 = 0;
        int stackOut_91_1 = 0;
        int stackOut_101_0 = 0;
        int stackOut_100_0 = 0;
        int stackOut_98_0 = 0;
        int stackOut_97_0 = 0;
        int stackOut_108_0 = 0;
        int stackOut_107_0 = 0;
        int stackOut_105_0 = 0;
        int stackOut_104_0 = 0;
        int stackOut_114_0 = 0;
        int stackOut_114_1 = 0;
        RuntimeException stackOut_117_0 = null;
        StringBuilder stackOut_117_1 = null;
        RuntimeException stackOut_119_0 = null;
        StringBuilder stackOut_119_1 = null;
        String stackOut_119_2 = null;
        RuntimeException stackOut_118_0 = null;
        StringBuilder stackOut_118_1 = null;
        String stackOut_118_2 = null;
        RuntimeException stackOut_120_0 = null;
        StringBuilder stackOut_120_1 = null;
        RuntimeException stackOut_122_0 = null;
        StringBuilder stackOut_122_1 = null;
        String stackOut_122_2 = null;
        RuntimeException stackOut_121_0 = null;
        StringBuilder stackOut_121_1 = null;
        String stackOut_121_2 = null;
        var22 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var10_int = -(param1 >> 1169880194);
              param1 = -(param1 & 3);
              if (param6 == 8) {
                break L1;
              } else {
                field_c = 87;
                break L1;
              }
            }
            var11 = -param0;
            L2: while (true) {
              L3: {
                if (var11 >= 0) {
                  break L3;
                } else {
                  if (var22 != 0) {
                    decompiledRegionSelector0 = 0;
                    break L0;
                  } else {
                    var12 = var10_int;
                    L4: while (true) {
                      L5: {
                        L6: {
                          if (var12 >= 0) {
                            break L6;
                          } else {
                            incrementValue$10 = param3;
                            param3++;
                            param4 = param8[incrementValue$10];
                            stackOut_8_0 = 0;
                            stackOut_8_1 = param4;
                            stackIn_115_0 = stackOut_8_0;
                            stackIn_115_1 = stackOut_8_1;
                            stackIn_9_0 = stackOut_8_0;
                            stackIn_9_1 = stackOut_8_1;
                            if (var22 != 0) {
                              break L5;
                            } else {
                              L7: {
                                L8: {
                                  if (stackIn_9_0 == stackIn_9_1) {
                                    break L8;
                                  } else {
                                    L9: {
                                      var13 = 255 & param4 >> -180184752;
                                      var14 = param4 >> 1870134088 & 255;
                                      var15 = 255 & param4;
                                      var16 = param2[param7];
                                      var17 = (16768750 & var16) >> 822166448;
                                      var18 = 15 & var16 >> -1207387096;
                                      var19 = var16 & 255;
                                      if ((var14 ^ -1) > (var13 ^ -1)) {
                                        if (var15 < var13) {
                                          stackOut_16_0 = var13;
                                          stackIn_17_0 = stackOut_16_0;
                                          break L9;
                                        } else {
                                          stackOut_15_0 = var15;
                                          stackIn_17_0 = stackOut_15_0;
                                          break L9;
                                        }
                                      } else {
                                        if (var14 > var15) {
                                          stackOut_13_0 = var14;
                                          stackIn_17_0 = stackOut_13_0;
                                          break L9;
                                        } else {
                                          stackOut_12_0 = var15;
                                          stackIn_17_0 = stackOut_12_0;
                                          break L9;
                                        }
                                      }
                                    }
                                    L10: {
                                      var20 = stackIn_17_0;
                                      if (var18 >= var17) {
                                        if ((var19 ^ -1) <= (var18 ^ -1)) {
                                          stackOut_23_0 = var19;
                                          stackIn_24_0 = stackOut_23_0;
                                          break L10;
                                        } else {
                                          stackOut_22_0 = var18;
                                          stackIn_24_0 = stackOut_22_0;
                                          break L10;
                                        }
                                      } else {
                                        if (var17 > var19) {
                                          stackOut_20_0 = var17;
                                          stackIn_24_0 = stackOut_20_0;
                                          break L10;
                                        } else {
                                          stackOut_19_0 = var19;
                                          stackIn_24_0 = stackOut_19_0;
                                          break L10;
                                        }
                                      }
                                    }
                                    L11: {
                                      var21 = stackIn_24_0;
                                      if (var20 > var21) {
                                        param4 = var21 * var14 / var20 << 1670499240 | var21 * var13 / var20 << 73378000 | var21 * var15 / var20;
                                        break L11;
                                      } else {
                                        break L11;
                                      }
                                    }
                                    incrementValue$11 = param7;
                                    param7++;
                                    param2[incrementValue$11] = param4;
                                    if (var22 == 0) {
                                      break L7;
                                    } else {
                                      break L8;
                                    }
                                  }
                                }
                                param7++;
                                break L7;
                              }
                              L12: {
                                L13: {
                                  incrementValue$12 = param3;
                                  param3++;
                                  param4 = param8[incrementValue$12];
                                  if (0 == param4) {
                                    break L13;
                                  } else {
                                    L14: {
                                      var13 = (param4 & 16771522) >> 714058096;
                                      var14 = (param4 & 65535) >> -133897304;
                                      var15 = param4 & 255;
                                      var16 = param2[param7];
                                      var17 = (16751732 & var16) >> 689844688;
                                      var18 = (3998 & var16) >> 1773268840;
                                      var19 = 255 & var16;
                                      if ((var13 ^ -1) >= (var14 ^ -1)) {
                                        if ((var14 ^ -1) >= (var15 ^ -1)) {
                                          stackOut_36_0 = var15;
                                          stackIn_37_0 = stackOut_36_0;
                                          break L14;
                                        } else {
                                          stackOut_35_0 = var14;
                                          stackIn_37_0 = stackOut_35_0;
                                          break L14;
                                        }
                                      } else {
                                        if ((var13 ^ -1) < (var15 ^ -1)) {
                                          stackOut_33_0 = var13;
                                          stackIn_37_0 = stackOut_33_0;
                                          break L14;
                                        } else {
                                          stackOut_32_0 = var15;
                                          stackIn_37_0 = stackOut_32_0;
                                          break L14;
                                        }
                                      }
                                    }
                                    L15: {
                                      var20 = stackIn_37_0;
                                      if ((var18 ^ -1) > (var17 ^ -1)) {
                                        if (var17 > var19) {
                                          stackOut_43_0 = var17;
                                          stackIn_44_0 = stackOut_43_0;
                                          break L15;
                                        } else {
                                          stackOut_42_0 = var19;
                                          stackIn_44_0 = stackOut_42_0;
                                          break L15;
                                        }
                                      } else {
                                        if ((var19 ^ -1) > (var18 ^ -1)) {
                                          stackOut_40_0 = var18;
                                          stackIn_44_0 = stackOut_40_0;
                                          break L15;
                                        } else {
                                          stackOut_39_0 = var19;
                                          stackIn_44_0 = stackOut_39_0;
                                          break L15;
                                        }
                                      }
                                    }
                                    L16: {
                                      var21 = stackIn_44_0;
                                      if ((var20 ^ -1) >= (var21 ^ -1)) {
                                        break L16;
                                      } else {
                                        param4 = var13 * var21 / var20 << -1156533456 | var21 * var14 / var20 << 1296576584 | var15 * var21 / var20;
                                        break L16;
                                      }
                                    }
                                    incrementValue$13 = param7;
                                    param7++;
                                    param2[incrementValue$13] = param4;
                                    if (var22 == 0) {
                                      break L12;
                                    } else {
                                      break L13;
                                    }
                                  }
                                }
                                param7++;
                                break L12;
                              }
                              L17: {
                                L18: {
                                  incrementValue$14 = param3;
                                  param3++;
                                  param4 = param8[incrementValue$14];
                                  if ((param4 ^ -1) != -1) {
                                    break L18;
                                  } else {
                                    param7++;
                                    if (var22 == 0) {
                                      break L17;
                                    } else {
                                      break L18;
                                    }
                                  }
                                }
                                L19: {
                                  var13 = (16730233 & param4) >> 1541067664;
                                  var14 = (param4 & 65406) >> -749200504;
                                  var15 = param4 & 255;
                                  var16 = param2[param7];
                                  var17 = (var16 & 16775412) >> 1773562384;
                                  var18 = (var16 & 4043) >> 1436800936;
                                  var19 = var16 & 255;
                                  if ((var13 ^ -1) < (var14 ^ -1)) {
                                    if ((var15 ^ -1) <= (var13 ^ -1)) {
                                      stackOut_57_0 = var15;
                                      stackIn_58_0 = stackOut_57_0;
                                      break L19;
                                    } else {
                                      stackOut_56_0 = var13;
                                      stackIn_58_0 = stackOut_56_0;
                                      break L19;
                                    }
                                  } else {
                                    if ((var14 ^ -1) >= (var15 ^ -1)) {
                                      stackOut_54_0 = var15;
                                      stackIn_58_0 = stackOut_54_0;
                                      break L19;
                                    } else {
                                      stackOut_53_0 = var14;
                                      stackIn_58_0 = stackOut_53_0;
                                      break L19;
                                    }
                                  }
                                }
                                L20: {
                                  var20 = stackIn_58_0;
                                  if ((var18 ^ -1) > (var17 ^ -1)) {
                                    if (var17 <= var19) {
                                      stackOut_64_0 = var19;
                                      stackIn_65_0 = stackOut_64_0;
                                      break L20;
                                    } else {
                                      stackOut_63_0 = var17;
                                      stackIn_65_0 = stackOut_63_0;
                                      break L20;
                                    }
                                  } else {
                                    if ((var18 ^ -1) >= (var19 ^ -1)) {
                                      stackOut_61_0 = var19;
                                      stackIn_65_0 = stackOut_61_0;
                                      break L20;
                                    } else {
                                      stackOut_60_0 = var18;
                                      stackIn_65_0 = stackOut_60_0;
                                      break L20;
                                    }
                                  }
                                }
                                L21: {
                                  var21 = stackIn_65_0;
                                  if (var20 <= var21) {
                                    break L21;
                                  } else {
                                    param4 = var15 * var21 / var20 | (var13 * var21 / var20 << -1116122352 | var14 * var21 / var20 << 221442344);
                                    break L21;
                                  }
                                }
                                incrementValue$15 = param7;
                                param7++;
                                param2[incrementValue$15] = param4;
                                break L17;
                              }
                              L22: {
                                L23: {
                                  incrementValue$16 = param3;
                                  param3++;
                                  param4 = param8[incrementValue$16];
                                  if (-1 == (param4 ^ -1)) {
                                    break L23;
                                  } else {
                                    L24: {
                                      var13 = 255 & param4 >> 1046582576;
                                      var14 = (65473 & param4) >> 1806238856;
                                      var15 = 255 & param4;
                                      var16 = param2[param7];
                                      var17 = 255 & var16 >> 682435376;
                                      var18 = 15 & var16 >> 1211249224;
                                      var19 = 255 & var16;
                                      if (var14 >= var13) {
                                        if (var14 > var15) {
                                          stackOut_75_0 = var14;
                                          stackIn_76_0 = stackOut_75_0;
                                          break L24;
                                        } else {
                                          stackOut_74_0 = var15;
                                          stackIn_76_0 = stackOut_74_0;
                                          break L24;
                                        }
                                      } else {
                                        if ((var13 ^ -1) < (var15 ^ -1)) {
                                          stackOut_72_0 = var13;
                                          stackIn_76_0 = stackOut_72_0;
                                          break L24;
                                        } else {
                                          stackOut_71_0 = var15;
                                          stackIn_76_0 = stackOut_71_0;
                                          break L24;
                                        }
                                      }
                                    }
                                    L25: {
                                      var20 = stackIn_76_0;
                                      if (var18 < var17) {
                                        if ((var19 ^ -1) <= (var17 ^ -1)) {
                                          stackOut_82_0 = var19;
                                          stackIn_83_0 = stackOut_82_0;
                                          break L25;
                                        } else {
                                          stackOut_81_0 = var17;
                                          stackIn_83_0 = stackOut_81_0;
                                          break L25;
                                        }
                                      } else {
                                        if (var19 >= var18) {
                                          stackOut_79_0 = var19;
                                          stackIn_83_0 = stackOut_79_0;
                                          break L25;
                                        } else {
                                          stackOut_78_0 = var18;
                                          stackIn_83_0 = stackOut_78_0;
                                          break L25;
                                        }
                                      }
                                    }
                                    L26: {
                                      var21 = stackIn_83_0;
                                      if (var21 < var20) {
                                        param4 = var15 * var21 / var20 | (var21 * var14 / var20 << -1132881272 | var21 * var13 / var20 << 1778785104);
                                        break L26;
                                      } else {
                                        break L26;
                                      }
                                    }
                                    incrementValue$17 = param7;
                                    param7++;
                                    param2[incrementValue$17] = param4;
                                    if (var22 == 0) {
                                      break L22;
                                    } else {
                                      break L23;
                                    }
                                  }
                                }
                                param7++;
                                break L22;
                              }
                              var12++;
                              if (var22 == 0) {
                                continue L4;
                              } else {
                                break L6;
                              }
                            }
                          }
                        }
                        var12 = param1;
                        L27: while (true) {
                          L28: {
                            if (var12 >= 0) {
                              break L28;
                            } else {
                              incrementValue$18 = param3;
                              param3++;
                              param4 = param8[incrementValue$18];
                              stackOut_91_0 = 0;
                              stackOut_91_1 = param4;
                              stackIn_115_0 = stackOut_91_0;
                              stackIn_115_1 = stackOut_91_1;
                              stackIn_92_0 = stackOut_91_0;
                              stackIn_92_1 = stackOut_91_1;
                              if (var22 != 0) {
                                break L5;
                              } else {
                                L29: {
                                  L30: {
                                    if (stackIn_92_0 != stackIn_92_1) {
                                      break L30;
                                    } else {
                                      param7++;
                                      if (var22 == 0) {
                                        break L29;
                                      } else {
                                        break L30;
                                      }
                                    }
                                  }
                                  L31: {
                                    var13 = 255 & param4 >> 1191395984;
                                    var14 = (65290 & param4) >> -118330008;
                                    var15 = 255 & param4;
                                    var16 = param2[param7];
                                    var17 = (16754807 & var16) >> -166496880;
                                    var18 = var16 >> 1479300296 & 15;
                                    var19 = var16 & 255;
                                    if ((var13 ^ -1) < (var14 ^ -1)) {
                                      if ((var13 ^ -1) < (var15 ^ -1)) {
                                        stackOut_101_0 = var13;
                                        stackIn_102_0 = stackOut_101_0;
                                        break L31;
                                      } else {
                                        stackOut_100_0 = var15;
                                        stackIn_102_0 = stackOut_100_0;
                                        break L31;
                                      }
                                    } else {
                                      if (var15 < var14) {
                                        stackOut_98_0 = var14;
                                        stackIn_102_0 = stackOut_98_0;
                                        break L31;
                                      } else {
                                        stackOut_97_0 = var15;
                                        stackIn_102_0 = stackOut_97_0;
                                        break L31;
                                      }
                                    }
                                  }
                                  L32: {
                                    var20 = stackIn_102_0;
                                    if ((var18 ^ -1) <= (var17 ^ -1)) {
                                      if ((var18 ^ -1) < (var19 ^ -1)) {
                                        stackOut_108_0 = var18;
                                        stackIn_109_0 = stackOut_108_0;
                                        break L32;
                                      } else {
                                        stackOut_107_0 = var19;
                                        stackIn_109_0 = stackOut_107_0;
                                        break L32;
                                      }
                                    } else {
                                      if ((var19 ^ -1) <= (var17 ^ -1)) {
                                        stackOut_105_0 = var19;
                                        stackIn_109_0 = stackOut_105_0;
                                        break L32;
                                      } else {
                                        stackOut_104_0 = var17;
                                        stackIn_109_0 = stackOut_104_0;
                                        break L32;
                                      }
                                    }
                                  }
                                  L33: {
                                    var21 = stackIn_109_0;
                                    if ((var21 ^ -1) > (var20 ^ -1)) {
                                      param4 = var15 * var21 / var20 | (var13 * var21 / var20 << 710271312 | var21 * var14 / var20 << -1724225816);
                                      break L33;
                                    } else {
                                      break L33;
                                    }
                                  }
                                  incrementValue$19 = param7;
                                  param7++;
                                  param2[incrementValue$19] = param4;
                                  break L29;
                                }
                                var12++;
                                if (var22 == 0) {
                                  continue L27;
                                } else {
                                  break L28;
                                }
                              }
                            }
                          }
                          param3 = param3 + param5;
                          stackOut_114_0 = param7;
                          stackOut_114_1 = param9;
                          stackIn_115_0 = stackOut_114_0;
                          stackIn_115_1 = stackOut_114_1;
                          break L5;
                        }
                      }
                      param7 = stackIn_115_0 + stackIn_115_1;
                      var11++;
                      if (var22 == 0) {
                        continue L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L34: {
            var10 = decompiledCaughtException;
            stackOut_117_0 = (RuntimeException) (var10);
            stackOut_117_1 = new StringBuilder().append("kc.F(").append(param0).append(',').append(param1).append(',');
            stackIn_119_0 = stackOut_117_0;
            stackIn_119_1 = stackOut_117_1;
            stackIn_118_0 = stackOut_117_0;
            stackIn_118_1 = stackOut_117_1;
            if (param2 == null) {
              stackOut_119_0 = (RuntimeException) ((Object) stackIn_119_0);
              stackOut_119_1 = (StringBuilder) ((Object) stackIn_119_1);
              stackOut_119_2 = "null";
              stackIn_120_0 = stackOut_119_0;
              stackIn_120_1 = stackOut_119_1;
              stackIn_120_2 = stackOut_119_2;
              break L34;
            } else {
              stackOut_118_0 = (RuntimeException) ((Object) stackIn_118_0);
              stackOut_118_1 = (StringBuilder) ((Object) stackIn_118_1);
              stackOut_118_2 = "{...}";
              stackIn_120_0 = stackOut_118_0;
              stackIn_120_1 = stackOut_118_1;
              stackIn_120_2 = stackOut_118_2;
              break L34;
            }
          }
          L35: {
            stackOut_120_0 = (RuntimeException) ((Object) stackIn_120_0);
            stackOut_120_1 = ((StringBuilder) (Object) stackIn_120_1).append(stackIn_120_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');
            stackIn_122_0 = stackOut_120_0;
            stackIn_122_1 = stackOut_120_1;
            stackIn_121_0 = stackOut_120_0;
            stackIn_121_1 = stackOut_120_1;
            if (param8 == null) {
              stackOut_122_0 = (RuntimeException) ((Object) stackIn_122_0);
              stackOut_122_1 = (StringBuilder) ((Object) stackIn_122_1);
              stackOut_122_2 = "null";
              stackIn_123_0 = stackOut_122_0;
              stackIn_123_1 = stackOut_122_1;
              stackIn_123_2 = stackOut_122_2;
              break L35;
            } else {
              stackOut_121_0 = (RuntimeException) ((Object) stackIn_121_0);
              stackOut_121_1 = (StringBuilder) ((Object) stackIn_121_1);
              stackOut_121_2 = "{...}";
              stackIn_123_0 = stackOut_121_0;
              stackIn_123_1 = stackOut_121_1;
              stackIn_123_2 = stackOut_121_2;
              break L35;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_123_0), stackIn_123_2 + ',' + param9 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void b(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        byte[] var7 = null;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_53_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_52_0 = 0;
        L0: {
          var6 = Lexicominos.field_L ? 1 : 0;
          var2 = 0;
          if (param0 <= -111) {
            break L0;
          } else {
            var7 = (byte[]) null;
            this.a(-93L, (byte[]) null, 126);
            break L0;
          }
        }
        var3 = 0;
        L1: while (true) {
          L2: {
            L3: {
              if (8 <= var2) {
                break L3;
              } else {
                this.field_h[var2] = qg.a(qg.a(tf.a(255L, (long)this.field_k[var3 + 6]) << -900871224, qg.a(qg.a(qg.a(qg.a(tf.a((long)this.field_k[2 + var3] << 953476200, 280375465082880L), qg.a((long)this.field_k[var3] << 783770232, tf.a(71776119061217280L, (long)this.field_k[var3 - -1] << 1461624112))), tf.a(1095216660480L, (long)this.field_k[var3 - -3] << -391529184)), tf.a((long)this.field_k[var3 - -4], 255L) << 426542488), tf.a((long)this.field_k[var3 - -5] << 1213552656, 16711680L))), tf.a((long)this.field_k[7 + var3], 255L));
                var3 += 8;
                var2++;
                if (var6 != 0) {
                  break L2;
                } else {
                  if (var6 == 0) {
                    continue L1;
                  } else {
                    break L3;
                  }
                }
              }
            }
            var2 = 0;
            break L2;
          }
          L4: while (true) {
            L5: {
              L6: {
                if (-9 >= (var2 ^ -1)) {
                  break L6;
                } else {
                  this.field_j[var2] = this.field_e[var2];
                  this.field_f[var2] = qg.a(this.field_h[var2], this.field_e[var2]);
                  var2++;
                  if (var6 != 0) {
                    break L5;
                  } else {
                    if (var6 == 0) {
                      continue L4;
                    } else {
                      break L6;
                    }
                  }
                }
              }
              var2 = 1;
              break L5;
            }
            L7: while (true) {
              L8: {
                L9: {
                  if (-11 > (var2 ^ -1)) {
                    break L9;
                  } else {
                    stackOut_16_0 = 0;
                    stackIn_53_0 = stackOut_16_0;
                    stackIn_17_0 = stackOut_16_0;
                    if (var6 != 0) {
                      break L8;
                    } else {
                      var3 = stackIn_17_0;
                      L10: while (true) {
                        L11: {
                          L12: {
                            if (var3 >= 8) {
                              break L12;
                            } else {
                              this.field_a[var3] = 0L;
                              var4 = 0;
                              stackOut_19_0 = 56;
                              stackIn_28_0 = stackOut_19_0;
                              stackIn_20_0 = stackOut_19_0;
                              if (var6 != 0) {
                                break L11;
                              } else {
                                var5 = stackIn_20_0;
                                L13: while (true) {
                                  L14: {
                                    L15: {
                                      if (8 <= var4) {
                                        break L15;
                                      } else {
                                        this.field_a[var3] = qg.a(this.field_a[var3], fb.field_j[var4][vg.a((int)(this.field_j[vg.a(var3 - var4, 7)] >>> var5), 255)]);
                                        var4++;
                                        var5 -= 8;
                                        if (var6 != 0) {
                                          break L14;
                                        } else {
                                          if (var6 == 0) {
                                            continue L13;
                                          } else {
                                            break L15;
                                          }
                                        }
                                      }
                                    }
                                    var3++;
                                    break L14;
                                  }
                                  if (var6 == 0) {
                                    continue L10;
                                  } else {
                                    break L12;
                                  }
                                }
                              }
                            }
                          }
                          stackOut_27_0 = 0;
                          stackIn_28_0 = stackOut_27_0;
                          break L11;
                        }
                        var3 = stackIn_28_0;
                        L16: while (true) {
                          L17: {
                            L18: {
                              if ((var3 ^ -1) <= -9) {
                                break L18;
                              } else {
                                this.field_j[var3] = this.field_a[var3];
                                var3++;
                                if (var6 != 0) {
                                  break L17;
                                } else {
                                  if (var6 == 0) {
                                    continue L16;
                                  } else {
                                    break L18;
                                  }
                                }
                              }
                            }
                            this.field_j[0] = qg.a(this.field_j[0], fb.field_o[var2]);
                            break L17;
                          }
                          var3 = 0;
                          L19: while (true) {
                            L20: {
                              L21: {
                                if (var3 >= 8) {
                                  break L21;
                                } else {
                                  this.field_a[var3] = this.field_j[var3];
                                  var4 = 0;
                                  stackOut_36_0 = 56;
                                  stackIn_45_0 = stackOut_36_0;
                                  stackIn_37_0 = stackOut_36_0;
                                  if (var6 != 0) {
                                    break L20;
                                  } else {
                                    var5 = stackIn_37_0;
                                    L22: while (true) {
                                      L23: {
                                        L24: {
                                          if ((var4 ^ -1) <= -9) {
                                            break L24;
                                          } else {
                                            this.field_a[var3] = qg.a(this.field_a[var3], fb.field_j[var4][vg.a(255, (int)(this.field_f[vg.a(var3 - var4, 7)] >>> var5))]);
                                            var5 -= 8;
                                            var4++;
                                            if (var6 != 0) {
                                              break L23;
                                            } else {
                                              if (var6 == 0) {
                                                continue L22;
                                              } else {
                                                break L24;
                                              }
                                            }
                                          }
                                        }
                                        var3++;
                                        break L23;
                                      }
                                      if (var6 == 0) {
                                        continue L19;
                                      } else {
                                        break L21;
                                      }
                                    }
                                  }
                                }
                              }
                              stackOut_44_0 = 0;
                              stackIn_45_0 = stackOut_44_0;
                              break L20;
                            }
                            var3 = stackIn_45_0;
                            L25: while (true) {
                              L26: {
                                L27: {
                                  if (-9 >= (var3 ^ -1)) {
                                    break L27;
                                  } else {
                                    this.field_f[var3] = this.field_a[var3];
                                    var3++;
                                    if (var6 != 0) {
                                      break L26;
                                    } else {
                                      if (var6 == 0) {
                                        continue L25;
                                      } else {
                                        break L27;
                                      }
                                    }
                                  }
                                }
                                var2++;
                                break L26;
                              }
                              if (var6 == 0) {
                                continue L7;
                              } else {
                                break L9;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
                stackOut_52_0 = 0;
                stackIn_53_0 = stackOut_52_0;
                break L8;
              }
              var2 = stackIn_53_0;
              L28: while (true) {
                L29: {
                  if (8 <= var2) {
                    break L29;
                  } else {
                    this.field_e[var2] = qg.a(this.field_e[var2], qg.a(this.field_h[var2], this.field_f[var2]));
                    var2++;
                    if (var6 != 0) {
                      break L29;
                    } else {
                      if (var6 == 0) {
                        continue L28;
                      } else {
                        break L29;
                      }
                    }
                  }
                }
                return;
              }
            }
          }
        }
    }

    final void a(int param0, boolean param1, byte[] param2) {
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        long var6 = 0L;
        int var8 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var8 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              this.field_k[this.field_i] = (byte)tb.a((int) this.field_k[this.field_i], 128 >>> vg.a(7, this.field_b));
              this.field_i = this.field_i + 1;
              if ((this.field_i ^ -1) < -33) {
                L2: while (true) {
                  L3: {
                    L4: {
                      if (this.field_i >= 64) {
                        break L4;
                      } else {
                        fieldTemp$2 = this.field_i;
                        this.field_i = this.field_i + 1;
                        this.field_k[fieldTemp$2] = (byte) 0;
                        if (var8 != 0) {
                          break L3;
                        } else {
                          if (var8 == 0) {
                            continue L2;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    this.b((byte) -127);
                    break L3;
                  }
                  this.field_i = 0;
                  break L1;
                }
              } else {
                break L1;
              }
            }
            L5: while (true) {
              L6: {
                L7: {
                  if (-33 >= (this.field_i ^ -1)) {
                    break L7;
                  } else {
                    fieldTemp$3 = this.field_i;
                    this.field_i = this.field_i + 1;
                    this.field_k[fieldTemp$3] = (byte) 0;
                    if (var8 != 0) {
                      break L6;
                    } else {
                      if (var8 == 0) {
                        continue L5;
                      } else {
                        break L7;
                      }
                    }
                  }
                }
                o.a(this.field_g, 0, this.field_k, 32, 32);
                this.b((byte) -122);
                break L6;
              }
              var4_int = 0;
              if (!param1) {
                var5 = param0;
                L8: while (true) {
                  L9: {
                    if (var4_int >= 8) {
                      break L9;
                    } else {
                      var6 = this.field_e[var4_int];
                      param2[var5] = (byte)(int)(var6 >>> 796419064);
                      param2[1 + var5] = (byte)(int)(var6 >>> 1141110960);
                      param2[var5 - -2] = (byte)(int)(var6 >>> -1839473176);
                      param2[3 + var5] = (byte)(int)(var6 >>> -403539104);
                      param2[4 + var5] = (byte)(int)(var6 >>> -984102248);
                      param2[5 + var5] = (byte)(int)(var6 >>> -137356848);
                      param2[var5 + 6] = (byte)(int)(var6 >>> -295675448);
                      param2[7 + var5] = (byte)(int)var6;
                      var5 += 8;
                      var4_int++;
                      if (var8 != 0) {
                        decompiledRegionSelector0 = 2;
                        break L0;
                      } else {
                        if (var8 == 0) {
                          continue L8;
                        } else {
                          break L9;
                        }
                      }
                    }
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              } else {
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var4 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) (var4);
            stackOut_22_1 = new StringBuilder().append("kc.D(").append(param0).append(',').append(param1).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param2 == null) {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L10;
            } else {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L10;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    final void a(long param0, byte[] param1, int param2) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        long var9 = 0L;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_25_0 = 0;
        int stackIn_25_1 = 0;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        int stackOut_24_0 = 0;
        int stackOut_24_1 = 0;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        var13 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            var5_int = 0;
            var6 = 7 & 8 + -((int)param0 & 7);
            var7 = 7 & this.field_b;
            var9 = param0;
            var11 = 31;
            var12 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  L4: {
                    if (-1 < (var11 ^ -1)) {
                      break L4;
                    } else {
                      var12 = var12 + ((255 & this.field_g[var11]) + (255 & (int)var9));
                      this.field_g[var11] = (byte)var12;
                      var12 = var12 >>> 8;
                      var9 = var9 >>> 8;
                      var11--;
                      if (var13 != 0) {
                        break L3;
                      } else {
                        if (var13 == 0) {
                          continue L1;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  if (param2 == -24893) {
                    break L3;
                  } else {
                    this.field_a = (long[]) null;
                    break L2;
                  }
                }
                break L2;
              }
              L5: while (true) {
                L6: {
                  L7: {
                    L8: {
                      if (8L >= param0) {
                        break L8;
                      } else {
                        var8 = 255 & param1[var5_int] << var6 | (param1[1 + var5_int] & 255) >>> 8 - var6;
                        stackOut_10_0 = 0;
                        stackOut_10_1 = var8;
                        stackIn_25_0 = stackOut_10_0;
                        stackIn_25_1 = stackOut_10_1;
                        stackIn_11_0 = stackOut_10_0;
                        stackIn_11_1 = stackOut_10_1;
                        if (var13 != 0) {
                          break L7;
                        } else {
                          L9: {
                            if (stackIn_11_0 > stackIn_11_1) {
                              break L9;
                            } else {
                              if (-257 < (var8 ^ -1)) {
                                L10: {
                                  this.field_k[this.field_i] = (byte)tb.a((int) this.field_k[this.field_i], var8 >>> var7);
                                  this.field_i = this.field_i + 1;
                                  this.field_b = this.field_b + (8 - var7);
                                  if ((this.field_b ^ -1) != -513) {
                                    break L10;
                                  } else {
                                    this.b((byte) -120);
                                    this.field_i = 0;
                                    this.field_b = 0;
                                    break L10;
                                  }
                                }
                                this.field_k[this.field_i] = (byte)vg.a(var8 << -var7 + 8, 255);
                                param0 = param0 - 8L;
                                var5_int++;
                                this.field_b = this.field_b + var7;
                                if (var13 == 0) {
                                  continue L5;
                                } else {
                                  break L8;
                                }
                              } else {
                                break L9;
                              }
                            }
                          }
                          throw new RuntimeException("LOGIC ERROR");
                        }
                      }
                    }
                    L11: {
                      L12: {
                        if (-1L <= (param0 ^ -1L)) {
                          break L12;
                        } else {
                          var8 = param1[var5_int] << var6 & 255;
                          this.field_k[this.field_i] = (byte)tb.a((int) this.field_k[this.field_i], var8 >>> var7);
                          if (var13 == 0) {
                            break L11;
                          } else {
                            break L12;
                          }
                        }
                      }
                      var8 = 0;
                      break L11;
                    }
                    L13: {
                      if (((long)var7 - -param0 ^ -1L) <= -9L) {
                        break L13;
                      } else {
                        this.field_b = (int)((long)this.field_b + param0);
                        if (var13 == 0) {
                          break L6;
                        } else {
                          break L13;
                        }
                      }
                    }
                    param0 = param0 - (long)(-var7 + 8);
                    this.field_i = this.field_i + 1;
                    this.field_b = this.field_b + (-var7 + 8);
                    stackOut_24_0 = this.field_b ^ -1;
                    stackOut_24_1 = -513;
                    stackIn_25_0 = stackOut_24_0;
                    stackIn_25_1 = stackOut_24_1;
                    break L7;
                  }
                  L14: {
                    if (stackIn_25_0 != stackIn_25_1) {
                      break L14;
                    } else {
                      this.b((byte) -119);
                      this.field_i = 0;
                      this.field_b = 0;
                      break L14;
                    }
                  }
                  this.field_k[this.field_i] = (byte)vg.a(var8 << 8 + -var7, 255);
                  this.field_b = this.field_b + (int)param0;
                  break L6;
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L15: {
            var5 = decompiledCaughtException;
            stackOut_29_0 = (RuntimeException) (var5);
            stackOut_29_1 = new StringBuilder().append("kc.G(").append(param0).append(',');
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param1 == null) {
              stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackOut_31_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L15;
            } else {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L15;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_32_0), stackIn_32_2 + ',' + param2 + ')');
        }
    }

    final void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          var3 = Lexicominos.field_L ? 1 : 0;
          if (param0 >= 109) {
            break L0;
          } else {
            field_d = (byte[]) null;
            break L0;
          }
        }
        var2 = 0;
        L1: while (true) {
          L2: {
            L3: {
              if ((var2 ^ -1) <= -33) {
                break L3;
              } else {
                this.field_g[var2] = (byte) 0;
                var2++;
                if (var3 != 0) {
                  break L2;
                } else {
                  if (var3 == 0) {
                    continue L1;
                  } else {
                    break L3;
                  }
                }
              }
            }
            this.field_i = 0;
            this.field_b = 0;
            this.field_k[0] = (byte) 0;
            break L2;
          }
          var2 = 0;
          L4: while (true) {
            L5: {
              if (8 <= var2) {
                break L5;
              } else {
                this.field_e[var2] = 0L;
                var2++;
                if (var3 != 0) {
                  break L5;
                } else {
                  if (var3 == 0) {
                    continue L4;
                  } else {
                    break L5;
                  }
                }
              }
            }
            return;
          }
        }
    }

    kc() {
        this.field_a = new long[8];
        this.field_b = 0;
        this.field_k = new byte[64];
        this.field_f = new long[8];
        this.field_j = new long[8];
        this.field_i = 0;
        this.field_g = new byte[32];
        this.field_e = new long[8];
        this.field_h = new long[8];
    }

    static {
        field_l = new int[8192];
        field_m = new ke[10];
    }
}
