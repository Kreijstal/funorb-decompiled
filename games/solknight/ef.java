/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ef {
    static byte[][] field_d;
    static ff field_a;
    static int field_g;
    static kb field_e;
    static int[] field_b;
    static String field_f;
    static boolean[] field_c;

    final static int a(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_3_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_17_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_14_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_2_0 = 0;
        var4 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            if (param0 == 64) {
              var3_int = 1;
              L1: while (true) {
                L2: {
                  L3: {
                    L4: {
                      if (-2 <= (param2 ^ -1)) {
                        break L4;
                      } else {
                        var6 = 1 & param2;
                        var5 = 0;
                        if (var4 != 0) {
                          if (var5 != var6) {
                            break L2;
                          } else {
                            break L3;
                          }
                        } else {
                          L5: {
                            if (var5 != var6) {
                              var3_int = var3_int * param1;
                              break L5;
                            } else {
                              break L5;
                            }
                          }
                          param2 = param2 >> 1;
                          param1 = param1 * param1;
                          if (var4 == 0) {
                            continue L1;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    if (1 != param2) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                  stackOut_14_0 = param1 * var3_int;
                  stackIn_15_0 = stackOut_14_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
                stackOut_16_0 = var3_int;
                stackIn_17_0 = stackOut_16_0;
                decompiledRegionSelector0 = 2;
                break L0;
              }
            } else {
              stackOut_2_0 = -27;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw fc.a((Throwable) ((Object) var3), "ef.C(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_15_0;
          } else {
            return stackIn_17_0;
          }
        }
    }

    public static void a(int param0) {
        if (param0 != 11051) {
          field_e = (kb) null;
          field_a = null;
          field_c = null;
          field_d = (byte[][]) null;
          field_f = null;
          field_e = null;
          field_b = null;
          return;
        } else {
          field_a = null;
          field_c = null;
          field_d = (byte[][]) null;
          field_f = null;
          field_e = null;
          field_b = null;
          return;
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static int a(int param0, int param1, byte param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_10_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_9_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = SolKnight.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var3_int = 0;
                        if (param2 == 69) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackOut_2_0 = 7;
                        stackIn_3_0 = stackOut_2_0;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return stackIn_3_0;
                }
                case 4: {
                    stackOut_4_0 = -1;
                    stackIn_6_0 = stackOut_4_0;
                    statePc = 6;
                    continue stateLoop;
                }
                case 5: {
                    try {
                        stackOut_5_0 = -1;
                        stackIn_6_0 = stackOut_5_0;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (stackIn_6_0 <= (param1 ^ -1)) {
                            statePc = 9;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var3_int = 1 & param0 | var3_int << -1477527295;
                        param1--;
                        stackOut_7_0 = param0 >>> 1;
                        stackIn_10_0 = stackOut_7_0;
                        stackIn_8_0 = stackOut_7_0;
                        if (var4 != 0) {
                            statePc = 10;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        param0 = stackIn_8_0;
                        if (var4 == 0) {
                            statePc = 5;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        stackOut_9_0 = var3_int;
                        stackIn_10_0 = stackOut_9_0;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 10: {
                    return stackIn_10_0;
                }
                case 11: {
                    var3 = (RuntimeException) ((Object) caughtException);
                    throw fc.a((Throwable) ((Object) var3), "ef.D(" + param0 + ',' + param1 + ',' + param2 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(int param0, o param1) {
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var9 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            if (0 != (3 & (param1.field_n | (param1.field_s | (param1.field_t | param1.field_p))))) {
              L1: {
                var2_int = param1.field_p + (3 & param1.field_s);
                var3 = param1.field_t - -(3 & param1.field_n);
                var2_int = var2_int + 4 - (var2_int & 3);
                var3 = 4 - ((var3 & 3) - var3);
                if (param0 >= 113) {
                  break L1;
                } else {
                  field_d = (byte[][]) null;
                  break L1;
                }
              }
              var4 = new int[var3 * var2_int];
              var5 = 0;
              var6 = var2_int * (param1.field_n & 3) + (3 & param1.field_s);
              var7 = 0;
              L2: while (true) {
                L3: {
                  L4: {
                    if (param1.field_t <= var7) {
                      break L4;
                    } else {
                      if (var9 != 0) {
                        break L3;
                      } else {
                        var8 = 0;
                        L5: while (true) {
                          L6: {
                            L7: {
                              if (param1.field_p <= var8) {
                                break L7;
                              } else {
                                incrementValue$2 = var6;
                                var6++;
                                incrementValue$3 = var5;
                                var5++;
                                var4[incrementValue$2] = param1.field_v[incrementValue$3];
                                var8++;
                                if (var9 != 0) {
                                  break L6;
                                } else {
                                  if (var9 == 0) {
                                    continue L5;
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                            }
                            var6 = var6 + (-param1.field_p + var2_int);
                            var7++;
                            break L6;
                          }
                          if (var9 == 0) {
                            continue L2;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                  }
                  param1.field_p = var2_int;
                  param1.field_s = param1.field_s & -4;
                  param1.field_n = param1.field_n & -4;
                  param1.field_t = var3;
                  param1.field_v = var4;
                  break L3;
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) (var2);
            stackOut_17_1 = new StringBuilder().append("ef.A(").append(param0).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L8;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L8;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static {
        field_d = new byte[50][];
        field_a = new ff(14, 0, 4, 1);
        field_b = new int[256];
        field_c = new boolean[64];
        field_f = "If you do nothing the game will revert to normal view in <%0> second.";
    }
}
