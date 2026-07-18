/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class et {
    static String field_c;
    static boolean field_d;
    static int field_b;
    static char field_a;

    final static void a(pu param0, int param1, boolean param2, int param3, int param4) {
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
        boolean stackIn_11_0 = false;
        int stackIn_22_0 = 0;
        int stackIn_22_1 = 0;
        int stackIn_24_0 = 0;
        int stackIn_24_1 = 0;
        int stackIn_25_0 = 0;
        int stackIn_25_1 = 0;
        int stackIn_25_2 = 0;
        int stackIn_28_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_44_0 = 0;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        RuntimeException stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        String stackIn_61_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_10_0 = false;
        int stackOut_21_0 = 0;
        int stackOut_21_1 = 0;
        int stackOut_24_0 = 0;
        int stackOut_24_1 = 0;
        int stackOut_24_2 = 0;
        int stackOut_22_0 = 0;
        int stackOut_22_1 = 0;
        int stackOut_22_2 = 0;
        int stackOut_27_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_43_0 = 0;
        RuntimeException stackOut_57_0 = null;
        StringBuilder stackOut_57_1 = null;
        RuntimeException stackOut_60_0 = null;
        StringBuilder stackOut_60_1 = null;
        String stackOut_60_2 = null;
        RuntimeException stackOut_58_0 = null;
        StringBuilder stackOut_58_1 = null;
        String stackOut_58_2 = null;
        var19 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = wl.b((-param3 + param4) * 3, param1 ^ 13329);
              var6 = 3 * param3;
              dp.n(0);
              var7 = param1 + var5_int;
              if (0 >= param0.field_E) {
                break L1;
              } else {
                if (param0.field_K != null) {
                  la.d((byte) 111);
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            hc.field_q = 0;
            var8 = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if (~param0.field_q >= ~var8) {
                    break L4;
                  } else {
                    var9 = param0.field_c[var8];
                    var10 = param0.field_j[var8];
                    var11 = param0.field_e[var8];
                    stackOut_10_0 = param2;
                    stackIn_44_0 = stackOut_10_0 ? 1 : 0;
                    stackIn_11_0 = stackOut_10_0;
                    if (var19 != 0) {
                      break L3;
                    } else {
                      L5: {
                        L6: {
                          if (!stackIn_11_0) {
                            break L6;
                          } else {
                            var12 = ca.field_f[var9];
                            var13 = fa.field_k[var9];
                            var14 = ca.field_f[var10] - var12;
                            var15 = ca.field_f[var11] + -var12;
                            var16 = -var13 + fa.field_k[var10];
                            var17 = fa.field_k[var11] + -var13;
                            if (var17 * var14 + -(var15 * var16) >= 0) {
                              break L5;
                            } else {
                              break L6;
                            }
                          }
                        }
                        L7: {
                          var12 = ls.field_c[var9];
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
                        var13 = ls.field_c[var10];
                        if (var13 == -2147483648) {
                          break L5;
                        } else {
                          var14 = ls.field_c[var11];
                          if (var14 == -2147483648) {
                            break L5;
                          } else {
                            L8: {
                              var15 = var14 + (var13 + var12) - var6;
                              stackOut_21_0 = -1;
                              stackOut_21_1 = am.field_K.length;
                              stackIn_24_0 = stackOut_21_0;
                              stackIn_24_1 = stackOut_21_1;
                              stackIn_22_0 = stackOut_21_0;
                              stackIn_22_1 = stackOut_21_1;
                              if (0 <= var7) {
                                stackOut_24_0 = stackIn_24_0;
                                stackOut_24_1 = stackIn_24_1;
                                stackOut_24_2 = var15 >> var7;
                                stackIn_25_0 = stackOut_24_0;
                                stackIn_25_1 = stackOut_24_1;
                                stackIn_25_2 = stackOut_24_2;
                                break L8;
                              } else {
                                stackOut_22_0 = stackIn_22_0;
                                stackOut_22_1 = stackIn_22_1;
                                stackOut_22_2 = var15 << -var7;
                                stackIn_25_0 = stackOut_22_0;
                                stackIn_25_1 = stackOut_22_1;
                                stackIn_25_2 = stackOut_22_2;
                                break L8;
                              }
                            }
                            var16 = stackIn_25_0 + (stackIn_25_1 - stackIn_25_2);
                            var17 = am.field_K[var16];
                            L9: while (true) {
                              L10: {
                                L11: {
                                  if (var17 >> 4 == 0) {
                                    break L11;
                                  } else {
                                    var16--;
                                    stackOut_27_0 = var16;
                                    stackIn_35_0 = stackOut_27_0;
                                    stackIn_28_0 = stackOut_27_0;
                                    if (var19 != 0) {
                                      break L10;
                                    } else {
                                      L12: {
                                        if (stackIn_28_0 < 0) {
                                          System.err.println("Out of range!");
                                          if (var19 == 0) {
                                            break L5;
                                          } else {
                                            break L12;
                                          }
                                        } else {
                                          break L12;
                                        }
                                      }
                                      var17 = am.field_K[var16];
                                      if (var19 == 0) {
                                        continue L9;
                                      } else {
                                        break L11;
                                      }
                                    }
                                  }
                                }
                                stackOut_34_0 = var17 + (var16 << 4);
                                stackIn_35_0 = stackOut_34_0;
                                break L10;
                              }
                              L13: {
                                var18 = stackIn_35_0;
                                ab.field_c[var18] = var8;
                                am.field_K[var16] = 1 + var17;
                                if (param0.field_E <= 0) {
                                  break L13;
                                } else {
                                  if (null == param0.field_K) {
                                    break L13;
                                  } else {
                                    jp.field_g[param0.field_K[var8]] = jp.field_g[param0.field_K[var8]] + 1;
                                    break L13;
                                  }
                                }
                              }
                              hc.field_q = hc.field_q + 1;
                              break L5;
                            }
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
                stackOut_43_0 = -1;
                stackIn_44_0 = stackOut_43_0;
                break L3;
              }
              L14: {
                L15: {
                  if (stackIn_44_0 <= ~param0.field_E) {
                    break L15;
                  } else {
                    if (param0.field_K != null) {
                      var8 = 0;
                      var9 = 0;
                      L16: while (true) {
                        if (jp.field_g.length <= var9) {
                          break L15;
                        } else {
                          var10 = jp.field_g[var9];
                          jp.field_g[var9] = var8;
                          var8 = var8 + var10;
                          var9++;
                          if (var19 != 0) {
                            break L14;
                          } else {
                            if (var19 == 0) {
                              continue L16;
                            } else {
                              break L15;
                            }
                          }
                        }
                      }
                    } else {
                      break L15;
                    }
                  }
                }
                break L14;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L17: {
            var5 = decompiledCaughtException;
            stackOut_57_0 = (RuntimeException) var5;
            stackOut_57_1 = new StringBuilder().append("et.B(");
            stackIn_60_0 = stackOut_57_0;
            stackIn_60_1 = stackOut_57_1;
            stackIn_58_0 = stackOut_57_0;
            stackIn_58_1 = stackOut_57_1;
            if (param0 == null) {
              stackOut_60_0 = (RuntimeException) (Object) stackIn_60_0;
              stackOut_60_1 = (StringBuilder) (Object) stackIn_60_1;
              stackOut_60_2 = "null";
              stackIn_61_0 = stackOut_60_0;
              stackIn_61_1 = stackOut_60_1;
              stackIn_61_2 = stackOut_60_2;
              break L17;
            } else {
              stackOut_58_0 = (RuntimeException) (Object) stackIn_58_0;
              stackOut_58_1 = (StringBuilder) (Object) stackIn_58_1;
              stackOut_58_2 = "{...}";
              stackIn_61_0 = stackOut_58_0;
              stackIn_61_1 = stackOut_58_1;
              stackIn_61_2 = stackOut_58_2;
              break L17;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_61_0, stackIn_61_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static int a(int param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        int stackIn_13_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_31_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_17_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_12_0 = 0;
        var2 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              boolean discarded$14 = rl.field_C.a(true, -6226, pf.field_b, dl.field_i);
              rl.field_C.d((byte) -102);
              if (param0 == -3) {
                break L1;
              } else {
                int discarded$15 = et.a(103);
                break L1;
              }
            }
            L2: while (true) {
              L3: {
                L4: {
                  if (!jd.i((byte) 80)) {
                    break L4;
                  } else {
                    boolean discarded$16 = rl.field_C.a(rs.field_q, ui.field_i, 80);
                    if (var2 != 0) {
                      break L3;
                    } else {
                      if (var2 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                if (cn.field_r != -1) {
                  break L3;
                } else {
                  if (ac.field_n) {
                    stackOut_17_0 = 3;
                    stackIn_18_0 = stackOut_17_0;
                    return stackIn_18_0;
                  } else {
                    if (du.field_d != mh.field_b) {
                      if (se.field_g.a((byte) -26)) {
                        if (oh.field_L == du.field_d) {
                          stackOut_28_0 = 2;
                          stackIn_29_0 = stackOut_28_0;
                          return stackIn_29_0;
                        } else {
                          stackOut_30_0 = -1;
                          stackIn_31_0 = stackOut_30_0;
                          break L0;
                        }
                      } else {
                        stackOut_23_0 = 1;
                        stackIn_24_0 = stackOut_23_0;
                        return stackIn_24_0;
                      }
                    } else {
                      stackOut_20_0 = 1;
                      stackIn_21_0 = stackOut_20_0;
                      return stackIn_21_0;
                    }
                  }
                }
              }
              var1_int = cn.field_r;
              gl.a(param0 ^ -127, -1);
              stackOut_12_0 = var1_int;
              stackIn_13_0 = stackOut_12_0;
              return stackIn_13_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var1, "et.C(" + param0 + ')');
        }
        return stackIn_31_0;
    }

    public static void c(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 13626) {
                break L1;
              } else {
                et.c(-112);
                break L1;
              }
            }
            field_c = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var1, "et.D(" + param0 + ')');
        }
    }

    final static je b(int param0) {
        RuntimeException var1 = null;
        Object stackIn_2_0 = null;
        je stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        je stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        try {
          L0: {
            if (param0 == -1) {
              stackOut_3_0 = bu.field_a.field_Jb;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (je) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var1, "et.A(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Who can join";
        field_d = false;
        field_a = '/';
    }
}
