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
                  if (ed.field_q.field_h != 0) {
                    break L2;
                  } else {
                    if (rf.c(0) > p.field_c - -10000L) {
                      ed.field_q.h(param0, 0);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  if (ed.field_q.field_h > 0) {
                    {
                      L4: {
                        jc.field_b.a(ed.field_q.field_j, ed.field_q.field_h, 120, 0);
                        p.field_c = rf.c(0);
                        break L4;
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

    public static void a() {
        field_m = null;
        field_d = null;
        field_l = null;
    }

    final static void a(int param0, int param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int[] param8, int param9) {
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
        int stackIn_13_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_60_0 = 0;
        int stackIn_71_0 = 0;
        int stackIn_78_0 = 0;
        int stackIn_95_0 = 0;
        int stackIn_102_0 = 0;
        RuntimeException stackIn_110_0 = null;
        StringBuilder stackIn_110_1 = null;
        RuntimeException stackIn_111_0 = null;
        StringBuilder stackIn_111_1 = null;
        RuntimeException stackIn_112_0 = null;
        StringBuilder stackIn_112_1 = null;
        String stackIn_112_2 = null;
        RuntimeException stackIn_113_0 = null;
        StringBuilder stackIn_113_1 = null;
        RuntimeException stackIn_114_0 = null;
        StringBuilder stackIn_114_1 = null;
        RuntimeException stackIn_115_0 = null;
        StringBuilder stackIn_115_1 = null;
        String stackIn_115_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_94_0 = 0;
        int stackOut_93_0 = 0;
        int stackOut_91_0 = 0;
        int stackOut_90_0 = 0;
        int stackOut_101_0 = 0;
        int stackOut_100_0 = 0;
        int stackOut_98_0 = 0;
        int stackOut_97_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_59_0 = 0;
        int stackOut_58_0 = 0;
        int stackOut_56_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_70_0 = 0;
        int stackOut_69_0 = 0;
        int stackOut_67_0 = 0;
        int stackOut_66_0 = 0;
        int stackOut_77_0 = 0;
        int stackOut_76_0 = 0;
        int stackOut_74_0 = 0;
        int stackOut_73_0 = 0;
        RuntimeException stackOut_109_0 = null;
        StringBuilder stackOut_109_1 = null;
        RuntimeException stackOut_111_0 = null;
        StringBuilder stackOut_111_1 = null;
        String stackOut_111_2 = null;
        RuntimeException stackOut_110_0 = null;
        StringBuilder stackOut_110_1 = null;
        String stackOut_110_2 = null;
        RuntimeException stackOut_112_0 = null;
        StringBuilder stackOut_112_1 = null;
        RuntimeException stackOut_114_0 = null;
        StringBuilder stackOut_114_1 = null;
        String stackOut_114_2 = null;
        RuntimeException stackOut_113_0 = null;
        StringBuilder stackOut_113_1 = null;
        String stackOut_113_2 = null;
        var22 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            var10_int = -(param1 >> 2);
            param1 = -(param1 & 3);
            var11 = -param0;
            L1: while (true) {
              if (var11 >= 0) {
                break L0;
              } else {
                var12 = var10_int;
                L2: while (true) {
                  if (var12 >= 0) {
                    var12 = param1;
                    L3: while (true) {
                      if (var12 >= 0) {
                        param3 = param3 + param5;
                        param7 = param7 + param9;
                        var11++;
                        continue L1;
                      } else {
                        L4: {
                          int incrementValue$10 = param3;
                          param3++;
                          param4 = param8[incrementValue$10];
                          if (0 != param4) {
                            L5: {
                              var13 = 255 & param4 >> 16;
                              var14 = (65290 & param4) >> 8;
                              var15 = 255 & param4;
                              var16 = param2[param7];
                              var17 = (16754807 & var16) >> 16;
                              var18 = var16 >> 8 & 15;
                              var19 = var16 & 255;
                              if (var13 > var14) {
                                if (var13 > var15) {
                                  stackOut_94_0 = var13;
                                  stackIn_95_0 = stackOut_94_0;
                                  break L5;
                                } else {
                                  stackOut_93_0 = var15;
                                  stackIn_95_0 = stackOut_93_0;
                                  break L5;
                                }
                              } else {
                                if (var15 < var14) {
                                  stackOut_91_0 = var14;
                                  stackIn_95_0 = stackOut_91_0;
                                  break L5;
                                } else {
                                  stackOut_90_0 = var15;
                                  stackIn_95_0 = stackOut_90_0;
                                  break L5;
                                }
                              }
                            }
                            L6: {
                              var20 = stackIn_95_0;
                              if (var18 >= var17) {
                                if (var18 > var19) {
                                  stackOut_101_0 = var18;
                                  stackIn_102_0 = stackOut_101_0;
                                  break L6;
                                } else {
                                  stackOut_100_0 = var19;
                                  stackIn_102_0 = stackOut_100_0;
                                  break L6;
                                }
                              } else {
                                if (var19 >= var17) {
                                  stackOut_98_0 = var19;
                                  stackIn_102_0 = stackOut_98_0;
                                  break L6;
                                } else {
                                  stackOut_97_0 = var17;
                                  stackIn_102_0 = stackOut_97_0;
                                  break L6;
                                }
                              }
                            }
                            L7: {
                              var21 = stackIn_102_0;
                              if (var21 < var20) {
                                param4 = var15 * var21 / var20 | (var13 * var21 / var20 << 16 | var21 * var14 / var20 << 8);
                                break L7;
                              } else {
                                break L7;
                              }
                            }
                            int incrementValue$11 = param7;
                            param7++;
                            param2[incrementValue$11] = param4;
                            break L4;
                          } else {
                            param7++;
                            break L4;
                          }
                        }
                        var12++;
                        continue L3;
                      }
                    }
                  } else {
                    L8: {
                      int incrementValue$12 = param3;
                      param3++;
                      param4 = param8[incrementValue$12];
                      if (0 == param4) {
                        param7++;
                        break L8;
                      } else {
                        L9: {
                          var13 = 255 & param4 >> 16;
                          var14 = param4 >> 8 & 255;
                          var15 = 255 & param4;
                          var16 = param2[param7];
                          var17 = (16768750 & var16) >> 16;
                          var18 = 15 & var16 >> 8;
                          var19 = var16 & 255;
                          if (var14 < var13) {
                            if (var15 < var13) {
                              stackOut_12_0 = var13;
                              stackIn_13_0 = stackOut_12_0;
                              break L9;
                            } else {
                              stackOut_11_0 = var15;
                              stackIn_13_0 = stackOut_11_0;
                              break L9;
                            }
                          } else {
                            if (var14 > var15) {
                              stackOut_9_0 = var14;
                              stackIn_13_0 = stackOut_9_0;
                              break L9;
                            } else {
                              stackOut_8_0 = var15;
                              stackIn_13_0 = stackOut_8_0;
                              break L9;
                            }
                          }
                        }
                        L10: {
                          var20 = stackIn_13_0;
                          if (var18 >= var17) {
                            if (var19 >= var18) {
                              stackOut_19_0 = var19;
                              stackIn_20_0 = stackOut_19_0;
                              break L10;
                            } else {
                              stackOut_18_0 = var18;
                              stackIn_20_0 = stackOut_18_0;
                              break L10;
                            }
                          } else {
                            if (var17 > var19) {
                              stackOut_16_0 = var17;
                              stackIn_20_0 = stackOut_16_0;
                              break L10;
                            } else {
                              stackOut_15_0 = var19;
                              stackIn_20_0 = stackOut_15_0;
                              break L10;
                            }
                          }
                        }
                        L11: {
                          var21 = stackIn_20_0;
                          if (var20 > var21) {
                            param4 = var21 * var14 / var20 << 8 | var21 * var13 / var20 << 16 | var21 * var15 / var20;
                            break L11;
                          } else {
                            break L11;
                          }
                        }
                        int incrementValue$13 = param7;
                        param7++;
                        param2[incrementValue$13] = param4;
                        break L8;
                      }
                    }
                    L12: {
                      int incrementValue$14 = param3;
                      param3++;
                      param4 = param8[incrementValue$14];
                      if (0 == param4) {
                        param7++;
                        break L12;
                      } else {
                        L13: {
                          var13 = (param4 & 16771522) >> 16;
                          var14 = (param4 & 65535) >> 8;
                          var15 = param4 & 255;
                          var16 = param2[param7];
                          var17 = (16751732 & var16) >> 16;
                          var18 = (3998 & var16) >> 8;
                          var19 = 255 & var16;
                          if (var13 <= var14) {
                            if (var14 <= var15) {
                              stackOut_32_0 = var15;
                              stackIn_33_0 = stackOut_32_0;
                              break L13;
                            } else {
                              stackOut_31_0 = var14;
                              stackIn_33_0 = stackOut_31_0;
                              break L13;
                            }
                          } else {
                            if (var13 > var15) {
                              stackOut_29_0 = var13;
                              stackIn_33_0 = stackOut_29_0;
                              break L13;
                            } else {
                              stackOut_28_0 = var15;
                              stackIn_33_0 = stackOut_28_0;
                              break L13;
                            }
                          }
                        }
                        L14: {
                          var20 = stackIn_33_0;
                          if (var18 < var17) {
                            if (var17 > var19) {
                              stackOut_39_0 = var17;
                              stackIn_40_0 = stackOut_39_0;
                              break L14;
                            } else {
                              stackOut_38_0 = var19;
                              stackIn_40_0 = stackOut_38_0;
                              break L14;
                            }
                          } else {
                            if (var19 < var18) {
                              stackOut_36_0 = var18;
                              stackIn_40_0 = stackOut_36_0;
                              break L14;
                            } else {
                              stackOut_35_0 = var19;
                              stackIn_40_0 = stackOut_35_0;
                              break L14;
                            }
                          }
                        }
                        L15: {
                          var21 = stackIn_40_0;
                          if (var20 <= var21) {
                            break L15;
                          } else {
                            param4 = var13 * var21 / var20 << 16 | var21 * var14 / var20 << 8 | var15 * var21 / var20;
                            break L15;
                          }
                        }
                        int incrementValue$15 = param7;
                        param7++;
                        param2[incrementValue$15] = param4;
                        break L12;
                      }
                    }
                    L16: {
                      int incrementValue$16 = param3;
                      param3++;
                      param4 = param8[incrementValue$16];
                      if (param4 != 0) {
                        L17: {
                          var13 = (16730233 & param4) >> 16;
                          var14 = (param4 & 65406) >> 8;
                          var15 = param4 & 255;
                          var16 = param2[param7];
                          var17 = (var16 & 16775412) >> 16;
                          var18 = (var16 & 4043) >> 8;
                          var19 = var16 & 255;
                          if (var13 > var14) {
                            if (var15 >= var13) {
                              stackOut_52_0 = var15;
                              stackIn_53_0 = stackOut_52_0;
                              break L17;
                            } else {
                              stackOut_51_0 = var13;
                              stackIn_53_0 = stackOut_51_0;
                              break L17;
                            }
                          } else {
                            if (var14 <= var15) {
                              stackOut_49_0 = var15;
                              stackIn_53_0 = stackOut_49_0;
                              break L17;
                            } else {
                              stackOut_48_0 = var14;
                              stackIn_53_0 = stackOut_48_0;
                              break L17;
                            }
                          }
                        }
                        L18: {
                          var20 = stackIn_53_0;
                          if (var18 < var17) {
                            if (var17 <= var19) {
                              stackOut_59_0 = var19;
                              stackIn_60_0 = stackOut_59_0;
                              break L18;
                            } else {
                              stackOut_58_0 = var17;
                              stackIn_60_0 = stackOut_58_0;
                              break L18;
                            }
                          } else {
                            if (var18 <= var19) {
                              stackOut_56_0 = var19;
                              stackIn_60_0 = stackOut_56_0;
                              break L18;
                            } else {
                              stackOut_55_0 = var18;
                              stackIn_60_0 = stackOut_55_0;
                              break L18;
                            }
                          }
                        }
                        L19: {
                          var21 = stackIn_60_0;
                          if (var20 <= var21) {
                            break L19;
                          } else {
                            param4 = var15 * var21 / var20 | (var13 * var21 / var20 << 16 | var14 * var21 / var20 << 8);
                            break L19;
                          }
                        }
                        int incrementValue$17 = param7;
                        param7++;
                        param2[incrementValue$17] = param4;
                        break L16;
                      } else {
                        param7++;
                        break L16;
                      }
                    }
                    L20: {
                      int incrementValue$18 = param3;
                      param3++;
                      param4 = param8[incrementValue$18];
                      if (param4 == 0) {
                        param7++;
                        break L20;
                      } else {
                        L21: {
                          var13 = 255 & param4 >> 16;
                          var14 = (65473 & param4) >> 8;
                          var15 = 255 & param4;
                          var16 = param2[param7];
                          var17 = 255 & var16 >> 16;
                          var18 = 15 & var16 >> 8;
                          var19 = 255 & var16;
                          if (var14 >= var13) {
                            if (var14 > var15) {
                              stackOut_70_0 = var14;
                              stackIn_71_0 = stackOut_70_0;
                              break L21;
                            } else {
                              stackOut_69_0 = var15;
                              stackIn_71_0 = stackOut_69_0;
                              break L21;
                            }
                          } else {
                            if (var13 > var15) {
                              stackOut_67_0 = var13;
                              stackIn_71_0 = stackOut_67_0;
                              break L21;
                            } else {
                              stackOut_66_0 = var15;
                              stackIn_71_0 = stackOut_66_0;
                              break L21;
                            }
                          }
                        }
                        L22: {
                          var20 = stackIn_71_0;
                          if (var18 < var17) {
                            if (var19 >= var17) {
                              stackOut_77_0 = var19;
                              stackIn_78_0 = stackOut_77_0;
                              break L22;
                            } else {
                              stackOut_76_0 = var17;
                              stackIn_78_0 = stackOut_76_0;
                              break L22;
                            }
                          } else {
                            if (var19 >= var18) {
                              stackOut_74_0 = var19;
                              stackIn_78_0 = stackOut_74_0;
                              break L22;
                            } else {
                              stackOut_73_0 = var18;
                              stackIn_78_0 = stackOut_73_0;
                              break L22;
                            }
                          }
                        }
                        L23: {
                          var21 = stackIn_78_0;
                          if (var21 < var20) {
                            param4 = var15 * var21 / var20 | (var21 * var14 / var20 << 8 | var21 * var13 / var20 << 16);
                            break L23;
                          } else {
                            break L23;
                          }
                        }
                        int incrementValue$19 = param7;
                        param7++;
                        param2[incrementValue$19] = param4;
                        break L20;
                      }
                    }
                    var12++;
                    continue L2;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L24: {
            var10 = decompiledCaughtException;
            stackOut_109_0 = (RuntimeException) var10;
            stackOut_109_1 = new StringBuilder().append("kc.F(").append(param0).append(',').append(param1).append(',');
            stackIn_111_0 = stackOut_109_0;
            stackIn_111_1 = stackOut_109_1;
            stackIn_110_0 = stackOut_109_0;
            stackIn_110_1 = stackOut_109_1;
            if (param2 == null) {
              stackOut_111_0 = (RuntimeException) (Object) stackIn_111_0;
              stackOut_111_1 = (StringBuilder) (Object) stackIn_111_1;
              stackOut_111_2 = "null";
              stackIn_112_0 = stackOut_111_0;
              stackIn_112_1 = stackOut_111_1;
              stackIn_112_2 = stackOut_111_2;
              break L24;
            } else {
              stackOut_110_0 = (RuntimeException) (Object) stackIn_110_0;
              stackOut_110_1 = (StringBuilder) (Object) stackIn_110_1;
              stackOut_110_2 = "{...}";
              stackIn_112_0 = stackOut_110_0;
              stackIn_112_1 = stackOut_110_1;
              stackIn_112_2 = stackOut_110_2;
              break L24;
            }
          }
          L25: {
            stackOut_112_0 = (RuntimeException) (Object) stackIn_112_0;
            stackOut_112_1 = ((StringBuilder) (Object) stackIn_112_1).append(stackIn_112_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(8).append(',').append(param7).append(',');
            stackIn_114_0 = stackOut_112_0;
            stackIn_114_1 = stackOut_112_1;
            stackIn_113_0 = stackOut_112_0;
            stackIn_113_1 = stackOut_112_1;
            if (param8 == null) {
              stackOut_114_0 = (RuntimeException) (Object) stackIn_114_0;
              stackOut_114_1 = (StringBuilder) (Object) stackIn_114_1;
              stackOut_114_2 = "null";
              stackIn_115_0 = stackOut_114_0;
              stackIn_115_1 = stackOut_114_1;
              stackIn_115_2 = stackOut_114_2;
              break L25;
            } else {
              stackOut_113_0 = (RuntimeException) (Object) stackIn_113_0;
              stackOut_113_1 = (StringBuilder) (Object) stackIn_113_1;
              stackOut_113_2 = "{...}";
              stackIn_115_0 = stackOut_113_0;
              stackIn_115_1 = stackOut_113_1;
              stackIn_115_2 = stackOut_113_2;
              break L25;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_115_0, stackIn_115_2 + ',' + param9 + ')');
        }
    }

    private final void b(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        Object var7 = null;
        int var8 = 0;
        L0: {
          var6 = Lexicominos.field_L ? 1 : 0;
          var2 = 0;
          if (param0 <= -111) {
            break L0;
          } else {
            var7 = null;
            ((kc) this).a(-93L, (byte[]) null, 126);
            break L0;
          }
        }
        var3 = 0;
        L1: while (true) {
          if (8 <= var2) {
            var2 = 0;
            L2: while (true) {
              if (var2 >= 8) {
                var2 = 1;
                L3: while (true) {
                  if (var2 > 10) {
                    var2 = 0;
                    L4: while (true) {
                      if (8 <= var2) {
                        return;
                      } else {
                        ((kc) this).field_e[var2] = qg.a(((kc) this).field_e[var2], qg.a(((kc) this).field_h[var2], ((kc) this).field_f[var2]));
                        var2++;
                        continue L4;
                      }
                    }
                  } else {
                    var3 = 0;
                    L5: while (true) {
                      if (var3 >= 8) {
                        var3 = 0;
                        L6: while (true) {
                          if (var3 >= 8) {
                            ((kc) this).field_j[0] = qg.a(((kc) this).field_j[0], fb.field_o[var2]);
                            var3 = 0;
                            L7: while (true) {
                              if (var3 >= 8) {
                                var3 = 0;
                                L8: while (true) {
                                  if (var3 >= 8) {
                                    var2++;
                                    continue L3;
                                  } else {
                                    ((kc) this).field_f[var3] = ((kc) this).field_a[var3];
                                    var3++;
                                    continue L8;
                                  }
                                }
                              } else {
                                ((kc) this).field_a[var3] = ((kc) this).field_j[var3];
                                var8 = 0;
                                var4 = var8;
                                var5 = 56;
                                L9: while (true) {
                                  if (var8 >= 8) {
                                    var3++;
                                    continue L7;
                                  } else {
                                    ((kc) this).field_a[var3] = qg.a(((kc) this).field_a[var3], fb.field_j[var8][vg.a(255, (int)(((kc) this).field_f[vg.a(var3 - var8, 7)] >>> var5))]);
                                    var5 -= 8;
                                    var8++;
                                    continue L9;
                                  }
                                }
                              }
                            }
                          } else {
                            ((kc) this).field_j[var3] = ((kc) this).field_a[var3];
                            var3++;
                            continue L6;
                          }
                        }
                      } else {
                        ((kc) this).field_a[var3] = 0L;
                        var4 = 0;
                        var5 = 56;
                        L10: while (true) {
                          if (8 <= var4) {
                            var3++;
                            continue L5;
                          } else {
                            ((kc) this).field_a[var3] = qg.a(((kc) this).field_a[var3], fb.field_j[var4][vg.a((int)(((kc) this).field_j[vg.a(var3 - var4, 7)] >>> var5), 255)]);
                            var4++;
                            var5 -= 8;
                            continue L10;
                          }
                        }
                      }
                    }
                  }
                }
              } else {
                ((kc) this).field_j[var2] = ((kc) this).field_e[var2];
                ((kc) this).field_f[var2] = qg.a(((kc) this).field_h[var2], ((kc) this).field_e[var2]);
                var2++;
                continue L2;
              }
            }
          } else {
            ((kc) this).field_h[var2] = qg.a(qg.a(tf.a(255L, (long)((kc) this).field_k[var3 + 6]) << 8, qg.a(qg.a(qg.a(qg.a(tf.a((long)((kc) this).field_k[2 + var3] << 40, 280375465082880L), qg.a((long)((kc) this).field_k[var3] << 56, tf.a(71776119061217280L, (long)((kc) this).field_k[var3 - -1] << 48))), tf.a(1095216660480L, (long)((kc) this).field_k[var3 - -3] << 32)), tf.a((long)((kc) this).field_k[var3 - -4], 255L) << 24), tf.a((long)((kc) this).field_k[var3 - -5] << 16, 16711680L))), tf.a((long)((kc) this).field_k[7 + var3], 255L));
            var3 += 8;
            var2++;
            continue L1;
          }
        }
    }

    final void a(int param0, boolean param1, byte[] param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        long var6 = 0L;
        int var8 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var8 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              ((kc) this).field_k[((kc) this).field_i] = (byte)tb.a((int) ((kc) this).field_k[((kc) this).field_i], 128 >>> vg.a(7, ((kc) this).field_b));
              ((kc) this).field_i = ((kc) this).field_i + 1;
              if (((kc) this).field_i > 32) {
                L2: while (true) {
                  if (((kc) this).field_i >= 64) {
                    this.b((byte) -127);
                    ((kc) this).field_i = 0;
                    break L1;
                  } else {
                    int fieldTemp$2 = ((kc) this).field_i;
                    ((kc) this).field_i = ((kc) this).field_i + 1;
                    ((kc) this).field_k[fieldTemp$2] = (byte) 0;
                    continue L2;
                  }
                }
              } else {
                break L1;
              }
            }
            L3: while (true) {
              if (((kc) this).field_i >= 32) {
                o.a(((kc) this).field_g, 0, ((kc) this).field_k, 32, 32);
                this.b((byte) -122);
                var4_int = 0;
                if (!param1) {
                  var5 = param0;
                  L4: while (true) {
                    if (var4_int >= 8) {
                      break L0;
                    } else {
                      var6 = ((kc) this).field_e[var4_int];
                      param2[var5] = (byte)(int)(var6 >>> 56);
                      param2[1 + var5] = (byte)(int)(var6 >>> 48);
                      param2[var5 - -2] = (byte)(int)(var6 >>> 40);
                      param2[3 + var5] = (byte)(int)(var6 >>> 32);
                      param2[4 + var5] = (byte)(int)(var6 >>> 24);
                      param2[5 + var5] = (byte)(int)(var6 >>> 16);
                      param2[var5 + 6] = (byte)(int)(var6 >>> 8);
                      param2[7 + var5] = (byte)(int)var6;
                      var5 += 8;
                      var4_int++;
                      continue L4;
                    }
                  }
                } else {
                  return;
                }
              } else {
                int fieldTemp$3 = ((kc) this).field_i;
                ((kc) this).field_i = ((kc) this).field_i + 1;
                ((kc) this).field_k[fieldTemp$3] = (byte) 0;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var4;
            stackOut_14_1 = new StringBuilder().append("kc.D(").append(param0).append(',').append(param1).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param2 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ')');
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
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var13 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            var5_int = 0;
            var6 = 7 & 8 + -((int)param0 & 7);
            var7 = 7 & ((kc) this).field_b;
            var9 = param0;
            var11 = 31;
            var12 = 0;
            L1: while (true) {
              if (var11 < 0) {
                L2: {
                  if (param2 == -24893) {
                    break L2;
                  } else {
                    ((kc) this).field_a = null;
                    break L2;
                  }
                }
                L3: while (true) {
                  if (8L >= param0) {
                    L4: {
                      if (param0 <= 0L) {
                        var8 = 0;
                        break L4;
                      } else {
                        var8 = param1[var5_int] << var6 & 255;
                        ((kc) this).field_k[((kc) this).field_i] = (byte)tb.a((int) ((kc) this).field_k[((kc) this).field_i], var8 >>> var7);
                        break L4;
                      }
                    }
                    L5: {
                      if ((long)var7 - -param0 >= 8L) {
                        L6: {
                          param0 = param0 - (long)(-var7 + 8);
                          ((kc) this).field_i = ((kc) this).field_i + 1;
                          ((kc) this).field_b = ((kc) this).field_b + (-var7 + 8);
                          if (((kc) this).field_b != 512) {
                            break L6;
                          } else {
                            this.b((byte) -119);
                            ((kc) this).field_i = 0;
                            ((kc) this).field_b = 0;
                            break L6;
                          }
                        }
                        ((kc) this).field_k[((kc) this).field_i] = (byte)vg.a(var8 << 8 + -var7, 255);
                        ((kc) this).field_b = ((kc) this).field_b + (int)param0;
                        break L5;
                      } else {
                        ((kc) this).field_b = (int)((long)((kc) this).field_b + param0);
                        break L5;
                      }
                    }
                    break L0;
                  } else {
                    L7: {
                      var8 = 255 & param1[var5_int] << var6 | (param1[1 + var5_int] & 255) >>> 8 - var6;
                      if (0 > var8) {
                        break L7;
                      } else {
                        if (var8 < 256) {
                          L8: {
                            ((kc) this).field_k[((kc) this).field_i] = (byte)tb.a((int) ((kc) this).field_k[((kc) this).field_i], var8 >>> var7);
                            ((kc) this).field_i = ((kc) this).field_i + 1;
                            ((kc) this).field_b = ((kc) this).field_b + (8 - var7);
                            if (((kc) this).field_b != 512) {
                              break L8;
                            } else {
                              this.b((byte) -120);
                              ((kc) this).field_i = 0;
                              ((kc) this).field_b = 0;
                              break L8;
                            }
                          }
                          ((kc) this).field_k[((kc) this).field_i] = (byte)vg.a(var8 << -var7 + 8, 255);
                          param0 = param0 - 8L;
                          var5_int++;
                          ((kc) this).field_b = ((kc) this).field_b + var7;
                          continue L3;
                        } else {
                          break L7;
                        }
                      }
                    }
                    throw new RuntimeException("LOGIC ERROR");
                  }
                }
              } else {
                var12 = var12 + ((255 & ((kc) this).field_g[var11]) + (255 & (int)var9));
                ((kc) this).field_g[var11] = (byte)var12;
                var12 = var12 >>> 8;
                var9 = var9 >>> 8;
                var11--;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var5 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var5;
            stackOut_23_1 = new StringBuilder().append("kc.G(").append(param0).append(',');
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param1 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L9;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L9;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + ',' + param2 + ')');
        }
    }

    final void a(byte param0) {
        int var2 = 0;
        int var3 = Lexicominos.field_L ? 1 : 0;
        if (param0 < 109) {
            field_d = null;
        }
        for (var2 = 0; var2 < 32; var2++) {
            ((kc) this).field_g[var2] = (byte) 0;
        }
        ((kc) this).field_i = 0;
        ((kc) this).field_b = 0;
        ((kc) this).field_k[0] = (byte) 0;
        for (var2 = 0; 8 > var2; var2++) {
            ((kc) this).field_e[var2] = 0L;
        }
    }

    kc() {
        ((kc) this).field_a = new long[8];
        ((kc) this).field_b = 0;
        ((kc) this).field_k = new byte[64];
        ((kc) this).field_f = new long[8];
        ((kc) this).field_j = new long[8];
        ((kc) this).field_i = 0;
        ((kc) this).field_g = new byte[32];
        ((kc) this).field_e = new long[8];
        ((kc) this).field_h = new long[8];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = new int[8192];
        field_m = new ke[10];
    }
}
