/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class pg extends qs {
    private int field_K;
    private int field_H;
    static String field_E;
    static int[][] field_A;
    private boolean field_I;
    private nq field_G;
    private String field_L;
    private int field_D;
    static int field_J;
    static byte[] field_C;
    static String field_F;

    final String c(boolean param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String var3 = null;
        String stackIn_1_0 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_0_0 = null;
        try {
          L0: {
            var2_int = ((pg) this).field_z.field_k ? 1 : 0;
            ((pg) this).field_z.field_k = ((pg) this).field_k;
            var3 = ((pg) this).field_z.c(param0);
            ((pg) this).field_z.field_k = var2_int != 0;
            stackOut_0_0 = (String) var3;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var2, "pg.JA(" + param0 + ')');
        }
        return stackIn_1_0;
    }

    pg(int param0, int param1, int param2, int param3, vg param4, boolean param5, int param6, int param7, nq param8, int param9, String param10) {
        super(param0, param1, param2, param3, (iq) null, (ko) null);
        RuntimeException var12 = null;
        int var12_int = 0;
        int var13 = 0;
        int var14 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        try {
          L0: {
            L1: {
              L2: {
                ((pg) this).field_z = param4;
                ((pg) this).field_L = param10;
                ((pg) this).field_D = param9;
                ((pg) this).field_H = param6;
                ((pg) this).field_G = param8;
                ((pg) this).field_K = param7;
                ((pg) this).field_I = param5;
                var12_int = -((pg) this).field_K + ((pg) this).field_H;
                var13 = ((pg) this).field_G.c(param10, var12_int, ((pg) this).field_G.field_J) - -(((pg) this).field_K * 2);
                if (param3 < var13) {
                  break L2;
                } else {
                  var13 = param3;
                  if (!ShatteredPlansClient.field_F) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              ((pg) this).a(param1, var13, (byte) 102, param0, param2);
              break L1;
            }
            L3: {
              if (!((pg) this).field_I) {
                stackOut_8_0 = 2 * ((pg) this).field_K + ((pg) this).field_H;
                stackIn_9_0 = stackOut_8_0;
                break L3;
              } else {
                stackOut_6_0 = 0;
                stackIn_9_0 = stackOut_6_0;
                break L3;
              }
            }
            var14 = stackIn_9_0;
            ((pg) this).field_z.a((-param3 + var13 >> 730032801) + ((pg) this).field_K, param3 + -(2 * ((pg) this).field_K), (byte) 115, var14, -((pg) this).field_H + param2 + -(3 * ((pg) this).field_K));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var12 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var12;
            stackOut_11_1 = new StringBuilder().append("pg.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_14_0 = stackOut_11_0;
            stackIn_14_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param4 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_15_0 = stackOut_12_0;
              stackIn_15_1 = stackOut_12_1;
              stackIn_15_2 = stackOut_12_2;
              break L4;
            }
          }
          L5: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');
            stackIn_18_0 = stackOut_15_0;
            stackIn_18_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param8 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_19_0 = stackOut_16_0;
              stackIn_19_1 = stackOut_16_1;
              stackIn_19_2 = stackOut_16_2;
              break L5;
            }
          }
          L6: {
            stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',').append(param9).append(',');
            stackIn_22_0 = stackOut_19_0;
            stackIn_22_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param10 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L6;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_23_0 = stackOut_20_0;
              stackIn_23_1 = stackOut_20_1;
              stackIn_23_2 = stackOut_20_2;
              break L6;
            }
          }
          throw r.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + ')');
        }
    }

    public static void f(byte param0) {
        if (param0 != -43) {
            return;
        }
        try {
            field_F = null;
            field_C = null;
            field_A = null;
            field_E = null;
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "pg.A(" + param0 + ')');
        }
    }

    final static bi[] a(int param0, int param1, int param2, byte param3, int param4, int param5, int param6, int param7, int param8) {
        RuntimeException var9 = null;
        int var9_int = 0;
        bi[] var10 = null;
        bi[] var11_ref_bi__ = null;
        int var11 = 0;
        int var12 = 0;
        bi var13 = null;
        int var14 = 0;
        int var15 = 0;
        int stackIn_4_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_27_1 = 0;
        int stackIn_29_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_32_1 = 0;
        int stackIn_38_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_50_0 = 0;
        bi[] stackIn_63_0 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_26_1 = 0;
        int stackOut_28_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_31_1 = 0;
        int stackOut_37_0 = 0;
        int stackOut_40_0 = 0;
        byte stackOut_49_0 = 0;
        bi[] stackOut_62_0 = null;
        var15 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var9_int = param1 + param2 + param7;
            var10 = new bi[]{new bi(var9_int, var9_int), new bi(param6, var9_int), new bi(var9_int, var9_int), new bi(var9_int, param6), new bi(64, 64), new bi(var9_int, param6), new bi(var9_int, var9_int), new bi(param6, var9_int), new bi(var9_int, var9_int)};
            var11_ref_bi__ = var10;
            var12 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (~var11_ref_bi__.length >= ~var12) {
                    break L3;
                  } else {
                    var13 = var11_ref_bi__[var12];
                    stackOut_3_0 = 0;
                    stackIn_13_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var15 != 0) {
                      break L2;
                    } else {
                      var14 = stackIn_4_0;
                      L4: while (true) {
                        L5: {
                          L6: {
                            if (~var14 <= ~var13.field_B.length) {
                              break L6;
                            } else {
                              var13.field_B[var14] = param5;
                              var14++;
                              if (var15 != 0) {
                                break L5;
                              } else {
                                if (var15 == 0) {
                                  continue L4;
                                } else {
                                  break L6;
                                }
                              }
                            }
                          }
                          var12++;
                          break L5;
                        }
                        if (var15 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
                stackOut_12_0 = 0;
                stackIn_13_0 = stackOut_12_0;
                break L2;
              }
              var11 = stackIn_13_0;
              L7: while (true) {
                L8: {
                  L9: {
                    if (var11 >= param7) {
                      break L9;
                    } else {
                      stackOut_15_0 = 0;
                      stackIn_25_0 = stackOut_15_0;
                      stackIn_16_0 = stackOut_15_0;
                      if (var15 != 0) {
                        break L8;
                      } else {
                        var12 = stackIn_16_0;
                        L10: while (true) {
                          L11: {
                            L12: {
                              if (~var9_int >= ~var12) {
                                break L12;
                              } else {
                                var10[6].field_B[var12 + (-1 + (var9_int + -var11)) * var9_int] = param4;
                                var10[8].field_B[var12 + var9_int * (-1 + -var11 + var9_int)] = param4;
                                var10[2].field_B[-1 + (var9_int + -var11 + var9_int * var12)] = param4;
                                var10[8].field_B[var9_int * var12 - var11 - (-var9_int + 1)] = param4;
                                var12++;
                                if (var15 != 0) {
                                  break L11;
                                } else {
                                  if (var15 == 0) {
                                    continue L10;
                                  } else {
                                    break L12;
                                  }
                                }
                              }
                            }
                            var11++;
                            break L11;
                          }
                          if (var15 == 0) {
                            continue L7;
                          } else {
                            break L9;
                          }
                        }
                      }
                    }
                  }
                  stackOut_24_0 = 0;
                  stackIn_25_0 = stackOut_24_0;
                  break L8;
                }
                var11 = stackIn_25_0;
                L13: while (true) {
                  stackOut_26_0 = param7;
                  stackOut_26_1 = var11;
                  stackIn_27_0 = stackOut_26_0;
                  stackIn_27_1 = stackOut_26_1;
                  L14: while (true) {
                    L15: {
                      L16: {
                        if (stackIn_27_0 <= stackIn_27_1) {
                          break L16;
                        } else {
                          stackOut_28_0 = 0;
                          stackIn_38_0 = stackOut_28_0;
                          stackIn_29_0 = stackOut_28_0;
                          if (var15 != 0) {
                            break L15;
                          } else {
                            var12 = stackIn_29_0;
                            L17: while (true) {
                              L18: {
                                if (var12 >= var9_int) {
                                  break L18;
                                } else {
                                  var10[0].field_B[var9_int * var11 + var12] = param8;
                                  var10[0].field_B[var11 + var12 * var9_int] = param8;
                                  stackOut_31_0 = ~(var9_int - var11);
                                  stackOut_31_1 = ~var12;
                                  stackIn_27_0 = stackOut_31_0;
                                  stackIn_27_1 = stackOut_31_1;
                                  stackIn_32_0 = stackOut_31_0;
                                  stackIn_32_1 = stackOut_31_1;
                                  if (var15 != 0) {
                                    continue L14;
                                  } else {
                                    L19: {
                                      if (stackIn_32_0 < stackIn_32_1) {
                                        var10[2].field_B[var9_int * var11 + var12] = param8;
                                        var10[6].field_B[var11 + var9_int * var12] = param8;
                                        break L19;
                                      } else {
                                        break L19;
                                      }
                                    }
                                    var12++;
                                    if (var15 == 0) {
                                      continue L17;
                                    } else {
                                      break L18;
                                    }
                                  }
                                }
                              }
                              var11++;
                              if (var15 == 0) {
                                continue L13;
                              } else {
                                break L16;
                              }
                            }
                          }
                        }
                      }
                      stackOut_37_0 = 0;
                      stackIn_38_0 = stackOut_37_0;
                      break L15;
                    }
                    var11 = stackIn_38_0;
                    L20: while (true) {
                      L21: {
                        L22: {
                          if (~var11 <= ~param6) {
                            break L22;
                          } else {
                            stackOut_40_0 = 0;
                            stackIn_50_0 = stackOut_40_0;
                            stackIn_41_0 = stackOut_40_0;
                            if (var15 != 0) {
                              break L21;
                            } else {
                              var12 = stackIn_41_0;
                              L23: while (true) {
                                L24: {
                                  L25: {
                                    if (var12 >= param7) {
                                      break L25;
                                    } else {
                                      var10[7].field_B[(var9_int - var12 - 1) * param6 + var11] = param4;
                                      var10[5].field_B[var9_int + (-1 - var12) + var11 * var9_int] = param4;
                                      var10[1].field_B[var12 * param6 - -var11] = param8;
                                      var10[3].field_B[var12 + var9_int * var11] = param8;
                                      var12++;
                                      if (var15 != 0) {
                                        break L24;
                                      } else {
                                        if (var15 == 0) {
                                          continue L23;
                                        } else {
                                          break L25;
                                        }
                                      }
                                    }
                                  }
                                  var11++;
                                  break L24;
                                }
                                if (var15 == 0) {
                                  continue L20;
                                } else {
                                  break L22;
                                }
                              }
                            }
                          }
                        }
                        var11 = 0;
                        stackOut_49_0 = param3;
                        stackIn_50_0 = stackOut_49_0;
                        break L21;
                      }
                      L26: {
                        if (stackIn_50_0 == -41) {
                          break L26;
                        } else {
                          bi[] discarded$1 = pg.a(-7, 17, -29, (byte) 74, -118, 12, 82, -100, -35);
                          break L26;
                        }
                      }
                      L27: while (true) {
                        L28: {
                          if (~var11 <= ~(param6 >> 1793017697)) {
                            break L28;
                          } else {
                            var12 = 0;
                            L29: while (true) {
                              L30: {
                                L31: {
                                  if (param1 <= var12) {
                                    break L31;
                                  } else {
                                    var10[1].field_B[param6 * (-1 + -var12 + var9_int) + var11] = param0;
                                    var10[3].field_B[-1 - -var9_int + -var12 + var11 * var9_int] = param0;
                                    var10[7].field_B[var11 + param6 * var12] = param0;
                                    var10[5].field_B[var9_int * var11 - -var12] = param0;
                                    var12++;
                                    if (var15 != 0) {
                                      break L30;
                                    } else {
                                      if (var15 == 0) {
                                        continue L29;
                                      } else {
                                        break L31;
                                      }
                                    }
                                  }
                                }
                                var11++;
                                break L30;
                              }
                              if (var15 == 0) {
                                continue L27;
                              } else {
                                break L28;
                              }
                            }
                          }
                        }
                        stackOut_62_0 = (bi[]) var10;
                        stackIn_63_0 = stackOut_62_0;
                        break L0;
                      }
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var9, "pg.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
        return stackIn_63_0;
    }

    final static boolean a(int param0, char param1) {
        char[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_17_0 = 0;
        char stackIn_22_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_29_0 = 0;
        RuntimeException decompiledCaughtException = null;
        char stackOut_21_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_16_0 = 0;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == 28654) {
                break L1;
              } else {
                field_C = null;
                break L1;
              }
            }
            L2: {
              L3: {
                if (param1 <= 0) {
                  break L3;
                } else {
                  if (param1 < 128) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (param1 < 160) {
                  break L4;
                } else {
                  if (param1 <= 255) {
                    break L2;
                  } else {
                    break L4;
                  }
                }
              }
              L5: {
                L6: {
                  if (0 == param1) {
                    break L6;
                  } else {
                    var2 = tl.field_p;
                    var3 = 0;
                    L7: while (true) {
                      if (~var3 <= ~var2.length) {
                        break L6;
                      } else {
                        var4 = var2[var3];
                        stackOut_21_0 = param1;
                        stackIn_29_0 = stackOut_21_0;
                        stackIn_22_0 = stackOut_21_0;
                        if (var5 != 0) {
                          break L5;
                        } else {
                          if (stackIn_22_0 != var4) {
                            var3++;
                            if (var5 == 0) {
                              continue L7;
                            } else {
                              break L6;
                            }
                          } else {
                            stackOut_25_0 = 1;
                            stackIn_26_0 = stackOut_25_0;
                            return stackIn_26_0 != 0;
                          }
                        }
                      }
                    }
                  }
                }
                stackOut_28_0 = 0;
                stackIn_29_0 = stackOut_28_0;
                break L5;
              }
              break L0;
            }
            stackOut_16_0 = 1;
            stackIn_17_0 = stackOut_16_0;
            return stackIn_17_0 != 0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw r.a((Throwable) (Object) var2_ref, "pg.D(" + param0 + ',' + param1 + ')');
        }
        return stackIn_29_0 != 0;
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int stackIn_9_0 = 0;
        nq stackIn_10_0 = null;
        String stackIn_10_1 = null;
        int stackIn_10_2 = 0;
        int stackIn_10_3 = 0;
        int stackIn_10_4 = 0;
        int stackIn_10_5 = 0;
        int stackIn_10_6 = 0;
        int stackIn_10_7 = 0;
        nq stackIn_12_0 = null;
        String stackIn_12_1 = null;
        int stackIn_12_2 = 0;
        int stackIn_12_3 = 0;
        int stackIn_12_4 = 0;
        int stackIn_12_5 = 0;
        int stackIn_12_6 = 0;
        int stackIn_12_7 = 0;
        nq stackIn_13_0 = null;
        String stackIn_13_1 = null;
        int stackIn_13_2 = 0;
        int stackIn_13_3 = 0;
        int stackIn_13_4 = 0;
        int stackIn_13_5 = 0;
        int stackIn_13_6 = 0;
        int stackIn_13_7 = 0;
        int stackIn_13_8 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_6_0 = 0;
        nq stackOut_9_0 = null;
        String stackOut_9_1 = null;
        int stackOut_9_2 = 0;
        int stackOut_9_3 = 0;
        int stackOut_9_4 = 0;
        int stackOut_9_5 = 0;
        int stackOut_9_6 = 0;
        int stackOut_9_7 = 0;
        nq stackOut_12_0 = null;
        String stackOut_12_1 = null;
        int stackOut_12_2 = 0;
        int stackOut_12_3 = 0;
        int stackOut_12_4 = 0;
        int stackOut_12_5 = 0;
        int stackOut_12_6 = 0;
        int stackOut_12_7 = 0;
        int stackOut_12_8 = 0;
        nq stackOut_10_0 = null;
        String stackOut_10_1 = null;
        int stackOut_10_2 = 0;
        int stackOut_10_3 = 0;
        int stackOut_10_4 = 0;
        int stackOut_10_5 = 0;
        int stackOut_10_6 = 0;
        int stackOut_10_7 = 0;
        int stackOut_10_8 = 0;
        try {
          L0: {
            L1: {
              var5_int = ((pg) this).field_m - -param3;
              if (param1 == -11857) {
                break L1;
              } else {
                bi[] discarded$2 = pg.a(40, -66, 111, (byte) -124, 52, 3, 0, 73, -122);
                break L1;
              }
            }
            var6 = ((pg) this).field_q - -param2;
            super.a(param0, param1, param2, param3);
            if (0 == param0) {
              L2: {
                if (((pg) this).field_I) {
                  stackOut_8_0 = -(2 * ((pg) this).field_K) + (-((pg) this).field_H + ((pg) this).field_x);
                  stackIn_9_0 = stackOut_8_0;
                  break L2;
                } else {
                  stackOut_6_0 = 0;
                  stackIn_9_0 = stackOut_6_0;
                  break L2;
                }
              }
              L3: {
                var7 = stackIn_9_0;
                stackOut_9_0 = ((pg) this).field_G;
                stackOut_9_1 = ((pg) this).field_L;
                stackOut_9_2 = var5_int - -var7 + ((pg) this).field_K;
                stackOut_9_3 = var6 - -((pg) this).field_K;
                stackOut_9_4 = ((pg) this).field_H + -((pg) this).field_K;
                stackOut_9_5 = ((pg) this).field_n + -(((pg) this).field_K * 2);
                stackOut_9_6 = ((pg) this).field_D;
                stackOut_9_7 = -1;
                stackIn_12_0 = stackOut_9_0;
                stackIn_12_1 = stackOut_9_1;
                stackIn_12_2 = stackOut_9_2;
                stackIn_12_3 = stackOut_9_3;
                stackIn_12_4 = stackOut_9_4;
                stackIn_12_5 = stackOut_9_5;
                stackIn_12_6 = stackOut_9_6;
                stackIn_12_7 = stackOut_9_7;
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                stackIn_10_2 = stackOut_9_2;
                stackIn_10_3 = stackOut_9_3;
                stackIn_10_4 = stackOut_9_4;
                stackIn_10_5 = stackOut_9_5;
                stackIn_10_6 = stackOut_9_6;
                stackIn_10_7 = stackOut_9_7;
                if (((pg) this).field_I) {
                  stackOut_12_0 = (nq) (Object) stackIn_12_0;
                  stackOut_12_1 = (String) (Object) stackIn_12_1;
                  stackOut_12_2 = stackIn_12_2;
                  stackOut_12_3 = stackIn_12_3;
                  stackOut_12_4 = stackIn_12_4;
                  stackOut_12_5 = stackIn_12_5;
                  stackOut_12_6 = stackIn_12_6;
                  stackOut_12_7 = stackIn_12_7;
                  stackOut_12_8 = 0;
                  stackIn_13_0 = stackOut_12_0;
                  stackIn_13_1 = stackOut_12_1;
                  stackIn_13_2 = stackOut_12_2;
                  stackIn_13_3 = stackOut_12_3;
                  stackIn_13_4 = stackOut_12_4;
                  stackIn_13_5 = stackOut_12_5;
                  stackIn_13_6 = stackOut_12_6;
                  stackIn_13_7 = stackOut_12_7;
                  stackIn_13_8 = stackOut_12_8;
                  break L3;
                } else {
                  stackOut_10_0 = (nq) (Object) stackIn_10_0;
                  stackOut_10_1 = (String) (Object) stackIn_10_1;
                  stackOut_10_2 = stackIn_10_2;
                  stackOut_10_3 = stackIn_10_3;
                  stackOut_10_4 = stackIn_10_4;
                  stackOut_10_5 = stackIn_10_5;
                  stackOut_10_6 = stackIn_10_6;
                  stackOut_10_7 = stackIn_10_7;
                  stackOut_10_8 = 2;
                  stackIn_13_0 = stackOut_10_0;
                  stackIn_13_1 = stackOut_10_1;
                  stackIn_13_2 = stackOut_10_2;
                  stackIn_13_3 = stackOut_10_3;
                  stackIn_13_4 = stackOut_10_4;
                  stackIn_13_5 = stackOut_10_5;
                  stackIn_13_6 = stackOut_10_6;
                  stackIn_13_7 = stackOut_10_7;
                  stackIn_13_8 = stackOut_10_8;
                  break L3;
                }
              }
              int discarded$3 = ((nq) (Object) stackIn_13_0).a(stackIn_13_1, stackIn_13_2, stackIn_13_3, stackIn_13_4, stackIn_13_5, stackIn_13_6, stackIn_13_7, stackIn_13_8, 1, ((pg) this).field_G.field_J);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var5, "pg.AA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_E = "Press F10 to open Quick Chat.";
        field_C = new byte[]{(byte) 5, (byte) 7, (byte) 4, (byte) 5, (byte) 2};
        field_F = "Neutral homeworld";
    }
}
