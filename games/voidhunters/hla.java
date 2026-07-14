/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hla {
    static int[] field_a;
    static String field_b;

    final static tv[] a(Class[] param0, tv[] param1, dja[] param2, int param3, tv[] param4, int param5, dja param6) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        tv var9 = null;
        Class var10 = null;
        tv var11 = null;
        tv var11_ref = null;
        int var12 = 0;
        tv var13 = null;
        tv var14 = null;
        int var15 = 0;
        Object stackIn_3_0 = null;
        tv[] stackIn_12_0 = null;
        tv stackIn_16_0 = null;
        tv[] stackIn_45_0 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        String stackIn_51_2 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        String stackIn_55_2 = null;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        String stackIn_59_2 = null;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        String stackIn_63_2 = null;
        RuntimeException stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        String stackIn_67_2 = null;
        Object stackOut_2_0 = null;
        tv[] stackOut_11_0 = null;
        tv stackOut_15_0 = null;
        tv[] stackOut_44_0 = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        String stackOut_48_2 = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        String stackOut_50_2 = null;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        String stackOut_52_2 = null;
        RuntimeException stackOut_54_0 = null;
        StringBuilder stackOut_54_1 = null;
        String stackOut_54_2 = null;
        RuntimeException stackOut_55_0 = null;
        StringBuilder stackOut_55_1 = null;
        RuntimeException stackOut_56_0 = null;
        StringBuilder stackOut_56_1 = null;
        String stackOut_56_2 = null;
        RuntimeException stackOut_58_0 = null;
        StringBuilder stackOut_58_1 = null;
        String stackOut_58_2 = null;
        RuntimeException stackOut_59_0 = null;
        StringBuilder stackOut_59_1 = null;
        RuntimeException stackOut_60_0 = null;
        StringBuilder stackOut_60_1 = null;
        String stackOut_60_2 = null;
        RuntimeException stackOut_62_0 = null;
        StringBuilder stackOut_62_1 = null;
        String stackOut_62_2 = null;
        RuntimeException stackOut_63_0 = null;
        StringBuilder stackOut_63_1 = null;
        RuntimeException stackOut_64_0 = null;
        StringBuilder stackOut_64_1 = null;
        String stackOut_64_2 = null;
        RuntimeException stackOut_66_0 = null;
        StringBuilder stackOut_66_1 = null;
        String stackOut_66_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var15 = VoidHunters.field_G;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (null != param1) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackOut_2_0 = null;
                        stackIn_3_0 = stackOut_2_0;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return (tv[]) (Object) stackIn_3_0;
                }
                case 4: {
                    try {
                        if (null == param4) {
                            statePc = 8;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (param4.length == param1.length) {
                            statePc = 9;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        param4 = param6.a(11995, param1.length);
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var7_int = 97 / ((param3 - -68) / 42);
                        var8 = 0;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if ((param1.length ^ -1) >= (var8 ^ -1)) {
                            statePc = 44;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        stackOut_11_0 = (tv[]) param1;
                        stackIn_45_0 = stackOut_11_0;
                        stackIn_12_0 = stackOut_11_0;
                        if (var15 != 0) {
                            statePc = 45;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var9 = stackIn_12_0[var8];
                        if (null == var9) {
                            statePc = 40;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var10 = ((Object) (Object) param1[var8]).getClass();
                        var11 = param4[var8];
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (var11 == null) {
                            statePc = 21;
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
                        stackOut_15_0 = (tv) var11;
                        stackIn_16_0 = stackOut_15_0;
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
                        if (((Object) (Object) stackIn_16_0).getClass() != var10) {
                            statePc = 21;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        param4[var8] = udb.a(param0, param2, var10, -82);
                        var11_ref = udb.a(param0, param2, var10, -82);
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var12 = param5;
                        var13 = var9;
                        var14 = var11_ref;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (-2 == (var12 ^ -1)) {
                            statePc = 36;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (2 != var12) {
                            statePc = 30;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        ((tva) (Object) var13).a(var14, 29106);
                        if (var15 == 0) {
                            statePc = 39;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if (-4 != (var12 ^ -1)) {
                            statePc = 39;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        ((sjb) (Object) var13).a(var14, (byte) 39);
                        if (var15 == 0) {
                            statePc = 39;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        var13.b((byte) 114, var14);
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if (var15 == 0) {
                            statePc = 43;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        param4[var8] = null;
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        var8++;
                        if (var15 == 0) {
                            statePc = 10;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        stackOut_44_0 = (tv[]) param4;
                        stackIn_45_0 = stackOut_44_0;
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 45: {
                    return stackIn_45_0;
                }
                case 46: {
                    var7 = (RuntimeException) (Object) caughtException;
                    statePc = 47;
                    continue stateLoop;
                }
                case 47: {
                    try {
                        stackOut_47_0 = (RuntimeException) var7;
                        stackOut_47_1 = new StringBuilder().append("hla.A(");
                        stackIn_50_0 = stackOut_47_0;
                        stackIn_50_1 = stackOut_47_1;
                        stackIn_48_0 = stackOut_47_0;
                        stackIn_48_1 = stackOut_47_1;
                        if (param0 == null) {
                            statePc = 50;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        stackOut_48_0 = (RuntimeException) (Object) stackIn_48_0;
                        stackOut_48_1 = (StringBuilder) (Object) stackIn_48_1;
                        stackOut_48_2 = "{...}";
                        stackIn_51_0 = stackOut_48_0;
                        stackIn_51_1 = stackOut_48_1;
                        stackIn_51_2 = stackOut_48_2;
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 49: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 50: {
                    stackOut_50_0 = (RuntimeException) (Object) stackIn_50_0;
                    stackOut_50_1 = (StringBuilder) (Object) stackIn_50_1;
                    stackOut_50_2 = "null";
                    stackIn_51_0 = stackOut_50_0;
                    stackIn_51_1 = stackOut_50_1;
                    stackIn_51_2 = stackOut_50_2;
                    statePc = 51;
                    continue stateLoop;
                }
                case 51: {
                    try {
                        stackOut_51_0 = (RuntimeException) (Object) stackIn_51_0;
                        stackOut_51_1 = ((StringBuilder) (Object) stackIn_51_1).append(stackIn_51_2).append(44);
                        stackIn_54_0 = stackOut_51_0;
                        stackIn_54_1 = stackOut_51_1;
                        stackIn_52_0 = stackOut_51_0;
                        stackIn_52_1 = stackOut_51_1;
                        if (param1 == null) {
                            statePc = 54;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        stackOut_52_0 = (RuntimeException) (Object) stackIn_52_0;
                        stackOut_52_1 = (StringBuilder) (Object) stackIn_52_1;
                        stackOut_52_2 = "{...}";
                        stackIn_55_0 = stackOut_52_0;
                        stackIn_55_1 = stackOut_52_1;
                        stackIn_55_2 = stackOut_52_2;
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 53: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 54: {
                    stackOut_54_0 = (RuntimeException) (Object) stackIn_54_0;
                    stackOut_54_1 = (StringBuilder) (Object) stackIn_54_1;
                    stackOut_54_2 = "null";
                    stackIn_55_0 = stackOut_54_0;
                    stackIn_55_1 = stackOut_54_1;
                    stackIn_55_2 = stackOut_54_2;
                    statePc = 55;
                    continue stateLoop;
                }
                case 55: {
                    try {
                        stackOut_55_0 = (RuntimeException) (Object) stackIn_55_0;
                        stackOut_55_1 = ((StringBuilder) (Object) stackIn_55_1).append(stackIn_55_2).append(44);
                        stackIn_58_0 = stackOut_55_0;
                        stackIn_58_1 = stackOut_55_1;
                        stackIn_56_0 = stackOut_55_0;
                        stackIn_56_1 = stackOut_55_1;
                        if (param2 == null) {
                            statePc = 58;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        stackOut_56_0 = (RuntimeException) (Object) stackIn_56_0;
                        stackOut_56_1 = (StringBuilder) (Object) stackIn_56_1;
                        stackOut_56_2 = "{...}";
                        stackIn_59_0 = stackOut_56_0;
                        stackIn_59_1 = stackOut_56_1;
                        stackIn_59_2 = stackOut_56_2;
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 57: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 58: {
                    stackOut_58_0 = (RuntimeException) (Object) stackIn_58_0;
                    stackOut_58_1 = (StringBuilder) (Object) stackIn_58_1;
                    stackOut_58_2 = "null";
                    stackIn_59_0 = stackOut_58_0;
                    stackIn_59_1 = stackOut_58_1;
                    stackIn_59_2 = stackOut_58_2;
                    statePc = 59;
                    continue stateLoop;
                }
                case 59: {
                    try {
                        stackOut_59_0 = (RuntimeException) (Object) stackIn_59_0;
                        stackOut_59_1 = ((StringBuilder) (Object) stackIn_59_1).append(stackIn_59_2).append(44).append(param3).append(44);
                        stackIn_62_0 = stackOut_59_0;
                        stackIn_62_1 = stackOut_59_1;
                        stackIn_60_0 = stackOut_59_0;
                        stackIn_60_1 = stackOut_59_1;
                        if (param4 == null) {
                            statePc = 62;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        stackOut_60_0 = (RuntimeException) (Object) stackIn_60_0;
                        stackOut_60_1 = (StringBuilder) (Object) stackIn_60_1;
                        stackOut_60_2 = "{...}";
                        stackIn_63_0 = stackOut_60_0;
                        stackIn_63_1 = stackOut_60_1;
                        stackIn_63_2 = stackOut_60_2;
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 61: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 62: {
                    stackOut_62_0 = (RuntimeException) (Object) stackIn_62_0;
                    stackOut_62_1 = (StringBuilder) (Object) stackIn_62_1;
                    stackOut_62_2 = "null";
                    stackIn_63_0 = stackOut_62_0;
                    stackIn_63_1 = stackOut_62_1;
                    stackIn_63_2 = stackOut_62_2;
                    statePc = 63;
                    continue stateLoop;
                }
                case 63: {
                    try {
                        stackOut_63_0 = (RuntimeException) (Object) stackIn_63_0;
                        stackOut_63_1 = ((StringBuilder) (Object) stackIn_63_1).append(stackIn_63_2).append(44).append(param5).append(44);
                        stackIn_66_0 = stackOut_63_0;
                        stackIn_66_1 = stackOut_63_1;
                        stackIn_64_0 = stackOut_63_0;
                        stackIn_64_1 = stackOut_63_1;
                        if (param6 == null) {
                            statePc = 66;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        stackOut_64_0 = (RuntimeException) (Object) stackIn_64_0;
                        stackOut_64_1 = (StringBuilder) (Object) stackIn_64_1;
                        stackOut_64_2 = "{...}";
                        stackIn_67_0 = stackOut_64_0;
                        stackIn_67_1 = stackOut_64_1;
                        stackIn_67_2 = stackOut_64_2;
                        statePc = 67;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 65: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 66: {
                    stackOut_66_0 = (RuntimeException) (Object) stackIn_66_0;
                    stackOut_66_1 = (StringBuilder) (Object) stackIn_66_1;
                    stackOut_66_2 = "null";
                    stackIn_67_0 = stackOut_66_0;
                    stackIn_67_1 = stackOut_66_1;
                    stackIn_67_2 = stackOut_66_2;
                    statePc = 67;
                    continue stateLoop;
                }
                case 67: {
                    throw rta.a((Throwable) (Object) stackIn_67_0, stackIn_67_2 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void a(byte param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          try {
            L0: {
              if (param0 == 39) {
                break L0;
              } else {
                field_a = null;
                break L0;
              }
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter) {
            decompiledCaughtException = decompiledCaughtParameter;
          }
          throw decompiledCaughtException;
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          field_a = null;
          field_b = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Repair";
    }
}
