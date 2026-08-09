/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dd extends RuntimeException {
    static int field_d;
    Throwable field_b;
    String field_c;
    static String field_a;
    static int field_e;

    public static void a(byte param0) {
        field_a = null;
        int var1 = 74 / ((-51 - param0) / 54);
    }

    dd(Throwable param0, String param1) {
        this.field_c = param1;
        this.field_b = param0;
    }

    final static am a(String param0, boolean param1) {
        am stackIn_3_0 = null;
        am stackIn_6_0 = null;
        am stackIn_10_0 = null;
        int stackIn_19_0 = 0;
        am stackIn_23_0 = null;
        Object stackIn_27_0 = null;
        am stackIn_37_0 = null;
        am stackIn_42_0 = null;
        Object stackIn_46_0 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        String stackIn_50_2 = null;
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
                    var6 = MonkeyPuzzle2.field_F ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2_int = param0.length();
                        if (0 != var2_int) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackIn_3_0 = si.field_s;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return stackIn_3_0;
                }
                case 4: {
                    try {
                        if (-65 <= (var2_int ^ -1)) {
                            statePc = 7;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackIn_6_0 = wk.field_f;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 6: {
                    return stackIn_6_0;
                }
                case 7: {
                    try {
                        if (34 != param0.charAt(0)) {
                            statePc = 28;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (-35 == (param0.charAt(-1 + var2_int) ^ -1)) {
                            statePc = 11;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        stackIn_10_0 = lh.field_c;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 10: {
                    return stackIn_10_0;
                }
                case 11: {
                    try {
                        var3 = 0;
                        var4 = 1;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (var4 < -1 + var2_int) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        return null;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var5 = param0.charAt(var4);
                        if (var5 == 92) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (var3 != 0) {
                            statePc = 18;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        stackIn_19_0 = 1;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        stackIn_19_0 = 0;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var3 = stackIn_19_0;
                        if (var6 == 0) {
                            statePc = 25;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (var5 != 34) {
                            statePc = 24;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (var3 != 0) {
                            statePc = 24;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        stackIn_23_0 = lh.field_c;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 23: {
                    return stackIn_23_0;
                }
                case 24: {
                    try {
                        var3 = 0;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var4++;
                        if (var6 == 0) {
                            statePc = 12;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        stackIn_27_0 = null;
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 27: {
                    return (am) ((Object) stackIn_27_0);
                }
                case 28: {
                    try {
                        var3 = param1 ? 1 : 0;
                        var4 = 0;
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (var2_int > var4) {
                            statePc = 31;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        return null;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        var5 = param0.charAt(var4);
                        if (var5 != 46) {
                            statePc = 39;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if (-1 == (var4 ^ -1)) {
                            statePc = 36;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if (var4 == var2_int + -1) {
                            statePc = 36;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if (var3 == 0) {
                            statePc = 38;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        stackIn_37_0 = lh.field_c;
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 37: {
                    return stackIn_37_0;
                }
                case 38: {
                    try {
                        var3 = 1;
                        if (var6 == 0) {
                            statePc = 44;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if (-1 == qd.field_b.indexOf(var5)) {
                            statePc = 41;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        stackIn_42_0 = lh.field_c;
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 42: {
                    return stackIn_42_0;
                }
                case 43: {
                    try {
                        var3 = 0;
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        var4++;
                        if (var6 == 0) {
                            statePc = 29;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        stackIn_46_0 = null;
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 46: {
                    return (am) ((Object) stackIn_46_0);
                }
                case 47: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    stackIn_49_0 = (RuntimeException) (var2);
                    stackIn_48_0 = stackIn_49_0;
                    stackIn_49_1 = new StringBuilder().append("dd.B(");
                    stackIn_48_1 = stackIn_49_1;
                    if (param0 == null) {
                        statePc = 49;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 48: {
                    stackIn_50_0 = (RuntimeException) ((Object) stackIn_48_0);
                    stackIn_50_1 = (StringBuilder) ((Object) stackIn_48_1);
                    stackIn_50_2 = "{...}";
                    statePc = 50;
                    continue stateLoop;
                }
                case 49: {
                    stackIn_50_0 = (RuntimeException) ((Object) stackIn_49_0);
                    stackIn_50_1 = (StringBuilder) ((Object) stackIn_49_1);
                    stackIn_50_2 = "null";
                    statePc = 50;
                    continue stateLoop;
                }
                case 50: {
                    throw la.a((Throwable) ((Object) stackIn_50_0), stackIn_50_2 + ',' + param1 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(int param0) {
        if (param0 != 0) {
            field_d = 21;
        }
    }

    static {
        field_a = "Passwords must be between 5 and 20 characters long";
        field_e = 0;
    }
}
