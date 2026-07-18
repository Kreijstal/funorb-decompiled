/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qqa extends hha {
    static String field_p;
    uia field_r;
    static boolean[] field_n;
    int field_s;
    static String field_o;
    static apa field_t;
    byte field_q;

    final byte[] b(byte param0) {
        RuntimeException var2 = null;
        Object stackIn_2_0 = null;
        byte[] stackIn_11_0 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_10_0 = null;
        Object stackOut_1_0 = null;
        try {
          L0: {
            if (param0 == -126) {
              L1: {
                if (((qqa) this).field_m) {
                  break L1;
                } else {
                  if (~((qqa) this).field_r.field_h > ~(-((qqa) this).field_q + ((qqa) this).field_r.field_g.length)) {
                    break L1;
                  } else {
                    stackOut_10_0 = ((qqa) this).field_r.field_g;
                    stackIn_11_0 = stackOut_10_0;
                    break L0;
                  }
                }
              }
              throw new RuntimeException();
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (byte[]) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var2, "qqa.C(" + param0 + ')');
        }
        return stackIn_11_0;
    }

    final int a(byte param0) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_6_0 = 0;
        try {
          L0: {
            if (null == ((qqa) this).field_r) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              if (param0 <= -7) {
                stackOut_8_0 = 100 * ((qqa) this).field_r.field_h / (-((qqa) this).field_q + ((qqa) this).field_r.field_g.length);
                stackIn_9_0 = stackOut_8_0;
                break L0;
              } else {
                stackOut_6_0 = -52;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var2, "qqa.E(" + param0 + ')');
        }
        return stackIn_9_0;
    }

    final static boolean a(uia param0, char[] param1, int param2, boolean param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_20_0 = 0;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (~param2 != ~param1[0]) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0 != 0;
            } else {
              L1: {
                var4_int = param0.field_h;
                var5 = 1;
                if (param3) {
                  break L1;
                } else {
                  field_n = null;
                  break L1;
                }
              }
              L2: while (true) {
                L3: {
                  L4: {
                    if (param1.length <= var5) {
                      break L4;
                    } else {
                      stackOut_10_0 = param0.field_g.length;
                      stackIn_21_0 = stackOut_10_0;
                      stackIn_11_0 = stackOut_10_0;
                      if (var6 != 0) {
                        break L3;
                      } else {
                        L5: {
                          if (stackIn_11_0 == param0.field_h) {
                            break L5;
                          } else {
                            if (param0.c((byte) 106) == param1[var5]) {
                              var5++;
                              if (var6 == 0) {
                                continue L2;
                              } else {
                                break L4;
                              }
                            } else {
                              break L5;
                            }
                          }
                        }
                        param0.field_h = var4_int;
                        stackOut_17_0 = 0;
                        stackIn_18_0 = stackOut_17_0;
                        return stackIn_18_0 != 0;
                      }
                    }
                  }
                  param0.field_h = var4_int;
                  stackOut_20_0 = 1;
                  stackIn_21_0 = stackOut_20_0;
                  break L3;
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var4;
            stackOut_22_1 = new StringBuilder().append("qqa.H(");
            stackIn_25_0 = stackOut_22_0;
            stackIn_25_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param0 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L6;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_26_0 = stackOut_23_0;
              stackIn_26_1 = stackOut_23_1;
              stackIn_26_2 = stackOut_23_2;
              break L6;
            }
          }
          L7: {
            stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
            stackOut_26_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(',');
            stackIn_29_0 = stackOut_26_0;
            stackIn_29_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param1 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L7;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_30_0 = stackOut_27_0;
              stackIn_30_1 = stackOut_27_1;
              stackIn_30_2 = stackOut_27_2;
              break L7;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_21_0 != 0;
    }

    final static ima a(int[] param0, oc param1, int param2, byte param3) {
        Object var4 = null;
        Object var5 = null;
        Object var6 = null;
        float[][] var7 = null;
        int var8 = 0;
        int[] var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int var15 = 0;
        int var16 = 0;
        int var17_int = 0;
        float var17 = 0.0f;
        int var18_int = 0;
        float var18 = 0.0f;
        float var19 = 0.0f;
        int var19_int = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        Object stackIn_3_0 = null;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        int stackIn_15_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_21_1 = 0;
        int stackIn_54_0 = 0;
        ima stackIn_75_0 = null;
        Object stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        Object stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        Object stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        String stackIn_80_2 = null;
        Object stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        Object stackIn_83_0 = null;
        StringBuilder stackIn_83_1 = null;
        Object stackIn_84_0 = null;
        StringBuilder stackIn_84_1 = null;
        String stackIn_84_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_12_1 = 0;
        int stackOut_14_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_20_1 = 0;
        int stackOut_53_0 = 0;
        ima stackOut_74_0 = null;
        Object stackOut_2_0 = null;
        Object stackOut_76_0 = null;
        StringBuilder stackOut_76_1 = null;
        Object stackOut_79_0 = null;
        StringBuilder stackOut_79_1 = null;
        String stackOut_79_2 = null;
        Object stackOut_77_0 = null;
        StringBuilder stackOut_77_1 = null;
        String stackOut_77_2 = null;
        Object stackOut_80_0 = null;
        StringBuilder stackOut_80_1 = null;
        Object stackOut_83_0 = null;
        StringBuilder stackOut_83_1 = null;
        String stackOut_83_2 = null;
        Object stackOut_81_0 = null;
        StringBuilder stackOut_81_1 = null;
        String stackOut_81_2 = null;
        var23 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var4 = null;
            var5 = null;
            var6 = null;
            var7 = null;
            if (param3 == -6) {
              L1: {
                if (param1.field_g == null) {
                  break L1;
                } else {
                  var8 = param1.field_F;
                  var9 = new int[var8];
                  var10 = new int[var8];
                  var11 = new int[var8];
                  var12 = new int[var8];
                  var13 = new int[var8];
                  var14 = new int[var8];
                  var15 = 0;
                  L2: while (true) {
                    L3: {
                      L4: {
                        if (var15 >= var8) {
                          break L4;
                        } else {
                          var9[var15] = 2147483647;
                          var10[var15] = -2147483647;
                          var11[var15] = 2147483647;
                          var12[var15] = -2147483647;
                          var13[var15] = 2147483647;
                          var14[var15] = -2147483647;
                          var15++;
                          if (var23 != 0) {
                            break L3;
                          } else {
                            if (var23 == 0) {
                              continue L2;
                            } else {
                              break L4;
                            }
                          }
                        }
                      }
                      var15 = 0;
                      break L3;
                    }
                    L5: while (true) {
                      stackOut_12_0 = param2;
                      stackOut_12_1 = var15;
                      stackIn_13_0 = stackOut_12_0;
                      stackIn_13_1 = stackOut_12_1;
                      L6: while (true) {
                        L7: {
                          L8: {
                            if (stackIn_13_0 <= stackIn_13_1) {
                              break L8;
                            } else {
                              var16 = param0[var15];
                              stackOut_14_0 = -1;
                              stackIn_54_0 = stackOut_14_0;
                              stackIn_15_0 = stackOut_14_0;
                              if (var23 != 0) {
                                break L7;
                              } else {
                                L9: {
                                  if (stackIn_15_0 == param1.field_g[var16]) {
                                    break L9;
                                  } else {
                                    var17_int = param1.field_g[var16] & 255;
                                    var18_int = 0;
                                    L10: while (true) {
                                      if (3 <= var18_int) {
                                        break L9;
                                      } else {
                                        stackOut_20_0 = -1;
                                        stackOut_20_1 = ~var18_int;
                                        stackIn_13_0 = stackOut_20_0;
                                        stackIn_13_1 = stackOut_20_1;
                                        stackIn_21_0 = stackOut_20_0;
                                        stackIn_21_1 = stackOut_20_1;
                                        if (var23 != 0) {
                                          continue L6;
                                        } else {
                                          L11: {
                                            L12: {
                                              if (stackIn_21_0 != stackIn_21_1) {
                                                break L12;
                                              } else {
                                                var19_int = param1.field_a[var16];
                                                if (var23 == 0) {
                                                  break L11;
                                                } else {
                                                  break L12;
                                                }
                                              }
                                            }
                                            L13: {
                                              if (var18_int == 1) {
                                                break L13;
                                              } else {
                                                var19_int = param1.field_J[var16];
                                                if (var23 == 0) {
                                                  break L11;
                                                } else {
                                                  break L13;
                                                }
                                              }
                                            }
                                            var19_int = param1.field_t[var16];
                                            break L11;
                                          }
                                          L14: {
                                            var20 = param1.field_b[var19_int];
                                            var21 = param1.field_I[var19_int];
                                            var22 = param1.field_p[var19_int];
                                            if (~var20 > ~var9[var17_int]) {
                                              var9[var17_int] = var20;
                                              break L14;
                                            } else {
                                              break L14;
                                            }
                                          }
                                          L15: {
                                            if (~var20 < ~var10[var17_int]) {
                                              var10[var17_int] = var20;
                                              break L15;
                                            } else {
                                              break L15;
                                            }
                                          }
                                          L16: {
                                            if (var21 >= var11[var17_int]) {
                                              break L16;
                                            } else {
                                              var11[var17_int] = var21;
                                              break L16;
                                            }
                                          }
                                          L17: {
                                            if (~var21 < ~var12[var17_int]) {
                                              var12[var17_int] = var21;
                                              break L17;
                                            } else {
                                              break L17;
                                            }
                                          }
                                          L18: {
                                            if (~var22 > ~var13[var17_int]) {
                                              var13[var17_int] = var22;
                                              break L18;
                                            } else {
                                              break L18;
                                            }
                                          }
                                          L19: {
                                            if (~var14[var17_int] > ~var22) {
                                              var14[var17_int] = var22;
                                              break L19;
                                            } else {
                                              break L19;
                                            }
                                          }
                                          var18_int++;
                                          if (var23 == 0) {
                                            continue L10;
                                          } else {
                                            break L9;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                                var15++;
                                if (var23 == 0) {
                                  continue L5;
                                } else {
                                  break L8;
                                }
                              }
                            }
                          }
                          stackOut_53_0 = var8;
                          stackIn_54_0 = stackOut_53_0;
                          break L7;
                        }
                        var4 = (Object) (Object) new int[stackIn_54_0];
                        var5 = (Object) (Object) new int[var8];
                        var7 = new float[var8][];
                        var6 = (Object) (Object) new int[var8];
                        var15 = 0;
                        L20: while (true) {
                          if (~var15 <= ~var8) {
                            break L1;
                          } else {
                            L21: {
                              var16 = param1.field_u[var15];
                              if (var16 <= 0) {
                                break L21;
                              } else {
                                L22: {
                                  L23: {
                                    ((int[]) var4)[var15] = (var10[var15] + var9[var15]) / 2;
                                    ((int[]) var5)[var15] = (var12[var15] + var11[var15]) / 2;
                                    ((int[]) var6)[var15] = (var13[var15] + var14[var15]) / 2;
                                    if (1 == var16) {
                                      break L23;
                                    } else {
                                      L24: {
                                        if (var16 != 2) {
                                          break L24;
                                        } else {
                                          var19 = 64.0f / (float)param1.field_x[var15];
                                          var18 = 64.0f / (float)param1.field_f[var15];
                                          var17 = 64.0f / (float)param1.field_j[var15];
                                          if (var23 == 0) {
                                            break L22;
                                          } else {
                                            break L24;
                                          }
                                        }
                                      }
                                      var19 = (float)param1.field_x[var15] / 1024.0f;
                                      var18 = (float)param1.field_f[var15] / 1024.0f;
                                      var17 = (float)param1.field_j[var15] / 1024.0f;
                                      if (var23 == 0) {
                                        break L22;
                                      } else {
                                        break L23;
                                      }
                                    }
                                  }
                                  L25: {
                                    var20 = param1.field_j[var15];
                                    var18 = 64.0f / (float)param1.field_f[var15];
                                    if (var20 != 0) {
                                      break L25;
                                    } else {
                                      var19 = 1.0f;
                                      var17 = 1.0f;
                                      if (var23 == 0) {
                                        break L22;
                                      } else {
                                        break L25;
                                      }
                                    }
                                  }
                                  L26: {
                                    if (0 >= var20) {
                                      break L26;
                                    } else {
                                      var19 = (float)var20 / 1024.0f;
                                      var17 = 1.0f;
                                      if (var23 == 0) {
                                        break L22;
                                      } else {
                                        break L26;
                                      }
                                    }
                                  }
                                  var17 = (float)(-var20) / 1024.0f;
                                  var19 = 1.0f;
                                  break L22;
                                }
                                var7[var15] = sea.a(var18, var19, 16486, (int) param1.field_K[var15], var17, sea.c((int) param1.field_i[var15], 255), (int) param1.field_s[var15], (int) param1.field_q[var15]);
                                break L21;
                              }
                            }
                            var15++;
                            if (var23 == 0) {
                              continue L20;
                            } else {
                              break L1;
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
              stackOut_74_0 = new ima((int[]) var4, (int[]) var5, (int[]) var6, var7);
              stackIn_75_0 = stackOut_74_0;
              break L0;
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              return (ima) (Object) stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L27: {
            var4 = (Object) (Object) decompiledCaughtException;
            stackOut_76_0 = var4;
            stackOut_76_1 = new StringBuilder().append("qqa.G(");
            stackIn_79_0 = stackOut_76_0;
            stackIn_79_1 = stackOut_76_1;
            stackIn_77_0 = stackOut_76_0;
            stackIn_77_1 = stackOut_76_1;
            if (param0 == null) {
              stackOut_79_0 = stackIn_79_0;
              stackOut_79_1 = (StringBuilder) (Object) stackIn_79_1;
              stackOut_79_2 = "null";
              stackIn_80_0 = stackOut_79_0;
              stackIn_80_1 = stackOut_79_1;
              stackIn_80_2 = stackOut_79_2;
              break L27;
            } else {
              stackOut_77_0 = stackIn_77_0;
              stackOut_77_1 = (StringBuilder) (Object) stackIn_77_1;
              stackOut_77_2 = "{...}";
              stackIn_80_0 = stackOut_77_0;
              stackIn_80_1 = stackOut_77_1;
              stackIn_80_2 = stackOut_77_2;
              break L27;
            }
          }
          L28: {
            stackOut_80_0 = stackIn_80_0;
            stackOut_80_1 = ((StringBuilder) (Object) stackIn_80_1).append(stackIn_80_2).append(',');
            stackIn_83_0 = stackOut_80_0;
            stackIn_83_1 = stackOut_80_1;
            stackIn_81_0 = stackOut_80_0;
            stackIn_81_1 = stackOut_80_1;
            if (param1 == null) {
              stackOut_83_0 = stackIn_83_0;
              stackOut_83_1 = (StringBuilder) (Object) stackIn_83_1;
              stackOut_83_2 = "null";
              stackIn_84_0 = stackOut_83_0;
              stackIn_84_1 = stackOut_83_1;
              stackIn_84_2 = stackOut_83_2;
              break L28;
            } else {
              stackOut_81_0 = stackIn_81_0;
              stackOut_81_1 = (StringBuilder) (Object) stackIn_81_1;
              stackOut_81_2 = "{...}";
              stackIn_84_0 = stackOut_81_0;
              stackIn_84_1 = stackOut_81_1;
              stackIn_84_2 = stackOut_81_2;
              break L28;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_84_0, stackIn_84_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_75_0;
    }

    public static void a(int param0) {
        field_t = null;
        field_n = null;
        if (param0 != 0) {
            return;
        }
        try {
            field_p = null;
            field_o = null;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "qqa.F(" + param0 + ')');
        }
    }

    qqa() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "Move";
        field_o = "Passwords can only contain letters and numbers";
    }
}
