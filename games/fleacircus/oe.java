/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oe {
    static String field_b;
    static int field_a;
    static String[] field_c;

    public static void a(byte param0) {
        field_b = null;
        field_c = null;
        if (param0 < 7) {
            field_b = (String) null;
        }
    }

    final static void a(byte param0, int param1, int param2) {
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_24_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_30_1 = 0;
        int stackIn_42_0 = 0;
        int stackIn_42_1 = 0;
        int stackIn_43_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_45_1 = 0;
        int stackIn_51_0 = 0;
        int stackIn_51_1 = 0;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        char[][] var13 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var9 = fleas.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param2 < 0) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (param1 >= 0) {
                            statePc = 4;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return;
                }
                case 4: {
                    try {
                        var3_int = param1 * se.field_a.length / ia.field_m[fleas.field_E].length;
                        var13 = ia.field_m[param2][param1].field_c;
                        nl.field_c[param2][param1].d(0, 0);
                        var5 = 39;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (var5 < 0) {
                            statePc = 23;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        stackIn_24_0 = 20;
                        stackIn_7_0 = stackIn_24_0;
                        if (var9 != 0) {
                            statePc = 24;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var6 = stackIn_7_0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (var6 < 0) {
                            statePc = 22;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var7 = var13[var5][var6];
                        stackIn_42_0 = -3;
                        stackIn_10_0 = stackIn_42_0;
                        stackIn_42_1 = var7 ^ -1;
                        stackIn_10_1 = stackIn_42_1;
                        if (var9 != 0) {
                            statePc = 42;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (stackIn_10_0 == stackIn_10_1) {
                            statePc = 16;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (var7 == 7) {
                            statePc = 17;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (var7 == 18) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        lg.a(-4, var6, var3_int, var5);
                        if (var9 == 0) {
                            statePc = 19;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        de.a((byte) 88, var5, var3_int, var6);
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        de.a((byte) 88, var5, var3_int, var6);
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        de.a((byte) 88, var5, var3_int, var6);
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (var7 == 0) {
                            statePc = 21;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        aj.field_t[var7].d(-4 + var5 * 16, -4 + 16 * var6);
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var6--;
                        if (var9 == 0) {
                            statePc = 8;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var5--;
                        if (var9 == 0) {
                            statePc = 5;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        stackIn_24_0 = 39;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var5 = stackIn_24_0;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (var5 < 0) {
                            statePc = 41;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        stackIn_43_0 = 20;
                        stackIn_27_0 = stackIn_43_0;
                        if (var9 != 0) {
                            statePc = 43;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        var6 = stackIn_27_0;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if ((var6 ^ -1) > -1) {
                            statePc = 40;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var7 = var13[var5][var6];
                        stackIn_42_0 = -3;
                        stackIn_30_0 = stackIn_42_0;
                        stackIn_42_1 = var7 ^ -1;
                        stackIn_30_1 = stackIn_42_1;
                        if (var9 != 0) {
                            statePc = 42;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if (stackIn_30_0 == stackIn_30_1) {
                            statePc = 36;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (var7 == 7) {
                            statePc = 37;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if (var7 != 0) {
                            statePc = 34;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        aj.field_t[36 + var7].d(var5 * 16 + -4, 16 * var6 - 4);
                        if (var9 == 0) {
                            statePc = 39;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        de.a((byte) 88, var5, var3_int, var6);
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        de.a((byte) 88, var5, var3_int, var6);
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        de.a((byte) 88, var5, var3_int, var6);
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        var6--;
                        if (var9 == 0) {
                            statePc = 28;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        var5--;
                        if (var9 == 0) {
                            statePc = 25;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        var5 = 39;
                        stackIn_42_0 = 77;
                        stackIn_42_1 = (-51 - param0) / 52;
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        stackIn_43_0 = stackIn_42_0 / stackIn_42_1;
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        var8 = stackIn_43_0;
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        stackIn_45_0 = -1;
                        stackIn_45_1 = var5 ^ -1;
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        if (stackIn_45_0 < stackIn_45_1) {
                            statePc = 59;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if (var9 == 0) {
                            statePc = 48;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        return;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        var6 = 20;
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if (-1 < (var6 ^ -1)) {
                            statePc = 56;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        var7 = var13[var5][var6];
                        stackIn_45_0 = var7;
                        stackIn_51_0 = stackIn_45_0;
                        stackIn_45_1 = 17;
                        stackIn_51_1 = stackIn_45_1;
                        if (var9 != 0) {
                            statePc = 45;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        if (stackIn_51_0 == stackIn_51_1) {
                            statePc = 54;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        if (31 != var7) {
                            statePc = 55;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        aj.field_t[36 + var7].d(-4 + var5 * 16, 16 * var6 + -4);
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        var6--;
                        if (var9 == 0) {
                            statePc = 49;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        var5--;
                        if (var9 == 0) {
                            statePc = 44;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 58: {
                    var3 = (RuntimeException) ((Object) caughtException);
                    throw pf.a((Throwable) ((Object) var3), "oe.A(" + param0 + ',' + param1 + ',' + param2 + ')');
                }
                case 59: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static String a(int param0) {
        if (!ok.field_w) {
          if (oh.field_db <= c.field_S) {
            if (c.field_S >= oh.field_db + fj.field_b) {
              if (param0 == 19007) {
                return null;
              } else {
                oe.a(-82);
                return null;
              }
            } else {
              return gf.field_b;
            }
          } else {
            if (param0 == 19007) {
              return null;
            } else {
              oe.a(-82);
              return null;
            }
          }
        } else {
          if (param0 == 19007) {
            return null;
          } else {
            oe.a(-82);
            return null;
          }
        }
    }

    static {
        field_b = "<%0>Fans:<%1> these blow any fleas in direct horizontal line away from the fan until they hit an obstacle, at which point the fan holds them there. Placing a wall in the jet of air will block the fan and let the fleas fall.";
        field_a = 0;
    }
}
