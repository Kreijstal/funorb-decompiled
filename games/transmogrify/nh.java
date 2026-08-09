/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nh {
    int field_d;
    byte[] field_c;
    int field_a;
    int field_k;
    static String field_l;
    static int[] field_j;
    int field_e;
    int field_i;
    int field_f;
    static String field_h;
    int field_b;
    static String field_m;
    byte[] field_g;

    final static int a(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_9_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_13_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              var3_int = 1;
              if (param2 == 26186) {
                break L1;
              } else {
                field_j = (int[]) null;
                break L1;
              }
            }
            L2: while (true) {
              L3: {
                L4: {
                  if (param1 <= 1) {
                    break L4;
                  } else {
                    stackIn_9_0 = 1 & param1;

                    if (var4 != 0) {
                      break L3;
                    } else {
                      L5: {
                        if (stackIn_9_0 == 0) {
                          break L5;
                        } else {
                          var3_int = var3_int * param0;
                          break L5;
                        }
                      }
                      param0 = param0 * param0;
                      param1 = param1 >> 1;
                      if (var4 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                stackIn_9_0 = param1 ^ -1;
                break L3;
              }
              if (stackIn_9_0 != -2) {
                stackIn_13_0 = var3_int;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                stackIn_11_0 = param0 * var3_int;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ch.a((Throwable) ((Object) var3), "nh.D(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_11_0;
        } else {
          return stackIn_13_0;
        }
    }

    final static void a(ti param0, byte param1) {
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = Transmogrify.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param1 >= 31) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return;
                }
                case 3: {
                    try {
                        if (-1 != ((param0.field_m | param0.field_n) & 3 ^ -1)) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        return;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var2_int = 4 - (param0.field_n & 3);
                        var3 = -(3 & param0.field_m) + 4;
                        var4 = param0.field_n + var2_int;
                        var5 = new int[(param0.field_n + var2_int) * (param0.field_m + var3)];
                        var6 = 0;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (var6 >= param0.field_m) {
                            statePc = 15;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (var8 != 0) {
                            statePc = 16;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var7 = 0;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (var7 >= param0.field_n) {
                            statePc = 13;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var5[(var6 + var3) * var4 - -var2_int - -var7] = param0.field_w[var7 + var6 * param0.field_n];
                        var7++;
                        if (var8 != 0) {
                            statePc = 14;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (var8 == 0) {
                            statePc = 9;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var6++;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (var8 == 0) {
                            statePc = 6;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        param0.field_u = param0.field_u - var2_int;
                        param0.field_n = param0.field_n + var2_int;
                        param0.field_l = param0.field_l - var3;
                        param0.field_w = var5;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        param0.field_m = param0.field_m + var3;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 17: {
                    return;
                }
                case 18: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    stackIn_20_0 = (RuntimeException) (var2);
                    stackIn_19_0 = stackIn_20_0;
                    stackIn_20_1 = new StringBuilder().append("nh.E(");
                    stackIn_19_1 = stackIn_20_1;
                    if (param0 == null) {
                        statePc = 20;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    stackIn_21_0 = (RuntimeException) ((Object) stackIn_19_0);
                    stackIn_21_1 = (StringBuilder) ((Object) stackIn_19_1);
                    stackIn_21_2 = "{...}";
                    statePc = 21;
                    continue stateLoop;
                }
                case 20: {
                    stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
                    stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
                    stackIn_21_2 = "null";
                    statePc = 21;
                    continue stateLoop;
                }
                case 21: {
                    throw ch.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param1 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static gd a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        gd var8 = new gd(param4, param2, param3, param1, param0, param5);
        int var9 = -40 % ((param7 - 6) / 59);
        rh.field_r.a(var8, -107);
        ne.a((byte) 7, var8, param6);
        return var8;
    }

    public static void a(int param0) {
        field_l = null;
        field_j = null;
        field_h = null;
        field_m = null;
        int var1 = 43 % ((47 - param0) / 61);
    }

    final static rj b(int param0) {
        try {
            Throwable var1 = null;
            ti var2 = null;
            rj stackIn_3_0 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                L1: {
                  if (param0 == 1) {
                    break L1;
                  } else {
                    var2 = (ti) null;
                    nh.a((ti) null, (byte) 65);
                    break L1;
                  }
                }
                stackIn_3_0 = (rj) (Class.forName("sk").newInstance());
                break L0;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var1 = decompiledCaughtException;
              return null;
            }
            return stackIn_3_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_j = new int[8192];
        field_l = "Discard";
        field_h = "Cancel";
        field_m = "Unfortunately your configuration doesn't support fullscreen mode. You could try restarting your browser and using the signed applet.";
    }
}
