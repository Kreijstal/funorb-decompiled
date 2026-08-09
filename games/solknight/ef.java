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
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_3_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_17_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
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
                  stackIn_15_0 = param1 * var3_int;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
                stackIn_17_0 = var3_int;
                decompiledRegionSelector0 = 2;
                break L0;
              }
            } else {
              stackIn_3_0 = -27;
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
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_10_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        RuntimeException var3 = null;
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
                        stackIn_3_0 = 7;
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
                    stackIn_6_0 = -1;
                    statePc = 6;
                    continue stateLoop;
                }
                case 5: {
                    try {
                        stackIn_6_0 = -1;
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
                        stackIn_10_0 = param0 >>> 1;
                        stackIn_8_0 = stackIn_10_0;
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
                        stackIn_10_0 = var3_int;
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
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var9 = SolKnight.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (0 != (3 & (param1.field_n | (param1.field_s | (param1.field_t | param1.field_p))))) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return;
                }
                case 3: {
                    try {
                        var2_int = param1.field_p + (3 & param1.field_s);
                        var3 = param1.field_t - -(3 & param1.field_n);
                        var2_int = var2_int + 4 - (var2_int & 3);
                        var3 = 4 - ((var3 & 3) - var3);
                        if (param0 >= 113) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        field_d = (byte[][]) null;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var4 = new int[var3 * var2_int];
                        var5 = 0;
                        var6 = var2_int * (param1.field_n & 3) + (3 & param1.field_s);
                        var7 = 0;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (param1.field_t <= var7) {
                            statePc = 15;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (var9 != 0) {
                            statePc = 21;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var8 = 0;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (param1.field_p <= var8) {
                            statePc = 13;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        incrementValue$0 = var6;
                        var6++;
                        incrementValue$1 = var5;
                        var5++;
                        var4[incrementValue$0] = param1.field_v[incrementValue$1];
                        var8++;
                        if (var9 != 0) {
                            statePc = 14;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (var9 == 0) {
                            statePc = 9;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var6 = var6 + (-param1.field_p + var2_int);
                        var7++;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (var9 == 0) {
                            statePc = 6;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        param1.field_p = var2_int;
                        param1.field_s = param1.field_s & -4;
                        param1.field_n = param1.field_n & -4;
                        param1.field_t = var3;
                        param1.field_v = var4;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 17: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    stackIn_19_0 = (RuntimeException) (var2);
                    stackIn_18_0 = stackIn_19_0;
                    stackIn_19_1 = new StringBuilder().append("ef.A(").append(param0).append(',');
                    stackIn_18_1 = stackIn_19_1;
                    if (param1 == null) {
                        statePc = 19;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    stackIn_20_0 = (RuntimeException) ((Object) stackIn_18_0);
                    stackIn_20_1 = (StringBuilder) ((Object) stackIn_18_1);
                    stackIn_20_2 = "{...}";
                    statePc = 20;
                    continue stateLoop;
                }
                case 19: {
                    stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
                    stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
                    stackIn_20_2 = "null";
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    throw fc.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ')');
                }
                case 21: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
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
