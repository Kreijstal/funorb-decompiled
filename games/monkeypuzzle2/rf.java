/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class rf {
    static pj field_a;
    static String field_b;

    final static void a(int param0, int param1, int param2, boolean param3, sj param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
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
        boolean stackIn_10_0 = false;
        int stackIn_27_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_30_1 = 0;
        int stackIn_33_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_50_0 = 0;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        RuntimeException stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        RuntimeException stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        String stackIn_65_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_9_0 = false;
        int stackOut_26_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_29_1 = 0;
        int stackOut_27_0 = 0;
        int stackOut_27_1 = 0;
        int stackOut_32_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_49_0 = 0;
        RuntimeException stackOut_61_0 = null;
        StringBuilder stackOut_61_1 = null;
        RuntimeException stackOut_64_0 = null;
        StringBuilder stackOut_64_1 = null;
        String stackOut_64_2 = null;
        RuntimeException stackOut_62_0 = null;
        StringBuilder stackOut_62_1 = null;
        String stackOut_62_2 = null;
        var19 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = nf.a(3 * (-param2 + param0), true);
              var6 = 3 * param2;
              var7 = var5_int + param1;
              dc.a((byte) 114);
              if (0 >= param4.field_D) {
                break L1;
              } else {
                if (param4.field_N == null) {
                  break L1;
                } else {
                  df.h(-22);
                  break L1;
                }
              }
            }
            s.field_R = 0;
            var8 = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if (param4.field_k <= var8) {
                    break L4;
                  } else {
                    var9 = param4.field_u[var8];
                    var10 = param4.field_L[var8];
                    var11 = param4.field_C[var8];
                    stackOut_9_0 = param3;
                    stackIn_50_0 = stackOut_9_0 ? 1 : 0;
                    stackIn_10_0 = stackOut_9_0;
                    if (var19 != 0) {
                      break L3;
                    } else {
                      L5: {
                        L6: {
                          if (!stackIn_10_0) {
                            break L6;
                          } else {
                            var12 = bg.field_L[var9];
                            var13 = sb.field_l[var9];
                            var14 = -var12 + bg.field_L[var10];
                            var15 = -var12 + bg.field_L[var11];
                            var16 = sb.field_l[var10] - var13;
                            var17 = sb.field_l[var11] - var13;
                            if (var17 * var14 - var16 * var15 < 0) {
                              break L6;
                            } else {
                              if (var19 == 0) {
                                break L5;
                              } else {
                                break L6;
                              }
                            }
                          }
                        }
                        L7: {
                          var12 = ah.field_i[var9];
                          if (-2147483648 != var12) {
                            break L7;
                          } else {
                            if (var19 == 0) {
                              break L5;
                            } else {
                              break L7;
                            }
                          }
                        }
                        L8: {
                          var13 = ah.field_i[var10];
                          if (var13 != -2147483648) {
                            break L8;
                          } else {
                            if (var19 == 0) {
                              break L5;
                            } else {
                              break L8;
                            }
                          }
                        }
                        var14 = ah.field_i[var11];
                        if (var14 == -2147483648) {
                          break L5;
                        } else {
                          L9: {
                            var15 = -var6 + (var14 + var12) - -var13;
                            stackOut_26_0 = hb.field_l.length - 1;
                            stackIn_29_0 = stackOut_26_0;
                            stackIn_27_0 = stackOut_26_0;
                            if (var7 < 0) {
                              stackOut_29_0 = stackIn_29_0;
                              stackOut_29_1 = var15 << -var7;
                              stackIn_30_0 = stackOut_29_0;
                              stackIn_30_1 = stackOut_29_1;
                              break L9;
                            } else {
                              stackOut_27_0 = stackIn_27_0;
                              stackOut_27_1 = var15 >> var7;
                              stackIn_30_0 = stackOut_27_0;
                              stackIn_30_1 = stackOut_27_1;
                              break L9;
                            }
                          }
                          var16 = stackIn_30_0 + -stackIn_30_1;
                          var17 = hb.field_l[var16];
                          L10: while (true) {
                            L11: {
                              L12: {
                                if (var17 >> 4 == 0) {
                                  break L12;
                                } else {
                                  var16--;
                                  stackOut_32_0 = var16;
                                  stackIn_41_0 = stackOut_32_0;
                                  stackIn_33_0 = stackOut_32_0;
                                  if (var19 != 0) {
                                    break L11;
                                  } else {
                                    L13: {
                                      if (stackIn_33_0 >= 0) {
                                        break L13;
                                      } else {
                                        System.err.println("Out of range!");
                                        if (var19 == 0) {
                                          break L5;
                                        } else {
                                          break L13;
                                        }
                                      }
                                    }
                                    var17 = hb.field_l[var16];
                                    if (var19 == 0) {
                                      continue L10;
                                    } else {
                                      break L12;
                                    }
                                  }
                                }
                              }
                              stackOut_40_0 = var17 + (var16 << 4);
                              stackIn_41_0 = stackOut_40_0;
                              break L11;
                            }
                            L14: {
                              var18 = stackIn_41_0;
                              dj.field_c[var18] = var8;
                              hb.field_l[var16] = 1 + var17;
                              if (param4.field_D <= 0) {
                                break L14;
                              } else {
                                if (param4.field_N == null) {
                                  break L14;
                                } else {
                                  cl.field_g[param4.field_N[var8]] = cl.field_g[param4.field_N[var8]] + 1;
                                  break L14;
                                }
                              }
                            }
                            s.field_R = s.field_R + 1;
                            break L5;
                          }
                        }
                      }
                      var8++;
                      if (var19 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                stackOut_49_0 = 0;
                stackIn_50_0 = stackOut_49_0;
                break L3;
              }
              L15: {
                L16: {
                  if (stackIn_50_0 >= param4.field_D) {
                    break L16;
                  } else {
                    if (null == param4.field_N) {
                      break L16;
                    } else {
                      var8 = 0;
                      var9 = 0;
                      L17: while (true) {
                        if (cl.field_g.length <= var9) {
                          break L16;
                        } else {
                          var10 = cl.field_g[var9];
                          cl.field_g[var9] = var8;
                          var8 = var8 + var10;
                          var9++;
                          if (var19 != 0) {
                            break L15;
                          } else {
                            if (var19 == 0) {
                              continue L17;
                            } else {
                              break L16;
                            }
                          }
                        }
                      }
                    }
                  }
                }
                break L15;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L18: {
            var5 = decompiledCaughtException;
            stackOut_61_0 = (RuntimeException) var5;
            stackOut_61_1 = new StringBuilder().append("rf.K(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_64_0 = stackOut_61_0;
            stackIn_64_1 = stackOut_61_1;
            stackIn_62_0 = stackOut_61_0;
            stackIn_62_1 = stackOut_61_1;
            if (param4 == null) {
              stackOut_64_0 = (RuntimeException) (Object) stackIn_64_0;
              stackOut_64_1 = (StringBuilder) (Object) stackIn_64_1;
              stackOut_64_2 = "null";
              stackIn_65_0 = stackOut_64_0;
              stackIn_65_1 = stackOut_64_1;
              stackIn_65_2 = stackOut_64_2;
              break L18;
            } else {
              stackOut_62_0 = (RuntimeException) (Object) stackIn_62_0;
              stackOut_62_1 = (StringBuilder) (Object) stackIn_62_1;
              stackOut_62_2 = "{...}";
              stackIn_65_0 = stackOut_62_0;
              stackIn_65_1 = stackOut_62_1;
              stackIn_65_2 = stackOut_62_2;
              break L18;
            }
          }
          throw la.a((Throwable) (Object) stackIn_65_0, stackIn_65_2 + 41);
        }
    }

    public static void a(boolean param0) {
        try {
            field_b = null;
            field_a = null;
            if (!param0) {
                rf.a(true);
            }
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) (Object) runtimeException, "rf.J(" + param0 + 41);
        }
    }

    abstract wd a(byte param0);

    abstract byte[] b(int param0, int param1);

    abstract int a(int param0, int param1);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Type your email address again to make sure it's correct";
        field_a = new pj();
    }
}
