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
        int var2 = ((pg) this).field_z.field_k ? 1 : 0;
        ((pg) this).field_z.field_k = ((pg) this).field_k;
        String var3 = ((pg) this).field_z.c(param0);
        ((pg) this).field_z.field_k = var2 != 0 ? true : false;
        return var3;
    }

    pg(int param0, int param1, int param2, int param3, vg param4, boolean param5, int param6, int param7, nq param8, int param9, String param10) {
        super(param0, param1, param2, param3, (iq) null, (ko) null);
        RuntimeException var12 = null;
        int var12_int = 0;
        int var13 = 0;
        int var14 = 0;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        try {
          L0: {
            L1: {
              ((pg) this).field_z = param4;
              ((pg) this).field_L = param10;
              ((pg) this).field_D = param9;
              ((pg) this).field_H = param6;
              ((pg) this).field_G = param8;
              ((pg) this).field_K = param7;
              stackOut_1_0 = this;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (!param5) {
                stackOut_3_0 = this;
                stackOut_3_1 = 0;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                break L1;
              } else {
                stackOut_2_0 = this;
                stackOut_2_1 = 1;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                break L1;
              }
            }
            L2: {
              L3: {
                ((pg) this).field_I = stackIn_4_1 != 0;
                var12_int = -((pg) this).field_K + ((pg) this).field_H;
                var13 = ((pg) this).field_G.c(param10, var12_int, ((pg) this).field_G.field_J) - -(((pg) this).field_K * 2);
                if (param3 < var13) {
                  break L3;
                } else {
                  var13 = param3;
                  if (!ShatteredPlansClient.field_F) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              ((pg) this).a(param1, var13, (byte) 102, param0, param2);
              break L2;
            }
            L4: {
              if (!((pg) this).field_I) {
                stackOut_9_0 = 2 * ((pg) this).field_K + ((pg) this).field_H;
                stackIn_10_0 = stackOut_9_0;
                break L4;
              } else {
                stackOut_8_0 = 0;
                stackIn_10_0 = stackOut_8_0;
                break L4;
              }
            }
            var14 = stackIn_10_0;
            ((pg) this).field_z.a((-param3 + var13 >> 1) + ((pg) this).field_K, param3 + -(2 * ((pg) this).field_K), (byte) 115, var14, -((pg) this).field_H + param2 + -(3 * ((pg) this).field_K));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var12 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var12;
            stackOut_12_1 = new StringBuilder().append("pg.<init>(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param4 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L5;
            }
          }
          L6: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(44).append(param5).append(44).append(param6).append(44).append(param7).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param8 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L6;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L6;
            }
          }
          L7: {
            stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(44).append(param9).append(44);
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param10 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L7;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L7;
            }
          }
          throw r.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 41);
        }
    }

    public static void f(byte param0) {
        if (param0 != -43) {
            return;
        }
        field_F = null;
        field_C = null;
        field_A = null;
        field_E = null;
    }

    final static bi[] a(int param0, int param1, int param2, byte param3, int param4, int param5, int param6, int param7, int param8) {
        int var9 = 0;
        bi[] var10 = null;
        bi[] var11_ref_bi__ = null;
        int var11 = 0;
        int var12 = 0;
        bi var13 = null;
        int var14 = 0;
        int var15 = 0;
        int stackIn_3_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_24_1 = 0;
        int stackIn_26_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_42_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_23_1 = 0;
        int stackOut_30_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_27_1 = 0;
        byte stackOut_41_0 = 0;
        int stackOut_33_0 = 0;
        var15 = ShatteredPlansClient.field_F ? 1 : 0;
        var9 = param1 + param2 + param7;
        var10 = new bi[]{new bi(var9, var9), new bi(param6, var9), new bi(var9, var9), new bi(var9, param6), new bi(64, 64), new bi(var9, param6), new bi(var9, var9), new bi(param6, var9), new bi(var9, var9)};
        var11_ref_bi__ = var10;
        var12 = 0;
        L0: while (true) {
          L1: {
            L2: {
              if (var11_ref_bi__.length <= var12) {
                break L2;
              } else {
                var13 = var11_ref_bi__[var12];
                stackOut_2_0 = 0;
                stackIn_11_0 = stackOut_2_0;
                stackIn_3_0 = stackOut_2_0;
                if (var15 != 0) {
                  break L1;
                } else {
                  var14 = stackIn_3_0;
                  L3: while (true) {
                    L4: {
                      L5: {
                        if (var14 >= var13.field_B.length) {
                          break L5;
                        } else {
                          var13.field_B[var14] = param5;
                          var14++;
                          if (var15 != 0) {
                            break L4;
                          } else {
                            if (var15 == 0) {
                              continue L3;
                            } else {
                              break L5;
                            }
                          }
                        }
                      }
                      var12++;
                      break L4;
                    }
                    if (var15 == 0) {
                      continue L0;
                    } else {
                      break L2;
                    }
                  }
                }
              }
            }
            stackOut_10_0 = 0;
            stackIn_11_0 = stackOut_10_0;
            break L1;
          }
          var11 = stackIn_11_0;
          L6: while (true) {
            L7: {
              if (var11 >= param7) {
                stackOut_21_0 = 0;
                stackIn_22_0 = stackOut_21_0;
                break L7;
              } else {
                stackOut_13_0 = 0;
                stackIn_22_0 = stackOut_13_0;
                stackIn_14_0 = stackOut_13_0;
                if (var15 != 0) {
                  break L7;
                } else {
                  var12 = stackIn_14_0;
                  L8: while (true) {
                    L9: {
                      if (var9 <= var12) {
                        var11++;
                        break L9;
                      } else {
                        var10[6].field_B[var12 + (-1 + (var9 + -var11)) * var9] = param4;
                        var10[8].field_B[var12 + var9 * (-1 + -var11 + var9)] = param4;
                        var10[2].field_B[-1 + (var9 + -var11 + var9 * var12)] = param4;
                        var10[8].field_B[var9 * var12 - var11 - (-var9 + 1)] = param4;
                        var12++;
                        if (var15 != 0) {
                          break L9;
                        } else {
                          continue L8;
                        }
                      }
                    }
                    continue L6;
                  }
                }
              }
            }
            var11 = stackIn_22_0;
            L10: while (true) {
              stackOut_23_0 = param7;
              stackOut_23_1 = var11;
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              L11: while (true) {
                L12: {
                  if (stackIn_24_0 <= stackIn_24_1) {
                    stackOut_30_0 = 0;
                    stackIn_31_0 = stackOut_30_0;
                    break L12;
                  } else {
                    stackOut_25_0 = 0;
                    stackIn_31_0 = stackOut_25_0;
                    stackIn_26_0 = stackOut_25_0;
                    if (var15 != 0) {
                      break L12;
                    } else {
                      var12 = stackIn_26_0;
                      if (var12 >= var9) {
                        var11++;
                        continue L10;
                      } else {
                        var10[0].field_B[var9 * var11 + var12] = param8;
                        var10[0].field_B[var11 + var12 * var9] = param8;
                        stackOut_27_0 = ~(var9 - var11);
                        stackOut_27_1 = ~var12;
                        stackIn_24_0 = stackOut_27_0;
                        stackIn_24_1 = stackOut_27_1;
                        continue L11;
                      }
                    }
                  }
                }
                var11 = stackIn_31_0;
                L13: while (true) {
                  L14: {
                    if (var11 >= param6) {
                      var11 = 0;
                      stackOut_41_0 = param3;
                      stackIn_42_0 = stackOut_41_0;
                      break L14;
                    } else {
                      stackOut_33_0 = 0;
                      stackIn_42_0 = stackOut_33_0;
                      stackIn_34_0 = stackOut_33_0;
                      if (var15 != 0) {
                        break L14;
                      } else {
                        var12 = stackIn_34_0;
                        L15: while (true) {
                          L16: {
                            if (var12 >= param7) {
                              var11++;
                              break L16;
                            } else {
                              var10[7].field_B[(var9 - var12 - 1) * param6 + var11] = param4;
                              var10[5].field_B[var9 + (-1 - var12) + var11 * var9] = param4;
                              var10[1].field_B[var12 * param6 - -var11] = param8;
                              var10[3].field_B[var12 + var9 * var11] = param8;
                              var12++;
                              if (var15 != 0) {
                                break L16;
                              } else {
                                continue L15;
                              }
                            }
                          }
                          continue L13;
                        }
                      }
                    }
                  }
                  L17: {
                    if (stackIn_42_0 == -41) {
                      break L17;
                    } else {
                      bi[] discarded$1 = pg.a(-7, 17, -29, (byte) 74, -118, 12, 82, -100, -35);
                      break L17;
                    }
                  }
                  L18: while (true) {
                    L19: {
                      if (var11 >= param6 >> 1) {
                        break L19;
                      } else {
                        var12 = 0;
                        L20: while (true) {
                          L21: {
                            if (param1 <= var12) {
                              var11++;
                              break L21;
                            } else {
                              var10[1].field_B[param6 * (-1 + -var12 + var9) + var11] = param0;
                              var10[3].field_B[-1 - -var9 + -var12 + var11 * var9] = param0;
                              var10[7].field_B[var11 + param6 * var12] = param0;
                              var10[5].field_B[var9 * var11 - -var12] = param0;
                              var12++;
                              if (var15 != 0) {
                                break L21;
                              } else {
                                continue L20;
                              }
                            }
                          }
                          if (var15 == 0) {
                            continue L18;
                          } else {
                            break L19;
                          }
                        }
                      }
                    }
                    return var10;
                  }
                }
              }
            }
          }
        }
    }

    final static boolean a(int param0, char param1) {
        char[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        int stackIn_10_0 = 0;
        char stackIn_15_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException decompiledCaughtException = null;
        char stackOut_14_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_9_0 = 0;
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
                    var6 = tl.field_p;
                    var2 = var6;
                    var3 = 0;
                    L7: while (true) {
                      if (var3 >= var6.length) {
                        break L6;
                      } else {
                        var4 = var6[var3];
                        stackOut_14_0 = param1;
                        stackIn_20_0 = stackOut_14_0;
                        stackIn_15_0 = stackOut_14_0;
                        if (var5 != 0) {
                          break L5;
                        } else {
                          if (stackIn_15_0 != var4) {
                            var3++;
                            if (var5 == 0) {
                              continue L7;
                            } else {
                              break L6;
                            }
                          } else {
                            stackOut_16_0 = 1;
                            stackIn_17_0 = stackOut_16_0;
                            return stackIn_17_0 != 0;
                          }
                        }
                      }
                    }
                  }
                }
                stackOut_19_0 = 0;
                stackIn_20_0 = stackOut_19_0;
                break L5;
              }
              break L0;
            }
            stackOut_9_0 = 1;
            stackIn_10_0 = stackOut_9_0;
            return stackIn_10_0 != 0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw r.a((Throwable) (Object) var2_ref, "pg.D(" + param0 + 44 + param1 + 41);
        }
        return stackIn_20_0 != 0;
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_6_0 = 0;
        nq stackIn_7_0 = null;
        String stackIn_7_1 = null;
        int stackIn_7_2 = 0;
        int stackIn_7_3 = 0;
        int stackIn_7_4 = 0;
        int stackIn_7_5 = 0;
        int stackIn_7_6 = 0;
        int stackIn_7_7 = 0;
        nq stackIn_8_0 = null;
        String stackIn_8_1 = null;
        int stackIn_8_2 = 0;
        int stackIn_8_3 = 0;
        int stackIn_8_4 = 0;
        int stackIn_8_5 = 0;
        int stackIn_8_6 = 0;
        int stackIn_8_7 = 0;
        nq stackIn_9_0 = null;
        String stackIn_9_1 = null;
        int stackIn_9_2 = 0;
        int stackIn_9_3 = 0;
        int stackIn_9_4 = 0;
        int stackIn_9_5 = 0;
        int stackIn_9_6 = 0;
        int stackIn_9_7 = 0;
        int stackIn_9_8 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        nq stackOut_6_0 = null;
        String stackOut_6_1 = null;
        int stackOut_6_2 = 0;
        int stackOut_6_3 = 0;
        int stackOut_6_4 = 0;
        int stackOut_6_5 = 0;
        int stackOut_6_6 = 0;
        int stackOut_6_7 = 0;
        nq stackOut_8_0 = null;
        String stackOut_8_1 = null;
        int stackOut_8_2 = 0;
        int stackOut_8_3 = 0;
        int stackOut_8_4 = 0;
        int stackOut_8_5 = 0;
        int stackOut_8_6 = 0;
        int stackOut_8_7 = 0;
        int stackOut_8_8 = 0;
        nq stackOut_7_0 = null;
        String stackOut_7_1 = null;
        int stackOut_7_2 = 0;
        int stackOut_7_3 = 0;
        int stackOut_7_4 = 0;
        int stackOut_7_5 = 0;
        int stackOut_7_6 = 0;
        int stackOut_7_7 = 0;
        int stackOut_7_8 = 0;
        L0: {
          var5 = ((pg) this).field_m - -param3;
          if (param1 == -11857) {
            break L0;
          } else {
            bi[] discarded$2 = pg.a(40, -66, 111, (byte) -124, 52, 3, 0, 73, -122);
            break L0;
          }
        }
        var6 = ((pg) this).field_q - -param2;
        super.a(param0, param1, param2, param3);
        if (0 != param0) {
          return;
        } else {
          L1: {
            if (((pg) this).field_I) {
              stackOut_5_0 = -(2 * ((pg) this).field_K) + (-((pg) this).field_H + ((pg) this).field_x);
              stackIn_6_0 = stackOut_5_0;
              break L1;
            } else {
              stackOut_4_0 = 0;
              stackIn_6_0 = stackOut_4_0;
              break L1;
            }
          }
          L2: {
            var7 = stackIn_6_0;
            stackOut_6_0 = ((pg) this).field_G;
            stackOut_6_1 = ((pg) this).field_L;
            stackOut_6_2 = var5 - -var7 + ((pg) this).field_K;
            stackOut_6_3 = var6 - -((pg) this).field_K;
            stackOut_6_4 = ((pg) this).field_H + -((pg) this).field_K;
            stackOut_6_5 = ((pg) this).field_n + -(((pg) this).field_K * 2);
            stackOut_6_6 = ((pg) this).field_D;
            stackOut_6_7 = -1;
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_8_2 = stackOut_6_2;
            stackIn_8_3 = stackOut_6_3;
            stackIn_8_4 = stackOut_6_4;
            stackIn_8_5 = stackOut_6_5;
            stackIn_8_6 = stackOut_6_6;
            stackIn_8_7 = stackOut_6_7;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            stackIn_7_2 = stackOut_6_2;
            stackIn_7_3 = stackOut_6_3;
            stackIn_7_4 = stackOut_6_4;
            stackIn_7_5 = stackOut_6_5;
            stackIn_7_6 = stackOut_6_6;
            stackIn_7_7 = stackOut_6_7;
            if (((pg) this).field_I) {
              stackOut_8_0 = (nq) (Object) stackIn_8_0;
              stackOut_8_1 = (String) (Object) stackIn_8_1;
              stackOut_8_2 = stackIn_8_2;
              stackOut_8_3 = stackIn_8_3;
              stackOut_8_4 = stackIn_8_4;
              stackOut_8_5 = stackIn_8_5;
              stackOut_8_6 = stackIn_8_6;
              stackOut_8_7 = stackIn_8_7;
              stackOut_8_8 = 0;
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              stackIn_9_3 = stackOut_8_3;
              stackIn_9_4 = stackOut_8_4;
              stackIn_9_5 = stackOut_8_5;
              stackIn_9_6 = stackOut_8_6;
              stackIn_9_7 = stackOut_8_7;
              stackIn_9_8 = stackOut_8_8;
              break L2;
            } else {
              stackOut_7_0 = (nq) (Object) stackIn_7_0;
              stackOut_7_1 = (String) (Object) stackIn_7_1;
              stackOut_7_2 = stackIn_7_2;
              stackOut_7_3 = stackIn_7_3;
              stackOut_7_4 = stackIn_7_4;
              stackOut_7_5 = stackIn_7_5;
              stackOut_7_6 = stackIn_7_6;
              stackOut_7_7 = stackIn_7_7;
              stackOut_7_8 = 2;
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              stackIn_9_3 = stackOut_7_3;
              stackIn_9_4 = stackOut_7_4;
              stackIn_9_5 = stackOut_7_5;
              stackIn_9_6 = stackOut_7_6;
              stackIn_9_7 = stackOut_7_7;
              stackIn_9_8 = stackOut_7_8;
              break L2;
            }
          }
          int discarded$3 = ((nq) (Object) stackIn_9_0).a(stackIn_9_1, stackIn_9_2, stackIn_9_3, stackIn_9_4, stackIn_9_5, stackIn_9_6, stackIn_9_7, stackIn_9_8, 1, ((pg) this).field_G.field_J);
          return;
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
