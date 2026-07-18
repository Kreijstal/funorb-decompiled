/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ml {
    int field_a;
    static String[] field_e;
    int field_d;
    static int[] field_c;
    static int field_f;
    int[] field_g;
    static int field_b;

    final static jp a(mf param0, int param1, int param2, int param3) {
        RuntimeException var4 = null;
        Object stackIn_4_0 = null;
        Object stackIn_7_0 = null;
        jp stackIn_9_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        jp stackOut_8_0 = null;
        Object stackOut_6_0 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            if (!ln.a(-100, param2, param0, param1)) {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              return (jp) (Object) stackIn_4_0;
            } else {
              if (param3 == 1) {
                stackOut_8_0 = ta.b(param3 ^ 13875);
                stackIn_9_0 = stackOut_8_0;
                break L0;
              } else {
                stackOut_6_0 = null;
                stackIn_7_0 = stackOut_6_0;
                return (jp) (Object) stackIn_7_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var4;
            stackOut_10_1 = new StringBuilder().append("ml.C(");
            stackIn_13_0 = stackOut_10_0;
            stackIn_13_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L1;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_14_0 = stackOut_11_0;
              stackIn_14_1 = stackOut_11_1;
              stackIn_14_2 = stackOut_11_2;
              break L1;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_9_0;
    }

    final static void a(int param0, int param1) {
        RuntimeException runtimeException = null;
        pi var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2 = k.field_h;
              var2.e(-13413, param0);
              var2.a(-21, 1);
              if (param1 == -1) {
                break L1;
              } else {
                field_f = 16;
                break L1;
              }
            }
            var2.a(-111, 0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw qb.a((Throwable) (Object) runtimeException, "ml.D(" + param0 + ',' + param1 + ')');
        }
    }

    final int a(byte param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_8_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        int stackIn_19_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_22_1 = 0;
        int stackIn_23_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_14_0 = 0;
        int stackOut_14_1 = 0;
        int stackOut_18_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_21_1 = 0;
        int stackOut_22_0 = 0;
        int stackOut_7_0 = 0;
        var4 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              if (null == ((ml) this).field_g) {
                break L1;
              } else {
                if (((ml) this).field_g.length == 0) {
                  break L1;
                } else {
                  L2: {
                    if (param0 == -95) {
                      break L2;
                    } else {
                      ((ml) this).field_a = -53;
                      break L2;
                    }
                  }
                  var3_int = 1;
                  L3: while (true) {
                    L4: {
                      L5: {
                        if (~((ml) this).field_g.length >= ~var3_int) {
                          break L5;
                        } else {
                          stackOut_14_0 = ~(((ml) this).field_g[-1 + var3_int] + ((ml) this).field_g[var3_int] >> 821112545);
                          stackOut_14_1 = ~param1;
                          stackIn_22_0 = stackOut_14_0;
                          stackIn_22_1 = stackOut_14_1;
                          stackIn_15_0 = stackOut_14_0;
                          stackIn_15_1 = stackOut_14_1;
                          if (var4 != 0) {
                            break L4;
                          } else {
                            if (stackIn_15_0 >= stackIn_15_1) {
                              var3_int++;
                              if (var4 == 0) {
                                continue L3;
                              } else {
                                break L5;
                              }
                            } else {
                              stackOut_18_0 = -1 + var3_int;
                              stackIn_19_0 = stackOut_18_0;
                              return stackIn_19_0;
                            }
                          }
                        }
                      }
                      stackOut_21_0 = ((ml) this).field_g.length;
                      stackOut_21_1 = 1;
                      stackIn_22_0 = stackOut_21_0;
                      stackIn_22_1 = stackOut_21_1;
                      break L4;
                    }
                    stackOut_22_0 = stackIn_22_0 - stackIn_22_1;
                    stackIn_23_0 = stackOut_22_0;
                    break L0;
                  }
                }
              }
            }
            stackOut_7_0 = 0;
            stackIn_8_0 = stackOut_7_0;
            return stackIn_8_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw qb.a((Throwable) (Object) var3, "ml.A(" + param0 + ',' + param1 + ')');
        }
        return stackIn_23_0;
    }

    final int b(byte param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (param0 == 56) {
              L1: {
                L2: {
                  if (((ml) this).field_g == null) {
                    break L2;
                  } else {
                    if (0 != ((ml) this).field_g.length) {
                      stackOut_9_0 = ((ml) this).field_g[-1 + ((ml) this).field_g.length];
                      stackIn_10_0 = stackOut_9_0;
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                stackOut_7_0 = 0;
                stackIn_10_0 = stackOut_7_0;
                break L1;
              }
              break L0;
            } else {
              stackOut_1_0 = 69;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qb.a((Throwable) (Object) var2, "ml.E(" + param0 + ')');
        }
        return stackIn_10_0;
    }

    final static void a(int param0, tp param1, byte param2, int param3, int param4, int param5) {
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
        int stackIn_29_0 = 0;
        int stackIn_45_0 = 0;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        String stackIn_51_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_28_0 = 0;
        int stackOut_44_0 = 0;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        String stackOut_50_2 = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        String stackOut_48_2 = null;
        var20 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              var6_int = (-param5 + param0 << 1898506056) / param1.field_f;
              param4 = param4 + param1.field_b;
              param3 = param3 + param1.field_g;
              var7 = var6_int * param1.field_b + (param5 << -1876976696);
              if (param2 > 80) {
                break L1;
              } else {
                field_e = null;
                break L1;
              }
            }
            L2: {
              var8 = param3 * lb.field_c + param4;
              var9 = 0;
              var10 = param1.field_a;
              var11 = param1.field_d;
              var12 = lb.field_c + -var11;
              var13 = 0;
              if (param3 < lb.field_b) {
                var14 = -param3 + lb.field_b;
                var9 = var9 + var11 * var14;
                var10 = var10 - var14;
                param3 = lb.field_b;
                var8 = var8 + lb.field_c * var14;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (param4 >= lb.field_i) {
                break L3;
              } else {
                var14 = -param4 + lb.field_i;
                param4 = lb.field_i;
                var9 = var9 + var14;
                var13 = var13 + var14;
                var11 = var11 - var14;
                var12 = var12 + var14;
                var7 = var7 + var14 * var6_int;
                var8 = var8 + var14;
                break L3;
              }
            }
            L4: {
              if (~(var10 + param3) < ~lb.field_j) {
                var10 = var10 - (param3 - (-var10 + lb.field_j));
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (lb.field_f < param4 + var11) {
                var14 = param4 + (var11 - lb.field_f);
                var12 = var12 + var14;
                var11 = var11 - var14;
                var13 = var13 + var14;
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if (var11 <= 0) {
                break L6;
              } else {
                if (var10 > 0) {
                  param3 = -var10;
                  L7: while (true) {
                    L8: {
                      L9: {
                        if (param3 >= 0) {
                          break L9;
                        } else {
                          var14 = var7;
                          if (var20 != 0) {
                            break L8;
                          } else {
                            param4 = -var11;
                            L10: while (true) {
                              L11: {
                                L12: {
                                  if (0 <= param4) {
                                    break L12;
                                  } else {
                                    var15 = var14 >> 1032855336;
                                    var14 = var14 + var6_int;
                                    var16 = 256 - var15;
                                    stackOut_28_0 = var15;
                                    stackIn_45_0 = stackOut_28_0;
                                    stackIn_29_0 = stackOut_28_0;
                                    if (var20 != 0) {
                                      break L11;
                                    } else {
                                      L13: {
                                        L14: {
                                          if (stackIn_29_0 >= 0) {
                                            break L14;
                                          } else {
                                            var9++;
                                            var8++;
                                            if (var20 == 0) {
                                              break L13;
                                            } else {
                                              break L14;
                                            }
                                          }
                                        }
                                        L15: {
                                          int incrementValue$1 = var9;
                                          var9++;
                                          var17 = param1.field_j[255 & param1.field_i[incrementValue$1]];
                                          if (var17 != 0) {
                                            L16: {
                                              if (var15 > 255) {
                                                break L16;
                                              } else {
                                                var18 = lb.field_l[var8];
                                                var19 = (16711935 & var18) * var16 - -((var17 & 16711935) * var15) >> 1493300968 & 16711935;
                                                lb.field_l[var8] = ik.a(65280, var16 * ik.a(var18, 65280) - -(var15 * ik.a(65280, var17)) >> 1002640136) + var19;
                                                if (var20 == 0) {
                                                  break L15;
                                                } else {
                                                  break L16;
                                                }
                                              }
                                            }
                                            lb.field_l[var8] = var17;
                                            break L15;
                                          } else {
                                            break L15;
                                          }
                                        }
                                        var8++;
                                        break L13;
                                      }
                                      param4++;
                                      if (var20 == 0) {
                                        continue L10;
                                      } else {
                                        break L12;
                                      }
                                    }
                                  }
                                }
                                var8 = var8 + var12;
                                stackOut_44_0 = var9 + var13;
                                stackIn_45_0 = stackOut_44_0;
                                break L11;
                              }
                              var9 = stackIn_45_0;
                              param3++;
                              if (var20 == 0) {
                                continue L7;
                              } else {
                                break L9;
                              }
                            }
                          }
                        }
                      }
                      break L8;
                    }
                    break L0;
                  }
                } else {
                  break L6;
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L17: {
            var6 = decompiledCaughtException;
            stackOut_47_0 = (RuntimeException) var6;
            stackOut_47_1 = new StringBuilder().append("ml.F(").append(param0).append(',');
            stackIn_50_0 = stackOut_47_0;
            stackIn_50_1 = stackOut_47_1;
            stackIn_48_0 = stackOut_47_0;
            stackIn_48_1 = stackOut_47_1;
            if (param1 == null) {
              stackOut_50_0 = (RuntimeException) (Object) stackIn_50_0;
              stackOut_50_1 = (StringBuilder) (Object) stackIn_50_1;
              stackOut_50_2 = "null";
              stackIn_51_0 = stackOut_50_0;
              stackIn_51_1 = stackOut_50_1;
              stackIn_51_2 = stackOut_50_2;
              break L17;
            } else {
              stackOut_48_0 = (RuntimeException) (Object) stackIn_48_0;
              stackOut_48_1 = (StringBuilder) (Object) stackIn_48_1;
              stackOut_48_2 = "{...}";
              stackIn_51_0 = stackOut_48_0;
              stackIn_51_1 = stackOut_48_1;
              stackIn_51_2 = stackOut_48_2;
              break L17;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_51_0, stackIn_51_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    public static void a(byte param0) {
        try {
            field_c = null;
            field_e = null;
            if (param0 != 111) {
                ml.a(26, (tp) null, (byte) 26, -9, 66, -42);
            }
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) (Object) runtimeException, "ml.B(" + param0 + ')');
        }
    }

    ml(int param0, int param1, int param2) {
        try {
            ((ml) this).field_a = param1;
            ((ml) this).field_g = new int[param2 + 1];
            ((ml) this).field_d = param0;
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) (Object) runtimeException, "ml.<init>(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new int[8192];
    }
}
