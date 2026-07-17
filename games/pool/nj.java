/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nj {
    static int field_b;
    int field_a;
    static int field_c;
    static int field_d;

    final static void a(dd[] param0, byte param1, int param2, int param3, int param4, int param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
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
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        String stackIn_75_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        RuntimeException stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        String stackOut_74_2 = null;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        String stackOut_73_2 = null;
        try {
          L0: {
            if (param0 != null) {
              L1: {
                if (param2 <= 0) {
                  break L1;
                } else {
                  if (param5 <= 0) {
                    break L1;
                  } else {
                    L2: {
                      if (null != param0[3]) {
                        stackOut_8_0 = param0[3].field_w;
                        stackIn_9_0 = stackOut_8_0;
                        break L2;
                      } else {
                        stackOut_7_0 = 0;
                        stackIn_9_0 = stackOut_7_0;
                        break L2;
                      }
                    }
                    L3: {
                      var6_int = stackIn_9_0;
                      if (param0[5] != null) {
                        stackOut_11_0 = param0[5].field_w;
                        stackIn_12_0 = stackOut_11_0;
                        break L3;
                      } else {
                        stackOut_10_0 = 0;
                        stackIn_12_0 = stackOut_10_0;
                        break L3;
                      }
                    }
                    L4: {
                      var7 = stackIn_12_0;
                      if (null == param0[1]) {
                        stackOut_14_0 = 0;
                        stackIn_15_0 = stackOut_14_0;
                        break L4;
                      } else {
                        stackOut_13_0 = param0[1].field_y;
                        stackIn_15_0 = stackOut_13_0;
                        break L4;
                      }
                    }
                    L5: {
                      var8 = stackIn_15_0;
                      if (param0[7] == null) {
                        stackOut_17_0 = 0;
                        stackIn_18_0 = stackOut_17_0;
                        break L5;
                      } else {
                        stackOut_16_0 = param0[7].field_y;
                        stackIn_18_0 = stackOut_16_0;
                        break L5;
                      }
                    }
                    L6: {
                      var9 = stackIn_18_0;
                      var10 = param2 + param3;
                      var11 = param4 + param5;
                      var12 = param3 + var6_int;
                      var13 = var10 + -var7;
                      var14 = param4 - -var8;
                      var15 = -var9 + var11;
                      var16 = var12;
                      var17 = var13;
                      var19 = 52 % ((param1 - -35) / 37);
                      if (~var16 >= ~var17) {
                        break L6;
                      } else {
                        var17 = var6_int * param2 / (var7 + var6_int) + param3;
                        var16 = var6_int * param2 / (var7 + var6_int) + param3;
                        break L6;
                      }
                    }
                    L7: {
                      var18 = var14;
                      var20 = var15;
                      if (var20 < var18) {
                        var20 = param5 * var8 / (var8 - -var9) + param4;
                        var18 = param5 * var8 / (var8 - -var9) + param4;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    L8: {
                      qh.a(mb.field_b);
                      if (null != param0[0]) {
                        qh.d(param3, param4, var16, var18);
                        param0[0].c(param3, param4);
                        qh.b(mb.field_b);
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    L9: {
                      if (param0[2] != null) {
                        qh.d(var17, param4, var10, var18);
                        param0[2].c(var13, param4);
                        qh.b(mb.field_b);
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    L10: {
                      if (param0[6] == null) {
                        break L10;
                      } else {
                        qh.d(param3, var20, var16, var11);
                        param0[6].c(param3, var15);
                        qh.b(mb.field_b);
                        break L10;
                      }
                    }
                    L11: {
                      if (null == param0[8]) {
                        break L11;
                      } else {
                        qh.d(var17, var20, var10, var11);
                        param0[8].c(var13, var15);
                        qh.b(mb.field_b);
                        break L11;
                      }
                    }
                    L12: {
                      if (null == param0[1]) {
                        break L12;
                      } else {
                        if (param0[1].field_w != 0) {
                          qh.d(var16, param4, var17, var18);
                          var21 = var12;
                          L13: while (true) {
                            if (~var21 <= ~var13) {
                              qh.b(mb.field_b);
                              break L12;
                            } else {
                              param0[1].c(var21, param4);
                              var21 = var21 + param0[1].field_w;
                              continue L13;
                            }
                          }
                        } else {
                          break L12;
                        }
                      }
                    }
                    L14: {
                      if (null == param0[7]) {
                        break L14;
                      } else {
                        if (param0[7].field_w != 0) {
                          qh.d(var16, var20, var17, var11);
                          var21 = var12;
                          L15: while (true) {
                            if (~var13 >= ~var21) {
                              qh.b(mb.field_b);
                              break L14;
                            } else {
                              param0[7].c(var21, var15);
                              var21 = var21 + param0[7].field_w;
                              continue L15;
                            }
                          }
                        } else {
                          break L14;
                        }
                      }
                    }
                    L16: {
                      if (null == param0[3]) {
                        break L16;
                      } else {
                        if (0 != param0[3].field_y) {
                          qh.d(param3, var18, var16, var20);
                          var21 = var14;
                          L17: while (true) {
                            if (var21 >= var15) {
                              qh.b(mb.field_b);
                              break L16;
                            } else {
                              param0[3].c(param3, var21);
                              var21 = var21 + param0[3].field_y;
                              continue L17;
                            }
                          }
                        } else {
                          break L16;
                        }
                      }
                    }
                    L18: {
                      if (null == param0[5]) {
                        break L18;
                      } else {
                        if (param0[5].field_y != 0) {
                          qh.d(var17, var18, var10, var20);
                          var21 = var14;
                          L19: while (true) {
                            if (var21 >= var15) {
                              qh.b(mb.field_b);
                              break L18;
                            } else {
                              param0[5].c(var13, var21);
                              var21 = var21 + param0[5].field_y;
                              continue L19;
                            }
                          }
                        } else {
                          break L18;
                        }
                      }
                    }
                    L20: {
                      if (null == param0[4]) {
                        break L20;
                      } else {
                        if (param0[4].field_w == 0) {
                          break L20;
                        } else {
                          if (param0[4].field_y == 0) {
                            break L20;
                          } else {
                            qh.d(var16, var18, var17, var20);
                            var21 = var14;
                            L21: while (true) {
                              if (var21 >= var15) {
                                qh.b(mb.field_b);
                                break L20;
                              } else {
                                var22 = var12;
                                L22: while (true) {
                                  if (var22 >= var13) {
                                    var21 = var21 + param0[4].field_y;
                                    continue L21;
                                  } else {
                                    param0[4].c(var22, var21);
                                    var22 = var22 + param0[4].field_w;
                                    continue L22;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    break L0;
                  }
                }
              }
              return;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L23: {
            var6 = decompiledCaughtException;
            stackOut_72_0 = (RuntimeException) var6;
            stackOut_72_1 = new StringBuilder().append("nj.F(");
            stackIn_74_0 = stackOut_72_0;
            stackIn_74_1 = stackOut_72_1;
            stackIn_73_0 = stackOut_72_0;
            stackIn_73_1 = stackOut_72_1;
            if (param0 == null) {
              stackOut_74_0 = (RuntimeException) (Object) stackIn_74_0;
              stackOut_74_1 = (StringBuilder) (Object) stackIn_74_1;
              stackOut_74_2 = "null";
              stackIn_75_0 = stackOut_74_0;
              stackIn_75_1 = stackOut_74_1;
              stackIn_75_2 = stackOut_74_2;
              break L23;
            } else {
              stackOut_73_0 = (RuntimeException) (Object) stackIn_73_0;
              stackOut_73_1 = (StringBuilder) (Object) stackIn_73_1;
              stackOut_73_2 = "{...}";
              stackIn_75_0 = stackOut_73_0;
              stackIn_75_1 = stackOut_73_1;
              stackIn_75_2 = stackOut_73_2;
              break L23;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_75_0, stackIn_75_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
    }

    final static void a(int param0, int param1, int param2) {
        int var3 = 93 / ((-77 - param2) / 47);
        nn.field_c = param1;
        cd.field_e = param0;
    }

    final static boolean a(int param0, int param1, byte[] param2, int[][] param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_2_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_18_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        try {
          L0: {
            if (param1 > 122) {
              if (param3 != null) {
                var4_int = 0;
                L1: while (true) {
                  if (param3.length <= var4_int) {
                    stackOut_18_0 = 0;
                    stackIn_19_0 = stackOut_18_0;
                    break L0;
                  } else {
                    var5 = param3[var4_int];
                    var6 = 0;
                    L2: while (true) {
                      if (var5.length <= var6) {
                        stackOut_15_0 = 1;
                        stackIn_16_0 = stackOut_15_0;
                        return stackIn_16_0 != 0;
                      } else {
                        L3: {
                          L4: {
                            var7 = var5[var6];
                            var8 = var5[var6 - -1];
                            if (var7 != -1) {
                              if (var8 == (255 & param2[var7])) {
                                break L3;
                              } else {
                                break L4;
                              }
                            } else {
                              if (var8 != param0) {
                                break L4;
                              } else {
                                break L3;
                              }
                            }
                          }
                          var4_int++;
                          continue L1;
                        }
                        var6 += 2;
                        continue L2;
                      }
                    }
                  }
                }
              } else {
                return false;
              }
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var4;
            stackOut_20_1 = new StringBuilder().append("nj.A(").append(param0).append(44).append(param1).append(44);
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param2 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L5;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L5;
            }
          }
          L6: {
            stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
            stackOut_23_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(44);
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param3 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L6;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L6;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + 41);
        }
        return stackIn_19_0 != 0;
    }

    final static int b(int param0, int param1, int param2) {
        if (param0 < 2) {
            if (param1 >= 5) {
                return 1;
            }
            return 0;
        }
        return 2;
    }

    final static java.awt.Frame a(int param0, sj param1, int param2, boolean param3, int param4, int param5) {
        RuntimeException var6 = null;
        dj[] var6_array = null;
        int var7_int = 0;
        java.awt.Frame var7 = null;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        dj[] var11 = null;
        le var12 = null;
        Object stackIn_10_0 = null;
        Object stackIn_24_0 = null;
        Object stackIn_28_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_9_0 = null;
        Object stackOut_27_0 = null;
        Object stackOut_23_0 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        var9 = Pool.field_O;
        try {
          L0: {
            L1: {
              if (!param3) {
                break L1;
              } else {
                var10 = null;
                java.awt.Frame discarded$1 = nj.a(-1, (sj) null, -62, true, 71, -112);
                break L1;
              }
            }
            if (param1.a((byte) 126)) {
              L2: {
                if (param5 == 0) {
                  var11 = s.a((byte) -112, param1);
                  var6_array = var11;
                  if (var6_array != null) {
                    var7_int = 0;
                    var8 = 0;
                    L3: while (true) {
                      if (var11.length <= var8) {
                        if (var7_int != 0) {
                          break L2;
                        } else {
                          return null;
                        }
                      } else {
                        L4: {
                          if (var11[var8].field_f != param2) {
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        var8++;
                        continue L3;
                      }
                    }
                  } else {
                    stackOut_9_0 = null;
                    stackIn_10_0 = stackOut_9_0;
                    return (java.awt.Frame) (Object) stackIn_10_0;
                  }
                } else {
                  break L2;
                }
              }
              var12 = param1.a(param0, param2, param4, param5, (byte) 85);
              L5: while (true) {
                if (var12.field_f != 0) {
                  var7 = (java.awt.Frame) var12.field_e;
                  if (var7 != null) {
                    if (var12.field_f == 2) {
                      og.a(var7, param1, 24442);
                      stackOut_27_0 = null;
                      stackIn_28_0 = stackOut_27_0;
                      break L0;
                    } else {
                      return var7;
                    }
                  } else {
                    stackOut_23_0 = null;
                    stackIn_24_0 = stackOut_23_0;
                    return (java.awt.Frame) (Object) stackIn_24_0;
                  }
                } else {
                  cf.a(-89, 10L);
                  continue L5;
                }
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackOut_29_0 = (RuntimeException) var6;
            stackOut_29_1 = new StringBuilder().append("nj.E(").append(param0).append(44);
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param1 == null) {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L6;
            } else {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L6;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_32_0, stackIn_32_2 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
        return (java.awt.Frame) (Object) stackIn_28_0;
    }

    final static int a(int param0) {
        return ti.field_e;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = 255;
    }
}
