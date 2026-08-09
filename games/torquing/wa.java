/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wa extends ih {
    static double field_e;
    static String field_c;
    static boolean field_f;
    static df field_d;

    public static void a(int param0) {
        field_d = null;
        field_c = null;
        if (param0 > -40) {
            wa.a((byte) 71, -60, -21, -91, 93, 31, -101, 24, -104);
        }
    }

    final static cp a(boolean param0, fj param1) {
        RuntimeException var2 = null;
        fj var3 = null;
        cp stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                var3 = (fj) null;
                wa.a(true, (fj) null);
                break L1;
              }
            }
            stackIn_3_0 = new cp(param1.g(65536), param1.g(65536), param1.g(65536), param1.g(65536), param1.g(65536), param1.g(65536), param1.g(65536), param1.g(65536), param1.e((byte) 62), param1.i((byte) -101));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("wa.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final static void a(int param0, int param1, boolean param2, int param3, int param4) {
        int var5_int = 0;
        int var6 = 0;
        fj var7 = null;
        int statePc = 0;
        Throwable caughtException = null;
        RuntimeException var5 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = Torquing.field_u;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param2) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        var7 = (fj) null;
                        wa.a(false, (fj) null);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (param3 >= param4) {
                            statePc = 10;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var5_int = param3;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (var5_int >= param4) {
                            statePc = 9;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        qd.field_a[var5_int][param1] = param0;
                        var5_int++;
                        if (var6 != 0) {
                            statePc = 17;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (var6 == 0) {
                            statePc = 5;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (var6 == 0) {
                            statePc = 17;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var5_int = param4;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (param3 <= var5_int) {
                            statePc = 17;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        qd.field_a[var5_int][param1] = param0;
                        var5_int++;
                        if (var6 != 0) {
                            statePc = 17;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (var6 == 0) {
                            statePc = 11;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 16: {
                    var5 = (RuntimeException) ((Object) caughtException);
                    throw rb.a((Throwable) ((Object) var5), "wa.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
                }
                case 17: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static boolean a(char param0, byte param1) {
        int stackIn_12_0 = 0;
        if (param1 != 34) {
          return false;
        } else {
          L0: {
            L1: {
              L2: {
                if (param0 < 48) {
                  break L2;
                } else {
                  if (param0 <= 57) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                if (65 > param0) {
                  break L3;
                } else {
                  if (90 >= param0) {
                    break L1;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (param0 < 97) {
                  break L4;
                } else {
                  if (param0 > 122) {
                    break L4;
                  } else {
                    break L1;
                  }
                }
              }
              stackIn_12_0 = 0;
              break L0;
            }
            stackIn_12_0 = 1;
            break L0;
          }
          return stackIn_12_0 != 0;
        }
    }

    final static t[] a(byte param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int stackIn_3_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_24_1 = 0;
        int stackIn_26_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_29_1 = 0;
        int stackIn_34_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_45_0 = 0;
        int statePc = 0;
        int var9 = 0;
        t[] var10 = null;
        t[] var11_ref_t__ = null;
        int var11 = 0;
        int var12 = 0;
        t var13 = null;
        int var14 = 0;
        int var15 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var15 = Torquing.field_u;
                    var9 = param2 - (-param3 + -param1);
                    var10 = new t[]{new t(var9, var9), new t(param5, var9), new t(var9, var9), new t(var9, param5), new t(64, 64), new t(var9, param5), new t(var9, var9), new t(param5, var9), new t(var9, var9)};
                    var11_ref_t__ = var10;
                    var12 = 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if (var11_ref_t__.length <= var12) {
                        statePc = 10;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    var13 = var11_ref_t__[var12];
                    stackIn_11_0 = 0;
                    stackIn_3_0 = stackIn_11_0;
                    if (var15 != 0) {
                        statePc = 11;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    var14 = stackIn_3_0;
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    if (var13.field_y.length <= var14) {
                        statePc = 8;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    var13.field_y[var14] = param7;
                    var14++;
                    if (var15 != 0) {
                        statePc = 9;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    if (var15 == 0) {
                        statePc = 4;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    var12++;
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    if (var15 == 0) {
                        statePc = 1;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    stackIn_11_0 = 0;
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    var11 = stackIn_11_0;
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    if (param2 <= var11) {
                        statePc = 21;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    stackIn_22_0 = 0;
                    stackIn_14_0 = stackIn_22_0;
                    if (var15 != 0) {
                        statePc = 22;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    var12 = stackIn_14_0;
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    if (var12 >= var9) {
                        statePc = 19;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    var10[6].field_y[var9 * (-1 + var9 + -var11) + var12] = param4;
                    var10[8].field_y[var12 + var9 * (-var11 + (var9 - 1))] = param4;
                    var10[2].field_y[-var11 - (1 + (-var9 - var12 * var9))] = param4;
                    var10[8].field_y[-var11 - 1 - -var9 + var12 * var9] = param4;
                    var12++;
                    if (var15 != 0) {
                        statePc = 20;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    if (var15 == 0) {
                        statePc = 15;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    var11++;
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    if (var15 == 0) {
                        statePc = 12;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    stackIn_22_0 = 0;
                    statePc = 22;
                    continue stateLoop;
                }
                case 22: {
                    var11 = stackIn_22_0;
                    statePc = 23;
                    continue stateLoop;
                }
                case 23: {
                    stackIn_24_0 = param2;
                    stackIn_24_1 = var11;
                    statePc = 24;
                    continue stateLoop;
                }
                case 24: {
                    if (stackIn_24_0 <= stackIn_24_1) {
                        statePc = 33;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    stackIn_34_0 = 0;
                    stackIn_26_0 = stackIn_34_0;
                    if (var15 != 0) {
                        statePc = 34;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    var12 = stackIn_26_0;
                    statePc = 27;
                    continue stateLoop;
                }
                case 27: {
                    if (var9 <= var12) {
                        statePc = 32;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    var10[0].field_y[var12 + var11 * var9] = param6;
                    var10[0].field_y[var12 * var9 + var11] = param6;
                    stackIn_24_0 = var9 + -var11;
                    stackIn_29_0 = stackIn_24_0;
                    stackIn_24_1 = var12;
                    stackIn_29_1 = stackIn_24_1;
                    if (var15 != 0) {
                        statePc = 24;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    if (stackIn_29_0 <= stackIn_29_1) {
                        statePc = 31;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    var10[2].field_y[var11 * var9 + var12] = param6;
                    var10[6].field_y[var11 + var12 * var9] = param6;
                    statePc = 31;
                    continue stateLoop;
                }
                case 31: {
                    var12++;
                    if (var15 == 0) {
                        statePc = 27;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    var11++;
                    if (var15 == 0) {
                        statePc = 23;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    stackIn_34_0 = 0;
                    statePc = 34;
                    continue stateLoop;
                }
                case 34: {
                    var11 = stackIn_34_0;
                    statePc = 35;
                    continue stateLoop;
                }
                case 35: {
                    if (param5 <= var11) {
                        statePc = 44;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    stackIn_45_0 = 0;
                    stackIn_37_0 = stackIn_45_0;
                    if (var15 != 0) {
                        statePc = 45;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    var12 = stackIn_37_0;
                    statePc = 38;
                    continue stateLoop;
                }
                case 38: {
                    if (var12 >= param2) {
                        statePc = 42;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    var10[7].field_y[var11 + (-var12 + (var9 - 1)) * param5] = param4;
                    var10[5].field_y[var9 * var11 + (-1 + var9) - var12] = param4;
                    var10[1].field_y[var11 + param5 * var12] = param6;
                    var10[3].field_y[var12 + var9 * var11] = param6;
                    var12++;
                    if (var15 != 0) {
                        statePc = 43;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    if (var15 == 0) {
                        statePc = 38;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    var11++;
                    statePc = 43;
                    continue stateLoop;
                }
                case 43: {
                    if (var15 == 0) {
                        statePc = 35;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 44: {
                    var11 = 0;
                    stackIn_45_0 = param0;
                    statePc = 45;
                    continue stateLoop;
                }
                case 45: {
                    if (stackIn_45_0 != -63) {
                        statePc = 55;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    if (param5 >> 2080308673 <= var11) {
                        statePc = 54;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 47: {
                    var12 = 0;
                    statePc = 48;
                    continue stateLoop;
                }
                case 48: {
                    if (param1 <= var12) {
                        statePc = 52;
                    } else {
                        statePc = 49;
                    }
                    continue stateLoop;
                }
                case 49: {
                    var10[1].field_y[var11 + param5 * (-var12 + var9 - 1)] = param8;
                    var10[3].field_y[var9 * var11 + var9 - 1 + -var12] = param8;
                    var10[7].field_y[var12 * param5 + var11] = param8;
                    var10[5].field_y[var9 * var11 - -var12] = param8;
                    var12++;
                    if (var15 != 0) {
                        statePc = 53;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 50: {
                    if (var15 == 0) {
                        statePc = 48;
                    } else {
                        statePc = 52;
                    }
                    continue stateLoop;
                }
                case 52: {
                    var11++;
                    statePc = 53;
                    continue stateLoop;
                }
                case 53: {
                    if (var15 == 0) {
                        statePc = 46;
                    } else {
                        statePc = 54;
                    }
                    continue stateLoop;
                }
                case 54: {
                    return var10;
                }
                case 55: {
                    return (t[]) null;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        field_e = Math.atan2(1.0, 0.0);
        field_c = "WORLD:";
        field_f = false;
    }
}
