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
                      ed.field_q.h(param0, ~param1);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  if (~ed.field_q.field_h < param1) {
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

    public static void a(int param0) {
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
        int stackIn_15_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_62_0 = 0;
        int stackIn_73_0 = 0;
        int stackIn_80_0 = 0;
        int stackIn_97_0 = 0;
        int stackIn_104_0 = 0;
        RuntimeException stackIn_112_0 = null;
        StringBuilder stackIn_112_1 = null;
        RuntimeException stackIn_113_0 = null;
        StringBuilder stackIn_113_1 = null;
        RuntimeException stackIn_114_0 = null;
        StringBuilder stackIn_114_1 = null;
        String stackIn_114_2 = null;
        RuntimeException stackIn_115_0 = null;
        StringBuilder stackIn_115_1 = null;
        RuntimeException stackIn_116_0 = null;
        StringBuilder stackIn_116_1 = null;
        RuntimeException stackIn_117_0 = null;
        StringBuilder stackIn_117_1 = null;
        String stackIn_117_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_96_0 = 0;
        int stackOut_95_0 = 0;
        int stackOut_93_0 = 0;
        int stackOut_92_0 = 0;
        int stackOut_103_0 = 0;
        int stackOut_102_0 = 0;
        int stackOut_100_0 = 0;
        int stackOut_99_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_61_0 = 0;
        int stackOut_60_0 = 0;
        int stackOut_58_0 = 0;
        int stackOut_57_0 = 0;
        int stackOut_72_0 = 0;
        int stackOut_71_0 = 0;
        int stackOut_69_0 = 0;
        int stackOut_68_0 = 0;
        int stackOut_79_0 = 0;
        int stackOut_78_0 = 0;
        int stackOut_76_0 = 0;
        int stackOut_75_0 = 0;
        RuntimeException stackOut_111_0 = null;
        StringBuilder stackOut_111_1 = null;
        RuntimeException stackOut_113_0 = null;
        StringBuilder stackOut_113_1 = null;
        String stackOut_113_2 = null;
        RuntimeException stackOut_112_0 = null;
        StringBuilder stackOut_112_1 = null;
        String stackOut_112_2 = null;
        RuntimeException stackOut_114_0 = null;
        StringBuilder stackOut_114_1 = null;
        RuntimeException stackOut_116_0 = null;
        StringBuilder stackOut_116_1 = null;
        String stackOut_116_2 = null;
        RuntimeException stackOut_115_0 = null;
        StringBuilder stackOut_115_1 = null;
        String stackOut_115_2 = null;
        var22 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var10_int = -(param1 >> 2);
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
              if (var11 >= 0) {
                break L0;
              } else {
                var12 = var10_int;
                L3: while (true) {
                  if (var12 >= 0) {
                    var12 = param1;
                    L4: while (true) {
                      if (var12 >= 0) {
                        param3 = param3 + param5;
                        param7 = param7 + param9;
                        var11++;
                        continue L2;
                      } else {
                        L5: {
                          int incrementValue$10 = param3;
                          param3++;
                          param4 = param8[incrementValue$10];
                          if (0 != param4) {
                            L6: {
                              var13 = 255 & param4 >> 16;
                              var14 = (65290 & param4) >> 8;
                              var15 = 255 & param4;
                              var16 = param2[param7];
                              var17 = (16754807 & var16) >> 16;
                              var18 = var16 >> 8 & 15;
                              var19 = var16 & 255;
                              if (var13 > var14) {
                                if (var13 > var15) {
                                  stackOut_96_0 = var13;
                                  stackIn_97_0 = stackOut_96_0;
                                  break L6;
                                } else {
                                  stackOut_95_0 = var15;
                                  stackIn_97_0 = stackOut_95_0;
                                  break L6;
                                }
                              } else {
                                if (var15 < var14) {
                                  stackOut_93_0 = var14;
                                  stackIn_97_0 = stackOut_93_0;
                                  break L6;
                                } else {
                                  stackOut_92_0 = var15;
                                  stackIn_97_0 = stackOut_92_0;
                                  break L6;
                                }
                              }
                            }
                            L7: {
                              var20 = stackIn_97_0;
                              if (var18 >= var17) {
                                if (var18 > var19) {
                                  stackOut_103_0 = var18;
                                  stackIn_104_0 = stackOut_103_0;
                                  break L7;
                                } else {
                                  stackOut_102_0 = var19;
                                  stackIn_104_0 = stackOut_102_0;
                                  break L7;
                                }
                              } else {
                                if (var19 >= var17) {
                                  stackOut_100_0 = var19;
                                  stackIn_104_0 = stackOut_100_0;
                                  break L7;
                                } else {
                                  stackOut_99_0 = var17;
                                  stackIn_104_0 = stackOut_99_0;
                                  break L7;
                                }
                              }
                            }
                            L8: {
                              var21 = stackIn_104_0;
                              if (var21 < var20) {
                                param4 = var15 * var21 / var20 | (var13 * var21 / var20 << 16 | var21 * var14 / var20 << 8);
                                break L8;
                              } else {
                                break L8;
                              }
                            }
                            int incrementValue$11 = param7;
                            param7++;
                            param2[incrementValue$11] = param4;
                            break L5;
                          } else {
                            param7++;
                            break L5;
                          }
                        }
                        var12++;
                        continue L4;
                      }
                    }
                  } else {
                    L9: {
                      int incrementValue$12 = param3;
                      param3++;
                      param4 = param8[incrementValue$12];
                      if (0 == param4) {
                        param7++;
                        break L9;
                      } else {
                        L10: {
                          var13 = 255 & param4 >> 16;
                          var14 = param4 >> 8 & 255;
                          var15 = 255 & param4;
                          var16 = param2[param7];
                          var17 = (16768750 & var16) >> 16;
                          var18 = 15 & var16 >> 8;
                          var19 = var16 & 255;
                          if (var14 < var13) {
                            if (var15 < var13) {
                              stackOut_14_0 = var13;
                              stackIn_15_0 = stackOut_14_0;
                              break L10;
                            } else {
                              stackOut_13_0 = var15;
                              stackIn_15_0 = stackOut_13_0;
                              break L10;
                            }
                          } else {
                            if (var14 > var15) {
                              stackOut_11_0 = var14;
                              stackIn_15_0 = stackOut_11_0;
                              break L10;
                            } else {
                              stackOut_10_0 = var15;
                              stackIn_15_0 = stackOut_10_0;
                              break L10;
                            }
                          }
                        }
                        L11: {
                          var20 = stackIn_15_0;
                          if (var18 >= var17) {
                            if (var19 >= var18) {
                              stackOut_21_0 = var19;
                              stackIn_22_0 = stackOut_21_0;
                              break L11;
                            } else {
                              stackOut_20_0 = var18;
                              stackIn_22_0 = stackOut_20_0;
                              break L11;
                            }
                          } else {
                            if (var17 > var19) {
                              stackOut_18_0 = var17;
                              stackIn_22_0 = stackOut_18_0;
                              break L11;
                            } else {
                              stackOut_17_0 = var19;
                              stackIn_22_0 = stackOut_17_0;
                              break L11;
                            }
                          }
                        }
                        L12: {
                          var21 = stackIn_22_0;
                          if (var20 > var21) {
                            param4 = var21 * var14 / var20 << 8 | var21 * var13 / var20 << 16 | var21 * var15 / var20;
                            break L12;
                          } else {
                            break L12;
                          }
                        }
                        int incrementValue$13 = param7;
                        param7++;
                        param2[incrementValue$13] = param4;
                        break L9;
                      }
                    }
                    L13: {
                      int incrementValue$14 = param3;
                      param3++;
                      param4 = param8[incrementValue$14];
                      if (0 == param4) {
                        param7++;
                        break L13;
                      } else {
                        L14: {
                          var13 = (param4 & 16771522) >> 16;
                          var14 = (param4 & 65535) >> 8;
                          var15 = param4 & 255;
                          var16 = param2[param7];
                          var17 = (16751732 & var16) >> 16;
                          var18 = (3998 & var16) >> 8;
                          var19 = 255 & var16;
                          if (var13 <= var14) {
                            if (var14 <= var15) {
                              stackOut_34_0 = var15;
                              stackIn_35_0 = stackOut_34_0;
                              break L14;
                            } else {
                              stackOut_33_0 = var14;
                              stackIn_35_0 = stackOut_33_0;
                              break L14;
                            }
                          } else {
                            if (var13 > var15) {
                              stackOut_31_0 = var13;
                              stackIn_35_0 = stackOut_31_0;
                              break L14;
                            } else {
                              stackOut_30_0 = var15;
                              stackIn_35_0 = stackOut_30_0;
                              break L14;
                            }
                          }
                        }
                        L15: {
                          var20 = stackIn_35_0;
                          if (var18 < var17) {
                            if (var17 > var19) {
                              stackOut_41_0 = var17;
                              stackIn_42_0 = stackOut_41_0;
                              break L15;
                            } else {
                              stackOut_40_0 = var19;
                              stackIn_42_0 = stackOut_40_0;
                              break L15;
                            }
                          } else {
                            if (var19 < var18) {
                              stackOut_38_0 = var18;
                              stackIn_42_0 = stackOut_38_0;
                              break L15;
                            } else {
                              stackOut_37_0 = var19;
                              stackIn_42_0 = stackOut_37_0;
                              break L15;
                            }
                          }
                        }
                        L16: {
                          var21 = stackIn_42_0;
                          if (var20 <= var21) {
                            break L16;
                          } else {
                            param4 = var13 * var21 / var20 << 16 | var21 * var14 / var20 << 8 | var15 * var21 / var20;
                            break L16;
                          }
                        }
                        int incrementValue$15 = param7;
                        param7++;
                        param2[incrementValue$15] = param4;
                        break L13;
                      }
                    }
                    L17: {
                      int incrementValue$16 = param3;
                      param3++;
                      param4 = param8[incrementValue$16];
                      if (param4 != 0) {
                        L18: {
                          var13 = (16730233 & param4) >> 16;
                          var14 = (param4 & 65406) >> 8;
                          var15 = param4 & 255;
                          var16 = param2[param7];
                          var17 = (var16 & 16775412) >> 16;
                          var18 = (var16 & 4043) >> 8;
                          var19 = var16 & 255;
                          if (var13 > var14) {
                            if (var15 >= var13) {
                              stackOut_54_0 = var15;
                              stackIn_55_0 = stackOut_54_0;
                              break L18;
                            } else {
                              stackOut_53_0 = var13;
                              stackIn_55_0 = stackOut_53_0;
                              break L18;
                            }
                          } else {
                            if (var14 <= var15) {
                              stackOut_51_0 = var15;
                              stackIn_55_0 = stackOut_51_0;
                              break L18;
                            } else {
                              stackOut_50_0 = var14;
                              stackIn_55_0 = stackOut_50_0;
                              break L18;
                            }
                          }
                        }
                        L19: {
                          var20 = stackIn_55_0;
                          if (var18 < var17) {
                            if (var17 <= var19) {
                              stackOut_61_0 = var19;
                              stackIn_62_0 = stackOut_61_0;
                              break L19;
                            } else {
                              stackOut_60_0 = var17;
                              stackIn_62_0 = stackOut_60_0;
                              break L19;
                            }
                          } else {
                            if (var18 <= var19) {
                              stackOut_58_0 = var19;
                              stackIn_62_0 = stackOut_58_0;
                              break L19;
                            } else {
                              stackOut_57_0 = var18;
                              stackIn_62_0 = stackOut_57_0;
                              break L19;
                            }
                          }
                        }
                        L20: {
                          var21 = stackIn_62_0;
                          if (var20 <= var21) {
                            break L20;
                          } else {
                            param4 = var15 * var21 / var20 | (var13 * var21 / var20 << 16 | var14 * var21 / var20 << 8);
                            break L20;
                          }
                        }
                        int incrementValue$17 = param7;
                        param7++;
                        param2[incrementValue$17] = param4;
                        break L17;
                      } else {
                        param7++;
                        break L17;
                      }
                    }
                    L21: {
                      int incrementValue$18 = param3;
                      param3++;
                      param4 = param8[incrementValue$18];
                      if (param4 == 0) {
                        param7++;
                        break L21;
                      } else {
                        L22: {
                          var13 = 255 & param4 >> 16;
                          var14 = (65473 & param4) >> 8;
                          var15 = 255 & param4;
                          var16 = param2[param7];
                          var17 = 255 & var16 >> 16;
                          var18 = 15 & var16 >> 8;
                          var19 = 255 & var16;
                          if (var14 >= var13) {
                            if (var14 > var15) {
                              stackOut_72_0 = var14;
                              stackIn_73_0 = stackOut_72_0;
                              break L22;
                            } else {
                              stackOut_71_0 = var15;
                              stackIn_73_0 = stackOut_71_0;
                              break L22;
                            }
                          } else {
                            if (var13 > var15) {
                              stackOut_69_0 = var13;
                              stackIn_73_0 = stackOut_69_0;
                              break L22;
                            } else {
                              stackOut_68_0 = var15;
                              stackIn_73_0 = stackOut_68_0;
                              break L22;
                            }
                          }
                        }
                        L23: {
                          var20 = stackIn_73_0;
                          if (var18 < var17) {
                            if (var19 >= var17) {
                              stackOut_79_0 = var19;
                              stackIn_80_0 = stackOut_79_0;
                              break L23;
                            } else {
                              stackOut_78_0 = var17;
                              stackIn_80_0 = stackOut_78_0;
                              break L23;
                            }
                          } else {
                            if (var19 >= var18) {
                              stackOut_76_0 = var19;
                              stackIn_80_0 = stackOut_76_0;
                              break L23;
                            } else {
                              stackOut_75_0 = var18;
                              stackIn_80_0 = stackOut_75_0;
                              break L23;
                            }
                          }
                        }
                        L24: {
                          var21 = stackIn_80_0;
                          if (var21 < var20) {
                            param4 = var15 * var21 / var20 | (var21 * var14 / var20 << 8 | var21 * var13 / var20 << 16);
                            break L24;
                          } else {
                            break L24;
                          }
                        }
                        int incrementValue$19 = param7;
                        param7++;
                        param2[incrementValue$19] = param4;
                        break L21;
                      }
                    }
                    var12++;
                    continue L3;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L25: {
            var10 = decompiledCaughtException;
            stackOut_111_0 = (RuntimeException) var10;
            stackOut_111_1 = new StringBuilder().append("kc.F(").append(param0).append(44).append(param1).append(44);
            stackIn_113_0 = stackOut_111_0;
            stackIn_113_1 = stackOut_111_1;
            stackIn_112_0 = stackOut_111_0;
            stackIn_112_1 = stackOut_111_1;
            if (param2 == null) {
              stackOut_113_0 = (RuntimeException) (Object) stackIn_113_0;
              stackOut_113_1 = (StringBuilder) (Object) stackIn_113_1;
              stackOut_113_2 = "null";
              stackIn_114_0 = stackOut_113_0;
              stackIn_114_1 = stackOut_113_1;
              stackIn_114_2 = stackOut_113_2;
              break L25;
            } else {
              stackOut_112_0 = (RuntimeException) (Object) stackIn_112_0;
              stackOut_112_1 = (StringBuilder) (Object) stackIn_112_1;
              stackOut_112_2 = "{...}";
              stackIn_114_0 = stackOut_112_0;
              stackIn_114_1 = stackOut_112_1;
              stackIn_114_2 = stackOut_112_2;
              break L25;
            }
          }
          L26: {
            stackOut_114_0 = (RuntimeException) (Object) stackIn_114_0;
            stackOut_114_1 = ((StringBuilder) (Object) stackIn_114_1).append(stackIn_114_2).append(44).append(param3).append(44).append(param4).append(44).append(param5).append(44).append(param6).append(44).append(param7).append(44);
            stackIn_116_0 = stackOut_114_0;
            stackIn_116_1 = stackOut_114_1;
            stackIn_115_0 = stackOut_114_0;
            stackIn_115_1 = stackOut_114_1;
            if (param8 == null) {
              stackOut_116_0 = (RuntimeException) (Object) stackIn_116_0;
              stackOut_116_1 = (StringBuilder) (Object) stackIn_116_1;
              stackOut_116_2 = "null";
              stackIn_117_0 = stackOut_116_0;
              stackIn_117_1 = stackOut_116_1;
              stackIn_117_2 = stackOut_116_2;
              break L26;
            } else {
              stackOut_115_0 = (RuntimeException) (Object) stackIn_115_0;
              stackOut_115_1 = (StringBuilder) (Object) stackIn_115_1;
              stackOut_115_2 = "{...}";
              stackIn_117_0 = stackOut_115_0;
              stackIn_117_1 = stackOut_115_1;
              stackIn_117_2 = stackOut_115_2;
              break L26;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_117_0, stackIn_117_2 + 44 + param9 + 41);
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
            stackOut_14_1 = new StringBuilder().append("kc.D(").append(param0).append(44).append(param1).append(44);
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
          throw ld.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 41);
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
            stackOut_23_1 = new StringBuilder().append("kc.G(").append(param0).append(44);
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
          throw ld.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + 44 + param2 + 41);
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
