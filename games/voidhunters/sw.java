/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sw {
    int field_a;
    int field_e;
    int field_d;
    private byte[][] field_g;
    int field_c;
    private byte[] field_b;
    static boolean field_f;

    final int a(String param0, aja[] param1, int[] param2, String[] param3, int param4) {
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
        String var19 = null;
        Exception var20 = null;
        int var20_int = 0;
        int var21 = 0;
        int stackIn_3_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        int stackIn_29_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_54_0 = 0;
        int stackIn_64_0 = 0;
        int stackIn_71_0 = 0;
        int stackIn_78_0 = 0;
        int stackIn_85_0 = 0;
        int stackIn_92_0 = 0;
        int stackIn_99_0 = 0;
        int stackIn_106_0 = 0;
        int stackIn_113_0 = 0;
        int stackIn_124_0 = 0;
        Object stackIn_132_0 = null;
        int stackIn_163_0 = 0;
        int[] stackIn_163_1 = null;
        int stackIn_165_0 = 0;
        int[] stackIn_165_1 = null;
        int stackIn_166_0 = 0;
        int[] stackIn_166_1 = null;
        int stackIn_166_2 = 0;
        int stackIn_174_0 = 0;
        int stackIn_176_0 = 0;
        int stackIn_183_0 = 0;
        int stackIn_189_0 = 0;
        int stackIn_189_1 = 0;
        int stackIn_193_0 = 0;
        RuntimeException stackIn_196_0 = null;
        StringBuilder stackIn_196_1 = null;
        RuntimeException stackIn_198_0 = null;
        StringBuilder stackIn_198_1 = null;
        RuntimeException stackIn_199_0 = null;
        StringBuilder stackIn_199_1 = null;
        String stackIn_199_2 = null;
        RuntimeException stackIn_200_0 = null;
        StringBuilder stackIn_200_1 = null;
        RuntimeException stackIn_202_0 = null;
        StringBuilder stackIn_202_1 = null;
        RuntimeException stackIn_203_0 = null;
        StringBuilder stackIn_203_1 = null;
        String stackIn_203_2 = null;
        RuntimeException stackIn_204_0 = null;
        StringBuilder stackIn_204_1 = null;
        RuntimeException stackIn_206_0 = null;
        StringBuilder stackIn_206_1 = null;
        RuntimeException stackIn_207_0 = null;
        StringBuilder stackIn_207_1 = null;
        String stackIn_207_2 = null;
        RuntimeException stackIn_208_0 = null;
        StringBuilder stackIn_208_1 = null;
        RuntimeException stackIn_210_0 = null;
        StringBuilder stackIn_210_1 = null;
        RuntimeException stackIn_211_0 = null;
        StringBuilder stackIn_211_1 = null;
        String stackIn_211_2 = null;
        int stackOut_2_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_12_1 = 0;
        int stackOut_28_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_63_0 = 0;
        int stackOut_70_0 = 0;
        int stackOut_77_0 = 0;
        int stackOut_84_0 = 0;
        int stackOut_91_0 = 0;
        int stackOut_98_0 = 0;
        int stackOut_105_0 = 0;
        int stackOut_112_0 = 0;
        int stackOut_123_0 = 0;
        Object stackOut_131_0 = null;
        int stackOut_162_0 = 0;
        int[] stackOut_162_1 = null;
        int stackOut_163_0 = 0;
        int[] stackOut_163_1 = null;
        int stackOut_163_2 = 0;
        int stackOut_165_0 = 0;
        int[] stackOut_165_1 = null;
        int stackOut_165_2 = 0;
        int stackOut_173_0 = 0;
        int stackOut_175_0 = 0;
        int stackOut_182_0 = 0;
        int stackOut_188_0 = 0;
        int stackOut_188_1 = 0;
        int stackOut_192_0 = 0;
        RuntimeException stackOut_195_0 = null;
        StringBuilder stackOut_195_1 = null;
        RuntimeException stackOut_196_0 = null;
        StringBuilder stackOut_196_1 = null;
        String stackOut_196_2 = null;
        RuntimeException stackOut_198_0 = null;
        StringBuilder stackOut_198_1 = null;
        String stackOut_198_2 = null;
        RuntimeException stackOut_199_0 = null;
        StringBuilder stackOut_199_1 = null;
        RuntimeException stackOut_200_0 = null;
        StringBuilder stackOut_200_1 = null;
        String stackOut_200_2 = null;
        RuntimeException stackOut_202_0 = null;
        StringBuilder stackOut_202_1 = null;
        String stackOut_202_2 = null;
        RuntimeException stackOut_203_0 = null;
        StringBuilder stackOut_203_1 = null;
        RuntimeException stackOut_204_0 = null;
        StringBuilder stackOut_204_1 = null;
        String stackOut_204_2 = null;
        RuntimeException stackOut_206_0 = null;
        StringBuilder stackOut_206_1 = null;
        String stackOut_206_2 = null;
        RuntimeException stackOut_207_0 = null;
        StringBuilder stackOut_207_1 = null;
        RuntimeException stackOut_208_0 = null;
        StringBuilder stackOut_208_1 = null;
        String stackOut_208_2 = null;
        RuntimeException stackOut_210_0 = null;
        StringBuilder stackOut_210_1 = null;
        String stackOut_210_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var21 = VoidHunters.field_G;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param0 != null) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackOut_2_0 = 0;
                        stackIn_3_0 = stackOut_2_0;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return stackIn_3_0;
                }
                case 4: {
                    try {
                        var6_int = 0;
                        var7 = 0;
                        var8 = -1;
                        var9 = 0;
                        var10 = 0;
                        var11 = -1;
                        var12 = -1;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (param4 == 4) {
                            statePc = 9;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = (stateCaught_5 instanceof Exception ? 8 : 194);
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        int discarded$1 = ((sw) this).a(-30, 'ﾮ', -56);
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = (stateCaught_6 instanceof Exception ? 8 : 194);
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var13 = 0;
                        var14 = param0.length();
                        var15 = 0;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if ((var14 ^ -1) >= (var15 ^ -1)) {
                            statePc = 188;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var16 = 255 & aea.a(-122, param0.charAt(var15));
                        var17 = 0;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        stackOut_12_0 = var16 ^ -1;
                        stackOut_12_1 = -61;
                        stackIn_189_0 = stackOut_12_0;
                        stackIn_189_1 = stackOut_12_1;
                        stackIn_13_0 = stackOut_12_0;
                        stackIn_13_1 = stackOut_12_1;
                        if (var21 != 0) {
                            statePc = 189;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = (stateCaught_12 instanceof Exception ? 15 : 194);
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (stackIn_13_0 == stackIn_13_1) {
                            statePc = 17;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = (stateCaught_13 instanceof Exception ? 15 : 194);
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var11 = var15;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (var21 == 0) {
                            statePc = 187;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = (stateCaught_18 instanceof Exception ? 21 : 194);
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (-1 != var11) {
                            statePc = 30;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = (stateCaught_19 instanceof Exception ? 21 : 194);
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var17 = var17 + ((sw) this).a(var16, (byte) 104);
                        var18 = var15;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (null == ((sw) this).field_g) {
                            statePc = 28;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = (stateCaught_23 instanceof Exception ? 26 : 194);
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if ((var12 ^ -1) == 0) {
                            statePc = 28;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = (stateCaught_24 instanceof Exception ? 26 : 194);
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        var17 = var17 + ((sw) this).field_g[var12][var16];
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        var12 = var16;
                        stackOut_28_0 = var21;
                        stackIn_29_0 = stackOut_28_0;
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (stackIn_29_0 == 0) {
                            statePc = 155;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = (stateCaught_29 instanceof Exception ? 32 : 194);
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if (62 != var16) {
                            statePc = 187;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = (stateCaught_30 instanceof Exception ? 32 : 194);
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var18 = var11;
                        var19 = param0.substring(1 + var11, var15);
                        var11 = -1;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if (!var19.equals((Object) (Object) "br")) {
                            statePc = 44;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = (stateCaught_34 instanceof Exception ? 37 : 194);
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        param3[var13] = param0.substring(var7, var15 + 1);
                        var13++;
                        if ((var13 ^ -1) <= (param3.length ^ -1)) {
                            statePc = 40;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = (stateCaught_35 instanceof Exception ? 39 : 194);
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = (stateCaught_36 instanceof Exception ? 39 : 194);
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = (stateCaught_37 instanceof Exception ? 39 : 194);
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = (stateCaught_38 instanceof Exception ? 39 : 194);
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        stackOut_40_0 = 0;
                        stackIn_41_0 = stackOut_40_0;
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 41: {
                    return stackIn_41_0;
                }
                case 42: {
                    try {
                        var7 = var15 - -1;
                        var12 = -1;
                        var8 = -1;
                        var6_int = 0;
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if (var21 == 0) {
                            statePc = 187;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = (stateCaught_43 instanceof Exception ? 46 : 194);
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        if (!var19.equals((Object) (Object) "lt")) {
                            statePc = 55;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = (stateCaught_44 instanceof Exception ? 46 : 194);
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        var17 = var17 + ((sw) this).a(60, (byte) 37);
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        if (null == ((sw) this).field_g) {
                            statePc = 53;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = (stateCaught_48 instanceof Exception ? 51 : 194);
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if ((var12 ^ -1) == 0) {
                            statePc = 53;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = (stateCaught_49 instanceof Exception ? 51 : 194);
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        var17 = var17 + ((sw) this).field_g[var12][60];
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        var12 = 60;
                        stackOut_53_0 = var21;
                        stackIn_54_0 = stackOut_53_0;
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        if (stackIn_54_0 == 0) {
                            statePc = 154;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = (stateCaught_54 instanceof Exception ? 57 : 194);
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        if (var19.equals((Object) (Object) "gt")) {
                            statePc = 147;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = (stateCaught_55 instanceof Exception ? 60 : 194);
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = (stateCaught_56 instanceof Exception ? 60 : 194);
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = (stateCaught_57 instanceof Exception ? 60 : 194);
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        if (!var19.equals((Object) (Object) "nbsp")) {
                            statePc = 72;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = (stateCaught_58 instanceof Exception ? 60 : 194);
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        var17 = var17 + ((sw) this).a(160, (byte) 52);
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        if (((sw) this).field_g == null) {
                            statePc = 70;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = (stateCaught_62 instanceof Exception ? 66 : 194);
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        stackOut_63_0 = -1;
                        stackIn_64_0 = stackOut_63_0;
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = (stateCaught_63 instanceof Exception ? 66 : 194);
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        if (stackIn_64_0 != var12) {
                            statePc = 69;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = (stateCaught_64 instanceof Exception ? 68 : 194);
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        statePc = 67;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = (stateCaught_65 instanceof Exception ? 68 : 194);
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = (stateCaught_66 instanceof Exception ? 68 : 194);
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        statePc = 70;
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = (stateCaught_67 instanceof Exception ? 68 : 194);
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        var17 = var17 + ((sw) this).field_g[var12][160];
                        statePc = 70;
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        var12 = 160;
                        stackOut_70_0 = var21;
                        stackIn_71_0 = stackOut_70_0;
                        statePc = 71;
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        if (stackIn_71_0 == 0) {
                            statePc = 154;
                        } else {
                            statePc = 72;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = (stateCaught_71 instanceof Exception ? 74 : 194);
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        if (!var19.equals((Object) (Object) "shy")) {
                            statePc = 86;
                        } else {
                            statePc = 73;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = (stateCaught_72 instanceof Exception ? 74 : 194);
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        statePc = 75;
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        var17 = var17 + ((sw) this).a(173, (byte) 100);
                        statePc = 76;
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        if (((sw) this).field_g == null) {
                            statePc = 84;
                        } else {
                            statePc = 77;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = (stateCaught_76 instanceof Exception ? 80 : 194);
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        stackOut_77_0 = var12;
                        stackIn_78_0 = stackOut_77_0;
                        statePc = 78;
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = (stateCaught_77 instanceof Exception ? 80 : 194);
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        if ((stackIn_78_0 ^ -1) != 0) {
                            statePc = 83;
                        } else {
                            statePc = 79;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = (stateCaught_78 instanceof Exception ? 82 : 194);
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        statePc = 81;
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = (stateCaught_79 instanceof Exception ? 82 : 194);
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = (stateCaught_80 instanceof Exception ? 82 : 194);
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        statePc = 84;
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = (stateCaught_81 instanceof Exception ? 82 : 194);
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        var17 = var17 + ((sw) this).field_g[var12][173];
                        statePc = 84;
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        var12 = 173;
                        stackOut_84_0 = var21;
                        stackIn_85_0 = stackOut_84_0;
                        statePc = 85;
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        if (stackIn_85_0 == 0) {
                            statePc = 154;
                        } else {
                            statePc = 86;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = (stateCaught_85 instanceof Exception ? 88 : 194);
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        if (!var19.equals((Object) (Object) "times")) {
                            statePc = 100;
                        } else {
                            statePc = 87;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = (stateCaught_86 instanceof Exception ? 88 : 194);
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        statePc = 89;
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        var17 = var17 + ((sw) this).a(215, (byte) 117);
                        statePc = 90;
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        if (((sw) this).field_g == null) {
                            statePc = 98;
                        } else {
                            statePc = 91;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = (stateCaught_90 instanceof Exception ? 94 : 194);
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        stackOut_91_0 = -1;
                        stackIn_92_0 = stackOut_91_0;
                        statePc = 92;
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = (stateCaught_91 instanceof Exception ? 94 : 194);
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        if (stackIn_92_0 != var12) {
                            statePc = 97;
                        } else {
                            statePc = 93;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = (stateCaught_92 instanceof Exception ? 96 : 194);
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        statePc = 95;
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = (stateCaught_93 instanceof Exception ? 96 : 194);
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = (stateCaught_94 instanceof Exception ? 96 : 194);
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        statePc = 98;
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = (stateCaught_95 instanceof Exception ? 96 : 194);
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        var17 = var17 + ((sw) this).field_g[var12][215];
                        statePc = 98;
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        var12 = 215;
                        stackOut_98_0 = var21;
                        stackIn_99_0 = stackOut_98_0;
                        statePc = 99;
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        if (stackIn_99_0 == 0) {
                            statePc = 154;
                        } else {
                            statePc = 100;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = (stateCaught_99 instanceof Exception ? 102 : 194);
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        if (!var19.equals((Object) (Object) "euro")) {
                            statePc = 114;
                        } else {
                            statePc = 101;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = (stateCaught_100 instanceof Exception ? 102 : 194);
                        continue stateLoop;
                    }
                }
                case 101: {
                    try {
                        statePc = 103;
                        continue stateLoop;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 103: {
                    try {
                        var17 = var17 + ((sw) this).a(8364, (byte) 32);
                        statePc = 104;
                        continue stateLoop;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 104: {
                    try {
                        if (((sw) this).field_g == null) {
                            statePc = 112;
                        } else {
                            statePc = 105;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_104) {
                        caughtException = stateCaught_104;
                        statePc = (stateCaught_104 instanceof Exception ? 108 : 194);
                        continue stateLoop;
                    }
                }
                case 105: {
                    try {
                        stackOut_105_0 = -1;
                        stackIn_106_0 = stackOut_105_0;
                        statePc = 106;
                        continue stateLoop;
                    } catch (Throwable stateCaught_105) {
                        caughtException = stateCaught_105;
                        statePc = (stateCaught_105 instanceof Exception ? 108 : 194);
                        continue stateLoop;
                    }
                }
                case 106: {
                    try {
                        if (stackIn_106_0 != var12) {
                            statePc = 111;
                        } else {
                            statePc = 107;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_106) {
                        caughtException = stateCaught_106;
                        statePc = (stateCaught_106 instanceof Exception ? 110 : 194);
                        continue stateLoop;
                    }
                }
                case 107: {
                    try {
                        statePc = 109;
                        continue stateLoop;
                    } catch (Throwable stateCaught_107) {
                        caughtException = stateCaught_107;
                        statePc = (stateCaught_107 instanceof Exception ? 110 : 194);
                        continue stateLoop;
                    }
                }
                case 108: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_108) {
                        caughtException = stateCaught_108;
                        statePc = (stateCaught_108 instanceof Exception ? 110 : 194);
                        continue stateLoop;
                    }
                }
                case 109: {
                    try {
                        statePc = 112;
                        continue stateLoop;
                    } catch (Throwable stateCaught_109) {
                        caughtException = stateCaught_109;
                        statePc = (stateCaught_109 instanceof Exception ? 110 : 194);
                        continue stateLoop;
                    }
                }
                case 110: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_110) {
                        caughtException = stateCaught_110;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 111: {
                    try {
                        var17 = var17 + ((sw) this).field_g[var12][8364];
                        statePc = 112;
                        continue stateLoop;
                    } catch (Throwable stateCaught_111) {
                        caughtException = stateCaught_111;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 112: {
                    try {
                        var12 = 8364;
                        stackOut_112_0 = var21;
                        stackIn_113_0 = stackOut_112_0;
                        statePc = 113;
                        continue stateLoop;
                    } catch (Throwable stateCaught_112) {
                        caughtException = stateCaught_112;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 113: {
                    try {
                        if (stackIn_113_0 == 0) {
                            statePc = 154;
                        } else {
                            statePc = 114;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_113) {
                        caughtException = stateCaught_113;
                        statePc = (stateCaught_113 instanceof Exception ? 116 : 194);
                        continue stateLoop;
                    }
                }
                case 114: {
                    try {
                        if (!var19.equals((Object) (Object) "copy")) {
                            statePc = 125;
                        } else {
                            statePc = 115;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_114) {
                        caughtException = stateCaught_114;
                        statePc = (stateCaught_114 instanceof Exception ? 116 : 194);
                        continue stateLoop;
                    }
                }
                case 115: {
                    try {
                        statePc = 117;
                        continue stateLoop;
                    } catch (Throwable stateCaught_115) {
                        caughtException = stateCaught_115;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 116: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_116) {
                        caughtException = stateCaught_116;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 117: {
                    try {
                        var17 = var17 + ((sw) this).a(169, (byte) 92);
                        statePc = 118;
                        continue stateLoop;
                    } catch (Throwable stateCaught_117) {
                        caughtException = stateCaught_117;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 118: {
                    try {
                        if (null == ((sw) this).field_g) {
                            statePc = 123;
                        } else {
                            statePc = 119;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_118) {
                        caughtException = stateCaught_118;
                        statePc = (stateCaught_118 instanceof Exception ? 121 : 194);
                        continue stateLoop;
                    }
                }
                case 119: {
                    try {
                        if (var12 == -1) {
                            statePc = 123;
                        } else {
                            statePc = 120;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_119) {
                        caughtException = stateCaught_119;
                        statePc = (stateCaught_119 instanceof Exception ? 121 : 194);
                        continue stateLoop;
                    }
                }
                case 120: {
                    try {
                        statePc = 122;
                        continue stateLoop;
                    } catch (Throwable stateCaught_120) {
                        caughtException = stateCaught_120;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 121: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_121) {
                        caughtException = stateCaught_121;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 122: {
                    try {
                        var17 = var17 + ((sw) this).field_g[var12][169];
                        statePc = 123;
                        continue stateLoop;
                    } catch (Throwable stateCaught_122) {
                        caughtException = stateCaught_122;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 123: {
                    try {
                        var12 = 169;
                        stackOut_123_0 = var21;
                        stackIn_124_0 = stackOut_123_0;
                        statePc = 124;
                        continue stateLoop;
                    } catch (Throwable stateCaught_123) {
                        caughtException = stateCaught_123;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 124: {
                    try {
                        if (stackIn_124_0 == 0) {
                            statePc = 154;
                        } else {
                            statePc = 125;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_124) {
                        caughtException = stateCaught_124;
                        statePc = (stateCaught_124 instanceof Exception ? 127 : 194);
                        continue stateLoop;
                    }
                }
                case 125: {
                    try {
                        if (var19.equals((Object) (Object) "reg")) {
                            statePc = 140;
                        } else {
                            statePc = 126;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_125) {
                        caughtException = stateCaught_125;
                        statePc = (stateCaught_125 instanceof Exception ? 130 : 194);
                        continue stateLoop;
                    }
                }
                case 126: {
                    try {
                        statePc = 128;
                        continue stateLoop;
                    } catch (Throwable stateCaught_126) {
                        caughtException = stateCaught_126;
                        statePc = (stateCaught_126 instanceof Exception ? 130 : 194);
                        continue stateLoop;
                    }
                }
                case 127: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_127) {
                        caughtException = stateCaught_127;
                        statePc = (stateCaught_127 instanceof Exception ? 130 : 194);
                        continue stateLoop;
                    }
                }
                case 128: {
                    try {
                        if (!var19.startsWith("img=")) {
                            statePc = 154;
                        } else {
                            statePc = 129;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_128) {
                        caughtException = stateCaught_128;
                        statePc = (stateCaught_128 instanceof Exception ? 134 : 194);
                        continue stateLoop;
                    }
                }
                case 129: {
                    try {
                        statePc = 131;
                        continue stateLoop;
                    } catch (Throwable stateCaught_129) {
                        caughtException = stateCaught_129;
                        statePc = (stateCaught_129 instanceof Exception ? 134 : 194);
                        continue stateLoop;
                    }
                }
                case 130: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_130) {
                        caughtException = stateCaught_130;
                        statePc = (stateCaught_130 instanceof Exception ? 134 : 194);
                        continue stateLoop;
                    }
                }
                case 131: {
                    try {
                        stackOut_131_0 = null;
                        stackIn_132_0 = stackOut_131_0;
                        statePc = 132;
                        continue stateLoop;
                    } catch (Throwable stateCaught_131) {
                        caughtException = stateCaught_131;
                        statePc = (stateCaught_131 instanceof Exception ? 134 : 194);
                        continue stateLoop;
                    }
                }
                case 132: {
                    try {
                        if (stackIn_132_0 != (Object) (Object) param1) {
                            statePc = 137;
                        } else {
                            statePc = 133;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_132) {
                        caughtException = stateCaught_132;
                        statePc = (stateCaught_132 instanceof Exception ? 136 : 194);
                        continue stateLoop;
                    }
                }
                case 133: {
                    try {
                        statePc = 135;
                        continue stateLoop;
                    } catch (Throwable stateCaught_133) {
                        caughtException = stateCaught_133;
                        statePc = (stateCaught_133 instanceof Exception ? 136 : 194);
                        continue stateLoop;
                    }
                }
                case 134: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_134) {
                        caughtException = stateCaught_134;
                        statePc = (stateCaught_134 instanceof Exception ? 136 : 194);
                        continue stateLoop;
                    }
                }
                case 135: {
                    try {
                        statePc = 154;
                        continue stateLoop;
                    } catch (Throwable stateCaught_135) {
                        caughtException = stateCaught_135;
                        statePc = (stateCaught_135 instanceof Exception ? 136 : 194);
                        continue stateLoop;
                    }
                }
                case 136: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_136) {
                        caughtException = stateCaught_136;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 137: {
                    try {
                        var20_int = lob.a(123, (CharSequence) (Object) var19.substring(4));
                        var17 = var17 + param1[var20_int].c();
                        var12 = -1;
                        statePc = 138;
                        continue stateLoop;
                    } catch (Throwable stateCaught_137) {
                        caughtException = stateCaught_137;
                        statePc = (stateCaught_137 instanceof Exception ? 139 : 194);
                        continue stateLoop;
                    }
                }
                case 138: {
                    try {
                        statePc = 154;
                        continue stateLoop;
                    } catch (Throwable stateCaught_138) {
                        caughtException = stateCaught_138;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 139: {
                    try {
                        var20 = (Exception) (Object) caughtException;
                        if (var21 == 0) {
                            statePc = 154;
                        } else {
                            statePc = 140;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_139) {
                        caughtException = stateCaught_139;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 140: {
                    try {
                        var17 = var17 + ((sw) this).a(174, (byte) 56);
                        statePc = 141;
                        continue stateLoop;
                    } catch (Throwable stateCaught_140) {
                        caughtException = stateCaught_140;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 141: {
                    try {
                        if (((sw) this).field_g == null) {
                            statePc = 146;
                        } else {
                            statePc = 142;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_141) {
                        caughtException = stateCaught_141;
                        statePc = (stateCaught_141 instanceof Exception ? 144 : 194);
                        continue stateLoop;
                    }
                }
                case 142: {
                    try {
                        if ((var12 ^ -1) == 0) {
                            statePc = 146;
                        } else {
                            statePc = 143;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_142) {
                        caughtException = stateCaught_142;
                        statePc = (stateCaught_142 instanceof Exception ? 144 : 194);
                        continue stateLoop;
                    }
                }
                case 143: {
                    try {
                        statePc = 145;
                        continue stateLoop;
                    } catch (Throwable stateCaught_143) {
                        caughtException = stateCaught_143;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 144: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_144) {
                        caughtException = stateCaught_144;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 145: {
                    try {
                        var17 = var17 + ((sw) this).field_g[var12][174];
                        statePc = 146;
                        continue stateLoop;
                    } catch (Throwable stateCaught_145) {
                        caughtException = stateCaught_145;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 146: {
                    try {
                        var12 = 174;
                        if (var21 == 0) {
                            statePc = 154;
                        } else {
                            statePc = 147;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_146) {
                        caughtException = stateCaught_146;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 147: {
                    try {
                        var17 = var17 + ((sw) this).a(62, (byte) 76);
                        statePc = 148;
                        continue stateLoop;
                    } catch (Throwable stateCaught_147) {
                        caughtException = stateCaught_147;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 148: {
                    try {
                        if (((sw) this).field_g == null) {
                            statePc = 153;
                        } else {
                            statePc = 149;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_148) {
                        caughtException = stateCaught_148;
                        statePc = (stateCaught_148 instanceof Exception ? 151 : 194);
                        continue stateLoop;
                    }
                }
                case 149: {
                    try {
                        if (var12 == -1) {
                            statePc = 153;
                        } else {
                            statePc = 150;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_149) {
                        caughtException = stateCaught_149;
                        statePc = (stateCaught_149 instanceof Exception ? 151 : 194);
                        continue stateLoop;
                    }
                }
                case 150: {
                    try {
                        statePc = 152;
                        continue stateLoop;
                    } catch (Throwable stateCaught_150) {
                        caughtException = stateCaught_150;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 151: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_151) {
                        caughtException = stateCaught_151;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 152: {
                    try {
                        var17 = var17 + ((sw) this).field_g[var12][62];
                        statePc = 153;
                        continue stateLoop;
                    } catch (Throwable stateCaught_152) {
                        caughtException = stateCaught_152;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 153: {
                    try {
                        var12 = 62;
                        statePc = 154;
                        continue stateLoop;
                    } catch (Throwable stateCaught_153) {
                        caughtException = stateCaught_153;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 154: {
                    try {
                        var16 = -1;
                        statePc = 155;
                        continue stateLoop;
                    } catch (Throwable stateCaught_154) {
                        caughtException = stateCaught_154;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 155: {
                    try {
                        if (var17 <= 0) {
                            statePc = 187;
                        } else {
                            statePc = 156;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_155) {
                        caughtException = stateCaught_155;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 156: {
                    try {
                        var6_int = var6_int + var17;
                        statePc = 157;
                        continue stateLoop;
                    } catch (Throwable stateCaught_156) {
                        caughtException = stateCaught_156;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 157: {
                    try {
                        if (null == param2) {
                            statePc = 187;
                        } else {
                            statePc = 158;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_157) {
                        caughtException = stateCaught_157;
                        statePc = (stateCaught_157 instanceof Exception ? 160 : 194);
                        continue stateLoop;
                    }
                }
                case 158: {
                    try {
                        if (var16 != 32) {
                            statePc = 162;
                        } else {
                            statePc = 159;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_158) {
                        caughtException = stateCaught_158;
                        statePc = (stateCaught_158 instanceof Exception ? 160 : 194);
                        continue stateLoop;
                    }
                }
                case 159: {
                    try {
                        statePc = 161;
                        continue stateLoop;
                    } catch (Throwable stateCaught_159) {
                        caughtException = stateCaught_159;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 160: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_160) {
                        caughtException = stateCaught_160;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 161: {
                    try {
                        var8 = var15;
                        var10 = 1;
                        var9 = var6_int;
                        statePc = 162;
                        continue stateLoop;
                    } catch (Throwable stateCaught_161) {
                        caughtException = stateCaught_161;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 162: {
                    try {
                        stackOut_162_0 = var6_int ^ -1;
                        stackOut_162_1 = (int[]) param2;
                        stackIn_165_0 = stackOut_162_0;
                        stackIn_165_1 = stackOut_162_1;
                        stackIn_163_0 = stackOut_162_0;
                        stackIn_163_1 = stackOut_162_1;
                        if (param2.length <= var13) {
                            statePc = 165;
                        } else {
                            statePc = 163;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_162) {
                        caughtException = stateCaught_162;
                        statePc = (stateCaught_162 instanceof Exception ? 164 : 194);
                        continue stateLoop;
                    }
                }
                case 163: {
                    try {
                        stackOut_163_0 = stackIn_163_0;
                        stackOut_163_1 = (int[]) (Object) stackIn_163_1;
                        stackOut_163_2 = var13;
                        stackIn_166_0 = stackOut_163_0;
                        stackIn_166_1 = stackOut_163_1;
                        stackIn_166_2 = stackOut_163_2;
                        statePc = 166;
                        continue stateLoop;
                    } catch (Throwable stateCaught_163) {
                        caughtException = stateCaught_163;
                        statePc = (stateCaught_163 instanceof Exception ? 164 : 194);
                        continue stateLoop;
                    }
                }
                case 164: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_164) {
                        caughtException = stateCaught_164;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 165: {
                    try {
                        stackOut_165_0 = stackIn_165_0;
                        stackOut_165_1 = (int[]) (Object) stackIn_165_1;
                        stackOut_165_2 = -1 + param2.length;
                        stackIn_166_0 = stackOut_165_0;
                        stackIn_166_1 = stackOut_165_1;
                        stackIn_166_2 = stackOut_165_2;
                        statePc = 166;
                        continue stateLoop;
                    } catch (Throwable stateCaught_165) {
                        caughtException = stateCaught_165;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 166: {
                    try {
                        if (stackIn_166_0 < (stackIn_166_1[stackIn_166_2] ^ -1)) {
                            statePc = 169;
                        } else {
                            statePc = 167;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_166) {
                        caughtException = stateCaught_166;
                        statePc = (stateCaught_166 instanceof Exception ? 168 : 194);
                        continue stateLoop;
                    }
                }
                case 167: {
                    try {
                        statePc = 185;
                        continue stateLoop;
                    } catch (Throwable stateCaught_167) {
                        caughtException = stateCaught_167;
                        statePc = (stateCaught_167 instanceof Exception ? 168 : 194);
                        continue stateLoop;
                    }
                }
                case 168: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_168) {
                        caughtException = stateCaught_168;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 169: {
                    try {
                        if (0 > var8) {
                            statePc = 177;
                        } else {
                            statePc = 170;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_169) {
                        caughtException = stateCaught_169;
                        statePc = (stateCaught_169 instanceof Exception ? 172 : 194);
                        continue stateLoop;
                    }
                }
                case 170: {
                    try {
                        param3[var13] = param0.substring(var7, -var10 + (var8 - -1));
                        var13++;
                        if ((param3.length ^ -1) < (var13 ^ -1)) {
                            statePc = 175;
                        } else {
                            statePc = 171;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_170) {
                        caughtException = stateCaught_170;
                        statePc = (stateCaught_170 instanceof Exception ? 172 : 194);
                        continue stateLoop;
                    }
                }
                case 171: {
                    try {
                        statePc = 173;
                        continue stateLoop;
                    } catch (Throwable stateCaught_171) {
                        caughtException = stateCaught_171;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 172: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_172) {
                        caughtException = stateCaught_172;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 173: {
                    try {
                        stackOut_173_0 = 0;
                        stackIn_174_0 = stackOut_173_0;
                        statePc = 174;
                        continue stateLoop;
                    } catch (Throwable stateCaught_173) {
                        caughtException = stateCaught_173;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 174: {
                    return stackIn_174_0;
                }
                case 175: {
                    try {
                        var7 = 1 + var8;
                        var8 = -1;
                        var12 = -1;
                        var6_int = var6_int - var9;
                        stackOut_175_0 = var21;
                        stackIn_176_0 = stackOut_175_0;
                        statePc = 176;
                        continue stateLoop;
                    } catch (Throwable stateCaught_175) {
                        caughtException = stateCaught_175;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 176: {
                    try {
                        if (stackIn_176_0 == 0) {
                            statePc = 185;
                        } else {
                            statePc = 177;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_176) {
                        caughtException = stateCaught_176;
                        statePc = (stateCaught_176 instanceof Exception ? 179 : 194);
                        continue stateLoop;
                    }
                }
                case 177: {
                    try {
                        param3[var13] = param0.substring(var7, var18);
                        var13++;
                        if ((param3.length ^ -1) >= (var13 ^ -1)) {
                            statePc = 182;
                        } else {
                            statePc = 178;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_177) {
                        caughtException = stateCaught_177;
                        statePc = (stateCaught_177 instanceof Exception ? 181 : 194);
                        continue stateLoop;
                    }
                }
                case 178: {
                    try {
                        statePc = 180;
                        continue stateLoop;
                    } catch (Throwable stateCaught_178) {
                        caughtException = stateCaught_178;
                        statePc = (stateCaught_178 instanceof Exception ? 181 : 194);
                        continue stateLoop;
                    }
                }
                case 179: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_179) {
                        caughtException = stateCaught_179;
                        statePc = (stateCaught_179 instanceof Exception ? 181 : 194);
                        continue stateLoop;
                    }
                }
                case 180: {
                    try {
                        statePc = 184;
                        continue stateLoop;
                    } catch (Throwable stateCaught_180) {
                        caughtException = stateCaught_180;
                        statePc = (stateCaught_180 instanceof Exception ? 181 : 194);
                        continue stateLoop;
                    }
                }
                case 181: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_181) {
                        caughtException = stateCaught_181;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 182: {
                    try {
                        stackOut_182_0 = 0;
                        stackIn_183_0 = stackOut_182_0;
                        statePc = 183;
                        continue stateLoop;
                    } catch (Throwable stateCaught_182) {
                        caughtException = stateCaught_182;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 183: {
                    return stackIn_183_0;
                }
                case 184: {
                    try {
                        var7 = var18;
                        var8 = -1;
                        var6_int = var17;
                        var12 = -1;
                        statePc = 185;
                        continue stateLoop;
                    } catch (Throwable stateCaught_184) {
                        caughtException = stateCaught_184;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 185: {
                    try {
                        if (var16 != 45) {
                            statePc = 187;
                        } else {
                            statePc = 186;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_185) {
                        caughtException = stateCaught_185;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 186: {
                    try {
                        var8 = var15;
                        var10 = 0;
                        var9 = var6_int;
                        statePc = 187;
                        continue stateLoop;
                    } catch (Throwable stateCaught_186) {
                        caughtException = stateCaught_186;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 187: {
                    try {
                        var15++;
                        if (var21 == 0) {
                            statePc = 10;
                        } else {
                            statePc = 188;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_187) {
                        caughtException = stateCaught_187;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 188: {
                    try {
                        stackOut_188_0 = var7 ^ -1;
                        stackOut_188_1 = param0.length() ^ -1;
                        stackIn_189_0 = stackOut_188_0;
                        stackIn_189_1 = stackOut_188_1;
                        statePc = 189;
                        continue stateLoop;
                    } catch (Throwable stateCaught_188) {
                        caughtException = stateCaught_188;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 189: {
                    try {
                        if (stackIn_189_0 > stackIn_189_1) {
                            statePc = 191;
                        } else {
                            statePc = 190;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_189) {
                        caughtException = stateCaught_189;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 190: {
                    try {
                        statePc = 192;
                        continue stateLoop;
                    } catch (Throwable stateCaught_190) {
                        caughtException = stateCaught_190;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 191: {
                    try {
                        param3[var13] = param0.substring(var7, param0.length());
                        var13++;
                        statePc = 192;
                        continue stateLoop;
                    } catch (Throwable stateCaught_191) {
                        caughtException = stateCaught_191;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 192: {
                    try {
                        stackOut_192_0 = var13;
                        stackIn_193_0 = stackOut_192_0;
                        statePc = 193;
                        continue stateLoop;
                    } catch (Throwable stateCaught_192) {
                        caughtException = stateCaught_192;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 193: {
                    return stackIn_193_0;
                }
                case 194: {
                    var6 = (RuntimeException) (Object) caughtException;
                    statePc = 195;
                    continue stateLoop;
                }
                case 195: {
                    try {
                        stackOut_195_0 = (RuntimeException) var6;
                        stackOut_195_1 = new StringBuilder().append("sw.D(");
                        stackIn_198_0 = stackOut_195_0;
                        stackIn_198_1 = stackOut_195_1;
                        stackIn_196_0 = stackOut_195_0;
                        stackIn_196_1 = stackOut_195_1;
                        if (param0 == null) {
                            statePc = 198;
                        } else {
                            statePc = 196;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_195) {
                        caughtException = stateCaught_195;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 196: {
                    try {
                        stackOut_196_0 = (RuntimeException) (Object) stackIn_196_0;
                        stackOut_196_1 = (StringBuilder) (Object) stackIn_196_1;
                        stackOut_196_2 = "{...}";
                        stackIn_199_0 = stackOut_196_0;
                        stackIn_199_1 = stackOut_196_1;
                        stackIn_199_2 = stackOut_196_2;
                        statePc = 199;
                        continue stateLoop;
                    } catch (Throwable stateCaught_196) {
                        caughtException = stateCaught_196;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 197: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 198: {
                    stackOut_198_0 = (RuntimeException) (Object) stackIn_198_0;
                    stackOut_198_1 = (StringBuilder) (Object) stackIn_198_1;
                    stackOut_198_2 = "null";
                    stackIn_199_0 = stackOut_198_0;
                    stackIn_199_1 = stackOut_198_1;
                    stackIn_199_2 = stackOut_198_2;
                    statePc = 199;
                    continue stateLoop;
                }
                case 199: {
                    try {
                        stackOut_199_0 = (RuntimeException) (Object) stackIn_199_0;
                        stackOut_199_1 = ((StringBuilder) (Object) stackIn_199_1).append(stackIn_199_2).append(44);
                        stackIn_202_0 = stackOut_199_0;
                        stackIn_202_1 = stackOut_199_1;
                        stackIn_200_0 = stackOut_199_0;
                        stackIn_200_1 = stackOut_199_1;
                        if (param1 == null) {
                            statePc = 202;
                        } else {
                            statePc = 200;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_199) {
                        caughtException = stateCaught_199;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 200: {
                    try {
                        stackOut_200_0 = (RuntimeException) (Object) stackIn_200_0;
                        stackOut_200_1 = (StringBuilder) (Object) stackIn_200_1;
                        stackOut_200_2 = "{...}";
                        stackIn_203_0 = stackOut_200_0;
                        stackIn_203_1 = stackOut_200_1;
                        stackIn_203_2 = stackOut_200_2;
                        statePc = 203;
                        continue stateLoop;
                    } catch (Throwable stateCaught_200) {
                        caughtException = stateCaught_200;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 201: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 202: {
                    stackOut_202_0 = (RuntimeException) (Object) stackIn_202_0;
                    stackOut_202_1 = (StringBuilder) (Object) stackIn_202_1;
                    stackOut_202_2 = "null";
                    stackIn_203_0 = stackOut_202_0;
                    stackIn_203_1 = stackOut_202_1;
                    stackIn_203_2 = stackOut_202_2;
                    statePc = 203;
                    continue stateLoop;
                }
                case 203: {
                    try {
                        stackOut_203_0 = (RuntimeException) (Object) stackIn_203_0;
                        stackOut_203_1 = ((StringBuilder) (Object) stackIn_203_1).append(stackIn_203_2).append(44);
                        stackIn_206_0 = stackOut_203_0;
                        stackIn_206_1 = stackOut_203_1;
                        stackIn_204_0 = stackOut_203_0;
                        stackIn_204_1 = stackOut_203_1;
                        if (param2 == null) {
                            statePc = 206;
                        } else {
                            statePc = 204;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_203) {
                        caughtException = stateCaught_203;
                        statePc = 205;
                        continue stateLoop;
                    }
                }
                case 204: {
                    try {
                        stackOut_204_0 = (RuntimeException) (Object) stackIn_204_0;
                        stackOut_204_1 = (StringBuilder) (Object) stackIn_204_1;
                        stackOut_204_2 = "{...}";
                        stackIn_207_0 = stackOut_204_0;
                        stackIn_207_1 = stackOut_204_1;
                        stackIn_207_2 = stackOut_204_2;
                        statePc = 207;
                        continue stateLoop;
                    } catch (Throwable stateCaught_204) {
                        caughtException = stateCaught_204;
                        statePc = 205;
                        continue stateLoop;
                    }
                }
                case 205: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 206: {
                    stackOut_206_0 = (RuntimeException) (Object) stackIn_206_0;
                    stackOut_206_1 = (StringBuilder) (Object) stackIn_206_1;
                    stackOut_206_2 = "null";
                    stackIn_207_0 = stackOut_206_0;
                    stackIn_207_1 = stackOut_206_1;
                    stackIn_207_2 = stackOut_206_2;
                    statePc = 207;
                    continue stateLoop;
                }
                case 207: {
                    try {
                        stackOut_207_0 = (RuntimeException) (Object) stackIn_207_0;
                        stackOut_207_1 = ((StringBuilder) (Object) stackIn_207_1).append(stackIn_207_2).append(44);
                        stackIn_210_0 = stackOut_207_0;
                        stackIn_210_1 = stackOut_207_1;
                        stackIn_208_0 = stackOut_207_0;
                        stackIn_208_1 = stackOut_207_1;
                        if (param3 == null) {
                            statePc = 210;
                        } else {
                            statePc = 208;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_207) {
                        caughtException = stateCaught_207;
                        statePc = 209;
                        continue stateLoop;
                    }
                }
                case 208: {
                    try {
                        stackOut_208_0 = (RuntimeException) (Object) stackIn_208_0;
                        stackOut_208_1 = (StringBuilder) (Object) stackIn_208_1;
                        stackOut_208_2 = "{...}";
                        stackIn_211_0 = stackOut_208_0;
                        stackIn_211_1 = stackOut_208_1;
                        stackIn_211_2 = stackOut_208_2;
                        statePc = 211;
                        continue stateLoop;
                    } catch (Throwable stateCaught_208) {
                        caughtException = stateCaught_208;
                        statePc = 209;
                        continue stateLoop;
                    }
                }
                case 209: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 210: {
                    stackOut_210_0 = (RuntimeException) (Object) stackIn_210_0;
                    stackOut_210_1 = (StringBuilder) (Object) stackIn_210_1;
                    stackOut_210_2 = "null";
                    stackIn_211_0 = stackOut_210_0;
                    stackIn_211_1 = stackOut_210_1;
                    stackIn_211_2 = stackOut_210_2;
                    statePc = 211;
                    continue stateLoop;
                }
                case 211: {
                    throw rta.a((Throwable) (Object) stackIn_211_0, stackIn_211_2 + 44 + param4 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final String a(String param0, int param1, int param2, aja[] param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        String var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        String var13_ref = null;
        Exception var14 = null;
        int var14_int = 0;
        int var15 = 0;
        String stackIn_5_0 = null;
        String stackIn_9_0 = null;
        int stackIn_16_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_40_0 = 0;
        aja[] stackIn_54_0 = null;
        String stackIn_65_0 = null;
        String stackIn_90_0 = null;
        String stackIn_94_0 = null;
        RuntimeException stackIn_97_0 = null;
        StringBuilder stackIn_97_1 = null;
        RuntimeException stackIn_99_0 = null;
        StringBuilder stackIn_99_1 = null;
        RuntimeException stackIn_100_0 = null;
        StringBuilder stackIn_100_1 = null;
        String stackIn_100_2 = null;
        RuntimeException stackIn_101_0 = null;
        StringBuilder stackIn_101_1 = null;
        RuntimeException stackIn_103_0 = null;
        StringBuilder stackIn_103_1 = null;
        RuntimeException stackIn_104_0 = null;
        StringBuilder stackIn_104_1 = null;
        String stackIn_104_2 = null;
        String stackOut_4_0 = null;
        String stackOut_8_0 = null;
        int stackOut_15_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_39_0 = 0;
        aja[] stackOut_53_0 = null;
        String stackOut_64_0 = null;
        String stackOut_89_0 = null;
        String stackOut_93_0 = null;
        RuntimeException stackOut_96_0 = null;
        StringBuilder stackOut_96_1 = null;
        RuntimeException stackOut_97_0 = null;
        StringBuilder stackOut_97_1 = null;
        String stackOut_97_2 = null;
        RuntimeException stackOut_99_0 = null;
        StringBuilder stackOut_99_1 = null;
        String stackOut_99_2 = null;
        RuntimeException stackOut_100_0 = null;
        StringBuilder stackOut_100_1 = null;
        RuntimeException stackOut_101_0 = null;
        StringBuilder stackOut_101_1 = null;
        String stackOut_101_2 = null;
        RuntimeException stackOut_103_0 = null;
        StringBuilder stackOut_103_1 = null;
        String stackOut_103_2 = null;
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
                        if ((param1 ^ -1) <= (this.a(62, param0, param3) ^ -1)) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = (stateCaught_1 instanceof RuntimeException ? 95 : 3);
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = (stateCaught_2 instanceof RuntimeException ? 95 : 3);
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        stackOut_4_0 = (String) param0;
                        stackIn_5_0 = stackOut_4_0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 5: {
                    return stackIn_5_0;
                }
                case 6: {
                    try {
                        var5_int = -22 % ((36 - param2) / 44);
                        param1 = param1 - this.a(62, "...", (aja[]) null);
                        var6 = -1;
                        var7 = -1;
                        var8 = 0;
                        var9 = param0.length();
                        var10 = "";
                        var11 = 0;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (var9 <= var11) {
                            statePc = 93;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        stackOut_8_0 = (String) param0;
                        stackIn_94_0 = stackOut_8_0;
                        stackIn_9_0 = stackOut_8_0;
                        if (var15 != 0) {
                            statePc = 94;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var12 = ((String) (Object) stackIn_9_0).charAt(var11);
                        if ((var12 ^ -1) != -61) {
                            statePc = 12;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var6 = var11;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (var15 == 0) {
                            statePc = 92;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = (stateCaught_11 instanceof Exception ? 14 : 95);
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (62 != var12) {
                            statePc = 74;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = (stateCaught_12 instanceof Exception ? 18 : 95);
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = (stateCaught_13 instanceof Exception ? 18 : 95);
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = (stateCaught_14 instanceof Exception ? 18 : 95);
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        stackOut_15_0 = 0;
                        stackIn_16_0 = stackOut_15_0;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = (stateCaught_15 instanceof Exception ? 18 : 95);
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (stackIn_16_0 != (var6 ^ -1)) {
                            statePc = 21;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = (stateCaught_16 instanceof Exception ? 20 : 95);
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = (stateCaught_17 instanceof Exception ? 20 : 95);
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = (stateCaught_18 instanceof Exception ? 20 : 95);
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 74;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = (stateCaught_19 instanceof Exception ? 20 : 95);
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var13_ref = param0.substring(var6 + 1, var11);
                        var6 = -1;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (var13_ref.equals((Object) (Object) "lt")) {
                            statePc = 73;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = (stateCaught_22 instanceof Exception ? 25 : 95);
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (!var13_ref.equals((Object) (Object) "gt")) {
                            statePc = 28;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = (stateCaught_23 instanceof Exception ? 25 : 95);
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var12 = 62;
                        stackOut_26_0 = var15;
                        stackIn_27_0 = stackOut_26_0;
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (stackIn_27_0 == 0) {
                            statePc = 74;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = (stateCaught_27 instanceof Exception ? 30 : 95);
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (var13_ref.equals((Object) (Object) "nbsp")) {
                            statePc = 72;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = (stateCaught_28 instanceof Exception ? 33 : 95);
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = (stateCaught_29 instanceof Exception ? 33 : 95);
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = (stateCaught_30 instanceof Exception ? 33 : 95);
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (!var13_ref.equals((Object) (Object) "shy")) {
                            statePc = 36;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = (stateCaught_31 instanceof Exception ? 33 : 95);
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        var12 = 173;
                        stackOut_34_0 = var15;
                        stackIn_35_0 = stackOut_34_0;
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (stackIn_35_0 == 0) {
                            statePc = 74;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = (stateCaught_35 instanceof Exception ? 38 : 95);
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if (!var13_ref.equals((Object) (Object) "times")) {
                            statePc = 41;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = (stateCaught_36 instanceof Exception ? 38 : 95);
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        var12 = 215;
                        stackOut_39_0 = var15;
                        stackIn_40_0 = stackOut_39_0;
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if (stackIn_40_0 == 0) {
                            statePc = 74;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = (stateCaught_40 instanceof Exception ? 43 : 95);
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if (var13_ref.equals((Object) (Object) "euro")) {
                            statePc = 71;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = (stateCaught_41 instanceof Exception ? 46 : 95);
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = (stateCaught_42 instanceof Exception ? 46 : 95);
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = (stateCaught_43 instanceof Exception ? 46 : 95);
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        if (var13_ref.equals((Object) (Object) "copy")) {
                            statePc = 70;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = (stateCaught_44 instanceof Exception ? 49 : 95);
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = (stateCaught_45 instanceof Exception ? 49 : 95);
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = (stateCaught_46 instanceof Exception ? 49 : 95);
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        if (var13_ref.equals((Object) (Object) "reg")) {
                            statePc = 69;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = (stateCaught_47 instanceof Exception ? 52 : 95);
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = (stateCaught_48 instanceof Exception ? 52 : 95);
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = (stateCaught_49 instanceof Exception ? 52 : 95);
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        if (!var13_ref.startsWith("img=")) {
                            statePc = 92;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = (stateCaught_50 instanceof Exception ? 56 : 95);
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = (stateCaught_51 instanceof Exception ? 56 : 95);
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = (stateCaught_52 instanceof Exception ? 56 : 95);
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        stackOut_53_0 = (aja[]) param3;
                        stackIn_54_0 = stackOut_53_0;
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = (stateCaught_53 instanceof Exception ? 56 : 95);
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        if (stackIn_54_0 != null) {
                            statePc = 60;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = (stateCaught_54 instanceof Exception ? 59 : 95);
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = (stateCaught_55 instanceof Exception ? 59 : 95);
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = (stateCaught_56 instanceof Exception ? 59 : 95);
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        if (var15 == 0) {
                            statePc = 92;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = (stateCaught_57 instanceof Exception ? 59 : 95);
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        var14_int = lob.a(78, (CharSequence) (Object) var13_ref.substring(4));
                        var8 = var8 + param3[var14_int].c();
                        var7 = -1;
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = (stateCaught_60 instanceof Exception ? 68 : 95);
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        if ((var8 ^ -1) < (param1 ^ -1)) {
                            statePc = 64;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = (stateCaught_61 instanceof Exception ? 68 : 95);
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = (stateCaught_62 instanceof Exception ? 68 : 95);
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        stackOut_64_0 = var10 + "...";
                        stackIn_65_0 = stackOut_64_0;
                        statePc = 65;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = (stateCaught_64 instanceof Exception ? 68 : 95);
                        continue stateLoop;
                    }
                }
                case 65: {
                    return stackIn_65_0;
                }
                case 66: {
                    try {
                        var10 = param0.substring(0, var11 - -1);
                        statePc = 67;
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = (stateCaught_66 instanceof Exception ? 68 : 95);
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        statePc = 92;
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        var14 = (Exception) (Object) caughtException;
                        if (var15 == 0) {
                            statePc = 92;
                        } else {
                            statePc = 69;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        var12 = 174;
                        if (var15 == 0) {
                            statePc = 74;
                        } else {
                            statePc = 70;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        var12 = 169;
                        if (var15 == 0) {
                            statePc = 74;
                        } else {
                            statePc = 71;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        var12 = 8364;
                        if (var15 == 0) {
                            statePc = 74;
                        } else {
                            statePc = 72;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        var12 = 160;
                        if (var15 == 0) {
                            statePc = 74;
                        } else {
                            statePc = 73;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        var12 = 60;
                        statePc = 74;
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        if ((var6 ^ -1) != 0) {
                            statePc = 92;
                        } else {
                            statePc = 75;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        var8 = var8 + (255 & ((sw) this).field_b[255 & aea.a(-122, (char) var12)]);
                        statePc = 76;
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        if (((sw) this).field_g == null) {
                            statePc = 81;
                        } else {
                            statePc = 77;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = (stateCaught_76 instanceof Exception ? 79 : 95);
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        if (var7 == -1) {
                            statePc = 81;
                        } else {
                            statePc = 78;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = (stateCaught_77 instanceof Exception ? 79 : 95);
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        statePc = 80;
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        var8 = var8 + ((sw) this).field_g[var7][var12];
                        statePc = 81;
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        var7 = var12;
                        var13 = var8;
                        statePc = 82;
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        if (null != ((sw) this).field_g) {
                            statePc = 85;
                        } else {
                            statePc = 83;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = (stateCaught_82 instanceof Exception ? 84 : 95);
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        statePc = 86;
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = (stateCaught_83 instanceof Exception ? 84 : 95);
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        var13 = var13 + ((sw) this).field_g[var12][46];
                        statePc = 86;
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        if ((var13 ^ -1) < (param1 ^ -1)) {
                            statePc = 89;
                        } else {
                            statePc = 87;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = (stateCaught_86 instanceof Exception ? 88 : 95);
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        statePc = 91;
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = (stateCaught_87 instanceof Exception ? 88 : 95);
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        stackOut_89_0 = var10 + "...";
                        stackIn_90_0 = stackOut_89_0;
                        statePc = 90;
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 90: {
                    return stackIn_90_0;
                }
                case 91: {
                    try {
                        var10 = param0.substring(0, var11 + 1);
                        statePc = 92;
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        var11++;
                        if (var15 == 0) {
                            statePc = 7;
                        } else {
                            statePc = 93;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        stackOut_93_0 = (String) param0;
                        stackIn_94_0 = stackOut_93_0;
                        statePc = 94;
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 94: {
                    return stackIn_94_0;
                }
                case 95: {
                    var5 = (RuntimeException) (Object) caughtException;
                    statePc = 96;
                    continue stateLoop;
                }
                case 96: {
                    try {
                        stackOut_96_0 = (RuntimeException) var5;
                        stackOut_96_1 = new StringBuilder().append("sw.G(");
                        stackIn_99_0 = stackOut_96_0;
                        stackIn_99_1 = stackOut_96_1;
                        stackIn_97_0 = stackOut_96_0;
                        stackIn_97_1 = stackOut_96_1;
                        if (param0 == null) {
                            statePc = 99;
                        } else {
                            statePc = 97;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        stackOut_97_0 = (RuntimeException) (Object) stackIn_97_0;
                        stackOut_97_1 = (StringBuilder) (Object) stackIn_97_1;
                        stackOut_97_2 = "{...}";
                        stackIn_100_0 = stackOut_97_0;
                        stackIn_100_1 = stackOut_97_1;
                        stackIn_100_2 = stackOut_97_2;
                        statePc = 100;
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 98: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 99: {
                    stackOut_99_0 = (RuntimeException) (Object) stackIn_99_0;
                    stackOut_99_1 = (StringBuilder) (Object) stackIn_99_1;
                    stackOut_99_2 = "null";
                    stackIn_100_0 = stackOut_99_0;
                    stackIn_100_1 = stackOut_99_1;
                    stackIn_100_2 = stackOut_99_2;
                    statePc = 100;
                    continue stateLoop;
                }
                case 100: {
                    try {
                        stackOut_100_0 = (RuntimeException) (Object) stackIn_100_0;
                        stackOut_100_1 = ((StringBuilder) (Object) stackIn_100_1).append(stackIn_100_2).append(44).append(param1).append(44).append(param2).append(44);
                        stackIn_103_0 = stackOut_100_0;
                        stackIn_103_1 = stackOut_100_1;
                        stackIn_101_0 = stackOut_100_0;
                        stackIn_101_1 = stackOut_100_1;
                        if (param3 == null) {
                            statePc = 103;
                        } else {
                            statePc = 101;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 101: {
                    try {
                        stackOut_101_0 = (RuntimeException) (Object) stackIn_101_0;
                        stackOut_101_1 = (StringBuilder) (Object) stackIn_101_1;
                        stackOut_101_2 = "{...}";
                        stackIn_104_0 = stackOut_101_0;
                        stackIn_104_1 = stackOut_101_1;
                        stackIn_104_2 = stackOut_101_2;
                        statePc = 104;
                        continue stateLoop;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 102: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 103: {
                    stackOut_103_0 = (RuntimeException) (Object) stackIn_103_0;
                    stackOut_103_1 = (StringBuilder) (Object) stackIn_103_1;
                    stackOut_103_2 = "null";
                    stackIn_104_0 = stackOut_103_0;
                    stackIn_104_1 = stackOut_103_1;
                    stackIn_104_2 = stackOut_103_2;
                    statePc = 104;
                    continue stateLoop;
                }
                case 104: {
                    throw rta.a((Throwable) (Object) stackIn_104_0, stackIn_104_2 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final int a(String param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (param1 == 1) {
                            statePc = 4;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        field_f = true;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        stackOut_4_0 = this.a(62, param0, (aja[]) null);
                        stackIn_5_0 = stackOut_4_0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 5: {
                    return stackIn_5_0;
                }
                case 6: {
                    var3 = (RuntimeException) (Object) caughtException;
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    try {
                        stackOut_7_0 = (RuntimeException) var3;
                        stackOut_7_1 = new StringBuilder().append("sw.B(");
                        stackIn_10_0 = stackOut_7_0;
                        stackIn_10_1 = stackOut_7_1;
                        stackIn_8_0 = stackOut_7_0;
                        stackIn_8_1 = stackOut_7_1;
                        if (param0 == null) {
                            statePc = 10;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
                        stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
                        stackOut_8_2 = "{...}";
                        stackIn_11_0 = stackOut_8_0;
                        stackIn_11_1 = stackOut_8_1;
                        stackIn_11_2 = stackOut_8_2;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 9: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 10: {
                    stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
                    stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
                    stackOut_10_2 = "null";
                    stackIn_11_0 = stackOut_10_0;
                    stackIn_11_1 = stackOut_10_1;
                    stackIn_11_2 = stackOut_10_2;
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    throw rta.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param1 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(byte param0, int param1, int param2, int param3, int param4, int param5) {
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
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int stackIn_7_0 = 0;
        int stackIn_14_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_13_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var25 = VoidHunters.field_G;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var6_int = 0;
                        var7 = param2;
                        var8 = param5 * param5;
                        var9 = param2 * param2;
                        var10 = var9 << -1563148991;
                        if (param0 < -112) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return;
                }
                case 3: {
                    try {
                        var11 = var8 << -397110079;
                        var12 = param2 << -1541239263;
                        var13 = (-var12 + 1) * var8 - -var10;
                        var14 = -((var12 + -1) * var11) + var9;
                        var15 = var8 << -1098654846;
                        var16 = var9 << -1977010366;
                        var17 = (3 + (var6_int << 1041136353)) * var10;
                        var18 = var11 * (-3 + (var7 << 143267777));
                        var19 = (1 + var6_int) * var16;
                        var20 = var15 * (-1 + var7);
                        ww.a(param4, param3 + param5, rba.field_b[param1], (byte) 75, -param5 + param3);
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (-1 <= (var7 ^ -1)) {
                            statePc = 24;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (var25 != 0) {
                            statePc = 24;
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
                        stackOut_6_0 = var13;
                        stackIn_7_0 = stackOut_6_0;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if ((stackIn_7_0 ^ -1) > -1) {
                            statePc = 12;
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
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (-1 >= (var13 ^ -1)) {
                            statePc = 18;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var14 = var14 + var19;
                        var13 = var13 + var17;
                        var6_int++;
                        var19 = var19 + var16;
                        var17 = var17 + var16;
                        stackOut_13_0 = var25;
                        stackIn_14_0 = stackOut_13_0;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (stackIn_14_0 != 0) {
                            statePc = 21;
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
                        if (var25 == 0) {
                            statePc = 12;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (-1 >= (var14 ^ -1)) {
                            statePc = 20;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var14 = var14 + var19;
                        var13 = var13 + var17;
                        var19 = var19 + var16;
                        var17 = var17 + var16;
                        var6_int++;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var13 = var13 + -var20;
                        var14 = var14 + -var18;
                        var20 = var20 - var15;
                        var18 = var18 - var15;
                        var7--;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var21 = -var7 + param1;
                        var22 = param1 - -var7;
                        var23 = var6_int + param3;
                        var24 = param3 - var6_int;
                        ww.a(param4, var23, rba.field_b[var21], (byte) 75, var24);
                        ww.a(param4, var23, rba.field_b[var22], (byte) 75, var24);
                        if (var25 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 23: {
                    var6 = (RuntimeException) (Object) caughtException;
                    throw rta.a((Throwable) (Object) var6, "sw.H(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
                }
                case 24: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final int a(int param0, String param1, boolean param2, aja[] param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        boolean stackOut_10_0 = false;
        int stackOut_10_1 = 0;
        int stackOut_15_0 = 0;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var9 = VoidHunters.field_G;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var5_int = ((sw) this).a(param1, param3, new int[1], to.field_p, 4);
                        var6 = 0;
                        var7 = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if ((var7 ^ -1) <= (var5_int ^ -1)) {
                            statePc = 10;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var8 = this.a(62, to.field_p[var7], param3);
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        stackOut_4_0 = var8 ^ -1;
                        stackOut_4_1 = var6 ^ -1;
                        stackIn_11_0 = stackOut_4_0;
                        stackIn_11_1 = stackOut_4_1;
                        stackIn_5_0 = stackOut_4_0;
                        stackIn_5_1 = stackOut_4_1;
                        if (var9 != 0) {
                            statePc = 11;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (stackIn_5_0 >= stackIn_5_1) {
                            statePc = 9;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var6 = var8;
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
                        var7++;
                        if (var9 == 0) {
                            statePc = 2;
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
                        stackOut_10_0 = param2;
                        stackOut_10_1 = 1;
                        stackIn_11_0 = stackOut_10_0 ? 1 : 0;
                        stackIn_11_1 = stackOut_10_1;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (stackIn_11_0 == stackIn_11_1) {
                            statePc = 15;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        int discarded$2 = ((sw) this).a(-9, (byte) -117);
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        stackOut_15_0 = var6;
                        stackIn_16_0 = stackOut_15_0;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 16: {
                    return stackIn_16_0;
                }
                case 17: {
                    var5 = (RuntimeException) (Object) caughtException;
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    try {
                        stackOut_18_0 = (RuntimeException) var5;
                        stackOut_18_1 = new StringBuilder().append("sw.A(").append(param0).append(44);
                        stackIn_21_0 = stackOut_18_0;
                        stackIn_21_1 = stackOut_18_1;
                        stackIn_19_0 = stackOut_18_0;
                        stackIn_19_1 = stackOut_18_1;
                        if (param1 == null) {
                            statePc = 21;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
                        stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
                        stackOut_19_2 = "{...}";
                        stackIn_22_0 = stackOut_19_0;
                        stackIn_22_1 = stackOut_19_1;
                        stackIn_22_2 = stackOut_19_2;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 20: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 21: {
                    stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
                    stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
                    stackOut_21_2 = "null";
                    stackIn_22_0 = stackOut_21_0;
                    stackIn_22_1 = stackOut_21_1;
                    stackIn_22_2 = stackOut_21_2;
                    statePc = 22;
                    continue stateLoop;
                }
                case 22: {
                    try {
                        stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
                        stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(44).append(param2).append(44);
                        stackIn_25_0 = stackOut_22_0;
                        stackIn_25_1 = stackOut_22_1;
                        stackIn_23_0 = stackOut_22_0;
                        stackIn_23_1 = stackOut_22_1;
                        if (param3 == null) {
                            statePc = 25;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
                        stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
                        stackOut_23_2 = "{...}";
                        stackIn_26_0 = stackOut_23_0;
                        stackIn_26_1 = stackOut_23_1;
                        stackIn_26_2 = stackOut_23_2;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 24: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 25: {
                    stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
                    stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
                    stackOut_25_2 = "null";
                    stackIn_26_0 = stackOut_25_0;
                    stackIn_26_1 = stackOut_25_1;
                    stackIn_26_2 = stackOut_25_2;
                    statePc = 26;
                    continue stateLoop;
                }
                case 26: {
                    throw rta.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final int a(String param0, int param1, int param2, byte param3, aja[] param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int stackOut_7_0 = 0;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if ((param1 ^ -1) != -1) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        param1 = ((sw) this).field_a;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        var6_int = ((sw) this).a(param0, param4, new int[1], to.field_p, 4);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (param3 > 83) {
                            statePc = 7;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        int discarded$2 = ((sw) this).a((String) null, 127, 112, (byte) -23, (aja[]) null);
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var7 = (var6_int - 1) * param1;
                        stackOut_7_0 = ((sw) this).field_e + (((sw) this).field_c - -var7);
                        stackIn_8_0 = stackOut_7_0;
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
                    var6 = (RuntimeException) (Object) caughtException;
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    try {
                        stackOut_10_0 = (RuntimeException) var6;
                        stackOut_10_1 = new StringBuilder().append("sw.C(");
                        stackIn_13_0 = stackOut_10_0;
                        stackIn_13_1 = stackOut_10_1;
                        stackIn_11_0 = stackOut_10_0;
                        stackIn_11_1 = stackOut_10_1;
                        if (param0 == null) {
                            statePc = 13;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
                        stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
                        stackOut_11_2 = "{...}";
                        stackIn_14_0 = stackOut_11_0;
                        stackIn_14_1 = stackOut_11_1;
                        stackIn_14_2 = stackOut_11_2;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 12: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 13: {
                    stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
                    stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
                    stackOut_13_2 = "null";
                    stackIn_14_0 = stackOut_13_0;
                    stackIn_14_1 = stackOut_13_1;
                    stackIn_14_2 = stackOut_13_2;
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    try {
                        stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
                        stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
                        stackIn_17_0 = stackOut_14_0;
                        stackIn_17_1 = stackOut_14_1;
                        stackIn_15_0 = stackOut_14_0;
                        stackIn_15_1 = stackOut_14_1;
                        if (param4 == null) {
                            statePc = 17;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
                        stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
                        stackOut_15_2 = "{...}";
                        stackIn_18_0 = stackOut_15_0;
                        stackIn_18_1 = stackOut_15_1;
                        stackIn_18_2 = stackOut_15_2;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 16: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 17: {
                    stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
                    stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
                    stackOut_17_2 = "null";
                    stackIn_18_0 = stackOut_17_0;
                    stackIn_18_1 = stackOut_17_1;
                    stackIn_18_2 = stackOut_17_2;
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    throw rta.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final int a(int param0, byte param1) {
        RuntimeException var3 = null;
        int stackIn_5_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        try {
          try {
            L0: {
              if (param1 >= 21) {
                break L0;
              } else {
                int discarded$2 = ((sw) this).a(-79, 'ﾁ', 63);
                break L0;
              }
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter) {
            decompiledCaughtException = decompiledCaughtParameter;
          }
          throw decompiledCaughtException;
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          stackOut_4_0 = ((sw) this).field_b[param0] & 255;
          stackIn_5_0 = stackOut_4_0;
        }
        return 0;
    }

    sw(byte[] param0) {
        RuntimeException var2 = null;
        ds var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        int[] var6 = null;
        int var7_int = 0;
        byte[][] var7 = null;
        int var8_int = 0;
        byte[][] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int stackIn_9_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_52_0 = 0;
        int stackIn_52_1 = 0;
        int stackIn_54_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_55_1 = 0;
        int stackIn_64_0 = 0;
        int stackIn_64_1 = 0;
        int stackIn_66_0 = 0;
        int stackIn_82_0 = 0;
        RuntimeException stackIn_86_0 = null;
        StringBuilder stackIn_86_1 = null;
        RuntimeException stackIn_88_0 = null;
        StringBuilder stackIn_88_1 = null;
        RuntimeException stackIn_89_0 = null;
        StringBuilder stackIn_89_1 = null;
        String stackIn_89_2 = null;
        int stackOut_6_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_51_1 = 0;
        int stackOut_53_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_54_1 = 0;
        int stackOut_63_0 = 0;
        int stackOut_63_1 = 0;
        int stackOut_65_0 = 0;
        int stackOut_81_0 = 0;
        RuntimeException stackOut_85_0 = null;
        StringBuilder stackOut_85_1 = null;
        RuntimeException stackOut_86_0 = null;
        StringBuilder stackOut_86_1 = null;
        String stackOut_86_2 = null;
        RuntimeException stackOut_88_0 = null;
        StringBuilder stackOut_88_1 = null;
        String stackOut_88_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var12 = VoidHunters.field_G;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2_ref = new ds(param0);
                        var3 = var2_ref.e((byte) -102);
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (0 == var3) {
                            statePc = 5;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 4;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        throw new RuntimeException("");
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 4;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if ((var2_ref.e((byte) -89) ^ -1) != -2) {
                            statePc = 8;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        stackOut_6_0 = 1;
                        stackIn_9_0 = stackOut_6_0;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        stackOut_8_0 = 0;
                        stackIn_9_0 = stackOut_8_0;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var4 = stackIn_9_0;
                        ((sw) this).field_b = new byte[256];
                        var2_ref.a(0, ((sw) this).field_b, (byte) -59, 256);
                        if (var4 == 0) {
                            statePc = 78;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var5 = new int[256];
                        var6 = new int[256];
                        var7_int = 0;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (-257 >= (var7_int ^ -1)) {
                            statePc = 16;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var5[var7_int] = var2_ref.e((byte) -124);
                        var7_int++;
                        if (var12 != 0) {
                            statePc = 17;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (var12 == 0) {
                            statePc = 11;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var7_int = 0;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (var7_int >= 256) {
                            statePc = 24;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var6[var7_int] = var2_ref.e((byte) -92);
                        var7_int++;
                        if (var12 != 0) {
                            statePc = 90;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (var12 == 0) {
                            statePc = 17;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var7 = new byte[256][];
                        var8_int = 0;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (256 <= var8_int) {
                            statePc = 36;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var7[var8_int] = new byte[var5[var8_int]];
                        var9 = 0;
                        stackOut_26_0 = 0;
                        stackIn_37_0 = stackOut_26_0;
                        stackIn_27_0 = stackOut_26_0;
                        if (var12 != 0) {
                            statePc = 37;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        var10 = stackIn_27_0;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (var7[var8_int].length <= var10) {
                            statePc = 34;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var9 = (byte)(var9 + var2_ref.d((byte) -114));
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var7[var8_int][var10] = (byte) var9;
                        var10++;
                        if (var12 != 0) {
                            statePc = 35;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (var12 == 0) {
                            statePc = 28;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        var8_int++;
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (var12 == 0) {
                            statePc = 25;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        stackOut_36_0 = 256;
                        stackIn_37_0 = stackOut_36_0;
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        var8 = new byte[stackIn_37_0][];
                        var9 = 0;
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if (-257 >= (var9 ^ -1)) {
                            statePc = 49;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        var8[var9] = new byte[var5[var9]];
                        var10 = 0;
                        stackOut_39_0 = 0;
                        stackIn_50_0 = stackOut_39_0;
                        stackIn_40_0 = stackOut_39_0;
                        if (var12 != 0) {
                            statePc = 50;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        var11 = stackIn_40_0;
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if (var8[var9].length <= var11) {
                            statePc = 47;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        var10 = (byte)(var10 + var2_ref.d((byte) -114));
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        var8[var9][var11] = (byte) var10;
                        var11++;
                        if (var12 != 0) {
                            statePc = 48;
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
                        if (var12 == 0) {
                            statePc = 41;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        var9++;
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        if (var12 == 0) {
                            statePc = 38;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        ((sw) this).field_g = new byte[256][256];
                        stackOut_49_0 = 0;
                        stackIn_50_0 = stackOut_49_0;
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        var9 = stackIn_50_0;
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        stackOut_51_0 = -257;
                        stackOut_51_1 = var9 ^ -1;
                        stackIn_52_0 = stackOut_51_0;
                        stackIn_52_1 = stackOut_51_1;
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        if (stackIn_52_0 >= stackIn_52_1) {
                            statePc = 77;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        stackOut_53_0 = var9;
                        stackIn_82_0 = stackOut_53_0;
                        stackIn_54_0 = stackOut_53_0;
                        if (var12 != 0) {
                            statePc = 82;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        stackOut_54_0 = stackIn_54_0;
                        stackOut_54_1 = 32;
                        stackIn_55_0 = stackOut_54_0;
                        stackIn_55_1 = stackOut_54_1;
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        if (stackIn_55_0 == stackIn_55_1) {
                            statePc = 76;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        if (-161 == (var9 ^ -1)) {
                            statePc = 76;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        var10 = 0;
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        if ((var10 ^ -1) <= -257) {
                            statePc = 76;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        stackOut_63_0 = 32;
                        stackOut_63_1 = var10;
                        stackIn_52_0 = stackOut_63_0;
                        stackIn_52_1 = stackOut_63_1;
                        stackIn_64_0 = stackOut_63_0;
                        stackIn_64_1 = stackOut_63_1;
                        if (var12 != 0) {
                            statePc = 52;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        if (stackIn_64_0 == stackIn_64_1) {
                            statePc = 75;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        stackOut_65_0 = -161;
                        stackIn_66_0 = stackOut_65_0;
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        if (stackIn_66_0 != (var10 ^ -1)) {
                            statePc = 72;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        statePc = 69;
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        if (var12 == 0) {
                            statePc = 75;
                        } else {
                            statePc = 70;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        statePc = 72;
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        ((sw) this).field_g[var9][var10] = (byte)om.a(((sw) this).field_b, var10, var9, var7, false, var8, var5, var6);
                        statePc = 73;
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        statePc = 75;
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        var10++;
                        if (var12 == 0) {
                            statePc = 62;
                        } else {
                            statePc = 76;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        var9++;
                        if (var12 == 0) {
                            statePc = 51;
                        } else {
                            statePc = 77;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        ((sw) this).field_a = var6[32] - -var5[32];
                        if (var12 == 0) {
                            statePc = 81;
                        } else {
                            statePc = 78;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        ((sw) this).field_a = var2_ref.e((byte) -104);
                        statePc = 79;
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        statePc = 81;
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        ((sw) this).field_d = var2_ref.e((byte) -91);
                        stackOut_81_0 = var2_ref.e((byte) -88);
                        stackIn_82_0 = stackOut_81_0;
                        statePc = 82;
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        ((sw) this).field_c = var2_ref.e((byte) -87);
                        ((sw) this).field_e = var2_ref.e((byte) -126);
                        statePc = 90;
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 84: {
                    var2 = (RuntimeException) (Object) caughtException;
                    statePc = 85;
                    continue stateLoop;
                }
                case 85: {
                    try {
                        stackOut_85_0 = (RuntimeException) var2;
                        stackOut_85_1 = new StringBuilder().append("sw.<init>(");
                        stackIn_88_0 = stackOut_85_0;
                        stackIn_88_1 = stackOut_85_1;
                        stackIn_86_0 = stackOut_85_0;
                        stackIn_86_1 = stackOut_85_1;
                        if (param0 == null) {
                            statePc = 88;
                        } else {
                            statePc = 86;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        stackOut_86_0 = (RuntimeException) (Object) stackIn_86_0;
                        stackOut_86_1 = (StringBuilder) (Object) stackIn_86_1;
                        stackOut_86_2 = "{...}";
                        stackIn_89_0 = stackOut_86_0;
                        stackIn_89_1 = stackOut_86_1;
                        stackIn_89_2 = stackOut_86_2;
                        statePc = 89;
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 87: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 88: {
                    stackOut_88_0 = (RuntimeException) (Object) stackIn_88_0;
                    stackOut_88_1 = (StringBuilder) (Object) stackIn_88_1;
                    stackOut_88_2 = "null";
                    stackIn_89_0 = stackOut_88_0;
                    stackIn_89_1 = stackOut_88_1;
                    stackIn_89_2 = stackOut_88_2;
                    statePc = 89;
                    continue stateLoop;
                }
                case 89: {
                    throw rta.a((Throwable) (Object) stackIn_89_0, stackIn_89_2 + 41);
                }
                case 90: {
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final int a(int param0, char param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        byte stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        byte stackOut_1_0 = 0;
        int stackOut_3_0 = 0;
        try {
          var4_int = -30 % ((41 - param2) / 57);
          if (((sw) this).field_g == null) {
            return stackIn_2_0;
          } else {
            stackOut_1_0 = ((sw) this).field_g[param0][param1];
            stackIn_2_0 = stackOut_1_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          stackOut_3_0 = 0;
          stackIn_4_0 = stackOut_3_0;
        }
        return 0;
    }

    private final int a(int param0, String param1, aja[] param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        String var10 = null;
        Exception var11 = null;
        int var11_int = 0;
        int var12 = 0;
        int stackIn_3_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_52_0 = 0;
        aja[] stackIn_63_0 = null;
        int stackIn_79_0 = 0;
        int stackIn_88_0 = 0;
        RuntimeException stackIn_91_0 = null;
        StringBuilder stackIn_91_1 = null;
        RuntimeException stackIn_93_0 = null;
        StringBuilder stackIn_93_1 = null;
        RuntimeException stackIn_94_0 = null;
        StringBuilder stackIn_94_1 = null;
        String stackIn_94_2 = null;
        RuntimeException stackIn_95_0 = null;
        StringBuilder stackIn_95_1 = null;
        RuntimeException stackIn_97_0 = null;
        StringBuilder stackIn_97_1 = null;
        RuntimeException stackIn_98_0 = null;
        StringBuilder stackIn_98_1 = null;
        String stackIn_98_2 = null;
        int stackOut_2_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_51_0 = 0;
        aja[] stackOut_62_0 = null;
        int stackOut_78_0 = 0;
        int stackOut_87_0 = 0;
        RuntimeException stackOut_90_0 = null;
        StringBuilder stackOut_90_1 = null;
        RuntimeException stackOut_91_0 = null;
        StringBuilder stackOut_91_1 = null;
        String stackOut_91_2 = null;
        RuntimeException stackOut_93_0 = null;
        StringBuilder stackOut_93_1 = null;
        String stackOut_93_2 = null;
        RuntimeException stackOut_94_0 = null;
        StringBuilder stackOut_94_1 = null;
        RuntimeException stackOut_95_0 = null;
        StringBuilder stackOut_95_1 = null;
        String stackOut_95_2 = null;
        RuntimeException stackOut_97_0 = null;
        StringBuilder stackOut_97_1 = null;
        String stackOut_97_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var12 = VoidHunters.field_G;
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
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackOut_2_0 = 0;
                        stackIn_3_0 = stackOut_2_0;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return stackIn_3_0;
                }
                case 4: {
                    try {
                        var4_int = -1;
                        var5 = -1;
                        var6 = 0;
                        var7 = param1.length();
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (param0 == 62) {
                            statePc = 9;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = (stateCaught_5 instanceof Exception ? 8 : 89);
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        sw.a((byte) -112, -45, -77, 71, 75, 122);
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = (stateCaught_6 instanceof Exception ? 8 : 89);
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var8 = 0;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if ((var8 ^ -1) <= (var7 ^ -1)) {
                            statePc = 87;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var9 = param1.charAt(var8);
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        stackOut_12_0 = var9;
                        stackIn_88_0 = stackOut_12_0;
                        stackIn_13_0 = stackOut_12_0;
                        if (var12 != 0) {
                            statePc = 88;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = (stateCaught_12 instanceof Exception ? 15 : 89);
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (stackIn_13_0 != 60) {
                            statePc = 18;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = (stateCaught_13 instanceof Exception ? 15 : 89);
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var4_int = var8;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (var12 == 0) {
                            statePc = 86;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = (stateCaught_17 instanceof Exception ? 20 : 89);
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (62 != var9) {
                            statePc = 75;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = (stateCaught_18 instanceof Exception ? 24 : 89);
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = (stateCaught_19 instanceof Exception ? 24 : 89);
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = (stateCaught_20 instanceof Exception ? 24 : 89);
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        stackOut_21_0 = var4_int;
                        stackIn_22_0 = stackOut_21_0;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = (stateCaught_21 instanceof Exception ? 24 : 89);
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (stackIn_22_0 != -1) {
                            statePc = 27;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = (stateCaught_22 instanceof Exception ? 26 : 89);
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = (stateCaught_23 instanceof Exception ? 26 : 89);
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = (stateCaught_24 instanceof Exception ? 26 : 89);
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        statePc = 75;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = (stateCaught_25 instanceof Exception ? 26 : 89);
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        var10 = param1.substring(1 + var4_int, var8);
                        var4_int = -1;
                        if (!var10.equals((Object) (Object) "lt")) {
                            statePc = 30;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        var9 = 60;
                        stackOut_28_0 = var12;
                        stackIn_29_0 = stackOut_28_0;
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (stackIn_29_0 == 0) {
                            statePc = 75;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = (stateCaught_29 instanceof Exception ? 32 : 89);
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if (!var10.equals((Object) (Object) "gt")) {
                            statePc = 35;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = (stateCaught_30 instanceof Exception ? 32 : 89);
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var9 = 62;
                        stackOut_33_0 = var12;
                        stackIn_34_0 = stackOut_33_0;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if (stackIn_34_0 == 0) {
                            statePc = 75;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = (stateCaught_34 instanceof Exception ? 37 : 89);
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (var10.equals((Object) (Object) "nbsp")) {
                            statePc = 74;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = (stateCaught_35 instanceof Exception ? 40 : 89);
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = (stateCaught_36 instanceof Exception ? 40 : 89);
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = (stateCaught_37 instanceof Exception ? 40 : 89);
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if (!var10.equals((Object) (Object) "shy")) {
                            statePc = 43;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = (stateCaught_38 instanceof Exception ? 40 : 89);
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        var9 = 173;
                        stackOut_41_0 = var12;
                        stackIn_42_0 = stackOut_41_0;
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if (stackIn_42_0 == 0) {
                            statePc = 75;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = (stateCaught_42 instanceof Exception ? 45 : 89);
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if (!var10.equals((Object) (Object) "times")) {
                            statePc = 48;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = (stateCaught_43 instanceof Exception ? 45 : 89);
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        var9 = 215;
                        stackOut_46_0 = var12;
                        stackIn_47_0 = stackOut_46_0;
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        if (stackIn_47_0 == 0) {
                            statePc = 75;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = (stateCaught_47 instanceof Exception ? 50 : 89);
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        if (!var10.equals((Object) (Object) "euro")) {
                            statePc = 53;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = (stateCaught_48 instanceof Exception ? 50 : 89);
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        var9 = 8364;
                        stackOut_51_0 = var12;
                        stackIn_52_0 = stackOut_51_0;
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        if (stackIn_52_0 == 0) {
                            statePc = 75;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = (stateCaught_52 instanceof Exception ? 55 : 89);
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        if (var10.equals((Object) (Object) "copy")) {
                            statePc = 73;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = (stateCaught_53 instanceof Exception ? 58 : 89);
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = (stateCaught_54 instanceof Exception ? 58 : 89);
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = (stateCaught_55 instanceof Exception ? 58 : 89);
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        if (var10.equals((Object) (Object) "reg")) {
                            statePc = 72;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = (stateCaught_56 instanceof Exception ? 61 : 89);
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = (stateCaught_57 instanceof Exception ? 61 : 89);
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = (stateCaught_58 instanceof Exception ? 61 : 89);
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        if (!var10.startsWith("img=")) {
                            statePc = 86;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = (stateCaught_59 instanceof Exception ? 65 : 89);
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = (stateCaught_60 instanceof Exception ? 65 : 89);
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = (stateCaught_61 instanceof Exception ? 65 : 89);
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        stackOut_62_0 = (aja[]) param2;
                        stackIn_63_0 = stackOut_62_0;
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = (stateCaught_62 instanceof Exception ? 65 : 89);
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        if (stackIn_63_0 != null) {
                            statePc = 69;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = (stateCaught_63 instanceof Exception ? 68 : 89);
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = (stateCaught_64 instanceof Exception ? 68 : 89);
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = (stateCaught_65 instanceof Exception ? 68 : 89);
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        if (var12 == 0) {
                            statePc = 86;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = (stateCaught_66 instanceof Exception ? 68 : 89);
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        statePc = 69;
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        var11_int = lob.a(10, (CharSequence) (Object) var10.substring(4));
                        var6 = var6 + param2[var11_int].c();
                        var5 = -1;
                        statePc = 70;
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = (stateCaught_69 instanceof Exception ? 71 : 89);
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        statePc = 86;
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        var11 = (Exception) (Object) caughtException;
                        if (var12 == 0) {
                            statePc = 86;
                        } else {
                            statePc = 72;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        var9 = 174;
                        if (var12 == 0) {
                            statePc = 75;
                        } else {
                            statePc = 73;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        var9 = 169;
                        if (var12 == 0) {
                            statePc = 75;
                        } else {
                            statePc = 74;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        var9 = 160;
                        statePc = 75;
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        if ((var4_int ^ -1) != 0) {
                            statePc = 86;
                        } else {
                            statePc = 76;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        var6 = var6 + (255 & ((sw) this).field_b[aea.a(-121, (char) var9) & 255]);
                        statePc = 77;
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        if (((sw) this).field_g == null) {
                            statePc = 85;
                        } else {
                            statePc = 78;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = (stateCaught_77 instanceof Exception ? 81 : 89);
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        stackOut_78_0 = -1;
                        stackIn_79_0 = stackOut_78_0;
                        statePc = 79;
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = (stateCaught_78 instanceof Exception ? 81 : 89);
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        if (stackIn_79_0 != var5) {
                            statePc = 84;
                        } else {
                            statePc = 80;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = (stateCaught_79 instanceof Exception ? 83 : 89);
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        statePc = 82;
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = (stateCaught_80 instanceof Exception ? 83 : 89);
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = (stateCaught_81 instanceof Exception ? 83 : 89);
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        statePc = 85;
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = (stateCaught_82 instanceof Exception ? 83 : 89);
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        var6 = var6 + ((sw) this).field_g[var5][var9];
                        statePc = 85;
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        var5 = var9;
                        statePc = 86;
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        var8++;
                        if (var12 == 0) {
                            statePc = 10;
                        } else {
                            statePc = 87;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        stackOut_87_0 = var6;
                        stackIn_88_0 = stackOut_87_0;
                        statePc = 88;
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 88: {
                    return stackIn_88_0;
                }
                case 89: {
                    var4 = (RuntimeException) (Object) caughtException;
                    statePc = 90;
                    continue stateLoop;
                }
                case 90: {
                    try {
                        stackOut_90_0 = (RuntimeException) var4;
                        stackOut_90_1 = new StringBuilder().append("sw.F(").append(param0).append(44);
                        stackIn_93_0 = stackOut_90_0;
                        stackIn_93_1 = stackOut_90_1;
                        stackIn_91_0 = stackOut_90_0;
                        stackIn_91_1 = stackOut_90_1;
                        if (param1 == null) {
                            statePc = 93;
                        } else {
                            statePc = 91;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        stackOut_91_0 = (RuntimeException) (Object) stackIn_91_0;
                        stackOut_91_1 = (StringBuilder) (Object) stackIn_91_1;
                        stackOut_91_2 = "{...}";
                        stackIn_94_0 = stackOut_91_0;
                        stackIn_94_1 = stackOut_91_1;
                        stackIn_94_2 = stackOut_91_2;
                        statePc = 94;
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 92: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 93: {
                    stackOut_93_0 = (RuntimeException) (Object) stackIn_93_0;
                    stackOut_93_1 = (StringBuilder) (Object) stackIn_93_1;
                    stackOut_93_2 = "null";
                    stackIn_94_0 = stackOut_93_0;
                    stackIn_94_1 = stackOut_93_1;
                    stackIn_94_2 = stackOut_93_2;
                    statePc = 94;
                    continue stateLoop;
                }
                case 94: {
                    try {
                        stackOut_94_0 = (RuntimeException) (Object) stackIn_94_0;
                        stackOut_94_1 = ((StringBuilder) (Object) stackIn_94_1).append(stackIn_94_2).append(44);
                        stackIn_97_0 = stackOut_94_0;
                        stackIn_97_1 = stackOut_94_1;
                        stackIn_95_0 = stackOut_94_0;
                        stackIn_95_1 = stackOut_94_1;
                        if (param2 == null) {
                            statePc = 97;
                        } else {
                            statePc = 95;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        stackOut_95_0 = (RuntimeException) (Object) stackIn_95_0;
                        stackOut_95_1 = (StringBuilder) (Object) stackIn_95_1;
                        stackOut_95_2 = "{...}";
                        stackIn_98_0 = stackOut_95_0;
                        stackIn_98_1 = stackOut_95_1;
                        stackIn_98_2 = stackOut_95_2;
                        statePc = 98;
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 96: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 97: {
                    stackOut_97_0 = (RuntimeException) (Object) stackIn_97_0;
                    stackOut_97_1 = (StringBuilder) (Object) stackIn_97_1;
                    stackOut_97_2 = "null";
                    stackIn_98_0 = stackOut_97_0;
                    stackIn_98_1 = stackOut_97_1;
                    stackIn_98_2 = stackOut_97_2;
                    statePc = 98;
                    continue stateLoop;
                }
                case 98: {
                    throw rta.a((Throwable) (Object) stackIn_98_0, stackIn_98_2 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
    }
}
