/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ah {
    static String field_a;

    public static void b(byte param0) {
        if (param0 > -90) {
            field_a = (String) null;
            field_a = null;
            return;
        }
        field_a = null;
    }

    final static tf a(String param0, byte param1) {
        tf stackIn_4_0 = null;
        tf stackIn_8_0 = null;
        tf stackIn_14_0 = null;
        int stackIn_22_0 = 0;
        tf stackIn_27_0 = null;
        Object stackIn_31_0 = null;
        tf stackIn_34_0 = null;
        tf stackIn_43_0 = null;
        tf stackIn_48_0 = null;
        Object stackIn_52_0 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        String stackIn_56_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = Lexicominos.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2_int = param0.length();
                        if (var2_int == 0) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        stackIn_4_0 = w.field_k;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 4: {
                    return stackIn_4_0;
                }
                case 5: {
                    try {
                        if (-65 > (var2_int ^ -1)) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        stackIn_8_0 = vi.field_l;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 8: {
                    return stackIn_8_0;
                }
                case 9: {
                    try {
                        if (param0.charAt(0) == 34) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (-35 != (param0.charAt(var2_int - 1) ^ -1)) {
                            statePc = 13;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        stackIn_14_0 = ll.field_a;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 14: {
                    return stackIn_14_0;
                }
                case 15: {
                    try {
                        var3 = 0;
                        var4 = 1;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (-1 + var2_int > var4) {
                            statePc = 18;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        return null;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var5 = param0.charAt(var4);
                        if (var5 != 92) {
                            statePc = 23;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (var3 != 0) {
                            statePc = 21;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        stackIn_22_0 = 1;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        stackIn_22_0 = 0;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var3 = stackIn_22_0;
                        if (var6 == 0) {
                            statePc = 29;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (34 != var5) {
                            statePc = 28;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (var3 == 0) {
                            statePc = 26;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        stackIn_27_0 = ll.field_a;
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 27: {
                    return stackIn_27_0;
                }
                case 28: {
                    try {
                        var3 = 0;
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var4++;
                        if (var6 == 0) {
                            statePc = 16;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        stackIn_31_0 = null;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 31: {
                    return (tf) ((Object) stackIn_31_0);
                }
                case 32: {
                    try {
                        var3 = 0;
                        var4 = 0;
                        if (param1 == 111) {
                            statePc = 35;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        stackIn_34_0 = (tf) null;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 34: {
                    return stackIn_34_0;
                }
                case 35: {
                    try {
                        if (var4 < var2_int) {
                            statePc = 37;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        return null;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        var5 = param0.charAt(var4);
                        if (var5 != 46) {
                            statePc = 45;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if (-1 == (var4 ^ -1)) {
                            statePc = 42;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if (var2_int + -1 == var4) {
                            statePc = 42;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if (var3 == 0) {
                            statePc = 44;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        stackIn_43_0 = ll.field_a;
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 43: {
                    return stackIn_43_0;
                }
                case 44: {
                    try {
                        var3 = 1;
                        if (var6 == 0) {
                            statePc = 50;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        if ((hf.field_c.indexOf(var5) ^ -1) == 0) {
                            statePc = 47;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        stackIn_48_0 = ll.field_a;
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 48: {
                    return stackIn_48_0;
                }
                case 49: {
                    try {
                        var3 = 0;
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        var4++;
                        if (var6 == 0) {
                            statePc = 35;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        stackIn_52_0 = null;
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 52: {
                    return (tf) ((Object) stackIn_52_0);
                }
                case 53: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    stackIn_55_0 = (RuntimeException) (var2);
                    stackIn_54_0 = stackIn_55_0;
                    stackIn_55_1 = new StringBuilder().append("ah.B(");
                    stackIn_54_1 = stackIn_55_1;
                    if (param0 == null) {
                        statePc = 55;
                    } else {
                        statePc = 54;
                    }
                    continue stateLoop;
                }
                case 54: {
                    stackIn_56_0 = (RuntimeException) ((Object) stackIn_54_0);
                    stackIn_56_1 = (StringBuilder) ((Object) stackIn_54_1);
                    stackIn_56_2 = "{...}";
                    statePc = 56;
                    continue stateLoop;
                }
                case 55: {
                    stackIn_56_0 = (RuntimeException) ((Object) stackIn_55_0);
                    stackIn_56_1 = (StringBuilder) ((Object) stackIn_55_1);
                    stackIn_56_2 = "null";
                    statePc = 56;
                    continue stateLoop;
                }
                case 56: {
                    throw ld.a((Throwable) ((Object) stackIn_56_0), stackIn_56_2 + ',' + param1 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static int a(int param0, int param1, boolean param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_8_0 = 0;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = Lexicominos.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var3_int = 0;
                        if (param2) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackIn_3_0 = -15;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return stackIn_3_0;
                }
                case 4: {
                    try {
                        if ((param0 ^ -1) >= -1) {
                            statePc = 7;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var3_int = var3_int << 438251425 | param1 & 1;
                        param0--;
                        stackIn_8_0 = param1 >>> 1;
                        stackIn_6_0 = stackIn_8_0;
                        if (var4 != 0) {
                            statePc = 8;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        param1 = stackIn_6_0;
                        if (var4 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        stackIn_8_0 = var3_int;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 8: {
                    return stackIn_8_0;
                }
                case 9: {
                    var3 = (RuntimeException) ((Object) caughtException);
                    throw ld.a((Throwable) ((Object) var3), "ah.D(" + param0 + ',' + param1 + ',' + param2 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static aj[] a(byte param0) {
        if (param0 != -55) {
          return (aj[]) null;
        } else {
          return new aj[]{gj.field_w, q.field_d, rk.field_n, vb.field_l, rk.field_d, uj.field_c, rj.field_b, li.field_R, nl.field_b, he.field_c, w.field_n, vf.field_m, fb.field_l, qb.field_d};
        }
    }

    static {
        field_a = "Username: ";
    }
}
